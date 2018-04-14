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
import com.tools20022.repository.choice.Period4Choice;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.msg.SecuritiesInvalidReferenceDataReport3;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset.FinancialInstrumentsandTransactionsRegulatoryReportingTransactionsandFinancialInstrumentsDataReporting;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * The FinancialInstrumentReportingInvalidReferenceDataReport message is sent by
 * the trading venue to the national competent authority to report on all
 * records that have become invalid based on updates that have been received or
 * that have passed the termination date original set for the instrument.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code auth.042.001.01}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AuthoritiesLatestVersion
 * AuthoritiesLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingInvalidReferenceDataReportV01#mmDatePeriod
 * FinancialInstrumentReportingInvalidReferenceDataReportV01.mmDatePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingInvalidReferenceDataReportV01#mmNumberOfRecords
 * FinancialInstrumentReportingInvalidReferenceDataReportV01.mmNumberOfRecords}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingInvalidReferenceDataReportV01#mmFinancialInstruments
 * FinancialInstrumentReportingInvalidReferenceDataReportV01.
 * mmFinancialInstruments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingInvalidReferenceDataReportV01#mmSupplementaryData
 * FinancialInstrumentReportingInvalidReferenceDataReportV01.mmSupplementaryData
 * }</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.FinancialInstrumentsandTransactionsRegulatoryReportingTransactionsandFinancialInstrumentsDataReporting 
 * FinancialInstrumentsandTransactionsRegulatoryReportingTransactionsandFinancialInstrumentsDataReporting
 * }</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "FinInstrmRptgInvldRefDataRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FinancialInstrumentReportingInvalidReferenceDataReportV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The FinancialInstrumentReportingInvalidReferenceDataReport message is sent by the trading venue to the national competent authority to report on all records that have become invalid based on updates that have been received or that have passed the termination date original set for the instrument."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FinancialInstrumentReportingInvalidReferenceDataReportV01", propOrder = {"datePeriod", "numberOfRecords", "financialInstruments", "supplementaryData"})
public class FinancialInstrumentReportingInvalidReferenceDataReportV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DtPrd", required = true)
	protected Period4Choice datePeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Period4Choice Period4Choice}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtPrd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DatePeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date period capturing when instruments in the report have been invalidated\r\n\r\nUsage:\r\nWithin MiFIR, only the From Date To Date field will be used with the From Date corresponding to the date the first instrument was added to this report while the To Date is the date the last instrument was added to the file."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<FinancialInstrumentReportingInvalidReferenceDataReportV01, Period4Choice> mmDatePeriod = new MMMessageBuildingBlock<FinancialInstrumentReportingInvalidReferenceDataReportV01, Period4Choice>() {
		{
			xmlTag = "DtPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DatePeriod";
			definition = "Date period capturing when instruments in the report have been invalidated\r\n\r\nUsage:\r\nWithin MiFIR, only the From Date To Date field will be used with the From Date corresponding to the date the first instrument was added to this report while the To Date is the date the last instrument was added to the file.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Period4Choice.mmObject();
		}

		@Override
		public Period4Choice getValue(FinancialInstrumentReportingInvalidReferenceDataReportV01 obj) {
			return obj.getDatePeriod();
		}

		@Override
		public void setValue(FinancialInstrumentReportingInvalidReferenceDataReportV01 obj, Period4Choice value) {
			obj.setDatePeriod(value);
		}
	};
	@XmlElement(name = "NbOfRcrds")
	protected Number numberOfRecords;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NbOfRcrds"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfRecords"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of invalid records in this message.\r\n"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<FinancialInstrumentReportingInvalidReferenceDataReportV01, Optional<Number>> mmNumberOfRecords = new MMMessageBuildingBlock<FinancialInstrumentReportingInvalidReferenceDataReportV01, Optional<Number>>() {
		{
			xmlTag = "NbOfRcrds";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfRecords";
			definition = "Number of invalid records in this message.\r\n";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(FinancialInstrumentReportingInvalidReferenceDataReportV01 obj) {
			return obj.getNumberOfRecords();
		}

		@Override
		public void setValue(FinancialInstrumentReportingInvalidReferenceDataReportV01 obj, Optional<Number> value) {
			obj.setNumberOfRecords(value.orElse(null));
		}
	};
	@XmlElement(name = "FinInstrms", required = true)
	protected List<SecuritiesInvalidReferenceDataReport3> financialInstruments;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesInvalidReferenceDataReport3
	 * SecuritiesInvalidReferenceDataReport3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrms"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstruments"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the details of the financial instruments."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<FinancialInstrumentReportingInvalidReferenceDataReportV01, List<SecuritiesInvalidReferenceDataReport3>> mmFinancialInstruments = new MMMessageBuildingBlock<FinancialInstrumentReportingInvalidReferenceDataReportV01, List<SecuritiesInvalidReferenceDataReport3>>() {
		{
			xmlTag = "FinInstrms";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstruments";
			definition = "Provides the details of the financial instruments.";
			minOccurs = 1;
			complexType_lazy = () -> SecuritiesInvalidReferenceDataReport3.mmObject();
		}

		@Override
		public List<SecuritiesInvalidReferenceDataReport3> getValue(FinancialInstrumentReportingInvalidReferenceDataReportV01 obj) {
			return obj.getFinancialInstruments();
		}

		@Override
		public void setValue(FinancialInstrumentReportingInvalidReferenceDataReportV01 obj, List<SecuritiesInvalidReferenceDataReport3> value) {
			obj.setFinancialInstruments(value);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that can not be captured in the structured fields and/or any other specific block."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<FinancialInstrumentReportingInvalidReferenceDataReportV01, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<FinancialInstrumentReportingInvalidReferenceDataReportV01, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(FinancialInstrumentReportingInvalidReferenceDataReportV01 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(FinancialInstrumentReportingInvalidReferenceDataReportV01 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancialInstrumentReportingInvalidReferenceDataReportV01";
				definition = "The FinancialInstrumentReportingInvalidReferenceDataReport message is sent by the trading venue to the national competent authority to report on all records that have become invalid based on updates that have been received or that have passed the termination date original set for the instrument.";
				messageSet_lazy = () -> Arrays.asList(FinancialInstrumentsandTransactionsRegulatoryReportingTransactionsandFinancialInstrumentsDataReporting.mmObject());
				rootElement = "Document";
				xmlTag = "FinInstrmRptgInvldRefDataRpt";
				businessArea_lazy = () -> AuthoritiesLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.auth.FinancialInstrumentReportingInvalidReferenceDataReportV01.mmDatePeriod,
						com.tools20022.repository.area.auth.FinancialInstrumentReportingInvalidReferenceDataReportV01.mmNumberOfRecords,
						com.tools20022.repository.area.auth.FinancialInstrumentReportingInvalidReferenceDataReportV01.mmFinancialInstruments,
						com.tools20022.repository.area.auth.FinancialInstrumentReportingInvalidReferenceDataReportV01.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "auth";
						messageFunctionality = "042";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return FinancialInstrumentReportingInvalidReferenceDataReportV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Period4Choice getDatePeriod() {
		return datePeriod;
	}

	public FinancialInstrumentReportingInvalidReferenceDataReportV01 setDatePeriod(Period4Choice datePeriod) {
		this.datePeriod = Objects.requireNonNull(datePeriod);
		return this;
	}

	public Optional<Number> getNumberOfRecords() {
		return numberOfRecords == null ? Optional.empty() : Optional.of(numberOfRecords);
	}

	public FinancialInstrumentReportingInvalidReferenceDataReportV01 setNumberOfRecords(Number numberOfRecords) {
		this.numberOfRecords = numberOfRecords;
		return this;
	}

	public List<SecuritiesInvalidReferenceDataReport3> getFinancialInstruments() {
		return financialInstruments == null ? financialInstruments = new ArrayList<>() : financialInstruments;
	}

	public FinancialInstrumentReportingInvalidReferenceDataReportV01 setFinancialInstruments(List<SecuritiesInvalidReferenceDataReport3> financialInstruments) {
		this.financialInstruments = Objects.requireNonNull(financialInstruments);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public FinancialInstrumentReportingInvalidReferenceDataReportV01 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.042.001.01")
	static public class Document {
		@XmlElement(name = "FinInstrmRptgInvldRefDataRpt", required = true)
		public FinancialInstrumentReportingInvalidReferenceDataReportV01 messageBody;
	}
}