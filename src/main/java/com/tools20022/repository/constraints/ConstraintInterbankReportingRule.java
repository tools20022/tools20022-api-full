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
 * When the reported transaction is an interbank transaction or when the
 * counterparty is a supranational authority or when transaction is conducted
 * via a central clearing counterparty (CCP), the counterparty must be
 * identified with the LEI only. In the latter case, this variable must specify
 * the LEI of the CCP.
 */
public class ConstraintInterbankReportingRule {

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
	 * name} = "InterbankReportingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When the reported transaction is an interbank transaction or when the counterparty is a supranational authority or when transaction is conducted via a central clearing counterparty (CCP), the counterparty must be identified with the LEI only. In the latter case, this variable must specify the LEI of the CCP."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInterbankReportingRule#forCounterpartyIdentification2Choice
	 * ConstraintInterbankReportingRule.forCounterpartyIdentification2Choice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CounterpartyIdentification1Choice> forCounterpartyIdentification1Choice = new MMConstraint<CounterpartyIdentification1Choice>() {
		{
			validator = ConstraintInterbankReportingRule::checkCounterpartyIdentification1Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterbankReportingRule";
			definition = "When the reported transaction is an interbank transaction or when the counterparty is a supranational authority or when transaction is conducted via a central clearing counterparty (CCP), the counterparty must be identified with the LEI only. In the latter case, this variable must specify the LEI of the CCP.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInterbankReportingRule.forCounterpartyIdentification2Choice);
			owner_lazy = () -> CounterpartyIdentification1Choice.mmObject();
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
	 * name} = "InterbankReportingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When the reported transaction is an interbank transaction or when the counterparty is a supranational authority or when transaction is conducted via a central clearing counterparty (CCP), the counterparty must be identified with the LEI only. In the latter case, this variable must specify the LEI of the CCP."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInterbankReportingRule#forCounterpartyIdentification3Choice
	 * ConstraintInterbankReportingRule.forCounterpartyIdentification3Choice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInterbankReportingRule#forCounterpartyIdentification1Choice
	 * ConstraintInterbankReportingRule.forCounterpartyIdentification1Choice}</li>
	 * </ul>
	 */
	public static final MMConstraint<CounterpartyIdentification2Choice> forCounterpartyIdentification2Choice = new MMConstraint<CounterpartyIdentification2Choice>() {
		{
			validator = ConstraintInterbankReportingRule::checkCounterpartyIdentification2Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterbankReportingRule";
			definition = "When the reported transaction is an interbank transaction or when the counterparty is a supranational authority or when transaction is conducted via a central clearing counterparty (CCP), the counterparty must be identified with the LEI only. In the latter case, this variable must specify the LEI of the CCP.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInterbankReportingRule.forCounterpartyIdentification3Choice);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintInterbankReportingRule.forCounterpartyIdentification1Choice;
			owner_lazy = () -> CounterpartyIdentification2Choice.mmObject();
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
	 * name} = "InterbankReportingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When the reported transaction is an interbank transaction or when the counterparty is a supranational authority or when transaction is conducted via a central clearing counterparty (CCP), the counterparty must be identified with the LEI only. In the latter case, this variable must specify the LEI of the CCP."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInterbankReportingRule#forCounterpartyIdentification2Choice
	 * ConstraintInterbankReportingRule.forCounterpartyIdentification2Choice}</li>
	 * </ul>
	 */
	public static final MMConstraint<CounterpartyIdentification3Choice> forCounterpartyIdentification3Choice = new MMConstraint<CounterpartyIdentification3Choice>() {
		{
			validator = ConstraintInterbankReportingRule::checkCounterpartyIdentification3Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterbankReportingRule";
			definition = "When the reported transaction is an interbank transaction or when the counterparty is a supranational authority or when transaction is conducted via a central clearing counterparty (CCP), the counterparty must be identified with the LEI only. In the latter case, this variable must specify the LEI of the CCP.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintInterbankReportingRule.forCounterpartyIdentification2Choice;
			owner_lazy = () -> CounterpartyIdentification3Choice.mmObject();
		}
	};

	/**
	 * When the reported transaction is an interbank transaction or when the
	 * counterparty is a supranational authority or when transaction is
	 * conducted via a central clearing counterparty (CCP), the counterparty
	 * must be identified with the LEI only. In the latter case, this variable
	 * must specify the LEI of the CCP.
	 */
	public static void checkCounterpartyIdentification1Choice(CounterpartyIdentification1Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * When the reported transaction is an interbank transaction or when the
	 * counterparty is a supranational authority or when transaction is
	 * conducted via a central clearing counterparty (CCP), the counterparty
	 * must be identified with the LEI only. In the latter case, this variable
	 * must specify the LEI of the CCP.
	 */
	public static void checkCounterpartyIdentification2Choice(CounterpartyIdentification2Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * When the reported transaction is an interbank transaction or when the
	 * counterparty is a supranational authority or when transaction is
	 * conducted via a central clearing counterparty (CCP), the counterparty
	 * must be identified with the LEI only. In the latter case, this variable
	 * must specify the LEI of the CCP.
	 */
	public static void checkCounterpartyIdentification3Choice(CounterpartyIdentification3Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}