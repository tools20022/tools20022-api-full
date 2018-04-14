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
import com.tools20022.repository.msg.SecuritiesAccountAuditTrailReport2;
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
 * Used to report between the securities account reference data or an
 * operational error.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuritiesAccountAuditTrailOrOperationalError2Choice#mmSecuritiesAccountAuditTrailReport
 * SecuritiesAccountAuditTrailOrOperationalError2Choice.
 * mmSecuritiesAccountAuditTrailReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuritiesAccountAuditTrailOrOperationalError2Choice#mmOperationalError
 * SecuritiesAccountAuditTrailOrOperationalError2Choice.mmOperationalError}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesAccountAuditTrailOrOperationalError2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Used to report between the securities account reference data or an operational error."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.SecuritiesAccountAuditTrailOrOperationalError1Choice
 * SecuritiesAccountAuditTrailOrOperationalError1Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesAccountAuditTrailOrOperationalError2Choice", propOrder = {"securitiesAccountAuditTrailReport", "operationalError"})
public class SecuritiesAccountAuditTrailOrOperationalError2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SctiesAcctAudtTrlRpt", required = true)
	protected List<SecuritiesAccountAuditTrailReport2> securitiesAccountAuditTrailReport;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountAuditTrailReport2
	 * SecuritiesAccountAuditTrailReport2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesAccountAuditTrailOrOperationalError2Choice
	 * SecuritiesAccountAuditTrailOrOperationalError2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesAcctAudtTrlRpt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesAccountAuditTrailReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Report information about securities account reference data."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesAccountAuditTrailOrOperationalError1Choice#mmSecuritiesAccountAuditTrailReport
	 * SecuritiesAccountAuditTrailOrOperationalError1Choice.
	 * mmSecuritiesAccountAuditTrailReport}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesAccountAuditTrailOrOperationalError2Choice, List<SecuritiesAccountAuditTrailReport2>> mmSecuritiesAccountAuditTrailReport = new MMMessageAssociationEnd<SecuritiesAccountAuditTrailOrOperationalError2Choice, List<SecuritiesAccountAuditTrailReport2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.SecuritiesAccountAuditTrailOrOperationalError2Choice.mmObject();
			isDerived = false;
			xmlTag = "SctiesAcctAudtTrlRpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesAccountAuditTrailReport";
			definition = "Report information about securities account reference data.";
			previousVersion_lazy = () -> SecuritiesAccountAuditTrailOrOperationalError1Choice.mmSecuritiesAccountAuditTrailReport;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecuritiesAccountAuditTrailReport2.mmObject();
		}

		@Override
		public List<SecuritiesAccountAuditTrailReport2> getValue(SecuritiesAccountAuditTrailOrOperationalError2Choice obj) {
			return obj.getSecuritiesAccountAuditTrailReport();
		}

		@Override
		public void setValue(SecuritiesAccountAuditTrailOrOperationalError2Choice obj, List<SecuritiesAccountAuditTrailReport2> value) {
			obj.setSecuritiesAccountAuditTrailReport(value);
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
	 * {@linkplain com.tools20022.repository.choice.SecuritiesAccountAuditTrailOrOperationalError2Choice
	 * SecuritiesAccountAuditTrailOrOperationalError2Choice}</li>
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
	 * {@linkplain com.tools20022.repository.choice.SecuritiesAccountAuditTrailOrOperationalError1Choice#mmOperationalError
	 * SecuritiesAccountAuditTrailOrOperationalError1Choice.mmOperationalError}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesAccountAuditTrailOrOperationalError2Choice, List<ErrorHandling4>> mmOperationalError = new MMMessageAssociationEnd<SecuritiesAccountAuditTrailOrOperationalError2Choice, List<ErrorHandling4>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.SecuritiesAccountAuditTrailOrOperationalError2Choice.mmObject();
			isDerived = false;
			xmlTag = "OprlErr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OperationalError";
			definition = "Operational error resulting from a rejection.";
			previousVersion_lazy = () -> SecuritiesAccountAuditTrailOrOperationalError1Choice.mmOperationalError;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ErrorHandling4.mmObject();
		}

		@Override
		public List<ErrorHandling4> getValue(SecuritiesAccountAuditTrailOrOperationalError2Choice obj) {
			return obj.getOperationalError();
		}

		@Override
		public void setValue(SecuritiesAccountAuditTrailOrOperationalError2Choice obj, List<ErrorHandling4> value) {
			obj.setOperationalError(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.SecuritiesAccountAuditTrailOrOperationalError2Choice.mmSecuritiesAccountAuditTrailReport,
						com.tools20022.repository.choice.SecuritiesAccountAuditTrailOrOperationalError2Choice.mmOperationalError);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SecuritiesAccountAuditTrailOrOperationalError2Choice";
				definition = "Used to report between the securities account reference data or an operational error.";
				previousVersion_lazy = () -> SecuritiesAccountAuditTrailOrOperationalError1Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<SecuritiesAccountAuditTrailReport2> getSecuritiesAccountAuditTrailReport() {
		return securitiesAccountAuditTrailReport == null ? securitiesAccountAuditTrailReport = new ArrayList<>() : securitiesAccountAuditTrailReport;
	}

	public SecuritiesAccountAuditTrailOrOperationalError2Choice setSecuritiesAccountAuditTrailReport(List<SecuritiesAccountAuditTrailReport2> securitiesAccountAuditTrailReport) {
		this.securitiesAccountAuditTrailReport = Objects.requireNonNull(securitiesAccountAuditTrailReport);
		return this;
	}

	public List<ErrorHandling4> getOperationalError() {
		return operationalError == null ? operationalError = new ArrayList<>() : operationalError;
	}

	public SecuritiesAccountAuditTrailOrOperationalError2Choice setOperationalError(List<ErrorHandling4> operationalError) {
		this.operationalError = Objects.requireNonNull(operationalError);
		return this;
	}
}