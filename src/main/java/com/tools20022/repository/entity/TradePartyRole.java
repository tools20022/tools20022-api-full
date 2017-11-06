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
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.choice.OptionParty1Choice;
import com.tools20022.repository.codeset.OptionPartyCode;
import com.tools20022.repository.codeset.TradingCapacityCode;
import com.tools20022.repository.entity.Role;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Trading party in a commercial, securities, treasury trade. This role may also
 * represent parties which play different intermediary roles in a trade.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="TradePartyRole" src="doc-files/TradePartyRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.TradePartyRole#mmAccount
 * TradePartyRole.mmAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradePartyRole#mmTradingPartyCapacity
 * TradePartyRole.mmTradingPartyCapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradePartyRole#mmBuyerOrSeller
 * TradePartyRole.mmBuyerOrSeller}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradePartyRole#mmTrade
 * TradePartyRole.mmTrade}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.InvestorRole InvestorRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradeOriginatorRole
 * TradeOriginatorRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTradePartyRole
 * SecuritiesTradePartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BuyerRole BuyerRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Borrower Borrower}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SellerRole SellerRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Lender Lender}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradeRegulator
 * TradeRegulator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Broker Broker}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TreasuryTradePartyRole
 * TreasuryTradePartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CommercialTradePartyRole
 * CommercialTradePartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ClearingExceptionPartyRole
 * ClearingExceptionPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.QualifiedForeignIntermediary
 * QualifiedForeignIntermediary}</li>
 * <li>{@linkplain com.tools20022.repository.entity.StockExchange StockExchange}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.SellerBank SellerBank}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BuyerBank BuyerBank}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AllocationPartyRole
 * AllocationPartyRole}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmTradePartyRole
 * Account.mmTradePartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#mmTradePartyRole
 * Trade.mmTradePartyRole}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary4#mmRole
 * Intermediary4.mmRole}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary10#mmRole
 * Intermediary10.mmRole}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary10#mmExtendedRole
 * Intermediary10.mmExtendedRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction1#mmCounterparty
 * StandingSettlementInstruction1.mmCounterparty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction4#mmCounterparty
 * StandingSettlementInstruction4.mmCounterparty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction7#mmCounterparty
 * StandingSettlementInstruction7.mmCounterparty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction2#mmCounterparty
 * StandingSettlementInstruction2.mmCounterparty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction3#mmCounterparty
 * StandingSettlementInstruction3.mmCounterparty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction6#mmCounterparty
 * StandingSettlementInstruction6.mmCounterparty}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary8#mmRole
 * Intermediary8.mmRole}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary8#mmExtendedRole
 * Intermediary8.mmExtendedRole}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary9#mmRole
 * Intermediary9.mmRole}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary9#mmExtendedRole
 * Intermediary9.mmExtendedRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction5#mmCounterparty
 * StandingSettlementInstruction5.mmCounterparty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction8#mmCounterparty
 * StandingSettlementInstruction8.mmCounterparty}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary16#mmRoleType
 * Intermediary16.mmRoleType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary19#mmRole
 * Intermediary19.mmRole}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary19#mmExtendedRole
 * Intermediary19.mmExtendedRole}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary20#mmRole
 * Intermediary20.mmRole}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary20#mmExtendedRole
 * Intermediary20.mmExtendedRole}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary24#mmRole
 * Intermediary24.mmRole}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary29#mmRole
 * Intermediary29.mmRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction11#mmCounterparty
 * StandingSettlementInstruction11.mmCounterparty}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary36#mmRole
 * Intermediary36.mmRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction12#mmCounterparty
 * StandingSettlementInstruction12.mmCounterparty}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary39#mmRole
 * Intermediary39.mmRole}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary40#mmRole
 * Intermediary40.mmRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InvestmentFundRole2Choice#mmCode
 * InvestmentFundRole2Choice.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InvestmentFundRole2Choice#mmProprietary
 * InvestmentFundRole2Choice.mmProprietary}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Role Role}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary4 Intermediary4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary10 Intermediary10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails4
 * ConfirmationPartyDetails4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary14 Intermediary14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails2
 * ConfirmationPartyDetails2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails3
 * ConfirmationPartyDetails3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ConfirmationParties3
 * ConfirmationParties3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails1
 * ConfirmationPartyDetails1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails6
 * ConfirmationPartyDetails6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ConfirmationParties4
 * ConfirmationParties4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails5
 * ConfirmationPartyDetails5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ConfirmationParties2
 * ConfirmationParties2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradePartyIdentification2
 * TradePartyIdentification2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradePartyIdentification3
 * TradePartyIdentification3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradePartyIdentification5
 * TradePartyIdentification5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary8 Intermediary8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary9 Intermediary9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradePartyIdentification1
 * TradePartyIdentification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradePartyIdentification4
 * TradePartyIdentification4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary16 Intermediary16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary19 Intermediary19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary20 Intermediary20}</li>
 * <li>{@linkplain com.tools20022.repository.choice.OptionParty1Choice
 * OptionParty1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary29 Intermediary29}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradePartyIdentification7
 * TradePartyIdentification7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary39 Intermediary39}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary40 Intermediary40}</li>
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
 * "TradePartyRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Trading party in a commercial, securities, treasury trade. This role may also represent parties which play different intermediary roles in a trade."
 * </li>
 * </ul>
 */
public class TradePartyRole extends Role {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.Account> account;
	/**
	 * Unambiguous identification of the account used in the context of the
	 * party role.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmTradePartyRole
	 * Account.mmTradePartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Account Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradePartyRole
	 * TradePartyRole}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary4#mmAccount
	 * Intermediary4.mmAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary10#mmAccount
	 * Intermediary10.mmAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary8#mmAccount
	 * Intermediary8.mmAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary9#mmAccount
	 * Intermediary9.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg5#mmTradingPartyAccount
	 * TradeLeg5.mmTradingPartyAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg6#mmTradingPartyAccount
	 * TradeLeg6.mmTradingPartyAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg7#mmTradingPartyAccount
	 * TradeLeg7.mmTradingPartyAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary16#mmAccount
	 * Intermediary16.mmAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary19#mmAccount
	 * Intermediary19.mmAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary20#mmAccount
	 * Intermediary20.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg8#mmTradingPartyAccount
	 * TradeLeg8.mmTradingPartyAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg10#mmTradingPartyAccount
	 * TradeLeg10.mmTradingPartyAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg9#mmTradingPartyAccount
	 * TradeLeg9.mmTradingPartyAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary39#mmAccount
	 * Intermediary39.mmAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary40#mmAccount
	 * Intermediary40.mmAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the account used in the context of the party role."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Intermediary4.mmAccount, com.tools20022.repository.msg.Intermediary10.mmAccount, com.tools20022.repository.msg.Intermediary8.mmAccount,
					com.tools20022.repository.msg.Intermediary9.mmAccount, com.tools20022.repository.msg.TradeLeg5.mmTradingPartyAccount, com.tools20022.repository.msg.TradeLeg6.mmTradingPartyAccount,
					com.tools20022.repository.msg.TradeLeg7.mmTradingPartyAccount, com.tools20022.repository.msg.Intermediary16.mmAccount, com.tools20022.repository.msg.Intermediary19.mmAccount,
					com.tools20022.repository.msg.Intermediary20.mmAccount, com.tools20022.repository.msg.TradeLeg8.mmTradingPartyAccount, com.tools20022.repository.msg.TradeLeg10.mmTradingPartyAccount,
					com.tools20022.repository.msg.TradeLeg9.mmTradingPartyAccount, com.tools20022.repository.msg.Intermediary39.mmAccount, com.tools20022.repository.msg.Intermediary40.mmAccount);
			elementContext_lazy = () -> TradePartyRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Account";
			definition = "Unambiguous identification of the account used in the context of the party role.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Account.mmTradePartyRole;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
		}
	};
	protected TradingCapacityCode tradingPartyCapacity;
	/**
	 * Specifies the role of a trading party in a transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TradingCapacityCode
	 * TradingCapacityCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradePartyRole
	 * TradePartyRole}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradingPartyCapacity1Choice#mmCode
	 * TradingPartyCapacity1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradingPartyCapacity1Choice#mmProprietary
	 * TradingPartyCapacity1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails2#mmTradingPartyCapacity
	 * ConfirmationPartyDetails2.mmTradingPartyCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradingPartyCapacity2Choice#mmCode
	 * TradingPartyCapacity2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradingPartyCapacity2Choice#mmProprietary
	 * TradingPartyCapacity2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails3#mmPartyCapacity
	 * ConfirmationPartyDetails3.mmPartyCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails6#mmPartyCapacity
	 * ConfirmationPartyDetails6.mmPartyCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Intermediary9#mmTradingPartyCapacity
	 * Intermediary9.mmTradingPartyCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails1#mmCapacity
	 * TransactionDetails1.mmCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails3#mmCapacity
	 * TransactionDetails3.mmCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation4#mmTradingCapacity
	 * SettlementObligation4.mmTradingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg2#mmTradingCapacity
	 * TradeLeg2.mmTradingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg5#mmTradingCapacity
	 * TradeLeg5.mmTradingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg1#mmTradingCapacity
	 * TradeLeg1.mmTradingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg3#mmTradingCapacity
	 * TradeLeg3.mmTradingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg6#mmTradingCapacity
	 * TradeLeg6.mmTradingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg4#mmTradingCapacity
	 * TradeLeg4.mmTradingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg7#mmTradingCapacity
	 * TradeLeg7.mmTradingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetPosition2#mmTradingCapacity
	 * NetPosition2.mmTradingCapacity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order9#mmTradingCapacity
	 * Order9.mmTradingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg8#mmTradingCapacity
	 * TradeLeg8.mmTradingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetPosition3#mmTradingCapacity
	 * NetPosition3.mmTradingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg10#mmTradingCapacity
	 * TradeLeg10.mmTradingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg9#mmTradingCapacity
	 * TradeLeg9.mmTradingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation8#mmTradingCapacity
	 * SettlementObligation8.mmTradingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransaction1#mmTradingCapacity
	 * SecuritiesTransaction1.mmTradingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Intermediary39#mmTradingPartyCapacity
	 * Intermediary39.mmTradingPartyCapacity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingPartyCapacity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the role of a trading party in a transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTradingPartyCapacity = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.TradingPartyCapacity1Choice.mmCode, com.tools20022.repository.choice.TradingPartyCapacity1Choice.mmProprietary,
					com.tools20022.repository.msg.ConfirmationPartyDetails2.mmTradingPartyCapacity, com.tools20022.repository.choice.TradingPartyCapacity2Choice.mmCode,
					com.tools20022.repository.choice.TradingPartyCapacity2Choice.mmProprietary, com.tools20022.repository.msg.ConfirmationPartyDetails3.mmPartyCapacity,
					com.tools20022.repository.msg.ConfirmationPartyDetails6.mmPartyCapacity, com.tools20022.repository.msg.Intermediary9.mmTradingPartyCapacity, com.tools20022.repository.msg.TransactionDetails1.mmCapacity,
					com.tools20022.repository.msg.TransactionDetails3.mmCapacity, com.tools20022.repository.msg.SettlementObligation4.mmTradingCapacity, com.tools20022.repository.msg.TradeLeg2.mmTradingCapacity,
					com.tools20022.repository.msg.TradeLeg5.mmTradingCapacity, com.tools20022.repository.msg.TradeLeg1.mmTradingCapacity, com.tools20022.repository.msg.TradeLeg3.mmTradingCapacity,
					com.tools20022.repository.msg.TradeLeg6.mmTradingCapacity, com.tools20022.repository.msg.TradeLeg4.mmTradingCapacity, com.tools20022.repository.msg.TradeLeg7.mmTradingCapacity,
					com.tools20022.repository.msg.NetPosition2.mmTradingCapacity, com.tools20022.repository.msg.Order9.mmTradingCapacity, com.tools20022.repository.msg.TradeLeg8.mmTradingCapacity,
					com.tools20022.repository.msg.NetPosition3.mmTradingCapacity, com.tools20022.repository.msg.TradeLeg10.mmTradingCapacity, com.tools20022.repository.msg.TradeLeg9.mmTradingCapacity,
					com.tools20022.repository.msg.SettlementObligation8.mmTradingCapacity, com.tools20022.repository.msg.SecuritiesTransaction1.mmTradingCapacity, com.tools20022.repository.msg.Intermediary39.mmTradingPartyCapacity);
			elementContext_lazy = () -> TradePartyRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradingPartyCapacity";
			definition = "Specifies the role of a trading party in a transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TradingCapacityCode.mmObject();
		}
	};
	protected OptionPartyCode buyerOrSeller;
	/**
	 * Specifies the party which is the buyer or the seller.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OptionPartyCode
	 * OptionPartyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradePartyRole
	 * TradePartyRole}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Option1#mmTradingPartyRole
	 * Option1.mmTradingPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification2#mmRole
	 * TradePartyIdentification2.mmRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification4#mmBuyerOrSellerIndicator
	 * TradePartyIdentification4.mmBuyerOrSellerIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionParty1Choice#mmCode
	 * OptionParty1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionParty1Choice#mmProprietary
	 * OptionParty1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction1#mmCounterpartyIdentification
	 * ForeignExchangeSwapTransaction1.mmCounterpartyIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification7#mmBuyerOrSellerIndicator
	 * TradePartyIdentification7.mmBuyerOrSellerIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction2#mmCounterpartyIdentification
	 * ForeignExchangeSwapTransaction2.mmCounterpartyIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction3#mmCounterpartyIdentification
	 * ForeignExchangeSwapTransaction3.mmCounterpartyIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyerOrSeller"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the party which is the buyer or the seller."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmBuyerOrSeller = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Option1.mmTradingPartyRole, com.tools20022.repository.msg.TradePartyIdentification2.mmRole,
					com.tools20022.repository.msg.TradePartyIdentification4.mmBuyerOrSellerIndicator, com.tools20022.repository.choice.OptionParty1Choice.mmCode, com.tools20022.repository.choice.OptionParty1Choice.mmProprietary,
					com.tools20022.repository.msg.ForeignExchangeSwapTransaction1.mmCounterpartyIdentification, com.tools20022.repository.msg.TradePartyIdentification7.mmBuyerOrSellerIndicator,
					com.tools20022.repository.msg.ForeignExchangeSwapTransaction2.mmCounterpartyIdentification, com.tools20022.repository.msg.ForeignExchangeSwapTransaction3.mmCounterpartyIdentification);
			elementContext_lazy = () -> TradePartyRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BuyerOrSeller";
			definition = "Specifies the party which is the buyer or the seller.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OptionPartyCode.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Trade> trade;
	/**
	 * Trade in which a party plays a role.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradePartyRole
	 * Trade.mmTradePartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Trade Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradePartyRole
	 * TradePartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Trade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade in which a party plays a role."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTrade = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> TradePartyRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Trade";
			definition = "Trade in which a party plays a role.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Trade.mmTradePartyRole;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TradePartyRole";
				definition = "Trading party in a commercial, securities, treasury trade. This role may also represent parties which play different intermediary roles in a trade.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Account.mmTradePartyRole, com.tools20022.repository.entity.Trade.mmTradePartyRole);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Intermediary4.mmRole, com.tools20022.repository.msg.Intermediary10.mmRole, com.tools20022.repository.msg.Intermediary10.mmExtendedRole,
						com.tools20022.repository.msg.StandingSettlementInstruction1.mmCounterparty, com.tools20022.repository.msg.StandingSettlementInstruction4.mmCounterparty,
						com.tools20022.repository.msg.StandingSettlementInstruction7.mmCounterparty, com.tools20022.repository.msg.StandingSettlementInstruction2.mmCounterparty,
						com.tools20022.repository.msg.StandingSettlementInstruction3.mmCounterparty, com.tools20022.repository.msg.StandingSettlementInstruction6.mmCounterparty, com.tools20022.repository.msg.Intermediary8.mmRole,
						com.tools20022.repository.msg.Intermediary8.mmExtendedRole, com.tools20022.repository.msg.Intermediary9.mmRole, com.tools20022.repository.msg.Intermediary9.mmExtendedRole,
						com.tools20022.repository.msg.StandingSettlementInstruction5.mmCounterparty, com.tools20022.repository.msg.StandingSettlementInstruction8.mmCounterparty, com.tools20022.repository.msg.Intermediary16.mmRoleType,
						com.tools20022.repository.msg.Intermediary19.mmRole, com.tools20022.repository.msg.Intermediary19.mmExtendedRole, com.tools20022.repository.msg.Intermediary20.mmRole,
						com.tools20022.repository.msg.Intermediary20.mmExtendedRole, com.tools20022.repository.msg.Intermediary24.mmRole, com.tools20022.repository.msg.Intermediary29.mmRole,
						com.tools20022.repository.msg.StandingSettlementInstruction11.mmCounterparty, com.tools20022.repository.msg.Intermediary36.mmRole, com.tools20022.repository.msg.StandingSettlementInstruction12.mmCounterparty,
						com.tools20022.repository.msg.Intermediary39.mmRole, com.tools20022.repository.msg.Intermediary40.mmRole, com.tools20022.repository.choice.InvestmentFundRole2Choice.mmCode,
						com.tools20022.repository.choice.InvestmentFundRole2Choice.mmProprietary);
				subType_lazy = () -> Arrays.asList(InvestorRole.mmObject(), TradeOriginatorRole.mmObject(), SecuritiesTradePartyRole.mmObject(), BuyerRole.mmObject(), Borrower.mmObject(), SellerRole.mmObject(), Lender.mmObject(),
						TradeRegulator.mmObject(), Broker.mmObject(), TreasuryTradePartyRole.mmObject(), CommercialTradePartyRole.mmObject(), ClearingExceptionPartyRole.mmObject(), QualifiedForeignIntermediary.mmObject(),
						StockExchange.mmObject(), SellerBank.mmObject(), BuyerBank.mmObject(), AllocationPartyRole.mmObject());
				superType_lazy = () -> Role.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TradePartyRole.mmAccount, com.tools20022.repository.entity.TradePartyRole.mmTradingPartyCapacity,
						com.tools20022.repository.entity.TradePartyRole.mmBuyerOrSeller, com.tools20022.repository.entity.TradePartyRole.mmTrade);
				derivationComponent_lazy = () -> Arrays.asList(Intermediary4.mmObject(), Intermediary10.mmObject(), ConfirmationPartyDetails4.mmObject(), Intermediary14.mmObject(), ConfirmationPartyDetails2.mmObject(),
						ConfirmationPartyDetails3.mmObject(), ConfirmationParties3.mmObject(), ConfirmationPartyDetails1.mmObject(), ConfirmationPartyDetails6.mmObject(), ConfirmationParties4.mmObject(),
						ConfirmationPartyDetails5.mmObject(), ConfirmationParties2.mmObject(), TradePartyIdentification2.mmObject(), TradePartyIdentification3.mmObject(), TradePartyIdentification5.mmObject(), Intermediary8.mmObject(),
						Intermediary9.mmObject(), TradePartyIdentification1.mmObject(), TradePartyIdentification4.mmObject(), Intermediary16.mmObject(), Intermediary19.mmObject(), Intermediary20.mmObject(), OptionParty1Choice.mmObject(),
						Intermediary29.mmObject(), TradePartyIdentification7.mmObject(), Intermediary39.mmObject(), Intermediary40.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public List<Account> getAccount() {
		return account;
	}

	public void setAccount(List<com.tools20022.repository.entity.Account> account) {
		this.account = account;
	}

	public TradingCapacityCode getTradingPartyCapacity() {
		return tradingPartyCapacity;
	}

	public void setTradingPartyCapacity(TradingCapacityCode tradingPartyCapacity) {
		this.tradingPartyCapacity = tradingPartyCapacity;
	}

	public OptionPartyCode getBuyerOrSeller() {
		return buyerOrSeller;
	}

	public void setBuyerOrSeller(OptionPartyCode buyerOrSeller) {
		this.buyerOrSeller = buyerOrSeller;
	}

	public List<Trade> getTrade() {
		return trade;
	}

	public void setTrade(List<com.tools20022.repository.entity.Trade> trade) {
		this.trade = trade;
	}
}