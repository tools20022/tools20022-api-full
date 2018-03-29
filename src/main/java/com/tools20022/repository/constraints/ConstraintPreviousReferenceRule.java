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
 * If PreviousReference/MessageName is present, it must contain 540 or 542 or
 * must start with sese.001 or sese.002 or sese.005 or sese.006 and Reference
 * must contain the MessageReference from the Application Header.
 */
public class ConstraintPreviousReferenceRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference1
	 * MessageAndBusinessReference1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PreviousReference/MessageName is present, it must contain 540 or 542 or must start with sese.001 or sese.002 or sese.005 or sese.006 and Reference must contain the MessageReference from the Application Header."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<MessageAndBusinessReference1> forMessageAndBusinessReference1 = new MMConstraint<MessageAndBusinessReference1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousReferenceRule";
			definition = "If PreviousReference/MessageName is present, it must contain 540 or 542 or must start with sese.001 or sese.002 or sese.005 or sese.006 and Reference must contain the MessageReference from the Application Header.";
			owner_lazy = () -> MessageAndBusinessReference1.mmObject();
		}

		@Override
		public void executeValidator(MessageAndBusinessReference1 obj) throws Exception {
			checkMessageAndBusinessReference1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference6
	 * MessageAndBusinessReference6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PreviousReference/MessageName is present, it must contain 540 or 542 or must start with sese.001, sese.002, sese.005 or sese.006 and and PreviousReference/Reference must contain the reference of a message in this list."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPreviousReferenceRule#forMessageAndBusinessReference7
	 * ConstraintPreviousReferenceRule.forMessageAndBusinessReference7}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<MessageAndBusinessReference6> forMessageAndBusinessReference6 = new MMConstraint<MessageAndBusinessReference6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousReferenceRule";
			definition = "If PreviousReference/MessageName is present, it must contain 540 or 542 or must start with sese.001, sese.002, sese.005 or sese.006 and and PreviousReference/Reference must contain the reference of a message in this list.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPreviousReferenceRule.forMessageAndBusinessReference7);
			owner_lazy = () -> MessageAndBusinessReference6.mmObject();
		}

		@Override
		public void executeValidator(MessageAndBusinessReference6 obj) throws Exception {
			checkMessageAndBusinessReference6(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference7
	 * MessageAndBusinessReference7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Reference/PreviousReference/MessageName is present, it must start with sese.001, sese.002, sese.005, sese.006, sese.012 or sese.014."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPreviousReferenceRule#forMessageAndBusinessReference8
	 * ConstraintPreviousReferenceRule.forMessageAndBusinessReference8}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPreviousReferenceRule#forMessageAndBusinessReference6
	 * ConstraintPreviousReferenceRule.forMessageAndBusinessReference6}</li>
	 * </ul>
	 */
	public static final MMConstraint<MessageAndBusinessReference7> forMessageAndBusinessReference7 = new MMConstraint<MessageAndBusinessReference7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousReferenceRule";
			definition = "If Reference/PreviousReference/MessageName is present, it must start with sese.001, sese.002, sese.005, sese.006, sese.012 or sese.014.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPreviousReferenceRule.forMessageAndBusinessReference8);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPreviousReferenceRule.forMessageAndBusinessReference6;
			owner_lazy = () -> MessageAndBusinessReference7.mmObject();
		}

		@Override
		public void executeValidator(MessageAndBusinessReference7 obj) throws Exception {
			checkMessageAndBusinessReference7(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference8
	 * MessageAndBusinessReference8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Reference/PreviousReference/MessageName is present, it must start with sese.001, sese.002, sese.005, sese.006, sese.012 or sese.014."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPreviousReferenceRule#forMessageAndBusinessReference11
	 * ConstraintPreviousReferenceRule.forMessageAndBusinessReference11}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPreviousReferenceRule#forMessageAndBusinessReference7
	 * ConstraintPreviousReferenceRule.forMessageAndBusinessReference7}</li>
	 * </ul>
	 */
	public static final MMConstraint<MessageAndBusinessReference8> forMessageAndBusinessReference8 = new MMConstraint<MessageAndBusinessReference8>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousReferenceRule";
			definition = "If Reference/PreviousReference/MessageName is present, it must start with sese.001, sese.002, sese.005, sese.006, sese.012 or sese.014.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPreviousReferenceRule.forMessageAndBusinessReference11);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPreviousReferenceRule.forMessageAndBusinessReference7;
			owner_lazy = () -> MessageAndBusinessReference8.mmObject();
		}

		@Override
		public void executeValidator(MessageAndBusinessReference8 obj) throws Exception {
			checkMessageAndBusinessReference8(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference11
	 * MessageAndBusinessReference11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Reference/PreviousReference/MessageName is present, it must start with sese.001, sese.002, sese.005, sese.006, sese.012 or sese.014."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPreviousReferenceRule#forMessageAndBusinessReference8
	 * ConstraintPreviousReferenceRule.forMessageAndBusinessReference8}</li>
	 * </ul>
	 */
	public static final MMConstraint<MessageAndBusinessReference11> forMessageAndBusinessReference11 = new MMConstraint<MessageAndBusinessReference11>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousReferenceRule";
			definition = "If Reference/PreviousReference/MessageName is present, it must start with sese.001, sese.002, sese.005, sese.006, sese.012 or sese.014.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPreviousReferenceRule.forMessageAndBusinessReference8;
			owner_lazy = () -> MessageAndBusinessReference11.mmObject();
		}

		@Override
		public void executeValidator(MessageAndBusinessReference11 obj) throws Exception {
			checkMessageAndBusinessReference11(obj);
		}
	};

	/**
	 * If PreviousReference/MessageName is present, it must contain 540 or 542
	 * or must start with sese.001 or sese.002 or sese.005 or sese.006 and
	 * Reference must contain the MessageReference from the Application Header.
	 */
	public static void checkMessageAndBusinessReference1(MessageAndBusinessReference1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PreviousReference/MessageName is present, it must contain 540 or 542
	 * or must start with sese.001, sese.002, sese.005 or sese.006 and and
	 * PreviousReference/Reference must contain the reference of a message in
	 * this list.
	 */
	public static void checkMessageAndBusinessReference6(MessageAndBusinessReference6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Reference/PreviousReference/MessageName is present, it must start with
	 * sese.001, sese.002, sese.005, sese.006, sese.012 or sese.014.
	 */
	public static void checkMessageAndBusinessReference7(MessageAndBusinessReference7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Reference/PreviousReference/MessageName is present, it must start with
	 * sese.001, sese.002, sese.005, sese.006, sese.012 or sese.014.
	 */
	public static void checkMessageAndBusinessReference8(MessageAndBusinessReference8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Reference/PreviousReference/MessageName is present, it must start with
	 * sese.001, sese.002, sese.005, sese.006, sese.012 or sese.014.
	 */
	public static void checkMessageAndBusinessReference11(MessageAndBusinessReference11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}