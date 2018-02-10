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
 * If CorporateActionDetails/DateDetails/NewMaturityDate is present, then
 * CorporateActionGeneralInformation/EventType/Code must be EXTM (Maturity
 * Extension).
 */
public class ConstraintNewMaturityDateRule {

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
	 * name} = "NewMaturityDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionDetails/DateDetails/NewMaturityDate is present, then CorporateActionGeneralInformation/EventType/Code must be EXTM (Maturity Extension)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNewMaturityDateRule#forCorporateActionNotificationV07
	 * ConstraintNewMaturityDateRule.forCorporateActionNotificationV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV08> forCorporateActionNotificationV08 = new MMConstraint<CorporateActionNotificationV08>() {
		{
			validator = ConstraintNewMaturityDateRule::checkCorporateActionNotificationV08;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewMaturityDateRule";
			definition = "If CorporateActionDetails/DateDetails/NewMaturityDate is present, then CorporateActionGeneralInformation/EventType/Code must be EXTM (Maturity Extension).";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNewMaturityDateRule.forCorporateActionNotificationV07;
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
	 * name} = "NewMaturityDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionDetails/DateDetails/NewMaturityDate is present, then CorporateActionGeneralInformation/EventType/Code is EXTM (Maturity Extension)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNewMaturityDateRule#forCorporateActionNotificationV08
	 * ConstraintNewMaturityDateRule.forCorporateActionNotificationV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNewMaturityDateRule#forCorporateActionNotificationV06
	 * ConstraintNewMaturityDateRule.forCorporateActionNotificationV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV07> forCorporateActionNotificationV07 = new MMConstraint<CorporateActionNotificationV07>() {
		{
			validator = ConstraintNewMaturityDateRule::checkCorporateActionNotificationV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewMaturityDateRule";
			definition = "If CorporateActionDetails/DateDetails/NewMaturityDate is present, then CorporateActionGeneralInformation/EventType/Code is EXTM (Maturity Extension).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNewMaturityDateRule.forCorporateActionNotificationV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNewMaturityDateRule.forCorporateActionNotificationV06;
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
	 * name} = "NewMaturityDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionDetails/DateDetails/NewMaturityDate is present, then CorporateActionGeneralInformation/EventType/Code is EXTM (Maturity Extension)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotification002V07> forCorporateActionNotification002V07 = new MMConstraint<CorporateActionNotification002V07>() {
		{
			validator = ConstraintNewMaturityDateRule::checkCorporateActionNotification002V07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewMaturityDateRule";
			definition = "If CorporateActionDetails/DateDetails/NewMaturityDate is present, then CorporateActionGeneralInformation/EventType/Code is EXTM (Maturity Extension).";
			owner_lazy = () -> CorporateActionNotification002V07.mmObject();
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
	 * name} = "NewMaturityDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionDetails/DateDetails/NewMaturityDate is present, then CorporateActionGeneralInformation/EventType/Code is EXTM (Maturity Extension)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNewMaturityDateRule#forCorporateActionNotificationV06
	 * ConstraintNewMaturityDateRule.forCorporateActionNotificationV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintMaturityDateRule#forCorporateActionNotificationV04
	 * ConstraintMaturityDateRule.forCorporateActionNotificationV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV05> forCorporateActionNotificationV05 = new MMConstraint<CorporateActionNotificationV05>() {
		{
			validator = ConstraintNewMaturityDateRule::checkCorporateActionNotificationV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewMaturityDateRule";
			definition = "If CorporateActionDetails/DateDetails/NewMaturityDate is present, then CorporateActionGeneralInformation/EventType/Code is EXTM (Maturity Extension).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNewMaturityDateRule.forCorporateActionNotificationV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintMaturityDateRule.forCorporateActionNotificationV04;
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
	 * name} = "NewMaturityDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionDetails/DateDetails/NewMaturityDate is present, then CorporateActionGeneralInformation/EventType/Code is EXTM (Maturity Extension)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNewMaturityDateRule#forCorporateActionNotificationV07
	 * ConstraintNewMaturityDateRule.forCorporateActionNotificationV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNewMaturityDateRule#forCorporateActionNotificationV05
	 * ConstraintNewMaturityDateRule.forCorporateActionNotificationV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV06> forCorporateActionNotificationV06 = new MMConstraint<CorporateActionNotificationV06>() {
		{
			validator = ConstraintNewMaturityDateRule::checkCorporateActionNotificationV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewMaturityDateRule";
			definition = "If CorporateActionDetails/DateDetails/NewMaturityDate is present, then CorporateActionGeneralInformation/EventType/Code is EXTM (Maturity Extension).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNewMaturityDateRule.forCorporateActionNotificationV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNewMaturityDateRule.forCorporateActionNotificationV05;
			owner_lazy = () -> CorporateActionNotificationV06.mmObject();
		}
	};

	/**
	 * If CorporateActionDetails/DateDetails/NewMaturityDate is present, then
	 * CorporateActionGeneralInformation/EventType/Code must be EXTM (Maturity
	 * Extension).
	 */
	public static void checkCorporateActionNotificationV08(CorporateActionNotificationV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionDetails/DateDetails/NewMaturityDate is present, then
	 * CorporateActionGeneralInformation/EventType/Code is EXTM (Maturity
	 * Extension).
	 */
	public static void checkCorporateActionNotificationV07(CorporateActionNotificationV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionDetails/DateDetails/NewMaturityDate is present, then
	 * CorporateActionGeneralInformation/EventType/Code is EXTM (Maturity
	 * Extension).
	 */
	public static void checkCorporateActionNotification002V07(CorporateActionNotification002V07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionDetails/DateDetails/NewMaturityDate is present, then
	 * CorporateActionGeneralInformation/EventType/Code is EXTM (Maturity
	 * Extension).
	 */
	public static void checkCorporateActionNotificationV05(CorporateActionNotificationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionDetails/DateDetails/NewMaturityDate is present, then
	 * CorporateActionGeneralInformation/EventType/Code is EXTM (Maturity
	 * Extension).
	 */
	public static void checkCorporateActionNotificationV06(CorporateActionNotificationV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}