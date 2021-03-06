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
import com.tools20022.repository.area.sese.*;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.msg.*;
import java.util.Arrays;

/**
 * If settlement status/reason is used alone, then it means that the transaction
 * is matched (if a matching process exists in the concerned market or at the
 * concerned account servicer).
 */
public class ConstraintSettlementStatusAndMatchedRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV02
	 * SecuritiesFinancingStatusAdviceV02}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStatusAndMatchedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If settlement status/reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingStatusAdviceV02> for_sese_SecuritiesFinancingStatusAdviceV02 = new MMConstraint<SecuritiesFinancingStatusAdviceV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatusAndMatchedRule";
			definition = "If settlement status/reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer).";
			owner_lazy = () -> SecuritiesFinancingStatusAdviceV02.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesFinancingStatusAdviceV02 obj) throws Exception {
			check_sese_SecuritiesFinancingStatusAdviceV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV02
	 * SecuritiesSettlementTransactionStatusAdviceV02}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStatusAndMatchedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If settlement status/reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionStatusAdviceV02> for_sese_SecuritiesSettlementTransactionStatusAdviceV02 = new MMConstraint<SecuritiesSettlementTransactionStatusAdviceV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatusAndMatchedRule";
			definition = "If settlement status/reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer).";
			owner_lazy = () -> SecuritiesSettlementTransactionStatusAdviceV02.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionStatusAdviceV02 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionStatusAdviceV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV03
	 * SecuritiesFinancingStatusAdviceV03}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStatusAndMatchedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If settlement status/reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementStatusAndMatchedRule#for_sese_SecuritiesFinancingStatusAdviceV04
	 * ConstraintSettlementStatusAndMatchedRule.
	 * for_sese_SecuritiesFinancingStatusAdviceV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingStatusAdviceV03> for_sese_SecuritiesFinancingStatusAdviceV03 = new MMConstraint<SecuritiesFinancingStatusAdviceV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatusAndMatchedRule";
			definition = "If settlement status/reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementStatusAndMatchedRule.for_sese_SecuritiesFinancingStatusAdviceV04);
			owner_lazy = () -> SecuritiesFinancingStatusAdviceV03.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesFinancingStatusAdviceV03 obj) throws Exception {
			check_sese_SecuritiesFinancingStatusAdviceV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV05
	 * SecuritiesFinancingStatusAdviceV05}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStatusAndMatchedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If settlement status/reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementStatusAndMatchedRule#for_sese_SecuritiesFinancingStatusAdviceV06
	 * ConstraintSettlementStatusAndMatchedRule.
	 * for_sese_SecuritiesFinancingStatusAdviceV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementStatusAndMatchedRule#for_sese_SecuritiesFinancingStatusAdviceV04
	 * ConstraintSettlementStatusAndMatchedRule.
	 * for_sese_SecuritiesFinancingStatusAdviceV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingStatusAdviceV05> for_sese_SecuritiesFinancingStatusAdviceV05 = new MMConstraint<SecuritiesFinancingStatusAdviceV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatusAndMatchedRule";
			definition = "If settlement status/reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementStatusAndMatchedRule.for_sese_SecuritiesFinancingStatusAdviceV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementStatusAndMatchedRule.for_sese_SecuritiesFinancingStatusAdviceV04;
			owner_lazy = () -> SecuritiesFinancingStatusAdviceV05.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesFinancingStatusAdviceV05 obj) throws Exception {
			check_sese_SecuritiesFinancingStatusAdviceV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason6
	 * StatusAndReason6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStatusAndMatchedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If settlement status/reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<StatusAndReason6> forStatusAndReason6 = new MMConstraint<StatusAndReason6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatusAndMatchedRule";
			definition = "If settlement status/reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer).";
			owner_lazy = () -> StatusAndReason6.mmObject();
		}

		@Override
		public void executeValidator(StatusAndReason6 obj) throws Exception {
			checkStatusAndReason6(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV07
	 * SecuritiesFinancingStatusAdviceV07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStatusAndMatchedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementStatus is present alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementStatusAndMatchedRule#for_sese_SecuritiesFinancingStatusAdviceV06
	 * ConstraintSettlementStatusAndMatchedRule.
	 * for_sese_SecuritiesFinancingStatusAdviceV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingStatusAdviceV07> for_sese_SecuritiesFinancingStatusAdviceV07 = new MMConstraint<SecuritiesFinancingStatusAdviceV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatusAndMatchedRule";
			definition = "If SettlementStatus is present alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer).";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementStatusAndMatchedRule.for_sese_SecuritiesFinancingStatusAdviceV06;
			owner_lazy = () -> SecuritiesFinancingStatusAdviceV07.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesFinancingStatusAdviceV07 obj) throws Exception {
			check_sese_SecuritiesFinancingStatusAdviceV07(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.Status2Choice Status2Choice}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStatusAndMatchedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If settlement status/reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<Status2Choice> forStatus2Choice = new MMConstraint<Status2Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatusAndMatchedRule";
			definition = "If settlement status/reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer).";
			owner_lazy = () -> Status2Choice.mmObject();
		}

		@Override
		public void executeValidator(Status2Choice obj) throws Exception {
			checkStatus2Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV07
	 * SecuritiesSettlementTransactionStatusAdviceV07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStatusAndMatchedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If settlement status/reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementStatusAndMatchedRule#for_sese_SecuritiesSettlementTransactionStatusAdviceV08
	 * ConstraintSettlementStatusAndMatchedRule.
	 * for_sese_SecuritiesSettlementTransactionStatusAdviceV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementStatusAndMatchedRule#for_sese_SecuritiesSettlementTransactionStatusAdviceV06
	 * ConstraintSettlementStatusAndMatchedRule.
	 * for_sese_SecuritiesSettlementTransactionStatusAdviceV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionStatusAdviceV07> for_sese_SecuritiesSettlementTransactionStatusAdviceV07 = new MMConstraint<SecuritiesSettlementTransactionStatusAdviceV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatusAndMatchedRule";
			definition = "If settlement status/reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementStatusAndMatchedRule.for_sese_SecuritiesSettlementTransactionStatusAdviceV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementStatusAndMatchedRule.for_sese_SecuritiesSettlementTransactionStatusAdviceV06;
			owner_lazy = () -> SecuritiesSettlementTransactionStatusAdviceV07.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionStatusAdviceV07 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionStatusAdviceV07(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.Status16Choice
	 * Status16Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStatusAndMatchedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If settlement status/reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<Status16Choice> forStatus16Choice = new MMConstraint<Status16Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatusAndMatchedRule";
			definition = "If settlement status/reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer).";
			owner_lazy = () -> Status16Choice.mmObject();
		}

		@Override
		public void executeValidator(Status16Choice obj) throws Exception {
			checkStatus16Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.Status11Choice
	 * Status11Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStatusAndMatchedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If settlement status/reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<Status11Choice> forStatus11Choice = new MMConstraint<Status11Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatusAndMatchedRule";
			definition = "If settlement status/reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer).";
			owner_lazy = () -> Status11Choice.mmObject();
		}

		@Override
		public void executeValidator(Status11Choice obj) throws Exception {
			checkStatus11Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason3
	 * StatusAndReason3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStatusAndMatchedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If settlement status/reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<StatusAndReason3> forStatusAndReason3 = new MMConstraint<StatusAndReason3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatusAndMatchedRule";
			definition = "If settlement status/reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer).";
			owner_lazy = () -> StatusAndReason3.mmObject();
		}

		@Override
		public void executeValidator(StatusAndReason3 obj) throws Exception {
			checkStatusAndReason3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason28
	 * StatusAndReason28}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStatusAndMatchedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If settlement status/reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementStatusAndMatchedRule#forStatusAndReason19
	 * ConstraintSettlementStatusAndMatchedRule.forStatusAndReason19}</li>
	 * </ul>
	 */
	public static final MMConstraint<StatusAndReason28> forStatusAndReason28 = new MMConstraint<StatusAndReason28>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatusAndMatchedRule";
			definition = "If settlement status/reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer).";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementStatusAndMatchedRule.forStatusAndReason19;
			owner_lazy = () -> StatusAndReason28.mmObject();
		}

		@Override
		public void executeValidator(StatusAndReason28 obj) throws Exception {
			checkStatusAndReason28(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdvice002V09
	 * SecuritiesSettlementTransactionStatusAdvice002V09}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStatusAndMatchedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If settlement status/reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionStatusAdvice002V09> for_sese_SecuritiesSettlementTransactionStatusAdvice002V09 = new MMConstraint<SecuritiesSettlementTransactionStatusAdvice002V09>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatusAndMatchedRule";
			definition = "If settlement status/reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer).";
			owner_lazy = () -> SecuritiesSettlementTransactionStatusAdvice002V09.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionStatusAdvice002V09 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionStatusAdvice002V09(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason29
	 * StatusAndReason29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStatusAndMatchedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If settlement status/reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<StatusAndReason29> forStatusAndReason29 = new MMConstraint<StatusAndReason29>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatusAndMatchedRule";
			definition = "If settlement status/reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer).";
			owner_lazy = () -> StatusAndReason29.mmObject();
		}

		@Override
		public void executeValidator(StatusAndReason29 obj) throws Exception {
			checkStatusAndReason29(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdvice002V07
	 * SecuritiesSettlementTransactionStatusAdvice002V07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStatusAndMatchedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If settlement status/reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionStatusAdvice002V07> for_sese_SecuritiesSettlementTransactionStatusAdvice002V07 = new MMConstraint<SecuritiesSettlementTransactionStatusAdvice002V07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatusAndMatchedRule";
			definition = "If settlement status/reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer).";
			owner_lazy = () -> SecuritiesSettlementTransactionStatusAdvice002V07.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionStatusAdvice002V07 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionStatusAdvice002V07(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.Status18Choice
	 * Status18Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStatusAndMatchedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If settlement status/reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementStatusAndMatchedRule#forStatus15Choice
	 * ConstraintSettlementStatusAndMatchedRule.forStatus15Choice}</li>
	 * </ul>
	 */
	public static final MMConstraint<Status18Choice> forStatus18Choice = new MMConstraint<Status18Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatusAndMatchedRule";
			definition = "If settlement status/reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer).";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementStatusAndMatchedRule.forStatus15Choice;
			owner_lazy = () -> Status18Choice.mmObject();
		}

		@Override
		public void executeValidator(Status18Choice obj) throws Exception {
			checkStatus18Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdvice002V06
	 * SecuritiesFinancingStatusAdvice002V06}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStatusAndMatchedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If settlement status/reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingStatusAdvice002V06> for_sese_SecuritiesFinancingStatusAdvice002V06 = new MMConstraint<SecuritiesFinancingStatusAdvice002V06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatusAndMatchedRule";
			definition = "If settlement status/reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer).";
			owner_lazy = () -> SecuritiesFinancingStatusAdvice002V06.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesFinancingStatusAdvice002V06 obj) throws Exception {
			check_sese_SecuritiesFinancingStatusAdvice002V06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason14
	 * StatusAndReason14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStatusAndMatchedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If settlement status/reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<StatusAndReason14> forStatusAndReason14 = new MMConstraint<StatusAndReason14>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatusAndMatchedRule";
			definition = "If settlement status/reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer).";
			owner_lazy = () -> StatusAndReason14.mmObject();
		}

		@Override
		public void executeValidator(StatusAndReason14 obj) throws Exception {
			checkStatusAndReason14(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason12
	 * StatusAndReason12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStatusAndMatchedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If settlement status/reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementStatusAndMatchedRule#forStatusAndReason19
	 * ConstraintSettlementStatusAndMatchedRule.forStatusAndReason19}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<StatusAndReason12> forStatusAndReason12 = new MMConstraint<StatusAndReason12>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatusAndMatchedRule";
			definition = "If settlement status/reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementStatusAndMatchedRule.forStatusAndReason19);
			owner_lazy = () -> StatusAndReason12.mmObject();
		}

		@Override
		public void executeValidator(StatusAndReason12 obj) throws Exception {
			checkStatusAndReason12(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV04
	 * SecuritiesSettlementTransactionStatusAdviceV04}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStatusAndMatchedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If settlement status/reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementStatusAndMatchedRule#for_sese_SecuritiesSettlementTransactionStatusAdviceV05
	 * ConstraintSettlementStatusAndMatchedRule.
	 * for_sese_SecuritiesSettlementTransactionStatusAdviceV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionStatusAdviceV04> for_sese_SecuritiesSettlementTransactionStatusAdviceV04 = new MMConstraint<SecuritiesSettlementTransactionStatusAdviceV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatusAndMatchedRule";
			definition = "If settlement status/reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementStatusAndMatchedRule.for_sese_SecuritiesSettlementTransactionStatusAdviceV05);
			owner_lazy = () -> SecuritiesSettlementTransactionStatusAdviceV04.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionStatusAdviceV04 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionStatusAdviceV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.Status9Choice Status9Choice}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStatusAndMatchedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If settlement status/reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementStatusAndMatchedRule#forStatus15Choice
	 * ConstraintSettlementStatusAndMatchedRule.forStatus15Choice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Status9Choice> forStatus9Choice = new MMConstraint<Status9Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatusAndMatchedRule";
			definition = "If settlement status/reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementStatusAndMatchedRule.forStatus15Choice);
			owner_lazy = () -> Status9Choice.mmObject();
		}

		@Override
		public void executeValidator(Status9Choice obj) throws Exception {
			checkStatus9Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason31
	 * StatusAndReason31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStatusAndMatchedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementStatus/Reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementStatusAndMatchedRule#forStatusAndReason15
	 * ConstraintSettlementStatusAndMatchedRule.forStatusAndReason15}</li>
	 * </ul>
	 */
	public static final MMConstraint<StatusAndReason31> forStatusAndReason31 = new MMConstraint<StatusAndReason31>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatusAndMatchedRule";
			definition = "If SettlementStatus/Reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer).";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementStatusAndMatchedRule.forStatusAndReason15;
			owner_lazy = () -> StatusAndReason31.mmObject();
		}

		@Override
		public void executeValidator(StatusAndReason31 obj) throws Exception {
			checkStatusAndReason31(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV03
	 * SecuritiesSettlementTransactionStatusAdviceV03}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStatusAndMatchedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If settlement status/reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionStatusAdviceV03> for_sese_SecuritiesSettlementTransactionStatusAdviceV03 = new MMConstraint<SecuritiesSettlementTransactionStatusAdviceV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatusAndMatchedRule";
			definition = "If settlement status/reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer).";
			owner_lazy = () -> SecuritiesSettlementTransactionStatusAdviceV03.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionStatusAdviceV03 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionStatusAdviceV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV04
	 * SecuritiesFinancingStatusAdviceV04}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStatusAndMatchedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If settlement status/reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementStatusAndMatchedRule#for_sese_SecuritiesFinancingStatusAdviceV05
	 * ConstraintSettlementStatusAndMatchedRule.
	 * for_sese_SecuritiesFinancingStatusAdviceV05}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementStatusAndMatchedRule#for_sese_SecuritiesFinancingStatusAdviceV03
	 * ConstraintSettlementStatusAndMatchedRule.
	 * for_sese_SecuritiesFinancingStatusAdviceV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingStatusAdviceV04> for_sese_SecuritiesFinancingStatusAdviceV04 = new MMConstraint<SecuritiesFinancingStatusAdviceV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatusAndMatchedRule";
			definition = "If settlement status/reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementStatusAndMatchedRule.for_sese_SecuritiesFinancingStatusAdviceV05);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementStatusAndMatchedRule.for_sese_SecuritiesFinancingStatusAdviceV03;
			owner_lazy = () -> SecuritiesFinancingStatusAdviceV04.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesFinancingStatusAdviceV04 obj) throws Exception {
			check_sese_SecuritiesFinancingStatusAdviceV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.Status23Choice
	 * Status23Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStatusAndMatchedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If settlement status/reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<Status23Choice> forStatus23Choice = new MMConstraint<Status23Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatusAndMatchedRule";
			definition = "If settlement status/reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer).";
			owner_lazy = () -> Status23Choice.mmObject();
		}

		@Override
		public void executeValidator(Status23Choice obj) throws Exception {
			checkStatus23Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdvice002V08
	 * SecuritiesSettlementTransactionStatusAdvice002V08}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStatusAndMatchedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If settlement status/reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionStatusAdvice002V08> for_sese_SecuritiesSettlementTransactionStatusAdvice002V08 = new MMConstraint<SecuritiesSettlementTransactionStatusAdvice002V08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatusAndMatchedRule";
			definition = "If settlement status/reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer).";
			owner_lazy = () -> SecuritiesSettlementTransactionStatusAdvice002V08.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionStatusAdvice002V08 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionStatusAdvice002V08(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV05
	 * SecuritiesSettlementTransactionStatusAdviceV05}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStatusAndMatchedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If settlement status/reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementStatusAndMatchedRule#for_sese_SecuritiesSettlementTransactionStatusAdviceV06
	 * ConstraintSettlementStatusAndMatchedRule.
	 * for_sese_SecuritiesSettlementTransactionStatusAdviceV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementStatusAndMatchedRule#for_sese_SecuritiesSettlementTransactionStatusAdviceV04
	 * ConstraintSettlementStatusAndMatchedRule.
	 * for_sese_SecuritiesSettlementTransactionStatusAdviceV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionStatusAdviceV05> for_sese_SecuritiesSettlementTransactionStatusAdviceV05 = new MMConstraint<SecuritiesSettlementTransactionStatusAdviceV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatusAndMatchedRule";
			definition = "If settlement status/reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementStatusAndMatchedRule.for_sese_SecuritiesSettlementTransactionStatusAdviceV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementStatusAndMatchedRule.for_sese_SecuritiesSettlementTransactionStatusAdviceV04;
			owner_lazy = () -> SecuritiesSettlementTransactionStatusAdviceV05.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionStatusAdviceV05 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionStatusAdviceV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason20
	 * StatusAndReason20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStatusAndMatchedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If settlement status/reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<StatusAndReason20> forStatusAndReason20 = new MMConstraint<StatusAndReason20>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatusAndMatchedRule";
			definition = "If settlement status/reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer).";
			owner_lazy = () -> StatusAndReason20.mmObject();
		}

		@Override
		public void executeValidator(StatusAndReason20 obj) throws Exception {
			checkStatusAndReason20(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV06
	 * SecuritiesSettlementTransactionStatusAdviceV06}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStatusAndMatchedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If settlement status/reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementStatusAndMatchedRule#for_sese_SecuritiesSettlementTransactionStatusAdviceV07
	 * ConstraintSettlementStatusAndMatchedRule.
	 * for_sese_SecuritiesSettlementTransactionStatusAdviceV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementStatusAndMatchedRule#for_sese_SecuritiesSettlementTransactionStatusAdviceV05
	 * ConstraintSettlementStatusAndMatchedRule.
	 * for_sese_SecuritiesSettlementTransactionStatusAdviceV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionStatusAdviceV06> for_sese_SecuritiesSettlementTransactionStatusAdviceV06 = new MMConstraint<SecuritiesSettlementTransactionStatusAdviceV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatusAndMatchedRule";
			definition = "If settlement status/reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementStatusAndMatchedRule.for_sese_SecuritiesSettlementTransactionStatusAdviceV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementStatusAndMatchedRule.for_sese_SecuritiesSettlementTransactionStatusAdviceV05;
			owner_lazy = () -> SecuritiesSettlementTransactionStatusAdviceV06.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionStatusAdviceV06 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionStatusAdviceV06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV01
	 * SecuritiesFinancingStatusAdviceV01}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStatusAndMatchedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If settlement status/reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingStatusAdviceV01> for_sese_SecuritiesFinancingStatusAdviceV01 = new MMConstraint<SecuritiesFinancingStatusAdviceV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatusAndMatchedRule";
			definition = "If settlement status/reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer).";
			owner_lazy = () -> SecuritiesFinancingStatusAdviceV01.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesFinancingStatusAdviceV01 obj) throws Exception {
			check_sese_SecuritiesFinancingStatusAdviceV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdvice002V07
	 * SecuritiesFinancingStatusAdvice002V07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStatusAndMatchedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If settlement status/reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingStatusAdvice002V07> for_sese_SecuritiesFinancingStatusAdvice002V07 = new MMConstraint<SecuritiesFinancingStatusAdvice002V07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatusAndMatchedRule";
			definition = "If settlement status/reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer).";
			owner_lazy = () -> SecuritiesFinancingStatusAdvice002V07.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesFinancingStatusAdvice002V07 obj) throws Exception {
			check_sese_SecuritiesFinancingStatusAdvice002V07(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason19
	 * StatusAndReason19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStatusAndMatchedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If settlement status/reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementStatusAndMatchedRule#forStatusAndReason28
	 * ConstraintSettlementStatusAndMatchedRule.forStatusAndReason28}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementStatusAndMatchedRule#forStatusAndReason12
	 * ConstraintSettlementStatusAndMatchedRule.forStatusAndReason12}</li>
	 * </ul>
	 */
	public static final MMConstraint<StatusAndReason19> forStatusAndReason19 = new MMConstraint<StatusAndReason19>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatusAndMatchedRule";
			definition = "If settlement status/reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementStatusAndMatchedRule.forStatusAndReason28);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementStatusAndMatchedRule.forStatusAndReason12;
			owner_lazy = () -> StatusAndReason19.mmObject();
		}

		@Override
		public void executeValidator(StatusAndReason19 obj) throws Exception {
			checkStatusAndReason19(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.Status4Choice Status4Choice}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStatusAndMatchedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If settlement status/reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<Status4Choice> forStatus4Choice = new MMConstraint<Status4Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatusAndMatchedRule";
			definition = "If settlement status/reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer).";
			owner_lazy = () -> Status4Choice.mmObject();
		}

		@Override
		public void executeValidator(Status4Choice obj) throws Exception {
			checkStatus4Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason15
	 * StatusAndReason15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStatusAndMatchedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementStatus/Reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementStatusAndMatchedRule#forStatusAndReason31
	 * ConstraintSettlementStatusAndMatchedRule.forStatusAndReason31}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<StatusAndReason15> forStatusAndReason15 = new MMConstraint<StatusAndReason15>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatusAndMatchedRule";
			definition = "If SettlementStatus/Reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementStatusAndMatchedRule.forStatusAndReason31);
			owner_lazy = () -> StatusAndReason15.mmObject();
		}

		@Override
		public void executeValidator(StatusAndReason15 obj) throws Exception {
			checkStatusAndReason15(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV08
	 * SecuritiesSettlementTransactionStatusAdviceV08}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStatusAndMatchedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If settlement status/reason is present alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementStatusAndMatchedRule#for_sese_SecuritiesSettlementTransactionStatusAdviceV09
	 * ConstraintSettlementStatusAndMatchedRule.
	 * for_sese_SecuritiesSettlementTransactionStatusAdviceV09}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementStatusAndMatchedRule#for_sese_SecuritiesSettlementTransactionStatusAdviceV07
	 * ConstraintSettlementStatusAndMatchedRule.
	 * for_sese_SecuritiesSettlementTransactionStatusAdviceV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionStatusAdviceV08> for_sese_SecuritiesSettlementTransactionStatusAdviceV08 = new MMConstraint<SecuritiesSettlementTransactionStatusAdviceV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatusAndMatchedRule";
			definition = "If settlement status/reason is present alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementStatusAndMatchedRule.for_sese_SecuritiesSettlementTransactionStatusAdviceV09);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementStatusAndMatchedRule.for_sese_SecuritiesSettlementTransactionStatusAdviceV07;
			owner_lazy = () -> SecuritiesSettlementTransactionStatusAdviceV08.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionStatusAdviceV08 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionStatusAdviceV08(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.Status15Choice
	 * Status15Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStatusAndMatchedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If settlement status/reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementStatusAndMatchedRule#forStatus18Choice
	 * ConstraintSettlementStatusAndMatchedRule.forStatus18Choice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementStatusAndMatchedRule#forStatus9Choice
	 * ConstraintSettlementStatusAndMatchedRule.forStatus9Choice}</li>
	 * </ul>
	 */
	public static final MMConstraint<Status15Choice> forStatus15Choice = new MMConstraint<Status15Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatusAndMatchedRule";
			definition = "If settlement status/reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementStatusAndMatchedRule.forStatus18Choice);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementStatusAndMatchedRule.forStatus9Choice;
			owner_lazy = () -> Status15Choice.mmObject();
		}

		@Override
		public void executeValidator(Status15Choice obj) throws Exception {
			checkStatus15Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV09
	 * SecuritiesSettlementTransactionStatusAdviceV09}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStatusAndMatchedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If settlement status/reason is present alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementStatusAndMatchedRule#for_sese_SecuritiesSettlementTransactionStatusAdviceV08
	 * ConstraintSettlementStatusAndMatchedRule.
	 * for_sese_SecuritiesSettlementTransactionStatusAdviceV08}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionStatusAdviceV09> for_sese_SecuritiesSettlementTransactionStatusAdviceV09 = new MMConstraint<SecuritiesSettlementTransactionStatusAdviceV09>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatusAndMatchedRule";
			definition = "If settlement status/reason is present alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer).";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementStatusAndMatchedRule.for_sese_SecuritiesSettlementTransactionStatusAdviceV08;
			owner_lazy = () -> SecuritiesSettlementTransactionStatusAdviceV09.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionStatusAdviceV09 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionStatusAdviceV09(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV01
	 * SecuritiesSettlementTransactionStatusAdviceV01}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStatusAndMatchedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If settlement status/reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionStatusAdviceV01> for_sese_SecuritiesSettlementTransactionStatusAdviceV01 = new MMConstraint<SecuritiesSettlementTransactionStatusAdviceV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatusAndMatchedRule";
			definition = "If settlement status/reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer).";
			owner_lazy = () -> SecuritiesSettlementTransactionStatusAdviceV01.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionStatusAdviceV01 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionStatusAdviceV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV06
	 * SecuritiesFinancingStatusAdviceV06}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStatusAndMatchedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If settlement status/reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementStatusAndMatchedRule#for_sese_SecuritiesFinancingStatusAdviceV07
	 * ConstraintSettlementStatusAndMatchedRule.
	 * for_sese_SecuritiesFinancingStatusAdviceV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementStatusAndMatchedRule#for_sese_SecuritiesFinancingStatusAdviceV05
	 * ConstraintSettlementStatusAndMatchedRule.
	 * for_sese_SecuritiesFinancingStatusAdviceV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingStatusAdviceV06> for_sese_SecuritiesFinancingStatusAdviceV06 = new MMConstraint<SecuritiesFinancingStatusAdviceV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatusAndMatchedRule";
			definition = "If settlement status/reason is used alone, then it means that the transaction is matched (if a matching process exists in the concerned market or at the concerned account servicer).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementStatusAndMatchedRule.for_sese_SecuritiesFinancingStatusAdviceV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementStatusAndMatchedRule.for_sese_SecuritiesFinancingStatusAdviceV05;
			owner_lazy = () -> SecuritiesFinancingStatusAdviceV06.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesFinancingStatusAdviceV06 obj) throws Exception {
			check_sese_SecuritiesFinancingStatusAdviceV06(obj);
		}
	};

	/**
	 * If settlement status/reason is used alone, then it means that the
	 * transaction is matched (if a matching process exists in the concerned
	 * market or at the concerned account servicer).
	 */
	public static void check_sese_SecuritiesFinancingStatusAdviceV02(SecuritiesFinancingStatusAdviceV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If settlement status/reason is used alone, then it means that the
	 * transaction is matched (if a matching process exists in the concerned
	 * market or at the concerned account servicer).
	 */
	public static void check_sese_SecuritiesSettlementTransactionStatusAdviceV02(SecuritiesSettlementTransactionStatusAdviceV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If settlement status/reason is used alone, then it means that the
	 * transaction is matched (if a matching process exists in the concerned
	 * market or at the concerned account servicer).
	 */
	public static void check_sese_SecuritiesFinancingStatusAdviceV03(SecuritiesFinancingStatusAdviceV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If settlement status/reason is used alone, then it means that the
	 * transaction is matched (if a matching process exists in the concerned
	 * market or at the concerned account servicer).
	 */
	public static void check_sese_SecuritiesFinancingStatusAdviceV05(SecuritiesFinancingStatusAdviceV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If settlement status/reason is used alone, then it means that the
	 * transaction is matched (if a matching process exists in the concerned
	 * market or at the concerned account servicer).
	 */
	public static void checkStatusAndReason6(StatusAndReason6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementStatus is present alone, then it means that the transaction
	 * is matched (if a matching process exists in the concerned market or at
	 * the concerned account servicer).
	 */
	public static void check_sese_SecuritiesFinancingStatusAdviceV07(SecuritiesFinancingStatusAdviceV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If settlement status/reason is used alone, then it means that the
	 * transaction is matched (if a matching process exists in the concerned
	 * market or at the concerned account servicer).
	 */
	public static void checkStatus2Choice(Status2Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If settlement status/reason is used alone, then it means that the
	 * transaction is matched (if a matching process exists in the concerned
	 * market or at the concerned account servicer).
	 */
	public static void check_sese_SecuritiesSettlementTransactionStatusAdviceV07(SecuritiesSettlementTransactionStatusAdviceV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If settlement status/reason is used alone, then it means that the
	 * transaction is matched (if a matching process exists in the concerned
	 * market or at the concerned account servicer).
	 */
	public static void checkStatus16Choice(Status16Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If settlement status/reason is used alone, then it means that the
	 * transaction is matched (if a matching process exists in the concerned
	 * market or at the concerned account servicer).
	 */
	public static void checkStatus11Choice(Status11Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If settlement status/reason is used alone, then it means that the
	 * transaction is matched (if a matching process exists in the concerned
	 * market or at the concerned account servicer).
	 */
	public static void checkStatusAndReason3(StatusAndReason3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If settlement status/reason is used alone, then it means that the
	 * transaction is matched (if a matching process exists in the concerned
	 * market or at the concerned account servicer).
	 */
	public static void checkStatusAndReason28(StatusAndReason28 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If settlement status/reason is used alone, then it means that the
	 * transaction is matched (if a matching process exists in the concerned
	 * market or at the concerned account servicer).
	 */
	public static void check_sese_SecuritiesSettlementTransactionStatusAdvice002V09(SecuritiesSettlementTransactionStatusAdvice002V09 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If settlement status/reason is used alone, then it means that the
	 * transaction is matched (if a matching process exists in the concerned
	 * market or at the concerned account servicer).
	 */
	public static void checkStatusAndReason29(StatusAndReason29 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If settlement status/reason is used alone, then it means that the
	 * transaction is matched (if a matching process exists in the concerned
	 * market or at the concerned account servicer).
	 */
	public static void check_sese_SecuritiesSettlementTransactionStatusAdvice002V07(SecuritiesSettlementTransactionStatusAdvice002V07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If settlement status/reason is used alone, then it means that the
	 * transaction is matched (if a matching process exists in the concerned
	 * market or at the concerned account servicer).
	 */
	public static void checkStatus18Choice(Status18Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If settlement status/reason is used alone, then it means that the
	 * transaction is matched (if a matching process exists in the concerned
	 * market or at the concerned account servicer).
	 */
	public static void check_sese_SecuritiesFinancingStatusAdvice002V06(SecuritiesFinancingStatusAdvice002V06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If settlement status/reason is used alone, then it means that the
	 * transaction is matched (if a matching process exists in the concerned
	 * market or at the concerned account servicer).
	 */
	public static void checkStatusAndReason14(StatusAndReason14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If settlement status/reason is used alone, then it means that the
	 * transaction is matched (if a matching process exists in the concerned
	 * market or at the concerned account servicer).
	 */
	public static void checkStatusAndReason12(StatusAndReason12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If settlement status/reason is used alone, then it means that the
	 * transaction is matched (if a matching process exists in the concerned
	 * market or at the concerned account servicer).
	 */
	public static void check_sese_SecuritiesSettlementTransactionStatusAdviceV04(SecuritiesSettlementTransactionStatusAdviceV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If settlement status/reason is used alone, then it means that the
	 * transaction is matched (if a matching process exists in the concerned
	 * market or at the concerned account servicer).
	 */
	public static void checkStatus9Choice(Status9Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementStatus/Reason is used alone, then it means that the
	 * transaction is matched (if a matching process exists in the concerned
	 * market or at the concerned account servicer).
	 */
	public static void checkStatusAndReason31(StatusAndReason31 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If settlement status/reason is used alone, then it means that the
	 * transaction is matched (if a matching process exists in the concerned
	 * market or at the concerned account servicer).
	 */
	public static void check_sese_SecuritiesSettlementTransactionStatusAdviceV03(SecuritiesSettlementTransactionStatusAdviceV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If settlement status/reason is used alone, then it means that the
	 * transaction is matched (if a matching process exists in the concerned
	 * market or at the concerned account servicer).
	 */
	public static void check_sese_SecuritiesFinancingStatusAdviceV04(SecuritiesFinancingStatusAdviceV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If settlement status/reason is used alone, then it means that the
	 * transaction is matched (if a matching process exists in the concerned
	 * market or at the concerned account servicer).
	 */
	public static void checkStatus23Choice(Status23Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If settlement status/reason is used alone, then it means that the
	 * transaction is matched (if a matching process exists in the concerned
	 * market or at the concerned account servicer).
	 */
	public static void check_sese_SecuritiesSettlementTransactionStatusAdvice002V08(SecuritiesSettlementTransactionStatusAdvice002V08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If settlement status/reason is used alone, then it means that the
	 * transaction is matched (if a matching process exists in the concerned
	 * market or at the concerned account servicer).
	 */
	public static void check_sese_SecuritiesSettlementTransactionStatusAdviceV05(SecuritiesSettlementTransactionStatusAdviceV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If settlement status/reason is used alone, then it means that the
	 * transaction is matched (if a matching process exists in the concerned
	 * market or at the concerned account servicer).
	 */
	public static void checkStatusAndReason20(StatusAndReason20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If settlement status/reason is used alone, then it means that the
	 * transaction is matched (if a matching process exists in the concerned
	 * market or at the concerned account servicer).
	 */
	public static void check_sese_SecuritiesSettlementTransactionStatusAdviceV06(SecuritiesSettlementTransactionStatusAdviceV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If settlement status/reason is used alone, then it means that the
	 * transaction is matched (if a matching process exists in the concerned
	 * market or at the concerned account servicer).
	 */
	public static void check_sese_SecuritiesFinancingStatusAdviceV01(SecuritiesFinancingStatusAdviceV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If settlement status/reason is used alone, then it means that the
	 * transaction is matched (if a matching process exists in the concerned
	 * market or at the concerned account servicer).
	 */
	public static void check_sese_SecuritiesFinancingStatusAdvice002V07(SecuritiesFinancingStatusAdvice002V07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If settlement status/reason is used alone, then it means that the
	 * transaction is matched (if a matching process exists in the concerned
	 * market or at the concerned account servicer).
	 */
	public static void checkStatusAndReason19(StatusAndReason19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If settlement status/reason is used alone, then it means that the
	 * transaction is matched (if a matching process exists in the concerned
	 * market or at the concerned account servicer).
	 */
	public static void checkStatus4Choice(Status4Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementStatus/Reason is used alone, then it means that the
	 * transaction is matched (if a matching process exists in the concerned
	 * market or at the concerned account servicer).
	 */
	public static void checkStatusAndReason15(StatusAndReason15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If settlement status/reason is present alone, then it means that the
	 * transaction is matched (if a matching process exists in the concerned
	 * market or at the concerned account servicer).
	 */
	public static void check_sese_SecuritiesSettlementTransactionStatusAdviceV08(SecuritiesSettlementTransactionStatusAdviceV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If settlement status/reason is used alone, then it means that the
	 * transaction is matched (if a matching process exists in the concerned
	 * market or at the concerned account servicer).
	 */
	public static void checkStatus15Choice(Status15Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If settlement status/reason is present alone, then it means that the
	 * transaction is matched (if a matching process exists in the concerned
	 * market or at the concerned account servicer).
	 */
	public static void check_sese_SecuritiesSettlementTransactionStatusAdviceV09(SecuritiesSettlementTransactionStatusAdviceV09 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If settlement status/reason is used alone, then it means that the
	 * transaction is matched (if a matching process exists in the concerned
	 * market or at the concerned account servicer).
	 */
	public static void check_sese_SecuritiesSettlementTransactionStatusAdviceV01(SecuritiesSettlementTransactionStatusAdviceV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If settlement status/reason is used alone, then it means that the
	 * transaction is matched (if a matching process exists in the concerned
	 * market or at the concerned account servicer).
	 */
	public static void check_sese_SecuritiesFinancingStatusAdviceV06(SecuritiesFinancingStatusAdviceV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}