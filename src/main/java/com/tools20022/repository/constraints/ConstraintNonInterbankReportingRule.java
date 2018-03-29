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
import com.tools20022.repository.choice.CounterpartyIdentification1Choice;
import com.tools20022.repository.choice.CounterpartyIdentification2Choice;
import com.tools20022.repository.choice.CounterpartyIdentification3Choice;
import java.util.Arrays;

/**
 * When the reported transaction is not an interbank transaction and the
 * counterparty is not a supranational authority and the transaction is not
 * conducted via a central clearing counterparty, the counterparty must not be
 * identified with the LEI.
 */
public class ConstraintNonInterbankReportingRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.CounterpartyIdentification1Choice
	 * CounterpartyIdentification1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonInterbankReportingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When the reported transaction is not an interbank transaction and the counterparty is not a supranational authority and the transaction is not conducted via a central clearing counterparty, the counterparty must not be identified with the LEI."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNonInterbankReportingRule#forCounterpartyIdentification2Choice
	 * ConstraintNonInterbankReportingRule.forCounterpartyIdentification2Choice}
	 * </li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CounterpartyIdentification1Choice> forCounterpartyIdentification1Choice = new MMConstraint<CounterpartyIdentification1Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonInterbankReportingRule";
			definition = "When the reported transaction is not an interbank transaction and the counterparty is not a supranational authority and the transaction is not conducted via a central clearing counterparty, the counterparty must not be identified with the LEI.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNonInterbankReportingRule.forCounterpartyIdentification2Choice);
			owner_lazy = () -> CounterpartyIdentification1Choice.mmObject();
		}

		@Override
		public void executeValidator(CounterpartyIdentification1Choice obj) throws Exception {
			checkCounterpartyIdentification1Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.CounterpartyIdentification2Choice
	 * CounterpartyIdentification2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonInterbankReportingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When the reported transaction is not an interbank transaction and the counterparty is not a supranational authority and the transaction is not conducted via a central clearing counterparty, please refer to the relevant reporting instructions. \r\n"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNonInterbankReportingRule#forCounterpartyIdentification3Choice
	 * ConstraintNonInterbankReportingRule.forCounterpartyIdentification3Choice}
	 * </li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNonInterbankReportingRule#forCounterpartyIdentification1Choice
	 * ConstraintNonInterbankReportingRule.forCounterpartyIdentification1Choice}
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CounterpartyIdentification2Choice> forCounterpartyIdentification2Choice = new MMConstraint<CounterpartyIdentification2Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonInterbankReportingRule";
			definition = "When the reported transaction is not an interbank transaction and the counterparty is not a supranational authority and the transaction is not conducted via a central clearing counterparty, please refer to the relevant reporting instructions. \r\n";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNonInterbankReportingRule.forCounterpartyIdentification3Choice);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNonInterbankReportingRule.forCounterpartyIdentification1Choice;
			owner_lazy = () -> CounterpartyIdentification2Choice.mmObject();
		}

		@Override
		public void executeValidator(CounterpartyIdentification2Choice obj) throws Exception {
			checkCounterpartyIdentification2Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.CounterpartyIdentification3Choice
	 * CounterpartyIdentification3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonInterbankReportingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When the reported transaction is not an interbank transaction and the counterparty is not a supranational authority and the transaction is not conducted via a central clearing counterparty, please refer to the relevant reporting instructions. \r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNonInterbankReportingRule#forCounterpartyIdentification2Choice
	 * ConstraintNonInterbankReportingRule.forCounterpartyIdentification2Choice}
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CounterpartyIdentification3Choice> forCounterpartyIdentification3Choice = new MMConstraint<CounterpartyIdentification3Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonInterbankReportingRule";
			definition = "When the reported transaction is not an interbank transaction and the counterparty is not a supranational authority and the transaction is not conducted via a central clearing counterparty, please refer to the relevant reporting instructions. \r\n";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNonInterbankReportingRule.forCounterpartyIdentification2Choice;
			owner_lazy = () -> CounterpartyIdentification3Choice.mmObject();
		}

		@Override
		public void executeValidator(CounterpartyIdentification3Choice obj) throws Exception {
			checkCounterpartyIdentification3Choice(obj);
		}
	};

	/**
	 * When the reported transaction is not an interbank transaction and the
	 * counterparty is not a supranational authority and the transaction is not
	 * conducted via a central clearing counterparty, the counterparty must not
	 * be identified with the LEI.
	 */
	public static void checkCounterpartyIdentification1Choice(CounterpartyIdentification1Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * When the reported transaction is not an interbank transaction and the
	 * counterparty is not a supranational authority and the transaction is not
	 * conducted via a central clearing counterparty, please refer to the
	 * relevant reporting instructions. <br>
	 */
	public static void checkCounterpartyIdentification2Choice(CounterpartyIdentification2Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * When the reported transaction is not an interbank transaction and the
	 * counterparty is not a supranational authority and the transaction is not
	 * conducted via a central clearing counterparty, please refer to the
	 * relevant reporting instructions. <br>
	 */
	public static void checkCounterpartyIdentification3Choice(CounterpartyIdentification3Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}