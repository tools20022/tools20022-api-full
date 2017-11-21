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
import com.tools20022.repository.area.semt.SecuritiesBalanceTransparencyReportStatusAdviceV01;
import com.tools20022.repository.choice.DateAndDateTimeChoice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identifies the reference of the statment by a unique identifier and the date
 * (and time).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementReference1#mmStatementIdentification
 * StatementReference1.mmStatementIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementReference1#mmStatementDateTime
 * StatementReference1.mmStatementDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementReference1#mmPagination
 * StatementReference1.mmPagination}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceTransparencyReportStatusAdviceV01#mmRelatedStatement
 * SecuritiesBalanceTransparencyReportStatusAdviceV01.mmRelatedStatement}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "StatementReference1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies the reference of the statment  by a unique identifier and the date (and time)."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "StatementReference1", propOrder = {"statementIdentification", "statementDateTime", "pagination"})
public class StatementReference1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text statementIdentification;
	/**
	 * Reference common to all pages of the statement for which the status
	 * advice is sent.
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
	 * {@linkplain com.tools20022.repository.msg.StatementReference1
	 * StatementReference1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmtId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference common to all pages of the statement for which the status advice is sent."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatementIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> StatementReference1.mmObject();
			isDerived = false;
			xmlTag = "StmtId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementIdentification";
			definition = "Reference common to all pages of the statement for which the status advice is sent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected DateAndDateTimeChoice statementDateTime;
	/**
	 * Date and time the statement was created.
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
	 * {@linkplain com.tools20022.repository.msg.StatementReference1
	 * StatementReference1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmtDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time the statement was created."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatementDateTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> StatementReference1.mmObject();
			isDerived = false;
			xmlTag = "StmtDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementDateTime";
			definition = "Date and time the statement was created.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	protected Pagination pagination;
	/**
	 * Page number of the related message (within the statement) and
	 * continuation indicator to indicate that the statement is to continue or
	 * that the related message is the last page of the statement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Pagination Pagination}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatementReference1
	 * StatementReference1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pgntn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pagination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Page number of the related message (within the statement) and continuation indicator to indicate that the statement is to continue or that the related message is the last page of the statement."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPagination = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> StatementReference1.mmObject();
			isDerived = false;
			xmlTag = "Pgntn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pagination";
			definition = "Page number of the related message (within the statement) and continuation indicator to indicate that the statement is to continue or that the related message is the last page of the statement.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Pagination.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(StatementReference1.mmStatementIdentification, StatementReference1.mmStatementDateTime, StatementReference1.mmPagination);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesBalanceTransparencyReportStatusAdviceV01.mmRelatedStatement);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StatementReference1";
				definition = "Identifies the reference of the statment  by a unique identifier and the date (and time).";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "StmtId", required = true)
	public Max35Text getStatementIdentification() {
		return statementIdentification;
	}

	public void setStatementIdentification(Max35Text statementIdentification) {
		this.statementIdentification = statementIdentification;
	}

	@XmlElement(name = "StmtDtTm", required = true)
	public DateAndDateTimeChoice getStatementDateTime() {
		return statementDateTime;
	}

	public void setStatementDateTime(DateAndDateTimeChoice statementDateTime) {
		this.statementDateTime = statementDateTime;
	}

	@XmlElement(name = "Pgntn")
	public Pagination getPagination() {
		return pagination;
	}

	public void setPagination(com.tools20022.repository.msg.Pagination pagination) {
		this.pagination = pagination;
	}
}