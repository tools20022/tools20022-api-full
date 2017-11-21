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
import com.tools20022.repository.msg.MessageReportHeader4;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset.FinancialInstrumentsandTransactionsRegulatoryReportingTransactionsandFinancialInstrumentsDataReporting;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.*;

/**
 * The FinancialInstrumentReportingStatusAdvice message is sent by the national
 * competent authority to the reporting agent to provide a status advice for the
 * correctness, issues or errors that arise from the submitted report.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AuthoritiesLatestVersion
 * AuthoritiesLatestVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.FinancialInstrumentsandTransactionsRegulatoryReportingTransactionsandFinancialInstrumentsDataReporting 
 * FinancialInstrumentsandTransactionsRegulatoryReportingTransactionsandFinancialInstrumentsDataReporting
 * }</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "FinInstrmRptgStsAdvc"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingStatusAdviceV01#mmStatusAdvice
 * FinancialInstrumentReportingStatusAdviceV01.mmStatusAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingStatusAdviceV01#mmSupplementaryData
 * FinancialInstrumentReportingStatusAdviceV01.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code auth.031.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FinancialInstrumentReportingStatusAdviceV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The FinancialInstrumentReportingStatusAdvice message is sent by the national competent authority to the reporting agent to provide a status advice for the correctness, issues or errors that arise from the submitted report."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "FinancialInstrumentReportingStatusAdviceV01", propOrder = {"statusAdvice", "supplementaryData"})
public class FinancialInstrumentReportingStatusAdviceV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected List<MessageReportHeader4> statusAdvice;
	/**
	 * Status advice report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MessageReportHeader4
	 * MessageReportHeader4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StsAdvc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusAdvice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status advice report."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmStatusAdvice = new MMMessageBuildingBlock() {
		{
			xmlTag = "StsAdvc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusAdvice";
			definition = "Status advice report.";
			minOccurs = 1;
			complexType_lazy = () -> MessageReportHeader4.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return FinancialInstrumentReportingStatusAdviceV01.class.getMethod("getStatusAdvice", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * Additional information that can not be captured in the structured fields
	 * and/or any other specific block.
	 * <p>
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
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return FinancialInstrumentReportingStatusAdviceV01.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancialInstrumentReportingStatusAdviceV01";
				definition = "The FinancialInstrumentReportingStatusAdvice message is sent by the national competent authority to the reporting agent to provide a status advice for the correctness, issues or errors that arise from the submitted report.";
				messageSet_lazy = () -> Arrays.asList(FinancialInstrumentsandTransactionsRegulatoryReportingTransactionsandFinancialInstrumentsDataReporting.mmObject());
				rootElement = "Document";
				xmlTag = "FinInstrmRptgStsAdvc";
				businessArea_lazy = () -> AuthoritiesLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.auth.FinancialInstrumentReportingStatusAdviceV01.mmStatusAdvice,
						com.tools20022.repository.area.auth.FinancialInstrumentReportingStatusAdviceV01.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "auth";
						messageFunctionality = "031";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return FinancialInstrumentReportingStatusAdviceV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "StsAdvc", required = true)
	public List<MessageReportHeader4> getStatusAdvice() {
		return statusAdvice;
	}

	public void setStatusAdvice(List<MessageReportHeader4> statusAdvice) {
		this.statusAdvice = statusAdvice;
	}

	@XmlElement(name = "SplmtryData")
	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData;
	}

	public void setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = supplementaryData;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:auth.031.01.01")
	static public class Document {
		@XmlElement(name = "FinInstrmRptgStsAdvc", required = true)
		public FinancialInstrumentReportingStatusAdviceV01 messageBody;
	}
}