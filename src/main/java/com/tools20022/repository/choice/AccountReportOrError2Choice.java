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
import com.tools20022.repository.msg.AccountReport20;
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
 * Choice between account information or an error report.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountReportOrError2Choice#mmError
 * AccountReportOrError2Choice.mmError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountReportOrError2Choice#mmAccountReport
 * AccountReportOrError2Choice.mmAccountReport}</li>
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
 * "AccountReportOrError2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice between account information or an error report."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.AccountReportOrError1Choice
 * AccountReportOrError1Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AccountReportOrError2Choice", propOrder = {"error", "accountReport"})
public class AccountReportOrError2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Err", required = true)
	protected List<ErrorHandling4> error;
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
	 * {@linkplain com.tools20022.repository.choice.AccountReportOrError2Choice
	 * AccountReportOrError2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Err"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Error"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Error that occurred during processing."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.AccountReportOrError1Choice#mmError
	 * AccountReportOrError1Choice.mmError}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountReportOrError2Choice, List<ErrorHandling4>> mmError = new MMMessageAssociationEnd<AccountReportOrError2Choice, List<ErrorHandling4>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.AccountReportOrError2Choice.mmObject();
			isDerived = false;
			xmlTag = "Err";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Error";
			definition = "Error that occurred during processing.";
			previousVersion_lazy = () -> AccountReportOrError1Choice.mmError;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ErrorHandling4.mmObject();
		}

		@Override
		public List<ErrorHandling4> getValue(AccountReportOrError2Choice obj) {
			return obj.getError();
		}

		@Override
		public void setValue(AccountReportOrError2Choice obj, List<ErrorHandling4> value) {
			obj.setError(value);
		}
	};
	@XmlElement(name = "AcctRpt", required = true)
	protected List<AccountReport20> accountReport;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AccountReport20
	 * AccountReport20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AccountReportOrError2Choice
	 * AccountReportOrError2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctRpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Requested details of the account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.AccountReportOrError1Choice#mmAccountReport
	 * AccountReportOrError1Choice.mmAccountReport}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountReportOrError2Choice, List<AccountReport20>> mmAccountReport = new MMMessageAssociationEnd<AccountReportOrError2Choice, List<AccountReport20>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.AccountReportOrError2Choice.mmObject();
			isDerived = false;
			xmlTag = "AcctRpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountReport";
			definition = "Requested details of the account.";
			previousVersion_lazy = () -> AccountReportOrError1Choice.mmAccountReport;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AccountReport20.mmObject();
		}

		@Override
		public List<AccountReport20> getValue(AccountReportOrError2Choice obj) {
			return obj.getAccountReport();
		}

		@Override
		public void setValue(AccountReportOrError2Choice obj, List<AccountReport20> value) {
			obj.setAccountReport(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AccountReportOrError2Choice.mmError, com.tools20022.repository.choice.AccountReportOrError2Choice.mmAccountReport);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "AccountReportOrError2Choice";
				definition = "Choice between account information or an error report.";
				previousVersion_lazy = () -> AccountReportOrError1Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<ErrorHandling4> getError() {
		return error == null ? error = new ArrayList<>() : error;
	}

	public AccountReportOrError2Choice setError(List<ErrorHandling4> error) {
		this.error = Objects.requireNonNull(error);
		return this;
	}

	public List<AccountReport20> getAccountReport() {
		return accountReport == null ? accountReport = new ArrayList<>() : accountReport;
	}

	public AccountReportOrError2Choice setAccountReport(List<AccountReport20> accountReport) {
		this.accountReport = Objects.requireNonNull(accountReport);
		return this;
	}
}