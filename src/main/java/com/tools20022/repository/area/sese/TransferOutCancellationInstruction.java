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

package com.tools20022.repository.area.sese;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.SecuritiesSettlementArchive;
import com.tools20022.repository.msg.AdditionalReference2;
import com.tools20022.repository.msg.TransferOut2;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * <b>Scope</b><br>
 * The TransferOutCancellationInstruction message is sent by an instructing
 * party or an instructing party's designated agent to the executing party.<br>
 * This message is used to request the cancellation of a TransferOutInstruction
 * that was previously sent by the instructing party.<br>
 * <b>Usage</b><br>
 * The TransferOutCancellationInstruction message is sent by an instructing
 * party to request cancellation of a previously sent TransferOutInstruction.<br>
 * This message must contain the reference of the message to be cancelled. The
 * message may also contain all the details of the message to be cancelled, but
 * this is not recommended.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code sese.002.001.01}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesSettlementArchive
 * SecuritiesSettlementArchive}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlName
 * xmlName} = "sese.002.001.01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "sese.002.001.01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationInstruction#mmPreviousReference
 * TransferOutCancellationInstruction.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationInstruction#mmPoolReference
 * TransferOutCancellationInstruction.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationInstruction#mmRelatedReference
 * TransferOutCancellationInstruction.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationInstruction#mmTransferOutToBeCancelled
 * TransferOutCancellationInstruction.mmTransferOutToBeCancelled}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TransferOutCancellationInstruction"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe TransferOutCancellationInstruction message is sent by an instructing party or an instructing party's designated agent to the executing party.\r\nThis message is used to request the cancellation of a TransferOutInstruction that was previously sent by the instructing party.\r\nUsage\r\nThe TransferOutCancellationInstruction message is sent by an instructing party to request cancellation of a previously sent TransferOutInstruction.\r\nThis message must contain the reference of the message to be cancelled. The message may also contain all the details of the message to be cancelled, but this is not recommended."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationRequestV02
 * TransferOutCancellationRequestV02}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class TransferOutCancellationInstruction {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected AdditionalReference2 previousReference;
	/**
	 * Reference to a linked message that was previously sent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference2
	 * AdditionalReference2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference to a linked message that was previously sent."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPreviousReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "PrvsRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousReference";
			definition = "Reference to a linked message that was previously sent.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AdditionalReference2.mmObject();
		}
	};
	protected AdditionalReference2 poolReference;
	/**
	 * Collective reference identifying a set of messages.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference2
	 * AdditionalReference2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PoolRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PoolReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Collective reference identifying a set of messages."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPoolReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "PoolRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoolReference";
			definition = "Collective reference identifying a set of messages.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference2.mmObject();
		}
	};
	protected AdditionalReference2 relatedReference;
	/**
	 * Reference to a linked message that was previously received.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference2
	 * AdditionalReference2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to a linked message that was previously received."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmRelatedReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "RltdRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReference";
			definition = "Reference to a linked message that was previously received.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference2.mmObject();
		}
	};
	protected TransferOut2 transferOutToBeCancelled;
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.TransferOut2
	 * TransferOut2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfOutToBeCanc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferOutToBeCancelled"</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTransferOutToBeCancelled = new MMMessageBuildingBlock() {
		{
			xmlTag = "TrfOutToBeCanc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferOutToBeCancelled";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TransferOut2.mmObject();
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransferOutCancellationInstruction";
				definition = "Scope\r\nThe TransferOutCancellationInstruction message is sent by an instructing party or an instructing party's designated agent to the executing party.\r\nThis message is used to request the cancellation of a TransferOutInstruction that was previously sent by the instructing party.\r\nUsage\r\nThe TransferOutCancellationInstruction message is sent by an instructing party to request cancellation of a previously sent TransferOutInstruction.\r\nThis message must contain the reference of the message to be cancelled. The message may also contain all the details of the message to be cancelled, but this is not recommended.";
				nextVersions_lazy = () -> Arrays.asList(TransferOutCancellationRequestV02.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "sese.002.001.01";
				businessArea_lazy = () -> SecuritiesSettlementArchive.mmObject();
				xmlName = "sese.002.001.01";
				messageBuildingBlock_lazy = () -> Arrays.asList(TransferOutCancellationInstruction.mmPreviousReference, TransferOutCancellationInstruction.mmPoolReference, TransferOutCancellationInstruction.mmRelatedReference,
						TransferOutCancellationInstruction.mmTransferOutToBeCancelled);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "sese";
						messageFunctionality = "002";
						version = "01";
						flavour = "001";
					}
				};
			}
		});
		return mmObject_lazy.get();
	}

	public AdditionalReference2 getPreviousReference() {
		return previousReference;
	}

	public void setPreviousReference(AdditionalReference2 previousReference) {
		this.previousReference = previousReference;
	}

	public AdditionalReference2 getPoolReference() {
		return poolReference;
	}

	public void setPoolReference(AdditionalReference2 poolReference) {
		this.poolReference = poolReference;
	}

	public AdditionalReference2 getRelatedReference() {
		return relatedReference;
	}

	public void setRelatedReference(AdditionalReference2 relatedReference) {
		this.relatedReference = relatedReference;
	}

	public TransferOut2 getTransferOutToBeCancelled() {
		return transferOutToBeCancelled;
	}

	public void setTransferOutToBeCancelled(TransferOut2 transferOutToBeCancelled) {
		this.transferOutToBeCancelled = transferOutToBeCancelled;
	}
}