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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IsabelHeader2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of file provided in the payload."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "IsabelHeader2Choice", propOrder = {"payment", "report", "query", "queryResponse", "notification", "administration"})
public class IsabelHeader2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Pmt", required = true)
	protected IsabelPaymentHeader2 payment;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Payment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "File provided in the payload contains payment initiation requests."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IsabelHeader2Choice, IsabelPaymentHeader2> mmPayment = new MMMessageAssociationEnd<IsabelHeader2Choice, IsabelPaymentHeader2>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.IsabelHeader2Choice.mmObject();
			isDerived = false;
			xmlTag = "Pmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Payment";
			definition = "File provided in the payload contains payment initiation requests.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> IsabelPaymentHeader2.mmObject();
		}

		@Override
		public IsabelPaymentHeader2 getValue(IsabelHeader2Choice obj) {
			return obj.getPayment();
		}

		@Override
		public void setValue(IsabelHeader2Choice obj, IsabelPaymentHeader2 value) {
			obj.setPayment(value);
		}
	};
	@XmlElement(name = "Rpt", required = true)
	protected IsabelReportHeader3 report;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Report"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "File provided in the payload contains reporting data."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IsabelHeader2Choice, IsabelReportHeader3> mmReport = new MMMessageAssociationEnd<IsabelHeader2Choice, IsabelReportHeader3>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.IsabelHeader2Choice.mmObject();
			isDerived = false;
			xmlTag = "Rpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Report";
			definition = "File provided in the payload contains reporting data.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> IsabelReportHeader3.mmObject();
		}

		@Override
		public IsabelReportHeader3 getValue(IsabelHeader2Choice obj) {
			return obj.getReport();
		}

		@Override
		public void setValue(IsabelHeader2Choice obj, IsabelReportHeader3 value) {
			obj.setReport(value);
		}
	};
	@XmlElement(name = "Qry", required = true)
	protected IsabelQueryHeader1 query;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Query"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "File provided in the payload contains query data, as part of the RequestForReponse data flow."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IsabelHeader2Choice, IsabelQueryHeader1> mmQuery = new MMMessageAssociationEnd<IsabelHeader2Choice, IsabelQueryHeader1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.IsabelHeader2Choice.mmObject();
			isDerived = false;
			xmlTag = "Qry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Query";
			definition = "File provided in the payload contains query data, as part of the RequestForReponse data flow.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> IsabelQueryHeader1.mmObject();
		}

		@Override
		public IsabelQueryHeader1 getValue(IsabelHeader2Choice obj) {
			return obj.getQuery();
		}

		@Override
		public void setValue(IsabelHeader2Choice obj, IsabelQueryHeader1 value) {
			obj.setQuery(value);
		}
	};
	@XmlElement(name = "QryRspn", required = true)
	protected IsabelReportHeader4 queryResponse;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueryResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "File provided in the payload contains in response to an original query, as part of the RequestForReponse\r\ndata flow."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IsabelHeader2Choice, IsabelReportHeader4> mmQueryResponse = new MMMessageAssociationEnd<IsabelHeader2Choice, IsabelReportHeader4>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.IsabelHeader2Choice.mmObject();
			isDerived = false;
			xmlTag = "QryRspn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryResponse";
			definition = "File provided in the payload contains in response to an original query, as part of the RequestForReponse\r\ndata flow.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> IsabelReportHeader4.mmObject();
		}

		@Override
		public IsabelReportHeader4 getValue(IsabelHeader2Choice obj) {
			return obj.getQueryResponse();
		}

		@Override
		public void setValue(IsabelHeader2Choice obj, IsabelReportHeader4 value) {
			obj.setQueryResponse(value);
		}
	};
	@XmlElement(name = "Ntfctn", required = true)
	protected IsabelNotificationHeader2 notification;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Notification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "File provided in the payload contains ISANot instances."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IsabelHeader2Choice, IsabelNotificationHeader2> mmNotification = new MMMessageAssociationEnd<IsabelHeader2Choice, IsabelNotificationHeader2>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.IsabelHeader2Choice.mmObject();
			isDerived = false;
			xmlTag = "Ntfctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Notification";
			definition = "File provided in the payload contains ISANot instances.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> IsabelNotificationHeader2.mmObject();
		}

		@Override
		public IsabelNotificationHeader2 getValue(IsabelHeader2Choice obj) {
			return obj.getNotification();
		}

		@Override
		public void setValue(IsabelHeader2Choice obj, IsabelNotificationHeader2 value) {
			obj.setNotification(value);
		}
	};
	@XmlElement(name = "Admstn", required = true)
	protected IsabelAdminHeader2 administration;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Administration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "File provided in the payload contains administrative instances."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IsabelHeader2Choice, IsabelAdminHeader2> mmAdministration = new MMMessageAssociationEnd<IsabelHeader2Choice, IsabelAdminHeader2>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.IsabelHeader2Choice.mmObject();
			isDerived = false;
			xmlTag = "Admstn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Administration";
			definition = "File provided in the payload contains administrative instances.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> IsabelAdminHeader2.mmObject();
		}

		@Override
		public IsabelAdminHeader2 getValue(IsabelHeader2Choice obj) {
			return obj.getAdministration();
		}

		@Override
		public void setValue(IsabelHeader2Choice obj, IsabelAdminHeader2 value) {
			obj.setAdministration(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.IsabelHeader2Choice.mmPayment, com.tools20022.repository.choice.IsabelHeader2Choice.mmReport,
						com.tools20022.repository.choice.IsabelHeader2Choice.mmQuery, com.tools20022.repository.choice.IsabelHeader2Choice.mmQueryResponse, com.tools20022.repository.choice.IsabelHeader2Choice.mmNotification,
						com.tools20022.repository.choice.IsabelHeader2Choice.mmAdministration);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "IsabelHeader2Choice";
				definition = "Specifies the type of file provided in the payload.";
			}
		});
		return mmObject_lazy.get();
	}

	public IsabelPaymentHeader2 getPayment() {
		return payment;
	}

	public IsabelHeader2Choice setPayment(IsabelPaymentHeader2 payment) {
		this.payment = Objects.requireNonNull(payment);
		return this;
	}

	public IsabelReportHeader3 getReport() {
		return report;
	}

	public IsabelHeader2Choice setReport(IsabelReportHeader3 report) {
		this.report = Objects.requireNonNull(report);
		return this;
	}

	public IsabelQueryHeader1 getQuery() {
		return query;
	}

	public IsabelHeader2Choice setQuery(IsabelQueryHeader1 query) {
		this.query = Objects.requireNonNull(query);
		return this;
	}

	public IsabelReportHeader4 getQueryResponse() {
		return queryResponse;
	}

	public IsabelHeader2Choice setQueryResponse(IsabelReportHeader4 queryResponse) {
		this.queryResponse = Objects.requireNonNull(queryResponse);
		return this;
	}

	public IsabelNotificationHeader2 getNotification() {
		return notification;
	}

	public IsabelHeader2Choice setNotification(IsabelNotificationHeader2 notification) {
		this.notification = Objects.requireNonNull(notification);
		return this;
	}

	public IsabelAdminHeader2 getAdministration() {
		return administration;
	}

	public IsabelHeader2Choice setAdministration(IsabelAdminHeader2 administration) {
		this.administration = Objects.requireNonNull(administration);
		return this;
	}
}