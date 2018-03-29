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
 * If OtherProcessing is used, then its usage must be pre-agreed between the
 * sender and receiver.
 */
public class ConstraintOtherProcessingRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RequestDetails1
	 * RequestDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherProcessingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OtherProcessing is used, then its usage must be pre-agreed between the sender and receiver."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RequestDetails1> forRequestDetails1 = new MMConstraint<RequestDetails1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherProcessingRule";
			definition = "If OtherProcessing is used, then its usage must be pre-agreed between the sender and receiver.";
			owner_lazy = () -> RequestDetails1.mmObject();
		}

		@Override
		public void executeValidator(RequestDetails1 obj) throws Exception {
			checkRequestDetails1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RequestDetails2
	 * RequestDetails2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherProcessingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OtherProcessing is used, then its usage must be pre-agreed between the sender and receiver."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RequestDetails2> forRequestDetails2 = new MMConstraint<RequestDetails2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherProcessingRule";
			definition = "If OtherProcessing is used, then its usage must be pre-agreed between the sender and receiver.";
			owner_lazy = () -> RequestDetails2.mmObject();
		}

		@Override
		public void executeValidator(RequestDetails2 obj) throws Exception {
			checkRequestDetails2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RequestDetails6
	 * RequestDetails6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherProcessingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OtherProcessing is used, then its usage must be pre-agreed between the sender and receiver."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherProcessingRule#forRequestDetails18
	 * ConstraintOtherProcessingRule.forRequestDetails18}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RequestDetails6> forRequestDetails6 = new MMConstraint<RequestDetails6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherProcessingRule";
			definition = "If OtherProcessing is used, then its usage must be pre-agreed between the sender and receiver.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOtherProcessingRule.forRequestDetails18);
			owner_lazy = () -> RequestDetails6.mmObject();
		}

		@Override
		public void executeValidator(RequestDetails6 obj) throws Exception {
			checkRequestDetails6(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RequestDetails7
	 * RequestDetails7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherProcessingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OtherProcessing is used, then its usage must be pre-agreed between the sender and receiver."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RequestDetails7> forRequestDetails7 = new MMConstraint<RequestDetails7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherProcessingRule";
			definition = "If OtherProcessing is used, then its usage must be pre-agreed between the sender and receiver.";
			owner_lazy = () -> RequestDetails7.mmObject();
		}

		@Override
		public void executeValidator(RequestDetails7 obj) throws Exception {
			checkRequestDetails7(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RequestDetails8
	 * RequestDetails8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherProcessingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OtherProcessing is used, then its usage must be pre-agreed between the sender and receiver."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RequestDetails8> forRequestDetails8 = new MMConstraint<RequestDetails8>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherProcessingRule";
			definition = "If OtherProcessing is used, then its usage must be pre-agreed between the sender and receiver.";
			owner_lazy = () -> RequestDetails8.mmObject();
		}

		@Override
		public void executeValidator(RequestDetails8 obj) throws Exception {
			checkRequestDetails8(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RequestDetails9
	 * RequestDetails9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherProcessingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OtherProcessing is used, then its usage must be pre-agreed between the sender and receiver."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RequestDetails9> forRequestDetails9 = new MMConstraint<RequestDetails9>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherProcessingRule";
			definition = "If OtherProcessing is used, then its usage must be pre-agreed between the sender and receiver.";
			owner_lazy = () -> RequestDetails9.mmObject();
		}

		@Override
		public void executeValidator(RequestDetails9 obj) throws Exception {
			checkRequestDetails9(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RequestDetails11
	 * RequestDetails11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherProcessingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OtherProcessing is used, then its usage must be pre-agreed between the sender and receiver."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherProcessingRule#forRequestDetails13
	 * ConstraintOtherProcessingRule.forRequestDetails13}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RequestDetails11> forRequestDetails11 = new MMConstraint<RequestDetails11>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherProcessingRule";
			definition = "If OtherProcessing is used, then its usage must be pre-agreed between the sender and receiver.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOtherProcessingRule.forRequestDetails13);
			owner_lazy = () -> RequestDetails11.mmObject();
		}

		@Override
		public void executeValidator(RequestDetails11 obj) throws Exception {
			checkRequestDetails11(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RequestDetails12
	 * RequestDetails12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherProcessingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OtherProcessing is used, then its usage must be pre-agreed between the sender and receiver."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RequestDetails12> forRequestDetails12 = new MMConstraint<RequestDetails12>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherProcessingRule";
			definition = "If OtherProcessing is used, then its usage must be pre-agreed between the sender and receiver.";
			owner_lazy = () -> RequestDetails12.mmObject();
		}

		@Override
		public void executeValidator(RequestDetails12 obj) throws Exception {
			checkRequestDetails12(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RequestDetails10
	 * RequestDetails10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherProcessingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OtherProcessing is used, then its usage must be pre-agreed between the sender and the receiver."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherProcessingRule#forRequestDetails17
	 * ConstraintOtherProcessingRule.forRequestDetails17}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RequestDetails10> forRequestDetails10 = new MMConstraint<RequestDetails10>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherProcessingRule";
			definition = "If OtherProcessing is used, then its usage must be pre-agreed between the sender and the receiver.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOtherProcessingRule.forRequestDetails17);
			owner_lazy = () -> RequestDetails10.mmObject();
		}

		@Override
		public void executeValidator(RequestDetails10 obj) throws Exception {
			checkRequestDetails10(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RequestDetails13
	 * RequestDetails13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherProcessingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OtherProcessing is used, then its usage must be pre-agreed between the sender and receiver."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherProcessingRule#forRequestDetails15
	 * ConstraintOtherProcessingRule.forRequestDetails15}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherProcessingRule#forRequestDetails11
	 * ConstraintOtherProcessingRule.forRequestDetails11}</li>
	 * </ul>
	 */
	public static final MMConstraint<RequestDetails13> forRequestDetails13 = new MMConstraint<RequestDetails13>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherProcessingRule";
			definition = "If OtherProcessing is used, then its usage must be pre-agreed between the sender and receiver.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOtherProcessingRule.forRequestDetails15);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOtherProcessingRule.forRequestDetails11;
			owner_lazy = () -> RequestDetails13.mmObject();
		}

		@Override
		public void executeValidator(RequestDetails13 obj) throws Exception {
			checkRequestDetails13(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RequestDetails14
	 * RequestDetails14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherProcessingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OtherProcessing is used, then its usage must be pre-agreed between the sender and receiver."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RequestDetails14> forRequestDetails14 = new MMConstraint<RequestDetails14>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherProcessingRule";
			definition = "If OtherProcessing is used, then its usage must be pre-agreed between the sender and receiver.";
			owner_lazy = () -> RequestDetails14.mmObject();
		}

		@Override
		public void executeValidator(RequestDetails14 obj) throws Exception {
			checkRequestDetails14(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RequestDetails15
	 * RequestDetails15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherProcessingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OtherProcessing is used, then its usage must be pre-agreed between the sender and receiver."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherProcessingRule#forRequestDetails13
	 * ConstraintOtherProcessingRule.forRequestDetails13}</li>
	 * </ul>
	 */
	public static final MMConstraint<RequestDetails15> forRequestDetails15 = new MMConstraint<RequestDetails15>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherProcessingRule";
			definition = "If OtherProcessing is used, then its usage must be pre-agreed between the sender and receiver.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOtherProcessingRule.forRequestDetails13;
			owner_lazy = () -> RequestDetails15.mmObject();
		}

		@Override
		public void executeValidator(RequestDetails15 obj) throws Exception {
			checkRequestDetails15(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RequestDetails16
	 * RequestDetails16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherProcessingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OtherProcessing is used, then its usage must be pre-agreed between the sender and receiver."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RequestDetails16> forRequestDetails16 = new MMConstraint<RequestDetails16>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherProcessingRule";
			definition = "If OtherProcessing is used, then its usage must be pre-agreed between the sender and receiver.";
			owner_lazy = () -> RequestDetails16.mmObject();
		}

		@Override
		public void executeValidator(RequestDetails16 obj) throws Exception {
			checkRequestDetails16(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RequestDetails17
	 * RequestDetails17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherProcessingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OtherProcessing is used, then its usage must be pre-agreed between the sender and the receiver."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherProcessingRule#forRequestDetails10
	 * ConstraintOtherProcessingRule.forRequestDetails10}</li>
	 * </ul>
	 */
	public static final MMConstraint<RequestDetails17> forRequestDetails17 = new MMConstraint<RequestDetails17>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherProcessingRule";
			definition = "If OtherProcessing is used, then its usage must be pre-agreed between the sender and the receiver.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOtherProcessingRule.forRequestDetails10;
			owner_lazy = () -> RequestDetails17.mmObject();
		}

		@Override
		public void executeValidator(RequestDetails17 obj) throws Exception {
			checkRequestDetails17(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RequestDetails18
	 * RequestDetails18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherProcessingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OtherProcessing is used, then its usage must be pre-agreed between the sender and receiver."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherProcessingRule#forRequestDetails6
	 * ConstraintOtherProcessingRule.forRequestDetails6}</li>
	 * </ul>
	 */
	public static final MMConstraint<RequestDetails18> forRequestDetails18 = new MMConstraint<RequestDetails18>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherProcessingRule";
			definition = "If OtherProcessing is used, then its usage must be pre-agreed between the sender and receiver.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOtherProcessingRule.forRequestDetails6;
			owner_lazy = () -> RequestDetails18.mmObject();
		}

		@Override
		public void executeValidator(RequestDetails18 obj) throws Exception {
			checkRequestDetails18(obj);
		}
	};

	/**
	 * If OtherProcessing is used, then its usage must be pre-agreed between the
	 * sender and receiver.
	 */
	public static void checkRequestDetails1(RequestDetails1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OtherProcessing is used, then its usage must be pre-agreed between the
	 * sender and receiver.
	 */
	public static void checkRequestDetails2(RequestDetails2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OtherProcessing is used, then its usage must be pre-agreed between the
	 * sender and receiver.
	 */
	public static void checkRequestDetails6(RequestDetails6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OtherProcessing is used, then its usage must be pre-agreed between the
	 * sender and receiver.
	 */
	public static void checkRequestDetails7(RequestDetails7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OtherProcessing is used, then its usage must be pre-agreed between the
	 * sender and receiver.
	 */
	public static void checkRequestDetails8(RequestDetails8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OtherProcessing is used, then its usage must be pre-agreed between the
	 * sender and receiver.
	 */
	public static void checkRequestDetails9(RequestDetails9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OtherProcessing is used, then its usage must be pre-agreed between the
	 * sender and receiver.
	 */
	public static void checkRequestDetails11(RequestDetails11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OtherProcessing is used, then its usage must be pre-agreed between the
	 * sender and receiver.
	 */
	public static void checkRequestDetails12(RequestDetails12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OtherProcessing is used, then its usage must be pre-agreed between the
	 * sender and the receiver.
	 */
	public static void checkRequestDetails10(RequestDetails10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OtherProcessing is used, then its usage must be pre-agreed between the
	 * sender and receiver.
	 */
	public static void checkRequestDetails13(RequestDetails13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OtherProcessing is used, then its usage must be pre-agreed between the
	 * sender and receiver.
	 */
	public static void checkRequestDetails14(RequestDetails14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OtherProcessing is used, then its usage must be pre-agreed between the
	 * sender and receiver.
	 */
	public static void checkRequestDetails15(RequestDetails15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OtherProcessing is used, then its usage must be pre-agreed between the
	 * sender and receiver.
	 */
	public static void checkRequestDetails16(RequestDetails16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OtherProcessing is used, then its usage must be pre-agreed between the
	 * sender and the receiver.
	 */
	public static void checkRequestDetails17(RequestDetails17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OtherProcessing is used, then its usage must be pre-agreed between the
	 * sender and receiver.
	 */
	public static void checkRequestDetails18(RequestDetails18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}