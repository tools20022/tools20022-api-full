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
import com.tools20022.repository.msg.Statement16;
import com.tools20022.repository.msg.Statement29;
import com.tools20022.repository.msg.Statement42;
import com.tools20022.repository.msg.Statement54;
import java.util.Arrays;

/**
 * If StatementBasis is used, then the statement requested must be a
 * SecuritiesBalanceAccountingReport or a SecuritiesBalanceCustodyReport.
 */
public class ConstraintStatementBasisRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Statement29 Statement29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementBasisRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementBasis is used, then the statement requested must be a SecuritiesBalanceAccountingReport or a SecuritiesBalanceCustodyReport."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Statement29> forStatement29 = new MMConstraint<Statement29>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementBasisRule";
			definition = "If StatementBasis is used, then the statement requested must be a SecuritiesBalanceAccountingReport or a SecuritiesBalanceCustodyReport.";
			owner_lazy = () -> Statement29.mmObject();
		}

		@Override
		public void executeValidator(Statement29 obj) throws Exception {
			checkStatement29(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Statement42 Statement42}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementBasisRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementBasis is used, then the statement requested must be a SecuritiesBalanceAccountingReport or a SecuritiesBalanceCustodyReport."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintStatementBasisRule#forStatement16
	 * ConstraintStatementBasisRule.forStatement16}</li>
	 * </ul>
	 */
	public static final MMConstraint<Statement42> forStatement42 = new MMConstraint<Statement42>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementBasisRule";
			definition = "If StatementBasis is used, then the statement requested must be a SecuritiesBalanceAccountingReport or a SecuritiesBalanceCustodyReport.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintStatementBasisRule.forStatement16;
			owner_lazy = () -> Statement42.mmObject();
		}

		@Override
		public void executeValidator(Statement42 obj) throws Exception {
			checkStatement42(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Statement54 Statement54}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementBasisRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementBasis is used, then the statement requested must be a SecuritiesBalanceAccountingReport or a SecuritiesBalanceCustodyReport."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Statement54> forStatement54 = new MMConstraint<Statement54>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementBasisRule";
			definition = "If StatementBasis is used, then the statement requested must be a SecuritiesBalanceAccountingReport or a SecuritiesBalanceCustodyReport.";
			owner_lazy = () -> Statement54.mmObject();
		}

		@Override
		public void executeValidator(Statement54 obj) throws Exception {
			checkStatement54(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Statement16 Statement16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementBasisRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementBasis is used, then the statement requested must be a SecuritiesBalanceAccountingReport or a SecuritiesBalanceCustodyReport."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintStatementBasisRule#forStatement42
	 * ConstraintStatementBasisRule.forStatement42}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Statement16> forStatement16 = new MMConstraint<Statement16>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementBasisRule";
			definition = "If StatementBasis is used, then the statement requested must be a SecuritiesBalanceAccountingReport or a SecuritiesBalanceCustodyReport.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintStatementBasisRule.forStatement42);
			owner_lazy = () -> Statement16.mmObject();
		}

		@Override
		public void executeValidator(Statement16 obj) throws Exception {
			checkStatement16(obj);
		}
	};

	/**
	 * If StatementBasis is used, then the statement requested must be a
	 * SecuritiesBalanceAccountingReport or a SecuritiesBalanceCustodyReport.
	 */
	public static void checkStatement29(Statement29 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If StatementBasis is used, then the statement requested must be a
	 * SecuritiesBalanceAccountingReport or a SecuritiesBalanceCustodyReport.
	 */
	public static void checkStatement42(Statement42 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If StatementBasis is used, then the statement requested must be a
	 * SecuritiesBalanceAccountingReport or a SecuritiesBalanceCustodyReport.
	 */
	public static void checkStatement54(Statement54 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If StatementBasis is used, then the statement requested must be a
	 * SecuritiesBalanceAccountingReport or a SecuritiesBalanceCustodyReport.
	 */
	public static void checkStatement16(Statement16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}