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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "NetReportData1", propOrder = {"messageIdentification", "creationDateTime", "nettingCutOffTime", "reportDate", "valueDate", "reportType", "netReportServicer", "netServiceType", "messagePagination"})
public class NetReportData1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text messageIdentification;
	/**
	 * Unique and unambiguous identifier for a message, as assigned by the
	 * Sender. This unique identifier can be used for cross-referencing purposes
	 * in subsequent messages.
	 * <p>
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
	public static final MMMessageAttribute mmMessageIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> NetReportData1.mmObject();
			isDerived = false;
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Unique and unambiguous identifier for a message, as assigned by the Sender. This unique identifier can be used for cross-referencing purposes in subsequent messages.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected ISODateTime creationDateTime;
	/**
	 * Date and time at which the net report was generated.
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
	public static final MMMessageAttribute mmCreationDateTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> NetReportData1.mmObject();
			isDerived = false;
			xmlTag = "CreDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreationDateTime";
			definition = "Date and time at which the net report was generated.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISOTime nettingCutOffTime;
	/**
	 * Provides the cut off time that has been passed, resulting in the
	 * generation of the net report.
	 * <p>
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
	public static final MMMessageAttribute mmNettingCutOffTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> NetReportData1.mmObject();
			isDerived = false;
			xmlTag = "NetgCutOffTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NettingCutOffTime";
			definition = "Provides the cut off time that has been passed, resulting in the generation of the net report.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISOTime.mmObject();
		}
	};
	protected ISODate reportDate;
	/**
	 * Specifies the value date on which the net report was generated.
	 * <p>
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
	public static final MMMessageAttribute mmReportDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> NetReportData1.mmObject();
			isDerived = false;
			xmlTag = "RptDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportDate";
			definition = "Specifies the value date on which the net report was generated.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ISODate valueDate;
	/**
	 * Specifies the value date for the trades used in the generation of the net
	 * report.
	 * <p>
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
	public static final MMMessageAttribute mmValueDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> NetReportData1.mmObject();
			isDerived = false;
			xmlTag = "ValDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueDate";
			definition = "Specifies the value date for the trades used in the generation of the net report.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected Max35Text reportType;
	/**
	 * Specifies the type of net report, indicating how the obligations have
	 * been calculated.
	 * <p>
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
	public static final MMMessageAttribute mmReportType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> NetReportData1.mmObject();
			isDerived = false;
			xmlTag = "RptTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportType";
			definition = "Specifies the type of net report, indicating how the obligations have been calculated.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected PartyIdentification73Choice netReportServicer;
	/**
	 * Describes the central system responsible for generating the net report.
	 * <p>
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
	public static final MMMessageAssociationEnd mmNetReportServicer = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> NetReportData1.mmObject();
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
	};
	protected Max35Text netServiceType;
	/**
	 * Describes the type of netting service supporting the net report.
	 * <p>
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
	public static final MMMessageAttribute mmNetServiceType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> NetReportData1.mmObject();
			isDerived = false;
			xmlTag = "NetSvcTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetServiceType";
			definition = "Describes the type of netting service supporting the net report.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Pagination messagePagination;
	/**
	 * Page number of the message (within the net report) and continuation
	 * indicator to indicate that the report is to continue or that the message
	 * is the last page of the report.
	 * <p>
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
	public static final MMMessageAssociationEnd mmMessagePagination = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> NetReportData1.mmObject();
			isDerived = false;
			xmlTag = "MsgPgntn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessagePagination";
			definition = "Page number of the message (within the net report) and continuation indicator to indicate that the report is to continue or that the message is the last page of the report.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Pagination.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(NetReportData1.mmMessageIdentification, NetReportData1.mmCreationDateTime, NetReportData1.mmNettingCutOffTime, NetReportData1.mmReportDate, NetReportData1.mmValueDate,
						NetReportData1.mmReportType, NetReportData1.mmNetReportServicer, NetReportData1.mmNetServiceType, NetReportData1.mmMessagePagination);
				messageBuildingBlock_lazy = () -> Arrays.asList(NetReportV01.mmNetReportData);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NetReportData1";
				definition = "Specifies the meta data associated with a net report.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "MsgId", required = true)
	public Max35Text getMessageIdentification() {
		return messageIdentification;
	}

	public void setMessageIdentification(Max35Text messageIdentification) {
		this.messageIdentification = messageIdentification;
	}

	@XmlElement(name = "CreDtTm", required = true)
	public ISODateTime getCreationDateTime() {
		return creationDateTime;
	}

	public void setCreationDateTime(ISODateTime creationDateTime) {
		this.creationDateTime = creationDateTime;
	}

	@XmlElement(name = "NetgCutOffTm", required = true)
	public ISOTime getNettingCutOffTime() {
		return nettingCutOffTime;
	}

	public void setNettingCutOffTime(ISOTime nettingCutOffTime) {
		this.nettingCutOffTime = nettingCutOffTime;
	}

	@XmlElement(name = "RptDt", required = true)
	public ISODate getReportDate() {
		return reportDate;
	}

	public void setReportDate(ISODate reportDate) {
		this.reportDate = reportDate;
	}

	@XmlElement(name = "ValDt", required = true)
	public ISODate getValueDate() {
		return valueDate;
	}

	public void setValueDate(ISODate valueDate) {
		this.valueDate = valueDate;
	}

	@XmlElement(name = "RptTp")
	public Max35Text getReportType() {
		return reportType;
	}

	public void setReportType(Max35Text reportType) {
		this.reportType = reportType;
	}

	@XmlElement(name = "NetRptSvcr")
	public PartyIdentification73Choice getNetReportServicer() {
		return netReportServicer;
	}

	public void setNetReportServicer(PartyIdentification73Choice netReportServicer) {
		this.netReportServicer = netReportServicer;
	}

	@XmlElement(name = "NetSvcTp")
	public Max35Text getNetServiceType() {
		return netServiceType;
	}

	public void setNetServiceType(Max35Text netServiceType) {
		this.netServiceType = netServiceType;
	}

	@XmlElement(name = "MsgPgntn")
	public Pagination getMessagePagination() {
		return messagePagination;
	}

	public void setMessagePagination(com.tools20022.repository.msg.Pagination messagePagination) {
		this.messagePagination = messagePagination;
	}
}