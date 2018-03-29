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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationStatusAdviceV01;
import com.tools20022.repository.codeset.ConfirmationRequest1Code;
import com.tools20022.repository.codeset.TradeConfirmationStatus1Code;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35NumericText;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.MessageIdentification1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationStatusAdviceV01#mmConfirmationInformation
 * ForeignExchangeTradeConfirmationStatusAdviceV01.mmConfirmationInformation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Confirmation1", propOrder = {"confirmationStatus", "confirmationTime", "tradePartyConfirmationTime", "initiatingPartyConfirmationTime", "confirmationType", "requestIdentification", "queryStartNumber",
		"totalNumberOfReports", "pageNumber", "queryPageNumber", "messageNumberOfCurrentPage", "listOrderNumber", "lastPageIndicator", "lastReportRequested"})
public class Confirmation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ConfSts", required = true)
	protected TradeConfirmationStatus1Code confirmationStatus;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<Confirmation1, TradeConfirmationStatus1Code> mmConfirmationStatus = new MMMessageAttribute<Confirmation1, TradeConfirmationStatus1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Confirmation1.mmObject();
			isDerived = false;
			xmlTag = "ConfSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationStatus";
			definition = "Identifies the status of the confirmation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TradeConfirmationStatus1Code.mmObject();
		}

		@Override
		public TradeConfirmationStatus1Code getValue(Confirmation1 obj) {
			return obj.getConfirmationStatus();
		}

		@Override
		public void setValue(Confirmation1 obj, TradeConfirmationStatus1Code value) {
			obj.setConfirmationStatus(value);
		}
	};
	@XmlElement(name = "ConfTm")
	protected ISODateTime confirmationTime;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<Confirmation1, Optional<ISODateTime>> mmConfirmationTime = new MMMessageAttribute<Confirmation1, Optional<ISODateTime>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Confirmation1.mmObject();
			isDerived = false;
			xmlTag = "ConfTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationTime";
			definition = "Time that both of parties confirm the trade.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(Confirmation1 obj) {
			return obj.getConfirmationTime();
		}

		@Override
		public void setValue(Confirmation1 obj, Optional<ISODateTime> value) {
			obj.setConfirmationTime(value.orElse(null));
		}
	};
	@XmlElement(name = "TradPtyConfTm")
	protected ISODateTime tradePartyConfirmationTime;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<Confirmation1, Optional<ISODateTime>> mmTradePartyConfirmationTime = new MMMessageAttribute<Confirmation1, Optional<ISODateTime>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Confirmation1.mmObject();
			isDerived = false;
			xmlTag = "TradPtyConfTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradePartyConfirmationTime";
			definition = "Time that the trade party confirms the trade.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(Confirmation1 obj) {
			return obj.getTradePartyConfirmationTime();
		}

		@Override
		public void setValue(Confirmation1 obj, Optional<ISODateTime> value) {
			obj.setTradePartyConfirmationTime(value.orElse(null));
		}
	};
	@XmlElement(name = "InitgPtyConfTm")
	protected ISODateTime initiatingPartyConfirmationTime;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<Confirmation1, Optional<ISODateTime>> mmInitiatingPartyConfirmationTime = new MMMessageAttribute<Confirmation1, Optional<ISODateTime>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Confirmation1.mmObject();
			isDerived = false;
			xmlTag = "InitgPtyConfTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitiatingPartyConfirmationTime";
			definition = "Time that the initiating party confirms the trade.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(Confirmation1 obj) {
			return obj.getInitiatingPartyConfirmationTime();
		}

		@Override
		public void setValue(Confirmation1 obj, Optional<ISODateTime> value) {
			obj.setInitiatingPartyConfirmationTime(value.orElse(null));
		}
	};
	@XmlElement(name = "ConfTp", required = true)
	protected ConfirmationRequest1Code confirmationType;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<Confirmation1, ConfirmationRequest1Code> mmConfirmationType = new MMMessageAttribute<Confirmation1, ConfirmationRequest1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Confirmation1.mmObject();
			isDerived = false;
			xmlTag = "ConfTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationType";
			definition = "Identifies the type of confirmation message being sent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ConfirmationRequest1Code.mmObject();
		}

		@Override
		public ConfirmationRequest1Code getValue(Confirmation1 obj) {
			return obj.getConfirmationType();
		}

		@Override
		public void setValue(Confirmation1 obj, ConfirmationRequest1Code value) {
			obj.setConfirmationType(value);
		}
	};
	@XmlElement(name = "ReqId", required = true)
	protected MessageIdentification1 requestIdentification;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<Confirmation1, MessageIdentification1> mmRequestIdentification = new MMMessageAssociationEnd<Confirmation1, MessageIdentification1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Confirmation1.mmObject();
			isDerived = false;
			xmlTag = "ReqId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestIdentification";
			definition = "Identifies the confirm request messge.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> MessageIdentification1.mmObject();
		}

		@Override
		public MessageIdentification1 getValue(Confirmation1 obj) {
			return obj.getRequestIdentification();
		}

		@Override
		public void setValue(Confirmation1 obj, MessageIdentification1 value) {
			obj.setRequestIdentification(value);
		}
	};
	@XmlElement(name = "QryStartNb", required = true)
	protected Max35NumericText queryStartNumber;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<Confirmation1, Max35NumericText> mmQueryStartNumber = new MMMessageAttribute<Confirmation1, Max35NumericText>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Confirmation1.mmObject();
			isDerived = false;
			xmlTag = "QryStartNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryStartNumber";
			definition = "Start number in request result.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35NumericText.mmObject();
		}

		@Override
		public Max35NumericText getValue(Confirmation1 obj) {
			return obj.getQueryStartNumber();
		}

		@Override
		public void setValue(Confirmation1 obj, Max35NumericText value) {
			obj.setQueryStartNumber(value);
		}
	};
	@XmlElement(name = "TtlNbOfRpts", required = true)
	protected Number totalNumberOfReports;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<Confirmation1, Number> mmTotalNumberOfReports = new MMMessageAttribute<Confirmation1, Number>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Confirmation1.mmObject();
			isDerived = false;
			xmlTag = "TtlNbOfRpts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNumberOfReports";
			definition = "Total number of reports returned in response to a request.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(Confirmation1 obj) {
			return obj.getTotalNumberOfReports();
		}

		@Override
		public void setValue(Confirmation1 obj, Number value) {
			obj.setTotalNumberOfReports(value);
		}
	};
	@XmlElement(name = "PgNb", required = true)
	protected Max35NumericText pageNumber;
	/**
	 * 
	 <p>
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
	 * "Query results will be grouped with fixed number. The field indicates that the total number of groups."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Confirmation1, Max35NumericText> mmPageNumber = new MMMessageAttribute<Confirmation1, Max35NumericText>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Confirmation1.mmObject();
			isDerived = false;
			xmlTag = "PgNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PageNumber";
			definition = "Query results will be grouped with fixed number. The field indicates that the total number of groups.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35NumericText.mmObject();
		}

		@Override
		public Max35NumericText getValue(Confirmation1 obj) {
			return obj.getPageNumber();
		}

		@Override
		public void setValue(Confirmation1 obj, Max35NumericText value) {
			obj.setPageNumber(value);
		}
	};
	@XmlElement(name = "QryPgNb", required = true)
	protected Max35NumericText queryPageNumber;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<Confirmation1, Max35NumericText> mmQueryPageNumber = new MMMessageAttribute<Confirmation1, Max35NumericText>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Confirmation1.mmObject();
			isDerived = false;
			xmlTag = "QryPgNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryPageNumber";
			definition = "Page number in request result.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35NumericText.mmObject();
		}

		@Override
		public Max35NumericText getValue(Confirmation1 obj) {
			return obj.getQueryPageNumber();
		}

		@Override
		public void setValue(Confirmation1 obj, Max35NumericText value) {
			obj.setQueryPageNumber(value);
		}
	};
	@XmlElement(name = "MsgNbOfCurPg", required = true)
	protected Number messageNumberOfCurrentPage;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<Confirmation1, Number> mmMessageNumberOfCurrentPage = new MMMessageAttribute<Confirmation1, Number>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Confirmation1.mmObject();
			isDerived = false;
			xmlTag = "MsgNbOfCurPg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageNumberOfCurrentPage";
			definition = "Number of messages in current page.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(Confirmation1 obj) {
			return obj.getMessageNumberOfCurrentPage();
		}

		@Override
		public void setValue(Confirmation1 obj, Number value) {
			obj.setMessageNumberOfCurrentPage(value);
		}
	};
	@XmlElement(name = "ListOrdrNb", required = true)
	protected Number listOrderNumber;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<Confirmation1, Number> mmListOrderNumber = new MMMessageAttribute<Confirmation1, Number>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Confirmation1.mmObject();
			isDerived = false;
			xmlTag = "ListOrdrNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ListOrderNumber";
			definition = "Number of reports at current page.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(Confirmation1 obj) {
			return obj.getListOrderNumber();
		}

		@Override
		public void setValue(Confirmation1 obj, Number value) {
			obj.setListOrderNumber(value);
		}
	};
	@XmlElement(name = "LastPgInd", required = true)
	protected YesNoIndicator lastPageIndicator;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<Confirmation1, YesNoIndicator> mmLastPageIndicator = new MMMessageAttribute<Confirmation1, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Confirmation1.mmObject();
			isDerived = false;
			xmlTag = "LastPgInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LastPageIndicator";
			definition = "Indicate whether the current message is the last one of the current page or not.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Confirmation1 obj) {
			return obj.getLastPageIndicator();
		}

		@Override
		public void setValue(Confirmation1 obj, YesNoIndicator value) {
			obj.setLastPageIndicator(value);
		}
	};
	@XmlElement(name = "LastRptReqd", required = true)
	protected YesNoIndicator lastReportRequested;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<Confirmation1, YesNoIndicator> mmLastReportRequested = new MMMessageAttribute<Confirmation1, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Confirmation1.mmObject();
			isDerived = false;
			xmlTag = "LastRptReqd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LastReportRequested";
			definition = "Indicates whether this message is that last report message in response to a request.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Confirmation1 obj) {
			return obj.getLastReportRequested();
		}

		@Override
		public void setValue(Confirmation1 obj, YesNoIndicator value) {
			obj.setLastReportRequested(value);
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
				messageBuildingBlock_lazy = () -> Arrays.asList(ForeignExchangeTradeConfirmationStatusAdviceV01.mmConfirmationInformation);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Confirmation1";
				definition = "Details of confirmation in the CMU.";
			}
		});
		return mmObject_lazy.get();
	}

	public TradeConfirmationStatus1Code getConfirmationStatus() {
		return confirmationStatus;
	}

	public Confirmation1 setConfirmationStatus(TradeConfirmationStatus1Code confirmationStatus) {
		this.confirmationStatus = Objects.requireNonNull(confirmationStatus);
		return this;
	}

	public Optional<ISODateTime> getConfirmationTime() {
		return confirmationTime == null ? Optional.empty() : Optional.of(confirmationTime);
	}

	public Confirmation1 setConfirmationTime(ISODateTime confirmationTime) {
		this.confirmationTime = confirmationTime;
		return this;
	}

	public Optional<ISODateTime> getTradePartyConfirmationTime() {
		return tradePartyConfirmationTime == null ? Optional.empty() : Optional.of(tradePartyConfirmationTime);
	}

	public Confirmation1 setTradePartyConfirmationTime(ISODateTime tradePartyConfirmationTime) {
		this.tradePartyConfirmationTime = tradePartyConfirmationTime;
		return this;
	}

	public Optional<ISODateTime> getInitiatingPartyConfirmationTime() {
		return initiatingPartyConfirmationTime == null ? Optional.empty() : Optional.of(initiatingPartyConfirmationTime);
	}

	public Confirmation1 setInitiatingPartyConfirmationTime(ISODateTime initiatingPartyConfirmationTime) {
		this.initiatingPartyConfirmationTime = initiatingPartyConfirmationTime;
		return this;
	}

	public ConfirmationRequest1Code getConfirmationType() {
		return confirmationType;
	}

	public Confirmation1 setConfirmationType(ConfirmationRequest1Code confirmationType) {
		this.confirmationType = Objects.requireNonNull(confirmationType);
		return this;
	}

	public MessageIdentification1 getRequestIdentification() {
		return requestIdentification;
	}

	public Confirmation1 setRequestIdentification(MessageIdentification1 requestIdentification) {
		this.requestIdentification = Objects.requireNonNull(requestIdentification);
		return this;
	}

	public Max35NumericText getQueryStartNumber() {
		return queryStartNumber;
	}

	public Confirmation1 setQueryStartNumber(Max35NumericText queryStartNumber) {
		this.queryStartNumber = Objects.requireNonNull(queryStartNumber);
		return this;
	}

	public Number getTotalNumberOfReports() {
		return totalNumberOfReports;
	}

	public Confirmation1 setTotalNumberOfReports(Number totalNumberOfReports) {
		this.totalNumberOfReports = Objects.requireNonNull(totalNumberOfReports);
		return this;
	}

	public Max35NumericText getPageNumber() {
		return pageNumber;
	}

	public Confirmation1 setPageNumber(Max35NumericText pageNumber) {
		this.pageNumber = Objects.requireNonNull(pageNumber);
		return this;
	}

	public Max35NumericText getQueryPageNumber() {
		return queryPageNumber;
	}

	public Confirmation1 setQueryPageNumber(Max35NumericText queryPageNumber) {
		this.queryPageNumber = Objects.requireNonNull(queryPageNumber);
		return this;
	}

	public Number getMessageNumberOfCurrentPage() {
		return messageNumberOfCurrentPage;
	}

	public Confirmation1 setMessageNumberOfCurrentPage(Number messageNumberOfCurrentPage) {
		this.messageNumberOfCurrentPage = Objects.requireNonNull(messageNumberOfCurrentPage);
		return this;
	}

	public Number getListOrderNumber() {
		return listOrderNumber;
	}

	public Confirmation1 setListOrderNumber(Number listOrderNumber) {
		this.listOrderNumber = Objects.requireNonNull(listOrderNumber);
		return this;
	}

	public YesNoIndicator getLastPageIndicator() {
		return lastPageIndicator;
	}

	public Confirmation1 setLastPageIndicator(YesNoIndicator lastPageIndicator) {
		this.lastPageIndicator = Objects.requireNonNull(lastPageIndicator);
		return this;
	}

	public YesNoIndicator getLastReportRequested() {
		return lastReportRequested;
	}

	public Confirmation1 setLastReportRequested(YesNoIndicator lastReportRequested) {
		this.lastReportRequested = Objects.requireNonNull(lastReportRequested);
		return this;
	}
}