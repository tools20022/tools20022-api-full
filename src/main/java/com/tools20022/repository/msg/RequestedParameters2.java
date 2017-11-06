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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageComponent;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specification of the request for report.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedParameters2#mmStatementByAccount
 * RequestedParameters2.mmStatementByAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedParameters2#mmStatementByAccountAndFinancialInstrument
 * RequestedParameters2.mmStatementByAccountAndFinancialInstrument}</li>
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
 * "RequestedParameters2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specification of the request for report."</li>
 * </ul>
 */
public class RequestedParameters2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected StatementAttributes1 statementByAccount;
	/**
	 * Account and statement parameters for which the statement is requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.StatementAttributes1
	 * StatementAttributes1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestedParameters2
	 * RequestedParameters2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmtByAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementByAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account and statement parameters for which the statement is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmStatementByAccount = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> RequestedParameters2.mmObject();
			isDerived = false;
			xmlTag = "StmtByAcct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementByAccount";
			definition = "Account and statement parameters for which the statement is requested.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.StatementAttributes1.mmObject();
		}
	};
	protected GenericReportParameters statementByAccountAndFinancialInstrument;
	/**
	 * Account, financial instrument and statement parameters for which the
	 * statement is requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericReportParameters
	 * GenericReportParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestedParameters2
	 * RequestedParameters2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmtByAcctAndFinInstrm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementByAccountAndFinancialInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account, financial instrument and statement parameters for which the statement is requested."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmStatementByAccountAndFinancialInstrument = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> RequestedParameters2.mmObject();
			isDerived = false;
			xmlTag = "StmtByAcctAndFinInstrm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementByAccountAndFinancialInstrument";
			definition = "Account, financial instrument and statement parameters for which the statement is requested.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GenericReportParameters.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RequestedParameters2.mmStatementByAccount, com.tools20022.repository.msg.RequestedParameters2.mmStatementByAccountAndFinancialInstrument);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "RequestedParameters2";
				definition = "Specification of the request for report.";
			}
		});
		return mmObject_lazy.get();
	}

	public StatementAttributes1 getStatementByAccount() {
		return statementByAccount;
	}

	public void setStatementByAccount(com.tools20022.repository.msg.StatementAttributes1 statementByAccount) {
		this.statementByAccount = statementByAccount;
	}

	public GenericReportParameters getStatementByAccountAndFinancialInstrument() {
		return statementByAccountAndFinancialInstrument;
	}

	public void setStatementByAccountAndFinancialInstrument(com.tools20022.repository.msg.GenericReportParameters statementByAccountAndFinancialInstrument) {
		this.statementByAccountAndFinancialInstrument = statementByAccountAndFinancialInstrument;
	}
}