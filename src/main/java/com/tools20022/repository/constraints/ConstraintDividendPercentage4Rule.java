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
import com.tools20022.repository.area.acmt.*;
import java.util.Arrays;

/**
 * CashSettlement/InterestPaymentInstrument/DividendPercentage is not allowed.
 */
public class ConstraintDividendPercentage4Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV04
	 * AccountDetailsConfirmationV04}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CashSettlement[*]/InterestPaymentInstrument/DividendPercentage&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendPercentage4Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CashSettlement/InterestPaymentInstrument/DividendPercentage is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDividendPercentage4Rule#forAccountDetailsConfirmationV05
	 * ConstraintDividendPercentage4Rule.forAccountDetailsConfirmationV05}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDividendPercentageRule4#forAccountDetailsConfirmationV03
	 * ConstraintDividendPercentageRule4.forAccountDetailsConfirmationV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountDetailsConfirmationV04> forAccountDetailsConfirmationV04 = new MMConstraint<AccountDetailsConfirmationV04>() {
		{
			validator = ConstraintDividendPercentage4Rule::checkAccountDetailsConfirmationV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendPercentage4Rule";
			definition = "CashSettlement/InterestPaymentInstrument/DividendPercentage is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDividendPercentage4Rule.forAccountDetailsConfirmationV05);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDividendPercentageRule4.forAccountDetailsConfirmationV03;
			owner_lazy = () -> AccountDetailsConfirmationV04.mmObject();
			expression = "<RuleDefinition><SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/CashSettlement[*]/InterestPaymentInstrument/DividendPercentage</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV04
	 * AccountModificationInstructionV04}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ModifiedCashSettlement[*]/InterestPaymentInstrument/DividendPercentage&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendPercentage4Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ModifiedCashSettlement/InterestPaymentInstrument/DividendPercentage is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDividendPercentage4Rule#forAccountModificationInstructionV05
	 * ConstraintDividendPercentage4Rule.forAccountModificationInstructionV05}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDividendPercentageRule4#forAccountModificationInstructionV03
	 * ConstraintDividendPercentageRule4.forAccountModificationInstructionV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountModificationInstructionV04> forAccountModificationInstructionV04 = new MMConstraint<AccountModificationInstructionV04>() {
		{
			validator = ConstraintDividendPercentage4Rule::checkAccountModificationInstructionV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendPercentage4Rule";
			definition = "ModifiedCashSettlement/InterestPaymentInstrument/DividendPercentage is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDividendPercentage4Rule.forAccountModificationInstructionV05);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDividendPercentageRule4.forAccountModificationInstructionV03;
			owner_lazy = () -> AccountModificationInstructionV04.mmObject();
			expression = "<RuleDefinition><SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ModifiedCashSettlement[*]/InterestPaymentInstrument/DividendPercentage</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV04
	 * AccountOpeningInstructionV04}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CashSettlement[*]/InterestPaymentInstrument/DividendPercentage&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendPercentage4Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CashSettlement/InterestPaymentInstrument/DividendPercentage is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDividendPercentage4Rule#forAccountOpeningInstructionV05
	 * ConstraintDividendPercentage4Rule.forAccountOpeningInstructionV05}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDividendPercentageRule4#forAccountOpeningInstructionV03
	 * ConstraintDividendPercentageRule4.forAccountOpeningInstructionV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountOpeningInstructionV04> forAccountOpeningInstructionV04 = new MMConstraint<AccountOpeningInstructionV04>() {
		{
			validator = ConstraintDividendPercentage4Rule::checkAccountOpeningInstructionV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendPercentage4Rule";
			definition = "CashSettlement/InterestPaymentInstrument/DividendPercentage is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDividendPercentage4Rule.forAccountOpeningInstructionV05);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDividendPercentageRule4.forAccountOpeningInstructionV03;
			owner_lazy = () -> AccountOpeningInstructionV04.mmObject();
			expression = "<RuleDefinition><SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/CashSettlement[*]/InterestPaymentInstrument/DividendPercentage</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV05
	 * AccountOpeningInstructionV05}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CashSettlement[*]/InterestPaymentInstrument/DividendPercentage&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendPercentage4Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CashSettlement/InterestPaymentInstrument/DividendPercentage is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDividendPercentage4Rule#forAccountOpeningInstructionV04
	 * ConstraintDividendPercentage4Rule.forAccountOpeningInstructionV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountOpeningInstructionV05> forAccountOpeningInstructionV05 = new MMConstraint<AccountOpeningInstructionV05>() {
		{
			validator = ConstraintDividendPercentage4Rule::checkAccountOpeningInstructionV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendPercentage4Rule";
			definition = "CashSettlement/InterestPaymentInstrument/DividendPercentage is not allowed.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDividendPercentage4Rule.forAccountOpeningInstructionV04;
			owner_lazy = () -> AccountOpeningInstructionV05.mmObject();
			expression = "<RuleDefinition><SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/CashSettlement[*]/InterestPaymentInstrument/DividendPercentage</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV05
	 * AccountModificationInstructionV05}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ModifiedCashSettlement[*]/InterestPaymentInstrument/DividendPercentage&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendPercentage4Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ModifiedCashSettlement/InterestPaymentInstrument/DividendPercentage is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDividendPercentage4Rule#forAccountModificationInstructionV04
	 * ConstraintDividendPercentage4Rule.forAccountModificationInstructionV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountModificationInstructionV05> forAccountModificationInstructionV05 = new MMConstraint<AccountModificationInstructionV05>() {
		{
			validator = ConstraintDividendPercentage4Rule::checkAccountModificationInstructionV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendPercentage4Rule";
			definition = "ModifiedCashSettlement/InterestPaymentInstrument/DividendPercentage is not allowed.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDividendPercentage4Rule.forAccountModificationInstructionV04;
			owner_lazy = () -> AccountModificationInstructionV05.mmObject();
			expression = "<RuleDefinition><SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ModifiedCashSettlement[*]/InterestPaymentInstrument/DividendPercentage</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05
	 * AccountDetailsConfirmationV05}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CashSettlement[*]/InterestPaymentInstrument/DividendPercentage&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendPercentage4Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CashSettlement/InterestPaymentInstrument/DividendPercentage is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDividendPercentage4Rule#forAccountDetailsConfirmationV04
	 * ConstraintDividendPercentage4Rule.forAccountDetailsConfirmationV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountDetailsConfirmationV05> forAccountDetailsConfirmationV05 = new MMConstraint<AccountDetailsConfirmationV05>() {
		{
			validator = ConstraintDividendPercentage4Rule::checkAccountDetailsConfirmationV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendPercentage4Rule";
			definition = "CashSettlement/InterestPaymentInstrument/DividendPercentage is not allowed.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDividendPercentage4Rule.forAccountDetailsConfirmationV04;
			owner_lazy = () -> AccountDetailsConfirmationV05.mmObject();
			expression = "<RuleDefinition><SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/CashSettlement[*]/InterestPaymentInstrument/DividendPercentage</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>";
		}
	};

	/**
	 * CashSettlement/InterestPaymentInstrument/DividendPercentage is not
	 * allowed.
	 */
	public static void checkAccountDetailsConfirmationV04(AccountDetailsConfirmationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ModifiedCashSettlement/InterestPaymentInstrument/DividendPercentage is
	 * not allowed.
	 */
	public static void checkAccountModificationInstructionV04(AccountModificationInstructionV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * CashSettlement/InterestPaymentInstrument/DividendPercentage is not
	 * allowed.
	 */
	public static void checkAccountOpeningInstructionV04(AccountOpeningInstructionV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * CashSettlement/InterestPaymentInstrument/DividendPercentage is not
	 * allowed.
	 */
	public static void checkAccountOpeningInstructionV05(AccountOpeningInstructionV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ModifiedCashSettlement/InterestPaymentInstrument/DividendPercentage is
	 * not allowed.
	 */
	public static void checkAccountModificationInstructionV05(AccountModificationInstructionV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * CashSettlement/InterestPaymentInstrument/DividendPercentage is not
	 * allowed.
	 */
	public static void checkAccountDetailsConfirmationV05(AccountDetailsConfirmationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}