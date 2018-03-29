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
 * If ConfirmationDetails/ConfirmationType/Code is ACCO (AccountOpening), then
 * InvestmentAccount must be present.
 */
public class ConstraintInvestmentAccountRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07
	 * AccountDetailsConfirmationV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ConfirmationDetails/ConfirmationType/Code is ACCO (AccountOpening), then InvestmentAccount must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestmentAccountRule#forAccountDetailsConfirmationV06
	 * ConstraintInvestmentAccountRule.forAccountDetailsConfirmationV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountDetailsConfirmationV07> forAccountDetailsConfirmationV07 = new MMConstraint<AccountDetailsConfirmationV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentAccountRule";
			definition = "If ConfirmationDetails/ConfirmationType/Code is ACCO (AccountOpening), then InvestmentAccount must be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintInvestmentAccountRule.forAccountDetailsConfirmationV06;
			owner_lazy = () -> AccountDetailsConfirmationV07.mmObject();
		}

		@Override
		public void executeValidator(AccountDetailsConfirmationV07 obj) throws Exception {
			checkAccountDetailsConfirmationV07(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06
	 * AccountDetailsConfirmationV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ConfirmationDetails/ConfirmationType is ACCO (AccountOpening), then InvestmentAccount must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestmentAccountRule#forAccountDetailsConfirmationV07
	 * ConstraintInvestmentAccountRule.forAccountDetailsConfirmationV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestmentAccountRule#forAccountDetailsConfirmationV05
	 * ConstraintInvestmentAccountRule.forAccountDetailsConfirmationV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountDetailsConfirmationV06> forAccountDetailsConfirmationV06 = new MMConstraint<AccountDetailsConfirmationV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentAccountRule";
			definition = "If ConfirmationDetails/ConfirmationType is ACCO (AccountOpening), then InvestmentAccount must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInvestmentAccountRule.forAccountDetailsConfirmationV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintInvestmentAccountRule.forAccountDetailsConfirmationV05;
			owner_lazy = () -> AccountDetailsConfirmationV06.mmObject();
		}

		@Override
		public void executeValidator(AccountDetailsConfirmationV06 obj) throws Exception {
			checkAccountDetailsConfirmationV06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV02
	 * AccountDetailsConfirmationV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ConfirmationDetails/ConfirmationType is ACCO, then InvestmentAccount must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountDetailsConfirmationV02> forAccountDetailsConfirmationV02 = new MMConstraint<AccountDetailsConfirmationV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentAccountRule";
			definition = "If ConfirmationDetails/ConfirmationType is ACCO, then InvestmentAccount must be present.";
			owner_lazy = () -> AccountDetailsConfirmationV02.mmObject();
		}

		@Override
		public void executeValidator(AccountDetailsConfirmationV02 obj) throws Exception {
			checkAccountDetailsConfirmationV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV03
	 * AccountDetailsConfirmationV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ConfirmationDetails/ConfirmationType is ACCO, then InvestmentAccount must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestmentAccountRule#forAccountDetailsConfirmationV04
	 * ConstraintInvestmentAccountRule.forAccountDetailsConfirmationV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountDetailsConfirmationV03> forAccountDetailsConfirmationV03 = new MMConstraint<AccountDetailsConfirmationV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentAccountRule";
			definition = "If ConfirmationDetails/ConfirmationType is ACCO, then InvestmentAccount must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInvestmentAccountRule.forAccountDetailsConfirmationV04);
			owner_lazy = () -> AccountDetailsConfirmationV03.mmObject();
		}

		@Override
		public void executeValidator(AccountDetailsConfirmationV03 obj) throws Exception {
			checkAccountDetailsConfirmationV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV04
	 * AccountDetailsConfirmationV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ConfirmationDetails/ConfirmationType is ACCO, then InvestmentAccount must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestmentAccountRule#forAccountDetailsConfirmationV05
	 * ConstraintInvestmentAccountRule.forAccountDetailsConfirmationV05}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestmentAccountRule#forAccountDetailsConfirmationV03
	 * ConstraintInvestmentAccountRule.forAccountDetailsConfirmationV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountDetailsConfirmationV04> forAccountDetailsConfirmationV04 = new MMConstraint<AccountDetailsConfirmationV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentAccountRule";
			definition = "If ConfirmationDetails/ConfirmationType is ACCO, then InvestmentAccount must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInvestmentAccountRule.forAccountDetailsConfirmationV05);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintInvestmentAccountRule.forAccountDetailsConfirmationV03;
			owner_lazy = () -> AccountDetailsConfirmationV04.mmObject();
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
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05
	 * AccountDetailsConfirmationV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ConfirmationDetails/ConfirmationType is ACCO, then InvestmentAccount must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestmentAccountRule#forAccountDetailsConfirmationV06
	 * ConstraintInvestmentAccountRule.forAccountDetailsConfirmationV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestmentAccountRule#forAccountDetailsConfirmationV04
	 * ConstraintInvestmentAccountRule.forAccountDetailsConfirmationV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountDetailsConfirmationV05> forAccountDetailsConfirmationV05 = new MMConstraint<AccountDetailsConfirmationV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentAccountRule";
			definition = "If ConfirmationDetails/ConfirmationType is ACCO, then InvestmentAccount must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInvestmentAccountRule.forAccountDetailsConfirmationV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintInvestmentAccountRule.forAccountDetailsConfirmationV04;
			owner_lazy = () -> AccountDetailsConfirmationV05.mmObject();
		}

		@Override
		public void executeValidator(AccountDetailsConfirmationV05 obj) throws Exception {
			checkAccountDetailsConfirmationV05(obj);
		}
	};

	/**
	 * If ConfirmationDetails/ConfirmationType/Code is ACCO (AccountOpening),
	 * then InvestmentAccount must be present.
	 */
	public static void checkAccountDetailsConfirmationV07(AccountDetailsConfirmationV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ConfirmationDetails/ConfirmationType is ACCO (AccountOpening), then
	 * InvestmentAccount must be present.
	 */
	public static void checkAccountDetailsConfirmationV06(AccountDetailsConfirmationV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ConfirmationDetails/ConfirmationType is ACCO, then InvestmentAccount
	 * must be present.
	 */
	public static void checkAccountDetailsConfirmationV02(AccountDetailsConfirmationV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ConfirmationDetails/ConfirmationType is ACCO, then InvestmentAccount
	 * must be present.
	 */
	public static void checkAccountDetailsConfirmationV03(AccountDetailsConfirmationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ConfirmationDetails/ConfirmationType is ACCO, then InvestmentAccount
	 * must be present.
	 */
	public static void checkAccountDetailsConfirmationV04(AccountDetailsConfirmationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ConfirmationDetails/ConfirmationType is ACCO, then InvestmentAccount
	 * must be present.
	 */
	public static void checkAccountDetailsConfirmationV05(AccountDetailsConfirmationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}