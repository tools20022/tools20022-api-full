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
import com.tools20022.repository.area.camt.*;
import java.util.Arrays;

/**
 * Case may be present at either Case, OriginalGroupInformationAndCancellation,
 * OriginalPaymentInformationAndCancellation or TransactionInformation level.
 */
public class ConstraintMessageOrTransactionCaseRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.CustomerPaymentCancellationRequestV04
	 * CustomerPaymentCancellationRequestV04}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/Underlying[*]/OriginalPaymentInformationAndCancellation[*]/TransactionInformation[*]/Case&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Case&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Underlying[1]/OriginalPaymentInformationAndCancellation[1]/TransactionInformation[1]/Case&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageOrTransactionCaseRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Case may be present at either Case, OriginalGroupInformationAndCancellation, OriginalPaymentInformationAndCancellation or TransactionInformation level."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintMessageOrTransactionCaseRule#for_camt_CustomerPaymentCancellationRequestV05
	 * ConstraintMessageOrTransactionCaseRule.
	 * for_camt_CustomerPaymentCancellationRequestV05}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintMessageOrTransactionCaseRule#for_camt_CustomerPaymentCancellationRequestV03
	 * ConstraintMessageOrTransactionCaseRule.
	 * for_camt_CustomerPaymentCancellationRequestV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<CustomerPaymentCancellationRequestV04> for_camt_CustomerPaymentCancellationRequestV04 = new MMConstraint<CustomerPaymentCancellationRequestV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageOrTransactionCaseRule";
			definition = "Case may be present at either Case, OriginalGroupInformationAndCancellation, OriginalPaymentInformationAndCancellation or TransactionInformation level.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintMessageOrTransactionCaseRule.for_camt_CustomerPaymentCancellationRequestV05);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintMessageOrTransactionCaseRule.for_camt_CustomerPaymentCancellationRequestV03;
			owner_lazy = () -> CustomerPaymentCancellationRequestV04.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/Underlying[*]/OriginalPaymentInformationAndCancellation[*]/TransactionInformation[*]/Case</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/Case</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/Underlying[1]/OriginalPaymentInformationAndCancellation[1]/TransactionInformation[1]/Case</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(CustomerPaymentCancellationRequestV04 obj) throws Exception {
			check_camt_CustomerPaymentCancellationRequestV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.FIToFIPaymentCancellationRequestV07
	 * FIToFIPaymentCancellationRequestV07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/Underlying[*]/TransactionInformation[*]/Case&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Case&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Underlying[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Underlying[1]/TransactionInformation[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageOrTransactionCaseRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Case may be present at either Case, OriginalGroupInformationAndCancellation or TransactionInformation level."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintMessageOrTransactionCaseRule#for_camt_FIToFIPaymentCancellationRequestV06
	 * ConstraintMessageOrTransactionCaseRule.
	 * for_camt_FIToFIPaymentCancellationRequestV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentCancellationRequestV07> for_camt_FIToFIPaymentCancellationRequestV07 = new MMConstraint<FIToFIPaymentCancellationRequestV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageOrTransactionCaseRule";
			definition = "Case may be present at either Case, OriginalGroupInformationAndCancellation or TransactionInformation level.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintMessageOrTransactionCaseRule.for_camt_FIToFIPaymentCancellationRequestV06;
			owner_lazy = () -> FIToFIPaymentCancellationRequestV07.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/Underlying[*]/TransactionInformation[*]/Case</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/Case</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/Underlying[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/Underlying[1]/TransactionInformation[1]</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(FIToFIPaymentCancellationRequestV07 obj) throws Exception {
			check_camt_FIToFIPaymentCancellationRequestV07(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.CustomerPaymentCancellationRequestV02
	 * CustomerPaymentCancellationRequestV02}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/Underlying[*]/OriginalPaymentInformationAndCancellation[*]/TransactionInformation[*]/Case&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Case&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Underlying[1]/OriginalPaymentInformationAndCancellation[1]/TransactionInformation[1]/Case&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageOrTransactionCaseRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Case may be present at either Case, OriginalGroupInformationAndCancellation, OriginalPaymentInformationAndCancellation or TransactionInformation level."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CustomerPaymentCancellationRequestV02> for_camt_CustomerPaymentCancellationRequestV02 = new MMConstraint<CustomerPaymentCancellationRequestV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageOrTransactionCaseRule";
			definition = "Case may be present at either Case, OriginalGroupInformationAndCancellation, OriginalPaymentInformationAndCancellation or TransactionInformation level.";
			owner_lazy = () -> CustomerPaymentCancellationRequestV02.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/Underlying[*]/OriginalPaymentInformationAndCancellation[*]/TransactionInformation[*]/Case</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/Case</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/Underlying[1]/OriginalPaymentInformationAndCancellation[1]/TransactionInformation[1]/Case</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(CustomerPaymentCancellationRequestV02 obj) throws Exception {
			check_camt_CustomerPaymentCancellationRequestV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.CustomerPaymentCancellationRequestV03
	 * CustomerPaymentCancellationRequestV03}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/Underlying[*]/OriginalPaymentInformationAndCancellation[*]/TransactionInformation[*]/Case&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Case&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Underlying[1]/OriginalPaymentInformationAndCancellation[1]/TransactionInformation[1]/Case&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageOrTransactionCaseRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Case may be present at either Case, OriginalGroupInformationAndCancellation, OriginalPaymentInformationAndCancellation or TransactionInformation level."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintMessageOrTransactionCaseRule#for_camt_CustomerPaymentCancellationRequestV04
	 * ConstraintMessageOrTransactionCaseRule.
	 * for_camt_CustomerPaymentCancellationRequestV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CustomerPaymentCancellationRequestV03> for_camt_CustomerPaymentCancellationRequestV03 = new MMConstraint<CustomerPaymentCancellationRequestV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageOrTransactionCaseRule";
			definition = "Case may be present at either Case, OriginalGroupInformationAndCancellation, OriginalPaymentInformationAndCancellation or TransactionInformation level.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintMessageOrTransactionCaseRule.for_camt_CustomerPaymentCancellationRequestV04);
			owner_lazy = () -> CustomerPaymentCancellationRequestV03.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/Underlying[*]/OriginalPaymentInformationAndCancellation[*]/TransactionInformation[*]/Case</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/Case</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/Underlying[1]/OriginalPaymentInformationAndCancellation[1]/TransactionInformation[1]/Case</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(CustomerPaymentCancellationRequestV03 obj) throws Exception {
			check_camt_CustomerPaymentCancellationRequestV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.FIToFIPaymentCancellationRequestV01
	 * FIToFIPaymentCancellationRequestV01}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/Underlying[*]/TransactionInformation[*]/Case&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Case&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Underlying[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Underlying[1]/TransactionInformation[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageOrTransactionCaseRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Case may be present at either Case, OriginalGroupInformationAndCancellation or TransactionInformation level."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentCancellationRequestV01> for_camt_FIToFIPaymentCancellationRequestV01 = new MMConstraint<FIToFIPaymentCancellationRequestV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageOrTransactionCaseRule";
			definition = "Case may be present at either Case, OriginalGroupInformationAndCancellation or TransactionInformation level.";
			owner_lazy = () -> FIToFIPaymentCancellationRequestV01.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/Underlying[*]/TransactionInformation[*]/Case</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/Case</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/Underlying[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/Underlying[1]/TransactionInformation[1]</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(FIToFIPaymentCancellationRequestV01 obj) throws Exception {
			check_camt_FIToFIPaymentCancellationRequestV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.FIToFIPaymentCancellationRequestV03
	 * FIToFIPaymentCancellationRequestV03}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/Underlying[*]/TransactionInformation[*]/Case&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Case&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Underlying[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Underlying[1]/TransactionInformation[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageOrTransactionCaseRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Case may be present at either Case, OriginalGroupInformationAndCancellation or TransactionInformation level."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintMessageOrTransactionCaseRule#for_camt_FIToFIPaymentCancellationRequestV04
	 * ConstraintMessageOrTransactionCaseRule.
	 * for_camt_FIToFIPaymentCancellationRequestV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentCancellationRequestV03> for_camt_FIToFIPaymentCancellationRequestV03 = new MMConstraint<FIToFIPaymentCancellationRequestV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageOrTransactionCaseRule";
			definition = "Case may be present at either Case, OriginalGroupInformationAndCancellation or TransactionInformation level.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintMessageOrTransactionCaseRule.for_camt_FIToFIPaymentCancellationRequestV04);
			owner_lazy = () -> FIToFIPaymentCancellationRequestV03.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/Underlying[*]/TransactionInformation[*]/Case</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/Case</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/Underlying[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/Underlying[1]/TransactionInformation[1]</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(FIToFIPaymentCancellationRequestV03 obj) throws Exception {
			check_camt_FIToFIPaymentCancellationRequestV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.FIToFIPaymentCancellationRequestV06
	 * FIToFIPaymentCancellationRequestV06}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/Underlying[*]/TransactionInformation[*]/Case&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Case&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Underlying[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Underlying[1]/TransactionInformation[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageOrTransactionCaseRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Case may be present at either Case, OriginalGroupInformationAndCancellation or TransactionInformation level."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintMessageOrTransactionCaseRule#for_camt_FIToFIPaymentCancellationRequestV07
	 * ConstraintMessageOrTransactionCaseRule.
	 * for_camt_FIToFIPaymentCancellationRequestV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintMessageOrTransactionCaseRule#for_camt_FIToFIPaymentCancellationRequestV05
	 * ConstraintMessageOrTransactionCaseRule.
	 * for_camt_FIToFIPaymentCancellationRequestV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentCancellationRequestV06> for_camt_FIToFIPaymentCancellationRequestV06 = new MMConstraint<FIToFIPaymentCancellationRequestV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageOrTransactionCaseRule";
			definition = "Case may be present at either Case, OriginalGroupInformationAndCancellation or TransactionInformation level.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintMessageOrTransactionCaseRule.for_camt_FIToFIPaymentCancellationRequestV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintMessageOrTransactionCaseRule.for_camt_FIToFIPaymentCancellationRequestV05;
			owner_lazy = () -> FIToFIPaymentCancellationRequestV06.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/Underlying[*]/TransactionInformation[*]/Case</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/Case</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/Underlying[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/Underlying[1]/TransactionInformation[1]</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(FIToFIPaymentCancellationRequestV06 obj) throws Exception {
			check_camt_FIToFIPaymentCancellationRequestV06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.CustomerPaymentCancellationRequestV06
	 * CustomerPaymentCancellationRequestV06}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/Underlying[*]/OriginalPaymentInformationAndCancellation[*]/TransactionInformation[*]/Case&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Case&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Underlying[1]/OriginalPaymentInformationAndCancellation[1]/TransactionInformation[1]/Case&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageOrTransactionCaseRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Case may be present at either Case, OriginalGroupInformationAndCancellation, OriginalPaymentInformationAndCancellation or TransactionInformation level."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintMessageOrTransactionCaseRule#for_camt_CustomerPaymentCancellationRequestV07
	 * ConstraintMessageOrTransactionCaseRule.
	 * for_camt_CustomerPaymentCancellationRequestV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintMessageOrTransactionCaseRule#for_camt_CustomerPaymentCancellationRequestV05
	 * ConstraintMessageOrTransactionCaseRule.
	 * for_camt_CustomerPaymentCancellationRequestV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<CustomerPaymentCancellationRequestV06> for_camt_CustomerPaymentCancellationRequestV06 = new MMConstraint<CustomerPaymentCancellationRequestV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageOrTransactionCaseRule";
			definition = "Case may be present at either Case, OriginalGroupInformationAndCancellation, OriginalPaymentInformationAndCancellation or TransactionInformation level.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintMessageOrTransactionCaseRule.for_camt_CustomerPaymentCancellationRequestV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintMessageOrTransactionCaseRule.for_camt_CustomerPaymentCancellationRequestV05;
			owner_lazy = () -> CustomerPaymentCancellationRequestV06.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/Underlying[*]/OriginalPaymentInformationAndCancellation[*]/TransactionInformation[*]/Case</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/Case</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/Underlying[1]/OriginalPaymentInformationAndCancellation[1]/TransactionInformation[1]/Case</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(CustomerPaymentCancellationRequestV06 obj) throws Exception {
			check_camt_CustomerPaymentCancellationRequestV06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.CustomerPaymentCancellationRequestV07
	 * CustomerPaymentCancellationRequestV07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/Underlying[*]/OriginalPaymentInformationAndCancellation[*]/TransactionInformation[*]/Case&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Case&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Underlying[1]/OriginalPaymentInformationAndCancellation[1]/TransactionInformation[1]/Case&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageOrTransactionCaseRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Case may be present at either Case, OriginalGroupInformationAndCancellation, OriginalPaymentInformationAndCancellation or TransactionInformation level."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintMessageOrTransactionCaseRule#for_camt_CustomerPaymentCancellationRequestV06
	 * ConstraintMessageOrTransactionCaseRule.
	 * for_camt_CustomerPaymentCancellationRequestV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<CustomerPaymentCancellationRequestV07> for_camt_CustomerPaymentCancellationRequestV07 = new MMConstraint<CustomerPaymentCancellationRequestV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageOrTransactionCaseRule";
			definition = "Case may be present at either Case, OriginalGroupInformationAndCancellation, OriginalPaymentInformationAndCancellation or TransactionInformation level.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintMessageOrTransactionCaseRule.for_camt_CustomerPaymentCancellationRequestV06;
			owner_lazy = () -> CustomerPaymentCancellationRequestV07.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/Underlying[*]/OriginalPaymentInformationAndCancellation[*]/TransactionInformation[*]/Case</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/Case</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/Underlying[1]/OriginalPaymentInformationAndCancellation[1]/TransactionInformation[1]/Case</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(CustomerPaymentCancellationRequestV07 obj) throws Exception {
			check_camt_CustomerPaymentCancellationRequestV07(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.CustomerPaymentCancellationRequestV01
	 * CustomerPaymentCancellationRequestV01}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/Underlying[*]/OriginalPaymentInformationAndCancellation[*]/TransactionInformation[*]/Case&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Case&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Underlying[1]/OriginalPaymentInformationAndCancellation[1]/TransactionInformation[1]/Case&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageOrTransactionCaseRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Case may be present at either Case, OriginalGroupInformationAndCancellation, OriginalPaymentInformationAndCancellation or TransactionInformation level."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CustomerPaymentCancellationRequestV01> for_camt_CustomerPaymentCancellationRequestV01 = new MMConstraint<CustomerPaymentCancellationRequestV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageOrTransactionCaseRule";
			definition = "Case may be present at either Case, OriginalGroupInformationAndCancellation, OriginalPaymentInformationAndCancellation or TransactionInformation level.";
			owner_lazy = () -> CustomerPaymentCancellationRequestV01.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/Underlying[*]/OriginalPaymentInformationAndCancellation[*]/TransactionInformation[*]/Case</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/Case</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/Underlying[1]/OriginalPaymentInformationAndCancellation[1]/TransactionInformation[1]/Case</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(CustomerPaymentCancellationRequestV01 obj) throws Exception {
			check_camt_CustomerPaymentCancellationRequestV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.FIToFIPaymentCancellationRequestV02
	 * FIToFIPaymentCancellationRequestV02}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/Underlying[*]/TransactionInformation[*]/Case&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Case&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Underlying[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Underlying[1]/TransactionInformation[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageOrTransactionCaseRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Case may be present at either Case, OriginalGroupInformationAndCancellation or TransactionInformation level."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentCancellationRequestV02> for_camt_FIToFIPaymentCancellationRequestV02 = new MMConstraint<FIToFIPaymentCancellationRequestV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageOrTransactionCaseRule";
			definition = "Case may be present at either Case, OriginalGroupInformationAndCancellation or TransactionInformation level.";
			owner_lazy = () -> FIToFIPaymentCancellationRequestV02.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/Underlying[*]/TransactionInformation[*]/Case</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/Case</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/Underlying[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/Underlying[1]/TransactionInformation[1]</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(FIToFIPaymentCancellationRequestV02 obj) throws Exception {
			check_camt_FIToFIPaymentCancellationRequestV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.CustomerPaymentCancellationRequestV05
	 * CustomerPaymentCancellationRequestV05}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/Underlying[*]/OriginalPaymentInformationAndCancellation[*]/TransactionInformation[*]/Case&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Case&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Underlying[1]/OriginalPaymentInformationAndCancellation[1]/TransactionInformation[1]/Case&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageOrTransactionCaseRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Case may be present at either Case, OriginalGroupInformationAndCancellation, OriginalPaymentInformationAndCancellation or TransactionInformation level."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintMessageOrTransactionCaseRule#for_camt_CustomerPaymentCancellationRequestV06
	 * ConstraintMessageOrTransactionCaseRule.
	 * for_camt_CustomerPaymentCancellationRequestV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintMessageOrTransactionCaseRule#for_camt_CustomerPaymentCancellationRequestV04
	 * ConstraintMessageOrTransactionCaseRule.
	 * for_camt_CustomerPaymentCancellationRequestV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<CustomerPaymentCancellationRequestV05> for_camt_CustomerPaymentCancellationRequestV05 = new MMConstraint<CustomerPaymentCancellationRequestV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageOrTransactionCaseRule";
			definition = "Case may be present at either Case, OriginalGroupInformationAndCancellation, OriginalPaymentInformationAndCancellation or TransactionInformation level.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintMessageOrTransactionCaseRule.for_camt_CustomerPaymentCancellationRequestV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintMessageOrTransactionCaseRule.for_camt_CustomerPaymentCancellationRequestV04;
			owner_lazy = () -> CustomerPaymentCancellationRequestV05.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/Underlying[*]/OriginalPaymentInformationAndCancellation[*]/TransactionInformation[*]/Case</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/Case</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/Underlying[1]/OriginalPaymentInformationAndCancellation[1]/TransactionInformation[1]/Case</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(CustomerPaymentCancellationRequestV05 obj) throws Exception {
			check_camt_CustomerPaymentCancellationRequestV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.FIToFIPaymentCancellationRequestV05
	 * FIToFIPaymentCancellationRequestV05}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/Underlying[*]/TransactionInformation[*]/Case&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Case&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Underlying[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Underlying[1]/TransactionInformation[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageOrTransactionCaseRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Case may be present at either Case, OriginalGroupInformationAndCancellation or TransactionInformation level."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintMessageOrTransactionCaseRule#for_camt_FIToFIPaymentCancellationRequestV06
	 * ConstraintMessageOrTransactionCaseRule.
	 * for_camt_FIToFIPaymentCancellationRequestV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintMessageOrTransactionCaseRule#for_camt_FIToFIPaymentCancellationRequestV04
	 * ConstraintMessageOrTransactionCaseRule.
	 * for_camt_FIToFIPaymentCancellationRequestV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentCancellationRequestV05> for_camt_FIToFIPaymentCancellationRequestV05 = new MMConstraint<FIToFIPaymentCancellationRequestV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageOrTransactionCaseRule";
			definition = "Case may be present at either Case, OriginalGroupInformationAndCancellation or TransactionInformation level.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintMessageOrTransactionCaseRule.for_camt_FIToFIPaymentCancellationRequestV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintMessageOrTransactionCaseRule.for_camt_FIToFIPaymentCancellationRequestV04;
			owner_lazy = () -> FIToFIPaymentCancellationRequestV05.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/Underlying[*]/TransactionInformation[*]/Case</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/Case</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/Underlying[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/Underlying[1]/TransactionInformation[1]</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(FIToFIPaymentCancellationRequestV05 obj) throws Exception {
			check_camt_FIToFIPaymentCancellationRequestV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.FIToFIPaymentCancellationRequestV04
	 * FIToFIPaymentCancellationRequestV04}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/Underlying[*]/TransactionInformation[*]/Case&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Case&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Underlying[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Underlying[1]/TransactionInformation[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageOrTransactionCaseRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Case may be present at either Case, OriginalGroupInformationAndCancellation or TransactionInformation level."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintMessageOrTransactionCaseRule#for_camt_FIToFIPaymentCancellationRequestV05
	 * ConstraintMessageOrTransactionCaseRule.
	 * for_camt_FIToFIPaymentCancellationRequestV05}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintMessageOrTransactionCaseRule#for_camt_FIToFIPaymentCancellationRequestV03
	 * ConstraintMessageOrTransactionCaseRule.
	 * for_camt_FIToFIPaymentCancellationRequestV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentCancellationRequestV04> for_camt_FIToFIPaymentCancellationRequestV04 = new MMConstraint<FIToFIPaymentCancellationRequestV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageOrTransactionCaseRule";
			definition = "Case may be present at either Case, OriginalGroupInformationAndCancellation or TransactionInformation level.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintMessageOrTransactionCaseRule.for_camt_FIToFIPaymentCancellationRequestV05);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintMessageOrTransactionCaseRule.for_camt_FIToFIPaymentCancellationRequestV03;
			owner_lazy = () -> FIToFIPaymentCancellationRequestV04.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/Underlying[*]/TransactionInformation[*]/Case</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/Case</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/Underlying[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/Underlying[1]/TransactionInformation[1]</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(FIToFIPaymentCancellationRequestV04 obj) throws Exception {
			check_camt_FIToFIPaymentCancellationRequestV04(obj);
		}
	};

	/**
	 * Case may be present at either Case,
	 * OriginalGroupInformationAndCancellation,
	 * OriginalPaymentInformationAndCancellation or TransactionInformation
	 * level.
	 */
	public static void check_camt_CustomerPaymentCancellationRequestV04(CustomerPaymentCancellationRequestV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Case may be present at either Case,
	 * OriginalGroupInformationAndCancellation or TransactionInformation level.
	 */
	public static void check_camt_FIToFIPaymentCancellationRequestV07(FIToFIPaymentCancellationRequestV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Case may be present at either Case,
	 * OriginalGroupInformationAndCancellation,
	 * OriginalPaymentInformationAndCancellation or TransactionInformation
	 * level.
	 */
	public static void check_camt_CustomerPaymentCancellationRequestV02(CustomerPaymentCancellationRequestV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Case may be present at either Case,
	 * OriginalGroupInformationAndCancellation,
	 * OriginalPaymentInformationAndCancellation or TransactionInformation
	 * level.
	 */
	public static void check_camt_CustomerPaymentCancellationRequestV03(CustomerPaymentCancellationRequestV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Case may be present at either Case,
	 * OriginalGroupInformationAndCancellation or TransactionInformation level.
	 */
	public static void check_camt_FIToFIPaymentCancellationRequestV01(FIToFIPaymentCancellationRequestV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Case may be present at either Case,
	 * OriginalGroupInformationAndCancellation or TransactionInformation level.
	 */
	public static void check_camt_FIToFIPaymentCancellationRequestV03(FIToFIPaymentCancellationRequestV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Case may be present at either Case,
	 * OriginalGroupInformationAndCancellation or TransactionInformation level.
	 */
	public static void check_camt_FIToFIPaymentCancellationRequestV06(FIToFIPaymentCancellationRequestV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Case may be present at either Case,
	 * OriginalGroupInformationAndCancellation,
	 * OriginalPaymentInformationAndCancellation or TransactionInformation
	 * level.
	 */
	public static void check_camt_CustomerPaymentCancellationRequestV06(CustomerPaymentCancellationRequestV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Case may be present at either Case,
	 * OriginalGroupInformationAndCancellation,
	 * OriginalPaymentInformationAndCancellation or TransactionInformation
	 * level.
	 */
	public static void check_camt_CustomerPaymentCancellationRequestV07(CustomerPaymentCancellationRequestV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Case may be present at either Case,
	 * OriginalGroupInformationAndCancellation,
	 * OriginalPaymentInformationAndCancellation or TransactionInformation
	 * level.
	 */
	public static void check_camt_CustomerPaymentCancellationRequestV01(CustomerPaymentCancellationRequestV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Case may be present at either Case,
	 * OriginalGroupInformationAndCancellation or TransactionInformation level.
	 */
	public static void check_camt_FIToFIPaymentCancellationRequestV02(FIToFIPaymentCancellationRequestV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Case may be present at either Case,
	 * OriginalGroupInformationAndCancellation,
	 * OriginalPaymentInformationAndCancellation or TransactionInformation
	 * level.
	 */
	public static void check_camt_CustomerPaymentCancellationRequestV05(CustomerPaymentCancellationRequestV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Case may be present at either Case,
	 * OriginalGroupInformationAndCancellation or TransactionInformation level.
	 */
	public static void check_camt_FIToFIPaymentCancellationRequestV05(FIToFIPaymentCancellationRequestV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Case may be present at either Case,
	 * OriginalGroupInformationAndCancellation or TransactionInformation level.
	 */
	public static void check_camt_FIToFIPaymentCancellationRequestV04(FIToFIPaymentCancellationRequestV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}