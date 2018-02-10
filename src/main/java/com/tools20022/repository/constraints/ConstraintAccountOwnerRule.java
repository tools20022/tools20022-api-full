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
 * Either AccountOwner or Item/AccountOwner may be present but not both.
 */
public class ConstraintAccountOwnerRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification4
	 * AccountNotification4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/Item[*]/AccountOwner&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AccountOwner&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwnerRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either AccountOwner or Item/AccountOwner may be present but not both."</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountNotification4> forAccountNotification4 = new MMConstraint<AccountNotification4>() {
		{
			validator = ConstraintAccountOwnerRule::checkAccountNotification4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwnerRule";
			definition = "Either AccountOwner or Item/AccountOwner may be present but not both.";
			owner_lazy = () -> AccountNotification4.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/Item[*]/AccountOwner</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AccountOwner</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference1
	 * OriginalNotificationReference1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/OriginalItem[*]/OriginalItemReference/AccountOwner&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AccountOwner&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwnerRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either AccountOwner or OriginalItem/AccountOwner may be present but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OriginalNotificationReference1> forOriginalNotificationReference1 = new MMConstraint<OriginalNotificationReference1>() {
		{
			validator = ConstraintAccountOwnerRule::checkOriginalNotificationReference1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwnerRule";
			definition = "Either AccountOwner or OriginalItem/AccountOwner may be present but not both.";
			owner_lazy = () -> OriginalNotificationReference1.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/OriginalItem[*]/OriginalItemReference/AccountOwner</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AccountOwner</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference2
	 * OriginalNotificationReference2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/OriginalItemAndStatus[*]/OriginalItemReference/AccountOwner&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AccountOwner&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwnerRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either AccountOwner or OriginalItem/AccountOwner may be present but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OriginalNotificationReference2> forOriginalNotificationReference2 = new MMConstraint<OriginalNotificationReference2>() {
		{
			validator = ConstraintAccountOwnerRule::checkOriginalNotificationReference2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwnerRule";
			definition = "Either AccountOwner or OriginalItem/AccountOwner may be present but not both.";
			owner_lazy = () -> OriginalNotificationReference2.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/OriginalItemAndStatus[*]/OriginalItemReference/AccountOwner</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AccountOwner</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification6
	 * AccountNotification6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/Item[*]/AccountOwner&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AccountOwner&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwnerRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either AccountOwner or Item/AccountOwner may be present but not both."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountOwnerRule#forAccountNotification10
	 * ConstraintAccountOwnerRule.forAccountNotification10}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountNotification6> forAccountNotification6 = new MMConstraint<AccountNotification6>() {
		{
			validator = ConstraintAccountOwnerRule::checkAccountNotification6;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwnerRule";
			definition = "Either AccountOwner or Item/AccountOwner may be present but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAccountOwnerRule.forAccountNotification10);
			owner_lazy = () -> AccountNotification6.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/Item[*]/AccountOwner</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AccountOwner</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference4
	 * OriginalNotificationReference4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/OriginalItem[*]/OriginalItemReference/AccountOwner&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AccountOwner&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwnerRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either AccountOwner or OriginalItem/AccountOwner may be present but not both."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountOwnerRule#forOriginalNotificationReference6
	 * ConstraintAccountOwnerRule.forOriginalNotificationReference6}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OriginalNotificationReference4> forOriginalNotificationReference4 = new MMConstraint<OriginalNotificationReference4>() {
		{
			validator = ConstraintAccountOwnerRule::checkOriginalNotificationReference4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwnerRule";
			definition = "Either AccountOwner or OriginalItem/AccountOwner may be present but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAccountOwnerRule.forOriginalNotificationReference6);
			owner_lazy = () -> OriginalNotificationReference4.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/OriginalItem[*]/OriginalItemReference/AccountOwner</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AccountOwner</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference3
	 * OriginalNotificationReference3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/OriginalItemAndStatus[*]/OriginalItemReference/AccountOwner&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AccountOwner&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwnerRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either AccountOwner or OriginalItem/AccountOwner may be present but not both."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountOwnerRule#forOriginalNotificationReference5
	 * ConstraintAccountOwnerRule.forOriginalNotificationReference5}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OriginalNotificationReference3> forOriginalNotificationReference3 = new MMConstraint<OriginalNotificationReference3>() {
		{
			validator = ConstraintAccountOwnerRule::checkOriginalNotificationReference3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwnerRule";
			definition = "Either AccountOwner or OriginalItem/AccountOwner may be present but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAccountOwnerRule.forOriginalNotificationReference5);
			owner_lazy = () -> OriginalNotificationReference3.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/OriginalItemAndStatus[*]/OriginalItemReference/AccountOwner</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AccountOwner</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceCancellation1
	 * IntraBalanceCancellation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwnerRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "AccountOwner must be present or Cancellation(*)/AccountOwner must be present, but not both."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountOwnerRule#forIntraBalanceCancellation3
	 * ConstraintAccountOwnerRule.forIntraBalanceCancellation3}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraBalanceCancellation1> forIntraBalanceCancellation1 = new MMConstraint<IntraBalanceCancellation1>() {
		{
			validator = ConstraintAccountOwnerRule::checkIntraBalanceCancellation1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwnerRule";
			definition = "AccountOwner must be present or Cancellation(*)/AccountOwner must be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAccountOwnerRule.forIntraBalanceCancellation3);
			owner_lazy = () -> IntraBalanceCancellation1.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceMovements1
	 * IntraBalanceMovements1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwnerRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "AccountOwner must be present or Movement(*)/AccountOwner must be present, but not both."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountOwnerRule#forIntraBalanceMovements2
	 * ConstraintAccountOwnerRule.forIntraBalanceMovements2}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraBalanceMovements1> forIntraBalanceMovements1 = new MMConstraint<IntraBalanceMovements1>() {
		{
			validator = ConstraintAccountOwnerRule::checkIntraBalanceMovements1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwnerRule";
			definition = "AccountOwner must be present or Movement(*)/AccountOwner must be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAccountOwnerRule.forIntraBalanceMovements2);
			owner_lazy = () -> IntraBalanceMovements1.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovements1
	 * IntraPositionMovements1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwnerRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "AccountOwner must be present or Movement(*)/AccountOwner must be present, but not both."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountOwnerRule#forIntraPositionMovements2
	 * ConstraintAccountOwnerRule.forIntraPositionMovements2}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionMovements1> forIntraPositionMovements1 = new MMConstraint<IntraPositionMovements1>() {
		{
			validator = ConstraintAccountOwnerRule::checkIntraPositionMovements1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwnerRule";
			definition = "AccountOwner must be present or Movement(*)/AccountOwner must be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAccountOwnerRule.forIntraPositionMovements2);
			owner_lazy = () -> IntraPositionMovements1.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactions1
	 * SecuritiesSettlementTransactions1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwnerRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "AccountOwner must be present or Transaction(*)/AccountOwner must be present, but not both."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountOwnerRule#forSecuritiesSettlementTransactions2
	 * ConstraintAccountOwnerRule.forSecuritiesSettlementTransactions2}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactions1> forSecuritiesSettlementTransactions1 = new MMConstraint<SecuritiesSettlementTransactions1>() {
		{
			validator = ConstraintAccountOwnerRule::checkSecuritiesSettlementTransactions1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwnerRule";
			definition = "AccountOwner must be present or Transaction(*)/AccountOwner must be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAccountOwnerRule.forSecuritiesSettlementTransactions2);
			owner_lazy = () -> SecuritiesSettlementTransactions1.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceModification1
	 * IntraBalanceModification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwnerRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "AccountOwner must be present or Cancellation(*)/AccountOwner must be present, but not both."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountOwnerRule#forIntraBalanceModification3
	 * ConstraintAccountOwnerRule.forIntraBalanceModification3}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraBalanceModification1> forIntraBalanceModification1 = new MMConstraint<IntraBalanceModification1>() {
		{
			validator = ConstraintAccountOwnerRule::checkIntraBalanceModification1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwnerRule";
			definition = "AccountOwner must be present or Cancellation(*)/AccountOwner must be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAccountOwnerRule.forIntraBalanceModification3);
			owner_lazy = () -> IntraBalanceModification1.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionModification1
	 * IntraPositionModification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwnerRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "AccountOwner must be present or Modification(*)/AccountOwner must be present, but not both."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountOwnerRule#forIntraPositionModification3
	 * ConstraintAccountOwnerRule.forIntraPositionModification3}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionModification1> forIntraPositionModification1 = new MMConstraint<IntraPositionModification1>() {
		{
			validator = ConstraintAccountOwnerRule::checkIntraPositionModification1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwnerRule";
			definition = "AccountOwner must be present or Modification(*)/AccountOwner must be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAccountOwnerRule.forIntraPositionModification3);
			owner_lazy = () -> IntraPositionModification1.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionCancellation1
	 * IntraPositionCancellation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwnerRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "AccountOwner must be present or Cancellation(*)/AccountOwner must be present, but not both."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountOwnerRule#forIntraPositionCancellation3
	 * ConstraintAccountOwnerRule.forIntraPositionCancellation3}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionCancellation1> forIntraPositionCancellation1 = new MMConstraint<IntraPositionCancellation1>() {
		{
			validator = ConstraintAccountOwnerRule::checkIntraPositionCancellation1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwnerRule";
			definition = "AccountOwner must be present or Cancellation(*)/AccountOwner must be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAccountOwnerRule.forIntraPositionCancellation3);
			owner_lazy = () -> IntraPositionCancellation1.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification10
	 * AccountNotification10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/Item[*]/AccountOwner&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AccountOwner&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwnerRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either AccountOwner or Item/AccountOwner may be present but not both."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountOwnerRule#forAccountNotification13
	 * ConstraintAccountOwnerRule.forAccountNotification13}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountOwnerRule#forAccountNotification6
	 * ConstraintAccountOwnerRule.forAccountNotification6}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountNotification10> forAccountNotification10 = new MMConstraint<AccountNotification10>() {
		{
			validator = ConstraintAccountOwnerRule::checkAccountNotification10;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwnerRule";
			definition = "Either AccountOwner or Item/AccountOwner may be present but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAccountOwnerRule.forAccountNotification13);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAccountOwnerRule.forAccountNotification6;
			owner_lazy = () -> AccountNotification10.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/Item[*]/AccountOwner</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AccountOwner</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference6
	 * OriginalNotificationReference6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/OriginalItem[*]/OriginalItemReference/AccountOwner&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AccountOwner&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwnerRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either AccountOwner or OriginalItem/AccountOwner may be present but not both."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountOwnerRule#forOriginalNotificationReference8
	 * ConstraintAccountOwnerRule.forOriginalNotificationReference8}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountOwnerRule#forOriginalNotificationReference4
	 * ConstraintAccountOwnerRule.forOriginalNotificationReference4}</li>
	 * </ul>
	 */
	public static final MMConstraint<OriginalNotificationReference6> forOriginalNotificationReference6 = new MMConstraint<OriginalNotificationReference6>() {
		{
			validator = ConstraintAccountOwnerRule::checkOriginalNotificationReference6;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwnerRule";
			definition = "Either AccountOwner or OriginalItem/AccountOwner may be present but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAccountOwnerRule.forOriginalNotificationReference8);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAccountOwnerRule.forOriginalNotificationReference4;
			owner_lazy = () -> OriginalNotificationReference6.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/OriginalItem[*]/OriginalItemReference/AccountOwner</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AccountOwner</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference5
	 * OriginalNotificationReference5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/OriginalItemAndStatus[*]/OriginalItemReference/AccountOwner&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AccountOwner&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwnerRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either AccountOwner or OriginalItem/AccountOwner may be present but not both."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountOwnerRule#forOriginalNotificationReference7
	 * ConstraintAccountOwnerRule.forOriginalNotificationReference7}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountOwnerRule#forOriginalNotificationReference3
	 * ConstraintAccountOwnerRule.forOriginalNotificationReference3}</li>
	 * </ul>
	 */
	public static final MMConstraint<OriginalNotificationReference5> forOriginalNotificationReference5 = new MMConstraint<OriginalNotificationReference5>() {
		{
			validator = ConstraintAccountOwnerRule::checkOriginalNotificationReference5;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwnerRule";
			definition = "Either AccountOwner or OriginalItem/AccountOwner may be present but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAccountOwnerRule.forOriginalNotificationReference7);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAccountOwnerRule.forOriginalNotificationReference3;
			owner_lazy = () -> OriginalNotificationReference5.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/OriginalItemAndStatus[*]/OriginalItemReference/AccountOwner</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AccountOwner</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification13
	 * AccountNotification13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/Item[*]/AccountOwner&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AccountOwner&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwnerRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either AccountOwner or Item/AccountOwner may be present but not both."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountOwnerRule#forAccountNotification10
	 * ConstraintAccountOwnerRule.forAccountNotification10}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountNotification13> forAccountNotification13 = new MMConstraint<AccountNotification13>() {
		{
			validator = ConstraintAccountOwnerRule::checkAccountNotification13;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwnerRule";
			definition = "Either AccountOwner or Item/AccountOwner may be present but not both.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAccountOwnerRule.forAccountNotification10;
			owner_lazy = () -> AccountNotification13.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/Item[*]/AccountOwner</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AccountOwner</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference8
	 * OriginalNotificationReference8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/OriginalItem[*]/OriginalItemReference/AccountOwner&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AccountOwner&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwnerRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either AccountOwner or OriginalItem/AccountOwner may be present but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountOwnerRule#forOriginalNotificationReference6
	 * ConstraintAccountOwnerRule.forOriginalNotificationReference6}</li>
	 * </ul>
	 */
	public static final MMConstraint<OriginalNotificationReference8> forOriginalNotificationReference8 = new MMConstraint<OriginalNotificationReference8>() {
		{
			validator = ConstraintAccountOwnerRule::checkOriginalNotificationReference8;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwnerRule";
			definition = "Either AccountOwner or OriginalItem/AccountOwner may be present but not both.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAccountOwnerRule.forOriginalNotificationReference6;
			owner_lazy = () -> OriginalNotificationReference8.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/OriginalItem[*]/OriginalItemReference/AccountOwner</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AccountOwner</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference7
	 * OriginalNotificationReference7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/OriginalItemAndStatus[*]/OriginalItemReference/AccountOwner&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AccountOwner&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwnerRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either AccountOwner or OriginalItem/AccountOwner may be present but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountOwnerRule#forOriginalNotificationReference5
	 * ConstraintAccountOwnerRule.forOriginalNotificationReference5}</li>
	 * </ul>
	 */
	public static final MMConstraint<OriginalNotificationReference7> forOriginalNotificationReference7 = new MMConstraint<OriginalNotificationReference7>() {
		{
			validator = ConstraintAccountOwnerRule::checkOriginalNotificationReference7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwnerRule";
			definition = "Either AccountOwner or OriginalItem/AccountOwner may be present but not both.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAccountOwnerRule.forOriginalNotificationReference5;
			owner_lazy = () -> OriginalNotificationReference7.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/OriginalItemAndStatus[*]/OriginalItemReference/AccountOwner</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AccountOwner</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionModification3
	 * IntraPositionModification3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwnerRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "AccountOwner must be present or Modification(*)/AccountOwner must be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountOwnerRule#forIntraPositionModification1
	 * ConstraintAccountOwnerRule.forIntraPositionModification1}</li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionModification3> forIntraPositionModification3 = new MMConstraint<IntraPositionModification3>() {
		{
			validator = ConstraintAccountOwnerRule::checkIntraPositionModification3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwnerRule";
			definition = "AccountOwner must be present or Modification(*)/AccountOwner must be present, but not both.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAccountOwnerRule.forIntraPositionModification1;
			owner_lazy = () -> IntraPositionModification3.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovements2
	 * IntraPositionMovements2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwnerRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "AccountOwner must be present or Movement(*)/AccountOwner must be present, but not both."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountOwnerRule#forIntraPositionMovements3
	 * ConstraintAccountOwnerRule.forIntraPositionMovements3}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountOwnerRule#forIntraPositionMovements1
	 * ConstraintAccountOwnerRule.forIntraPositionMovements1}</li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionMovements2> forIntraPositionMovements2 = new MMConstraint<IntraPositionMovements2>() {
		{
			validator = ConstraintAccountOwnerRule::checkIntraPositionMovements2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwnerRule";
			definition = "AccountOwner must be present or Movement(*)/AccountOwner must be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAccountOwnerRule.forIntraPositionMovements3);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAccountOwnerRule.forIntraPositionMovements1;
			owner_lazy = () -> IntraPositionMovements2.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactions2
	 * SecuritiesSettlementTransactions2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwnerRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "AccountOwner must be present or Transaction(*)/AccountOwner must be present, but not both."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountOwnerRule#forSecuritiesSettlementTransactions3
	 * ConstraintAccountOwnerRule.forSecuritiesSettlementTransactions3}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountOwnerRule#forSecuritiesSettlementTransactions1
	 * ConstraintAccountOwnerRule.forSecuritiesSettlementTransactions1}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactions2> forSecuritiesSettlementTransactions2 = new MMConstraint<SecuritiesSettlementTransactions2>() {
		{
			validator = ConstraintAccountOwnerRule::checkSecuritiesSettlementTransactions2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwnerRule";
			definition = "AccountOwner must be present or Transaction(*)/AccountOwner must be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAccountOwnerRule.forSecuritiesSettlementTransactions3);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAccountOwnerRule.forSecuritiesSettlementTransactions1;
			owner_lazy = () -> SecuritiesSettlementTransactions2.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionCancellation3
	 * IntraPositionCancellation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwnerRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "AccountOwner must be present or Cancellation(*)/AccountOwner must be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountOwnerRule#forIntraPositionCancellation1
	 * ConstraintAccountOwnerRule.forIntraPositionCancellation1}</li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionCancellation3> forIntraPositionCancellation3 = new MMConstraint<IntraPositionCancellation3>() {
		{
			validator = ConstraintAccountOwnerRule::checkIntraPositionCancellation3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwnerRule";
			definition = "AccountOwner must be present or Cancellation(*)/AccountOwner must be present, but not both.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAccountOwnerRule.forIntraPositionCancellation1;
			owner_lazy = () -> IntraPositionCancellation3.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceCancellation3
	 * IntraBalanceCancellation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwnerRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "AccountOwner must be present or Cancellation(*)/AccountOwner must be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountOwnerRule#forIntraBalanceCancellation1
	 * ConstraintAccountOwnerRule.forIntraBalanceCancellation1}</li>
	 * </ul>
	 */
	public static final MMConstraint<IntraBalanceCancellation3> forIntraBalanceCancellation3 = new MMConstraint<IntraBalanceCancellation3>() {
		{
			validator = ConstraintAccountOwnerRule::checkIntraBalanceCancellation3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwnerRule";
			definition = "AccountOwner must be present or Cancellation(*)/AccountOwner must be present, but not both.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAccountOwnerRule.forIntraBalanceCancellation1;
			owner_lazy = () -> IntraBalanceCancellation3.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceMovements2
	 * IntraBalanceMovements2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwnerRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "AccountOwner must be present or Movement(*)/AccountOwner must be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountOwnerRule#forIntraBalanceMovements1
	 * ConstraintAccountOwnerRule.forIntraBalanceMovements1}</li>
	 * </ul>
	 */
	public static final MMConstraint<IntraBalanceMovements2> forIntraBalanceMovements2 = new MMConstraint<IntraBalanceMovements2>() {
		{
			validator = ConstraintAccountOwnerRule::checkIntraBalanceMovements2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwnerRule";
			definition = "AccountOwner must be present or Movement(*)/AccountOwner must be present, but not both.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAccountOwnerRule.forIntraBalanceMovements1;
			owner_lazy = () -> IntraBalanceMovements2.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceModification3
	 * IntraBalanceModification3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwnerRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "AccountOwner must be present or Cancellation(*)/AccountOwner must be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountOwnerRule#forIntraBalanceModification1
	 * ConstraintAccountOwnerRule.forIntraBalanceModification1}</li>
	 * </ul>
	 */
	public static final MMConstraint<IntraBalanceModification3> forIntraBalanceModification3 = new MMConstraint<IntraBalanceModification3>() {
		{
			validator = ConstraintAccountOwnerRule::checkIntraBalanceModification3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwnerRule";
			definition = "AccountOwner must be present or Cancellation(*)/AccountOwner must be present, but not both.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAccountOwnerRule.forIntraBalanceModification1;
			owner_lazy = () -> IntraBalanceModification3.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovements3
	 * IntraPositionMovements3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwnerRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "AccountOwner must be present or Movement(*)/AccountOwner must be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountOwnerRule#forIntraPositionMovements2
	 * ConstraintAccountOwnerRule.forIntraPositionMovements2}</li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionMovements3> forIntraPositionMovements3 = new MMConstraint<IntraPositionMovements3>() {
		{
			validator = ConstraintAccountOwnerRule::checkIntraPositionMovements3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwnerRule";
			definition = "AccountOwner must be present or Movement(*)/AccountOwner must be present, but not both.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAccountOwnerRule.forIntraPositionMovements2;
			owner_lazy = () -> IntraPositionMovements3.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactions3
	 * SecuritiesSettlementTransactions3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwnerRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "AccountOwner must be present or Transaction(*)/AccountOwner must be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountOwnerRule#forSecuritiesSettlementTransactions2
	 * ConstraintAccountOwnerRule.forSecuritiesSettlementTransactions2}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactions3> forSecuritiesSettlementTransactions3 = new MMConstraint<SecuritiesSettlementTransactions3>() {
		{
			validator = ConstraintAccountOwnerRule::checkSecuritiesSettlementTransactions3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwnerRule";
			definition = "AccountOwner must be present or Transaction(*)/AccountOwner must be present, but not both.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAccountOwnerRule.forSecuritiesSettlementTransactions2;
			owner_lazy = () -> SecuritiesSettlementTransactions3.mmObject();
		}
	};

	/**
	 * Either AccountOwner or Item/AccountOwner may be present but not both.
	 */
	public static void checkAccountNotification4(AccountNotification4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either AccountOwner or OriginalItem/AccountOwner may be present but not
	 * both.
	 */
	public static void checkOriginalNotificationReference1(OriginalNotificationReference1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either AccountOwner or OriginalItem/AccountOwner may be present but not
	 * both.
	 */
	public static void checkOriginalNotificationReference2(OriginalNotificationReference2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either AccountOwner or Item/AccountOwner may be present but not both.
	 */
	public static void checkAccountNotification6(AccountNotification6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either AccountOwner or OriginalItem/AccountOwner may be present but not
	 * both.
	 */
	public static void checkOriginalNotificationReference4(OriginalNotificationReference4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either AccountOwner or OriginalItem/AccountOwner may be present but not
	 * both.
	 */
	public static void checkOriginalNotificationReference3(OriginalNotificationReference3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * AccountOwner must be present or Cancellation(*)/AccountOwner must be
	 * present, but not both.
	 */
	public static void checkIntraBalanceCancellation1(IntraBalanceCancellation1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * AccountOwner must be present or Movement(*)/AccountOwner must be present,
	 * but not both.
	 */
	public static void checkIntraBalanceMovements1(IntraBalanceMovements1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * AccountOwner must be present or Movement(*)/AccountOwner must be present,
	 * but not both.
	 */
	public static void checkIntraPositionMovements1(IntraPositionMovements1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * AccountOwner must be present or Transaction(*)/AccountOwner must be
	 * present, but not both.
	 */
	public static void checkSecuritiesSettlementTransactions1(SecuritiesSettlementTransactions1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * AccountOwner must be present or Cancellation(*)/AccountOwner must be
	 * present, but not both.
	 */
	public static void checkIntraBalanceModification1(IntraBalanceModification1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * AccountOwner must be present or Modification(*)/AccountOwner must be
	 * present, but not both.
	 */
	public static void checkIntraPositionModification1(IntraPositionModification1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * AccountOwner must be present or Cancellation(*)/AccountOwner must be
	 * present, but not both.
	 */
	public static void checkIntraPositionCancellation1(IntraPositionCancellation1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either AccountOwner or Item/AccountOwner may be present but not both.
	 */
	public static void checkAccountNotification10(AccountNotification10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either AccountOwner or OriginalItem/AccountOwner may be present but not
	 * both.
	 */
	public static void checkOriginalNotificationReference6(OriginalNotificationReference6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either AccountOwner or OriginalItem/AccountOwner may be present but not
	 * both.
	 */
	public static void checkOriginalNotificationReference5(OriginalNotificationReference5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either AccountOwner or Item/AccountOwner may be present but not both.
	 */
	public static void checkAccountNotification13(AccountNotification13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either AccountOwner or OriginalItem/AccountOwner may be present but not
	 * both.
	 */
	public static void checkOriginalNotificationReference8(OriginalNotificationReference8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either AccountOwner or OriginalItem/AccountOwner may be present but not
	 * both.
	 */
	public static void checkOriginalNotificationReference7(OriginalNotificationReference7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * AccountOwner must be present or Modification(*)/AccountOwner must be
	 * present, but not both.
	 */
	public static void checkIntraPositionModification3(IntraPositionModification3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * AccountOwner must be present or Movement(*)/AccountOwner must be present,
	 * but not both.
	 */
	public static void checkIntraPositionMovements2(IntraPositionMovements2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * AccountOwner must be present or Transaction(*)/AccountOwner must be
	 * present, but not both.
	 */
	public static void checkSecuritiesSettlementTransactions2(SecuritiesSettlementTransactions2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * AccountOwner must be present or Cancellation(*)/AccountOwner must be
	 * present, but not both.
	 */
	public static void checkIntraPositionCancellation3(IntraPositionCancellation3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * AccountOwner must be present or Cancellation(*)/AccountOwner must be
	 * present, but not both.
	 */
	public static void checkIntraBalanceCancellation3(IntraBalanceCancellation3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * AccountOwner must be present or Movement(*)/AccountOwner must be present,
	 * but not both.
	 */
	public static void checkIntraBalanceMovements2(IntraBalanceMovements2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * AccountOwner must be present or Cancellation(*)/AccountOwner must be
	 * present, but not both.
	 */
	public static void checkIntraBalanceModification3(IntraBalanceModification3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * AccountOwner must be present or Movement(*)/AccountOwner must be present,
	 * but not both.
	 */
	public static void checkIntraPositionMovements3(IntraPositionMovements3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * AccountOwner must be present or Transaction(*)/AccountOwner must be
	 * present, but not both.
	 */
	public static void checkSecuritiesSettlementTransactions3(SecuritiesSettlementTransactions3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}