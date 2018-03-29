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
 * In case of partial redemption by pool factor, PreviousFactor provides the
 * factor applicable before redemption and NextFactor provides the factor
 * applicable after redemption.
 */
public class ConstraintPreviousNextFactorRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes6
	 * FinancialInstrumentAttributes6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousNextFactorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes6> forFinancialInstrumentAttributes6 = new MMConstraint<FinancialInstrumentAttributes6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			owner_lazy = () -> FinancialInstrumentAttributes6.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes6 obj) throws Exception {
			checkFinancialInstrumentAttributes6(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes9
	 * FinancialInstrumentAttributes9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousNextFactorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes9> forFinancialInstrumentAttributes9 = new MMConstraint<FinancialInstrumentAttributes9>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			owner_lazy = () -> FinancialInstrumentAttributes9.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes9 obj) throws Exception {
			checkFinancialInstrumentAttributes9(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes18
	 * FinancialInstrumentAttributes18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousNextFactorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes18> forFinancialInstrumentAttributes18 = new MMConstraint<FinancialInstrumentAttributes18>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			owner_lazy = () -> FinancialInstrumentAttributes18.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes18 obj) throws Exception {
			checkFinancialInstrumentAttributes18(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes22
	 * FinancialInstrumentAttributes22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousNextFactorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes22> forFinancialInstrumentAttributes22 = new MMConstraint<FinancialInstrumentAttributes22>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			owner_lazy = () -> FinancialInstrumentAttributes22.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes22 obj) throws Exception {
			checkFinancialInstrumentAttributes22(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes32
	 * FinancialInstrumentAttributes32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousNextFactorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPreviousNextFactorRule#forFinancialInstrumentAttributes50
	 * ConstraintPreviousNextFactorRule.forFinancialInstrumentAttributes50}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes32> forFinancialInstrumentAttributes32 = new MMConstraint<FinancialInstrumentAttributes32>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPreviousNextFactorRule.forFinancialInstrumentAttributes50);
			owner_lazy = () -> FinancialInstrumentAttributes32.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes32 obj) throws Exception {
			checkFinancialInstrumentAttributes32(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes38
	 * FinancialInstrumentAttributes38}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousNextFactorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes38> forFinancialInstrumentAttributes38 = new MMConstraint<FinancialInstrumentAttributes38>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			owner_lazy = () -> FinancialInstrumentAttributes38.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes38 obj) throws Exception {
			checkFinancialInstrumentAttributes38(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes7
	 * FinancialInstrumentAttributes7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousNextFactorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes7> forFinancialInstrumentAttributes7 = new MMConstraint<FinancialInstrumentAttributes7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			owner_lazy = () -> FinancialInstrumentAttributes7.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes7 obj) throws Exception {
			checkFinancialInstrumentAttributes7(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes5
	 * FinancialInstrumentAttributes5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousNextFactorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes5> forFinancialInstrumentAttributes5 = new MMConstraint<FinancialInstrumentAttributes5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			owner_lazy = () -> FinancialInstrumentAttributes5.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes5 obj) throws Exception {
			checkFinancialInstrumentAttributes5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes11
	 * FinancialInstrumentAttributes11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousNextFactorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes11> forFinancialInstrumentAttributes11 = new MMConstraint<FinancialInstrumentAttributes11>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			owner_lazy = () -> FinancialInstrumentAttributes11.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes11 obj) throws Exception {
			checkFinancialInstrumentAttributes11(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes10
	 * FinancialInstrumentAttributes10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousNextFactorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes10> forFinancialInstrumentAttributes10 = new MMConstraint<FinancialInstrumentAttributes10>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			owner_lazy = () -> FinancialInstrumentAttributes10.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes10 obj) throws Exception {
			checkFinancialInstrumentAttributes10(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes19
	 * FinancialInstrumentAttributes19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousNextFactorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes19> forFinancialInstrumentAttributes19 = new MMConstraint<FinancialInstrumentAttributes19>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			owner_lazy = () -> FinancialInstrumentAttributes19.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes19 obj) throws Exception {
			checkFinancialInstrumentAttributes19(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes16
	 * FinancialInstrumentAttributes16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousNextFactorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes16> forFinancialInstrumentAttributes16 = new MMConstraint<FinancialInstrumentAttributes16>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			owner_lazy = () -> FinancialInstrumentAttributes16.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes16 obj) throws Exception {
			checkFinancialInstrumentAttributes16(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes23
	 * FinancialInstrumentAttributes23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousNextFactorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes23> forFinancialInstrumentAttributes23 = new MMConstraint<FinancialInstrumentAttributes23>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			owner_lazy = () -> FinancialInstrumentAttributes23.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes23 obj) throws Exception {
			checkFinancialInstrumentAttributes23(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes24
	 * FinancialInstrumentAttributes24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousNextFactorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes24> forFinancialInstrumentAttributes24 = new MMConstraint<FinancialInstrumentAttributes24>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			owner_lazy = () -> FinancialInstrumentAttributes24.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes24 obj) throws Exception {
			checkFinancialInstrumentAttributes24(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes33
	 * FinancialInstrumentAttributes33}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousNextFactorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes33> forFinancialInstrumentAttributes33 = new MMConstraint<FinancialInstrumentAttributes33>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			owner_lazy = () -> FinancialInstrumentAttributes33.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes33 obj) throws Exception {
			checkFinancialInstrumentAttributes33(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes34
	 * FinancialInstrumentAttributes34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousNextFactorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPreviousNextFactorRule#forFinancialInstrumentAttributes49
	 * ConstraintPreviousNextFactorRule.forFinancialInstrumentAttributes49}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes34> forFinancialInstrumentAttributes34 = new MMConstraint<FinancialInstrumentAttributes34>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPreviousNextFactorRule.forFinancialInstrumentAttributes49);
			owner_lazy = () -> FinancialInstrumentAttributes34.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes34 obj) throws Exception {
			checkFinancialInstrumentAttributes34(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes39
	 * FinancialInstrumentAttributes39}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousNextFactorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes39> forFinancialInstrumentAttributes39 = new MMConstraint<FinancialInstrumentAttributes39>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			owner_lazy = () -> FinancialInstrumentAttributes39.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes39 obj) throws Exception {
			checkFinancialInstrumentAttributes39(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes40
	 * FinancialInstrumentAttributes40}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousNextFactorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes40> forFinancialInstrumentAttributes40 = new MMConstraint<FinancialInstrumentAttributes40>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			owner_lazy = () -> FinancialInstrumentAttributes40.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes40 obj) throws Exception {
			checkFinancialInstrumentAttributes40(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes43
	 * FinancialInstrumentAttributes43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousNextFactorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPreviousNextFactorRule#forFinancialInstrumentAttributes48
	 * ConstraintPreviousNextFactorRule.forFinancialInstrumentAttributes48}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes43> forFinancialInstrumentAttributes43 = new MMConstraint<FinancialInstrumentAttributes43>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPreviousNextFactorRule.forFinancialInstrumentAttributes48);
			owner_lazy = () -> FinancialInstrumentAttributes43.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes43 obj) throws Exception {
			checkFinancialInstrumentAttributes43(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes45
	 * FinancialInstrumentAttributes45}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousNextFactorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes45> forFinancialInstrumentAttributes45 = new MMConstraint<FinancialInstrumentAttributes45>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			owner_lazy = () -> FinancialInstrumentAttributes45.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes45 obj) throws Exception {
			checkFinancialInstrumentAttributes45(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes48
	 * FinancialInstrumentAttributes48}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousNextFactorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPreviousNextFactorRule#forFinancialInstrumentAttributes66
	 * ConstraintPreviousNextFactorRule.forFinancialInstrumentAttributes66}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPreviousNextFactorRule#forFinancialInstrumentAttributes43
	 * ConstraintPreviousNextFactorRule.forFinancialInstrumentAttributes43}</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes48> forFinancialInstrumentAttributes48 = new MMConstraint<FinancialInstrumentAttributes48>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPreviousNextFactorRule.forFinancialInstrumentAttributes66);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPreviousNextFactorRule.forFinancialInstrumentAttributes43;
			owner_lazy = () -> FinancialInstrumentAttributes48.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes48 obj) throws Exception {
			checkFinancialInstrumentAttributes48(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes50
	 * FinancialInstrumentAttributes50}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousNextFactorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPreviousNextFactorRule#forFinancialInstrumentAttributes65
	 * ConstraintPreviousNextFactorRule.forFinancialInstrumentAttributes65}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPreviousNextFactorRule#forFinancialInstrumentAttributes32
	 * ConstraintPreviousNextFactorRule.forFinancialInstrumentAttributes32}</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes50> forFinancialInstrumentAttributes50 = new MMConstraint<FinancialInstrumentAttributes50>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPreviousNextFactorRule.forFinancialInstrumentAttributes65);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPreviousNextFactorRule.forFinancialInstrumentAttributes32;
			owner_lazy = () -> FinancialInstrumentAttributes50.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes50 obj) throws Exception {
			checkFinancialInstrumentAttributes50(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes49
	 * FinancialInstrumentAttributes49}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousNextFactorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPreviousNextFactorRule#forFinancialInstrumentAttributes67
	 * ConstraintPreviousNextFactorRule.forFinancialInstrumentAttributes67}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPreviousNextFactorRule#forFinancialInstrumentAttributes34
	 * ConstraintPreviousNextFactorRule.forFinancialInstrumentAttributes34}</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes49> forFinancialInstrumentAttributes49 = new MMConstraint<FinancialInstrumentAttributes49>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPreviousNextFactorRule.forFinancialInstrumentAttributes67);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPreviousNextFactorRule.forFinancialInstrumentAttributes34;
			owner_lazy = () -> FinancialInstrumentAttributes49.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes49 obj) throws Exception {
			checkFinancialInstrumentAttributes49(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes55
	 * FinancialInstrumentAttributes55}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousNextFactorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes55> forFinancialInstrumentAttributes55 = new MMConstraint<FinancialInstrumentAttributes55>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			owner_lazy = () -> FinancialInstrumentAttributes55.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes55 obj) throws Exception {
			checkFinancialInstrumentAttributes55(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes57
	 * FinancialInstrumentAttributes57}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousNextFactorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes57> forFinancialInstrumentAttributes57 = new MMConstraint<FinancialInstrumentAttributes57>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			owner_lazy = () -> FinancialInstrumentAttributes57.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes57 obj) throws Exception {
			checkFinancialInstrumentAttributes57(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes56
	 * FinancialInstrumentAttributes56}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousNextFactorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes56> forFinancialInstrumentAttributes56 = new MMConstraint<FinancialInstrumentAttributes56>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			owner_lazy = () -> FinancialInstrumentAttributes56.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes56 obj) throws Exception {
			checkFinancialInstrumentAttributes56(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66
	 * FinancialInstrumentAttributes66}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousNextFactorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPreviousNextFactorRule#forFinancialInstrumentAttributes79
	 * ConstraintPreviousNextFactorRule.forFinancialInstrumentAttributes79}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPreviousNextFactorRule#forFinancialInstrumentAttributes48
	 * ConstraintPreviousNextFactorRule.forFinancialInstrumentAttributes48}</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes66> forFinancialInstrumentAttributes66 = new MMConstraint<FinancialInstrumentAttributes66>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPreviousNextFactorRule.forFinancialInstrumentAttributes79);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPreviousNextFactorRule.forFinancialInstrumentAttributes48;
			owner_lazy = () -> FinancialInstrumentAttributes66.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes66 obj) throws Exception {
			checkFinancialInstrumentAttributes66(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes65
	 * FinancialInstrumentAttributes65}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousNextFactorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPreviousNextFactorRule#forFinancialInstrumentAttributes81
	 * ConstraintPreviousNextFactorRule.forFinancialInstrumentAttributes81}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPreviousNextFactorRule#forFinancialInstrumentAttributes50
	 * ConstraintPreviousNextFactorRule.forFinancialInstrumentAttributes50}</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes65> forFinancialInstrumentAttributes65 = new MMConstraint<FinancialInstrumentAttributes65>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPreviousNextFactorRule.forFinancialInstrumentAttributes81);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPreviousNextFactorRule.forFinancialInstrumentAttributes50;
			owner_lazy = () -> FinancialInstrumentAttributes65.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes65 obj) throws Exception {
			checkFinancialInstrumentAttributes65(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67
	 * FinancialInstrumentAttributes67}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousNextFactorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPreviousNextFactorRule#forFinancialInstrumentAttributes80
	 * ConstraintPreviousNextFactorRule.forFinancialInstrumentAttributes80}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPreviousNextFactorRule#forFinancialInstrumentAttributes49
	 * ConstraintPreviousNextFactorRule.forFinancialInstrumentAttributes49}</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes67> forFinancialInstrumentAttributes67 = new MMConstraint<FinancialInstrumentAttributes67>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPreviousNextFactorRule.forFinancialInstrumentAttributes80);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPreviousNextFactorRule.forFinancialInstrumentAttributes49;
			owner_lazy = () -> FinancialInstrumentAttributes67.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes67 obj) throws Exception {
			checkFinancialInstrumentAttributes67(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes70
	 * FinancialInstrumentAttributes70}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousNextFactorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes70> forFinancialInstrumentAttributes70 = new MMConstraint<FinancialInstrumentAttributes70>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			owner_lazy = () -> FinancialInstrumentAttributes70.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes70 obj) throws Exception {
			checkFinancialInstrumentAttributes70(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes69
	 * FinancialInstrumentAttributes69}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousNextFactorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes69> forFinancialInstrumentAttributes69 = new MMConstraint<FinancialInstrumentAttributes69>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			owner_lazy = () -> FinancialInstrumentAttributes69.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes69 obj) throws Exception {
			checkFinancialInstrumentAttributes69(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes71
	 * FinancialInstrumentAttributes71}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousNextFactorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes71> forFinancialInstrumentAttributes71 = new MMConstraint<FinancialInstrumentAttributes71>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			owner_lazy = () -> FinancialInstrumentAttributes71.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes71 obj) throws Exception {
			checkFinancialInstrumentAttributes71(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79
	 * FinancialInstrumentAttributes79}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousNextFactorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPreviousNextFactorRule#forFinancialInstrumentAttributes66
	 * ConstraintPreviousNextFactorRule.forFinancialInstrumentAttributes66}</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes79> forFinancialInstrumentAttributes79 = new MMConstraint<FinancialInstrumentAttributes79>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPreviousNextFactorRule.forFinancialInstrumentAttributes66;
			owner_lazy = () -> FinancialInstrumentAttributes79.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes79 obj) throws Exception {
			checkFinancialInstrumentAttributes79(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81
	 * FinancialInstrumentAttributes81}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousNextFactorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPreviousNextFactorRule#forFinancialInstrumentAttributes65
	 * ConstraintPreviousNextFactorRule.forFinancialInstrumentAttributes65}</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes81> forFinancialInstrumentAttributes81 = new MMConstraint<FinancialInstrumentAttributes81>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPreviousNextFactorRule.forFinancialInstrumentAttributes65;
			owner_lazy = () -> FinancialInstrumentAttributes81.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes81 obj) throws Exception {
			checkFinancialInstrumentAttributes81(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80
	 * FinancialInstrumentAttributes80}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousNextFactorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPreviousNextFactorRule#forFinancialInstrumentAttributes67
	 * ConstraintPreviousNextFactorRule.forFinancialInstrumentAttributes67}</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes80> forFinancialInstrumentAttributes80 = new MMConstraint<FinancialInstrumentAttributes80>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPreviousNextFactorRule.forFinancialInstrumentAttributes67;
			owner_lazy = () -> FinancialInstrumentAttributes80.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes80 obj) throws Exception {
			checkFinancialInstrumentAttributes80(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes85
	 * FinancialInstrumentAttributes85}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousNextFactorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes85> forFinancialInstrumentAttributes85 = new MMConstraint<FinancialInstrumentAttributes85>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			owner_lazy = () -> FinancialInstrumentAttributes85.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes85 obj) throws Exception {
			checkFinancialInstrumentAttributes85(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes84
	 * FinancialInstrumentAttributes84}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousNextFactorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes84> forFinancialInstrumentAttributes84 = new MMConstraint<FinancialInstrumentAttributes84>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			owner_lazy = () -> FinancialInstrumentAttributes84.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes84 obj) throws Exception {
			checkFinancialInstrumentAttributes84(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes83
	 * FinancialInstrumentAttributes83}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousNextFactorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes83> forFinancialInstrumentAttributes83 = new MMConstraint<FinancialInstrumentAttributes83>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			owner_lazy = () -> FinancialInstrumentAttributes83.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes83 obj) throws Exception {
			checkFinancialInstrumentAttributes83(obj);
		}
	};

	/**
	 * In case of partial redemption by pool factor, PreviousFactor provides the
	 * factor applicable before redemption and NextFactor provides the factor
	 * applicable after redemption.
	 */
	public static void checkFinancialInstrumentAttributes6(FinancialInstrumentAttributes6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In case of partial redemption by pool factor, PreviousFactor provides the
	 * factor applicable before redemption and NextFactor provides the factor
	 * applicable after redemption.
	 */
	public static void checkFinancialInstrumentAttributes9(FinancialInstrumentAttributes9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In case of partial redemption by pool factor, PreviousFactor provides the
	 * factor applicable before redemption and NextFactor provides the factor
	 * applicable after redemption.
	 */
	public static void checkFinancialInstrumentAttributes18(FinancialInstrumentAttributes18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In case of partial redemption by pool factor, PreviousFactor provides the
	 * factor applicable before redemption and NextFactor provides the factor
	 * applicable after redemption.
	 */
	public static void checkFinancialInstrumentAttributes22(FinancialInstrumentAttributes22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In case of partial redemption by pool factor, PreviousFactor provides the
	 * factor applicable before redemption and NextFactor provides the factor
	 * applicable after redemption.
	 */
	public static void checkFinancialInstrumentAttributes32(FinancialInstrumentAttributes32 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In case of partial redemption by pool factor, PreviousFactor provides the
	 * factor applicable before redemption and NextFactor provides the factor
	 * applicable after redemption.
	 */
	public static void checkFinancialInstrumentAttributes38(FinancialInstrumentAttributes38 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In case of partial redemption by pool factor, PreviousFactor provides the
	 * factor applicable before redemption and NextFactor provides the factor
	 * applicable after redemption.
	 */
	public static void checkFinancialInstrumentAttributes7(FinancialInstrumentAttributes7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In case of partial redemption by pool factor, PreviousFactor provides the
	 * factor applicable before redemption and NextFactor provides the factor
	 * applicable after redemption.
	 */
	public static void checkFinancialInstrumentAttributes5(FinancialInstrumentAttributes5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In case of partial redemption by pool factor, PreviousFactor provides the
	 * factor applicable before redemption and NextFactor provides the factor
	 * applicable after redemption.
	 */
	public static void checkFinancialInstrumentAttributes11(FinancialInstrumentAttributes11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In case of partial redemption by pool factor, PreviousFactor provides the
	 * factor applicable before redemption and NextFactor provides the factor
	 * applicable after redemption.
	 */
	public static void checkFinancialInstrumentAttributes10(FinancialInstrumentAttributes10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In case of partial redemption by pool factor, PreviousFactor provides the
	 * factor applicable before redemption and NextFactor provides the factor
	 * applicable after redemption.
	 */
	public static void checkFinancialInstrumentAttributes19(FinancialInstrumentAttributes19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In case of partial redemption by pool factor, PreviousFactor provides the
	 * factor applicable before redemption and NextFactor provides the factor
	 * applicable after redemption.
	 */
	public static void checkFinancialInstrumentAttributes16(FinancialInstrumentAttributes16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In case of partial redemption by pool factor, PreviousFactor provides the
	 * factor applicable before redemption and NextFactor provides the factor
	 * applicable after redemption.
	 */
	public static void checkFinancialInstrumentAttributes23(FinancialInstrumentAttributes23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In case of partial redemption by pool factor, PreviousFactor provides the
	 * factor applicable before redemption and NextFactor provides the factor
	 * applicable after redemption.
	 */
	public static void checkFinancialInstrumentAttributes24(FinancialInstrumentAttributes24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In case of partial redemption by pool factor, PreviousFactor provides the
	 * factor applicable before redemption and NextFactor provides the factor
	 * applicable after redemption.
	 */
	public static void checkFinancialInstrumentAttributes33(FinancialInstrumentAttributes33 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In case of partial redemption by pool factor, PreviousFactor provides the
	 * factor applicable before redemption and NextFactor provides the factor
	 * applicable after redemption.
	 */
	public static void checkFinancialInstrumentAttributes34(FinancialInstrumentAttributes34 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In case of partial redemption by pool factor, PreviousFactor provides the
	 * factor applicable before redemption and NextFactor provides the factor
	 * applicable after redemption.
	 */
	public static void checkFinancialInstrumentAttributes39(FinancialInstrumentAttributes39 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In case of partial redemption by pool factor, PreviousFactor provides the
	 * factor applicable before redemption and NextFactor provides the factor
	 * applicable after redemption.
	 */
	public static void checkFinancialInstrumentAttributes40(FinancialInstrumentAttributes40 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In case of partial redemption by pool factor, PreviousFactor provides the
	 * factor applicable before redemption and NextFactor provides the factor
	 * applicable after redemption.
	 */
	public static void checkFinancialInstrumentAttributes43(FinancialInstrumentAttributes43 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In case of partial redemption by pool factor, PreviousFactor provides the
	 * factor applicable before redemption and NextFactor provides the factor
	 * applicable after redemption.
	 */
	public static void checkFinancialInstrumentAttributes45(FinancialInstrumentAttributes45 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In case of partial redemption by pool factor, PreviousFactor provides the
	 * factor applicable before redemption and NextFactor provides the factor
	 * applicable after redemption.
	 */
	public static void checkFinancialInstrumentAttributes48(FinancialInstrumentAttributes48 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In case of partial redemption by pool factor, PreviousFactor provides the
	 * factor applicable before redemption and NextFactor provides the factor
	 * applicable after redemption.
	 */
	public static void checkFinancialInstrumentAttributes50(FinancialInstrumentAttributes50 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In case of partial redemption by pool factor, PreviousFactor provides the
	 * factor applicable before redemption and NextFactor provides the factor
	 * applicable after redemption.
	 */
	public static void checkFinancialInstrumentAttributes49(FinancialInstrumentAttributes49 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In case of partial redemption by pool factor, PreviousFactor provides the
	 * factor applicable before redemption and NextFactor provides the factor
	 * applicable after redemption.
	 */
	public static void checkFinancialInstrumentAttributes55(FinancialInstrumentAttributes55 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In case of partial redemption by pool factor, PreviousFactor provides the
	 * factor applicable before redemption and NextFactor provides the factor
	 * applicable after redemption.
	 */
	public static void checkFinancialInstrumentAttributes57(FinancialInstrumentAttributes57 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In case of partial redemption by pool factor, PreviousFactor provides the
	 * factor applicable before redemption and NextFactor provides the factor
	 * applicable after redemption.
	 */
	public static void checkFinancialInstrumentAttributes56(FinancialInstrumentAttributes56 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In case of partial redemption by pool factor, PreviousFactor provides the
	 * factor applicable before redemption and NextFactor provides the factor
	 * applicable after redemption.
	 */
	public static void checkFinancialInstrumentAttributes66(FinancialInstrumentAttributes66 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In case of partial redemption by pool factor, PreviousFactor provides the
	 * factor applicable before redemption and NextFactor provides the factor
	 * applicable after redemption.
	 */
	public static void checkFinancialInstrumentAttributes65(FinancialInstrumentAttributes65 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In case of partial redemption by pool factor, PreviousFactor provides the
	 * factor applicable before redemption and NextFactor provides the factor
	 * applicable after redemption.
	 */
	public static void checkFinancialInstrumentAttributes67(FinancialInstrumentAttributes67 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In case of partial redemption by pool factor, PreviousFactor provides the
	 * factor applicable before redemption and NextFactor provides the factor
	 * applicable after redemption.
	 */
	public static void checkFinancialInstrumentAttributes70(FinancialInstrumentAttributes70 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In case of partial redemption by pool factor, PreviousFactor provides the
	 * factor applicable before redemption and NextFactor provides the factor
	 * applicable after redemption.
	 */
	public static void checkFinancialInstrumentAttributes69(FinancialInstrumentAttributes69 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In case of partial redemption by pool factor, PreviousFactor provides the
	 * factor applicable before redemption and NextFactor provides the factor
	 * applicable after redemption.
	 */
	public static void checkFinancialInstrumentAttributes71(FinancialInstrumentAttributes71 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In case of partial redemption by pool factor, PreviousFactor provides the
	 * factor applicable before redemption and NextFactor provides the factor
	 * applicable after redemption.
	 */
	public static void checkFinancialInstrumentAttributes79(FinancialInstrumentAttributes79 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In case of partial redemption by pool factor, PreviousFactor provides the
	 * factor applicable before redemption and NextFactor provides the factor
	 * applicable after redemption.
	 */
	public static void checkFinancialInstrumentAttributes81(FinancialInstrumentAttributes81 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In case of partial redemption by pool factor, PreviousFactor provides the
	 * factor applicable before redemption and NextFactor provides the factor
	 * applicable after redemption.
	 */
	public static void checkFinancialInstrumentAttributes80(FinancialInstrumentAttributes80 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In case of partial redemption by pool factor, PreviousFactor provides the
	 * factor applicable before redemption and NextFactor provides the factor
	 * applicable after redemption.
	 */
	public static void checkFinancialInstrumentAttributes85(FinancialInstrumentAttributes85 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In case of partial redemption by pool factor, PreviousFactor provides the
	 * factor applicable before redemption and NextFactor provides the factor
	 * applicable after redemption.
	 */
	public static void checkFinancialInstrumentAttributes84(FinancialInstrumentAttributes84 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In case of partial redemption by pool factor, PreviousFactor provides the
	 * factor applicable before redemption and NextFactor provides the factor
	 * applicable after redemption.
	 */
	public static void checkFinancialInstrumentAttributes83(FinancialInstrumentAttributes83 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}