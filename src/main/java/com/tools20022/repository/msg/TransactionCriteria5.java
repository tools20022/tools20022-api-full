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
import com.tools20022.repository.msg.TransactionReturnCriteria3;
import com.tools20022.repository.msg.TransactionSearchCriteria5;
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
 * {@linkplain com.tools20022.repository.msg.TransactionCriteria5#mmNewQueryName
 * TransactionCriteria5.mmNewQueryName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionCriteria5#mmSearchCriteria
 * TransactionCriteria5.mmSearchCriteria}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionCriteria5#mmStatementReport
 * TransactionCriteria5.mmStatementReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionCriteria5#mmReturnCriteria
 * TransactionCriteria5.mmReturnCriteria}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintSearchAndReturnCriteriaAndStatementReportRule#forTransactionCriteria5
 * ConstraintSearchAndReturnCriteriaAndStatementReportRule.
 * forTransactionCriteria5}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TransactionCriteria5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines the criteria which are used to search for a transaction and to report on the transaction. A name may be given to the new query."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionCriteria6
 * TransactionCriteria6}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.TransactionCriteria4
 * TransactionCriteria4}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TransactionCriteria5", propOrder = {"newQueryName", "searchCriteria", "statementReport", "returnCriteria"})
public class TransactionCriteria5 {

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
	 * {@linkplain com.tools20022.repository.msg.TransactionCriteria5
	 * TransactionCriteria5}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionCriteria6#mmNewQueryName
	 * TransactionCriteria6.mmNewQueryName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransactionCriteria4#mmNewQueryName
	 * TransactionCriteria4.mmNewQueryName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransactionCriteria5, Optional<Max35Text>> mmNewQueryName = new MMMessageAttribute<TransactionCriteria5, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionCriteria5.mmObject();
			isDerived = false;
			xmlTag = "NewQryNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewQueryName";
			definition = "Name of the query defined by the search criteria and return criteria.";
			nextVersions_lazy = () -> Arrays.asList(TransactionCriteria6.mmNewQueryName);
			previousVersion_lazy = () -> TransactionCriteria4.mmNewQueryName;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(TransactionCriteria5 obj) {
			return obj.getNewQueryName();
		}

		@Override
		public void setValue(TransactionCriteria5 obj, Optional<Max35Text> value) {
			obj.setNewQueryName(value.orElse(null));
		}
	};
	@XmlElement(name = "SchCrit")
	protected List<TransactionSearchCriteria5> searchCriteria;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TransactionSearchCriteria5
	 * TransactionSearchCriteria5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionCriteria5
	 * TransactionCriteria5}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionCriteria6#mmSearchCriteria
	 * TransactionCriteria6.mmSearchCriteria}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransactionCriteria4#mmSearchCriteria
	 * TransactionCriteria4.mmSearchCriteria}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransactionCriteria5, List<TransactionSearchCriteria5>> mmSearchCriteria = new MMMessageAssociationEnd<TransactionCriteria5, List<TransactionSearchCriteria5>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionCriteria5.mmObject();
			isDerived = false;
			xmlTag = "SchCrit";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SearchCriteria";
			definition = "Defines the criteria on which the information is extracted.";
			nextVersions_lazy = () -> Arrays.asList(TransactionCriteria6.mmSearchCriteria);
			previousVersion_lazy = () -> TransactionCriteria4.mmSearchCriteria;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TransactionSearchCriteria5.mmObject();
		}

		@Override
		public List<TransactionSearchCriteria5> getValue(TransactionCriteria5 obj) {
			return obj.getSearchCriteria();
		}

		@Override
		public void setValue(TransactionCriteria5 obj, List<TransactionSearchCriteria5> value) {
			obj.setSearchCriteria(value);
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
	 * {@linkplain com.tools20022.repository.msg.TransactionCriteria5
	 * TransactionCriteria5}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionCriteria6#mmStatementReport
	 * TransactionCriteria6.mmStatementReport}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransactionCriteria4#mmStatementReport
	 * TransactionCriteria4.mmStatementReport}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransactionCriteria5, Optional<ReportIndicator1Code>> mmStatementReport = new MMMessageAttribute<TransactionCriteria5, Optional<ReportIndicator1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionCriteria5.mmObject();
			isDerived = false;
			xmlTag = "StmtRpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementReport";
			definition = "Indicates the format of the requested report.";
			nextVersions_lazy = () -> Arrays.asList(TransactionCriteria6.mmStatementReport);
			previousVersion_lazy = () -> TransactionCriteria4.mmStatementReport;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ReportIndicator1Code.mmObject();
		}

		@Override
		public Optional<ReportIndicator1Code> getValue(TransactionCriteria5 obj) {
			return obj.getStatementReport();
		}

		@Override
		public void setValue(TransactionCriteria5 obj, Optional<ReportIndicator1Code> value) {
			obj.setStatementReport(value.orElse(null));
		}
	};
	@XmlElement(name = "RtrCrit")
	protected TransactionReturnCriteria3 returnCriteria;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TransactionReturnCriteria3
	 * TransactionReturnCriteria3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionCriteria5
	 * TransactionCriteria5}</li>
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
	 * definition} = "Defines the expected payment transaction report."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionCriteria6#mmReturnCriteria
	 * TransactionCriteria6.mmReturnCriteria}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransactionCriteria4#mmReturnCriteria
	 * TransactionCriteria4.mmReturnCriteria}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransactionCriteria5, Optional<TransactionReturnCriteria3>> mmReturnCriteria = new MMMessageAssociationEnd<TransactionCriteria5, Optional<TransactionReturnCriteria3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionCriteria5.mmObject();
			isDerived = false;
			xmlTag = "RtrCrit";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnCriteria";
			definition = "Defines the expected payment transaction report.";
			nextVersions_lazy = () -> Arrays.asList(TransactionCriteria6.mmReturnCriteria);
			previousVersion_lazy = () -> TransactionCriteria4.mmReturnCriteria;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TransactionReturnCriteria3.mmObject();
		}

		@Override
		public Optional<TransactionReturnCriteria3> getValue(TransactionCriteria5 obj) {
			return obj.getReturnCriteria();
		}

		@Override
		public void setValue(TransactionCriteria5 obj, Optional<TransactionReturnCriteria3> value) {
			obj.setReturnCriteria(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionCriteria5.mmNewQueryName, com.tools20022.repository.msg.TransactionCriteria5.mmSearchCriteria,
						com.tools20022.repository.msg.TransactionCriteria5.mmStatementReport, com.tools20022.repository.msg.TransactionCriteria5.mmReturnCriteria);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSearchAndReturnCriteriaAndStatementReportRule.forTransactionCriteria5);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransactionCriteria5";
				definition = "Defines the criteria which are used to search for a transaction and to report on the transaction. A name may be given to the new query.";
				nextVersions_lazy = () -> Arrays.asList(TransactionCriteria6.mmObject());
				previousVersion_lazy = () -> TransactionCriteria4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getNewQueryName() {
		return newQueryName == null ? Optional.empty() : Optional.of(newQueryName);
	}

	public TransactionCriteria5 setNewQueryName(Max35Text newQueryName) {
		this.newQueryName = newQueryName;
		return this;
	}

	public List<TransactionSearchCriteria5> getSearchCriteria() {
		return searchCriteria == null ? searchCriteria = new ArrayList<>() : searchCriteria;
	}

	public TransactionCriteria5 setSearchCriteria(List<TransactionSearchCriteria5> searchCriteria) {
		this.searchCriteria = Objects.requireNonNull(searchCriteria);
		return this;
	}

	public Optional<ReportIndicator1Code> getStatementReport() {
		return statementReport == null ? Optional.empty() : Optional.of(statementReport);
	}

	public TransactionCriteria5 setStatementReport(ReportIndicator1Code statementReport) {
		this.statementReport = statementReport;
		return this;
	}

	public Optional<TransactionReturnCriteria3> getReturnCriteria() {
		return returnCriteria == null ? Optional.empty() : Optional.of(returnCriteria);
	}

	public TransactionCriteria5 setReturnCriteria(TransactionReturnCriteria3 returnCriteria) {
		this.returnCriteria = returnCriteria;
		return this;
	}
}