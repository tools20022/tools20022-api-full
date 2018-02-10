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
 * NotSpecifiedRate Code value or
 * CorporateActionOptionDetails/RateAndAmountDetails
 * /InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil
 * Payment), then CorporateActionGeneralInformation/EventType/Code must be
 * either DVCA (CashDividend) or INTR (InterestPayment).<br>
 * If CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/
 * GrossDividendRate/NotSpecifiedRate Code value or
 * CorporateActionOptionDetails/
 * CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment
 * /NotSpecifiedRate Code value is NILP (Nil Payment), then
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
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV07
	 * CorporateActionNotificationV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateAndCorporateActionEventRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionOptionDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or  CorporateActionOptionDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).\r\nIf CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or  CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRateAndCorporateActionEventRule#forCorporateActionNotificationV06
	 * ConstraintRateAndCorporateActionEventRule.
	 * forCorporateActionNotificationV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV07> forCorporateActionNotificationV07 = new MMConstraint<CorporateActionNotificationV07>() {
		{
			validator = ConstraintRateAndCorporateActionEventRule::checkCorporateActionNotificationV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateAndCorporateActionEventRule";
			definition = "If CorporateActionOptionDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or  CorporateActionOptionDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).\r\nIf CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or  CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRateAndCorporateActionEventRule.forCorporateActionNotificationV06;
			owner_lazy = () -> CorporateActionNotificationV07.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateAndCorporateActionEventRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or  CorporateActionMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).\r\nIf CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or  CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRateAndCorporateActionEventRule#forCorporateActionMovementPreliminaryAdviceV07
	 * ConstraintRateAndCorporateActionEventRule.
	 * forCorporateActionMovementPreliminaryAdviceV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementPreliminaryAdviceV08> forCorporateActionMovementPreliminaryAdviceV08 = new MMConstraint<CorporateActionMovementPreliminaryAdviceV08>() {
		{
			validator = ConstraintRateAndCorporateActionEventRule::checkCorporateActionMovementPreliminaryAdviceV08;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateAndCorporateActionEventRule";
			definition = "If CorporateActionMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or  CorporateActionMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).\r\nIf CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or  CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRateAndCorporateActionEventRule.forCorporateActionMovementPreliminaryAdviceV07;
			owner_lazy = () -> CorporateActionMovementPreliminaryAdviceV08.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdvice002V08
	 * CorporateActionMovementPreliminaryAdvice002V08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateAndCorporateActionEventRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or  CorporateActionMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).\r\nIf CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or  CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementPreliminaryAdvice002V08> forCorporateActionMovementPreliminaryAdvice002V08 = new MMConstraint<CorporateActionMovementPreliminaryAdvice002V08>() {
		{
			validator = ConstraintRateAndCorporateActionEventRule::checkCorporateActionMovementPreliminaryAdvice002V08;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateAndCorporateActionEventRule";
			definition = "If CorporateActionMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or  CorporateActionMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).\r\nIf CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or  CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).";
			owner_lazy = () -> CorporateActionMovementPreliminaryAdvice002V08.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V07
	 * CorporateActionNotification002V07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateAndCorporateActionEventRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionOptionDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or  CorporateActionOptionDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).\r\nIf CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or  CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotification002V07> forCorporateActionNotification002V07 = new MMConstraint<CorporateActionNotification002V07>() {
		{
			validator = ConstraintRateAndCorporateActionEventRule::checkCorporateActionNotification002V07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateAndCorporateActionEventRule";
			definition = "If CorporateActionOptionDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or  CorporateActionOptionDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).\r\nIf CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or  CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).";
			owner_lazy = () -> CorporateActionNotification002V07.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateAndCorporateActionEventRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or  CorporateActionMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).\r\nIf CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or  CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRateAndCorporateActionEventRule#forCorporateActionMovementPreliminaryAdviceV08
	 * ConstraintRateAndCorporateActionEventRule.
	 * forCorporateActionMovementPreliminaryAdviceV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRateAndCorporateActionEventRule#forCorporateActionMovementPreliminaryAdviceV06
	 * ConstraintRateAndCorporateActionEventRule.
	 * forCorporateActionMovementPreliminaryAdviceV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementPreliminaryAdviceV07> forCorporateActionMovementPreliminaryAdviceV07 = new MMConstraint<CorporateActionMovementPreliminaryAdviceV07>() {
		{
			validator = ConstraintRateAndCorporateActionEventRule::checkCorporateActionMovementPreliminaryAdviceV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateAndCorporateActionEventRule";
			definition = "If CorporateActionMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or  CorporateActionMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).\r\nIf CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or  CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRateAndCorporateActionEventRule.forCorporateActionMovementPreliminaryAdviceV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRateAndCorporateActionEventRule.forCorporateActionMovementPreliminaryAdviceV06;
			owner_lazy = () -> CorporateActionMovementPreliminaryAdviceV07.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateAndCorporateActionEventRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionOptionDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or  CorporateActionOptionDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).\r\nIf CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or  CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRateAndCorporateActionEventRule#forCorporateActionNotificationV07
	 * ConstraintRateAndCorporateActionEventRule.
	 * forCorporateActionNotificationV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRateAndCorporateActionEventRule#forCorporateActionNotificationV05
	 * ConstraintRateAndCorporateActionEventRule.
	 * forCorporateActionNotificationV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV06> forCorporateActionNotificationV06 = new MMConstraint<CorporateActionNotificationV06>() {
		{
			validator = ConstraintRateAndCorporateActionEventRule::checkCorporateActionNotificationV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateAndCorporateActionEventRule";
			definition = "If CorporateActionOptionDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or  CorporateActionOptionDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).\r\nIf CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or  CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRateAndCorporateActionEventRule.forCorporateActionNotificationV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRateAndCorporateActionEventRule.forCorporateActionNotificationV05;
			owner_lazy = () -> CorporateActionNotificationV06.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateAndCorporateActionEventRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate/Code value or  CorporateActionMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate/Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).\r\nIf CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate/Code value or  CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate/Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementPreliminaryAdviceV02> forCorporateActionMovementPreliminaryAdviceV02 = new MMConstraint<CorporateActionMovementPreliminaryAdviceV02>() {
		{
			validator = ConstraintRateAndCorporateActionEventRule::checkCorporateActionMovementPreliminaryAdviceV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateAndCorporateActionEventRule";
			definition = "If CorporateActionMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate/Code value or  CorporateActionMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate/Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).\r\nIf CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate/Code value or  CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate/Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).";
			owner_lazy = () -> CorporateActionMovementPreliminaryAdviceV02.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateAndCorporateActionEventRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate/Code value or  CorporateActionMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate/Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).\r\nIf CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate/Code value or  CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate/Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementPreliminaryAdviceV03> forCorporateActionMovementPreliminaryAdviceV03 = new MMConstraint<CorporateActionMovementPreliminaryAdviceV03>() {
		{
			validator = ConstraintRateAndCorporateActionEventRule::checkCorporateActionMovementPreliminaryAdviceV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateAndCorporateActionEventRule";
			definition = "If CorporateActionMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate/Code value or  CorporateActionMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate/Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).\r\nIf CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate/Code value or  CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate/Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).";
			owner_lazy = () -> CorporateActionMovementPreliminaryAdviceV03.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateAndCorporateActionEventRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate/Code value or  CorporateActionMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate/Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).\r\nIf CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate/Code value or  CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate/Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRateAndCorporateActionEventRule#forCorporateActionMovementPreliminaryAdviceV05
	 * ConstraintRateAndCorporateActionEventRule.
	 * forCorporateActionMovementPreliminaryAdviceV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementPreliminaryAdviceV04> forCorporateActionMovementPreliminaryAdviceV04 = new MMConstraint<CorporateActionMovementPreliminaryAdviceV04>() {
		{
			validator = ConstraintRateAndCorporateActionEventRule::checkCorporateActionMovementPreliminaryAdviceV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateAndCorporateActionEventRule";
			definition = "If CorporateActionMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate/Code value or  CorporateActionMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate/Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).\r\nIf CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate/Code value or  CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate/Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRateAndCorporateActionEventRule.forCorporateActionMovementPreliminaryAdviceV05);
			owner_lazy = () -> CorporateActionMovementPreliminaryAdviceV04.mmObject();
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
	 * name} = "RateAndCorporateActionEventRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionOptionDetails/RateAndAmountDetails/GrossDividendRate/RateTypeAndAmountAndRateStatus/RateType/Code value or  CorporateActionOptionDetails/RateAndAmountDetails/InterestRateUsedForPayment/RateTypeAndAmountAndRateStatus/RateType/Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV01> forCorporateActionNotificationV01 = new MMConstraint<CorporateActionNotificationV01>() {
		{
			validator = ConstraintRateAndCorporateActionEventRule::checkCorporateActionNotificationV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateAndCorporateActionEventRule";
			definition = "If CorporateActionOptionDetails/RateAndAmountDetails/GrossDividendRate/RateTypeAndAmountAndRateStatus/RateType/Code value or  CorporateActionOptionDetails/RateAndAmountDetails/InterestRateUsedForPayment/RateTypeAndAmountAndRateStatus/RateType/Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).";
			owner_lazy = () -> CorporateActionNotificationV01.mmObject();
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
	 * name} = "RateAndCorporateActionEventRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionOptionDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate/Code value or  CorporateActionOptionDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate/Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).\r\nIf CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate/Code value or  CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate/Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV02> forCorporateActionNotificationV02 = new MMConstraint<CorporateActionNotificationV02>() {
		{
			validator = ConstraintRateAndCorporateActionEventRule::checkCorporateActionNotificationV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateAndCorporateActionEventRule";
			definition = "If CorporateActionOptionDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate/Code value or  CorporateActionOptionDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate/Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).\r\nIf CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate/Code value or  CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate/Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).";
			owner_lazy = () -> CorporateActionNotificationV02.mmObject();
		}
	};
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
	 * name} = "RateAndCorporateActionEventRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionOptionDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate/Code value or  CorporateActionOptionDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate/Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).\r\nIf CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate/Code value or  CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate/Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV03> forCorporateActionNotificationV03 = new MMConstraint<CorporateActionNotificationV03>() {
		{
			validator = ConstraintRateAndCorporateActionEventRule::checkCorporateActionNotificationV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateAndCorporateActionEventRule";
			definition = "If CorporateActionOptionDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate/Code value or  CorporateActionOptionDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate/Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).\r\nIf CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate/Code value or  CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate/Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).";
			owner_lazy = () -> CorporateActionNotificationV03.mmObject();
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
	 * name} = "RateAndCorporateActionEventRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionOptionDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate/Code value or  CorporateActionOptionDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate/Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).\r\nIf CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate/Code value or  CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate/Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRateAndCorporateActionEventRule#forCorporateActionNotificationV05
	 * ConstraintRateAndCorporateActionEventRule.
	 * forCorporateActionNotificationV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV04> forCorporateActionNotificationV04 = new MMConstraint<CorporateActionNotificationV04>() {
		{
			validator = ConstraintRateAndCorporateActionEventRule::checkCorporateActionNotificationV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateAndCorporateActionEventRule";
			definition = "If CorporateActionOptionDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate/Code value or  CorporateActionOptionDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate/Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).\r\nIf CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate/Code value or  CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate/Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRateAndCorporateActionEventRule.forCorporateActionNotificationV05);
			owner_lazy = () -> CorporateActionNotificationV04.mmObject();
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
	 * name} = "RateAndCorporateActionEventRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionOptionDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or  CorporateActionOptionDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).\r\nIf CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or  CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRateAndCorporateActionEventRule#forCorporateActionNotificationV06
	 * ConstraintRateAndCorporateActionEventRule.
	 * forCorporateActionNotificationV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRateAndCorporateActionEventRule#forCorporateActionNotificationV04
	 * ConstraintRateAndCorporateActionEventRule.
	 * forCorporateActionNotificationV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV05> forCorporateActionNotificationV05 = new MMConstraint<CorporateActionNotificationV05>() {
		{
			validator = ConstraintRateAndCorporateActionEventRule::checkCorporateActionNotificationV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateAndCorporateActionEventRule";
			definition = "If CorporateActionOptionDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or  CorporateActionOptionDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).\r\nIf CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or  CorporateActionOptionDetails/CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRateAndCorporateActionEventRule.forCorporateActionNotificationV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRateAndCorporateActionEventRule.forCorporateActionNotificationV04;
			owner_lazy = () -> CorporateActionNotificationV05.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateAndCorporateActionEventRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or  CorporateActionMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).\r\nIf CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or  CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRateAndCorporateActionEventRule#forCorporateActionMovementPreliminaryAdviceV06
	 * ConstraintRateAndCorporateActionEventRule.
	 * forCorporateActionMovementPreliminaryAdviceV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRateAndCorporateActionEventRule#forCorporateActionMovementPreliminaryAdviceV04
	 * ConstraintRateAndCorporateActionEventRule.
	 * forCorporateActionMovementPreliminaryAdviceV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementPreliminaryAdviceV05> forCorporateActionMovementPreliminaryAdviceV05 = new MMConstraint<CorporateActionMovementPreliminaryAdviceV05>() {
		{
			validator = ConstraintRateAndCorporateActionEventRule::checkCorporateActionMovementPreliminaryAdviceV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateAndCorporateActionEventRule";
			definition = "If CorporateActionMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or  CorporateActionMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).\r\nIf CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or  CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRateAndCorporateActionEventRule.forCorporateActionMovementPreliminaryAdviceV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRateAndCorporateActionEventRule.forCorporateActionMovementPreliminaryAdviceV04;
			owner_lazy = () -> CorporateActionMovementPreliminaryAdviceV05.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateAndCorporateActionEventRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or  CorporateActionMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).\r\nIf CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or  CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRateAndCorporateActionEventRule#forCorporateActionMovementPreliminaryAdviceV07
	 * ConstraintRateAndCorporateActionEventRule.
	 * forCorporateActionMovementPreliminaryAdviceV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRateAndCorporateActionEventRule#forCorporateActionMovementPreliminaryAdviceV05
	 * ConstraintRateAndCorporateActionEventRule.
	 * forCorporateActionMovementPreliminaryAdviceV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementPreliminaryAdviceV06> forCorporateActionMovementPreliminaryAdviceV06 = new MMConstraint<CorporateActionMovementPreliminaryAdviceV06>() {
		{
			validator = ConstraintRateAndCorporateActionEventRule::checkCorporateActionMovementPreliminaryAdviceV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateAndCorporateActionEventRule";
			definition = "If CorporateActionMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or  CorporateActionMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).\r\nIf CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/GrossDividendRate/NotSpecifiedRate Code value or  CorporateActionMovementDetails/CashMovementDetails/RateAndAmountDetails/InterestRateUsedForPayment/NotSpecifiedRate Code value is NILP (Nil Payment), then CorporateActionGeneralInformation/EventType/Code must be either DVCA (CashDividend) or INTR (InterestPayment).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRateAndCorporateActionEventRule.forCorporateActionMovementPreliminaryAdviceV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRateAndCorporateActionEventRule.forCorporateActionMovementPreliminaryAdviceV05;
			owner_lazy = () -> CorporateActionMovementPreliminaryAdviceV06.mmObject();
		}
	};

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
	public static void checkCorporateActionNotificationV07(CorporateActionNotificationV07 obj) throws Exception {
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
	public static void checkCorporateActionMovementPreliminaryAdviceV08(CorporateActionMovementPreliminaryAdviceV08 obj) throws Exception {
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
	public static void checkCorporateActionMovementPreliminaryAdvice002V08(CorporateActionMovementPreliminaryAdvice002V08 obj) throws Exception {
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
	public static void checkCorporateActionNotification002V07(CorporateActionNotification002V07 obj) throws Exception {
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
	public static void checkCorporateActionMovementPreliminaryAdviceV07(CorporateActionMovementPreliminaryAdviceV07 obj) throws Exception {
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
	public static void checkCorporateActionNotificationV06(CorporateActionNotificationV06 obj) throws Exception {
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
	public static void checkCorporateActionMovementPreliminaryAdviceV02(CorporateActionMovementPreliminaryAdviceV02 obj) throws Exception {
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
	public static void checkCorporateActionMovementPreliminaryAdviceV03(CorporateActionMovementPreliminaryAdviceV03 obj) throws Exception {
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
	public static void checkCorporateActionMovementPreliminaryAdviceV04(CorporateActionMovementPreliminaryAdviceV04 obj) throws Exception {
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
	public static void checkCorporateActionNotificationV01(CorporateActionNotificationV01 obj) throws Exception {
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
	public static void checkCorporateActionNotificationV02(CorporateActionNotificationV02 obj) throws Exception {
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
	public static void checkCorporateActionNotificationV03(CorporateActionNotificationV03 obj) throws Exception {
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
	public static void checkCorporateActionNotificationV04(CorporateActionNotificationV04 obj) throws Exception {
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
	public static void checkCorporateActionNotificationV05(CorporateActionNotificationV05 obj) throws Exception {
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
	public static void checkCorporateActionMovementPreliminaryAdviceV05(CorporateActionMovementPreliminaryAdviceV05 obj) throws Exception {
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
	public static void checkCorporateActionMovementPreliminaryAdviceV06(CorporateActionMovementPreliminaryAdviceV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}