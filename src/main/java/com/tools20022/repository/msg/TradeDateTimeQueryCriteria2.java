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
import com.tools20022.repository.choice.DateOrBlankQuery2Choice;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.DateTimePeriodDetails;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Date and time query criteria.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeDateTimeQueryCriteria2#mmReportingDateTime
 * TradeDateTimeQueryCriteria2.mmReportingDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeDateTimeQueryCriteria2#mmExecutionDateTime
 * TradeDateTimeQueryCriteria2.mmExecutionDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeDateTimeQueryCriteria2#mmMaturityDate
 * TradeDateTimeQueryCriteria2.mmMaturityDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeDateTimeQueryCriteria2#mmTerminationDate
 * TradeDateTimeQueryCriteria2.mmTerminationDate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOneElementPresentRule#forTradeDateTimeQueryCriteria2
 * ConstraintOneElementPresentRule.forTradeDateTimeQueryCriteria2}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradeDateTimeQueryCriteria2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Date and time query criteria."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TradeDateTimeQueryCriteria2", propOrder = {"reportingDateTime", "executionDateTime", "maturityDate", "terminationDate"})
public class TradeDateTimeQueryCriteria2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RptgDtTm")
	protected DateTimePeriodDetails reportingDateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DateTimePeriodDetails
	 * DateTimePeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeDateTimeQueryCriteria2
	 * TradeDateTimeQueryCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptgDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportingDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the reporting date and full hour that transaction was reported.\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeDateTimeQueryCriteria2, Optional<DateTimePeriodDetails>> mmReportingDateTime = new MMMessageAssociationEnd<TradeDateTimeQueryCriteria2, Optional<DateTimePeriodDetails>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeDateTimeQueryCriteria2.mmObject();
			isDerived = false;
			xmlTag = "RptgDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportingDateTime";
			definition = "Indicates the reporting date and full hour that transaction was reported.\r\n";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateTimePeriodDetails.mmObject();
		}

		@Override
		public Optional<DateTimePeriodDetails> getValue(TradeDateTimeQueryCriteria2 obj) {
			return obj.getReportingDateTime();
		}

		@Override
		public void setValue(TradeDateTimeQueryCriteria2 obj, Optional<DateTimePeriodDetails> value) {
			obj.setReportingDateTime(value.orElse(null));
		}
	};
	@XmlElement(name = "ExctnDtTm")
	protected DateTimePeriodDetails executionDateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DateTimePeriodDetails
	 * DateTimePeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeDateTimeQueryCriteria2
	 * TradeDateTimeQueryCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ExctnDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExecutionDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the date and full hour the trade was executed."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeDateTimeQueryCriteria2, Optional<DateTimePeriodDetails>> mmExecutionDateTime = new MMMessageAssociationEnd<TradeDateTimeQueryCriteria2, Optional<DateTimePeriodDetails>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeDateTimeQueryCriteria2.mmObject();
			isDerived = false;
			xmlTag = "ExctnDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExecutionDateTime";
			definition = "Indicates the date and full hour the trade was executed.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateTimePeriodDetails.mmObject();
		}

		@Override
		public Optional<DateTimePeriodDetails> getValue(TradeDateTimeQueryCriteria2 obj) {
			return obj.getExecutionDateTime();
		}

		@Override
		public void setValue(TradeDateTimeQueryCriteria2 obj, Optional<DateTimePeriodDetails> value) {
			obj.setExecutionDateTime(value.orElse(null));
		}
	};
	@XmlElement(name = "MtrtyDt")
	protected DateOrBlankQuery2Choice maturityDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateOrBlankQuery2Choice
	 * DateOrBlankQuery2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeDateTimeQueryCriteria2
	 * TradeDateTimeQueryCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtrtyDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaturityDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the date when the trade was matured."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeDateTimeQueryCriteria2, Optional<DateOrBlankQuery2Choice>> mmMaturityDate = new MMMessageAttribute<TradeDateTimeQueryCriteria2, Optional<DateOrBlankQuery2Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeDateTimeQueryCriteria2.mmObject();
			isDerived = false;
			xmlTag = "MtrtyDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaturityDate";
			definition = "Indicates the date when the trade was matured.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateOrBlankQuery2Choice.mmObject();
		}

		@Override
		public Optional<DateOrBlankQuery2Choice> getValue(TradeDateTimeQueryCriteria2 obj) {
			return obj.getMaturityDate();
		}

		@Override
		public void setValue(TradeDateTimeQueryCriteria2 obj, Optional<DateOrBlankQuery2Choice> value) {
			obj.setMaturityDate(value.orElse(null));
		}
	};
	@XmlElement(name = "TermntnDt")
	protected DateOrBlankQuery2Choice terminationDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DateOrBlankQuery2Choice
	 * DateOrBlankQuery2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeDateTimeQueryCriteria2
	 * TradeDateTimeQueryCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TermntnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the date when the trade was terminated."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeDateTimeQueryCriteria2, Optional<DateOrBlankQuery2Choice>> mmTerminationDate = new MMMessageAssociationEnd<TradeDateTimeQueryCriteria2, Optional<DateOrBlankQuery2Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeDateTimeQueryCriteria2.mmObject();
			isDerived = false;
			xmlTag = "TermntnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminationDate";
			definition = "Indicates the date when the trade was terminated.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateOrBlankQuery2Choice.mmObject();
		}

		@Override
		public Optional<DateOrBlankQuery2Choice> getValue(TradeDateTimeQueryCriteria2 obj) {
			return obj.getTerminationDate();
		}

		@Override
		public void setValue(TradeDateTimeQueryCriteria2 obj, Optional<DateOrBlankQuery2Choice> value) {
			obj.setTerminationDate(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeDateTimeQueryCriteria2.mmReportingDateTime, com.tools20022.repository.msg.TradeDateTimeQueryCriteria2.mmExecutionDateTime,
						com.tools20022.repository.msg.TradeDateTimeQueryCriteria2.mmMaturityDate, com.tools20022.repository.msg.TradeDateTimeQueryCriteria2.mmTerminationDate);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOneElementPresentRule.forTradeDateTimeQueryCriteria2);
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "TradeDateTimeQueryCriteria2";
				definition = "Date and time query criteria.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<DateTimePeriodDetails> getReportingDateTime() {
		return reportingDateTime == null ? Optional.empty() : Optional.of(reportingDateTime);
	}

	public TradeDateTimeQueryCriteria2 setReportingDateTime(DateTimePeriodDetails reportingDateTime) {
		this.reportingDateTime = reportingDateTime;
		return this;
	}

	public Optional<DateTimePeriodDetails> getExecutionDateTime() {
		return executionDateTime == null ? Optional.empty() : Optional.of(executionDateTime);
	}

	public TradeDateTimeQueryCriteria2 setExecutionDateTime(DateTimePeriodDetails executionDateTime) {
		this.executionDateTime = executionDateTime;
		return this;
	}

	public Optional<DateOrBlankQuery2Choice> getMaturityDate() {
		return maturityDate == null ? Optional.empty() : Optional.of(maturityDate);
	}

	public TradeDateTimeQueryCriteria2 setMaturityDate(DateOrBlankQuery2Choice maturityDate) {
		this.maturityDate = maturityDate;
		return this;
	}

	public Optional<DateOrBlankQuery2Choice> getTerminationDate() {
		return terminationDate == null ? Optional.empty() : Optional.of(terminationDate);
	}

	public TradeDateTimeQueryCriteria2 setTerminationDate(DateOrBlankQuery2Choice terminationDate) {
		this.terminationDate = terminationDate;
		return this;
	}
}