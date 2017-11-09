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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MessageDetails1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Summary details about CBRF electronic informational message in the report."</li>
 * </ul>
 */
public class MessageDetails1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text reportIdentification;
	/**
	 * Unique identification assigned by the CBR payment system to unambiguously
	 * identify the report.
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
	 * {@linkplain com.tools20022.repository.msg.MessageDetails1
	 * MessageDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification assigned by the CBR payment system to unambiguously identify the report."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReportIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MessageDetails1.mmObject();
			isDerived = false;
			xmlTag = "RptId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportIdentification";
			definition = "Unique identification assigned by the CBR payment system to unambiguously identify the report.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Pagination reportPagination;
	/**
	 * Page number of the message and continuation indicator to indicate that
	 * the multi-parts notification is to continue or that the message is the
	 * last page of the multi-parts notification.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportPagination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Page number of the message and  continuation indicator to indicate that the multi-parts notification is to continue or that the message is the last page of the multi-parts notification."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReportPagination = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> MessageDetails1.mmObject();
			isDerived = false;
			xmlTag = "RptPgntn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportPagination";
			definition = "Page number of the message and  continuation indicator to indicate that the multi-parts notification is to continue or that the message is the last page of the multi-parts notification.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Pagination.mmObject();
		}
	};
	protected Max9NumericText totalNumberOfEntries;
	/**
	 * Number of entries in the pool.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalNumberOfEntries"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of entries in the pool."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalNumberOfEntries = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MessageDetails1.mmObject();
			isDerived = false;
			xmlTag = "TtlNbOfNtries";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNumberOfEntries";
			definition = "Number of entries in the pool.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max9NumericText.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.CBRFReportEntry1> sentEntry;
	/**
	 * Set of elements used to provide details of the report of sent messages.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SentEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to provide details of the report of sent messages."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSentEntry = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> MessageDetails1.mmObject();
			isDerived = false;
			xmlTag = "SntNtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SentEntry";
			definition = "Set of elements used to provide details of the report of sent messages.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CBRFReportEntry1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.CBRFReportEntry1> receivedEntry;
	/**
	 * Set of elements used to provide details of the report of received
	 * messages.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivedEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to provide details of the report of received messages."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReceivedEntry = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> MessageDetails1.mmObject();
			isDerived = false;
			xmlTag = "RcvdNtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivedEntry";
			definition = "Set of elements used to provide details of the report of received messages.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CBRFReportEntry1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(MessageDetails1.mmReportIdentification, MessageDetails1.mmReportPagination, MessageDetails1.mmTotalNumberOfEntries, MessageDetails1.mmSentEntry, MessageDetails1.mmReceivedEntry);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "MessageDetails1";
				definition = "Summary details about CBRF electronic informational message in the report.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getReportIdentification() {
		return reportIdentification;
	}

	public void setReportIdentification(Max35Text reportIdentification) {
		this.reportIdentification = reportIdentification;
	}

	public Pagination getReportPagination() {
		return reportPagination;
	}

	public void setReportPagination(com.tools20022.repository.msg.Pagination reportPagination) {
		this.reportPagination = reportPagination;
	}

	public Max9NumericText getTotalNumberOfEntries() {
		return totalNumberOfEntries;
	}

	public void setTotalNumberOfEntries(Max9NumericText totalNumberOfEntries) {
		this.totalNumberOfEntries = totalNumberOfEntries;
	}

	public List<CBRFReportEntry1> getSentEntry() {
		return sentEntry;
	}

	public void setSentEntry(List<com.tools20022.repository.msg.CBRFReportEntry1> sentEntry) {
		this.sentEntry = sentEntry;
	}

	public List<CBRFReportEntry1> getReceivedEntry() {
		return receivedEntry;
	}

	public void setReceivedEntry(List<com.tools20022.repository.msg.CBRFReportEntry1> receivedEntry) {
		this.receivedEntry = receivedEntry;
	}
}