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
 * <li>{@linkplain com.tools20022.repository.msg.CopyInformation2#CopyIndicator
 * CopyInformation2.CopyIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CopyInformation2#OriginalReceiver
 * CopyInformation2.OriginalReceiver}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV02#CopyDetails
 * ReversalOfTransferInConfirmationV02.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV03#CopyDetails
 * ReversalOfTransferInConfirmationV03.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV04#CopyDetails
 * ReversalOfTransferInConfirmationV04.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV02#CopyDetails
 * ReversalOfTransferOutConfirmationV02.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV03#CopyDetails
 * ReversalOfTransferOutConfirmationV03.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV04#CopyDetails
 * ReversalOfTransferOutConfirmationV04.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationRequestV02#CopyDetails
 * TransferInCancellationRequestV02.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationRequestV03#CopyDetails
 * TransferInCancellationRequestV03.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationRequestV04#CopyDetails
 * TransferInCancellationRequestV04.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV02#CopyDetails
 * TransferInConfirmationV02.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV03#CopyDetails
 * TransferInConfirmationV03.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV04#CopyDetails
 * TransferInConfirmationV04.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV02#CopyDetails
 * TransferInInstructionV02.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV03#CopyDetails
 * TransferInInstructionV03.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV04#CopyDetails
 * TransferInInstructionV04.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationRequestV02#CopyDetails
 * TransferOutCancellationRequestV02.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationRequestV03#CopyDetails
 * TransferOutCancellationRequestV03.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationRequestV04#CopyDetails
 * TransferOutCancellationRequestV04.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV02#CopyDetails
 * TransferOutConfirmationV02.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV03#CopyDetails
 * TransferOutConfirmationV03.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV04#CopyDetails
 * TransferOutConfirmationV04.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV02#CopyDetails
 * TransferOutInstructionV02.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV03#CopyDetails
 * TransferOutInstructionV03.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV04#CopyDetails
 * TransferOutInstructionV04.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderCancellationRequestV03#CopyDetails
 * RedemptionBulkOrderCancellationRequestV03.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationAmendmentV01#CopyDetails
 * RedemptionBulkOrderConfirmationAmendmentV01.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationCancellationInstructionV01#CopyDetails
 * RedemptionBulkOrderConfirmationCancellationInstructionV01.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationV03#CopyDetails
 * RedemptionBulkOrderConfirmationV03.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderV03#CopyDetails
 * RedemptionBulkOrderV03.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderCancellationRequestV03#CopyDetails
 * RedemptionOrderCancellationRequestV03.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationAmendmentV01#CopyDetails
 * RedemptionOrderConfirmationAmendmentV01.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationCancellationInstructionV01#CopyDetails
 * RedemptionOrderConfirmationCancellationInstructionV01.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationV03#CopyDetails
 * RedemptionOrderConfirmationV03.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderV03#CopyDetails
 * RedemptionOrderV03.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderCancellationRequestV03#CopyDetails
 * SubscriptionBulkOrderCancellationRequestV03.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationAmendmentV01#CopyDetails
 * SubscriptionBulkOrderConfirmationAmendmentV01.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV01#CopyDetails
 * SubscriptionBulkOrderConfirmationCancellationInstructionV01.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV03#CopyDetails
 * SubscriptionBulkOrderConfirmationV03.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderV03#CopyDetails
 * SubscriptionBulkOrderV03.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderCancellationRequestV03#CopyDetails
 * SubscriptionOrderCancellationRequestV03.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationAmendmentV01#CopyDetails
 * SubscriptionOrderConfirmationAmendmentV01.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationV03#CopyDetails
 * SubscriptionOrderConfirmationV03.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderV03#CopyDetails
 * SubscriptionOrderV03.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderCancellationRequestV03#CopyDetails
 * SwitchOrderCancellationRequestV03.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationAmendmentV01#CopyDetails
 * SwitchOrderConfirmationAmendmentV01.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV01#CopyDetails
 * SwitchOrderConfirmationCancellationInstructionV01.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationV03#CopyDetails
 * SwitchOrderConfirmationV03.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderV03#CopyDetails
 * SwitchOrderV03.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV05#CopyDetails
 * ReversalOfTransferInConfirmationV05.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV05#CopyDetails
 * TransferInConfirmationV05.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV05#CopyDetails
 * TransferOutInstructionV05.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV05#CopyDetails
 * TransferInInstructionV05.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationRequestV05#CopyDetails
 * TransferInCancellationRequestV05.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV05#CopyDetails
 * TransferOutConfirmationV05.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV05#CopyDetails
 * ReversalOfTransferOutConfirmationV05.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationRequestV05#CopyDetails
 * TransferOutCancellationRequestV05.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV06#CopyDetails
 * TransferInInstructionV06.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV06#CopyDetails
 * TransferOutConfirmationV06.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV06#CopyDetails
 * TransferOutInstructionV06.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationRequestV06#CopyDetails
 * TransferOutCancellationRequestV06.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV06#CopyDetails
 * TransferInConfirmationV06.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV06#CopyDetails
 * ReversalOfTransferOutConfirmationV06.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationRequestV06#CopyDetails
 * TransferInCancellationRequestV06.CopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV06#CopyDetails
 * ReversalOfTransferInConfirmationV06.CopyDetails}</li>
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
 * "CopyInformation2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information provided when the message is a copy of a previous message."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CopyInformation4
 * CopyInformation4}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class CopyInformation2 {

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
	 * {@linkplain com.tools20022.repository.msg.CopyInformation2
	 * CopyInformation2}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CopyInformation4#CopyIndicator
	 * CopyInformation4.CopyIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute CopyIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CopyInformation2.mmObject();
			isDerived = false;
			xmlTag = "CpyInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CopyIndicator";
			definition = "Indicates whether the message is a copy.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CopyInformation4.CopyIndicator);
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
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.BICIdentification1
	 * BICIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CopyInformation2
	 * CopyInformation2}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CopyInformation4#OriginalReceiver
	 * CopyInformation4.OriginalReceiver}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute OriginalReceiver = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CopyInformation2.mmObject();
			isDerived = false;
			xmlTag = "OrgnlRcvr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalReceiver";
			definition = "Original receiver of the message, if this message is a copy.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CopyInformation4.OriginalReceiver);
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> BICIdentification1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CopyInformation2.CopyIndicator, com.tools20022.repository.msg.CopyInformation2.OriginalReceiver);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV02.CopyDetails, com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV03.CopyDetails,
						com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV04.CopyDetails, com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV02.CopyDetails,
						com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV03.CopyDetails, com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV04.CopyDetails,
						com.tools20022.repository.area.sese.TransferInCancellationRequestV02.CopyDetails, com.tools20022.repository.area.sese.TransferInCancellationRequestV03.CopyDetails,
						com.tools20022.repository.area.sese.TransferInCancellationRequestV04.CopyDetails, com.tools20022.repository.area.sese.TransferInConfirmationV02.CopyDetails,
						com.tools20022.repository.area.sese.TransferInConfirmationV03.CopyDetails, com.tools20022.repository.area.sese.TransferInConfirmationV04.CopyDetails,
						com.tools20022.repository.area.sese.TransferInInstructionV02.CopyDetails, com.tools20022.repository.area.sese.TransferInInstructionV03.CopyDetails,
						com.tools20022.repository.area.sese.TransferInInstructionV04.CopyDetails, com.tools20022.repository.area.sese.TransferOutCancellationRequestV02.CopyDetails,
						com.tools20022.repository.area.sese.TransferOutCancellationRequestV03.CopyDetails, com.tools20022.repository.area.sese.TransferOutCancellationRequestV04.CopyDetails,
						com.tools20022.repository.area.sese.TransferOutConfirmationV02.CopyDetails, com.tools20022.repository.area.sese.TransferOutConfirmationV03.CopyDetails,
						com.tools20022.repository.area.sese.TransferOutConfirmationV04.CopyDetails, com.tools20022.repository.area.sese.TransferOutInstructionV02.CopyDetails,
						com.tools20022.repository.area.sese.TransferOutInstructionV03.CopyDetails, com.tools20022.repository.area.sese.TransferOutInstructionV04.CopyDetails,
						com.tools20022.repository.area.setr.RedemptionBulkOrderCancellationRequestV03.CopyDetails, com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationAmendmentV01.CopyDetails,
						com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationCancellationInstructionV01.CopyDetails, com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationV03.CopyDetails,
						com.tools20022.repository.area.setr.RedemptionBulkOrderV03.CopyDetails, com.tools20022.repository.area.setr.RedemptionOrderCancellationRequestV03.CopyDetails,
						com.tools20022.repository.area.setr.RedemptionOrderConfirmationAmendmentV01.CopyDetails, com.tools20022.repository.area.setr.RedemptionOrderConfirmationCancellationInstructionV01.CopyDetails,
						com.tools20022.repository.area.setr.RedemptionOrderConfirmationV03.CopyDetails, com.tools20022.repository.area.setr.RedemptionOrderV03.CopyDetails,
						com.tools20022.repository.area.setr.SubscriptionBulkOrderCancellationRequestV03.CopyDetails, com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationAmendmentV01.CopyDetails,
						com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV01.CopyDetails, com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV03.CopyDetails,
						com.tools20022.repository.area.setr.SubscriptionBulkOrderV03.CopyDetails, com.tools20022.repository.area.setr.SubscriptionOrderCancellationRequestV03.CopyDetails,
						com.tools20022.repository.area.setr.SubscriptionOrderConfirmationAmendmentV01.CopyDetails, com.tools20022.repository.area.setr.SubscriptionOrderConfirmationV03.CopyDetails,
						com.tools20022.repository.area.setr.SubscriptionOrderV03.CopyDetails, com.tools20022.repository.area.setr.SwitchOrderCancellationRequestV03.CopyDetails,
						com.tools20022.repository.area.setr.SwitchOrderConfirmationAmendmentV01.CopyDetails, com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV01.CopyDetails,
						com.tools20022.repository.area.setr.SwitchOrderConfirmationV03.CopyDetails, com.tools20022.repository.area.setr.SwitchOrderV03.CopyDetails,
						com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV05.CopyDetails, com.tools20022.repository.area.sese.TransferInConfirmationV05.CopyDetails,
						com.tools20022.repository.area.sese.TransferOutInstructionV05.CopyDetails, com.tools20022.repository.area.sese.TransferInInstructionV05.CopyDetails,
						com.tools20022.repository.area.sese.TransferInCancellationRequestV05.CopyDetails, com.tools20022.repository.area.sese.TransferOutConfirmationV05.CopyDetails,
						com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV05.CopyDetails, com.tools20022.repository.area.sese.TransferOutCancellationRequestV05.CopyDetails,
						com.tools20022.repository.area.sese.TransferInInstructionV06.CopyDetails, com.tools20022.repository.area.sese.TransferOutConfirmationV06.CopyDetails,
						com.tools20022.repository.area.sese.TransferOutInstructionV06.CopyDetails, com.tools20022.repository.area.sese.TransferOutCancellationRequestV06.CopyDetails,
						com.tools20022.repository.area.sese.TransferInConfirmationV06.CopyDetails, com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV06.CopyDetails,
						com.tools20022.repository.area.sese.TransferInCancellationRequestV06.CopyDetails, com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV06.CopyDetails);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CopyInformation2";
				definition = "Information provided when the message is a copy of a previous message.";
				nextVersions_lazy = () -> Arrays.asList(CopyInformation4.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}