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
 * FundDetails may be present if a single investment fund is associated to the
 * investment account. If several investment funds are associated to the
 * investment account, the FundFamilyName only should be specified.
 */
public class ConstraintFundDetailsGuideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount49
	 * InvestmentAccount49}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundDetailsGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "FundDetails may be present if a single investment fund is associated to the investment account. If several investment funds are associated to the investment account, the FundFamilyName only should be specified."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFinancialInstrumentDetailsGuideline#forInvestmentAccount61
	 * ConstraintFinancialInstrumentDetailsGuideline.forInvestmentAccount61}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFundDetailsGuideline#forInvestmentAccount37
	 * ConstraintFundDetailsGuideline.forInvestmentAccount37}</li>
	 * </ul>
	 */
	public static final MMConstraint<InvestmentAccount49> forInvestmentAccount49 = new MMConstraint<InvestmentAccount49>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundDetailsGuideline";
			definition = "FundDetails may be present if a single investment fund is associated to the investment account. If several investment funds are associated to the investment account, the FundFamilyName only should be specified.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintFinancialInstrumentDetailsGuideline.forInvestmentAccount61);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintFundDetailsGuideline.forInvestmentAccount37;
			owner_lazy = () -> InvestmentAccount49.mmObject();
		}

		@Override
		public void executeValidator(InvestmentAccount49 obj) throws Exception {
			checkInvestmentAccount49(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount38
	 * InvestmentAccount38}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundDetailsGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "FundDetails may be present if a single investment fund is associated to the investment account. If several investment funds are associated to the investment account, the FundFamilyName only should be specified."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFundDetailsGuideline#forInvestmentAccount46
	 * ConstraintFundDetailsGuideline.forInvestmentAccount46}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFundDetailsGuideline#forInvestmentAccount35
	 * ConstraintFundDetailsGuideline.forInvestmentAccount35}</li>
	 * </ul>
	 */
	public static final MMConstraint<InvestmentAccount38> forInvestmentAccount38 = new MMConstraint<InvestmentAccount38>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundDetailsGuideline";
			definition = "FundDetails may be present if a single investment fund is associated to the investment account. If several investment funds are associated to the investment account, the FundFamilyName only should be specified.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintFundDetailsGuideline.forInvestmentAccount46);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintFundDetailsGuideline.forInvestmentAccount35;
			owner_lazy = () -> InvestmentAccount38.mmObject();
		}

		@Override
		public void executeValidator(InvestmentAccount38 obj) throws Exception {
			checkInvestmentAccount38(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount46
	 * InvestmentAccount46}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundDetailsGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "FundDetails may be present if a single investment fund is associated to the investment account. If several investment funds are associated to the investment account, the FundFamilyName only should be specified."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFundDetailsGuideline#forInvestmentAccount50
	 * ConstraintFundDetailsGuideline.forInvestmentAccount50}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFundDetailsGuideline#forInvestmentAccount38
	 * ConstraintFundDetailsGuideline.forInvestmentAccount38}</li>
	 * </ul>
	 */
	public static final MMConstraint<InvestmentAccount46> forInvestmentAccount46 = new MMConstraint<InvestmentAccount46>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundDetailsGuideline";
			definition = "FundDetails may be present if a single investment fund is associated to the investment account. If several investment funds are associated to the investment account, the FundFamilyName only should be specified.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintFundDetailsGuideline.forInvestmentAccount50);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintFundDetailsGuideline.forInvestmentAccount38;
			owner_lazy = () -> InvestmentAccount46.mmObject();
		}

		@Override
		public void executeValidator(InvestmentAccount46 obj) throws Exception {
			checkInvestmentAccount46(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount16
	 * InvestmentAccount16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundDetailsGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "FundDetails may be present if a single investment fund is associated to the investment account. If several investment funds are associated to the investment account, the FundFamilyName only should be specified."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<InvestmentAccount16> forInvestmentAccount16 = new MMConstraint<InvestmentAccount16>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundDetailsGuideline";
			definition = "FundDetails may be present if a single investment fund is associated to the investment account. If several investment funds are associated to the investment account, the FundFamilyName only should be specified.";
			owner_lazy = () -> InvestmentAccount16.mmObject();
		}

		@Override
		public void executeValidator(InvestmentAccount16 obj) throws Exception {
			checkInvestmentAccount16(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35
	 * InvestmentAccount35}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundDetailsGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "FundDetails may be present if a single investment fund is associated to the investment account. If several investment funds are associated to the investment account, the FundFamilyName only should be specified."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFundDetailsGuideline#forInvestmentAccount38
	 * ConstraintFundDetailsGuideline.forInvestmentAccount38}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<InvestmentAccount35> forInvestmentAccount35 = new MMConstraint<InvestmentAccount35>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundDetailsGuideline";
			definition = "FundDetails may be present if a single investment fund is associated to the investment account. If several investment funds are associated to the investment account, the FundFamilyName only should be specified.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintFundDetailsGuideline.forInvestmentAccount38);
			owner_lazy = () -> InvestmentAccount35.mmObject();
		}

		@Override
		public void executeValidator(InvestmentAccount35 obj) throws Exception {
			checkInvestmentAccount35(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount34
	 * InvestmentAccount34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundDetailsGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "FundDetails may be present if a single investment fund is associated to the investment account. If several investment funds are associated to the investment account, the FundFamilyName only should be specified."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFundDetailsGuideline#forInvestmentAccount37
	 * ConstraintFundDetailsGuideline.forInvestmentAccount37}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<InvestmentAccount34> forInvestmentAccount34 = new MMConstraint<InvestmentAccount34>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundDetailsGuideline";
			definition = "FundDetails may be present if a single investment fund is associated to the investment account. If several investment funds are associated to the investment account, the FundFamilyName only should be specified.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintFundDetailsGuideline.forInvestmentAccount37);
			owner_lazy = () -> InvestmentAccount34.mmObject();
		}

		@Override
		public void executeValidator(InvestmentAccount34 obj) throws Exception {
			checkInvestmentAccount34(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount37
	 * InvestmentAccount37}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundDetailsGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "FundDetails may be present if a single investment fund is associated to the investment account. If several investment funds are associated to the investment account, the FundFamilyName only should be specified."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFundDetailsGuideline#forInvestmentAccount49
	 * ConstraintFundDetailsGuideline.forInvestmentAccount49}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFundDetailsGuideline#forInvestmentAccount34
	 * ConstraintFundDetailsGuideline.forInvestmentAccount34}</li>
	 * </ul>
	 */
	public static final MMConstraint<InvestmentAccount37> forInvestmentAccount37 = new MMConstraint<InvestmentAccount37>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundDetailsGuideline";
			definition = "FundDetails may be present if a single investment fund is associated to the investment account. If several investment funds are associated to the investment account, the FundFamilyName only should be specified.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintFundDetailsGuideline.forInvestmentAccount49);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintFundDetailsGuideline.forInvestmentAccount34;
			owner_lazy = () -> InvestmentAccount37.mmObject();
		}

		@Override
		public void executeValidator(InvestmentAccount37 obj) throws Exception {
			checkInvestmentAccount37(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount51
	 * InvestmentAccount51}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundDetailsGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "FundDetails may be present if a single investment fund is associated to the investment account. If several investment funds are associated to the investment account, the FundFamilyName only should be specified."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFinancialInstrumentDetailsGuideline#forInvestmentAccount63
	 * ConstraintFinancialInstrumentDetailsGuideline.forInvestmentAccount63}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFundDetailsGuideline#forInvestmentAccount47
	 * ConstraintFundDetailsGuideline.forInvestmentAccount47}</li>
	 * </ul>
	 */
	public static final MMConstraint<InvestmentAccount51> forInvestmentAccount51 = new MMConstraint<InvestmentAccount51>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundDetailsGuideline";
			definition = "FundDetails may be present if a single investment fund is associated to the investment account. If several investment funds are associated to the investment account, the FundFamilyName only should be specified.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintFinancialInstrumentDetailsGuideline.forInvestmentAccount63);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintFundDetailsGuideline.forInvestmentAccount47;
			owner_lazy = () -> InvestmentAccount51.mmObject();
		}

		@Override
		public void executeValidator(InvestmentAccount51 obj) throws Exception {
			checkInvestmentAccount51(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount26
	 * InvestmentAccount26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundDetailsGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "FundDetails may be present if a single investment fund is associated to the investment account. If several investment funds are associated to the investment account, the FundFamilyName only should be specified."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<InvestmentAccount26> forInvestmentAccount26 = new MMConstraint<InvestmentAccount26>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundDetailsGuideline";
			definition = "FundDetails may be present if a single investment fund is associated to the investment account. If several investment funds are associated to the investment account, the FundFamilyName only should be specified.";
			owner_lazy = () -> InvestmentAccount26.mmObject();
		}

		@Override
		public void executeValidator(InvestmentAccount26 obj) throws Exception {
			checkInvestmentAccount26(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18
	 * InvestmentAccount18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundDetailsGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "FundDetails may be present if a single investment fund is associated to the investment account. If several investment funds are associated to the investment account, the FundFamilyName only should be specified."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<InvestmentAccount18> forInvestmentAccount18 = new MMConstraint<InvestmentAccount18>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundDetailsGuideline";
			definition = "FundDetails may be present if a single investment fund is associated to the investment account. If several investment funds are associated to the investment account, the FundFamilyName only should be specified.";
			owner_lazy = () -> InvestmentAccount18.mmObject();
		}

		@Override
		public void executeValidator(InvestmentAccount18 obj) throws Exception {
			checkInvestmentAccount18(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount39
	 * InvestmentAccount39}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundDetailsGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "FundDetails may be present if a single investment fund is associated to the investment account. If several investment funds are associated to the investment account, the FundFamilyName only should be specified."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFundDetailsGuideline#forInvestmentAccount47
	 * ConstraintFundDetailsGuideline.forInvestmentAccount47}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFundDetailsGuideline#forInvestmentAccount36
	 * ConstraintFundDetailsGuideline.forInvestmentAccount36}</li>
	 * </ul>
	 */
	public static final MMConstraint<InvestmentAccount39> forInvestmentAccount39 = new MMConstraint<InvestmentAccount39>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundDetailsGuideline";
			definition = "FundDetails may be present if a single investment fund is associated to the investment account. If several investment funds are associated to the investment account, the FundFamilyName only should be specified.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintFundDetailsGuideline.forInvestmentAccount47);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintFundDetailsGuideline.forInvestmentAccount36;
			owner_lazy = () -> InvestmentAccount39.mmObject();
		}

		@Override
		public void executeValidator(InvestmentAccount39 obj) throws Exception {
			checkInvestmentAccount39(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50
	 * InvestmentAccount50}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundDetailsGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "FundDetails may be present if a single investment fund is associated to the investment account. If several investment funds are associated to the investment account, the FundFamilyName only should be specified."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFinancialInstrumentDetailsGuideline#forInvestmentAccount62
	 * ConstraintFinancialInstrumentDetailsGuideline.forInvestmentAccount62}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFundDetailsGuideline#forInvestmentAccount46
	 * ConstraintFundDetailsGuideline.forInvestmentAccount46}</li>
	 * </ul>
	 */
	public static final MMConstraint<InvestmentAccount50> forInvestmentAccount50 = new MMConstraint<InvestmentAccount50>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundDetailsGuideline";
			definition = "FundDetails may be present if a single investment fund is associated to the investment account. If several investment funds are associated to the investment account, the FundFamilyName only should be specified.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintFinancialInstrumentDetailsGuideline.forInvestmentAccount62);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintFundDetailsGuideline.forInvestmentAccount46;
			owner_lazy = () -> InvestmentAccount50.mmObject();
		}

		@Override
		public void executeValidator(InvestmentAccount50 obj) throws Exception {
			checkInvestmentAccount50(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount27
	 * InvestmentAccount27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundDetailsGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "FundDetails may be present if a single investment fund is associated to the investment account. If several investment funds are associated to the investment account, the FundFamilyName only should be specified."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<InvestmentAccount27> forInvestmentAccount27 = new MMConstraint<InvestmentAccount27>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundDetailsGuideline";
			definition = "FundDetails may be present if a single investment fund is associated to the investment account. If several investment funds are associated to the investment account, the FundFamilyName only should be specified.";
			owner_lazy = () -> InvestmentAccount27.mmObject();
		}

		@Override
		public void executeValidator(InvestmentAccount27 obj) throws Exception {
			checkInvestmentAccount27(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount28
	 * InvestmentAccount28}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundDetailsGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "FundDetails may be present if a single investment fund is associated to the investment account. If several investment funds are associated to the investment account, the FundFamilyName only should be specified."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<InvestmentAccount28> forInvestmentAccount28 = new MMConstraint<InvestmentAccount28>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundDetailsGuideline";
			definition = "FundDetails may be present if a single investment fund is associated to the investment account. If several investment funds are associated to the investment account, the FundFamilyName only should be specified.";
			owner_lazy = () -> InvestmentAccount28.mmObject();
		}

		@Override
		public void executeValidator(InvestmentAccount28 obj) throws Exception {
			checkInvestmentAccount28(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount47
	 * InvestmentAccount47}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundDetailsGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "FundDetails may be present if a single investment fund is associated to the investment account. If several investment funds are associated to the investment account, the FundFamilyName only should be specified."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFundDetailsGuideline#forInvestmentAccount51
	 * ConstraintFundDetailsGuideline.forInvestmentAccount51}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFundDetailsGuideline#forInvestmentAccount39
	 * ConstraintFundDetailsGuideline.forInvestmentAccount39}</li>
	 * </ul>
	 */
	public static final MMConstraint<InvestmentAccount47> forInvestmentAccount47 = new MMConstraint<InvestmentAccount47>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundDetailsGuideline";
			definition = "FundDetails may be present if a single investment fund is associated to the investment account. If several investment funds are associated to the investment account, the FundFamilyName only should be specified.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintFundDetailsGuideline.forInvestmentAccount51);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintFundDetailsGuideline.forInvestmentAccount39;
			owner_lazy = () -> InvestmentAccount47.mmObject();
		}

		@Override
		public void executeValidator(InvestmentAccount47 obj) throws Exception {
			checkInvestmentAccount47(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount36
	 * InvestmentAccount36}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundDetailsGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "FundDetails may be present if a single investment fund is associated to the investment account. If several investment funds are associated to the investment account, the FundFamilyName only should be specified."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFundDetailsGuideline#forInvestmentAccount39
	 * ConstraintFundDetailsGuideline.forInvestmentAccount39}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<InvestmentAccount36> forInvestmentAccount36 = new MMConstraint<InvestmentAccount36>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundDetailsGuideline";
			definition = "FundDetails may be present if a single investment fund is associated to the investment account. If several investment funds are associated to the investment account, the FundFamilyName only should be specified.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintFundDetailsGuideline.forInvestmentAccount39);
			owner_lazy = () -> InvestmentAccount36.mmObject();
		}

		@Override
		public void executeValidator(InvestmentAccount36 obj) throws Exception {
			checkInvestmentAccount36(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount17
	 * InvestmentAccount17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundDetailsGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "FundDetails may be present if a single investment fund is associated to the investment account. If several investment funds are associated to the investment account, the FundFamilyName only should be specified."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<InvestmentAccount17> forInvestmentAccount17 = new MMConstraint<InvestmentAccount17>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundDetailsGuideline";
			definition = "FundDetails may be present if a single investment fund is associated to the investment account. If several investment funds are associated to the investment account, the FundFamilyName only should be specified.";
			owner_lazy = () -> InvestmentAccount17.mmObject();
		}

		@Override
		public void executeValidator(InvestmentAccount17 obj) throws Exception {
			checkInvestmentAccount17(obj);
		}
	};

	/**
	 * FundDetails may be present if a single investment fund is associated to
	 * the investment account. If several investment funds are associated to the
	 * investment account, the FundFamilyName only should be specified.
	 */
	public static void checkInvestmentAccount49(InvestmentAccount49 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * FundDetails may be present if a single investment fund is associated to
	 * the investment account. If several investment funds are associated to the
	 * investment account, the FundFamilyName only should be specified.
	 */
	public static void checkInvestmentAccount38(InvestmentAccount38 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * FundDetails may be present if a single investment fund is associated to
	 * the investment account. If several investment funds are associated to the
	 * investment account, the FundFamilyName only should be specified.
	 */
	public static void checkInvestmentAccount46(InvestmentAccount46 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * FundDetails may be present if a single investment fund is associated to
	 * the investment account. If several investment funds are associated to the
	 * investment account, the FundFamilyName only should be specified.
	 */
	public static void checkInvestmentAccount16(InvestmentAccount16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * FundDetails may be present if a single investment fund is associated to
	 * the investment account. If several investment funds are associated to the
	 * investment account, the FundFamilyName only should be specified.
	 */
	public static void checkInvestmentAccount35(InvestmentAccount35 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * FundDetails may be present if a single investment fund is associated to
	 * the investment account. If several investment funds are associated to the
	 * investment account, the FundFamilyName only should be specified.
	 */
	public static void checkInvestmentAccount34(InvestmentAccount34 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * FundDetails may be present if a single investment fund is associated to
	 * the investment account. If several investment funds are associated to the
	 * investment account, the FundFamilyName only should be specified.
	 */
	public static void checkInvestmentAccount37(InvestmentAccount37 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * FundDetails may be present if a single investment fund is associated to
	 * the investment account. If several investment funds are associated to the
	 * investment account, the FundFamilyName only should be specified.
	 */
	public static void checkInvestmentAccount51(InvestmentAccount51 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * FundDetails may be present if a single investment fund is associated to
	 * the investment account. If several investment funds are associated to the
	 * investment account, the FundFamilyName only should be specified.
	 */
	public static void checkInvestmentAccount26(InvestmentAccount26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * FundDetails may be present if a single investment fund is associated to
	 * the investment account. If several investment funds are associated to the
	 * investment account, the FundFamilyName only should be specified.
	 */
	public static void checkInvestmentAccount18(InvestmentAccount18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * FundDetails may be present if a single investment fund is associated to
	 * the investment account. If several investment funds are associated to the
	 * investment account, the FundFamilyName only should be specified.
	 */
	public static void checkInvestmentAccount39(InvestmentAccount39 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * FundDetails may be present if a single investment fund is associated to
	 * the investment account. If several investment funds are associated to the
	 * investment account, the FundFamilyName only should be specified.
	 */
	public static void checkInvestmentAccount50(InvestmentAccount50 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * FundDetails may be present if a single investment fund is associated to
	 * the investment account. If several investment funds are associated to the
	 * investment account, the FundFamilyName only should be specified.
	 */
	public static void checkInvestmentAccount27(InvestmentAccount27 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * FundDetails may be present if a single investment fund is associated to
	 * the investment account. If several investment funds are associated to the
	 * investment account, the FundFamilyName only should be specified.
	 */
	public static void checkInvestmentAccount28(InvestmentAccount28 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * FundDetails may be present if a single investment fund is associated to
	 * the investment account. If several investment funds are associated to the
	 * investment account, the FundFamilyName only should be specified.
	 */
	public static void checkInvestmentAccount47(InvestmentAccount47 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * FundDetails may be present if a single investment fund is associated to
	 * the investment account. If several investment funds are associated to the
	 * investment account, the FundFamilyName only should be specified.
	 */
	public static void checkInvestmentAccount36(InvestmentAccount36 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * FundDetails may be present if a single investment fund is associated to
	 * the investment account. If several investment funds are associated to the
	 * investment account, the FundFamilyName only should be specified.
	 */
	public static void checkInvestmentAccount17(InvestmentAccount17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}