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
import com.tools20022.repository.area.secl.BuyInNotificationV03;
import com.tools20022.repository.msg.*;
import java.util.Arrays;

/**
 * If NotificationDetails/WarningIndicator is "false" or "0" (No), then
 * TransactionIdentification must be present.
 */
public class ConstraintTransactionIdentificationPresenceRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.secl.BuyInNotificationV03
	 * BuyInNotificationV03}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TransactionIdentification&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/NotificationDetails/WarningIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;false&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentificationPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If NotificationDetails/WarningIndicator is \"false\" or \"0\" (No), then TransactionIdentification must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<BuyInNotificationV03> forBuyInNotificationV03 = new MMConstraint<BuyInNotificationV03>() {
		{
			validator = ConstraintTransactionIdentificationPresenceRule::checkBuyInNotificationV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentificationPresenceRule";
			definition = "If NotificationDetails/WarningIndicator is \"false\" or \"0\" (No), then TransactionIdentification must be present.";
			owner_lazy = () -> BuyInNotificationV03.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/TransactionIdentification</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/NotificationDetails/WarningIndicator</leftOperand><rightOperand>false</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails41
	 * TransactionDetails41}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AccountServicerTransactionIdentification&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/MarketInfrastructureTransactionIdentification&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/AccountOwnerTransactionIdentification/TransactionIdentification&lt;/leftOperand&gt;&lt;rightOperand&gt;NONREF&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentificationPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AccountOwnerTransactionIdentification is NONREF then AccountServicerTransactionIdentification or MarketInfrastructureTransactionIdentification must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTransactionIdentificationPresenceRule#forTransactionDetails64
	 * ConstraintTransactionIdentificationPresenceRule.forTransactionDetails64}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails41> forTransactionDetails41 = new MMConstraint<TransactionDetails41>() {
		{
			validator = ConstraintTransactionIdentificationPresenceRule::checkTransactionDetails41;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentificationPresenceRule";
			definition = "If AccountOwnerTransactionIdentification is NONREF then AccountServicerTransactionIdentification or MarketInfrastructureTransactionIdentification must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTransactionIdentificationPresenceRule.forTransactionDetails64);
			owner_lazy = () -> TransactionDetails41.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AccountServicerTransactionIdentification</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/MarketInfrastructureTransactionIdentification</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/AccountOwnerTransactionIdentification/TransactionIdentification</leftOperand><rightOperand>NONREF</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails43
	 * TransactionDetails43}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AccountServicerTransactionIdentification&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/MarketInfrastructureTransactionIdentification&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/AccountOwnerTransactionIdentification/TransactionIdentification&lt;/leftOperand&gt;&lt;rightOperand&gt;NONREF&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentificationPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AccountOwnerTansactionIdentification is NONREF then AccountServicerTransactionIdentification or MarketInfrastructureTransactionIdentification must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails43> forTransactionDetails43 = new MMConstraint<TransactionDetails43>() {
		{
			validator = ConstraintTransactionIdentificationPresenceRule::checkTransactionDetails43;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentificationPresenceRule";
			definition = "If AccountOwnerTansactionIdentification is NONREF then AccountServicerTransactionIdentification or MarketInfrastructureTransactionIdentification must be present.";
			owner_lazy = () -> TransactionDetails43.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AccountServicerTransactionIdentification</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/MarketInfrastructureTransactionIdentification</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/AccountOwnerTransactionIdentification/TransactionIdentification</leftOperand><rightOperand>NONREF</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails64
	 * TransactionDetails64}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AccountServicerTransactionIdentification&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/MarketInfrastructureTransactionIdentification&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ProcessorTransactionIdentification&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OtherTransactionIdentification&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/AccountOwnerTransactionIdentification/TransactionIdentification&lt;/leftOperand&gt;&lt;rightOperand&gt;NONREF&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentificationPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AccountOwnerTransactionIdentification is NONREF then at least one of the other references must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTransactionIdentificationPresenceRule#forTransactionDetails76
	 * ConstraintTransactionIdentificationPresenceRule.forTransactionDetails76}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTransactionIdentificationPresenceRule#forTransactionDetails41
	 * ConstraintTransactionIdentificationPresenceRule.forTransactionDetails41}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails64> forTransactionDetails64 = new MMConstraint<TransactionDetails64>() {
		{
			validator = ConstraintTransactionIdentificationPresenceRule::checkTransactionDetails64;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentificationPresenceRule";
			definition = "If AccountOwnerTransactionIdentification is NONREF then at least one of the other references must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTransactionIdentificationPresenceRule.forTransactionDetails76);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTransactionIdentificationPresenceRule.forTransactionDetails41;
			owner_lazy = () -> TransactionDetails64.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AccountServicerTransactionIdentification</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/MarketInfrastructureTransactionIdentification</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/ProcessorTransactionIdentification</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/OtherTransactionIdentification</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/AccountOwnerTransactionIdentification/TransactionIdentification</leftOperand><rightOperand>NONREF</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails65
	 * TransactionDetails65}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AccountServicerTransactionIdentification&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/MarketInfrastructureTransactionIdentification&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ProcessorTransactionIdentification&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OtherTransactionIdentification&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/AccountOwnerTransactionIdentification/TransactionIdentification&lt;/leftOperand&gt;&lt;rightOperand&gt;NONREF&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentificationPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AccountOwnerTransactionIdentification is NONREF then at least one of the other references must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails65> forTransactionDetails65 = new MMConstraint<TransactionDetails65>() {
		{
			validator = ConstraintTransactionIdentificationPresenceRule::checkTransactionDetails65;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentificationPresenceRule";
			definition = "If AccountOwnerTransactionIdentification is NONREF then at least one of the other references must be present.";
			owner_lazy = () -> TransactionDetails65.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AccountServicerTransactionIdentification</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/MarketInfrastructureTransactionIdentification</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/ProcessorTransactionIdentification</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/OtherTransactionIdentification</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/AccountOwnerTransactionIdentification/TransactionIdentification</leftOperand><rightOperand>NONREF</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails76
	 * TransactionDetails76}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AccountServicerTransactionIdentification&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/MarketInfrastructureTransactionIdentification&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ProcessorTransactionIdentification&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OtherTransactionIdentification&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/AccountOwnerTransactionIdentification/TransactionIdentification&lt;/leftOperand&gt;&lt;rightOperand&gt;NONREF&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentificationPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AccountOwnerTransactionIdentification is NONREF then at least one of the other references must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTransactionIdentificationPresenceRule#forTransactionDetails64
	 * ConstraintTransactionIdentificationPresenceRule.forTransactionDetails64}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails76> forTransactionDetails76 = new MMConstraint<TransactionDetails76>() {
		{
			validator = ConstraintTransactionIdentificationPresenceRule::checkTransactionDetails76;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentificationPresenceRule";
			definition = "If AccountOwnerTransactionIdentification is NONREF then at least one of the other references must be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTransactionIdentificationPresenceRule.forTransactionDetails64;
			owner_lazy = () -> TransactionDetails76.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AccountServicerTransactionIdentification</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/MarketInfrastructureTransactionIdentification</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/ProcessorTransactionIdentification</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/OtherTransactionIdentification</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/AccountOwnerTransactionIdentification/TransactionIdentification</leftOperand><rightOperand>NONREF</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails85
	 * TransactionDetails85}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AccountServicerTransactionIdentification&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/MarketInfrastructureTransactionIdentification&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ProcessorTransactionIdentification&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OtherTransactionIdentification&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/AccountOwnerTransactionIdentification/TransactionIdentification&lt;/leftOperand&gt;&lt;rightOperand&gt;NONREF&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentificationPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AccountOwnerTransactionIdentification is NONREF then at least one of the other references must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTransactionIdentificationPresenceRule#forTransactionDetails101
	 * ConstraintTransactionIdentificationPresenceRule.forTransactionDetails101}
	 * </li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails85> forTransactionDetails85 = new MMConstraint<TransactionDetails85>() {
		{
			validator = ConstraintTransactionIdentificationPresenceRule::checkTransactionDetails85;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentificationPresenceRule";
			definition = "If AccountOwnerTransactionIdentification is NONREF then at least one of the other references must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTransactionIdentificationPresenceRule.forTransactionDetails101);
			owner_lazy = () -> TransactionDetails85.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AccountServicerTransactionIdentification</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/MarketInfrastructureTransactionIdentification</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/ProcessorTransactionIdentification</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/OtherTransactionIdentification</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/AccountOwnerTransactionIdentification/TransactionIdentification</leftOperand><rightOperand>NONREF</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails101
	 * TransactionDetails101}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AccountServicerTransactionIdentification&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/MarketInfrastructureTransactionIdentification&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ProcessorTransactionIdentification&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OtherTransactionIdentification&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/AccountOwnerTransactionIdentification/TransactionIdentification&lt;/leftOperand&gt;&lt;rightOperand&gt;NONREF&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentificationPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AccountOwnerTransactionIdentification is NONREF then at least one of the other references must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTransactionIdentificationPresenceRule#forTransactionDetails85
	 * ConstraintTransactionIdentificationPresenceRule.forTransactionDetails85}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails101> forTransactionDetails101 = new MMConstraint<TransactionDetails101>() {
		{
			validator = ConstraintTransactionIdentificationPresenceRule::checkTransactionDetails101;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentificationPresenceRule";
			definition = "If AccountOwnerTransactionIdentification is NONREF then at least one of the other references must be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTransactionIdentificationPresenceRule.forTransactionDetails85;
			owner_lazy = () -> TransactionDetails101.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AccountServicerTransactionIdentification</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/MarketInfrastructureTransactionIdentification</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/ProcessorTransactionIdentification</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/OtherTransactionIdentification</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/AccountOwnerTransactionIdentification/TransactionIdentification</leftOperand><rightOperand>NONREF</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};

	/**
	 * If NotificationDetails/WarningIndicator is "false" or "0" (No), then
	 * TransactionIdentification must be present.
	 */
	public static void checkBuyInNotificationV03(BuyInNotificationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AccountOwnerTransactionIdentification is NONREF then
	 * AccountServicerTransactionIdentification or
	 * MarketInfrastructureTransactionIdentification must be present.
	 */
	public static void checkTransactionDetails41(TransactionDetails41 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AccountOwnerTansactionIdentification is NONREF then
	 * AccountServicerTransactionIdentification or
	 * MarketInfrastructureTransactionIdentification must be present.
	 */
	public static void checkTransactionDetails43(TransactionDetails43 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AccountOwnerTransactionIdentification is NONREF then at least one of
	 * the other references must be present.
	 */
	public static void checkTransactionDetails64(TransactionDetails64 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AccountOwnerTransactionIdentification is NONREF then at least one of
	 * the other references must be present.
	 */
	public static void checkTransactionDetails65(TransactionDetails65 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AccountOwnerTransactionIdentification is NONREF then at least one of
	 * the other references must be present.
	 */
	public static void checkTransactionDetails76(TransactionDetails76 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AccountOwnerTransactionIdentification is NONREF then at least one of
	 * the other references must be present.
	 */
	public static void checkTransactionDetails85(TransactionDetails85 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AccountOwnerTransactionIdentification is NONREF then at least one of
	 * the other references must be present.
	 */
	public static void checkTransactionDetails101(TransactionDetails101 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}