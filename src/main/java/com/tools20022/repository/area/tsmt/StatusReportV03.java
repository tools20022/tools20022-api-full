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

package com.tools20022.repository.area.tsmt;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.TradeServicesManagementLatestVersion;
import com.tools20022.repository.msg.MessageIdentification1;
import com.tools20022.repository.msg.StatusReportItems2;
import com.tools20022.repository.msgset.TradeServicesManagementISOLatestversion;
import com.tools20022.repository.msgset.TradeServicesManagementISOPreviousversion;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The StatusReport message is sent by the matching application to the requester
 * of a status report.<br>
 * This message is used to report on the status of transactions registered in
 * the matching application.<br>
 * <b>Usage</b><br>
 * The StatusReport message can be sent by the matching application to report on
 * the status and sub-status of all transactions that the requester of the
 * report is involved in. The message can be sent in response to a
 * StatusReportRequest message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.TradeServicesManagementLatestVersion
 * TradeServicesManagementLatestVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.TradeServicesManagementISOPreviousversion
 * TradeServicesManagementISOPreviousversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.TradeServicesManagementISOLatestversion
 * TradeServicesManagementISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "StsRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusReportV03#mmReportIdentification
 * StatusReportV03.mmReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusReportV03#mmRelatedMessageReference
 * StatusReportV03.mmRelatedMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusReportV03#mmReportedItems
 * StatusReportV03.mmReportedItems}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code tsmt.037.001.03}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "StatusReportV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe StatusReport message is sent by the matching application to the requester of a status report.\r\nThis message is used to report on the status of transactions registered in the matching application.\r\nUsage\r\nThe StatusReport message can be sent by the matching application to report on the status and sub-status of all transactions that the requester of the report is involved in. The message can be sent in response to a StatusReportRequest message."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "StatusReportV03", propOrder = {"reportIdentification", "relatedMessageReference", "reportedItems"})
public class StatusReportV03 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected MessageIdentification1 reportIdentification;
	/**
	 * Identifies the report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
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
	 * definition} = "Identifies the report. "</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmReportIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "RptId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportIdentification";
			definition = "Identifies the report. ";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return StatusReportV03.class.getMethod("getReportIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected MessageIdentification1 relatedMessageReference;
	/**
	 * Reference to the previous message requesting the report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdMsgRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedMessageReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference to the previous message requesting the report."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmRelatedMessageReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "RltdMsgRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedMessageReference";
			definition = "Reference to the previous message requesting the report.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return StatusReportV03.class.getMethod("getRelatedMessageReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<StatusReportItems2> reportedItems;
	/**
	 * Describes a transaction and its status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.StatusReportItems2
	 * StatusReportItems2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptdItms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportedItems"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Describes a transaction and its status."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmReportedItems = new MMMessageBuildingBlock() {
		{
			xmlTag = "RptdItms";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportedItems";
			definition = "Describes a transaction and its status.";
			minOccurs = 0;
			complexType_lazy = () -> StatusReportItems2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return StatusReportV03.class.getMethod("getReportedItems", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StatusReportV03";
				definition = "Scope\r\nThe StatusReport message is sent by the matching application to the requester of a status report.\r\nThis message is used to report on the status of transactions registered in the matching application.\r\nUsage\r\nThe StatusReport message can be sent by the matching application to report on the status and sub-status of all transactions that the requester of the report is involved in. The message can be sent in response to a StatusReportRequest message.";
				messageSet_lazy = () -> Arrays.asList(TradeServicesManagementISOPreviousversion.mmObject(), TradeServicesManagementISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "StsRpt";
				businessArea_lazy = () -> TradeServicesManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsmt.StatusReportV03.mmReportIdentification, com.tools20022.repository.area.tsmt.StatusReportV03.mmRelatedMessageReference,
						com.tools20022.repository.area.tsmt.StatusReportV03.mmReportedItems);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "tsmt";
						messageFunctionality = "037";
						version = "03";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return StatusReportV03.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "RptId", required = true)
	public MessageIdentification1 getReportIdentification() {
		return reportIdentification;
	}

	public void setReportIdentification(MessageIdentification1 reportIdentification) {
		this.reportIdentification = reportIdentification;
	}

	@XmlElement(name = "RltdMsgRef", required = true)
	public MessageIdentification1 getRelatedMessageReference() {
		return relatedMessageReference;
	}

	public void setRelatedMessageReference(MessageIdentification1 relatedMessageReference) {
		this.relatedMessageReference = relatedMessageReference;
	}

	@XmlElement(name = "RptdItms")
	public List<StatusReportItems2> getReportedItems() {
		return reportedItems;
	}

	public void setReportedItems(List<StatusReportItems2> reportedItems) {
		this.reportedItems = reportedItems;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.037.03.03")
	static public class Document {
		@XmlElement(name = "StsRpt", required = true)
		public StatusReportV03 messageBody;
	}
}