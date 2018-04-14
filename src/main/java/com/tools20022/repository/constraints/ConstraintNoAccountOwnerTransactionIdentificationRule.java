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
import com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequest002V05;
import com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestV04;
import com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestV05;
import com.tools20022.repository.msg.*;
import java.util.Arrays;

/**
 * If no reference is available for the AccountOwnerTransactionIdentification,
 * for example, the transaction was sent by fax, then the
 * AccountOwnerTransactionIdentification must be NONREF.
 */
public class ConstraintNoAccountOwnerTransactionIdentificationRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transaction46 Transaction46}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule#forTransaction52
	 * ConstraintNoAccountOwnerTransactionIdentificationRule.forTransaction52}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule#forTransaction36
	 * ConstraintNoAccountOwnerTransactionIdentificationRule.forTransaction36}</li>
	 * </ul>
	 */
	public static final MMConstraint<Transaction46> forTransaction46 = new MMConstraint<Transaction46>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule.forTransaction52);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule.forTransaction36;
			owner_lazy = () -> Transaction46.mmObject();
		}

		@Override
		public void executeValidator(Transaction46 obj) throws Exception {
			checkTransaction46(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transaction58 Transaction58}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule#forTransaction51
	 * ConstraintNoAccountOwnerTransactionIdentificationRule.forTransaction51}</li>
	 * </ul>
	 */
	public static final MMConstraint<Transaction58> forTransaction58 = new MMConstraint<Transaction58>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule.forTransaction51;
			owner_lazy = () -> Transaction58.mmObject();
		}

		@Override
		public void executeValidator(Transaction58 obj) throws Exception {
			checkTransaction58(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications13
	 * TransactionIdentifications13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionIdentifications13> forTransactionIdentifications13 = new MMConstraint<TransactionIdentifications13>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> TransactionIdentifications13.mmObject();
		}

		@Override
		public void executeValidator(TransactionIdentifications13 obj) throws Exception {
			checkTransactionIdentifications13(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transaction55 Transaction55}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<Transaction55> forTransaction55 = new MMConstraint<Transaction55>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> Transaction55.mmObject();
		}

		@Override
		public void executeValidator(Transaction55 obj) throws Exception {
			checkTransaction55(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transaction25 Transaction25}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule#forTransaction51
	 * ConstraintNoAccountOwnerTransactionIdentificationRule.forTransaction51}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Transaction25> forTransaction25 = new MMConstraint<Transaction25>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule.forTransaction51);
			owner_lazy = () -> Transaction25.mmObject();
		}

		@Override
		public void executeValidator(Transaction25 obj) throws Exception {
			checkTransaction25(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement1
	 * IntraPositionMovement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule#forIntraPositionMovement3
	 * ConstraintNoAccountOwnerTransactionIdentificationRule.
	 * forIntraPositionMovement3}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionMovement1> forIntraPositionMovement1 = new MMConstraint<IntraPositionMovement1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule.forIntraPositionMovement3);
			owner_lazy = () -> IntraPositionMovement1.mmObject();
		}

		@Override
		public void executeValidator(IntraPositionMovement1 obj) throws Exception {
			checkIntraPositionMovement1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestV04
	 * SecuritiesTransactionCancellationRequestV04}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule#for_sese_SecuritiesTransactionCancellationRequestV05
	 * ConstraintNoAccountOwnerTransactionIdentificationRule.
	 * for_sese_SecuritiesTransactionCancellationRequestV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionCancellationRequestV04> for_sese_SecuritiesTransactionCancellationRequestV04 = new MMConstraint<SecuritiesTransactionCancellationRequestV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, then the AccountOwnerTransactionIdentification must be NONREF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule.for_sese_SecuritiesTransactionCancellationRequestV05);
			owner_lazy = () -> SecuritiesTransactionCancellationRequestV04.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTransactionCancellationRequestV04 obj) throws Exception {
			check_sese_SecuritiesTransactionCancellationRequestV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification17
	 * SettlementTypeAndIdentification17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementTypeAndIdentification17> forSettlementTypeAndIdentification17 = new MMConstraint<SettlementTypeAndIdentification17>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> SettlementTypeAndIdentification17.mmObject();
		}

		@Override
		public void executeValidator(SettlementTypeAndIdentification17 obj) throws Exception {
			checkSettlementTypeAndIdentification17(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transaction36 Transaction36}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule#forTransaction46
	 * ConstraintNoAccountOwnerTransactionIdentificationRule.forTransaction46}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule#forTransaction29
	 * ConstraintNoAccountOwnerTransactionIdentificationRule.forTransaction29}</li>
	 * </ul>
	 */
	public static final MMConstraint<Transaction36> forTransaction36 = new MMConstraint<Transaction36>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule.forTransaction46);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule.forTransaction29;
			owner_lazy = () -> Transaction36.mmObject();
		}

		@Override
		public void executeValidator(Transaction36 obj) throws Exception {
			checkTransaction36(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transaction54 Transaction54}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule#forTransaction61
	 * ConstraintNoAccountOwnerTransactionIdentificationRule.forTransaction61}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule#forTransaction45
	 * ConstraintNoAccountOwnerTransactionIdentificationRule.forTransaction45}</li>
	 * </ul>
	 */
	public static final MMConstraint<Transaction54> forTransaction54 = new MMConstraint<Transaction54>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule.forTransaction61);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule.forTransaction45;
			owner_lazy = () -> Transaction54.mmObject();
		}

		@Override
		public void executeValidator(Transaction54 obj) throws Exception {
			checkTransaction54(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transaction15 Transaction15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<Transaction15> forTransaction15 = new MMConstraint<Transaction15>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> Transaction15.mmObject();
		}

		@Override
		public void executeValidator(Transaction15 obj) throws Exception {
			checkTransaction15(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transaction45 Transaction45}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule#forTransaction54
	 * ConstraintNoAccountOwnerTransactionIdentificationRule.forTransaction54}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule#forTransaction40
	 * ConstraintNoAccountOwnerTransactionIdentificationRule.forTransaction40}</li>
	 * </ul>
	 */
	public static final MMConstraint<Transaction45> forTransaction45 = new MMConstraint<Transaction45>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule.forTransaction54);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule.forTransaction40;
			owner_lazy = () -> Transaction45.mmObject();
		}

		@Override
		public void executeValidator(Transaction45 obj) throws Exception {
			checkTransaction45(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transaction38 Transaction38}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<Transaction38> forTransaction38 = new MMConstraint<Transaction38>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> Transaction38.mmObject();
		}

		@Override
		public void executeValidator(Transaction38 obj) throws Exception {
			checkTransaction38(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications35
	 * TransactionIdentifications35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionIdentifications35> forTransactionIdentifications35 = new MMConstraint<TransactionIdentifications35>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> TransactionIdentifications35.mmObject();
		}

		@Override
		public void executeValidator(TransactionIdentifications35 obj) throws Exception {
			checkTransactionIdentifications35(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications22
	 * TransactionIdentifications22}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionIdentifications22> forTransactionIdentifications22 = new MMConstraint<TransactionIdentifications22>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> TransactionIdentifications22.mmObject();
		}

		@Override
		public void executeValidator(TransactionIdentifications22 obj) throws Exception {
			checkTransactionIdentifications22(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transaction63 Transaction63}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<Transaction63> forTransaction63 = new MMConstraint<Transaction63>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> Transaction63.mmObject();
		}

		@Override
		public void executeValidator(Transaction63 obj) throws Exception {
			checkTransaction63(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications8
	 * TransactionIdentifications8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionIdentifications8> forTransactionIdentifications8 = new MMConstraint<TransactionIdentifications8>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> TransactionIdentifications8.mmObject();
		}

		@Override
		public void executeValidator(TransactionIdentifications8 obj) throws Exception {
			checkTransactionIdentifications8(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transaction31 Transaction31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<Transaction31> forTransaction31 = new MMConstraint<Transaction31>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> Transaction31.mmObject();
		}

		@Override
		public void executeValidator(Transaction31 obj) throws Exception {
			checkTransaction31(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails106
	 * TransactionDetails106}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule#forTransactionDetails76
	 * ConstraintNoAccountOwnerTransactionIdentificationRule.
	 * forTransactionDetails76}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails106> forTransactionDetails106 = new MMConstraint<TransactionDetails106>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, then the AccountOwnerTransactionIdentification must be NONREF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule.forTransactionDetails76;
			owner_lazy = () -> TransactionDetails106.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails106 obj) throws Exception {
			checkTransactionDetails106(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transaction29 Transaction29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule#forTransaction36
	 * ConstraintNoAccountOwnerTransactionIdentificationRule.forTransaction36}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Transaction29> forTransaction29 = new MMConstraint<Transaction29>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule.forTransaction36);
			owner_lazy = () -> Transaction29.mmObject();
		}

		@Override
		public void executeValidator(Transaction29 obj) throws Exception {
			checkTransaction29(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalancePending4
	 * IntraBalancePending4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule#forIntraBalancePending2
	 * ConstraintNoAccountOwnerTransactionIdentificationRule.
	 * forIntraBalancePending2}</li>
	 * </ul>
	 */
	public static final MMConstraint<IntraBalancePending4> forIntraBalancePending4 = new MMConstraint<IntraBalancePending4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule.forIntraBalancePending2;
			owner_lazy = () -> IntraBalancePending4.mmObject();
		}

		@Override
		public void executeValidator(IntraBalancePending4 obj) throws Exception {
			checkIntraBalancePending4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transaction42 Transaction42}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<Transaction42> forTransaction42 = new MMConstraint<Transaction42>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> Transaction42.mmObject();
		}

		@Override
		public void executeValidator(Transaction42 obj) throws Exception {
			checkTransaction42(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transaction43 Transaction43}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<Transaction43> forTransaction43 = new MMConstraint<Transaction43>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> Transaction43.mmObject();
		}

		@Override
		public void executeValidator(Transaction43 obj) throws Exception {
			checkTransaction43(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification10
	 * SettlementTypeAndIdentification10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementTypeAndIdentification10> forSettlementTypeAndIdentification10 = new MMConstraint<SettlementTypeAndIdentification10>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> SettlementTypeAndIdentification10.mmObject();
		}

		@Override
		public void executeValidator(SettlementTypeAndIdentification10 obj) throws Exception {
			checkSettlementTypeAndIdentification10(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transaction32 Transaction32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<Transaction32> forTransaction32 = new MMConstraint<Transaction32>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> Transaction32.mmObject();
		}

		@Override
		public void executeValidator(Transaction32 obj) throws Exception {
			checkTransaction32(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications15
	 * TransactionIdentifications15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule#forTransactionIdentifications29
	 * ConstraintNoAccountOwnerTransactionIdentificationRule.
	 * forTransactionIdentifications29}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionIdentifications15> forTransactionIdentifications15 = new MMConstraint<TransactionIdentifications15>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule.forTransactionIdentifications29);
			owner_lazy = () -> TransactionIdentifications15.mmObject();
		}

		@Override
		public void executeValidator(TransactionIdentifications15 obj) throws Exception {
			checkTransactionIdentifications15(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transaction49 Transaction49}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<Transaction49> forTransaction49 = new MMConstraint<Transaction49>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> Transaction49.mmObject();
		}

		@Override
		public void executeValidator(Transaction49 obj) throws Exception {
			checkTransaction49(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications12
	 * TransactionIdentifications12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionIdentifications12> forTransactionIdentifications12 = new MMConstraint<TransactionIdentifications12>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> TransactionIdentifications12.mmObject();
		}

		@Override
		public void executeValidator(TransactionIdentifications12 obj) throws Exception {
			checkTransactionIdentifications12(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transaction13 Transaction13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<Transaction13> forTransaction13 = new MMConstraint<Transaction13>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> Transaction13.mmObject();
		}

		@Override
		public void executeValidator(Transaction13 obj) throws Exception {
			checkTransaction13(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestV05
	 * SecuritiesTransactionCancellationRequestV05}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule#for_sese_SecuritiesTransactionCancellationRequestV04
	 * ConstraintNoAccountOwnerTransactionIdentificationRule.
	 * for_sese_SecuritiesTransactionCancellationRequestV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionCancellationRequestV05> for_sese_SecuritiesTransactionCancellationRequestV05 = new MMConstraint<SecuritiesTransactionCancellationRequestV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, then the AccountOwnerTransactionIdentification must be NONREF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule.for_sese_SecuritiesTransactionCancellationRequestV04;
			owner_lazy = () -> SecuritiesTransactionCancellationRequestV05.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTransactionCancellationRequestV05 obj) throws Exception {
			check_sese_SecuritiesTransactionCancellationRequestV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications5
	 * TransactionIdentifications5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionIdentifications5> forTransactionIdentifications5 = new MMConstraint<TransactionIdentifications5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> TransactionIdentifications5.mmObject();
		}

		@Override
		public void executeValidator(TransactionIdentifications5 obj) throws Exception {
			checkTransactionIdentifications5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceMovement1
	 * IntraBalanceMovement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule#forIntraBalanceMovement3
	 * ConstraintNoAccountOwnerTransactionIdentificationRule.
	 * forIntraBalanceMovement3}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraBalanceMovement1> forIntraBalanceMovement1 = new MMConstraint<IntraBalanceMovement1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule.forIntraBalanceMovement3);
			owner_lazy = () -> IntraBalanceMovement1.mmObject();
		}

		@Override
		public void executeValidator(IntraBalanceMovement1 obj) throws Exception {
			checkIntraBalanceMovement1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionPending6
	 * IntraPositionPending6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule#forIntraPositionPending4
	 * ConstraintNoAccountOwnerTransactionIdentificationRule.
	 * forIntraPositionPending4}</li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionPending6> forIntraPositionPending6 = new MMConstraint<IntraPositionPending6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule.forIntraPositionPending4;
			owner_lazy = () -> IntraPositionPending6.mmObject();
		}

		@Override
		public void executeValidator(IntraPositionPending6 obj) throws Exception {
			checkIntraPositionPending6(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transaction19 Transaction19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<Transaction19> forTransaction19 = new MMConstraint<Transaction19>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> Transaction19.mmObject();
		}

		@Override
		public void executeValidator(Transaction19 obj) throws Exception {
			checkTransaction19(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule#forTransactionDetails85
	 * ConstraintNoAccountOwnerTransactionIdentificationRule.
	 * forTransactionDetails85}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails101> forTransactionDetails101 = new MMConstraint<TransactionDetails101>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, then the AccountOwnerTransactionIdentification must be NONREF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule.forTransactionDetails85;
			owner_lazy = () -> TransactionDetails101.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails101 obj) throws Exception {
			checkTransactionDetails101(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule#forTransactionDetails101
	 * ConstraintNoAccountOwnerTransactionIdentificationRule.
	 * forTransactionDetails101}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails85> forTransactionDetails85 = new MMConstraint<TransactionDetails85>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, then the AccountOwnerTransactionIdentification must be NONREF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule.forTransactionDetails101);
			owner_lazy = () -> TransactionDetails85.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails85 obj) throws Exception {
			checkTransactionDetails85(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transaction61 Transaction61}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule#forTransaction54
	 * ConstraintNoAccountOwnerTransactionIdentificationRule.forTransaction54}</li>
	 * </ul>
	 */
	public static final MMConstraint<Transaction61> forTransaction61 = new MMConstraint<Transaction61>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule.forTransaction54;
			owner_lazy = () -> Transaction61.mmObject();
		}

		@Override
		public void executeValidator(Transaction61 obj) throws Exception {
			checkTransaction61(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transaction28 Transaction28}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule#forTransaction35
	 * ConstraintNoAccountOwnerTransactionIdentificationRule.forTransaction35}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Transaction28> forTransaction28 = new MMConstraint<Transaction28>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule.forTransaction35);
			owner_lazy = () -> Transaction28.mmObject();
		}

		@Override
		public void executeValidator(Transaction28 obj) throws Exception {
			checkTransaction28(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequest002V05
	 * SecuritiesTransactionCancellationRequest002V05}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionCancellationRequest002V05> for_sese_SecuritiesTransactionCancellationRequest002V05 = new MMConstraint<SecuritiesTransactionCancellationRequest002V05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> SecuritiesTransactionCancellationRequest002V05.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTransactionCancellationRequest002V05 obj) throws Exception {
			check_sese_SecuritiesTransactionCancellationRequest002V05(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule#forTransactionDetails76
	 * ConstraintNoAccountOwnerTransactionIdentificationRule.
	 * forTransactionDetails76}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails64> forTransactionDetails64 = new MMConstraint<TransactionDetails64>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, then the AccountOwnerTransactionIdentification must be NONREF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule.forTransactionDetails76);
			owner_lazy = () -> TransactionDetails64.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails64 obj) throws Exception {
			checkTransactionDetails64(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications6
	 * TransactionIdentifications6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionIdentifications6> forTransactionIdentifications6 = new MMConstraint<TransactionIdentifications6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> TransactionIdentifications6.mmObject();
		}

		@Override
		public void executeValidator(TransactionIdentifications6 obj) throws Exception {
			checkTransactionIdentifications6(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications31
	 * TransactionIdentifications31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule#forTransactionIdentifications16
	 * ConstraintNoAccountOwnerTransactionIdentificationRule.
	 * forTransactionIdentifications16}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionIdentifications31> forTransactionIdentifications31 = new MMConstraint<TransactionIdentifications31>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule.forTransactionIdentifications16;
			owner_lazy = () -> TransactionIdentifications31.mmObject();
		}

		@Override
		public void executeValidator(TransactionIdentifications31 obj) throws Exception {
			checkTransactionIdentifications31(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transaction27 Transaction27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule#forTransaction34
	 * ConstraintNoAccountOwnerTransactionIdentificationRule.forTransaction34}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Transaction27> forTransaction27 = new MMConstraint<Transaction27>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule.forTransaction34);
			owner_lazy = () -> Transaction27.mmObject();
		}

		@Override
		public void executeValidator(Transaction27 obj) throws Exception {
			checkTransaction27(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceMovement3
	 * IntraBalanceMovement3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule#forIntraBalanceMovement1
	 * ConstraintNoAccountOwnerTransactionIdentificationRule.
	 * forIntraBalanceMovement1}</li>
	 * </ul>
	 */
	public static final MMConstraint<IntraBalanceMovement3> forIntraBalanceMovement3 = new MMConstraint<IntraBalanceMovement3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule.forIntraBalanceMovement1;
			owner_lazy = () -> IntraBalanceMovement3.mmObject();
		}

		@Override
		public void executeValidator(IntraBalanceMovement3 obj) throws Exception {
			checkIntraBalanceMovement3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification8
	 * SettlementTypeAndIdentification8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementTypeAndIdentification8> forSettlementTypeAndIdentification8 = new MMConstraint<SettlementTypeAndIdentification8>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> SettlementTypeAndIdentification8.mmObject();
		}

		@Override
		public void executeValidator(SettlementTypeAndIdentification8 obj) throws Exception {
			checkSettlementTypeAndIdentification8(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transaction51 Transaction51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule#forTransaction58
	 * ConstraintNoAccountOwnerTransactionIdentificationRule.forTransaction58}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule#forTransaction25
	 * ConstraintNoAccountOwnerTransactionIdentificationRule.forTransaction25}</li>
	 * </ul>
	 */
	public static final MMConstraint<Transaction51> forTransaction51 = new MMConstraint<Transaction51>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule.forTransaction58);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule.forTransaction25;
			owner_lazy = () -> Transaction51.mmObject();
		}

		@Override
		public void executeValidator(Transaction51 obj) throws Exception {
			checkTransaction51(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification15
	 * SettlementTypeAndIdentification15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule#forSettlementTypeAndIdentification19
	 * ConstraintNoAccountOwnerTransactionIdentificationRule.
	 * forSettlementTypeAndIdentification19}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementTypeAndIdentification15> forSettlementTypeAndIdentification15 = new MMConstraint<SettlementTypeAndIdentification15>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule.forSettlementTypeAndIdentification19);
			owner_lazy = () -> SettlementTypeAndIdentification15.mmObject();
		}

		@Override
		public void executeValidator(SettlementTypeAndIdentification15 obj) throws Exception {
			checkSettlementTypeAndIdentification15(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transaction39 Transaction39}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<Transaction39> forTransaction39 = new MMConstraint<Transaction39>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> Transaction39.mmObject();
		}

		@Override
		public void executeValidator(Transaction39 obj) throws Exception {
			checkTransaction39(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications25
	 * TransactionIdentifications25}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule#forTransactionIdentifications33
	 * ConstraintNoAccountOwnerTransactionIdentificationRule.
	 * forTransactionIdentifications33}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule#forTransactionIdentifications18
	 * ConstraintNoAccountOwnerTransactionIdentificationRule.
	 * forTransactionIdentifications18}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionIdentifications25> forTransactionIdentifications25 = new MMConstraint<TransactionIdentifications25>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, then the AccountOwnerTransactionIdentification must be NONREF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule.forTransactionIdentifications33);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule.forTransactionIdentifications18;
			owner_lazy = () -> TransactionIdentifications25.mmObject();
		}

		@Override
		public void executeValidator(TransactionIdentifications25 obj) throws Exception {
			checkTransactionIdentifications25(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transaction53 Transaction53}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule#forTransaction60
	 * ConstraintNoAccountOwnerTransactionIdentificationRule.forTransaction60}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule#forTransaction47
	 * ConstraintNoAccountOwnerTransactionIdentificationRule.forTransaction47}</li>
	 * </ul>
	 */
	public static final MMConstraint<Transaction53> forTransaction53 = new MMConstraint<Transaction53>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule.forTransaction60);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule.forTransaction47;
			owner_lazy = () -> Transaction53.mmObject();
		}

		@Override
		public void executeValidator(Transaction53 obj) throws Exception {
			checkTransaction53(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement3
	 * IntraPositionMovement3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule#forIntraPositionMovement5
	 * ConstraintNoAccountOwnerTransactionIdentificationRule.
	 * forIntraPositionMovement5}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule#forIntraPositionMovement1
	 * ConstraintNoAccountOwnerTransactionIdentificationRule.
	 * forIntraPositionMovement1}</li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionMovement3> forIntraPositionMovement3 = new MMConstraint<IntraPositionMovement3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule.forIntraPositionMovement5);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule.forIntraPositionMovement1;
			owner_lazy = () -> IntraPositionMovement3.mmObject();
		}

		@Override
		public void executeValidator(IntraPositionMovement3 obj) throws Exception {
			checkIntraPositionMovement3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications30
	 * TransactionIdentifications30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule#forTransactionIdentifications17
	 * ConstraintNoAccountOwnerTransactionIdentificationRule.
	 * forTransactionIdentifications17}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionIdentifications30> forTransactionIdentifications30 = new MMConstraint<TransactionIdentifications30>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule.forTransactionIdentifications17;
			owner_lazy = () -> TransactionIdentifications30.mmObject();
		}

		@Override
		public void executeValidator(TransactionIdentifications30 obj) throws Exception {
			checkTransactionIdentifications30(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transaction23 Transaction23}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<Transaction23> forTransaction23 = new MMConstraint<Transaction23>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> Transaction23.mmObject();
		}

		@Override
		public void executeValidator(Transaction23 obj) throws Exception {
			checkTransaction23(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transaction57 Transaction57}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<Transaction57> forTransaction57 = new MMConstraint<Transaction57>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> Transaction57.mmObject();
		}

		@Override
		public void executeValidator(Transaction57 obj) throws Exception {
			checkTransaction57(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transaction9 Transaction9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<Transaction9> forTransaction9 = new MMConstraint<Transaction9>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> Transaction9.mmObject();
		}

		@Override
		public void executeValidator(Transaction9 obj) throws Exception {
			checkTransaction9(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications23
	 * TransactionIdentifications23}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionIdentifications23> forTransactionIdentifications23 = new MMConstraint<TransactionIdentifications23>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> TransactionIdentifications23.mmObject();
		}

		@Override
		public void executeValidator(TransactionIdentifications23 obj) throws Exception {
			checkTransactionIdentifications23(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications2
	 * TransactionIdentifications2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionIdentifications2> forTransactionIdentifications2 = new MMConstraint<TransactionIdentifications2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> TransactionIdentifications2.mmObject();
		}

		@Override
		public void executeValidator(TransactionIdentifications2 obj) throws Exception {
			checkTransactionIdentifications2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications4
	 * TransactionIdentifications4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionIdentifications4> forTransactionIdentifications4 = new MMConstraint<TransactionIdentifications4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> TransactionIdentifications4.mmObject();
		}

		@Override
		public void executeValidator(TransactionIdentifications4 obj) throws Exception {
			checkTransactionIdentifications4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transaction16 Transaction16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<Transaction16> forTransaction16 = new MMConstraint<Transaction16>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> Transaction16.mmObject();
		}

		@Override
		public void executeValidator(Transaction16 obj) throws Exception {
			checkTransaction16(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications24
	 * TransactionIdentifications24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionIdentifications24> forTransactionIdentifications24 = new MMConstraint<TransactionIdentifications24>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> TransactionIdentifications24.mmObject();
		}

		@Override
		public void executeValidator(TransactionIdentifications24 obj) throws Exception {
			checkTransactionIdentifications24(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transaction41 Transaction41}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule#forTransaction47
	 * ConstraintNoAccountOwnerTransactionIdentificationRule.forTransaction47}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule#forTransaction34
	 * ConstraintNoAccountOwnerTransactionIdentificationRule.forTransaction34}</li>
	 * </ul>
	 */
	public static final MMConstraint<Transaction41> forTransaction41 = new MMConstraint<Transaction41>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule.forTransaction47);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule.forTransaction34;
			owner_lazy = () -> Transaction41.mmObject();
		}

		@Override
		public void executeValidator(Transaction41 obj) throws Exception {
			checkTransaction41(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications39
	 * TransactionIdentifications39}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionIdentifications39> forTransactionIdentifications39 = new MMConstraint<TransactionIdentifications39>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> TransactionIdentifications39.mmObject();
		}

		@Override
		public void executeValidator(TransactionIdentifications39 obj) throws Exception {
			checkTransactionIdentifications39(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications37
	 * TransactionIdentifications37}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionIdentifications37> forTransactionIdentifications37 = new MMConstraint<TransactionIdentifications37>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> TransactionIdentifications37.mmObject();
		}

		@Override
		public void executeValidator(TransactionIdentifications37 obj) throws Exception {
			checkTransactionIdentifications37(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications10
	 * TransactionIdentifications10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionIdentifications10> forTransactionIdentifications10 = new MMConstraint<TransactionIdentifications10>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> TransactionIdentifications10.mmObject();
		}

		@Override
		public void executeValidator(TransactionIdentifications10 obj) throws Exception {
			checkTransactionIdentifications10(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications9
	 * TransactionIdentifications9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionIdentifications9> forTransactionIdentifications9 = new MMConstraint<TransactionIdentifications9>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> TransactionIdentifications9.mmObject();
		}

		@Override
		public void executeValidator(TransactionIdentifications9 obj) throws Exception {
			checkTransactionIdentifications9(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification9
	 * SettlementTypeAndIdentification9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementTypeAndIdentification9> forSettlementTypeAndIdentification9 = new MMConstraint<SettlementTypeAndIdentification9>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> SettlementTypeAndIdentification9.mmObject();
		}

		@Override
		public void executeValidator(SettlementTypeAndIdentification9 obj) throws Exception {
			checkSettlementTypeAndIdentification9(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transaction65 Transaction65}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<Transaction65> forTransaction65 = new MMConstraint<Transaction65>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> Transaction65.mmObject();
		}

		@Override
		public void executeValidator(Transaction65 obj) throws Exception {
			checkTransaction65(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transaction52 Transaction52}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule#forTransaction62
	 * ConstraintNoAccountOwnerTransactionIdentificationRule.forTransaction62}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule#forTransaction46
	 * ConstraintNoAccountOwnerTransactionIdentificationRule.forTransaction46}</li>
	 * </ul>
	 */
	public static final MMConstraint<Transaction52> forTransaction52 = new MMConstraint<Transaction52>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule.forTransaction62);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule.forTransaction46;
			owner_lazy = () -> Transaction52.mmObject();
		}

		@Override
		public void executeValidator(Transaction52 obj) throws Exception {
			checkTransaction52(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalancePosting4
	 * IntraBalancePosting4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule#forIntraBalancePosting2
	 * ConstraintNoAccountOwnerTransactionIdentificationRule.
	 * forIntraBalancePosting2}</li>
	 * </ul>
	 */
	public static final MMConstraint<IntraBalancePosting4> forIntraBalancePosting4 = new MMConstraint<IntraBalancePosting4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule.forIntraBalancePosting2;
			owner_lazy = () -> IntraBalancePosting4.mmObject();
		}

		@Override
		public void executeValidator(IntraBalancePosting4 obj) throws Exception {
			checkIntraBalancePosting4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transaction60 Transaction60}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule#forTransaction53
	 * ConstraintNoAccountOwnerTransactionIdentificationRule.forTransaction53}</li>
	 * </ul>
	 */
	public static final MMConstraint<Transaction60> forTransaction60 = new MMConstraint<Transaction60>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule.forTransaction53;
			owner_lazy = () -> Transaction60.mmObject();
		}

		@Override
		public void executeValidator(Transaction60 obj) throws Exception {
			checkTransaction60(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications11
	 * TransactionIdentifications11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionIdentifications11> forTransactionIdentifications11 = new MMConstraint<TransactionIdentifications11>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> TransactionIdentifications11.mmObject();
		}

		@Override
		public void executeValidator(TransactionIdentifications11 obj) throws Exception {
			checkTransactionIdentifications11(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications17
	 * TransactionIdentifications17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule#forTransactionIdentifications30
	 * ConstraintNoAccountOwnerTransactionIdentificationRule.
	 * forTransactionIdentifications30}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionIdentifications17> forTransactionIdentifications17 = new MMConstraint<TransactionIdentifications17>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule.forTransactionIdentifications30);
			owner_lazy = () -> TransactionIdentifications17.mmObject();
		}

		@Override
		public void executeValidator(TransactionIdentifications17 obj) throws Exception {
			checkTransactionIdentifications17(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transaction48 Transaction48}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<Transaction48> forTransaction48 = new MMConstraint<Transaction48>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> Transaction48.mmObject();
		}

		@Override
		public void executeValidator(Transaction48 obj) throws Exception {
			checkTransaction48(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification1
	 * SettlementTypeAndIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementTypeAndIdentification1> forSettlementTypeAndIdentification1 = new MMConstraint<SettlementTypeAndIdentification1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> SettlementTypeAndIdentification1.mmObject();
		}

		@Override
		public void executeValidator(SettlementTypeAndIdentification1 obj) throws Exception {
			checkSettlementTypeAndIdentification1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications19
	 * TransactionIdentifications19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionIdentifications19> forTransactionIdentifications19 = new MMConstraint<TransactionIdentifications19>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> TransactionIdentifications19.mmObject();
		}

		@Override
		public void executeValidator(TransactionIdentifications19 obj) throws Exception {
			checkTransactionIdentifications19(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transaction22 Transaction22}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<Transaction22> forTransaction22 = new MMConstraint<Transaction22>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> Transaction22.mmObject();
		}

		@Override
		public void executeValidator(Transaction22 obj) throws Exception {
			checkTransaction22(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transaction35 Transaction35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule#forTransaction40
	 * ConstraintNoAccountOwnerTransactionIdentificationRule.forTransaction40}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule#forTransaction28
	 * ConstraintNoAccountOwnerTransactionIdentificationRule.forTransaction28}</li>
	 * </ul>
	 */
	public static final MMConstraint<Transaction35> forTransaction35 = new MMConstraint<Transaction35>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule.forTransaction40);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule.forTransaction28;
			owner_lazy = () -> Transaction35.mmObject();
		}

		@Override
		public void executeValidator(Transaction35 obj) throws Exception {
			checkTransaction35(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement5
	 * IntraPositionMovement5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule#forIntraPositionMovement3
	 * ConstraintNoAccountOwnerTransactionIdentificationRule.
	 * forIntraPositionMovement3}</li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionMovement5> forIntraPositionMovement5 = new MMConstraint<IntraPositionMovement5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule.forIntraPositionMovement3;
			owner_lazy = () -> IntraPositionMovement5.mmObject();
		}

		@Override
		public void executeValidator(IntraPositionMovement5 obj) throws Exception {
			checkIntraPositionMovement5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionPending2
	 * IntraPositionPending2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule#forIntraPositionPending4
	 * ConstraintNoAccountOwnerTransactionIdentificationRule.
	 * forIntraPositionPending4}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionPending2> forIntraPositionPending2 = new MMConstraint<IntraPositionPending2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule.forIntraPositionPending4);
			owner_lazy = () -> IntraPositionPending2.mmObject();
		}

		@Override
		public void executeValidator(IntraPositionPending2 obj) throws Exception {
			checkIntraPositionPending2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications32
	 * TransactionIdentifications32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule#forTransactionIdentifications1
	 * ConstraintNoAccountOwnerTransactionIdentificationRule.
	 * forTransactionIdentifications1}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionIdentifications32> forTransactionIdentifications32 = new MMConstraint<TransactionIdentifications32>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule.forTransactionIdentifications1;
			owner_lazy = () -> TransactionIdentifications32.mmObject();
		}

		@Override
		public void executeValidator(TransactionIdentifications32 obj) throws Exception {
			checkTransactionIdentifications32(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails108
	 * TransactionDetails108}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails108> forTransactionDetails108 = new MMConstraint<TransactionDetails108>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> TransactionDetails108.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails108 obj) throws Exception {
			checkTransactionDetails108(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transaction18 Transaction18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<Transaction18> forTransaction18 = new MMConstraint<Transaction18>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> Transaction18.mmObject();
		}

		@Override
		public void executeValidator(Transaction18 obj) throws Exception {
			checkTransaction18(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transaction11 Transaction11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<Transaction11> forTransaction11 = new MMConstraint<Transaction11>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> Transaction11.mmObject();
		}

		@Override
		public void executeValidator(Transaction11 obj) throws Exception {
			checkTransaction11(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transaction20 Transaction20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<Transaction20> forTransaction20 = new MMConstraint<Transaction20>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> Transaction20.mmObject();
		}

		@Override
		public void executeValidator(Transaction20 obj) throws Exception {
			checkTransaction20(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transaction7 Transaction7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<Transaction7> forTransaction7 = new MMConstraint<Transaction7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> Transaction7.mmObject();
		}

		@Override
		public void executeValidator(Transaction7 obj) throws Exception {
			checkTransaction7(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications16
	 * TransactionIdentifications16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule#forTransactionIdentifications31
	 * ConstraintNoAccountOwnerTransactionIdentificationRule.
	 * forTransactionIdentifications31}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionIdentifications16> forTransactionIdentifications16 = new MMConstraint<TransactionIdentifications16>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule.forTransactionIdentifications31);
			owner_lazy = () -> TransactionIdentifications16.mmObject();
		}

		@Override
		public void executeValidator(TransactionIdentifications16 obj) throws Exception {
			checkTransactionIdentifications16(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transaction14 Transaction14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<Transaction14> forTransaction14 = new MMConstraint<Transaction14>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> Transaction14.mmObject();
		}

		@Override
		public void executeValidator(Transaction14 obj) throws Exception {
			checkTransaction14(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalancePosting2
	 * IntraBalancePosting2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule#forIntraBalancePosting4
	 * ConstraintNoAccountOwnerTransactionIdentificationRule.
	 * forIntraBalancePosting4}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraBalancePosting2> forIntraBalancePosting2 = new MMConstraint<IntraBalancePosting2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule.forIntraBalancePosting4);
			owner_lazy = () -> IntraBalancePosting2.mmObject();
		}

		@Override
		public void executeValidator(IntraBalancePosting2 obj) throws Exception {
			checkIntraBalancePosting2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transaction34 Transaction34}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule#forTransaction41
	 * ConstraintNoAccountOwnerTransactionIdentificationRule.forTransaction41}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule#forTransaction27
	 * ConstraintNoAccountOwnerTransactionIdentificationRule.forTransaction27}</li>
	 * </ul>
	 */
	public static final MMConstraint<Transaction34> forTransaction34 = new MMConstraint<Transaction34>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule.forTransaction41);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule.forTransaction27;
			owner_lazy = () -> Transaction34.mmObject();
		}

		@Override
		public void executeValidator(Transaction34 obj) throws Exception {
			checkTransaction34(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification11
	 * SettlementTypeAndIdentification11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementTypeAndIdentification11> forSettlementTypeAndIdentification11 = new MMConstraint<SettlementTypeAndIdentification11>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> SettlementTypeAndIdentification11.mmObject();
		}

		@Override
		public void executeValidator(SettlementTypeAndIdentification11 obj) throws Exception {
			checkSettlementTypeAndIdentification11(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transaction8 Transaction8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<Transaction8> forTransaction8 = new MMConstraint<Transaction8>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> Transaction8.mmObject();
		}

		@Override
		public void executeValidator(Transaction8 obj) throws Exception {
			checkTransaction8(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transaction21 Transaction21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<Transaction21> forTransaction21 = new MMConstraint<Transaction21>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> Transaction21.mmObject();
		}

		@Override
		public void executeValidator(Transaction21 obj) throws Exception {
			checkTransaction21(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications7
	 * TransactionIdentifications7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionIdentifications7> forTransactionIdentifications7 = new MMConstraint<TransactionIdentifications7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> TransactionIdentifications7.mmObject();
		}

		@Override
		public void executeValidator(TransactionIdentifications7 obj) throws Exception {
			checkTransactionIdentifications7(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications33
	 * TransactionIdentifications33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule#forTransactionIdentifications25
	 * ConstraintNoAccountOwnerTransactionIdentificationRule.
	 * forTransactionIdentifications25}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionIdentifications33> forTransactionIdentifications33 = new MMConstraint<TransactionIdentifications33>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, then the AccountOwnerTransactionIdentification must be NONREF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule.forTransactionIdentifications25;
			owner_lazy = () -> TransactionIdentifications33.mmObject();
		}

		@Override
		public void executeValidator(TransactionIdentifications33 obj) throws Exception {
			checkTransactionIdentifications33(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications34
	 * TransactionIdentifications34}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionIdentifications34> forTransactionIdentifications34 = new MMConstraint<TransactionIdentifications34>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> TransactionIdentifications34.mmObject();
		}

		@Override
		public void executeValidator(TransactionIdentifications34 obj) throws Exception {
			checkTransactionIdentifications34(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification24
	 * SettlementTypeAndIdentification24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementTypeAndIdentification24> forSettlementTypeAndIdentification24 = new MMConstraint<SettlementTypeAndIdentification24>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> SettlementTypeAndIdentification24.mmObject();
		}

		@Override
		public void executeValidator(SettlementTypeAndIdentification24 obj) throws Exception {
			checkSettlementTypeAndIdentification24(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transaction17 Transaction17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<Transaction17> forTransaction17 = new MMConstraint<Transaction17>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> Transaction17.mmObject();
		}

		@Override
		public void executeValidator(Transaction17 obj) throws Exception {
			checkTransaction17(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transaction30 Transaction30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<Transaction30> forTransaction30 = new MMConstraint<Transaction30>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> Transaction30.mmObject();
		}

		@Override
		public void executeValidator(Transaction30 obj) throws Exception {
			checkTransaction30(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails65> forTransactionDetails65 = new MMConstraint<TransactionDetails65>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> TransactionDetails65.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails65 obj) throws Exception {
			checkTransactionDetails65(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification19
	 * SettlementTypeAndIdentification19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule#forSettlementTypeAndIdentification15
	 * ConstraintNoAccountOwnerTransactionIdentificationRule.
	 * forSettlementTypeAndIdentification15}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementTypeAndIdentification19> forSettlementTypeAndIdentification19 = new MMConstraint<SettlementTypeAndIdentification19>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule.forSettlementTypeAndIdentification15;
			owner_lazy = () -> SettlementTypeAndIdentification19.mmObject();
		}

		@Override
		public void executeValidator(SettlementTypeAndIdentification19 obj) throws Exception {
			checkSettlementTypeAndIdentification19(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications18
	 * TransactionIdentifications18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule#forTransactionIdentifications25
	 * ConstraintNoAccountOwnerTransactionIdentificationRule.
	 * forTransactionIdentifications25}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionIdentifications18> forTransactionIdentifications18 = new MMConstraint<TransactionIdentifications18>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule.forTransactionIdentifications25);
			owner_lazy = () -> TransactionIdentifications18.mmObject();
		}

		@Override
		public void executeValidator(TransactionIdentifications18 obj) throws Exception {
			checkTransactionIdentifications18(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications20
	 * TransactionIdentifications20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionIdentifications20> forTransactionIdentifications20 = new MMConstraint<TransactionIdentifications20>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> TransactionIdentifications20.mmObject();
		}

		@Override
		public void executeValidator(TransactionIdentifications20 obj) throws Exception {
			checkTransactionIdentifications20(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transaction64 Transaction64}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<Transaction64> forTransaction64 = new MMConstraint<Transaction64>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> Transaction64.mmObject();
		}

		@Override
		public void executeValidator(Transaction64 obj) throws Exception {
			checkTransaction64(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transaction56 Transaction56}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<Transaction56> forTransaction56 = new MMConstraint<Transaction56>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> Transaction56.mmObject();
		}

		@Override
		public void executeValidator(Transaction56 obj) throws Exception {
			checkTransaction56(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transaction10 Transaction10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<Transaction10> forTransaction10 = new MMConstraint<Transaction10>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> Transaction10.mmObject();
		}

		@Override
		public void executeValidator(Transaction10 obj) throws Exception {
			checkTransaction10(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transaction47 Transaction47}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule#forTransaction53
	 * ConstraintNoAccountOwnerTransactionIdentificationRule.forTransaction53}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule#forTransaction41
	 * ConstraintNoAccountOwnerTransactionIdentificationRule.forTransaction41}</li>
	 * </ul>
	 */
	public static final MMConstraint<Transaction47> forTransaction47 = new MMConstraint<Transaction47>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule.forTransaction53);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule.forTransaction41;
			owner_lazy = () -> Transaction47.mmObject();
		}

		@Override
		public void executeValidator(Transaction47 obj) throws Exception {
			checkTransaction47(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications38
	 * TransactionIdentifications38}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionIdentifications38> forTransactionIdentifications38 = new MMConstraint<TransactionIdentifications38>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> TransactionIdentifications38.mmObject();
		}

		@Override
		public void executeValidator(TransactionIdentifications38 obj) throws Exception {
			checkTransactionIdentifications38(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications1
	 * TransactionIdentifications1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule#forTransactionIdentifications32
	 * ConstraintNoAccountOwnerTransactionIdentificationRule.
	 * forTransactionIdentifications32}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionIdentifications1> forTransactionIdentifications1 = new MMConstraint<TransactionIdentifications1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule.forTransactionIdentifications32);
			owner_lazy = () -> TransactionIdentifications1.mmObject();
		}

		@Override
		public void executeValidator(TransactionIdentifications1 obj) throws Exception {
			checkTransactionIdentifications1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification12
	 * SettlementTypeAndIdentification12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementTypeAndIdentification12> forSettlementTypeAndIdentification12 = new MMConstraint<SettlementTypeAndIdentification12>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> SettlementTypeAndIdentification12.mmObject();
		}

		@Override
		public void executeValidator(SettlementTypeAndIdentification12 obj) throws Exception {
			checkSettlementTypeAndIdentification12(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications14
	 * TransactionIdentifications14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionIdentifications14> forTransactionIdentifications14 = new MMConstraint<TransactionIdentifications14>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> TransactionIdentifications14.mmObject();
		}

		@Override
		public void executeValidator(TransactionIdentifications14 obj) throws Exception {
			checkTransactionIdentifications14(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications3
	 * TransactionIdentifications3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionIdentifications3> forTransactionIdentifications3 = new MMConstraint<TransactionIdentifications3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> TransactionIdentifications3.mmObject();
		}

		@Override
		public void executeValidator(TransactionIdentifications3 obj) throws Exception {
			checkTransactionIdentifications3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transaction37 Transaction37}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<Transaction37> forTransaction37 = new MMConstraint<Transaction37>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> Transaction37.mmObject();
		}

		@Override
		public void executeValidator(Transaction37 obj) throws Exception {
			checkTransaction37(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transaction50 Transaction50}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<Transaction50> forTransaction50 = new MMConstraint<Transaction50>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> Transaction50.mmObject();
		}

		@Override
		public void executeValidator(Transaction50 obj) throws Exception {
			checkTransaction50(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionPending4
	 * IntraPositionPending4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule#forIntraPositionPending6
	 * ConstraintNoAccountOwnerTransactionIdentificationRule.
	 * forIntraPositionPending6}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule#forIntraPositionPending2
	 * ConstraintNoAccountOwnerTransactionIdentificationRule.
	 * forIntraPositionPending2}</li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionPending4> forIntraPositionPending4 = new MMConstraint<IntraPositionPending4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule.forIntraPositionPending6);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule.forIntraPositionPending2;
			owner_lazy = () -> IntraPositionPending4.mmObject();
		}

		@Override
		public void executeValidator(IntraPositionPending4 obj) throws Exception {
			checkIntraPositionPending4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transaction6 Transaction6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<Transaction6> forTransaction6 = new MMConstraint<Transaction6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> Transaction6.mmObject();
		}

		@Override
		public void executeValidator(Transaction6 obj) throws Exception {
			checkTransaction6(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications29
	 * TransactionIdentifications29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule#forTransactionIdentifications15
	 * ConstraintNoAccountOwnerTransactionIdentificationRule.
	 * forTransactionIdentifications15}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionIdentifications29> forTransactionIdentifications29 = new MMConstraint<TransactionIdentifications29>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule.forTransactionIdentifications15;
			owner_lazy = () -> TransactionIdentifications29.mmObject();
		}

		@Override
		public void executeValidator(TransactionIdentifications29 obj) throws Exception {
			checkTransactionIdentifications29(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transaction62 Transaction62}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule#forTransaction52
	 * ConstraintNoAccountOwnerTransactionIdentificationRule.forTransaction52}</li>
	 * </ul>
	 */
	public static final MMConstraint<Transaction62> forTransaction62 = new MMConstraint<Transaction62>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule.forTransaction52;
			owner_lazy = () -> Transaction62.mmObject();
		}

		@Override
		public void executeValidator(Transaction62 obj) throws Exception {
			checkTransaction62(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transaction40 Transaction40}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule#forTransaction45
	 * ConstraintNoAccountOwnerTransactionIdentificationRule.forTransaction45}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule#forTransaction35
	 * ConstraintNoAccountOwnerTransactionIdentificationRule.forTransaction35}</li>
	 * </ul>
	 */
	public static final MMConstraint<Transaction40> forTransaction40 = new MMConstraint<Transaction40>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule.forTransaction45);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule.forTransaction35;
			owner_lazy = () -> Transaction40.mmObject();
		}

		@Override
		public void executeValidator(Transaction40 obj) throws Exception {
			checkTransaction40(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalancePending2
	 * IntraBalancePending2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule#forIntraBalancePending4
	 * ConstraintNoAccountOwnerTransactionIdentificationRule.
	 * forIntraBalancePending4}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraBalancePending2> forIntraBalancePending2 = new MMConstraint<IntraBalancePending2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule.forIntraBalancePending4);
			owner_lazy = () -> IntraBalancePending2.mmObject();
		}

		@Override
		public void executeValidator(IntraBalancePending2 obj) throws Exception {
			checkIntraBalancePending2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications26
	 * TransactionIdentifications26}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionIdentifications26> forTransactionIdentifications26 = new MMConstraint<TransactionIdentifications26>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> TransactionIdentifications26.mmObject();
		}

		@Override
		public void executeValidator(TransactionIdentifications26 obj) throws Exception {
			checkTransactionIdentifications26(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule#forTransactionDetails106
	 * ConstraintNoAccountOwnerTransactionIdentificationRule.
	 * forTransactionDetails106}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule#forTransactionDetails64
	 * ConstraintNoAccountOwnerTransactionIdentificationRule.
	 * forTransactionDetails64}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails76> forTransactionDetails76 = new MMConstraint<TransactionDetails76>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, then the AccountOwnerTransactionIdentification must be NONREF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule.forTransactionDetails106);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule.forTransactionDetails64;
			owner_lazy = () -> TransactionDetails76.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails76 obj) throws Exception {
			checkTransactionDetails76(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transaction12 Transaction12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccountOwnerTransactionIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<Transaction12> forTransaction12 = new MMConstraint<Transaction12>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccountOwnerTransactionIdentificationRule";
			definition = "If no reference is available for the AccountOwnerTransactionIdentification, for example, the transaction was sent by fax, then the AccountOwnerTransactionIdentification must be NONREF.";
			owner_lazy = () -> Transaction12.mmObject();
		}

		@Override
		public void executeValidator(Transaction12 obj) throws Exception {
			checkTransaction12(obj);
		}
	};

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransaction46(Transaction46 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransaction58(Transaction58 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransactionIdentifications13(TransactionIdentifications13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransaction55(Transaction55 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransaction25(Transaction25 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkIntraPositionMovement1(IntraPositionMovement1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, then the
	 * AccountOwnerTransactionIdentification must be NONREF.
	 */
	public static void check_sese_SecuritiesTransactionCancellationRequestV04(SecuritiesTransactionCancellationRequestV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkSettlementTypeAndIdentification17(SettlementTypeAndIdentification17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransaction36(Transaction36 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransaction54(Transaction54 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransaction15(Transaction15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransaction45(Transaction45 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransaction38(Transaction38 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransactionIdentifications35(TransactionIdentifications35 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransactionIdentifications22(TransactionIdentifications22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransaction63(Transaction63 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransactionIdentifications8(TransactionIdentifications8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransaction31(Transaction31 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, then the
	 * AccountOwnerTransactionIdentification must be NONREF.
	 */
	public static void checkTransactionDetails106(TransactionDetails106 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransaction29(Transaction29 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkIntraBalancePending4(IntraBalancePending4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransaction42(Transaction42 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransaction43(Transaction43 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkSettlementTypeAndIdentification10(SettlementTypeAndIdentification10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransaction32(Transaction32 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransactionIdentifications15(TransactionIdentifications15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransaction49(Transaction49 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransactionIdentifications12(TransactionIdentifications12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransaction13(Transaction13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, then the
	 * AccountOwnerTransactionIdentification must be NONREF.
	 */
	public static void check_sese_SecuritiesTransactionCancellationRequestV05(SecuritiesTransactionCancellationRequestV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransactionIdentifications5(TransactionIdentifications5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkIntraBalanceMovement1(IntraBalanceMovement1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkIntraPositionPending6(IntraPositionPending6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransaction19(Transaction19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, then the
	 * AccountOwnerTransactionIdentification must be NONREF.
	 */
	public static void checkTransactionDetails101(TransactionDetails101 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, then the
	 * AccountOwnerTransactionIdentification must be NONREF.
	 */
	public static void checkTransactionDetails85(TransactionDetails85 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransaction61(Transaction61 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransaction28(Transaction28 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, then the
	 * AccountOwnerTransactionIdentification must be NONREF.
	 */
	public static void check_sese_SecuritiesTransactionCancellationRequest002V05(SecuritiesTransactionCancellationRequest002V05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, then the
	 * AccountOwnerTransactionIdentification must be NONREF.
	 */
	public static void checkTransactionDetails64(TransactionDetails64 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransactionIdentifications6(TransactionIdentifications6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransactionIdentifications31(TransactionIdentifications31 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransaction27(Transaction27 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkIntraBalanceMovement3(IntraBalanceMovement3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkSettlementTypeAndIdentification8(SettlementTypeAndIdentification8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransaction51(Transaction51 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkSettlementTypeAndIdentification15(SettlementTypeAndIdentification15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransaction39(Transaction39 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, then the
	 * AccountOwnerTransactionIdentification must be NONREF.
	 */
	public static void checkTransactionIdentifications25(TransactionIdentifications25 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransaction53(Transaction53 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkIntraPositionMovement3(IntraPositionMovement3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransactionIdentifications30(TransactionIdentifications30 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransaction23(Transaction23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransaction57(Transaction57 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransaction9(Transaction9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransactionIdentifications23(TransactionIdentifications23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransactionIdentifications2(TransactionIdentifications2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransactionIdentifications4(TransactionIdentifications4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransaction16(Transaction16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransactionIdentifications24(TransactionIdentifications24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransaction41(Transaction41 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransactionIdentifications39(TransactionIdentifications39 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, then the
	 * AccountOwnerTransactionIdentification must be NONREF.
	 */
	public static void checkTransactionIdentifications37(TransactionIdentifications37 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransactionIdentifications10(TransactionIdentifications10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransactionIdentifications9(TransactionIdentifications9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkSettlementTypeAndIdentification9(SettlementTypeAndIdentification9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransaction65(Transaction65 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransaction52(Transaction52 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkIntraBalancePosting4(IntraBalancePosting4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransaction60(Transaction60 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransactionIdentifications11(TransactionIdentifications11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransactionIdentifications17(TransactionIdentifications17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransaction48(Transaction48 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkSettlementTypeAndIdentification1(SettlementTypeAndIdentification1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransactionIdentifications19(TransactionIdentifications19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransaction22(Transaction22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransaction35(Transaction35 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkIntraPositionMovement5(IntraPositionMovement5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkIntraPositionPending2(IntraPositionPending2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransactionIdentifications32(TransactionIdentifications32 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, then the
	 * AccountOwnerTransactionIdentification must be NONREF.
	 */
	public static void checkTransactionDetails108(TransactionDetails108 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransaction18(Transaction18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransaction11(Transaction11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransaction20(Transaction20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransaction7(Transaction7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransactionIdentifications16(TransactionIdentifications16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransaction14(Transaction14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkIntraBalancePosting2(IntraBalancePosting2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransaction34(Transaction34 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkSettlementTypeAndIdentification11(SettlementTypeAndIdentification11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransaction8(Transaction8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransaction21(Transaction21 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransactionIdentifications7(TransactionIdentifications7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, then the
	 * AccountOwnerTransactionIdentification must be NONREF.
	 */
	public static void checkTransactionIdentifications33(TransactionIdentifications33 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransactionIdentifications34(TransactionIdentifications34 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkSettlementTypeAndIdentification24(SettlementTypeAndIdentification24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransaction17(Transaction17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransaction30(Transaction30 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, then the
	 * AccountOwnerTransactionIdentification must be NONREF.
	 */
	public static void checkTransactionDetails65(TransactionDetails65 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkSettlementTypeAndIdentification19(SettlementTypeAndIdentification19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransactionIdentifications18(TransactionIdentifications18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransactionIdentifications20(TransactionIdentifications20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransaction64(Transaction64 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransaction56(Transaction56 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransaction10(Transaction10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransaction47(Transaction47 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransactionIdentifications38(TransactionIdentifications38 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransactionIdentifications1(TransactionIdentifications1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkSettlementTypeAndIdentification12(SettlementTypeAndIdentification12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransactionIdentifications14(TransactionIdentifications14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransactionIdentifications3(TransactionIdentifications3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransaction37(Transaction37 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransaction50(Transaction50 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkIntraPositionPending4(IntraPositionPending4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransaction6(Transaction6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransactionIdentifications29(TransactionIdentifications29 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransaction62(Transaction62 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransaction40(Transaction40 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkIntraBalancePending2(IntraBalancePending2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, then the
	 * AccountOwnerTransactionIdentification must be NONREF.
	 */
	public static void checkTransactionIdentifications26(TransactionIdentifications26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, then the
	 * AccountOwnerTransactionIdentification must be NONREF.
	 */
	public static void checkTransactionDetails76(TransactionDetails76 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If no reference is available for the
	 * AccountOwnerTransactionIdentification, for example, the transaction was
	 * sent by fax, then the AccountOwnerTransactionIdentification must be
	 * NONREF.
	 */
	public static void checkTransaction12(Transaction12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}