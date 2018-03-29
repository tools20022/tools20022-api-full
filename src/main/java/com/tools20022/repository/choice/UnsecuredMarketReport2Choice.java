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
import com.tools20022.repository.codeset.ReportPeriodActivity1Code;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.UnsecuredMarketTransaction2;
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
 * {@linkplain com.tools20022.repository.choice.UnsecuredMarketReport2Choice#mmDataSetAction
 * UnsecuredMarketReport2Choice.mmDataSetAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnsecuredMarketReport2Choice#mmTransaction
 * UnsecuredMarketReport2Choice.mmTransaction}</li>
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
 * "UnsecuredMarketReport2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between a reason for no activity and the unsecured market segment transaction details."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnsecuredMarketReport3Choice
 * UnsecuredMarketReport3Choice}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.UnsecuredMarketReport1Choice
 * UnsecuredMarketReport1Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "UnsecuredMarketReport2Choice", propOrder = {"dataSetAction", "transaction"})
public class UnsecuredMarketReport2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DataSetActn", required = true)
	protected ReportPeriodActivity1Code dataSetAction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ReportPeriodActivity1Code
	 * ReportPeriodActivity1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.UnsecuredMarketReport2Choice
	 * UnsecuredMarketReport2Choice}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnsecuredMarketReport3Choice#mmDataSetAction
	 * UnsecuredMarketReport3Choice.mmDataSetAction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.UnsecuredMarketReport1Choice#mmDataSetAction
	 * UnsecuredMarketReport1Choice.mmDataSetAction}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UnsecuredMarketReport2Choice, ReportPeriodActivity1Code> mmDataSetAction = new MMMessageAttribute<UnsecuredMarketReport2Choice, ReportPeriodActivity1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.UnsecuredMarketReport2Choice.mmObject();
			isDerived = false;
			xmlTag = "DataSetActn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataSetAction";
			definition = "Provides the reason why no transactions are being reported for a money market reporting period.";
			nextVersions_lazy = () -> Arrays.asList(UnsecuredMarketReport3Choice.mmDataSetAction);
			previousVersion_lazy = () -> UnsecuredMarketReport1Choice.mmDataSetAction;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ReportPeriodActivity1Code.mmObject();
		}

		@Override
		public ReportPeriodActivity1Code getValue(UnsecuredMarketReport2Choice obj) {
			return obj.getDataSetAction();
		}

		@Override
		public void setValue(UnsecuredMarketReport2Choice obj, ReportPeriodActivity1Code value) {
			obj.setDataSetAction(value);
		}
	};
	@XmlElement(name = "Tx", required = true)
	protected List<UnsecuredMarketTransaction2> transaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction2
	 * UnsecuredMarketTransaction2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.UnsecuredMarketReport2Choice
	 * UnsecuredMarketReport2Choice}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnsecuredMarketReport3Choice#mmTransaction
	 * UnsecuredMarketReport3Choice.mmTransaction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.UnsecuredMarketReport1Choice#mmTransaction
	 * UnsecuredMarketReport1Choice.mmTransaction}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<UnsecuredMarketReport2Choice, List<UnsecuredMarketTransaction2>> mmTransaction = new MMMessageAssociationEnd<UnsecuredMarketReport2Choice, List<UnsecuredMarketTransaction2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.UnsecuredMarketReport2Choice.mmObject();
			isDerived = false;
			xmlTag = "Tx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transaction";
			definition = "Provides the details of the unsecured market transaction as reported by the reporting agent.";
			nextVersions_lazy = () -> Arrays.asList(UnsecuredMarketReport3Choice.mmTransaction);
			previousVersion_lazy = () -> UnsecuredMarketReport1Choice.mmTransaction;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> UnsecuredMarketTransaction2.mmObject();
		}

		@Override
		public List<UnsecuredMarketTransaction2> getValue(UnsecuredMarketReport2Choice obj) {
			return obj.getTransaction();
		}

		@Override
		public void setValue(UnsecuredMarketReport2Choice obj, List<UnsecuredMarketTransaction2> value) {
			obj.setTransaction(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.UnsecuredMarketReport2Choice.mmDataSetAction, com.tools20022.repository.choice.UnsecuredMarketReport2Choice.mmTransaction);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "UnsecuredMarketReport2Choice";
				definition = "Choice between a reason for no activity and the unsecured market segment transaction details.";
				nextVersions_lazy = () -> Arrays.asList(UnsecuredMarketReport3Choice.mmObject());
				previousVersion_lazy = () -> UnsecuredMarketReport1Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public ReportPeriodActivity1Code getDataSetAction() {
		return dataSetAction;
	}

	public UnsecuredMarketReport2Choice setDataSetAction(ReportPeriodActivity1Code dataSetAction) {
		this.dataSetAction = Objects.requireNonNull(dataSetAction);
		return this;
	}

	public List<UnsecuredMarketTransaction2> getTransaction() {
		return transaction == null ? transaction = new ArrayList<>() : transaction;
	}

	public UnsecuredMarketReport2Choice setTransaction(List<UnsecuredMarketTransaction2> transaction) {
		this.transaction = Objects.requireNonNull(transaction);
		return this;
	}
}