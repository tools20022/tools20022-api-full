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

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.TreasuryTradePartyRole;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.entity.TreasuryTradingParty#InvestmentFund
 * TreasuryTradingParty.InvestmentFund}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFund#TreasuryTradingParty
 * InvestmentFund.TreasuryTradingParty}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification2#TradeParty
 * TradePartyIdentification2.TradeParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification3#TradeParty
 * TradePartyIdentification3.TradeParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification5#TradeParty
 * TradePartyIdentification5.TradeParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification1#TradeParty
 * TradePartyIdentification1.TradeParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification4#TradeParty
 * TradePartyIdentification4.TradeParty}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TreasuryProfile1#TraderType
 * TreasuryProfile1.TraderType}</li>
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
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
	/**
	 * Specifies the fund for which a treasury trade is executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFund#TreasuryTradingParty
	 * InvestmentFund.TreasuryTradingParty}</li>
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
	 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification2#FundInformation
	 * TradePartyIdentification2.FundInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification3#FundInformation
	 * TradePartyIdentification3.FundInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification5#FundIdentification
	 * TradePartyIdentification5.FundIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification60#FundIdentification
	 * PartyIdentification60.FundIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification6#FundIdentification
	 * TradePartyIdentification6.FundIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification1#FundInformation
	 * TradePartyIdentification1.FundInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification4#FundInformation
	 * TradePartyIdentification4.FundInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification7#FundInformation
	 * TradePartyIdentification7.FundInformation}</li>
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
	public static final MMBusinessAssociationEnd InvestmentFund = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradePartyIdentification2.FundInformation, com.tools20022.repository.msg.TradePartyIdentification3.FundInformation,
					com.tools20022.repository.msg.TradePartyIdentification5.FundIdentification, com.tools20022.repository.msg.PartyIdentification60.FundIdentification,
					com.tools20022.repository.msg.TradePartyIdentification6.FundIdentification, com.tools20022.repository.msg.TradePartyIdentification1.FundInformation,
					com.tools20022.repository.msg.TradePartyIdentification4.FundInformation, com.tools20022.repository.msg.TradePartyIdentification7.FundInformation);
			elementContext_lazy = () -> TreasuryTradingParty.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentFund";
			definition = "Specifies the fund for which a treasury trade is executed.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFund.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFund.TreasuryTradingParty;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TreasuryTradingParty";
				definition = "Party that negotiates and executes treasury transactions on its behalf or on behalf of another party.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFund.TreasuryTradingParty);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradePartyIdentification2.TradeParty, com.tools20022.repository.msg.TradePartyIdentification3.TradeParty,
						com.tools20022.repository.msg.TradePartyIdentification5.TradeParty, com.tools20022.repository.msg.TradePartyIdentification1.TradeParty, com.tools20022.repository.msg.TradePartyIdentification4.TradeParty,
						com.tools20022.repository.msg.TreasuryProfile1.TraderType);
				subType_lazy = () -> Arrays.asList(TradingBranch.mmObject());
				superType_lazy = () -> TreasuryTradePartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TreasuryTradingParty.InvestmentFund);
			}
		});
		return mmObject_lazy.get();
	}
}