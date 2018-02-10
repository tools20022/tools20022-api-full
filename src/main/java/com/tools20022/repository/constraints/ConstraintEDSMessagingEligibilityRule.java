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
import java.util.Arrays;

/**
 * Applies only to distribution events that may be eligible for EDS ISO 20022
 * messaging services. It will not be present for Redemption or Reorganisation
 * events.
 */
public class ConstraintEDSMessagingEligibilityRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD11
	 * CorporateActionGeneralInformationSD11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EDSMessagingEligibilityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Applies only to distribution events that may be eligible for EDS ISO 20022 messaging services. It will not be present for Redemption or Reorganisation events."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEDSMessagingEligibilityRule#forCorporateActionGeneralInformationSD13
	 * ConstraintEDSMessagingEligibilityRule.
	 * forCorporateActionGeneralInformationSD13}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformationSD11> forCorporateActionGeneralInformationSD11 = new MMConstraint<CorporateActionGeneralInformationSD11>() {
		{
			validator = ConstraintEDSMessagingEligibilityRule::checkCorporateActionGeneralInformationSD11;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EDSMessagingEligibilityRule";
			definition = "Applies only to distribution events that may be eligible for EDS ISO 20022 messaging services. It will not be present for Redemption or Reorganisation events.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEDSMessagingEligibilityRule.forCorporateActionGeneralInformationSD13);
			owner_lazy = () -> CorporateActionGeneralInformationSD11.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD10
	 * CorporateActionGeneralInformationSD10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EDSMessagingEligibilityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Applies only to distribution events that may be eligible for EDS ISO 20022 messaging services. It will not be present for Redemption or Reorganisation events."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEDSMessagingEligibilityRule#forCorporateActionGeneralInformationSD12
	 * ConstraintEDSMessagingEligibilityRule.
	 * forCorporateActionGeneralInformationSD12}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformationSD10> forCorporateActionGeneralInformationSD10 = new MMConstraint<CorporateActionGeneralInformationSD10>() {
		{
			validator = ConstraintEDSMessagingEligibilityRule::checkCorporateActionGeneralInformationSD10;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EDSMessagingEligibilityRule";
			definition = "Applies only to distribution events that may be eligible for EDS ISO 20022 messaging services. It will not be present for Redemption or Reorganisation events.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEDSMessagingEligibilityRule.forCorporateActionGeneralInformationSD12);
			owner_lazy = () -> CorporateActionGeneralInformationSD10.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD13
	 * CorporateActionGeneralInformationSD13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EDSMessagingEligibilityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Applies only to distribution events that may be eligible for EDS ISO 20022 messaging services. It will not be present for Redemption or Reorganisation events."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEDSMessagingEligibilityRule#forCorporateActionGeneralInformationSD11
	 * ConstraintEDSMessagingEligibilityRule.
	 * forCorporateActionGeneralInformationSD11}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformationSD13> forCorporateActionGeneralInformationSD13 = new MMConstraint<CorporateActionGeneralInformationSD13>() {
		{
			validator = ConstraintEDSMessagingEligibilityRule::checkCorporateActionGeneralInformationSD13;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EDSMessagingEligibilityRule";
			definition = "Applies only to distribution events that may be eligible for EDS ISO 20022 messaging services. It will not be present for Redemption or Reorganisation events.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEDSMessagingEligibilityRule.forCorporateActionGeneralInformationSD11;
			owner_lazy = () -> CorporateActionGeneralInformationSD13.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD12
	 * CorporateActionGeneralInformationSD12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EDSMessagingEligibilityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Applies only to distribution events that may be eligible for EDS ISO 20022 messaging services. It will not be present for Redemption or Reorganisation events."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEDSMessagingEligibilityRule#forCorporateActionGeneralInformationSD18
	 * ConstraintEDSMessagingEligibilityRule.
	 * forCorporateActionGeneralInformationSD18}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEDSMessagingEligibilityRule#forCorporateActionGeneralInformationSD10
	 * ConstraintEDSMessagingEligibilityRule.
	 * forCorporateActionGeneralInformationSD10}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformationSD12> forCorporateActionGeneralInformationSD12 = new MMConstraint<CorporateActionGeneralInformationSD12>() {
		{
			validator = ConstraintEDSMessagingEligibilityRule::checkCorporateActionGeneralInformationSD12;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EDSMessagingEligibilityRule";
			definition = "Applies only to distribution events that may be eligible for EDS ISO 20022 messaging services. It will not be present for Redemption or Reorganisation events.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEDSMessagingEligibilityRule.forCorporateActionGeneralInformationSD18);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEDSMessagingEligibilityRule.forCorporateActionGeneralInformationSD10;
			owner_lazy = () -> CorporateActionGeneralInformationSD12.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD18
	 * CorporateActionGeneralInformationSD18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EDSMessagingEligibilityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Applies only to distribution events that may be eligible for EDS ISO 20022 messaging services. It will not be present for Redemption or Reorganisation events."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEDSMessagingEligibilityRule#forCorporateActionGeneralInformationSD22
	 * ConstraintEDSMessagingEligibilityRule.
	 * forCorporateActionGeneralInformationSD22}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEDSMessagingEligibilityRule#forCorporateActionGeneralInformationSD12
	 * ConstraintEDSMessagingEligibilityRule.
	 * forCorporateActionGeneralInformationSD12}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformationSD18> forCorporateActionGeneralInformationSD18 = new MMConstraint<CorporateActionGeneralInformationSD18>() {
		{
			validator = ConstraintEDSMessagingEligibilityRule::checkCorporateActionGeneralInformationSD18;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EDSMessagingEligibilityRule";
			definition = "Applies only to distribution events that may be eligible for EDS ISO 20022 messaging services. It will not be present for Redemption or Reorganisation events.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEDSMessagingEligibilityRule.forCorporateActionGeneralInformationSD22);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEDSMessagingEligibilityRule.forCorporateActionGeneralInformationSD12;
			owner_lazy = () -> CorporateActionGeneralInformationSD18.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD22
	 * CorporateActionGeneralInformationSD22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EDSMessagingEligibilityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Applies only to distribution events that may be eligible for EDS ISO 20022 messaging services. It will not be present for Redemption or Reorganisation events."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEDSMessagingEligibilityRule#forCorporateActionGeneralInformationSD23
	 * ConstraintEDSMessagingEligibilityRule.
	 * forCorporateActionGeneralInformationSD23}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEDSMessagingEligibilityRule#forCorporateActionGeneralInformationSD18
	 * ConstraintEDSMessagingEligibilityRule.
	 * forCorporateActionGeneralInformationSD18}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformationSD22> forCorporateActionGeneralInformationSD22 = new MMConstraint<CorporateActionGeneralInformationSD22>() {
		{
			validator = ConstraintEDSMessagingEligibilityRule::checkCorporateActionGeneralInformationSD22;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EDSMessagingEligibilityRule";
			definition = "Applies only to distribution events that may be eligible for EDS ISO 20022 messaging services. It will not be present for Redemption or Reorganisation events.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEDSMessagingEligibilityRule.forCorporateActionGeneralInformationSD23);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEDSMessagingEligibilityRule.forCorporateActionGeneralInformationSD18;
			owner_lazy = () -> CorporateActionGeneralInformationSD22.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD23
	 * CorporateActionGeneralInformationSD23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EDSMessagingEligibilityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Applies only to distribution events that may be eligible for EDS ISO 20022 messaging services. It will not be present for Redemption or Reorganisation events."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEDSMessagingEligibilityRule#forCorporateActionGeneralInformationSD22
	 * ConstraintEDSMessagingEligibilityRule.
	 * forCorporateActionGeneralInformationSD22}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformationSD23> forCorporateActionGeneralInformationSD23 = new MMConstraint<CorporateActionGeneralInformationSD23>() {
		{
			validator = ConstraintEDSMessagingEligibilityRule::checkCorporateActionGeneralInformationSD23;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EDSMessagingEligibilityRule";
			definition = "Applies only to distribution events that may be eligible for EDS ISO 20022 messaging services. It will not be present for Redemption or Reorganisation events.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEDSMessagingEligibilityRule.forCorporateActionGeneralInformationSD22;
			owner_lazy = () -> CorporateActionGeneralInformationSD23.mmObject();
		}
	};

	/**
	 * Applies only to distribution events that may be eligible for EDS ISO
	 * 20022 messaging services. It will not be present for Redemption or
	 * Reorganisation events.
	 */
	public static void checkCorporateActionGeneralInformationSD11(CorporateActionGeneralInformationSD11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Applies only to distribution events that may be eligible for EDS ISO
	 * 20022 messaging services. It will not be present for Redemption or
	 * Reorganisation events.
	 */
	public static void checkCorporateActionGeneralInformationSD10(CorporateActionGeneralInformationSD10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Applies only to distribution events that may be eligible for EDS ISO
	 * 20022 messaging services. It will not be present for Redemption or
	 * Reorganisation events.
	 */
	public static void checkCorporateActionGeneralInformationSD13(CorporateActionGeneralInformationSD13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Applies only to distribution events that may be eligible for EDS ISO
	 * 20022 messaging services. It will not be present for Redemption or
	 * Reorganisation events.
	 */
	public static void checkCorporateActionGeneralInformationSD12(CorporateActionGeneralInformationSD12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Applies only to distribution events that may be eligible for EDS ISO
	 * 20022 messaging services. It will not be present for Redemption or
	 * Reorganisation events.
	 */
	public static void checkCorporateActionGeneralInformationSD18(CorporateActionGeneralInformationSD18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Applies only to distribution events that may be eligible for EDS ISO
	 * 20022 messaging services. It will not be present for Redemption or
	 * Reorganisation events.
	 */
	public static void checkCorporateActionGeneralInformationSD22(CorporateActionGeneralInformationSD22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Applies only to distribution events that may be eligible for EDS ISO
	 * 20022 messaging services. It will not be present for Redemption or
	 * Reorganisation events.
	 */
	public static void checkCorporateActionGeneralInformationSD23(CorporateActionGeneralInformationSD23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}