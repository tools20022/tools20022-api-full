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
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Settlement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Settlement of the securities in a securities transaction, that is, the
 * instruction to deliver or receive securities, involving the payment of an
 * amount of money or not.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesSettlement" src="doc-files/SecuritiesSettlement.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#TransferOperation
 * SecuritiesSettlement.TransferOperation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#SettlementDate
 * SecuritiesSettlement.SettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#PartyRole
 * SecuritiesSettlement.PartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#SettlementAmount
 * SecuritiesSettlement.SettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#HoldingsPlanType
 * SecuritiesSettlement.HoldingsPlanType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#SecuritiesMovementType
 * SecuritiesSettlement.SecuritiesMovementType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#SettlementQuantity
 * SecuritiesSettlement.SettlementQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#SecuritiesTradeExecution
 * SecuritiesSettlement.SecuritiesTradeExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#CurrencyToBuy
 * SecuritiesSettlement.CurrencyToBuy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#CurrencyToSell
 * SecuritiesSettlement.CurrencyToSell}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#DenominationChoice
 * SecuritiesSettlement.DenominationChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#SettlementTransactionCondition
 * SecuritiesSettlement.SettlementTransactionCondition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#BeneficialOwnershipIndicator
 * SecuritiesSettlement.BeneficialOwnershipIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#MarketClientSide
 * SecuritiesSettlement.MarketClientSide}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#Tracking
 * SecuritiesSettlement.Tracking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#LetterOfGuarantee
 * SecuritiesSettlement.LetterOfGuarantee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#EligibleForCollateral
 * SecuritiesSettlement.EligibleForCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#AccruedInterestIndicator
 * SecuritiesSettlement.AccruedInterestIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#PreConfirmation
 * SecuritiesSettlement.PreConfirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#SecuritiesRealTimeGrossSettlement
 * SecuritiesSettlement.SecuritiesRealTimeGrossSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#BlockTrade
 * SecuritiesSettlement.BlockTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#SettlementSystemMethod
 * SecuritiesSettlement.SettlementSystemMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#AutomaticBorrowing
 * SecuritiesSettlement.AutomaticBorrowing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#PartialSettlementIndicator
 * SecuritiesSettlement.PartialSettlementIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#HoldIndicator
 * SecuritiesSettlement.HoldIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#RequestedSafekeepingPlace
 * SecuritiesSettlement.RequestedSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#PairOff
 * SecuritiesSettlement.PairOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#AccruedInterest
 * SecuritiesSettlement.AccruedInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#SecuritiesClearing
 * SecuritiesSettlement.SecuritiesClearing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#Payment
 * SecuritiesSettlement.Payment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#SettledAllocation
 * SecuritiesSettlement.SettledAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#RelatedForeignExchangeOperation
 * SecuritiesSettlement.RelatedForeignExchangeOperation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#Security
 * SecuritiesSettlement.Security}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#Position
 * SecuritiesSettlement.Position}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#Rollover
 * SecuritiesSettlement.Rollover}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#TurnedQuantity
 * SecuritiesSettlement.TurnedQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#SettlementReason
 * SecuritiesSettlement.SettlementReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#SettlementType
 * SecuritiesSettlement.SettlementType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#SecuritiesSettlement
 * Security.SecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#RelatedSecuritiesSettlement
 * Payment.RelatedSecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#SecuritiesSettlement
 * SecuritiesQuantity.SecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#RelatedTurnaroundSettlement
 * SecuritiesQuantity.RelatedTurnaroundSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#RelatedSettlement
 * SecuritiesTransfer.RelatedSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole#SecuritiesSettlement
 * SecuritiesSettlementPartyRole.SecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#SecuritiesSettlement
 * Interest.SecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace#SecuritiesSettlement
 * SafekeepingPlace.SecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#SecuritiesSettlement
 * SecuritiesTradeExecution.SecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#CurrencyExchangeForSecuritiesSettlement
 * ForeignExchangeTrade.CurrencyExchangeForSecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Allocation#SettlementExecutionParameters
 * Allocation.SettlementExecutionParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PairOff#RelatedSecuritiesSettlement
 * PairOff.RelatedSecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Rollover#SecuritiesSettlement
 * Rollover.SecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesClearing#SecuritiesSettlement
 * SecuritiesClearing.SecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Position#SecuritiesSettlement
 * Position.SecuritiesSettlement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails3#SettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionDetails3.SettlementTypeAndAdditionalParameters
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails3#QuantityAndAccountDetails
 * SecuritiesSettlementTransactionDetails3.QuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails3#SettlementParameters
 * SecuritiesSettlementTransactionDetails3.SettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails4#SettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionDetails4.SettlementTypeAndAdditionalParameters
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails4#QuantityAndAccountDetails
 * SecuritiesSettlementTransactionDetails4.QuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails4#SettlementParameters
 * SecuritiesSettlementTransactionDetails4.SettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails2#SettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionDetails2.SettlementTypeAndAdditionalParameters
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails2#QuantityAndAccountDetails
 * SecuritiesSettlementTransactionDetails2.QuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails2#SettlementParameters
 * SecuritiesSettlementTransactionDetails2.SettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails5#SettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionDetails5.SettlementTypeAndAdditionalParameters
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails5#QuantityAndAccountDetails
 * SecuritiesSettlementTransactionDetails5.QuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails5#SettlementParameters
 * SecuritiesSettlementTransactionDetails5.SettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails6#SettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionDetails6.SettlementTypeAndAdditionalParameters
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails6#QuantityAndAccountDetails
 * SecuritiesSettlementTransactionDetails6.QuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails6#SettlementParameters
 * SecuritiesSettlementTransactionDetails6.SettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails7#SettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionDetails7.SettlementTypeAndAdditionalParameters
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails7#QuantityAndAccountDetails
 * SecuritiesSettlementTransactionDetails7.QuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails7#SettlementParameters
 * SecuritiesSettlementTransactionDetails7.SettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Cancellation1Choice#TransferOutDetails
 * Cancellation1Choice.TransferOutDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Cancellation2Choice#TransferInDetails
 * Cancellation2Choice.TransferInDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestDetails1#UnilateralSplit
 * RequestDetails1.UnilateralSplit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestDetails2#UnilateralSplit
 * RequestDetails2.UnilateralSplit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestDetails6#UnilateralSplit
 * RequestDetails6.UnilateralSplit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestDetails7#UnilateralSplit
 * RequestDetails7.UnilateralSplit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestDetails8#UnilateralSplit
 * RequestDetails8.UnilateralSplit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestDetails9#UnilateralSplit
 * RequestDetails9.UnilateralSplit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestDetails11#UnilateralSplit
 * RequestDetails11.UnilateralSplit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestDetails12#UnilateralSplit
 * RequestDetails12.UnilateralSplit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails8#SettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionDetails8.SettlementTypeAndAdditionalParameters
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails8#QuantityAndAccountDetails
 * SecuritiesSettlementTransactionDetails8.QuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails8#SettlementParameters
 * SecuritiesSettlementTransactionDetails8.SettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails9#SettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionDetails9.SettlementTypeAndAdditionalParameters
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails9#QuantityAndAccountDetails
 * SecuritiesSettlementTransactionDetails9.QuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails9#SettlementParameters
 * SecuritiesSettlementTransactionDetails9.SettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails10#SettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionDetails10.
 * SettlementTypeAndAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails10#QuantityAndAccountDetails
 * SecuritiesSettlementTransactionDetails10.QuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails10#SettlementParameters
 * SecuritiesSettlementTransactionDetails10.SettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails11#SettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionDetails11.
 * SettlementTypeAndAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails11#QuantityAndAccountDetails
 * SecuritiesSettlementTransactionDetails11.QuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails11#SettlementParameters
 * SecuritiesSettlementTransactionDetails11.SettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails12#SettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionDetails12.
 * SettlementTypeAndAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails12#QuantityAndAccountDetails
 * SecuritiesSettlementTransactionDetails12.QuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails12#SettlementParameters
 * SecuritiesSettlementTransactionDetails12.SettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails13#SettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionDetails13.
 * SettlementTypeAndAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails13#QuantityAndAccountDetails
 * SecuritiesSettlementTransactionDetails13.QuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails13#SettlementParameters
 * SecuritiesSettlementTransactionDetails13.SettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2#SettlementParameters
 * SecuritiesFinancingTransactionDetails2.SettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8#SettlementParameters
 * SecuritiesFinancingTransactionDetails8.SettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6#SettlementParameters
 * SecuritiesFinancingTransactionDetails6.SettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10#SettlementParameters
 * SecuritiesFinancingTransactionDetails10.SettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17#SettlementParameters
 * SecuritiesFinancingTransactionDetails17.SettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18#SettlementParameters
 * SecuritiesFinancingTransactionDetails18.SettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Cancellation5Choice#TransferInDetails
 * Cancellation5Choice.TransferInDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Cancellation4Choice#TransferOutDetails
 * Cancellation4Choice.TransferOutDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails16#SettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionDetails16.
 * SettlementTypeAndAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails16#QuantityAndAccountDetails
 * SecuritiesSettlementTransactionDetails16.QuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails16#SettlementParameters
 * SecuritiesSettlementTransactionDetails16.SettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails14#SettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionDetails14.
 * SettlementTypeAndAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails14#QuantityAndAccountDetails
 * SecuritiesSettlementTransactionDetails14.QuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails14#SettlementParameters
 * SecuritiesSettlementTransactionDetails14.SettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails15#SettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionDetails15.
 * SettlementTypeAndAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails15#QuantityAndAccountDetails
 * SecuritiesSettlementTransactionDetails15.QuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails15#SettlementParameters
 * SecuritiesSettlementTransactionDetails15.SettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21#SettlementParameters
 * SecuritiesFinancingTransactionDetails21.SettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestDetails13#UnilateralSplit
 * RequestDetails13.UnilateralSplit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22#SettlementParameters
 * SecuritiesFinancingTransactionDetails22.SettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestDetails14#UnilateralSplit
 * RequestDetails14.UnilateralSplit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails17#SettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionDetails17.
 * SettlementTypeAndAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails17#QuantityAndAccountDetails
 * SecuritiesSettlementTransactionDetails17.QuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails17#SettlementParameters
 * SecuritiesSettlementTransactionDetails17.SettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails18#SettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionDetails18.
 * SettlementTypeAndAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails18#QuantityAndAccountDetails
 * SecuritiesSettlementTransactionDetails18.QuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails18#SettlementParameters
 * SecuritiesSettlementTransactionDetails18.SettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails19#SettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionDetails19.
 * SettlementTypeAndAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails19#QuantityAndAccountDetails
 * SecuritiesSettlementTransactionDetails19.QuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails19#SettlementParameters
 * SecuritiesSettlementTransactionDetails19.SettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Cancellation9Choice#TransferInDetails
 * Cancellation9Choice.TransferInDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Cancellation8Choice#TransferOutDetails
 * Cancellation8Choice.TransferOutDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24#SettlementParameters
 * SecuritiesFinancingTransactionDetails24.SettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25#SettlementParameters
 * SecuritiesFinancingTransactionDetails25.SettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#SettlementParameters
 * SecuritiesFinancingTransactionDetails26.SettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails21#SettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionDetails21.
 * SettlementTypeAndAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails21#QuantityAndAccountDetails
 * SecuritiesSettlementTransactionDetails21.QuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails21#SettlementParameters
 * SecuritiesSettlementTransactionDetails21.SettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails22#SettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionDetails22.
 * SettlementTypeAndAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails22#QuantityAndAccountDetails
 * SecuritiesSettlementTransactionDetails22.QuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails22#SettlementParameters
 * SecuritiesSettlementTransactionDetails22.SettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails20#SettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionDetails20.
 * SettlementTypeAndAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails20#QuantityAndAccountDetails
 * SecuritiesSettlementTransactionDetails20.QuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails20#SettlementParameters
 * SecuritiesSettlementTransactionDetails20.SettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestDetails15#UnilateralSplit
 * RequestDetails15.UnilateralSplit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Cancellation12Choice#TransferOutDetails
 * Cancellation12Choice.TransferOutDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Cancellation10Choice#TransferInDetails
 * Cancellation10Choice.TransferInDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#SettlementParameters
 * SecuritiesFinancingTransactionDetails33.SettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestDetails16#UnilateralSplit
 * RequestDetails16.UnilateralSplit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails23#SettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionDetails23.
 * SettlementTypeAndAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails23#QuantityAndAccountDetails
 * SecuritiesSettlementTransactionDetails23.QuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails23#SettlementParameters
 * SecuritiesSettlementTransactionDetails23.SettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails25#SettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionDetails25.
 * SettlementTypeAndAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails25#QuantityAndAccountDetails
 * SecuritiesSettlementTransactionDetails25.QuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails25#SettlementParameters
 * SecuritiesSettlementTransactionDetails25.SettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails24#SettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionDetails24.
 * SettlementTypeAndAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails24#QuantityAndAccountDetails
 * SecuritiesSettlementTransactionDetails24.QuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails24#SettlementParameters
 * SecuritiesSettlementTransactionDetails24.SettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#SettlementParameters
 * SecuritiesFinancingTransactionDetails35.SettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails27#SettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionDetails27.
 * SettlementTypeAndAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails27#QuantityAndAccountDetails
 * SecuritiesSettlementTransactionDetails27.QuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails27#SettlementParameters
 * SecuritiesSettlementTransactionDetails27.SettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails28#SettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionDetails28.
 * SettlementTypeAndAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails28#QuantityAndAccountDetails
 * SecuritiesSettlementTransactionDetails28.QuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails28#SettlementParameters
 * SecuritiesSettlementTransactionDetails28.SettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails26#SettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionDetails26.
 * SettlementTypeAndAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails26#QuantityAndAccountDetails
 * SecuritiesSettlementTransactionDetails26.QuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails26#SettlementParameters
 * SecuritiesSettlementTransactionDetails26.SettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36#SettlementParameters
 * SecuritiesFinancingTransactionDetails36.SettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails30#SettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionDetails30.
 * SettlementTypeAndAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails30#QuantityAndAccountDetails
 * SecuritiesSettlementTransactionDetails30.QuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails30#SettlementParameters
 * SecuritiesSettlementTransactionDetails30.SettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails29#SettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionDetails29.
 * SettlementTypeAndAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails29#QuantityAndAccountDetails
 * SecuritiesSettlementTransactionDetails29.QuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails29#SettlementParameters
 * SecuritiesSettlementTransactionDetails29.SettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails31#SettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionDetails31.
 * SettlementTypeAndAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails31#QuantityAndAccountDetails
 * SecuritiesSettlementTransactionDetails31.QuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails31#SettlementParameters
 * SecuritiesSettlementTransactionDetails31.SettlementParameters}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Settlement
 * Settlement}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} = List of 505 elements</li>
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
 * "SecuritiesSettlement"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Settlement of the securities in a securities transaction, that is, the instruction to deliver or receive securities, involving the payment of an amount of money or not."
 * </li>
 * </ul>
 */
public class SecuritiesSettlement extends Settlement {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Set of processes resulting in a securities transfer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#RelatedSettlement
	 * SecuritiesTransfer.RelatedSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Cancellation3Choice#CancellationByTransferInstructionDetails
	 * Cancellation3Choice.CancellationByTransferInstructionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Cancellation6Choice#CancellationByTransferInstructionDetails
	 * Cancellation6Choice.CancellationByTransferInstructionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Cancellation7Choice#CancellationByTransferInstructionDetails
	 * Cancellation7Choice.CancellationByTransferInstructionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Cancellation11Choice#CancellationByTransferInstructionDetails
	 * Cancellation11Choice.CancellationByTransferInstructionDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferOperation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Set of processes resulting in a securities transfer."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TransferOperation = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Cancellation3Choice.CancellationByTransferInstructionDetails, com.tools20022.repository.choice.Cancellation6Choice.CancellationByTransferInstructionDetails,
					com.tools20022.repository.choice.Cancellation7Choice.CancellationByTransferInstructionDetails, com.tools20022.repository.choice.Cancellation11Choice.CancellationByTransferInstructionDetails);
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransferOperation";
			definition = "Set of processes resulting in a securities transfer.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesTransfer.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.RelatedSettlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Date and time at which a transaction is completed and cleared. <br>
	 * It can be an effective settlement date, that is, payment is effected and
	 * securities are delivered or an intended settlement date that is, the date
	 * and time at which the amount of money is intended to be moved.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation4#EffectiveSettlementDate
	 * DeliverInformation4.EffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation7#EffectiveSettlementDate
	 * DeliverInformation7.EffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation4#EffectiveSettlementDate
	 * ReceiveInformation4.EffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation8#EffectiveSettlementDate
	 * ReceiveInformation8.EffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer24#EffectiveSettlementDate
	 * Transfer24.EffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation6#EffectiveSettlementDate
	 * ReceiveInformation6.EffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation11#EffectiveSettlementDate
	 * ReceiveInformation11.EffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer25#EffectiveSettlementDate
	 * Transfer25.EffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation11#EffectiveSettlementDate
	 * DeliverInformation11.EffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation6#EffectiveSettlementDate
	 * DeliverInformation6.EffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer26#EffectiveSettlementDate
	 * Transfer26.EffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer23#EffectiveSettlementDate
	 * Transfer23.EffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification2#SettlementDate
	 * SettlementTypeAndIdentification2.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification5#SettlementDate
	 * SettlementTypeAndIdentification5.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails2#SettlementDate
	 * IntraPositionDetails2.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails8#SettlementDate
	 * IntraPositionDetails8.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails12#SettlementDate
	 * IntraPositionDetails12.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails13#SettlementDate
	 * IntraPositionDetails13.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails22#SettlementDate
	 * IntraPositionDetails22.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails26#SettlementDate
	 * IntraPositionDetails26.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails27#SettlementDate
	 * IntraPositionDetails27.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails29#SettlementDate
	 * IntraPositionDetails29.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails6#EffectiveSettlementDate
	 * SecuritiesTradeDetails6.EffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails13#EffectiveSettlementDate
	 * SecuritiesTradeDetails13.EffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation3#EffectiveDate
	 * AdditionalInformation3.EffectiveDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation4#EffectiveDate
	 * AdditionalInformation4.EffectiveDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation7#EffectiveDate
	 * AdditionalInformation7.EffectiveDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation8#EffectiveDate
	 * AdditionalInformation8.EffectiveDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails2#EffectiveSettlementDate
	 * SecuritiesTradeDetails2.EffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails16#EffectiveSettlementDate
	 * SecuritiesTradeDetails16.EffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails6#EffectiveSettlementDate
	 * TransactionDetails6.EffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails18#EffectiveSettlementDate
	 * TransactionDetails18.EffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails24#EffectiveSettlementDate
	 * TransactionDetails24.EffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails34#EffectiveSettlementDate
	 * TransactionDetails34.EffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails37#EffectiveSettlementDate
	 * TransactionDetails37.EffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails48#EffectiveSettlementDate
	 * TransactionDetails48.EffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails57#EffectiveSettlementDate
	 * TransactionDetails57.EffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails60#EffectiveSettlementDate
	 * TransactionDetails60.EffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction2#SettlementDate
	 * InvestmentFundTransaction2.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#SettlementDate
	 * InvestmentFundTransaction3.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails1#SettlementDate
	 * IntraPositionDetails1.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails11#SettlementDate
	 * IntraPositionDetails11.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails4#SettlementDate
	 * IntraPositionDetails4.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails9#SettlementDate
	 * IntraPositionDetails9.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails7#SettlementDate
	 * IntraPositionDetails7.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails16#SettlementDate
	 * IntraPositionDetails16.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails21#SettlementDate
	 * IntraPositionDetails21.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails25#SettlementDate
	 * IntraPositionDetails25.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails5#SettlementDate
	 * IntraPositionDetails5.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails15#SettlementDate
	 * IntraPositionDetails15.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails19#SettlementDate
	 * IntraPositionDetails19.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails23#SettlementDate
	 * IntraPositionDetails23.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation1#IntendedSettlementDate
	 * SettlementObligation1.IntendedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation6#IntendedSettlementDate
	 * SettlementObligation6.IntendedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation3#SettlementDate
	 * SettlementObligation3.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation2#IntendedSettlementDate
	 * SettlementObligation2.IntendedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation5#SettlementDate
	 * SettlementObligation5.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation4#IntendedSettlementDate
	 * SettlementObligation4.IntendedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetPosition2#SettlementDate
	 * NetPosition2.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails51#EffectiveSettlementDate
	 * TransactionDetails51.EffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria1#EffectiveSettlementDate
	 * IntraPositionQueryCriteria1.EffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPosition4#SettlementDate
	 * IntraPosition4.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg2#LegSettlementDate
	 * InstrumentLeg2.LegSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer28#EffectiveSettlementDate
	 * Transfer28.EffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation12#EffectiveSettlementDate
	 * ReceiveInformation12.EffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer29#EffectiveSettlementDate
	 * Transfer29.EffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation12#EffectiveSettlementDate
	 * DeliverInformation12.EffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails63#EffectiveSettlementDate
	 * TransactionDetails63.EffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails31#EffectiveSettlementDate
	 * SecuritiesTradeDetails31.EffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails38#EffectiveSettlementDate
	 * SecuritiesTradeDetails38.EffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation9#EffectiveDate
	 * AdditionalInformation9.EffectiveDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails39#EffectiveSettlementDate
	 * SecuritiesTradeDetails39.EffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails43#EffectiveSettlementDate
	 * SecuritiesTradeDetails43.EffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation10#EffectiveDate
	 * AdditionalInformation10.EffectiveDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails68#EffectiveSettlementDate
	 * TransactionDetails68.EffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#SettlementDate
	 * InvestmentFundTransaction4.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation14#EffectiveSettlementDate
	 * DeliverInformation14.EffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation14#EffectiveSettlementDate
	 * ReceiveInformation14.EffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation7#IntendedSettlementDate
	 * SettlementObligation7.IntendedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetPosition3#SettlementDate
	 * NetPosition3.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation8#IntendedSettlementDate
	 * SettlementObligation8.IntendedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction1#SettlementDate
	 * UnsecuredMarketTransaction1.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction1#SettlementDate
	 * SecuredMarketTransaction1.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation11#EffectiveDate
	 * AdditionalInformation11.EffectiveDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails31#SettlementDate
	 * IntraPositionDetails31.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails78#EffectiveSettlementDate
	 * TransactionDetails78.EffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg6#LegSettlementDate
	 * InstrumentLeg6.LegSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails33#SettlementDate
	 * IntraPositionDetails33.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails53#EffectiveSettlementDate
	 * SecuritiesTradeDetails53.EffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails55#EffectiveSettlementDate
	 * SecuritiesTradeDetails55.EffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails34#SettlementDate
	 * IntraPositionDetails34.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification20#SettlementDate
	 * SettlementTypeAndIdentification20.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation17#EffectiveSettlementDate
	 * ReceiveInformation17.EffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer31#EffectiveSettlementDate
	 * Transfer31.EffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation17#EffectiveSettlementDate
	 * DeliverInformation17.EffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer33#EffectiveSettlementDate
	 * Transfer33.EffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification21#SettlementDate
	 * SettlementTypeAndIdentification21.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation12#EffectiveDate
	 * AdditionalInformation12.EffectiveDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails58#EffectiveSettlementDate
	 * SecuritiesTradeDetails58.EffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails35#SettlementDate
	 * IntraPositionDetails35.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails36#SettlementDate
	 * IntraPositionDetails36.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails38#SettlementDate
	 * IntraPositionDetails38.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails62#EffectiveSettlementDate
	 * SecuritiesTradeDetails62.EffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails91#EffectiveSettlementDate
	 * TransactionDetails91.EffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction2#SettlementDate
	 * UnsecuredMarketTransaction2.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction2#SettlementDate
	 * SecuredMarketTransaction2.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction3#SettlementDate
	 * UnsecuredMarketTransaction3.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction3#SettlementDate
	 * SecuredMarketTransaction3.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails41#SettlementDate
	 * IntraPositionDetails41.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails39#SettlementDate
	 * IntraPositionDetails39.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation13#EffectiveDate
	 * AdditionalInformation13.EffectiveDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails95#EffectiveSettlementDate
	 * TransactionDetails95.EffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails43#SettlementDate
	 * IntraPositionDetails43.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails42#SettlementDate
	 * IntraPositionDetails42.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation14#EffectiveDate
	 * AdditionalInformation14.EffectiveDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails98#EffectiveSettlementDate
	 * TransactionDetails98.EffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4#SettlementDate
	 * SecuredMarketTransaction4.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4#SettlementDate
	 * UnsecuredMarketTransaction4.SettlementDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which a transaction is completed and cleared. \r\nIt can be an effective settlement date, that is, payment is effected and securities are delivered or an intended settlement date that is, the date and time at which the amount of money is intended to be moved."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SettlementDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DeliverInformation4.EffectiveSettlementDate, com.tools20022.repository.msg.DeliverInformation7.EffectiveSettlementDate,
					com.tools20022.repository.msg.ReceiveInformation4.EffectiveSettlementDate, com.tools20022.repository.msg.ReceiveInformation8.EffectiveSettlementDate, com.tools20022.repository.msg.Transfer24.EffectiveSettlementDate,
					com.tools20022.repository.msg.ReceiveInformation6.EffectiveSettlementDate, com.tools20022.repository.msg.ReceiveInformation11.EffectiveSettlementDate, com.tools20022.repository.msg.Transfer25.EffectiveSettlementDate,
					com.tools20022.repository.msg.DeliverInformation11.EffectiveSettlementDate, com.tools20022.repository.msg.DeliverInformation6.EffectiveSettlementDate, com.tools20022.repository.msg.Transfer26.EffectiveSettlementDate,
					com.tools20022.repository.msg.Transfer23.EffectiveSettlementDate, com.tools20022.repository.msg.SettlementTypeAndIdentification2.SettlementDate,
					com.tools20022.repository.msg.SettlementTypeAndIdentification5.SettlementDate, com.tools20022.repository.msg.IntraPositionDetails2.SettlementDate, com.tools20022.repository.msg.IntraPositionDetails8.SettlementDate,
					com.tools20022.repository.msg.IntraPositionDetails12.SettlementDate, com.tools20022.repository.msg.IntraPositionDetails13.SettlementDate, com.tools20022.repository.msg.IntraPositionDetails22.SettlementDate,
					com.tools20022.repository.msg.IntraPositionDetails26.SettlementDate, com.tools20022.repository.msg.IntraPositionDetails27.SettlementDate, com.tools20022.repository.msg.IntraPositionDetails29.SettlementDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails6.EffectiveSettlementDate, com.tools20022.repository.msg.SecuritiesTradeDetails13.EffectiveSettlementDate,
					com.tools20022.repository.msg.AdditionalInformation3.EffectiveDate, com.tools20022.repository.msg.AdditionalInformation4.EffectiveDate, com.tools20022.repository.msg.AdditionalInformation7.EffectiveDate,
					com.tools20022.repository.msg.AdditionalInformation8.EffectiveDate, com.tools20022.repository.msg.SecuritiesTradeDetails2.EffectiveSettlementDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails16.EffectiveSettlementDate, com.tools20022.repository.msg.TransactionDetails6.EffectiveSettlementDate,
					com.tools20022.repository.msg.TransactionDetails18.EffectiveSettlementDate, com.tools20022.repository.msg.TransactionDetails24.EffectiveSettlementDate,
					com.tools20022.repository.msg.TransactionDetails34.EffectiveSettlementDate, com.tools20022.repository.msg.TransactionDetails37.EffectiveSettlementDate,
					com.tools20022.repository.msg.TransactionDetails48.EffectiveSettlementDate, com.tools20022.repository.msg.TransactionDetails57.EffectiveSettlementDate,
					com.tools20022.repository.msg.TransactionDetails60.EffectiveSettlementDate, com.tools20022.repository.msg.InvestmentFundTransaction2.SettlementDate,
					com.tools20022.repository.msg.InvestmentFundTransaction3.SettlementDate, com.tools20022.repository.msg.IntraPositionDetails1.SettlementDate, com.tools20022.repository.msg.IntraPositionDetails11.SettlementDate,
					com.tools20022.repository.msg.IntraPositionDetails4.SettlementDate, com.tools20022.repository.msg.IntraPositionDetails9.SettlementDate, com.tools20022.repository.msg.IntraPositionDetails7.SettlementDate,
					com.tools20022.repository.msg.IntraPositionDetails16.SettlementDate, com.tools20022.repository.msg.IntraPositionDetails21.SettlementDate, com.tools20022.repository.msg.IntraPositionDetails25.SettlementDate,
					com.tools20022.repository.msg.IntraPositionDetails5.SettlementDate, com.tools20022.repository.msg.IntraPositionDetails15.SettlementDate, com.tools20022.repository.msg.IntraPositionDetails19.SettlementDate,
					com.tools20022.repository.msg.IntraPositionDetails23.SettlementDate, com.tools20022.repository.msg.SettlementObligation1.IntendedSettlementDate,
					com.tools20022.repository.msg.SettlementObligation6.IntendedSettlementDate, com.tools20022.repository.msg.SettlementObligation3.SettlementDate, com.tools20022.repository.msg.SettlementObligation2.IntendedSettlementDate,
					com.tools20022.repository.msg.SettlementObligation5.SettlementDate, com.tools20022.repository.msg.SettlementObligation4.IntendedSettlementDate, com.tools20022.repository.msg.NetPosition2.SettlementDate,
					com.tools20022.repository.msg.TransactionDetails51.EffectiveSettlementDate, com.tools20022.repository.msg.IntraPositionQueryCriteria1.EffectiveSettlementDate, com.tools20022.repository.msg.IntraPosition4.SettlementDate,
					com.tools20022.repository.msg.InstrumentLeg2.LegSettlementDate, com.tools20022.repository.msg.Transfer28.EffectiveSettlementDate, com.tools20022.repository.msg.ReceiveInformation12.EffectiveSettlementDate,
					com.tools20022.repository.msg.Transfer29.EffectiveSettlementDate, com.tools20022.repository.msg.DeliverInformation12.EffectiveSettlementDate, com.tools20022.repository.msg.TransactionDetails63.EffectiveSettlementDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails31.EffectiveSettlementDate, com.tools20022.repository.msg.SecuritiesTradeDetails38.EffectiveSettlementDate,
					com.tools20022.repository.msg.AdditionalInformation9.EffectiveDate, com.tools20022.repository.msg.SecuritiesTradeDetails39.EffectiveSettlementDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails43.EffectiveSettlementDate, com.tools20022.repository.msg.AdditionalInformation10.EffectiveDate,
					com.tools20022.repository.msg.TransactionDetails68.EffectiveSettlementDate, com.tools20022.repository.msg.InvestmentFundTransaction4.SettlementDate,
					com.tools20022.repository.msg.DeliverInformation14.EffectiveSettlementDate, com.tools20022.repository.msg.ReceiveInformation14.EffectiveSettlementDate,
					com.tools20022.repository.msg.SettlementObligation7.IntendedSettlementDate, com.tools20022.repository.msg.NetPosition3.SettlementDate, com.tools20022.repository.msg.SettlementObligation8.IntendedSettlementDate,
					com.tools20022.repository.msg.UnsecuredMarketTransaction1.SettlementDate, com.tools20022.repository.msg.SecuredMarketTransaction1.SettlementDate, com.tools20022.repository.msg.AdditionalInformation11.EffectiveDate,
					com.tools20022.repository.msg.IntraPositionDetails31.SettlementDate, com.tools20022.repository.msg.TransactionDetails78.EffectiveSettlementDate, com.tools20022.repository.msg.InstrumentLeg6.LegSettlementDate,
					com.tools20022.repository.msg.IntraPositionDetails33.SettlementDate, com.tools20022.repository.msg.SecuritiesTradeDetails53.EffectiveSettlementDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails55.EffectiveSettlementDate, com.tools20022.repository.msg.IntraPositionDetails34.SettlementDate,
					com.tools20022.repository.msg.SettlementTypeAndIdentification20.SettlementDate, com.tools20022.repository.msg.ReceiveInformation17.EffectiveSettlementDate,
					com.tools20022.repository.msg.Transfer31.EffectiveSettlementDate, com.tools20022.repository.msg.DeliverInformation17.EffectiveSettlementDate, com.tools20022.repository.msg.Transfer33.EffectiveSettlementDate,
					com.tools20022.repository.msg.SettlementTypeAndIdentification21.SettlementDate, com.tools20022.repository.msg.AdditionalInformation12.EffectiveDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails58.EffectiveSettlementDate, com.tools20022.repository.msg.IntraPositionDetails35.SettlementDate, com.tools20022.repository.msg.IntraPositionDetails36.SettlementDate,
					com.tools20022.repository.msg.IntraPositionDetails38.SettlementDate, com.tools20022.repository.msg.SecuritiesTradeDetails62.EffectiveSettlementDate,
					com.tools20022.repository.msg.TransactionDetails91.EffectiveSettlementDate, com.tools20022.repository.msg.UnsecuredMarketTransaction2.SettlementDate,
					com.tools20022.repository.msg.SecuredMarketTransaction2.SettlementDate, com.tools20022.repository.msg.UnsecuredMarketTransaction3.SettlementDate, com.tools20022.repository.msg.SecuredMarketTransaction3.SettlementDate,
					com.tools20022.repository.msg.IntraPositionDetails41.SettlementDate, com.tools20022.repository.msg.IntraPositionDetails39.SettlementDate, com.tools20022.repository.msg.AdditionalInformation13.EffectiveDate,
					com.tools20022.repository.msg.TransactionDetails95.EffectiveSettlementDate, com.tools20022.repository.msg.IntraPositionDetails43.SettlementDate, com.tools20022.repository.msg.IntraPositionDetails42.SettlementDate,
					com.tools20022.repository.msg.AdditionalInformation14.EffectiveDate, com.tools20022.repository.msg.TransactionDetails98.EffectiveSettlementDate, com.tools20022.repository.msg.SecuredMarketTransaction4.SettlementDate,
					com.tools20022.repository.msg.UnsecuredMarketTransaction4.SettlementDate);
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementDate";
			definition = "Date and time at which a transaction is completed and cleared. \r\nIt can be an effective settlement date, that is, payment is effected and securities are delivered or an intended settlement date that is, the date and time at which the amount of money is intended to be moved.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Specifies each role linked to the settlement of securities and played by
	 * a party at that step in a securities transaction flow.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole#SecuritiesSettlement
	 * SecuritiesSettlementPartyRole.SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole
	 * SecuritiesSettlementPartyRole}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation2#SettlementPartiesDetails
	 * DeliverInformation2.SettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation4#SettlementPartiesDetails
	 * DeliverInformation4.SettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation7#SettlementPartiesDetails
	 * DeliverInformation7.SettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation2#SettlementPartiesDetails
	 * ReceiveInformation2.SettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation4#SettlementPartiesDetails
	 * ReceiveInformation4.SettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation8#SettlementPartiesDetails
	 * ReceiveInformation8.SettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation6#SettlementPartiesDetails
	 * ReceiveInformation6.SettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation11#SettlementPartiesDetails
	 * ReceiveInformation11.SettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation11#SettlementPartiesDetails
	 * DeliverInformation11.SettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails10#DeliveringSettlementParties
	 * TransactionDetails10.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails10#ReceivingSettlementParties
	 * TransactionDetails10.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails29#DeliveringSettlementParties
	 * TransactionDetails29.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails29#ReceivingSettlementParties
	 * TransactionDetails29.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction1#OtherDeliveringSettlementParties
	 * StandingSettlementInstruction1.OtherDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction1#OtherReceivingSettlementParties
	 * StandingSettlementInstruction1.OtherReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails28#DeliveringSettlementParties
	 * TransactionDetails28.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails28#ReceivingSettlementParties
	 * TransactionDetails28.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails31#DeliveringSettlementParties
	 * TransactionDetails31.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails31#ReceivingSettlementParties
	 * TransactionDetails31.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails44#DeliveringSettlementParties
	 * TransactionDetails44.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails44#ReceivingSettlementParties
	 * TransactionDetails44.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation1#SettlementPartiesDetails
	 * DeliverInformation1.SettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation3#SettlementPartiesDetails
	 * DeliverInformation3.SettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation8#SettlementPartiesDetails
	 * DeliverInformation8.SettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation1#SettlementPartiesDetails
	 * ReceiveInformation1.SettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation3#SettlementPartiesDetails
	 * ReceiveInformation3.SettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation7#SettlementPartiesDetails
	 * ReceiveInformation7.SettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation5#SettlementPartiesDetails
	 * ReceiveInformation5.SettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation9#SettlementPartiesDetails
	 * ReceiveInformation9.SettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation5#SettlementPartiesDetails
	 * DeliverInformation5.SettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation9#SettlementPartiesDetails
	 * DeliverInformation9.SettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation6#SettlementPartiesDetails
	 * DeliverInformation6.SettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction2#OtherDeliveringSettlementParties
	 * StandingSettlementInstruction2.OtherDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction2#OtherReceivingSettlementParties
	 * StandingSettlementInstruction2.OtherReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails5#ReceivingSettlementParties
	 * TransactionDetails5.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails5#DeliveringSettlementParties
	 * TransactionDetails5.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails9#ReceivingSettlementParties
	 * TransactionDetails9.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails9#DeliveringSettlementParties
	 * TransactionDetails9.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails22#ReceivingSettlementParties
	 * TransactionDetails22.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails22#DeliveringSettlementParties
	 * TransactionDetails22.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails23#ReceivingSettlementParties
	 * TransactionDetails23.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails23#DeliveringSettlementParties
	 * TransactionDetails23.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails36#ReceivingSettlementParties
	 * TransactionDetails36.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails36#DeliveringSettlementParties
	 * TransactionDetails36.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails47#ReceivingSettlementParties
	 * TransactionDetails47.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails47#DeliveringSettlementParties
	 * TransactionDetails47.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails53#ReceivingSettlementParties
	 * TransactionDetails53.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails53#DeliveringSettlementParties
	 * TransactionDetails53.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails58#ReceivingSettlementParties
	 * TransactionDetails58.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails58#DeliveringSettlementParties
	 * TransactionDetails58.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails7#DeliveringSettlementParties
	 * TransactionDetails7.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails7#ReceivingSettlementParties
	 * TransactionDetails7.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails8#DeliveringSettlementParties
	 * TransactionDetails8.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails8#ReceivingSettlementParties
	 * TransactionDetails8.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails16#DeliveringSettlementParties
	 * TransactionDetails16.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails16#ReceivingSettlementParties
	 * TransactionDetails16.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails17#DeliveringSettlementParties
	 * TransactionDetails17.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails17#ReceivingSettlementParties
	 * TransactionDetails17.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails26#DeliveringSettlementParties
	 * TransactionDetails26.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails26#ReceivingSettlementParties
	 * TransactionDetails26.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails25#DeliveringSettlementParties
	 * TransactionDetails25.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails25#ReceivingSettlementParties
	 * TransactionDetails25.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails27#DeliveringSettlementParties
	 * TransactionDetails27.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails27#ReceivingSettlementParties
	 * TransactionDetails27.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails33#DeliveringSettlementParties
	 * TransactionDetails33.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails33#ReceivingSettlementParties
	 * TransactionDetails33.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails39#DeliveringSettlementParties
	 * TransactionDetails39.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails39#ReceivingSettlementParties
	 * TransactionDetails39.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails50#DeliveringSettlementParties
	 * TransactionDetails50.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails50#ReceivingSettlementParties
	 * TransactionDetails50.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails56#DeliveringSettlementParties
	 * TransactionDetails56.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails56#ReceivingSettlementParties
	 * TransactionDetails56.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails59#DeliveringSettlementParties
	 * TransactionDetails59.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails59#ReceivingSettlementParties
	 * TransactionDetails59.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails6#DeliveringSettlementParties
	 * TransactionDetails6.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails6#ReceivingSettlementParties
	 * TransactionDetails6.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails18#DeliveringSettlementParties
	 * TransactionDetails18.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails18#ReceivingSettlementParties
	 * TransactionDetails18.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails24#DeliveringSettlementParties
	 * TransactionDetails24.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails24#ReceivingSettlementParties
	 * TransactionDetails24.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails34#DeliveringSettlementParties
	 * TransactionDetails34.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails34#ReceivingSettlementParties
	 * TransactionDetails34.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails37#DeliveringSettlementParties
	 * TransactionDetails37.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails37#ReceivingSettlementParties
	 * TransactionDetails37.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails48#DeliveringSettlementParties
	 * TransactionDetails48.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails48#ReceivingSettlementParties
	 * TransactionDetails48.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails57#DeliveringSettlementParties
	 * TransactionDetails57.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails57#ReceivingSettlementParties
	 * TransactionDetails57.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails60#DeliveringSettlementParties
	 * TransactionDetails60.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails60#ReceivingSettlementParties
	 * TransactionDetails60.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters3#ReceivingSideDetails
	 * FundSettlementParameters3.ReceivingSideDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters3#DeliveringSideDetails
	 * FundSettlementParameters3.DeliveringSideDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters4#ReceivingSideDetails
	 * FundSettlementParameters4.ReceivingSideDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters4#DeliveringSideDetails
	 * FundSettlementParameters4.DeliveringSideDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails7#DeliveringSettlementParties
	 * SecuritiesTradeDetails7.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails7#ReceivingSettlementParties
	 * SecuritiesTradeDetails7.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails19#DeliveringSettlementParties
	 * SecuritiesTradeDetails19.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails19#ReceivingSettlementParties
	 * SecuritiesTradeDetails19.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails4#DeliveringSettlementParties
	 * SecuritiesTradeDetails4.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails4#ReceivingSettlementParties
	 * SecuritiesTradeDetails4.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails17#DeliveringSettlementParties
	 * SecuritiesTradeDetails17.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails17#ReceivingSettlementParties
	 * SecuritiesTradeDetails17.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails4#DeliveringSettlementParties
	 * TransactionDetails4.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails4#ReceivingSettlementParties
	 * TransactionDetails4.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails30#DeliveringSettlementParties
	 * TransactionDetails30.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails30#ReceivingSettlementParties
	 * TransactionDetails30.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails20#DeliveringSettlementParties
	 * TransactionDetails20.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails20#ReceivingSettlementParties
	 * TransactionDetails20.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails10#DeliveringSettlementParties
	 * SecuritiesTradeDetails10.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails10#ReceivingSettlementParties
	 * SecuritiesTradeDetails10.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails22#DeliveringSettlementParties
	 * SecuritiesTradeDetails22.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails22#ReceivingSettlementParties
	 * SecuritiesTradeDetails22.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails23#DeliveringSettlementParties
	 * SecuritiesTradeDetails23.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails23#ReceivingSettlementParties
	 * SecuritiesTradeDetails23.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails29#DeliveringSettlementParties
	 * SecuritiesTradeDetails29.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails29#ReceivingSettlementParties
	 * SecuritiesTradeDetails29.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails40#DeliveringSettlementParties
	 * TransactionDetails40.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails40#ReceivingSettlementParties
	 * TransactionDetails40.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails42#DeliveringSettlementParties
	 * TransactionDetails42.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails42#ReceivingSettlementParties
	 * TransactionDetails42.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails46#DeliveringSettlementParties
	 * TransactionDetails46.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails46#ReceivingSettlementParties
	 * TransactionDetails46.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails32#DeliveringSettlementParties
	 * TransactionDetails32.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails32#ReceivingSettlementParties
	 * TransactionDetails32.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails14#DeliveringSettlementParties
	 * TransactionDetails14.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails14#ReceivingSettlementParties
	 * TransactionDetails14.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails35#DeliveringSettlementParties
	 * TransactionDetails35.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails35#ReceivingSettlementParties
	 * TransactionDetails35.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails14#DeliveringSettlementParties
	 * SecuritiesTradeDetails14.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails14#ReceivingSettlementParties
	 * SecuritiesTradeDetails14.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails20#DeliveringSettlementParties
	 * SecuritiesTradeDetails20.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails20#ReceivingSettlementParties
	 * SecuritiesTradeDetails20.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails24#DeliveringSettlementParties
	 * SecuritiesTradeDetails24.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails24#ReceivingSettlementParties
	 * SecuritiesTradeDetails24.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails30#DeliveringSettlementParties
	 * SecuritiesTradeDetails30.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails30#ReceivingSettlementParties
	 * SecuritiesTradeDetails30.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails45#DeliveringSettlementParties
	 * TransactionDetails45.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails45#ReceivingSettlementParties
	 * TransactionDetails45.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation4#SettlementParties
	 * SettlementObligation4.SettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters7#DeliveringSideDetails
	 * FundSettlementParameters7.DeliveringSideDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters8#ReceivingSideDetails
	 * FundSettlementParameters8.ReceivingSideDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters5#ReceivingSideDetails
	 * FundSettlementParameters5.ReceivingSideDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters5#DeliveringSideDetails
	 * FundSettlementParameters5.DeliveringSideDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters6#ReceivingSideDetails
	 * FundSettlementParameters6.ReceivingSideDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters6#DeliveringSideDetails
	 * FundSettlementParameters6.DeliveringSideDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails51#DeliveringSettlementParties
	 * TransactionDetails51.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails51#ReceivingSettlementParties
	 * TransactionDetails51.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails52#DeliveringSettlementParties
	 * TransactionDetails52.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails52#ReceivingSettlementParties
	 * TransactionDetails52.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason5#ReceivingSettlementParties
	 * OrderStatusAndReason5.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason5#DeliveringSettlementParties
	 * OrderStatusAndReason5.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation13#SettlementPartiesDetails
	 * ReceiveInformation13.SettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation12#SettlementPartiesDetails
	 * ReceiveInformation12.SettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation12#SettlementPartiesDetails
	 * DeliverInformation12.SettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation13#SettlementPartiesDetails
	 * DeliverInformation13.SettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails61#ReceivingSettlementParties
	 * TransactionDetails61.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails61#DeliveringSettlementParties
	 * TransactionDetails61.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails62#DeliveringSettlementParties
	 * TransactionDetails62.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails62#ReceivingSettlementParties
	 * TransactionDetails62.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails63#DeliveringSettlementParties
	 * TransactionDetails63.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails63#ReceivingSettlementParties
	 * TransactionDetails63.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails35#DeliveringSettlementParties
	 * SecuritiesTradeDetails35.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails35#ReceivingSettlementParties
	 * SecuritiesTradeDetails35.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails66#ReceivingSettlementParties
	 * TransactionDetails66.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails66#DeliveringSettlementParties
	 * TransactionDetails66.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails42#DeliveringSettlementParties
	 * SecuritiesTradeDetails42.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails42#ReceivingSettlementParties
	 * SecuritiesTradeDetails42.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails67#DeliveringSettlementParties
	 * TransactionDetails67.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails67#ReceivingSettlementParties
	 * TransactionDetails67.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails68#DeliveringSettlementParties
	 * TransactionDetails68.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails68#ReceivingSettlementParties
	 * TransactionDetails68.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation15#SettlementPartiesDetails
	 * DeliverInformation15.SettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation14#SettlementPartiesDetails
	 * DeliverInformation14.SettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation15#SettlementPartiesDetails
	 * ReceiveInformation15.SettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation14#SettlementPartiesDetails
	 * ReceiveInformation14.SettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails70#ReceivingSettlementParties
	 * TransactionDetails70.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails70#DeliveringSettlementParties
	 * TransactionDetails70.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails69#DeliveringSettlementParties
	 * TransactionDetails69.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails69#ReceivingSettlementParties
	 * TransactionDetails69.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation8#SettlementParties
	 * SettlementObligation8.SettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails88#SettlementParties
	 * SettlementDetails88.SettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails71#ReceivingSettlementParties
	 * TransactionDetails71.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails71#DeliveringSettlementParties
	 * TransactionDetails71.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails72#DeliveringSettlementParties
	 * TransactionDetails72.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails72#ReceivingSettlementParties
	 * TransactionDetails72.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails81#DeliveringSettlementParties
	 * TransactionDetails81.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails81#ReceivingSettlementParties
	 * TransactionDetails81.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails74#DeliveringSettlementParties
	 * TransactionDetails74.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails74#ReceivingSettlementParties
	 * TransactionDetails74.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails49#DeliveringSettlementParties
	 * SecuritiesTradeDetails49.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails49#ReceivingSettlementParties
	 * SecuritiesTradeDetails49.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails82#DeliveringSettlementParties
	 * TransactionDetails82.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails82#ReceivingSettlementParties
	 * TransactionDetails82.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails79#ReceivingSettlementParties
	 * TransactionDetails79.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails79#DeliveringSettlementParties
	 * TransactionDetails79.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48#DeliveringSettlementParties
	 * SecuritiesTradeDetails48.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48#ReceivingSettlementParties
	 * SecuritiesTradeDetails48.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails80#DeliveringSettlementParties
	 * TransactionDetails80.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails80#ReceivingSettlementParties
	 * TransactionDetails80.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails75#DeliveringSettlementParties
	 * TransactionDetails75.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails75#ReceivingSettlementParties
	 * TransactionDetails75.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails78#DeliveringSettlementParties
	 * TransactionDetails78.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails78#ReceivingSettlementParties
	 * TransactionDetails78.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation17#SettlementPartiesDetails
	 * ReceiveInformation17.SettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation16#SettlementPartiesDetails
	 * ReceiveInformation16.SettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount56#SettlementPartiesDetails
	 * InvestmentAccount56.SettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation16#SettlementPartiesDetails
	 * DeliverInformation16.SettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation17#SettlementPartiesDetails
	 * DeliverInformation17.SettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument48#SettlementPartiesReceivingSideDetails
	 * FinancialInstrument48.SettlementPartiesReceivingSideDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument46#SettlementPartiesReceivingSideDetails
	 * FinancialInstrument46.SettlementPartiesReceivingSideDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails102#SettlementParties
	 * SettlementDetails102.SettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails57#DeliveringSettlementParties
	 * SecuritiesTradeDetails57.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails57#ReceivingSettlementParties
	 * SecuritiesTradeDetails57.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails88#DeliveringSettlementParties
	 * TransactionDetails88.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails88#ReceivingSettlementParties
	 * TransactionDetails88.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails61#DeliveringSettlementParties
	 * SecuritiesTradeDetails61.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails61#ReceivingSettlementParties
	 * SecuritiesTradeDetails61.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails92#DeliveringSettlementParties
	 * TransactionDetails92.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails92#ReceivingSettlementParties
	 * TransactionDetails92.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails84#DeliveringSettlementParties
	 * TransactionDetails84.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails84#ReceivingSettlementParties
	 * TransactionDetails84.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails83#DeliveringSettlementParties
	 * TransactionDetails83.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails83#ReceivingSettlementParties
	 * TransactionDetails83.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails87#ReceivingSettlementParties
	 * TransactionDetails87.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails87#DeliveringSettlementParties
	 * TransactionDetails87.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails91#DeliveringSettlementParties
	 * TransactionDetails91.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails91#ReceivingSettlementParties
	 * TransactionDetails91.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails90#DeliveringSettlementParties
	 * TransactionDetails90.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails90#ReceivingSettlementParties
	 * TransactionDetails90.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters11#ReceivingSideDetails
	 * FundSettlementParameters11.ReceivingSideDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters11#DeliveringSideDetails
	 * FundSettlementParameters11.DeliveringSideDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters12#ReceivingSideDetails
	 * FundSettlementParameters12.ReceivingSideDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters12#DeliveringSideDetails
	 * FundSettlementParameters12.DeliveringSideDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#DeliveringSettlementParties
	 * SecuritiesTradeDetails68.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#ReceivingSettlementParties
	 * SecuritiesTradeDetails68.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails97#ReceivingSettlementParties
	 * TransactionDetails97.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails97#DeliveringSettlementParties
	 * TransactionDetails97.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails96#DeliveringSettlementParties
	 * TransactionDetails96.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails96#ReceivingSettlementParties
	 * TransactionDetails96.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails95#DeliveringSettlementParties
	 * TransactionDetails95.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails95#ReceivingSettlementParties
	 * TransactionDetails95.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails118#SettlementParties
	 * SettlementDetails118.SettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails69#DeliveringSettlementParties
	 * SecuritiesTradeDetails69.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails69#ReceivingSettlementParties
	 * SecuritiesTradeDetails69.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails100#ReceivingSettlementParties
	 * TransactionDetails100.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails100#DeliveringSettlementParties
	 * TransactionDetails100.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails99#DeliveringSettlementParties
	 * TransactionDetails99.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails99#ReceivingSettlementParties
	 * TransactionDetails99.ReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails98#DeliveringSettlementParties
	 * TransactionDetails98.DeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails98#ReceivingSettlementParties
	 * TransactionDetails98.ReceivingSettlementParties}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies each role linked to the settlement of securities and played by a party at that step in a securities transaction flow."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PartyRole = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DeliverInformation2.SettlementPartiesDetails, com.tools20022.repository.msg.DeliverInformation4.SettlementPartiesDetails,
					com.tools20022.repository.msg.DeliverInformation7.SettlementPartiesDetails, com.tools20022.repository.msg.ReceiveInformation2.SettlementPartiesDetails,
					com.tools20022.repository.msg.ReceiveInformation4.SettlementPartiesDetails, com.tools20022.repository.msg.ReceiveInformation8.SettlementPartiesDetails,
					com.tools20022.repository.msg.ReceiveInformation6.SettlementPartiesDetails, com.tools20022.repository.msg.ReceiveInformation11.SettlementPartiesDetails,
					com.tools20022.repository.msg.DeliverInformation11.SettlementPartiesDetails, com.tools20022.repository.msg.TransactionDetails10.DeliveringSettlementParties,
					com.tools20022.repository.msg.TransactionDetails10.ReceivingSettlementParties, com.tools20022.repository.msg.TransactionDetails29.DeliveringSettlementParties,
					com.tools20022.repository.msg.TransactionDetails29.ReceivingSettlementParties, com.tools20022.repository.msg.StandingSettlementInstruction1.OtherDeliveringSettlementParties,
					com.tools20022.repository.msg.StandingSettlementInstruction1.OtherReceivingSettlementParties, com.tools20022.repository.msg.TransactionDetails28.DeliveringSettlementParties,
					com.tools20022.repository.msg.TransactionDetails28.ReceivingSettlementParties, com.tools20022.repository.msg.TransactionDetails31.DeliveringSettlementParties,
					com.tools20022.repository.msg.TransactionDetails31.ReceivingSettlementParties, com.tools20022.repository.msg.TransactionDetails44.DeliveringSettlementParties,
					com.tools20022.repository.msg.TransactionDetails44.ReceivingSettlementParties, com.tools20022.repository.msg.DeliverInformation1.SettlementPartiesDetails,
					com.tools20022.repository.msg.DeliverInformation3.SettlementPartiesDetails, com.tools20022.repository.msg.DeliverInformation8.SettlementPartiesDetails,
					com.tools20022.repository.msg.ReceiveInformation1.SettlementPartiesDetails, com.tools20022.repository.msg.ReceiveInformation3.SettlementPartiesDetails,
					com.tools20022.repository.msg.ReceiveInformation7.SettlementPartiesDetails, com.tools20022.repository.msg.ReceiveInformation5.SettlementPartiesDetails,
					com.tools20022.repository.msg.ReceiveInformation9.SettlementPartiesDetails, com.tools20022.repository.msg.DeliverInformation5.SettlementPartiesDetails,
					com.tools20022.repository.msg.DeliverInformation9.SettlementPartiesDetails, com.tools20022.repository.msg.DeliverInformation6.SettlementPartiesDetails,
					com.tools20022.repository.msg.StandingSettlementInstruction2.OtherDeliveringSettlementParties, com.tools20022.repository.msg.StandingSettlementInstruction2.OtherReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails5.ReceivingSettlementParties, com.tools20022.repository.msg.TransactionDetails5.DeliveringSettlementParties,
					com.tools20022.repository.msg.TransactionDetails9.ReceivingSettlementParties, com.tools20022.repository.msg.TransactionDetails9.DeliveringSettlementParties,
					com.tools20022.repository.msg.TransactionDetails22.ReceivingSettlementParties, com.tools20022.repository.msg.TransactionDetails22.DeliveringSettlementParties,
					com.tools20022.repository.msg.TransactionDetails23.ReceivingSettlementParties, com.tools20022.repository.msg.TransactionDetails23.DeliveringSettlementParties,
					com.tools20022.repository.msg.TransactionDetails36.ReceivingSettlementParties, com.tools20022.repository.msg.TransactionDetails36.DeliveringSettlementParties,
					com.tools20022.repository.msg.TransactionDetails47.ReceivingSettlementParties, com.tools20022.repository.msg.TransactionDetails47.DeliveringSettlementParties,
					com.tools20022.repository.msg.TransactionDetails53.ReceivingSettlementParties, com.tools20022.repository.msg.TransactionDetails53.DeliveringSettlementParties,
					com.tools20022.repository.msg.TransactionDetails58.ReceivingSettlementParties, com.tools20022.repository.msg.TransactionDetails58.DeliveringSettlementParties,
					com.tools20022.repository.msg.TransactionDetails7.DeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails7.ReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails8.DeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails8.ReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails16.DeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails16.ReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails17.DeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails17.ReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails26.DeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails26.ReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails25.DeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails25.ReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails27.DeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails27.ReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails33.DeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails33.ReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails39.DeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails39.ReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails50.DeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails50.ReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails56.DeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails56.ReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails59.DeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails59.ReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails6.DeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails6.ReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails18.DeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails18.ReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails24.DeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails24.ReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails34.DeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails34.ReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails37.DeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails37.ReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails48.DeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails48.ReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails57.DeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails57.ReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails60.DeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails60.ReceivingSettlementParties,
					com.tools20022.repository.msg.FundSettlementParameters3.ReceivingSideDetails, com.tools20022.repository.msg.FundSettlementParameters3.DeliveringSideDetails,
					com.tools20022.repository.msg.FundSettlementParameters4.ReceivingSideDetails, com.tools20022.repository.msg.FundSettlementParameters4.DeliveringSideDetails,
					com.tools20022.repository.msg.SecuritiesTradeDetails7.DeliveringSettlementParties, com.tools20022.repository.msg.SecuritiesTradeDetails7.ReceivingSettlementParties,
					com.tools20022.repository.msg.SecuritiesTradeDetails19.DeliveringSettlementParties, com.tools20022.repository.msg.SecuritiesTradeDetails19.ReceivingSettlementParties,
					com.tools20022.repository.msg.SecuritiesTradeDetails4.DeliveringSettlementParties, com.tools20022.repository.msg.SecuritiesTradeDetails4.ReceivingSettlementParties,
					com.tools20022.repository.msg.SecuritiesTradeDetails17.DeliveringSettlementParties, com.tools20022.repository.msg.SecuritiesTradeDetails17.ReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails4.DeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails4.ReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails30.DeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails30.ReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails20.DeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails20.ReceivingSettlementParties,
					com.tools20022.repository.msg.SecuritiesTradeDetails10.DeliveringSettlementParties, com.tools20022.repository.msg.SecuritiesTradeDetails10.ReceivingSettlementParties,
					com.tools20022.repository.msg.SecuritiesTradeDetails22.DeliveringSettlementParties, com.tools20022.repository.msg.SecuritiesTradeDetails22.ReceivingSettlementParties,
					com.tools20022.repository.msg.SecuritiesTradeDetails23.DeliveringSettlementParties, com.tools20022.repository.msg.SecuritiesTradeDetails23.ReceivingSettlementParties,
					com.tools20022.repository.msg.SecuritiesTradeDetails29.DeliveringSettlementParties, com.tools20022.repository.msg.SecuritiesTradeDetails29.ReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails40.DeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails40.ReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails42.DeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails42.ReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails46.DeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails46.ReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails32.DeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails32.ReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails14.DeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails14.ReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails35.DeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails35.ReceivingSettlementParties,
					com.tools20022.repository.msg.SecuritiesTradeDetails14.DeliveringSettlementParties, com.tools20022.repository.msg.SecuritiesTradeDetails14.ReceivingSettlementParties,
					com.tools20022.repository.msg.SecuritiesTradeDetails20.DeliveringSettlementParties, com.tools20022.repository.msg.SecuritiesTradeDetails20.ReceivingSettlementParties,
					com.tools20022.repository.msg.SecuritiesTradeDetails24.DeliveringSettlementParties, com.tools20022.repository.msg.SecuritiesTradeDetails24.ReceivingSettlementParties,
					com.tools20022.repository.msg.SecuritiesTradeDetails30.DeliveringSettlementParties, com.tools20022.repository.msg.SecuritiesTradeDetails30.ReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails45.DeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails45.ReceivingSettlementParties,
					com.tools20022.repository.msg.SettlementObligation4.SettlementParties, com.tools20022.repository.msg.FundSettlementParameters7.DeliveringSideDetails,
					com.tools20022.repository.msg.FundSettlementParameters8.ReceivingSideDetails, com.tools20022.repository.msg.FundSettlementParameters5.ReceivingSideDetails,
					com.tools20022.repository.msg.FundSettlementParameters5.DeliveringSideDetails, com.tools20022.repository.msg.FundSettlementParameters6.ReceivingSideDetails,
					com.tools20022.repository.msg.FundSettlementParameters6.DeliveringSideDetails, com.tools20022.repository.msg.TransactionDetails51.DeliveringSettlementParties,
					com.tools20022.repository.msg.TransactionDetails51.ReceivingSettlementParties, com.tools20022.repository.msg.TransactionDetails52.DeliveringSettlementParties,
					com.tools20022.repository.msg.TransactionDetails52.ReceivingSettlementParties, com.tools20022.repository.msg.OrderStatusAndReason5.ReceivingSettlementParties,
					com.tools20022.repository.msg.OrderStatusAndReason5.DeliveringSettlementParties, com.tools20022.repository.msg.ReceiveInformation13.SettlementPartiesDetails,
					com.tools20022.repository.msg.ReceiveInformation12.SettlementPartiesDetails, com.tools20022.repository.msg.DeliverInformation12.SettlementPartiesDetails,
					com.tools20022.repository.msg.DeliverInformation13.SettlementPartiesDetails, com.tools20022.repository.msg.TransactionDetails61.ReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails61.DeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails62.DeliveringSettlementParties,
					com.tools20022.repository.msg.TransactionDetails62.ReceivingSettlementParties, com.tools20022.repository.msg.TransactionDetails63.DeliveringSettlementParties,
					com.tools20022.repository.msg.TransactionDetails63.ReceivingSettlementParties, com.tools20022.repository.msg.SecuritiesTradeDetails35.DeliveringSettlementParties,
					com.tools20022.repository.msg.SecuritiesTradeDetails35.ReceivingSettlementParties, com.tools20022.repository.msg.TransactionDetails66.ReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails66.DeliveringSettlementParties, com.tools20022.repository.msg.SecuritiesTradeDetails42.DeliveringSettlementParties,
					com.tools20022.repository.msg.SecuritiesTradeDetails42.ReceivingSettlementParties, com.tools20022.repository.msg.TransactionDetails67.DeliveringSettlementParties,
					com.tools20022.repository.msg.TransactionDetails67.ReceivingSettlementParties, com.tools20022.repository.msg.TransactionDetails68.DeliveringSettlementParties,
					com.tools20022.repository.msg.TransactionDetails68.ReceivingSettlementParties, com.tools20022.repository.msg.DeliverInformation15.SettlementPartiesDetails,
					com.tools20022.repository.msg.DeliverInformation14.SettlementPartiesDetails, com.tools20022.repository.msg.ReceiveInformation15.SettlementPartiesDetails,
					com.tools20022.repository.msg.ReceiveInformation14.SettlementPartiesDetails, com.tools20022.repository.msg.TransactionDetails70.ReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails70.DeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails69.DeliveringSettlementParties,
					com.tools20022.repository.msg.TransactionDetails69.ReceivingSettlementParties, com.tools20022.repository.msg.SettlementObligation8.SettlementParties, com.tools20022.repository.msg.SettlementDetails88.SettlementParties,
					com.tools20022.repository.msg.TransactionDetails71.ReceivingSettlementParties, com.tools20022.repository.msg.TransactionDetails71.DeliveringSettlementParties,
					com.tools20022.repository.msg.TransactionDetails72.DeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails72.ReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails81.DeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails81.ReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails74.DeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails74.ReceivingSettlementParties,
					com.tools20022.repository.msg.SecuritiesTradeDetails49.DeliveringSettlementParties, com.tools20022.repository.msg.SecuritiesTradeDetails49.ReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails82.DeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails82.ReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails79.ReceivingSettlementParties, com.tools20022.repository.msg.TransactionDetails79.DeliveringSettlementParties,
					com.tools20022.repository.msg.SecuritiesTradeDetails48.DeliveringSettlementParties, com.tools20022.repository.msg.SecuritiesTradeDetails48.ReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails80.DeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails80.ReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails75.DeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails75.ReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails78.DeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails78.ReceivingSettlementParties,
					com.tools20022.repository.msg.ReceiveInformation17.SettlementPartiesDetails, com.tools20022.repository.msg.ReceiveInformation16.SettlementPartiesDetails,
					com.tools20022.repository.msg.InvestmentAccount56.SettlementPartiesDetails, com.tools20022.repository.msg.DeliverInformation16.SettlementPartiesDetails,
					com.tools20022.repository.msg.DeliverInformation17.SettlementPartiesDetails, com.tools20022.repository.msg.FinancialInstrument48.SettlementPartiesReceivingSideDetails,
					com.tools20022.repository.msg.FinancialInstrument46.SettlementPartiesReceivingSideDetails, com.tools20022.repository.msg.SettlementDetails102.SettlementParties,
					com.tools20022.repository.msg.SecuritiesTradeDetails57.DeliveringSettlementParties, com.tools20022.repository.msg.SecuritiesTradeDetails57.ReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails88.DeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails88.ReceivingSettlementParties,
					com.tools20022.repository.msg.SecuritiesTradeDetails61.DeliveringSettlementParties, com.tools20022.repository.msg.SecuritiesTradeDetails61.ReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails92.DeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails92.ReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails84.DeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails84.ReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails83.DeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails83.ReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails87.ReceivingSettlementParties, com.tools20022.repository.msg.TransactionDetails87.DeliveringSettlementParties,
					com.tools20022.repository.msg.TransactionDetails91.DeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails91.ReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails90.DeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails90.ReceivingSettlementParties,
					com.tools20022.repository.msg.FundSettlementParameters11.ReceivingSideDetails, com.tools20022.repository.msg.FundSettlementParameters11.DeliveringSideDetails,
					com.tools20022.repository.msg.FundSettlementParameters12.ReceivingSideDetails, com.tools20022.repository.msg.FundSettlementParameters12.DeliveringSideDetails,
					com.tools20022.repository.msg.SecuritiesTradeDetails68.DeliveringSettlementParties, com.tools20022.repository.msg.SecuritiesTradeDetails68.ReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails97.ReceivingSettlementParties, com.tools20022.repository.msg.TransactionDetails97.DeliveringSettlementParties,
					com.tools20022.repository.msg.TransactionDetails96.DeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails96.ReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails95.DeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails95.ReceivingSettlementParties,
					com.tools20022.repository.msg.SettlementDetails118.SettlementParties, com.tools20022.repository.msg.SecuritiesTradeDetails69.DeliveringSettlementParties,
					com.tools20022.repository.msg.SecuritiesTradeDetails69.ReceivingSettlementParties, com.tools20022.repository.msg.TransactionDetails100.ReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails100.DeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails99.DeliveringSettlementParties,
					com.tools20022.repository.msg.TransactionDetails99.ReceivingSettlementParties, com.tools20022.repository.msg.TransactionDetails98.DeliveringSettlementParties,
					com.tools20022.repository.msg.TransactionDetails98.ReceivingSettlementParties);
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies each role linked to the settlement of securities and played by a party at that step in a securities transaction flow.";
			minOccurs = 0;
			type_lazy = () -> SecuritiesSettlementPartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlementPartyRole.SecuritiesSettlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Amount of money settled or to be settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation4#SettlementAmount
	 * DeliverInformation4.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation7#SettlementAmount
	 * DeliverInformation7.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation4#SettlementAmount
	 * ReceiveInformation4.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation8#SettlementAmount
	 * ReceiveInformation8.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation6#SettlementAmount
	 * ReceiveInformation6.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation11#SettlementAmount
	 * ReceiveInformation11.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation11#SettlementAmount
	 * DeliverInformation11.SettlementAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AmountAndDirection8#Amount
	 * AmountAndDirection8.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails10#SettlementAmount
	 * TransactionDetails10.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails29#SettlementAmount
	 * TransactionDetails29.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection32#Amount
	 * AmountAndDirection32.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AmountAndDirection9#Amount
	 * AmountAndDirection9.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails3#SettlementAmount
	 * SecuritiesSettlementTransactionDetails3.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails4#SettlementAmount
	 * SecuritiesSettlementTransactionDetails4.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails2#SettlementAmount
	 * SecuritiesSettlementTransactionDetails2.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails28#SettlementAmount
	 * TransactionDetails28.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection12#Amount
	 * AmountAndDirection12.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails31#SettlementAmount
	 * TransactionDetails31.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails44#SettlementAmount
	 * TransactionDetails44.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection33#Amount
	 * AmountAndDirection33.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection17#Amount
	 * AmountAndDirection17.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails5#SettlementAmount
	 * SecuritiesSettlementTransactionDetails5.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails6#SettlementAmount
	 * SecuritiesSettlementTransactionDetails6.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails7#SettlementAmount
	 * SecuritiesSettlementTransactionDetails7.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation3#SettlementAmount
	 * DeliverInformation3.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation8#SettlementAmount
	 * DeliverInformation8.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation3#SettlementAmount
	 * ReceiveInformation3.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation7#SettlementAmount
	 * ReceiveInformation7.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation5#SettlementAmount
	 * ReceiveInformation5.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation9#SettlementAmount
	 * ReceiveInformation9.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation5#SettlementAmount
	 * DeliverInformation5.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation9#SettlementAmount
	 * DeliverInformation9.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation6#SettlementAmount
	 * DeliverInformation6.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails2#RemainingToBeSettledQuantity
	 * IntraPositionDetails2.RemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails8#RemainingToBeSettledQuantity
	 * IntraPositionDetails8.RemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails12#RemainingToBeSettledQuantity
	 * IntraPositionDetails12.RemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection24#Amount
	 * AmountAndDirection24.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails13#RemainingToBeSettledQuantity
	 * IntraPositionDetails13.RemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails22#RemainingToBeSettledQuantity
	 * IntraPositionDetails22.RemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails26#RemainingToBeSettledQuantity
	 * IntraPositionDetails26.RemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails27#RemainingToBeSettledQuantity
	 * IntraPositionDetails27.RemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails29#RemainingToBeSettledQuantity
	 * IntraPositionDetails29.RemainingToBeSettledQuantity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AmountAndDirection6#Amount
	 * AmountAndDirection6.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection14#Amount
	 * AmountAndDirection14.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AmountAndDirection5#Amount
	 * AmountAndDirection5.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount6#PreviouslySettledAmount
	 * QuantityAndAccount6.PreviouslySettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount6#RemainingToBeSettledAmount
	 * QuantityAndAccount6.RemainingToBeSettledAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AmountAndDirection4#Amount
	 * AmountAndDirection4.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AmountAndDirection2#Amount
	 * AmountAndDirection2.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection19#Amount
	 * AmountAndDirection19.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount11#PreviouslySettledAmount
	 * QuantityAndAccount11.PreviouslySettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount11#RemainingToBeSettledAmount
	 * QuantityAndAccount11.RemainingToBeSettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection13#Amount
	 * AmountAndDirection13.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection16#Amount
	 * AmountAndDirection16.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount18#PreviouslySettledAmount
	 * QuantityAndAccount18.PreviouslySettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount18#RemainingToBeSettledAmount
	 * QuantityAndAccount18.RemainingToBeSettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount19#PreviouslySettledAmount
	 * QuantityAndAccount19.PreviouslySettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount19#RemainingToBeSettledAmount
	 * QuantityAndAccount19.RemainingToBeSettledAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AmountAndDirection7#Amount
	 * AmountAndDirection7.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount2#PreviouslySettledAmount
	 * QuantityAndAccount2.PreviouslySettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount2#RemainingToBeSettledAmount
	 * QuantityAndAccount2.RemainingToBeSettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection15#Amount
	 * AmountAndDirection15.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount12#PreviouslySettledAmount
	 * QuantityAndAccount12.PreviouslySettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount12#RemainingToBeSettledAmount
	 * QuantityAndAccount12.RemainingToBeSettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount15#PreviouslySettledAmount
	 * QuantityAndAccount15.PreviouslySettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount15#RemainingToBeSettledAmount
	 * QuantityAndAccount15.RemainingToBeSettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount20#PreviouslySettledAmount
	 * QuantityAndAccount20.PreviouslySettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount20#RemainingToBeSettledAmount
	 * QuantityAndAccount20.RemainingToBeSettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount28#PreviouslySettledAmount
	 * QuantityAndAccount28.PreviouslySettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount28#RemainingToBeSettledAmount
	 * QuantityAndAccount28.RemainingToBeSettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount37#PreviouslySettledAmount
	 * QuantityAndAccount37.PreviouslySettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount37#RemainingToBeSettledAmount
	 * QuantityAndAccount37.RemainingToBeSettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails8#SettlementAmount
	 * SecuritiesSettlementTransactionDetails8.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails9#SettlementAmount
	 * SecuritiesSettlementTransactionDetails9.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails10#SettlementAmount
	 * SecuritiesSettlementTransactionDetails10.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails11#SettlementAmount
	 * SecuritiesSettlementTransactionDetails11.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails12#SettlementAmount
	 * SecuritiesSettlementTransactionDetails12.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails13#SettlementAmount
	 * SecuritiesSettlementTransactionDetails13.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails5#SettlementAmount
	 * TransactionDetails5.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails9#SettlementAmount
	 * TransactionDetails9.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails22#SettlementAmount
	 * TransactionDetails22.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails23#SettlementAmount
	 * TransactionDetails23.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails36#SettlementAmount
	 * TransactionDetails36.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails47#SettlementAmount
	 * TransactionDetails47.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails53#SettlementAmount
	 * TransactionDetails53.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails58#SettlementAmount
	 * TransactionDetails58.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails7#PostingAmount
	 * TransactionDetails7.PostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails8#PostingAmount
	 * TransactionDetails8.PostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails16#PostingAmount
	 * TransactionDetails16.PostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails17#PostingAmount
	 * TransactionDetails17.PostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails26#PostingAmount
	 * TransactionDetails26.PostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails25#PostingAmount
	 * TransactionDetails25.PostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails27#PostingAmount
	 * TransactionDetails27.PostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails33#PostingAmount
	 * TransactionDetails33.PostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails39#PostingAmount
	 * TransactionDetails39.PostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails50#PostingAmount
	 * TransactionDetails50.PostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails56#PostingAmount
	 * TransactionDetails56.PostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails59#PostingAmount
	 * TransactionDetails59.PostingAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AmountAndDirection3#Amount
	 * AmountAndDirection3.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails6#PostingAmount
	 * TransactionDetails6.PostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection18#Amount
	 * AmountAndDirection18.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails18#PostingAmount
	 * TransactionDetails18.PostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails24#PostingAmount
	 * TransactionDetails24.PostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails34#PostingAmount
	 * TransactionDetails34.PostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails37#PostingAmount
	 * TransactionDetails37.PostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails48#PostingAmount
	 * TransactionDetails48.PostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails57#PostingAmount
	 * TransactionDetails57.PostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails60#PostingAmount
	 * TransactionDetails60.PostingAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AmountAndDirection1#Amount
	 * AmountAndDirection1.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection29#Amount
	 * AmountAndDirection29.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection28#Amount
	 * AmountAndDirection28.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder5#SettlementAmount
	 * RedemptionOrder5.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder7#SettlementAmount
	 * RedemptionOrder7.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder6#SettlementAmount
	 * RedemptionOrder6.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#SettlementAmount
	 * RedemptionOrder8.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#SettlementAmount
	 * InvestmentFundTransaction3.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#SettlementAmount
	 * SubscriptionOrder5.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#SettlementAmount
	 * SubscriptionExecution5.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#SettlementAmount
	 * SubscriptionOrder7.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder6#SettlementAmount
	 * SubscriptionOrder6.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#SettlementAmount
	 * SubscriptionExecution6.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder8#SettlementAmount
	 * SubscriptionOrder8.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder3#SettlementAmount
	 * SwitchOrder3.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution4#SettlementAmount
	 * SwitchExecution4.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder4#SettlementAmount
	 * SwitchOrder4.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails1#SettlementAmount
	 * TransactionDetails1.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails3#SettlementAmount
	 * TransactionDetails3.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection10#Amount
	 * AmountAndDirection10.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection22#Amount
	 * AmountAndDirection22.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection23#Amount
	 * AmountAndDirection23.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails4#SettlementAmount
	 * TransactionDetails4.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails30#SettlementAmount
	 * TransactionDetails30.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection20#Amount
	 * AmountAndDirection20.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection11#Amount
	 * AmountAndDirection11.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails20#SettlementAmount
	 * TransactionDetails20.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection25#Amount
	 * AmountAndDirection25.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection26#Amount
	 * AmountAndDirection26.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails40#SettlementAmount
	 * TransactionDetails40.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails42#SettlementAmount
	 * TransactionDetails42.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails46#SettlementAmount
	 * TransactionDetails46.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails32#SettlementAmount
	 * TransactionDetails32.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails14#SettlementAmount
	 * TransactionDetails14.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails35#SettlementAmount
	 * TransactionDetails35.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails45#SettlementAmount
	 * TransactionDetails45.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection31#Amount
	 * AmountAndDirection31.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation1#SettlementAmount
	 * SettlementObligation1.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation1#RemainingAmountToBeSettled
	 * SettlementObligation1.RemainingAmountToBeSettled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection27#Amount
	 * AmountAndDirection27.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation6#SettlementAmount
	 * SettlementObligation6.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation6#RemainingAmountToBeSettled
	 * SettlementObligation6.RemainingAmountToBeSettled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation3#SettlementAmount
	 * SettlementObligation3.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation2#SettlementAmount
	 * SettlementObligation2.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation5#SettlementAmount
	 * SettlementObligation5.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation4#SettlementAmount
	 * SettlementObligation4.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection21#Amount
	 * AmountAndDirection21.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails21#SettlementAmount
	 * SettlementDetails21.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentQuantity2#SettlementAmount
	 * FinancialInstrumentQuantity2.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentQuantity3#SettlementAmount
	 * FinancialInstrumentQuantity3.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution9#SettlementAmount
	 * SubscriptionExecution9.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails51#SettlementAmount
	 * TransactionDetails51.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails51#SettledAmount
	 * TransactionDetails51.SettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails51#PreviouslySettledAmount
	 * TransactionDetails51.PreviouslySettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails51#RemainingSettlementAmount
	 * TransactionDetails51.RemainingSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails52#SettlementAmount
	 * TransactionDetails52.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation13#SettlementAmount
	 * ReceiveInformation13.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation12#SettlementAmount
	 * ReceiveInformation12.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation12#SettlementAmount
	 * DeliverInformation12.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation13#SettlementAmount
	 * DeliverInformation13.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails61#SettlementAmount
	 * TransactionDetails61.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails16#SettlementAmount
	 * SecuritiesSettlementTransactionDetails16.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails14#SettlementAmount
	 * SecuritiesSettlementTransactionDetails14.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails15#SettlementAmount
	 * SecuritiesSettlementTransactionDetails15.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection36#Amount
	 * AmountAndDirection36.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails62#PostingAmount
	 * TransactionDetails62.PostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection37#Amount
	 * AmountAndDirection37.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails63#PostingAmount
	 * TransactionDetails63.PostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection38#Amount
	 * AmountAndDirection38.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails66#SettlementAmount
	 * TransactionDetails66.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails67#PostingAmount
	 * TransactionDetails67.PostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails68#PostingAmount
	 * TransactionDetails68.PostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails17#SettlementAmount
	 * SecuritiesSettlementTransactionDetails17.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails18#SettlementAmount
	 * SecuritiesSettlementTransactionDetails18.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails19#SettlementAmount
	 * SecuritiesSettlementTransactionDetails19.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection40#Amount
	 * AmountAndDirection40.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#SettlementAmount
	 * InvestmentFundTransaction4.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation15#SettlementAmount
	 * DeliverInformation15.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation14#SettlementAmount
	 * DeliverInformation14.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation15#SettlementAmount
	 * ReceiveInformation15.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation14#SettlementAmount
	 * ReceiveInformation14.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails70#SettlementAmount
	 * TransactionDetails70.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails69#PostingAmount
	 * TransactionDetails69.PostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation7#SettlementAmount
	 * SettlementObligation7.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation7#RemainingAmountToBeSettled
	 * SettlementObligation7.RemainingAmountToBeSettled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation8#SettlementAmount
	 * SettlementObligation8.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails71#SettlementAmount
	 * TransactionDetails71.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails72#PostingAmount
	 * TransactionDetails72.PostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount41#PreviouslySettledAmount
	 * QuantityAndAccount41.PreviouslySettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount41#RemainingToBeSettledAmount
	 * QuantityAndAccount41.RemainingToBeSettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount40#PreviouslySettledAmount
	 * QuantityAndAccount40.PreviouslySettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount40#RemainingToBeSettledAmount
	 * QuantityAndAccount40.RemainingToBeSettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails81#SettlementAmount
	 * TransactionDetails81.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails74#SettlementAmount
	 * TransactionDetails74.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails82#SettlementAmount
	 * TransactionDetails82.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails79#SettlementAmount
	 * TransactionDetails79.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails80#SettlementAmount
	 * TransactionDetails80.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails21#SettlementAmount
	 * SecuritiesSettlementTransactionDetails21.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails22#SettlementAmount
	 * SecuritiesSettlementTransactionDetails22.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails20#SettlementAmount
	 * SecuritiesSettlementTransactionDetails20.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails75#PostingAmount
	 * TransactionDetails75.PostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails78#PostingAmount
	 * TransactionDetails78.PostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection46#Amount
	 * AmountAndDirection46.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection49#Amount
	 * AmountAndDirection49.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails34#RemainingToBeSettledQuantity
	 * IntraPositionDetails34.RemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection48#Amount
	 * AmountAndDirection48.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection44#Amount
	 * AmountAndDirection44.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection45#Amount
	 * AmountAndDirection45.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection51#Amount
	 * AmountAndDirection51.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection52#Amount
	 * AmountAndDirection52.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection47#Amount
	 * AmountAndDirection47.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation17#SettlementAmount
	 * ReceiveInformation17.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation16#SettlementAmount
	 * ReceiveInformation16.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation16#SettlementAmount
	 * DeliverInformation16.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation17#SettlementAmount
	 * DeliverInformation17.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection66#Amount
	 * AmountAndDirection66.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails88#SettlementAmount
	 * TransactionDetails88.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount46#PreviouslySettledAmount
	 * QuantityAndAccount46.PreviouslySettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount46#RemainingToBeSettledAmount
	 * QuantityAndAccount46.RemainingToBeSettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection60#Amount
	 * AmountAndDirection60.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails92#SettlementAmount
	 * TransactionDetails92.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails84#SettlementAmount
	 * TransactionDetails84.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails35#RemainingToBeSettledQuantity
	 * IntraPositionDetails35.RemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails83#SettlementAmount
	 * TransactionDetails83.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount51#PreviouslySettledAmount
	 * QuantityAndAccount51.PreviouslySettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount51#RemainingToBeSettledAmount
	 * QuantityAndAccount51.RemainingToBeSettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails87#SettlementAmount
	 * TransactionDetails87.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection71#Amount
	 * AmountAndDirection71.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection57#Amount
	 * AmountAndDirection57.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection85#Amount
	 * AmountAndDirection85.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection55#Amount
	 * AmountAndDirection55.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails23#SettlementAmount
	 * SecuritiesSettlementTransactionDetails23.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails25#SettlementAmount
	 * SecuritiesSettlementTransactionDetails25.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails24#SettlementAmount
	 * SecuritiesSettlementTransactionDetails24.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection59#Amount
	 * AmountAndDirection59.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails91#PostingAmount
	 * TransactionDetails91.PostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection58#Amount
	 * AmountAndDirection58.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection72#Amount
	 * AmountAndDirection72.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails90#PostingAmount
	 * TransactionDetails90.PostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection67#Amount
	 * AmountAndDirection67.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution7#SettlementAmount
	 * SwitchExecution7.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder7#SettlementAmount
	 * SwitchOrder7.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#SettlementAmount
	 * RedemptionOrder14.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#SettlementAmount
	 * SubscriptionExecution13.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#SettlementAmount
	 * SubscriptionExecution12.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#SettlementAmount
	 * SubscriptionOrder15.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder15#SettlementAmount
	 * RedemptionOrder15.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#SettlementAmount
	 * SubscriptionOrder14.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails41#RemainingToBeSettledQuantity
	 * IntraPositionDetails41.RemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails97#SettlementAmount
	 * TransactionDetails97.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails27#SettlementAmount
	 * SecuritiesSettlementTransactionDetails27.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails28#SettlementAmount
	 * SecuritiesSettlementTransactionDetails28.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails26#SettlementAmount
	 * SecuritiesSettlementTransactionDetails26.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails96#PostingAmount
	 * TransactionDetails96.PostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails95#PostingAmount
	 * TransactionDetails95.PostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails43#RemainingToBeSettledQuantity
	 * IntraPositionDetails43.RemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails30#SettlementAmount
	 * SecuritiesSettlementTransactionDetails30.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails29#SettlementAmount
	 * SecuritiesSettlementTransactionDetails29.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails31#SettlementAmount
	 * SecuritiesSettlementTransactionDetails31.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails100#SettlementAmount
	 * TransactionDetails100.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails99#PostingAmount
	 * TransactionDetails99.PostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails98#PostingAmount
	 * TransactionDetails98.PostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount57#PreviouslySettledAmount
	 * QuantityAndAccount57.PreviouslySettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount57#RemainingToBeSettledAmount
	 * QuantityAndAccount57.RemainingToBeSettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount62#PreviouslySettledAmount
	 * QuantityAndAccount62.PreviouslySettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount62#RemainingToBeSettledAmount
	 * QuantityAndAccount62.RemainingToBeSettledAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money settled or to be settled."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SettlementAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DeliverInformation4.SettlementAmount, com.tools20022.repository.msg.DeliverInformation7.SettlementAmount,
					com.tools20022.repository.msg.ReceiveInformation4.SettlementAmount, com.tools20022.repository.msg.ReceiveInformation8.SettlementAmount, com.tools20022.repository.msg.ReceiveInformation6.SettlementAmount,
					com.tools20022.repository.msg.ReceiveInformation11.SettlementAmount, com.tools20022.repository.msg.DeliverInformation11.SettlementAmount, com.tools20022.repository.msg.AmountAndDirection8.Amount,
					com.tools20022.repository.msg.TransactionDetails10.SettlementAmount, com.tools20022.repository.msg.TransactionDetails29.SettlementAmount, com.tools20022.repository.msg.AmountAndDirection32.Amount,
					com.tools20022.repository.msg.AmountAndDirection9.Amount, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails3.SettlementAmount,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails4.SettlementAmount, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails2.SettlementAmount,
					com.tools20022.repository.msg.TransactionDetails28.SettlementAmount, com.tools20022.repository.msg.AmountAndDirection12.Amount, com.tools20022.repository.msg.TransactionDetails31.SettlementAmount,
					com.tools20022.repository.msg.TransactionDetails44.SettlementAmount, com.tools20022.repository.msg.AmountAndDirection33.Amount, com.tools20022.repository.msg.AmountAndDirection17.Amount,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails5.SettlementAmount, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails6.SettlementAmount,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails7.SettlementAmount, com.tools20022.repository.msg.DeliverInformation3.SettlementAmount,
					com.tools20022.repository.msg.DeliverInformation8.SettlementAmount, com.tools20022.repository.msg.ReceiveInformation3.SettlementAmount, com.tools20022.repository.msg.ReceiveInformation7.SettlementAmount,
					com.tools20022.repository.msg.ReceiveInformation5.SettlementAmount, com.tools20022.repository.msg.ReceiveInformation9.SettlementAmount, com.tools20022.repository.msg.DeliverInformation5.SettlementAmount,
					com.tools20022.repository.msg.DeliverInformation9.SettlementAmount, com.tools20022.repository.msg.DeliverInformation6.SettlementAmount, com.tools20022.repository.msg.IntraPositionDetails2.RemainingToBeSettledQuantity,
					com.tools20022.repository.msg.IntraPositionDetails8.RemainingToBeSettledQuantity, com.tools20022.repository.msg.IntraPositionDetails12.RemainingToBeSettledQuantity,
					com.tools20022.repository.msg.AmountAndDirection24.Amount, com.tools20022.repository.msg.IntraPositionDetails13.RemainingToBeSettledQuantity,
					com.tools20022.repository.msg.IntraPositionDetails22.RemainingToBeSettledQuantity, com.tools20022.repository.msg.IntraPositionDetails26.RemainingToBeSettledQuantity,
					com.tools20022.repository.msg.IntraPositionDetails27.RemainingToBeSettledQuantity, com.tools20022.repository.msg.IntraPositionDetails29.RemainingToBeSettledQuantity,
					com.tools20022.repository.msg.AmountAndDirection6.Amount, com.tools20022.repository.msg.AmountAndDirection14.Amount, com.tools20022.repository.msg.AmountAndDirection5.Amount,
					com.tools20022.repository.msg.QuantityAndAccount6.PreviouslySettledAmount, com.tools20022.repository.msg.QuantityAndAccount6.RemainingToBeSettledAmount, com.tools20022.repository.msg.AmountAndDirection4.Amount,
					com.tools20022.repository.msg.AmountAndDirection2.Amount, com.tools20022.repository.msg.AmountAndDirection19.Amount, com.tools20022.repository.msg.QuantityAndAccount11.PreviouslySettledAmount,
					com.tools20022.repository.msg.QuantityAndAccount11.RemainingToBeSettledAmount, com.tools20022.repository.msg.AmountAndDirection13.Amount, com.tools20022.repository.msg.AmountAndDirection16.Amount,
					com.tools20022.repository.msg.QuantityAndAccount18.PreviouslySettledAmount, com.tools20022.repository.msg.QuantityAndAccount18.RemainingToBeSettledAmount,
					com.tools20022.repository.msg.QuantityAndAccount19.PreviouslySettledAmount, com.tools20022.repository.msg.QuantityAndAccount19.RemainingToBeSettledAmount, com.tools20022.repository.msg.AmountAndDirection7.Amount,
					com.tools20022.repository.msg.QuantityAndAccount2.PreviouslySettledAmount, com.tools20022.repository.msg.QuantityAndAccount2.RemainingToBeSettledAmount, com.tools20022.repository.msg.AmountAndDirection15.Amount,
					com.tools20022.repository.msg.QuantityAndAccount12.PreviouslySettledAmount, com.tools20022.repository.msg.QuantityAndAccount12.RemainingToBeSettledAmount,
					com.tools20022.repository.msg.QuantityAndAccount15.PreviouslySettledAmount, com.tools20022.repository.msg.QuantityAndAccount15.RemainingToBeSettledAmount,
					com.tools20022.repository.msg.QuantityAndAccount20.PreviouslySettledAmount, com.tools20022.repository.msg.QuantityAndAccount20.RemainingToBeSettledAmount,
					com.tools20022.repository.msg.QuantityAndAccount28.PreviouslySettledAmount, com.tools20022.repository.msg.QuantityAndAccount28.RemainingToBeSettledAmount,
					com.tools20022.repository.msg.QuantityAndAccount37.PreviouslySettledAmount, com.tools20022.repository.msg.QuantityAndAccount37.RemainingToBeSettledAmount,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails8.SettlementAmount, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails9.SettlementAmount,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails10.SettlementAmount, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails11.SettlementAmount,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails12.SettlementAmount, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails13.SettlementAmount,
					com.tools20022.repository.msg.TransactionDetails5.SettlementAmount, com.tools20022.repository.msg.TransactionDetails9.SettlementAmount, com.tools20022.repository.msg.TransactionDetails22.SettlementAmount,
					com.tools20022.repository.msg.TransactionDetails23.SettlementAmount, com.tools20022.repository.msg.TransactionDetails36.SettlementAmount, com.tools20022.repository.msg.TransactionDetails47.SettlementAmount,
					com.tools20022.repository.msg.TransactionDetails53.SettlementAmount, com.tools20022.repository.msg.TransactionDetails58.SettlementAmount, com.tools20022.repository.msg.TransactionDetails7.PostingAmount,
					com.tools20022.repository.msg.TransactionDetails8.PostingAmount, com.tools20022.repository.msg.TransactionDetails16.PostingAmount, com.tools20022.repository.msg.TransactionDetails17.PostingAmount,
					com.tools20022.repository.msg.TransactionDetails26.PostingAmount, com.tools20022.repository.msg.TransactionDetails25.PostingAmount, com.tools20022.repository.msg.TransactionDetails27.PostingAmount,
					com.tools20022.repository.msg.TransactionDetails33.PostingAmount, com.tools20022.repository.msg.TransactionDetails39.PostingAmount, com.tools20022.repository.msg.TransactionDetails50.PostingAmount,
					com.tools20022.repository.msg.TransactionDetails56.PostingAmount, com.tools20022.repository.msg.TransactionDetails59.PostingAmount, com.tools20022.repository.msg.AmountAndDirection3.Amount,
					com.tools20022.repository.msg.TransactionDetails6.PostingAmount, com.tools20022.repository.msg.AmountAndDirection18.Amount, com.tools20022.repository.msg.TransactionDetails18.PostingAmount,
					com.tools20022.repository.msg.TransactionDetails24.PostingAmount, com.tools20022.repository.msg.TransactionDetails34.PostingAmount, com.tools20022.repository.msg.TransactionDetails37.PostingAmount,
					com.tools20022.repository.msg.TransactionDetails48.PostingAmount, com.tools20022.repository.msg.TransactionDetails57.PostingAmount, com.tools20022.repository.msg.TransactionDetails60.PostingAmount,
					com.tools20022.repository.msg.AmountAndDirection1.Amount, com.tools20022.repository.msg.AmountAndDirection29.Amount, com.tools20022.repository.msg.AmountAndDirection28.Amount,
					com.tools20022.repository.msg.RedemptionOrder5.SettlementAmount, com.tools20022.repository.msg.RedemptionOrder7.SettlementAmount, com.tools20022.repository.msg.RedemptionOrder6.SettlementAmount,
					com.tools20022.repository.msg.RedemptionOrder8.SettlementAmount, com.tools20022.repository.msg.InvestmentFundTransaction3.SettlementAmount, com.tools20022.repository.msg.SubscriptionOrder5.SettlementAmount,
					com.tools20022.repository.msg.SubscriptionExecution5.SettlementAmount, com.tools20022.repository.msg.SubscriptionOrder7.SettlementAmount, com.tools20022.repository.msg.SubscriptionOrder6.SettlementAmount,
					com.tools20022.repository.msg.SubscriptionExecution6.SettlementAmount, com.tools20022.repository.msg.SubscriptionOrder8.SettlementAmount, com.tools20022.repository.msg.SwitchOrder3.SettlementAmount,
					com.tools20022.repository.msg.SwitchExecution4.SettlementAmount, com.tools20022.repository.msg.SwitchOrder4.SettlementAmount, com.tools20022.repository.msg.TransactionDetails1.SettlementAmount,
					com.tools20022.repository.msg.TransactionDetails3.SettlementAmount, com.tools20022.repository.msg.AmountAndDirection10.Amount, com.tools20022.repository.msg.AmountAndDirection22.Amount,
					com.tools20022.repository.msg.AmountAndDirection23.Amount, com.tools20022.repository.msg.TransactionDetails4.SettlementAmount, com.tools20022.repository.msg.TransactionDetails30.SettlementAmount,
					com.tools20022.repository.msg.AmountAndDirection20.Amount, com.tools20022.repository.msg.AmountAndDirection11.Amount, com.tools20022.repository.msg.TransactionDetails20.SettlementAmount,
					com.tools20022.repository.msg.AmountAndDirection25.Amount, com.tools20022.repository.msg.AmountAndDirection26.Amount, com.tools20022.repository.msg.TransactionDetails40.SettlementAmount,
					com.tools20022.repository.msg.TransactionDetails42.SettlementAmount, com.tools20022.repository.msg.TransactionDetails46.SettlementAmount, com.tools20022.repository.msg.TransactionDetails32.SettlementAmount,
					com.tools20022.repository.msg.TransactionDetails14.SettlementAmount, com.tools20022.repository.msg.TransactionDetails35.SettlementAmount, com.tools20022.repository.msg.TransactionDetails45.SettlementAmount,
					com.tools20022.repository.msg.AmountAndDirection31.Amount, com.tools20022.repository.msg.SettlementObligation1.SettlementAmount, com.tools20022.repository.msg.SettlementObligation1.RemainingAmountToBeSettled,
					com.tools20022.repository.msg.AmountAndDirection27.Amount, com.tools20022.repository.msg.SettlementObligation6.SettlementAmount, com.tools20022.repository.msg.SettlementObligation6.RemainingAmountToBeSettled,
					com.tools20022.repository.msg.SettlementObligation3.SettlementAmount, com.tools20022.repository.msg.SettlementObligation2.SettlementAmount, com.tools20022.repository.msg.SettlementObligation5.SettlementAmount,
					com.tools20022.repository.msg.SettlementObligation4.SettlementAmount, com.tools20022.repository.msg.AmountAndDirection21.Amount, com.tools20022.repository.msg.SettlementDetails21.SettlementAmount,
					com.tools20022.repository.msg.FinancialInstrumentQuantity2.SettlementAmount, com.tools20022.repository.msg.FinancialInstrumentQuantity3.SettlementAmount,
					com.tools20022.repository.msg.SubscriptionExecution9.SettlementAmount, com.tools20022.repository.msg.TransactionDetails51.SettlementAmount, com.tools20022.repository.msg.TransactionDetails51.SettledAmount,
					com.tools20022.repository.msg.TransactionDetails51.PreviouslySettledAmount, com.tools20022.repository.msg.TransactionDetails51.RemainingSettlementAmount,
					com.tools20022.repository.msg.TransactionDetails52.SettlementAmount, com.tools20022.repository.msg.ReceiveInformation13.SettlementAmount, com.tools20022.repository.msg.ReceiveInformation12.SettlementAmount,
					com.tools20022.repository.msg.DeliverInformation12.SettlementAmount, com.tools20022.repository.msg.DeliverInformation13.SettlementAmount, com.tools20022.repository.msg.TransactionDetails61.SettlementAmount,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails16.SettlementAmount, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails14.SettlementAmount,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails15.SettlementAmount, com.tools20022.repository.msg.AmountAndDirection36.Amount, com.tools20022.repository.msg.TransactionDetails62.PostingAmount,
					com.tools20022.repository.msg.AmountAndDirection37.Amount, com.tools20022.repository.msg.TransactionDetails63.PostingAmount, com.tools20022.repository.msg.AmountAndDirection38.Amount,
					com.tools20022.repository.msg.TransactionDetails66.SettlementAmount, com.tools20022.repository.msg.TransactionDetails67.PostingAmount, com.tools20022.repository.msg.TransactionDetails68.PostingAmount,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails17.SettlementAmount, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails18.SettlementAmount,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails19.SettlementAmount, com.tools20022.repository.msg.AmountAndDirection40.Amount,
					com.tools20022.repository.msg.InvestmentFundTransaction4.SettlementAmount, com.tools20022.repository.msg.DeliverInformation15.SettlementAmount, com.tools20022.repository.msg.DeliverInformation14.SettlementAmount,
					com.tools20022.repository.msg.ReceiveInformation15.SettlementAmount, com.tools20022.repository.msg.ReceiveInformation14.SettlementAmount, com.tools20022.repository.msg.TransactionDetails70.SettlementAmount,
					com.tools20022.repository.msg.TransactionDetails69.PostingAmount, com.tools20022.repository.msg.SettlementObligation7.SettlementAmount, com.tools20022.repository.msg.SettlementObligation7.RemainingAmountToBeSettled,
					com.tools20022.repository.msg.SettlementObligation8.SettlementAmount, com.tools20022.repository.msg.TransactionDetails71.SettlementAmount, com.tools20022.repository.msg.TransactionDetails72.PostingAmount,
					com.tools20022.repository.msg.QuantityAndAccount41.PreviouslySettledAmount, com.tools20022.repository.msg.QuantityAndAccount41.RemainingToBeSettledAmount,
					com.tools20022.repository.msg.QuantityAndAccount40.PreviouslySettledAmount, com.tools20022.repository.msg.QuantityAndAccount40.RemainingToBeSettledAmount,
					com.tools20022.repository.msg.TransactionDetails81.SettlementAmount, com.tools20022.repository.msg.TransactionDetails74.SettlementAmount, com.tools20022.repository.msg.TransactionDetails82.SettlementAmount,
					com.tools20022.repository.msg.TransactionDetails79.SettlementAmount, com.tools20022.repository.msg.TransactionDetails80.SettlementAmount,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails21.SettlementAmount, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails22.SettlementAmount,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails20.SettlementAmount, com.tools20022.repository.msg.TransactionDetails75.PostingAmount,
					com.tools20022.repository.msg.TransactionDetails78.PostingAmount, com.tools20022.repository.msg.AmountAndDirection46.Amount, com.tools20022.repository.msg.AmountAndDirection49.Amount,
					com.tools20022.repository.msg.IntraPositionDetails34.RemainingToBeSettledQuantity, com.tools20022.repository.msg.AmountAndDirection48.Amount, com.tools20022.repository.msg.AmountAndDirection44.Amount,
					com.tools20022.repository.msg.AmountAndDirection45.Amount, com.tools20022.repository.msg.AmountAndDirection51.Amount, com.tools20022.repository.msg.AmountAndDirection52.Amount,
					com.tools20022.repository.msg.AmountAndDirection47.Amount, com.tools20022.repository.msg.ReceiveInformation17.SettlementAmount, com.tools20022.repository.msg.ReceiveInformation16.SettlementAmount,
					com.tools20022.repository.msg.DeliverInformation16.SettlementAmount, com.tools20022.repository.msg.DeliverInformation17.SettlementAmount, com.tools20022.repository.msg.AmountAndDirection66.Amount,
					com.tools20022.repository.msg.TransactionDetails88.SettlementAmount, com.tools20022.repository.msg.QuantityAndAccount46.PreviouslySettledAmount,
					com.tools20022.repository.msg.QuantityAndAccount46.RemainingToBeSettledAmount, com.tools20022.repository.msg.AmountAndDirection60.Amount, com.tools20022.repository.msg.TransactionDetails92.SettlementAmount,
					com.tools20022.repository.msg.TransactionDetails84.SettlementAmount, com.tools20022.repository.msg.IntraPositionDetails35.RemainingToBeSettledQuantity,
					com.tools20022.repository.msg.TransactionDetails83.SettlementAmount, com.tools20022.repository.msg.QuantityAndAccount51.PreviouslySettledAmount,
					com.tools20022.repository.msg.QuantityAndAccount51.RemainingToBeSettledAmount, com.tools20022.repository.msg.TransactionDetails87.SettlementAmount, com.tools20022.repository.msg.AmountAndDirection71.Amount,
					com.tools20022.repository.msg.AmountAndDirection57.Amount, com.tools20022.repository.msg.AmountAndDirection85.Amount, com.tools20022.repository.msg.AmountAndDirection55.Amount,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails23.SettlementAmount, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails25.SettlementAmount,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails24.SettlementAmount, com.tools20022.repository.msg.AmountAndDirection59.Amount, com.tools20022.repository.msg.TransactionDetails91.PostingAmount,
					com.tools20022.repository.msg.AmountAndDirection58.Amount, com.tools20022.repository.msg.AmountAndDirection72.Amount, com.tools20022.repository.msg.TransactionDetails90.PostingAmount,
					com.tools20022.repository.msg.AmountAndDirection67.Amount, com.tools20022.repository.msg.SwitchExecution7.SettlementAmount, com.tools20022.repository.msg.SwitchOrder7.SettlementAmount,
					com.tools20022.repository.msg.RedemptionOrder14.SettlementAmount, com.tools20022.repository.msg.SubscriptionExecution13.SettlementAmount, com.tools20022.repository.msg.SubscriptionExecution12.SettlementAmount,
					com.tools20022.repository.msg.SubscriptionOrder15.SettlementAmount, com.tools20022.repository.msg.RedemptionOrder15.SettlementAmount, com.tools20022.repository.msg.SubscriptionOrder14.SettlementAmount,
					com.tools20022.repository.msg.IntraPositionDetails41.RemainingToBeSettledQuantity, com.tools20022.repository.msg.TransactionDetails97.SettlementAmount,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails27.SettlementAmount, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails28.SettlementAmount,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails26.SettlementAmount, com.tools20022.repository.msg.TransactionDetails96.PostingAmount,
					com.tools20022.repository.msg.TransactionDetails95.PostingAmount, com.tools20022.repository.msg.IntraPositionDetails43.RemainingToBeSettledQuantity,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails30.SettlementAmount, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails29.SettlementAmount,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails31.SettlementAmount, com.tools20022.repository.msg.TransactionDetails100.SettlementAmount,
					com.tools20022.repository.msg.TransactionDetails99.PostingAmount, com.tools20022.repository.msg.TransactionDetails98.PostingAmount, com.tools20022.repository.msg.QuantityAndAccount57.PreviouslySettledAmount,
					com.tools20022.repository.msg.QuantityAndAccount57.RemainingToBeSettledAmount, com.tools20022.repository.msg.QuantityAndAccount62.PreviouslySettledAmount,
					com.tools20022.repository.msg.QuantityAndAccount62.RemainingToBeSettledAmount);
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementAmount";
			definition = "Amount of money settled or to be settled.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Identifies whether or not saving plan or withdrawal or switch plan are
	 * included in the holdings.
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
	 * {@linkplain com.tools20022.repository.msg.Transfer17#HoldingsPlanType
	 * Transfer17.HoldingsPlanType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer14#HoldingsPlanType
	 * Transfer14.HoldingsPlanType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer24#HoldingsPlanType
	 * Transfer24.HoldingsPlanType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer25#HoldingsPlanType
	 * Transfer25.HoldingsPlanType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer16#HoldingsPlanType
	 * Transfer16.HoldingsPlanType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer12#HoldingsPlanType
	 * Transfer12.HoldingsPlanType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer20#HoldingsPlanType
	 * Transfer20.HoldingsPlanType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer22#HoldingsPlanType
	 * Transfer22.HoldingsPlanType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer18#HoldingsPlanType
	 * Transfer18.HoldingsPlanType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer26#HoldingsPlanType
	 * Transfer26.HoldingsPlanType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer15#HoldingsPlanType
	 * Transfer15.HoldingsPlanType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer21#HoldingsPlanType
	 * Transfer21.HoldingsPlanType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer13#HoldingsPlanType
	 * Transfer13.HoldingsPlanType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer23#HoldingsPlanType
	 * Transfer23.HoldingsPlanType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer11#HoldingsPlanType
	 * Transfer11.HoldingsPlanType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer19#HoldingsPlanType
	 * Transfer19.HoldingsPlanType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer27#HoldingsPlanType
	 * Transfer27.HoldingsPlanType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer28#HoldingsPlanType
	 * Transfer28.HoldingsPlanType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer29#HoldingsPlanType
	 * Transfer29.HoldingsPlanType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer31#HoldingsPlanType
	 * Transfer31.HoldingsPlanType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer30#HoldingsPlanType
	 * Transfer30.HoldingsPlanType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer32#HoldingsPlanType
	 * Transfer32.HoldingsPlanType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer33#HoldingsPlanType
	 * Transfer33.HoldingsPlanType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingsPlanType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies whether or not saving plan or withdrawal or switch plan are included in the holdings."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute HoldingsPlanType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Transfer17.HoldingsPlanType, com.tools20022.repository.msg.Transfer14.HoldingsPlanType, com.tools20022.repository.msg.Transfer24.HoldingsPlanType,
					com.tools20022.repository.msg.Transfer25.HoldingsPlanType, com.tools20022.repository.msg.Transfer16.HoldingsPlanType, com.tools20022.repository.msg.Transfer12.HoldingsPlanType,
					com.tools20022.repository.msg.Transfer20.HoldingsPlanType, com.tools20022.repository.msg.Transfer22.HoldingsPlanType, com.tools20022.repository.msg.Transfer18.HoldingsPlanType,
					com.tools20022.repository.msg.Transfer26.HoldingsPlanType, com.tools20022.repository.msg.Transfer15.HoldingsPlanType, com.tools20022.repository.msg.Transfer21.HoldingsPlanType,
					com.tools20022.repository.msg.Transfer13.HoldingsPlanType, com.tools20022.repository.msg.Transfer23.HoldingsPlanType, com.tools20022.repository.msg.Transfer11.HoldingsPlanType,
					com.tools20022.repository.msg.Transfer19.HoldingsPlanType, com.tools20022.repository.msg.Transfer27.HoldingsPlanType, com.tools20022.repository.msg.Transfer28.HoldingsPlanType,
					com.tools20022.repository.msg.Transfer29.HoldingsPlanType, com.tools20022.repository.msg.Transfer31.HoldingsPlanType, com.tools20022.repository.msg.Transfer30.HoldingsPlanType,
					com.tools20022.repository.msg.Transfer32.HoldingsPlanType, com.tools20022.repository.msg.Transfer33.HoldingsPlanType);
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "HoldingsPlanType";
			definition = "Identifies whether or not saving plan or withdrawal or switch plan are included in the holdings.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Specifies if the movement on a securities account results from a deliver
	 * or a receive instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ReceiveDeliveryCode
	 * ReceiveDeliveryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification3#SecuritiesMovementType
	 * SettlementTypeAndIdentification3.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters5#SecuritiesMovementType
	 * SettlementTypeAndAdditionalParameters5.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification13#SecuritiesMovementType
	 * SettlementTypeAndIdentification13.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification7#SecuritiesMovementType
	 * SettlementTypeAndIdentification7.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters8#SecuritiesMovementType
	 * SettlementTypeAndAdditionalParameters8.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters3#SecuritiesMovementType
	 * TransactionTypeAndAdditionalParameters3.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters6#SecuritiesMovementType
	 * TransactionTypeAndAdditionalParameters6.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification14#SecuritiesMovementType
	 * SettlementTypeAndIdentification14.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification1#SecuritiesMovementType
	 * SettlementTypeAndIdentification1.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification8#SecuritiesMovementType
	 * SettlementTypeAndIdentification8.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification9#SecuritiesMovementType
	 * SettlementTypeAndIdentification9.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification11#SecuritiesMovementType
	 * SettlementTypeAndIdentification11.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification15#SecuritiesMovementType
	 * SettlementTypeAndIdentification15.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification17#SecuritiesMovementType
	 * SettlementTypeAndIdentification17.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification10#SecuritiesMovementType
	 * SettlementTypeAndIdentification10.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification12#SecuritiesMovementType
	 * SettlementTypeAndIdentification12.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters1#SecuritiesMovementType
	 * SettlementTypeAndAdditionalParameters1.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters4#SecuritiesMovementType
	 * SettlementTypeAndAdditionalParameters4.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters9#SecuritiesMovementType
	 * SettlementTypeAndAdditionalParameters9.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters10#SecuritiesMovementType
	 * SettlementTypeAndAdditionalParameters10.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails5#SecuritiesMovementType
	 * TransactionDetails5.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails9#SecuritiesMovementType
	 * TransactionDetails9.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails22#SecuritiesMovementType
	 * TransactionDetails22.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails23#SecuritiesMovementType
	 * TransactionDetails23.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails36#SecuritiesMovementType
	 * TransactionDetails36.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails47#SecuritiesMovementType
	 * TransactionDetails47.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails53#SecuritiesMovementType
	 * TransactionDetails53.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails58#SecuritiesMovementType
	 * TransactionDetails58.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails7#SecuritiesMovementType
	 * TransactionDetails7.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails8#SecuritiesMovementType
	 * TransactionDetails8.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails16#SecuritiesMovementType
	 * TransactionDetails16.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails17#SecuritiesMovementType
	 * TransactionDetails17.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails26#SecuritiesMovementType
	 * TransactionDetails26.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails25#SecuritiesMovementType
	 * TransactionDetails25.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails27#SecuritiesMovementType
	 * TransactionDetails27.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails33#SecuritiesMovementType
	 * TransactionDetails33.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails39#SecuritiesMovementType
	 * TransactionDetails39.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails50#SecuritiesMovementType
	 * TransactionDetails50.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails56#SecuritiesMovementType
	 * TransactionDetails56.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails59#SecuritiesMovementType
	 * TransactionDetails59.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails6#SecuritiesMovementType
	 * TransactionDetails6.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails18#SecuritiesMovementType
	 * TransactionDetails18.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails24#SecuritiesMovementType
	 * TransactionDetails24.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails34#SecuritiesMovementType
	 * TransactionDetails34.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails37#SecuritiesMovementType
	 * TransactionDetails37.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails48#SecuritiesMovementType
	 * TransactionDetails48.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails57#SecuritiesMovementType
	 * TransactionDetails57.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails60#SecuritiesMovementType
	 * TransactionDetails60.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails7#SecuritiesMovementType
	 * SecuritiesTradeDetails7.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails19#SecuritiesMovementType
	 * SecuritiesTradeDetails19.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2#SecuritiesMovementType
	 * SecuritiesFinancingTransactionDetails2.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8#SecuritiesMovementType
	 * SecuritiesFinancingTransactionDetails8.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters2#SecuritiesMovementType
	 * SettlementTypeAndAdditionalParameters2.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails4#SecuritiesMovementType
	 * SecuritiesTradeDetails4.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails17#SecuritiesMovementType
	 * SecuritiesTradeDetails17.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification4#SecuritiesMovementType
	 * SettlementTypeAndIdentification4.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6#SecuritiesMovementType
	 * SecuritiesFinancingTransactionDetails6.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10#SecuritiesMovementType
	 * SecuritiesFinancingTransactionDetails10.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17#SecuritiesMovementType
	 * SecuritiesFinancingTransactionDetails17.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18#SecuritiesMovementType
	 * SecuritiesFinancingTransactionDetails18.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters3#SecuritiesMovementType
	 * SettlementTypeAndAdditionalParameters3.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails10#SecuritiesMovementType
	 * SecuritiesTradeDetails10.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails22#SecuritiesMovementType
	 * SecuritiesTradeDetails22.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails23#SecuritiesMovementType
	 * SecuritiesTradeDetails23.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails29#SecuritiesMovementType
	 * SecuritiesTradeDetails29.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails40#SecuritiesMovementType
	 * TransactionDetails40.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails42#SecuritiesMovementType
	 * TransactionDetails42.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails46#SecuritiesMovementType
	 * TransactionDetails46.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification6#SecuritiesMovementType
	 * SettlementTypeAndIdentification6.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails14#SecuritiesMovementType
	 * SecuritiesTradeDetails14.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails20#SecuritiesMovementType
	 * SecuritiesTradeDetails20.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails24#SecuritiesMovementType
	 * SecuritiesTradeDetails24.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails30#SecuritiesMovementType
	 * SecuritiesTradeDetails30.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails45#SecuritiesMovementType
	 * TransactionDetails45.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation3#SecuritiesMovementType
	 * SettlementObligation3.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation5#SecuritiesMovementType
	 * SettlementObligation5.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation4#SecuritiesMovementType
	 * SettlementObligation4.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetPosition1#SecuritiesMovementType
	 * NetPosition1.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetPosition2#SecuritiesMovementType
	 * NetPosition2.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails51#SecuritiesMovementType
	 * TransactionDetails51.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails61#SecuritiesMovementType
	 * TransactionDetails61.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21#SecuritiesMovementType
	 * SecuritiesFinancingTransactionDetails21.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails62#SecuritiesMovementType
	 * TransactionDetails62.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails63#SecuritiesMovementType
	 * TransactionDetails63.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails35#SecuritiesMovementType
	 * SecuritiesTradeDetails35.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22#SecuritiesMovementType
	 * SecuritiesFinancingTransactionDetails22.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails66#SecuritiesMovementType
	 * TransactionDetails66.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails42#SecuritiesMovementType
	 * SecuritiesTradeDetails42.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails67#SecuritiesMovementType
	 * TransactionDetails67.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails68#SecuritiesMovementType
	 * TransactionDetails68.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24#SecuritiesMovementType
	 * SecuritiesFinancingTransactionDetails24.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails70#SecuritiesMovementType
	 * TransactionDetails70.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails69#SecuritiesMovementType
	 * TransactionDetails69.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetPosition3#SecuritiesMovementType
	 * NetPosition3.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation8#SecuritiesMovementType
	 * SettlementObligation8.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails71#SecuritiesMovementType
	 * TransactionDetails71.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25#SecuritiesMovementType
	 * SecuritiesFinancingTransactionDetails25.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails72#SecuritiesMovementType
	 * TransactionDetails72.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails81#SecuritiesMovementType
	 * TransactionDetails81.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails49#SecuritiesMovementType
	 * SecuritiesTradeDetails49.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails82#SecuritiesMovementType
	 * TransactionDetails82.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#SecuritiesMovementType
	 * SecuritiesFinancingTransactionDetails26.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails79#SecuritiesMovementType
	 * TransactionDetails79.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48#SecuritiesMovementType
	 * SecuritiesTradeDetails48.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails75#SecuritiesMovementType
	 * TransactionDetails75.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails78#SecuritiesMovementType
	 * TransactionDetails78.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification18#SecuritiesMovementType
	 * SettlementTypeAndIdentification18.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification19#SecuritiesMovementType
	 * SettlementTypeAndIdentification19.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters10#SecuritiesMovementType
	 * TransactionTypeAndAdditionalParameters10.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters11#SecuritiesMovementType
	 * SettlementTypeAndAdditionalParameters11.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters12#SecuritiesMovementType
	 * SettlementTypeAndAdditionalParameters12.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters14#SecuritiesMovementType
	 * SettlementTypeAndAdditionalParameters14.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails57#SecuritiesMovementType
	 * SecuritiesTradeDetails57.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#SecuritiesMovementType
	 * SecuritiesFinancingTransactionDetails33.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters12#SecuritiesMovementType
	 * TransactionTypeAndAdditionalParameters12.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails61#SecuritiesMovementType
	 * SecuritiesTradeDetails61.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails92#SecuritiesMovementType
	 * TransactionDetails92.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails84#SecuritiesMovementType
	 * TransactionDetails84.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters16#SecuritiesMovementType
	 * SettlementTypeAndAdditionalParameters16.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification24#SecuritiesMovementType
	 * SettlementTypeAndIdentification24.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails87#SecuritiesMovementType
	 * TransactionDetails87.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters15#SecuritiesMovementType
	 * SettlementTypeAndAdditionalParameters15.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails91#SecuritiesMovementType
	 * TransactionDetails91.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails90#SecuritiesMovementType
	 * TransactionDetails90.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters18#SecuritiesMovementType
	 * SettlementTypeAndAdditionalParameters18.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification22#SecuritiesMovementType
	 * SettlementTypeAndIdentification22.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters19#SecuritiesMovementType
	 * SettlementTypeAndAdditionalParameters19.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#SecuritiesMovementType
	 * SecuritiesTradeDetails68.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails97#SecuritiesMovementType
	 * TransactionDetails97.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters16#SecuritiesMovementType
	 * TransactionTypeAndAdditionalParameters16.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#SecuritiesMovementType
	 * SecuritiesFinancingTransactionDetails35.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails96#SecuritiesMovementType
	 * TransactionDetails96.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails95#SecuritiesMovementType
	 * TransactionDetails95.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters19#SecuritiesMovementType
	 * TransactionTypeAndAdditionalParameters19.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails69#SecuritiesMovementType
	 * SecuritiesTradeDetails69.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36#SecuritiesMovementType
	 * SecuritiesFinancingTransactionDetails36.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters20#SecuritiesMovementType
	 * SettlementTypeAndAdditionalParameters20.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails100#SecuritiesMovementType
	 * TransactionDetails100.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails99#SecuritiesMovementType
	 * TransactionDetails99.SecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails98#SecuritiesMovementType
	 * TransactionDetails98.SecuritiesMovementType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMovementType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if the movement on a securities account results from a deliver or a receive instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SecuritiesMovementType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementTypeAndIdentification3.SecuritiesMovementType, com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters5.SecuritiesMovementType,
					com.tools20022.repository.msg.SettlementTypeAndIdentification13.SecuritiesMovementType, com.tools20022.repository.msg.SettlementTypeAndIdentification7.SecuritiesMovementType,
					com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters8.SecuritiesMovementType, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters3.SecuritiesMovementType,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters6.SecuritiesMovementType, com.tools20022.repository.msg.SettlementTypeAndIdentification14.SecuritiesMovementType,
					com.tools20022.repository.msg.SettlementTypeAndIdentification1.SecuritiesMovementType, com.tools20022.repository.msg.SettlementTypeAndIdentification8.SecuritiesMovementType,
					com.tools20022.repository.msg.SettlementTypeAndIdentification9.SecuritiesMovementType, com.tools20022.repository.msg.SettlementTypeAndIdentification11.SecuritiesMovementType,
					com.tools20022.repository.msg.SettlementTypeAndIdentification15.SecuritiesMovementType, com.tools20022.repository.msg.SettlementTypeAndIdentification17.SecuritiesMovementType,
					com.tools20022.repository.msg.SettlementTypeAndIdentification10.SecuritiesMovementType, com.tools20022.repository.msg.SettlementTypeAndIdentification12.SecuritiesMovementType,
					com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters1.SecuritiesMovementType, com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters4.SecuritiesMovementType,
					com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters9.SecuritiesMovementType, com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters10.SecuritiesMovementType,
					com.tools20022.repository.msg.TransactionDetails5.SecuritiesMovementType, com.tools20022.repository.msg.TransactionDetails9.SecuritiesMovementType,
					com.tools20022.repository.msg.TransactionDetails22.SecuritiesMovementType, com.tools20022.repository.msg.TransactionDetails23.SecuritiesMovementType,
					com.tools20022.repository.msg.TransactionDetails36.SecuritiesMovementType, com.tools20022.repository.msg.TransactionDetails47.SecuritiesMovementType,
					com.tools20022.repository.msg.TransactionDetails53.SecuritiesMovementType, com.tools20022.repository.msg.TransactionDetails58.SecuritiesMovementType,
					com.tools20022.repository.msg.TransactionDetails7.SecuritiesMovementType, com.tools20022.repository.msg.TransactionDetails8.SecuritiesMovementType,
					com.tools20022.repository.msg.TransactionDetails16.SecuritiesMovementType, com.tools20022.repository.msg.TransactionDetails17.SecuritiesMovementType,
					com.tools20022.repository.msg.TransactionDetails26.SecuritiesMovementType, com.tools20022.repository.msg.TransactionDetails25.SecuritiesMovementType,
					com.tools20022.repository.msg.TransactionDetails27.SecuritiesMovementType, com.tools20022.repository.msg.TransactionDetails33.SecuritiesMovementType,
					com.tools20022.repository.msg.TransactionDetails39.SecuritiesMovementType, com.tools20022.repository.msg.TransactionDetails50.SecuritiesMovementType,
					com.tools20022.repository.msg.TransactionDetails56.SecuritiesMovementType, com.tools20022.repository.msg.TransactionDetails59.SecuritiesMovementType,
					com.tools20022.repository.msg.TransactionDetails6.SecuritiesMovementType, com.tools20022.repository.msg.TransactionDetails18.SecuritiesMovementType,
					com.tools20022.repository.msg.TransactionDetails24.SecuritiesMovementType, com.tools20022.repository.msg.TransactionDetails34.SecuritiesMovementType,
					com.tools20022.repository.msg.TransactionDetails37.SecuritiesMovementType, com.tools20022.repository.msg.TransactionDetails48.SecuritiesMovementType,
					com.tools20022.repository.msg.TransactionDetails57.SecuritiesMovementType, com.tools20022.repository.msg.TransactionDetails60.SecuritiesMovementType,
					com.tools20022.repository.msg.SecuritiesTradeDetails7.SecuritiesMovementType, com.tools20022.repository.msg.SecuritiesTradeDetails19.SecuritiesMovementType,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2.SecuritiesMovementType, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8.SecuritiesMovementType,
					com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters2.SecuritiesMovementType, com.tools20022.repository.msg.SecuritiesTradeDetails4.SecuritiesMovementType,
					com.tools20022.repository.msg.SecuritiesTradeDetails17.SecuritiesMovementType, com.tools20022.repository.msg.SettlementTypeAndIdentification4.SecuritiesMovementType,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6.SecuritiesMovementType, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10.SecuritiesMovementType,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17.SecuritiesMovementType, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18.SecuritiesMovementType,
					com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters3.SecuritiesMovementType, com.tools20022.repository.msg.SecuritiesTradeDetails10.SecuritiesMovementType,
					com.tools20022.repository.msg.SecuritiesTradeDetails22.SecuritiesMovementType, com.tools20022.repository.msg.SecuritiesTradeDetails23.SecuritiesMovementType,
					com.tools20022.repository.msg.SecuritiesTradeDetails29.SecuritiesMovementType, com.tools20022.repository.msg.TransactionDetails40.SecuritiesMovementType,
					com.tools20022.repository.msg.TransactionDetails42.SecuritiesMovementType, com.tools20022.repository.msg.TransactionDetails46.SecuritiesMovementType,
					com.tools20022.repository.msg.SettlementTypeAndIdentification6.SecuritiesMovementType, com.tools20022.repository.msg.SecuritiesTradeDetails14.SecuritiesMovementType,
					com.tools20022.repository.msg.SecuritiesTradeDetails20.SecuritiesMovementType, com.tools20022.repository.msg.SecuritiesTradeDetails24.SecuritiesMovementType,
					com.tools20022.repository.msg.SecuritiesTradeDetails30.SecuritiesMovementType, com.tools20022.repository.msg.TransactionDetails45.SecuritiesMovementType,
					com.tools20022.repository.msg.SettlementObligation3.SecuritiesMovementType, com.tools20022.repository.msg.SettlementObligation5.SecuritiesMovementType,
					com.tools20022.repository.msg.SettlementObligation4.SecuritiesMovementType, com.tools20022.repository.msg.NetPosition1.SecuritiesMovementType, com.tools20022.repository.msg.NetPosition2.SecuritiesMovementType,
					com.tools20022.repository.msg.TransactionDetails51.SecuritiesMovementType, com.tools20022.repository.msg.TransactionDetails61.SecuritiesMovementType,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21.SecuritiesMovementType, com.tools20022.repository.msg.TransactionDetails62.SecuritiesMovementType,
					com.tools20022.repository.msg.TransactionDetails63.SecuritiesMovementType, com.tools20022.repository.msg.SecuritiesTradeDetails35.SecuritiesMovementType,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22.SecuritiesMovementType, com.tools20022.repository.msg.TransactionDetails66.SecuritiesMovementType,
					com.tools20022.repository.msg.SecuritiesTradeDetails42.SecuritiesMovementType, com.tools20022.repository.msg.TransactionDetails67.SecuritiesMovementType,
					com.tools20022.repository.msg.TransactionDetails68.SecuritiesMovementType, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24.SecuritiesMovementType,
					com.tools20022.repository.msg.TransactionDetails70.SecuritiesMovementType, com.tools20022.repository.msg.TransactionDetails69.SecuritiesMovementType, com.tools20022.repository.msg.NetPosition3.SecuritiesMovementType,
					com.tools20022.repository.msg.SettlementObligation8.SecuritiesMovementType, com.tools20022.repository.msg.TransactionDetails71.SecuritiesMovementType,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25.SecuritiesMovementType, com.tools20022.repository.msg.TransactionDetails72.SecuritiesMovementType,
					com.tools20022.repository.msg.TransactionDetails81.SecuritiesMovementType, com.tools20022.repository.msg.SecuritiesTradeDetails49.SecuritiesMovementType,
					com.tools20022.repository.msg.TransactionDetails82.SecuritiesMovementType, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26.SecuritiesMovementType,
					com.tools20022.repository.msg.TransactionDetails79.SecuritiesMovementType, com.tools20022.repository.msg.SecuritiesTradeDetails48.SecuritiesMovementType,
					com.tools20022.repository.msg.TransactionDetails75.SecuritiesMovementType, com.tools20022.repository.msg.TransactionDetails78.SecuritiesMovementType,
					com.tools20022.repository.msg.SettlementTypeAndIdentification18.SecuritiesMovementType, com.tools20022.repository.msg.SettlementTypeAndIdentification19.SecuritiesMovementType,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters10.SecuritiesMovementType, com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters11.SecuritiesMovementType,
					com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters12.SecuritiesMovementType, com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters14.SecuritiesMovementType,
					com.tools20022.repository.msg.SecuritiesTradeDetails57.SecuritiesMovementType, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.SecuritiesMovementType,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters12.SecuritiesMovementType, com.tools20022.repository.msg.SecuritiesTradeDetails61.SecuritiesMovementType,
					com.tools20022.repository.msg.TransactionDetails92.SecuritiesMovementType, com.tools20022.repository.msg.TransactionDetails84.SecuritiesMovementType,
					com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters16.SecuritiesMovementType, com.tools20022.repository.msg.SettlementTypeAndIdentification24.SecuritiesMovementType,
					com.tools20022.repository.msg.TransactionDetails87.SecuritiesMovementType, com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters15.SecuritiesMovementType,
					com.tools20022.repository.msg.TransactionDetails91.SecuritiesMovementType, com.tools20022.repository.msg.TransactionDetails90.SecuritiesMovementType,
					com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters18.SecuritiesMovementType, com.tools20022.repository.msg.SettlementTypeAndIdentification22.SecuritiesMovementType,
					com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters19.SecuritiesMovementType, com.tools20022.repository.msg.SecuritiesTradeDetails68.SecuritiesMovementType,
					com.tools20022.repository.msg.TransactionDetails97.SecuritiesMovementType, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters16.SecuritiesMovementType,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35.SecuritiesMovementType, com.tools20022.repository.msg.TransactionDetails96.SecuritiesMovementType,
					com.tools20022.repository.msg.TransactionDetails95.SecuritiesMovementType, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters19.SecuritiesMovementType,
					com.tools20022.repository.msg.SecuritiesTradeDetails69.SecuritiesMovementType, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36.SecuritiesMovementType,
					com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters20.SecuritiesMovementType, com.tools20022.repository.msg.TransactionDetails100.SecuritiesMovementType,
					com.tools20022.repository.msg.TransactionDetails99.SecuritiesMovementType, com.tools20022.repository.msg.TransactionDetails98.SecuritiesMovementType);
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesMovementType";
			definition = "Specifies if the movement on a securities account results from a deliver or a receive instruction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ReceiveDeliveryCode.mmObject();
		}
	};
	/**
	 * Total quantity of securities to be settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#SecuritiesSettlement
	 * SecuritiesQuantity.SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails10#SettlementQuantity
	 * TransactionDetails10.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails29#SettlementQuantity
	 * TransactionDetails29.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount30#SettlementQuantity
	 * QuantityAndAccount30.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails28#SettlementQuantity
	 * TransactionDetails28.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails31#SettlementQuantity
	 * TransactionDetails31.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails44#SettlementQuantity
	 * TransactionDetails44.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount33#SettlementQuantity
	 * QuantityAndAccount33.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails1#RemainingToBeSettledQuantity
	 * IntraPositionMovementDetails1.RemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails2#RemainingToBeSettledQuantity
	 * IntraPositionMovementDetails2.RemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails5#RemainingToBeSettledQuantity
	 * IntraPositionMovementDetails5.RemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails6#RemainingToBeSettledQuantity
	 * IntraPositionMovementDetails6.RemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails7#RemainingToBeSettledQuantity
	 * IntraPositionMovementDetails7.RemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails8#RemainingToBeSettledQuantity
	 * IntraPositionMovementDetails8.RemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails9#RemainingToBeSettledQuantity
	 * IntraPositionMovementDetails9.RemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails10#RemainingToBeSettledQuantity
	 * IntraPositionMovementDetails10.RemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount6#SettledQuantity
	 * QuantityAndAccount6.SettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount6#PreviouslySettledQuantity
	 * QuantityAndAccount6.PreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount6#RemainingToBeSettledQuantity
	 * QuantityAndAccount6.RemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount11#SettledQuantity
	 * QuantityAndAccount11.SettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount11#PreviouslySettledQuantity
	 * QuantityAndAccount11.PreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount11#RemainingToBeSettledQuantity
	 * QuantityAndAccount11.RemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount18#SettledQuantity
	 * QuantityAndAccount18.SettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount18#PreviouslySettledQuantity
	 * QuantityAndAccount18.PreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount18#RemainingToBeSettledQuantity
	 * QuantityAndAccount18.RemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount19#SettledQuantity
	 * QuantityAndAccount19.SettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount19#PreviouslySettledQuantity
	 * QuantityAndAccount19.PreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount19#RemainingToBeSettledQuantity
	 * QuantityAndAccount19.RemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount1#SettlementQuantity
	 * QuantityAndAccount1.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount5#SettlementQuantity
	 * QuantityAndAccount5.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount17#SettlementQuantity
	 * QuantityAndAccount17.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount24#SettlementQuantity
	 * QuantityAndAccount24.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount25#SettlementQuantity
	 * QuantityAndAccount25.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount34#SettlementQuantity
	 * QuantityAndAccount34.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount2#SettledQuantity
	 * QuantityAndAccount2.SettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount2#PreviouslySettledQuantity
	 * QuantityAndAccount2.PreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount2#RemainingToBeSettledQuantity
	 * QuantityAndAccount2.RemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount12#SettledQuantity
	 * QuantityAndAccount12.SettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount12#PreviouslySettledQuantity
	 * QuantityAndAccount12.PreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount12#RemainingToBeSettledQuantity
	 * QuantityAndAccount12.RemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount15#SettledQuantity
	 * QuantityAndAccount15.SettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount15#PreviouslySettledQuantity
	 * QuantityAndAccount15.PreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount15#RemainingToBeSettledQuantity
	 * QuantityAndAccount15.RemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount20#SettledQuantity
	 * QuantityAndAccount20.SettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount20#PreviouslySettledQuantity
	 * QuantityAndAccount20.PreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount20#RemainingToBeSettledQuantity
	 * QuantityAndAccount20.RemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount28#SettledQuantity
	 * QuantityAndAccount28.SettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount28#PreviouslySettledQuantity
	 * QuantityAndAccount28.PreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount28#RemainingToBeSettledQuantity
	 * QuantityAndAccount28.RemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount37#SettledQuantity
	 * QuantityAndAccount37.SettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount37#PreviouslySettledQuantity
	 * QuantityAndAccount37.PreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount37#RemainingToBeSettledQuantity
	 * QuantityAndAccount37.RemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails5#SettlementQuantity
	 * TransactionDetails5.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails9#SettlementQuantity
	 * TransactionDetails9.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails22#SettlementQuantity
	 * TransactionDetails22.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails23#SettlementQuantity
	 * TransactionDetails23.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails36#SettlementQuantity
	 * TransactionDetails36.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails47#SettlementQuantity
	 * TransactionDetails47.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails53#SettlementQuantity
	 * TransactionDetails53.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails58#SettlementQuantity
	 * TransactionDetails58.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails7#PostingQuantity
	 * TransactionDetails7.PostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails8#PostingQuantity
	 * TransactionDetails8.PostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails16#PostingQuantity
	 * TransactionDetails16.PostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails17#PostingQuantity
	 * TransactionDetails17.PostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails26#PostingQuantity
	 * TransactionDetails26.PostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails25#PostingQuantity
	 * TransactionDetails25.PostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails27#PostingQuantity
	 * TransactionDetails27.PostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails33#PostingQuantity
	 * TransactionDetails33.PostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails39#PostingQuantity
	 * TransactionDetails39.PostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails50#PostingQuantity
	 * TransactionDetails50.PostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails56#PostingQuantity
	 * TransactionDetails56.PostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails59#PostingQuantity
	 * TransactionDetails59.PostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails6#PostingQuantity
	 * TransactionDetails6.PostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails18#PostingQuantity
	 * TransactionDetails18.PostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails24#PostingQuantity
	 * TransactionDetails24.PostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails34#PostingQuantity
	 * TransactionDetails34.PostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails37#PostingQuantity
	 * TransactionDetails37.PostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails48#PostingQuantity
	 * TransactionDetails48.PostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails57#PostingQuantity
	 * TransactionDetails57.PostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails60#PostingQuantity
	 * TransactionDetails60.PostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Quantity5#SettlementQuantity
	 * Quantity5.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount7#SettlementQuantity
	 * QuantityAndAccount7.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount16#SettlementQuantity
	 * QuantityAndAccount16.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2#SettlementQuantity
	 * SecuritiesFinancingTransactionDetails2.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8#SettlementQuantity
	 * SecuritiesFinancingTransactionDetails8.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount3#SettlementQuantity
	 * QuantityAndAccount3.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount13#SettlementQuantity
	 * QuantityAndAccount13.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount8#SettlementQuantity
	 * QuantityAndAccount8.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount14#SettlementQuantity
	 * QuantityAndAccount14.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails4#SettlementQuantity
	 * TransactionDetails4.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails30#SettlementQuantity
	 * TransactionDetails30.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount10#SettlementQuantity
	 * QuantityAndAccount10.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount21#SettlementQuantity
	 * QuantityAndAccount21.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6#SettlementQuantity
	 * SecuritiesFinancingTransactionDetails6.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10#SettlementQuantity
	 * SecuritiesFinancingTransactionDetails10.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17#SettlementQuantity
	 * SecuritiesFinancingTransactionDetails17.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18#SettlementQuantity
	 * SecuritiesFinancingTransactionDetails18.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails20#SettlementQuantity
	 * TransactionDetails20.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount4#SettlementQuantity
	 * QuantityAndAccount4.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount22#SettlementQuantity
	 * QuantityAndAccount22.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount27#SettlementQuantity
	 * QuantityAndAccount27.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount36#SettlementQuantity
	 * QuantityAndAccount36.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount9#SettlementQuantity
	 * QuantityAndAccount9.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount23#SettlementQuantity
	 * QuantityAndAccount23.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount26#SettlementQuantity
	 * QuantityAndAccount26.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount35#SettlementQuantity
	 * QuantityAndAccount35.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails40#SettlementQuantity
	 * TransactionDetails40.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails42#SettlementQuantity
	 * TransactionDetails42.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails46#SettlementQuantity
	 * TransactionDetails46.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails32#SettlementQuantity
	 * TransactionDetails32.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails14#SettlementQuantity
	 * TransactionDetails14.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails35#SettlementQuantity
	 * TransactionDetails35.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Quantity6#SettlementQuantity
	 * Quantity6.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Quantity7#SettlementQuantity
	 * Quantity7.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Quantity8#SettlementQuantity
	 * Quantity8.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails45#SettlementQuantity
	 * TransactionDetails45.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation1#RemainingQuantityToBeSettled
	 * SettlementObligation1.RemainingQuantityToBeSettled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails3#RemainingToBeSettledQuantity
	 * IntraPositionMovementDetails3.RemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails4#RemainingToBeSettledQuantity
	 * IntraPositionMovementDetails4.RemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails51#SettlementQuantity
	 * TransactionDetails51.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails51#SettledQuantity
	 * TransactionDetails51.SettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails51#PreviouslySettledQuantity
	 * TransactionDetails51.PreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails51#RemainingToBeSettledQuantity
	 * TransactionDetails51.RemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails52#SettlementQuantity
	 * TransactionDetails52.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails61#SettlementQuantity
	 * TransactionDetails61.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21#SettlementQuantity
	 * SecuritiesFinancingTransactionDetails21.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails62#PostingQuantity
	 * TransactionDetails62.PostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails63#PostingQuantity
	 * TransactionDetails63.PostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22#SettlementQuantity
	 * SecuritiesFinancingTransactionDetails22.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails66#SettlementQuantity
	 * TransactionDetails66.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails67#PostingQuantity
	 * TransactionDetails67.PostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails68#PostingQuantity
	 * TransactionDetails68.PostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24#SettlementQuantity
	 * SecuritiesFinancingTransactionDetails24.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails70#SettlementQuantity
	 * TransactionDetails70.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails69#PostingQuantity
	 * TransactionDetails69.PostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails71#SettlementQuantity
	 * TransactionDetails71.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25#SettlementQuantity
	 * SecuritiesFinancingTransactionDetails25.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails72#PostingQuantity
	 * TransactionDetails72.PostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount39#SettlementQuantity
	 * QuantityAndAccount39.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount41#SettledQuantity
	 * QuantityAndAccount41.SettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount41#PreviouslySettledQuantity
	 * QuantityAndAccount41.PreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount41#RemainingToBeSettledQuantity
	 * QuantityAndAccount41.RemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount40#SettledQuantity
	 * QuantityAndAccount40.SettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount40#PreviouslySettledQuantity
	 * QuantityAndAccount40.PreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount40#RemainingToBeSettledQuantity
	 * QuantityAndAccount40.RemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails81#SettlementQuantity
	 * TransactionDetails81.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount42#SettlementQuantity
	 * QuantityAndAccount42.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails74#SettlementQuantity
	 * TransactionDetails74.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails82#SettlementQuantity
	 * TransactionDetails82.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount38#SettlementQuantity
	 * QuantityAndAccount38.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#SettlementQuantity
	 * SecuritiesFinancingTransactionDetails26.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails79#SettlementQuantity
	 * TransactionDetails79.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails80#SettlementQuantity
	 * TransactionDetails80.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount43#SettlementQuantity
	 * QuantityAndAccount43.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails75#PostingQuantity
	 * TransactionDetails75.PostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails78#PostingQuantity
	 * TransactionDetails78.PostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Quantity11#SettlementQuantity
	 * Quantity11.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount45#SettlementQuantity
	 * QuantityAndAccount45.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails11#RemainingToBeSettledQuantity
	 * IntraPositionMovementDetails11.RemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount47#SettlementQuantity
	 * QuantityAndAccount47.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#SettlementQuantity
	 * SecuritiesFinancingTransactionDetails33.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount48#SettlementQuantity
	 * QuantityAndAccount48.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails88#SettlementQuantity
	 * TransactionDetails88.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount46#SettledQuantity
	 * QuantityAndAccount46.SettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount46#PreviouslySettledQuantity
	 * QuantityAndAccount46.PreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount46#RemainingToBeSettledQuantity
	 * QuantityAndAccount46.RemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails92#SettlementQuantity
	 * TransactionDetails92.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails84#SettlementQuantity
	 * TransactionDetails84.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails83#SettlementQuantity
	 * TransactionDetails83.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount51#SettledQuantity
	 * QuantityAndAccount51.SettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount51#PreviouslySettledQuantity
	 * QuantityAndAccount51.PreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount51#RemainingToBeSettledQuantity
	 * QuantityAndAccount51.RemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails87#SettlementQuantity
	 * TransactionDetails87.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount49#SettlementQuantity
	 * QuantityAndAccount49.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Quantity12#SettlementQuantity
	 * Quantity12.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails91#PostingQuantity
	 * TransactionDetails91.PostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount50#SettlementQuantity
	 * QuantityAndAccount50.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails90#PostingQuantity
	 * TransactionDetails90.PostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount55#SettlementQuantity
	 * QuantityAndAccount55.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails12#RemainingToBeSettledQuantity
	 * IntraPositionMovementDetails12.RemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails97#SettlementQuantity
	 * TransactionDetails97.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#SettlementQuantity
	 * SecuritiesFinancingTransactionDetails35.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails96#PostingQuantity
	 * TransactionDetails96.PostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails13#RemainingToBeSettledQuantity
	 * IntraPositionMovementDetails13.RemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails95#PostingQuantity
	 * TransactionDetails95.PostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36#SettlementQuantity
	 * SecuritiesFinancingTransactionDetails36.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails14#RemainingToBeSettledQuantity
	 * IntraPositionMovementDetails14.RemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails100#SettlementQuantity
	 * TransactionDetails100.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails99#PostingQuantity
	 * TransactionDetails99.PostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails98#PostingQuantity
	 * TransactionDetails98.PostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount57#SettledQuantity
	 * QuantityAndAccount57.SettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount57#PreviouslySettledQuantity
	 * QuantityAndAccount57.PreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount57#RemainingToBeSettledQuantity
	 * QuantityAndAccount57.RemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount58#SettlementQuantity
	 * QuantityAndAccount58.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount56#SettlementQuantity
	 * QuantityAndAccount56.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount61#SettlementQuantity
	 * QuantityAndAccount61.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount62#SettledQuantity
	 * QuantityAndAccount62.SettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount62#PreviouslySettledQuantity
	 * QuantityAndAccount62.PreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount62#RemainingToBeSettledQuantity
	 * QuantityAndAccount62.RemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount60#SettlementQuantity
	 * QuantityAndAccount60.SettlementQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total quantity of securities to be settled."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SettlementQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionDetails10.SettlementQuantity, com.tools20022.repository.msg.TransactionDetails29.SettlementQuantity,
					com.tools20022.repository.msg.QuantityAndAccount30.SettlementQuantity, com.tools20022.repository.msg.TransactionDetails28.SettlementQuantity, com.tools20022.repository.msg.TransactionDetails31.SettlementQuantity,
					com.tools20022.repository.msg.TransactionDetails44.SettlementQuantity, com.tools20022.repository.msg.QuantityAndAccount33.SettlementQuantity,
					com.tools20022.repository.msg.IntraPositionMovementDetails1.RemainingToBeSettledQuantity, com.tools20022.repository.msg.IntraPositionMovementDetails2.RemainingToBeSettledQuantity,
					com.tools20022.repository.msg.IntraPositionMovementDetails5.RemainingToBeSettledQuantity, com.tools20022.repository.msg.IntraPositionMovementDetails6.RemainingToBeSettledQuantity,
					com.tools20022.repository.msg.IntraPositionMovementDetails7.RemainingToBeSettledQuantity, com.tools20022.repository.msg.IntraPositionMovementDetails8.RemainingToBeSettledQuantity,
					com.tools20022.repository.msg.IntraPositionMovementDetails9.RemainingToBeSettledQuantity, com.tools20022.repository.msg.IntraPositionMovementDetails10.RemainingToBeSettledQuantity,
					com.tools20022.repository.msg.QuantityAndAccount6.SettledQuantity, com.tools20022.repository.msg.QuantityAndAccount6.PreviouslySettledQuantity,
					com.tools20022.repository.msg.QuantityAndAccount6.RemainingToBeSettledQuantity, com.tools20022.repository.msg.QuantityAndAccount11.SettledQuantity,
					com.tools20022.repository.msg.QuantityAndAccount11.PreviouslySettledQuantity, com.tools20022.repository.msg.QuantityAndAccount11.RemainingToBeSettledQuantity,
					com.tools20022.repository.msg.QuantityAndAccount18.SettledQuantity, com.tools20022.repository.msg.QuantityAndAccount18.PreviouslySettledQuantity,
					com.tools20022.repository.msg.QuantityAndAccount18.RemainingToBeSettledQuantity, com.tools20022.repository.msg.QuantityAndAccount19.SettledQuantity,
					com.tools20022.repository.msg.QuantityAndAccount19.PreviouslySettledQuantity, com.tools20022.repository.msg.QuantityAndAccount19.RemainingToBeSettledQuantity,
					com.tools20022.repository.msg.QuantityAndAccount1.SettlementQuantity, com.tools20022.repository.msg.QuantityAndAccount5.SettlementQuantity, com.tools20022.repository.msg.QuantityAndAccount17.SettlementQuantity,
					com.tools20022.repository.msg.QuantityAndAccount24.SettlementQuantity, com.tools20022.repository.msg.QuantityAndAccount25.SettlementQuantity, com.tools20022.repository.msg.QuantityAndAccount34.SettlementQuantity,
					com.tools20022.repository.msg.QuantityAndAccount2.SettledQuantity, com.tools20022.repository.msg.QuantityAndAccount2.PreviouslySettledQuantity,
					com.tools20022.repository.msg.QuantityAndAccount2.RemainingToBeSettledQuantity, com.tools20022.repository.msg.QuantityAndAccount12.SettledQuantity,
					com.tools20022.repository.msg.QuantityAndAccount12.PreviouslySettledQuantity, com.tools20022.repository.msg.QuantityAndAccount12.RemainingToBeSettledQuantity,
					com.tools20022.repository.msg.QuantityAndAccount15.SettledQuantity, com.tools20022.repository.msg.QuantityAndAccount15.PreviouslySettledQuantity,
					com.tools20022.repository.msg.QuantityAndAccount15.RemainingToBeSettledQuantity, com.tools20022.repository.msg.QuantityAndAccount20.SettledQuantity,
					com.tools20022.repository.msg.QuantityAndAccount20.PreviouslySettledQuantity, com.tools20022.repository.msg.QuantityAndAccount20.RemainingToBeSettledQuantity,
					com.tools20022.repository.msg.QuantityAndAccount28.SettledQuantity, com.tools20022.repository.msg.QuantityAndAccount28.PreviouslySettledQuantity,
					com.tools20022.repository.msg.QuantityAndAccount28.RemainingToBeSettledQuantity, com.tools20022.repository.msg.QuantityAndAccount37.SettledQuantity,
					com.tools20022.repository.msg.QuantityAndAccount37.PreviouslySettledQuantity, com.tools20022.repository.msg.QuantityAndAccount37.RemainingToBeSettledQuantity,
					com.tools20022.repository.msg.TransactionDetails5.SettlementQuantity, com.tools20022.repository.msg.TransactionDetails9.SettlementQuantity, com.tools20022.repository.msg.TransactionDetails22.SettlementQuantity,
					com.tools20022.repository.msg.TransactionDetails23.SettlementQuantity, com.tools20022.repository.msg.TransactionDetails36.SettlementQuantity, com.tools20022.repository.msg.TransactionDetails47.SettlementQuantity,
					com.tools20022.repository.msg.TransactionDetails53.SettlementQuantity, com.tools20022.repository.msg.TransactionDetails58.SettlementQuantity, com.tools20022.repository.msg.TransactionDetails7.PostingQuantity,
					com.tools20022.repository.msg.TransactionDetails8.PostingQuantity, com.tools20022.repository.msg.TransactionDetails16.PostingQuantity, com.tools20022.repository.msg.TransactionDetails17.PostingQuantity,
					com.tools20022.repository.msg.TransactionDetails26.PostingQuantity, com.tools20022.repository.msg.TransactionDetails25.PostingQuantity, com.tools20022.repository.msg.TransactionDetails27.PostingQuantity,
					com.tools20022.repository.msg.TransactionDetails33.PostingQuantity, com.tools20022.repository.msg.TransactionDetails39.PostingQuantity, com.tools20022.repository.msg.TransactionDetails50.PostingQuantity,
					com.tools20022.repository.msg.TransactionDetails56.PostingQuantity, com.tools20022.repository.msg.TransactionDetails59.PostingQuantity, com.tools20022.repository.msg.TransactionDetails6.PostingQuantity,
					com.tools20022.repository.msg.TransactionDetails18.PostingQuantity, com.tools20022.repository.msg.TransactionDetails24.PostingQuantity, com.tools20022.repository.msg.TransactionDetails34.PostingQuantity,
					com.tools20022.repository.msg.TransactionDetails37.PostingQuantity, com.tools20022.repository.msg.TransactionDetails48.PostingQuantity, com.tools20022.repository.msg.TransactionDetails57.PostingQuantity,
					com.tools20022.repository.msg.TransactionDetails60.PostingQuantity, com.tools20022.repository.msg.Quantity5.SettlementQuantity, com.tools20022.repository.msg.QuantityAndAccount7.SettlementQuantity,
					com.tools20022.repository.msg.QuantityAndAccount16.SettlementQuantity, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2.SettlementQuantity,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8.SettlementQuantity, com.tools20022.repository.msg.QuantityAndAccount3.SettlementQuantity,
					com.tools20022.repository.msg.QuantityAndAccount13.SettlementQuantity, com.tools20022.repository.msg.QuantityAndAccount8.SettlementQuantity, com.tools20022.repository.msg.QuantityAndAccount14.SettlementQuantity,
					com.tools20022.repository.msg.TransactionDetails4.SettlementQuantity, com.tools20022.repository.msg.TransactionDetails30.SettlementQuantity, com.tools20022.repository.msg.QuantityAndAccount10.SettlementQuantity,
					com.tools20022.repository.msg.QuantityAndAccount21.SettlementQuantity, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6.SettlementQuantity,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10.SettlementQuantity, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17.SettlementQuantity,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18.SettlementQuantity, com.tools20022.repository.msg.TransactionDetails20.SettlementQuantity,
					com.tools20022.repository.msg.QuantityAndAccount4.SettlementQuantity, com.tools20022.repository.msg.QuantityAndAccount22.SettlementQuantity, com.tools20022.repository.msg.QuantityAndAccount27.SettlementQuantity,
					com.tools20022.repository.msg.QuantityAndAccount36.SettlementQuantity, com.tools20022.repository.msg.QuantityAndAccount9.SettlementQuantity, com.tools20022.repository.msg.QuantityAndAccount23.SettlementQuantity,
					com.tools20022.repository.msg.QuantityAndAccount26.SettlementQuantity, com.tools20022.repository.msg.QuantityAndAccount35.SettlementQuantity, com.tools20022.repository.msg.TransactionDetails40.SettlementQuantity,
					com.tools20022.repository.msg.TransactionDetails42.SettlementQuantity, com.tools20022.repository.msg.TransactionDetails46.SettlementQuantity, com.tools20022.repository.msg.TransactionDetails32.SettlementQuantity,
					com.tools20022.repository.msg.TransactionDetails14.SettlementQuantity, com.tools20022.repository.msg.TransactionDetails35.SettlementQuantity, com.tools20022.repository.msg.Quantity6.SettlementQuantity,
					com.tools20022.repository.msg.Quantity7.SettlementQuantity, com.tools20022.repository.msg.Quantity8.SettlementQuantity, com.tools20022.repository.msg.TransactionDetails45.SettlementQuantity,
					com.tools20022.repository.msg.SettlementObligation1.RemainingQuantityToBeSettled, com.tools20022.repository.msg.IntraPositionMovementDetails3.RemainingToBeSettledQuantity,
					com.tools20022.repository.msg.IntraPositionMovementDetails4.RemainingToBeSettledQuantity, com.tools20022.repository.msg.TransactionDetails51.SettlementQuantity,
					com.tools20022.repository.msg.TransactionDetails51.SettledQuantity, com.tools20022.repository.msg.TransactionDetails51.PreviouslySettledQuantity,
					com.tools20022.repository.msg.TransactionDetails51.RemainingToBeSettledQuantity, com.tools20022.repository.msg.TransactionDetails52.SettlementQuantity,
					com.tools20022.repository.msg.TransactionDetails61.SettlementQuantity, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21.SettlementQuantity,
					com.tools20022.repository.msg.TransactionDetails62.PostingQuantity, com.tools20022.repository.msg.TransactionDetails63.PostingQuantity,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22.SettlementQuantity, com.tools20022.repository.msg.TransactionDetails66.SettlementQuantity,
					com.tools20022.repository.msg.TransactionDetails67.PostingQuantity, com.tools20022.repository.msg.TransactionDetails68.PostingQuantity,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24.SettlementQuantity, com.tools20022.repository.msg.TransactionDetails70.SettlementQuantity,
					com.tools20022.repository.msg.TransactionDetails69.PostingQuantity, com.tools20022.repository.msg.TransactionDetails71.SettlementQuantity,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25.SettlementQuantity, com.tools20022.repository.msg.TransactionDetails72.PostingQuantity,
					com.tools20022.repository.msg.QuantityAndAccount39.SettlementQuantity, com.tools20022.repository.msg.QuantityAndAccount41.SettledQuantity, com.tools20022.repository.msg.QuantityAndAccount41.PreviouslySettledQuantity,
					com.tools20022.repository.msg.QuantityAndAccount41.RemainingToBeSettledQuantity, com.tools20022.repository.msg.QuantityAndAccount40.SettledQuantity,
					com.tools20022.repository.msg.QuantityAndAccount40.PreviouslySettledQuantity, com.tools20022.repository.msg.QuantityAndAccount40.RemainingToBeSettledQuantity,
					com.tools20022.repository.msg.TransactionDetails81.SettlementQuantity, com.tools20022.repository.msg.QuantityAndAccount42.SettlementQuantity, com.tools20022.repository.msg.TransactionDetails74.SettlementQuantity,
					com.tools20022.repository.msg.TransactionDetails82.SettlementQuantity, com.tools20022.repository.msg.QuantityAndAccount38.SettlementQuantity,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26.SettlementQuantity, com.tools20022.repository.msg.TransactionDetails79.SettlementQuantity,
					com.tools20022.repository.msg.TransactionDetails80.SettlementQuantity, com.tools20022.repository.msg.QuantityAndAccount43.SettlementQuantity, com.tools20022.repository.msg.TransactionDetails75.PostingQuantity,
					com.tools20022.repository.msg.TransactionDetails78.PostingQuantity, com.tools20022.repository.msg.Quantity11.SettlementQuantity, com.tools20022.repository.msg.QuantityAndAccount45.SettlementQuantity,
					com.tools20022.repository.msg.IntraPositionMovementDetails11.RemainingToBeSettledQuantity, com.tools20022.repository.msg.QuantityAndAccount47.SettlementQuantity,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.SettlementQuantity, com.tools20022.repository.msg.QuantityAndAccount48.SettlementQuantity,
					com.tools20022.repository.msg.TransactionDetails88.SettlementQuantity, com.tools20022.repository.msg.QuantityAndAccount46.SettledQuantity, com.tools20022.repository.msg.QuantityAndAccount46.PreviouslySettledQuantity,
					com.tools20022.repository.msg.QuantityAndAccount46.RemainingToBeSettledQuantity, com.tools20022.repository.msg.TransactionDetails92.SettlementQuantity,
					com.tools20022.repository.msg.TransactionDetails84.SettlementQuantity, com.tools20022.repository.msg.TransactionDetails83.SettlementQuantity, com.tools20022.repository.msg.QuantityAndAccount51.SettledQuantity,
					com.tools20022.repository.msg.QuantityAndAccount51.PreviouslySettledQuantity, com.tools20022.repository.msg.QuantityAndAccount51.RemainingToBeSettledQuantity,
					com.tools20022.repository.msg.TransactionDetails87.SettlementQuantity, com.tools20022.repository.msg.QuantityAndAccount49.SettlementQuantity, com.tools20022.repository.msg.Quantity12.SettlementQuantity,
					com.tools20022.repository.msg.TransactionDetails91.PostingQuantity, com.tools20022.repository.msg.QuantityAndAccount50.SettlementQuantity, com.tools20022.repository.msg.TransactionDetails90.PostingQuantity,
					com.tools20022.repository.msg.QuantityAndAccount55.SettlementQuantity, com.tools20022.repository.msg.IntraPositionMovementDetails12.RemainingToBeSettledQuantity,
					com.tools20022.repository.msg.TransactionDetails97.SettlementQuantity, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35.SettlementQuantity,
					com.tools20022.repository.msg.TransactionDetails96.PostingQuantity, com.tools20022.repository.msg.IntraPositionMovementDetails13.RemainingToBeSettledQuantity,
					com.tools20022.repository.msg.TransactionDetails95.PostingQuantity, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36.SettlementQuantity,
					com.tools20022.repository.msg.IntraPositionMovementDetails14.RemainingToBeSettledQuantity, com.tools20022.repository.msg.TransactionDetails100.SettlementQuantity,
					com.tools20022.repository.msg.TransactionDetails99.PostingQuantity, com.tools20022.repository.msg.TransactionDetails98.PostingQuantity, com.tools20022.repository.msg.QuantityAndAccount57.SettledQuantity,
					com.tools20022.repository.msg.QuantityAndAccount57.PreviouslySettledQuantity, com.tools20022.repository.msg.QuantityAndAccount57.RemainingToBeSettledQuantity,
					com.tools20022.repository.msg.QuantityAndAccount58.SettlementQuantity, com.tools20022.repository.msg.QuantityAndAccount56.SettlementQuantity, com.tools20022.repository.msg.QuantityAndAccount61.SettlementQuantity,
					com.tools20022.repository.msg.QuantityAndAccount62.SettledQuantity, com.tools20022.repository.msg.QuantityAndAccount62.PreviouslySettledQuantity,
					com.tools20022.repository.msg.QuantityAndAccount62.RemainingToBeSettledQuantity, com.tools20022.repository.msg.QuantityAndAccount60.SettlementQuantity);
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementQuantity";
			definition = "Total quantity of securities to be settled.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.SecuritiesSettlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the trade which originates the settlement process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#SecuritiesSettlement
	 * SecuritiesTradeExecution.SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution
	 * SecuritiesTradeExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTradeExecution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the trade which originates the settlement process."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesTradeExecution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTradeExecution";
			definition = "Specifies the trade which originates the settlement process.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeExecution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeExecution.SecuritiesSettlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Account servicer is instructed to buy the indicated currency after the
	 * receipt of cash proceeds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CurrencyToBuyOrSell1Choice#CurrencyToBuy
	 * CurrencyToBuyOrSell1Choice.CurrencyToBuy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption5#CurrencyToBuy
	 * CorporateActionOption5.CurrencyToBuy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption13#CurrencyToBuy
	 * CorporateActionOption13.CurrencyToBuy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption25#CurrencyToBuy
	 * CorporateActionOption25.CurrencyToBuy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption30#CurrencyToBuy
	 * CorporateActionOption30.CurrencyToBuy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption38#CurrencyToBuy
	 * CorporateActionOption38.CurrencyToBuy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption47#CurrencyToBuy
	 * CorporateActionOption47.CurrencyToBuy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption57#CurrencyToBuy
	 * CorporateActionOption57.CurrencyToBuy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption58#CurrencyToBuy
	 * CorporateActionOption58.CurrencyToBuy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption103#CurrencyToBuy
	 * CorporateActionOption103.CurrencyToBuy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption107#CurrencyToBuy
	 * CorporateActionOption107.CurrencyToBuy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption118#CurrencyToBuy
	 * CorporateActionOption118.CurrencyToBuy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption123#CurrencyToBuy
	 * CorporateActionOption123.CurrencyToBuy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption131#CurrencyToBuy
	 * CorporateActionOption131.CurrencyToBuy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption134#CurrencyToBuy
	 * CorporateActionOption134.CurrencyToBuy}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyToBuy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account servicer is instructed to buy the indicated currency after the receipt of cash proceeds."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CurrencyToBuy = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CurrencyToBuyOrSell1Choice.CurrencyToBuy, com.tools20022.repository.msg.CorporateActionOption5.CurrencyToBuy,
					com.tools20022.repository.msg.CorporateActionOption13.CurrencyToBuy, com.tools20022.repository.msg.CorporateActionOption25.CurrencyToBuy, com.tools20022.repository.msg.CorporateActionOption30.CurrencyToBuy,
					com.tools20022.repository.msg.CorporateActionOption38.CurrencyToBuy, com.tools20022.repository.msg.CorporateActionOption47.CurrencyToBuy, com.tools20022.repository.msg.CorporateActionOption57.CurrencyToBuy,
					com.tools20022.repository.msg.CorporateActionOption58.CurrencyToBuy, com.tools20022.repository.msg.CorporateActionOption103.CurrencyToBuy, com.tools20022.repository.msg.CorporateActionOption107.CurrencyToBuy,
					com.tools20022.repository.msg.CorporateActionOption118.CurrencyToBuy, com.tools20022.repository.msg.CorporateActionOption123.CurrencyToBuy, com.tools20022.repository.msg.CorporateActionOption131.CurrencyToBuy,
					com.tools20022.repository.msg.CorporateActionOption134.CurrencyToBuy);
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyToBuy";
			definition = "Account servicer is instructed to buy the indicated currency after the receipt of cash proceeds.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Account servicer is instructed to sell a currency in order to obtain the
	 * currency needed to fund the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CurrencyToBuyOrSell1Choice#CurrencyToSell
	 * CurrencyToBuyOrSell1Choice.CurrencyToSell}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption5#CurrencyToSell
	 * CorporateActionOption5.CurrencyToSell}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption13#CurrencyToSell
	 * CorporateActionOption13.CurrencyToSell}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption25#CurrencyToSell
	 * CorporateActionOption25.CurrencyToSell}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption30#CurrencyToSell
	 * CorporateActionOption30.CurrencyToSell}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption38#CurrencyToSell
	 * CorporateActionOption38.CurrencyToSell}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption47#CurrencyToSell
	 * CorporateActionOption47.CurrencyToSell}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption57#CurrencyToSell
	 * CorporateActionOption57.CurrencyToSell}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption58#CurrencyToSell
	 * CorporateActionOption58.CurrencyToSell}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption103#CurrencyToSell
	 * CorporateActionOption103.CurrencyToSell}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption107#CurrencyToSell
	 * CorporateActionOption107.CurrencyToSell}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption118#CurrencyToSell
	 * CorporateActionOption118.CurrencyToSell}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption123#CurrencyToSell
	 * CorporateActionOption123.CurrencyToSell}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption131#CurrencyToSell
	 * CorporateActionOption131.CurrencyToSell}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption134#CurrencyToSell
	 * CorporateActionOption134.CurrencyToSell}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyToSell"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account servicer is instructed to sell a currency in order to obtain the currency needed to fund the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CurrencyToSell = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CurrencyToBuyOrSell1Choice.CurrencyToSell, com.tools20022.repository.msg.CorporateActionOption5.CurrencyToSell,
					com.tools20022.repository.msg.CorporateActionOption13.CurrencyToSell, com.tools20022.repository.msg.CorporateActionOption25.CurrencyToSell, com.tools20022.repository.msg.CorporateActionOption30.CurrencyToSell,
					com.tools20022.repository.msg.CorporateActionOption38.CurrencyToSell, com.tools20022.repository.msg.CorporateActionOption47.CurrencyToSell, com.tools20022.repository.msg.CorporateActionOption57.CurrencyToSell,
					com.tools20022.repository.msg.CorporateActionOption58.CurrencyToSell, com.tools20022.repository.msg.CorporateActionOption103.CurrencyToSell, com.tools20022.repository.msg.CorporateActionOption107.CurrencyToSell,
					com.tools20022.repository.msg.CorporateActionOption118.CurrencyToSell, com.tools20022.repository.msg.CorporateActionOption123.CurrencyToSell, com.tools20022.repository.msg.CorporateActionOption131.CurrencyToSell,
					com.tools20022.repository.msg.CorporateActionOption134.CurrencyToSell);
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyToSell";
			definition = "Account servicer is instructed to sell a currency in order to obtain the currency needed to fund the transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Denomination (stated value found on financial instruments) of the
	 * security to be received or delivered.
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
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount29#DenominationChoice
	 * QuantityAndAccount29.DenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount30#DenominationChoice
	 * QuantityAndAccount30.DenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount32#DenominationChoice
	 * QuantityAndAccount32.DenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount33#DenominationChoice
	 * QuantityAndAccount33.DenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount1#DenominationChoice
	 * QuantityAndAccount1.DenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount5#DenominationChoice
	 * QuantityAndAccount5.DenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount17#DenominationChoice
	 * QuantityAndAccount17.DenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount24#DenominationChoice
	 * QuantityAndAccount24.DenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount25#DenominationChoice
	 * QuantityAndAccount25.DenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount34#DenominationChoice
	 * QuantityAndAccount34.DenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount2#DenominationChoice
	 * QuantityAndAccount2.DenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount12#DenominationChoice
	 * QuantityAndAccount12.DenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount15#DenominationChoice
	 * QuantityAndAccount15.DenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount20#DenominationChoice
	 * QuantityAndAccount20.DenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount28#DenominationChoice
	 * QuantityAndAccount28.DenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount37#DenominationChoice
	 * QuantityAndAccount37.DenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Quantity5#DenominationChoice
	 * Quantity5.DenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount3#DenominationChoice
	 * QuantityAndAccount3.DenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount13#DenominationChoice
	 * QuantityAndAccount13.DenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount8#DenominationChoice
	 * QuantityAndAccount8.DenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount14#DenominationChoice
	 * QuantityAndAccount14.DenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount4#DenominationChoice
	 * QuantityAndAccount4.DenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount22#DenominationChoice
	 * QuantityAndAccount22.DenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount27#DenominationChoice
	 * QuantityAndAccount27.DenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount36#DenominationChoice
	 * QuantityAndAccount36.DenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount9#DenominationChoice
	 * QuantityAndAccount9.DenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount23#DenominationChoice
	 * QuantityAndAccount23.DenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount26#DenominationChoice
	 * QuantityAndAccount26.DenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount35#DenominationChoice
	 * QuantityAndAccount35.DenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Quantity6#DenominationChoice
	 * Quantity6.DenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Quantity7#DenominationChoice
	 * Quantity7.DenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Quantity8#DenominationChoice
	 * Quantity8.DenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount39#DenominationChoice
	 * QuantityAndAccount39.DenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount41#DenominationChoice
	 * QuantityAndAccount41.DenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount42#DenominationChoice
	 * QuantityAndAccount42.DenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount43#DenominationChoice
	 * QuantityAndAccount43.DenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Quantity11#DenominationChoice
	 * Quantity11.DenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount45#DenominationChoice
	 * QuantityAndAccount45.DenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount44#DenominationChoice
	 * QuantityAndAccount44.DenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount47#DenominationChoice
	 * QuantityAndAccount47.DenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount51#DenominationChoice
	 * QuantityAndAccount51.DenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount49#DenominationChoice
	 * QuantityAndAccount49.DenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Quantity12#DenominationChoice
	 * Quantity12.DenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount50#DenominationChoice
	 * QuantityAndAccount50.DenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount55#DenominationChoice
	 * QuantityAndAccount55.DenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount54#DenominationChoice
	 * QuantityAndAccount54.DenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount57#DenominationChoice
	 * QuantityAndAccount57.DenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount58#DenominationChoice
	 * QuantityAndAccount58.DenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount56#DenominationChoice
	 * QuantityAndAccount56.DenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount59#DenominationChoice
	 * QuantityAndAccount59.DenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount60#DenominationChoice
	 * QuantityAndAccount60.DenominationChoice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationChoice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Denomination (stated value found on financial instruments) of the security to be received or delivered."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute DenominationChoice = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.QuantityAndAccount29.DenominationChoice, com.tools20022.repository.msg.QuantityAndAccount30.DenominationChoice,
					com.tools20022.repository.msg.QuantityAndAccount32.DenominationChoice, com.tools20022.repository.msg.QuantityAndAccount33.DenominationChoice, com.tools20022.repository.msg.QuantityAndAccount1.DenominationChoice,
					com.tools20022.repository.msg.QuantityAndAccount5.DenominationChoice, com.tools20022.repository.msg.QuantityAndAccount17.DenominationChoice, com.tools20022.repository.msg.QuantityAndAccount24.DenominationChoice,
					com.tools20022.repository.msg.QuantityAndAccount25.DenominationChoice, com.tools20022.repository.msg.QuantityAndAccount34.DenominationChoice, com.tools20022.repository.msg.QuantityAndAccount2.DenominationChoice,
					com.tools20022.repository.msg.QuantityAndAccount12.DenominationChoice, com.tools20022.repository.msg.QuantityAndAccount15.DenominationChoice, com.tools20022.repository.msg.QuantityAndAccount20.DenominationChoice,
					com.tools20022.repository.msg.QuantityAndAccount28.DenominationChoice, com.tools20022.repository.msg.QuantityAndAccount37.DenominationChoice, com.tools20022.repository.msg.Quantity5.DenominationChoice,
					com.tools20022.repository.msg.QuantityAndAccount3.DenominationChoice, com.tools20022.repository.msg.QuantityAndAccount13.DenominationChoice, com.tools20022.repository.msg.QuantityAndAccount8.DenominationChoice,
					com.tools20022.repository.msg.QuantityAndAccount14.DenominationChoice, com.tools20022.repository.msg.QuantityAndAccount4.DenominationChoice, com.tools20022.repository.msg.QuantityAndAccount22.DenominationChoice,
					com.tools20022.repository.msg.QuantityAndAccount27.DenominationChoice, com.tools20022.repository.msg.QuantityAndAccount36.DenominationChoice, com.tools20022.repository.msg.QuantityAndAccount9.DenominationChoice,
					com.tools20022.repository.msg.QuantityAndAccount23.DenominationChoice, com.tools20022.repository.msg.QuantityAndAccount26.DenominationChoice, com.tools20022.repository.msg.QuantityAndAccount35.DenominationChoice,
					com.tools20022.repository.msg.Quantity6.DenominationChoice, com.tools20022.repository.msg.Quantity7.DenominationChoice, com.tools20022.repository.msg.Quantity8.DenominationChoice,
					com.tools20022.repository.msg.QuantityAndAccount39.DenominationChoice, com.tools20022.repository.msg.QuantityAndAccount41.DenominationChoice, com.tools20022.repository.msg.QuantityAndAccount42.DenominationChoice,
					com.tools20022.repository.msg.QuantityAndAccount43.DenominationChoice, com.tools20022.repository.msg.Quantity11.DenominationChoice, com.tools20022.repository.msg.QuantityAndAccount45.DenominationChoice,
					com.tools20022.repository.msg.QuantityAndAccount44.DenominationChoice, com.tools20022.repository.msg.QuantityAndAccount47.DenominationChoice, com.tools20022.repository.msg.QuantityAndAccount51.DenominationChoice,
					com.tools20022.repository.msg.QuantityAndAccount49.DenominationChoice, com.tools20022.repository.msg.Quantity12.DenominationChoice, com.tools20022.repository.msg.QuantityAndAccount50.DenominationChoice,
					com.tools20022.repository.msg.QuantityAndAccount55.DenominationChoice, com.tools20022.repository.msg.QuantityAndAccount54.DenominationChoice, com.tools20022.repository.msg.QuantityAndAccount57.DenominationChoice,
					com.tools20022.repository.msg.QuantityAndAccount58.DenominationChoice, com.tools20022.repository.msg.QuantityAndAccount56.DenominationChoice, com.tools20022.repository.msg.QuantityAndAccount59.DenominationChoice,
					com.tools20022.repository.msg.QuantityAndAccount60.DenominationChoice);
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DenominationChoice";
			definition = "Denomination (stated value found on financial instruments) of the security to be received or delivered.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Conditions under which the order/trade is to be settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionCode
	 * SettlementTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition1Choice#Code
	 * SettlementTransactionCondition1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition1Choice#Proprietary
	 * SettlementTransactionCondition1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition6Choice#Code
	 * SettlementTransactionCondition6Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition6Choice#Proprietary
	 * SettlementTransactionCondition6Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition12Choice#Code
	 * SettlementTransactionCondition12Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition12Choice#Proprietary
	 * SettlementTransactionCondition12Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails50#SettlementTransactionCondition
	 * SettlementDetails50.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition14Choice#Code
	 * SettlementTransactionCondition14Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition14Choice#Proprietary
	 * SettlementTransactionCondition14Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails51#SettlementTransactionCondition
	 * SettlementDetails51.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails9#SettlementTransactionCondition
	 * SettlementDetails9.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition3Choice#Code
	 * SettlementTransactionCondition3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition3Choice#Proprietary
	 * SettlementTransactionCondition3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails17#SettlementTransactionCondition
	 * SettlementDetails17.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition7Choice#Code
	 * SettlementTransactionCondition7Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition7Choice#Proprietary
	 * SettlementTransactionCondition7Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails30#SettlementTransactionCondition
	 * SettlementDetails30.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition8Choice#Code
	 * SettlementTransactionCondition8Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition8Choice#Proprietary
	 * SettlementTransactionCondition8Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails32#SettlementTransactionCondition
	 * SettlementDetails32.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails60#SettlementTransactionCondition
	 * SettlementDetails60.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails60#PartialSettlementIndicator
	 * SettlementDetails60.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails64#SettlementTransactionCondition
	 * SettlementDetails64.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails64#PartialSettlementIndicator
	 * SettlementDetails64.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails3#SettlementTransactionCondition
	 * SettlementDetails3.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails16#SettlementTransactionCondition
	 * SettlementDetails16.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails31#SettlementTransactionCondition
	 * SettlementDetails31.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails40#SettlementTransactionCondition
	 * SettlementDetails40.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails62#SettlementTransactionCondition
	 * SettlementDetails62.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails62#PartialSettlementIndicator
	 * SettlementDetails62.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails63#SettlementTransactionCondition
	 * SettlementDetails63.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails63#PartialSettlementIndicator
	 * SettlementDetails63.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails6#PartialSettlementIndicator
	 * RequestDetails6.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails7#PartialSettlementIndicator
	 * RequestDetails7.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails8#PartialSettlementIndicator
	 * RequestDetails8.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails9#PartialSettlementIndicator
	 * RequestDetails9.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails11#PartialSettlementIndicator
	 * RequestDetails11.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails12#PartialSettlementIndicator
	 * RequestDetails12.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails6#SettlementTransactionCondition
	 * SettlementDetails6.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails20#SettlementTransactionCondition
	 * SettlementDetails20.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails24#SettlementTransactionCondition
	 * SettlementDetails24.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails24#PartialSettlementIndicator
	 * SettlementDetails24.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition9Choice#Code
	 * SettlementTransactionCondition9Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition9Choice#Proprietary
	 * SettlementTransactionCondition9Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails33#SettlementTransactionCondition
	 * SettlementDetails33.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails33#PartialSettlementIndicator
	 * SettlementDetails33.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails45#SettlementTransactionCondition
	 * SettlementDetails45.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails45#PartialSettlementIndicator
	 * SettlementDetails45.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails54#SettlementTransactionCondition
	 * SettlementDetails54.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails54#PartialSettlementIndicator
	 * SettlementDetails54.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails1#SettlementTransactionCondition
	 * SettlementDetails1.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails19#SettlementTransactionCondition
	 * SettlementDetails19.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails22#SettlementTransactionCondition
	 * SettlementDetails22.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails22#PartialSettlementIndicator
	 * SettlementDetails22.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails35#SettlementTransactionCondition
	 * SettlementDetails35.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails35#PartialSettlementIndicator
	 * SettlementDetails35.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#SettlementTransactionCondition
	 * SettlementDetails42.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#PartialSettlementIndicator
	 * SettlementDetails42.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails52#SettlementTransactionCondition
	 * SettlementDetails52.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails52#PartialSettlementIndicator
	 * SettlementDetails52.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails8#SettlementTransactionCondition
	 * SettlementDetails8.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails11#SettlementTransactionCondition
	 * SettlementDetails11.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails23#SettlementTransactionCondition
	 * SettlementDetails23.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails23#PartialSettlementIndicator
	 * SettlementDetails23.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails37#SettlementTransactionCondition
	 * SettlementDetails37.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails37#PartialSettlementIndicator
	 * SettlementDetails37.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails44#SettlementTransactionCondition
	 * SettlementDetails44.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails44#PartialSettlementIndicator
	 * SettlementDetails44.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails53#SettlementTransactionCondition
	 * SettlementDetails53.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails53#PartialSettlementIndicator
	 * SettlementDetails53.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails7#SettlementTransactionCondition
	 * SettlementDetails7.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails12#SettlementTransactionCondition
	 * SettlementDetails12.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails28#SettlementTransactionCondition
	 * SettlementDetails28.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails28#PartialSettlementIndicator
	 * SettlementDetails28.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails38#SettlementTransactionCondition
	 * SettlementDetails38.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails38#PartialSettlementIndicator
	 * SettlementDetails38.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails47#SettlementTransactionCondition
	 * SettlementDetails47.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails47#PartialSettlementIndicator
	 * SettlementDetails47.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails56#SettlementTransactionCondition
	 * SettlementDetails56.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails56#PartialSettlementIndicator
	 * SettlementDetails56.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails2#SettlementTransactionCondition
	 * SettlementDetails2.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails13#SettlementTransactionCondition
	 * SettlementDetails13.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails27#SettlementTransactionCondition
	 * SettlementDetails27.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails27#PartialSettlementIndicator
	 * SettlementDetails27.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails39#SettlementTransactionCondition
	 * SettlementDetails39.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails39#PartialSettlementIndicator
	 * SettlementDetails39.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails48#SettlementTransactionCondition
	 * SettlementDetails48.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails48#PartialSettlementIndicator
	 * SettlementDetails48.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails57#SettlementTransactionCondition
	 * SettlementDetails57.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails57#PartialSettlementIndicator
	 * SettlementDetails57.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition2Choice#Code
	 * SettlementTransactionCondition2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition2Choice#Proprietary
	 * SettlementTransactionCondition2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition11Choice#Code
	 * SettlementTransactionCondition11Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition11Choice#Proprietary
	 * SettlementTransactionCondition11Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#SettlementTransactionCondition
	 * SettlementDetails43.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails4#SettlementTransactionCondition
	 * SettlementDetails4.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails10#SettlementTransactionCondition
	 * SettlementDetails10.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails29#SettlementTransactionCondition
	 * SettlementDetails29.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails5#SettlementTransactionCondition
	 * SettlementDetails5.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition5Choice#Code
	 * SettlementTransactionCondition5Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition5Choice#Proprietary
	 * SettlementTransactionCondition5Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails25#SettlementTransactionCondition
	 * SettlementDetails25.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails26#SettlementTransactionCondition
	 * SettlementDetails26.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails26#PartialSettlementIndicator
	 * SettlementDetails26.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails65#SettlementTransactionCondition
	 * SettlementDetails65.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails65#PartialSettlementIndicator
	 * SettlementDetails65.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails14#SettlementTransactionCondition
	 * SettlementDetails14.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails41#SettlementTransactionCondition
	 * SettlementDetails41.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails61#SettlementTransactionCondition
	 * SettlementDetails61.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails61#PartialSettlementIndicator
	 * SettlementDetails61.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails59#SettlementTransactionCondition
	 * SettlementDetails59.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails59#PartialSettlementIndicator
	 * SettlementDetails59.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition4Choice#Code
	 * SettlementTransactionCondition4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition4Choice#Proprietary
	 * SettlementTransactionCondition4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails15#SettlementTransactionCondition
	 * SettlementDetails15.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition10Choice#Code
	 * SettlementTransactionCondition10Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition10Choice#Proprietary
	 * SettlementTransactionCondition10Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails34#SettlementTransactionCondition
	 * SettlementDetails34.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails49#SettlementTransactionCondition
	 * SettlementDetails49.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails49#PartialSettlementIndicator
	 * SettlementDetails49.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails58#SettlementTransactionCondition
	 * SettlementDetails58.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails58#PartialSettlementIndicator
	 * SettlementDetails58.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails36#SettlementTransactionCondition
	 * SettlementDetails36.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails36#PartialSettlementIndicator
	 * SettlementDetails36.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails18#SettlementTransactionCondition
	 * SettlementDetails18.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails66#SettlementTransactionCondition
	 * SettlementDetails66.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails66#PartialSettlementIndicator
	 * SettlementDetails66.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1#PartialSettlementIndicator
	 * SettlementInstructionQueryCriteria1.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#SettlementTransactionCondition
	 * SettlementDetails67.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#PartialSettlementIndicator
	 * SettlementDetails67.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails70#SettlementTransactionCondition
	 * SettlementDetails70.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails70#PartialSettlementIndicator
	 * SettlementDetails70.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#SettlementTransactionCondition
	 * SettlementDetails68.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails69#SettlementTransactionCondition
	 * SettlementDetails69.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails69#PartialSettlementIndicator
	 * SettlementDetails69.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails71#SettlementTransactionCondition
	 * SettlementDetails71.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails71#PartialSettlementIndicator
	 * SettlementDetails71.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails72#SettlementTransactionCondition
	 * SettlementDetails72.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails72#PartialSettlementIndicator
	 * SettlementDetails72.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails75#SettlementTransactionCondition
	 * SettlementDetails75.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails75#PartialSettlementIndicator
	 * SettlementDetails75.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails73#SettlementTransactionCondition
	 * SettlementDetails73.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails73#PartialSettlementIndicator
	 * SettlementDetails73.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails74#SettlementTransactionCondition
	 * SettlementDetails74.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails74#PartialSettlementIndicator
	 * SettlementDetails74.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails13#PartialSettlementIndicator
	 * RequestDetails13.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails81#SettlementTransactionCondition
	 * SettlementDetails81.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails81#PartialSettlementIndicator
	 * SettlementDetails81.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails76#SettlementTransactionCondition
	 * SettlementDetails76.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails76#PartialSettlementIndicator
	 * SettlementDetails76.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails80#SettlementTransactionCondition
	 * SettlementDetails80.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails80#PartialSettlementIndicator
	 * SettlementDetails80.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails78#SettlementTransactionCondition
	 * SettlementDetails78.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails78#PartialSettlementIndicator
	 * SettlementDetails78.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails77#SettlementTransactionCondition
	 * SettlementDetails77.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails77#PartialSettlementIndicator
	 * SettlementDetails77.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails14#PartialSettlementIndicator
	 * RequestDetails14.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails79#SettlementTransactionCondition
	 * SettlementDetails79.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails79#PartialSettlementIndicator
	 * SettlementDetails79.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails87#SettlementTransactionCondition
	 * SettlementDetails87.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails87#PartialSettlementIndicator
	 * SettlementDetails87.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails83#SettlementTransactionCondition
	 * SettlementDetails83.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails86#SettlementTransactionCondition
	 * SettlementDetails86.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails86#PartialSettlementIndicator
	 * SettlementDetails86.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails85#SettlementTransactionCondition
	 * SettlementDetails85.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails85#PartialSettlementIndicator
	 * SettlementDetails85.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#SettlementTransactionCondition
	 * SettlementDetails93.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#PartialSettlementIndicator
	 * SettlementDetails93.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails15#PartialSettlementIndicator
	 * RequestDetails15.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails90#SettlementTransactionCondition
	 * SettlementDetails90.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails90#PartialSettlementIndicator
	 * SettlementDetails90.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails96#SettlementTransactionCondition
	 * SettlementDetails96.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails96#PartialSettlementIndicator
	 * SettlementDetails96.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#SettlementTransactionCondition
	 * SettlementDetails97.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#PartialSettlementIndicator
	 * SettlementDetails97.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails99#SettlementTransactionCondition
	 * SettlementDetails99.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails99#PartialSettlementIndicator
	 * SettlementDetails99.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition16Choice#Code
	 * SettlementTransactionCondition16Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition16Choice#Proprietary
	 * SettlementTransactionCondition16Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#SettlementTransactionCondition
	 * SettlementDetails94.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails100#SettlementTransactionCondition
	 * SettlementDetails100.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition19Choice#Code
	 * SettlementTransactionCondition19Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition19Choice#Proprietary
	 * SettlementTransactionCondition19Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition18Choice#Code
	 * SettlementTransactionCondition18Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition18Choice#Proprietary
	 * SettlementTransactionCondition18Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails95#SettlementTransactionCondition
	 * SettlementDetails95.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails95#PartialSettlementIndicator
	 * SettlementDetails95.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails91#SettlementTransactionCondition
	 * SettlementDetails91.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails91#PartialSettlementIndicator
	 * SettlementDetails91.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails92#SettlementTransactionCondition
	 * SettlementDetails92.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails92#PartialSettlementIndicator
	 * SettlementDetails92.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition17Choice#Code
	 * SettlementTransactionCondition17Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition17Choice#Proprietary
	 * SettlementTransactionCondition17Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails98#SettlementTransactionCondition
	 * SettlementDetails98.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails98#PartialSettlementIndicator
	 * SettlementDetails98.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails101#SettlementTransactionCondition
	 * SettlementDetails101.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails101#PartialSettlementIndicator
	 * SettlementDetails101.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition20Choice#Code
	 * SettlementTransactionCondition20Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition20Choice#Proprietary
	 * SettlementTransactionCondition20Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails105#SettlementTransactionCondition
	 * SettlementDetails105.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails105#PartialSettlementIndicator
	 * SettlementDetails105.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails106#SettlementTransactionCondition
	 * SettlementDetails106.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails106#PartialSettlementIndicator
	 * SettlementDetails106.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails104#SettlementTransactionCondition
	 * SettlementDetails104.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails104#PartialSettlementIndicator
	 * SettlementDetails104.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails111#SettlementTransactionCondition
	 * SettlementDetails111.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails111#PartialSettlementIndicator
	 * SettlementDetails111.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails16#PartialSettlementIndicator
	 * RequestDetails16.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails112#SettlementTransactionCondition
	 * SettlementDetails112.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails112#PartialSettlementIndicator
	 * SettlementDetails112.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails110#SettlementTransactionCondition
	 * SettlementDetails110.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails110#PartialSettlementIndicator
	 * SettlementDetails110.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails108#SettlementTransactionCondition
	 * SettlementDetails108.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails108#PartialSettlementIndicator
	 * SettlementDetails108.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails103#SettlementTransactionCondition
	 * SettlementDetails103.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails107#SettlementTransactionCondition
	 * SettlementDetails107.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails107#PartialSettlementIndicator
	 * SettlementDetails107.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition26Choice#Code
	 * SettlementTransactionCondition26Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition26Choice#Proprietary
	 * SettlementTransactionCondition26Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails115#SettlementTransactionCondition
	 * SettlementDetails115.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails115#PartialSettlementIndicator
	 * SettlementDetails115.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition21Choice#Code
	 * SettlementTransactionCondition21Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition21Choice#Proprietary
	 * SettlementTransactionCondition21Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition28Choice#Code
	 * SettlementTransactionCondition28Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition28Choice#Proprietary
	 * SettlementTransactionCondition28Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails117#SettlementTransactionCondition
	 * SettlementDetails117.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails117#PartialSettlementIndicator
	 * SettlementDetails117.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails116#SettlementTransactionCondition
	 * SettlementDetails116.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails116#PartialSettlementIndicator
	 * SettlementDetails116.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition22Choice#Code
	 * SettlementTransactionCondition22Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition22Choice#Proprietary
	 * SettlementTransactionCondition22Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails113#SettlementTransactionCondition
	 * SettlementDetails113.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition29Choice#Code
	 * SettlementTransactionCondition29Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition29Choice#Proprietary
	 * SettlementTransactionCondition29Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters11#SettlementTransactionCondition
	 * FundSettlementParameters11.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters12#SettlementTransactionCondition
	 * FundSettlementParameters12.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition30Choice#Code
	 * SettlementTransactionCondition30Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition30Choice#Proprietary
	 * SettlementTransactionCondition30Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradeTransactionCondition8Choice#Code
	 * TradeTransactionCondition8Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradeTransactionCondition8Choice#Proprietary
	 * TradeTransactionCondition8Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails128#SettlementTransactionCondition
	 * SettlementDetails128.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails128#PartialSettlementIndicator
	 * SettlementDetails128.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#SettlementTransactionCondition
	 * SettlementDetails120.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#PartialSettlementIndicator
	 * SettlementDetails120.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#SettlementTransactionCondition
	 * SettlementDetails119.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#PartialSettlementIndicator
	 * SettlementDetails119.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails125#SettlementTransactionCondition
	 * SettlementDetails125.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails125#PartialSettlementIndicator
	 * SettlementDetails125.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails126#SettlementTransactionCondition
	 * SettlementDetails126.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails126#PartialSettlementIndicator
	 * SettlementDetails126.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#SettlementTransactionCondition
	 * SettlementDetails122.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails127#SettlementTransactionCondition
	 * SettlementDetails127.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails127#PartialSettlementIndicator
	 * SettlementDetails127.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails121#SettlementTransactionCondition
	 * SettlementDetails121.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails121#PartialSettlementIndicator
	 * SettlementDetails121.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails134#SettlementTransactionCondition
	 * SettlementDetails134.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails134#PartialSettlementIndicator
	 * SettlementDetails134.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails137#SettlementTransactionCondition
	 * SettlementDetails137.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails137#PartialSettlementIndicator
	 * SettlementDetails137.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails132#SettlementTransactionCondition
	 * SettlementDetails132.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails132#PartialSettlementIndicator
	 * SettlementDetails132.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails138#SettlementTransactionCondition
	 * SettlementDetails138.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails130#SettlementTransactionCondition
	 * SettlementDetails130.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails130#PartialSettlementIndicator
	 * SettlementDetails130.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails131#SettlementTransactionCondition
	 * SettlementDetails131.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails131#PartialSettlementIndicator
	 * SettlementDetails131.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails133#SettlementTransactionCondition
	 * SettlementDetails133.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails133#PartialSettlementIndicator
	 * SettlementDetails133.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails139#SettlementTransactionCondition
	 * SettlementDetails139.SettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails139#PartialSettlementIndicator
	 * SettlementDetails139.PartialSettlementIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementTransactionCondition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Conditions under which the order/trade is to be settled."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SettlementTransactionCondition = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.SettlementTransactionCondition1Choice.Code, com.tools20022.repository.choice.SettlementTransactionCondition1Choice.Proprietary,
					com.tools20022.repository.choice.SettlementTransactionCondition6Choice.Code, com.tools20022.repository.choice.SettlementTransactionCondition6Choice.Proprietary,
					com.tools20022.repository.choice.SettlementTransactionCondition12Choice.Code, com.tools20022.repository.choice.SettlementTransactionCondition12Choice.Proprietary,
					com.tools20022.repository.msg.SettlementDetails50.SettlementTransactionCondition, com.tools20022.repository.choice.SettlementTransactionCondition14Choice.Code,
					com.tools20022.repository.choice.SettlementTransactionCondition14Choice.Proprietary, com.tools20022.repository.msg.SettlementDetails51.SettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails9.SettlementTransactionCondition, com.tools20022.repository.choice.SettlementTransactionCondition3Choice.Code,
					com.tools20022.repository.choice.SettlementTransactionCondition3Choice.Proprietary, com.tools20022.repository.msg.SettlementDetails17.SettlementTransactionCondition,
					com.tools20022.repository.choice.SettlementTransactionCondition7Choice.Code, com.tools20022.repository.choice.SettlementTransactionCondition7Choice.Proprietary,
					com.tools20022.repository.msg.SettlementDetails30.SettlementTransactionCondition, com.tools20022.repository.choice.SettlementTransactionCondition8Choice.Code,
					com.tools20022.repository.choice.SettlementTransactionCondition8Choice.Proprietary, com.tools20022.repository.msg.SettlementDetails32.SettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails60.SettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails60.PartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails64.SettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails64.PartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails3.SettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails16.SettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails31.SettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails40.SettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails62.SettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails62.PartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails63.SettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails63.PartialSettlementIndicator,
					com.tools20022.repository.msg.RequestDetails6.PartialSettlementIndicator, com.tools20022.repository.msg.RequestDetails7.PartialSettlementIndicator,
					com.tools20022.repository.msg.RequestDetails8.PartialSettlementIndicator, com.tools20022.repository.msg.RequestDetails9.PartialSettlementIndicator,
					com.tools20022.repository.msg.RequestDetails11.PartialSettlementIndicator, com.tools20022.repository.msg.RequestDetails12.PartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails6.SettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails20.SettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails24.SettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails24.PartialSettlementIndicator,
					com.tools20022.repository.choice.SettlementTransactionCondition9Choice.Code, com.tools20022.repository.choice.SettlementTransactionCondition9Choice.Proprietary,
					com.tools20022.repository.msg.SettlementDetails33.SettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails33.PartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails45.SettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails45.PartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails54.SettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails54.PartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails1.SettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails19.SettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails22.SettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails22.PartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails35.SettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails35.PartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails42.SettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails42.PartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails52.SettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails52.PartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails8.SettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails11.SettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails23.SettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails23.PartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails37.SettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails37.PartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails44.SettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails44.PartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails53.SettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails53.PartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails7.SettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails12.SettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails28.SettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails28.PartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails38.SettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails38.PartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails47.SettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails47.PartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails56.SettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails56.PartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails2.SettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails13.SettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails27.SettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails27.PartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails39.SettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails39.PartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails48.SettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails48.PartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails57.SettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails57.PartialSettlementIndicator,
					com.tools20022.repository.choice.SettlementTransactionCondition2Choice.Code, com.tools20022.repository.choice.SettlementTransactionCondition2Choice.Proprietary,
					com.tools20022.repository.choice.SettlementTransactionCondition11Choice.Code, com.tools20022.repository.choice.SettlementTransactionCondition11Choice.Proprietary,
					com.tools20022.repository.msg.SettlementDetails43.SettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails4.SettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails10.SettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails29.SettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails5.SettlementTransactionCondition, com.tools20022.repository.choice.SettlementTransactionCondition5Choice.Code,
					com.tools20022.repository.choice.SettlementTransactionCondition5Choice.Proprietary, com.tools20022.repository.msg.SettlementDetails25.SettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails26.SettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails26.PartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails65.SettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails65.PartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails14.SettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails41.SettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails61.SettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails61.PartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails59.SettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails59.PartialSettlementIndicator,
					com.tools20022.repository.choice.SettlementTransactionCondition4Choice.Code, com.tools20022.repository.choice.SettlementTransactionCondition4Choice.Proprietary,
					com.tools20022.repository.msg.SettlementDetails15.SettlementTransactionCondition, com.tools20022.repository.choice.SettlementTransactionCondition10Choice.Code,
					com.tools20022.repository.choice.SettlementTransactionCondition10Choice.Proprietary, com.tools20022.repository.msg.SettlementDetails34.SettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails49.SettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails49.PartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails58.SettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails58.PartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails36.SettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails36.PartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails18.SettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails66.SettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails66.PartialSettlementIndicator, com.tools20022.repository.msg.SettlementInstructionQueryCriteria1.PartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails67.SettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails67.PartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails70.SettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails70.PartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails68.SettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails69.SettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails69.PartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails71.SettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails71.PartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails72.SettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails72.PartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails75.SettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails75.PartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails73.SettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails73.PartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails74.SettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails74.PartialSettlementIndicator, com.tools20022.repository.msg.RequestDetails13.PartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails81.SettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails81.PartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails76.SettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails76.PartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails80.SettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails80.PartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails78.SettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails78.PartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails77.SettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails77.PartialSettlementIndicator,
					com.tools20022.repository.msg.RequestDetails14.PartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails79.SettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails79.PartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails87.SettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails87.PartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails83.SettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails86.SettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails86.PartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails85.SettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails85.PartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails93.SettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails93.PartialSettlementIndicator,
					com.tools20022.repository.msg.RequestDetails15.PartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails90.SettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails90.PartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails96.SettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails96.PartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails97.SettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails97.PartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails99.SettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails99.PartialSettlementIndicator, com.tools20022.repository.choice.SettlementTransactionCondition16Choice.Code,
					com.tools20022.repository.choice.SettlementTransactionCondition16Choice.Proprietary, com.tools20022.repository.msg.SettlementDetails94.SettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails100.SettlementTransactionCondition, com.tools20022.repository.choice.SettlementTransactionCondition19Choice.Code,
					com.tools20022.repository.choice.SettlementTransactionCondition19Choice.Proprietary, com.tools20022.repository.choice.SettlementTransactionCondition18Choice.Code,
					com.tools20022.repository.choice.SettlementTransactionCondition18Choice.Proprietary, com.tools20022.repository.msg.SettlementDetails95.SettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails95.PartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails91.SettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails91.PartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails92.SettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails92.PartialSettlementIndicator, com.tools20022.repository.choice.SettlementTransactionCondition17Choice.Code,
					com.tools20022.repository.choice.SettlementTransactionCondition17Choice.Proprietary, com.tools20022.repository.msg.SettlementDetails98.SettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails98.PartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails101.SettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails101.PartialSettlementIndicator, com.tools20022.repository.choice.SettlementTransactionCondition20Choice.Code,
					com.tools20022.repository.choice.SettlementTransactionCondition20Choice.Proprietary, com.tools20022.repository.msg.SettlementDetails105.SettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails105.PartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails106.SettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails106.PartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails104.SettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails104.PartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails111.SettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails111.PartialSettlementIndicator, com.tools20022.repository.msg.RequestDetails16.PartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails112.SettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails112.PartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails110.SettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails110.PartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails108.SettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails108.PartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails103.SettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails107.SettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails107.PartialSettlementIndicator, com.tools20022.repository.choice.SettlementTransactionCondition26Choice.Code,
					com.tools20022.repository.choice.SettlementTransactionCondition26Choice.Proprietary, com.tools20022.repository.msg.SettlementDetails115.SettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails115.PartialSettlementIndicator, com.tools20022.repository.choice.SettlementTransactionCondition21Choice.Code,
					com.tools20022.repository.choice.SettlementTransactionCondition21Choice.Proprietary, com.tools20022.repository.choice.SettlementTransactionCondition28Choice.Code,
					com.tools20022.repository.choice.SettlementTransactionCondition28Choice.Proprietary, com.tools20022.repository.msg.SettlementDetails117.SettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails117.PartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails116.SettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails116.PartialSettlementIndicator, com.tools20022.repository.choice.SettlementTransactionCondition22Choice.Code,
					com.tools20022.repository.choice.SettlementTransactionCondition22Choice.Proprietary, com.tools20022.repository.msg.SettlementDetails113.SettlementTransactionCondition,
					com.tools20022.repository.choice.SettlementTransactionCondition29Choice.Code, com.tools20022.repository.choice.SettlementTransactionCondition29Choice.Proprietary,
					com.tools20022.repository.msg.FundSettlementParameters11.SettlementTransactionCondition, com.tools20022.repository.msg.FundSettlementParameters12.SettlementTransactionCondition,
					com.tools20022.repository.choice.SettlementTransactionCondition30Choice.Code, com.tools20022.repository.choice.SettlementTransactionCondition30Choice.Proprietary,
					com.tools20022.repository.choice.TradeTransactionCondition8Choice.Code, com.tools20022.repository.choice.TradeTransactionCondition8Choice.Proprietary,
					com.tools20022.repository.msg.SettlementDetails128.SettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails128.PartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails120.SettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails120.PartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails119.SettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails119.PartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails125.SettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails125.PartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails126.SettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails126.PartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails122.SettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails127.SettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails127.PartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails121.SettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails121.PartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails134.SettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails134.PartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails137.SettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails137.PartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails132.SettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails132.PartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails138.SettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails130.SettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails130.PartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails131.SettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails131.PartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails133.SettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails133.PartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails139.SettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails139.PartialSettlementIndicator);
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementTransactionCondition";
			definition = "Conditions under which the order/trade is to be settled.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> SettlementTransactionConditionCode.mmObject();
		}
	};
	/**
	 * Specifies whether there is change of beneficial ownership.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficialOwnership1Choice#Indicator
	 * BeneficialOwnership1Choice.Indicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficialOwnership1Choice#Proprietary
	 * BeneficialOwnership1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails50#BeneficialOwnership
	 * SettlementDetails50.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficialOwnership2Choice#Indicator
	 * BeneficialOwnership2Choice.Indicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficialOwnership2Choice#Proprietary
	 * BeneficialOwnership2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails51#BeneficialOwnership
	 * SettlementDetails51.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails9#BeneficialOwnership
	 * SettlementDetails9.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails17#BeneficialOwnership
	 * SettlementDetails17.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails30#BeneficialOwnership
	 * SettlementDetails30.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails32#BeneficialOwnership
	 * SettlementDetails32.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails60#BeneficialOwnership
	 * SettlementDetails60.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails64#BeneficialOwnership
	 * SettlementDetails64.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails3#BeneficialOwnership
	 * SettlementDetails3.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails16#BeneficialOwnership
	 * SettlementDetails16.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails31#BeneficialOwnership
	 * SettlementDetails31.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails40#BeneficialOwnership
	 * SettlementDetails40.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails62#BeneficialOwnership
	 * SettlementDetails62.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails63#BeneficialOwnership
	 * SettlementDetails63.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails6#BeneficialOwnership
	 * SettlementDetails6.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails20#BeneficialOwnership
	 * SettlementDetails20.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails24#BeneficialOwnership
	 * SettlementDetails24.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails33#BeneficialOwnership
	 * SettlementDetails33.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails45#BeneficialOwnership
	 * SettlementDetails45.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails54#BeneficialOwnership
	 * SettlementDetails54.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails1#BeneficialOwnership
	 * SettlementDetails1.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails19#BeneficialOwnership
	 * SettlementDetails19.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails22#BeneficialOwnership
	 * SettlementDetails22.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails35#BeneficialOwnership
	 * SettlementDetails35.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#BeneficialOwnership
	 * SettlementDetails42.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails52#BeneficialOwnership
	 * SettlementDetails52.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails8#BeneficialOwnership
	 * SettlementDetails8.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails11#BeneficialOwnership
	 * SettlementDetails11.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails23#BeneficialOwnership
	 * SettlementDetails23.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails37#BeneficialOwnership
	 * SettlementDetails37.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails44#BeneficialOwnership
	 * SettlementDetails44.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails53#BeneficialOwnership
	 * SettlementDetails53.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails7#BeneficialOwnership
	 * SettlementDetails7.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails12#BeneficialOwnership
	 * SettlementDetails12.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails28#BeneficialOwnership
	 * SettlementDetails28.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails38#BeneficialOwnership
	 * SettlementDetails38.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails47#BeneficialOwnership
	 * SettlementDetails47.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails56#BeneficialOwnership
	 * SettlementDetails56.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails2#BeneficialOwnership
	 * SettlementDetails2.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails13#BeneficialOwnership
	 * SettlementDetails13.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails27#BeneficialOwnership
	 * SettlementDetails27.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails39#BeneficialOwnership
	 * SettlementDetails39.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails48#BeneficialOwnership
	 * SettlementDetails48.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails57#BeneficialOwnership
	 * SettlementDetails57.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficialOwnership3Choice#Indicator
	 * BeneficialOwnership3Choice.Indicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficialOwnership3Choice#Proprietary
	 * BeneficialOwnership3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#BeneficialOwnership
	 * SettlementDetails43.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails10#BeneficialOwnership
	 * SettlementDetails10.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails29#BeneficialOwnership
	 * SettlementDetails29.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails5#BeneficialOwnership
	 * SettlementDetails5.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails25#BeneficialOwnership
	 * SettlementDetails25.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails26#BeneficialOwnership
	 * SettlementDetails26.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails65#BeneficialOwnership
	 * SettlementDetails65.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails14#BeneficialOwnership
	 * SettlementDetails14.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails41#BeneficialOwnership
	 * SettlementDetails41.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails61#BeneficialOwnership
	 * SettlementDetails61.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails59#BeneficialOwnership
	 * SettlementDetails59.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails15#BeneficialOwnership
	 * SettlementDetails15.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails34#BeneficialOwnership
	 * SettlementDetails34.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails49#BeneficialOwnership
	 * SettlementDetails49.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails58#BeneficialOwnership
	 * SettlementDetails58.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails36#BeneficialOwnership
	 * SettlementDetails36.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#BeneficialOwnership
	 * SettlementDetails67.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails70#BeneficialOwnership
	 * SettlementDetails70.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#BeneficialOwnership
	 * SettlementDetails68.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails69#BeneficialOwnership
	 * SettlementDetails69.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails71#BeneficialOwnership
	 * SettlementDetails71.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails72#BeneficialOwnership
	 * SettlementDetails72.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails75#BeneficialOwnership
	 * SettlementDetails75.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails73#BeneficialOwnership
	 * SettlementDetails73.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails74#BeneficialOwnership
	 * SettlementDetails74.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails81#BeneficialOwnership
	 * SettlementDetails81.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails76#BeneficialOwnership
	 * SettlementDetails76.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails80#BeneficialOwnership
	 * SettlementDetails80.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails78#BeneficialOwnership
	 * SettlementDetails78.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails77#BeneficialOwnership
	 * SettlementDetails77.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails79#BeneficialOwnership
	 * SettlementDetails79.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails87#BeneficialOwnership
	 * SettlementDetails87.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails83#BeneficialOwnership
	 * SettlementDetails83.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails86#BeneficialOwnership
	 * SettlementDetails86.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails85#BeneficialOwnership
	 * SettlementDetails85.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#BeneficialOwnership
	 * SettlementDetails93.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails90#BeneficialOwnership
	 * SettlementDetails90.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails96#BeneficialOwnership
	 * SettlementDetails96.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#BeneficialOwnership
	 * SettlementDetails97.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails99#BeneficialOwnership
	 * SettlementDetails99.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#BeneficialOwnership
	 * SettlementDetails94.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficialOwnership4Choice#Indicator
	 * BeneficialOwnership4Choice.Indicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficialOwnership4Choice#Proprietary
	 * BeneficialOwnership4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails95#BeneficialOwnership
	 * SettlementDetails95.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails91#BeneficialOwnership
	 * SettlementDetails91.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails92#BeneficialOwnership
	 * SettlementDetails92.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails98#BeneficialOwnership
	 * SettlementDetails98.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails101#BeneficialOwnership
	 * SettlementDetails101.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails105#BeneficialOwnership
	 * SettlementDetails105.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails106#BeneficialOwnership
	 * SettlementDetails106.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails104#BeneficialOwnership
	 * SettlementDetails104.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails111#BeneficialOwnership
	 * SettlementDetails111.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails112#BeneficialOwnership
	 * SettlementDetails112.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails110#BeneficialOwnership
	 * SettlementDetails110.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails108#BeneficialOwnership
	 * SettlementDetails108.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails107#BeneficialOwnership
	 * SettlementDetails107.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficialOwnership5Choice#Indicator
	 * BeneficialOwnership5Choice.Indicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficialOwnership5Choice#Proprietary
	 * BeneficialOwnership5Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails115#BeneficialOwnership
	 * SettlementDetails115.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails117#BeneficialOwnership
	 * SettlementDetails117.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails116#BeneficialOwnership
	 * SettlementDetails116.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails113#BeneficialOwnership
	 * SettlementDetails113.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails128#BeneficialOwnership
	 * SettlementDetails128.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#BeneficialOwnership
	 * SettlementDetails120.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#BeneficialOwnership
	 * SettlementDetails119.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails125#BeneficialOwnership
	 * SettlementDetails125.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails126#BeneficialOwnership
	 * SettlementDetails126.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#BeneficialOwnership
	 * SettlementDetails122.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails127#BeneficialOwnership
	 * SettlementDetails127.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails121#BeneficialOwnership
	 * SettlementDetails121.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails134#BeneficialOwnership
	 * SettlementDetails134.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails137#BeneficialOwnership
	 * SettlementDetails137.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails132#BeneficialOwnership
	 * SettlementDetails132.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails138#BeneficialOwnership
	 * SettlementDetails138.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails130#BeneficialOwnership
	 * SettlementDetails130.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails131#BeneficialOwnership
	 * SettlementDetails131.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails133#BeneficialOwnership
	 * SettlementDetails133.BeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails139#BeneficialOwnership
	 * SettlementDetails139.BeneficialOwnership}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficialOwnershipIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether there is change of beneficial ownership."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute BeneficialOwnershipIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.BeneficialOwnership1Choice.Indicator, com.tools20022.repository.choice.BeneficialOwnership1Choice.Proprietary,
					com.tools20022.repository.msg.SettlementDetails50.BeneficialOwnership, com.tools20022.repository.choice.BeneficialOwnership2Choice.Indicator, com.tools20022.repository.choice.BeneficialOwnership2Choice.Proprietary,
					com.tools20022.repository.msg.SettlementDetails51.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails9.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails17.BeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails30.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails32.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails60.BeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails64.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails3.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails16.BeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails31.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails40.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails62.BeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails63.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails6.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails20.BeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails24.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails33.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails45.BeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails54.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails1.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails19.BeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails22.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails35.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails42.BeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails52.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails8.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails11.BeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails23.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails37.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails44.BeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails53.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails7.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails12.BeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails28.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails38.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails47.BeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails56.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails2.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails13.BeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails27.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails39.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails48.BeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails57.BeneficialOwnership, com.tools20022.repository.choice.BeneficialOwnership3Choice.Indicator, com.tools20022.repository.choice.BeneficialOwnership3Choice.Proprietary,
					com.tools20022.repository.msg.SettlementDetails43.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails10.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails29.BeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails5.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails25.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails26.BeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails65.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails14.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails41.BeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails61.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails59.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails15.BeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails34.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails49.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails58.BeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails36.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails67.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails70.BeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails68.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails69.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails71.BeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails72.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails75.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails73.BeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails74.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails81.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails76.BeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails80.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails78.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails77.BeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails79.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails87.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails83.BeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails86.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails85.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails93.BeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails90.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails96.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails97.BeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails99.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails94.BeneficialOwnership, com.tools20022.repository.choice.BeneficialOwnership4Choice.Indicator,
					com.tools20022.repository.choice.BeneficialOwnership4Choice.Proprietary, com.tools20022.repository.msg.SettlementDetails95.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails91.BeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails92.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails98.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails101.BeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails105.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails106.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails104.BeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails111.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails112.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails110.BeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails108.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails107.BeneficialOwnership, com.tools20022.repository.choice.BeneficialOwnership5Choice.Indicator,
					com.tools20022.repository.choice.BeneficialOwnership5Choice.Proprietary, com.tools20022.repository.msg.SettlementDetails115.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails117.BeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails116.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails113.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails128.BeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails120.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails119.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails125.BeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails126.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails122.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails127.BeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails121.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails134.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails137.BeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails132.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails138.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails130.BeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails131.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails133.BeneficialOwnership, com.tools20022.repository.msg.SettlementDetails139.BeneficialOwnership);
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BeneficialOwnershipIndicator";
			definition = "Specifies whether there is change of beneficial ownership.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Specifies if an instruction is for a market side or a client side
	 * transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MarketClientSideCode
	 * MarketClientSideCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketClientSide1Choice#Code
	 * MarketClientSide1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketClientSide1Choice#Proprietary
	 * MarketClientSide1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails50#MarketClientSide
	 * SettlementDetails50.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketClientSide2Choice#Code
	 * MarketClientSide2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketClientSide2Choice#Proprietary
	 * MarketClientSide2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails51#MarketClientSide
	 * SettlementDetails51.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails9#MarketClientSide
	 * SettlementDetails9.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails17#MarketClientSide
	 * SettlementDetails17.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails30#MarketClientSide
	 * SettlementDetails30.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails32#MarketClientSide
	 * SettlementDetails32.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails60#MarketClientSide
	 * SettlementDetails60.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails64#MarketClientSide
	 * SettlementDetails64.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails3#MarketClientSide
	 * SettlementDetails3.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails16#MarketClientSide
	 * SettlementDetails16.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails31#MarketClientSide
	 * SettlementDetails31.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails40#MarketClientSide
	 * SettlementDetails40.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails62#MarketClientSide
	 * SettlementDetails62.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails63#MarketClientSide
	 * SettlementDetails63.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails6#MarketClientSide
	 * SettlementDetails6.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails20#MarketClientSide
	 * SettlementDetails20.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails24#MarketClientSide
	 * SettlementDetails24.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails33#MarketClientSide
	 * SettlementDetails33.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails45#MarketClientSide
	 * SettlementDetails45.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails54#MarketClientSide
	 * SettlementDetails54.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails1#MarketClientSide
	 * SettlementDetails1.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails19#MarketClientSide
	 * SettlementDetails19.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails22#MarketClientSide
	 * SettlementDetails22.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails35#MarketClientSide
	 * SettlementDetails35.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#MarketClientSide
	 * SettlementDetails42.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails52#MarketClientSide
	 * SettlementDetails52.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails8#MarketClientSide
	 * SettlementDetails8.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails11#MarketClientSide
	 * SettlementDetails11.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails23#MarketClientSide
	 * SettlementDetails23.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails37#MarketClientSide
	 * SettlementDetails37.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails44#MarketClientSide
	 * SettlementDetails44.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails53#MarketClientSide
	 * SettlementDetails53.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails7#MarketClientSide
	 * SettlementDetails7.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails12#MarketClientSide
	 * SettlementDetails12.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails28#MarketClientSide
	 * SettlementDetails28.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails38#MarketClientSide
	 * SettlementDetails38.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails47#MarketClientSide
	 * SettlementDetails47.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails56#MarketClientSide
	 * SettlementDetails56.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails2#MarketClientSide
	 * SettlementDetails2.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails13#MarketClientSide
	 * SettlementDetails13.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails27#MarketClientSide
	 * SettlementDetails27.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails39#MarketClientSide
	 * SettlementDetails39.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails48#MarketClientSide
	 * SettlementDetails48.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails57#MarketClientSide
	 * SettlementDetails57.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketClientSide3Choice#Code
	 * MarketClientSide3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketClientSide3Choice#Proprietary
	 * MarketClientSide3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#MarketClientSide
	 * SettlementDetails43.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails10#MarketClientSide
	 * SettlementDetails10.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails29#MarketClientSide
	 * SettlementDetails29.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails5#MarketClientSide
	 * SettlementDetails5.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails25#MarketClientSide
	 * SettlementDetails25.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails26#MarketClientSide
	 * SettlementDetails26.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails65#MarketClientSide
	 * SettlementDetails65.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails14#MarketClientSide
	 * SettlementDetails14.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails41#MarketClientSide
	 * SettlementDetails41.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails61#MarketClientSide
	 * SettlementDetails61.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails59#MarketClientSide
	 * SettlementDetails59.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails15#MarketClientSide
	 * SettlementDetails15.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails34#MarketClientSide
	 * SettlementDetails34.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails49#MarketClientSide
	 * SettlementDetails49.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails58#MarketClientSide
	 * SettlementDetails58.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails36#MarketClientSide
	 * SettlementDetails36.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#MarketClientSide
	 * SettlementDetails67.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails70#MarketClientSide
	 * SettlementDetails70.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#MarketClientSide
	 * SettlementDetails68.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails69#MarketClientSide
	 * SettlementDetails69.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails71#MarketClientSide
	 * SettlementDetails71.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails72#MarketClientSide
	 * SettlementDetails72.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails75#MarketClientSide
	 * SettlementDetails75.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails73#MarketClientSide
	 * SettlementDetails73.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails74#MarketClientSide
	 * SettlementDetails74.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails81#MarketClientSide
	 * SettlementDetails81.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails76#MarketClientSide
	 * SettlementDetails76.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails80#MarketClientSide
	 * SettlementDetails80.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails78#MarketClientSide
	 * SettlementDetails78.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails77#MarketClientSide
	 * SettlementDetails77.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails79#MarketClientSide
	 * SettlementDetails79.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails87#MarketClientSide
	 * SettlementDetails87.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails83#MarketClientSide
	 * SettlementDetails83.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails86#MarketClientSide
	 * SettlementDetails86.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails85#MarketClientSide
	 * SettlementDetails85.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#MarketClientSide
	 * SettlementDetails93.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails90#MarketClientSide
	 * SettlementDetails90.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails96#MarketClientSide
	 * SettlementDetails96.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#MarketClientSide
	 * SettlementDetails97.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails99#MarketClientSide
	 * SettlementDetails99.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#MarketClientSide
	 * SettlementDetails94.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketClientSide4Choice#Code
	 * MarketClientSide4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketClientSide4Choice#Proprietary
	 * MarketClientSide4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails95#MarketClientSide
	 * SettlementDetails95.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails91#MarketClientSide
	 * SettlementDetails91.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails92#MarketClientSide
	 * SettlementDetails92.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails98#MarketClientSide
	 * SettlementDetails98.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails101#MarketClientSide
	 * SettlementDetails101.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails105#MarketClientSide
	 * SettlementDetails105.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails106#MarketClientSide
	 * SettlementDetails106.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails104#MarketClientSide
	 * SettlementDetails104.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails111#MarketClientSide
	 * SettlementDetails111.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails112#MarketClientSide
	 * SettlementDetails112.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails110#MarketClientSide
	 * SettlementDetails110.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails108#MarketClientSide
	 * SettlementDetails108.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails107#MarketClientSide
	 * SettlementDetails107.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketClientSide5Choice#Code
	 * MarketClientSide5Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketClientSide5Choice#Proprietary
	 * MarketClientSide5Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails115#MarketClientSide
	 * SettlementDetails115.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails117#MarketClientSide
	 * SettlementDetails117.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails116#MarketClientSide
	 * SettlementDetails116.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails113#MarketClientSide
	 * SettlementDetails113.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails128#MarketClientSide
	 * SettlementDetails128.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#MarketClientSide
	 * SettlementDetails120.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#MarketClientSide
	 * SettlementDetails119.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails125#MarketClientSide
	 * SettlementDetails125.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails126#MarketClientSide
	 * SettlementDetails126.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#MarketClientSide
	 * SettlementDetails122.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails127#MarketClientSide
	 * SettlementDetails127.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails121#MarketClientSide
	 * SettlementDetails121.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails134#MarketClientSide
	 * SettlementDetails134.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails137#MarketClientSide
	 * SettlementDetails137.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails132#MarketClientSide
	 * SettlementDetails132.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails138#MarketClientSide
	 * SettlementDetails138.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails130#MarketClientSide
	 * SettlementDetails130.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails131#MarketClientSide
	 * SettlementDetails131.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails133#MarketClientSide
	 * SettlementDetails133.MarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails139#MarketClientSide
	 * SettlementDetails139.MarketClientSide}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketClientSide"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if an instruction is for a market side or a client side transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MarketClientSide = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.MarketClientSide1Choice.Code, com.tools20022.repository.choice.MarketClientSide1Choice.Proprietary,
					com.tools20022.repository.msg.SettlementDetails50.MarketClientSide, com.tools20022.repository.choice.MarketClientSide2Choice.Code, com.tools20022.repository.choice.MarketClientSide2Choice.Proprietary,
					com.tools20022.repository.msg.SettlementDetails51.MarketClientSide, com.tools20022.repository.msg.SettlementDetails9.MarketClientSide, com.tools20022.repository.msg.SettlementDetails17.MarketClientSide,
					com.tools20022.repository.msg.SettlementDetails30.MarketClientSide, com.tools20022.repository.msg.SettlementDetails32.MarketClientSide, com.tools20022.repository.msg.SettlementDetails60.MarketClientSide,
					com.tools20022.repository.msg.SettlementDetails64.MarketClientSide, com.tools20022.repository.msg.SettlementDetails3.MarketClientSide, com.tools20022.repository.msg.SettlementDetails16.MarketClientSide,
					com.tools20022.repository.msg.SettlementDetails31.MarketClientSide, com.tools20022.repository.msg.SettlementDetails40.MarketClientSide, com.tools20022.repository.msg.SettlementDetails62.MarketClientSide,
					com.tools20022.repository.msg.SettlementDetails63.MarketClientSide, com.tools20022.repository.msg.SettlementDetails6.MarketClientSide, com.tools20022.repository.msg.SettlementDetails20.MarketClientSide,
					com.tools20022.repository.msg.SettlementDetails24.MarketClientSide, com.tools20022.repository.msg.SettlementDetails33.MarketClientSide, com.tools20022.repository.msg.SettlementDetails45.MarketClientSide,
					com.tools20022.repository.msg.SettlementDetails54.MarketClientSide, com.tools20022.repository.msg.SettlementDetails1.MarketClientSide, com.tools20022.repository.msg.SettlementDetails19.MarketClientSide,
					com.tools20022.repository.msg.SettlementDetails22.MarketClientSide, com.tools20022.repository.msg.SettlementDetails35.MarketClientSide, com.tools20022.repository.msg.SettlementDetails42.MarketClientSide,
					com.tools20022.repository.msg.SettlementDetails52.MarketClientSide, com.tools20022.repository.msg.SettlementDetails8.MarketClientSide, com.tools20022.repository.msg.SettlementDetails11.MarketClientSide,
					com.tools20022.repository.msg.SettlementDetails23.MarketClientSide, com.tools20022.repository.msg.SettlementDetails37.MarketClientSide, com.tools20022.repository.msg.SettlementDetails44.MarketClientSide,
					com.tools20022.repository.msg.SettlementDetails53.MarketClientSide, com.tools20022.repository.msg.SettlementDetails7.MarketClientSide, com.tools20022.repository.msg.SettlementDetails12.MarketClientSide,
					com.tools20022.repository.msg.SettlementDetails28.MarketClientSide, com.tools20022.repository.msg.SettlementDetails38.MarketClientSide, com.tools20022.repository.msg.SettlementDetails47.MarketClientSide,
					com.tools20022.repository.msg.SettlementDetails56.MarketClientSide, com.tools20022.repository.msg.SettlementDetails2.MarketClientSide, com.tools20022.repository.msg.SettlementDetails13.MarketClientSide,
					com.tools20022.repository.msg.SettlementDetails27.MarketClientSide, com.tools20022.repository.msg.SettlementDetails39.MarketClientSide, com.tools20022.repository.msg.SettlementDetails48.MarketClientSide,
					com.tools20022.repository.msg.SettlementDetails57.MarketClientSide, com.tools20022.repository.choice.MarketClientSide3Choice.Code, com.tools20022.repository.choice.MarketClientSide3Choice.Proprietary,
					com.tools20022.repository.msg.SettlementDetails43.MarketClientSide, com.tools20022.repository.msg.SettlementDetails10.MarketClientSide, com.tools20022.repository.msg.SettlementDetails29.MarketClientSide,
					com.tools20022.repository.msg.SettlementDetails5.MarketClientSide, com.tools20022.repository.msg.SettlementDetails25.MarketClientSide, com.tools20022.repository.msg.SettlementDetails26.MarketClientSide,
					com.tools20022.repository.msg.SettlementDetails65.MarketClientSide, com.tools20022.repository.msg.SettlementDetails14.MarketClientSide, com.tools20022.repository.msg.SettlementDetails41.MarketClientSide,
					com.tools20022.repository.msg.SettlementDetails61.MarketClientSide, com.tools20022.repository.msg.SettlementDetails59.MarketClientSide, com.tools20022.repository.msg.SettlementDetails15.MarketClientSide,
					com.tools20022.repository.msg.SettlementDetails34.MarketClientSide, com.tools20022.repository.msg.SettlementDetails49.MarketClientSide, com.tools20022.repository.msg.SettlementDetails58.MarketClientSide,
					com.tools20022.repository.msg.SettlementDetails36.MarketClientSide, com.tools20022.repository.msg.SettlementDetails67.MarketClientSide, com.tools20022.repository.msg.SettlementDetails70.MarketClientSide,
					com.tools20022.repository.msg.SettlementDetails68.MarketClientSide, com.tools20022.repository.msg.SettlementDetails69.MarketClientSide, com.tools20022.repository.msg.SettlementDetails71.MarketClientSide,
					com.tools20022.repository.msg.SettlementDetails72.MarketClientSide, com.tools20022.repository.msg.SettlementDetails75.MarketClientSide, com.tools20022.repository.msg.SettlementDetails73.MarketClientSide,
					com.tools20022.repository.msg.SettlementDetails74.MarketClientSide, com.tools20022.repository.msg.SettlementDetails81.MarketClientSide, com.tools20022.repository.msg.SettlementDetails76.MarketClientSide,
					com.tools20022.repository.msg.SettlementDetails80.MarketClientSide, com.tools20022.repository.msg.SettlementDetails78.MarketClientSide, com.tools20022.repository.msg.SettlementDetails77.MarketClientSide,
					com.tools20022.repository.msg.SettlementDetails79.MarketClientSide, com.tools20022.repository.msg.SettlementDetails87.MarketClientSide, com.tools20022.repository.msg.SettlementDetails83.MarketClientSide,
					com.tools20022.repository.msg.SettlementDetails86.MarketClientSide, com.tools20022.repository.msg.SettlementDetails85.MarketClientSide, com.tools20022.repository.msg.SettlementDetails93.MarketClientSide,
					com.tools20022.repository.msg.SettlementDetails90.MarketClientSide, com.tools20022.repository.msg.SettlementDetails96.MarketClientSide, com.tools20022.repository.msg.SettlementDetails97.MarketClientSide,
					com.tools20022.repository.msg.SettlementDetails99.MarketClientSide, com.tools20022.repository.msg.SettlementDetails94.MarketClientSide, com.tools20022.repository.choice.MarketClientSide4Choice.Code,
					com.tools20022.repository.choice.MarketClientSide4Choice.Proprietary, com.tools20022.repository.msg.SettlementDetails95.MarketClientSide, com.tools20022.repository.msg.SettlementDetails91.MarketClientSide,
					com.tools20022.repository.msg.SettlementDetails92.MarketClientSide, com.tools20022.repository.msg.SettlementDetails98.MarketClientSide, com.tools20022.repository.msg.SettlementDetails101.MarketClientSide,
					com.tools20022.repository.msg.SettlementDetails105.MarketClientSide, com.tools20022.repository.msg.SettlementDetails106.MarketClientSide, com.tools20022.repository.msg.SettlementDetails104.MarketClientSide,
					com.tools20022.repository.msg.SettlementDetails111.MarketClientSide, com.tools20022.repository.msg.SettlementDetails112.MarketClientSide, com.tools20022.repository.msg.SettlementDetails110.MarketClientSide,
					com.tools20022.repository.msg.SettlementDetails108.MarketClientSide, com.tools20022.repository.msg.SettlementDetails107.MarketClientSide, com.tools20022.repository.choice.MarketClientSide5Choice.Code,
					com.tools20022.repository.choice.MarketClientSide5Choice.Proprietary, com.tools20022.repository.msg.SettlementDetails115.MarketClientSide, com.tools20022.repository.msg.SettlementDetails117.MarketClientSide,
					com.tools20022.repository.msg.SettlementDetails116.MarketClientSide, com.tools20022.repository.msg.SettlementDetails113.MarketClientSide, com.tools20022.repository.msg.SettlementDetails128.MarketClientSide,
					com.tools20022.repository.msg.SettlementDetails120.MarketClientSide, com.tools20022.repository.msg.SettlementDetails119.MarketClientSide, com.tools20022.repository.msg.SettlementDetails125.MarketClientSide,
					com.tools20022.repository.msg.SettlementDetails126.MarketClientSide, com.tools20022.repository.msg.SettlementDetails122.MarketClientSide, com.tools20022.repository.msg.SettlementDetails127.MarketClientSide,
					com.tools20022.repository.msg.SettlementDetails121.MarketClientSide, com.tools20022.repository.msg.SettlementDetails134.MarketClientSide, com.tools20022.repository.msg.SettlementDetails137.MarketClientSide,
					com.tools20022.repository.msg.SettlementDetails132.MarketClientSide, com.tools20022.repository.msg.SettlementDetails138.MarketClientSide, com.tools20022.repository.msg.SettlementDetails130.MarketClientSide,
					com.tools20022.repository.msg.SettlementDetails131.MarketClientSide, com.tools20022.repository.msg.SettlementDetails133.MarketClientSide, com.tools20022.repository.msg.SettlementDetails139.MarketClientSide);
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MarketClientSide";
			definition = "Specifies if an instruction is for a market side or a client side transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> MarketClientSideCode.mmObject();
		}
	};
	/**
	 * Specifies whether the loan and/or collateral is tracked.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails50#Tracking
	 * SettlementDetails50.Tracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails51#Tracking
	 * SettlementDetails51.Tracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails3#Tracking
	 * SettlementDetails3.Tracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails16#Tracking
	 * SettlementDetails16.Tracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails31#Tracking
	 * SettlementDetails31.Tracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails40#Tracking
	 * SettlementDetails40.Tracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails62#Tracking
	 * SettlementDetails62.Tracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails63#Tracking
	 * SettlementDetails63.Tracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails1#Tracking
	 * SettlementDetails1.Tracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails19#Tracking
	 * SettlementDetails19.Tracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails22#Tracking
	 * SettlementDetails22.Tracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails35#Tracking
	 * SettlementDetails35.Tracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#Tracking
	 * SettlementDetails42.Tracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails52#Tracking
	 * SettlementDetails52.Tracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#Tracking
	 * SettlementDetails43.Tracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails65#Tracking
	 * SettlementDetails65.Tracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#Tracking
	 * SettlementDetails67.Tracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#Tracking
	 * SettlementDetails68.Tracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails72#Tracking
	 * SettlementDetails72.Tracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails81#Tracking
	 * SettlementDetails81.Tracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails78#Tracking
	 * SettlementDetails78.Tracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails77#Tracking
	 * SettlementDetails77.Tracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails83#Tracking
	 * SettlementDetails83.Tracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#Tracking
	 * SettlementDetails93.Tracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#Tracking
	 * SettlementDetails97.Tracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#Tracking
	 * SettlementDetails94.Tracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails101#Tracking
	 * SettlementDetails101.Tracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails105#Tracking
	 * SettlementDetails105.Tracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails106#Tracking
	 * SettlementDetails106.Tracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails111#Tracking
	 * SettlementDetails111.Tracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails112#Tracking
	 * SettlementDetails112.Tracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails113#Tracking
	 * SettlementDetails113.Tracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#Tracking
	 * SettlementDetails120.Tracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#Tracking
	 * SettlementDetails119.Tracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#Tracking
	 * SettlementDetails122.Tracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails137#Tracking
	 * SettlementDetails137.Tracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails132#Tracking
	 * SettlementDetails132.Tracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails138#Tracking
	 * SettlementDetails138.Tracking}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tracking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies whether the loan and/or collateral is tracked."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Tracking = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementDetails50.Tracking, com.tools20022.repository.msg.SettlementDetails51.Tracking, com.tools20022.repository.msg.SettlementDetails3.Tracking,
					com.tools20022.repository.msg.SettlementDetails16.Tracking, com.tools20022.repository.msg.SettlementDetails31.Tracking, com.tools20022.repository.msg.SettlementDetails40.Tracking,
					com.tools20022.repository.msg.SettlementDetails62.Tracking, com.tools20022.repository.msg.SettlementDetails63.Tracking, com.tools20022.repository.msg.SettlementDetails1.Tracking,
					com.tools20022.repository.msg.SettlementDetails19.Tracking, com.tools20022.repository.msg.SettlementDetails22.Tracking, com.tools20022.repository.msg.SettlementDetails35.Tracking,
					com.tools20022.repository.msg.SettlementDetails42.Tracking, com.tools20022.repository.msg.SettlementDetails52.Tracking, com.tools20022.repository.msg.SettlementDetails43.Tracking,
					com.tools20022.repository.msg.SettlementDetails65.Tracking, com.tools20022.repository.msg.SettlementDetails67.Tracking, com.tools20022.repository.msg.SettlementDetails68.Tracking,
					com.tools20022.repository.msg.SettlementDetails72.Tracking, com.tools20022.repository.msg.SettlementDetails81.Tracking, com.tools20022.repository.msg.SettlementDetails78.Tracking,
					com.tools20022.repository.msg.SettlementDetails77.Tracking, com.tools20022.repository.msg.SettlementDetails83.Tracking, com.tools20022.repository.msg.SettlementDetails93.Tracking,
					com.tools20022.repository.msg.SettlementDetails97.Tracking, com.tools20022.repository.msg.SettlementDetails94.Tracking, com.tools20022.repository.msg.SettlementDetails101.Tracking,
					com.tools20022.repository.msg.SettlementDetails105.Tracking, com.tools20022.repository.msg.SettlementDetails106.Tracking, com.tools20022.repository.msg.SettlementDetails111.Tracking,
					com.tools20022.repository.msg.SettlementDetails112.Tracking, com.tools20022.repository.msg.SettlementDetails113.Tracking, com.tools20022.repository.msg.SettlementDetails120.Tracking,
					com.tools20022.repository.msg.SettlementDetails119.Tracking, com.tools20022.repository.msg.SettlementDetails122.Tracking, com.tools20022.repository.msg.SettlementDetails137.Tracking,
					com.tools20022.repository.msg.SettlementDetails132.Tracking, com.tools20022.repository.msg.SettlementDetails138.Tracking);
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Tracking";
			definition = "Specifies whether the loan and/or collateral is tracked.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Specifies whether physical settlement may be executed using a letter of
	 * guarantee or if the physical certificates should be used.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LetterOfGuarantee1Choice#Indicator
	 * LetterOfGuarantee1Choice.Indicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LetterOfGuarantee1Choice#Proprietary
	 * LetterOfGuarantee1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails50#LetterOfGuarantee
	 * SettlementDetails50.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LetterOfGuarantee2Choice#Indicator
	 * LetterOfGuarantee2Choice.Indicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LetterOfGuarantee2Choice#Proprietary
	 * LetterOfGuarantee2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails51#LetterOfGuarantee
	 * SettlementDetails51.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails6#LetterOfGuarantee
	 * SettlementDetails6.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails20#LetterOfGuarantee
	 * SettlementDetails20.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails24#LetterOfGuarantee
	 * SettlementDetails24.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails33#LetterOfGuarantee
	 * SettlementDetails33.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails45#LetterOfGuarantee
	 * SettlementDetails45.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails54#LetterOfGuarantee
	 * SettlementDetails54.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails1#LetterOfGuarantee
	 * SettlementDetails1.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails19#LetterOfGuarantee
	 * SettlementDetails19.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails22#LetterOfGuarantee
	 * SettlementDetails22.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails35#LetterOfGuarantee
	 * SettlementDetails35.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#LetterOfGuarantee
	 * SettlementDetails42.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails52#LetterOfGuarantee
	 * SettlementDetails52.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails8#LetterOfGuarantee
	 * SettlementDetails8.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails11#LetterOfGuarantee
	 * SettlementDetails11.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails23#LetterOfGuarantee
	 * SettlementDetails23.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails37#LetterOfGuarantee
	 * SettlementDetails37.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails44#LetterOfGuarantee
	 * SettlementDetails44.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails53#LetterOfGuarantee
	 * SettlementDetails53.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails7#LetterOfGuarantee
	 * SettlementDetails7.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails12#LetterOfGuarantee
	 * SettlementDetails12.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails28#LetterOfGuarantee
	 * SettlementDetails28.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails38#LetterOfGuarantee
	 * SettlementDetails38.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails47#LetterOfGuarantee
	 * SettlementDetails47.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails56#LetterOfGuarantee
	 * SettlementDetails56.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails2#LetterOfGuarantee
	 * SettlementDetails2.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails13#LetterOfGuarantee
	 * SettlementDetails13.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails27#LetterOfGuarantee
	 * SettlementDetails27.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails39#LetterOfGuarantee
	 * SettlementDetails39.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails48#LetterOfGuarantee
	 * SettlementDetails48.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails57#LetterOfGuarantee
	 * SettlementDetails57.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LetterOfGuarantee3Choice#Indicator
	 * LetterOfGuarantee3Choice.Indicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LetterOfGuarantee3Choice#Proprietary
	 * LetterOfGuarantee3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#LetterOfGuarantee
	 * SettlementDetails43.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails5#LetterOfGuarantee
	 * SettlementDetails5.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails26#LetterOfGuarantee
	 * SettlementDetails26.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails15#LetterOfGuarantee
	 * SettlementDetails15.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails36#LetterOfGuarantee
	 * SettlementDetails36.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails66#LetterOfGuarantee
	 * SettlementDetails66.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#LetterOfGuarantee
	 * SettlementDetails67.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails70#LetterOfGuarantee
	 * SettlementDetails70.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#LetterOfGuarantee
	 * SettlementDetails68.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails69#LetterOfGuarantee
	 * SettlementDetails69.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails75#LetterOfGuarantee
	 * SettlementDetails75.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails74#LetterOfGuarantee
	 * SettlementDetails74.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails81#LetterOfGuarantee
	 * SettlementDetails81.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails80#LetterOfGuarantee
	 * SettlementDetails80.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails87#LetterOfGuarantee
	 * SettlementDetails87.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails83#LetterOfGuarantee
	 * SettlementDetails83.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails86#LetterOfGuarantee
	 * SettlementDetails86.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails85#LetterOfGuarantee
	 * SettlementDetails85.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#LetterOfGuarantee
	 * SettlementDetails93.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails90#LetterOfGuarantee
	 * SettlementDetails90.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#LetterOfGuarantee
	 * SettlementDetails94.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails95#LetterOfGuarantee
	 * SettlementDetails95.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails91#LetterOfGuarantee
	 * SettlementDetails91.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LetterOfGuarantee4Choice#Indicator
	 * LetterOfGuarantee4Choice.Indicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LetterOfGuarantee4Choice#Proprietary
	 * LetterOfGuarantee4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails92#LetterOfGuarantee
	 * SettlementDetails92.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails101#LetterOfGuarantee
	 * SettlementDetails101.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails111#LetterOfGuarantee
	 * SettlementDetails111.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails112#LetterOfGuarantee
	 * SettlementDetails112.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails110#LetterOfGuarantee
	 * SettlementDetails110.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails115#LetterOfGuarantee
	 * SettlementDetails115.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LetterOfGuarantee5Choice#Indicator
	 * LetterOfGuarantee5Choice.Indicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LetterOfGuarantee5Choice#Proprietary
	 * LetterOfGuarantee5Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails117#LetterOfGuarantee
	 * SettlementDetails117.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails116#LetterOfGuarantee
	 * SettlementDetails116.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails113#LetterOfGuarantee
	 * SettlementDetails113.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails128#LetterOfGuarantee
	 * SettlementDetails128.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#LetterOfGuarantee
	 * SettlementDetails120.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#LetterOfGuarantee
	 * SettlementDetails119.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails126#LetterOfGuarantee
	 * SettlementDetails126.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#LetterOfGuarantee
	 * SettlementDetails122.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails127#LetterOfGuarantee
	 * SettlementDetails127.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails121#LetterOfGuarantee
	 * SettlementDetails121.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails134#LetterOfGuarantee
	 * SettlementDetails134.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails137#LetterOfGuarantee
	 * SettlementDetails137.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails132#LetterOfGuarantee
	 * SettlementDetails132.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails138#LetterOfGuarantee
	 * SettlementDetails138.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails130#LetterOfGuarantee
	 * SettlementDetails130.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails133#LetterOfGuarantee
	 * SettlementDetails133.LetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails139#LetterOfGuarantee
	 * SettlementDetails139.LetterOfGuarantee}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LetterOfGuarantee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether physical settlement may be executed using a letter of guarantee or if the physical certificates should be used."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute LetterOfGuarantee = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.LetterOfGuarantee1Choice.Indicator, com.tools20022.repository.choice.LetterOfGuarantee1Choice.Proprietary,
					com.tools20022.repository.msg.SettlementDetails50.LetterOfGuarantee, com.tools20022.repository.choice.LetterOfGuarantee2Choice.Indicator, com.tools20022.repository.choice.LetterOfGuarantee2Choice.Proprietary,
					com.tools20022.repository.msg.SettlementDetails51.LetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails6.LetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails20.LetterOfGuarantee,
					com.tools20022.repository.msg.SettlementDetails24.LetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails33.LetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails45.LetterOfGuarantee,
					com.tools20022.repository.msg.SettlementDetails54.LetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails1.LetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails19.LetterOfGuarantee,
					com.tools20022.repository.msg.SettlementDetails22.LetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails35.LetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails42.LetterOfGuarantee,
					com.tools20022.repository.msg.SettlementDetails52.LetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails8.LetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails11.LetterOfGuarantee,
					com.tools20022.repository.msg.SettlementDetails23.LetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails37.LetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails44.LetterOfGuarantee,
					com.tools20022.repository.msg.SettlementDetails53.LetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails7.LetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails12.LetterOfGuarantee,
					com.tools20022.repository.msg.SettlementDetails28.LetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails38.LetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails47.LetterOfGuarantee,
					com.tools20022.repository.msg.SettlementDetails56.LetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails2.LetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails13.LetterOfGuarantee,
					com.tools20022.repository.msg.SettlementDetails27.LetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails39.LetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails48.LetterOfGuarantee,
					com.tools20022.repository.msg.SettlementDetails57.LetterOfGuarantee, com.tools20022.repository.choice.LetterOfGuarantee3Choice.Indicator, com.tools20022.repository.choice.LetterOfGuarantee3Choice.Proprietary,
					com.tools20022.repository.msg.SettlementDetails43.LetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails5.LetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails26.LetterOfGuarantee,
					com.tools20022.repository.msg.SettlementDetails15.LetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails36.LetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails66.LetterOfGuarantee,
					com.tools20022.repository.msg.SettlementDetails67.LetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails70.LetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails68.LetterOfGuarantee,
					com.tools20022.repository.msg.SettlementDetails69.LetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails75.LetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails74.LetterOfGuarantee,
					com.tools20022.repository.msg.SettlementDetails81.LetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails80.LetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails87.LetterOfGuarantee,
					com.tools20022.repository.msg.SettlementDetails83.LetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails86.LetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails85.LetterOfGuarantee,
					com.tools20022.repository.msg.SettlementDetails93.LetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails90.LetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails94.LetterOfGuarantee,
					com.tools20022.repository.msg.SettlementDetails95.LetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails91.LetterOfGuarantee, com.tools20022.repository.choice.LetterOfGuarantee4Choice.Indicator,
					com.tools20022.repository.choice.LetterOfGuarantee4Choice.Proprietary, com.tools20022.repository.msg.SettlementDetails92.LetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails101.LetterOfGuarantee,
					com.tools20022.repository.msg.SettlementDetails111.LetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails112.LetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails110.LetterOfGuarantee,
					com.tools20022.repository.msg.SettlementDetails115.LetterOfGuarantee, com.tools20022.repository.choice.LetterOfGuarantee5Choice.Indicator, com.tools20022.repository.choice.LetterOfGuarantee5Choice.Proprietary,
					com.tools20022.repository.msg.SettlementDetails117.LetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails116.LetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails113.LetterOfGuarantee,
					com.tools20022.repository.msg.SettlementDetails128.LetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails120.LetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails119.LetterOfGuarantee,
					com.tools20022.repository.msg.SettlementDetails126.LetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails122.LetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails127.LetterOfGuarantee,
					com.tools20022.repository.msg.SettlementDetails121.LetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails134.LetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails137.LetterOfGuarantee,
					com.tools20022.repository.msg.SettlementDetails132.LetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails138.LetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails130.LetterOfGuarantee,
					com.tools20022.repository.msg.SettlementDetails133.LetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails139.LetterOfGuarantee);
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LetterOfGuarantee";
			definition = "Specifies whether physical settlement may be executed using a letter of guarantee or if the physical certificates should be used.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Specifies whether securities should be included in the pool of securities
	 * eligible for collateral purposes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails50#EligibleForCollateral
	 * SettlementDetails50.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails51#EligibleForCollateral
	 * SettlementDetails51.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption5#EligibleForCollateralIndicator
	 * CorporateActionOption5.EligibleForCollateralIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption13#EligibleForCollateralIndicator
	 * CorporateActionOption13.EligibleForCollateralIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption25#EligibleForCollateralIndicator
	 * CorporateActionOption25.EligibleForCollateralIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption30#EligibleForCollateralIndicator
	 * CorporateActionOption30.EligibleForCollateralIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption38#EligibleForCollateralIndicator
	 * CorporateActionOption38.EligibleForCollateralIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption47#EligibleForCollateralIndicator
	 * CorporateActionOption47.EligibleForCollateralIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption57#EligibleForCollateralIndicator
	 * CorporateActionOption57.EligibleForCollateralIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption58#EligibleForCollateralIndicator
	 * CorporateActionOption58.EligibleForCollateralIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails9#EligibleForCollateral
	 * SettlementDetails9.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails17#EligibleForCollateral
	 * SettlementDetails17.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails30#EligibleForCollateral
	 * SettlementDetails30.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails32#EligibleForCollateral
	 * SettlementDetails32.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails60#EligibleForCollateral
	 * SettlementDetails60.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails64#EligibleForCollateral
	 * SettlementDetails64.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails3#EligibleForCollateral
	 * SettlementDetails3.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails16#EligibleForCollateral
	 * SettlementDetails16.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails31#EligibleForCollateral
	 * SettlementDetails31.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails40#EligibleForCollateral
	 * SettlementDetails40.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails62#EligibleForCollateral
	 * SettlementDetails62.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails63#EligibleForCollateral
	 * SettlementDetails63.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails6#EligibleForCollateral
	 * SettlementDetails6.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails20#EligibleForCollateral
	 * SettlementDetails20.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails24#EligibleForCollateral
	 * SettlementDetails24.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails33#EligibleForCollateral
	 * SettlementDetails33.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails45#EligibleForCollateral
	 * SettlementDetails45.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails54#EligibleForCollateral
	 * SettlementDetails54.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails1#EligibleForCollateral
	 * SettlementDetails1.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails19#EligibleForCollateral
	 * SettlementDetails19.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails22#EligibleForCollateral
	 * SettlementDetails22.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails35#EligibleForCollateral
	 * SettlementDetails35.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#EligibleForCollateral
	 * SettlementDetails42.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails52#EligibleForCollateral
	 * SettlementDetails52.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails8#EligibleForCollateral
	 * SettlementDetails8.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails11#EligibleForCollateral
	 * SettlementDetails11.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails23#EligibleForCollateral
	 * SettlementDetails23.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails37#EligibleForCollateral
	 * SettlementDetails37.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails44#EligibleForCollateral
	 * SettlementDetails44.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails53#EligibleForCollateral
	 * SettlementDetails53.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#EligibleForCollateral
	 * SettlementDetails43.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails10#EligibleForCollateral
	 * SettlementDetails10.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails29#EligibleForCollateral
	 * SettlementDetails29.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails26#EligibleForCollateral
	 * SettlementDetails26.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails65#EligibleForCollateral
	 * SettlementDetails65.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails14#EligibleForCollateral
	 * SettlementDetails14.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails41#EligibleForCollateral
	 * SettlementDetails41.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails61#EligibleForCollateral
	 * SettlementDetails61.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails59#EligibleForCollateral
	 * SettlementDetails59.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails36#EligibleForCollateral
	 * SettlementDetails36.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#EligibleForCollateral
	 * SettlementDetails67.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails70#EligibleForCollateral
	 * SettlementDetails70.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#EligibleForCollateral
	 * SettlementDetails68.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails69#EligibleForCollateral
	 * SettlementDetails69.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails71#EligibleForCollateral
	 * SettlementDetails71.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails72#EligibleForCollateral
	 * SettlementDetails72.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails73#EligibleForCollateral
	 * SettlementDetails73.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption103#EligibleForCollateralIndicator
	 * CorporateActionOption103.EligibleForCollateralIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption107#EligibleForCollateralIndicator
	 * CorporateActionOption107.EligibleForCollateralIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails81#EligibleForCollateral
	 * SettlementDetails81.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails76#EligibleForCollateral
	 * SettlementDetails76.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails80#EligibleForCollateral
	 * SettlementDetails80.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails78#EligibleForCollateral
	 * SettlementDetails78.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails77#EligibleForCollateral
	 * SettlementDetails77.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails79#EligibleForCollateral
	 * SettlementDetails79.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails83#EligibleForCollateral
	 * SettlementDetails83.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails85#EligibleForCollateral
	 * SettlementDetails85.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#EligibleForCollateral
	 * SettlementDetails93.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails90#EligibleForCollateral
	 * SettlementDetails90.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails96#EligibleForCollateral
	 * SettlementDetails96.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#EligibleForCollateral
	 * SettlementDetails97.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#EligibleForCollateral
	 * SettlementDetails94.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails95#EligibleForCollateral
	 * SettlementDetails95.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails98#EligibleForCollateral
	 * SettlementDetails98.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption118#EligibleForCollateralIndicator
	 * CorporateActionOption118.EligibleForCollateralIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails101#EligibleForCollateral
	 * SettlementDetails101.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption123#EligibleForCollateralIndicator
	 * CorporateActionOption123.EligibleForCollateralIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails105#EligibleForCollateral
	 * SettlementDetails105.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails106#EligibleForCollateral
	 * SettlementDetails106.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails104#EligibleForCollateral
	 * SettlementDetails104.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails111#EligibleForCollateral
	 * SettlementDetails111.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails112#EligibleForCollateral
	 * SettlementDetails112.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails110#EligibleForCollateral
	 * SettlementDetails110.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails107#EligibleForCollateral
	 * SettlementDetails107.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails115#EligibleForCollateral
	 * SettlementDetails115.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails113#EligibleForCollateral
	 * SettlementDetails113.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption131#EligibleForCollateralIndicator
	 * CorporateActionOption131.EligibleForCollateralIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails128#EligibleForCollateral
	 * SettlementDetails128.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#EligibleForCollateral
	 * SettlementDetails120.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#EligibleForCollateral
	 * SettlementDetails119.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#EligibleForCollateral
	 * SettlementDetails122.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails121#EligibleForCollateral
	 * SettlementDetails121.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption134#EligibleForCollateralIndicator
	 * CorporateActionOption134.EligibleForCollateralIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails134#EligibleForCollateral
	 * SettlementDetails134.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails137#EligibleForCollateral
	 * SettlementDetails137.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails132#EligibleForCollateral
	 * SettlementDetails132.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails138#EligibleForCollateral
	 * SettlementDetails138.EligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails133#EligibleForCollateral
	 * SettlementDetails133.EligibleForCollateral}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EligibleForCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether securities should be included in the pool of securities eligible for collateral purposes."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute EligibleForCollateral = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementDetails50.EligibleForCollateral, com.tools20022.repository.msg.SettlementDetails51.EligibleForCollateral,
					com.tools20022.repository.msg.CorporateActionOption5.EligibleForCollateralIndicator, com.tools20022.repository.msg.CorporateActionOption13.EligibleForCollateralIndicator,
					com.tools20022.repository.msg.CorporateActionOption25.EligibleForCollateralIndicator, com.tools20022.repository.msg.CorporateActionOption30.EligibleForCollateralIndicator,
					com.tools20022.repository.msg.CorporateActionOption38.EligibleForCollateralIndicator, com.tools20022.repository.msg.CorporateActionOption47.EligibleForCollateralIndicator,
					com.tools20022.repository.msg.CorporateActionOption57.EligibleForCollateralIndicator, com.tools20022.repository.msg.CorporateActionOption58.EligibleForCollateralIndicator,
					com.tools20022.repository.msg.SettlementDetails9.EligibleForCollateral, com.tools20022.repository.msg.SettlementDetails17.EligibleForCollateral, com.tools20022.repository.msg.SettlementDetails30.EligibleForCollateral,
					com.tools20022.repository.msg.SettlementDetails32.EligibleForCollateral, com.tools20022.repository.msg.SettlementDetails60.EligibleForCollateral, com.tools20022.repository.msg.SettlementDetails64.EligibleForCollateral,
					com.tools20022.repository.msg.SettlementDetails3.EligibleForCollateral, com.tools20022.repository.msg.SettlementDetails16.EligibleForCollateral, com.tools20022.repository.msg.SettlementDetails31.EligibleForCollateral,
					com.tools20022.repository.msg.SettlementDetails40.EligibleForCollateral, com.tools20022.repository.msg.SettlementDetails62.EligibleForCollateral, com.tools20022.repository.msg.SettlementDetails63.EligibleForCollateral,
					com.tools20022.repository.msg.SettlementDetails6.EligibleForCollateral, com.tools20022.repository.msg.SettlementDetails20.EligibleForCollateral, com.tools20022.repository.msg.SettlementDetails24.EligibleForCollateral,
					com.tools20022.repository.msg.SettlementDetails33.EligibleForCollateral, com.tools20022.repository.msg.SettlementDetails45.EligibleForCollateral, com.tools20022.repository.msg.SettlementDetails54.EligibleForCollateral,
					com.tools20022.repository.msg.SettlementDetails1.EligibleForCollateral, com.tools20022.repository.msg.SettlementDetails19.EligibleForCollateral, com.tools20022.repository.msg.SettlementDetails22.EligibleForCollateral,
					com.tools20022.repository.msg.SettlementDetails35.EligibleForCollateral, com.tools20022.repository.msg.SettlementDetails42.EligibleForCollateral, com.tools20022.repository.msg.SettlementDetails52.EligibleForCollateral,
					com.tools20022.repository.msg.SettlementDetails8.EligibleForCollateral, com.tools20022.repository.msg.SettlementDetails11.EligibleForCollateral, com.tools20022.repository.msg.SettlementDetails23.EligibleForCollateral,
					com.tools20022.repository.msg.SettlementDetails37.EligibleForCollateral, com.tools20022.repository.msg.SettlementDetails44.EligibleForCollateral, com.tools20022.repository.msg.SettlementDetails53.EligibleForCollateral,
					com.tools20022.repository.msg.SettlementDetails43.EligibleForCollateral, com.tools20022.repository.msg.SettlementDetails10.EligibleForCollateral, com.tools20022.repository.msg.SettlementDetails29.EligibleForCollateral,
					com.tools20022.repository.msg.SettlementDetails26.EligibleForCollateral, com.tools20022.repository.msg.SettlementDetails65.EligibleForCollateral, com.tools20022.repository.msg.SettlementDetails14.EligibleForCollateral,
					com.tools20022.repository.msg.SettlementDetails41.EligibleForCollateral, com.tools20022.repository.msg.SettlementDetails61.EligibleForCollateral, com.tools20022.repository.msg.SettlementDetails59.EligibleForCollateral,
					com.tools20022.repository.msg.SettlementDetails36.EligibleForCollateral, com.tools20022.repository.msg.SettlementDetails67.EligibleForCollateral, com.tools20022.repository.msg.SettlementDetails70.EligibleForCollateral,
					com.tools20022.repository.msg.SettlementDetails68.EligibleForCollateral, com.tools20022.repository.msg.SettlementDetails69.EligibleForCollateral, com.tools20022.repository.msg.SettlementDetails71.EligibleForCollateral,
					com.tools20022.repository.msg.SettlementDetails72.EligibleForCollateral, com.tools20022.repository.msg.SettlementDetails73.EligibleForCollateral,
					com.tools20022.repository.msg.CorporateActionOption103.EligibleForCollateralIndicator, com.tools20022.repository.msg.CorporateActionOption107.EligibleForCollateralIndicator,
					com.tools20022.repository.msg.SettlementDetails81.EligibleForCollateral, com.tools20022.repository.msg.SettlementDetails76.EligibleForCollateral, com.tools20022.repository.msg.SettlementDetails80.EligibleForCollateral,
					com.tools20022.repository.msg.SettlementDetails78.EligibleForCollateral, com.tools20022.repository.msg.SettlementDetails77.EligibleForCollateral, com.tools20022.repository.msg.SettlementDetails79.EligibleForCollateral,
					com.tools20022.repository.msg.SettlementDetails83.EligibleForCollateral, com.tools20022.repository.msg.SettlementDetails85.EligibleForCollateral, com.tools20022.repository.msg.SettlementDetails93.EligibleForCollateral,
					com.tools20022.repository.msg.SettlementDetails90.EligibleForCollateral, com.tools20022.repository.msg.SettlementDetails96.EligibleForCollateral, com.tools20022.repository.msg.SettlementDetails97.EligibleForCollateral,
					com.tools20022.repository.msg.SettlementDetails94.EligibleForCollateral, com.tools20022.repository.msg.SettlementDetails95.EligibleForCollateral, com.tools20022.repository.msg.SettlementDetails98.EligibleForCollateral,
					com.tools20022.repository.msg.CorporateActionOption118.EligibleForCollateralIndicator, com.tools20022.repository.msg.SettlementDetails101.EligibleForCollateral,
					com.tools20022.repository.msg.CorporateActionOption123.EligibleForCollateralIndicator, com.tools20022.repository.msg.SettlementDetails105.EligibleForCollateral,
					com.tools20022.repository.msg.SettlementDetails106.EligibleForCollateral, com.tools20022.repository.msg.SettlementDetails104.EligibleForCollateral,
					com.tools20022.repository.msg.SettlementDetails111.EligibleForCollateral, com.tools20022.repository.msg.SettlementDetails112.EligibleForCollateral,
					com.tools20022.repository.msg.SettlementDetails110.EligibleForCollateral, com.tools20022.repository.msg.SettlementDetails107.EligibleForCollateral,
					com.tools20022.repository.msg.SettlementDetails115.EligibleForCollateral, com.tools20022.repository.msg.SettlementDetails113.EligibleForCollateral,
					com.tools20022.repository.msg.CorporateActionOption131.EligibleForCollateralIndicator, com.tools20022.repository.msg.SettlementDetails128.EligibleForCollateral,
					com.tools20022.repository.msg.SettlementDetails120.EligibleForCollateral, com.tools20022.repository.msg.SettlementDetails119.EligibleForCollateral,
					com.tools20022.repository.msg.SettlementDetails122.EligibleForCollateral, com.tools20022.repository.msg.SettlementDetails121.EligibleForCollateral,
					com.tools20022.repository.msg.CorporateActionOption134.EligibleForCollateralIndicator, com.tools20022.repository.msg.SettlementDetails134.EligibleForCollateral,
					com.tools20022.repository.msg.SettlementDetails137.EligibleForCollateral, com.tools20022.repository.msg.SettlementDetails132.EligibleForCollateral,
					com.tools20022.repository.msg.SettlementDetails138.EligibleForCollateral, com.tools20022.repository.msg.SettlementDetails133.EligibleForCollateral);
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EligibleForCollateral";
			definition = "Specifies whether securities should be included in the pool of securities eligible for collateral purposes.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether the net proceeds include interest accrued on the
	 * financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection32#AccruedInterestIndicator
	 * AmountAndDirection32.AccruedInterestIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection33#AccruedInterestIndicator
	 * AmountAndDirection33.AccruedInterestIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction3#AccruedInterestIndicator
	 * CorporateAction3.AccruedInterestIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction4#AccruedInterestIndicator
	 * CorporateAction4.AccruedInterestIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5#AccruedInterestIndicator
	 * CorporateAction5.AccruedInterestIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction6#AccruedInterestIndicator
	 * CorporateAction6.AccruedInterestIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction7#AccruedInterestIndicator
	 * CorporateAction7.AccruedInterestIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction8#AccruedInterestIndicator
	 * CorporateAction8.AccruedInterestIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10#AccruedInterestIndicator
	 * CorporateAction10.AccruedInterestIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction11#AccruedInterestIndicator
	 * CorporateAction11.AccruedInterestIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection2#AccruedInterestIndicator
	 * AmountAndDirection2.AccruedInterestIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection16#AccruedInterestIndicator
	 * AmountAndDirection16.AccruedInterestIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection28#AccruedInterestIndicator
	 * AmountAndDirection28.AccruedInterestIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection36#AccruedInterestIndicator
	 * AmountAndDirection36.AccruedInterestIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection37#AccruedInterestIndicator
	 * AmountAndDirection37.AccruedInterestIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#AccruedInterestIndicator
	 * CorporateAction12.AccruedInterestIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction17#AccruedInterestIndicator
	 * CorporateAction17.AccruedInterestIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection38#AccruedInterestIndicator
	 * AmountAndDirection38.AccruedInterestIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection40#AccruedInterestIndicator
	 * AmountAndDirection40.AccruedInterestIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection46#AccruedInterestIndicator
	 * AmountAndDirection46.AccruedInterestIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection45#AccruedInterestIndicator
	 * AmountAndDirection45.AccruedInterestIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction31#AccruedInterestIndicator
	 * CorporateAction31.AccruedInterestIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction40#AccruedInterestIndicator
	 * CorporateAction40.AccruedInterestIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection60#AccruedInterestIndicator
	 * AmountAndDirection60.AccruedInterestIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection85#AccruedInterestIndicator
	 * AmountAndDirection85.AccruedInterestIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccruedInterestIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the net proceeds include interest accrued on the financial instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AccruedInterestIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AmountAndDirection32.AccruedInterestIndicator, com.tools20022.repository.msg.AmountAndDirection33.AccruedInterestIndicator,
					com.tools20022.repository.msg.CorporateAction3.AccruedInterestIndicator, com.tools20022.repository.msg.CorporateAction4.AccruedInterestIndicator, com.tools20022.repository.msg.CorporateAction5.AccruedInterestIndicator,
					com.tools20022.repository.msg.CorporateAction6.AccruedInterestIndicator, com.tools20022.repository.msg.CorporateAction7.AccruedInterestIndicator, com.tools20022.repository.msg.CorporateAction8.AccruedInterestIndicator,
					com.tools20022.repository.msg.CorporateAction10.AccruedInterestIndicator, com.tools20022.repository.msg.CorporateAction11.AccruedInterestIndicator,
					com.tools20022.repository.msg.AmountAndDirection2.AccruedInterestIndicator, com.tools20022.repository.msg.AmountAndDirection16.AccruedInterestIndicator,
					com.tools20022.repository.msg.AmountAndDirection28.AccruedInterestIndicator, com.tools20022.repository.msg.AmountAndDirection36.AccruedInterestIndicator,
					com.tools20022.repository.msg.AmountAndDirection37.AccruedInterestIndicator, com.tools20022.repository.msg.CorporateAction12.AccruedInterestIndicator,
					com.tools20022.repository.msg.CorporateAction17.AccruedInterestIndicator, com.tools20022.repository.msg.AmountAndDirection38.AccruedInterestIndicator,
					com.tools20022.repository.msg.AmountAndDirection40.AccruedInterestIndicator, com.tools20022.repository.msg.AmountAndDirection46.AccruedInterestIndicator,
					com.tools20022.repository.msg.AmountAndDirection45.AccruedInterestIndicator, com.tools20022.repository.msg.CorporateAction31.AccruedInterestIndicator,
					com.tools20022.repository.msg.CorporateAction40.AccruedInterestIndicator, com.tools20022.repository.msg.AmountAndDirection60.AccruedInterestIndicator,
					com.tools20022.repository.msg.AmountAndDirection85.AccruedInterestIndicator);
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccruedInterestIndicator";
			definition = "Indicates whether the net proceeds include interest accrued on the financial instrument.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Pre-confirmation of the cash transfer pending the securities transfer, or
	 * vice versa.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PreConfirmationCode
	 * PreConfirmationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters2#PreConfirmation
	 * AdditionalParameters2.PreConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters6#PreConfirmation
	 * AdditionalParameters6.PreConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters12#PreConfirmation
	 * AdditionalParameters12.PreConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters13#PreConfirmation
	 * AdditionalParameters13.PreConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters18#PreConfirmation
	 * AdditionalParameters18.PreConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters19#PreConfirmation
	 * AdditionalParameters19.PreConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters17#PreConfirmation
	 * AdditionalParameters17.PreConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters20#PreConfirmation
	 * AdditionalParameters20.PreConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters4#PreConfirmation
	 * AdditionalParameters4.PreConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters5#PreConfirmation
	 * AdditionalParameters5.PreConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters14#PreConfirmation
	 * AdditionalParameters14.PreConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters15#PreConfirmation
	 * AdditionalParameters15.PreConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters23#PreConfirmation
	 * AdditionalParameters23.PreConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters24#PreConfirmation
	 * AdditionalParameters24.PreConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters22#PreConfirmation
	 * AdditionalParameters22.PreConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters26#PreConfirmation
	 * AdditionalParameters26.PreConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters28#PreConfirmation
	 * AdditionalParameters28.PreConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters27#PreConfirmation
	 * AdditionalParameters27.PreConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters29#PreConfirmation
	 * AdditionalParameters29.PreConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters30#PreConfirmation
	 * AdditionalParameters30.PreConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters31#PreConfirmation
	 * AdditionalParameters31.PreConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters32#PreConfirmation
	 * AdditionalParameters32.PreConfirmation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreConfirmation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Pre-confirmation of the cash transfer pending the securities transfer, or vice versa."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PreConfirmation = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AdditionalParameters2.PreConfirmation, com.tools20022.repository.msg.AdditionalParameters6.PreConfirmation,
					com.tools20022.repository.msg.AdditionalParameters12.PreConfirmation, com.tools20022.repository.msg.AdditionalParameters13.PreConfirmation, com.tools20022.repository.msg.AdditionalParameters18.PreConfirmation,
					com.tools20022.repository.msg.AdditionalParameters19.PreConfirmation, com.tools20022.repository.msg.AdditionalParameters17.PreConfirmation, com.tools20022.repository.msg.AdditionalParameters20.PreConfirmation,
					com.tools20022.repository.msg.AdditionalParameters4.PreConfirmation, com.tools20022.repository.msg.AdditionalParameters5.PreConfirmation, com.tools20022.repository.msg.AdditionalParameters14.PreConfirmation,
					com.tools20022.repository.msg.AdditionalParameters15.PreConfirmation, com.tools20022.repository.msg.AdditionalParameters23.PreConfirmation, com.tools20022.repository.msg.AdditionalParameters24.PreConfirmation,
					com.tools20022.repository.msg.AdditionalParameters22.PreConfirmation, com.tools20022.repository.msg.AdditionalParameters26.PreConfirmation, com.tools20022.repository.msg.AdditionalParameters28.PreConfirmation,
					com.tools20022.repository.msg.AdditionalParameters27.PreConfirmation, com.tools20022.repository.msg.AdditionalParameters29.PreConfirmation, com.tools20022.repository.msg.AdditionalParameters30.PreConfirmation,
					com.tools20022.repository.msg.AdditionalParameters31.PreConfirmation, com.tools20022.repository.msg.AdditionalParameters32.PreConfirmation);
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PreConfirmation";
			definition = "Pre-confirmation of the cash transfer pending the securities transfer, or vice versa.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PreConfirmationCode.mmObject();
		}
	};
	/**
	 * Specifies whether the settlement transaction is to be settled through an
	 * RTGS or a non RTGS system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesRTGS1Choice#Indicator
	 * SecuritiesRTGS1Choice.Indicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesRTGS1Choice#Proprietary
	 * SecuritiesRTGS1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails9#SecuritiesRTGS
	 * SettlementDetails9.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesRTGS2Choice#Indicator
	 * SecuritiesRTGS2Choice.Indicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesRTGS2Choice#Proprietary
	 * SecuritiesRTGS2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails17#SecuritiesRTGS
	 * SettlementDetails17.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails30#SecuritiesRTGS
	 * SettlementDetails30.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails32#SecuritiesRTGS
	 * SettlementDetails32.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails60#SecuritiesRTGS
	 * SettlementDetails60.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails64#SecuritiesRTGS
	 * SettlementDetails64.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails3#SecuritiesRTGS
	 * SettlementDetails3.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails16#SecuritiesRTGS
	 * SettlementDetails16.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails31#SecuritiesRTGS
	 * SettlementDetails31.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails40#SecuritiesRTGS
	 * SettlementDetails40.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails62#SecuritiesRTGS
	 * SettlementDetails62.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails63#SecuritiesRTGS
	 * SettlementDetails63.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails1#SecuritiesRTGS
	 * RequestDetails1.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails2#SecuritiesRTGS
	 * RequestDetails2.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails6#SecuritiesRTGS
	 * RequestDetails6.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails7#SecuritiesRTGS
	 * RequestDetails7.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails8#SecuritiesRTGS
	 * RequestDetails8.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails9#SecuritiesRTGS
	 * RequestDetails9.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails11#SecuritiesRTGS
	 * RequestDetails11.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails12#SecuritiesRTGS
	 * RequestDetails12.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails6#SecuritiesRTGS
	 * SettlementDetails6.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails20#SecuritiesRTGS
	 * SettlementDetails20.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails24#SecuritiesRTGS
	 * SettlementDetails24.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails33#SecuritiesRTGS
	 * SettlementDetails33.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails45#SecuritiesRTGS
	 * SettlementDetails45.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails54#SecuritiesRTGS
	 * SettlementDetails54.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails1#SecuritiesRTGS
	 * SettlementDetails1.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails19#SecuritiesRTGS
	 * SettlementDetails19.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails22#SecuritiesRTGS
	 * SettlementDetails22.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails35#SecuritiesRTGS
	 * SettlementDetails35.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#SecuritiesRTGS
	 * SettlementDetails42.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails52#SecuritiesRTGS
	 * SettlementDetails52.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails8#SecuritiesRTGS
	 * SettlementDetails8.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails11#SecuritiesRTGS
	 * SettlementDetails11.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails23#SecuritiesRTGS
	 * SettlementDetails23.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails37#SecuritiesRTGS
	 * SettlementDetails37.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails44#SecuritiesRTGS
	 * SettlementDetails44.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails53#SecuritiesRTGS
	 * SettlementDetails53.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails7#SecuritiesRTGS
	 * SettlementDetails7.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails12#SecuritiesRTGS
	 * SettlementDetails12.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails28#SecuritiesRTGS
	 * SettlementDetails28.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails38#SecuritiesRTGS
	 * SettlementDetails38.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails47#SecuritiesRTGS
	 * SettlementDetails47.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails56#SecuritiesRTGS
	 * SettlementDetails56.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails2#SecuritiesRTGS
	 * SettlementDetails2.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails13#SecuritiesRTGS
	 * SettlementDetails13.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails27#SecuritiesRTGS
	 * SettlementDetails27.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails39#SecuritiesRTGS
	 * SettlementDetails39.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails48#SecuritiesRTGS
	 * SettlementDetails48.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails57#SecuritiesRTGS
	 * SettlementDetails57.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesRTGS3Choice#Indicator
	 * SecuritiesRTGS3Choice.Indicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesRTGS3Choice#Proprietary
	 * SecuritiesRTGS3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#SecuritiesRTGS
	 * SettlementDetails43.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails4#SecuritiesRTGS
	 * SettlementDetails4.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails10#SecuritiesRTGS
	 * SettlementDetails10.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails29#SecuritiesRTGS
	 * SettlementDetails29.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails5#SecuritiesRTGS
	 * SettlementDetails5.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails25#SecuritiesRTGS
	 * SettlementDetails25.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails26#SecuritiesRTGS
	 * SettlementDetails26.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails65#SecuritiesRTGS
	 * SettlementDetails65.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails14#SecuritiesRTGS
	 * SettlementDetails14.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails41#SecuritiesRTGS
	 * SettlementDetails41.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails61#SecuritiesRTGS
	 * SettlementDetails61.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails59#SecuritiesRTGS
	 * SettlementDetails59.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails15#SecuritiesRTGS
	 * SettlementDetails15.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails34#SecuritiesRTGS
	 * SettlementDetails34.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails49#SecuritiesRTGS
	 * SettlementDetails49.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails58#SecuritiesRTGS
	 * SettlementDetails58.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails36#SecuritiesRTGS
	 * SettlementDetails36.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails18#SecuritiesRTGS
	 * SettlementDetails18.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails66#SecuritiesRTGS
	 * SettlementDetails66.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#SecuritiesRTGS
	 * SettlementDetails67.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails70#SecuritiesRTGS
	 * SettlementDetails70.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails69#SecuritiesRTGS
	 * SettlementDetails69.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails71#SecuritiesRTGS
	 * SettlementDetails71.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails72#SecuritiesRTGS
	 * SettlementDetails72.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails75#SecuritiesRTGS
	 * SettlementDetails75.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails73#SecuritiesRTGS
	 * SettlementDetails73.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails74#SecuritiesRTGS
	 * SettlementDetails74.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails13#SecuritiesRTGS
	 * RequestDetails13.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails81#SecuritiesRTGS
	 * SettlementDetails81.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails76#SecuritiesRTGS
	 * SettlementDetails76.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails80#SecuritiesRTGS
	 * SettlementDetails80.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails78#SecuritiesRTGS
	 * SettlementDetails78.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails77#SecuritiesRTGS
	 * SettlementDetails77.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails14#SecuritiesRTGS
	 * RequestDetails14.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails79#SecuritiesRTGS
	 * SettlementDetails79.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails87#SecuritiesRTGS
	 * SettlementDetails87.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails86#SecuritiesRTGS
	 * SettlementDetails86.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails85#SecuritiesRTGS
	 * SettlementDetails85.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#SecuritiesRTGS
	 * SettlementDetails93.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails15#SecuritiesRTGS
	 * RequestDetails15.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails90#SecuritiesRTGS
	 * SettlementDetails90.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails96#SecuritiesRTGS
	 * SettlementDetails96.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#SecuritiesRTGS
	 * SettlementDetails97.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails99#SecuritiesRTGS
	 * SettlementDetails99.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails100#SecuritiesRTGS
	 * SettlementDetails100.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesRTGS4Choice#Indicator
	 * SecuritiesRTGS4Choice.Indicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesRTGS4Choice#Proprietary
	 * SecuritiesRTGS4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails95#SecuritiesRTGS
	 * SettlementDetails95.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails91#SecuritiesRTGS
	 * SettlementDetails91.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails92#SecuritiesRTGS
	 * SettlementDetails92.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails98#SecuritiesRTGS
	 * SettlementDetails98.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails101#SecuritiesRTGS
	 * SettlementDetails101.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails105#SecuritiesRTGS
	 * SettlementDetails105.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails106#SecuritiesRTGS
	 * SettlementDetails106.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails104#SecuritiesRTGS
	 * SettlementDetails104.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails111#SecuritiesRTGS
	 * SettlementDetails111.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails16#SecuritiesRTGS
	 * RequestDetails16.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails112#SecuritiesRTGS
	 * SettlementDetails112.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails110#SecuritiesRTGS
	 * SettlementDetails110.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails108#SecuritiesRTGS
	 * SettlementDetails108.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails103#SecuritiesRTGS
	 * SettlementDetails103.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails107#SecuritiesRTGS
	 * SettlementDetails107.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails115#SecuritiesRTGS
	 * SettlementDetails115.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails117#SecuritiesRTGS
	 * SettlementDetails117.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesRTGS5Choice#Indicator
	 * SecuritiesRTGS5Choice.Indicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesRTGS5Choice#Proprietary
	 * SecuritiesRTGS5Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails116#SecuritiesRTGS
	 * SettlementDetails116.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails128#SecuritiesRTGS
	 * SettlementDetails128.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#SecuritiesRTGS
	 * SettlementDetails120.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#SecuritiesRTGS
	 * SettlementDetails119.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails125#SecuritiesRTGS
	 * SettlementDetails125.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails126#SecuritiesRTGS
	 * SettlementDetails126.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails127#SecuritiesRTGS
	 * SettlementDetails127.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails121#SecuritiesRTGS
	 * SettlementDetails121.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails134#SecuritiesRTGS
	 * SettlementDetails134.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails137#SecuritiesRTGS
	 * SettlementDetails137.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails132#SecuritiesRTGS
	 * SettlementDetails132.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails130#SecuritiesRTGS
	 * SettlementDetails130.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails131#SecuritiesRTGS
	 * SettlementDetails131.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails133#SecuritiesRTGS
	 * SettlementDetails133.SecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails139#SecuritiesRTGS
	 * SettlementDetails139.SecuritiesRTGS}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesRealTimeGrossSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the settlement transaction is to be settled through an RTGS or a non RTGS system."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SecuritiesRealTimeGrossSettlement = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.SecuritiesRTGS1Choice.Indicator, com.tools20022.repository.choice.SecuritiesRTGS1Choice.Proprietary,
					com.tools20022.repository.msg.SettlementDetails9.SecuritiesRTGS, com.tools20022.repository.choice.SecuritiesRTGS2Choice.Indicator, com.tools20022.repository.choice.SecuritiesRTGS2Choice.Proprietary,
					com.tools20022.repository.msg.SettlementDetails17.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails30.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails32.SecuritiesRTGS,
					com.tools20022.repository.msg.SettlementDetails60.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails64.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails3.SecuritiesRTGS,
					com.tools20022.repository.msg.SettlementDetails16.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails31.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails40.SecuritiesRTGS,
					com.tools20022.repository.msg.SettlementDetails62.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails63.SecuritiesRTGS, com.tools20022.repository.msg.RequestDetails1.SecuritiesRTGS,
					com.tools20022.repository.msg.RequestDetails2.SecuritiesRTGS, com.tools20022.repository.msg.RequestDetails6.SecuritiesRTGS, com.tools20022.repository.msg.RequestDetails7.SecuritiesRTGS,
					com.tools20022.repository.msg.RequestDetails8.SecuritiesRTGS, com.tools20022.repository.msg.RequestDetails9.SecuritiesRTGS, com.tools20022.repository.msg.RequestDetails11.SecuritiesRTGS,
					com.tools20022.repository.msg.RequestDetails12.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails6.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails20.SecuritiesRTGS,
					com.tools20022.repository.msg.SettlementDetails24.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails33.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails45.SecuritiesRTGS,
					com.tools20022.repository.msg.SettlementDetails54.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails1.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails19.SecuritiesRTGS,
					com.tools20022.repository.msg.SettlementDetails22.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails35.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails42.SecuritiesRTGS,
					com.tools20022.repository.msg.SettlementDetails52.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails8.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails11.SecuritiesRTGS,
					com.tools20022.repository.msg.SettlementDetails23.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails37.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails44.SecuritiesRTGS,
					com.tools20022.repository.msg.SettlementDetails53.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails7.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails12.SecuritiesRTGS,
					com.tools20022.repository.msg.SettlementDetails28.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails38.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails47.SecuritiesRTGS,
					com.tools20022.repository.msg.SettlementDetails56.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails2.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails13.SecuritiesRTGS,
					com.tools20022.repository.msg.SettlementDetails27.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails39.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails48.SecuritiesRTGS,
					com.tools20022.repository.msg.SettlementDetails57.SecuritiesRTGS, com.tools20022.repository.choice.SecuritiesRTGS3Choice.Indicator, com.tools20022.repository.choice.SecuritiesRTGS3Choice.Proprietary,
					com.tools20022.repository.msg.SettlementDetails43.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails4.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails10.SecuritiesRTGS,
					com.tools20022.repository.msg.SettlementDetails29.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails5.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails25.SecuritiesRTGS,
					com.tools20022.repository.msg.SettlementDetails26.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails65.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails14.SecuritiesRTGS,
					com.tools20022.repository.msg.SettlementDetails41.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails61.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails59.SecuritiesRTGS,
					com.tools20022.repository.msg.SettlementDetails15.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails34.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails49.SecuritiesRTGS,
					com.tools20022.repository.msg.SettlementDetails58.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails36.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails18.SecuritiesRTGS,
					com.tools20022.repository.msg.SettlementDetails66.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails67.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails70.SecuritiesRTGS,
					com.tools20022.repository.msg.SettlementDetails69.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails71.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails72.SecuritiesRTGS,
					com.tools20022.repository.msg.SettlementDetails75.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails73.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails74.SecuritiesRTGS,
					com.tools20022.repository.msg.RequestDetails13.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails81.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails76.SecuritiesRTGS,
					com.tools20022.repository.msg.SettlementDetails80.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails78.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails77.SecuritiesRTGS,
					com.tools20022.repository.msg.RequestDetails14.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails79.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails87.SecuritiesRTGS,
					com.tools20022.repository.msg.SettlementDetails86.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails85.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails93.SecuritiesRTGS,
					com.tools20022.repository.msg.RequestDetails15.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails90.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails96.SecuritiesRTGS,
					com.tools20022.repository.msg.SettlementDetails97.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails99.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails100.SecuritiesRTGS,
					com.tools20022.repository.choice.SecuritiesRTGS4Choice.Indicator, com.tools20022.repository.choice.SecuritiesRTGS4Choice.Proprietary, com.tools20022.repository.msg.SettlementDetails95.SecuritiesRTGS,
					com.tools20022.repository.msg.SettlementDetails91.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails92.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails98.SecuritiesRTGS,
					com.tools20022.repository.msg.SettlementDetails101.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails105.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails106.SecuritiesRTGS,
					com.tools20022.repository.msg.SettlementDetails104.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails111.SecuritiesRTGS, com.tools20022.repository.msg.RequestDetails16.SecuritiesRTGS,
					com.tools20022.repository.msg.SettlementDetails112.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails110.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails108.SecuritiesRTGS,
					com.tools20022.repository.msg.SettlementDetails103.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails107.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails115.SecuritiesRTGS,
					com.tools20022.repository.msg.SettlementDetails117.SecuritiesRTGS, com.tools20022.repository.choice.SecuritiesRTGS5Choice.Indicator, com.tools20022.repository.choice.SecuritiesRTGS5Choice.Proprietary,
					com.tools20022.repository.msg.SettlementDetails116.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails128.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails120.SecuritiesRTGS,
					com.tools20022.repository.msg.SettlementDetails119.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails125.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails126.SecuritiesRTGS,
					com.tools20022.repository.msg.SettlementDetails127.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails121.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails134.SecuritiesRTGS,
					com.tools20022.repository.msg.SettlementDetails137.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails132.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails130.SecuritiesRTGS,
					com.tools20022.repository.msg.SettlementDetails131.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails133.SecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails139.SecuritiesRTGS);
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesRealTimeGrossSettlement";
			definition = "Specifies whether the settlement transaction is to be settled through an RTGS or a non RTGS system.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Specifies whether the settlement instruction is a block parent or child.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BlockTradeCode
	 * BlockTradeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.choice.BlockTrade1Choice#Code
	 * BlockTrade1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BlockTrade1Choice#Proprietary
	 * BlockTrade1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails9#BlockTrade
	 * SettlementDetails9.BlockTrade}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.BlockTrade2Choice#Code
	 * BlockTrade2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BlockTrade2Choice#Proprietary
	 * BlockTrade2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails17#BlockTrade
	 * SettlementDetails17.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails30#BlockTrade
	 * SettlementDetails30.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails32#BlockTrade
	 * SettlementDetails32.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails60#BlockTrade
	 * SettlementDetails60.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails64#BlockTrade
	 * SettlementDetails64.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails3#BlockTrade
	 * SettlementDetails3.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails16#BlockTrade
	 * SettlementDetails16.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails31#BlockTrade
	 * SettlementDetails31.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails40#BlockTrade
	 * SettlementDetails40.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails62#BlockTrade
	 * SettlementDetails62.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails63#BlockTrade
	 * SettlementDetails63.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails6#BlockTrade
	 * SettlementDetails6.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails20#BlockTrade
	 * SettlementDetails20.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails24#BlockTrade
	 * SettlementDetails24.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails33#BlockTrade
	 * SettlementDetails33.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails45#BlockTrade
	 * SettlementDetails45.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails54#BlockTrade
	 * SettlementDetails54.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails1#BlockTrade
	 * SettlementDetails1.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails19#BlockTrade
	 * SettlementDetails19.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails22#BlockTrade
	 * SettlementDetails22.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails35#BlockTrade
	 * SettlementDetails35.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#BlockTrade
	 * SettlementDetails42.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails52#BlockTrade
	 * SettlementDetails52.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails8#BlockTrade
	 * SettlementDetails8.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails11#BlockTrade
	 * SettlementDetails11.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails23#BlockTrade
	 * SettlementDetails23.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails37#BlockTrade
	 * SettlementDetails37.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails44#BlockTrade
	 * SettlementDetails44.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails53#BlockTrade
	 * SettlementDetails53.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails7#BlockTrade
	 * SettlementDetails7.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails12#BlockTrade
	 * SettlementDetails12.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails28#BlockTrade
	 * SettlementDetails28.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails38#BlockTrade
	 * SettlementDetails38.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails47#BlockTrade
	 * SettlementDetails47.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails56#BlockTrade
	 * SettlementDetails56.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails2#BlockTrade
	 * SettlementDetails2.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails13#BlockTrade
	 * SettlementDetails13.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails27#BlockTrade
	 * SettlementDetails27.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails39#BlockTrade
	 * SettlementDetails39.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails48#BlockTrade
	 * SettlementDetails48.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails57#BlockTrade
	 * SettlementDetails57.BlockTrade}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.BlockTrade3Choice#Code
	 * BlockTrade3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BlockTrade3Choice#Proprietary
	 * BlockTrade3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#BlockTrade
	 * SettlementDetails43.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails10#BlockTrade
	 * SettlementDetails10.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails29#BlockTrade
	 * SettlementDetails29.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails26#BlockTrade
	 * SettlementDetails26.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails65#BlockTrade
	 * SettlementDetails65.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails14#BlockTrade
	 * SettlementDetails14.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails41#BlockTrade
	 * SettlementDetails41.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails61#BlockTrade
	 * SettlementDetails61.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails59#BlockTrade
	 * SettlementDetails59.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails36#BlockTrade
	 * SettlementDetails36.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails66#BlockTrade
	 * SettlementDetails66.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#BlockTrade
	 * SettlementDetails67.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails70#BlockTrade
	 * SettlementDetails70.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails69#BlockTrade
	 * SettlementDetails69.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails71#BlockTrade
	 * SettlementDetails71.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails72#BlockTrade
	 * SettlementDetails72.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails75#BlockTrade
	 * SettlementDetails75.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails73#BlockTrade
	 * SettlementDetails73.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails74#BlockTrade
	 * SettlementDetails74.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails81#BlockTrade
	 * SettlementDetails81.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails76#BlockTrade
	 * SettlementDetails76.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails80#BlockTrade
	 * SettlementDetails80.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails78#BlockTrade
	 * SettlementDetails78.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails77#BlockTrade
	 * SettlementDetails77.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails79#BlockTrade
	 * SettlementDetails79.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails87#BlockTrade
	 * SettlementDetails87.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails86#BlockTrade
	 * SettlementDetails86.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails85#BlockTrade
	 * SettlementDetails85.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#BlockTrade
	 * SettlementDetails93.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails90#BlockTrade
	 * SettlementDetails90.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails96#BlockTrade
	 * SettlementDetails96.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#BlockTrade
	 * SettlementDetails97.BlockTrade}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.BlockTrade4Choice#Code
	 * BlockTrade4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BlockTrade4Choice#Proprietary
	 * BlockTrade4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails95#BlockTrade
	 * SettlementDetails95.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails91#BlockTrade
	 * SettlementDetails91.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails92#BlockTrade
	 * SettlementDetails92.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails98#BlockTrade
	 * SettlementDetails98.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails101#BlockTrade
	 * SettlementDetails101.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails105#BlockTrade
	 * SettlementDetails105.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails106#BlockTrade
	 * SettlementDetails106.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails104#BlockTrade
	 * SettlementDetails104.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails111#BlockTrade
	 * SettlementDetails111.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails112#BlockTrade
	 * SettlementDetails112.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails110#BlockTrade
	 * SettlementDetails110.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails107#BlockTrade
	 * SettlementDetails107.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails115#BlockTrade
	 * SettlementDetails115.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails117#BlockTrade
	 * SettlementDetails117.BlockTrade}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.BlockTrade5Choice#Code
	 * BlockTrade5Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BlockTrade5Choice#Proprietary
	 * BlockTrade5Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails116#BlockTrade
	 * SettlementDetails116.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails128#BlockTrade
	 * SettlementDetails128.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#BlockTrade
	 * SettlementDetails120.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#BlockTrade
	 * SettlementDetails119.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails126#BlockTrade
	 * SettlementDetails126.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails127#BlockTrade
	 * SettlementDetails127.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails121#BlockTrade
	 * SettlementDetails121.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails134#BlockTrade
	 * SettlementDetails134.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails137#BlockTrade
	 * SettlementDetails137.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails132#BlockTrade
	 * SettlementDetails132.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails130#BlockTrade
	 * SettlementDetails130.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails133#BlockTrade
	 * SettlementDetails133.BlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails139#BlockTrade
	 * SettlementDetails139.BlockTrade}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the settlement instruction is a block parent or child."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute BlockTrade = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.BlockTrade1Choice.Code, com.tools20022.repository.choice.BlockTrade1Choice.Proprietary, com.tools20022.repository.msg.SettlementDetails9.BlockTrade,
					com.tools20022.repository.choice.BlockTrade2Choice.Code, com.tools20022.repository.choice.BlockTrade2Choice.Proprietary, com.tools20022.repository.msg.SettlementDetails17.BlockTrade,
					com.tools20022.repository.msg.SettlementDetails30.BlockTrade, com.tools20022.repository.msg.SettlementDetails32.BlockTrade, com.tools20022.repository.msg.SettlementDetails60.BlockTrade,
					com.tools20022.repository.msg.SettlementDetails64.BlockTrade, com.tools20022.repository.msg.SettlementDetails3.BlockTrade, com.tools20022.repository.msg.SettlementDetails16.BlockTrade,
					com.tools20022.repository.msg.SettlementDetails31.BlockTrade, com.tools20022.repository.msg.SettlementDetails40.BlockTrade, com.tools20022.repository.msg.SettlementDetails62.BlockTrade,
					com.tools20022.repository.msg.SettlementDetails63.BlockTrade, com.tools20022.repository.msg.SettlementDetails6.BlockTrade, com.tools20022.repository.msg.SettlementDetails20.BlockTrade,
					com.tools20022.repository.msg.SettlementDetails24.BlockTrade, com.tools20022.repository.msg.SettlementDetails33.BlockTrade, com.tools20022.repository.msg.SettlementDetails45.BlockTrade,
					com.tools20022.repository.msg.SettlementDetails54.BlockTrade, com.tools20022.repository.msg.SettlementDetails1.BlockTrade, com.tools20022.repository.msg.SettlementDetails19.BlockTrade,
					com.tools20022.repository.msg.SettlementDetails22.BlockTrade, com.tools20022.repository.msg.SettlementDetails35.BlockTrade, com.tools20022.repository.msg.SettlementDetails42.BlockTrade,
					com.tools20022.repository.msg.SettlementDetails52.BlockTrade, com.tools20022.repository.msg.SettlementDetails8.BlockTrade, com.tools20022.repository.msg.SettlementDetails11.BlockTrade,
					com.tools20022.repository.msg.SettlementDetails23.BlockTrade, com.tools20022.repository.msg.SettlementDetails37.BlockTrade, com.tools20022.repository.msg.SettlementDetails44.BlockTrade,
					com.tools20022.repository.msg.SettlementDetails53.BlockTrade, com.tools20022.repository.msg.SettlementDetails7.BlockTrade, com.tools20022.repository.msg.SettlementDetails12.BlockTrade,
					com.tools20022.repository.msg.SettlementDetails28.BlockTrade, com.tools20022.repository.msg.SettlementDetails38.BlockTrade, com.tools20022.repository.msg.SettlementDetails47.BlockTrade,
					com.tools20022.repository.msg.SettlementDetails56.BlockTrade, com.tools20022.repository.msg.SettlementDetails2.BlockTrade, com.tools20022.repository.msg.SettlementDetails13.BlockTrade,
					com.tools20022.repository.msg.SettlementDetails27.BlockTrade, com.tools20022.repository.msg.SettlementDetails39.BlockTrade, com.tools20022.repository.msg.SettlementDetails48.BlockTrade,
					com.tools20022.repository.msg.SettlementDetails57.BlockTrade, com.tools20022.repository.choice.BlockTrade3Choice.Code, com.tools20022.repository.choice.BlockTrade3Choice.Proprietary,
					com.tools20022.repository.msg.SettlementDetails43.BlockTrade, com.tools20022.repository.msg.SettlementDetails10.BlockTrade, com.tools20022.repository.msg.SettlementDetails29.BlockTrade,
					com.tools20022.repository.msg.SettlementDetails26.BlockTrade, com.tools20022.repository.msg.SettlementDetails65.BlockTrade, com.tools20022.repository.msg.SettlementDetails14.BlockTrade,
					com.tools20022.repository.msg.SettlementDetails41.BlockTrade, com.tools20022.repository.msg.SettlementDetails61.BlockTrade, com.tools20022.repository.msg.SettlementDetails59.BlockTrade,
					com.tools20022.repository.msg.SettlementDetails36.BlockTrade, com.tools20022.repository.msg.SettlementDetails66.BlockTrade, com.tools20022.repository.msg.SettlementDetails67.BlockTrade,
					com.tools20022.repository.msg.SettlementDetails70.BlockTrade, com.tools20022.repository.msg.SettlementDetails69.BlockTrade, com.tools20022.repository.msg.SettlementDetails71.BlockTrade,
					com.tools20022.repository.msg.SettlementDetails72.BlockTrade, com.tools20022.repository.msg.SettlementDetails75.BlockTrade, com.tools20022.repository.msg.SettlementDetails73.BlockTrade,
					com.tools20022.repository.msg.SettlementDetails74.BlockTrade, com.tools20022.repository.msg.SettlementDetails81.BlockTrade, com.tools20022.repository.msg.SettlementDetails76.BlockTrade,
					com.tools20022.repository.msg.SettlementDetails80.BlockTrade, com.tools20022.repository.msg.SettlementDetails78.BlockTrade, com.tools20022.repository.msg.SettlementDetails77.BlockTrade,
					com.tools20022.repository.msg.SettlementDetails79.BlockTrade, com.tools20022.repository.msg.SettlementDetails87.BlockTrade, com.tools20022.repository.msg.SettlementDetails86.BlockTrade,
					com.tools20022.repository.msg.SettlementDetails85.BlockTrade, com.tools20022.repository.msg.SettlementDetails93.BlockTrade, com.tools20022.repository.msg.SettlementDetails90.BlockTrade,
					com.tools20022.repository.msg.SettlementDetails96.BlockTrade, com.tools20022.repository.msg.SettlementDetails97.BlockTrade, com.tools20022.repository.choice.BlockTrade4Choice.Code,
					com.tools20022.repository.choice.BlockTrade4Choice.Proprietary, com.tools20022.repository.msg.SettlementDetails95.BlockTrade, com.tools20022.repository.msg.SettlementDetails91.BlockTrade,
					com.tools20022.repository.msg.SettlementDetails92.BlockTrade, com.tools20022.repository.msg.SettlementDetails98.BlockTrade, com.tools20022.repository.msg.SettlementDetails101.BlockTrade,
					com.tools20022.repository.msg.SettlementDetails105.BlockTrade, com.tools20022.repository.msg.SettlementDetails106.BlockTrade, com.tools20022.repository.msg.SettlementDetails104.BlockTrade,
					com.tools20022.repository.msg.SettlementDetails111.BlockTrade, com.tools20022.repository.msg.SettlementDetails112.BlockTrade, com.tools20022.repository.msg.SettlementDetails110.BlockTrade,
					com.tools20022.repository.msg.SettlementDetails107.BlockTrade, com.tools20022.repository.msg.SettlementDetails115.BlockTrade, com.tools20022.repository.msg.SettlementDetails117.BlockTrade,
					com.tools20022.repository.choice.BlockTrade5Choice.Code, com.tools20022.repository.choice.BlockTrade5Choice.Proprietary, com.tools20022.repository.msg.SettlementDetails116.BlockTrade,
					com.tools20022.repository.msg.SettlementDetails128.BlockTrade, com.tools20022.repository.msg.SettlementDetails120.BlockTrade, com.tools20022.repository.msg.SettlementDetails119.BlockTrade,
					com.tools20022.repository.msg.SettlementDetails126.BlockTrade, com.tools20022.repository.msg.SettlementDetails127.BlockTrade, com.tools20022.repository.msg.SettlementDetails121.BlockTrade,
					com.tools20022.repository.msg.SettlementDetails134.BlockTrade, com.tools20022.repository.msg.SettlementDetails137.BlockTrade, com.tools20022.repository.msg.SettlementDetails132.BlockTrade,
					com.tools20022.repository.msg.SettlementDetails130.BlockTrade, com.tools20022.repository.msg.SettlementDetails133.BlockTrade, com.tools20022.repository.msg.SettlementDetails139.BlockTrade);
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BlockTrade";
			definition = "Specifies whether the settlement instruction is a block parent or child.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> BlockTradeCode.mmObject();
		}
	};
	/**
	 * Specifies whether the settlement instruction is to be settled through the
	 * default or the alternate settlement system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementSystemMethodCode
	 * SettlementSystemMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementSystemMethod1Choice#Code
	 * SettlementSystemMethod1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementSystemMethod1Choice#Proprietary
	 * SettlementSystemMethod1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails9#SettlementSystemMethod
	 * SettlementDetails9.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementSystemMethod2Choice#Code
	 * SettlementSystemMethod2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementSystemMethod2Choice#Proprietary
	 * SettlementSystemMethod2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails17#SettlementSystemMethod
	 * SettlementDetails17.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails30#SettlementSystemMethod
	 * SettlementDetails30.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails32#SettlementSystemMethod
	 * SettlementDetails32.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails60#SettlementSystemMethod
	 * SettlementDetails60.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails64#SettlementSystemMethod
	 * SettlementDetails64.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails3#SettlementSystemMethod
	 * SettlementDetails3.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails16#SettlementSystemMethod
	 * SettlementDetails16.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails31#SettlementSystemMethod
	 * SettlementDetails31.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails40#SettlementSystemMethod
	 * SettlementDetails40.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails62#SettlementSystemMethod
	 * SettlementDetails62.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails63#SettlementSystemMethod
	 * SettlementDetails63.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails6#SettlementSystemMethod
	 * SettlementDetails6.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails20#SettlementSystemMethod
	 * SettlementDetails20.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails24#SettlementSystemMethod
	 * SettlementDetails24.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails33#SettlementSystemMethod
	 * SettlementDetails33.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails45#SettlementSystemMethod
	 * SettlementDetails45.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails54#SettlementSystemMethod
	 * SettlementDetails54.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails1#SettlementSystemMethod
	 * SettlementDetails1.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails19#SettlementSystemMethod
	 * SettlementDetails19.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails22#SettlementSystemMethod
	 * SettlementDetails22.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails35#SettlementSystemMethod
	 * SettlementDetails35.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#SettlementSystemMethod
	 * SettlementDetails42.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails52#SettlementSystemMethod
	 * SettlementDetails52.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails8#SettlementSystemMethod
	 * SettlementDetails8.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails11#SettlementSystemMethod
	 * SettlementDetails11.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails23#SettlementSystemMethod
	 * SettlementDetails23.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails37#SettlementSystemMethod
	 * SettlementDetails37.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails44#SettlementSystemMethod
	 * SettlementDetails44.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails53#SettlementSystemMethod
	 * SettlementDetails53.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails7#SettlementSystemMethod
	 * SettlementDetails7.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails12#SettlementSystemMethod
	 * SettlementDetails12.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails28#SettlementSystemMethod
	 * SettlementDetails28.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails38#SettlementSystemMethod
	 * SettlementDetails38.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails47#SettlementSystemMethod
	 * SettlementDetails47.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails56#SettlementSystemMethod
	 * SettlementDetails56.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails2#SettlementSystemMethod
	 * SettlementDetails2.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails13#SettlementSystemMethod
	 * SettlementDetails13.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails27#SettlementSystemMethod
	 * SettlementDetails27.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails39#SettlementSystemMethod
	 * SettlementDetails39.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails48#SettlementSystemMethod
	 * SettlementDetails48.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails57#SettlementSystemMethod
	 * SettlementDetails57.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementSystemMethod3Choice#Code
	 * SettlementSystemMethod3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementSystemMethod3Choice#Proprietary
	 * SettlementSystemMethod3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#SettlementSystemMethod
	 * SettlementDetails43.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails4#SettlementSystemMethod
	 * SettlementDetails4.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails10#SettlementSystemMethod
	 * SettlementDetails10.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails29#SettlementSystemMethod
	 * SettlementDetails29.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails5#SettlementSystemMethod
	 * SettlementDetails5.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails26#SettlementSystemMethod
	 * SettlementDetails26.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails65#SettlementSystemMethod
	 * SettlementDetails65.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails14#SettlementSystemMethod
	 * SettlementDetails14.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails41#SettlementSystemMethod
	 * SettlementDetails41.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails61#SettlementSystemMethod
	 * SettlementDetails61.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails59#SettlementSystemMethod
	 * SettlementDetails59.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails15#SettlementSystemMethod
	 * SettlementDetails15.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails36#SettlementSystemMethod
	 * SettlementDetails36.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails18#SettlementSystemMethod
	 * SettlementDetails18.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails66#SettlementSystemMethod
	 * SettlementDetails66.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#SettlementSystemMethod
	 * SettlementDetails67.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails70#SettlementSystemMethod
	 * SettlementDetails70.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails69#SettlementSystemMethod
	 * SettlementDetails69.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails71#SettlementSystemMethod
	 * SettlementDetails71.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails72#SettlementSystemMethod
	 * SettlementDetails72.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails75#SettlementSystemMethod
	 * SettlementDetails75.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails73#SettlementSystemMethod
	 * SettlementDetails73.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails74#SettlementSystemMethod
	 * SettlementDetails74.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails81#SettlementSystemMethod
	 * SettlementDetails81.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails76#SettlementSystemMethod
	 * SettlementDetails76.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails80#SettlementSystemMethod
	 * SettlementDetails80.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails78#SettlementSystemMethod
	 * SettlementDetails78.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails77#SettlementSystemMethod
	 * SettlementDetails77.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails79#SettlementSystemMethod
	 * SettlementDetails79.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails87#SettlementSystemMethod
	 * SettlementDetails87.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails86#SettlementSystemMethod
	 * SettlementDetails86.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails85#SettlementSystemMethod
	 * SettlementDetails85.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#SettlementSystemMethod
	 * SettlementDetails93.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails90#SettlementSystemMethod
	 * SettlementDetails90.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails96#SettlementSystemMethod
	 * SettlementDetails96.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#SettlementSystemMethod
	 * SettlementDetails97.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails100#SettlementSystemMethod
	 * SettlementDetails100.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementSystemMethod4Choice#Code
	 * SettlementSystemMethod4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementSystemMethod4Choice#Proprietary
	 * SettlementSystemMethod4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails95#SettlementSystemMethod
	 * SettlementDetails95.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails91#SettlementSystemMethod
	 * SettlementDetails91.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails92#SettlementSystemMethod
	 * SettlementDetails92.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails98#SettlementSystemMethod
	 * SettlementDetails98.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails101#SettlementSystemMethod
	 * SettlementDetails101.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails105#SettlementSystemMethod
	 * SettlementDetails105.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails106#SettlementSystemMethod
	 * SettlementDetails106.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails104#SettlementSystemMethod
	 * SettlementDetails104.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails111#SettlementSystemMethod
	 * SettlementDetails111.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails112#SettlementSystemMethod
	 * SettlementDetails112.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails110#SettlementSystemMethod
	 * SettlementDetails110.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails103#SettlementSystemMethod
	 * SettlementDetails103.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails107#SettlementSystemMethod
	 * SettlementDetails107.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails115#SettlementSystemMethod
	 * SettlementDetails115.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails117#SettlementSystemMethod
	 * SettlementDetails117.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementSystemMethod5Choice#Code
	 * SettlementSystemMethod5Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementSystemMethod5Choice#Proprietary
	 * SettlementSystemMethod5Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails116#SettlementSystemMethod
	 * SettlementDetails116.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails128#SettlementSystemMethod
	 * SettlementDetails128.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#SettlementSystemMethod
	 * SettlementDetails120.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#SettlementSystemMethod
	 * SettlementDetails119.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails126#SettlementSystemMethod
	 * SettlementDetails126.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails127#SettlementSystemMethod
	 * SettlementDetails127.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails121#SettlementSystemMethod
	 * SettlementDetails121.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails134#SettlementSystemMethod
	 * SettlementDetails134.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails137#SettlementSystemMethod
	 * SettlementDetails137.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails132#SettlementSystemMethod
	 * SettlementDetails132.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails130#SettlementSystemMethod
	 * SettlementDetails130.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails133#SettlementSystemMethod
	 * SettlementDetails133.SettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails139#SettlementSystemMethod
	 * SettlementDetails139.SettlementSystemMethod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementSystemMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the settlement instruction is to be settled through the default or the alternate settlement system."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SettlementSystemMethod = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.SettlementSystemMethod1Choice.Code, com.tools20022.repository.choice.SettlementSystemMethod1Choice.Proprietary,
					com.tools20022.repository.msg.SettlementDetails9.SettlementSystemMethod, com.tools20022.repository.choice.SettlementSystemMethod2Choice.Code, com.tools20022.repository.choice.SettlementSystemMethod2Choice.Proprietary,
					com.tools20022.repository.msg.SettlementDetails17.SettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails30.SettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails32.SettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails60.SettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails64.SettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails3.SettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails16.SettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails31.SettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails40.SettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails62.SettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails63.SettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails6.SettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails20.SettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails24.SettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails33.SettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails45.SettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails54.SettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails1.SettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails19.SettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails22.SettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails35.SettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails42.SettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails52.SettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails8.SettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails11.SettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails23.SettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails37.SettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails44.SettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails53.SettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails7.SettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails12.SettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails28.SettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails38.SettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails47.SettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails56.SettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails2.SettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails13.SettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails27.SettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails39.SettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails48.SettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails57.SettlementSystemMethod, com.tools20022.repository.choice.SettlementSystemMethod3Choice.Code, com.tools20022.repository.choice.SettlementSystemMethod3Choice.Proprietary,
					com.tools20022.repository.msg.SettlementDetails43.SettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails4.SettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails10.SettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails29.SettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails5.SettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails26.SettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails65.SettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails14.SettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails41.SettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails61.SettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails59.SettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails15.SettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails36.SettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails18.SettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails66.SettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails67.SettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails70.SettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails69.SettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails71.SettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails72.SettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails75.SettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails73.SettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails74.SettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails81.SettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails76.SettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails80.SettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails78.SettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails77.SettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails79.SettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails87.SettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails86.SettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails85.SettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails93.SettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails90.SettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails96.SettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails97.SettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails100.SettlementSystemMethod, com.tools20022.repository.choice.SettlementSystemMethod4Choice.Code, com.tools20022.repository.choice.SettlementSystemMethod4Choice.Proprietary,
					com.tools20022.repository.msg.SettlementDetails95.SettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails91.SettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails92.SettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails98.SettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails101.SettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails105.SettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails106.SettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails104.SettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails111.SettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails112.SettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails110.SettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails103.SettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails107.SettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails115.SettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails117.SettlementSystemMethod, com.tools20022.repository.choice.SettlementSystemMethod5Choice.Code, com.tools20022.repository.choice.SettlementSystemMethod5Choice.Proprietary,
					com.tools20022.repository.msg.SettlementDetails116.SettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails128.SettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails120.SettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails119.SettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails126.SettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails127.SettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails121.SettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails134.SettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails137.SettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails132.SettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails130.SettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails133.SettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails139.SettlementSystemMethod);
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementSystemMethod";
			definition = "Specifies whether the settlement instruction is to be settled through the default or the alternate settlement system.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> SettlementSystemMethodCode.mmObject();
		}
	};
	/**
	 * Condition for automatic borrowing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AutoBorrowingCode
	 * AutoBorrowingCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AutomaticBorrowing1Choice#Code
	 * AutomaticBorrowing1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AutomaticBorrowing1Choice#Proprietary
	 * AutomaticBorrowing1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails9#AutomaticBorrowing
	 * SettlementDetails9.AutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AutomaticBorrowing4Choice#Code
	 * AutomaticBorrowing4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AutomaticBorrowing4Choice#Proprietary
	 * AutomaticBorrowing4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails17#AutomaticBorrowing
	 * SettlementDetails17.AutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails30#AutomaticBorrowing
	 * SettlementDetails30.AutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails32#AutomaticBorrowing
	 * SettlementDetails32.AutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails60#AutomaticBorrowing
	 * SettlementDetails60.AutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails64#AutomaticBorrowing
	 * SettlementDetails64.AutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails3#AutomaticBorrowing
	 * SettlementDetails3.AutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails16#AutomaticBorrowing
	 * SettlementDetails16.AutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails31#AutomaticBorrowing
	 * SettlementDetails31.AutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails40#AutomaticBorrowing
	 * SettlementDetails40.AutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails62#AutomaticBorrowing
	 * SettlementDetails62.AutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails63#AutomaticBorrowing
	 * SettlementDetails63.AutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AutomaticBorrowing2Choice#Code
	 * AutomaticBorrowing2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AutomaticBorrowing2Choice#Proprietary
	 * AutomaticBorrowing2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails1#AutomaticBorrowing
	 * RequestDetails1.AutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AutomaticBorrowing3Choice#Code
	 * AutomaticBorrowing3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AutomaticBorrowing3Choice#Proprietary
	 * AutomaticBorrowing3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails2#AutomaticBorrowing
	 * RequestDetails2.AutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails6#AutomaticBorrowing
	 * RequestDetails6.AutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails7#AutomaticBorrowing
	 * RequestDetails7.AutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails8#AutomaticBorrowing
	 * RequestDetails8.AutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails9#AutomaticBorrowing
	 * RequestDetails9.AutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails11#AutomaticBorrowing
	 * RequestDetails11.AutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails12#AutomaticBorrowing
	 * RequestDetails12.AutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails6#AutomaticBorrowing
	 * SettlementDetails6.AutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails20#AutomaticBorrowing
	 * SettlementDetails20.AutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails24#AutomaticBorrowing
	 * SettlementDetails24.AutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails33#AutomaticBorrowing
	 * SettlementDetails33.AutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails45#AutomaticBorrowing
	 * SettlementDetails45.AutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails54#AutomaticBorrowing
	 * SettlementDetails54.AutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails1#AutomaticBorrowing
	 * SettlementDetails1.AutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails19#AutomaticBorrowing
	 * SettlementDetails19.AutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails22#AutomaticBorrowing
	 * SettlementDetails22.AutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails35#AutomaticBorrowing
	 * SettlementDetails35.AutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#AutomaticBorrowing
	 * SettlementDetails42.AutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails52#AutomaticBorrowing
	 * SettlementDetails52.AutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AutomaticBorrowing5Choice#Code
	 * AutomaticBorrowing5Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AutomaticBorrowing5Choice#Proprietary
	 * AutomaticBorrowing5Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#AutomaticBorrowing
	 * SettlementDetails43.AutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails26#AutomaticBorrowing
	 * SettlementDetails26.AutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails65#AutomaticBorrowing
	 * SettlementDetails65.AutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails36#AutomaticBorrowing
	 * SettlementDetails36.AutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#AutomaticBorrowing
	 * SettlementDetails67.AutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails70#AutomaticBorrowing
	 * SettlementDetails70.AutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails71#AutomaticBorrowing
	 * SettlementDetails71.AutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails72#AutomaticBorrowing
	 * SettlementDetails72.AutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails13#AutomaticBorrowing
	 * RequestDetails13.AutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails81#AutomaticBorrowing
	 * SettlementDetails81.AutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails76#AutomaticBorrowing
	 * SettlementDetails76.AutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails80#AutomaticBorrowing
	 * SettlementDetails80.AutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails78#AutomaticBorrowing
	 * SettlementDetails78.AutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails77#AutomaticBorrowing
	 * SettlementDetails77.AutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails14#AutomaticBorrowing
	 * RequestDetails14.AutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CommissionType5Choice#Proprietary
	 * CommissionType5Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#AutomaticBorrowing
	 * SettlementDetails93.AutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails15#AutomaticBorrowing
	 * RequestDetails15.AutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails90#AutomaticBorrowing
	 * SettlementDetails90.AutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails96#AutomaticBorrowing
	 * SettlementDetails96.AutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#AutomaticBorrowing
	 * SettlementDetails97.AutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AutomaticBorrowing6Choice#Code
	 * AutomaticBorrowing6Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AutomaticBorrowing6Choice#Proprietary
	 * AutomaticBorrowing6Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AutomaticBorrowing7Choice#Code
	 * AutomaticBorrowing7Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AutomaticBorrowing7Choice#Proprietary
	 * AutomaticBorrowing7Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails101#AutomaticBorrowing
	 * SettlementDetails101.AutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails105#AutomaticBorrowing
	 * SettlementDetails105.AutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails106#AutomaticBorrowing
	 * SettlementDetails106.AutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails104#AutomaticBorrowing
	 * SettlementDetails104.AutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails111#AutomaticBorrowing
	 * SettlementDetails111.AutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails16#AutomaticBorrowing
	 * RequestDetails16.AutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails112#AutomaticBorrowing
	 * SettlementDetails112.AutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails110#AutomaticBorrowing
	 * SettlementDetails110.AutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AutomaticBorrowing8Choice#Code
	 * AutomaticBorrowing8Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AutomaticBorrowing8Choice#Proprietary
	 * AutomaticBorrowing8Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AutomaticBorrowing11Choice#Code
	 * AutomaticBorrowing11Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AutomaticBorrowing11Choice#Proprietary
	 * AutomaticBorrowing11Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails128#AutomaticBorrowing
	 * SettlementDetails128.AutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#AutomaticBorrowing
	 * SettlementDetails120.AutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#AutomaticBorrowing
	 * SettlementDetails119.AutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails134#AutomaticBorrowing
	 * SettlementDetails134.AutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails137#AutomaticBorrowing
	 * SettlementDetails137.AutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails132#AutomaticBorrowing
	 * SettlementDetails132.AutomaticBorrowing}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AutomaticBorrowing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Condition for automatic borrowing."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AutomaticBorrowing = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AutomaticBorrowing1Choice.Code, com.tools20022.repository.choice.AutomaticBorrowing1Choice.Proprietary,
					com.tools20022.repository.msg.SettlementDetails9.AutomaticBorrowing, com.tools20022.repository.choice.AutomaticBorrowing4Choice.Code, com.tools20022.repository.choice.AutomaticBorrowing4Choice.Proprietary,
					com.tools20022.repository.msg.SettlementDetails17.AutomaticBorrowing, com.tools20022.repository.msg.SettlementDetails30.AutomaticBorrowing, com.tools20022.repository.msg.SettlementDetails32.AutomaticBorrowing,
					com.tools20022.repository.msg.SettlementDetails60.AutomaticBorrowing, com.tools20022.repository.msg.SettlementDetails64.AutomaticBorrowing, com.tools20022.repository.msg.SettlementDetails3.AutomaticBorrowing,
					com.tools20022.repository.msg.SettlementDetails16.AutomaticBorrowing, com.tools20022.repository.msg.SettlementDetails31.AutomaticBorrowing, com.tools20022.repository.msg.SettlementDetails40.AutomaticBorrowing,
					com.tools20022.repository.msg.SettlementDetails62.AutomaticBorrowing, com.tools20022.repository.msg.SettlementDetails63.AutomaticBorrowing, com.tools20022.repository.choice.AutomaticBorrowing2Choice.Code,
					com.tools20022.repository.choice.AutomaticBorrowing2Choice.Proprietary, com.tools20022.repository.msg.RequestDetails1.AutomaticBorrowing, com.tools20022.repository.choice.AutomaticBorrowing3Choice.Code,
					com.tools20022.repository.choice.AutomaticBorrowing3Choice.Proprietary, com.tools20022.repository.msg.RequestDetails2.AutomaticBorrowing, com.tools20022.repository.msg.RequestDetails6.AutomaticBorrowing,
					com.tools20022.repository.msg.RequestDetails7.AutomaticBorrowing, com.tools20022.repository.msg.RequestDetails8.AutomaticBorrowing, com.tools20022.repository.msg.RequestDetails9.AutomaticBorrowing,
					com.tools20022.repository.msg.RequestDetails11.AutomaticBorrowing, com.tools20022.repository.msg.RequestDetails12.AutomaticBorrowing, com.tools20022.repository.msg.SettlementDetails6.AutomaticBorrowing,
					com.tools20022.repository.msg.SettlementDetails20.AutomaticBorrowing, com.tools20022.repository.msg.SettlementDetails24.AutomaticBorrowing, com.tools20022.repository.msg.SettlementDetails33.AutomaticBorrowing,
					com.tools20022.repository.msg.SettlementDetails45.AutomaticBorrowing, com.tools20022.repository.msg.SettlementDetails54.AutomaticBorrowing, com.tools20022.repository.msg.SettlementDetails1.AutomaticBorrowing,
					com.tools20022.repository.msg.SettlementDetails19.AutomaticBorrowing, com.tools20022.repository.msg.SettlementDetails22.AutomaticBorrowing, com.tools20022.repository.msg.SettlementDetails35.AutomaticBorrowing,
					com.tools20022.repository.msg.SettlementDetails42.AutomaticBorrowing, com.tools20022.repository.msg.SettlementDetails52.AutomaticBorrowing, com.tools20022.repository.choice.AutomaticBorrowing5Choice.Code,
					com.tools20022.repository.choice.AutomaticBorrowing5Choice.Proprietary, com.tools20022.repository.msg.SettlementDetails43.AutomaticBorrowing, com.tools20022.repository.msg.SettlementDetails26.AutomaticBorrowing,
					com.tools20022.repository.msg.SettlementDetails65.AutomaticBorrowing, com.tools20022.repository.msg.SettlementDetails36.AutomaticBorrowing, com.tools20022.repository.msg.SettlementDetails67.AutomaticBorrowing,
					com.tools20022.repository.msg.SettlementDetails70.AutomaticBorrowing, com.tools20022.repository.msg.SettlementDetails71.AutomaticBorrowing, com.tools20022.repository.msg.SettlementDetails72.AutomaticBorrowing,
					com.tools20022.repository.msg.RequestDetails13.AutomaticBorrowing, com.tools20022.repository.msg.SettlementDetails81.AutomaticBorrowing, com.tools20022.repository.msg.SettlementDetails76.AutomaticBorrowing,
					com.tools20022.repository.msg.SettlementDetails80.AutomaticBorrowing, com.tools20022.repository.msg.SettlementDetails78.AutomaticBorrowing, com.tools20022.repository.msg.SettlementDetails77.AutomaticBorrowing,
					com.tools20022.repository.msg.RequestDetails14.AutomaticBorrowing, com.tools20022.repository.choice.CommissionType5Choice.Proprietary, com.tools20022.repository.msg.SettlementDetails93.AutomaticBorrowing,
					com.tools20022.repository.msg.RequestDetails15.AutomaticBorrowing, com.tools20022.repository.msg.SettlementDetails90.AutomaticBorrowing, com.tools20022.repository.msg.SettlementDetails96.AutomaticBorrowing,
					com.tools20022.repository.msg.SettlementDetails97.AutomaticBorrowing, com.tools20022.repository.choice.AutomaticBorrowing6Choice.Code, com.tools20022.repository.choice.AutomaticBorrowing6Choice.Proprietary,
					com.tools20022.repository.choice.AutomaticBorrowing7Choice.Code, com.tools20022.repository.choice.AutomaticBorrowing7Choice.Proprietary, com.tools20022.repository.msg.SettlementDetails101.AutomaticBorrowing,
					com.tools20022.repository.msg.SettlementDetails105.AutomaticBorrowing, com.tools20022.repository.msg.SettlementDetails106.AutomaticBorrowing, com.tools20022.repository.msg.SettlementDetails104.AutomaticBorrowing,
					com.tools20022.repository.msg.SettlementDetails111.AutomaticBorrowing, com.tools20022.repository.msg.RequestDetails16.AutomaticBorrowing, com.tools20022.repository.msg.SettlementDetails112.AutomaticBorrowing,
					com.tools20022.repository.msg.SettlementDetails110.AutomaticBorrowing, com.tools20022.repository.choice.AutomaticBorrowing8Choice.Code, com.tools20022.repository.choice.AutomaticBorrowing8Choice.Proprietary,
					com.tools20022.repository.choice.AutomaticBorrowing11Choice.Code, com.tools20022.repository.choice.AutomaticBorrowing11Choice.Proprietary, com.tools20022.repository.msg.SettlementDetails128.AutomaticBorrowing,
					com.tools20022.repository.msg.SettlementDetails120.AutomaticBorrowing, com.tools20022.repository.msg.SettlementDetails119.AutomaticBorrowing, com.tools20022.repository.msg.SettlementDetails134.AutomaticBorrowing,
					com.tools20022.repository.msg.SettlementDetails137.AutomaticBorrowing, com.tools20022.repository.msg.SettlementDetails132.AutomaticBorrowing);
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AutomaticBorrowing";
			definition = "Condition for automatic borrowing.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> AutoBorrowingCode.mmObject();
		}
	};
	/**
	 * Specifies whether partial settlement is allowed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails9#PartialSettlementIndicator
	 * SettlementDetails9.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails17#PartialSettlementIndicator
	 * SettlementDetails17.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails30#PartialSettlementIndicator
	 * SettlementDetails30.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails32#PartialSettlementIndicator
	 * SettlementDetails32.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails3#PartialSettlementIndicator
	 * SettlementDetails3.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails16#PartialSettlementIndicator
	 * SettlementDetails16.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails31#PartialSettlementIndicator
	 * SettlementDetails31.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails40#PartialSettlementIndicator
	 * SettlementDetails40.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails1#PartialSettlementIndicator
	 * RequestDetails1.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails2#PartialSettlementIndicator
	 * RequestDetails2.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails6#PartialSettlementIndicator
	 * SettlementDetails6.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails20#PartialSettlementIndicator
	 * SettlementDetails20.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails1#PartialSettlementIndicator
	 * SettlementDetails1.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails19#PartialSettlementIndicator
	 * SettlementDetails19.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails8#PartialSettlementIndicator
	 * SettlementDetails8.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails11#PartialSettlementIndicator
	 * SettlementDetails11.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails7#PartialSettlementIndicator
	 * SettlementDetails7.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails12#PartialSettlementIndicator
	 * SettlementDetails12.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails2#PartialSettlementIndicator
	 * SettlementDetails2.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails13#PartialSettlementIndicator
	 * SettlementDetails13.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#PartialSettlementIndicator
	 * SettlementDetails43.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails10#PartialSettlementIndicator
	 * SettlementDetails10.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails29#PartialSettlementIndicator
	 * SettlementDetails29.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails5#PartialSettlementIndicator
	 * SettlementDetails5.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails25#PartialSettlementIndicator
	 * SettlementDetails25.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails14#PartialSettlementIndicator
	 * SettlementDetails14.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails41#PartialSettlementIndicator
	 * SettlementDetails41.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails15#PartialSettlementIndicator
	 * SettlementDetails15.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails34#PartialSettlementIndicator
	 * SettlementDetails34.PartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails10#PartialSettlementIndicator
	 * RequestDetails10.PartialSettlementIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialSettlementIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies whether partial settlement is allowed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PartialSettlementIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementDetails9.PartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails17.PartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails30.PartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails32.PartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails3.PartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails16.PartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails31.PartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails40.PartialSettlementIndicator,
					com.tools20022.repository.msg.RequestDetails1.PartialSettlementIndicator, com.tools20022.repository.msg.RequestDetails2.PartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails6.PartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails20.PartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails1.PartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails19.PartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails8.PartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails11.PartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails7.PartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails12.PartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails2.PartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails13.PartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails43.PartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails10.PartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails29.PartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails5.PartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails25.PartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails14.PartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails41.PartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails15.PartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails34.PartialSettlementIndicator, com.tools20022.repository.msg.RequestDetails10.PartialSettlementIndicator);
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartialSettlementIndicator";
			definition = "Specifies whether partial settlement is allowed.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Specifies whether the transaction is on hold/blocked/frozen.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails3#HoldIndicator
	 * SettlementDetails3.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails16#HoldIndicator
	 * SettlementDetails16.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails31#HoldIndicator
	 * SettlementDetails31.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails40#HoldIndicator
	 * SettlementDetails40.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails62#HoldIndicator
	 * SettlementDetails62.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails63#HoldIndicator
	 * SettlementDetails63.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails1#HoldIndicator
	 * RequestDetails1.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails2#HoldIndicator
	 * RequestDetails2.HoldIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.HoldIndicator2#Indicator
	 * HoldIndicator2.Indicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails6#HoldIndicator
	 * RequestDetails6.HoldIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.HoldIndicator3#Indicator
	 * HoldIndicator3.Indicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails7#HoldIndicator
	 * RequestDetails7.HoldIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.HoldIndicator4#Indicator
	 * HoldIndicator4.Indicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails8#HoldIndicator
	 * RequestDetails8.HoldIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.HoldIndicator5#Indicator
	 * HoldIndicator5.Indicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails9#HoldIndicator
	 * RequestDetails9.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails11#HoldIndicator
	 * RequestDetails11.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails12#HoldIndicator
	 * RequestDetails12.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails1#HoldIndicator
	 * SettlementDetails1.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails19#HoldIndicator
	 * SettlementDetails19.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails22#HoldIndicator
	 * SettlementDetails22.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails35#HoldIndicator
	 * SettlementDetails35.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#HoldIndicator
	 * SettlementDetails42.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails52#HoldIndicator
	 * SettlementDetails52.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails8#HoldIndicator
	 * SettlementDetails8.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails11#HoldIndicator
	 * SettlementDetails11.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails23#HoldIndicator
	 * SettlementDetails23.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails37#HoldIndicator
	 * SettlementDetails37.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails44#HoldIndicator
	 * SettlementDetails44.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails53#HoldIndicator
	 * SettlementDetails53.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails7#HoldIndicator
	 * SettlementDetails7.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails12#HoldIndicator
	 * SettlementDetails12.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails28#HoldIndicator
	 * SettlementDetails28.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails38#HoldIndicator
	 * SettlementDetails38.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails47#HoldIndicator
	 * SettlementDetails47.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails56#HoldIndicator
	 * SettlementDetails56.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#HoldIndicator
	 * SettlementDetails43.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails10#HoldIndicator
	 * SettlementDetails10.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails29#HoldIndicator
	 * SettlementDetails29.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails5#HoldIndicator
	 * SettlementDetails5.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails25#HoldIndicator
	 * SettlementDetails25.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails65#HoldIndicator
	 * SettlementDetails65.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails14#HoldIndicator
	 * SettlementDetails14.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails41#HoldIndicator
	 * SettlementDetails41.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails61#HoldIndicator
	 * SettlementDetails61.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails59#HoldIndicator
	 * SettlementDetails59.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails15#HoldIndicator
	 * SettlementDetails15.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails34#HoldIndicator
	 * SettlementDetails34.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails49#HoldIndicator
	 * SettlementDetails49.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails58#HoldIndicator
	 * SettlementDetails58.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails66#HoldIndicator
	 * SettlementDetails66.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#HoldIndicator
	 * SettlementDetails67.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails69#HoldIndicator
	 * SettlementDetails69.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails72#HoldIndicator
	 * SettlementDetails72.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails73#HoldIndicator
	 * SettlementDetails73.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails74#HoldIndicator
	 * SettlementDetails74.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails13#HoldIndicator
	 * RequestDetails13.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails81#HoldIndicator
	 * SettlementDetails81.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails78#HoldIndicator
	 * SettlementDetails78.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails77#HoldIndicator
	 * SettlementDetails77.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails14#HoldIndicator
	 * RequestDetails14.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails79#HoldIndicator
	 * SettlementDetails79.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails86#HoldIndicator
	 * SettlementDetails86.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails85#HoldIndicator
	 * SettlementDetails85.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#HoldIndicator
	 * SettlementDetails93.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails15#HoldIndicator
	 * RequestDetails15.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#HoldIndicator
	 * SettlementDetails97.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails99#HoldIndicator
	 * SettlementDetails99.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails95#HoldIndicator
	 * SettlementDetails95.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails92#HoldIndicator
	 * SettlementDetails92.HoldIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.HoldIndicator6#Indicator
	 * HoldIndicator6.Indicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails98#HoldIndicator
	 * SettlementDetails98.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails101#HoldIndicator
	 * SettlementDetails101.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails105#HoldIndicator
	 * SettlementDetails105.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails106#HoldIndicator
	 * SettlementDetails106.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails111#HoldIndicator
	 * SettlementDetails111.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails16#HoldIndicator
	 * RequestDetails16.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails112#HoldIndicator
	 * SettlementDetails112.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails108#HoldIndicator
	 * SettlementDetails108.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails107#HoldIndicator
	 * SettlementDetails107.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails115#HoldIndicator
	 * SettlementDetails115.HoldIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.HoldIndicator7#Indicator
	 * HoldIndicator7.Indicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails116#HoldIndicator
	 * SettlementDetails116.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#HoldIndicator
	 * SettlementDetails120.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#HoldIndicator
	 * SettlementDetails119.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails125#HoldIndicator
	 * SettlementDetails125.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails127#HoldIndicator
	 * SettlementDetails127.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails121#HoldIndicator
	 * SettlementDetails121.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails137#HoldIndicator
	 * SettlementDetails137.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails132#HoldIndicator
	 * SettlementDetails132.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails130#HoldIndicator
	 * SettlementDetails130.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails131#HoldIndicator
	 * SettlementDetails131.HoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails133#HoldIndicator
	 * SettlementDetails133.HoldIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the transaction is on hold/blocked/frozen."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute HoldIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementDetails3.HoldIndicator, com.tools20022.repository.msg.SettlementDetails16.HoldIndicator,
					com.tools20022.repository.msg.SettlementDetails31.HoldIndicator, com.tools20022.repository.msg.SettlementDetails40.HoldIndicator, com.tools20022.repository.msg.SettlementDetails62.HoldIndicator,
					com.tools20022.repository.msg.SettlementDetails63.HoldIndicator, com.tools20022.repository.msg.RequestDetails1.HoldIndicator, com.tools20022.repository.msg.RequestDetails2.HoldIndicator,
					com.tools20022.repository.msg.HoldIndicator2.Indicator, com.tools20022.repository.msg.RequestDetails6.HoldIndicator, com.tools20022.repository.msg.HoldIndicator3.Indicator,
					com.tools20022.repository.msg.RequestDetails7.HoldIndicator, com.tools20022.repository.msg.HoldIndicator4.Indicator, com.tools20022.repository.msg.RequestDetails8.HoldIndicator,
					com.tools20022.repository.msg.HoldIndicator5.Indicator, com.tools20022.repository.msg.RequestDetails9.HoldIndicator, com.tools20022.repository.msg.RequestDetails11.HoldIndicator,
					com.tools20022.repository.msg.RequestDetails12.HoldIndicator, com.tools20022.repository.msg.SettlementDetails1.HoldIndicator, com.tools20022.repository.msg.SettlementDetails19.HoldIndicator,
					com.tools20022.repository.msg.SettlementDetails22.HoldIndicator, com.tools20022.repository.msg.SettlementDetails35.HoldIndicator, com.tools20022.repository.msg.SettlementDetails42.HoldIndicator,
					com.tools20022.repository.msg.SettlementDetails52.HoldIndicator, com.tools20022.repository.msg.SettlementDetails8.HoldIndicator, com.tools20022.repository.msg.SettlementDetails11.HoldIndicator,
					com.tools20022.repository.msg.SettlementDetails23.HoldIndicator, com.tools20022.repository.msg.SettlementDetails37.HoldIndicator, com.tools20022.repository.msg.SettlementDetails44.HoldIndicator,
					com.tools20022.repository.msg.SettlementDetails53.HoldIndicator, com.tools20022.repository.msg.SettlementDetails7.HoldIndicator, com.tools20022.repository.msg.SettlementDetails12.HoldIndicator,
					com.tools20022.repository.msg.SettlementDetails28.HoldIndicator, com.tools20022.repository.msg.SettlementDetails38.HoldIndicator, com.tools20022.repository.msg.SettlementDetails47.HoldIndicator,
					com.tools20022.repository.msg.SettlementDetails56.HoldIndicator, com.tools20022.repository.msg.SettlementDetails43.HoldIndicator, com.tools20022.repository.msg.SettlementDetails10.HoldIndicator,
					com.tools20022.repository.msg.SettlementDetails29.HoldIndicator, com.tools20022.repository.msg.SettlementDetails5.HoldIndicator, com.tools20022.repository.msg.SettlementDetails25.HoldIndicator,
					com.tools20022.repository.msg.SettlementDetails65.HoldIndicator, com.tools20022.repository.msg.SettlementDetails14.HoldIndicator, com.tools20022.repository.msg.SettlementDetails41.HoldIndicator,
					com.tools20022.repository.msg.SettlementDetails61.HoldIndicator, com.tools20022.repository.msg.SettlementDetails59.HoldIndicator, com.tools20022.repository.msg.SettlementDetails15.HoldIndicator,
					com.tools20022.repository.msg.SettlementDetails34.HoldIndicator, com.tools20022.repository.msg.SettlementDetails49.HoldIndicator, com.tools20022.repository.msg.SettlementDetails58.HoldIndicator,
					com.tools20022.repository.msg.SettlementDetails66.HoldIndicator, com.tools20022.repository.msg.SettlementDetails67.HoldIndicator, com.tools20022.repository.msg.SettlementDetails69.HoldIndicator,
					com.tools20022.repository.msg.SettlementDetails72.HoldIndicator, com.tools20022.repository.msg.SettlementDetails73.HoldIndicator, com.tools20022.repository.msg.SettlementDetails74.HoldIndicator,
					com.tools20022.repository.msg.RequestDetails13.HoldIndicator, com.tools20022.repository.msg.SettlementDetails81.HoldIndicator, com.tools20022.repository.msg.SettlementDetails78.HoldIndicator,
					com.tools20022.repository.msg.SettlementDetails77.HoldIndicator, com.tools20022.repository.msg.RequestDetails14.HoldIndicator, com.tools20022.repository.msg.SettlementDetails79.HoldIndicator,
					com.tools20022.repository.msg.SettlementDetails86.HoldIndicator, com.tools20022.repository.msg.SettlementDetails85.HoldIndicator, com.tools20022.repository.msg.SettlementDetails93.HoldIndicator,
					com.tools20022.repository.msg.RequestDetails15.HoldIndicator, com.tools20022.repository.msg.SettlementDetails97.HoldIndicator, com.tools20022.repository.msg.SettlementDetails99.HoldIndicator,
					com.tools20022.repository.msg.SettlementDetails95.HoldIndicator, com.tools20022.repository.msg.SettlementDetails92.HoldIndicator, com.tools20022.repository.msg.HoldIndicator6.Indicator,
					com.tools20022.repository.msg.SettlementDetails98.HoldIndicator, com.tools20022.repository.msg.SettlementDetails101.HoldIndicator, com.tools20022.repository.msg.SettlementDetails105.HoldIndicator,
					com.tools20022.repository.msg.SettlementDetails106.HoldIndicator, com.tools20022.repository.msg.SettlementDetails111.HoldIndicator, com.tools20022.repository.msg.RequestDetails16.HoldIndicator,
					com.tools20022.repository.msg.SettlementDetails112.HoldIndicator, com.tools20022.repository.msg.SettlementDetails108.HoldIndicator, com.tools20022.repository.msg.SettlementDetails107.HoldIndicator,
					com.tools20022.repository.msg.SettlementDetails115.HoldIndicator, com.tools20022.repository.msg.HoldIndicator7.Indicator, com.tools20022.repository.msg.SettlementDetails116.HoldIndicator,
					com.tools20022.repository.msg.SettlementDetails120.HoldIndicator, com.tools20022.repository.msg.SettlementDetails119.HoldIndicator, com.tools20022.repository.msg.SettlementDetails125.HoldIndicator,
					com.tools20022.repository.msg.SettlementDetails127.HoldIndicator, com.tools20022.repository.msg.SettlementDetails121.HoldIndicator, com.tools20022.repository.msg.SettlementDetails137.HoldIndicator,
					com.tools20022.repository.msg.SettlementDetails132.HoldIndicator, com.tools20022.repository.msg.SettlementDetails130.HoldIndicator, com.tools20022.repository.msg.SettlementDetails131.HoldIndicator,
					com.tools20022.repository.msg.SettlementDetails133.HoldIndicator);
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "HoldIndicator";
			definition = "Specifies whether the transaction is on hold/blocked/frozen.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Place requested as the place of safekeeping.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace#SecuritiesSettlement
	 * SafekeepingPlace.SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SafekeepingPlace
	 * SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSafekeepingPlace"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Place requested as the place of safekeeping."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RequestedSafekeepingPlace = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RequestedSafekeepingPlace";
			definition = "Place requested as the place of safekeeping.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SafekeepingPlace.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SafekeepingPlace.SecuritiesSettlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Buy and sell trades are settled in cash, based on the difference in the
	 * prices between the off-setting trades.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PairOff#RelatedSecuritiesSettlement
	 * PairOff.RelatedSecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PairOff PairOff}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PairOff"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Buy and sell trades are settled in cash, based on the difference in the prices between the off-setting trades."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PairOff = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PairOff";
			definition = "Buy and sell trades are settled in cash, based on the difference in the prices between the off-setting trades.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.PairOff.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PairOff.RelatedSecuritiesSettlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Interest included in the settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Interest#SecuritiesSettlement
	 * Interest.SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Interest Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccruedInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Interest included in the settlement."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd AccruedInterest = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccruedInterest";
			definition = "Interest included in the settlement.";
			minOccurs = 0;
			type_lazy = () -> Interest.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Interest.SecuritiesSettlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Clearing process which triggers the settlement process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesClearing#SecuritiesSettlement
	 * SecuritiesClearing.SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesClearing
	 * SecuritiesClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesClearing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Clearing process which triggers the settlement process."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesClearing = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesClearing";
			definition = "Clearing process which triggers the settlement process.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesClearing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesClearing.SecuritiesSettlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the cash payment information of a securities settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Payment#RelatedSecuritiesSettlement
	 * Payment.RelatedSecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Payment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the cash payment information of a securities settlement."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Payment = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Payment";
			definition = "Specifies the cash payment information of a securities settlement.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.RelatedSecuritiesSettlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Allocation which is settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Allocation#SettlementExecutionParameters
	 * Allocation.SettlementExecutionParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Allocation
	 * Allocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettledAllocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Allocation which is settled."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SettledAllocation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettledAllocation";
			definition = "Allocation which is settled.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Allocation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Allocation.SettlementExecutionParameters;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Entry details related to currency exchange information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#CurrencyExchangeForSecuritiesSettlement
	 * ForeignExchangeTrade.CurrencyExchangeForSecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade
	 * ForeignExchangeTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedForeignExchangeOperation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Entry details related to currency exchange information."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedForeignExchangeOperation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedForeignExchangeOperation";
			definition = "Entry details related to currency exchange information.";
			minOccurs = 0;
			type_lazy = () -> ForeignExchangeTrade.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ForeignExchangeTrade.CurrencyExchangeForSecuritiesSettlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Security which is settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#SecuritiesSettlement
	 * Security.SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails3#FinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionDetails3.FinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails4#FinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionDetails4.FinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails2#FinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionDetails2.FinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails5#FinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionDetails5.FinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails6#FinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionDetails6.FinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails7#FinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionDetails7.FinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails8#FinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionDetails8.FinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails9#FinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionDetails9.FinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails10#FinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionDetails10.FinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails11#FinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionDetails11.FinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails12#FinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionDetails12.FinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails13#FinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionDetails13.FinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails16#FinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionDetails16.FinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails14#FinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionDetails14.FinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails15#FinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionDetails15.FinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails17#FinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionDetails17.FinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails18#FinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionDetails18.FinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails19#FinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionDetails19.FinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails21#FinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionDetails21.FinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails22#FinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionDetails22.FinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails20#FinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionDetails20.FinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails23#FinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionDetails23.FinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails25#FinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionDetails25.FinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails24#FinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionDetails24.FinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails27#FinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionDetails27.FinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails28#FinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionDetails28.FinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails26#FinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionDetails26.FinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails30#FinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionDetails30.FinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails29#FinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionDetails29.FinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails31#FinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionDetails31.FinancialInstrumentAttributes}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Security"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security which is settled."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Security = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails3.FinancialInstrumentAttributes,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails4.FinancialInstrumentAttributes, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails2.FinancialInstrumentAttributes,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails5.FinancialInstrumentAttributes, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails6.FinancialInstrumentAttributes,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails7.FinancialInstrumentAttributes, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails8.FinancialInstrumentAttributes,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails9.FinancialInstrumentAttributes, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails10.FinancialInstrumentAttributes,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails11.FinancialInstrumentAttributes, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails12.FinancialInstrumentAttributes,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails13.FinancialInstrumentAttributes, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails16.FinancialInstrumentAttributes,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails14.FinancialInstrumentAttributes, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails15.FinancialInstrumentAttributes,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails17.FinancialInstrumentAttributes, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails18.FinancialInstrumentAttributes,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails19.FinancialInstrumentAttributes, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails21.FinancialInstrumentAttributes,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails22.FinancialInstrumentAttributes, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails20.FinancialInstrumentAttributes,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails23.FinancialInstrumentAttributes, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails25.FinancialInstrumentAttributes,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails24.FinancialInstrumentAttributes, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails27.FinancialInstrumentAttributes,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails28.FinancialInstrumentAttributes, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails26.FinancialInstrumentAttributes,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails30.FinancialInstrumentAttributes, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails29.FinancialInstrumentAttributes,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails31.FinancialInstrumentAttributes);
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Security which is settled.";
			minOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Security.SecuritiesSettlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Information on the quantities and amounts to be settled in a position.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Position#SecuritiesSettlement
	 * Position.SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Position Position}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Position"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information on the quantities and amounts to be settled in a position."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Position = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Position";
			definition = "Information on the quantities and amounts to be settled in a position.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Position.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Position.SecuritiesSettlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Process whereby a financial instrument is reinvested at maturity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Rollover#SecuritiesSettlement
	 * Rollover.SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Rollover Rollover}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rollover"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Process whereby a financial instrument is reinvested at maturity."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Rollover = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Rollover";
			definition = "Process whereby a financial instrument is reinvested at maturity.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Rollover.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Rollover.SecuritiesSettlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Relates to a turnaround: the same security is bought and sold to settle
	 * the same day, to or from different brokers.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#RelatedTurnaroundSettlement
	 * SecuritiesQuantity.RelatedTurnaroundSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PairedOrTurnedQuantity1Choice#TurnedQuantity
	 * PairedOrTurnedQuantity1Choice.TurnedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PairedOrTurnedQuantity2Choice#TurnedQuantity
	 * PairedOrTurnedQuantity2Choice.TurnedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PairedOrTurnedQuantity3Choice#TurnedQuantity
	 * PairedOrTurnedQuantity3Choice.TurnedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PairedOrTurnedQuantity4Choice#TurnedQuantity
	 * PairedOrTurnedQuantity4Choice.TurnedQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TurnedQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Relates to a turnaround: the same security is bought and sold to settle the same day, to or from different brokers."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TurnedQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PairedOrTurnedQuantity1Choice.TurnedQuantity, com.tools20022.repository.choice.PairedOrTurnedQuantity2Choice.TurnedQuantity,
					com.tools20022.repository.choice.PairedOrTurnedQuantity3Choice.TurnedQuantity, com.tools20022.repository.choice.PairedOrTurnedQuantity4Choice.TurnedQuantity);
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TurnedQuantity";
			definition = "Relates to a turnaround: the same security is bought and sold to settle the same day, to or from different brokers.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.RelatedTurnaroundSettlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the reason for the settlement related to the type of underlying
	 * trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ObligationTypeCode
	 * ObligationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ObligationType1Choice#Code
	 * ObligationType1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ObligationType1Choice#Proprietary
	 * ObligationType1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation3#ObligationType
	 * SettlementObligation3.ObligationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation5#ObligationType
	 * SettlementObligation5.ObligationType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason for the settlement related to the type of underlying trade."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SettlementReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ObligationType1Choice.Code, com.tools20022.repository.choice.ObligationType1Choice.Proprietary,
					com.tools20022.repository.msg.SettlementObligation3.ObligationType, com.tools20022.repository.msg.SettlementObligation5.ObligationType);
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementReason";
			definition = "Specifies the reason for the settlement related to the type of underlying trade.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ObligationTypeCode.mmObject();
		}
	};
	/**
	 * Specifies how the transaction is to be settled, eg, against payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DeliveryReceiptTypeCode
	 * DeliveryReceiptTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification3#Payment
	 * SettlementTypeAndIdentification3.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters5#Payment
	 * SettlementTypeAndAdditionalParameters5.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification13#Payment
	 * SettlementTypeAndIdentification13.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification7#Payment
	 * SettlementTypeAndIdentification7.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters8#Payment
	 * SettlementTypeAndAdditionalParameters8.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification2#Payment
	 * SettlementTypeAndIdentification2.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification5#Payment
	 * SettlementTypeAndIdentification5.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters3#Payment
	 * TransactionTypeAndAdditionalParameters3.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters6#Payment
	 * TransactionTypeAndAdditionalParameters6.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters1#Payment
	 * TransactionTypeAndAdditionalParameters1.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters4#Payment
	 * TransactionTypeAndAdditionalParameters4.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification14#Payment
	 * SettlementTypeAndIdentification14.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification1#Payment
	 * SettlementTypeAndIdentification1.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification8#Payment
	 * SettlementTypeAndIdentification8.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification9#Payment
	 * SettlementTypeAndIdentification9.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification11#Payment
	 * SettlementTypeAndIdentification11.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification15#Payment
	 * SettlementTypeAndIdentification15.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification17#Payment
	 * SettlementTypeAndIdentification17.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification10#Payment
	 * SettlementTypeAndIdentification10.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification12#Payment
	 * SettlementTypeAndIdentification12.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters1#Payment
	 * SettlementTypeAndAdditionalParameters1.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters4#Payment
	 * SettlementTypeAndAdditionalParameters4.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters9#Payment
	 * SettlementTypeAndAdditionalParameters9.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters10#Payment
	 * SettlementTypeAndAdditionalParameters10.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails5#Payment
	 * TransactionDetails5.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails9#Payment
	 * TransactionDetails9.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails22#Payment
	 * TransactionDetails22.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails23#Payment
	 * TransactionDetails23.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails36#Payment
	 * TransactionDetails36.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails47#Payment
	 * TransactionDetails47.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails53#Payment
	 * TransactionDetails53.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails58#Payment
	 * TransactionDetails58.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails7#Payment
	 * TransactionDetails7.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails8#Payment
	 * TransactionDetails8.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails16#Payment
	 * TransactionDetails16.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails17#Payment
	 * TransactionDetails17.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails26#Payment
	 * TransactionDetails26.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails25#Payment
	 * TransactionDetails25.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails27#Payment
	 * TransactionDetails27.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails33#Payment
	 * TransactionDetails33.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails39#Payment
	 * TransactionDetails39.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails50#Payment
	 * TransactionDetails50.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails56#Payment
	 * TransactionDetails56.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails59#Payment
	 * TransactionDetails59.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails6#Payment
	 * TransactionDetails6.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails18#Payment
	 * TransactionDetails18.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails24#Payment
	 * TransactionDetails24.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails34#Payment
	 * TransactionDetails34.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails37#Payment
	 * TransactionDetails37.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails48#Payment
	 * TransactionDetails48.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails57#Payment
	 * TransactionDetails57.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails60#Payment
	 * TransactionDetails60.Payment}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order14#Payment
	 * Order14.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData2#SettlementMethod
	 * FundOrderData2.SettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder5#SettlementMethod
	 * RedemptionOrder5.SettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#SettlementMethod
	 * RedemptionExecution5.SettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder7#SettlementMethod
	 * RedemptionOrder7.SettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder6#SettlementMethod
	 * RedemptionOrder6.SettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#SettlementMethod
	 * RedemptionExecution6.SettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#SettlementMethod
	 * RedemptionOrder8.SettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#SettlementMethod
	 * SubscriptionOrder5.SettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#SettlementMethod
	 * SubscriptionExecution5.SettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#SettlementMethod
	 * SubscriptionOrder7.SettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder6#SettlementMethod
	 * SubscriptionOrder6.SettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#SettlementMethod
	 * SubscriptionExecution6.SettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder8#SettlementMethod
	 * SubscriptionOrder8.SettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder3#SettlementMethod
	 * SwitchOrder3.SettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution4#SettlementMethod
	 * SwitchExecution4.SettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder4#SettlementMethod
	 * SwitchOrder4.SettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails7#Payment
	 * SecuritiesTradeDetails7.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails19#Payment
	 * SecuritiesTradeDetails19.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters2#Payment
	 * TransactionTypeAndAdditionalParameters2.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters7#Payment
	 * TransactionTypeAndAdditionalParameters7.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2#Payment
	 * SecuritiesFinancingTransactionDetails2.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8#Payment
	 * SecuritiesFinancingTransactionDetails8.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters2#Payment
	 * SettlementTypeAndAdditionalParameters2.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails4#Payment
	 * SecuritiesTradeDetails4.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails17#Payment
	 * SecuritiesTradeDetails17.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification4#Payment
	 * SettlementTypeAndIdentification4.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters5#Payment
	 * TransactionTypeAndAdditionalParameters5.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters8#Payment
	 * TransactionTypeAndAdditionalParameters8.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6#Payment
	 * SecuritiesFinancingTransactionDetails6.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10#Payment
	 * SecuritiesFinancingTransactionDetails10.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17#Payment
	 * SecuritiesFinancingTransactionDetails17.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18#Payment
	 * SecuritiesFinancingTransactionDetails18.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters3#Payment
	 * SettlementTypeAndAdditionalParameters3.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails10#Payment
	 * SecuritiesTradeDetails10.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails22#Payment
	 * SecuritiesTradeDetails22.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails23#Payment
	 * SecuritiesTradeDetails23.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails29#Payment
	 * SecuritiesTradeDetails29.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails40#Payment
	 * TransactionDetails40.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails42#Payment
	 * TransactionDetails42.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails46#Payment
	 * TransactionDetails46.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification6#Payment
	 * SettlementTypeAndIdentification6.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails14#Payment
	 * SecuritiesTradeDetails14.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails20#Payment
	 * SecuritiesTradeDetails20.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails24#Payment
	 * SecuritiesTradeDetails24.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails30#Payment
	 * SecuritiesTradeDetails30.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails45#Payment
	 * TransactionDetails45.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation3#Payment
	 * SettlementObligation3.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation5#Payment
	 * SettlementObligation5.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation4#Payment
	 * SettlementObligation4.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder11#SettlementMethod
	 * RedemptionOrder11.SettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution12#SettlementMethod
	 * RedemptionExecution12.SettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder11#SettlementMethod
	 * SubscriptionOrder11.SettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution9#SettlementMethod
	 * SubscriptionExecution9.SettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails51#Payment
	 * TransactionDetails51.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails61#Payment
	 * TransactionDetails61.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21#Payment
	 * SecuritiesFinancingTransactionDetails21.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails62#Payment
	 * TransactionDetails62.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails63#Payment
	 * TransactionDetails63.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails35#Payment
	 * SecuritiesTradeDetails35.Payment}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order17#Payment
	 * Order17.Payment}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order18#Payment
	 * Order18.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22#Payment
	 * SecuritiesFinancingTransactionDetails22.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails66#Payment
	 * TransactionDetails66.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails42#Payment
	 * SecuritiesTradeDetails42.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails67#Payment
	 * TransactionDetails67.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails68#Payment
	 * TransactionDetails68.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24#Payment
	 * SecuritiesFinancingTransactionDetails24.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails70#Payment
	 * TransactionDetails70.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails69#Payment
	 * TransactionDetails69.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation8#Payment
	 * SettlementObligation8.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails71#Payment
	 * TransactionDetails71.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25#Payment
	 * SecuritiesFinancingTransactionDetails25.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails72#Payment
	 * TransactionDetails72.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails81#Payment
	 * TransactionDetails81.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails49#Payment
	 * SecuritiesTradeDetails49.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails82#Payment
	 * TransactionDetails82.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#Payment
	 * SecuritiesFinancingTransactionDetails26.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails79#Payment
	 * TransactionDetails79.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48#Payment
	 * SecuritiesTradeDetails48.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails75#Payment
	 * TransactionDetails75.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails78#Payment
	 * TransactionDetails78.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification18#Payment
	 * SettlementTypeAndIdentification18.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification19#Payment
	 * SettlementTypeAndIdentification19.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters10#Payment
	 * TransactionTypeAndAdditionalParameters10.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters11#Payment
	 * SettlementTypeAndAdditionalParameters11.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters9#Payment
	 * TransactionTypeAndAdditionalParameters9.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters11#Payment
	 * TransactionTypeAndAdditionalParameters11.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters12#Payment
	 * SettlementTypeAndAdditionalParameters12.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters14#Payment
	 * SettlementTypeAndAdditionalParameters14.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification20#Payment
	 * SettlementTypeAndIdentification20.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification21#Payment
	 * SettlementTypeAndIdentification21.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails57#Payment
	 * SecuritiesTradeDetails57.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters13#Payment
	 * TransactionTypeAndAdditionalParameters13.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#Payment
	 * SecuritiesFinancingTransactionDetails33.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters14#Payment
	 * TransactionTypeAndAdditionalParameters14.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters12#Payment
	 * TransactionTypeAndAdditionalParameters12.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails61#Payment
	 * SecuritiesTradeDetails61.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails92#Payment
	 * TransactionDetails92.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails84#Payment
	 * TransactionDetails84.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters16#Payment
	 * SettlementTypeAndAdditionalParameters16.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification24#Payment
	 * SettlementTypeAndIdentification24.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails87#Payment
	 * TransactionDetails87.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters15#Payment
	 * SettlementTypeAndAdditionalParameters15.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails91#Payment
	 * TransactionDetails91.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails90#Payment
	 * TransactionDetails90.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters18#Payment
	 * SettlementTypeAndAdditionalParameters18.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification22#Payment
	 * SettlementTypeAndIdentification22.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution7#SettlementMethod
	 * SwitchExecution7.SettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder7#SettlementMethod
	 * SwitchOrder7.SettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#SettlementMethod
	 * RedemptionOrder14.SettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#SettlementMethod
	 * SubscriptionExecution13.SettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#SettlementMethod
	 * SubscriptionExecution12.SettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#SettlementMethod
	 * SubscriptionOrder15.SettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder15#SettlementMethod
	 * RedemptionOrder15.SettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#SettlementMethod
	 * RedemptionExecution16.SettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#SettlementMethod
	 * SubscriptionOrder14.SettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData6#SettlementMethod
	 * FundOrderData6.SettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#SettlementMethod
	 * RedemptionExecution15.SettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters19#Payment
	 * SettlementTypeAndAdditionalParameters19.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#Payment
	 * SecuritiesTradeDetails68.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails97#Payment
	 * TransactionDetails97.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters15#Payment
	 * TransactionTypeAndAdditionalParameters15.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters17#Payment
	 * TransactionTypeAndAdditionalParameters17.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters16#Payment
	 * TransactionTypeAndAdditionalParameters16.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#Payment
	 * SecuritiesFinancingTransactionDetails35.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails96#Payment
	 * TransactionDetails96.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails95#Payment
	 * TransactionDetails95.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters19#Payment
	 * TransactionTypeAndAdditionalParameters19.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails69#Payment
	 * SecuritiesTradeDetails69.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters20#Payment
	 * TransactionTypeAndAdditionalParameters20.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters18#Payment
	 * TransactionTypeAndAdditionalParameters18.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36#Payment
	 * SecuritiesFinancingTransactionDetails36.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters20#Payment
	 * SettlementTypeAndAdditionalParameters20.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails100#Payment
	 * TransactionDetails100.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails99#Payment
	 * TransactionDetails99.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails98#Payment
	 * TransactionDetails98.Payment}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies how the transaction is to be settled, eg, against payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SettlementType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementTypeAndIdentification3.Payment, com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters5.Payment,
					com.tools20022.repository.msg.SettlementTypeAndIdentification13.Payment, com.tools20022.repository.msg.SettlementTypeAndIdentification7.Payment,
					com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters8.Payment, com.tools20022.repository.msg.SettlementTypeAndIdentification2.Payment,
					com.tools20022.repository.msg.SettlementTypeAndIdentification5.Payment, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters3.Payment,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters6.Payment, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters1.Payment,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters4.Payment, com.tools20022.repository.msg.SettlementTypeAndIdentification14.Payment,
					com.tools20022.repository.msg.SettlementTypeAndIdentification1.Payment, com.tools20022.repository.msg.SettlementTypeAndIdentification8.Payment, com.tools20022.repository.msg.SettlementTypeAndIdentification9.Payment,
					com.tools20022.repository.msg.SettlementTypeAndIdentification11.Payment, com.tools20022.repository.msg.SettlementTypeAndIdentification15.Payment, com.tools20022.repository.msg.SettlementTypeAndIdentification17.Payment,
					com.tools20022.repository.msg.SettlementTypeAndIdentification10.Payment, com.tools20022.repository.msg.SettlementTypeAndIdentification12.Payment,
					com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters1.Payment, com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters4.Payment,
					com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters9.Payment, com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters10.Payment, com.tools20022.repository.msg.TransactionDetails5.Payment,
					com.tools20022.repository.msg.TransactionDetails9.Payment, com.tools20022.repository.msg.TransactionDetails22.Payment, com.tools20022.repository.msg.TransactionDetails23.Payment,
					com.tools20022.repository.msg.TransactionDetails36.Payment, com.tools20022.repository.msg.TransactionDetails47.Payment, com.tools20022.repository.msg.TransactionDetails53.Payment,
					com.tools20022.repository.msg.TransactionDetails58.Payment, com.tools20022.repository.msg.TransactionDetails7.Payment, com.tools20022.repository.msg.TransactionDetails8.Payment,
					com.tools20022.repository.msg.TransactionDetails16.Payment, com.tools20022.repository.msg.TransactionDetails17.Payment, com.tools20022.repository.msg.TransactionDetails26.Payment,
					com.tools20022.repository.msg.TransactionDetails25.Payment, com.tools20022.repository.msg.TransactionDetails27.Payment, com.tools20022.repository.msg.TransactionDetails33.Payment,
					com.tools20022.repository.msg.TransactionDetails39.Payment, com.tools20022.repository.msg.TransactionDetails50.Payment, com.tools20022.repository.msg.TransactionDetails56.Payment,
					com.tools20022.repository.msg.TransactionDetails59.Payment, com.tools20022.repository.msg.TransactionDetails6.Payment, com.tools20022.repository.msg.TransactionDetails18.Payment,
					com.tools20022.repository.msg.TransactionDetails24.Payment, com.tools20022.repository.msg.TransactionDetails34.Payment, com.tools20022.repository.msg.TransactionDetails37.Payment,
					com.tools20022.repository.msg.TransactionDetails48.Payment, com.tools20022.repository.msg.TransactionDetails57.Payment, com.tools20022.repository.msg.TransactionDetails60.Payment,
					com.tools20022.repository.msg.Order14.Payment, com.tools20022.repository.msg.FundOrderData2.SettlementMethod, com.tools20022.repository.msg.RedemptionOrder5.SettlementMethod,
					com.tools20022.repository.msg.RedemptionExecution5.SettlementMethod, com.tools20022.repository.msg.RedemptionOrder7.SettlementMethod, com.tools20022.repository.msg.RedemptionOrder6.SettlementMethod,
					com.tools20022.repository.msg.RedemptionExecution6.SettlementMethod, com.tools20022.repository.msg.RedemptionOrder8.SettlementMethod, com.tools20022.repository.msg.SubscriptionOrder5.SettlementMethod,
					com.tools20022.repository.msg.SubscriptionExecution5.SettlementMethod, com.tools20022.repository.msg.SubscriptionOrder7.SettlementMethod, com.tools20022.repository.msg.SubscriptionOrder6.SettlementMethod,
					com.tools20022.repository.msg.SubscriptionExecution6.SettlementMethod, com.tools20022.repository.msg.SubscriptionOrder8.SettlementMethod, com.tools20022.repository.msg.SwitchOrder3.SettlementMethod,
					com.tools20022.repository.msg.SwitchExecution4.SettlementMethod, com.tools20022.repository.msg.SwitchOrder4.SettlementMethod, com.tools20022.repository.msg.SecuritiesTradeDetails7.Payment,
					com.tools20022.repository.msg.SecuritiesTradeDetails19.Payment, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters2.Payment,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters7.Payment, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2.Payment,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8.Payment, com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters2.Payment, com.tools20022.repository.msg.SecuritiesTradeDetails4.Payment,
					com.tools20022.repository.msg.SecuritiesTradeDetails17.Payment, com.tools20022.repository.msg.SettlementTypeAndIdentification4.Payment, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters5.Payment,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters8.Payment, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6.Payment,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10.Payment, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17.Payment,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18.Payment, com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters3.Payment,
					com.tools20022.repository.msg.SecuritiesTradeDetails10.Payment, com.tools20022.repository.msg.SecuritiesTradeDetails22.Payment, com.tools20022.repository.msg.SecuritiesTradeDetails23.Payment,
					com.tools20022.repository.msg.SecuritiesTradeDetails29.Payment, com.tools20022.repository.msg.TransactionDetails40.Payment, com.tools20022.repository.msg.TransactionDetails42.Payment,
					com.tools20022.repository.msg.TransactionDetails46.Payment, com.tools20022.repository.msg.SettlementTypeAndIdentification6.Payment, com.tools20022.repository.msg.SecuritiesTradeDetails14.Payment,
					com.tools20022.repository.msg.SecuritiesTradeDetails20.Payment, com.tools20022.repository.msg.SecuritiesTradeDetails24.Payment, com.tools20022.repository.msg.SecuritiesTradeDetails30.Payment,
					com.tools20022.repository.msg.TransactionDetails45.Payment, com.tools20022.repository.msg.SettlementObligation3.Payment, com.tools20022.repository.msg.SettlementObligation5.Payment,
					com.tools20022.repository.msg.SettlementObligation4.Payment, com.tools20022.repository.msg.RedemptionOrder11.SettlementMethod, com.tools20022.repository.msg.RedemptionExecution12.SettlementMethod,
					com.tools20022.repository.msg.SubscriptionOrder11.SettlementMethod, com.tools20022.repository.msg.SubscriptionExecution9.SettlementMethod, com.tools20022.repository.msg.TransactionDetails51.Payment,
					com.tools20022.repository.msg.TransactionDetails61.Payment, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21.Payment, com.tools20022.repository.msg.TransactionDetails62.Payment,
					com.tools20022.repository.msg.TransactionDetails63.Payment, com.tools20022.repository.msg.SecuritiesTradeDetails35.Payment, com.tools20022.repository.msg.Order17.Payment, com.tools20022.repository.msg.Order18.Payment,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22.Payment, com.tools20022.repository.msg.TransactionDetails66.Payment, com.tools20022.repository.msg.SecuritiesTradeDetails42.Payment,
					com.tools20022.repository.msg.TransactionDetails67.Payment, com.tools20022.repository.msg.TransactionDetails68.Payment, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24.Payment,
					com.tools20022.repository.msg.TransactionDetails70.Payment, com.tools20022.repository.msg.TransactionDetails69.Payment, com.tools20022.repository.msg.SettlementObligation8.Payment,
					com.tools20022.repository.msg.TransactionDetails71.Payment, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25.Payment, com.tools20022.repository.msg.TransactionDetails72.Payment,
					com.tools20022.repository.msg.TransactionDetails81.Payment, com.tools20022.repository.msg.SecuritiesTradeDetails49.Payment, com.tools20022.repository.msg.TransactionDetails82.Payment,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26.Payment, com.tools20022.repository.msg.TransactionDetails79.Payment, com.tools20022.repository.msg.SecuritiesTradeDetails48.Payment,
					com.tools20022.repository.msg.TransactionDetails75.Payment, com.tools20022.repository.msg.TransactionDetails78.Payment, com.tools20022.repository.msg.SettlementTypeAndIdentification18.Payment,
					com.tools20022.repository.msg.SettlementTypeAndIdentification19.Payment, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters10.Payment,
					com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters11.Payment, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters9.Payment,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters11.Payment, com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters12.Payment,
					com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters14.Payment, com.tools20022.repository.msg.SettlementTypeAndIdentification20.Payment,
					com.tools20022.repository.msg.SettlementTypeAndIdentification21.Payment, com.tools20022.repository.msg.SecuritiesTradeDetails57.Payment, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters13.Payment,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.Payment, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters14.Payment,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters12.Payment, com.tools20022.repository.msg.SecuritiesTradeDetails61.Payment, com.tools20022.repository.msg.TransactionDetails92.Payment,
					com.tools20022.repository.msg.TransactionDetails84.Payment, com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters16.Payment, com.tools20022.repository.msg.SettlementTypeAndIdentification24.Payment,
					com.tools20022.repository.msg.TransactionDetails87.Payment, com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters15.Payment, com.tools20022.repository.msg.TransactionDetails91.Payment,
					com.tools20022.repository.msg.TransactionDetails90.Payment, com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters18.Payment, com.tools20022.repository.msg.SettlementTypeAndIdentification22.Payment,
					com.tools20022.repository.msg.SwitchExecution7.SettlementMethod, com.tools20022.repository.msg.SwitchOrder7.SettlementMethod, com.tools20022.repository.msg.RedemptionOrder14.SettlementMethod,
					com.tools20022.repository.msg.SubscriptionExecution13.SettlementMethod, com.tools20022.repository.msg.SubscriptionExecution12.SettlementMethod, com.tools20022.repository.msg.SubscriptionOrder15.SettlementMethod,
					com.tools20022.repository.msg.RedemptionOrder15.SettlementMethod, com.tools20022.repository.msg.RedemptionExecution16.SettlementMethod, com.tools20022.repository.msg.SubscriptionOrder14.SettlementMethod,
					com.tools20022.repository.msg.FundOrderData6.SettlementMethod, com.tools20022.repository.msg.RedemptionExecution15.SettlementMethod, com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters19.Payment,
					com.tools20022.repository.msg.SecuritiesTradeDetails68.Payment, com.tools20022.repository.msg.TransactionDetails97.Payment, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters15.Payment,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters17.Payment, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters16.Payment,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35.Payment, com.tools20022.repository.msg.TransactionDetails96.Payment, com.tools20022.repository.msg.TransactionDetails95.Payment,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters19.Payment, com.tools20022.repository.msg.SecuritiesTradeDetails69.Payment,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters20.Payment, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters18.Payment,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36.Payment, com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters20.Payment, com.tools20022.repository.msg.TransactionDetails100.Payment,
					com.tools20022.repository.msg.TransactionDetails99.Payment, com.tools20022.repository.msg.TransactionDetails98.Payment);
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementType";
			definition = "Specifies how the transaction is to be settled, eg, against payment.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DeliveryReceiptTypeCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesSettlement";
				definition = "Settlement of the securities in a securities transaction, that is, the instruction to deliver or receive securities, involving the payment of an amount of money or not.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.SecuritiesSettlement, com.tools20022.repository.entity.Payment.RelatedSecuritiesSettlement,
						com.tools20022.repository.entity.SecuritiesQuantity.SecuritiesSettlement, com.tools20022.repository.entity.SecuritiesQuantity.RelatedTurnaroundSettlement,
						com.tools20022.repository.entity.SecuritiesTransfer.RelatedSettlement, com.tools20022.repository.entity.SecuritiesSettlementPartyRole.SecuritiesSettlement,
						com.tools20022.repository.entity.Interest.SecuritiesSettlement, com.tools20022.repository.entity.SafekeepingPlace.SecuritiesSettlement, com.tools20022.repository.entity.SecuritiesTradeExecution.SecuritiesSettlement,
						com.tools20022.repository.entity.ForeignExchangeTrade.CurrencyExchangeForSecuritiesSettlement, com.tools20022.repository.entity.Allocation.SettlementExecutionParameters,
						com.tools20022.repository.entity.PairOff.RelatedSecuritiesSettlement, com.tools20022.repository.entity.Rollover.SecuritiesSettlement, com.tools20022.repository.entity.SecuritiesClearing.SecuritiesSettlement,
						com.tools20022.repository.entity.Position.SecuritiesSettlement);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails3.SettlementTypeAndAdditionalParameters,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails3.QuantityAndAccountDetails, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails3.SettlementParameters,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails4.SettlementTypeAndAdditionalParameters, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails4.QuantityAndAccountDetails,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails4.SettlementParameters, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails2.SettlementTypeAndAdditionalParameters,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails2.QuantityAndAccountDetails, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails2.SettlementParameters,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails5.SettlementTypeAndAdditionalParameters, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails5.QuantityAndAccountDetails,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails5.SettlementParameters, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails6.SettlementTypeAndAdditionalParameters,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails6.QuantityAndAccountDetails, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails6.SettlementParameters,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails7.SettlementTypeAndAdditionalParameters, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails7.QuantityAndAccountDetails,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails7.SettlementParameters, com.tools20022.repository.choice.Cancellation1Choice.TransferOutDetails,
						com.tools20022.repository.choice.Cancellation2Choice.TransferInDetails, com.tools20022.repository.msg.RequestDetails1.UnilateralSplit, com.tools20022.repository.msg.RequestDetails2.UnilateralSplit,
						com.tools20022.repository.msg.RequestDetails6.UnilateralSplit, com.tools20022.repository.msg.RequestDetails7.UnilateralSplit, com.tools20022.repository.msg.RequestDetails8.UnilateralSplit,
						com.tools20022.repository.msg.RequestDetails9.UnilateralSplit, com.tools20022.repository.msg.RequestDetails11.UnilateralSplit, com.tools20022.repository.msg.RequestDetails12.UnilateralSplit,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails8.SettlementTypeAndAdditionalParameters, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails8.QuantityAndAccountDetails,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails8.SettlementParameters, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails9.SettlementTypeAndAdditionalParameters,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails9.QuantityAndAccountDetails, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails9.SettlementParameters,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails10.SettlementTypeAndAdditionalParameters, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails10.QuantityAndAccountDetails,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails10.SettlementParameters, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails11.SettlementTypeAndAdditionalParameters,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails11.QuantityAndAccountDetails, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails11.SettlementParameters,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails12.SettlementTypeAndAdditionalParameters, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails12.QuantityAndAccountDetails,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails12.SettlementParameters, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails13.SettlementTypeAndAdditionalParameters,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails13.QuantityAndAccountDetails, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails13.SettlementParameters,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2.SettlementParameters, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8.SettlementParameters,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6.SettlementParameters, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10.SettlementParameters,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17.SettlementParameters, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18.SettlementParameters,
						com.tools20022.repository.choice.Cancellation5Choice.TransferInDetails, com.tools20022.repository.choice.Cancellation4Choice.TransferOutDetails,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails16.SettlementTypeAndAdditionalParameters, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails16.QuantityAndAccountDetails,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails16.SettlementParameters, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails14.SettlementTypeAndAdditionalParameters,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails14.QuantityAndAccountDetails, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails14.SettlementParameters,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails15.SettlementTypeAndAdditionalParameters, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails15.QuantityAndAccountDetails,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails15.SettlementParameters, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21.SettlementParameters,
						com.tools20022.repository.msg.RequestDetails13.UnilateralSplit, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22.SettlementParameters,
						com.tools20022.repository.msg.RequestDetails14.UnilateralSplit, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails17.SettlementTypeAndAdditionalParameters,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails17.QuantityAndAccountDetails, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails17.SettlementParameters,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails18.SettlementTypeAndAdditionalParameters, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails18.QuantityAndAccountDetails,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails18.SettlementParameters, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails19.SettlementTypeAndAdditionalParameters,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails19.QuantityAndAccountDetails, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails19.SettlementParameters,
						com.tools20022.repository.choice.Cancellation9Choice.TransferInDetails, com.tools20022.repository.choice.Cancellation8Choice.TransferOutDetails,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24.SettlementParameters, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25.SettlementParameters,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26.SettlementParameters, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails21.SettlementTypeAndAdditionalParameters,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails21.QuantityAndAccountDetails, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails21.SettlementParameters,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails22.SettlementTypeAndAdditionalParameters, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails22.QuantityAndAccountDetails,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails22.SettlementParameters, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails20.SettlementTypeAndAdditionalParameters,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails20.QuantityAndAccountDetails, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails20.SettlementParameters,
						com.tools20022.repository.msg.RequestDetails15.UnilateralSplit, com.tools20022.repository.choice.Cancellation12Choice.TransferOutDetails, com.tools20022.repository.choice.Cancellation10Choice.TransferInDetails,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.SettlementParameters, com.tools20022.repository.msg.RequestDetails16.UnilateralSplit,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails23.SettlementTypeAndAdditionalParameters, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails23.QuantityAndAccountDetails,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails23.SettlementParameters, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails25.SettlementTypeAndAdditionalParameters,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails25.QuantityAndAccountDetails, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails25.SettlementParameters,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails24.SettlementTypeAndAdditionalParameters, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails24.QuantityAndAccountDetails,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails24.SettlementParameters, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35.SettlementParameters,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails27.SettlementTypeAndAdditionalParameters, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails27.QuantityAndAccountDetails,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails27.SettlementParameters, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails28.SettlementTypeAndAdditionalParameters,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails28.QuantityAndAccountDetails, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails28.SettlementParameters,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails26.SettlementTypeAndAdditionalParameters, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails26.QuantityAndAccountDetails,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails26.SettlementParameters, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36.SettlementParameters,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails30.SettlementTypeAndAdditionalParameters, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails30.QuantityAndAccountDetails,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails30.SettlementParameters, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails29.SettlementTypeAndAdditionalParameters,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails29.QuantityAndAccountDetails, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails29.SettlementParameters,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails31.SettlementTypeAndAdditionalParameters, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails31.QuantityAndAccountDetails,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails31.SettlementParameters);
				superType_lazy = () -> Settlement.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesSettlement.TransferOperation, com.tools20022.repository.entity.SecuritiesSettlement.SettlementDate,
						com.tools20022.repository.entity.SecuritiesSettlement.PartyRole, com.tools20022.repository.entity.SecuritiesSettlement.SettlementAmount, com.tools20022.repository.entity.SecuritiesSettlement.HoldingsPlanType,
						com.tools20022.repository.entity.SecuritiesSettlement.SecuritiesMovementType, com.tools20022.repository.entity.SecuritiesSettlement.SettlementQuantity,
						com.tools20022.repository.entity.SecuritiesSettlement.SecuritiesTradeExecution, com.tools20022.repository.entity.SecuritiesSettlement.CurrencyToBuy,
						com.tools20022.repository.entity.SecuritiesSettlement.CurrencyToSell, com.tools20022.repository.entity.SecuritiesSettlement.DenominationChoice,
						com.tools20022.repository.entity.SecuritiesSettlement.SettlementTransactionCondition, com.tools20022.repository.entity.SecuritiesSettlement.BeneficialOwnershipIndicator,
						com.tools20022.repository.entity.SecuritiesSettlement.MarketClientSide, com.tools20022.repository.entity.SecuritiesSettlement.Tracking, com.tools20022.repository.entity.SecuritiesSettlement.LetterOfGuarantee,
						com.tools20022.repository.entity.SecuritiesSettlement.EligibleForCollateral, com.tools20022.repository.entity.SecuritiesSettlement.AccruedInterestIndicator,
						com.tools20022.repository.entity.SecuritiesSettlement.PreConfirmation, com.tools20022.repository.entity.SecuritiesSettlement.SecuritiesRealTimeGrossSettlement,
						com.tools20022.repository.entity.SecuritiesSettlement.BlockTrade, com.tools20022.repository.entity.SecuritiesSettlement.SettlementSystemMethod,
						com.tools20022.repository.entity.SecuritiesSettlement.AutomaticBorrowing, com.tools20022.repository.entity.SecuritiesSettlement.PartialSettlementIndicator,
						com.tools20022.repository.entity.SecuritiesSettlement.HoldIndicator, com.tools20022.repository.entity.SecuritiesSettlement.RequestedSafekeepingPlace, com.tools20022.repository.entity.SecuritiesSettlement.PairOff,
						com.tools20022.repository.entity.SecuritiesSettlement.AccruedInterest, com.tools20022.repository.entity.SecuritiesSettlement.SecuritiesClearing, com.tools20022.repository.entity.SecuritiesSettlement.Payment,
						com.tools20022.repository.entity.SecuritiesSettlement.SettledAllocation, com.tools20022.repository.entity.SecuritiesSettlement.RelatedForeignExchangeOperation,
						com.tools20022.repository.entity.SecuritiesSettlement.Security, com.tools20022.repository.entity.SecuritiesSettlement.Position, com.tools20022.repository.entity.SecuritiesSettlement.Rollover,
						com.tools20022.repository.entity.SecuritiesSettlement.TurnedQuantity, com.tools20022.repository.entity.SecuritiesSettlement.SettlementReason, com.tools20022.repository.entity.SecuritiesSettlement.SettlementType);
				derivationComponent_lazy = () -> ListBuilderForSecuritiesSettlement_00.addElems(new ArrayList<>());
			}
		});
		return mmObject_lazy.get();
	}
}