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
import com.tools20022.repository.area.acmt.AccountDetailsConfirmationV03;
import com.tools20022.repository.area.acmt.AccountModificationInstructionV03;
import com.tools20022.repository.area.acmt.AccountOpeningInstructionV03;
import java.util.Arrays;

/**
 * CashSettlement\InterestPaymentInstrument\DividendPercentage is not allowed.
 */
public class ConstraintDividendPercentageRule4 {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV03
	 * AccountDetailsConfirmationV03}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CashSettlement[*]/InterestPaymentInstrument/DividendPercentage&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendPercentageRule4"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CashSettlement\\InterestPaymentInstrument\\DividendPercentage is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDividendPercentage4Rule#forAccountDetailsConfirmationV04
	 * ConstraintDividendPercentage4Rule.forAccountDetailsConfirmationV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountDetailsConfirmationV03> forAccountDetailsConfirmationV03 = new MMConstraint<AccountDetailsConfirmationV03>() {
		{
			validator = ConstraintDividendPercentageRule4::checkAccountDetailsConfirmationV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendPercentageRule4";
			definition = "CashSettlement\\InterestPaymentInstrument\\DividendPercentage is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDividendPercentage4Rule.forAccountDetailsConfirmationV04);
			owner_lazy = () -> AccountDetailsConfirmationV03.mmObject();
			expression = "<RuleDefinition><SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/CashSettlement[*]/InterestPaymentInstrument/DividendPercentage</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV03
	 * AccountModificationInstructionV03}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ModifiedCashSettlement[*]/InterestPaymentInstrument/DividendPercentage&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendPercentageRule4"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ModifiedCashSettlement\\InterestPaymentInstrument\\DividendPercentage is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDividendPercentage4Rule#forAccountModificationInstructionV04
	 * ConstraintDividendPercentage4Rule.forAccountModificationInstructionV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountModificationInstructionV03> forAccountModificationInstructionV03 = new MMConstraint<AccountModificationInstructionV03>() {
		{
			validator = ConstraintDividendPercentageRule4::checkAccountModificationInstructionV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendPercentageRule4";
			definition = "ModifiedCashSettlement\\InterestPaymentInstrument\\DividendPercentage is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDividendPercentage4Rule.forAccountModificationInstructionV04);
			owner_lazy = () -> AccountModificationInstructionV03.mmObject();
			expression = "<RuleDefinition><SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ModifiedCashSettlement[*]/InterestPaymentInstrument/DividendPercentage</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV03
	 * AccountOpeningInstructionV03}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CashSettlement[*]/InterestPaymentInstrument/DividendPercentage&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendPercentageRule4"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CashSettlement\\InterestPaymentInstrument\\DividendPercentage is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDividendPercentage4Rule#forAccountOpeningInstructionV04
	 * ConstraintDividendPercentage4Rule.forAccountOpeningInstructionV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountOpeningInstructionV03> forAccountOpeningInstructionV03 = new MMConstraint<AccountOpeningInstructionV03>() {
		{
			validator = ConstraintDividendPercentageRule4::checkAccountOpeningInstructionV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendPercentageRule4";
			definition = "CashSettlement\\InterestPaymentInstrument\\DividendPercentage is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDividendPercentage4Rule.forAccountOpeningInstructionV04);
			owner_lazy = () -> AccountOpeningInstructionV03.mmObject();
			expression = "<RuleDefinition><SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/CashSettlement[*]/InterestPaymentInstrument/DividendPercentage</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>";
		}
	};

	/**
	 * CashSettlement\InterestPaymentInstrument\DividendPercentage is not
	 * allowed.
	 */
	public static void checkAccountDetailsConfirmationV03(AccountDetailsConfirmationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ModifiedCashSettlement\InterestPaymentInstrument\DividendPercentage is
	 * not allowed.
	 */
	public static void checkAccountModificationInstructionV03(AccountModificationInstructionV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * CashSettlement\InterestPaymentInstrument\DividendPercentage is not
	 * allowed.
	 */
	public static void checkAccountOpeningInstructionV03(AccountOpeningInstructionV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}