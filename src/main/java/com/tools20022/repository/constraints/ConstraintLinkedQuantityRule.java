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
 * If linked quantity for partial pair-off and turned quantity for partial turns
 * is used, then its usage must be pre-agreed between the message account owner
 * and account servicer.
 */
public class ConstraintLinkedQuantityRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Linkages37 Linkages37}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkedQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If linked quantity for partial pair-off and turned quantity for partial turns is used, then its usage must be pre-agreed between the message account owner and account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintLinkedQuantityRule#forLinkages17
	 * ConstraintLinkedQuantityRule.forLinkages17}</li>
	 * </ul>
	 */
	public static final MMConstraint<Linkages37> forLinkages37 = new MMConstraint<Linkages37>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkedQuantityRule";
			definition = "If linked quantity for partial pair-off and turned quantity for partial turns is used, then its usage must be pre-agreed between the message account owner and account servicer.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintLinkedQuantityRule.forLinkages17;
			owner_lazy = () -> Linkages37.mmObject();
		}

		@Override
		public void executeValidator(Linkages37 obj) throws Exception {
			checkLinkages37(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Linkages1 Linkages1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkedQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If linked quantity for partial pair-off and turned quantity for partial turns is used, then its usage must be pre-agreed between the message account owner and account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintLinkedQuantityRule#forLinkages38
	 * ConstraintLinkedQuantityRule.forLinkages38}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Linkages1> forLinkages1 = new MMConstraint<Linkages1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkedQuantityRule";
			definition = "If linked quantity for partial pair-off and turned quantity for partial turns is used, then its usage must be pre-agreed between the message account owner and account servicer.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintLinkedQuantityRule.forLinkages38);
			owner_lazy = () -> Linkages1.mmObject();
		}

		@Override
		public void executeValidator(Linkages1 obj) throws Exception {
			checkLinkages1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Linkages38 Linkages38}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkedQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If linked quantity for partial pair-off and turned quantity for partial turns is used, then its usage must be pre-agreed between the message account owner and account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintLinkedQuantityRule#forLinkages1
	 * ConstraintLinkedQuantityRule.forLinkages1}</li>
	 * </ul>
	 */
	public static final MMConstraint<Linkages38> forLinkages38 = new MMConstraint<Linkages38>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkedQuantityRule";
			definition = "If linked quantity for partial pair-off and turned quantity for partial turns is used, then its usage must be pre-agreed between the message account owner and account servicer.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintLinkedQuantityRule.forLinkages1;
			owner_lazy = () -> Linkages38.mmObject();
		}

		@Override
		public void executeValidator(Linkages38 obj) throws Exception {
			checkLinkages38(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Linkages43 Linkages43}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkedQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If linked quantity for partial pair-off and turned quantity for partial turns is used, then its usage must be pre-agreed between the message account owner and account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<Linkages43> forLinkages43 = new MMConstraint<Linkages43>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkedQuantityRule";
			definition = "If linked quantity for partial pair-off and turned quantity for partial turns is used, then its usage must be pre-agreed between the message account owner and account servicer.";
			owner_lazy = () -> Linkages43.mmObject();
		}

		@Override
		public void executeValidator(Linkages43 obj) throws Exception {
			checkLinkages43(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Linkages4 Linkages4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkedQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If linked quantity for partial pair-off and turned quantity for partial turns is used, then its usage must be pre-agreed between the message account owner and account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<Linkages4> forLinkages4 = new MMConstraint<Linkages4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkedQuantityRule";
			definition = "If linked quantity for partial pair-off and turned quantity for partial turns is used, then its usage must be pre-agreed between the message account owner and account servicer.";
			owner_lazy = () -> Linkages4.mmObject();
		}

		@Override
		public void executeValidator(Linkages4 obj) throws Exception {
			checkLinkages4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Linkages12 Linkages12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkedQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If linked quantity for partial pair-off and turned quantity for partial turns is used, then its usage must be pre-agreed between the message account owner and account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<Linkages12> forLinkages12 = new MMConstraint<Linkages12>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkedQuantityRule";
			definition = "If linked quantity for partial pair-off and turned quantity for partial turns is used, then its usage must be pre-agreed between the message account owner and account servicer.";
			owner_lazy = () -> Linkages12.mmObject();
		}

		@Override
		public void executeValidator(Linkages12 obj) throws Exception {
			checkLinkages12(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Linkages7 Linkages7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkedQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If linked quantity for partial pair-off and turned quantity for partial turns is used, then its usage must be pre-agreed between the message account owner and account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<Linkages7> forLinkages7 = new MMConstraint<Linkages7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkedQuantityRule";
			definition = "If linked quantity for partial pair-off and turned quantity for partial turns is used, then its usage must be pre-agreed between the message account owner and account servicer.";
			owner_lazy = () -> Linkages7.mmObject();
		}

		@Override
		public void executeValidator(Linkages7 obj) throws Exception {
			checkLinkages7(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Linkages9 Linkages9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkedQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If linked quantity for partial pair-off and turned quantity for partial turns is used, then its usage must be pre-agreed between the message account owner and account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<Linkages9> forLinkages9 = new MMConstraint<Linkages9>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkedQuantityRule";
			definition = "If linked quantity for partial pair-off and turned quantity for partial turns is used, then its usage must be pre-agreed between the message account owner and account servicer.";
			owner_lazy = () -> Linkages9.mmObject();
		}

		@Override
		public void executeValidator(Linkages9 obj) throws Exception {
			checkLinkages9(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Linkages24 Linkages24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkedQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If linked quantity for partial pair-off and turned quantity for partial turns is used, then its usage must be pre-agreed between the message account owner and account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<Linkages24> forLinkages24 = new MMConstraint<Linkages24>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkedQuantityRule";
			definition = "If linked quantity for partial pair-off and turned quantity for partial turns is used, then its usage must be pre-agreed between the message account owner and account servicer.";
			owner_lazy = () -> Linkages24.mmObject();
		}

		@Override
		public void executeValidator(Linkages24 obj) throws Exception {
			checkLinkages24(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Linkages14 Linkages14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkedQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If linked quantity for partial pair-off and turned quantity for partial turns is used, then its usage must be pre-agreed between the message account owner and account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<Linkages14> forLinkages14 = new MMConstraint<Linkages14>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkedQuantityRule";
			definition = "If linked quantity for partial pair-off and turned quantity for partial turns is used, then its usage must be pre-agreed between the message account owner and account servicer.";
			owner_lazy = () -> Linkages14.mmObject();
		}

		@Override
		public void executeValidator(Linkages14 obj) throws Exception {
			checkLinkages14(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Linkages48 Linkages48}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkedQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If linked quantity for partial pair-off and turned quantity for partial turns is used, then its usage must be pre-agreed between the message account owner and account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<Linkages48> forLinkages48 = new MMConstraint<Linkages48>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkedQuantityRule";
			definition = "If linked quantity for partial pair-off and turned quantity for partial turns is used, then its usage must be pre-agreed between the message account owner and account servicer.";
			owner_lazy = () -> Linkages48.mmObject();
		}

		@Override
		public void executeValidator(Linkages48 obj) throws Exception {
			checkLinkages48(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Linkages17 Linkages17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkedQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If linked quantity for partial pair-off and turned quantity for partial turns is used, then its usage must be pre-agreed between the message account owner and account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintLinkedQuantityRule#forLinkages37
	 * ConstraintLinkedQuantityRule.forLinkages37}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Linkages17> forLinkages17 = new MMConstraint<Linkages17>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkedQuantityRule";
			definition = "If linked quantity for partial pair-off and turned quantity for partial turns is used, then its usage must be pre-agreed between the message account owner and account servicer.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintLinkedQuantityRule.forLinkages37);
			owner_lazy = () -> Linkages17.mmObject();
		}

		@Override
		public void executeValidator(Linkages17 obj) throws Exception {
			checkLinkages17(obj);
		}
	};

	/**
	 * If linked quantity for partial pair-off and turned quantity for partial
	 * turns is used, then its usage must be pre-agreed between the message
	 * account owner and account servicer.
	 */
	public static void checkLinkages37(Linkages37 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If linked quantity for partial pair-off and turned quantity for partial
	 * turns is used, then its usage must be pre-agreed between the message
	 * account owner and account servicer.
	 */
	public static void checkLinkages1(Linkages1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If linked quantity for partial pair-off and turned quantity for partial
	 * turns is used, then its usage must be pre-agreed between the message
	 * account owner and account servicer.
	 */
	public static void checkLinkages38(Linkages38 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If linked quantity for partial pair-off and turned quantity for partial
	 * turns is used, then its usage must be pre-agreed between the message
	 * account owner and account servicer.
	 */
	public static void checkLinkages43(Linkages43 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If linked quantity for partial pair-off and turned quantity for partial
	 * turns is used, then its usage must be pre-agreed between the message
	 * account owner and account servicer.
	 */
	public static void checkLinkages4(Linkages4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If linked quantity for partial pair-off and turned quantity for partial
	 * turns is used, then its usage must be pre-agreed between the message
	 * account owner and account servicer.
	 */
	public static void checkLinkages12(Linkages12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If linked quantity for partial pair-off and turned quantity for partial
	 * turns is used, then its usage must be pre-agreed between the message
	 * account owner and account servicer.
	 */
	public static void checkLinkages7(Linkages7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If linked quantity for partial pair-off and turned quantity for partial
	 * turns is used, then its usage must be pre-agreed between the message
	 * account owner and account servicer.
	 */
	public static void checkLinkages9(Linkages9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If linked quantity for partial pair-off and turned quantity for partial
	 * turns is used, then its usage must be pre-agreed between the message
	 * account owner and account servicer.
	 */
	public static void checkLinkages24(Linkages24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If linked quantity for partial pair-off and turned quantity for partial
	 * turns is used, then its usage must be pre-agreed between the message
	 * account owner and account servicer.
	 */
	public static void checkLinkages14(Linkages14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If linked quantity for partial pair-off and turned quantity for partial
	 * turns is used, then its usage must be pre-agreed between the message
	 * account owner and account servicer.
	 */
	public static void checkLinkages48(Linkages48 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If linked quantity for partial pair-off and turned quantity for partial
	 * turns is used, then its usage must be pre-agreed between the message
	 * account owner and account servicer.
	 */
	public static void checkLinkages17(Linkages17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}