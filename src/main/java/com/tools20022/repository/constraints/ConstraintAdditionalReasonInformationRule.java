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
 * The AdditionalReasonInformation element must not contain information that can
 * be provided in a structured field unless bilaterally agreed.
 */
public class ConstraintAdditionalReasonInformationRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ProprietaryReason3
	 * ProprietaryReason3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ProprietaryReason3> forProprietaryReason3 = new MMConstraint<ProprietaryReason3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInformationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> ProprietaryReason3.mmObject();
		}

		@Override
		public void executeValidator(ProprietaryReason3 obj) throws Exception {
			checkProprietaryReason3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AcceptedStatusReason4
	 * AcceptedStatusReason4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalReasonInformationRule#forAcceptedStatusReason8
	 * ConstraintAdditionalReasonInformationRule.forAcceptedStatusReason8}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule#forAcceptedStatusReason1
	 * ConstraintAdditionalReasonInforrmationRule.forAcceptedStatusReason1}</li>
	 * </ul>
	 */
	public static final MMConstraint<AcceptedStatusReason4> forAcceptedStatusReason4 = new MMConstraint<AcceptedStatusReason4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInformationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalReasonInformationRule.forAcceptedStatusReason8);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule.forAcceptedStatusReason1;
			owner_lazy = () -> AcceptedStatusReason4.mmObject();
		}

		@Override
		public void executeValidator(AcceptedStatusReason4 obj) throws Exception {
			checkAcceptedStatusReason4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AcceptedStatusReason6
	 * AcceptedStatusReason6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AcceptedStatusReason6> forAcceptedStatusReason6 = new MMConstraint<AcceptedStatusReason6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInformationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> AcceptedStatusReason6.mmObject();
		}

		@Override
		public void executeValidator(AcceptedStatusReason6 obj) throws Exception {
			checkAcceptedStatusReason6(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason5
	 * ProprietaryStatusAndReason5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ProprietaryStatusAndReason5> forProprietaryStatusAndReason5 = new MMConstraint<ProprietaryStatusAndReason5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInformationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> ProprietaryStatusAndReason5.mmObject();
		}

		@Override
		public void executeValidator(ProprietaryStatusAndReason5 obj) throws Exception {
			checkProprietaryStatusAndReason5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReceivedStatusReason1
	 * ReceivedStatusReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ReceivedStatusReason1> forReceivedStatusReason1 = new MMConstraint<ReceivedStatusReason1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInformationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> ReceivedStatusReason1.mmObject();
		}

		@Override
		public void executeValidator(ReceivedStatusReason1 obj) throws Exception {
			checkReceivedStatusReason1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PendingProcessingStatusReason1
	 * PendingProcessingStatusReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PendingProcessingStatusReason1> forPendingProcessingStatusReason1 = new MMConstraint<PendingProcessingStatusReason1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInformationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> PendingProcessingStatusReason1.mmObject();
		}

		@Override
		public void executeValidator(PendingProcessingStatusReason1 obj) throws Exception {
			checkPendingProcessingStatusReason1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AcceptedStatusReason7
	 * AcceptedStatusReason7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AcceptedStatusReason7> forAcceptedStatusReason7 = new MMConstraint<AcceptedStatusReason7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInformationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> AcceptedStatusReason7.mmObject();
		}

		@Override
		public void executeValidator(AcceptedStatusReason7 obj) throws Exception {
			checkAcceptedStatusReason7(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason12
	 * RejectedStatusReason12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RejectedStatusReason12> forRejectedStatusReason12 = new MMConstraint<RejectedStatusReason12>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInformationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> RejectedStatusReason12.mmObject();
		}

		@Override
		public void executeValidator(RejectedStatusReason12 obj) throws Exception {
			checkRejectedStatusReason12(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AcceptedStatusReason8
	 * AcceptedStatusReason8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalReasonInformationRule#forAcceptedStatusReason4
	 * ConstraintAdditionalReasonInformationRule.forAcceptedStatusReason4}</li>
	 * </ul>
	 */
	public static final MMConstraint<AcceptedStatusReason8> forAcceptedStatusReason8 = new MMConstraint<AcceptedStatusReason8>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInformationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalReasonInformationRule.forAcceptedStatusReason4;
			owner_lazy = () -> AcceptedStatusReason8.mmObject();
		}

		@Override
		public void executeValidator(AcceptedStatusReason8 obj) throws Exception {
			checkAcceptedStatusReason8(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AcceptedStatusReason11
	 * AcceptedStatusReason11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AcceptedStatusReason11> forAcceptedStatusReason11 = new MMConstraint<AcceptedStatusReason11>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInformationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> AcceptedStatusReason11.mmObject();
		}

		@Override
		public void executeValidator(AcceptedStatusReason11 obj) throws Exception {
			checkAcceptedStatusReason11(obj);
		}
	};

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkProprietaryReason3(ProprietaryReason3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkAcceptedStatusReason4(AcceptedStatusReason4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkAcceptedStatusReason6(AcceptedStatusReason6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkProprietaryStatusAndReason5(ProprietaryStatusAndReason5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkReceivedStatusReason1(ReceivedStatusReason1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkPendingProcessingStatusReason1(PendingProcessingStatusReason1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkAcceptedStatusReason7(AcceptedStatusReason7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkRejectedStatusReason12(RejectedStatusReason12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkAcceptedStatusReason8(AcceptedStatusReason8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkAcceptedStatusReason11(AcceptedStatusReason11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}