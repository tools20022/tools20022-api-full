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
import com.tools20022.repository.choice.TransactionCriteriaDefinition3Choice;
import com.tools20022.repository.codeset.QueryType2Code;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines the query criteria.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionQueryDefinition4#mmQueryType
 * TransactionQueryDefinition4.mmQueryType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionQueryDefinition4#mmTransactionCriteria
 * TransactionQueryDefinition4.mmTransactionCriteria}</li>
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
 * "TransactionQueryDefinition4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the query criteria."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "TransactionQueryDefinition4", propOrder = {"queryType", "transactionCriteria"})
public class TransactionQueryDefinition4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected QueryType2Code queryType;
	/**
	 * Specifies the type of matching items to be returned in the response to
	 * the query.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.QueryType2Code
	 * QueryType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionQueryDefinition4
	 * TransactionQueryDefinition4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QryTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueryType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of matching items to be returned in the response to the query."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmQueryType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TransactionQueryDefinition4.mmObject();
			isDerived = false;
			xmlTag = "QryTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryType";
			definition = "Specifies the type of matching items to be returned in the response to the query.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> QueryType2Code.mmObject();
		}
	};
	protected TransactionCriteriaDefinition3Choice transactionCriteria;
	/**
	 * Defines the transaction query criteria.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.TransactionCriteriaDefinition3Choice
	 * TransactionCriteriaDefinition3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionQueryDefinition4
	 * TransactionQueryDefinition4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxCrit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionCriteria"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines the transaction query criteria."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransactionCriteria = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> TransactionQueryDefinition4.mmObject();
			isDerived = false;
			xmlTag = "TxCrit";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionCriteria";
			definition = "Defines the transaction query criteria.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TransactionCriteriaDefinition3Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(TransactionQueryDefinition4.mmQueryType, TransactionQueryDefinition4.mmTransactionCriteria);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "TransactionQueryDefinition4";
				definition = "Defines the query criteria.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "QryTp")
	public QueryType2Code getQueryType() {
		return queryType;
	}

	public void setQueryType(QueryType2Code queryType) {
		this.queryType = queryType;
	}

	@XmlElement(name = "TxCrit")
	public TransactionCriteriaDefinition3Choice getTransactionCriteria() {
		return transactionCriteria;
	}

	public void setTransactionCriteria(TransactionCriteriaDefinition3Choice transactionCriteria) {
		this.transactionCriteria = transactionCriteria;
	}
}