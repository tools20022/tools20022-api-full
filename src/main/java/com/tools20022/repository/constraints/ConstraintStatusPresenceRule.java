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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintStatusPresenceRule#forSecuritiesTradeConfirmationStatusAdviceV01
	 * ConstraintStatusPresenceRule.
	 * forSecuritiesTradeConfirmationStatusAdviceV01}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeConfirmationStatusAdviceV02> forSecuritiesTradeConfirmationStatusAdviceV02 = new MMConstraint<SecuritiesTradeConfirmationStatusAdviceV02>() {
		{
			validator = ConstraintStatusPresenceRule::checkSecuritiesTradeConfirmationStatusAdviceV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusPresenceRule";
			definition = "AffirmationStatus or ProcessingStatus or MatchingStatus or ReplacementProcessingStatus or CancellationProcessingStatus must be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintStatusPresenceRule.forSecuritiesTradeConfirmationStatusAdviceV01;
			owner_lazy = () -> SecuritiesTradeConfirmationStatusAdviceV02.mmObject();
			expression = "<RuleDefinition><SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AffirmationStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/ProcessingStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/MatchingStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReplacementProcessingStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CancellationProcessingStatus</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>";
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintStatusPresenceRule#forSecuritiesTradeConfirmationStatusAdviceV02
	 * ConstraintStatusPresenceRule.
	 * forSecuritiesTradeConfirmationStatusAdviceV02}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeConfirmationStatusAdviceV01> forSecuritiesTradeConfirmationStatusAdviceV01 = new MMConstraint<SecuritiesTradeConfirmationStatusAdviceV01>() {
		{
			validator = ConstraintStatusPresenceRule::checkSecuritiesTradeConfirmationStatusAdviceV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusPresenceRule";
			definition = "AffirmationStatus or ProcessingStatus or MatchingStatus or ReplacementProcessingStatus or CancellationProcessingStatus must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintStatusPresenceRule.forSecuritiesTradeConfirmationStatusAdviceV02);
			owner_lazy = () -> SecuritiesTradeConfirmationStatusAdviceV01.mmObject();
			expression = "<RuleDefinition><SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AffirmationStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/ProcessingStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/MatchingStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReplacementProcessingStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CancellationProcessingStatus</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>";
		}
	};

	/**
	 * AffirmationStatus or ProcessingStatus or MatchingStatus or
	 * ReplacementProcessingStatus or CancellationProcessingStatus must be
	 * present.
	 */
	public static void checkSecuritiesTradeConfirmationStatusAdviceV02(SecuritiesTradeConfirmationStatusAdviceV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * AffirmationStatus or ProcessingStatus or MatchingStatus or
	 * ReplacementProcessingStatus or CancellationProcessingStatus must be
	 * present.
	 */
	public static void checkSecuritiesTradeConfirmationStatusAdviceV01(SecuritiesTradeConfirmationStatusAdviceV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}