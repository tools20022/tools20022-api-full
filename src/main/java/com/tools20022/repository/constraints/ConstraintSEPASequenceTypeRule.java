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
import com.tools20022.repository.msg.DirectDebitTransactionInformation5;
import com.tools20022.repository.msg.DirectDebitTransactionInformation6;
import com.tools20022.repository.msg.DirectDebitTransactionInformation7;
import com.tools20022.repository.msg.DirectDebitTransactionInformation8;

/**
 * SEPA TVS 3.x rule: If
 * DirectDebitTransactionInformation/DirectDebitTransaction
 * /MandateRelatedInformation/AmendmentIndicator is equal to True and
 * DirectDebitTransactionInformation
 * /DirectDebitTransaction/MandateRelatedInformation
 * /AmendmentInformationDetails/OriginalDebtorAgent is present and is set to
 * SMNDA, then
 * DirectDebitTransactionInformation/PaymentTypeInformation/SequenceType must be
 * equal to FRST.
 */
public class ConstraintSEPASequenceTypeRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation7
	 * DirectDebitTransactionInformation7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/PaymentTypeInformation/SequenceType&lt;/leftOperand&gt;&lt;rightOperand&gt;First&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/DirectDebitTransaction/MandateRelatedInformation/AmendmentIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/DirectDebitTransaction/MandateRelatedInformation/AmendmentInformationDetails/OriginalDebtorAgent/FinancialInstitutionIdentification/ProprietaryIdentification/Identification&lt;/leftOperand&gt;&lt;rightOperand&gt;SMNDA&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/PaymentTypeInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SEPASequenceTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "SEPA TVS 3.x rule: \nIf DirectDebitTransactionInformation/DirectDebitTransaction/MandateRelatedInformation/AmendmentIndicator is equal to True and DirectDebitTransactionInformation/DirectDebitTransaction/MandateRelatedInformation/AmendmentInformationDetails/OriginalDebtorAgent is present and is set to SMNDA, then DirectDebitTransactionInformation/PaymentTypeInformation/SequenceType must be equal to FRST."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DirectDebitTransactionInformation7> forDirectDebitTransactionInformation7 = new MMConstraint<DirectDebitTransactionInformation7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SEPASequenceTypeRule";
			definition = "SEPA TVS 3.x rule: \nIf DirectDebitTransactionInformation/DirectDebitTransaction/MandateRelatedInformation/AmendmentIndicator is equal to True and DirectDebitTransactionInformation/DirectDebitTransaction/MandateRelatedInformation/AmendmentInformationDetails/OriginalDebtorAgent is present and is set to SMNDA, then DirectDebitTransactionInformation/PaymentTypeInformation/SequenceType must be equal to FRST.";
			owner_lazy = () -> DirectDebitTransactionInformation7.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/PaymentTypeInformation/SequenceType</leftOperand><rightOperand>First</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/DirectDebitTransaction/MandateRelatedInformation/AmendmentIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/DirectDebitTransaction/MandateRelatedInformation/AmendmentInformationDetails/OriginalDebtorAgent/FinancialInstitutionIdentification/ProprietaryIdentification/Identification</leftOperand><rightOperand>SMNDA</rightOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/PaymentTypeInformation</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(DirectDebitTransactionInformation7 obj) throws Exception {
			checkDirectDebitTransactionInformation7(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation6
	 * DirectDebitTransactionInformation6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/PaymentTypeInformation/SequenceType&lt;/leftOperand&gt;&lt;rightOperand&gt;First&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/DirectDebitTransaction/MandateRelatedInformation/AmendmentIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/DirectDebitTransaction/MandateRelatedInformation/AmendmentInformationDetails/OriginalDebtorAgent/FinancialInstitutionIdentification/ProprietaryIdentification/Identification&lt;/leftOperand&gt;&lt;rightOperand&gt;SMNDA&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/PaymentTypeInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SEPASequenceTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "SEPA TVS v3.x Rule: \nIf DirectDebitTransactionInformation/DirectDebitTransaction/MandateRelatedInformation/AmendmentIndicator is equal to True and DirectDebitTransactionInformation/DirectDebitTransaction/MandateRelatedInformation/AmendmentInformationDetails/OriginalDebtorAgent is present and is set to SMNDA, then DirectDebitTransactionInformation/PaymentTypeInformation/SequenceType must be equal to FRST."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DirectDebitTransactionInformation6> forDirectDebitTransactionInformation6 = new MMConstraint<DirectDebitTransactionInformation6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SEPASequenceTypeRule";
			definition = "SEPA TVS v3.x Rule: \nIf DirectDebitTransactionInformation/DirectDebitTransaction/MandateRelatedInformation/AmendmentIndicator is equal to True and DirectDebitTransactionInformation/DirectDebitTransaction/MandateRelatedInformation/AmendmentInformationDetails/OriginalDebtorAgent is present and is set to SMNDA, then DirectDebitTransactionInformation/PaymentTypeInformation/SequenceType must be equal to FRST.";
			owner_lazy = () -> DirectDebitTransactionInformation6.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/PaymentTypeInformation/SequenceType</leftOperand><rightOperand>First</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/DirectDebitTransaction/MandateRelatedInformation/AmendmentIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/DirectDebitTransaction/MandateRelatedInformation/AmendmentInformationDetails/OriginalDebtorAgent/FinancialInstitutionIdentification/ProprietaryIdentification/Identification</leftOperand><rightOperand>SMNDA</rightOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/PaymentTypeInformation</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(DirectDebitTransactionInformation6 obj) throws Exception {
			checkDirectDebitTransactionInformation6(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation8
	 * DirectDebitTransactionInformation8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/PaymentTypeInformation/SequenceType&lt;/leftOperand&gt;&lt;rightOperand&gt;First&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/DirectDebitTransaction/MandateRelatedInformation/AmendmentIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/DirectDebitTransaction/MandateRelatedInformation/AmendmentInformationDetails/OriginalDebtorAgent/FinancialInstitutionIdentification/ProprietaryIdentification/Identification&lt;/leftOperand&gt;&lt;rightOperand&gt;SMNDA&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/PaymentTypeInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SEPASequenceTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "SEPA TVS v3.x Rule: \nIf DirectDebitTransactionInformation/DirectDebitTransaction/MandateRelatedInformation/AmendmentIndicator is equal to True and DirectDebitTransactionInformation/DirectDebitTransaction/MandateRelatedInformation/AmendmentInformationDetails/OriginalDebtorAgent is present and is set to SMNDA, then DirectDebitTransactionInformation/PaymentTypeInformation/SequenceType must be equal to FRST."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DirectDebitTransactionInformation8> forDirectDebitTransactionInformation8 = new MMConstraint<DirectDebitTransactionInformation8>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SEPASequenceTypeRule";
			definition = "SEPA TVS v3.x Rule: \nIf DirectDebitTransactionInformation/DirectDebitTransaction/MandateRelatedInformation/AmendmentIndicator is equal to True and DirectDebitTransactionInformation/DirectDebitTransaction/MandateRelatedInformation/AmendmentInformationDetails/OriginalDebtorAgent is present and is set to SMNDA, then DirectDebitTransactionInformation/PaymentTypeInformation/SequenceType must be equal to FRST.";
			owner_lazy = () -> DirectDebitTransactionInformation8.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/PaymentTypeInformation/SequenceType</leftOperand><rightOperand>First</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/DirectDebitTransaction/MandateRelatedInformation/AmendmentIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/DirectDebitTransaction/MandateRelatedInformation/AmendmentInformationDetails/OriginalDebtorAgent/FinancialInstitutionIdentification/ProprietaryIdentification/Identification</leftOperand><rightOperand>SMNDA</rightOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/PaymentTypeInformation</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(DirectDebitTransactionInformation8 obj) throws Exception {
			checkDirectDebitTransactionInformation8(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation5
	 * DirectDebitTransactionInformation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/PaymentTypeInformation/SequenceType&lt;/leftOperand&gt;&lt;rightOperand&gt;First&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/DirectDebitTransaction/MandateRelatedInformation/AmendmentIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/DirectDebitTransaction/MandateRelatedInformation/AmendmentInformationDetails/OriginalDebtorAgent/FinancialInstitutionIdentification/ProprietaryIdentification/Identification&lt;/leftOperand&gt;&lt;rightOperand&gt;SMNDA&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/PaymentTypeInformation&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SEPASequenceTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If DirectDebitTransactionInformation/DirectDebitTransaction/MandateRelatedInformation/AmendmentIndicator is equal to True and DirectDebitTransactionInformation/DirectDebitTransaction/MandateRelatedInformation/AmendmentInformationDetails/OriginalDebtorAgent is present and is set to SMNDA, then DirectDebitTransactionInformation/PaymentTypeInformation/SequenceType must be equal to FRST."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DirectDebitTransactionInformation5> forDirectDebitTransactionInformation5 = new MMConstraint<DirectDebitTransactionInformation5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SEPASequenceTypeRule";
			definition = "If DirectDebitTransactionInformation/DirectDebitTransaction/MandateRelatedInformation/AmendmentIndicator is equal to True and DirectDebitTransactionInformation/DirectDebitTransaction/MandateRelatedInformation/AmendmentInformationDetails/OriginalDebtorAgent is present and is set to SMNDA, then DirectDebitTransactionInformation/PaymentTypeInformation/SequenceType must be equal to FRST.";
			owner_lazy = () -> DirectDebitTransactionInformation5.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/PaymentTypeInformation/SequenceType</leftOperand><rightOperand>First</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/DirectDebitTransaction/MandateRelatedInformation/AmendmentIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/DirectDebitTransaction/MandateRelatedInformation/AmendmentInformationDetails/OriginalDebtorAgent/FinancialInstitutionIdentification/ProprietaryIdentification/Identification</leftOperand><rightOperand>SMNDA</rightOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/PaymentTypeInformation</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(DirectDebitTransactionInformation5 obj) throws Exception {
			checkDirectDebitTransactionInformation5(obj);
		}
	};

	/**
	 * SEPA TVS 3.x rule: If
	 * DirectDebitTransactionInformation/DirectDebitTransaction
	 * /MandateRelatedInformation/AmendmentIndicator is equal to True and
	 * DirectDebitTransactionInformation
	 * /DirectDebitTransaction/MandateRelatedInformation
	 * /AmendmentInformationDetails/OriginalDebtorAgent is present and is set to
	 * SMNDA, then
	 * DirectDebitTransactionInformation/PaymentTypeInformation/SequenceType
	 * must be equal to FRST.
	 */
	public static void checkDirectDebitTransactionInformation7(DirectDebitTransactionInformation7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * SEPA TVS v3.x Rule: If
	 * DirectDebitTransactionInformation/DirectDebitTransaction
	 * /MandateRelatedInformation/AmendmentIndicator is equal to True and
	 * DirectDebitTransactionInformation
	 * /DirectDebitTransaction/MandateRelatedInformation
	 * /AmendmentInformationDetails/OriginalDebtorAgent is present and is set to
	 * SMNDA, then
	 * DirectDebitTransactionInformation/PaymentTypeInformation/SequenceType
	 * must be equal to FRST.
	 */
	public static void checkDirectDebitTransactionInformation6(DirectDebitTransactionInformation6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * SEPA TVS v3.x Rule: If
	 * DirectDebitTransactionInformation/DirectDebitTransaction
	 * /MandateRelatedInformation/AmendmentIndicator is equal to True and
	 * DirectDebitTransactionInformation
	 * /DirectDebitTransaction/MandateRelatedInformation
	 * /AmendmentInformationDetails/OriginalDebtorAgent is present and is set to
	 * SMNDA, then
	 * DirectDebitTransactionInformation/PaymentTypeInformation/SequenceType
	 * must be equal to FRST.
	 */
	public static void checkDirectDebitTransactionInformation8(DirectDebitTransactionInformation8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If DirectDebitTransactionInformation/DirectDebitTransaction/
	 * MandateRelatedInformation/AmendmentIndicator is equal to True and
	 * DirectDebitTransactionInformation
	 * /DirectDebitTransaction/MandateRelatedInformation
	 * /AmendmentInformationDetails/OriginalDebtorAgent is present and is set to
	 * SMNDA, then
	 * DirectDebitTransactionInformation/PaymentTypeInformation/SequenceType
	 * must be equal to FRST.
	 */
	public static void checkDirectDebitTransactionInformation5(DirectDebitTransactionInformation5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}