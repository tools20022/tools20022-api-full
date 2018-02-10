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
 * If OptionType/Code is SPLI, then at least one occurrence of
 * AdditionalInformation/InstructionAdditionalInformation must be present.
 */
public class ConstraintInstructionAdditionalInformationRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption5
	 * CorporateActionOption5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/InstructionAdditionalInformation[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;SplitInstruction&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionAdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OptionType/Code is SPLI, then at least one occurrence of AdditionalInformation/InstructionAdditionalInformation must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption5> forCorporateActionOption5 = new MMConstraint<CorporateActionOption5>() {
		{
			validator = ConstraintInstructionAdditionalInformationRule::checkCorporateActionOption5;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionAdditionalInformationRule";
			definition = "If OptionType/Code is SPLI, then at least one occurrence of AdditionalInformation/InstructionAdditionalInformation must be present.";
			owner_lazy = () -> CorporateActionOption5.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/InstructionAdditionalInformation[1]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OptionType/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/OptionType/Code</leftOperand><rightOperand>SplitInstruction</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption13
	 * CorporateActionOption13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/InstructionAdditionalInformation[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;SplitInstruction&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionAdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OptionType/Code is SPLI, then at least one occurrence of AdditionalInformation/InstructionAdditionalInformation must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption13> forCorporateActionOption13 = new MMConstraint<CorporateActionOption13>() {
		{
			validator = ConstraintInstructionAdditionalInformationRule::checkCorporateActionOption13;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionAdditionalInformationRule";
			definition = "If OptionType/Code is SPLI, then at least one occurrence of AdditionalInformation/InstructionAdditionalInformation must be present.";
			owner_lazy = () -> CorporateActionOption13.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/InstructionAdditionalInformation[1]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OptionType/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/OptionType/Code</leftOperand><rightOperand>SplitInstruction</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption25
	 * CorporateActionOption25}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/InstructionAdditionalInformation[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;SplitInstruction&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionAdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OptionType/Code is SPLI, then at least one occurrence of AdditionalInformation/InstructionAdditionalInformation must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption25> forCorporateActionOption25 = new MMConstraint<CorporateActionOption25>() {
		{
			validator = ConstraintInstructionAdditionalInformationRule::checkCorporateActionOption25;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionAdditionalInformationRule";
			definition = "If OptionType/Code is SPLI, then at least one occurrence of AdditionalInformation/InstructionAdditionalInformation must be present.";
			owner_lazy = () -> CorporateActionOption25.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/InstructionAdditionalInformation[1]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OptionType/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/OptionType/Code</leftOperand><rightOperand>SplitInstruction</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption30
	 * CorporateActionOption30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/InstructionAdditionalInformation[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;SplitInstruction&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionAdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OptionType/Code is SPLI, then at least one occurrence of AdditionalInformation/InstructionAdditionalInformation must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption30> forCorporateActionOption30 = new MMConstraint<CorporateActionOption30>() {
		{
			validator = ConstraintInstructionAdditionalInformationRule::checkCorporateActionOption30;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionAdditionalInformationRule";
			definition = "If OptionType/Code is SPLI, then at least one occurrence of AdditionalInformation/InstructionAdditionalInformation must be present.";
			owner_lazy = () -> CorporateActionOption30.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/InstructionAdditionalInformation[1]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OptionType/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/OptionType/Code</leftOperand><rightOperand>SplitInstruction</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption38
	 * CorporateActionOption38}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/InstructionAdditionalInformation[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;SplitInstruction&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionAdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OptionType/Code is SPLI, then at least one occurrence of AdditionalInformation/InstructionAdditionalInformation must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption38> forCorporateActionOption38 = new MMConstraint<CorporateActionOption38>() {
		{
			validator = ConstraintInstructionAdditionalInformationRule::checkCorporateActionOption38;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionAdditionalInformationRule";
			definition = "If OptionType/Code is SPLI, then at least one occurrence of AdditionalInformation/InstructionAdditionalInformation must be present.";
			owner_lazy = () -> CorporateActionOption38.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/InstructionAdditionalInformation[1]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OptionType/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/OptionType/Code</leftOperand><rightOperand>SplitInstruction</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption47
	 * CorporateActionOption47}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/InstructionAdditionalInformation[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;SplitInstruction&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionAdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OptionType/Code is SPLI, then at least one occurrence of AdditionalInformation/InstructionAdditionalInformation must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption47> forCorporateActionOption47 = new MMConstraint<CorporateActionOption47>() {
		{
			validator = ConstraintInstructionAdditionalInformationRule::checkCorporateActionOption47;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionAdditionalInformationRule";
			definition = "If OptionType/Code is SPLI, then at least one occurrence of AdditionalInformation/InstructionAdditionalInformation must be present.";
			owner_lazy = () -> CorporateActionOption47.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/InstructionAdditionalInformation[1]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OptionType/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/OptionType/Code</leftOperand><rightOperand>SplitInstruction</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption57
	 * CorporateActionOption57}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/InstructionAdditionalInformation[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;SplitInstruction&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionAdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OptionType/Code is SPLI, then at least one occurrence of AdditionalInformation/InstructionAdditionalInformation must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructionAdditionalInformationRule#forCorporateActionOption103
	 * ConstraintInstructionAdditionalInformationRule.
	 * forCorporateActionOption103}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption57> forCorporateActionOption57 = new MMConstraint<CorporateActionOption57>() {
		{
			validator = ConstraintInstructionAdditionalInformationRule::checkCorporateActionOption57;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionAdditionalInformationRule";
			definition = "If OptionType/Code is SPLI, then at least one occurrence of AdditionalInformation/InstructionAdditionalInformation must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInstructionAdditionalInformationRule.forCorporateActionOption103);
			owner_lazy = () -> CorporateActionOption57.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/InstructionAdditionalInformation[1]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OptionType/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/OptionType/Code</leftOperand><rightOperand>SplitInstruction</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption58
	 * CorporateActionOption58}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/InstructionAdditionalInformation[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;SplitInstruction&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionAdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OptionType/Code is SPLI, then at least one occurrence of AdditionalInformation/InstructionAdditionalInformation must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption58> forCorporateActionOption58 = new MMConstraint<CorporateActionOption58>() {
		{
			validator = ConstraintInstructionAdditionalInformationRule::checkCorporateActionOption58;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionAdditionalInformationRule";
			definition = "If OptionType/Code is SPLI, then at least one occurrence of AdditionalInformation/InstructionAdditionalInformation must be present.";
			owner_lazy = () -> CorporateActionOption58.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/InstructionAdditionalInformation[1]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OptionType/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/OptionType/Code</leftOperand><rightOperand>SplitInstruction</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption103
	 * CorporateActionOption103}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/InstructionAdditionalInformation[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;SplitInstruction&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionAdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OptionType/Code is SPLI, then at least one occurrence of AdditionalInformation/InstructionAdditionalInformation must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructionAdditionalInformationRule#forCorporateActionOption118
	 * ConstraintInstructionAdditionalInformationRule.
	 * forCorporateActionOption118}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructionAdditionalInformationRule#forCorporateActionOption57
	 * ConstraintInstructionAdditionalInformationRule.forCorporateActionOption57
	 * }</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption103> forCorporateActionOption103 = new MMConstraint<CorporateActionOption103>() {
		{
			validator = ConstraintInstructionAdditionalInformationRule::checkCorporateActionOption103;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionAdditionalInformationRule";
			definition = "If OptionType/Code is SPLI, then at least one occurrence of AdditionalInformation/InstructionAdditionalInformation must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInstructionAdditionalInformationRule.forCorporateActionOption118);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintInstructionAdditionalInformationRule.forCorporateActionOption57;
			owner_lazy = () -> CorporateActionOption103.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/InstructionAdditionalInformation[1]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OptionType/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/OptionType/Code</leftOperand><rightOperand>SplitInstruction</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption107
	 * CorporateActionOption107}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/InstructionAdditionalInformation[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;SplitInstruction&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionAdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OptionType/Code is SPLI, then at least one occurrence of AdditionalInformation/InstructionAdditionalInformation must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption107> forCorporateActionOption107 = new MMConstraint<CorporateActionOption107>() {
		{
			validator = ConstraintInstructionAdditionalInformationRule::checkCorporateActionOption107;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionAdditionalInformationRule";
			definition = "If OptionType/Code is SPLI, then at least one occurrence of AdditionalInformation/InstructionAdditionalInformation must be present.";
			owner_lazy = () -> CorporateActionOption107.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/InstructionAdditionalInformation[1]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OptionType/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/OptionType/Code</leftOperand><rightOperand>SplitInstruction</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption118
	 * CorporateActionOption118}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/InstructionAdditionalInformation[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;SplitInstruction&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionAdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OptionType/Code is SPLI (Split Instruction), then at least one occurrence of AdditionalInformation/InstructionAdditionalInformation must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructionAdditionalInformationRule#forCorporateActionOption131
	 * ConstraintInstructionAdditionalInformationRule.
	 * forCorporateActionOption131}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructionAdditionalInformationRule#forCorporateActionOption103
	 * ConstraintInstructionAdditionalInformationRule.
	 * forCorporateActionOption103}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption118> forCorporateActionOption118 = new MMConstraint<CorporateActionOption118>() {
		{
			validator = ConstraintInstructionAdditionalInformationRule::checkCorporateActionOption118;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionAdditionalInformationRule";
			definition = "If OptionType/Code is SPLI (Split Instruction), then at least one occurrence of AdditionalInformation/InstructionAdditionalInformation must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInstructionAdditionalInformationRule.forCorporateActionOption131);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintInstructionAdditionalInformationRule.forCorporateActionOption103;
			owner_lazy = () -> CorporateActionOption118.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/InstructionAdditionalInformation[1]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OptionType/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/OptionType/Code</leftOperand><rightOperand>SplitInstruction</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption123
	 * CorporateActionOption123}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/InstructionAdditionalInformation[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;SplitInstruction&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionAdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OptionType/Code is SPLI (Split Instruction), then at least one occurrence of AdditionalInformation/InstructionAdditionalInformation must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption123> forCorporateActionOption123 = new MMConstraint<CorporateActionOption123>() {
		{
			validator = ConstraintInstructionAdditionalInformationRule::checkCorporateActionOption123;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionAdditionalInformationRule";
			definition = "If OptionType/Code is SPLI (Split Instruction), then at least one occurrence of AdditionalInformation/InstructionAdditionalInformation must be present.";
			owner_lazy = () -> CorporateActionOption123.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/InstructionAdditionalInformation[1]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OptionType/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/OptionType/Code</leftOperand><rightOperand>SplitInstruction</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption131
	 * CorporateActionOption131}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/InstructionAdditionalInformation[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;SplitInstruction&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionAdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OptionType/Code is SPLI (Split Instruction), then at least one occurrence of AdditionalInformation/InstructionAdditionalInformation must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructionAdditionalInformationRule#forCorporateActionOption118
	 * ConstraintInstructionAdditionalInformationRule.
	 * forCorporateActionOption118}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption131> forCorporateActionOption131 = new MMConstraint<CorporateActionOption131>() {
		{
			validator = ConstraintInstructionAdditionalInformationRule::checkCorporateActionOption131;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionAdditionalInformationRule";
			definition = "If OptionType/Code is SPLI (Split Instruction), then at least one occurrence of AdditionalInformation/InstructionAdditionalInformation must be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintInstructionAdditionalInformationRule.forCorporateActionOption118;
			owner_lazy = () -> CorporateActionOption131.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/InstructionAdditionalInformation[1]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OptionType/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/OptionType/Code</leftOperand><rightOperand>SplitInstruction</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption134
	 * CorporateActionOption134}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation/InstructionAdditionalInformation[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/OptionType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;SplitInstruction&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionAdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OptionType/Code is SPLI (Split Instruction), then at least one occurrence of AdditionalInformation/InstructionAdditionalInformation must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption134> forCorporateActionOption134 = new MMConstraint<CorporateActionOption134>() {
		{
			validator = ConstraintInstructionAdditionalInformationRule::checkCorporateActionOption134;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionAdditionalInformationRule";
			definition = "If OptionType/Code is SPLI (Split Instruction), then at least one occurrence of AdditionalInformation/InstructionAdditionalInformation must be present.";
			owner_lazy = () -> CorporateActionOption134.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation/InstructionAdditionalInformation[1]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OptionType/Code</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/OptionType/Code</leftOperand><rightOperand>SplitInstruction</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};

	/**
	 * If OptionType/Code is SPLI, then at least one occurrence of
	 * AdditionalInformation/InstructionAdditionalInformation must be present.
	 */
	public static void checkCorporateActionOption5(CorporateActionOption5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OptionType/Code is SPLI, then at least one occurrence of
	 * AdditionalInformation/InstructionAdditionalInformation must be present.
	 */
	public static void checkCorporateActionOption13(CorporateActionOption13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OptionType/Code is SPLI, then at least one occurrence of
	 * AdditionalInformation/InstructionAdditionalInformation must be present.
	 */
	public static void checkCorporateActionOption25(CorporateActionOption25 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OptionType/Code is SPLI, then at least one occurrence of
	 * AdditionalInformation/InstructionAdditionalInformation must be present.
	 */
	public static void checkCorporateActionOption30(CorporateActionOption30 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OptionType/Code is SPLI, then at least one occurrence of
	 * AdditionalInformation/InstructionAdditionalInformation must be present.
	 */
	public static void checkCorporateActionOption38(CorporateActionOption38 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OptionType/Code is SPLI, then at least one occurrence of
	 * AdditionalInformation/InstructionAdditionalInformation must be present.
	 */
	public static void checkCorporateActionOption47(CorporateActionOption47 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OptionType/Code is SPLI, then at least one occurrence of
	 * AdditionalInformation/InstructionAdditionalInformation must be present.
	 */
	public static void checkCorporateActionOption57(CorporateActionOption57 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OptionType/Code is SPLI, then at least one occurrence of
	 * AdditionalInformation/InstructionAdditionalInformation must be present.
	 */
	public static void checkCorporateActionOption58(CorporateActionOption58 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OptionType/Code is SPLI, then at least one occurrence of
	 * AdditionalInformation/InstructionAdditionalInformation must be present.
	 */
	public static void checkCorporateActionOption103(CorporateActionOption103 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OptionType/Code is SPLI, then at least one occurrence of
	 * AdditionalInformation/InstructionAdditionalInformation must be present.
	 */
	public static void checkCorporateActionOption107(CorporateActionOption107 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OptionType/Code is SPLI (Split Instruction), then at least one
	 * occurrence of AdditionalInformation/InstructionAdditionalInformation must
	 * be present.
	 */
	public static void checkCorporateActionOption118(CorporateActionOption118 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OptionType/Code is SPLI (Split Instruction), then at least one
	 * occurrence of AdditionalInformation/InstructionAdditionalInformation must
	 * be present.
	 */
	public static void checkCorporateActionOption123(CorporateActionOption123 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OptionType/Code is SPLI (Split Instruction), then at least one
	 * occurrence of AdditionalInformation/InstructionAdditionalInformation must
	 * be present.
	 */
	public static void checkCorporateActionOption131(CorporateActionOption131 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OptionType/Code is SPLI (Split Instruction), then at least one
	 * occurrence of AdditionalInformation/InstructionAdditionalInformation must
	 * be present.
	 */
	public static void checkCorporateActionOption134(CorporateActionOption134 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}