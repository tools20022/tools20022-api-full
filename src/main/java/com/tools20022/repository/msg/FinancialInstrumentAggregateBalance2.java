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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice;
import com.tools20022.repository.entity.SecuritiesBalance;
import com.tools20022.repository.entity.SecuritiesQuantity;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Aggregated position held in a securities account for a specified financial
 * instrument.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAggregateBalance2#mmSettledBalance
 * FinancialInstrumentAggregateBalance2.mmSettledBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAggregateBalance2#mmTradedBalance
 * FinancialInstrumentAggregateBalance2.mmTradedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAggregateBalance2#mmBalanceBreakdown
 * FinancialInstrumentAggregateBalance2.mmBalanceBreakdown}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesBalance
 * SecuritiesBalance}</li>
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
 * "FinancialInstrumentAggregateBalance2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Aggregated position held in a securities account for a specified financial instrument."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "FinancialInstrumentAggregateBalance2", propOrder = {"settledBalance", "tradedBalance", "balanceBreakdown"})
public class FinancialInstrumentAggregateBalance2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected FinancialInstrumentQuantity1Choice settledBalance;
	/**
	 * Balance of settled transactions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice
	 * FinancialInstrumentQuantity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAggregateBalance2
	 * FinancialInstrumentAggregateBalance2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttldBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettledBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance of settled transactions."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettledBalance = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesQuantity.mmObject();
			componentContext_lazy = () -> FinancialInstrumentAggregateBalance2.mmObject();
			isDerived = false;
			xmlTag = "SttldBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettledBalance";
			definition = "Balance of settled transactions.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
		}
	};
	protected FinancialInstrumentQuantity1Choice tradedBalance;
	/**
	 * Balance of settled transactions and transactions pending settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice
	 * FinancialInstrumentQuantity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAggregateBalance2
	 * FinancialInstrumentAggregateBalance2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TraddBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of settled transactions and transactions pending settlement."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTradedBalance = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesQuantity.mmObject();
			componentContext_lazy = () -> FinancialInstrumentAggregateBalance2.mmObject();
			isDerived = false;
			xmlTag = "TraddBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradedBalance";
			definition = "Balance of settled transactions and transactions pending settlement.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.SubBalanceBreakdown1> balanceBreakdown;
	/**
	 * Breakdown of the balances of holdings into sub-balances.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SubBalanceBreakdown1
	 * SubBalanceBreakdown1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAggregateBalance2
	 * FinancialInstrumentAggregateBalance2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BalBrkdwn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceBreakdown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Breakdown of the balances of holdings into sub-balances."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBalanceBreakdown = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesBalance.mmObject();
			componentContext_lazy = () -> FinancialInstrumentAggregateBalance2.mmObject();
			isDerived = false;
			xmlTag = "BalBrkdwn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceBreakdown";
			definition = "Breakdown of the balances of holdings into sub-balances.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SubBalanceBreakdown1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(FinancialInstrumentAggregateBalance2.mmSettledBalance, FinancialInstrumentAggregateBalance2.mmTradedBalance, FinancialInstrumentAggregateBalance2.mmBalanceBreakdown);
				trace_lazy = () -> SecuritiesBalance.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancialInstrumentAggregateBalance2";
				definition = "Aggregated position held in a securities account for a specified financial instrument.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "SttldBal")
	public FinancialInstrumentQuantity1Choice getSettledBalance() {
		return settledBalance;
	}

	public void setSettledBalance(FinancialInstrumentQuantity1Choice settledBalance) {
		this.settledBalance = settledBalance;
	}

	@XmlElement(name = "TraddBal")
	public FinancialInstrumentQuantity1Choice getTradedBalance() {
		return tradedBalance;
	}

	public void setTradedBalance(FinancialInstrumentQuantity1Choice tradedBalance) {
		this.tradedBalance = tradedBalance;
	}

	@XmlElement(name = "BalBrkdwn")
	public List<SubBalanceBreakdown1> getBalanceBreakdown() {
		return balanceBreakdown;
	}

	public void setBalanceBreakdown(List<com.tools20022.repository.msg.SubBalanceBreakdown1> balanceBreakdown) {
		this.balanceBreakdown = balanceBreakdown;
	}
}