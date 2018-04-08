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
import com.tools20022.repository.area.seev.*;
import java.util.Arrays;

/**
 * MinimumExercisableQuantity and MinimumExercisableMultipleQuantity elements in
 * CorporateActionOptionDetails/SecuritiesQuantity are different from
 * MinimumExercisableQuantity and MinimumExercisableMultipleQuantity elements in
 * CorporateActionGeneralInformation/UnderlyingSecurity as they give indication
 * on quantity of financial instrument in the precise context of the described
 * corporate actions for a given account servicer. In
 * CorporateActionGeneralInformation/UnderlyingSecurity, the quantity given are
 * the quantity pertaining to the financial instrument in general, not specifics
 * to the corporate action processing.
 */
public class ConstraintMinimumExercisableQuantityGuideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV03
	 * CorporateActionNotificationV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumExercisableQuantityGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "MinimumExercisableQuantity and MinimumExercisableMultipleQuantity elements in CorporateActionOptionDetails/SecuritiesQuantity are different from MinimumExercisableQuantity and MinimumExercisableMultipleQuantity elements in CorporateActionGeneralInformation/UnderlyingSecurity as they give indication on quantity of financial instrument in the precise context of the described corporate actions for a given account servicer.\nIn CorporateActionGeneralInformation/UnderlyingSecurity, the quantity given are the quantity pertaining to the financial instrument in general, not specifics to the corporate action processing."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV03> for_seev_CorporateActionNotificationV03 = new MMConstraint<CorporateActionNotificationV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumExercisableQuantityGuideline";
			definition = "MinimumExercisableQuantity and MinimumExercisableMultipleQuantity elements in CorporateActionOptionDetails/SecuritiesQuantity are different from MinimumExercisableQuantity and MinimumExercisableMultipleQuantity elements in CorporateActionGeneralInformation/UnderlyingSecurity as they give indication on quantity of financial instrument in the precise context of the described corporate actions for a given account servicer.\nIn CorporateActionGeneralInformation/UnderlyingSecurity, the quantity given are the quantity pertaining to the financial instrument in general, not specifics to the corporate action processing.";
			owner_lazy = () -> CorporateActionNotificationV03.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionNotificationV03 obj) throws Exception {
			check_seev_CorporateActionNotificationV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV05
	 * CorporateActionNotificationV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumExercisableQuantityGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "MinimumExercisableQuantity and MinimumExercisableMultipleQuantity elements in CorporateActionOptionDetails/SecuritiesQuantity are different from MinimumExercisableQuantity and MinimumExercisableMultipleQuantity elements in CorporateActionGeneralInformation/UnderlyingSecurity as they give indication on quantity of financial instrument in the precise context of the described corporate actions for a given account servicer.\nIn CorporateActionGeneralInformation/UnderlyingSecurity, the quantity given are the quantity pertaining to the financial instrument in general, not specifics to the corporate action processing."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintMinimumExercisableQuantityGuideline#for_seev_CorporateActionNotificationV04
	 * ConstraintMinimumExercisableQuantityGuideline.
	 * for_seev_CorporateActionNotificationV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV05> for_seev_CorporateActionNotificationV05 = new MMConstraint<CorporateActionNotificationV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumExercisableQuantityGuideline";
			definition = "MinimumExercisableQuantity and MinimumExercisableMultipleQuantity elements in CorporateActionOptionDetails/SecuritiesQuantity are different from MinimumExercisableQuantity and MinimumExercisableMultipleQuantity elements in CorporateActionGeneralInformation/UnderlyingSecurity as they give indication on quantity of financial instrument in the precise context of the described corporate actions for a given account servicer.\nIn CorporateActionGeneralInformation/UnderlyingSecurity, the quantity given are the quantity pertaining to the financial instrument in general, not specifics to the corporate action processing.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintMinimumExercisableQuantityGuideline.for_seev_CorporateActionNotificationV04;
			owner_lazy = () -> CorporateActionNotificationV05.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionNotificationV05 obj) throws Exception {
			check_seev_CorporateActionNotificationV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV04
	 * CorporateActionNotificationV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumExercisableQuantityGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "MinimumExercisableQuantity and MinimumExercisableMultipleQuantity elements in CorporateActionOptionDetails/SecuritiesQuantity are different from MinimumExercisableQuantity and MinimumExercisableMultipleQuantity elements in CorporateActionGeneralInformation/UnderlyingSecurity as they give indication on quantity of financial instrument in the precise context of the described corporate actions for a given account servicer.\nIn CorporateActionGeneralInformation/UnderlyingSecurity, the quantity given are the quantity pertaining to the financial instrument in general, not specifics to the corporate action processing."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintMinimumExercisableQuantityGuideline#for_seev_CorporateActionNotificationV05
	 * ConstraintMinimumExercisableQuantityGuideline.
	 * for_seev_CorporateActionNotificationV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV04> for_seev_CorporateActionNotificationV04 = new MMConstraint<CorporateActionNotificationV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumExercisableQuantityGuideline";
			definition = "MinimumExercisableQuantity and MinimumExercisableMultipleQuantity elements in CorporateActionOptionDetails/SecuritiesQuantity are different from MinimumExercisableQuantity and MinimumExercisableMultipleQuantity elements in CorporateActionGeneralInformation/UnderlyingSecurity as they give indication on quantity of financial instrument in the precise context of the described corporate actions for a given account servicer.\nIn CorporateActionGeneralInformation/UnderlyingSecurity, the quantity given are the quantity pertaining to the financial instrument in general, not specifics to the corporate action processing.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintMinimumExercisableQuantityGuideline.for_seev_CorporateActionNotificationV05);
			owner_lazy = () -> CorporateActionNotificationV04.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionNotificationV04 obj) throws Exception {
			check_seev_CorporateActionNotificationV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV02
	 * CorporateActionNotificationV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumExercisableQuantityGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "MinimumExercisableQuantity and MinimumExercisableMultipleQuantity elements in CorporateActionOptionDetails/SecuritiesQuantity are different from MinimumExercisableQuantity and MinimumExercisableMultipleQuantity elements in CorporateActionGeneralInformation/UnderlyingSecurity as they give indication on quantity of financial instrument in the precise context of the described corporate actions for a given account servicer.\nIn CorporateActionGeneralInformation/UnderlyingSecurity, the quantity given are the quantity pertaining to the financial instrument in general, not specifics to the corporate action processing."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV02> for_seev_CorporateActionNotificationV02 = new MMConstraint<CorporateActionNotificationV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumExercisableQuantityGuideline";
			definition = "MinimumExercisableQuantity and MinimumExercisableMultipleQuantity elements in CorporateActionOptionDetails/SecuritiesQuantity are different from MinimumExercisableQuantity and MinimumExercisableMultipleQuantity elements in CorporateActionGeneralInformation/UnderlyingSecurity as they give indication on quantity of financial instrument in the precise context of the described corporate actions for a given account servicer.\nIn CorporateActionGeneralInformation/UnderlyingSecurity, the quantity given are the quantity pertaining to the financial instrument in general, not specifics to the corporate action processing.";
			owner_lazy = () -> CorporateActionNotificationV02.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionNotificationV02 obj) throws Exception {
			check_seev_CorporateActionNotificationV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV01
	 * CorporateActionNotificationV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumExercisableQuantityGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "MinimumExercisableQuantity and MinimumExercisableMultipleQuantity elements in CorporateActionOptionDetails/SecuritiesQuantity are different from MinimumExercisableQuantity and MinimumExercisableMultipleQuantity elements in CorporateActionGeneralInformation/UnderlyingSecurity as they give indication on quantity of financial instrument in the precise context of the described corporate actions for a given account servicer.\nIn CorporateActionGeneralInformation/UnderlyingSecurity, the quantity given are the quantity pertaining to the financial instrument in general, not specifics to the corporate action processing."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV01> for_seev_CorporateActionNotificationV01 = new MMConstraint<CorporateActionNotificationV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumExercisableQuantityGuideline";
			definition = "MinimumExercisableQuantity and MinimumExercisableMultipleQuantity elements in CorporateActionOptionDetails/SecuritiesQuantity are different from MinimumExercisableQuantity and MinimumExercisableMultipleQuantity elements in CorporateActionGeneralInformation/UnderlyingSecurity as they give indication on quantity of financial instrument in the precise context of the described corporate actions for a given account servicer.\nIn CorporateActionGeneralInformation/UnderlyingSecurity, the quantity given are the quantity pertaining to the financial instrument in general, not specifics to the corporate action processing.";
			owner_lazy = () -> CorporateActionNotificationV01.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionNotificationV01 obj) throws Exception {
			check_seev_CorporateActionNotificationV01(obj);
		}
	};

	/**
	 * MinimumExercisableQuantity and MinimumExercisableMultipleQuantity
	 * elements in CorporateActionOptionDetails/SecuritiesQuantity are different
	 * from MinimumExercisableQuantity and MinimumExercisableMultipleQuantity
	 * elements in CorporateActionGeneralInformation/UnderlyingSecurity as they
	 * give indication on quantity of financial instrument in the precise
	 * context of the described corporate actions for a given account servicer.
	 * In CorporateActionGeneralInformation/UnderlyingSecurity, the quantity
	 * given are the quantity pertaining to the financial instrument in general,
	 * not specifics to the corporate action processing.
	 */
	public static void check_seev_CorporateActionNotificationV03(CorporateActionNotificationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * MinimumExercisableQuantity and MinimumExercisableMultipleQuantity
	 * elements in CorporateActionOptionDetails/SecuritiesQuantity are different
	 * from MinimumExercisableQuantity and MinimumExercisableMultipleQuantity
	 * elements in CorporateActionGeneralInformation/UnderlyingSecurity as they
	 * give indication on quantity of financial instrument in the precise
	 * context of the described corporate actions for a given account servicer.
	 * In CorporateActionGeneralInformation/UnderlyingSecurity, the quantity
	 * given are the quantity pertaining to the financial instrument in general,
	 * not specifics to the corporate action processing.
	 */
	public static void check_seev_CorporateActionNotificationV05(CorporateActionNotificationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * MinimumExercisableQuantity and MinimumExercisableMultipleQuantity
	 * elements in CorporateActionOptionDetails/SecuritiesQuantity are different
	 * from MinimumExercisableQuantity and MinimumExercisableMultipleQuantity
	 * elements in CorporateActionGeneralInformation/UnderlyingSecurity as they
	 * give indication on quantity of financial instrument in the precise
	 * context of the described corporate actions for a given account servicer.
	 * In CorporateActionGeneralInformation/UnderlyingSecurity, the quantity
	 * given are the quantity pertaining to the financial instrument in general,
	 * not specifics to the corporate action processing.
	 */
	public static void check_seev_CorporateActionNotificationV04(CorporateActionNotificationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * MinimumExercisableQuantity and MinimumExercisableMultipleQuantity
	 * elements in CorporateActionOptionDetails/SecuritiesQuantity are different
	 * from MinimumExercisableQuantity and MinimumExercisableMultipleQuantity
	 * elements in CorporateActionGeneralInformation/UnderlyingSecurity as they
	 * give indication on quantity of financial instrument in the precise
	 * context of the described corporate actions for a given account servicer.
	 * In CorporateActionGeneralInformation/UnderlyingSecurity, the quantity
	 * given are the quantity pertaining to the financial instrument in general,
	 * not specifics to the corporate action processing.
	 */
	public static void check_seev_CorporateActionNotificationV02(CorporateActionNotificationV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * MinimumExercisableQuantity and MinimumExercisableMultipleQuantity
	 * elements in CorporateActionOptionDetails/SecuritiesQuantity are different
	 * from MinimumExercisableQuantity and MinimumExercisableMultipleQuantity
	 * elements in CorporateActionGeneralInformation/UnderlyingSecurity as they
	 * give indication on quantity of financial instrument in the precise
	 * context of the described corporate actions for a given account servicer.
	 * In CorporateActionGeneralInformation/UnderlyingSecurity, the quantity
	 * given are the quantity pertaining to the financial instrument in general,
	 * not specifics to the corporate action processing.
	 */
	public static void check_seev_CorporateActionNotificationV01(CorporateActionNotificationV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}