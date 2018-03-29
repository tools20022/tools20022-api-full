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
import com.tools20022.repository.msg.FeeAndTax1;
import com.tools20022.repository.msg.Fees1;
import java.util.Arrays;

/**
 * One of the elements (CommercialAgreementReference, IndividualFee,
 * IndividualTax) must be present.
 */
public class ConstraintFeeTaxElementRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FeeAndTax1 FeeAndTax1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FeeTaxElementRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "One of the elements (CommercialAgreementReference, IndividualFee, IndividualTax) must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFeeTaxElementRule#forFees1
	 * ConstraintFeeTaxElementRule.forFees1}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FeeAndTax1> forFeeAndTax1 = new MMConstraint<FeeAndTax1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FeeTaxElementRule";
			definition = "One of the elements (CommercialAgreementReference, IndividualFee, IndividualTax) must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintFeeTaxElementRule.forFees1);
			owner_lazy = () -> FeeAndTax1.mmObject();
		}

		@Override
		public void executeValidator(FeeAndTax1 obj) throws Exception {
			checkFeeAndTax1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Fees1 Fees1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FeeTaxElementRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "One of the elements (CommercialAgreementReference, IndividualFee, IndividualTax) must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFeeTaxElementRule#forFeeAndTax1
	 * ConstraintFeeTaxElementRule.forFeeAndTax1}</li>
	 * </ul>
	 */
	public static final MMConstraint<Fees1> forFees1 = new MMConstraint<Fees1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FeeTaxElementRule";
			definition = "One of the elements (CommercialAgreementReference, IndividualFee, IndividualTax) must be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintFeeTaxElementRule.forFeeAndTax1;
			owner_lazy = () -> Fees1.mmObject();
		}

		@Override
		public void executeValidator(Fees1 obj) throws Exception {
			checkFees1(obj);
		}
	};

	/**
	 * One of the elements (CommercialAgreementReference, IndividualFee,
	 * IndividualTax) must be present.
	 */
	public static void checkFeeAndTax1(FeeAndTax1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * One of the elements (CommercialAgreementReference, IndividualFee,
	 * IndividualTax) must be present.
	 */
	public static void checkFees1(Fees1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}