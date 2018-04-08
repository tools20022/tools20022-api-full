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
import com.tools20022.repository.msg.*;
import java.util.Arrays;

/**
 * The DeclaredRate may only be used if the dividend or interest declared by the
 * issuer is actually paid in a different currency than the declared one.
 */
public class ConstraintDeclaredRateRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate43
	 * CorporateActionRate43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclaredRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The DeclaredRate may only be used if the dividend or interest declared by the issuer is actually paid in a different currency than the declared one."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDeclaredRateRule#forCorporateActionRate66
	 * ConstraintDeclaredRateRule.forCorporateActionRate66}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDeclaredRateRule#forCorporateActionRate35
	 * ConstraintDeclaredRateRule.forCorporateActionRate35}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate43> forCorporateActionRate43 = new MMConstraint<CorporateActionRate43>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclaredRateRule";
			definition = "The DeclaredRate may only be used if the dividend or interest declared by the issuer is actually paid in a different currency than the declared one.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDeclaredRateRule.forCorporateActionRate66);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDeclaredRateRule.forCorporateActionRate35;
			owner_lazy = () -> CorporateActionRate43.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate43 obj) throws Exception {
			checkCorporateActionRate43(obj);
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
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionDetails/RateAndAmountDetails/DeclaredRate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]/RateAndAmountDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]/RateAndAmountDetails/IssuerDeclaredExchangeRate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclaredRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionOptionDetails/RateAndAmountDetails/IssuerDeclaredExchangeRate is present, then CorporateActionDetails/RateAndAmountDetails/DeclaredRate must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotification002V06> for_seev_CorporateActionNotification002V06 = new MMConstraint<CorporateActionNotification002V06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclaredRateRule";
			definition = "If CorporateActionOptionDetails/RateAndAmountDetails/IssuerDeclaredExchangeRate is present, then CorporateActionDetails/RateAndAmountDetails/DeclaredRate must be present.";
			owner_lazy = () -> CorporateActionNotification002V06.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionDetails/RateAndAmountDetails/DeclaredRate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionOptionDetails[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionOptionDetails[*]/RateAndAmountDetails</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionOptionDetails[*]/RateAndAmountDetails/IssuerDeclaredExchangeRate</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CorporateActionNotification002V06 obj) throws Exception {
			check_seev_CorporateActionNotification002V06(obj);
		}
	};
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
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionDetails/RateAndAmountDetails/DeclaredRate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]/RateAndAmountDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]/RateAndAmountDetails/IssuerDeclaredExchangeRate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclaredRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionOptionDetails/RateAndAmountDetails/IssuerDeclaredExchangeRate is present, then CorporateActionDetails/RateAndAmountDetails/DeclaredRate must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDeclaredRateRule#for_seev_CorporateActionNotificationV07
	 * ConstraintDeclaredRateRule.for_seev_CorporateActionNotificationV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV08> for_seev_CorporateActionNotificationV08 = new MMConstraint<CorporateActionNotificationV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclaredRateRule";
			definition = "If CorporateActionOptionDetails/RateAndAmountDetails/IssuerDeclaredExchangeRate is present, then CorporateActionDetails/RateAndAmountDetails/DeclaredRate must be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDeclaredRateRule.for_seev_CorporateActionNotificationV07;
			owner_lazy = () -> CorporateActionNotificationV08.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionDetails/RateAndAmountDetails/DeclaredRate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionOptionDetails[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionOptionDetails[*]/RateAndAmountDetails</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionOptionDetails[*]/RateAndAmountDetails/IssuerDeclaredExchangeRate</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CorporateActionNotificationV08 obj) throws Exception {
			check_seev_CorporateActionNotificationV08(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate91
	 * CorporateActionRate91}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclaredRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "DeclaredRate may only be used if the dividend or interest declared by the issuer is actually paid in a different currency than the declared one or if the dividend or the interest event makes it possible to elect amongst multiple currency options."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDeclaredRateRule#forCorporateActionRate66
	 * ConstraintDeclaredRateRule.forCorporateActionRate66}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate91> forCorporateActionRate91 = new MMConstraint<CorporateActionRate91>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclaredRateRule";
			definition = "DeclaredRate may only be used if the dividend or interest declared by the issuer is actually paid in a different currency than the declared one or if the dividend or the interest event makes it possible to elect amongst multiple currency options.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDeclaredRateRule.forCorporateActionRate66;
			owner_lazy = () -> CorporateActionRate91.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate91 obj) throws Exception {
			checkCorporateActionRate91(obj);
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
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionDetails/RateAndAmountDetails/DeclaredRate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]/RateAndAmountDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]/RateAndAmountDetails/IssuerDeclaredExchangeRate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclaredRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionOptionDetails/RateAndAmountDetails/IssuerDeclaredExchangeRate is present, then CorporateActionDetails/RateAndAmountDetails/DeclaredRate must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDeclaredRateRule#for_seev_CorporateActionNotificationV07
	 * ConstraintDeclaredRateRule.for_seev_CorporateActionNotificationV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDeclaredRateRule#for_seev_CorporateActionNotificationV05
	 * ConstraintDeclaredRateRule.for_seev_CorporateActionNotificationV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV06> for_seev_CorporateActionNotificationV06 = new MMConstraint<CorporateActionNotificationV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclaredRateRule";
			definition = "If CorporateActionOptionDetails/RateAndAmountDetails/IssuerDeclaredExchangeRate is present, then CorporateActionDetails/RateAndAmountDetails/DeclaredRate must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDeclaredRateRule.for_seev_CorporateActionNotificationV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDeclaredRateRule.for_seev_CorporateActionNotificationV05;
			owner_lazy = () -> CorporateActionNotificationV06.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionDetails/RateAndAmountDetails/DeclaredRate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionOptionDetails[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionOptionDetails[*]/RateAndAmountDetails</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionOptionDetails[*]/RateAndAmountDetails/IssuerDeclaredExchangeRate</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CorporateActionNotificationV06 obj) throws Exception {
			check_seev_CorporateActionNotificationV06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate41
	 * CorporateActionRate41}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclaredRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The DeclaredRate may only be used if the dividend or interest declared by the issuer is actually paid in a different currency than the declared one."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate41> forCorporateActionRate41 = new MMConstraint<CorporateActionRate41>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclaredRateRule";
			definition = "The DeclaredRate may only be used if the dividend or interest declared by the issuer is actually paid in a different currency than the declared one.";
			owner_lazy = () -> CorporateActionRate41.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate41 obj) throws Exception {
			checkCorporateActionRate41(obj);
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
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionDetails/RateAndAmountDetails/DeclaredRate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]/RateAndAmountDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]/RateAndAmountDetails/IssuerDeclaredExchangeRate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclaredRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionOptionDetails/RateAndAmountDetails/IssuerDeclaredExchangeRate is present, then CorporateActionDetails/RateAndAmountDetails/DeclaredRate must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDeclaredRateRule#for_seev_CorporateActionNotificationV08
	 * ConstraintDeclaredRateRule.for_seev_CorporateActionNotificationV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDeclaredRateRule#for_seev_CorporateActionNotificationV06
	 * ConstraintDeclaredRateRule.for_seev_CorporateActionNotificationV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV07> for_seev_CorporateActionNotificationV07 = new MMConstraint<CorporateActionNotificationV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclaredRateRule";
			definition = "If CorporateActionOptionDetails/RateAndAmountDetails/IssuerDeclaredExchangeRate is present, then CorporateActionDetails/RateAndAmountDetails/DeclaredRate must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDeclaredRateRule.for_seev_CorporateActionNotificationV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDeclaredRateRule.for_seev_CorporateActionNotificationV06;
			owner_lazy = () -> CorporateActionNotificationV07.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionDetails/RateAndAmountDetails/DeclaredRate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionOptionDetails[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionOptionDetails[*]/RateAndAmountDetails</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionOptionDetails[*]/RateAndAmountDetails/IssuerDeclaredExchangeRate</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CorporateActionNotificationV07 obj) throws Exception {
			check_seev_CorporateActionNotificationV07(obj);
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
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionDetails/RateAndAmountDetails/DeclaredRate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]/RateAndAmountDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]/RateAndAmountDetails/IssuerDeclaredExchangeRate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclaredRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionOptionDetails/RateAndAmountDetails/IssuerDeclaredExchangeRate is present, then CorporateActionDetails/RateAndAmountDetails/DeclaredRate must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDeclaredRateRule#for_seev_CorporateActionNotificationV06
	 * ConstraintDeclaredRateRule.for_seev_CorporateActionNotificationV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDeclaredRateRule#for_seev_CorporateActionNotificationV04
	 * ConstraintDeclaredRateRule.for_seev_CorporateActionNotificationV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV05> for_seev_CorporateActionNotificationV05 = new MMConstraint<CorporateActionNotificationV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclaredRateRule";
			definition = "If CorporateActionOptionDetails/RateAndAmountDetails/IssuerDeclaredExchangeRate is present, then CorporateActionDetails/RateAndAmountDetails/DeclaredRate must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDeclaredRateRule.for_seev_CorporateActionNotificationV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDeclaredRateRule.for_seev_CorporateActionNotificationV04;
			owner_lazy = () -> CorporateActionNotificationV05.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionDetails/RateAndAmountDetails/DeclaredRate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionOptionDetails[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionOptionDetails[*]/RateAndAmountDetails</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionOptionDetails[*]/RateAndAmountDetails/IssuerDeclaredExchangeRate</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CorporateActionNotificationV05 obj) throws Exception {
			check_seev_CorporateActionNotificationV05(obj);
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
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionDetails/RateAndAmountDetails/DeclaredRate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]/RateAndAmountDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]/RateAndAmountDetails/IssuerDeclaredExchangeRate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclaredRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionOptionDetails/RateAndAmountDetails/IssuerDeclaredExchangeRate is present, then CorporateActionDetails/RateAndAmountDetails/DeclaredRate must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotification002V08> for_seev_CorporateActionNotification002V08 = new MMConstraint<CorporateActionNotification002V08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclaredRateRule";
			definition = "If CorporateActionOptionDetails/RateAndAmountDetails/IssuerDeclaredExchangeRate is present, then CorporateActionDetails/RateAndAmountDetails/DeclaredRate must be present.";
			owner_lazy = () -> CorporateActionNotification002V08.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionDetails/RateAndAmountDetails/DeclaredRate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionOptionDetails[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionOptionDetails[*]/RateAndAmountDetails</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionOptionDetails[*]/RateAndAmountDetails/IssuerDeclaredExchangeRate</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CorporateActionNotification002V08 obj) throws Exception {
			check_seev_CorporateActionNotification002V08(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate66
	 * CorporateActionRate66}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclaredRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The DeclaredRate may only be used if the dividend or interest declared by the issuer is actually paid in a different currency than the declared one."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDeclaredRateRule#forCorporateActionRate91
	 * ConstraintDeclaredRateRule.forCorporateActionRate91}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDeclaredRateRule#forCorporateActionRate43
	 * ConstraintDeclaredRateRule.forCorporateActionRate43}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate66> forCorporateActionRate66 = new MMConstraint<CorporateActionRate66>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclaredRateRule";
			definition = "The DeclaredRate may only be used if the dividend or interest declared by the issuer is actually paid in a different currency than the declared one.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDeclaredRateRule.forCorporateActionRate91);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDeclaredRateRule.forCorporateActionRate43;
			owner_lazy = () -> CorporateActionRate66.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate66 obj) throws Exception {
			checkCorporateActionRate66(obj);
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
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionDetails/RateAndAmountDetails/DeclaredRate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]/RateAndAmountDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionOptionDetails[*]/RateAndAmountDetails/IssuerDeclaredExchangeRate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclaredRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionOptionDetails/RateAndAmountDetails/IssuerDeclaredExchangeRate is present, then CorporateActionDetails/RateAndAmountDetails/DeclaredRate must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDeclaredRateRule#for_seev_CorporateActionNotificationV05
	 * ConstraintDeclaredRateRule.for_seev_CorporateActionNotificationV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV04> for_seev_CorporateActionNotificationV04 = new MMConstraint<CorporateActionNotificationV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclaredRateRule";
			definition = "If CorporateActionOptionDetails/RateAndAmountDetails/IssuerDeclaredExchangeRate is present, then CorporateActionDetails/RateAndAmountDetails/DeclaredRate must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDeclaredRateRule.for_seev_CorporateActionNotificationV05);
			owner_lazy = () -> CorporateActionNotificationV04.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionDetails/RateAndAmountDetails/DeclaredRate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionOptionDetails[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionOptionDetails[*]/RateAndAmountDetails</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionOptionDetails[*]/RateAndAmountDetails/IssuerDeclaredExchangeRate</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CorporateActionNotificationV04 obj) throws Exception {
			check_seev_CorporateActionNotificationV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate78
	 * CorporateActionRate78}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclaredRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The DeclaredRate may only be used if the dividend or interest declared by the issuer is actually paid in a different currency than the declared one."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate78> forCorporateActionRate78 = new MMConstraint<CorporateActionRate78>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclaredRateRule";
			definition = "The DeclaredRate may only be used if the dividend or interest declared by the issuer is actually paid in a different currency than the declared one.";
			owner_lazy = () -> CorporateActionRate78.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate78 obj) throws Exception {
			checkCorporateActionRate78(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate35
	 * CorporateActionRate35}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclaredRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The DeclaredRate may only be used if the dividend or interest declared by the issuer is actually paid in a different currency than the declared one."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDeclaredRateRule#forCorporateActionRate43
	 * ConstraintDeclaredRateRule.forCorporateActionRate43}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate35> forCorporateActionRate35 = new MMConstraint<CorporateActionRate35>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclaredRateRule";
			definition = "The DeclaredRate may only be used if the dividend or interest declared by the issuer is actually paid in a different currency than the declared one.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDeclaredRateRule.forCorporateActionRate43);
			owner_lazy = () -> CorporateActionRate35.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate35 obj) throws Exception {
			checkCorporateActionRate35(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate56
	 * CorporateActionRate56}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclaredRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The DeclaredRate may only be used if the dividend or interest declared by the issuer is actually paid in a different currency than the declared one."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate56> forCorporateActionRate56 = new MMConstraint<CorporateActionRate56>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclaredRateRule";
			definition = "The DeclaredRate may only be used if the dividend or interest declared by the issuer is actually paid in a different currency than the declared one.";
			owner_lazy = () -> CorporateActionRate56.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate56 obj) throws Exception {
			checkCorporateActionRate56(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate96
	 * CorporateActionRate96}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclaredRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "DeclaredRate may only be used if the dividend or interest declared by the issuer is actually paid in a different currency than the declared one or if the dividend or the interest event makes it possible to elect amongst multiple currency options."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate96> forCorporateActionRate96 = new MMConstraint<CorporateActionRate96>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclaredRateRule";
			definition = "DeclaredRate may only be used if the dividend or interest declared by the issuer is actually paid in a different currency than the declared one or if the dividend or the interest event makes it possible to elect amongst multiple currency options.";
			owner_lazy = () -> CorporateActionRate96.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate96 obj) throws Exception {
			checkCorporateActionRate96(obj);
		}
	};

	/**
	 * The DeclaredRate may only be used if the dividend or interest declared by
	 * the issuer is actually paid in a different currency than the declared
	 * one.
	 */
	public static void checkCorporateActionRate43(CorporateActionRate43 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionOptionDetails/RateAndAmountDetails/
	 * IssuerDeclaredExchangeRate is present, then
	 * CorporateActionDetails/RateAndAmountDetails/DeclaredRate must be present.
	 */
	public static void check_seev_CorporateActionNotification002V06(CorporateActionNotification002V06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionOptionDetails/RateAndAmountDetails/
	 * IssuerDeclaredExchangeRate is present, then
	 * CorporateActionDetails/RateAndAmountDetails/DeclaredRate must be present.
	 */
	public static void check_seev_CorporateActionNotificationV08(CorporateActionNotificationV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * DeclaredRate may only be used if the dividend or interest declared by the
	 * issuer is actually paid in a different currency than the declared one or
	 * if the dividend or the interest event makes it possible to elect amongst
	 * multiple currency options.
	 */
	public static void checkCorporateActionRate91(CorporateActionRate91 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionOptionDetails/RateAndAmountDetails/
	 * IssuerDeclaredExchangeRate is present, then
	 * CorporateActionDetails/RateAndAmountDetails/DeclaredRate must be present.
	 */
	public static void check_seev_CorporateActionNotificationV06(CorporateActionNotificationV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The DeclaredRate may only be used if the dividend or interest declared by
	 * the issuer is actually paid in a different currency than the declared
	 * one.
	 */
	public static void checkCorporateActionRate41(CorporateActionRate41 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionOptionDetails/RateAndAmountDetails/
	 * IssuerDeclaredExchangeRate is present, then
	 * CorporateActionDetails/RateAndAmountDetails/DeclaredRate must be present.
	 */
	public static void check_seev_CorporateActionNotificationV07(CorporateActionNotificationV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionOptionDetails/RateAndAmountDetails/
	 * IssuerDeclaredExchangeRate is present, then
	 * CorporateActionDetails/RateAndAmountDetails/DeclaredRate must be present.
	 */
	public static void check_seev_CorporateActionNotificationV05(CorporateActionNotificationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionOptionDetails/RateAndAmountDetails/
	 * IssuerDeclaredExchangeRate is present, then
	 * CorporateActionDetails/RateAndAmountDetails/DeclaredRate must be present.
	 */
	public static void check_seev_CorporateActionNotification002V08(CorporateActionNotification002V08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The DeclaredRate may only be used if the dividend or interest declared by
	 * the issuer is actually paid in a different currency than the declared
	 * one.
	 */
	public static void checkCorporateActionRate66(CorporateActionRate66 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionOptionDetails/RateAndAmountDetails/
	 * IssuerDeclaredExchangeRate is present, then
	 * CorporateActionDetails/RateAndAmountDetails/DeclaredRate must be present.
	 */
	public static void check_seev_CorporateActionNotificationV04(CorporateActionNotificationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The DeclaredRate may only be used if the dividend or interest declared by
	 * the issuer is actually paid in a different currency than the declared
	 * one.
	 */
	public static void checkCorporateActionRate78(CorporateActionRate78 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The DeclaredRate may only be used if the dividend or interest declared by
	 * the issuer is actually paid in a different currency than the declared
	 * one.
	 */
	public static void checkCorporateActionRate35(CorporateActionRate35 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The DeclaredRate may only be used if the dividend or interest declared by
	 * the issuer is actually paid in a different currency than the declared
	 * one.
	 */
	public static void checkCorporateActionRate56(CorporateActionRate56 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * DeclaredRate may only be used if the dividend or interest declared by the
	 * issuer is actually paid in a different currency than the declared one or
	 * if the dividend or the interest event makes it possible to elect amongst
	 * multiple currency options.
	 */
	public static void checkCorporateActionRate96(CorporateActionRate96 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}