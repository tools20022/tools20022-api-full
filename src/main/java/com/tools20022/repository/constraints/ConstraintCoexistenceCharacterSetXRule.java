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
 * During ISO 15022 – 20022 coexistence, characters used in all text fields
 * (except AdditionalInformation/AdditionalInformation) must correspond to ISO
 * 15022 character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.
 */
public class ConstraintCoexistenceCharacterSetXRule {

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
	public static final MMConstraint<CorporateActionNarrativeV03> forCorporateActionNarrativeV03 = new MMConstraint<CorporateActionNarrativeV03>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkCorporateActionNarrativeV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields (except AdditionalInformation/AdditionalInformation) must correspond to ISO 15022 character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionNarrativeV03.mmObject();
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
	public static final MMConstraint<SecuritiesMessageCancellationAdviceV04> forSecuritiesMessageCancellationAdviceV04 = new MMConstraint<SecuritiesMessageCancellationAdviceV04>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesMessageCancellationAdviceV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesMessageCancellationAdviceV04.mmObject();
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
	public static final MMConstraint<IntraPositionMovementInstructionV03> forIntraPositionMovementInstructionV03 = new MMConstraint<IntraPositionMovementInstructionV03>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkIntraPositionMovementInstructionV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> IntraPositionMovementInstructionV03.mmObject();
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forSecuritiesBalanceCustodyReportV07
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forSecuritiesBalanceCustodyReportV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceCustodyReportV08> forSecuritiesBalanceCustodyReportV08 = new MMConstraint<SecuritiesBalanceCustodyReportV08>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesBalanceCustodyReportV08;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forSecuritiesBalanceCustodyReportV07;
			owner_lazy = () -> SecuritiesBalanceCustodyReportV08.mmObject();
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forSecuritiesStatementQueryV04
	 * ConstraintCoexistenceCharacterSetXRule.forSecuritiesStatementQueryV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesStatementQueryV05> forSecuritiesStatementQueryV05 = new MMConstraint<SecuritiesStatementQueryV05>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesStatementQueryV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forSecuritiesStatementQueryV04;
			owner_lazy = () -> SecuritiesStatementQueryV05.mmObject();
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forSecuritiesBalanceAccountingReportV07
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forSecuritiesBalanceAccountingReportV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceAccountingReportV08> forSecuritiesBalanceAccountingReportV08 = new MMConstraint<SecuritiesBalanceAccountingReportV08>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesBalanceAccountingReportV08;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forSecuritiesBalanceAccountingReportV07;
			owner_lazy = () -> SecuritiesBalanceAccountingReportV08.mmObject();
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forSecuritiesSettlementTransactionAuditTrailReportV01
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forSecuritiesSettlementTransactionAuditTrailReportV01}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionAuditTrailReportV02> forSecuritiesSettlementTransactionAuditTrailReportV02 = new MMConstraint<SecuritiesSettlementTransactionAuditTrailReportV02>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesSettlementTransactionAuditTrailReportV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forSecuritiesSettlementTransactionAuditTrailReportV01;
			owner_lazy = () -> SecuritiesSettlementTransactionAuditTrailReportV02.mmObject();
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
	public static final MMConstraint<SecuritiesSettlementAllegementRemovalAdviceV03> forSecuritiesSettlementAllegementRemovalAdviceV03 = new MMConstraint<SecuritiesSettlementAllegementRemovalAdviceV03>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesSettlementAllegementRemovalAdviceV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesSettlementAllegementRemovalAdviceV03.mmObject();
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
	public static final MMConstraint<SecuritiesStatusOrStatementQueryStatusAdviceV03> forSecuritiesStatusOrStatementQueryStatusAdviceV03 = new MMConstraint<SecuritiesStatusOrStatementQueryStatusAdviceV03>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesStatusOrStatementQueryStatusAdviceV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesStatusOrStatementQueryStatusAdviceV03.mmObject();
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
	public static final MMConstraint<SecuritiesTransactionStatusQueryV03> forSecuritiesTransactionStatusQueryV03 = new MMConstraint<SecuritiesTransactionStatusQueryV03>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesTransactionStatusQueryV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesTransactionStatusQueryV03.mmObject();
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forSecuritiesTransactionCancellationRequestV03
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forSecuritiesTransactionCancellationRequestV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionCancellationRequestV04> forSecuritiesTransactionCancellationRequestV04 = new MMConstraint<SecuritiesTransactionCancellationRequestV04>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesTransactionCancellationRequestV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forSecuritiesTransactionCancellationRequestV03;
			owner_lazy = () -> SecuritiesTransactionCancellationRequestV04.mmObject();
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forSecuritiesTransactionCancellationRequestStatusAdviceV03
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forSecuritiesTransactionCancellationRequestStatusAdviceV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionCancellationRequestStatusAdviceV04> forSecuritiesTransactionCancellationRequestStatusAdviceV04 = new MMConstraint<SecuritiesTransactionCancellationRequestStatusAdviceV04>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesTransactionCancellationRequestStatusAdviceV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forSecuritiesTransactionCancellationRequestStatusAdviceV03;
			owner_lazy = () -> SecuritiesTransactionCancellationRequestStatusAdviceV04.mmObject();
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forSecuritiesSettlementConditionModificationStatusAdviceV05
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forSecuritiesSettlementConditionModificationStatusAdviceV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementConditionModificationStatusAdviceV06> forSecuritiesSettlementConditionModificationStatusAdviceV06 = new MMConstraint<SecuritiesSettlementConditionModificationStatusAdviceV06>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesSettlementConditionModificationStatusAdviceV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forSecuritiesSettlementConditionModificationStatusAdviceV05;
			owner_lazy = () -> SecuritiesSettlementConditionModificationStatusAdviceV06.mmObject();
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forSecuritiesSettlementTransactionAuditTrailReportV02
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forSecuritiesSettlementTransactionAuditTrailReportV02}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionAuditTrailReportV01> forSecuritiesSettlementTransactionAuditTrailReportV01 = new MMConstraint<SecuritiesSettlementTransactionAuditTrailReportV01>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesSettlementTransactionAuditTrailReportV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forSecuritiesSettlementTransactionAuditTrailReportV02);
			owner_lazy = () -> SecuritiesSettlementTransactionAuditTrailReportV01.mmObject();
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
	public static final MMConstraint<IntraPositionMovementConfirmationV01> forIntraPositionMovementConfirmationV01 = new MMConstraint<IntraPositionMovementConfirmationV01>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkIntraPositionMovementConfirmationV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> IntraPositionMovementConfirmationV01.mmObject();
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
	public static final MMConstraint<IntraPositionMovementConfirmationV02> forIntraPositionMovementConfirmationV02 = new MMConstraint<IntraPositionMovementConfirmationV02>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkIntraPositionMovementConfirmationV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> IntraPositionMovementConfirmationV02.mmObject();
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
	public static final MMConstraint<IntraPositionMovementConfirmationV03> forIntraPositionMovementConfirmationV03 = new MMConstraint<IntraPositionMovementConfirmationV03>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkIntraPositionMovementConfirmationV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> IntraPositionMovementConfirmationV03.mmObject();
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
	public static final MMConstraint<IntraPositionMovementConfirmationV04> forIntraPositionMovementConfirmationV04 = new MMConstraint<IntraPositionMovementConfirmationV04>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkIntraPositionMovementConfirmationV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> IntraPositionMovementConfirmationV04.mmObject();
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
	public static final MMConstraint<IntraPositionMovementPostingReportV01> forIntraPositionMovementPostingReportV01 = new MMConstraint<IntraPositionMovementPostingReportV01>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkIntraPositionMovementPostingReportV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> IntraPositionMovementPostingReportV01.mmObject();
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
	public static final MMConstraint<IntraPositionMovementPostingReportV02> forIntraPositionMovementPostingReportV02 = new MMConstraint<IntraPositionMovementPostingReportV02>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkIntraPositionMovementPostingReportV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> IntraPositionMovementPostingReportV02.mmObject();
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
	public static final MMConstraint<IntraPositionMovementPostingReportV03> forIntraPositionMovementPostingReportV03 = new MMConstraint<IntraPositionMovementPostingReportV03>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkIntraPositionMovementPostingReportV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> IntraPositionMovementPostingReportV03.mmObject();
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
	public static final MMConstraint<IntraPositionMovementPostingReportV04> forIntraPositionMovementPostingReportV04 = new MMConstraint<IntraPositionMovementPostingReportV04>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkIntraPositionMovementPostingReportV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> IntraPositionMovementPostingReportV04.mmObject();
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
	public static final MMConstraint<SecuritiesBalanceAccountingReportV03> forSecuritiesBalanceAccountingReportV03 = new MMConstraint<SecuritiesBalanceAccountingReportV03>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesBalanceAccountingReportV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesBalanceAccountingReportV03.mmObject();
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
	public static final MMConstraint<SecuritiesBalanceAccountingReportV04> forSecuritiesBalanceAccountingReportV04 = new MMConstraint<SecuritiesBalanceAccountingReportV04>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesBalanceAccountingReportV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesBalanceAccountingReportV04.mmObject();
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
	public static final MMConstraint<SecuritiesBalanceAccountingReportV05> forSecuritiesBalanceAccountingReportV05 = new MMConstraint<SecuritiesBalanceAccountingReportV05>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesBalanceAccountingReportV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesBalanceAccountingReportV05.mmObject();
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forSecuritiesBalanceAccountingReportV07
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forSecuritiesBalanceAccountingReportV07}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceAccountingReportV06> forSecuritiesBalanceAccountingReportV06 = new MMConstraint<SecuritiesBalanceAccountingReportV06>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesBalanceAccountingReportV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forSecuritiesBalanceAccountingReportV07);
			owner_lazy = () -> SecuritiesBalanceAccountingReportV06.mmObject();
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
	public static final MMConstraint<SecuritiesBalanceCustodyReportV03> forSecuritiesBalanceCustodyReportV03 = new MMConstraint<SecuritiesBalanceCustodyReportV03>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesBalanceCustodyReportV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesBalanceCustodyReportV03.mmObject();
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
	public static final MMConstraint<SecuritiesBalanceCustodyReportV04> forSecuritiesBalanceCustodyReportV04 = new MMConstraint<SecuritiesBalanceCustodyReportV04>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesBalanceCustodyReportV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesBalanceCustodyReportV04.mmObject();
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
	public static final MMConstraint<SecuritiesBalanceCustodyReportV05> forSecuritiesBalanceCustodyReportV05 = new MMConstraint<SecuritiesBalanceCustodyReportV05>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesBalanceCustodyReportV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesBalanceCustodyReportV05.mmObject();
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forSecuritiesBalanceCustodyReportV07
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forSecuritiesBalanceCustodyReportV07}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceCustodyReportV06> forSecuritiesBalanceCustodyReportV06 = new MMConstraint<SecuritiesBalanceCustodyReportV06>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesBalanceCustodyReportV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forSecuritiesBalanceCustodyReportV07);
			owner_lazy = () -> SecuritiesBalanceCustodyReportV06.mmObject();
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
	public static final MMConstraint<SecuritiesMessageCancellationAdviceV01> forSecuritiesMessageCancellationAdviceV01 = new MMConstraint<SecuritiesMessageCancellationAdviceV01>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesMessageCancellationAdviceV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesMessageCancellationAdviceV01.mmObject();
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
	public static final MMConstraint<SecuritiesMessageCancellationAdviceV02> forSecuritiesMessageCancellationAdviceV02 = new MMConstraint<SecuritiesMessageCancellationAdviceV02>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesMessageCancellationAdviceV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesMessageCancellationAdviceV02.mmObject();
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
	public static final MMConstraint<SecuritiesMessageCancellationAdviceV03> forSecuritiesMessageCancellationAdviceV03 = new MMConstraint<SecuritiesMessageCancellationAdviceV03>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesMessageCancellationAdviceV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesMessageCancellationAdviceV03.mmObject();
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
	public static final MMConstraint<SecuritiesTransactionPendingReportV01> forSecuritiesTransactionPendingReportV01 = new MMConstraint<SecuritiesTransactionPendingReportV01>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesTransactionPendingReportV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesTransactionPendingReportV01.mmObject();
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
	public static final MMConstraint<SecuritiesTransactionPendingReportV02> forSecuritiesTransactionPendingReportV02 = new MMConstraint<SecuritiesTransactionPendingReportV02>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesTransactionPendingReportV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesTransactionPendingReportV02.mmObject();
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
	public static final MMConstraint<SecuritiesTransactionPendingReportV03> forSecuritiesTransactionPendingReportV03 = new MMConstraint<SecuritiesTransactionPendingReportV03>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesTransactionPendingReportV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesTransactionPendingReportV03.mmObject();
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forSecuritiesTransactionPendingReportV05
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forSecuritiesTransactionPendingReportV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionPendingReportV04> forSecuritiesTransactionPendingReportV04 = new MMConstraint<SecuritiesTransactionPendingReportV04>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesTransactionPendingReportV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forSecuritiesTransactionPendingReportV05);
			owner_lazy = () -> SecuritiesTransactionPendingReportV04.mmObject();
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
	public static final MMConstraint<SecuritiesTransactionPostingReportV01> forSecuritiesTransactionPostingReportV01 = new MMConstraint<SecuritiesTransactionPostingReportV01>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesTransactionPostingReportV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesTransactionPostingReportV01.mmObject();
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
	public static final MMConstraint<SecuritiesTransactionPostingReportV02> forSecuritiesTransactionPostingReportV02 = new MMConstraint<SecuritiesTransactionPostingReportV02>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesTransactionPostingReportV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesTransactionPostingReportV02.mmObject();
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
	public static final MMConstraint<SecuritiesTransactionPostingReportV03> forSecuritiesTransactionPostingReportV03 = new MMConstraint<SecuritiesTransactionPostingReportV03>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesTransactionPostingReportV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesTransactionPostingReportV03.mmObject();
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forSecuritiesTransactionPostingReportV05
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forSecuritiesTransactionPostingReportV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionPostingReportV04> forSecuritiesTransactionPostingReportV04 = new MMConstraint<SecuritiesTransactionPostingReportV04>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesTransactionPostingReportV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forSecuritiesTransactionPostingReportV05);
			owner_lazy = () -> SecuritiesTransactionPostingReportV04.mmObject();
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
	public static final MMConstraint<IntraPositionMovementInstructionV01> forIntraPositionMovementInstructionV01 = new MMConstraint<IntraPositionMovementInstructionV01>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkIntraPositionMovementInstructionV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> IntraPositionMovementInstructionV01.mmObject();
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
	public static final MMConstraint<IntraPositionMovementInstructionV02> forIntraPositionMovementInstructionV02 = new MMConstraint<IntraPositionMovementInstructionV02>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkIntraPositionMovementInstructionV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> IntraPositionMovementInstructionV02.mmObject();
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
	public static final MMConstraint<IntraPositionMovementStatusAdviceV01> forIntraPositionMovementStatusAdviceV01 = new MMConstraint<IntraPositionMovementStatusAdviceV01>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkIntraPositionMovementStatusAdviceV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> IntraPositionMovementStatusAdviceV01.mmObject();
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
	public static final MMConstraint<IntraPositionMovementStatusAdviceV02> forIntraPositionMovementStatusAdviceV02 = new MMConstraint<IntraPositionMovementStatusAdviceV02>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkIntraPositionMovementStatusAdviceV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> IntraPositionMovementStatusAdviceV02.mmObject();
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
	public static final MMConstraint<SecuritiesSettlementTransactionAllegementReportV01> forSecuritiesSettlementTransactionAllegementReportV01 = new MMConstraint<SecuritiesSettlementTransactionAllegementReportV01>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesSettlementTransactionAllegementReportV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesSettlementTransactionAllegementReportV01.mmObject();
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
	public static final MMConstraint<SecuritiesSettlementTransactionAllegementReportV02> forSecuritiesSettlementTransactionAllegementReportV02 = new MMConstraint<SecuritiesSettlementTransactionAllegementReportV02>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesSettlementTransactionAllegementReportV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesSettlementTransactionAllegementReportV02.mmObject();
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
	public static final MMConstraint<SecuritiesStatementQueryV01> forSecuritiesStatementQueryV01 = new MMConstraint<SecuritiesStatementQueryV01>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesStatementQueryV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesStatementQueryV01.mmObject();
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
	public static final MMConstraint<SecuritiesStatementQueryV02> forSecuritiesStatementQueryV02 = new MMConstraint<SecuritiesStatementQueryV02>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesStatementQueryV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesStatementQueryV02.mmObject();
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forSecuritiesSettlementTransactionAllegementReportV04
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forSecuritiesSettlementTransactionAllegementReportV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionAllegementReportV03> forSecuritiesSettlementTransactionAllegementReportV03 = new MMConstraint<SecuritiesSettlementTransactionAllegementReportV03>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesSettlementTransactionAllegementReportV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forSecuritiesSettlementTransactionAllegementReportV04);
			owner_lazy = () -> SecuritiesSettlementTransactionAllegementReportV03.mmObject();
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forSecuritiesStatementQueryV04
	 * ConstraintCoexistenceCharacterSetXRule.forSecuritiesStatementQueryV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesStatementQueryV03> forSecuritiesStatementQueryV03 = new MMConstraint<SecuritiesStatementQueryV03>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesStatementQueryV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forSecuritiesStatementQueryV04);
			owner_lazy = () -> SecuritiesStatementQueryV03.mmObject();
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
	public static final MMConstraint<IntraPositionMovementStatusAdviceV03> forIntraPositionMovementStatusAdviceV03 = new MMConstraint<IntraPositionMovementStatusAdviceV03>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkIntraPositionMovementStatusAdviceV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> IntraPositionMovementStatusAdviceV03.mmObject();
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forSecuritiesTransactionPendingReportV06
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forSecuritiesTransactionPendingReportV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forSecuritiesTransactionPendingReportV04
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forSecuritiesTransactionPendingReportV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionPendingReportV05> forSecuritiesTransactionPendingReportV05 = new MMConstraint<SecuritiesTransactionPendingReportV05>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesTransactionPendingReportV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forSecuritiesTransactionPendingReportV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forSecuritiesTransactionPendingReportV04;
			owner_lazy = () -> SecuritiesTransactionPendingReportV05.mmObject();
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forSecuritiesTransactionPostingReportV04
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forSecuritiesTransactionPostingReportV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionPostingReportV05> forSecuritiesTransactionPostingReportV05 = new MMConstraint<SecuritiesTransactionPostingReportV05>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesTransactionPostingReportV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forSecuritiesTransactionPostingReportV04;
			owner_lazy = () -> SecuritiesTransactionPostingReportV05.mmObject();
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forSecuritiesBalanceCustodyReportV08
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forSecuritiesBalanceCustodyReportV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forSecuritiesBalanceCustodyReportV06
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forSecuritiesBalanceCustodyReportV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceCustodyReportV07> forSecuritiesBalanceCustodyReportV07 = new MMConstraint<SecuritiesBalanceCustodyReportV07>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesBalanceCustodyReportV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forSecuritiesBalanceCustodyReportV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forSecuritiesBalanceCustodyReportV06;
			owner_lazy = () -> SecuritiesBalanceCustodyReportV07.mmObject();
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forSecuritiesBalanceAccountingReportV08
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forSecuritiesBalanceAccountingReportV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forSecuritiesBalanceAccountingReportV06
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forSecuritiesBalanceAccountingReportV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceAccountingReportV07> forSecuritiesBalanceAccountingReportV07 = new MMConstraint<SecuritiesBalanceAccountingReportV07>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesBalanceAccountingReportV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forSecuritiesBalanceAccountingReportV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forSecuritiesBalanceAccountingReportV06;
			owner_lazy = () -> SecuritiesBalanceAccountingReportV07.mmObject();
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forSecuritiesSettlementTransactionAllegementReportV03
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forSecuritiesSettlementTransactionAllegementReportV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionAllegementReportV04> forSecuritiesSettlementTransactionAllegementReportV04 = new MMConstraint<SecuritiesSettlementTransactionAllegementReportV04>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesSettlementTransactionAllegementReportV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forSecuritiesSettlementTransactionAllegementReportV03;
			owner_lazy = () -> SecuritiesSettlementTransactionAllegementReportV04.mmObject();
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forSecuritiesStatementQueryV05
	 * ConstraintCoexistenceCharacterSetXRule.forSecuritiesStatementQueryV05}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forSecuritiesStatementQueryV03
	 * ConstraintCoexistenceCharacterSetXRule.forSecuritiesStatementQueryV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesStatementQueryV04> forSecuritiesStatementQueryV04 = new MMConstraint<SecuritiesStatementQueryV04>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesStatementQueryV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forSecuritiesStatementQueryV05);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forSecuritiesStatementQueryV03;
			owner_lazy = () -> SecuritiesStatementQueryV04.mmObject();
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forSecuritiesTransactionPendingReportV05
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forSecuritiesTransactionPendingReportV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionPendingReportV06> forSecuritiesTransactionPendingReportV06 = new MMConstraint<SecuritiesTransactionPendingReportV06>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesTransactionPendingReportV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forSecuritiesTransactionPendingReportV05;
			owner_lazy = () -> SecuritiesTransactionPendingReportV06.mmObject();
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
	public static final MMConstraint<SecuritiesFinancingConfirmationV01> forSecuritiesFinancingConfirmationV01 = new MMConstraint<SecuritiesFinancingConfirmationV01>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesFinancingConfirmationV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesFinancingConfirmationV01.mmObject();
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
	public static final MMConstraint<SecuritiesFinancingConfirmationV02> forSecuritiesFinancingConfirmationV02 = new MMConstraint<SecuritiesFinancingConfirmationV02>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesFinancingConfirmationV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesFinancingConfirmationV02.mmObject();
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
	public static final MMConstraint<SecuritiesFinancingConfirmationV03> forSecuritiesFinancingConfirmationV03 = new MMConstraint<SecuritiesFinancingConfirmationV03>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesFinancingConfirmationV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesFinancingConfirmationV03.mmObject();
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forSecuritiesFinancingConfirmationV05
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forSecuritiesFinancingConfirmationV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingConfirmationV04> forSecuritiesFinancingConfirmationV04 = new MMConstraint<SecuritiesFinancingConfirmationV04>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesFinancingConfirmationV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forSecuritiesFinancingConfirmationV05);
			owner_lazy = () -> SecuritiesFinancingConfirmationV04.mmObject();
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
	public static final MMConstraint<SecuritiesFinancingInstructionV01> forSecuritiesFinancingInstructionV01 = new MMConstraint<SecuritiesFinancingInstructionV01>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesFinancingInstructionV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesFinancingInstructionV01.mmObject();
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
	public static final MMConstraint<SecuritiesFinancingInstructionV02> forSecuritiesFinancingInstructionV02 = new MMConstraint<SecuritiesFinancingInstructionV02>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesFinancingInstructionV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesFinancingInstructionV02.mmObject();
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
	public static final MMConstraint<SecuritiesFinancingInstructionV03> forSecuritiesFinancingInstructionV03 = new MMConstraint<SecuritiesFinancingInstructionV03>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesFinancingInstructionV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesFinancingInstructionV03.mmObject();
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
	public static final MMConstraint<SecuritiesSettlementConditionModificationStatusAdviceV01> forSecuritiesSettlementConditionModificationStatusAdviceV01 = new MMConstraint<SecuritiesSettlementConditionModificationStatusAdviceV01>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesSettlementConditionModificationStatusAdviceV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesSettlementConditionModificationStatusAdviceV01.mmObject();
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
	public static final MMConstraint<SecuritiesSettlementConditionModificationStatusAdviceV02> forSecuritiesSettlementConditionModificationStatusAdviceV02 = new MMConstraint<SecuritiesSettlementConditionModificationStatusAdviceV02>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesSettlementConditionModificationStatusAdviceV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesSettlementConditionModificationStatusAdviceV02.mmObject();
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
	public static final MMConstraint<SecuritiesSettlementConditionModificationStatusAdviceV03> forSecuritiesSettlementConditionModificationStatusAdviceV03 = new MMConstraint<SecuritiesSettlementConditionModificationStatusAdviceV03>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesSettlementConditionModificationStatusAdviceV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesSettlementConditionModificationStatusAdviceV03.mmObject();
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forSecuritiesSettlementConditionModificationStatusAdviceV05
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forSecuritiesSettlementConditionModificationStatusAdviceV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementConditionModificationStatusAdviceV04> forSecuritiesSettlementConditionModificationStatusAdviceV04 = new MMConstraint<SecuritiesSettlementConditionModificationStatusAdviceV04>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesSettlementConditionModificationStatusAdviceV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forSecuritiesSettlementConditionModificationStatusAdviceV05);
			owner_lazy = () -> SecuritiesSettlementConditionModificationStatusAdviceV04.mmObject();
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
	public static final MMConstraint<SecuritiesSettlementConditionsModificationRequestV01> forSecuritiesSettlementConditionsModificationRequestV01 = new MMConstraint<SecuritiesSettlementConditionsModificationRequestV01>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesSettlementConditionsModificationRequestV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesSettlementConditionsModificationRequestV01.mmObject();
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
	public static final MMConstraint<SecuritiesSettlementConditionsModificationRequestV02> forSecuritiesSettlementConditionsModificationRequestV02 = new MMConstraint<SecuritiesSettlementConditionsModificationRequestV02>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesSettlementConditionsModificationRequestV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesSettlementConditionsModificationRequestV02.mmObject();
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
	public static final MMConstraint<SecuritiesSettlementConditionsModificationRequestV03> forSecuritiesSettlementConditionsModificationRequestV03 = new MMConstraint<SecuritiesSettlementConditionsModificationRequestV03>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesSettlementConditionsModificationRequestV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesSettlementConditionsModificationRequestV03.mmObject();
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forSecuritiesSettlementConditionsModificationRequestV05
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forSecuritiesSettlementConditionsModificationRequestV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementConditionsModificationRequestV04> forSecuritiesSettlementConditionsModificationRequestV04 = new MMConstraint<SecuritiesSettlementConditionsModificationRequestV04>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesSettlementConditionsModificationRequestV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forSecuritiesSettlementConditionsModificationRequestV05);
			owner_lazy = () -> SecuritiesSettlementConditionsModificationRequestV04.mmObject();
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
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmationV01> forSecuritiesSettlementTransactionConfirmationV01 = new MMConstraint<SecuritiesSettlementTransactionConfirmationV01>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesSettlementTransactionConfirmationV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesSettlementTransactionConfirmationV01.mmObject();
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
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmationV02> forSecuritiesSettlementTransactionConfirmationV02 = new MMConstraint<SecuritiesSettlementTransactionConfirmationV02>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesSettlementTransactionConfirmationV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesSettlementTransactionConfirmationV02.mmObject();
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
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmationV03> forSecuritiesSettlementTransactionConfirmationV03 = new MMConstraint<SecuritiesSettlementTransactionConfirmationV03>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesSettlementTransactionConfirmationV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesSettlementTransactionConfirmationV03.mmObject();
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forSecuritiesSettlementTransactionConfirmationV05
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forSecuritiesSettlementTransactionConfirmationV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmationV04> forSecuritiesSettlementTransactionConfirmationV04 = new MMConstraint<SecuritiesSettlementTransactionConfirmationV04>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesSettlementTransactionConfirmationV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forSecuritiesSettlementTransactionConfirmationV05);
			owner_lazy = () -> SecuritiesSettlementTransactionConfirmationV04.mmObject();
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
	public static final MMConstraint<SecuritiesSettlementTransactionGenerationNotificationV01> forSecuritiesSettlementTransactionGenerationNotificationV01 = new MMConstraint<SecuritiesSettlementTransactionGenerationNotificationV01>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesSettlementTransactionGenerationNotificationV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesSettlementTransactionGenerationNotificationV01.mmObject();
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
	public static final MMConstraint<SecuritiesSettlementTransactionGenerationNotificationV02> forSecuritiesSettlementTransactionGenerationNotificationV02 = new MMConstraint<SecuritiesSettlementTransactionGenerationNotificationV02>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesSettlementTransactionGenerationNotificationV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesSettlementTransactionGenerationNotificationV02.mmObject();
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
	public static final MMConstraint<SecuritiesSettlementTransactionGenerationNotificationV03> forSecuritiesSettlementTransactionGenerationNotificationV03 = new MMConstraint<SecuritiesSettlementTransactionGenerationNotificationV03>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesSettlementTransactionGenerationNotificationV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesSettlementTransactionGenerationNotificationV03.mmObject();
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forSecuritiesSettlementTransactionGenerationNotificationV05
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forSecuritiesSettlementTransactionGenerationNotificationV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionGenerationNotificationV04> forSecuritiesSettlementTransactionGenerationNotificationV04 = new MMConstraint<SecuritiesSettlementTransactionGenerationNotificationV04>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesSettlementTransactionGenerationNotificationV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forSecuritiesSettlementTransactionGenerationNotificationV05);
			owner_lazy = () -> SecuritiesSettlementTransactionGenerationNotificationV04.mmObject();
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
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV01> forSecuritiesSettlementTransactionInstructionV01 = new MMConstraint<SecuritiesSettlementTransactionInstructionV01>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesSettlementTransactionInstructionV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV01.mmObject();
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
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV02> forSecuritiesSettlementTransactionInstructionV02 = new MMConstraint<SecuritiesSettlementTransactionInstructionV02>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesSettlementTransactionInstructionV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV02.mmObject();
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
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV03> forSecuritiesSettlementTransactionInstructionV03 = new MMConstraint<SecuritiesSettlementTransactionInstructionV03>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesSettlementTransactionInstructionV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV03.mmObject();
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forSecuritiesSettlementTransactionInstructionV05
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forSecuritiesSettlementTransactionInstructionV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV04> forSecuritiesSettlementTransactionInstructionV04 = new MMConstraint<SecuritiesSettlementTransactionInstructionV04>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesSettlementTransactionInstructionV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forSecuritiesSettlementTransactionInstructionV05);
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV04.mmObject();
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
	public static final MMConstraint<SecuritiesSettlementTransactionStatusAdviceV01> forSecuritiesSettlementTransactionStatusAdviceV01 = new MMConstraint<SecuritiesSettlementTransactionStatusAdviceV01>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesSettlementTransactionStatusAdviceV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesSettlementTransactionStatusAdviceV01.mmObject();
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
	public static final MMConstraint<SecuritiesSettlementTransactionStatusAdviceV02> forSecuritiesSettlementTransactionStatusAdviceV02 = new MMConstraint<SecuritiesSettlementTransactionStatusAdviceV02>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesSettlementTransactionStatusAdviceV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesSettlementTransactionStatusAdviceV02.mmObject();
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
	public static final MMConstraint<SecuritiesSettlementTransactionStatusAdviceV03> forSecuritiesSettlementTransactionStatusAdviceV03 = new MMConstraint<SecuritiesSettlementTransactionStatusAdviceV03>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesSettlementTransactionStatusAdviceV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesSettlementTransactionStatusAdviceV03.mmObject();
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forSecuritiesSettlementTransactionStatusAdviceV05
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forSecuritiesSettlementTransactionStatusAdviceV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionStatusAdviceV04> forSecuritiesSettlementTransactionStatusAdviceV04 = new MMConstraint<SecuritiesSettlementTransactionStatusAdviceV04>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesSettlementTransactionStatusAdviceV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forSecuritiesSettlementTransactionStatusAdviceV05);
			owner_lazy = () -> SecuritiesSettlementTransactionStatusAdviceV04.mmObject();
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forSecuritiesFinancingInstructionV05
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forSecuritiesFinancingInstructionV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingInstructionV04> forSecuritiesFinancingInstructionV04 = new MMConstraint<SecuritiesFinancingInstructionV04>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesFinancingInstructionV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forSecuritiesFinancingInstructionV05);
			owner_lazy = () -> SecuritiesFinancingInstructionV04.mmObject();
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
	public static final MMConstraint<PortfolioTransferNotificationV01> forPortfolioTransferNotificationV01 = new MMConstraint<PortfolioTransferNotificationV01>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkPortfolioTransferNotificationV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> PortfolioTransferNotificationV01.mmObject();
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
	public static final MMConstraint<PortfolioTransferNotificationV02> forPortfolioTransferNotificationV02 = new MMConstraint<PortfolioTransferNotificationV02>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkPortfolioTransferNotificationV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> PortfolioTransferNotificationV02.mmObject();
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
	public static final MMConstraint<SecuritiesFinancingModificationInstructionV01> forSecuritiesFinancingModificationInstructionV01 = new MMConstraint<SecuritiesFinancingModificationInstructionV01>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesFinancingModificationInstructionV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesFinancingModificationInstructionV01.mmObject();
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
	public static final MMConstraint<SecuritiesFinancingModificationInstructionV02> forSecuritiesFinancingModificationInstructionV02 = new MMConstraint<SecuritiesFinancingModificationInstructionV02>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesFinancingModificationInstructionV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesFinancingModificationInstructionV02.mmObject();
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
	public static final MMConstraint<SecuritiesFinancingStatusAdviceV01> forSecuritiesFinancingStatusAdviceV01 = new MMConstraint<SecuritiesFinancingStatusAdviceV01>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesFinancingStatusAdviceV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesFinancingStatusAdviceV01.mmObject();
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
	public static final MMConstraint<SecuritiesFinancingStatusAdviceV02> forSecuritiesFinancingStatusAdviceV02 = new MMConstraint<SecuritiesFinancingStatusAdviceV02>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesFinancingStatusAdviceV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesFinancingStatusAdviceV02.mmObject();
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
	public static final MMConstraint<SecuritiesSettlementAllegementRemovalAdviceV01> forSecuritiesSettlementAllegementRemovalAdviceV01 = new MMConstraint<SecuritiesSettlementAllegementRemovalAdviceV01>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesSettlementAllegementRemovalAdviceV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesSettlementAllegementRemovalAdviceV01.mmObject();
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
	public static final MMConstraint<SecuritiesSettlementAllegementRemovalAdviceV02> forSecuritiesSettlementAllegementRemovalAdviceV02 = new MMConstraint<SecuritiesSettlementAllegementRemovalAdviceV02>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesSettlementAllegementRemovalAdviceV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesSettlementAllegementRemovalAdviceV02.mmObject();
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
	public static final MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV01> forSecuritiesSettlementTransactionAllegementNotificationV01 = new MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV01>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesSettlementTransactionAllegementNotificationV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesSettlementTransactionAllegementNotificationV01.mmObject();
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
	public static final MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV02> forSecuritiesSettlementTransactionAllegementNotificationV02 = new MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV02>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesSettlementTransactionAllegementNotificationV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesSettlementTransactionAllegementNotificationV02.mmObject();
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
	public static final MMConstraint<SecuritiesSettlementTransactionReversalAdviceV01> forSecuritiesSettlementTransactionReversalAdviceV01 = new MMConstraint<SecuritiesSettlementTransactionReversalAdviceV01>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesSettlementTransactionReversalAdviceV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesSettlementTransactionReversalAdviceV01.mmObject();
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
	public static final MMConstraint<SecuritiesSettlementTransactionReversalAdviceV02> forSecuritiesSettlementTransactionReversalAdviceV02 = new MMConstraint<SecuritiesSettlementTransactionReversalAdviceV02>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesSettlementTransactionReversalAdviceV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesSettlementTransactionReversalAdviceV02.mmObject();
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
	public static final MMConstraint<SecuritiesStatusOrStatementQueryStatusAdviceV01> forSecuritiesStatusOrStatementQueryStatusAdviceV01 = new MMConstraint<SecuritiesStatusOrStatementQueryStatusAdviceV01>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesStatusOrStatementQueryStatusAdviceV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesStatusOrStatementQueryStatusAdviceV01.mmObject();
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
	public static final MMConstraint<SecuritiesStatusOrStatementQueryStatusAdviceV02> forSecuritiesStatusOrStatementQueryStatusAdviceV02 = new MMConstraint<SecuritiesStatusOrStatementQueryStatusAdviceV02>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesStatusOrStatementQueryStatusAdviceV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesStatusOrStatementQueryStatusAdviceV02.mmObject();
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
	public static final MMConstraint<SecuritiesTransactionCancellationRequestStatusAdviceV01> forSecuritiesTransactionCancellationRequestStatusAdviceV01 = new MMConstraint<SecuritiesTransactionCancellationRequestStatusAdviceV01>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesTransactionCancellationRequestStatusAdviceV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesTransactionCancellationRequestStatusAdviceV01.mmObject();
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
	public static final MMConstraint<SecuritiesTransactionCancellationRequestStatusAdviceV02> forSecuritiesTransactionCancellationRequestStatusAdviceV02 = new MMConstraint<SecuritiesTransactionCancellationRequestStatusAdviceV02>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesTransactionCancellationRequestStatusAdviceV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesTransactionCancellationRequestStatusAdviceV02.mmObject();
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
	public static final MMConstraint<SecuritiesTransactionCancellationRequestV01> forSecuritiesTransactionCancellationRequestV01 = new MMConstraint<SecuritiesTransactionCancellationRequestV01>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesTransactionCancellationRequestV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesTransactionCancellationRequestV01.mmObject();
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
	public static final MMConstraint<SecuritiesTransactionCancellationRequestV02> forSecuritiesTransactionCancellationRequestV02 = new MMConstraint<SecuritiesTransactionCancellationRequestV02>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesTransactionCancellationRequestV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesTransactionCancellationRequestV02.mmObject();
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
	public static final MMConstraint<SecuritiesTransactionStatusQueryV01> forSecuritiesTransactionStatusQueryV01 = new MMConstraint<SecuritiesTransactionStatusQueryV01>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesTransactionStatusQueryV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesTransactionStatusQueryV01.mmObject();
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
	public static final MMConstraint<SecuritiesTransactionStatusQueryV02> forSecuritiesTransactionStatusQueryV02 = new MMConstraint<SecuritiesTransactionStatusQueryV02>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesTransactionStatusQueryV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> SecuritiesTransactionStatusQueryV02.mmObject();
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forSecuritiesFinancingModificationInstructionV04
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forSecuritiesFinancingModificationInstructionV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingModificationInstructionV03> forSecuritiesFinancingModificationInstructionV03 = new MMConstraint<SecuritiesFinancingModificationInstructionV03>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesFinancingModificationInstructionV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forSecuritiesFinancingModificationInstructionV04);
			owner_lazy = () -> SecuritiesFinancingModificationInstructionV03.mmObject();
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forSecuritiesFinancingStatusAdviceV04
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forSecuritiesFinancingStatusAdviceV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingStatusAdviceV03> forSecuritiesFinancingStatusAdviceV03 = new MMConstraint<SecuritiesFinancingStatusAdviceV03>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesFinancingStatusAdviceV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forSecuritiesFinancingStatusAdviceV04);
			owner_lazy = () -> SecuritiesFinancingStatusAdviceV03.mmObject();
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forSecuritiesSettlementTransactionAllegementNotificationV04
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forSecuritiesSettlementTransactionAllegementNotificationV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV03> forSecuritiesSettlementTransactionAllegementNotificationV03 = new MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV03>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesSettlementTransactionAllegementNotificationV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forSecuritiesSettlementTransactionAllegementNotificationV04);
			owner_lazy = () -> SecuritiesSettlementTransactionAllegementNotificationV03.mmObject();
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forSecuritiesSettlementTransactionReversalAdviceV04
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forSecuritiesSettlementTransactionReversalAdviceV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionReversalAdviceV03> forSecuritiesSettlementTransactionReversalAdviceV03 = new MMConstraint<SecuritiesSettlementTransactionReversalAdviceV03>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesSettlementTransactionReversalAdviceV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forSecuritiesSettlementTransactionReversalAdviceV04);
			owner_lazy = () -> SecuritiesSettlementTransactionReversalAdviceV03.mmObject();
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forSecuritiesTransactionCancellationRequestV04
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forSecuritiesTransactionCancellationRequestV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionCancellationRequestV03> forSecuritiesTransactionCancellationRequestV03 = new MMConstraint<SecuritiesTransactionCancellationRequestV03>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesTransactionCancellationRequestV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forSecuritiesTransactionCancellationRequestV04);
			owner_lazy = () -> SecuritiesTransactionCancellationRequestV03.mmObject();
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forSecuritiesTransactionCancellationRequestStatusAdviceV04
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forSecuritiesTransactionCancellationRequestStatusAdviceV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionCancellationRequestStatusAdviceV03> forSecuritiesTransactionCancellationRequestStatusAdviceV03 = new MMConstraint<SecuritiesTransactionCancellationRequestStatusAdviceV03>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesTransactionCancellationRequestStatusAdviceV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forSecuritiesTransactionCancellationRequestStatusAdviceV04);
			owner_lazy = () -> SecuritiesTransactionCancellationRequestStatusAdviceV03.mmObject();
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
	public static final MMConstraint<PortfolioTransferNotificationV03> forPortfolioTransferNotificationV03 = new MMConstraint<PortfolioTransferNotificationV03>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkPortfolioTransferNotificationV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> PortfolioTransferNotificationV03.mmObject();
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forSecuritiesSettlementTransactionAllegementNotificationV03
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forSecuritiesSettlementTransactionAllegementNotificationV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV04> forSecuritiesSettlementTransactionAllegementNotificationV04 = new MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV04>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesSettlementTransactionAllegementNotificationV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forSecuritiesSettlementTransactionAllegementNotificationV03;
			owner_lazy = () -> SecuritiesSettlementTransactionAllegementNotificationV04.mmObject();
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forSecuritiesFinancingStatusAdviceV05
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forSecuritiesFinancingStatusAdviceV05}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forSecuritiesFinancingStatusAdviceV03
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forSecuritiesFinancingStatusAdviceV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingStatusAdviceV04> forSecuritiesFinancingStatusAdviceV04 = new MMConstraint<SecuritiesFinancingStatusAdviceV04>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesFinancingStatusAdviceV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forSecuritiesFinancingStatusAdviceV05);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forSecuritiesFinancingStatusAdviceV03;
			owner_lazy = () -> SecuritiesFinancingStatusAdviceV04.mmObject();
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forSecuritiesFinancingConfirmationV04
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forSecuritiesFinancingConfirmationV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingConfirmationV05> forSecuritiesFinancingConfirmationV05 = new MMConstraint<SecuritiesFinancingConfirmationV05>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesFinancingConfirmationV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forSecuritiesFinancingConfirmationV04;
			owner_lazy = () -> SecuritiesFinancingConfirmationV05.mmObject();
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forSecuritiesSettlementTransactionGenerationNotificationV04
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forSecuritiesSettlementTransactionGenerationNotificationV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionGenerationNotificationV05> forSecuritiesSettlementTransactionGenerationNotificationV05 = new MMConstraint<SecuritiesSettlementTransactionGenerationNotificationV05>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesSettlementTransactionGenerationNotificationV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forSecuritiesSettlementTransactionGenerationNotificationV04;
			owner_lazy = () -> SecuritiesSettlementTransactionGenerationNotificationV05.mmObject();
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forSecuritiesSettlementTransactionReversalAdviceV03
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forSecuritiesSettlementTransactionReversalAdviceV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionReversalAdviceV04> forSecuritiesSettlementTransactionReversalAdviceV04 = new MMConstraint<SecuritiesSettlementTransactionReversalAdviceV04>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesSettlementTransactionReversalAdviceV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forSecuritiesSettlementTransactionReversalAdviceV03;
			owner_lazy = () -> SecuritiesSettlementTransactionReversalAdviceV04.mmObject();
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forSecuritiesFinancingInstructionV04
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forSecuritiesFinancingInstructionV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingInstructionV05> forSecuritiesFinancingInstructionV05 = new MMConstraint<SecuritiesFinancingInstructionV05>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesFinancingInstructionV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forSecuritiesFinancingInstructionV04;
			owner_lazy = () -> SecuritiesFinancingInstructionV05.mmObject();
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forSecuritiesSettlementTransactionInstructionV04
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forSecuritiesSettlementTransactionInstructionV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV05> forSecuritiesSettlementTransactionInstructionV05 = new MMConstraint<SecuritiesSettlementTransactionInstructionV05>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesSettlementTransactionInstructionV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forSecuritiesSettlementTransactionInstructionV04;
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV05.mmObject();
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forSecuritiesSettlementTransactionConfirmationV04
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forSecuritiesSettlementTransactionConfirmationV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmationV05> forSecuritiesSettlementTransactionConfirmationV05 = new MMConstraint<SecuritiesSettlementTransactionConfirmationV05>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesSettlementTransactionConfirmationV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forSecuritiesSettlementTransactionConfirmationV04;
			owner_lazy = () -> SecuritiesSettlementTransactionConfirmationV05.mmObject();
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forSecuritiesSettlementConditionModificationStatusAdviceV06
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forSecuritiesSettlementConditionModificationStatusAdviceV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forSecuritiesSettlementConditionModificationStatusAdviceV04
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forSecuritiesSettlementConditionModificationStatusAdviceV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementConditionModificationStatusAdviceV05> forSecuritiesSettlementConditionModificationStatusAdviceV05 = new MMConstraint<SecuritiesSettlementConditionModificationStatusAdviceV05>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesSettlementConditionModificationStatusAdviceV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forSecuritiesSettlementConditionModificationStatusAdviceV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forSecuritiesSettlementConditionModificationStatusAdviceV04;
			owner_lazy = () -> SecuritiesSettlementConditionModificationStatusAdviceV05.mmObject();
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forSecuritiesFinancingModificationInstructionV03
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forSecuritiesFinancingModificationInstructionV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingModificationInstructionV04> forSecuritiesFinancingModificationInstructionV04 = new MMConstraint<SecuritiesFinancingModificationInstructionV04>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesFinancingModificationInstructionV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forSecuritiesFinancingModificationInstructionV03;
			owner_lazy = () -> SecuritiesFinancingModificationInstructionV04.mmObject();
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forSecuritiesSettlementConditionsModificationRequestV04
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forSecuritiesSettlementConditionsModificationRequestV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementConditionsModificationRequestV05> forSecuritiesSettlementConditionsModificationRequestV05 = new MMConstraint<SecuritiesSettlementConditionsModificationRequestV05>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesSettlementConditionsModificationRequestV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forSecuritiesSettlementConditionsModificationRequestV04;
			owner_lazy = () -> SecuritiesSettlementConditionsModificationRequestV05.mmObject();
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forSecuritiesSettlementTransactionStatusAdviceV06
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forSecuritiesSettlementTransactionStatusAdviceV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forSecuritiesSettlementTransactionStatusAdviceV04
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forSecuritiesSettlementTransactionStatusAdviceV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionStatusAdviceV05> forSecuritiesSettlementTransactionStatusAdviceV05 = new MMConstraint<SecuritiesSettlementTransactionStatusAdviceV05>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesSettlementTransactionStatusAdviceV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forSecuritiesSettlementTransactionStatusAdviceV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forSecuritiesSettlementTransactionStatusAdviceV04;
			owner_lazy = () -> SecuritiesSettlementTransactionStatusAdviceV05.mmObject();
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forSecuritiesFinancingStatusAdviceV04
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forSecuritiesFinancingStatusAdviceV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingStatusAdviceV05> forSecuritiesFinancingStatusAdviceV05 = new MMConstraint<SecuritiesFinancingStatusAdviceV05>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesFinancingStatusAdviceV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forSecuritiesFinancingStatusAdviceV04;
			owner_lazy = () -> SecuritiesFinancingStatusAdviceV05.mmObject();
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forSecuritiesSettlementTransactionStatusAdviceV05
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forSecuritiesSettlementTransactionStatusAdviceV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionStatusAdviceV06> forSecuritiesSettlementTransactionStatusAdviceV06 = new MMConstraint<SecuritiesSettlementTransactionStatusAdviceV06>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkSecuritiesSettlementTransactionStatusAdviceV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forSecuritiesSettlementTransactionStatusAdviceV05;
			owner_lazy = () -> SecuritiesSettlementTransactionStatusAdviceV06.mmObject();
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
	public static final MMConstraint<CorporateActionCancellationAdviceV01> forCorporateActionCancellationAdviceV01 = new MMConstraint<CorporateActionCancellationAdviceV01>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkCorporateActionCancellationAdviceV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionCancellationAdviceV01.mmObject();
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
	public static final MMConstraint<CorporateActionCancellationAdviceV02> forCorporateActionCancellationAdviceV02 = new MMConstraint<CorporateActionCancellationAdviceV02>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkCorporateActionCancellationAdviceV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionCancellationAdviceV02.mmObject();
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
	public static final MMConstraint<CorporateActionCancellationAdviceV03> forCorporateActionCancellationAdviceV03 = new MMConstraint<CorporateActionCancellationAdviceV03>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkCorporateActionCancellationAdviceV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionCancellationAdviceV03.mmObject();
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forCorporateActionCancellationAdviceV05
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forCorporateActionCancellationAdviceV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionCancellationAdviceV04> forCorporateActionCancellationAdviceV04 = new MMConstraint<CorporateActionCancellationAdviceV04>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkCorporateActionCancellationAdviceV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forCorporateActionCancellationAdviceV05);
			owner_lazy = () -> CorporateActionCancellationAdviceV04.mmObject();
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
	public static final MMConstraint<CorporateActionEventProcessingStatusAdviceV01> forCorporateActionEventProcessingStatusAdviceV01 = new MMConstraint<CorporateActionEventProcessingStatusAdviceV01>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkCorporateActionEventProcessingStatusAdviceV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionEventProcessingStatusAdviceV01.mmObject();
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
	public static final MMConstraint<CorporateActionEventProcessingStatusAdviceV02> forCorporateActionEventProcessingStatusAdviceV02 = new MMConstraint<CorporateActionEventProcessingStatusAdviceV02>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkCorporateActionEventProcessingStatusAdviceV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionEventProcessingStatusAdviceV02.mmObject();
		}
	};
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
	public static final MMConstraint<CorporateActionEventProcessingStatusAdviceV03> forCorporateActionEventProcessingStatusAdviceV03 = new MMConstraint<CorporateActionEventProcessingStatusAdviceV03>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkCorporateActionEventProcessingStatusAdviceV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionEventProcessingStatusAdviceV03.mmObject();
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
	public static final MMConstraint<CorporateActionEventProcessingStatusAdviceV04> forCorporateActionEventProcessingStatusAdviceV04 = new MMConstraint<CorporateActionEventProcessingStatusAdviceV04>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkCorporateActionEventProcessingStatusAdviceV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionEventProcessingStatusAdviceV04.mmObject();
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
	public static final MMConstraint<CorporateActionInstructionV01> forCorporateActionInstructionV01 = new MMConstraint<CorporateActionInstructionV01>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkCorporateActionInstructionV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionInstructionV01.mmObject();
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
	public static final MMConstraint<CorporateActionInstructionV02> forCorporateActionInstructionV02 = new MMConstraint<CorporateActionInstructionV02>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkCorporateActionInstructionV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionInstructionV02.mmObject();
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
	public static final MMConstraint<CorporateActionInstructionV03> forCorporateActionInstructionV03 = new MMConstraint<CorporateActionInstructionV03>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkCorporateActionInstructionV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionInstructionV03.mmObject();
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forCorporateActionInstructionV05
	 * ConstraintCoexistenceCharacterSetXRule.forCorporateActionInstructionV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionV04> forCorporateActionInstructionV04 = new MMConstraint<CorporateActionInstructionV04>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkCorporateActionInstructionV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forCorporateActionInstructionV05);
			owner_lazy = () -> CorporateActionInstructionV04.mmObject();
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
	public static final MMConstraint<CorporateActionInstructionCancellationRequestV01> forCorporateActionInstructionCancellationRequestV01 = new MMConstraint<CorporateActionInstructionCancellationRequestV01>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkCorporateActionInstructionCancellationRequestV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionInstructionCancellationRequestV01.mmObject();
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
	public static final MMConstraint<CorporateActionInstructionCancellationRequestV02> forCorporateActionInstructionCancellationRequestV02 = new MMConstraint<CorporateActionInstructionCancellationRequestV02>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkCorporateActionInstructionCancellationRequestV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionInstructionCancellationRequestV02.mmObject();
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
	public static final MMConstraint<CorporateActionInstructionCancellationRequestV03> forCorporateActionInstructionCancellationRequestV03 = new MMConstraint<CorporateActionInstructionCancellationRequestV03>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkCorporateActionInstructionCancellationRequestV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionInstructionCancellationRequestV03.mmObject();
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forCorporateActionInstructionCancellationRequestV05
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forCorporateActionInstructionCancellationRequestV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionCancellationRequestV04> forCorporateActionInstructionCancellationRequestV04 = new MMConstraint<CorporateActionInstructionCancellationRequestV04>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkCorporateActionInstructionCancellationRequestV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forCorporateActionInstructionCancellationRequestV05);
			owner_lazy = () -> CorporateActionInstructionCancellationRequestV04.mmObject();
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
	public static final MMConstraint<CorporateActionInstructionCancellationRequestStatusAdviceV01> forCorporateActionInstructionCancellationRequestStatusAdviceV01 = new MMConstraint<CorporateActionInstructionCancellationRequestStatusAdviceV01>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkCorporateActionInstructionCancellationRequestStatusAdviceV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionInstructionCancellationRequestStatusAdviceV01.mmObject();
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
	public static final MMConstraint<CorporateActionInstructionCancellationRequestStatusAdviceV02> forCorporateActionInstructionCancellationRequestStatusAdviceV02 = new MMConstraint<CorporateActionInstructionCancellationRequestStatusAdviceV02>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkCorporateActionInstructionCancellationRequestStatusAdviceV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionInstructionCancellationRequestStatusAdviceV02.mmObject();
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
	public static final MMConstraint<CorporateActionInstructionCancellationRequestStatusAdviceV03> forCorporateActionInstructionCancellationRequestStatusAdviceV03 = new MMConstraint<CorporateActionInstructionCancellationRequestStatusAdviceV03>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkCorporateActionInstructionCancellationRequestStatusAdviceV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionInstructionCancellationRequestStatusAdviceV03.mmObject();
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forCorporateActionInstructionCancellationRequestStatusAdviceV05
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forCorporateActionInstructionCancellationRequestStatusAdviceV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionCancellationRequestStatusAdviceV04> forCorporateActionInstructionCancellationRequestStatusAdviceV04 = new MMConstraint<CorporateActionInstructionCancellationRequestStatusAdviceV04>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkCorporateActionInstructionCancellationRequestStatusAdviceV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forCorporateActionInstructionCancellationRequestStatusAdviceV05);
			owner_lazy = () -> CorporateActionInstructionCancellationRequestStatusAdviceV04.mmObject();
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
	public static final MMConstraint<CorporateActionInstructionStatementReportV01> forCorporateActionInstructionStatementReportV01 = new MMConstraint<CorporateActionInstructionStatementReportV01>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkCorporateActionInstructionStatementReportV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionInstructionStatementReportV01.mmObject();
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
	public static final MMConstraint<CorporateActionInstructionStatementReportV02> forCorporateActionInstructionStatementReportV02 = new MMConstraint<CorporateActionInstructionStatementReportV02>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkCorporateActionInstructionStatementReportV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionInstructionStatementReportV02.mmObject();
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
	public static final MMConstraint<CorporateActionInstructionStatementReportV03> forCorporateActionInstructionStatementReportV03 = new MMConstraint<CorporateActionInstructionStatementReportV03>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkCorporateActionInstructionStatementReportV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionInstructionStatementReportV03.mmObject();
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
	public static final MMConstraint<CorporateActionInstructionStatementReportV04> forCorporateActionInstructionStatementReportV04 = new MMConstraint<CorporateActionInstructionStatementReportV04>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkCorporateActionInstructionStatementReportV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionInstructionStatementReportV04.mmObject();
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
	public static final MMConstraint<CorporateActionInstructionStatusAdviceV01> forCorporateActionInstructionStatusAdviceV01 = new MMConstraint<CorporateActionInstructionStatusAdviceV01>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkCorporateActionInstructionStatusAdviceV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionInstructionStatusAdviceV01.mmObject();
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
	public static final MMConstraint<CorporateActionInstructionStatusAdviceV02> forCorporateActionInstructionStatusAdviceV02 = new MMConstraint<CorporateActionInstructionStatusAdviceV02>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkCorporateActionInstructionStatusAdviceV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionInstructionStatusAdviceV02.mmObject();
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
	public static final MMConstraint<CorporateActionInstructionStatusAdviceV03> forCorporateActionInstructionStatusAdviceV03 = new MMConstraint<CorporateActionInstructionStatusAdviceV03>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkCorporateActionInstructionStatusAdviceV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionInstructionStatusAdviceV03.mmObject();
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forCorporateActionInstructionStatusAdviceV05
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forCorporateActionInstructionStatusAdviceV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionStatusAdviceV04> forCorporateActionInstructionStatusAdviceV04 = new MMConstraint<CorporateActionInstructionStatusAdviceV04>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkCorporateActionInstructionStatusAdviceV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forCorporateActionInstructionStatusAdviceV05);
			owner_lazy = () -> CorporateActionInstructionStatusAdviceV04.mmObject();
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
	public static final MMConstraint<CorporateActionMovementConfirmationV01> forCorporateActionMovementConfirmationV01 = new MMConstraint<CorporateActionMovementConfirmationV01>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkCorporateActionMovementConfirmationV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionMovementConfirmationV01.mmObject();
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
	public static final MMConstraint<CorporateActionMovementConfirmationV02> forCorporateActionMovementConfirmationV02 = new MMConstraint<CorporateActionMovementConfirmationV02>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkCorporateActionMovementConfirmationV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionMovementConfirmationV02.mmObject();
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
	public static final MMConstraint<CorporateActionMovementConfirmationV03> forCorporateActionMovementConfirmationV03 = new MMConstraint<CorporateActionMovementConfirmationV03>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkCorporateActionMovementConfirmationV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionMovementConfirmationV03.mmObject();
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forCorporateActionMovementConfirmationV05
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forCorporateActionMovementConfirmationV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementConfirmationV04> forCorporateActionMovementConfirmationV04 = new MMConstraint<CorporateActionMovementConfirmationV04>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkCorporateActionMovementConfirmationV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forCorporateActionMovementConfirmationV05);
			owner_lazy = () -> CorporateActionMovementConfirmationV04.mmObject();
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
	public static final MMConstraint<CorporateActionMovementPreliminaryAdviceV01> forCorporateActionMovementPreliminaryAdviceV01 = new MMConstraint<CorporateActionMovementPreliminaryAdviceV01>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkCorporateActionMovementPreliminaryAdviceV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionMovementPreliminaryAdviceV01.mmObject();
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
	public static final MMConstraint<CorporateActionMovementPreliminaryAdviceV02> forCorporateActionMovementPreliminaryAdviceV02 = new MMConstraint<CorporateActionMovementPreliminaryAdviceV02>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkCorporateActionMovementPreliminaryAdviceV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionMovementPreliminaryAdviceV02.mmObject();
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
	public static final MMConstraint<CorporateActionMovementPreliminaryAdviceV03> forCorporateActionMovementPreliminaryAdviceV03 = new MMConstraint<CorporateActionMovementPreliminaryAdviceV03>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkCorporateActionMovementPreliminaryAdviceV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionMovementPreliminaryAdviceV03.mmObject();
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forCorporateActionMovementPreliminaryAdviceV05
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forCorporateActionMovementPreliminaryAdviceV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementPreliminaryAdviceV04> forCorporateActionMovementPreliminaryAdviceV04 = new MMConstraint<CorporateActionMovementPreliminaryAdviceV04>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkCorporateActionMovementPreliminaryAdviceV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forCorporateActionMovementPreliminaryAdviceV05);
			owner_lazy = () -> CorporateActionMovementPreliminaryAdviceV04.mmObject();
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
	public static final MMConstraint<CorporateActionMovementPreliminaryAdviceCancellationAdviceV01> forCorporateActionMovementPreliminaryAdviceCancellationAdviceV01 = new MMConstraint<CorporateActionMovementPreliminaryAdviceCancellationAdviceV01>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkCorporateActionMovementPreliminaryAdviceCancellationAdviceV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionMovementPreliminaryAdviceCancellationAdviceV01.mmObject();
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
	public static final MMConstraint<CorporateActionMovementPreliminaryAdviceCancellationAdviceV02> forCorporateActionMovementPreliminaryAdviceCancellationAdviceV02 = new MMConstraint<CorporateActionMovementPreliminaryAdviceCancellationAdviceV02>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkCorporateActionMovementPreliminaryAdviceCancellationAdviceV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionMovementPreliminaryAdviceCancellationAdviceV02.mmObject();
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
	public static final MMConstraint<CorporateActionMovementPreliminaryAdviceCancellationAdviceV03> forCorporateActionMovementPreliminaryAdviceCancellationAdviceV03 = new MMConstraint<CorporateActionMovementPreliminaryAdviceCancellationAdviceV03>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkCorporateActionMovementPreliminaryAdviceCancellationAdviceV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionMovementPreliminaryAdviceCancellationAdviceV03.mmObject();
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forCorporateActionMovementPreliminaryAdviceCancellationAdviceV05
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forCorporateActionMovementPreliminaryAdviceCancellationAdviceV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementPreliminaryAdviceCancellationAdviceV04> forCorporateActionMovementPreliminaryAdviceCancellationAdviceV04 = new MMConstraint<CorporateActionMovementPreliminaryAdviceCancellationAdviceV04>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkCorporateActionMovementPreliminaryAdviceCancellationAdviceV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forCorporateActionMovementPreliminaryAdviceCancellationAdviceV05);
			owner_lazy = () -> CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.mmObject();
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
	public static final MMConstraint<CorporateActionMovementReversalAdviceV01> forCorporateActionMovementReversalAdviceV01 = new MMConstraint<CorporateActionMovementReversalAdviceV01>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkCorporateActionMovementReversalAdviceV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionMovementReversalAdviceV01.mmObject();
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
	public static final MMConstraint<CorporateActionMovementReversalAdviceV02> forCorporateActionMovementReversalAdviceV02 = new MMConstraint<CorporateActionMovementReversalAdviceV02>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkCorporateActionMovementReversalAdviceV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionMovementReversalAdviceV02.mmObject();
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
	public static final MMConstraint<CorporateActionMovementReversalAdviceV03> forCorporateActionMovementReversalAdviceV03 = new MMConstraint<CorporateActionMovementReversalAdviceV03>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkCorporateActionMovementReversalAdviceV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionMovementReversalAdviceV03.mmObject();
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forCorporateActionMovementReversalAdviceV05
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forCorporateActionMovementReversalAdviceV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementReversalAdviceV04> forCorporateActionMovementReversalAdviceV04 = new MMConstraint<CorporateActionMovementReversalAdviceV04>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkCorporateActionMovementReversalAdviceV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forCorporateActionMovementReversalAdviceV05);
			owner_lazy = () -> CorporateActionMovementReversalAdviceV04.mmObject();
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
	public static final MMConstraint<CorporateActionNotificationV01> forCorporateActionNotificationV01 = new MMConstraint<CorporateActionNotificationV01>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkCorporateActionNotificationV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields (except for CorporateActionDetails/CorporateActionAdditionalInformation/URLAddress)  must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionNotificationV01.mmObject();
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
	public static final MMConstraint<CorporateActionNotificationV02> forCorporateActionNotificationV02 = new MMConstraint<CorporateActionNotificationV02>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkCorporateActionNotificationV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields (except for CorporateActionDetails/CorporateActionAdditionalInformation/URLAddress)  must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionNotificationV02.mmObject();
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
	public static final MMConstraint<CorporateActionNotificationV03> forCorporateActionNotificationV03 = new MMConstraint<CorporateActionNotificationV03>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkCorporateActionNotificationV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields (except for CorporateActionDetails/CorporateActionAdditionalInformation/URLAddress)  must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionNotificationV03.mmObject();
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forCorporateActionNotificationV05
	 * ConstraintCoexistenceCharacterSetXRule.forCorporateActionNotificationV05}
	 * </li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV04> forCorporateActionNotificationV04 = new MMConstraint<CorporateActionNotificationV04>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkCorporateActionNotificationV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields (except for CorporateActionDetails/CorporateActionAdditionalInformation/URLAddress)  must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forCorporateActionNotificationV05);
			owner_lazy = () -> CorporateActionNotificationV04.mmObject();
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
	public static final MMConstraint<CorporateActionNarrativeV01> forCorporateActionNarrativeV01 = new MMConstraint<CorporateActionNarrativeV01>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkCorporateActionNarrativeV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields (except AdditionalInformation/AdditionalInformation) must correspond to ISO 15022 character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionNarrativeV01.mmObject();
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
	public static final MMConstraint<CorporateActionNarrativeV02> forCorporateActionNarrativeV02 = new MMConstraint<CorporateActionNarrativeV02>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkCorporateActionNarrativeV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields (except AdditionalInformation/AdditionalInformation) must correspond to ISO 15022 character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			owner_lazy = () -> CorporateActionNarrativeV02.mmObject();
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forCorporateActionMovementPreliminaryAdviceCancellationAdviceV04
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forCorporateActionMovementPreliminaryAdviceCancellationAdviceV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementPreliminaryAdviceCancellationAdviceV05> forCorporateActionMovementPreliminaryAdviceCancellationAdviceV05 = new MMConstraint<CorporateActionMovementPreliminaryAdviceCancellationAdviceV05>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkCorporateActionMovementPreliminaryAdviceCancellationAdviceV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forCorporateActionMovementPreliminaryAdviceCancellationAdviceV04;
			owner_lazy = () -> CorporateActionMovementPreliminaryAdviceCancellationAdviceV05.mmObject();
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forCorporateActionCancellationAdviceV04
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forCorporateActionCancellationAdviceV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionCancellationAdviceV05> forCorporateActionCancellationAdviceV05 = new MMConstraint<CorporateActionCancellationAdviceV05>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkCorporateActionCancellationAdviceV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forCorporateActionCancellationAdviceV04;
			owner_lazy = () -> CorporateActionCancellationAdviceV05.mmObject();
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forCorporateActionMovementConfirmationV06
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forCorporateActionMovementConfirmationV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forCorporateActionMovementConfirmationV04
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forCorporateActionMovementConfirmationV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementConfirmationV05> forCorporateActionMovementConfirmationV05 = new MMConstraint<CorporateActionMovementConfirmationV05>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkCorporateActionMovementConfirmationV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forCorporateActionMovementConfirmationV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forCorporateActionMovementConfirmationV04;
			owner_lazy = () -> CorporateActionMovementConfirmationV05.mmObject();
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forCorporateActionNotificationV04
	 * ConstraintCoexistenceCharacterSetXRule.forCorporateActionNotificationV04}
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV05> forCorporateActionNotificationV05 = new MMConstraint<CorporateActionNotificationV05>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkCorporateActionNotificationV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields (except for CorporateActionDetails/CorporateActionAdditionalInformation/URLAddress)  must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forCorporateActionNotificationV04;
			owner_lazy = () -> CorporateActionNotificationV05.mmObject();
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forCorporateActionInstructionStatusAdviceV06
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forCorporateActionInstructionStatusAdviceV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forCorporateActionInstructionStatusAdviceV04
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forCorporateActionInstructionStatusAdviceV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionStatusAdviceV05> forCorporateActionInstructionStatusAdviceV05 = new MMConstraint<CorporateActionInstructionStatusAdviceV05>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkCorporateActionInstructionStatusAdviceV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forCorporateActionInstructionStatusAdviceV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forCorporateActionInstructionStatusAdviceV04;
			owner_lazy = () -> CorporateActionInstructionStatusAdviceV05.mmObject();
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forCorporateActionMovementPreliminaryAdviceV06
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forCorporateActionMovementPreliminaryAdviceV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forCorporateActionMovementPreliminaryAdviceV04
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forCorporateActionMovementPreliminaryAdviceV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementPreliminaryAdviceV05> forCorporateActionMovementPreliminaryAdviceV05 = new MMConstraint<CorporateActionMovementPreliminaryAdviceV05>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkCorporateActionMovementPreliminaryAdviceV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forCorporateActionMovementPreliminaryAdviceV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forCorporateActionMovementPreliminaryAdviceV04;
			owner_lazy = () -> CorporateActionMovementPreliminaryAdviceV05.mmObject();
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forCorporateActionInstructionV04
	 * ConstraintCoexistenceCharacterSetXRule.forCorporateActionInstructionV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionV05> forCorporateActionInstructionV05 = new MMConstraint<CorporateActionInstructionV05>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkCorporateActionInstructionV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forCorporateActionInstructionV04;
			owner_lazy = () -> CorporateActionInstructionV05.mmObject();
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forCorporateActionMovementReversalAdviceV06
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forCorporateActionMovementReversalAdviceV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forCorporateActionMovementReversalAdviceV04
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forCorporateActionMovementReversalAdviceV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementReversalAdviceV05> forCorporateActionMovementReversalAdviceV05 = new MMConstraint<CorporateActionMovementReversalAdviceV05>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkCorporateActionMovementReversalAdviceV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forCorporateActionMovementReversalAdviceV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forCorporateActionMovementReversalAdviceV04;
			owner_lazy = () -> CorporateActionMovementReversalAdviceV05.mmObject();
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forCorporateActionInstructionCancellationRequestV04
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forCorporateActionInstructionCancellationRequestV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionCancellationRequestV05> forCorporateActionInstructionCancellationRequestV05 = new MMConstraint<CorporateActionInstructionCancellationRequestV05>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkCorporateActionInstructionCancellationRequestV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forCorporateActionInstructionCancellationRequestV04;
			owner_lazy = () -> CorporateActionInstructionCancellationRequestV05.mmObject();
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forCorporateActionMovementConfirmationV05
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forCorporateActionMovementConfirmationV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementConfirmationV06> forCorporateActionMovementConfirmationV06 = new MMConstraint<CorporateActionMovementConfirmationV06>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkCorporateActionMovementConfirmationV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forCorporateActionMovementConfirmationV05;
			owner_lazy = () -> CorporateActionMovementConfirmationV06.mmObject();
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forCorporateActionInstructionCancellationRequestStatusAdviceV04
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forCorporateActionInstructionCancellationRequestStatusAdviceV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionCancellationRequestStatusAdviceV05> forCorporateActionInstructionCancellationRequestStatusAdviceV05 = new MMConstraint<CorporateActionInstructionCancellationRequestStatusAdviceV05>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkCorporateActionInstructionCancellationRequestStatusAdviceV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forCorporateActionInstructionCancellationRequestStatusAdviceV04;
			owner_lazy = () -> CorporateActionInstructionCancellationRequestStatusAdviceV05.mmObject();
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forCorporateActionInstructionStatusAdviceV05
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forCorporateActionInstructionStatusAdviceV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionStatusAdviceV06> forCorporateActionInstructionStatusAdviceV06 = new MMConstraint<CorporateActionInstructionStatusAdviceV06>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkCorporateActionInstructionStatusAdviceV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forCorporateActionInstructionStatusAdviceV05;
			owner_lazy = () -> CorporateActionInstructionStatusAdviceV06.mmObject();
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forCorporateActionMovementPreliminaryAdviceV05
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forCorporateActionMovementPreliminaryAdviceV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementPreliminaryAdviceV06> forCorporateActionMovementPreliminaryAdviceV06 = new MMConstraint<CorporateActionMovementPreliminaryAdviceV06>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkCorporateActionMovementPreliminaryAdviceV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forCorporateActionMovementPreliminaryAdviceV05;
			owner_lazy = () -> CorporateActionMovementPreliminaryAdviceV06.mmObject();
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forCorporateActionMovementReversalAdviceV05
	 * ConstraintCoexistenceCharacterSetXRule.
	 * forCorporateActionMovementReversalAdviceV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementReversalAdviceV06> forCorporateActionMovementReversalAdviceV06 = new MMConstraint<CorporateActionMovementReversalAdviceV06>() {
		{
			validator = ConstraintCoexistenceCharacterSetXRule::checkCorporateActionMovementReversalAdviceV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetXRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in all text fields must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR LF.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forCorporateActionMovementReversalAdviceV05;
			owner_lazy = () -> CorporateActionMovementReversalAdviceV06.mmObject();
		}
	};

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * (except AdditionalInformation/AdditionalInformation) must correspond to
	 * ISO 15022 character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR
	 * LF.
	 */
	public static void checkCorporateActionNarrativeV03(CorporateActionNarrativeV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesMessageCancellationAdviceV04(SecuritiesMessageCancellationAdviceV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkIntraPositionMovementInstructionV03(IntraPositionMovementInstructionV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesBalanceCustodyReportV08(SecuritiesBalanceCustodyReportV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesStatementQueryV05(SecuritiesStatementQueryV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesBalanceAccountingReportV08(SecuritiesBalanceAccountingReportV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesSettlementTransactionAuditTrailReportV02(SecuritiesSettlementTransactionAuditTrailReportV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesSettlementAllegementRemovalAdviceV03(SecuritiesSettlementAllegementRemovalAdviceV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesStatusOrStatementQueryStatusAdviceV03(SecuritiesStatusOrStatementQueryStatusAdviceV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesTransactionStatusQueryV03(SecuritiesTransactionStatusQueryV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesTransactionCancellationRequestV04(SecuritiesTransactionCancellationRequestV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesTransactionCancellationRequestStatusAdviceV04(SecuritiesTransactionCancellationRequestStatusAdviceV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesSettlementConditionModificationStatusAdviceV06(SecuritiesSettlementConditionModificationStatusAdviceV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesSettlementTransactionAuditTrailReportV01(SecuritiesSettlementTransactionAuditTrailReportV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkIntraPositionMovementConfirmationV01(IntraPositionMovementConfirmationV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkIntraPositionMovementConfirmationV02(IntraPositionMovementConfirmationV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkIntraPositionMovementConfirmationV03(IntraPositionMovementConfirmationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkIntraPositionMovementConfirmationV04(IntraPositionMovementConfirmationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkIntraPositionMovementPostingReportV01(IntraPositionMovementPostingReportV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkIntraPositionMovementPostingReportV02(IntraPositionMovementPostingReportV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkIntraPositionMovementPostingReportV03(IntraPositionMovementPostingReportV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkIntraPositionMovementPostingReportV04(IntraPositionMovementPostingReportV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesBalanceAccountingReportV03(SecuritiesBalanceAccountingReportV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesBalanceAccountingReportV04(SecuritiesBalanceAccountingReportV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesBalanceAccountingReportV05(SecuritiesBalanceAccountingReportV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesBalanceAccountingReportV06(SecuritiesBalanceAccountingReportV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesBalanceCustodyReportV03(SecuritiesBalanceCustodyReportV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesBalanceCustodyReportV04(SecuritiesBalanceCustodyReportV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesBalanceCustodyReportV05(SecuritiesBalanceCustodyReportV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesBalanceCustodyReportV06(SecuritiesBalanceCustodyReportV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesMessageCancellationAdviceV01(SecuritiesMessageCancellationAdviceV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesMessageCancellationAdviceV02(SecuritiesMessageCancellationAdviceV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesMessageCancellationAdviceV03(SecuritiesMessageCancellationAdviceV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesTransactionPendingReportV01(SecuritiesTransactionPendingReportV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesTransactionPendingReportV02(SecuritiesTransactionPendingReportV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesTransactionPendingReportV03(SecuritiesTransactionPendingReportV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesTransactionPendingReportV04(SecuritiesTransactionPendingReportV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesTransactionPostingReportV01(SecuritiesTransactionPostingReportV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesTransactionPostingReportV02(SecuritiesTransactionPostingReportV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesTransactionPostingReportV03(SecuritiesTransactionPostingReportV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesTransactionPostingReportV04(SecuritiesTransactionPostingReportV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkIntraPositionMovementInstructionV01(IntraPositionMovementInstructionV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkIntraPositionMovementInstructionV02(IntraPositionMovementInstructionV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkIntraPositionMovementStatusAdviceV01(IntraPositionMovementStatusAdviceV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkIntraPositionMovementStatusAdviceV02(IntraPositionMovementStatusAdviceV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesSettlementTransactionAllegementReportV01(SecuritiesSettlementTransactionAllegementReportV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesSettlementTransactionAllegementReportV02(SecuritiesSettlementTransactionAllegementReportV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesStatementQueryV01(SecuritiesStatementQueryV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesStatementQueryV02(SecuritiesStatementQueryV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesSettlementTransactionAllegementReportV03(SecuritiesSettlementTransactionAllegementReportV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesStatementQueryV03(SecuritiesStatementQueryV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkIntraPositionMovementStatusAdviceV03(IntraPositionMovementStatusAdviceV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesTransactionPendingReportV05(SecuritiesTransactionPendingReportV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesTransactionPostingReportV05(SecuritiesTransactionPostingReportV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesBalanceCustodyReportV07(SecuritiesBalanceCustodyReportV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesBalanceAccountingReportV07(SecuritiesBalanceAccountingReportV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesSettlementTransactionAllegementReportV04(SecuritiesSettlementTransactionAllegementReportV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesStatementQueryV04(SecuritiesStatementQueryV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesTransactionPendingReportV06(SecuritiesTransactionPendingReportV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesFinancingConfirmationV01(SecuritiesFinancingConfirmationV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesFinancingConfirmationV02(SecuritiesFinancingConfirmationV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesFinancingConfirmationV03(SecuritiesFinancingConfirmationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesFinancingConfirmationV04(SecuritiesFinancingConfirmationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesFinancingInstructionV01(SecuritiesFinancingInstructionV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesFinancingInstructionV02(SecuritiesFinancingInstructionV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesFinancingInstructionV03(SecuritiesFinancingInstructionV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesSettlementConditionModificationStatusAdviceV01(SecuritiesSettlementConditionModificationStatusAdviceV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesSettlementConditionModificationStatusAdviceV02(SecuritiesSettlementConditionModificationStatusAdviceV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesSettlementConditionModificationStatusAdviceV03(SecuritiesSettlementConditionModificationStatusAdviceV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesSettlementConditionModificationStatusAdviceV04(SecuritiesSettlementConditionModificationStatusAdviceV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesSettlementConditionsModificationRequestV01(SecuritiesSettlementConditionsModificationRequestV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesSettlementConditionsModificationRequestV02(SecuritiesSettlementConditionsModificationRequestV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesSettlementConditionsModificationRequestV03(SecuritiesSettlementConditionsModificationRequestV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesSettlementConditionsModificationRequestV04(SecuritiesSettlementConditionsModificationRequestV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesSettlementTransactionConfirmationV01(SecuritiesSettlementTransactionConfirmationV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesSettlementTransactionConfirmationV02(SecuritiesSettlementTransactionConfirmationV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesSettlementTransactionConfirmationV03(SecuritiesSettlementTransactionConfirmationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesSettlementTransactionConfirmationV04(SecuritiesSettlementTransactionConfirmationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesSettlementTransactionGenerationNotificationV01(SecuritiesSettlementTransactionGenerationNotificationV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesSettlementTransactionGenerationNotificationV02(SecuritiesSettlementTransactionGenerationNotificationV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesSettlementTransactionGenerationNotificationV03(SecuritiesSettlementTransactionGenerationNotificationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesSettlementTransactionGenerationNotificationV04(SecuritiesSettlementTransactionGenerationNotificationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesSettlementTransactionInstructionV01(SecuritiesSettlementTransactionInstructionV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesSettlementTransactionInstructionV02(SecuritiesSettlementTransactionInstructionV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesSettlementTransactionInstructionV03(SecuritiesSettlementTransactionInstructionV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesSettlementTransactionInstructionV04(SecuritiesSettlementTransactionInstructionV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesSettlementTransactionStatusAdviceV01(SecuritiesSettlementTransactionStatusAdviceV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesSettlementTransactionStatusAdviceV02(SecuritiesSettlementTransactionStatusAdviceV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesSettlementTransactionStatusAdviceV03(SecuritiesSettlementTransactionStatusAdviceV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesSettlementTransactionStatusAdviceV04(SecuritiesSettlementTransactionStatusAdviceV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesFinancingInstructionV04(SecuritiesFinancingInstructionV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkPortfolioTransferNotificationV01(PortfolioTransferNotificationV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkPortfolioTransferNotificationV02(PortfolioTransferNotificationV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesFinancingModificationInstructionV01(SecuritiesFinancingModificationInstructionV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesFinancingModificationInstructionV02(SecuritiesFinancingModificationInstructionV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesFinancingStatusAdviceV01(SecuritiesFinancingStatusAdviceV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesFinancingStatusAdviceV02(SecuritiesFinancingStatusAdviceV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesSettlementAllegementRemovalAdviceV01(SecuritiesSettlementAllegementRemovalAdviceV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesSettlementAllegementRemovalAdviceV02(SecuritiesSettlementAllegementRemovalAdviceV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesSettlementTransactionAllegementNotificationV01(SecuritiesSettlementTransactionAllegementNotificationV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesSettlementTransactionAllegementNotificationV02(SecuritiesSettlementTransactionAllegementNotificationV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesSettlementTransactionReversalAdviceV01(SecuritiesSettlementTransactionReversalAdviceV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesSettlementTransactionReversalAdviceV02(SecuritiesSettlementTransactionReversalAdviceV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesStatusOrStatementQueryStatusAdviceV01(SecuritiesStatusOrStatementQueryStatusAdviceV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesStatusOrStatementQueryStatusAdviceV02(SecuritiesStatusOrStatementQueryStatusAdviceV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesTransactionCancellationRequestStatusAdviceV01(SecuritiesTransactionCancellationRequestStatusAdviceV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesTransactionCancellationRequestStatusAdviceV02(SecuritiesTransactionCancellationRequestStatusAdviceV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesTransactionCancellationRequestV01(SecuritiesTransactionCancellationRequestV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesTransactionCancellationRequestV02(SecuritiesTransactionCancellationRequestV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesTransactionStatusQueryV01(SecuritiesTransactionStatusQueryV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesTransactionStatusQueryV02(SecuritiesTransactionStatusQueryV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesFinancingModificationInstructionV03(SecuritiesFinancingModificationInstructionV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesFinancingStatusAdviceV03(SecuritiesFinancingStatusAdviceV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesSettlementTransactionAllegementNotificationV03(SecuritiesSettlementTransactionAllegementNotificationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesSettlementTransactionReversalAdviceV03(SecuritiesSettlementTransactionReversalAdviceV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesTransactionCancellationRequestV03(SecuritiesTransactionCancellationRequestV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesTransactionCancellationRequestStatusAdviceV03(SecuritiesTransactionCancellationRequestStatusAdviceV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkPortfolioTransferNotificationV03(PortfolioTransferNotificationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesSettlementTransactionAllegementNotificationV04(SecuritiesSettlementTransactionAllegementNotificationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesFinancingStatusAdviceV04(SecuritiesFinancingStatusAdviceV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesFinancingConfirmationV05(SecuritiesFinancingConfirmationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesSettlementTransactionGenerationNotificationV05(SecuritiesSettlementTransactionGenerationNotificationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesSettlementTransactionReversalAdviceV04(SecuritiesSettlementTransactionReversalAdviceV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesFinancingInstructionV05(SecuritiesFinancingInstructionV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesSettlementTransactionInstructionV05(SecuritiesSettlementTransactionInstructionV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesSettlementTransactionConfirmationV05(SecuritiesSettlementTransactionConfirmationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesSettlementConditionModificationStatusAdviceV05(SecuritiesSettlementConditionModificationStatusAdviceV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesFinancingModificationInstructionV04(SecuritiesFinancingModificationInstructionV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesSettlementConditionsModificationRequestV05(SecuritiesSettlementConditionsModificationRequestV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesSettlementTransactionStatusAdviceV05(SecuritiesSettlementTransactionStatusAdviceV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesFinancingStatusAdviceV05(SecuritiesFinancingStatusAdviceV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkSecuritiesSettlementTransactionStatusAdviceV06(SecuritiesSettlementTransactionStatusAdviceV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkCorporateActionCancellationAdviceV01(CorporateActionCancellationAdviceV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkCorporateActionCancellationAdviceV02(CorporateActionCancellationAdviceV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkCorporateActionCancellationAdviceV03(CorporateActionCancellationAdviceV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkCorporateActionCancellationAdviceV04(CorporateActionCancellationAdviceV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkCorporateActionEventProcessingStatusAdviceV01(CorporateActionEventProcessingStatusAdviceV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkCorporateActionEventProcessingStatusAdviceV02(CorporateActionEventProcessingStatusAdviceV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkCorporateActionEventProcessingStatusAdviceV03(CorporateActionEventProcessingStatusAdviceV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkCorporateActionEventProcessingStatusAdviceV04(CorporateActionEventProcessingStatusAdviceV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkCorporateActionInstructionV01(CorporateActionInstructionV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkCorporateActionInstructionV02(CorporateActionInstructionV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkCorporateActionInstructionV03(CorporateActionInstructionV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkCorporateActionInstructionV04(CorporateActionInstructionV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkCorporateActionInstructionCancellationRequestV01(CorporateActionInstructionCancellationRequestV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkCorporateActionInstructionCancellationRequestV02(CorporateActionInstructionCancellationRequestV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkCorporateActionInstructionCancellationRequestV03(CorporateActionInstructionCancellationRequestV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkCorporateActionInstructionCancellationRequestV04(CorporateActionInstructionCancellationRequestV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkCorporateActionInstructionCancellationRequestStatusAdviceV01(CorporateActionInstructionCancellationRequestStatusAdviceV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkCorporateActionInstructionCancellationRequestStatusAdviceV02(CorporateActionInstructionCancellationRequestStatusAdviceV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkCorporateActionInstructionCancellationRequestStatusAdviceV03(CorporateActionInstructionCancellationRequestStatusAdviceV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkCorporateActionInstructionCancellationRequestStatusAdviceV04(CorporateActionInstructionCancellationRequestStatusAdviceV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkCorporateActionInstructionStatementReportV01(CorporateActionInstructionStatementReportV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkCorporateActionInstructionStatementReportV02(CorporateActionInstructionStatementReportV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkCorporateActionInstructionStatementReportV03(CorporateActionInstructionStatementReportV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkCorporateActionInstructionStatementReportV04(CorporateActionInstructionStatementReportV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkCorporateActionInstructionStatusAdviceV01(CorporateActionInstructionStatusAdviceV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkCorporateActionInstructionStatusAdviceV02(CorporateActionInstructionStatusAdviceV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkCorporateActionInstructionStatusAdviceV03(CorporateActionInstructionStatusAdviceV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkCorporateActionInstructionStatusAdviceV04(CorporateActionInstructionStatusAdviceV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkCorporateActionMovementConfirmationV01(CorporateActionMovementConfirmationV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkCorporateActionMovementConfirmationV02(CorporateActionMovementConfirmationV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkCorporateActionMovementConfirmationV03(CorporateActionMovementConfirmationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkCorporateActionMovementConfirmationV04(CorporateActionMovementConfirmationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkCorporateActionMovementPreliminaryAdviceV01(CorporateActionMovementPreliminaryAdviceV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkCorporateActionMovementPreliminaryAdviceV02(CorporateActionMovementPreliminaryAdviceV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkCorporateActionMovementPreliminaryAdviceV03(CorporateActionMovementPreliminaryAdviceV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkCorporateActionMovementPreliminaryAdviceV04(CorporateActionMovementPreliminaryAdviceV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all fields must
	 * correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { }
	 * CR LF.
	 */
	public static void checkCorporateActionMovementPreliminaryAdviceCancellationAdviceV01(CorporateActionMovementPreliminaryAdviceCancellationAdviceV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all fields must
	 * correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { }
	 * CR LF.
	 */
	public static void checkCorporateActionMovementPreliminaryAdviceCancellationAdviceV02(CorporateActionMovementPreliminaryAdviceCancellationAdviceV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all fields must
	 * correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { }
	 * CR LF.
	 */
	public static void checkCorporateActionMovementPreliminaryAdviceCancellationAdviceV03(CorporateActionMovementPreliminaryAdviceCancellationAdviceV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all fields must
	 * correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { }
	 * CR LF.
	 */
	public static void checkCorporateActionMovementPreliminaryAdviceCancellationAdviceV04(CorporateActionMovementPreliminaryAdviceCancellationAdviceV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkCorporateActionMovementReversalAdviceV01(CorporateActionMovementReversalAdviceV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkCorporateActionMovementReversalAdviceV02(CorporateActionMovementReversalAdviceV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkCorporateActionMovementReversalAdviceV03(CorporateActionMovementReversalAdviceV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkCorporateActionMovementReversalAdviceV04(CorporateActionMovementReversalAdviceV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * (except for
	 * CorporateActionDetails/CorporateActionAdditionalInformation/URLAddress)
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkCorporateActionNotificationV01(CorporateActionNotificationV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * (except for
	 * CorporateActionDetails/CorporateActionAdditionalInformation/URLAddress)
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkCorporateActionNotificationV02(CorporateActionNotificationV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * (except for
	 * CorporateActionDetails/CorporateActionAdditionalInformation/URLAddress)
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkCorporateActionNotificationV03(CorporateActionNotificationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * (except for
	 * CorporateActionDetails/CorporateActionAdditionalInformation/URLAddress)
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkCorporateActionNotificationV04(CorporateActionNotificationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * (except AdditionalInformation/AdditionalInformation) must correspond to
	 * ISO 15022 character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR
	 * LF.
	 */
	public static void checkCorporateActionNarrativeV01(CorporateActionNarrativeV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * (except AdditionalInformation/AdditionalInformation) must correspond to
	 * ISO 15022 character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { } CR
	 * LF.
	 */
	public static void checkCorporateActionNarrativeV02(CorporateActionNarrativeV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all fields must
	 * correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + { }
	 * CR LF.
	 */
	public static void checkCorporateActionMovementPreliminaryAdviceCancellationAdviceV05(CorporateActionMovementPreliminaryAdviceCancellationAdviceV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkCorporateActionCancellationAdviceV05(CorporateActionCancellationAdviceV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkCorporateActionMovementConfirmationV05(CorporateActionMovementConfirmationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * (except for
	 * CorporateActionDetails/CorporateActionAdditionalInformation/URLAddress)
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkCorporateActionNotificationV05(CorporateActionNotificationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkCorporateActionInstructionStatusAdviceV05(CorporateActionInstructionStatusAdviceV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkCorporateActionMovementPreliminaryAdviceV05(CorporateActionMovementPreliminaryAdviceV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkCorporateActionInstructionV05(CorporateActionInstructionV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkCorporateActionMovementReversalAdviceV05(CorporateActionMovementReversalAdviceV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkCorporateActionInstructionCancellationRequestV05(CorporateActionInstructionCancellationRequestV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkCorporateActionMovementConfirmationV06(CorporateActionMovementConfirmationV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkCorporateActionInstructionCancellationRequestStatusAdviceV05(CorporateActionInstructionCancellationRequestStatusAdviceV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkCorporateActionInstructionStatusAdviceV06(CorporateActionInstructionStatusAdviceV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkCorporateActionMovementPreliminaryAdviceV06(CorporateActionMovementPreliminaryAdviceV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in all text fields
	 * must correspond to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ +
	 * { } CR LF.
	 */
	public static void checkCorporateActionMovementReversalAdviceV06(CorporateActionMovementReversalAdviceV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}