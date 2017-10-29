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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.repository.datatype.AnyBICIdentifier;
import com.tools20022.repository.entity.PartyIdentificationInformation;
import com.tools20022.repository.msg.GenericIdentification19;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;

/**
 * Choice of identification of a party.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification36Choice#AnyBIC
 * PartyIdentification36Choice.AnyBIC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification36Choice#ProprietaryIdentification
 * PartyIdentification36Choice.ProprietaryIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
 * PartyIdentificationInformation}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReportV01#AccountOwner
 * SecuritiesSettlementTransactionAuditTrailReportV01.AccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV02#AccountOwner
 * IntraPositionMovementConfirmationV02.AccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV03#AccountOwner
 * IntraPositionMovementConfirmationV03.AccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV04#AccountOwner
 * IntraPositionMovementConfirmationV04.AccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementPostingReportV02#AccountOwner
 * IntraPositionMovementPostingReportV02.AccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementPostingReportV03#AccountOwner
 * IntraPositionMovementPostingReportV03.AccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementPostingReportV04#AccountOwner
 * IntraPositionMovementPostingReportV04.AccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV04#AccountOwner
 * SecuritiesBalanceAccountingReportV04.AccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV05#AccountOwner
 * SecuritiesBalanceAccountingReportV05.AccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV06#AccountOwner
 * SecuritiesBalanceAccountingReportV06.AccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV04#AccountOwner
 * SecuritiesBalanceCustodyReportV04.AccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV05#AccountOwner
 * SecuritiesBalanceCustodyReportV05.AccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV06#AccountOwner
 * SecuritiesBalanceCustodyReportV06.AccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageCancellationAdviceV02#AccountOwner
 * SecuritiesMessageCancellationAdviceV02.AccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageCancellationAdviceV03#AccountOwner
 * SecuritiesMessageCancellationAdviceV03.AccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageCancellationAdviceV04#AccountOwner
 * SecuritiesMessageCancellationAdviceV04.AccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV02#AccountOwner
 * SecuritiesSettlementConditionModificationStatusAdviceV02.AccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV03#AccountOwner
 * SecuritiesSettlementConditionModificationStatusAdviceV03.AccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV04#AccountOwner
 * SecuritiesSettlementConditionModificationStatusAdviceV04.AccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV02#AccountOwner
 * SecuritiesSettlementConditionsModificationRequestV02.AccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV03#AccountOwner
 * SecuritiesSettlementConditionsModificationRequestV03.AccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV04#AccountOwner
 * SecuritiesSettlementConditionsModificationRequestV04.AccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV02#AccountOwner
 * SecuritiesTransactionPendingReportV02.AccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV03#AccountOwner
 * SecuritiesTransactionPendingReportV03.AccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV04#AccountOwner
 * SecuritiesTransactionPendingReportV04.AccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV02#AccountOwner
 * SecuritiesTransactionPostingReportV02.AccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV03#AccountOwner
 * SecuritiesTransactionPostingReportV03.AccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV04#AccountOwner
 * SecuritiesTransactionPostingReportV04.AccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementInstructionV02#AccountOwner
 * IntraPositionMovementInstructionV02.AccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferNotificationV02#AccountOwner
 * PortfolioTransferNotificationV02.AccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementAllegementRemovalAdviceV02#AccountOwner
 * SecuritiesSettlementAllegementRemovalAdviceV02.AccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReportV02#AccountOwner
 * SecuritiesSettlementTransactionAllegementReportV02.AccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesStatementQueryV02#AccountOwner
 * SecuritiesStatementQueryV02.AccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV02#AccountOwner
 * SecuritiesStatusOrStatementQueryStatusAdviceV02.AccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestV02#AccountOwner
 * SecuritiesTransactionCancellationRequestV02.AccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionStatusQueryV02#AccountOwner
 * SecuritiesTransactionStatusQueryV02.AccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementAllegementRemovalAdviceV03#AccountOwner
 * SecuritiesSettlementAllegementRemovalAdviceV03.AccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReportV03#AccountOwner
 * SecuritiesSettlementTransactionAllegementReportV03.AccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesStatementQueryV03#AccountOwner
 * SecuritiesStatementQueryV03.AccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV03#AccountOwner
 * SecuritiesStatusOrStatementQueryStatusAdviceV03.AccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestV03#AccountOwner
 * SecuritiesTransactionCancellationRequestV03.AccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionStatusQueryV03#AccountOwner
 * SecuritiesTransactionStatusQueryV03.AccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementInstructionV03#AccountOwner
 * IntraPositionMovementInstructionV03.AccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferNotificationV03#AccountOwner
 * PortfolioTransferNotificationV03.AccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV01#AccountOwner
 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV01.
 * AccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestV04#AccountOwner
 * SecuritiesTransactionCancellationRequestV04.AccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV05#AccountOwner
 * SecuritiesSettlementConditionModificationStatusAdviceV05.AccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV05#AccountOwner
 * SecuritiesTransactionPendingReportV05.AccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV05#AccountOwner
 * SecuritiesTransactionPostingReportV05.AccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV02#AccountOwner
 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV02.
 * AccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV05#AccountOwner
 * SecuritiesSettlementConditionsModificationRequestV05.AccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV07#AccountOwner
 * SecuritiesBalanceCustodyReportV07.AccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV07#AccountOwner
 * SecuritiesBalanceAccountingReportV07.AccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReportV04#AccountOwner
 * SecuritiesSettlementTransactionAllegementReportV04.AccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesStatementQueryV04#AccountOwner
 * SecuritiesStatementQueryV04.AccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV08#AccountOwner
 * SecuritiesBalanceCustodyReportV08.AccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV06#AccountOwner
 * SecuritiesTransactionPendingReportV06.AccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesStatementQueryV05#AccountOwner
 * SecuritiesStatementQueryV05.AccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV08#AccountOwner
 * SecuritiesBalanceAccountingReportV08.AccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV06#AccountOwner
 * SecuritiesSettlementConditionModificationStatusAdviceV06.AccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV03#AccountOwner
 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV03.
 * AccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReportV02#AccountOwner
 * SecuritiesSettlementTransactionAuditTrailReportV02.AccountOwner}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = May 5, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PartyIdentification36Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of identification of a party."</li>
 * </ul>
 */
public class PartyIdentification36Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Code allocated to a financial or non-financial institution by the ISO
	 * 9362 Registration Authority, as described in ISO 9362
	 * "Banking - Banking telecommunication messages - Business identifier code (BIC)"
	 * .
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.AnyBICIdentifier
	 * AnyBICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#AnyBIC
	 * OrganisationIdentification.AnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification36Choice
	 * PartyIdentification36Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AnyBIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AnyBIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Code allocated to a financial or non-financial institution by the ISO 9362 Registration Authority, as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\"."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute AnyBIC = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PartyIdentification36Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.OrganisationIdentification.AnyBIC;
			isDerived = false;
			xmlTag = "AnyBIC";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AnyBIC";
			definition = "Code allocated to a financial or non-financial institution by the ISO 9362 Registration Authority, as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\".";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> AnyBICIdentifier.mmObject();
		}
	};
	/**
	 * Unique and unambiguous identifier, as assigned to a financial institution
	 * using a proprietary identification scheme.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification19
	 * GenericIdentification19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#OtherIdentification
	 * PartyIdentificationInformation.OtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification36Choice
	 * PartyIdentification36Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtryId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProprietaryIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier, as assigned to a financial institution using a proprietary identification scheme."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd ProprietaryIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PartyIdentification36Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.OtherIdentification;
			isDerived = false;
			xmlTag = "PrtryId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProprietaryIdentification";
			definition = "Unique and unambiguous identifier, as assigned to a financial institution using a proprietary identification scheme.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> GenericIdentification19.mmObject();
			isComposite = true;
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PartyIdentification36Choice.AnyBIC, com.tools20022.repository.choice.PartyIdentification36Choice.ProprietaryIdentification);
				trace_lazy = () -> PartyIdentificationInformation.mmObject();
				messageBuildingBlock_lazy = () -> Arrays
						.asList(com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReportV01.AccountOwner, com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV02.AccountOwner,
								com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV03.AccountOwner, com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV04.AccountOwner,
								com.tools20022.repository.area.semt.IntraPositionMovementPostingReportV02.AccountOwner, com.tools20022.repository.area.semt.IntraPositionMovementPostingReportV03.AccountOwner,
								com.tools20022.repository.area.semt.IntraPositionMovementPostingReportV04.AccountOwner, com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV04.AccountOwner,
								com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV05.AccountOwner, com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV06.AccountOwner,
								com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV04.AccountOwner, com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV05.AccountOwner,
								com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV06.AccountOwner, com.tools20022.repository.area.semt.SecuritiesMessageCancellationAdviceV02.AccountOwner,
								com.tools20022.repository.area.semt.SecuritiesMessageCancellationAdviceV03.AccountOwner, com.tools20022.repository.area.semt.SecuritiesMessageCancellationAdviceV04.AccountOwner,
								com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV02.AccountOwner,
								com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV03.AccountOwner,
								com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV04.AccountOwner,
								com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV02.AccountOwner, com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV03.AccountOwner,
								com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV04.AccountOwner, com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV02.AccountOwner,
								com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV03.AccountOwner, com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV04.AccountOwner,
								com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV02.AccountOwner, com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV03.AccountOwner,
								com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV04.AccountOwner, com.tools20022.repository.area.semt.IntraPositionMovementInstructionV02.AccountOwner,
								com.tools20022.repository.area.sese.PortfolioTransferNotificationV02.AccountOwner, com.tools20022.repository.area.sese.SecuritiesSettlementAllegementRemovalAdviceV02.AccountOwner,
								com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReportV02.AccountOwner, com.tools20022.repository.area.semt.SecuritiesStatementQueryV02.AccountOwner,
								com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV02.AccountOwner, com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestV02.AccountOwner,
								com.tools20022.repository.area.sese.SecuritiesTransactionStatusQueryV02.AccountOwner, com.tools20022.repository.area.sese.SecuritiesSettlementAllegementRemovalAdviceV03.AccountOwner,
								com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReportV03.AccountOwner, com.tools20022.repository.area.semt.SecuritiesStatementQueryV03.AccountOwner,
								com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV03.AccountOwner, com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestV03.AccountOwner,
								com.tools20022.repository.area.sese.SecuritiesTransactionStatusQueryV03.AccountOwner, com.tools20022.repository.area.semt.IntraPositionMovementInstructionV03.AccountOwner,
								com.tools20022.repository.area.sese.PortfolioTransferNotificationV03.AccountOwner, com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV01.AccountOwner,
								com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestV04.AccountOwner, com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV05.AccountOwner,
								com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV05.AccountOwner, com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV05.AccountOwner,
								com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV02.AccountOwner,
								com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV05.AccountOwner, com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV07.AccountOwner,
								com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV07.AccountOwner, com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReportV04.AccountOwner,
								com.tools20022.repository.area.semt.SecuritiesStatementQueryV04.AccountOwner, com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV08.AccountOwner,
								com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV06.AccountOwner, com.tools20022.repository.area.semt.SecuritiesStatementQueryV05.AccountOwner,
								com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV08.AccountOwner, com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV06.AccountOwner,
								com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV03.AccountOwner,
								com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReportV02.AccountOwner);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("May 5, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "PartyIdentification36Choice";
				definition = "Choice of identification of a party.";
			}
		});
		return mmObject_lazy.get();
	}
}