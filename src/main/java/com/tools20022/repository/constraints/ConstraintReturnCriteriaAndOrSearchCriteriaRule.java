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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReturnCriteriaAndOrSearchCriteriaRule#forStandingOrderCriteria2
	 * ConstraintReturnCriteriaAndOrSearchCriteriaRule.forStandingOrderCriteria2
	 * }</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<StandingOrderCriteria1> forStandingOrderCriteria1 = new MMConstraint<StandingOrderCriteria1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnCriteriaAndOrSearchCriteriaRule";
			definition = "If ReturnCriteria is not present, then at least one occurrence of SearchCriteria must be present. If ReturnCriteria is present, then any occurrence of SearchCriteria is optional.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReturnCriteriaAndOrSearchCriteriaRule.forStandingOrderCriteria2);
			owner_lazy = () -> StandingOrderCriteria1.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SearchCriteria[1]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ReturnCriteria</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(StandingOrderCriteria1 obj) throws Exception {
			checkStandingOrderCriteria1(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnCriteriaAndOrSearchCriteriaRule";
			definition = "If ReturnCriteria is not present, then at least one occurrence of SearchCriteria must be present. If ReturnCriteria is present, then any occurrence of SearchCriteria is optional.";
			owner_lazy = () -> MemberCriteria2.mmObject();
		}

		@Override
		public void executeValidator(MemberCriteria2 obj) throws Exception {
			checkMemberCriteria2(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReturnCriteriaAndOrSearchCriteriaRule#forReservationCriteria3
	 * ConstraintReturnCriteriaAndOrSearchCriteriaRule.forReservationCriteria3}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ReservationCriteria2> forReservationCriteria2 = new MMConstraint<ReservationCriteria2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnCriteriaAndOrSearchCriteriaRule";
			definition = "If ReturnCriteria is not present, then at least one occurrence of SearchCriteria must be present. If ReturnCriteria is present, then any occurrence of SearchCriteria is optional.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReturnCriteriaAndOrSearchCriteriaRule.forReservationCriteria3);
			owner_lazy = () -> ReservationCriteria2.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SearchCriteria[1]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ReturnCriteria</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(ReservationCriteria2 obj) throws Exception {
			checkReservationCriteria2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReservationCriteria3
	 * ReservationCriteria3}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReturnCriteriaAndOrSearchCriteriaRule#forReservationCriteria2
	 * ConstraintReturnCriteriaAndOrSearchCriteriaRule.forReservationCriteria2}</li>
	 * </ul>
	 */
	public static final MMConstraint<ReservationCriteria3> forReservationCriteria3 = new MMConstraint<ReservationCriteria3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnCriteriaAndOrSearchCriteriaRule";
			definition = "If ReturnCriteria is not present, then at least one occurrence of SearchCriteria must be present. If ReturnCriteria is present, then any occurrence of SearchCriteria is optional.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReturnCriteriaAndOrSearchCriteriaRule.forReservationCriteria2;
			owner_lazy = () -> ReservationCriteria3.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SearchCriteria[1]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ReturnCriteria</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(ReservationCriteria3 obj) throws Exception {
			checkReservationCriteria3(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReturnCriteriaAndOrSearchCriteriaRule#forAccountCriteria6
	 * ConstraintReturnCriteriaAndOrSearchCriteriaRule.forAccountCriteria6}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountCriteria5> forAccountCriteria5 = new MMConstraint<AccountCriteria5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnCriteriaAndOrSearchCriteriaRule";
			definition = "If ReturnCriteria is not present, then at least one occurrence of SearchCriteria must be present. If ReturnCriteria is present, then any occurrence of SearchCriteria is optional.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReturnCriteriaAndOrSearchCriteriaRule.forAccountCriteria6);
			owner_lazy = () -> AccountCriteria5.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SearchCriteria[1]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ReturnCriteria</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(AccountCriteria5 obj) throws Exception {
			checkAccountCriteria5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.BusinessDayCriteria2
	 * BusinessDayCriteria2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReturnCriteriaAndOrSearchCriteriaRule#forBusinessDayCriteria1
	 * ConstraintReturnCriteriaAndOrSearchCriteriaRule.forBusinessDayCriteria1}</li>
	 * </ul>
	 */
	public static final MMConstraint<BusinessDayCriteria2> forBusinessDayCriteria2 = new MMConstraint<BusinessDayCriteria2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnCriteriaAndOrSearchCriteriaRule";
			definition = "If ReturnCriteria is not present, then at least one occurrence of SearchCriteria must be present. If ReturnCriteria is present, then any occurrence of SearchCriteria is optional.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReturnCriteriaAndOrSearchCriteriaRule.forBusinessDayCriteria1;
			owner_lazy = () -> BusinessDayCriteria2.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SearchCriteria[1]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ReturnCriteria</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(BusinessDayCriteria2 obj) throws Exception {
			checkBusinessDayCriteria2(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnCriteriaAndOrSearchCriteriaRule";
			definition = "If ReturnCriteria is not present, then at least one occurrence of SearchCriteria must be present. If ReturnCriteria is present, then any occurrence of SearchCriteria is optional.";
			owner_lazy = () -> LimitCriteria1.mmObject();
		}

		@Override
		public void executeValidator(LimitCriteria1 obj) throws Exception {
			checkLimitCriteria1(obj);
		}
	};
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnCriteriaAndOrSearchCriteriaRule";
			definition = "If ReturnCriteria is not present, then at least one occurrence of SearchCriteria must be present. If ReturnCriteria is present, then any occurrence of SearchCriteria is optional.";
			owner_lazy = () -> AccountCriteria2.mmObject();
		}

		@Override
		public void executeValidator(AccountCriteria2 obj) throws Exception {
			checkAccountCriteria2(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnCriteriaAndOrSearchCriteriaRule";
			definition = "If ReturnCriteria is not present, then at least one occurrence of SearchCriteria must be present. If ReturnCriteria is present, then any occurrence of SearchCriteria is optional.";
			owner_lazy = () -> AccountCriteria4.mmObject();
		}

		@Override
		public void executeValidator(AccountCriteria4 obj) throws Exception {
			checkAccountCriteria4(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnCriteriaAndOrSearchCriteriaRule";
			definition = "If ReturnCriteria is not present, then at least one occurrence of SearchCriteria must be present. If ReturnCriteria is present, then any occurrence of SearchCriteria is optional.";
			owner_lazy = () -> LimitCriteria2.mmObject();
		}

		@Override
		public void executeValidator(LimitCriteria2 obj) throws Exception {
			checkLimitCriteria2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountCriteria6
	 * AccountCriteria6}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReturnCriteriaAndOrSearchCriteriaRule#forAccountCriteria5
	 * ConstraintReturnCriteriaAndOrSearchCriteriaRule.forAccountCriteria5}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountCriteria6> forAccountCriteria6 = new MMConstraint<AccountCriteria6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnCriteriaAndOrSearchCriteriaRule";
			definition = "If ReturnCriteria is not present, then at least one occurrence of SearchCriteria must be present. If ReturnCriteria is present, then any occurrence of SearchCriteria is optional.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReturnCriteriaAndOrSearchCriteriaRule.forAccountCriteria5;
			owner_lazy = () -> AccountCriteria6.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SearchCriteria[1]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ReturnCriteria</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(AccountCriteria6 obj) throws Exception {
			checkAccountCriteria6(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrderCriteria2
	 * StandingOrderCriteria2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReturnCriteriaAndOrSearchCriteriaRule#forStandingOrderCriteria1
	 * ConstraintReturnCriteriaAndOrSearchCriteriaRule.forStandingOrderCriteria1
	 * }</li>
	 * </ul>
	 */
	public static final MMConstraint<StandingOrderCriteria2> forStandingOrderCriteria2 = new MMConstraint<StandingOrderCriteria2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnCriteriaAndOrSearchCriteriaRule";
			definition = "If ReturnCriteria is not present, then at least one occurrence of SearchCriteria must be present. If ReturnCriteria is present, then any occurrence of SearchCriteria is optional.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReturnCriteriaAndOrSearchCriteriaRule.forStandingOrderCriteria1;
			owner_lazy = () -> StandingOrderCriteria2.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SearchCriteria[1]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ReturnCriteria</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(StandingOrderCriteria2 obj) throws Exception {
			checkStandingOrderCriteria2(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnCriteriaAndOrSearchCriteriaRule";
			definition = "If ReturnCriteria is not present, then at least one occurrence of SearchCriteria must be present. If ReturnCriteria is present, then any occurrence of SearchCriteria is optional.";
			owner_lazy = () -> ReservationCriteria1.mmObject();
		}

		@Override
		public void executeValidator(ReservationCriteria1 obj) throws Exception {
			checkReservationCriteria1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.LimitCriteria4 LimitCriteria4}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReturnCriteriaAndOrSearchCriteriaRule#forLimitCriteria5
	 * ConstraintReturnCriteriaAndOrSearchCriteriaRule.forLimitCriteria5}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReturnCriteriaAndOrSearchCriteriaRule#forLimitCriteria3
	 * ConstraintReturnCriteriaAndOrSearchCriteriaRule.forLimitCriteria3}</li>
	 * </ul>
	 */
	public static final MMConstraint<LimitCriteria4> forLimitCriteria4 = new MMConstraint<LimitCriteria4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnCriteriaAndOrSearchCriteriaRule";
			definition = "If ReturnCriteria is not present, then at least one occurrence of SearchCriteria must be present. If ReturnCriteria is present, then any occurrence of SearchCriteria is optional.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReturnCriteriaAndOrSearchCriteriaRule.forLimitCriteria5);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReturnCriteriaAndOrSearchCriteriaRule.forLimitCriteria3;
			owner_lazy = () -> LimitCriteria4.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SearchCriteria[1]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ReturnCriteria</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(LimitCriteria4 obj) throws Exception {
			checkLimitCriteria4(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReturnCriteriaAndOrSearchCriteriaRule#forMemberCriteria3
	 * ConstraintReturnCriteriaAndOrSearchCriteriaRule.forMemberCriteria3}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<MemberCriteria> forMemberCriteria = new MMConstraint<MemberCriteria>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnCriteriaAndOrSearchCriteriaRule";
			definition = "If ReturnCriteria is not present, then at least one occurrence of SearchCriteria must be present. If ReturnCriteria is present, then any occurrence of SearchCriteria is optional.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReturnCriteriaAndOrSearchCriteriaRule.forMemberCriteria3);
			owner_lazy = () -> MemberCriteria.mmObject();
		}

		@Override
		public void executeValidator(MemberCriteria obj) throws Exception {
			checkMemberCriteria(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnCriteriaAndOrSearchCriteriaRule";
			definition = "If ReturnCriteria is not present, then at least one occurrence of SearchCriteria must be present. If ReturnCriteria is present, then any occurrence of SearchCriteria is optional.";
			owner_lazy = () -> BusinessDayInformationCriteria.mmObject();
		}

		@Override
		public void executeValidator(BusinessDayInformationCriteria obj) throws Exception {
			checkBusinessDayInformationCriteria(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReturnCriteriaAndOrSearchCriteriaRule#forLimitCriteria4
	 * ConstraintReturnCriteriaAndOrSearchCriteriaRule.forLimitCriteria4}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<LimitCriteria3> forLimitCriteria3 = new MMConstraint<LimitCriteria3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnCriteriaAndOrSearchCriteriaRule";
			definition = "If ReturnCriteria is not present, then at least one occurrence of SearchCriteria must be present. If ReturnCriteria is present, then any occurrence of SearchCriteria is optional.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReturnCriteriaAndOrSearchCriteriaRule.forLimitCriteria4);
			owner_lazy = () -> LimitCriteria3.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SearchCriteria[1]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ReturnCriteria</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(LimitCriteria3 obj) throws Exception {
			checkLimitCriteria3(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnCriteriaAndOrSearchCriteriaRule";
			definition = "If ReturnCriteria is not present, then at least one occurrence of SearchCriteria must be present. If ReturnCriteria is present, then any occurrence of SearchCriteria is optional.";
			owner_lazy = () -> AccountCriteria3.mmObject();
		}

		@Override
		public void executeValidator(AccountCriteria3 obj) throws Exception {
			checkAccountCriteria3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.BusinessInformationCriteria1
	 * BusinessInformationCriteria1}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReturnCriteriaAndOrSearchCriteriaRule#forBusinessInformationCriteria
	 * ConstraintReturnCriteriaAndOrSearchCriteriaRule.
	 * forBusinessInformationCriteria}</li>
	 * </ul>
	 */
	public static final MMConstraint<BusinessInformationCriteria1> forBusinessInformationCriteria1 = new MMConstraint<BusinessInformationCriteria1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnCriteriaAndOrSearchCriteriaRule";
			definition = "If ReturnCriteria is not present, then at least one occurrence of SearchCriteria must be present. If ReturnCriteria is present, then any occurrence of SearchCriteria is optional.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReturnCriteriaAndOrSearchCriteriaRule.forBusinessInformationCriteria;
			owner_lazy = () -> BusinessInformationCriteria1.mmObject();
		}

		@Override
		public void executeValidator(BusinessInformationCriteria1 obj) throws Exception {
			checkBusinessInformationCriteria1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.LimitCriteria5 LimitCriteria5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReturnCriteriaAndOrSearchCriteriaRule#forLimitCriteria4
	 * ConstraintReturnCriteriaAndOrSearchCriteriaRule.forLimitCriteria4}</li>
	 * </ul>
	 */
	public static final MMConstraint<LimitCriteria5> forLimitCriteria5 = new MMConstraint<LimitCriteria5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnCriteriaAndOrSearchCriteriaRule";
			definition = "If ReturnCriteria is not present, then at least one occurrence of SearchCriteria must be present. If ReturnCriteria is present, then any occurrence of SearchCriteria is optional.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReturnCriteriaAndOrSearchCriteriaRule.forLimitCriteria4;
			owner_lazy = () -> LimitCriteria5.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SearchCriteria[1]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ReturnCriteria</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(LimitCriteria5 obj) throws Exception {
			checkLimitCriteria5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.MemberCriteria3
	 * MemberCriteria3}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReturnCriteriaAndOrSearchCriteriaRule#forMemberCriteria
	 * ConstraintReturnCriteriaAndOrSearchCriteriaRule.forMemberCriteria}</li>
	 * </ul>
	 */
	public static final MMConstraint<MemberCriteria3> forMemberCriteria3 = new MMConstraint<MemberCriteria3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnCriteriaAndOrSearchCriteriaRule";
			definition = "If ReturnCriteria is not present, then at least one occurrence of SearchCriteria must be present. If ReturnCriteria is present, then any occurrence of SearchCriteria is optional.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReturnCriteriaAndOrSearchCriteriaRule.forMemberCriteria;
			owner_lazy = () -> MemberCriteria3.mmObject();
		}

		@Override
		public void executeValidator(MemberCriteria3 obj) throws Exception {
			checkMemberCriteria3(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReturnCriteriaAndOrSearchCriteriaRule#forBusinessDayCriteria2
	 * ConstraintReturnCriteriaAndOrSearchCriteriaRule.forBusinessDayCriteria2}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<BusinessDayCriteria1> forBusinessDayCriteria1 = new MMConstraint<BusinessDayCriteria1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnCriteriaAndOrSearchCriteriaRule";
			definition = "If ReturnCriteria is not present, then at least one occurrence of SearchCriteria must be present. If ReturnCriteria is present, then any occurrence of SearchCriteria is optional.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReturnCriteriaAndOrSearchCriteriaRule.forBusinessDayCriteria2);
			owner_lazy = () -> BusinessDayCriteria1.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SearchCriteria[1]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ReturnCriteria</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(BusinessDayCriteria1 obj) throws Exception {
			checkBusinessDayCriteria1(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReturnCriteriaAndOrSearchCriteriaRule#forBusinessInformationCriteria1
	 * ConstraintReturnCriteriaAndOrSearchCriteriaRule.
	 * forBusinessInformationCriteria1}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<BusinessInformationCriteria> forBusinessInformationCriteria = new MMConstraint<BusinessInformationCriteria>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnCriteriaAndOrSearchCriteriaRule";
			definition = "If ReturnCriteria is not present, then at least one occurrence of SearchCriteria must be present. If ReturnCriteria is present, then any occurrence of SearchCriteria is optional.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReturnCriteriaAndOrSearchCriteriaRule.forBusinessInformationCriteria1);
			owner_lazy = () -> BusinessInformationCriteria.mmObject();
		}

		@Override
		public void executeValidator(BusinessInformationCriteria obj) throws Exception {
			checkBusinessInformationCriteria(obj);
		}
	};

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
	public static void checkMemberCriteria2(MemberCriteria2 obj) throws Exception {
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
	public static void checkReservationCriteria3(ReservationCriteria3 obj) throws Exception {
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
	public static void checkBusinessDayCriteria2(BusinessDayCriteria2 obj) throws Exception {
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
	public static void checkAccountCriteria2(AccountCriteria2 obj) throws Exception {
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
	public static void checkLimitCriteria2(LimitCriteria2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ReturnCriteria is not present, then at least one occurrence of
	 * SearchCriteria must be present. If ReturnCriteria is present, then any
	 * occurrence of SearchCriteria is optional.
	 */
	public static void checkAccountCriteria6(AccountCriteria6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ReturnCriteria is not present, then at least one occurrence of
	 * SearchCriteria must be present. If ReturnCriteria is present, then any
	 * occurrence of SearchCriteria is optional.
	 */
	public static void checkStandingOrderCriteria2(StandingOrderCriteria2 obj) throws Exception {
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
	public static void checkLimitCriteria4(LimitCriteria4 obj) throws Exception {
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
	public static void checkBusinessDayInformationCriteria(BusinessDayInformationCriteria obj) throws Exception {
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
	public static void checkAccountCriteria3(AccountCriteria3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ReturnCriteria is not present, then at least one occurrence of
	 * SearchCriteria must be present. If ReturnCriteria is present, then any
	 * occurrence of SearchCriteria is optional.
	 */
	public static void checkBusinessInformationCriteria1(BusinessInformationCriteria1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ReturnCriteria is not present, then at least one occurrence of
	 * SearchCriteria must be present. If ReturnCriteria is present, then any
	 * occurrence of SearchCriteria is optional.
	 */
	public static void checkLimitCriteria5(LimitCriteria5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ReturnCriteria is not present, then at least one occurrence of
	 * SearchCriteria must be present. If ReturnCriteria is present, then any
	 * occurrence of SearchCriteria is optional.
	 */
	public static void checkMemberCriteria3(MemberCriteria3 obj) throws Exception {
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
	public static void checkBusinessInformationCriteria(BusinessInformationCriteria obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}