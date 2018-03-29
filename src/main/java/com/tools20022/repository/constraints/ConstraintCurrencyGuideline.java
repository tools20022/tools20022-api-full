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
import com.tools20022.repository.area.camt.ReturnTransactionV07;
import com.tools20022.repository.msg.ReturnTransactionCopy1;

/**
 * The currency may be omitted in the amounts present in the message. However,
 * this should only be done in cases of one single currency systems (eg, the
 * euro).
 */
public class ConstraintCurrencyGuideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.ReturnTransactionV07
	 * ReturnTransactionV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The currency may be omitted in the amounts present in the message. However, this should only be done in cases of one single currency systems (eg, the euro)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ReturnTransactionV07> forReturnTransactionV07 = new MMConstraint<ReturnTransactionV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyGuideline";
			definition = "The currency may be omitted in the amounts present in the message. However, this should only be done in cases of one single currency systems (eg, the euro).";
			owner_lazy = () -> ReturnTransactionV07.mmObject();
		}

		@Override
		public void executeValidator(ReturnTransactionV07 obj) throws Exception {
			checkReturnTransactionV07(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReturnTransactionCopy1
	 * ReturnTransactionCopy1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The currency may be omitted in the amounts present in the message. However, this should only be done in cases of one single currency systems (eg, the euro)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ReturnTransactionCopy1> forReturnTransactionCopy1 = new MMConstraint<ReturnTransactionCopy1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyGuideline";
			definition = "The currency may be omitted in the amounts present in the message. However, this should only be done in cases of one single currency systems (eg, the euro).";
			owner_lazy = () -> ReturnTransactionCopy1.mmObject();
		}

		@Override
		public void executeValidator(ReturnTransactionCopy1 obj) throws Exception {
			checkReturnTransactionCopy1(obj);
		}
	};

	/**
	 * The currency may be omitted in the amounts present in the message.
	 * However, this should only be done in cases of one single currency systems
	 * (eg, the euro).
	 */
	public static void checkReturnTransactionV07(ReturnTransactionV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The currency may be omitted in the amounts present in the message.
	 * However, this should only be done in cases of one single currency systems
	 * (eg, the euro).
	 */
	public static void checkReturnTransactionCopy1(ReturnTransactionCopy1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}