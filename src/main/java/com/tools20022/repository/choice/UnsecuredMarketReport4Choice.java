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
import com.tools20022.repository.area.auth.MoneyMarketUnsecuredMarketStatisticalReportV02;
import com.tools20022.repository.codeset.ReportPeriodActivity3Code;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.UnsecuredMarketTransaction4;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Choice between a reason for no activity and the unsecured market segment
 * transaction details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnsecuredMarketReport4Choice#mmDataSetAction
 * UnsecuredMarketReport4Choice.mmDataSetAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnsecuredMarketReport4Choice#mmTransaction
 * UnsecuredMarketReport4Choice.mmTransaction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketUnsecuredMarketStatisticalReportV02#mmUnsecuredMarketReport
 * MoneyMarketUnsecuredMarketStatisticalReportV02.mmUnsecuredMarketReport}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UnsecuredMarketReport4Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between a reason for no activity and the unsecured market segment transaction details."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.UnsecuredMarketReport3Choice
 * UnsecuredMarketReport3Choice}</li>
 * </ul>
 */
public class UnsecuredMarketReport4Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected ReportPeriodActivity3Code dataSetAction;
	/**
	 * Provides the reason why no transactions are being reported for a money
	 * market reporting period.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.choice.UnsecuredMarketReport4Choice
	 * UnsecuredMarketReport4Choice}</li>
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
	 * {@linkplain com.tools20022.repository.choice.UnsecuredMarketReport3Choice#mmDataSetAction
	 * UnsecuredMarketReport3Choice.mmDataSetAction}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDataSetAction = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> UnsecuredMarketReport4Choice.mmObject();
			isDerived = false;
			xmlTag = "DataSetActn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataSetAction";
			definition = "Provides the reason why no transactions are being reported for a money market reporting period.";
			previousVersion_lazy = () -> UnsecuredMarketReport3Choice.mmDataSetAction;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ReportPeriodActivity3Code.mmObject();
		}
	};
	protected List<UnsecuredMarketTransaction4> transaction;
	/**
	 * Provides the details of the unsecured market transaction as reported by
	 * the reporting agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4
	 * UnsecuredMarketTransaction4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.UnsecuredMarketReport4Choice
	 * UnsecuredMarketReport4Choice}</li>
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
	 * "Provides the details of the unsecured market transaction as reported by the reporting agent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.UnsecuredMarketReport3Choice#mmTransaction
	 * UnsecuredMarketReport3Choice.mmTransaction}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransaction = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> UnsecuredMarketReport4Choice.mmObject();
			isDerived = false;
			xmlTag = "Tx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transaction";
			definition = "Provides the details of the unsecured market transaction as reported by the reporting agent.";
			previousVersion_lazy = () -> UnsecuredMarketReport3Choice.mmTransaction;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> UnsecuredMarketTransaction4.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(UnsecuredMarketReport4Choice.mmDataSetAction, UnsecuredMarketReport4Choice.mmTransaction);
				messageBuildingBlock_lazy = () -> Arrays.asList(MoneyMarketUnsecuredMarketStatisticalReportV02.mmUnsecuredMarketReport);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UnsecuredMarketReport4Choice";
				definition = "Choice between a reason for no activity and the unsecured market segment transaction details.";
				previousVersion_lazy = () -> UnsecuredMarketReport3Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public ReportPeriodActivity3Code getDataSetAction() {
		return dataSetAction;
	}

	public void setDataSetAction(ReportPeriodActivity3Code dataSetAction) {
		this.dataSetAction = dataSetAction;
	}

	public List<UnsecuredMarketTransaction4> getTransaction() {
		return transaction;
	}

	public void setTransaction(List<UnsecuredMarketTransaction4> transaction) {
		this.transaction = transaction;
	}
}