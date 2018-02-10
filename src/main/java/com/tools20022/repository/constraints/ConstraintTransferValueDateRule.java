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
 * If PaymentCommonInformation/TransferValueDate is present, then
 * TransactionReport/Transaction/Payment/TransferValueDate is not allowed. If
 * PaymentCommonInformation/TransferValueDate is not present, then
 * TransactionReport/Transaction/Payment/TransferValueDate is optional. .
 */
public class ConstraintTransferValueDateRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transactions2 Transactions2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferValueDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PaymentCommonInformation/TransferValueDate is present, then TransactionReport/Transaction/Payment/TransferValueDate is not allowed.\nIf PaymentCommonInformation/TransferValueDate is not present, then TransactionReport/Transaction/Payment/TransferValueDate is optional.\n."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Transactions2> forTransactions2 = new MMConstraint<Transactions2>() {
		{
			validator = ConstraintTransferValueDateRule::checkTransactions2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferValueDateRule";
			definition = "If PaymentCommonInformation/TransferValueDate is present, then TransactionReport/Transaction/Payment/TransferValueDate is not allowed.\nIf PaymentCommonInformation/TransferValueDate is not present, then TransactionReport/Transaction/Payment/TransferValueDate is optional.\n.";
			owner_lazy = () -> Transactions2.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transactions3 Transactions3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferValueDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PaymentCommonInformation/TransferValueDate is present, then TransactionReport/Transaction/Payment/TransferValueDate is not allowed.\nIf PaymentCommonInformation/TransferValueDate is not present, then TransactionReport/Transaction/Payment/TransferValueDate is optional."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Transactions3> forTransactions3 = new MMConstraint<Transactions3>() {
		{
			validator = ConstraintTransferValueDateRule::checkTransactions3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferValueDateRule";
			definition = "If PaymentCommonInformation/TransferValueDate is present, then TransactionReport/Transaction/Payment/TransferValueDate is not allowed.\nIf PaymentCommonInformation/TransferValueDate is not present, then TransactionReport/Transaction/Payment/TransferValueDate is optional.";
			owner_lazy = () -> Transactions3.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transactions4 Transactions4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferValueDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PaymentCommonInformation/TransferValueDate is present, then TransactionReport/Transaction/Payment/TransferValueDate is not allowed.\nIf PaymentCommonInformation/TransferValueDate is not present, then TransactionReport/Transaction/Payment/TransferValueDate is optional."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Transactions4> forTransactions4 = new MMConstraint<Transactions4>() {
		{
			validator = ConstraintTransferValueDateRule::checkTransactions4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferValueDateRule";
			definition = "If PaymentCommonInformation/TransferValueDate is present, then TransactionReport/Transaction/Payment/TransferValueDate is not allowed.\nIf PaymentCommonInformation/TransferValueDate is not present, then TransactionReport/Transaction/Payment/TransferValueDate is optional.";
			owner_lazy = () -> Transactions4.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transactions5 Transactions5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/TransactionReport[*]/TransactionOrError/Transaction/Payment/RequestedExecutionDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/PaymentCommonInformation/RequestedExecutionDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferValueDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PaymentCommonInformation/RequestedExecutionDate is present, then TransactionReport/Transaction/Payment/RequestedExecutionDate is not allowed.\r\nIf PaymentCommonInformation/RequestedExecutionDate is not present, then TransactionReport/Transaction/Payment/RequestedExecutionDate is optional.\r\n"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTransferValueDateRule#forTransactions6
	 * ConstraintTransferValueDateRule.forTransactions6}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Transactions5> forTransactions5 = new MMConstraint<Transactions5>() {
		{
			validator = ConstraintTransferValueDateRule::checkTransactions5;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferValueDateRule";
			definition = "If PaymentCommonInformation/RequestedExecutionDate is present, then TransactionReport/Transaction/Payment/RequestedExecutionDate is not allowed.\r\nIf PaymentCommonInformation/RequestedExecutionDate is not present, then TransactionReport/Transaction/Payment/RequestedExecutionDate is optional.\r\n";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTransferValueDateRule.forTransactions6);
			owner_lazy = () -> Transactions5.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/TransactionReport[*]/TransactionOrError/Transaction/Payment/RequestedExecutionDate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/PaymentCommonInformation/RequestedExecutionDate</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transactions6 Transactions6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/TransactionReport[*]/TransactionOrError/Transaction/Payment/RequestedExecutionDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/PaymentCommonInformation/RequestedExecutionDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferValueDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PaymentCommonInformation/RequestedExecutionDate is present, then TransactionReport/Transaction/Payment/RequestedExecutionDate is not allowed.\r\nIf PaymentCommonInformation/RequestedExecutionDate is not present, then TransactionReport/Transaction/Payment/RequestedExecutionDate is optional.\r\n"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTransferValueDateRule#forTransactions7
	 * ConstraintTransferValueDateRule.forTransactions7}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTransferValueDateRule#forTransactions5
	 * ConstraintTransferValueDateRule.forTransactions5}</li>
	 * </ul>
	 */
	public static final MMConstraint<Transactions6> forTransactions6 = new MMConstraint<Transactions6>() {
		{
			validator = ConstraintTransferValueDateRule::checkTransactions6;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferValueDateRule";
			definition = "If PaymentCommonInformation/RequestedExecutionDate is present, then TransactionReport/Transaction/Payment/RequestedExecutionDate is not allowed.\r\nIf PaymentCommonInformation/RequestedExecutionDate is not present, then TransactionReport/Transaction/Payment/RequestedExecutionDate is optional.\r\n";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTransferValueDateRule.forTransactions7);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTransferValueDateRule.forTransactions5;
			owner_lazy = () -> Transactions6.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/TransactionReport[*]/TransactionOrError/Transaction/Payment/RequestedExecutionDate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/PaymentCommonInformation/RequestedExecutionDate</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transactions7 Transactions7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/TransactionReport[*]/TransactionOrError/Transaction/Payment/RequestedExecutionDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/PaymentCommonInformation/RequestedExecutionDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferValueDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PaymentCommonInformation/RequestedExecutionDate is present, then TransactionReport/Transaction/Payment/RequestedExecutionDate is not allowed.\r\nIf PaymentCommonInformation/RequestedExecutionDate is not present, then TransactionReport/Transaction/Payment/RequestedExecutionDate is optional.\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTransferValueDateRule#forTransactions6
	 * ConstraintTransferValueDateRule.forTransactions6}</li>
	 * </ul>
	 */
	public static final MMConstraint<Transactions7> forTransactions7 = new MMConstraint<Transactions7>() {
		{
			validator = ConstraintTransferValueDateRule::checkTransactions7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferValueDateRule";
			definition = "If PaymentCommonInformation/RequestedExecutionDate is present, then TransactionReport/Transaction/Payment/RequestedExecutionDate is not allowed.\r\nIf PaymentCommonInformation/RequestedExecutionDate is not present, then TransactionReport/Transaction/Payment/RequestedExecutionDate is optional.\r\n";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTransferValueDateRule.forTransactions6;
			owner_lazy = () -> Transactions7.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/TransactionReport[*]/TransactionOrError/Transaction/Payment/RequestedExecutionDate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/PaymentCommonInformation/RequestedExecutionDate</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};

	/**
	 * If PaymentCommonInformation/TransferValueDate is present, then
	 * TransactionReport/Transaction/Payment/TransferValueDate is not allowed.
	 * If PaymentCommonInformation/TransferValueDate is not present, then
	 * TransactionReport/Transaction/Payment/TransferValueDate is optional. .
	 */
	public static void checkTransactions2(Transactions2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PaymentCommonInformation/TransferValueDate is present, then
	 * TransactionReport/Transaction/Payment/TransferValueDate is not allowed.
	 * If PaymentCommonInformation/TransferValueDate is not present, then
	 * TransactionReport/Transaction/Payment/TransferValueDate is optional.
	 */
	public static void checkTransactions3(Transactions3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PaymentCommonInformation/TransferValueDate is present, then
	 * TransactionReport/Transaction/Payment/TransferValueDate is not allowed.
	 * If PaymentCommonInformation/TransferValueDate is not present, then
	 * TransactionReport/Transaction/Payment/TransferValueDate is optional.
	 */
	public static void checkTransactions4(Transactions4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PaymentCommonInformation/RequestedExecutionDate is present, then
	 * TransactionReport/Transaction/Payment/RequestedExecutionDate is not
	 * allowed.<br>
	 * If PaymentCommonInformation/RequestedExecutionDate is not present, then
	 * TransactionReport/Transaction/Payment/RequestedExecutionDate is optional.<br>
	 */
	public static void checkTransactions5(Transactions5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PaymentCommonInformation/RequestedExecutionDate is present, then
	 * TransactionReport/Transaction/Payment/RequestedExecutionDate is not
	 * allowed.<br>
	 * If PaymentCommonInformation/RequestedExecutionDate is not present, then
	 * TransactionReport/Transaction/Payment/RequestedExecutionDate is optional.<br>
	 */
	public static void checkTransactions6(Transactions6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PaymentCommonInformation/RequestedExecutionDate is present, then
	 * TransactionReport/Transaction/Payment/RequestedExecutionDate is not
	 * allowed.<br>
	 * If PaymentCommonInformation/RequestedExecutionDate is not present, then
	 * TransactionReport/Transaction/Payment/RequestedExecutionDate is optional.<br>
	 */
	public static void checkTransactions7(Transactions7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}