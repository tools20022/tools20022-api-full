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
import com.tools20022.repository.choice.Cancellation4Choice;
import com.tools20022.repository.msg.CopyInformation2;
import com.tools20022.repository.msg.MarketPracticeVersion1;
import com.tools20022.repository.msg.MessageIdentification1;
import com.tools20022.repository.msg.References15;
import com.tools20022.repository.msgset.ISOArchive;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An instructing party, for example, an investment manager or its authorised
 * representative, sends the TransferOutCancellationRequest message to the
 * executing party, for example, a transfer agent, to request the cancellation
 * of a previously sent TransferOutInstruction.<br>
 * <b>Usage</b><br>
 * The TransferOutCancellationRequest message is used to request cancellation of
 * a previously sent TransferOutInstruction. There are two ways to specify the
 * transfer cancellation request. Either:<br>
 * - the transfer reference of the original transfer is quoted, or,<br>
 * - all the details of the original transfer (this includes TransferReference)
 * are quoted but this is not recommended.<br>
 * The message identification of the TransferOutInstruction message in which the
 * original transfer was conveyed may also be quoted in PreviousReference. It is
 * also possible to request the cancellation of a TransferOutInstruction message
 * by quoting its message identification in PreviousReference.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationRequestV05#mmMessageIdentification
 * TransferOutCancellationRequestV05.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationRequestV05#mmReferences
 * TransferOutCancellationRequestV05.mmReferences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationRequestV05#mmCancellation
 * TransferOutCancellationRequestV05.mmCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationRequestV05#mmMarketPracticeVersion
 * TransferOutCancellationRequestV05.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationRequestV05#mmCopyDetails
 * TransferOutCancellationRequestV05.mmCopyDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "TrfOutCxlReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesSettlementArchive
 * SecuritiesSettlementArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code sese.002.001.05}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TransferOutCancellationRequestV05"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn instructing party, for example, an investment manager or its authorised representative, sends the TransferOutCancellationRequest message to the executing party, for example, a transfer agent, to request the cancellation of a previously sent TransferOutInstruction.\r\nUsage\r\nThe TransferOutCancellationRequest message is used to request cancellation of a previously sent TransferOutInstruction. There are two ways to specify the transfer cancellation request. Either:\r\n- the transfer reference of the original transfer is quoted, or,\r\n- all the details of the original transfer (this includes TransferReference) are quoted but this is not recommended.\r\nThe message identification of the TransferOutInstruction message in which the original transfer was conveyed may also be quoted in PreviousReference. It is also possible to request the cancellation of a TransferOutInstruction message by quoting its message identification in PreviousReference."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationRequestV06
 * TransferOutCancellationRequestV06}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationRequestV04
 * TransferOutCancellationRequestV04}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TransferOutCancellationRequestV05", propOrder = {"messageIdentification", "references", "cancellation", "marketPracticeVersion", "copyDetails"})
public class TransferOutCancellationRequestV05 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MsgId", required = true)
	protected MessageIdentification1 messageIdentification;
	/**
	 * 
	 <p>
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
	 * "Reference that uniquely identifies a message from a business application standpoint."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationRequestV06#mmMessageIdentification
	 * TransferOutCancellationRequestV06.mmMessageIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationRequestV04#mmMessageIdentification
	 * TransferOutCancellationRequestV04.mmMessageIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMessageIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Reference that uniquely identifies a message from a business application standpoint.";
			nextVersions_lazy = () -> Arrays.asList(TransferOutCancellationRequestV06.mmMessageIdentification);
			previousVersion_lazy = () -> TransferOutCancellationRequestV04.mmMessageIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TransferOutCancellationRequestV05.class.getMethod("getMessageIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "Refs")
	protected List<References15> references;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.References15
	 * References15}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationRequestV06#mmReferences
	 * TransferOutCancellationRequestV06.mmReferences}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationRequestV04#mmReferences
	 * TransferOutCancellationRequestV04.mmReferences}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmReferences = new MMMessageBuildingBlock() {
		{
			xmlTag = "Refs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "References";
			definition = "Reference to the transaction identifier issued by the counterparty. Building block may also be used to reference a previous transaction, or tie a set of messages together.";
			nextVersions_lazy = () -> Arrays.asList(TransferOutCancellationRequestV06.mmReferences);
			previousVersion_lazy = () -> TransferOutCancellationRequestV04.mmReferences;
			minOccurs = 0;
			complexType_lazy = () -> References15.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TransferOutCancellationRequestV05.class.getMethod("getReferences", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "Cxl", required = true)
	protected List<Cancellation4Choice> cancellation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Cancellation4Choice
	 * Cancellation4Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cxl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancellation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Choice between cancellation by reference or by transfer details."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationRequestV06#mmCancellation
	 * TransferOutCancellationRequestV06.mmCancellation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationRequestV04#mmCancellation
	 * TransferOutCancellationRequestV04.mmCancellation}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCancellation = new MMMessageBuildingBlock() {
		{
			xmlTag = "Cxl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancellation";
			definition = "Choice between cancellation by reference or by transfer details.";
			nextVersions_lazy = () -> Arrays.asList(TransferOutCancellationRequestV06.mmCancellation);
			previousVersion_lazy = () -> TransferOutCancellationRequestV04.mmCancellation;
			minOccurs = 1;
			complexType_lazy = () -> Cancellation4Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TransferOutCancellationRequestV05.class.getMethod("getCancellation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "MktPrctcVrsn")
	protected MarketPracticeVersion1 marketPracticeVersion;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MarketPracticeVersion1
	 * MarketPracticeVersion1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MktPrctcVrsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketPracticeVersion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the market practice to which the message conforms."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationRequestV06#mmMarketPracticeVersion
	 * TransferOutCancellationRequestV06.mmMarketPracticeVersion}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMarketPracticeVersion = new MMMessageBuildingBlock() {
		{
			xmlTag = "MktPrctcVrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketPracticeVersion";
			definition = "Identifies the market practice to which the message conforms.";
			nextVersions_lazy = () -> Arrays.asList(TransferOutCancellationRequestV06.mmMarketPracticeVersion);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MarketPracticeVersion1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TransferOutCancellationRequestV05.class.getMethod("getMarketPracticeVersion", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "CpyDtls")
	protected CopyInformation2 copyDetails;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationRequestV06#mmCopyDetails
	 * TransferOutCancellationRequestV06.mmCopyDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationRequestV04#mmCopyDetails
	 * TransferOutCancellationRequestV04.mmCopyDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCopyDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "CpyDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CopyDetails";
			definition = "Information provided when the message is a copy of a previous message.";
			nextVersions_lazy = () -> Arrays.asList(TransferOutCancellationRequestV06.mmCopyDetails);
			previousVersion_lazy = () -> TransferOutCancellationRequestV04.mmCopyDetails;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CopyInformation2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TransferOutCancellationRequestV05.class.getMethod("getCopyDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransferOutCancellationRequestV05";
				definition = "Scope\r\nAn instructing party, for example, an investment manager or its authorised representative, sends the TransferOutCancellationRequest message to the executing party, for example, a transfer agent, to request the cancellation of a previously sent TransferOutInstruction.\r\nUsage\r\nThe TransferOutCancellationRequest message is used to request cancellation of a previously sent TransferOutInstruction. There are two ways to specify the transfer cancellation request. Either:\r\n- the transfer reference of the original transfer is quoted, or,\r\n- all the details of the original transfer (this includes TransferReference) are quoted but this is not recommended.\r\nThe message identification of the TransferOutInstruction message in which the original transfer was conveyed may also be quoted in PreviousReference. It is also possible to request the cancellation of a TransferOutInstruction message by quoting its message identification in PreviousReference.";
				nextVersions_lazy = () -> Arrays.asList(TransferOutCancellationRequestV06.mmObject());
				previousVersion_lazy = () -> TransferOutCancellationRequestV04.mmObject();
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "TrfOutCxlReq";
				businessArea_lazy = () -> SecuritiesSettlementArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.sese.TransferOutCancellationRequestV05.mmMessageIdentification,
						com.tools20022.repository.area.sese.TransferOutCancellationRequestV05.mmReferences, com.tools20022.repository.area.sese.TransferOutCancellationRequestV05.mmCancellation,
						com.tools20022.repository.area.sese.TransferOutCancellationRequestV05.mmMarketPracticeVersion, com.tools20022.repository.area.sese.TransferOutCancellationRequestV05.mmCopyDetails);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "sese";
						messageFunctionality = "002";
						version = "05";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return TransferOutCancellationRequestV05.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getMessageIdentification() {
		return messageIdentification;
	}

	public TransferOutCancellationRequestV05 setMessageIdentification(MessageIdentification1 messageIdentification) {
		this.messageIdentification = Objects.requireNonNull(messageIdentification);
		return this;
	}

	public List<References15> getReferences() {
		return references == null ? references = new ArrayList<>() : references;
	}

	public TransferOutCancellationRequestV05 setReferences(List<References15> references) {
		this.references = Objects.requireNonNull(references);
		return this;
	}

	public List<Cancellation4Choice> getCancellation() {
		return cancellation == null ? cancellation = new ArrayList<>() : cancellation;
	}

	public TransferOutCancellationRequestV05 setCancellation(List<Cancellation4Choice> cancellation) {
		this.cancellation = Objects.requireNonNull(cancellation);
		return this;
	}

	public Optional<MarketPracticeVersion1> getMarketPracticeVersion() {
		return marketPracticeVersion == null ? Optional.empty() : Optional.of(marketPracticeVersion);
	}

	public TransferOutCancellationRequestV05 setMarketPracticeVersion(MarketPracticeVersion1 marketPracticeVersion) {
		this.marketPracticeVersion = marketPracticeVersion;
		return this;
	}

	public Optional<CopyInformation2> getCopyDetails() {
		return copyDetails == null ? Optional.empty() : Optional.of(copyDetails);
	}

	public TransferOutCancellationRequestV05 setCopyDetails(CopyInformation2 copyDetails) {
		this.copyDetails = copyDetails;
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.002.001.05")
	static public class Document {
		@XmlElement(name = "TrfOutCxlReq", required = true)
		public TransferOutCancellationRequestV05 messageBody;
	}
}