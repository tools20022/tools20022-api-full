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
import com.tools20022.repository.msg.BillingCancellationReport1;
import com.tools20022.repository.msg.BillingReport1;
import com.tools20022.repository.msg.ErrorHandling3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between report on billing data, billing cancellation request details
 * or operational error.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BillingReportOrError1Choice#mmBillingReport
 * BillingReportOrError1Choice.mmBillingReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BillingReportOrError1Choice#mmCancellationReport
 * BillingReportOrError1Choice.mmCancellationReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BillingReportOrError1Choice#mmOperationalError
 * BillingReportOrError1Choice.mmOperationalError}</li>
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
 * "BillingReportOrError1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between report on billing data, billing cancellation request details or operational error."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "BillingReportOrError1Choice", propOrder = {"billingReport", "cancellationReport", "operationalError"})
public class BillingReportOrError1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected BillingReport1 billingReport;
	/**
	 * Report on billing data.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BillingReport1
	 * BillingReport1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.BillingReportOrError1Choice
	 * BillingReportOrError1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BllgRpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BillingReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Report on billing data."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBillingReport = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> BillingReportOrError1Choice.mmObject();
			isDerived = false;
			xmlTag = "BllgRpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BillingReport";
			definition = "Report on billing data.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> BillingReport1.mmObject();
		}
	};
	protected BillingCancellationReport1 cancellationReport;
	/**
	 * Report on cancelled billing data.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BillingCancellationReport1
	 * BillingCancellationReport1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.BillingReportOrError1Choice
	 * BillingReportOrError1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlRpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Report on cancelled billing data."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCancellationReport = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> BillingReportOrError1Choice.mmObject();
			isDerived = false;
			xmlTag = "CxlRpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationReport";
			definition = "Report on cancelled billing data.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> BillingCancellationReport1.mmObject();
		}
	};
	protected List<ErrorHandling3> operationalError;
	/**
	 * Indicates that an operational error has been issued during the processing
	 * of the related request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ErrorHandling3
	 * ErrorHandling3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.BillingReportOrError1Choice
	 * BillingReportOrError1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OprlErr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OperationalError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that an operational error has been issued during the processing of the related request."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOperationalError = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> BillingReportOrError1Choice.mmObject();
			isDerived = false;
			xmlTag = "OprlErr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OperationalError";
			definition = "Indicates that an operational error has been issued during the processing of the related request.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ErrorHandling3.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(BillingReportOrError1Choice.mmBillingReport, BillingReportOrError1Choice.mmCancellationReport, BillingReportOrError1Choice.mmOperationalError);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "BillingReportOrError1Choice";
				definition = "Choice between report on billing data, billing cancellation request details or operational error.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "BllgRpt", required = true)
	public BillingReport1 getBillingReport() {
		return billingReport;
	}

	public void setBillingReport(BillingReport1 billingReport) {
		this.billingReport = billingReport;
	}

	@XmlElement(name = "CxlRpt", required = true)
	public BillingCancellationReport1 getCancellationReport() {
		return cancellationReport;
	}

	public void setCancellationReport(BillingCancellationReport1 cancellationReport) {
		this.cancellationReport = cancellationReport;
	}

	@XmlElement(name = "OprlErr", required = true)
	public List<ErrorHandling3> getOperationalError() {
		return operationalError;
	}

	public void setOperationalError(List<ErrorHandling3> operationalError) {
		this.operationalError = operationalError;
	}
}