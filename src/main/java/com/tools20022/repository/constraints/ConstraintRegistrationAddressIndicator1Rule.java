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
import java.util.Arrays;

/**
 * If PrimaryOwner is present, then at least one occurrence of
 * PrimaryOwner/Organisation/Address/RegistrationAddressIndicator or of
 * PrimaryOwner/IndividualPerson/Address/RegistrationAddressIndicator must be
 * "true" or "1" (Yes).
 */
public class ConstraintRegistrationAddressIndicator1Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties2
	 * AccountParties2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationAddressIndicator1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PrimaryOwner is present, then at least one occurrence of PrimaryOwner/Organisation/Address/RegistrationAddressIndicator or of PrimaryOwner/IndividualPerson/Address/RegistrationAddressIndicator must be \"true\" or \"1\" (Yes)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountParties2> forAccountParties2 = new MMConstraint<AccountParties2>() {
		{
			validator = ConstraintRegistrationAddressIndicator1Rule::checkAccountParties2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationAddressIndicator1Rule";
			definition = "If PrimaryOwner is present, then at least one occurrence of PrimaryOwner/Organisation/Address/RegistrationAddressIndicator or of PrimaryOwner/IndividualPerson/Address/RegistrationAddressIndicator must be \"true\" or \"1\" (Yes).";
			owner_lazy = () -> AccountParties2.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties5
	 * AccountParties5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationAddressIndicator1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PrimaryOwner is present, then at least one occurrence of PrimaryOwner/Organisation/Address/RegistrationAddressIndicator or of PrimaryOwner/IndividualPerson/Address/RegistrationAddressIndicator must be \"true\" or \"1\" (Yes)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountParties5> forAccountParties5 = new MMConstraint<AccountParties5>() {
		{
			validator = ConstraintRegistrationAddressIndicator1Rule::checkAccountParties5;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationAddressIndicator1Rule";
			definition = "If PrimaryOwner is present, then at least one occurrence of PrimaryOwner/Organisation/Address/RegistrationAddressIndicator or of PrimaryOwner/IndividualPerson/Address/RegistrationAddressIndicator must be \"true\" or \"1\" (Yes).";
			owner_lazy = () -> AccountParties5.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties6
	 * AccountParties6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationAddressIndicator1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PrimaryOwner is present, then at least one occurrence of PrimaryOwner/Organisation/Address/RegistrationAddressIndicator or of PrimaryOwner/IndividualPerson/Address/RegistrationAddressIndicator must be \"true\" or \"1\" (Yes)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountParties6> forAccountParties6 = new MMConstraint<AccountParties6>() {
		{
			validator = ConstraintRegistrationAddressIndicator1Rule::checkAccountParties6;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationAddressIndicator1Rule";
			definition = "If PrimaryOwner is present, then at least one occurrence of PrimaryOwner/Organisation/Address/RegistrationAddressIndicator or of PrimaryOwner/IndividualPerson/Address/RegistrationAddressIndicator must be \"true\" or \"1\" (Yes).";
			owner_lazy = () -> AccountParties6.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties3
	 * AccountParties3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationAddressIndicator1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PrimaryOwner is present, then at least one occurrence of PrimaryOwner/Organisation/ModifiedAddress/Address/RegistrationAddressIndicator or of PrimaryOwner/IndividualPerson/ModifiedAddress/Address/RegistrationAddressIndicator must be \"true\" or \"1\" (Yes)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountParties3> forAccountParties3 = new MMConstraint<AccountParties3>() {
		{
			validator = ConstraintRegistrationAddressIndicator1Rule::checkAccountParties3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationAddressIndicator1Rule";
			definition = "If PrimaryOwner is present, then at least one occurrence of PrimaryOwner/Organisation/ModifiedAddress/Address/RegistrationAddressIndicator or of PrimaryOwner/IndividualPerson/ModifiedAddress/Address/RegistrationAddressIndicator must be \"true\" or \"1\" (Yes).";
			owner_lazy = () -> AccountParties3.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties4
	 * AccountParties4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationAddressIndicator1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PrimaryOwner is present, then at least one occurrence of PrimaryOwner/Organisation/ModifiedAddress/Address/RegistrationAddressIndicator or of PrimaryOwner/IndividualPerson/ModifiedAddress/Address/RegistrationAddressIndicator must be \"true\" or \"1\" (Yes)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountParties4> forAccountParties4 = new MMConstraint<AccountParties4>() {
		{
			validator = ConstraintRegistrationAddressIndicator1Rule::checkAccountParties4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationAddressIndicator1Rule";
			definition = "If PrimaryOwner is present, then at least one occurrence of PrimaryOwner/Organisation/ModifiedAddress/Address/RegistrationAddressIndicator or of PrimaryOwner/IndividualPerson/ModifiedAddress/Address/RegistrationAddressIndicator must be \"true\" or \"1\" (Yes).";
			owner_lazy = () -> AccountParties4.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties7
	 * AccountParties7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationAddressIndicator1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PrimaryOwner is present, then at least one occurrence of PrimaryOwner/Organisation/ModifiedAddress/Address/RegistrationAddressIndicator or of PrimaryOwner/IndividualPerson/ModifiedAddress/Address/RegistrationAddressIndicator must be \"true\" or \"1\" (Yes)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountParties7> forAccountParties7 = new MMConstraint<AccountParties7>() {
		{
			validator = ConstraintRegistrationAddressIndicator1Rule::checkAccountParties7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationAddressIndicator1Rule";
			definition = "If PrimaryOwner is present, then at least one occurrence of PrimaryOwner/Organisation/ModifiedAddress/Address/RegistrationAddressIndicator or of PrimaryOwner/IndividualPerson/ModifiedAddress/Address/RegistrationAddressIndicator must be \"true\" or \"1\" (Yes).";
			owner_lazy = () -> AccountParties7.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.AccountParties3Choice
	 * AccountParties3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationAddressIndicator1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PrimaryOwner is present, then at least one occurrence of Party/Organisation/ModifiedPostalAddress/PostalAddress/RegistrationAddressIndicator, or of \r\nParty/IndividualPerson/ModifiedPostalAddress/PostalAddress/RegistrationAddressIndicator must be \"true\" or \"1\" (Yes).\r\n"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRegistrationAddressIndicator1Rule#forAccountParties6Choice
	 * ConstraintRegistrationAddressIndicator1Rule.forAccountParties6Choice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountParties3Choice> forAccountParties3Choice = new MMConstraint<AccountParties3Choice>() {
		{
			validator = ConstraintRegistrationAddressIndicator1Rule::checkAccountParties3Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationAddressIndicator1Rule";
			definition = "If PrimaryOwner is present, then at least one occurrence of Party/Organisation/ModifiedPostalAddress/PostalAddress/RegistrationAddressIndicator, or of \r\nParty/IndividualPerson/ModifiedPostalAddress/PostalAddress/RegistrationAddressIndicator must be \"true\" or \"1\" (Yes).\r\n";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRegistrationAddressIndicator1Rule.forAccountParties6Choice);
			owner_lazy = () -> AccountParties3Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.AccountParties4Choice
	 * AccountParties4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationAddressIndicator1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PrimaryOwner is present, then at least one occurrence of PrimaryOwner/Party/Organisation/PostalAddress/RegistrationAddressIndicator must be \"true\" or \"1\" (Yes), or, at least one occurrence of PrimaryOwner/Party/IndividualPerson/PostalAddress/RegistrationAddressIndicator must be \"true\" or \"1\" (Yes).\r\n"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRegistrationAddressIndicator1Rule#forAccountParties7Choice
	 * ConstraintRegistrationAddressIndicator1Rule.forAccountParties7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRegistrationAddressIndicator1Rule#forAccountParties5Choice
	 * ConstraintRegistrationAddressIndicator1Rule.forAccountParties5Choice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountParties4Choice> forAccountParties4Choice = new MMConstraint<AccountParties4Choice>() {
		{
			validator = ConstraintRegistrationAddressIndicator1Rule::checkAccountParties4Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationAddressIndicator1Rule";
			definition = "If PrimaryOwner is present, then at least one occurrence of PrimaryOwner/Party/Organisation/PostalAddress/RegistrationAddressIndicator must be \"true\" or \"1\" (Yes), or, at least one occurrence of PrimaryOwner/Party/IndividualPerson/PostalAddress/RegistrationAddressIndicator must be \"true\" or \"1\" (Yes).\r\n";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRegistrationAddressIndicator1Rule.forAccountParties7Choice,
					com.tools20022.repository.constraints.ConstraintRegistrationAddressIndicator1Rule.forAccountParties5Choice);
			owner_lazy = () -> AccountParties4Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.AccountParties7Choice
	 * AccountParties7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationAddressIndicator1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PrimaryOwner is present, then at least one occurrence of PrimaryOwner/Party/Organisation/PostalAddress/RegistrationAddressIndicator must be \"true\" or \"1\" (Yes), or, at least one occurrence of PrimaryOwner/Party/IndividualPerson/PostalAddress/RegistrationAddressIndicator must be \"true\" or \"1\" (Yes).\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRegistrationAddressIndicator1Rule#forAccountParties4Choice
	 * ConstraintRegistrationAddressIndicator1Rule.forAccountParties4Choice}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountParties7Choice> forAccountParties7Choice = new MMConstraint<AccountParties7Choice>() {
		{
			validator = ConstraintRegistrationAddressIndicator1Rule::checkAccountParties7Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationAddressIndicator1Rule";
			definition = "If PrimaryOwner is present, then at least one occurrence of PrimaryOwner/Party/Organisation/PostalAddress/RegistrationAddressIndicator must be \"true\" or \"1\" (Yes), or, at least one occurrence of PrimaryOwner/Party/IndividualPerson/PostalAddress/RegistrationAddressIndicator must be \"true\" or \"1\" (Yes).\r\n";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRegistrationAddressIndicator1Rule.forAccountParties4Choice;
			owner_lazy = () -> AccountParties7Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.AccountParties6Choice
	 * AccountParties6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationAddressIndicator1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PrimaryOwner is present, then at least one occurrence of Party/Organisation/ModifiedPostalAddress/PostalAddress/RegistrationAddressIndicator, or of \r\nParty/IndividualPerson/ModifiedPostalAddress/PostalAddress/RegistrationAddressIndicator must be \"true\" or \"1\" (Yes).\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRegistrationAddressIndicator1Rule#forAccountParties3Choice
	 * ConstraintRegistrationAddressIndicator1Rule.forAccountParties3Choice}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountParties6Choice> forAccountParties6Choice = new MMConstraint<AccountParties6Choice>() {
		{
			validator = ConstraintRegistrationAddressIndicator1Rule::checkAccountParties6Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationAddressIndicator1Rule";
			definition = "If PrimaryOwner is present, then at least one occurrence of Party/Organisation/ModifiedPostalAddress/PostalAddress/RegistrationAddressIndicator, or of \r\nParty/IndividualPerson/ModifiedPostalAddress/PostalAddress/RegistrationAddressIndicator must be \"true\" or \"1\" (Yes).\r\n";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRegistrationAddressIndicator1Rule.forAccountParties3Choice;
			owner_lazy = () -> AccountParties6Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.AccountParties5Choice
	 * AccountParties5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationAddressIndicator1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PrimaryOwner is present, then at least one occurrence of PrimaryOwner/Party/Organisation/PostalAddress/RegistrationAddressIndicator must be \"true\" or \"1\" (Yes), or, at least one occurrence of PrimaryOwner/Party/IndividualPerson/PostalAddress/RegistrationAddressIndicator must be \"true\" or \"1\" (Yes).\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRegistrationAddressIndicator1Rule#forAccountParties4Choice
	 * ConstraintRegistrationAddressIndicator1Rule.forAccountParties4Choice}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountParties5Choice> forAccountParties5Choice = new MMConstraint<AccountParties5Choice>() {
		{
			validator = ConstraintRegistrationAddressIndicator1Rule::checkAccountParties5Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationAddressIndicator1Rule";
			definition = "If PrimaryOwner is present, then at least one occurrence of PrimaryOwner/Party/Organisation/PostalAddress/RegistrationAddressIndicator must be \"true\" or \"1\" (Yes), or, at least one occurrence of PrimaryOwner/Party/IndividualPerson/PostalAddress/RegistrationAddressIndicator must be \"true\" or \"1\" (Yes).\r\n";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRegistrationAddressIndicator1Rule.forAccountParties4Choice;
			owner_lazy = () -> AccountParties5Choice.mmObject();
		}
	};

	/**
	 * If PrimaryOwner is present, then at least one occurrence of
	 * PrimaryOwner/Organisation/Address/RegistrationAddressIndicator or of
	 * PrimaryOwner/IndividualPerson/Address/RegistrationAddressIndicator must
	 * be "true" or "1" (Yes).
	 */
	public static void checkAccountParties2(AccountParties2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PrimaryOwner is present, then at least one occurrence of
	 * PrimaryOwner/Organisation/Address/RegistrationAddressIndicator or of
	 * PrimaryOwner/IndividualPerson/Address/RegistrationAddressIndicator must
	 * be "true" or "1" (Yes).
	 */
	public static void checkAccountParties5(AccountParties5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PrimaryOwner is present, then at least one occurrence of
	 * PrimaryOwner/Organisation/Address/RegistrationAddressIndicator or of
	 * PrimaryOwner/IndividualPerson/Address/RegistrationAddressIndicator must
	 * be "true" or "1" (Yes).
	 */
	public static void checkAccountParties6(AccountParties6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PrimaryOwner is present, then at least one occurrence of
	 * PrimaryOwner/Organisation
	 * /ModifiedAddress/Address/RegistrationAddressIndicator or of
	 * PrimaryOwner/IndividualPerson
	 * /ModifiedAddress/Address/RegistrationAddressIndicator must be "true" or
	 * "1" (Yes).
	 */
	public static void checkAccountParties3(AccountParties3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PrimaryOwner is present, then at least one occurrence of
	 * PrimaryOwner/Organisation
	 * /ModifiedAddress/Address/RegistrationAddressIndicator or of
	 * PrimaryOwner/IndividualPerson
	 * /ModifiedAddress/Address/RegistrationAddressIndicator must be "true" or
	 * "1" (Yes).
	 */
	public static void checkAccountParties4(AccountParties4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PrimaryOwner is present, then at least one occurrence of
	 * PrimaryOwner/Organisation
	 * /ModifiedAddress/Address/RegistrationAddressIndicator or of
	 * PrimaryOwner/IndividualPerson
	 * /ModifiedAddress/Address/RegistrationAddressIndicator must be "true" or
	 * "1" (Yes).
	 */
	public static void checkAccountParties7(AccountParties7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PrimaryOwner is present, then at least one occurrence of
	 * Party/Organisation
	 * /ModifiedPostalAddress/PostalAddress/RegistrationAddressIndicator, or of <br>
	 * Party/IndividualPerson/ModifiedPostalAddress/PostalAddress/
	 * RegistrationAddressIndicator must be "true" or "1" (Yes).<br>
	 */
	public static void checkAccountParties3Choice(AccountParties3Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PrimaryOwner is present, then at least one occurrence of
	 * PrimaryOwner/Party
	 * /Organisation/PostalAddress/RegistrationAddressIndicator must be "true"
	 * or "1" (Yes), or, at least one occurrence of
	 * PrimaryOwner/Party/IndividualPerson
	 * /PostalAddress/RegistrationAddressIndicator must be "true" or "1" (Yes).<br>
	 */
	public static void checkAccountParties4Choice(AccountParties4Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PrimaryOwner is present, then at least one occurrence of
	 * PrimaryOwner/Party
	 * /Organisation/PostalAddress/RegistrationAddressIndicator must be "true"
	 * or "1" (Yes), or, at least one occurrence of
	 * PrimaryOwner/Party/IndividualPerson
	 * /PostalAddress/RegistrationAddressIndicator must be "true" or "1" (Yes).<br>
	 */
	public static void checkAccountParties7Choice(AccountParties7Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PrimaryOwner is present, then at least one occurrence of
	 * Party/Organisation
	 * /ModifiedPostalAddress/PostalAddress/RegistrationAddressIndicator, or of <br>
	 * Party/IndividualPerson/ModifiedPostalAddress/PostalAddress/
	 * RegistrationAddressIndicator must be "true" or "1" (Yes).<br>
	 */
	public static void checkAccountParties6Choice(AccountParties6Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PrimaryOwner is present, then at least one occurrence of
	 * PrimaryOwner/Party
	 * /Organisation/PostalAddress/RegistrationAddressIndicator must be "true"
	 * or "1" (Yes), or, at least one occurrence of
	 * PrimaryOwner/Party/IndividualPerson
	 * /PostalAddress/RegistrationAddressIndicator must be "true" or "1" (Yes).<br>
	 */
	public static void checkAccountParties5Choice(AccountParties5Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}