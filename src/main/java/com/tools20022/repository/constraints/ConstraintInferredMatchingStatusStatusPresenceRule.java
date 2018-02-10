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
import com.tools20022.repository.area.sese.*;
import java.util.Arrays;

/**
 * If ProcessingStatus, MatchingStatus and SettlementStatus are absent, the
 * InferredMatchingStatus must be present.
 */
public class ConstraintInferredMatchingStatusStatusPresenceRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV09
	 * SecuritiesSettlementTransactionStatusAdviceV09}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/InferredMatchingStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ProcessingStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/MatchingStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/SettlementStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InferredMatchingStatusStatusPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProcessingStatus, MatchingStatus and SettlementStatus are absent, the InferredMatchingStatus must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInferredMatchingStatusStatusPresenceRule#forSecuritiesSettlementTransactionStatusAdviceV08
	 * ConstraintInferredMatchingStatusStatusPresenceRule.
	 * forSecuritiesSettlementTransactionStatusAdviceV08}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionStatusAdviceV09> forSecuritiesSettlementTransactionStatusAdviceV09 = new MMConstraint<SecuritiesSettlementTransactionStatusAdviceV09>() {
		{
			validator = ConstraintInferredMatchingStatusStatusPresenceRule::checkSecuritiesSettlementTransactionStatusAdviceV09;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InferredMatchingStatusStatusPresenceRule";
			definition = "If ProcessingStatus, MatchingStatus and SettlementStatus are absent, the InferredMatchingStatus must be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintInferredMatchingStatusStatusPresenceRule.forSecuritiesSettlementTransactionStatusAdviceV08;
			owner_lazy = () -> SecuritiesSettlementTransactionStatusAdviceV09.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/InferredMatchingStatus</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ProcessingStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/MatchingStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/SettlementStatus</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV08
	 * SecuritiesSettlementTransactionStatusAdviceV08}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/InferredMatchingStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ProcessingStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/MatchingStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/SettlementStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InferredMatchingStatusStatusPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProcessingStatus, MatchingStatus and SettlementStatus are absent, the InferredMatchingStatus must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInferredMatchingStatusStatusPresenceRule#forSecuritiesSettlementTransactionStatusAdviceV09
	 * ConstraintInferredMatchingStatusStatusPresenceRule.
	 * forSecuritiesSettlementTransactionStatusAdviceV09}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInferredMatchingStatusStatusPresenceRule#forSecuritiesSettlementTransactionStatusAdviceV07
	 * ConstraintInferredMatchingStatusStatusPresenceRule.
	 * forSecuritiesSettlementTransactionStatusAdviceV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionStatusAdviceV08> forSecuritiesSettlementTransactionStatusAdviceV08 = new MMConstraint<SecuritiesSettlementTransactionStatusAdviceV08>() {
		{
			validator = ConstraintInferredMatchingStatusStatusPresenceRule::checkSecuritiesSettlementTransactionStatusAdviceV08;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InferredMatchingStatusStatusPresenceRule";
			definition = "If ProcessingStatus, MatchingStatus and SettlementStatus are absent, the InferredMatchingStatus must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInferredMatchingStatusStatusPresenceRule.forSecuritiesSettlementTransactionStatusAdviceV09);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintInferredMatchingStatusStatusPresenceRule.forSecuritiesSettlementTransactionStatusAdviceV07;
			owner_lazy = () -> SecuritiesSettlementTransactionStatusAdviceV08.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/InferredMatchingStatus</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ProcessingStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/MatchingStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/SettlementStatus</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdvice002V08
	 * SecuritiesSettlementTransactionStatusAdvice002V08}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/InferredMatchingStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ProcessingStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/MatchingStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/SettlementStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InferredMatchingStatusStatusPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProcessingStatus, MatchingStatus and SettlementStatus are absent, the InferredMatchingStatus must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionStatusAdvice002V08> forSecuritiesSettlementTransactionStatusAdvice002V08 = new MMConstraint<SecuritiesSettlementTransactionStatusAdvice002V08>() {
		{
			validator = ConstraintInferredMatchingStatusStatusPresenceRule::checkSecuritiesSettlementTransactionStatusAdvice002V08;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InferredMatchingStatusStatusPresenceRule";
			definition = "If ProcessingStatus, MatchingStatus and SettlementStatus are absent, the InferredMatchingStatus must be present.";
			owner_lazy = () -> SecuritiesSettlementTransactionStatusAdvice002V08.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/InferredMatchingStatus</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ProcessingStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/MatchingStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/SettlementStatus</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV01
	 * SecuritiesSettlementTransactionStatusAdviceV01}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/InferredMatchingStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ProcessingStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/MatchingStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/SettlementStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InferredMatchingStatusStatusPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProcessingStatus, MatchingStatus and SettlementStatus are absent, the InferredMatchingStatus must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionStatusAdviceV01> forSecuritiesSettlementTransactionStatusAdviceV01 = new MMConstraint<SecuritiesSettlementTransactionStatusAdviceV01>() {
		{
			validator = ConstraintInferredMatchingStatusStatusPresenceRule::checkSecuritiesSettlementTransactionStatusAdviceV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InferredMatchingStatusStatusPresenceRule";
			definition = "If ProcessingStatus, MatchingStatus and SettlementStatus are absent, the InferredMatchingStatus must be present.";
			owner_lazy = () -> SecuritiesSettlementTransactionStatusAdviceV01.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/InferredMatchingStatus</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ProcessingStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/MatchingStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/SettlementStatus</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV02
	 * SecuritiesSettlementTransactionStatusAdviceV02}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/InferredMatchingStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ProcessingStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/MatchingStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/SettlementStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InferredMatchingStatusStatusPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProcessingStatus, MatchingStatus and SettlementStatus are absent, the InferredMatchingStatus must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionStatusAdviceV02> forSecuritiesSettlementTransactionStatusAdviceV02 = new MMConstraint<SecuritiesSettlementTransactionStatusAdviceV02>() {
		{
			validator = ConstraintInferredMatchingStatusStatusPresenceRule::checkSecuritiesSettlementTransactionStatusAdviceV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InferredMatchingStatusStatusPresenceRule";
			definition = "If ProcessingStatus, MatchingStatus and SettlementStatus are absent, the InferredMatchingStatus must be present.";
			owner_lazy = () -> SecuritiesSettlementTransactionStatusAdviceV02.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/InferredMatchingStatus</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ProcessingStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/MatchingStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/SettlementStatus</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV03
	 * SecuritiesSettlementTransactionStatusAdviceV03}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/InferredMatchingStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ProcessingStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/MatchingStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/SettlementStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InferredMatchingStatusStatusPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProcessingStatus, MatchingStatus and SettlementStatus are absent, the InferredMatchingStatus must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionStatusAdviceV03> forSecuritiesSettlementTransactionStatusAdviceV03 = new MMConstraint<SecuritiesSettlementTransactionStatusAdviceV03>() {
		{
			validator = ConstraintInferredMatchingStatusStatusPresenceRule::checkSecuritiesSettlementTransactionStatusAdviceV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InferredMatchingStatusStatusPresenceRule";
			definition = "If ProcessingStatus, MatchingStatus and SettlementStatus are absent, the InferredMatchingStatus must be present.";
			owner_lazy = () -> SecuritiesSettlementTransactionStatusAdviceV03.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/InferredMatchingStatus</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ProcessingStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/MatchingStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/SettlementStatus</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV04
	 * SecuritiesSettlementTransactionStatusAdviceV04}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/InferredMatchingStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ProcessingStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/MatchingStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/SettlementStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InferredMatchingStatusStatusPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProcessingStatus, MatchingStatus and SettlementStatus are absent, the InferredMatchingStatus must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInferredMatchingStatusStatusPresenceRule#forSecuritiesSettlementTransactionStatusAdviceV05
	 * ConstraintInferredMatchingStatusStatusPresenceRule.
	 * forSecuritiesSettlementTransactionStatusAdviceV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionStatusAdviceV04> forSecuritiesSettlementTransactionStatusAdviceV04 = new MMConstraint<SecuritiesSettlementTransactionStatusAdviceV04>() {
		{
			validator = ConstraintInferredMatchingStatusStatusPresenceRule::checkSecuritiesSettlementTransactionStatusAdviceV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InferredMatchingStatusStatusPresenceRule";
			definition = "If ProcessingStatus, MatchingStatus and SettlementStatus are absent, the InferredMatchingStatus must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInferredMatchingStatusStatusPresenceRule.forSecuritiesSettlementTransactionStatusAdviceV05);
			owner_lazy = () -> SecuritiesSettlementTransactionStatusAdviceV04.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/InferredMatchingStatus</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ProcessingStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/MatchingStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/SettlementStatus</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV05
	 * SecuritiesSettlementTransactionStatusAdviceV05}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/InferredMatchingStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ProcessingStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/MatchingStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/SettlementStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InferredMatchingStatusStatusPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProcessingStatus, MatchingStatus and SettlementStatus are absent, the InferredMatchingStatus must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInferredMatchingStatusStatusPresenceRule#forSecuritiesSettlementTransactionStatusAdviceV06
	 * ConstraintInferredMatchingStatusStatusPresenceRule.
	 * forSecuritiesSettlementTransactionStatusAdviceV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInferredMatchingStatusStatusPresenceRule#forSecuritiesSettlementTransactionStatusAdviceV04
	 * ConstraintInferredMatchingStatusStatusPresenceRule.
	 * forSecuritiesSettlementTransactionStatusAdviceV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionStatusAdviceV05> forSecuritiesSettlementTransactionStatusAdviceV05 = new MMConstraint<SecuritiesSettlementTransactionStatusAdviceV05>() {
		{
			validator = ConstraintInferredMatchingStatusStatusPresenceRule::checkSecuritiesSettlementTransactionStatusAdviceV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InferredMatchingStatusStatusPresenceRule";
			definition = "If ProcessingStatus, MatchingStatus and SettlementStatus are absent, the InferredMatchingStatus must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInferredMatchingStatusStatusPresenceRule.forSecuritiesSettlementTransactionStatusAdviceV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintInferredMatchingStatusStatusPresenceRule.forSecuritiesSettlementTransactionStatusAdviceV04;
			owner_lazy = () -> SecuritiesSettlementTransactionStatusAdviceV05.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/InferredMatchingStatus</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ProcessingStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/MatchingStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/SettlementStatus</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV06
	 * SecuritiesSettlementTransactionStatusAdviceV06}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/InferredMatchingStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ProcessingStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/MatchingStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/SettlementStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InferredMatchingStatusStatusPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProcessingStatus, MatchingStatus and SettlementStatus are absent, the InferredMatchingStatus must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInferredMatchingStatusStatusPresenceRule#forSecuritiesSettlementTransactionStatusAdviceV07
	 * ConstraintInferredMatchingStatusStatusPresenceRule.
	 * forSecuritiesSettlementTransactionStatusAdviceV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInferredMatchingStatusStatusPresenceRule#forSecuritiesSettlementTransactionStatusAdviceV05
	 * ConstraintInferredMatchingStatusStatusPresenceRule.
	 * forSecuritiesSettlementTransactionStatusAdviceV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionStatusAdviceV06> forSecuritiesSettlementTransactionStatusAdviceV06 = new MMConstraint<SecuritiesSettlementTransactionStatusAdviceV06>() {
		{
			validator = ConstraintInferredMatchingStatusStatusPresenceRule::checkSecuritiesSettlementTransactionStatusAdviceV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InferredMatchingStatusStatusPresenceRule";
			definition = "If ProcessingStatus, MatchingStatus and SettlementStatus are absent, the InferredMatchingStatus must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInferredMatchingStatusStatusPresenceRule.forSecuritiesSettlementTransactionStatusAdviceV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintInferredMatchingStatusStatusPresenceRule.forSecuritiesSettlementTransactionStatusAdviceV05;
			owner_lazy = () -> SecuritiesSettlementTransactionStatusAdviceV06.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/InferredMatchingStatus</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ProcessingStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/MatchingStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/SettlementStatus</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV07
	 * SecuritiesSettlementTransactionStatusAdviceV07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/InferredMatchingStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ProcessingStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/MatchingStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/SettlementStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InferredMatchingStatusStatusPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProcessingStatus, MatchingStatus and SettlementStatus are absent, the InferredMatchingStatus must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInferredMatchingStatusStatusPresenceRule#forSecuritiesSettlementTransactionStatusAdviceV08
	 * ConstraintInferredMatchingStatusStatusPresenceRule.
	 * forSecuritiesSettlementTransactionStatusAdviceV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInferredMatchingStatusStatusPresenceRule#forSecuritiesSettlementTransactionStatusAdviceV06
	 * ConstraintInferredMatchingStatusStatusPresenceRule.
	 * forSecuritiesSettlementTransactionStatusAdviceV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionStatusAdviceV07> forSecuritiesSettlementTransactionStatusAdviceV07 = new MMConstraint<SecuritiesSettlementTransactionStatusAdviceV07>() {
		{
			validator = ConstraintInferredMatchingStatusStatusPresenceRule::checkSecuritiesSettlementTransactionStatusAdviceV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InferredMatchingStatusStatusPresenceRule";
			definition = "If ProcessingStatus, MatchingStatus and SettlementStatus are absent, the InferredMatchingStatus must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInferredMatchingStatusStatusPresenceRule.forSecuritiesSettlementTransactionStatusAdviceV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintInferredMatchingStatusStatusPresenceRule.forSecuritiesSettlementTransactionStatusAdviceV06;
			owner_lazy = () -> SecuritiesSettlementTransactionStatusAdviceV07.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/InferredMatchingStatus</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ProcessingStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/MatchingStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/SettlementStatus</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdvice002V07
	 * SecuritiesSettlementTransactionStatusAdvice002V07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/InferredMatchingStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ProcessingStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/MatchingStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/SettlementStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InferredMatchingStatusStatusPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProcessingStatus, MatchingStatus and SettlementStatus are absent, the InferredMatchingStatus must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionStatusAdvice002V07> forSecuritiesSettlementTransactionStatusAdvice002V07 = new MMConstraint<SecuritiesSettlementTransactionStatusAdvice002V07>() {
		{
			validator = ConstraintInferredMatchingStatusStatusPresenceRule::checkSecuritiesSettlementTransactionStatusAdvice002V07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InferredMatchingStatusStatusPresenceRule";
			definition = "If ProcessingStatus, MatchingStatus and SettlementStatus are absent, the InferredMatchingStatus must be present.";
			owner_lazy = () -> SecuritiesSettlementTransactionStatusAdvice002V07.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/InferredMatchingStatus</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ProcessingStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/MatchingStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/SettlementStatus</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};

	/**
	 * If ProcessingStatus, MatchingStatus and SettlementStatus are absent, the
	 * InferredMatchingStatus must be present.
	 */
	public static void checkSecuritiesSettlementTransactionStatusAdviceV09(SecuritiesSettlementTransactionStatusAdviceV09 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProcessingStatus, MatchingStatus and SettlementStatus are absent, the
	 * InferredMatchingStatus must be present.
	 */
	public static void checkSecuritiesSettlementTransactionStatusAdviceV08(SecuritiesSettlementTransactionStatusAdviceV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProcessingStatus, MatchingStatus and SettlementStatus are absent, the
	 * InferredMatchingStatus must be present.
	 */
	public static void checkSecuritiesSettlementTransactionStatusAdvice002V08(SecuritiesSettlementTransactionStatusAdvice002V08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProcessingStatus, MatchingStatus and SettlementStatus are absent, the
	 * InferredMatchingStatus must be present.
	 */
	public static void checkSecuritiesSettlementTransactionStatusAdviceV01(SecuritiesSettlementTransactionStatusAdviceV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProcessingStatus, MatchingStatus and SettlementStatus are absent, the
	 * InferredMatchingStatus must be present.
	 */
	public static void checkSecuritiesSettlementTransactionStatusAdviceV02(SecuritiesSettlementTransactionStatusAdviceV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProcessingStatus, MatchingStatus and SettlementStatus are absent, the
	 * InferredMatchingStatus must be present.
	 */
	public static void checkSecuritiesSettlementTransactionStatusAdviceV03(SecuritiesSettlementTransactionStatusAdviceV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProcessingStatus, MatchingStatus and SettlementStatus are absent, the
	 * InferredMatchingStatus must be present.
	 */
	public static void checkSecuritiesSettlementTransactionStatusAdviceV04(SecuritiesSettlementTransactionStatusAdviceV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProcessingStatus, MatchingStatus and SettlementStatus are absent, the
	 * InferredMatchingStatus must be present.
	 */
	public static void checkSecuritiesSettlementTransactionStatusAdviceV05(SecuritiesSettlementTransactionStatusAdviceV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProcessingStatus, MatchingStatus and SettlementStatus are absent, the
	 * InferredMatchingStatus must be present.
	 */
	public static void checkSecuritiesSettlementTransactionStatusAdviceV06(SecuritiesSettlementTransactionStatusAdviceV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProcessingStatus, MatchingStatus and SettlementStatus are absent, the
	 * InferredMatchingStatus must be present.
	 */
	public static void checkSecuritiesSettlementTransactionStatusAdviceV07(SecuritiesSettlementTransactionStatusAdviceV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProcessingStatus, MatchingStatus and SettlementStatus are absent, the
	 * InferredMatchingStatus must be present.
	 */
	public static void checkSecuritiesSettlementTransactionStatusAdvice002V07(SecuritiesSettlementTransactionStatusAdvice002V07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}