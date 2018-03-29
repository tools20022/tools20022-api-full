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
 * If Qualified Foreign Intermediary is used, then the instruction must be a
 * delivery.
 */
public class ConstraintQualifiedForeignIntermediaryRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties2 OtherParties2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QualifiedForeignIntermediaryRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Qualified Foreign Intermediary is used, then the instruction must be a delivery."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OtherParties2> forOtherParties2 = new MMConstraint<OtherParties2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QualifiedForeignIntermediaryRule";
			definition = "If Qualified Foreign Intermediary is used, then the instruction must be a delivery.";
			owner_lazy = () -> OtherParties2.mmObject();
		}

		@Override
		public void executeValidator(OtherParties2 obj) throws Exception {
			checkOtherParties2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties8 OtherParties8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QualifiedForeignIntermediaryRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Qualified Foreign Intermediary is used, then the instruction must be a delivery."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OtherParties8> forOtherParties8 = new MMConstraint<OtherParties8>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QualifiedForeignIntermediaryRule";
			definition = "If Qualified Foreign Intermediary is used, then the instruction must be a delivery.";
			owner_lazy = () -> OtherParties8.mmObject();
		}

		@Override
		public void executeValidator(OtherParties8 obj) throws Exception {
			checkOtherParties8(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties19 OtherParties19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QualifiedForeignIntermediaryRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Qualified Foreign Intermediary is used, then the instruction must be a delivery."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintQualifiedForeignIntermediaryRule#forOtherParties27
	 * ConstraintQualifiedForeignIntermediaryRule.forOtherParties27}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OtherParties19> forOtherParties19 = new MMConstraint<OtherParties19>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QualifiedForeignIntermediaryRule";
			definition = "If Qualified Foreign Intermediary is used, then the instruction must be a delivery.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintQualifiedForeignIntermediaryRule.forOtherParties27);
			owner_lazy = () -> OtherParties19.mmObject();
		}

		@Override
		public void executeValidator(OtherParties19 obj) throws Exception {
			checkOtherParties19(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties24 OtherParties24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QualifiedForeignIntermediaryRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Qualified Foreign Intermediary is used, then the instruction must be a delivery."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OtherParties24> forOtherParties24 = new MMConstraint<OtherParties24>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QualifiedForeignIntermediaryRule";
			definition = "If Qualified Foreign Intermediary is used, then the instruction must be a delivery.";
			owner_lazy = () -> OtherParties24.mmObject();
		}

		@Override
		public void executeValidator(OtherParties24 obj) throws Exception {
			checkOtherParties24(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties7 OtherParties7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QualifiedForeignIntermediaryRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Qualified Foreign Intermediary is used, then the instruction must be a delivery."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OtherParties7> forOtherParties7 = new MMConstraint<OtherParties7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QualifiedForeignIntermediaryRule";
			definition = "If Qualified Foreign Intermediary is used, then the instruction must be a delivery.";
			owner_lazy = () -> OtherParties7.mmObject();
		}

		@Override
		public void executeValidator(OtherParties7 obj) throws Exception {
			checkOtherParties7(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties9 OtherParties9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QualifiedForeignIntermediaryRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Qualified Foreign Intermediary is used, then the instruction must be a delivery."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OtherParties9> forOtherParties9 = new MMConstraint<OtherParties9>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QualifiedForeignIntermediaryRule";
			definition = "If Qualified Foreign Intermediary is used, then the instruction must be a delivery.";
			owner_lazy = () -> OtherParties9.mmObject();
		}

		@Override
		public void executeValidator(OtherParties9 obj) throws Exception {
			checkOtherParties9(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties14 OtherParties14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QualifiedForeignIntermediaryRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Qualified Foreign Intermediary is used, then the instruction must be a delivery."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OtherParties14> forOtherParties14 = new MMConstraint<OtherParties14>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QualifiedForeignIntermediaryRule";
			definition = "If Qualified Foreign Intermediary is used, then the instruction must be a delivery.";
			owner_lazy = () -> OtherParties14.mmObject();
		}

		@Override
		public void executeValidator(OtherParties14 obj) throws Exception {
			checkOtherParties14(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties15 OtherParties15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QualifiedForeignIntermediaryRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Qualified Foreign Intermediary is used, then the instruction must be a delivery."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OtherParties15> forOtherParties15 = new MMConstraint<OtherParties15>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QualifiedForeignIntermediaryRule";
			definition = "If Qualified Foreign Intermediary is used, then the instruction must be a delivery.";
			owner_lazy = () -> OtherParties15.mmObject();
		}

		@Override
		public void executeValidator(OtherParties15 obj) throws Exception {
			checkOtherParties15(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties18 OtherParties18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QualifiedForeignIntermediaryRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Qualified Foreign Intermediary is used, then the instruction must be a delivery."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OtherParties18> forOtherParties18 = new MMConstraint<OtherParties18>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QualifiedForeignIntermediaryRule";
			definition = "If Qualified Foreign Intermediary is used, then the instruction must be a delivery.";
			owner_lazy = () -> OtherParties18.mmObject();
		}

		@Override
		public void executeValidator(OtherParties18 obj) throws Exception {
			checkOtherParties18(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties12 OtherParties12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QualifiedForeignIntermediaryRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Qualified Foreign Intermediary is used, then the instruction must be a delivery."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OtherParties12> forOtherParties12 = new MMConstraint<OtherParties12>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QualifiedForeignIntermediaryRule";
			definition = "If Qualified Foreign Intermediary is used, then the instruction must be a delivery.";
			owner_lazy = () -> OtherParties12.mmObject();
		}

		@Override
		public void executeValidator(OtherParties12 obj) throws Exception {
			checkOtherParties12(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties17 OtherParties17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QualifiedForeignIntermediaryRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Qualified Foreign Intermediary is used, then the instruction must be a delivery."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OtherParties17> forOtherParties17 = new MMConstraint<OtherParties17>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QualifiedForeignIntermediaryRule";
			definition = "If Qualified Foreign Intermediary is used, then the instruction must be a delivery.";
			owner_lazy = () -> OtherParties17.mmObject();
		}

		@Override
		public void executeValidator(OtherParties17 obj) throws Exception {
			checkOtherParties17(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties27 OtherParties27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QualifiedForeignIntermediaryRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Qualified Foreign Intermediary is used, then the instruction must be a delivery."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintQualifiedForeignIntermediaryRule#forOtherParties19
	 * ConstraintQualifiedForeignIntermediaryRule.forOtherParties19}</li>
	 * </ul>
	 */
	public static final MMConstraint<OtherParties27> forOtherParties27 = new MMConstraint<OtherParties27>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QualifiedForeignIntermediaryRule";
			definition = "If Qualified Foreign Intermediary is used, then the instruction must be a delivery.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintQualifiedForeignIntermediaryRule.forOtherParties19;
			owner_lazy = () -> OtherParties27.mmObject();
		}

		@Override
		public void executeValidator(OtherParties27 obj) throws Exception {
			checkOtherParties27(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties29 OtherParties29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QualifiedForeignIntermediaryRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Qualified Foreign Intermediary is used, then the instruction must be a delivery."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OtherParties29> forOtherParties29 = new MMConstraint<OtherParties29>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QualifiedForeignIntermediaryRule";
			definition = "If Qualified Foreign Intermediary is used, then the instruction must be a delivery.";
			owner_lazy = () -> OtherParties29.mmObject();
		}

		@Override
		public void executeValidator(OtherParties29 obj) throws Exception {
			checkOtherParties29(obj);
		}
	};

	/**
	 * If Qualified Foreign Intermediary is used, then the instruction must be a
	 * delivery.
	 */
	public static void checkOtherParties2(OtherParties2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Qualified Foreign Intermediary is used, then the instruction must be a
	 * delivery.
	 */
	public static void checkOtherParties8(OtherParties8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Qualified Foreign Intermediary is used, then the instruction must be a
	 * delivery.
	 */
	public static void checkOtherParties19(OtherParties19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Qualified Foreign Intermediary is used, then the instruction must be a
	 * delivery.
	 */
	public static void checkOtherParties24(OtherParties24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Qualified Foreign Intermediary is used, then the instruction must be a
	 * delivery.
	 */
	public static void checkOtherParties7(OtherParties7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Qualified Foreign Intermediary is used, then the instruction must be a
	 * delivery.
	 */
	public static void checkOtherParties9(OtherParties9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Qualified Foreign Intermediary is used, then the instruction must be a
	 * delivery.
	 */
	public static void checkOtherParties14(OtherParties14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Qualified Foreign Intermediary is used, then the instruction must be a
	 * delivery.
	 */
	public static void checkOtherParties15(OtherParties15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Qualified Foreign Intermediary is used, then the instruction must be a
	 * delivery.
	 */
	public static void checkOtherParties18(OtherParties18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Qualified Foreign Intermediary is used, then the instruction must be a
	 * delivery.
	 */
	public static void checkOtherParties12(OtherParties12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Qualified Foreign Intermediary is used, then the instruction must be a
	 * delivery.
	 */
	public static void checkOtherParties17(OtherParties17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Qualified Foreign Intermediary is used, then the instruction must be a
	 * delivery.
	 */
	public static void checkOtherParties27(OtherParties27 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Qualified Foreign Intermediary is used, then the instruction must be a
	 * delivery.
	 */
	public static void checkOtherParties29(OtherParties29 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}