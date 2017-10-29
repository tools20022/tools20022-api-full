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
import com.tools20022.repository.choice.MatchingSystemReference1Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the different identifications associated with a trade.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="TradeIdentification" src="doc-files/TradeIdentification.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradeIdentification#CounterpartyReference
 * TradeIdentification.CounterpartyReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradeIdentification#Identification
 * TradeIdentification.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradeIdentification#CommonIdentification
 * TradeIdentification.CommonIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradeIdentification#MatchingReference
 * TradeIdentification.MatchingReference}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradeIdentification#Trade
 * TradeIdentification.Trade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradeIdentification#UniqueTradeIdentifier
 * TradeIdentification.UniqueTradeIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradeIdentification#ClearingBrokerIdentification
 * TradeIdentification.ClearingBrokerIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Trade#TradeRelatedIdentifications
 * Trade.TradeRelatedIdentifications}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClearingBrokerIdentification#RelatedTradeIdentification
 * ClearingBrokerIdentification.RelatedTradeIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
 * SecuritiesTradeIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentIdentification
 * PaymentIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionReferences1
 * TransactionReferences1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionReferences2
 * TransactionReferences2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionReferences3
 * TransactionReferences3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UniqueTransactionIdentifier1
 * UniqueTransactionIdentifier1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MatchingSystemReference1Choice
 * MatchingSystemReference1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UniqueTransactionIdentifier2
 * UniqueTransactionIdentifier2}</li>
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
 * "TradeIdentification"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the different identifications associated with a trade."</li>
 * </ul>
 */
public class TradeIdentification {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Unambiguous identification of the trade allocated by the counterparty.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References11#CounterpartyReference
	 * References11.CounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer18#CounterpartyReference
	 * Transfer18.CounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer26#CounterpartyReference
	 * Transfer26.CounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer15#CounterpartyReference
	 * Transfer15.CounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer21#CounterpartyReference
	 * Transfer21.CounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer13#CounterpartyReference
	 * Transfer13.CounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer23#CounterpartyReference
	 * Transfer23.CounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer11#CounterpartyReference
	 * Transfer11.CounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer19#CounterpartyReference
	 * Transfer19.CounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer27#CounterpartyReference
	 * Transfer27.CounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer28#CounterpartyReference
	 * Transfer28.CounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer29#CounterpartyReference
	 * Transfer29.CounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountModification1#CounterpartyReference
	 * InvestmentAccountModification1.CounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOpening1#CounterpartyReference
	 * InvestmentAccountOpening1.CounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountManagementConfirmation2#CounterpartyReference
	 * AccountManagementConfirmation2.CounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction1#CounterpartyProprietaryTransactionIdentification
	 * ForeignExchangeSwapTransaction1.
	 * CounterpartyProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction1#CounterpartyProprietaryTransactionIdentification
	 * UnsecuredMarketTransaction1.
	 * CounterpartyProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction1#CounterpartyProprietaryTransactionIdentification
	 * OvernightIndexSwapTransaction1.
	 * CounterpartyProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction1#CounterpartyProprietaryTransactionIdentification
	 * SecuredMarketTransaction1.
	 * CounterpartyProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOpening2#CounterpartyReference
	 * InvestmentAccountOpening2.CounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer26#CounterpartyReference
	 * ISATransfer26.CounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer31#CounterpartyReference
	 * Transfer31.CounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer30#CounterpartyReference
	 * Transfer30.CounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountModification2#CounterpartyReference
	 * InvestmentAccountModification2.CounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountManagementConfirmation3#CounterpartyReference
	 * AccountManagementConfirmation3.CounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer32#CounterpartyReference
	 * Transfer32.CounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer33#CounterpartyReference
	 * Transfer33.CounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer22#CounterpartyReference
	 * ISATransfer22.CounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction2#CounterpartyProprietaryTransactionIdentification
	 * UnsecuredMarketTransaction2.
	 * CounterpartyProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction2#CounterpartyProprietaryTransactionIdentification
	 * ForeignExchangeSwapTransaction2.
	 * CounterpartyProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction2#CounterpartyProprietaryTransactionIdentification
	 * SecuredMarketTransaction2.
	 * CounterpartyProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction3#CounterpartyProprietaryTransactionIdentification
	 * UnsecuredMarketTransaction3.
	 * CounterpartyProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction3#CounterpartyProprietaryTransactionIdentification
	 * OvernightIndexSwapTransaction3.
	 * CounterpartyProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction3#CounterpartyProprietaryTransactionIdentification
	 * SecuredMarketTransaction3.
	 * CounterpartyProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOpening3#CounterpartyReference
	 * InvestmentAccountOpening3.CounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountModification3#CounterpartyReference
	 * InvestmentAccountModification3.CounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountManagementConfirmation4#CounterpartyReference
	 * AccountManagementConfirmation4.CounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation5#CounterpartyReference
	 * GeneralInformation5.CounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4#CounterpartyProprietaryTransactionIdentification
	 * SecuredMarketTransaction4.
	 * CounterpartyProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction3#CounterpartyProprietaryTransactionIdentification
	 * ForeignExchangeSwapTransaction3.
	 * CounterpartyProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction4#CounterpartyProprietaryTransactionIdentification
	 * OvernightIndexSwapTransaction4.
	 * CounterpartyProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4#CounterpartyProprietaryTransactionIdentification
	 * UnsecuredMarketTransaction4.
	 * CounterpartyProprietaryTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification
	 * TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the trade allocated by the counterparty."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CounterpartyReference = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.References11.CounterpartyReference, com.tools20022.repository.msg.Transfer18.CounterpartyReference,
					com.tools20022.repository.msg.Transfer26.CounterpartyReference, com.tools20022.repository.msg.Transfer15.CounterpartyReference, com.tools20022.repository.msg.Transfer21.CounterpartyReference,
					com.tools20022.repository.msg.Transfer13.CounterpartyReference, com.tools20022.repository.msg.Transfer23.CounterpartyReference, com.tools20022.repository.msg.Transfer11.CounterpartyReference,
					com.tools20022.repository.msg.Transfer19.CounterpartyReference, com.tools20022.repository.msg.Transfer27.CounterpartyReference, com.tools20022.repository.msg.Transfer28.CounterpartyReference,
					com.tools20022.repository.msg.Transfer29.CounterpartyReference, com.tools20022.repository.msg.InvestmentAccountModification1.CounterpartyReference,
					com.tools20022.repository.msg.InvestmentAccountOpening1.CounterpartyReference, com.tools20022.repository.msg.AccountManagementConfirmation2.CounterpartyReference,
					com.tools20022.repository.msg.ForeignExchangeSwapTransaction1.CounterpartyProprietaryTransactionIdentification, com.tools20022.repository.msg.UnsecuredMarketTransaction1.CounterpartyProprietaryTransactionIdentification,
					com.tools20022.repository.msg.OvernightIndexSwapTransaction1.CounterpartyProprietaryTransactionIdentification, com.tools20022.repository.msg.SecuredMarketTransaction1.CounterpartyProprietaryTransactionIdentification,
					com.tools20022.repository.msg.InvestmentAccountOpening2.CounterpartyReference, com.tools20022.repository.msg.ISATransfer26.CounterpartyReference, com.tools20022.repository.msg.Transfer31.CounterpartyReference,
					com.tools20022.repository.msg.Transfer30.CounterpartyReference, com.tools20022.repository.msg.InvestmentAccountModification2.CounterpartyReference,
					com.tools20022.repository.msg.AccountManagementConfirmation3.CounterpartyReference, com.tools20022.repository.msg.Transfer32.CounterpartyReference, com.tools20022.repository.msg.Transfer33.CounterpartyReference,
					com.tools20022.repository.msg.ISATransfer22.CounterpartyReference, com.tools20022.repository.msg.UnsecuredMarketTransaction2.CounterpartyProprietaryTransactionIdentification,
					com.tools20022.repository.msg.ForeignExchangeSwapTransaction2.CounterpartyProprietaryTransactionIdentification, com.tools20022.repository.msg.SecuredMarketTransaction2.CounterpartyProprietaryTransactionIdentification,
					com.tools20022.repository.msg.UnsecuredMarketTransaction3.CounterpartyProprietaryTransactionIdentification, com.tools20022.repository.msg.OvernightIndexSwapTransaction3.CounterpartyProprietaryTransactionIdentification,
					com.tools20022.repository.msg.SecuredMarketTransaction3.CounterpartyProprietaryTransactionIdentification, com.tools20022.repository.msg.InvestmentAccountOpening3.CounterpartyReference,
					com.tools20022.repository.msg.InvestmentAccountModification3.CounterpartyReference, com.tools20022.repository.msg.AccountManagementConfirmation4.CounterpartyReference,
					com.tools20022.repository.msg.GeneralInformation5.CounterpartyReference, com.tools20022.repository.msg.SecuredMarketTransaction4.CounterpartyProprietaryTransactionIdentification,
					com.tools20022.repository.msg.ForeignExchangeSwapTransaction3.CounterpartyProprietaryTransactionIdentification,
					com.tools20022.repository.msg.OvernightIndexSwapTransaction4.CounterpartyProprietaryTransactionIdentification, com.tools20022.repository.msg.UnsecuredMarketTransaction4.CounterpartyProprietaryTransactionIdentification);
			elementContext_lazy = () -> TradeIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CounterpartyReference";
			definition = "Unambiguous identification of the trade allocated by the counterparty.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Reference assigned to the trade by the investor or the trading party.
	 * This reference will be used throughout the trade life cycle to
	 * access/update the trade details.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification3#TransactionIdentification
	 * SettlementTypeAndIdentification3.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails41#OtherTransactionIdentification
	 * TransactionDetails41.OtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References1Choice#OtherTransactionIdentification
	 * References1Choice.OtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails25#TradeIdentification
	 * SecuritiesTradeDetails25.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails26#TradeIdentification
	 * SecuritiesTradeDetails26.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification13#TransactionIdentification
	 * SettlementTypeAndIdentification13.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification7#TransactionIdentification
	 * SettlementTypeAndIdentification7.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails43#OtherTransactionIdentification
	 * TransactionDetails43.OtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References12Choice#OtherTransactionIdentification
	 * References12Choice.OtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails27#TradeIdentification
	 * SecuritiesTradeDetails27.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References28Choice#OtherTransactionIdentification
	 * References28Choice.OtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails28#TradeIdentification
	 * SecuritiesTradeDetails28.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification2#TransactionIdentification
	 * SettlementTypeAndIdentification2.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification5#TransactionIdentification
	 * SettlementTypeAndIdentification5.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters3#PreviousPartialConfirmationIdentification
	 * AdditionalParameters3.PreviousPartialConfirmationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters7#PreviousPartialConfirmationIdentification
	 * AdditionalParameters7.PreviousPartialConfirmationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters8#PreviousPartialConfirmationIdentification
	 * AdditionalParameters8.PreviousPartialConfirmationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters9#PreviousPartialConfirmationIdentification
	 * AdditionalParameters9.PreviousPartialConfirmationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters10#PreviousPartialConfirmationIdentification
	 * AdditionalParameters10.PreviousPartialConfirmationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters11#PreviousPartialConfirmationIdentification
	 * AdditionalParameters11.PreviousPartialConfirmationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters2#PreviousPartialConfirmationIdentification
	 * AdditionalParameters2.PreviousPartialConfirmationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters6#PreviousPartialConfirmationIdentification
	 * AdditionalParameters6.PreviousPartialConfirmationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters12#PreviousPartialConfirmationIdentification
	 * AdditionalParameters12.PreviousPartialConfirmationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters13#PreviousPartialConfirmationIdentification
	 * AdditionalParameters13.PreviousPartialConfirmationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters18#PreviousPartialConfirmationIdentification
	 * AdditionalParameters18.PreviousPartialConfirmationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters19#PreviousPartialConfirmationIdentification
	 * AdditionalParameters19.PreviousPartialConfirmationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References14Choice#OtherTransactionIdentification
	 * References14Choice.OtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References16Choice#OtherTransactionIdentification
	 * References16Choice.OtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References25Choice#OtherTransactionIdentification
	 * References25Choice.OtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References32Choice#OtherTransactionIdentification
	 * References32Choice.OtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification14#TransactionIdentification
	 * SettlementTypeAndIdentification14.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References1#TradeIdentification
	 * References1.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References6Choice#TradeIdentification
	 * References6Choice.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References2#TradeIdentification
	 * References2.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References10Choice#TradeIdentification
	 * References10Choice.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References7#TradeIdentification
	 * References7.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References13Choice#TradeIdentification
	 * References13Choice.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References13Choice#OtherTransactionIdentification
	 * References13Choice.OtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References8#TradeIdentification
	 * References8.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References15Choice#TradeIdentification
	 * References15Choice.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References15Choice#OtherTransactionIdentification
	 * References15Choice.OtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References9#TradeIdentification
	 * References9.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References24Choice#TradeIdentification
	 * References24Choice.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References24Choice#OtherTransactionIdentification
	 * References24Choice.OtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References13#TradeIdentification
	 * References13.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References31Choice#TradeIdentification
	 * References31Choice.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References31Choice#OtherTransactionIdentification
	 * References31Choice.OtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails2#TradeIdentification
	 * SecuritiesTradeDetails2.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails16#TradeIdentification
	 * SecuritiesTradeDetails16.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters17#PreviousPartialConfirmationIdentification
	 * AdditionalParameters17.PreviousPartialConfirmationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters20#PreviousPartialConfirmationIdentification
	 * AdditionalParameters20.PreviousPartialConfirmationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails1#TradeIdentification
	 * SecuritiesTradeDetails1.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails15#TradeIdentification
	 * SecuritiesTradeDetails15.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails5#TradeIdentification
	 * TransactionDetails5.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails9#TradeIdentification
	 * TransactionDetails9.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails22#TradeIdentification
	 * TransactionDetails22.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails23#TradeIdentification
	 * TransactionDetails23.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails36#TradeIdentification
	 * TransactionDetails36.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails47#TradeIdentification
	 * TransactionDetails47.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails53#TradeIdentification
	 * TransactionDetails53.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails58#TradeIdentification
	 * TransactionDetails58.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction7#TradeIdentification
	 * Transaction7.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction8#TradeIdentification
	 * Transaction8.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction9#TradeIdentification
	 * Transaction9.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction10#TradeIdentification
	 * Transaction10.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction14#TradeIdentification
	 * Transaction14.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction12#TradeIdentification
	 * Transaction12.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction15#TradeIdentification
	 * Transaction15.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction16#TradeIdentification
	 * Transaction16.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction20#TradeIdentification
	 * Transaction20.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction19#TradeIdentification
	 * Transaction19.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction23#TradeIdentification
	 * Transaction23.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction22#TradeIdentification
	 * Transaction22.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction28#TradeIdentification
	 * Transaction28.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction27#TradeIdentification
	 * Transaction27.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction30#TradeIdentification
	 * Transaction30.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction31#TradeIdentification
	 * Transaction31.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction6#TradeIdentification
	 * Transaction6.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction11#TradeIdentification
	 * Transaction11.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction13#TradeIdentification
	 * Transaction13.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction17#TradeIdentification
	 * Transaction17.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction18#TradeIdentification
	 * Transaction18.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction21#TradeIdentification
	 * Transaction21.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction29#TradeIdentification
	 * Transaction29.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction32#TradeIdentification
	 * Transaction32.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification2#TradeIdentification
	 * Identification2.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference8Choice#InstructingPartyTransactionIdentification
	 * IdentificationReference8Choice.InstructingPartyTransactionIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference8Choice#ExecutingPartyTransactionIdentification
	 * IdentificationReference8Choice.ExecutingPartyTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference11Choice#InstructingPartyTransactionIdentification
	 * IdentificationReference11Choice.InstructingPartyTransactionIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference11Choice#ExecutingPartyTransactionIdentification
	 * IdentificationReference11Choice.ExecutingPartyTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TwoLegTransactionDetails1#OpeningLegIdentification
	 * TwoLegTransactionDetails1.OpeningLegIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TwoLegTransactionDetails1#ClosingLegIdentification
	 * TwoLegTransactionDetails1.ClosingLegIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange3#ContractIdentification
	 * CurrencyExchange3.ContractIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange5#ContractIdentification
	 * CurrencyExchange5.ContractIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeRateInformation1#ContractIdentification
	 * ExchangeRateInformation1.ContractIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation1#PaymentInformationIdentification
	 * PaymentInstructionInformation1.PaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation3#PaymentInformationIdentification
	 * PaymentInstructionInformation3.PaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeRate1#ContractIdentification
	 * ExchangeRate1.ContractIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction6#PaymentInformationIdentification
	 * PaymentInstruction6.PaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction9#PaymentInformationIdentification
	 * PaymentInstruction9.PaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation2#PaymentInformationIdentification
	 * PaymentInstructionInformation2.PaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation4#PaymentInformationIdentification
	 * PaymentInstructionInformation4.PaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction7#PaymentInformationIdentification
	 * PaymentInstruction7.PaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction10#PaymentInformationIdentification
	 * PaymentInstruction10.PaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation4#OriginalPaymentInformationIdentification
	 * OriginalPaymentInformation4.OriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction4#OriginalPaymentInformationIdentification
	 * OriginalPaymentInstruction4.OriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction8#OriginalPaymentInformationIdentification
	 * OriginalPaymentInstruction8.OriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation2#OriginalPaymentInformationIdentification
	 * OriginalPaymentInformation2.OriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction2#OriginalPaymentInformationIdentification
	 * OriginalPaymentInstruction2.OriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction7#OriginalPaymentInformationIdentification
	 * OriginalPaymentInstruction7.OriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation1#OriginalPaymentInformationIdentification
	 * OriginalPaymentInformation1.OriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction1#OriginalPaymentInformationIdentification
	 * OriginalPaymentInstruction1.OriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction6#OriginalPaymentInformationIdentification
	 * OriginalPaymentInstruction6.OriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingSystemReference1Choice#RelatedReference
	 * MatchingSystemReference1Choice.RelatedReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement9#RelatedReference
	 * TradeAgreement9.RelatedReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation5#OriginalPaymentInformationIdentification
	 * OriginalPaymentInformation5.OriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction5#OriginalPaymentInformationIdentification
	 * OriginalPaymentInstruction5.OriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction9#OriginalPaymentInformationIdentification
	 * OriginalPaymentInstruction9.OriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction5#PaymentInformationIdentification
	 * PaymentInstruction5.PaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction8#PaymentInformationIdentification
	 * PaymentInstruction8.PaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction11#PaymentInformationIdentification
	 * PaymentInstruction11.PaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1#DealReference
	 * IndividualOrderConfirmationStatusAndReason1.DealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason2#DealReference
	 * IndividualOrderStatusAndReason2.DealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference5#OtherReference
	 * MessageAndBusinessReference5.OtherReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference5#PreviousReference
	 * MessageAndBusinessReference5.PreviousReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference5#RelatedReference
	 * MessageAndBusinessReference5.RelatedReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference2#OtherReference
	 * MessageAndBusinessReference2.OtherReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference2#PreviousReference
	 * MessageAndBusinessReference2.PreviousReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference4#OtherReference
	 * MessageAndBusinessReference4.OtherReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference4#PreviousReference
	 * MessageAndBusinessReference4.PreviousReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference4#RelatedReference
	 * MessageAndBusinessReference4.RelatedReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference1#PreviousReference
	 * MessageAndBusinessReference1.PreviousReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference1#OtherReference
	 * MessageAndBusinessReference1.OtherReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference6#PreviousReference
	 * MessageAndBusinessReference6.PreviousReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference6#OtherReference
	 * MessageAndBusinessReference6.OtherReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference6#CancellationReference
	 * MessageAndBusinessReference6.CancellationReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails1#TradeReference
	 * TransactionDetails1.TradeReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails1#AssociatedTradeReference
	 * TransactionDetails1.AssociatedTradeReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails3#TradeReference
	 * TransactionDetails3.TradeReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails3#AssociatedTradeReference
	 * TransactionDetails3.AssociatedTradeReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails2#TradeReference
	 * TransactionDetails2.TradeReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeTransactionStatusAndReason1#TradeReference
	 * TradeTransactionStatusAndReason1.TradeReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeTransactionStatusAndReason2#TradeReference
	 * TradeTransactionStatusAndReason2.TradeReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2#ClosingLegIdentification
	 * SecuritiesFinancingTransactionDetails2.ClosingLegIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails8#TradeIdentification
	 * SecuritiesTradeDetails8.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails18#TradeIdentification
	 * SecuritiesTradeDetails18.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails4#TradeIdentification
	 * SecuritiesTradeDetails4.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails17#TradeIdentification
	 * SecuritiesTradeDetails17.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification7#TradeIdentification
	 * Identification7.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification4#TransactionIdentification
	 * SettlementTypeAndIdentification4.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References4Choice#OtherTransactionIdentification
	 * References4Choice.OtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References22Choice#OtherTransactionIdentification
	 * References22Choice.OtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References2Choice#OtherTransactionIdentification
	 * References2Choice.OtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification6#TradeIdentification
	 * Identification6.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationEntry2#Identification
	 * NotificationEntry2.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem3#Identification
	 * NotificationItem3.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItem1#OriginalItemIdentification
	 * OriginalItem1.OriginalItemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItem2#OriginalItemIdentification
	 * OriginalItem2.OriginalItemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItem2#OriginalEndToEndIdentification
	 * OriginalItem2.OriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus1#OriginalItemIdentification
	 * OriginalItemAndStatus1.OriginalItemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus2#OriginalItemIdentification
	 * OriginalItemAndStatus2.OriginalItemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation3#OriginalPaymentInformationCancellationIdentification
	 * OriginalPaymentInformation3.
	 * OriginalPaymentInformationCancellationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation3#OriginalPaymentInformationIdentification
	 * OriginalPaymentInformation3.OriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInitiation1#PaymentInformationIdentification
	 * CorrectivePaymentInitiation1.PaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6#ClosingLegIdentification
	 * SecuritiesFinancingTransactionDetails6.ClosingLegIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails9#TradeIdentification
	 * SecuritiesTradeDetails9.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails21#TradeIdentification
	 * SecuritiesTradeDetails21.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails10#TradeIdentification
	 * SecuritiesTradeDetails10.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails22#TradeIdentification
	 * SecuritiesTradeDetails22.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails23#TradeIdentification
	 * SecuritiesTradeDetails23.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails29#TradeIdentification
	 * SecuritiesTradeDetails29.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification5#TradeIdentification
	 * Identification5.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification8#TradeIdentification
	 * Identification8.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification11#TradeIdentification
	 * Identification11.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification13#TradeIdentification
	 * Identification13.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References8Choice#OtherTransactionIdentification
	 * References8Choice.OtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References17Choice#OtherTransactionIdentification
	 * References17Choice.OtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification6#TransactionIdentification
	 * SettlementTypeAndIdentification6.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References7Choice#OtherTransactionIdentification
	 * References7Choice.OtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References23Choice#OtherTransactionIdentification
	 * References23Choice.OtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References30Choice#OtherTransactionIdentification
	 * References30Choice.OtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification9#TradeIdentification
	 * Identification9.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction3#OriginalPaymentInformationIdentification
	 * OriginalPaymentInstruction3.OriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem4#Identification
	 * NotificationItem4.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus3#OriginalItemIdentification
	 * OriginalItemAndStatus3.OriginalItemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg2#TradeLegIdentification
	 * TradeLeg2.TradeLegIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg5#TradeLegIdentification
	 * TradeLeg5.TradeLegIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg3#TradeLegIdentification
	 * TradeLeg3.TradeLegIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg6#TradeLegIdentification
	 * TradeLeg6.TradeLegIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg4#TradeLegIdentification
	 * TradeLeg4.TradeLegIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg7#TradeLegIdentification
	 * TradeLeg7.TradeLegIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason3#DealReference
	 * IndividualOrderStatusAndReason3.DealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References34Choice#OtherTransactionIdentification
	 * References34Choice.OtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction25#TradeIdentification
	 * Transaction25.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References35Choice#TradeIdentification
	 * References35Choice.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification3#TradeIdentification
	 * Identification3.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters16#PreviousPartialConfirmationIdentification
	 * AdditionalParameters16.PreviousPartialConfirmationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference7#CancellationReference
	 * MessageAndBusinessReference7.CancellationReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References39Choice#PreviousReference
	 * References39Choice.PreviousReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References39Choice#OtherReference
	 * References39Choice.OtherReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails61#TradeIdentification
	 * TransactionDetails61.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction34#TradeIdentification
	 * Transaction34.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails64#OtherTransactionIdentification
	 * TransactionDetails64.OtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction35#TradeIdentification
	 * Transaction35.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction36#TradeIdentification
	 * Transaction36.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences4#PaymentInformationIdentification
	 * TransactionReferences4.PaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails31#TradeIdentification
	 * SecuritiesTradeDetails31.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33#TradeIdentification
	 * SecuritiesTradeDetails33.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails35#TradeIdentification
	 * SecuritiesTradeDetails35.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails36#TradeIdentification
	 * SecuritiesTradeDetails36.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails34#TradeIdentification
	 * SecuritiesTradeDetails34.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails32#TradeIdentification
	 * SecuritiesTradeDetails32.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References16#TradeIdentification
	 * References16.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails44#TradeIdentification
	 * SecuritiesTradeDetails44.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails43#TradeIdentification
	 * SecuritiesTradeDetails43.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails41#TradeIdentification
	 * SecuritiesTradeDetails41.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction38#TradeIdentification
	 * Transaction38.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails66#TradeIdentification
	 * TransactionDetails66.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails65#OtherTransactionIdentification
	 * TransactionDetails65.OtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails42#TradeIdentification
	 * SecuritiesTradeDetails42.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References17#TradeIdentification
	 * References17.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction39#TradeIdentification
	 * Transaction39.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails46#TradeIdentification
	 * SecuritiesTradeDetails46.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails47#TradeIdentification
	 * SecuritiesTradeDetails47.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction37#TradeIdentification
	 * Transaction37.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement12#RelatedReference
	 * TradeAgreement12.RelatedReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction16#PaymentInformationIdentification
	 * PaymentInstruction16.PaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction12#OriginalPaymentInformationIdentification
	 * OriginalPaymentInstruction12.OriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction11#OriginalPaymentInformationIdentification
	 * OriginalPaymentInstruction11.OriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction15#PaymentInformationIdentification
	 * PaymentInstruction15.PaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction13#OriginalPaymentInformationIdentification
	 * OriginalPaymentInstruction13.OriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction10#OriginalPaymentInformationIdentification
	 * OriginalPaymentInstruction10.OriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus4#OriginalItemIdentification
	 * OriginalItemAndStatus4.OriginalItemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem5#Identification
	 * NotificationItem5.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg8#TradeLegIdentification
	 * TradeLeg8.TradeLegIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction41#TradeIdentification
	 * Transaction41.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails70#TradeIdentification
	 * TransactionDetails70.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction40#TradeIdentification
	 * Transaction40.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg10#TradeLegIdentification
	 * TradeLeg10.TradeLegIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg9#TradeLegIdentification
	 * TradeLeg9.TradeLegIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction17#PaymentInformationIdentification
	 * PaymentInstruction17.PaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction14#OriginalPaymentInformationIdentification
	 * OriginalPaymentInstruction14.OriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction43#TradeIdentification
	 * Transaction43.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails71#TradeIdentification
	 * TransactionDetails71.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction42#TradeIdentification
	 * Transaction42.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction1#ProprietaryTransactionIdentification
	 * ForeignExchangeSwapTransaction1.ProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction1#ProprietaryTransactionIdentification
	 * UnsecuredMarketTransaction1.ProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction1#ProprietaryTransactionIdentification
	 * OvernightIndexSwapTransaction1.ProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction1#ProprietaryTransactionIdentification
	 * SecuredMarketTransaction1.ProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails49#TradeIdentification
	 * SecuritiesTradeDetails49.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction47#TradeIdentification
	 * Transaction47.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails76#OtherTransactionIdentification
	 * TransactionDetails76.OtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails79#TradeIdentification
	 * TransactionDetails79.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction45#TradeIdentification
	 * Transaction45.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction46#TradeIdentification
	 * Transaction46.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CertificateIdentification1#PaymentInformationIdentification
	 * CertificateIdentification1.PaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Trade2#ProductIdentification
	 * Trade2.ProductIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Trade1#ProductIdentification
	 * Trade1.ProductIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References45Choice#OtherTransactionIdentification
	 * References45Choice.OtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification18#TransactionIdentification
	 * SettlementTypeAndIdentification18.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails51#TradeIdentification
	 * SecuritiesTradeDetails51.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails53#TradeIdentification
	 * SecuritiesTradeDetails53.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters24#PreviousPartialConfirmationIdentification
	 * AdditionalParameters24.PreviousPartialConfirmationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters22#PreviousPartialConfirmationIdentification
	 * AdditionalParameters22.PreviousPartialConfirmationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters21#PreviousPartialConfirmationIdentification
	 * AdditionalParameters21.PreviousPartialConfirmationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails54#TradeIdentification
	 * SecuritiesTradeDetails54.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails52#TradeIdentification
	 * SecuritiesTradeDetails52.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References46Choice#TradeIdentification
	 * References46Choice.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References46Choice#OtherTransactionIdentification
	 * References46Choice.OtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification15#TradeIdentification
	 * Identification15.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails50#TradeIdentification
	 * SecuritiesTradeDetails50.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References41Choice#OtherTransactionIdentification
	 * References41Choice.OtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References44Choice#OtherTransactionIdentification
	 * References44Choice.OtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References47Choice#OtherTransactionIdentification
	 * References47Choice.OtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References18#TradeIdentification
	 * References18.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction18#PaymentInformationIdentification
	 * PaymentInstruction18.PaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction16#OriginalPaymentInformationIdentification
	 * OriginalPaymentInstruction16.OriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction18#OriginalPaymentInformationIdentification
	 * OriginalPaymentInstruction18.OriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction19#PaymentInformationIdentification
	 * PaymentInstruction19.PaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction20#PaymentInformationIdentification
	 * PaymentInstruction20.PaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction15#OriginalPaymentInformationIdentification
	 * OriginalPaymentInstruction15.OriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus5#OriginalItemIdentification
	 * OriginalItemAndStatus5.OriginalItemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction17#OriginalPaymentInformationIdentification
	 * OriginalPaymentInstruction17.OriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem6#Identification
	 * NotificationItem6.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification20#TransactionIdentification
	 * SettlementTypeAndIdentification20.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference8#CancellationReference
	 * MessageAndBusinessReference8.CancellationReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References48Choice#PreviousReference
	 * References48Choice.PreviousReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References48Choice#OtherReference
	 * References48Choice.OtherReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction19#OriginalPaymentInformationIdentification
	 * OriginalPaymentInstruction19.OriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification21#TransactionIdentification
	 * SettlementTypeAndIdentification21.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References60Choice#OtherTransactionIdentification
	 * References60Choice.OtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction49#TradeIdentification
	 * Transaction49.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters26#PreviousPartialConfirmationIdentification
	 * AdditionalParameters26.PreviousPartialConfirmationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails61#TradeIdentification
	 * SecuritiesTradeDetails61.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters25#PreviousPartialConfirmationIdentification
	 * AdditionalParameters25.PreviousPartialConfirmationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63#TradeIdentification
	 * SecuritiesTradeDetails63.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails62#TradeIdentification
	 * SecuritiesTradeDetails62.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters27#PreviousPartialConfirmationIdentification
	 * AdditionalParameters27.PreviousPartialConfirmationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails85#OtherTransactionIdentification
	 * TransactionDetails85.OtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails87#TradeIdentification
	 * TransactionDetails87.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails60#TradeIdentification
	 * SecuritiesTradeDetails60.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References58Choice#OtherTransactionIdentification
	 * References58Choice.OtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification24#TradeIdentification
	 * Identification24.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction50#TradeIdentification
	 * Transaction50.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References50Choice#OtherTransactionIdentification
	 * References50Choice.OtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction48#TradeIdentification
	 * Transaction48.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References21#TradeIdentification
	 * References21.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification22#TransactionIdentification
	 * SettlementTypeAndIdentification22.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails65#TradeIdentification
	 * SecuritiesTradeDetails65.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References59Choice#OtherTransactionIdentification
	 * References59Choice.OtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References54Choice#TradeIdentification
	 * References54Choice.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References54Choice#OtherTransactionIdentification
	 * References54Choice.OtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails66#TradeIdentification
	 * SecuritiesTradeDetails66.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction2#ProprietaryTransactionIdentification
	 * UnsecuredMarketTransaction2.ProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction2#ProprietaryTransactionIdentification
	 * ForeignExchangeSwapTransaction2.ProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction2#ProprietaryTransactionIdentification
	 * SecuredMarketTransaction2.ProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction3#ProprietaryTransactionIdentification
	 * UnsecuredMarketTransaction3.ProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction3#ProprietaryTransactionIdentification
	 * OvernightIndexSwapTransaction3.ProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction3#ProprietaryTransactionIdentification
	 * SecuredMarketTransaction3.ProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason2#DealReference
	 * IndividualOrderConfirmationStatusAndReason2.DealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference10#Reference
	 * MessageAndBusinessReference10.Reference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference10#RelatedReference
	 * MessageAndBusinessReference10.RelatedReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason7#DealReference
	 * IndividualOrderStatusAndReason7.DealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionReport4#TransactionIdentification
	 * SecuritiesTransactionReport4.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction21#PaymentInformationIdentification
	 * PaymentInstruction21.PaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction23#OriginalPaymentInformationIdentification
	 * OriginalPaymentInstruction23.OriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction21#OriginalPaymentInformationIdentification
	 * OriginalPaymentInstruction21.OriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction23#PaymentInformationIdentification
	 * PaymentInstruction23.PaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction24#OriginalPaymentInformationIdentification
	 * OriginalPaymentInstruction24.OriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22#PaymentInformationIdentification
	 * PaymentInstruction22.PaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction22#OriginalPaymentInformationIdentification
	 * OriginalPaymentInstruction22.OriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction20#OriginalPaymentInformationIdentification
	 * OriginalPaymentInstruction20.OriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInitiation2#PaymentInformationIdentification
	 * CorrectivePaymentInitiation2.PaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters29#PreviousPartialConfirmationIdentification
	 * AdditionalParameters29.PreviousPartialConfirmationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails67#TradeIdentification
	 * SecuritiesTradeDetails67.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction53#TradeIdentification
	 * Transaction53.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#TradeIdentification
	 * SecuritiesTradeDetails68.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails97#TradeIdentification
	 * TransactionDetails97.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction54#TradeIdentification
	 * Transaction54.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction52#TradeIdentification
	 * Transaction52.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails69#TradeIdentification
	 * SecuritiesTradeDetails69.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters31#PreviousPartialConfirmationIdentification
	 * AdditionalParameters31.PreviousPartialConfirmationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction57#TradeIdentification
	 * Transaction57.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails70#TradeIdentification
	 * SecuritiesTradeDetails70.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction56#TradeIdentification
	 * Transaction56.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails100#TradeIdentification
	 * TransactionDetails100.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction55#TradeIdentification
	 * Transaction55.TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails101#OtherTransactionIdentification
	 * TransactionDetails101.OtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FixingConditions1#OriginatorReference
	 * FixingConditions1.OriginatorReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4#ProprietaryTransactionIdentification
	 * SecuredMarketTransaction4.ProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4#RelatedProprietaryTransactionIdentification
	 * SecuredMarketTransaction4.RelatedProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction3#ProprietaryTransactionIdentification
	 * ForeignExchangeSwapTransaction3.ProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction3#RelatedProprietaryTransactionIdentification
	 * ForeignExchangeSwapTransaction3.
	 * RelatedProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction4#ProprietaryTransactionIdentification
	 * OvernightIndexSwapTransaction4.ProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction4#RelatedProprietaryTransactionIdentification
	 * OvernightIndexSwapTransaction4.
	 * RelatedProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4#ProprietaryTransactionIdentification
	 * UnsecuredMarketTransaction4.ProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4#RelatedProprietaryTransactionIdentification
	 * UnsecuredMarketTransaction4.RelatedProprietaryTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification
	 * TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference assigned to the trade by the investor or the trading party. This reference will be used throughout the trade life cycle to access/update the trade details."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Identification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementTypeAndIdentification3.TransactionIdentification, com.tools20022.repository.msg.TransactionDetails41.OtherTransactionIdentification,
					com.tools20022.repository.choice.References1Choice.OtherTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails25.TradeIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails26.TradeIdentification, com.tools20022.repository.msg.SettlementTypeAndIdentification13.TransactionIdentification,
					com.tools20022.repository.msg.SettlementTypeAndIdentification7.TransactionIdentification, com.tools20022.repository.msg.TransactionDetails43.OtherTransactionIdentification,
					com.tools20022.repository.choice.References12Choice.OtherTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails27.TradeIdentification,
					com.tools20022.repository.choice.References28Choice.OtherTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails28.TradeIdentification,
					com.tools20022.repository.msg.SettlementTypeAndIdentification2.TransactionIdentification, com.tools20022.repository.msg.SettlementTypeAndIdentification5.TransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters3.PreviousPartialConfirmationIdentification, com.tools20022.repository.msg.AdditionalParameters7.PreviousPartialConfirmationIdentification,
					com.tools20022.repository.msg.AdditionalParameters8.PreviousPartialConfirmationIdentification, com.tools20022.repository.msg.AdditionalParameters9.PreviousPartialConfirmationIdentification,
					com.tools20022.repository.msg.AdditionalParameters10.PreviousPartialConfirmationIdentification, com.tools20022.repository.msg.AdditionalParameters11.PreviousPartialConfirmationIdentification,
					com.tools20022.repository.msg.AdditionalParameters2.PreviousPartialConfirmationIdentification, com.tools20022.repository.msg.AdditionalParameters6.PreviousPartialConfirmationIdentification,
					com.tools20022.repository.msg.AdditionalParameters12.PreviousPartialConfirmationIdentification, com.tools20022.repository.msg.AdditionalParameters13.PreviousPartialConfirmationIdentification,
					com.tools20022.repository.msg.AdditionalParameters18.PreviousPartialConfirmationIdentification, com.tools20022.repository.msg.AdditionalParameters19.PreviousPartialConfirmationIdentification,
					com.tools20022.repository.choice.References14Choice.OtherTransactionIdentification, com.tools20022.repository.choice.References16Choice.OtherTransactionIdentification,
					com.tools20022.repository.choice.References25Choice.OtherTransactionIdentification, com.tools20022.repository.choice.References32Choice.OtherTransactionIdentification,
					com.tools20022.repository.msg.SettlementTypeAndIdentification14.TransactionIdentification, com.tools20022.repository.msg.References1.TradeIdentification,
					com.tools20022.repository.choice.References6Choice.TradeIdentification, com.tools20022.repository.msg.References2.TradeIdentification, com.tools20022.repository.choice.References10Choice.TradeIdentification,
					com.tools20022.repository.msg.References7.TradeIdentification, com.tools20022.repository.choice.References13Choice.TradeIdentification, com.tools20022.repository.choice.References13Choice.OtherTransactionIdentification,
					com.tools20022.repository.msg.References8.TradeIdentification, com.tools20022.repository.choice.References15Choice.TradeIdentification, com.tools20022.repository.choice.References15Choice.OtherTransactionIdentification,
					com.tools20022.repository.msg.References9.TradeIdentification, com.tools20022.repository.choice.References24Choice.TradeIdentification, com.tools20022.repository.choice.References24Choice.OtherTransactionIdentification,
					com.tools20022.repository.msg.References13.TradeIdentification, com.tools20022.repository.choice.References31Choice.TradeIdentification,
					com.tools20022.repository.choice.References31Choice.OtherTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails2.TradeIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails16.TradeIdentification, com.tools20022.repository.msg.AdditionalParameters17.PreviousPartialConfirmationIdentification,
					com.tools20022.repository.msg.AdditionalParameters20.PreviousPartialConfirmationIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails1.TradeIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails15.TradeIdentification, com.tools20022.repository.msg.TransactionDetails5.TradeIdentification, com.tools20022.repository.msg.TransactionDetails9.TradeIdentification,
					com.tools20022.repository.msg.TransactionDetails22.TradeIdentification, com.tools20022.repository.msg.TransactionDetails23.TradeIdentification, com.tools20022.repository.msg.TransactionDetails36.TradeIdentification,
					com.tools20022.repository.msg.TransactionDetails47.TradeIdentification, com.tools20022.repository.msg.TransactionDetails53.TradeIdentification, com.tools20022.repository.msg.TransactionDetails58.TradeIdentification,
					com.tools20022.repository.msg.Transaction7.TradeIdentification, com.tools20022.repository.msg.Transaction8.TradeIdentification, com.tools20022.repository.msg.Transaction9.TradeIdentification,
					com.tools20022.repository.msg.Transaction10.TradeIdentification, com.tools20022.repository.msg.Transaction14.TradeIdentification, com.tools20022.repository.msg.Transaction12.TradeIdentification,
					com.tools20022.repository.msg.Transaction15.TradeIdentification, com.tools20022.repository.msg.Transaction16.TradeIdentification, com.tools20022.repository.msg.Transaction20.TradeIdentification,
					com.tools20022.repository.msg.Transaction19.TradeIdentification, com.tools20022.repository.msg.Transaction23.TradeIdentification, com.tools20022.repository.msg.Transaction22.TradeIdentification,
					com.tools20022.repository.msg.Transaction28.TradeIdentification, com.tools20022.repository.msg.Transaction27.TradeIdentification, com.tools20022.repository.msg.Transaction30.TradeIdentification,
					com.tools20022.repository.msg.Transaction31.TradeIdentification, com.tools20022.repository.msg.Transaction6.TradeIdentification, com.tools20022.repository.msg.Transaction11.TradeIdentification,
					com.tools20022.repository.msg.Transaction13.TradeIdentification, com.tools20022.repository.msg.Transaction17.TradeIdentification, com.tools20022.repository.msg.Transaction18.TradeIdentification,
					com.tools20022.repository.msg.Transaction21.TradeIdentification, com.tools20022.repository.msg.Transaction29.TradeIdentification, com.tools20022.repository.msg.Transaction32.TradeIdentification,
					com.tools20022.repository.msg.Identification2.TradeIdentification, com.tools20022.repository.choice.IdentificationReference8Choice.InstructingPartyTransactionIdentification,
					com.tools20022.repository.choice.IdentificationReference8Choice.ExecutingPartyTransactionIdentification, com.tools20022.repository.choice.IdentificationReference11Choice.InstructingPartyTransactionIdentification,
					com.tools20022.repository.choice.IdentificationReference11Choice.ExecutingPartyTransactionIdentification, com.tools20022.repository.msg.TwoLegTransactionDetails1.OpeningLegIdentification,
					com.tools20022.repository.msg.TwoLegTransactionDetails1.ClosingLegIdentification, com.tools20022.repository.msg.CurrencyExchange3.ContractIdentification,
					com.tools20022.repository.msg.CurrencyExchange5.ContractIdentification, com.tools20022.repository.msg.ExchangeRateInformation1.ContractIdentification,
					com.tools20022.repository.msg.PaymentInstructionInformation1.PaymentInformationIdentification, com.tools20022.repository.msg.PaymentInstructionInformation3.PaymentInformationIdentification,
					com.tools20022.repository.msg.ExchangeRate1.ContractIdentification, com.tools20022.repository.msg.PaymentInstruction6.PaymentInformationIdentification,
					com.tools20022.repository.msg.PaymentInstruction9.PaymentInformationIdentification, com.tools20022.repository.msg.PaymentInstructionInformation2.PaymentInformationIdentification,
					com.tools20022.repository.msg.PaymentInstructionInformation4.PaymentInformationIdentification, com.tools20022.repository.msg.PaymentInstruction7.PaymentInformationIdentification,
					com.tools20022.repository.msg.PaymentInstruction10.PaymentInformationIdentification, com.tools20022.repository.msg.OriginalPaymentInformation4.OriginalPaymentInformationIdentification,
					com.tools20022.repository.msg.OriginalPaymentInstruction4.OriginalPaymentInformationIdentification, com.tools20022.repository.msg.OriginalPaymentInstruction8.OriginalPaymentInformationIdentification,
					com.tools20022.repository.msg.OriginalPaymentInformation2.OriginalPaymentInformationIdentification, com.tools20022.repository.msg.OriginalPaymentInstruction2.OriginalPaymentInformationIdentification,
					com.tools20022.repository.msg.OriginalPaymentInstruction7.OriginalPaymentInformationIdentification, com.tools20022.repository.msg.OriginalPaymentInformation1.OriginalPaymentInformationIdentification,
					com.tools20022.repository.msg.OriginalPaymentInstruction1.OriginalPaymentInformationIdentification, com.tools20022.repository.msg.OriginalPaymentInstruction6.OriginalPaymentInformationIdentification,
					com.tools20022.repository.choice.MatchingSystemReference1Choice.RelatedReference, com.tools20022.repository.msg.TradeAgreement9.RelatedReference,
					com.tools20022.repository.msg.OriginalPaymentInformation5.OriginalPaymentInformationIdentification, com.tools20022.repository.msg.OriginalPaymentInstruction5.OriginalPaymentInformationIdentification,
					com.tools20022.repository.msg.OriginalPaymentInstruction9.OriginalPaymentInformationIdentification, com.tools20022.repository.msg.PaymentInstruction5.PaymentInformationIdentification,
					com.tools20022.repository.msg.PaymentInstruction8.PaymentInformationIdentification, com.tools20022.repository.msg.PaymentInstruction11.PaymentInformationIdentification,
					com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1.DealReference, com.tools20022.repository.msg.IndividualOrderStatusAndReason2.DealReference,
					com.tools20022.repository.msg.MessageAndBusinessReference5.OtherReference, com.tools20022.repository.msg.MessageAndBusinessReference5.PreviousReference,
					com.tools20022.repository.msg.MessageAndBusinessReference5.RelatedReference, com.tools20022.repository.msg.MessageAndBusinessReference2.OtherReference,
					com.tools20022.repository.msg.MessageAndBusinessReference2.PreviousReference, com.tools20022.repository.msg.MessageAndBusinessReference4.OtherReference,
					com.tools20022.repository.msg.MessageAndBusinessReference4.PreviousReference, com.tools20022.repository.msg.MessageAndBusinessReference4.RelatedReference,
					com.tools20022.repository.msg.MessageAndBusinessReference1.PreviousReference, com.tools20022.repository.msg.MessageAndBusinessReference1.OtherReference,
					com.tools20022.repository.msg.MessageAndBusinessReference6.PreviousReference, com.tools20022.repository.msg.MessageAndBusinessReference6.OtherReference,
					com.tools20022.repository.msg.MessageAndBusinessReference6.CancellationReference, com.tools20022.repository.msg.TransactionDetails1.TradeReference,
					com.tools20022.repository.msg.TransactionDetails1.AssociatedTradeReference, com.tools20022.repository.msg.TransactionDetails3.TradeReference, com.tools20022.repository.msg.TransactionDetails3.AssociatedTradeReference,
					com.tools20022.repository.msg.TransactionDetails2.TradeReference, com.tools20022.repository.msg.TradeTransactionStatusAndReason1.TradeReference,
					com.tools20022.repository.msg.TradeTransactionStatusAndReason2.TradeReference, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2.ClosingLegIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails8.TradeIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails18.TradeIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails4.TradeIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails17.TradeIdentification, com.tools20022.repository.msg.Identification7.TradeIdentification,
					com.tools20022.repository.msg.SettlementTypeAndIdentification4.TransactionIdentification, com.tools20022.repository.choice.References4Choice.OtherTransactionIdentification,
					com.tools20022.repository.choice.References22Choice.OtherTransactionIdentification, com.tools20022.repository.choice.References2Choice.OtherTransactionIdentification,
					com.tools20022.repository.msg.Identification6.TradeIdentification, com.tools20022.repository.msg.NotificationEntry2.Identification, com.tools20022.repository.msg.NotificationItem3.Identification,
					com.tools20022.repository.msg.OriginalItem1.OriginalItemIdentification, com.tools20022.repository.msg.OriginalItem2.OriginalItemIdentification, com.tools20022.repository.msg.OriginalItem2.OriginalEndToEndIdentification,
					com.tools20022.repository.msg.OriginalItemAndStatus1.OriginalItemIdentification, com.tools20022.repository.msg.OriginalItemAndStatus2.OriginalItemIdentification,
					com.tools20022.repository.msg.OriginalPaymentInformation3.OriginalPaymentInformationCancellationIdentification, com.tools20022.repository.msg.OriginalPaymentInformation3.OriginalPaymentInformationIdentification,
					com.tools20022.repository.msg.CorrectivePaymentInitiation1.PaymentInformationIdentification, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6.ClosingLegIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails9.TradeIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails21.TradeIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails10.TradeIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails22.TradeIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails23.TradeIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails29.TradeIdentification, com.tools20022.repository.msg.Identification5.TradeIdentification,
					com.tools20022.repository.msg.Identification8.TradeIdentification, com.tools20022.repository.msg.Identification11.TradeIdentification, com.tools20022.repository.msg.Identification13.TradeIdentification,
					com.tools20022.repository.choice.References8Choice.OtherTransactionIdentification, com.tools20022.repository.choice.References17Choice.OtherTransactionIdentification,
					com.tools20022.repository.msg.SettlementTypeAndIdentification6.TransactionIdentification, com.tools20022.repository.choice.References7Choice.OtherTransactionIdentification,
					com.tools20022.repository.choice.References23Choice.OtherTransactionIdentification, com.tools20022.repository.choice.References30Choice.OtherTransactionIdentification,
					com.tools20022.repository.msg.Identification9.TradeIdentification, com.tools20022.repository.msg.OriginalPaymentInstruction3.OriginalPaymentInformationIdentification,
					com.tools20022.repository.msg.NotificationItem4.Identification, com.tools20022.repository.msg.OriginalItemAndStatus3.OriginalItemIdentification, com.tools20022.repository.msg.TradeLeg2.TradeLegIdentification,
					com.tools20022.repository.msg.TradeLeg5.TradeLegIdentification, com.tools20022.repository.msg.TradeLeg3.TradeLegIdentification, com.tools20022.repository.msg.TradeLeg6.TradeLegIdentification,
					com.tools20022.repository.msg.TradeLeg4.TradeLegIdentification, com.tools20022.repository.msg.TradeLeg7.TradeLegIdentification, com.tools20022.repository.msg.IndividualOrderStatusAndReason3.DealReference,
					com.tools20022.repository.choice.References34Choice.OtherTransactionIdentification, com.tools20022.repository.msg.Transaction25.TradeIdentification,
					com.tools20022.repository.choice.References35Choice.TradeIdentification, com.tools20022.repository.msg.Identification3.TradeIdentification,
					com.tools20022.repository.msg.AdditionalParameters16.PreviousPartialConfirmationIdentification, com.tools20022.repository.msg.MessageAndBusinessReference7.CancellationReference,
					com.tools20022.repository.choice.References39Choice.PreviousReference, com.tools20022.repository.choice.References39Choice.OtherReference, com.tools20022.repository.msg.TransactionDetails61.TradeIdentification,
					com.tools20022.repository.msg.Transaction34.TradeIdentification, com.tools20022.repository.msg.TransactionDetails64.OtherTransactionIdentification, com.tools20022.repository.msg.Transaction35.TradeIdentification,
					com.tools20022.repository.msg.Transaction36.TradeIdentification, com.tools20022.repository.msg.TransactionReferences4.PaymentInformationIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails31.TradeIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails33.TradeIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails35.TradeIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails36.TradeIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails34.TradeIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails32.TradeIdentification, com.tools20022.repository.msg.References16.TradeIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails44.TradeIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails43.TradeIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails41.TradeIdentification, com.tools20022.repository.msg.Transaction38.TradeIdentification, com.tools20022.repository.msg.TransactionDetails66.TradeIdentification,
					com.tools20022.repository.msg.TransactionDetails65.OtherTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails42.TradeIdentification,
					com.tools20022.repository.msg.References17.TradeIdentification, com.tools20022.repository.msg.Transaction39.TradeIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails46.TradeIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails47.TradeIdentification, com.tools20022.repository.msg.Transaction37.TradeIdentification, com.tools20022.repository.msg.TradeAgreement12.RelatedReference,
					com.tools20022.repository.msg.PaymentInstruction16.PaymentInformationIdentification, com.tools20022.repository.msg.OriginalPaymentInstruction12.OriginalPaymentInformationIdentification,
					com.tools20022.repository.msg.OriginalPaymentInstruction11.OriginalPaymentInformationIdentification, com.tools20022.repository.msg.PaymentInstruction15.PaymentInformationIdentification,
					com.tools20022.repository.msg.OriginalPaymentInstruction13.OriginalPaymentInformationIdentification, com.tools20022.repository.msg.OriginalPaymentInstruction10.OriginalPaymentInformationIdentification,
					com.tools20022.repository.msg.OriginalItemAndStatus4.OriginalItemIdentification, com.tools20022.repository.msg.NotificationItem5.Identification, com.tools20022.repository.msg.TradeLeg8.TradeLegIdentification,
					com.tools20022.repository.msg.Transaction41.TradeIdentification, com.tools20022.repository.msg.TransactionDetails70.TradeIdentification, com.tools20022.repository.msg.Transaction40.TradeIdentification,
					com.tools20022.repository.msg.TradeLeg10.TradeLegIdentification, com.tools20022.repository.msg.TradeLeg9.TradeLegIdentification, com.tools20022.repository.msg.PaymentInstruction17.PaymentInformationIdentification,
					com.tools20022.repository.msg.OriginalPaymentInstruction14.OriginalPaymentInformationIdentification, com.tools20022.repository.msg.Transaction43.TradeIdentification,
					com.tools20022.repository.msg.TransactionDetails71.TradeIdentification, com.tools20022.repository.msg.Transaction42.TradeIdentification,
					com.tools20022.repository.msg.ForeignExchangeSwapTransaction1.ProprietaryTransactionIdentification, com.tools20022.repository.msg.UnsecuredMarketTransaction1.ProprietaryTransactionIdentification,
					com.tools20022.repository.msg.OvernightIndexSwapTransaction1.ProprietaryTransactionIdentification, com.tools20022.repository.msg.SecuredMarketTransaction1.ProprietaryTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails49.TradeIdentification, com.tools20022.repository.msg.Transaction47.TradeIdentification,
					com.tools20022.repository.msg.TransactionDetails76.OtherTransactionIdentification, com.tools20022.repository.msg.TransactionDetails79.TradeIdentification, com.tools20022.repository.msg.Transaction45.TradeIdentification,
					com.tools20022.repository.msg.Transaction46.TradeIdentification, com.tools20022.repository.msg.CertificateIdentification1.PaymentInformationIdentification, com.tools20022.repository.msg.Trade2.ProductIdentification,
					com.tools20022.repository.msg.Trade1.ProductIdentification, com.tools20022.repository.choice.References45Choice.OtherTransactionIdentification,
					com.tools20022.repository.msg.SettlementTypeAndIdentification18.TransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails51.TradeIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails53.TradeIdentification, com.tools20022.repository.msg.AdditionalParameters24.PreviousPartialConfirmationIdentification,
					com.tools20022.repository.msg.AdditionalParameters22.PreviousPartialConfirmationIdentification, com.tools20022.repository.msg.AdditionalParameters21.PreviousPartialConfirmationIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails54.TradeIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails52.TradeIdentification,
					com.tools20022.repository.choice.References46Choice.TradeIdentification, com.tools20022.repository.choice.References46Choice.OtherTransactionIdentification,
					com.tools20022.repository.msg.Identification15.TradeIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails50.TradeIdentification,
					com.tools20022.repository.choice.References41Choice.OtherTransactionIdentification, com.tools20022.repository.choice.References44Choice.OtherTransactionIdentification,
					com.tools20022.repository.choice.References47Choice.OtherTransactionIdentification, com.tools20022.repository.msg.References18.TradeIdentification,
					com.tools20022.repository.msg.PaymentInstruction18.PaymentInformationIdentification, com.tools20022.repository.msg.OriginalPaymentInstruction16.OriginalPaymentInformationIdentification,
					com.tools20022.repository.msg.OriginalPaymentInstruction18.OriginalPaymentInformationIdentification, com.tools20022.repository.msg.PaymentInstruction19.PaymentInformationIdentification,
					com.tools20022.repository.msg.PaymentInstruction20.PaymentInformationIdentification, com.tools20022.repository.msg.OriginalPaymentInstruction15.OriginalPaymentInformationIdentification,
					com.tools20022.repository.msg.OriginalItemAndStatus5.OriginalItemIdentification, com.tools20022.repository.msg.OriginalPaymentInstruction17.OriginalPaymentInformationIdentification,
					com.tools20022.repository.msg.NotificationItem6.Identification, com.tools20022.repository.msg.SettlementTypeAndIdentification20.TransactionIdentification,
					com.tools20022.repository.msg.MessageAndBusinessReference8.CancellationReference, com.tools20022.repository.choice.References48Choice.PreviousReference,
					com.tools20022.repository.choice.References48Choice.OtherReference, com.tools20022.repository.msg.OriginalPaymentInstruction19.OriginalPaymentInformationIdentification,
					com.tools20022.repository.msg.SettlementTypeAndIdentification21.TransactionIdentification, com.tools20022.repository.choice.References60Choice.OtherTransactionIdentification,
					com.tools20022.repository.msg.Transaction49.TradeIdentification, com.tools20022.repository.msg.AdditionalParameters26.PreviousPartialConfirmationIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails61.TradeIdentification, com.tools20022.repository.msg.AdditionalParameters25.PreviousPartialConfirmationIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails63.TradeIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails62.TradeIdentification,
					com.tools20022.repository.msg.AdditionalParameters27.PreviousPartialConfirmationIdentification, com.tools20022.repository.msg.TransactionDetails85.OtherTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails87.TradeIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails60.TradeIdentification,
					com.tools20022.repository.choice.References58Choice.OtherTransactionIdentification, com.tools20022.repository.msg.Identification24.TradeIdentification, com.tools20022.repository.msg.Transaction50.TradeIdentification,
					com.tools20022.repository.choice.References50Choice.OtherTransactionIdentification, com.tools20022.repository.msg.Transaction48.TradeIdentification, com.tools20022.repository.msg.References21.TradeIdentification,
					com.tools20022.repository.msg.SettlementTypeAndIdentification22.TransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails65.TradeIdentification,
					com.tools20022.repository.choice.References59Choice.OtherTransactionIdentification, com.tools20022.repository.choice.References54Choice.TradeIdentification,
					com.tools20022.repository.choice.References54Choice.OtherTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails66.TradeIdentification,
					com.tools20022.repository.msg.UnsecuredMarketTransaction2.ProprietaryTransactionIdentification, com.tools20022.repository.msg.ForeignExchangeSwapTransaction2.ProprietaryTransactionIdentification,
					com.tools20022.repository.msg.SecuredMarketTransaction2.ProprietaryTransactionIdentification, com.tools20022.repository.msg.UnsecuredMarketTransaction3.ProprietaryTransactionIdentification,
					com.tools20022.repository.msg.OvernightIndexSwapTransaction3.ProprietaryTransactionIdentification, com.tools20022.repository.msg.SecuredMarketTransaction3.ProprietaryTransactionIdentification,
					com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason2.DealReference, com.tools20022.repository.msg.MessageAndBusinessReference10.Reference,
					com.tools20022.repository.msg.MessageAndBusinessReference10.RelatedReference, com.tools20022.repository.msg.IndividualOrderStatusAndReason7.DealReference,
					com.tools20022.repository.msg.SecuritiesTransactionReport4.TransactionIdentification, com.tools20022.repository.msg.PaymentInstruction21.PaymentInformationIdentification,
					com.tools20022.repository.msg.OriginalPaymentInstruction23.OriginalPaymentInformationIdentification, com.tools20022.repository.msg.OriginalPaymentInstruction21.OriginalPaymentInformationIdentification,
					com.tools20022.repository.msg.PaymentInstruction23.PaymentInformationIdentification, com.tools20022.repository.msg.OriginalPaymentInstruction24.OriginalPaymentInformationIdentification,
					com.tools20022.repository.msg.PaymentInstruction22.PaymentInformationIdentification, com.tools20022.repository.msg.OriginalPaymentInstruction22.OriginalPaymentInformationIdentification,
					com.tools20022.repository.msg.OriginalPaymentInstruction20.OriginalPaymentInformationIdentification, com.tools20022.repository.msg.CorrectivePaymentInitiation2.PaymentInformationIdentification,
					com.tools20022.repository.msg.AdditionalParameters29.PreviousPartialConfirmationIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails67.TradeIdentification,
					com.tools20022.repository.msg.Transaction53.TradeIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails68.TradeIdentification, com.tools20022.repository.msg.TransactionDetails97.TradeIdentification,
					com.tools20022.repository.msg.Transaction54.TradeIdentification, com.tools20022.repository.msg.Transaction52.TradeIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails69.TradeIdentification,
					com.tools20022.repository.msg.AdditionalParameters31.PreviousPartialConfirmationIdentification, com.tools20022.repository.msg.Transaction57.TradeIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails70.TradeIdentification, com.tools20022.repository.msg.Transaction56.TradeIdentification, com.tools20022.repository.msg.TransactionDetails100.TradeIdentification,
					com.tools20022.repository.msg.Transaction55.TradeIdentification, com.tools20022.repository.msg.TransactionDetails101.OtherTransactionIdentification, com.tools20022.repository.msg.FixingConditions1.OriginatorReference,
					com.tools20022.repository.msg.SecuredMarketTransaction4.ProprietaryTransactionIdentification, com.tools20022.repository.msg.SecuredMarketTransaction4.RelatedProprietaryTransactionIdentification,
					com.tools20022.repository.msg.ForeignExchangeSwapTransaction3.ProprietaryTransactionIdentification, com.tools20022.repository.msg.ForeignExchangeSwapTransaction3.RelatedProprietaryTransactionIdentification,
					com.tools20022.repository.msg.OvernightIndexSwapTransaction4.ProprietaryTransactionIdentification, com.tools20022.repository.msg.OvernightIndexSwapTransaction4.RelatedProprietaryTransactionIdentification,
					com.tools20022.repository.msg.UnsecuredMarketTransaction4.ProprietaryTransactionIdentification, com.tools20022.repository.msg.UnsecuredMarketTransaction4.RelatedProprietaryTransactionIdentification);
			elementContext_lazy = () -> TradeIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Reference assigned to the trade by the investor or the trading party. This reference will be used throughout the trade life cycle to access/update the trade details.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Unique reference agreed upon by the two trade counterparties to identify
	 * the trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters6#CommonIdentification
	 * SettlementTypeAndAdditionalParameters6.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters5#CommonIdentification
	 * SettlementTypeAndAdditionalParameters5.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters7#CommonIdentification
	 * SettlementTypeAndAdditionalParameters7.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters8#CommonIdentification
	 * SettlementTypeAndAdditionalParameters8.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters3#CommonIdentification
	 * TransactionTypeAndAdditionalParameters3.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters6#CommonIdentification
	 * TransactionTypeAndAdditionalParameters6.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters1#CommonIdentification
	 * TransactionTypeAndAdditionalParameters1.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters4#CommonIdentification
	 * TransactionTypeAndAdditionalParameters4.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References1#CommonIdentification
	 * References1.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References6Choice#CommonIdentification
	 * References6Choice.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References2#CommonIdentification
	 * References2.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References10Choice#CommonIdentification
	 * References10Choice.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References7#CommonIdentification
	 * References7.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References13Choice#CommonIdentification
	 * References13Choice.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References8#CommonIdentification
	 * References8.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References15Choice#CommonIdentification
	 * References15Choice.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References9#CommonIdentification
	 * References9.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References24Choice#CommonIdentification
	 * References24Choice.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References13#CommonIdentification
	 * References13.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References31Choice#CommonIdentification
	 * References31Choice.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification1#CommonIdentification
	 * SettlementTypeAndIdentification1.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification8#CommonIdentification
	 * SettlementTypeAndIdentification8.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification9#CommonIdentification
	 * SettlementTypeAndIdentification9.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification11#CommonIdentification
	 * SettlementTypeAndIdentification11.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification15#CommonIdentification
	 * SettlementTypeAndIdentification15.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification17#CommonIdentification
	 * SettlementTypeAndIdentification17.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification10#CommonIdentification
	 * SettlementTypeAndIdentification10.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification12#CommonIdentification
	 * SettlementTypeAndIdentification12.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters1#CommonIdentification
	 * SettlementTypeAndAdditionalParameters1.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters4#CommonIdentification
	 * SettlementTypeAndAdditionalParameters4.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters9#CommonIdentification
	 * SettlementTypeAndAdditionalParameters9.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters10#CommonIdentification
	 * SettlementTypeAndAdditionalParameters10.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications2#CommonIdentification
	 * TransactionIdentifications2.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications7#CommonIdentification
	 * TransactionIdentifications7.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications9#CommonIdentification
	 * TransactionIdentifications9.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications13#CommonIdentification
	 * TransactionIdentifications13.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications16#CommonIdentification
	 * TransactionIdentifications16.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications22#CommonIdentification
	 * TransactionIdentifications22.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction7#CommonIdentification
	 * Transaction7.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction8#CommonIdentification
	 * Transaction8.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction9#CommonIdentification
	 * Transaction9.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction10#CommonIdentification
	 * Transaction10.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction14#CommonIdentification
	 * Transaction14.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction12#CommonIdentification
	 * Transaction12.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction15#CommonIdentification
	 * Transaction15.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction16#CommonIdentification
	 * Transaction16.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction20#CommonIdentification
	 * Transaction20.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction19#CommonIdentification
	 * Transaction19.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction23#CommonIdentification
	 * Transaction23.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction22#CommonIdentification
	 * Transaction22.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction28#CommonIdentification
	 * Transaction28.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction27#CommonIdentification
	 * Transaction27.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction30#CommonIdentification
	 * Transaction30.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction31#CommonIdentification
	 * Transaction31.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction6#CommonIdentification
	 * Transaction6.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction11#CommonIdentification
	 * Transaction11.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction13#CommonIdentification
	 * Transaction13.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction17#CommonIdentification
	 * Transaction17.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction18#CommonIdentification
	 * Transaction18.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction21#CommonIdentification
	 * Transaction21.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction29#CommonIdentification
	 * Transaction29.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction32#CommonIdentification
	 * Transaction32.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification2#CommonIdentification
	 * Identification2.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference8Choice#CommonIdentification
	 * IdentificationReference8Choice.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference11Choice#CommonIdentification
	 * IdentificationReference11Choice.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement2#CommonReference
	 * TradeAgreement2.CommonReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement4#CommonReference
	 * TradeAgreement4.CommonReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement8#CommonReference
	 * TradeAgreement8.CommonReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement1#CommonReference
	 * TradeAgreement1.CommonReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement3#CommonReference
	 * TradeAgreement3.CommonReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement7#CommonReference
	 * TradeAgreement7.CommonReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement5#CommonReference
	 * TradeAgreement5.CommonReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement9#CommonReference
	 * TradeAgreement9.CommonReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails7#CommonIdentification
	 * SecuritiesTradeDetails7.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails19#CommonIdentification
	 * SecuritiesTradeDetails19.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters2#CommonIdentification
	 * TransactionTypeAndAdditionalParameters2.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters7#CommonIdentification
	 * TransactionTypeAndAdditionalParameters7.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications1#CommonIdentification
	 * TransactionIdentifications1.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters2#CommonIdentification
	 * SettlementTypeAndAdditionalParameters2.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails4#CommonIdentification
	 * SecuritiesTradeDetails4.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails17#CommonIdentification
	 * SecuritiesTradeDetails17.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification7#CommonIdentification
	 * Identification7.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification6#CommonIdentification
	 * Identification6.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OpeningData1#CommonReference
	 * OpeningData1.CommonReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ClosingData1#CommonReference
	 * ClosingData1.CommonReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OpeningData2#CommonReference
	 * OpeningData2.CommonReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ClosingData2#CommonReference
	 * ClosingData2.CommonReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OptionData1#CommonReference
	 * OptionData1.CommonReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OptionData2#CommonReference
	 * OptionData2.CommonReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters5#CommonIdentification
	 * TransactionTypeAndAdditionalParameters5.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters8#CommonIdentification
	 * TransactionTypeAndAdditionalParameters8.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications6#CommonIdentification
	 * TransactionIdentifications6.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters3#CommonIdentification
	 * SettlementTypeAndAdditionalParameters3.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails10#CommonIdentification
	 * SecuritiesTradeDetails10.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails22#CommonIdentification
	 * SecuritiesTradeDetails22.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails23#CommonIdentification
	 * SecuritiesTradeDetails23.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails29#CommonIdentification
	 * SecuritiesTradeDetails29.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification5#CommonIdentification
	 * Identification5.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification8#CommonIdentification
	 * Identification8.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification11#CommonIdentification
	 * Identification11.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification13#CommonIdentification
	 * Identification13.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification9#CommonIdentification
	 * Identification9.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails14#CommonIdentification
	 * SecuritiesTradeDetails14.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails20#CommonIdentification
	 * SecuritiesTradeDetails20.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails24#CommonIdentification
	 * SecuritiesTradeDetails24.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails30#CommonIdentification
	 * SecuritiesTradeDetails30.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction25#CommonIdentification
	 * Transaction25.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References35Choice#CommonIdentification
	 * References35Choice.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification3#CommonIdentification
	 * Identification3.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OptionData3#CommonReference
	 * OptionData3.CommonReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OptionData4#CommonReference
	 * OptionData4.CommonReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction34#CommonIdentification
	 * Transaction34.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction35#CommonIdentification
	 * Transaction35.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction36#CommonIdentification
	 * Transaction36.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails35#CommonIdentification
	 * SecuritiesTradeDetails35.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References16#CommonIdentification
	 * References16.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction38#CommonIdentification
	 * Transaction38.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails42#CommonIdentification
	 * SecuritiesTradeDetails42.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References17#CommonIdentification
	 * References17.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction39#CommonIdentification
	 * Transaction39.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction37#CommonIdentification
	 * Transaction37.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement11#CommonReference
	 * TradeAgreement11.CommonReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement12#CommonReference
	 * TradeAgreement12.CommonReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement10#CommonReference
	 * TradeAgreement10.CommonReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction41#CommonIdentification
	 * Transaction41.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction40#CommonIdentification
	 * Transaction40.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction43#CommonIdentification
	 * Transaction43.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction42#CommonIdentification
	 * Transaction42.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransaction1#TradePlaceMatchingIdentification
	 * SecuritiesTransaction1.TradePlaceMatchingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransaction1#ComplexTradeComponentIdentification
	 * SecuritiesTransaction1.ComplexTradeComponentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails49#CommonIdentification
	 * SecuritiesTradeDetails49.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction47#CommonIdentification
	 * Transaction47.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48#CommonIdentification
	 * SecuritiesTradeDetails48.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction45#CommonIdentification
	 * Transaction45.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction46#CommonIdentification
	 * Transaction46.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification19#CommonIdentification
	 * SettlementTypeAndIdentification19.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications31#CommonIdentification
	 * TransactionIdentifications31.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters10#CommonIdentification
	 * TransactionTypeAndAdditionalParameters10.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters11#CommonIdentification
	 * SettlementTypeAndAdditionalParameters11.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters9#CommonIdentification
	 * TransactionTypeAndAdditionalParameters9.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters11#CommonIdentification
	 * TransactionTypeAndAdditionalParameters11.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters12#CommonIdentification
	 * SettlementTypeAndAdditionalParameters12.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications32#CommonIdentification
	 * TransactionIdentifications32.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters14#CommonIdentification
	 * SettlementTypeAndAdditionalParameters14.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References46Choice#CommonIdentification
	 * References46Choice.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification15#CommonIdentification
	 * Identification15.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters13#CommonIdentification
	 * SettlementTypeAndAdditionalParameters13.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References18#CommonIdentification
	 * References18.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails57#CommonIdentification
	 * SecuritiesTradeDetails57.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters13#CommonIdentification
	 * TransactionTypeAndAdditionalParameters13.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications35#CommonIdentification
	 * TransactionIdentifications35.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction49#CommonIdentification
	 * Transaction49.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters14#CommonIdentification
	 * TransactionTypeAndAdditionalParameters14.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters12#CommonIdentification
	 * TransactionTypeAndAdditionalParameters12.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails61#CommonIdentification
	 * SecuritiesTradeDetails61.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters16#CommonIdentification
	 * SettlementTypeAndAdditionalParameters16.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification24#CommonIdentification
	 * SettlementTypeAndIdentification24.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications38#CommonIdentification
	 * TransactionIdentifications38.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters15#CommonIdentification
	 * SettlementTypeAndAdditionalParameters15.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification24#CommonIdentification
	 * Identification24.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction50#CommonIdentification
	 * Transaction50.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction48#CommonIdentification
	 * Transaction48.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters18#CommonIdentification
	 * SettlementTypeAndAdditionalParameters18.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References21#CommonIdentification
	 * References21.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters17#CommonIdentification
	 * SettlementTypeAndAdditionalParameters17.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References54Choice#CommonIdentification
	 * References54Choice.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement15#CommonReference
	 * TradeAgreement15.CommonReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement14#CommonReference
	 * TradeAgreement14.CommonReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters19#CommonIdentification
	 * SettlementTypeAndAdditionalParameters19.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction53#CommonIdentification
	 * Transaction53.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#CommonIdentification
	 * SecuritiesTradeDetails68.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters15#CommonIdentification
	 * TransactionTypeAndAdditionalParameters15.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters17#CommonIdentification
	 * TransactionTypeAndAdditionalParameters17.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters16#CommonIdentification
	 * TransactionTypeAndAdditionalParameters16.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction54#CommonIdentification
	 * Transaction54.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction52#CommonIdentification
	 * Transaction52.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters19#CommonIdentification
	 * TransactionTypeAndAdditionalParameters19.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails69#CommonIdentification
	 * SecuritiesTradeDetails69.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters20#CommonIdentification
	 * TransactionTypeAndAdditionalParameters20.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction57#CommonIdentification
	 * Transaction57.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters18#CommonIdentification
	 * TransactionTypeAndAdditionalParameters18.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters20#CommonIdentification
	 * SettlementTypeAndAdditionalParameters20.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction56#CommonIdentification
	 * Transaction56.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction55#CommonIdentification
	 * Transaction55.CommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FixingConditions1#CommonReference
	 * FixingConditions1.CommonReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification
	 * TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommonIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique reference agreed upon by the two trade counterparties to identify the trade."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CommonIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters6.CommonIdentification, com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters5.CommonIdentification,
					com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters7.CommonIdentification, com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters8.CommonIdentification,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters3.CommonIdentification, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters6.CommonIdentification,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters1.CommonIdentification, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters4.CommonIdentification,
					com.tools20022.repository.msg.References1.CommonIdentification, com.tools20022.repository.choice.References6Choice.CommonIdentification, com.tools20022.repository.msg.References2.CommonIdentification,
					com.tools20022.repository.choice.References10Choice.CommonIdentification, com.tools20022.repository.msg.References7.CommonIdentification, com.tools20022.repository.choice.References13Choice.CommonIdentification,
					com.tools20022.repository.msg.References8.CommonIdentification, com.tools20022.repository.choice.References15Choice.CommonIdentification, com.tools20022.repository.msg.References9.CommonIdentification,
					com.tools20022.repository.choice.References24Choice.CommonIdentification, com.tools20022.repository.msg.References13.CommonIdentification, com.tools20022.repository.choice.References31Choice.CommonIdentification,
					com.tools20022.repository.msg.SettlementTypeAndIdentification1.CommonIdentification, com.tools20022.repository.msg.SettlementTypeAndIdentification8.CommonIdentification,
					com.tools20022.repository.msg.SettlementTypeAndIdentification9.CommonIdentification, com.tools20022.repository.msg.SettlementTypeAndIdentification11.CommonIdentification,
					com.tools20022.repository.msg.SettlementTypeAndIdentification15.CommonIdentification, com.tools20022.repository.msg.SettlementTypeAndIdentification17.CommonIdentification,
					com.tools20022.repository.msg.SettlementTypeAndIdentification10.CommonIdentification, com.tools20022.repository.msg.SettlementTypeAndIdentification12.CommonIdentification,
					com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters1.CommonIdentification, com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters4.CommonIdentification,
					com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters9.CommonIdentification, com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters10.CommonIdentification,
					com.tools20022.repository.msg.TransactionIdentifications2.CommonIdentification, com.tools20022.repository.msg.TransactionIdentifications7.CommonIdentification,
					com.tools20022.repository.msg.TransactionIdentifications9.CommonIdentification, com.tools20022.repository.msg.TransactionIdentifications13.CommonIdentification,
					com.tools20022.repository.msg.TransactionIdentifications16.CommonIdentification, com.tools20022.repository.msg.TransactionIdentifications22.CommonIdentification,
					com.tools20022.repository.msg.Transaction7.CommonIdentification, com.tools20022.repository.msg.Transaction8.CommonIdentification, com.tools20022.repository.msg.Transaction9.CommonIdentification,
					com.tools20022.repository.msg.Transaction10.CommonIdentification, com.tools20022.repository.msg.Transaction14.CommonIdentification, com.tools20022.repository.msg.Transaction12.CommonIdentification,
					com.tools20022.repository.msg.Transaction15.CommonIdentification, com.tools20022.repository.msg.Transaction16.CommonIdentification, com.tools20022.repository.msg.Transaction20.CommonIdentification,
					com.tools20022.repository.msg.Transaction19.CommonIdentification, com.tools20022.repository.msg.Transaction23.CommonIdentification, com.tools20022.repository.msg.Transaction22.CommonIdentification,
					com.tools20022.repository.msg.Transaction28.CommonIdentification, com.tools20022.repository.msg.Transaction27.CommonIdentification, com.tools20022.repository.msg.Transaction30.CommonIdentification,
					com.tools20022.repository.msg.Transaction31.CommonIdentification, com.tools20022.repository.msg.Transaction6.CommonIdentification, com.tools20022.repository.msg.Transaction11.CommonIdentification,
					com.tools20022.repository.msg.Transaction13.CommonIdentification, com.tools20022.repository.msg.Transaction17.CommonIdentification, com.tools20022.repository.msg.Transaction18.CommonIdentification,
					com.tools20022.repository.msg.Transaction21.CommonIdentification, com.tools20022.repository.msg.Transaction29.CommonIdentification, com.tools20022.repository.msg.Transaction32.CommonIdentification,
					com.tools20022.repository.msg.Identification2.CommonIdentification, com.tools20022.repository.choice.IdentificationReference8Choice.CommonIdentification,
					com.tools20022.repository.choice.IdentificationReference11Choice.CommonIdentification, com.tools20022.repository.msg.TradeAgreement2.CommonReference, com.tools20022.repository.msg.TradeAgreement4.CommonReference,
					com.tools20022.repository.msg.TradeAgreement8.CommonReference, com.tools20022.repository.msg.TradeAgreement1.CommonReference, com.tools20022.repository.msg.TradeAgreement3.CommonReference,
					com.tools20022.repository.msg.TradeAgreement7.CommonReference, com.tools20022.repository.msg.TradeAgreement5.CommonReference, com.tools20022.repository.msg.TradeAgreement9.CommonReference,
					com.tools20022.repository.msg.SecuritiesTradeDetails7.CommonIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails19.CommonIdentification,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters2.CommonIdentification, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters7.CommonIdentification,
					com.tools20022.repository.msg.TransactionIdentifications1.CommonIdentification, com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters2.CommonIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails4.CommonIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails17.CommonIdentification,
					com.tools20022.repository.msg.Identification7.CommonIdentification, com.tools20022.repository.msg.Identification6.CommonIdentification, com.tools20022.repository.msg.OpeningData1.CommonReference,
					com.tools20022.repository.msg.ClosingData1.CommonReference, com.tools20022.repository.msg.OpeningData2.CommonReference, com.tools20022.repository.msg.ClosingData2.CommonReference,
					com.tools20022.repository.msg.OptionData1.CommonReference, com.tools20022.repository.msg.OptionData2.CommonReference, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters5.CommonIdentification,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters8.CommonIdentification, com.tools20022.repository.msg.TransactionIdentifications6.CommonIdentification,
					com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters3.CommonIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails10.CommonIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails22.CommonIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails23.CommonIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails29.CommonIdentification, com.tools20022.repository.msg.Identification5.CommonIdentification, com.tools20022.repository.msg.Identification8.CommonIdentification,
					com.tools20022.repository.msg.Identification11.CommonIdentification, com.tools20022.repository.msg.Identification13.CommonIdentification, com.tools20022.repository.msg.Identification9.CommonIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails14.CommonIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails20.CommonIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails24.CommonIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails30.CommonIdentification, com.tools20022.repository.msg.Transaction25.CommonIdentification,
					com.tools20022.repository.choice.References35Choice.CommonIdentification, com.tools20022.repository.msg.Identification3.CommonIdentification, com.tools20022.repository.msg.OptionData3.CommonReference,
					com.tools20022.repository.msg.OptionData4.CommonReference, com.tools20022.repository.msg.Transaction34.CommonIdentification, com.tools20022.repository.msg.Transaction35.CommonIdentification,
					com.tools20022.repository.msg.Transaction36.CommonIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails35.CommonIdentification, com.tools20022.repository.msg.References16.CommonIdentification,
					com.tools20022.repository.msg.Transaction38.CommonIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails42.CommonIdentification, com.tools20022.repository.msg.References17.CommonIdentification,
					com.tools20022.repository.msg.Transaction39.CommonIdentification, com.tools20022.repository.msg.Transaction37.CommonIdentification, com.tools20022.repository.msg.TradeAgreement11.CommonReference,
					com.tools20022.repository.msg.TradeAgreement12.CommonReference, com.tools20022.repository.msg.TradeAgreement10.CommonReference, com.tools20022.repository.msg.Transaction41.CommonIdentification,
					com.tools20022.repository.msg.Transaction40.CommonIdentification, com.tools20022.repository.msg.Transaction43.CommonIdentification, com.tools20022.repository.msg.Transaction42.CommonIdentification,
					com.tools20022.repository.msg.SecuritiesTransaction1.TradePlaceMatchingIdentification, com.tools20022.repository.msg.SecuritiesTransaction1.ComplexTradeComponentIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails49.CommonIdentification, com.tools20022.repository.msg.Transaction47.CommonIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails48.CommonIdentification,
					com.tools20022.repository.msg.Transaction45.CommonIdentification, com.tools20022.repository.msg.Transaction46.CommonIdentification, com.tools20022.repository.msg.SettlementTypeAndIdentification19.CommonIdentification,
					com.tools20022.repository.msg.TransactionIdentifications31.CommonIdentification, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters10.CommonIdentification,
					com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters11.CommonIdentification, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters9.CommonIdentification,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters11.CommonIdentification, com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters12.CommonIdentification,
					com.tools20022.repository.msg.TransactionIdentifications32.CommonIdentification, com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters14.CommonIdentification,
					com.tools20022.repository.choice.References46Choice.CommonIdentification, com.tools20022.repository.msg.Identification15.CommonIdentification,
					com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters13.CommonIdentification, com.tools20022.repository.msg.References18.CommonIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails57.CommonIdentification, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters13.CommonIdentification,
					com.tools20022.repository.msg.TransactionIdentifications35.CommonIdentification, com.tools20022.repository.msg.Transaction49.CommonIdentification,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters14.CommonIdentification, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters12.CommonIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails61.CommonIdentification, com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters16.CommonIdentification,
					com.tools20022.repository.msg.SettlementTypeAndIdentification24.CommonIdentification, com.tools20022.repository.msg.TransactionIdentifications38.CommonIdentification,
					com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters15.CommonIdentification, com.tools20022.repository.msg.Identification24.CommonIdentification,
					com.tools20022.repository.msg.Transaction50.CommonIdentification, com.tools20022.repository.msg.Transaction48.CommonIdentification,
					com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters18.CommonIdentification, com.tools20022.repository.msg.References21.CommonIdentification,
					com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters17.CommonIdentification, com.tools20022.repository.choice.References54Choice.CommonIdentification,
					com.tools20022.repository.msg.TradeAgreement15.CommonReference, com.tools20022.repository.msg.TradeAgreement14.CommonReference, com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters19.CommonIdentification,
					com.tools20022.repository.msg.Transaction53.CommonIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails68.CommonIdentification,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters15.CommonIdentification, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters17.CommonIdentification,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters16.CommonIdentification, com.tools20022.repository.msg.Transaction54.CommonIdentification,
					com.tools20022.repository.msg.Transaction52.CommonIdentification, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters19.CommonIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails69.CommonIdentification, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters20.CommonIdentification,
					com.tools20022.repository.msg.Transaction57.CommonIdentification, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters18.CommonIdentification,
					com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters20.CommonIdentification, com.tools20022.repository.msg.Transaction56.CommonIdentification,
					com.tools20022.repository.msg.Transaction55.CommonIdentification, com.tools20022.repository.msg.FixingConditions1.CommonReference);
			elementContext_lazy = () -> TradeIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CommonIdentification";
			definition = "Unique reference agreed upon by the two trade counterparties to identify the trade.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Reference assigned by a matching system when the trade is matched.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData8#MatchingSystemUniqueReference
	 * TradeData8.MatchingSystemUniqueReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData8#MatchingSystemMatchingReference
	 * TradeData8.MatchingSystemMatchingReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData8#MatchingSystemMatchedSideReference
	 * TradeData8.MatchingSystemMatchedSideReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingSystemReference1Choice#MatchingSystemUniqueReference
	 * MatchingSystemReference1Choice.MatchingSystemUniqueReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement8#MatchingSystemReference
	 * TradeAgreement8.MatchingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData9#MatchingSystemUniqueReference
	 * TradeData9.MatchingSystemUniqueReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData9#MatchingSystemMatchingReference
	 * TradeData9.MatchingSystemMatchingReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData9#MatchingSystemMatchedSideReference
	 * TradeData9.MatchingSystemMatchedSideReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData7#MatchingSystemUniqueReference
	 * TradeData7.MatchingSystemUniqueReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData7#MatchingSystemMatchingReference
	 * TradeData7.MatchingSystemMatchingReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData7#MatchingSystemMatchedSideReference
	 * TradeData7.MatchingSystemMatchedSideReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeStatus1#MatchingSystemUniqueReference
	 * TradeStatus1.MatchingSystemUniqueReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement11#MatchingSystemReference
	 * TradeAgreement11.MatchingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData11#MatchingSystemUniqueReference
	 * TradeData11.MatchingSystemUniqueReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData11#MatchingSystemMatchingReference
	 * TradeData11.MatchingSystemMatchingReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData11#MatchingSystemMatchedSideReference
	 * TradeData11.MatchingSystemMatchedSideReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData14#MatchingSystemUniqueReference
	 * TradeData14.MatchingSystemUniqueReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData14#MatchingSystemMatchingReference
	 * TradeData14.MatchingSystemMatchingReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData14#MatchingSystemMatchedSideReference
	 * TradeData14.MatchingSystemMatchedSideReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement15#MatchingSystemReference
	 * TradeAgreement15.MatchingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData15#MatchingSystemUniqueReference
	 * TradeData15.MatchingSystemUniqueReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData15#MatchingSystemMatchingReference
	 * TradeData15.MatchingSystemMatchingReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData15#MatchingSystemMatchedSideReference
	 * TradeData15.MatchingSystemMatchedSideReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData16#MatchingSystemUniqueReference
	 * TradeData16.MatchingSystemUniqueReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData16#MatchingSystemMatchingReference
	 * TradeData16.MatchingSystemMatchingReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData16#MatchingSystemMatchedSideReference
	 * TradeData16.MatchingSystemMatchedSideReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification
	 * TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchingReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference assigned by a matching system when the trade is matched."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MatchingReference = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeData8.MatchingSystemUniqueReference, com.tools20022.repository.msg.TradeData8.MatchingSystemMatchingReference,
					com.tools20022.repository.msg.TradeData8.MatchingSystemMatchedSideReference, com.tools20022.repository.choice.MatchingSystemReference1Choice.MatchingSystemUniqueReference,
					com.tools20022.repository.msg.TradeAgreement8.MatchingSystemReference, com.tools20022.repository.msg.TradeData9.MatchingSystemUniqueReference, com.tools20022.repository.msg.TradeData9.MatchingSystemMatchingReference,
					com.tools20022.repository.msg.TradeData9.MatchingSystemMatchedSideReference, com.tools20022.repository.msg.TradeData7.MatchingSystemUniqueReference,
					com.tools20022.repository.msg.TradeData7.MatchingSystemMatchingReference, com.tools20022.repository.msg.TradeData7.MatchingSystemMatchedSideReference,
					com.tools20022.repository.msg.TradeStatus1.MatchingSystemUniqueReference, com.tools20022.repository.msg.TradeAgreement11.MatchingSystemReference, com.tools20022.repository.msg.TradeData11.MatchingSystemUniqueReference,
					com.tools20022.repository.msg.TradeData11.MatchingSystemMatchingReference, com.tools20022.repository.msg.TradeData11.MatchingSystemMatchedSideReference,
					com.tools20022.repository.msg.TradeData14.MatchingSystemUniqueReference, com.tools20022.repository.msg.TradeData14.MatchingSystemMatchingReference,
					com.tools20022.repository.msg.TradeData14.MatchingSystemMatchedSideReference, com.tools20022.repository.msg.TradeAgreement15.MatchingSystemReference,
					com.tools20022.repository.msg.TradeData15.MatchingSystemUniqueReference, com.tools20022.repository.msg.TradeData15.MatchingSystemMatchingReference,
					com.tools20022.repository.msg.TradeData15.MatchingSystemMatchedSideReference, com.tools20022.repository.msg.TradeData16.MatchingSystemUniqueReference,
					com.tools20022.repository.msg.TradeData16.MatchingSystemMatchingReference, com.tools20022.repository.msg.TradeData16.MatchingSystemMatchedSideReference);
			elementContext_lazy = () -> TradeIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MatchingReference";
			definition = "Reference assigned by a matching system when the trade is matched.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Specifies the trade for which identifications are provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Trade#TradeRelatedIdentifications
	 * Trade.TradeRelatedIdentifications}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Trade Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification
	 * TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Trade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the trade for which identifications are provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Trade = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> TradeIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Trade";
			definition = "Specifies the trade for which identifications are provided.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Trade.TradeRelatedIdentifications;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * This field specifies the unique transaction identifier (UTI) to be
	 * created at the time a transaction is first executed, shared with all
	 * registered entities and counterparties involved in the transaction, and
	 * used to track that particular transaction over its life. This identifier
	 * can also be known as the Unique Swap Identifier (USI).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UniqueTransactionIdentifier1#UniqueTransactionIdentifier
	 * UniqueTransactionIdentifier1.UniqueTransactionIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UniqueTransactionIdentifier1#PriorUniqueTransactionIdentifier
	 * UniqueTransactionIdentifier1.PriorUniqueTransactionIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting1#TradingSideUniqueTransactionIdentifier
	 * RegulatoryReporting1.TradingSideUniqueTransactionIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UniqueTransactionIdentifier2#UniqueTransactionIdentifier
	 * UniqueTransactionIdentifier2.UniqueTransactionIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UniqueTransactionIdentifier2#PriorUniqueTransactionIdentifier
	 * UniqueTransactionIdentifier2.PriorUniqueTransactionIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction1#UniqueTransactionIdentifier
	 * ForeignExchangeSwapTransaction1.UniqueTransactionIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction1#UniqueTransactionIdentifier
	 * UnsecuredMarketTransaction1.UniqueTransactionIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction1#UniqueTransactionIdentifier
	 * OvernightIndexSwapTransaction1.UniqueTransactionIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction1#UniqueTransactionIdentifier
	 * SecuredMarketTransaction1.UniqueTransactionIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionReport2#TransactionIdentification
	 * SecuritiesTransactionReport2.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction2#UniqueTransactionIdentifier
	 * UnsecuredMarketTransaction2.UniqueTransactionIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction2#UniqueTransactionIdentifier
	 * ForeignExchangeSwapTransaction2.UniqueTransactionIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction2#UniqueTransactionIdentifier
	 * SecuredMarketTransaction2.UniqueTransactionIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction3#UniqueTransactionIdentifier
	 * UnsecuredMarketTransaction3.UniqueTransactionIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction3#UniqueTransactionIdentifier
	 * OvernightIndexSwapTransaction3.UniqueTransactionIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction3#UniqueTransactionIdentifier
	 * SecuredMarketTransaction3.UniqueTransactionIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4#UniqueTransactionIdentifier
	 * SecuredMarketTransaction4.UniqueTransactionIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction3#UniqueTransactionIdentifier
	 * ForeignExchangeSwapTransaction3.UniqueTransactionIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction4#UniqueTransactionIdentifier
	 * OvernightIndexSwapTransaction4.UniqueTransactionIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4#UniqueTransactionIdentifier
	 * UnsecuredMarketTransaction4.UniqueTransactionIdentifier}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification
	 * TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UniqueTradeIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "This field specifies the unique transaction identifier (UTI) to be created at the time a transaction is first executed, shared with all registered entities and counterparties involved in the transaction, and used to track that particular transaction over its life. This identifier can also be known as the Unique Swap Identifier (USI)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute UniqueTradeIdentifier = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.UniqueTransactionIdentifier1.UniqueTransactionIdentifier, com.tools20022.repository.msg.UniqueTransactionIdentifier1.PriorUniqueTransactionIdentifier,
					com.tools20022.repository.msg.RegulatoryReporting1.TradingSideUniqueTransactionIdentifier, com.tools20022.repository.msg.UniqueTransactionIdentifier2.UniqueTransactionIdentifier,
					com.tools20022.repository.msg.UniqueTransactionIdentifier2.PriorUniqueTransactionIdentifier, com.tools20022.repository.msg.ForeignExchangeSwapTransaction1.UniqueTransactionIdentifier,
					com.tools20022.repository.msg.UnsecuredMarketTransaction1.UniqueTransactionIdentifier, com.tools20022.repository.msg.OvernightIndexSwapTransaction1.UniqueTransactionIdentifier,
					com.tools20022.repository.msg.SecuredMarketTransaction1.UniqueTransactionIdentifier, com.tools20022.repository.msg.SecuritiesTransactionReport2.TransactionIdentification,
					com.tools20022.repository.msg.UnsecuredMarketTransaction2.UniqueTransactionIdentifier, com.tools20022.repository.msg.ForeignExchangeSwapTransaction2.UniqueTransactionIdentifier,
					com.tools20022.repository.msg.SecuredMarketTransaction2.UniqueTransactionIdentifier, com.tools20022.repository.msg.UnsecuredMarketTransaction3.UniqueTransactionIdentifier,
					com.tools20022.repository.msg.OvernightIndexSwapTransaction3.UniqueTransactionIdentifier, com.tools20022.repository.msg.SecuredMarketTransaction3.UniqueTransactionIdentifier,
					com.tools20022.repository.msg.SecuredMarketTransaction4.UniqueTransactionIdentifier, com.tools20022.repository.msg.ForeignExchangeSwapTransaction3.UniqueTransactionIdentifier,
					com.tools20022.repository.msg.OvernightIndexSwapTransaction4.UniqueTransactionIdentifier, com.tools20022.repository.msg.UnsecuredMarketTransaction4.UniqueTransactionIdentifier);
			elementContext_lazy = () -> TradeIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UniqueTradeIdentifier";
			definition = "This field specifies the unique transaction identifier (UTI) to be created at the time a transaction is first executed, shared with all registered entities and counterparties involved in the transaction, and used to track that particular transaction over its life. This identifier can also be known as the Unique Swap Identifier (USI).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Reference number assigned by the clearing broker.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ClearingBrokerIdentification#RelatedTradeIdentification
	 * ClearingBrokerIdentification.RelatedTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.ClearingBrokerIdentification
	 * ClearingBrokerIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting1#ClearingBrokerIdentification
	 * RegulatoryReporting1.ClearingBrokerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#ClearingBrokerIdentification
	 * RegulatoryReporting4.ClearingBrokerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation5#BrokersReference
	 * GeneralInformation5.BrokersReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#ClearingBrokerIdentification
	 * RegulatoryReporting6.ClearingBrokerIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification
	 * TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingBrokerIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference number assigned by the clearing broker."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ClearingBrokerIdentification = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RegulatoryReporting1.ClearingBrokerIdentification, com.tools20022.repository.msg.RegulatoryReporting4.ClearingBrokerIdentification,
					com.tools20022.repository.msg.GeneralInformation5.BrokersReference, com.tools20022.repository.msg.RegulatoryReporting6.ClearingBrokerIdentification);
			elementContext_lazy = () -> TradeIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClearingBrokerIdentification";
			definition = "Reference number assigned by the clearing broker.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.ClearingBrokerIdentification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ClearingBrokerIdentification.RelatedTradeIdentification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TradeIdentification";
				definition = "Specifies the different identifications associated with a trade.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Trade.TradeRelatedIdentifications, com.tools20022.repository.entity.ClearingBrokerIdentification.RelatedTradeIdentification);
				subType_lazy = () -> Arrays.asList(SecuritiesTradeIdentification.mmObject(), PaymentIdentification.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TradeIdentification.CounterpartyReference, com.tools20022.repository.entity.TradeIdentification.Identification,
						com.tools20022.repository.entity.TradeIdentification.CommonIdentification, com.tools20022.repository.entity.TradeIdentification.MatchingReference, com.tools20022.repository.entity.TradeIdentification.Trade,
						com.tools20022.repository.entity.TradeIdentification.UniqueTradeIdentifier, com.tools20022.repository.entity.TradeIdentification.ClearingBrokerIdentification);
				derivationComponent_lazy = () -> Arrays.asList(TransactionReferences1.mmObject(), TransactionReferences2.mmObject(), TransactionReferences3.mmObject(), UniqueTransactionIdentifier1.mmObject(),
						MatchingSystemReference1Choice.mmObject(), UniqueTransactionIdentifier2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}