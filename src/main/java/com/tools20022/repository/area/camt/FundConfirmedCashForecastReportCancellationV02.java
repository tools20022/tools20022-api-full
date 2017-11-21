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

package com.tools20022.repository.area.camt;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.CashManagementPreviousVersion;
import com.tools20022.repository.msg.AdditionalReference3;
import com.tools20022.repository.msg.FundConfirmedCashForecastReport2;
import com.tools20022.repository.msg.MessageIdentification1;
import com.tools20022.repository.msg.Pagination;
import com.tools20022.repository.msgset.InvestmentFundsISOPreviousversion;
import com.tools20022.repository.msgset.ISOArchive;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * A report provider, such as a transfer agent, sends the
 * FundConfirmedCashForecastReportCancellation message to the report user, such
 * as an investment manager, to cancel a previously sent
 * FundConfirmedCashForecastReport message.<br>
 * <b>Usage</b><br>
 * The FundConfirmedCashForecastReportCancellation message is used to cancel an
 * entire FundConfirmedCashForecastReport message that was previously sent by
 * the report provider. This message must contain reference to the of the
 * message being cancelled.<br>
 * This message may also contain details of the message to be cancelled, but
 * this is not recommended.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementPreviousVersion
 * CashManagementPreviousVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.InvestmentFundsISOPreviousversion
 * InvestmentFundsISOPreviousversion}</li>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "FndConfdCshFcstRptCxlV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV02#mmMessageIdentification
 * FundConfirmedCashForecastReportCancellationV02.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV02#mmPoolReference
 * FundConfirmedCashForecastReportCancellationV02.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV02#mmPreviousReference
 * FundConfirmedCashForecastReportCancellationV02.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV02#mmRelatedReference
 * FundConfirmedCashForecastReportCancellationV02.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV02#mmMessagePagination
 * FundConfirmedCashForecastReportCancellationV02.mmMessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV02#mmCashForecastReportToBeCancelled
 * FundConfirmedCashForecastReportCancellationV02.
 * mmCashForecastReportToBeCancelled}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code camt.044.001.02}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FundConfirmedCashForecastReportCancellationV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nA report provider, such as a transfer agent, sends the FundConfirmedCashForecastReportCancellation message to the report user, such as an investment manager, to cancel a previously sent FundConfirmedCashForecastReport message.\r\nUsage\r\nThe FundConfirmedCashForecastReportCancellation message is used to cancel an entire FundConfirmedCashForecastReport message that was previously sent by the report provider. This message must contain reference to the of the message being cancelled.\r\nThis message may also contain details of the message to be cancelled, but this is not recommended."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV03
 * FundConfirmedCashForecastReportCancellationV03}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV01
 * FundConfirmedCashForecastReportCancellationV01}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "FundConfirmedCashForecastReportCancellationV02", propOrder = {"messageIdentification", "poolReference", "previousReference", "relatedReference", "messagePagination", "cashForecastReportToBeCancelled"})
public class FundConfirmedCashForecastReportCancellationV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected MessageIdentification1 messageIdentification;
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
	 * xmlTag} = "MsgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the message."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV03#mmMessageIdentification
	 * FundConfirmedCashForecastReportCancellationV03.mmMessageIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMessageIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Identifies the message.";
			nextVersions_lazy = () -> Arrays.asList(FundConfirmedCashForecastReportCancellationV03.mmMessageIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return FundConfirmedCashForecastReportCancellationV02.class.getMethod("getMessageIdentification", new Class[]{});
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
	 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV03#mmPoolReference
	 * FundConfirmedCashForecastReportCancellationV03.mmPoolReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPoolReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "PoolRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoolReference";
			definition = "Collective reference identifying a set of messages.";
			nextVersions_lazy = () -> Arrays.asList(FundConfirmedCashForecastReportCancellationV03.mmPoolReference);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return FundConfirmedCashForecastReportCancellationV02.class.getMethod("getPoolReference", new Class[]{});
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
	 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV03#mmPreviousReference
	 * FundConfirmedCashForecastReportCancellationV03.mmPreviousReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPreviousReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "PrvsRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousReference";
			definition = "Reference to a linked message that was previously sent.";
			nextVersions_lazy = () -> Arrays.asList(FundConfirmedCashForecastReportCancellationV03.mmPreviousReference);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return FundConfirmedCashForecastReportCancellationV02.class.getMethod("getPreviousReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<AdditionalReference3> relatedReference;
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
	 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV03#mmRelatedReference
	 * FundConfirmedCashForecastReportCancellationV03.mmRelatedReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmRelatedReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "RltdRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReference";
			definition = "Reference to a linked message that was previously received.";
			nextVersions_lazy = () -> Arrays.asList(FundConfirmedCashForecastReportCancellationV03.mmRelatedReference);
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return FundConfirmedCashForecastReportCancellationV02.class.getMethod("getRelatedReference", new Class[]{});
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV03#mmMessagePagination
	 * FundConfirmedCashForecastReportCancellationV03.mmMessagePagination}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMessagePagination = new MMMessageBuildingBlock() {
		{
			xmlTag = "MsgPgntn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessagePagination";
			definition = "Pagination of the message.";
			nextVersions_lazy = () -> Arrays.asList(FundConfirmedCashForecastReportCancellationV03.mmMessagePagination);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Pagination.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return FundConfirmedCashForecastReportCancellationV02.class.getMethod("getMessagePagination", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected FundConfirmedCashForecastReport2 cashForecastReportToBeCancelled;
	/**
	 * The FundDetailedConfirmedCashForecastReport to be cancelled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FundConfirmedCashForecastReport2
	 * FundConfirmedCashForecastReport2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshFcstRptToBeCanc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashForecastReportToBeCancelled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The FundDetailedConfirmedCashForecastReport to be cancelled."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV03#mmCashForecastReportToBeCancelled
	 * FundConfirmedCashForecastReportCancellationV03.
	 * mmCashForecastReportToBeCancelled}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCashForecastReportToBeCancelled = new MMMessageBuildingBlock() {
		{
			xmlTag = "CshFcstRptToBeCanc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashForecastReportToBeCancelled";
			definition = "The FundDetailedConfirmedCashForecastReport to be cancelled.";
			nextVersions_lazy = () -> Arrays.asList(FundConfirmedCashForecastReportCancellationV03.mmCashForecastReportToBeCancelled);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FundConfirmedCashForecastReport2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return FundConfirmedCashForecastReportCancellationV02.class.getMethod("getCashForecastReportToBeCancelled", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FundConfirmedCashForecastReportCancellationV02";
				definition = "Scope\r\nA report provider, such as a transfer agent, sends the FundConfirmedCashForecastReportCancellation message to the report user, such as an investment manager, to cancel a previously sent FundConfirmedCashForecastReport message.\r\nUsage\r\nThe FundConfirmedCashForecastReportCancellation message is used to cancel an entire FundConfirmedCashForecastReport message that was previously sent by the report provider. This message must contain reference to the of the message being cancelled.\r\nThis message may also contain details of the message to be cancelled, but this is not recommended.";
				nextVersions_lazy = () -> Arrays.asList(FundConfirmedCashForecastReportCancellationV03.mmObject());
				previousVersion_lazy = () -> FundConfirmedCashForecastReportCancellationV01.mmObject();
				messageSet_lazy = () -> Arrays.asList(InvestmentFundsISOPreviousversion.mmObject(), ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "FndConfdCshFcstRptCxlV02";
				businessArea_lazy = () -> CashManagementPreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV02.mmMessageIdentification,
						com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV02.mmPoolReference, com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV02.mmPreviousReference,
						com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV02.mmRelatedReference, com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV02.mmMessagePagination,
						com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV02.mmCashForecastReportToBeCancelled);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "camt";
						messageFunctionality = "044";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return FundConfirmedCashForecastReportCancellationV02.class;
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

	@XmlElement(name = "PrvsRef")
	public AdditionalReference3 getPreviousReference() {
		return previousReference;
	}

	public void setPreviousReference(AdditionalReference3 previousReference) {
		this.previousReference = previousReference;
	}

	@XmlElement(name = "RltdRef")
	public List<AdditionalReference3> getRelatedReference() {
		return relatedReference;
	}

	public void setRelatedReference(List<AdditionalReference3> relatedReference) {
		this.relatedReference = relatedReference;
	}

	@XmlElement(name = "MsgPgntn", required = true)
	public Pagination getMessagePagination() {
		return messagePagination;
	}

	public void setMessagePagination(Pagination messagePagination) {
		this.messagePagination = messagePagination;
	}

	@XmlElement(name = "CshFcstRptToBeCanc")
	public FundConfirmedCashForecastReport2 getCashForecastReportToBeCancelled() {
		return cashForecastReportToBeCancelled;
	}

	public void setCashForecastReportToBeCancelled(FundConfirmedCashForecastReport2 cashForecastReportToBeCancelled) {
		this.cashForecastReportToBeCancelled = cashForecastReportToBeCancelled;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:camt.044.02.02")
	static public class Document {
		@XmlElement(name = "FndConfdCshFcstRptCxlV02", required = true)
		public FundConfirmedCashForecastReportCancellationV02 messageBody;
	}
}