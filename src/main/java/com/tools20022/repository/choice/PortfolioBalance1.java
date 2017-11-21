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
import com.tools20022.repository.area.semt.TotalPortfolioValuationReportV01;
import com.tools20022.repository.entity.Balance;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.BalanceDetails5;
import com.tools20022.repository.msg.BalanceDetails6;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Balance breakdown information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PortfolioBalance1#mmSummaryBalance
 * PortfolioBalance1.mmSummaryBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PortfolioBalance1#mmDetailedBalance
 * PortfolioBalance1.mmDetailedBalance}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Balance Balance}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.TotalPortfolioValuationReportV01#mmBalance
 * TotalPortfolioValuationReportV01.mmBalance}</li>
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
 * "PortfolioBalance1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Balance breakdown information."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "PortfolioBalance1", propOrder = {"summaryBalance", "detailedBalance"})
public class PortfolioBalance1 {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected List<BalanceDetails5> summaryBalance;
	/**
	 * Summary balance information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BalanceDetails5
	 * BalanceDetails5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Balance Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PortfolioBalance1
	 * PortfolioBalance1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SummryBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SummaryBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Summary balance information."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSummaryBalance = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Balance.mmObject();
			componentContext_lazy = () -> PortfolioBalance1.mmObject();
			isDerived = false;
			xmlTag = "SummryBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SummaryBalance";
			definition = "Summary balance information.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> BalanceDetails5.mmObject();
		}
	};
	protected List<BalanceDetails6> detailedBalance;
	/**
	 * Detailed balance information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BalanceDetails6
	 * BalanceDetails6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Balance Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PortfolioBalance1
	 * PortfolioBalance1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtldBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DetailedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Detailed balance information."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDetailedBalance = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Balance.mmObject();
			componentContext_lazy = () -> PortfolioBalance1.mmObject();
			isDerived = false;
			xmlTag = "DtldBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DetailedBalance";
			definition = "Detailed balance information.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> BalanceDetails6.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PortfolioBalance1.mmSummaryBalance, PortfolioBalance1.mmDetailedBalance);
				messageBuildingBlock_lazy = () -> Arrays.asList(TotalPortfolioValuationReportV01.mmBalance);
				trace_lazy = () -> Balance.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PortfolioBalance1";
				definition = "Balance breakdown information.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "SummryBal", required = true)
	public List<BalanceDetails5> getSummaryBalance() {
		return summaryBalance;
	}

	public void setSummaryBalance(List<BalanceDetails5> summaryBalance) {
		this.summaryBalance = summaryBalance;
	}

	@XmlElement(name = "DtldBal", required = true)
	public List<BalanceDetails6> getDetailedBalance() {
		return detailedBalance;
	}

	public void setDetailedBalance(List<BalanceDetails6> detailedBalance) {
		this.detailedBalance = detailedBalance;
	}
}