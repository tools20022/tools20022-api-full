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
import com.tools20022.repository.msg.*;
import java.util.Arrays;

/**
 * If Status equals REJT (Rejected) then StatusReason must be present.
 */
public class ConstraintStatusReasonRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountStatus1
	 * SecuritiesAccountStatus1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusReasonRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Status equals REJT (Rejected) then StatusReason must be present."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintStatusReasonRule#forSecuritiesAccountStatus2
	 * ConstraintStatusReasonRule.forSecuritiesAccountStatus2}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesAccountStatus1> forSecuritiesAccountStatus1 = new MMConstraint<SecuritiesAccountStatus1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusReasonRule";
			definition = "If Status equals REJT (Rejected) then StatusReason must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintStatusReasonRule.forSecuritiesAccountStatus2);
			owner_lazy = () -> SecuritiesAccountStatus1.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesAccountStatus1 obj) throws Exception {
			checkSecuritiesAccountStatus1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountLinkStatus1
	 * AccountLinkStatus1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusReasonRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Status equals \"Rejected\" then StatusReason must be present."</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountLinkStatus1> forAccountLinkStatus1 = new MMConstraint<AccountLinkStatus1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusReasonRule";
			definition = "If Status equals \"Rejected\" then StatusReason must be present.";
			owner_lazy = () -> AccountLinkStatus1.mmObject();
		}

		@Override
		public void executeValidator(AccountLinkStatus1 obj) throws Exception {
			checkAccountLinkStatus1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountStatus2
	 * SecuritiesAccountStatus2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusReasonRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Status equals REJT (Rejected) then StatusReason must be present."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintStatusReasonRule#forSecuritiesAccountStatus1
	 * ConstraintStatusReasonRule.forSecuritiesAccountStatus1}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesAccountStatus2> forSecuritiesAccountStatus2 = new MMConstraint<SecuritiesAccountStatus2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusReasonRule";
			definition = "If Status equals REJT (Rejected) then StatusReason must be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintStatusReasonRule.forSecuritiesAccountStatus1;
			owner_lazy = () -> SecuritiesAccountStatus2.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesAccountStatus2 obj) throws Exception {
			checkSecuritiesAccountStatus2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PartyStatus1 PartyStatus1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusReasonRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Status equals 'Rejected' then StatusReason must be present."</li>
	 * </ul>
	 */
	public static final MMConstraint<PartyStatus1> forPartyStatus1 = new MMConstraint<PartyStatus1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusReasonRule";
			definition = "If Status equals 'Rejected' then StatusReason must be present.";
			owner_lazy = () -> PartyStatus1.mmObject();
		}

		@Override
		public void executeValidator(PartyStatus1 obj) throws Exception {
			checkPartyStatus1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.StatusReasonInformation1
	 * StatusReasonInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusReasonRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatusReason/Code is equal to 'NARR', then at least one occurrence of AddititionalStatusReasonInformation must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<StatusReasonInformation1> forStatusReasonInformation1 = new MMConstraint<StatusReasonInformation1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusReasonRule";
			definition = "If StatusReason/Code is equal to 'NARR', then at least one occurrence of AddititionalStatusReasonInformation must be present.";
			owner_lazy = () -> StatusReasonInformation1.mmObject();
		}

		@Override
		public void executeValidator(StatusReasonInformation1 obj) throws Exception {
			checkStatusReasonInformation1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.StatusReasonInformation8
	 * StatusReasonInformation8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/Reason/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;Narrative&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Reason&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Reason/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusReasonRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Reason/Code is equal to NARR, then AddititionalInformation must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<StatusReasonInformation8> forStatusReasonInformation8 = new MMConstraint<StatusReasonInformation8>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusReasonRule";
			definition = "If Reason/Code is equal to NARR, then AddititionalInformation must be present.";
			owner_lazy = () -> StatusReasonInformation8.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation[1]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/Reason/Code</leftOperand><rightOperand>Narrative</rightOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/Reason</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/Reason/Code</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(StatusReasonInformation8 obj) throws Exception {
			checkStatusReasonInformation8(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.StatusReasonInformation9
	 * StatusReasonInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/Reason/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;Narrative&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Reason&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Reason/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusReasonRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Reason/Code is equal to NARR, then AddititionalInformation must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintStatusReasonRule#forValidationStatusReason1
	 * ConstraintStatusReasonRule.forValidationStatusReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintStatusReasonRule#forStatusReasonInformation11
	 * ConstraintStatusReasonRule.forStatusReasonInformation11}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<StatusReasonInformation9> forStatusReasonInformation9 = new MMConstraint<StatusReasonInformation9>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusReasonRule";
			definition = "If Reason/Code is equal to NARR, then AddititionalInformation must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintStatusReasonRule.forValidationStatusReason1, com.tools20022.repository.constraints.ConstraintStatusReasonRule.forStatusReasonInformation11);
			owner_lazy = () -> StatusReasonInformation9.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation[1]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/Reason/Code</leftOperand><rightOperand>Narrative</rightOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/Reason</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/Reason/Code</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(StatusReasonInformation9 obj) throws Exception {
			checkStatusReasonInformation9(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ValidationStatusReason1
	 * ValidationStatusReason1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/Reason/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;Narrative&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Reason&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Reason/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusReasonRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Reason/Code is equal to NARR (Narrative), then AdditionalInformation must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintStatusReasonRule#forStatusReasonInformation9
	 * ConstraintStatusReasonRule.forStatusReasonInformation9}</li>
	 * </ul>
	 */
	public static final MMConstraint<ValidationStatusReason1> forValidationStatusReason1 = new MMConstraint<ValidationStatusReason1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusReasonRule";
			definition = "If Reason/Code is equal to NARR (Narrative), then AdditionalInformation must be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintStatusReasonRule.forStatusReasonInformation9;
			owner_lazy = () -> ValidationStatusReason1.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation[1]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/Reason/Code</leftOperand><rightOperand>Narrative</rightOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/Reason</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/Reason/Code</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(ValidationStatusReason1 obj) throws Exception {
			checkValidationStatusReason1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.StatusReasonInformation5
	 * StatusReasonInformation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalStatusReasonInformation[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatusReason/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;Narrative&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusReasonRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If StatusReason/Code is equal to 'NARR', then at least one occurrence of AddititionalStatusReasonInformation must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<StatusReasonInformation5> forStatusReasonInformation5 = new MMConstraint<StatusReasonInformation5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusReasonRule";
			definition = "If StatusReason/Code is equal to 'NARR', then at least one occurrence of AddititionalStatusReasonInformation must be present.";
			owner_lazy = () -> StatusReasonInformation5.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalStatusReasonInformation[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatusReason/Code</leftOperand><rightOperand>Narrative</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(StatusReasonInformation5 obj) throws Exception {
			checkStatusReasonInformation5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CSDLinkStatus1 CSDLinkStatus1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusReasonRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Status equals \"Rejected\" then StatusReason must be present."</li>
	 * </ul>
	 */
	public static final MMConstraint<CSDLinkStatus1> forCSDLinkStatus1 = new MMConstraint<CSDLinkStatus1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusReasonRule";
			definition = "If Status equals \"Rejected\" then StatusReason must be present.";
			owner_lazy = () -> CSDLinkStatus1.mmObject();
		}

		@Override
		public void executeValidator(CSDLinkStatus1 obj) throws Exception {
			checkCSDLinkStatus1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.StatusReasonInformation7
	 * StatusReasonInformation7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalStatusReasonInformation[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/StatusReason/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;Narrative&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusReasonRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ISO 20022 Rule: \nIf StatusReason/Code is equal to 'NARR', then at least one occurrence of AddititionalStatusReasonInformation must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<StatusReasonInformation7> forStatusReasonInformation7 = new MMConstraint<StatusReasonInformation7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusReasonRule";
			definition = "ISO 20022 Rule: \nIf StatusReason/Code is equal to 'NARR', then at least one occurrence of AddititionalStatusReasonInformation must be present.";
			owner_lazy = () -> StatusReasonInformation7.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalStatusReasonInformation[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/StatusReason/Code</leftOperand><rightOperand>Narrative</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(StatusReasonInformation7 obj) throws Exception {
			checkStatusReasonInformation7(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CollateralStatusReason1
	 * CollateralStatusReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusReasonRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "If Status equals 'Rejected' then Reason must be present."</li>
	 * </ul>
	 */
	public static final MMConstraint<CollateralStatusReason1> forCollateralStatusReason1 = new MMConstraint<CollateralStatusReason1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusReasonRule";
			definition = "If Status equals 'Rejected' then Reason must be present.";
			owner_lazy = () -> CollateralStatusReason1.mmObject();
		}

		@Override
		public void executeValidator(CollateralStatusReason1 obj) throws Exception {
			checkCollateralStatusReason1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.StatusReasonInformation11
	 * StatusReasonInformation11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/AdditionalInformation[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/Reason/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;Narrative&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Reason&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Reason/Code&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusReasonRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Reason/Code is equal to NARR, then AddititionalInformation must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintStatusReasonRule#forStatusReasonInformation9
	 * ConstraintStatusReasonRule.forStatusReasonInformation9}</li>
	 * </ul>
	 */
	public static final MMConstraint<StatusReasonInformation11> forStatusReasonInformation11 = new MMConstraint<StatusReasonInformation11>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusReasonRule";
			definition = "If Reason/Code is equal to NARR, then AddititionalInformation must be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintStatusReasonRule.forStatusReasonInformation9;
			owner_lazy = () -> StatusReasonInformation11.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/AdditionalInformation[1]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/Reason/Code</leftOperand><rightOperand>Narrative</rightOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/Reason</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/Reason/Code</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(StatusReasonInformation11 obj) throws Exception {
			checkStatusReasonInformation11(obj);
		}
	};

	/**
	 * If Status equals REJT (Rejected) then StatusReason must be present.
	 */
	public static void checkSecuritiesAccountStatus1(SecuritiesAccountStatus1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Status equals "Rejected" then StatusReason must be present.
	 */
	public static void checkAccountLinkStatus1(AccountLinkStatus1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Status equals REJT (Rejected) then StatusReason must be present.
	 */
	public static void checkSecuritiesAccountStatus2(SecuritiesAccountStatus2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Status equals 'Rejected' then StatusReason must be present.
	 */
	public static void checkPartyStatus1(PartyStatus1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If StatusReason/Code is equal to 'NARR', then at least one occurrence of
	 * AddititionalStatusReasonInformation must be present.
	 */
	public static void checkStatusReasonInformation1(StatusReasonInformation1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Reason/Code is equal to NARR, then AddititionalInformation must be
	 * present.
	 */
	public static void checkStatusReasonInformation8(StatusReasonInformation8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Reason/Code is equal to NARR, then AddititionalInformation must be
	 * present.
	 */
	public static void checkStatusReasonInformation9(StatusReasonInformation9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Reason/Code is equal to NARR (Narrative), then AdditionalInformation
	 * must be present.
	 */
	public static void checkValidationStatusReason1(ValidationStatusReason1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If StatusReason/Code is equal to 'NARR', then at least one occurrence of
	 * AddititionalStatusReasonInformation must be present.
	 */
	public static void checkStatusReasonInformation5(StatusReasonInformation5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Status equals "Rejected" then StatusReason must be present.
	 */
	public static void checkCSDLinkStatus1(CSDLinkStatus1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ISO 20022 Rule: If StatusReason/Code is equal to 'NARR', then at least
	 * one occurrence of AddititionalStatusReasonInformation must be present.
	 */
	public static void checkStatusReasonInformation7(StatusReasonInformation7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Status equals 'Rejected' then Reason must be present.
	 */
	public static void checkCollateralStatusReason1(CollateralStatusReason1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Reason/Code is equal to NARR, then AddititionalInformation must be
	 * present.
	 */
	public static void checkStatusReasonInformation11(StatusReasonInformation11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}