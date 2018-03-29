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
import com.tools20022.repository.area.auth.MoneyMarketForeignExchangeSwapsStatisticalReportV02;
import com.tools20022.repository.codeset.ReportPeriodActivity3Code;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ForeignExchangeSwapTransaction3;
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
 * Choice between a reason for no activity and the foreign exchange swaps
 * segment transaction details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ForeignExchangeSwap3Choice#mmDataSetAction
 * ForeignExchangeSwap3Choice.mmDataSetAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ForeignExchangeSwap3Choice#mmTransaction
 * ForeignExchangeSwap3Choice.mmTransaction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketForeignExchangeSwapsStatisticalReportV02#mmForeignExchangeSwapsReport
 * MoneyMarketForeignExchangeSwapsStatisticalReportV02.
 * mmForeignExchangeSwapsReport}</li>
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
 * "ForeignExchangeSwap3Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between a reason for no activity and the foreign exchange swaps segment transaction details."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.ForeignExchangeSwap2Choice
 * ForeignExchangeSwap2Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ForeignExchangeSwap3Choice", propOrder = {"dataSetAction", "transaction"})
public class ForeignExchangeSwap3Choice {

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
	 * {@linkplain com.tools20022.repository.choice.ForeignExchangeSwap3Choice
	 * ForeignExchangeSwap3Choice}</li>
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
	 * {@linkplain com.tools20022.repository.choice.ForeignExchangeSwap2Choice#mmDataSetAction
	 * ForeignExchangeSwap2Choice.mmDataSetAction}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ForeignExchangeSwap3Choice, ReportPeriodActivity3Code> mmDataSetAction = new MMMessageAttribute<ForeignExchangeSwap3Choice, ReportPeriodActivity3Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.ForeignExchangeSwap3Choice.mmObject();
			isDerived = false;
			xmlTag = "DataSetActn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataSetAction";
			definition = "Provides the reason why no transactions are being reported for a money market reporting period.";
			previousVersion_lazy = () -> ForeignExchangeSwap2Choice.mmDataSetAction;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ReportPeriodActivity3Code.mmObject();
		}

		@Override
		public ReportPeriodActivity3Code getValue(ForeignExchangeSwap3Choice obj) {
			return obj.getDataSetAction();
		}

		@Override
		public void setValue(ForeignExchangeSwap3Choice obj, ReportPeriodActivity3Code value) {
			obj.setDataSetAction(value);
		}
	};
	@XmlElement(name = "Tx", required = true)
	protected List<ForeignExchangeSwapTransaction3> transaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction3
	 * ForeignExchangeSwapTransaction3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ForeignExchangeSwap3Choice
	 * ForeignExchangeSwap3Choice}</li>
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
	 * "Provides the details of the foreign exchange transaction as reported by the reporting agent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.ForeignExchangeSwap2Choice#mmTransaction
	 * ForeignExchangeSwap2Choice.mmTransaction}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ForeignExchangeSwap3Choice, List<ForeignExchangeSwapTransaction3>> mmTransaction = new MMMessageAssociationEnd<ForeignExchangeSwap3Choice, List<ForeignExchangeSwapTransaction3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.ForeignExchangeSwap3Choice.mmObject();
			isDerived = false;
			xmlTag = "Tx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transaction";
			definition = "Provides the details of the foreign exchange transaction as reported by the reporting agent.";
			previousVersion_lazy = () -> ForeignExchangeSwap2Choice.mmTransaction;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ForeignExchangeSwapTransaction3.mmObject();
		}

		@Override
		public List<ForeignExchangeSwapTransaction3> getValue(ForeignExchangeSwap3Choice obj) {
			return obj.getTransaction();
		}

		@Override
		public void setValue(ForeignExchangeSwap3Choice obj, List<ForeignExchangeSwapTransaction3> value) {
			obj.setTransaction(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ForeignExchangeSwap3Choice.mmDataSetAction, com.tools20022.repository.choice.ForeignExchangeSwap3Choice.mmTransaction);
				messageBuildingBlock_lazy = () -> Arrays.asList(MoneyMarketForeignExchangeSwapsStatisticalReportV02.mmForeignExchangeSwapsReport);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ForeignExchangeSwap3Choice";
				definition = "Choice between a reason for no activity and the foreign exchange swaps segment transaction details.";
				previousVersion_lazy = () -> ForeignExchangeSwap2Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public ReportPeriodActivity3Code getDataSetAction() {
		return dataSetAction;
	}

	public ForeignExchangeSwap3Choice setDataSetAction(ReportPeriodActivity3Code dataSetAction) {
		this.dataSetAction = Objects.requireNonNull(dataSetAction);
		return this;
	}

	public List<ForeignExchangeSwapTransaction3> getTransaction() {
		return transaction == null ? transaction = new ArrayList<>() : transaction;
	}

	public ForeignExchangeSwap3Choice setTransaction(List<ForeignExchangeSwapTransaction3> transaction) {
		this.transaction = Objects.requireNonNull(transaction);
		return this;
	}
}