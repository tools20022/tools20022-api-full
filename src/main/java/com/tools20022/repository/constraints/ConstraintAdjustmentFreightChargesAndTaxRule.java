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
 * Adjustments, freight charges and taxes must be entered at this level, or
 * adjustments, freight charges and taxes must be entered at line item level.
 */
public class ConstraintAdjustmentFreightChargesAndTaxRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.LineItem13 LineItem13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdjustmentFreightChargesAndTaxRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustments, freight charges and taxes must be entered at this level, or adjustments, freight charges and taxes must be entered at line item level."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdjustmentFreightChargesAndTaxRule#forLineItem11
	 * ConstraintAdjustmentFreightChargesAndTaxRule.forLineItem11}</li>
	 * </ul>
	 */
	public static final MMConstraint<LineItem13> forLineItem13 = new MMConstraint<LineItem13>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdjustmentFreightChargesAndTaxRule";
			definition = "Adjustments, freight charges and taxes must be entered at this level, or adjustments, freight charges and taxes must be entered at line item level.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdjustmentFreightChargesAndTaxRule.forLineItem11;
			owner_lazy = () -> LineItem13.mmObject();
		}

		@Override
		public void executeValidator(LineItem13 obj) throws Exception {
			checkLineItem13(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.LineItem11 LineItem11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdjustmentFreightChargesAndTaxRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustments, freight charges and taxes must be entered at this level, or adjustments, freight charges and taxes must be entered at line item level."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdjustmentFreightChargesAndTaxRule#forLineItem13
	 * ConstraintAdjustmentFreightChargesAndTaxRule.forLineItem13}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdjustmentFreightChargesAndTaxRule#forLineItem7
	 * ConstraintAdjustmentFreightChargesAndTaxRule.forLineItem7}</li>
	 * </ul>
	 */
	public static final MMConstraint<LineItem11> forLineItem11 = new MMConstraint<LineItem11>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdjustmentFreightChargesAndTaxRule";
			definition = "Adjustments, freight charges and taxes must be entered at this level, or adjustments, freight charges and taxes must be entered at line item level.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdjustmentFreightChargesAndTaxRule.forLineItem13);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdjustmentFreightChargesAndTaxRule.forLineItem7;
			owner_lazy = () -> LineItem11.mmObject();
		}

		@Override
		public void executeValidator(LineItem11 obj) throws Exception {
			checkLineItem11(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.LineItem15 LineItem15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdjustmentFreightChargesAndTaxRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either all adjustments, freight charges and taxes must be entered at this level only, or all adjustments, freight charges and taxes must be entered at line item level only."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdjustmentFreightChargesAndTaxRule#forLineItem12
	 * ConstraintAdjustmentFreightChargesAndTaxRule.forLineItem12}</li>
	 * </ul>
	 */
	public static final MMConstraint<LineItem15> forLineItem15 = new MMConstraint<LineItem15>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdjustmentFreightChargesAndTaxRule";
			definition = "Either all adjustments, freight charges and taxes must be entered at this level only, or all adjustments, freight charges and taxes must be entered at line item level only.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdjustmentFreightChargesAndTaxRule.forLineItem12;
			owner_lazy = () -> LineItem15.mmObject();
		}

		@Override
		public void executeValidator(LineItem15 obj) throws Exception {
			checkLineItem15(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.LineItem4 LineItem4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdjustmentFreightChargesAndTaxRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either all adjustments, freight charges and taxes must be entered at this level only, or all adjustments, freight charges and taxes must be entered at line item level only."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<LineItem4> forLineItem4 = new MMConstraint<LineItem4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdjustmentFreightChargesAndTaxRule";
			definition = "Either all adjustments, freight charges and taxes must be entered at this level only, or all adjustments, freight charges and taxes must be entered at line item level only.";
			owner_lazy = () -> LineItem4.mmObject();
		}

		@Override
		public void executeValidator(LineItem4 obj) throws Exception {
			checkLineItem4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.LineItem9 LineItem9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdjustmentFreightChargesAndTaxRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either all adjustments, freight charges and taxes must be entered at this level only, or all adjustments, freight charges and taxes must be entered at line item level only."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdjustmentFreightChargesAndTaxRule#forLineItem12
	 * ConstraintAdjustmentFreightChargesAndTaxRule.forLineItem12}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<LineItem9> forLineItem9 = new MMConstraint<LineItem9>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdjustmentFreightChargesAndTaxRule";
			definition = "Either all adjustments, freight charges and taxes must be entered at this level only, or all adjustments, freight charges and taxes must be entered at line item level only.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdjustmentFreightChargesAndTaxRule.forLineItem12);
			owner_lazy = () -> LineItem9.mmObject();
		}

		@Override
		public void executeValidator(LineItem9 obj) throws Exception {
			checkLineItem9(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.LineItem7 LineItem7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdjustmentFreightChargesAndTaxRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustments, freight charges and taxes must be entered at this level, or adjustments, freight charges and taxes must be entered at line item level."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdjustmentFreightChargesAndTaxRule#forLineItem11
	 * ConstraintAdjustmentFreightChargesAndTaxRule.forLineItem11}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<LineItem7> forLineItem7 = new MMConstraint<LineItem7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdjustmentFreightChargesAndTaxRule";
			definition = "Adjustments, freight charges and taxes must be entered at this level, or adjustments, freight charges and taxes must be entered at line item level.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdjustmentFreightChargesAndTaxRule.forLineItem11);
			owner_lazy = () -> LineItem7.mmObject();
		}

		@Override
		public void executeValidator(LineItem7 obj) throws Exception {
			checkLineItem7(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.LineItem5 LineItem5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdjustmentFreightChargesAndTaxRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either all adjustments, freight charges and taxes must be entered at this level only, or all adjustments, freight charges and taxes must be entered at line item level only."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<LineItem5> forLineItem5 = new MMConstraint<LineItem5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdjustmentFreightChargesAndTaxRule";
			definition = "Either all adjustments, freight charges and taxes must be entered at this level only, or all adjustments, freight charges and taxes must be entered at line item level only.";
			owner_lazy = () -> LineItem5.mmObject();
		}

		@Override
		public void executeValidator(LineItem5 obj) throws Exception {
			checkLineItem5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.LineItem12 LineItem12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdjustmentFreightChargesAndTaxRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either all adjustments, freight charges and taxes must be entered at this level only, or all adjustments, freight charges and taxes must be entered at line item level only."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdjustmentFreightChargesAndTaxRule#forLineItem15
	 * ConstraintAdjustmentFreightChargesAndTaxRule.forLineItem15}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdjustmentFreightChargesAndTaxRule#forLineItem9
	 * ConstraintAdjustmentFreightChargesAndTaxRule.forLineItem9}</li>
	 * </ul>
	 */
	public static final MMConstraint<LineItem12> forLineItem12 = new MMConstraint<LineItem12>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdjustmentFreightChargesAndTaxRule";
			definition = "Either all adjustments, freight charges and taxes must be entered at this level only, or all adjustments, freight charges and taxes must be entered at line item level only.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdjustmentFreightChargesAndTaxRule.forLineItem15);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdjustmentFreightChargesAndTaxRule.forLineItem9;
			owner_lazy = () -> LineItem12.mmObject();
		}

		@Override
		public void executeValidator(LineItem12 obj) throws Exception {
			checkLineItem12(obj);
		}
	};

	/**
	 * Adjustments, freight charges and taxes must be entered at this level, or
	 * adjustments, freight charges and taxes must be entered at line item
	 * level.
	 */
	public static void checkLineItem13(LineItem13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Adjustments, freight charges and taxes must be entered at this level, or
	 * adjustments, freight charges and taxes must be entered at line item
	 * level.
	 */
	public static void checkLineItem11(LineItem11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either all adjustments, freight charges and taxes must be entered at this
	 * level only, or all adjustments, freight charges and taxes must be entered
	 * at line item level only.
	 */
	public static void checkLineItem15(LineItem15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either all adjustments, freight charges and taxes must be entered at this
	 * level only, or all adjustments, freight charges and taxes must be entered
	 * at line item level only.
	 */
	public static void checkLineItem4(LineItem4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either all adjustments, freight charges and taxes must be entered at this
	 * level only, or all adjustments, freight charges and taxes must be entered
	 * at line item level only.
	 */
	public static void checkLineItem9(LineItem9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Adjustments, freight charges and taxes must be entered at this level, or
	 * adjustments, freight charges and taxes must be entered at line item
	 * level.
	 */
	public static void checkLineItem7(LineItem7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either all adjustments, freight charges and taxes must be entered at this
	 * level only, or all adjustments, freight charges and taxes must be entered
	 * at line item level only.
	 */
	public static void checkLineItem5(LineItem5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either all adjustments, freight charges and taxes must be entered at this
	 * level only, or all adjustments, freight charges and taxes must be entered
	 * at line item level only.
	 */
	public static void checkLineItem12(LineItem12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}