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
import com.tools20022.repository.area.other.DerivativesTradeReportV01;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Number;
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
 * Provides the details of the header for a trade transaction query message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeQueryHeader3#mmReportExecutionDateTime
 * TradeQueryHeader3.mmReportExecutionDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeQueryHeader3#mmReportAsOfDate
 * TradeQueryHeader3.mmReportAsOfDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeQueryHeader3#mmMessagePagination
 * TradeQueryHeader3.mmMessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeQueryHeader3#mmNumberRecords
 * TradeQueryHeader3.mmNumberRecords}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.other.DerivativesTradeReportV01#mmReportHeader
 * DerivativesTradeReportV01.mmReportHeader}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradeQueryHeader3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides the details of the header for a trade transaction query message."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TradeQueryHeader3", propOrder = {"reportExecutionDateTime", "reportAsOfDate", "messagePagination", "numberRecords"})
public class TradeQueryHeader3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RptExctnDtTm")
	protected ISODateTime reportExecutionDateTime;
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
	 * {@linkplain com.tools20022.repository.msg.TradeQueryHeader3
	 * TradeQueryHeader3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptExctnDtTm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportExecutionDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the day and time that the query was executed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeQueryHeader3, Optional<ISODateTime>> mmReportExecutionDateTime = new MMMessageAttribute<TradeQueryHeader3, Optional<ISODateTime>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeQueryHeader3.mmObject();
			isDerived = false;
			xmlTag = "RptExctnDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportExecutionDateTime";
			definition = "Indicates the day and time that the query was executed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(TradeQueryHeader3 obj) {
			return obj.getReportExecutionDateTime();
		}

		@Override
		public void setValue(TradeQueryHeader3 obj, Optional<ISODateTime> value) {
			obj.setReportExecutionDateTime(value.orElse(null));
		}
	};
	@XmlElement(name = "RptAsOfDt")
	protected ISODate reportAsOfDate;
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
	 * {@linkplain com.tools20022.repository.msg.TradeQueryHeader3
	 * TradeQueryHeader3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptAsOfDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportAsOfDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the day which the data the data is provided for."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeQueryHeader3, Optional<ISODate>> mmReportAsOfDate = new MMMessageAttribute<TradeQueryHeader3, Optional<ISODate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeQueryHeader3.mmObject();
			isDerived = false;
			xmlTag = "RptAsOfDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportAsOfDate";
			definition = "Indicates the day which the data the data is provided for.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(TradeQueryHeader3 obj) {
			return obj.getReportAsOfDate();
		}

		@Override
		public void setValue(TradeQueryHeader3 obj, Optional<ISODate> value) {
			obj.setReportAsOfDate(value.orElse(null));
		}
	};
	@XmlElement(name = "MsgPgntn", required = true)
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
	 * {@linkplain com.tools20022.repository.msg.TradeQueryHeader3
	 * TradeQueryHeader3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgPgntn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessagePagination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details on the page number of the message.\r\n\r\n"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeQueryHeader3, Pagination> mmMessagePagination = new MMMessageAssociationEnd<TradeQueryHeader3, Pagination>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeQueryHeader3.mmObject();
			isDerived = false;
			xmlTag = "MsgPgntn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessagePagination";
			definition = "Provides details on the page number of the message.\r\n\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Pagination.mmObject();
		}

		@Override
		public Pagination getValue(TradeQueryHeader3 obj) {
			return obj.getMessagePagination();
		}

		@Override
		public void setValue(TradeQueryHeader3 obj, Pagination value) {
			obj.setMessagePagination(value);
		}
	};
	@XmlElement(name = "NbRcrds", required = true)
	protected Number numberRecords;
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
	 * {@linkplain com.tools20022.repository.msg.TradeQueryHeader3
	 * TradeQueryHeader3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NbRcrds"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberRecords"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the number of records in the page."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeQueryHeader3, Number> mmNumberRecords = new MMMessageAttribute<TradeQueryHeader3, Number>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeQueryHeader3.mmObject();
			isDerived = false;
			xmlTag = "NbRcrds";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberRecords";
			definition = "Indicates the number of records in the page.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(TradeQueryHeader3 obj) {
			return obj.getNumberRecords();
		}

		@Override
		public void setValue(TradeQueryHeader3 obj, Number value) {
			obj.setNumberRecords(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeQueryHeader3.mmReportExecutionDateTime, com.tools20022.repository.msg.TradeQueryHeader3.mmReportAsOfDate,
						com.tools20022.repository.msg.TradeQueryHeader3.mmMessagePagination, com.tools20022.repository.msg.TradeQueryHeader3.mmNumberRecords);
				messageBuildingBlock_lazy = () -> Arrays.asList(DerivativesTradeReportV01.mmReportHeader);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "TradeQueryHeader3";
				definition = "Provides the details of the header for a trade transaction query message.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ISODateTime> getReportExecutionDateTime() {
		return reportExecutionDateTime == null ? Optional.empty() : Optional.of(reportExecutionDateTime);
	}

	public TradeQueryHeader3 setReportExecutionDateTime(ISODateTime reportExecutionDateTime) {
		this.reportExecutionDateTime = reportExecutionDateTime;
		return this;
	}

	public Optional<ISODate> getReportAsOfDate() {
		return reportAsOfDate == null ? Optional.empty() : Optional.of(reportAsOfDate);
	}

	public TradeQueryHeader3 setReportAsOfDate(ISODate reportAsOfDate) {
		this.reportAsOfDate = reportAsOfDate;
		return this;
	}

	public Pagination getMessagePagination() {
		return messagePagination;
	}

	public TradeQueryHeader3 setMessagePagination(Pagination messagePagination) {
		this.messagePagination = Objects.requireNonNull(messagePagination);
		return this;
	}

	public Number getNumberRecords() {
		return numberRecords;
	}

	public TradeQueryHeader3 setNumberRecords(Number numberRecords) {
		this.numberRecords = Objects.requireNonNull(numberRecords);
		return this;
	}
}