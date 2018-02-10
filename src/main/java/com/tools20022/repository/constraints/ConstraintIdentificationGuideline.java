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
import com.tools20022.repository.msg.FinancialInstrument55;
import com.tools20022.repository.msg.FinancialInstrument56;
import com.tools20022.repository.msg.FinancialInstrument57;

/**
 * It is recommended that ISIN is used in Identification.<br>
 * When an ISIN code exists, it is strongly recommended that the ISIN be used.
 */
public class ConstraintIdentificationGuideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument57
	 * FinancialInstrument57}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentificationGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is recommended that ISIN is used in Identification.\r\nWhen an ISIN code exists, it is strongly recommended that the ISIN be used."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline#forFinancialInstrument10
	 * ConstraintFinancialInstrumentIdentificationGuideline.
	 * forFinancialInstrument10}</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrument57> forFinancialInstrument57 = new MMConstraint<FinancialInstrument57>() {
		{
			validator = ConstraintIdentificationGuideline::checkFinancialInstrument57;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IdentificationGuideline";
			definition = "It is recommended that ISIN is used in Identification.\r\nWhen an ISIN code exists, it is strongly recommended that the ISIN be used.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline.forFinancialInstrument10;
			owner_lazy = () -> FinancialInstrument57.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument56
	 * FinancialInstrument56}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentificationGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is recommended that ISIN is used in Identification.\r\nWhen an ISIN code exists, it is strongly recommended that the ISIN be used."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline#forFinancialInstrument51
	 * ConstraintFinancialInstrumentIdentificationGuideline.
	 * forFinancialInstrument51}</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrument56> forFinancialInstrument56 = new MMConstraint<FinancialInstrument56>() {
		{
			validator = ConstraintIdentificationGuideline::checkFinancialInstrument56;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IdentificationGuideline";
			definition = "It is recommended that ISIN is used in Identification.\r\nWhen an ISIN code exists, it is strongly recommended that the ISIN be used.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline.forFinancialInstrument51;
			owner_lazy = () -> FinancialInstrument56.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument55
	 * FinancialInstrument55}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentificationGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is recommended that ISIN is used in Identification.\r\nWhen an ISIN code exists, it is strongly recommended that the ISIN be used."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline#forFinancialInstrument45
	 * ConstraintFinancialInstrumentIdentificationGuideline.
	 * forFinancialInstrument45}</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrument55> forFinancialInstrument55 = new MMConstraint<FinancialInstrument55>() {
		{
			validator = ConstraintIdentificationGuideline::checkFinancialInstrument55;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IdentificationGuideline";
			definition = "It is recommended that ISIN is used in Identification.\r\nWhen an ISIN code exists, it is strongly recommended that the ISIN be used.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline.forFinancialInstrument45;
			owner_lazy = () -> FinancialInstrument55.mmObject();
		}
	};

	/**
	 * It is recommended that ISIN is used in Identification.<br>
	 * When an ISIN code exists, it is strongly recommended that the ISIN be
	 * used.
	 */
	public static void checkFinancialInstrument57(FinancialInstrument57 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended that ISIN is used in Identification.<br>
	 * When an ISIN code exists, it is strongly recommended that the ISIN be
	 * used.
	 */
	public static void checkFinancialInstrument56(FinancialInstrument56 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended that ISIN is used in Identification.<br>
	 * When an ISIN code exists, it is strongly recommended that the ISIN be
	 * used.
	 */
	public static void checkFinancialInstrument55(FinancialInstrument55 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}