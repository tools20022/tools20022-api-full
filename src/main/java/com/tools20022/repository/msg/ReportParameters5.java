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
import com.tools20022.repository.area.colr.CollateralAndExposureReportV03;
import com.tools20022.repository.choice.DateAndDateTimeChoice;
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.codeset.EventFrequency6Code;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
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
 * {@linkplain com.tools20022.repository.msg.ReportParameters5#mmReportIdentification
 * ReportParameters5.mmReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportParameters5#mmReportDateAndTime
 * ReportParameters5.mmReportDateAndTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportParameters5#mmFrequency
 * ReportParameters5.mmFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportParameters5#mmReportCurrency
 * ReportParameters5.mmReportCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportParameters5#mmCalculationDate
 * ReportParameters5.mmCalculationDate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralAndExposureReportV03#mmReportParameters
 * CollateralAndExposureReportV03.mmReportParameters}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ReportParameters5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides the parameters of the report."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.ReportParameters2
 * ReportParameters2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ReportParameters5", propOrder = {"reportIdentification", "reportDateAndTime", "frequency", "reportCurrency", "calculationDate"})
public class ReportParameters5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RptId", required = true)
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
	 * {@linkplain com.tools20022.repository.msg.ReportParameters5
	 * ReportParameters5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ReportParameters2#mmReportIdentification
	 * ReportParameters2.mmReportIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ReportParameters5, Max35Text> mmReportIdentification = new MMMessageAttribute<ReportParameters5, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportParameters5.mmObject();
			isDerived = false;
			xmlTag = "RptId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportIdentification";
			definition = "Unique identification of the report.";
			previousVersion_lazy = () -> ReportParameters2.mmReportIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(ReportParameters5 obj) {
			return obj.getReportIdentification();
		}

		@Override
		public void setValue(ReportParameters5 obj, Max35Text value) {
			obj.setReportIdentification(value);
		}
	};
	@XmlElement(name = "RptDtAndTm", required = true)
	protected DateAndDateTimeChoice reportDateAndTime;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.ReportParameters5
	 * ReportParameters5}</li>
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
	 * definition} = "Date (and time) at which the report was created."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ReportParameters2#mmReportDateAndTime
	 * ReportParameters2.mmReportDateAndTime}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ReportParameters5, DateAndDateTimeChoice> mmReportDateAndTime = new MMMessageAttribute<ReportParameters5, DateAndDateTimeChoice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportParameters5.mmObject();
			isDerived = false;
			xmlTag = "RptDtAndTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportDateAndTime";
			definition = "Date (and time) at which the report was created.";
			previousVersion_lazy = () -> ReportParameters2.mmReportDateAndTime;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public DateAndDateTimeChoice getValue(ReportParameters5 obj) {
			return obj.getReportDateAndTime();
		}

		@Override
		public void setValue(ReportParameters5 obj, DateAndDateTimeChoice value) {
			obj.setReportDateAndTime(value);
		}
	};
	@XmlElement(name = "Frqcy", required = true)
	protected EventFrequency6Code frequency;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.ReportParameters5
	 * ReportParameters5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ReportParameters2#mmFrequency
	 * ReportParameters2.mmFrequency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ReportParameters5, EventFrequency6Code> mmFrequency = new MMMessageAttribute<ReportParameters5, EventFrequency6Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportParameters5.mmObject();
			isDerived = false;
			xmlTag = "Frqcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Frequency";
			definition = "Frequency of the report.";
			previousVersion_lazy = () -> ReportParameters2.mmFrequency;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EventFrequency6Code.mmObject();
		}

		@Override
		public EventFrequency6Code getValue(ReportParameters5 obj) {
			return obj.getFrequency();
		}

		@Override
		public void setValue(ReportParameters5 obj, EventFrequency6Code value) {
			obj.setFrequency(value);
		}
	};
	@XmlElement(name = "RptCcy", required = true)
	protected ActiveCurrencyCode reportCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveCurrencyCode
	 * ActiveCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportParameters5
	 * ReportParameters5}</li>
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
	 * definition} =
	 * "Indicates the currency used for the calculation of the guarantee fund."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ReportParameters2#mmReportCurrency
	 * ReportParameters2.mmReportCurrency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ReportParameters5, ActiveCurrencyCode> mmReportCurrency = new MMMessageAttribute<ReportParameters5, ActiveCurrencyCode>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportParameters5.mmObject();
			isDerived = false;
			xmlTag = "RptCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportCurrency";
			definition = "Indicates the currency used for the calculation of the guarantee fund.";
			previousVersion_lazy = () -> ReportParameters2.mmReportCurrency;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}

		@Override
		public ActiveCurrencyCode getValue(ReportParameters5 obj) {
			return obj.getReportCurrency();
		}

		@Override
		public void setValue(ReportParameters5 obj, ActiveCurrencyCode value) {
			obj.setReportCurrency(value);
		}
	};
	@XmlElement(name = "ClctnDt")
	protected ISODateTime calculationDate;
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
	 * {@linkplain com.tools20022.repository.msg.ReportParameters5
	 * ReportParameters5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClctnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalculationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the date of calculation of the deficit (if any)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ReportParameters2#mmCalculationDate
	 * ReportParameters2.mmCalculationDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ReportParameters5, Optional<ISODateTime>> mmCalculationDate = new MMMessageAttribute<ReportParameters5, Optional<ISODateTime>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportParameters5.mmObject();
			isDerived = false;
			xmlTag = "ClctnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CalculationDate";
			definition = "Indicates the date of calculation of the deficit (if any).";
			previousVersion_lazy = () -> ReportParameters2.mmCalculationDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(ReportParameters5 obj) {
			return obj.getCalculationDate();
		}

		@Override
		public void setValue(ReportParameters5 obj, Optional<ISODateTime> value) {
			obj.setCalculationDate(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ReportParameters5.mmReportIdentification, com.tools20022.repository.msg.ReportParameters5.mmReportDateAndTime,
						com.tools20022.repository.msg.ReportParameters5.mmFrequency, com.tools20022.repository.msg.ReportParameters5.mmReportCurrency, com.tools20022.repository.msg.ReportParameters5.mmCalculationDate);
				messageBuildingBlock_lazy = () -> Arrays.asList(CollateralAndExposureReportV03.mmReportParameters);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ReportParameters5";
				definition = "Provides the parameters of the report.";
				previousVersion_lazy = () -> ReportParameters2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getReportIdentification() {
		return reportIdentification;
	}

	public ReportParameters5 setReportIdentification(Max35Text reportIdentification) {
		this.reportIdentification = Objects.requireNonNull(reportIdentification);
		return this;
	}

	public DateAndDateTimeChoice getReportDateAndTime() {
		return reportDateAndTime;
	}

	public ReportParameters5 setReportDateAndTime(DateAndDateTimeChoice reportDateAndTime) {
		this.reportDateAndTime = Objects.requireNonNull(reportDateAndTime);
		return this;
	}

	public EventFrequency6Code getFrequency() {
		return frequency;
	}

	public ReportParameters5 setFrequency(EventFrequency6Code frequency) {
		this.frequency = Objects.requireNonNull(frequency);
		return this;
	}

	public ActiveCurrencyCode getReportCurrency() {
		return reportCurrency;
	}

	public ReportParameters5 setReportCurrency(ActiveCurrencyCode reportCurrency) {
		this.reportCurrency = Objects.requireNonNull(reportCurrency);
		return this;
	}

	public Optional<ISODateTime> getCalculationDate() {
		return calculationDate == null ? Optional.empty() : Optional.of(calculationDate);
	}

	public ReportParameters5 setCalculationDate(ISODateTime calculationDate) {
		this.calculationDate = calculationDate;
		return this;
	}
}