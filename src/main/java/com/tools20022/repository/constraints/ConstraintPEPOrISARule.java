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
import com.tools20022.repository.msg.PEPISACashTransfer1;
import com.tools20022.repository.msg.PEPISACashTransfer2;

/**
 * If Type is PEPT, then Year/PEP is mandatory. If Type is PEPT, then Year/ISA
 * is not allowed. If Type is ISAT then Year/ISA is mandatory. If Type is ISAT,
 * then Year/PEP is not allowed.
 */
public class ConstraintPEPOrISARule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PEPISACashTransfer1
	 * PEPISACashTransfer1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PEPOrISARule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * " If Type is PEPT, then Year/PEP is mandatory. If Type is PEPT, then Year/ISA is not allowed. If Type is ISAT then Year/ISA is mandatory. If Type is ISAT, then Year/PEP is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PEPISACashTransfer1> forPEPISACashTransfer1 = new MMConstraint<PEPISACashTransfer1>() {
		{
			validator = ConstraintPEPOrISARule::checkPEPISACashTransfer1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PEPOrISARule";
			definition = " If Type is PEPT, then Year/PEP is mandatory. If Type is PEPT, then Year/ISA is not allowed. If Type is ISAT then Year/ISA is mandatory. If Type is ISAT, then Year/PEP is not allowed.";
			owner_lazy = () -> PEPISACashTransfer1.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PEPISACashTransfer2
	 * PEPISACashTransfer2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PEPOrISARule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * " If Type is PEPT, then Year/PEP is mandatory. If Type is PEPT, then Year/ISA is not allowed. If Type is ISAT then Year/ISA is mandatory. If Type is ISAT, then Year/PEP is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PEPISACashTransfer2> forPEPISACashTransfer2 = new MMConstraint<PEPISACashTransfer2>() {
		{
			validator = ConstraintPEPOrISARule::checkPEPISACashTransfer2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PEPOrISARule";
			definition = " If Type is PEPT, then Year/PEP is mandatory. If Type is PEPT, then Year/ISA is not allowed. If Type is ISAT then Year/ISA is mandatory. If Type is ISAT, then Year/PEP is not allowed.";
			owner_lazy = () -> PEPISACashTransfer2.mmObject();
		}
	};

	/**
	 * If Type is PEPT, then Year/PEP is mandatory. If Type is PEPT, then
	 * Year/ISA is not allowed. If Type is ISAT then Year/ISA is mandatory. If
	 * Type is ISAT, then Year/PEP is not allowed.
	 */
	public static void checkPEPISACashTransfer1(PEPISACashTransfer1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Type is PEPT, then Year/PEP is mandatory. If Type is PEPT, then
	 * Year/ISA is not allowed. If Type is ISAT then Year/ISA is mandatory. If
	 * Type is ISAT, then Year/PEP is not allowed.
	 */
	public static void checkPEPISACashTransfer2(PEPISACashTransfer2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}