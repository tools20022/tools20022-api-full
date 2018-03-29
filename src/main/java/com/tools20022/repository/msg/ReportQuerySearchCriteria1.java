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
import com.tools20022.repository.choice.DateSearchChoice;
import com.tools20022.repository.choice.DateTimePeriodChoice;
import com.tools20022.repository.choice.PartyIdentification71Choice;
import com.tools20022.repository.datatype.Max4AlphaNumericText;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CashBalance4;
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
 * {@linkplain com.tools20022.repository.msg.ReportQuerySearchCriteria1#mmAccountIdentification
 * ReportQuerySearchCriteria1.mmAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportQuerySearchCriteria1#mmBalance
 * ReportQuerySearchCriteria1.mmBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportQuerySearchCriteria1#mmReportName
 * ReportQuerySearchCriteria1.mmReportName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportQuerySearchCriteria1#mmPartyIdentification
 * ReportQuerySearchCriteria1.mmPartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportQuerySearchCriteria1#mmResponsiblePartyIdentification
 * ReportQuerySearchCriteria1.mmResponsiblePartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportQuerySearchCriteria1#mmDateSearch
 * ReportQuerySearchCriteria1.mmDateSearch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportQuerySearchCriteria1#mmScheduledTime
 * ReportQuerySearchCriteria1.mmScheduledTime}</li>
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
 * "ReportQuerySearchCriteria1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the criteria used to search for a report."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ReportQuerySearchCriteria2
 * ReportQuerySearchCriteria2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ReportQuerySearchCriteria1", propOrder = {"accountIdentification", "balance", "reportName", "partyIdentification", "responsiblePartyIdentification", "dateSearch", "scheduledTime"})
public class ReportQuerySearchCriteria1 {

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
	 * {@linkplain com.tools20022.repository.msg.ReportQuerySearchCriteria1
	 * ReportQuerySearchCriteria1}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportQuerySearchCriteria2#mmAccountIdentification
	 * ReportQuerySearchCriteria2.mmAccountIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReportQuerySearchCriteria1, List<AccountIdentificationSearchCriteria2Choice>> mmAccountIdentification = new MMMessageAssociationEnd<ReportQuerySearchCriteria1, List<AccountIdentificationSearchCriteria2Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportQuerySearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "AcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentification";
			definition = "Unique and unambiguous identification for the account between the account owner and the account servicer.";
			nextVersions_lazy = () -> Arrays.asList(ReportQuerySearchCriteria2.mmAccountIdentification);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AccountIdentificationSearchCriteria2Choice.mmObject();
		}

		@Override
		public List<AccountIdentificationSearchCriteria2Choice> getValue(ReportQuerySearchCriteria1 obj) {
			return obj.getAccountIdentification();
		}

		@Override
		public void setValue(ReportQuerySearchCriteria1 obj, List<AccountIdentificationSearchCriteria2Choice> value) {
			obj.setAccountIdentification(value);
		}
	};
	@XmlElement(name = "Bal")
	protected List<CashBalance4> balance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashBalance4
	 * CashBalance4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportQuerySearchCriteria1
	 * ReportQuerySearchCriteria1}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportQuerySearchCriteria2#mmBalance
	 * ReportQuerySearchCriteria2.mmBalance}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReportQuerySearchCriteria1, List<CashBalance4>> mmBalance = new MMMessageAssociationEnd<ReportQuerySearchCriteria1, List<CashBalance4>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportQuerySearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "Bal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Balance";
			definition = "Numerical representation of the net increases and decreases in an account at a specific point in time. A cash balance is calculated from a sum of cash credits minus a sum of cash debits.";
			nextVersions_lazy = () -> Arrays.asList(ReportQuerySearchCriteria2.mmBalance);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashBalance4.mmObject();
		}

		@Override
		public List<CashBalance4> getValue(ReportQuerySearchCriteria1 obj) {
			return obj.getBalance();
		}

		@Override
		public void setValue(ReportQuerySearchCriteria1 obj, List<CashBalance4> value) {
			obj.setBalance(value);
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
	 * {@linkplain com.tools20022.repository.msg.ReportQuerySearchCriteria1
	 * ReportQuerySearchCriteria1}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportQuerySearchCriteria2#mmReportName
	 * ReportQuerySearchCriteria2.mmReportName}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ReportQuerySearchCriteria1, Optional<Max4AlphaNumericText>> mmReportName = new MMMessageAttribute<ReportQuerySearchCriteria1, Optional<Max4AlphaNumericText>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportQuerySearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "RptNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportName";
			definition = "Values of possible reports.";
			nextVersions_lazy = () -> Arrays.asList(ReportQuerySearchCriteria2.mmReportName);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}

		@Override
		public Optional<Max4AlphaNumericText> getValue(ReportQuerySearchCriteria1 obj) {
			return obj.getReportName();
		}

		@Override
		public void setValue(ReportQuerySearchCriteria1 obj, Optional<Max4AlphaNumericText> value) {
			obj.setReportName(value.orElse(null));
		}
	};
	@XmlElement(name = "PtyId", required = true)
	protected PartyIdentification71Choice partyIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification71Choice
	 * PartyIdentification71Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportQuerySearchCriteria1
	 * ReportQuerySearchCriteria1}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportQuerySearchCriteria2#mmPartyIdentification
	 * ReportQuerySearchCriteria2.mmPartyIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ReportQuerySearchCriteria1, PartyIdentification71Choice> mmPartyIdentification = new MMMessageAttribute<ReportQuerySearchCriteria1, PartyIdentification71Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportQuerySearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "PtyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartyIdentification";
			definition = "Report owning party.";
			nextVersions_lazy = () -> Arrays.asList(ReportQuerySearchCriteria2.mmPartyIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyIdentification71Choice.mmObject();
		}

		@Override
		public PartyIdentification71Choice getValue(ReportQuerySearchCriteria1 obj) {
			return obj.getPartyIdentification();
		}

		@Override
		public void setValue(ReportQuerySearchCriteria1 obj, PartyIdentification71Choice value) {
			obj.setPartyIdentification(value);
		}
	};
	@XmlElement(name = "RspnsblPtyId")
	protected PartyIdentification71Choice responsiblePartyIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification71Choice
	 * PartyIdentification71Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportQuerySearchCriteria1
	 * ReportQuerySearchCriteria1}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportQuerySearchCriteria2#mmResponsiblePartyIdentification
	 * ReportQuerySearchCriteria2.mmResponsiblePartyIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ReportQuerySearchCriteria1, Optional<PartyIdentification71Choice>> mmResponsiblePartyIdentification = new MMMessageAttribute<ReportQuerySearchCriteria1, Optional<PartyIdentification71Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportQuerySearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "RspnsblPtyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResponsiblePartyIdentification";
			definition = "Responsible Party of the report owning party.";
			nextVersions_lazy = () -> Arrays.asList(ReportQuerySearchCriteria2.mmResponsiblePartyIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification71Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification71Choice> getValue(ReportQuerySearchCriteria1 obj) {
			return obj.getResponsiblePartyIdentification();
		}

		@Override
		public void setValue(ReportQuerySearchCriteria1 obj, Optional<PartyIdentification71Choice> value) {
			obj.setResponsiblePartyIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "DtSch")
	protected DateSearchChoice dateSearch;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateSearchChoice
	 * DateSearchChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportQuerySearchCriteria1
	 * ReportQuerySearchCriteria1}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportQuerySearchCriteria2#mmDateSearch
	 * ReportQuerySearchCriteria2.mmDateSearch}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ReportQuerySearchCriteria1, Optional<DateSearchChoice>> mmDateSearch = new MMMessageAttribute<ReportQuerySearchCriteria1, Optional<DateSearchChoice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportQuerySearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "DtSch";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateSearch";
			definition = "Date and time when the report was created.";
			nextVersions_lazy = () -> Arrays.asList(ReportQuerySearchCriteria2.mmDateSearch);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateSearchChoice.mmObject();
		}

		@Override
		public Optional<DateSearchChoice> getValue(ReportQuerySearchCriteria1 obj) {
			return obj.getDateSearch();
		}

		@Override
		public void setValue(ReportQuerySearchCriteria1 obj, Optional<DateSearchChoice> value) {
			obj.setDateSearch(value.orElse(null));
		}
	};
	@XmlElement(name = "SchdldTm")
	protected DateTimePeriodChoice scheduledTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateTimePeriodChoice
	 * DateTimePeriodChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportQuerySearchCriteria1
	 * ReportQuerySearchCriteria1}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportQuerySearchCriteria2#mmScheduledTime
	 * ReportQuerySearchCriteria2.mmScheduledTime}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ReportQuerySearchCriteria1, Optional<DateTimePeriodChoice>> mmScheduledTime = new MMMessageAttribute<ReportQuerySearchCriteria1, Optional<DateTimePeriodChoice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportQuerySearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "SchdldTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScheduledTime";
			definition = "Time when the (business) event, which triggered the report, was scheduled.";
			nextVersions_lazy = () -> Arrays.asList(ReportQuerySearchCriteria2.mmScheduledTime);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateTimePeriodChoice.mmObject();
		}

		@Override
		public Optional<DateTimePeriodChoice> getValue(ReportQuerySearchCriteria1 obj) {
			return obj.getScheduledTime();
		}

		@Override
		public void setValue(ReportQuerySearchCriteria1 obj, Optional<DateTimePeriodChoice> value) {
			obj.setScheduledTime(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ReportQuerySearchCriteria1.mmAccountIdentification, com.tools20022.repository.msg.ReportQuerySearchCriteria1.mmBalance,
						com.tools20022.repository.msg.ReportQuerySearchCriteria1.mmReportName, com.tools20022.repository.msg.ReportQuerySearchCriteria1.mmPartyIdentification,
						com.tools20022.repository.msg.ReportQuerySearchCriteria1.mmResponsiblePartyIdentification, com.tools20022.repository.msg.ReportQuerySearchCriteria1.mmDateSearch,
						com.tools20022.repository.msg.ReportQuerySearchCriteria1.mmScheduledTime);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ReportQuerySearchCriteria1";
				definition = "Defines the criteria used to search for a report.";
				nextVersions_lazy = () -> Arrays.asList(ReportQuerySearchCriteria2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public List<AccountIdentificationSearchCriteria2Choice> getAccountIdentification() {
		return accountIdentification == null ? accountIdentification = new ArrayList<>() : accountIdentification;
	}

	public ReportQuerySearchCriteria1 setAccountIdentification(List<AccountIdentificationSearchCriteria2Choice> accountIdentification) {
		this.accountIdentification = Objects.requireNonNull(accountIdentification);
		return this;
	}

	public List<CashBalance4> getBalance() {
		return balance == null ? balance = new ArrayList<>() : balance;
	}

	public ReportQuerySearchCriteria1 setBalance(List<CashBalance4> balance) {
		this.balance = Objects.requireNonNull(balance);
		return this;
	}

	public Optional<Max4AlphaNumericText> getReportName() {
		return reportName == null ? Optional.empty() : Optional.of(reportName);
	}

	public ReportQuerySearchCriteria1 setReportName(Max4AlphaNumericText reportName) {
		this.reportName = reportName;
		return this;
	}

	public PartyIdentification71Choice getPartyIdentification() {
		return partyIdentification;
	}

	public ReportQuerySearchCriteria1 setPartyIdentification(PartyIdentification71Choice partyIdentification) {
		this.partyIdentification = Objects.requireNonNull(partyIdentification);
		return this;
	}

	public Optional<PartyIdentification71Choice> getResponsiblePartyIdentification() {
		return responsiblePartyIdentification == null ? Optional.empty() : Optional.of(responsiblePartyIdentification);
	}

	public ReportQuerySearchCriteria1 setResponsiblePartyIdentification(PartyIdentification71Choice responsiblePartyIdentification) {
		this.responsiblePartyIdentification = responsiblePartyIdentification;
		return this;
	}

	public Optional<DateSearchChoice> getDateSearch() {
		return dateSearch == null ? Optional.empty() : Optional.of(dateSearch);
	}

	public ReportQuerySearchCriteria1 setDateSearch(DateSearchChoice dateSearch) {
		this.dateSearch = dateSearch;
		return this;
	}

	public Optional<DateTimePeriodChoice> getScheduledTime() {
		return scheduledTime == null ? Optional.empty() : Optional.of(scheduledTime);
	}

	public ReportQuerySearchCriteria1 setScheduledTime(DateTimePeriodChoice scheduledTime) {
		this.scheduledTime = scheduledTime;
		return this;
	}
}