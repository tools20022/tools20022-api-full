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
import com.tools20022.repository.msg.TransactionIdentifications18;
import com.tools20022.repository.msg.TransactionIdentifications20;
import java.util.Arrays;

/**
 * If no reference is available for the AccountOwnerTransactionIdentification,
 * for example then the AccountOwnerTransactionIdentification must be NONREF and
 * at least one of the other references must be present.
 */
public class ConstraintAccountOwnerTransactionIdentificationComplexRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications18
	 * TransactionIdentifications18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AccountServicerTransactionIdentification&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/MarketInfrastructureTransactionIdentification&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ProcessorTransactionIdentification&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OtherIdentification&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/AccountOwnerTransactionIdentification&lt;/leftOperand&gt;&lt;rightOperand&gt;NONREF&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwnerTransactionIdentificationComplexRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example then the AccountOwnerTransactionIdentification must be NONREF and at least one of the other references must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountOwnerTransactionIdentificationRule#forTransactionIdentifications25
	 * ConstraintAccountOwnerTransactionIdentificationRule.
	 * forTransactionIdentifications25}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionIdentifications18> forTransactionIdentifications18 = new MMConstraint<TransactionIdentifications18>() {
		{
			validator = ConstraintAccountOwnerTransactionIdentificationComplexRule::checkTransactionIdentifications18;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwnerTransactionIdentificationComplexRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example then the AccountOwnerTransactionIdentification must be NONREF and at least one of the other references must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAccountOwnerTransactionIdentificationRule.forTransactionIdentifications25);
			owner_lazy = () -> TransactionIdentifications18.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AccountServicerTransactionIdentification</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/MarketInfrastructureTransactionIdentification</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/ProcessorTransactionIdentification</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/OtherIdentification</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/AccountOwnerTransactionIdentification</leftOperand><rightOperand>NONREF</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications20
	 * TransactionIdentifications20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AccountServicerTransactionIdentification&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/MarketInfrastructureTransactionIdentification&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ProcessorTransactionIdentification&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OtherIdentification&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/AccountOwnerTransactionIdentification&lt;/leftOperand&gt;&lt;rightOperand&gt;NONREF&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwnerTransactionIdentificationComplexRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example then the AccountOwnerTransactionIdentification must be NONREF and at least one of the other references must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionIdentifications20> forTransactionIdentifications20 = new MMConstraint<TransactionIdentifications20>() {
		{
			validator = ConstraintAccountOwnerTransactionIdentificationComplexRule::checkTransactionIdentifications20;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwnerTransactionIdentificationComplexRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example then the AccountOwnerTransactionIdentification must be NONREF and at least one of the other references must be present.";
			owner_lazy = () -> TransactionIdentifications20.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AccountServicerTransactionIdentification</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/MarketInfrastructureTransactionIdentification</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/ProcessorTransactionIdentification</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/OtherIdentification</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/AccountOwnerTransactionIdentification</leftOperand><rightOperand>NONREF</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example then the
	 * AccountOwnerTransactionIdentification must be NONREF and at least one of
	 * the other references must be present.
	 */
	public static void checkTransactionIdentifications18(TransactionIdentifications18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example then the
	 * AccountOwnerTransactionIdentification must be NONREF and at least one of
	 * the other references must be present.
	 */
	public static void checkTransactionIdentifications20(TransactionIdentifications20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}