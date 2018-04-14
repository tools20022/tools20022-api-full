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
import com.tools20022.repository.msg.*;

/**
 * During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be
 * 34 characters or less. The field must not start or end with a slash ‘/’ or
 * contain two consecutive slashes ‘//’. In this message subset, a restricted
 * data type was implemented to comply with this coexistence rule.
 */
public class ConstraintCoexistencePartyProprietaryIdentificationRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification16Choice
	 * PartyIdentification16Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistencePartyProprietaryIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification16Choice> forPartyIdentification16Choice = new MMConstraint<PartyIdentification16Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistencePartyProprietaryIdentificationRule";
			definition = "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> PartyIdentification16Choice.mmObject();
		}

		@Override
		public void executeValidator(PartyIdentification16Choice obj) throws Exception {
			checkPartyIdentification16Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification62Choice
	 * PartyIdentification62Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistencePartyProprietaryIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification62Choice> forPartyIdentification62Choice = new MMConstraint<PartyIdentification62Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistencePartyProprietaryIdentificationRule";
			definition = "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’.";
			owner_lazy = () -> PartyIdentification62Choice.mmObject();
		}

		@Override
		public void executeValidator(PartyIdentification62Choice obj) throws Exception {
			checkPartyIdentification62Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification63Choice
	 * PartyIdentification63Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistencePartyProprietaryIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification63Choice> forPartyIdentification63Choice = new MMConstraint<PartyIdentification63Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistencePartyProprietaryIdentificationRule";
			definition = "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’.";
			owner_lazy = () -> PartyIdentification63Choice.mmObject();
		}

		@Override
		public void executeValidator(PartyIdentification63Choice obj) throws Exception {
			checkPartyIdentification63Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties12 OtherParties12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistencePartyProprietaryIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<OtherParties12> forOtherParties12 = new MMConstraint<OtherParties12>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistencePartyProprietaryIdentificationRule";
			definition = "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’.";
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
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification87Choice
	 * PartyIdentification87Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistencePartyProprietaryIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification87Choice> forPartyIdentification87Choice = new MMConstraint<PartyIdentification87Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistencePartyProprietaryIdentificationRule";
			definition = "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’.";
			owner_lazy = () -> PartyIdentification87Choice.mmObject();
		}

		@Override
		public void executeValidator(PartyIdentification87Choice obj) throws Exception {
			checkPartyIdentification87Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification43Choice
	 * PartyIdentification43Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistencePartyProprietaryIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification43Choice> forPartyIdentification43Choice = new MMConstraint<PartyIdentification43Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistencePartyProprietaryIdentificationRule";
			definition = "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’.";
			owner_lazy = () -> PartyIdentification43Choice.mmObject();
		}

		@Override
		public void executeValidator(PartyIdentification43Choice obj) throws Exception {
			checkPartyIdentification43Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification61Choice
	 * PartyIdentification61Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistencePartyProprietaryIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification61Choice> forPartyIdentification61Choice = new MMConstraint<PartyIdentification61Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistencePartyProprietaryIdentificationRule";
			definition = "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’.";
			owner_lazy = () -> PartyIdentification61Choice.mmObject();
		}

		@Override
		public void executeValidator(PartyIdentification61Choice obj) throws Exception {
			checkPartyIdentification61Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification10Choice
	 * PartyIdentification10Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistencePartyProprietaryIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification10Choice> forPartyIdentification10Choice = new MMConstraint<PartyIdentification10Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistencePartyProprietaryIdentificationRule";
			definition = "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’.";
			owner_lazy = () -> PartyIdentification10Choice.mmObject();
		}

		@Override
		public void executeValidator(PartyIdentification10Choice obj) throws Exception {
			checkPartyIdentification10Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties7 OtherParties7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistencePartyProprietaryIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<OtherParties7> forOtherParties7 = new MMConstraint<OtherParties7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistencePartyProprietaryIdentificationRule";
			definition = "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
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
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification66Choice
	 * PartyIdentification66Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistencePartyProprietaryIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification66Choice> forPartyIdentification66Choice = new MMConstraint<PartyIdentification66Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistencePartyProprietaryIdentificationRule";
			definition = "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’.";
			owner_lazy = () -> PartyIdentification66Choice.mmObject();
		}

		@Override
		public void executeValidator(PartyIdentification66Choice obj) throws Exception {
			checkPartyIdentification66Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification67Choice
	 * PartyIdentification67Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistencePartyProprietaryIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification67Choice> forPartyIdentification67Choice = new MMConstraint<PartyIdentification67Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistencePartyProprietaryIdentificationRule";
			definition = "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’.";
			owner_lazy = () -> PartyIdentification67Choice.mmObject();
		}

		@Override
		public void executeValidator(PartyIdentification67Choice obj) throws Exception {
			checkPartyIdentification67Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification45Choice
	 * PartyIdentification45Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistencePartyProprietaryIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification45Choice> forPartyIdentification45Choice = new MMConstraint<PartyIdentification45Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistencePartyProprietaryIdentificationRule";
			definition = "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’.";
			owner_lazy = () -> PartyIdentification45Choice.mmObject();
		}

		@Override
		public void executeValidator(PartyIdentification45Choice obj) throws Exception {
			checkPartyIdentification45Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification18Choice
	 * PartyIdentification18Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistencePartyProprietaryIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification18Choice> forPartyIdentification18Choice = new MMConstraint<PartyIdentification18Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistencePartyProprietaryIdentificationRule";
			definition = "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> PartyIdentification18Choice.mmObject();
		}

		@Override
		public void executeValidator(PartyIdentification18Choice obj) throws Exception {
			checkPartyIdentification18Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification51Choice
	 * PartyIdentification51Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistencePartyProprietaryIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification51Choice> forPartyIdentification51Choice = new MMConstraint<PartyIdentification51Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistencePartyProprietaryIdentificationRule";
			definition = "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’.";
			owner_lazy = () -> PartyIdentification51Choice.mmObject();
		}

		@Override
		public void executeValidator(PartyIdentification51Choice obj) throws Exception {
			checkPartyIdentification51Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties15 OtherParties15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistencePartyProprietaryIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<OtherParties15> forOtherParties15 = new MMConstraint<OtherParties15>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistencePartyProprietaryIdentificationRule";
			definition = "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’.";
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
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification54Choice
	 * PartyIdentification54Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistencePartyProprietaryIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification54Choice> forPartyIdentification54Choice = new MMConstraint<PartyIdentification54Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistencePartyProprietaryIdentificationRule";
			definition = "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’.";
			owner_lazy = () -> PartyIdentification54Choice.mmObject();
		}

		@Override
		public void executeValidator(PartyIdentification54Choice obj) throws Exception {
			checkPartyIdentification54Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties24 OtherParties24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistencePartyProprietaryIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<OtherParties24> forOtherParties24 = new MMConstraint<OtherParties24>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistencePartyProprietaryIdentificationRule";
			definition = "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’.";
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
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification31Choice
	 * PartyIdentification31Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistencePartyProprietaryIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification31Choice> forPartyIdentification31Choice = new MMConstraint<PartyIdentification31Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistencePartyProprietaryIdentificationRule";
			definition = "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> PartyIdentification31Choice.mmObject();
		}

		@Override
		public void executeValidator(PartyIdentification31Choice obj) throws Exception {
			checkPartyIdentification31Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification46Choice
	 * PartyIdentification46Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistencePartyProprietaryIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification46Choice> forPartyIdentification46Choice = new MMConstraint<PartyIdentification46Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistencePartyProprietaryIdentificationRule";
			definition = "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’.";
			owner_lazy = () -> PartyIdentification46Choice.mmObject();
		}

		@Override
		public void executeValidator(PartyIdentification46Choice obj) throws Exception {
			checkPartyIdentification46Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification60Choice
	 * PartyIdentification60Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistencePartyProprietaryIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification60Choice> forPartyIdentification60Choice = new MMConstraint<PartyIdentification60Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistencePartyProprietaryIdentificationRule";
			definition = "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’.";
			owner_lazy = () -> PartyIdentification60Choice.mmObject();
		}

		@Override
		public void executeValidator(PartyIdentification60Choice obj) throws Exception {
			checkPartyIdentification60Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification89Choice
	 * PartyIdentification89Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistencePartyProprietaryIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification89Choice> forPartyIdentification89Choice = new MMConstraint<PartyIdentification89Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistencePartyProprietaryIdentificationRule";
			definition = "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’.";
			owner_lazy = () -> PartyIdentification89Choice.mmObject();
		}

		@Override
		public void executeValidator(PartyIdentification89Choice obj) throws Exception {
			checkPartyIdentification89Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification49Choice
	 * PartyIdentification49Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistencePartyProprietaryIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification49Choice> forPartyIdentification49Choice = new MMConstraint<PartyIdentification49Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistencePartyProprietaryIdentificationRule";
			definition = "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’.";
			owner_lazy = () -> PartyIdentification49Choice.mmObject();
		}

		@Override
		public void executeValidator(PartyIdentification49Choice obj) throws Exception {
			checkPartyIdentification49Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification48Choice
	 * PartyIdentification48Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistencePartyProprietaryIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification48Choice> forPartyIdentification48Choice = new MMConstraint<PartyIdentification48Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistencePartyProprietaryIdentificationRule";
			definition = "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’.";
			owner_lazy = () -> PartyIdentification48Choice.mmObject();
		}

		@Override
		public void executeValidator(PartyIdentification48Choice obj) throws Exception {
			checkPartyIdentification48Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification30Choice
	 * PartyIdentification30Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistencePartyProprietaryIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification30Choice> forPartyIdentification30Choice = new MMConstraint<PartyIdentification30Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistencePartyProprietaryIdentificationRule";
			definition = "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’.";
			owner_lazy = () -> PartyIdentification30Choice.mmObject();
		}

		@Override
		public void executeValidator(PartyIdentification30Choice obj) throws Exception {
			checkPartyIdentification30Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification14Choice
	 * PartyIdentification14Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistencePartyProprietaryIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification14Choice> forPartyIdentification14Choice = new MMConstraint<PartyIdentification14Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistencePartyProprietaryIdentificationRule";
			definition = "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’.";
			owner_lazy = () -> PartyIdentification14Choice.mmObject();
		}

		@Override
		public void executeValidator(PartyIdentification14Choice obj) throws Exception {
			checkPartyIdentification14Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification41Choice
	 * PartyIdentification41Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistencePartyProprietaryIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification41Choice> forPartyIdentification41Choice = new MMConstraint<PartyIdentification41Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistencePartyProprietaryIdentificationRule";
			definition = "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’.";
			owner_lazy = () -> PartyIdentification41Choice.mmObject();
		}

		@Override
		public void executeValidator(PartyIdentification41Choice obj) throws Exception {
			checkPartyIdentification41Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification37Choice
	 * PartyIdentification37Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistencePartyProprietaryIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification37Choice> forPartyIdentification37Choice = new MMConstraint<PartyIdentification37Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistencePartyProprietaryIdentificationRule";
			definition = "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’.";
			owner_lazy = () -> PartyIdentification37Choice.mmObject();
		}

		@Override
		public void executeValidator(PartyIdentification37Choice obj) throws Exception {
			checkPartyIdentification37Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification65Choice
	 * PartyIdentification65Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistencePartyProprietaryIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification65Choice> forPartyIdentification65Choice = new MMConstraint<PartyIdentification65Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistencePartyProprietaryIdentificationRule";
			definition = "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’.";
			owner_lazy = () -> PartyIdentification65Choice.mmObject();
		}

		@Override
		public void executeValidator(PartyIdentification65Choice obj) throws Exception {
			checkPartyIdentification65Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification42Choice
	 * PartyIdentification42Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistencePartyProprietaryIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification42Choice> forPartyIdentification42Choice = new MMConstraint<PartyIdentification42Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistencePartyProprietaryIdentificationRule";
			definition = "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’.";
			owner_lazy = () -> PartyIdentification42Choice.mmObject();
		}

		@Override
		public void executeValidator(PartyIdentification42Choice obj) throws Exception {
			checkPartyIdentification42Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties9 OtherParties9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistencePartyProprietaryIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<OtherParties9> forOtherParties9 = new MMConstraint<OtherParties9>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistencePartyProprietaryIdentificationRule";
			definition = "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’.";
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
	 * {@linkplain com.tools20022.repository.msg.OtherParties8 OtherParties8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistencePartyProprietaryIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<OtherParties8> forOtherParties8 = new MMConstraint<OtherParties8>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistencePartyProprietaryIdentificationRule";
			definition = "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’.";
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
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification56Choice
	 * PartyIdentification56Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistencePartyProprietaryIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification56Choice> forPartyIdentification56Choice = new MMConstraint<PartyIdentification56Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistencePartyProprietaryIdentificationRule";
			definition = "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’.";
			owner_lazy = () -> PartyIdentification56Choice.mmObject();
		}

		@Override
		public void executeValidator(PartyIdentification56Choice obj) throws Exception {
			checkPartyIdentification56Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification15Choice
	 * PartyIdentification15Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistencePartyProprietaryIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification15Choice> forPartyIdentification15Choice = new MMConstraint<PartyIdentification15Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistencePartyProprietaryIdentificationRule";
			definition = "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> PartyIdentification15Choice.mmObject();
		}

		@Override
		public void executeValidator(PartyIdentification15Choice obj) throws Exception {
			checkPartyIdentification15Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification64Choice
	 * PartyIdentification64Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistencePartyProprietaryIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification64Choice> forPartyIdentification64Choice = new MMConstraint<PartyIdentification64Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistencePartyProprietaryIdentificationRule";
			definition = "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’.";
			owner_lazy = () -> PartyIdentification64Choice.mmObject();
		}

		@Override
		public void executeValidator(PartyIdentification64Choice obj) throws Exception {
			checkPartyIdentification64Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification57Choice
	 * PartyIdentification57Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistencePartyProprietaryIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification57Choice> forPartyIdentification57Choice = new MMConstraint<PartyIdentification57Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistencePartyProprietaryIdentificationRule";
			definition = "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’.";
			owner_lazy = () -> PartyIdentification57Choice.mmObject();
		}

		@Override
		public void executeValidator(PartyIdentification57Choice obj) throws Exception {
			checkPartyIdentification57Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification50Choice
	 * PartyIdentification50Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistencePartyProprietaryIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification50Choice> forPartyIdentification50Choice = new MMConstraint<PartyIdentification50Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistencePartyProprietaryIdentificationRule";
			definition = "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’.";
			owner_lazy = () -> PartyIdentification50Choice.mmObject();
		}

		@Override
		public void executeValidator(PartyIdentification50Choice obj) throws Exception {
			checkPartyIdentification50Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification88Choice
	 * PartyIdentification88Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistencePartyProprietaryIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification88Choice> forPartyIdentification88Choice = new MMConstraint<PartyIdentification88Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistencePartyProprietaryIdentificationRule";
			definition = "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’.";
			owner_lazy = () -> PartyIdentification88Choice.mmObject();
		}

		@Override
		public void executeValidator(PartyIdentification88Choice obj) throws Exception {
			checkPartyIdentification88Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties17 OtherParties17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistencePartyProprietaryIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<OtherParties17> forOtherParties17 = new MMConstraint<OtherParties17>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistencePartyProprietaryIdentificationRule";
			definition = "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’.";
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
	 * {@linkplain com.tools20022.repository.msg.OtherParties19 OtherParties19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistencePartyProprietaryIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<OtherParties19> forOtherParties19 = new MMConstraint<OtherParties19>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistencePartyProprietaryIdentificationRule";
			definition = "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’.";
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
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification55Choice
	 * PartyIdentification55Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistencePartyProprietaryIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification55Choice> forPartyIdentification55Choice = new MMConstraint<PartyIdentification55Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistencePartyProprietaryIdentificationRule";
			definition = "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’.";
			owner_lazy = () -> PartyIdentification55Choice.mmObject();
		}

		@Override
		public void executeValidator(PartyIdentification55Choice obj) throws Exception {
			checkPartyIdentification55Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification40Choice
	 * PartyIdentification40Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistencePartyProprietaryIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification40Choice> forPartyIdentification40Choice = new MMConstraint<PartyIdentification40Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistencePartyProprietaryIdentificationRule";
			definition = "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’.";
			owner_lazy = () -> PartyIdentification40Choice.mmObject();
		}

		@Override
		public void executeValidator(PartyIdentification40Choice obj) throws Exception {
			checkPartyIdentification40Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification47Choice
	 * PartyIdentification47Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistencePartyProprietaryIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification47Choice> forPartyIdentification47Choice = new MMConstraint<PartyIdentification47Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistencePartyProprietaryIdentificationRule";
			definition = "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’.";
			owner_lazy = () -> PartyIdentification47Choice.mmObject();
		}

		@Override
		public void executeValidator(PartyIdentification47Choice obj) throws Exception {
			checkPartyIdentification47Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification36Choice
	 * PartyIdentification36Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistencePartyProprietaryIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification36Choice> forPartyIdentification36Choice = new MMConstraint<PartyIdentification36Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistencePartyProprietaryIdentificationRule";
			definition = "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’.";
			owner_lazy = () -> PartyIdentification36Choice.mmObject();
		}

		@Override
		public void executeValidator(PartyIdentification36Choice obj) throws Exception {
			checkPartyIdentification36Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification52Choice
	 * PartyIdentification52Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistencePartyProprietaryIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification52Choice> forPartyIdentification52Choice = new MMConstraint<PartyIdentification52Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistencePartyProprietaryIdentificationRule";
			definition = "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’.";
			owner_lazy = () -> PartyIdentification52Choice.mmObject();
		}

		@Override
		public void executeValidator(PartyIdentification52Choice obj) throws Exception {
			checkPartyIdentification52Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification38Choice
	 * PartyIdentification38Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistencePartyProprietaryIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification38Choice> forPartyIdentification38Choice = new MMConstraint<PartyIdentification38Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistencePartyProprietaryIdentificationRule";
			definition = "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’.";
			owner_lazy = () -> PartyIdentification38Choice.mmObject();
		}

		@Override
		public void executeValidator(PartyIdentification38Choice obj) throws Exception {
			checkPartyIdentification38Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification59Choice
	 * PartyIdentification59Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistencePartyProprietaryIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification59Choice> forPartyIdentification59Choice = new MMConstraint<PartyIdentification59Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistencePartyProprietaryIdentificationRule";
			definition = "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’.";
			owner_lazy = () -> PartyIdentification59Choice.mmObject();
		}

		@Override
		public void executeValidator(PartyIdentification59Choice obj) throws Exception {
			checkPartyIdentification59Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification13Choice
	 * PartyIdentification13Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistencePartyProprietaryIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification13Choice> forPartyIdentification13Choice = new MMConstraint<PartyIdentification13Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistencePartyProprietaryIdentificationRule";
			definition = "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’.";
			owner_lazy = () -> PartyIdentification13Choice.mmObject();
		}

		@Override
		public void executeValidator(PartyIdentification13Choice obj) throws Exception {
			checkPartyIdentification13Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties14 OtherParties14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistencePartyProprietaryIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<OtherParties14> forOtherParties14 = new MMConstraint<OtherParties14>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistencePartyProprietaryIdentificationRule";
			definition = "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’.";
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
	 * {@linkplain com.tools20022.repository.msg.OtherParties2 OtherParties2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistencePartyProprietaryIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<OtherParties2> forOtherParties2 = new MMConstraint<OtherParties2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistencePartyProprietaryIdentificationRule";
			definition = "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’.";
			owner_lazy = () -> OtherParties2.mmObject();
		}

		@Override
		public void executeValidator(OtherParties2 obj) throws Exception {
			checkOtherParties2(obj);
		}
	};

	/**
	 * During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification
	 * must be 34 characters or less. The field must not start or end with a
	 * slash ‘/’ or contain two consecutive slashes ‘//’. In this message
	 * subset, a restricted data type was implemented to comply with this
	 * coexistence rule.
	 */
	public static void checkPartyIdentification16Choice(PartyIdentification16Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification
	 * must be 34 characters or less. The field must not start or end with a
	 * slash ‘/’ or contain two consecutive slashes ‘//’.
	 */
	public static void checkPartyIdentification62Choice(PartyIdentification62Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification
	 * must be 34 characters or less. The field must not start or end with a
	 * slash ‘/’ or contain two consecutive slashes ‘//’.
	 */
	public static void checkPartyIdentification63Choice(PartyIdentification63Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification
	 * must be 34 characters or less. The field must not start or end with a
	 * slash ‘/’ or contain two consecutive slashes ‘//’.
	 */
	public static void checkOtherParties12(OtherParties12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification
	 * must be 34 characters or less. The field must not start or end with a
	 * slash ‘/’ or contain two consecutive slashes ‘//’.
	 */
	public static void checkPartyIdentification87Choice(PartyIdentification87Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification
	 * must be 34 characters or less. The field must not start or end with a
	 * slash ‘/’ or contain two consecutive slashes ‘//’.
	 */
	public static void checkPartyIdentification43Choice(PartyIdentification43Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification
	 * must be 34 characters or less. The field must not start or end with a
	 * slash ‘/’ or contain two consecutive slashes ‘//’.
	 */
	public static void checkPartyIdentification61Choice(PartyIdentification61Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification
	 * must be 34 characters or less. The field must not start or end with a
	 * slash ‘/’ or contain two consecutive slashes ‘//’.
	 */
	public static void checkPartyIdentification10Choice(PartyIdentification10Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification
	 * must be 34 characters or less. The field must not start or end with a
	 * slash ‘/’ or contain two consecutive slashes ‘//’. In this message
	 * subset, a restricted data type was implemented to comply with this
	 * coexistence rule.
	 */
	public static void checkOtherParties7(OtherParties7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification
	 * must be 34 characters or less. The field must not start or end with a
	 * slash ‘/’ or contain two consecutive slashes ‘//’.
	 */
	public static void checkPartyIdentification66Choice(PartyIdentification66Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification
	 * must be 34 characters or less. The field must not start or end with a
	 * slash ‘/’ or contain two consecutive slashes ‘//’.
	 */
	public static void checkPartyIdentification67Choice(PartyIdentification67Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification
	 * must be 34 characters or less. The field must not start or end with a
	 * slash ‘/’ or contain two consecutive slashes ‘//’.
	 */
	public static void checkPartyIdentification45Choice(PartyIdentification45Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification
	 * must be 34 characters or less. The field must not start or end with a
	 * slash ‘/’ or contain two consecutive slashes ‘//’. In this message
	 * subset, a restricted data type was implemented to comply with this
	 * coexistence rule.
	 */
	public static void checkPartyIdentification18Choice(PartyIdentification18Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification
	 * must be 34 characters or less. The field must not start or end with a
	 * slash ‘/’ or contain two consecutive slashes ‘//’.
	 */
	public static void checkPartyIdentification51Choice(PartyIdentification51Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification
	 * must be 34 characters or less. The field must not start or end with a
	 * slash ‘/’ or contain two consecutive slashes ‘//’.
	 */
	public static void checkOtherParties15(OtherParties15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification
	 * must be 34 characters or less. The field must not start or end with a
	 * slash ‘/’ or contain two consecutive slashes ‘//’.
	 */
	public static void checkPartyIdentification54Choice(PartyIdentification54Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification
	 * must be 34 characters or less. The field must not start or end with a
	 * slash ‘/’ or contain two consecutive slashes ‘//’.
	 */
	public static void checkOtherParties24(OtherParties24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification
	 * must be 34 characters or less. The field must not start or end with a
	 * slash ‘/’ or contain two consecutive slashes ‘//’. In this message
	 * subset, a restricted data type was implemented to comply with this
	 * coexistence rule.
	 */
	public static void checkPartyIdentification31Choice(PartyIdentification31Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification
	 * must be 34 characters or less. The field must not start or end with a
	 * slash ‘/’ or contain two consecutive slashes ‘//’.
	 */
	public static void checkPartyIdentification46Choice(PartyIdentification46Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification
	 * must be 34 characters or less. The field must not start or end with a
	 * slash ‘/’ or contain two consecutive slashes ‘//’.
	 */
	public static void checkPartyIdentification60Choice(PartyIdentification60Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification
	 * must be 34 characters or less. The field must not start or end with a
	 * slash ‘/’ or contain two consecutive slashes ‘//’.
	 */
	public static void checkPartyIdentification89Choice(PartyIdentification89Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification
	 * must be 34 characters or less. The field must not start or end with a
	 * slash ‘/’ or contain two consecutive slashes ‘//’.
	 */
	public static void checkPartyIdentification49Choice(PartyIdentification49Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification
	 * must be 34 characters or less. The field must not start or end with a
	 * slash ‘/’ or contain two consecutive slashes ‘//’.
	 */
	public static void checkPartyIdentification48Choice(PartyIdentification48Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification
	 * must be 34 characters or less. The field must not start or end with a
	 * slash ‘/’ or contain two consecutive slashes ‘//’.
	 */
	public static void checkPartyIdentification30Choice(PartyIdentification30Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification
	 * must be 34 characters or less. The field must not start or end with a
	 * slash ‘/’ or contain two consecutive slashes ‘//’.
	 */
	public static void checkPartyIdentification14Choice(PartyIdentification14Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification
	 * must be 34 characters or less. The field must not start or end with a
	 * slash ‘/’ or contain two consecutive slashes ‘//’.
	 */
	public static void checkPartyIdentification41Choice(PartyIdentification41Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification
	 * must be 34 characters or less. The field must not start or end with a
	 * slash ‘/’ or contain two consecutive slashes ‘//’.
	 */
	public static void checkPartyIdentification37Choice(PartyIdentification37Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification
	 * must be 34 characters or less. The field must not start or end with a
	 * slash ‘/’ or contain two consecutive slashes ‘//’.
	 */
	public static void checkPartyIdentification65Choice(PartyIdentification65Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification
	 * must be 34 characters or less. The field must not start or end with a
	 * slash ‘/’ or contain two consecutive slashes ‘//’.
	 */
	public static void checkPartyIdentification42Choice(PartyIdentification42Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification
	 * must be 34 characters or less. The field must not start or end with a
	 * slash ‘/’ or contain two consecutive slashes ‘//’.
	 */
	public static void checkOtherParties9(OtherParties9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification
	 * must be 34 characters or less. The field must not start or end with a
	 * slash ‘/’ or contain two consecutive slashes ‘//’.
	 */
	public static void checkOtherParties8(OtherParties8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification
	 * must be 34 characters or less. The field must not start or end with a
	 * slash ‘/’ or contain two consecutive slashes ‘//’.
	 */
	public static void checkPartyIdentification56Choice(PartyIdentification56Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification
	 * must be 34 characters or less. The field must not start or end with a
	 * slash ‘/’ or contain two consecutive slashes ‘//’. In this message
	 * subset, a restricted data type was implemented to comply with this
	 * coexistence rule.
	 */
	public static void checkPartyIdentification15Choice(PartyIdentification15Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification
	 * must be 34 characters or less. The field must not start or end with a
	 * slash ‘/’ or contain two consecutive slashes ‘//’.
	 */
	public static void checkPartyIdentification64Choice(PartyIdentification64Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification
	 * must be 34 characters or less. The field must not start or end with a
	 * slash ‘/’ or contain two consecutive slashes ‘//’.
	 */
	public static void checkPartyIdentification57Choice(PartyIdentification57Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification
	 * must be 34 characters or less. The field must not start or end with a
	 * slash ‘/’ or contain two consecutive slashes ‘//’.
	 */
	public static void checkPartyIdentification50Choice(PartyIdentification50Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification
	 * must be 34 characters or less. The field must not start or end with a
	 * slash ‘/’ or contain two consecutive slashes ‘//’.
	 */
	public static void checkPartyIdentification88Choice(PartyIdentification88Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification
	 * must be 34 characters or less. The field must not start or end with a
	 * slash ‘/’ or contain two consecutive slashes ‘//’.
	 */
	public static void checkOtherParties17(OtherParties17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification
	 * must be 34 characters or less. The field must not start or end with a
	 * slash ‘/’ or contain two consecutive slashes ‘//’.
	 */
	public static void checkOtherParties19(OtherParties19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification
	 * must be 34 characters or less. The field must not start or end with a
	 * slash ‘/’ or contain two consecutive slashes ‘//’.
	 */
	public static void checkPartyIdentification55Choice(PartyIdentification55Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification
	 * must be 34 characters or less. The field must not start or end with a
	 * slash ‘/’ or contain two consecutive slashes ‘//’.
	 */
	public static void checkPartyIdentification40Choice(PartyIdentification40Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification
	 * must be 34 characters or less. The field must not start or end with a
	 * slash ‘/’ or contain two consecutive slashes ‘//’.
	 */
	public static void checkPartyIdentification47Choice(PartyIdentification47Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification
	 * must be 34 characters or less. The field must not start or end with a
	 * slash ‘/’ or contain two consecutive slashes ‘//’.
	 */
	public static void checkPartyIdentification36Choice(PartyIdentification36Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification
	 * must be 34 characters or less. The field must not start or end with a
	 * slash ‘/’ or contain two consecutive slashes ‘//’.
	 */
	public static void checkPartyIdentification52Choice(PartyIdentification52Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification
	 * must be 34 characters or less. The field must not start or end with a
	 * slash ‘/’ or contain two consecutive slashes ‘//’.
	 */
	public static void checkPartyIdentification38Choice(PartyIdentification38Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification
	 * must be 34 characters or less. The field must not start or end with a
	 * slash ‘/’ or contain two consecutive slashes ‘//’.
	 */
	public static void checkPartyIdentification59Choice(PartyIdentification59Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification
	 * must be 34 characters or less. The field must not start or end with a
	 * slash ‘/’ or contain two consecutive slashes ‘//’.
	 */
	public static void checkPartyIdentification13Choice(PartyIdentification13Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification
	 * must be 34 characters or less. The field must not start or end with a
	 * slash ‘/’ or contain two consecutive slashes ‘//’.
	 */
	public static void checkOtherParties14(OtherParties14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification
	 * must be 34 characters or less. The field must not start or end with a
	 * slash ‘/’ or contain two consecutive slashes ‘//’.
	 */
	public static void checkOtherParties2(OtherParties2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}