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
import com.tools20022.repository.area.CashManagementLatestVersion;
import com.tools20022.repository.msg.AdditionalReference3;
import com.tools20022.repository.msg.FundConfirmedCashForecastReport3;
import com.tools20022.repository.msg.MessageIdentification1;
import com.tools20022.repository.msg.Pagination;
import com.tools20022.repository.msgset.InvestmentFundsISOLatestversion;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * <b>Scope</b><br>
 * A report provider, such as a transfer agent, sends the
 * FundConfirmedCashForecastReportCancellation message to the report user, such
 * as an investment manager or pricing agent, to cancel a previously sent
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
 * {@linkplain com.tools20022.repository.area.CashManagementLatestVersion
 * CashManagementLatestVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.InvestmentFundsISOLatestversion
 * InvestmentFundsISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "FndConfdCshFcstRptCxl"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV03#MessageIdentification
 * FundConfirmedCashForecastReportCancellationV03.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV03#PoolReference
 * FundConfirmedCashForecastReportCancellationV03.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV03#PreviousReference
 * FundConfirmedCashForecastReportCancellationV03.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV03#RelatedReference
 * FundConfirmedCashForecastReportCancellationV03.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV03#MessagePagination
 * FundConfirmedCashForecastReportCancellationV03.MessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV03#CashForecastReportToBeCancelled
 * FundConfirmedCashForecastReportCancellationV03.
 * CashForecastReportToBeCancelled}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} =
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV03#identifier
 * FundConfirmedCashForecastReportCancellationV03.identifier}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FundConfirmedCashForecastReportCancellationV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nA report provider, such as a transfer agent, sends the FundConfirmedCashForecastReportCancellation message to the report user, such as an investment manager or pricing agent, to cancel a previously sent FundConfirmedCashForecastReport message.\r\nUsage\r\nThe FundConfirmedCashForecastReportCancellation message is used to cancel an entire FundConfirmedCashForecastReport message that was previously sent by the report provider. This message must contain reference to the of the message being cancelled.\r\nThis message may also contain details of the message to be cancelled, but this is not recommended."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV02
 * FundConfirmedCashForecastReportCancellationV02}</li>
 * </ul>
 */
public class FundConfirmedCashForecastReportCancellationV03 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV02#MessageIdentification
	 * FundConfirmedCashForecastReportCancellationV02.MessageIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock MessageIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "MsgId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Identifies the message.";
			previousVersion_lazy = () -> com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV02.MessageIdentification;
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}
	};
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV02#PoolReference
	 * FundConfirmedCashForecastReportCancellationV02.PoolReference}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock PoolReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "PoolRef";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoolReference";
			definition = "Collective reference identifying a set of messages.";
			previousVersion_lazy = () -> com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV02.PoolReference;
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}
	};
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV02#PreviousReference
	 * FundConfirmedCashForecastReportCancellationV02.PreviousReference}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock PreviousReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "PrvsRef";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousReference";
			definition = "Reference to a linked message that was previously sent.";
			previousVersion_lazy = () -> com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV02.PreviousReference;
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}
	};
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV02#RelatedReference
	 * FundConfirmedCashForecastReportCancellationV02.RelatedReference}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock RelatedReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "RltdRef";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReference";
			definition = "Reference to a linked message that was previously received.";
			previousVersion_lazy = () -> com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV02.RelatedReference;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}
	};
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV02#MessagePagination
	 * FundConfirmedCashForecastReportCancellationV02.MessagePagination}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock MessagePagination = new MMMessageBuildingBlock() {
		{
			xmlTag = "MsgPgntn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessagePagination";
			definition = "Pagination of the message.";
			previousVersion_lazy = () -> com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV02.MessagePagination;
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> Pagination.mmObject();
		}
	};
	/**
	 * The FundDetailedConfirmedCashForecastReport to be cancelled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FundConfirmedCashForecastReport3
	 * FundConfirmedCashForecastReport3}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV02#CashForecastReportToBeCancelled
	 * FundConfirmedCashForecastReportCancellationV02.
	 * CashForecastReportToBeCancelled}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock CashForecastReportToBeCancelled = new MMMessageBuildingBlock() {
		{
			xmlTag = "CshFcstRptToBeCanc";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashForecastReportToBeCancelled";
			definition = "The FundDetailedConfirmedCashForecastReport to be cancelled.";
			previousVersion_lazy = () -> com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV02.CashForecastReportToBeCancelled;
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> FundConfirmedCashForecastReport3.mmObject();
		}
	};
	/**
	 * An instance of MessageDefinitionIdentifier.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getVersion
	 * version} = "03"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getBusinessArea
	 * businessArea} = "camt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getMessageFunctionality
	 * messageFunctionality} = "044"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getFlavour
	 * flavour} = "001"</li>
	 * </ul>
	 */
	public static final MMMessageDefinitionIdentifier identifier = new MMMessageDefinitionIdentifier() {
		{
			businessArea = "camt";
			messageFunctionality = "044";
			version = "03";
			flavour = "001";
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "FundConfirmedCashForecastReportCancellationV03";
				definition = "Scope\r\nA report provider, such as a transfer agent, sends the FundConfirmedCashForecastReportCancellation message to the report user, such as an investment manager or pricing agent, to cancel a previously sent FundConfirmedCashForecastReport message.\r\nUsage\r\nThe FundConfirmedCashForecastReportCancellation message is used to cancel an entire FundConfirmedCashForecastReport message that was previously sent by the report provider. This message must contain reference to the of the message being cancelled.\r\nThis message may also contain details of the message to be cancelled, but this is not recommended.";
				previousVersion_lazy = () -> FundConfirmedCashForecastReportCancellationV02.mmObject();
				messageSet_lazy = () -> Arrays.asList(InvestmentFundsISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "FndConfdCshFcstRptCxl";
				businessArea_lazy = () -> CashManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV03.MessageIdentification,
						com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV03.PoolReference, com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV03.PreviousReference,
						com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV03.RelatedReference, com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV03.MessagePagination,
						com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV03.CashForecastReportToBeCancelled);
				messageDefinitionIdentifier_lazy = () -> com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV03.identifier;
			}
		});
		return mmObject_lazy.get();
	}
}