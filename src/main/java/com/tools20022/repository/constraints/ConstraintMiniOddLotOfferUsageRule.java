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
import com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV04;
import com.tools20022.repository.area.seev.CorporateActionNotificationV04;

/**
 * If any occurrence of CorporateActionMovementDetails/OfferType/Code is present
 * with the value MINI (MiniOddLotOffer), then
 * CorporateActionGeneralInformation/EventType/Code value must be ODLT
 * (OddLotSalePurchase).
 */
public class ConstraintMiniOddLotOfferUsageRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV04
	 * CorporateActionMovementPreliminaryAdviceV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MiniOddLotOfferUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If any occurrence of CorporateActionMovementDetails/OfferType/Code is present with the value MINI (MiniOddLotOffer), then CorporateActionGeneralInformation/EventType/Code value must be ODLT (OddLotSalePurchase)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementPreliminaryAdviceV04> forCorporateActionMovementPreliminaryAdviceV04 = new MMConstraint<CorporateActionMovementPreliminaryAdviceV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MiniOddLotOfferUsageRule";
			definition = "If any occurrence of CorporateActionMovementDetails/OfferType/Code is present with the value MINI (MiniOddLotOffer), then CorporateActionGeneralInformation/EventType/Code value must be ODLT (OddLotSalePurchase).";
			owner_lazy = () -> CorporateActionMovementPreliminaryAdviceV04.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementPreliminaryAdviceV04 obj) throws Exception {
			checkCorporateActionMovementPreliminaryAdviceV04(obj);
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
	 * name} = "MiniOddLotOfferUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionDetails/OfferType/Code is present with the value MINI (MiniOddLotOffer) or if in any occurrence of CorporateActionOptionDetails/OfferType/Code is present with the value MINI (MiniOddLotOffer), then CorporateActionGeneralInformation/EventType/Code value must be ODLT (OddLotSalePurchase)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV04> forCorporateActionNotificationV04 = new MMConstraint<CorporateActionNotificationV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MiniOddLotOfferUsageRule";
			definition = "If CorporateActionDetails/OfferType/Code is present with the value MINI (MiniOddLotOffer) or if in any occurrence of CorporateActionOptionDetails/OfferType/Code is present with the value MINI (MiniOddLotOffer), then CorporateActionGeneralInformation/EventType/Code value must be ODLT (OddLotSalePurchase).";
			owner_lazy = () -> CorporateActionNotificationV04.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionNotificationV04 obj) throws Exception {
			checkCorporateActionNotificationV04(obj);
		}
	};

	/**
	 * If any occurrence of CorporateActionMovementDetails/OfferType/Code is
	 * present with the value MINI (MiniOddLotOffer), then
	 * CorporateActionGeneralInformation/EventType/Code value must be ODLT
	 * (OddLotSalePurchase).
	 */
	public static void checkCorporateActionMovementPreliminaryAdviceV04(CorporateActionMovementPreliminaryAdviceV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionDetails/OfferType/Code is present with the value MINI
	 * (MiniOddLotOffer) or if in any occurrence of
	 * CorporateActionOptionDetails/OfferType/Code is present with the value
	 * MINI (MiniOddLotOffer), then
	 * CorporateActionGeneralInformation/EventType/Code value must be ODLT
	 * (OddLotSalePurchase).
	 */
	public static void checkCorporateActionNotificationV04(CorporateActionNotificationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}