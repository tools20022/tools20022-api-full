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
import com.tools20022.repository.area.semt.*;
import com.tools20022.repository.area.sese.*;
import java.util.Arrays;

/**
 * During ISO 15022 – 20022 coexistence, characters used in all text fields must
 * correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR
 * LF.
 */
public class ConstraintCoexistenceCharacterSetXRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV03
	 * CorporateActionEventProcessingStatusAdviceV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionEventProcessingStatusAdviceV03> for_seev_CorporateActionEventProcessingStatusAdviceV03 = new MMConstraint<CorporateActionEventProcessingStatusAdviceV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionEventProcessingStatusAdviceV03.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionEventProcessingStatusAdviceV03 obj) throws Exception {
			check_seev_CorporateActionEventProcessingStatusAdviceV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReportV01
	 * SecuritiesSettlementTransactionAllegementReportV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionAllegementReportV01> for_semt_SecuritiesSettlementTransactionAllegementReportV01 = new MMConstraint<SecuritiesSettlementTransactionAllegementReportV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesSettlementTransactionAllegementReportV01.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionAllegementReportV01 obj) throws Exception {
			check_semt_SecuritiesSettlementTransactionAllegementReportV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV02
	 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementPreliminaryAdviceCancellationAdviceV02> for_seev_CorporateActionMovementPreliminaryAdviceCancellationAdviceV02 = new MMConstraint<CorporateActionMovementPreliminaryAdviceCancellationAdviceV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionMovementPreliminaryAdviceCancellationAdviceV02.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementPreliminaryAdviceCancellationAdviceV02 obj) throws Exception {
			check_seev_CorporateActionMovementPreliminaryAdviceCancellationAdviceV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV02
	 * SecuritiesStatusOrStatementQueryStatusAdviceV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesStatusOrStatementQueryStatusAdviceV02> for_sese_SecuritiesStatusOrStatementQueryStatusAdviceV02 = new MMConstraint<SecuritiesStatusOrStatementQueryStatusAdviceV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesStatusOrStatementQueryStatusAdviceV02.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesStatusOrStatementQueryStatusAdviceV02 obj) throws Exception {
			check_sese_SecuritiesStatusOrStatementQueryStatusAdviceV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV05
	 * CorporateActionInstructionV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_seev_CorporateActionInstructionV04
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_seev_CorporateActionInstructionV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionV05> for_seev_CorporateActionInstructionV05 = new MMConstraint<CorporateActionInstructionV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_seev_CorporateActionInstructionV04;
			owner_lazy = () -> CorporateActionInstructionV05.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionV05 obj) throws Exception {
			check_seev_CorporateActionInstructionV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestV02
	 * SecuritiesTransactionCancellationRequestV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionCancellationRequestV02> for_sese_SecuritiesTransactionCancellationRequestV02 = new MMConstraint<SecuritiesTransactionCancellationRequestV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesTransactionCancellationRequestV02.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTransactionCancellationRequestV02 obj) throws Exception {
			check_sese_SecuritiesTransactionCancellationRequestV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV02
	 * SecuritiesFinancingStatusAdviceV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingStatusAdviceV02> for_sese_SecuritiesFinancingStatusAdviceV02 = new MMConstraint<SecuritiesFinancingStatusAdviceV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
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
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV03
	 * SecuritiesBalanceAccountingReportV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceAccountingReportV03> for_semt_SecuritiesBalanceAccountingReportV03 = new MMConstraint<SecuritiesBalanceAccountingReportV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesBalanceAccountingReportV03.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesBalanceAccountingReportV03 obj) throws Exception {
			check_semt_SecuritiesBalanceAccountingReportV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV06
	 * SecuritiesBalanceCustodyReportV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_semt_SecuritiesBalanceCustodyReportV07
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_semt_SecuritiesBalanceCustodyReportV07}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceCustodyReportV06> for_semt_SecuritiesBalanceCustodyReportV06 = new MMConstraint<SecuritiesBalanceCustodyReportV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_semt_SecuritiesBalanceCustodyReportV07);
			owner_lazy = () -> SecuritiesBalanceCustodyReportV06.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesBalanceCustodyReportV06 obj) throws Exception {
			check_semt_SecuritiesBalanceCustodyReportV06(obj);
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionStatusAdviceV02> for_sese_SecuritiesSettlementTransactionStatusAdviceV02 = new MMConstraint<SecuritiesSettlementTransactionStatusAdviceV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
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
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesStatementQueryV03
	 * SecuritiesStatementQueryV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_semt_SecuritiesStatementQueryV04
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_semt_SecuritiesStatementQueryV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesStatementQueryV03> for_semt_SecuritiesStatementQueryV03 = new MMConstraint<SecuritiesStatementQueryV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_semt_SecuritiesStatementQueryV04);
			owner_lazy = () -> SecuritiesStatementQueryV03.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesStatementQueryV03 obj) throws Exception {
			check_semt_SecuritiesStatementQueryV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV03
	 * CorporateActionNotificationV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields (except for CorporateActionDetails/CorporateActionAdditionalInformation/URLAddress)  must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV03> for_seev_CorporateActionNotificationV03 = new MMConstraint<CorporateActionNotificationV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields (except for CorporateActionDetails/CorporateActionAdditionalInformation/URLAddress)  must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionNotificationV03.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionNotificationV03 obj) throws Exception {
			check_seev_CorporateActionNotificationV03(obj);
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_sese_SecuritiesTransactionCancellationRequestV03
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_sese_SecuritiesTransactionCancellationRequestV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionCancellationRequestV04> for_sese_SecuritiesTransactionCancellationRequestV04 = new MMConstraint<SecuritiesTransactionCancellationRequestV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_sese_SecuritiesTransactionCancellationRequestV03;
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
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV04
	 * SecuritiesFinancingConfirmationV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_sese_SecuritiesFinancingConfirmationV05
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_sese_SecuritiesFinancingConfirmationV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingConfirmationV04> for_sese_SecuritiesFinancingConfirmationV04 = new MMConstraint<SecuritiesFinancingConfirmationV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_sese_SecuritiesFinancingConfirmationV05);
			owner_lazy = () -> SecuritiesFinancingConfirmationV04.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesFinancingConfirmationV04 obj) throws Exception {
			check_sese_SecuritiesFinancingConfirmationV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageCancellationAdviceV04
	 * SecuritiesMessageCancellationAdviceV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesMessageCancellationAdviceV04> for_semt_SecuritiesMessageCancellationAdviceV04 = new MMConstraint<SecuritiesMessageCancellationAdviceV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesMessageCancellationAdviceV04.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesMessageCancellationAdviceV04 obj) throws Exception {
			check_semt_SecuritiesMessageCancellationAdviceV04(obj);
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_sese_SecuritiesFinancingStatusAdviceV04
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_sese_SecuritiesFinancingStatusAdviceV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingStatusAdviceV03> for_sese_SecuritiesFinancingStatusAdviceV03 = new MMConstraint<SecuritiesFinancingStatusAdviceV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_sese_SecuritiesFinancingStatusAdviceV04);
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
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV04
	 * SecuritiesBalanceCustodyReportV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceCustodyReportV04> for_semt_SecuritiesBalanceCustodyReportV04 = new MMConstraint<SecuritiesBalanceCustodyReportV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesBalanceCustodyReportV04.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesBalanceCustodyReportV04 obj) throws Exception {
			check_semt_SecuritiesBalanceCustodyReportV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV03
	 * CorporateActionCancellationAdviceV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionCancellationAdviceV03> for_seev_CorporateActionCancellationAdviceV03 = new MMConstraint<CorporateActionCancellationAdviceV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionCancellationAdviceV03.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionCancellationAdviceV03 obj) throws Exception {
			check_seev_CorporateActionCancellationAdviceV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV03
	 * CorporateActionMovementConfirmationV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementConfirmationV03> for_seev_CorporateActionMovementConfirmationV03 = new MMConstraint<CorporateActionMovementConfirmationV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionMovementConfirmationV03.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementConfirmationV03 obj) throws Exception {
			check_seev_CorporateActionMovementConfirmationV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV02
	 * SecuritiesFinancingModificationInstructionV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingModificationInstructionV02> for_sese_SecuritiesFinancingModificationInstructionV02 = new MMConstraint<SecuritiesFinancingModificationInstructionV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesFinancingModificationInstructionV02.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesFinancingModificationInstructionV02 obj) throws Exception {
			check_sese_SecuritiesFinancingModificationInstructionV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV02
	 * CorporateActionEventProcessingStatusAdviceV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionEventProcessingStatusAdviceV02> for_seev_CorporateActionEventProcessingStatusAdviceV02 = new MMConstraint<CorporateActionEventProcessingStatusAdviceV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionEventProcessingStatusAdviceV02.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionEventProcessingStatusAdviceV02 obj) throws Exception {
			check_seev_CorporateActionEventProcessingStatusAdviceV02(obj);
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_sese_SecuritiesFinancingStatusAdviceV04
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_sese_SecuritiesFinancingStatusAdviceV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingStatusAdviceV05> for_sese_SecuritiesFinancingStatusAdviceV05 = new MMConstraint<SecuritiesFinancingStatusAdviceV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_sese_SecuritiesFinancingStatusAdviceV04;
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
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV03
	 * SecuritiesSettlementConditionModificationStatusAdviceV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementConditionModificationStatusAdviceV03> for_sese_SecuritiesSettlementConditionModificationStatusAdviceV03 = new MMConstraint<SecuritiesSettlementConditionModificationStatusAdviceV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesSettlementConditionModificationStatusAdviceV03.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementConditionModificationStatusAdviceV03 obj) throws Exception {
			check_sese_SecuritiesSettlementConditionModificationStatusAdviceV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV05
	 * SecuritiesBalanceCustodyReportV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceCustodyReportV05> for_semt_SecuritiesBalanceCustodyReportV05 = new MMConstraint<SecuritiesBalanceCustodyReportV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesBalanceCustodyReportV05.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesBalanceCustodyReportV05 obj) throws Exception {
			check_semt_SecuritiesBalanceCustodyReportV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV05
	 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_seev_CorporateActionMovementPreliminaryAdviceCancellationAdviceV04
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_seev_CorporateActionMovementPreliminaryAdviceCancellationAdviceV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementPreliminaryAdviceCancellationAdviceV05> for_seev_CorporateActionMovementPreliminaryAdviceCancellationAdviceV05 = new MMConstraint<CorporateActionMovementPreliminaryAdviceCancellationAdviceV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_seev_CorporateActionMovementPreliminaryAdviceCancellationAdviceV04;
			owner_lazy = () -> CorporateActionMovementPreliminaryAdviceCancellationAdviceV05.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementPreliminaryAdviceCancellationAdviceV05 obj) throws Exception {
			check_seev_CorporateActionMovementPreliminaryAdviceCancellationAdviceV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV04
	 * CorporateActionInstructionCancellationRequestStatusAdviceV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_seev_CorporateActionInstructionCancellationRequestStatusAdviceV05
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_seev_CorporateActionInstructionCancellationRequestStatusAdviceV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionCancellationRequestStatusAdviceV04> for_seev_CorporateActionInstructionCancellationRequestStatusAdviceV04 = new MMConstraint<CorporateActionInstructionCancellationRequestStatusAdviceV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_seev_CorporateActionInstructionCancellationRequestStatusAdviceV05);
			owner_lazy = () -> CorporateActionInstructionCancellationRequestStatusAdviceV04.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionCancellationRequestStatusAdviceV04 obj) throws Exception {
			check_seev_CorporateActionInstructionCancellationRequestStatusAdviceV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV03
	 * SecuritiesFinancingConfirmationV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingConfirmationV03> for_sese_SecuritiesFinancingConfirmationV03 = new MMConstraint<SecuritiesFinancingConfirmationV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesFinancingConfirmationV03.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesFinancingConfirmationV03 obj) throws Exception {
			check_sese_SecuritiesFinancingConfirmationV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesStatementQueryV04
	 * SecuritiesStatementQueryV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_semt_SecuritiesStatementQueryV05
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_semt_SecuritiesStatementQueryV05}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_semt_SecuritiesStatementQueryV03
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_semt_SecuritiesStatementQueryV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesStatementQueryV04> for_semt_SecuritiesStatementQueryV04 = new MMConstraint<SecuritiesStatementQueryV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_semt_SecuritiesStatementQueryV05);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_semt_SecuritiesStatementQueryV03;
			owner_lazy = () -> SecuritiesStatementQueryV04.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesStatementQueryV04 obj) throws Exception {
			check_semt_SecuritiesStatementQueryV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNarrativeV01
	 * CorporateActionNarrativeV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields (except AdditionalInformation/AdditionalInformation) must correspond to ISO 15022 character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNarrativeV01> for_seev_CorporateActionNarrativeV01 = new MMConstraint<CorporateActionNarrativeV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields (except AdditionalInformation/AdditionalInformation) must correspond to ISO 15022 character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionNarrativeV01.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionNarrativeV01 obj) throws Exception {
			check_seev_CorporateActionNarrativeV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV01
	 * CorporateActionEventProcessingStatusAdviceV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionEventProcessingStatusAdviceV01> for_seev_CorporateActionEventProcessingStatusAdviceV01 = new MMConstraint<CorporateActionEventProcessingStatusAdviceV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionEventProcessingStatusAdviceV01.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionEventProcessingStatusAdviceV01 obj) throws Exception {
			check_seev_CorporateActionEventProcessingStatusAdviceV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV03
	 * SecuritiesBalanceCustodyReportV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceCustodyReportV03> for_semt_SecuritiesBalanceCustodyReportV03 = new MMConstraint<SecuritiesBalanceCustodyReportV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesBalanceCustodyReportV03.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesBalanceCustodyReportV03 obj) throws Exception {
			check_semt_SecuritiesBalanceCustodyReportV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdviceV03
	 * SecuritiesTransactionCancellationRequestStatusAdviceV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_sese_SecuritiesTransactionCancellationRequestStatusAdviceV04
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_sese_SecuritiesTransactionCancellationRequestStatusAdviceV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionCancellationRequestStatusAdviceV03> for_sese_SecuritiesTransactionCancellationRequestStatusAdviceV03 = new MMConstraint<SecuritiesTransactionCancellationRequestStatusAdviceV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_sese_SecuritiesTransactionCancellationRequestStatusAdviceV04);
			owner_lazy = () -> SecuritiesTransactionCancellationRequestStatusAdviceV03.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTransactionCancellationRequestStatusAdviceV03 obj) throws Exception {
			check_sese_SecuritiesTransactionCancellationRequestStatusAdviceV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV02
	 * CorporateActionCancellationAdviceV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionCancellationAdviceV02> for_seev_CorporateActionCancellationAdviceV02 = new MMConstraint<CorporateActionCancellationAdviceV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionCancellationAdviceV02.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionCancellationAdviceV02 obj) throws Exception {
			check_seev_CorporateActionCancellationAdviceV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestV04
	 * CorporateActionInstructionCancellationRequestV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_seev_CorporateActionInstructionCancellationRequestV05
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_seev_CorporateActionInstructionCancellationRequestV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionCancellationRequestV04> for_seev_CorporateActionInstructionCancellationRequestV04 = new MMConstraint<CorporateActionInstructionCancellationRequestV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_seev_CorporateActionInstructionCancellationRequestV05);
			owner_lazy = () -> CorporateActionInstructionCancellationRequestV04.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionCancellationRequestV04 obj) throws Exception {
			check_seev_CorporateActionInstructionCancellationRequestV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV06
	 * SecuritiesTransactionPendingReportV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_semt_SecuritiesTransactionPendingReportV05
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_semt_SecuritiesTransactionPendingReportV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionPendingReportV06> for_semt_SecuritiesTransactionPendingReportV06 = new MMConstraint<SecuritiesTransactionPendingReportV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_semt_SecuritiesTransactionPendingReportV05;
			owner_lazy = () -> SecuritiesTransactionPendingReportV06.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTransactionPendingReportV06 obj) throws Exception {
			check_semt_SecuritiesTransactionPendingReportV06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdviceV04
	 * SecuritiesTransactionCancellationRequestStatusAdviceV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_sese_SecuritiesTransactionCancellationRequestStatusAdviceV03
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_sese_SecuritiesTransactionCancellationRequestStatusAdviceV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionCancellationRequestStatusAdviceV04> for_sese_SecuritiesTransactionCancellationRequestStatusAdviceV04 = new MMConstraint<SecuritiesTransactionCancellationRequestStatusAdviceV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_sese_SecuritiesTransactionCancellationRequestStatusAdviceV03;
			owner_lazy = () -> SecuritiesTransactionCancellationRequestStatusAdviceV04.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTransactionCancellationRequestStatusAdviceV04 obj) throws Exception {
			check_sese_SecuritiesTransactionCancellationRequestStatusAdviceV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferNotificationV03
	 * PortfolioTransferNotificationV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PortfolioTransferNotificationV03> for_sese_PortfolioTransferNotificationV03 = new MMConstraint<PortfolioTransferNotificationV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> PortfolioTransferNotificationV03.mmObject();
		}

		@Override
		public void executeValidator(PortfolioTransferNotificationV03 obj) throws Exception {
			check_sese_PortfolioTransferNotificationV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementAllegementRemovalAdviceV01
	 * SecuritiesSettlementAllegementRemovalAdviceV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementAllegementRemovalAdviceV01> for_sese_SecuritiesSettlementAllegementRemovalAdviceV01 = new MMConstraint<SecuritiesSettlementAllegementRemovalAdviceV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesSettlementAllegementRemovalAdviceV01.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementAllegementRemovalAdviceV01 obj) throws Exception {
			check_sese_SecuritiesSettlementAllegementRemovalAdviceV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementPostingReportV03
	 * IntraPositionMovementPostingReportV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionMovementPostingReportV03> for_semt_IntraPositionMovementPostingReportV03 = new MMConstraint<IntraPositionMovementPostingReportV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> IntraPositionMovementPostingReportV03.mmObject();
		}

		@Override
		public void executeValidator(IntraPositionMovementPostingReportV03 obj) throws Exception {
			check_semt_IntraPositionMovementPostingReportV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV05
	 * CorporateActionMovementConfirmationV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_seev_CorporateActionMovementConfirmationV06
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_seev_CorporateActionMovementConfirmationV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_seev_CorporateActionMovementConfirmationV04
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_seev_CorporateActionMovementConfirmationV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementConfirmationV05> for_seev_CorporateActionMovementConfirmationV05 = new MMConstraint<CorporateActionMovementConfirmationV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_seev_CorporateActionMovementConfirmationV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_seev_CorporateActionMovementConfirmationV04;
			owner_lazy = () -> CorporateActionMovementConfirmationV05.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementConfirmationV05 obj) throws Exception {
			check_seev_CorporateActionMovementConfirmationV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV05
	 * CorporateActionMovementReversalAdviceV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_seev_CorporateActionMovementReversalAdviceV06
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_seev_CorporateActionMovementReversalAdviceV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_seev_CorporateActionMovementReversalAdviceV04
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_seev_CorporateActionMovementReversalAdviceV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementReversalAdviceV05> for_seev_CorporateActionMovementReversalAdviceV05 = new MMConstraint<CorporateActionMovementReversalAdviceV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_seev_CorporateActionMovementReversalAdviceV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_seev_CorporateActionMovementReversalAdviceV04;
			owner_lazy = () -> CorporateActionMovementReversalAdviceV05.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementReversalAdviceV05 obj) throws Exception {
			check_seev_CorporateActionMovementReversalAdviceV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV06
	 * CorporateActionMovementConfirmationV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_seev_CorporateActionMovementConfirmationV05
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_seev_CorporateActionMovementConfirmationV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementConfirmationV06> for_seev_CorporateActionMovementConfirmationV06 = new MMConstraint<CorporateActionMovementConfirmationV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_seev_CorporateActionMovementConfirmationV05;
			owner_lazy = () -> CorporateActionMovementConfirmationV06.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementConfirmationV06 obj) throws Exception {
			check_seev_CorporateActionMovementConfirmationV06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV02
	 * CorporateActionMovementConfirmationV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementConfirmationV02> for_seev_CorporateActionMovementConfirmationV02 = new MMConstraint<CorporateActionMovementConfirmationV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionMovementConfirmationV02.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementConfirmationV02 obj) throws Exception {
			check_seev_CorporateActionMovementConfirmationV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV05
	 * CorporateActionMovementPreliminaryAdviceV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_seev_CorporateActionMovementPreliminaryAdviceV06
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_seev_CorporateActionMovementPreliminaryAdviceV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_seev_CorporateActionMovementPreliminaryAdviceV04
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_seev_CorporateActionMovementPreliminaryAdviceV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementPreliminaryAdviceV05> for_seev_CorporateActionMovementPreliminaryAdviceV05 = new MMConstraint<CorporateActionMovementPreliminaryAdviceV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_seev_CorporateActionMovementPreliminaryAdviceV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_seev_CorporateActionMovementPreliminaryAdviceV04;
			owner_lazy = () -> CorporateActionMovementPreliminaryAdviceV05.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementPreliminaryAdviceV05 obj) throws Exception {
			check_seev_CorporateActionMovementPreliminaryAdviceV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV02
	 * IntraPositionMovementConfirmationV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionMovementConfirmationV02> for_semt_IntraPositionMovementConfirmationV02 = new MMConstraint<IntraPositionMovementConfirmationV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> IntraPositionMovementConfirmationV02.mmObject();
		}

		@Override
		public void executeValidator(IntraPositionMovementConfirmationV02 obj) throws Exception {
			check_semt_IntraPositionMovementConfirmationV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestV02
	 * CorporateActionInstructionCancellationRequestV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionCancellationRequestV02> for_seev_CorporateActionInstructionCancellationRequestV02 = new MMConstraint<CorporateActionInstructionCancellationRequestV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionInstructionCancellationRequestV02.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionCancellationRequestV02 obj) throws Exception {
			check_seev_CorporateActionInstructionCancellationRequestV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV04
	 * SecuritiesSettlementTransactionConfirmationV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_sese_SecuritiesSettlementTransactionConfirmationV05
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_sese_SecuritiesSettlementTransactionConfirmationV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmationV04> for_sese_SecuritiesSettlementTransactionConfirmationV04 = new MMConstraint<SecuritiesSettlementTransactionConfirmationV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_sese_SecuritiesSettlementTransactionConfirmationV05);
			owner_lazy = () -> SecuritiesSettlementTransactionConfirmationV04.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionConfirmationV04 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionConfirmationV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV01
	 * IntraPositionMovementConfirmationV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionMovementConfirmationV01> for_semt_IntraPositionMovementConfirmationV01 = new MMConstraint<IntraPositionMovementConfirmationV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> IntraPositionMovementConfirmationV01.mmObject();
		}

		@Override
		public void executeValidator(IntraPositionMovementConfirmationV01 obj) throws Exception {
			check_semt_IntraPositionMovementConfirmationV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV01
	 * SecuritiesStatusOrStatementQueryStatusAdviceV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesStatusOrStatementQueryStatusAdviceV01> for_sese_SecuritiesStatusOrStatementQueryStatusAdviceV01 = new MMConstraint<SecuritiesStatusOrStatementQueryStatusAdviceV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesStatusOrStatementQueryStatusAdviceV01.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesStatusOrStatementQueryStatusAdviceV01 obj) throws Exception {
			check_sese_SecuritiesStatusOrStatementQueryStatusAdviceV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV02
	 * SecuritiesSettlementTransactionGenerationNotificationV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionGenerationNotificationV02> for_sese_SecuritiesSettlementTransactionGenerationNotificationV02 = new MMConstraint<SecuritiesSettlementTransactionGenerationNotificationV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesSettlementTransactionGenerationNotificationV02.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionGenerationNotificationV02 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionGenerationNotificationV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReportV02
	 * SecuritiesSettlementTransactionAuditTrailReportV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_semt_SecuritiesSettlementTransactionAuditTrailReportV01
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_semt_SecuritiesSettlementTransactionAuditTrailReportV01}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionAuditTrailReportV02> for_semt_SecuritiesSettlementTransactionAuditTrailReportV02 = new MMConstraint<SecuritiesSettlementTransactionAuditTrailReportV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_semt_SecuritiesSettlementTransactionAuditTrailReportV01;
			owner_lazy = () -> SecuritiesSettlementTransactionAuditTrailReportV02.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionAuditTrailReportV02 obj) throws Exception {
			check_semt_SecuritiesSettlementTransactionAuditTrailReportV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestV03
	 * SecuritiesTransactionCancellationRequestV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_sese_SecuritiesTransactionCancellationRequestV04
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_sese_SecuritiesTransactionCancellationRequestV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionCancellationRequestV03> for_sese_SecuritiesTransactionCancellationRequestV03 = new MMConstraint<SecuritiesTransactionCancellationRequestV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_sese_SecuritiesTransactionCancellationRequestV04);
			owner_lazy = () -> SecuritiesTransactionCancellationRequestV03.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTransactionCancellationRequestV03 obj) throws Exception {
			check_sese_SecuritiesTransactionCancellationRequestV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV04
	 * SecuritiesFinancingInstructionV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_sese_SecuritiesFinancingInstructionV05
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_sese_SecuritiesFinancingInstructionV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingInstructionV04> for_sese_SecuritiesFinancingInstructionV04 = new MMConstraint<SecuritiesFinancingInstructionV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_sese_SecuritiesFinancingInstructionV05);
			owner_lazy = () -> SecuritiesFinancingInstructionV04.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesFinancingInstructionV04 obj) throws Exception {
			check_sese_SecuritiesFinancingInstructionV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionStatusQueryV03
	 * SecuritiesTransactionStatusQueryV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionStatusQueryV03> for_sese_SecuritiesTransactionStatusQueryV03 = new MMConstraint<SecuritiesTransactionStatusQueryV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesTransactionStatusQueryV03.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTransactionStatusQueryV03 obj) throws Exception {
			check_sese_SecuritiesTransactionStatusQueryV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV08
	 * SecuritiesBalanceAccountingReportV08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_semt_SecuritiesBalanceAccountingReportV07
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_semt_SecuritiesBalanceAccountingReportV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceAccountingReportV08> for_semt_SecuritiesBalanceAccountingReportV08 = new MMConstraint<SecuritiesBalanceAccountingReportV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_semt_SecuritiesBalanceAccountingReportV07;
			owner_lazy = () -> SecuritiesBalanceAccountingReportV08.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesBalanceAccountingReportV08 obj) throws Exception {
			check_semt_SecuritiesBalanceAccountingReportV08(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV03
	 * SecuritiesTransactionPendingReportV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionPendingReportV03> for_semt_SecuritiesTransactionPendingReportV03 = new MMConstraint<SecuritiesTransactionPendingReportV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesTransactionPendingReportV03.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTransactionPendingReportV03 obj) throws Exception {
			check_semt_SecuritiesTransactionPendingReportV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV01
	 * SecuritiesSettlementTransactionReversalAdviceV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionReversalAdviceV01> for_sese_SecuritiesSettlementTransactionReversalAdviceV01 = new MMConstraint<SecuritiesSettlementTransactionReversalAdviceV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesSettlementTransactionReversalAdviceV01.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionReversalAdviceV01 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionReversalAdviceV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementInstructionV01
	 * IntraPositionMovementInstructionV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionMovementInstructionV01> for_semt_IntraPositionMovementInstructionV01 = new MMConstraint<IntraPositionMovementInstructionV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> IntraPositionMovementInstructionV01.mmObject();
		}

		@Override
		public void executeValidator(IntraPositionMovementInstructionV01 obj) throws Exception {
			check_semt_IntraPositionMovementInstructionV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNarrativeV03
	 * CorporateActionNarrativeV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields (except AdditionalInformation/AdditionalInformation) must correspond to ISO 15022 character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNarrativeV03> for_seev_CorporateActionNarrativeV03 = new MMConstraint<CorporateActionNarrativeV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields (except AdditionalInformation/AdditionalInformation) must correspond to ISO 15022 character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionNarrativeV03.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionNarrativeV03 obj) throws Exception {
			check_seev_CorporateActionNarrativeV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV03
	 * SecuritiesStatusOrStatementQueryStatusAdviceV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesStatusOrStatementQueryStatusAdviceV03> for_sese_SecuritiesStatusOrStatementQueryStatusAdviceV03 = new MMConstraint<SecuritiesStatusOrStatementQueryStatusAdviceV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesStatusOrStatementQueryStatusAdviceV03.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesStatusOrStatementQueryStatusAdviceV03 obj) throws Exception {
			check_sese_SecuritiesStatusOrStatementQueryStatusAdviceV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV04
	 * SecuritiesSettlementTransactionReversalAdviceV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_sese_SecuritiesSettlementTransactionReversalAdviceV03
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_sese_SecuritiesSettlementTransactionReversalAdviceV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionReversalAdviceV04> for_sese_SecuritiesSettlementTransactionReversalAdviceV04 = new MMConstraint<SecuritiesSettlementTransactionReversalAdviceV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_sese_SecuritiesSettlementTransactionReversalAdviceV03;
			owner_lazy = () -> SecuritiesSettlementTransactionReversalAdviceV04.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionReversalAdviceV04 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionReversalAdviceV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV03
	 * CorporateActionInstructionStatusAdviceV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionStatusAdviceV03> for_seev_CorporateActionInstructionStatusAdviceV03 = new MMConstraint<CorporateActionInstructionStatusAdviceV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionInstructionStatusAdviceV03.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionStatusAdviceV03 obj) throws Exception {
			check_seev_CorporateActionInstructionStatusAdviceV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV04
	 * SecuritiesTransactionPostingReportV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_semt_SecuritiesTransactionPostingReportV05
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_semt_SecuritiesTransactionPostingReportV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionPostingReportV04> for_semt_SecuritiesTransactionPostingReportV04 = new MMConstraint<SecuritiesTransactionPostingReportV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_semt_SecuritiesTransactionPostingReportV05);
			owner_lazy = () -> SecuritiesTransactionPostingReportV04.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTransactionPostingReportV04 obj) throws Exception {
			check_semt_SecuritiesTransactionPostingReportV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV06
	 * CorporateActionInstructionStatusAdviceV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_seev_CorporateActionInstructionStatusAdviceV05
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_seev_CorporateActionInstructionStatusAdviceV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionStatusAdviceV06> for_seev_CorporateActionInstructionStatusAdviceV06 = new MMConstraint<CorporateActionInstructionStatusAdviceV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_seev_CorporateActionInstructionStatusAdviceV05;
			owner_lazy = () -> CorporateActionInstructionStatusAdviceV06.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionStatusAdviceV06 obj) throws Exception {
			check_seev_CorporateActionInstructionStatusAdviceV06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV02
	 * CorporateActionMovementPreliminaryAdviceV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementPreliminaryAdviceV02> for_seev_CorporateActionMovementPreliminaryAdviceV02 = new MMConstraint<CorporateActionMovementPreliminaryAdviceV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionMovementPreliminaryAdviceV02.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementPreliminaryAdviceV02 obj) throws Exception {
			check_seev_CorporateActionMovementPreliminaryAdviceV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV01
	 * SecuritiesSettlementConditionModificationStatusAdviceV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementConditionModificationStatusAdviceV01> for_sese_SecuritiesSettlementConditionModificationStatusAdviceV01 = new MMConstraint<SecuritiesSettlementConditionModificationStatusAdviceV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesSettlementConditionModificationStatusAdviceV01.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementConditionModificationStatusAdviceV01 obj) throws Exception {
			check_sese_SecuritiesSettlementConditionModificationStatusAdviceV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementInstructionV03
	 * IntraPositionMovementInstructionV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionMovementInstructionV03> for_semt_IntraPositionMovementInstructionV03 = new MMConstraint<IntraPositionMovementInstructionV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> IntraPositionMovementInstructionV03.mmObject();
		}

		@Override
		public void executeValidator(IntraPositionMovementInstructionV03 obj) throws Exception {
			check_semt_IntraPositionMovementInstructionV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV02
	 * SecuritiesSettlementTransactionReversalAdviceV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionReversalAdviceV02> for_sese_SecuritiesSettlementTransactionReversalAdviceV02 = new MMConstraint<SecuritiesSettlementTransactionReversalAdviceV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesSettlementTransactionReversalAdviceV02.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionReversalAdviceV02 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionReversalAdviceV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdviceV01
	 * SecuritiesTransactionCancellationRequestStatusAdviceV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionCancellationRequestStatusAdviceV01> for_sese_SecuritiesTransactionCancellationRequestStatusAdviceV01 = new MMConstraint<SecuritiesTransactionCancellationRequestStatusAdviceV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesTransactionCancellationRequestStatusAdviceV01.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTransactionCancellationRequestStatusAdviceV01 obj) throws Exception {
			check_sese_SecuritiesTransactionCancellationRequestStatusAdviceV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV03
	 * SecuritiesSettlementTransactionInstructionV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV03> for_sese_SecuritiesSettlementTransactionInstructionV03 = new MMConstraint<SecuritiesSettlementTransactionInstructionV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV03.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionInstructionV03 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionInstructionV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatementReportV01
	 * CorporateActionInstructionStatementReportV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionStatementReportV01> for_seev_CorporateActionInstructionStatementReportV01 = new MMConstraint<CorporateActionInstructionStatementReportV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionInstructionStatementReportV01.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionStatementReportV01 obj) throws Exception {
			check_seev_CorporateActionInstructionStatementReportV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV01
	 * CorporateActionMovementReversalAdviceV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementReversalAdviceV01> for_seev_CorporateActionMovementReversalAdviceV01 = new MMConstraint<CorporateActionMovementReversalAdviceV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionMovementReversalAdviceV01.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementReversalAdviceV01 obj) throws Exception {
			check_seev_CorporateActionMovementReversalAdviceV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestV03
	 * CorporateActionInstructionCancellationRequestV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionCancellationRequestV03> for_seev_CorporateActionInstructionCancellationRequestV03 = new MMConstraint<CorporateActionInstructionCancellationRequestV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionInstructionCancellationRequestV03.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionCancellationRequestV03 obj) throws Exception {
			check_seev_CorporateActionInstructionCancellationRequestV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV05
	 * SecuritiesFinancingInstructionV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_sese_SecuritiesFinancingInstructionV04
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_sese_SecuritiesFinancingInstructionV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingInstructionV05> for_sese_SecuritiesFinancingInstructionV05 = new MMConstraint<SecuritiesFinancingInstructionV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_sese_SecuritiesFinancingInstructionV04;
			owner_lazy = () -> SecuritiesFinancingInstructionV05.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesFinancingInstructionV05 obj) throws Exception {
			check_sese_SecuritiesFinancingInstructionV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV07
	 * SecuritiesBalanceCustodyReportV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_semt_SecuritiesBalanceCustodyReportV08
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_semt_SecuritiesBalanceCustodyReportV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_semt_SecuritiesBalanceCustodyReportV06
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_semt_SecuritiesBalanceCustodyReportV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceCustodyReportV07> for_semt_SecuritiesBalanceCustodyReportV07 = new MMConstraint<SecuritiesBalanceCustodyReportV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_semt_SecuritiesBalanceCustodyReportV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_semt_SecuritiesBalanceCustodyReportV06;
			owner_lazy = () -> SecuritiesBalanceCustodyReportV07.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesBalanceCustodyReportV07 obj) throws Exception {
			check_semt_SecuritiesBalanceCustodyReportV07(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV04
	 * SecuritiesSettlementTransactionAllegementNotificationV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_sese_SecuritiesSettlementTransactionAllegementNotificationV03
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_sese_SecuritiesSettlementTransactionAllegementNotificationV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV04> for_sese_SecuritiesSettlementTransactionAllegementNotificationV04 = new MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_sese_SecuritiesSettlementTransactionAllegementNotificationV03;
			owner_lazy = () -> SecuritiesSettlementTransactionAllegementNotificationV04.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionAllegementNotificationV04 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionAllegementNotificationV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionStatusQueryV02
	 * SecuritiesTransactionStatusQueryV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionStatusQueryV02> for_sese_SecuritiesTransactionStatusQueryV02 = new MMConstraint<SecuritiesTransactionStatusQueryV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesTransactionStatusQueryV02.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTransactionStatusQueryV02 obj) throws Exception {
			check_sese_SecuritiesTransactionStatusQueryV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV06
	 * CorporateActionMovementPreliminaryAdviceV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_seev_CorporateActionMovementPreliminaryAdviceV05
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_seev_CorporateActionMovementPreliminaryAdviceV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementPreliminaryAdviceV06> for_seev_CorporateActionMovementPreliminaryAdviceV06 = new MMConstraint<CorporateActionMovementPreliminaryAdviceV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_seev_CorporateActionMovementPreliminaryAdviceV05;
			owner_lazy = () -> CorporateActionMovementPreliminaryAdviceV06.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementPreliminaryAdviceV06 obj) throws Exception {
			check_seev_CorporateActionMovementPreliminaryAdviceV06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV04
	 * CorporateActionEventProcessingStatusAdviceV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionEventProcessingStatusAdviceV04> for_seev_CorporateActionEventProcessingStatusAdviceV04 = new MMConstraint<CorporateActionEventProcessingStatusAdviceV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionEventProcessingStatusAdviceV04.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionEventProcessingStatusAdviceV04 obj) throws Exception {
			check_seev_CorporateActionEventProcessingStatusAdviceV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV01
	 * SecuritiesSettlementTransactionConfirmationV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmationV01> for_sese_SecuritiesSettlementTransactionConfirmationV01 = new MMConstraint<SecuritiesSettlementTransactionConfirmationV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesSettlementTransactionConfirmationV01.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionConfirmationV01 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionConfirmationV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV05
	 * SecuritiesSettlementTransactionInstructionV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_sese_SecuritiesSettlementTransactionInstructionV04
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_sese_SecuritiesSettlementTransactionInstructionV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV05> for_sese_SecuritiesSettlementTransactionInstructionV05 = new MMConstraint<SecuritiesSettlementTransactionInstructionV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_sese_SecuritiesSettlementTransactionInstructionV04;
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV05.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionInstructionV05 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionInstructionV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV05
	 * SecuritiesTransactionPendingReportV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_semt_SecuritiesTransactionPendingReportV06
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_semt_SecuritiesTransactionPendingReportV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_semt_SecuritiesTransactionPendingReportV04
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_semt_SecuritiesTransactionPendingReportV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionPendingReportV05> for_semt_SecuritiesTransactionPendingReportV05 = new MMConstraint<SecuritiesTransactionPendingReportV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_semt_SecuritiesTransactionPendingReportV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_semt_SecuritiesTransactionPendingReportV04;
			owner_lazy = () -> SecuritiesTransactionPendingReportV05.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTransactionPendingReportV05 obj) throws Exception {
			check_semt_SecuritiesTransactionPendingReportV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementStatusAdviceV03
	 * IntraPositionMovementStatusAdviceV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionMovementStatusAdviceV03> for_semt_IntraPositionMovementStatusAdviceV03 = new MMConstraint<IntraPositionMovementStatusAdviceV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> IntraPositionMovementStatusAdviceV03.mmObject();
		}

		@Override
		public void executeValidator(IntraPositionMovementStatusAdviceV03 obj) throws Exception {
			check_semt_IntraPositionMovementStatusAdviceV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV03
	 * SecuritiesTransactionPostingReportV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionPostingReportV03> for_semt_SecuritiesTransactionPostingReportV03 = new MMConstraint<SecuritiesTransactionPostingReportV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesTransactionPostingReportV03.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTransactionPostingReportV03 obj) throws Exception {
			check_semt_SecuritiesTransactionPostingReportV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV04
	 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_seev_CorporateActionMovementPreliminaryAdviceCancellationAdviceV05
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_seev_CorporateActionMovementPreliminaryAdviceCancellationAdviceV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementPreliminaryAdviceCancellationAdviceV04> for_seev_CorporateActionMovementPreliminaryAdviceCancellationAdviceV04 = new MMConstraint<CorporateActionMovementPreliminaryAdviceCancellationAdviceV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_seev_CorporateActionMovementPreliminaryAdviceCancellationAdviceV05);
			owner_lazy = () -> CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementPreliminaryAdviceCancellationAdviceV04 obj) throws Exception {
			check_seev_CorporateActionMovementPreliminaryAdviceCancellationAdviceV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV03
	 * CorporateActionInstructionV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionV03> for_seev_CorporateActionInstructionV03 = new MMConstraint<CorporateActionInstructionV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionInstructionV03.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionV03 obj) throws Exception {
			check_seev_CorporateActionInstructionV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV01
	 * CorporateActionInstructionCancellationRequestStatusAdviceV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionCancellationRequestStatusAdviceV01> for_seev_CorporateActionInstructionCancellationRequestStatusAdviceV01 = new MMConstraint<CorporateActionInstructionCancellationRequestStatusAdviceV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionInstructionCancellationRequestStatusAdviceV01.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionCancellationRequestStatusAdviceV01 obj) throws Exception {
			check_seev_CorporateActionInstructionCancellationRequestStatusAdviceV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01
	 * CorporateActionMovementPreliminaryAdviceV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementPreliminaryAdviceV01> for_seev_CorporateActionMovementPreliminaryAdviceV01 = new MMConstraint<CorporateActionMovementPreliminaryAdviceV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionMovementPreliminaryAdviceV01.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementPreliminaryAdviceV01 obj) throws Exception {
			check_seev_CorporateActionMovementPreliminaryAdviceV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV06
	 * CorporateActionMovementReversalAdviceV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_seev_CorporateActionMovementReversalAdviceV05
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_seev_CorporateActionMovementReversalAdviceV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementReversalAdviceV06> for_seev_CorporateActionMovementReversalAdviceV06 = new MMConstraint<CorporateActionMovementReversalAdviceV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_seev_CorporateActionMovementReversalAdviceV05;
			owner_lazy = () -> CorporateActionMovementReversalAdviceV06.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementReversalAdviceV06 obj) throws Exception {
			check_seev_CorporateActionMovementReversalAdviceV06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatementReportV04
	 * CorporateActionInstructionStatementReportV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionStatementReportV04> for_seev_CorporateActionInstructionStatementReportV04 = new MMConstraint<CorporateActionInstructionStatementReportV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionInstructionStatementReportV04.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionStatementReportV04 obj) throws Exception {
			check_seev_CorporateActionInstructionStatementReportV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV08
	 * SecuritiesBalanceCustodyReportV08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_semt_SecuritiesBalanceCustodyReportV07
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_semt_SecuritiesBalanceCustodyReportV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceCustodyReportV08> for_semt_SecuritiesBalanceCustodyReportV08 = new MMConstraint<SecuritiesBalanceCustodyReportV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_semt_SecuritiesBalanceCustodyReportV07;
			owner_lazy = () -> SecuritiesBalanceCustodyReportV08.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesBalanceCustodyReportV08 obj) throws Exception {
			check_semt_SecuritiesBalanceCustodyReportV08(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesStatementQueryV02
	 * SecuritiesStatementQueryV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesStatementQueryV02> for_semt_SecuritiesStatementQueryV02 = new MMConstraint<SecuritiesStatementQueryV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesStatementQueryV02.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesStatementQueryV02 obj) throws Exception {
			check_semt_SecuritiesStatementQueryV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementAllegementRemovalAdviceV03
	 * SecuritiesSettlementAllegementRemovalAdviceV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementAllegementRemovalAdviceV03> for_sese_SecuritiesSettlementAllegementRemovalAdviceV03 = new MMConstraint<SecuritiesSettlementAllegementRemovalAdviceV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesSettlementAllegementRemovalAdviceV03.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementAllegementRemovalAdviceV03 obj) throws Exception {
			check_sese_SecuritiesSettlementAllegementRemovalAdviceV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV02
	 * CorporateActionInstructionV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionV02> for_seev_CorporateActionInstructionV02 = new MMConstraint<CorporateActionInstructionV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionInstructionV02.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionV02 obj) throws Exception {
			check_seev_CorporateActionInstructionV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV01
	 * SecuritiesSettlementConditionsModificationRequestV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementConditionsModificationRequestV01> for_sese_SecuritiesSettlementConditionsModificationRequestV01 = new MMConstraint<SecuritiesSettlementConditionsModificationRequestV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesSettlementConditionsModificationRequestV01.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementConditionsModificationRequestV01 obj) throws Exception {
			check_sese_SecuritiesSettlementConditionsModificationRequestV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV04
	 * SecuritiesSettlementTransactionGenerationNotificationV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_sese_SecuritiesSettlementTransactionGenerationNotificationV05
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_sese_SecuritiesSettlementTransactionGenerationNotificationV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionGenerationNotificationV04> for_sese_SecuritiesSettlementTransactionGenerationNotificationV04 = new MMConstraint<SecuritiesSettlementTransactionGenerationNotificationV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_sese_SecuritiesSettlementTransactionGenerationNotificationV05);
			owner_lazy = () -> SecuritiesSettlementTransactionGenerationNotificationV04.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionGenerationNotificationV04 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionGenerationNotificationV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesStatementQueryV01
	 * SecuritiesStatementQueryV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesStatementQueryV01> for_semt_SecuritiesStatementQueryV01 = new MMConstraint<SecuritiesStatementQueryV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesStatementQueryV01.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesStatementQueryV01 obj) throws Exception {
			check_semt_SecuritiesStatementQueryV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV05
	 * SecuritiesBalanceAccountingReportV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceAccountingReportV05> for_semt_SecuritiesBalanceAccountingReportV05 = new MMConstraint<SecuritiesBalanceAccountingReportV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesBalanceAccountingReportV05.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesBalanceAccountingReportV05 obj) throws Exception {
			check_semt_SecuritiesBalanceAccountingReportV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV02
	 * SecuritiesSettlementConditionsModificationRequestV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementConditionsModificationRequestV02> for_sese_SecuritiesSettlementConditionsModificationRequestV02 = new MMConstraint<SecuritiesSettlementConditionsModificationRequestV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesSettlementConditionsModificationRequestV02.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementConditionsModificationRequestV02 obj) throws Exception {
			check_sese_SecuritiesSettlementConditionsModificationRequestV02(obj);
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_sese_SecuritiesSettlementTransactionStatusAdviceV05
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_sese_SecuritiesSettlementTransactionStatusAdviceV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionStatusAdviceV04> for_sese_SecuritiesSettlementTransactionStatusAdviceV04 = new MMConstraint<SecuritiesSettlementTransactionStatusAdviceV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_sese_SecuritiesSettlementTransactionStatusAdviceV05);
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
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV02
	 * SecuritiesFinancingConfirmationV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingConfirmationV02> for_sese_SecuritiesFinancingConfirmationV02 = new MMConstraint<SecuritiesFinancingConfirmationV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesFinancingConfirmationV02.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesFinancingConfirmationV02 obj) throws Exception {
			check_sese_SecuritiesFinancingConfirmationV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV05
	 * SecuritiesSettlementConditionModificationStatusAdviceV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_sese_SecuritiesSettlementConditionModificationStatusAdviceV06
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_sese_SecuritiesSettlementConditionModificationStatusAdviceV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_sese_SecuritiesSettlementConditionModificationStatusAdviceV04
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_sese_SecuritiesSettlementConditionModificationStatusAdviceV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementConditionModificationStatusAdviceV05> for_sese_SecuritiesSettlementConditionModificationStatusAdviceV05 = new MMConstraint<SecuritiesSettlementConditionModificationStatusAdviceV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_sese_SecuritiesSettlementConditionModificationStatusAdviceV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_sese_SecuritiesSettlementConditionModificationStatusAdviceV04;
			owner_lazy = () -> SecuritiesSettlementConditionModificationStatusAdviceV05.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementConditionModificationStatusAdviceV05 obj) throws Exception {
			check_sese_SecuritiesSettlementConditionModificationStatusAdviceV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV04
	 * CorporateActionCancellationAdviceV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_seev_CorporateActionCancellationAdviceV05
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_seev_CorporateActionCancellationAdviceV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionCancellationAdviceV04> for_seev_CorporateActionCancellationAdviceV04 = new MMConstraint<CorporateActionCancellationAdviceV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_seev_CorporateActionCancellationAdviceV05);
			owner_lazy = () -> CorporateActionCancellationAdviceV04.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionCancellationAdviceV04 obj) throws Exception {
			check_seev_CorporateActionCancellationAdviceV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNarrativeV02
	 * CorporateActionNarrativeV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields (except AdditionalInformation/AdditionalInformation) must correspond to ISO 15022 character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNarrativeV02> for_seev_CorporateActionNarrativeV02 = new MMConstraint<CorporateActionNarrativeV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields (except AdditionalInformation/AdditionalInformation) must correspond to ISO 15022 character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionNarrativeV02.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionNarrativeV02 obj) throws Exception {
			check_seev_CorporateActionNarrativeV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementStatusAdviceV02
	 * IntraPositionMovementStatusAdviceV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionMovementStatusAdviceV02> for_semt_IntraPositionMovementStatusAdviceV02 = new MMConstraint<IntraPositionMovementStatusAdviceV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> IntraPositionMovementStatusAdviceV02.mmObject();
		}

		@Override
		public void executeValidator(IntraPositionMovementStatusAdviceV02 obj) throws Exception {
			check_semt_IntraPositionMovementStatusAdviceV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementPostingReportV02
	 * IntraPositionMovementPostingReportV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionMovementPostingReportV02> for_semt_IntraPositionMovementPostingReportV02 = new MMConstraint<IntraPositionMovementPostingReportV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> IntraPositionMovementPostingReportV02.mmObject();
		}

		@Override
		public void executeValidator(IntraPositionMovementPostingReportV02 obj) throws Exception {
			check_semt_IntraPositionMovementPostingReportV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV01
	 * SecuritiesFinancingInstructionV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingInstructionV01> for_sese_SecuritiesFinancingInstructionV01 = new MMConstraint<SecuritiesFinancingInstructionV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesFinancingInstructionV01.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesFinancingInstructionV01 obj) throws Exception {
			check_sese_SecuritiesFinancingInstructionV01(obj);
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields (except for CorporateActionDetails/CorporateActionAdditionalInformation/URLAddress)  must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_seev_CorporateActionNotificationV04
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_seev_CorporateActionNotificationV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV05> for_seev_CorporateActionNotificationV05 = new MMConstraint<CorporateActionNotificationV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields (except for CorporateActionDetails/CorporateActionAdditionalInformation/URLAddress)  must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_seev_CorporateActionNotificationV04;
			owner_lazy = () -> CorporateActionNotificationV05.mmObject();
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
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV03
	 * SecuritiesSettlementTransactionStatusAdviceV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionStatusAdviceV03> for_sese_SecuritiesSettlementTransactionStatusAdviceV03 = new MMConstraint<SecuritiesSettlementTransactionStatusAdviceV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
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
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV03
	 * SecuritiesSettlementConditionsModificationRequestV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementConditionsModificationRequestV03> for_sese_SecuritiesSettlementConditionsModificationRequestV03 = new MMConstraint<SecuritiesSettlementConditionsModificationRequestV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesSettlementConditionsModificationRequestV03.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementConditionsModificationRequestV03 obj) throws Exception {
			check_sese_SecuritiesSettlementConditionsModificationRequestV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV01
	 * SecuritiesTransactionPostingReportV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionPostingReportV01> for_semt_SecuritiesTransactionPostingReportV01 = new MMConstraint<SecuritiesTransactionPostingReportV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesTransactionPostingReportV01.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTransactionPostingReportV01 obj) throws Exception {
			check_semt_SecuritiesTransactionPostingReportV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV02
	 * CorporateActionMovementReversalAdviceV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementReversalAdviceV02> for_seev_CorporateActionMovementReversalAdviceV02 = new MMConstraint<CorporateActionMovementReversalAdviceV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionMovementReversalAdviceV02.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementReversalAdviceV02 obj) throws Exception {
			check_seev_CorporateActionMovementReversalAdviceV02(obj);
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_sese_SecuritiesFinancingStatusAdviceV05
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_sese_SecuritiesFinancingStatusAdviceV05}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_sese_SecuritiesFinancingStatusAdviceV03
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_sese_SecuritiesFinancingStatusAdviceV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingStatusAdviceV04> for_sese_SecuritiesFinancingStatusAdviceV04 = new MMConstraint<SecuritiesFinancingStatusAdviceV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_sese_SecuritiesFinancingStatusAdviceV05);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_sese_SecuritiesFinancingStatusAdviceV03;
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
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV04
	 * CorporateActionInstructionV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_seev_CorporateActionInstructionV05
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_seev_CorporateActionInstructionV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionV04> for_seev_CorporateActionInstructionV04 = new MMConstraint<CorporateActionInstructionV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_seev_CorporateActionInstructionV05);
			owner_lazy = () -> CorporateActionInstructionV04.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionV04 obj) throws Exception {
			check_seev_CorporateActionInstructionV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV01
	 * CorporateActionInstructionV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionV01> for_seev_CorporateActionInstructionV01 = new MMConstraint<CorporateActionInstructionV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionInstructionV01.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionV01 obj) throws Exception {
			check_seev_CorporateActionInstructionV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV07
	 * SecuritiesBalanceAccountingReportV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_semt_SecuritiesBalanceAccountingReportV08
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_semt_SecuritiesBalanceAccountingReportV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_semt_SecuritiesBalanceAccountingReportV06
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_semt_SecuritiesBalanceAccountingReportV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceAccountingReportV07> for_semt_SecuritiesBalanceAccountingReportV07 = new MMConstraint<SecuritiesBalanceAccountingReportV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_semt_SecuritiesBalanceAccountingReportV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_semt_SecuritiesBalanceAccountingReportV06;
			owner_lazy = () -> SecuritiesBalanceAccountingReportV07.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesBalanceAccountingReportV07 obj) throws Exception {
			check_semt_SecuritiesBalanceAccountingReportV07(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementPostingReportV01
	 * IntraPositionMovementPostingReportV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionMovementPostingReportV01> for_semt_IntraPositionMovementPostingReportV01 = new MMConstraint<IntraPositionMovementPostingReportV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> IntraPositionMovementPostingReportV01.mmObject();
		}

		@Override
		public void executeValidator(IntraPositionMovementPostingReportV01 obj) throws Exception {
			check_semt_IntraPositionMovementPostingReportV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV03
	 * SecuritiesSettlementTransactionAllegementNotificationV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_sese_SecuritiesSettlementTransactionAllegementNotificationV04
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_sese_SecuritiesSettlementTransactionAllegementNotificationV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV03> for_sese_SecuritiesSettlementTransactionAllegementNotificationV03 = new MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_sese_SecuritiesSettlementTransactionAllegementNotificationV04);
			owner_lazy = () -> SecuritiesSettlementTransactionAllegementNotificationV03.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionAllegementNotificationV03 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionAllegementNotificationV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV03
	 * SecuritiesSettlementTransactionReversalAdviceV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_sese_SecuritiesSettlementTransactionReversalAdviceV04
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_sese_SecuritiesSettlementTransactionReversalAdviceV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionReversalAdviceV03> for_sese_SecuritiesSettlementTransactionReversalAdviceV03 = new MMConstraint<SecuritiesSettlementTransactionReversalAdviceV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_sese_SecuritiesSettlementTransactionReversalAdviceV04);
			owner_lazy = () -> SecuritiesSettlementTransactionReversalAdviceV03.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionReversalAdviceV03 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionReversalAdviceV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV05
	 * SecuritiesSettlementTransactionGenerationNotificationV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_sese_SecuritiesSettlementTransactionGenerationNotificationV04
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_sese_SecuritiesSettlementTransactionGenerationNotificationV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionGenerationNotificationV05> for_sese_SecuritiesSettlementTransactionGenerationNotificationV05 = new MMConstraint<SecuritiesSettlementTransactionGenerationNotificationV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_sese_SecuritiesSettlementTransactionGenerationNotificationV04;
			owner_lazy = () -> SecuritiesSettlementTransactionGenerationNotificationV05.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionGenerationNotificationV05 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionGenerationNotificationV05(obj);
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields (except for CorporateActionDetails/CorporateActionAdditionalInformation/URLAddress)  must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_seev_CorporateActionNotificationV05
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_seev_CorporateActionNotificationV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV04> for_seev_CorporateActionNotificationV04 = new MMConstraint<CorporateActionNotificationV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields (except for CorporateActionDetails/CorporateActionAdditionalInformation/URLAddress)  must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_seev_CorporateActionNotificationV05);
			owner_lazy = () -> CorporateActionNotificationV04.mmObject();
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
	 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementInstructionV02
	 * IntraPositionMovementInstructionV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionMovementInstructionV02> for_semt_IntraPositionMovementInstructionV02 = new MMConstraint<IntraPositionMovementInstructionV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> IntraPositionMovementInstructionV02.mmObject();
		}

		@Override
		public void executeValidator(IntraPositionMovementInstructionV02 obj) throws Exception {
			check_semt_IntraPositionMovementInstructionV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionStatusQueryV01
	 * SecuritiesTransactionStatusQueryV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionStatusQueryV01> for_sese_SecuritiesTransactionStatusQueryV01 = new MMConstraint<SecuritiesTransactionStatusQueryV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesTransactionStatusQueryV01.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTransactionStatusQueryV01 obj) throws Exception {
			check_sese_SecuritiesTransactionStatusQueryV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV01
	 * SecuritiesSettlementTransactionAllegementNotificationV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV01> for_sese_SecuritiesSettlementTransactionAllegementNotificationV01 = new MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesSettlementTransactionAllegementNotificationV01.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionAllegementNotificationV01 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionAllegementNotificationV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV03
	 * CorporateActionMovementReversalAdviceV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementReversalAdviceV03> for_seev_CorporateActionMovementReversalAdviceV03 = new MMConstraint<CorporateActionMovementReversalAdviceV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionMovementReversalAdviceV03.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementReversalAdviceV03 obj) throws Exception {
			check_seev_CorporateActionMovementReversalAdviceV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageCancellationAdviceV01
	 * SecuritiesMessageCancellationAdviceV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesMessageCancellationAdviceV01> for_semt_SecuritiesMessageCancellationAdviceV01 = new MMConstraint<SecuritiesMessageCancellationAdviceV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesMessageCancellationAdviceV01.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesMessageCancellationAdviceV01 obj) throws Exception {
			check_semt_SecuritiesMessageCancellationAdviceV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV04
	 * SecuritiesBalanceAccountingReportV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceAccountingReportV04> for_semt_SecuritiesBalanceAccountingReportV04 = new MMConstraint<SecuritiesBalanceAccountingReportV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesBalanceAccountingReportV04.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesBalanceAccountingReportV04 obj) throws Exception {
			check_semt_SecuritiesBalanceAccountingReportV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV01
	 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementPreliminaryAdviceCancellationAdviceV01> for_seev_CorporateActionMovementPreliminaryAdviceCancellationAdviceV01 = new MMConstraint<CorporateActionMovementPreliminaryAdviceCancellationAdviceV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionMovementPreliminaryAdviceCancellationAdviceV01.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementPreliminaryAdviceCancellationAdviceV01 obj) throws Exception {
			check_seev_CorporateActionMovementPreliminaryAdviceCancellationAdviceV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV04
	 * CorporateActionMovementReversalAdviceV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_seev_CorporateActionMovementReversalAdviceV05
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_seev_CorporateActionMovementReversalAdviceV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementReversalAdviceV04> for_seev_CorporateActionMovementReversalAdviceV04 = new MMConstraint<CorporateActionMovementReversalAdviceV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_seev_CorporateActionMovementReversalAdviceV05);
			owner_lazy = () -> CorporateActionMovementReversalAdviceV04.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementReversalAdviceV04 obj) throws Exception {
			check_seev_CorporateActionMovementReversalAdviceV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV05
	 * SecuritiesSettlementConditionsModificationRequestV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_sese_SecuritiesSettlementConditionsModificationRequestV04
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_sese_SecuritiesSettlementConditionsModificationRequestV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementConditionsModificationRequestV05> for_sese_SecuritiesSettlementConditionsModificationRequestV05 = new MMConstraint<SecuritiesSettlementConditionsModificationRequestV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_sese_SecuritiesSettlementConditionsModificationRequestV04;
			owner_lazy = () -> SecuritiesSettlementConditionsModificationRequestV05.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementConditionsModificationRequestV05 obj) throws Exception {
			check_sese_SecuritiesSettlementConditionsModificationRequestV05(obj);
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_sese_SecuritiesSettlementTransactionStatusAdviceV06
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_sese_SecuritiesSettlementTransactionStatusAdviceV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_sese_SecuritiesSettlementTransactionStatusAdviceV04
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_sese_SecuritiesSettlementTransactionStatusAdviceV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionStatusAdviceV05> for_sese_SecuritiesSettlementTransactionStatusAdviceV05 = new MMConstraint<SecuritiesSettlementTransactionStatusAdviceV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_sese_SecuritiesSettlementTransactionStatusAdviceV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_sese_SecuritiesSettlementTransactionStatusAdviceV04;
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
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV03
	 * SecuritiesFinancingInstructionV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingInstructionV03> for_sese_SecuritiesFinancingInstructionV03 = new MMConstraint<SecuritiesFinancingInstructionV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesFinancingInstructionV03.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesFinancingInstructionV03 obj) throws Exception {
			check_sese_SecuritiesFinancingInstructionV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV02
	 * CorporateActionNotificationV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields (except for CorporateActionDetails/CorporateActionAdditionalInformation/URLAddress)  must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV02> for_seev_CorporateActionNotificationV02 = new MMConstraint<CorporateActionNotificationV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields (except for CorporateActionDetails/CorporateActionAdditionalInformation/URLAddress)  must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionNotificationV02.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionNotificationV02 obj) throws Exception {
			check_seev_CorporateActionNotificationV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV02
	 * SecuritiesTransactionPendingReportV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionPendingReportV02> for_semt_SecuritiesTransactionPendingReportV02 = new MMConstraint<SecuritiesTransactionPendingReportV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesTransactionPendingReportV02.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTransactionPendingReportV02 obj) throws Exception {
			check_semt_SecuritiesTransactionPendingReportV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV03
	 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementPreliminaryAdviceCancellationAdviceV03> for_seev_CorporateActionMovementPreliminaryAdviceCancellationAdviceV03 = new MMConstraint<CorporateActionMovementPreliminaryAdviceCancellationAdviceV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionMovementPreliminaryAdviceCancellationAdviceV03.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementPreliminaryAdviceCancellationAdviceV03 obj) throws Exception {
			check_seev_CorporateActionMovementPreliminaryAdviceCancellationAdviceV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementPostingReportV04
	 * IntraPositionMovementPostingReportV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionMovementPostingReportV04> for_semt_IntraPositionMovementPostingReportV04 = new MMConstraint<IntraPositionMovementPostingReportV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> IntraPositionMovementPostingReportV04.mmObject();
		}

		@Override
		public void executeValidator(IntraPositionMovementPostingReportV04 obj) throws Exception {
			check_semt_IntraPositionMovementPostingReportV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV03
	 * CorporateActionMovementPreliminaryAdviceV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementPreliminaryAdviceV03> for_seev_CorporateActionMovementPreliminaryAdviceV03 = new MMConstraint<CorporateActionMovementPreliminaryAdviceV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionMovementPreliminaryAdviceV03.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementPreliminaryAdviceV03 obj) throws Exception {
			check_seev_CorporateActionMovementPreliminaryAdviceV03(obj);
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_sese_SecuritiesSettlementTransactionStatusAdviceV05
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_sese_SecuritiesSettlementTransactionStatusAdviceV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionStatusAdviceV06> for_sese_SecuritiesSettlementTransactionStatusAdviceV06 = new MMConstraint<SecuritiesSettlementTransactionStatusAdviceV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_sese_SecuritiesSettlementTransactionStatusAdviceV05;
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
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV05
	 * CorporateActionInstructionStatusAdviceV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_seev_CorporateActionInstructionStatusAdviceV06
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_seev_CorporateActionInstructionStatusAdviceV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_seev_CorporateActionInstructionStatusAdviceV04
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_seev_CorporateActionInstructionStatusAdviceV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionStatusAdviceV05> for_seev_CorporateActionInstructionStatusAdviceV05 = new MMConstraint<CorporateActionInstructionStatusAdviceV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_seev_CorporateActionInstructionStatusAdviceV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_seev_CorporateActionInstructionStatusAdviceV04;
			owner_lazy = () -> CorporateActionInstructionStatusAdviceV05.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionStatusAdviceV05 obj) throws Exception {
			check_seev_CorporateActionInstructionStatusAdviceV05(obj);
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingStatusAdviceV01> for_sese_SecuritiesFinancingStatusAdviceV01 = new MMConstraint<SecuritiesFinancingStatusAdviceV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
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
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV01
	 * CorporateActionCancellationAdviceV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionCancellationAdviceV01> for_seev_CorporateActionCancellationAdviceV01 = new MMConstraint<CorporateActionCancellationAdviceV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionCancellationAdviceV01.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionCancellationAdviceV01 obj) throws Exception {
			check_seev_CorporateActionCancellationAdviceV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestV01
	 * CorporateActionInstructionCancellationRequestV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionCancellationRequestV01> for_seev_CorporateActionInstructionCancellationRequestV01 = new MMConstraint<CorporateActionInstructionCancellationRequestV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionInstructionCancellationRequestV01.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionCancellationRequestV01 obj) throws Exception {
			check_seev_CorporateActionInstructionCancellationRequestV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementAllegementRemovalAdviceV02
	 * SecuritiesSettlementAllegementRemovalAdviceV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementAllegementRemovalAdviceV02> for_sese_SecuritiesSettlementAllegementRemovalAdviceV02 = new MMConstraint<SecuritiesSettlementAllegementRemovalAdviceV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesSettlementAllegementRemovalAdviceV02.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementAllegementRemovalAdviceV02 obj) throws Exception {
			check_sese_SecuritiesSettlementAllegementRemovalAdviceV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV06
	 * SecuritiesBalanceAccountingReportV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_semt_SecuritiesBalanceAccountingReportV07
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_semt_SecuritiesBalanceAccountingReportV07}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceAccountingReportV06> for_semt_SecuritiesBalanceAccountingReportV06 = new MMConstraint<SecuritiesBalanceAccountingReportV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_semt_SecuritiesBalanceAccountingReportV07);
			owner_lazy = () -> SecuritiesBalanceAccountingReportV06.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesBalanceAccountingReportV06 obj) throws Exception {
			check_semt_SecuritiesBalanceAccountingReportV06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdviceV02
	 * SecuritiesTransactionCancellationRequestStatusAdviceV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionCancellationRequestStatusAdviceV02> for_sese_SecuritiesTransactionCancellationRequestStatusAdviceV02 = new MMConstraint<SecuritiesTransactionCancellationRequestStatusAdviceV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesTransactionCancellationRequestStatusAdviceV02.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTransactionCancellationRequestStatusAdviceV02 obj) throws Exception {
			check_sese_SecuritiesTransactionCancellationRequestStatusAdviceV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV06
	 * SecuritiesSettlementConditionModificationStatusAdviceV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_sese_SecuritiesSettlementConditionModificationStatusAdviceV05
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_sese_SecuritiesSettlementConditionModificationStatusAdviceV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementConditionModificationStatusAdviceV06> for_sese_SecuritiesSettlementConditionModificationStatusAdviceV06 = new MMConstraint<SecuritiesSettlementConditionModificationStatusAdviceV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_sese_SecuritiesSettlementConditionModificationStatusAdviceV05;
			owner_lazy = () -> SecuritiesSettlementConditionModificationStatusAdviceV06.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementConditionModificationStatusAdviceV06 obj) throws Exception {
			check_sese_SecuritiesSettlementConditionModificationStatusAdviceV06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferNotificationV01
	 * PortfolioTransferNotificationV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PortfolioTransferNotificationV01> for_sese_PortfolioTransferNotificationV01 = new MMConstraint<PortfolioTransferNotificationV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> PortfolioTransferNotificationV01.mmObject();
		}

		@Override
		public void executeValidator(PortfolioTransferNotificationV01 obj) throws Exception {
			check_sese_PortfolioTransferNotificationV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV01
	 * SecuritiesFinancingModificationInstructionV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingModificationInstructionV01> for_sese_SecuritiesFinancingModificationInstructionV01 = new MMConstraint<SecuritiesFinancingModificationInstructionV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesFinancingModificationInstructionV01.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesFinancingModificationInstructionV01 obj) throws Exception {
			check_sese_SecuritiesFinancingModificationInstructionV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV03
	 * SecuritiesFinancingModificationInstructionV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_sese_SecuritiesFinancingModificationInstructionV04
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_sese_SecuritiesFinancingModificationInstructionV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingModificationInstructionV03> for_sese_SecuritiesFinancingModificationInstructionV03 = new MMConstraint<SecuritiesFinancingModificationInstructionV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_sese_SecuritiesFinancingModificationInstructionV04);
			owner_lazy = () -> SecuritiesFinancingModificationInstructionV03.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesFinancingModificationInstructionV03 obj) throws Exception {
			check_sese_SecuritiesFinancingModificationInstructionV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV01
	 * SecuritiesSettlementTransactionInstructionV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV01> for_sese_SecuritiesSettlementTransactionInstructionV01 = new MMConstraint<SecuritiesSettlementTransactionInstructionV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV01.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionInstructionV01 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionInstructionV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV02
	 * CorporateActionInstructionStatusAdviceV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionStatusAdviceV02> for_seev_CorporateActionInstructionStatusAdviceV02 = new MMConstraint<CorporateActionInstructionStatusAdviceV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionInstructionStatusAdviceV02.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionStatusAdviceV02 obj) throws Exception {
			check_seev_CorporateActionInstructionStatusAdviceV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatementReportV02
	 * CorporateActionInstructionStatementReportV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionStatementReportV02> for_seev_CorporateActionInstructionStatementReportV02 = new MMConstraint<CorporateActionInstructionStatementReportV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionInstructionStatementReportV02.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionStatementReportV02 obj) throws Exception {
			check_seev_CorporateActionInstructionStatementReportV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV01
	 * CorporateActionMovementConfirmationV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementConfirmationV01> for_seev_CorporateActionMovementConfirmationV01 = new MMConstraint<CorporateActionMovementConfirmationV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionMovementConfirmationV01.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementConfirmationV01 obj) throws Exception {
			check_seev_CorporateActionMovementConfirmationV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV05
	 * SecuritiesTransactionPostingReportV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_semt_SecuritiesTransactionPostingReportV04
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_semt_SecuritiesTransactionPostingReportV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionPostingReportV05> for_semt_SecuritiesTransactionPostingReportV05 = new MMConstraint<SecuritiesTransactionPostingReportV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_semt_SecuritiesTransactionPostingReportV04;
			owner_lazy = () -> SecuritiesTransactionPostingReportV05.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTransactionPostingReportV05 obj) throws Exception {
			check_semt_SecuritiesTransactionPostingReportV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV01
	 * SecuritiesFinancingConfirmationV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingConfirmationV01> for_sese_SecuritiesFinancingConfirmationV01 = new MMConstraint<SecuritiesFinancingConfirmationV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesFinancingConfirmationV01.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesFinancingConfirmationV01 obj) throws Exception {
			check_sese_SecuritiesFinancingConfirmationV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV04
	 * CorporateActionMovementConfirmationV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_seev_CorporateActionMovementConfirmationV05
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_seev_CorporateActionMovementConfirmationV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementConfirmationV04> for_seev_CorporateActionMovementConfirmationV04 = new MMConstraint<CorporateActionMovementConfirmationV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_seev_CorporateActionMovementConfirmationV05);
			owner_lazy = () -> CorporateActionMovementConfirmationV04.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementConfirmationV04 obj) throws Exception {
			check_seev_CorporateActionMovementConfirmationV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementStatusAdviceV01
	 * IntraPositionMovementStatusAdviceV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionMovementStatusAdviceV01> for_semt_IntraPositionMovementStatusAdviceV01 = new MMConstraint<IntraPositionMovementStatusAdviceV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> IntraPositionMovementStatusAdviceV01.mmObject();
		}

		@Override
		public void executeValidator(IntraPositionMovementStatusAdviceV01 obj) throws Exception {
			check_semt_IntraPositionMovementStatusAdviceV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesStatementQueryV05
	 * SecuritiesStatementQueryV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_semt_SecuritiesStatementQueryV04
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_semt_SecuritiesStatementQueryV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesStatementQueryV05> for_semt_SecuritiesStatementQueryV05 = new MMConstraint<SecuritiesStatementQueryV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_semt_SecuritiesStatementQueryV04;
			owner_lazy = () -> SecuritiesStatementQueryV05.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesStatementQueryV05 obj) throws Exception {
			check_semt_SecuritiesStatementQueryV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV02
	 * SecuritiesSettlementTransactionInstructionV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV02> for_sese_SecuritiesSettlementTransactionInstructionV02 = new MMConstraint<SecuritiesSettlementTransactionInstructionV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV02.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionInstructionV02 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionInstructionV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV01
	 * CorporateActionInstructionStatusAdviceV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionStatusAdviceV01> for_seev_CorporateActionInstructionStatusAdviceV01 = new MMConstraint<CorporateActionInstructionStatusAdviceV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionInstructionStatusAdviceV01.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionStatusAdviceV01 obj) throws Exception {
			check_seev_CorporateActionInstructionStatusAdviceV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV02
	 * SecuritiesTransactionPostingReportV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionPostingReportV02> for_semt_SecuritiesTransactionPostingReportV02 = new MMConstraint<SecuritiesTransactionPostingReportV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesTransactionPostingReportV02.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTransactionPostingReportV02 obj) throws Exception {
			check_semt_SecuritiesTransactionPostingReportV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestV05
	 * CorporateActionInstructionCancellationRequestV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_seev_CorporateActionInstructionCancellationRequestV04
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_seev_CorporateActionInstructionCancellationRequestV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionCancellationRequestV05> for_seev_CorporateActionInstructionCancellationRequestV05 = new MMConstraint<CorporateActionInstructionCancellationRequestV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_seev_CorporateActionInstructionCancellationRequestV04;
			owner_lazy = () -> CorporateActionInstructionCancellationRequestV05.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionCancellationRequestV05 obj) throws Exception {
			check_seev_CorporateActionInstructionCancellationRequestV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV04
	 * CorporateActionInstructionStatusAdviceV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_seev_CorporateActionInstructionStatusAdviceV05
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_seev_CorporateActionInstructionStatusAdviceV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionStatusAdviceV04> for_seev_CorporateActionInstructionStatusAdviceV04 = new MMConstraint<CorporateActionInstructionStatusAdviceV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_seev_CorporateActionInstructionStatusAdviceV05);
			owner_lazy = () -> CorporateActionInstructionStatusAdviceV04.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionStatusAdviceV04 obj) throws Exception {
			check_seev_CorporateActionInstructionStatusAdviceV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV02
	 * SecuritiesSettlementTransactionAllegementNotificationV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV02> for_sese_SecuritiesSettlementTransactionAllegementNotificationV02 = new MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesSettlementTransactionAllegementNotificationV02.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionAllegementNotificationV02 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionAllegementNotificationV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV01
	 * CorporateActionNotificationV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields (except for CorporateActionDetails/CorporateActionAdditionalInformation/URLAddress)  must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV01> for_seev_CorporateActionNotificationV01 = new MMConstraint<CorporateActionNotificationV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields (except for CorporateActionDetails/CorporateActionAdditionalInformation/URLAddress)  must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionNotificationV01.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionNotificationV01 obj) throws Exception {
			check_seev_CorporateActionNotificationV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV04
	 * IntraPositionMovementConfirmationV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionMovementConfirmationV04> for_semt_IntraPositionMovementConfirmationV04 = new MMConstraint<IntraPositionMovementConfirmationV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> IntraPositionMovementConfirmationV04.mmObject();
		}

		@Override
		public void executeValidator(IntraPositionMovementConfirmationV04 obj) throws Exception {
			check_semt_IntraPositionMovementConfirmationV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV01
	 * SecuritiesSettlementTransactionGenerationNotificationV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionGenerationNotificationV01> for_sese_SecuritiesSettlementTransactionGenerationNotificationV01 = new MMConstraint<SecuritiesSettlementTransactionGenerationNotificationV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesSettlementTransactionGenerationNotificationV01.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionGenerationNotificationV01 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionGenerationNotificationV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageCancellationAdviceV03
	 * SecuritiesMessageCancellationAdviceV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesMessageCancellationAdviceV03> for_semt_SecuritiesMessageCancellationAdviceV03 = new MMConstraint<SecuritiesMessageCancellationAdviceV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesMessageCancellationAdviceV03.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesMessageCancellationAdviceV03 obj) throws Exception {
			check_semt_SecuritiesMessageCancellationAdviceV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV02
	 * SecuritiesFinancingInstructionV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingInstructionV02> for_sese_SecuritiesFinancingInstructionV02 = new MMConstraint<SecuritiesFinancingInstructionV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesFinancingInstructionV02.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesFinancingInstructionV02 obj) throws Exception {
			check_sese_SecuritiesFinancingInstructionV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageCancellationAdviceV02
	 * SecuritiesMessageCancellationAdviceV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesMessageCancellationAdviceV02> for_semt_SecuritiesMessageCancellationAdviceV02 = new MMConstraint<SecuritiesMessageCancellationAdviceV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesMessageCancellationAdviceV02.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesMessageCancellationAdviceV02 obj) throws Exception {
			check_semt_SecuritiesMessageCancellationAdviceV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV01
	 * SecuritiesTransactionPendingReportV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionPendingReportV01> for_semt_SecuritiesTransactionPendingReportV01 = new MMConstraint<SecuritiesTransactionPendingReportV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesTransactionPendingReportV01.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTransactionPendingReportV01 obj) throws Exception {
			check_semt_SecuritiesTransactionPendingReportV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV02
	 * CorporateActionInstructionCancellationRequestStatusAdviceV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionCancellationRequestStatusAdviceV02> for_seev_CorporateActionInstructionCancellationRequestStatusAdviceV02 = new MMConstraint<CorporateActionInstructionCancellationRequestStatusAdviceV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionInstructionCancellationRequestStatusAdviceV02.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionCancellationRequestStatusAdviceV02 obj) throws Exception {
			check_seev_CorporateActionInstructionCancellationRequestStatusAdviceV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV05
	 * SecuritiesSettlementTransactionConfirmationV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_sese_SecuritiesSettlementTransactionConfirmationV04
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_sese_SecuritiesSettlementTransactionConfirmationV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmationV05> for_sese_SecuritiesSettlementTransactionConfirmationV05 = new MMConstraint<SecuritiesSettlementTransactionConfirmationV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_sese_SecuritiesSettlementTransactionConfirmationV04;
			owner_lazy = () -> SecuritiesSettlementTransactionConfirmationV05.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionConfirmationV05 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionConfirmationV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReportV02
	 * SecuritiesSettlementTransactionAllegementReportV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionAllegementReportV02> for_semt_SecuritiesSettlementTransactionAllegementReportV02 = new MMConstraint<SecuritiesSettlementTransactionAllegementReportV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesSettlementTransactionAllegementReportV02.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionAllegementReportV02 obj) throws Exception {
			check_semt_SecuritiesSettlementTransactionAllegementReportV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV02
	 * SecuritiesSettlementConditionModificationStatusAdviceV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementConditionModificationStatusAdviceV02> for_sese_SecuritiesSettlementConditionModificationStatusAdviceV02 = new MMConstraint<SecuritiesSettlementConditionModificationStatusAdviceV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesSettlementConditionModificationStatusAdviceV02.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementConditionModificationStatusAdviceV02 obj) throws Exception {
			check_sese_SecuritiesSettlementConditionModificationStatusAdviceV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReportV03
	 * SecuritiesSettlementTransactionAllegementReportV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_semt_SecuritiesSettlementTransactionAllegementReportV04
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_semt_SecuritiesSettlementTransactionAllegementReportV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionAllegementReportV03> for_semt_SecuritiesSettlementTransactionAllegementReportV03 = new MMConstraint<SecuritiesSettlementTransactionAllegementReportV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_semt_SecuritiesSettlementTransactionAllegementReportV04);
			owner_lazy = () -> SecuritiesSettlementTransactionAllegementReportV03.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionAllegementReportV03 obj) throws Exception {
			check_semt_SecuritiesSettlementTransactionAllegementReportV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferNotificationV02
	 * PortfolioTransferNotificationV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PortfolioTransferNotificationV02> for_sese_PortfolioTransferNotificationV02 = new MMConstraint<PortfolioTransferNotificationV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> PortfolioTransferNotificationV02.mmObject();
		}

		@Override
		public void executeValidator(PortfolioTransferNotificationV02 obj) throws Exception {
			check_sese_PortfolioTransferNotificationV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV03
	 * CorporateActionInstructionCancellationRequestStatusAdviceV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionCancellationRequestStatusAdviceV03> for_seev_CorporateActionInstructionCancellationRequestStatusAdviceV03 = new MMConstraint<CorporateActionInstructionCancellationRequestStatusAdviceV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionInstructionCancellationRequestStatusAdviceV03.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionCancellationRequestStatusAdviceV03 obj) throws Exception {
			check_seev_CorporateActionInstructionCancellationRequestStatusAdviceV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV05
	 * CorporateActionInstructionCancellationRequestStatusAdviceV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_seev_CorporateActionInstructionCancellationRequestStatusAdviceV04
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_seev_CorporateActionInstructionCancellationRequestStatusAdviceV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionCancellationRequestStatusAdviceV05> for_seev_CorporateActionInstructionCancellationRequestStatusAdviceV05 = new MMConstraint<CorporateActionInstructionCancellationRequestStatusAdviceV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_seev_CorporateActionInstructionCancellationRequestStatusAdviceV04;
			owner_lazy = () -> CorporateActionInstructionCancellationRequestStatusAdviceV05.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionCancellationRequestStatusAdviceV05 obj) throws Exception {
			check_seev_CorporateActionInstructionCancellationRequestStatusAdviceV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV04
	 * SecuritiesSettlementTransactionInstructionV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_sese_SecuritiesSettlementTransactionInstructionV05
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_sese_SecuritiesSettlementTransactionInstructionV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV04> for_sese_SecuritiesSettlementTransactionInstructionV04 = new MMConstraint<SecuritiesSettlementTransactionInstructionV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_sese_SecuritiesSettlementTransactionInstructionV05);
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV04.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionInstructionV04 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionInstructionV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestV01
	 * SecuritiesTransactionCancellationRequestV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionCancellationRequestV01> for_sese_SecuritiesTransactionCancellationRequestV01 = new MMConstraint<SecuritiesTransactionCancellationRequestV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesTransactionCancellationRequestV01.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTransactionCancellationRequestV01 obj) throws Exception {
			check_sese_SecuritiesTransactionCancellationRequestV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV04
	 * SecuritiesSettlementConditionsModificationRequestV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_sese_SecuritiesSettlementConditionsModificationRequestV05
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_sese_SecuritiesSettlementConditionsModificationRequestV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementConditionsModificationRequestV04> for_sese_SecuritiesSettlementConditionsModificationRequestV04 = new MMConstraint<SecuritiesSettlementConditionsModificationRequestV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_sese_SecuritiesSettlementConditionsModificationRequestV05);
			owner_lazy = () -> SecuritiesSettlementConditionsModificationRequestV04.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementConditionsModificationRequestV04 obj) throws Exception {
			check_sese_SecuritiesSettlementConditionsModificationRequestV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReportV01
	 * SecuritiesSettlementTransactionAuditTrailReportV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_semt_SecuritiesSettlementTransactionAuditTrailReportV02
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_semt_SecuritiesSettlementTransactionAuditTrailReportV02}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionAuditTrailReportV01> for_semt_SecuritiesSettlementTransactionAuditTrailReportV01 = new MMConstraint<SecuritiesSettlementTransactionAuditTrailReportV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_semt_SecuritiesSettlementTransactionAuditTrailReportV02);
			owner_lazy = () -> SecuritiesSettlementTransactionAuditTrailReportV01.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionAuditTrailReportV01 obj) throws Exception {
			check_semt_SecuritiesSettlementTransactionAuditTrailReportV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV04
	 * SecuritiesTransactionPendingReportV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_semt_SecuritiesTransactionPendingReportV05
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_semt_SecuritiesTransactionPendingReportV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionPendingReportV04> for_semt_SecuritiesTransactionPendingReportV04 = new MMConstraint<SecuritiesTransactionPendingReportV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_semt_SecuritiesTransactionPendingReportV05);
			owner_lazy = () -> SecuritiesTransactionPendingReportV04.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTransactionPendingReportV04 obj) throws Exception {
			check_semt_SecuritiesTransactionPendingReportV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV03
	 * IntraPositionMovementConfirmationV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionMovementConfirmationV03> for_semt_IntraPositionMovementConfirmationV03 = new MMConstraint<IntraPositionMovementConfirmationV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> IntraPositionMovementConfirmationV03.mmObject();
		}

		@Override
		public void executeValidator(IntraPositionMovementConfirmationV03 obj) throws Exception {
			check_semt_IntraPositionMovementConfirmationV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV05
	 * SecuritiesFinancingConfirmationV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_sese_SecuritiesFinancingConfirmationV04
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_sese_SecuritiesFinancingConfirmationV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingConfirmationV05> for_sese_SecuritiesFinancingConfirmationV05 = new MMConstraint<SecuritiesFinancingConfirmationV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_sese_SecuritiesFinancingConfirmationV04;
			owner_lazy = () -> SecuritiesFinancingConfirmationV05.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesFinancingConfirmationV05 obj) throws Exception {
			check_sese_SecuritiesFinancingConfirmationV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV03
	 * SecuritiesSettlementTransactionConfirmationV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmationV03> for_sese_SecuritiesSettlementTransactionConfirmationV03 = new MMConstraint<SecuritiesSettlementTransactionConfirmationV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesSettlementTransactionConfirmationV03.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionConfirmationV03 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionConfirmationV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV02
	 * SecuritiesSettlementTransactionConfirmationV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmationV02> for_sese_SecuritiesSettlementTransactionConfirmationV02 = new MMConstraint<SecuritiesSettlementTransactionConfirmationV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesSettlementTransactionConfirmationV02.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionConfirmationV02 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionConfirmationV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV04
	 * SecuritiesFinancingModificationInstructionV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_sese_SecuritiesFinancingModificationInstructionV03
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_sese_SecuritiesFinancingModificationInstructionV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingModificationInstructionV04> for_sese_SecuritiesFinancingModificationInstructionV04 = new MMConstraint<SecuritiesFinancingModificationInstructionV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_sese_SecuritiesFinancingModificationInstructionV03;
			owner_lazy = () -> SecuritiesFinancingModificationInstructionV04.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesFinancingModificationInstructionV04 obj) throws Exception {
			check_sese_SecuritiesFinancingModificationInstructionV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV05
	 * CorporateActionCancellationAdviceV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_seev_CorporateActionCancellationAdviceV04
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_seev_CorporateActionCancellationAdviceV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionCancellationAdviceV05> for_seev_CorporateActionCancellationAdviceV05 = new MMConstraint<CorporateActionCancellationAdviceV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_seev_CorporateActionCancellationAdviceV04;
			owner_lazy = () -> CorporateActionCancellationAdviceV05.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionCancellationAdviceV05 obj) throws Exception {
			check_seev_CorporateActionCancellationAdviceV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatementReportV03
	 * CorporateActionInstructionStatementReportV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionStatementReportV03> for_seev_CorporateActionInstructionStatementReportV03 = new MMConstraint<CorporateActionInstructionStatementReportV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionInstructionStatementReportV03.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionStatementReportV03 obj) throws Exception {
			check_seev_CorporateActionInstructionStatementReportV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV04
	 * CorporateActionMovementPreliminaryAdviceV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_seev_CorporateActionMovementPreliminaryAdviceV05
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_seev_CorporateActionMovementPreliminaryAdviceV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementPreliminaryAdviceV04> for_seev_CorporateActionMovementPreliminaryAdviceV04 = new MMConstraint<CorporateActionMovementPreliminaryAdviceV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_seev_CorporateActionMovementPreliminaryAdviceV05);
			owner_lazy = () -> CorporateActionMovementPreliminaryAdviceV04.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementPreliminaryAdviceV04 obj) throws Exception {
			check_seev_CorporateActionMovementPreliminaryAdviceV04(obj);
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionStatusAdviceV01> for_sese_SecuritiesSettlementTransactionStatusAdviceV01 = new MMConstraint<SecuritiesSettlementTransactionStatusAdviceV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
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
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV03
	 * SecuritiesSettlementTransactionGenerationNotificationV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionGenerationNotificationV03> for_sese_SecuritiesSettlementTransactionGenerationNotificationV03 = new MMConstraint<SecuritiesSettlementTransactionGenerationNotificationV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesSettlementTransactionGenerationNotificationV03.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionGenerationNotificationV03 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionGenerationNotificationV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReportV04
	 * SecuritiesSettlementTransactionAllegementReportV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_semt_SecuritiesSettlementTransactionAllegementReportV03
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_semt_SecuritiesSettlementTransactionAllegementReportV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionAllegementReportV04> for_semt_SecuritiesSettlementTransactionAllegementReportV04 = new MMConstraint<SecuritiesSettlementTransactionAllegementReportV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_semt_SecuritiesSettlementTransactionAllegementReportV03;
			owner_lazy = () -> SecuritiesSettlementTransactionAllegementReportV04.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionAllegementReportV04 obj) throws Exception {
			check_semt_SecuritiesSettlementTransactionAllegementReportV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV04
	 * SecuritiesSettlementConditionModificationStatusAdviceV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetXRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_sese_SecuritiesSettlementConditionModificationStatusAdviceV05
	 * ConstraintCoexistenceCharacterSetXRule.
	 * for_sese_SecuritiesSettlementConditionModificationStatusAdviceV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementConditionModificationStatusAdviceV04> for_sese_SecuritiesSettlementConditionModificationStatusAdviceV04 = new MMConstraint<SecuritiesSettlementConditionModificationStatusAdviceV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_sese_SecuritiesSettlementConditionModificationStatusAdviceV05);
			owner_lazy = () -> SecuritiesSettlementConditionModificationStatusAdviceV04.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementConditionModificationStatusAdviceV04 obj) throws Exception {
			check_sese_SecuritiesSettlementConditionModificationStatusAdviceV04(obj);
		}
	};

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_seev_CorporateActionEventProcessingStatusAdviceV03(CorporateActionEventProcessingStatusAdviceV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_semt_SecuritiesSettlementTransactionAllegementReportV01(SecuritiesSettlementTransactionAllegementReportV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all fields must
	 * correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { }
	 * CR LF.
	 */
	public static void check_seev_CorporateActionMovementPreliminaryAdviceCancellationAdviceV02(CorporateActionMovementPreliminaryAdviceCancellationAdviceV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesStatusOrStatementQueryStatusAdviceV02(SecuritiesStatusOrStatementQueryStatusAdviceV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_seev_CorporateActionInstructionV05(CorporateActionInstructionV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesTransactionCancellationRequestV02(SecuritiesTransactionCancellationRequestV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesFinancingStatusAdviceV02(SecuritiesFinancingStatusAdviceV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_semt_SecuritiesBalanceAccountingReportV03(SecuritiesBalanceAccountingReportV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_semt_SecuritiesBalanceCustodyReportV06(SecuritiesBalanceCustodyReportV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesSettlementTransactionStatusAdviceV02(SecuritiesSettlementTransactionStatusAdviceV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_semt_SecuritiesStatementQueryV03(SecuritiesStatementQueryV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * (except for
	 * CorporateActionDetails/CorporateActionAdditionalInformation/URLAddress)
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_seev_CorporateActionNotificationV03(CorporateActionNotificationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesTransactionCancellationRequestV04(SecuritiesTransactionCancellationRequestV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesFinancingConfirmationV04(SecuritiesFinancingConfirmationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_semt_SecuritiesMessageCancellationAdviceV04(SecuritiesMessageCancellationAdviceV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesFinancingStatusAdviceV03(SecuritiesFinancingStatusAdviceV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_semt_SecuritiesBalanceCustodyReportV04(SecuritiesBalanceCustodyReportV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_seev_CorporateActionCancellationAdviceV03(CorporateActionCancellationAdviceV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_seev_CorporateActionMovementConfirmationV03(CorporateActionMovementConfirmationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesFinancingModificationInstructionV02(SecuritiesFinancingModificationInstructionV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_seev_CorporateActionEventProcessingStatusAdviceV02(CorporateActionEventProcessingStatusAdviceV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesFinancingStatusAdviceV05(SecuritiesFinancingStatusAdviceV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesSettlementConditionModificationStatusAdviceV03(SecuritiesSettlementConditionModificationStatusAdviceV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_semt_SecuritiesBalanceCustodyReportV05(SecuritiesBalanceCustodyReportV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all fields must
	 * correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { }
	 * CR LF.
	 */
	public static void check_seev_CorporateActionMovementPreliminaryAdviceCancellationAdviceV05(CorporateActionMovementPreliminaryAdviceCancellationAdviceV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_seev_CorporateActionInstructionCancellationRequestStatusAdviceV04(CorporateActionInstructionCancellationRequestStatusAdviceV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesFinancingConfirmationV03(SecuritiesFinancingConfirmationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_semt_SecuritiesStatementQueryV04(SecuritiesStatementQueryV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * (except AdditionalInformation/AdditionalInformation) must correspond to
	 * ISO 15022 character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR
	 * LF.
	 */
	public static void check_seev_CorporateActionNarrativeV01(CorporateActionNarrativeV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_seev_CorporateActionEventProcessingStatusAdviceV01(CorporateActionEventProcessingStatusAdviceV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_semt_SecuritiesBalanceCustodyReportV03(SecuritiesBalanceCustodyReportV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesTransactionCancellationRequestStatusAdviceV03(SecuritiesTransactionCancellationRequestStatusAdviceV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_seev_CorporateActionCancellationAdviceV02(CorporateActionCancellationAdviceV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_seev_CorporateActionInstructionCancellationRequestV04(CorporateActionInstructionCancellationRequestV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_semt_SecuritiesTransactionPendingReportV06(SecuritiesTransactionPendingReportV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesTransactionCancellationRequestStatusAdviceV04(SecuritiesTransactionCancellationRequestStatusAdviceV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_PortfolioTransferNotificationV03(PortfolioTransferNotificationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesSettlementAllegementRemovalAdviceV01(SecuritiesSettlementAllegementRemovalAdviceV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_semt_IntraPositionMovementPostingReportV03(IntraPositionMovementPostingReportV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_seev_CorporateActionMovementConfirmationV05(CorporateActionMovementConfirmationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_seev_CorporateActionMovementReversalAdviceV05(CorporateActionMovementReversalAdviceV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_seev_CorporateActionMovementConfirmationV06(CorporateActionMovementConfirmationV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_seev_CorporateActionMovementConfirmationV02(CorporateActionMovementConfirmationV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_seev_CorporateActionMovementPreliminaryAdviceV05(CorporateActionMovementPreliminaryAdviceV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_semt_IntraPositionMovementConfirmationV02(IntraPositionMovementConfirmationV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_seev_CorporateActionInstructionCancellationRequestV02(CorporateActionInstructionCancellationRequestV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesSettlementTransactionConfirmationV04(SecuritiesSettlementTransactionConfirmationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_semt_IntraPositionMovementConfirmationV01(IntraPositionMovementConfirmationV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesStatusOrStatementQueryStatusAdviceV01(SecuritiesStatusOrStatementQueryStatusAdviceV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesSettlementTransactionGenerationNotificationV02(SecuritiesSettlementTransactionGenerationNotificationV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_semt_SecuritiesSettlementTransactionAuditTrailReportV02(SecuritiesSettlementTransactionAuditTrailReportV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesTransactionCancellationRequestV03(SecuritiesTransactionCancellationRequestV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesFinancingInstructionV04(SecuritiesFinancingInstructionV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesTransactionStatusQueryV03(SecuritiesTransactionStatusQueryV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_semt_SecuritiesBalanceAccountingReportV08(SecuritiesBalanceAccountingReportV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_semt_SecuritiesTransactionPendingReportV03(SecuritiesTransactionPendingReportV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesSettlementTransactionReversalAdviceV01(SecuritiesSettlementTransactionReversalAdviceV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_semt_IntraPositionMovementInstructionV01(IntraPositionMovementInstructionV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * (except AdditionalInformation/AdditionalInformation) must correspond to
	 * ISO 15022 character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR
	 * LF.
	 */
	public static void check_seev_CorporateActionNarrativeV03(CorporateActionNarrativeV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesStatusOrStatementQueryStatusAdviceV03(SecuritiesStatusOrStatementQueryStatusAdviceV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesSettlementTransactionReversalAdviceV04(SecuritiesSettlementTransactionReversalAdviceV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_seev_CorporateActionInstructionStatusAdviceV03(CorporateActionInstructionStatusAdviceV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_semt_SecuritiesTransactionPostingReportV04(SecuritiesTransactionPostingReportV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_seev_CorporateActionInstructionStatusAdviceV06(CorporateActionInstructionStatusAdviceV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_seev_CorporateActionMovementPreliminaryAdviceV02(CorporateActionMovementPreliminaryAdviceV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesSettlementConditionModificationStatusAdviceV01(SecuritiesSettlementConditionModificationStatusAdviceV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_semt_IntraPositionMovementInstructionV03(IntraPositionMovementInstructionV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesSettlementTransactionReversalAdviceV02(SecuritiesSettlementTransactionReversalAdviceV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesTransactionCancellationRequestStatusAdviceV01(SecuritiesTransactionCancellationRequestStatusAdviceV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesSettlementTransactionInstructionV03(SecuritiesSettlementTransactionInstructionV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_seev_CorporateActionInstructionStatementReportV01(CorporateActionInstructionStatementReportV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_seev_CorporateActionMovementReversalAdviceV01(CorporateActionMovementReversalAdviceV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_seev_CorporateActionInstructionCancellationRequestV03(CorporateActionInstructionCancellationRequestV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesFinancingInstructionV05(SecuritiesFinancingInstructionV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_semt_SecuritiesBalanceCustodyReportV07(SecuritiesBalanceCustodyReportV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesSettlementTransactionAllegementNotificationV04(SecuritiesSettlementTransactionAllegementNotificationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesTransactionStatusQueryV02(SecuritiesTransactionStatusQueryV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_seev_CorporateActionMovementPreliminaryAdviceV06(CorporateActionMovementPreliminaryAdviceV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_seev_CorporateActionEventProcessingStatusAdviceV04(CorporateActionEventProcessingStatusAdviceV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesSettlementTransactionConfirmationV01(SecuritiesSettlementTransactionConfirmationV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesSettlementTransactionInstructionV05(SecuritiesSettlementTransactionInstructionV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_semt_SecuritiesTransactionPendingReportV05(SecuritiesTransactionPendingReportV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_semt_IntraPositionMovementStatusAdviceV03(IntraPositionMovementStatusAdviceV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_semt_SecuritiesTransactionPostingReportV03(SecuritiesTransactionPostingReportV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all fields must
	 * correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { }
	 * CR LF.
	 */
	public static void check_seev_CorporateActionMovementPreliminaryAdviceCancellationAdviceV04(CorporateActionMovementPreliminaryAdviceCancellationAdviceV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_seev_CorporateActionInstructionV03(CorporateActionInstructionV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_seev_CorporateActionInstructionCancellationRequestStatusAdviceV01(CorporateActionInstructionCancellationRequestStatusAdviceV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_seev_CorporateActionMovementPreliminaryAdviceV01(CorporateActionMovementPreliminaryAdviceV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_seev_CorporateActionMovementReversalAdviceV06(CorporateActionMovementReversalAdviceV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_seev_CorporateActionInstructionStatementReportV04(CorporateActionInstructionStatementReportV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_semt_SecuritiesBalanceCustodyReportV08(SecuritiesBalanceCustodyReportV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_semt_SecuritiesStatementQueryV02(SecuritiesStatementQueryV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesSettlementAllegementRemovalAdviceV03(SecuritiesSettlementAllegementRemovalAdviceV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_seev_CorporateActionInstructionV02(CorporateActionInstructionV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesSettlementConditionsModificationRequestV01(SecuritiesSettlementConditionsModificationRequestV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesSettlementTransactionGenerationNotificationV04(SecuritiesSettlementTransactionGenerationNotificationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_semt_SecuritiesStatementQueryV01(SecuritiesStatementQueryV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_semt_SecuritiesBalanceAccountingReportV05(SecuritiesBalanceAccountingReportV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesSettlementConditionsModificationRequestV02(SecuritiesSettlementConditionsModificationRequestV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesSettlementTransactionStatusAdviceV04(SecuritiesSettlementTransactionStatusAdviceV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesFinancingConfirmationV02(SecuritiesFinancingConfirmationV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesSettlementConditionModificationStatusAdviceV05(SecuritiesSettlementConditionModificationStatusAdviceV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_seev_CorporateActionCancellationAdviceV04(CorporateActionCancellationAdviceV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * (except AdditionalInformation/AdditionalInformation) must correspond to
	 * ISO 15022 character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR
	 * LF.
	 */
	public static void check_seev_CorporateActionNarrativeV02(CorporateActionNarrativeV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_semt_IntraPositionMovementStatusAdviceV02(IntraPositionMovementStatusAdviceV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_semt_IntraPositionMovementPostingReportV02(IntraPositionMovementPostingReportV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesFinancingInstructionV01(SecuritiesFinancingInstructionV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * (except for
	 * CorporateActionDetails/CorporateActionAdditionalInformation/URLAddress)
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_seev_CorporateActionNotificationV05(CorporateActionNotificationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesSettlementTransactionStatusAdviceV03(SecuritiesSettlementTransactionStatusAdviceV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesSettlementConditionsModificationRequestV03(SecuritiesSettlementConditionsModificationRequestV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_semt_SecuritiesTransactionPostingReportV01(SecuritiesTransactionPostingReportV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_seev_CorporateActionMovementReversalAdviceV02(CorporateActionMovementReversalAdviceV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesFinancingStatusAdviceV04(SecuritiesFinancingStatusAdviceV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_seev_CorporateActionInstructionV04(CorporateActionInstructionV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_seev_CorporateActionInstructionV01(CorporateActionInstructionV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_semt_SecuritiesBalanceAccountingReportV07(SecuritiesBalanceAccountingReportV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_semt_IntraPositionMovementPostingReportV01(IntraPositionMovementPostingReportV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesSettlementTransactionAllegementNotificationV03(SecuritiesSettlementTransactionAllegementNotificationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesSettlementTransactionReversalAdviceV03(SecuritiesSettlementTransactionReversalAdviceV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesSettlementTransactionGenerationNotificationV05(SecuritiesSettlementTransactionGenerationNotificationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * (except for
	 * CorporateActionDetails/CorporateActionAdditionalInformation/URLAddress)
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_seev_CorporateActionNotificationV04(CorporateActionNotificationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_semt_IntraPositionMovementInstructionV02(IntraPositionMovementInstructionV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesTransactionStatusQueryV01(SecuritiesTransactionStatusQueryV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesSettlementTransactionAllegementNotificationV01(SecuritiesSettlementTransactionAllegementNotificationV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_seev_CorporateActionMovementReversalAdviceV03(CorporateActionMovementReversalAdviceV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_semt_SecuritiesMessageCancellationAdviceV01(SecuritiesMessageCancellationAdviceV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_semt_SecuritiesBalanceAccountingReportV04(SecuritiesBalanceAccountingReportV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all fields must
	 * correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { }
	 * CR LF.
	 */
	public static void check_seev_CorporateActionMovementPreliminaryAdviceCancellationAdviceV01(CorporateActionMovementPreliminaryAdviceCancellationAdviceV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_seev_CorporateActionMovementReversalAdviceV04(CorporateActionMovementReversalAdviceV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesSettlementConditionsModificationRequestV05(SecuritiesSettlementConditionsModificationRequestV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesSettlementTransactionStatusAdviceV05(SecuritiesSettlementTransactionStatusAdviceV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesFinancingInstructionV03(SecuritiesFinancingInstructionV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * (except for
	 * CorporateActionDetails/CorporateActionAdditionalInformation/URLAddress)
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_seev_CorporateActionNotificationV02(CorporateActionNotificationV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_semt_SecuritiesTransactionPendingReportV02(SecuritiesTransactionPendingReportV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all fields must
	 * correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { }
	 * CR LF.
	 */
	public static void check_seev_CorporateActionMovementPreliminaryAdviceCancellationAdviceV03(CorporateActionMovementPreliminaryAdviceCancellationAdviceV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_semt_IntraPositionMovementPostingReportV04(IntraPositionMovementPostingReportV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_seev_CorporateActionMovementPreliminaryAdviceV03(CorporateActionMovementPreliminaryAdviceV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesSettlementTransactionStatusAdviceV06(SecuritiesSettlementTransactionStatusAdviceV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_seev_CorporateActionInstructionStatusAdviceV05(CorporateActionInstructionStatusAdviceV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesFinancingStatusAdviceV01(SecuritiesFinancingStatusAdviceV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_seev_CorporateActionCancellationAdviceV01(CorporateActionCancellationAdviceV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_seev_CorporateActionInstructionCancellationRequestV01(CorporateActionInstructionCancellationRequestV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesSettlementAllegementRemovalAdviceV02(SecuritiesSettlementAllegementRemovalAdviceV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_semt_SecuritiesBalanceAccountingReportV06(SecuritiesBalanceAccountingReportV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesTransactionCancellationRequestStatusAdviceV02(SecuritiesTransactionCancellationRequestStatusAdviceV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesSettlementConditionModificationStatusAdviceV06(SecuritiesSettlementConditionModificationStatusAdviceV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_PortfolioTransferNotificationV01(PortfolioTransferNotificationV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesFinancingModificationInstructionV01(SecuritiesFinancingModificationInstructionV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesFinancingModificationInstructionV03(SecuritiesFinancingModificationInstructionV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesSettlementTransactionInstructionV01(SecuritiesSettlementTransactionInstructionV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_seev_CorporateActionInstructionStatusAdviceV02(CorporateActionInstructionStatusAdviceV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_seev_CorporateActionInstructionStatementReportV02(CorporateActionInstructionStatementReportV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_seev_CorporateActionMovementConfirmationV01(CorporateActionMovementConfirmationV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_semt_SecuritiesTransactionPostingReportV05(SecuritiesTransactionPostingReportV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesFinancingConfirmationV01(SecuritiesFinancingConfirmationV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_seev_CorporateActionMovementConfirmationV04(CorporateActionMovementConfirmationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_semt_IntraPositionMovementStatusAdviceV01(IntraPositionMovementStatusAdviceV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_semt_SecuritiesStatementQueryV05(SecuritiesStatementQueryV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesSettlementTransactionInstructionV02(SecuritiesSettlementTransactionInstructionV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_seev_CorporateActionInstructionStatusAdviceV01(CorporateActionInstructionStatusAdviceV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_semt_SecuritiesTransactionPostingReportV02(SecuritiesTransactionPostingReportV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_seev_CorporateActionInstructionCancellationRequestV05(CorporateActionInstructionCancellationRequestV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_seev_CorporateActionInstructionStatusAdviceV04(CorporateActionInstructionStatusAdviceV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesSettlementTransactionAllegementNotificationV02(SecuritiesSettlementTransactionAllegementNotificationV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * (except for
	 * CorporateActionDetails/CorporateActionAdditionalInformation/URLAddress)
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_seev_CorporateActionNotificationV01(CorporateActionNotificationV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_semt_IntraPositionMovementConfirmationV04(IntraPositionMovementConfirmationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesSettlementTransactionGenerationNotificationV01(SecuritiesSettlementTransactionGenerationNotificationV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_semt_SecuritiesMessageCancellationAdviceV03(SecuritiesMessageCancellationAdviceV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesFinancingInstructionV02(SecuritiesFinancingInstructionV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_semt_SecuritiesMessageCancellationAdviceV02(SecuritiesMessageCancellationAdviceV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_semt_SecuritiesTransactionPendingReportV01(SecuritiesTransactionPendingReportV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_seev_CorporateActionInstructionCancellationRequestStatusAdviceV02(CorporateActionInstructionCancellationRequestStatusAdviceV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesSettlementTransactionConfirmationV05(SecuritiesSettlementTransactionConfirmationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_semt_SecuritiesSettlementTransactionAllegementReportV02(SecuritiesSettlementTransactionAllegementReportV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesSettlementConditionModificationStatusAdviceV02(SecuritiesSettlementConditionModificationStatusAdviceV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_semt_SecuritiesSettlementTransactionAllegementReportV03(SecuritiesSettlementTransactionAllegementReportV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_PortfolioTransferNotificationV02(PortfolioTransferNotificationV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_seev_CorporateActionInstructionCancellationRequestStatusAdviceV03(CorporateActionInstructionCancellationRequestStatusAdviceV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_seev_CorporateActionInstructionCancellationRequestStatusAdviceV05(CorporateActionInstructionCancellationRequestStatusAdviceV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesSettlementTransactionInstructionV04(SecuritiesSettlementTransactionInstructionV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesTransactionCancellationRequestV01(SecuritiesTransactionCancellationRequestV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesSettlementConditionsModificationRequestV04(SecuritiesSettlementConditionsModificationRequestV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_semt_SecuritiesSettlementTransactionAuditTrailReportV01(SecuritiesSettlementTransactionAuditTrailReportV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_semt_SecuritiesTransactionPendingReportV04(SecuritiesTransactionPendingReportV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_semt_IntraPositionMovementConfirmationV03(IntraPositionMovementConfirmationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesFinancingConfirmationV05(SecuritiesFinancingConfirmationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesSettlementTransactionConfirmationV03(SecuritiesSettlementTransactionConfirmationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesSettlementTransactionConfirmationV02(SecuritiesSettlementTransactionConfirmationV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesFinancingModificationInstructionV04(SecuritiesFinancingModificationInstructionV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_seev_CorporateActionCancellationAdviceV05(CorporateActionCancellationAdviceV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_seev_CorporateActionInstructionStatementReportV03(CorporateActionInstructionStatementReportV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_seev_CorporateActionMovementPreliminaryAdviceV04(CorporateActionMovementPreliminaryAdviceV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesSettlementTransactionStatusAdviceV01(SecuritiesSettlementTransactionStatusAdviceV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesSettlementTransactionGenerationNotificationV03(SecuritiesSettlementTransactionGenerationNotificationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_semt_SecuritiesSettlementTransactionAllegementReportV04(SecuritiesSettlementTransactionAllegementReportV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void check_sese_SecuritiesSettlementConditionModificationStatusAdviceV04(SecuritiesSettlementConditionModificationStatusAdviceV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}