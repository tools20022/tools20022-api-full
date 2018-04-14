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
import com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequest002V05;
import com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestV04;
import com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestV05;
import java.util.Arrays;

/**
 * If AccountOwnerTransactionIdentification is NONREF then at least one of the
 * other references must be present.
 */
public class ConstraintTransactionIdentificationPresence2Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestV04
	 * SecuritiesTransactionCancellationRequestV04}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AccountServicerTransactionIdentification&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/MarketInfrastructureTransactionIdentification&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ProcessorTransactionIdentification&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/AccountOwnerTransactionIdentification/SecuritiesSettlementTransactionIdentification/TransactionIdentification&lt;/leftOperand&gt;&lt;rightOperand&gt;NONREF&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/AccountOwnerTransactionIdentification/SecuritiesFinancingTransactionIdentification/TransactionIdentification&lt;/leftOperand&gt;&lt;rightOperand&gt;NONREF&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/AccountOwnerTransactionIdentification/IntraPositionMovementIdentification&lt;/leftOperand&gt;&lt;rightOperand&gt;NONREF&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/AccountOwnerTransactionIdentification/OtherTransactionIdentification/Identification&lt;/leftOperand&gt;&lt;rightOperand&gt;NONREF&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentificationPresence2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AccountOwnerTransactionIdentification is NONREF then at least one of the other references must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTransactionIdentificationPresence2Rule#for_sese_SecuritiesTransactionCancellationRequestV05
	 * ConstraintTransactionIdentificationPresence2Rule.
	 * for_sese_SecuritiesTransactionCancellationRequestV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionCancellationRequestV04> for_sese_SecuritiesTransactionCancellationRequestV04 = new MMConstraint<SecuritiesTransactionCancellationRequestV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentificationPresence2Rule";
			definition = "If AccountOwnerTransactionIdentification is NONREF then at least one of the other references must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTransactionIdentificationPresence2Rule.for_sese_SecuritiesTransactionCancellationRequestV05);
			owner_lazy = () -> SecuritiesTransactionCancellationRequestV04.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AccountServicerTransactionIdentification</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/MarketInfrastructureTransactionIdentification</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/ProcessorTransactionIdentification</leftOperand></BooleanRule></mustBe><onCondition><connector>OR</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/AccountOwnerTransactionIdentification/SecuritiesSettlementTransactionIdentification/TransactionIdentification</leftOperand><rightOperand>NONREF</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/AccountOwnerTransactionIdentification/SecuritiesFinancingTransactionIdentification/TransactionIdentification</leftOperand><rightOperand>NONREF</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/AccountOwnerTransactionIdentification/IntraPositionMovementIdentification</leftOperand><rightOperand>NONREF</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/AccountOwnerTransactionIdentification/OtherTransactionIdentification/Identification</leftOperand><rightOperand>NONREF</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(SecuritiesTransactionCancellationRequestV04 obj) throws Exception {
			check_sese_SecuritiesTransactionCancellationRequestV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestV05
	 * SecuritiesTransactionCancellationRequestV05}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AccountServicerTransactionIdentification&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/MarketInfrastructureTransactionIdentification&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ProcessorTransactionIdentification&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/AccountOwnerTransactionIdentification/SecuritiesSettlementTransactionIdentification/TransactionIdentification&lt;/leftOperand&gt;&lt;rightOperand&gt;NONREF&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/AccountOwnerTransactionIdentification/SecuritiesFinancingTransactionIdentification/TransactionIdentification&lt;/leftOperand&gt;&lt;rightOperand&gt;NONREF&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/AccountOwnerTransactionIdentification/IntraPositionMovementIdentification&lt;/leftOperand&gt;&lt;rightOperand&gt;NONREF&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/AccountOwnerTransactionIdentification/OtherTransactionIdentification/Identification&lt;/leftOperand&gt;&lt;rightOperand&gt;NONREF&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentificationPresence2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AccountOwnerTransactionIdentification is NONREF then at least one of the other references must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTransactionIdentificationPresence2Rule#for_sese_SecuritiesTransactionCancellationRequestV04
	 * ConstraintTransactionIdentificationPresence2Rule.
	 * for_sese_SecuritiesTransactionCancellationRequestV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionCancellationRequestV05> for_sese_SecuritiesTransactionCancellationRequestV05 = new MMConstraint<SecuritiesTransactionCancellationRequestV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentificationPresence2Rule";
			definition = "If AccountOwnerTransactionIdentification is NONREF then at least one of the other references must be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTransactionIdentificationPresence2Rule.for_sese_SecuritiesTransactionCancellationRequestV04;
			owner_lazy = () -> SecuritiesTransactionCancellationRequestV05.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AccountServicerTransactionIdentification</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/MarketInfrastructureTransactionIdentification</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/ProcessorTransactionIdentification</leftOperand></BooleanRule></mustBe><onCondition><connector>OR</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/AccountOwnerTransactionIdentification/SecuritiesSettlementTransactionIdentification/TransactionIdentification</leftOperand><rightOperand>NONREF</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/AccountOwnerTransactionIdentification/SecuritiesFinancingTransactionIdentification/TransactionIdentification</leftOperand><rightOperand>NONREF</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/AccountOwnerTransactionIdentification/IntraPositionMovementIdentification</leftOperand><rightOperand>NONREF</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/AccountOwnerTransactionIdentification/OtherTransactionIdentification/Identification</leftOperand><rightOperand>NONREF</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(SecuritiesTransactionCancellationRequestV05 obj) throws Exception {
			check_sese_SecuritiesTransactionCancellationRequestV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequest002V05
	 * SecuritiesTransactionCancellationRequest002V05}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AccountServicerTransactionIdentification&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/MarketInfrastructureTransactionIdentification&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ProcessorTransactionIdentification&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/AccountOwnerTransactionIdentification/SecuritiesSettlementTransactionIdentification/TransactionIdentification&lt;/leftOperand&gt;&lt;rightOperand&gt;NONREF&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/AccountOwnerTransactionIdentification/SecuritiesFinancingTransactionIdentification/TransactionIdentification&lt;/leftOperand&gt;&lt;rightOperand&gt;NONREF&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/AccountOwnerTransactionIdentification/IntraPositionMovementIdentification&lt;/leftOperand&gt;&lt;rightOperand&gt;NONREF&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/AccountOwnerTransactionIdentification/OtherTransactionIdentification/Identification&lt;/leftOperand&gt;&lt;rightOperand&gt;NONREF&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentificationPresence2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AccountOwnerTransactionIdentification is NONREF then at least one of the other references must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionCancellationRequest002V05> for_sese_SecuritiesTransactionCancellationRequest002V05 = new MMConstraint<SecuritiesTransactionCancellationRequest002V05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentificationPresence2Rule";
			definition = "If AccountOwnerTransactionIdentification is NONREF then at least one of the other references must be present.";
			owner_lazy = () -> SecuritiesTransactionCancellationRequest002V05.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AccountServicerTransactionIdentification</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/MarketInfrastructureTransactionIdentification</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/ProcessorTransactionIdentification</leftOperand></BooleanRule></mustBe><onCondition><connector>OR</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/AccountOwnerTransactionIdentification/SecuritiesSettlementTransactionIdentification/TransactionIdentification</leftOperand><rightOperand>NONREF</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/AccountOwnerTransactionIdentification/SecuritiesFinancingTransactionIdentification/TransactionIdentification</leftOperand><rightOperand>NONREF</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/AccountOwnerTransactionIdentification/IntraPositionMovementIdentification</leftOperand><rightOperand>NONREF</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/AccountOwnerTransactionIdentification/OtherTransactionIdentification/Identification</leftOperand><rightOperand>NONREF</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(SecuritiesTransactionCancellationRequest002V05 obj) throws Exception {
			check_sese_SecuritiesTransactionCancellationRequest002V05(obj);
		}
	};

	/**
	 * If AccountOwnerTransactionIdentification is NONREF then at least one of
	 * the other references must be present.
	 */
	public static void check_sese_SecuritiesTransactionCancellationRequestV04(SecuritiesTransactionCancellationRequestV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AccountOwnerTransactionIdentification is NONREF then at least one of
	 * the other references must be present.
	 */
	public static void check_sese_SecuritiesTransactionCancellationRequestV05(SecuritiesTransactionCancellationRequestV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AccountOwnerTransactionIdentification is NONREF then at least one of
	 * the other references must be present.
	 */
	public static void check_sese_SecuritiesTransactionCancellationRequest002V05(SecuritiesTransactionCancellationRequest002V05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}