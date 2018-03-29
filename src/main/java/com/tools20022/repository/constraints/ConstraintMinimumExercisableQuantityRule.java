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

/**
 * MinimumExercisableQuantity and MinimumExercisableMultipleQuantity are
 * different from MinimumExercisableQuantity and
 * MinimumExercisableMultipleQuantity used in the
 * CorporateActionNotificationV01/
 * CorporateActionGeneralIndformation/UnderlyingSecurity financial instrument
 * attributes as they give indication on quantity of financial instrument in the
 * precise context of the described corporate actions for a given account
 * servicer. In
 * CorporateActionNotificationV01/CorporateActionGeneralIndformation
 * /UnderlyingSecurity, the quantity given are the quantity pertaining to the
 * financial instrument in general, not specifics to the corporate action
 * processing.
 */
public class ConstraintMinimumExercisableQuantityRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity1
	 * CorporateActionQuantity1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumExercisableQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "MinimumExercisableQuantity and MinimumExercisableMultipleQuantity are different from MinimumExercisableQuantity and MinimumExercisableMultipleQuantity used in the CorporateActionNotificationV01/CorporateActionGeneralIndformation/UnderlyingSecurity financial instrument attributes as they give indication on quantity of financial instrument in the precise context of the described corporate actions for a given account servicer. In CorporateActionNotificationV01/CorporateActionGeneralIndformation/UnderlyingSecurity, the quantity given are the quantity pertaining to the financial instrument in general, not specifics to the corporate action processing."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionQuantity1> forCorporateActionQuantity1 = new MMConstraint<CorporateActionQuantity1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumExercisableQuantityRule";
			definition = "MinimumExercisableQuantity and MinimumExercisableMultipleQuantity are different from MinimumExercisableQuantity and MinimumExercisableMultipleQuantity used in the CorporateActionNotificationV01/CorporateActionGeneralIndformation/UnderlyingSecurity financial instrument attributes as they give indication on quantity of financial instrument in the precise context of the described corporate actions for a given account servicer. In CorporateActionNotificationV01/CorporateActionGeneralIndformation/UnderlyingSecurity, the quantity given are the quantity pertaining to the financial instrument in general, not specifics to the corporate action processing.";
			owner_lazy = () -> CorporateActionQuantity1.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionQuantity1 obj) throws Exception {
			checkCorporateActionQuantity1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity2
	 * CorporateActionQuantity2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumExercisableQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "MinimumExercisableQuantity and MinimumExercisableMultipleQuantity are different from MinimumExercisableQuantity and MinimumExercisableMultipleQuantity used in the CorporateActionNotificationV01/CorporateActionGeneralIndformation/UnderlyingSecurity financial instrument attributes as they give indication on quantity of financial instrument in the precise context of the described corporate actions for a given account servicer. In CorporateActionNotificationV01/CorporateActionGeneralIndformation/UnderlyingSecurity, the quantity given are the quantity pertaining to the financial instrument in general, not specifics to the corporate action processing."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionQuantity2> forCorporateActionQuantity2 = new MMConstraint<CorporateActionQuantity2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumExercisableQuantityRule";
			definition = "MinimumExercisableQuantity and MinimumExercisableMultipleQuantity are different from MinimumExercisableQuantity and MinimumExercisableMultipleQuantity used in the CorporateActionNotificationV01/CorporateActionGeneralIndformation/UnderlyingSecurity financial instrument attributes as they give indication on quantity of financial instrument in the precise context of the described corporate actions for a given account servicer. In CorporateActionNotificationV01/CorporateActionGeneralIndformation/UnderlyingSecurity, the quantity given are the quantity pertaining to the financial instrument in general, not specifics to the corporate action processing.";
			owner_lazy = () -> CorporateActionQuantity2.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionQuantity2 obj) throws Exception {
			checkCorporateActionQuantity2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity3
	 * CorporateActionQuantity3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumExercisableQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "MinimumExercisableQuantity and MinimumExercisableMultipleQuantity are different from MinimumExercisableQuantity and MinimumExercisableMultipleQuantity used in the CorporateActionNotificationV01/CorporateActionGeneralIndformation/UnderlyingSecurity financial instrument attributes as they give indication on quantity of financial instrument in the precise context of the described corporate actions for a given account servicer. In CorporateActionNotificationV01/CorporateActionGeneralIndformation/UnderlyingSecurity, the quantity given are the quantity pertaining to the financial instrument in general, not specifics to the corporate action processing."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionQuantity3> forCorporateActionQuantity3 = new MMConstraint<CorporateActionQuantity3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumExercisableQuantityRule";
			definition = "MinimumExercisableQuantity and MinimumExercisableMultipleQuantity are different from MinimumExercisableQuantity and MinimumExercisableMultipleQuantity used in the CorporateActionNotificationV01/CorporateActionGeneralIndformation/UnderlyingSecurity financial instrument attributes as they give indication on quantity of financial instrument in the precise context of the described corporate actions for a given account servicer. In CorporateActionNotificationV01/CorporateActionGeneralIndformation/UnderlyingSecurity, the quantity given are the quantity pertaining to the financial instrument in general, not specifics to the corporate action processing.";
			owner_lazy = () -> CorporateActionQuantity3.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionQuantity3 obj) throws Exception {
			checkCorporateActionQuantity3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity4
	 * CorporateActionQuantity4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumExercisableQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "MinimumExercisableQuantity and MinimumExercisableMultipleQuantity are different from MinimumExercisableQuantity and MinimumExercisableMultipleQuantity used in the CorporateActionNotificationV01/CorporateActionGeneralIndformation/UnderlyingSecurity financial instrument attributes as they give indication on quantity of financial instrument in the precise context of the described corporate actions for a given account servicer. In CorporateActionNotificationV01/CorporateActionGeneralIndformation/UnderlyingSecurity, the quantity given are the quantity pertaining to the financial instrument in general, not specifics to the corporate action processing."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionQuantity4> forCorporateActionQuantity4 = new MMConstraint<CorporateActionQuantity4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumExercisableQuantityRule";
			definition = "MinimumExercisableQuantity and MinimumExercisableMultipleQuantity are different from MinimumExercisableQuantity and MinimumExercisableMultipleQuantity used in the CorporateActionNotificationV01/CorporateActionGeneralIndformation/UnderlyingSecurity financial instrument attributes as they give indication on quantity of financial instrument in the precise context of the described corporate actions for a given account servicer. In CorporateActionNotificationV01/CorporateActionGeneralIndformation/UnderlyingSecurity, the quantity given are the quantity pertaining to the financial instrument in general, not specifics to the corporate action processing.";
			owner_lazy = () -> CorporateActionQuantity4.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionQuantity4 obj) throws Exception {
			checkCorporateActionQuantity4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity5
	 * CorporateActionQuantity5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumExercisableQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "MinimumExercisableQuantity and MinimumExercisableMultipleQuantity are different from MinimumExercisableQuantity and MinimumExercisableMultipleQuantity used in the CorporateActionGeneralIndformation/UnderlyingSecurity financial instrument attributes as they give indication on quantity of financial instrument in the precise context of the described corporate actions for a given account servicer. In CorporateActionGeneralIndformation/UnderlyingSecurity, the quantity given are the quantity pertaining to the financial instrument in general, not specifics to the corporate action processing."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionQuantity5> forCorporateActionQuantity5 = new MMConstraint<CorporateActionQuantity5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumExercisableQuantityRule";
			definition = "MinimumExercisableQuantity and MinimumExercisableMultipleQuantity are different from MinimumExercisableQuantity and MinimumExercisableMultipleQuantity used in the CorporateActionGeneralIndformation/UnderlyingSecurity financial instrument attributes as they give indication on quantity of financial instrument in the precise context of the described corporate actions for a given account servicer. In CorporateActionGeneralIndformation/UnderlyingSecurity, the quantity given are the quantity pertaining to the financial instrument in general, not specifics to the corporate action processing.";
			owner_lazy = () -> CorporateActionQuantity5.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionQuantity5 obj) throws Exception {
			checkCorporateActionQuantity5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity6
	 * CorporateActionQuantity6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumExercisableQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "MinimumExercisableQuantity and MinimumExercisableMultipleQuantity are different from MinimumExercisableQuantity and MinimumExercisableMultipleQuantity used in the CorporateActionGeneralIndformation/UnderlyingSecurity financial instrument attributes as they give indication on quantity of financial instrument in the precise context of the described corporate actions for a given account servicer. In CorporateActionGeneralIndformation/UnderlyingSecurity, the quantity given are the quantity pertaining to the financial instrument in general, not specifics to the corporate action processing."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionQuantity6> forCorporateActionQuantity6 = new MMConstraint<CorporateActionQuantity6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumExercisableQuantityRule";
			definition = "MinimumExercisableQuantity and MinimumExercisableMultipleQuantity are different from MinimumExercisableQuantity and MinimumExercisableMultipleQuantity used in the CorporateActionGeneralIndformation/UnderlyingSecurity financial instrument attributes as they give indication on quantity of financial instrument in the precise context of the described corporate actions for a given account servicer. In CorporateActionGeneralIndformation/UnderlyingSecurity, the quantity given are the quantity pertaining to the financial instrument in general, not specifics to the corporate action processing.";
			owner_lazy = () -> CorporateActionQuantity6.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionQuantity6 obj) throws Exception {
			checkCorporateActionQuantity6(obj);
		}
	};

	/**
	 * MinimumExercisableQuantity and MinimumExercisableMultipleQuantity are
	 * different from MinimumExercisableQuantity and
	 * MinimumExercisableMultipleQuantity used in the
	 * CorporateActionNotificationV01
	 * /CorporateActionGeneralIndformation/UnderlyingSecurity financial
	 * instrument attributes as they give indication on quantity of financial
	 * instrument in the precise context of the described corporate actions for
	 * a given account servicer. In
	 * CorporateActionNotificationV01/CorporateActionGeneralIndformation
	 * /UnderlyingSecurity, the quantity given are the quantity pertaining to
	 * the financial instrument in general, not specifics to the corporate
	 * action processing.
	 */
	public static void checkCorporateActionQuantity1(CorporateActionQuantity1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * MinimumExercisableQuantity and MinimumExercisableMultipleQuantity are
	 * different from MinimumExercisableQuantity and
	 * MinimumExercisableMultipleQuantity used in the
	 * CorporateActionNotificationV01
	 * /CorporateActionGeneralIndformation/UnderlyingSecurity financial
	 * instrument attributes as they give indication on quantity of financial
	 * instrument in the precise context of the described corporate actions for
	 * a given account servicer. In
	 * CorporateActionNotificationV01/CorporateActionGeneralIndformation
	 * /UnderlyingSecurity, the quantity given are the quantity pertaining to
	 * the financial instrument in general, not specifics to the corporate
	 * action processing.
	 */
	public static void checkCorporateActionQuantity2(CorporateActionQuantity2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * MinimumExercisableQuantity and MinimumExercisableMultipleQuantity are
	 * different from MinimumExercisableQuantity and
	 * MinimumExercisableMultipleQuantity used in the
	 * CorporateActionNotificationV01
	 * /CorporateActionGeneralIndformation/UnderlyingSecurity financial
	 * instrument attributes as they give indication on quantity of financial
	 * instrument in the precise context of the described corporate actions for
	 * a given account servicer. In
	 * CorporateActionNotificationV01/CorporateActionGeneralIndformation
	 * /UnderlyingSecurity, the quantity given are the quantity pertaining to
	 * the financial instrument in general, not specifics to the corporate
	 * action processing.
	 */
	public static void checkCorporateActionQuantity3(CorporateActionQuantity3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * MinimumExercisableQuantity and MinimumExercisableMultipleQuantity are
	 * different from MinimumExercisableQuantity and
	 * MinimumExercisableMultipleQuantity used in the
	 * CorporateActionNotificationV01
	 * /CorporateActionGeneralIndformation/UnderlyingSecurity financial
	 * instrument attributes as they give indication on quantity of financial
	 * instrument in the precise context of the described corporate actions for
	 * a given account servicer. In
	 * CorporateActionNotificationV01/CorporateActionGeneralIndformation
	 * /UnderlyingSecurity, the quantity given are the quantity pertaining to
	 * the financial instrument in general, not specifics to the corporate
	 * action processing.
	 */
	public static void checkCorporateActionQuantity4(CorporateActionQuantity4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * MinimumExercisableQuantity and MinimumExercisableMultipleQuantity are
	 * different from MinimumExercisableQuantity and
	 * MinimumExercisableMultipleQuantity used in the
	 * CorporateActionGeneralIndformation/UnderlyingSecurity financial
	 * instrument attributes as they give indication on quantity of financial
	 * instrument in the precise context of the described corporate actions for
	 * a given account servicer. In
	 * CorporateActionGeneralIndformation/UnderlyingSecurity, the quantity given
	 * are the quantity pertaining to the financial instrument in general, not
	 * specifics to the corporate action processing.
	 */
	public static void checkCorporateActionQuantity5(CorporateActionQuantity5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * MinimumExercisableQuantity and MinimumExercisableMultipleQuantity are
	 * different from MinimumExercisableQuantity and
	 * MinimumExercisableMultipleQuantity used in the
	 * CorporateActionGeneralIndformation/UnderlyingSecurity financial
	 * instrument attributes as they give indication on quantity of financial
	 * instrument in the precise context of the described corporate actions for
	 * a given account servicer. In
	 * CorporateActionGeneralIndformation/UnderlyingSecurity, the quantity given
	 * are the quantity pertaining to the financial instrument in general, not
	 * specifics to the corporate action processing.
	 */
	public static void checkCorporateActionQuantity6(CorporateActionQuantity6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}