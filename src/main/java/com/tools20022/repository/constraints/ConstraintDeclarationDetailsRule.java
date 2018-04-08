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
 * Unless bilaterally agreed, DeclarionDetails must not contain information that
 * can be provided in a structured field.
 */
public class ConstraintDeclarationDetailsRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification57
	 * PartyIdentification57}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclarationDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed, DeclarionDetails must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification57> forPartyIdentification57 = new MMConstraint<PartyIdentification57>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclarationDetailsRule";
			definition = "Unless bilaterally agreed, DeclarionDetails must not contain information that can be provided in a structured field.";
			owner_lazy = () -> PartyIdentification57.mmObject();
		}

		@Override
		public void executeValidator(PartyIdentification57 obj) throws Exception {
			checkPartyIdentification57(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification51
	 * PartyIdentification51}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclarationDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed, DeclarionDetails must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification51> forPartyIdentification51 = new MMConstraint<PartyIdentification51>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclarationDetailsRule";
			definition = "Unless bilaterally agreed, DeclarionDetails must not contain information that can be provided in a structured field.";
			owner_lazy = () -> PartyIdentification51.mmObject();
		}

		@Override
		public void executeValidator(PartyIdentification51 obj) throws Exception {
			checkPartyIdentification51(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification56
	 * PartyIdentification56}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclarationDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed, DeclarionDetails must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDeclarationDetailsRule#forPartyIdentification93
	 * ConstraintDeclarationDetailsRule.forPartyIdentification93}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification56> forPartyIdentification56 = new MMConstraint<PartyIdentification56>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclarationDetailsRule";
			definition = "Unless bilaterally agreed, DeclarionDetails must not contain information that can be provided in a structured field.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDeclarationDetailsRule.forPartyIdentification93);
			owner_lazy = () -> PartyIdentification56.mmObject();
		}

		@Override
		public void executeValidator(PartyIdentification56 obj) throws Exception {
			checkPartyIdentification56(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification50
	 * PartyIdentification50}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclarationDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed, DeclarionDetails must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification50> forPartyIdentification50 = new MMConstraint<PartyIdentification50>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclarationDetailsRule";
			definition = "Unless bilaterally agreed, DeclarionDetails must not contain information that can be provided in a structured field.";
			owner_lazy = () -> PartyIdentification50.mmObject();
		}

		@Override
		public void executeValidator(PartyIdentification50 obj) throws Exception {
			checkPartyIdentification50(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification93
	 * PartyIdentification93}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclarationDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed, DeclarionDetails must not contain information that can be provided in a structured field."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDeclarationDetailsRule#forPartyIdentification56
	 * ConstraintDeclarationDetailsRule.forPartyIdentification56}</li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification93> forPartyIdentification93 = new MMConstraint<PartyIdentification93>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclarationDetailsRule";
			definition = "Unless bilaterally agreed, DeclarionDetails must not contain information that can be provided in a structured field.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDeclarationDetailsRule.forPartyIdentification56;
			owner_lazy = () -> PartyIdentification93.mmObject();
		}

		@Override
		public void executeValidator(PartyIdentification93 obj) throws Exception {
			checkPartyIdentification93(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification101
	 * PartyIdentification101}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclarationDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed, DeclarionDetails must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification101> forPartyIdentification101 = new MMConstraint<PartyIdentification101>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclarationDetailsRule";
			definition = "Unless bilaterally agreed, DeclarionDetails must not contain information that can be provided in a structured field.";
			owner_lazy = () -> PartyIdentification101.mmObject();
		}

		@Override
		public void executeValidator(PartyIdentification101 obj) throws Exception {
			checkPartyIdentification101(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification34
	 * PartyIdentification34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclarationDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed, DeclarionDetails must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification34> forPartyIdentification34 = new MMConstraint<PartyIdentification34>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclarationDetailsRule";
			definition = "Unless bilaterally agreed, DeclarionDetails must not contain information that can be provided in a structured field.";
			owner_lazy = () -> PartyIdentification34.mmObject();
		}

		@Override
		public void executeValidator(PartyIdentification34 obj) throws Exception {
			checkPartyIdentification34(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification33
	 * PartyIdentification33}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclarationDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unless bilaterally agreed, DeclarionDetails must not contain information that can be provided in a structured field."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification33> forPartyIdentification33 = new MMConstraint<PartyIdentification33>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclarationDetailsRule";
			definition = "Unless bilaterally agreed, DeclarionDetails must not contain information that can be provided in a structured field.";
			owner_lazy = () -> PartyIdentification33.mmObject();
		}

		@Override
		public void executeValidator(PartyIdentification33 obj) throws Exception {
			checkPartyIdentification33(obj);
		}
	};

	/**
	 * Unless bilaterally agreed, DeclarionDetails must not contain information
	 * that can be provided in a structured field.
	 */
	public static void checkPartyIdentification57(PartyIdentification57 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed, DeclarionDetails must not contain information
	 * that can be provided in a structured field.
	 */
	public static void checkPartyIdentification51(PartyIdentification51 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed, DeclarionDetails must not contain information
	 * that can be provided in a structured field.
	 */
	public static void checkPartyIdentification56(PartyIdentification56 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed, DeclarionDetails must not contain information
	 * that can be provided in a structured field.
	 */
	public static void checkPartyIdentification50(PartyIdentification50 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed, DeclarionDetails must not contain information
	 * that can be provided in a structured field.
	 */
	public static void checkPartyIdentification93(PartyIdentification93 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed, DeclarionDetails must not contain information
	 * that can be provided in a structured field.
	 */
	public static void checkPartyIdentification101(PartyIdentification101 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed, DeclarionDetails must not contain information
	 * that can be provided in a structured field.
	 */
	public static void checkPartyIdentification34(PartyIdentification34 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Unless bilaterally agreed, DeclarionDetails must not contain information
	 * that can be provided in a structured field.
	 */
	public static void checkPartyIdentification33(PartyIdentification33 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}