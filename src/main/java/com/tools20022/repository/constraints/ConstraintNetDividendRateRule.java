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
import com.tools20022.repository.msg.CorporateActionRate10;
import com.tools20022.repository.msg.CorporateActionRate12;
import com.tools20022.repository.msg.CorporateActionRate4;
import com.tools20022.repository.msg.CorporateActionRate5;

/**
 * If NettDividendRate is repeated, then:<br>
 * - NettDividendRate/RateTypeAndAmountAndRateStatus must be present and<br>
 * - RateTypeAndAmountAndRateStatus/RateType/Code values must all be different
 * in each occurrence of NettDividendRate.<br>
 * <br>
 * (MT 566 NVR C3 and C4).
 */
public class ConstraintNetDividendRateRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate4
	 * CorporateActionRate4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetDividendRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If NettDividendRate is repeated, then:\r\n- NettDividendRate/RateTypeAndAmountAndRateStatus must be present and\r\n- RateTypeAndAmountAndRateStatus/RateType/Code values must all be different in each occurrence of NettDividendRate.\r\n\r\n(MT 566 NVR C3 and C4)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate4> forCorporateActionRate4 = new MMConstraint<CorporateActionRate4>() {
		{
			validator = ConstraintNetDividendRateRule::checkCorporateActionRate4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetDividendRateRule";
			definition = "If NettDividendRate is repeated, then:\r\n- NettDividendRate/RateTypeAndAmountAndRateStatus must be present and\r\n- RateTypeAndAmountAndRateStatus/RateType/Code values must all be different in each occurrence of NettDividendRate.\r\n\r\n(MT 566 NVR C3 and C4).";
			owner_lazy = () -> CorporateActionRate4.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate10
	 * CorporateActionRate10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetDividendRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If NettDividendRate is repeated, then:\r\n- NettDividendRate/RateTypeAndAmountAndRateStatus must be present and\r\n- RateTypeAndAmountAndRateStatus/RateType/Code values must all be different in each occurrence of NettDividendRate.\r\n\r\n(MT 566 NVR C3 and C4)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate10> forCorporateActionRate10 = new MMConstraint<CorporateActionRate10>() {
		{
			validator = ConstraintNetDividendRateRule::checkCorporateActionRate10;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetDividendRateRule";
			definition = "If NettDividendRate is repeated, then:\r\n- NettDividendRate/RateTypeAndAmountAndRateStatus must be present and\r\n- RateTypeAndAmountAndRateStatus/RateType/Code values must all be different in each occurrence of NettDividendRate.\r\n\r\n(MT 566 NVR C3 and C4).";
			owner_lazy = () -> CorporateActionRate10.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5
	 * CorporateActionRate5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetDividendRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If NettDividendRate is repeated, then:\r\n- NettDividendRate/RateTypeAndAmountAndRateStatus must be present and\r\n- RateTypeAndAmountAndRateStatus/RateType/Code values must all be different in each occurrence of NettDividendRate.\r\n\r\n(MT 564 NVR C8 and C9)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate5> forCorporateActionRate5 = new MMConstraint<CorporateActionRate5>() {
		{
			validator = ConstraintNetDividendRateRule::checkCorporateActionRate5;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetDividendRateRule";
			definition = "If NettDividendRate is repeated, then:\r\n- NettDividendRate/RateTypeAndAmountAndRateStatus must be present and\r\n- RateTypeAndAmountAndRateStatus/RateType/Code values must all be different in each occurrence of NettDividendRate.\r\n\r\n(MT 564 NVR C8 and C9).";
			owner_lazy = () -> CorporateActionRate5.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate12
	 * CorporateActionRate12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetDividendRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If NettDividendRate is repeated, then:\r\n- NettDividendRate/RateTypeAndAmountAndRateStatus must be present and\r\n- RateTypeAndAmountAndRateStatus/RateType/Code values must all be different in each occurrence of NettDividendRate.\r\n\r\n(MT 564 NVR C8 and C9)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate12> forCorporateActionRate12 = new MMConstraint<CorporateActionRate12>() {
		{
			validator = ConstraintNetDividendRateRule::checkCorporateActionRate12;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetDividendRateRule";
			definition = "If NettDividendRate is repeated, then:\r\n- NettDividendRate/RateTypeAndAmountAndRateStatus must be present and\r\n- RateTypeAndAmountAndRateStatus/RateType/Code values must all be different in each occurrence of NettDividendRate.\r\n\r\n(MT 564 NVR C8 and C9).";
			owner_lazy = () -> CorporateActionRate12.mmObject();
		}
	};

	/**
	 * If NettDividendRate is repeated, then:<br>
	 * - NettDividendRate/RateTypeAndAmountAndRateStatus must be present and<br>
	 * - RateTypeAndAmountAndRateStatus/RateType/Code values must all be
	 * different in each occurrence of NettDividendRate.<br>
	 * <br>
	 * (MT 566 NVR C3 and C4).
	 */
	public static void checkCorporateActionRate4(CorporateActionRate4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If NettDividendRate is repeated, then:<br>
	 * - NettDividendRate/RateTypeAndAmountAndRateStatus must be present and<br>
	 * - RateTypeAndAmountAndRateStatus/RateType/Code values must all be
	 * different in each occurrence of NettDividendRate.<br>
	 * <br>
	 * (MT 566 NVR C3 and C4).
	 */
	public static void checkCorporateActionRate10(CorporateActionRate10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If NettDividendRate is repeated, then:<br>
	 * - NettDividendRate/RateTypeAndAmountAndRateStatus must be present and<br>
	 * - RateTypeAndAmountAndRateStatus/RateType/Code values must all be
	 * different in each occurrence of NettDividendRate.<br>
	 * <br>
	 * (MT 564 NVR C8 and C9).
	 */
	public static void checkCorporateActionRate5(CorporateActionRate5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If NettDividendRate is repeated, then:<br>
	 * - NettDividendRate/RateTypeAndAmountAndRateStatus must be present and<br>
	 * - RateTypeAndAmountAndRateStatus/RateType/Code values must all be
	 * different in each occurrence of NettDividendRate.<br>
	 * <br>
	 * (MT 564 NVR C8 and C9).
	 */
	public static void checkCorporateActionRate12(CorporateActionRate12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}