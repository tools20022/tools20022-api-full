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
 * CorporateActionDetails/RateAndAmountDetails/InterestRate and
 * CorporateActionOptionsDetails/RateAndAmountDetails/InterestRateUsedforPayment
 * must not be mixed. InterestRate is used to provide the annual rate of the
 * financial instrument. InterestRateUsedforPayment is used to provide the
 * applicable rate for the current payment, after all calculations have been
 * performed, that is, application of period and method of interest computation.
 */
public class ConstraintInterestPaymentRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV08
	 * CorporateActionNotificationV08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestPaymentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CorporateActionDetails/RateAndAmountDetails/InterestRate and CorporateActionOptionsDetails/RateAndAmountDetails/InterestRateUsedforPayment must not be mixed. InterestRate is used to provide the annual rate of the financial instrument. InterestRateUsedforPayment is used to provide the applicable rate for the current payment, after all calculations have been performed, that is, application of period and method of interest computation."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInterestPaymentRule#forCorporateActionNotificationV07
	 * ConstraintInterestPaymentRule.forCorporateActionNotificationV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV08> forCorporateActionNotificationV08 = new MMConstraint<CorporateActionNotificationV08>() {
		{
			validator = ConstraintInterestPaymentRule::checkCorporateActionNotificationV08;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestPaymentRule";
			definition = "CorporateActionDetails/RateAndAmountDetails/InterestRate and CorporateActionOptionsDetails/RateAndAmountDetails/InterestRateUsedforPayment must not be mixed. InterestRate is used to provide the annual rate of the financial instrument. InterestRateUsedforPayment is used to provide the applicable rate for the current payment, after all calculations have been performed, that is, application of period and method of interest computation.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintInterestPaymentRule.forCorporateActionNotificationV07;
			owner_lazy = () -> CorporateActionNotificationV08.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestPaymentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CorporateActionDetails/RateAndAmountDetails/Interest and CorporateActionOptionsDetails/RateAndAmountDetails/InterestRateUsedforPayment must not be mixed. Interest is used to provide the annual rate of the financial instrument. InterestRateUsedforPayment is used to provide the applicable rate for the current payment, after all calculations have been performed, that is, application of period and method of interest computation."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInterestPaymentRule#forCorporateActionNotificationV08
	 * ConstraintInterestPaymentRule.forCorporateActionNotificationV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInterestPaymentRule#forCorporateActionNotificationV06
	 * ConstraintInterestPaymentRule.forCorporateActionNotificationV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV07> forCorporateActionNotificationV07 = new MMConstraint<CorporateActionNotificationV07>() {
		{
			validator = ConstraintInterestPaymentRule::checkCorporateActionNotificationV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestPaymentRule";
			definition = "CorporateActionDetails/RateAndAmountDetails/Interest and CorporateActionOptionsDetails/RateAndAmountDetails/InterestRateUsedforPayment must not be mixed. Interest is used to provide the annual rate of the financial instrument. InterestRateUsedforPayment is used to provide the applicable rate for the current payment, after all calculations have been performed, that is, application of period and method of interest computation.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInterestPaymentRule.forCorporateActionNotificationV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintInterestPaymentRule.forCorporateActionNotificationV06;
			owner_lazy = () -> CorporateActionNotificationV07.mmObject();
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
	 * name} = "InterestPaymentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CorporateActionDetails/RateAndAmountDetails/Interest and CorporateActionOptionsDetails/RateAndAmountDetails/InterestRateUsedforPayment must not be mixed. Interest is used to provide the annual rate of the financial instrument. InterestRateUsedforPayment is used to provide the applicable rate for the current payment, after all calculations have been performed, that is, application of period and method of interest computation."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotification002V07> forCorporateActionNotification002V07 = new MMConstraint<CorporateActionNotification002V07>() {
		{
			validator = ConstraintInterestPaymentRule::checkCorporateActionNotification002V07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestPaymentRule";
			definition = "CorporateActionDetails/RateAndAmountDetails/Interest and CorporateActionOptionsDetails/RateAndAmountDetails/InterestRateUsedforPayment must not be mixed. Interest is used to provide the annual rate of the financial instrument. InterestRateUsedforPayment is used to provide the applicable rate for the current payment, after all calculations have been performed, that is, application of period and method of interest computation.";
			owner_lazy = () -> CorporateActionNotification002V07.mmObject();
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
	 * name} = "InterestPaymentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CorporateActionDetails/RateAndAmountDetails/Interest and CorporateActionOptionsDetails/RateAndAmountDetails/InterestRateUsedforPayment must not be mixed. Interest is used to provide the annual rate of the financial instrument. InterestRateUsedforPayment is used to provide the applicable rate for the current payment, after all calculations have been performed, that is, application of period and method of interest computation."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV02> forCorporateActionNotificationV02 = new MMConstraint<CorporateActionNotificationV02>() {
		{
			validator = ConstraintInterestPaymentRule::checkCorporateActionNotificationV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestPaymentRule";
			definition = "CorporateActionDetails/RateAndAmountDetails/Interest and CorporateActionOptionsDetails/RateAndAmountDetails/InterestRateUsedforPayment must not be mixed. Interest is used to provide the annual rate of the financial instrument. InterestRateUsedforPayment is used to provide the applicable rate for the current payment, after all calculations have been performed, that is, application of period and method of interest computation.";
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
	 * name} = "InterestPaymentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CorporateActionDetails/RateAndAmountDetails/Interest and CorporateActionOptionsDetails/RateAndAmountDetails/InterestRateUsedforPayment must not be mixed. Interest is used to provide the annual rate of the financial instrument. InterestRateUsedforPayment is used to provide the applicable rate for the current payment, after all calculations have been performed, that is, application of period and method of interest computation."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV03> forCorporateActionNotificationV03 = new MMConstraint<CorporateActionNotificationV03>() {
		{
			validator = ConstraintInterestPaymentRule::checkCorporateActionNotificationV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestPaymentRule";
			definition = "CorporateActionDetails/RateAndAmountDetails/Interest and CorporateActionOptionsDetails/RateAndAmountDetails/InterestRateUsedforPayment must not be mixed. Interest is used to provide the annual rate of the financial instrument. InterestRateUsedforPayment is used to provide the applicable rate for the current payment, after all calculations have been performed, that is, application of period and method of interest computation.";
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
	 * name} = "InterestPaymentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CorporateActionDetails/RateAndAmountDetails/Interest and CorporateActionOptionsDetails/RateAndAmountDetails/InterestRateUsedforPayment must not be mixed. Interest is used to provide the annual rate of the financial instrument. InterestRateUsedforPayment is used to provide the applicable rate for the current payment, after all calculations have been performed, that is, application of period and method of interest computation."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInterestPaymentRule#forCorporateActionNotificationV05
	 * ConstraintInterestPaymentRule.forCorporateActionNotificationV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV04> forCorporateActionNotificationV04 = new MMConstraint<CorporateActionNotificationV04>() {
		{
			validator = ConstraintInterestPaymentRule::checkCorporateActionNotificationV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestPaymentRule";
			definition = "CorporateActionDetails/RateAndAmountDetails/Interest and CorporateActionOptionsDetails/RateAndAmountDetails/InterestRateUsedforPayment must not be mixed. Interest is used to provide the annual rate of the financial instrument. InterestRateUsedforPayment is used to provide the applicable rate for the current payment, after all calculations have been performed, that is, application of period and method of interest computation.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInterestPaymentRule.forCorporateActionNotificationV05);
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
	 * name} = "InterestPaymentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CorporateActionDetails/RateAndAmountDetails/Interest and CorporateActionOptionsDetails/RateAndAmountDetails/InterestRateUsedforPayment must not be mixed. Interest is used to provide the annual rate of the financial instrument. InterestRateUsedforPayment is used to provide the applicable rate for the current payment, after all calculations have been performed, that is, application of period and method of interest computation."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInterestPaymentRule#forCorporateActionNotificationV06
	 * ConstraintInterestPaymentRule.forCorporateActionNotificationV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInterestPaymentRule#forCorporateActionNotificationV04
	 * ConstraintInterestPaymentRule.forCorporateActionNotificationV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV05> forCorporateActionNotificationV05 = new MMConstraint<CorporateActionNotificationV05>() {
		{
			validator = ConstraintInterestPaymentRule::checkCorporateActionNotificationV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestPaymentRule";
			definition = "CorporateActionDetails/RateAndAmountDetails/Interest and CorporateActionOptionsDetails/RateAndAmountDetails/InterestRateUsedforPayment must not be mixed. Interest is used to provide the annual rate of the financial instrument. InterestRateUsedforPayment is used to provide the applicable rate for the current payment, after all calculations have been performed, that is, application of period and method of interest computation.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInterestPaymentRule.forCorporateActionNotificationV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintInterestPaymentRule.forCorporateActionNotificationV04;
			owner_lazy = () -> CorporateActionNotificationV05.mmObject();
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
	 * name} = "InterestPaymentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CorporateActionDetails/RateAndAmountDetails/Interest and CorporateActionOptionsDetails/RateAndAmountDetails/InterestRateUsedforPayment must not be mixed. Interest is used to provide the annual rate of the financial instrument. InterestRateUsedforPayment is used to provide the applicable rate for the current payment, after all calculations have been performed, that is, application of period and method of interest computation."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInterestPaymentRule#forCorporateActionNotificationV07
	 * ConstraintInterestPaymentRule.forCorporateActionNotificationV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInterestPaymentRule#forCorporateActionNotificationV05
	 * ConstraintInterestPaymentRule.forCorporateActionNotificationV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV06> forCorporateActionNotificationV06 = new MMConstraint<CorporateActionNotificationV06>() {
		{
			validator = ConstraintInterestPaymentRule::checkCorporateActionNotificationV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestPaymentRule";
			definition = "CorporateActionDetails/RateAndAmountDetails/Interest and CorporateActionOptionsDetails/RateAndAmountDetails/InterestRateUsedforPayment must not be mixed. Interest is used to provide the annual rate of the financial instrument. InterestRateUsedforPayment is used to provide the applicable rate for the current payment, after all calculations have been performed, that is, application of period and method of interest computation.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInterestPaymentRule.forCorporateActionNotificationV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintInterestPaymentRule.forCorporateActionNotificationV05;
			owner_lazy = () -> CorporateActionNotificationV06.mmObject();
		}
	};

	/**
	 * CorporateActionDetails/RateAndAmountDetails/InterestRate and
	 * CorporateActionOptionsDetails
	 * /RateAndAmountDetails/InterestRateUsedforPayment must not be mixed.
	 * InterestRate is used to provide the annual rate of the financial
	 * instrument. InterestRateUsedforPayment is used to provide the applicable
	 * rate for the current payment, after all calculations have been performed,
	 * that is, application of period and method of interest computation.
	 */
	public static void checkCorporateActionNotificationV08(CorporateActionNotificationV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * CorporateActionDetails/RateAndAmountDetails/Interest and
	 * CorporateActionOptionsDetails
	 * /RateAndAmountDetails/InterestRateUsedforPayment must not be mixed.
	 * Interest is used to provide the annual rate of the financial instrument.
	 * InterestRateUsedforPayment is used to provide the applicable rate for the
	 * current payment, after all calculations have been performed, that is,
	 * application of period and method of interest computation.
	 */
	public static void checkCorporateActionNotificationV07(CorporateActionNotificationV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * CorporateActionDetails/RateAndAmountDetails/Interest and
	 * CorporateActionOptionsDetails
	 * /RateAndAmountDetails/InterestRateUsedforPayment must not be mixed.
	 * Interest is used to provide the annual rate of the financial instrument.
	 * InterestRateUsedforPayment is used to provide the applicable rate for the
	 * current payment, after all calculations have been performed, that is,
	 * application of period and method of interest computation.
	 */
	public static void checkCorporateActionNotification002V07(CorporateActionNotification002V07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * CorporateActionDetails/RateAndAmountDetails/Interest and
	 * CorporateActionOptionsDetails
	 * /RateAndAmountDetails/InterestRateUsedforPayment must not be mixed.
	 * Interest is used to provide the annual rate of the financial instrument.
	 * InterestRateUsedforPayment is used to provide the applicable rate for the
	 * current payment, after all calculations have been performed, that is,
	 * application of period and method of interest computation.
	 */
	public static void checkCorporateActionNotificationV02(CorporateActionNotificationV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * CorporateActionDetails/RateAndAmountDetails/Interest and
	 * CorporateActionOptionsDetails
	 * /RateAndAmountDetails/InterestRateUsedforPayment must not be mixed.
	 * Interest is used to provide the annual rate of the financial instrument.
	 * InterestRateUsedforPayment is used to provide the applicable rate for the
	 * current payment, after all calculations have been performed, that is,
	 * application of period and method of interest computation.
	 */
	public static void checkCorporateActionNotificationV03(CorporateActionNotificationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * CorporateActionDetails/RateAndAmountDetails/Interest and
	 * CorporateActionOptionsDetails
	 * /RateAndAmountDetails/InterestRateUsedforPayment must not be mixed.
	 * Interest is used to provide the annual rate of the financial instrument.
	 * InterestRateUsedforPayment is used to provide the applicable rate for the
	 * current payment, after all calculations have been performed, that is,
	 * application of period and method of interest computation.
	 */
	public static void checkCorporateActionNotificationV04(CorporateActionNotificationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * CorporateActionDetails/RateAndAmountDetails/Interest and
	 * CorporateActionOptionsDetails
	 * /RateAndAmountDetails/InterestRateUsedforPayment must not be mixed.
	 * Interest is used to provide the annual rate of the financial instrument.
	 * InterestRateUsedforPayment is used to provide the applicable rate for the
	 * current payment, after all calculations have been performed, that is,
	 * application of period and method of interest computation.
	 */
	public static void checkCorporateActionNotificationV05(CorporateActionNotificationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * CorporateActionDetails/RateAndAmountDetails/Interest and
	 * CorporateActionOptionsDetails
	 * /RateAndAmountDetails/InterestRateUsedforPayment must not be mixed.
	 * Interest is used to provide the annual rate of the financial instrument.
	 * InterestRateUsedforPayment is used to provide the applicable rate for the
	 * current payment, after all calculations have been performed, that is,
	 * application of period and method of interest computation.
	 */
	public static void checkCorporateActionNotificationV06(CorporateActionNotificationV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}