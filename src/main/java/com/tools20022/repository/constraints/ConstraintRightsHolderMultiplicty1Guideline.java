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
 * It is recommended that RightsHolder can only be repetitive in case of joint
 * ownership.
 */
public class ConstraintRightsHolderMultiplicty1Guideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.EligiblePosition2
	 * EligiblePosition2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RightsHolderMultiplicty1Guideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is recommended that RightsHolder can only be repetitive in case of joint ownership."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<EligiblePosition2> forEligiblePosition2 = new MMConstraint<EligiblePosition2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsHolderMultiplicty1Guideline";
			definition = "It is recommended that RightsHolder can only be repetitive in case of joint ownership.";
			owner_lazy = () -> EligiblePosition2.mmObject();
		}

		@Override
		public void executeValidator(EligiblePosition2 obj) throws Exception {
			checkEligiblePosition2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus9
	 * DetailedInstructionStatus9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RightsHolderMultiplicty1Guideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is recommended that RightsHolder can only be repetitive in case of joint ownership."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRightsHolderMultiplicty1Guideline#forDetailedInstructionStatus10
	 * ConstraintRightsHolderMultiplicty1Guideline.
	 * forDetailedInstructionStatus10}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DetailedInstructionStatus9> forDetailedInstructionStatus9 = new MMConstraint<DetailedInstructionStatus9>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsHolderMultiplicty1Guideline";
			definition = "It is recommended that RightsHolder can only be repetitive in case of joint ownership.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRightsHolderMultiplicty1Guideline.forDetailedInstructionStatus10);
			owner_lazy = () -> DetailedInstructionStatus9.mmObject();
		}

		@Override
		public void executeValidator(DetailedInstructionStatus9 obj) throws Exception {
			checkDetailedInstructionStatus9(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.EligiblePosition6
	 * EligiblePosition6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RightsHolderMultiplicty1Guideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is recommended that RightsHolder can only be repetitive in the case of joint ownership."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRightsHolderMultiplicty1Guideline#forEligiblePosition4
	 * ConstraintRightsHolderMultiplicty1Guideline.forEligiblePosition4}</li>
	 * </ul>
	 */
	public static final MMConstraint<EligiblePosition6> forEligiblePosition6 = new MMConstraint<EligiblePosition6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsHolderMultiplicty1Guideline";
			definition = "It is recommended that RightsHolder can only be repetitive in the case of joint ownership.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRightsHolderMultiplicty1Guideline.forEligiblePosition4;
			owner_lazy = () -> EligiblePosition6.mmObject();
		}

		@Override
		public void executeValidator(EligiblePosition6 obj) throws Exception {
			checkEligiblePosition6(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus10
	 * DetailedInstructionStatus10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RightsHolderMultiplicty1Guideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is recommended that RightsHolder can only be repetitive in the case of joint ownership."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRightsHolderMultiplicty1Guideline#forDetailedInstructionStatus9
	 * ConstraintRightsHolderMultiplicty1Guideline.forDetailedInstructionStatus9
	 * }</li>
	 * </ul>
	 */
	public static final MMConstraint<DetailedInstructionStatus10> forDetailedInstructionStatus10 = new MMConstraint<DetailedInstructionStatus10>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsHolderMultiplicty1Guideline";
			definition = "It is recommended that RightsHolder can only be repetitive in the case of joint ownership.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRightsHolderMultiplicty1Guideline.forDetailedInstructionStatus9;
			owner_lazy = () -> DetailedInstructionStatus10.mmObject();
		}

		@Override
		public void executeValidator(DetailedInstructionStatus10 obj) throws Exception {
			checkDetailedInstructionStatus10(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount3
	 * SafekeepingAccount3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RightsHolderMultiplicty1Guideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is recommended that RightsHolder can only be repetitive in case of joint ownership."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SafekeepingAccount3> forSafekeepingAccount3 = new MMConstraint<SafekeepingAccount3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsHolderMultiplicty1Guideline";
			definition = "It is recommended that RightsHolder can only be repetitive in case of joint ownership.";
			owner_lazy = () -> SafekeepingAccount3.mmObject();
		}

		@Override
		public void executeValidator(SafekeepingAccount3 obj) throws Exception {
			checkSafekeepingAccount3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.EligiblePosition4
	 * EligiblePosition4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RightsHolderMultiplicty1Guideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is recommended that RightsHolder can only be repetitive in case of joint ownership."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRightsHolderMultiplicty1Guideline#forEligiblePosition6
	 * ConstraintRightsHolderMultiplicty1Guideline.forEligiblePosition6}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<EligiblePosition4> forEligiblePosition4 = new MMConstraint<EligiblePosition4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsHolderMultiplicty1Guideline";
			definition = "It is recommended that RightsHolder can only be repetitive in case of joint ownership.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRightsHolderMultiplicty1Guideline.forEligiblePosition6);
			owner_lazy = () -> EligiblePosition4.mmObject();
		}

		@Override
		public void executeValidator(EligiblePosition4 obj) throws Exception {
			checkEligiblePosition4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount4
	 * SafekeepingAccount4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RightsHolderMultiplicty1Guideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is recommended that RightsHolder can only be repetitive in case of joint ownership."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRightsHolderMultiplicty1Guideline#forSafekeepingAccount6
	 * ConstraintRightsHolderMultiplicty1Guideline.forSafekeepingAccount6}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SafekeepingAccount4> forSafekeepingAccount4 = new MMConstraint<SafekeepingAccount4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsHolderMultiplicty1Guideline";
			definition = "It is recommended that RightsHolder can only be repetitive in case of joint ownership.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRightsHolderMultiplicty1Guideline.forSafekeepingAccount6);
			owner_lazy = () -> SafekeepingAccount4.mmObject();
		}

		@Override
		public void executeValidator(SafekeepingAccount4 obj) throws Exception {
			checkSafekeepingAccount4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus2
	 * DetailedInstructionStatus2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RightsHolderMultiplicty1Guideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is recommended that RightsHolder can only be repetitive in case of joint ownership."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<DetailedInstructionStatus2> forDetailedInstructionStatus2 = new MMConstraint<DetailedInstructionStatus2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsHolderMultiplicty1Guideline";
			definition = "It is recommended that RightsHolder can only be repetitive in case of joint ownership.";
			owner_lazy = () -> DetailedInstructionStatus2.mmObject();
		}

		@Override
		public void executeValidator(DetailedInstructionStatus2 obj) throws Exception {
			checkDetailedInstructionStatus2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount6
	 * SafekeepingAccount6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RightsHolderMultiplicty1Guideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is recommended that RightsHolder can only be repetitive in case of joint ownership."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRightsHolderMultiplicty1Guideline#forSafekeepingAccount4
	 * ConstraintRightsHolderMultiplicty1Guideline.forSafekeepingAccount4}</li>
	 * </ul>
	 */
	public static final MMConstraint<SafekeepingAccount6> forSafekeepingAccount6 = new MMConstraint<SafekeepingAccount6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsHolderMultiplicty1Guideline";
			definition = "It is recommended that RightsHolder can only be repetitive in case of joint ownership.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRightsHolderMultiplicty1Guideline.forSafekeepingAccount4;
			owner_lazy = () -> SafekeepingAccount6.mmObject();
		}

		@Override
		public void executeValidator(SafekeepingAccount6 obj) throws Exception {
			checkSafekeepingAccount6(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.EligiblePosition5
	 * EligiblePosition5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RightsHolderMultiplicty1Guideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is recommended that RightsHolder can only be repetitive in the case of joint ownership."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRightsHolderMultiplicty1Guideline#forEligiblePosition3
	 * ConstraintRightsHolderMultiplicty1Guideline.forEligiblePosition3}</li>
	 * </ul>
	 */
	public static final MMConstraint<EligiblePosition5> forEligiblePosition5 = new MMConstraint<EligiblePosition5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsHolderMultiplicty1Guideline";
			definition = "It is recommended that RightsHolder can only be repetitive in the case of joint ownership.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRightsHolderMultiplicty1Guideline.forEligiblePosition3;
			owner_lazy = () -> EligiblePosition5.mmObject();
		}

		@Override
		public void executeValidator(EligiblePosition5 obj) throws Exception {
			checkEligiblePosition5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.EligiblePosition3
	 * EligiblePosition3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RightsHolderMultiplicty1Guideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is recommended that RightsHolder can only be repetitive in case of joint ownership."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRightsHolderMultiplicty1Guideline#forEligiblePosition5
	 * ConstraintRightsHolderMultiplicty1Guideline.forEligiblePosition5}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<EligiblePosition3> forEligiblePosition3 = new MMConstraint<EligiblePosition3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsHolderMultiplicty1Guideline";
			definition = "It is recommended that RightsHolder can only be repetitive in case of joint ownership.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRightsHolderMultiplicty1Guideline.forEligiblePosition5);
			owner_lazy = () -> EligiblePosition3.mmObject();
		}

		@Override
		public void executeValidator(EligiblePosition3 obj) throws Exception {
			checkEligiblePosition3(obj);
		}
	};

	/**
	 * It is recommended that RightsHolder can only be repetitive in case of
	 * joint ownership.
	 */
	public static void checkEligiblePosition2(EligiblePosition2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended that RightsHolder can only be repetitive in case of
	 * joint ownership.
	 */
	public static void checkDetailedInstructionStatus9(DetailedInstructionStatus9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended that RightsHolder can only be repetitive in the case of
	 * joint ownership.
	 */
	public static void checkEligiblePosition6(EligiblePosition6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended that RightsHolder can only be repetitive in the case of
	 * joint ownership.
	 */
	public static void checkDetailedInstructionStatus10(DetailedInstructionStatus10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended that RightsHolder can only be repetitive in case of
	 * joint ownership.
	 */
	public static void checkSafekeepingAccount3(SafekeepingAccount3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended that RightsHolder can only be repetitive in case of
	 * joint ownership.
	 */
	public static void checkEligiblePosition4(EligiblePosition4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended that RightsHolder can only be repetitive in case of
	 * joint ownership.
	 */
	public static void checkSafekeepingAccount4(SafekeepingAccount4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended that RightsHolder can only be repetitive in case of
	 * joint ownership.
	 */
	public static void checkDetailedInstructionStatus2(DetailedInstructionStatus2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended that RightsHolder can only be repetitive in case of
	 * joint ownership.
	 */
	public static void checkSafekeepingAccount6(SafekeepingAccount6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended that RightsHolder can only be repetitive in the case of
	 * joint ownership.
	 */
	public static void checkEligiblePosition5(EligiblePosition5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended that RightsHolder can only be repetitive in case of
	 * joint ownership.
	 */
	public static void checkEligiblePosition3(EligiblePosition3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}