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
import com.tools20022.repository.area.camt.NetReportV01;
import com.tools20022.repository.choice.PartyIdentification73Choice;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.ISOTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Pagination;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the meta data associated with a net report.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NetReportData1#mmMessageIdentification
 * NetReportData1.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NetReportData1#mmCreationDateTime
 * NetReportData1.mmCreationDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NetReportData1#mmNettingCutOffTime
 * NetReportData1.mmNettingCutOffTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NetReportData1#mmReportDate
 * NetReportData1.mmReportDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NetReportData1#mmValueDate
 * NetReportData1.mmValueDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NetReportData1#mmReportType
 * NetReportData1.mmReportType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NetReportData1#mmNetReportServicer
 * NetReportData1.mmNetReportServicer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NetReportData1#mmNetServiceType
 * NetReportData1.mmNetServiceType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NetReportData1#mmMessagePagination
 * NetReportData1.mmMessagePagination}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.NetReportV01#mmNetReportData
 * NetReportV01.mmNetReportData}</li>
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
 * "NetReportData1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the meta data associated with a net report."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "NetReportData1", propOrder = {"messageIdentification", "creationDateTime", "nettingCutOffTime", "reportDate", "valueDate", "reportType", "netReportServicer", "netServiceType", "messagePagination"})
public class NetReportData1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MsgId", required = true)
	protected Max35Text messageIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NetReportData1 NetReportData1}</li>
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
	 * "Unique and unambiguous identifier for a message, as assigned by the Sender. This unique identifier can be used for cross-referencing purposes in subsequent messages."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NetReportData1, Max35Text> mmMessageIdentification = new MMMessageAttribute<NetReportData1, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.NetReportData1.mmObject();
			isDerived = false;
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Unique and unambiguous identifier for a message, as assigned by the Sender. This unique identifier can be used for cross-referencing purposes in subsequent messages.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(NetReportData1 obj) {
			return obj.getMessageIdentification();
		}

		@Override
		public void setValue(NetReportData1 obj, Max35Text value) {
			obj.setMessageIdentification(value);
		}
	};
	@XmlElement(name = "CreDtTm", required = true)
	protected ISODateTime creationDateTime;
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
	 * {@linkplain com.tools20022.repository.msg.NetReportData1 NetReportData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CreDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreationDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which the net report was generated."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NetReportData1, ISODateTime> mmCreationDateTime = new MMMessageAttribute<NetReportData1, ISODateTime>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.NetReportData1.mmObject();
			isDerived = false;
			xmlTag = "CreDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreationDateTime";
			definition = "Date and time at which the net report was generated.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(NetReportData1 obj) {
			return obj.getCreationDateTime();
		}

		@Override
		public void setValue(NetReportData1 obj, ISODateTime value) {
			obj.setCreationDateTime(value);
		}
	};
	@XmlElement(name = "NetgCutOffTm", required = true)
	protected ISOTime nettingCutOffTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISOTime
	 * ISOTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NetReportData1 NetReportData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetgCutOffTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NettingCutOffTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the cut off time that has been passed, resulting in the generation of the net report."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NetReportData1, ISOTime> mmNettingCutOffTime = new MMMessageAttribute<NetReportData1, ISOTime>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.NetReportData1.mmObject();
			isDerived = false;
			xmlTag = "NetgCutOffTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NettingCutOffTime";
			definition = "Provides the cut off time that has been passed, resulting in the generation of the net report.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISOTime.mmObject();
		}

		@Override
		public ISOTime getValue(NetReportData1 obj) {
			return obj.getNettingCutOffTime();
		}

		@Override
		public void setValue(NetReportData1 obj, ISOTime value) {
			obj.setNettingCutOffTime(value);
		}
	};
	@XmlElement(name = "RptDt", required = true)
	protected ISODate reportDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NetReportData1 NetReportData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the value date on which the net report was generated."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NetReportData1, ISODate> mmReportDate = new MMMessageAttribute<NetReportData1, ISODate>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.NetReportData1.mmObject();
			isDerived = false;
			xmlTag = "RptDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportDate";
			definition = "Specifies the value date on which the net report was generated.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(NetReportData1 obj) {
			return obj.getReportDate();
		}

		@Override
		public void setValue(NetReportData1 obj, ISODate value) {
			obj.setReportDate(value);
		}
	};
	@XmlElement(name = "ValDt", required = true)
	protected ISODate valueDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NetReportData1 NetReportData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the value date for the trades used in the generation of the net report."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NetReportData1, ISODate> mmValueDate = new MMMessageAttribute<NetReportData1, ISODate>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.NetReportData1.mmObject();
			isDerived = false;
			xmlTag = "ValDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueDate";
			definition = "Specifies the value date for the trades used in the generation of the net report.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(NetReportData1 obj) {
			return obj.getValueDate();
		}

		@Override
		public void setValue(NetReportData1 obj, ISODate value) {
			obj.setValueDate(value);
		}
	};
	@XmlElement(name = "RptTp")
	protected Max35Text reportType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NetReportData1 NetReportData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of net report, indicating how the obligations have been calculated."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NetReportData1, Optional<Max35Text>> mmReportType = new MMMessageAttribute<NetReportData1, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.NetReportData1.mmObject();
			isDerived = false;
			xmlTag = "RptTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportType";
			definition = "Specifies the type of net report, indicating how the obligations have been calculated.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(NetReportData1 obj) {
			return obj.getReportType();
		}

		@Override
		public void setValue(NetReportData1 obj, Optional<Max35Text> value) {
			obj.setReportType(value.orElse(null));
		}
	};
	@XmlElement(name = "NetRptSvcr")
	protected PartyIdentification73Choice netReportServicer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification73Choice
	 * PartyIdentification73Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NetReportData1 NetReportData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetRptSvcr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetReportServicer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Describes the central system responsible for generating the net report."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<NetReportData1, Optional<PartyIdentification73Choice>> mmNetReportServicer = new MMMessageAssociationEnd<NetReportData1, Optional<PartyIdentification73Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.NetReportData1.mmObject();
			isDerived = false;
			xmlTag = "NetRptSvcr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetReportServicer";
			definition = "Describes the central system responsible for generating the net report.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification73Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification73Choice> getValue(NetReportData1 obj) {
			return obj.getNetReportServicer();
		}

		@Override
		public void setValue(NetReportData1 obj, Optional<PartyIdentification73Choice> value) {
			obj.setNetReportServicer(value.orElse(null));
		}
	};
	@XmlElement(name = "NetSvcTp")
	protected Max35Text netServiceType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NetReportData1 NetReportData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetSvcTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetServiceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Describes the type of netting service supporting the net report."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NetReportData1, Optional<Max35Text>> mmNetServiceType = new MMMessageAttribute<NetReportData1, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.NetReportData1.mmObject();
			isDerived = false;
			xmlTag = "NetSvcTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetServiceType";
			definition = "Describes the type of netting service supporting the net report.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(NetReportData1 obj) {
			return obj.getNetServiceType();
		}

		@Override
		public void setValue(NetReportData1 obj, Optional<Max35Text> value) {
			obj.setNetServiceType(value.orElse(null));
		}
	};
	@XmlElement(name = "MsgPgntn")
	protected Pagination messagePagination;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Pagination Pagination}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NetReportData1 NetReportData1}</li>
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
	 * definition} =
	 * "Page number of the message (within the net report) and continuation indicator to indicate that the report is to continue or that the message is the last page of the report."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<NetReportData1, Optional<Pagination>> mmMessagePagination = new MMMessageAssociationEnd<NetReportData1, Optional<Pagination>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.NetReportData1.mmObject();
			isDerived = false;
			xmlTag = "MsgPgntn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessagePagination";
			definition = "Page number of the message (within the net report) and continuation indicator to indicate that the report is to continue or that the message is the last page of the report.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Pagination.mmObject();
		}

		@Override
		public Optional<Pagination> getValue(NetReportData1 obj) {
			return obj.getMessagePagination();
		}

		@Override
		public void setValue(NetReportData1 obj, Optional<Pagination> value) {
			obj.setMessagePagination(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.NetReportData1.mmMessageIdentification, com.tools20022.repository.msg.NetReportData1.mmCreationDateTime,
						com.tools20022.repository.msg.NetReportData1.mmNettingCutOffTime, com.tools20022.repository.msg.NetReportData1.mmReportDate, com.tools20022.repository.msg.NetReportData1.mmValueDate,
						com.tools20022.repository.msg.NetReportData1.mmReportType, com.tools20022.repository.msg.NetReportData1.mmNetReportServicer, com.tools20022.repository.msg.NetReportData1.mmNetServiceType,
						com.tools20022.repository.msg.NetReportData1.mmMessagePagination);
				messageBuildingBlock_lazy = () -> Arrays.asList(NetReportV01.mmNetReportData);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NetReportData1";
				definition = "Specifies the meta data associated with a net report.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getMessageIdentification() {
		return messageIdentification;
	}

	public NetReportData1 setMessageIdentification(Max35Text messageIdentification) {
		this.messageIdentification = Objects.requireNonNull(messageIdentification);
		return this;
	}

	public ISODateTime getCreationDateTime() {
		return creationDateTime;
	}

	public NetReportData1 setCreationDateTime(ISODateTime creationDateTime) {
		this.creationDateTime = Objects.requireNonNull(creationDateTime);
		return this;
	}

	public ISOTime getNettingCutOffTime() {
		return nettingCutOffTime;
	}

	public NetReportData1 setNettingCutOffTime(ISOTime nettingCutOffTime) {
		this.nettingCutOffTime = Objects.requireNonNull(nettingCutOffTime);
		return this;
	}

	public ISODate getReportDate() {
		return reportDate;
	}

	public NetReportData1 setReportDate(ISODate reportDate) {
		this.reportDate = Objects.requireNonNull(reportDate);
		return this;
	}

	public ISODate getValueDate() {
		return valueDate;
	}

	public NetReportData1 setValueDate(ISODate valueDate) {
		this.valueDate = Objects.requireNonNull(valueDate);
		return this;
	}

	public Optional<Max35Text> getReportType() {
		return reportType == null ? Optional.empty() : Optional.of(reportType);
	}

	public NetReportData1 setReportType(Max35Text reportType) {
		this.reportType = reportType;
		return this;
	}

	public Optional<PartyIdentification73Choice> getNetReportServicer() {
		return netReportServicer == null ? Optional.empty() : Optional.of(netReportServicer);
	}

	public NetReportData1 setNetReportServicer(PartyIdentification73Choice netReportServicer) {
		this.netReportServicer = netReportServicer;
		return this;
	}

	public Optional<Max35Text> getNetServiceType() {
		return netServiceType == null ? Optional.empty() : Optional.of(netServiceType);
	}

	public NetReportData1 setNetServiceType(Max35Text netServiceType) {
		this.netServiceType = netServiceType;
		return this;
	}

	public Optional<Pagination> getMessagePagination() {
		return messagePagination == null ? Optional.empty() : Optional.of(messagePagination);
	}

	public NetReportData1 setMessagePagination(Pagination messagePagination) {
		this.messagePagination = messagePagination;
		return this;
	}
}