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

/**
 * During ISO 15022 – 20022 coexistence, the total of characters used in
 * NameAndAddress must not be greater than 140.
 */
public class ConstraintCoexistenceNameAndAdressRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification10Choice
	 * PartyIdentification10Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceNameAndAdressRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, the total of characters used in NameAndAddress must not be greater than 140."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification10Choice> forPartyIdentification10Choice = new MMConstraint<PartyIdentification10Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceNameAndAdressRule";
			definition = "During ISO 15022 – 20022 coexistence, the total of characters used in NameAndAddress must not be greater than 140.";
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
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification14Choice
	 * PartyIdentification14Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceNameAndAdressRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, the total of characters used in NameAndAddress must not be greater than 140."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification14Choice> forPartyIdentification14Choice = new MMConstraint<PartyIdentification14Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceNameAndAdressRule";
			definition = "During ISO 15022 – 20022 coexistence, the total of characters used in NameAndAddress must not be greater than 140.";
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
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification45Choice
	 * PartyIdentification45Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceNameAndAdressRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, the total of characters used in NameAndAddress must not be greater than 140."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification45Choice> forPartyIdentification45Choice = new MMConstraint<PartyIdentification45Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceNameAndAdressRule";
			definition = "During ISO 15022 – 20022 coexistence, the total of characters used in NameAndAddress must not be greater than 140.";
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
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification37Choice
	 * PartyIdentification37Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceNameAndAdressRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, the total of characters used in NameAndAddress must not be greater than 140."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification37Choice> forPartyIdentification37Choice = new MMConstraint<PartyIdentification37Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceNameAndAdressRule";
			definition = "During ISO 15022 – 20022 coexistence, the total of characters used in NameAndAddress must not be greater than 140.";
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
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification43Choice
	 * PartyIdentification43Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceNameAndAdressRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, the total of characters used in NameAndAddress must not be greater than 140."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification43Choice> forPartyIdentification43Choice = new MMConstraint<PartyIdentification43Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceNameAndAdressRule";
			definition = "During ISO 15022 – 20022 coexistence, the total of characters used in NameAndAddress must not be greater than 140.";
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
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification30Choice
	 * PartyIdentification30Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceNameAndAdressRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, the total of characters used in NameAndAddress must not be greater than 140."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification30Choice> forPartyIdentification30Choice = new MMConstraint<PartyIdentification30Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceNameAndAdressRule";
			definition = "During ISO 15022 – 20022 coexistence, the total of characters used in NameAndAddress must not be greater than 140.";
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
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification38Choice
	 * PartyIdentification38Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceNameAndAdressRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, the total of characters used in NameAndAddress must not be greater than 140."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification38Choice> forPartyIdentification38Choice = new MMConstraint<PartyIdentification38Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceNameAndAdressRule";
			definition = "During ISO 15022 – 20022 coexistence, the total of characters used in NameAndAddress must not be greater than 140.";
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
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification62Choice
	 * PartyIdentification62Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceNameAndAdressRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, the total of characters used in NameAndAddress must not be greater than 140."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification62Choice> forPartyIdentification62Choice = new MMConstraint<PartyIdentification62Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceNameAndAdressRule";
			definition = "During ISO 15022 – 20022 coexistence, the total of characters used in NameAndAddress must not be greater than 140.";
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
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification60Choice
	 * PartyIdentification60Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceNameAndAdressRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, the total of characters used in NameAndAddress must not be greater than 140."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification60Choice> forPartyIdentification60Choice = new MMConstraint<PartyIdentification60Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceNameAndAdressRule";
			definition = "During ISO 15022 – 20022 coexistence, the total of characters used in NameAndAddress must not be greater than 140.";
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
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification65Choice
	 * PartyIdentification65Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceNameAndAdressRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, the total of characters used in NameAndAddress must not be greater than 140."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification65Choice> forPartyIdentification65Choice = new MMConstraint<PartyIdentification65Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceNameAndAdressRule";
			definition = "During ISO 15022 – 20022 coexistence, the total of characters used in NameAndAddress must not be greater than 140.";
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
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification61Choice
	 * PartyIdentification61Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceNameAndAdressRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, the total of characters used in NameAndAddress must not be greater than 140."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification61Choice> forPartyIdentification61Choice = new MMConstraint<PartyIdentification61Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceNameAndAdressRule";
			definition = "During ISO 15022 – 20022 coexistence, the total of characters used in NameAndAddress must not be greater than 140.";
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
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification16Choice
	 * PartyIdentification16Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceNameAndAdressRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, the total of characters used in NameAndAddress must not be greater than 140. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification16Choice> forPartyIdentification16Choice = new MMConstraint<PartyIdentification16Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceNameAndAdressRule";
			definition = "During ISO 15022 – 20022 coexistence, the total of characters used in NameAndAddress must not be greater than 140. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
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
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification46Choice
	 * PartyIdentification46Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceNameAndAdressRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, the total of characters used in NameAndAddress must not be greater than 140."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification46Choice> forPartyIdentification46Choice = new MMConstraint<PartyIdentification46Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceNameAndAdressRule";
			definition = "During ISO 15022 – 20022 coexistence, the total of characters used in NameAndAddress must not be greater than 140.";
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
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification56Choice
	 * PartyIdentification56Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceNameAndAdressRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, the total of characters used in NameAndAddress must not be greater than 140."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification56Choice> forPartyIdentification56Choice = new MMConstraint<PartyIdentification56Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceNameAndAdressRule";
			definition = "During ISO 15022 – 20022 coexistence, the total of characters used in NameAndAddress must not be greater than 140.";
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
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification48Choice
	 * PartyIdentification48Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceNameAndAdressRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, the total of characters used in NameAndAddress must not be greater than 140."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification48Choice> forPartyIdentification48Choice = new MMConstraint<PartyIdentification48Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceNameAndAdressRule";
			definition = "During ISO 15022 – 20022 coexistence, the total of characters used in NameAndAddress must not be greater than 140.";
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
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification52Choice
	 * PartyIdentification52Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceNameAndAdressRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, the total of characters used in NameAndAddress must not be greater than 140."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification52Choice> forPartyIdentification52Choice = new MMConstraint<PartyIdentification52Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceNameAndAdressRule";
			definition = "During ISO 15022 – 20022 coexistence, the total of characters used in NameAndAddress must not be greater than 140.";
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
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification31Choice
	 * PartyIdentification31Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceNameAndAdressRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, the total of characters used in NameAndAddress must not be greater than 140. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification31Choice> forPartyIdentification31Choice = new MMConstraint<PartyIdentification31Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceNameAndAdressRule";
			definition = "During ISO 15022 – 20022 coexistence, the total of characters used in NameAndAddress must not be greater than 140. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
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
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification40Choice
	 * PartyIdentification40Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceNameAndAdressRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, the total of characters used in NameAndAddress must not be greater than 140."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification40Choice> forPartyIdentification40Choice = new MMConstraint<PartyIdentification40Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceNameAndAdressRule";
			definition = "During ISO 15022 – 20022 coexistence, the total of characters used in NameAndAddress must not be greater than 140.";
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
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification42Choice
	 * PartyIdentification42Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceNameAndAdressRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, the total of characters used in NameAndAddress must not be greater than 140."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification42Choice> forPartyIdentification42Choice = new MMConstraint<PartyIdentification42Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceNameAndAdressRule";
			definition = "During ISO 15022 – 20022 coexistence, the total of characters used in NameAndAddress must not be greater than 140.";
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
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification54Choice
	 * PartyIdentification54Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceNameAndAdressRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, the total of characters used in NameAndAddress must not be greater than 140."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification54Choice> forPartyIdentification54Choice = new MMConstraint<PartyIdentification54Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceNameAndAdressRule";
			definition = "During ISO 15022 – 20022 coexistence, the total of characters used in NameAndAddress must not be greater than 140.";
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
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification55Choice
	 * PartyIdentification55Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceNameAndAdressRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, the total of characters used in NameAndAddress must not be greater than 140."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification55Choice> forPartyIdentification55Choice = new MMConstraint<PartyIdentification55Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceNameAndAdressRule";
			definition = "During ISO 15022 – 20022 coexistence, the total of characters used in NameAndAddress must not be greater than 140.";
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
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification47Choice
	 * PartyIdentification47Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceNameAndAdressRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, the total of characters used in NameAndAddress must not be greater than 140."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification47Choice> forPartyIdentification47Choice = new MMConstraint<PartyIdentification47Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceNameAndAdressRule";
			definition = "During ISO 15022 – 20022 coexistence, the total of characters used in NameAndAddress must not be greater than 140.";
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
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification57Choice
	 * PartyIdentification57Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceNameAndAdressRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, the total of characters used in NameAndAddress must not be greater than 140."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification57Choice> forPartyIdentification57Choice = new MMConstraint<PartyIdentification57Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceNameAndAdressRule";
			definition = "During ISO 15022 – 20022 coexistence, the total of characters used in NameAndAddress must not be greater than 140.";
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
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification49Choice
	 * PartyIdentification49Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceNameAndAdressRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, the total of characters used in NameAndAddress must not be greater than 140."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification49Choice> forPartyIdentification49Choice = new MMConstraint<PartyIdentification49Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceNameAndAdressRule";
			definition = "During ISO 15022 – 20022 coexistence, the total of characters used in NameAndAddress must not be greater than 140.";
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
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification59Choice
	 * PartyIdentification59Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceNameAndAdressRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, the total of characters used in NameAndAddress must not be greater than 140."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification59Choice> forPartyIdentification59Choice = new MMConstraint<PartyIdentification59Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceNameAndAdressRule";
			definition = "During ISO 15022 – 20022 coexistence, the total of characters used in NameAndAddress must not be greater than 140.";
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
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification63Choice
	 * PartyIdentification63Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceNameAndAdressRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, the total of characters used in NameAndAddress must not be greater than 140."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification63Choice> forPartyIdentification63Choice = new MMConstraint<PartyIdentification63Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceNameAndAdressRule";
			definition = "During ISO 15022 – 20022 coexistence, the total of characters used in NameAndAddress must not be greater than 140.";
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
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification15Choice
	 * PartyIdentification15Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceNameAndAdressRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, the total of characters used in NameAndAddress must not be greater than 140. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification15Choice> forPartyIdentification15Choice = new MMConstraint<PartyIdentification15Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceNameAndAdressRule";
			definition = "During ISO 15022 – 20022 coexistence, the total of characters used in NameAndAddress must not be greater than 140. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
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
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification66Choice
	 * PartyIdentification66Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceNameAndAdressRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, the total of characters used in NameAndAddress must not be greater than 140."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification66Choice> forPartyIdentification66Choice = new MMConstraint<PartyIdentification66Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceNameAndAdressRule";
			definition = "During ISO 15022 – 20022 coexistence, the total of characters used in NameAndAddress must not be greater than 140.";
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceNameAndAdressRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, the total of characters used in NameAndAddress must not be greater than 140."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification67Choice> forPartyIdentification67Choice = new MMConstraint<PartyIdentification67Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceNameAndAdressRule";
			definition = "During ISO 15022 – 20022 coexistence, the total of characters used in NameAndAddress must not be greater than 140.";
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
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification89Choice
	 * PartyIdentification89Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceNameAndAdressRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, the total of characters used in NameAndAddress must not be greater than 140."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification89Choice> forPartyIdentification89Choice = new MMConstraint<PartyIdentification89Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceNameAndAdressRule";
			definition = "During ISO 15022 – 20022 coexistence, the total of characters used in NameAndAddress must not be greater than 140.";
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
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification87Choice
	 * PartyIdentification87Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceNameAndAdressRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, the total of characters used in NameAndAddress must not be greater than 140."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification87Choice> forPartyIdentification87Choice = new MMConstraint<PartyIdentification87Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceNameAndAdressRule";
			definition = "During ISO 15022 – 20022 coexistence, the total of characters used in NameAndAddress must not be greater than 140.";
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
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification88Choice
	 * PartyIdentification88Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceNameAndAdressRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, the total of characters used in NameAndAddress must not be greater than 140."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification88Choice> forPartyIdentification88Choice = new MMConstraint<PartyIdentification88Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceNameAndAdressRule";
			definition = "During ISO 15022 – 20022 coexistence, the total of characters used in NameAndAddress must not be greater than 140.";
			owner_lazy = () -> PartyIdentification88Choice.mmObject();
		}

		@Override
		public void executeValidator(PartyIdentification88Choice obj) throws Exception {
			checkPartyIdentification88Choice(obj);
		}
	};

	/**
	 * During ISO 15022 – 20022 coexistence, the total of characters used in
	 * NameAndAddress must not be greater than 140.
	 */
	public static void checkPartyIdentification10Choice(PartyIdentification10Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, the total of characters used in
	 * NameAndAddress must not be greater than 140.
	 */
	public static void checkPartyIdentification14Choice(PartyIdentification14Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, the total of characters used in
	 * NameAndAddress must not be greater than 140.
	 */
	public static void checkPartyIdentification45Choice(PartyIdentification45Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, the total of characters used in
	 * NameAndAddress must not be greater than 140.
	 */
	public static void checkPartyIdentification37Choice(PartyIdentification37Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, the total of characters used in
	 * NameAndAddress must not be greater than 140.
	 */
	public static void checkPartyIdentification43Choice(PartyIdentification43Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, the total of characters used in
	 * NameAndAddress must not be greater than 140.
	 */
	public static void checkPartyIdentification30Choice(PartyIdentification30Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, the total of characters used in
	 * NameAndAddress must not be greater than 140.
	 */
	public static void checkPartyIdentification38Choice(PartyIdentification38Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, the total of characters used in
	 * NameAndAddress must not be greater than 140.
	 */
	public static void checkPartyIdentification62Choice(PartyIdentification62Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, the total of characters used in
	 * NameAndAddress must not be greater than 140.
	 */
	public static void checkPartyIdentification60Choice(PartyIdentification60Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, the total of characters used in
	 * NameAndAddress must not be greater than 140.
	 */
	public static void checkPartyIdentification65Choice(PartyIdentification65Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, the total of characters used in
	 * NameAndAddress must not be greater than 140.
	 */
	public static void checkPartyIdentification61Choice(PartyIdentification61Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, the total of characters used in
	 * NameAndAddress must not be greater than 140. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkPartyIdentification16Choice(PartyIdentification16Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, the total of characters used in
	 * NameAndAddress must not be greater than 140.
	 */
	public static void checkPartyIdentification46Choice(PartyIdentification46Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, the total of characters used in
	 * NameAndAddress must not be greater than 140.
	 */
	public static void checkPartyIdentification56Choice(PartyIdentification56Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, the total of characters used in
	 * NameAndAddress must not be greater than 140.
	 */
	public static void checkPartyIdentification48Choice(PartyIdentification48Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, the total of characters used in
	 * NameAndAddress must not be greater than 140.
	 */
	public static void checkPartyIdentification52Choice(PartyIdentification52Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, the total of characters used in
	 * NameAndAddress must not be greater than 140. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkPartyIdentification31Choice(PartyIdentification31Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, the total of characters used in
	 * NameAndAddress must not be greater than 140.
	 */
	public static void checkPartyIdentification40Choice(PartyIdentification40Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, the total of characters used in
	 * NameAndAddress must not be greater than 140.
	 */
	public static void checkPartyIdentification42Choice(PartyIdentification42Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, the total of characters used in
	 * NameAndAddress must not be greater than 140.
	 */
	public static void checkPartyIdentification54Choice(PartyIdentification54Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, the total of characters used in
	 * NameAndAddress must not be greater than 140.
	 */
	public static void checkPartyIdentification55Choice(PartyIdentification55Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, the total of characters used in
	 * NameAndAddress must not be greater than 140.
	 */
	public static void checkPartyIdentification47Choice(PartyIdentification47Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, the total of characters used in
	 * NameAndAddress must not be greater than 140.
	 */
	public static void checkPartyIdentification57Choice(PartyIdentification57Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, the total of characters used in
	 * NameAndAddress must not be greater than 140.
	 */
	public static void checkPartyIdentification49Choice(PartyIdentification49Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, the total of characters used in
	 * NameAndAddress must not be greater than 140.
	 */
	public static void checkPartyIdentification59Choice(PartyIdentification59Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, the total of characters used in
	 * NameAndAddress must not be greater than 140.
	 */
	public static void checkPartyIdentification63Choice(PartyIdentification63Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, the total of characters used in
	 * NameAndAddress must not be greater than 140. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkPartyIdentification15Choice(PartyIdentification15Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, the total of characters used in
	 * NameAndAddress must not be greater than 140.
	 */
	public static void checkPartyIdentification66Choice(PartyIdentification66Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, the total of characters used in
	 * NameAndAddress must not be greater than 140.
	 */
	public static void checkPartyIdentification67Choice(PartyIdentification67Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, the total of characters used in
	 * NameAndAddress must not be greater than 140.
	 */
	public static void checkPartyIdentification89Choice(PartyIdentification89Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, the total of characters used in
	 * NameAndAddress must not be greater than 140.
	 */
	public static void checkPartyIdentification87Choice(PartyIdentification87Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, the total of characters used in
	 * NameAndAddress must not be greater than 140.
	 */
	public static void checkPartyIdentification88Choice(PartyIdentification88Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}