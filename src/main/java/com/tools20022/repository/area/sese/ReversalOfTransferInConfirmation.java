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
import com.tools20022.repository.msg.TransferIn1;
import com.tools20022.repository.msgset.ISOArchive;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The ReversalOfTransferInConfirmation message is sent by an executing party to
 * the instructing party or the instructing party's designated agent.<br>
 * This message is used to reverse a TransferInConfirmation that was previously
 * sent by the instructing party.<br>
 * <b>Usage</b><br>
 * The ReversalOfTransferInConfirmation message is sent by an executing party to
 * reverse a previously sent TransferInConfirmation.<br>
 * This message must contain the reference of the message to be reversed. The
 * message may also contain all the details of the reversed message, but this is
 * not recommended.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
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
 * xmlName} = "sese.008.001.01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "sese.008.001.01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferInConfirmation#mmPreviousReference
 * ReversalOfTransferInConfirmation.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferInConfirmation#mmPoolReference
 * ReversalOfTransferInConfirmation.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferInConfirmation#mmRelatedReference
 * ReversalOfTransferInConfirmation.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferInConfirmation#mmTransferInConfirmationToBeReversed
 * ReversalOfTransferInConfirmation.mmTransferInConfirmationToBeReversed}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code sese.008.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ReversalOfTransferInConfirmation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe ReversalOfTransferInConfirmation message is sent by an executing party to the instructing party or the instructing party's designated agent.\r\nThis message is used to reverse a TransferInConfirmation that was previously sent by the instructing party.\r\nUsage\r\nThe ReversalOfTransferInConfirmation message is sent by an executing party to reverse a previously sent TransferInConfirmation.\r\nThis message must contain the reference of the message to be reversed. The message may also contain all the details of the reversed message, but this is not recommended."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV02
 * ReversalOfTransferInConfirmationV02}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "sese.008.001.01", propOrder = {"previousReference", "poolReference", "relatedReference", "transferInConfirmationToBeReversed"})
public class ReversalOfTransferInConfirmation {

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

		public Method getGetterMethod() {
			try {
				return ReversalOfTransferInConfirmation.class.getMethod("getPreviousReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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

		public Method getGetterMethod() {
			try {
				return ReversalOfTransferInConfirmation.class.getMethod("getPoolReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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

		public Method getGetterMethod() {
			try {
				return ReversalOfTransferInConfirmation.class.getMethod("getRelatedReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TransferIn1 transferInConfirmationToBeReversed;
	/**
	 * Copy of the transfer in confirmation to reverse.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.TransferIn1
	 * TransferIn1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfInConfToBeRvsd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferInConfirmationToBeReversed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Copy of the transfer in confirmation to reverse."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTransferInConfirmationToBeReversed = new MMMessageBuildingBlock() {
		{
			xmlTag = "TrfInConfToBeRvsd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferInConfirmationToBeReversed";
			definition = "Copy of the transfer in confirmation to reverse.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TransferIn1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ReversalOfTransferInConfirmation.class.getMethod("getTransferInConfirmationToBeReversed", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ReversalOfTransferInConfirmation";
				definition = "Scope\r\nThe ReversalOfTransferInConfirmation message is sent by an executing party to the instructing party or the instructing party's designated agent.\r\nThis message is used to reverse a TransferInConfirmation that was previously sent by the instructing party.\r\nUsage\r\nThe ReversalOfTransferInConfirmation message is sent by an executing party to reverse a previously sent TransferInConfirmation.\r\nThis message must contain the reference of the message to be reversed. The message may also contain all the details of the reversed message, but this is not recommended.";
				nextVersions_lazy = () -> Arrays.asList(ReversalOfTransferInConfirmationV02.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "sese.008.001.01";
				businessArea_lazy = () -> SecuritiesSettlementArchive.mmObject();
				xmlName = "sese.008.001.01";
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.sese.ReversalOfTransferInConfirmation.mmPreviousReference, com.tools20022.repository.area.sese.ReversalOfTransferInConfirmation.mmPoolReference,
						com.tools20022.repository.area.sese.ReversalOfTransferInConfirmation.mmRelatedReference, com.tools20022.repository.area.sese.ReversalOfTransferInConfirmation.mmTransferInConfirmationToBeReversed);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "sese";
						messageFunctionality = "008";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return ReversalOfTransferInConfirmation.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "PrvsRef", required = true)
	public AdditionalReference2 getPreviousReference() {
		return previousReference;
	}

	public void setPreviousReference(AdditionalReference2 previousReference) {
		this.previousReference = previousReference;
	}

	@XmlElement(name = "PoolRef")
	public AdditionalReference2 getPoolReference() {
		return poolReference;
	}

	public void setPoolReference(AdditionalReference2 poolReference) {
		this.poolReference = poolReference;
	}

	@XmlElement(name = "RltdRef")
	public AdditionalReference2 getRelatedReference() {
		return relatedReference;
	}

	public void setRelatedReference(AdditionalReference2 relatedReference) {
		this.relatedReference = relatedReference;
	}

	@XmlElement(name = "TrfInConfToBeRvsd")
	public TransferIn1 getTransferInConfirmationToBeReversed() {
		return transferInConfirmationToBeReversed;
	}

	public void setTransferInConfirmationToBeReversed(TransferIn1 transferInConfirmationToBeReversed) {
		this.transferInConfirmationToBeReversed = transferInConfirmationToBeReversed;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:sese.008.01.01")
	static public class Document {
		@XmlElement(name = "sese.008.001.01", required = true)
		public ReversalOfTransferInConfirmation messageBody;
	}
}