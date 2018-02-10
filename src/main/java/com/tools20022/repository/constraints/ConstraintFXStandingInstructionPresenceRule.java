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
 * If HoldIndicator is present and is value TRUE (Yes), then
 * FXStandingInstruction must be absent.
 */
public class ConstraintFXStandingInstructionPresenceRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails3
	 * SettlementDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/FXStandingInstruction&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/HoldIndicator&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/HoldIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FXStandingInstructionPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If HoldIndicator is present and is value TRUE (Yes), then FXStandingInstruction must be absent."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails3> forSettlementDetails3 = new MMConstraint<SettlementDetails3>() {
		{
			validator = ConstraintFXStandingInstructionPresenceRule::checkSettlementDetails3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FXStandingInstructionPresenceRule";
			definition = "If HoldIndicator is present and is value TRUE (Yes), then FXStandingInstruction must be absent.";
			owner_lazy = () -> SettlementDetails3.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/FXStandingInstruction</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/HoldIndicator</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/HoldIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails16
	 * SettlementDetails16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/FXStandingInstruction&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/HoldIndicator&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/HoldIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FXStandingInstructionPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If HoldIndicator is present and is value TRUE (Yes), then FXStandingInstruction must be absent."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails16> forSettlementDetails16 = new MMConstraint<SettlementDetails16>() {
		{
			validator = ConstraintFXStandingInstructionPresenceRule::checkSettlementDetails16;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FXStandingInstructionPresenceRule";
			definition = "If HoldIndicator is present and is value TRUE (Yes), then FXStandingInstruction must be absent.";
			owner_lazy = () -> SettlementDetails16.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/FXStandingInstruction</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/HoldIndicator</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/HoldIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails31
	 * SettlementDetails31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/FXStandingInstruction&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/HoldIndicator&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/HoldIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FXStandingInstructionPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If HoldIndicator is present and is value TRUE (Yes), then FXStandingInstruction must be absent."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails31> forSettlementDetails31 = new MMConstraint<SettlementDetails31>() {
		{
			validator = ConstraintFXStandingInstructionPresenceRule::checkSettlementDetails31;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FXStandingInstructionPresenceRule";
			definition = "If HoldIndicator is present and is value TRUE (Yes), then FXStandingInstruction must be absent.";
			owner_lazy = () -> SettlementDetails31.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/FXStandingInstruction</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/HoldIndicator</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/HoldIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails40
	 * SettlementDetails40}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/FXStandingInstruction&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/HoldIndicator&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/HoldIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FXStandingInstructionPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If HoldIndicator is present and is value TRUE (Yes), then FXStandingInstruction must be absent."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails40> forSettlementDetails40 = new MMConstraint<SettlementDetails40>() {
		{
			validator = ConstraintFXStandingInstructionPresenceRule::checkSettlementDetails40;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FXStandingInstructionPresenceRule";
			definition = "If HoldIndicator is present and is value TRUE (Yes), then FXStandingInstruction must be absent.";
			owner_lazy = () -> SettlementDetails40.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/FXStandingInstruction</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/HoldIndicator</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/HoldIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails62
	 * SettlementDetails62}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/FXStandingInstruction&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/HoldIndicator&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/HoldIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FXStandingInstructionPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If HoldIndicator is present and is value TRUE (Yes), then FXStandingInstruction must be absent."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFXStandingInstructionPresenceRule#forSettlementDetails72
	 * ConstraintFXStandingInstructionPresenceRule.forSettlementDetails72}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails62> forSettlementDetails62 = new MMConstraint<SettlementDetails62>() {
		{
			validator = ConstraintFXStandingInstructionPresenceRule::checkSettlementDetails62;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FXStandingInstructionPresenceRule";
			definition = "If HoldIndicator is present and is value TRUE (Yes), then FXStandingInstruction must be absent.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintFXStandingInstructionPresenceRule.forSettlementDetails72);
			owner_lazy = () -> SettlementDetails62.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/FXStandingInstruction</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/HoldIndicator</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/HoldIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails63
	 * SettlementDetails63}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/FXStandingInstruction&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/HoldIndicator&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/HoldIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FXStandingInstructionPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If HoldIndicator is present and is value TRUE (Yes), then FXStandingInstruction must be absent."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails63> forSettlementDetails63 = new MMConstraint<SettlementDetails63>() {
		{
			validator = ConstraintFXStandingInstructionPresenceRule::checkSettlementDetails63;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FXStandingInstructionPresenceRule";
			definition = "If HoldIndicator is present and is value TRUE (Yes), then FXStandingInstruction must be absent.";
			owner_lazy = () -> SettlementDetails63.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/FXStandingInstruction</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/HoldIndicator</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/HoldIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails1
	 * SettlementDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/FXStandingInstruction&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/HoldIndicator&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/HoldIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FXStandingInstructionPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If HoldIndicator is present and is value TRUE (Yes), then FXStandingInstruction must not be present. In ISO 15022, and therefore in ISO 20022, the FXStandingInstruction indicator can only be used when the transation is instructed in a released mode."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails1> forSettlementDetails1 = new MMConstraint<SettlementDetails1>() {
		{
			validator = ConstraintFXStandingInstructionPresenceRule::checkSettlementDetails1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FXStandingInstructionPresenceRule";
			definition = "If HoldIndicator is present and is value TRUE (Yes), then FXStandingInstruction must not be present. In ISO 15022, and therefore in ISO 20022, the FXStandingInstruction indicator can only be used when the transation is instructed in a released mode.";
			owner_lazy = () -> SettlementDetails1.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/FXStandingInstruction</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/HoldIndicator</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/HoldIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails19
	 * SettlementDetails19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/FXStandingInstruction&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/HoldIndicator&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/HoldIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FXStandingInstructionPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If HoldIndicator is present and is value TRUE (Yes), then FXStandingInstruction must not be present. In ISO 15022, and therefore in ISO 20022, the FXStandingInstruction indicator can only be used when the transation is instructed in a released mode."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails19> forSettlementDetails19 = new MMConstraint<SettlementDetails19>() {
		{
			validator = ConstraintFXStandingInstructionPresenceRule::checkSettlementDetails19;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FXStandingInstructionPresenceRule";
			definition = "If HoldIndicator is present and is value TRUE (Yes), then FXStandingInstruction must not be present. In ISO 15022, and therefore in ISO 20022, the FXStandingInstruction indicator can only be used when the transation is instructed in a released mode.";
			owner_lazy = () -> SettlementDetails19.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/FXStandingInstruction</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/HoldIndicator</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/HoldIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails22
	 * SettlementDetails22}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/FXStandingInstruction&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/HoldIndicator&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/HoldIndicator/Indicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FXStandingInstructionPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If HoldIndicator is present and is value TRUE (Yes), then FXStandingInstruction must not be present. In ISO 15022,\r\nand therefore in ISO 20022, the FXStandingInstruction indicator can only be used when the transation is instructed\r\nin a released mode."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails22> forSettlementDetails22 = new MMConstraint<SettlementDetails22>() {
		{
			validator = ConstraintFXStandingInstructionPresenceRule::checkSettlementDetails22;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FXStandingInstructionPresenceRule";
			definition = "If HoldIndicator is present and is value TRUE (Yes), then FXStandingInstruction must not be present. In ISO 15022,\r\nand therefore in ISO 20022, the FXStandingInstruction indicator can only be used when the transation is instructed\r\nin a released mode.";
			owner_lazy = () -> SettlementDetails22.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/FXStandingInstruction</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/HoldIndicator</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/HoldIndicator/Indicator</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails35
	 * SettlementDetails35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/FXStandingInstruction&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/HoldIndicator&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/HoldIndicator/Indicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FXStandingInstructionPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If HoldIndicator is present and is value TRUE (Yes), then FXStandingInstruction must not be present. In ISO 15022,\r\nand therefore in ISO 20022, the FXStandingInstruction indicator can only be used when the transation is instructed\r\nin a released mode."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails35> forSettlementDetails35 = new MMConstraint<SettlementDetails35>() {
		{
			validator = ConstraintFXStandingInstructionPresenceRule::checkSettlementDetails35;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FXStandingInstructionPresenceRule";
			definition = "If HoldIndicator is present and is value TRUE (Yes), then FXStandingInstruction must not be present. In ISO 15022,\r\nand therefore in ISO 20022, the FXStandingInstruction indicator can only be used when the transation is instructed\r\nin a released mode.";
			owner_lazy = () -> SettlementDetails35.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/FXStandingInstruction</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/HoldIndicator</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/HoldIndicator/Indicator</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42
	 * SettlementDetails42}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/FXStandingInstruction&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/HoldIndicator&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/HoldIndicator/Indicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FXStandingInstructionPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If HoldIndicator is present and is value TRUE (Yes), then FXStandingInstruction must not be present. In ISO 15022,\r\nand therefore in ISO 20022, the FXStandingInstruction indicator can only be used when the transation is instructed\r\nin a released mode."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFXStandingInstructionPresenceRule#forSettlementDetails67
	 * ConstraintFXStandingInstructionPresenceRule.forSettlementDetails67}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails42> forSettlementDetails42 = new MMConstraint<SettlementDetails42>() {
		{
			validator = ConstraintFXStandingInstructionPresenceRule::checkSettlementDetails42;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FXStandingInstructionPresenceRule";
			definition = "If HoldIndicator is present and is value TRUE (Yes), then FXStandingInstruction must not be present. In ISO 15022,\r\nand therefore in ISO 20022, the FXStandingInstruction indicator can only be used when the transation is instructed\r\nin a released mode.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintFXStandingInstructionPresenceRule.forSettlementDetails67);
			owner_lazy = () -> SettlementDetails42.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/FXStandingInstruction</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/HoldIndicator</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/HoldIndicator/Indicator</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails52
	 * SettlementDetails52}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/FXStandingInstruction&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/HoldIndicator&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/HoldIndicator/Indicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FXStandingInstructionPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If HoldIndicator is present and is value TRUE (Yes), then FXStandingInstruction must not be present. In ISO 15022,\r\nand therefore in ISO 20022, the FXStandingInstruction indicator can only be used when the transation is instructed\r\nin a released mode."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails52> forSettlementDetails52 = new MMConstraint<SettlementDetails52>() {
		{
			validator = ConstraintFXStandingInstructionPresenceRule::checkSettlementDetails52;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FXStandingInstructionPresenceRule";
			definition = "If HoldIndicator is present and is value TRUE (Yes), then FXStandingInstruction must not be present. In ISO 15022,\r\nand therefore in ISO 20022, the FXStandingInstruction indicator can only be used when the transation is instructed\r\nin a released mode.";
			owner_lazy = () -> SettlementDetails52.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/FXStandingInstruction</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/HoldIndicator</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/HoldIndicator/Indicator</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43
	 * SettlementDetails43}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/FXStandingInstruction&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/HoldIndicator&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/HoldIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FXStandingInstructionPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If HoldIndicator is present and is value TRUE (Yes), then FXStandingInstruction must not be present. In ISO 15022, and therefore in ISO 20022, the FXStandingInstruction indicator can only be used when the transation is instructed in a released mode."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails43> forSettlementDetails43 = new MMConstraint<SettlementDetails43>() {
		{
			validator = ConstraintFXStandingInstructionPresenceRule::checkSettlementDetails43;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FXStandingInstructionPresenceRule";
			definition = "If HoldIndicator is present and is value TRUE (Yes), then FXStandingInstruction must not be present. In ISO 15022, and therefore in ISO 20022, the FXStandingInstruction indicator can only be used when the transation is instructed in a released mode.";
			owner_lazy = () -> SettlementDetails43.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/FXStandingInstruction</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/HoldIndicator</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/HoldIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails65
	 * SettlementDetails65}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/FXStandingInstruction&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/HoldIndicator&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/HoldIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FXStandingInstructionPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If HoldIndicator is present and is value TRUE (Yes), then FXStandingInstruction must be absent."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails65> forSettlementDetails65 = new MMConstraint<SettlementDetails65>() {
		{
			validator = ConstraintFXStandingInstructionPresenceRule::checkSettlementDetails65;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FXStandingInstructionPresenceRule";
			definition = "If HoldIndicator is present and is value TRUE (Yes), then FXStandingInstruction must be absent.";
			owner_lazy = () -> SettlementDetails65.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/FXStandingInstruction</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/HoldIndicator</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/HoldIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67
	 * SettlementDetails67}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/FXStandingInstruction&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/HoldIndicator&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/HoldIndicator/Indicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FXStandingInstructionPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If HoldIndicator is present and is value TRUE (Yes), then FXStandingInstruction must not be present. In ISO 15022,\r\nand therefore in ISO 20022, the FXStandingInstruction indicator can only be used when the transation is instructed\r\nin a released mode."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFXStandingInstructionPresenceRule#forSettlementDetails93
	 * ConstraintFXStandingInstructionPresenceRule.forSettlementDetails93}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFXStandingInstructionPresenceRule#forSettlementDetails42
	 * ConstraintFXStandingInstructionPresenceRule.forSettlementDetails42}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails67> forSettlementDetails67 = new MMConstraint<SettlementDetails67>() {
		{
			validator = ConstraintFXStandingInstructionPresenceRule::checkSettlementDetails67;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FXStandingInstructionPresenceRule";
			definition = "If HoldIndicator is present and is value TRUE (Yes), then FXStandingInstruction must not be present. In ISO 15022,\r\nand therefore in ISO 20022, the FXStandingInstruction indicator can only be used when the transation is instructed\r\nin a released mode.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintFXStandingInstructionPresenceRule.forSettlementDetails93);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintFXStandingInstructionPresenceRule.forSettlementDetails42;
			owner_lazy = () -> SettlementDetails67.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/FXStandingInstruction</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/HoldIndicator</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/HoldIndicator/Indicator</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails72
	 * SettlementDetails72}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/FXStandingInstruction&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/HoldIndicator&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/HoldIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FXStandingInstructionPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If HoldIndicator is present and is value TRUE (Yes), then FXStandingInstruction must be absent."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFXStandingInstructionPresenceRule#forSettlementDetails97
	 * ConstraintFXStandingInstructionPresenceRule.forSettlementDetails97}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFXStandingInstructionPresenceRule#forSettlementDetails62
	 * ConstraintFXStandingInstructionPresenceRule.forSettlementDetails62}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails72> forSettlementDetails72 = new MMConstraint<SettlementDetails72>() {
		{
			validator = ConstraintFXStandingInstructionPresenceRule::checkSettlementDetails72;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FXStandingInstructionPresenceRule";
			definition = "If HoldIndicator is present and is value TRUE (Yes), then FXStandingInstruction must be absent.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintFXStandingInstructionPresenceRule.forSettlementDetails97);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintFXStandingInstructionPresenceRule.forSettlementDetails62;
			owner_lazy = () -> SettlementDetails72.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/FXStandingInstruction</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/HoldIndicator</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/HoldIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails81
	 * SettlementDetails81}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/FXStandingInstruction&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/HoldIndicator&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/HoldIndicator/Indicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FXStandingInstructionPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If HoldIndicator is present and is value TRUE (Yes), then FXStandingInstruction must not be present. In ISO 15022,\r\nand therefore in ISO 20022, the FXStandingInstruction indicator can only be used when the transation is instructed\r\nin a released mode."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails81> forSettlementDetails81 = new MMConstraint<SettlementDetails81>() {
		{
			validator = ConstraintFXStandingInstructionPresenceRule::checkSettlementDetails81;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FXStandingInstructionPresenceRule";
			definition = "If HoldIndicator is present and is value TRUE (Yes), then FXStandingInstruction must not be present. In ISO 15022,\r\nand therefore in ISO 20022, the FXStandingInstruction indicator can only be used when the transation is instructed\r\nin a released mode.";
			owner_lazy = () -> SettlementDetails81.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/FXStandingInstruction</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/HoldIndicator</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/HoldIndicator/Indicator</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails78
	 * SettlementDetails78}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/FXStandingInstruction&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/HoldIndicator&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/HoldIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FXStandingInstructionPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If HoldIndicator is present and is value TRUE (Yes), then FXStandingInstruction must be absent."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails78> forSettlementDetails78 = new MMConstraint<SettlementDetails78>() {
		{
			validator = ConstraintFXStandingInstructionPresenceRule::checkSettlementDetails78;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FXStandingInstructionPresenceRule";
			definition = "If HoldIndicator is present and is value TRUE (Yes), then FXStandingInstruction must be absent.";
			owner_lazy = () -> SettlementDetails78.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/FXStandingInstruction</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/HoldIndicator</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/HoldIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails77
	 * SettlementDetails77}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/FXStandingInstruction&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/HoldIndicator&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/HoldIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FXStandingInstructionPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If HoldIndicator is present and is value TRUE (Yes), then FXStandingInstruction must be absent."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails77> forSettlementDetails77 = new MMConstraint<SettlementDetails77>() {
		{
			validator = ConstraintFXStandingInstructionPresenceRule::checkSettlementDetails77;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FXStandingInstructionPresenceRule";
			definition = "If HoldIndicator is present and is value TRUE (Yes), then FXStandingInstruction must be absent.";
			owner_lazy = () -> SettlementDetails77.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/FXStandingInstruction</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/HoldIndicator</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/HoldIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93
	 * SettlementDetails93}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/FXStandingInstruction&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/HoldIndicator&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/HoldIndicator/Indicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FXStandingInstructionPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If HoldIndicator is present and is value TRUE (Yes), then FXStandingInstruction must not be present. In ISO 15022,\r\nand therefore in ISO 20022, the FXStandingInstruction indicator can only be used when the transation is instructed\r\nin a released mode."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFXStandingInstructionPresenceRule#forSettlementDetails101
	 * ConstraintFXStandingInstructionPresenceRule.forSettlementDetails101}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFXStandingInstructionPresenceRule#forSettlementDetails119
	 * ConstraintFXStandingInstructionPresenceRule.forSettlementDetails119}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFXStandingInstructionPresenceRule#forSettlementDetails67
	 * ConstraintFXStandingInstructionPresenceRule.forSettlementDetails67}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails93> forSettlementDetails93 = new MMConstraint<SettlementDetails93>() {
		{
			validator = ConstraintFXStandingInstructionPresenceRule::checkSettlementDetails93;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FXStandingInstructionPresenceRule";
			definition = "If HoldIndicator is present and is value TRUE (Yes), then FXStandingInstruction must not be present. In ISO 15022,\r\nand therefore in ISO 20022, the FXStandingInstruction indicator can only be used when the transation is instructed\r\nin a released mode.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintFXStandingInstructionPresenceRule.forSettlementDetails101,
					com.tools20022.repository.constraints.ConstraintFXStandingInstructionPresenceRule.forSettlementDetails119);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintFXStandingInstructionPresenceRule.forSettlementDetails67;
			owner_lazy = () -> SettlementDetails93.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/FXStandingInstruction</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/HoldIndicator</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/HoldIndicator/Indicator</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97
	 * SettlementDetails97}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/FXStandingInstruction&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/HoldIndicator&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/HoldIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FXStandingInstructionPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If HoldIndicator is present and is value TRUE (Yes), then FXStandingInstruction must be absent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFXStandingInstructionPresenceRule#forSettlementDetails72
	 * ConstraintFXStandingInstructionPresenceRule.forSettlementDetails72}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails97> forSettlementDetails97 = new MMConstraint<SettlementDetails97>() {
		{
			validator = ConstraintFXStandingInstructionPresenceRule::checkSettlementDetails97;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FXStandingInstructionPresenceRule";
			definition = "If HoldIndicator is present and is value TRUE (Yes), then FXStandingInstruction must be absent.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintFXStandingInstructionPresenceRule.forSettlementDetails72;
			owner_lazy = () -> SettlementDetails97.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/FXStandingInstruction</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/HoldIndicator</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/HoldIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails101
	 * SettlementDetails101}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/FXStandingInstruction&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/HoldIndicator&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/HoldIndicator/Indicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FXStandingInstructionPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If HoldIndicator is present and is value TRUE (Yes), then FXStandingInstruction must not be present. In ISO 15022,\r\nand therefore in ISO 20022, the FXStandingInstruction indicator can only be used when the transation is instructed\r\nin a released mode."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFXStandingInstructionPresenceRule#forSettlementDetails120
	 * ConstraintFXStandingInstructionPresenceRule.forSettlementDetails120}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFXStandingInstructionPresenceRule#forSettlementDetails93
	 * ConstraintFXStandingInstructionPresenceRule.forSettlementDetails93}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails101> forSettlementDetails101 = new MMConstraint<SettlementDetails101>() {
		{
			validator = ConstraintFXStandingInstructionPresenceRule::checkSettlementDetails101;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FXStandingInstructionPresenceRule";
			definition = "If HoldIndicator is present and is value TRUE (Yes), then FXStandingInstruction must not be present. In ISO 15022,\r\nand therefore in ISO 20022, the FXStandingInstruction indicator can only be used when the transation is instructed\r\nin a released mode.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintFXStandingInstructionPresenceRule.forSettlementDetails120);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintFXStandingInstructionPresenceRule.forSettlementDetails93;
			owner_lazy = () -> SettlementDetails101.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/FXStandingInstruction</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/HoldIndicator</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/HoldIndicator/Indicator</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails105
	 * SettlementDetails105}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/FXStandingInstruction&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/HoldIndicator&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/HoldIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FXStandingInstructionPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If HoldIndicator is present and is value TRUE (Yes), then FXStandingInstruction must be absent."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails105> forSettlementDetails105 = new MMConstraint<SettlementDetails105>() {
		{
			validator = ConstraintFXStandingInstructionPresenceRule::checkSettlementDetails105;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FXStandingInstructionPresenceRule";
			definition = "If HoldIndicator is present and is value TRUE (Yes), then FXStandingInstruction must be absent.";
			owner_lazy = () -> SettlementDetails105.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/FXStandingInstruction</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/HoldIndicator</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/HoldIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails106
	 * SettlementDetails106}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/FXStandingInstruction&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/HoldIndicator&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/HoldIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FXStandingInstructionPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If HoldIndicator is present and is value TRUE (Yes), then FXStandingInstruction must be absent."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails106> forSettlementDetails106 = new MMConstraint<SettlementDetails106>() {
		{
			validator = ConstraintFXStandingInstructionPresenceRule::checkSettlementDetails106;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FXStandingInstructionPresenceRule";
			definition = "If HoldIndicator is present and is value TRUE (Yes), then FXStandingInstruction must be absent.";
			owner_lazy = () -> SettlementDetails106.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/FXStandingInstruction</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/HoldIndicator</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/HoldIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails111
	 * SettlementDetails111}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/FXStandingInstruction&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/HoldIndicator&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/HoldIndicator/Indicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FXStandingInstructionPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If HoldIndicator is present and is value TRUE (Yes), then FXStandingInstruction must not be present. In ISO 15022,\r\nand therefore in ISO 20022, the FXStandingInstruction indicator can only be used when the transation is instructed\r\nin a released mode."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails111> forSettlementDetails111 = new MMConstraint<SettlementDetails111>() {
		{
			validator = ConstraintFXStandingInstructionPresenceRule::checkSettlementDetails111;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FXStandingInstructionPresenceRule";
			definition = "If HoldIndicator is present and is value TRUE (Yes), then FXStandingInstruction must not be present. In ISO 15022,\r\nand therefore in ISO 20022, the FXStandingInstruction indicator can only be used when the transation is instructed\r\nin a released mode.";
			owner_lazy = () -> SettlementDetails111.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/FXStandingInstruction</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/HoldIndicator</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/HoldIndicator/Indicator</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails112
	 * SettlementDetails112}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/FXStandingInstruction&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/HoldIndicator&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/HoldIndicator/Indicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FXStandingInstructionPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If HoldIndicator is present and is value TRUE (Yes), then FXStandingInstruction must not be present. In ISO 15022,\r\nand therefore in ISO 20022, the FXStandingInstruction indicator can only be used when the transation is instructed\r\nin a released mode."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails112> forSettlementDetails112 = new MMConstraint<SettlementDetails112>() {
		{
			validator = ConstraintFXStandingInstructionPresenceRule::checkSettlementDetails112;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FXStandingInstructionPresenceRule";
			definition = "If HoldIndicator is present and is value TRUE (Yes), then FXStandingInstruction must not be present. In ISO 15022,\r\nand therefore in ISO 20022, the FXStandingInstruction indicator can only be used when the transation is instructed\r\nin a released mode.";
			owner_lazy = () -> SettlementDetails112.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/FXStandingInstruction</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/HoldIndicator</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/HoldIndicator/Indicator</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120
	 * SettlementDetails120}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/FXStandingInstruction&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/HoldIndicator&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/HoldIndicator/Indicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FXStandingInstructionPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If HoldIndicator is present and is value TRUE (Yes), then FXStandingInstruction must not be present. In ISO 15022,\r\nand therefore in ISO 20022, the FXStandingInstruction indicator can only be used when the transation is instructed\r\nin a released mode."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFXStandingInstructionPresenceRule#forSettlementDetails101
	 * ConstraintFXStandingInstructionPresenceRule.forSettlementDetails101}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails120> forSettlementDetails120 = new MMConstraint<SettlementDetails120>() {
		{
			validator = ConstraintFXStandingInstructionPresenceRule::checkSettlementDetails120;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FXStandingInstructionPresenceRule";
			definition = "If HoldIndicator is present and is value TRUE (Yes), then FXStandingInstruction must not be present. In ISO 15022,\r\nand therefore in ISO 20022, the FXStandingInstruction indicator can only be used when the transation is instructed\r\nin a released mode.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintFXStandingInstructionPresenceRule.forSettlementDetails101;
			owner_lazy = () -> SettlementDetails120.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/FXStandingInstruction</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/HoldIndicator</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/HoldIndicator/Indicator</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119
	 * SettlementDetails119}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/FXStandingInstruction&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/HoldIndicator&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/HoldIndicator/Indicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FXStandingInstructionPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If HoldIndicator is present and is value TRUE (Yes), then FXStandingInstruction must not be present. In ISO 15022,\r\nand therefore in ISO 20022, the FXStandingInstruction indicator can only be used when the transation is instructed\r\nin a released mode."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFXStandingInstructionPresenceRule#forSettlementDetails93
	 * ConstraintFXStandingInstructionPresenceRule.forSettlementDetails93}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails119> forSettlementDetails119 = new MMConstraint<SettlementDetails119>() {
		{
			validator = ConstraintFXStandingInstructionPresenceRule::checkSettlementDetails119;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FXStandingInstructionPresenceRule";
			definition = "If HoldIndicator is present and is value TRUE (Yes), then FXStandingInstruction must not be present. In ISO 15022,\r\nand therefore in ISO 20022, the FXStandingInstruction indicator can only be used when the transation is instructed\r\nin a released mode.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintFXStandingInstructionPresenceRule.forSettlementDetails93;
			owner_lazy = () -> SettlementDetails119.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/FXStandingInstruction</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/HoldIndicator</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/HoldIndicator/Indicator</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails137
	 * SettlementDetails137}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/FXStandingInstruction&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/HoldIndicator&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/HoldIndicator/Indicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FXStandingInstructionPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If HoldIndicator is present and is value TRUE (Yes), then FXStandingInstruction must not be present. In ISO 15022,\r\nand therefore in ISO 20022, the FXStandingInstruction indicator can only be used when the transation is instructed\r\nin a released mode."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails137> forSettlementDetails137 = new MMConstraint<SettlementDetails137>() {
		{
			validator = ConstraintFXStandingInstructionPresenceRule::checkSettlementDetails137;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FXStandingInstructionPresenceRule";
			definition = "If HoldIndicator is present and is value TRUE (Yes), then FXStandingInstruction must not be present. In ISO 15022,\r\nand therefore in ISO 20022, the FXStandingInstruction indicator can only be used when the transation is instructed\r\nin a released mode.";
			owner_lazy = () -> SettlementDetails137.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/FXStandingInstruction</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/HoldIndicator</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/HoldIndicator/Indicator</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails132
	 * SettlementDetails132}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/FXStandingInstruction&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/HoldIndicator&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/HoldIndicator/Indicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FXStandingInstructionPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If HoldIndicator is present and is value TRUE (Yes), then FXStandingInstruction must not be present. In ISO 15022,\r\nand therefore in ISO 20022, the FXStandingInstruction indicator can only be used when the transation is instructed\r\nin a released mode."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails132> forSettlementDetails132 = new MMConstraint<SettlementDetails132>() {
		{
			validator = ConstraintFXStandingInstructionPresenceRule::checkSettlementDetails132;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FXStandingInstructionPresenceRule";
			definition = "If HoldIndicator is present and is value TRUE (Yes), then FXStandingInstruction must not be present. In ISO 15022,\r\nand therefore in ISO 20022, the FXStandingInstruction indicator can only be used when the transation is instructed\r\nin a released mode.";
			owner_lazy = () -> SettlementDetails132.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/FXStandingInstruction</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/HoldIndicator</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/HoldIndicator/Indicator</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};

	/**
	 * If HoldIndicator is present and is value TRUE (Yes), then
	 * FXStandingInstruction must be absent.
	 */
	public static void checkSettlementDetails3(SettlementDetails3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If HoldIndicator is present and is value TRUE (Yes), then
	 * FXStandingInstruction must be absent.
	 */
	public static void checkSettlementDetails16(SettlementDetails16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If HoldIndicator is present and is value TRUE (Yes), then
	 * FXStandingInstruction must be absent.
	 */
	public static void checkSettlementDetails31(SettlementDetails31 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If HoldIndicator is present and is value TRUE (Yes), then
	 * FXStandingInstruction must be absent.
	 */
	public static void checkSettlementDetails40(SettlementDetails40 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If HoldIndicator is present and is value TRUE (Yes), then
	 * FXStandingInstruction must be absent.
	 */
	public static void checkSettlementDetails62(SettlementDetails62 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If HoldIndicator is present and is value TRUE (Yes), then
	 * FXStandingInstruction must be absent.
	 */
	public static void checkSettlementDetails63(SettlementDetails63 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If HoldIndicator is present and is value TRUE (Yes), then
	 * FXStandingInstruction must not be present. In ISO 15022, and therefore in
	 * ISO 20022, the FXStandingInstruction indicator can only be used when the
	 * transation is instructed in a released mode.
	 */
	public static void checkSettlementDetails1(SettlementDetails1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If HoldIndicator is present and is value TRUE (Yes), then
	 * FXStandingInstruction must not be present. In ISO 15022, and therefore in
	 * ISO 20022, the FXStandingInstruction indicator can only be used when the
	 * transation is instructed in a released mode.
	 */
	public static void checkSettlementDetails19(SettlementDetails19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If HoldIndicator is present and is value TRUE (Yes), then
	 * FXStandingInstruction must not be present. In ISO 15022,<br>
	 * and therefore in ISO 20022, the FXStandingInstruction indicator can only
	 * be used when the transation is instructed<br>
	 * in a released mode.
	 */
	public static void checkSettlementDetails22(SettlementDetails22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If HoldIndicator is present and is value TRUE (Yes), then
	 * FXStandingInstruction must not be present. In ISO 15022,<br>
	 * and therefore in ISO 20022, the FXStandingInstruction indicator can only
	 * be used when the transation is instructed<br>
	 * in a released mode.
	 */
	public static void checkSettlementDetails35(SettlementDetails35 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If HoldIndicator is present and is value TRUE (Yes), then
	 * FXStandingInstruction must not be present. In ISO 15022,<br>
	 * and therefore in ISO 20022, the FXStandingInstruction indicator can only
	 * be used when the transation is instructed<br>
	 * in a released mode.
	 */
	public static void checkSettlementDetails42(SettlementDetails42 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If HoldIndicator is present and is value TRUE (Yes), then
	 * FXStandingInstruction must not be present. In ISO 15022,<br>
	 * and therefore in ISO 20022, the FXStandingInstruction indicator can only
	 * be used when the transation is instructed<br>
	 * in a released mode.
	 */
	public static void checkSettlementDetails52(SettlementDetails52 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If HoldIndicator is present and is value TRUE (Yes), then
	 * FXStandingInstruction must not be present. In ISO 15022, and therefore in
	 * ISO 20022, the FXStandingInstruction indicator can only be used when the
	 * transation is instructed in a released mode.
	 */
	public static void checkSettlementDetails43(SettlementDetails43 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If HoldIndicator is present and is value TRUE (Yes), then
	 * FXStandingInstruction must be absent.
	 */
	public static void checkSettlementDetails65(SettlementDetails65 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If HoldIndicator is present and is value TRUE (Yes), then
	 * FXStandingInstruction must not be present. In ISO 15022,<br>
	 * and therefore in ISO 20022, the FXStandingInstruction indicator can only
	 * be used when the transation is instructed<br>
	 * in a released mode.
	 */
	public static void checkSettlementDetails67(SettlementDetails67 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If HoldIndicator is present and is value TRUE (Yes), then
	 * FXStandingInstruction must be absent.
	 */
	public static void checkSettlementDetails72(SettlementDetails72 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If HoldIndicator is present and is value TRUE (Yes), then
	 * FXStandingInstruction must not be present. In ISO 15022,<br>
	 * and therefore in ISO 20022, the FXStandingInstruction indicator can only
	 * be used when the transation is instructed<br>
	 * in a released mode.
	 */
	public static void checkSettlementDetails81(SettlementDetails81 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If HoldIndicator is present and is value TRUE (Yes), then
	 * FXStandingInstruction must be absent.
	 */
	public static void checkSettlementDetails78(SettlementDetails78 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If HoldIndicator is present and is value TRUE (Yes), then
	 * FXStandingInstruction must be absent.
	 */
	public static void checkSettlementDetails77(SettlementDetails77 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If HoldIndicator is present and is value TRUE (Yes), then
	 * FXStandingInstruction must not be present. In ISO 15022,<br>
	 * and therefore in ISO 20022, the FXStandingInstruction indicator can only
	 * be used when the transation is instructed<br>
	 * in a released mode.
	 */
	public static void checkSettlementDetails93(SettlementDetails93 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If HoldIndicator is present and is value TRUE (Yes), then
	 * FXStandingInstruction must be absent.
	 */
	public static void checkSettlementDetails97(SettlementDetails97 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If HoldIndicator is present and is value TRUE (Yes), then
	 * FXStandingInstruction must not be present. In ISO 15022,<br>
	 * and therefore in ISO 20022, the FXStandingInstruction indicator can only
	 * be used when the transation is instructed<br>
	 * in a released mode.
	 */
	public static void checkSettlementDetails101(SettlementDetails101 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If HoldIndicator is present and is value TRUE (Yes), then
	 * FXStandingInstruction must be absent.
	 */
	public static void checkSettlementDetails105(SettlementDetails105 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If HoldIndicator is present and is value TRUE (Yes), then
	 * FXStandingInstruction must be absent.
	 */
	public static void checkSettlementDetails106(SettlementDetails106 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If HoldIndicator is present and is value TRUE (Yes), then
	 * FXStandingInstruction must not be present. In ISO 15022,<br>
	 * and therefore in ISO 20022, the FXStandingInstruction indicator can only
	 * be used when the transation is instructed<br>
	 * in a released mode.
	 */
	public static void checkSettlementDetails111(SettlementDetails111 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If HoldIndicator is present and is value TRUE (Yes), then
	 * FXStandingInstruction must not be present. In ISO 15022,<br>
	 * and therefore in ISO 20022, the FXStandingInstruction indicator can only
	 * be used when the transation is instructed<br>
	 * in a released mode.
	 */
	public static void checkSettlementDetails112(SettlementDetails112 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If HoldIndicator is present and is value TRUE (Yes), then
	 * FXStandingInstruction must not be present. In ISO 15022,<br>
	 * and therefore in ISO 20022, the FXStandingInstruction indicator can only
	 * be used when the transation is instructed<br>
	 * in a released mode.
	 */
	public static void checkSettlementDetails120(SettlementDetails120 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If HoldIndicator is present and is value TRUE (Yes), then
	 * FXStandingInstruction must not be present. In ISO 15022,<br>
	 * and therefore in ISO 20022, the FXStandingInstruction indicator can only
	 * be used when the transation is instructed<br>
	 * in a released mode.
	 */
	public static void checkSettlementDetails119(SettlementDetails119 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If HoldIndicator is present and is value TRUE (Yes), then
	 * FXStandingInstruction must not be present. In ISO 15022,<br>
	 * and therefore in ISO 20022, the FXStandingInstruction indicator can only
	 * be used when the transation is instructed<br>
	 * in a released mode.
	 */
	public static void checkSettlementDetails137(SettlementDetails137 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If HoldIndicator is present and is value TRUE (Yes), then
	 * FXStandingInstruction must not be present. In ISO 15022,<br>
	 * and therefore in ISO 20022, the FXStandingInstruction indicator can only
	 * be used when the transation is instructed<br>
	 * in a released mode.
	 */
	public static void checkSettlementDetails132(SettlementDetails132 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}