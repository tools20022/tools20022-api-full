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
 * WithdrawalInvestmentPlan/CashSettlement/InterestPaymentInstrument/
 * DividendPercentage is not allowed.
 */
public class ConstraintDividendPercentage6Rule {

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
	 * "&lt;RuleDefinition&gt;&lt;SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/WithdrawalInvestmentPlan[*]/CashSettlement[*]/InterestPaymentInstrument/DividendPercentage&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendPercentage6Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "WithdrawalInvestmentPlan/CashSettlement/InterestPaymentInstrument/DividendPercentage is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDividendPercentage6Rule#forAccountDetailsConfirmationV05
	 * ConstraintDividendPercentage6Rule.forAccountDetailsConfirmationV05}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDividendPercentageRule6#forAccountDetailsConfirmationV03
	 * ConstraintDividendPercentageRule6.forAccountDetailsConfirmationV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountDetailsConfirmationV04> forAccountDetailsConfirmationV04 = new MMConstraint<AccountDetailsConfirmationV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendPercentage6Rule";
			definition = "WithdrawalInvestmentPlan/CashSettlement/InterestPaymentInstrument/DividendPercentage is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDividendPercentage6Rule.forAccountDetailsConfirmationV05);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDividendPercentageRule6.forAccountDetailsConfirmationV03;
			owner_lazy = () -> AccountDetailsConfirmationV04.mmObject();
			expression = "<RuleDefinition><SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/WithdrawalInvestmentPlan[*]/CashSettlement[*]/InterestPaymentInstrument/DividendPercentage</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(AccountDetailsConfirmationV04 obj) throws Exception {
			checkAccountDetailsConfirmationV04(obj);
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
	 * "&lt;RuleDefinition&gt;&lt;SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ModifiedWithdrawalInvestmentPlan[*]/InvestmentPlan/ModifiedCashSettlement[*]/InterestPaymentInstrument/DividendPercentage&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendPercentage6Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ModifiedWithdrawalInvestmentPlan/InvestmentPlan/ModifiedCashSettlement/InterestPaymentInstrument/DividendPercentage is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDividendPercentage6Rule#forAccountModificationInstructionV05
	 * ConstraintDividendPercentage6Rule.forAccountModificationInstructionV05}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDividendPercentageRule6#forAccountModificationInstructionV03
	 * ConstraintDividendPercentageRule6.forAccountModificationInstructionV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountModificationInstructionV04> forAccountModificationInstructionV04 = new MMConstraint<AccountModificationInstructionV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendPercentage6Rule";
			definition = "ModifiedWithdrawalInvestmentPlan/InvestmentPlan/ModifiedCashSettlement/InterestPaymentInstrument/DividendPercentage is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDividendPercentage6Rule.forAccountModificationInstructionV05);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDividendPercentageRule6.forAccountModificationInstructionV03;
			owner_lazy = () -> AccountModificationInstructionV04.mmObject();
			expression = "<RuleDefinition><SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ModifiedWithdrawalInvestmentPlan[*]/InvestmentPlan/ModifiedCashSettlement[*]/InterestPaymentInstrument/DividendPercentage</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(AccountModificationInstructionV04 obj) throws Exception {
			checkAccountModificationInstructionV04(obj);
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
	 * "&lt;RuleDefinition&gt;&lt;SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/WithdrawalInvestmentPlan[*]/CashSettlement[*]/InterestPaymentInstrument/DividendPercentage&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendPercentage6Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "WithdrawalInvestmentPlan/CashSettlement/InterestPaymentInstrument/DividendPercentage is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDividendPercentage6Rule#forAccountOpeningInstructionV05
	 * ConstraintDividendPercentage6Rule.forAccountOpeningInstructionV05}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDividendPercentageRule6#forAccountOpeningInstructionV03
	 * ConstraintDividendPercentageRule6.forAccountOpeningInstructionV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountOpeningInstructionV04> forAccountOpeningInstructionV04 = new MMConstraint<AccountOpeningInstructionV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendPercentage6Rule";
			definition = "WithdrawalInvestmentPlan/CashSettlement/InterestPaymentInstrument/DividendPercentage is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDividendPercentage6Rule.forAccountOpeningInstructionV05);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDividendPercentageRule6.forAccountOpeningInstructionV03;
			owner_lazy = () -> AccountOpeningInstructionV04.mmObject();
			expression = "<RuleDefinition><SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/WithdrawalInvestmentPlan[*]/CashSettlement[*]/InterestPaymentInstrument/DividendPercentage</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(AccountOpeningInstructionV04 obj) throws Exception {
			checkAccountOpeningInstructionV04(obj);
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
	 * "&lt;RuleDefinition&gt;&lt;SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/WithdrawalInvestmentPlan[*]/CashSettlement[*]/InterestPaymentInstrument/DividendPercentage&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendPercentage6Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "WithdrawalInvestmentPlan/CashSettlement/InterestPaymentInstrument/DividendPercentage is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDividendPercentage6Rule#forAccountOpeningInstructionV04
	 * ConstraintDividendPercentage6Rule.forAccountOpeningInstructionV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountOpeningInstructionV05> forAccountOpeningInstructionV05 = new MMConstraint<AccountOpeningInstructionV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendPercentage6Rule";
			definition = "WithdrawalInvestmentPlan/CashSettlement/InterestPaymentInstrument/DividendPercentage is not allowed.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDividendPercentage6Rule.forAccountOpeningInstructionV04;
			owner_lazy = () -> AccountOpeningInstructionV05.mmObject();
			expression = "<RuleDefinition><SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/WithdrawalInvestmentPlan[*]/CashSettlement[*]/InterestPaymentInstrument/DividendPercentage</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(AccountOpeningInstructionV05 obj) throws Exception {
			checkAccountOpeningInstructionV05(obj);
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
	 * "&lt;RuleDefinition&gt;&lt;SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ModifiedWithdrawalInvestmentPlan[*]/InvestmentPlan/ModifiedCashSettlement[*]/InterestPaymentInstrument/DividendPercentage&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendPercentage6Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ModifiedWithdrawalInvestmentPlan/InvestmentPlan/ModifiedCashSettlement/InterestPaymentInstrument/DividendPercentage is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDividendPercentage6Rule#forAccountModificationInstructionV04
	 * ConstraintDividendPercentage6Rule.forAccountModificationInstructionV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountModificationInstructionV05> forAccountModificationInstructionV05 = new MMConstraint<AccountModificationInstructionV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendPercentage6Rule";
			definition = "ModifiedWithdrawalInvestmentPlan/InvestmentPlan/ModifiedCashSettlement/InterestPaymentInstrument/DividendPercentage is not allowed.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDividendPercentage6Rule.forAccountModificationInstructionV04;
			owner_lazy = () -> AccountModificationInstructionV05.mmObject();
			expression = "<RuleDefinition><SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ModifiedWithdrawalInvestmentPlan[*]/InvestmentPlan/ModifiedCashSettlement[*]/InterestPaymentInstrument/DividendPercentage</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(AccountModificationInstructionV05 obj) throws Exception {
			checkAccountModificationInstructionV05(obj);
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
	 * "&lt;RuleDefinition&gt;&lt;SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/WithdrawalInvestmentPlan[*]/CashSettlement[*]/InterestPaymentInstrument/DividendPercentage&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendPercentage6Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "WithdrawalInvestmentPlan/CashSettlement/InterestPaymentInstrument/DividendPercentage is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDividendPercentage6Rule#forAccountDetailsConfirmationV04
	 * ConstraintDividendPercentage6Rule.forAccountDetailsConfirmationV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountDetailsConfirmationV05> forAccountDetailsConfirmationV05 = new MMConstraint<AccountDetailsConfirmationV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendPercentage6Rule";
			definition = "WithdrawalInvestmentPlan/CashSettlement/InterestPaymentInstrument/DividendPercentage is not allowed.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDividendPercentage6Rule.forAccountDetailsConfirmationV04;
			owner_lazy = () -> AccountDetailsConfirmationV05.mmObject();
			expression = "<RuleDefinition><SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/WithdrawalInvestmentPlan[*]/CashSettlement[*]/InterestPaymentInstrument/DividendPercentage</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(AccountDetailsConfirmationV05 obj) throws Exception {
			checkAccountDetailsConfirmationV05(obj);
		}
	};

	/**
	 * WithdrawalInvestmentPlan/CashSettlement/InterestPaymentInstrument/
	 * DividendPercentage is not allowed.
	 */
	public static void checkAccountDetailsConfirmationV04(AccountDetailsConfirmationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ModifiedWithdrawalInvestmentPlan/InvestmentPlan/ModifiedCashSettlement/
	 * InterestPaymentInstrument/DividendPercentage is not allowed.
	 */
	public static void checkAccountModificationInstructionV04(AccountModificationInstructionV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * WithdrawalInvestmentPlan/CashSettlement/InterestPaymentInstrument/
	 * DividendPercentage is not allowed.
	 */
	public static void checkAccountOpeningInstructionV04(AccountOpeningInstructionV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * WithdrawalInvestmentPlan/CashSettlement/InterestPaymentInstrument/
	 * DividendPercentage is not allowed.
	 */
	public static void checkAccountOpeningInstructionV05(AccountOpeningInstructionV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ModifiedWithdrawalInvestmentPlan/InvestmentPlan/ModifiedCashSettlement/
	 * InterestPaymentInstrument/DividendPercentage is not allowed.
	 */
	public static void checkAccountModificationInstructionV05(AccountModificationInstructionV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * WithdrawalInvestmentPlan/CashSettlement/InterestPaymentInstrument/
	 * DividendPercentage is not allowed.
	 */
	public static void checkAccountDetailsConfirmationV05(AccountDetailsConfirmationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}