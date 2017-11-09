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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ReportQuerySearchCriteria1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the criteria used to search for a report."</li>
 * </ul>
 */
public class ReportQuerySearchCriteria1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected List<AccountIdentificationSearchCriteria2Choice> accountIdentification;
	/**
	 * Unique and unambiguous identification for the account between the account
	 * owner and the account servicer.
	 * <p>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ReportQuerySearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "AcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentification";
			definition = "Unique and unambiguous identification for the account between the account owner and the account servicer.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AccountIdentificationSearchCriteria2Choice.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.CashBalance4> balance;
	/**
	 * Numerical representation of the net increases and decreases in an account
	 * at a specific point in time. A cash balance is calculated from a sum of
	 * cash credits minus a sum of cash debits.
	 * <p>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBalance = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ReportQuerySearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "Bal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Balance";
			definition = "Numerical representation of the net increases and decreases in an account at a specific point in time. A cash balance is calculated from a sum of cash credits minus a sum of cash debits.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashBalance4.mmObject();
		}
	};
	protected Max4AlphaNumericText reportName;
	/**
	 * Values of possible reports.
	 * <p>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmReportName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ReportQuerySearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "RptNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportName";
			definition = "Values of possible reports.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}
	};
	protected PartyIdentification71Choice partyIdentification;
	/**
	 * Report owning party.
	 * <p>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmPartyIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ReportQuerySearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "PtyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartyIdentification";
			definition = "Report owning party.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyIdentification71Choice.mmObject();
		}
	};
	protected PartyIdentification71Choice responsiblePartyIdentification;
	/**
	 * Responsible Party of the report owning party.
	 * <p>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmResponsiblePartyIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ReportQuerySearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "RspnsblPtyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResponsiblePartyIdentification";
			definition = "Responsible Party of the report owning party.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification71Choice.mmObject();
		}
	};
	protected DateSearchChoice dateSearch;
	/**
	 * Date and time when the report was created.
	 * <p>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmDateSearch = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ReportQuerySearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "DtSch";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateSearch";
			definition = "Date and time when the report was created.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateSearchChoice.mmObject();
		}
	};
	protected DateTimePeriodChoice scheduledTime;
	/**
	 * Time when the (business) event, which triggered the report, was
	 * scheduled.
	 * <p>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmScheduledTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ReportQuerySearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "SchdldTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScheduledTime";
			definition = "Time when the (business) event, which triggered the report, was scheduled.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateTimePeriodChoice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ReportQuerySearchCriteria1.mmAccountIdentification, ReportQuerySearchCriteria1.mmBalance, ReportQuerySearchCriteria1.mmReportName, ReportQuerySearchCriteria1.mmPartyIdentification,
						ReportQuerySearchCriteria1.mmResponsiblePartyIdentification, ReportQuerySearchCriteria1.mmDateSearch, ReportQuerySearchCriteria1.mmScheduledTime);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ReportQuerySearchCriteria1";
				definition = "Defines the criteria used to search for a report.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<AccountIdentificationSearchCriteria2Choice> getAccountIdentification() {
		return accountIdentification;
	}

	public void setAccountIdentification(List<AccountIdentificationSearchCriteria2Choice> accountIdentification) {
		this.accountIdentification = accountIdentification;
	}

	public List<CashBalance4> getBalance() {
		return balance;
	}

	public void setBalance(List<com.tools20022.repository.msg.CashBalance4> balance) {
		this.balance = balance;
	}

	public Max4AlphaNumericText getReportName() {
		return reportName;
	}

	public void setReportName(Max4AlphaNumericText reportName) {
		this.reportName = reportName;
	}

	public PartyIdentification71Choice getPartyIdentification() {
		return partyIdentification;
	}

	public void setPartyIdentification(PartyIdentification71Choice partyIdentification) {
		this.partyIdentification = partyIdentification;
	}

	public PartyIdentification71Choice getResponsiblePartyIdentification() {
		return responsiblePartyIdentification;
	}

	public void setResponsiblePartyIdentification(PartyIdentification71Choice responsiblePartyIdentification) {
		this.responsiblePartyIdentification = responsiblePartyIdentification;
	}

	public DateSearchChoice getDateSearch() {
		return dateSearch;
	}

	public void setDateSearch(DateSearchChoice dateSearch) {
		this.dateSearch = dateSearch;
	}

	public DateTimePeriodChoice getScheduledTime() {
		return scheduledTime;
	}

	public void setScheduledTime(DateTimePeriodChoice scheduledTime) {
		this.scheduledTime = scheduledTime;
	}
}