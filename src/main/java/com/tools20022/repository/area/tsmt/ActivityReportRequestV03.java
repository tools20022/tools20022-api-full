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
import com.tools20022.repository.msg.DateTimePeriodDetails1;
import com.tools20022.repository.msg.MessageIdentification1;
import com.tools20022.repository.msgset.TradeServicesManagementISOLatestversion;
import com.tools20022.repository.msgset.TradeServicesManagementISOPreviousversion;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The ActivityReportRequest message is sent by any party involved in a
 * transaction to the matching application.<br>
 * This message is used to request a report on all transactions for which an
 * activity has taken place within a given time span.<br>
 * <b>Usage</b><br>
 * The ActivityReportRequest message can be sent<br>
 * - at a pre-determined time. The message requests a report on all transactions
 * that the requester is involved in and for which an activity has taken place
 * within the last 24 hours.<br>
 * - on demand. The message requests a report on all transactions that the
 * requester is involved in and for which an activity has taken place within a
 * time span specified by the requester.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ActivityReportRequestV03#mmRequestIdentification
 * ActivityReportRequestV03.mmRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ActivityReportRequestV03#mmEntitiesToBeReported
 * ActivityReportRequestV03.mmEntitiesToBeReported}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ActivityReportRequestV03#mmReportPeriod
 * ActivityReportRequestV03.mmReportPeriod}</li>
 * </ul>
 * </li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "ActvtyReqRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.TradeServicesManagementLatestVersion
 * TradeServicesManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code tsmt.003.001.03}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ActivityReportRequestV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe ActivityReportRequest message is sent by any party involved in a transaction to the matching application.\r\nThis message is used to request a report on all transactions for which an activity has taken place within a given time span.\r\nUsage\r\nThe ActivityReportRequest message can be sent\r\n- at a pre-determined time. The message requests a report on all transactions that the requester is involved in and for which an activity has taken place within the last 24 hours.\r\n- on demand. The message requests a report on all transactions that the requester is involved in and for which an activity has taken place within a time span specified by the requester."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ActivityReportRequestV03", propOrder = {"requestIdentification", "entitiesToBeReported", "reportPeriod"})
public class ActivityReportRequestV03 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ReqId", required = true)
	protected MessageIdentification1 requestIdentification;
	/**
	 * 
	 <p>
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
				return ActivityReportRequestV03.class.getMethod("getRequestIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "NttiesToBeRptd")
	protected List<BICIdentification1> entitiesToBeReported;
	/**
	 * 
	 <p>
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
	 * "Specifies the entities of the submitter for which the activities have to be reported."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmEntitiesToBeReported = new MMMessageBuildingBlock() {
		{
			xmlTag = "NttiesToBeRptd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntitiesToBeReported";
			definition = "Specifies the entities of the submitter for which the activities have to be reported.";
			minOccurs = 0;
			complexType_lazy = () -> BICIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ActivityReportRequestV03.class.getMethod("getEntitiesToBeReported", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "RptPrd", required = true)
	protected DateTimePeriodDetails1 reportPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DateTimePeriodDetails1
	 * DateTimePeriodDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the period for which activities have to be reported."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmReportPeriod = new MMMessageBuildingBlock() {
		{
			xmlTag = "RptPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportPeriod";
			definition = "Specifies the period for which activities have to be reported.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateTimePeriodDetails1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ActivityReportRequestV03.class.getMethod("getReportPeriod", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ActivityReportRequestV03";
				definition = "Scope\r\nThe ActivityReportRequest message is sent by any party involved in a transaction to the matching application.\r\nThis message is used to request a report on all transactions for which an activity has taken place within a given time span.\r\nUsage\r\nThe ActivityReportRequest message can be sent\r\n- at a pre-determined time. The message requests a report on all transactions that the requester is involved in and for which an activity has taken place within the last 24 hours.\r\n- on demand. The message requests a report on all transactions that the requester is involved in and for which an activity has taken place within a time span specified by the requester.";
				messageSet_lazy = () -> Arrays.asList(TradeServicesManagementISOPreviousversion.mmObject(), TradeServicesManagementISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "ActvtyReqRpt";
				businessArea_lazy = () -> TradeServicesManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsmt.ActivityReportRequestV03.mmRequestIdentification, com.tools20022.repository.area.tsmt.ActivityReportRequestV03.mmEntitiesToBeReported,
						com.tools20022.repository.area.tsmt.ActivityReportRequestV03.mmReportPeriod);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "tsmt";
						messageFunctionality = "003";
						version = "03";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return ActivityReportRequestV03.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getRequestIdentification() {
		return requestIdentification;
	}

	public ActivityReportRequestV03 setRequestIdentification(MessageIdentification1 requestIdentification) {
		this.requestIdentification = Objects.requireNonNull(requestIdentification);
		return this;
	}

	public List<BICIdentification1> getEntitiesToBeReported() {
		return entitiesToBeReported == null ? entitiesToBeReported = new ArrayList<>() : entitiesToBeReported;
	}

	public ActivityReportRequestV03 setEntitiesToBeReported(List<BICIdentification1> entitiesToBeReported) {
		this.entitiesToBeReported = Objects.requireNonNull(entitiesToBeReported);
		return this;
	}

	public DateTimePeriodDetails1 getReportPeriod() {
		return reportPeriod;
	}

	public ActivityReportRequestV03 setReportPeriod(DateTimePeriodDetails1 reportPeriod) {
		this.reportPeriod = Objects.requireNonNull(reportPeriod);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.003.001.03")
	static public class Document {
		@XmlElement(name = "ActvtyReqRpt", required = true)
		public ActivityReportRequestV03 messageBody;
	}
}