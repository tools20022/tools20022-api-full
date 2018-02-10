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

/**
 * If ReturnCriteria is not present, then at least one occurrence of
 * SearchCriteria must be present. If ReturnCriteria is present, then any
 * occurrence of SearchCriteria is optional.
 */
public class ConstraintReturnCriteriaAndOrSearchCriteriaRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountCriteria2
	 * AccountCriteria2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnCriteriaAndOrSearchCriteriaRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ReturnCriteria is not present, then at least one occurrence of SearchCriteria must be present. If ReturnCriteria is present, then any occurrence of SearchCriteria is optional."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountCriteria2> forAccountCriteria2 = new MMConstraint<AccountCriteria2>() {
		{
			validator = ConstraintReturnCriteriaAndOrSearchCriteriaRule::checkAccountCriteria2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnCriteriaAndOrSearchCriteriaRule";
			definition = "If ReturnCriteria is not present, then at least one occurrence of SearchCriteria must be present. If ReturnCriteria is present, then any occurrence of SearchCriteria is optional.";
			owner_lazy = () -> AccountCriteria2.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountCriteria3
	 * AccountCriteria3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnCriteriaAndOrSearchCriteriaRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ReturnCriteria is not present, then at least one occurrence of SearchCriteria must be present. If ReturnCriteria is present, then any occurrence of SearchCriteria is optional."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountCriteria3> forAccountCriteria3 = new MMConstraint<AccountCriteria3>() {
		{
			validator = ConstraintReturnCriteriaAndOrSearchCriteriaRule::checkAccountCriteria3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnCriteriaAndOrSearchCriteriaRule";
			definition = "If ReturnCriteria is not present, then at least one occurrence of SearchCriteria must be present. If ReturnCriteria is present, then any occurrence of SearchCriteria is optional.";
			owner_lazy = () -> AccountCriteria3.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountCriteria4
	 * AccountCriteria4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnCriteriaAndOrSearchCriteriaRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ReturnCriteria is not present, then at least one occurrence of SearchCriteria must be present. If ReturnCriteria is present, then any occurrence of SearchCriteria is optional."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountCriteria4> forAccountCriteria4 = new MMConstraint<AccountCriteria4>() {
		{
			validator = ConstraintReturnCriteriaAndOrSearchCriteriaRule::checkAccountCriteria4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnCriteriaAndOrSearchCriteriaRule";
			definition = "If ReturnCriteria is not present, then at least one occurrence of SearchCriteria must be present. If ReturnCriteria is present, then any occurrence of SearchCriteria is optional.";
			owner_lazy = () -> AccountCriteria4.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountCriteria5
	 * AccountCriteria5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SearchCriteria[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ReturnCriteria&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnCriteriaAndOrSearchCriteriaRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ReturnCriteria is not present, then at least one occurrence of SearchCriteria must be present. If ReturnCriteria is present, then any occurrence of SearchCriteria is optional."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountCriteria5> forAccountCriteria5 = new MMConstraint<AccountCriteria5>() {
		{
			validator = ConstraintReturnCriteriaAndOrSearchCriteriaRule::checkAccountCriteria5;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnCriteriaAndOrSearchCriteriaRule";
			definition = "If ReturnCriteria is not present, then at least one occurrence of SearchCriteria must be present. If ReturnCriteria is present, then any occurrence of SearchCriteria is optional.";
			owner_lazy = () -> AccountCriteria5.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SearchCriteria[1]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ReturnCriteria</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.BusinessDayInformationCriteria
	 * BusinessDayInformationCriteria}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnCriteriaAndOrSearchCriteriaRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ReturnCriteria is not present, then at least one occurrence of SearchCriteria must be present. If ReturnCriteria is present, then any occurrence of SearchCriteria is optional."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<BusinessDayInformationCriteria> forBusinessDayInformationCriteria = new MMConstraint<BusinessDayInformationCriteria>() {
		{
			validator = ConstraintReturnCriteriaAndOrSearchCriteriaRule::checkBusinessDayInformationCriteria;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnCriteriaAndOrSearchCriteriaRule";
			definition = "If ReturnCriteria is not present, then at least one occurrence of SearchCriteria must be present. If ReturnCriteria is present, then any occurrence of SearchCriteria is optional.";
			owner_lazy = () -> BusinessDayInformationCriteria.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.BusinessDayCriteria1
	 * BusinessDayCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SearchCriteria[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ReturnCriteria&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnCriteriaAndOrSearchCriteriaRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ReturnCriteria is not present, then at least one occurrence of SearchCriteria must be present. If ReturnCriteria is present, then any occurrence of SearchCriteria is optional."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<BusinessDayCriteria1> forBusinessDayCriteria1 = new MMConstraint<BusinessDayCriteria1>() {
		{
			validator = ConstraintReturnCriteriaAndOrSearchCriteriaRule::checkBusinessDayCriteria1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnCriteriaAndOrSearchCriteriaRule";
			definition = "If ReturnCriteria is not present, then at least one occurrence of SearchCriteria must be present. If ReturnCriteria is present, then any occurrence of SearchCriteria is optional.";
			owner_lazy = () -> BusinessDayCriteria1.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SearchCriteria[1]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ReturnCriteria</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.LimitCriteria1 LimitCriteria1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnCriteriaAndOrSearchCriteriaRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ReturnCriteria is not present, then at least one occurrence of SearchCriteria must be present. If ReturnCriteria is present, then any occurrence of SearchCriteria is optional."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<LimitCriteria1> forLimitCriteria1 = new MMConstraint<LimitCriteria1>() {
		{
			validator = ConstraintReturnCriteriaAndOrSearchCriteriaRule::checkLimitCriteria1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnCriteriaAndOrSearchCriteriaRule";
			definition = "If ReturnCriteria is not present, then at least one occurrence of SearchCriteria must be present. If ReturnCriteria is present, then any occurrence of SearchCriteria is optional.";
			owner_lazy = () -> LimitCriteria1.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.LimitCriteria2 LimitCriteria2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnCriteriaAndOrSearchCriteriaRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ReturnCriteria is not present, then at least one occurrence of SearchCriteria must be present. If ReturnCriteria is present, then any occurrence of SearchCriteria is optional."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<LimitCriteria2> forLimitCriteria2 = new MMConstraint<LimitCriteria2>() {
		{
			validator = ConstraintReturnCriteriaAndOrSearchCriteriaRule::checkLimitCriteria2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnCriteriaAndOrSearchCriteriaRule";
			definition = "If ReturnCriteria is not present, then at least one occurrence of SearchCriteria must be present. If ReturnCriteria is present, then any occurrence of SearchCriteria is optional.";
			owner_lazy = () -> LimitCriteria2.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.LimitCriteria3 LimitCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SearchCriteria[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ReturnCriteria&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnCriteriaAndOrSearchCriteriaRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ReturnCriteria is not present, then at least one occurrence of SearchCriteria must be present. If ReturnCriteria is present, then any occurrence of SearchCriteria is optional."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<LimitCriteria3> forLimitCriteria3 = new MMConstraint<LimitCriteria3>() {
		{
			validator = ConstraintReturnCriteriaAndOrSearchCriteriaRule::checkLimitCriteria3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnCriteriaAndOrSearchCriteriaRule";
			definition = "If ReturnCriteria is not present, then at least one occurrence of SearchCriteria must be present. If ReturnCriteria is present, then any occurrence of SearchCriteria is optional.";
			owner_lazy = () -> LimitCriteria3.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SearchCriteria[1]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ReturnCriteria</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReservationCriteria1
	 * ReservationCriteria1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnCriteriaAndOrSearchCriteriaRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ReturnCriteria is not present, then at least one occurrence of SearchCriteria must be present. If ReturnCriteria is present, then any occurrence of SearchCriteria is optional."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ReservationCriteria1> forReservationCriteria1 = new MMConstraint<ReservationCriteria1>() {
		{
			validator = ConstraintReturnCriteriaAndOrSearchCriteriaRule::checkReservationCriteria1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnCriteriaAndOrSearchCriteriaRule";
			definition = "If ReturnCriteria is not present, then at least one occurrence of SearchCriteria must be present. If ReturnCriteria is present, then any occurrence of SearchCriteria is optional.";
			owner_lazy = () -> ReservationCriteria1.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReservationCriteria2
	 * ReservationCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SearchCriteria[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ReturnCriteria&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnCriteriaAndOrSearchCriteriaRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ReturnCriteria is not present, then at least one occurrence of SearchCriteria must be present. If ReturnCriteria is present, then any occurrence of SearchCriteria is optional."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ReservationCriteria2> forReservationCriteria2 = new MMConstraint<ReservationCriteria2>() {
		{
			validator = ConstraintReturnCriteriaAndOrSearchCriteriaRule::checkReservationCriteria2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnCriteriaAndOrSearchCriteriaRule";
			definition = "If ReturnCriteria is not present, then at least one occurrence of SearchCriteria must be present. If ReturnCriteria is present, then any occurrence of SearchCriteria is optional.";
			owner_lazy = () -> ReservationCriteria2.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SearchCriteria[1]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ReturnCriteria</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrderCriteria1
	 * StandingOrderCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SearchCriteria[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ReturnCriteria&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnCriteriaAndOrSearchCriteriaRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ReturnCriteria is not present, then at least one occurrence of SearchCriteria must be present. If ReturnCriteria is present, then any occurrence of SearchCriteria is optional."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<StandingOrderCriteria1> forStandingOrderCriteria1 = new MMConstraint<StandingOrderCriteria1>() {
		{
			validator = ConstraintReturnCriteriaAndOrSearchCriteriaRule::checkStandingOrderCriteria1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnCriteriaAndOrSearchCriteriaRule";
			definition = "If ReturnCriteria is not present, then at least one occurrence of SearchCriteria must be present. If ReturnCriteria is present, then any occurrence of SearchCriteria is optional.";
			owner_lazy = () -> StandingOrderCriteria1.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SearchCriteria[1]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ReturnCriteria</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.MemberCriteria MemberCriteria}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnCriteriaAndOrSearchCriteriaRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ReturnCriteria is not present, then at least one occurrence of SearchCriteria must be present. If ReturnCriteria is present, then any occurrence of SearchCriteria is optional."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<MemberCriteria> forMemberCriteria = new MMConstraint<MemberCriteria>() {
		{
			validator = ConstraintReturnCriteriaAndOrSearchCriteriaRule::checkMemberCriteria;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnCriteriaAndOrSearchCriteriaRule";
			definition = "If ReturnCriteria is not present, then at least one occurrence of SearchCriteria must be present. If ReturnCriteria is present, then any occurrence of SearchCriteria is optional.";
			owner_lazy = () -> MemberCriteria.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.BusinessInformationCriteria
	 * BusinessInformationCriteria}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnCriteriaAndOrSearchCriteriaRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ReturnCriteria is not present, then at least one occurrence of SearchCriteria must be present. If ReturnCriteria is present, then any occurrence of SearchCriteria is optional."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<BusinessInformationCriteria> forBusinessInformationCriteria = new MMConstraint<BusinessInformationCriteria>() {
		{
			validator = ConstraintReturnCriteriaAndOrSearchCriteriaRule::checkBusinessInformationCriteria;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnCriteriaAndOrSearchCriteriaRule";
			definition = "If ReturnCriteria is not present, then at least one occurrence of SearchCriteria must be present. If ReturnCriteria is present, then any occurrence of SearchCriteria is optional.";
			owner_lazy = () -> BusinessInformationCriteria.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.MemberCriteria2
	 * MemberCriteria2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnCriteriaAndOrSearchCriteriaRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ReturnCriteria is not present, then at least one occurrence of SearchCriteria must be present. If ReturnCriteria is present, then any occurrence of SearchCriteria is optional."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<MemberCriteria2> forMemberCriteria2 = new MMConstraint<MemberCriteria2>() {
		{
			validator = ConstraintReturnCriteriaAndOrSearchCriteriaRule::checkMemberCriteria2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnCriteriaAndOrSearchCriteriaRule";
			definition = "If ReturnCriteria is not present, then at least one occurrence of SearchCriteria must be present. If ReturnCriteria is present, then any occurrence of SearchCriteria is optional.";
			owner_lazy = () -> MemberCriteria2.mmObject();
		}
	};

	/**
	 * If ReturnCriteria is not present, then at least one occurrence of
	 * SearchCriteria must be present. If ReturnCriteria is present, then any
	 * occurrence of SearchCriteria is optional.
	 */
	public static void checkAccountCriteria2(AccountCriteria2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ReturnCriteria is not present, then at least one occurrence of
	 * SearchCriteria must be present. If ReturnCriteria is present, then any
	 * occurrence of SearchCriteria is optional.
	 */
	public static void checkAccountCriteria3(AccountCriteria3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ReturnCriteria is not present, then at least one occurrence of
	 * SearchCriteria must be present. If ReturnCriteria is present, then any
	 * occurrence of SearchCriteria is optional.
	 */
	public static void checkAccountCriteria4(AccountCriteria4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ReturnCriteria is not present, then at least one occurrence of
	 * SearchCriteria must be present. If ReturnCriteria is present, then any
	 * occurrence of SearchCriteria is optional.
	 */
	public static void checkAccountCriteria5(AccountCriteria5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ReturnCriteria is not present, then at least one occurrence of
	 * SearchCriteria must be present. If ReturnCriteria is present, then any
	 * occurrence of SearchCriteria is optional.
	 */
	public static void checkBusinessDayInformationCriteria(BusinessDayInformationCriteria obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ReturnCriteria is not present, then at least one occurrence of
	 * SearchCriteria must be present. If ReturnCriteria is present, then any
	 * occurrence of SearchCriteria is optional.
	 */
	public static void checkBusinessDayCriteria1(BusinessDayCriteria1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ReturnCriteria is not present, then at least one occurrence of
	 * SearchCriteria must be present. If ReturnCriteria is present, then any
	 * occurrence of SearchCriteria is optional.
	 */
	public static void checkLimitCriteria1(LimitCriteria1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ReturnCriteria is not present, then at least one occurrence of
	 * SearchCriteria must be present. If ReturnCriteria is present, then any
	 * occurrence of SearchCriteria is optional.
	 */
	public static void checkLimitCriteria2(LimitCriteria2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ReturnCriteria is not present, then at least one occurrence of
	 * SearchCriteria must be present. If ReturnCriteria is present, then any
	 * occurrence of SearchCriteria is optional.
	 */
	public static void checkLimitCriteria3(LimitCriteria3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ReturnCriteria is not present, then at least one occurrence of
	 * SearchCriteria must be present. If ReturnCriteria is present, then any
	 * occurrence of SearchCriteria is optional.
	 */
	public static void checkReservationCriteria1(ReservationCriteria1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ReturnCriteria is not present, then at least one occurrence of
	 * SearchCriteria must be present. If ReturnCriteria is present, then any
	 * occurrence of SearchCriteria is optional.
	 */
	public static void checkReservationCriteria2(ReservationCriteria2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ReturnCriteria is not present, then at least one occurrence of
	 * SearchCriteria must be present. If ReturnCriteria is present, then any
	 * occurrence of SearchCriteria is optional.
	 */
	public static void checkStandingOrderCriteria1(StandingOrderCriteria1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ReturnCriteria is not present, then at least one occurrence of
	 * SearchCriteria must be present. If ReturnCriteria is present, then any
	 * occurrence of SearchCriteria is optional.
	 */
	public static void checkMemberCriteria(MemberCriteria obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ReturnCriteria is not present, then at least one occurrence of
	 * SearchCriteria must be present. If ReturnCriteria is present, then any
	 * occurrence of SearchCriteria is optional.
	 */
	public static void checkBusinessInformationCriteria(BusinessInformationCriteria obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ReturnCriteria is not present, then at least one occurrence of
	 * SearchCriteria must be present. If ReturnCriteria is present, then any
	 * occurrence of SearchCriteria is optional.
	 */
	public static void checkMemberCriteria2(MemberCriteria2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}