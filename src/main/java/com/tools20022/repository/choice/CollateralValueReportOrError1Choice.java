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
import com.tools20022.repository.msg.CollateralValueReport1;
import com.tools20022.repository.msg.ErrorHandling3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Report on collateral values or error report in case of business processing of
 * the related request.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CollateralValueReportOrError1Choice#mmBusinessReport
 * CollateralValueReportOrError1Choice.mmBusinessReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CollateralValueReportOrError1Choice#mmOperationalError
 * CollateralValueReportOrError1Choice.mmOperationalError}</li>
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
 * "CollateralValueReportOrError1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Report on collateral values or error report in case of business processing of the related request."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CollateralValueReportOrError1Choice", propOrder = {"businessReport", "operationalError"})
public class CollateralValueReportOrError1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected List<CollateralValueReport1> businessReport;
	/**
	 * Provides information specific to the collateral value reports included in
	 * the message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CollateralValueReport1
	 * CollateralValueReport1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CollateralValueReportOrError1Choice
	 * CollateralValueReportOrError1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BizRpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BusinessReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information specific to the collateral value reports included in the message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBusinessReport = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CollateralValueReportOrError1Choice.mmObject();
			isDerived = false;
			xmlTag = "BizRpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BusinessReport";
			definition = "Provides information specific to the collateral value reports included in the message.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CollateralValueReport1.mmObject();
		}
	};
	protected List<ErrorHandling3> operationalError;
	/**
	 * Indicates whether an operational error has been issued during the
	 * processing of the related request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ErrorHandling3
	 * ErrorHandling3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CollateralValueReportOrError1Choice
	 * CollateralValueReportOrError1Choice}</li>
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
	 * "Indicates whether an operational error has been issued during the processing of the related request."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOperationalError = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CollateralValueReportOrError1Choice.mmObject();
			isDerived = false;
			xmlTag = "OprlErr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OperationalError";
			definition = "Indicates whether an operational error has been issued during the processing of the related request.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ErrorHandling3.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CollateralValueReportOrError1Choice.mmBusinessReport, CollateralValueReportOrError1Choice.mmOperationalError);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CollateralValueReportOrError1Choice";
				definition = "Report on collateral values or error report in case of business processing of the related request.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "BizRpt", required = true)
	public List<CollateralValueReport1> getBusinessReport() {
		return businessReport;
	}

	public void setBusinessReport(List<CollateralValueReport1> businessReport) {
		this.businessReport = businessReport;
	}

	@XmlElement(name = "OprlErr", required = true)
	public List<ErrorHandling3> getOperationalError() {
		return operationalError;
	}

	public void setOperationalError(List<ErrorHandling3> operationalError) {
		this.operationalError = operationalError;
	}
}