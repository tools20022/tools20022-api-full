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
 * If CorporateActionOptionDetails/RateAndAmountDetails/GrossDividendRate/
 * NotSpecifiedRate/Code value or
 * CorporateActionOptionDetails/RateAndAmountDetails
 * /InterestRateUsedForPayment/NotSpecifiedRate/Code value is NILP (Nil
 * Payment), then CorporateActionGeneralInformation/EventType/Code must be
 * either DVCA (CashDividend) or INTR (InterestPayment).<br>
 * If CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/
 * GrossDividendRate/NotSpecifiedRate/Code value or
 * CorporateActionOptionDetails/
 * CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment
 * /NotSpecifiedRate/Code value is NILP (Nil Payment), then
 * CorporateActionGeneralInformation/EventType/Code must be either DVCA
 * (CashDividend) or INTR (InterestPayment).
 */
public class ConstraintRateAndCorporateActionEventRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV03
	 * CorporateActionNotificationV03}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateAndCorporateActionEventRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionOptionDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate/Code value or CorporateActionOptionDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate/Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).\r\nIf CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate/Code value or CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate/Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV03> for_seev_CorporateActionNotificationV03 = new MMConstraint<CorporateActionNotificationV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateAndCorporateActionEventRule";
			definition = "If CorporateActionOptionDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate/Code value or CorporateActionOptionDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate/Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).\r\nIf CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate/Code value or CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate/Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).";
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
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV09
	 * CorporateActionMovementPreliminaryAdviceV09}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateAndCorporateActionEventRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or CorporateActionMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).\r\nIf CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRateAndCorporateActionEventRule#for_seev_CorporateActionMovementPreliminaryAdviceV08
	 * ConstraintRateAndCorporateActionEventRule.
	 * for_seev_CorporateActionMovementPreliminaryAdviceV08}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementPreliminaryAdviceV09> for_seev_CorporateActionMovementPreliminaryAdviceV09 = new MMConstraint<CorporateActionMovementPreliminaryAdviceV09>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateAndCorporateActionEventRule";
			definition = "If CorporateActionMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or CorporateActionMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).\r\nIf CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRateAndCorporateActionEventRule.for_seev_CorporateActionMovementPreliminaryAdviceV08;
			owner_lazy = () -> CorporateActionMovementPreliminaryAdviceV09.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementPreliminaryAdviceV09 obj) throws Exception {
			check_seev_CorporateActionMovementPreliminaryAdviceV09(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V06
	 * CorporateActionNotification002V06}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateAndCorporateActionEventRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionOptionDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or CorporateActionOptionDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).\r\nIf CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotification002V06> for_seev_CorporateActionNotification002V06 = new MMConstraint<CorporateActionNotification002V06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateAndCorporateActionEventRule";
			definition = "If CorporateActionOptionDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or CorporateActionOptionDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).\r\nIf CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).";
			owner_lazy = () -> CorporateActionNotification002V06.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionNotification002V06 obj) throws Exception {
			check_seev_CorporateActionNotification002V06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV08
	 * CorporateActionNotificationV08}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateAndCorporateActionEventRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionOptionDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or CorporateActionOptionDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).\r\nIf CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRateAndCorporateActionEventRule#for_seev_CorporateActionNotificationV07
	 * ConstraintRateAndCorporateActionEventRule.
	 * for_seev_CorporateActionNotificationV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV08> for_seev_CorporateActionNotificationV08 = new MMConstraint<CorporateActionNotificationV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateAndCorporateActionEventRule";
			definition = "If CorporateActionOptionDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or CorporateActionOptionDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).\r\nIf CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRateAndCorporateActionEventRule.for_seev_CorporateActionNotificationV07;
			owner_lazy = () -> CorporateActionNotificationV08.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionNotificationV08 obj) throws Exception {
			check_seev_CorporateActionNotificationV08(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdvice002V09
	 * CorporateActionMovementPreliminaryAdvice002V09}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateAndCorporateActionEventRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or CorporateActionMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).\r\nIf CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementPreliminaryAdvice002V09> for_seev_CorporateActionMovementPreliminaryAdvice002V09 = new MMConstraint<CorporateActionMovementPreliminaryAdvice002V09>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateAndCorporateActionEventRule";
			definition = "If CorporateActionMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or CorporateActionMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).\r\nIf CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).";
			owner_lazy = () -> CorporateActionMovementPreliminaryAdvice002V09.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementPreliminaryAdvice002V09 obj) throws Exception {
			check_seev_CorporateActionMovementPreliminaryAdvice002V09(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV05
	 * CorporateActionMovementPreliminaryAdviceV05}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateAndCorporateActionEventRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or CorporateActionMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).\r\nIf CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRateAndCorporateActionEventRule#for_seev_CorporateActionMovementPreliminaryAdviceV06
	 * ConstraintRateAndCorporateActionEventRule.
	 * for_seev_CorporateActionMovementPreliminaryAdviceV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRateAndCorporateActionEventRule#for_seev_CorporateActionMovementPreliminaryAdviceV04
	 * ConstraintRateAndCorporateActionEventRule.
	 * for_seev_CorporateActionMovementPreliminaryAdviceV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementPreliminaryAdviceV05> for_seev_CorporateActionMovementPreliminaryAdviceV05 = new MMConstraint<CorporateActionMovementPreliminaryAdviceV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateAndCorporateActionEventRule";
			definition = "If CorporateActionMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or CorporateActionMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).\r\nIf CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRateAndCorporateActionEventRule.for_seev_CorporateActionMovementPreliminaryAdviceV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRateAndCorporateActionEventRule.for_seev_CorporateActionMovementPreliminaryAdviceV04;
			owner_lazy = () -> CorporateActionMovementPreliminaryAdviceV05.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementPreliminaryAdviceV05 obj) throws Exception {
			check_seev_CorporateActionMovementPreliminaryAdviceV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV06
	 * CorporateActionNotificationV06}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateAndCorporateActionEventRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionOptionDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or CorporateActionOptionDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).\r\nIf CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRateAndCorporateActionEventRule#for_seev_CorporateActionNotificationV07
	 * ConstraintRateAndCorporateActionEventRule.
	 * for_seev_CorporateActionNotificationV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRateAndCorporateActionEventRule#for_seev_CorporateActionNotificationV05
	 * ConstraintRateAndCorporateActionEventRule.
	 * for_seev_CorporateActionNotificationV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV06> for_seev_CorporateActionNotificationV06 = new MMConstraint<CorporateActionNotificationV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateAndCorporateActionEventRule";
			definition = "If CorporateActionOptionDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or CorporateActionOptionDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).\r\nIf CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRateAndCorporateActionEventRule.for_seev_CorporateActionNotificationV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRateAndCorporateActionEventRule.for_seev_CorporateActionNotificationV05;
			owner_lazy = () -> CorporateActionNotificationV06.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionNotificationV06 obj) throws Exception {
			check_seev_CorporateActionNotificationV06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV02
	 * CorporateActionMovementPreliminaryAdviceV02}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateAndCorporateActionEventRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate/Code value or CorporateActionMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate/Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).\r\nIf CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate/Code value or CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate/Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementPreliminaryAdviceV02> for_seev_CorporateActionMovementPreliminaryAdviceV02 = new MMConstraint<CorporateActionMovementPreliminaryAdviceV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateAndCorporateActionEventRule";
			definition = "If CorporateActionMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate/Code value or CorporateActionMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate/Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).\r\nIf CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate/Code value or CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate/Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).";
			owner_lazy = () -> CorporateActionMovementPreliminaryAdviceV02.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementPreliminaryAdviceV02 obj) throws Exception {
			check_seev_CorporateActionMovementPreliminaryAdviceV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV06
	 * CorporateActionMovementPreliminaryAdviceV06}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateAndCorporateActionEventRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or CorporateActionMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).\r\nIf CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRateAndCorporateActionEventRule#for_seev_CorporateActionMovementPreliminaryAdviceV07
	 * ConstraintRateAndCorporateActionEventRule.
	 * for_seev_CorporateActionMovementPreliminaryAdviceV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRateAndCorporateActionEventRule#for_seev_CorporateActionMovementPreliminaryAdviceV05
	 * ConstraintRateAndCorporateActionEventRule.
	 * for_seev_CorporateActionMovementPreliminaryAdviceV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementPreliminaryAdviceV06> for_seev_CorporateActionMovementPreliminaryAdviceV06 = new MMConstraint<CorporateActionMovementPreliminaryAdviceV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateAndCorporateActionEventRule";
			definition = "If CorporateActionMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or CorporateActionMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).\r\nIf CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRateAndCorporateActionEventRule.for_seev_CorporateActionMovementPreliminaryAdviceV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRateAndCorporateActionEventRule.for_seev_CorporateActionMovementPreliminaryAdviceV05;
			owner_lazy = () -> CorporateActionMovementPreliminaryAdviceV06.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementPreliminaryAdviceV06 obj) throws Exception {
			check_seev_CorporateActionMovementPreliminaryAdviceV06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV07
	 * CorporateActionNotificationV07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateAndCorporateActionEventRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionOptionDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or CorporateActionOptionDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).\r\nIf CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRateAndCorporateActionEventRule#for_seev_CorporateActionNotificationV08
	 * ConstraintRateAndCorporateActionEventRule.
	 * for_seev_CorporateActionNotificationV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRateAndCorporateActionEventRule#for_seev_CorporateActionNotificationV06
	 * ConstraintRateAndCorporateActionEventRule.
	 * for_seev_CorporateActionNotificationV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV07> for_seev_CorporateActionNotificationV07 = new MMConstraint<CorporateActionNotificationV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateAndCorporateActionEventRule";
			definition = "If CorporateActionOptionDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or CorporateActionOptionDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).\r\nIf CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRateAndCorporateActionEventRule.for_seev_CorporateActionNotificationV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRateAndCorporateActionEventRule.for_seev_CorporateActionNotificationV06;
			owner_lazy = () -> CorporateActionNotificationV07.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionNotificationV07 obj) throws Exception {
			check_seev_CorporateActionNotificationV07(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07
	 * CorporateActionMovementPreliminaryAdviceV07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateAndCorporateActionEventRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or CorporateActionMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).\r\nIf CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRateAndCorporateActionEventRule#for_seev_CorporateActionMovementPreliminaryAdviceV08
	 * ConstraintRateAndCorporateActionEventRule.
	 * for_seev_CorporateActionMovementPreliminaryAdviceV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRateAndCorporateActionEventRule#for_seev_CorporateActionMovementPreliminaryAdviceV06
	 * ConstraintRateAndCorporateActionEventRule.
	 * for_seev_CorporateActionMovementPreliminaryAdviceV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementPreliminaryAdviceV07> for_seev_CorporateActionMovementPreliminaryAdviceV07 = new MMConstraint<CorporateActionMovementPreliminaryAdviceV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateAndCorporateActionEventRule";
			definition = "If CorporateActionMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or CorporateActionMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).\r\nIf CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRateAndCorporateActionEventRule.for_seev_CorporateActionMovementPreliminaryAdviceV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRateAndCorporateActionEventRule.for_seev_CorporateActionMovementPreliminaryAdviceV06;
			owner_lazy = () -> CorporateActionMovementPreliminaryAdviceV07.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementPreliminaryAdviceV07 obj) throws Exception {
			check_seev_CorporateActionMovementPreliminaryAdviceV07(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateAndCorporateActionEventRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionOptionDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or CorporateActionOptionDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).\r\nIf CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRateAndCorporateActionEventRule#for_seev_CorporateActionNotificationV06
	 * ConstraintRateAndCorporateActionEventRule.
	 * for_seev_CorporateActionNotificationV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRateAndCorporateActionEventRule#for_seev_CorporateActionNotificationV04
	 * ConstraintRateAndCorporateActionEventRule.
	 * for_seev_CorporateActionNotificationV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV05> for_seev_CorporateActionNotificationV05 = new MMConstraint<CorporateActionNotificationV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateAndCorporateActionEventRule";
			definition = "If CorporateActionOptionDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or CorporateActionOptionDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).\r\nIf CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRateAndCorporateActionEventRule.for_seev_CorporateActionNotificationV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRateAndCorporateActionEventRule.for_seev_CorporateActionNotificationV04;
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
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08
	 * CorporateActionMovementPreliminaryAdviceV08}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateAndCorporateActionEventRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or CorporateActionMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).\r\nIf CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRateAndCorporateActionEventRule#for_seev_CorporateActionMovementPreliminaryAdviceV09
	 * ConstraintRateAndCorporateActionEventRule.
	 * for_seev_CorporateActionMovementPreliminaryAdviceV09}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRateAndCorporateActionEventRule#for_seev_CorporateActionMovementPreliminaryAdviceV07
	 * ConstraintRateAndCorporateActionEventRule.
	 * for_seev_CorporateActionMovementPreliminaryAdviceV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementPreliminaryAdviceV08> for_seev_CorporateActionMovementPreliminaryAdviceV08 = new MMConstraint<CorporateActionMovementPreliminaryAdviceV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateAndCorporateActionEventRule";
			definition = "If CorporateActionMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or CorporateActionMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).\r\nIf CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRateAndCorporateActionEventRule.for_seev_CorporateActionMovementPreliminaryAdviceV09);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRateAndCorporateActionEventRule.for_seev_CorporateActionMovementPreliminaryAdviceV07;
			owner_lazy = () -> CorporateActionMovementPreliminaryAdviceV08.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementPreliminaryAdviceV08 obj) throws Exception {
			check_seev_CorporateActionMovementPreliminaryAdviceV08(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V08
	 * CorporateActionNotification002V08}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateAndCorporateActionEventRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionOptionDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or CorporateActionOptionDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).\r\nIf CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotification002V08> for_seev_CorporateActionNotification002V08 = new MMConstraint<CorporateActionNotification002V08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateAndCorporateActionEventRule";
			definition = "If CorporateActionOptionDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or CorporateActionOptionDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).\r\nIf CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).";
			owner_lazy = () -> CorporateActionNotification002V08.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionNotification002V08 obj) throws Exception {
			check_seev_CorporateActionNotification002V08(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateAndCorporateActionEventRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionOptionDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate/Code value or CorporateActionOptionDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate/Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).\r\nIf CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate/Code value or CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate/Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRateAndCorporateActionEventRule#for_seev_CorporateActionNotificationV05
	 * ConstraintRateAndCorporateActionEventRule.
	 * for_seev_CorporateActionNotificationV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV04> for_seev_CorporateActionNotificationV04 = new MMConstraint<CorporateActionNotificationV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateAndCorporateActionEventRule";
			definition = "If CorporateActionOptionDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate/Code value or CorporateActionOptionDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate/Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).\r\nIf CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate/Code value or CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate/Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRateAndCorporateActionEventRule.for_seev_CorporateActionNotificationV05);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateAndCorporateActionEventRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionOptionDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate/Code value or CorporateActionOptionDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate/Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).\r\nIf CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate/Code value or CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate/Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV02> for_seev_CorporateActionNotificationV02 = new MMConstraint<CorporateActionNotificationV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateAndCorporateActionEventRule";
			definition = "If CorporateActionOptionDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate/Code value or CorporateActionOptionDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate/Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).\r\nIf CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate/Code value or CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate/Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).";
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
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV03
	 * CorporateActionMovementPreliminaryAdviceV03}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateAndCorporateActionEventRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate/Code value or CorporateActionMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate/Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).\r\nIf CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate/Code value or CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate/Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementPreliminaryAdviceV03> for_seev_CorporateActionMovementPreliminaryAdviceV03 = new MMConstraint<CorporateActionMovementPreliminaryAdviceV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateAndCorporateActionEventRule";
			definition = "If CorporateActionMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate/Code value or CorporateActionMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate/Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).\r\nIf CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate/Code value or CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate/Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).";
			owner_lazy = () -> CorporateActionMovementPreliminaryAdviceV03.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementPreliminaryAdviceV03 obj) throws Exception {
			check_seev_CorporateActionMovementPreliminaryAdviceV03(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateAndCorporateActionEventRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionOptionDetails/RateAndAmountDetails/GrossDividendRate/RateTypeAndAmountAndRateStatus/RateType/Code value or CorporateActionOptionDetails/RateAndAmountDetails/InterestRateUsedForPayment/RateTypeAndAmountAndRateStatus/RateType/Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV01> for_seev_CorporateActionNotificationV01 = new MMConstraint<CorporateActionNotificationV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateAndCorporateActionEventRule";
			definition = "If CorporateActionOptionDetails/RateAndAmountDetails/GrossDividendRate/RateTypeAndAmountAndRateStatus/RateType/Code value or CorporateActionOptionDetails/RateAndAmountDetails/InterestRateUsedForPayment/RateTypeAndAmountAndRateStatus/RateType/Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).";
			owner_lazy = () -> CorporateActionNotificationV01.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionNotificationV01 obj) throws Exception {
			check_seev_CorporateActionNotificationV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdvice002V07
	 * CorporateActionMovementPreliminaryAdvice002V07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateAndCorporateActionEventRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or CorporateActionMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).\r\nIf CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementPreliminaryAdvice002V07> for_seev_CorporateActionMovementPreliminaryAdvice002V07 = new MMConstraint<CorporateActionMovementPreliminaryAdvice002V07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateAndCorporateActionEventRule";
			definition = "If CorporateActionMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or CorporateActionMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).\r\nIf CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).";
			owner_lazy = () -> CorporateActionMovementPreliminaryAdvice002V07.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementPreliminaryAdvice002V07 obj) throws Exception {
			check_seev_CorporateActionMovementPreliminaryAdvice002V07(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV04
	 * CorporateActionMovementPreliminaryAdviceV04}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateAndCorporateActionEventRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate/Code value or CorporateActionMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate/Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).\r\nIf CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate/Code value or CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate/Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRateAndCorporateActionEventRule#for_seev_CorporateActionMovementPreliminaryAdviceV05
	 * ConstraintRateAndCorporateActionEventRule.
	 * for_seev_CorporateActionMovementPreliminaryAdviceV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementPreliminaryAdviceV04> for_seev_CorporateActionMovementPreliminaryAdviceV04 = new MMConstraint<CorporateActionMovementPreliminaryAdviceV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateAndCorporateActionEventRule";
			definition = "If CorporateActionMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate/Code value or CorporateActionMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate/Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).\r\nIf CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate/Code value or CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate/Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRateAndCorporateActionEventRule.for_seev_CorporateActionMovementPreliminaryAdviceV05);
			owner_lazy = () -> CorporateActionMovementPreliminaryAdviceV04.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementPreliminaryAdviceV04 obj) throws Exception {
			check_seev_CorporateActionMovementPreliminaryAdviceV04(obj);
		}
	};

	/**
	 * If CorporateActionOptionDetails/RateAndAmountDetails/GrossDividendRate/
	 * NotSpecifiedRate/Code value or
	 * CorporateActionOptionDetails/RateAndAmountDetails
	 * /InterestRateUsedForPayment/NotSpecifiedRate/Code value is NILP (Nil
	 * Payment), then CorporateActionGeneralInformation/EventType/Code must be
	 * either DVCA (CashDividend) or INTR (InterestPayment).<br>
	 * If CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/
	 * GrossDividendRate/NotSpecifiedRate/Code value or
	 * CorporateActionOptionDetails
	 * /CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment
	 * /NotSpecifiedRate/Code value is NILP (Nil Payment), then
	 * CorporateActionGeneralInformation/EventType/Code must be either DVCA
	 * (CashDividend) or INTR (InterestPayment).
	 */
	public static void check_seev_CorporateActionNotificationV03(CorporateActionNotificationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionMovementDetails/RateAndAmountDetails/GrossDividendRate/
	 * NotSpecifiedRate Code value or
	 * CorporateActionMovementDetails/RateAndAmountDetails
	 * /InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil
	 * Payment), then CorporateActionGeneralInformation/EventType/Code must be
	 * either DVCA (CashDividend) or INTR (InterestPayment).<br>
	 * If
	 * CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails
	 * /GrossDividendRate/NotSpecifiedRate Code value or
	 * CorporateActionMovementDetails
	 * /CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment
	 * /NotSpecifiedRate Code value is NILP (Nil Payment), then
	 * CorporateActionGeneralInformation/EventType/Code must be either DVCA
	 * (CashDividend) or INTR (InterestPayment).
	 */
	public static void check_seev_CorporateActionMovementPreliminaryAdviceV09(CorporateActionMovementPreliminaryAdviceV09 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionOptionDetails/RateAndAmountDetails/GrossDividendRate/
	 * NotSpecifiedRate Code value or
	 * CorporateActionOptionDetails/RateAndAmountDetails
	 * /InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil
	 * Payment), then CorporateActionGeneralInformation/EventType/Code must be
	 * either DVCA (CashDividend) or INTR (InterestPayment).<br>
	 * If CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/
	 * GrossDividendRate/NotSpecifiedRate Code value or
	 * CorporateActionOptionDetails
	 * /CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment
	 * /NotSpecifiedRate Code value is NILP (Nil Payment), then
	 * CorporateActionGeneralInformation/EventType/Code must be either DVCA
	 * (CashDividend) or INTR (InterestPayment).
	 */
	public static void check_seev_CorporateActionNotification002V06(CorporateActionNotification002V06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionOptionDetails/RateAndAmountDetails/GrossDividendRate/
	 * NotSpecifiedRate Code value or
	 * CorporateActionOptionDetails/RateAndAmountDetails
	 * /InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil
	 * Payment), then CorporateActionGeneralInformation/EventType/Code must be
	 * either DVCA (CashDividend) or INTR (InterestPayment).<br>
	 * If CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/
	 * GrossDividendRate/NotSpecifiedRate Code value or
	 * CorporateActionOptionDetails
	 * /CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment
	 * /NotSpecifiedRate Code value is NILP (Nil Payment), then
	 * CorporateActionGeneralInformation/EventType/Code must be either DVCA
	 * (CashDividend) or INTR (InterestPayment).
	 */
	public static void check_seev_CorporateActionNotificationV08(CorporateActionNotificationV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionMovementDetails/RateAndAmountDetails/GrossDividendRate/
	 * NotSpecifiedRate Code value or
	 * CorporateActionMovementDetails/RateAndAmountDetails
	 * /InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil
	 * Payment), then CorporateActionGeneralInformation/EventType/Code must be
	 * either DVCA (CashDividend) or INTR (InterestPayment).<br>
	 * If
	 * CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails
	 * /GrossDividendRate/NotSpecifiedRate Code value or
	 * CorporateActionMovementDetails
	 * /CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment
	 * /NotSpecifiedRate Code value is NILP (Nil Payment), then
	 * CorporateActionGeneralInformation/EventType/Code must be either DVCA
	 * (CashDividend) or INTR (InterestPayment).
	 */
	public static void check_seev_CorporateActionMovementPreliminaryAdvice002V09(CorporateActionMovementPreliminaryAdvice002V09 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionMovementDetails/RateAndAmountDetails/GrossDividendRate/
	 * NotSpecifiedRate Code value or
	 * CorporateActionMovementDetails/RateAndAmountDetails
	 * /InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil
	 * Payment), then CorporateActionGeneralInformation/EventType/Code must be
	 * either DVCA (CashDividend) or INTR (InterestPayment).<br>
	 * If
	 * CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails
	 * /GrossDividendRate/NotSpecifiedRate Code value or
	 * CorporateActionMovementDetails
	 * /CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment
	 * /NotSpecifiedRate Code value is NILP (Nil Payment), then
	 * CorporateActionGeneralInformation/EventType/Code must be either DVCA
	 * (CashDividend) or INTR (InterestPayment).
	 */
	public static void check_seev_CorporateActionMovementPreliminaryAdviceV05(CorporateActionMovementPreliminaryAdviceV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionOptionDetails/RateAndAmountDetails/GrossDividendRate/
	 * NotSpecifiedRate Code value or
	 * CorporateActionOptionDetails/RateAndAmountDetails
	 * /InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil
	 * Payment), then CorporateActionGeneralInformation/EventType/Code must be
	 * either DVCA (CashDividend) or INTR (InterestPayment).<br>
	 * If CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/
	 * GrossDividendRate/NotSpecifiedRate Code value or
	 * CorporateActionOptionDetails
	 * /CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment
	 * /NotSpecifiedRate Code value is NILP (Nil Payment), then
	 * CorporateActionGeneralInformation/EventType/Code must be either DVCA
	 * (CashDividend) or INTR (InterestPayment).
	 */
	public static void check_seev_CorporateActionNotificationV06(CorporateActionNotificationV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionMovementDetails/RateAndAmountDetails/GrossDividendRate/
	 * NotSpecifiedRate/Code value or
	 * CorporateActionMovementDetails/RateAndAmountDetails
	 * /InterestRateUsedForPayment/NotSpecifiedRate/Code value is NILP (Nil
	 * Payment), then CorporateActionGeneralInformation/EventType/Code must be
	 * either DVCA (CashDividend) or INTR (InterestPayment).<br>
	 * If
	 * CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails
	 * /GrossDividendRate/NotSpecifiedRate/Code value or
	 * CorporateActionMovementDetails
	 * /CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment
	 * /NotSpecifiedRate/Code value is NILP (Nil Payment), then
	 * CorporateActionGeneralInformation/EventType/Code must be either DVCA
	 * (CashDividend) or INTR (InterestPayment).
	 */
	public static void check_seev_CorporateActionMovementPreliminaryAdviceV02(CorporateActionMovementPreliminaryAdviceV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionMovementDetails/RateAndAmountDetails/GrossDividendRate/
	 * NotSpecifiedRate Code value or
	 * CorporateActionMovementDetails/RateAndAmountDetails
	 * /InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil
	 * Payment), then CorporateActionGeneralInformation/EventType/Code must be
	 * either DVCA (CashDividend) or INTR (InterestPayment).<br>
	 * If
	 * CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails
	 * /GrossDividendRate/NotSpecifiedRate Code value or
	 * CorporateActionMovementDetails
	 * /CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment
	 * /NotSpecifiedRate Code value is NILP (Nil Payment), then
	 * CorporateActionGeneralInformation/EventType/Code must be either DVCA
	 * (CashDividend) or INTR (InterestPayment).
	 */
	public static void check_seev_CorporateActionMovementPreliminaryAdviceV06(CorporateActionMovementPreliminaryAdviceV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionOptionDetails/RateAndAmountDetails/GrossDividendRate/
	 * NotSpecifiedRate Code value or
	 * CorporateActionOptionDetails/RateAndAmountDetails
	 * /InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil
	 * Payment), then CorporateActionGeneralInformation/EventType/Code must be
	 * either DVCA (CashDividend) or INTR (InterestPayment).<br>
	 * If CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/
	 * GrossDividendRate/NotSpecifiedRate Code value or
	 * CorporateActionOptionDetails
	 * /CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment
	 * /NotSpecifiedRate Code value is NILP (Nil Payment), then
	 * CorporateActionGeneralInformation/EventType/Code must be either DVCA
	 * (CashDividend) or INTR (InterestPayment).
	 */
	public static void check_seev_CorporateActionNotificationV07(CorporateActionNotificationV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionMovementDetails/RateAndAmountDetails/GrossDividendRate/
	 * NotSpecifiedRate Code value or
	 * CorporateActionMovementDetails/RateAndAmountDetails
	 * /InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil
	 * Payment), then CorporateActionGeneralInformation/EventType/Code must be
	 * either DVCA (CashDividend) or INTR (InterestPayment).<br>
	 * If
	 * CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails
	 * /GrossDividendRate/NotSpecifiedRate Code value or
	 * CorporateActionMovementDetails
	 * /CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment
	 * /NotSpecifiedRate Code value is NILP (Nil Payment), then
	 * CorporateActionGeneralInformation/EventType/Code must be either DVCA
	 * (CashDividend) or INTR (InterestPayment).
	 */
	public static void check_seev_CorporateActionMovementPreliminaryAdviceV07(CorporateActionMovementPreliminaryAdviceV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionOptionDetails/RateAndAmountDetails/GrossDividendRate/
	 * NotSpecifiedRate Code value or
	 * CorporateActionOptionDetails/RateAndAmountDetails
	 * /InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil
	 * Payment), then CorporateActionGeneralInformation/EventType/Code must be
	 * either DVCA (CashDividend) or INTR (InterestPayment).<br>
	 * If CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/
	 * GrossDividendRate/NotSpecifiedRate Code value or
	 * CorporateActionOptionDetails
	 * /CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment
	 * /NotSpecifiedRate Code value is NILP (Nil Payment), then
	 * CorporateActionGeneralInformation/EventType/Code must be either DVCA
	 * (CashDividend) or INTR (InterestPayment).
	 */
	public static void check_seev_CorporateActionNotificationV05(CorporateActionNotificationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionMovementDetails/RateAndAmountDetails/GrossDividendRate/
	 * NotSpecifiedRate Code value or
	 * CorporateActionMovementDetails/RateAndAmountDetails
	 * /InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil
	 * Payment), then CorporateActionGeneralInformation/EventType/Code must be
	 * either DVCA (CashDividend) or INTR (InterestPayment).<br>
	 * If
	 * CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails
	 * /GrossDividendRate/NotSpecifiedRate Code value or
	 * CorporateActionMovementDetails
	 * /CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment
	 * /NotSpecifiedRate Code value is NILP (Nil Payment), then
	 * CorporateActionGeneralInformation/EventType/Code must be either DVCA
	 * (CashDividend) or INTR (InterestPayment).
	 */
	public static void check_seev_CorporateActionMovementPreliminaryAdviceV08(CorporateActionMovementPreliminaryAdviceV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionOptionDetails/RateAndAmountDetails/GrossDividendRate/
	 * NotSpecifiedRate Code value or
	 * CorporateActionOptionDetails/RateAndAmountDetails
	 * /InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil
	 * Payment), then CorporateActionGeneralInformation/EventType/Code must be
	 * either DVCA (CashDividend) or INTR (InterestPayment).<br>
	 * If CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/
	 * GrossDividendRate/NotSpecifiedRate Code value or
	 * CorporateActionOptionDetails
	 * /CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment
	 * /NotSpecifiedRate Code value is NILP (Nil Payment), then
	 * CorporateActionGeneralInformation/EventType/Code must be either DVCA
	 * (CashDividend) or INTR (InterestPayment).
	 */
	public static void check_seev_CorporateActionNotification002V08(CorporateActionNotification002V08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionOptionDetails/RateAndAmountDetails/GrossDividendRate/
	 * NotSpecifiedRate/Code value or
	 * CorporateActionOptionDetails/RateAndAmountDetails
	 * /InterestRateUsedForPayment/NotSpecifiedRate/Code value is NILP (Nil
	 * Payment), then CorporateActionGeneralInformation/EventType/Code must be
	 * either DVCA (CashDividend) or INTR (InterestPayment).<br>
	 * If CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/
	 * GrossDividendRate/NotSpecifiedRate/Code value or
	 * CorporateActionOptionDetails
	 * /CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment
	 * /NotSpecifiedRate/Code value is NILP (Nil Payment), then
	 * CorporateActionGeneralInformation/EventType/Code must be either DVCA
	 * (CashDividend) or INTR (InterestPayment).
	 */
	public static void check_seev_CorporateActionNotificationV04(CorporateActionNotificationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionOptionDetails/RateAndAmountDetails/GrossDividendRate/
	 * NotSpecifiedRate/Code value or
	 * CorporateActionOptionDetails/RateAndAmountDetails
	 * /InterestRateUsedForPayment/NotSpecifiedRate/Code value is NILP (Nil
	 * Payment), then CorporateActionGeneralInformation/EventType/Code must be
	 * either DVCA (CashDividend) or INTR (InterestPayment).<br>
	 * If CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/
	 * GrossDividendRate/NotSpecifiedRate/Code value or
	 * CorporateActionOptionDetails
	 * /CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment
	 * /NotSpecifiedRate/Code value is NILP (Nil Payment), then
	 * CorporateActionGeneralInformation/EventType/Code must be either DVCA
	 * (CashDividend) or INTR (InterestPayment).
	 */
	public static void check_seev_CorporateActionNotificationV02(CorporateActionNotificationV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionMovementDetails/RateAndAmountDetails/GrossDividendRate/
	 * NotSpecifiedRate/Code value or
	 * CorporateActionMovementDetails/RateAndAmountDetails
	 * /InterestRateUsedForPayment/NotSpecifiedRate/Code value is NILP (Nil
	 * Payment), then CorporateActionGeneralInformation/EventType/Code must be
	 * either DVCA (CashDividend) or INTR (InterestPayment).<br>
	 * If
	 * CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails
	 * /GrossDividendRate/NotSpecifiedRate/Code value or
	 * CorporateActionMovementDetails
	 * /CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment
	 * /NotSpecifiedRate/Code value is NILP (Nil Payment), then
	 * CorporateActionGeneralInformation/EventType/Code must be either DVCA
	 * (CashDividend) or INTR (InterestPayment).
	 */
	public static void check_seev_CorporateActionMovementPreliminaryAdviceV03(CorporateActionMovementPreliminaryAdviceV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionOptionDetails/RateAndAmountDetails/GrossDividendRate/
	 * RateTypeAndAmountAndRateStatus/RateType/Code value or
	 * CorporateActionOptionDetails
	 * /RateAndAmountDetails/InterestRateUsedForPayment
	 * /RateTypeAndAmountAndRateStatus/RateType/Code value is NILP (Nil
	 * Payment), then CorporateActionGeneralInformation/EventType/Code must be
	 * either DVCA (CashDividend) or INTR (InterestPayment).
	 */
	public static void check_seev_CorporateActionNotificationV01(CorporateActionNotificationV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionMovementDetails/RateAndAmountDetails/GrossDividendRate/
	 * NotSpecifiedRate Code value or
	 * CorporateActionMovementDetails/RateAndAmountDetails
	 * /InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil
	 * Payment), then CorporateActionGeneralInformation/EventType/Code must be
	 * either DVCA (CashDividend) or INTR (InterestPayment).<br>
	 * If
	 * CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails
	 * /GrossDividendRate/NotSpecifiedRate Code value or
	 * CorporateActionMovementDetails
	 * /CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment
	 * /NotSpecifiedRate Code value is NILP (Nil Payment), then
	 * CorporateActionGeneralInformation/EventType/Code must be either DVCA
	 * (CashDividend) or INTR (InterestPayment).
	 */
	public static void check_seev_CorporateActionMovementPreliminaryAdvice002V07(CorporateActionMovementPreliminaryAdvice002V07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionMovementDetails/RateAndAmountDetails/GrossDividendRate/
	 * NotSpecifiedRate/Code value or
	 * CorporateActionMovementDetails/RateAndAmountDetails
	 * /InterestRateUsedForPayment/NotSpecifiedRate/Code value is NILP (Nil
	 * Payment), then CorporateActionGeneralInformation/EventType/Code must be
	 * either DVCA (CashDividend) or INTR (InterestPayment).<br>
	 * If
	 * CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails
	 * /GrossDividendRate/NotSpecifiedRate/Code value or
	 * CorporateActionMovementDetails
	 * /CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment
	 * /NotSpecifiedRate/Code value is NILP (Nil Payment), then
	 * CorporateActionGeneralInformation/EventType/Code must be either DVCA
	 * (CashDividend) or INTR (InterestPayment).
	 */
	public static void check_seev_CorporateActionMovementPreliminaryAdviceV04(CorporateActionMovementPreliminaryAdviceV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}