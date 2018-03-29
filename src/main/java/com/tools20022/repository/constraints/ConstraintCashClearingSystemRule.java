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
 * The CashSettlementSystem codes are to be used only by agents directly
 * involved in the settlement process, such as local settlement agents, CSD's
 * and central banks.
 */
public class ConstraintCashClearingSystemRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails9
	 * SettlementDetails9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails9> forSettlementDetails9 = new MMConstraint<SettlementDetails9>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails9.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails9 obj) throws Exception {
			checkSettlementDetails9(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails17
	 * SettlementDetails17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails17> forSettlementDetails17 = new MMConstraint<SettlementDetails17>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails17.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails17 obj) throws Exception {
			checkSettlementDetails17(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails30
	 * SettlementDetails30}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails30> forSettlementDetails30 = new MMConstraint<SettlementDetails30>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails30.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails30 obj) throws Exception {
			checkSettlementDetails30(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails32
	 * SettlementDetails32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails32> forSettlementDetails32 = new MMConstraint<SettlementDetails32>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails32.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails32 obj) throws Exception {
			checkSettlementDetails32(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails60
	 * SettlementDetails60}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails71
	 * ConstraintCashClearingSystemRule.forSettlementDetails71}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails60> forSettlementDetails60 = new MMConstraint<SettlementDetails60>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails71);
			owner_lazy = () -> SettlementDetails60.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails60 obj) throws Exception {
			checkSettlementDetails60(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails64
	 * SettlementDetails64}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails64> forSettlementDetails64 = new MMConstraint<SettlementDetails64>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails64.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails64 obj) throws Exception {
			checkSettlementDetails64(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails3
	 * SettlementDetails3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails3> forSettlementDetails3 = new MMConstraint<SettlementDetails3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails3.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails3 obj) throws Exception {
			checkSettlementDetails3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails16
	 * SettlementDetails16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails16> forSettlementDetails16 = new MMConstraint<SettlementDetails16>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails16.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails16 obj) throws Exception {
			checkSettlementDetails16(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails31
	 * SettlementDetails31}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails31> forSettlementDetails31 = new MMConstraint<SettlementDetails31>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails31.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails31 obj) throws Exception {
			checkSettlementDetails31(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails40
	 * SettlementDetails40}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails40> forSettlementDetails40 = new MMConstraint<SettlementDetails40>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails40.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails40 obj) throws Exception {
			checkSettlementDetails40(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails62
	 * SettlementDetails62}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails72
	 * ConstraintCashClearingSystemRule.forSettlementDetails72}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails62> forSettlementDetails62 = new MMConstraint<SettlementDetails62>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails72);
			owner_lazy = () -> SettlementDetails62.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails62 obj) throws Exception {
			checkSettlementDetails62(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails63
	 * SettlementDetails63}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails63> forSettlementDetails63 = new MMConstraint<SettlementDetails63>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails63.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails63 obj) throws Exception {
			checkSettlementDetails63(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails6
	 * SettlementDetails6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails6> forSettlementDetails6 = new MMConstraint<SettlementDetails6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails6.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails6 obj) throws Exception {
			checkSettlementDetails6(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails20
	 * SettlementDetails20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails20> forSettlementDetails20 = new MMConstraint<SettlementDetails20>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails20.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails20 obj) throws Exception {
			checkSettlementDetails20(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails24
	 * SettlementDetails24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails24> forSettlementDetails24 = new MMConstraint<SettlementDetails24>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails24.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails24 obj) throws Exception {
			checkSettlementDetails24(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails33
	 * SettlementDetails33}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails33> forSettlementDetails33 = new MMConstraint<SettlementDetails33>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails33.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails33 obj) throws Exception {
			checkSettlementDetails33(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails45
	 * SettlementDetails45}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails70
	 * ConstraintCashClearingSystemRule.forSettlementDetails70}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails45> forSettlementDetails45 = new MMConstraint<SettlementDetails45>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails70);
			owner_lazy = () -> SettlementDetails45.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails45 obj) throws Exception {
			checkSettlementDetails45(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails54
	 * SettlementDetails54}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails54> forSettlementDetails54 = new MMConstraint<SettlementDetails54>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails54.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails54 obj) throws Exception {
			checkSettlementDetails54(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails1
	 * SettlementDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails1> forSettlementDetails1 = new MMConstraint<SettlementDetails1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails1.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails1 obj) throws Exception {
			checkSettlementDetails1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails19
	 * SettlementDetails19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails19> forSettlementDetails19 = new MMConstraint<SettlementDetails19>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails19.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails19 obj) throws Exception {
			checkSettlementDetails19(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails22
	 * SettlementDetails22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails22> forSettlementDetails22 = new MMConstraint<SettlementDetails22>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails22.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails22 obj) throws Exception {
			checkSettlementDetails22(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails35
	 * SettlementDetails35}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails35> forSettlementDetails35 = new MMConstraint<SettlementDetails35>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails35.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails35 obj) throws Exception {
			checkSettlementDetails35(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42
	 * SettlementDetails42}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails67
	 * ConstraintCashClearingSystemRule.forSettlementDetails67}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails42> forSettlementDetails42 = new MMConstraint<SettlementDetails42>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails67);
			owner_lazy = () -> SettlementDetails42.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails42 obj) throws Exception {
			checkSettlementDetails42(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails52
	 * SettlementDetails52}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails52> forSettlementDetails52 = new MMConstraint<SettlementDetails52>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails52.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails52 obj) throws Exception {
			checkSettlementDetails52(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails8
	 * SettlementDetails8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails8> forSettlementDetails8 = new MMConstraint<SettlementDetails8>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails8.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails8 obj) throws Exception {
			checkSettlementDetails8(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails11
	 * SettlementDetails11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails11> forSettlementDetails11 = new MMConstraint<SettlementDetails11>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails11.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails11 obj) throws Exception {
			checkSettlementDetails11(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails23
	 * SettlementDetails23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails23> forSettlementDetails23 = new MMConstraint<SettlementDetails23>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails23.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails23 obj) throws Exception {
			checkSettlementDetails23(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails37
	 * SettlementDetails37}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails37> forSettlementDetails37 = new MMConstraint<SettlementDetails37>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails37.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails37 obj) throws Exception {
			checkSettlementDetails37(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails44
	 * SettlementDetails44}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails69
	 * ConstraintCashClearingSystemRule.forSettlementDetails69}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails44> forSettlementDetails44 = new MMConstraint<SettlementDetails44>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails69);
			owner_lazy = () -> SettlementDetails44.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails44 obj) throws Exception {
			checkSettlementDetails44(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails53
	 * SettlementDetails53}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails53> forSettlementDetails53 = new MMConstraint<SettlementDetails53>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails53.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails53 obj) throws Exception {
			checkSettlementDetails53(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails7
	 * SettlementDetails7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails7> forSettlementDetails7 = new MMConstraint<SettlementDetails7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails7.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails7 obj) throws Exception {
			checkSettlementDetails7(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails12
	 * SettlementDetails12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails12> forSettlementDetails12 = new MMConstraint<SettlementDetails12>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails12.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails12 obj) throws Exception {
			checkSettlementDetails12(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails28
	 * SettlementDetails28}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails28> forSettlementDetails28 = new MMConstraint<SettlementDetails28>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails28.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails28 obj) throws Exception {
			checkSettlementDetails28(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails38
	 * SettlementDetails38}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails38> forSettlementDetails38 = new MMConstraint<SettlementDetails38>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails38.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails38 obj) throws Exception {
			checkSettlementDetails38(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails47
	 * SettlementDetails47}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails74
	 * ConstraintCashClearingSystemRule.forSettlementDetails74}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails47> forSettlementDetails47 = new MMConstraint<SettlementDetails47>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails74);
			owner_lazy = () -> SettlementDetails47.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails47 obj) throws Exception {
			checkSettlementDetails47(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails56
	 * SettlementDetails56}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails56> forSettlementDetails56 = new MMConstraint<SettlementDetails56>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails56.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails56 obj) throws Exception {
			checkSettlementDetails56(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails2
	 * SettlementDetails2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails2> forSettlementDetails2 = new MMConstraint<SettlementDetails2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails2.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails2 obj) throws Exception {
			checkSettlementDetails2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails13
	 * SettlementDetails13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails13> forSettlementDetails13 = new MMConstraint<SettlementDetails13>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails13.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails13 obj) throws Exception {
			checkSettlementDetails13(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails27
	 * SettlementDetails27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails27> forSettlementDetails27 = new MMConstraint<SettlementDetails27>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails27.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails27 obj) throws Exception {
			checkSettlementDetails27(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails39
	 * SettlementDetails39}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails39> forSettlementDetails39 = new MMConstraint<SettlementDetails39>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails39.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails39 obj) throws Exception {
			checkSettlementDetails39(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails48
	 * SettlementDetails48}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails75
	 * ConstraintCashClearingSystemRule.forSettlementDetails75}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails48> forSettlementDetails48 = new MMConstraint<SettlementDetails48>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails75);
			owner_lazy = () -> SettlementDetails48.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails48 obj) throws Exception {
			checkSettlementDetails48(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails57
	 * SettlementDetails57}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails57> forSettlementDetails57 = new MMConstraint<SettlementDetails57>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails57.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails57 obj) throws Exception {
			checkSettlementDetails57(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43
	 * SettlementDetails43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashClearingSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails43> forSettlementDetails43 = new MMConstraint<SettlementDetails43>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashClearingSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails43.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails43 obj) throws Exception {
			checkSettlementDetails43(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails10
	 * SettlementDetails10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails10> forSettlementDetails10 = new MMConstraint<SettlementDetails10>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails10.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails10 obj) throws Exception {
			checkSettlementDetails10(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails29
	 * SettlementDetails29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails29> forSettlementDetails29 = new MMConstraint<SettlementDetails29>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails29.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails29 obj) throws Exception {
			checkSettlementDetails29(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails5
	 * SettlementDetails5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails5> forSettlementDetails5 = new MMConstraint<SettlementDetails5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails5.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails5 obj) throws Exception {
			checkSettlementDetails5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails25
	 * SettlementDetails25}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails25> forSettlementDetails25 = new MMConstraint<SettlementDetails25>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails25.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails25 obj) throws Exception {
			checkSettlementDetails25(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails26
	 * SettlementDetails26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails26> forSettlementDetails26 = new MMConstraint<SettlementDetails26>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails26.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails26 obj) throws Exception {
			checkSettlementDetails26(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails65
	 * SettlementDetails65}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails65> forSettlementDetails65 = new MMConstraint<SettlementDetails65>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails65.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails65 obj) throws Exception {
			checkSettlementDetails65(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails14
	 * SettlementDetails14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails14> forSettlementDetails14 = new MMConstraint<SettlementDetails14>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails14.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails14 obj) throws Exception {
			checkSettlementDetails14(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails41
	 * SettlementDetails41}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails41> forSettlementDetails41 = new MMConstraint<SettlementDetails41>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails41.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails41 obj) throws Exception {
			checkSettlementDetails41(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails61
	 * SettlementDetails61}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails73
	 * ConstraintCashClearingSystemRule.forSettlementDetails73}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails61> forSettlementDetails61 = new MMConstraint<SettlementDetails61>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails73);
			owner_lazy = () -> SettlementDetails61.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails61 obj) throws Exception {
			checkSettlementDetails61(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails59
	 * SettlementDetails59}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails59> forSettlementDetails59 = new MMConstraint<SettlementDetails59>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails59.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails59 obj) throws Exception {
			checkSettlementDetails59(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails15
	 * SettlementDetails15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails15> forSettlementDetails15 = new MMConstraint<SettlementDetails15>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails15.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails15 obj) throws Exception {
			checkSettlementDetails15(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails34
	 * SettlementDetails34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails34> forSettlementDetails34 = new MMConstraint<SettlementDetails34>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails34.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails34 obj) throws Exception {
			checkSettlementDetails34(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails49
	 * SettlementDetails49}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails99
	 * ConstraintCashClearingSystemRule.forSettlementDetails99}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails49> forSettlementDetails49 = new MMConstraint<SettlementDetails49>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails99);
			owner_lazy = () -> SettlementDetails49.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails49 obj) throws Exception {
			checkSettlementDetails49(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails58
	 * SettlementDetails58}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails58> forSettlementDetails58 = new MMConstraint<SettlementDetails58>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails58.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails58 obj) throws Exception {
			checkSettlementDetails58(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails36
	 * SettlementDetails36}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails36> forSettlementDetails36 = new MMConstraint<SettlementDetails36>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails36.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails36 obj) throws Exception {
			checkSettlementDetails36(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails66
	 * SettlementDetails66}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails66> forSettlementDetails66 = new MMConstraint<SettlementDetails66>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails66.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails66 obj) throws Exception {
			checkSettlementDetails66(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67
	 * SettlementDetails67}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails93
	 * ConstraintCashClearingSystemRule.forSettlementDetails93}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails42
	 * ConstraintCashClearingSystemRule.forSettlementDetails42}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails67> forSettlementDetails67 = new MMConstraint<SettlementDetails67>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails93);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails42;
			owner_lazy = () -> SettlementDetails67.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails67 obj) throws Exception {
			checkSettlementDetails67(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails70
	 * SettlementDetails70}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails90
	 * ConstraintCashClearingSystemRule.forSettlementDetails90}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails45
	 * ConstraintCashClearingSystemRule.forSettlementDetails45}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails70> forSettlementDetails70 = new MMConstraint<SettlementDetails70>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails90);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails45;
			owner_lazy = () -> SettlementDetails70.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails70 obj) throws Exception {
			checkSettlementDetails70(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails69
	 * SettlementDetails69}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails95
	 * ConstraintCashClearingSystemRule.forSettlementDetails95}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails44
	 * ConstraintCashClearingSystemRule.forSettlementDetails44}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails69> forSettlementDetails69 = new MMConstraint<SettlementDetails69>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails95);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails44;
			owner_lazy = () -> SettlementDetails69.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails69 obj) throws Exception {
			checkSettlementDetails69(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails71
	 * SettlementDetails71}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails96
	 * ConstraintCashClearingSystemRule.forSettlementDetails96}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails60
	 * ConstraintCashClearingSystemRule.forSettlementDetails60}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails71> forSettlementDetails71 = new MMConstraint<SettlementDetails71>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails96);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails60;
			owner_lazy = () -> SettlementDetails71.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails71 obj) throws Exception {
			checkSettlementDetails71(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails72
	 * SettlementDetails72}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails97
	 * ConstraintCashClearingSystemRule.forSettlementDetails97}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails62
	 * ConstraintCashClearingSystemRule.forSettlementDetails62}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails72> forSettlementDetails72 = new MMConstraint<SettlementDetails72>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails97);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails62;
			owner_lazy = () -> SettlementDetails72.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails72 obj) throws Exception {
			checkSettlementDetails72(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails75
	 * SettlementDetails75}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails91
	 * ConstraintCashClearingSystemRule.forSettlementDetails91}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails48
	 * ConstraintCashClearingSystemRule.forSettlementDetails48}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails75> forSettlementDetails75 = new MMConstraint<SettlementDetails75>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails91);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails48;
			owner_lazy = () -> SettlementDetails75.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails75 obj) throws Exception {
			checkSettlementDetails75(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails73
	 * SettlementDetails73}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails98
	 * ConstraintCashClearingSystemRule.forSettlementDetails98}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails61
	 * ConstraintCashClearingSystemRule.forSettlementDetails61}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails73> forSettlementDetails73 = new MMConstraint<SettlementDetails73>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails98);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails61;
			owner_lazy = () -> SettlementDetails73.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails73 obj) throws Exception {
			checkSettlementDetails73(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails74
	 * SettlementDetails74}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails92
	 * ConstraintCashClearingSystemRule.forSettlementDetails92}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails47
	 * ConstraintCashClearingSystemRule.forSettlementDetails47}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails74> forSettlementDetails74 = new MMConstraint<SettlementDetails74>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails92);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails47;
			owner_lazy = () -> SettlementDetails74.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails74 obj) throws Exception {
			checkSettlementDetails74(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails81
	 * SettlementDetails81}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails81> forSettlementDetails81 = new MMConstraint<SettlementDetails81>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails81.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails81 obj) throws Exception {
			checkSettlementDetails81(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails76
	 * SettlementDetails76}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails76> forSettlementDetails76 = new MMConstraint<SettlementDetails76>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails76.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails76 obj) throws Exception {
			checkSettlementDetails76(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails80
	 * SettlementDetails80}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails80> forSettlementDetails80 = new MMConstraint<SettlementDetails80>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails80.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails80 obj) throws Exception {
			checkSettlementDetails80(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails78
	 * SettlementDetails78}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails78> forSettlementDetails78 = new MMConstraint<SettlementDetails78>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails78.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails78 obj) throws Exception {
			checkSettlementDetails78(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails77
	 * SettlementDetails77}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails77> forSettlementDetails77 = new MMConstraint<SettlementDetails77>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails77.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails77 obj) throws Exception {
			checkSettlementDetails77(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails79
	 * SettlementDetails79}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails79> forSettlementDetails79 = new MMConstraint<SettlementDetails79>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails79.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails79 obj) throws Exception {
			checkSettlementDetails79(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails87
	 * SettlementDetails87}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails87> forSettlementDetails87 = new MMConstraint<SettlementDetails87>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails87.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails87 obj) throws Exception {
			checkSettlementDetails87(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails86
	 * SettlementDetails86}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails86> forSettlementDetails86 = new MMConstraint<SettlementDetails86>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails86.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails86 obj) throws Exception {
			checkSettlementDetails86(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails85
	 * SettlementDetails85}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails85> forSettlementDetails85 = new MMConstraint<SettlementDetails85>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails85.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails85 obj) throws Exception {
			checkSettlementDetails85(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93
	 * SettlementDetails93}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails101
	 * ConstraintCashClearingSystemRule.forSettlementDetails101}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails119
	 * ConstraintCashClearingSystemRule.forSettlementDetails119}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails140
	 * ConstraintCashClearingSystemRule.forSettlementDetails140}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails67
	 * ConstraintCashClearingSystemRule.forSettlementDetails67}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails93> forSettlementDetails93 = new MMConstraint<SettlementDetails93>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails101,
					com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails119, com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails140);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails67;
			owner_lazy = () -> SettlementDetails93.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails93 obj) throws Exception {
			checkSettlementDetails93(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails90
	 * SettlementDetails90}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails128
	 * ConstraintCashClearingSystemRule.forSettlementDetails128}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails70
	 * ConstraintCashClearingSystemRule.forSettlementDetails70}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails90> forSettlementDetails90 = new MMConstraint<SettlementDetails90>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails128);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails70;
			owner_lazy = () -> SettlementDetails90.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails90 obj) throws Exception {
			checkSettlementDetails90(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails96
	 * SettlementDetails96}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails147
	 * ConstraintCashClearingSystemRule.forSettlementDetails147}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails71
	 * ConstraintCashClearingSystemRule.forSettlementDetails71}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails96> forSettlementDetails96 = new MMConstraint<SettlementDetails96>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails147);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails71;
			owner_lazy = () -> SettlementDetails96.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails96 obj) throws Exception {
			checkSettlementDetails96(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97
	 * SettlementDetails97}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails148
	 * ConstraintCashClearingSystemRule.forSettlementDetails148}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails72
	 * ConstraintCashClearingSystemRule.forSettlementDetails72}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails97> forSettlementDetails97 = new MMConstraint<SettlementDetails97>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails148);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails72;
			owner_lazy = () -> SettlementDetails97.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails97 obj) throws Exception {
			checkSettlementDetails97(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails99
	 * SettlementDetails99}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails125
	 * ConstraintCashClearingSystemRule.forSettlementDetails125}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails49
	 * ConstraintCashClearingSystemRule.forSettlementDetails49}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails99> forSettlementDetails99 = new MMConstraint<SettlementDetails99>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails125);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails49;
			owner_lazy = () -> SettlementDetails99.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails99 obj) throws Exception {
			checkSettlementDetails99(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails95
	 * SettlementDetails95}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails121
	 * ConstraintCashClearingSystemRule.forSettlementDetails121}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails69
	 * ConstraintCashClearingSystemRule.forSettlementDetails69}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails95> forSettlementDetails95 = new MMConstraint<SettlementDetails95>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails121);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails69;
			owner_lazy = () -> SettlementDetails95.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails95 obj) throws Exception {
			checkSettlementDetails95(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails91
	 * SettlementDetails91}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails126
	 * ConstraintCashClearingSystemRule.forSettlementDetails126}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails75
	 * ConstraintCashClearingSystemRule.forSettlementDetails75}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails91> forSettlementDetails91 = new MMConstraint<SettlementDetails91>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails126);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails75;
			owner_lazy = () -> SettlementDetails91.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails91 obj) throws Exception {
			checkSettlementDetails91(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails92
	 * SettlementDetails92}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails127
	 * ConstraintCashClearingSystemRule.forSettlementDetails127}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails74
	 * ConstraintCashClearingSystemRule.forSettlementDetails74}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails92> forSettlementDetails92 = new MMConstraint<SettlementDetails92>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails127);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails74;
			owner_lazy = () -> SettlementDetails92.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails92 obj) throws Exception {
			checkSettlementDetails92(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails98
	 * SettlementDetails98}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails73
	 * ConstraintCashClearingSystemRule.forSettlementDetails73}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails98> forSettlementDetails98 = new MMConstraint<SettlementDetails98>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails73;
			owner_lazy = () -> SettlementDetails98.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails98 obj) throws Exception {
			checkSettlementDetails98(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails101
	 * SettlementDetails101}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails120
	 * ConstraintCashClearingSystemRule.forSettlementDetails120}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails93
	 * ConstraintCashClearingSystemRule.forSettlementDetails93}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails101> forSettlementDetails101 = new MMConstraint<SettlementDetails101>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails120);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails93;
			owner_lazy = () -> SettlementDetails101.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails101 obj) throws Exception {
			checkSettlementDetails101(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails105
	 * SettlementDetails105}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails105> forSettlementDetails105 = new MMConstraint<SettlementDetails105>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails105.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails105 obj) throws Exception {
			checkSettlementDetails105(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails106
	 * SettlementDetails106}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails106> forSettlementDetails106 = new MMConstraint<SettlementDetails106>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails106.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails106 obj) throws Exception {
			checkSettlementDetails106(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails104
	 * SettlementDetails104}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails104> forSettlementDetails104 = new MMConstraint<SettlementDetails104>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails104.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails104 obj) throws Exception {
			checkSettlementDetails104(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails111
	 * SettlementDetails111}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails111> forSettlementDetails111 = new MMConstraint<SettlementDetails111>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails111.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails111 obj) throws Exception {
			checkSettlementDetails111(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails112
	 * SettlementDetails112}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails112> forSettlementDetails112 = new MMConstraint<SettlementDetails112>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails112.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails112 obj) throws Exception {
			checkSettlementDetails112(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails110
	 * SettlementDetails110}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails110> forSettlementDetails110 = new MMConstraint<SettlementDetails110>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails110.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails110 obj) throws Exception {
			checkSettlementDetails110(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails108
	 * SettlementDetails108}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails108> forSettlementDetails108 = new MMConstraint<SettlementDetails108>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails108.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails108 obj) throws Exception {
			checkSettlementDetails108(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails107
	 * SettlementDetails107}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails107> forSettlementDetails107 = new MMConstraint<SettlementDetails107>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails107.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails107 obj) throws Exception {
			checkSettlementDetails107(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails115
	 * SettlementDetails115}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails115> forSettlementDetails115 = new MMConstraint<SettlementDetails115>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails115.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails115 obj) throws Exception {
			checkSettlementDetails115(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails117
	 * SettlementDetails117}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails117> forSettlementDetails117 = new MMConstraint<SettlementDetails117>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails117.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails117 obj) throws Exception {
			checkSettlementDetails117(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails116
	 * SettlementDetails116}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails116> forSettlementDetails116 = new MMConstraint<SettlementDetails116>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails116.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails116 obj) throws Exception {
			checkSettlementDetails116(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails128
	 * SettlementDetails128}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails144
	 * ConstraintCashClearingSystemRule.forSettlementDetails144}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails90
	 * ConstraintCashClearingSystemRule.forSettlementDetails90}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails128> forSettlementDetails128 = new MMConstraint<SettlementDetails128>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails144);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails90;
			owner_lazy = () -> SettlementDetails128.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails128 obj) throws Exception {
			checkSettlementDetails128(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120
	 * SettlementDetails120}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails145
	 * ConstraintCashClearingSystemRule.forSettlementDetails145}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails101
	 * ConstraintCashClearingSystemRule.forSettlementDetails101}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails120> forSettlementDetails120 = new MMConstraint<SettlementDetails120>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails145);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails101;
			owner_lazy = () -> SettlementDetails120.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails120 obj) throws Exception {
			checkSettlementDetails120(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119
	 * SettlementDetails119}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails142
	 * ConstraintCashClearingSystemRule.forSettlementDetails142}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails93
	 * ConstraintCashClearingSystemRule.forSettlementDetails93}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails119> forSettlementDetails119 = new MMConstraint<SettlementDetails119>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails142);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails93;
			owner_lazy = () -> SettlementDetails119.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails119 obj) throws Exception {
			checkSettlementDetails119(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails125
	 * SettlementDetails125}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashClearingSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails141
	 * ConstraintCashClearingSystemRule.forSettlementDetails141}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails99
	 * ConstraintCashClearingSystemRule.forSettlementDetails99}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails125> forSettlementDetails125 = new MMConstraint<SettlementDetails125>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashClearingSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails141);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails99;
			owner_lazy = () -> SettlementDetails125.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails125 obj) throws Exception {
			checkSettlementDetails125(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails126
	 * SettlementDetails126}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails150
	 * ConstraintCashClearingSystemRule.forSettlementDetails150}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails91
	 * ConstraintCashClearingSystemRule.forSettlementDetails91}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails126> forSettlementDetails126 = new MMConstraint<SettlementDetails126>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails150);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails91;
			owner_lazy = () -> SettlementDetails126.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails126 obj) throws Exception {
			checkSettlementDetails126(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails127
	 * SettlementDetails127}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails149
	 * ConstraintCashClearingSystemRule.forSettlementDetails149}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails92
	 * ConstraintCashClearingSystemRule.forSettlementDetails92}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails127> forSettlementDetails127 = new MMConstraint<SettlementDetails127>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails149);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails92;
			owner_lazy = () -> SettlementDetails127.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails127 obj) throws Exception {
			checkSettlementDetails127(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails121
	 * SettlementDetails121}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails143
	 * ConstraintCashClearingSystemRule.forSettlementDetails143}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails95
	 * ConstraintCashClearingSystemRule.forSettlementDetails95}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails121> forSettlementDetails121 = new MMConstraint<SettlementDetails121>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails143);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails95;
			owner_lazy = () -> SettlementDetails121.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails121 obj) throws Exception {
			checkSettlementDetails121(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails134
	 * SettlementDetails134}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails134> forSettlementDetails134 = new MMConstraint<SettlementDetails134>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails134.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails134 obj) throws Exception {
			checkSettlementDetails134(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails137
	 * SettlementDetails137}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails137> forSettlementDetails137 = new MMConstraint<SettlementDetails137>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails137.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails137 obj) throws Exception {
			checkSettlementDetails137(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails132
	 * SettlementDetails132}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails132> forSettlementDetails132 = new MMConstraint<SettlementDetails132>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails132.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails132 obj) throws Exception {
			checkSettlementDetails132(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails130
	 * SettlementDetails130}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails130> forSettlementDetails130 = new MMConstraint<SettlementDetails130>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails130.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails130 obj) throws Exception {
			checkSettlementDetails130(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails131
	 * SettlementDetails131}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails131> forSettlementDetails131 = new MMConstraint<SettlementDetails131>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails131.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails131 obj) throws Exception {
			checkSettlementDetails131(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails133
	 * SettlementDetails133}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails133> forSettlementDetails133 = new MMConstraint<SettlementDetails133>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails133.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails133 obj) throws Exception {
			checkSettlementDetails133(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails139
	 * SettlementDetails139}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails139> forSettlementDetails139 = new MMConstraint<SettlementDetails139>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails139.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails139 obj) throws Exception {
			checkSettlementDetails139(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails140
	 * SettlementDetails140}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails93
	 * ConstraintCashClearingSystemRule.forSettlementDetails93}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails140> forSettlementDetails140 = new MMConstraint<SettlementDetails140>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails93;
			owner_lazy = () -> SettlementDetails140.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails140 obj) throws Exception {
			checkSettlementDetails140(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails147
	 * SettlementDetails147}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails96
	 * ConstraintCashClearingSystemRule.forSettlementDetails96}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails147> forSettlementDetails147 = new MMConstraint<SettlementDetails147>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails96;
			owner_lazy = () -> SettlementDetails147.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails147 obj) throws Exception {
			checkSettlementDetails147(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails142
	 * SettlementDetails142}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails119
	 * ConstraintCashClearingSystemRule.forSettlementDetails119}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails142> forSettlementDetails142 = new MMConstraint<SettlementDetails142>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails119;
			owner_lazy = () -> SettlementDetails142.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails142 obj) throws Exception {
			checkSettlementDetails142(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails144
	 * SettlementDetails144}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails128
	 * ConstraintCashClearingSystemRule.forSettlementDetails128}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails144> forSettlementDetails144 = new MMConstraint<SettlementDetails144>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails128;
			owner_lazy = () -> SettlementDetails144.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails144 obj) throws Exception {
			checkSettlementDetails144(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails148
	 * SettlementDetails148}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails97
	 * ConstraintCashClearingSystemRule.forSettlementDetails97}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails148> forSettlementDetails148 = new MMConstraint<SettlementDetails148>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails97;
			owner_lazy = () -> SettlementDetails148.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails148 obj) throws Exception {
			checkSettlementDetails148(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails141
	 * SettlementDetails141}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashClearingSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails125
	 * ConstraintCashClearingSystemRule.forSettlementDetails125}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails141> forSettlementDetails141 = new MMConstraint<SettlementDetails141>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashClearingSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails125;
			owner_lazy = () -> SettlementDetails141.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails141 obj) throws Exception {
			checkSettlementDetails141(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails145
	 * SettlementDetails145}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails120
	 * ConstraintCashClearingSystemRule.forSettlementDetails120}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails145> forSettlementDetails145 = new MMConstraint<SettlementDetails145>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails120;
			owner_lazy = () -> SettlementDetails145.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails145 obj) throws Exception {
			checkSettlementDetails145(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails143
	 * SettlementDetails143}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails121
	 * ConstraintCashClearingSystemRule.forSettlementDetails121}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails143> forSettlementDetails143 = new MMConstraint<SettlementDetails143>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails121;
			owner_lazy = () -> SettlementDetails143.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails143 obj) throws Exception {
			checkSettlementDetails143(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails149
	 * SettlementDetails149}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails127
	 * ConstraintCashClearingSystemRule.forSettlementDetails127}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails149> forSettlementDetails149 = new MMConstraint<SettlementDetails149>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails127;
			owner_lazy = () -> SettlementDetails149.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails149 obj) throws Exception {
			checkSettlementDetails149(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails150
	 * SettlementDetails150}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails126
	 * ConstraintCashClearingSystemRule.forSettlementDetails126}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails150> forSettlementDetails150 = new MMConstraint<SettlementDetails150>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails126;
			owner_lazy = () -> SettlementDetails150.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails150 obj) throws Exception {
			checkSettlementDetails150(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails151
	 * SettlementDetails151}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails151> forSettlementDetails151 = new MMConstraint<SettlementDetails151>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails151.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails151 obj) throws Exception {
			checkSettlementDetails151(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails152
	 * SettlementDetails152}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails152> forSettlementDetails152 = new MMConstraint<SettlementDetails152>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails152.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails152 obj) throws Exception {
			checkSettlementDetails152(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails153
	 * SettlementDetails153}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails153> forSettlementDetails153 = new MMConstraint<SettlementDetails153>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails153.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails153 obj) throws Exception {
			checkSettlementDetails153(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails155
	 * SettlementDetails155}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails155> forSettlementDetails155 = new MMConstraint<SettlementDetails155>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails155.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails155 obj) throws Exception {
			checkSettlementDetails155(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails156
	 * SettlementDetails156}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails156> forSettlementDetails156 = new MMConstraint<SettlementDetails156>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails156.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails156 obj) throws Exception {
			checkSettlementDetails156(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails157
	 * SettlementDetails157}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails157> forSettlementDetails157 = new MMConstraint<SettlementDetails157>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails157.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails157 obj) throws Exception {
			checkSettlementDetails157(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails160
	 * SettlementDetails160}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails160> forSettlementDetails160 = new MMConstraint<SettlementDetails160>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails160.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails160 obj) throws Exception {
			checkSettlementDetails160(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails161
	 * SettlementDetails161}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails161> forSettlementDetails161 = new MMConstraint<SettlementDetails161>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails161.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails161 obj) throws Exception {
			checkSettlementDetails161(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails162
	 * SettlementDetails162}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystemRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails162> forSettlementDetails162 = new MMConstraint<SettlementDetails162>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystemRule";
			definition = "The CashSettlementSystem codes are to be used only by agents directly involved in the settlement process, such as local settlement agents, CSD's and central banks.";
			owner_lazy = () -> SettlementDetails162.mmObject();
		}

		@Override
		public void executeValidator(SettlementDetails162 obj) throws Exception {
			checkSettlementDetails162(obj);
		}
	};

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails9(SettlementDetails9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails17(SettlementDetails17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails30(SettlementDetails30 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails32(SettlementDetails32 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails60(SettlementDetails60 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails64(SettlementDetails64 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails3(SettlementDetails3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails16(SettlementDetails16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails31(SettlementDetails31 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails40(SettlementDetails40 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails62(SettlementDetails62 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails63(SettlementDetails63 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails6(SettlementDetails6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails20(SettlementDetails20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails24(SettlementDetails24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails33(SettlementDetails33 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails45(SettlementDetails45 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails54(SettlementDetails54 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails1(SettlementDetails1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails19(SettlementDetails19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails22(SettlementDetails22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails35(SettlementDetails35 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails42(SettlementDetails42 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails52(SettlementDetails52 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails8(SettlementDetails8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails11(SettlementDetails11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails23(SettlementDetails23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails37(SettlementDetails37 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails44(SettlementDetails44 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails53(SettlementDetails53 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails7(SettlementDetails7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails12(SettlementDetails12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails28(SettlementDetails28 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails38(SettlementDetails38 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails47(SettlementDetails47 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails56(SettlementDetails56 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails2(SettlementDetails2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails13(SettlementDetails13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails27(SettlementDetails27 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails39(SettlementDetails39 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails48(SettlementDetails48 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails57(SettlementDetails57 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashClearingSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails43(SettlementDetails43 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails10(SettlementDetails10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails29(SettlementDetails29 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails5(SettlementDetails5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails25(SettlementDetails25 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails26(SettlementDetails26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails65(SettlementDetails65 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails14(SettlementDetails14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails41(SettlementDetails41 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails61(SettlementDetails61 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails59(SettlementDetails59 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails15(SettlementDetails15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails34(SettlementDetails34 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails49(SettlementDetails49 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails58(SettlementDetails58 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails36(SettlementDetails36 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails66(SettlementDetails66 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails67(SettlementDetails67 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails70(SettlementDetails70 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails69(SettlementDetails69 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails71(SettlementDetails71 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails72(SettlementDetails72 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails75(SettlementDetails75 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails73(SettlementDetails73 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails74(SettlementDetails74 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails81(SettlementDetails81 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails76(SettlementDetails76 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails80(SettlementDetails80 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails78(SettlementDetails78 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails77(SettlementDetails77 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails79(SettlementDetails79 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails87(SettlementDetails87 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails86(SettlementDetails86 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails85(SettlementDetails85 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails93(SettlementDetails93 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails90(SettlementDetails90 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails96(SettlementDetails96 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails97(SettlementDetails97 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails99(SettlementDetails99 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails95(SettlementDetails95 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails91(SettlementDetails91 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails92(SettlementDetails92 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails98(SettlementDetails98 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails101(SettlementDetails101 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails105(SettlementDetails105 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails106(SettlementDetails106 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails104(SettlementDetails104 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails111(SettlementDetails111 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails112(SettlementDetails112 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails110(SettlementDetails110 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails108(SettlementDetails108 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails107(SettlementDetails107 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails115(SettlementDetails115 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails117(SettlementDetails117 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails116(SettlementDetails116 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails128(SettlementDetails128 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails120(SettlementDetails120 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails119(SettlementDetails119 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashClearingSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails125(SettlementDetails125 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails126(SettlementDetails126 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails127(SettlementDetails127 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails121(SettlementDetails121 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails134(SettlementDetails134 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails137(SettlementDetails137 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails132(SettlementDetails132 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails130(SettlementDetails130 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails131(SettlementDetails131 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails133(SettlementDetails133 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails139(SettlementDetails139 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails140(SettlementDetails140 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails147(SettlementDetails147 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails142(SettlementDetails142 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails144(SettlementDetails144 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails148(SettlementDetails148 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashClearingSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails141(SettlementDetails141 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails145(SettlementDetails145 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails143(SettlementDetails143 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails149(SettlementDetails149 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails150(SettlementDetails150 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails151(SettlementDetails151 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails152(SettlementDetails152 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails153(SettlementDetails153 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails155(SettlementDetails155 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails156(SettlementDetails156 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails157(SettlementDetails157 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails160(SettlementDetails160 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails161(SettlementDetails161 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CashSettlementSystem codes are to be used only by agents directly
	 * involved in the settlement process, such as local settlement agents,
	 * CSD's and central banks.
	 */
	public static void checkSettlementDetails162(SettlementDetails162 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}