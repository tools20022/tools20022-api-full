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
import com.tools20022.repository.area.seev.*;
import java.util.Arrays;

/**
 * If AccountDetails/ForAllAccounts/IdentificationCode value is GENR (General)
 * then any element in the list (MinimumNominalQuantity,
 * MinimumExercisableQuantity,MinimumExercisableMultipleQuantity, ContractSize)
 * must not be present in any occurrences of
 * CorporateActionOptionDetails/SecuritiesMovementDetails/SecurityDetails;<br>
 * (MT564 Rule C2 - part 1).
 */
public class ConstraintSafekeepingAccount1Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV08
	 * CorporateActionNotificationV08}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumNominalQuantity&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumQuantityToInstruct&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumMultipleQuantityToInstruct&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/ContractSize&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AccountDetails/ForAllAccounts&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/AccountDetails/ForAllAccounts/IdentificationCode&lt;/leftOperand&gt;&lt;rightOperand&gt;General&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccount1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AccountDetails/ForAllAccounts/IdentificationCode value is GENR (General) then any element in the list (MinimumNominalQuantity, MinimumExercisableQuantity,MinimumExercisableMultipleQuantity, ContractSize) must not be present in any occurrences of CorporateActionOptionDetails/SecuritiesMovementDetails/SecurityDetails;\r\n(MT564 Rule C2 - part 1)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingAccount1Rule#forCorporateActionNotificationV07
	 * ConstraintSafekeepingAccount1Rule.forCorporateActionNotificationV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV08> forCorporateActionNotificationV08 = new MMConstraint<CorporateActionNotificationV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount1Rule";
			definition = "If AccountDetails/ForAllAccounts/IdentificationCode value is GENR (General) then any element in the list (MinimumNominalQuantity, MinimumExercisableQuantity,MinimumExercisableMultipleQuantity, ContractSize) must not be present in any occurrences of CorporateActionOptionDetails/SecuritiesMovementDetails/SecurityDetails;\r\n(MT564 Rule C2 - part 1).";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSafekeepingAccount1Rule.forCorporateActionNotificationV07;
			owner_lazy = () -> CorporateActionNotificationV08.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumNominalQuantity</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumQuantityToInstruct</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumMultipleQuantityToInstruct</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/ContractSize</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AccountDetails/ForAllAccounts</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/AccountDetails/ForAllAccounts/IdentificationCode</leftOperand><rightOperand>General</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CorporateActionNotificationV08 obj) throws Exception {
			checkCorporateActionNotificationV08(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV09
	 * CorporateActionMovementPreliminaryAdviceV09}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumNominalQuantity&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumQuantityToInstruct&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumMultipleQuantityToInstruct&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/ContractSize&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AccountDetails/ForAllAccounts&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/AccountDetails/ForAllAccounts/IdentificationCode&lt;/leftOperand&gt;&lt;rightOperand&gt;General&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccount1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AccountDetails/ForAllAccounts/IdentificationCode value is GENR (General), then any element in the list (MinimumNominalQuantity, MinimumExercisableQuantity,MinimumExercisableMultipleQuantity, ContractSize) must not be present in any occurrences of CorporateActionMovementDetails/SecuritiesMovementDetails/SecurityDetails;\r\n(MT564 Rule C2 - part 1)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingAccount1Rule#forCorporateActionMovementPreliminaryAdviceV08
	 * ConstraintSafekeepingAccount1Rule.
	 * forCorporateActionMovementPreliminaryAdviceV08}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementPreliminaryAdviceV09> forCorporateActionMovementPreliminaryAdviceV09 = new MMConstraint<CorporateActionMovementPreliminaryAdviceV09>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount1Rule";
			definition = "If AccountDetails/ForAllAccounts/IdentificationCode value is GENR (General), then any element in the list (MinimumNominalQuantity, MinimumExercisableQuantity,MinimumExercisableMultipleQuantity, ContractSize) must not be present in any occurrences of CorporateActionMovementDetails/SecuritiesMovementDetails/SecurityDetails;\r\n(MT564 Rule C2 - part 1).";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSafekeepingAccount1Rule.forCorporateActionMovementPreliminaryAdviceV08;
			owner_lazy = () -> CorporateActionMovementPreliminaryAdviceV09.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumNominalQuantity</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumQuantityToInstruct</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumMultipleQuantityToInstruct</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/ContractSize</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AccountDetails/ForAllAccounts</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/AccountDetails/ForAllAccounts/IdentificationCode</leftOperand><rightOperand>General</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CorporateActionMovementPreliminaryAdviceV09 obj) throws Exception {
			checkCorporateActionMovementPreliminaryAdviceV09(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdvice002V09
	 * CorporateActionMovementPreliminaryAdvice002V09}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumNominalQuantity&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumQuantityToInstruct&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumMultipleQuantityToInstruct&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/ContractSize&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AccountDetails/ForAllAccounts&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/AccountDetails/ForAllAccounts/IdentificationCode&lt;/leftOperand&gt;&lt;rightOperand&gt;General&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccount1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AccountDetails/ForAllAccounts/IdentificationCode value is GENR (General), then any element in the list (MinimumNominalQuantity, MinimumExercisableQuantity,MinimumExercisableMultipleQuantity, ContractSize) must not be present in any occurrences of CorporateActionMovementDetails/SecuritiesMovementDetails/SecurityDetails;\r\n(MT564 Rule C2 - part 1)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementPreliminaryAdvice002V09> forCorporateActionMovementPreliminaryAdvice002V09 = new MMConstraint<CorporateActionMovementPreliminaryAdvice002V09>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount1Rule";
			definition = "If AccountDetails/ForAllAccounts/IdentificationCode value is GENR (General), then any element in the list (MinimumNominalQuantity, MinimumExercisableQuantity,MinimumExercisableMultipleQuantity, ContractSize) must not be present in any occurrences of CorporateActionMovementDetails/SecuritiesMovementDetails/SecurityDetails;\r\n(MT564 Rule C2 - part 1).";
			owner_lazy = () -> CorporateActionMovementPreliminaryAdvice002V09.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumNominalQuantity</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumQuantityToInstruct</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumMultipleQuantityToInstruct</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/ContractSize</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AccountDetails/ForAllAccounts</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/AccountDetails/ForAllAccounts/IdentificationCode</leftOperand><rightOperand>General</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CorporateActionMovementPreliminaryAdvice002V09 obj) throws Exception {
			checkCorporateActionMovementPreliminaryAdvice002V09(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V08
	 * CorporateActionNotification002V08}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumNominalQuantity&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumQuantityToInstruct&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumMultipleQuantityToInstruct&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/ContractSize&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AccountDetails/ForAllAccounts&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/AccountDetails/ForAllAccounts/IdentificationCode&lt;/leftOperand&gt;&lt;rightOperand&gt;General&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccount1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AccountDetails/ForAllAccounts/IdentificationCode value is GENR (General) then any element in the list (MinimumNominalQuantity, MinimumExercisableQuantity,MinimumExercisableMultipleQuantity, ContractSize) must not be present in any occurrences of CorporateActionOptionDetails/SecuritiesMovementDetails/SecurityDetails;\r\n(MT564 Rule C2 - part 1)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotification002V08> forCorporateActionNotification002V08 = new MMConstraint<CorporateActionNotification002V08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount1Rule";
			definition = "If AccountDetails/ForAllAccounts/IdentificationCode value is GENR (General) then any element in the list (MinimumNominalQuantity, MinimumExercisableQuantity,MinimumExercisableMultipleQuantity, ContractSize) must not be present in any occurrences of CorporateActionOptionDetails/SecuritiesMovementDetails/SecurityDetails;\r\n(MT564 Rule C2 - part 1).";
			owner_lazy = () -> CorporateActionNotification002V08.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumNominalQuantity</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumQuantityToInstruct</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumMultipleQuantityToInstruct</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/ContractSize</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AccountDetails/ForAllAccounts</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/AccountDetails/ForAllAccounts/IdentificationCode</leftOperand><rightOperand>General</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CorporateActionNotification002V08 obj) throws Exception {
			checkCorporateActionNotification002V08(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV07
	 * CorporateActionNotificationV07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumNominalQuantity&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumQuantityToInstruct&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumMultipleQuantityToInstruct&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/ContractSize&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AccountDetails/ForAllAccounts&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/AccountDetails/ForAllAccounts/IdentificationCode&lt;/leftOperand&gt;&lt;rightOperand&gt;General&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccount1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AccountDetails/ForAllAccounts/IdentificationCode value is GENR (General) then any element in the list (MinimumNominalQuantity, MinimumExercisableQuantity,MinimumExercisableMultipleQuantity, ContractSize) must not be present in any occurrences of CorporateActionOptionDetails/SecuritiesMovementDetails/SecurityDetails;\r\n(MT564 Rule C2 - part 1)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingAccount1Rule#forCorporateActionNotificationV08
	 * ConstraintSafekeepingAccount1Rule.forCorporateActionNotificationV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingAccount1Rule#forCorporateActionNotificationV06
	 * ConstraintSafekeepingAccount1Rule.forCorporateActionNotificationV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV07> forCorporateActionNotificationV07 = new MMConstraint<CorporateActionNotificationV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount1Rule";
			definition = "If AccountDetails/ForAllAccounts/IdentificationCode value is GENR (General) then any element in the list (MinimumNominalQuantity, MinimumExercisableQuantity,MinimumExercisableMultipleQuantity, ContractSize) must not be present in any occurrences of CorporateActionOptionDetails/SecuritiesMovementDetails/SecurityDetails;\r\n(MT564 Rule C2 - part 1).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSafekeepingAccount1Rule.forCorporateActionNotificationV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSafekeepingAccount1Rule.forCorporateActionNotificationV06;
			owner_lazy = () -> CorporateActionNotificationV07.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumNominalQuantity</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumQuantityToInstruct</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumMultipleQuantityToInstruct</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/ContractSize</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AccountDetails/ForAllAccounts</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/AccountDetails/ForAllAccounts/IdentificationCode</leftOperand><rightOperand>General</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CorporateActionNotificationV07 obj) throws Exception {
			checkCorporateActionNotificationV07(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08
	 * CorporateActionMovementPreliminaryAdviceV08}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumNominalQuantity&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumQuantityToInstruct&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumMultipleQuantityToInstruct&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/ContractSize&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AccountDetails/ForAllAccounts&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/AccountDetails/ForAllAccounts/IdentificationCode&lt;/leftOperand&gt;&lt;rightOperand&gt;General&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccount1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AccountDetails/ForAllAccounts/IdentificationCode value is GENR (General), then any element in the list (MinimumNominalQuantity, MinimumExercisableQuantity,MinimumExercisableMultipleQuantity, ContractSize) must not be present in any occurrences of CorporateActionMovementDetails/SecuritiesMovementDetails/SecurityDetails;\r\n(MT564 Rule C2 - part 1)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingAccount1Rule#forCorporateActionMovementPreliminaryAdviceV09
	 * ConstraintSafekeepingAccount1Rule.
	 * forCorporateActionMovementPreliminaryAdviceV09}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingAccount1Rule#forCorporateActionMovementPreliminaryAdviceV07
	 * ConstraintSafekeepingAccount1Rule.
	 * forCorporateActionMovementPreliminaryAdviceV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementPreliminaryAdviceV08> forCorporateActionMovementPreliminaryAdviceV08 = new MMConstraint<CorporateActionMovementPreliminaryAdviceV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount1Rule";
			definition = "If AccountDetails/ForAllAccounts/IdentificationCode value is GENR (General), then any element in the list (MinimumNominalQuantity, MinimumExercisableQuantity,MinimumExercisableMultipleQuantity, ContractSize) must not be present in any occurrences of CorporateActionMovementDetails/SecuritiesMovementDetails/SecurityDetails;\r\n(MT564 Rule C2 - part 1).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSafekeepingAccount1Rule.forCorporateActionMovementPreliminaryAdviceV09);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSafekeepingAccount1Rule.forCorporateActionMovementPreliminaryAdviceV07;
			owner_lazy = () -> CorporateActionMovementPreliminaryAdviceV08.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumNominalQuantity</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumQuantityToInstruct</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumMultipleQuantityToInstruct</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/ContractSize</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AccountDetails/ForAllAccounts</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/AccountDetails/ForAllAccounts/IdentificationCode</leftOperand><rightOperand>General</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CorporateActionMovementPreliminaryAdviceV08 obj) throws Exception {
			checkCorporateActionMovementPreliminaryAdviceV08(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01
	 * CorporateActionMovementPreliminaryAdviceV01}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumNominalQuantity&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumExercisableQuantity&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumExercisableQuantity&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/ContractSize&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AccountDetails/ForAllAccounts&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/AccountDetails/ForAllAccounts/IdentificationCode&lt;/leftOperand&gt;&lt;rightOperand&gt;General&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccount1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AccountDetails/ForAllAccounts/IdentificationCode value is GENR then any element in the list (MinimumNominalQuantity, MinimumExercisableQuantity,MinimumExercisableMultipleQuantity, ContractSize) must not be present in any occurrences of CorporateActionMovementDetails/SecuritiesMovementDetails/SecurityDetails;\r\n(MT564 Rule C2 - part 1)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementPreliminaryAdviceV01> forCorporateActionMovementPreliminaryAdviceV01 = new MMConstraint<CorporateActionMovementPreliminaryAdviceV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount1Rule";
			definition = "If AccountDetails/ForAllAccounts/IdentificationCode value is GENR then any element in the list (MinimumNominalQuantity, MinimumExercisableQuantity,MinimumExercisableMultipleQuantity, ContractSize) must not be present in any occurrences of CorporateActionMovementDetails/SecuritiesMovementDetails/SecurityDetails;\r\n(MT564 Rule C2 - part 1).";
			owner_lazy = () -> CorporateActionMovementPreliminaryAdviceV01.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumNominalQuantity</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumExercisableQuantity</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumExercisableQuantity</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/ContractSize</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AccountDetails/ForAllAccounts</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/AccountDetails/ForAllAccounts/IdentificationCode</leftOperand><rightOperand>General</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CorporateActionMovementPreliminaryAdviceV01 obj) throws Exception {
			checkCorporateActionMovementPreliminaryAdviceV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV02
	 * CorporateActionMovementPreliminaryAdviceV02}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumNominalQuantity&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumExercisableQuantity&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumExercisableQuantity&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/ContractSize&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AccountDetails/ForAllAccounts&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/AccountDetails/ForAllAccounts/IdentificationCode&lt;/leftOperand&gt;&lt;rightOperand&gt;General&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccount1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AccountDetails/ForAllAccounts/IdentificationCode value is GENR then any element in the list (MinimumNominalQuantity, MinimumExercisableQuantity,MinimumExercisableMultipleQuantity, ContractSize) must not be present in any occurrences of CorporateActionMovementDetails/SecuritiesMovementDetails/SecurityDetails;\r\n(MT564 Rule C2 - part 1)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementPreliminaryAdviceV02> forCorporateActionMovementPreliminaryAdviceV02 = new MMConstraint<CorporateActionMovementPreliminaryAdviceV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount1Rule";
			definition = "If AccountDetails/ForAllAccounts/IdentificationCode value is GENR then any element in the list (MinimumNominalQuantity, MinimumExercisableQuantity,MinimumExercisableMultipleQuantity, ContractSize) must not be present in any occurrences of CorporateActionMovementDetails/SecuritiesMovementDetails/SecurityDetails;\r\n(MT564 Rule C2 - part 1).";
			owner_lazy = () -> CorporateActionMovementPreliminaryAdviceV02.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumNominalQuantity</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumExercisableQuantity</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumExercisableQuantity</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/ContractSize</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AccountDetails/ForAllAccounts</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/AccountDetails/ForAllAccounts/IdentificationCode</leftOperand><rightOperand>General</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CorporateActionMovementPreliminaryAdviceV02 obj) throws Exception {
			checkCorporateActionMovementPreliminaryAdviceV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV03
	 * CorporateActionMovementPreliminaryAdviceV03}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumNominalQuantity&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumExercisableQuantity&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumExercisableQuantity&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/ContractSize&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AccountDetails/ForAllAccounts&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/AccountDetails/ForAllAccounts/IdentificationCode&lt;/leftOperand&gt;&lt;rightOperand&gt;General&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccount1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AccountDetails/ForAllAccounts/IdentificationCode value is GENR then any element in the list (MinimumNominalQuantity, MinimumExercisableQuantity,MinimumExercisableMultipleQuantity, ContractSize) must not be present in any occurrences of CorporateActionMovementDetails/SecuritiesMovementDetails/SecurityDetails;\r\n(MT564 Rule C2 - part 1)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementPreliminaryAdviceV03> forCorporateActionMovementPreliminaryAdviceV03 = new MMConstraint<CorporateActionMovementPreliminaryAdviceV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount1Rule";
			definition = "If AccountDetails/ForAllAccounts/IdentificationCode value is GENR then any element in the list (MinimumNominalQuantity, MinimumExercisableQuantity,MinimumExercisableMultipleQuantity, ContractSize) must not be present in any occurrences of CorporateActionMovementDetails/SecuritiesMovementDetails/SecurityDetails;\r\n(MT564 Rule C2 - part 1).";
			owner_lazy = () -> CorporateActionMovementPreliminaryAdviceV03.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumNominalQuantity</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumExercisableQuantity</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumExercisableQuantity</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/ContractSize</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AccountDetails/ForAllAccounts</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/AccountDetails/ForAllAccounts/IdentificationCode</leftOperand><rightOperand>General</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CorporateActionMovementPreliminaryAdviceV03 obj) throws Exception {
			checkCorporateActionMovementPreliminaryAdviceV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV04
	 * CorporateActionMovementPreliminaryAdviceV04}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumNominalQuantity&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumExercisableQuantity&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumExercisableQuantity&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/ContractSize&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AccountDetails/ForAllAccounts&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/AccountDetails/ForAllAccounts/IdentificationCode&lt;/leftOperand&gt;&lt;rightOperand&gt;General&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccount1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AccountDetails/ForAllAccounts/IdentificationCode value is GENR then any element in the list (MinimumNominalQuantity, MinimumExercisableQuantity,MinimumExercisableMultipleQuantity, ContractSize) must not be present in any occurrences of CorporateActionMovementDetails/SecuritiesMovementDetails/SecurityDetails;\r\n(MT564 Rule C2 - part 1)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingAccount1Rule#forCorporateActionMovementPreliminaryAdviceV05
	 * ConstraintSafekeepingAccount1Rule.
	 * forCorporateActionMovementPreliminaryAdviceV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementPreliminaryAdviceV04> forCorporateActionMovementPreliminaryAdviceV04 = new MMConstraint<CorporateActionMovementPreliminaryAdviceV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount1Rule";
			definition = "If AccountDetails/ForAllAccounts/IdentificationCode value is GENR then any element in the list (MinimumNominalQuantity, MinimumExercisableQuantity,MinimumExercisableMultipleQuantity, ContractSize) must not be present in any occurrences of CorporateActionMovementDetails/SecuritiesMovementDetails/SecurityDetails;\r\n(MT564 Rule C2 - part 1).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSafekeepingAccount1Rule.forCorporateActionMovementPreliminaryAdviceV05);
			owner_lazy = () -> CorporateActionMovementPreliminaryAdviceV04.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumNominalQuantity</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumExercisableQuantity</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumExercisableQuantity</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/ContractSize</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AccountDetails/ForAllAccounts</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/AccountDetails/ForAllAccounts/IdentificationCode</leftOperand><rightOperand>General</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CorporateActionMovementPreliminaryAdviceV04 obj) throws Exception {
			checkCorporateActionMovementPreliminaryAdviceV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV01
	 * CorporateActionNotificationV01}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumNominalQuantity&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumExercisableQuantity&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumExercisableMultipleQuantity&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/ContractSize&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AccountDetails/ForAllAccounts&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/AccountDetails/ForAllAccounts/IdentificationCode&lt;/leftOperand&gt;&lt;rightOperand&gt;General&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccount1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AccountDetails/ForAllAccounts/IdentificationCode value is GENR then any element in the list (MinimumNominalQuantity, MinimumExercisableQuantity,MinimumExercisableMultipleQuantity, ContractSize) must not be present in any occurrences of CorporateActionOptionDetails/SecuritiesMovementDetails/SecurityDetails;\r\n(MT564 Rule C2 - part 1)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV01> forCorporateActionNotificationV01 = new MMConstraint<CorporateActionNotificationV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount1Rule";
			definition = "If AccountDetails/ForAllAccounts/IdentificationCode value is GENR then any element in the list (MinimumNominalQuantity, MinimumExercisableQuantity,MinimumExercisableMultipleQuantity, ContractSize) must not be present in any occurrences of CorporateActionOptionDetails/SecuritiesMovementDetails/SecurityDetails;\r\n(MT564 Rule C2 - part 1).";
			owner_lazy = () -> CorporateActionNotificationV01.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumNominalQuantity</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumExercisableQuantity</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumExercisableMultipleQuantity</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/ContractSize</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AccountDetails/ForAllAccounts</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/AccountDetails/ForAllAccounts/IdentificationCode</leftOperand><rightOperand>General</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CorporateActionNotificationV01 obj) throws Exception {
			checkCorporateActionNotificationV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV02
	 * CorporateActionNotificationV02}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumNominalQuantity&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumExercisableQuantity&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumExercisableMultipleQuantity&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/ContractSize&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AccountDetails/ForAllAccounts&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/AccountDetails/ForAllAccounts/IdentificationCode&lt;/leftOperand&gt;&lt;rightOperand&gt;General&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccount1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AccountDetails/ForAllAccounts/IdentificationCode value is GENR then any element in the list (MinimumNominalQuantity, MinimumExercisableQuantity,MinimumExercisableMultipleQuantity, ContractSize) must not be present in any occurrences of CorporateActionOptionDetails/SecuritiesMovementDetails/SecurityDetails;\r\n(MT564 Rule C2 - part 1)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV02> forCorporateActionNotificationV02 = new MMConstraint<CorporateActionNotificationV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount1Rule";
			definition = "If AccountDetails/ForAllAccounts/IdentificationCode value is GENR then any element in the list (MinimumNominalQuantity, MinimumExercisableQuantity,MinimumExercisableMultipleQuantity, ContractSize) must not be present in any occurrences of CorporateActionOptionDetails/SecuritiesMovementDetails/SecurityDetails;\r\n(MT564 Rule C2 - part 1).";
			owner_lazy = () -> CorporateActionNotificationV02.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumNominalQuantity</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumExercisableQuantity</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumExercisableMultipleQuantity</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/ContractSize</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AccountDetails/ForAllAccounts</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/AccountDetails/ForAllAccounts/IdentificationCode</leftOperand><rightOperand>General</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CorporateActionNotificationV02 obj) throws Exception {
			checkCorporateActionNotificationV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV03
	 * CorporateActionNotificationV03}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumNominalQuantity&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumExercisableQuantity&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumExercisableMultipleQuantity&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/ContractSize&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AccountDetails/ForAllAccounts&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/AccountDetails/ForAllAccounts/IdentificationCode&lt;/leftOperand&gt;&lt;rightOperand&gt;General&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccount1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AccountDetails/ForAllAccounts/IdentificationCode value is GENR then any element in the list (MinimumNominalQuantity, MinimumExercisableQuantity,MinimumExercisableMultipleQuantity, ContractSize) must not be present in any occurrences of CorporateActionOptionDetails/SecuritiesMovementDetails/SecurityDetails;\r\n(MT564 Rule C2 - part 1)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV03> forCorporateActionNotificationV03 = new MMConstraint<CorporateActionNotificationV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount1Rule";
			definition = "If AccountDetails/ForAllAccounts/IdentificationCode value is GENR then any element in the list (MinimumNominalQuantity, MinimumExercisableQuantity,MinimumExercisableMultipleQuantity, ContractSize) must not be present in any occurrences of CorporateActionOptionDetails/SecuritiesMovementDetails/SecurityDetails;\r\n(MT564 Rule C2 - part 1).";
			owner_lazy = () -> CorporateActionNotificationV03.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumNominalQuantity</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumExercisableQuantity</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumExercisableMultipleQuantity</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/ContractSize</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AccountDetails/ForAllAccounts</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/AccountDetails/ForAllAccounts/IdentificationCode</leftOperand><rightOperand>General</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CorporateActionNotificationV03 obj) throws Exception {
			checkCorporateActionNotificationV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV04
	 * CorporateActionNotificationV04}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumNominalQuantity&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumExercisableQuantity&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumExercisableMultipleQuantity&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/ContractSize&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AccountDetails/ForAllAccounts&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/AccountDetails/ForAllAccounts/IdentificationCode&lt;/leftOperand&gt;&lt;rightOperand&gt;General&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccount1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AccountDetails/ForAllAccounts/IdentificationCode value is GENR then any element in the list (MinimumNominalQuantity, MinimumExercisableQuantity,MinimumExercisableMultipleQuantity, ContractSize) must not be present in any occurrences of CorporateActionOptionDetails/SecuritiesMovementDetails/SecurityDetails;\r\n(MT564 Rule C2 - part 1)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingAccount1Rule#forCorporateActionNotificationV05
	 * ConstraintSafekeepingAccount1Rule.forCorporateActionNotificationV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV04> forCorporateActionNotificationV04 = new MMConstraint<CorporateActionNotificationV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount1Rule";
			definition = "If AccountDetails/ForAllAccounts/IdentificationCode value is GENR then any element in the list (MinimumNominalQuantity, MinimumExercisableQuantity,MinimumExercisableMultipleQuantity, ContractSize) must not be present in any occurrences of CorporateActionOptionDetails/SecuritiesMovementDetails/SecurityDetails;\r\n(MT564 Rule C2 - part 1).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSafekeepingAccount1Rule.forCorporateActionNotificationV05);
			owner_lazy = () -> CorporateActionNotificationV04.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumNominalQuantity</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumExercisableQuantity</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumExercisableMultipleQuantity</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/ContractSize</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AccountDetails/ForAllAccounts</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/AccountDetails/ForAllAccounts/IdentificationCode</leftOperand><rightOperand>General</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CorporateActionNotificationV04 obj) throws Exception {
			checkCorporateActionNotificationV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV05
	 * CorporateActionNotificationV05}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumNominalQuantity&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumExercisableQuantity&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumExercisableMultipleQuantity&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/ContractSize&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AccountDetails/ForAllAccounts&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/AccountDetails/ForAllAccounts/IdentificationCode&lt;/leftOperand&gt;&lt;rightOperand&gt;General&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccount1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AccountDetails/ForAllAccounts/IdentificationCode value is GENR then any element in the list (MinimumNominalQuantity, MinimumExercisableQuantity,MinimumExercisableMultipleQuantity, ContractSize) must not be present in any occurrences of CorporateActionOptionDetails/SecuritiesMovementDetails/SecurityDetails;\r\n(MT564 Rule C2 - part 1)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingAccount1Rule#forCorporateActionNotificationV06
	 * ConstraintSafekeepingAccount1Rule.forCorporateActionNotificationV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingAccount1Rule#forCorporateActionNotificationV04
	 * ConstraintSafekeepingAccount1Rule.forCorporateActionNotificationV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV05> forCorporateActionNotificationV05 = new MMConstraint<CorporateActionNotificationV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount1Rule";
			definition = "If AccountDetails/ForAllAccounts/IdentificationCode value is GENR then any element in the list (MinimumNominalQuantity, MinimumExercisableQuantity,MinimumExercisableMultipleQuantity, ContractSize) must not be present in any occurrences of CorporateActionOptionDetails/SecuritiesMovementDetails/SecurityDetails;\r\n(MT564 Rule C2 - part 1).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSafekeepingAccount1Rule.forCorporateActionNotificationV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSafekeepingAccount1Rule.forCorporateActionNotificationV04;
			owner_lazy = () -> CorporateActionNotificationV05.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumNominalQuantity</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumExercisableQuantity</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumExercisableMultipleQuantity</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/ContractSize</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AccountDetails/ForAllAccounts</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/AccountDetails/ForAllAccounts/IdentificationCode</leftOperand><rightOperand>General</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CorporateActionNotificationV05 obj) throws Exception {
			checkCorporateActionNotificationV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV05
	 * CorporateActionMovementPreliminaryAdviceV05}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumNominalQuantity&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumExercisableQuantity&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumExercisableQuantity&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/ContractSize&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AccountDetails/ForAllAccounts&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/AccountDetails/ForAllAccounts/IdentificationCode&lt;/leftOperand&gt;&lt;rightOperand&gt;General&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccount1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AccountDetails/ForAllAccounts/IdentificationCode value is GENR then any element in the list (MinimumNominalQuantity, MinimumExercisableQuantity,MinimumExercisableMultipleQuantity, ContractSize) must not be present in any occurrences of CorporateActionMovementDetails/SecuritiesMovementDetails/SecurityDetails;\r\n(MT564 Rule C2 - part 1)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingAccount1Rule#forCorporateActionMovementPreliminaryAdviceV06
	 * ConstraintSafekeepingAccount1Rule.
	 * forCorporateActionMovementPreliminaryAdviceV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingAccount1Rule#forCorporateActionMovementPreliminaryAdviceV04
	 * ConstraintSafekeepingAccount1Rule.
	 * forCorporateActionMovementPreliminaryAdviceV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementPreliminaryAdviceV05> forCorporateActionMovementPreliminaryAdviceV05 = new MMConstraint<CorporateActionMovementPreliminaryAdviceV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount1Rule";
			definition = "If AccountDetails/ForAllAccounts/IdentificationCode value is GENR then any element in the list (MinimumNominalQuantity, MinimumExercisableQuantity,MinimumExercisableMultipleQuantity, ContractSize) must not be present in any occurrences of CorporateActionMovementDetails/SecuritiesMovementDetails/SecurityDetails;\r\n(MT564 Rule C2 - part 1).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSafekeepingAccount1Rule.forCorporateActionMovementPreliminaryAdviceV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSafekeepingAccount1Rule.forCorporateActionMovementPreliminaryAdviceV04;
			owner_lazy = () -> CorporateActionMovementPreliminaryAdviceV05.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumNominalQuantity</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumExercisableQuantity</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumExercisableQuantity</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/ContractSize</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AccountDetails/ForAllAccounts</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/AccountDetails/ForAllAccounts/IdentificationCode</leftOperand><rightOperand>General</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CorporateActionMovementPreliminaryAdviceV05 obj) throws Exception {
			checkCorporateActionMovementPreliminaryAdviceV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV06
	 * CorporateActionMovementPreliminaryAdviceV06}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumNominalQuantity&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumExercisableQuantity&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumExercisableQuantity&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/ContractSize&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AccountDetails/ForAllAccounts&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/AccountDetails/ForAllAccounts/IdentificationCode&lt;/leftOperand&gt;&lt;rightOperand&gt;General&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccount1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AccountDetails/ForAllAccounts/IdentificationCode value is GENR then any element in the list (MinimumNominalQuantity, MinimumExercisableQuantity,MinimumExercisableMultipleQuantity, ContractSize) must not be present in any occurrences of CorporateActionMovementDetails/SecuritiesMovementDetails/SecurityDetails;\r\n(MT564 Rule C2 - part 1)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingAccount1Rule#forCorporateActionMovementPreliminaryAdviceV07
	 * ConstraintSafekeepingAccount1Rule.
	 * forCorporateActionMovementPreliminaryAdviceV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingAccount1Rule#forCorporateActionMovementPreliminaryAdviceV05
	 * ConstraintSafekeepingAccount1Rule.
	 * forCorporateActionMovementPreliminaryAdviceV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementPreliminaryAdviceV06> forCorporateActionMovementPreliminaryAdviceV06 = new MMConstraint<CorporateActionMovementPreliminaryAdviceV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount1Rule";
			definition = "If AccountDetails/ForAllAccounts/IdentificationCode value is GENR then any element in the list (MinimumNominalQuantity, MinimumExercisableQuantity,MinimumExercisableMultipleQuantity, ContractSize) must not be present in any occurrences of CorporateActionMovementDetails/SecuritiesMovementDetails/SecurityDetails;\r\n(MT564 Rule C2 - part 1).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSafekeepingAccount1Rule.forCorporateActionMovementPreliminaryAdviceV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSafekeepingAccount1Rule.forCorporateActionMovementPreliminaryAdviceV05;
			owner_lazy = () -> CorporateActionMovementPreliminaryAdviceV06.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumNominalQuantity</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumExercisableQuantity</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumExercisableQuantity</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/ContractSize</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AccountDetails/ForAllAccounts</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/AccountDetails/ForAllAccounts/IdentificationCode</leftOperand><rightOperand>General</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CorporateActionMovementPreliminaryAdviceV06 obj) throws Exception {
			checkCorporateActionMovementPreliminaryAdviceV06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07
	 * CorporateActionMovementPreliminaryAdviceV07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumNominalQuantity&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumQuantityToInstruct&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumMultipleQuantityToInstruct&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/ContractSize&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AccountDetails/ForAllAccounts&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/AccountDetails/ForAllAccounts/IdentificationCode&lt;/leftOperand&gt;&lt;rightOperand&gt;General&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccount1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AccountDetails/ForAllAccounts/IdentificationCode value is GENR (General), then any element in the list (MinimumNominalQuantity, MinimumExercisableQuantity,MinimumExercisableMultipleQuantity, ContractSize) must not be present in any occurrences of CorporateActionMovementDetails/SecuritiesMovementDetails/SecurityDetails;\r\n(MT564 Rule C2 - part 1)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingAccount1Rule#forCorporateActionMovementPreliminaryAdviceV08
	 * ConstraintSafekeepingAccount1Rule.
	 * forCorporateActionMovementPreliminaryAdviceV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingAccount1Rule#forCorporateActionMovementPreliminaryAdviceV06
	 * ConstraintSafekeepingAccount1Rule.
	 * forCorporateActionMovementPreliminaryAdviceV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementPreliminaryAdviceV07> forCorporateActionMovementPreliminaryAdviceV07 = new MMConstraint<CorporateActionMovementPreliminaryAdviceV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount1Rule";
			definition = "If AccountDetails/ForAllAccounts/IdentificationCode value is GENR (General), then any element in the list (MinimumNominalQuantity, MinimumExercisableQuantity,MinimumExercisableMultipleQuantity, ContractSize) must not be present in any occurrences of CorporateActionMovementDetails/SecuritiesMovementDetails/SecurityDetails;\r\n(MT564 Rule C2 - part 1).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSafekeepingAccount1Rule.forCorporateActionMovementPreliminaryAdviceV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSafekeepingAccount1Rule.forCorporateActionMovementPreliminaryAdviceV06;
			owner_lazy = () -> CorporateActionMovementPreliminaryAdviceV07.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumNominalQuantity</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumQuantityToInstruct</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumMultipleQuantityToInstruct</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/ContractSize</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AccountDetails/ForAllAccounts</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/AccountDetails/ForAllAccounts/IdentificationCode</leftOperand><rightOperand>General</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CorporateActionMovementPreliminaryAdviceV07 obj) throws Exception {
			checkCorporateActionMovementPreliminaryAdviceV07(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV06
	 * CorporateActionNotificationV06}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumNominalQuantity&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumQuantityToInstruct&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumMultipleQuantityToInstruct&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/ContractSize&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AccountDetails/ForAllAccounts&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/AccountDetails/ForAllAccounts/IdentificationCode&lt;/leftOperand&gt;&lt;rightOperand&gt;General&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccount1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AccountDetails/ForAllAccounts/IdentificationCode value is GENR (General) then any element in the list (MinimumNominalQuantity, MinimumExercisableQuantity,MinimumExercisableMultipleQuantity, ContractSize) must not be present in any occurrences of CorporateActionOptionDetails/SecuritiesMovementDetails/SecurityDetails;\r\n(MT564 Rule C2 - part 1)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingAccount1Rule#forCorporateActionNotificationV07
	 * ConstraintSafekeepingAccount1Rule.forCorporateActionNotificationV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingAccount1Rule#forCorporateActionNotificationV05
	 * ConstraintSafekeepingAccount1Rule.forCorporateActionNotificationV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV06> forCorporateActionNotificationV06 = new MMConstraint<CorporateActionNotificationV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount1Rule";
			definition = "If AccountDetails/ForAllAccounts/IdentificationCode value is GENR (General) then any element in the list (MinimumNominalQuantity, MinimumExercisableQuantity,MinimumExercisableMultipleQuantity, ContractSize) must not be present in any occurrences of CorporateActionOptionDetails/SecuritiesMovementDetails/SecurityDetails;\r\n(MT564 Rule C2 - part 1).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSafekeepingAccount1Rule.forCorporateActionNotificationV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSafekeepingAccount1Rule.forCorporateActionNotificationV05;
			owner_lazy = () -> CorporateActionNotificationV06.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumNominalQuantity</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumQuantityToInstruct</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumMultipleQuantityToInstruct</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/ContractSize</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AccountDetails/ForAllAccounts</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/AccountDetails/ForAllAccounts/IdentificationCode</leftOperand><rightOperand>General</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CorporateActionNotificationV06 obj) throws Exception {
			checkCorporateActionNotificationV06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V06
	 * CorporateActionNotification002V06}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumNominalQuantity&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumQuantityToInstruct&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumMultipleQuantityToInstruct&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/ContractSize&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AccountDetails/ForAllAccounts&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/AccountDetails/ForAllAccounts/IdentificationCode&lt;/leftOperand&gt;&lt;rightOperand&gt;General&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccount1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AccountDetails/ForAllAccounts/IdentificationCode value is GENR (General) then any element in the list (MinimumNominalQuantity, MinimumExercisableQuantity,MinimumExercisableMultipleQuantity, ContractSize) must not be present in any occurrences of CorporateActionOptionDetails/SecuritiesMovementDetails/SecurityDetails;\r\n(MT564 Rule C2 - part 1)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotification002V06> forCorporateActionNotification002V06 = new MMConstraint<CorporateActionNotification002V06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount1Rule";
			definition = "If AccountDetails/ForAllAccounts/IdentificationCode value is GENR (General) then any element in the list (MinimumNominalQuantity, MinimumExercisableQuantity,MinimumExercisableMultipleQuantity, ContractSize) must not be present in any occurrences of CorporateActionOptionDetails/SecuritiesMovementDetails/SecurityDetails;\r\n(MT564 Rule C2 - part 1).";
			owner_lazy = () -> CorporateActionNotification002V06.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumNominalQuantity</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumQuantityToInstruct</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumMultipleQuantityToInstruct</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionOptionDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/ContractSize</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AccountDetails/ForAllAccounts</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/AccountDetails/ForAllAccounts/IdentificationCode</leftOperand><rightOperand>General</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CorporateActionNotification002V06 obj) throws Exception {
			checkCorporateActionNotification002V06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdvice002V07
	 * CorporateActionMovementPreliminaryAdvice002V07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumNominalQuantity&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumQuantityToInstruct&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumMultipleQuantityToInstruct&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/ContractSize&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AccountDetails/ForAllAccounts&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/AccountDetails/ForAllAccounts/IdentificationCode&lt;/leftOperand&gt;&lt;rightOperand&gt;General&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccount1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AccountDetails/ForAllAccounts/IdentificationCode value is GENR (General), then any element in the list (MinimumNominalQuantity, MinimumExercisableQuantity,MinimumExercisableMultipleQuantity, ContractSize) must not be present in any occurrences of CorporateActionMovementDetails/SecuritiesMovementDetails/SecurityDetails;\r\n(MT564 Rule C2 - part 1)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementPreliminaryAdvice002V07> forCorporateActionMovementPreliminaryAdvice002V07 = new MMConstraint<CorporateActionMovementPreliminaryAdvice002V07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount1Rule";
			definition = "If AccountDetails/ForAllAccounts/IdentificationCode value is GENR (General), then any element in the list (MinimumNominalQuantity, MinimumExercisableQuantity,MinimumExercisableMultipleQuantity, ContractSize) must not be present in any occurrences of CorporateActionMovementDetails/SecuritiesMovementDetails/SecurityDetails;\r\n(MT564 Rule C2 - part 1).";
			owner_lazy = () -> CorporateActionMovementPreliminaryAdvice002V07.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumNominalQuantity</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumQuantityToInstruct</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/MinimumMultipleQuantityToInstruct</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/CorporateActionMovementDetails[*]/SecuritiesMovementDetails[*]/SecurityDetails/ContractSize</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AccountDetails/ForAllAccounts</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/AccountDetails/ForAllAccounts/IdentificationCode</leftOperand><rightOperand>General</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CorporateActionMovementPreliminaryAdvice002V07 obj) throws Exception {
			checkCorporateActionMovementPreliminaryAdvice002V07(obj);
		}
	};

	/**
	 * If AccountDetails/ForAllAccounts/IdentificationCode value is GENR
	 * (General) then any element in the list (MinimumNominalQuantity,
	 * MinimumExercisableQuantity,MinimumExercisableMultipleQuantity,
	 * ContractSize) must not be present in any occurrences of
	 * CorporateActionOptionDetails/SecuritiesMovementDetails/SecurityDetails;<br>
	 * (MT564 Rule C2 - part 1).
	 */
	public static void checkCorporateActionNotificationV08(CorporateActionNotificationV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AccountDetails/ForAllAccounts/IdentificationCode value is GENR
	 * (General), then any element in the list (MinimumNominalQuantity,
	 * MinimumExercisableQuantity,MinimumExercisableMultipleQuantity,
	 * ContractSize) must not be present in any occurrences of
	 * CorporateActionMovementDetails/SecuritiesMovementDetails/SecurityDetails;<br>
	 * (MT564 Rule C2 - part 1).
	 */
	public static void checkCorporateActionMovementPreliminaryAdviceV09(CorporateActionMovementPreliminaryAdviceV09 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AccountDetails/ForAllAccounts/IdentificationCode value is GENR
	 * (General), then any element in the list (MinimumNominalQuantity,
	 * MinimumExercisableQuantity,MinimumExercisableMultipleQuantity,
	 * ContractSize) must not be present in any occurrences of
	 * CorporateActionMovementDetails/SecuritiesMovementDetails/SecurityDetails;<br>
	 * (MT564 Rule C2 - part 1).
	 */
	public static void checkCorporateActionMovementPreliminaryAdvice002V09(CorporateActionMovementPreliminaryAdvice002V09 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AccountDetails/ForAllAccounts/IdentificationCode value is GENR
	 * (General) then any element in the list (MinimumNominalQuantity,
	 * MinimumExercisableQuantity,MinimumExercisableMultipleQuantity,
	 * ContractSize) must not be present in any occurrences of
	 * CorporateActionOptionDetails/SecuritiesMovementDetails/SecurityDetails;<br>
	 * (MT564 Rule C2 - part 1).
	 */
	public static void checkCorporateActionNotification002V08(CorporateActionNotification002V08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AccountDetails/ForAllAccounts/IdentificationCode value is GENR
	 * (General) then any element in the list (MinimumNominalQuantity,
	 * MinimumExercisableQuantity,MinimumExercisableMultipleQuantity,
	 * ContractSize) must not be present in any occurrences of
	 * CorporateActionOptionDetails/SecuritiesMovementDetails/SecurityDetails;<br>
	 * (MT564 Rule C2 - part 1).
	 */
	public static void checkCorporateActionNotificationV07(CorporateActionNotificationV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AccountDetails/ForAllAccounts/IdentificationCode value is GENR
	 * (General), then any element in the list (MinimumNominalQuantity,
	 * MinimumExercisableQuantity,MinimumExercisableMultipleQuantity,
	 * ContractSize) must not be present in any occurrences of
	 * CorporateActionMovementDetails/SecuritiesMovementDetails/SecurityDetails;<br>
	 * (MT564 Rule C2 - part 1).
	 */
	public static void checkCorporateActionMovementPreliminaryAdviceV08(CorporateActionMovementPreliminaryAdviceV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AccountDetails/ForAllAccounts/IdentificationCode value is GENR then
	 * any element in the list (MinimumNominalQuantity,
	 * MinimumExercisableQuantity,MinimumExercisableMultipleQuantity,
	 * ContractSize) must not be present in any occurrences of
	 * CorporateActionMovementDetails/SecuritiesMovementDetails/SecurityDetails;<br>
	 * (MT564 Rule C2 - part 1).
	 */
	public static void checkCorporateActionMovementPreliminaryAdviceV01(CorporateActionMovementPreliminaryAdviceV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AccountDetails/ForAllAccounts/IdentificationCode value is GENR then
	 * any element in the list (MinimumNominalQuantity,
	 * MinimumExercisableQuantity,MinimumExercisableMultipleQuantity,
	 * ContractSize) must not be present in any occurrences of
	 * CorporateActionMovementDetails/SecuritiesMovementDetails/SecurityDetails;<br>
	 * (MT564 Rule C2 - part 1).
	 */
	public static void checkCorporateActionMovementPreliminaryAdviceV02(CorporateActionMovementPreliminaryAdviceV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AccountDetails/ForAllAccounts/IdentificationCode value is GENR then
	 * any element in the list (MinimumNominalQuantity,
	 * MinimumExercisableQuantity,MinimumExercisableMultipleQuantity,
	 * ContractSize) must not be present in any occurrences of
	 * CorporateActionMovementDetails/SecuritiesMovementDetails/SecurityDetails;<br>
	 * (MT564 Rule C2 - part 1).
	 */
	public static void checkCorporateActionMovementPreliminaryAdviceV03(CorporateActionMovementPreliminaryAdviceV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AccountDetails/ForAllAccounts/IdentificationCode value is GENR then
	 * any element in the list (MinimumNominalQuantity,
	 * MinimumExercisableQuantity,MinimumExercisableMultipleQuantity,
	 * ContractSize) must not be present in any occurrences of
	 * CorporateActionMovementDetails/SecuritiesMovementDetails/SecurityDetails;<br>
	 * (MT564 Rule C2 - part 1).
	 */
	public static void checkCorporateActionMovementPreliminaryAdviceV04(CorporateActionMovementPreliminaryAdviceV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AccountDetails/ForAllAccounts/IdentificationCode value is GENR then
	 * any element in the list (MinimumNominalQuantity,
	 * MinimumExercisableQuantity,MinimumExercisableMultipleQuantity,
	 * ContractSize) must not be present in any occurrences of
	 * CorporateActionOptionDetails/SecuritiesMovementDetails/SecurityDetails;<br>
	 * (MT564 Rule C2 - part 1).
	 */
	public static void checkCorporateActionNotificationV01(CorporateActionNotificationV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AccountDetails/ForAllAccounts/IdentificationCode value is GENR then
	 * any element in the list (MinimumNominalQuantity,
	 * MinimumExercisableQuantity,MinimumExercisableMultipleQuantity,
	 * ContractSize) must not be present in any occurrences of
	 * CorporateActionOptionDetails/SecuritiesMovementDetails/SecurityDetails;<br>
	 * (MT564 Rule C2 - part 1).
	 */
	public static void checkCorporateActionNotificationV02(CorporateActionNotificationV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AccountDetails/ForAllAccounts/IdentificationCode value is GENR then
	 * any element in the list (MinimumNominalQuantity,
	 * MinimumExercisableQuantity,MinimumExercisableMultipleQuantity,
	 * ContractSize) must not be present in any occurrences of
	 * CorporateActionOptionDetails/SecuritiesMovementDetails/SecurityDetails;<br>
	 * (MT564 Rule C2 - part 1).
	 */
	public static void checkCorporateActionNotificationV03(CorporateActionNotificationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AccountDetails/ForAllAccounts/IdentificationCode value is GENR then
	 * any element in the list (MinimumNominalQuantity,
	 * MinimumExercisableQuantity,MinimumExercisableMultipleQuantity,
	 * ContractSize) must not be present in any occurrences of
	 * CorporateActionOptionDetails/SecuritiesMovementDetails/SecurityDetails;<br>
	 * (MT564 Rule C2 - part 1).
	 */
	public static void checkCorporateActionNotificationV04(CorporateActionNotificationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AccountDetails/ForAllAccounts/IdentificationCode value is GENR then
	 * any element in the list (MinimumNominalQuantity,
	 * MinimumExercisableQuantity,MinimumExercisableMultipleQuantity,
	 * ContractSize) must not be present in any occurrences of
	 * CorporateActionOptionDetails/SecuritiesMovementDetails/SecurityDetails;<br>
	 * (MT564 Rule C2 - part 1).
	 */
	public static void checkCorporateActionNotificationV05(CorporateActionNotificationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AccountDetails/ForAllAccounts/IdentificationCode value is GENR then
	 * any element in the list (MinimumNominalQuantity,
	 * MinimumExercisableQuantity,MinimumExercisableMultipleQuantity,
	 * ContractSize) must not be present in any occurrences of
	 * CorporateActionMovementDetails/SecuritiesMovementDetails/SecurityDetails;<br>
	 * (MT564 Rule C2 - part 1).
	 */
	public static void checkCorporateActionMovementPreliminaryAdviceV05(CorporateActionMovementPreliminaryAdviceV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AccountDetails/ForAllAccounts/IdentificationCode value is GENR then
	 * any element in the list (MinimumNominalQuantity,
	 * MinimumExercisableQuantity,MinimumExercisableMultipleQuantity,
	 * ContractSize) must not be present in any occurrences of
	 * CorporateActionMovementDetails/SecuritiesMovementDetails/SecurityDetails;<br>
	 * (MT564 Rule C2 - part 1).
	 */
	public static void checkCorporateActionMovementPreliminaryAdviceV06(CorporateActionMovementPreliminaryAdviceV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AccountDetails/ForAllAccounts/IdentificationCode value is GENR
	 * (General), then any element in the list (MinimumNominalQuantity,
	 * MinimumExercisableQuantity,MinimumExercisableMultipleQuantity,
	 * ContractSize) must not be present in any occurrences of
	 * CorporateActionMovementDetails/SecuritiesMovementDetails/SecurityDetails;<br>
	 * (MT564 Rule C2 - part 1).
	 */
	public static void checkCorporateActionMovementPreliminaryAdviceV07(CorporateActionMovementPreliminaryAdviceV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AccountDetails/ForAllAccounts/IdentificationCode value is GENR
	 * (General) then any element in the list (MinimumNominalQuantity,
	 * MinimumExercisableQuantity,MinimumExercisableMultipleQuantity,
	 * ContractSize) must not be present in any occurrences of
	 * CorporateActionOptionDetails/SecuritiesMovementDetails/SecurityDetails;<br>
	 * (MT564 Rule C2 - part 1).
	 */
	public static void checkCorporateActionNotificationV06(CorporateActionNotificationV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AccountDetails/ForAllAccounts/IdentificationCode value is GENR
	 * (General) then any element in the list (MinimumNominalQuantity,
	 * MinimumExercisableQuantity,MinimumExercisableMultipleQuantity,
	 * ContractSize) must not be present in any occurrences of
	 * CorporateActionOptionDetails/SecuritiesMovementDetails/SecurityDetails;<br>
	 * (MT564 Rule C2 - part 1).
	 */
	public static void checkCorporateActionNotification002V06(CorporateActionNotification002V06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AccountDetails/ForAllAccounts/IdentificationCode value is GENR
	 * (General), then any element in the list (MinimumNominalQuantity,
	 * MinimumExercisableQuantity,MinimumExercisableMultipleQuantity,
	 * ContractSize) must not be present in any occurrences of
	 * CorporateActionMovementDetails/SecuritiesMovementDetails/SecurityDetails;<br>
	 * (MT564 Rule C2 - part 1).
	 */
	public static void checkCorporateActionMovementPreliminaryAdvice002V07(CorporateActionMovementPreliminaryAdvice002V07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}