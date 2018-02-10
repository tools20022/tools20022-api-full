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
import com.tools20022.repository.choice.AccountIdentificationSearchCriteria2Choice;
import com.tools20022.repository.choice.DatePeriodSearch1Choice;
import com.tools20022.repository.choice.DateTimePeriod1Choice;
import com.tools20022.repository.datatype.Max4AlphaNumericText;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines the criteria used to search for a report.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportQuerySearchCriteria2#mmAccountIdentification
 * ReportQuerySearchCriteria2.mmAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportQuerySearchCriteria2#mmBalance
 * ReportQuerySearchCriteria2.mmBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportQuerySearchCriteria2#mmReportName
 * ReportQuerySearchCriteria2.mmReportName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportQuerySearchCriteria2#mmPartyIdentification
 * ReportQuerySearchCriteria2.mmPartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportQuerySearchCriteria2#mmResponsiblePartyIdentification
 * ReportQuerySearchCriteria2.mmResponsiblePartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportQuerySearchCriteria2#mmDateSearch
 * ReportQuerySearchCriteria2.mmDateSearch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportQuerySearchCriteria2#mmScheduledTime
 * ReportQuerySearchCriteria2.mmScheduledTime}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ReportQuerySearchCriteria2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the criteria used to search for a report."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.ReportQuerySearchCriteria1
 * ReportQuerySearchCriteria1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ReportQuerySearchCriteria2", propOrder = {"accountIdentification", "balance", "reportName", "partyIdentification", "responsiblePartyIdentification", "dateSearch", "scheduledTime"})
public class ReportQuerySearchCriteria2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AcctId")
	protected List<AccountIdentificationSearchCriteria2Choice> accountIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentificationSearchCriteria2Choice
	 * AccountIdentificationSearchCriteria2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportQuerySearchCriteria2
	 * ReportQuerySearchCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification for the account between the account owner and the account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ReportQuerySearchCriteria1#mmAccountIdentification
	 * ReportQuerySearchCriteria1.mmAccountIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportQuerySearchCriteria2.mmObject();
			isDerived = false;
			xmlTag = "AcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentification";
			definition = "Unique and unambiguous identification for the account between the account owner and the account servicer.";
			previousVersion_lazy = () -> ReportQuerySearchCriteria1.mmAccountIdentification;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AccountIdentificationSearchCriteria2Choice.mmObject();
		}
	};
	@XmlElement(name = "Bal")
	protected List<com.tools20022.repository.msg.CashBalance9> balance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashBalance9
	 * CashBalance9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportQuerySearchCriteria2
	 * ReportQuerySearchCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Bal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Balance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Numerical representation of the net increases and decreases in an account at a specific point in time. A cash balance is calculated from a sum of cash credits minus a sum of cash debits."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ReportQuerySearchCriteria1#mmBalance
	 * ReportQuerySearchCriteria1.mmBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBalance = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportQuerySearchCriteria2.mmObject();
			isDerived = false;
			xmlTag = "Bal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Balance";
			definition = "Numerical representation of the net increases and decreases in an account at a specific point in time. A cash balance is calculated from a sum of cash credits minus a sum of cash debits.";
			previousVersion_lazy = () -> ReportQuerySearchCriteria1.mmBalance;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashBalance9.mmObject();
		}
	};
	@XmlElement(name = "RptNm")
	protected Max4AlphaNumericText reportName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max4AlphaNumericText
	 * Max4AlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportQuerySearchCriteria2
	 * ReportQuerySearchCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Values of possible reports."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ReportQuerySearchCriteria1#mmReportName
	 * ReportQuerySearchCriteria1.mmReportName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReportName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportQuerySearchCriteria2.mmObject();
			isDerived = false;
			xmlTag = "RptNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportName";
			definition = "Values of possible reports.";
			previousVersion_lazy = () -> ReportQuerySearchCriteria1.mmReportName;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}
	};
	@XmlElement(name = "PtyId", required = true)
	protected PartyIdentification100 partyIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification100
	 * PartyIdentification100}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportQuerySearchCriteria2
	 * ReportQuerySearchCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PtyId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Report owning party."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ReportQuerySearchCriteria1#mmPartyIdentification
	 * ReportQuerySearchCriteria1.mmPartyIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPartyIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportQuerySearchCriteria2.mmObject();
			isDerived = false;
			xmlTag = "PtyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartyIdentification";
			definition = "Report owning party.";
			previousVersion_lazy = () -> ReportQuerySearchCriteria1.mmPartyIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.PartyIdentification100.mmObject();
		}
	};
	@XmlElement(name = "RspnsblPtyId")
	protected PartyIdentification100 responsiblePartyIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification100
	 * PartyIdentification100}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportQuerySearchCriteria2
	 * ReportQuerySearchCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RspnsblPtyId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResponsiblePartyIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Responsible Party of the report owning party."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ReportQuerySearchCriteria1#mmResponsiblePartyIdentification
	 * ReportQuerySearchCriteria1.mmResponsiblePartyIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmResponsiblePartyIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportQuerySearchCriteria2.mmObject();
			isDerived = false;
			xmlTag = "RspnsblPtyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResponsiblePartyIdentification";
			definition = "Responsible Party of the report owning party.";
			previousVersion_lazy = () -> ReportQuerySearchCriteria1.mmResponsiblePartyIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PartyIdentification100.mmObject();
		}
	};
	@XmlElement(name = "DtSch")
	protected DatePeriodSearch1Choice dateSearch;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DatePeriodSearch1Choice
	 * DatePeriodSearch1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportQuerySearchCriteria2
	 * ReportQuerySearchCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtSch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateSearch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time when the report was created."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ReportQuerySearchCriteria1#mmDateSearch
	 * ReportQuerySearchCriteria1.mmDateSearch}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDateSearch = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportQuerySearchCriteria2.mmObject();
			isDerived = false;
			xmlTag = "DtSch";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateSearch";
			definition = "Date and time when the report was created.";
			previousVersion_lazy = () -> ReportQuerySearchCriteria1.mmDateSearch;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DatePeriodSearch1Choice.mmObject();
		}
	};
	@XmlElement(name = "SchdldTm")
	protected DateTimePeriod1Choice scheduledTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateTimePeriod1Choice
	 * DateTimePeriod1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportQuerySearchCriteria2
	 * ReportQuerySearchCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SchdldTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ScheduledTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Time when the (business) event, which triggered the report, was scheduled."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ReportQuerySearchCriteria1#mmScheduledTime
	 * ReportQuerySearchCriteria1.mmScheduledTime}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmScheduledTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportQuerySearchCriteria2.mmObject();
			isDerived = false;
			xmlTag = "SchdldTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScheduledTime";
			definition = "Time when the (business) event, which triggered the report, was scheduled.";
			previousVersion_lazy = () -> ReportQuerySearchCriteria1.mmScheduledTime;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateTimePeriod1Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ReportQuerySearchCriteria2.mmAccountIdentification, com.tools20022.repository.msg.ReportQuerySearchCriteria2.mmBalance,
						com.tools20022.repository.msg.ReportQuerySearchCriteria2.mmReportName, com.tools20022.repository.msg.ReportQuerySearchCriteria2.mmPartyIdentification,
						com.tools20022.repository.msg.ReportQuerySearchCriteria2.mmResponsiblePartyIdentification, com.tools20022.repository.msg.ReportQuerySearchCriteria2.mmDateSearch,
						com.tools20022.repository.msg.ReportQuerySearchCriteria2.mmScheduledTime);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ReportQuerySearchCriteria2";
				definition = "Defines the criteria used to search for a report.";
				previousVersion_lazy = () -> ReportQuerySearchCriteria1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<AccountIdentificationSearchCriteria2Choice> getAccountIdentification() {
		return accountIdentification == null ? accountIdentification = new ArrayList<>() : accountIdentification;
	}

	public ReportQuerySearchCriteria2 setAccountIdentification(List<AccountIdentificationSearchCriteria2Choice> accountIdentification) {
		this.accountIdentification = Objects.requireNonNull(accountIdentification);
		return this;
	}

	public List<CashBalance9> getBalance() {
		return balance == null ? balance = new ArrayList<>() : balance;
	}

	public ReportQuerySearchCriteria2 setBalance(List<com.tools20022.repository.msg.CashBalance9> balance) {
		this.balance = Objects.requireNonNull(balance);
		return this;
	}

	public Optional<Max4AlphaNumericText> getReportName() {
		return reportName == null ? Optional.empty() : Optional.of(reportName);
	}

	public ReportQuerySearchCriteria2 setReportName(Max4AlphaNumericText reportName) {
		this.reportName = reportName;
		return this;
	}

	public PartyIdentification100 getPartyIdentification() {
		return partyIdentification;
	}

	public ReportQuerySearchCriteria2 setPartyIdentification(com.tools20022.repository.msg.PartyIdentification100 partyIdentification) {
		this.partyIdentification = Objects.requireNonNull(partyIdentification);
		return this;
	}

	public Optional<PartyIdentification100> getResponsiblePartyIdentification() {
		return responsiblePartyIdentification == null ? Optional.empty() : Optional.of(responsiblePartyIdentification);
	}

	public ReportQuerySearchCriteria2 setResponsiblePartyIdentification(com.tools20022.repository.msg.PartyIdentification100 responsiblePartyIdentification) {
		this.responsiblePartyIdentification = responsiblePartyIdentification;
		return this;
	}

	public Optional<DatePeriodSearch1Choice> getDateSearch() {
		return dateSearch == null ? Optional.empty() : Optional.of(dateSearch);
	}

	public ReportQuerySearchCriteria2 setDateSearch(DatePeriodSearch1Choice dateSearch) {
		this.dateSearch = dateSearch;
		return this;
	}

	public Optional<DateTimePeriod1Choice> getScheduledTime() {
		return scheduledTime == null ? Optional.empty() : Optional.of(scheduledTime);
	}

	public ReportQuerySearchCriteria2 setScheduledTime(DateTimePeriod1Choice scheduledTime) {
		this.scheduledTime = scheduledTime;
		return this;
	}
}