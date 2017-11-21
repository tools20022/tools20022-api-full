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

import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmCounterpartyReference
 * TradeIdentification.mmCounterpartyReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmIdentification
 * TradeIdentification.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmCommonIdentification
 * TradeIdentification.mmCommonIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmMatchingReference
 * TradeIdentification.mmMatchingReference}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradeIdentification#mmTrade
 * TradeIdentification.mmTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmUniqueTradeIdentifier
 * TradeIdentification.mmUniqueTradeIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmClearingBrokerIdentification
 * TradeIdentification.mmClearingBrokerIdentification}</li>
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
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeRelatedIdentifications
 * Trade.mmTradeRelatedIdentifications}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClearingBrokerIdentification#mmRelatedTradeIdentification
 * ClearingBrokerIdentification.mmRelatedTradeIdentification}</li>
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
 * "TradeIdentification"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the different identifications associated with a trade."</li>
 * </ul>
 */
public class TradeIdentification {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text counterpartyReference;
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
	 * {@linkplain com.tools20022.repository.msg.References11#mmCounterpartyReference
	 * References11.mmCounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer18#mmCounterpartyReference
	 * Transfer18.mmCounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer26#mmCounterpartyReference
	 * Transfer26.mmCounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer15#mmCounterpartyReference
	 * Transfer15.mmCounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer21#mmCounterpartyReference
	 * Transfer21.mmCounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer13#mmCounterpartyReference
	 * Transfer13.mmCounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer23#mmCounterpartyReference
	 * Transfer23.mmCounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer11#mmCounterpartyReference
	 * Transfer11.mmCounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer19#mmCounterpartyReference
	 * Transfer19.mmCounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer27#mmCounterpartyReference
	 * Transfer27.mmCounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer28#mmCounterpartyReference
	 * Transfer28.mmCounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer29#mmCounterpartyReference
	 * Transfer29.mmCounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountModification1#mmCounterpartyReference
	 * InvestmentAccountModification1.mmCounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOpening1#mmCounterpartyReference
	 * InvestmentAccountOpening1.mmCounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountManagementConfirmation2#mmCounterpartyReference
	 * AccountManagementConfirmation2.mmCounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction1#mmCounterpartyProprietaryTransactionIdentification
	 * ForeignExchangeSwapTransaction1.
	 * mmCounterpartyProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction1#mmCounterpartyProprietaryTransactionIdentification
	 * UnsecuredMarketTransaction1.
	 * mmCounterpartyProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction1#mmCounterpartyProprietaryTransactionIdentification
	 * OvernightIndexSwapTransaction1.
	 * mmCounterpartyProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction1#mmCounterpartyProprietaryTransactionIdentification
	 * SecuredMarketTransaction1.
	 * mmCounterpartyProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOpening2#mmCounterpartyReference
	 * InvestmentAccountOpening2.mmCounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer26#mmCounterpartyReference
	 * ISATransfer26.mmCounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer31#mmCounterpartyReference
	 * Transfer31.mmCounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer30#mmCounterpartyReference
	 * Transfer30.mmCounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountModification2#mmCounterpartyReference
	 * InvestmentAccountModification2.mmCounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountManagementConfirmation3#mmCounterpartyReference
	 * AccountManagementConfirmation3.mmCounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer32#mmCounterpartyReference
	 * Transfer32.mmCounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer33#mmCounterpartyReference
	 * Transfer33.mmCounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer22#mmCounterpartyReference
	 * ISATransfer22.mmCounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction2#mmCounterpartyProprietaryTransactionIdentification
	 * UnsecuredMarketTransaction2.
	 * mmCounterpartyProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction2#mmCounterpartyProprietaryTransactionIdentification
	 * ForeignExchangeSwapTransaction2.
	 * mmCounterpartyProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction2#mmCounterpartyProprietaryTransactionIdentification
	 * SecuredMarketTransaction2.
	 * mmCounterpartyProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction3#mmCounterpartyProprietaryTransactionIdentification
	 * UnsecuredMarketTransaction3.
	 * mmCounterpartyProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction3#mmCounterpartyProprietaryTransactionIdentification
	 * OvernightIndexSwapTransaction3.
	 * mmCounterpartyProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction3#mmCounterpartyProprietaryTransactionIdentification
	 * SecuredMarketTransaction3.
	 * mmCounterpartyProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOpening3#mmCounterpartyReference
	 * InvestmentAccountOpening3.mmCounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountModification3#mmCounterpartyReference
	 * InvestmentAccountModification3.mmCounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountManagementConfirmation4#mmCounterpartyReference
	 * AccountManagementConfirmation4.mmCounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation5#mmCounterpartyReference
	 * GeneralInformation5.mmCounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4#mmCounterpartyProprietaryTransactionIdentification
	 * SecuredMarketTransaction4.
	 * mmCounterpartyProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction3#mmCounterpartyProprietaryTransactionIdentification
	 * ForeignExchangeSwapTransaction3.
	 * mmCounterpartyProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction4#mmCounterpartyProprietaryTransactionIdentification
	 * OvernightIndexSwapTransaction4.
	 * mmCounterpartyProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4#mmCounterpartyProprietaryTransactionIdentification
	 * UnsecuredMarketTransaction4.
	 * mmCounterpartyProprietaryTransactionIdentification}</li>
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
	public static final MMBusinessAttribute mmCounterpartyReference = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(References11.mmCounterpartyReference, Transfer18.mmCounterpartyReference, Transfer26.mmCounterpartyReference, Transfer15.mmCounterpartyReference, Transfer21.mmCounterpartyReference,
					Transfer13.mmCounterpartyReference, Transfer23.mmCounterpartyReference, Transfer11.mmCounterpartyReference, Transfer19.mmCounterpartyReference, Transfer27.mmCounterpartyReference, Transfer28.mmCounterpartyReference,
					Transfer29.mmCounterpartyReference, InvestmentAccountModification1.mmCounterpartyReference, InvestmentAccountOpening1.mmCounterpartyReference, AccountManagementConfirmation2.mmCounterpartyReference,
					ForeignExchangeSwapTransaction1.mmCounterpartyProprietaryTransactionIdentification, UnsecuredMarketTransaction1.mmCounterpartyProprietaryTransactionIdentification,
					OvernightIndexSwapTransaction1.mmCounterpartyProprietaryTransactionIdentification, SecuredMarketTransaction1.mmCounterpartyProprietaryTransactionIdentification, InvestmentAccountOpening2.mmCounterpartyReference,
					ISATransfer26.mmCounterpartyReference, Transfer31.mmCounterpartyReference, Transfer30.mmCounterpartyReference, InvestmentAccountModification2.mmCounterpartyReference,
					AccountManagementConfirmation3.mmCounterpartyReference, Transfer32.mmCounterpartyReference, Transfer33.mmCounterpartyReference, ISATransfer22.mmCounterpartyReference,
					UnsecuredMarketTransaction2.mmCounterpartyProprietaryTransactionIdentification, ForeignExchangeSwapTransaction2.mmCounterpartyProprietaryTransactionIdentification,
					SecuredMarketTransaction2.mmCounterpartyProprietaryTransactionIdentification, UnsecuredMarketTransaction3.mmCounterpartyProprietaryTransactionIdentification,
					OvernightIndexSwapTransaction3.mmCounterpartyProprietaryTransactionIdentification, SecuredMarketTransaction3.mmCounterpartyProprietaryTransactionIdentification, InvestmentAccountOpening3.mmCounterpartyReference,
					InvestmentAccountModification3.mmCounterpartyReference, AccountManagementConfirmation4.mmCounterpartyReference, GeneralInformation5.mmCounterpartyReference,
					SecuredMarketTransaction4.mmCounterpartyProprietaryTransactionIdentification, ForeignExchangeSwapTransaction3.mmCounterpartyProprietaryTransactionIdentification,
					OvernightIndexSwapTransaction4.mmCounterpartyProprietaryTransactionIdentification, UnsecuredMarketTransaction4.mmCounterpartyProprietaryTransactionIdentification);
			elementContext_lazy = () -> com.tools20022.repository.entity.TradeIdentification.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CounterpartyReference";
			definition = "Unambiguous identification of the trade allocated by the counterparty.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TradeIdentification.class.getMethod("getCounterpartyReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text identification;
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
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification3#mmTransactionIdentification
	 * SettlementTypeAndIdentification3.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails41#mmOtherTransactionIdentification
	 * TransactionDetails41.mmOtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References1Choice#mmOtherTransactionIdentification
	 * References1Choice.mmOtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails25#mmTradeIdentification
	 * SecuritiesTradeDetails25.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails26#mmTradeIdentification
	 * SecuritiesTradeDetails26.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification13#mmTransactionIdentification
	 * SettlementTypeAndIdentification13.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification7#mmTransactionIdentification
	 * SettlementTypeAndIdentification7.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails43#mmOtherTransactionIdentification
	 * TransactionDetails43.mmOtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References12Choice#mmOtherTransactionIdentification
	 * References12Choice.mmOtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails27#mmTradeIdentification
	 * SecuritiesTradeDetails27.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References28Choice#mmOtherTransactionIdentification
	 * References28Choice.mmOtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails28#mmTradeIdentification
	 * SecuritiesTradeDetails28.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification2#mmTransactionIdentification
	 * SettlementTypeAndIdentification2.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification5#mmTransactionIdentification
	 * SettlementTypeAndIdentification5.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters3#mmPreviousPartialConfirmationIdentification
	 * AdditionalParameters3.mmPreviousPartialConfirmationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters7#mmPreviousPartialConfirmationIdentification
	 * AdditionalParameters7.mmPreviousPartialConfirmationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters8#mmPreviousPartialConfirmationIdentification
	 * AdditionalParameters8.mmPreviousPartialConfirmationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters9#mmPreviousPartialConfirmationIdentification
	 * AdditionalParameters9.mmPreviousPartialConfirmationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters10#mmPreviousPartialConfirmationIdentification
	 * AdditionalParameters10.mmPreviousPartialConfirmationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters11#mmPreviousPartialConfirmationIdentification
	 * AdditionalParameters11.mmPreviousPartialConfirmationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters2#mmPreviousPartialConfirmationIdentification
	 * AdditionalParameters2.mmPreviousPartialConfirmationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters6#mmPreviousPartialConfirmationIdentification
	 * AdditionalParameters6.mmPreviousPartialConfirmationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters12#mmPreviousPartialConfirmationIdentification
	 * AdditionalParameters12.mmPreviousPartialConfirmationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters13#mmPreviousPartialConfirmationIdentification
	 * AdditionalParameters13.mmPreviousPartialConfirmationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters18#mmPreviousPartialConfirmationIdentification
	 * AdditionalParameters18.mmPreviousPartialConfirmationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters19#mmPreviousPartialConfirmationIdentification
	 * AdditionalParameters19.mmPreviousPartialConfirmationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References14Choice#mmOtherTransactionIdentification
	 * References14Choice.mmOtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References16Choice#mmOtherTransactionIdentification
	 * References16Choice.mmOtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References25Choice#mmOtherTransactionIdentification
	 * References25Choice.mmOtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References32Choice#mmOtherTransactionIdentification
	 * References32Choice.mmOtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification14#mmTransactionIdentification
	 * SettlementTypeAndIdentification14.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References1#mmTradeIdentification
	 * References1.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References6Choice#mmTradeIdentification
	 * References6Choice.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References2#mmTradeIdentification
	 * References2.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References10Choice#mmTradeIdentification
	 * References10Choice.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References7#mmTradeIdentification
	 * References7.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References13Choice#mmTradeIdentification
	 * References13Choice.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References13Choice#mmOtherTransactionIdentification
	 * References13Choice.mmOtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References8#mmTradeIdentification
	 * References8.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References15Choice#mmTradeIdentification
	 * References15Choice.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References15Choice#mmOtherTransactionIdentification
	 * References15Choice.mmOtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References9#mmTradeIdentification
	 * References9.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References24Choice#mmTradeIdentification
	 * References24Choice.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References24Choice#mmOtherTransactionIdentification
	 * References24Choice.mmOtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References13#mmTradeIdentification
	 * References13.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References31Choice#mmTradeIdentification
	 * References31Choice.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References31Choice#mmOtherTransactionIdentification
	 * References31Choice.mmOtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails2#mmTradeIdentification
	 * SecuritiesTradeDetails2.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails16#mmTradeIdentification
	 * SecuritiesTradeDetails16.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters17#mmPreviousPartialConfirmationIdentification
	 * AdditionalParameters17.mmPreviousPartialConfirmationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters20#mmPreviousPartialConfirmationIdentification
	 * AdditionalParameters20.mmPreviousPartialConfirmationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails1#mmTradeIdentification
	 * SecuritiesTradeDetails1.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails15#mmTradeIdentification
	 * SecuritiesTradeDetails15.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails5#mmTradeIdentification
	 * TransactionDetails5.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails9#mmTradeIdentification
	 * TransactionDetails9.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails22#mmTradeIdentification
	 * TransactionDetails22.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails23#mmTradeIdentification
	 * TransactionDetails23.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails36#mmTradeIdentification
	 * TransactionDetails36.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails47#mmTradeIdentification
	 * TransactionDetails47.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails53#mmTradeIdentification
	 * TransactionDetails53.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails58#mmTradeIdentification
	 * TransactionDetails58.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction7#mmTradeIdentification
	 * Transaction7.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction8#mmTradeIdentification
	 * Transaction8.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction9#mmTradeIdentification
	 * Transaction9.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction10#mmTradeIdentification
	 * Transaction10.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction14#mmTradeIdentification
	 * Transaction14.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction12#mmTradeIdentification
	 * Transaction12.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction15#mmTradeIdentification
	 * Transaction15.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction16#mmTradeIdentification
	 * Transaction16.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction20#mmTradeIdentification
	 * Transaction20.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction19#mmTradeIdentification
	 * Transaction19.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction23#mmTradeIdentification
	 * Transaction23.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction22#mmTradeIdentification
	 * Transaction22.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction28#mmTradeIdentification
	 * Transaction28.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction27#mmTradeIdentification
	 * Transaction27.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction30#mmTradeIdentification
	 * Transaction30.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction31#mmTradeIdentification
	 * Transaction31.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction6#mmTradeIdentification
	 * Transaction6.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction11#mmTradeIdentification
	 * Transaction11.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction13#mmTradeIdentification
	 * Transaction13.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction17#mmTradeIdentification
	 * Transaction17.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction18#mmTradeIdentification
	 * Transaction18.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction21#mmTradeIdentification
	 * Transaction21.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction29#mmTradeIdentification
	 * Transaction29.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction32#mmTradeIdentification
	 * Transaction32.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification2#mmTradeIdentification
	 * Identification2.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference8Choice#mmInstructingPartyTransactionIdentification
	 * IdentificationReference8Choice.
	 * mmInstructingPartyTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference8Choice#mmExecutingPartyTransactionIdentification
	 * IdentificationReference8Choice.mmExecutingPartyTransactionIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference11Choice#mmInstructingPartyTransactionIdentification
	 * IdentificationReference11Choice.
	 * mmInstructingPartyTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference11Choice#mmExecutingPartyTransactionIdentification
	 * IdentificationReference11Choice.mmExecutingPartyTransactionIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TwoLegTransactionDetails1#mmOpeningLegIdentification
	 * TwoLegTransactionDetails1.mmOpeningLegIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TwoLegTransactionDetails1#mmClosingLegIdentification
	 * TwoLegTransactionDetails1.mmClosingLegIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange3#mmContractIdentification
	 * CurrencyExchange3.mmContractIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange5#mmContractIdentification
	 * CurrencyExchange5.mmContractIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeRateInformation1#mmContractIdentification
	 * ExchangeRateInformation1.mmContractIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation1#mmPaymentInformationIdentification
	 * PaymentInstructionInformation1.mmPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation3#mmPaymentInformationIdentification
	 * PaymentInstructionInformation3.mmPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeRate1#mmContractIdentification
	 * ExchangeRate1.mmContractIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction6#mmPaymentInformationIdentification
	 * PaymentInstruction6.mmPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction9#mmPaymentInformationIdentification
	 * PaymentInstruction9.mmPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation2#mmPaymentInformationIdentification
	 * PaymentInstructionInformation2.mmPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation4#mmPaymentInformationIdentification
	 * PaymentInstructionInformation4.mmPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction7#mmPaymentInformationIdentification
	 * PaymentInstruction7.mmPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction10#mmPaymentInformationIdentification
	 * PaymentInstruction10.mmPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation4#mmOriginalPaymentInformationIdentification
	 * OriginalPaymentInformation4.mmOriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction4#mmOriginalPaymentInformationIdentification
	 * OriginalPaymentInstruction4.mmOriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction8#mmOriginalPaymentInformationIdentification
	 * OriginalPaymentInstruction8.mmOriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation2#mmOriginalPaymentInformationIdentification
	 * OriginalPaymentInformation2.mmOriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction2#mmOriginalPaymentInformationIdentification
	 * OriginalPaymentInstruction2.mmOriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction7#mmOriginalPaymentInformationIdentification
	 * OriginalPaymentInstruction7.mmOriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation1#mmOriginalPaymentInformationIdentification
	 * OriginalPaymentInformation1.mmOriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction1#mmOriginalPaymentInformationIdentification
	 * OriginalPaymentInstruction1.mmOriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction6#mmOriginalPaymentInformationIdentification
	 * OriginalPaymentInstruction6.mmOriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingSystemReference1Choice#mmRelatedReference
	 * MatchingSystemReference1Choice.mmRelatedReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement9#mmRelatedReference
	 * TradeAgreement9.mmRelatedReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation5#mmOriginalPaymentInformationIdentification
	 * OriginalPaymentInformation5.mmOriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction5#mmOriginalPaymentInformationIdentification
	 * OriginalPaymentInstruction5.mmOriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction9#mmOriginalPaymentInformationIdentification
	 * OriginalPaymentInstruction9.mmOriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction5#mmPaymentInformationIdentification
	 * PaymentInstruction5.mmPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction8#mmPaymentInformationIdentification
	 * PaymentInstruction8.mmPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction11#mmPaymentInformationIdentification
	 * PaymentInstruction11.mmPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1#mmDealReference
	 * IndividualOrderConfirmationStatusAndReason1.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason2#mmDealReference
	 * IndividualOrderStatusAndReason2.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference5#mmOtherReference
	 * MessageAndBusinessReference5.mmOtherReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference5#mmPreviousReference
	 * MessageAndBusinessReference5.mmPreviousReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference5#mmRelatedReference
	 * MessageAndBusinessReference5.mmRelatedReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference2#mmOtherReference
	 * MessageAndBusinessReference2.mmOtherReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference2#mmPreviousReference
	 * MessageAndBusinessReference2.mmPreviousReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference4#mmOtherReference
	 * MessageAndBusinessReference4.mmOtherReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference4#mmPreviousReference
	 * MessageAndBusinessReference4.mmPreviousReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference4#mmRelatedReference
	 * MessageAndBusinessReference4.mmRelatedReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference1#mmPreviousReference
	 * MessageAndBusinessReference1.mmPreviousReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference1#mmOtherReference
	 * MessageAndBusinessReference1.mmOtherReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference6#mmPreviousReference
	 * MessageAndBusinessReference6.mmPreviousReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference6#mmOtherReference
	 * MessageAndBusinessReference6.mmOtherReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference6#mmCancellationReference
	 * MessageAndBusinessReference6.mmCancellationReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails1#mmTradeReference
	 * TransactionDetails1.mmTradeReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails1#mmAssociatedTradeReference
	 * TransactionDetails1.mmAssociatedTradeReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails3#mmTradeReference
	 * TransactionDetails3.mmTradeReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails3#mmAssociatedTradeReference
	 * TransactionDetails3.mmAssociatedTradeReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails2#mmTradeReference
	 * TransactionDetails2.mmTradeReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeTransactionStatusAndReason1#mmTradeReference
	 * TradeTransactionStatusAndReason1.mmTradeReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeTransactionStatusAndReason2#mmTradeReference
	 * TradeTransactionStatusAndReason2.mmTradeReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2#mmClosingLegIdentification
	 * SecuritiesFinancingTransactionDetails2.mmClosingLegIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails8#mmTradeIdentification
	 * SecuritiesTradeDetails8.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails18#mmTradeIdentification
	 * SecuritiesTradeDetails18.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails4#mmTradeIdentification
	 * SecuritiesTradeDetails4.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails17#mmTradeIdentification
	 * SecuritiesTradeDetails17.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification7#mmTradeIdentification
	 * Identification7.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification4#mmTransactionIdentification
	 * SettlementTypeAndIdentification4.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References4Choice#mmOtherTransactionIdentification
	 * References4Choice.mmOtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References22Choice#mmOtherTransactionIdentification
	 * References22Choice.mmOtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References2Choice#mmOtherTransactionIdentification
	 * References2Choice.mmOtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification6#mmTradeIdentification
	 * Identification6.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationEntry2#mmIdentification
	 * NotificationEntry2.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem3#mmIdentification
	 * NotificationItem3.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItem1#mmOriginalItemIdentification
	 * OriginalItem1.mmOriginalItemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItem2#mmOriginalItemIdentification
	 * OriginalItem2.mmOriginalItemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItem2#mmOriginalEndToEndIdentification
	 * OriginalItem2.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus1#mmOriginalItemIdentification
	 * OriginalItemAndStatus1.mmOriginalItemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus2#mmOriginalItemIdentification
	 * OriginalItemAndStatus2.mmOriginalItemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation3#mmOriginalPaymentInformationCancellationIdentification
	 * OriginalPaymentInformation3.
	 * mmOriginalPaymentInformationCancellationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation3#mmOriginalPaymentInformationIdentification
	 * OriginalPaymentInformation3.mmOriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInitiation1#mmPaymentInformationIdentification
	 * CorrectivePaymentInitiation1.mmPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6#mmClosingLegIdentification
	 * SecuritiesFinancingTransactionDetails6.mmClosingLegIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails9#mmTradeIdentification
	 * SecuritiesTradeDetails9.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails21#mmTradeIdentification
	 * SecuritiesTradeDetails21.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails10#mmTradeIdentification
	 * SecuritiesTradeDetails10.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails22#mmTradeIdentification
	 * SecuritiesTradeDetails22.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails23#mmTradeIdentification
	 * SecuritiesTradeDetails23.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails29#mmTradeIdentification
	 * SecuritiesTradeDetails29.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification5#mmTradeIdentification
	 * Identification5.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification8#mmTradeIdentification
	 * Identification8.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification11#mmTradeIdentification
	 * Identification11.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification13#mmTradeIdentification
	 * Identification13.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References8Choice#mmOtherTransactionIdentification
	 * References8Choice.mmOtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References17Choice#mmOtherTransactionIdentification
	 * References17Choice.mmOtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification6#mmTransactionIdentification
	 * SettlementTypeAndIdentification6.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References7Choice#mmOtherTransactionIdentification
	 * References7Choice.mmOtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References23Choice#mmOtherTransactionIdentification
	 * References23Choice.mmOtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References30Choice#mmOtherTransactionIdentification
	 * References30Choice.mmOtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification9#mmTradeIdentification
	 * Identification9.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction3#mmOriginalPaymentInformationIdentification
	 * OriginalPaymentInstruction3.mmOriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem4#mmIdentification
	 * NotificationItem4.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus3#mmOriginalItemIdentification
	 * OriginalItemAndStatus3.mmOriginalItemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg2#mmTradeLegIdentification
	 * TradeLeg2.mmTradeLegIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg5#mmTradeLegIdentification
	 * TradeLeg5.mmTradeLegIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg3#mmTradeLegIdentification
	 * TradeLeg3.mmTradeLegIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg6#mmTradeLegIdentification
	 * TradeLeg6.mmTradeLegIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg4#mmTradeLegIdentification
	 * TradeLeg4.mmTradeLegIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg7#mmTradeLegIdentification
	 * TradeLeg7.mmTradeLegIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason3#mmDealReference
	 * IndividualOrderStatusAndReason3.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References34Choice#mmOtherTransactionIdentification
	 * References34Choice.mmOtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction25#mmTradeIdentification
	 * Transaction25.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References35Choice#mmTradeIdentification
	 * References35Choice.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification3#mmTradeIdentification
	 * Identification3.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters16#mmPreviousPartialConfirmationIdentification
	 * AdditionalParameters16.mmPreviousPartialConfirmationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference7#mmCancellationReference
	 * MessageAndBusinessReference7.mmCancellationReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References39Choice#mmPreviousReference
	 * References39Choice.mmPreviousReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References39Choice#mmOtherReference
	 * References39Choice.mmOtherReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails61#mmTradeIdentification
	 * TransactionDetails61.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction34#mmTradeIdentification
	 * Transaction34.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails64#mmOtherTransactionIdentification
	 * TransactionDetails64.mmOtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction35#mmTradeIdentification
	 * Transaction35.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction36#mmTradeIdentification
	 * Transaction36.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences4#mmPaymentInformationIdentification
	 * TransactionReferences4.mmPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails31#mmTradeIdentification
	 * SecuritiesTradeDetails31.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33#mmTradeIdentification
	 * SecuritiesTradeDetails33.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails35#mmTradeIdentification
	 * SecuritiesTradeDetails35.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails36#mmTradeIdentification
	 * SecuritiesTradeDetails36.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails34#mmTradeIdentification
	 * SecuritiesTradeDetails34.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails32#mmTradeIdentification
	 * SecuritiesTradeDetails32.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References16#mmTradeIdentification
	 * References16.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails44#mmTradeIdentification
	 * SecuritiesTradeDetails44.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails43#mmTradeIdentification
	 * SecuritiesTradeDetails43.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails41#mmTradeIdentification
	 * SecuritiesTradeDetails41.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction38#mmTradeIdentification
	 * Transaction38.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails66#mmTradeIdentification
	 * TransactionDetails66.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails65#mmOtherTransactionIdentification
	 * TransactionDetails65.mmOtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails42#mmTradeIdentification
	 * SecuritiesTradeDetails42.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References17#mmTradeIdentification
	 * References17.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction39#mmTradeIdentification
	 * Transaction39.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails46#mmTradeIdentification
	 * SecuritiesTradeDetails46.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails47#mmTradeIdentification
	 * SecuritiesTradeDetails47.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction37#mmTradeIdentification
	 * Transaction37.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement12#mmRelatedReference
	 * TradeAgreement12.mmRelatedReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction16#mmPaymentInformationIdentification
	 * PaymentInstruction16.mmPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction12#mmOriginalPaymentInformationIdentification
	 * OriginalPaymentInstruction12.mmOriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction11#mmOriginalPaymentInformationIdentification
	 * OriginalPaymentInstruction11.mmOriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction15#mmPaymentInformationIdentification
	 * PaymentInstruction15.mmPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction13#mmOriginalPaymentInformationIdentification
	 * OriginalPaymentInstruction13.mmOriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction10#mmOriginalPaymentInformationIdentification
	 * OriginalPaymentInstruction10.mmOriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus4#mmOriginalItemIdentification
	 * OriginalItemAndStatus4.mmOriginalItemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem5#mmIdentification
	 * NotificationItem5.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg8#mmTradeLegIdentification
	 * TradeLeg8.mmTradeLegIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction41#mmTradeIdentification
	 * Transaction41.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails70#mmTradeIdentification
	 * TransactionDetails70.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction40#mmTradeIdentification
	 * Transaction40.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg10#mmTradeLegIdentification
	 * TradeLeg10.mmTradeLegIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg9#mmTradeLegIdentification
	 * TradeLeg9.mmTradeLegIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction17#mmPaymentInformationIdentification
	 * PaymentInstruction17.mmPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction14#mmOriginalPaymentInformationIdentification
	 * OriginalPaymentInstruction14.mmOriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction43#mmTradeIdentification
	 * Transaction43.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails71#mmTradeIdentification
	 * TransactionDetails71.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction42#mmTradeIdentification
	 * Transaction42.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction1#mmProprietaryTransactionIdentification
	 * ForeignExchangeSwapTransaction1.mmProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction1#mmProprietaryTransactionIdentification
	 * UnsecuredMarketTransaction1.mmProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction1#mmProprietaryTransactionIdentification
	 * OvernightIndexSwapTransaction1.mmProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction1#mmProprietaryTransactionIdentification
	 * SecuredMarketTransaction1.mmProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails49#mmTradeIdentification
	 * SecuritiesTradeDetails49.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction47#mmTradeIdentification
	 * Transaction47.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails76#mmOtherTransactionIdentification
	 * TransactionDetails76.mmOtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails79#mmTradeIdentification
	 * TransactionDetails79.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction45#mmTradeIdentification
	 * Transaction45.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction46#mmTradeIdentification
	 * Transaction46.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CertificateIdentification1#mmPaymentInformationIdentification
	 * CertificateIdentification1.mmPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Trade2#mmProductIdentification
	 * Trade2.mmProductIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Trade1#mmProductIdentification
	 * Trade1.mmProductIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References45Choice#mmOtherTransactionIdentification
	 * References45Choice.mmOtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification18#mmTransactionIdentification
	 * SettlementTypeAndIdentification18.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails51#mmTradeIdentification
	 * SecuritiesTradeDetails51.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails53#mmTradeIdentification
	 * SecuritiesTradeDetails53.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters24#mmPreviousPartialConfirmationIdentification
	 * AdditionalParameters24.mmPreviousPartialConfirmationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters22#mmPreviousPartialConfirmationIdentification
	 * AdditionalParameters22.mmPreviousPartialConfirmationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters21#mmPreviousPartialConfirmationIdentification
	 * AdditionalParameters21.mmPreviousPartialConfirmationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails54#mmTradeIdentification
	 * SecuritiesTradeDetails54.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails52#mmTradeIdentification
	 * SecuritiesTradeDetails52.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References46Choice#mmTradeIdentification
	 * References46Choice.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References46Choice#mmOtherTransactionIdentification
	 * References46Choice.mmOtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification15#mmTradeIdentification
	 * Identification15.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails50#mmTradeIdentification
	 * SecuritiesTradeDetails50.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References41Choice#mmOtherTransactionIdentification
	 * References41Choice.mmOtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References44Choice#mmOtherTransactionIdentification
	 * References44Choice.mmOtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References47Choice#mmOtherTransactionIdentification
	 * References47Choice.mmOtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References18#mmTradeIdentification
	 * References18.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction18#mmPaymentInformationIdentification
	 * PaymentInstruction18.mmPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction16#mmOriginalPaymentInformationIdentification
	 * OriginalPaymentInstruction16.mmOriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction18#mmOriginalPaymentInformationIdentification
	 * OriginalPaymentInstruction18.mmOriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction19#mmPaymentInformationIdentification
	 * PaymentInstruction19.mmPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction20#mmPaymentInformationIdentification
	 * PaymentInstruction20.mmPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction15#mmOriginalPaymentInformationIdentification
	 * OriginalPaymentInstruction15.mmOriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus5#mmOriginalItemIdentification
	 * OriginalItemAndStatus5.mmOriginalItemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction17#mmOriginalPaymentInformationIdentification
	 * OriginalPaymentInstruction17.mmOriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem6#mmIdentification
	 * NotificationItem6.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification20#mmTransactionIdentification
	 * SettlementTypeAndIdentification20.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference8#mmCancellationReference
	 * MessageAndBusinessReference8.mmCancellationReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References48Choice#mmPreviousReference
	 * References48Choice.mmPreviousReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References48Choice#mmOtherReference
	 * References48Choice.mmOtherReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction19#mmOriginalPaymentInformationIdentification
	 * OriginalPaymentInstruction19.mmOriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification21#mmTransactionIdentification
	 * SettlementTypeAndIdentification21.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References60Choice#mmOtherTransactionIdentification
	 * References60Choice.mmOtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction49#mmTradeIdentification
	 * Transaction49.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters26#mmPreviousPartialConfirmationIdentification
	 * AdditionalParameters26.mmPreviousPartialConfirmationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails61#mmTradeIdentification
	 * SecuritiesTradeDetails61.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters25#mmPreviousPartialConfirmationIdentification
	 * AdditionalParameters25.mmPreviousPartialConfirmationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63#mmTradeIdentification
	 * SecuritiesTradeDetails63.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails62#mmTradeIdentification
	 * SecuritiesTradeDetails62.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters27#mmPreviousPartialConfirmationIdentification
	 * AdditionalParameters27.mmPreviousPartialConfirmationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails85#mmOtherTransactionIdentification
	 * TransactionDetails85.mmOtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails87#mmTradeIdentification
	 * TransactionDetails87.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails60#mmTradeIdentification
	 * SecuritiesTradeDetails60.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References58Choice#mmOtherTransactionIdentification
	 * References58Choice.mmOtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification24#mmTradeIdentification
	 * Identification24.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction50#mmTradeIdentification
	 * Transaction50.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References50Choice#mmOtherTransactionIdentification
	 * References50Choice.mmOtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction48#mmTradeIdentification
	 * Transaction48.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References21#mmTradeIdentification
	 * References21.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification22#mmTransactionIdentification
	 * SettlementTypeAndIdentification22.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails65#mmTradeIdentification
	 * SecuritiesTradeDetails65.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References59Choice#mmOtherTransactionIdentification
	 * References59Choice.mmOtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References54Choice#mmTradeIdentification
	 * References54Choice.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References54Choice#mmOtherTransactionIdentification
	 * References54Choice.mmOtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails66#mmTradeIdentification
	 * SecuritiesTradeDetails66.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction2#mmProprietaryTransactionIdentification
	 * UnsecuredMarketTransaction2.mmProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction2#mmProprietaryTransactionIdentification
	 * ForeignExchangeSwapTransaction2.mmProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction2#mmProprietaryTransactionIdentification
	 * SecuredMarketTransaction2.mmProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction3#mmProprietaryTransactionIdentification
	 * UnsecuredMarketTransaction3.mmProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction3#mmProprietaryTransactionIdentification
	 * OvernightIndexSwapTransaction3.mmProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction3#mmProprietaryTransactionIdentification
	 * SecuredMarketTransaction3.mmProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason2#mmDealReference
	 * IndividualOrderConfirmationStatusAndReason2.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference10#mmReference
	 * MessageAndBusinessReference10.mmReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference10#mmRelatedReference
	 * MessageAndBusinessReference10.mmRelatedReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason7#mmDealReference
	 * IndividualOrderStatusAndReason7.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionReport4#mmTransactionIdentification
	 * SecuritiesTransactionReport4.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction21#mmPaymentInformationIdentification
	 * PaymentInstruction21.mmPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction23#mmOriginalPaymentInformationIdentification
	 * OriginalPaymentInstruction23.mmOriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction21#mmOriginalPaymentInformationIdentification
	 * OriginalPaymentInstruction21.mmOriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction23#mmPaymentInformationIdentification
	 * PaymentInstruction23.mmPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction24#mmOriginalPaymentInformationIdentification
	 * OriginalPaymentInstruction24.mmOriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22#mmPaymentInformationIdentification
	 * PaymentInstruction22.mmPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction22#mmOriginalPaymentInformationIdentification
	 * OriginalPaymentInstruction22.mmOriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction20#mmOriginalPaymentInformationIdentification
	 * OriginalPaymentInstruction20.mmOriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInitiation2#mmPaymentInformationIdentification
	 * CorrectivePaymentInitiation2.mmPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters29#mmPreviousPartialConfirmationIdentification
	 * AdditionalParameters29.mmPreviousPartialConfirmationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails67#mmTradeIdentification
	 * SecuritiesTradeDetails67.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction53#mmTradeIdentification
	 * Transaction53.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#mmTradeIdentification
	 * SecuritiesTradeDetails68.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails97#mmTradeIdentification
	 * TransactionDetails97.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction54#mmTradeIdentification
	 * Transaction54.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction52#mmTradeIdentification
	 * Transaction52.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails69#mmTradeIdentification
	 * SecuritiesTradeDetails69.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters31#mmPreviousPartialConfirmationIdentification
	 * AdditionalParameters31.mmPreviousPartialConfirmationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction57#mmTradeIdentification
	 * Transaction57.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails70#mmTradeIdentification
	 * SecuritiesTradeDetails70.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction56#mmTradeIdentification
	 * Transaction56.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails100#mmTradeIdentification
	 * TransactionDetails100.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction55#mmTradeIdentification
	 * Transaction55.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails101#mmOtherTransactionIdentification
	 * TransactionDetails101.mmOtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FixingConditions1#mmOriginatorReference
	 * FixingConditions1.mmOriginatorReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4#mmProprietaryTransactionIdentification
	 * SecuredMarketTransaction4.mmProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4#mmRelatedProprietaryTransactionIdentification
	 * SecuredMarketTransaction4.mmRelatedProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction3#mmProprietaryTransactionIdentification
	 * ForeignExchangeSwapTransaction3.mmProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction3#mmRelatedProprietaryTransactionIdentification
	 * ForeignExchangeSwapTransaction3.
	 * mmRelatedProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction4#mmProprietaryTransactionIdentification
	 * OvernightIndexSwapTransaction4.mmProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction4#mmRelatedProprietaryTransactionIdentification
	 * OvernightIndexSwapTransaction4.
	 * mmRelatedProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4#mmProprietaryTransactionIdentification
	 * UnsecuredMarketTransaction4.mmProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4#mmRelatedProprietaryTransactionIdentification
	 * UnsecuredMarketTransaction4.mmRelatedProprietaryTransactionIdentification
	 * }</li>
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
	public static final MMBusinessAttribute mmIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays
					.asList(SettlementTypeAndIdentification3.mmTransactionIdentification, TransactionDetails41.mmOtherTransactionIdentification, References1Choice.mmOtherTransactionIdentification,
							SecuritiesTradeDetails25.mmTradeIdentification, SecuritiesTradeDetails26.mmTradeIdentification, SettlementTypeAndIdentification13.mmTransactionIdentification,
							SettlementTypeAndIdentification7.mmTransactionIdentification, TransactionDetails43.mmOtherTransactionIdentification, References12Choice.mmOtherTransactionIdentification,
							SecuritiesTradeDetails27.mmTradeIdentification, References28Choice.mmOtherTransactionIdentification, SecuritiesTradeDetails28.mmTradeIdentification, SettlementTypeAndIdentification2.mmTransactionIdentification,
							SettlementTypeAndIdentification5.mmTransactionIdentification, AdditionalParameters3.mmPreviousPartialConfirmationIdentification, AdditionalParameters7.mmPreviousPartialConfirmationIdentification,
							AdditionalParameters8.mmPreviousPartialConfirmationIdentification, AdditionalParameters9.mmPreviousPartialConfirmationIdentification, AdditionalParameters10.mmPreviousPartialConfirmationIdentification,
							AdditionalParameters11.mmPreviousPartialConfirmationIdentification, AdditionalParameters2.mmPreviousPartialConfirmationIdentification, AdditionalParameters6.mmPreviousPartialConfirmationIdentification,
							AdditionalParameters12.mmPreviousPartialConfirmationIdentification, AdditionalParameters13.mmPreviousPartialConfirmationIdentification, AdditionalParameters18.mmPreviousPartialConfirmationIdentification,
							AdditionalParameters19.mmPreviousPartialConfirmationIdentification, References14Choice.mmOtherTransactionIdentification, References16Choice.mmOtherTransactionIdentification,
							References25Choice.mmOtherTransactionIdentification, References32Choice.mmOtherTransactionIdentification, SettlementTypeAndIdentification14.mmTransactionIdentification, References1.mmTradeIdentification,
							References6Choice.mmTradeIdentification, References2.mmTradeIdentification, References10Choice.mmTradeIdentification, References7.mmTradeIdentification, References13Choice.mmTradeIdentification,
							References13Choice.mmOtherTransactionIdentification, References8.mmTradeIdentification, References15Choice.mmTradeIdentification, References15Choice.mmOtherTransactionIdentification,
							References9.mmTradeIdentification, References24Choice.mmTradeIdentification, References24Choice.mmOtherTransactionIdentification, References13.mmTradeIdentification, References31Choice.mmTradeIdentification,
							References31Choice.mmOtherTransactionIdentification, SecuritiesTradeDetails2.mmTradeIdentification, SecuritiesTradeDetails16.mmTradeIdentification,
							AdditionalParameters17.mmPreviousPartialConfirmationIdentification, AdditionalParameters20.mmPreviousPartialConfirmationIdentification, SecuritiesTradeDetails1.mmTradeIdentification,
							SecuritiesTradeDetails15.mmTradeIdentification, TransactionDetails5.mmTradeIdentification, TransactionDetails9.mmTradeIdentification, TransactionDetails22.mmTradeIdentification,
							TransactionDetails23.mmTradeIdentification, TransactionDetails36.mmTradeIdentification, TransactionDetails47.mmTradeIdentification, TransactionDetails53.mmTradeIdentification,
							TransactionDetails58.mmTradeIdentification, Transaction7.mmTradeIdentification, Transaction8.mmTradeIdentification, Transaction9.mmTradeIdentification, Transaction10.mmTradeIdentification,
							Transaction14.mmTradeIdentification, Transaction12.mmTradeIdentification, Transaction15.mmTradeIdentification, Transaction16.mmTradeIdentification, Transaction20.mmTradeIdentification,
							Transaction19.mmTradeIdentification, Transaction23.mmTradeIdentification, Transaction22.mmTradeIdentification, Transaction28.mmTradeIdentification, Transaction27.mmTradeIdentification,
							Transaction30.mmTradeIdentification, Transaction31.mmTradeIdentification, Transaction6.mmTradeIdentification, Transaction11.mmTradeIdentification, Transaction13.mmTradeIdentification,
							Transaction17.mmTradeIdentification, Transaction18.mmTradeIdentification, Transaction21.mmTradeIdentification, Transaction29.mmTradeIdentification, Transaction32.mmTradeIdentification,
							Identification2.mmTradeIdentification, IdentificationReference8Choice.mmInstructingPartyTransactionIdentification, IdentificationReference8Choice.mmExecutingPartyTransactionIdentification,
							IdentificationReference11Choice.mmInstructingPartyTransactionIdentification, IdentificationReference11Choice.mmExecutingPartyTransactionIdentification, TwoLegTransactionDetails1.mmOpeningLegIdentification,
							TwoLegTransactionDetails1.mmClosingLegIdentification, CurrencyExchange3.mmContractIdentification, CurrencyExchange5.mmContractIdentification, ExchangeRateInformation1.mmContractIdentification,
							PaymentInstructionInformation1.mmPaymentInformationIdentification, PaymentInstructionInformation3.mmPaymentInformationIdentification, ExchangeRate1.mmContractIdentification,
							PaymentInstruction6.mmPaymentInformationIdentification, PaymentInstruction9.mmPaymentInformationIdentification, PaymentInstructionInformation2.mmPaymentInformationIdentification,
							PaymentInstructionInformation4.mmPaymentInformationIdentification, PaymentInstruction7.mmPaymentInformationIdentification, PaymentInstruction10.mmPaymentInformationIdentification,
							OriginalPaymentInformation4.mmOriginalPaymentInformationIdentification, OriginalPaymentInstruction4.mmOriginalPaymentInformationIdentification,
							OriginalPaymentInstruction8.mmOriginalPaymentInformationIdentification, OriginalPaymentInformation2.mmOriginalPaymentInformationIdentification,
							OriginalPaymentInstruction2.mmOriginalPaymentInformationIdentification, OriginalPaymentInstruction7.mmOriginalPaymentInformationIdentification,
							OriginalPaymentInformation1.mmOriginalPaymentInformationIdentification, OriginalPaymentInstruction1.mmOriginalPaymentInformationIdentification,
							OriginalPaymentInstruction6.mmOriginalPaymentInformationIdentification, MatchingSystemReference1Choice.mmRelatedReference, TradeAgreement9.mmRelatedReference,
							OriginalPaymentInformation5.mmOriginalPaymentInformationIdentification, OriginalPaymentInstruction5.mmOriginalPaymentInformationIdentification,
							OriginalPaymentInstruction9.mmOriginalPaymentInformationIdentification, PaymentInstruction5.mmPaymentInformationIdentification, PaymentInstruction8.mmPaymentInformationIdentification,
							PaymentInstruction11.mmPaymentInformationIdentification, IndividualOrderConfirmationStatusAndReason1.mmDealReference, IndividualOrderStatusAndReason2.mmDealReference,
							MessageAndBusinessReference5.mmOtherReference, MessageAndBusinessReference5.mmPreviousReference, MessageAndBusinessReference5.mmRelatedReference, MessageAndBusinessReference2.mmOtherReference,
							MessageAndBusinessReference2.mmPreviousReference, MessageAndBusinessReference4.mmOtherReference, MessageAndBusinessReference4.mmPreviousReference, MessageAndBusinessReference4.mmRelatedReference,
							MessageAndBusinessReference1.mmPreviousReference, MessageAndBusinessReference1.mmOtherReference, MessageAndBusinessReference6.mmPreviousReference, MessageAndBusinessReference6.mmOtherReference,
							MessageAndBusinessReference6.mmCancellationReference, TransactionDetails1.mmTradeReference, TransactionDetails1.mmAssociatedTradeReference, TransactionDetails3.mmTradeReference,
							TransactionDetails3.mmAssociatedTradeReference, TransactionDetails2.mmTradeReference, TradeTransactionStatusAndReason1.mmTradeReference, TradeTransactionStatusAndReason2.mmTradeReference,
							SecuritiesFinancingTransactionDetails2.mmClosingLegIdentification, SecuritiesTradeDetails8.mmTradeIdentification, SecuritiesTradeDetails18.mmTradeIdentification, SecuritiesTradeDetails4.mmTradeIdentification,
							SecuritiesTradeDetails17.mmTradeIdentification, Identification7.mmTradeIdentification, SettlementTypeAndIdentification4.mmTransactionIdentification, References4Choice.mmOtherTransactionIdentification,
							References22Choice.mmOtherTransactionIdentification, References2Choice.mmOtherTransactionIdentification, Identification6.mmTradeIdentification, NotificationEntry2.mmIdentification,
							NotificationItem3.mmIdentification, OriginalItem1.mmOriginalItemIdentification, OriginalItem2.mmOriginalItemIdentification, OriginalItem2.mmOriginalEndToEndIdentification,
							OriginalItemAndStatus1.mmOriginalItemIdentification, OriginalItemAndStatus2.mmOriginalItemIdentification, OriginalPaymentInformation3.mmOriginalPaymentInformationCancellationIdentification,
							OriginalPaymentInformation3.mmOriginalPaymentInformationIdentification, CorrectivePaymentInitiation1.mmPaymentInformationIdentification, SecuritiesFinancingTransactionDetails6.mmClosingLegIdentification,
							SecuritiesTradeDetails9.mmTradeIdentification, SecuritiesTradeDetails21.mmTradeIdentification, SecuritiesTradeDetails10.mmTradeIdentification, SecuritiesTradeDetails22.mmTradeIdentification,
							SecuritiesTradeDetails23.mmTradeIdentification, SecuritiesTradeDetails29.mmTradeIdentification, Identification5.mmTradeIdentification, Identification8.mmTradeIdentification,
							Identification11.mmTradeIdentification, Identification13.mmTradeIdentification, References8Choice.mmOtherTransactionIdentification, References17Choice.mmOtherTransactionIdentification,
							SettlementTypeAndIdentification6.mmTransactionIdentification, References7Choice.mmOtherTransactionIdentification, References23Choice.mmOtherTransactionIdentification,
							References30Choice.mmOtherTransactionIdentification, Identification9.mmTradeIdentification, OriginalPaymentInstruction3.mmOriginalPaymentInformationIdentification, NotificationItem4.mmIdentification,
							OriginalItemAndStatus3.mmOriginalItemIdentification, TradeLeg2.mmTradeLegIdentification, TradeLeg5.mmTradeLegIdentification, TradeLeg3.mmTradeLegIdentification, TradeLeg6.mmTradeLegIdentification,
							TradeLeg4.mmTradeLegIdentification, TradeLeg7.mmTradeLegIdentification, IndividualOrderStatusAndReason3.mmDealReference, References34Choice.mmOtherTransactionIdentification, Transaction25.mmTradeIdentification,
							References35Choice.mmTradeIdentification, Identification3.mmTradeIdentification, AdditionalParameters16.mmPreviousPartialConfirmationIdentification, MessageAndBusinessReference7.mmCancellationReference,
							References39Choice.mmPreviousReference, References39Choice.mmOtherReference, TransactionDetails61.mmTradeIdentification, Transaction34.mmTradeIdentification,
							TransactionDetails64.mmOtherTransactionIdentification, Transaction35.mmTradeIdentification, Transaction36.mmTradeIdentification, TransactionReferences4.mmPaymentInformationIdentification,
							SecuritiesTradeDetails31.mmTradeIdentification, SecuritiesTradeDetails33.mmTradeIdentification, SecuritiesTradeDetails35.mmTradeIdentification, SecuritiesTradeDetails36.mmTradeIdentification,
							SecuritiesTradeDetails34.mmTradeIdentification, SecuritiesTradeDetails32.mmTradeIdentification, References16.mmTradeIdentification, SecuritiesTradeDetails44.mmTradeIdentification,
							SecuritiesTradeDetails43.mmTradeIdentification, SecuritiesTradeDetails41.mmTradeIdentification, Transaction38.mmTradeIdentification, TransactionDetails66.mmTradeIdentification,
							TransactionDetails65.mmOtherTransactionIdentification, SecuritiesTradeDetails42.mmTradeIdentification, References17.mmTradeIdentification, Transaction39.mmTradeIdentification,
							SecuritiesTradeDetails46.mmTradeIdentification, SecuritiesTradeDetails47.mmTradeIdentification, Transaction37.mmTradeIdentification, TradeAgreement12.mmRelatedReference,
							PaymentInstruction16.mmPaymentInformationIdentification, OriginalPaymentInstruction12.mmOriginalPaymentInformationIdentification, OriginalPaymentInstruction11.mmOriginalPaymentInformationIdentification,
							PaymentInstruction15.mmPaymentInformationIdentification, OriginalPaymentInstruction13.mmOriginalPaymentInformationIdentification, OriginalPaymentInstruction10.mmOriginalPaymentInformationIdentification,
							OriginalItemAndStatus4.mmOriginalItemIdentification, NotificationItem5.mmIdentification, TradeLeg8.mmTradeLegIdentification, Transaction41.mmTradeIdentification, TransactionDetails70.mmTradeIdentification,
							Transaction40.mmTradeIdentification, TradeLeg10.mmTradeLegIdentification, TradeLeg9.mmTradeLegIdentification, PaymentInstruction17.mmPaymentInformationIdentification,
							OriginalPaymentInstruction14.mmOriginalPaymentInformationIdentification, Transaction43.mmTradeIdentification, TransactionDetails71.mmTradeIdentification, Transaction42.mmTradeIdentification,
							ForeignExchangeSwapTransaction1.mmProprietaryTransactionIdentification, UnsecuredMarketTransaction1.mmProprietaryTransactionIdentification, OvernightIndexSwapTransaction1.mmProprietaryTransactionIdentification,
							SecuredMarketTransaction1.mmProprietaryTransactionIdentification, SecuritiesTradeDetails49.mmTradeIdentification, Transaction47.mmTradeIdentification, TransactionDetails76.mmOtherTransactionIdentification,
							TransactionDetails79.mmTradeIdentification, Transaction45.mmTradeIdentification, Transaction46.mmTradeIdentification, CertificateIdentification1.mmPaymentInformationIdentification,
							Trade2.mmProductIdentification, Trade1.mmProductIdentification, References45Choice.mmOtherTransactionIdentification, SettlementTypeAndIdentification18.mmTransactionIdentification,
							SecuritiesTradeDetails51.mmTradeIdentification, SecuritiesTradeDetails53.mmTradeIdentification, AdditionalParameters24.mmPreviousPartialConfirmationIdentification,
							AdditionalParameters22.mmPreviousPartialConfirmationIdentification, AdditionalParameters21.mmPreviousPartialConfirmationIdentification, SecuritiesTradeDetails54.mmTradeIdentification,
							SecuritiesTradeDetails52.mmTradeIdentification, References46Choice.mmTradeIdentification, References46Choice.mmOtherTransactionIdentification, Identification15.mmTradeIdentification,
							SecuritiesTradeDetails50.mmTradeIdentification, References41Choice.mmOtherTransactionIdentification, References44Choice.mmOtherTransactionIdentification, References47Choice.mmOtherTransactionIdentification,
							References18.mmTradeIdentification, PaymentInstruction18.mmPaymentInformationIdentification, OriginalPaymentInstruction16.mmOriginalPaymentInformationIdentification,
							OriginalPaymentInstruction18.mmOriginalPaymentInformationIdentification, PaymentInstruction19.mmPaymentInformationIdentification, PaymentInstruction20.mmPaymentInformationIdentification,
							OriginalPaymentInstruction15.mmOriginalPaymentInformationIdentification, OriginalItemAndStatus5.mmOriginalItemIdentification, OriginalPaymentInstruction17.mmOriginalPaymentInformationIdentification,
							NotificationItem6.mmIdentification, SettlementTypeAndIdentification20.mmTransactionIdentification, MessageAndBusinessReference8.mmCancellationReference, References48Choice.mmPreviousReference,
							References48Choice.mmOtherReference, OriginalPaymentInstruction19.mmOriginalPaymentInformationIdentification, SettlementTypeAndIdentification21.mmTransactionIdentification,
							References60Choice.mmOtherTransactionIdentification, Transaction49.mmTradeIdentification, AdditionalParameters26.mmPreviousPartialConfirmationIdentification, SecuritiesTradeDetails61.mmTradeIdentification,
							AdditionalParameters25.mmPreviousPartialConfirmationIdentification, SecuritiesTradeDetails63.mmTradeIdentification, SecuritiesTradeDetails62.mmTradeIdentification,
							AdditionalParameters27.mmPreviousPartialConfirmationIdentification, TransactionDetails85.mmOtherTransactionIdentification, TransactionDetails87.mmTradeIdentification,
							SecuritiesTradeDetails60.mmTradeIdentification, References58Choice.mmOtherTransactionIdentification, Identification24.mmTradeIdentification, Transaction50.mmTradeIdentification,
							References50Choice.mmOtherTransactionIdentification, Transaction48.mmTradeIdentification, References21.mmTradeIdentification, SettlementTypeAndIdentification22.mmTransactionIdentification,
							SecuritiesTradeDetails65.mmTradeIdentification, References59Choice.mmOtherTransactionIdentification, References54Choice.mmTradeIdentification, References54Choice.mmOtherTransactionIdentification,
							SecuritiesTradeDetails66.mmTradeIdentification, UnsecuredMarketTransaction2.mmProprietaryTransactionIdentification, ForeignExchangeSwapTransaction2.mmProprietaryTransactionIdentification,
							SecuredMarketTransaction2.mmProprietaryTransactionIdentification, UnsecuredMarketTransaction3.mmProprietaryTransactionIdentification, OvernightIndexSwapTransaction3.mmProprietaryTransactionIdentification,
							SecuredMarketTransaction3.mmProprietaryTransactionIdentification, IndividualOrderConfirmationStatusAndReason2.mmDealReference, MessageAndBusinessReference10.mmReference,
							MessageAndBusinessReference10.mmRelatedReference, IndividualOrderStatusAndReason7.mmDealReference, SecuritiesTransactionReport4.mmTransactionIdentification,
							PaymentInstruction21.mmPaymentInformationIdentification, OriginalPaymentInstruction23.mmOriginalPaymentInformationIdentification, OriginalPaymentInstruction21.mmOriginalPaymentInformationIdentification,
							PaymentInstruction23.mmPaymentInformationIdentification, OriginalPaymentInstruction24.mmOriginalPaymentInformationIdentification, PaymentInstruction22.mmPaymentInformationIdentification,
							OriginalPaymentInstruction22.mmOriginalPaymentInformationIdentification, OriginalPaymentInstruction20.mmOriginalPaymentInformationIdentification, CorrectivePaymentInitiation2.mmPaymentInformationIdentification,
							AdditionalParameters29.mmPreviousPartialConfirmationIdentification, SecuritiesTradeDetails67.mmTradeIdentification, Transaction53.mmTradeIdentification, SecuritiesTradeDetails68.mmTradeIdentification,
							TransactionDetails97.mmTradeIdentification, Transaction54.mmTradeIdentification, Transaction52.mmTradeIdentification, SecuritiesTradeDetails69.mmTradeIdentification,
							AdditionalParameters31.mmPreviousPartialConfirmationIdentification, Transaction57.mmTradeIdentification, SecuritiesTradeDetails70.mmTradeIdentification, Transaction56.mmTradeIdentification,
							TransactionDetails100.mmTradeIdentification, Transaction55.mmTradeIdentification, TransactionDetails101.mmOtherTransactionIdentification, FixingConditions1.mmOriginatorReference,
							SecuredMarketTransaction4.mmProprietaryTransactionIdentification, SecuredMarketTransaction4.mmRelatedProprietaryTransactionIdentification, ForeignExchangeSwapTransaction3.mmProprietaryTransactionIdentification,
							ForeignExchangeSwapTransaction3.mmRelatedProprietaryTransactionIdentification, OvernightIndexSwapTransaction4.mmProprietaryTransactionIdentification,
							OvernightIndexSwapTransaction4.mmRelatedProprietaryTransactionIdentification, UnsecuredMarketTransaction4.mmProprietaryTransactionIdentification,
							UnsecuredMarketTransaction4.mmRelatedProprietaryTransactionIdentification);
			elementContext_lazy = () -> com.tools20022.repository.entity.TradeIdentification.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Reference assigned to the trade by the investor or the trading party. This reference will be used throughout the trade life cycle to access/update the trade details.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TradeIdentification.class.getMethod("getIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text commonIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters6#mmCommonIdentification
	 * SettlementTypeAndAdditionalParameters6.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters5#mmCommonIdentification
	 * SettlementTypeAndAdditionalParameters5.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters7#mmCommonIdentification
	 * SettlementTypeAndAdditionalParameters7.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters8#mmCommonIdentification
	 * SettlementTypeAndAdditionalParameters8.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters3#mmCommonIdentification
	 * TransactionTypeAndAdditionalParameters3.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters6#mmCommonIdentification
	 * TransactionTypeAndAdditionalParameters6.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters1#mmCommonIdentification
	 * TransactionTypeAndAdditionalParameters1.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters4#mmCommonIdentification
	 * TransactionTypeAndAdditionalParameters4.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References1#mmCommonIdentification
	 * References1.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References6Choice#mmCommonIdentification
	 * References6Choice.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References2#mmCommonIdentification
	 * References2.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References10Choice#mmCommonIdentification
	 * References10Choice.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References7#mmCommonIdentification
	 * References7.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References13Choice#mmCommonIdentification
	 * References13Choice.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References8#mmCommonIdentification
	 * References8.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References15Choice#mmCommonIdentification
	 * References15Choice.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References9#mmCommonIdentification
	 * References9.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References24Choice#mmCommonIdentification
	 * References24Choice.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References13#mmCommonIdentification
	 * References13.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References31Choice#mmCommonIdentification
	 * References31Choice.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification1#mmCommonIdentification
	 * SettlementTypeAndIdentification1.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification8#mmCommonIdentification
	 * SettlementTypeAndIdentification8.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification9#mmCommonIdentification
	 * SettlementTypeAndIdentification9.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification11#mmCommonIdentification
	 * SettlementTypeAndIdentification11.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification15#mmCommonIdentification
	 * SettlementTypeAndIdentification15.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification17#mmCommonIdentification
	 * SettlementTypeAndIdentification17.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification10#mmCommonIdentification
	 * SettlementTypeAndIdentification10.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification12#mmCommonIdentification
	 * SettlementTypeAndIdentification12.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters1#mmCommonIdentification
	 * SettlementTypeAndAdditionalParameters1.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters4#mmCommonIdentification
	 * SettlementTypeAndAdditionalParameters4.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters9#mmCommonIdentification
	 * SettlementTypeAndAdditionalParameters9.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters10#mmCommonIdentification
	 * SettlementTypeAndAdditionalParameters10.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications2#mmCommonIdentification
	 * TransactionIdentifications2.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications7#mmCommonIdentification
	 * TransactionIdentifications7.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications9#mmCommonIdentification
	 * TransactionIdentifications9.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications13#mmCommonIdentification
	 * TransactionIdentifications13.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications16#mmCommonIdentification
	 * TransactionIdentifications16.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications22#mmCommonIdentification
	 * TransactionIdentifications22.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction7#mmCommonIdentification
	 * Transaction7.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction8#mmCommonIdentification
	 * Transaction8.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction9#mmCommonIdentification
	 * Transaction9.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction10#mmCommonIdentification
	 * Transaction10.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction14#mmCommonIdentification
	 * Transaction14.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction12#mmCommonIdentification
	 * Transaction12.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction15#mmCommonIdentification
	 * Transaction15.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction16#mmCommonIdentification
	 * Transaction16.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction20#mmCommonIdentification
	 * Transaction20.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction19#mmCommonIdentification
	 * Transaction19.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction23#mmCommonIdentification
	 * Transaction23.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction22#mmCommonIdentification
	 * Transaction22.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction28#mmCommonIdentification
	 * Transaction28.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction27#mmCommonIdentification
	 * Transaction27.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction30#mmCommonIdentification
	 * Transaction30.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction31#mmCommonIdentification
	 * Transaction31.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction6#mmCommonIdentification
	 * Transaction6.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction11#mmCommonIdentification
	 * Transaction11.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction13#mmCommonIdentification
	 * Transaction13.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction17#mmCommonIdentification
	 * Transaction17.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction18#mmCommonIdentification
	 * Transaction18.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction21#mmCommonIdentification
	 * Transaction21.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction29#mmCommonIdentification
	 * Transaction29.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction32#mmCommonIdentification
	 * Transaction32.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification2#mmCommonIdentification
	 * Identification2.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference8Choice#mmCommonIdentification
	 * IdentificationReference8Choice.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference11Choice#mmCommonIdentification
	 * IdentificationReference11Choice.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement2#mmCommonReference
	 * TradeAgreement2.mmCommonReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement4#mmCommonReference
	 * TradeAgreement4.mmCommonReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement8#mmCommonReference
	 * TradeAgreement8.mmCommonReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement1#mmCommonReference
	 * TradeAgreement1.mmCommonReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement3#mmCommonReference
	 * TradeAgreement3.mmCommonReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement7#mmCommonReference
	 * TradeAgreement7.mmCommonReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement5#mmCommonReference
	 * TradeAgreement5.mmCommonReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement9#mmCommonReference
	 * TradeAgreement9.mmCommonReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails7#mmCommonIdentification
	 * SecuritiesTradeDetails7.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails19#mmCommonIdentification
	 * SecuritiesTradeDetails19.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters2#mmCommonIdentification
	 * TransactionTypeAndAdditionalParameters2.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters7#mmCommonIdentification
	 * TransactionTypeAndAdditionalParameters7.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications1#mmCommonIdentification
	 * TransactionIdentifications1.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters2#mmCommonIdentification
	 * SettlementTypeAndAdditionalParameters2.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails4#mmCommonIdentification
	 * SecuritiesTradeDetails4.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails17#mmCommonIdentification
	 * SecuritiesTradeDetails17.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification7#mmCommonIdentification
	 * Identification7.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification6#mmCommonIdentification
	 * Identification6.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OpeningData1#mmCommonReference
	 * OpeningData1.mmCommonReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ClosingData1#mmCommonReference
	 * ClosingData1.mmCommonReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OpeningData2#mmCommonReference
	 * OpeningData2.mmCommonReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ClosingData2#mmCommonReference
	 * ClosingData2.mmCommonReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OptionData1#mmCommonReference
	 * OptionData1.mmCommonReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OptionData2#mmCommonReference
	 * OptionData2.mmCommonReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters5#mmCommonIdentification
	 * TransactionTypeAndAdditionalParameters5.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters8#mmCommonIdentification
	 * TransactionTypeAndAdditionalParameters8.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications6#mmCommonIdentification
	 * TransactionIdentifications6.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters3#mmCommonIdentification
	 * SettlementTypeAndAdditionalParameters3.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails10#mmCommonIdentification
	 * SecuritiesTradeDetails10.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails22#mmCommonIdentification
	 * SecuritiesTradeDetails22.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails23#mmCommonIdentification
	 * SecuritiesTradeDetails23.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails29#mmCommonIdentification
	 * SecuritiesTradeDetails29.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification5#mmCommonIdentification
	 * Identification5.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification8#mmCommonIdentification
	 * Identification8.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification11#mmCommonIdentification
	 * Identification11.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification13#mmCommonIdentification
	 * Identification13.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification9#mmCommonIdentification
	 * Identification9.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails14#mmCommonIdentification
	 * SecuritiesTradeDetails14.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails20#mmCommonIdentification
	 * SecuritiesTradeDetails20.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails24#mmCommonIdentification
	 * SecuritiesTradeDetails24.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails30#mmCommonIdentification
	 * SecuritiesTradeDetails30.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction25#mmCommonIdentification
	 * Transaction25.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References35Choice#mmCommonIdentification
	 * References35Choice.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification3#mmCommonIdentification
	 * Identification3.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OptionData3#mmCommonReference
	 * OptionData3.mmCommonReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OptionData4#mmCommonReference
	 * OptionData4.mmCommonReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction34#mmCommonIdentification
	 * Transaction34.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction35#mmCommonIdentification
	 * Transaction35.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction36#mmCommonIdentification
	 * Transaction36.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails35#mmCommonIdentification
	 * SecuritiesTradeDetails35.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References16#mmCommonIdentification
	 * References16.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction38#mmCommonIdentification
	 * Transaction38.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails42#mmCommonIdentification
	 * SecuritiesTradeDetails42.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References17#mmCommonIdentification
	 * References17.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction39#mmCommonIdentification
	 * Transaction39.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction37#mmCommonIdentification
	 * Transaction37.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement11#mmCommonReference
	 * TradeAgreement11.mmCommonReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement12#mmCommonReference
	 * TradeAgreement12.mmCommonReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement10#mmCommonReference
	 * TradeAgreement10.mmCommonReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction41#mmCommonIdentification
	 * Transaction41.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction40#mmCommonIdentification
	 * Transaction40.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction43#mmCommonIdentification
	 * Transaction43.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction42#mmCommonIdentification
	 * Transaction42.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransaction1#mmTradePlaceMatchingIdentification
	 * SecuritiesTransaction1.mmTradePlaceMatchingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransaction1#mmComplexTradeComponentIdentification
	 * SecuritiesTransaction1.mmComplexTradeComponentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails49#mmCommonIdentification
	 * SecuritiesTradeDetails49.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction47#mmCommonIdentification
	 * Transaction47.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48#mmCommonIdentification
	 * SecuritiesTradeDetails48.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction45#mmCommonIdentification
	 * Transaction45.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction46#mmCommonIdentification
	 * Transaction46.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification19#mmCommonIdentification
	 * SettlementTypeAndIdentification19.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications31#mmCommonIdentification
	 * TransactionIdentifications31.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters10#mmCommonIdentification
	 * TransactionTypeAndAdditionalParameters10.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters11#mmCommonIdentification
	 * SettlementTypeAndAdditionalParameters11.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters9#mmCommonIdentification
	 * TransactionTypeAndAdditionalParameters9.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters11#mmCommonIdentification
	 * TransactionTypeAndAdditionalParameters11.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters12#mmCommonIdentification
	 * SettlementTypeAndAdditionalParameters12.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications32#mmCommonIdentification
	 * TransactionIdentifications32.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters14#mmCommonIdentification
	 * SettlementTypeAndAdditionalParameters14.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References46Choice#mmCommonIdentification
	 * References46Choice.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification15#mmCommonIdentification
	 * Identification15.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters13#mmCommonIdentification
	 * SettlementTypeAndAdditionalParameters13.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References18#mmCommonIdentification
	 * References18.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails57#mmCommonIdentification
	 * SecuritiesTradeDetails57.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters13#mmCommonIdentification
	 * TransactionTypeAndAdditionalParameters13.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications35#mmCommonIdentification
	 * TransactionIdentifications35.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction49#mmCommonIdentification
	 * Transaction49.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters14#mmCommonIdentification
	 * TransactionTypeAndAdditionalParameters14.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters12#mmCommonIdentification
	 * TransactionTypeAndAdditionalParameters12.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails61#mmCommonIdentification
	 * SecuritiesTradeDetails61.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters16#mmCommonIdentification
	 * SettlementTypeAndAdditionalParameters16.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification24#mmCommonIdentification
	 * SettlementTypeAndIdentification24.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications38#mmCommonIdentification
	 * TransactionIdentifications38.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters15#mmCommonIdentification
	 * SettlementTypeAndAdditionalParameters15.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification24#mmCommonIdentification
	 * Identification24.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction50#mmCommonIdentification
	 * Transaction50.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction48#mmCommonIdentification
	 * Transaction48.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters18#mmCommonIdentification
	 * SettlementTypeAndAdditionalParameters18.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References21#mmCommonIdentification
	 * References21.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters17#mmCommonIdentification
	 * SettlementTypeAndAdditionalParameters17.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References54Choice#mmCommonIdentification
	 * References54Choice.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement15#mmCommonReference
	 * TradeAgreement15.mmCommonReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement14#mmCommonReference
	 * TradeAgreement14.mmCommonReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters19#mmCommonIdentification
	 * SettlementTypeAndAdditionalParameters19.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction53#mmCommonIdentification
	 * Transaction53.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#mmCommonIdentification
	 * SecuritiesTradeDetails68.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters15#mmCommonIdentification
	 * TransactionTypeAndAdditionalParameters15.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters17#mmCommonIdentification
	 * TransactionTypeAndAdditionalParameters17.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters16#mmCommonIdentification
	 * TransactionTypeAndAdditionalParameters16.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction54#mmCommonIdentification
	 * Transaction54.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction52#mmCommonIdentification
	 * Transaction52.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters19#mmCommonIdentification
	 * TransactionTypeAndAdditionalParameters19.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails69#mmCommonIdentification
	 * SecuritiesTradeDetails69.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters20#mmCommonIdentification
	 * TransactionTypeAndAdditionalParameters20.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction57#mmCommonIdentification
	 * Transaction57.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters18#mmCommonIdentification
	 * TransactionTypeAndAdditionalParameters18.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters20#mmCommonIdentification
	 * SettlementTypeAndAdditionalParameters20.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction56#mmCommonIdentification
	 * Transaction56.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction55#mmCommonIdentification
	 * Transaction55.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FixingConditions1#mmCommonReference
	 * FixingConditions1.mmCommonReference}</li>
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
	public static final MMBusinessAttribute mmCommonIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementTypeAndAdditionalParameters6.mmCommonIdentification, SettlementTypeAndAdditionalParameters5.mmCommonIdentification, SettlementTypeAndAdditionalParameters7.mmCommonIdentification,
					SettlementTypeAndAdditionalParameters8.mmCommonIdentification, TransactionTypeAndAdditionalParameters3.mmCommonIdentification, TransactionTypeAndAdditionalParameters6.mmCommonIdentification,
					TransactionTypeAndAdditionalParameters1.mmCommonIdentification, TransactionTypeAndAdditionalParameters4.mmCommonIdentification, References1.mmCommonIdentification, References6Choice.mmCommonIdentification,
					References2.mmCommonIdentification, References10Choice.mmCommonIdentification, References7.mmCommonIdentification, References13Choice.mmCommonIdentification, References8.mmCommonIdentification,
					References15Choice.mmCommonIdentification, References9.mmCommonIdentification, References24Choice.mmCommonIdentification, References13.mmCommonIdentification, References31Choice.mmCommonIdentification,
					SettlementTypeAndIdentification1.mmCommonIdentification, SettlementTypeAndIdentification8.mmCommonIdentification, SettlementTypeAndIdentification9.mmCommonIdentification,
					SettlementTypeAndIdentification11.mmCommonIdentification, SettlementTypeAndIdentification15.mmCommonIdentification, SettlementTypeAndIdentification17.mmCommonIdentification,
					SettlementTypeAndIdentification10.mmCommonIdentification, SettlementTypeAndIdentification12.mmCommonIdentification, SettlementTypeAndAdditionalParameters1.mmCommonIdentification,
					SettlementTypeAndAdditionalParameters4.mmCommonIdentification, SettlementTypeAndAdditionalParameters9.mmCommonIdentification, SettlementTypeAndAdditionalParameters10.mmCommonIdentification,
					TransactionIdentifications2.mmCommonIdentification, TransactionIdentifications7.mmCommonIdentification, TransactionIdentifications9.mmCommonIdentification, TransactionIdentifications13.mmCommonIdentification,
					TransactionIdentifications16.mmCommonIdentification, TransactionIdentifications22.mmCommonIdentification, Transaction7.mmCommonIdentification, Transaction8.mmCommonIdentification, Transaction9.mmCommonIdentification,
					Transaction10.mmCommonIdentification, Transaction14.mmCommonIdentification, Transaction12.mmCommonIdentification, Transaction15.mmCommonIdentification, Transaction16.mmCommonIdentification,
					Transaction20.mmCommonIdentification, Transaction19.mmCommonIdentification, Transaction23.mmCommonIdentification, Transaction22.mmCommonIdentification, Transaction28.mmCommonIdentification,
					Transaction27.mmCommonIdentification, Transaction30.mmCommonIdentification, Transaction31.mmCommonIdentification, Transaction6.mmCommonIdentification, Transaction11.mmCommonIdentification,
					Transaction13.mmCommonIdentification, Transaction17.mmCommonIdentification, Transaction18.mmCommonIdentification, Transaction21.mmCommonIdentification, Transaction29.mmCommonIdentification,
					Transaction32.mmCommonIdentification, Identification2.mmCommonIdentification, IdentificationReference8Choice.mmCommonIdentification, IdentificationReference11Choice.mmCommonIdentification,
					TradeAgreement2.mmCommonReference, TradeAgreement4.mmCommonReference, TradeAgreement8.mmCommonReference, TradeAgreement1.mmCommonReference, TradeAgreement3.mmCommonReference, TradeAgreement7.mmCommonReference,
					TradeAgreement5.mmCommonReference, TradeAgreement9.mmCommonReference, SecuritiesTradeDetails7.mmCommonIdentification, SecuritiesTradeDetails19.mmCommonIdentification,
					TransactionTypeAndAdditionalParameters2.mmCommonIdentification, TransactionTypeAndAdditionalParameters7.mmCommonIdentification, TransactionIdentifications1.mmCommonIdentification,
					SettlementTypeAndAdditionalParameters2.mmCommonIdentification, SecuritiesTradeDetails4.mmCommonIdentification, SecuritiesTradeDetails17.mmCommonIdentification, Identification7.mmCommonIdentification,
					Identification6.mmCommonIdentification, OpeningData1.mmCommonReference, ClosingData1.mmCommonReference, OpeningData2.mmCommonReference, ClosingData2.mmCommonReference, OptionData1.mmCommonReference,
					OptionData2.mmCommonReference, TransactionTypeAndAdditionalParameters5.mmCommonIdentification, TransactionTypeAndAdditionalParameters8.mmCommonIdentification, TransactionIdentifications6.mmCommonIdentification,
					SettlementTypeAndAdditionalParameters3.mmCommonIdentification, SecuritiesTradeDetails10.mmCommonIdentification, SecuritiesTradeDetails22.mmCommonIdentification, SecuritiesTradeDetails23.mmCommonIdentification,
					SecuritiesTradeDetails29.mmCommonIdentification, Identification5.mmCommonIdentification, Identification8.mmCommonIdentification, Identification11.mmCommonIdentification, Identification13.mmCommonIdentification,
					Identification9.mmCommonIdentification, SecuritiesTradeDetails14.mmCommonIdentification, SecuritiesTradeDetails20.mmCommonIdentification, SecuritiesTradeDetails24.mmCommonIdentification,
					SecuritiesTradeDetails30.mmCommonIdentification, Transaction25.mmCommonIdentification, References35Choice.mmCommonIdentification, Identification3.mmCommonIdentification, OptionData3.mmCommonReference,
					OptionData4.mmCommonReference, Transaction34.mmCommonIdentification, Transaction35.mmCommonIdentification, Transaction36.mmCommonIdentification, SecuritiesTradeDetails35.mmCommonIdentification,
					References16.mmCommonIdentification, Transaction38.mmCommonIdentification, SecuritiesTradeDetails42.mmCommonIdentification, References17.mmCommonIdentification, Transaction39.mmCommonIdentification,
					Transaction37.mmCommonIdentification, TradeAgreement11.mmCommonReference, TradeAgreement12.mmCommonReference, TradeAgreement10.mmCommonReference, Transaction41.mmCommonIdentification,
					Transaction40.mmCommonIdentification, Transaction43.mmCommonIdentification, Transaction42.mmCommonIdentification, SecuritiesTransaction1.mmTradePlaceMatchingIdentification,
					SecuritiesTransaction1.mmComplexTradeComponentIdentification, SecuritiesTradeDetails49.mmCommonIdentification, Transaction47.mmCommonIdentification, SecuritiesTradeDetails48.mmCommonIdentification,
					Transaction45.mmCommonIdentification, Transaction46.mmCommonIdentification, SettlementTypeAndIdentification19.mmCommonIdentification, TransactionIdentifications31.mmCommonIdentification,
					TransactionTypeAndAdditionalParameters10.mmCommonIdentification, SettlementTypeAndAdditionalParameters11.mmCommonIdentification, TransactionTypeAndAdditionalParameters9.mmCommonIdentification,
					TransactionTypeAndAdditionalParameters11.mmCommonIdentification, SettlementTypeAndAdditionalParameters12.mmCommonIdentification, TransactionIdentifications32.mmCommonIdentification,
					SettlementTypeAndAdditionalParameters14.mmCommonIdentification, References46Choice.mmCommonIdentification, Identification15.mmCommonIdentification, SettlementTypeAndAdditionalParameters13.mmCommonIdentification,
					References18.mmCommonIdentification, SecuritiesTradeDetails57.mmCommonIdentification, TransactionTypeAndAdditionalParameters13.mmCommonIdentification, TransactionIdentifications35.mmCommonIdentification,
					Transaction49.mmCommonIdentification, TransactionTypeAndAdditionalParameters14.mmCommonIdentification, TransactionTypeAndAdditionalParameters12.mmCommonIdentification, SecuritiesTradeDetails61.mmCommonIdentification,
					SettlementTypeAndAdditionalParameters16.mmCommonIdentification, SettlementTypeAndIdentification24.mmCommonIdentification, TransactionIdentifications38.mmCommonIdentification,
					SettlementTypeAndAdditionalParameters15.mmCommonIdentification, Identification24.mmCommonIdentification, Transaction50.mmCommonIdentification, Transaction48.mmCommonIdentification,
					SettlementTypeAndAdditionalParameters18.mmCommonIdentification, References21.mmCommonIdentification, SettlementTypeAndAdditionalParameters17.mmCommonIdentification, References54Choice.mmCommonIdentification,
					TradeAgreement15.mmCommonReference, TradeAgreement14.mmCommonReference, SettlementTypeAndAdditionalParameters19.mmCommonIdentification, Transaction53.mmCommonIdentification,
					SecuritiesTradeDetails68.mmCommonIdentification, TransactionTypeAndAdditionalParameters15.mmCommonIdentification, TransactionTypeAndAdditionalParameters17.mmCommonIdentification,
					TransactionTypeAndAdditionalParameters16.mmCommonIdentification, Transaction54.mmCommonIdentification, Transaction52.mmCommonIdentification, TransactionTypeAndAdditionalParameters19.mmCommonIdentification,
					SecuritiesTradeDetails69.mmCommonIdentification, TransactionTypeAndAdditionalParameters20.mmCommonIdentification, Transaction57.mmCommonIdentification, TransactionTypeAndAdditionalParameters18.mmCommonIdentification,
					SettlementTypeAndAdditionalParameters20.mmCommonIdentification, Transaction56.mmCommonIdentification, Transaction55.mmCommonIdentification, FixingConditions1.mmCommonReference);
			elementContext_lazy = () -> com.tools20022.repository.entity.TradeIdentification.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CommonIdentification";
			definition = "Unique reference agreed upon by the two trade counterparties to identify the trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TradeIdentification.class.getMethod("getCommonIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text matchingReference;
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
	 * {@linkplain com.tools20022.repository.msg.TradeData8#mmMatchingSystemUniqueReference
	 * TradeData8.mmMatchingSystemUniqueReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData8#mmMatchingSystemMatchingReference
	 * TradeData8.mmMatchingSystemMatchingReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData8#mmMatchingSystemMatchedSideReference
	 * TradeData8.mmMatchingSystemMatchedSideReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingSystemReference1Choice#mmMatchingSystemUniqueReference
	 * MatchingSystemReference1Choice.mmMatchingSystemUniqueReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement8#mmMatchingSystemReference
	 * TradeAgreement8.mmMatchingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData9#mmMatchingSystemUniqueReference
	 * TradeData9.mmMatchingSystemUniqueReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData9#mmMatchingSystemMatchingReference
	 * TradeData9.mmMatchingSystemMatchingReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData9#mmMatchingSystemMatchedSideReference
	 * TradeData9.mmMatchingSystemMatchedSideReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData7#mmMatchingSystemUniqueReference
	 * TradeData7.mmMatchingSystemUniqueReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData7#mmMatchingSystemMatchingReference
	 * TradeData7.mmMatchingSystemMatchingReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData7#mmMatchingSystemMatchedSideReference
	 * TradeData7.mmMatchingSystemMatchedSideReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeStatus1#mmMatchingSystemUniqueReference
	 * TradeStatus1.mmMatchingSystemUniqueReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement11#mmMatchingSystemReference
	 * TradeAgreement11.mmMatchingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData11#mmMatchingSystemUniqueReference
	 * TradeData11.mmMatchingSystemUniqueReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData11#mmMatchingSystemMatchingReference
	 * TradeData11.mmMatchingSystemMatchingReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData11#mmMatchingSystemMatchedSideReference
	 * TradeData11.mmMatchingSystemMatchedSideReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData14#mmMatchingSystemUniqueReference
	 * TradeData14.mmMatchingSystemUniqueReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData14#mmMatchingSystemMatchingReference
	 * TradeData14.mmMatchingSystemMatchingReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData14#mmMatchingSystemMatchedSideReference
	 * TradeData14.mmMatchingSystemMatchedSideReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement15#mmMatchingSystemReference
	 * TradeAgreement15.mmMatchingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData15#mmMatchingSystemUniqueReference
	 * TradeData15.mmMatchingSystemUniqueReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData15#mmMatchingSystemMatchingReference
	 * TradeData15.mmMatchingSystemMatchingReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData15#mmMatchingSystemMatchedSideReference
	 * TradeData15.mmMatchingSystemMatchedSideReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData16#mmMatchingSystemUniqueReference
	 * TradeData16.mmMatchingSystemUniqueReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData16#mmMatchingSystemMatchingReference
	 * TradeData16.mmMatchingSystemMatchingReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData16#mmMatchingSystemMatchedSideReference
	 * TradeData16.mmMatchingSystemMatchedSideReference}</li>
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
	public static final MMBusinessAttribute mmMatchingReference = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TradeData8.mmMatchingSystemUniqueReference, TradeData8.mmMatchingSystemMatchingReference, TradeData8.mmMatchingSystemMatchedSideReference,
					MatchingSystemReference1Choice.mmMatchingSystemUniqueReference, TradeAgreement8.mmMatchingSystemReference, TradeData9.mmMatchingSystemUniqueReference, TradeData9.mmMatchingSystemMatchingReference,
					TradeData9.mmMatchingSystemMatchedSideReference, TradeData7.mmMatchingSystemUniqueReference, TradeData7.mmMatchingSystemMatchingReference, TradeData7.mmMatchingSystemMatchedSideReference,
					TradeStatus1.mmMatchingSystemUniqueReference, TradeAgreement11.mmMatchingSystemReference, TradeData11.mmMatchingSystemUniqueReference, TradeData11.mmMatchingSystemMatchingReference,
					TradeData11.mmMatchingSystemMatchedSideReference, TradeData14.mmMatchingSystemUniqueReference, TradeData14.mmMatchingSystemMatchingReference, TradeData14.mmMatchingSystemMatchedSideReference,
					TradeAgreement15.mmMatchingSystemReference, TradeData15.mmMatchingSystemUniqueReference, TradeData15.mmMatchingSystemMatchingReference, TradeData15.mmMatchingSystemMatchedSideReference,
					TradeData16.mmMatchingSystemUniqueReference, TradeData16.mmMatchingSystemMatchingReference, TradeData16.mmMatchingSystemMatchedSideReference);
			elementContext_lazy = () -> com.tools20022.repository.entity.TradeIdentification.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MatchingReference";
			definition = "Reference assigned by a matching system when the trade is matched.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TradeIdentification.class.getMethod("getMatchingReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Trade trade;
	/**
	 * Specifies the trade for which identifications are provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeRelatedIdentifications
	 * Trade.mmTradeRelatedIdentifications}</li>
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
	public static final MMBusinessAssociationEnd mmTrade = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.TradeIdentification.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Trade";
			definition = "Specifies the trade for which identifications are provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Trade.mmTradeRelatedIdentifications;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
		}
	};
	protected Max35Text uniqueTradeIdentifier;
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
	 * {@linkplain com.tools20022.repository.msg.UniqueTransactionIdentifier1#mmUniqueTransactionIdentifier
	 * UniqueTransactionIdentifier1.mmUniqueTransactionIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UniqueTransactionIdentifier1#mmPriorUniqueTransactionIdentifier
	 * UniqueTransactionIdentifier1.mmPriorUniqueTransactionIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting1#mmTradingSideUniqueTransactionIdentifier
	 * RegulatoryReporting1.mmTradingSideUniqueTransactionIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UniqueTransactionIdentifier2#mmUniqueTransactionIdentifier
	 * UniqueTransactionIdentifier2.mmUniqueTransactionIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UniqueTransactionIdentifier2#mmPriorUniqueTransactionIdentifier
	 * UniqueTransactionIdentifier2.mmPriorUniqueTransactionIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction1#mmUniqueTransactionIdentifier
	 * ForeignExchangeSwapTransaction1.mmUniqueTransactionIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction1#mmUniqueTransactionIdentifier
	 * UnsecuredMarketTransaction1.mmUniqueTransactionIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction1#mmUniqueTransactionIdentifier
	 * OvernightIndexSwapTransaction1.mmUniqueTransactionIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction1#mmUniqueTransactionIdentifier
	 * SecuredMarketTransaction1.mmUniqueTransactionIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionReport2#mmTransactionIdentification
	 * SecuritiesTransactionReport2.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction2#mmUniqueTransactionIdentifier
	 * UnsecuredMarketTransaction2.mmUniqueTransactionIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction2#mmUniqueTransactionIdentifier
	 * ForeignExchangeSwapTransaction2.mmUniqueTransactionIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction2#mmUniqueTransactionIdentifier
	 * SecuredMarketTransaction2.mmUniqueTransactionIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction3#mmUniqueTransactionIdentifier
	 * UnsecuredMarketTransaction3.mmUniqueTransactionIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction3#mmUniqueTransactionIdentifier
	 * OvernightIndexSwapTransaction3.mmUniqueTransactionIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction3#mmUniqueTransactionIdentifier
	 * SecuredMarketTransaction3.mmUniqueTransactionIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4#mmUniqueTransactionIdentifier
	 * SecuredMarketTransaction4.mmUniqueTransactionIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction3#mmUniqueTransactionIdentifier
	 * ForeignExchangeSwapTransaction3.mmUniqueTransactionIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction4#mmUniqueTransactionIdentifier
	 * OvernightIndexSwapTransaction4.mmUniqueTransactionIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4#mmUniqueTransactionIdentifier
	 * UnsecuredMarketTransaction4.mmUniqueTransactionIdentifier}</li>
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
	public static final MMBusinessAttribute mmUniqueTradeIdentifier = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(UniqueTransactionIdentifier1.mmUniqueTransactionIdentifier, UniqueTransactionIdentifier1.mmPriorUniqueTransactionIdentifier, RegulatoryReporting1.mmTradingSideUniqueTransactionIdentifier,
					UniqueTransactionIdentifier2.mmUniqueTransactionIdentifier, UniqueTransactionIdentifier2.mmPriorUniqueTransactionIdentifier, ForeignExchangeSwapTransaction1.mmUniqueTransactionIdentifier,
					UnsecuredMarketTransaction1.mmUniqueTransactionIdentifier, OvernightIndexSwapTransaction1.mmUniqueTransactionIdentifier, SecuredMarketTransaction1.mmUniqueTransactionIdentifier,
					SecuritiesTransactionReport2.mmTransactionIdentification, UnsecuredMarketTransaction2.mmUniqueTransactionIdentifier, ForeignExchangeSwapTransaction2.mmUniqueTransactionIdentifier,
					SecuredMarketTransaction2.mmUniqueTransactionIdentifier, UnsecuredMarketTransaction3.mmUniqueTransactionIdentifier, OvernightIndexSwapTransaction3.mmUniqueTransactionIdentifier,
					SecuredMarketTransaction3.mmUniqueTransactionIdentifier, SecuredMarketTransaction4.mmUniqueTransactionIdentifier, ForeignExchangeSwapTransaction3.mmUniqueTransactionIdentifier,
					OvernightIndexSwapTransaction4.mmUniqueTransactionIdentifier, UnsecuredMarketTransaction4.mmUniqueTransactionIdentifier);
			elementContext_lazy = () -> com.tools20022.repository.entity.TradeIdentification.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UniqueTradeIdentifier";
			definition = "This field specifies the unique transaction identifier (UTI) to be created at the time a transaction is first executed, shared with all registered entities and counterparties involved in the transaction, and used to track that particular transaction over its life. This identifier can also be known as the Unique Swap Identifier (USI).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TradeIdentification.class.getMethod("getUniqueTradeIdentifier", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.ClearingBrokerIdentification> clearingBrokerIdentification;
	/**
	 * Reference number assigned by the clearing broker.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ClearingBrokerIdentification#mmRelatedTradeIdentification
	 * ClearingBrokerIdentification.mmRelatedTradeIdentification}</li>
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
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting1#mmClearingBrokerIdentification
	 * RegulatoryReporting1.mmClearingBrokerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmClearingBrokerIdentification
	 * RegulatoryReporting4.mmClearingBrokerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation5#mmBrokersReference
	 * GeneralInformation5.mmBrokersReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmClearingBrokerIdentification
	 * RegulatoryReporting6.mmClearingBrokerIdentification}</li>
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
	public static final MMBusinessAssociationEnd mmClearingBrokerIdentification = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(RegulatoryReporting1.mmClearingBrokerIdentification, RegulatoryReporting4.mmClearingBrokerIdentification, GeneralInformation5.mmBrokersReference,
					RegulatoryReporting6.mmClearingBrokerIdentification);
			elementContext_lazy = () -> com.tools20022.repository.entity.TradeIdentification.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClearingBrokerIdentification";
			definition = "Reference number assigned by the clearing broker.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ClearingBrokerIdentification.mmRelatedTradeIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ClearingBrokerIdentification.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradeIdentification";
				definition = "Specifies the different identifications associated with a trade.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Trade.mmTradeRelatedIdentifications, com.tools20022.repository.entity.ClearingBrokerIdentification.mmRelatedTradeIdentification);
				subType_lazy = () -> Arrays.asList(SecuritiesTradeIdentification.mmObject(), PaymentIdentification.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TradeIdentification.mmCounterpartyReference, com.tools20022.repository.entity.TradeIdentification.mmIdentification,
						com.tools20022.repository.entity.TradeIdentification.mmCommonIdentification, com.tools20022.repository.entity.TradeIdentification.mmMatchingReference, com.tools20022.repository.entity.TradeIdentification.mmTrade,
						com.tools20022.repository.entity.TradeIdentification.mmUniqueTradeIdentifier, com.tools20022.repository.entity.TradeIdentification.mmClearingBrokerIdentification);
				derivationComponent_lazy = () -> Arrays.asList(TransactionReferences1.mmObject(), TransactionReferences2.mmObject(), TransactionReferences3.mmObject(), UniqueTransactionIdentifier1.mmObject(),
						MatchingSystemReference1Choice.mmObject(), UniqueTransactionIdentifier2.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return TradeIdentification.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getCounterpartyReference() {
		return counterpartyReference;
	}

	public void setCounterpartyReference(Max35Text counterpartyReference) {
		this.counterpartyReference = counterpartyReference;
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public void setIdentification(Max35Text identification) {
		this.identification = identification;
	}

	public Max35Text getCommonIdentification() {
		return commonIdentification;
	}

	public void setCommonIdentification(Max35Text commonIdentification) {
		this.commonIdentification = commonIdentification;
	}

	public Max35Text getMatchingReference() {
		return matchingReference;
	}

	public void setMatchingReference(Max35Text matchingReference) {
		this.matchingReference = matchingReference;
	}

	public Trade getTrade() {
		return trade;
	}

	public void setTrade(com.tools20022.repository.entity.Trade trade) {
		this.trade = trade;
	}

	public Max35Text getUniqueTradeIdentifier() {
		return uniqueTradeIdentifier;
	}

	public void setUniqueTradeIdentifier(Max35Text uniqueTradeIdentifier) {
		this.uniqueTradeIdentifier = uniqueTradeIdentifier;
	}

	public List<ClearingBrokerIdentification> getClearingBrokerIdentification() {
		return clearingBrokerIdentification;
	}

	public void setClearingBrokerIdentification(List<com.tools20022.repository.entity.ClearingBrokerIdentification> clearingBrokerIdentification) {
		this.clearingBrokerIdentification = clearingBrokerIdentification;
	}
}