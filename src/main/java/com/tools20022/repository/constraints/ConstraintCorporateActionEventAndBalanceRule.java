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
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatementReport002V05
	 * CorporateActionInstructionStatementReport002V05}</li>
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
	public static final MMConstraint<CorporateActionInstructionStatementReport002V05> for_seev_CorporateActionInstructionStatementReport002V05 = new MMConstraint<CorporateActionInstructionStatementReport002V05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionEventAndBalanceRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is 'true' or '1' (Yes) then at least one occurrence of AccountAndStatementDetails/CorporateActionEventAndBalance must be present.\r\nIf StatementGeneralDetails/ActivityIndicator is 'false' or '0' (No) then AccountAndStatementDetails/CorporateActionEventAndBalance must not be present in any occurrences of AccountAndStatementDetails.";
			owner_lazy = () -> CorporateActionInstructionStatementReport002V05.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionStatementReport002V05 obj) throws Exception {
			check_seev_CorporateActionInstructionStatementReport002V05(obj);
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCorporateActionEventAndBalanceRule#for_seev_CorporateActionInstructionStatementReportV06
	 * ConstraintCorporateActionEventAndBalanceRule.
	 * for_seev_CorporateActionInstructionStatementReportV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCorporateActionEventAndBalanceRule#for_seev_CorporateActionInstructionStatementReportV04
	 * ConstraintCorporateActionEventAndBalanceRule.
	 * for_seev_CorporateActionInstructionStatementReportV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionStatementReportV05> for_seev_CorporateActionInstructionStatementReportV05 = new MMConstraint<CorporateActionInstructionStatementReportV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionEventAndBalanceRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is 'true' or '1' (Yes) then at least one occurrence of AccountAndStatementDetails/CorporateActionEventAndBalance must be present.\r\nIf StatementGeneralDetails/ActivityIndicator is 'false' or '0' (No) then AccountAndStatementDetails/CorporateActionEventAndBalance must not be present in any occurrences of AccountAndStatementDetails.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCorporateActionEventAndBalanceRule.for_seev_CorporateActionInstructionStatementReportV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCorporateActionEventAndBalanceRule.for_seev_CorporateActionInstructionStatementReportV04;
			owner_lazy = () -> CorporateActionInstructionStatementReportV05.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionStatementReportV05 obj) throws Exception {
			check_seev_CorporateActionInstructionStatementReportV05(obj);
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
	public static final MMConstraint<CorporateActionInstructionStatementReportV01> for_seev_CorporateActionInstructionStatementReportV01 = new MMConstraint<CorporateActionInstructionStatementReportV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionEventAndBalanceRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is 1 or \"true\" then at least one occurrence of AccountAndStatementDetails/CorporateActionEventAndBalance must be present.\r\nIf StatementGeneralDetails/ActivityIndicator is 0 or \"false\" then AccountAndStatementDetails/CorporateActionEventAndBalance must not be present in any occurrences of AccountAndStatementDetails.";
			owner_lazy = () -> CorporateActionInstructionStatementReportV01.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionStatementReportV01 obj) throws Exception {
			check_seev_CorporateActionInstructionStatementReportV01(obj);
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCorporateActionEventAndBalanceRule#for_seev_CorporateActionInstructionStatementReportV05
	 * ConstraintCorporateActionEventAndBalanceRule.
	 * for_seev_CorporateActionInstructionStatementReportV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionStatementReportV04> for_seev_CorporateActionInstructionStatementReportV04 = new MMConstraint<CorporateActionInstructionStatementReportV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionEventAndBalanceRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is 1 or \"true\" then at least one occurrence of AccountAndStatementDetails/CorporateActionEventAndBalance must be present.\r\nIf StatementGeneralDetails/ActivityIndicator is 0 or \"false\" then AccountAndStatementDetails/CorporateActionEventAndBalance must not be present in any occurrences of AccountAndStatementDetails.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCorporateActionEventAndBalanceRule.for_seev_CorporateActionInstructionStatementReportV05);
			owner_lazy = () -> CorporateActionInstructionStatementReportV04.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionStatementReportV04 obj) throws Exception {
			check_seev_CorporateActionInstructionStatementReportV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatementReport002V07
	 * CorporateActionInstructionStatementReport002V07}</li>
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
	public static final MMConstraint<CorporateActionInstructionStatementReport002V07> for_seev_CorporateActionInstructionStatementReport002V07 = new MMConstraint<CorporateActionInstructionStatementReport002V07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionEventAndBalanceRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is 'true' or '1' (Yes) then at least one occurrence of AccountAndStatementDetails/CorporateActionEventAndBalance must be present.\r\nIf StatementGeneralDetails/ActivityIndicator is 'false' or '0' (No) then AccountAndStatementDetails/CorporateActionEventAndBalance must not be present in any occurrences of AccountAndStatementDetails.";
			owner_lazy = () -> CorporateActionInstructionStatementReport002V07.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionStatementReport002V07 obj) throws Exception {
			check_seev_CorporateActionInstructionStatementReport002V07(obj);
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCorporateActionEventAndBalanceRule#for_seev_CorporateActionInstructionStatementReportV07
	 * ConstraintCorporateActionEventAndBalanceRule.
	 * for_seev_CorporateActionInstructionStatementReportV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCorporateActionEventAndBalanceRule#for_seev_CorporateActionInstructionStatementReportV05
	 * ConstraintCorporateActionEventAndBalanceRule.
	 * for_seev_CorporateActionInstructionStatementReportV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionStatementReportV06> for_seev_CorporateActionInstructionStatementReportV06 = new MMConstraint<CorporateActionInstructionStatementReportV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionEventAndBalanceRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is 'true' or '1' (Yes) then at least one occurrence of AccountAndStatementDetails/CorporateActionEventAndBalance must be present.\r\nIf StatementGeneralDetails/ActivityIndicator is 'false' or '0' (No) then AccountAndStatementDetails/CorporateActionEventAndBalance must not be present in any occurrences of AccountAndStatementDetails.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCorporateActionEventAndBalanceRule.for_seev_CorporateActionInstructionStatementReportV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCorporateActionEventAndBalanceRule.for_seev_CorporateActionInstructionStatementReportV05;
			owner_lazy = () -> CorporateActionInstructionStatementReportV06.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionStatementReportV06 obj) throws Exception {
			check_seev_CorporateActionInstructionStatementReportV06(obj);
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
	public static final MMConstraint<CorporateActionInstructionStatementReportV02> for_seev_CorporateActionInstructionStatementReportV02 = new MMConstraint<CorporateActionInstructionStatementReportV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionEventAndBalanceRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is 1 or \"true\" then at least one occurrence of AccountAndStatementDetails/CorporateActionEventAndBalance must be present.\r\nIf StatementGeneralDetails/ActivityIndicator is 0 or \"false\" then AccountAndStatementDetails/CorporateActionEventAndBalance must not be present in any occurrences of AccountAndStatementDetails.";
			owner_lazy = () -> CorporateActionInstructionStatementReportV02.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionStatementReportV02 obj) throws Exception {
			check_seev_CorporateActionInstructionStatementReportV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatementReportV07
	 * CorporateActionInstructionStatementReportV07}</li>
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCorporateActionEventAndBalanceRule#for_seev_CorporateActionInstructionStatementReportV06
	 * ConstraintCorporateActionEventAndBalanceRule.
	 * for_seev_CorporateActionInstructionStatementReportV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionStatementReportV07> for_seev_CorporateActionInstructionStatementReportV07 = new MMConstraint<CorporateActionInstructionStatementReportV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionEventAndBalanceRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is 'true' or '1' (Yes) then at least one occurrence of AccountAndStatementDetails/CorporateActionEventAndBalance must be present.\r\nIf StatementGeneralDetails/ActivityIndicator is 'false' or '0' (No) then AccountAndStatementDetails/CorporateActionEventAndBalance must not be present in any occurrences of AccountAndStatementDetails.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCorporateActionEventAndBalanceRule.for_seev_CorporateActionInstructionStatementReportV06;
			owner_lazy = () -> CorporateActionInstructionStatementReportV07.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionStatementReportV07 obj) throws Exception {
			check_seev_CorporateActionInstructionStatementReportV07(obj);
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
	public static final MMConstraint<CorporateActionInstructionStatementReportV03> for_seev_CorporateActionInstructionStatementReportV03 = new MMConstraint<CorporateActionInstructionStatementReportV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionEventAndBalanceRule";
			definition = "If StatementGeneralDetails/ActivityIndicator is 1 or \"true\" then at least one occurrence of AccountAndStatementDetails/CorporateActionEventAndBalance must be present.\r\nIf StatementGeneralDetails/ActivityIndicator is 0 or \"false\" then AccountAndStatementDetails/CorporateActionEventAndBalance must not be present in any occurrences of AccountAndStatementDetails.";
			owner_lazy = () -> CorporateActionInstructionStatementReportV03.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionStatementReportV03 obj) throws Exception {
			check_seev_CorporateActionInstructionStatementReportV03(obj);
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
	public static void check_seev_CorporateActionInstructionStatementReport002V05(CorporateActionInstructionStatementReport002V05 obj) throws Exception {
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
	public static void check_seev_CorporateActionInstructionStatementReportV05(CorporateActionInstructionStatementReportV05 obj) throws Exception {
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
	public static void check_seev_CorporateActionInstructionStatementReportV01(CorporateActionInstructionStatementReportV01 obj) throws Exception {
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
	public static void check_seev_CorporateActionInstructionStatementReportV04(CorporateActionInstructionStatementReportV04 obj) throws Exception {
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
	public static void check_seev_CorporateActionInstructionStatementReport002V07(CorporateActionInstructionStatementReport002V07 obj) throws Exception {
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
	public static void check_seev_CorporateActionInstructionStatementReportV06(CorporateActionInstructionStatementReportV06 obj) throws Exception {
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
	public static void check_seev_CorporateActionInstructionStatementReportV02(CorporateActionInstructionStatementReportV02 obj) throws Exception {
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
	public static void check_seev_CorporateActionInstructionStatementReportV07(CorporateActionInstructionStatementReportV07 obj) throws Exception {
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
	public static void check_seev_CorporateActionInstructionStatementReportV03(CorporateActionInstructionStatementReportV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}