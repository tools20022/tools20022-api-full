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
public class ConstraintAdditionalReasonInforrmationRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason2
	 * PendingStatusReason2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule#forPendingStatusReason9
	 * ConstraintAdditionalReasonInforrmationRule.forPendingStatusReason9}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PendingStatusReason2> forPendingStatusReason2 = new MMConstraint<PendingStatusReason2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInforrmationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule.forPendingStatusReason9);
			owner_lazy = () -> PendingStatusReason2.mmObject();
		}

		@Override
		public void executeValidator(PendingStatusReason2 obj) throws Exception {
			checkPendingStatusReason2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason16
	 * RejectedStatusReason16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<RejectedStatusReason16> forRejectedStatusReason16 = new MMConstraint<RejectedStatusReason16>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInforrmationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> RejectedStatusReason16.mmObject();
		}

		@Override
		public void executeValidator(RejectedStatusReason16 obj) throws Exception {
			checkRejectedStatusReason16(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AcceptedStatusReason2
	 * AcceptedStatusReason2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<AcceptedStatusReason2> forAcceptedStatusReason2 = new MMConstraint<AcceptedStatusReason2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInforrmationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> AcceptedStatusReason2.mmObject();
		}

		@Override
		public void executeValidator(AcceptedStatusReason2 obj) throws Exception {
			checkAcceptedStatusReason2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PendingCancellationStatusReason1
	 * PendingCancellationStatusReason1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<PendingCancellationStatusReason1> forPendingCancellationStatusReason1 = new MMConstraint<PendingCancellationStatusReason1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInforrmationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> PendingCancellationStatusReason1.mmObject();
		}

		@Override
		public void executeValidator(PendingCancellationStatusReason1 obj) throws Exception {
			checkPendingCancellationStatusReason1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionReversalReason4
	 * CorporateActionReversalReason4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionReversalReason4> forCorporateActionReversalReason4 = new MMConstraint<CorporateActionReversalReason4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInforrmationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> CorporateActionReversalReason4.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionReversalReason4 obj) throws Exception {
			checkCorporateActionReversalReason4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CancelledStatusReason10
	 * CancelledStatusReason10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CancelledStatusReason10> forCancelledStatusReason10 = new MMConstraint<CancelledStatusReason10>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInforrmationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> CancelledStatusReason10.mmObject();
		}

		@Override
		public void executeValidator(CancelledStatusReason10 obj) throws Exception {
			checkCancelledStatusReason10(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AcceptedStatusReason5
	 * AcceptedStatusReason5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<AcceptedStatusReason5> forAcceptedStatusReason5 = new MMConstraint<AcceptedStatusReason5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInforrmationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> AcceptedStatusReason5.mmObject();
		}

		@Override
		public void executeValidator(AcceptedStatusReason5 obj) throws Exception {
			checkAcceptedStatusReason5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionReversalReason1
	 * CorporateActionReversalReason1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule#forCorporateActionReversalReason3
	 * ConstraintAdditionalReasonInforrmationRule.
	 * forCorporateActionReversalReason3}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionReversalReason1> forCorporateActionReversalReason1 = new MMConstraint<CorporateActionReversalReason1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInforrmationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule.forCorporateActionReversalReason3);
			owner_lazy = () -> CorporateActionReversalReason1.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionReversalReason1 obj) throws Exception {
			checkCorporateActionReversalReason1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PendingCancellationStatusReason5
	 * PendingCancellationStatusReason5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule#forPendingCancellationStatusReason7
	 * ConstraintAdditionalReasonInforrmationRule.
	 * forPendingCancellationStatusReason7}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule#forPendingCancellationStatusReason3
	 * ConstraintAdditionalReasonInforrmationRule.
	 * forPendingCancellationStatusReason3}</li>
	 * </ul>
	 */
	public static final MMConstraint<PendingCancellationStatusReason5> forPendingCancellationStatusReason5 = new MMConstraint<PendingCancellationStatusReason5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInforrmationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule.forPendingCancellationStatusReason7);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule.forPendingCancellationStatusReason3;
			owner_lazy = () -> PendingCancellationStatusReason5.mmObject();
		}

		@Override
		public void executeValidator(PendingCancellationStatusReason5 obj) throws Exception {
			checkPendingCancellationStatusReason5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PendingCancellationStatusReason3
	 * PendingCancellationStatusReason3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule#forPendingCancellationStatusReason5
	 * ConstraintAdditionalReasonInforrmationRule.
	 * forPendingCancellationStatusReason5}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PendingCancellationStatusReason3> forPendingCancellationStatusReason3 = new MMConstraint<PendingCancellationStatusReason3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInforrmationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule.forPendingCancellationStatusReason5);
			owner_lazy = () -> PendingCancellationStatusReason3.mmObject();
		}

		@Override
		public void executeValidator(PendingCancellationStatusReason3 obj) throws Exception {
			checkPendingCancellationStatusReason3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason12
	 * PendingStatusReason12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<PendingStatusReason12> forPendingStatusReason12 = new MMConstraint<PendingStatusReason12>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInforrmationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> PendingStatusReason12.mmObject();
		}

		@Override
		public void executeValidator(PendingStatusReason12 obj) throws Exception {
			checkPendingStatusReason12(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason8
	 * PendingStatusReason8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<PendingStatusReason8> forPendingStatusReason8 = new MMConstraint<PendingStatusReason8>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInforrmationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> PendingStatusReason8.mmObject();
		}

		@Override
		public void executeValidator(PendingStatusReason8 obj) throws Exception {
			checkPendingStatusReason8(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CancelledStatusReason14
	 * CancelledStatusReason14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CancelledStatusReason14> forCancelledStatusReason14 = new MMConstraint<CancelledStatusReason14>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInforrmationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> CancelledStatusReason14.mmObject();
		}

		@Override
		public void executeValidator(CancelledStatusReason14 obj) throws Exception {
			checkCancelledStatusReason14(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason9
	 * PendingStatusReason9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule#forPendingStatusReason2
	 * ConstraintAdditionalReasonInforrmationRule.forPendingStatusReason2}</li>
	 * </ul>
	 */
	public static final MMConstraint<PendingStatusReason9> forPendingStatusReason9 = new MMConstraint<PendingStatusReason9>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInforrmationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule.forPendingStatusReason2;
			owner_lazy = () -> PendingStatusReason9.mmObject();
		}

		@Override
		public void executeValidator(PendingStatusReason9 obj) throws Exception {
			checkPendingStatusReason9(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason9
	 * RejectedStatusReason9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<RejectedStatusReason9> forRejectedStatusReason9 = new MMConstraint<RejectedStatusReason9>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInforrmationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> RejectedStatusReason9.mmObject();
		}

		@Override
		public void executeValidator(RejectedStatusReason9 obj) throws Exception {
			checkRejectedStatusReason9(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AcceptedStatusReason10
	 * AcceptedStatusReason10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<AcceptedStatusReason10> forAcceptedStatusReason10 = new MMConstraint<AcceptedStatusReason10>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInforrmationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> AcceptedStatusReason10.mmObject();
		}

		@Override
		public void executeValidator(AcceptedStatusReason10 obj) throws Exception {
			checkAcceptedStatusReason10(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason11
	 * PendingStatusReason11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<PendingStatusReason11> forPendingStatusReason11 = new MMConstraint<PendingStatusReason11>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInforrmationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> PendingStatusReason11.mmObject();
		}

		@Override
		public void executeValidator(PendingStatusReason11 obj) throws Exception {
			checkPendingStatusReason11(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CancelledStatusReason5
	 * CancelledStatusReason5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CancelledStatusReason5> forCancelledStatusReason5 = new MMConstraint<CancelledStatusReason5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInforrmationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> CancelledStatusReason5.mmObject();
		}

		@Override
		public void executeValidator(CancelledStatusReason5 obj) throws Exception {
			checkCancelledStatusReason5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason22
	 * RejectedStatusReason22}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<RejectedStatusReason22> forRejectedStatusReason22 = new MMConstraint<RejectedStatusReason22>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInforrmationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> RejectedStatusReason22.mmObject();
		}

		@Override
		public void executeValidator(RejectedStatusReason22 obj) throws Exception {
			checkRejectedStatusReason22(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PendingCancellationStatusReason8
	 * PendingCancellationStatusReason8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<PendingCancellationStatusReason8> forPendingCancellationStatusReason8 = new MMConstraint<PendingCancellationStatusReason8>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInforrmationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> PendingCancellationStatusReason8.mmObject();
		}

		@Override
		public void executeValidator(PendingCancellationStatusReason8 obj) throws Exception {
			checkPendingCancellationStatusReason8(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason3
	 * PendingStatusReason3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<PendingStatusReason3> forPendingStatusReason3 = new MMConstraint<PendingStatusReason3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInforrmationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> PendingStatusReason3.mmObject();
		}

		@Override
		public void executeValidator(PendingStatusReason3 obj) throws Exception {
			checkPendingStatusReason3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CancelledStatusReason7
	 * CancelledStatusReason7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CancelledStatusReason7> forCancelledStatusReason7 = new MMConstraint<CancelledStatusReason7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInforrmationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> CancelledStatusReason7.mmObject();
		}

		@Override
		public void executeValidator(CancelledStatusReason7 obj) throws Exception {
			checkCancelledStatusReason7(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CancelledStatusReason11
	 * CancelledStatusReason11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule#forCancelledStatusReason4
	 * ConstraintAdditionalReasonInforrmationRule.forCancelledStatusReason4}</li>
	 * </ul>
	 */
	public static final MMConstraint<CancelledStatusReason11> forCancelledStatusReason11 = new MMConstraint<CancelledStatusReason11>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInforrmationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule.forCancelledStatusReason4;
			owner_lazy = () -> CancelledStatusReason11.mmObject();
		}

		@Override
		public void executeValidator(CancelledStatusReason11 obj) throws Exception {
			checkCancelledStatusReason11(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason13
	 * PendingStatusReason13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule#forPendingStatusReason10
	 * ConstraintAdditionalReasonInforrmationRule.forPendingStatusReason10}</li>
	 * </ul>
	 */
	public static final MMConstraint<PendingStatusReason13> forPendingStatusReason13 = new MMConstraint<PendingStatusReason13>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInforrmationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule.forPendingStatusReason10;
			owner_lazy = () -> PendingStatusReason13.mmObject();
		}

		@Override
		public void executeValidator(PendingStatusReason13 obj) throws Exception {
			checkPendingStatusReason13(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CancelledStatusReason4
	 * CancelledStatusReason4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule#forCancelledStatusReason11
	 * ConstraintAdditionalReasonInforrmationRule.forCancelledStatusReason11}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CancelledStatusReason4> forCancelledStatusReason4 = new MMConstraint<CancelledStatusReason4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInforrmationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule.forCancelledStatusReason11);
			owner_lazy = () -> CancelledStatusReason4.mmObject();
		}

		@Override
		public void executeValidator(CancelledStatusReason4 obj) throws Exception {
			checkCancelledStatusReason4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason13
	 * RejectedStatusReason13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule#forRejectedStatusReason17
	 * ConstraintAdditionalReasonInforrmationRule.forRejectedStatusReason17}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule#forRejectedStatusReason10
	 * ConstraintAdditionalReasonInforrmationRule.forRejectedStatusReason10}</li>
	 * </ul>
	 */
	public static final MMConstraint<RejectedStatusReason13> forRejectedStatusReason13 = new MMConstraint<RejectedStatusReason13>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInforrmationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule.forRejectedStatusReason17);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule.forRejectedStatusReason10;
			owner_lazy = () -> RejectedStatusReason13.mmObject();
		}

		@Override
		public void executeValidator(RejectedStatusReason13 obj) throws Exception {
			checkRejectedStatusReason13(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason5
	 * PendingStatusReason5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule#forPendingStatusReason7
	 * ConstraintAdditionalReasonInforrmationRule.forPendingStatusReason7}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule#forPendingStatusReason1
	 * ConstraintAdditionalReasonInforrmationRule.forPendingStatusReason1}</li>
	 * </ul>
	 */
	public static final MMConstraint<PendingStatusReason5> forPendingStatusReason5 = new MMConstraint<PendingStatusReason5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInforrmationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule.forPendingStatusReason7);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule.forPendingStatusReason1;
			owner_lazy = () -> PendingStatusReason5.mmObject();
		}

		@Override
		public void executeValidator(PendingStatusReason5 obj) throws Exception {
			checkPendingStatusReason5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CancelledStatusReason9
	 * CancelledStatusReason9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CancelledStatusReason9> forCancelledStatusReason9 = new MMConstraint<CancelledStatusReason9>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInforrmationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> CancelledStatusReason9.mmObject();
		}

		@Override
		public void executeValidator(CancelledStatusReason9 obj) throws Exception {
			checkCancelledStatusReason9(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CancelledStatusReason8
	 * CancelledStatusReason8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule#forCancelledStatusReason12
	 * ConstraintAdditionalReasonInforrmationRule.forCancelledStatusReason12}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule#forCancelledStatusReason6
	 * ConstraintAdditionalReasonInforrmationRule.forCancelledStatusReason6}</li>
	 * </ul>
	 */
	public static final MMConstraint<CancelledStatusReason8> forCancelledStatusReason8 = new MMConstraint<CancelledStatusReason8>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInforrmationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule.forCancelledStatusReason12);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule.forCancelledStatusReason6;
			owner_lazy = () -> CancelledStatusReason8.mmObject();
		}

		@Override
		public void executeValidator(CancelledStatusReason8 obj) throws Exception {
			checkCancelledStatusReason8(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason19
	 * RejectedStatusReason19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<RejectedStatusReason19> forRejectedStatusReason19 = new MMConstraint<RejectedStatusReason19>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInforrmationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> RejectedStatusReason19.mmObject();
		}

		@Override
		public void executeValidator(RejectedStatusReason19 obj) throws Exception {
			checkRejectedStatusReason19(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PendingCancellationStatusReason4
	 * PendingCancellationStatusReason4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<PendingCancellationStatusReason4> forPendingCancellationStatusReason4 = new MMConstraint<PendingCancellationStatusReason4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInforrmationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> PendingCancellationStatusReason4.mmObject();
		}

		@Override
		public void executeValidator(PendingCancellationStatusReason4 obj) throws Exception {
			checkPendingCancellationStatusReason4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason11
	 * RejectedStatusReason11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<RejectedStatusReason11> forRejectedStatusReason11 = new MMConstraint<RejectedStatusReason11>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInforrmationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> RejectedStatusReason11.mmObject();
		}

		@Override
		public void executeValidator(RejectedStatusReason11 obj) throws Exception {
			checkRejectedStatusReason11(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason15
	 * PendingStatusReason15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<PendingStatusReason15> forPendingStatusReason15 = new MMConstraint<PendingStatusReason15>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInforrmationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> PendingStatusReason15.mmObject();
		}

		@Override
		public void executeValidator(PendingStatusReason15 obj) throws Exception {
			checkPendingStatusReason15(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ProprietaryReason2
	 * ProprietaryReason2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<ProprietaryReason2> forProprietaryReason2 = new MMConstraint<ProprietaryReason2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInforrmationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> ProprietaryReason2.mmObject();
		}

		@Override
		public void executeValidator(ProprietaryReason2 obj) throws Exception {
			checkProprietaryReason2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason21
	 * RejectedStatusReason21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule#forRejectedStatusReason17
	 * ConstraintAdditionalReasonInforrmationRule.forRejectedStatusReason17}</li>
	 * </ul>
	 */
	public static final MMConstraint<RejectedStatusReason21> forRejectedStatusReason21 = new MMConstraint<RejectedStatusReason21>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInforrmationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule.forRejectedStatusReason17;
			owner_lazy = () -> RejectedStatusReason21.mmObject();
		}

		@Override
		public void executeValidator(RejectedStatusReason21 obj) throws Exception {
			checkRejectedStatusReason21(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason15
	 * RejectedStatusReason15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<RejectedStatusReason15> forRejectedStatusReason15 = new MMConstraint<RejectedStatusReason15>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInforrmationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> RejectedStatusReason15.mmObject();
		}

		@Override
		public void executeValidator(RejectedStatusReason15 obj) throws Exception {
			checkRejectedStatusReason15(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CancelledStatusReason12
	 * CancelledStatusReason12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule#forCancelledStatusReason8
	 * ConstraintAdditionalReasonInforrmationRule.forCancelledStatusReason8}</li>
	 * </ul>
	 */
	public static final MMConstraint<CancelledStatusReason12> forCancelledStatusReason12 = new MMConstraint<CancelledStatusReason12>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInforrmationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule.forCancelledStatusReason8;
			owner_lazy = () -> CancelledStatusReason12.mmObject();
		}

		@Override
		public void executeValidator(CancelledStatusReason12 obj) throws Exception {
			checkCancelledStatusReason12(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AcceptedStatusReason9
	 * AcceptedStatusReason9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule#forAcceptedStatusReason3
	 * ConstraintAdditionalReasonInforrmationRule.forAcceptedStatusReason3}</li>
	 * </ul>
	 */
	public static final MMConstraint<AcceptedStatusReason9> forAcceptedStatusReason9 = new MMConstraint<AcceptedStatusReason9>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInforrmationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule.forAcceptedStatusReason3;
			owner_lazy = () -> AcceptedStatusReason9.mmObject();
		}

		@Override
		public void executeValidator(AcceptedStatusReason9 obj) throws Exception {
			checkAcceptedStatusReason9(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason10
	 * RejectedStatusReason10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule#forRejectedStatusReason13
	 * ConstraintAdditionalReasonInforrmationRule.forRejectedStatusReason13}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule#forRejectedStatusReason8
	 * ConstraintAdditionalReasonInforrmationRule.forRejectedStatusReason8}</li>
	 * </ul>
	 */
	public static final MMConstraint<RejectedStatusReason10> forRejectedStatusReason10 = new MMConstraint<RejectedStatusReason10>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInforrmationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule.forRejectedStatusReason13);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule.forRejectedStatusReason8;
			owner_lazy = () -> RejectedStatusReason10.mmObject();
		}

		@Override
		public void executeValidator(RejectedStatusReason10 obj) throws Exception {
			checkRejectedStatusReason10(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason4
	 * PendingStatusReason4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<PendingStatusReason4> forPendingStatusReason4 = new MMConstraint<PendingStatusReason4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInforrmationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> PendingStatusReason4.mmObject();
		}

		@Override
		public void executeValidator(PendingStatusReason4 obj) throws Exception {
			checkPendingStatusReason4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PendingCancellationStatusReason7
	 * PendingCancellationStatusReason7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule#forPendingCancellationStatusReason5
	 * ConstraintAdditionalReasonInforrmationRule.
	 * forPendingCancellationStatusReason5}</li>
	 * </ul>
	 */
	public static final MMConstraint<PendingCancellationStatusReason7> forPendingCancellationStatusReason7 = new MMConstraint<PendingCancellationStatusReason7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInforrmationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule.forPendingCancellationStatusReason5;
			owner_lazy = () -> PendingCancellationStatusReason7.mmObject();
		}

		@Override
		public void executeValidator(PendingCancellationStatusReason7 obj) throws Exception {
			checkPendingCancellationStatusReason7(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason18
	 * RejectedStatusReason18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule#forRejectedStatusReason14
	 * ConstraintAdditionalReasonInforrmationRule.forRejectedStatusReason14}</li>
	 * </ul>
	 */
	public static final MMConstraint<RejectedStatusReason18> forRejectedStatusReason18 = new MMConstraint<RejectedStatusReason18>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInforrmationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule.forRejectedStatusReason14;
			owner_lazy = () -> RejectedStatusReason18.mmObject();
		}

		@Override
		public void executeValidator(RejectedStatusReason18 obj) throws Exception {
			checkRejectedStatusReason18(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ProprietaryReason5
	 * ProprietaryReason5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<ProprietaryReason5> forProprietaryReason5 = new MMConstraint<ProprietaryReason5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInforrmationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> ProprietaryReason5.mmObject();
		}

		@Override
		public void executeValidator(ProprietaryReason5 obj) throws Exception {
			checkProprietaryReason5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason17
	 * RejectedStatusReason17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule#forRejectedStatusReason21
	 * ConstraintAdditionalReasonInforrmationRule.forRejectedStatusReason21}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule#forRejectedStatusReason13
	 * ConstraintAdditionalReasonInforrmationRule.forRejectedStatusReason13}</li>
	 * </ul>
	 */
	public static final MMConstraint<RejectedStatusReason17> forRejectedStatusReason17 = new MMConstraint<RejectedStatusReason17>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInforrmationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule.forRejectedStatusReason21);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule.forRejectedStatusReason13;
			owner_lazy = () -> RejectedStatusReason17.mmObject();
		}

		@Override
		public void executeValidator(RejectedStatusReason17 obj) throws Exception {
			checkRejectedStatusReason17(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason6
	 * PendingStatusReason6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<PendingStatusReason6> forPendingStatusReason6 = new MMConstraint<PendingStatusReason6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInforrmationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> PendingStatusReason6.mmObject();
		}

		@Override
		public void executeValidator(PendingStatusReason6 obj) throws Exception {
			checkPendingStatusReason6(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason10
	 * StatusAndReason10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<StatusAndReason10> forStatusAndReason10 = new MMConstraint<StatusAndReason10>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInforrmationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> StatusAndReason10.mmObject();
		}

		@Override
		public void executeValidator(StatusAndReason10 obj) throws Exception {
			checkStatusAndReason10(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AcceptedStatusReason1
	 * AcceptedStatusReason1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule#forAcceptedStatusReason3
	 * ConstraintAdditionalReasonInforrmationRule.forAcceptedStatusReason3}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalReasonInformationRule#forAcceptedStatusReason4
	 * ConstraintAdditionalReasonInformationRule.forAcceptedStatusReason4}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AcceptedStatusReason1> forAcceptedStatusReason1 = new MMConstraint<AcceptedStatusReason1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInforrmationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule.forAcceptedStatusReason3,
					com.tools20022.repository.constraints.ConstraintAdditionalReasonInformationRule.forAcceptedStatusReason4);
			owner_lazy = () -> AcceptedStatusReason1.mmObject();
		}

		@Override
		public void executeValidator(AcceptedStatusReason1 obj) throws Exception {
			checkAcceptedStatusReason1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason20
	 * RejectedStatusReason20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<RejectedStatusReason20> forRejectedStatusReason20 = new MMConstraint<RejectedStatusReason20>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInforrmationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> RejectedStatusReason20.mmObject();
		}

		@Override
		public void executeValidator(RejectedStatusReason20 obj) throws Exception {
			checkRejectedStatusReason20(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ProprietaryReason4
	 * ProprietaryReason4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule#forProprietaryReason1
	 * ConstraintAdditionalReasonInforrmationRule.forProprietaryReason1}</li>
	 * </ul>
	 */
	public static final MMConstraint<ProprietaryReason4> forProprietaryReason4 = new MMConstraint<ProprietaryReason4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInforrmationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule.forProprietaryReason1;
			owner_lazy = () -> ProprietaryReason4.mmObject();
		}

		@Override
		public void executeValidator(ProprietaryReason4 obj) throws Exception {
			checkProprietaryReason4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CancelledStatusReason13
	 * CancelledStatusReason13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CancelledStatusReason13> forCancelledStatusReason13 = new MMConstraint<CancelledStatusReason13>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInforrmationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> CancelledStatusReason13.mmObject();
		}

		@Override
		public void executeValidator(CancelledStatusReason13 obj) throws Exception {
			checkCancelledStatusReason13(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PendingCancellationStatusReason2
	 * PendingCancellationStatusReason2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<PendingCancellationStatusReason2> forPendingCancellationStatusReason2 = new MMConstraint<PendingCancellationStatusReason2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInforrmationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> PendingCancellationStatusReason2.mmObject();
		}

		@Override
		public void executeValidator(PendingCancellationStatusReason2 obj) throws Exception {
			checkPendingCancellationStatusReason2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason1
	 * PendingStatusReason1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule#forPendingStatusReason5
	 * ConstraintAdditionalReasonInforrmationRule.forPendingStatusReason5}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PendingStatusReason1> forPendingStatusReason1 = new MMConstraint<PendingStatusReason1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInforrmationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule.forPendingStatusReason5);
			owner_lazy = () -> PendingStatusReason1.mmObject();
		}

		@Override
		public void executeValidator(PendingStatusReason1 obj) throws Exception {
			checkPendingStatusReason1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PendingCancellationStatusReason6
	 * PendingCancellationStatusReason6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<PendingCancellationStatusReason6> forPendingCancellationStatusReason6 = new MMConstraint<PendingCancellationStatusReason6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInforrmationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> PendingCancellationStatusReason6.mmObject();
		}

		@Override
		public void executeValidator(PendingCancellationStatusReason6 obj) throws Exception {
			checkPendingCancellationStatusReason6(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CancelledStatusReason6
	 * CancelledStatusReason6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule#forCancelledStatusReason8
	 * ConstraintAdditionalReasonInforrmationRule.forCancelledStatusReason8}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CancelledStatusReason6> forCancelledStatusReason6 = new MMConstraint<CancelledStatusReason6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInforrmationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule.forCancelledStatusReason8);
			owner_lazy = () -> CancelledStatusReason6.mmObject();
		}

		@Override
		public void executeValidator(CancelledStatusReason6 obj) throws Exception {
			checkCancelledStatusReason6(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason10
	 * PendingStatusReason10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule#forPendingStatusReason13
	 * ConstraintAdditionalReasonInforrmationRule.forPendingStatusReason13}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule#forPendingStatusReason7
	 * ConstraintAdditionalReasonInforrmationRule.forPendingStatusReason7}</li>
	 * </ul>
	 */
	public static final MMConstraint<PendingStatusReason10> forPendingStatusReason10 = new MMConstraint<PendingStatusReason10>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInforrmationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule.forPendingStatusReason13);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule.forPendingStatusReason7;
			owner_lazy = () -> PendingStatusReason10.mmObject();
		}

		@Override
		public void executeValidator(PendingStatusReason10 obj) throws Exception {
			checkPendingStatusReason10(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AcceptedStatusReason3
	 * AcceptedStatusReason3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule#forAcceptedStatusReason9
	 * ConstraintAdditionalReasonInforrmationRule.forAcceptedStatusReason9}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule#forAcceptedStatusReason1
	 * ConstraintAdditionalReasonInforrmationRule.forAcceptedStatusReason1}</li>
	 * </ul>
	 */
	public static final MMConstraint<AcceptedStatusReason3> forAcceptedStatusReason3 = new MMConstraint<AcceptedStatusReason3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInforrmationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule.forAcceptedStatusReason9);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule.forAcceptedStatusReason1;
			owner_lazy = () -> AcceptedStatusReason3.mmObject();
		}

		@Override
		public void executeValidator(AcceptedStatusReason3 obj) throws Exception {
			checkAcceptedStatusReason3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason8
	 * RejectedStatusReason8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule#forRejectedStatusReason10
	 * ConstraintAdditionalReasonInforrmationRule.forRejectedStatusReason10}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule#forRejectedStatusReason14
	 * ConstraintAdditionalReasonInforrmationRule.forRejectedStatusReason14}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RejectedStatusReason8> forRejectedStatusReason8 = new MMConstraint<RejectedStatusReason8>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInforrmationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule.forRejectedStatusReason10,
					com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule.forRejectedStatusReason14);
			owner_lazy = () -> RejectedStatusReason8.mmObject();
		}

		@Override
		public void executeValidator(RejectedStatusReason8 obj) throws Exception {
			checkRejectedStatusReason8(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason14
	 * RejectedStatusReason14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule#forRejectedStatusReason18
	 * ConstraintAdditionalReasonInforrmationRule.forRejectedStatusReason18}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule#forRejectedStatusReason8
	 * ConstraintAdditionalReasonInforrmationRule.forRejectedStatusReason8}</li>
	 * </ul>
	 */
	public static final MMConstraint<RejectedStatusReason14> forRejectedStatusReason14 = new MMConstraint<RejectedStatusReason14>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInforrmationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule.forRejectedStatusReason18);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule.forRejectedStatusReason8;
			owner_lazy = () -> RejectedStatusReason14.mmObject();
		}

		@Override
		public void executeValidator(RejectedStatusReason14 obj) throws Exception {
			checkRejectedStatusReason14(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionReversalReason3
	 * CorporateActionReversalReason3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule#forCorporateActionReversalReason1
	 * ConstraintAdditionalReasonInforrmationRule.
	 * forCorporateActionReversalReason1}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionReversalReason3> forCorporateActionReversalReason3 = new MMConstraint<CorporateActionReversalReason3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInforrmationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule.forCorporateActionReversalReason1;
			owner_lazy = () -> CorporateActionReversalReason3.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionReversalReason3 obj) throws Exception {
			checkCorporateActionReversalReason3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason7
	 * PendingStatusReason7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule#forPendingStatusReason10
	 * ConstraintAdditionalReasonInforrmationRule.forPendingStatusReason10}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule#forPendingStatusReason5
	 * ConstraintAdditionalReasonInforrmationRule.forPendingStatusReason5}</li>
	 * </ul>
	 */
	public static final MMConstraint<PendingStatusReason7> forPendingStatusReason7 = new MMConstraint<PendingStatusReason7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInforrmationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule.forPendingStatusReason10);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule.forPendingStatusReason5;
			owner_lazy = () -> PendingStatusReason7.mmObject();
		}

		@Override
		public void executeValidator(PendingStatusReason7 obj) throws Exception {
			checkPendingStatusReason7(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ProprietaryReason1
	 * ProprietaryReason1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule#forProprietaryReason4
	 * ConstraintAdditionalReasonInforrmationRule.forProprietaryReason4}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ProprietaryReason1> forProprietaryReason1 = new MMConstraint<ProprietaryReason1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInforrmationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalReasonInforrmationRule.forProprietaryReason4);
			owner_lazy = () -> ProprietaryReason1.mmObject();
		}

		@Override
		public void executeValidator(ProprietaryReason1 obj) throws Exception {
			checkProprietaryReason1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionReversalReason2
	 * CorporateActionReversalReason2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInforrmationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionReversalReason2> forCorporateActionReversalReason2 = new MMConstraint<CorporateActionReversalReason2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInforrmationRule";
			definition = "The AdditionalReasonInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> CorporateActionReversalReason2.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionReversalReason2 obj) throws Exception {
			checkCorporateActionReversalReason2(obj);
		}
	};

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkPendingStatusReason2(PendingStatusReason2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkRejectedStatusReason16(RejectedStatusReason16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkAcceptedStatusReason2(AcceptedStatusReason2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkPendingCancellationStatusReason1(PendingCancellationStatusReason1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkCorporateActionReversalReason4(CorporateActionReversalReason4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkCancelledStatusReason10(CancelledStatusReason10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkAcceptedStatusReason5(AcceptedStatusReason5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkCorporateActionReversalReason1(CorporateActionReversalReason1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkPendingCancellationStatusReason5(PendingCancellationStatusReason5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkPendingCancellationStatusReason3(PendingCancellationStatusReason3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkPendingStatusReason12(PendingStatusReason12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkPendingStatusReason8(PendingStatusReason8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkCancelledStatusReason14(CancelledStatusReason14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkPendingStatusReason9(PendingStatusReason9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkRejectedStatusReason9(RejectedStatusReason9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkAcceptedStatusReason10(AcceptedStatusReason10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkPendingStatusReason11(PendingStatusReason11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkCancelledStatusReason5(CancelledStatusReason5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkRejectedStatusReason22(RejectedStatusReason22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkPendingCancellationStatusReason8(PendingCancellationStatusReason8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkPendingStatusReason3(PendingStatusReason3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkCancelledStatusReason7(CancelledStatusReason7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkCancelledStatusReason11(CancelledStatusReason11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkPendingStatusReason13(PendingStatusReason13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkCancelledStatusReason4(CancelledStatusReason4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkRejectedStatusReason13(RejectedStatusReason13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkPendingStatusReason5(PendingStatusReason5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkCancelledStatusReason9(CancelledStatusReason9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkCancelledStatusReason8(CancelledStatusReason8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkRejectedStatusReason19(RejectedStatusReason19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkPendingCancellationStatusReason4(PendingCancellationStatusReason4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkRejectedStatusReason11(RejectedStatusReason11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkPendingStatusReason15(PendingStatusReason15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkProprietaryReason2(ProprietaryReason2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkRejectedStatusReason21(RejectedStatusReason21 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkRejectedStatusReason15(RejectedStatusReason15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkCancelledStatusReason12(CancelledStatusReason12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkAcceptedStatusReason9(AcceptedStatusReason9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkRejectedStatusReason10(RejectedStatusReason10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkPendingStatusReason4(PendingStatusReason4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkPendingCancellationStatusReason7(PendingCancellationStatusReason7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkRejectedStatusReason18(RejectedStatusReason18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkProprietaryReason5(ProprietaryReason5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkRejectedStatusReason17(RejectedStatusReason17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkPendingStatusReason6(PendingStatusReason6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkStatusAndReason10(StatusAndReason10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkAcceptedStatusReason1(AcceptedStatusReason1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkRejectedStatusReason20(RejectedStatusReason20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkProprietaryReason4(ProprietaryReason4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkCancelledStatusReason13(CancelledStatusReason13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkPendingCancellationStatusReason2(PendingCancellationStatusReason2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkPendingStatusReason1(PendingStatusReason1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkPendingCancellationStatusReason6(PendingCancellationStatusReason6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkCancelledStatusReason6(CancelledStatusReason6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkPendingStatusReason10(PendingStatusReason10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkAcceptedStatusReason3(AcceptedStatusReason3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkRejectedStatusReason8(RejectedStatusReason8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkRejectedStatusReason14(RejectedStatusReason14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkCorporateActionReversalReason3(CorporateActionReversalReason3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkPendingStatusReason7(PendingStatusReason7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkProprietaryReason1(ProprietaryReason1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalReasonInformation element must not contain information that
	 * can be provided in a structured field unless bilaterally agreed.
	 */
	public static void checkCorporateActionReversalReason2(CorporateActionReversalReason2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}