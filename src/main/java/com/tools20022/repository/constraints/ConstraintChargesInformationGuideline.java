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
 * The repetitive ChargesInformation should contain all separate information on
 * charges amount and which party has taken the charges for all agents along the
 * payment chain.
 */
public class ConstraintChargesInformationGuideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation2
	 * CreditTransferTransactionInformation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargesInformationGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The repetitive ChargesInformation should contain all separate information on charges amount and which party has taken the charges for all agents along the payment chain."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransactionInformation2> forCreditTransferTransactionInformation2 = new MMConstraint<CreditTransferTransactionInformation2>() {
		{
			validator = ConstraintChargesInformationGuideline::checkCreditTransferTransactionInformation2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargesInformationGuideline";
			definition = "The repetitive ChargesInformation should contain all separate information on charges amount and which party has taken the charges for all agents along the payment chain.";
			owner_lazy = () -> CreditTransferTransactionInformation2.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation11
	 * CreditTransferTransactionInformation11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargesInformationGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The repetitive ChargesInformation should contain all information on charges amount and which party has taken the charges, separately for each agent along the payment chain."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransactionInformation11> forCreditTransferTransactionInformation11 = new MMConstraint<CreditTransferTransactionInformation11>() {
		{
			validator = ConstraintChargesInformationGuideline::checkCreditTransferTransactionInformation11;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargesInformationGuideline";
			definition = "The repetitive ChargesInformation should contain all information on charges amount and which party has taken the charges, separately for each agent along the payment chain.";
			owner_lazy = () -> CreditTransferTransactionInformation11.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction2
	 * CreditTransferTransaction2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargesInformationGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The repetitive ChargesInformation should contain all information on charges amount and which party has taken the charges, separately for each agent along the payment chain."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction2> forCreditTransferTransaction2 = new MMConstraint<CreditTransferTransaction2>() {
		{
			validator = ConstraintChargesInformationGuideline::checkCreditTransferTransaction2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargesInformationGuideline";
			definition = "The repetitive ChargesInformation should contain all information on charges amount and which party has taken the charges, separately for each agent along the payment chain.";
			owner_lazy = () -> CreditTransferTransaction2.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction7
	 * CreditTransferTransaction7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargesInformationGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The repetitive ChargesInformation should contain all information on charges amount and which party has taken the charges, separately for each agent along the payment chain."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChargesInformationGuideline#forCreditTransferTransaction19
	 * ConstraintChargesInformationGuideline.forCreditTransferTransaction19}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction7> forCreditTransferTransaction7 = new MMConstraint<CreditTransferTransaction7>() {
		{
			validator = ConstraintChargesInformationGuideline::checkCreditTransferTransaction7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargesInformationGuideline";
			definition = "The repetitive ChargesInformation should contain all information on charges amount and which party has taken the charges, separately for each agent along the payment chain.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintChargesInformationGuideline.forCreditTransferTransaction19);
			owner_lazy = () -> CreditTransferTransaction7.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation7
	 * CreditTransferTransactionInformation7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargesInformationGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The repetitive ChargesInformation should contain all separate information on charges amount and which party has taken the charges for all agents along the payment chain."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransactionInformation7> forCreditTransferTransactionInformation7 = new MMConstraint<CreditTransferTransactionInformation7>() {
		{
			validator = ConstraintChargesInformationGuideline::checkCreditTransferTransactionInformation7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargesInformationGuideline";
			definition = "The repetitive ChargesInformation should contain all separate information on charges amount and which party has taken the charges for all agents along the payment chain.";
			owner_lazy = () -> CreditTransferTransactionInformation7.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9
	 * CreditTransferTransactionInformation9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargesInformationGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ISO20022 Guideline:\nThe repetitive ChargesInformation should contain all separate information on charges amount and which party has taken the charges for all agents along the payment chain."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransactionInformation9> forCreditTransferTransactionInformation9 = new MMConstraint<CreditTransferTransactionInformation9>() {
		{
			validator = ConstraintChargesInformationGuideline::checkCreditTransferTransactionInformation9;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargesInformationGuideline";
			definition = "ISO20022 Guideline:\nThe repetitive ChargesInformation should contain all separate information on charges amount and which party has taken the charges for all agents along the payment chain.";
			owner_lazy = () -> CreditTransferTransactionInformation9.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction19
	 * CreditTransferTransaction19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargesInformationGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The repetitive ChargesInformation should contain all information on charges amount and which party has taken the charges, separately for each agent along the payment chain."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChargesInformationGuideline#forCreditTransferTransaction25
	 * ConstraintChargesInformationGuideline.forCreditTransferTransaction25}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChargesInformationGuideline#forCreditTransferTransaction7
	 * ConstraintChargesInformationGuideline.forCreditTransferTransaction7}</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction19> forCreditTransferTransaction19 = new MMConstraint<CreditTransferTransaction19>() {
		{
			validator = ConstraintChargesInformationGuideline::checkCreditTransferTransaction19;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargesInformationGuideline";
			definition = "The repetitive ChargesInformation should contain all information on charges amount and which party has taken the charges, separately for each agent along the payment chain.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintChargesInformationGuideline.forCreditTransferTransaction25);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintChargesInformationGuideline.forCreditTransferTransaction7;
			owner_lazy = () -> CreditTransferTransaction19.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25
	 * CreditTransferTransaction25}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargesInformationGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The repetitive ChargesInformation should contain all information on charges amount and which party has taken the charges, separately for each agent along the payment chain."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintChargesInformationGuideline#forCreditTransferTransaction19
	 * ConstraintChargesInformationGuideline.forCreditTransferTransaction19}</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditTransferTransaction25> forCreditTransferTransaction25 = new MMConstraint<CreditTransferTransaction25>() {
		{
			validator = ConstraintChargesInformationGuideline::checkCreditTransferTransaction25;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargesInformationGuideline";
			definition = "The repetitive ChargesInformation should contain all information on charges amount and which party has taken the charges, separately for each agent along the payment chain.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintChargesInformationGuideline.forCreditTransferTransaction19;
			owner_lazy = () -> CreditTransferTransaction25.mmObject();
		}
	};

	/**
	 * The repetitive ChargesInformation should contain all separate information
	 * on charges amount and which party has taken the charges for all agents
	 * along the payment chain.
	 */
	public static void checkCreditTransferTransactionInformation2(CreditTransferTransactionInformation2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The repetitive ChargesInformation should contain all information on
	 * charges amount and which party has taken the charges, separately for each
	 * agent along the payment chain.
	 */
	public static void checkCreditTransferTransactionInformation11(CreditTransferTransactionInformation11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The repetitive ChargesInformation should contain all information on
	 * charges amount and which party has taken the charges, separately for each
	 * agent along the payment chain.
	 */
	public static void checkCreditTransferTransaction2(CreditTransferTransaction2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The repetitive ChargesInformation should contain all information on
	 * charges amount and which party has taken the charges, separately for each
	 * agent along the payment chain.
	 */
	public static void checkCreditTransferTransaction7(CreditTransferTransaction7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The repetitive ChargesInformation should contain all separate information
	 * on charges amount and which party has taken the charges for all agents
	 * along the payment chain.
	 */
	public static void checkCreditTransferTransactionInformation7(CreditTransferTransactionInformation7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ISO20022 Guideline: The repetitive ChargesInformation should contain all
	 * separate information on charges amount and which party has taken the
	 * charges for all agents along the payment chain.
	 */
	public static void checkCreditTransferTransactionInformation9(CreditTransferTransactionInformation9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The repetitive ChargesInformation should contain all information on
	 * charges amount and which party has taken the charges, separately for each
	 * agent along the payment chain.
	 */
	public static void checkCreditTransferTransaction19(CreditTransferTransaction19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The repetitive ChargesInformation should contain all information on
	 * charges amount and which party has taken the charges, separately for each
	 * agent along the payment chain.
	 */
	public static void checkCreditTransferTransaction25(CreditTransferTransaction25 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}