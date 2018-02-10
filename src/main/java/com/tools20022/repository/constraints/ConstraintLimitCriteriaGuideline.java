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
import com.tools20022.repository.msg.LimitCriteria1;
import com.tools20022.repository.msg.LimitCriteria2;
import com.tools20022.repository.msg.LimitCriteria3;

/**
 * If a bilateral limit regarding specific members in the system is required,
 * then the identification of the bilateral counterpart should be given. By
 * default, if there is no identification of the bilateral counterpart and the
 * current or default bilateral limit is required, then all the bilateral limits
 * with the relevant counterpart identifications are returned
 */
public class ConstraintLimitCriteriaGuideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.LimitCriteria1 LimitCriteria1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitCriteriaGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If a bilateral limit regarding specific members in the system is required, then the identification of the bilateral counterpart should be given.\nBy default, if there is no identification of the bilateral counterpart and the current or default bilateral limit is required, then all the bilateral limits with the relevant counterpart identifications are returned"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<LimitCriteria1> forLimitCriteria1 = new MMConstraint<LimitCriteria1>() {
		{
			validator = ConstraintLimitCriteriaGuideline::checkLimitCriteria1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitCriteriaGuideline";
			definition = "If a bilateral limit regarding specific members in the system is required, then the identification of the bilateral counterpart should be given.\nBy default, if there is no identification of the bilateral counterpart and the current or default bilateral limit is required, then all the bilateral limits with the relevant counterpart identifications are returned";
			owner_lazy = () -> LimitCriteria1.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.LimitCriteria2 LimitCriteria2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitCriteriaGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If a bilateral limit regarding specific members in the system is required, then the identification of the bilateral counterpart should be given.\nBy default, if there is no identification of the bilateral counterpart and the current or default bilateral limit is required, then all the bilateral limits with the relevant counterpart identifications are returned"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<LimitCriteria2> forLimitCriteria2 = new MMConstraint<LimitCriteria2>() {
		{
			validator = ConstraintLimitCriteriaGuideline::checkLimitCriteria2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitCriteriaGuideline";
			definition = "If a bilateral limit regarding specific members in the system is required, then the identification of the bilateral counterpart should be given.\nBy default, if there is no identification of the bilateral counterpart and the current or default bilateral limit is required, then all the bilateral limits with the relevant counterpart identifications are returned";
			owner_lazy = () -> LimitCriteria2.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.LimitCriteria3 LimitCriteria3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitCriteriaGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If a bilateral limit regarding specific members in the system is required, then the identification of the bilateral counterpart should be given.\nBy default, if there is no identification of the bilateral counterpart and the current or default bilateral limit is required, then all the bilateral limits with the relevant counterpart identifications are returned"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<LimitCriteria3> forLimitCriteria3 = new MMConstraint<LimitCriteria3>() {
		{
			validator = ConstraintLimitCriteriaGuideline::checkLimitCriteria3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitCriteriaGuideline";
			definition = "If a bilateral limit regarding specific members in the system is required, then the identification of the bilateral counterpart should be given.\nBy default, if there is no identification of the bilateral counterpart and the current or default bilateral limit is required, then all the bilateral limits with the relevant counterpart identifications are returned";
			owner_lazy = () -> LimitCriteria3.mmObject();
		}
	};

	/**
	 * If a bilateral limit regarding specific members in the system is
	 * required, then the identification of the bilateral counterpart should be
	 * given. By default, if there is no identification of the bilateral
	 * counterpart and the current or default bilateral limit is required, then
	 * all the bilateral limits with the relevant counterpart identifications
	 * are returned
	 */
	public static void checkLimitCriteria1(LimitCriteria1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If a bilateral limit regarding specific members in the system is
	 * required, then the identification of the bilateral counterpart should be
	 * given. By default, if there is no identification of the bilateral
	 * counterpart and the current or default bilateral limit is required, then
	 * all the bilateral limits with the relevant counterpart identifications
	 * are returned
	 */
	public static void checkLimitCriteria2(LimitCriteria2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If a bilateral limit regarding specific members in the system is
	 * required, then the identification of the bilateral counterpart should be
	 * given. By default, if there is no identification of the bilateral
	 * counterpart and the current or default bilateral limit is required, then
	 * all the bilateral limits with the relevant counterpart identifications
	 * are returned
	 */
	public static void checkLimitCriteria3(LimitCriteria3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}