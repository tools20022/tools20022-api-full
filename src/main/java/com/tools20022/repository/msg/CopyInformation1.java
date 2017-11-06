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
 * <li>
 * {@linkplain com.tools20022.repository.msg.CopyInformation1#mmCopyIndicator
 * CopyInformation1.mmCopyIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CopyInformation1#mmOriginalReceiver
 * CopyInformation1.mmOriginalReceiver}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationV02#mmCopyDetails
 * RedemptionBulkOrderConfirmationV02.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderV02#mmCopyDetails
 * RedemptionBulkOrderV02.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionMultipleOrderConfirmationV02#mmCopyDetails
 * RedemptionMultipleOrderConfirmationV02.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionMultipleOrderV02#mmCopyDetails
 * RedemptionMultipleOrderV02.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV02#mmCopyDetails
 * SubscriptionBulkOrderConfirmationV02.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderV02#mmCopyDetails
 * SubscriptionBulkOrderV02.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationCancellationInstructionV01#mmCopyDetails
 * SubscriptionOrderConfirmationCancellationInstructionV01.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionMultipleOrderConfirmationV02#mmCopyDetails
 * SubscriptionMultipleOrderConfirmationV02.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionMultipleOrderV02#mmCopyDetails
 * SubscriptionMultipleOrderV02.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationV02#mmCopyDetails
 * SwitchOrderConfirmationV02.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderV02#mmCopyDetails
 * SwitchOrderV02.mmCopyDetails}</li>
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
 * "CopyInformation1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information provided when the message is a copy of a previous message."</li>
 * </ul>
 */
public class CopyInformation1 {

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
	 * {@linkplain com.tools20022.repository.msg.CopyInformation1
	 * CopyInformation1}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmCopyIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CopyInformation1.mmObject();
			isDerived = false;
			xmlTag = "CpyInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CopyIndicator";
			definition = "Indicates whether the message is a copy.";
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
	 * {@linkplain com.tools20022.repository.msg.CopyInformation1
	 * CopyInformation1}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalReceiver = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CopyInformation1.mmObject();
			isDerived = false;
			xmlTag = "OrgnlRcvr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalReceiver";
			definition = "Original receiver of the message, if this message is a copy.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.BICIdentification1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CopyInformation1.mmCopyIndicator, com.tools20022.repository.msg.CopyInformation1.mmOriginalReceiver);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationV02.mmCopyDetails, com.tools20022.repository.area.setr.RedemptionBulkOrderV02.mmCopyDetails,
						com.tools20022.repository.area.setr.RedemptionMultipleOrderConfirmationV02.mmCopyDetails, com.tools20022.repository.area.setr.RedemptionMultipleOrderV02.mmCopyDetails,
						com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV02.mmCopyDetails, com.tools20022.repository.area.setr.SubscriptionBulkOrderV02.mmCopyDetails,
						com.tools20022.repository.area.setr.SubscriptionOrderConfirmationCancellationInstructionV01.mmCopyDetails, com.tools20022.repository.area.setr.SubscriptionMultipleOrderConfirmationV02.mmCopyDetails,
						com.tools20022.repository.area.setr.SubscriptionMultipleOrderV02.mmCopyDetails, com.tools20022.repository.area.setr.SwitchOrderConfirmationV02.mmCopyDetails,
						com.tools20022.repository.area.setr.SwitchOrderV02.mmCopyDetails);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CopyInformation1";
				definition = "Information provided when the message is a copy of a previous message.";
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