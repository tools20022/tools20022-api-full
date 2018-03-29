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
import com.tools20022.repository.msg.BillingReport2;
import com.tools20022.repository.msg.ErrorHandling4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
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
 * {@linkplain com.tools20022.repository.choice.BillingReportOrError2Choice#mmBillingReport
 * BillingReportOrError2Choice.mmBillingReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BillingReportOrError2Choice#mmCancellationReport
 * BillingReportOrError2Choice.mmCancellationReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BillingReportOrError2Choice#mmOperationalError
 * BillingReportOrError2Choice.mmOperationalError}</li>
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
 * "BillingReportOrError2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between report on billing data, billing cancellation request details or operational error."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.BillingReportOrError1Choice
 * BillingReportOrError1Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "BillingReportOrError2Choice", propOrder = {"billingReport", "cancellationReport", "operationalError"})
public class BillingReportOrError2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "BllgRpt", required = true)
	protected BillingReport2 billingReport;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BillingReport2
	 * BillingReport2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.BillingReportOrError2Choice
	 * BillingReportOrError2Choice}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.BillingReportOrError1Choice#mmBillingReport
	 * BillingReportOrError1Choice.mmBillingReport}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BillingReportOrError2Choice, BillingReport2> mmBillingReport = new MMMessageAssociationEnd<BillingReportOrError2Choice, BillingReport2>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.BillingReportOrError2Choice.mmObject();
			isDerived = false;
			xmlTag = "BllgRpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BillingReport";
			definition = "Report on billing data.";
			previousVersion_lazy = () -> BillingReportOrError1Choice.mmBillingReport;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> BillingReport2.mmObject();
		}

		@Override
		public BillingReport2 getValue(BillingReportOrError2Choice obj) {
			return obj.getBillingReport();
		}

		@Override
		public void setValue(BillingReportOrError2Choice obj, BillingReport2 value) {
			obj.setBillingReport(value);
		}
	};
	@XmlElement(name = "CxlRpt", required = true)
	protected BillingCancellationReport1 cancellationReport;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BillingCancellationReport1
	 * BillingCancellationReport1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.BillingReportOrError2Choice
	 * BillingReportOrError2Choice}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.BillingReportOrError1Choice#mmCancellationReport
	 * BillingReportOrError1Choice.mmCancellationReport}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BillingReportOrError2Choice, BillingCancellationReport1> mmCancellationReport = new MMMessageAssociationEnd<BillingReportOrError2Choice, BillingCancellationReport1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.BillingReportOrError2Choice.mmObject();
			isDerived = false;
			xmlTag = "CxlRpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationReport";
			definition = "Report on cancelled billing data.";
			previousVersion_lazy = () -> BillingReportOrError1Choice.mmCancellationReport;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> BillingCancellationReport1.mmObject();
		}

		@Override
		public BillingCancellationReport1 getValue(BillingReportOrError2Choice obj) {
			return obj.getCancellationReport();
		}

		@Override
		public void setValue(BillingReportOrError2Choice obj, BillingCancellationReport1 value) {
			obj.setCancellationReport(value);
		}
	};
	@XmlElement(name = "OprlErr", required = true)
	protected List<ErrorHandling4> operationalError;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ErrorHandling4
	 * ErrorHandling4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.BillingReportOrError2Choice
	 * BillingReportOrError2Choice}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.BillingReportOrError1Choice#mmOperationalError
	 * BillingReportOrError1Choice.mmOperationalError}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BillingReportOrError2Choice, List<ErrorHandling4>> mmOperationalError = new MMMessageAssociationEnd<BillingReportOrError2Choice, List<ErrorHandling4>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.BillingReportOrError2Choice.mmObject();
			isDerived = false;
			xmlTag = "OprlErr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OperationalError";
			definition = "Indicates that an operational error has been issued during the processing of the related request.";
			previousVersion_lazy = () -> BillingReportOrError1Choice.mmOperationalError;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ErrorHandling4.mmObject();
		}

		@Override
		public List<ErrorHandling4> getValue(BillingReportOrError2Choice obj) {
			return obj.getOperationalError();
		}

		@Override
		public void setValue(BillingReportOrError2Choice obj, List<ErrorHandling4> value) {
			obj.setOperationalError(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.BillingReportOrError2Choice.mmBillingReport, com.tools20022.repository.choice.BillingReportOrError2Choice.mmCancellationReport,
						com.tools20022.repository.choice.BillingReportOrError2Choice.mmOperationalError);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "BillingReportOrError2Choice";
				definition = "Choice between report on billing data, billing cancellation request details or operational error.";
				previousVersion_lazy = () -> BillingReportOrError1Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public BillingReport2 getBillingReport() {
		return billingReport;
	}

	public BillingReportOrError2Choice setBillingReport(BillingReport2 billingReport) {
		this.billingReport = Objects.requireNonNull(billingReport);
		return this;
	}

	public BillingCancellationReport1 getCancellationReport() {
		return cancellationReport;
	}

	public BillingReportOrError2Choice setCancellationReport(BillingCancellationReport1 cancellationReport) {
		this.cancellationReport = Objects.requireNonNull(cancellationReport);
		return this;
	}

	public List<ErrorHandling4> getOperationalError() {
		return operationalError == null ? operationalError = new ArrayList<>() : operationalError;
	}

	public BillingReportOrError2Choice setOperationalError(List<ErrorHandling4> operationalError) {
		this.operationalError = Objects.requireNonNull(operationalError);
		return this;
	}
}