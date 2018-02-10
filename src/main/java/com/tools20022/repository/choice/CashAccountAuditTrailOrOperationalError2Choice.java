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
import com.tools20022.repository.msg.CashAccountAuditTrailReport2;
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
 * Used to report between the cash account reference data or an operational
 * error.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CashAccountAuditTrailOrOperationalError2Choice#mmCashAccountAuditTrailReport
 * CashAccountAuditTrailOrOperationalError2Choice.mmCashAccountAuditTrailReport}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CashAccountAuditTrailOrOperationalError2Choice#mmOperationalError
 * CashAccountAuditTrailOrOperationalError2Choice.mmOperationalError}</li>
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
 * "CashAccountAuditTrailOrOperationalError2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Used to report between the cash account reference data or an operational error."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.CashAccountAuditTrailOrOperationalError1Choice
 * CashAccountAuditTrailOrOperationalError1Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CashAccountAuditTrailOrOperationalError2Choice", propOrder = {"cashAccountAuditTrailReport", "operationalError"})
public class CashAccountAuditTrailOrOperationalError2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CshAcctAudtTrlRpt", required = true)
	protected List<CashAccountAuditTrailReport2> cashAccountAuditTrailReport;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountAuditTrailReport2
	 * CashAccountAuditTrailReport2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CashAccountAuditTrailOrOperationalError2Choice
	 * CashAccountAuditTrailOrOperationalError2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshAcctAudtTrlRpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccountAuditTrailReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Report information about cash account reference data."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.CashAccountAuditTrailOrOperationalError1Choice#mmCashAccountAuditTrailReport
	 * CashAccountAuditTrailOrOperationalError1Choice.
	 * mmCashAccountAuditTrailReport}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCashAccountAuditTrailReport = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.CashAccountAuditTrailOrOperationalError2Choice.mmObject();
			isDerived = false;
			xmlTag = "CshAcctAudtTrlRpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccountAuditTrailReport";
			definition = "Report information about cash account reference data.";
			previousVersion_lazy = () -> CashAccountAuditTrailOrOperationalError1Choice.mmCashAccountAuditTrailReport;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CashAccountAuditTrailReport2.mmObject();
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
	 * {@linkplain com.tools20022.repository.choice.CashAccountAuditTrailOrOperationalError2Choice
	 * CashAccountAuditTrailOrOperationalError2Choice}</li>
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
	 * {@linkplain com.tools20022.repository.choice.CashAccountAuditTrailOrOperationalError1Choice#mmOperationalError
	 * CashAccountAuditTrailOrOperationalError1Choice.mmOperationalError}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOperationalError = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.CashAccountAuditTrailOrOperationalError2Choice.mmObject();
			isDerived = false;
			xmlTag = "OprlErr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OperationalError";
			definition = "Operational error resulting from a rejection.";
			previousVersion_lazy = () -> CashAccountAuditTrailOrOperationalError1Choice.mmOperationalError;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ErrorHandling4.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CashAccountAuditTrailOrOperationalError2Choice.mmCashAccountAuditTrailReport,
						com.tools20022.repository.choice.CashAccountAuditTrailOrOperationalError2Choice.mmOperationalError);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CashAccountAuditTrailOrOperationalError2Choice";
				definition = "Used to report between the cash account reference data or an operational error.";
				previousVersion_lazy = () -> CashAccountAuditTrailOrOperationalError1Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<CashAccountAuditTrailReport2> getCashAccountAuditTrailReport() {
		return cashAccountAuditTrailReport == null ? cashAccountAuditTrailReport = new ArrayList<>() : cashAccountAuditTrailReport;
	}

	public CashAccountAuditTrailOrOperationalError2Choice setCashAccountAuditTrailReport(List<CashAccountAuditTrailReport2> cashAccountAuditTrailReport) {
		this.cashAccountAuditTrailReport = Objects.requireNonNull(cashAccountAuditTrailReport);
		return this;
	}

	public List<ErrorHandling4> getOperationalError() {
		return operationalError == null ? operationalError = new ArrayList<>() : operationalError;
	}

	public CashAccountAuditTrailOrOperationalError2Choice setOperationalError(List<ErrorHandling4> operationalError) {
		this.operationalError = Objects.requireNonNull(operationalError);
		return this;
	}
}