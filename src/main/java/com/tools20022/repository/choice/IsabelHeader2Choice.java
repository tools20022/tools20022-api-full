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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of file provided in the payload.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IsabelHeader2Choice#mmPayment
 * IsabelHeader2Choice.mmPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IsabelHeader2Choice#mmReport
 * IsabelHeader2Choice.mmReport}</li>
 * <li>{@linkplain com.tools20022.repository.choice.IsabelHeader2Choice#mmQuery
 * IsabelHeader2Choice.mmQuery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IsabelHeader2Choice#mmQueryResponse
 * IsabelHeader2Choice.mmQueryResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IsabelHeader2Choice#mmNotification
 * IsabelHeader2Choice.mmNotification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IsabelHeader2Choice#mmAdministration
 * IsabelHeader2Choice.mmAdministration}</li>
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
 * "IsabelHeader2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of file provided in the payload."</li>
 * </ul>
 */
public class IsabelHeader2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected IsabelPaymentHeader2 payment;
	/**
	 * File provided in the payload contains payment initiation requests.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.IsabelPaymentHeader2
	 * IsabelPaymentHeader2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.IsabelHeader2Choice
	 * IsabelHeader2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Payment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "File provided in the payload contains payment initiation requests."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPayment = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> IsabelHeader2Choice.mmObject();
			isDerived = false;
			xmlTag = "Pmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Payment";
			definition = "File provided in the payload contains payment initiation requests.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> IsabelPaymentHeader2.mmObject();
		}
	};
	protected IsabelReportHeader3 report;
	/**
	 * File provided in the payload contains reporting data.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.IsabelReportHeader3
	 * IsabelReportHeader3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.IsabelHeader2Choice
	 * IsabelHeader2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Report"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "File provided in the payload contains reporting data."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReport = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> IsabelHeader2Choice.mmObject();
			isDerived = false;
			xmlTag = "Rpt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Report";
			definition = "File provided in the payload contains reporting data.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> IsabelReportHeader3.mmObject();
		}
	};
	protected IsabelQueryHeader1 query;
	/**
	 * File provided in the payload contains query data, as part of the
	 * RequestForReponse data flow.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.IsabelQueryHeader1
	 * IsabelQueryHeader1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.IsabelHeader2Choice
	 * IsabelHeader2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Qry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Query"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "File provided in the payload contains query data, as part of the RequestForReponse data flow."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmQuery = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> IsabelHeader2Choice.mmObject();
			isDerived = false;
			xmlTag = "Qry";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Query";
			definition = "File provided in the payload contains query data, as part of the RequestForReponse data flow.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> IsabelQueryHeader1.mmObject();
		}
	};
	protected IsabelReportHeader4 queryResponse;
	/**
	 * File provided in the payload contains in response to an original query,
	 * as part of the RequestForReponse<br>
	 * data flow.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.IsabelReportHeader4
	 * IsabelReportHeader4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.IsabelHeader2Choice
	 * IsabelHeader2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QryRspn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueryResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "File provided in the payload contains in response to an original query, as part of the RequestForReponse\r\ndata flow."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmQueryResponse = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> IsabelHeader2Choice.mmObject();
			isDerived = false;
			xmlTag = "QryRspn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryResponse";
			definition = "File provided in the payload contains in response to an original query, as part of the RequestForReponse\r\ndata flow.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> IsabelReportHeader4.mmObject();
		}
	};
	protected IsabelNotificationHeader2 notification;
	/**
	 * File provided in the payload contains ISANot instances.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.IsabelNotificationHeader2
	 * IsabelNotificationHeader2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.IsabelHeader2Choice
	 * IsabelHeader2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ntfctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Notification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "File provided in the payload contains ISANot instances."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNotification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> IsabelHeader2Choice.mmObject();
			isDerived = false;
			xmlTag = "Ntfctn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Notification";
			definition = "File provided in the payload contains ISANot instances.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> IsabelNotificationHeader2.mmObject();
		}
	};
	protected IsabelAdminHeader2 administration;
	/**
	 * File provided in the payload contains administrative instances.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.IsabelAdminHeader2
	 * IsabelAdminHeader2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.IsabelHeader2Choice
	 * IsabelHeader2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Admstn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Administration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "File provided in the payload contains administrative instances."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAdministration = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> IsabelHeader2Choice.mmObject();
			isDerived = false;
			xmlTag = "Admstn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Administration";
			definition = "File provided in the payload contains administrative instances.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> IsabelAdminHeader2.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.IsabelHeader2Choice.mmPayment, com.tools20022.repository.choice.IsabelHeader2Choice.mmReport,
						com.tools20022.repository.choice.IsabelHeader2Choice.mmQuery, com.tools20022.repository.choice.IsabelHeader2Choice.mmQueryResponse, com.tools20022.repository.choice.IsabelHeader2Choice.mmNotification,
						com.tools20022.repository.choice.IsabelHeader2Choice.mmAdministration);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "IsabelHeader2Choice";
				definition = "Specifies the type of file provided in the payload.";
			}
		});
		return mmObject_lazy.get();
	}

	public IsabelPaymentHeader2 getPayment() {
		return payment;
	}

	public void setPayment(IsabelPaymentHeader2 payment) {
		this.payment = payment;
	}

	public IsabelReportHeader3 getReport() {
		return report;
	}

	public void setReport(IsabelReportHeader3 report) {
		this.report = report;
	}

	public IsabelQueryHeader1 getQuery() {
		return query;
	}

	public void setQuery(IsabelQueryHeader1 query) {
		this.query = query;
	}

	public IsabelReportHeader4 getQueryResponse() {
		return queryResponse;
	}

	public void setQueryResponse(IsabelReportHeader4 queryResponse) {
		this.queryResponse = queryResponse;
	}

	public IsabelNotificationHeader2 getNotification() {
		return notification;
	}

	public void setNotification(IsabelNotificationHeader2 notification) {
		this.notification = notification;
	}

	public IsabelAdminHeader2 getAdministration() {
		return administration;
	}

	public void setAdministration(IsabelAdminHeader2 administration) {
		this.administration = administration;
	}
}