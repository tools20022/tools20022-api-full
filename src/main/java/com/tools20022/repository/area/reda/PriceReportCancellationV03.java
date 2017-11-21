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

package com.tools20022.repository.area.reda;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.ReferenceDataPreviousVersion;
import com.tools20022.repository.msg.AdditionalReference3;
import com.tools20022.repository.msg.MessageIdentification1;
import com.tools20022.repository.msg.Pagination;
import com.tools20022.repository.msg.PriceReport2;
import com.tools20022.repository.msgset.ISOArchive;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * A report provider, eg, a transfer agent, fund accountant or market data
 * provider, sends the PriceReportCancellation message to the report recipient,
 * eg, a fund management company, transfer agent, market data provider,
 * regulator or any other interested party to cancel a previously sent
 * PriceReport message.<br>
 * <b>Usage</b><br>
 * The PriceReportCancellation is used to cancel an entire PriceReport message
 * that was previously sent.<br>
 * If only a part of the information needs to be cancelled and replaced, the
 * PriceReportCorrection message must be used.<br>
 * This message must contain the reference of the message to be cancelled.This
 * message may also contain details of the message to be cancelled, but this is
 * not recommended.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.ReferenceDataPreviousVersion
 * ReferenceDataPreviousVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "PricRptCxlV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportCancellationV03#mmMessageIdentification
 * PriceReportCancellationV03.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportCancellationV03#mmPoolReference
 * PriceReportCancellationV03.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportCancellationV03#mmPreviousReference
 * PriceReportCancellationV03.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportCancellationV03#mmMessagePagination
 * PriceReportCancellationV03.mmMessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportCancellationV03#mmPriceReportToBeCancelled
 * PriceReportCancellationV03.mmPriceReportToBeCancelled}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code reda.002.001.03}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PriceReportCancellationV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nA report provider, eg, a transfer agent, fund accountant or market data provider, sends the PriceReportCancellation message to the report recipient, eg, a fund management company, transfer agent, market data provider, regulator or any other interested party to cancel a previously sent PriceReport message.\r\nUsage\r\nThe PriceReportCancellation is used to cancel an entire PriceReport message that was previously sent.\r\nIf only a part of the information needs to be cancelled and replaced, the PriceReportCorrection message must be used.\r\nThis message must contain the reference of the message to be cancelled.This message may also contain details of the message to be cancelled, but this is not recommended."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportCancellationV04
 * PriceReportCancellationV04}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.reda.PriceReportCancellationV02
 * PriceReportCancellationV02}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "PriceReportCancellationV03", propOrder = {"messageIdentification", "poolReference", "previousReference", "messagePagination", "priceReportToBeCancelled"})
public class PriceReportCancellationV03 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
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

		public Method getGetterMethod() {
			try {
				return PriceReportCancellationV03.class.getMethod("getMessageIdentification", new Class[]{});
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
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PriceReportCancellationV03.class.getMethod("getPoolReference", new Class[]{});
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
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PriceReportCancellationV03.class.getMethod("getPreviousReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Pagination messagePagination;
	/**
	 * Pagination of the message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Pagination
	 * Pagination}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgPgntn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessagePagination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Pagination of the message."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMessagePagination = new MMMessageBuildingBlock() {
		{
			xmlTag = "MsgPgntn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessagePagination";
			definition = "Pagination of the message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Pagination.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PriceReportCancellationV03.class.getMethod("getMessagePagination", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PriceReport2 priceReportToBeCancelled;
	/**
	 * Common information related to all the price reports to be cancelled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.PriceReport2
	 * PriceReport2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricRptToBeCanc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceReportToBeCancelled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Common information related to all the price reports to be cancelled."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPriceReportToBeCancelled = new MMMessageBuildingBlock() {
		{
			xmlTag = "PricRptToBeCanc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceReportToBeCancelled";
			definition = "Common information related to all the price reports to be cancelled.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PriceReport2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PriceReportCancellationV03.class.getMethod("getPriceReportToBeCancelled", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PriceReportCancellationV03";
				definition = "Scope\r\nA report provider, eg, a transfer agent, fund accountant or market data provider, sends the PriceReportCancellation message to the report recipient, eg, a fund management company, transfer agent, market data provider, regulator or any other interested party to cancel a previously sent PriceReport message.\r\nUsage\r\nThe PriceReportCancellation is used to cancel an entire PriceReport message that was previously sent.\r\nIf only a part of the information needs to be cancelled and replaced, the PriceReportCorrection message must be used.\r\nThis message must contain the reference of the message to be cancelled.This message may also contain details of the message to be cancelled, but this is not recommended.";
				nextVersions_lazy = () -> Arrays.asList(PriceReportCancellationV04.mmObject());
				previousVersion_lazy = () -> PriceReportCancellationV02.mmObject();
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "PricRptCxlV03";
				businessArea_lazy = () -> ReferenceDataPreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.reda.PriceReportCancellationV03.mmMessageIdentification, com.tools20022.repository.area.reda.PriceReportCancellationV03.mmPoolReference,
						com.tools20022.repository.area.reda.PriceReportCancellationV03.mmPreviousReference, com.tools20022.repository.area.reda.PriceReportCancellationV03.mmMessagePagination,
						com.tools20022.repository.area.reda.PriceReportCancellationV03.mmPriceReportToBeCancelled);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "reda";
						messageFunctionality = "002";
						version = "03";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return PriceReportCancellationV03.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "MsgId", required = true)
	public MessageIdentification1 getMessageIdentification() {
		return messageIdentification;
	}

	public void setMessageIdentification(MessageIdentification1 messageIdentification) {
		this.messageIdentification = messageIdentification;
	}

	@XmlElement(name = "PoolRef")
	public AdditionalReference3 getPoolReference() {
		return poolReference;
	}

	public void setPoolReference(AdditionalReference3 poolReference) {
		this.poolReference = poolReference;
	}

	@XmlElement(name = "PrvsRef", required = true)
	public AdditionalReference3 getPreviousReference() {
		return previousReference;
	}

	public void setPreviousReference(AdditionalReference3 previousReference) {
		this.previousReference = previousReference;
	}

	@XmlElement(name = "MsgPgntn", required = true)
	public Pagination getMessagePagination() {
		return messagePagination;
	}

	public void setMessagePagination(Pagination messagePagination) {
		this.messagePagination = messagePagination;
	}

	@XmlElement(name = "PricRptToBeCanc")
	public PriceReport2 getPriceReportToBeCancelled() {
		return priceReportToBeCancelled;
	}

	public void setPriceReportToBeCancelled(PriceReport2 priceReportToBeCancelled) {
		this.priceReportToBeCancelled = priceReportToBeCancelled;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:reda.002.03.03")
	static public class Document {
		@XmlElement(name = "PricRptCxlV03", required = true)
		public PriceReportCancellationV03 messageBody;
	}
}