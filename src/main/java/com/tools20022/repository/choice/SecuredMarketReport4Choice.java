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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.auth.MoneyMarketSecuredMarketStatisticalReportV02;
import com.tools20022.repository.codeset.ReportPeriodActivity3Code;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.SecuredMarketTransaction4;
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
 * Choice between a reason for no activity and the secured market segment
 * transaction details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuredMarketReport4Choice#mmDataSetAction
 * SecuredMarketReport4Choice.mmDataSetAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuredMarketReport4Choice#mmTransaction
 * SecuredMarketReport4Choice.mmTransaction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketSecuredMarketStatisticalReportV02#mmSecuredMarketReport
 * MoneyMarketSecuredMarketStatisticalReportV02.mmSecuredMarketReport}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuredMarketReport4Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between a reason for no activity and the secured market segment transaction details."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.SecuredMarketReport3Choice
 * SecuredMarketReport3Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuredMarketReport4Choice", propOrder = {"dataSetAction", "transaction"})
public class SecuredMarketReport4Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DataSetActn", required = true)
	protected ReportPeriodActivity3Code dataSetAction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ReportPeriodActivity3Code
	 * ReportPeriodActivity3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecuredMarketReport4Choice
	 * SecuredMarketReport4Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DataSetActn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataSetAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the reason why no transactions are being reported for a money market reporting period."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.SecuredMarketReport3Choice#mmDataSetAction
	 * SecuredMarketReport3Choice.mmDataSetAction}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDataSetAction = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.SecuredMarketReport4Choice.mmObject();
			isDerived = false;
			xmlTag = "DataSetActn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataSetAction";
			definition = "Provides the reason why no transactions are being reported for a money market reporting period.";
			previousVersion_lazy = () -> SecuredMarketReport3Choice.mmDataSetAction;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ReportPeriodActivity3Code.mmObject();
		}
	};
	@XmlElement(name = "Tx", required = true)
	protected List<SecuredMarketTransaction4> transaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4
	 * SecuredMarketTransaction4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecuredMarketReport4Choice
	 * SecuredMarketReport4Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Transaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the details of the secured market transaction as reported by the reporting agent"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.SecuredMarketReport3Choice#mmTransaction
	 * SecuredMarketReport3Choice.mmTransaction}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransaction = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.SecuredMarketReport4Choice.mmObject();
			isDerived = false;
			xmlTag = "Tx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transaction";
			definition = "Provides the details of the secured market transaction as reported by the reporting agent";
			previousVersion_lazy = () -> SecuredMarketReport3Choice.mmTransaction;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecuredMarketTransaction4.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.SecuredMarketReport4Choice.mmDataSetAction, com.tools20022.repository.choice.SecuredMarketReport4Choice.mmTransaction);
				messageBuildingBlock_lazy = () -> Arrays.asList(MoneyMarketSecuredMarketStatisticalReportV02.mmSecuredMarketReport);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuredMarketReport4Choice";
				definition = "Choice between a reason for no activity and the secured market segment transaction details.";
				previousVersion_lazy = () -> SecuredMarketReport3Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public ReportPeriodActivity3Code getDataSetAction() {
		return dataSetAction;
	}

	public SecuredMarketReport4Choice setDataSetAction(ReportPeriodActivity3Code dataSetAction) {
		this.dataSetAction = Objects.requireNonNull(dataSetAction);
		return this;
	}

	public List<SecuredMarketTransaction4> getTransaction() {
		return transaction == null ? transaction = new ArrayList<>() : transaction;
	}

	public SecuredMarketReport4Choice setTransaction(List<SecuredMarketTransaction4> transaction) {
		this.transaction = Objects.requireNonNull(transaction);
		return this;
	}
}