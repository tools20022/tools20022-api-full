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
import com.tools20022.repository.area.seev.*;
import java.util.Arrays;

/**
 * If StatementGeneralDetails/ActivityIndicator is 'true' or '1' (Yes) then at
 * least one occurrence of
 * AccountAndStatementDetails/CorporateActionEventAndBalance must be present.<br>
 * If StatementGeneralDetails/ActivityIndicator is 'false' or '0' (No) then
 * AccountAndStatementDetails/CorporateActionEventAndBalance must not be present
 * in any occurrences of AccountAndStatementDetails.
 */
public class ConstraintCorporateActionEventAndBalanceRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatementReportV06
	 * CorporateActionInstructionStatementReportV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionEventAndBalanceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is 'true' or '1' (Yes) then at least one occurrence of AccountAndStatementDetails/CorporateActionEventAndBalance must be present.\r\nIf StatementGeneralDetails/ActivityIndicator is 'false' or '0' (No) then AccountAndStatementDetails/CorporateActionEventAndBalance must not be present in any occurrences of AccountAndStatementDetails."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCorporateActionEventAndBalanceRule#forCorporateActionInstructionStatementReportV05
	 * ConstraintCorporateActionEventAndBalanceRule.
	 * forCorporateActionInstructionStatementReportV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionStatementReportV06> forCorporateActionInstructionStatementReportV06 = new MMConstraint<CorporateActionInstructionStatementReportV06>() {
		{
			validator = ConstraintCorporateActionEventAndBalanceRule::checkCorporateActionInstructionStatementReportV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionEventAndBalanceRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is 'true' or '1' (Yes) then at least one occurrence of AccountAndStatementDetails/CorporateActionEventAndBalance must be present.\r\nIf StatementGeneralDetails/ActivityIndicator is 'false' or '0' (No) then AccountAndStatementDetails/CorporateActionEventAndBalance must not be present in any occurrences of AccountAndStatementDetails.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCorporateActionEventAndBalanceRule.forCorporateActionInstructionStatementReportV05;
			owner_lazy = () -> CorporateActionInstructionStatementReportV06.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatementReport002V06
	 * CorporateActionInstructionStatementReport002V06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionEventAndBalanceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is 'true' or '1' (Yes) then at least one occurrence of AccountAndStatementDetails/CorporateActionEventAndBalance must be present.\r\nIf StatementGeneralDetails/ActivityIndicator is 'false' or '0' (No) then AccountAndStatementDetails/CorporateActionEventAndBalance must not be present in any occurrences of AccountAndStatementDetails."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionStatementReport002V06> forCorporateActionInstructionStatementReport002V06 = new MMConstraint<CorporateActionInstructionStatementReport002V06>() {
		{
			validator = ConstraintCorporateActionEventAndBalanceRule::checkCorporateActionInstructionStatementReport002V06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionEventAndBalanceRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is 'true' or '1' (Yes) then at least one occurrence of AccountAndStatementDetails/CorporateActionEventAndBalance must be present.\r\nIf StatementGeneralDetails/ActivityIndicator is 'false' or '0' (No) then AccountAndStatementDetails/CorporateActionEventAndBalance must not be present in any occurrences of AccountAndStatementDetails.";
			owner_lazy = () -> CorporateActionInstructionStatementReport002V06.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatementReportV05
	 * CorporateActionInstructionStatementReportV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionEventAndBalanceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is 'true' or '1' (Yes) then at least one occurrence of AccountAndStatementDetails/CorporateActionEventAndBalance must be present.\r\nIf StatementGeneralDetails/ActivityIndicator is 'false' or '0' (No) then AccountAndStatementDetails/CorporateActionEventAndBalance must not be present in any occurrences of AccountAndStatementDetails."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCorporateActionEventAndBalanceRule#forCorporateActionInstructionStatementReportV06
	 * ConstraintCorporateActionEventAndBalanceRule.
	 * forCorporateActionInstructionStatementReportV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCorporateActionEventAndBalanceRule#forCorporateActionInstructionStatementReportV04
	 * ConstraintCorporateActionEventAndBalanceRule.
	 * forCorporateActionInstructionStatementReportV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionStatementReportV05> forCorporateActionInstructionStatementReportV05 = new MMConstraint<CorporateActionInstructionStatementReportV05>() {
		{
			validator = ConstraintCorporateActionEventAndBalanceRule::checkCorporateActionInstructionStatementReportV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionEventAndBalanceRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is 'true' or '1' (Yes) then at least one occurrence of AccountAndStatementDetails/CorporateActionEventAndBalance must be present.\r\nIf StatementGeneralDetails/ActivityIndicator is 'false' or '0' (No) then AccountAndStatementDetails/CorporateActionEventAndBalance must not be present in any occurrences of AccountAndStatementDetails.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCorporateActionEventAndBalanceRule.forCorporateActionInstructionStatementReportV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCorporateActionEventAndBalanceRule.forCorporateActionInstructionStatementReportV04;
			owner_lazy = () -> CorporateActionInstructionStatementReportV05.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatementReportV01
	 * CorporateActionInstructionStatementReportV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionEventAndBalanceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is 1 or \"true\" then at least one occurrence of AccountAndStatementDetails/CorporateActionEventAndBalance must be present.\r\nIf StatementGeneralDetails/ActivityIndicator is 0 or \"false\" then AccountAndStatementDetails/CorporateActionEventAndBalance must not be present in any occurrences of AccountAndStatementDetails."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionStatementReportV01> forCorporateActionInstructionStatementReportV01 = new MMConstraint<CorporateActionInstructionStatementReportV01>() {
		{
			validator = ConstraintCorporateActionEventAndBalanceRule::checkCorporateActionInstructionStatementReportV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionEventAndBalanceRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is 1 or \"true\" then at least one occurrence of AccountAndStatementDetails/CorporateActionEventAndBalance must be present.\r\nIf StatementGeneralDetails/ActivityIndicator is 0 or \"false\" then AccountAndStatementDetails/CorporateActionEventAndBalance must not be present in any occurrences of AccountAndStatementDetails.";
			owner_lazy = () -> CorporateActionInstructionStatementReportV01.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatementReportV02
	 * CorporateActionInstructionStatementReportV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionEventAndBalanceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is 1 or \"true\" then at least one occurrence of AccountAndStatementDetails/CorporateActionEventAndBalance must be present.\r\nIf StatementGeneralDetails/ActivityIndicator is 0 or \"false\" then AccountAndStatementDetails/CorporateActionEventAndBalance must not be present in any occurrences of AccountAndStatementDetails."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionStatementReportV02> forCorporateActionInstructionStatementReportV02 = new MMConstraint<CorporateActionInstructionStatementReportV02>() {
		{
			validator = ConstraintCorporateActionEventAndBalanceRule::checkCorporateActionInstructionStatementReportV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionEventAndBalanceRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is 1 or \"true\" then at least one occurrence of AccountAndStatementDetails/CorporateActionEventAndBalance must be present.\r\nIf StatementGeneralDetails/ActivityIndicator is 0 or \"false\" then AccountAndStatementDetails/CorporateActionEventAndBalance must not be present in any occurrences of AccountAndStatementDetails.";
			owner_lazy = () -> CorporateActionInstructionStatementReportV02.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatementReportV03
	 * CorporateActionInstructionStatementReportV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionEventAndBalanceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is 1 or \"true\" then at least one occurrence of AccountAndStatementDetails/CorporateActionEventAndBalance must be present.\r\nIf StatementGeneralDetails/ActivityIndicator is 0 or \"false\" then AccountAndStatementDetails/CorporateActionEventAndBalance must not be present in any occurrences of AccountAndStatementDetails."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionStatementReportV03> forCorporateActionInstructionStatementReportV03 = new MMConstraint<CorporateActionInstructionStatementReportV03>() {
		{
			validator = ConstraintCorporateActionEventAndBalanceRule::checkCorporateActionInstructionStatementReportV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionEventAndBalanceRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is 1 or \"true\" then at least one occurrence of AccountAndStatementDetails/CorporateActionEventAndBalance must be present.\r\nIf StatementGeneralDetails/ActivityIndicator is 0 or \"false\" then AccountAndStatementDetails/CorporateActionEventAndBalance must not be present in any occurrences of AccountAndStatementDetails.";
			owner_lazy = () -> CorporateActionInstructionStatementReportV03.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatementReportV04
	 * CorporateActionInstructionStatementReportV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionEventAndBalanceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatementGeneralDetails/ActivityIndicator is 1 or \"true\" then at least one occurrence of AccountAndStatementDetails/CorporateActionEventAndBalance must be present.\r\nIf StatementGeneralDetails/ActivityIndicator is 0 or \"false\" then AccountAndStatementDetails/CorporateActionEventAndBalance must not be present in any occurrences of AccountAndStatementDetails."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCorporateActionEventAndBalanceRule#forCorporateActionInstructionStatementReportV05
	 * ConstraintCorporateActionEventAndBalanceRule.
	 * forCorporateActionInstructionStatementReportV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionStatementReportV04> forCorporateActionInstructionStatementReportV04 = new MMConstraint<CorporateActionInstructionStatementReportV04>() {
		{
			validator = ConstraintCorporateActionEventAndBalanceRule::checkCorporateActionInstructionStatementReportV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionEventAndBalanceRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is 1 or \"true\" then at least one occurrence of AccountAndStatementDetails/CorporateActionEventAndBalance must be present.\r\nIf StatementGeneralDetails/ActivityIndicator is 0 or \"false\" then AccountAndStatementDetails/CorporateActionEventAndBalance must not be present in any occurrences of AccountAndStatementDetails.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCorporateActionEventAndBalanceRule.forCorporateActionInstructionStatementReportV05);
			owner_lazy = () -> CorporateActionInstructionStatementReportV04.mmObject();
		}
	};

	/**
	 * If StatementGeneralDetails/ActivityIndicator is 'true' or '1' (Yes) then
	 * at least one occurrence of
	 * AccountAndStatementDetails/CorporateActionEventAndBalance must be
	 * present.<br>
	 * If StatementGeneralDetails/ActivityIndicator is 'false' or '0' (No) then
	 * AccountAndStatementDetails/CorporateActionEventAndBalance must not be
	 * present in any occurrences of AccountAndStatementDetails.
	 */
	public static void checkCorporateActionInstructionStatementReportV06(CorporateActionInstructionStatementReportV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If StatementGeneralDetails/ActivityIndicator is 'true' or '1' (Yes) then
	 * at least one occurrence of
	 * AccountAndStatementDetails/CorporateActionEventAndBalance must be
	 * present.<br>
	 * If StatementGeneralDetails/ActivityIndicator is 'false' or '0' (No) then
	 * AccountAndStatementDetails/CorporateActionEventAndBalance must not be
	 * present in any occurrences of AccountAndStatementDetails.
	 */
	public static void checkCorporateActionInstructionStatementReport002V06(CorporateActionInstructionStatementReport002V06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If StatementGeneralDetails/ActivityIndicator is 'true' or '1' (Yes) then
	 * at least one occurrence of
	 * AccountAndStatementDetails/CorporateActionEventAndBalance must be
	 * present.<br>
	 * If StatementGeneralDetails/ActivityIndicator is 'false' or '0' (No) then
	 * AccountAndStatementDetails/CorporateActionEventAndBalance must not be
	 * present in any occurrences of AccountAndStatementDetails.
	 */
	public static void checkCorporateActionInstructionStatementReportV05(CorporateActionInstructionStatementReportV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If StatementGeneralDetails/ActivityIndicator is 1 or "true" then at least
	 * one occurrence of
	 * AccountAndStatementDetails/CorporateActionEventAndBalance must be
	 * present.<br>
	 * If StatementGeneralDetails/ActivityIndicator is 0 or "false" then
	 * AccountAndStatementDetails/CorporateActionEventAndBalance must not be
	 * present in any occurrences of AccountAndStatementDetails.
	 */
	public static void checkCorporateActionInstructionStatementReportV01(CorporateActionInstructionStatementReportV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If StatementGeneralDetails/ActivityIndicator is 1 or "true" then at least
	 * one occurrence of
	 * AccountAndStatementDetails/CorporateActionEventAndBalance must be
	 * present.<br>
	 * If StatementGeneralDetails/ActivityIndicator is 0 or "false" then
	 * AccountAndStatementDetails/CorporateActionEventAndBalance must not be
	 * present in any occurrences of AccountAndStatementDetails.
	 */
	public static void checkCorporateActionInstructionStatementReportV02(CorporateActionInstructionStatementReportV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If StatementGeneralDetails/ActivityIndicator is 1 or "true" then at least
	 * one occurrence of
	 * AccountAndStatementDetails/CorporateActionEventAndBalance must be
	 * present.<br>
	 * If StatementGeneralDetails/ActivityIndicator is 0 or "false" then
	 * AccountAndStatementDetails/CorporateActionEventAndBalance must not be
	 * present in any occurrences of AccountAndStatementDetails.
	 */
	public static void checkCorporateActionInstructionStatementReportV03(CorporateActionInstructionStatementReportV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If StatementGeneralDetails/ActivityIndicator is 1 or "true" then at least
	 * one occurrence of
	 * AccountAndStatementDetails/CorporateActionEventAndBalance must be
	 * present.<br>
	 * If StatementGeneralDetails/ActivityIndicator is 0 or "false" then
	 * AccountAndStatementDetails/CorporateActionEventAndBalance must not be
	 * present in any occurrences of AccountAndStatementDetails.
	 */
	public static void checkCorporateActionInstructionStatementReportV04(CorporateActionInstructionStatementReportV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}