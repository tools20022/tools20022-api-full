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
import com.tools20022.repository.choice.*;
import java.util.Arrays;

/**
 * If Code WITH is used, then the one or more instruction which are linked
 * become bound and which must be executed together. Even if one single
 * transactions/instructions/notifications can not be executed, then all the
 * other transactions/instructions/notifications must also be kept pending.
 * Therefore the use of code WITH must be limited to combine up to 2 or 3
 * transactions/instructions/notifications.
 */
public class ConstraintWithLinkageRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingPosition3Choice
	 * ProcessingPosition3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithLinkageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Code WITH is used, then the one or more instruction which are linked become bound and which must be executed together. Even if one single transactions/instructions/notifications can not be executed, then all the other transactions/instructions/notifications must also be kept pending. Therefore the use of code WITH must be limited to combine up to 2 or 3 transactions/instructions/notifications."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ProcessingPosition3Choice> forProcessingPosition3Choice = new MMConstraint<ProcessingPosition3Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithLinkageRule";
			definition = "If Code WITH is used, then the one or more instruction which are linked become bound and which must be executed together. Even if one single transactions/instructions/notifications can not be executed, then all the other transactions/instructions/notifications must also be kept pending. Therefore the use of code WITH must be limited to combine up to 2 or 3 transactions/instructions/notifications.";
			owner_lazy = () -> ProcessingPosition3Choice.mmObject();
		}

		@Override
		public void executeValidator(ProcessingPosition3Choice obj) throws Exception {
			checkProcessingPosition3Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingPosition6Choice
	 * ProcessingPosition6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithLinkageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Code WITH is used, then the one or more instruction which are linked become bound and which must be executed together. Even if one single transactions/instructions/notifications can not be executed, then all the other transactions/instructions/notifications must also be kept pending. Therefore the use of code WITH must be limited to combine up to 2 or 3 transactions/instructions/notifications."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ProcessingPosition6Choice> forProcessingPosition6Choice = new MMConstraint<ProcessingPosition6Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithLinkageRule";
			definition = "If Code WITH is used, then the one or more instruction which are linked become bound and which must be executed together. Even if one single transactions/instructions/notifications can not be executed, then all the other transactions/instructions/notifications must also be kept pending. Therefore the use of code WITH must be limited to combine up to 2 or 3 transactions/instructions/notifications.";
			owner_lazy = () -> ProcessingPosition6Choice.mmObject();
		}

		@Override
		public void executeValidator(ProcessingPosition6Choice obj) throws Exception {
			checkProcessingPosition6Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingPosition22Choice
	 * ProcessingPosition22Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithLinkageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Code WITH is used, then the one or more instruction which are linked become bound and which must be executed together. Even if one single transactions/instructions/notifications can not be executed, then all the other transactions/instructions/notifications must also be kept pending. Therefore the use of code WITH must be limited to combine up to 2 or 3 transactions/instructions/notifications."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ProcessingPosition22Choice> forProcessingPosition22Choice = new MMConstraint<ProcessingPosition22Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithLinkageRule";
			definition = "If Code WITH is used, then the one or more instruction which are linked become bound and which must be executed together. Even if one single transactions/instructions/notifications can not be executed, then all the other transactions/instructions/notifications must also be kept pending. Therefore the use of code WITH must be limited to combine up to 2 or 3 transactions/instructions/notifications.";
			owner_lazy = () -> ProcessingPosition22Choice.mmObject();
		}

		@Override
		public void executeValidator(ProcessingPosition22Choice obj) throws Exception {
			checkProcessingPosition22Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingPosition5Choice
	 * ProcessingPosition5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithLinkageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Code WITH is used, then the one or more instruction which are linked become bound and which must be executed together. Even if one single transactions/instructions/notifications can not be executed, then all the other transactions/instructions/notifications must also be kept pending. Therefore the use of code WITH must be limited to combine up to 2 or 3 transactions/instructions/notifications."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintWithLinkageRule#forProcessingPosition8Choice
	 * ConstraintWithLinkageRule.forProcessingPosition8Choice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ProcessingPosition5Choice> forProcessingPosition5Choice = new MMConstraint<ProcessingPosition5Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithLinkageRule";
			definition = "If Code WITH is used, then the one or more instruction which are linked become bound and which must be executed together. Even if one single transactions/instructions/notifications can not be executed, then all the other transactions/instructions/notifications must also be kept pending. Therefore the use of code WITH must be limited to combine up to 2 or 3 transactions/instructions/notifications.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintWithLinkageRule.forProcessingPosition8Choice);
			owner_lazy = () -> ProcessingPosition5Choice.mmObject();
		}

		@Override
		public void executeValidator(ProcessingPosition5Choice obj) throws Exception {
			checkProcessingPosition5Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingPosition1Choice
	 * ProcessingPosition1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithLinkageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Code WITH is used, then the one or more instruction which are linked become bound and which must be executed together. Even if one single transactions/instructions/notifications can not be executed, then all the other transactions/instructions/notifications must also be kept pending. Therefore the use of code WITH must be limited to combine up to 2 or 3 transactions/instructions/notifications."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintWithLinkageRule#forProcessingPosition7Choice
	 * ConstraintWithLinkageRule.forProcessingPosition7Choice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ProcessingPosition1Choice> forProcessingPosition1Choice = new MMConstraint<ProcessingPosition1Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithLinkageRule";
			definition = "If Code WITH is used, then the one or more instruction which are linked become bound and which must be executed together. Even if one single transactions/instructions/notifications can not be executed, then all the other transactions/instructions/notifications must also be kept pending. Therefore the use of code WITH must be limited to combine up to 2 or 3 transactions/instructions/notifications.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintWithLinkageRule.forProcessingPosition7Choice);
			owner_lazy = () -> ProcessingPosition1Choice.mmObject();
		}

		@Override
		public void executeValidator(ProcessingPosition1Choice obj) throws Exception {
			checkProcessingPosition1Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingPosition4Choice
	 * ProcessingPosition4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithLinkageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Code WITH is used, then the one or more instruction which are linked become bound and which must be executed together. Even if one single transactions/instructions/notifications can not be executed, then all the other transactions/instructions/notifications must also be kept pending. Therefore the use of code WITH must be limited to combine up to 2 or 3 transactions/instructions/notifications."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ProcessingPosition4Choice> forProcessingPosition4Choice = new MMConstraint<ProcessingPosition4Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithLinkageRule";
			definition = "If Code WITH is used, then the one or more instruction which are linked become bound and which must be executed together. Even if one single transactions/instructions/notifications can not be executed, then all the other transactions/instructions/notifications must also be kept pending. Therefore the use of code WITH must be limited to combine up to 2 or 3 transactions/instructions/notifications.";
			owner_lazy = () -> ProcessingPosition4Choice.mmObject();
		}

		@Override
		public void executeValidator(ProcessingPosition4Choice obj) throws Exception {
			checkProcessingPosition4Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingPosition18Choice
	 * ProcessingPosition18Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithLinkageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Code WITH is used, then the one or more instruction which are linked become bound and which must be executed together. Even if one single transactions/instructions/notifications can not be executed, then all the other transactions/instructions/notifications must also be kept pending. Therefore the use of code WITH must be limited to combine up to 2 or 3 transactions/instructions/notifications."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ProcessingPosition18Choice> forProcessingPosition18Choice = new MMConstraint<ProcessingPosition18Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithLinkageRule";
			definition = "If Code WITH is used, then the one or more instruction which are linked become bound and which must be executed together. Even if one single transactions/instructions/notifications can not be executed, then all the other transactions/instructions/notifications must also be kept pending. Therefore the use of code WITH must be limited to combine up to 2 or 3 transactions/instructions/notifications.";
			owner_lazy = () -> ProcessingPosition18Choice.mmObject();
		}

		@Override
		public void executeValidator(ProcessingPosition18Choice obj) throws Exception {
			checkProcessingPosition18Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingPosition2Choice
	 * ProcessingPosition2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithLinkageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Code WITH is used, then the one or more instruction which are linked become bound and which must be executed together. Even if one single transactions/instructions/notifications can not be executed, then all the other transactions/instructions/notifications must also be kept pending. Therefore the use of code WITH must be limited to combine up to 2 or 3 transactions/instructions/notifications."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ProcessingPosition2Choice> forProcessingPosition2Choice = new MMConstraint<ProcessingPosition2Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithLinkageRule";
			definition = "If Code WITH is used, then the one or more instruction which are linked become bound and which must be executed together. Even if one single transactions/instructions/notifications can not be executed, then all the other transactions/instructions/notifications must also be kept pending. Therefore the use of code WITH must be limited to combine up to 2 or 3 transactions/instructions/notifications.";
			owner_lazy = () -> ProcessingPosition2Choice.mmObject();
		}

		@Override
		public void executeValidator(ProcessingPosition2Choice obj) throws Exception {
			checkProcessingPosition2Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingPosition8Choice
	 * ProcessingPosition8Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithLinkageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Code WITH is used, then the one or more instruction which are linked become bound and which must be executed together. Even if one single transactions/instructions/notifications can not be executed, then all the other transactions/instructions/notifications must also be kept pending. Therefore the use of code WITH must be limited to combine up to 2 or 3 transactions/instructions/notifications."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintWithLinkageRule#forProcessingPosition5Choice
	 * ConstraintWithLinkageRule.forProcessingPosition5Choice}</li>
	 * </ul>
	 */
	public static final MMConstraint<ProcessingPosition8Choice> forProcessingPosition8Choice = new MMConstraint<ProcessingPosition8Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithLinkageRule";
			definition = "If Code WITH is used, then the one or more instruction which are linked become bound and which must be executed together. Even if one single transactions/instructions/notifications can not be executed, then all the other transactions/instructions/notifications must also be kept pending. Therefore the use of code WITH must be limited to combine up to 2 or 3 transactions/instructions/notifications.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintWithLinkageRule.forProcessingPosition5Choice;
			owner_lazy = () -> ProcessingPosition8Choice.mmObject();
		}

		@Override
		public void executeValidator(ProcessingPosition8Choice obj) throws Exception {
			checkProcessingPosition8Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingPosition7Choice
	 * ProcessingPosition7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithLinkageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Code WITH is used, then the one or more instruction which are linked become bound and which must be executed together. Even if one single transactions/instructions/notifications can not be executed, then all the other transactions/instructions/notifications must also be kept pending. Therefore the use of code WITH must be limited to combine up to 2 or 3 transactions/instructions/notifications."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintWithLinkageRule#forProcessingPosition1Choice
	 * ConstraintWithLinkageRule.forProcessingPosition1Choice}</li>
	 * </ul>
	 */
	public static final MMConstraint<ProcessingPosition7Choice> forProcessingPosition7Choice = new MMConstraint<ProcessingPosition7Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithLinkageRule";
			definition = "If Code WITH is used, then the one or more instruction which are linked become bound and which must be executed together. Even if one single transactions/instructions/notifications can not be executed, then all the other transactions/instructions/notifications must also be kept pending. Therefore the use of code WITH must be limited to combine up to 2 or 3 transactions/instructions/notifications.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintWithLinkageRule.forProcessingPosition1Choice;
			owner_lazy = () -> ProcessingPosition7Choice.mmObject();
		}

		@Override
		public void executeValidator(ProcessingPosition7Choice obj) throws Exception {
			checkProcessingPosition7Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingPosition10Choice
	 * ProcessingPosition10Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithLinkageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Code WITH is used, then the one or more instruction which are linked become bound and which must be executed together. Even if one single transactions/instructions/notifications can not be executed, then all the other transactions/instructions/notifications must also be kept pending. Therefore the use of code WITH must be limited to combine up to 2 or 3 transactions/instructions/notifications."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ProcessingPosition10Choice> forProcessingPosition10Choice = new MMConstraint<ProcessingPosition10Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithLinkageRule";
			definition = "If Code WITH is used, then the one or more instruction which are linked become bound and which must be executed together. Even if one single transactions/instructions/notifications can not be executed, then all the other transactions/instructions/notifications must also be kept pending. Therefore the use of code WITH must be limited to combine up to 2 or 3 transactions/instructions/notifications.";
			owner_lazy = () -> ProcessingPosition10Choice.mmObject();
		}

		@Override
		public void executeValidator(ProcessingPosition10Choice obj) throws Exception {
			checkProcessingPosition10Choice(obj);
		}
	};

	/**
	 * If Code WITH is used, then the one or more instruction which are linked
	 * become bound and which must be executed together. Even if one single
	 * transactions/instructions/notifications can not be executed, then all the
	 * other transactions/instructions/notifications must also be kept pending.
	 * Therefore the use of code WITH must be limited to combine up to 2 or 3
	 * transactions/instructions/notifications.
	 */
	public static void checkProcessingPosition3Choice(ProcessingPosition3Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Code WITH is used, then the one or more instruction which are linked
	 * become bound and which must be executed together. Even if one single
	 * transactions/instructions/notifications can not be executed, then all the
	 * other transactions/instructions/notifications must also be kept pending.
	 * Therefore the use of code WITH must be limited to combine up to 2 or 3
	 * transactions/instructions/notifications.
	 */
	public static void checkProcessingPosition6Choice(ProcessingPosition6Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Code WITH is used, then the one or more instruction which are linked
	 * become bound and which must be executed together. Even if one single
	 * transactions/instructions/notifications can not be executed, then all the
	 * other transactions/instructions/notifications must also be kept pending.
	 * Therefore the use of code WITH must be limited to combine up to 2 or 3
	 * transactions/instructions/notifications.
	 */
	public static void checkProcessingPosition22Choice(ProcessingPosition22Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Code WITH is used, then the one or more instruction which are linked
	 * become bound and which must be executed together. Even if one single
	 * transactions/instructions/notifications can not be executed, then all the
	 * other transactions/instructions/notifications must also be kept pending.
	 * Therefore the use of code WITH must be limited to combine up to 2 or 3
	 * transactions/instructions/notifications.
	 */
	public static void checkProcessingPosition5Choice(ProcessingPosition5Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Code WITH is used, then the one or more instruction which are linked
	 * become bound and which must be executed together. Even if one single
	 * transactions/instructions/notifications can not be executed, then all the
	 * other transactions/instructions/notifications must also be kept pending.
	 * Therefore the use of code WITH must be limited to combine up to 2 or 3
	 * transactions/instructions/notifications.
	 */
	public static void checkProcessingPosition1Choice(ProcessingPosition1Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Code WITH is used, then the one or more instruction which are linked
	 * become bound and which must be executed together. Even if one single
	 * transactions/instructions/notifications can not be executed, then all the
	 * other transactions/instructions/notifications must also be kept pending.
	 * Therefore the use of code WITH must be limited to combine up to 2 or 3
	 * transactions/instructions/notifications.
	 */
	public static void checkProcessingPosition4Choice(ProcessingPosition4Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Code WITH is used, then the one or more instruction which are linked
	 * become bound and which must be executed together. Even if one single
	 * transactions/instructions/notifications can not be executed, then all the
	 * other transactions/instructions/notifications must also be kept pending.
	 * Therefore the use of code WITH must be limited to combine up to 2 or 3
	 * transactions/instructions/notifications.
	 */
	public static void checkProcessingPosition18Choice(ProcessingPosition18Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Code WITH is used, then the one or more instruction which are linked
	 * become bound and which must be executed together. Even if one single
	 * transactions/instructions/notifications can not be executed, then all the
	 * other transactions/instructions/notifications must also be kept pending.
	 * Therefore the use of code WITH must be limited to combine up to 2 or 3
	 * transactions/instructions/notifications.
	 */
	public static void checkProcessingPosition2Choice(ProcessingPosition2Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Code WITH is used, then the one or more instruction which are linked
	 * become bound and which must be executed together. Even if one single
	 * transactions/instructions/notifications can not be executed, then all the
	 * other transactions/instructions/notifications must also be kept pending.
	 * Therefore the use of code WITH must be limited to combine up to 2 or 3
	 * transactions/instructions/notifications.
	 */
	public static void checkProcessingPosition8Choice(ProcessingPosition8Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Code WITH is used, then the one or more instruction which are linked
	 * become bound and which must be executed together. Even if one single
	 * transactions/instructions/notifications can not be executed, then all the
	 * other transactions/instructions/notifications must also be kept pending.
	 * Therefore the use of code WITH must be limited to combine up to 2 or 3
	 * transactions/instructions/notifications.
	 */
	public static void checkProcessingPosition7Choice(ProcessingPosition7Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Code WITH is used, then the one or more instruction which are linked
	 * become bound and which must be executed together. Even if one single
	 * transactions/instructions/notifications can not be executed, then all the
	 * other transactions/instructions/notifications must also be kept pending.
	 * Therefore the use of code WITH must be limited to combine up to 2 or 3
	 * transactions/instructions/notifications.
	 */
	public static void checkProcessingPosition10Choice(ProcessingPosition10Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}