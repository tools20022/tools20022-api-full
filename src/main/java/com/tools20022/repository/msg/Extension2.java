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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.datatype.Max350Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Additional information that can not be captured in the structured fields
 * and/or any other specific block.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Extension2#PlaceAndName
 * Extension2.PlaceAndName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Extension2#ExtensionEnvelope
 * Extension2.ExtensionEnvelope}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV01#Extension
 * CorporateActionCancellationAdviceV01.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV01#Extension
 * CorporateActionEventProcessingStatusAdviceV01.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV01#Extension
 * CorporateActionInstructionV01.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestV01#Extension
 * CorporateActionInstructionCancellationRequestV01.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV01#Extension
 * CorporateActionInstructionCancellationRequestStatusAdviceV01.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatementReportV01#Extension
 * CorporateActionInstructionStatementReportV01.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV01#Extension
 * CorporateActionInstructionStatusAdviceV01.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV01#Extension
 * CorporateActionMovementConfirmationV01.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01#Extension
 * CorporateActionMovementPreliminaryAdviceV01.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV01#Extension
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV01.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV01#Extension
 * CorporateActionMovementReversalAdviceV01.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV01#Extension
 * CorporateActionNotificationV01.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV01#Extension
 * IntraPositionMovementConfirmationV01.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV01#Extension
 * SecuritiesFinancingConfirmationV01.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV01#Extension
 * SecuritiesFinancingInstructionV01.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageCancellationAdviceV01#Extension
 * SecuritiesMessageCancellationAdviceV01.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV01#Extension
 * SecuritiesSettlementConditionModificationStatusAdviceV01.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV01#Extension
 * SecuritiesSettlementConditionsModificationRequestV01.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV01#Extension
 * SecuritiesSettlementTransactionConfirmationV01.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV01#Extension
 * SecuritiesSettlementTransactionGenerationNotificationV01.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV01#Extension
 * SecuritiesSettlementTransactionInstructionV01.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV01#Extension
 * SecuritiesSettlementTransactionStatusAdviceV01.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV04#Extension
 * MeetingNotificationV04.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingCancellationV04#Extension
 * MeetingCancellationV04.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingEntitlementNotificationV04#Extension
 * MeetingEntitlementNotificationV04.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionV04#Extension
 * MeetingInstructionV04.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV04#Extension
 * MeetingInstructionCancellationRequestV04.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionStatusV04#Extension
 * MeetingInstructionStatusV04.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingVoteExecutionConfirmationV04#Extension
 * MeetingVoteExecutionConfirmationV04.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingResultDisseminationV04#Extension
 * MeetingResultDisseminationV04.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementInstructionV01#Extension
 * IntraPositionMovementInstructionV01.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementStatusAdviceV01#Extension
 * IntraPositionMovementStatusAdviceV01.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV01#Extension
 * SecuritiesFinancingModificationInstructionV01.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV01#Extension
 * SecuritiesFinancingStatusAdviceV01.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementAllegementRemovalAdviceV01#Extension
 * SecuritiesSettlementAllegementRemovalAdviceV01.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV01#Extension
 * SecuritiesSettlementTransactionAllegementNotificationV01.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV01#Extension
 * SecuritiesSettlementTransactionReversalAdviceV01.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesStatementQueryV01#Extension
 * SecuritiesStatementQueryV01.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV01#Extension
 * SecuritiesStatusOrStatementQueryStatusAdviceV01.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdviceV01#Extension
 * SecuritiesTransactionCancellationRequestStatusAdviceV01.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestV01#Extension
 * SecuritiesTransactionCancellationRequestV01.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionStatusQueryV01#Extension
 * SecuritiesTransactionStatusQueryV01.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNarrativeV01#Extension
 * CorporateActionNarrativeV01.Extension}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Extension2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Additional information that can not be captured in the structured fields and/or any other specific block."
 * </li>
 * </ul>
 */
public class Extension2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Name qualifying the information provided in the Text field, and place
	 * where this information should be inserted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Extension2
	 * Extension2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcAndNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceAndName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name qualifying the information provided in the Text field, and place where this information should be inserted."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute PlaceAndName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Extension2.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "Name qualifying the information provided in the Text field, and place where this information should be inserted.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Technical element wrapping the extension.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ExtensionEnvelope1
	 * ExtensionEnvelope1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Extension2
	 * Extension2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XtnsnEnvlp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtensionEnvelope"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Technical element wrapping the extension."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd ExtensionEnvelope = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Extension2.mmObject();
			isDerived = false;
			xmlTag = "XtnsnEnvlp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtensionEnvelope";
			definition = "Technical element wrapping the extension.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> ExtensionEnvelope1.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Extension2.PlaceAndName, com.tools20022.repository.msg.Extension2.ExtensionEnvelope);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV01.Extension,
						com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV01.Extension, com.tools20022.repository.area.seev.CorporateActionInstructionV01.Extension,
						com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestV01.Extension, com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV01.Extension,
						com.tools20022.repository.area.seev.CorporateActionInstructionStatementReportV01.Extension, com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV01.Extension,
						com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV01.Extension, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01.Extension,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV01.Extension, com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV01.Extension,
						com.tools20022.repository.area.seev.CorporateActionNotificationV01.Extension, com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV01.Extension,
						com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV01.Extension, com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV01.Extension,
						com.tools20022.repository.area.semt.SecuritiesMessageCancellationAdviceV01.Extension, com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV01.Extension,
						com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV01.Extension, com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV01.Extension,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV01.Extension, com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV01.Extension,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV01.Extension, com.tools20022.repository.area.seev.MeetingNotificationV04.Extension,
						com.tools20022.repository.area.seev.MeetingCancellationV04.Extension, com.tools20022.repository.area.seev.MeetingEntitlementNotificationV04.Extension,
						com.tools20022.repository.area.seev.MeetingInstructionV04.Extension, com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV04.Extension,
						com.tools20022.repository.area.seev.MeetingInstructionStatusV04.Extension, com.tools20022.repository.area.seev.MeetingVoteExecutionConfirmationV04.Extension,
						com.tools20022.repository.area.seev.MeetingResultDisseminationV04.Extension, com.tools20022.repository.area.semt.IntraPositionMovementInstructionV01.Extension,
						com.tools20022.repository.area.semt.IntraPositionMovementStatusAdviceV01.Extension, com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV01.Extension,
						com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV01.Extension, com.tools20022.repository.area.sese.SecuritiesSettlementAllegementRemovalAdviceV01.Extension,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV01.Extension, com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV01.Extension,
						com.tools20022.repository.area.semt.SecuritiesStatementQueryV01.Extension, com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV01.Extension,
						com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdviceV01.Extension, com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestV01.Extension,
						com.tools20022.repository.area.sese.SecuritiesTransactionStatusQueryV01.Extension, com.tools20022.repository.area.seev.CorporateActionNarrativeV01.Extension);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Extension2";
				definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			}
		});
		return mmObject_lazy.get();
	}
}