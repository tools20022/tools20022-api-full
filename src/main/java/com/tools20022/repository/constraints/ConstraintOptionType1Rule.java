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
import com.tools20022.repository.msg.CorporateActionOption13;
import com.tools20022.repository.msg.CorporateActionOption5;

/**
 * If for an exercise of warrants or an exercise of rights, the proceeds are
 * known, the more precise OptionType/Code values like CASH, SECU, CASE or NOAC
 * must be used. <br>
 * If the proceeds are at issuer choice, ie, the proceeds are not known upfront,
 * then OptionType/Code EXER must be used.
 */
public class ConstraintOptionType1Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption5
	 * CorporateActionOption5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionType1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If for an exercise of warrants or an exercise of rights, the proceeds are known, the more precise OptionType/Code values like CASH, SECU, CASE or NOAC must be used. \r\nIf the proceeds are at issuer choice, ie, the proceeds are not known upfront, then OptionType/Code EXER must be used."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption5> forCorporateActionOption5 = new MMConstraint<CorporateActionOption5>() {
		{
			validator = ConstraintOptionType1Rule::checkCorporateActionOption5;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionType1Rule";
			definition = "If for an exercise of warrants or an exercise of rights, the proceeds are known, the more precise OptionType/Code values like CASH, SECU, CASE or NOAC must be used. \r\nIf the proceeds are at issuer choice, ie, the proceeds are not known upfront, then OptionType/Code EXER must be used.";
			owner_lazy = () -> CorporateActionOption5.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption13
	 * CorporateActionOption13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionType1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If for an exercise of warrants or an exercise of rights, the proceeds are known, the more precise OptionType/Code values like CASH, SECU, CASE or NOAC must be used. \r\nIf the proceeds are at issuer choice, ie, the proceeds are not known upfront, then OptionType/Code EXER must be used."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption13> forCorporateActionOption13 = new MMConstraint<CorporateActionOption13>() {
		{
			validator = ConstraintOptionType1Rule::checkCorporateActionOption13;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionType1Rule";
			definition = "If for an exercise of warrants or an exercise of rights, the proceeds are known, the more precise OptionType/Code values like CASH, SECU, CASE or NOAC must be used. \r\nIf the proceeds are at issuer choice, ie, the proceeds are not known upfront, then OptionType/Code EXER must be used.";
			owner_lazy = () -> CorporateActionOption13.mmObject();
		}
	};

	/**
	 * If for an exercise of warrants or an exercise of rights, the proceeds are
	 * known, the more precise OptionType/Code values like CASH, SECU, CASE or
	 * NOAC must be used. <br>
	 * If the proceeds are at issuer choice, ie, the proceeds are not known
	 * upfront, then OptionType/Code EXER must be used.
	 */
	public static void checkCorporateActionOption5(CorporateActionOption5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If for an exercise of warrants or an exercise of rights, the proceeds are
	 * known, the more precise OptionType/Code values like CASH, SECU, CASE or
	 * NOAC must be used. <br>
	 * If the proceeds are at issuer choice, ie, the proceeds are not known
	 * upfront, then OptionType/Code EXER must be used.
	 */
	public static void checkCorporateActionOption13(CorporateActionOption13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}