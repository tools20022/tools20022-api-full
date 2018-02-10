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
import com.tools20022.repository.msg.Fee1;
import com.tools20022.repository.msg.Fee3;

/**
 * One of the elements (Type, RepairedStandardAmount, RepairedStandardRate,
 * RepairedDiscountAmount, RepairedDiscountRate, RepairedRequestedAmount,
 * RepairedRequestedRate, CommercialAgreementReference,
 * NewCommercialAgreementReferenceIndicator) must be present.
 */
public class ConstraintFeeElementRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Fee3 Fee3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FeeElementRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "One of the elements (Type, RepairedStandardAmount, RepairedStandardRate, RepairedDiscountAmount, RepairedDiscountRate, RepairedRequestedAmount, RepairedRequestedRate, CommercialAgreementReference, NewCommercialAgreementReferenceIndicator) must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Fee3> forFee3 = new MMConstraint<Fee3>() {
		{
			validator = ConstraintFeeElementRule::checkFee3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FeeElementRule";
			definition = "One of the elements (Type, RepairedStandardAmount, RepairedStandardRate, RepairedDiscountAmount, RepairedDiscountRate, RepairedRequestedAmount, RepairedRequestedRate, CommercialAgreementReference, NewCommercialAgreementReferenceIndicator) must be present.";
			owner_lazy = () -> Fee3.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Fee1 Fee1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FeeElementRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "One of the elements (Basis, StandardAmount, StandardRate, DiscountDetails, RequestedAmount, RequestedRate, NonStandardSLAReference, RecipientIdentification) must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Fee1> forFee1 = new MMConstraint<Fee1>() {
		{
			validator = ConstraintFeeElementRule::checkFee1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FeeElementRule";
			definition = "One of the elements (Basis, StandardAmount, StandardRate, DiscountDetails, RequestedAmount, RequestedRate, NonStandardSLAReference, RecipientIdentification) must be present.";
			owner_lazy = () -> Fee1.mmObject();
		}
	};

	/**
	 * One of the elements (Type, RepairedStandardAmount, RepairedStandardRate,
	 * RepairedDiscountAmount, RepairedDiscountRate, RepairedRequestedAmount,
	 * RepairedRequestedRate, CommercialAgreementReference,
	 * NewCommercialAgreementReferenceIndicator) must be present.
	 */
	public static void checkFee3(Fee3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * One of the elements (Basis, StandardAmount, StandardRate,
	 * DiscountDetails, RequestedAmount, RequestedRate, NonStandardSLAReference,
	 * RecipientIdentification) must be present.
	 */
	public static void checkFee1(Fee1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}