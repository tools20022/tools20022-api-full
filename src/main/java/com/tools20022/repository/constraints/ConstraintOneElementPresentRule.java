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
import com.tools20022.repository.msg.AssetClass2;
import com.tools20022.repository.msg.DerivativeInstrument5;
import com.tools20022.repository.msg.FinancialInstrument53;
import com.tools20022.repository.msg.RecordTechnicalData3;

/**
 * At least one of the 5 elements must be present.
 */
public class ConstraintOneElementPresentRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RecordTechnicalData3
	 * RecordTechnicalData3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/InconsistencyIndicator&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/LastUpdate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/SubmissionDateTime&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/RelevantCompetentAuthority&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/PublicationPeriod&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OneElementPresentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "At least one of the 5 elements must be present."</li>
	 * </ul>
	 */
	public static final MMConstraint<RecordTechnicalData3> forRecordTechnicalData3 = new MMConstraint<RecordTechnicalData3>() {
		{
			validator = ConstraintOneElementPresentRule::checkRecordTechnicalData3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OneElementPresentRule";
			definition = "At least one of the 5 elements must be present.";
			owner_lazy = () -> RecordTechnicalData3.mmObject();
			expression = "<RuleDefinition><SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/InconsistencyIndicator</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/LastUpdate</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/SubmissionDateTime</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/RelevantCompetentAuthority</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/PublicationPeriod</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument53
	 * FinancialInstrument53}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ISIN[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/LEI[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OneElementPresentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "At least one of 5 elements must be present."</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrument53> forFinancialInstrument53 = new MMConstraint<FinancialInstrument53>() {
		{
			validator = ConstraintOneElementPresentRule::checkFinancialInstrument53;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OneElementPresentRule";
			definition = "At least one of 5 elements must be present.";
			owner_lazy = () -> FinancialInstrument53.mmObject();
			expression = "<RuleDefinition><SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ISIN[*]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/LEI[*]</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AssetClass2 AssetClass2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Commodity&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Interest&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ForeignExchange&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OneElementPresentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "At least one of the 3 elements must be present."</li>
	 * </ul>
	 */
	public static final MMConstraint<AssetClass2> forAssetClass2 = new MMConstraint<AssetClass2>() {
		{
			validator = ConstraintOneElementPresentRule::checkAssetClass2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OneElementPresentRule";
			definition = "At least one of the 3 elements must be present.";
			owner_lazy = () -> AssetClass2.mmObject();
			expression = "<RuleDefinition><SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/Commodity</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/Interest</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/ForeignExchange</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument5
	 * DerivativeInstrument5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ExpiryDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/PriceMultiplier&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/UnderlyingInstrument&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AssetClassSpecificAttributes&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/DeliveryType&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OneElementPresentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "At least one of 5 elements must be present."</li>
	 * </ul>
	 */
	public static final MMConstraint<DerivativeInstrument5> forDerivativeInstrument5 = new MMConstraint<DerivativeInstrument5>() {
		{
			validator = ConstraintOneElementPresentRule::checkDerivativeInstrument5;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OneElementPresentRule";
			definition = "At least one of 5 elements must be present.";
			owner_lazy = () -> DerivativeInstrument5.mmObject();
			expression = "<RuleDefinition><SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ExpiryDate</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/PriceMultiplier</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/UnderlyingInstrument</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/AssetClassSpecificAttributes</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/DeliveryType</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>";
		}
	};

	/**
	 * At least one of the 5 elements must be present.
	 */
	public static void checkRecordTechnicalData3(RecordTechnicalData3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * At least one of 5 elements must be present.
	 */
	public static void checkFinancialInstrument53(FinancialInstrument53 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * At least one of the 3 elements must be present.
	 */
	public static void checkAssetClass2(AssetClass2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * At least one of 5 elements must be present.
	 */
	public static void checkDerivativeInstrument5(DerivativeInstrument5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}