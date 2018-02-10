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
import com.tools20022.repository.msg.*;
import java.util.Arrays;

/**
 * For transactions settling in two legs (Securities Financing), the
 * opening/initiation and closing/return information of the transaction is
 * provided by sending the below combination of SecuritiesMovementType codes and
 * SecuritiesFinancingTransactionType codes:<br>
 * <br>
 * Repo Opening<br>
 * SecuritiesMovementType : Delivery (DELI)<br>
 * SecuritiesFinancingTransactionType : Repo (REPU)<br>
 * Repo Closing<br>
 * SecuritiesMovementType : Receive (RECE)<br>
 * SecuritiesFinancingTransactionType : Repo (REPU)<br>
 * <br>
 * Reverse Repo Opening<br>
 * SecuritiesMovementType : Receive (RECE)<br>
 * SecuritiesFinancingTransactionType : ReverseRepo (RVPO)<br>
 * Reverse Repo Closing<br>
 * SecuritiesMovementType : Delivery (DELI) <br>
 * SecuritiesFinancingTransactionType : ReverseRepo (RVPO)<br>
 * <br>
 * Securities Lending Initiation<br>
 * SecuritiesMovementType : Delivery (DELI)<br>
 * SecuritiesFinancingTransactionType : SecuritiesLending (SECL)<br>
 * Securities Lending Return<br>
 * SecuritiesMovementType : Receive (RECE)<br>
 * SecuritiesFinancingTransactionType : SecuritiesLending (SECL)<br>
 * <br>
 * Securities Borrowing Initiation<br>
 * SecuritiesMovementType : Receive (RECE)<br>
 * SecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)<br>
 * Securities Borrowing Return<br>
 * SecuritiesMovementType : Delivery (DELI) <br>
 * SecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)
 */
public class ConstraintTwoLegTransactionOpeningClosingRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters3
	 * TransactionTypeAndAdditionalParameters3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For transactions settling in two legs (Securities Financing), the opening/initiation and closing/return information of the transaction is provided by sending the below combination of SecuritiesMovementType codes and SecuritiesFinancingTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosingRule#forTransactionTypeAndAdditionalParameters10
	 * ConstraintTwoLegTransactionOpeningClosingRule.
	 * forTransactionTypeAndAdditionalParameters10}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionTypeAndAdditionalParameters3> forTransactionTypeAndAdditionalParameters3 = new MMConstraint<TransactionTypeAndAdditionalParameters3>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosingRule::checkTransactionTypeAndAdditionalParameters3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosingRule";
			definition = "For transactions settling in two legs (Securities Financing), the opening/initiation and closing/return information of the transaction is provided by sending the below combination of SecuritiesMovementType codes and SecuritiesFinancingTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosingRule.forTransactionTypeAndAdditionalParameters10);
			owner_lazy = () -> TransactionTypeAndAdditionalParameters3.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters6
	 * TransactionTypeAndAdditionalParameters6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For transactions settling in two legs (Securities Financing), the opening/initiation and closing/return information of the transaction is provided by sending the below combination of SecuritiesMovementType codes and SecuritiesFinancingTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionTypeAndAdditionalParameters6> forTransactionTypeAndAdditionalParameters6 = new MMConstraint<TransactionTypeAndAdditionalParameters6>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosingRule::checkTransactionTypeAndAdditionalParameters6;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosingRule";
			definition = "For transactions settling in two legs (Securities Financing), the opening/initiation and closing/return information of the transaction is provided by sending the below combination of SecuritiesMovementType codes and SecuritiesFinancingTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)";
			owner_lazy = () -> TransactionTypeAndAdditionalParameters6.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2
	 * SecuritiesFinancingTransactionDetails2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For transactions settling in two legs (Securities Financing), the opening/initiation and closing/return information of the transaction is provided by sending the below combination of SecuritiesMovementType codes and SecuritiesFinancingTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingTransactionDetails2> forSecuritiesFinancingTransactionDetails2 = new MMConstraint<SecuritiesFinancingTransactionDetails2>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosingRule::checkSecuritiesFinancingTransactionDetails2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosingRule";
			definition = "For transactions settling in two legs (Securities Financing), the opening/initiation and closing/return information of the transaction is provided by sending the below combination of SecuritiesMovementType codes and SecuritiesFinancingTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)";
			owner_lazy = () -> SecuritiesFinancingTransactionDetails2.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8
	 * SecuritiesFinancingTransactionDetails8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For transactions settling in two legs (Securities Financing), the opening/initiation and closing/return information of the transaction is provided by sending the below combination of SecuritiesMovementType codes and SecuritiesFinancingTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingTransactionDetails8> forSecuritiesFinancingTransactionDetails8 = new MMConstraint<SecuritiesFinancingTransactionDetails8>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosingRule::checkSecuritiesFinancingTransactionDetails8;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosingRule";
			definition = "For transactions settling in two legs (Securities Financing), the opening/initiation and closing/return information of the transaction is provided by sending the below combination of SecuritiesMovementType codes and SecuritiesFinancingTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)";
			owner_lazy = () -> SecuritiesFinancingTransactionDetails8.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6
	 * SecuritiesFinancingTransactionDetails6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For transactions settling in two legs (Securities Financing), the opening/initiation and closing/return information of the transaction is provided by sending the below combination of SecuritiesMovementType codes and SecuritiesFinancingTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingTransactionDetails6> forSecuritiesFinancingTransactionDetails6 = new MMConstraint<SecuritiesFinancingTransactionDetails6>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosingRule::checkSecuritiesFinancingTransactionDetails6;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosingRule";
			definition = "For transactions settling in two legs (Securities Financing), the opening/initiation and closing/return information of the transaction is provided by sending the below combination of SecuritiesMovementType codes and SecuritiesFinancingTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)";
			owner_lazy = () -> SecuritiesFinancingTransactionDetails6.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10
	 * SecuritiesFinancingTransactionDetails10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For transactions settling in two legs (Securities Financing), the opening/initiation and closing/return information of the transaction is provided by sending the below combination of SecuritiesMovementType codes and SecuritiesFinancingTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingTransactionDetails10> forSecuritiesFinancingTransactionDetails10 = new MMConstraint<SecuritiesFinancingTransactionDetails10>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosingRule::checkSecuritiesFinancingTransactionDetails10;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosingRule";
			definition = "For transactions settling in two legs (Securities Financing), the opening/initiation and closing/return information of the transaction is provided by sending the below combination of SecuritiesMovementType codes and SecuritiesFinancingTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)";
			owner_lazy = () -> SecuritiesFinancingTransactionDetails10.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17
	 * SecuritiesFinancingTransactionDetails17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For transactions settling in two legs (Securities Financing), the opening/initiation and closing/return information of the transaction is provided by sending the below combination of SecuritiesMovementType codes and SecuritiesFinancingTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosingRule#forSecuritiesFinancingTransactionDetails21
	 * ConstraintTwoLegTransactionOpeningClosingRule.
	 * forSecuritiesFinancingTransactionDetails21}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingTransactionDetails17> forSecuritiesFinancingTransactionDetails17 = new MMConstraint<SecuritiesFinancingTransactionDetails17>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosingRule::checkSecuritiesFinancingTransactionDetails17;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosingRule";
			definition = "For transactions settling in two legs (Securities Financing), the opening/initiation and closing/return information of the transaction is provided by sending the below combination of SecuritiesMovementType codes and SecuritiesFinancingTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosingRule.forSecuritiesFinancingTransactionDetails21);
			owner_lazy = () -> SecuritiesFinancingTransactionDetails17.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18
	 * SecuritiesFinancingTransactionDetails18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For transactions settling in two legs (Securities Financing), the opening/initiation and closing/return information of the transaction is provided by sending the below combination of SecuritiesMovementType codes and SecuritiesFinancingTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingTransactionDetails18> forSecuritiesFinancingTransactionDetails18 = new MMConstraint<SecuritiesFinancingTransactionDetails18>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosingRule::checkSecuritiesFinancingTransactionDetails18;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosingRule";
			definition = "For transactions settling in two legs (Securities Financing), the opening/initiation and closing/return information of the transaction is provided by sending the below combination of SecuritiesMovementType codes and SecuritiesFinancingTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)";
			owner_lazy = () -> SecuritiesFinancingTransactionDetails18.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21
	 * SecuritiesFinancingTransactionDetails21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For transactions settling in two legs (Securities Financing), the opening/initiation and closing/return information of the transaction is provided by sending the below combination of SecuritiesMovementType codes and SecuritiesFinancingTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosingRule#forSecuritiesFinancingTransactionDetails24
	 * ConstraintTwoLegTransactionOpeningClosingRule.
	 * forSecuritiesFinancingTransactionDetails24}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosingRule#forSecuritiesFinancingTransactionDetails17
	 * ConstraintTwoLegTransactionOpeningClosingRule.
	 * forSecuritiesFinancingTransactionDetails17}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingTransactionDetails21> forSecuritiesFinancingTransactionDetails21 = new MMConstraint<SecuritiesFinancingTransactionDetails21>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosingRule::checkSecuritiesFinancingTransactionDetails21;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosingRule";
			definition = "For transactions settling in two legs (Securities Financing), the opening/initiation and closing/return information of the transaction is provided by sending the below combination of SecuritiesMovementType codes and SecuritiesFinancingTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosingRule.forSecuritiesFinancingTransactionDetails24);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosingRule.forSecuritiesFinancingTransactionDetails17;
			owner_lazy = () -> SecuritiesFinancingTransactionDetails21.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22
	 * SecuritiesFinancingTransactionDetails22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For transactions settling in two legs (Securities Financing), the opening/initiation and closing/return information of the transaction is provided by sending the below combination of SecuritiesMovementType codes and SecuritiesFinancingTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingTransactionDetails22> forSecuritiesFinancingTransactionDetails22 = new MMConstraint<SecuritiesFinancingTransactionDetails22>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosingRule::checkSecuritiesFinancingTransactionDetails22;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosingRule";
			definition = "For transactions settling in two legs (Securities Financing), the opening/initiation and closing/return information of the transaction is provided by sending the below combination of SecuritiesMovementType codes and SecuritiesFinancingTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)";
			owner_lazy = () -> SecuritiesFinancingTransactionDetails22.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24
	 * SecuritiesFinancingTransactionDetails24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For transactions settling in two legs (Securities Financing), the opening/initiation and closing/return information of the transaction is provided by sending the below combination of SecuritiesMovementType codes and SecuritiesFinancingTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosingRule#forSecuritiesFinancingTransactionDetails26
	 * ConstraintTwoLegTransactionOpeningClosingRule.
	 * forSecuritiesFinancingTransactionDetails26}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosingRule#forSecuritiesFinancingTransactionDetails21
	 * ConstraintTwoLegTransactionOpeningClosingRule.
	 * forSecuritiesFinancingTransactionDetails21}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingTransactionDetails24> forSecuritiesFinancingTransactionDetails24 = new MMConstraint<SecuritiesFinancingTransactionDetails24>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosingRule::checkSecuritiesFinancingTransactionDetails24;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosingRule";
			definition = "For transactions settling in two legs (Securities Financing), the opening/initiation and closing/return information of the transaction is provided by sending the below combination of SecuritiesMovementType codes and SecuritiesFinancingTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosingRule.forSecuritiesFinancingTransactionDetails26);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosingRule.forSecuritiesFinancingTransactionDetails21;
			owner_lazy = () -> SecuritiesFinancingTransactionDetails24.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25
	 * SecuritiesFinancingTransactionDetails25}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For transactions settling in two legs (Securities Financing), the opening/initiation and closing/return information of the transaction is provided by sending the below combination of SecuritiesMovementType codes and SecuritiesFinancingTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingTransactionDetails25> forSecuritiesFinancingTransactionDetails25 = new MMConstraint<SecuritiesFinancingTransactionDetails25>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosingRule::checkSecuritiesFinancingTransactionDetails25;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosingRule";
			definition = "For transactions settling in two legs (Securities Financing), the opening/initiation and closing/return information of the transaction is provided by sending the below combination of SecuritiesMovementType codes and SecuritiesFinancingTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)";
			owner_lazy = () -> SecuritiesFinancingTransactionDetails25.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26
	 * SecuritiesFinancingTransactionDetails26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For transactions settling in two legs (Securities Financing), the opening/initiation and closing/return information of the transaction is provided by sending the below combination of SecuritiesMovementType codes and SecuritiesFinancingTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosingRule#forSecuritiesFinancingTransactionDetails35
	 * ConstraintTwoLegTransactionOpeningClosingRule.
	 * forSecuritiesFinancingTransactionDetails35}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosingRule#forSecuritiesFinancingTransactionDetails24
	 * ConstraintTwoLegTransactionOpeningClosingRule.
	 * forSecuritiesFinancingTransactionDetails24}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingTransactionDetails26> forSecuritiesFinancingTransactionDetails26 = new MMConstraint<SecuritiesFinancingTransactionDetails26>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosingRule::checkSecuritiesFinancingTransactionDetails26;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosingRule";
			definition = "For transactions settling in two legs (Securities Financing), the opening/initiation and closing/return information of the transaction is provided by sending the below combination of SecuritiesMovementType codes and SecuritiesFinancingTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosingRule.forSecuritiesFinancingTransactionDetails35);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosingRule.forSecuritiesFinancingTransactionDetails24;
			owner_lazy = () -> SecuritiesFinancingTransactionDetails26.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters10
	 * TransactionTypeAndAdditionalParameters10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For transactions settling in two legs (Securities Financing), the opening/initiation and closing/return information of the transaction is provided by sending the below combination of SecuritiesMovementType codes and SecuritiesFinancingTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosingRule#forTransactionTypeAndAdditionalParameters16
	 * ConstraintTwoLegTransactionOpeningClosingRule.
	 * forTransactionTypeAndAdditionalParameters16}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosingRule#forTransactionTypeAndAdditionalParameters3
	 * ConstraintTwoLegTransactionOpeningClosingRule.
	 * forTransactionTypeAndAdditionalParameters3}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionTypeAndAdditionalParameters10> forTransactionTypeAndAdditionalParameters10 = new MMConstraint<TransactionTypeAndAdditionalParameters10>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosingRule::checkTransactionTypeAndAdditionalParameters10;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosingRule";
			definition = "For transactions settling in two legs (Securities Financing), the opening/initiation and closing/return information of the transaction is provided by sending the below combination of SecuritiesMovementType codes and SecuritiesFinancingTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosingRule.forTransactionTypeAndAdditionalParameters16);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosingRule.forTransactionTypeAndAdditionalParameters3;
			owner_lazy = () -> TransactionTypeAndAdditionalParameters10.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33
	 * SecuritiesFinancingTransactionDetails33}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For transactions settling in two legs (Securities Financing), the opening/initiation and closing/return information of the transaction is provided by sending the below combination of SecuritiesMovementType codes and SecuritiesFinancingTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingTransactionDetails33> forSecuritiesFinancingTransactionDetails33 = new MMConstraint<SecuritiesFinancingTransactionDetails33>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosingRule::checkSecuritiesFinancingTransactionDetails33;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosingRule";
			definition = "For transactions settling in two legs (Securities Financing), the opening/initiation and closing/return information of the transaction is provided by sending the below combination of SecuritiesMovementType codes and SecuritiesFinancingTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)";
			owner_lazy = () -> SecuritiesFinancingTransactionDetails33.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters12
	 * TransactionTypeAndAdditionalParameters12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For transactions settling in two legs (Securities Financing), the opening/initiation and closing/return information of the transaction is provided by sending the below combination of SecuritiesMovementType codes and SecuritiesFinancingTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionTypeAndAdditionalParameters12> forTransactionTypeAndAdditionalParameters12 = new MMConstraint<TransactionTypeAndAdditionalParameters12>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosingRule::checkTransactionTypeAndAdditionalParameters12;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosingRule";
			definition = "For transactions settling in two legs (Securities Financing), the opening/initiation and closing/return information of the transaction is provided by sending the below combination of SecuritiesMovementType codes and SecuritiesFinancingTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)";
			owner_lazy = () -> TransactionTypeAndAdditionalParameters12.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters16
	 * TransactionTypeAndAdditionalParameters16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For transactions settling in two legs (Securities Financing), the opening/initiation and closing/return information of the transaction is provided by sending the below combination of SecuritiesMovementType codes and SecuritiesFinancingTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosingRule#forTransactionTypeAndAdditionalParameters10
	 * ConstraintTwoLegTransactionOpeningClosingRule.
	 * forTransactionTypeAndAdditionalParameters10}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionTypeAndAdditionalParameters16> forTransactionTypeAndAdditionalParameters16 = new MMConstraint<TransactionTypeAndAdditionalParameters16>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosingRule::checkTransactionTypeAndAdditionalParameters16;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosingRule";
			definition = "For transactions settling in two legs (Securities Financing), the opening/initiation and closing/return information of the transaction is provided by sending the below combination of SecuritiesMovementType codes and SecuritiesFinancingTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosingRule.forTransactionTypeAndAdditionalParameters10;
			owner_lazy = () -> TransactionTypeAndAdditionalParameters16.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35
	 * SecuritiesFinancingTransactionDetails35}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For transactions settling in two legs (Securities Financing), the opening/initiation and closing/return information of the transaction is provided by sending the below combination of SecuritiesMovementType codes and SecuritiesFinancingTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosingRule#forSecuritiesFinancingTransactionDetails26
	 * ConstraintTwoLegTransactionOpeningClosingRule.
	 * forSecuritiesFinancingTransactionDetails26}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingTransactionDetails35> forSecuritiesFinancingTransactionDetails35 = new MMConstraint<SecuritiesFinancingTransactionDetails35>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosingRule::checkSecuritiesFinancingTransactionDetails35;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosingRule";
			definition = "For transactions settling in two legs (Securities Financing), the opening/initiation and closing/return information of the transaction is provided by sending the below combination of SecuritiesMovementType codes and SecuritiesFinancingTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosingRule.forSecuritiesFinancingTransactionDetails26;
			owner_lazy = () -> SecuritiesFinancingTransactionDetails35.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters19
	 * TransactionTypeAndAdditionalParameters19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For transactions settling in two legs (Securities Financing), the opening/initiation and closing/return information of the transaction is provided by sending the below combination of SecuritiesMovementType codes and SecuritiesFinancingTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionTypeAndAdditionalParameters19> forTransactionTypeAndAdditionalParameters19 = new MMConstraint<TransactionTypeAndAdditionalParameters19>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosingRule::checkTransactionTypeAndAdditionalParameters19;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosingRule";
			definition = "For transactions settling in two legs (Securities Financing), the opening/initiation and closing/return information of the transaction is provided by sending the below combination of SecuritiesMovementType codes and SecuritiesFinancingTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)";
			owner_lazy = () -> TransactionTypeAndAdditionalParameters19.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36
	 * SecuritiesFinancingTransactionDetails36}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For transactions settling in two legs (Securities Financing), the opening/initiation and closing/return information of the transaction is provided by sending the below combination of SecuritiesMovementType codes and SecuritiesFinancingTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingTransactionDetails36> forSecuritiesFinancingTransactionDetails36 = new MMConstraint<SecuritiesFinancingTransactionDetails36>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosingRule::checkSecuritiesFinancingTransactionDetails36;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosingRule";
			definition = "For transactions settling in two legs (Securities Financing), the opening/initiation and closing/return information of the transaction is provided by sending the below combination of SecuritiesMovementType codes and SecuritiesFinancingTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : ReverseRepo (RVPO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)";
			owner_lazy = () -> SecuritiesFinancingTransactionDetails36.mmObject();
		}
	};

	/**
	 * For transactions settling in two legs (Securities Financing), the
	 * opening/initiation and closing/return information of the transaction is
	 * provided by sending the below combination of SecuritiesMovementType codes
	 * and SecuritiesFinancingTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SecuritiesFinancingTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SecuritiesFinancingTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SecuritiesFinancingTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)
	 */
	public static void checkTransactionTypeAndAdditionalParameters3(TransactionTypeAndAdditionalParameters3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For transactions settling in two legs (Securities Financing), the
	 * opening/initiation and closing/return information of the transaction is
	 * provided by sending the below combination of SecuritiesMovementType codes
	 * and SecuritiesFinancingTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SecuritiesFinancingTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SecuritiesFinancingTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SecuritiesFinancingTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)
	 */
	public static void checkTransactionTypeAndAdditionalParameters6(TransactionTypeAndAdditionalParameters6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For transactions settling in two legs (Securities Financing), the
	 * opening/initiation and closing/return information of the transaction is
	 * provided by sending the below combination of SecuritiesMovementType codes
	 * and SecuritiesFinancingTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SecuritiesFinancingTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SecuritiesFinancingTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SecuritiesFinancingTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)
	 */
	public static void checkSecuritiesFinancingTransactionDetails2(SecuritiesFinancingTransactionDetails2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For transactions settling in two legs (Securities Financing), the
	 * opening/initiation and closing/return information of the transaction is
	 * provided by sending the below combination of SecuritiesMovementType codes
	 * and SecuritiesFinancingTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SecuritiesFinancingTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SecuritiesFinancingTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SecuritiesFinancingTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)
	 */
	public static void checkSecuritiesFinancingTransactionDetails8(SecuritiesFinancingTransactionDetails8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For transactions settling in two legs (Securities Financing), the
	 * opening/initiation and closing/return information of the transaction is
	 * provided by sending the below combination of SecuritiesMovementType codes
	 * and SecuritiesFinancingTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SecuritiesFinancingTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SecuritiesFinancingTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SecuritiesFinancingTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)
	 */
	public static void checkSecuritiesFinancingTransactionDetails6(SecuritiesFinancingTransactionDetails6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For transactions settling in two legs (Securities Financing), the
	 * opening/initiation and closing/return information of the transaction is
	 * provided by sending the below combination of SecuritiesMovementType codes
	 * and SecuritiesFinancingTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SecuritiesFinancingTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SecuritiesFinancingTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SecuritiesFinancingTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)
	 */
	public static void checkSecuritiesFinancingTransactionDetails10(SecuritiesFinancingTransactionDetails10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For transactions settling in two legs (Securities Financing), the
	 * opening/initiation and closing/return information of the transaction is
	 * provided by sending the below combination of SecuritiesMovementType codes
	 * and SecuritiesFinancingTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SecuritiesFinancingTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SecuritiesFinancingTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SecuritiesFinancingTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)
	 */
	public static void checkSecuritiesFinancingTransactionDetails17(SecuritiesFinancingTransactionDetails17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For transactions settling in two legs (Securities Financing), the
	 * opening/initiation and closing/return information of the transaction is
	 * provided by sending the below combination of SecuritiesMovementType codes
	 * and SecuritiesFinancingTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SecuritiesFinancingTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SecuritiesFinancingTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SecuritiesFinancingTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)
	 */
	public static void checkSecuritiesFinancingTransactionDetails18(SecuritiesFinancingTransactionDetails18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For transactions settling in two legs (Securities Financing), the
	 * opening/initiation and closing/return information of the transaction is
	 * provided by sending the below combination of SecuritiesMovementType codes
	 * and SecuritiesFinancingTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SecuritiesFinancingTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SecuritiesFinancingTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SecuritiesFinancingTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)
	 */
	public static void checkSecuritiesFinancingTransactionDetails21(SecuritiesFinancingTransactionDetails21 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For transactions settling in two legs (Securities Financing), the
	 * opening/initiation and closing/return information of the transaction is
	 * provided by sending the below combination of SecuritiesMovementType codes
	 * and SecuritiesFinancingTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SecuritiesFinancingTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SecuritiesFinancingTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SecuritiesFinancingTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)
	 */
	public static void checkSecuritiesFinancingTransactionDetails22(SecuritiesFinancingTransactionDetails22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For transactions settling in two legs (Securities Financing), the
	 * opening/initiation and closing/return information of the transaction is
	 * provided by sending the below combination of SecuritiesMovementType codes
	 * and SecuritiesFinancingTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SecuritiesFinancingTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SecuritiesFinancingTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SecuritiesFinancingTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)
	 */
	public static void checkSecuritiesFinancingTransactionDetails24(SecuritiesFinancingTransactionDetails24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For transactions settling in two legs (Securities Financing), the
	 * opening/initiation and closing/return information of the transaction is
	 * provided by sending the below combination of SecuritiesMovementType codes
	 * and SecuritiesFinancingTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SecuritiesFinancingTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SecuritiesFinancingTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SecuritiesFinancingTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)
	 */
	public static void checkSecuritiesFinancingTransactionDetails25(SecuritiesFinancingTransactionDetails25 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For transactions settling in two legs (Securities Financing), the
	 * opening/initiation and closing/return information of the transaction is
	 * provided by sending the below combination of SecuritiesMovementType codes
	 * and SecuritiesFinancingTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SecuritiesFinancingTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SecuritiesFinancingTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SecuritiesFinancingTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)
	 */
	public static void checkSecuritiesFinancingTransactionDetails26(SecuritiesFinancingTransactionDetails26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For transactions settling in two legs (Securities Financing), the
	 * opening/initiation and closing/return information of the transaction is
	 * provided by sending the below combination of SecuritiesMovementType codes
	 * and SecuritiesFinancingTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SecuritiesFinancingTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SecuritiesFinancingTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SecuritiesFinancingTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)
	 */
	public static void checkTransactionTypeAndAdditionalParameters10(TransactionTypeAndAdditionalParameters10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For transactions settling in two legs (Securities Financing), the
	 * opening/initiation and closing/return information of the transaction is
	 * provided by sending the below combination of SecuritiesMovementType codes
	 * and SecuritiesFinancingTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SecuritiesFinancingTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SecuritiesFinancingTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SecuritiesFinancingTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)
	 */
	public static void checkSecuritiesFinancingTransactionDetails33(SecuritiesFinancingTransactionDetails33 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For transactions settling in two legs (Securities Financing), the
	 * opening/initiation and closing/return information of the transaction is
	 * provided by sending the below combination of SecuritiesMovementType codes
	 * and SecuritiesFinancingTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SecuritiesFinancingTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SecuritiesFinancingTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SecuritiesFinancingTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)
	 */
	public static void checkTransactionTypeAndAdditionalParameters12(TransactionTypeAndAdditionalParameters12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For transactions settling in two legs (Securities Financing), the
	 * opening/initiation and closing/return information of the transaction is
	 * provided by sending the below combination of SecuritiesMovementType codes
	 * and SecuritiesFinancingTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SecuritiesFinancingTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SecuritiesFinancingTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SecuritiesFinancingTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)
	 */
	public static void checkTransactionTypeAndAdditionalParameters16(TransactionTypeAndAdditionalParameters16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For transactions settling in two legs (Securities Financing), the
	 * opening/initiation and closing/return information of the transaction is
	 * provided by sending the below combination of SecuritiesMovementType codes
	 * and SecuritiesFinancingTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SecuritiesFinancingTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SecuritiesFinancingTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SecuritiesFinancingTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)
	 */
	public static void checkSecuritiesFinancingTransactionDetails35(SecuritiesFinancingTransactionDetails35 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For transactions settling in two legs (Securities Financing), the
	 * opening/initiation and closing/return information of the transaction is
	 * provided by sending the below combination of SecuritiesMovementType codes
	 * and SecuritiesFinancingTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SecuritiesFinancingTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SecuritiesFinancingTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SecuritiesFinancingTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)
	 */
	public static void checkTransactionTypeAndAdditionalParameters19(TransactionTypeAndAdditionalParameters19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For transactions settling in two legs (Securities Financing), the
	 * opening/initiation and closing/return information of the transaction is
	 * provided by sending the below combination of SecuritiesMovementType codes
	 * and SecuritiesFinancingTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SecuritiesFinancingTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SecuritiesFinancingTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SecuritiesFinancingTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SecuritiesFinancingTransactionType : SecuritiesBorrowing (SECB)
	 */
	public static void checkSecuritiesFinancingTransactionDetails36(SecuritiesFinancingTransactionDetails36 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}