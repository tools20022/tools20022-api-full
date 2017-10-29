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
 * <li>{@linkplain com.tools20022.repository.entity.TradePartyRole#Account
 * TradePartyRole.Account}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradePartyRole#TradingPartyCapacity
 * TradePartyRole.TradingPartyCapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradePartyRole#BuyerOrSeller
 * TradePartyRole.BuyerOrSeller}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradePartyRole#Trade
 * TradePartyRole.Trade}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Account#TradePartyRole
 * Account.TradePartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#TradePartyRole
 * Trade.TradePartyRole}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary4#Role
 * Intermediary4.Role}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary10#Role
 * Intermediary10.Role}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary10#ExtendedRole
 * Intermediary10.ExtendedRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction1#Counterparty
 * StandingSettlementInstruction1.Counterparty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction4#Counterparty
 * StandingSettlementInstruction4.Counterparty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction7#Counterparty
 * StandingSettlementInstruction7.Counterparty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction2#Counterparty
 * StandingSettlementInstruction2.Counterparty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction3#Counterparty
 * StandingSettlementInstruction3.Counterparty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction6#Counterparty
 * StandingSettlementInstruction6.Counterparty}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary8#Role
 * Intermediary8.Role}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary8#ExtendedRole
 * Intermediary8.ExtendedRole}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary9#Role
 * Intermediary9.Role}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary9#ExtendedRole
 * Intermediary9.ExtendedRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction5#Counterparty
 * StandingSettlementInstruction5.Counterparty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction8#Counterparty
 * StandingSettlementInstruction8.Counterparty}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary16#RoleType
 * Intermediary16.RoleType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary19#Role
 * Intermediary19.Role}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary19#ExtendedRole
 * Intermediary19.ExtendedRole}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary20#Role
 * Intermediary20.Role}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary20#ExtendedRole
 * Intermediary20.ExtendedRole}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary24#Role
 * Intermediary24.Role}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary29#Role
 * Intermediary29.Role}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction11#Counterparty
 * StandingSettlementInstruction11.Counterparty}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary36#Role
 * Intermediary36.Role}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction12#Counterparty
 * StandingSettlementInstruction12.Counterparty}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary39#Role
 * Intermediary39.Role}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary40#Role
 * Intermediary40.Role}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InvestmentFundRole2Choice#Code
 * InvestmentFundRole2Choice.Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InvestmentFundRole2Choice#Proprietary
 * InvestmentFundRole2Choice.Proprietary}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
	/**
	 * Unambiguous identification of the account used in the context of the
	 * party role.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Account#TradePartyRole
	 * Account.TradePartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Account Account}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary4#Account
	 * Intermediary4.Account}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary10#Account
	 * Intermediary10.Account}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary8#Account
	 * Intermediary8.Account}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary9#Account
	 * Intermediary9.Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg5#TradingPartyAccount
	 * TradeLeg5.TradingPartyAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg6#TradingPartyAccount
	 * TradeLeg6.TradingPartyAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg7#TradingPartyAccount
	 * TradeLeg7.TradingPartyAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary16#Account
	 * Intermediary16.Account}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary19#Account
	 * Intermediary19.Account}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary20#Account
	 * Intermediary20.Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg8#TradingPartyAccount
	 * TradeLeg8.TradingPartyAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg10#TradingPartyAccount
	 * TradeLeg10.TradingPartyAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg9#TradingPartyAccount
	 * TradeLeg9.TradingPartyAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary39#Account
	 * Intermediary39.Account}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary40#Account
	 * Intermediary40.Account}</li>
	 * </ul>
	 * </li>
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
	 * name} = "Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the account used in the context of the party role."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Account = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Intermediary4.Account, com.tools20022.repository.msg.Intermediary10.Account, com.tools20022.repository.msg.Intermediary8.Account,
					com.tools20022.repository.msg.Intermediary9.Account, com.tools20022.repository.msg.TradeLeg5.TradingPartyAccount, com.tools20022.repository.msg.TradeLeg6.TradingPartyAccount,
					com.tools20022.repository.msg.TradeLeg7.TradingPartyAccount, com.tools20022.repository.msg.Intermediary16.Account, com.tools20022.repository.msg.Intermediary19.Account,
					com.tools20022.repository.msg.Intermediary20.Account, com.tools20022.repository.msg.TradeLeg8.TradingPartyAccount, com.tools20022.repository.msg.TradeLeg10.TradingPartyAccount,
					com.tools20022.repository.msg.TradeLeg9.TradingPartyAccount, com.tools20022.repository.msg.Intermediary39.Account, com.tools20022.repository.msg.Intermediary40.Account);
			elementContext_lazy = () -> TradePartyRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Account";
			definition = "Unambiguous identification of the account used in the context of the party role.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Account.TradePartyRole;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradingPartyCapacity1Choice#Code
	 * TradingPartyCapacity1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradingPartyCapacity1Choice#Proprietary
	 * TradingPartyCapacity1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails2#TradingPartyCapacity
	 * ConfirmationPartyDetails2.TradingPartyCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradingPartyCapacity2Choice#Code
	 * TradingPartyCapacity2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradingPartyCapacity2Choice#Proprietary
	 * TradingPartyCapacity2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails3#PartyCapacity
	 * ConfirmationPartyDetails3.PartyCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails6#PartyCapacity
	 * ConfirmationPartyDetails6.PartyCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Intermediary9#TradingPartyCapacity
	 * Intermediary9.TradingPartyCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails1#Capacity
	 * TransactionDetails1.Capacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails3#Capacity
	 * TransactionDetails3.Capacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation4#TradingCapacity
	 * SettlementObligation4.TradingCapacity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg2#TradingCapacity
	 * TradeLeg2.TradingCapacity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg5#TradingCapacity
	 * TradeLeg5.TradingCapacity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg1#TradingCapacity
	 * TradeLeg1.TradingCapacity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg3#TradingCapacity
	 * TradeLeg3.TradingCapacity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg6#TradingCapacity
	 * TradeLeg6.TradingCapacity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg4#TradingCapacity
	 * TradeLeg4.TradingCapacity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg7#TradingCapacity
	 * TradeLeg7.TradingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetPosition2#TradingCapacity
	 * NetPosition2.TradingCapacity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order9#TradingCapacity
	 * Order9.TradingCapacity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg8#TradingCapacity
	 * TradeLeg8.TradingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetPosition3#TradingCapacity
	 * NetPosition3.TradingCapacity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg10#TradingCapacity
	 * TradeLeg10.TradingCapacity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg9#TradingCapacity
	 * TradeLeg9.TradingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation8#TradingCapacity
	 * SettlementObligation8.TradingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransaction1#TradingCapacity
	 * SecuritiesTransaction1.TradingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Intermediary39#TradingPartyCapacity
	 * Intermediary39.TradingPartyCapacity}</li>
	 * </ul>
	 * </li>
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
	 * name} = "TradingPartyCapacity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the role of a trading party in a transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TradingPartyCapacity = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.TradingPartyCapacity1Choice.Code, com.tools20022.repository.choice.TradingPartyCapacity1Choice.Proprietary,
					com.tools20022.repository.msg.ConfirmationPartyDetails2.TradingPartyCapacity, com.tools20022.repository.choice.TradingPartyCapacity2Choice.Code, com.tools20022.repository.choice.TradingPartyCapacity2Choice.Proprietary,
					com.tools20022.repository.msg.ConfirmationPartyDetails3.PartyCapacity, com.tools20022.repository.msg.ConfirmationPartyDetails6.PartyCapacity, com.tools20022.repository.msg.Intermediary9.TradingPartyCapacity,
					com.tools20022.repository.msg.TransactionDetails1.Capacity, com.tools20022.repository.msg.TransactionDetails3.Capacity, com.tools20022.repository.msg.SettlementObligation4.TradingCapacity,
					com.tools20022.repository.msg.TradeLeg2.TradingCapacity, com.tools20022.repository.msg.TradeLeg5.TradingCapacity, com.tools20022.repository.msg.TradeLeg1.TradingCapacity,
					com.tools20022.repository.msg.TradeLeg3.TradingCapacity, com.tools20022.repository.msg.TradeLeg6.TradingCapacity, com.tools20022.repository.msg.TradeLeg4.TradingCapacity,
					com.tools20022.repository.msg.TradeLeg7.TradingCapacity, com.tools20022.repository.msg.NetPosition2.TradingCapacity, com.tools20022.repository.msg.Order9.TradingCapacity,
					com.tools20022.repository.msg.TradeLeg8.TradingCapacity, com.tools20022.repository.msg.NetPosition3.TradingCapacity, com.tools20022.repository.msg.TradeLeg10.TradingCapacity,
					com.tools20022.repository.msg.TradeLeg9.TradingCapacity, com.tools20022.repository.msg.SettlementObligation8.TradingCapacity, com.tools20022.repository.msg.SecuritiesTransaction1.TradingCapacity,
					com.tools20022.repository.msg.Intermediary39.TradingPartyCapacity);
			elementContext_lazy = () -> TradePartyRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradingPartyCapacity";
			definition = "Specifies the role of a trading party in a transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TradingCapacityCode.mmObject();
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Option1#TradingPartyRole
	 * Option1.TradingPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification2#Role
	 * TradePartyIdentification2.Role}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification4#BuyerOrSellerIndicator
	 * TradePartyIdentification4.BuyerOrSellerIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.OptionParty1Choice#Code
	 * OptionParty1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionParty1Choice#Proprietary
	 * OptionParty1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction1#CounterpartyIdentification
	 * ForeignExchangeSwapTransaction1.CounterpartyIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification7#BuyerOrSellerIndicator
	 * TradePartyIdentification7.BuyerOrSellerIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction2#CounterpartyIdentification
	 * ForeignExchangeSwapTransaction2.CounterpartyIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction3#CounterpartyIdentification
	 * ForeignExchangeSwapTransaction3.CounterpartyIdentification}</li>
	 * </ul>
	 * </li>
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
	 * name} = "BuyerOrSeller"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the party which is the buyer or the seller."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute BuyerOrSeller = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Option1.TradingPartyRole, com.tools20022.repository.msg.TradePartyIdentification2.Role,
					com.tools20022.repository.msg.TradePartyIdentification4.BuyerOrSellerIndicator, com.tools20022.repository.choice.OptionParty1Choice.Code, com.tools20022.repository.choice.OptionParty1Choice.Proprietary,
					com.tools20022.repository.msg.ForeignExchangeSwapTransaction1.CounterpartyIdentification, com.tools20022.repository.msg.TradePartyIdentification7.BuyerOrSellerIndicator,
					com.tools20022.repository.msg.ForeignExchangeSwapTransaction2.CounterpartyIdentification, com.tools20022.repository.msg.ForeignExchangeSwapTransaction3.CounterpartyIdentification);
			elementContext_lazy = () -> TradePartyRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BuyerOrSeller";
			definition = "Specifies the party which is the buyer or the seller.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> OptionPartyCode.mmObject();
		}
	};
	/**
	 * Trade in which a party plays a role.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Trade#TradePartyRole
	 * Trade.TradePartyRole}</li>
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
	public static final MMBusinessAssociationEnd Trade = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> TradePartyRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Trade";
			definition = "Trade in which a party plays a role.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Trade.TradePartyRole;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TradePartyRole";
				definition = "Trading party in a commercial, securities, treasury trade. This role may also represent parties which play different intermediary roles in a trade.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Account.TradePartyRole, com.tools20022.repository.entity.Trade.TradePartyRole);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Intermediary4.Role, com.tools20022.repository.msg.Intermediary10.Role, com.tools20022.repository.msg.Intermediary10.ExtendedRole,
						com.tools20022.repository.msg.StandingSettlementInstruction1.Counterparty, com.tools20022.repository.msg.StandingSettlementInstruction4.Counterparty,
						com.tools20022.repository.msg.StandingSettlementInstruction7.Counterparty, com.tools20022.repository.msg.StandingSettlementInstruction2.Counterparty,
						com.tools20022.repository.msg.StandingSettlementInstruction3.Counterparty, com.tools20022.repository.msg.StandingSettlementInstruction6.Counterparty, com.tools20022.repository.msg.Intermediary8.Role,
						com.tools20022.repository.msg.Intermediary8.ExtendedRole, com.tools20022.repository.msg.Intermediary9.Role, com.tools20022.repository.msg.Intermediary9.ExtendedRole,
						com.tools20022.repository.msg.StandingSettlementInstruction5.Counterparty, com.tools20022.repository.msg.StandingSettlementInstruction8.Counterparty, com.tools20022.repository.msg.Intermediary16.RoleType,
						com.tools20022.repository.msg.Intermediary19.Role, com.tools20022.repository.msg.Intermediary19.ExtendedRole, com.tools20022.repository.msg.Intermediary20.Role,
						com.tools20022.repository.msg.Intermediary20.ExtendedRole, com.tools20022.repository.msg.Intermediary24.Role, com.tools20022.repository.msg.Intermediary29.Role,
						com.tools20022.repository.msg.StandingSettlementInstruction11.Counterparty, com.tools20022.repository.msg.Intermediary36.Role, com.tools20022.repository.msg.StandingSettlementInstruction12.Counterparty,
						com.tools20022.repository.msg.Intermediary39.Role, com.tools20022.repository.msg.Intermediary40.Role, com.tools20022.repository.choice.InvestmentFundRole2Choice.Code,
						com.tools20022.repository.choice.InvestmentFundRole2Choice.Proprietary);
				subType_lazy = () -> Arrays.asList(InvestorRole.mmObject(), TradeOriginatorRole.mmObject(), SecuritiesTradePartyRole.mmObject(), BuyerRole.mmObject(), Borrower.mmObject(), SellerRole.mmObject(), Lender.mmObject(),
						TradeRegulator.mmObject(), Broker.mmObject(), TreasuryTradePartyRole.mmObject(), CommercialTradePartyRole.mmObject(), ClearingExceptionPartyRole.mmObject(), QualifiedForeignIntermediary.mmObject(),
						StockExchange.mmObject(), SellerBank.mmObject(), BuyerBank.mmObject(), AllocationPartyRole.mmObject());
				superType_lazy = () -> Role.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TradePartyRole.Account, com.tools20022.repository.entity.TradePartyRole.TradingPartyCapacity,
						com.tools20022.repository.entity.TradePartyRole.BuyerOrSeller, com.tools20022.repository.entity.TradePartyRole.Trade);
				derivationComponent_lazy = () -> Arrays.asList(Intermediary4.mmObject(), Intermediary10.mmObject(), ConfirmationPartyDetails4.mmObject(), Intermediary14.mmObject(), ConfirmationPartyDetails2.mmObject(),
						ConfirmationPartyDetails3.mmObject(), ConfirmationParties3.mmObject(), ConfirmationPartyDetails1.mmObject(), ConfirmationPartyDetails6.mmObject(), ConfirmationParties4.mmObject(),
						ConfirmationPartyDetails5.mmObject(), ConfirmationParties2.mmObject(), TradePartyIdentification2.mmObject(), TradePartyIdentification3.mmObject(), TradePartyIdentification5.mmObject(), Intermediary8.mmObject(),
						Intermediary9.mmObject(), TradePartyIdentification1.mmObject(), TradePartyIdentification4.mmObject(), Intermediary16.mmObject(), Intermediary19.mmObject(), Intermediary20.mmObject(), OptionParty1Choice.mmObject(),
						Intermediary29.mmObject(), TradePartyIdentification7.mmObject(), Intermediary39.mmObject(), Intermediary40.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}