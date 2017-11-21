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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMAggregation;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.TreasuryTradePartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Party that negotiates and executes treasury transactions on its behalf or on
 * behalf of another party.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="TreasuryTradingParty" src="doc-files/TreasuryTradingParty.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TreasuryTradingParty#mmInvestmentFund
 * TreasuryTradingParty.mmInvestmentFund}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.TradingBranch TradingBranch}
 * </li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.TreasuryTradePartyRole
 * TreasuryTradePartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFund#mmTreasuryTradingParty
 * InvestmentFund.mmTreasuryTradingParty}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification2#mmTradeParty
 * TradePartyIdentification2.mmTradeParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification3#mmTradeParty
 * TradePartyIdentification3.mmTradeParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification5#mmTradeParty
 * TradePartyIdentification5.mmTradeParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification1#mmTradeParty
 * TradePartyIdentification1.mmTradeParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification4#mmTradeParty
 * TradePartyIdentification4.mmTradeParty}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TreasuryProfile1#mmTraderType
 * TreasuryProfile1.mmTraderType}</li>
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
 * "TreasuryTradingParty"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Party that negotiates and executes treasury transactions on its behalf or on behalf of another party."
 * </li>
 * </ul>
 */
public class TreasuryTradingParty extends TreasuryTradePartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.InvestmentFund> investmentFund;
	/**
	 * Specifies the fund for which a treasury trade is executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFund#mmTreasuryTradingParty
	 * InvestmentFund.mmTreasuryTradingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentFund
	 * InvestmentFund}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification2#mmFundInformation
	 * TradePartyIdentification2.mmFundInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification3#mmFundInformation
	 * TradePartyIdentification3.mmFundInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification5#mmFundIdentification
	 * TradePartyIdentification5.mmFundIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification60#mmFundIdentification
	 * PartyIdentification60.mmFundIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification6#mmFundIdentification
	 * TradePartyIdentification6.mmFundIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification1#mmFundInformation
	 * TradePartyIdentification1.mmFundInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification4#mmFundInformation
	 * TradePartyIdentification4.mmFundInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification7#mmFundInformation
	 * TradePartyIdentification7.mmFundInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradingParty
	 * TreasuryTradingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentFund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the fund for which a treasury trade is executed."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmInvestmentFund = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(TradePartyIdentification2.mmFundInformation, TradePartyIdentification3.mmFundInformation, TradePartyIdentification5.mmFundIdentification, PartyIdentification60.mmFundIdentification,
					TradePartyIdentification6.mmFundIdentification, TradePartyIdentification1.mmFundInformation, TradePartyIdentification4.mmFundInformation, TradePartyIdentification7.mmFundInformation);
			elementContext_lazy = () -> com.tools20022.repository.entity.TreasuryTradingParty.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentFund";
			definition = "Specifies the fund for which a treasury trade is executed.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFund.mmTreasuryTradingParty;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFund.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TreasuryTradingParty";
				definition = "Party that negotiates and executes treasury transactions on its behalf or on behalf of another party.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFund.mmTreasuryTradingParty);
				derivationElement_lazy = () -> Arrays.asList(TradePartyIdentification2.mmTradeParty, TradePartyIdentification3.mmTradeParty, TradePartyIdentification5.mmTradeParty, TradePartyIdentification1.mmTradeParty,
						TradePartyIdentification4.mmTradeParty, TreasuryProfile1.mmTraderType);
				subType_lazy = () -> Arrays.asList(TradingBranch.mmObject());
				superType_lazy = () -> TreasuryTradePartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TreasuryTradingParty.mmInvestmentFund);
			}

			@Override
			public Class<?> getInstanceClass() {
				return TreasuryTradingParty.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<InvestmentFund> getInvestmentFund() {
		return investmentFund;
	}

	public void setInvestmentFund(List<com.tools20022.repository.entity.InvestmentFund> investmentFund) {
		this.investmentFund = investmentFund;
	}
}