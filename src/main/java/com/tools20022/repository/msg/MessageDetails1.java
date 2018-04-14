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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max9NumericText;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CBRFReportEntry1;
import com.tools20022.repository.msg.Pagination;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Summary details about CBRF electronic informational message in the report.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MessageDetails1#mmReportIdentification
 * MessageDetails1.mmReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MessageDetails1#mmReportPagination
 * MessageDetails1.mmReportPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MessageDetails1#mmTotalNumberOfEntries
 * MessageDetails1.mmTotalNumberOfEntries}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MessageDetails1#mmSentEntry
 * MessageDetails1.mmSentEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MessageDetails1#mmReceivedEntry
 * MessageDetails1.mmReceivedEntry}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MessageDetails1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Summary details about CBRF electronic informational message in the report."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MessageDetails1", propOrder = {"reportIdentification", "reportPagination", "totalNumberOfEntries", "sentEntry", "receivedEntry"})
public class MessageDetails1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RptId")
	protected Max35Text reportIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.MessageDetails1
	 * MessageDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification assigned by the CBR payment system to unambiguously identify the report."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MessageDetails1, Optional<Max35Text>> mmReportIdentification = new MMMessageAttribute<MessageDetails1, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MessageDetails1.mmObject();
			isDerived = false;
			xmlTag = "RptId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportIdentification";
			definition = "Unique identification assigned by the CBR payment system to unambiguously identify the report.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(MessageDetails1 obj) {
			return obj.getReportIdentification();
		}

		@Override
		public void setValue(MessageDetails1 obj, Optional<Max35Text> value) {
			obj.setReportIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "RptPgntn")
	protected Pagination reportPagination;
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
	 * {@linkplain com.tools20022.repository.msg.MessageDetails1
	 * MessageDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptPgntn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportPagination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Page number of the message and continuation indicator to indicate that the multi-parts notification is to continue or that the message is the last page of the multi-parts notification."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MessageDetails1, Optional<Pagination>> mmReportPagination = new MMMessageAssociationEnd<MessageDetails1, Optional<Pagination>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MessageDetails1.mmObject();
			isDerived = false;
			xmlTag = "RptPgntn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportPagination";
			definition = "Page number of the message and continuation indicator to indicate that the multi-parts notification is to continue or that the message is the last page of the multi-parts notification.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Pagination.mmObject();
		}

		@Override
		public Optional<Pagination> getValue(MessageDetails1 obj) {
			return obj.getReportPagination();
		}

		@Override
		public void setValue(MessageDetails1 obj, Optional<Pagination> value) {
			obj.setReportPagination(value.orElse(null));
		}
	};
	@XmlElement(name = "TtlNbOfNtries", required = true)
	protected Max9NumericText totalNumberOfEntries;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max9NumericText
	 * Max9NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MessageDetails1
	 * MessageDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlNbOfNtries"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalNumberOfEntries"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of entries in the pool."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MessageDetails1, Max9NumericText> mmTotalNumberOfEntries = new MMMessageAttribute<MessageDetails1, Max9NumericText>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MessageDetails1.mmObject();
			isDerived = false;
			xmlTag = "TtlNbOfNtries";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNumberOfEntries";
			definition = "Number of entries in the pool.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max9NumericText.mmObject();
		}

		@Override
		public Max9NumericText getValue(MessageDetails1 obj) {
			return obj.getTotalNumberOfEntries();
		}

		@Override
		public void setValue(MessageDetails1 obj, Max9NumericText value) {
			obj.setTotalNumberOfEntries(value);
		}
	};
	@XmlElement(name = "SntNtry")
	protected List<CBRFReportEntry1> sentEntry;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CBRFReportEntry1
	 * CBRFReportEntry1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MessageDetails1
	 * MessageDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SntNtry"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SentEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to provide details of the report of sent messages."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MessageDetails1, List<CBRFReportEntry1>> mmSentEntry = new MMMessageAssociationEnd<MessageDetails1, List<CBRFReportEntry1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MessageDetails1.mmObject();
			isDerived = false;
			xmlTag = "SntNtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SentEntry";
			definition = "Set of elements used to provide details of the report of sent messages.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CBRFReportEntry1.mmObject();
		}

		@Override
		public List<CBRFReportEntry1> getValue(MessageDetails1 obj) {
			return obj.getSentEntry();
		}

		@Override
		public void setValue(MessageDetails1 obj, List<CBRFReportEntry1> value) {
			obj.setSentEntry(value);
		}
	};
	@XmlElement(name = "RcvdNtry")
	protected List<CBRFReportEntry1> receivedEntry;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CBRFReportEntry1
	 * CBRFReportEntry1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MessageDetails1
	 * MessageDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcvdNtry"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivedEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to provide details of the report of received messages."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MessageDetails1, List<CBRFReportEntry1>> mmReceivedEntry = new MMMessageAssociationEnd<MessageDetails1, List<CBRFReportEntry1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MessageDetails1.mmObject();
			isDerived = false;
			xmlTag = "RcvdNtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivedEntry";
			definition = "Set of elements used to provide details of the report of received messages.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CBRFReportEntry1.mmObject();
		}

		@Override
		public List<CBRFReportEntry1> getValue(MessageDetails1 obj) {
			return obj.getReceivedEntry();
		}

		@Override
		public void setValue(MessageDetails1 obj, List<CBRFReportEntry1> value) {
			obj.setReceivedEntry(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MessageDetails1.mmReportIdentification, com.tools20022.repository.msg.MessageDetails1.mmReportPagination,
						com.tools20022.repository.msg.MessageDetails1.mmTotalNumberOfEntries, com.tools20022.repository.msg.MessageDetails1.mmSentEntry, com.tools20022.repository.msg.MessageDetails1.mmReceivedEntry);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "MessageDetails1";
				definition = "Summary details about CBRF electronic informational message in the report.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getReportIdentification() {
		return reportIdentification == null ? Optional.empty() : Optional.of(reportIdentification);
	}

	public MessageDetails1 setReportIdentification(Max35Text reportIdentification) {
		this.reportIdentification = reportIdentification;
		return this;
	}

	public Optional<Pagination> getReportPagination() {
		return reportPagination == null ? Optional.empty() : Optional.of(reportPagination);
	}

	public MessageDetails1 setReportPagination(Pagination reportPagination) {
		this.reportPagination = reportPagination;
		return this;
	}

	public Max9NumericText getTotalNumberOfEntries() {
		return totalNumberOfEntries;
	}

	public MessageDetails1 setTotalNumberOfEntries(Max9NumericText totalNumberOfEntries) {
		this.totalNumberOfEntries = Objects.requireNonNull(totalNumberOfEntries);
		return this;
	}

	public List<CBRFReportEntry1> getSentEntry() {
		return sentEntry == null ? sentEntry = new ArrayList<>() : sentEntry;
	}

	public MessageDetails1 setSentEntry(List<CBRFReportEntry1> sentEntry) {
		this.sentEntry = Objects.requireNonNull(sentEntry);
		return this;
	}

	public List<CBRFReportEntry1> getReceivedEntry() {
		return receivedEntry == null ? receivedEntry = new ArrayList<>() : receivedEntry;
	}

	public MessageDetails1 setReceivedEntry(List<CBRFReportEntry1> receivedEntry) {
		this.receivedEntry = Objects.requireNonNull(receivedEntry);
		return this;
	}
}