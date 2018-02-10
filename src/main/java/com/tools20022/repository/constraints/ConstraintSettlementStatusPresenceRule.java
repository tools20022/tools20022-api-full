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
 * If ProcessingStatus, InferredMatchingStatus and MatchingStatus are absent,
 * then SettlementStatus must be present.
 */
public class ConstraintSettlementStatusPresenceRule {

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
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SettlementStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ProcessingStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/MatchingStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/InferredMatchingStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStatusPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProcessingStatus, InferredMatchingStatus and MatchingStatus are absent, then SettlementStatus must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementStatusPresenceRule#forSecuritiesSettlementTransactionStatusAdviceV07
	 * ConstraintSettlementStatusPresenceRule.
	 * forSecuritiesSettlementTransactionStatusAdviceV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionStatusAdviceV08> forSecuritiesSettlementTransactionStatusAdviceV08 = new MMConstraint<SecuritiesSettlementTransactionStatusAdviceV08>() {
		{
			validator = ConstraintSettlementStatusPresenceRule::checkSecuritiesSettlementTransactionStatusAdviceV08;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatusPresenceRule";
			definition = "If ProcessingStatus, InferredMatchingStatus and MatchingStatus are absent, then SettlementStatus must be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementStatusPresenceRule.forSecuritiesSettlementTransactionStatusAdviceV07;
			owner_lazy = () -> SecuritiesSettlementTransactionStatusAdviceV08.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SettlementStatus</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ProcessingStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/MatchingStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/InferredMatchingStatus</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
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
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SettlementStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ProcessingStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/MatchingStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/InferredMatchingStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStatusPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProcessingStatus, InferredMatchingStatus and MatchingStatus are absent, then SettlementStatus must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionStatusAdvice002V08> forSecuritiesSettlementTransactionStatusAdvice002V08 = new MMConstraint<SecuritiesSettlementTransactionStatusAdvice002V08>() {
		{
			validator = ConstraintSettlementStatusPresenceRule::checkSecuritiesSettlementTransactionStatusAdvice002V08;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatusPresenceRule";
			definition = "If ProcessingStatus, InferredMatchingStatus and MatchingStatus are absent, then SettlementStatus must be present.";
			owner_lazy = () -> SecuritiesSettlementTransactionStatusAdvice002V08.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SettlementStatus</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ProcessingStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/MatchingStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/InferredMatchingStatus</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
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
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SettlementStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ProcessingStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/MatchingStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/InferredMatchingStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStatusPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProcessingStatus, InferredMatchingStatus and MatchingStatus are absent, then SettlementStatus must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementStatusPresenceRule#forSecuritiesSettlementTransactionStatusAdviceV08
	 * ConstraintSettlementStatusPresenceRule.
	 * forSecuritiesSettlementTransactionStatusAdviceV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementStatusPresenceRule#forSecuritiesSettlementTransactionStatusAdviceV06
	 * ConstraintSettlementStatusPresenceRule.
	 * forSecuritiesSettlementTransactionStatusAdviceV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionStatusAdviceV07> forSecuritiesSettlementTransactionStatusAdviceV07 = new MMConstraint<SecuritiesSettlementTransactionStatusAdviceV07>() {
		{
			validator = ConstraintSettlementStatusPresenceRule::checkSecuritiesSettlementTransactionStatusAdviceV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatusPresenceRule";
			definition = "If ProcessingStatus, InferredMatchingStatus and MatchingStatus are absent, then SettlementStatus must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementStatusPresenceRule.forSecuritiesSettlementTransactionStatusAdviceV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementStatusPresenceRule.forSecuritiesSettlementTransactionStatusAdviceV06;
			owner_lazy = () -> SecuritiesSettlementTransactionStatusAdviceV07.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SettlementStatus</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ProcessingStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/MatchingStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/InferredMatchingStatus</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
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
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SettlementStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ProcessingStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/MatchingStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/InferredMatchingStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStatusPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProcessingStatus, InferredMatchingStatus and MatchingStatus are absent, then SettlementStatus must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionStatusAdvice002V07> forSecuritiesSettlementTransactionStatusAdvice002V07 = new MMConstraint<SecuritiesSettlementTransactionStatusAdvice002V07>() {
		{
			validator = ConstraintSettlementStatusPresenceRule::checkSecuritiesSettlementTransactionStatusAdvice002V07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatusPresenceRule";
			definition = "If ProcessingStatus, InferredMatchingStatus and MatchingStatus are absent, then SettlementStatus must be present.";
			owner_lazy = () -> SecuritiesSettlementTransactionStatusAdvice002V07.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SettlementStatus</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ProcessingStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/MatchingStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/InferredMatchingStatus</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
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
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SettlementStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ProcessingStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/MatchingStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/InferredMatchingStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStatusPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProcessingStatus, InferredMatchingStatus and MatchingStatus are absent, then SettlementStatus must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionStatusAdviceV01> forSecuritiesSettlementTransactionStatusAdviceV01 = new MMConstraint<SecuritiesSettlementTransactionStatusAdviceV01>() {
		{
			validator = ConstraintSettlementStatusPresenceRule::checkSecuritiesSettlementTransactionStatusAdviceV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatusPresenceRule";
			definition = "If ProcessingStatus, InferredMatchingStatus and MatchingStatus are absent, then SettlementStatus must be present.";
			owner_lazy = () -> SecuritiesSettlementTransactionStatusAdviceV01.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SettlementStatus</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ProcessingStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/MatchingStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/InferredMatchingStatus</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
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
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SettlementStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ProcessingStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/MatchingStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/InferredMatchingStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStatusPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProcessingStatus, InferredMatchingStatus and MatchingStatus are absent, then SettlementStatus must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionStatusAdviceV02> forSecuritiesSettlementTransactionStatusAdviceV02 = new MMConstraint<SecuritiesSettlementTransactionStatusAdviceV02>() {
		{
			validator = ConstraintSettlementStatusPresenceRule::checkSecuritiesSettlementTransactionStatusAdviceV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatusPresenceRule";
			definition = "If ProcessingStatus, InferredMatchingStatus and MatchingStatus are absent, then SettlementStatus must be present.";
			owner_lazy = () -> SecuritiesSettlementTransactionStatusAdviceV02.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SettlementStatus</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ProcessingStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/MatchingStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/InferredMatchingStatus</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
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
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SettlementStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ProcessingStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/MatchingStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/InferredMatchingStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStatusPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProcessingStatus, InferredMatchingStatus and MatchingStatus are absent, then SettlementStatus must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionStatusAdviceV03> forSecuritiesSettlementTransactionStatusAdviceV03 = new MMConstraint<SecuritiesSettlementTransactionStatusAdviceV03>() {
		{
			validator = ConstraintSettlementStatusPresenceRule::checkSecuritiesSettlementTransactionStatusAdviceV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatusPresenceRule";
			definition = "If ProcessingStatus, InferredMatchingStatus and MatchingStatus are absent, then SettlementStatus must be present.";
			owner_lazy = () -> SecuritiesSettlementTransactionStatusAdviceV03.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SettlementStatus</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ProcessingStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/MatchingStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/InferredMatchingStatus</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
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
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SettlementStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ProcessingStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/MatchingStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/InferredMatchingStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStatusPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProcessingStatus, InferredMatchingStatus and MatchingStatus are absent, then SettlementStatus must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementStatusPresenceRule#forSecuritiesSettlementTransactionStatusAdviceV05
	 * ConstraintSettlementStatusPresenceRule.
	 * forSecuritiesSettlementTransactionStatusAdviceV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionStatusAdviceV04> forSecuritiesSettlementTransactionStatusAdviceV04 = new MMConstraint<SecuritiesSettlementTransactionStatusAdviceV04>() {
		{
			validator = ConstraintSettlementStatusPresenceRule::checkSecuritiesSettlementTransactionStatusAdviceV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatusPresenceRule";
			definition = "If ProcessingStatus, InferredMatchingStatus and MatchingStatus are absent, then SettlementStatus must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementStatusPresenceRule.forSecuritiesSettlementTransactionStatusAdviceV05);
			owner_lazy = () -> SecuritiesSettlementTransactionStatusAdviceV04.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SettlementStatus</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ProcessingStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/MatchingStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/InferredMatchingStatus</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
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
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SettlementStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ProcessingStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/MatchingStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/InferredMatchingStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStatusPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProcessingStatus, InferredMatchingStatus and MatchingStatus are absent, then SettlementStatus must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementStatusPresenceRule#forSecuritiesSettlementTransactionStatusAdviceV06
	 * ConstraintSettlementStatusPresenceRule.
	 * forSecuritiesSettlementTransactionStatusAdviceV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementStatusPresenceRule#forSecuritiesSettlementTransactionStatusAdviceV04
	 * ConstraintSettlementStatusPresenceRule.
	 * forSecuritiesSettlementTransactionStatusAdviceV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionStatusAdviceV05> forSecuritiesSettlementTransactionStatusAdviceV05 = new MMConstraint<SecuritiesSettlementTransactionStatusAdviceV05>() {
		{
			validator = ConstraintSettlementStatusPresenceRule::checkSecuritiesSettlementTransactionStatusAdviceV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatusPresenceRule";
			definition = "If ProcessingStatus, InferredMatchingStatus and MatchingStatus are absent, then SettlementStatus must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementStatusPresenceRule.forSecuritiesSettlementTransactionStatusAdviceV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementStatusPresenceRule.forSecuritiesSettlementTransactionStatusAdviceV04;
			owner_lazy = () -> SecuritiesSettlementTransactionStatusAdviceV05.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SettlementStatus</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ProcessingStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/MatchingStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/InferredMatchingStatus</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
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
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SettlementStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ProcessingStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/MatchingStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/InferredMatchingStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStatusPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProcessingStatus, InferredMatchingStatus and MatchingStatus are absent, then SettlementStatus must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementStatusPresenceRule#forSecuritiesSettlementTransactionStatusAdviceV07
	 * ConstraintSettlementStatusPresenceRule.
	 * forSecuritiesSettlementTransactionStatusAdviceV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementStatusPresenceRule#forSecuritiesSettlementTransactionStatusAdviceV05
	 * ConstraintSettlementStatusPresenceRule.
	 * forSecuritiesSettlementTransactionStatusAdviceV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionStatusAdviceV06> forSecuritiesSettlementTransactionStatusAdviceV06 = new MMConstraint<SecuritiesSettlementTransactionStatusAdviceV06>() {
		{
			validator = ConstraintSettlementStatusPresenceRule::checkSecuritiesSettlementTransactionStatusAdviceV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatusPresenceRule";
			definition = "If ProcessingStatus, InferredMatchingStatus and MatchingStatus are absent, then SettlementStatus must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementStatusPresenceRule.forSecuritiesSettlementTransactionStatusAdviceV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementStatusPresenceRule.forSecuritiesSettlementTransactionStatusAdviceV05;
			owner_lazy = () -> SecuritiesSettlementTransactionStatusAdviceV06.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/SettlementStatus</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ProcessingStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/MatchingStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/InferredMatchingStatus</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};

	/**
	 * If ProcessingStatus, InferredMatchingStatus and MatchingStatus are
	 * absent, then SettlementStatus must be present.
	 */
	public static void checkSecuritiesSettlementTransactionStatusAdviceV08(SecuritiesSettlementTransactionStatusAdviceV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProcessingStatus, InferredMatchingStatus and MatchingStatus are
	 * absent, then SettlementStatus must be present.
	 */
	public static void checkSecuritiesSettlementTransactionStatusAdvice002V08(SecuritiesSettlementTransactionStatusAdvice002V08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProcessingStatus, InferredMatchingStatus and MatchingStatus are
	 * absent, then SettlementStatus must be present.
	 */
	public static void checkSecuritiesSettlementTransactionStatusAdviceV07(SecuritiesSettlementTransactionStatusAdviceV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProcessingStatus, InferredMatchingStatus and MatchingStatus are
	 * absent, then SettlementStatus must be present.
	 */
	public static void checkSecuritiesSettlementTransactionStatusAdvice002V07(SecuritiesSettlementTransactionStatusAdvice002V07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProcessingStatus, InferredMatchingStatus and MatchingStatus are
	 * absent, then SettlementStatus must be present.
	 */
	public static void checkSecuritiesSettlementTransactionStatusAdviceV01(SecuritiesSettlementTransactionStatusAdviceV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProcessingStatus, InferredMatchingStatus and MatchingStatus are
	 * absent, then SettlementStatus must be present.
	 */
	public static void checkSecuritiesSettlementTransactionStatusAdviceV02(SecuritiesSettlementTransactionStatusAdviceV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProcessingStatus, InferredMatchingStatus and MatchingStatus are
	 * absent, then SettlementStatus must be present.
	 */
	public static void checkSecuritiesSettlementTransactionStatusAdviceV03(SecuritiesSettlementTransactionStatusAdviceV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProcessingStatus, InferredMatchingStatus and MatchingStatus are
	 * absent, then SettlementStatus must be present.
	 */
	public static void checkSecuritiesSettlementTransactionStatusAdviceV04(SecuritiesSettlementTransactionStatusAdviceV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProcessingStatus, InferredMatchingStatus and MatchingStatus are
	 * absent, then SettlementStatus must be present.
	 */
	public static void checkSecuritiesSettlementTransactionStatusAdviceV05(SecuritiesSettlementTransactionStatusAdviceV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProcessingStatus, InferredMatchingStatus and MatchingStatus are
	 * absent, then SettlementStatus must be present.
	 */
	public static void checkSecuritiesSettlementTransactionStatusAdviceV06(SecuritiesSettlementTransactionStatusAdviceV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}