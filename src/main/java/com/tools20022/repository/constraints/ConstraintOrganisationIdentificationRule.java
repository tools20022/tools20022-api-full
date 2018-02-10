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
import com.tools20022.repository.msg.Organisation14;
import com.tools20022.repository.msg.PartyIdentification96;

/**
 * In case of conflict between the Organisation Identification and the Full
 * Legal Name, it is recommended that the account servicer ask for clarification
 * by means of an AdditionalInformationRequest message.
 */
public class ConstraintOrganisationIdentificationRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Organisation14 Organisation14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrganisationIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In case of conflict between the Organisation Identification and the Full Legal Name, it is recommended that the account servicer ask for clarification by means of an AdditionalInformationRequest message."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Organisation14> forOrganisation14 = new MMConstraint<Organisation14>() {
		{
			validator = ConstraintOrganisationIdentificationRule::checkOrganisation14;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrganisationIdentificationRule";
			definition = "In case of conflict between the Organisation Identification and the Full Legal Name, it is recommended that the account servicer ask for clarification by means of an AdditionalInformationRequest message.";
			owner_lazy = () -> Organisation14.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification96
	 * PartyIdentification96}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Identification&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/LegalEntityIdentifier&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrganisationIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either Identification or Legal Entity Identifier must be present. Both  Identification and Legal Entity Identifier may be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification96> forPartyIdentification96 = new MMConstraint<PartyIdentification96>() {
		{
			validator = ConstraintOrganisationIdentificationRule::checkPartyIdentification96;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrganisationIdentificationRule";
			definition = "Either Identification or Legal Entity Identifier must be present. Both  Identification and Legal Entity Identifier may be present.";
			owner_lazy = () -> PartyIdentification96.mmObject();
			expression = "<RuleDefinition><SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/Identification</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/LegalEntityIdentifier</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>";
		}
	};

	/**
	 * In case of conflict between the Organisation Identification and the Full
	 * Legal Name, it is recommended that the account servicer ask for
	 * clarification by means of an AdditionalInformationRequest message.
	 */
	public static void checkOrganisation14(Organisation14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either Identification or Legal Entity Identifier must be present. Both
	 * Identification and Legal Entity Identifier may be present.
	 */
	public static void checkPartyIdentification96(PartyIdentification96 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}