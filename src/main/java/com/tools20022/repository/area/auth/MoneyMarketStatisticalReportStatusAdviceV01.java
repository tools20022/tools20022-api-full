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

package com.tools20022.repository.area.auth;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.AuthoritiesLatestVersion;
import com.tools20022.repository.msg.MoneyMarketStatusReportHeader1;
import com.tools20022.repository.msg.MoneyMarketTransactionStatus2;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset.MoneyMarketStatisticalReportingISOLatestversion;
import com.tools20022.repository.msgset.MoneyMarketStatisticalReportingISOPreviousversion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * The MoneyMarketStatisticalReportStatusAdvice message is sent by the relevant
 * competent authority to the reporting agents to provide the status on the
 * reported transactions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketStatisticalReportStatusAdviceV01#mmStatusReportHeader
 * MoneyMarketStatisticalReportStatusAdviceV01.mmStatusReportHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketStatisticalReportStatusAdviceV01#mmTransactionStatus
 * MoneyMarketStatisticalReportStatusAdviceV01.mmTransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketStatisticalReportStatusAdviceV01#mmSupplementaryData
 * MoneyMarketStatisticalReportStatusAdviceV01.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.MoneyMarketStatisticalReportingISOPreviousversion
 * MoneyMarketStatisticalReportingISOPreviousversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.MoneyMarketStatisticalReportingISOLatestversion
 * MoneyMarketStatisticalReportingISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "MnyMktSttstclRptStsAdvc"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AuthoritiesLatestVersion
 * AuthoritiesLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code auth.028.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MoneyMarketStatisticalReportStatusAdviceV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The MoneyMarketStatisticalReportStatusAdvice message is sent by the relevant competent authority to the reporting agents to provide the status on the reported transactions."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MoneyMarketStatisticalReportStatusAdviceV01", propOrder = {"statusReportHeader", "transactionStatus", "supplementaryData"})
public class MoneyMarketStatisticalReportStatusAdviceV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "StsRptHdr", required = true)
	protected MoneyMarketStatusReportHeader1 statusReportHeader;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MoneyMarketStatusReportHeader1
	 * MoneyMarketStatusReportHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StsRptHdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusReportHeader"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the status on the global report."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MoneyMarketStatisticalReportStatusAdviceV01, MoneyMarketStatusReportHeader1> mmStatusReportHeader = new MMMessageBuildingBlock<MoneyMarketStatisticalReportStatusAdviceV01, MoneyMarketStatusReportHeader1>() {
		{
			xmlTag = "StsRptHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusReportHeader";
			definition = "Provides the status on the global report.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MoneyMarketStatusReportHeader1.mmObject();
		}

		@Override
		public MoneyMarketStatusReportHeader1 getValue(MoneyMarketStatisticalReportStatusAdviceV01 obj) {
			return obj.getStatusReportHeader();
		}

		@Override
		public void setValue(MoneyMarketStatisticalReportStatusAdviceV01 obj, MoneyMarketStatusReportHeader1 value) {
			obj.setStatusReportHeader(value);
		}
	};
	@XmlElement(name = "TxSts")
	protected List<MoneyMarketTransactionStatus2> transactionStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MoneyMarketTransactionStatus2
	 * MoneyMarketTransactionStatus2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the status on an individual transaction and the related reason if required."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MoneyMarketStatisticalReportStatusAdviceV01, List<MoneyMarketTransactionStatus2>> mmTransactionStatus = new MMMessageBuildingBlock<MoneyMarketStatisticalReportStatusAdviceV01, List<MoneyMarketTransactionStatus2>>() {
		{
			xmlTag = "TxSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionStatus";
			definition = "Provides the status on an individual transaction and the related reason if required.";
			minOccurs = 0;
			complexType_lazy = () -> MoneyMarketTransactionStatus2.mmObject();
		}

		@Override
		public List<MoneyMarketTransactionStatus2> getValue(MoneyMarketStatisticalReportStatusAdviceV01 obj) {
			return obj.getTransactionStatus();
		}

		@Override
		public void setValue(MoneyMarketStatisticalReportStatusAdviceV01 obj, List<MoneyMarketTransactionStatus2> value) {
			obj.setTransactionStatus(value);
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that can not be captured in the structured fields and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MoneyMarketStatisticalReportStatusAdviceV01, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<MoneyMarketStatisticalReportStatusAdviceV01, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(MoneyMarketStatisticalReportStatusAdviceV01 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(MoneyMarketStatisticalReportStatusAdviceV01 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MoneyMarketStatisticalReportStatusAdviceV01";
				definition = "The MoneyMarketStatisticalReportStatusAdvice message is sent by the relevant competent authority to the reporting agents to provide the status on the reported transactions.";
				messageSet_lazy = () -> Arrays.asList(MoneyMarketStatisticalReportingISOPreviousversion.mmObject(), MoneyMarketStatisticalReportingISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "MnyMktSttstclRptStsAdvc";
				businessArea_lazy = () -> AuthoritiesLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.auth.MoneyMarketStatisticalReportStatusAdviceV01.mmStatusReportHeader,
						com.tools20022.repository.area.auth.MoneyMarketStatisticalReportStatusAdviceV01.mmTransactionStatus, com.tools20022.repository.area.auth.MoneyMarketStatisticalReportStatusAdviceV01.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "auth";
						messageFunctionality = "028";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return MoneyMarketStatisticalReportStatusAdviceV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MoneyMarketStatusReportHeader1 getStatusReportHeader() {
		return statusReportHeader;
	}

	public MoneyMarketStatisticalReportStatusAdviceV01 setStatusReportHeader(MoneyMarketStatusReportHeader1 statusReportHeader) {
		this.statusReportHeader = Objects.requireNonNull(statusReportHeader);
		return this;
	}

	public List<MoneyMarketTransactionStatus2> getTransactionStatus() {
		return transactionStatus == null ? transactionStatus = new ArrayList<>() : transactionStatus;
	}

	public MoneyMarketStatisticalReportStatusAdviceV01 setTransactionStatus(List<MoneyMarketTransactionStatus2> transactionStatus) {
		this.transactionStatus = Objects.requireNonNull(transactionStatus);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public MoneyMarketStatisticalReportStatusAdviceV01 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.028.001.01")
	static public class Document {
		@XmlElement(name = "MnyMktSttstclRptStsAdvc", required = true)
		public MoneyMarketStatisticalReportStatusAdviceV01 messageBody;
	}
}