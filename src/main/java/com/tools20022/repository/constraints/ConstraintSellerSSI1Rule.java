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
import com.tools20022.repository.area.sese.*;
import java.util.Arrays;

/**
 * If standing settlement instruction applies and the transaction is a reverse
 * repo, then Seller must be present.<br>
 */
public class ConstraintSellerSSI1Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV04
	 * SecuritiesFinancingInstructionV04}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/StandingSettlementInstructionDetails/Counterparty/Seller&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/TransactionTypeAndAdditionalParameters/SecuritiesFinancingTransactionType&lt;/leftOperand&gt;&lt;rightOperand&gt;ReverseRepo&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/StandingSettlementInstructionDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellerSSI1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If standing settlement instruction applies and the transaction is a reverse repo, then Seller must be present.\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSellerSSI1Rule#for_sese_SecuritiesFinancingInstructionV05
	 * ConstraintSellerSSI1Rule.for_sese_SecuritiesFinancingInstructionV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingInstructionV04> for_sese_SecuritiesFinancingInstructionV04 = new MMConstraint<SecuritiesFinancingInstructionV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellerSSI1Rule";
			definition = "If standing settlement instruction applies and the transaction is a reverse repo, then Seller must be present.\r\n";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSellerSSI1Rule.for_sese_SecuritiesFinancingInstructionV05);
			owner_lazy = () -> SecuritiesFinancingInstructionV04.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/StandingSettlementInstructionDetails/Counterparty/Seller</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/TransactionTypeAndAdditionalParameters/SecuritiesFinancingTransactionType</leftOperand><rightOperand>ReverseRepo</rightOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/StandingSettlementInstructionDetails</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(SecuritiesFinancingInstructionV04 obj) throws Exception {
			check_sese_SecuritiesFinancingInstructionV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstruction002V07
	 * SecuritiesFinancingInstruction002V07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/StandingSettlementInstructionDetails/Counterparty/Seller&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/TransactionTypeAndAdditionalParameters/SecuritiesFinancingTransactionType&lt;/leftOperand&gt;&lt;rightOperand&gt;ReverseRepo&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/StandingSettlementInstructionDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellerSSI1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If standing settlement instruction applies and the transaction is a reverse repo, then Seller must be present.\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingInstruction002V07> for_sese_SecuritiesFinancingInstruction002V07 = new MMConstraint<SecuritiesFinancingInstruction002V07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellerSSI1Rule";
			definition = "If standing settlement instruction applies and the transaction is a reverse repo, then Seller must be present.\r\n";
			owner_lazy = () -> SecuritiesFinancingInstruction002V07.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/StandingSettlementInstructionDetails/Counterparty/Seller</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/TransactionTypeAndAdditionalParameters/SecuritiesFinancingTransactionType</leftOperand><rightOperand>ReverseRepo</rightOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/StandingSettlementInstructionDetails</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(SecuritiesFinancingInstruction002V07 obj) throws Exception {
			check_sese_SecuritiesFinancingInstruction002V07(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV05
	 * SecuritiesFinancingInstructionV05}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/StandingSettlementInstructionDetails/Counterparty/Seller&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/TransactionTypeAndAdditionalParameters/SecuritiesFinancingTransactionType&lt;/leftOperand&gt;&lt;rightOperand&gt;ReverseRepo&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/StandingSettlementInstructionDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellerSSI1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If standing settlement instruction applies and the transaction is a reverse repo, then Seller must be present.\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSellerSSI1Rule#for_sese_SecuritiesFinancingInstructionV06
	 * ConstraintSellerSSI1Rule.for_sese_SecuritiesFinancingInstructionV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSellerSSI1Rule#for_sese_SecuritiesFinancingInstructionV04
	 * ConstraintSellerSSI1Rule.for_sese_SecuritiesFinancingInstructionV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingInstructionV05> for_sese_SecuritiesFinancingInstructionV05 = new MMConstraint<SecuritiesFinancingInstructionV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellerSSI1Rule";
			definition = "If standing settlement instruction applies and the transaction is a reverse repo, then Seller must be present.\r\n";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSellerSSI1Rule.for_sese_SecuritiesFinancingInstructionV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSellerSSI1Rule.for_sese_SecuritiesFinancingInstructionV04;
			owner_lazy = () -> SecuritiesFinancingInstructionV05.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/StandingSettlementInstructionDetails/Counterparty/Seller</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/TransactionTypeAndAdditionalParameters/SecuritiesFinancingTransactionType</leftOperand><rightOperand>ReverseRepo</rightOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/StandingSettlementInstructionDetails</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(SecuritiesFinancingInstructionV05 obj) throws Exception {
			check_sese_SecuritiesFinancingInstructionV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV01
	 * SecuritiesFinancingInstructionV01}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/StandingSettlementInstructionDetails/Counterparty/Seller&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/TransactionTypeAndAdditionalParameters/SecuritiesFinancingTransactionType&lt;/leftOperand&gt;&lt;rightOperand&gt;ReverseRepo&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/StandingSettlementInstructionDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellerSSI1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If standing settlement instruction applies and the transaction is a reverse repo, then Seller must be present.\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingInstructionV01> for_sese_SecuritiesFinancingInstructionV01 = new MMConstraint<SecuritiesFinancingInstructionV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellerSSI1Rule";
			definition = "If standing settlement instruction applies and the transaction is a reverse repo, then Seller must be present.\r\n";
			owner_lazy = () -> SecuritiesFinancingInstructionV01.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/StandingSettlementInstructionDetails/Counterparty/Seller</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/TransactionTypeAndAdditionalParameters/SecuritiesFinancingTransactionType</leftOperand><rightOperand>ReverseRepo</rightOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/StandingSettlementInstructionDetails</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(SecuritiesFinancingInstructionV01 obj) throws Exception {
			check_sese_SecuritiesFinancingInstructionV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV07
	 * SecuritiesFinancingInstructionV07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/StandingSettlementInstructionDetails/Counterparty/Seller&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/TransactionTypeAndAdditionalParameters/SecuritiesFinancingTransactionType&lt;/leftOperand&gt;&lt;rightOperand&gt;ReverseRepo&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/StandingSettlementInstructionDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellerSSI1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If standing settlement instruction applies and the transaction is a reverse repo, then Seller must be present.\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSellerSSI1Rule#for_sese_SecuritiesFinancingInstructionV08
	 * ConstraintSellerSSI1Rule.for_sese_SecuritiesFinancingInstructionV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSellerSSI1Rule#for_sese_SecuritiesFinancingInstructionV06
	 * ConstraintSellerSSI1Rule.for_sese_SecuritiesFinancingInstructionV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingInstructionV07> for_sese_SecuritiesFinancingInstructionV07 = new MMConstraint<SecuritiesFinancingInstructionV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellerSSI1Rule";
			definition = "If standing settlement instruction applies and the transaction is a reverse repo, then Seller must be present.\r\n";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSellerSSI1Rule.for_sese_SecuritiesFinancingInstructionV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSellerSSI1Rule.for_sese_SecuritiesFinancingInstructionV06;
			owner_lazy = () -> SecuritiesFinancingInstructionV07.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/StandingSettlementInstructionDetails/Counterparty/Seller</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/TransactionTypeAndAdditionalParameters/SecuritiesFinancingTransactionType</leftOperand><rightOperand>ReverseRepo</rightOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/StandingSettlementInstructionDetails</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(SecuritiesFinancingInstructionV07 obj) throws Exception {
			check_sese_SecuritiesFinancingInstructionV07(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV03
	 * SecuritiesFinancingInstructionV03}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/StandingSettlementInstructionDetails/Counterparty/Seller&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/TransactionTypeAndAdditionalParameters/SecuritiesFinancingTransactionType&lt;/leftOperand&gt;&lt;rightOperand&gt;ReverseRepo&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/StandingSettlementInstructionDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellerSSI1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If standing settlement instruction applies and the transaction is a reverse repo, then Seller must be present.\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingInstructionV03> for_sese_SecuritiesFinancingInstructionV03 = new MMConstraint<SecuritiesFinancingInstructionV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellerSSI1Rule";
			definition = "If standing settlement instruction applies and the transaction is a reverse repo, then Seller must be present.\r\n";
			owner_lazy = () -> SecuritiesFinancingInstructionV03.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/StandingSettlementInstructionDetails/Counterparty/Seller</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/TransactionTypeAndAdditionalParameters/SecuritiesFinancingTransactionType</leftOperand><rightOperand>ReverseRepo</rightOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/StandingSettlementInstructionDetails</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(SecuritiesFinancingInstructionV03 obj) throws Exception {
			check_sese_SecuritiesFinancingInstructionV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV08
	 * SecuritiesFinancingInstructionV08}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/StandingSettlementInstructionDetails/Counterparty/Seller&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/TransactionTypeAndAdditionalParameters/SecuritiesFinancingTransactionType&lt;/leftOperand&gt;&lt;rightOperand&gt;ReverseRepo&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/StandingSettlementInstructionDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellerSSI1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If standing settlement instruction applies and the transaction is a reverse repo, then Seller must be present.\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSellerSSI1Rule#for_sese_SecuritiesFinancingInstructionV07
	 * ConstraintSellerSSI1Rule.for_sese_SecuritiesFinancingInstructionV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingInstructionV08> for_sese_SecuritiesFinancingInstructionV08 = new MMConstraint<SecuritiesFinancingInstructionV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellerSSI1Rule";
			definition = "If standing settlement instruction applies and the transaction is a reverse repo, then Seller must be present.\r\n";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSellerSSI1Rule.for_sese_SecuritiesFinancingInstructionV07;
			owner_lazy = () -> SecuritiesFinancingInstructionV08.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/StandingSettlementInstructionDetails/Counterparty/Seller</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/TransactionTypeAndAdditionalParameters/SecuritiesFinancingTransactionType</leftOperand><rightOperand>ReverseRepo</rightOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/StandingSettlementInstructionDetails</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(SecuritiesFinancingInstructionV08 obj) throws Exception {
			check_sese_SecuritiesFinancingInstructionV08(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstruction002V06
	 * SecuritiesFinancingInstruction002V06}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/StandingSettlementInstructionDetails/Counterparty/Seller&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/TransactionTypeAndAdditionalParameters/SecuritiesFinancingTransactionType&lt;/leftOperand&gt;&lt;rightOperand&gt;ReverseRepo&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/StandingSettlementInstructionDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellerSSI1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If standing settlement instruction applies and the transaction is a reverse repo, then Seller must be present.\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingInstruction002V06> for_sese_SecuritiesFinancingInstruction002V06 = new MMConstraint<SecuritiesFinancingInstruction002V06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellerSSI1Rule";
			definition = "If standing settlement instruction applies and the transaction is a reverse repo, then Seller must be present.\r\n";
			owner_lazy = () -> SecuritiesFinancingInstruction002V06.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/StandingSettlementInstructionDetails/Counterparty/Seller</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/TransactionTypeAndAdditionalParameters/SecuritiesFinancingTransactionType</leftOperand><rightOperand>ReverseRepo</rightOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/StandingSettlementInstructionDetails</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(SecuritiesFinancingInstruction002V06 obj) throws Exception {
			check_sese_SecuritiesFinancingInstruction002V06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV02
	 * SecuritiesFinancingInstructionV02}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/StandingSettlementInstructionDetails/Counterparty/Seller&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/TransactionTypeAndAdditionalParameters/SecuritiesFinancingTransactionType&lt;/leftOperand&gt;&lt;rightOperand&gt;ReverseRepo&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/StandingSettlementInstructionDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellerSSI1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If standing settlement instruction applies and the transaction is a reverse repo, then Seller must be present.\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingInstructionV02> for_sese_SecuritiesFinancingInstructionV02 = new MMConstraint<SecuritiesFinancingInstructionV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellerSSI1Rule";
			definition = "If standing settlement instruction applies and the transaction is a reverse repo, then Seller must be present.\r\n";
			owner_lazy = () -> SecuritiesFinancingInstructionV02.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/StandingSettlementInstructionDetails/Counterparty/Seller</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/TransactionTypeAndAdditionalParameters/SecuritiesFinancingTransactionType</leftOperand><rightOperand>ReverseRepo</rightOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/StandingSettlementInstructionDetails</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(SecuritiesFinancingInstructionV02 obj) throws Exception {
			check_sese_SecuritiesFinancingInstructionV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV06
	 * SecuritiesFinancingInstructionV06}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/StandingSettlementInstructionDetails/Counterparty/Seller&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/TransactionTypeAndAdditionalParameters/SecuritiesFinancingTransactionType&lt;/leftOperand&gt;&lt;rightOperand&gt;ReverseRepo&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/StandingSettlementInstructionDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellerSSI1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If standing settlement instruction applies and the transaction is a reverse repo, then Seller must be present.\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSellerSSI1Rule#for_sese_SecuritiesFinancingInstructionV07
	 * ConstraintSellerSSI1Rule.for_sese_SecuritiesFinancingInstructionV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSellerSSI1Rule#for_sese_SecuritiesFinancingInstructionV05
	 * ConstraintSellerSSI1Rule.for_sese_SecuritiesFinancingInstructionV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingInstructionV06> for_sese_SecuritiesFinancingInstructionV06 = new MMConstraint<SecuritiesFinancingInstructionV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellerSSI1Rule";
			definition = "If standing settlement instruction applies and the transaction is a reverse repo, then Seller must be present.\r\n";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSellerSSI1Rule.for_sese_SecuritiesFinancingInstructionV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSellerSSI1Rule.for_sese_SecuritiesFinancingInstructionV05;
			owner_lazy = () -> SecuritiesFinancingInstructionV06.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/StandingSettlementInstructionDetails/Counterparty/Seller</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/TransactionTypeAndAdditionalParameters/SecuritiesFinancingTransactionType</leftOperand><rightOperand>ReverseRepo</rightOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/StandingSettlementInstructionDetails</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(SecuritiesFinancingInstructionV06 obj) throws Exception {
			check_sese_SecuritiesFinancingInstructionV06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstruction002V08
	 * SecuritiesFinancingInstruction002V08}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/StandingSettlementInstructionDetails/Counterparty/Seller&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/TransactionTypeAndAdditionalParameters/SecuritiesFinancingTransactionType&lt;/leftOperand&gt;&lt;rightOperand&gt;ReverseRepo&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/StandingSettlementInstructionDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellerSSI1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If standing settlement instruction applies and the transaction is a reverse repo, then Seller must be present.\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingInstruction002V08> for_sese_SecuritiesFinancingInstruction002V08 = new MMConstraint<SecuritiesFinancingInstruction002V08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellerSSI1Rule";
			definition = "If standing settlement instruction applies and the transaction is a reverse repo, then Seller must be present.\r\n";
			owner_lazy = () -> SecuritiesFinancingInstruction002V08.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/StandingSettlementInstructionDetails/Counterparty/Seller</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/TransactionTypeAndAdditionalParameters/SecuritiesFinancingTransactionType</leftOperand><rightOperand>ReverseRepo</rightOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/StandingSettlementInstructionDetails</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(SecuritiesFinancingInstruction002V08 obj) throws Exception {
			check_sese_SecuritiesFinancingInstruction002V08(obj);
		}
	};

	/**
	 * If standing settlement instruction applies and the transaction is a
	 * reverse repo, then Seller must be present.<br>
	 */
	public static void check_sese_SecuritiesFinancingInstructionV04(SecuritiesFinancingInstructionV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If standing settlement instruction applies and the transaction is a
	 * reverse repo, then Seller must be present.<br>
	 */
	public static void check_sese_SecuritiesFinancingInstruction002V07(SecuritiesFinancingInstruction002V07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If standing settlement instruction applies and the transaction is a
	 * reverse repo, then Seller must be present.<br>
	 */
	public static void check_sese_SecuritiesFinancingInstructionV05(SecuritiesFinancingInstructionV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If standing settlement instruction applies and the transaction is a
	 * reverse repo, then Seller must be present.<br>
	 */
	public static void check_sese_SecuritiesFinancingInstructionV01(SecuritiesFinancingInstructionV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If standing settlement instruction applies and the transaction is a
	 * reverse repo, then Seller must be present.<br>
	 */
	public static void check_sese_SecuritiesFinancingInstructionV07(SecuritiesFinancingInstructionV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If standing settlement instruction applies and the transaction is a
	 * reverse repo, then Seller must be present.<br>
	 */
	public static void check_sese_SecuritiesFinancingInstructionV03(SecuritiesFinancingInstructionV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If standing settlement instruction applies and the transaction is a
	 * reverse repo, then Seller must be present.<br>
	 */
	public static void check_sese_SecuritiesFinancingInstructionV08(SecuritiesFinancingInstructionV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If standing settlement instruction applies and the transaction is a
	 * reverse repo, then Seller must be present.<br>
	 */
	public static void check_sese_SecuritiesFinancingInstruction002V06(SecuritiesFinancingInstruction002V06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If standing settlement instruction applies and the transaction is a
	 * reverse repo, then Seller must be present.<br>
	 */
	public static void check_sese_SecuritiesFinancingInstructionV02(SecuritiesFinancingInstructionV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If standing settlement instruction applies and the transaction is a
	 * reverse repo, then Seller must be present.<br>
	 */
	public static void check_sese_SecuritiesFinancingInstructionV06(SecuritiesFinancingInstructionV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If standing settlement instruction applies and the transaction is a
	 * reverse repo, then Seller must be present.<br>
	 */
	public static void check_sese_SecuritiesFinancingInstruction002V08(SecuritiesFinancingInstruction002V08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}