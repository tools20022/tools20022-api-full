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
import com.tools20022.repository.area.seev.SecuritiesTransactionPendingReport002V08;
import com.tools20022.repository.area.seev.SecuritiesTransactionPostingReport002V07;
import com.tools20022.repository.area.semt.*;
import com.tools20022.repository.area.sese.*;
import java.util.Arrays;

/**
 * The Securities Market Practice Group (SMPG) has published market practice
 * recommendations on the use of this message.<br>
 * These market practices are available on www.smpg.info.
 */
public class ConstraintSecuritiesMarketPracticeGroupGuideline {

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
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceAccountingReportV03> for_semt_SecuritiesBalanceAccountingReportV03 = new MMConstraint<SecuritiesBalanceAccountingReportV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
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
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_semt_SecuritiesBalanceCustodyReportV07
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_semt_SecuritiesBalanceCustodyReportV07}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceCustodyReportV06> for_semt_SecuritiesBalanceCustodyReportV06 = new MMConstraint<SecuritiesBalanceCustodyReportV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_semt_SecuritiesBalanceCustodyReportV07);
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
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionStatusAdviceV02> for_sese_SecuritiesSettlementTransactionStatusAdviceV02 = new MMConstraint<SecuritiesSettlementTransactionStatusAdviceV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
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
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmation002V08
	 * SecuritiesSettlementTransactionConfirmation002V08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmation002V08> for_sese_SecuritiesSettlementTransactionConfirmation002V08 = new MMConstraint<SecuritiesSettlementTransactionConfirmation002V08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesSettlementTransactionConfirmation002V08.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionConfirmation002V08 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionConfirmation002V08(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReport002V09
	 * SecuritiesBalanceCustodyReport002V09}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceCustodyReport002V09> for_semt_SecuritiesBalanceCustodyReport002V09 = new MMConstraint<SecuritiesBalanceCustodyReport002V09>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesBalanceCustodyReport002V09.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesBalanceCustodyReport002V09 obj) throws Exception {
			check_semt_SecuritiesBalanceCustodyReport002V09(obj);
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
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceCustodyReportV04> for_semt_SecuritiesBalanceCustodyReportV04 = new MMConstraint<SecuritiesBalanceCustodyReportV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
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
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReport002V07
	 * SecuritiesTransactionPendingReport002V07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionPendingReport002V07> for_semt_SecuritiesTransactionPendingReport002V07 = new MMConstraint<SecuritiesTransactionPendingReport002V07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesTransactionPendingReport002V07.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTransactionPendingReport002V07 obj) throws Exception {
			check_semt_SecuritiesTransactionPendingReport002V07(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotification002V06
	 * SecuritiesSettlementTransactionAllegementNotification002V06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionAllegementNotification002V06> for_sese_SecuritiesSettlementTransactionAllegementNotification002V06 = new MMConstraint<SecuritiesSettlementTransactionAllegementNotification002V06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesSettlementTransactionAllegementNotification002V06.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionAllegementNotification002V06 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionAllegementNotification002V06(obj);
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
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceCustodyReportV05> for_semt_SecuritiesBalanceCustodyReportV05 = new MMConstraint<SecuritiesBalanceCustodyReportV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
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
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequest002V07
	 * SecuritiesSettlementConditionsModificationRequest002V07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementConditionsModificationRequest002V07> for_sese_SecuritiesSettlementConditionsModificationRequest002V07 = new MMConstraint<SecuritiesSettlementConditionsModificationRequest002V07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesSettlementConditionsModificationRequest002V07.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementConditionsModificationRequest002V07 obj) throws Exception {
			check_sese_SecuritiesSettlementConditionsModificationRequest002V07(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V06
	 * SecuritiesSettlementTransactionInstruction002V06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstruction002V06> for_sese_SecuritiesSettlementTransactionInstruction002V06 = new MMConstraint<SecuritiesSettlementTransactionInstruction002V06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesSettlementTransactionInstruction002V06.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionInstruction002V06 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionInstruction002V06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV09
	 * SecuritiesTransactionPendingReportV09}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_semt_SecuritiesTransactionPendingReportV08
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_semt_SecuritiesTransactionPendingReportV08}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionPendingReportV09> for_semt_SecuritiesTransactionPendingReportV09 = new MMConstraint<SecuritiesTransactionPendingReportV09>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_semt_SecuritiesTransactionPendingReportV08;
			owner_lazy = () -> SecuritiesTransactionPendingReportV09.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTransactionPendingReportV09 obj) throws Exception {
			check_semt_SecuritiesTransactionPendingReportV09(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV06
	 * SecuritiesTransactionPostingReportV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_semt_SecuritiesTransactionPostingReportV07
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_semt_SecuritiesTransactionPostingReportV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_semt_SecuritiesTransactionPostingReportV05
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_semt_SecuritiesTransactionPostingReportV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionPostingReportV06> for_semt_SecuritiesTransactionPostingReportV06 = new MMConstraint<SecuritiesTransactionPostingReportV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_semt_SecuritiesTransactionPostingReportV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_semt_SecuritiesTransactionPostingReportV05;
			owner_lazy = () -> SecuritiesTransactionPostingReportV06.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTransactionPostingReportV06 obj) throws Exception {
			check_semt_SecuritiesTransactionPostingReportV06(obj);
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
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceCustodyReportV03> for_semt_SecuritiesBalanceCustodyReportV03 = new MMConstraint<SecuritiesBalanceCustodyReportV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
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
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_sese_SecuritiesTransactionCancellationRequestStatusAdviceV04
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_sese_SecuritiesTransactionCancellationRequestStatusAdviceV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionCancellationRequestStatusAdviceV03> for_sese_SecuritiesTransactionCancellationRequestStatusAdviceV03 = new MMConstraint<SecuritiesTransactionCancellationRequestStatusAdviceV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_sese_SecuritiesTransactionCancellationRequestStatusAdviceV04);
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
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV07
	 * SecuritiesSettlementTransactionStatusAdviceV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_sese_SecuritiesSettlementTransactionStatusAdviceV08
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_sese_SecuritiesSettlementTransactionStatusAdviceV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_sese_SecuritiesSettlementTransactionStatusAdviceV06
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_sese_SecuritiesSettlementTransactionStatusAdviceV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionStatusAdviceV07> for_sese_SecuritiesSettlementTransactionStatusAdviceV07 = new MMConstraint<SecuritiesSettlementTransactionStatusAdviceV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_sese_SecuritiesSettlementTransactionStatusAdviceV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_sese_SecuritiesSettlementTransactionStatusAdviceV06;
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
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV06
	 * SecuritiesTransactionPendingReportV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_semt_SecuritiesTransactionPendingReportV07
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_semt_SecuritiesTransactionPendingReportV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_semt_SecuritiesTransactionPendingReportV05
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_semt_SecuritiesTransactionPendingReportV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionPendingReportV06> for_semt_SecuritiesTransactionPendingReportV06 = new MMConstraint<SecuritiesTransactionPendingReportV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_semt_SecuritiesTransactionPendingReportV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_semt_SecuritiesTransactionPendingReportV05;
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
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_sese_SecuritiesTransactionCancellationRequestStatusAdviceV05
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_sese_SecuritiesTransactionCancellationRequestStatusAdviceV05}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_sese_SecuritiesTransactionCancellationRequestStatusAdviceV03
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_sese_SecuritiesTransactionCancellationRequestStatusAdviceV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionCancellationRequestStatusAdviceV04> for_sese_SecuritiesTransactionCancellationRequestStatusAdviceV04 = new MMConstraint<SecuritiesTransactionCancellationRequestStatusAdviceV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_sese_SecuritiesTransactionCancellationRequestStatusAdviceV05);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_sese_SecuritiesTransactionCancellationRequestStatusAdviceV03;
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
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_sese_PortfolioTransferNotificationV04
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_sese_PortfolioTransferNotificationV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PortfolioTransferNotificationV03> for_sese_PortfolioTransferNotificationV03 = new MMConstraint<PortfolioTransferNotificationV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_sese_PortfolioTransferNotificationV04);
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
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV08
	 * SecuritiesSettlementTransactionInstructionV08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_sese_SecuritiesSettlementTransactionInstructionV07
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_sese_SecuritiesSettlementTransactionInstructionV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV08> for_sese_SecuritiesSettlementTransactionInstructionV08 = new MMConstraint<SecuritiesSettlementTransactionInstructionV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_sese_SecuritiesSettlementTransactionInstructionV07;
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV08.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionInstructionV08 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionInstructionV08(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV09
	 * SecuritiesBalanceCustodyReportV09}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_semt_SecuritiesBalanceCustodyReportV08
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_semt_SecuritiesBalanceCustodyReportV08}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceCustodyReportV09> for_semt_SecuritiesBalanceCustodyReportV09 = new MMConstraint<SecuritiesBalanceCustodyReportV09>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_semt_SecuritiesBalanceCustodyReportV08;
			owner_lazy = () -> SecuritiesBalanceCustodyReportV09.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesBalanceCustodyReportV09 obj) throws Exception {
			check_semt_SecuritiesBalanceCustodyReportV09(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferNotificationV04
	 * PortfolioTransferNotificationV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_sese_PortfolioTransferNotificationV05
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_sese_PortfolioTransferNotificationV05}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_sese_PortfolioTransferNotificationV03
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_sese_PortfolioTransferNotificationV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<PortfolioTransferNotificationV04> for_sese_PortfolioTransferNotificationV04 = new MMConstraint<PortfolioTransferNotificationV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_sese_PortfolioTransferNotificationV05);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_sese_PortfolioTransferNotificationV03;
			owner_lazy = () -> PortfolioTransferNotificationV04.mmObject();
		}

		@Override
		public void executeValidator(PortfolioTransferNotificationV04 obj) throws Exception {
			check_sese_PortfolioTransferNotificationV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReport002V08
	 * SecuritiesTransactionPostingReport002V08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionPostingReport002V08> for_semt_SecuritiesTransactionPostingReport002V08 = new MMConstraint<SecuritiesTransactionPostingReport002V08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesTransactionPostingReport002V08.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTransactionPostingReport002V08 obj) throws Exception {
			check_semt_SecuritiesTransactionPostingReport002V08(obj);
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
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_sese_SecuritiesSettlementTransactionConfirmationV05
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_sese_SecuritiesSettlementTransactionConfirmationV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmationV04> for_sese_SecuritiesSettlementTransactionConfirmationV04 = new MMConstraint<SecuritiesSettlementTransactionConfirmationV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_sese_SecuritiesSettlementTransactionConfirmationV05);
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
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferNotification002V05
	 * PortfolioTransferNotification002V05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PortfolioTransferNotification002V05> for_sese_PortfolioTransferNotification002V05 = new MMConstraint<PortfolioTransferNotification002V05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> PortfolioTransferNotification002V05.mmObject();
		}

		@Override
		public void executeValidator(PortfolioTransferNotification002V05 obj) throws Exception {
			check_sese_PortfolioTransferNotification002V05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequest002V06
	 * SecuritiesSettlementConditionsModificationRequest002V06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementConditionsModificationRequest002V06> for_sese_SecuritiesSettlementConditionsModificationRequest002V06 = new MMConstraint<SecuritiesSettlementConditionsModificationRequest002V06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesSettlementConditionsModificationRequest002V06.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementConditionsModificationRequest002V06 obj) throws Exception {
			check_sese_SecuritiesSettlementConditionsModificationRequest002V06(obj);
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
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_sese_SecuritiesFinancingInstructionV05
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_sese_SecuritiesFinancingInstructionV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingInstructionV04> for_sese_SecuritiesFinancingInstructionV04 = new MMConstraint<SecuritiesFinancingInstructionV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_sese_SecuritiesFinancingInstructionV05);
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
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferNotificationV05
	 * PortfolioTransferNotificationV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_sese_PortfolioTransferNotificationV04
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_sese_PortfolioTransferNotificationV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<PortfolioTransferNotificationV05> for_sese_PortfolioTransferNotificationV05 = new MMConstraint<PortfolioTransferNotificationV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_sese_PortfolioTransferNotificationV04;
			owner_lazy = () -> PortfolioTransferNotificationV05.mmObject();
		}

		@Override
		public void executeValidator(PortfolioTransferNotificationV05 obj) throws Exception {
			check_sese_PortfolioTransferNotificationV05(obj);
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
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_semt_SecuritiesBalanceAccountingReportV09
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_semt_SecuritiesBalanceAccountingReportV09}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_semt_SecuritiesBalanceAccountingReportV07
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_semt_SecuritiesBalanceAccountingReportV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceAccountingReportV08> for_semt_SecuritiesBalanceAccountingReportV08 = new MMConstraint<SecuritiesBalanceAccountingReportV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_semt_SecuritiesBalanceAccountingReportV09);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_semt_SecuritiesBalanceAccountingReportV07;
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
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionPendingReportV03> for_semt_SecuritiesTransactionPendingReportV03 = new MMConstraint<SecuritiesTransactionPendingReportV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
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
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV05
	 * SecuritiesSettlementTransactionAllegementNotificationV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_sese_SecuritiesSettlementTransactionAllegementNotificationV06
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_sese_SecuritiesSettlementTransactionAllegementNotificationV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_sese_SecuritiesSettlementTransactionAllegementNotificationV04
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_sese_SecuritiesSettlementTransactionAllegementNotificationV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV05> for_sese_SecuritiesSettlementTransactionAllegementNotificationV05 = new MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_sese_SecuritiesSettlementTransactionAllegementNotificationV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_sese_SecuritiesSettlementTransactionAllegementNotificationV04;
			owner_lazy = () -> SecuritiesSettlementTransactionAllegementNotificationV05.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionAllegementNotificationV05 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionAllegementNotificationV05(obj);
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionStatusAdvice002V09> for_sese_SecuritiesSettlementTransactionStatusAdvice002V09 = new MMConstraint<SecuritiesSettlementTransactionStatusAdvice002V09>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
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
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstruction002V07
	 * SecuritiesFinancingInstruction002V07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingInstruction002V07> for_sese_SecuritiesFinancingInstruction002V07 = new MMConstraint<SecuritiesFinancingInstruction002V07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesFinancingInstruction002V07.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesFinancingInstruction002V07 obj) throws Exception {
			check_sese_SecuritiesFinancingInstruction002V07(obj);
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
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_semt_SecuritiesTransactionPostingReportV05
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_semt_SecuritiesTransactionPostingReportV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionPostingReportV04> for_semt_SecuritiesTransactionPostingReportV04 = new MMConstraint<SecuritiesTransactionPostingReportV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_semt_SecuritiesTransactionPostingReportV05);
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
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReport002V06
	 * SecuritiesTransactionPostingReport002V06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionPostingReport002V06> for_semt_SecuritiesTransactionPostingReport002V06 = new MMConstraint<SecuritiesTransactionPostingReport002V06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesTransactionPostingReport002V06.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTransactionPostingReport002V06 obj) throws Exception {
			check_semt_SecuritiesTransactionPostingReport002V06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.SecuritiesTransactionPendingReport002V08
	 * SecuritiesTransactionPendingReport002V08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionPendingReport002V08> for_seev_SecuritiesTransactionPendingReport002V08 = new MMConstraint<SecuritiesTransactionPendingReport002V08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesTransactionPendingReport002V08.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTransactionPendingReport002V08 obj) throws Exception {
			check_seev_SecuritiesTransactionPendingReport002V08(obj);
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
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionCancellationRequestStatusAdviceV01> for_sese_SecuritiesTransactionCancellationRequestStatusAdviceV01 = new MMConstraint<SecuritiesTransactionCancellationRequestStatusAdviceV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
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
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV03> for_sese_SecuritiesSettlementTransactionInstructionV03 = new MMConstraint<SecuritiesSettlementTransactionInstructionV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
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
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV05
	 * SecuritiesFinancingInstructionV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_sese_SecuritiesFinancingInstructionV06
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_sese_SecuritiesFinancingInstructionV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_sese_SecuritiesFinancingInstructionV04
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_sese_SecuritiesFinancingInstructionV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingInstructionV05> for_sese_SecuritiesFinancingInstructionV05 = new MMConstraint<SecuritiesFinancingInstructionV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_sese_SecuritiesFinancingInstructionV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_sese_SecuritiesFinancingInstructionV04;
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
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_semt_SecuritiesBalanceCustodyReportV08
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_semt_SecuritiesBalanceCustodyReportV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_semt_SecuritiesBalanceCustodyReportV06
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_semt_SecuritiesBalanceCustodyReportV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceCustodyReportV07> for_semt_SecuritiesBalanceCustodyReportV07 = new MMConstraint<SecuritiesBalanceCustodyReportV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_semt_SecuritiesBalanceCustodyReportV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_semt_SecuritiesBalanceCustodyReportV06;
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
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_sese_SecuritiesSettlementTransactionAllegementNotificationV05
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_sese_SecuritiesSettlementTransactionAllegementNotificationV05}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_sese_SecuritiesSettlementTransactionAllegementNotificationV03
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_sese_SecuritiesSettlementTransactionAllegementNotificationV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV04> for_sese_SecuritiesSettlementTransactionAllegementNotificationV04 = new MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_sese_SecuritiesSettlementTransactionAllegementNotificationV05);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_sese_SecuritiesSettlementTransactionAllegementNotificationV03;
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
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV01
	 * SecuritiesSettlementTransactionConfirmationV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmationV01> for_sese_SecuritiesSettlementTransactionConfirmationV01 = new MMConstraint<SecuritiesSettlementTransactionConfirmationV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
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
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_sese_SecuritiesSettlementTransactionInstructionV06
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_sese_SecuritiesSettlementTransactionInstructionV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_sese_SecuritiesSettlementTransactionInstructionV04
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_sese_SecuritiesSettlementTransactionInstructionV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV05> for_sese_SecuritiesSettlementTransactionInstructionV05 = new MMConstraint<SecuritiesSettlementTransactionInstructionV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_sese_SecuritiesSettlementTransactionInstructionV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_sese_SecuritiesSettlementTransactionInstructionV04;
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
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_semt_SecuritiesTransactionPendingReportV06
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_semt_SecuritiesTransactionPendingReportV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_semt_SecuritiesTransactionPendingReportV04
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_semt_SecuritiesTransactionPendingReportV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionPendingReportV05> for_semt_SecuritiesTransactionPendingReportV05 = new MMConstraint<SecuritiesTransactionPendingReportV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_semt_SecuritiesTransactionPendingReportV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_semt_SecuritiesTransactionPendingReportV04;
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
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV03
	 * SecuritiesTransactionPostingReportV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionPostingReportV03> for_semt_SecuritiesTransactionPostingReportV03 = new MMConstraint<SecuritiesTransactionPostingReportV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
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
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReport002V09
	 * SecuritiesTransactionPendingReport002V09}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionPendingReport002V09> for_semt_SecuritiesTransactionPendingReport002V09 = new MMConstraint<SecuritiesTransactionPendingReport002V09>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesTransactionPendingReport002V09.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTransactionPendingReport002V09 obj) throws Exception {
			check_semt_SecuritiesTransactionPendingReport002V09(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmation002V06
	 * SecuritiesSettlementTransactionConfirmation002V06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmation002V06> for_sese_SecuritiesSettlementTransactionConfirmation002V06 = new MMConstraint<SecuritiesSettlementTransactionConfirmation002V06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesSettlementTransactionConfirmation002V06.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionConfirmation002V06 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionConfirmation002V06(obj);
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
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_semt_SecuritiesBalanceCustodyReportV09
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_semt_SecuritiesBalanceCustodyReportV09}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_semt_SecuritiesBalanceCustodyReportV07
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_semt_SecuritiesBalanceCustodyReportV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceCustodyReportV08> for_semt_SecuritiesBalanceCustodyReportV08 = new MMConstraint<SecuritiesBalanceCustodyReportV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_semt_SecuritiesBalanceCustodyReportV09);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_semt_SecuritiesBalanceCustodyReportV07;
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
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdvice002V07
	 * SecuritiesSettlementTransactionStatusAdvice002V07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionStatusAdvice002V07> for_sese_SecuritiesSettlementTransactionStatusAdvice002V07 = new MMConstraint<SecuritiesSettlementTransactionStatusAdvice002V07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
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
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdviceV05
	 * SecuritiesTransactionCancellationRequestStatusAdviceV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_sese_SecuritiesTransactionCancellationRequestStatusAdviceV04
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_sese_SecuritiesTransactionCancellationRequestStatusAdviceV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionCancellationRequestStatusAdviceV05> for_sese_SecuritiesTransactionCancellationRequestStatusAdviceV05 = new MMConstraint<SecuritiesTransactionCancellationRequestStatusAdviceV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_sese_SecuritiesTransactionCancellationRequestStatusAdviceV04;
			owner_lazy = () -> SecuritiesTransactionCancellationRequestStatusAdviceV05.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTransactionCancellationRequestStatusAdviceV05 obj) throws Exception {
			check_sese_SecuritiesTransactionCancellationRequestStatusAdviceV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV07
	 * SecuritiesTransactionPendingReportV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_semt_SecuritiesTransactionPendingReportV08
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_semt_SecuritiesTransactionPendingReportV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_semt_SecuritiesTransactionPendingReportV06
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_semt_SecuritiesTransactionPendingReportV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionPendingReportV07> for_semt_SecuritiesTransactionPendingReportV07 = new MMConstraint<SecuritiesTransactionPendingReportV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_semt_SecuritiesTransactionPendingReportV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_semt_SecuritiesTransactionPendingReportV06;
			owner_lazy = () -> SecuritiesTransactionPendingReportV07.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTransactionPendingReportV07 obj) throws Exception {
			check_semt_SecuritiesTransactionPendingReportV07(obj);
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
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementConditionsModificationRequestV01> for_sese_SecuritiesSettlementConditionsModificationRequestV01 = new MMConstraint<SecuritiesSettlementConditionsModificationRequestV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
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
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV06
	 * SecuritiesSettlementConditionsModificationRequestV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_sese_SecuritiesSettlementConditionsModificationRequestV07
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_sese_SecuritiesSettlementConditionsModificationRequestV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_sese_SecuritiesSettlementConditionsModificationRequestV05
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_sese_SecuritiesSettlementConditionsModificationRequestV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementConditionsModificationRequestV06> for_sese_SecuritiesSettlementConditionsModificationRequestV06 = new MMConstraint<SecuritiesSettlementConditionsModificationRequestV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_sese_SecuritiesSettlementConditionsModificationRequestV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_sese_SecuritiesSettlementConditionsModificationRequestV05;
			owner_lazy = () -> SecuritiesSettlementConditionsModificationRequestV06.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementConditionsModificationRequestV06 obj) throws Exception {
			check_sese_SecuritiesSettlementConditionsModificationRequestV06(obj);
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
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceAccountingReportV05> for_semt_SecuritiesBalanceAccountingReportV05 = new MMConstraint<SecuritiesBalanceAccountingReportV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
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
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV07
	 * SecuritiesSettlementTransactionInstructionV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_sese_SecuritiesSettlementTransactionInstructionV08
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_sese_SecuritiesSettlementTransactionInstructionV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_sese_SecuritiesSettlementTransactionInstructionV06
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_sese_SecuritiesSettlementTransactionInstructionV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV07> for_sese_SecuritiesSettlementTransactionInstructionV07 = new MMConstraint<SecuritiesSettlementTransactionInstructionV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_sese_SecuritiesSettlementTransactionInstructionV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_sese_SecuritiesSettlementTransactionInstructionV06;
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV07.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionInstructionV07 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionInstructionV07(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.SecuritiesTransactionPostingReport002V07
	 * SecuritiesTransactionPostingReport002V07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionPostingReport002V07> for_seev_SecuritiesTransactionPostingReport002V07 = new MMConstraint<SecuritiesTransactionPostingReport002V07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesTransactionPostingReport002V07.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTransactionPostingReport002V07 obj) throws Exception {
			check_seev_SecuritiesTransactionPostingReport002V07(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV06
	 * SecuritiesSettlementTransactionConfirmationV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_sese_SecuritiesSettlementTransactionConfirmationV07
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_sese_SecuritiesSettlementTransactionConfirmationV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_sese_SecuritiesSettlementTransactionConfirmationV05
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_sese_SecuritiesSettlementTransactionConfirmationV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmationV06> for_sese_SecuritiesSettlementTransactionConfirmationV06 = new MMConstraint<SecuritiesSettlementTransactionConfirmationV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_sese_SecuritiesSettlementTransactionConfirmationV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_sese_SecuritiesSettlementTransactionConfirmationV05;
			owner_lazy = () -> SecuritiesSettlementTransactionConfirmationV06.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionConfirmationV06 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionConfirmationV06(obj);
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
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementConditionsModificationRequestV02> for_sese_SecuritiesSettlementConditionsModificationRequestV02 = new MMConstraint<SecuritiesSettlementConditionsModificationRequestV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
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
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_sese_SecuritiesSettlementTransactionStatusAdviceV05
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_sese_SecuritiesSettlementTransactionStatusAdviceV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionStatusAdviceV04> for_sese_SecuritiesSettlementTransactionStatusAdviceV04 = new MMConstraint<SecuritiesSettlementTransactionStatusAdviceV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_sese_SecuritiesSettlementTransactionStatusAdviceV05);
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
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV01
	 * SecuritiesFinancingInstructionV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingInstructionV01> for_sese_SecuritiesFinancingInstructionV01 = new MMConstraint<SecuritiesFinancingInstructionV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
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
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotification002V05
	 * SecuritiesSettlementTransactionAllegementNotification002V05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionAllegementNotification002V05> for_sese_SecuritiesSettlementTransactionAllegementNotification002V05 = new MMConstraint<SecuritiesSettlementTransactionAllegementNotification002V05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesSettlementTransactionAllegementNotification002V05.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionAllegementNotification002V05 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionAllegementNotification002V05(obj);
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
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionStatusAdviceV03> for_sese_SecuritiesSettlementTransactionStatusAdviceV03 = new MMConstraint<SecuritiesSettlementTransactionStatusAdviceV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
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
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementConditionsModificationRequestV03> for_sese_SecuritiesSettlementConditionsModificationRequestV03 = new MMConstraint<SecuritiesSettlementConditionsModificationRequestV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
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
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionPostingReportV01> for_semt_SecuritiesTransactionPostingReportV01 = new MMConstraint<SecuritiesTransactionPostingReportV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
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
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV07
	 * SecuritiesBalanceAccountingReportV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_semt_SecuritiesBalanceAccountingReportV08
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_semt_SecuritiesBalanceAccountingReportV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_semt_SecuritiesBalanceAccountingReportV06
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_semt_SecuritiesBalanceAccountingReportV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceAccountingReportV07> for_semt_SecuritiesBalanceAccountingReportV07 = new MMConstraint<SecuritiesBalanceAccountingReportV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_semt_SecuritiesBalanceAccountingReportV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_semt_SecuritiesBalanceAccountingReportV06;
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
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV07
	 * SecuritiesSettlementTransactionAllegementNotificationV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_sese_SecuritiesSettlementTransactionAllegementNotificationV06
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_sese_SecuritiesSettlementTransactionAllegementNotificationV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV07> for_sese_SecuritiesSettlementTransactionAllegementNotificationV07 = new MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_sese_SecuritiesSettlementTransactionAllegementNotificationV06;
			owner_lazy = () -> SecuritiesSettlementTransactionAllegementNotificationV07.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionAllegementNotificationV07 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionAllegementNotificationV07(obj);
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
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_sese_SecuritiesSettlementTransactionAllegementNotificationV04
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_sese_SecuritiesSettlementTransactionAllegementNotificationV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV03> for_sese_SecuritiesSettlementTransactionAllegementNotificationV03 = new MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_sese_SecuritiesSettlementTransactionAllegementNotificationV04);
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
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReport002V09
	 * SecuritiesBalanceAccountingReport002V09}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceAccountingReport002V09> for_semt_SecuritiesBalanceAccountingReport002V09 = new MMConstraint<SecuritiesBalanceAccountingReport002V09>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesBalanceAccountingReport002V09.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesBalanceAccountingReport002V09 obj) throws Exception {
			check_semt_SecuritiesBalanceAccountingReport002V09(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV07
	 * SecuritiesTransactionPostingReportV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_semt_SecuritiesTransactionPostingReportV08
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_semt_SecuritiesTransactionPostingReportV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_semt_SecuritiesTransactionPostingReportV06
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_semt_SecuritiesTransactionPostingReportV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionPostingReportV07> for_semt_SecuritiesTransactionPostingReportV07 = new MMConstraint<SecuritiesTransactionPostingReportV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_semt_SecuritiesTransactionPostingReportV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_semt_SecuritiesTransactionPostingReportV06;
			owner_lazy = () -> SecuritiesTransactionPostingReportV07.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTransactionPostingReportV07 obj) throws Exception {
			check_semt_SecuritiesTransactionPostingReportV07(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotification002V07
	 * SecuritiesSettlementTransactionAllegementNotification002V07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionAllegementNotification002V07> for_sese_SecuritiesSettlementTransactionAllegementNotification002V07 = new MMConstraint<SecuritiesSettlementTransactionAllegementNotification002V07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesSettlementTransactionAllegementNotification002V07.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionAllegementNotification002V07 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionAllegementNotification002V07(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV07
	 * SecuritiesFinancingInstructionV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_sese_SecuritiesFinancingInstructionV08
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_sese_SecuritiesFinancingInstructionV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_sese_SecuritiesFinancingInstructionV06
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_sese_SecuritiesFinancingInstructionV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingInstructionV07> for_sese_SecuritiesFinancingInstructionV07 = new MMConstraint<SecuritiesFinancingInstructionV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_sese_SecuritiesFinancingInstructionV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_sese_SecuritiesFinancingInstructionV06;
			owner_lazy = () -> SecuritiesFinancingInstructionV07.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesFinancingInstructionV07 obj) throws Exception {
			check_sese_SecuritiesFinancingInstructionV07(obj);
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
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV01> for_sese_SecuritiesSettlementTransactionAllegementNotificationV01 = new MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
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
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdvice002V08
	 * SecuritiesSettlementTransactionStatusAdvice002V08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionStatusAdvice002V08> for_sese_SecuritiesSettlementTransactionStatusAdvice002V08 = new MMConstraint<SecuritiesSettlementTransactionStatusAdvice002V08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
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
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV04
	 * SecuritiesBalanceAccountingReportV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceAccountingReportV04> for_semt_SecuritiesBalanceAccountingReportV04 = new MMConstraint<SecuritiesBalanceAccountingReportV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
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
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferNotification002V04
	 * PortfolioTransferNotification002V04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PortfolioTransferNotification002V04> for_sese_PortfolioTransferNotification002V04 = new MMConstraint<PortfolioTransferNotification002V04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> PortfolioTransferNotification002V04.mmObject();
		}

		@Override
		public void executeValidator(PortfolioTransferNotification002V04 obj) throws Exception {
			check_sese_PortfolioTransferNotification002V04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV08
	 * SecuritiesTransactionPendingReportV08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_semt_SecuritiesTransactionPendingReportV09
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_semt_SecuritiesTransactionPendingReportV09}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_semt_SecuritiesTransactionPendingReportV07
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_semt_SecuritiesTransactionPendingReportV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionPendingReportV08> for_semt_SecuritiesTransactionPendingReportV08 = new MMConstraint<SecuritiesTransactionPendingReportV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_semt_SecuritiesTransactionPendingReportV09);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_semt_SecuritiesTransactionPendingReportV07;
			owner_lazy = () -> SecuritiesTransactionPendingReportV08.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTransactionPendingReportV08 obj) throws Exception {
			check_semt_SecuritiesTransactionPendingReportV08(obj);
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
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_sese_SecuritiesSettlementConditionsModificationRequestV06
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_sese_SecuritiesSettlementConditionsModificationRequestV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_sese_SecuritiesSettlementConditionsModificationRequestV04
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_sese_SecuritiesSettlementConditionsModificationRequestV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementConditionsModificationRequestV05> for_sese_SecuritiesSettlementConditionsModificationRequestV05 = new MMConstraint<SecuritiesSettlementConditionsModificationRequestV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_sese_SecuritiesSettlementConditionsModificationRequestV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_sese_SecuritiesSettlementConditionsModificationRequestV04;
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
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_sese_SecuritiesSettlementTransactionStatusAdviceV06
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_sese_SecuritiesSettlementTransactionStatusAdviceV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_sese_SecuritiesSettlementTransactionStatusAdviceV04
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_sese_SecuritiesSettlementTransactionStatusAdviceV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionStatusAdviceV05> for_sese_SecuritiesSettlementTransactionStatusAdviceV05 = new MMConstraint<SecuritiesSettlementTransactionStatusAdviceV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_sese_SecuritiesSettlementTransactionStatusAdviceV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_sese_SecuritiesSettlementTransactionStatusAdviceV04;
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
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingInstructionV03> for_sese_SecuritiesFinancingInstructionV03 = new MMConstraint<SecuritiesFinancingInstructionV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
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
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV02
	 * SecuritiesTransactionPendingReportV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionPendingReportV02> for_semt_SecuritiesTransactionPendingReportV02 = new MMConstraint<SecuritiesTransactionPendingReportV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
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
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV06
	 * SecuritiesSettlementTransactionStatusAdviceV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_sese_SecuritiesSettlementTransactionStatusAdviceV07
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_sese_SecuritiesSettlementTransactionStatusAdviceV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_sese_SecuritiesSettlementTransactionStatusAdviceV05
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_sese_SecuritiesSettlementTransactionStatusAdviceV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionStatusAdviceV06> for_sese_SecuritiesSettlementTransactionStatusAdviceV06 = new MMConstraint<SecuritiesSettlementTransactionStatusAdviceV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_sese_SecuritiesSettlementTransactionStatusAdviceV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_sese_SecuritiesSettlementTransactionStatusAdviceV05;
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
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV06
	 * SecuritiesSettlementTransactionInstructionV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_sese_SecuritiesSettlementTransactionInstructionV07
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_sese_SecuritiesSettlementTransactionInstructionV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_sese_SecuritiesSettlementTransactionInstructionV05
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_sese_SecuritiesSettlementTransactionInstructionV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV06> for_sese_SecuritiesSettlementTransactionInstructionV06 = new MMConstraint<SecuritiesSettlementTransactionInstructionV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_sese_SecuritiesSettlementTransactionInstructionV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_sese_SecuritiesSettlementTransactionInstructionV05;
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV06.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionInstructionV06 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionInstructionV06(obj);
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
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_semt_SecuritiesBalanceAccountingReportV07
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_semt_SecuritiesBalanceAccountingReportV07}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceAccountingReportV06> for_semt_SecuritiesBalanceAccountingReportV06 = new MMConstraint<SecuritiesBalanceAccountingReportV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_semt_SecuritiesBalanceAccountingReportV07);
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
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionCancellationRequestStatusAdviceV02> for_sese_SecuritiesTransactionCancellationRequestStatusAdviceV02 = new MMConstraint<SecuritiesTransactionCancellationRequestStatusAdviceV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
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
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferNotificationV01
	 * PortfolioTransferNotificationV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PortfolioTransferNotificationV01> for_sese_PortfolioTransferNotificationV01 = new MMConstraint<PortfolioTransferNotificationV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
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
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV08
	 * SecuritiesFinancingInstructionV08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_sese_SecuritiesFinancingInstructionV07
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_sese_SecuritiesFinancingInstructionV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingInstructionV08> for_sese_SecuritiesFinancingInstructionV08 = new MMConstraint<SecuritiesFinancingInstructionV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_sese_SecuritiesFinancingInstructionV07;
			owner_lazy = () -> SecuritiesFinancingInstructionV08.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesFinancingInstructionV08 obj) throws Exception {
			check_sese_SecuritiesFinancingInstructionV08(obj);
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
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV01> for_sese_SecuritiesSettlementTransactionInstructionV01 = new MMConstraint<SecuritiesSettlementTransactionInstructionV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
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
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV05
	 * SecuritiesTransactionPostingReportV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_semt_SecuritiesTransactionPostingReportV06
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_semt_SecuritiesTransactionPostingReportV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_semt_SecuritiesTransactionPostingReportV04
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_semt_SecuritiesTransactionPostingReportV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionPostingReportV05> for_semt_SecuritiesTransactionPostingReportV05 = new MMConstraint<SecuritiesTransactionPostingReportV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_semt_SecuritiesTransactionPostingReportV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_semt_SecuritiesTransactionPostingReportV04;
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
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmation002V07
	 * SecuritiesSettlementTransactionConfirmation002V07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmation002V07> for_sese_SecuritiesSettlementTransactionConfirmation002V07 = new MMConstraint<SecuritiesSettlementTransactionConfirmation002V07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesSettlementTransactionConfirmation002V07.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionConfirmation002V07 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionConfirmation002V07(obj);
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
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV02> for_sese_SecuritiesSettlementTransactionInstructionV02 = new MMConstraint<SecuritiesSettlementTransactionInstructionV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
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
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV02
	 * SecuritiesTransactionPostingReportV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionPostingReportV02> for_semt_SecuritiesTransactionPostingReportV02 = new MMConstraint<SecuritiesTransactionPostingReportV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
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
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV06
	 * SecuritiesSettlementTransactionAllegementNotificationV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_sese_SecuritiesSettlementTransactionAllegementNotificationV07
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_sese_SecuritiesSettlementTransactionAllegementNotificationV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_sese_SecuritiesSettlementTransactionAllegementNotificationV05
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_sese_SecuritiesSettlementTransactionAllegementNotificationV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV06> for_sese_SecuritiesSettlementTransactionAllegementNotificationV06 = new MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_sese_SecuritiesSettlementTransactionAllegementNotificationV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_sese_SecuritiesSettlementTransactionAllegementNotificationV05;
			owner_lazy = () -> SecuritiesSettlementTransactionAllegementNotificationV06.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionAllegementNotificationV06 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionAllegementNotificationV06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstruction002V06
	 * SecuritiesFinancingInstruction002V06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingInstruction002V06> for_sese_SecuritiesFinancingInstruction002V06 = new MMConstraint<SecuritiesFinancingInstruction002V06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesFinancingInstruction002V06.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesFinancingInstruction002V06 obj) throws Exception {
			check_sese_SecuritiesFinancingInstruction002V06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV08
	 * SecuritiesTransactionPostingReportV08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_semt_SecuritiesTransactionPostingReportV07
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_semt_SecuritiesTransactionPostingReportV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionPostingReportV08> for_semt_SecuritiesTransactionPostingReportV08 = new MMConstraint<SecuritiesTransactionPostingReportV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_semt_SecuritiesTransactionPostingReportV07;
			owner_lazy = () -> SecuritiesTransactionPostingReportV08.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTransactionPostingReportV08 obj) throws Exception {
			check_semt_SecuritiesTransactionPostingReportV08(obj);
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
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV02> for_sese_SecuritiesSettlementTransactionAllegementNotificationV02 = new MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
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
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdvice002V05
	 * SecuritiesTransactionCancellationRequestStatusAdvice002V05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionCancellationRequestStatusAdvice002V05> for_sese_SecuritiesTransactionCancellationRequestStatusAdvice002V05 = new MMConstraint<SecuritiesTransactionCancellationRequestStatusAdvice002V05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesTransactionCancellationRequestStatusAdvice002V05.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTransactionCancellationRequestStatusAdvice002V05 obj) throws Exception {
			check_sese_SecuritiesTransactionCancellationRequestStatusAdvice002V05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV07
	 * SecuritiesSettlementConditionsModificationRequestV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_sese_SecuritiesSettlementConditionsModificationRequestV06
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_sese_SecuritiesSettlementConditionsModificationRequestV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementConditionsModificationRequestV07> for_sese_SecuritiesSettlementConditionsModificationRequestV07 = new MMConstraint<SecuritiesSettlementConditionsModificationRequestV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_sese_SecuritiesSettlementConditionsModificationRequestV06;
			owner_lazy = () -> SecuritiesSettlementConditionsModificationRequestV07.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementConditionsModificationRequestV07 obj) throws Exception {
			check_sese_SecuritiesSettlementConditionsModificationRequestV07(obj);
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
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingInstructionV02> for_sese_SecuritiesFinancingInstructionV02 = new MMConstraint<SecuritiesFinancingInstructionV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
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
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV01
	 * SecuritiesTransactionPendingReportV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionPendingReportV01> for_semt_SecuritiesTransactionPendingReportV01 = new MMConstraint<SecuritiesTransactionPendingReportV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
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
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V08
	 * SecuritiesSettlementTransactionInstruction002V08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstruction002V08> for_sese_SecuritiesSettlementTransactionInstruction002V08 = new MMConstraint<SecuritiesSettlementTransactionInstruction002V08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesSettlementTransactionInstruction002V08.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionInstruction002V08 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionInstruction002V08(obj);
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
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_sese_SecuritiesSettlementTransactionConfirmationV06
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_sese_SecuritiesSettlementTransactionConfirmationV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_sese_SecuritiesSettlementTransactionConfirmationV04
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_sese_SecuritiesSettlementTransactionConfirmationV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmationV05> for_sese_SecuritiesSettlementTransactionConfirmationV05 = new MMConstraint<SecuritiesSettlementTransactionConfirmationV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_sese_SecuritiesSettlementTransactionConfirmationV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_sese_SecuritiesSettlementTransactionConfirmationV04;
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
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferNotificationV02
	 * PortfolioTransferNotificationV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PortfolioTransferNotificationV02> for_sese_PortfolioTransferNotificationV02 = new MMConstraint<PortfolioTransferNotificationV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
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
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV08
	 * SecuritiesSettlementTransactionStatusAdviceV08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_sese_SecuritiesSettlementTransactionStatusAdviceV09
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_sese_SecuritiesSettlementTransactionStatusAdviceV09}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_sese_SecuritiesSettlementTransactionStatusAdviceV07
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_sese_SecuritiesSettlementTransactionStatusAdviceV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionStatusAdviceV08> for_sese_SecuritiesSettlementTransactionStatusAdviceV08 = new MMConstraint<SecuritiesSettlementTransactionStatusAdviceV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_sese_SecuritiesSettlementTransactionStatusAdviceV09);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_sese_SecuritiesSettlementTransactionStatusAdviceV07;
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
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V07
	 * SecuritiesSettlementTransactionInstruction002V07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstruction002V07> for_sese_SecuritiesSettlementTransactionInstruction002V07 = new MMConstraint<SecuritiesSettlementTransactionInstruction002V07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesSettlementTransactionInstruction002V07.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionInstruction002V07 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionInstruction002V07(obj);
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
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_sese_SecuritiesSettlementTransactionInstructionV05
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_sese_SecuritiesSettlementTransactionInstructionV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV04> for_sese_SecuritiesSettlementTransactionInstructionV04 = new MMConstraint<SecuritiesSettlementTransactionInstructionV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_sese_SecuritiesSettlementTransactionInstructionV05);
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
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV04
	 * SecuritiesSettlementConditionsModificationRequestV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_sese_SecuritiesSettlementConditionsModificationRequestV05
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_sese_SecuritiesSettlementConditionsModificationRequestV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementConditionsModificationRequestV04> for_sese_SecuritiesSettlementConditionsModificationRequestV04 = new MMConstraint<SecuritiesSettlementConditionsModificationRequestV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_sese_SecuritiesSettlementConditionsModificationRequestV05);
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
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV04
	 * SecuritiesTransactionPendingReportV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_semt_SecuritiesTransactionPendingReportV05
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_semt_SecuritiesTransactionPendingReportV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionPendingReportV04> for_semt_SecuritiesTransactionPendingReportV04 = new MMConstraint<SecuritiesTransactionPendingReportV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_semt_SecuritiesTransactionPendingReportV05);
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
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV03
	 * SecuritiesSettlementTransactionConfirmationV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmationV03> for_sese_SecuritiesSettlementTransactionConfirmationV03 = new MMConstraint<SecuritiesSettlementTransactionConfirmationV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
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
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmationV02> for_sese_SecuritiesSettlementTransactionConfirmationV02 = new MMConstraint<SecuritiesSettlementTransactionConfirmationV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
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
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV06
	 * SecuritiesFinancingInstructionV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_sese_SecuritiesFinancingInstructionV07
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_sese_SecuritiesFinancingInstructionV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_sese_SecuritiesFinancingInstructionV05
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_sese_SecuritiesFinancingInstructionV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingInstructionV06> for_sese_SecuritiesFinancingInstructionV06 = new MMConstraint<SecuritiesFinancingInstructionV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_sese_SecuritiesFinancingInstructionV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_sese_SecuritiesFinancingInstructionV05;
			owner_lazy = () -> SecuritiesFinancingInstructionV06.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesFinancingInstructionV06 obj) throws Exception {
			check_sese_SecuritiesFinancingInstructionV06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV09
	 * SecuritiesBalanceAccountingReportV09}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_semt_SecuritiesBalanceAccountingReportV08
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_semt_SecuritiesBalanceAccountingReportV08}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceAccountingReportV09> for_semt_SecuritiesBalanceAccountingReportV09 = new MMConstraint<SecuritiesBalanceAccountingReportV09>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_semt_SecuritiesBalanceAccountingReportV08;
			owner_lazy = () -> SecuritiesBalanceAccountingReportV09.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesBalanceAccountingReportV09 obj) throws Exception {
			check_semt_SecuritiesBalanceAccountingReportV09(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstruction002V08
	 * SecuritiesFinancingInstruction002V08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingInstruction002V08> for_sese_SecuritiesFinancingInstruction002V08 = new MMConstraint<SecuritiesFinancingInstruction002V08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesFinancingInstruction002V08.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesFinancingInstruction002V08 obj) throws Exception {
			check_sese_SecuritiesFinancingInstruction002V08(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV07
	 * SecuritiesSettlementTransactionConfirmationV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_sese_SecuritiesSettlementTransactionConfirmationV08
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_sese_SecuritiesSettlementTransactionConfirmationV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_sese_SecuritiesSettlementTransactionConfirmationV06
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_sese_SecuritiesSettlementTransactionConfirmationV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmationV07> for_sese_SecuritiesSettlementTransactionConfirmationV07 = new MMConstraint<SecuritiesSettlementTransactionConfirmationV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_sese_SecuritiesSettlementTransactionConfirmationV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_sese_SecuritiesSettlementTransactionConfirmationV06;
			owner_lazy = () -> SecuritiesSettlementTransactionConfirmationV07.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionConfirmationV07 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionConfirmationV07(obj);
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_sese_SecuritiesSettlementTransactionStatusAdviceV08
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_sese_SecuritiesSettlementTransactionStatusAdviceV08}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionStatusAdviceV09> for_sese_SecuritiesSettlementTransactionStatusAdviceV09 = new MMConstraint<SecuritiesSettlementTransactionStatusAdviceV09>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_sese_SecuritiesSettlementTransactionStatusAdviceV08;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionStatusAdviceV01> for_sese_SecuritiesSettlementTransactionStatusAdviceV01 = new MMConstraint<SecuritiesSettlementTransactionStatusAdviceV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
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
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV08
	 * SecuritiesSettlementTransactionConfirmationV08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_sese_SecuritiesSettlementTransactionConfirmationV07
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * for_sese_SecuritiesSettlementTransactionConfirmationV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmationV08> for_sese_SecuritiesSettlementTransactionConfirmationV08 = new MMConstraint<SecuritiesSettlementTransactionConfirmationV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_sese_SecuritiesSettlementTransactionConfirmationV07;
			owner_lazy = () -> SecuritiesSettlementTransactionConfirmationV08.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionConfirmationV08 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionConfirmationV08(obj);
		}
	};

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_semt_SecuritiesBalanceAccountingReportV03(SecuritiesBalanceAccountingReportV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_semt_SecuritiesBalanceCustodyReportV06(SecuritiesBalanceCustodyReportV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesSettlementTransactionStatusAdviceV02(SecuritiesSettlementTransactionStatusAdviceV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesSettlementTransactionConfirmation002V08(SecuritiesSettlementTransactionConfirmation002V08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_semt_SecuritiesBalanceCustodyReport002V09(SecuritiesBalanceCustodyReport002V09 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_semt_SecuritiesBalanceCustodyReportV04(SecuritiesBalanceCustodyReportV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_semt_SecuritiesTransactionPendingReport002V07(SecuritiesTransactionPendingReport002V07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesSettlementTransactionAllegementNotification002V06(SecuritiesSettlementTransactionAllegementNotification002V06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_semt_SecuritiesBalanceCustodyReportV05(SecuritiesBalanceCustodyReportV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesSettlementConditionsModificationRequest002V07(SecuritiesSettlementConditionsModificationRequest002V07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesSettlementTransactionInstruction002V06(SecuritiesSettlementTransactionInstruction002V06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_semt_SecuritiesTransactionPendingReportV09(SecuritiesTransactionPendingReportV09 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_semt_SecuritiesTransactionPostingReportV06(SecuritiesTransactionPostingReportV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_semt_SecuritiesBalanceCustodyReportV03(SecuritiesBalanceCustodyReportV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesTransactionCancellationRequestStatusAdviceV03(SecuritiesTransactionCancellationRequestStatusAdviceV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesSettlementTransactionStatusAdviceV07(SecuritiesSettlementTransactionStatusAdviceV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_semt_SecuritiesTransactionPendingReportV06(SecuritiesTransactionPendingReportV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesTransactionCancellationRequestStatusAdviceV04(SecuritiesTransactionCancellationRequestStatusAdviceV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_PortfolioTransferNotificationV03(PortfolioTransferNotificationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesSettlementTransactionInstructionV08(SecuritiesSettlementTransactionInstructionV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_semt_SecuritiesBalanceCustodyReportV09(SecuritiesBalanceCustodyReportV09 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_PortfolioTransferNotificationV04(PortfolioTransferNotificationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_semt_SecuritiesTransactionPostingReport002V08(SecuritiesTransactionPostingReport002V08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesSettlementTransactionConfirmationV04(SecuritiesSettlementTransactionConfirmationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_PortfolioTransferNotification002V05(PortfolioTransferNotification002V05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesSettlementConditionsModificationRequest002V06(SecuritiesSettlementConditionsModificationRequest002V06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesFinancingInstructionV04(SecuritiesFinancingInstructionV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_PortfolioTransferNotificationV05(PortfolioTransferNotificationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_semt_SecuritiesBalanceAccountingReportV08(SecuritiesBalanceAccountingReportV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_semt_SecuritiesTransactionPendingReportV03(SecuritiesTransactionPendingReportV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesSettlementTransactionAllegementNotificationV05(SecuritiesSettlementTransactionAllegementNotificationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesSettlementTransactionStatusAdvice002V09(SecuritiesSettlementTransactionStatusAdvice002V09 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesFinancingInstruction002V07(SecuritiesFinancingInstruction002V07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_semt_SecuritiesTransactionPostingReportV04(SecuritiesTransactionPostingReportV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_semt_SecuritiesTransactionPostingReport002V06(SecuritiesTransactionPostingReport002V06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_seev_SecuritiesTransactionPendingReport002V08(SecuritiesTransactionPendingReport002V08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesTransactionCancellationRequestStatusAdviceV01(SecuritiesTransactionCancellationRequestStatusAdviceV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesSettlementTransactionInstructionV03(SecuritiesSettlementTransactionInstructionV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesFinancingInstructionV05(SecuritiesFinancingInstructionV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_semt_SecuritiesBalanceCustodyReportV07(SecuritiesBalanceCustodyReportV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesSettlementTransactionAllegementNotificationV04(SecuritiesSettlementTransactionAllegementNotificationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesSettlementTransactionConfirmationV01(SecuritiesSettlementTransactionConfirmationV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesSettlementTransactionInstructionV05(SecuritiesSettlementTransactionInstructionV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_semt_SecuritiesTransactionPendingReportV05(SecuritiesTransactionPendingReportV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_semt_SecuritiesTransactionPostingReportV03(SecuritiesTransactionPostingReportV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_semt_SecuritiesTransactionPendingReport002V09(SecuritiesTransactionPendingReport002V09 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesSettlementTransactionConfirmation002V06(SecuritiesSettlementTransactionConfirmation002V06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_semt_SecuritiesBalanceCustodyReportV08(SecuritiesBalanceCustodyReportV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesSettlementTransactionStatusAdvice002V07(SecuritiesSettlementTransactionStatusAdvice002V07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesTransactionCancellationRequestStatusAdviceV05(SecuritiesTransactionCancellationRequestStatusAdviceV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_semt_SecuritiesTransactionPendingReportV07(SecuritiesTransactionPendingReportV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesSettlementConditionsModificationRequestV01(SecuritiesSettlementConditionsModificationRequestV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesSettlementConditionsModificationRequestV06(SecuritiesSettlementConditionsModificationRequestV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_semt_SecuritiesBalanceAccountingReportV05(SecuritiesBalanceAccountingReportV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesSettlementTransactionInstructionV07(SecuritiesSettlementTransactionInstructionV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_seev_SecuritiesTransactionPostingReport002V07(SecuritiesTransactionPostingReport002V07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesSettlementTransactionConfirmationV06(SecuritiesSettlementTransactionConfirmationV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesSettlementConditionsModificationRequestV02(SecuritiesSettlementConditionsModificationRequestV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesSettlementTransactionStatusAdviceV04(SecuritiesSettlementTransactionStatusAdviceV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesFinancingInstructionV01(SecuritiesFinancingInstructionV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesSettlementTransactionAllegementNotification002V05(SecuritiesSettlementTransactionAllegementNotification002V05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesSettlementTransactionStatusAdviceV03(SecuritiesSettlementTransactionStatusAdviceV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesSettlementConditionsModificationRequestV03(SecuritiesSettlementConditionsModificationRequestV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_semt_SecuritiesTransactionPostingReportV01(SecuritiesTransactionPostingReportV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_semt_SecuritiesBalanceAccountingReportV07(SecuritiesBalanceAccountingReportV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesSettlementTransactionAllegementNotificationV07(SecuritiesSettlementTransactionAllegementNotificationV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesSettlementTransactionAllegementNotificationV03(SecuritiesSettlementTransactionAllegementNotificationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_semt_SecuritiesBalanceAccountingReport002V09(SecuritiesBalanceAccountingReport002V09 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_semt_SecuritiesTransactionPostingReportV07(SecuritiesTransactionPostingReportV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesSettlementTransactionAllegementNotification002V07(SecuritiesSettlementTransactionAllegementNotification002V07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesFinancingInstructionV07(SecuritiesFinancingInstructionV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesSettlementTransactionAllegementNotificationV01(SecuritiesSettlementTransactionAllegementNotificationV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesSettlementTransactionStatusAdvice002V08(SecuritiesSettlementTransactionStatusAdvice002V08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_semt_SecuritiesBalanceAccountingReportV04(SecuritiesBalanceAccountingReportV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_PortfolioTransferNotification002V04(PortfolioTransferNotification002V04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_semt_SecuritiesTransactionPendingReportV08(SecuritiesTransactionPendingReportV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesSettlementConditionsModificationRequestV05(SecuritiesSettlementConditionsModificationRequestV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesSettlementTransactionStatusAdviceV05(SecuritiesSettlementTransactionStatusAdviceV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesFinancingInstructionV03(SecuritiesFinancingInstructionV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_semt_SecuritiesTransactionPendingReportV02(SecuritiesTransactionPendingReportV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesSettlementTransactionStatusAdviceV06(SecuritiesSettlementTransactionStatusAdviceV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesSettlementTransactionInstructionV06(SecuritiesSettlementTransactionInstructionV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_semt_SecuritiesBalanceAccountingReportV06(SecuritiesBalanceAccountingReportV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesTransactionCancellationRequestStatusAdviceV02(SecuritiesTransactionCancellationRequestStatusAdviceV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_PortfolioTransferNotificationV01(PortfolioTransferNotificationV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesFinancingInstructionV08(SecuritiesFinancingInstructionV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesSettlementTransactionInstructionV01(SecuritiesSettlementTransactionInstructionV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_semt_SecuritiesTransactionPostingReportV05(SecuritiesTransactionPostingReportV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesSettlementTransactionConfirmation002V07(SecuritiesSettlementTransactionConfirmation002V07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesSettlementTransactionInstructionV02(SecuritiesSettlementTransactionInstructionV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_semt_SecuritiesTransactionPostingReportV02(SecuritiesTransactionPostingReportV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesSettlementTransactionAllegementNotificationV06(SecuritiesSettlementTransactionAllegementNotificationV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesFinancingInstruction002V06(SecuritiesFinancingInstruction002V06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_semt_SecuritiesTransactionPostingReportV08(SecuritiesTransactionPostingReportV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesSettlementTransactionAllegementNotificationV02(SecuritiesSettlementTransactionAllegementNotificationV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesTransactionCancellationRequestStatusAdvice002V05(SecuritiesTransactionCancellationRequestStatusAdvice002V05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesSettlementConditionsModificationRequestV07(SecuritiesSettlementConditionsModificationRequestV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesFinancingInstructionV02(SecuritiesFinancingInstructionV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_semt_SecuritiesTransactionPendingReportV01(SecuritiesTransactionPendingReportV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesSettlementTransactionInstruction002V08(SecuritiesSettlementTransactionInstruction002V08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesSettlementTransactionConfirmationV05(SecuritiesSettlementTransactionConfirmationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_PortfolioTransferNotificationV02(PortfolioTransferNotificationV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesSettlementTransactionStatusAdviceV08(SecuritiesSettlementTransactionStatusAdviceV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesSettlementTransactionInstruction002V07(SecuritiesSettlementTransactionInstruction002V07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesSettlementTransactionInstructionV04(SecuritiesSettlementTransactionInstructionV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesSettlementConditionsModificationRequestV04(SecuritiesSettlementConditionsModificationRequestV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_semt_SecuritiesTransactionPendingReportV04(SecuritiesTransactionPendingReportV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesSettlementTransactionConfirmationV03(SecuritiesSettlementTransactionConfirmationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesSettlementTransactionConfirmationV02(SecuritiesSettlementTransactionConfirmationV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesFinancingInstructionV06(SecuritiesFinancingInstructionV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_semt_SecuritiesBalanceAccountingReportV09(SecuritiesBalanceAccountingReportV09 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesFinancingInstruction002V08(SecuritiesFinancingInstruction002V08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesSettlementTransactionConfirmationV07(SecuritiesSettlementTransactionConfirmationV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesSettlementTransactionStatusAdviceV09(SecuritiesSettlementTransactionStatusAdviceV09 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesSettlementTransactionStatusAdviceV01(SecuritiesSettlementTransactionStatusAdviceV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void check_sese_SecuritiesSettlementTransactionConfirmationV08(SecuritiesSettlementTransactionConfirmationV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}