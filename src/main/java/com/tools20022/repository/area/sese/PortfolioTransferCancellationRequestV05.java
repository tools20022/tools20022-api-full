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
import com.tools20022.repository.choice.Cancellation6Choice;
import com.tools20022.repository.msg.AdditionalReference3;
import com.tools20022.repository.msg.MarketPracticeVersion1;
import com.tools20022.repository.msg.MessageIdentification1;
import com.tools20022.repository.msgset.ISOArchive;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An instructing party, for example, a (new) plan manager (Transferee), sends
 * the PortfolioTransferCancellationRequest message to the executing party, for
 * example, a (old) plan manager (Transferor), to request the cancellation of a
 * previously sent PortfolioTransferInstruction.<br>
 * <b>Usage</b><br>
 * The PortfolioTransferCancellationRequest message is used to request the
 * cancellation of an entire PortfolioTransferInstruction message, ie, all the
 * product transfers that it contained. The cancellation request can be
 * specified either by:<br>
 * - quoting the transfer references of all the product transfers listed in the
 * PortfolioTransferInstruction message, or,<br>
 * - quoting the details of all the product transfers (this includes
 * TransferReference) listed in PortfolioTransferInstruction message.<br>
 * The message identification of the PortfolioTransferInstruction may also be
 * quoted in PreviousReference. It is also possible to request the cancellation
 * of PortfolioTransferInstruction by just quoting its message identification in
 * PreviousReference.
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
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "PrtflTrfCxlReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV05#mmMessageReference
 * PortfolioTransferCancellationRequestV05.mmMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV05#mmPoolReference
 * PortfolioTransferCancellationRequestV05.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV05#mmPreviousReference
 * PortfolioTransferCancellationRequestV05.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV05#mmRelatedReference
 * PortfolioTransferCancellationRequestV05.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV05#mmCancellation
 * PortfolioTransferCancellationRequestV05.mmCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV05#mmMarketPracticeVersion
 * PortfolioTransferCancellationRequestV05.mmMarketPracticeVersion}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code sese.014.001.05}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PortfolioTransferCancellationRequestV05"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn instructing party, for example, a (new) plan manager (Transferee), sends the PortfolioTransferCancellationRequest message to the executing party, for example, a (old) plan manager (Transferor), to request the cancellation of a previously sent PortfolioTransferInstruction.\r\nUsage\r\nThe PortfolioTransferCancellationRequest message is used to request the cancellation of an entire PortfolioTransferInstruction message, ie, all the product transfers that it contained. The cancellation request can be specified either by:\r\n- quoting the transfer references of all the product transfers listed in the PortfolioTransferInstruction message, or,\r\n- quoting the details of all the product transfers (this includes TransferReference) listed in PortfolioTransferInstruction message.\r\nThe message identification of the PortfolioTransferInstruction may also be quoted in PreviousReference. It is also possible to request the cancellation of PortfolioTransferInstruction by just quoting its message identification in PreviousReference."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV06
 * PortfolioTransferCancellationRequestV06}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV04
 * PortfolioTransferCancellationRequestV04}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "PortfolioTransferCancellationRequestV05", propOrder = {"messageReference", "poolReference", "previousReference", "relatedReference", "cancellation", "marketPracticeVersion"})
public class PortfolioTransferCancellationRequestV05 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected MessageIdentification1 messageReference;
	/**
	 * Identifies the message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the message."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV06#mmMessageReference
	 * PortfolioTransferCancellationRequestV06.mmMessageReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV04#mmMessageReference
	 * PortfolioTransferCancellationRequestV04.mmMessageReference}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMessageReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "MsgRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageReference";
			definition = "Identifies the message.";
			nextVersions_lazy = () -> Arrays.asList(PortfolioTransferCancellationRequestV06.mmMessageReference);
			previousVersion_lazy = () -> PortfolioTransferCancellationRequestV04.mmMessageReference;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PortfolioTransferCancellationRequestV05.class.getMethod("getMessageReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AdditionalReference3 poolReference;
	/**
	 * Collective reference identifying a set of messages.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference3
	 * AdditionalReference3}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV06#mmPoolReference
	 * PortfolioTransferCancellationRequestV06.mmPoolReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV04#mmPoolReference
	 * PortfolioTransferCancellationRequestV04.mmPoolReference}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPoolReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "PoolRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoolReference";
			definition = "Collective reference identifying a set of messages.";
			nextVersions_lazy = () -> Arrays.asList(PortfolioTransferCancellationRequestV06.mmPoolReference);
			previousVersion_lazy = () -> PortfolioTransferCancellationRequestV04.mmPoolReference;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PortfolioTransferCancellationRequestV05.class.getMethod("getPoolReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AdditionalReference3 previousReference;
	/**
	 * Reference to a linked message that was previously sent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference3
	 * AdditionalReference3}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV06#mmPreviousReference
	 * PortfolioTransferCancellationRequestV06.mmPreviousReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV04#mmPreviousReference
	 * PortfolioTransferCancellationRequestV04.mmPreviousReference}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPreviousReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "PrvsRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousReference";
			definition = "Reference to a linked message that was previously sent.";
			nextVersions_lazy = () -> Arrays.asList(PortfolioTransferCancellationRequestV06.mmPreviousReference);
			previousVersion_lazy = () -> PortfolioTransferCancellationRequestV04.mmPreviousReference;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PortfolioTransferCancellationRequestV05.class.getMethod("getPreviousReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AdditionalReference3 relatedReference;
	/**
	 * Reference to a linked message that was previously received.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference3
	 * AdditionalReference3}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV06#mmRelatedReference
	 * PortfolioTransferCancellationRequestV06.mmRelatedReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV04#mmRelatedReference
	 * PortfolioTransferCancellationRequestV04.mmRelatedReference}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmRelatedReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "RltdRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReference";
			definition = "Reference to a linked message that was previously received.";
			nextVersions_lazy = () -> Arrays.asList(PortfolioTransferCancellationRequestV06.mmRelatedReference);
			previousVersion_lazy = () -> PortfolioTransferCancellationRequestV04.mmRelatedReference;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PortfolioTransferCancellationRequestV05.class.getMethod("getRelatedReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Cancellation6Choice cancellation;
	/**
	 * Choice between cancellation by transfer details or reference.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Cancellation6Choice
	 * Cancellation6Choice}</li>
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
	 * "Choice between cancellation by transfer details or reference."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV06#mmCancellation
	 * PortfolioTransferCancellationRequestV06.mmCancellation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV04#mmCancellation
	 * PortfolioTransferCancellationRequestV04.mmCancellation}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCancellation = new MMMessageBuildingBlock() {
		{
			xmlTag = "Cxl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancellation";
			definition = "Choice between cancellation by transfer details or reference.";
			nextVersions_lazy = () -> Arrays.asList(PortfolioTransferCancellationRequestV06.mmCancellation);
			previousVersion_lazy = () -> PortfolioTransferCancellationRequestV04.mmCancellation;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Cancellation6Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PortfolioTransferCancellationRequestV05.class.getMethod("getCancellation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected MarketPracticeVersion1 marketPracticeVersion;
	/**
	 * Identifies the market practice to which the message conforms.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV06#mmMarketPracticeVersion
	 * PortfolioTransferCancellationRequestV06.mmMarketPracticeVersion}</li>
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
			nextVersions_lazy = () -> Arrays.asList(PortfolioTransferCancellationRequestV06.mmMarketPracticeVersion);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MarketPracticeVersion1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PortfolioTransferCancellationRequestV05.class.getMethod("getMarketPracticeVersion", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PortfolioTransferCancellationRequestV05";
				definition = "Scope\r\nAn instructing party, for example, a (new) plan manager (Transferee), sends the PortfolioTransferCancellationRequest message to the executing party, for example, a (old) plan manager (Transferor), to request the cancellation of a previously sent PortfolioTransferInstruction.\r\nUsage\r\nThe PortfolioTransferCancellationRequest message is used to request the cancellation of an entire PortfolioTransferInstruction message, ie, all the product transfers that it contained. The cancellation request can be specified either by:\r\n- quoting the transfer references of all the product transfers listed in the PortfolioTransferInstruction message, or,\r\n- quoting the details of all the product transfers (this includes TransferReference) listed in PortfolioTransferInstruction message.\r\nThe message identification of the PortfolioTransferInstruction may also be quoted in PreviousReference. It is also possible to request the cancellation of PortfolioTransferInstruction by just quoting its message identification in PreviousReference.";
				nextVersions_lazy = () -> Arrays.asList(PortfolioTransferCancellationRequestV06.mmObject());
				previousVersion_lazy = () -> PortfolioTransferCancellationRequestV04.mmObject();
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "PrtflTrfCxlReq";
				businessArea_lazy = () -> SecuritiesSettlementArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV05.mmMessageReference,
						com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV05.mmPoolReference, com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV05.mmPreviousReference,
						com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV05.mmRelatedReference, com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV05.mmCancellation,
						com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV05.mmMarketPracticeVersion);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "sese";
						messageFunctionality = "014";
						version = "05";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return PortfolioTransferCancellationRequestV05.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "MsgRef", required = true)
	public MessageIdentification1 getMessageReference() {
		return messageReference;
	}

	public void setMessageReference(MessageIdentification1 messageReference) {
		this.messageReference = messageReference;
	}

	@XmlElement(name = "PoolRef")
	public AdditionalReference3 getPoolReference() {
		return poolReference;
	}

	public void setPoolReference(AdditionalReference3 poolReference) {
		this.poolReference = poolReference;
	}

	@XmlElement(name = "PrvsRef")
	public AdditionalReference3 getPreviousReference() {
		return previousReference;
	}

	public void setPreviousReference(AdditionalReference3 previousReference) {
		this.previousReference = previousReference;
	}

	@XmlElement(name = "RltdRef")
	public AdditionalReference3 getRelatedReference() {
		return relatedReference;
	}

	public void setRelatedReference(AdditionalReference3 relatedReference) {
		this.relatedReference = relatedReference;
	}

	@XmlElement(name = "Cxl", required = true)
	public Cancellation6Choice getCancellation() {
		return cancellation;
	}

	public void setCancellation(Cancellation6Choice cancellation) {
		this.cancellation = cancellation;
	}

	@XmlElement(name = "MktPrctcVrsn")
	public MarketPracticeVersion1 getMarketPracticeVersion() {
		return marketPracticeVersion;
	}

	public void setMarketPracticeVersion(MarketPracticeVersion1 marketPracticeVersion) {
		this.marketPracticeVersion = marketPracticeVersion;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:sese.014.05.05")
	static public class Document {
		@XmlElement(name = "PrtflTrfCxlReq", required = true)
		public PortfolioTransferCancellationRequestV05 messageBody;
	}
}