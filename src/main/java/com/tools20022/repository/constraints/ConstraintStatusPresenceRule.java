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
import com.tools20022.repository.area.setr.SecuritiesTradeConfirmationStatusAdviceV01;
import com.tools20022.repository.area.setr.SecuritiesTradeConfirmationStatusAdviceV02;
import java.util.Arrays;

/**
 * AffirmationStatus or ProcessingStatus or MatchingStatus or
 * ReplacementProcessingStatus or CancellationProcessingStatus must be present.
 */
public class ConstraintStatusPresenceRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationStatusAdviceV02
	 * SecuritiesTradeConfirmationStatusAdviceV02}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AffirmationStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ProcessingStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/MatchingStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReplacementProcessingStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CancellationProcessingStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "AffirmationStatus or ProcessingStatus or MatchingStatus or ReplacementProcessingStatus or CancellationProcessingStatus must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintStatusPresenceRule#for_setr_SecuritiesTradeConfirmationStatusAdviceV01
	 * ConstraintStatusPresenceRule.
	 * for_setr_SecuritiesTradeConfirmationStatusAdviceV01}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeConfirmationStatusAdviceV02> for_setr_SecuritiesTradeConfirmationStatusAdviceV02 = new MMConstraint<SecuritiesTradeConfirmationStatusAdviceV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusPresenceRule";
			definition = "AffirmationStatus or ProcessingStatus or MatchingStatus or ReplacementProcessingStatus or CancellationProcessingStatus must be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintStatusPresenceRule.for_setr_SecuritiesTradeConfirmationStatusAdviceV01;
			owner_lazy = () -> SecuritiesTradeConfirmationStatusAdviceV02.mmObject();
			expression = "<RuleDefinition><SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AffirmationStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/ProcessingStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/MatchingStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReplacementProcessingStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CancellationProcessingStatus</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(SecuritiesTradeConfirmationStatusAdviceV02 obj) throws Exception {
			check_setr_SecuritiesTradeConfirmationStatusAdviceV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationStatusAdviceV01
	 * SecuritiesTradeConfirmationStatusAdviceV01}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AffirmationStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ProcessingStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/MatchingStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReplacementProcessingStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CancellationProcessingStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "AffirmationStatus or ProcessingStatus or MatchingStatus or ReplacementProcessingStatus or CancellationProcessingStatus must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintStatusPresenceRule#for_setr_SecuritiesTradeConfirmationStatusAdviceV02
	 * ConstraintStatusPresenceRule.
	 * for_setr_SecuritiesTradeConfirmationStatusAdviceV02}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeConfirmationStatusAdviceV01> for_setr_SecuritiesTradeConfirmationStatusAdviceV01 = new MMConstraint<SecuritiesTradeConfirmationStatusAdviceV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusPresenceRule";
			definition = "AffirmationStatus or ProcessingStatus or MatchingStatus or ReplacementProcessingStatus or CancellationProcessingStatus must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintStatusPresenceRule.for_setr_SecuritiesTradeConfirmationStatusAdviceV02);
			owner_lazy = () -> SecuritiesTradeConfirmationStatusAdviceV01.mmObject();
			expression = "<RuleDefinition><SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AffirmationStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/ProcessingStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/MatchingStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReplacementProcessingStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CancellationProcessingStatus</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(SecuritiesTradeConfirmationStatusAdviceV01 obj) throws Exception {
			check_setr_SecuritiesTradeConfirmationStatusAdviceV01(obj);
		}
	};

	/**
	 * AffirmationStatus or ProcessingStatus or MatchingStatus or
	 * ReplacementProcessingStatus or CancellationProcessingStatus must be
	 * present.
	 */
	public static void check_setr_SecuritiesTradeConfirmationStatusAdviceV02(SecuritiesTradeConfirmationStatusAdviceV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * AffirmationStatus or ProcessingStatus or MatchingStatus or
	 * ReplacementProcessingStatus or CancellationProcessingStatus must be
	 * present.
	 */
	public static void check_setr_SecuritiesTradeConfirmationStatusAdviceV01(SecuritiesTradeConfirmationStatusAdviceV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}