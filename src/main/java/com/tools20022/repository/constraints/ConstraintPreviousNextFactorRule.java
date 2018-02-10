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
			validator = ConstraintPreviousNextFactorRule::checkFinancialInstrumentAttributes6;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			owner_lazy = () -> FinancialInstrumentAttributes6.mmObject();
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
			validator = ConstraintPreviousNextFactorRule::checkFinancialInstrumentAttributes9;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			owner_lazy = () -> FinancialInstrumentAttributes9.mmObject();
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
			validator = ConstraintPreviousNextFactorRule::checkFinancialInstrumentAttributes18;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			owner_lazy = () -> FinancialInstrumentAttributes18.mmObject();
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
			validator = ConstraintPreviousNextFactorRule::checkFinancialInstrumentAttributes22;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			owner_lazy = () -> FinancialInstrumentAttributes22.mmObject();
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
			validator = ConstraintPreviousNextFactorRule::checkFinancialInstrumentAttributes32;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPreviousNextFactorRule.forFinancialInstrumentAttributes50);
			owner_lazy = () -> FinancialInstrumentAttributes32.mmObject();
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
			validator = ConstraintPreviousNextFactorRule::checkFinancialInstrumentAttributes38;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			owner_lazy = () -> FinancialInstrumentAttributes38.mmObject();
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
			validator = ConstraintPreviousNextFactorRule::checkFinancialInstrumentAttributes7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			owner_lazy = () -> FinancialInstrumentAttributes7.mmObject();
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
			validator = ConstraintPreviousNextFactorRule::checkFinancialInstrumentAttributes5;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			owner_lazy = () -> FinancialInstrumentAttributes5.mmObject();
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
			validator = ConstraintPreviousNextFactorRule::checkFinancialInstrumentAttributes11;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			owner_lazy = () -> FinancialInstrumentAttributes11.mmObject();
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
			validator = ConstraintPreviousNextFactorRule::checkFinancialInstrumentAttributes10;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			owner_lazy = () -> FinancialInstrumentAttributes10.mmObject();
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
			validator = ConstraintPreviousNextFactorRule::checkFinancialInstrumentAttributes19;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			owner_lazy = () -> FinancialInstrumentAttributes19.mmObject();
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
			validator = ConstraintPreviousNextFactorRule::checkFinancialInstrumentAttributes16;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			owner_lazy = () -> FinancialInstrumentAttributes16.mmObject();
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
			validator = ConstraintPreviousNextFactorRule::checkFinancialInstrumentAttributes23;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			owner_lazy = () -> FinancialInstrumentAttributes23.mmObject();
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
			validator = ConstraintPreviousNextFactorRule::checkFinancialInstrumentAttributes24;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			owner_lazy = () -> FinancialInstrumentAttributes24.mmObject();
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
			validator = ConstraintPreviousNextFactorRule::checkFinancialInstrumentAttributes33;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			owner_lazy = () -> FinancialInstrumentAttributes33.mmObject();
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
			validator = ConstraintPreviousNextFactorRule::checkFinancialInstrumentAttributes34;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPreviousNextFactorRule.forFinancialInstrumentAttributes49);
			owner_lazy = () -> FinancialInstrumentAttributes34.mmObject();
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
			validator = ConstraintPreviousNextFactorRule::checkFinancialInstrumentAttributes39;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			owner_lazy = () -> FinancialInstrumentAttributes39.mmObject();
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
			validator = ConstraintPreviousNextFactorRule::checkFinancialInstrumentAttributes40;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			owner_lazy = () -> FinancialInstrumentAttributes40.mmObject();
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
			validator = ConstraintPreviousNextFactorRule::checkFinancialInstrumentAttributes43;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPreviousNextFactorRule.forFinancialInstrumentAttributes48);
			owner_lazy = () -> FinancialInstrumentAttributes43.mmObject();
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
			validator = ConstraintPreviousNextFactorRule::checkFinancialInstrumentAttributes45;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			owner_lazy = () -> FinancialInstrumentAttributes45.mmObject();
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
			validator = ConstraintPreviousNextFactorRule::checkFinancialInstrumentAttributes48;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPreviousNextFactorRule.forFinancialInstrumentAttributes66);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPreviousNextFactorRule.forFinancialInstrumentAttributes43;
			owner_lazy = () -> FinancialInstrumentAttributes48.mmObject();
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
			validator = ConstraintPreviousNextFactorRule::checkFinancialInstrumentAttributes50;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPreviousNextFactorRule.forFinancialInstrumentAttributes65);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPreviousNextFactorRule.forFinancialInstrumentAttributes32;
			owner_lazy = () -> FinancialInstrumentAttributes50.mmObject();
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
			validator = ConstraintPreviousNextFactorRule::checkFinancialInstrumentAttributes49;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPreviousNextFactorRule.forFinancialInstrumentAttributes67);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPreviousNextFactorRule.forFinancialInstrumentAttributes34;
			owner_lazy = () -> FinancialInstrumentAttributes49.mmObject();
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
			validator = ConstraintPreviousNextFactorRule::checkFinancialInstrumentAttributes55;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			owner_lazy = () -> FinancialInstrumentAttributes55.mmObject();
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
			validator = ConstraintPreviousNextFactorRule::checkFinancialInstrumentAttributes57;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			owner_lazy = () -> FinancialInstrumentAttributes57.mmObject();
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
			validator = ConstraintPreviousNextFactorRule::checkFinancialInstrumentAttributes56;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			owner_lazy = () -> FinancialInstrumentAttributes56.mmObject();
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
			validator = ConstraintPreviousNextFactorRule::checkFinancialInstrumentAttributes66;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPreviousNextFactorRule.forFinancialInstrumentAttributes79);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPreviousNextFactorRule.forFinancialInstrumentAttributes48;
			owner_lazy = () -> FinancialInstrumentAttributes66.mmObject();
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
			validator = ConstraintPreviousNextFactorRule::checkFinancialInstrumentAttributes65;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPreviousNextFactorRule.forFinancialInstrumentAttributes81);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPreviousNextFactorRule.forFinancialInstrumentAttributes50;
			owner_lazy = () -> FinancialInstrumentAttributes65.mmObject();
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
			validator = ConstraintPreviousNextFactorRule::checkFinancialInstrumentAttributes67;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPreviousNextFactorRule.forFinancialInstrumentAttributes80);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPreviousNextFactorRule.forFinancialInstrumentAttributes49;
			owner_lazy = () -> FinancialInstrumentAttributes67.mmObject();
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
			validator = ConstraintPreviousNextFactorRule::checkFinancialInstrumentAttributes70;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			owner_lazy = () -> FinancialInstrumentAttributes70.mmObject();
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
			validator = ConstraintPreviousNextFactorRule::checkFinancialInstrumentAttributes69;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			owner_lazy = () -> FinancialInstrumentAttributes69.mmObject();
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
			validator = ConstraintPreviousNextFactorRule::checkFinancialInstrumentAttributes71;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			owner_lazy = () -> FinancialInstrumentAttributes71.mmObject();
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
			validator = ConstraintPreviousNextFactorRule::checkFinancialInstrumentAttributes79;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPreviousNextFactorRule.forFinancialInstrumentAttributes66;
			owner_lazy = () -> FinancialInstrumentAttributes79.mmObject();
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
			validator = ConstraintPreviousNextFactorRule::checkFinancialInstrumentAttributes81;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPreviousNextFactorRule.forFinancialInstrumentAttributes65;
			owner_lazy = () -> FinancialInstrumentAttributes81.mmObject();
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
			validator = ConstraintPreviousNextFactorRule::checkFinancialInstrumentAttributes80;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPreviousNextFactorRule.forFinancialInstrumentAttributes67;
			owner_lazy = () -> FinancialInstrumentAttributes80.mmObject();
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
			validator = ConstraintPreviousNextFactorRule::checkFinancialInstrumentAttributes85;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			owner_lazy = () -> FinancialInstrumentAttributes85.mmObject();
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
			validator = ConstraintPreviousNextFactorRule::checkFinancialInstrumentAttributes84;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			owner_lazy = () -> FinancialInstrumentAttributes84.mmObject();
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
			validator = ConstraintPreviousNextFactorRule::checkFinancialInstrumentAttributes83;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNextFactorRule";
			definition = "In case of partial redemption by pool factor, PreviousFactor provides the factor applicable before redemption and NextFactor provides the factor applicable after redemption.";
			owner_lazy = () -> FinancialInstrumentAttributes83.mmObject();
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