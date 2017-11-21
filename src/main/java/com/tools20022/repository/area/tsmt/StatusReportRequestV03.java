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
import com.tools20022.repository.msg.BICIdentification1;
import com.tools20022.repository.msg.MessageIdentification1;
import com.tools20022.repository.msgset.TradeServicesManagementISOLatestversion;
import com.tools20022.repository.msgset.TradeServicesManagementISOPreviousversion;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The StatusReportRequest message is sent by a party involved in a transaction
 * to the matching application.<br>
 * This message is used to request a report on the status of transactions
 * registered in the matching application.<br>
 * <b>Usage</b><br>
 * The StatusReportRequest message can be sent by either party involved in a
 * transaction to request a report on the status and sub-statuses of all
 * transactions that the requester is involved in.<br>
 * The application will respond to the request by sending a StatusReport
 * message.
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
 * xmlTag} = "StsRptReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusReportRequestV03#mmRequestIdentification
 * StatusReportRequestV03.mmRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusReportRequestV03#mmEntitiesToBeReported
 * StatusReportRequestV03.mmEntitiesToBeReported}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code tsmt.038.001.03}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "StatusReportRequestV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe StatusReportRequest message is sent by a party involved in a transaction to the matching application.\r\nThis message is used to request a report on the status of transactions registered in the matching application.\r\nUsage\r\nThe StatusReportRequest message can be sent by either party involved in a transaction to request a report on the status and sub-statuses of all transactions that the requester is involved in.\r\nThe application will respond to the request by sending a StatusReport message."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "StatusReportRequestV03", propOrder = {"requestIdentification", "entitiesToBeReported"})
public class StatusReportRequestV03 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected MessageIdentification1 requestIdentification;
	/**
	 * Identifies the request message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
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
	 * definition} = "Identifies the request message."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmRequestIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "ReqId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestIdentification";
			definition = "Identifies the request message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return StatusReportRequestV03.class.getMethod("getRequestIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<BICIdentification1> entitiesToBeReported;
	/**
	 * Specifies the entities of the submitter for which the transactions have
	 * to be reported.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.BICIdentification1
	 * BICIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NttiesToBeRptd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntitiesToBeReported"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the entities of the submitter for which the transactions have to be reported. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmEntitiesToBeReported = new MMMessageBuildingBlock() {
		{
			xmlTag = "NttiesToBeRptd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntitiesToBeReported";
			definition = "Specifies the entities of the submitter for which the transactions have to be reported. ";
			minOccurs = 0;
			complexType_lazy = () -> BICIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return StatusReportRequestV03.class.getMethod("getEntitiesToBeReported", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StatusReportRequestV03";
				definition = "Scope\r\nThe StatusReportRequest message is sent by a party involved in a transaction to the matching application.\r\nThis message is used to request a report on the status of transactions registered in the matching application.\r\nUsage\r\nThe StatusReportRequest message can be sent by either party involved in a transaction to request a report on the status and sub-statuses of all transactions that the requester is involved in.\r\nThe application will respond to the request by sending a StatusReport message.";
				messageSet_lazy = () -> Arrays.asList(TradeServicesManagementISOPreviousversion.mmObject(), TradeServicesManagementISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "StsRptReq";
				businessArea_lazy = () -> TradeServicesManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsmt.StatusReportRequestV03.mmRequestIdentification, com.tools20022.repository.area.tsmt.StatusReportRequestV03.mmEntitiesToBeReported);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "tsmt";
						messageFunctionality = "038";
						version = "03";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return StatusReportRequestV03.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "ReqId", required = true)
	public MessageIdentification1 getRequestIdentification() {
		return requestIdentification;
	}

	public void setRequestIdentification(MessageIdentification1 requestIdentification) {
		this.requestIdentification = requestIdentification;
	}

	@XmlElement(name = "NttiesToBeRptd")
	public List<BICIdentification1> getEntitiesToBeReported() {
		return entitiesToBeReported;
	}

	public void setEntitiesToBeReported(List<BICIdentification1> entitiesToBeReported) {
		this.entitiesToBeReported = entitiesToBeReported;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.038.03.03")
	static public class Document {
		@XmlElement(name = "StsRptReq", required = true)
		public StatusReportRequestV03 messageBody;
	}
}