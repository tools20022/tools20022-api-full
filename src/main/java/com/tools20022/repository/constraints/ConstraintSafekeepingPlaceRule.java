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
 * The SafekeepingPlace functionality in the settlement instructions is only to
 * be used for global custodians that allow their clients to specify where the
 * securities are to be held, for example, in an ICSD account versus an account
 * at the local CSD.
 */
public class ConstraintSafekeepingPlaceRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount30
	 * QuantityAndAccount30}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule#forQuantityAndAccount43
	 * ConstraintSafekeepingPlaceRule.forQuantityAndAccount43}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount30> forQuantityAndAccount30 = new MMConstraint<QuantityAndAccount30>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule.forQuantityAndAccount43);
			owner_lazy = () -> QuantityAndAccount30.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount30 obj) throws Exception {
			checkQuantityAndAccount30(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount33
	 * QuantityAndAccount33}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount33> forQuantityAndAccount33 = new MMConstraint<QuantityAndAccount33>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> QuantityAndAccount33.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount33 obj) throws Exception {
			checkQuantityAndAccount33(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification9
	 * AccountIdentification9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountIdentification9> forAccountIdentification9 = new MMConstraint<AccountIdentification9>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> AccountIdentification9.mmObject();
		}

		@Override
		public void executeValidator(AccountIdentification9 obj) throws Exception {
			checkAccountIdentification9(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification14
	 * AccountIdentification14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountIdentification14> forAccountIdentification14 = new MMConstraint<AccountIdentification14>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> AccountIdentification14.mmObject();
		}

		@Override
		public void executeValidator(AccountIdentification14 obj) throws Exception {
			checkAccountIdentification14(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification15
	 * AccountIdentification15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule#forAccountIdentification31
	 * ConstraintSafekeepingPlaceRule.forAccountIdentification31}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountIdentification15> forAccountIdentification15 = new MMConstraint<AccountIdentification15>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule.forAccountIdentification31);
			owner_lazy = () -> AccountIdentification15.mmObject();
		}

		@Override
		public void executeValidator(AccountIdentification15 obj) throws Exception {
			checkAccountIdentification15(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification21
	 * AccountIdentification21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountIdentification21> forAccountIdentification21 = new MMConstraint<AccountIdentification21>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> AccountIdentification21.mmObject();
		}

		@Override
		public void executeValidator(AccountIdentification21 obj) throws Exception {
			checkAccountIdentification21(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance2
	 * AccountAndBalance2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountAndBalance2> forAccountAndBalance2 = new MMConstraint<AccountAndBalance2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> AccountAndBalance2.mmObject();
		}

		@Override
		public void executeValidator(AccountAndBalance2 obj) throws Exception {
			checkAccountAndBalance2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance5
	 * AccountAndBalance5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountAndBalance5> forAccountAndBalance5 = new MMConstraint<AccountAndBalance5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> AccountAndBalance5.mmObject();
		}

		@Override
		public void executeValidator(AccountAndBalance5 obj) throws Exception {
			checkAccountAndBalance5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance10
	 * AccountAndBalance10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountAndBalance10> forAccountAndBalance10 = new MMConstraint<AccountAndBalance10>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> AccountAndBalance10.mmObject();
		}

		@Override
		public void executeValidator(AccountAndBalance10 obj) throws Exception {
			checkAccountAndBalance10(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance12
	 * AccountAndBalance12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountAndBalance12> forAccountAndBalance12 = new MMConstraint<AccountAndBalance12>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> AccountAndBalance12.mmObject();
		}

		@Override
		public void executeValidator(AccountAndBalance12 obj) throws Exception {
			checkAccountAndBalance12(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance17
	 * AccountAndBalance17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule#forAccountAndBalance35
	 * ConstraintSafekeepingPlaceRule.forAccountAndBalance35}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountAndBalance17> forAccountAndBalance17 = new MMConstraint<AccountAndBalance17>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule.forAccountAndBalance35);
			owner_lazy = () -> AccountAndBalance17.mmObject();
		}

		@Override
		public void executeValidator(AccountAndBalance17 obj) throws Exception {
			checkAccountAndBalance17(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance20
	 * AccountAndBalance20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountAndBalance20> forAccountAndBalance20 = new MMConstraint<AccountAndBalance20>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> AccountAndBalance20.mmObject();
		}

		@Override
		public void executeValidator(AccountAndBalance20 obj) throws Exception {
			checkAccountAndBalance20(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification8
	 * AccountIdentification8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountIdentification8> forAccountIdentification8 = new MMConstraint<AccountIdentification8>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> AccountIdentification8.mmObject();
		}

		@Override
		public void executeValidator(AccountIdentification8 obj) throws Exception {
			checkAccountIdentification8(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification17
	 * AccountIdentification17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountIdentification17> forAccountIdentification17 = new MMConstraint<AccountIdentification17>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> AccountIdentification17.mmObject();
		}

		@Override
		public void executeValidator(AccountIdentification17 obj) throws Exception {
			checkAccountIdentification17(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification19
	 * AccountIdentification19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountIdentification19> forAccountIdentification19 = new MMConstraint<AccountIdentification19>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> AccountIdentification19.mmObject();
		}

		@Override
		public void executeValidator(AccountIdentification19 obj) throws Exception {
			checkAccountIdentification19(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption9
	 * CorporateActionOption9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption9> forCorporateActionOption9 = new MMConstraint<CorporateActionOption9>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> CorporateActionOption9.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption9 obj) throws Exception {
			checkCorporateActionOption9(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption18
	 * CorporateActionOption18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption18> forCorporateActionOption18 = new MMConstraint<CorporateActionOption18>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> CorporateActionOption18.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption18 obj) throws Exception {
			checkCorporateActionOption18(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption22
	 * CorporateActionOption22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption22> forCorporateActionOption22 = new MMConstraint<CorporateActionOption22>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> CorporateActionOption22.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption22 obj) throws Exception {
			checkCorporateActionOption22(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption27
	 * CorporateActionOption27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption27> forCorporateActionOption27 = new MMConstraint<CorporateActionOption27>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> CorporateActionOption27.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption27 obj) throws Exception {
			checkCorporateActionOption27(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption26
	 * CorporateActionOption26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption26> forCorporateActionOption26 = new MMConstraint<CorporateActionOption26>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> CorporateActionOption26.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption26 obj) throws Exception {
			checkCorporateActionOption26(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption41
	 * CorporateActionOption41}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule#forCorporateActionOption116
	 * ConstraintSafekeepingPlaceRule.forCorporateActionOption116}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption41> forCorporateActionOption41 = new MMConstraint<CorporateActionOption41>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule.forCorporateActionOption116);
			owner_lazy = () -> CorporateActionOption41.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption41 obj) throws Exception {
			checkCorporateActionOption41(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption50
	 * CorporateActionOption50}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption50> forCorporateActionOption50 = new MMConstraint<CorporateActionOption50>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> CorporateActionOption50.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption50 obj) throws Exception {
			checkCorporateActionOption50(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification6
	 * AccountIdentification6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountIdentification6> forAccountIdentification6 = new MMConstraint<AccountIdentification6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> AccountIdentification6.mmObject();
		}

		@Override
		public void executeValidator(AccountIdentification6 obj) throws Exception {
			checkAccountIdentification6(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification12
	 * AccountIdentification12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountIdentification12> forAccountIdentification12 = new MMConstraint<AccountIdentification12>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> AccountIdentification12.mmObject();
		}

		@Override
		public void executeValidator(AccountIdentification12 obj) throws Exception {
			checkAccountIdentification12(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification16
	 * AccountIdentification16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountIdentification16> forAccountIdentification16 = new MMConstraint<AccountIdentification16>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> AccountIdentification16.mmObject();
		}

		@Override
		public void executeValidator(AccountIdentification16 obj) throws Exception {
			checkAccountIdentification16(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification22
	 * AccountIdentification22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountIdentification22> forAccountIdentification22 = new MMConstraint<AccountIdentification22>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> AccountIdentification22.mmObject();
		}

		@Override
		public void executeValidator(AccountIdentification22 obj) throws Exception {
			checkAccountIdentification22(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification23
	 * AccountIdentification23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountIdentification23> forAccountIdentification23 = new MMConstraint<AccountIdentification23>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> AccountIdentification23.mmObject();
		}

		@Override
		public void executeValidator(AccountIdentification23 obj) throws Exception {
			checkAccountIdentification23(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification24
	 * AccountIdentification24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountIdentification24> forAccountIdentification24 = new MMConstraint<AccountIdentification24>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> AccountIdentification24.mmObject();
		}

		@Override
		public void executeValidator(AccountIdentification24 obj) throws Exception {
			checkAccountIdentification24(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification25
	 * AccountIdentification25}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule#forAccountIdentification33
	 * ConstraintSafekeepingPlaceRule.forAccountIdentification33}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountIdentification25> forAccountIdentification25 = new MMConstraint<AccountIdentification25>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule.forAccountIdentification33);
			owner_lazy = () -> AccountIdentification25.mmObject();
		}

		@Override
		public void executeValidator(AccountIdentification25 obj) throws Exception {
			checkAccountIdentification25(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification29
	 * AccountIdentification29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountIdentification29> forAccountIdentification29 = new MMConstraint<AccountIdentification29>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> AccountIdentification29.mmObject();
		}

		@Override
		public void executeValidator(AccountIdentification29 obj) throws Exception {
			checkAccountIdentification29(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption29
	 * CorporateActionOption29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption29> forCorporateActionOption29 = new MMConstraint<CorporateActionOption29>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> CorporateActionOption29.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption29 obj) throws Exception {
			checkCorporateActionOption29(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance3
	 * AccountAndBalance3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountAndBalance3> forAccountAndBalance3 = new MMConstraint<AccountAndBalance3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> AccountAndBalance3.mmObject();
		}

		@Override
		public void executeValidator(AccountAndBalance3 obj) throws Exception {
			checkAccountAndBalance3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance6
	 * AccountAndBalance6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountAndBalance6> forAccountAndBalance6 = new MMConstraint<AccountAndBalance6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> AccountAndBalance6.mmObject();
		}

		@Override
		public void executeValidator(AccountAndBalance6 obj) throws Exception {
			checkAccountAndBalance6(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance11
	 * AccountAndBalance11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountAndBalance11> forAccountAndBalance11 = new MMConstraint<AccountAndBalance11>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> AccountAndBalance11.mmObject();
		}

		@Override
		public void executeValidator(AccountAndBalance11 obj) throws Exception {
			checkAccountAndBalance11(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance13
	 * AccountAndBalance13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountAndBalance13> forAccountAndBalance13 = new MMConstraint<AccountAndBalance13>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> AccountAndBalance13.mmObject();
		}

		@Override
		public void executeValidator(AccountAndBalance13 obj) throws Exception {
			checkAccountAndBalance13(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance16
	 * AccountAndBalance16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountAndBalance16> forAccountAndBalance16 = new MMConstraint<AccountAndBalance16>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> AccountAndBalance16.mmObject();
		}

		@Override
		public void executeValidator(AccountAndBalance16 obj) throws Exception {
			checkAccountAndBalance16(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance19
	 * AccountAndBalance19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountAndBalance19> forAccountAndBalance19 = new MMConstraint<AccountAndBalance19>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> AccountAndBalance19.mmObject();
		}

		@Override
		public void executeValidator(AccountAndBalance19 obj) throws Exception {
			checkAccountAndBalance19(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance22
	 * AccountAndBalance22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule#forAccountAndBalance26
	 * ConstraintSafekeepingPlaceRule.forAccountAndBalance26}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountAndBalance22> forAccountAndBalance22 = new MMConstraint<AccountAndBalance22>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule.forAccountAndBalance26);
			owner_lazy = () -> AccountAndBalance22.mmObject();
		}

		@Override
		public void executeValidator(AccountAndBalance22 obj) throws Exception {
			checkAccountAndBalance22(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance23
	 * AccountAndBalance23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountAndBalance23> forAccountAndBalance23 = new MMConstraint<AccountAndBalance23>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> AccountAndBalance23.mmObject();
		}

		@Override
		public void executeValidator(AccountAndBalance23 obj) throws Exception {
			checkAccountAndBalance23(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance1
	 * AccountAndBalance1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountAndBalance1> forAccountAndBalance1 = new MMConstraint<AccountAndBalance1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> AccountAndBalance1.mmObject();
		}

		@Override
		public void executeValidator(AccountAndBalance1 obj) throws Exception {
			checkAccountAndBalance1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance7
	 * AccountAndBalance7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountAndBalance7> forAccountAndBalance7 = new MMConstraint<AccountAndBalance7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> AccountAndBalance7.mmObject();
		}

		@Override
		public void executeValidator(AccountAndBalance7 obj) throws Exception {
			checkAccountAndBalance7(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance9
	 * AccountAndBalance9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountAndBalance9> forAccountAndBalance9 = new MMConstraint<AccountAndBalance9>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> AccountAndBalance9.mmObject();
		}

		@Override
		public void executeValidator(AccountAndBalance9 obj) throws Exception {
			checkAccountAndBalance9(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance14
	 * AccountAndBalance14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountAndBalance14> forAccountAndBalance14 = new MMConstraint<AccountAndBalance14>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> AccountAndBalance14.mmObject();
		}

		@Override
		public void executeValidator(AccountAndBalance14 obj) throws Exception {
			checkAccountAndBalance14(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance15
	 * AccountAndBalance15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountAndBalance15> forAccountAndBalance15 = new MMConstraint<AccountAndBalance15>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> AccountAndBalance15.mmObject();
		}

		@Override
		public void executeValidator(AccountAndBalance15 obj) throws Exception {
			checkAccountAndBalance15(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance18
	 * AccountAndBalance18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountAndBalance18> forAccountAndBalance18 = new MMConstraint<AccountAndBalance18>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> AccountAndBalance18.mmObject();
		}

		@Override
		public void executeValidator(AccountAndBalance18 obj) throws Exception {
			checkAccountAndBalance18(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance21
	 * AccountAndBalance21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule#forAccountAndBalance25
	 * ConstraintSafekeepingPlaceRule.forAccountAndBalance25}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountAndBalance21> forAccountAndBalance21 = new MMConstraint<AccountAndBalance21>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule.forAccountAndBalance25);
			owner_lazy = () -> AccountAndBalance21.mmObject();
		}

		@Override
		public void executeValidator(AccountAndBalance21 obj) throws Exception {
			checkAccountAndBalance21(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance24
	 * AccountAndBalance24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountAndBalance24> forAccountAndBalance24 = new MMConstraint<AccountAndBalance24>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> AccountAndBalance24.mmObject();
		}

		@Override
		public void executeValidator(AccountAndBalance24 obj) throws Exception {
			checkAccountAndBalance24(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount1
	 * QuantityAndAccount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount1> forQuantityAndAccount1 = new MMConstraint<QuantityAndAccount1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> QuantityAndAccount1.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount1 obj) throws Exception {
			checkQuantityAndAccount1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount5
	 * QuantityAndAccount5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount5> forQuantityAndAccount5 = new MMConstraint<QuantityAndAccount5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> QuantityAndAccount5.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount5 obj) throws Exception {
			checkQuantityAndAccount5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount17
	 * QuantityAndAccount17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount17> forQuantityAndAccount17 = new MMConstraint<QuantityAndAccount17>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> QuantityAndAccount17.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount17 obj) throws Exception {
			checkQuantityAndAccount17(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount24
	 * QuantityAndAccount24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount24> forQuantityAndAccount24 = new MMConstraint<QuantityAndAccount24>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> QuantityAndAccount24.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount24 obj) throws Exception {
			checkQuantityAndAccount24(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount25
	 * QuantityAndAccount25}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule#forQuantityAndAccount39
	 * ConstraintSafekeepingPlaceRule.forQuantityAndAccount39}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount25> forQuantityAndAccount25 = new MMConstraint<QuantityAndAccount25>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule.forQuantityAndAccount39);
			owner_lazy = () -> QuantityAndAccount25.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount25 obj) throws Exception {
			checkQuantityAndAccount25(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount34
	 * QuantityAndAccount34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount34> forQuantityAndAccount34 = new MMConstraint<QuantityAndAccount34>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> QuantityAndAccount34.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount34 obj) throws Exception {
			checkQuantityAndAccount34(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount2
	 * QuantityAndAccount2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount2> forQuantityAndAccount2 = new MMConstraint<QuantityAndAccount2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> QuantityAndAccount2.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount2 obj) throws Exception {
			checkQuantityAndAccount2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount12
	 * QuantityAndAccount12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount12> forQuantityAndAccount12 = new MMConstraint<QuantityAndAccount12>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> QuantityAndAccount12.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount12 obj) throws Exception {
			checkQuantityAndAccount12(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount15
	 * QuantityAndAccount15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount15> forQuantityAndAccount15 = new MMConstraint<QuantityAndAccount15>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> QuantityAndAccount15.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount15 obj) throws Exception {
			checkQuantityAndAccount15(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount20
	 * QuantityAndAccount20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount20> forQuantityAndAccount20 = new MMConstraint<QuantityAndAccount20>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> QuantityAndAccount20.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount20 obj) throws Exception {
			checkQuantityAndAccount20(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount28
	 * QuantityAndAccount28}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule#forQuantityAndAccount41
	 * ConstraintSafekeepingPlaceRule.forQuantityAndAccount41}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount28> forQuantityAndAccount28 = new MMConstraint<QuantityAndAccount28>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule.forQuantityAndAccount41);
			owner_lazy = () -> QuantityAndAccount28.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount28 obj) throws Exception {
			checkQuantityAndAccount28(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount37
	 * QuantityAndAccount37}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount37> forQuantityAndAccount37 = new MMConstraint<QuantityAndAccount37>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> QuantityAndAccount37.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount37 obj) throws Exception {
			checkQuantityAndAccount37(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount3
	 * QuantityAndAccount3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount3> forQuantityAndAccount3 = new MMConstraint<QuantityAndAccount3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> QuantityAndAccount3.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount3 obj) throws Exception {
			checkQuantityAndAccount3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount13
	 * QuantityAndAccount13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount13> forQuantityAndAccount13 = new MMConstraint<QuantityAndAccount13>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> QuantityAndAccount13.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount13 obj) throws Exception {
			checkQuantityAndAccount13(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount8
	 * QuantityAndAccount8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount8> forQuantityAndAccount8 = new MMConstraint<QuantityAndAccount8>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> QuantityAndAccount8.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount8 obj) throws Exception {
			checkQuantityAndAccount8(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount14
	 * QuantityAndAccount14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount14> forQuantityAndAccount14 = new MMConstraint<QuantityAndAccount14>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> QuantityAndAccount14.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount14 obj) throws Exception {
			checkQuantityAndAccount14(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification7
	 * AccountIdentification7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountIdentification7> forAccountIdentification7 = new MMConstraint<AccountIdentification7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> AccountIdentification7.mmObject();
		}

		@Override
		public void executeValidator(AccountIdentification7 obj) throws Exception {
			checkAccountIdentification7(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification13
	 * AccountIdentification13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountIdentification13> forAccountIdentification13 = new MMConstraint<AccountIdentification13>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> AccountIdentification13.mmObject();
		}

		@Override
		public void executeValidator(AccountIdentification13 obj) throws Exception {
			checkAccountIdentification13(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification18
	 * AccountIdentification18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule#forAccountIdentification32
	 * ConstraintSafekeepingPlaceRule.forAccountIdentification32}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountIdentification18> forAccountIdentification18 = new MMConstraint<AccountIdentification18>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule.forAccountIdentification32);
			owner_lazy = () -> AccountIdentification18.mmObject();
		}

		@Override
		public void executeValidator(AccountIdentification18 obj) throws Exception {
			checkAccountIdentification18(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification20
	 * AccountIdentification20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountIdentification20> forAccountIdentification20 = new MMConstraint<AccountIdentification20>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> AccountIdentification20.mmObject();
		}

		@Override
		public void executeValidator(AccountIdentification20 obj) throws Exception {
			checkAccountIdentification20(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount4
	 * QuantityAndAccount4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount4> forQuantityAndAccount4 = new MMConstraint<QuantityAndAccount4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> QuantityAndAccount4.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount4 obj) throws Exception {
			checkQuantityAndAccount4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount22
	 * QuantityAndAccount22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount22> forQuantityAndAccount22 = new MMConstraint<QuantityAndAccount22>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> QuantityAndAccount22.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount22 obj) throws Exception {
			checkQuantityAndAccount22(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount27
	 * QuantityAndAccount27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule#forQuantityAndAccount42
	 * ConstraintSafekeepingPlaceRule.forQuantityAndAccount42}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount27> forQuantityAndAccount27 = new MMConstraint<QuantityAndAccount27>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule.forQuantityAndAccount42);
			owner_lazy = () -> QuantityAndAccount27.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount27 obj) throws Exception {
			checkQuantityAndAccount27(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount36
	 * QuantityAndAccount36}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount36> forQuantityAndAccount36 = new MMConstraint<QuantityAndAccount36>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> QuantityAndAccount36.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount36 obj) throws Exception {
			checkQuantityAndAccount36(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount9
	 * QuantityAndAccount9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount9> forQuantityAndAccount9 = new MMConstraint<QuantityAndAccount9>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> QuantityAndAccount9.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount9 obj) throws Exception {
			checkQuantityAndAccount9(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount23
	 * QuantityAndAccount23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount23> forQuantityAndAccount23 = new MMConstraint<QuantityAndAccount23>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> QuantityAndAccount23.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount23 obj) throws Exception {
			checkQuantityAndAccount23(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount26
	 * QuantityAndAccount26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule#forQuantityAndAccount45
	 * ConstraintSafekeepingPlaceRule.forQuantityAndAccount45}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount26> forQuantityAndAccount26 = new MMConstraint<QuantityAndAccount26>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule.forQuantityAndAccount45);
			owner_lazy = () -> QuantityAndAccount26.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount26 obj) throws Exception {
			checkQuantityAndAccount26(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount35
	 * QuantityAndAccount35}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount35> forQuantityAndAccount35 = new MMConstraint<QuantityAndAccount35>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> QuantityAndAccount35.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount35 obj) throws Exception {
			checkQuantityAndAccount35(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification11
	 * AccountIdentification11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountIdentification11> forAccountIdentification11 = new MMConstraint<AccountIdentification11>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> AccountIdentification11.mmObject();
		}

		@Override
		public void executeValidator(AccountIdentification11 obj) throws Exception {
			checkAccountIdentification11(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance26
	 * AccountAndBalance26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule#forAccountAndBalance34
	 * ConstraintSafekeepingPlaceRule.forAccountAndBalance34}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule#forAccountAndBalance22
	 * ConstraintSafekeepingPlaceRule.forAccountAndBalance22}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountAndBalance26> forAccountAndBalance26 = new MMConstraint<AccountAndBalance26>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule.forAccountAndBalance34);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule.forAccountAndBalance22;
			owner_lazy = () -> AccountAndBalance26.mmObject();
		}

		@Override
		public void executeValidator(AccountAndBalance26 obj) throws Exception {
			checkAccountAndBalance26(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance25
	 * AccountAndBalance25}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule#forAccountAndBalance33
	 * ConstraintSafekeepingPlaceRule.forAccountAndBalance33}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule#forAccountAndBalance21
	 * ConstraintSafekeepingPlaceRule.forAccountAndBalance21}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountAndBalance25> forAccountAndBalance25 = new MMConstraint<AccountAndBalance25>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule.forAccountAndBalance33);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule.forAccountAndBalance21;
			owner_lazy = () -> AccountAndBalance25.mmObject();
		}

		@Override
		public void executeValidator(AccountAndBalance25 obj) throws Exception {
			checkAccountAndBalance25(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance32
	 * AccountAndBalance32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountAndBalance32> forAccountAndBalance32 = new MMConstraint<AccountAndBalance32>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> AccountAndBalance32.mmObject();
		}

		@Override
		public void executeValidator(AccountAndBalance32 obj) throws Exception {
			checkAccountAndBalance32(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance29
	 * AccountAndBalance29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountAndBalance29> forAccountAndBalance29 = new MMConstraint<AccountAndBalance29>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> AccountAndBalance29.mmObject();
		}

		@Override
		public void executeValidator(AccountAndBalance29 obj) throws Exception {
			checkAccountAndBalance29(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount39
	 * QuantityAndAccount39}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule#forQuantityAndAccount65
	 * ConstraintSafekeepingPlaceRule.forQuantityAndAccount65}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule#forQuantityAndAccount25
	 * ConstraintSafekeepingPlaceRule.forQuantityAndAccount25}</li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount39> forQuantityAndAccount39 = new MMConstraint<QuantityAndAccount39>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule.forQuantityAndAccount65);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule.forQuantityAndAccount25;
			owner_lazy = () -> QuantityAndAccount39.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount39 obj) throws Exception {
			checkQuantityAndAccount39(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount41
	 * QuantityAndAccount41}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule#forQuantityAndAccount64
	 * ConstraintSafekeepingPlaceRule.forQuantityAndAccount64}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule#forQuantityAndAccount28
	 * ConstraintSafekeepingPlaceRule.forQuantityAndAccount28}</li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount41> forQuantityAndAccount41 = new MMConstraint<QuantityAndAccount41>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule.forQuantityAndAccount64);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule.forQuantityAndAccount28;
			owner_lazy = () -> QuantityAndAccount41.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount41 obj) throws Exception {
			checkQuantityAndAccount41(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount42
	 * QuantityAndAccount42}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule#forQuantityAndAccount63
	 * ConstraintSafekeepingPlaceRule.forQuantityAndAccount63}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule#forQuantityAndAccount27
	 * ConstraintSafekeepingPlaceRule.forQuantityAndAccount27}</li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount42> forQuantityAndAccount42 = new MMConstraint<QuantityAndAccount42>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule.forQuantityAndAccount63);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule.forQuantityAndAccount27;
			owner_lazy = () -> QuantityAndAccount42.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount42 obj) throws Exception {
			checkQuantityAndAccount42(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount43
	 * QuantityAndAccount43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule#forQuantityAndAccount68
	 * ConstraintSafekeepingPlaceRule.forQuantityAndAccount68}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule#forQuantityAndAccount30
	 * ConstraintSafekeepingPlaceRule.forQuantityAndAccount30}</li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount43> forQuantityAndAccount43 = new MMConstraint<QuantityAndAccount43>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule.forQuantityAndAccount68);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule.forQuantityAndAccount30;
			owner_lazy = () -> QuantityAndAccount43.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount43 obj) throws Exception {
			checkQuantityAndAccount43(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount45
	 * QuantityAndAccount45}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule#forQuantityAndAccount67
	 * ConstraintSafekeepingPlaceRule.forQuantityAndAccount67}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule#forQuantityAndAccount26
	 * ConstraintSafekeepingPlaceRule.forQuantityAndAccount26}</li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount45> forQuantityAndAccount45 = new MMConstraint<QuantityAndAccount45>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule.forQuantityAndAccount67);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule.forQuantityAndAccount26;
			owner_lazy = () -> QuantityAndAccount45.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount45 obj) throws Exception {
			checkQuantityAndAccount45(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance34
	 * AccountAndBalance34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule#forAccountAndBalance26
	 * ConstraintSafekeepingPlaceRule.forAccountAndBalance26}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountAndBalance34> forAccountAndBalance34 = new MMConstraint<AccountAndBalance34>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule.forAccountAndBalance26;
			owner_lazy = () -> AccountAndBalance34.mmObject();
		}

		@Override
		public void executeValidator(AccountAndBalance34 obj) throws Exception {
			checkAccountAndBalance34(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance35
	 * AccountAndBalance35}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule#forAccountAndBalance17
	 * ConstraintSafekeepingPlaceRule.forAccountAndBalance17}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountAndBalance35> forAccountAndBalance35 = new MMConstraint<AccountAndBalance35>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule.forAccountAndBalance17;
			owner_lazy = () -> AccountAndBalance35.mmObject();
		}

		@Override
		public void executeValidator(AccountAndBalance35 obj) throws Exception {
			checkAccountAndBalance35(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification33
	 * AccountIdentification33}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule#forAccountIdentification40
	 * ConstraintSafekeepingPlaceRule.forAccountIdentification40}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule#forAccountIdentification25
	 * ConstraintSafekeepingPlaceRule.forAccountIdentification25}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountIdentification33> forAccountIdentification33 = new MMConstraint<AccountIdentification33>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule.forAccountIdentification40);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule.forAccountIdentification25;
			owner_lazy = () -> AccountIdentification33.mmObject();
		}

		@Override
		public void executeValidator(AccountIdentification33 obj) throws Exception {
			checkAccountIdentification33(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption116
	 * CorporateActionOption116}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule#forCorporateActionOption141
	 * ConstraintSafekeepingPlaceRule.forCorporateActionOption141}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule#forCorporateActionOption41
	 * ConstraintSafekeepingPlaceRule.forCorporateActionOption41}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption116> forCorporateActionOption116 = new MMConstraint<CorporateActionOption116>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule.forCorporateActionOption141);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule.forCorporateActionOption41;
			owner_lazy = () -> CorporateActionOption116.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption116 obj) throws Exception {
			checkCorporateActionOption116(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification31
	 * AccountIdentification31}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule#forAccountIdentification15
	 * ConstraintSafekeepingPlaceRule.forAccountIdentification15}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountIdentification31> forAccountIdentification31 = new MMConstraint<AccountIdentification31>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule.forAccountIdentification15;
			owner_lazy = () -> AccountIdentification31.mmObject();
		}

		@Override
		public void executeValidator(AccountIdentification31 obj) throws Exception {
			checkAccountIdentification31(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance33
	 * AccountAndBalance33}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule#forAccountAndBalance25
	 * ConstraintSafekeepingPlaceRule.forAccountAndBalance25}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountAndBalance33> forAccountAndBalance33 = new MMConstraint<AccountAndBalance33>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule.forAccountAndBalance25;
			owner_lazy = () -> AccountAndBalance33.mmObject();
		}

		@Override
		public void executeValidator(AccountAndBalance33 obj) throws Exception {
			checkAccountAndBalance33(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification32
	 * AccountIdentification32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule#forAccountIdentification18
	 * ConstraintSafekeepingPlaceRule.forAccountIdentification18}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountIdentification32> forAccountIdentification32 = new MMConstraint<AccountIdentification32>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule.forAccountIdentification18;
			owner_lazy = () -> AccountIdentification32.mmObject();
		}

		@Override
		public void executeValidator(AccountIdentification32 obj) throws Exception {
			checkAccountIdentification32(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption121
	 * CorporateActionOption121}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption121> forCorporateActionOption121 = new MMConstraint<CorporateActionOption121>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> CorporateActionOption121.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption121 obj) throws Exception {
			checkCorporateActionOption121(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance38
	 * AccountAndBalance38}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountAndBalance38> forAccountAndBalance38 = new MMConstraint<AccountAndBalance38>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> AccountAndBalance38.mmObject();
		}

		@Override
		public void executeValidator(AccountAndBalance38 obj) throws Exception {
			checkAccountAndBalance38(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification35
	 * AccountIdentification35}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountIdentification35> forAccountIdentification35 = new MMConstraint<AccountIdentification35>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> AccountIdentification35.mmObject();
		}

		@Override
		public void executeValidator(AccountIdentification35 obj) throws Exception {
			checkAccountIdentification35(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance37
	 * AccountAndBalance37}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountAndBalance37> forAccountAndBalance37 = new MMConstraint<AccountAndBalance37>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> AccountAndBalance37.mmObject();
		}

		@Override
		public void executeValidator(AccountAndBalance37 obj) throws Exception {
			checkAccountAndBalance37(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification34
	 * AccountIdentification34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountIdentification34> forAccountIdentification34 = new MMConstraint<AccountIdentification34>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> AccountIdentification34.mmObject();
		}

		@Override
		public void executeValidator(AccountIdentification34 obj) throws Exception {
			checkAccountIdentification34(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification37
	 * AccountIdentification37}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountIdentification37> forAccountIdentification37 = new MMConstraint<AccountIdentification37>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> AccountIdentification37.mmObject();
		}

		@Override
		public void executeValidator(AccountIdentification37 obj) throws Exception {
			checkAccountIdentification37(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance39
	 * AccountAndBalance39}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountAndBalance39> forAccountAndBalance39 = new MMConstraint<AccountAndBalance39>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, eg, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> AccountAndBalance39.mmObject();
		}

		@Override
		public void executeValidator(AccountAndBalance39 obj) throws Exception {
			checkAccountAndBalance39(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount47
	 * QuantityAndAccount47}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule#forQuantityAndAccount56
	 * ConstraintSafekeepingPlaceRule.forQuantityAndAccount56}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount47> forQuantityAndAccount47 = new MMConstraint<QuantityAndAccount47>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule.forQuantityAndAccount56);
			owner_lazy = () -> QuantityAndAccount47.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount47 obj) throws Exception {
			checkQuantityAndAccount47(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount51
	 * QuantityAndAccount51}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule#forQuantityAndAccount57
	 * ConstraintSafekeepingPlaceRule.forQuantityAndAccount57}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount51> forQuantityAndAccount51 = new MMConstraint<QuantityAndAccount51>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule.forQuantityAndAccount57);
			owner_lazy = () -> QuantityAndAccount51.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount51 obj) throws Exception {
			checkQuantityAndAccount51(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount49
	 * QuantityAndAccount49}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule#forQuantityAndAccount58
	 * ConstraintSafekeepingPlaceRule.forQuantityAndAccount58}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount49> forQuantityAndAccount49 = new MMConstraint<QuantityAndAccount49>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule.forQuantityAndAccount58);
			owner_lazy = () -> QuantityAndAccount49.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount49 obj) throws Exception {
			checkQuantityAndAccount49(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount50
	 * QuantityAndAccount50}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount50> forQuantityAndAccount50 = new MMConstraint<QuantityAndAccount50>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> QuantityAndAccount50.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount50 obj) throws Exception {
			checkQuantityAndAccount50(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount55
	 * QuantityAndAccount55}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule#forQuantityAndAccount60
	 * ConstraintSafekeepingPlaceRule.forQuantityAndAccount60}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount55> forQuantityAndAccount55 = new MMConstraint<QuantityAndAccount55>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule.forQuantityAndAccount60);
			owner_lazy = () -> QuantityAndAccount55.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount55 obj) throws Exception {
			checkQuantityAndAccount55(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification39
	 * AccountIdentification39}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule#forAccountIdentification42
	 * ConstraintSafekeepingPlaceRule.forAccountIdentification42}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountIdentification39> forAccountIdentification39 = new MMConstraint<AccountIdentification39>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule.forAccountIdentification42);
			owner_lazy = () -> AccountIdentification39.mmObject();
		}

		@Override
		public void executeValidator(AccountIdentification39 obj) throws Exception {
			checkAccountIdentification39(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification40
	 * AccountIdentification40}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule#forAccountIdentification43
	 * ConstraintSafekeepingPlaceRule.forAccountIdentification43}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule#forAccountIdentification33
	 * ConstraintSafekeepingPlaceRule.forAccountIdentification33}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountIdentification40> forAccountIdentification40 = new MMConstraint<AccountIdentification40>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule.forAccountIdentification43);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule.forAccountIdentification33;
			owner_lazy = () -> AccountIdentification40.mmObject();
		}

		@Override
		public void executeValidator(AccountIdentification40 obj) throws Exception {
			checkAccountIdentification40(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification41
	 * AccountIdentification41}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountIdentification41> forAccountIdentification41 = new MMConstraint<AccountIdentification41>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> AccountIdentification41.mmObject();
		}

		@Override
		public void executeValidator(AccountIdentification41 obj) throws Exception {
			checkAccountIdentification41(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount57
	 * QuantityAndAccount57}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule#forQuantityAndAccount51
	 * ConstraintSafekeepingPlaceRule.forQuantityAndAccount51}</li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount57> forQuantityAndAccount57 = new MMConstraint<QuantityAndAccount57>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule.forQuantityAndAccount51;
			owner_lazy = () -> QuantityAndAccount57.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount57 obj) throws Exception {
			checkQuantityAndAccount57(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount58
	 * QuantityAndAccount58}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule#forQuantityAndAccount49
	 * ConstraintSafekeepingPlaceRule.forQuantityAndAccount49}</li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount58> forQuantityAndAccount58 = new MMConstraint<QuantityAndAccount58>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule.forQuantityAndAccount49;
			owner_lazy = () -> QuantityAndAccount58.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount58 obj) throws Exception {
			checkQuantityAndAccount58(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount56
	 * QuantityAndAccount56}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule#forQuantityAndAccount47
	 * ConstraintSafekeepingPlaceRule.forQuantityAndAccount47}</li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount56> forQuantityAndAccount56 = new MMConstraint<QuantityAndAccount56>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule.forQuantityAndAccount47;
			owner_lazy = () -> QuantityAndAccount56.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount56 obj) throws Exception {
			checkQuantityAndAccount56(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount60
	 * QuantityAndAccount60}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule#forQuantityAndAccount55
	 * ConstraintSafekeepingPlaceRule.forQuantityAndAccount55}</li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount60> forQuantityAndAccount60 = new MMConstraint<QuantityAndAccount60>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule.forQuantityAndAccount55;
			owner_lazy = () -> QuantityAndAccount60.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount60 obj) throws Exception {
			checkQuantityAndAccount60(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification42
	 * AccountIdentification42}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule#forAccountIdentification39
	 * ConstraintSafekeepingPlaceRule.forAccountIdentification39}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountIdentification42> forAccountIdentification42 = new MMConstraint<AccountIdentification42>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule.forAccountIdentification39;
			owner_lazy = () -> AccountIdentification42.mmObject();
		}

		@Override
		public void executeValidator(AccountIdentification42 obj) throws Exception {
			checkAccountIdentification42(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount64
	 * QuantityAndAccount64}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule#forQuantityAndAccount41
	 * ConstraintSafekeepingPlaceRule.forQuantityAndAccount41}</li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount64> forQuantityAndAccount64 = new MMConstraint<QuantityAndAccount64>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule.forQuantityAndAccount41;
			owner_lazy = () -> QuantityAndAccount64.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount64 obj) throws Exception {
			checkQuantityAndAccount64(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount63
	 * QuantityAndAccount63}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule#forQuantityAndAccount42
	 * ConstraintSafekeepingPlaceRule.forQuantityAndAccount42}</li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount63> forQuantityAndAccount63 = new MMConstraint<QuantityAndAccount63>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule.forQuantityAndAccount42;
			owner_lazy = () -> QuantityAndAccount63.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount63 obj) throws Exception {
			checkQuantityAndAccount63(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount65
	 * QuantityAndAccount65}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule#forQuantityAndAccount39
	 * ConstraintSafekeepingPlaceRule.forQuantityAndAccount39}</li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount65> forQuantityAndAccount65 = new MMConstraint<QuantityAndAccount65>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule.forQuantityAndAccount39;
			owner_lazy = () -> QuantityAndAccount65.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount65 obj) throws Exception {
			checkQuantityAndAccount65(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount67
	 * QuantityAndAccount67}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule#forQuantityAndAccount45
	 * ConstraintSafekeepingPlaceRule.forQuantityAndAccount45}</li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount67> forQuantityAndAccount67 = new MMConstraint<QuantityAndAccount67>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule.forQuantityAndAccount45;
			owner_lazy = () -> QuantityAndAccount67.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount67 obj) throws Exception {
			checkQuantityAndAccount67(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount68
	 * QuantityAndAccount68}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule#forQuantityAndAccount43
	 * ConstraintSafekeepingPlaceRule.forQuantityAndAccount43}</li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount68> forQuantityAndAccount68 = new MMConstraint<QuantityAndAccount68>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule.forQuantityAndAccount43;
			owner_lazy = () -> QuantityAndAccount68.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount68 obj) throws Exception {
			checkQuantityAndAccount68(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption141
	 * CorporateActionOption141}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "SafekeepingPlace must only be used by global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule#forCorporateActionOption116
	 * ConstraintSafekeepingPlaceRule.forCorporateActionOption116}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption141> forCorporateActionOption141 = new MMConstraint<CorporateActionOption141>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "SafekeepingPlace must only be used by global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule.forCorporateActionOption116;
			owner_lazy = () -> CorporateActionOption141.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption141 obj) throws Exception {
			checkCorporateActionOption141(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification43
	 * AccountIdentification43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule#forAccountIdentification40
	 * ConstraintSafekeepingPlaceRule.forAccountIdentification40}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountIdentification43> forAccountIdentification43 = new MMConstraint<AccountIdentification43>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule.forAccountIdentification40;
			owner_lazy = () -> AccountIdentification43.mmObject();
		}

		@Override
		public void executeValidator(AccountIdentification43 obj) throws Exception {
			checkAccountIdentification43(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption144
	 * CorporateActionOption144}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "SafekeepingPlace must only be used by global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption144> forCorporateActionOption144 = new MMConstraint<CorporateActionOption144>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "SafekeepingPlace must only be used by global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> CorporateActionOption144.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption144 obj) throws Exception {
			checkCorporateActionOption144(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification44
	 * AccountIdentification44}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountIdentification44> forAccountIdentification44 = new MMConstraint<AccountIdentification44>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "SafekeepingPlace is only to be used by global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> AccountIdentification44.mmObject();
		}

		@Override
		public void executeValidator(AccountIdentification44 obj) throws Exception {
			checkAccountIdentification44(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount69
	 * QuantityAndAccount69}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount69> forQuantityAndAccount69 = new MMConstraint<QuantityAndAccount69>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> QuantityAndAccount69.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount69 obj) throws Exception {
			checkQuantityAndAccount69(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount70
	 * QuantityAndAccount70}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount70> forQuantityAndAccount70 = new MMConstraint<QuantityAndAccount70>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> QuantityAndAccount70.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount70 obj) throws Exception {
			checkQuantityAndAccount70(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount71
	 * QuantityAndAccount71}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount71> forQuantityAndAccount71 = new MMConstraint<QuantityAndAccount71>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> QuantityAndAccount71.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount71 obj) throws Exception {
			checkQuantityAndAccount71(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount72
	 * QuantityAndAccount72}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount72> forQuantityAndAccount72 = new MMConstraint<QuantityAndAccount72>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> QuantityAndAccount72.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount72 obj) throws Exception {
			checkQuantityAndAccount72(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount76
	 * QuantityAndAccount76}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount76> forQuantityAndAccount76 = new MMConstraint<QuantityAndAccount76>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceRule";
			definition = "The SafekeepingPlace functionality in the settlement instructions is only to be used for global custodians that allow their clients to specify where the securities are to be held, for example, in an ICSD account versus an account at the local CSD.";
			owner_lazy = () -> QuantityAndAccount76.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount76 obj) throws Exception {
			checkQuantityAndAccount76(obj);
		}
	};

	/**
	 * The SafekeepingPlace functionality in the settlement instructions is only
	 * to be used for global custodians that allow their clients to specify
	 * where the securities are to be held, for example, in an ICSD account
	 * versus an account at the local CSD.
	 */
	public static void checkQuantityAndAccount30(QuantityAndAccount30 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace functionality in the settlement instructions is only
	 * to be used for global custodians that allow their clients to specify
	 * where the securities are to be held, for example, in an ICSD account
	 * versus an account at the local CSD.
	 */
	public static void checkQuantityAndAccount33(QuantityAndAccount33 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, eg, in an
	 * ICSD account versus an account at the local CSD.
	 */
	public static void checkAccountIdentification9(AccountIdentification9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, eg, in an
	 * ICSD account versus an account at the local CSD.
	 */
	public static void checkAccountIdentification14(AccountIdentification14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, eg, in an
	 * ICSD account versus an account at the local CSD.
	 */
	public static void checkAccountIdentification15(AccountIdentification15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, eg, in an
	 * ICSD account versus an account at the local CSD.
	 */
	public static void checkAccountIdentification21(AccountIdentification21 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, eg, in an
	 * ICSD account versus an account at the local CSD.
	 */
	public static void checkAccountAndBalance2(AccountAndBalance2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, eg, in an
	 * ICSD account versus an account at the local CSD.
	 */
	public static void checkAccountAndBalance5(AccountAndBalance5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, eg, in an
	 * ICSD account versus an account at the local CSD.
	 */
	public static void checkAccountAndBalance10(AccountAndBalance10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, eg, in an
	 * ICSD account versus an account at the local CSD.
	 */
	public static void checkAccountAndBalance12(AccountAndBalance12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, eg, in an
	 * ICSD account versus an account at the local CSD.
	 */
	public static void checkAccountAndBalance17(AccountAndBalance17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, eg, in an
	 * ICSD account versus an account at the local CSD.
	 */
	public static void checkAccountAndBalance20(AccountAndBalance20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, eg, in an
	 * ICSD account versus an account at the local CSD.
	 */
	public static void checkAccountIdentification8(AccountIdentification8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, eg, in an
	 * ICSD account versus an account at the local CSD.
	 */
	public static void checkAccountIdentification17(AccountIdentification17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, eg, in an
	 * ICSD account versus an account at the local CSD.
	 */
	public static void checkAccountIdentification19(AccountIdentification19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, eg, in an
	 * ICSD account versus an account at the local CSD.
	 */
	public static void checkCorporateActionOption9(CorporateActionOption9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, eg, in an
	 * ICSD account versus an account at the local CSD.
	 */
	public static void checkCorporateActionOption18(CorporateActionOption18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, eg, in an
	 * ICSD account versus an account at the local CSD.
	 */
	public static void checkCorporateActionOption22(CorporateActionOption22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, eg, in an
	 * ICSD account versus an account at the local CSD.
	 */
	public static void checkCorporateActionOption27(CorporateActionOption27 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, eg, in an
	 * ICSD account versus an account at the local CSD.
	 */
	public static void checkCorporateActionOption26(CorporateActionOption26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, eg, in an
	 * ICSD account versus an account at the local CSD.
	 */
	public static void checkCorporateActionOption41(CorporateActionOption41 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, eg, in an
	 * ICSD account versus an account at the local CSD.
	 */
	public static void checkCorporateActionOption50(CorporateActionOption50 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, eg, in an
	 * ICSD account versus an account at the local CSD.
	 */
	public static void checkAccountIdentification6(AccountIdentification6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, eg, in an
	 * ICSD account versus an account at the local CSD.
	 */
	public static void checkAccountIdentification12(AccountIdentification12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, eg, in an
	 * ICSD account versus an account at the local CSD.
	 */
	public static void checkAccountIdentification16(AccountIdentification16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, eg, in an
	 * ICSD account versus an account at the local CSD.
	 */
	public static void checkAccountIdentification22(AccountIdentification22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, eg, in an
	 * ICSD account versus an account at the local CSD.
	 */
	public static void checkAccountIdentification23(AccountIdentification23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, eg, in an
	 * ICSD account versus an account at the local CSD.
	 */
	public static void checkAccountIdentification24(AccountIdentification24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, eg, in an
	 * ICSD account versus an account at the local CSD.
	 */
	public static void checkAccountIdentification25(AccountIdentification25 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, eg, in an
	 * ICSD account versus an account at the local CSD.
	 */
	public static void checkAccountIdentification29(AccountIdentification29 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, eg, in an
	 * ICSD account versus an account at the local CSD.
	 */
	public static void checkCorporateActionOption29(CorporateActionOption29 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, eg, in an
	 * ICSD account versus an account at the local CSD.
	 */
	public static void checkAccountAndBalance3(AccountAndBalance3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, eg, in an
	 * ICSD account versus an account at the local CSD.
	 */
	public static void checkAccountAndBalance6(AccountAndBalance6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, eg, in an
	 * ICSD account versus an account at the local CSD.
	 */
	public static void checkAccountAndBalance11(AccountAndBalance11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, eg, in an
	 * ICSD account versus an account at the local CSD.
	 */
	public static void checkAccountAndBalance13(AccountAndBalance13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, eg, in an
	 * ICSD account versus an account at the local CSD.
	 */
	public static void checkAccountAndBalance16(AccountAndBalance16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, eg, in an
	 * ICSD account versus an account at the local CSD.
	 */
	public static void checkAccountAndBalance19(AccountAndBalance19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, eg, in an
	 * ICSD account versus an account at the local CSD.
	 */
	public static void checkAccountAndBalance22(AccountAndBalance22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, eg, in an
	 * ICSD account versus an account at the local CSD.
	 */
	public static void checkAccountAndBalance23(AccountAndBalance23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, eg, in an
	 * ICSD account versus an account at the local CSD.
	 */
	public static void checkAccountAndBalance1(AccountAndBalance1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, eg, in an
	 * ICSD account versus an account at the local CSD.
	 */
	public static void checkAccountAndBalance7(AccountAndBalance7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, eg, in an
	 * ICSD account versus an account at the local CSD.
	 */
	public static void checkAccountAndBalance9(AccountAndBalance9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, eg, in an
	 * ICSD account versus an account at the local CSD.
	 */
	public static void checkAccountAndBalance14(AccountAndBalance14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, eg, in an
	 * ICSD account versus an account at the local CSD.
	 */
	public static void checkAccountAndBalance15(AccountAndBalance15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, eg, in an
	 * ICSD account versus an account at the local CSD.
	 */
	public static void checkAccountAndBalance18(AccountAndBalance18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, eg, in an
	 * ICSD account versus an account at the local CSD.
	 */
	public static void checkAccountAndBalance21(AccountAndBalance21 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, eg, in an
	 * ICSD account versus an account at the local CSD.
	 */
	public static void checkAccountAndBalance24(AccountAndBalance24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace functionality in the settlement instructions is only
	 * to be used for global custodians that allow their clients to specify
	 * where the securities are to be held, for example, in an ICSD account
	 * versus an account at the local CSD.
	 */
	public static void checkQuantityAndAccount1(QuantityAndAccount1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace functionality in the settlement instructions is only
	 * to be used for global custodians that allow their clients to specify
	 * where the securities are to be held, for example, in an ICSD account
	 * versus an account at the local CSD.
	 */
	public static void checkQuantityAndAccount5(QuantityAndAccount5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace functionality in the settlement instructions is only
	 * to be used for global custodians that allow their clients to specify
	 * where the securities are to be held, for example, in an ICSD account
	 * versus an account at the local CSD.
	 */
	public static void checkQuantityAndAccount17(QuantityAndAccount17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace functionality in the settlement instructions is only
	 * to be used for global custodians that allow their clients to specify
	 * where the securities are to be held, for example, in an ICSD account
	 * versus an account at the local CSD.
	 */
	public static void checkQuantityAndAccount24(QuantityAndAccount24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace functionality in the settlement instructions is only
	 * to be used for global custodians that allow their clients to specify
	 * where the securities are to be held, for example, in an ICSD account
	 * versus an account at the local CSD.
	 */
	public static void checkQuantityAndAccount25(QuantityAndAccount25 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace functionality in the settlement instructions is only
	 * to be used for global custodians that allow their clients to specify
	 * where the securities are to be held, for example, in an ICSD account
	 * versus an account at the local CSD.
	 */
	public static void checkQuantityAndAccount34(QuantityAndAccount34 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace functionality in the settlement instructions is only
	 * to be used for global custodians that allow their clients to specify
	 * where the securities are to be held, for example, in an ICSD account
	 * versus an account at the local CSD.
	 */
	public static void checkQuantityAndAccount2(QuantityAndAccount2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace functionality in the settlement instructions is only
	 * to be used for global custodians that allow their clients to specify
	 * where the securities are to be held, for example, in an ICSD account
	 * versus an account at the local CSD.
	 */
	public static void checkQuantityAndAccount12(QuantityAndAccount12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace functionality in the settlement instructions is only
	 * to be used for global custodians that allow their clients to specify
	 * where the securities are to be held, for example, in an ICSD account
	 * versus an account at the local CSD.
	 */
	public static void checkQuantityAndAccount15(QuantityAndAccount15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace functionality in the settlement instructions is only
	 * to be used for global custodians that allow their clients to specify
	 * where the securities are to be held, for example, in an ICSD account
	 * versus an account at the local CSD.
	 */
	public static void checkQuantityAndAccount20(QuantityAndAccount20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace functionality in the settlement instructions is only
	 * to be used for global custodians that allow their clients to specify
	 * where the securities are to be held, for example, in an ICSD account
	 * versus an account at the local CSD.
	 */
	public static void checkQuantityAndAccount28(QuantityAndAccount28 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace functionality in the settlement instructions is only
	 * to be used for global custodians that allow their clients to specify
	 * where the securities are to be held, for example, in an ICSD account
	 * versus an account at the local CSD.
	 */
	public static void checkQuantityAndAccount37(QuantityAndAccount37 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace functionality in the settlement instructions is only
	 * to be used for global custodians that allow their clients to specify
	 * where the securities are to be held, for example, in an ICSD account
	 * versus an account at the local CSD.
	 */
	public static void checkQuantityAndAccount3(QuantityAndAccount3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace functionality in the settlement instructions is only
	 * to be used for global custodians that allow their clients to specify
	 * where the securities are to be held, for example, in an ICSD account
	 * versus an account at the local CSD.
	 */
	public static void checkQuantityAndAccount13(QuantityAndAccount13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace functionality in the settlement instructions is only
	 * to be used for global custodians that allow their clients to specify
	 * where the securities are to be held, for example, in an ICSD account
	 * versus an account at the local CSD.
	 */
	public static void checkQuantityAndAccount8(QuantityAndAccount8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace functionality in the settlement instructions is only
	 * to be used for global custodians that allow their clients to specify
	 * where the securities are to be held, for example, in an ICSD account
	 * versus an account at the local CSD.
	 */
	public static void checkQuantityAndAccount14(QuantityAndAccount14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, eg, in an
	 * ICSD account versus an account at the local CSD.
	 */
	public static void checkAccountIdentification7(AccountIdentification7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, eg, in an
	 * ICSD account versus an account at the local CSD.
	 */
	public static void checkAccountIdentification13(AccountIdentification13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, eg, in an
	 * ICSD account versus an account at the local CSD.
	 */
	public static void checkAccountIdentification18(AccountIdentification18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, eg, in an
	 * ICSD account versus an account at the local CSD.
	 */
	public static void checkAccountIdentification20(AccountIdentification20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace functionality in the settlement instructions is only
	 * to be used for global custodians that allow their clients to specify
	 * where the securities are to be held, for example, in an ICSD account
	 * versus an account at the local CSD.
	 */
	public static void checkQuantityAndAccount4(QuantityAndAccount4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace functionality in the settlement instructions is only
	 * to be used for global custodians that allow their clients to specify
	 * where the securities are to be held, for example, in an ICSD account
	 * versus an account at the local CSD.
	 */
	public static void checkQuantityAndAccount22(QuantityAndAccount22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace functionality in the settlement instructions is only
	 * to be used for global custodians that allow their clients to specify
	 * where the securities are to be held, for example, in an ICSD account
	 * versus an account at the local CSD.
	 */
	public static void checkQuantityAndAccount27(QuantityAndAccount27 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace functionality in the settlement instructions is only
	 * to be used for global custodians that allow their clients to specify
	 * where the securities are to be held, for example, in an ICSD account
	 * versus an account at the local CSD.
	 */
	public static void checkQuantityAndAccount36(QuantityAndAccount36 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace functionality in the settlement instructions is only
	 * to be used for global custodians that allow their clients to specify
	 * where the securities are to be held, for example, in an ICSD account
	 * versus an account at the local CSD.
	 */
	public static void checkQuantityAndAccount9(QuantityAndAccount9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace functionality in the settlement instructions is only
	 * to be used for global custodians that allow their clients to specify
	 * where the securities are to be held, for example, in an ICSD account
	 * versus an account at the local CSD.
	 */
	public static void checkQuantityAndAccount23(QuantityAndAccount23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace functionality in the settlement instructions is only
	 * to be used for global custodians that allow their clients to specify
	 * where the securities are to be held, for example, in an ICSD account
	 * versus an account at the local CSD.
	 */
	public static void checkQuantityAndAccount26(QuantityAndAccount26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace functionality in the settlement instructions is only
	 * to be used for global custodians that allow their clients to specify
	 * where the securities are to be held, for example, in an ICSD account
	 * versus an account at the local CSD.
	 */
	public static void checkQuantityAndAccount35(QuantityAndAccount35 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, eg, in an
	 * ICSD account versus an account at the local CSD.
	 */
	public static void checkAccountIdentification11(AccountIdentification11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, eg, in an
	 * ICSD account versus an account at the local CSD.
	 */
	public static void checkAccountAndBalance26(AccountAndBalance26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, eg, in an
	 * ICSD account versus an account at the local CSD.
	 */
	public static void checkAccountAndBalance25(AccountAndBalance25 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, eg, in an
	 * ICSD account versus an account at the local CSD.
	 */
	public static void checkAccountAndBalance32(AccountAndBalance32 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, eg, in an
	 * ICSD account versus an account at the local CSD.
	 */
	public static void checkAccountAndBalance29(AccountAndBalance29 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace functionality in the settlement instructions is only
	 * to be used for global custodians that allow their clients to specify
	 * where the securities are to be held, for example, in an ICSD account
	 * versus an account at the local CSD.
	 */
	public static void checkQuantityAndAccount39(QuantityAndAccount39 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace functionality in the settlement instructions is only
	 * to be used for global custodians that allow their clients to specify
	 * where the securities are to be held, for example, in an ICSD account
	 * versus an account at the local CSD.
	 */
	public static void checkQuantityAndAccount41(QuantityAndAccount41 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace functionality in the settlement instructions is only
	 * to be used for global custodians that allow their clients to specify
	 * where the securities are to be held, for example, in an ICSD account
	 * versus an account at the local CSD.
	 */
	public static void checkQuantityAndAccount42(QuantityAndAccount42 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace functionality in the settlement instructions is only
	 * to be used for global custodians that allow their clients to specify
	 * where the securities are to be held, for example, in an ICSD account
	 * versus an account at the local CSD.
	 */
	public static void checkQuantityAndAccount43(QuantityAndAccount43 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace functionality in the settlement instructions is only
	 * to be used for global custodians that allow their clients to specify
	 * where the securities are to be held, for example, in an ICSD account
	 * versus an account at the local CSD.
	 */
	public static void checkQuantityAndAccount45(QuantityAndAccount45 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, eg, in an
	 * ICSD account versus an account at the local CSD.
	 */
	public static void checkAccountAndBalance34(AccountAndBalance34 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, eg, in an
	 * ICSD account versus an account at the local CSD.
	 */
	public static void checkAccountAndBalance35(AccountAndBalance35 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, for
	 * example, in an ICSD account versus an account at the local CSD.
	 */
	public static void checkAccountIdentification33(AccountIdentification33 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, for
	 * example, in an ICSD account versus an account at the local CSD.
	 */
	public static void checkCorporateActionOption116(CorporateActionOption116 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, for
	 * example, in an ICSD account versus an account at the local CSD.
	 */
	public static void checkAccountIdentification31(AccountIdentification31 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, eg, in an
	 * ICSD account versus an account at the local CSD.
	 */
	public static void checkAccountAndBalance33(AccountAndBalance33 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, for
	 * example, in an ICSD account versus an account at the local CSD.
	 */
	public static void checkAccountIdentification32(AccountIdentification32 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, for
	 * example, in an ICSD account versus an account at the local CSD.
	 */
	public static void checkCorporateActionOption121(CorporateActionOption121 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, eg, in an
	 * ICSD account versus an account at the local CSD.
	 */
	public static void checkAccountAndBalance38(AccountAndBalance38 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, for
	 * example, in an ICSD account versus an account at the local CSD.
	 */
	public static void checkAccountIdentification35(AccountIdentification35 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, eg, in an
	 * ICSD account versus an account at the local CSD.
	 */
	public static void checkAccountAndBalance37(AccountAndBalance37 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, for
	 * example, in an ICSD account versus an account at the local CSD.
	 */
	public static void checkAccountIdentification34(AccountIdentification34 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, for
	 * example, in an ICSD account versus an account at the local CSD.
	 */
	public static void checkAccountIdentification37(AccountIdentification37 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, eg, in an
	 * ICSD account versus an account at the local CSD.
	 */
	public static void checkAccountAndBalance39(AccountAndBalance39 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace functionality in the settlement instructions is only
	 * to be used for global custodians that allow their clients to specify
	 * where the securities are to be held, for example, in an ICSD account
	 * versus an account at the local CSD.
	 */
	public static void checkQuantityAndAccount47(QuantityAndAccount47 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace functionality in the settlement instructions is only
	 * to be used for global custodians that allow their clients to specify
	 * where the securities are to be held, for example, in an ICSD account
	 * versus an account at the local CSD.
	 */
	public static void checkQuantityAndAccount51(QuantityAndAccount51 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace functionality in the settlement instructions is only
	 * to be used for global custodians that allow their clients to specify
	 * where the securities are to be held, for example, in an ICSD account
	 * versus an account at the local CSD.
	 */
	public static void checkQuantityAndAccount49(QuantityAndAccount49 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace functionality in the settlement instructions is only
	 * to be used for global custodians that allow their clients to specify
	 * where the securities are to be held, for example, in an ICSD account
	 * versus an account at the local CSD.
	 */
	public static void checkQuantityAndAccount50(QuantityAndAccount50 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace functionality in the settlement instructions is only
	 * to be used for global custodians that allow their clients to specify
	 * where the securities are to be held, for example, in an ICSD account
	 * versus an account at the local CSD.
	 */
	public static void checkQuantityAndAccount55(QuantityAndAccount55 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, for
	 * example, in an ICSD account versus an account at the local CSD.
	 */
	public static void checkAccountIdentification39(AccountIdentification39 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, for
	 * example, in an ICSD account versus an account at the local CSD.
	 */
	public static void checkAccountIdentification40(AccountIdentification40 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, for
	 * example, in an ICSD account versus an account at the local CSD.
	 */
	public static void checkAccountIdentification41(AccountIdentification41 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace functionality in the settlement instructions is only
	 * to be used for global custodians that allow their clients to specify
	 * where the securities are to be held, for example, in an ICSD account
	 * versus an account at the local CSD.
	 */
	public static void checkQuantityAndAccount57(QuantityAndAccount57 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace functionality in the settlement instructions is only
	 * to be used for global custodians that allow their clients to specify
	 * where the securities are to be held, for example, in an ICSD account
	 * versus an account at the local CSD.
	 */
	public static void checkQuantityAndAccount58(QuantityAndAccount58 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace functionality in the settlement instructions is only
	 * to be used for global custodians that allow their clients to specify
	 * where the securities are to be held, for example, in an ICSD account
	 * versus an account at the local CSD.
	 */
	public static void checkQuantityAndAccount56(QuantityAndAccount56 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace functionality in the settlement instructions is only
	 * to be used for global custodians that allow their clients to specify
	 * where the securities are to be held, for example, in an ICSD account
	 * versus an account at the local CSD.
	 */
	public static void checkQuantityAndAccount60(QuantityAndAccount60 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace is only to be used by global custodians that allow
	 * their clients to specify where the securities are to be held, for
	 * example, in an ICSD account versus an account at the local CSD.
	 */
	public static void checkAccountIdentification42(AccountIdentification42 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace functionality in the settlement instructions is only
	 * to be used for global custodians that allow their clients to specify
	 * where the securities are to be held, for example, in an ICSD account
	 * versus an account at the local CSD.
	 */
	public static void checkQuantityAndAccount64(QuantityAndAccount64 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace functionality in the settlement instructions is only
	 * to be used for global custodians that allow their clients to specify
	 * where the securities are to be held, for example, in an ICSD account
	 * versus an account at the local CSD.
	 */
	public static void checkQuantityAndAccount63(QuantityAndAccount63 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace functionality in the settlement instructions is only
	 * to be used for global custodians that allow their clients to specify
	 * where the securities are to be held, for example, in an ICSD account
	 * versus an account at the local CSD.
	 */
	public static void checkQuantityAndAccount65(QuantityAndAccount65 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace functionality in the settlement instructions is only
	 * to be used for global custodians that allow their clients to specify
	 * where the securities are to be held, for example, in an ICSD account
	 * versus an account at the local CSD.
	 */
	public static void checkQuantityAndAccount67(QuantityAndAccount67 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace functionality in the settlement instructions is only
	 * to be used for global custodians that allow their clients to specify
	 * where the securities are to be held, for example, in an ICSD account
	 * versus an account at the local CSD.
	 */
	public static void checkQuantityAndAccount68(QuantityAndAccount68 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * SafekeepingPlace must only be used by global custodians that allow their
	 * clients to specify where the securities are to be held, for example, in
	 * an ICSD account versus an account at the local CSD.
	 */
	public static void checkCorporateActionOption141(CorporateActionOption141 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * SafekeepingPlace is only to be used by global custodians that allow their
	 * clients to specify where the securities are to be held, for example, in
	 * an ICSD account versus an account at the local CSD.
	 */
	public static void checkAccountIdentification43(AccountIdentification43 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * SafekeepingPlace must only be used by global custodians that allow their
	 * clients to specify where the securities are to be held, for example, in
	 * an ICSD account versus an account at the local CSD.
	 */
	public static void checkCorporateActionOption144(CorporateActionOption144 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * SafekeepingPlace is only to be used by global custodians that allow their
	 * clients to specify where the securities are to be held, for example, in
	 * an ICSD account versus an account at the local CSD.
	 */
	public static void checkAccountIdentification44(AccountIdentification44 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace functionality in the settlement instructions is only
	 * to be used for global custodians that allow their clients to specify
	 * where the securities are to be held, for example, in an ICSD account
	 * versus an account at the local CSD.
	 */
	public static void checkQuantityAndAccount69(QuantityAndAccount69 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace functionality in the settlement instructions is only
	 * to be used for global custodians that allow their clients to specify
	 * where the securities are to be held, for example, in an ICSD account
	 * versus an account at the local CSD.
	 */
	public static void checkQuantityAndAccount70(QuantityAndAccount70 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace functionality in the settlement instructions is only
	 * to be used for global custodians that allow their clients to specify
	 * where the securities are to be held, for example, in an ICSD account
	 * versus an account at the local CSD.
	 */
	public static void checkQuantityAndAccount71(QuantityAndAccount71 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace functionality in the settlement instructions is only
	 * to be used for global custodians that allow their clients to specify
	 * where the securities are to be held, for example, in an ICSD account
	 * versus an account at the local CSD.
	 */
	public static void checkQuantityAndAccount72(QuantityAndAccount72 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SafekeepingPlace functionality in the settlement instructions is only
	 * to be used for global custodians that allow their clients to specify
	 * where the securities are to be held, for example, in an ICSD account
	 * versus an account at the local CSD.
	 */
	public static void checkQuantityAndAccount76(QuantityAndAccount76 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}