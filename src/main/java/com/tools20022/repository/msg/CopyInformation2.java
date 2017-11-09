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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.sese.*;
import com.tools20022.repository.area.setr.*;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
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
 * <li>
 * {@linkplain com.tools20022.repository.msg.CopyInformation2#mmCopyIndicator
 * CopyInformation2.mmCopyIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CopyInformation2#mmOriginalReceiver
 * CopyInformation2.mmOriginalReceiver}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV02#mmCopyDetails
 * ReversalOfTransferInConfirmationV02.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV03#mmCopyDetails
 * ReversalOfTransferInConfirmationV03.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV04#mmCopyDetails
 * ReversalOfTransferInConfirmationV04.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV02#mmCopyDetails
 * ReversalOfTransferOutConfirmationV02.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV03#mmCopyDetails
 * ReversalOfTransferOutConfirmationV03.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV04#mmCopyDetails
 * ReversalOfTransferOutConfirmationV04.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationRequestV02#mmCopyDetails
 * TransferInCancellationRequestV02.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationRequestV03#mmCopyDetails
 * TransferInCancellationRequestV03.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationRequestV04#mmCopyDetails
 * TransferInCancellationRequestV04.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV02#mmCopyDetails
 * TransferInConfirmationV02.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV03#mmCopyDetails
 * TransferInConfirmationV03.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV04#mmCopyDetails
 * TransferInConfirmationV04.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV02#mmCopyDetails
 * TransferInInstructionV02.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV03#mmCopyDetails
 * TransferInInstructionV03.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV04#mmCopyDetails
 * TransferInInstructionV04.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationRequestV02#mmCopyDetails
 * TransferOutCancellationRequestV02.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationRequestV03#mmCopyDetails
 * TransferOutCancellationRequestV03.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationRequestV04#mmCopyDetails
 * TransferOutCancellationRequestV04.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV02#mmCopyDetails
 * TransferOutConfirmationV02.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV03#mmCopyDetails
 * TransferOutConfirmationV03.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV04#mmCopyDetails
 * TransferOutConfirmationV04.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV02#mmCopyDetails
 * TransferOutInstructionV02.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV03#mmCopyDetails
 * TransferOutInstructionV03.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV04#mmCopyDetails
 * TransferOutInstructionV04.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderCancellationRequestV03#mmCopyDetails
 * RedemptionBulkOrderCancellationRequestV03.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationAmendmentV01#mmCopyDetails
 * RedemptionBulkOrderConfirmationAmendmentV01.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationCancellationInstructionV01#mmCopyDetails
 * RedemptionBulkOrderConfirmationCancellationInstructionV01.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationV03#mmCopyDetails
 * RedemptionBulkOrderConfirmationV03.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderV03#mmCopyDetails
 * RedemptionBulkOrderV03.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderCancellationRequestV03#mmCopyDetails
 * RedemptionOrderCancellationRequestV03.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationAmendmentV01#mmCopyDetails
 * RedemptionOrderConfirmationAmendmentV01.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationCancellationInstructionV01#mmCopyDetails
 * RedemptionOrderConfirmationCancellationInstructionV01.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationV03#mmCopyDetails
 * RedemptionOrderConfirmationV03.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderV03#mmCopyDetails
 * RedemptionOrderV03.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderCancellationRequestV03#mmCopyDetails
 * SubscriptionBulkOrderCancellationRequestV03.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationAmendmentV01#mmCopyDetails
 * SubscriptionBulkOrderConfirmationAmendmentV01.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV01#mmCopyDetails
 * SubscriptionBulkOrderConfirmationCancellationInstructionV01.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV03#mmCopyDetails
 * SubscriptionBulkOrderConfirmationV03.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderV03#mmCopyDetails
 * SubscriptionBulkOrderV03.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderCancellationRequestV03#mmCopyDetails
 * SubscriptionOrderCancellationRequestV03.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationAmendmentV01#mmCopyDetails
 * SubscriptionOrderConfirmationAmendmentV01.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationV03#mmCopyDetails
 * SubscriptionOrderConfirmationV03.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderV03#mmCopyDetails
 * SubscriptionOrderV03.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderCancellationRequestV03#mmCopyDetails
 * SwitchOrderCancellationRequestV03.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationAmendmentV01#mmCopyDetails
 * SwitchOrderConfirmationAmendmentV01.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV01#mmCopyDetails
 * SwitchOrderConfirmationCancellationInstructionV01.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationV03#mmCopyDetails
 * SwitchOrderConfirmationV03.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderV03#mmCopyDetails
 * SwitchOrderV03.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV05#mmCopyDetails
 * ReversalOfTransferInConfirmationV05.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV05#mmCopyDetails
 * TransferInConfirmationV05.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV05#mmCopyDetails
 * TransferOutInstructionV05.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV05#mmCopyDetails
 * TransferInInstructionV05.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationRequestV05#mmCopyDetails
 * TransferInCancellationRequestV05.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV05#mmCopyDetails
 * TransferOutConfirmationV05.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV05#mmCopyDetails
 * ReversalOfTransferOutConfirmationV05.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationRequestV05#mmCopyDetails
 * TransferOutCancellationRequestV05.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV06#mmCopyDetails
 * TransferInInstructionV06.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV06#mmCopyDetails
 * TransferOutConfirmationV06.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV06#mmCopyDetails
 * TransferOutInstructionV06.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationRequestV06#mmCopyDetails
 * TransferOutCancellationRequestV06.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV06#mmCopyDetails
 * TransferInConfirmationV06.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV06#mmCopyDetails
 * ReversalOfTransferOutConfirmationV06.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationRequestV06#mmCopyDetails
 * TransferInCancellationRequestV06.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV06#mmCopyDetails
 * ReversalOfTransferInConfirmationV06.mmCopyDetails}</li>
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
	protected YesNoIndicator copyIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.CopyInformation4#mmCopyIndicator
	 * CopyInformation4.mmCopyIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCopyIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CopyInformation2.mmObject();
			isDerived = false;
			xmlTag = "CpyInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CopyIndicator";
			definition = "Indicates whether the message is a copy.";
			nextVersions_lazy = () -> Arrays.asList(CopyInformation4.mmCopyIndicator);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected BICIdentification1 originalReceiver;
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
	 * {@linkplain com.tools20022.repository.msg.CopyInformation4#mmOriginalReceiver
	 * CopyInformation4.mmOriginalReceiver}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalReceiver = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CopyInformation2.mmObject();
			isDerived = false;
			xmlTag = "OrgnlRcvr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalReceiver";
			definition = "Original receiver of the message, if this message is a copy.";
			nextVersions_lazy = () -> Arrays.asList(CopyInformation4.mmOriginalReceiver);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.BICIdentification1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CopyInformation2.mmCopyIndicator, CopyInformation2.mmOriginalReceiver);
				messageBuildingBlock_lazy = () -> Arrays.asList(ReversalOfTransferInConfirmationV02.mmCopyDetails, ReversalOfTransferInConfirmationV03.mmCopyDetails, ReversalOfTransferInConfirmationV04.mmCopyDetails,
						ReversalOfTransferOutConfirmationV02.mmCopyDetails, ReversalOfTransferOutConfirmationV03.mmCopyDetails, ReversalOfTransferOutConfirmationV04.mmCopyDetails, TransferInCancellationRequestV02.mmCopyDetails,
						TransferInCancellationRequestV03.mmCopyDetails, TransferInCancellationRequestV04.mmCopyDetails, TransferInConfirmationV02.mmCopyDetails, TransferInConfirmationV03.mmCopyDetails,
						TransferInConfirmationV04.mmCopyDetails, TransferInInstructionV02.mmCopyDetails, TransferInInstructionV03.mmCopyDetails, TransferInInstructionV04.mmCopyDetails, TransferOutCancellationRequestV02.mmCopyDetails,
						TransferOutCancellationRequestV03.mmCopyDetails, TransferOutCancellationRequestV04.mmCopyDetails, TransferOutConfirmationV02.mmCopyDetails, TransferOutConfirmationV03.mmCopyDetails,
						TransferOutConfirmationV04.mmCopyDetails, TransferOutInstructionV02.mmCopyDetails, TransferOutInstructionV03.mmCopyDetails, TransferOutInstructionV04.mmCopyDetails,
						RedemptionBulkOrderCancellationRequestV03.mmCopyDetails, RedemptionBulkOrderConfirmationAmendmentV01.mmCopyDetails, RedemptionBulkOrderConfirmationCancellationInstructionV01.mmCopyDetails,
						RedemptionBulkOrderConfirmationV03.mmCopyDetails, RedemptionBulkOrderV03.mmCopyDetails, RedemptionOrderCancellationRequestV03.mmCopyDetails, RedemptionOrderConfirmationAmendmentV01.mmCopyDetails,
						RedemptionOrderConfirmationCancellationInstructionV01.mmCopyDetails, RedemptionOrderConfirmationV03.mmCopyDetails, RedemptionOrderV03.mmCopyDetails, SubscriptionBulkOrderCancellationRequestV03.mmCopyDetails,
						SubscriptionBulkOrderConfirmationAmendmentV01.mmCopyDetails, SubscriptionBulkOrderConfirmationCancellationInstructionV01.mmCopyDetails, SubscriptionBulkOrderConfirmationV03.mmCopyDetails,
						SubscriptionBulkOrderV03.mmCopyDetails, SubscriptionOrderCancellationRequestV03.mmCopyDetails, SubscriptionOrderConfirmationAmendmentV01.mmCopyDetails, SubscriptionOrderConfirmationV03.mmCopyDetails,
						SubscriptionOrderV03.mmCopyDetails, SwitchOrderCancellationRequestV03.mmCopyDetails, SwitchOrderConfirmationAmendmentV01.mmCopyDetails, SwitchOrderConfirmationCancellationInstructionV01.mmCopyDetails,
						SwitchOrderConfirmationV03.mmCopyDetails, SwitchOrderV03.mmCopyDetails, ReversalOfTransferInConfirmationV05.mmCopyDetails, TransferInConfirmationV05.mmCopyDetails, TransferOutInstructionV05.mmCopyDetails,
						TransferInInstructionV05.mmCopyDetails, TransferInCancellationRequestV05.mmCopyDetails, TransferOutConfirmationV05.mmCopyDetails, ReversalOfTransferOutConfirmationV05.mmCopyDetails,
						TransferOutCancellationRequestV05.mmCopyDetails, TransferInInstructionV06.mmCopyDetails, TransferOutConfirmationV06.mmCopyDetails, TransferOutInstructionV06.mmCopyDetails,
						TransferOutCancellationRequestV06.mmCopyDetails, TransferInConfirmationV06.mmCopyDetails, ReversalOfTransferOutConfirmationV06.mmCopyDetails, TransferInCancellationRequestV06.mmCopyDetails,
						ReversalOfTransferInConfirmationV06.mmCopyDetails);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CopyInformation2";
				definition = "Information provided when the message is a copy of a previous message.";
				nextVersions_lazy = () -> Arrays.asList(CopyInformation4.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public YesNoIndicator getCopyIndicator() {
		return copyIndicator;
	}

	public void setCopyIndicator(YesNoIndicator copyIndicator) {
		this.copyIndicator = copyIndicator;
	}

	public BICIdentification1 getOriginalReceiver() {
		return originalReceiver;
	}

	public void setOriginalReceiver(com.tools20022.repository.msg.BICIdentification1 originalReceiver) {
		this.originalReceiver = originalReceiver;
	}
}