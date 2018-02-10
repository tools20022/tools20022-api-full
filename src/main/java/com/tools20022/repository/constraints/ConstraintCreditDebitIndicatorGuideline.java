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
 * The CreditDebitIndicator may be omitted for optimisation reason if the
 * CreditDebitIndicator is used in the search criteria of the related query.
 */
public class ConstraintCreditDebitIndicatorGuideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transaction3 Transaction3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicatorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CreditDebitIndicator may be omitted for optimisation reason if the CreditDebitIndicator is used in the search criteria of the related query."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Transaction3> forTransaction3 = new MMConstraint<Transaction3>() {
		{
			validator = ConstraintCreditDebitIndicatorGuideline::checkTransaction3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDebitIndicatorGuideline";
			definition = "The CreditDebitIndicator may be omitted for optimisation reason if the CreditDebitIndicator is used in the search criteria of the related query.";
			owner_lazy = () -> Transaction3.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transaction4 Transaction4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicatorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CreditDebitIndicator may be omitted for optimisation reason if the CreditDebitIndicator is used in the search criteria of the related query."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Transaction4> forTransaction4 = new MMConstraint<Transaction4>() {
		{
			validator = ConstraintCreditDebitIndicatorGuideline::checkTransaction4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDebitIndicatorGuideline";
			definition = "The CreditDebitIndicator may be omitted for optimisation reason if the CreditDebitIndicator is used in the search criteria of the related query.";
			owner_lazy = () -> Transaction4.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transaction5 Transaction5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicatorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CreditDebitIndicator may be omitted for optimisation reason if the CreditDebitIndicator is used in the search criteria of the related query."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Transaction5> forTransaction5 = new MMConstraint<Transaction5>() {
		{
			validator = ConstraintCreditDebitIndicatorGuideline::checkTransaction5;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDebitIndicatorGuideline";
			definition = "The CreditDebitIndicator may be omitted for optimisation reason if the CreditDebitIndicator is used in the search criteria of the related query.";
			owner_lazy = () -> Transaction5.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transaction24 Transaction24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicatorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CreditDebitIndicator may be omitted for optimisation reason if the CreditDebitIndicator is used in the search criteria of the related query."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCreditDebitIndicatorGuideline#forTransaction33
	 * ConstraintCreditDebitIndicatorGuideline.forTransaction33}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Transaction24> forTransaction24 = new MMConstraint<Transaction24>() {
		{
			validator = ConstraintCreditDebitIndicatorGuideline::checkTransaction24;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDebitIndicatorGuideline";
			definition = "The CreditDebitIndicator may be omitted for optimisation reason if the CreditDebitIndicator is used in the search criteria of the related query.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCreditDebitIndicatorGuideline.forTransaction33);
			owner_lazy = () -> Transaction24.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TotalsPerBankTransactionCode2
	 * TotalsPerBankTransactionCode2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicatorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TotalNetEntryAmount is present, then CreditDebitIndicator should be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TotalsPerBankTransactionCode2> forTotalsPerBankTransactionCode2 = new MMConstraint<TotalsPerBankTransactionCode2>() {
		{
			validator = ConstraintCreditDebitIndicatorGuideline::checkTotalsPerBankTransactionCode2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDebitIndicatorGuideline";
			definition = "If TotalNetEntryAmount is present, then CreditDebitIndicator should be present.";
			owner_lazy = () -> TotalsPerBankTransactionCode2.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.NumberAndSumOfTransactions3
	 * NumberAndSumOfTransactions3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicatorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CreditDebitIndicator should be present when TotalNetEntryAmount is present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<NumberAndSumOfTransactions3> forNumberAndSumOfTransactions3 = new MMConstraint<NumberAndSumOfTransactions3>() {
		{
			validator = ConstraintCreditDebitIndicatorGuideline::checkNumberAndSumOfTransactions3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDebitIndicatorGuideline";
			definition = "CreditDebitIndicator should be present when TotalNetEntryAmount is present.";
			owner_lazy = () -> NumberAndSumOfTransactions3.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transaction33 Transaction33}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicatorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CreditDebitIndicator may be omitted for optimisation reason if the CreditDebitIndicator is used in the search criteria of the related query."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCreditDebitIndicatorGuideline#forTransaction59
	 * ConstraintCreditDebitIndicatorGuideline.forTransaction59}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCreditDebitIndicatorGuideline#forTransaction24
	 * ConstraintCreditDebitIndicatorGuideline.forTransaction24}</li>
	 * </ul>
	 */
	public static final MMConstraint<Transaction33> forTransaction33 = new MMConstraint<Transaction33>() {
		{
			validator = ConstraintCreditDebitIndicatorGuideline::checkTransaction33;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDebitIndicatorGuideline";
			definition = "The CreditDebitIndicator may be omitted for optimisation reason if the CreditDebitIndicator is used in the search criteria of the related query.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCreditDebitIndicatorGuideline.forTransaction59);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCreditDebitIndicatorGuideline.forTransaction24;
			owner_lazy = () -> Transaction33.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transaction59 Transaction59}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicatorGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CreditDebitIndicator may be omitted for optimisation reason if the CreditDebitIndicator is used in the search criteria of the related query."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCreditDebitIndicatorGuideline#forTransaction33
	 * ConstraintCreditDebitIndicatorGuideline.forTransaction33}</li>
	 * </ul>
	 */
	public static final MMConstraint<Transaction59> forTransaction59 = new MMConstraint<Transaction59>() {
		{
			validator = ConstraintCreditDebitIndicatorGuideline::checkTransaction59;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDebitIndicatorGuideline";
			definition = "The CreditDebitIndicator may be omitted for optimisation reason if the CreditDebitIndicator is used in the search criteria of the related query.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCreditDebitIndicatorGuideline.forTransaction33;
			owner_lazy = () -> Transaction59.mmObject();
		}
	};

	/**
	 * The CreditDebitIndicator may be omitted for optimisation reason if the
	 * CreditDebitIndicator is used in the search criteria of the related query.
	 */
	public static void checkTransaction3(Transaction3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CreditDebitIndicator may be omitted for optimisation reason if the
	 * CreditDebitIndicator is used in the search criteria of the related query.
	 */
	public static void checkTransaction4(Transaction4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CreditDebitIndicator may be omitted for optimisation reason if the
	 * CreditDebitIndicator is used in the search criteria of the related query.
	 */
	public static void checkTransaction5(Transaction5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CreditDebitIndicator may be omitted for optimisation reason if the
	 * CreditDebitIndicator is used in the search criteria of the related query.
	 */
	public static void checkTransaction24(Transaction24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TotalNetEntryAmount is present, then CreditDebitIndicator should be
	 * present.
	 */
	public static void checkTotalsPerBankTransactionCode2(TotalsPerBankTransactionCode2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * CreditDebitIndicator should be present when TotalNetEntryAmount is
	 * present.
	 */
	public static void checkNumberAndSumOfTransactions3(NumberAndSumOfTransactions3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CreditDebitIndicator may be omitted for optimisation reason if the
	 * CreditDebitIndicator is used in the search criteria of the related query.
	 */
	public static void checkTransaction33(Transaction33 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The CreditDebitIndicator may be omitted for optimisation reason if the
	 * CreditDebitIndicator is used in the search criteria of the related query.
	 */
	public static void checkTransaction59(Transaction59 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}