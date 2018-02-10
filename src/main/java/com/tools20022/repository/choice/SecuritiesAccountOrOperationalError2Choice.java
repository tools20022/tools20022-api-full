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
import com.tools20022.repository.msg.SecuritiesAccountReport2;
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
 * Set of elements used to report between the securities account reference data
 * or an operational error.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuritiesAccountOrOperationalError2Choice#mmSecuritiesAccountReport
 * SecuritiesAccountOrOperationalError2Choice.mmSecuritiesAccountReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuritiesAccountOrOperationalError2Choice#mmOperationalError
 * SecuritiesAccountOrOperationalError2Choice.mmOperationalError}</li>
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
 * "SecuritiesAccountOrOperationalError2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of elements used to report between the securities account reference data or an operational error."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.SecuritiesAccountOrOperationalError1Choice
 * SecuritiesAccountOrOperationalError1Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesAccountOrOperationalError2Choice", propOrder = {"securitiesAccountReport", "operationalError"})
public class SecuritiesAccountOrOperationalError2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SctiesAcctRpt", required = true)
	protected List<SecuritiesAccountReport2> securitiesAccountReport;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountReport2
	 * SecuritiesAccountReport2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesAccountOrOperationalError2Choice
	 * SecuritiesAccountOrOperationalError2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesAcctRpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesAccountReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Report information about securities account reference data."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesAccountOrOperationalError1Choice#mmSecuritiesAccountReport
	 * SecuritiesAccountOrOperationalError1Choice.mmSecuritiesAccountReport}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSecuritiesAccountReport = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.SecuritiesAccountOrOperationalError2Choice.mmObject();
			isDerived = false;
			xmlTag = "SctiesAcctRpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesAccountReport";
			definition = "Report information about securities account reference data.";
			previousVersion_lazy = () -> SecuritiesAccountOrOperationalError1Choice.mmSecuritiesAccountReport;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecuritiesAccountReport2.mmObject();
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
	 * {@linkplain com.tools20022.repository.choice.SecuritiesAccountOrOperationalError2Choice
	 * SecuritiesAccountOrOperationalError2Choice}</li>
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
	 * definition} = "Operational error resulting from a rejection."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesAccountOrOperationalError1Choice#mmOperationalError
	 * SecuritiesAccountOrOperationalError1Choice.mmOperationalError}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOperationalError = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.SecuritiesAccountOrOperationalError2Choice.mmObject();
			isDerived = false;
			xmlTag = "OprlErr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OperationalError";
			definition = "Operational error resulting from a rejection.";
			previousVersion_lazy = () -> SecuritiesAccountOrOperationalError1Choice.mmOperationalError;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ErrorHandling4.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.SecuritiesAccountOrOperationalError2Choice.mmSecuritiesAccountReport,
						com.tools20022.repository.choice.SecuritiesAccountOrOperationalError2Choice.mmOperationalError);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SecuritiesAccountOrOperationalError2Choice";
				definition = "Set of elements used to report between the securities account reference data or an operational error.";
				previousVersion_lazy = () -> SecuritiesAccountOrOperationalError1Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<SecuritiesAccountReport2> getSecuritiesAccountReport() {
		return securitiesAccountReport == null ? securitiesAccountReport = new ArrayList<>() : securitiesAccountReport;
	}

	public SecuritiesAccountOrOperationalError2Choice setSecuritiesAccountReport(List<SecuritiesAccountReport2> securitiesAccountReport) {
		this.securitiesAccountReport = Objects.requireNonNull(securitiesAccountReport);
		return this;
	}

	public List<ErrorHandling4> getOperationalError() {
		return operationalError == null ? operationalError = new ArrayList<>() : operationalError;
	}

	public SecuritiesAccountOrOperationalError2Choice setOperationalError(List<ErrorHandling4> operationalError) {
		this.operationalError = Objects.requireNonNull(operationalError);
		return this;
	}
}