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
import com.tools20022.repository.msg.RateDetails31;
import com.tools20022.repository.msg.RateDetails32;
import com.tools20022.repository.msg.RateDetails33;
import com.tools20022.repository.msg.RateDetails34;

/**
 * If DeemedRate is repeated, then
 * DeemedRate/RateTypeAndAmountAndRateStatus/RateType/Code values and
 * DeemedRate/RateTypeAndRate/RateType/Code values must all be different in each
 * occurrence of DeemedRate. <br>
 * (MT 566 NVR C4).
 */
public class ConstraintDeemedRate1Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails33 RateDetails33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeemedRate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If DeemedRate is repeated, then DeemedRate/RateTypeAndAmountAndRateStatus/RateType/Code values and DeemedRate/RateTypeAndRate/RateType/Code values must all be different in each occurrence of DeemedRate. \r\n(MT 566 NVR C4)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails33> forRateDetails33 = new MMConstraint<RateDetails33>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeemedRate1Rule";
			definition = "If DeemedRate is repeated, then DeemedRate/RateTypeAndAmountAndRateStatus/RateType/Code values and DeemedRate/RateTypeAndRate/RateType/Code values must all be different in each occurrence of DeemedRate. \r\n(MT 566 NVR C4).";
			owner_lazy = () -> RateDetails33.mmObject();
		}

		@Override
		public void executeValidator(RateDetails33 obj) throws Exception {
			checkRateDetails33(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails32 RateDetails32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeemedRate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If DeemedRate is repeated, then DeemedRate/RateTypeAndAmountAndRateStatus/RateType/Code values and DeemedRate/RateTypeAndRate/RateType/Code values must all be different in each occurrence of DeemedRate. \r\n(MT 566 NVR C4)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails32> forRateDetails32 = new MMConstraint<RateDetails32>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeemedRate1Rule";
			definition = "If DeemedRate is repeated, then DeemedRate/RateTypeAndAmountAndRateStatus/RateType/Code values and DeemedRate/RateTypeAndRate/RateType/Code values must all be different in each occurrence of DeemedRate. \r\n(MT 566 NVR C4).";
			owner_lazy = () -> RateDetails32.mmObject();
		}

		@Override
		public void executeValidator(RateDetails32 obj) throws Exception {
			checkRateDetails32(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails34 RateDetails34}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeemedRate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If DeemedRate is repeated, then DeemedRate/RateTypeAndAmountAndRateStatus/RateType/Code values and DeemedRate/RateTypeAndRate/RateType/Code values must all be different in each occurrence of DeemedRate. \r\n(MT 564 NVR C8)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails34> forRateDetails34 = new MMConstraint<RateDetails34>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeemedRate1Rule";
			definition = "If DeemedRate is repeated, then DeemedRate/RateTypeAndAmountAndRateStatus/RateType/Code values and DeemedRate/RateTypeAndRate/RateType/Code values must all be different in each occurrence of DeemedRate. \r\n(MT 564 NVR C8).";
			owner_lazy = () -> RateDetails34.mmObject();
		}

		@Override
		public void executeValidator(RateDetails34 obj) throws Exception {
			checkRateDetails34(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails31 RateDetails31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeemedRate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If DeemedRate is repeated, then DeemedRate/RateTypeAndAmountAndRateStatus/RateType/Code values and DeemedRate/RateTypeAndRate/RateType/Code values must all be different in each occurrence of DeemedRate. \r\n(MT 564 NVR C8)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails31> forRateDetails31 = new MMConstraint<RateDetails31>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeemedRate1Rule";
			definition = "If DeemedRate is repeated, then DeemedRate/RateTypeAndAmountAndRateStatus/RateType/Code values and DeemedRate/RateTypeAndRate/RateType/Code values must all be different in each occurrence of DeemedRate. \r\n(MT 564 NVR C8).";
			owner_lazy = () -> RateDetails31.mmObject();
		}

		@Override
		public void executeValidator(RateDetails31 obj) throws Exception {
			checkRateDetails31(obj);
		}
	};

	/**
	 * If DeemedRate is repeated, then
	 * DeemedRate/RateTypeAndAmountAndRateStatus/RateType/Code values and
	 * DeemedRate/RateTypeAndRate/RateType/Code values must all be different in
	 * each occurrence of DeemedRate. <br>
	 * (MT 566 NVR C4).
	 */
	public static void checkRateDetails33(RateDetails33 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If DeemedRate is repeated, then
	 * DeemedRate/RateTypeAndAmountAndRateStatus/RateType/Code values and
	 * DeemedRate/RateTypeAndRate/RateType/Code values must all be different in
	 * each occurrence of DeemedRate. <br>
	 * (MT 566 NVR C4).
	 */
	public static void checkRateDetails32(RateDetails32 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If DeemedRate is repeated, then
	 * DeemedRate/RateTypeAndAmountAndRateStatus/RateType/Code values and
	 * DeemedRate/RateTypeAndRate/RateType/Code values must all be different in
	 * each occurrence of DeemedRate. <br>
	 * (MT 564 NVR C8).
	 */
	public static void checkRateDetails34(RateDetails34 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If DeemedRate is repeated, then
	 * DeemedRate/RateTypeAndAmountAndRateStatus/RateType/Code values and
	 * DeemedRate/RateTypeAndRate/RateType/Code values must all be different in
	 * each occurrence of DeemedRate. <br>
	 * (MT 564 NVR C8).
	 */
	public static void checkRateDetails31(RateDetails31 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}