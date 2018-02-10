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
import com.tools20022.repository.codeset.ReportIndicator1Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines the criteria which are used to search for a transaction and to report
 * on the transaction. A name may be given to the new query.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionCriteria3#mmNewQueryName
 * TransactionCriteria3.mmNewQueryName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionCriteria3#mmSearchCriteria
 * TransactionCriteria3.mmSearchCriteria}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionCriteria3#mmStatementReport
 * TransactionCriteria3.mmStatementReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionCriteria3#mmReturnCriteria
 * TransactionCriteria3.mmReturnCriteria}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintSearchAndReturnCriteriaAndStatementReportRule#forTransactionCriteria3
 * ConstraintSearchAndReturnCriteriaAndStatementReportRule.
 * forTransactionCriteria3}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TransactionCriteria3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines the criteria which are used to search for a transaction and to report on the transaction. A name may be given to the new query."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TransactionCriteria3", propOrder = {"newQueryName", "searchCriteria", "statementReport", "returnCriteria"})
public class TransactionCriteria3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "NewQryNm")
	protected Max35Text newQueryName;
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
	 * {@linkplain com.tools20022.repository.msg.TransactionCriteria3
	 * TransactionCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewQryNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewQueryName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name of the query defined by the search criteria and return criteria."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNewQueryName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionCriteria3.mmObject();
			isDerived = false;
			xmlTag = "NewQryNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewQueryName";
			definition = "Name of the query defined by the search criteria and return criteria.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "SchCrit")
	protected List<com.tools20022.repository.msg.TransactionSearchCriteria3> searchCriteria;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TransactionSearchCriteria3
	 * TransactionSearchCriteria3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionCriteria3
	 * TransactionCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SchCrit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SearchCriteria"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the criteria on which the information is extracted."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSearchCriteria = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionCriteria3.mmObject();
			isDerived = false;
			xmlTag = "SchCrit";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SearchCriteria";
			definition = "Defines the criteria on which the information is extracted.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TransactionSearchCriteria3.mmObject();
		}
	};
	@XmlElement(name = "StmtRpt")
	protected ReportIndicator1Code statementReport;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ReportIndicator1Code
	 * ReportIndicator1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionCriteria3
	 * TransactionCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmtRpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the format of the requested report."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatementReport = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionCriteria3.mmObject();
			isDerived = false;
			xmlTag = "StmtRpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementReport";
			definition = "Indicates the format of the requested report.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ReportIndicator1Code.mmObject();
		}
	};
	@XmlElement(name = "RtrCrit")
	protected TransactionReturnCriteria2 returnCriteria;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TransactionReturnCriteria2
	 * TransactionReturnCriteria2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionCriteria3
	 * TransactionCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RtrCrit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnCriteria"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines the expected report."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReturnCriteria = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionCriteria3.mmObject();
			isDerived = false;
			xmlTag = "RtrCrit";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnCriteria";
			definition = "Defines the expected report.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TransactionReturnCriteria2.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionCriteria3.mmNewQueryName, com.tools20022.repository.msg.TransactionCriteria3.mmSearchCriteria,
						com.tools20022.repository.msg.TransactionCriteria3.mmStatementReport, com.tools20022.repository.msg.TransactionCriteria3.mmReturnCriteria);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSearchAndReturnCriteriaAndStatementReportRule.forTransactionCriteria3);
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "TransactionCriteria3";
				definition = "Defines the criteria which are used to search for a transaction and to report on the transaction. A name may be given to the new query.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getNewQueryName() {
		return newQueryName == null ? Optional.empty() : Optional.of(newQueryName);
	}

	public TransactionCriteria3 setNewQueryName(Max35Text newQueryName) {
		this.newQueryName = newQueryName;
		return this;
	}

	public List<TransactionSearchCriteria3> getSearchCriteria() {
		return searchCriteria == null ? searchCriteria = new ArrayList<>() : searchCriteria;
	}

	public TransactionCriteria3 setSearchCriteria(List<com.tools20022.repository.msg.TransactionSearchCriteria3> searchCriteria) {
		this.searchCriteria = Objects.requireNonNull(searchCriteria);
		return this;
	}

	public Optional<ReportIndicator1Code> getStatementReport() {
		return statementReport == null ? Optional.empty() : Optional.of(statementReport);
	}

	public TransactionCriteria3 setStatementReport(ReportIndicator1Code statementReport) {
		this.statementReport = statementReport;
		return this;
	}

	public Optional<TransactionReturnCriteria2> getReturnCriteria() {
		return returnCriteria == null ? Optional.empty() : Optional.of(returnCriteria);
	}

	public TransactionCriteria3 setReturnCriteria(com.tools20022.repository.msg.TransactionReturnCriteria2 returnCriteria) {
		this.returnCriteria = returnCriteria;
		return this;
	}
}