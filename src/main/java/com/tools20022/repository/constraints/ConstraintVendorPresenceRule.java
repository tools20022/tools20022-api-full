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
 * If the settlement standing instruction database is a vendor database, then
 * the vendor must be identified.
 */
public class ConstraintVendorPresenceRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction1
	 * StandingSettlementInstruction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Vendor&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/SettlementStandingInstructionDatabase/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;VendorDatabase&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VendorPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the settlement standing instruction database is a vendor database, then the vendor must be identified."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<StandingSettlementInstruction1> forStandingSettlementInstruction1 = new MMConstraint<StandingSettlementInstruction1>() {
		{
			validator = ConstraintVendorPresenceRule::checkStandingSettlementInstruction1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VendorPresenceRule";
			definition = "If the settlement standing instruction database is a vendor database, then the vendor must be identified.";
			owner_lazy = () -> StandingSettlementInstruction1.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/Vendor</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/SettlementStandingInstructionDatabase/Code</leftOperand><rightOperand>VendorDatabase</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction4
	 * StandingSettlementInstruction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Vendor&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/SettlementStandingInstructionDatabase/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;VendorDatabase&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VendorPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the settlement standing instruction database is a vendor database, then the vendor must be identified."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<StandingSettlementInstruction4> forStandingSettlementInstruction4 = new MMConstraint<StandingSettlementInstruction4>() {
		{
			validator = ConstraintVendorPresenceRule::checkStandingSettlementInstruction4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VendorPresenceRule";
			definition = "If the settlement standing instruction database is a vendor database, then the vendor must be identified.";
			owner_lazy = () -> StandingSettlementInstruction4.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/Vendor</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/SettlementStandingInstructionDatabase/Code</leftOperand><rightOperand>VendorDatabase</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction7
	 * StandingSettlementInstruction7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Vendor&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/SettlementStandingInstructionDatabase/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;VendorDatabase&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VendorPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the settlement standing instruction database is a vendor database, then the vendor must be identified."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<StandingSettlementInstruction7> forStandingSettlementInstruction7 = new MMConstraint<StandingSettlementInstruction7>() {
		{
			validator = ConstraintVendorPresenceRule::checkStandingSettlementInstruction7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VendorPresenceRule";
			definition = "If the settlement standing instruction database is a vendor database, then the vendor must be identified.";
			owner_lazy = () -> StandingSettlementInstruction7.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/Vendor</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/SettlementStandingInstructionDatabase/Code</leftOperand><rightOperand>VendorDatabase</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction2
	 * StandingSettlementInstruction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Vendor&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/SettlementStandingInstructionDatabase/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;VendorDatabase&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VendorPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the settlement standing instruction database is a vendor database, then the vendor must be identified."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<StandingSettlementInstruction2> forStandingSettlementInstruction2 = new MMConstraint<StandingSettlementInstruction2>() {
		{
			validator = ConstraintVendorPresenceRule::checkStandingSettlementInstruction2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VendorPresenceRule";
			definition = "If the settlement standing instruction database is a vendor database, then the vendor must be identified.";
			owner_lazy = () -> StandingSettlementInstruction2.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/Vendor</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/SettlementStandingInstructionDatabase/Code</leftOperand><rightOperand>VendorDatabase</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction3
	 * StandingSettlementInstruction3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Vendor&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/SettlementStandingInstructionDatabase/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;VendorDatabase&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VendorPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the settlement standing instruction database is a vendor database, then the vendor must be identified."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintVendorPresenceRule#forStandingSettlementInstruction11
	 * ConstraintVendorPresenceRule.forStandingSettlementInstruction11}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<StandingSettlementInstruction3> forStandingSettlementInstruction3 = new MMConstraint<StandingSettlementInstruction3>() {
		{
			validator = ConstraintVendorPresenceRule::checkStandingSettlementInstruction3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VendorPresenceRule";
			definition = "If the settlement standing instruction database is a vendor database, then the vendor must be identified.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintVendorPresenceRule.forStandingSettlementInstruction11);
			owner_lazy = () -> StandingSettlementInstruction3.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/Vendor</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/SettlementStandingInstructionDatabase/Code</leftOperand><rightOperand>VendorDatabase</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction6
	 * StandingSettlementInstruction6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Vendor&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/SettlementStandingInstructionDatabase/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;VendorDatabase&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VendorPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the settlement standing instruction database is a vendor database, then the vendor must be identified."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<StandingSettlementInstruction6> forStandingSettlementInstruction6 = new MMConstraint<StandingSettlementInstruction6>() {
		{
			validator = ConstraintVendorPresenceRule::checkStandingSettlementInstruction6;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VendorPresenceRule";
			definition = "If the settlement standing instruction database is a vendor database, then the vendor must be identified.";
			owner_lazy = () -> StandingSettlementInstruction6.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/Vendor</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/SettlementStandingInstructionDatabase/Code</leftOperand><rightOperand>VendorDatabase</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction9
	 * StandingSettlementInstruction9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Vendor&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/SettlementStandingInstructionDatabase/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;VendorDatabase&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VendorPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the settlement standing instruction database is a vendor database, then the vendor must be identified."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<StandingSettlementInstruction9> forStandingSettlementInstruction9 = new MMConstraint<StandingSettlementInstruction9>() {
		{
			validator = ConstraintVendorPresenceRule::checkStandingSettlementInstruction9;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VendorPresenceRule";
			definition = "If the settlement standing instruction database is a vendor database, then the vendor must be identified.";
			owner_lazy = () -> StandingSettlementInstruction9.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/Vendor</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/SettlementStandingInstructionDatabase/Code</leftOperand><rightOperand>VendorDatabase</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction5
	 * StandingSettlementInstruction5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Vendor&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/SettlementStandingInstructionDatabase/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;VendorDatabase&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VendorPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the settlement standing instruction database is a vendor database, then the vendor must be identified."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<StandingSettlementInstruction5> forStandingSettlementInstruction5 = new MMConstraint<StandingSettlementInstruction5>() {
		{
			validator = ConstraintVendorPresenceRule::checkStandingSettlementInstruction5;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VendorPresenceRule";
			definition = "If the settlement standing instruction database is a vendor database, then the vendor must be identified.";
			owner_lazy = () -> StandingSettlementInstruction5.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/Vendor</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/SettlementStandingInstructionDatabase/Code</leftOperand><rightOperand>VendorDatabase</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction8
	 * StandingSettlementInstruction8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Vendor&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/SettlementStandingInstructionDatabase/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;VendorDatabase&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VendorPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the settlement standing instruction database is a vendor database, then the vendor must be identified."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<StandingSettlementInstruction8> forStandingSettlementInstruction8 = new MMConstraint<StandingSettlementInstruction8>() {
		{
			validator = ConstraintVendorPresenceRule::checkStandingSettlementInstruction8;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VendorPresenceRule";
			definition = "If the settlement standing instruction database is a vendor database, then the vendor must be identified.";
			owner_lazy = () -> StandingSettlementInstruction8.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/Vendor</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/SettlementStandingInstructionDatabase/Code</leftOperand><rightOperand>VendorDatabase</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction11
	 * StandingSettlementInstruction11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Vendor&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/SettlementStandingInstructionDatabase/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;VendorDatabase&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VendorPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the settlement standing instruction database is a vendor database, then the vendor must be identified."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintVendorPresenceRule#forStandingSettlementInstruction3
	 * ConstraintVendorPresenceRule.forStandingSettlementInstruction3}</li>
	 * </ul>
	 */
	public static final MMConstraint<StandingSettlementInstruction11> forStandingSettlementInstruction11 = new MMConstraint<StandingSettlementInstruction11>() {
		{
			validator = ConstraintVendorPresenceRule::checkStandingSettlementInstruction11;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VendorPresenceRule";
			definition = "If the settlement standing instruction database is a vendor database, then the vendor must be identified.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintVendorPresenceRule.forStandingSettlementInstruction3;
			owner_lazy = () -> StandingSettlementInstruction11.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/Vendor</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/SettlementStandingInstructionDatabase/Code</leftOperand><rightOperand>VendorDatabase</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction12
	 * StandingSettlementInstruction12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Vendor&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/SettlementStandingInstructionDatabase/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;VendorDatabase&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VendorPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the settlement standing instruction database is a vendor database, then the vendor must be identified."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<StandingSettlementInstruction12> forStandingSettlementInstruction12 = new MMConstraint<StandingSettlementInstruction12>() {
		{
			validator = ConstraintVendorPresenceRule::checkStandingSettlementInstruction12;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VendorPresenceRule";
			definition = "If the settlement standing instruction database is a vendor database, then the vendor must be identified.";
			owner_lazy = () -> StandingSettlementInstruction12.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/Vendor</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/SettlementStandingInstructionDatabase/Code</leftOperand><rightOperand>VendorDatabase</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};

	/**
	 * If the settlement standing instruction database is a vendor database,
	 * then the vendor must be identified.
	 */
	public static void checkStandingSettlementInstruction1(StandingSettlementInstruction1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the settlement standing instruction database is a vendor database,
	 * then the vendor must be identified.
	 */
	public static void checkStandingSettlementInstruction4(StandingSettlementInstruction4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the settlement standing instruction database is a vendor database,
	 * then the vendor must be identified.
	 */
	public static void checkStandingSettlementInstruction7(StandingSettlementInstruction7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the settlement standing instruction database is a vendor database,
	 * then the vendor must be identified.
	 */
	public static void checkStandingSettlementInstruction2(StandingSettlementInstruction2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the settlement standing instruction database is a vendor database,
	 * then the vendor must be identified.
	 */
	public static void checkStandingSettlementInstruction3(StandingSettlementInstruction3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the settlement standing instruction database is a vendor database,
	 * then the vendor must be identified.
	 */
	public static void checkStandingSettlementInstruction6(StandingSettlementInstruction6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the settlement standing instruction database is a vendor database,
	 * then the vendor must be identified.
	 */
	public static void checkStandingSettlementInstruction9(StandingSettlementInstruction9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the settlement standing instruction database is a vendor database,
	 * then the vendor must be identified.
	 */
	public static void checkStandingSettlementInstruction5(StandingSettlementInstruction5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the settlement standing instruction database is a vendor database,
	 * then the vendor must be identified.
	 */
	public static void checkStandingSettlementInstruction8(StandingSettlementInstruction8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the settlement standing instruction database is a vendor database,
	 * then the vendor must be identified.
	 */
	public static void checkStandingSettlementInstruction11(StandingSettlementInstruction11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If the settlement standing instruction database is a vendor database,
	 * then the vendor must be identified.
	 */
	public static void checkStandingSettlementInstruction12(StandingSettlementInstruction12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}