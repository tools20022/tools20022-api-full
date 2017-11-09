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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.seev.*;
import com.tools20022.repository.area.semt.*;
import com.tools20022.repository.area.sese.*;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.GeneratedRepository;
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
 * <li>{@linkplain com.tools20022.repository.msg.Extension2#mmPlaceAndName
 * Extension2.mmPlaceAndName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Extension2#mmExtensionEnvelope
 * Extension2.mmExtensionEnvelope}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV01#mmExtension
 * CorporateActionCancellationAdviceV01.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV01#mmExtension
 * CorporateActionEventProcessingStatusAdviceV01.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV01#mmExtension
 * CorporateActionInstructionV01.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestV01#mmExtension
 * CorporateActionInstructionCancellationRequestV01.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV01#mmExtension
 * CorporateActionInstructionCancellationRequestStatusAdviceV01.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatementReportV01#mmExtension
 * CorporateActionInstructionStatementReportV01.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV01#mmExtension
 * CorporateActionInstructionStatusAdviceV01.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV01#mmExtension
 * CorporateActionMovementConfirmationV01.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01#mmExtension
 * CorporateActionMovementPreliminaryAdviceV01.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV01#mmExtension
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV01.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV01#mmExtension
 * CorporateActionMovementReversalAdviceV01.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV01#mmExtension
 * CorporateActionNotificationV01.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV01#mmExtension
 * IntraPositionMovementConfirmationV01.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV01#mmExtension
 * SecuritiesFinancingConfirmationV01.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV01#mmExtension
 * SecuritiesFinancingInstructionV01.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageCancellationAdviceV01#mmExtension
 * SecuritiesMessageCancellationAdviceV01.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV01#mmExtension
 * SecuritiesSettlementConditionModificationStatusAdviceV01.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV01#mmExtension
 * SecuritiesSettlementConditionsModificationRequestV01.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV01#mmExtension
 * SecuritiesSettlementTransactionConfirmationV01.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV01#mmExtension
 * SecuritiesSettlementTransactionGenerationNotificationV01.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV01#mmExtension
 * SecuritiesSettlementTransactionInstructionV01.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV01#mmExtension
 * SecuritiesSettlementTransactionStatusAdviceV01.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV04#mmExtension
 * MeetingNotificationV04.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingCancellationV04#mmExtension
 * MeetingCancellationV04.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingEntitlementNotificationV04#mmExtension
 * MeetingEntitlementNotificationV04.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionV04#mmExtension
 * MeetingInstructionV04.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV04#mmExtension
 * MeetingInstructionCancellationRequestV04.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionStatusV04#mmExtension
 * MeetingInstructionStatusV04.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingVoteExecutionConfirmationV04#mmExtension
 * MeetingVoteExecutionConfirmationV04.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingResultDisseminationV04#mmExtension
 * MeetingResultDisseminationV04.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementInstructionV01#mmExtension
 * IntraPositionMovementInstructionV01.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementStatusAdviceV01#mmExtension
 * IntraPositionMovementStatusAdviceV01.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV01#mmExtension
 * SecuritiesFinancingModificationInstructionV01.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV01#mmExtension
 * SecuritiesFinancingStatusAdviceV01.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementAllegementRemovalAdviceV01#mmExtension
 * SecuritiesSettlementAllegementRemovalAdviceV01.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV01#mmExtension
 * SecuritiesSettlementTransactionAllegementNotificationV01.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV01#mmExtension
 * SecuritiesSettlementTransactionReversalAdviceV01.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesStatementQueryV01#mmExtension
 * SecuritiesStatementQueryV01.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV01#mmExtension
 * SecuritiesStatusOrStatementQueryStatusAdviceV01.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdviceV01#mmExtension
 * SecuritiesTransactionCancellationRequestStatusAdviceV01.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestV01#mmExtension
 * SecuritiesTransactionCancellationRequestV01.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionStatusQueryV01#mmExtension
 * SecuritiesTransactionStatusQueryV01.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNarrativeV01#mmExtension
 * CorporateActionNarrativeV01.mmExtension}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	protected Max350Text placeAndName;
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
	public static final MMMessageAttribute mmPlaceAndName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Extension2.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "Name qualifying the information provided in the Text field, and place where this information should be inserted.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected ExtensionEnvelope1 extensionEnvelope;
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
	public static final MMMessageAssociationEnd mmExtensionEnvelope = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Extension2.mmObject();
			isDerived = false;
			xmlTag = "XtnsnEnvlp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtensionEnvelope";
			definition = "Technical element wrapping the extension.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ExtensionEnvelope1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Extension2.mmPlaceAndName, Extension2.mmExtensionEnvelope);
				messageBuildingBlock_lazy = () -> Arrays.asList(CorporateActionCancellationAdviceV01.mmExtension, CorporateActionEventProcessingStatusAdviceV01.mmExtension, CorporateActionInstructionV01.mmExtension,
						CorporateActionInstructionCancellationRequestV01.mmExtension, CorporateActionInstructionCancellationRequestStatusAdviceV01.mmExtension, CorporateActionInstructionStatementReportV01.mmExtension,
						CorporateActionInstructionStatusAdviceV01.mmExtension, CorporateActionMovementConfirmationV01.mmExtension, CorporateActionMovementPreliminaryAdviceV01.mmExtension,
						CorporateActionMovementPreliminaryAdviceCancellationAdviceV01.mmExtension, CorporateActionMovementReversalAdviceV01.mmExtension, CorporateActionNotificationV01.mmExtension,
						IntraPositionMovementConfirmationV01.mmExtension, SecuritiesFinancingConfirmationV01.mmExtension, SecuritiesFinancingInstructionV01.mmExtension, SecuritiesMessageCancellationAdviceV01.mmExtension,
						SecuritiesSettlementConditionModificationStatusAdviceV01.mmExtension, SecuritiesSettlementConditionsModificationRequestV01.mmExtension, SecuritiesSettlementTransactionConfirmationV01.mmExtension,
						SecuritiesSettlementTransactionGenerationNotificationV01.mmExtension, SecuritiesSettlementTransactionInstructionV01.mmExtension, SecuritiesSettlementTransactionStatusAdviceV01.mmExtension,
						MeetingNotificationV04.mmExtension, MeetingCancellationV04.mmExtension, MeetingEntitlementNotificationV04.mmExtension, MeetingInstructionV04.mmExtension, MeetingInstructionCancellationRequestV04.mmExtension,
						MeetingInstructionStatusV04.mmExtension, MeetingVoteExecutionConfirmationV04.mmExtension, MeetingResultDisseminationV04.mmExtension, IntraPositionMovementInstructionV01.mmExtension,
						IntraPositionMovementStatusAdviceV01.mmExtension, SecuritiesFinancingModificationInstructionV01.mmExtension, SecuritiesFinancingStatusAdviceV01.mmExtension,
						SecuritiesSettlementAllegementRemovalAdviceV01.mmExtension, SecuritiesSettlementTransactionAllegementNotificationV01.mmExtension, SecuritiesSettlementTransactionReversalAdviceV01.mmExtension,
						SecuritiesStatementQueryV01.mmExtension, SecuritiesStatusOrStatementQueryStatusAdviceV01.mmExtension, SecuritiesTransactionCancellationRequestStatusAdviceV01.mmExtension,
						SecuritiesTransactionCancellationRequestV01.mmExtension, SecuritiesTransactionStatusQueryV01.mmExtension, CorporateActionNarrativeV01.mmExtension);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Extension2";
				definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public void setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = placeAndName;
	}

	public ExtensionEnvelope1 getExtensionEnvelope() {
		return extensionEnvelope;
	}

	public void setExtensionEnvelope(com.tools20022.repository.msg.ExtensionEnvelope1 extensionEnvelope) {
		this.extensionEnvelope = extensionEnvelope;
	}
}