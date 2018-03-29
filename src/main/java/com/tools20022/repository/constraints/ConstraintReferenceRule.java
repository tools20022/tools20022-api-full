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
 * At least TransferReference or TransferConfirmationReference must be present.
 */
public class ConstraintReferenceRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransferReference2
	 * TransferReference2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "At least TransferReference or TransferConfirmationReference must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReferenceRule#forTransferReference6
	 * ConstraintReferenceRule.forTransferReference6}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransferReference2> forTransferReference2 = new MMConstraint<TransferReference2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceRule";
			definition = "At least TransferReference or TransferConfirmationReference must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReferenceRule.forTransferReference6);
			owner_lazy = () -> TransferReference2.mmObject();
		}

		@Override
		public void executeValidator(TransferReference2 obj) throws Exception {
			checkTransferReference2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrderExecution2
	 * InvestmentFundOrderExecution2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "At least OrderReference or DealReference must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<InvestmentFundOrderExecution2> forInvestmentFundOrderExecution2 = new MMConstraint<InvestmentFundOrderExecution2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceRule";
			definition = "At least OrderReference or DealReference must be present.";
			owner_lazy = () -> InvestmentFundOrderExecution2.mmObject();
		}

		@Override
		public void executeValidator(InvestmentFundOrderExecution2 obj) throws Exception {
			checkInvestmentFundOrderExecution2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DocumentNumber2
	 * DocumentNumber2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The reference used to identify the transaction must be in line with the identification available for the status advice requested by the SecuritiesTransactionStatusQuery. For example, a SecuritiesTransactionStatusQuery must not request a SecuritiesSettlementTransactionStatusAdvice using a CorporateActionEventIdentification."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DocumentNumber2> forDocumentNumber2 = new MMConstraint<DocumentNumber2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceRule";
			definition = "The reference used to identify the transaction must be in line with the identification available for the status advice requested by the SecuritiesTransactionStatusQuery. For example, a SecuritiesTransactionStatusQuery must not request a SecuritiesSettlementTransactionStatusAdvice using a CorporateActionEventIdentification.";
			owner_lazy = () -> DocumentNumber2.mmObject();
		}

		@Override
		public void executeValidator(DocumentNumber2 obj) throws Exception {
			checkDocumentNumber2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DocumentNumber6
	 * DocumentNumber6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The reference used to identify the transaction must be in line with the identification available for the status advice requested by the SecuritiesTransactionStatusQuery. For example, a SecuritiesTransactionStatusQuery must not request a SecuritiesSettlementTransactionStatusAdvice using a CorporateActionEventIdentification."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DocumentNumber6> forDocumentNumber6 = new MMConstraint<DocumentNumber6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceRule";
			definition = "The reference used to identify the transaction must be in line with the identification available for the status advice requested by the SecuritiesTransactionStatusQuery. For example, a SecuritiesTransactionStatusQuery must not request a SecuritiesSettlementTransactionStatusAdvice using a CorporateActionEventIdentification.";
			owner_lazy = () -> DocumentNumber6.mmObject();
		}

		@Override
		public void executeValidator(DocumentNumber6 obj) throws Exception {
			checkDocumentNumber6(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DocumentNumber5
	 * DocumentNumber5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The reference used to identify the transaction must be in line with the identification available for the status advice requested by the SecuritiesTransactionStatusQuery. For example, a SecuritiesTransactionStatusQuery must not request a SecuritiesSettlementTransactionStatusAdvice using a CorporateActionEventIdentification."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DocumentNumber5> forDocumentNumber5 = new MMConstraint<DocumentNumber5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceRule";
			definition = "The reference used to identify the transaction must be in line with the identification available for the status advice requested by the SecuritiesTransactionStatusQuery. For example, a SecuritiesTransactionStatusQuery must not request a SecuritiesSettlementTransactionStatusAdvice using a CorporateActionEventIdentification.";
			owner_lazy = () -> DocumentNumber5.mmObject();
		}

		@Override
		public void executeValidator(DocumentNumber5 obj) throws Exception {
			checkDocumentNumber5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DocumentNumber4
	 * DocumentNumber4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The reference used to identify the transaction must be in line with the identification available for the status advice requested by the SecuritiesTransactionStatusQuery. For example, a SecuritiesTransactionStatusQuery must not request a SecuritiesSettlementTransactionStatusAdvice using a CorporateActionEventIdentification."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DocumentNumber4> forDocumentNumber4 = new MMConstraint<DocumentNumber4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceRule";
			definition = "The reference used to identify the transaction must be in line with the identification available for the status advice requested by the SecuritiesTransactionStatusQuery. For example, a SecuritiesTransactionStatusQuery must not request a SecuritiesSettlementTransactionStatusAdvice using a CorporateActionEventIdentification.";
			owner_lazy = () -> DocumentNumber4.mmObject();
		}

		@Override
		public void executeValidator(DocumentNumber4 obj) throws Exception {
			checkDocumentNumber4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DocumentNumber7
	 * DocumentNumber7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The reference used to identify the transaction must be in line with the identification available for the status advice requested by the SecuritiesTransactionStatusQuery. For example, a SecuritiesTransactionStatusQuery must not request a SecuritiesSettlementTransactionStatusAdvice using a CorporateActionEventIdentification."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DocumentNumber7> forDocumentNumber7 = new MMConstraint<DocumentNumber7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceRule";
			definition = "The reference used to identify the transaction must be in line with the identification available for the status advice requested by the SecuritiesTransactionStatusQuery. For example, a SecuritiesTransactionStatusQuery must not request a SecuritiesSettlementTransactionStatusAdvice using a CorporateActionEventIdentification.";
			owner_lazy = () -> DocumentNumber7.mmObject();
		}

		@Override
		public void executeValidator(DocumentNumber7 obj) throws Exception {
			checkDocumentNumber7(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DocumentNumber9
	 * DocumentNumber9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The reference used to identify the transaction must be in line with the identification available for the status advice requested by the SecuritiesTransactionStatusQuery. For example, a SecuritiesTransactionStatusQuery must not request a SecuritiesSettlementTransactionStatusAdvice using a CorporateActionEventIdentification."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReferenceRule#forDocumentNumber12
	 * ConstraintReferenceRule.forDocumentNumber12}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DocumentNumber9> forDocumentNumber9 = new MMConstraint<DocumentNumber9>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceRule";
			definition = "The reference used to identify the transaction must be in line with the identification available for the status advice requested by the SecuritiesTransactionStatusQuery. For example, a SecuritiesTransactionStatusQuery must not request a SecuritiesSettlementTransactionStatusAdvice using a CorporateActionEventIdentification.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReferenceRule.forDocumentNumber12);
			owner_lazy = () -> DocumentNumber9.mmObject();
		}

		@Override
		public void executeValidator(DocumentNumber9 obj) throws Exception {
			checkDocumentNumber9(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DocumentNumber11
	 * DocumentNumber11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The reference used to identify the transaction must be in line with the identification available for the status advice requested by the SecuritiesTransactionStatusQuery. For example, a SecuritiesTransactionStatusQuery must not request a SecuritiesSettlementTransactionStatusAdvice using a CorporateActionEventIdentification."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DocumentNumber11> forDocumentNumber11 = new MMConstraint<DocumentNumber11>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceRule";
			definition = "The reference used to identify the transaction must be in line with the identification available for the status advice requested by the SecuritiesTransactionStatusQuery. For example, a SecuritiesTransactionStatusQuery must not request a SecuritiesSettlementTransactionStatusAdvice using a CorporateActionEventIdentification.";
			owner_lazy = () -> DocumentNumber11.mmObject();
		}

		@Override
		public void executeValidator(DocumentNumber11 obj) throws Exception {
			checkDocumentNumber11(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DocumentNumber8
	 * DocumentNumber8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The reference used to identify the transaction must be in line with the identification available for the status advice requested by the SecuritiesTransactionStatusQuery. For example, a SecuritiesTransactionStatusQuery must not request a SecuritiesSettlementTransactionStatusAdvice using a CorporateActionEventIdentification."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DocumentNumber8> forDocumentNumber8 = new MMConstraint<DocumentNumber8>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceRule";
			definition = "The reference used to identify the transaction must be in line with the identification available for the status advice requested by the SecuritiesTransactionStatusQuery. For example, a SecuritiesTransactionStatusQuery must not request a SecuritiesSettlementTransactionStatusAdvice using a CorporateActionEventIdentification.";
			owner_lazy = () -> DocumentNumber8.mmObject();
		}

		@Override
		public void executeValidator(DocumentNumber8 obj) throws Exception {
			checkDocumentNumber8(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransferReference6
	 * TransferReference6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "At least TransferReference or TransferConfirmationReference must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReferenceRule#forTransferReference10
	 * ConstraintReferenceRule.forTransferReference10}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReferenceRule#forTransferReference2
	 * ConstraintReferenceRule.forTransferReference2}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransferReference6> forTransferReference6 = new MMConstraint<TransferReference6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceRule";
			definition = "At least TransferReference or TransferConfirmationReference must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReferenceRule.forTransferReference10);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReferenceRule.forTransferReference2;
			owner_lazy = () -> TransferReference6.mmObject();
		}

		@Override
		public void executeValidator(TransferReference6 obj) throws Exception {
			checkTransferReference6(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DocumentNumber12
	 * DocumentNumber12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The reference used to identify the transaction must be in line with the identification available for the status advice requested by the SecuritiesTransactionStatusQuery. For example, a SecuritiesTransactionStatusQuery must not request a SecuritiesSettlementTransactionStatusAdvice using a CorporateActionEventIdentification."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReferenceRule#forDocumentNumber9
	 * ConstraintReferenceRule.forDocumentNumber9}</li>
	 * </ul>
	 */
	public static final MMConstraint<DocumentNumber12> forDocumentNumber12 = new MMConstraint<DocumentNumber12>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceRule";
			definition = "The reference used to identify the transaction must be in line with the identification available for the status advice requested by the SecuritiesTransactionStatusQuery. For example, a SecuritiesTransactionStatusQuery must not request a SecuritiesSettlementTransactionStatusAdvice using a CorporateActionEventIdentification.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReferenceRule.forDocumentNumber9;
			owner_lazy = () -> DocumentNumber12.mmObject();
		}

		@Override
		public void executeValidator(DocumentNumber12 obj) throws Exception {
			checkDocumentNumber12(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransferReference10
	 * TransferReference10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "At least TransferReference or TransferConfirmationReference must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReferenceRule#forTransferReference6
	 * ConstraintReferenceRule.forTransferReference6}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransferReference10> forTransferReference10 = new MMConstraint<TransferReference10>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceRule";
			definition = "At least TransferReference or TransferConfirmationReference must be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReferenceRule.forTransferReference6;
			owner_lazy = () -> TransferReference10.mmObject();
		}

		@Override
		public void executeValidator(TransferReference10 obj) throws Exception {
			checkTransferReference10(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DocumentNumber15
	 * DocumentNumber15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The reference used to identify the transaction must be in line with the identification available for the status advice requested by the SecuritiesTransactionStatusQuery. For example, a SecuritiesTransactionStatusQuery must not request a SecuritiesSettlementTransactionStatusAdvice using a CorporateActionEventIdentification."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DocumentNumber15> forDocumentNumber15 = new MMConstraint<DocumentNumber15>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceRule";
			definition = "The reference used to identify the transaction must be in line with the identification available for the status advice requested by the SecuritiesTransactionStatusQuery. For example, a SecuritiesTransactionStatusQuery must not request a SecuritiesSettlementTransactionStatusAdvice using a CorporateActionEventIdentification.";
			owner_lazy = () -> DocumentNumber15.mmObject();
		}

		@Override
		public void executeValidator(DocumentNumber15 obj) throws Exception {
			checkDocumentNumber15(obj);
		}
	};

	/**
	 * At least TransferReference or TransferConfirmationReference must be
	 * present.
	 */
	public static void checkTransferReference2(TransferReference2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * At least OrderReference or DealReference must be present.
	 */
	public static void checkInvestmentFundOrderExecution2(InvestmentFundOrderExecution2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The reference used to identify the transaction must be in line with the
	 * identification available for the status advice requested by the
	 * SecuritiesTransactionStatusQuery. For example, a
	 * SecuritiesTransactionStatusQuery must not request a
	 * SecuritiesSettlementTransactionStatusAdvice using a
	 * CorporateActionEventIdentification.
	 */
	public static void checkDocumentNumber2(DocumentNumber2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The reference used to identify the transaction must be in line with the
	 * identification available for the status advice requested by the
	 * SecuritiesTransactionStatusQuery. For example, a
	 * SecuritiesTransactionStatusQuery must not request a
	 * SecuritiesSettlementTransactionStatusAdvice using a
	 * CorporateActionEventIdentification.
	 */
	public static void checkDocumentNumber6(DocumentNumber6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The reference used to identify the transaction must be in line with the
	 * identification available for the status advice requested by the
	 * SecuritiesTransactionStatusQuery. For example, a
	 * SecuritiesTransactionStatusQuery must not request a
	 * SecuritiesSettlementTransactionStatusAdvice using a
	 * CorporateActionEventIdentification.
	 */
	public static void checkDocumentNumber5(DocumentNumber5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The reference used to identify the transaction must be in line with the
	 * identification available for the status advice requested by the
	 * SecuritiesTransactionStatusQuery. For example, a
	 * SecuritiesTransactionStatusQuery must not request a
	 * SecuritiesSettlementTransactionStatusAdvice using a
	 * CorporateActionEventIdentification.
	 */
	public static void checkDocumentNumber4(DocumentNumber4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The reference used to identify the transaction must be in line with the
	 * identification available for the status advice requested by the
	 * SecuritiesTransactionStatusQuery. For example, a
	 * SecuritiesTransactionStatusQuery must not request a
	 * SecuritiesSettlementTransactionStatusAdvice using a
	 * CorporateActionEventIdentification.
	 */
	public static void checkDocumentNumber7(DocumentNumber7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The reference used to identify the transaction must be in line with the
	 * identification available for the status advice requested by the
	 * SecuritiesTransactionStatusQuery. For example, a
	 * SecuritiesTransactionStatusQuery must not request a
	 * SecuritiesSettlementTransactionStatusAdvice using a
	 * CorporateActionEventIdentification.
	 */
	public static void checkDocumentNumber9(DocumentNumber9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The reference used to identify the transaction must be in line with the
	 * identification available for the status advice requested by the
	 * SecuritiesTransactionStatusQuery. For example, a
	 * SecuritiesTransactionStatusQuery must not request a
	 * SecuritiesSettlementTransactionStatusAdvice using a
	 * CorporateActionEventIdentification.
	 */
	public static void checkDocumentNumber11(DocumentNumber11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The reference used to identify the transaction must be in line with the
	 * identification available for the status advice requested by the
	 * SecuritiesTransactionStatusQuery. For example, a
	 * SecuritiesTransactionStatusQuery must not request a
	 * SecuritiesSettlementTransactionStatusAdvice using a
	 * CorporateActionEventIdentification.
	 */
	public static void checkDocumentNumber8(DocumentNumber8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * At least TransferReference or TransferConfirmationReference must be
	 * present.
	 */
	public static void checkTransferReference6(TransferReference6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The reference used to identify the transaction must be in line with the
	 * identification available for the status advice requested by the
	 * SecuritiesTransactionStatusQuery. For example, a
	 * SecuritiesTransactionStatusQuery must not request a
	 * SecuritiesSettlementTransactionStatusAdvice using a
	 * CorporateActionEventIdentification.
	 */
	public static void checkDocumentNumber12(DocumentNumber12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * At least TransferReference or TransferConfirmationReference must be
	 * present.
	 */
	public static void checkTransferReference10(TransferReference10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The reference used to identify the transaction must be in line with the
	 * identification available for the status advice requested by the
	 * SecuritiesTransactionStatusQuery. For example, a
	 * SecuritiesTransactionStatusQuery must not request a
	 * SecuritiesSettlementTransactionStatusAdvice using a
	 * CorporateActionEventIdentification.
	 */
	public static void checkDocumentNumber15(DocumentNumber15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}