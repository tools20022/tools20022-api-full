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

package com.tools20022.repository.msgset;

import com.tools20022.metamodel.MMMessageSet;
import com.tools20022.repository.area.semt.*;
import com.tools20022.repository.area.sese.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * This Message Definition Report provides the description of the ISO15022
 * Variants of the current version of the Settlement And Reconciliation message
 * definitions. These variants have been developed by SWIFT to help ISO 20022
 * users who need to be interoperable with the ISO 15022 Settlement And
 * Reconciliation message types. This has been done by restricting the ISO 20022
 * message components wherever necessary to ensure compatibility with the
 * equivalent fields in ISO 15022. For more information, please refer to the ISO
 * 15022 Variants Business Justification that is available at
 * http://www.iso20022
 * .org/documents/BJ/BJ096/ISO20022BJ_15022_variants_v3_with_comments.doc<br>
 * <br>
 * These variants are maintained by SWIFT. Requests for changes to these
 * variants should be addressed directly to SWIFT.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageSet#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdvice002V04
 * SecuritiesSettlementTransactionModificationRequestStatusAdvice002V04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferNotification002V04
 * PortfolioTransferNotification002V04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReport002V03
 * SecuritiesSettlementTransactionAuditTrailReport002V03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementAllegementRemovalAdvice002V04
 * SecuritiesSettlementAllegementRemovalAdvice002V04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionStatusQuery002V04
 * SecuritiesTransactionStatusQuery002V04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageCancellationAdvice002V05
 * SecuritiesMessageCancellationAdvice002V05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReport002V09
 * SecuritiesBalanceAccountingReport002V09}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionCounterpartyResponse002V02
 * SecuritiesSettlementTransactionCounterpartyResponse002V02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdvice002V05
 * SecuritiesTransactionCancellationRequestStatusAdvice002V05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesStatementQuery002V06
 * SecuritiesStatementQuery002V06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementInstruction002V04
 * IntraPositionMovementInstruction002V04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReport002V09
 * SecuritiesBalanceCustodyReport002V09}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdvice002V04
 * SecuritiesStatusOrStatementQueryStatusAdvice002V04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequest002V05
 * SecuritiesTransactionCancellationRequest002V05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdvice002V07
 * SecuritiesSettlementConditionModificationStatusAdvice002V07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReport002V08
 * SecuritiesTransactionPendingReport002V08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementConfirmation002V06
 * IntraPositionMovementConfirmation002V06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementStatusAdvice002V05
 * IntraPositionMovementStatusAdvice002V05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequest002V05
 * SecuritiesSettlementTransactionModificationRequest002V05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotification002V06
 * SecuritiesSettlementTransactionAllegementNotification002V06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V07
 * SecuritiesSettlementTransactionInstruction002V07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmation002V07
 * SecuritiesFinancingConfirmation002V07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementPostingReport002V06
 * IntraPositionMovementPostingReport002V06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdvice002V07
 * SecuritiesFinancingStatusAdvice002V07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequest002V07
 * SecuritiesSettlementConditionsModificationRequest002V07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReport002V06
 * SecuritiesSettlementTransactionAllegementReport002V06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdvice002V08
 * SecuritiesSettlementTransactionStatusAdvice002V08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstruction002V07
 * SecuritiesFinancingInstruction002V07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReport002V07
 * SecuritiesTransactionPostingReport002V07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotification002V07
 * SecuritiesSettlementTransactionGenerationNotification002V07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstruction002V06
 * SecuritiesFinancingModificationInstruction002V06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmation002V07
 * SecuritiesSettlementTransactionConfirmation002V07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdvice002V06
 * SecuritiesSettlementTransactionReversalAdvice002V06}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelCatalogueEntry#getBusinessProcessCatalogue
 * businessProcessCatalogue} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#catalogue
 * GeneratedRepository.catalogue}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Settlement And Reconciliation - ISO 15022 Variants - ISO - Latest version"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "This Message Definition Report provides the description of the ISO15022 Variants of the current version of the Settlement And Reconciliation message definitions. These variants have been developed by SWIFT to help ISO 20022 users who need to be interoperable with the ISO 15022 Settlement And Reconciliation message types. This has been done by restricting the ISO 20022 message components wherever necessary to ensure compatibility with the equivalent fields in ISO 15022. For more information, please refer to the ISO 15022 Variants Business Justification that is available at http://www.iso20022.org/documents/BJ/BJ096/ISO20022BJ_15022_variants_v3_with_comments.doc\r\n\r\nThese variants are maintained by SWIFT. Requests for changes to these variants should be addressed directly to SWIFT. "
 * </li>
 * </ul>
 */
public class SettlementAndReconciliationISO15022VariantsISOLatestversion {

	final static private AtomicReference<MMMessageSet> mmObject_lazy = new AtomicReference<>();

	final static public MMMessageSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageSet() {
			{
				businessProcessCatalogue_lazy = () -> com.tools20022.repository.GeneratedRepository.catalogue;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Settlement And Reconciliation - ISO 15022 Variants - ISO - Latest version";
				definition = "This Message Definition Report provides the description of the ISO15022 Variants of the current version of the Settlement And Reconciliation message definitions. These variants have been developed by SWIFT to help ISO 20022 users who need to be interoperable with the ISO 15022 Settlement And Reconciliation message types. This has been done by restricting the ISO 20022 message components wherever necessary to ensure compatibility with the equivalent fields in ISO 15022. For more information, please refer to the ISO 15022 Variants Business Justification that is available at http://www.iso20022.org/documents/BJ/BJ096/ISO20022BJ_15022_variants_v3_with_comments.doc\r\n\r\nThese variants are maintained by SWIFT. Requests for changes to these variants should be addressed directly to SWIFT. ";
				messageDefinition_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionModificationRequestStatusAdvice002V04.mmObject(), PortfolioTransferNotification002V04.mmObject(),
						SecuritiesSettlementTransactionAuditTrailReport002V03.mmObject(), SecuritiesSettlementAllegementRemovalAdvice002V04.mmObject(), SecuritiesTransactionStatusQuery002V04.mmObject(),
						SecuritiesMessageCancellationAdvice002V05.mmObject(), SecuritiesBalanceAccountingReport002V09.mmObject(), SecuritiesSettlementTransactionCounterpartyResponse002V02.mmObject(),
						SecuritiesTransactionCancellationRequestStatusAdvice002V05.mmObject(), SecuritiesStatementQuery002V06.mmObject(), IntraPositionMovementInstruction002V04.mmObject(), SecuritiesBalanceCustodyReport002V09.mmObject(),
						SecuritiesStatusOrStatementQueryStatusAdvice002V04.mmObject(), SecuritiesTransactionCancellationRequest002V05.mmObject(), SecuritiesSettlementConditionModificationStatusAdvice002V07.mmObject(),
						SecuritiesTransactionPendingReport002V08.mmObject(), IntraPositionMovementConfirmation002V06.mmObject(), IntraPositionMovementStatusAdvice002V05.mmObject(),
						SecuritiesSettlementTransactionModificationRequest002V05.mmObject(), SecuritiesSettlementTransactionAllegementNotification002V06.mmObject(), SecuritiesSettlementTransactionInstruction002V07.mmObject(),
						SecuritiesFinancingConfirmation002V07.mmObject(), IntraPositionMovementPostingReport002V06.mmObject(), SecuritiesFinancingStatusAdvice002V07.mmObject(),
						SecuritiesSettlementConditionsModificationRequest002V07.mmObject(), SecuritiesSettlementTransactionAllegementReport002V06.mmObject(), SecuritiesSettlementTransactionStatusAdvice002V08.mmObject(),
						SecuritiesFinancingInstruction002V07.mmObject(), SecuritiesTransactionPostingReport002V07.mmObject(), SecuritiesSettlementTransactionGenerationNotification002V07.mmObject(),
						SecuritiesFinancingModificationInstruction002V06.mmObject(), SecuritiesSettlementTransactionConfirmation002V07.mmObject(), SecuritiesSettlementTransactionReversalAdvice002V06.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}