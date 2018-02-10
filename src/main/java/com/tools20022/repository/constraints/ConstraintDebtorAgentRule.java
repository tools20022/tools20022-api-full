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
import com.tools20022.repository.area.pacs.PaymentCancellationRequestV01;
import com.tools20022.repository.area.pacs.PaymentStatusReportV02;
import com.tools20022.repository.msg.*;
import java.util.Arrays;

/**
 * GroupHeader/DebtorAgent is not allowed.
 */
public class ConstraintDebtorAgentRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.PaymentCancellationRequestV01
	 * PaymentCancellationRequestV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorAgentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "GroupHeader/DebtorAgent is not allowed.\n\n"</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentCancellationRequestV01> forPaymentCancellationRequestV01 = new MMConstraint<PaymentCancellationRequestV01>() {
		{
			validator = ConstraintDebtorAgentRule::checkPaymentCancellationRequestV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAgentRule";
			definition = "GroupHeader/DebtorAgent is not allowed.\n\n";
			owner_lazy = () -> PaymentCancellationRequestV01.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.PaymentStatusReportV02
	 * PaymentStatusReportV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorAgentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "GroupHeader/DebtorAgent is not allowed.\n\n"</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentStatusReportV02> forPaymentStatusReportV02 = new MMConstraint<PaymentStatusReportV02>() {
		{
			validator = ConstraintDebtorAgentRule::checkPaymentStatusReportV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAgentRule";
			definition = "GroupHeader/DebtorAgent is not allowed.\n\n";
			owner_lazy = () -> PaymentStatusReportV02.mmObject();
		}
	};
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
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/Item[*]/DebtorAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/DebtorAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorAgentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either DebtorAgent or Item/DebtorAgent may be present but not both."</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountNotification4> forAccountNotification4 = new MMConstraint<AccountNotification4>() {
		{
			validator = ConstraintDebtorAgentRule::checkAccountNotification4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAgentRule";
			definition = "Either DebtorAgent or Item/DebtorAgent may be present but not both.";
			owner_lazy = () -> AccountNotification4.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/Item[*]/DebtorAgent</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/DebtorAgent</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
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
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/OriginalItem[*]/OriginalItemReference/DebtorAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/DebtorAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorAgentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either DebtorAgent or OriginalItem/DebtorAgent may be present but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OriginalNotificationReference1> forOriginalNotificationReference1 = new MMConstraint<OriginalNotificationReference1>() {
		{
			validator = ConstraintDebtorAgentRule::checkOriginalNotificationReference1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAgentRule";
			definition = "Either DebtorAgent or OriginalItem/DebtorAgent may be present but not both.";
			owner_lazy = () -> OriginalNotificationReference1.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/OriginalItem[*]/OriginalItemReference/DebtorAgent</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/DebtorAgent</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
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
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/OriginalItemAndStatus[*]/OriginalItemReference/DebtorAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/DebtorAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorAgentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either DebtorAgent or OriginalItem/DebtorAgent may be present but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OriginalNotificationReference2> forOriginalNotificationReference2 = new MMConstraint<OriginalNotificationReference2>() {
		{
			validator = ConstraintDebtorAgentRule::checkOriginalNotificationReference2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAgentRule";
			definition = "Either DebtorAgent or OriginalItem/DebtorAgent may be present but not both.";
			owner_lazy = () -> OriginalNotificationReference2.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/OriginalItemAndStatus[*]/OriginalItemReference/DebtorAgent</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/DebtorAgent</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
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
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/Item[*]/DebtorAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/DebtorAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorAgentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either DebtorAgent or Item/DebtorAgent may be present but not both."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDebtorAgentRule#forAccountNotification10
	 * ConstraintDebtorAgentRule.forAccountNotification10}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountNotification6> forAccountNotification6 = new MMConstraint<AccountNotification6>() {
		{
			validator = ConstraintDebtorAgentRule::checkAccountNotification6;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAgentRule";
			definition = "Either DebtorAgent or Item/DebtorAgent may be present but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDebtorAgentRule.forAccountNotification10);
			owner_lazy = () -> AccountNotification6.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/Item[*]/DebtorAgent</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/DebtorAgent</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
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
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/OriginalItem[*]/OriginalItemReference/DebtorAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/DebtorAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorAgentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either DebtorAgent or OriginalItem/DebtorAgent may be present but not both."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDebtorAgentRule#forOriginalNotificationReference6
	 * ConstraintDebtorAgentRule.forOriginalNotificationReference6}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OriginalNotificationReference4> forOriginalNotificationReference4 = new MMConstraint<OriginalNotificationReference4>() {
		{
			validator = ConstraintDebtorAgentRule::checkOriginalNotificationReference4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAgentRule";
			definition = "Either DebtorAgent or OriginalItem/DebtorAgent may be present but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDebtorAgentRule.forOriginalNotificationReference6);
			owner_lazy = () -> OriginalNotificationReference4.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/OriginalItem[*]/OriginalItemReference/DebtorAgent</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/DebtorAgent</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
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
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/OriginalItemAndStatus[*]/OriginalItemReference/DebtorAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/DebtorAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorAgentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either DebtorAgent or OriginalItem/DebtorAgent may be present but not both."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDebtorAgentRule#forOriginalNotificationReference5
	 * ConstraintDebtorAgentRule.forOriginalNotificationReference5}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OriginalNotificationReference3> forOriginalNotificationReference3 = new MMConstraint<OriginalNotificationReference3>() {
		{
			validator = ConstraintDebtorAgentRule::checkOriginalNotificationReference3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAgentRule";
			definition = "Either DebtorAgent or OriginalItem/DebtorAgent may be present but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDebtorAgentRule.forOriginalNotificationReference5);
			owner_lazy = () -> OriginalNotificationReference3.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/OriginalItemAndStatus[*]/OriginalItemReference/DebtorAgent</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/DebtorAgent</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
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
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/Item[*]/DebtorAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/DebtorAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorAgentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either DebtorAgent or Item/DebtorAgent may be present but not both."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDebtorAgentRule#forAccountNotification13
	 * ConstraintDebtorAgentRule.forAccountNotification13}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDebtorAgentRule#forAccountNotification6
	 * ConstraintDebtorAgentRule.forAccountNotification6}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountNotification10> forAccountNotification10 = new MMConstraint<AccountNotification10>() {
		{
			validator = ConstraintDebtorAgentRule::checkAccountNotification10;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAgentRule";
			definition = "Either DebtorAgent or Item/DebtorAgent may be present but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDebtorAgentRule.forAccountNotification13);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDebtorAgentRule.forAccountNotification6;
			owner_lazy = () -> AccountNotification10.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/Item[*]/DebtorAgent</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/DebtorAgent</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
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
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/OriginalItem[*]/OriginalItemReference/DebtorAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/DebtorAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorAgentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either DebtorAgent or OriginalItem/DebtorAgent may be present but not both."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDebtorAgentRule#forOriginalNotificationReference8
	 * ConstraintDebtorAgentRule.forOriginalNotificationReference8}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDebtorAgentRule#forOriginalNotificationReference4
	 * ConstraintDebtorAgentRule.forOriginalNotificationReference4}</li>
	 * </ul>
	 */
	public static final MMConstraint<OriginalNotificationReference6> forOriginalNotificationReference6 = new MMConstraint<OriginalNotificationReference6>() {
		{
			validator = ConstraintDebtorAgentRule::checkOriginalNotificationReference6;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAgentRule";
			definition = "Either DebtorAgent or OriginalItem/DebtorAgent may be present but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDebtorAgentRule.forOriginalNotificationReference8);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDebtorAgentRule.forOriginalNotificationReference4;
			owner_lazy = () -> OriginalNotificationReference6.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/OriginalItem[*]/OriginalItemReference/DebtorAgent</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/DebtorAgent</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
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
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/OriginalItemAndStatus[*]/OriginalItemReference/DebtorAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/DebtorAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorAgentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either DebtorAgent or OriginalItem/DebtorAgent may be present but not both."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDebtorAgentRule#forOriginalNotificationReference7
	 * ConstraintDebtorAgentRule.forOriginalNotificationReference7}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDebtorAgentRule#forOriginalNotificationReference3
	 * ConstraintDebtorAgentRule.forOriginalNotificationReference3}</li>
	 * </ul>
	 */
	public static final MMConstraint<OriginalNotificationReference5> forOriginalNotificationReference5 = new MMConstraint<OriginalNotificationReference5>() {
		{
			validator = ConstraintDebtorAgentRule::checkOriginalNotificationReference5;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAgentRule";
			definition = "Either DebtorAgent or OriginalItem/DebtorAgent may be present but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDebtorAgentRule.forOriginalNotificationReference7);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDebtorAgentRule.forOriginalNotificationReference3;
			owner_lazy = () -> OriginalNotificationReference5.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/OriginalItemAndStatus[*]/OriginalItemReference/DebtorAgent</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/DebtorAgent</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
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
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/Item[*]/DebtorAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/DebtorAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorAgentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either DebtorAgent or Item/DebtorAgent may be present but not both."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDebtorAgentRule#forAccountNotification10
	 * ConstraintDebtorAgentRule.forAccountNotification10}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountNotification13> forAccountNotification13 = new MMConstraint<AccountNotification13>() {
		{
			validator = ConstraintDebtorAgentRule::checkAccountNotification13;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAgentRule";
			definition = "Either DebtorAgent or Item/DebtorAgent may be present but not both.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDebtorAgentRule.forAccountNotification10;
			owner_lazy = () -> AccountNotification13.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/Item[*]/DebtorAgent</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/DebtorAgent</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
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
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/OriginalItem[*]/OriginalItemReference/DebtorAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/DebtorAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorAgentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either DebtorAgent or OriginalItem/DebtorAgent may be present but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDebtorAgentRule#forOriginalNotificationReference6
	 * ConstraintDebtorAgentRule.forOriginalNotificationReference6}</li>
	 * </ul>
	 */
	public static final MMConstraint<OriginalNotificationReference8> forOriginalNotificationReference8 = new MMConstraint<OriginalNotificationReference8>() {
		{
			validator = ConstraintDebtorAgentRule::checkOriginalNotificationReference8;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAgentRule";
			definition = "Either DebtorAgent or OriginalItem/DebtorAgent may be present but not both.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDebtorAgentRule.forOriginalNotificationReference6;
			owner_lazy = () -> OriginalNotificationReference8.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/OriginalItem[*]/OriginalItemReference/DebtorAgent</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/DebtorAgent</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
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
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/OriginalItemAndStatus[*]/OriginalItemReference/DebtorAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/DebtorAgent&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorAgentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either DebtorAgent or OriginalItem/DebtorAgent may be present but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDebtorAgentRule#forOriginalNotificationReference5
	 * ConstraintDebtorAgentRule.forOriginalNotificationReference5}</li>
	 * </ul>
	 */
	public static final MMConstraint<OriginalNotificationReference7> forOriginalNotificationReference7 = new MMConstraint<OriginalNotificationReference7>() {
		{
			validator = ConstraintDebtorAgentRule::checkOriginalNotificationReference7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAgentRule";
			definition = "Either DebtorAgent or OriginalItem/DebtorAgent may be present but not both.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDebtorAgentRule.forOriginalNotificationReference5;
			owner_lazy = () -> OriginalNotificationReference7.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/OriginalItemAndStatus[*]/OriginalItemReference/DebtorAgent</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/DebtorAgent</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};

	/**
	 * GroupHeader/DebtorAgent is not allowed.
	 */
	public static void checkPaymentCancellationRequestV01(PaymentCancellationRequestV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GroupHeader/DebtorAgent is not allowed.
	 */
	public static void checkPaymentStatusReportV02(PaymentStatusReportV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either DebtorAgent or Item/DebtorAgent may be present but not both.
	 */
	public static void checkAccountNotification4(AccountNotification4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either DebtorAgent or OriginalItem/DebtorAgent may be present but not
	 * both.
	 */
	public static void checkOriginalNotificationReference1(OriginalNotificationReference1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either DebtorAgent or OriginalItem/DebtorAgent may be present but not
	 * both.
	 */
	public static void checkOriginalNotificationReference2(OriginalNotificationReference2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either DebtorAgent or Item/DebtorAgent may be present but not both.
	 */
	public static void checkAccountNotification6(AccountNotification6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either DebtorAgent or OriginalItem/DebtorAgent may be present but not
	 * both.
	 */
	public static void checkOriginalNotificationReference4(OriginalNotificationReference4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either DebtorAgent or OriginalItem/DebtorAgent may be present but not
	 * both.
	 */
	public static void checkOriginalNotificationReference3(OriginalNotificationReference3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either DebtorAgent or Item/DebtorAgent may be present but not both.
	 */
	public static void checkAccountNotification10(AccountNotification10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either DebtorAgent or OriginalItem/DebtorAgent may be present but not
	 * both.
	 */
	public static void checkOriginalNotificationReference6(OriginalNotificationReference6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either DebtorAgent or OriginalItem/DebtorAgent may be present but not
	 * both.
	 */
	public static void checkOriginalNotificationReference5(OriginalNotificationReference5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either DebtorAgent or Item/DebtorAgent may be present but not both.
	 */
	public static void checkAccountNotification13(AccountNotification13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either DebtorAgent or OriginalItem/DebtorAgent may be present but not
	 * both.
	 */
	public static void checkOriginalNotificationReference8(OriginalNotificationReference8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either DebtorAgent or OriginalItem/DebtorAgent may be present but not
	 * both.
	 */
	public static void checkOriginalNotificationReference7(OriginalNotificationReference7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}