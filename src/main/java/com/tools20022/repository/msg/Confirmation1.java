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

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.codeset.ConfirmationRequest1Code;
import com.tools20022.repository.codeset.TradeConfirmationStatus1Code;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35NumericText;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Details of confirmation in the CMU.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Confirmation1#mmConfirmationStatus
 * Confirmation1.mmConfirmationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Confirmation1#mmConfirmationTime
 * Confirmation1.mmConfirmationTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Confirmation1#mmTradePartyConfirmationTime
 * Confirmation1.mmTradePartyConfirmationTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Confirmation1#mmInitiatingPartyConfirmationTime
 * Confirmation1.mmInitiatingPartyConfirmationTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Confirmation1#mmConfirmationType
 * Confirmation1.mmConfirmationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Confirmation1#mmRequestIdentification
 * Confirmation1.mmRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Confirmation1#mmQueryStartNumber
 * Confirmation1.mmQueryStartNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Confirmation1#mmTotalNumberOfReports
 * Confirmation1.mmTotalNumberOfReports}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Confirmation1#mmPageNumber
 * Confirmation1.mmPageNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Confirmation1#mmQueryPageNumber
 * Confirmation1.mmQueryPageNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Confirmation1#mmMessageNumberOfCurrentPage
 * Confirmation1.mmMessageNumberOfCurrentPage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Confirmation1#mmListOrderNumber
 * Confirmation1.mmListOrderNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Confirmation1#mmLastPageIndicator
 * Confirmation1.mmLastPageIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Confirmation1#mmLastReportRequested
 * Confirmation1.mmLastReportRequested}</li>
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
 * "Confirmation1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details of confirmation in the CMU."</li>
 * </ul>
 */
public class Confirmation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected TradeConfirmationStatus1Code confirmationStatus;
	/**
	 * Identifies the status of the confirmation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TradeConfirmationStatus1Code
	 * TradeConfirmationStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Confirmation1 Confirmation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ConfSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the status of the confirmation."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmConfirmationStatus = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Confirmation1.mmObject();
			isDerived = false;
			xmlTag = "ConfSts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationStatus";
			definition = "Identifies the status of the confirmation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TradeConfirmationStatus1Code.mmObject();
		}
	};
	protected ISODateTime confirmationTime;
	/**
	 * Time that both of parties confirm the trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Confirmation1 Confirmation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ConfTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmationTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Time that both of parties confirm the trade."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmConfirmationTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Confirmation1.mmObject();
			isDerived = false;
			xmlTag = "ConfTm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationTime";
			definition = "Time that both of parties confirm the trade.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime tradePartyConfirmationTime;
	/**
	 * Time that the trade party confirms the trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Confirmation1 Confirmation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradPtyConfTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradePartyConfirmationTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Time that the trade party confirms the trade."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradePartyConfirmationTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Confirmation1.mmObject();
			isDerived = false;
			xmlTag = "TradPtyConfTm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradePartyConfirmationTime";
			definition = "Time that the trade party confirms the trade.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime initiatingPartyConfirmationTime;
	/**
	 * Time that the initiating party confirms the trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Confirmation1 Confirmation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InitgPtyConfTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InitiatingPartyConfirmationTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Time that the initiating party confirms the trade."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInitiatingPartyConfirmationTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Confirmation1.mmObject();
			isDerived = false;
			xmlTag = "InitgPtyConfTm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitiatingPartyConfirmationTime";
			definition = "Time that the initiating party confirms the trade.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ConfirmationRequest1Code confirmationType;
	/**
	 * Identifies the type of confirmation message being sent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ConfirmationRequest1Code
	 * ConfirmationRequest1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Confirmation1 Confirmation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ConfTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the type of confirmation message being sent."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmConfirmationType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Confirmation1.mmObject();
			isDerived = false;
			xmlTag = "ConfTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationType";
			definition = "Identifies the type of confirmation message being sent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ConfirmationRequest1Code.mmObject();
		}
	};
	protected MessageIdentification1 requestIdentification;
	/**
	 * Identifies the confirm request messge.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Confirmation1 Confirmation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the confirm request messge."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRequestIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Confirmation1.mmObject();
			isDerived = false;
			xmlTag = "ReqId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestIdentification";
			definition = "Identifies the confirm request messge.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.MessageIdentification1.mmObject();
		}
	};
	protected Max35NumericText queryStartNumber;
	/**
	 * Start number in request result.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max35NumericText
	 * Max35NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Confirmation1 Confirmation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QryStartNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueryStartNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Start number in request result."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmQueryStartNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Confirmation1.mmObject();
			isDerived = false;
			xmlTag = "QryStartNb";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryStartNumber";
			definition = "Start number in request result.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35NumericText.mmObject();
		}
	};
	protected Number totalNumberOfReports;
	/**
	 * Total number of reports returned in response to a request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Confirmation1 Confirmation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlNbOfRpts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalNumberOfReports"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total number of reports returned in response to a request."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalNumberOfReports = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Confirmation1.mmObject();
			isDerived = false;
			xmlTag = "TtlNbOfRpts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNumberOfReports";
			definition = "Total number of reports returned in response to a request.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected Max35NumericText pageNumber;
	/**
	 * Query results will be grouped with fixed number. The field indicates that
	 * the total number of groups.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max35NumericText
	 * Max35NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Confirmation1 Confirmation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PgNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PageNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Query results will be grouped with fixed number. The field indicates that the total number of groups. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPageNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Confirmation1.mmObject();
			isDerived = false;
			xmlTag = "PgNb";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PageNumber";
			definition = "Query results will be grouped with fixed number. The field indicates that the total number of groups. ";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35NumericText.mmObject();
		}
	};
	protected Max35NumericText queryPageNumber;
	/**
	 * Page number in request result.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max35NumericText
	 * Max35NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Confirmation1 Confirmation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QryPgNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueryPageNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Page number in request result."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmQueryPageNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Confirmation1.mmObject();
			isDerived = false;
			xmlTag = "QryPgNb";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryPageNumber";
			definition = "Page number in request result.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35NumericText.mmObject();
		}
	};
	protected Number messageNumberOfCurrentPage;
	/**
	 * Number of messages in current page.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Confirmation1 Confirmation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgNbOfCurPg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageNumberOfCurrentPage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of messages in current page."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMessageNumberOfCurrentPage = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Confirmation1.mmObject();
			isDerived = false;
			xmlTag = "MsgNbOfCurPg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageNumberOfCurrentPage";
			definition = "Number of messages in current page.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected Number listOrderNumber;
	/**
	 * Number of reports at current page.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Confirmation1 Confirmation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ListOrdrNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ListOrderNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of reports at current page."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmListOrderNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Confirmation1.mmObject();
			isDerived = false;
			xmlTag = "ListOrdrNb";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ListOrderNumber";
			definition = "Number of reports at current page.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected YesNoIndicator lastPageIndicator;
	/**
	 * Indicate whether the current message is the last one of the current page
	 * or not.
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
	 * {@linkplain com.tools20022.repository.msg.Confirmation1 Confirmation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LastPgInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LastPageIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicate whether the current message is the last one of the current page or not."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLastPageIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Confirmation1.mmObject();
			isDerived = false;
			xmlTag = "LastPgInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LastPageIndicator";
			definition = "Indicate whether the current message is the last one of the current page or not.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator lastReportRequested;
	/**
	 * Indicates whether this message is that last report message in response to
	 * a request.
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
	 * {@linkplain com.tools20022.repository.msg.Confirmation1 Confirmation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LastRptReqd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LastReportRequested"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether this message is that last report message in response to a request."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLastReportRequested = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Confirmation1.mmObject();
			isDerived = false;
			xmlTag = "LastRptReqd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LastReportRequested";
			definition = "Indicates whether this message is that last report message in response to a request.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Confirmation1.mmConfirmationStatus, com.tools20022.repository.msg.Confirmation1.mmConfirmationTime,
						com.tools20022.repository.msg.Confirmation1.mmTradePartyConfirmationTime, com.tools20022.repository.msg.Confirmation1.mmInitiatingPartyConfirmationTime,
						com.tools20022.repository.msg.Confirmation1.mmConfirmationType, com.tools20022.repository.msg.Confirmation1.mmRequestIdentification, com.tools20022.repository.msg.Confirmation1.mmQueryStartNumber,
						com.tools20022.repository.msg.Confirmation1.mmTotalNumberOfReports, com.tools20022.repository.msg.Confirmation1.mmPageNumber, com.tools20022.repository.msg.Confirmation1.mmQueryPageNumber,
						com.tools20022.repository.msg.Confirmation1.mmMessageNumberOfCurrentPage, com.tools20022.repository.msg.Confirmation1.mmListOrderNumber, com.tools20022.repository.msg.Confirmation1.mmLastPageIndicator,
						com.tools20022.repository.msg.Confirmation1.mmLastReportRequested);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Confirmation1";
				definition = "Details of confirmation in the CMU.";
			}
		});
		return mmObject_lazy.get();
	}

	public TradeConfirmationStatus1Code getConfirmationStatus() {
		return confirmationStatus;
	}

	public void setConfirmationStatus(TradeConfirmationStatus1Code confirmationStatus) {
		this.confirmationStatus = confirmationStatus;
	}

	public ISODateTime getConfirmationTime() {
		return confirmationTime;
	}

	public void setConfirmationTime(ISODateTime confirmationTime) {
		this.confirmationTime = confirmationTime;
	}

	public ISODateTime getTradePartyConfirmationTime() {
		return tradePartyConfirmationTime;
	}

	public void setTradePartyConfirmationTime(ISODateTime tradePartyConfirmationTime) {
		this.tradePartyConfirmationTime = tradePartyConfirmationTime;
	}

	public ISODateTime getInitiatingPartyConfirmationTime() {
		return initiatingPartyConfirmationTime;
	}

	public void setInitiatingPartyConfirmationTime(ISODateTime initiatingPartyConfirmationTime) {
		this.initiatingPartyConfirmationTime = initiatingPartyConfirmationTime;
	}

	public ConfirmationRequest1Code getConfirmationType() {
		return confirmationType;
	}

	public void setConfirmationType(ConfirmationRequest1Code confirmationType) {
		this.confirmationType = confirmationType;
	}

	public MessageIdentification1 getRequestIdentification() {
		return requestIdentification;
	}

	public void setRequestIdentification(com.tools20022.repository.msg.MessageIdentification1 requestIdentification) {
		this.requestIdentification = requestIdentification;
	}

	public Max35NumericText getQueryStartNumber() {
		return queryStartNumber;
	}

	public void setQueryStartNumber(Max35NumericText queryStartNumber) {
		this.queryStartNumber = queryStartNumber;
	}

	public Number getTotalNumberOfReports() {
		return totalNumberOfReports;
	}

	public void setTotalNumberOfReports(Number totalNumberOfReports) {
		this.totalNumberOfReports = totalNumberOfReports;
	}

	public Max35NumericText getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(Max35NumericText pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Max35NumericText getQueryPageNumber() {
		return queryPageNumber;
	}

	public void setQueryPageNumber(Max35NumericText queryPageNumber) {
		this.queryPageNumber = queryPageNumber;
	}

	public Number getMessageNumberOfCurrentPage() {
		return messageNumberOfCurrentPage;
	}

	public void setMessageNumberOfCurrentPage(Number messageNumberOfCurrentPage) {
		this.messageNumberOfCurrentPage = messageNumberOfCurrentPage;
	}

	public Number getListOrderNumber() {
		return listOrderNumber;
	}

	public void setListOrderNumber(Number listOrderNumber) {
		this.listOrderNumber = listOrderNumber;
	}

	public YesNoIndicator getLastPageIndicator() {
		return lastPageIndicator;
	}

	public void setLastPageIndicator(YesNoIndicator lastPageIndicator) {
		this.lastPageIndicator = lastPageIndicator;
	}

	public YesNoIndicator getLastReportRequested() {
		return lastReportRequested;
	}

	public void setLastReportRequested(YesNoIndicator lastReportRequested) {
		this.lastReportRequested = lastReportRequested;
	}
}