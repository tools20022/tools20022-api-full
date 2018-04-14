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
import com.tools20022.repository.msg.ErrorHandling4;
import com.tools20022.repository.msg.SecuritiesAuditTrailReport2;
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
 * Used to report between the securities reference data or an operational error.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuritiesAuditTrailOrOperationalError2Choice#mmSecuritiesAuditTrailReport
 * SecuritiesAuditTrailOrOperationalError2Choice.mmSecuritiesAuditTrailReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuritiesAuditTrailOrOperationalError2Choice#mmOperationalError
 * SecuritiesAuditTrailOrOperationalError2Choice.mmOperationalError}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesAuditTrailOrOperationalError2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Used to report between the securities reference data or an operational error."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.SecuritiesAuditTrailOrOperationalError1Choice
 * SecuritiesAuditTrailOrOperationalError1Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesAuditTrailOrOperationalError2Choice", propOrder = {"securitiesAuditTrailReport", "operationalError"})
public class SecuritiesAuditTrailOrOperationalError2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SctiesAudtTrlRpt", required = true)
	protected List<SecuritiesAuditTrailReport2> securitiesAuditTrailReport;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAuditTrailReport2
	 * SecuritiesAuditTrailReport2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesAuditTrailOrOperationalError2Choice
	 * SecuritiesAuditTrailOrOperationalError2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesAudtTrlRpt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesAuditTrailReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Report information about securities reference data."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesAuditTrailOrOperationalError1Choice#mmSecuritiesAuditTrailReport
	 * SecuritiesAuditTrailOrOperationalError1Choice.
	 * mmSecuritiesAuditTrailReport}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesAuditTrailOrOperationalError2Choice, List<SecuritiesAuditTrailReport2>> mmSecuritiesAuditTrailReport = new MMMessageAssociationEnd<SecuritiesAuditTrailOrOperationalError2Choice, List<SecuritiesAuditTrailReport2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.SecuritiesAuditTrailOrOperationalError2Choice.mmObject();
			isDerived = false;
			xmlTag = "SctiesAudtTrlRpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesAuditTrailReport";
			definition = "Report information about securities reference data.";
			previousVersion_lazy = () -> SecuritiesAuditTrailOrOperationalError1Choice.mmSecuritiesAuditTrailReport;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecuritiesAuditTrailReport2.mmObject();
		}

		@Override
		public List<SecuritiesAuditTrailReport2> getValue(SecuritiesAuditTrailOrOperationalError2Choice obj) {
			return obj.getSecuritiesAuditTrailReport();
		}

		@Override
		public void setValue(SecuritiesAuditTrailOrOperationalError2Choice obj, List<SecuritiesAuditTrailReport2> value) {
			obj.setSecuritiesAuditTrailReport(value);
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
	 * {@linkplain com.tools20022.repository.choice.SecuritiesAuditTrailOrOperationalError2Choice
	 * SecuritiesAuditTrailOrOperationalError2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OprlErr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OperationalError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Operational error resulting from a rejection."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesAuditTrailOrOperationalError1Choice#mmOperationalError
	 * SecuritiesAuditTrailOrOperationalError1Choice.mmOperationalError}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesAuditTrailOrOperationalError2Choice, List<ErrorHandling4>> mmOperationalError = new MMMessageAssociationEnd<SecuritiesAuditTrailOrOperationalError2Choice, List<ErrorHandling4>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.SecuritiesAuditTrailOrOperationalError2Choice.mmObject();
			isDerived = false;
			xmlTag = "OprlErr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OperationalError";
			definition = "Operational error resulting from a rejection.";
			previousVersion_lazy = () -> SecuritiesAuditTrailOrOperationalError1Choice.mmOperationalError;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ErrorHandling4.mmObject();
		}

		@Override
		public List<ErrorHandling4> getValue(SecuritiesAuditTrailOrOperationalError2Choice obj) {
			return obj.getOperationalError();
		}

		@Override
		public void setValue(SecuritiesAuditTrailOrOperationalError2Choice obj, List<ErrorHandling4> value) {
			obj.setOperationalError(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.SecuritiesAuditTrailOrOperationalError2Choice.mmSecuritiesAuditTrailReport,
						com.tools20022.repository.choice.SecuritiesAuditTrailOrOperationalError2Choice.mmOperationalError);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SecuritiesAuditTrailOrOperationalError2Choice";
				definition = "Used to report between the securities reference data or an operational error.";
				previousVersion_lazy = () -> SecuritiesAuditTrailOrOperationalError1Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<SecuritiesAuditTrailReport2> getSecuritiesAuditTrailReport() {
		return securitiesAuditTrailReport == null ? securitiesAuditTrailReport = new ArrayList<>() : securitiesAuditTrailReport;
	}

	public SecuritiesAuditTrailOrOperationalError2Choice setSecuritiesAuditTrailReport(List<SecuritiesAuditTrailReport2> securitiesAuditTrailReport) {
		this.securitiesAuditTrailReport = Objects.requireNonNull(securitiesAuditTrailReport);
		return this;
	}

	public List<ErrorHandling4> getOperationalError() {
		return operationalError == null ? operationalError = new ArrayList<>() : operationalError;
	}

	public SecuritiesAuditTrailOrOperationalError2Choice setOperationalError(List<ErrorHandling4> operationalError) {
		this.operationalError = Objects.requireNonNull(operationalError);
		return this;
	}
}