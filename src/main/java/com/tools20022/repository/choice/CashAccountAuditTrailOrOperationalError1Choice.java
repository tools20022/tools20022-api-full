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
import com.tools20022.repository.msg.CashAccountAuditTrailReport1;
import com.tools20022.repository.msg.ErrorHandling3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.choice.CashAccountAuditTrailOrOperationalError1Choice#CashAccountAuditTrailReport
 * CashAccountAuditTrailOrOperationalError1Choice.CashAccountAuditTrailReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CashAccountAuditTrailOrOperationalError1Choice#OperationalError
 * CashAccountAuditTrailOrOperationalError1Choice.OperationalError}</li>
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
 * "CashAccountAuditTrailOrOperationalError1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Used to report between the cash account reference data or an operational error."
 * </li>
 * </ul>
 */
public class CashAccountAuditTrailOrOperationalError1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Report information about cash account reference data.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountAuditTrailReport1
	 * CashAccountAuditTrailReport1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CashAccountAuditTrailOrOperationalError1Choice
	 * CashAccountAuditTrailOrOperationalError1Choice}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd CashAccountAuditTrailReport = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CashAccountAuditTrailOrOperationalError1Choice.mmObject();
			isDerived = false;
			xmlTag = "CshAcctAudtTrlRpt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccountAuditTrailReport";
			definition = "Report information about cash account reference data.";
			minOccurs = 1;
			type_lazy = () -> CashAccountAuditTrailReport1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Operational error resulting from a rejection.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ErrorHandling3
	 * ErrorHandling3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CashAccountAuditTrailOrOperationalError1Choice
	 * CashAccountAuditTrailOrOperationalError1Choice}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd OperationalError = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CashAccountAuditTrailOrOperationalError1Choice.mmObject();
			isDerived = false;
			xmlTag = "OprlErr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OperationalError";
			definition = "Operational error resulting from a rejection.";
			minOccurs = 1;
			type_lazy = () -> ErrorHandling3.mmObject();
			isComposite = true;
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CashAccountAuditTrailOrOperationalError1Choice.CashAccountAuditTrailReport,
						com.tools20022.repository.choice.CashAccountAuditTrailOrOperationalError1Choice.OperationalError);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CashAccountAuditTrailOrOperationalError1Choice";
				definition = "Used to report between the cash account reference data or an operational error.";
			}
		});
		return mmObject_lazy.get();
	}
}