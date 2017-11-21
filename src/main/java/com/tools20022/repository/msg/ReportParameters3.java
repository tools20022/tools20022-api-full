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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.secl.MarginReportV02;
import com.tools20022.repository.choice.DateAndDateTimeChoice;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.EventFrequency6Code;
import com.tools20022.repository.datatype.Exact5NumericText;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides the parameters of the report.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportParameters3#mmReportIdentification
 * ReportParameters3.mmReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportParameters3#mmReportDateAndTime
 * ReportParameters3.mmReportDateAndTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportParameters3#mmReportCurrency
 * ReportParameters3.mmReportCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportParameters3#mmCalculationDateAndTime
 * ReportParameters3.mmCalculationDateAndTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportParameters3#mmFrequency
 * ReportParameters3.mmFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportParameters3#mmReportNumber
 * ReportParameters3.mmReportNumber}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.MarginReportV02#mmReportParameters
 * MarginReportV02.mmReportParameters}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ReportParameters3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides the parameters of the report."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ReportParameters3", propOrder = {"reportIdentification", "reportDateAndTime", "reportCurrency", "calculationDateAndTime", "frequency", "reportNumber"})
public class ReportParameters3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text reportIdentification;
	/**
	 * Unique identification of the report.
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
	 * {@linkplain com.tools20022.repository.msg.ReportParameters3
	 * ReportParameters3}</li>
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
	 * definition} = "Unique identification of the report."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReportIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ReportParameters3.mmObject();
			isDerived = false;
			xmlTag = "RptId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportIdentification";
			definition = "Unique identification of the report.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected DateAndDateTimeChoice reportDateAndTime;
	/**
	 * Date (and time) and time of the report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportParameters3
	 * ReportParameters3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptDtAndTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportDateAndTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date (and time) and time of the report."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReportDateAndTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ReportParameters3.mmObject();
			isDerived = false;
			xmlTag = "RptDtAndTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportDateAndTime";
			definition = "Date (and time) and time of the report.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	protected CurrencyCode reportCurrency;
	/**
	 * Currency used for the calculation of the margin.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportParameters3
	 * ReportParameters3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency used for the calculation of the margin."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReportCurrency = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ReportParameters3.mmObject();
			isDerived = false;
			xmlTag = "RptCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportCurrency";
			definition = "Currency used for the calculation of the margin.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	protected ISODateTime calculationDateAndTime;
	/**
	 * Date of calculation of the margin.
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
	 * {@linkplain com.tools20022.repository.msg.ReportParameters3
	 * ReportParameters3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClctnDtAndTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalculationDateAndTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date of calculation of the margin."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCalculationDateAndTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ReportParameters3.mmObject();
			isDerived = false;
			xmlTag = "ClctnDtAndTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CalculationDateAndTime";
			definition = "Date of calculation of the margin.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected EventFrequency6Code frequency;
	/**
	 * Frequency of the report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency6Code
	 * EventFrequency6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportParameters3
	 * ReportParameters3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Frqcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Frequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Frequency of the report."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFrequency = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ReportParameters3.mmObject();
			isDerived = false;
			xmlTag = "Frqcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Frequency";
			definition = "Frequency of the report.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EventFrequency6Code.mmObject();
		}
	};
	protected Exact5NumericText reportNumber;
	/**
	 * Sequential number of the report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact5NumericText
	 * Exact5NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportParameters3
	 * ReportParameters3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sequential number of the report."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReportNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ReportParameters3.mmObject();
			isDerived = false;
			xmlTag = "RptNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumber";
			definition = "Sequential number of the report.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Exact5NumericText.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ReportParameters3.mmReportIdentification, ReportParameters3.mmReportDateAndTime, ReportParameters3.mmReportCurrency, ReportParameters3.mmCalculationDateAndTime,
						ReportParameters3.mmFrequency, ReportParameters3.mmReportNumber);
				messageBuildingBlock_lazy = () -> Arrays.asList(MarginReportV02.mmReportParameters);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "ReportParameters3";
				definition = "Provides the parameters of the report.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "RptId", required = true)
	public Max35Text getReportIdentification() {
		return reportIdentification;
	}

	public void setReportIdentification(Max35Text reportIdentification) {
		this.reportIdentification = reportIdentification;
	}

	@XmlElement(name = "RptDtAndTm", required = true)
	public DateAndDateTimeChoice getReportDateAndTime() {
		return reportDateAndTime;
	}

	public void setReportDateAndTime(DateAndDateTimeChoice reportDateAndTime) {
		this.reportDateAndTime = reportDateAndTime;
	}

	@XmlElement(name = "RptCcy", required = true)
	public CurrencyCode getReportCurrency() {
		return reportCurrency;
	}

	public void setReportCurrency(CurrencyCode reportCurrency) {
		this.reportCurrency = reportCurrency;
	}

	@XmlElement(name = "ClctnDtAndTm", required = true)
	public ISODateTime getCalculationDateAndTime() {
		return calculationDateAndTime;
	}

	public void setCalculationDateAndTime(ISODateTime calculationDateAndTime) {
		this.calculationDateAndTime = calculationDateAndTime;
	}

	@XmlElement(name = "Frqcy", required = true)
	public EventFrequency6Code getFrequency() {
		return frequency;
	}

	public void setFrequency(EventFrequency6Code frequency) {
		this.frequency = frequency;
	}

	@XmlElement(name = "RptNb")
	public Exact5NumericText getReportNumber() {
		return reportNumber;
	}

	public void setReportNumber(Exact5NumericText reportNumber) {
		this.reportNumber = reportNumber;
	}
}