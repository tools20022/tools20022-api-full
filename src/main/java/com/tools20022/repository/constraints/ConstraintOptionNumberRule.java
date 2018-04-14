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
import com.tools20022.repository.msg.*;
import java.util.Arrays;

/**
 * For differentiation between options, the OptionNumber must be used (preferred
 * rather than the OptionType, for example, in the case where two or more offers
 * can be described by the same corporate action option code). Therefore, the
 * OptionNumber value must be different for each option.
 */
public class ConstraintOptionNumberRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption116
	 * CorporateActionOption116}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For differentiation between options, the OptionNumber must be used (preferred rather than the OptionType, for example, in the case where two or more offers can be described by the same corporate action option code). Therefore, the OptionNumber value must be different for each option."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOptionNumberRule#forCorporateActionOption141
	 * ConstraintOptionNumberRule.forCorporateActionOption141}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOptionNumberRule#forCorporateActionOption41
	 * ConstraintOptionNumberRule.forCorporateActionOption41}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption116> forCorporateActionOption116 = new MMConstraint<CorporateActionOption116>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumberRule";
			definition = "For differentiation between options, the OptionNumber must be used (preferred rather than the OptionType, for example, in the case where two or more offers can be described by the same corporate action option code). Therefore, the OptionNumber value must be different for each option.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOptionNumberRule.forCorporateActionOption141);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOptionNumberRule.forCorporateActionOption41;
			owner_lazy = () -> CorporateActionOption116.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption116 obj) throws Exception {
			checkCorporateActionOption116(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV07
	 * CorporateActionMovementReversalAdviceV07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CorporateActionConfirmationDetails/OptionNumber value provided must be the same as the one provided into the related CorporateActionOptionDetails/OptionNumber element of the CorporateActionNotification or CorporateActionMovementPreliminaryAdvice messages previously sent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOptionNumberRule#for_seev_CorporateActionMovementReversalAdviceV08
	 * ConstraintOptionNumberRule.
	 * for_seev_CorporateActionMovementReversalAdviceV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOptionNumberRule#for_seev_CorporateActionMovementReversalAdviceV06
	 * ConstraintOptionNumberRule.
	 * for_seev_CorporateActionMovementReversalAdviceV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementReversalAdviceV07> for_seev_CorporateActionMovementReversalAdviceV07 = new MMConstraint<CorporateActionMovementReversalAdviceV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumberRule";
			definition = "The CorporateActionConfirmationDetails/OptionNumber value provided must be the same as the one provided into the related CorporateActionOptionDetails/OptionNumber element of the CorporateActionNotification or CorporateActionMovementPreliminaryAdvice messages previously sent.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOptionNumberRule.for_seev_CorporateActionMovementReversalAdviceV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOptionNumberRule.for_seev_CorporateActionMovementReversalAdviceV06;
			owner_lazy = () -> CorporateActionMovementReversalAdviceV07.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementReversalAdviceV07 obj) throws Exception {
			check_seev_CorporateActionMovementReversalAdviceV07(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption144
	 * CorporateActionOption144}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For differentiation between options, the OptionNumber rather than the OptionType must be used, for example, in the case where two or more offers can be described by the same corporate action option code. Therefore, the OptionNumber value must be different for each option."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption144> forCorporateActionOption144 = new MMConstraint<CorporateActionOption144>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumberRule";
			definition = "For differentiation between options, the OptionNumber rather than the OptionType must be used, for example, in the case where two or more offers can be described by the same corporate action option code. Therefore, the OptionNumber value must be different for each option.";
			owner_lazy = () -> CorporateActionOption144.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption144 obj) throws Exception {
			checkCorporateActionOption144(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV03
	 * CorporateActionMovementConfirmationV03}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CorporateActionConfirmationDetails/OptionNumber value provided must be the same as the one provided into the related CorporateActionOptionDetails/OptionNumber element of the CorporateActionNotification or CorporateActionMovementPreliminaryAdvice messages previously sent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementConfirmationV03> for_seev_CorporateActionMovementConfirmationV03 = new MMConstraint<CorporateActionMovementConfirmationV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumberRule";
			definition = "The CorporateActionConfirmationDetails/OptionNumber value provided must be the same as the one provided into the related CorporateActionOptionDetails/OptionNumber element of the CorporateActionNotification or CorporateActionMovementPreliminaryAdvice messages previously sent.";
			owner_lazy = () -> CorporateActionMovementConfirmationV03.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementConfirmationV03 obj) throws Exception {
			check_seev_CorporateActionMovementConfirmationV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption18
	 * CorporateActionOption18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For differentiation between options, the OptionNumber must be used (preferred rather than the OptionType eg, in the case where two or more offers can be described by the same corporate action option code). Therefore, the OptionNumber value must be different for each option."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption18> forCorporateActionOption18 = new MMConstraint<CorporateActionOption18>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumberRule";
			definition = "For differentiation between options, the OptionNumber must be used (preferred rather than the OptionType eg, in the case where two or more offers can be described by the same corporate action option code). Therefore, the OptionNumber value must be different for each option.";
			owner_lazy = () -> CorporateActionOption18.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption18 obj) throws Exception {
			checkCorporateActionOption18(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption27
	 * CorporateActionOption27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For differentiation between options, the OptionNumber must be used (preferred rather than the OptionType eg, in the case where two or more offers can be described by the same corporate action option code). Therefore, the OptionNumber value must be different for each option."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption27> forCorporateActionOption27 = new MMConstraint<CorporateActionOption27>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumberRule";
			definition = "For differentiation between options, the OptionNumber must be used (preferred rather than the OptionType eg, in the case where two or more offers can be described by the same corporate action option code). Therefore, the OptionNumber value must be different for each option.";
			owner_lazy = () -> CorporateActionOption27.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption27 obj) throws Exception {
			checkCorporateActionOption27(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption26
	 * CorporateActionOption26}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For differentiation between options, the OptionNumber must be used (preferred rather than the OptionType eg, in the case where two or more offers can be described by the same corporate action option code). Therefore, the OptionNumber value must be different for each option."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption26> forCorporateActionOption26 = new MMConstraint<CorporateActionOption26>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumberRule";
			definition = "For differentiation between options, the OptionNumber must be used (preferred rather than the OptionType eg, in the case where two or more offers can be described by the same corporate action option code). Therefore, the OptionNumber value must be different for each option.";
			owner_lazy = () -> CorporateActionOption26.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption26 obj) throws Exception {
			checkCorporateActionOption26(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV05
	 * CorporateActionMovementConfirmationV05}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CorporateActionConfirmationDetails/OptionNumber value provided must be the same as the one provided into the related CorporateActionOptionDetails/OptionNumber element of the CorporateActionNotification or CorporateActionMovementPreliminaryAdvice messages previously sent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOptionNumberRule#for_seev_CorporateActionMovementConfirmationV06
	 * ConstraintOptionNumberRule.
	 * for_seev_CorporateActionMovementConfirmationV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOptionNumberRule#for_seev_CorporateActionMovementConfirmationV04
	 * ConstraintOptionNumberRule.
	 * for_seev_CorporateActionMovementConfirmationV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementConfirmationV05> for_seev_CorporateActionMovementConfirmationV05 = new MMConstraint<CorporateActionMovementConfirmationV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumberRule";
			definition = "The CorporateActionConfirmationDetails/OptionNumber value provided must be the same as the one provided into the related CorporateActionOptionDetails/OptionNumber element of the CorporateActionNotification or CorporateActionMovementPreliminaryAdvice messages previously sent.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOptionNumberRule.for_seev_CorporateActionMovementConfirmationV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOptionNumberRule.for_seev_CorporateActionMovementConfirmationV04;
			owner_lazy = () -> CorporateActionMovementConfirmationV05.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementConfirmationV05 obj) throws Exception {
			check_seev_CorporateActionMovementConfirmationV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV05
	 * CorporateActionMovementReversalAdviceV05}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CorporateActionConfirmationDetails/OptionNumber value provided must be the same as the one provided into the related CorporateActionOptionDetails/OptionNumber element of the CorporateActionNotification or CorporateActionMovementPreliminaryAdvice messages previously sent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOptionNumberRule#for_seev_CorporateActionMovementReversalAdviceV06
	 * ConstraintOptionNumberRule.
	 * for_seev_CorporateActionMovementReversalAdviceV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOptionNumberRule#for_seev_CorporateActionMovementReversalAdviceV04
	 * ConstraintOptionNumberRule.
	 * for_seev_CorporateActionMovementReversalAdviceV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementReversalAdviceV05> for_seev_CorporateActionMovementReversalAdviceV05 = new MMConstraint<CorporateActionMovementReversalAdviceV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumberRule";
			definition = "The CorporateActionConfirmationDetails/OptionNumber value provided must be the same as the one provided into the related CorporateActionOptionDetails/OptionNumber element of the CorporateActionNotification or CorporateActionMovementPreliminaryAdvice messages previously sent.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOptionNumberRule.for_seev_CorporateActionMovementReversalAdviceV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOptionNumberRule.for_seev_CorporateActionMovementReversalAdviceV04;
			owner_lazy = () -> CorporateActionMovementReversalAdviceV05.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementReversalAdviceV05 obj) throws Exception {
			check_seev_CorporateActionMovementReversalAdviceV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV06
	 * CorporateActionMovementConfirmationV06}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CorporateActionConfirmationDetails/OptionNumber value provided must be the same as the one provided into the related CorporateActionOptionDetails/OptionNumber element of the CorporateActionNotification or CorporateActionMovementPreliminaryAdvice messages previously sent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOptionNumberRule#for_seev_CorporateActionMovementConfirmationV07
	 * ConstraintOptionNumberRule.
	 * for_seev_CorporateActionMovementConfirmationV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOptionNumberRule#for_seev_CorporateActionMovementConfirmationV05
	 * ConstraintOptionNumberRule.
	 * for_seev_CorporateActionMovementConfirmationV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementConfirmationV06> for_seev_CorporateActionMovementConfirmationV06 = new MMConstraint<CorporateActionMovementConfirmationV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumberRule";
			definition = "The CorporateActionConfirmationDetails/OptionNumber value provided must be the same as the one provided into the related CorporateActionOptionDetails/OptionNumber element of the CorporateActionNotification or CorporateActionMovementPreliminaryAdvice messages previously sent.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOptionNumberRule.for_seev_CorporateActionMovementConfirmationV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOptionNumberRule.for_seev_CorporateActionMovementConfirmationV05;
			owner_lazy = () -> CorporateActionMovementConfirmationV06.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementConfirmationV06 obj) throws Exception {
			check_seev_CorporateActionMovementConfirmationV06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV02
	 * CorporateActionMovementConfirmationV02}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CorporateActionConfirmationDetails/OptionNumber value provided must be the same as the one provided into the related CorporateActionOptionDetails/OptionNumber element of the CorporateActionNotification or CorporateActionMovementPreliminaryAdvice messages previously sent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementConfirmationV02> for_seev_CorporateActionMovementConfirmationV02 = new MMConstraint<CorporateActionMovementConfirmationV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumberRule";
			definition = "The CorporateActionConfirmationDetails/OptionNumber value provided must be the same as the one provided into the related CorporateActionOptionDetails/OptionNumber element of the CorporateActionNotification or CorporateActionMovementPreliminaryAdvice messages previously sent.";
			owner_lazy = () -> CorporateActionMovementConfirmationV02.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementConfirmationV02 obj) throws Exception {
			check_seev_CorporateActionMovementConfirmationV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmation002V07
	 * CorporateActionMovementConfirmation002V07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CorporateActionConfirmationDetails/OptionNumber value provided must be the same as the one provided into the related CorporateActionOptionDetails/OptionNumber element of the CorporateActionNotification or CorporateActionMovementPreliminaryAdvice messages previously sent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementConfirmation002V07> for_seev_CorporateActionMovementConfirmation002V07 = new MMConstraint<CorporateActionMovementConfirmation002V07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumberRule";
			definition = "The CorporateActionConfirmationDetails/OptionNumber value provided must be the same as the one provided into the related CorporateActionOptionDetails/OptionNumber element of the CorporateActionNotification or CorporateActionMovementPreliminaryAdvice messages previously sent.";
			owner_lazy = () -> CorporateActionMovementConfirmation002V07.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementConfirmation002V07 obj) throws Exception {
			check_seev_CorporateActionMovementConfirmation002V07(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmation002V09
	 * CorporateActionMovementConfirmation002V09}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CorporateActionConfirmationDetails/OptionNumber value provided must be the same as the one provided in the related CorporateActionOptionDetails/OptionNumber element of the CorporateActionNotification or CorporateActionMovementPreliminaryAdvice messages previously sent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementConfirmation002V09> for_seev_CorporateActionMovementConfirmation002V09 = new MMConstraint<CorporateActionMovementConfirmation002V09>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumberRule";
			definition = "The CorporateActionConfirmationDetails/OptionNumber value provided must be the same as the one provided in the related CorporateActionOptionDetails/OptionNumber element of the CorporateActionNotification or CorporateActionMovementPreliminaryAdvice messages previously sent.";
			owner_lazy = () -> CorporateActionMovementConfirmation002V09.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementConfirmation002V09 obj) throws Exception {
			check_seev_CorporateActionMovementConfirmation002V09(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption50
	 * CorporateActionOption50}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For differentiation between options, the OptionNumber must be used (preferred rather than the OptionType eg, in the case where two or more offers can be described by the same corporate action option code). Therefore, the OptionNumber value must be different for each option."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption50> forCorporateActionOption50 = new MMConstraint<CorporateActionOption50>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumberRule";
			definition = "For differentiation between options, the OptionNumber must be used (preferred rather than the OptionType eg, in the case where two or more offers can be described by the same corporate action option code). Therefore, the OptionNumber value must be different for each option.";
			owner_lazy = () -> CorporateActionOption50.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption50 obj) throws Exception {
			checkCorporateActionOption50(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV08
	 * CorporateActionMovementConfirmationV08}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CorporateActionConfirmationDetails/OptionNumber value provided must be the same as the one provided into the related CorporateActionOptionDetails/OptionNumber element of the CorporateActionNotification or CorporateActionMovementPreliminaryAdvice messages previously sent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOptionNumberRule#for_seev_CorporateActionMovementConfirmationV09
	 * ConstraintOptionNumberRule.
	 * for_seev_CorporateActionMovementConfirmationV09}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOptionNumberRule#for_seev_CorporateActionMovementConfirmationV07
	 * ConstraintOptionNumberRule.
	 * for_seev_CorporateActionMovementConfirmationV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementConfirmationV08> for_seev_CorporateActionMovementConfirmationV08 = new MMConstraint<CorporateActionMovementConfirmationV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumberRule";
			definition = "The CorporateActionConfirmationDetails/OptionNumber value provided must be the same as the one provided into the related CorporateActionOptionDetails/OptionNumber element of the CorporateActionNotification or CorporateActionMovementPreliminaryAdvice messages previously sent.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOptionNumberRule.for_seev_CorporateActionMovementConfirmationV09);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOptionNumberRule.for_seev_CorporateActionMovementConfirmationV07;
			owner_lazy = () -> CorporateActionMovementConfirmationV08.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementConfirmationV08 obj) throws Exception {
			check_seev_CorporateActionMovementConfirmationV08(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV01
	 * CorporateActionMovementReversalAdviceV01}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CorporateActionConfirmationDetails/OptionNumber value provided must be the same as the one provided into the related CorporateActionOptionDetails/OptionNumber element of the CorporateActionNotification or CorporateActionMovementPreliminaryAdvice messages previously sent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementReversalAdviceV01> for_seev_CorporateActionMovementReversalAdviceV01 = new MMConstraint<CorporateActionMovementReversalAdviceV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumberRule";
			definition = "The CorporateActionConfirmationDetails/OptionNumber value provided must be the same as the one provided into the related CorporateActionOptionDetails/OptionNumber element of the CorporateActionNotification or CorporateActionMovementPreliminaryAdvice messages previously sent.";
			owner_lazy = () -> CorporateActionMovementReversalAdviceV01.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementReversalAdviceV01 obj) throws Exception {
			check_seev_CorporateActionMovementReversalAdviceV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV06
	 * CorporateActionMovementReversalAdviceV06}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CorporateActionConfirmationDetails/OptionNumber value provided must be the same as the one provided into the related CorporateActionOptionDetails/OptionNumber element of the CorporateActionNotification or CorporateActionMovementPreliminaryAdvice messages previously sent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOptionNumberRule#for_seev_CorporateActionMovementReversalAdviceV07
	 * ConstraintOptionNumberRule.
	 * for_seev_CorporateActionMovementReversalAdviceV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOptionNumberRule#for_seev_CorporateActionMovementReversalAdviceV05
	 * ConstraintOptionNumberRule.
	 * for_seev_CorporateActionMovementReversalAdviceV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementReversalAdviceV06> for_seev_CorporateActionMovementReversalAdviceV06 = new MMConstraint<CorporateActionMovementReversalAdviceV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumberRule";
			definition = "The CorporateActionConfirmationDetails/OptionNumber value provided must be the same as the one provided into the related CorporateActionOptionDetails/OptionNumber element of the CorporateActionNotification or CorporateActionMovementPreliminaryAdvice messages previously sent.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOptionNumberRule.for_seev_CorporateActionMovementReversalAdviceV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOptionNumberRule.for_seev_CorporateActionMovementReversalAdviceV05;
			owner_lazy = () -> CorporateActionMovementReversalAdviceV06.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementReversalAdviceV06 obj) throws Exception {
			check_seev_CorporateActionMovementReversalAdviceV06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption22
	 * CorporateActionOption22}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For differentiation between options, the OptionNumber must be used (preferred rather than the OptionType eg, in the case where two or more offers can be described by the same corporate action option code). Therefore, the OptionNumber value must be different for each option."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption22> forCorporateActionOption22 = new MMConstraint<CorporateActionOption22>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumberRule";
			definition = "For differentiation between options, the OptionNumber must be used (preferred rather than the OptionType eg, in the case where two or more offers can be described by the same corporate action option code). Therefore, the OptionNumber value must be different for each option.";
			owner_lazy = () -> CorporateActionOption22.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption22 obj) throws Exception {
			checkCorporateActionOption22(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption29
	 * CorporateActionOption29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For differentiation between options, the OptionNumber must be used (preferred rather than the OptionType eg, in the case where two or more offers can be described by the same corporate action option code). Therefore, the OptionNumber value must be different for each option."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption29> forCorporateActionOption29 = new MMConstraint<CorporateActionOption29>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumberRule";
			definition = "For differentiation between options, the OptionNumber must be used (preferred rather than the OptionType eg, in the case where two or more offers can be described by the same corporate action option code). Therefore, the OptionNumber value must be different for each option.";
			owner_lazy = () -> CorporateActionOption29.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption29 obj) throws Exception {
			checkCorporateActionOption29(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV02
	 * CorporateActionMovementReversalAdviceV02}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CorporateActionConfirmationDetails/OptionNumber value provided must be the same as the one provided into the related CorporateActionOptionDetails/OptionNumber element of the CorporateActionNotification or CorporateActionMovementPreliminaryAdvice messages previously sent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementReversalAdviceV02> for_seev_CorporateActionMovementReversalAdviceV02 = new MMConstraint<CorporateActionMovementReversalAdviceV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumberRule";
			definition = "The CorporateActionConfirmationDetails/OptionNumber value provided must be the same as the one provided into the related CorporateActionOptionDetails/OptionNumber element of the CorporateActionNotification or CorporateActionMovementPreliminaryAdvice messages previously sent.";
			owner_lazy = () -> CorporateActionMovementReversalAdviceV02.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementReversalAdviceV02 obj) throws Exception {
			check_seev_CorporateActionMovementReversalAdviceV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V09
	 * CorporateActionMovementReversalAdvice002V09}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CorporateActionConfirmationDetails/OptionNumber value provided must be the same as the one provided in the related CorporateActionOptionDetails/OptionNumber element of the CorporateActionNotification or CorporateActionMovementPreliminaryAdvice messages previously sent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementReversalAdvice002V09> for_seev_CorporateActionMovementReversalAdvice002V09 = new MMConstraint<CorporateActionMovementReversalAdvice002V09>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumberRule";
			definition = "The CorporateActionConfirmationDetails/OptionNumber value provided must be the same as the one provided in the related CorporateActionOptionDetails/OptionNumber element of the CorporateActionNotification or CorporateActionMovementPreliminaryAdvice messages previously sent.";
			owner_lazy = () -> CorporateActionMovementReversalAdvice002V09.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementReversalAdvice002V09 obj) throws Exception {
			check_seev_CorporateActionMovementReversalAdvice002V09(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV03
	 * CorporateActionMovementReversalAdviceV03}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CorporateActionConfirmationDetails/OptionNumber value provided must be the same as the one provided into the related CorporateActionOptionDetails/OptionNumber element of the CorporateActionNotification or CorporateActionMovementPreliminaryAdvice messages previously sent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementReversalAdviceV03> for_seev_CorporateActionMovementReversalAdviceV03 = new MMConstraint<CorporateActionMovementReversalAdviceV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumberRule";
			definition = "The CorporateActionConfirmationDetails/OptionNumber value provided must be the same as the one provided into the related CorporateActionOptionDetails/OptionNumber element of the CorporateActionNotification or CorporateActionMovementPreliminaryAdvice messages previously sent.";
			owner_lazy = () -> CorporateActionMovementReversalAdviceV03.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementReversalAdviceV03 obj) throws Exception {
			check_seev_CorporateActionMovementReversalAdviceV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption121
	 * CorporateActionOption121}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For differentiation between options, the OptionNumber must be used (preferred rather than the OptionType, for example, in the case where two or more offers can be described by the same corporate action option code). Therefore, the OptionNumber value must be different for each option."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption121> forCorporateActionOption121 = new MMConstraint<CorporateActionOption121>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumberRule";
			definition = "For differentiation between options, the OptionNumber must be used (preferred rather than the OptionType, for example, in the case where two or more offers can be described by the same corporate action option code). Therefore, the OptionNumber value must be different for each option.";
			owner_lazy = () -> CorporateActionOption121.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption121 obj) throws Exception {
			checkCorporateActionOption121(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV04
	 * CorporateActionMovementReversalAdviceV04}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CorporateActionConfirmationDetails/OptionNumber value provided must be the same as the one provided into the related CorporateActionOptionDetails/OptionNumber element of the CorporateActionNotification or CorporateActionMovementPreliminaryAdvice messages previously sent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOptionNumberRule#for_seev_CorporateActionMovementReversalAdviceV05
	 * ConstraintOptionNumberRule.
	 * for_seev_CorporateActionMovementReversalAdviceV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementReversalAdviceV04> for_seev_CorporateActionMovementReversalAdviceV04 = new MMConstraint<CorporateActionMovementReversalAdviceV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumberRule";
			definition = "The CorporateActionConfirmationDetails/OptionNumber value provided must be the same as the one provided into the related CorporateActionOptionDetails/OptionNumber element of the CorporateActionNotification or CorporateActionMovementPreliminaryAdvice messages previously sent.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOptionNumberRule.for_seev_CorporateActionMovementReversalAdviceV05);
			owner_lazy = () -> CorporateActionMovementReversalAdviceV04.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementReversalAdviceV04 obj) throws Exception {
			check_seev_CorporateActionMovementReversalAdviceV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption9
	 * CorporateActionOption9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For differentiation between options, the OptionNumber must be used (preferred rather than the OptionType eg, in the case where two or more offers can be described by the same corporate action option code). Therefore, the OptionNumber value must be different for each option."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption9> forCorporateActionOption9 = new MMConstraint<CorporateActionOption9>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumberRule";
			definition = "For differentiation between options, the OptionNumber must be used (preferred rather than the OptionType eg, in the case where two or more offers can be described by the same corporate action option code). Therefore, the OptionNumber value must be different for each option.";
			owner_lazy = () -> CorporateActionOption9.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption9 obj) throws Exception {
			checkCorporateActionOption9(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV08
	 * CorporateActionMovementReversalAdviceV08}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CorporateActionConfirmationDetails/OptionNumber value provided must be the same as the one provided into the related CorporateActionOptionDetails/OptionNumber element of the CorporateActionNotification or CorporateActionMovementPreliminaryAdvice messages previously sent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOptionNumberRule#for_seev_CorporateActionMovementReversalAdviceV09
	 * ConstraintOptionNumberRule.
	 * for_seev_CorporateActionMovementReversalAdviceV09}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOptionNumberRule#for_seev_CorporateActionMovementReversalAdviceV07
	 * ConstraintOptionNumberRule.
	 * for_seev_CorporateActionMovementReversalAdviceV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementReversalAdviceV08> for_seev_CorporateActionMovementReversalAdviceV08 = new MMConstraint<CorporateActionMovementReversalAdviceV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumberRule";
			definition = "The CorporateActionConfirmationDetails/OptionNumber value provided must be the same as the one provided into the related CorporateActionOptionDetails/OptionNumber element of the CorporateActionNotification or CorporateActionMovementPreliminaryAdvice messages previously sent.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOptionNumberRule.for_seev_CorporateActionMovementReversalAdviceV09);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOptionNumberRule.for_seev_CorporateActionMovementReversalAdviceV07;
			owner_lazy = () -> CorporateActionMovementReversalAdviceV08.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementReversalAdviceV08 obj) throws Exception {
			check_seev_CorporateActionMovementReversalAdviceV08(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV01
	 * CorporateActionMovementConfirmationV01}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CorporateActionConfirmationDetails/OptionNumber value provided must be the same as the one provided into the related CorporateActionOptionDetails/OptionNumber element of the CorporateActionNotification or CorporateActionMovementPreliminaryAdvice messages previously sent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementConfirmationV01> for_seev_CorporateActionMovementConfirmationV01 = new MMConstraint<CorporateActionMovementConfirmationV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumberRule";
			definition = "The CorporateActionConfirmationDetails/OptionNumber value provided must be the same as the one provided into the related CorporateActionOptionDetails/OptionNumber element of the CorporateActionNotification or CorporateActionMovementPreliminaryAdvice messages previously sent.";
			owner_lazy = () -> CorporateActionMovementConfirmationV01.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementConfirmationV01 obj) throws Exception {
			check_seev_CorporateActionMovementConfirmationV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV04
	 * CorporateActionMovementConfirmationV04}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CorporateActionConfirmationDetails/OptionNumber value provided must be the same as the one provided into the related CorporateActionOptionDetails/OptionNumber element of the CorporateActionNotification or CorporateActionMovementPreliminaryAdvice messages previously sent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOptionNumberRule#for_seev_CorporateActionMovementConfirmationV05
	 * ConstraintOptionNumberRule.
	 * for_seev_CorporateActionMovementConfirmationV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementConfirmationV04> for_seev_CorporateActionMovementConfirmationV04 = new MMConstraint<CorporateActionMovementConfirmationV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumberRule";
			definition = "The CorporateActionConfirmationDetails/OptionNumber value provided must be the same as the one provided into the related CorporateActionOptionDetails/OptionNumber element of the CorporateActionNotification or CorporateActionMovementPreliminaryAdvice messages previously sent.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOptionNumberRule.for_seev_CorporateActionMovementConfirmationV05);
			owner_lazy = () -> CorporateActionMovementConfirmationV04.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementConfirmationV04 obj) throws Exception {
			check_seev_CorporateActionMovementConfirmationV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV07
	 * CorporateActionMovementConfirmationV07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CorporateActionConfirmationDetails/OptionNumber value provided must be the same as the one provided into the related CorporateActionOptionDetails/OptionNumber element of the CorporateActionNotification or CorporateActionMovementPreliminaryAdvice messages previously sent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOptionNumberRule#for_seev_CorporateActionMovementConfirmationV08
	 * ConstraintOptionNumberRule.
	 * for_seev_CorporateActionMovementConfirmationV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOptionNumberRule#for_seev_CorporateActionMovementConfirmationV06
	 * ConstraintOptionNumberRule.
	 * for_seev_CorporateActionMovementConfirmationV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementConfirmationV07> for_seev_CorporateActionMovementConfirmationV07 = new MMConstraint<CorporateActionMovementConfirmationV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumberRule";
			definition = "The CorporateActionConfirmationDetails/OptionNumber value provided must be the same as the one provided into the related CorporateActionOptionDetails/OptionNumber element of the CorporateActionNotification or CorporateActionMovementPreliminaryAdvice messages previously sent.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOptionNumberRule.for_seev_CorporateActionMovementConfirmationV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOptionNumberRule.for_seev_CorporateActionMovementConfirmationV06;
			owner_lazy = () -> CorporateActionMovementConfirmationV07.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementConfirmationV07 obj) throws Exception {
			check_seev_CorporateActionMovementConfirmationV07(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV09
	 * CorporateActionMovementConfirmationV09}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CorporateActionConfirmationDetails/OptionNumber value provided must be the same as the one provided in the related CorporateActionOptionDetails/OptionNumber element of the CorporateActionNotification or CorporateActionMovementPreliminaryAdvice messages previously sent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOptionNumberRule#for_seev_CorporateActionMovementConfirmationV08
	 * ConstraintOptionNumberRule.
	 * for_seev_CorporateActionMovementConfirmationV08}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementConfirmationV09> for_seev_CorporateActionMovementConfirmationV09 = new MMConstraint<CorporateActionMovementConfirmationV09>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumberRule";
			definition = "The CorporateActionConfirmationDetails/OptionNumber value provided must be the same as the one provided in the related CorporateActionOptionDetails/OptionNumber element of the CorporateActionNotification or CorporateActionMovementPreliminaryAdvice messages previously sent.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOptionNumberRule.for_seev_CorporateActionMovementConfirmationV08;
			owner_lazy = () -> CorporateActionMovementConfirmationV09.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementConfirmationV09 obj) throws Exception {
			check_seev_CorporateActionMovementConfirmationV09(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV09
	 * CorporateActionMovementReversalAdviceV09}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CorporateActionConfirmationDetails/OptionNumber value provided must be the same as the one provided in the related CorporateActionOptionDetails/OptionNumber element of the CorporateActionNotification or CorporateActionMovementPreliminaryAdvice messages previously sent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOptionNumberRule#for_seev_CorporateActionMovementReversalAdviceV08
	 * ConstraintOptionNumberRule.
	 * for_seev_CorporateActionMovementReversalAdviceV08}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementReversalAdviceV09> for_seev_CorporateActionMovementReversalAdviceV09 = new MMConstraint<CorporateActionMovementReversalAdviceV09>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumberRule";
			definition = "The CorporateActionConfirmationDetails/OptionNumber value provided must be the same as the one provided in the related CorporateActionOptionDetails/OptionNumber element of the CorporateActionNotification or CorporateActionMovementPreliminaryAdvice messages previously sent.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOptionNumberRule.for_seev_CorporateActionMovementReversalAdviceV08;
			owner_lazy = () -> CorporateActionMovementReversalAdviceV09.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementReversalAdviceV09 obj) throws Exception {
			check_seev_CorporateActionMovementReversalAdviceV09(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionAdviceV01
	 * AgentCAElectionAdviceV01}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ElectionDetails/OptionNumber is present, then OptionNumber is not allowed in any occurrences of ElectionDetails/SecuritiesMovementDetails/DebitAccountDetails and/or ElectionDetails/SecuritiesMovementDetails/CreditAccountDetails.\n\nIf ElectionDetails/SecuritiesMovementDetails/DebitAccountDetails/OptionNumber is present at least once and/or ElectionDetails/SecuritiesMovementDetails/CreditAccountDetails/OptionNumber is present at least once then ElectionDetails/CorporateActionOptionNumber is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<AgentCAElectionAdviceV01> for_seev_AgentCAElectionAdviceV01 = new MMConstraint<AgentCAElectionAdviceV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumberRule";
			definition = "If ElectionDetails/OptionNumber is present, then OptionNumber is not allowed in any occurrences of ElectionDetails/SecuritiesMovementDetails/DebitAccountDetails and/or ElectionDetails/SecuritiesMovementDetails/CreditAccountDetails.\n\nIf ElectionDetails/SecuritiesMovementDetails/DebitAccountDetails/OptionNumber is present at least once and/or ElectionDetails/SecuritiesMovementDetails/CreditAccountDetails/OptionNumber is present at least once then ElectionDetails/CorporateActionOptionNumber is not allowed.";
			owner_lazy = () -> AgentCAElectionAdviceV01.mmObject();
		}

		@Override
		public void executeValidator(AgentCAElectionAdviceV01 obj) throws Exception {
			check_seev_AgentCAElectionAdviceV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption41
	 * CorporateActionOption41}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For differentiation between options, the OptionNumber must be used (preferred rather than the OptionType eg, in the case where two or more offers can be described by the same corporate action option code). Therefore, the OptionNumber value must be different for each option."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOptionNumberRule#forCorporateActionOption116
	 * ConstraintOptionNumberRule.forCorporateActionOption116}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption41> forCorporateActionOption41 = new MMConstraint<CorporateActionOption41>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumberRule";
			definition = "For differentiation between options, the OptionNumber must be used (preferred rather than the OptionType eg, in the case where two or more offers can be described by the same corporate action option code). Therefore, the OptionNumber value must be different for each option.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOptionNumberRule.forCorporateActionOption116);
			owner_lazy = () -> CorporateActionOption41.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption41 obj) throws Exception {
			checkCorporateActionOption41(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption141
	 * CorporateActionOption141}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For differentiation between options, the OptionNumber rather than the OptionType must be used, for example, in the case where two or more offers can be described by the same corporate action option code. Therefore, the OptionNumber value must be different for each option."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOptionNumberRule#forCorporateActionOption116
	 * ConstraintOptionNumberRule.forCorporateActionOption116}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption141> forCorporateActionOption141 = new MMConstraint<CorporateActionOption141>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumberRule";
			definition = "For differentiation between options, the OptionNumber rather than the OptionType must be used, for example, in the case where two or more offers can be described by the same corporate action option code. Therefore, the OptionNumber value must be different for each option.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOptionNumberRule.forCorporateActionOption116;
			owner_lazy = () -> CorporateActionOption141.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption141 obj) throws Exception {
			checkCorporateActionOption141(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V07
	 * CorporateActionMovementReversalAdvice002V07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CorporateActionConfirmationDetails/OptionNumber value provided must be the same as the one provided into the related CorporateActionOptionDetails/OptionNumber element of the CorporateActionNotification or CorporateActionMovementPreliminaryAdvice messages previously sent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementReversalAdvice002V07> for_seev_CorporateActionMovementReversalAdvice002V07 = new MMConstraint<CorporateActionMovementReversalAdvice002V07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumberRule";
			definition = "The CorporateActionConfirmationDetails/OptionNumber value provided must be the same as the one provided into the related CorporateActionOptionDetails/OptionNumber element of the CorporateActionNotification or CorporateActionMovementPreliminaryAdvice messages previously sent.";
			owner_lazy = () -> CorporateActionMovementReversalAdvice002V07.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementReversalAdvice002V07 obj) throws Exception {
			check_seev_CorporateActionMovementReversalAdvice002V07(obj);
		}
	};

	/**
	 * For differentiation between options, the OptionNumber must be used
	 * (preferred rather than the OptionType, for example, in the case where two
	 * or more offers can be described by the same corporate action option
	 * code). Therefore, the OptionNumber value must be different for each
	 * option.
	 */
	public static void checkCorporateActionOption116(CorporateActionOption116 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CorporateActionConfirmationDetails/OptionNumber value provided must
	 * be the same as the one provided into the related
	 * CorporateActionOptionDetails/OptionNumber element of the
	 * CorporateActionNotification or CorporateActionMovementPreliminaryAdvice
	 * messages previously sent.
	 */
	public static void check_seev_CorporateActionMovementReversalAdviceV07(CorporateActionMovementReversalAdviceV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For differentiation between options, the OptionNumber rather than the
	 * OptionType must be used, for example, in the case where two or more
	 * offers can be described by the same corporate action option code.
	 * Therefore, the OptionNumber value must be different for each option.
	 */
	public static void checkCorporateActionOption144(CorporateActionOption144 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CorporateActionConfirmationDetails/OptionNumber value provided must
	 * be the same as the one provided into the related
	 * CorporateActionOptionDetails/OptionNumber element of the
	 * CorporateActionNotification or CorporateActionMovementPreliminaryAdvice
	 * messages previously sent.
	 */
	public static void check_seev_CorporateActionMovementConfirmationV03(CorporateActionMovementConfirmationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For differentiation between options, the OptionNumber must be used
	 * (preferred rather than the OptionType eg, in the case where two or more
	 * offers can be described by the same corporate action option code).
	 * Therefore, the OptionNumber value must be different for each option.
	 */
	public static void checkCorporateActionOption18(CorporateActionOption18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For differentiation between options, the OptionNumber must be used
	 * (preferred rather than the OptionType eg, in the case where two or more
	 * offers can be described by the same corporate action option code).
	 * Therefore, the OptionNumber value must be different for each option.
	 */
	public static void checkCorporateActionOption27(CorporateActionOption27 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For differentiation between options, the OptionNumber must be used
	 * (preferred rather than the OptionType eg, in the case where two or more
	 * offers can be described by the same corporate action option code).
	 * Therefore, the OptionNumber value must be different for each option.
	 */
	public static void checkCorporateActionOption26(CorporateActionOption26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CorporateActionConfirmationDetails/OptionNumber value provided must
	 * be the same as the one provided into the related
	 * CorporateActionOptionDetails/OptionNumber element of the
	 * CorporateActionNotification or CorporateActionMovementPreliminaryAdvice
	 * messages previously sent.
	 */
	public static void check_seev_CorporateActionMovementConfirmationV05(CorporateActionMovementConfirmationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CorporateActionConfirmationDetails/OptionNumber value provided must
	 * be the same as the one provided into the related
	 * CorporateActionOptionDetails/OptionNumber element of the
	 * CorporateActionNotification or CorporateActionMovementPreliminaryAdvice
	 * messages previously sent.
	 */
	public static void check_seev_CorporateActionMovementReversalAdviceV05(CorporateActionMovementReversalAdviceV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CorporateActionConfirmationDetails/OptionNumber value provided must
	 * be the same as the one provided into the related
	 * CorporateActionOptionDetails/OptionNumber element of the
	 * CorporateActionNotification or CorporateActionMovementPreliminaryAdvice
	 * messages previously sent.
	 */
	public static void check_seev_CorporateActionMovementConfirmationV06(CorporateActionMovementConfirmationV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CorporateActionConfirmationDetails/OptionNumber value provided must
	 * be the same as the one provided into the related
	 * CorporateActionOptionDetails/OptionNumber element of the
	 * CorporateActionNotification or CorporateActionMovementPreliminaryAdvice
	 * messages previously sent.
	 */
	public static void check_seev_CorporateActionMovementConfirmationV02(CorporateActionMovementConfirmationV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CorporateActionConfirmationDetails/OptionNumber value provided must
	 * be the same as the one provided into the related
	 * CorporateActionOptionDetails/OptionNumber element of the
	 * CorporateActionNotification or CorporateActionMovementPreliminaryAdvice
	 * messages previously sent.
	 */
	public static void check_seev_CorporateActionMovementConfirmation002V07(CorporateActionMovementConfirmation002V07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CorporateActionConfirmationDetails/OptionNumber value provided must
	 * be the same as the one provided in the related
	 * CorporateActionOptionDetails/OptionNumber element of the
	 * CorporateActionNotification or CorporateActionMovementPreliminaryAdvice
	 * messages previously sent.
	 */
	public static void check_seev_CorporateActionMovementConfirmation002V09(CorporateActionMovementConfirmation002V09 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For differentiation between options, the OptionNumber must be used
	 * (preferred rather than the OptionType eg, in the case where two or more
	 * offers can be described by the same corporate action option code).
	 * Therefore, the OptionNumber value must be different for each option.
	 */
	public static void checkCorporateActionOption50(CorporateActionOption50 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CorporateActionConfirmationDetails/OptionNumber value provided must
	 * be the same as the one provided into the related
	 * CorporateActionOptionDetails/OptionNumber element of the
	 * CorporateActionNotification or CorporateActionMovementPreliminaryAdvice
	 * messages previously sent.
	 */
	public static void check_seev_CorporateActionMovementConfirmationV08(CorporateActionMovementConfirmationV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CorporateActionConfirmationDetails/OptionNumber value provided must
	 * be the same as the one provided into the related
	 * CorporateActionOptionDetails/OptionNumber element of the
	 * CorporateActionNotification or CorporateActionMovementPreliminaryAdvice
	 * messages previously sent.
	 */
	public static void check_seev_CorporateActionMovementReversalAdviceV01(CorporateActionMovementReversalAdviceV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CorporateActionConfirmationDetails/OptionNumber value provided must
	 * be the same as the one provided into the related
	 * CorporateActionOptionDetails/OptionNumber element of the
	 * CorporateActionNotification or CorporateActionMovementPreliminaryAdvice
	 * messages previously sent.
	 */
	public static void check_seev_CorporateActionMovementReversalAdviceV06(CorporateActionMovementReversalAdviceV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For differentiation between options, the OptionNumber must be used
	 * (preferred rather than the OptionType eg, in the case where two or more
	 * offers can be described by the same corporate action option code).
	 * Therefore, the OptionNumber value must be different for each option.
	 */
	public static void checkCorporateActionOption22(CorporateActionOption22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For differentiation between options, the OptionNumber must be used
	 * (preferred rather than the OptionType eg, in the case where two or more
	 * offers can be described by the same corporate action option code).
	 * Therefore, the OptionNumber value must be different for each option.
	 */
	public static void checkCorporateActionOption29(CorporateActionOption29 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CorporateActionConfirmationDetails/OptionNumber value provided must
	 * be the same as the one provided into the related
	 * CorporateActionOptionDetails/OptionNumber element of the
	 * CorporateActionNotification or CorporateActionMovementPreliminaryAdvice
	 * messages previously sent.
	 */
	public static void check_seev_CorporateActionMovementReversalAdviceV02(CorporateActionMovementReversalAdviceV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CorporateActionConfirmationDetails/OptionNumber value provided must
	 * be the same as the one provided in the related
	 * CorporateActionOptionDetails/OptionNumber element of the
	 * CorporateActionNotification or CorporateActionMovementPreliminaryAdvice
	 * messages previously sent.
	 */
	public static void check_seev_CorporateActionMovementReversalAdvice002V09(CorporateActionMovementReversalAdvice002V09 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CorporateActionConfirmationDetails/OptionNumber value provided must
	 * be the same as the one provided into the related
	 * CorporateActionOptionDetails/OptionNumber element of the
	 * CorporateActionNotification or CorporateActionMovementPreliminaryAdvice
	 * messages previously sent.
	 */
	public static void check_seev_CorporateActionMovementReversalAdviceV03(CorporateActionMovementReversalAdviceV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For differentiation between options, the OptionNumber must be used
	 * (preferred rather than the OptionType, for example, in the case where two
	 * or more offers can be described by the same corporate action option
	 * code). Therefore, the OptionNumber value must be different for each
	 * option.
	 */
	public static void checkCorporateActionOption121(CorporateActionOption121 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CorporateActionConfirmationDetails/OptionNumber value provided must
	 * be the same as the one provided into the related
	 * CorporateActionOptionDetails/OptionNumber element of the
	 * CorporateActionNotification or CorporateActionMovementPreliminaryAdvice
	 * messages previously sent.
	 */
	public static void check_seev_CorporateActionMovementReversalAdviceV04(CorporateActionMovementReversalAdviceV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For differentiation between options, the OptionNumber must be used
	 * (preferred rather than the OptionType eg, in the case where two or more
	 * offers can be described by the same corporate action option code).
	 * Therefore, the OptionNumber value must be different for each option.
	 */
	public static void checkCorporateActionOption9(CorporateActionOption9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CorporateActionConfirmationDetails/OptionNumber value provided must
	 * be the same as the one provided into the related
	 * CorporateActionOptionDetails/OptionNumber element of the
	 * CorporateActionNotification or CorporateActionMovementPreliminaryAdvice
	 * messages previously sent.
	 */
	public static void check_seev_CorporateActionMovementReversalAdviceV08(CorporateActionMovementReversalAdviceV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CorporateActionConfirmationDetails/OptionNumber value provided must
	 * be the same as the one provided into the related
	 * CorporateActionOptionDetails/OptionNumber element of the
	 * CorporateActionNotification or CorporateActionMovementPreliminaryAdvice
	 * messages previously sent.
	 */
	public static void check_seev_CorporateActionMovementConfirmationV01(CorporateActionMovementConfirmationV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CorporateActionConfirmationDetails/OptionNumber value provided must
	 * be the same as the one provided into the related
	 * CorporateActionOptionDetails/OptionNumber element of the
	 * CorporateActionNotification or CorporateActionMovementPreliminaryAdvice
	 * messages previously sent.
	 */
	public static void check_seev_CorporateActionMovementConfirmationV04(CorporateActionMovementConfirmationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CorporateActionConfirmationDetails/OptionNumber value provided must
	 * be the same as the one provided into the related
	 * CorporateActionOptionDetails/OptionNumber element of the
	 * CorporateActionNotification or CorporateActionMovementPreliminaryAdvice
	 * messages previously sent.
	 */
	public static void check_seev_CorporateActionMovementConfirmationV07(CorporateActionMovementConfirmationV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CorporateActionConfirmationDetails/OptionNumber value provided must
	 * be the same as the one provided in the related
	 * CorporateActionOptionDetails/OptionNumber element of the
	 * CorporateActionNotification or CorporateActionMovementPreliminaryAdvice
	 * messages previously sent.
	 */
	public static void check_seev_CorporateActionMovementConfirmationV09(CorporateActionMovementConfirmationV09 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CorporateActionConfirmationDetails/OptionNumber value provided must
	 * be the same as the one provided in the related
	 * CorporateActionOptionDetails/OptionNumber element of the
	 * CorporateActionNotification or CorporateActionMovementPreliminaryAdvice
	 * messages previously sent.
	 */
	public static void check_seev_CorporateActionMovementReversalAdviceV09(CorporateActionMovementReversalAdviceV09 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ElectionDetails/OptionNumber is present, then OptionNumber is not
	 * allowed in any occurrences of
	 * ElectionDetails/SecuritiesMovementDetails/DebitAccountDetails and/or
	 * ElectionDetails/SecuritiesMovementDetails/CreditAccountDetails.
	 * 
	 * If ElectionDetails/SecuritiesMovementDetails/DebitAccountDetails/
	 * OptionNumber is present at least once and/or
	 * ElectionDetails/SecuritiesMovementDetails
	 * /CreditAccountDetails/OptionNumber is present at least once then
	 * ElectionDetails/CorporateActionOptionNumber is not allowed.
	 */
	public static void check_seev_AgentCAElectionAdviceV01(AgentCAElectionAdviceV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For differentiation between options, the OptionNumber must be used
	 * (preferred rather than the OptionType eg, in the case where two or more
	 * offers can be described by the same corporate action option code).
	 * Therefore, the OptionNumber value must be different for each option.
	 */
	public static void checkCorporateActionOption41(CorporateActionOption41 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For differentiation between options, the OptionNumber rather than the
	 * OptionType must be used, for example, in the case where two or more
	 * offers can be described by the same corporate action option code.
	 * Therefore, the OptionNumber value must be different for each option.
	 */
	public static void checkCorporateActionOption141(CorporateActionOption141 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CorporateActionConfirmationDetails/OptionNumber value provided must
	 * be the same as the one provided into the related
	 * CorporateActionOptionDetails/OptionNumber element of the
	 * CorporateActionNotification or CorporateActionMovementPreliminaryAdvice
	 * messages previously sent.
	 */
	public static void check_seev_CorporateActionMovementReversalAdvice002V07(CorporateActionMovementReversalAdvice002V07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}