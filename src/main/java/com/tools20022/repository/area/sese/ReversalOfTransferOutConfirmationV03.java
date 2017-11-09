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

import com.tools20022.metamodel.*;
import com.tools20022.repository.area.SecuritiesSettlementArchive;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * <b>Scope</b><br>
 * An executing party, for example, a transfer agent, sends the
 * ReversalOfTransferOutConfirmation message to the instructing party, for
 * example, an investment manager or its authorised representative, to cancel a
 * previously sent TransferOutConfirmation message.<br>
 * <b>Usage</b><br>
 * The ReversalOfTransferOutConfirmation message is used to reverse a previously
 * sent TransferOutConfirmation.<br>
 * There are two ways to specify the reversal of the transfer out confirmation.
 * Either:<br>
 * - the business references, for example, TransferReference,
 * TransferConfirmationIdentification, of the transfer confirmation are quoted,
 * or,<br>
 * - all the details of the transfer confirmation (this includes
 * TransferReference and TransferConfirmationIdentification) are quoted but this
 * is not recommended.<br>
 * The message identification of the TransferOutConfirmation message in which
 * the transfer out confirmation was conveyed may also be quoted in
 * PreviousReference. The message identification of the TransferOutInstruction
 * message in which the transfer out instruction was conveyed may also be quoted
 * in RelatedReference.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code sese.004.001.03}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "RvslOfTrfOutConf"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV03#mmOperation1
 * ReversalOfTransferOutConfirmationV03.mmOperation1}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV03#mmMessageIdentification
 * ReversalOfTransferOutConfirmationV03.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV03#mmReferences
 * ReversalOfTransferOutConfirmationV03.mmReferences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV03#mmReversalByReference
 * ReversalOfTransferOutConfirmationV03.mmReversalByReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV03#mmReversalByTransferOutConfirmationDetails
 * ReversalOfTransferOutConfirmationV03.
 * mmReversalByTransferOutConfirmationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV03#mmCopyDetails
 * ReversalOfTransferOutConfirmationV03.mmCopyDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ReversalOfTransferOutConfirmationV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn executing party, for example, a transfer agent, sends the ReversalOfTransferOutConfirmation message to the instructing party, for example, an investment manager or its authorised representative, to cancel a previously sent TransferOutConfirmation message.\r\nUsage\r\nThe ReversalOfTransferOutConfirmation message is used to reverse a previously sent TransferOutConfirmation.\r\nThere are two ways to specify the reversal of the transfer out confirmation. Either:\r\n- the business references, for example, TransferReference, TransferConfirmationIdentification, of the transfer confirmation are quoted, or,\r\n- all the details of the transfer confirmation (this includes TransferReference and TransferConfirmationIdentification) are quoted but this is not recommended.\r\nThe message identification of the TransferOutConfirmation message in which the transfer out confirmation was conveyed may also be quoted in PreviousReference. The message identification of the TransferOutInstruction message in which the transfer out instruction was conveyed may also be quoted in RelatedReference."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV04
 * ReversalOfTransferOutConfirmationV04}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV02
 * ReversalOfTransferOutConfirmationV02}</li>
 * </ul>
 */
public class ReversalOfTransferOutConfirmationV03 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMXor#getImpactedMessageBuildingBlocks
	 * impactedMessageBuildingBlocks} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV03#mmReversalByReference
	 * ReversalOfTransferOutConfirmationV03.mmReversalByReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV03#mmReversalByTransferOutConfirmationDetails
	 * ReversalOfTransferOutConfirmationV03.
	 * mmReversalByTransferOutConfirmationDetails}</li>
	 * </ul>
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageDefinition
	 * messageDefinition} =
	 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV03
	 * ReversalOfTransferOutConfirmationV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Operation1"</li>
	 * </ul>
	 */
	public static final MMXor mmOperation1 = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Operation1";
			messageDefinition_lazy = () -> ReversalOfTransferOutConfirmationV03.mmObject();
			impactedMessageBuildingBlocks_lazy = () -> Arrays.asList(ReversalOfTransferOutConfirmationV03.mmReversalByReference, ReversalOfTransferOutConfirmationV03.mmReversalByTransferOutConfirmationDetails);
		}
	};
	protected MessageIdentification1 messageIdentification;
	/**
	 * Reference that uniquely identifies a message from a business application
	 * standpoint.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference that uniquely identifies a message from a business application standpoint. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMessageIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Reference that uniquely identifies a message from a business application standpoint. ";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}
	};
	protected List<References11> references;
	/**
	 * Reference to the transaction identifier issued by the counterparty.
	 * Building block may also be used to reference a previous transaction, or
	 * tie a set of messages together.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.References11
	 * References11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Refs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "References"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to the transaction identifier issued by the counterparty. Building block may also be used to reference a previous transaction, or tie a set of messages together."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmReferences = new MMMessageBuildingBlock() {
		{
			xmlTag = "Refs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "References";
			definition = "Reference to the transaction identifier issued by the counterparty. Building block may also be used to reference a previous transaction, or tie a set of messages together.";
			minOccurs = 1;
			complexType_lazy = () -> References11.mmObject();
		}
	};
	protected TransferReference2 reversalByReference;
	/**
	 * Reference of the transfer out confirmation to be reversed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TransferReference2
	 * TransferReference2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RvslByRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversalByReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference of the transfer out confirmation to be reversed."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmReversalByReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "RvslByRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversalByReference";
			definition = "Reference of the transfer out confirmation to be reversed.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TransferReference2.mmObject();
		}
	};
	protected TransferOut8 reversalByTransferOutConfirmationDetails;
	/**
	 * Copy of the transfer out confirmation to reverse.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.TransferOut8
	 * TransferOut8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RvslByTrfOutConfDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversalByTransferOutConfirmationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Copy of the transfer out confirmation to reverse."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmReversalByTransferOutConfirmationDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "RvslByTrfOutConfDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversalByTransferOutConfirmationDetails";
			definition = "Copy of the transfer out confirmation to reverse.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TransferOut8.mmObject();
		}
	};
	protected CopyInformation2 copyDetails;
	/**
	 * Information provided when the message is a copy of a previous message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CopyInformation2
	 * CopyInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CpyDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CopyDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information provided when the message is a copy of a previous message."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCopyDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "CpyDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CopyDetails";
			definition = "Information provided when the message is a copy of a previous message.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CopyInformation2.mmObject();
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ReversalOfTransferOutConfirmationV03";
				definition = "Scope\r\nAn executing party, for example, a transfer agent, sends the ReversalOfTransferOutConfirmation message to the instructing party, for example, an investment manager or its authorised representative, to cancel a previously sent TransferOutConfirmation message.\r\nUsage\r\nThe ReversalOfTransferOutConfirmation message is used to reverse a previously sent TransferOutConfirmation.\r\nThere are two ways to specify the reversal of the transfer out confirmation. Either:\r\n- the business references, for example, TransferReference, TransferConfirmationIdentification, of the transfer confirmation are quoted, or,\r\n- all the details of the transfer confirmation (this includes TransferReference and TransferConfirmationIdentification) are quoted but this is not recommended.\r\nThe message identification of the TransferOutConfirmation message in which the transfer out confirmation was conveyed may also be quoted in PreviousReference. The message identification of the TransferOutInstruction message in which the transfer out instruction was conveyed may also be quoted in RelatedReference.";
				nextVersions_lazy = () -> Arrays.asList(ReversalOfTransferOutConfirmationV04.mmObject());
				previousVersion_lazy = () -> ReversalOfTransferOutConfirmationV02.mmObject();
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				xors_lazy = () -> Arrays.asList(ReversalOfTransferOutConfirmationV03.mmOperation1);
				rootElement = "Document";
				xmlTag = "RvslOfTrfOutConf";
				businessArea_lazy = () -> SecuritiesSettlementArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(ReversalOfTransferOutConfirmationV03.mmMessageIdentification, ReversalOfTransferOutConfirmationV03.mmReferences, ReversalOfTransferOutConfirmationV03.mmReversalByReference,
						ReversalOfTransferOutConfirmationV03.mmReversalByTransferOutConfirmationDetails, ReversalOfTransferOutConfirmationV03.mmCopyDetails);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "sese";
						messageFunctionality = "004";
						version = "03";
						flavour = "001";
					}
				};
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getMessageIdentification() {
		return messageIdentification;
	}

	public void setMessageIdentification(MessageIdentification1 messageIdentification) {
		this.messageIdentification = messageIdentification;
	}

	public List<References11> getReferences() {
		return references;
	}

	public void setReferences(List<References11> references) {
		this.references = references;
	}

	public TransferReference2 getReversalByReference() {
		return reversalByReference;
	}

	public void setReversalByReference(TransferReference2 reversalByReference) {
		this.reversalByReference = reversalByReference;
	}

	public TransferOut8 getReversalByTransferOutConfirmationDetails() {
		return reversalByTransferOutConfirmationDetails;
	}

	public void setReversalByTransferOutConfirmationDetails(TransferOut8 reversalByTransferOutConfirmationDetails) {
		this.reversalByTransferOutConfirmationDetails = reversalByTransferOutConfirmationDetails;
	}

	public CopyInformation2 getCopyDetails() {
		return copyDetails;
	}

	public void setCopyDetails(CopyInformation2 copyDetails) {
		this.copyDetails = copyDetails;
	}
}