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
 * The SecuritiesMessageCancellationAdvice can be used to cancel a
 * SecuritiesSettlementTransactionAllegementNotification for two reasons: - The
 * message was sent by mistake - The counterparty cancelled its instruction.
 */
public class ConstraintSecuritiesSettlementTransactionAllegementNotificationRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.References3Choice
	 * References3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesSettlementTransactionAllegementNotificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SecuritiesMessageCancellationAdvice can be used to cancel a SecuritiesSettlementTransactionAllegementNotification for two reasons: \n- The message was sent by mistake\n- The counterparty cancelled its instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<References3Choice> forReferences3Choice = new MMConstraint<References3Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesSettlementTransactionAllegementNotificationRule";
			definition = "The SecuritiesMessageCancellationAdvice can be used to cancel a SecuritiesSettlementTransactionAllegementNotification for two reasons: \n- The message was sent by mistake\n- The counterparty cancelled its instruction.";
			owner_lazy = () -> References3Choice.mmObject();
		}

		@Override
		public void executeValidator(References3Choice obj) throws Exception {
			checkReferences3Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.References9Choice
	 * References9Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesSettlementTransactionAllegementNotificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SecuritiesMessageCancellationAdvice can be used to cancel a SecuritiesSettlementTransactionAllegementNotification for two reasons: \n- The message was sent by mistake\n- The counterparty cancelled its instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<References9Choice> forReferences9Choice = new MMConstraint<References9Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesSettlementTransactionAllegementNotificationRule";
			definition = "The SecuritiesMessageCancellationAdvice can be used to cancel a SecuritiesSettlementTransactionAllegementNotification for two reasons: \n- The message was sent by mistake\n- The counterparty cancelled its instruction.";
			owner_lazy = () -> References9Choice.mmObject();
		}

		@Override
		public void executeValidator(References9Choice obj) throws Exception {
			checkReferences9Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.References18Choice
	 * References18Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesSettlementTransactionAllegementNotificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SecuritiesMessageCancellationAdvice can be used to cancel a SecuritiesSettlementTransactionAllegementNotification for two reasons: \n- The message was sent by mistake\n- The counterparty cancelled its instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<References18Choice> forReferences18Choice = new MMConstraint<References18Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesSettlementTransactionAllegementNotificationRule";
			definition = "The SecuritiesMessageCancellationAdvice can be used to cancel a SecuritiesSettlementTransactionAllegementNotification for two reasons: \n- The message was sent by mistake\n- The counterparty cancelled its instruction.";
			owner_lazy = () -> References18Choice.mmObject();
		}

		@Override
		public void executeValidator(References18Choice obj) throws Exception {
			checkReferences18Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.References20Choice
	 * References20Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesSettlementTransactionAllegementNotificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SecuritiesMessageCancellationAdvice can be used to cancel a SecuritiesSettlementTransactionAllegementNotification for two reasons: \n- The message was sent by mistake\n- The counterparty cancelled its instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<References20Choice> forReferences20Choice = new MMConstraint<References20Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesSettlementTransactionAllegementNotificationRule";
			definition = "The SecuritiesMessageCancellationAdvice can be used to cancel a SecuritiesSettlementTransactionAllegementNotification for two reasons: \n- The message was sent by mistake\n- The counterparty cancelled its instruction.";
			owner_lazy = () -> References20Choice.mmObject();
		}

		@Override
		public void executeValidator(References20Choice obj) throws Exception {
			checkReferences20Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.References29Choice
	 * References29Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesSettlementTransactionAllegementNotificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SecuritiesMessageCancellationAdvice can be used to cancel a SecuritiesSettlementTransactionAllegementNotification for two reasons: \n- The message was sent by mistake\n- The counterparty cancelled its instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<References29Choice> forReferences29Choice = new MMConstraint<References29Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesSettlementTransactionAllegementNotificationRule";
			definition = "The SecuritiesMessageCancellationAdvice can be used to cancel a SecuritiesSettlementTransactionAllegementNotification for two reasons: \n- The message was sent by mistake\n- The counterparty cancelled its instruction.";
			owner_lazy = () -> References29Choice.mmObject();
		}

		@Override
		public void executeValidator(References29Choice obj) throws Exception {
			checkReferences29Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.References37Choice
	 * References37Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesSettlementTransactionAllegementNotificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SecuritiesMessageCancellationAdvice can be used to cancel a SecuritiesSettlementTransactionAllegementNotification for two reasons: \n- The message was sent by mistake\n- The counterparty cancelled its instruction."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesSettlementTransactionAllegementNotificationRule#forReferences43Choice
	 * ConstraintSecuritiesSettlementTransactionAllegementNotificationRule.
	 * forReferences43Choice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<References37Choice> forReferences37Choice = new MMConstraint<References37Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesSettlementTransactionAllegementNotificationRule";
			definition = "The SecuritiesMessageCancellationAdvice can be used to cancel a SecuritiesSettlementTransactionAllegementNotification for two reasons: \n- The message was sent by mistake\n- The counterparty cancelled its instruction.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesSettlementTransactionAllegementNotificationRule.forReferences43Choice);
			owner_lazy = () -> References37Choice.mmObject();
		}

		@Override
		public void executeValidator(References37Choice obj) throws Exception {
			checkReferences37Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.References38Choice
	 * References38Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesSettlementTransactionAllegementNotificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SecuritiesMessageCancellationAdvice can be used to cancel a SecuritiesSettlementTransactionAllegementNotification for two reasons: \n- The message was sent by mistake\n- The counterparty cancelled its instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<References38Choice> forReferences38Choice = new MMConstraint<References38Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesSettlementTransactionAllegementNotificationRule";
			definition = "The SecuritiesMessageCancellationAdvice can be used to cancel a SecuritiesSettlementTransactionAllegementNotification for two reasons: \n- The message was sent by mistake\n- The counterparty cancelled its instruction.";
			owner_lazy = () -> References38Choice.mmObject();
		}

		@Override
		public void executeValidator(References38Choice obj) throws Exception {
			checkReferences38Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.References43Choice
	 * References43Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesSettlementTransactionAllegementNotificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SecuritiesMessageCancellationAdvice can be used to cancel a SecuritiesSettlementTransactionAllegementNotification for two reasons: \n- The message was sent by mistake\n- The counterparty cancelled its instruction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesSettlementTransactionAllegementNotificationRule#forReferences37Choice
	 * ConstraintSecuritiesSettlementTransactionAllegementNotificationRule.
	 * forReferences37Choice}</li>
	 * </ul>
	 */
	public static final MMConstraint<References43Choice> forReferences43Choice = new MMConstraint<References43Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesSettlementTransactionAllegementNotificationRule";
			definition = "The SecuritiesMessageCancellationAdvice can be used to cancel a SecuritiesSettlementTransactionAllegementNotification for two reasons: \n- The message was sent by mistake\n- The counterparty cancelled its instruction.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesSettlementTransactionAllegementNotificationRule.forReferences37Choice;
			owner_lazy = () -> References43Choice.mmObject();
		}

		@Override
		public void executeValidator(References43Choice obj) throws Exception {
			checkReferences43Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.References53Choice
	 * References53Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesSettlementTransactionAllegementNotificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SecuritiesMessageCancellationAdvice can be used to cancel a SecuritiesSettlementTransactionAllegementNotification for two reasons: \n- The message was sent by mistake\n- The counterparty cancelled its instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<References53Choice> forReferences53Choice = new MMConstraint<References53Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesSettlementTransactionAllegementNotificationRule";
			definition = "The SecuritiesMessageCancellationAdvice can be used to cancel a SecuritiesSettlementTransactionAllegementNotification for two reasons: \n- The message was sent by mistake\n- The counterparty cancelled its instruction.";
			owner_lazy = () -> References53Choice.mmObject();
		}

		@Override
		public void executeValidator(References53Choice obj) throws Exception {
			checkReferences53Choice(obj);
		}
	};

	/**
	 * The SecuritiesMessageCancellationAdvice can be used to cancel a
	 * SecuritiesSettlementTransactionAllegementNotification for two reasons: -
	 * The message was sent by mistake - The counterparty cancelled its
	 * instruction.
	 */
	public static void checkReferences3Choice(References3Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SecuritiesMessageCancellationAdvice can be used to cancel a
	 * SecuritiesSettlementTransactionAllegementNotification for two reasons: -
	 * The message was sent by mistake - The counterparty cancelled its
	 * instruction.
	 */
	public static void checkReferences9Choice(References9Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SecuritiesMessageCancellationAdvice can be used to cancel a
	 * SecuritiesSettlementTransactionAllegementNotification for two reasons: -
	 * The message was sent by mistake - The counterparty cancelled its
	 * instruction.
	 */
	public static void checkReferences18Choice(References18Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SecuritiesMessageCancellationAdvice can be used to cancel a
	 * SecuritiesSettlementTransactionAllegementNotification for two reasons: -
	 * The message was sent by mistake - The counterparty cancelled its
	 * instruction.
	 */
	public static void checkReferences20Choice(References20Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SecuritiesMessageCancellationAdvice can be used to cancel a
	 * SecuritiesSettlementTransactionAllegementNotification for two reasons: -
	 * The message was sent by mistake - The counterparty cancelled its
	 * instruction.
	 */
	public static void checkReferences29Choice(References29Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SecuritiesMessageCancellationAdvice can be used to cancel a
	 * SecuritiesSettlementTransactionAllegementNotification for two reasons: -
	 * The message was sent by mistake - The counterparty cancelled its
	 * instruction.
	 */
	public static void checkReferences37Choice(References37Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SecuritiesMessageCancellationAdvice can be used to cancel a
	 * SecuritiesSettlementTransactionAllegementNotification for two reasons: -
	 * The message was sent by mistake - The counterparty cancelled its
	 * instruction.
	 */
	public static void checkReferences38Choice(References38Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SecuritiesMessageCancellationAdvice can be used to cancel a
	 * SecuritiesSettlementTransactionAllegementNotification for two reasons: -
	 * The message was sent by mistake - The counterparty cancelled its
	 * instruction.
	 */
	public static void checkReferences43Choice(References43Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SecuritiesMessageCancellationAdvice can be used to cancel a
	 * SecuritiesSettlementTransactionAllegementNotification for two reasons: -
	 * The message was sent by mistake - The counterparty cancelled its
	 * instruction.
	 */
	public static void checkReferences53Choice(References53Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}