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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.datatype.AnyBICIdentifier;
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Information provided when the message is a copy of a previous message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CopyInformation4#CopyIndicator
 * CopyInformation4.CopyIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CopyInformation4#OriginalReceiver
 * CopyInformation4.OriginalReceiver}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV07#CopyDetails
 * ReversalOfTransferOutConfirmationV07.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationRequestV07#CopyDetails
 * TransferOutCancellationRequestV07.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV07#CopyDetails
 * TransferInConfirmationV07.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV07#CopyDetails
 * TransferOutConfirmationV07.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationRequestV07#CopyDetails
 * TransferInCancellationRequestV07.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV07#CopyDetails
 * TransferOutInstructionV07.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV07#CopyDetails
 * TransferInInstructionV07.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV07#CopyDetails
 * ReversalOfTransferInConfirmationV07.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV04#CopyDetails
 * SubscriptionBulkOrderConfirmationV04.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderV04#CopyDetails
 * RedemptionBulkOrderV04.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderCancellationRequestV04#CopyDetails
 * SubscriptionBulkOrderCancellationRequestV04.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderV04#CopyDetails
 * RedemptionOrderV04.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderCancellationRequestV04#CopyDetails
 * SubscriptionOrderCancellationRequestV04.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationCancellationInstructionV02#CopyDetails
 * RedemptionBulkOrderConfirmationCancellationInstructionV02.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationV04#CopyDetails
 * RedemptionBulkOrderConfirmationV04.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderCancellationRequestV04#CopyDetails
 * RedemptionBulkOrderCancellationRequestV04.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationV04#CopyDetails
 * SwitchOrderConfirmationV04.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationV04#CopyDetails
 * SubscriptionOrderConfirmationV04.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationCancellationInstructionV02#CopyDetails
 * SubscriptionOrderConfirmationCancellationInstructionV02.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderCancellationRequestV04#CopyDetails
 * SwitchOrderCancellationRequestV04.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderV04#CopyDetails
 * SwitchOrderV04.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationCancellationInstructionV02#CopyDetails
 * RedemptionOrderConfirmationCancellationInstructionV02.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationV04#CopyDetails
 * RedemptionOrderConfirmationV04.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV02#CopyDetails
 * SubscriptionBulkOrderConfirmationCancellationInstructionV02.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderCancellationRequestV04#CopyDetails
 * RedemptionOrderCancellationRequestV04.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderV04#CopyDetails
 * SubscriptionBulkOrderV04.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV02#CopyDetails
 * SwitchOrderConfirmationCancellationInstructionV02.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderV04#CopyDetails
 * SubscriptionOrderV04.CopyDetails}</li>
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
 * "CopyInformation4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information provided when the message is a copy of a previous message."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CopyInformation2 CopyInformation2}</li>
 * </ul>
 */
public class CopyInformation4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates whether the message is a copy.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CopyInformation4
	 * CopyInformation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CpyInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CopyIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the message is a copy."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CopyInformation2#CopyIndicator
	 * CopyInformation2.CopyIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute CopyIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CopyInformation4.mmObject();
			isDerived = false;
			xmlTag = "CpyInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CopyIndicator";
			definition = "Indicates whether the message is a copy.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CopyInformation2.CopyIndicator;
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Original receiver of the message, if this message is a copy.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.AnyBICIdentifier
	 * AnyBICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CopyInformation4
	 * CopyInformation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlRcvr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalReceiver"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Original receiver of the message, if this message is a copy."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CopyInformation2#OriginalReceiver
	 * CopyInformation2.OriginalReceiver}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute OriginalReceiver = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CopyInformation4.mmObject();
			isDerived = false;
			xmlTag = "OrgnlRcvr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalReceiver";
			definition = "Original receiver of the message, if this message is a copy.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CopyInformation2.OriginalReceiver;
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> AnyBICIdentifier.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CopyInformation4.CopyIndicator, com.tools20022.repository.msg.CopyInformation4.OriginalReceiver);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV07.CopyDetails, com.tools20022.repository.area.sese.TransferOutCancellationRequestV07.CopyDetails,
						com.tools20022.repository.area.sese.TransferInConfirmationV07.CopyDetails, com.tools20022.repository.area.sese.TransferOutConfirmationV07.CopyDetails,
						com.tools20022.repository.area.sese.TransferInCancellationRequestV07.CopyDetails, com.tools20022.repository.area.sese.TransferOutInstructionV07.CopyDetails,
						com.tools20022.repository.area.sese.TransferInInstructionV07.CopyDetails, com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV07.CopyDetails,
						com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV04.CopyDetails, com.tools20022.repository.area.setr.RedemptionBulkOrderV04.CopyDetails,
						com.tools20022.repository.area.setr.SubscriptionBulkOrderCancellationRequestV04.CopyDetails, com.tools20022.repository.area.setr.RedemptionOrderV04.CopyDetails,
						com.tools20022.repository.area.setr.SubscriptionOrderCancellationRequestV04.CopyDetails, com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationCancellationInstructionV02.CopyDetails,
						com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationV04.CopyDetails, com.tools20022.repository.area.setr.RedemptionBulkOrderCancellationRequestV04.CopyDetails,
						com.tools20022.repository.area.setr.SwitchOrderConfirmationV04.CopyDetails, com.tools20022.repository.area.setr.SubscriptionOrderConfirmationV04.CopyDetails,
						com.tools20022.repository.area.setr.SubscriptionOrderConfirmationCancellationInstructionV02.CopyDetails, com.tools20022.repository.area.setr.SwitchOrderCancellationRequestV04.CopyDetails,
						com.tools20022.repository.area.setr.SwitchOrderV04.CopyDetails, com.tools20022.repository.area.setr.RedemptionOrderConfirmationCancellationInstructionV02.CopyDetails,
						com.tools20022.repository.area.setr.RedemptionOrderConfirmationV04.CopyDetails, com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV02.CopyDetails,
						com.tools20022.repository.area.setr.RedemptionOrderCancellationRequestV04.CopyDetails, com.tools20022.repository.area.setr.SubscriptionBulkOrderV04.CopyDetails,
						com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV02.CopyDetails, com.tools20022.repository.area.setr.SubscriptionOrderV04.CopyDetails);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CopyInformation4";
				definition = "Information provided when the message is a copy of a previous message.";
				previousVersion_lazy = () -> CopyInformation2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}