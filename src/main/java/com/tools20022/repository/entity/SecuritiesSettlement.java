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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Settlement;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.*;
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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Settlement
 * Settlement}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmTransferOperation
 * SecuritiesSettlement.mmTransferOperation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementDate
 * SecuritiesSettlement.mmSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmPartyRole
 * SecuritiesSettlement.mmPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementAmount
 * SecuritiesSettlement.mmSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmHoldingsPlanType
 * SecuritiesSettlement.mmHoldingsPlanType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSecuritiesMovementType
 * SecuritiesSettlement.mmSecuritiesMovementType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementQuantity
 * SecuritiesSettlement.mmSettlementQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSecuritiesTradeExecution
 * SecuritiesSettlement.mmSecuritiesTradeExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmCurrencyToBuy
 * SecuritiesSettlement.mmCurrencyToBuy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmCurrencyToSell
 * SecuritiesSettlement.mmCurrencyToSell}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmDenominationChoice
 * SecuritiesSettlement.mmDenominationChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementTransactionCondition
 * SecuritiesSettlement.mmSettlementTransactionCondition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmBeneficialOwnershipIndicator
 * SecuritiesSettlement.mmBeneficialOwnershipIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmMarketClientSide
 * SecuritiesSettlement.mmMarketClientSide}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmTracking
 * SecuritiesSettlement.mmTracking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmLetterOfGuarantee
 * SecuritiesSettlement.mmLetterOfGuarantee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmEligibleForCollateral
 * SecuritiesSettlement.mmEligibleForCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmAccruedInterestIndicator
 * SecuritiesSettlement.mmAccruedInterestIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmPreConfirmation
 * SecuritiesSettlement.mmPreConfirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSecuritiesRealTimeGrossSettlement
 * SecuritiesSettlement.mmSecuritiesRealTimeGrossSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmBlockTrade
 * SecuritiesSettlement.mmBlockTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementSystemMethod
 * SecuritiesSettlement.mmSettlementSystemMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmAutomaticBorrowing
 * SecuritiesSettlement.mmAutomaticBorrowing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmPartialSettlementIndicator
 * SecuritiesSettlement.mmPartialSettlementIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmHoldIndicator
 * SecuritiesSettlement.mmHoldIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmRequestedSafekeepingPlace
 * SecuritiesSettlement.mmRequestedSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmPairOff
 * SecuritiesSettlement.mmPairOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmAccruedInterest
 * SecuritiesSettlement.mmAccruedInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSecuritiesClearing
 * SecuritiesSettlement.mmSecuritiesClearing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmPayment
 * SecuritiesSettlement.mmPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettledAllocation
 * SecuritiesSettlement.mmSettledAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmRelatedForeignExchangeOperation
 * SecuritiesSettlement.mmRelatedForeignExchangeOperation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSecurity
 * SecuritiesSettlement.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmPosition
 * SecuritiesSettlement.mmPosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmRollover
 * SecuritiesSettlement.mmRollover}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmTurnedQuantity
 * SecuritiesSettlement.mmTurnedQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementReason
 * SecuritiesSettlement.mmSettlementReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementType
 * SecuritiesSettlement.mmSettlementType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmSecuritiesSettlement
 * Security.mmSecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#mmRelatedSecuritiesSettlement
 * Payment.mmRelatedSecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmSecuritiesSettlement
 * SecuritiesQuantity.mmSecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRelatedTurnaroundSettlement
 * SecuritiesQuantity.mmRelatedTurnaroundSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmRelatedSettlement
 * SecuritiesTransfer.mmRelatedSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole#mmSecuritiesSettlement
 * SecuritiesSettlementPartyRole.mmSecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#mmSecuritiesSettlement
 * Interest.mmSecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace#mmSecuritiesSettlement
 * SafekeepingPlace.mmSecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmSecuritiesSettlement
 * SecuritiesTradeExecution.mmSecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmCurrencyExchangeForSecuritiesSettlement
 * ForeignExchangeTrade.mmCurrencyExchangeForSecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Allocation#mmSettlementExecutionParameters
 * Allocation.mmSettlementExecutionParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PairOff#mmRelatedSecuritiesSettlement
 * PairOff.mmRelatedSecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Rollover#mmSecuritiesSettlement
 * Rollover.mmSecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesClearing#mmSecuritiesSettlement
 * SecuritiesClearing.mmSecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Position#mmSecuritiesSettlement
 * Position.mmSecuritiesSettlement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails3#mmSettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionDetails3.
 * mmSettlementTypeAndAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails3#mmQuantityAndAccountDetails
 * SecuritiesSettlementTransactionDetails3.mmQuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails3#mmSettlementParameters
 * SecuritiesSettlementTransactionDetails3.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails4#mmSettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionDetails4.
 * mmSettlementTypeAndAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails4#mmQuantityAndAccountDetails
 * SecuritiesSettlementTransactionDetails4.mmQuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails4#mmSettlementParameters
 * SecuritiesSettlementTransactionDetails4.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails2#mmSettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionDetails2.
 * mmSettlementTypeAndAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails2#mmQuantityAndAccountDetails
 * SecuritiesSettlementTransactionDetails2.mmQuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails2#mmSettlementParameters
 * SecuritiesSettlementTransactionDetails2.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails5#mmSettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionDetails5.
 * mmSettlementTypeAndAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails5#mmQuantityAndAccountDetails
 * SecuritiesSettlementTransactionDetails5.mmQuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails5#mmSettlementParameters
 * SecuritiesSettlementTransactionDetails5.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails6#mmSettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionDetails6.
 * mmSettlementTypeAndAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails6#mmQuantityAndAccountDetails
 * SecuritiesSettlementTransactionDetails6.mmQuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails6#mmSettlementParameters
 * SecuritiesSettlementTransactionDetails6.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails7#mmSettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionDetails7.
 * mmSettlementTypeAndAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails7#mmQuantityAndAccountDetails
 * SecuritiesSettlementTransactionDetails7.mmQuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails7#mmSettlementParameters
 * SecuritiesSettlementTransactionDetails7.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Cancellation1Choice#mmTransferOutDetails
 * Cancellation1Choice.mmTransferOutDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Cancellation2Choice#mmTransferInDetails
 * Cancellation2Choice.mmTransferInDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestDetails1#mmUnilateralSplit
 * RequestDetails1.mmUnilateralSplit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestDetails2#mmUnilateralSplit
 * RequestDetails2.mmUnilateralSplit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestDetails6#mmUnilateralSplit
 * RequestDetails6.mmUnilateralSplit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestDetails7#mmUnilateralSplit
 * RequestDetails7.mmUnilateralSplit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestDetails8#mmUnilateralSplit
 * RequestDetails8.mmUnilateralSplit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestDetails9#mmUnilateralSplit
 * RequestDetails9.mmUnilateralSplit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestDetails11#mmUnilateralSplit
 * RequestDetails11.mmUnilateralSplit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestDetails12#mmUnilateralSplit
 * RequestDetails12.mmUnilateralSplit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails8#mmSettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionDetails8.
 * mmSettlementTypeAndAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails8#mmQuantityAndAccountDetails
 * SecuritiesSettlementTransactionDetails8.mmQuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails8#mmSettlementParameters
 * SecuritiesSettlementTransactionDetails8.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails9#mmSettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionDetails9.
 * mmSettlementTypeAndAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails9#mmQuantityAndAccountDetails
 * SecuritiesSettlementTransactionDetails9.mmQuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails9#mmSettlementParameters
 * SecuritiesSettlementTransactionDetails9.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails10#mmSettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionDetails10.
 * mmSettlementTypeAndAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails10#mmQuantityAndAccountDetails
 * SecuritiesSettlementTransactionDetails10.mmQuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails10#mmSettlementParameters
 * SecuritiesSettlementTransactionDetails10.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails11#mmSettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionDetails11.
 * mmSettlementTypeAndAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails11#mmQuantityAndAccountDetails
 * SecuritiesSettlementTransactionDetails11.mmQuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails11#mmSettlementParameters
 * SecuritiesSettlementTransactionDetails11.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails12#mmSettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionDetails12.
 * mmSettlementTypeAndAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails12#mmQuantityAndAccountDetails
 * SecuritiesSettlementTransactionDetails12.mmQuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails12#mmSettlementParameters
 * SecuritiesSettlementTransactionDetails12.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails13#mmSettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionDetails13.
 * mmSettlementTypeAndAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails13#mmQuantityAndAccountDetails
 * SecuritiesSettlementTransactionDetails13.mmQuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails13#mmSettlementParameters
 * SecuritiesSettlementTransactionDetails13.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2#mmSettlementParameters
 * SecuritiesFinancingTransactionDetails2.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8#mmSettlementParameters
 * SecuritiesFinancingTransactionDetails8.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6#mmSettlementParameters
 * SecuritiesFinancingTransactionDetails6.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10#mmSettlementParameters
 * SecuritiesFinancingTransactionDetails10.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17#mmSettlementParameters
 * SecuritiesFinancingTransactionDetails17.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18#mmSettlementParameters
 * SecuritiesFinancingTransactionDetails18.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Cancellation5Choice#mmTransferInDetails
 * Cancellation5Choice.mmTransferInDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Cancellation4Choice#mmTransferOutDetails
 * Cancellation4Choice.mmTransferOutDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails16#mmSettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionDetails16.
 * mmSettlementTypeAndAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails16#mmQuantityAndAccountDetails
 * SecuritiesSettlementTransactionDetails16.mmQuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails16#mmSettlementParameters
 * SecuritiesSettlementTransactionDetails16.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails14#mmSettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionDetails14.
 * mmSettlementTypeAndAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails14#mmQuantityAndAccountDetails
 * SecuritiesSettlementTransactionDetails14.mmQuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails14#mmSettlementParameters
 * SecuritiesSettlementTransactionDetails14.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails15#mmSettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionDetails15.
 * mmSettlementTypeAndAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails15#mmQuantityAndAccountDetails
 * SecuritiesSettlementTransactionDetails15.mmQuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails15#mmSettlementParameters
 * SecuritiesSettlementTransactionDetails15.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21#mmSettlementParameters
 * SecuritiesFinancingTransactionDetails21.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestDetails13#mmUnilateralSplit
 * RequestDetails13.mmUnilateralSplit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22#mmSettlementParameters
 * SecuritiesFinancingTransactionDetails22.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestDetails14#mmUnilateralSplit
 * RequestDetails14.mmUnilateralSplit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails17#mmSettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionDetails17.
 * mmSettlementTypeAndAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails17#mmQuantityAndAccountDetails
 * SecuritiesSettlementTransactionDetails17.mmQuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails17#mmSettlementParameters
 * SecuritiesSettlementTransactionDetails17.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails18#mmSettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionDetails18.
 * mmSettlementTypeAndAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails18#mmQuantityAndAccountDetails
 * SecuritiesSettlementTransactionDetails18.mmQuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails18#mmSettlementParameters
 * SecuritiesSettlementTransactionDetails18.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails19#mmSettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionDetails19.
 * mmSettlementTypeAndAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails19#mmQuantityAndAccountDetails
 * SecuritiesSettlementTransactionDetails19.mmQuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails19#mmSettlementParameters
 * SecuritiesSettlementTransactionDetails19.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Cancellation9Choice#mmTransferInDetails
 * Cancellation9Choice.mmTransferInDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Cancellation8Choice#mmTransferOutDetails
 * Cancellation8Choice.mmTransferOutDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24#mmSettlementParameters
 * SecuritiesFinancingTransactionDetails24.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25#mmSettlementParameters
 * SecuritiesFinancingTransactionDetails25.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#mmSettlementParameters
 * SecuritiesFinancingTransactionDetails26.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails21#mmSettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionDetails21.
 * mmSettlementTypeAndAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails21#mmQuantityAndAccountDetails
 * SecuritiesSettlementTransactionDetails21.mmQuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails21#mmSettlementParameters
 * SecuritiesSettlementTransactionDetails21.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails22#mmSettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionDetails22.
 * mmSettlementTypeAndAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails22#mmQuantityAndAccountDetails
 * SecuritiesSettlementTransactionDetails22.mmQuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails22#mmSettlementParameters
 * SecuritiesSettlementTransactionDetails22.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails20#mmSettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionDetails20.
 * mmSettlementTypeAndAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails20#mmQuantityAndAccountDetails
 * SecuritiesSettlementTransactionDetails20.mmQuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails20#mmSettlementParameters
 * SecuritiesSettlementTransactionDetails20.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestDetails15#mmUnilateralSplit
 * RequestDetails15.mmUnilateralSplit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Cancellation12Choice#mmTransferOutDetails
 * Cancellation12Choice.mmTransferOutDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Cancellation10Choice#mmTransferInDetails
 * Cancellation10Choice.mmTransferInDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#mmSettlementParameters
 * SecuritiesFinancingTransactionDetails33.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestDetails16#mmUnilateralSplit
 * RequestDetails16.mmUnilateralSplit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails23#mmSettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionDetails23.
 * mmSettlementTypeAndAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails23#mmQuantityAndAccountDetails
 * SecuritiesSettlementTransactionDetails23.mmQuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails23#mmSettlementParameters
 * SecuritiesSettlementTransactionDetails23.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails25#mmSettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionDetails25.
 * mmSettlementTypeAndAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails25#mmQuantityAndAccountDetails
 * SecuritiesSettlementTransactionDetails25.mmQuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails25#mmSettlementParameters
 * SecuritiesSettlementTransactionDetails25.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails24#mmSettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionDetails24.
 * mmSettlementTypeAndAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails24#mmQuantityAndAccountDetails
 * SecuritiesSettlementTransactionDetails24.mmQuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails24#mmSettlementParameters
 * SecuritiesSettlementTransactionDetails24.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestDetails18#mmUnilateralSplit
 * RequestDetails18.mmUnilateralSplit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmSettlementParameters
 * SecuritiesFinancingTransactionDetails35.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails27#mmSettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionDetails27.
 * mmSettlementTypeAndAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails27#mmQuantityAndAccountDetails
 * SecuritiesSettlementTransactionDetails27.mmQuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails27#mmSettlementParameters
 * SecuritiesSettlementTransactionDetails27.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails28#mmSettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionDetails28.
 * mmSettlementTypeAndAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails28#mmQuantityAndAccountDetails
 * SecuritiesSettlementTransactionDetails28.mmQuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails28#mmSettlementParameters
 * SecuritiesSettlementTransactionDetails28.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails26#mmSettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionDetails26.
 * mmSettlementTypeAndAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails26#mmQuantityAndAccountDetails
 * SecuritiesSettlementTransactionDetails26.mmQuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails26#mmSettlementParameters
 * SecuritiesSettlementTransactionDetails26.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36#mmSettlementParameters
 * SecuritiesFinancingTransactionDetails36.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails30#mmSettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionDetails30.
 * mmSettlementTypeAndAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails30#mmQuantityAndAccountDetails
 * SecuritiesSettlementTransactionDetails30.mmQuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails30#mmSettlementParameters
 * SecuritiesSettlementTransactionDetails30.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails29#mmSettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionDetails29.
 * mmSettlementTypeAndAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails29#mmQuantityAndAccountDetails
 * SecuritiesSettlementTransactionDetails29.mmQuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails29#mmSettlementParameters
 * SecuritiesSettlementTransactionDetails29.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails31#mmSettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionDetails31.
 * mmSettlementTypeAndAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails31#mmQuantityAndAccountDetails
 * SecuritiesSettlementTransactionDetails31.mmQuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails31#mmSettlementParameters
 * SecuritiesSettlementTransactionDetails31.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails34#mmSettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionDetails34.
 * mmSettlementTypeAndAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails34#mmQuantityAndAccountDetails
 * SecuritiesSettlementTransactionDetails34.mmQuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails34#mmSettlementParameters
 * SecuritiesSettlementTransactionDetails34.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails33#mmSettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionDetails33.
 * mmSettlementTypeAndAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails33#mmQuantityAndAccountDetails
 * SecuritiesSettlementTransactionDetails33.mmQuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails33#mmSettlementParameters
 * SecuritiesSettlementTransactionDetails33.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32#mmSettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionDetails32.
 * mmSettlementTypeAndAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32#mmQuantityAndAccountDetails
 * SecuritiesSettlementTransactionDetails32.mmQuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32#mmSettlementParameters
 * SecuritiesSettlementTransactionDetails32.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails35#mmSettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionDetails35.
 * mmSettlementTypeAndAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails35#mmQuantityAndAccountDetails
 * SecuritiesSettlementTransactionDetails35.mmQuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails35#mmSettlementParameters
 * SecuritiesSettlementTransactionDetails35.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails36#mmSettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionDetails36.
 * mmSettlementTypeAndAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails36#mmQuantityAndAccountDetails
 * SecuritiesSettlementTransactionDetails36.mmQuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails36#mmSettlementParameters
 * SecuritiesSettlementTransactionDetails36.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails37#mmSettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionDetails37.
 * mmSettlementTypeAndAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails37#mmQuantityAndAccountDetails
 * SecuritiesSettlementTransactionDetails37.mmQuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails37#mmSettlementParameters
 * SecuritiesSettlementTransactionDetails37.mmSettlementParameters}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} = List of 567 elements</li>
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
	protected SecuritiesTransfer transferOperation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmRelatedSettlement
	 * SecuritiesTransfer.mmRelatedSettlement}</li>
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
	 * {@linkplain com.tools20022.repository.choice.Cancellation3Choice#mmCancellationByTransferInstructionDetails
	 * Cancellation3Choice.mmCancellationByTransferInstructionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Cancellation6Choice#mmCancellationByTransferInstructionDetails
	 * Cancellation6Choice.mmCancellationByTransferInstructionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Cancellation7Choice#mmCancellationByTransferInstructionDetails
	 * Cancellation7Choice.mmCancellationByTransferInstructionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Cancellation11Choice#mmCancellationByTransferInstructionDetails
	 * Cancellation11Choice.mmCancellationByTransferInstructionDetails}</li>
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
	public static final MMBusinessAssociationEnd mmTransferOperation = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(Cancellation3Choice.mmCancellationByTransferInstructionDetails, Cancellation6Choice.mmCancellationByTransferInstructionDetails,
					Cancellation7Choice.mmCancellationByTransferInstructionDetails, Cancellation11Choice.mmCancellationByTransferInstructionDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransferOperation";
			definition = "Set of processes resulting in a securities transfer.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.mmRelatedSettlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.mmObject();
		}
	};
	protected ISODateTime settlementDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation4#mmEffectiveSettlementDate
	 * DeliverInformation4.mmEffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation7#mmEffectiveSettlementDate
	 * DeliverInformation7.mmEffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation4#mmEffectiveSettlementDate
	 * ReceiveInformation4.mmEffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation8#mmEffectiveSettlementDate
	 * ReceiveInformation8.mmEffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer24#mmEffectiveSettlementDate
	 * Transfer24.mmEffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation6#mmEffectiveSettlementDate
	 * ReceiveInformation6.mmEffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation11#mmEffectiveSettlementDate
	 * ReceiveInformation11.mmEffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer25#mmEffectiveSettlementDate
	 * Transfer25.mmEffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation11#mmEffectiveSettlementDate
	 * DeliverInformation11.mmEffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation6#mmEffectiveSettlementDate
	 * DeliverInformation6.mmEffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer26#mmEffectiveSettlementDate
	 * Transfer26.mmEffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer23#mmEffectiveSettlementDate
	 * Transfer23.mmEffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification2#mmSettlementDate
	 * SettlementTypeAndIdentification2.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification5#mmSettlementDate
	 * SettlementTypeAndIdentification5.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails2#mmSettlementDate
	 * IntraPositionDetails2.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails8#mmSettlementDate
	 * IntraPositionDetails8.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails12#mmSettlementDate
	 * IntraPositionDetails12.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails13#mmSettlementDate
	 * IntraPositionDetails13.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails22#mmSettlementDate
	 * IntraPositionDetails22.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails26#mmSettlementDate
	 * IntraPositionDetails26.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails27#mmSettlementDate
	 * IntraPositionDetails27.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails29#mmSettlementDate
	 * IntraPositionDetails29.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails6#mmEffectiveSettlementDate
	 * SecuritiesTradeDetails6.mmEffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails13#mmEffectiveSettlementDate
	 * SecuritiesTradeDetails13.mmEffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation3#mmEffectiveDate
	 * AdditionalInformation3.mmEffectiveDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation4#mmEffectiveDate
	 * AdditionalInformation4.mmEffectiveDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation7#mmEffectiveDate
	 * AdditionalInformation7.mmEffectiveDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation8#mmEffectiveDate
	 * AdditionalInformation8.mmEffectiveDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails2#mmEffectiveSettlementDate
	 * SecuritiesTradeDetails2.mmEffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails16#mmEffectiveSettlementDate
	 * SecuritiesTradeDetails16.mmEffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails6#mmEffectiveSettlementDate
	 * TransactionDetails6.mmEffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails18#mmEffectiveSettlementDate
	 * TransactionDetails18.mmEffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails24#mmEffectiveSettlementDate
	 * TransactionDetails24.mmEffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails34#mmEffectiveSettlementDate
	 * TransactionDetails34.mmEffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails37#mmEffectiveSettlementDate
	 * TransactionDetails37.mmEffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails48#mmEffectiveSettlementDate
	 * TransactionDetails48.mmEffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails57#mmEffectiveSettlementDate
	 * TransactionDetails57.mmEffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails60#mmEffectiveSettlementDate
	 * TransactionDetails60.mmEffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction2#mmSettlementDate
	 * InvestmentFundTransaction2.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#mmSettlementDate
	 * InvestmentFundTransaction3.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails1#mmSettlementDate
	 * IntraPositionDetails1.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails11#mmSettlementDate
	 * IntraPositionDetails11.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails4#mmSettlementDate
	 * IntraPositionDetails4.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails9#mmSettlementDate
	 * IntraPositionDetails9.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails7#mmSettlementDate
	 * IntraPositionDetails7.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails16#mmSettlementDate
	 * IntraPositionDetails16.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails21#mmSettlementDate
	 * IntraPositionDetails21.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails25#mmSettlementDate
	 * IntraPositionDetails25.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails5#mmSettlementDate
	 * IntraPositionDetails5.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails15#mmSettlementDate
	 * IntraPositionDetails15.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails19#mmSettlementDate
	 * IntraPositionDetails19.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails23#mmSettlementDate
	 * IntraPositionDetails23.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation1#mmIntendedSettlementDate
	 * SettlementObligation1.mmIntendedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation6#mmIntendedSettlementDate
	 * SettlementObligation6.mmIntendedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation3#mmSettlementDate
	 * SettlementObligation3.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation2#mmIntendedSettlementDate
	 * SettlementObligation2.mmIntendedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation5#mmSettlementDate
	 * SettlementObligation5.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation4#mmIntendedSettlementDate
	 * SettlementObligation4.mmIntendedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetPosition2#mmSettlementDate
	 * NetPosition2.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails51#mmEffectiveSettlementDate
	 * TransactionDetails51.mmEffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria1#mmEffectiveSettlementDate
	 * IntraPositionQueryCriteria1.mmEffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPosition4#mmSettlementDate
	 * IntraPosition4.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg2#mmLegSettlementDate
	 * InstrumentLeg2.mmLegSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer28#mmEffectiveSettlementDate
	 * Transfer28.mmEffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation12#mmEffectiveSettlementDate
	 * ReceiveInformation12.mmEffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer29#mmEffectiveSettlementDate
	 * Transfer29.mmEffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation12#mmEffectiveSettlementDate
	 * DeliverInformation12.mmEffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails63#mmEffectiveSettlementDate
	 * TransactionDetails63.mmEffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails31#mmEffectiveSettlementDate
	 * SecuritiesTradeDetails31.mmEffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails38#mmEffectiveSettlementDate
	 * SecuritiesTradeDetails38.mmEffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation9#mmEffectiveDate
	 * AdditionalInformation9.mmEffectiveDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails39#mmEffectiveSettlementDate
	 * SecuritiesTradeDetails39.mmEffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails43#mmEffectiveSettlementDate
	 * SecuritiesTradeDetails43.mmEffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation10#mmEffectiveDate
	 * AdditionalInformation10.mmEffectiveDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails68#mmEffectiveSettlementDate
	 * TransactionDetails68.mmEffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmSettlementDate
	 * InvestmentFundTransaction4.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation14#mmEffectiveSettlementDate
	 * DeliverInformation14.mmEffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation14#mmEffectiveSettlementDate
	 * ReceiveInformation14.mmEffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation7#mmIntendedSettlementDate
	 * SettlementObligation7.mmIntendedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetPosition3#mmSettlementDate
	 * NetPosition3.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation8#mmIntendedSettlementDate
	 * SettlementObligation8.mmIntendedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction1#mmSettlementDate
	 * UnsecuredMarketTransaction1.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction1#mmSettlementDate
	 * SecuredMarketTransaction1.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation11#mmEffectiveDate
	 * AdditionalInformation11.mmEffectiveDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails31#mmSettlementDate
	 * IntraPositionDetails31.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails78#mmEffectiveSettlementDate
	 * TransactionDetails78.mmEffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg6#mmLegSettlementDate
	 * InstrumentLeg6.mmLegSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails33#mmSettlementDate
	 * IntraPositionDetails33.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails53#mmEffectiveSettlementDate
	 * SecuritiesTradeDetails53.mmEffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails55#mmEffectiveSettlementDate
	 * SecuritiesTradeDetails55.mmEffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails34#mmSettlementDate
	 * IntraPositionDetails34.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification20#mmSettlementDate
	 * SettlementTypeAndIdentification20.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation17#mmEffectiveSettlementDate
	 * ReceiveInformation17.mmEffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer31#mmEffectiveSettlementDate
	 * Transfer31.mmEffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation17#mmEffectiveSettlementDate
	 * DeliverInformation17.mmEffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer33#mmEffectiveSettlementDate
	 * Transfer33.mmEffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification21#mmSettlementDate
	 * SettlementTypeAndIdentification21.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation12#mmEffectiveDate
	 * AdditionalInformation12.mmEffectiveDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails58#mmEffectiveSettlementDate
	 * SecuritiesTradeDetails58.mmEffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails35#mmSettlementDate
	 * IntraPositionDetails35.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails36#mmSettlementDate
	 * IntraPositionDetails36.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails38#mmSettlementDate
	 * IntraPositionDetails38.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails62#mmEffectiveSettlementDate
	 * SecuritiesTradeDetails62.mmEffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails91#mmEffectiveSettlementDate
	 * TransactionDetails91.mmEffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction2#mmSettlementDate
	 * UnsecuredMarketTransaction2.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction2#mmSettlementDate
	 * SecuredMarketTransaction2.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction3#mmSettlementDate
	 * UnsecuredMarketTransaction3.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction3#mmSettlementDate
	 * SecuredMarketTransaction3.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails93#mmEffectiveSettlementDate
	 * TransactionDetails93.mmEffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria6#mmEffectiveSettlementDate
	 * IntraPositionQueryCriteria6.mmEffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPosition5#mmSettlementDate
	 * IntraPosition5.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails41#mmSettlementDate
	 * IntraPositionDetails41.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails39#mmSettlementDate
	 * IntraPositionDetails39.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation13#mmEffectiveDate
	 * AdditionalInformation13.mmEffectiveDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails95#mmEffectiveSettlementDate
	 * TransactionDetails95.mmEffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails43#mmSettlementDate
	 * IntraPositionDetails43.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails42#mmSettlementDate
	 * IntraPositionDetails42.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation14#mmEffectiveDate
	 * AdditionalInformation14.mmEffectiveDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails98#mmEffectiveSettlementDate
	 * TransactionDetails98.mmEffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4#mmSettlementDate
	 * SecuredMarketTransaction4.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4#mmSettlementDate
	 * UnsecuredMarketTransaction4.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction15#mmSettlementDate
	 * TradeTransaction15.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction17#mmSettlementDate
	 * TradeTransaction17.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction14#mmSettlementDate
	 * TradeTransaction14.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction18#mmSettlementDate
	 * TradeTransaction18.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction16#mmSettlementDate
	 * TradeTransaction16.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails102#mmEffectiveSettlementDate
	 * TransactionDetails102.mmEffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation18#mmEffectiveSettlementDate
	 * ReceiveInformation18.mmEffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer35#mmEffectiveSettlementDate
	 * Transfer35.mmEffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation18#mmEffectiveSettlementDate
	 * DeliverInformation18.mmEffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails46#mmSettlementDate
	 * IntraPositionDetails46.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails103#mmEffectiveSettlementDate
	 * TransactionDetails103.mmEffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails74#mmEffectiveSettlementDate
	 * SecuritiesTradeDetails74.mmEffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails76#mmEffectiveSettlementDate
	 * SecuritiesTradeDetails76.mmEffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification25#mmSettlementDate
	 * SettlementTypeAndIdentification25.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification26#mmSettlementDate
	 * SettlementTypeAndIdentification26.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails47#mmSettlementDate
	 * IntraPositionDetails47.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails82#mmEffectiveSettlementDate
	 * SecuritiesTradeDetails82.mmEffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails86#mmEffectiveSettlementDate
	 * SecuritiesTradeDetails86.mmEffectiveSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails112#mmEffectiveSettlementDate
	 * TransactionDetails112.mmEffectiveSettlementDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::ESET</li>
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
	public static final MMBusinessAttribute mmSettlementDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(DeliverInformation4.mmEffectiveSettlementDate, DeliverInformation7.mmEffectiveSettlementDate, ReceiveInformation4.mmEffectiveSettlementDate, ReceiveInformation8.mmEffectiveSettlementDate,
					Transfer24.mmEffectiveSettlementDate, ReceiveInformation6.mmEffectiveSettlementDate, ReceiveInformation11.mmEffectiveSettlementDate, Transfer25.mmEffectiveSettlementDate, DeliverInformation11.mmEffectiveSettlementDate,
					DeliverInformation6.mmEffectiveSettlementDate, Transfer26.mmEffectiveSettlementDate, Transfer23.mmEffectiveSettlementDate, SettlementTypeAndIdentification2.mmSettlementDate,
					SettlementTypeAndIdentification5.mmSettlementDate, IntraPositionDetails2.mmSettlementDate, IntraPositionDetails8.mmSettlementDate, IntraPositionDetails12.mmSettlementDate, IntraPositionDetails13.mmSettlementDate,
					IntraPositionDetails22.mmSettlementDate, IntraPositionDetails26.mmSettlementDate, IntraPositionDetails27.mmSettlementDate, IntraPositionDetails29.mmSettlementDate, SecuritiesTradeDetails6.mmEffectiveSettlementDate,
					SecuritiesTradeDetails13.mmEffectiveSettlementDate, AdditionalInformation3.mmEffectiveDate, AdditionalInformation4.mmEffectiveDate, AdditionalInformation7.mmEffectiveDate, AdditionalInformation8.mmEffectiveDate,
					SecuritiesTradeDetails2.mmEffectiveSettlementDate, SecuritiesTradeDetails16.mmEffectiveSettlementDate, TransactionDetails6.mmEffectiveSettlementDate, TransactionDetails18.mmEffectiveSettlementDate,
					TransactionDetails24.mmEffectiveSettlementDate, TransactionDetails34.mmEffectiveSettlementDate, TransactionDetails37.mmEffectiveSettlementDate, TransactionDetails48.mmEffectiveSettlementDate,
					TransactionDetails57.mmEffectiveSettlementDate, TransactionDetails60.mmEffectiveSettlementDate, InvestmentFundTransaction2.mmSettlementDate, InvestmentFundTransaction3.mmSettlementDate,
					IntraPositionDetails1.mmSettlementDate, IntraPositionDetails11.mmSettlementDate, IntraPositionDetails4.mmSettlementDate, IntraPositionDetails9.mmSettlementDate, IntraPositionDetails7.mmSettlementDate,
					IntraPositionDetails16.mmSettlementDate, IntraPositionDetails21.mmSettlementDate, IntraPositionDetails25.mmSettlementDate, IntraPositionDetails5.mmSettlementDate, IntraPositionDetails15.mmSettlementDate,
					IntraPositionDetails19.mmSettlementDate, IntraPositionDetails23.mmSettlementDate, SettlementObligation1.mmIntendedSettlementDate, SettlementObligation6.mmIntendedSettlementDate, SettlementObligation3.mmSettlementDate,
					SettlementObligation2.mmIntendedSettlementDate, SettlementObligation5.mmSettlementDate, SettlementObligation4.mmIntendedSettlementDate, NetPosition2.mmSettlementDate, TransactionDetails51.mmEffectiveSettlementDate,
					IntraPositionQueryCriteria1.mmEffectiveSettlementDate, IntraPosition4.mmSettlementDate, InstrumentLeg2.mmLegSettlementDate, Transfer28.mmEffectiveSettlementDate, ReceiveInformation12.mmEffectiveSettlementDate,
					Transfer29.mmEffectiveSettlementDate, DeliverInformation12.mmEffectiveSettlementDate, TransactionDetails63.mmEffectiveSettlementDate, SecuritiesTradeDetails31.mmEffectiveSettlementDate,
					SecuritiesTradeDetails38.mmEffectiveSettlementDate, AdditionalInformation9.mmEffectiveDate, SecuritiesTradeDetails39.mmEffectiveSettlementDate, SecuritiesTradeDetails43.mmEffectiveSettlementDate,
					AdditionalInformation10.mmEffectiveDate, TransactionDetails68.mmEffectiveSettlementDate, InvestmentFundTransaction4.mmSettlementDate, DeliverInformation14.mmEffectiveSettlementDate,
					ReceiveInformation14.mmEffectiveSettlementDate, SettlementObligation7.mmIntendedSettlementDate, NetPosition3.mmSettlementDate, SettlementObligation8.mmIntendedSettlementDate,
					UnsecuredMarketTransaction1.mmSettlementDate, SecuredMarketTransaction1.mmSettlementDate, AdditionalInformation11.mmEffectiveDate, IntraPositionDetails31.mmSettlementDate, TransactionDetails78.mmEffectiveSettlementDate,
					InstrumentLeg6.mmLegSettlementDate, IntraPositionDetails33.mmSettlementDate, SecuritiesTradeDetails53.mmEffectiveSettlementDate, SecuritiesTradeDetails55.mmEffectiveSettlementDate,
					IntraPositionDetails34.mmSettlementDate, SettlementTypeAndIdentification20.mmSettlementDate, ReceiveInformation17.mmEffectiveSettlementDate, Transfer31.mmEffectiveSettlementDate,
					DeliverInformation17.mmEffectiveSettlementDate, Transfer33.mmEffectiveSettlementDate, SettlementTypeAndIdentification21.mmSettlementDate, AdditionalInformation12.mmEffectiveDate,
					SecuritiesTradeDetails58.mmEffectiveSettlementDate, IntraPositionDetails35.mmSettlementDate, IntraPositionDetails36.mmSettlementDate, IntraPositionDetails38.mmSettlementDate,
					SecuritiesTradeDetails62.mmEffectiveSettlementDate, TransactionDetails91.mmEffectiveSettlementDate, UnsecuredMarketTransaction2.mmSettlementDate, SecuredMarketTransaction2.mmSettlementDate,
					UnsecuredMarketTransaction3.mmSettlementDate, SecuredMarketTransaction3.mmSettlementDate, TransactionDetails93.mmEffectiveSettlementDate, IntraPositionQueryCriteria6.mmEffectiveSettlementDate,
					IntraPosition5.mmSettlementDate, IntraPositionDetails41.mmSettlementDate, IntraPositionDetails39.mmSettlementDate, AdditionalInformation13.mmEffectiveDate, TransactionDetails95.mmEffectiveSettlementDate,
					IntraPositionDetails43.mmSettlementDate, IntraPositionDetails42.mmSettlementDate, AdditionalInformation14.mmEffectiveDate, TransactionDetails98.mmEffectiveSettlementDate, SecuredMarketTransaction4.mmSettlementDate,
					UnsecuredMarketTransaction4.mmSettlementDate, TradeTransaction15.mmSettlementDate, TradeTransaction17.mmSettlementDate, TradeTransaction14.mmSettlementDate, TradeTransaction18.mmSettlementDate,
					TradeTransaction16.mmSettlementDate, TransactionDetails102.mmEffectiveSettlementDate, ReceiveInformation18.mmEffectiveSettlementDate, Transfer35.mmEffectiveSettlementDate, DeliverInformation18.mmEffectiveSettlementDate,
					IntraPositionDetails46.mmSettlementDate, TransactionDetails103.mmEffectiveSettlementDate, SecuritiesTradeDetails74.mmEffectiveSettlementDate, SecuritiesTradeDetails76.mmEffectiveSettlementDate,
					SettlementTypeAndIdentification25.mmSettlementDate, SettlementTypeAndIdentification26.mmSettlementDate, IntraPositionDetails47.mmSettlementDate, SecuritiesTradeDetails82.mmEffectiveSettlementDate,
					SecuritiesTradeDetails86.mmEffectiveSettlementDate, TransactionDetails112.mmEffectiveSettlementDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::ESET"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementDate";
			definition = "Date and time at which a transaction is completed and cleared. \r\nIt can be an effective settlement date, that is, payment is effected and securities are delivered or an intended settlement date that is, the date and time at which the amount of money is intended to be moved.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlement.class.getMethod("getSettlementDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesSettlementPartyRole> partyRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole#mmSecuritiesSettlement
	 * SecuritiesSettlementPartyRole.mmSecuritiesSettlement}</li>
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
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation2#mmSettlementPartiesDetails
	 * DeliverInformation2.mmSettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation4#mmSettlementPartiesDetails
	 * DeliverInformation4.mmSettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation7#mmSettlementPartiesDetails
	 * DeliverInformation7.mmSettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation2#mmSettlementPartiesDetails
	 * ReceiveInformation2.mmSettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation4#mmSettlementPartiesDetails
	 * ReceiveInformation4.mmSettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation8#mmSettlementPartiesDetails
	 * ReceiveInformation8.mmSettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation6#mmSettlementPartiesDetails
	 * ReceiveInformation6.mmSettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation11#mmSettlementPartiesDetails
	 * ReceiveInformation11.mmSettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation11#mmSettlementPartiesDetails
	 * DeliverInformation11.mmSettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails10#mmDeliveringSettlementParties
	 * TransactionDetails10.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails10#mmReceivingSettlementParties
	 * TransactionDetails10.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails29#mmDeliveringSettlementParties
	 * TransactionDetails29.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails29#mmReceivingSettlementParties
	 * TransactionDetails29.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction1#mmOtherDeliveringSettlementParties
	 * StandingSettlementInstruction1.mmOtherDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction1#mmOtherReceivingSettlementParties
	 * StandingSettlementInstruction1.mmOtherReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails28#mmDeliveringSettlementParties
	 * TransactionDetails28.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails28#mmReceivingSettlementParties
	 * TransactionDetails28.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails31#mmDeliveringSettlementParties
	 * TransactionDetails31.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails31#mmReceivingSettlementParties
	 * TransactionDetails31.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails44#mmDeliveringSettlementParties
	 * TransactionDetails44.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails44#mmReceivingSettlementParties
	 * TransactionDetails44.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation1#mmSettlementPartiesDetails
	 * DeliverInformation1.mmSettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation3#mmSettlementPartiesDetails
	 * DeliverInformation3.mmSettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation8#mmSettlementPartiesDetails
	 * DeliverInformation8.mmSettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation1#mmSettlementPartiesDetails
	 * ReceiveInformation1.mmSettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation3#mmSettlementPartiesDetails
	 * ReceiveInformation3.mmSettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation7#mmSettlementPartiesDetails
	 * ReceiveInformation7.mmSettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation5#mmSettlementPartiesDetails
	 * ReceiveInformation5.mmSettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation9#mmSettlementPartiesDetails
	 * ReceiveInformation9.mmSettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation5#mmSettlementPartiesDetails
	 * DeliverInformation5.mmSettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation9#mmSettlementPartiesDetails
	 * DeliverInformation9.mmSettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation6#mmSettlementPartiesDetails
	 * DeliverInformation6.mmSettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction2#mmOtherDeliveringSettlementParties
	 * StandingSettlementInstruction2.mmOtherDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction2#mmOtherReceivingSettlementParties
	 * StandingSettlementInstruction2.mmOtherReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails5#mmReceivingSettlementParties
	 * TransactionDetails5.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails5#mmDeliveringSettlementParties
	 * TransactionDetails5.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails9#mmReceivingSettlementParties
	 * TransactionDetails9.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails9#mmDeliveringSettlementParties
	 * TransactionDetails9.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails22#mmReceivingSettlementParties
	 * TransactionDetails22.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails22#mmDeliveringSettlementParties
	 * TransactionDetails22.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails23#mmReceivingSettlementParties
	 * TransactionDetails23.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails23#mmDeliveringSettlementParties
	 * TransactionDetails23.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails36#mmReceivingSettlementParties
	 * TransactionDetails36.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails36#mmDeliveringSettlementParties
	 * TransactionDetails36.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails47#mmReceivingSettlementParties
	 * TransactionDetails47.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails47#mmDeliveringSettlementParties
	 * TransactionDetails47.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails53#mmReceivingSettlementParties
	 * TransactionDetails53.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails53#mmDeliveringSettlementParties
	 * TransactionDetails53.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails58#mmReceivingSettlementParties
	 * TransactionDetails58.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails58#mmDeliveringSettlementParties
	 * TransactionDetails58.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails7#mmDeliveringSettlementParties
	 * TransactionDetails7.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails7#mmReceivingSettlementParties
	 * TransactionDetails7.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails8#mmDeliveringSettlementParties
	 * TransactionDetails8.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails8#mmReceivingSettlementParties
	 * TransactionDetails8.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails16#mmDeliveringSettlementParties
	 * TransactionDetails16.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails16#mmReceivingSettlementParties
	 * TransactionDetails16.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails17#mmDeliveringSettlementParties
	 * TransactionDetails17.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails17#mmReceivingSettlementParties
	 * TransactionDetails17.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails26#mmDeliveringSettlementParties
	 * TransactionDetails26.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails26#mmReceivingSettlementParties
	 * TransactionDetails26.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails25#mmDeliveringSettlementParties
	 * TransactionDetails25.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails25#mmReceivingSettlementParties
	 * TransactionDetails25.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails27#mmDeliveringSettlementParties
	 * TransactionDetails27.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails27#mmReceivingSettlementParties
	 * TransactionDetails27.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails33#mmDeliveringSettlementParties
	 * TransactionDetails33.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails33#mmReceivingSettlementParties
	 * TransactionDetails33.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails39#mmDeliveringSettlementParties
	 * TransactionDetails39.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails39#mmReceivingSettlementParties
	 * TransactionDetails39.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails50#mmDeliveringSettlementParties
	 * TransactionDetails50.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails50#mmReceivingSettlementParties
	 * TransactionDetails50.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails56#mmDeliveringSettlementParties
	 * TransactionDetails56.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails56#mmReceivingSettlementParties
	 * TransactionDetails56.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails59#mmDeliveringSettlementParties
	 * TransactionDetails59.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails59#mmReceivingSettlementParties
	 * TransactionDetails59.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails6#mmDeliveringSettlementParties
	 * TransactionDetails6.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails6#mmReceivingSettlementParties
	 * TransactionDetails6.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails18#mmDeliveringSettlementParties
	 * TransactionDetails18.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails18#mmReceivingSettlementParties
	 * TransactionDetails18.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails24#mmDeliveringSettlementParties
	 * TransactionDetails24.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails24#mmReceivingSettlementParties
	 * TransactionDetails24.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails34#mmDeliveringSettlementParties
	 * TransactionDetails34.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails34#mmReceivingSettlementParties
	 * TransactionDetails34.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails37#mmDeliveringSettlementParties
	 * TransactionDetails37.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails37#mmReceivingSettlementParties
	 * TransactionDetails37.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails48#mmDeliveringSettlementParties
	 * TransactionDetails48.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails48#mmReceivingSettlementParties
	 * TransactionDetails48.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails57#mmDeliveringSettlementParties
	 * TransactionDetails57.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails57#mmReceivingSettlementParties
	 * TransactionDetails57.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails60#mmDeliveringSettlementParties
	 * TransactionDetails60.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails60#mmReceivingSettlementParties
	 * TransactionDetails60.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters3#mmReceivingSideDetails
	 * FundSettlementParameters3.mmReceivingSideDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters3#mmDeliveringSideDetails
	 * FundSettlementParameters3.mmDeliveringSideDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters4#mmReceivingSideDetails
	 * FundSettlementParameters4.mmReceivingSideDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters4#mmDeliveringSideDetails
	 * FundSettlementParameters4.mmDeliveringSideDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails7#mmDeliveringSettlementParties
	 * SecuritiesTradeDetails7.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails7#mmReceivingSettlementParties
	 * SecuritiesTradeDetails7.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails19#mmDeliveringSettlementParties
	 * SecuritiesTradeDetails19.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails19#mmReceivingSettlementParties
	 * SecuritiesTradeDetails19.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails4#mmDeliveringSettlementParties
	 * SecuritiesTradeDetails4.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails4#mmReceivingSettlementParties
	 * SecuritiesTradeDetails4.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails17#mmDeliveringSettlementParties
	 * SecuritiesTradeDetails17.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails17#mmReceivingSettlementParties
	 * SecuritiesTradeDetails17.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails4#mmDeliveringSettlementParties
	 * TransactionDetails4.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails4#mmReceivingSettlementParties
	 * TransactionDetails4.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails30#mmDeliveringSettlementParties
	 * TransactionDetails30.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails30#mmReceivingSettlementParties
	 * TransactionDetails30.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails20#mmDeliveringSettlementParties
	 * TransactionDetails20.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails20#mmReceivingSettlementParties
	 * TransactionDetails20.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails10#mmDeliveringSettlementParties
	 * SecuritiesTradeDetails10.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails10#mmReceivingSettlementParties
	 * SecuritiesTradeDetails10.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails22#mmDeliveringSettlementParties
	 * SecuritiesTradeDetails22.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails22#mmReceivingSettlementParties
	 * SecuritiesTradeDetails22.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails23#mmDeliveringSettlementParties
	 * SecuritiesTradeDetails23.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails23#mmReceivingSettlementParties
	 * SecuritiesTradeDetails23.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails29#mmDeliveringSettlementParties
	 * SecuritiesTradeDetails29.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails29#mmReceivingSettlementParties
	 * SecuritiesTradeDetails29.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails40#mmDeliveringSettlementParties
	 * TransactionDetails40.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails40#mmReceivingSettlementParties
	 * TransactionDetails40.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails42#mmDeliveringSettlementParties
	 * TransactionDetails42.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails42#mmReceivingSettlementParties
	 * TransactionDetails42.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails46#mmDeliveringSettlementParties
	 * TransactionDetails46.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails46#mmReceivingSettlementParties
	 * TransactionDetails46.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails32#mmDeliveringSettlementParties
	 * TransactionDetails32.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails32#mmReceivingSettlementParties
	 * TransactionDetails32.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails14#mmDeliveringSettlementParties
	 * TransactionDetails14.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails14#mmReceivingSettlementParties
	 * TransactionDetails14.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails35#mmDeliveringSettlementParties
	 * TransactionDetails35.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails35#mmReceivingSettlementParties
	 * TransactionDetails35.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails14#mmDeliveringSettlementParties
	 * SecuritiesTradeDetails14.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails14#mmReceivingSettlementParties
	 * SecuritiesTradeDetails14.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails20#mmDeliveringSettlementParties
	 * SecuritiesTradeDetails20.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails20#mmReceivingSettlementParties
	 * SecuritiesTradeDetails20.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails24#mmDeliveringSettlementParties
	 * SecuritiesTradeDetails24.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails24#mmReceivingSettlementParties
	 * SecuritiesTradeDetails24.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails30#mmDeliveringSettlementParties
	 * SecuritiesTradeDetails30.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails30#mmReceivingSettlementParties
	 * SecuritiesTradeDetails30.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails45#mmDeliveringSettlementParties
	 * TransactionDetails45.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails45#mmReceivingSettlementParties
	 * TransactionDetails45.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation4#mmSettlementParties
	 * SettlementObligation4.mmSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters7#mmDeliveringSideDetails
	 * FundSettlementParameters7.mmDeliveringSideDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters8#mmReceivingSideDetails
	 * FundSettlementParameters8.mmReceivingSideDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters5#mmReceivingSideDetails
	 * FundSettlementParameters5.mmReceivingSideDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters5#mmDeliveringSideDetails
	 * FundSettlementParameters5.mmDeliveringSideDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters6#mmReceivingSideDetails
	 * FundSettlementParameters6.mmReceivingSideDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters6#mmDeliveringSideDetails
	 * FundSettlementParameters6.mmDeliveringSideDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails51#mmDeliveringSettlementParties
	 * TransactionDetails51.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails51#mmReceivingSettlementParties
	 * TransactionDetails51.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails52#mmDeliveringSettlementParties
	 * TransactionDetails52.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails52#mmReceivingSettlementParties
	 * TransactionDetails52.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason5#mmReceivingSettlementParties
	 * OrderStatusAndReason5.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason5#mmDeliveringSettlementParties
	 * OrderStatusAndReason5.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation13#mmSettlementPartiesDetails
	 * ReceiveInformation13.mmSettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation12#mmSettlementPartiesDetails
	 * ReceiveInformation12.mmSettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation12#mmSettlementPartiesDetails
	 * DeliverInformation12.mmSettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation13#mmSettlementPartiesDetails
	 * DeliverInformation13.mmSettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails61#mmReceivingSettlementParties
	 * TransactionDetails61.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails61#mmDeliveringSettlementParties
	 * TransactionDetails61.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails62#mmDeliveringSettlementParties
	 * TransactionDetails62.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails62#mmReceivingSettlementParties
	 * TransactionDetails62.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails63#mmDeliveringSettlementParties
	 * TransactionDetails63.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails63#mmReceivingSettlementParties
	 * TransactionDetails63.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails35#mmDeliveringSettlementParties
	 * SecuritiesTradeDetails35.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails35#mmReceivingSettlementParties
	 * SecuritiesTradeDetails35.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails66#mmReceivingSettlementParties
	 * TransactionDetails66.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails66#mmDeliveringSettlementParties
	 * TransactionDetails66.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails42#mmDeliveringSettlementParties
	 * SecuritiesTradeDetails42.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails42#mmReceivingSettlementParties
	 * SecuritiesTradeDetails42.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails67#mmDeliveringSettlementParties
	 * TransactionDetails67.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails67#mmReceivingSettlementParties
	 * TransactionDetails67.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails68#mmDeliveringSettlementParties
	 * TransactionDetails68.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails68#mmReceivingSettlementParties
	 * TransactionDetails68.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation15#mmSettlementPartiesDetails
	 * DeliverInformation15.mmSettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation14#mmSettlementPartiesDetails
	 * DeliverInformation14.mmSettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation15#mmSettlementPartiesDetails
	 * ReceiveInformation15.mmSettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation14#mmSettlementPartiesDetails
	 * ReceiveInformation14.mmSettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails70#mmReceivingSettlementParties
	 * TransactionDetails70.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails70#mmDeliveringSettlementParties
	 * TransactionDetails70.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails69#mmDeliveringSettlementParties
	 * TransactionDetails69.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails69#mmReceivingSettlementParties
	 * TransactionDetails69.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation8#mmSettlementParties
	 * SettlementObligation8.mmSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails88#mmSettlementParties
	 * SettlementDetails88.mmSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails71#mmReceivingSettlementParties
	 * TransactionDetails71.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails71#mmDeliveringSettlementParties
	 * TransactionDetails71.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails72#mmDeliveringSettlementParties
	 * TransactionDetails72.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails72#mmReceivingSettlementParties
	 * TransactionDetails72.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails81#mmDeliveringSettlementParties
	 * TransactionDetails81.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails81#mmReceivingSettlementParties
	 * TransactionDetails81.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails74#mmDeliveringSettlementParties
	 * TransactionDetails74.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails74#mmReceivingSettlementParties
	 * TransactionDetails74.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails49#mmDeliveringSettlementParties
	 * SecuritiesTradeDetails49.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails49#mmReceivingSettlementParties
	 * SecuritiesTradeDetails49.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails82#mmDeliveringSettlementParties
	 * TransactionDetails82.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails82#mmReceivingSettlementParties
	 * TransactionDetails82.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails79#mmReceivingSettlementParties
	 * TransactionDetails79.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails79#mmDeliveringSettlementParties
	 * TransactionDetails79.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48#mmDeliveringSettlementParties
	 * SecuritiesTradeDetails48.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48#mmReceivingSettlementParties
	 * SecuritiesTradeDetails48.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails80#mmDeliveringSettlementParties
	 * TransactionDetails80.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails80#mmReceivingSettlementParties
	 * TransactionDetails80.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails75#mmDeliveringSettlementParties
	 * TransactionDetails75.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails75#mmReceivingSettlementParties
	 * TransactionDetails75.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails78#mmDeliveringSettlementParties
	 * TransactionDetails78.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails78#mmReceivingSettlementParties
	 * TransactionDetails78.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation17#mmSettlementPartiesDetails
	 * ReceiveInformation17.mmSettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation16#mmSettlementPartiesDetails
	 * ReceiveInformation16.mmSettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount56#mmSettlementPartiesDetails
	 * InvestmentAccount56.mmSettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation16#mmSettlementPartiesDetails
	 * DeliverInformation16.mmSettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation17#mmSettlementPartiesDetails
	 * DeliverInformation17.mmSettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument48#mmSettlementPartiesReceivingSideDetails
	 * FinancialInstrument48.mmSettlementPartiesReceivingSideDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument46#mmSettlementPartiesReceivingSideDetails
	 * FinancialInstrument46.mmSettlementPartiesReceivingSideDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails102#mmSettlementParties
	 * SettlementDetails102.mmSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails57#mmDeliveringSettlementParties
	 * SecuritiesTradeDetails57.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails57#mmReceivingSettlementParties
	 * SecuritiesTradeDetails57.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails88#mmDeliveringSettlementParties
	 * TransactionDetails88.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails88#mmReceivingSettlementParties
	 * TransactionDetails88.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails61#mmDeliveringSettlementParties
	 * SecuritiesTradeDetails61.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails61#mmReceivingSettlementParties
	 * SecuritiesTradeDetails61.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails92#mmDeliveringSettlementParties
	 * TransactionDetails92.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails92#mmReceivingSettlementParties
	 * TransactionDetails92.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails84#mmDeliveringSettlementParties
	 * TransactionDetails84.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails84#mmReceivingSettlementParties
	 * TransactionDetails84.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails83#mmDeliveringSettlementParties
	 * TransactionDetails83.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails83#mmReceivingSettlementParties
	 * TransactionDetails83.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails87#mmReceivingSettlementParties
	 * TransactionDetails87.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails87#mmDeliveringSettlementParties
	 * TransactionDetails87.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails91#mmDeliveringSettlementParties
	 * TransactionDetails91.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails91#mmReceivingSettlementParties
	 * TransactionDetails91.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails90#mmDeliveringSettlementParties
	 * TransactionDetails90.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails90#mmReceivingSettlementParties
	 * TransactionDetails90.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails93#mmDeliveringSettlementParties
	 * TransactionDetails93.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails93#mmReceivingSettlementParties
	 * TransactionDetails93.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails94#mmDeliveringSettlementParties
	 * TransactionDetails94.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails94#mmReceivingSettlementParties
	 * TransactionDetails94.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters11#mmReceivingSideDetails
	 * FundSettlementParameters11.mmReceivingSideDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters11#mmDeliveringSideDetails
	 * FundSettlementParameters11.mmDeliveringSideDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters12#mmReceivingSideDetails
	 * FundSettlementParameters12.mmReceivingSideDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters12#mmDeliveringSideDetails
	 * FundSettlementParameters12.mmDeliveringSideDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#mmDeliveringSettlementParties
	 * SecuritiesTradeDetails68.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#mmReceivingSettlementParties
	 * SecuritiesTradeDetails68.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails97#mmReceivingSettlementParties
	 * TransactionDetails97.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails97#mmDeliveringSettlementParties
	 * TransactionDetails97.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails96#mmDeliveringSettlementParties
	 * TransactionDetails96.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails96#mmReceivingSettlementParties
	 * TransactionDetails96.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails95#mmDeliveringSettlementParties
	 * TransactionDetails95.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails95#mmReceivingSettlementParties
	 * TransactionDetails95.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails118#mmSettlementParties
	 * SettlementDetails118.mmSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails69#mmDeliveringSettlementParties
	 * SecuritiesTradeDetails69.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails69#mmReceivingSettlementParties
	 * SecuritiesTradeDetails69.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails100#mmReceivingSettlementParties
	 * TransactionDetails100.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails100#mmDeliveringSettlementParties
	 * TransactionDetails100.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails99#mmDeliveringSettlementParties
	 * TransactionDetails99.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails99#mmReceivingSettlementParties
	 * TransactionDetails99.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails98#mmDeliveringSettlementParties
	 * TransactionDetails98.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails98#mmReceivingSettlementParties
	 * TransactionDetails98.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails102#mmDeliveringSettlementParties
	 * TransactionDetails102.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails102#mmReceivingSettlementParties
	 * TransactionDetails102.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation18#mmSettlementPartiesDetails
	 * ReceiveInformation18.mmSettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount67#mmSettlementPartiesDetails
	 * InvestmentAccount67.mmSettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation19#mmSettlementPartiesDetails
	 * DeliverInformation19.mmSettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation19#mmSettlementPartiesDetails
	 * ReceiveInformation19.mmSettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation18#mmSettlementPartiesDetails
	 * DeliverInformation18.mmSettlementPartiesDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument60#mmSettlementPartiesReceivingSideDetails
	 * FinancialInstrument60.mmSettlementPartiesReceivingSideDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument65#mmSettlementPartiesReceivingSideDetails
	 * FinancialInstrument65.mmSettlementPartiesReceivingSideDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails71#mmDeliveringSettlementParties
	 * SecuritiesTradeDetails71.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails71#mmReceivingSettlementParties
	 * SecuritiesTradeDetails71.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails105#mmReceivingSettlementParties
	 * TransactionDetails105.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails105#mmDeliveringSettlementParties
	 * TransactionDetails105.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails72#mmDeliveringSettlementParties
	 * SecuritiesTradeDetails72.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails72#mmReceivingSettlementParties
	 * SecuritiesTradeDetails72.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails104#mmDeliveringSettlementParties
	 * TransactionDetails104.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails104#mmReceivingSettlementParties
	 * TransactionDetails104.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails103#mmDeliveringSettlementParties
	 * TransactionDetails103.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails103#mmReceivingSettlementParties
	 * TransactionDetails103.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails107#mmDeliveringSettlementParties
	 * TransactionDetails107.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails107#mmReceivingSettlementParties
	 * TransactionDetails107.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails81#mmDeliveringSettlementParties
	 * SecuritiesTradeDetails81.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails81#mmReceivingSettlementParties
	 * SecuritiesTradeDetails81.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails85#mmDeliveringSettlementParties
	 * SecuritiesTradeDetails85.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails85#mmReceivingSettlementParties
	 * SecuritiesTradeDetails85.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails109#mmDeliveringSettlementParties
	 * TransactionDetails109.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails109#mmReceivingSettlementParties
	 * TransactionDetails109.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails110#mmReceivingSettlementParties
	 * TransactionDetails110.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails110#mmDeliveringSettlementParties
	 * TransactionDetails110.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails111#mmDeliveringSettlementParties
	 * TransactionDetails111.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails111#mmReceivingSettlementParties
	 * TransactionDetails111.mmReceivingSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails112#mmDeliveringSettlementParties
	 * TransactionDetails112.mmDeliveringSettlementParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails112#mmReceivingSettlementParties
	 * TransactionDetails112.mmReceivingSettlementParties}</li>
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
	public static final MMBusinessAssociationEnd mmPartyRole = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(DeliverInformation2.mmSettlementPartiesDetails, DeliverInformation4.mmSettlementPartiesDetails, DeliverInformation7.mmSettlementPartiesDetails,
					ReceiveInformation2.mmSettlementPartiesDetails, ReceiveInformation4.mmSettlementPartiesDetails, ReceiveInformation8.mmSettlementPartiesDetails, ReceiveInformation6.mmSettlementPartiesDetails,
					ReceiveInformation11.mmSettlementPartiesDetails, DeliverInformation11.mmSettlementPartiesDetails, TransactionDetails10.mmDeliveringSettlementParties, TransactionDetails10.mmReceivingSettlementParties,
					TransactionDetails29.mmDeliveringSettlementParties, TransactionDetails29.mmReceivingSettlementParties, StandingSettlementInstruction1.mmOtherDeliveringSettlementParties,
					StandingSettlementInstruction1.mmOtherReceivingSettlementParties, TransactionDetails28.mmDeliveringSettlementParties, TransactionDetails28.mmReceivingSettlementParties,
					TransactionDetails31.mmDeliveringSettlementParties, TransactionDetails31.mmReceivingSettlementParties, TransactionDetails44.mmDeliveringSettlementParties, TransactionDetails44.mmReceivingSettlementParties,
					DeliverInformation1.mmSettlementPartiesDetails, DeliverInformation3.mmSettlementPartiesDetails, DeliverInformation8.mmSettlementPartiesDetails, ReceiveInformation1.mmSettlementPartiesDetails,
					ReceiveInformation3.mmSettlementPartiesDetails, ReceiveInformation7.mmSettlementPartiesDetails, ReceiveInformation5.mmSettlementPartiesDetails, ReceiveInformation9.mmSettlementPartiesDetails,
					DeliverInformation5.mmSettlementPartiesDetails, DeliverInformation9.mmSettlementPartiesDetails, DeliverInformation6.mmSettlementPartiesDetails, StandingSettlementInstruction2.mmOtherDeliveringSettlementParties,
					StandingSettlementInstruction2.mmOtherReceivingSettlementParties, TransactionDetails5.mmReceivingSettlementParties, TransactionDetails5.mmDeliveringSettlementParties, TransactionDetails9.mmReceivingSettlementParties,
					TransactionDetails9.mmDeliveringSettlementParties, TransactionDetails22.mmReceivingSettlementParties, TransactionDetails22.mmDeliveringSettlementParties, TransactionDetails23.mmReceivingSettlementParties,
					TransactionDetails23.mmDeliveringSettlementParties, TransactionDetails36.mmReceivingSettlementParties, TransactionDetails36.mmDeliveringSettlementParties, TransactionDetails47.mmReceivingSettlementParties,
					TransactionDetails47.mmDeliveringSettlementParties, TransactionDetails53.mmReceivingSettlementParties, TransactionDetails53.mmDeliveringSettlementParties, TransactionDetails58.mmReceivingSettlementParties,
					TransactionDetails58.mmDeliveringSettlementParties, TransactionDetails7.mmDeliveringSettlementParties, TransactionDetails7.mmReceivingSettlementParties, TransactionDetails8.mmDeliveringSettlementParties,
					TransactionDetails8.mmReceivingSettlementParties, TransactionDetails16.mmDeliveringSettlementParties, TransactionDetails16.mmReceivingSettlementParties, TransactionDetails17.mmDeliveringSettlementParties,
					TransactionDetails17.mmReceivingSettlementParties, TransactionDetails26.mmDeliveringSettlementParties, TransactionDetails26.mmReceivingSettlementParties, TransactionDetails25.mmDeliveringSettlementParties,
					TransactionDetails25.mmReceivingSettlementParties, TransactionDetails27.mmDeliveringSettlementParties, TransactionDetails27.mmReceivingSettlementParties, TransactionDetails33.mmDeliveringSettlementParties,
					TransactionDetails33.mmReceivingSettlementParties, TransactionDetails39.mmDeliveringSettlementParties, TransactionDetails39.mmReceivingSettlementParties, TransactionDetails50.mmDeliveringSettlementParties,
					TransactionDetails50.mmReceivingSettlementParties, TransactionDetails56.mmDeliveringSettlementParties, TransactionDetails56.mmReceivingSettlementParties, TransactionDetails59.mmDeliveringSettlementParties,
					TransactionDetails59.mmReceivingSettlementParties, TransactionDetails6.mmDeliveringSettlementParties, TransactionDetails6.mmReceivingSettlementParties, TransactionDetails18.mmDeliveringSettlementParties,
					TransactionDetails18.mmReceivingSettlementParties, TransactionDetails24.mmDeliveringSettlementParties, TransactionDetails24.mmReceivingSettlementParties, TransactionDetails34.mmDeliveringSettlementParties,
					TransactionDetails34.mmReceivingSettlementParties, TransactionDetails37.mmDeliveringSettlementParties, TransactionDetails37.mmReceivingSettlementParties, TransactionDetails48.mmDeliveringSettlementParties,
					TransactionDetails48.mmReceivingSettlementParties, TransactionDetails57.mmDeliveringSettlementParties, TransactionDetails57.mmReceivingSettlementParties, TransactionDetails60.mmDeliveringSettlementParties,
					TransactionDetails60.mmReceivingSettlementParties, FundSettlementParameters3.mmReceivingSideDetails, FundSettlementParameters3.mmDeliveringSideDetails, FundSettlementParameters4.mmReceivingSideDetails,
					FundSettlementParameters4.mmDeliveringSideDetails, SecuritiesTradeDetails7.mmDeliveringSettlementParties, SecuritiesTradeDetails7.mmReceivingSettlementParties, SecuritiesTradeDetails19.mmDeliveringSettlementParties,
					SecuritiesTradeDetails19.mmReceivingSettlementParties, SecuritiesTradeDetails4.mmDeliveringSettlementParties, SecuritiesTradeDetails4.mmReceivingSettlementParties, SecuritiesTradeDetails17.mmDeliveringSettlementParties,
					SecuritiesTradeDetails17.mmReceivingSettlementParties, TransactionDetails4.mmDeliveringSettlementParties, TransactionDetails4.mmReceivingSettlementParties, TransactionDetails30.mmDeliveringSettlementParties,
					TransactionDetails30.mmReceivingSettlementParties, TransactionDetails20.mmDeliveringSettlementParties, TransactionDetails20.mmReceivingSettlementParties, SecuritiesTradeDetails10.mmDeliveringSettlementParties,
					SecuritiesTradeDetails10.mmReceivingSettlementParties, SecuritiesTradeDetails22.mmDeliveringSettlementParties, SecuritiesTradeDetails22.mmReceivingSettlementParties,
					SecuritiesTradeDetails23.mmDeliveringSettlementParties, SecuritiesTradeDetails23.mmReceivingSettlementParties, SecuritiesTradeDetails29.mmDeliveringSettlementParties,
					SecuritiesTradeDetails29.mmReceivingSettlementParties, TransactionDetails40.mmDeliveringSettlementParties, TransactionDetails40.mmReceivingSettlementParties, TransactionDetails42.mmDeliveringSettlementParties,
					TransactionDetails42.mmReceivingSettlementParties, TransactionDetails46.mmDeliveringSettlementParties, TransactionDetails46.mmReceivingSettlementParties, TransactionDetails32.mmDeliveringSettlementParties,
					TransactionDetails32.mmReceivingSettlementParties, TransactionDetails14.mmDeliveringSettlementParties, TransactionDetails14.mmReceivingSettlementParties, TransactionDetails35.mmDeliveringSettlementParties,
					TransactionDetails35.mmReceivingSettlementParties, SecuritiesTradeDetails14.mmDeliveringSettlementParties, SecuritiesTradeDetails14.mmReceivingSettlementParties, SecuritiesTradeDetails20.mmDeliveringSettlementParties,
					SecuritiesTradeDetails20.mmReceivingSettlementParties, SecuritiesTradeDetails24.mmDeliveringSettlementParties, SecuritiesTradeDetails24.mmReceivingSettlementParties,
					SecuritiesTradeDetails30.mmDeliveringSettlementParties, SecuritiesTradeDetails30.mmReceivingSettlementParties, TransactionDetails45.mmDeliveringSettlementParties, TransactionDetails45.mmReceivingSettlementParties,
					SettlementObligation4.mmSettlementParties, FundSettlementParameters7.mmDeliveringSideDetails, FundSettlementParameters8.mmReceivingSideDetails, FundSettlementParameters5.mmReceivingSideDetails,
					FundSettlementParameters5.mmDeliveringSideDetails, FundSettlementParameters6.mmReceivingSideDetails, FundSettlementParameters6.mmDeliveringSideDetails, TransactionDetails51.mmDeliveringSettlementParties,
					TransactionDetails51.mmReceivingSettlementParties, TransactionDetails52.mmDeliveringSettlementParties, TransactionDetails52.mmReceivingSettlementParties, OrderStatusAndReason5.mmReceivingSettlementParties,
					OrderStatusAndReason5.mmDeliveringSettlementParties, ReceiveInformation13.mmSettlementPartiesDetails, ReceiveInformation12.mmSettlementPartiesDetails, DeliverInformation12.mmSettlementPartiesDetails,
					DeliverInformation13.mmSettlementPartiesDetails, TransactionDetails61.mmReceivingSettlementParties, TransactionDetails61.mmDeliveringSettlementParties, TransactionDetails62.mmDeliveringSettlementParties,
					TransactionDetails62.mmReceivingSettlementParties, TransactionDetails63.mmDeliveringSettlementParties, TransactionDetails63.mmReceivingSettlementParties, SecuritiesTradeDetails35.mmDeliveringSettlementParties,
					SecuritiesTradeDetails35.mmReceivingSettlementParties, TransactionDetails66.mmReceivingSettlementParties, TransactionDetails66.mmDeliveringSettlementParties, SecuritiesTradeDetails42.mmDeliveringSettlementParties,
					SecuritiesTradeDetails42.mmReceivingSettlementParties, TransactionDetails67.mmDeliveringSettlementParties, TransactionDetails67.mmReceivingSettlementParties, TransactionDetails68.mmDeliveringSettlementParties,
					TransactionDetails68.mmReceivingSettlementParties, DeliverInformation15.mmSettlementPartiesDetails, DeliverInformation14.mmSettlementPartiesDetails, ReceiveInformation15.mmSettlementPartiesDetails,
					ReceiveInformation14.mmSettlementPartiesDetails, TransactionDetails70.mmReceivingSettlementParties, TransactionDetails70.mmDeliveringSettlementParties, TransactionDetails69.mmDeliveringSettlementParties,
					TransactionDetails69.mmReceivingSettlementParties, SettlementObligation8.mmSettlementParties, SettlementDetails88.mmSettlementParties, TransactionDetails71.mmReceivingSettlementParties,
					TransactionDetails71.mmDeliveringSettlementParties, TransactionDetails72.mmDeliveringSettlementParties, TransactionDetails72.mmReceivingSettlementParties, TransactionDetails81.mmDeliveringSettlementParties,
					TransactionDetails81.mmReceivingSettlementParties, TransactionDetails74.mmDeliveringSettlementParties, TransactionDetails74.mmReceivingSettlementParties, SecuritiesTradeDetails49.mmDeliveringSettlementParties,
					SecuritiesTradeDetails49.mmReceivingSettlementParties, TransactionDetails82.mmDeliveringSettlementParties, TransactionDetails82.mmReceivingSettlementParties, TransactionDetails79.mmReceivingSettlementParties,
					TransactionDetails79.mmDeliveringSettlementParties, SecuritiesTradeDetails48.mmDeliveringSettlementParties, SecuritiesTradeDetails48.mmReceivingSettlementParties, TransactionDetails80.mmDeliveringSettlementParties,
					TransactionDetails80.mmReceivingSettlementParties, TransactionDetails75.mmDeliveringSettlementParties, TransactionDetails75.mmReceivingSettlementParties, TransactionDetails78.mmDeliveringSettlementParties,
					TransactionDetails78.mmReceivingSettlementParties, ReceiveInformation17.mmSettlementPartiesDetails, ReceiveInformation16.mmSettlementPartiesDetails, InvestmentAccount56.mmSettlementPartiesDetails,
					DeliverInformation16.mmSettlementPartiesDetails, DeliverInformation17.mmSettlementPartiesDetails, FinancialInstrument48.mmSettlementPartiesReceivingSideDetails,
					FinancialInstrument46.mmSettlementPartiesReceivingSideDetails, SettlementDetails102.mmSettlementParties, SecuritiesTradeDetails57.mmDeliveringSettlementParties, SecuritiesTradeDetails57.mmReceivingSettlementParties,
					TransactionDetails88.mmDeliveringSettlementParties, TransactionDetails88.mmReceivingSettlementParties, SecuritiesTradeDetails61.mmDeliveringSettlementParties, SecuritiesTradeDetails61.mmReceivingSettlementParties,
					TransactionDetails92.mmDeliveringSettlementParties, TransactionDetails92.mmReceivingSettlementParties, TransactionDetails84.mmDeliveringSettlementParties, TransactionDetails84.mmReceivingSettlementParties,
					TransactionDetails83.mmDeliveringSettlementParties, TransactionDetails83.mmReceivingSettlementParties, TransactionDetails87.mmReceivingSettlementParties, TransactionDetails87.mmDeliveringSettlementParties,
					TransactionDetails91.mmDeliveringSettlementParties, TransactionDetails91.mmReceivingSettlementParties, TransactionDetails90.mmDeliveringSettlementParties, TransactionDetails90.mmReceivingSettlementParties,
					TransactionDetails93.mmDeliveringSettlementParties, TransactionDetails93.mmReceivingSettlementParties, TransactionDetails94.mmDeliveringSettlementParties, TransactionDetails94.mmReceivingSettlementParties,
					FundSettlementParameters11.mmReceivingSideDetails, FundSettlementParameters11.mmDeliveringSideDetails, FundSettlementParameters12.mmReceivingSideDetails, FundSettlementParameters12.mmDeliveringSideDetails,
					SecuritiesTradeDetails68.mmDeliveringSettlementParties, SecuritiesTradeDetails68.mmReceivingSettlementParties, TransactionDetails97.mmReceivingSettlementParties, TransactionDetails97.mmDeliveringSettlementParties,
					TransactionDetails96.mmDeliveringSettlementParties, TransactionDetails96.mmReceivingSettlementParties, TransactionDetails95.mmDeliveringSettlementParties, TransactionDetails95.mmReceivingSettlementParties,
					SettlementDetails118.mmSettlementParties, SecuritiesTradeDetails69.mmDeliveringSettlementParties, SecuritiesTradeDetails69.mmReceivingSettlementParties, TransactionDetails100.mmReceivingSettlementParties,
					TransactionDetails100.mmDeliveringSettlementParties, TransactionDetails99.mmDeliveringSettlementParties, TransactionDetails99.mmReceivingSettlementParties, TransactionDetails98.mmDeliveringSettlementParties,
					TransactionDetails98.mmReceivingSettlementParties, TransactionDetails102.mmDeliveringSettlementParties, TransactionDetails102.mmReceivingSettlementParties, ReceiveInformation18.mmSettlementPartiesDetails,
					InvestmentAccount67.mmSettlementPartiesDetails, DeliverInformation19.mmSettlementPartiesDetails, ReceiveInformation19.mmSettlementPartiesDetails, DeliverInformation18.mmSettlementPartiesDetails,
					FinancialInstrument60.mmSettlementPartiesReceivingSideDetails, FinancialInstrument65.mmSettlementPartiesReceivingSideDetails, SecuritiesTradeDetails71.mmDeliveringSettlementParties,
					SecuritiesTradeDetails71.mmReceivingSettlementParties, TransactionDetails105.mmReceivingSettlementParties, TransactionDetails105.mmDeliveringSettlementParties, SecuritiesTradeDetails72.mmDeliveringSettlementParties,
					SecuritiesTradeDetails72.mmReceivingSettlementParties, TransactionDetails104.mmDeliveringSettlementParties, TransactionDetails104.mmReceivingSettlementParties, TransactionDetails103.mmDeliveringSettlementParties,
					TransactionDetails103.mmReceivingSettlementParties, TransactionDetails107.mmDeliveringSettlementParties, TransactionDetails107.mmReceivingSettlementParties, SecuritiesTradeDetails81.mmDeliveringSettlementParties,
					SecuritiesTradeDetails81.mmReceivingSettlementParties, SecuritiesTradeDetails85.mmDeliveringSettlementParties, SecuritiesTradeDetails85.mmReceivingSettlementParties, TransactionDetails109.mmDeliveringSettlementParties,
					TransactionDetails109.mmReceivingSettlementParties, TransactionDetails110.mmReceivingSettlementParties, TransactionDetails110.mmDeliveringSettlementParties, TransactionDetails111.mmDeliveringSettlementParties,
					TransactionDetails111.mmReceivingSettlementParties, TransactionDetails112.mmDeliveringSettlementParties, TransactionDetails112.mmReceivingSettlementParties);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies each role linked to the settlement of securities and played by a party at that step in a securities transaction flow.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlementPartyRole.mmSecuritiesSettlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlementPartyRole.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount settlementAmount;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation4#mmSettlementAmount
	 * DeliverInformation4.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation7#mmSettlementAmount
	 * DeliverInformation7.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation4#mmSettlementAmount
	 * ReceiveInformation4.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation8#mmSettlementAmount
	 * ReceiveInformation8.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation6#mmSettlementAmount
	 * ReceiveInformation6.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation11#mmSettlementAmount
	 * ReceiveInformation11.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation11#mmSettlementAmount
	 * DeliverInformation11.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection8#mmAmount
	 * AmountAndDirection8.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails10#mmSettlementAmount
	 * TransactionDetails10.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails29#mmSettlementAmount
	 * TransactionDetails29.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection32#mmAmount
	 * AmountAndDirection32.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection9#mmAmount
	 * AmountAndDirection9.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails3#mmSettlementAmount
	 * SecuritiesSettlementTransactionDetails3.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails4#mmSettlementAmount
	 * SecuritiesSettlementTransactionDetails4.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails2#mmSettlementAmount
	 * SecuritiesSettlementTransactionDetails2.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails28#mmSettlementAmount
	 * TransactionDetails28.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection12#mmAmount
	 * AmountAndDirection12.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails31#mmSettlementAmount
	 * TransactionDetails31.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails44#mmSettlementAmount
	 * TransactionDetails44.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection33#mmAmount
	 * AmountAndDirection33.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection17#mmAmount
	 * AmountAndDirection17.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails5#mmSettlementAmount
	 * SecuritiesSettlementTransactionDetails5.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails6#mmSettlementAmount
	 * SecuritiesSettlementTransactionDetails6.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails7#mmSettlementAmount
	 * SecuritiesSettlementTransactionDetails7.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation3#mmSettlementAmount
	 * DeliverInformation3.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation8#mmSettlementAmount
	 * DeliverInformation8.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation3#mmSettlementAmount
	 * ReceiveInformation3.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation7#mmSettlementAmount
	 * ReceiveInformation7.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation5#mmSettlementAmount
	 * ReceiveInformation5.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation9#mmSettlementAmount
	 * ReceiveInformation9.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation5#mmSettlementAmount
	 * DeliverInformation5.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation9#mmSettlementAmount
	 * DeliverInformation9.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation6#mmSettlementAmount
	 * DeliverInformation6.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails2#mmRemainingToBeSettledQuantity
	 * IntraPositionDetails2.mmRemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails8#mmRemainingToBeSettledQuantity
	 * IntraPositionDetails8.mmRemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails12#mmRemainingToBeSettledQuantity
	 * IntraPositionDetails12.mmRemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection24#mmAmount
	 * AmountAndDirection24.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails13#mmRemainingToBeSettledQuantity
	 * IntraPositionDetails13.mmRemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails22#mmRemainingToBeSettledQuantity
	 * IntraPositionDetails22.mmRemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails26#mmRemainingToBeSettledQuantity
	 * IntraPositionDetails26.mmRemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails27#mmRemainingToBeSettledQuantity
	 * IntraPositionDetails27.mmRemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails29#mmRemainingToBeSettledQuantity
	 * IntraPositionDetails29.mmRemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection6#mmAmount
	 * AmountAndDirection6.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection14#mmAmount
	 * AmountAndDirection14.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection5#mmAmount
	 * AmountAndDirection5.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount6#mmPreviouslySettledAmount
	 * QuantityAndAccount6.mmPreviouslySettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount6#mmRemainingToBeSettledAmount
	 * QuantityAndAccount6.mmRemainingToBeSettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection4#mmAmount
	 * AmountAndDirection4.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection2#mmAmount
	 * AmountAndDirection2.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection19#mmAmount
	 * AmountAndDirection19.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount11#mmPreviouslySettledAmount
	 * QuantityAndAccount11.mmPreviouslySettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount11#mmRemainingToBeSettledAmount
	 * QuantityAndAccount11.mmRemainingToBeSettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection13#mmAmount
	 * AmountAndDirection13.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection16#mmAmount
	 * AmountAndDirection16.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount18#mmPreviouslySettledAmount
	 * QuantityAndAccount18.mmPreviouslySettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount18#mmRemainingToBeSettledAmount
	 * QuantityAndAccount18.mmRemainingToBeSettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount19#mmPreviouslySettledAmount
	 * QuantityAndAccount19.mmPreviouslySettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount19#mmRemainingToBeSettledAmount
	 * QuantityAndAccount19.mmRemainingToBeSettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection7#mmAmount
	 * AmountAndDirection7.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount2#mmPreviouslySettledAmount
	 * QuantityAndAccount2.mmPreviouslySettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount2#mmRemainingToBeSettledAmount
	 * QuantityAndAccount2.mmRemainingToBeSettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection15#mmAmount
	 * AmountAndDirection15.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount12#mmPreviouslySettledAmount
	 * QuantityAndAccount12.mmPreviouslySettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount12#mmRemainingToBeSettledAmount
	 * QuantityAndAccount12.mmRemainingToBeSettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount15#mmPreviouslySettledAmount
	 * QuantityAndAccount15.mmPreviouslySettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount15#mmRemainingToBeSettledAmount
	 * QuantityAndAccount15.mmRemainingToBeSettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount20#mmPreviouslySettledAmount
	 * QuantityAndAccount20.mmPreviouslySettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount20#mmRemainingToBeSettledAmount
	 * QuantityAndAccount20.mmRemainingToBeSettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount28#mmPreviouslySettledAmount
	 * QuantityAndAccount28.mmPreviouslySettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount28#mmRemainingToBeSettledAmount
	 * QuantityAndAccount28.mmRemainingToBeSettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount37#mmPreviouslySettledAmount
	 * QuantityAndAccount37.mmPreviouslySettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount37#mmRemainingToBeSettledAmount
	 * QuantityAndAccount37.mmRemainingToBeSettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails8#mmSettlementAmount
	 * SecuritiesSettlementTransactionDetails8.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails9#mmSettlementAmount
	 * SecuritiesSettlementTransactionDetails9.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails10#mmSettlementAmount
	 * SecuritiesSettlementTransactionDetails10.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails11#mmSettlementAmount
	 * SecuritiesSettlementTransactionDetails11.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails12#mmSettlementAmount
	 * SecuritiesSettlementTransactionDetails12.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails13#mmSettlementAmount
	 * SecuritiesSettlementTransactionDetails13.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails5#mmSettlementAmount
	 * TransactionDetails5.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails9#mmSettlementAmount
	 * TransactionDetails9.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails22#mmSettlementAmount
	 * TransactionDetails22.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails23#mmSettlementAmount
	 * TransactionDetails23.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails36#mmSettlementAmount
	 * TransactionDetails36.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails47#mmSettlementAmount
	 * TransactionDetails47.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails53#mmSettlementAmount
	 * TransactionDetails53.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails58#mmSettlementAmount
	 * TransactionDetails58.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails7#mmPostingAmount
	 * TransactionDetails7.mmPostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails8#mmPostingAmount
	 * TransactionDetails8.mmPostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails16#mmPostingAmount
	 * TransactionDetails16.mmPostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails17#mmPostingAmount
	 * TransactionDetails17.mmPostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails26#mmPostingAmount
	 * TransactionDetails26.mmPostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails25#mmPostingAmount
	 * TransactionDetails25.mmPostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails27#mmPostingAmount
	 * TransactionDetails27.mmPostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails33#mmPostingAmount
	 * TransactionDetails33.mmPostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails39#mmPostingAmount
	 * TransactionDetails39.mmPostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails50#mmPostingAmount
	 * TransactionDetails50.mmPostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails56#mmPostingAmount
	 * TransactionDetails56.mmPostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails59#mmPostingAmount
	 * TransactionDetails59.mmPostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection3#mmAmount
	 * AmountAndDirection3.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails6#mmPostingAmount
	 * TransactionDetails6.mmPostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection18#mmAmount
	 * AmountAndDirection18.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails18#mmPostingAmount
	 * TransactionDetails18.mmPostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails24#mmPostingAmount
	 * TransactionDetails24.mmPostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails34#mmPostingAmount
	 * TransactionDetails34.mmPostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails37#mmPostingAmount
	 * TransactionDetails37.mmPostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails48#mmPostingAmount
	 * TransactionDetails48.mmPostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails57#mmPostingAmount
	 * TransactionDetails57.mmPostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails60#mmPostingAmount
	 * TransactionDetails60.mmPostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection1#mmAmount
	 * AmountAndDirection1.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection29#mmAmount
	 * AmountAndDirection29.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection28#mmAmount
	 * AmountAndDirection28.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder5#mmSettlementAmount
	 * RedemptionOrder5.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder7#mmSettlementAmount
	 * RedemptionOrder7.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder6#mmSettlementAmount
	 * RedemptionOrder6.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#mmSettlementAmount
	 * RedemptionOrder8.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#mmSettlementAmount
	 * InvestmentFundTransaction3.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#mmSettlementAmount
	 * SubscriptionOrder5.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#mmSettlementAmount
	 * SubscriptionExecution5.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#mmSettlementAmount
	 * SubscriptionOrder7.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder6#mmSettlementAmount
	 * SubscriptionOrder6.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmSettlementAmount
	 * SubscriptionExecution6.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder8#mmSettlementAmount
	 * SubscriptionOrder8.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder3#mmSettlementAmount
	 * SwitchOrder3.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution4#mmSettlementAmount
	 * SwitchExecution4.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder4#mmSettlementAmount
	 * SwitchOrder4.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails1#mmSettlementAmount
	 * TransactionDetails1.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails3#mmSettlementAmount
	 * TransactionDetails3.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection10#mmAmount
	 * AmountAndDirection10.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection22#mmAmount
	 * AmountAndDirection22.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection23#mmAmount
	 * AmountAndDirection23.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails4#mmSettlementAmount
	 * TransactionDetails4.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails30#mmSettlementAmount
	 * TransactionDetails30.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection20#mmAmount
	 * AmountAndDirection20.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection11#mmAmount
	 * AmountAndDirection11.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails20#mmSettlementAmount
	 * TransactionDetails20.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection25#mmAmount
	 * AmountAndDirection25.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection26#mmAmount
	 * AmountAndDirection26.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails40#mmSettlementAmount
	 * TransactionDetails40.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails42#mmSettlementAmount
	 * TransactionDetails42.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails46#mmSettlementAmount
	 * TransactionDetails46.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails32#mmSettlementAmount
	 * TransactionDetails32.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails14#mmSettlementAmount
	 * TransactionDetails14.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails35#mmSettlementAmount
	 * TransactionDetails35.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails45#mmSettlementAmount
	 * TransactionDetails45.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection31#mmAmount
	 * AmountAndDirection31.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation1#mmSettlementAmount
	 * SettlementObligation1.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation1#mmRemainingAmountToBeSettled
	 * SettlementObligation1.mmRemainingAmountToBeSettled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection27#mmAmount
	 * AmountAndDirection27.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation6#mmSettlementAmount
	 * SettlementObligation6.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation6#mmRemainingAmountToBeSettled
	 * SettlementObligation6.mmRemainingAmountToBeSettled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation3#mmSettlementAmount
	 * SettlementObligation3.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation2#mmSettlementAmount
	 * SettlementObligation2.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation5#mmSettlementAmount
	 * SettlementObligation5.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation4#mmSettlementAmount
	 * SettlementObligation4.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection21#mmAmount
	 * AmountAndDirection21.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails21#mmSettlementAmount
	 * SettlementDetails21.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentQuantity2#mmSettlementAmount
	 * FinancialInstrumentQuantity2.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentQuantity3#mmSettlementAmount
	 * FinancialInstrumentQuantity3.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution9#mmSettlementAmount
	 * SubscriptionExecution9.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails51#mmSettlementAmount
	 * TransactionDetails51.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails51#mmSettledAmount
	 * TransactionDetails51.mmSettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails51#mmPreviouslySettledAmount
	 * TransactionDetails51.mmPreviouslySettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails51#mmRemainingSettlementAmount
	 * TransactionDetails51.mmRemainingSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails52#mmSettlementAmount
	 * TransactionDetails52.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation13#mmSettlementAmount
	 * ReceiveInformation13.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation12#mmSettlementAmount
	 * ReceiveInformation12.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation12#mmSettlementAmount
	 * DeliverInformation12.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation13#mmSettlementAmount
	 * DeliverInformation13.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails61#mmSettlementAmount
	 * TransactionDetails61.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails16#mmSettlementAmount
	 * SecuritiesSettlementTransactionDetails16.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails14#mmSettlementAmount
	 * SecuritiesSettlementTransactionDetails14.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails15#mmSettlementAmount
	 * SecuritiesSettlementTransactionDetails15.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection36#mmAmount
	 * AmountAndDirection36.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails62#mmPostingAmount
	 * TransactionDetails62.mmPostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection37#mmAmount
	 * AmountAndDirection37.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails63#mmPostingAmount
	 * TransactionDetails63.mmPostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection38#mmAmount
	 * AmountAndDirection38.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails66#mmSettlementAmount
	 * TransactionDetails66.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails67#mmPostingAmount
	 * TransactionDetails67.mmPostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails68#mmPostingAmount
	 * TransactionDetails68.mmPostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails17#mmSettlementAmount
	 * SecuritiesSettlementTransactionDetails17.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails18#mmSettlementAmount
	 * SecuritiesSettlementTransactionDetails18.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails19#mmSettlementAmount
	 * SecuritiesSettlementTransactionDetails19.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection40#mmAmount
	 * AmountAndDirection40.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmSettlementAmount
	 * InvestmentFundTransaction4.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation15#mmSettlementAmount
	 * DeliverInformation15.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation14#mmSettlementAmount
	 * DeliverInformation14.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation15#mmSettlementAmount
	 * ReceiveInformation15.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation14#mmSettlementAmount
	 * ReceiveInformation14.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails70#mmSettlementAmount
	 * TransactionDetails70.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails69#mmPostingAmount
	 * TransactionDetails69.mmPostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation7#mmSettlementAmount
	 * SettlementObligation7.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation7#mmRemainingAmountToBeSettled
	 * SettlementObligation7.mmRemainingAmountToBeSettled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation8#mmSettlementAmount
	 * SettlementObligation8.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails71#mmSettlementAmount
	 * TransactionDetails71.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails72#mmPostingAmount
	 * TransactionDetails72.mmPostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount41#mmPreviouslySettledAmount
	 * QuantityAndAccount41.mmPreviouslySettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount41#mmRemainingToBeSettledAmount
	 * QuantityAndAccount41.mmRemainingToBeSettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount40#mmPreviouslySettledAmount
	 * QuantityAndAccount40.mmPreviouslySettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount40#mmRemainingToBeSettledAmount
	 * QuantityAndAccount40.mmRemainingToBeSettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails81#mmSettlementAmount
	 * TransactionDetails81.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails74#mmSettlementAmount
	 * TransactionDetails74.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails82#mmSettlementAmount
	 * TransactionDetails82.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails79#mmSettlementAmount
	 * TransactionDetails79.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails80#mmSettlementAmount
	 * TransactionDetails80.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails21#mmSettlementAmount
	 * SecuritiesSettlementTransactionDetails21.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails22#mmSettlementAmount
	 * SecuritiesSettlementTransactionDetails22.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails20#mmSettlementAmount
	 * SecuritiesSettlementTransactionDetails20.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails75#mmPostingAmount
	 * TransactionDetails75.mmPostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails78#mmPostingAmount
	 * TransactionDetails78.mmPostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection46#mmAmount
	 * AmountAndDirection46.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection49#mmAmount
	 * AmountAndDirection49.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails34#mmRemainingToBeSettledQuantity
	 * IntraPositionDetails34.mmRemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection48#mmAmount
	 * AmountAndDirection48.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection44#mmAmount
	 * AmountAndDirection44.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection45#mmAmount
	 * AmountAndDirection45.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection51#mmAmount
	 * AmountAndDirection51.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection52#mmAmount
	 * AmountAndDirection52.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection47#mmAmount
	 * AmountAndDirection47.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation17#mmSettlementAmount
	 * ReceiveInformation17.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation16#mmSettlementAmount
	 * ReceiveInformation16.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation16#mmSettlementAmount
	 * DeliverInformation16.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation17#mmSettlementAmount
	 * DeliverInformation17.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection66#mmAmount
	 * AmountAndDirection66.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails88#mmSettlementAmount
	 * TransactionDetails88.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount46#mmPreviouslySettledAmount
	 * QuantityAndAccount46.mmPreviouslySettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount46#mmRemainingToBeSettledAmount
	 * QuantityAndAccount46.mmRemainingToBeSettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection60#mmAmount
	 * AmountAndDirection60.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails92#mmSettlementAmount
	 * TransactionDetails92.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails84#mmSettlementAmount
	 * TransactionDetails84.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails35#mmRemainingToBeSettledQuantity
	 * IntraPositionDetails35.mmRemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails83#mmSettlementAmount
	 * TransactionDetails83.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount51#mmPreviouslySettledAmount
	 * QuantityAndAccount51.mmPreviouslySettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount51#mmRemainingToBeSettledAmount
	 * QuantityAndAccount51.mmRemainingToBeSettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails87#mmSettlementAmount
	 * TransactionDetails87.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection71#mmAmount
	 * AmountAndDirection71.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection57#mmAmount
	 * AmountAndDirection57.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection85#mmAmount
	 * AmountAndDirection85.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection55#mmAmount
	 * AmountAndDirection55.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails23#mmSettlementAmount
	 * SecuritiesSettlementTransactionDetails23.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails25#mmSettlementAmount
	 * SecuritiesSettlementTransactionDetails25.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails24#mmSettlementAmount
	 * SecuritiesSettlementTransactionDetails24.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection59#mmAmount
	 * AmountAndDirection59.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails91#mmPostingAmount
	 * TransactionDetails91.mmPostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection58#mmAmount
	 * AmountAndDirection58.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection72#mmAmount
	 * AmountAndDirection72.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails90#mmPostingAmount
	 * TransactionDetails90.mmPostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection67#mmAmount
	 * AmountAndDirection67.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails93#mmSettlementAmount
	 * TransactionDetails93.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails93#mmSettledAmount
	 * TransactionDetails93.mmSettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails93#mmPreviouslySettledAmount
	 * TransactionDetails93.mmPreviouslySettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails93#mmRemainingSettlementAmount
	 * TransactionDetails93.mmRemainingSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails94#mmSettlementAmount
	 * TransactionDetails94.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution7#mmSettlementAmount
	 * SwitchExecution7.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder7#mmSettlementAmount
	 * SwitchOrder7.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmSettlementAmount
	 * RedemptionOrder14.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmSettlementAmount
	 * SubscriptionExecution13.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmSettlementAmount
	 * SubscriptionExecution12.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmSettlementAmount
	 * SubscriptionOrder15.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder15#mmSettlementAmount
	 * RedemptionOrder15.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#mmSettlementAmount
	 * SubscriptionOrder14.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails41#mmRemainingToBeSettledQuantity
	 * IntraPositionDetails41.mmRemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails97#mmSettlementAmount
	 * TransactionDetails97.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails27#mmSettlementAmount
	 * SecuritiesSettlementTransactionDetails27.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails28#mmSettlementAmount
	 * SecuritiesSettlementTransactionDetails28.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails26#mmSettlementAmount
	 * SecuritiesSettlementTransactionDetails26.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails96#mmPostingAmount
	 * TransactionDetails96.mmPostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails95#mmPostingAmount
	 * TransactionDetails95.mmPostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails43#mmRemainingToBeSettledQuantity
	 * IntraPositionDetails43.mmRemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails30#mmSettlementAmount
	 * SecuritiesSettlementTransactionDetails30.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails29#mmSettlementAmount
	 * SecuritiesSettlementTransactionDetails29.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails31#mmSettlementAmount
	 * SecuritiesSettlementTransactionDetails31.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails100#mmSettlementAmount
	 * TransactionDetails100.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails99#mmPostingAmount
	 * TransactionDetails99.mmPostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails98#mmPostingAmount
	 * TransactionDetails98.mmPostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount57#mmPreviouslySettledAmount
	 * QuantityAndAccount57.mmPreviouslySettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount57#mmRemainingToBeSettledAmount
	 * QuantityAndAccount57.mmRemainingToBeSettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount62#mmPreviouslySettledAmount
	 * QuantityAndAccount62.mmPreviouslySettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount62#mmRemainingToBeSettledAmount
	 * QuantityAndAccount62.mmRemainingToBeSettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails102#mmSettlementAmount
	 * TransactionDetails102.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails102#mmSettledAmount
	 * TransactionDetails102.mmSettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails102#mmPreviouslySettledAmount
	 * TransactionDetails102.mmPreviouslySettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails102#mmRemainingSettlementAmount
	 * TransactionDetails102.mmRemainingSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation18#mmSettlementAmount
	 * ReceiveInformation18.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation19#mmSettlementAmount
	 * DeliverInformation19.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation19#mmSettlementAmount
	 * ReceiveInformation19.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation18#mmSettlementAmount
	 * DeliverInformation18.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails46#mmRemainingToBeSettledQuantity
	 * IntraPositionDetails46.mmRemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount64#mmPreviouslySettledAmount
	 * QuantityAndAccount64.mmPreviouslySettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount64#mmRemainingToBeSettledAmount
	 * QuantityAndAccount64.mmRemainingToBeSettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails105#mmSettlementAmount
	 * TransactionDetails105.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails34#mmSettlementAmount
	 * SecuritiesSettlementTransactionDetails34.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails104#mmPostingAmount
	 * TransactionDetails104.mmPostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails33#mmSettlementAmount
	 * SecuritiesSettlementTransactionDetails33.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32#mmSettlementAmount
	 * SecuritiesSettlementTransactionDetails32.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails103#mmPostingAmount
	 * TransactionDetails103.mmPostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails107#mmSettlementAmount
	 * TransactionDetails107.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection87#mmAmount
	 * AmountAndDirection87.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection88#mmAmount
	 * AmountAndDirection88.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection89#mmAmount
	 * AmountAndDirection89.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails47#mmRemainingToBeSettledQuantity
	 * IntraPositionDetails47.mmRemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection90#mmAmount
	 * AmountAndDirection90.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection92#mmAmount
	 * AmountAndDirection92.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount72#mmPreviouslySettledAmount
	 * QuantityAndAccount72.mmPreviouslySettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount72#mmRemainingToBeSettledAmount
	 * QuantityAndAccount72.mmRemainingToBeSettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails109#mmSettlementAmount
	 * TransactionDetails109.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails35#mmSettlementAmount
	 * SecuritiesSettlementTransactionDetails35.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection91#mmAmount
	 * AmountAndDirection91.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails36#mmSettlementAmount
	 * SecuritiesSettlementTransactionDetails36.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails37#mmSettlementAmount
	 * SecuritiesSettlementTransactionDetails37.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails110#mmSettlementAmount
	 * TransactionDetails110.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails111#mmPostingAmount
	 * TransactionDetails111.mmPostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails112#mmPostingAmount
	 * TransactionDetails112.mmPostingAmount}</li>
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
	public static final MMBusinessAttribute mmSettlementAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(DeliverInformation4.mmSettlementAmount, DeliverInformation7.mmSettlementAmount, ReceiveInformation4.mmSettlementAmount, ReceiveInformation8.mmSettlementAmount,
					ReceiveInformation6.mmSettlementAmount, ReceiveInformation11.mmSettlementAmount, DeliverInformation11.mmSettlementAmount, AmountAndDirection8.mmAmount, TransactionDetails10.mmSettlementAmount,
					TransactionDetails29.mmSettlementAmount, AmountAndDirection32.mmAmount, AmountAndDirection9.mmAmount, SecuritiesSettlementTransactionDetails3.mmSettlementAmount,
					SecuritiesSettlementTransactionDetails4.mmSettlementAmount, SecuritiesSettlementTransactionDetails2.mmSettlementAmount, TransactionDetails28.mmSettlementAmount, AmountAndDirection12.mmAmount,
					TransactionDetails31.mmSettlementAmount, TransactionDetails44.mmSettlementAmount, AmountAndDirection33.mmAmount, AmountAndDirection17.mmAmount, SecuritiesSettlementTransactionDetails5.mmSettlementAmount,
					SecuritiesSettlementTransactionDetails6.mmSettlementAmount, SecuritiesSettlementTransactionDetails7.mmSettlementAmount, DeliverInformation3.mmSettlementAmount, DeliverInformation8.mmSettlementAmount,
					ReceiveInformation3.mmSettlementAmount, ReceiveInformation7.mmSettlementAmount, ReceiveInformation5.mmSettlementAmount, ReceiveInformation9.mmSettlementAmount, DeliverInformation5.mmSettlementAmount,
					DeliverInformation9.mmSettlementAmount, DeliverInformation6.mmSettlementAmount, IntraPositionDetails2.mmRemainingToBeSettledQuantity, IntraPositionDetails8.mmRemainingToBeSettledQuantity,
					IntraPositionDetails12.mmRemainingToBeSettledQuantity, AmountAndDirection24.mmAmount, IntraPositionDetails13.mmRemainingToBeSettledQuantity, IntraPositionDetails22.mmRemainingToBeSettledQuantity,
					IntraPositionDetails26.mmRemainingToBeSettledQuantity, IntraPositionDetails27.mmRemainingToBeSettledQuantity, IntraPositionDetails29.mmRemainingToBeSettledQuantity, AmountAndDirection6.mmAmount,
					AmountAndDirection14.mmAmount, AmountAndDirection5.mmAmount, QuantityAndAccount6.mmPreviouslySettledAmount, QuantityAndAccount6.mmRemainingToBeSettledAmount, AmountAndDirection4.mmAmount, AmountAndDirection2.mmAmount,
					AmountAndDirection19.mmAmount, QuantityAndAccount11.mmPreviouslySettledAmount, QuantityAndAccount11.mmRemainingToBeSettledAmount, AmountAndDirection13.mmAmount, AmountAndDirection16.mmAmount,
					QuantityAndAccount18.mmPreviouslySettledAmount, QuantityAndAccount18.mmRemainingToBeSettledAmount, QuantityAndAccount19.mmPreviouslySettledAmount, QuantityAndAccount19.mmRemainingToBeSettledAmount,
					AmountAndDirection7.mmAmount, QuantityAndAccount2.mmPreviouslySettledAmount, QuantityAndAccount2.mmRemainingToBeSettledAmount, AmountAndDirection15.mmAmount, QuantityAndAccount12.mmPreviouslySettledAmount,
					QuantityAndAccount12.mmRemainingToBeSettledAmount, QuantityAndAccount15.mmPreviouslySettledAmount, QuantityAndAccount15.mmRemainingToBeSettledAmount, QuantityAndAccount20.mmPreviouslySettledAmount,
					QuantityAndAccount20.mmRemainingToBeSettledAmount, QuantityAndAccount28.mmPreviouslySettledAmount, QuantityAndAccount28.mmRemainingToBeSettledAmount, QuantityAndAccount37.mmPreviouslySettledAmount,
					QuantityAndAccount37.mmRemainingToBeSettledAmount, SecuritiesSettlementTransactionDetails8.mmSettlementAmount, SecuritiesSettlementTransactionDetails9.mmSettlementAmount,
					SecuritiesSettlementTransactionDetails10.mmSettlementAmount, SecuritiesSettlementTransactionDetails11.mmSettlementAmount, SecuritiesSettlementTransactionDetails12.mmSettlementAmount,
					SecuritiesSettlementTransactionDetails13.mmSettlementAmount, TransactionDetails5.mmSettlementAmount, TransactionDetails9.mmSettlementAmount, TransactionDetails22.mmSettlementAmount,
					TransactionDetails23.mmSettlementAmount, TransactionDetails36.mmSettlementAmount, TransactionDetails47.mmSettlementAmount, TransactionDetails53.mmSettlementAmount, TransactionDetails58.mmSettlementAmount,
					TransactionDetails7.mmPostingAmount, TransactionDetails8.mmPostingAmount, TransactionDetails16.mmPostingAmount, TransactionDetails17.mmPostingAmount, TransactionDetails26.mmPostingAmount,
					TransactionDetails25.mmPostingAmount, TransactionDetails27.mmPostingAmount, TransactionDetails33.mmPostingAmount, TransactionDetails39.mmPostingAmount, TransactionDetails50.mmPostingAmount,
					TransactionDetails56.mmPostingAmount, TransactionDetails59.mmPostingAmount, AmountAndDirection3.mmAmount, TransactionDetails6.mmPostingAmount, AmountAndDirection18.mmAmount, TransactionDetails18.mmPostingAmount,
					TransactionDetails24.mmPostingAmount, TransactionDetails34.mmPostingAmount, TransactionDetails37.mmPostingAmount, TransactionDetails48.mmPostingAmount, TransactionDetails57.mmPostingAmount,
					TransactionDetails60.mmPostingAmount, AmountAndDirection1.mmAmount, AmountAndDirection29.mmAmount, AmountAndDirection28.mmAmount, RedemptionOrder5.mmSettlementAmount, RedemptionOrder7.mmSettlementAmount,
					RedemptionOrder6.mmSettlementAmount, RedemptionOrder8.mmSettlementAmount, InvestmentFundTransaction3.mmSettlementAmount, SubscriptionOrder5.mmSettlementAmount, SubscriptionExecution5.mmSettlementAmount,
					SubscriptionOrder7.mmSettlementAmount, SubscriptionOrder6.mmSettlementAmount, SubscriptionExecution6.mmSettlementAmount, SubscriptionOrder8.mmSettlementAmount, SwitchOrder3.mmSettlementAmount,
					SwitchExecution4.mmSettlementAmount, SwitchOrder4.mmSettlementAmount, TransactionDetails1.mmSettlementAmount, TransactionDetails3.mmSettlementAmount, AmountAndDirection10.mmAmount, AmountAndDirection22.mmAmount,
					AmountAndDirection23.mmAmount, TransactionDetails4.mmSettlementAmount, TransactionDetails30.mmSettlementAmount, AmountAndDirection20.mmAmount, AmountAndDirection11.mmAmount, TransactionDetails20.mmSettlementAmount,
					AmountAndDirection25.mmAmount, AmountAndDirection26.mmAmount, TransactionDetails40.mmSettlementAmount, TransactionDetails42.mmSettlementAmount, TransactionDetails46.mmSettlementAmount,
					TransactionDetails32.mmSettlementAmount, TransactionDetails14.mmSettlementAmount, TransactionDetails35.mmSettlementAmount, TransactionDetails45.mmSettlementAmount, AmountAndDirection31.mmAmount,
					SettlementObligation1.mmSettlementAmount, SettlementObligation1.mmRemainingAmountToBeSettled, AmountAndDirection27.mmAmount, SettlementObligation6.mmSettlementAmount, SettlementObligation6.mmRemainingAmountToBeSettled,
					SettlementObligation3.mmSettlementAmount, SettlementObligation2.mmSettlementAmount, SettlementObligation5.mmSettlementAmount, SettlementObligation4.mmSettlementAmount, AmountAndDirection21.mmAmount,
					SettlementDetails21.mmSettlementAmount, FinancialInstrumentQuantity2.mmSettlementAmount, FinancialInstrumentQuantity3.mmSettlementAmount, SubscriptionExecution9.mmSettlementAmount,
					TransactionDetails51.mmSettlementAmount, TransactionDetails51.mmSettledAmount, TransactionDetails51.mmPreviouslySettledAmount, TransactionDetails51.mmRemainingSettlementAmount, TransactionDetails52.mmSettlementAmount,
					ReceiveInformation13.mmSettlementAmount, ReceiveInformation12.mmSettlementAmount, DeliverInformation12.mmSettlementAmount, DeliverInformation13.mmSettlementAmount, TransactionDetails61.mmSettlementAmount,
					SecuritiesSettlementTransactionDetails16.mmSettlementAmount, SecuritiesSettlementTransactionDetails14.mmSettlementAmount, SecuritiesSettlementTransactionDetails15.mmSettlementAmount, AmountAndDirection36.mmAmount,
					TransactionDetails62.mmPostingAmount, AmountAndDirection37.mmAmount, TransactionDetails63.mmPostingAmount, AmountAndDirection38.mmAmount, TransactionDetails66.mmSettlementAmount, TransactionDetails67.mmPostingAmount,
					TransactionDetails68.mmPostingAmount, SecuritiesSettlementTransactionDetails17.mmSettlementAmount, SecuritiesSettlementTransactionDetails18.mmSettlementAmount,
					SecuritiesSettlementTransactionDetails19.mmSettlementAmount, AmountAndDirection40.mmAmount, InvestmentFundTransaction4.mmSettlementAmount, DeliverInformation15.mmSettlementAmount,
					DeliverInformation14.mmSettlementAmount, ReceiveInformation15.mmSettlementAmount, ReceiveInformation14.mmSettlementAmount, TransactionDetails70.mmSettlementAmount, TransactionDetails69.mmPostingAmount,
					SettlementObligation7.mmSettlementAmount, SettlementObligation7.mmRemainingAmountToBeSettled, SettlementObligation8.mmSettlementAmount, TransactionDetails71.mmSettlementAmount, TransactionDetails72.mmPostingAmount,
					QuantityAndAccount41.mmPreviouslySettledAmount, QuantityAndAccount41.mmRemainingToBeSettledAmount, QuantityAndAccount40.mmPreviouslySettledAmount, QuantityAndAccount40.mmRemainingToBeSettledAmount,
					TransactionDetails81.mmSettlementAmount, TransactionDetails74.mmSettlementAmount, TransactionDetails82.mmSettlementAmount, TransactionDetails79.mmSettlementAmount, TransactionDetails80.mmSettlementAmount,
					SecuritiesSettlementTransactionDetails21.mmSettlementAmount, SecuritiesSettlementTransactionDetails22.mmSettlementAmount, SecuritiesSettlementTransactionDetails20.mmSettlementAmount,
					TransactionDetails75.mmPostingAmount, TransactionDetails78.mmPostingAmount, AmountAndDirection46.mmAmount, AmountAndDirection49.mmAmount, IntraPositionDetails34.mmRemainingToBeSettledQuantity,
					AmountAndDirection48.mmAmount, AmountAndDirection44.mmAmount, AmountAndDirection45.mmAmount, AmountAndDirection51.mmAmount, AmountAndDirection52.mmAmount, AmountAndDirection47.mmAmount,
					ReceiveInformation17.mmSettlementAmount, ReceiveInformation16.mmSettlementAmount, DeliverInformation16.mmSettlementAmount, DeliverInformation17.mmSettlementAmount, AmountAndDirection66.mmAmount,
					TransactionDetails88.mmSettlementAmount, QuantityAndAccount46.mmPreviouslySettledAmount, QuantityAndAccount46.mmRemainingToBeSettledAmount, AmountAndDirection60.mmAmount, TransactionDetails92.mmSettlementAmount,
					TransactionDetails84.mmSettlementAmount, IntraPositionDetails35.mmRemainingToBeSettledQuantity, TransactionDetails83.mmSettlementAmount, QuantityAndAccount51.mmPreviouslySettledAmount,
					QuantityAndAccount51.mmRemainingToBeSettledAmount, TransactionDetails87.mmSettlementAmount, AmountAndDirection71.mmAmount, AmountAndDirection57.mmAmount, AmountAndDirection85.mmAmount, AmountAndDirection55.mmAmount,
					SecuritiesSettlementTransactionDetails23.mmSettlementAmount, SecuritiesSettlementTransactionDetails25.mmSettlementAmount, SecuritiesSettlementTransactionDetails24.mmSettlementAmount, AmountAndDirection59.mmAmount,
					TransactionDetails91.mmPostingAmount, AmountAndDirection58.mmAmount, AmountAndDirection72.mmAmount, TransactionDetails90.mmPostingAmount, AmountAndDirection67.mmAmount, TransactionDetails93.mmSettlementAmount,
					TransactionDetails93.mmSettledAmount, TransactionDetails93.mmPreviouslySettledAmount, TransactionDetails93.mmRemainingSettlementAmount, TransactionDetails94.mmSettlementAmount, SwitchExecution7.mmSettlementAmount,
					SwitchOrder7.mmSettlementAmount, RedemptionOrder14.mmSettlementAmount, SubscriptionExecution13.mmSettlementAmount, SubscriptionExecution12.mmSettlementAmount, SubscriptionOrder15.mmSettlementAmount,
					RedemptionOrder15.mmSettlementAmount, SubscriptionOrder14.mmSettlementAmount, IntraPositionDetails41.mmRemainingToBeSettledQuantity, TransactionDetails97.mmSettlementAmount,
					SecuritiesSettlementTransactionDetails27.mmSettlementAmount, SecuritiesSettlementTransactionDetails28.mmSettlementAmount, SecuritiesSettlementTransactionDetails26.mmSettlementAmount,
					TransactionDetails96.mmPostingAmount, TransactionDetails95.mmPostingAmount, IntraPositionDetails43.mmRemainingToBeSettledQuantity, SecuritiesSettlementTransactionDetails30.mmSettlementAmount,
					SecuritiesSettlementTransactionDetails29.mmSettlementAmount, SecuritiesSettlementTransactionDetails31.mmSettlementAmount, TransactionDetails100.mmSettlementAmount, TransactionDetails99.mmPostingAmount,
					TransactionDetails98.mmPostingAmount, QuantityAndAccount57.mmPreviouslySettledAmount, QuantityAndAccount57.mmRemainingToBeSettledAmount, QuantityAndAccount62.mmPreviouslySettledAmount,
					QuantityAndAccount62.mmRemainingToBeSettledAmount, TransactionDetails102.mmSettlementAmount, TransactionDetails102.mmSettledAmount, TransactionDetails102.mmPreviouslySettledAmount,
					TransactionDetails102.mmRemainingSettlementAmount, ReceiveInformation18.mmSettlementAmount, DeliverInformation19.mmSettlementAmount, ReceiveInformation19.mmSettlementAmount, DeliverInformation18.mmSettlementAmount,
					IntraPositionDetails46.mmRemainingToBeSettledQuantity, QuantityAndAccount64.mmPreviouslySettledAmount, QuantityAndAccount64.mmRemainingToBeSettledAmount, TransactionDetails105.mmSettlementAmount,
					SecuritiesSettlementTransactionDetails34.mmSettlementAmount, TransactionDetails104.mmPostingAmount, SecuritiesSettlementTransactionDetails33.mmSettlementAmount,
					SecuritiesSettlementTransactionDetails32.mmSettlementAmount, TransactionDetails103.mmPostingAmount, TransactionDetails107.mmSettlementAmount, AmountAndDirection87.mmAmount, AmountAndDirection88.mmAmount,
					AmountAndDirection89.mmAmount, IntraPositionDetails47.mmRemainingToBeSettledQuantity, AmountAndDirection90.mmAmount, AmountAndDirection92.mmAmount, QuantityAndAccount72.mmPreviouslySettledAmount,
					QuantityAndAccount72.mmRemainingToBeSettledAmount, TransactionDetails109.mmSettlementAmount, SecuritiesSettlementTransactionDetails35.mmSettlementAmount, AmountAndDirection91.mmAmount,
					SecuritiesSettlementTransactionDetails36.mmSettlementAmount, SecuritiesSettlementTransactionDetails37.mmSettlementAmount, TransactionDetails110.mmSettlementAmount, TransactionDetails111.mmPostingAmount,
					TransactionDetails112.mmPostingAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementAmount";
			definition = "Amount of money settled or to be settled.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlement.class.getMethod("getSettlementAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text holdingsPlanType;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.Transfer17#mmHoldingsPlanType
	 * Transfer17.mmHoldingsPlanType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer14#mmHoldingsPlanType
	 * Transfer14.mmHoldingsPlanType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer24#mmHoldingsPlanType
	 * Transfer24.mmHoldingsPlanType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer25#mmHoldingsPlanType
	 * Transfer25.mmHoldingsPlanType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer16#mmHoldingsPlanType
	 * Transfer16.mmHoldingsPlanType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer12#mmHoldingsPlanType
	 * Transfer12.mmHoldingsPlanType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer20#mmHoldingsPlanType
	 * Transfer20.mmHoldingsPlanType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer22#mmHoldingsPlanType
	 * Transfer22.mmHoldingsPlanType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer18#mmHoldingsPlanType
	 * Transfer18.mmHoldingsPlanType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer26#mmHoldingsPlanType
	 * Transfer26.mmHoldingsPlanType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer15#mmHoldingsPlanType
	 * Transfer15.mmHoldingsPlanType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer21#mmHoldingsPlanType
	 * Transfer21.mmHoldingsPlanType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer13#mmHoldingsPlanType
	 * Transfer13.mmHoldingsPlanType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer23#mmHoldingsPlanType
	 * Transfer23.mmHoldingsPlanType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer11#mmHoldingsPlanType
	 * Transfer11.mmHoldingsPlanType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer19#mmHoldingsPlanType
	 * Transfer19.mmHoldingsPlanType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer27#mmHoldingsPlanType
	 * Transfer27.mmHoldingsPlanType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer28#mmHoldingsPlanType
	 * Transfer28.mmHoldingsPlanType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer29#mmHoldingsPlanType
	 * Transfer29.mmHoldingsPlanType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer31#mmHoldingsPlanType
	 * Transfer31.mmHoldingsPlanType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer30#mmHoldingsPlanType
	 * Transfer30.mmHoldingsPlanType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer32#mmHoldingsPlanType
	 * Transfer32.mmHoldingsPlanType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer33#mmHoldingsPlanType
	 * Transfer33.mmHoldingsPlanType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer35#mmHoldingsPlanType
	 * Transfer35.mmHoldingsPlanType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer34#mmHoldingsPlanType
	 * Transfer34.mmHoldingsPlanType}</li>
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
	public static final MMBusinessAttribute mmHoldingsPlanType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Transfer17.mmHoldingsPlanType, Transfer14.mmHoldingsPlanType, Transfer24.mmHoldingsPlanType, Transfer25.mmHoldingsPlanType, Transfer16.mmHoldingsPlanType, Transfer12.mmHoldingsPlanType,
					Transfer20.mmHoldingsPlanType, Transfer22.mmHoldingsPlanType, Transfer18.mmHoldingsPlanType, Transfer26.mmHoldingsPlanType, Transfer15.mmHoldingsPlanType, Transfer21.mmHoldingsPlanType, Transfer13.mmHoldingsPlanType,
					Transfer23.mmHoldingsPlanType, Transfer11.mmHoldingsPlanType, Transfer19.mmHoldingsPlanType, Transfer27.mmHoldingsPlanType, Transfer28.mmHoldingsPlanType, Transfer29.mmHoldingsPlanType, Transfer31.mmHoldingsPlanType,
					Transfer30.mmHoldingsPlanType, Transfer32.mmHoldingsPlanType, Transfer33.mmHoldingsPlanType, Transfer35.mmHoldingsPlanType, Transfer34.mmHoldingsPlanType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "HoldingsPlanType";
			definition = "Identifies whether or not saving plan or withdrawal or switch plan are included in the holdings.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlement.class.getMethod("getHoldingsPlanType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ReceiveDeliveryCode securitiesMovementType;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification3#mmSecuritiesMovementType
	 * SettlementTypeAndIdentification3.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters5#mmSecuritiesMovementType
	 * SettlementTypeAndAdditionalParameters5.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification13#mmSecuritiesMovementType
	 * SettlementTypeAndIdentification13.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification7#mmSecuritiesMovementType
	 * SettlementTypeAndIdentification7.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters8#mmSecuritiesMovementType
	 * SettlementTypeAndAdditionalParameters8.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters3#mmSecuritiesMovementType
	 * TransactionTypeAndAdditionalParameters3.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters6#mmSecuritiesMovementType
	 * TransactionTypeAndAdditionalParameters6.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification14#mmSecuritiesMovementType
	 * SettlementTypeAndIdentification14.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification1#mmSecuritiesMovementType
	 * SettlementTypeAndIdentification1.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification8#mmSecuritiesMovementType
	 * SettlementTypeAndIdentification8.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification9#mmSecuritiesMovementType
	 * SettlementTypeAndIdentification9.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification11#mmSecuritiesMovementType
	 * SettlementTypeAndIdentification11.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification15#mmSecuritiesMovementType
	 * SettlementTypeAndIdentification15.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification17#mmSecuritiesMovementType
	 * SettlementTypeAndIdentification17.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification10#mmSecuritiesMovementType
	 * SettlementTypeAndIdentification10.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification12#mmSecuritiesMovementType
	 * SettlementTypeAndIdentification12.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters1#mmSecuritiesMovementType
	 * SettlementTypeAndAdditionalParameters1.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters4#mmSecuritiesMovementType
	 * SettlementTypeAndAdditionalParameters4.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters9#mmSecuritiesMovementType
	 * SettlementTypeAndAdditionalParameters9.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters10#mmSecuritiesMovementType
	 * SettlementTypeAndAdditionalParameters10.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails5#mmSecuritiesMovementType
	 * TransactionDetails5.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails9#mmSecuritiesMovementType
	 * TransactionDetails9.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails22#mmSecuritiesMovementType
	 * TransactionDetails22.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails23#mmSecuritiesMovementType
	 * TransactionDetails23.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails36#mmSecuritiesMovementType
	 * TransactionDetails36.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails47#mmSecuritiesMovementType
	 * TransactionDetails47.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails53#mmSecuritiesMovementType
	 * TransactionDetails53.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails58#mmSecuritiesMovementType
	 * TransactionDetails58.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails7#mmSecuritiesMovementType
	 * TransactionDetails7.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails8#mmSecuritiesMovementType
	 * TransactionDetails8.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails16#mmSecuritiesMovementType
	 * TransactionDetails16.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails17#mmSecuritiesMovementType
	 * TransactionDetails17.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails26#mmSecuritiesMovementType
	 * TransactionDetails26.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails25#mmSecuritiesMovementType
	 * TransactionDetails25.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails27#mmSecuritiesMovementType
	 * TransactionDetails27.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails33#mmSecuritiesMovementType
	 * TransactionDetails33.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails39#mmSecuritiesMovementType
	 * TransactionDetails39.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails50#mmSecuritiesMovementType
	 * TransactionDetails50.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails56#mmSecuritiesMovementType
	 * TransactionDetails56.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails59#mmSecuritiesMovementType
	 * TransactionDetails59.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails6#mmSecuritiesMovementType
	 * TransactionDetails6.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails18#mmSecuritiesMovementType
	 * TransactionDetails18.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails24#mmSecuritiesMovementType
	 * TransactionDetails24.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails34#mmSecuritiesMovementType
	 * TransactionDetails34.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails37#mmSecuritiesMovementType
	 * TransactionDetails37.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails48#mmSecuritiesMovementType
	 * TransactionDetails48.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails57#mmSecuritiesMovementType
	 * TransactionDetails57.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails60#mmSecuritiesMovementType
	 * TransactionDetails60.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails7#mmSecuritiesMovementType
	 * SecuritiesTradeDetails7.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails19#mmSecuritiesMovementType
	 * SecuritiesTradeDetails19.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2#mmSecuritiesMovementType
	 * SecuritiesFinancingTransactionDetails2.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8#mmSecuritiesMovementType
	 * SecuritiesFinancingTransactionDetails8.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters2#mmSecuritiesMovementType
	 * SettlementTypeAndAdditionalParameters2.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails4#mmSecuritiesMovementType
	 * SecuritiesTradeDetails4.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails17#mmSecuritiesMovementType
	 * SecuritiesTradeDetails17.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification4#mmSecuritiesMovementType
	 * SettlementTypeAndIdentification4.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6#mmSecuritiesMovementType
	 * SecuritiesFinancingTransactionDetails6.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10#mmSecuritiesMovementType
	 * SecuritiesFinancingTransactionDetails10.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17#mmSecuritiesMovementType
	 * SecuritiesFinancingTransactionDetails17.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18#mmSecuritiesMovementType
	 * SecuritiesFinancingTransactionDetails18.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters3#mmSecuritiesMovementType
	 * SettlementTypeAndAdditionalParameters3.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails10#mmSecuritiesMovementType
	 * SecuritiesTradeDetails10.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails22#mmSecuritiesMovementType
	 * SecuritiesTradeDetails22.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails23#mmSecuritiesMovementType
	 * SecuritiesTradeDetails23.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails29#mmSecuritiesMovementType
	 * SecuritiesTradeDetails29.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails40#mmSecuritiesMovementType
	 * TransactionDetails40.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails42#mmSecuritiesMovementType
	 * TransactionDetails42.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails46#mmSecuritiesMovementType
	 * TransactionDetails46.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification6#mmSecuritiesMovementType
	 * SettlementTypeAndIdentification6.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails14#mmSecuritiesMovementType
	 * SecuritiesTradeDetails14.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails20#mmSecuritiesMovementType
	 * SecuritiesTradeDetails20.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails24#mmSecuritiesMovementType
	 * SecuritiesTradeDetails24.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails30#mmSecuritiesMovementType
	 * SecuritiesTradeDetails30.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails45#mmSecuritiesMovementType
	 * TransactionDetails45.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation3#mmSecuritiesMovementType
	 * SettlementObligation3.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation5#mmSecuritiesMovementType
	 * SettlementObligation5.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation4#mmSecuritiesMovementType
	 * SettlementObligation4.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetPosition1#mmSecuritiesMovementType
	 * NetPosition1.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetPosition2#mmSecuritiesMovementType
	 * NetPosition2.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails51#mmSecuritiesMovementType
	 * TransactionDetails51.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails61#mmSecuritiesMovementType
	 * TransactionDetails61.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21#mmSecuritiesMovementType
	 * SecuritiesFinancingTransactionDetails21.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails62#mmSecuritiesMovementType
	 * TransactionDetails62.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails63#mmSecuritiesMovementType
	 * TransactionDetails63.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails35#mmSecuritiesMovementType
	 * SecuritiesTradeDetails35.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22#mmSecuritiesMovementType
	 * SecuritiesFinancingTransactionDetails22.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails66#mmSecuritiesMovementType
	 * TransactionDetails66.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails42#mmSecuritiesMovementType
	 * SecuritiesTradeDetails42.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails67#mmSecuritiesMovementType
	 * TransactionDetails67.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails68#mmSecuritiesMovementType
	 * TransactionDetails68.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24#mmSecuritiesMovementType
	 * SecuritiesFinancingTransactionDetails24.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails70#mmSecuritiesMovementType
	 * TransactionDetails70.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails69#mmSecuritiesMovementType
	 * TransactionDetails69.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetPosition3#mmSecuritiesMovementType
	 * NetPosition3.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation8#mmSecuritiesMovementType
	 * SettlementObligation8.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails71#mmSecuritiesMovementType
	 * TransactionDetails71.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25#mmSecuritiesMovementType
	 * SecuritiesFinancingTransactionDetails25.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails72#mmSecuritiesMovementType
	 * TransactionDetails72.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails81#mmSecuritiesMovementType
	 * TransactionDetails81.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails49#mmSecuritiesMovementType
	 * SecuritiesTradeDetails49.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails82#mmSecuritiesMovementType
	 * TransactionDetails82.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#mmSecuritiesMovementType
	 * SecuritiesFinancingTransactionDetails26.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails79#mmSecuritiesMovementType
	 * TransactionDetails79.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48#mmSecuritiesMovementType
	 * SecuritiesTradeDetails48.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails75#mmSecuritiesMovementType
	 * TransactionDetails75.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails78#mmSecuritiesMovementType
	 * TransactionDetails78.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification18#mmSecuritiesMovementType
	 * SettlementTypeAndIdentification18.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification19#mmSecuritiesMovementType
	 * SettlementTypeAndIdentification19.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters10#mmSecuritiesMovementType
	 * TransactionTypeAndAdditionalParameters10.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters11#mmSecuritiesMovementType
	 * SettlementTypeAndAdditionalParameters11.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters12#mmSecuritiesMovementType
	 * SettlementTypeAndAdditionalParameters12.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters14#mmSecuritiesMovementType
	 * SettlementTypeAndAdditionalParameters14.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails57#mmSecuritiesMovementType
	 * SecuritiesTradeDetails57.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#mmSecuritiesMovementType
	 * SecuritiesFinancingTransactionDetails33.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters12#mmSecuritiesMovementType
	 * TransactionTypeAndAdditionalParameters12.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails61#mmSecuritiesMovementType
	 * SecuritiesTradeDetails61.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails92#mmSecuritiesMovementType
	 * TransactionDetails92.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails84#mmSecuritiesMovementType
	 * TransactionDetails84.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters16#mmSecuritiesMovementType
	 * SettlementTypeAndAdditionalParameters16.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification24#mmSecuritiesMovementType
	 * SettlementTypeAndIdentification24.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails87#mmSecuritiesMovementType
	 * TransactionDetails87.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters15#mmSecuritiesMovementType
	 * SettlementTypeAndAdditionalParameters15.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails91#mmSecuritiesMovementType
	 * TransactionDetails91.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails90#mmSecuritiesMovementType
	 * TransactionDetails90.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters18#mmSecuritiesMovementType
	 * SettlementTypeAndAdditionalParameters18.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification22#mmSecuritiesMovementType
	 * SettlementTypeAndIdentification22.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails93#mmSecuritiesMovementType
	 * TransactionDetails93.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters19#mmSecuritiesMovementType
	 * SettlementTypeAndAdditionalParameters19.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#mmSecuritiesMovementType
	 * SecuritiesTradeDetails68.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails97#mmSecuritiesMovementType
	 * TransactionDetails97.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters16#mmSecuritiesMovementType
	 * TransactionTypeAndAdditionalParameters16.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmSecuritiesMovementType
	 * SecuritiesFinancingTransactionDetails35.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails96#mmSecuritiesMovementType
	 * TransactionDetails96.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails95#mmSecuritiesMovementType
	 * TransactionDetails95.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters19#mmSecuritiesMovementType
	 * TransactionTypeAndAdditionalParameters19.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails69#mmSecuritiesMovementType
	 * SecuritiesTradeDetails69.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36#mmSecuritiesMovementType
	 * SecuritiesFinancingTransactionDetails36.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters20#mmSecuritiesMovementType
	 * SettlementTypeAndAdditionalParameters20.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails100#mmSecuritiesMovementType
	 * TransactionDetails100.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails99#mmSecuritiesMovementType
	 * TransactionDetails99.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails98#mmSecuritiesMovementType
	 * TransactionDetails98.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails102#mmSecuritiesMovementType
	 * TransactionDetails102.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails71#mmSecuritiesMovementType
	 * SecuritiesTradeDetails71.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails105#mmSecuritiesMovementType
	 * TransactionDetails105.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails72#mmSecuritiesMovementType
	 * SecuritiesTradeDetails72.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails104#mmSecuritiesMovementType
	 * TransactionDetails104.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails103#mmSecuritiesMovementType
	 * TransactionDetails103.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails81#mmSecuritiesMovementType
	 * SecuritiesTradeDetails81.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails85#mmSecuritiesMovementType
	 * SecuritiesTradeDetails85.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails110#mmSecuritiesMovementType
	 * TransactionDetails110.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails111#mmSecuritiesMovementType
	 * TransactionDetails111.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails112#mmSecuritiesMovementType
	 * TransactionDetails112.mmSecuritiesMovementType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22H::REDE, ISO15022Synonym:
	 * :22F::PAYM</li>
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
	public static final MMBusinessAttribute mmSecuritiesMovementType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementTypeAndIdentification3.mmSecuritiesMovementType, SettlementTypeAndAdditionalParameters5.mmSecuritiesMovementType, SettlementTypeAndIdentification13.mmSecuritiesMovementType,
					SettlementTypeAndIdentification7.mmSecuritiesMovementType, SettlementTypeAndAdditionalParameters8.mmSecuritiesMovementType, TransactionTypeAndAdditionalParameters3.mmSecuritiesMovementType,
					TransactionTypeAndAdditionalParameters6.mmSecuritiesMovementType, SettlementTypeAndIdentification14.mmSecuritiesMovementType, SettlementTypeAndIdentification1.mmSecuritiesMovementType,
					SettlementTypeAndIdentification8.mmSecuritiesMovementType, SettlementTypeAndIdentification9.mmSecuritiesMovementType, SettlementTypeAndIdentification11.mmSecuritiesMovementType,
					SettlementTypeAndIdentification15.mmSecuritiesMovementType, SettlementTypeAndIdentification17.mmSecuritiesMovementType, SettlementTypeAndIdentification10.mmSecuritiesMovementType,
					SettlementTypeAndIdentification12.mmSecuritiesMovementType, SettlementTypeAndAdditionalParameters1.mmSecuritiesMovementType, SettlementTypeAndAdditionalParameters4.mmSecuritiesMovementType,
					SettlementTypeAndAdditionalParameters9.mmSecuritiesMovementType, SettlementTypeAndAdditionalParameters10.mmSecuritiesMovementType, TransactionDetails5.mmSecuritiesMovementType,
					TransactionDetails9.mmSecuritiesMovementType, TransactionDetails22.mmSecuritiesMovementType, TransactionDetails23.mmSecuritiesMovementType, TransactionDetails36.mmSecuritiesMovementType,
					TransactionDetails47.mmSecuritiesMovementType, TransactionDetails53.mmSecuritiesMovementType, TransactionDetails58.mmSecuritiesMovementType, TransactionDetails7.mmSecuritiesMovementType,
					TransactionDetails8.mmSecuritiesMovementType, TransactionDetails16.mmSecuritiesMovementType, TransactionDetails17.mmSecuritiesMovementType, TransactionDetails26.mmSecuritiesMovementType,
					TransactionDetails25.mmSecuritiesMovementType, TransactionDetails27.mmSecuritiesMovementType, TransactionDetails33.mmSecuritiesMovementType, TransactionDetails39.mmSecuritiesMovementType,
					TransactionDetails50.mmSecuritiesMovementType, TransactionDetails56.mmSecuritiesMovementType, TransactionDetails59.mmSecuritiesMovementType, TransactionDetails6.mmSecuritiesMovementType,
					TransactionDetails18.mmSecuritiesMovementType, TransactionDetails24.mmSecuritiesMovementType, TransactionDetails34.mmSecuritiesMovementType, TransactionDetails37.mmSecuritiesMovementType,
					TransactionDetails48.mmSecuritiesMovementType, TransactionDetails57.mmSecuritiesMovementType, TransactionDetails60.mmSecuritiesMovementType, SecuritiesTradeDetails7.mmSecuritiesMovementType,
					SecuritiesTradeDetails19.mmSecuritiesMovementType, SecuritiesFinancingTransactionDetails2.mmSecuritiesMovementType, SecuritiesFinancingTransactionDetails8.mmSecuritiesMovementType,
					SettlementTypeAndAdditionalParameters2.mmSecuritiesMovementType, SecuritiesTradeDetails4.mmSecuritiesMovementType, SecuritiesTradeDetails17.mmSecuritiesMovementType,
					SettlementTypeAndIdentification4.mmSecuritiesMovementType, SecuritiesFinancingTransactionDetails6.mmSecuritiesMovementType, SecuritiesFinancingTransactionDetails10.mmSecuritiesMovementType,
					SecuritiesFinancingTransactionDetails17.mmSecuritiesMovementType, SecuritiesFinancingTransactionDetails18.mmSecuritiesMovementType, SettlementTypeAndAdditionalParameters3.mmSecuritiesMovementType,
					SecuritiesTradeDetails10.mmSecuritiesMovementType, SecuritiesTradeDetails22.mmSecuritiesMovementType, SecuritiesTradeDetails23.mmSecuritiesMovementType, SecuritiesTradeDetails29.mmSecuritiesMovementType,
					TransactionDetails40.mmSecuritiesMovementType, TransactionDetails42.mmSecuritiesMovementType, TransactionDetails46.mmSecuritiesMovementType, SettlementTypeAndIdentification6.mmSecuritiesMovementType,
					SecuritiesTradeDetails14.mmSecuritiesMovementType, SecuritiesTradeDetails20.mmSecuritiesMovementType, SecuritiesTradeDetails24.mmSecuritiesMovementType, SecuritiesTradeDetails30.mmSecuritiesMovementType,
					TransactionDetails45.mmSecuritiesMovementType, SettlementObligation3.mmSecuritiesMovementType, SettlementObligation5.mmSecuritiesMovementType, SettlementObligation4.mmSecuritiesMovementType,
					NetPosition1.mmSecuritiesMovementType, NetPosition2.mmSecuritiesMovementType, TransactionDetails51.mmSecuritiesMovementType, TransactionDetails61.mmSecuritiesMovementType,
					SecuritiesFinancingTransactionDetails21.mmSecuritiesMovementType, TransactionDetails62.mmSecuritiesMovementType, TransactionDetails63.mmSecuritiesMovementType, SecuritiesTradeDetails35.mmSecuritiesMovementType,
					SecuritiesFinancingTransactionDetails22.mmSecuritiesMovementType, TransactionDetails66.mmSecuritiesMovementType, SecuritiesTradeDetails42.mmSecuritiesMovementType, TransactionDetails67.mmSecuritiesMovementType,
					TransactionDetails68.mmSecuritiesMovementType, SecuritiesFinancingTransactionDetails24.mmSecuritiesMovementType, TransactionDetails70.mmSecuritiesMovementType, TransactionDetails69.mmSecuritiesMovementType,
					NetPosition3.mmSecuritiesMovementType, SettlementObligation8.mmSecuritiesMovementType, TransactionDetails71.mmSecuritiesMovementType, SecuritiesFinancingTransactionDetails25.mmSecuritiesMovementType,
					TransactionDetails72.mmSecuritiesMovementType, TransactionDetails81.mmSecuritiesMovementType, SecuritiesTradeDetails49.mmSecuritiesMovementType, TransactionDetails82.mmSecuritiesMovementType,
					SecuritiesFinancingTransactionDetails26.mmSecuritiesMovementType, TransactionDetails79.mmSecuritiesMovementType, SecuritiesTradeDetails48.mmSecuritiesMovementType, TransactionDetails75.mmSecuritiesMovementType,
					TransactionDetails78.mmSecuritiesMovementType, SettlementTypeAndIdentification18.mmSecuritiesMovementType, SettlementTypeAndIdentification19.mmSecuritiesMovementType,
					TransactionTypeAndAdditionalParameters10.mmSecuritiesMovementType, SettlementTypeAndAdditionalParameters11.mmSecuritiesMovementType, SettlementTypeAndAdditionalParameters12.mmSecuritiesMovementType,
					SettlementTypeAndAdditionalParameters14.mmSecuritiesMovementType, SecuritiesTradeDetails57.mmSecuritiesMovementType, SecuritiesFinancingTransactionDetails33.mmSecuritiesMovementType,
					TransactionTypeAndAdditionalParameters12.mmSecuritiesMovementType, SecuritiesTradeDetails61.mmSecuritiesMovementType, TransactionDetails92.mmSecuritiesMovementType, TransactionDetails84.mmSecuritiesMovementType,
					SettlementTypeAndAdditionalParameters16.mmSecuritiesMovementType, SettlementTypeAndIdentification24.mmSecuritiesMovementType, TransactionDetails87.mmSecuritiesMovementType,
					SettlementTypeAndAdditionalParameters15.mmSecuritiesMovementType, TransactionDetails91.mmSecuritiesMovementType, TransactionDetails90.mmSecuritiesMovementType,
					SettlementTypeAndAdditionalParameters18.mmSecuritiesMovementType, SettlementTypeAndIdentification22.mmSecuritiesMovementType, TransactionDetails93.mmSecuritiesMovementType,
					SettlementTypeAndAdditionalParameters19.mmSecuritiesMovementType, SecuritiesTradeDetails68.mmSecuritiesMovementType, TransactionDetails97.mmSecuritiesMovementType,
					TransactionTypeAndAdditionalParameters16.mmSecuritiesMovementType, SecuritiesFinancingTransactionDetails35.mmSecuritiesMovementType, TransactionDetails96.mmSecuritiesMovementType,
					TransactionDetails95.mmSecuritiesMovementType, TransactionTypeAndAdditionalParameters19.mmSecuritiesMovementType, SecuritiesTradeDetails69.mmSecuritiesMovementType,
					SecuritiesFinancingTransactionDetails36.mmSecuritiesMovementType, SettlementTypeAndAdditionalParameters20.mmSecuritiesMovementType, TransactionDetails100.mmSecuritiesMovementType,
					TransactionDetails99.mmSecuritiesMovementType, TransactionDetails98.mmSecuritiesMovementType, TransactionDetails102.mmSecuritiesMovementType, SecuritiesTradeDetails71.mmSecuritiesMovementType,
					TransactionDetails105.mmSecuritiesMovementType, SecuritiesTradeDetails72.mmSecuritiesMovementType, TransactionDetails104.mmSecuritiesMovementType, TransactionDetails103.mmSecuritiesMovementType,
					SecuritiesTradeDetails81.mmSecuritiesMovementType, SecuritiesTradeDetails85.mmSecuritiesMovementType, TransactionDetails110.mmSecuritiesMovementType, TransactionDetails111.mmSecuritiesMovementType,
					TransactionDetails112.mmSecuritiesMovementType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22H::REDE"), new ISO15022Synonym(this, ":22F::PAYM"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesMovementType";
			definition = "Specifies if the movement on a securities account results from a deliver or a receive instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ReceiveDeliveryCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlement.class.getMethod("getSecuritiesMovementType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesQuantity settlementQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmSecuritiesSettlement
	 * SecuritiesQuantity.mmSecuritiesSettlement}</li>
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
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails10#mmSettlementQuantity
	 * TransactionDetails10.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails29#mmSettlementQuantity
	 * TransactionDetails29.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount30#mmSettlementQuantity
	 * QuantityAndAccount30.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails28#mmSettlementQuantity
	 * TransactionDetails28.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails31#mmSettlementQuantity
	 * TransactionDetails31.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails44#mmSettlementQuantity
	 * TransactionDetails44.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount33#mmSettlementQuantity
	 * QuantityAndAccount33.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails1#mmRemainingToBeSettledQuantity
	 * IntraPositionMovementDetails1.mmRemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails2#mmRemainingToBeSettledQuantity
	 * IntraPositionMovementDetails2.mmRemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails5#mmRemainingToBeSettledQuantity
	 * IntraPositionMovementDetails5.mmRemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails6#mmRemainingToBeSettledQuantity
	 * IntraPositionMovementDetails6.mmRemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails7#mmRemainingToBeSettledQuantity
	 * IntraPositionMovementDetails7.mmRemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails8#mmRemainingToBeSettledQuantity
	 * IntraPositionMovementDetails8.mmRemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails9#mmRemainingToBeSettledQuantity
	 * IntraPositionMovementDetails9.mmRemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails10#mmRemainingToBeSettledQuantity
	 * IntraPositionMovementDetails10.mmRemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount6#mmSettledQuantity
	 * QuantityAndAccount6.mmSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount6#mmPreviouslySettledQuantity
	 * QuantityAndAccount6.mmPreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount6#mmRemainingToBeSettledQuantity
	 * QuantityAndAccount6.mmRemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount11#mmSettledQuantity
	 * QuantityAndAccount11.mmSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount11#mmPreviouslySettledQuantity
	 * QuantityAndAccount11.mmPreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount11#mmRemainingToBeSettledQuantity
	 * QuantityAndAccount11.mmRemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount18#mmSettledQuantity
	 * QuantityAndAccount18.mmSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount18#mmPreviouslySettledQuantity
	 * QuantityAndAccount18.mmPreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount18#mmRemainingToBeSettledQuantity
	 * QuantityAndAccount18.mmRemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount19#mmSettledQuantity
	 * QuantityAndAccount19.mmSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount19#mmPreviouslySettledQuantity
	 * QuantityAndAccount19.mmPreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount19#mmRemainingToBeSettledQuantity
	 * QuantityAndAccount19.mmRemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount1#mmSettlementQuantity
	 * QuantityAndAccount1.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount5#mmSettlementQuantity
	 * QuantityAndAccount5.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount17#mmSettlementQuantity
	 * QuantityAndAccount17.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount24#mmSettlementQuantity
	 * QuantityAndAccount24.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount25#mmSettlementQuantity
	 * QuantityAndAccount25.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount34#mmSettlementQuantity
	 * QuantityAndAccount34.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount2#mmSettledQuantity
	 * QuantityAndAccount2.mmSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount2#mmPreviouslySettledQuantity
	 * QuantityAndAccount2.mmPreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount2#mmRemainingToBeSettledQuantity
	 * QuantityAndAccount2.mmRemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount12#mmSettledQuantity
	 * QuantityAndAccount12.mmSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount12#mmPreviouslySettledQuantity
	 * QuantityAndAccount12.mmPreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount12#mmRemainingToBeSettledQuantity
	 * QuantityAndAccount12.mmRemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount15#mmSettledQuantity
	 * QuantityAndAccount15.mmSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount15#mmPreviouslySettledQuantity
	 * QuantityAndAccount15.mmPreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount15#mmRemainingToBeSettledQuantity
	 * QuantityAndAccount15.mmRemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount20#mmSettledQuantity
	 * QuantityAndAccount20.mmSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount20#mmPreviouslySettledQuantity
	 * QuantityAndAccount20.mmPreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount20#mmRemainingToBeSettledQuantity
	 * QuantityAndAccount20.mmRemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount28#mmSettledQuantity
	 * QuantityAndAccount28.mmSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount28#mmPreviouslySettledQuantity
	 * QuantityAndAccount28.mmPreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount28#mmRemainingToBeSettledQuantity
	 * QuantityAndAccount28.mmRemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount37#mmSettledQuantity
	 * QuantityAndAccount37.mmSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount37#mmPreviouslySettledQuantity
	 * QuantityAndAccount37.mmPreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount37#mmRemainingToBeSettledQuantity
	 * QuantityAndAccount37.mmRemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails5#mmSettlementQuantity
	 * TransactionDetails5.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails9#mmSettlementQuantity
	 * TransactionDetails9.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails22#mmSettlementQuantity
	 * TransactionDetails22.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails23#mmSettlementQuantity
	 * TransactionDetails23.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails36#mmSettlementQuantity
	 * TransactionDetails36.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails47#mmSettlementQuantity
	 * TransactionDetails47.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails53#mmSettlementQuantity
	 * TransactionDetails53.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails58#mmSettlementQuantity
	 * TransactionDetails58.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails7#mmPostingQuantity
	 * TransactionDetails7.mmPostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails8#mmPostingQuantity
	 * TransactionDetails8.mmPostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails16#mmPostingQuantity
	 * TransactionDetails16.mmPostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails17#mmPostingQuantity
	 * TransactionDetails17.mmPostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails26#mmPostingQuantity
	 * TransactionDetails26.mmPostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails25#mmPostingQuantity
	 * TransactionDetails25.mmPostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails27#mmPostingQuantity
	 * TransactionDetails27.mmPostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails33#mmPostingQuantity
	 * TransactionDetails33.mmPostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails39#mmPostingQuantity
	 * TransactionDetails39.mmPostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails50#mmPostingQuantity
	 * TransactionDetails50.mmPostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails56#mmPostingQuantity
	 * TransactionDetails56.mmPostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails59#mmPostingQuantity
	 * TransactionDetails59.mmPostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails6#mmPostingQuantity
	 * TransactionDetails6.mmPostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails18#mmPostingQuantity
	 * TransactionDetails18.mmPostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails24#mmPostingQuantity
	 * TransactionDetails24.mmPostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails34#mmPostingQuantity
	 * TransactionDetails34.mmPostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails37#mmPostingQuantity
	 * TransactionDetails37.mmPostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails48#mmPostingQuantity
	 * TransactionDetails48.mmPostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails57#mmPostingQuantity
	 * TransactionDetails57.mmPostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails60#mmPostingQuantity
	 * TransactionDetails60.mmPostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Quantity5#mmSettlementQuantity
	 * Quantity5.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount7#mmSettlementQuantity
	 * QuantityAndAccount7.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount16#mmSettlementQuantity
	 * QuantityAndAccount16.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2#mmSettlementQuantity
	 * SecuritiesFinancingTransactionDetails2.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8#mmSettlementQuantity
	 * SecuritiesFinancingTransactionDetails8.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount3#mmSettlementQuantity
	 * QuantityAndAccount3.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount13#mmSettlementQuantity
	 * QuantityAndAccount13.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount8#mmSettlementQuantity
	 * QuantityAndAccount8.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount14#mmSettlementQuantity
	 * QuantityAndAccount14.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails4#mmSettlementQuantity
	 * TransactionDetails4.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails30#mmSettlementQuantity
	 * TransactionDetails30.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount10#mmSettlementQuantity
	 * QuantityAndAccount10.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount21#mmSettlementQuantity
	 * QuantityAndAccount21.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6#mmSettlementQuantity
	 * SecuritiesFinancingTransactionDetails6.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10#mmSettlementQuantity
	 * SecuritiesFinancingTransactionDetails10.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17#mmSettlementQuantity
	 * SecuritiesFinancingTransactionDetails17.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18#mmSettlementQuantity
	 * SecuritiesFinancingTransactionDetails18.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails20#mmSettlementQuantity
	 * TransactionDetails20.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount4#mmSettlementQuantity
	 * QuantityAndAccount4.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount22#mmSettlementQuantity
	 * QuantityAndAccount22.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount27#mmSettlementQuantity
	 * QuantityAndAccount27.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount36#mmSettlementQuantity
	 * QuantityAndAccount36.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount9#mmSettlementQuantity
	 * QuantityAndAccount9.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount23#mmSettlementQuantity
	 * QuantityAndAccount23.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount26#mmSettlementQuantity
	 * QuantityAndAccount26.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount35#mmSettlementQuantity
	 * QuantityAndAccount35.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails40#mmSettlementQuantity
	 * TransactionDetails40.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails42#mmSettlementQuantity
	 * TransactionDetails42.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails46#mmSettlementQuantity
	 * TransactionDetails46.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails32#mmSettlementQuantity
	 * TransactionDetails32.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails14#mmSettlementQuantity
	 * TransactionDetails14.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails35#mmSettlementQuantity
	 * TransactionDetails35.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Quantity6#mmSettlementQuantity
	 * Quantity6.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Quantity7#mmSettlementQuantity
	 * Quantity7.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Quantity8#mmSettlementQuantity
	 * Quantity8.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails45#mmSettlementQuantity
	 * TransactionDetails45.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation1#mmRemainingQuantityToBeSettled
	 * SettlementObligation1.mmRemainingQuantityToBeSettled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails3#mmRemainingToBeSettledQuantity
	 * IntraPositionMovementDetails3.mmRemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails4#mmRemainingToBeSettledQuantity
	 * IntraPositionMovementDetails4.mmRemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails51#mmSettlementQuantity
	 * TransactionDetails51.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails51#mmSettledQuantity
	 * TransactionDetails51.mmSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails51#mmPreviouslySettledQuantity
	 * TransactionDetails51.mmPreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails51#mmRemainingToBeSettledQuantity
	 * TransactionDetails51.mmRemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails52#mmSettlementQuantity
	 * TransactionDetails52.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails61#mmSettlementQuantity
	 * TransactionDetails61.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21#mmSettlementQuantity
	 * SecuritiesFinancingTransactionDetails21.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails62#mmPostingQuantity
	 * TransactionDetails62.mmPostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails63#mmPostingQuantity
	 * TransactionDetails63.mmPostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22#mmSettlementQuantity
	 * SecuritiesFinancingTransactionDetails22.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails66#mmSettlementQuantity
	 * TransactionDetails66.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails67#mmPostingQuantity
	 * TransactionDetails67.mmPostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails68#mmPostingQuantity
	 * TransactionDetails68.mmPostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24#mmSettlementQuantity
	 * SecuritiesFinancingTransactionDetails24.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails70#mmSettlementQuantity
	 * TransactionDetails70.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails69#mmPostingQuantity
	 * TransactionDetails69.mmPostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails71#mmSettlementQuantity
	 * TransactionDetails71.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25#mmSettlementQuantity
	 * SecuritiesFinancingTransactionDetails25.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails72#mmPostingQuantity
	 * TransactionDetails72.mmPostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount39#mmSettlementQuantity
	 * QuantityAndAccount39.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount41#mmSettledQuantity
	 * QuantityAndAccount41.mmSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount41#mmPreviouslySettledQuantity
	 * QuantityAndAccount41.mmPreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount41#mmRemainingToBeSettledQuantity
	 * QuantityAndAccount41.mmRemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount40#mmSettledQuantity
	 * QuantityAndAccount40.mmSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount40#mmPreviouslySettledQuantity
	 * QuantityAndAccount40.mmPreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount40#mmRemainingToBeSettledQuantity
	 * QuantityAndAccount40.mmRemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails81#mmSettlementQuantity
	 * TransactionDetails81.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount42#mmSettlementQuantity
	 * QuantityAndAccount42.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails74#mmSettlementQuantity
	 * TransactionDetails74.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails82#mmSettlementQuantity
	 * TransactionDetails82.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount38#mmSettlementQuantity
	 * QuantityAndAccount38.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#mmSettlementQuantity
	 * SecuritiesFinancingTransactionDetails26.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails79#mmSettlementQuantity
	 * TransactionDetails79.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails80#mmSettlementQuantity
	 * TransactionDetails80.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount43#mmSettlementQuantity
	 * QuantityAndAccount43.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails75#mmPostingQuantity
	 * TransactionDetails75.mmPostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails78#mmPostingQuantity
	 * TransactionDetails78.mmPostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Quantity11#mmSettlementQuantity
	 * Quantity11.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount45#mmSettlementQuantity
	 * QuantityAndAccount45.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails11#mmRemainingToBeSettledQuantity
	 * IntraPositionMovementDetails11.mmRemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount47#mmSettlementQuantity
	 * QuantityAndAccount47.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#mmSettlementQuantity
	 * SecuritiesFinancingTransactionDetails33.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount48#mmSettlementQuantity
	 * QuantityAndAccount48.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails88#mmSettlementQuantity
	 * TransactionDetails88.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount46#mmSettledQuantity
	 * QuantityAndAccount46.mmSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount46#mmPreviouslySettledQuantity
	 * QuantityAndAccount46.mmPreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount46#mmRemainingToBeSettledQuantity
	 * QuantityAndAccount46.mmRemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails92#mmSettlementQuantity
	 * TransactionDetails92.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails84#mmSettlementQuantity
	 * TransactionDetails84.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails83#mmSettlementQuantity
	 * TransactionDetails83.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount51#mmSettledQuantity
	 * QuantityAndAccount51.mmSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount51#mmPreviouslySettledQuantity
	 * QuantityAndAccount51.mmPreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount51#mmRemainingToBeSettledQuantity
	 * QuantityAndAccount51.mmRemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails87#mmSettlementQuantity
	 * TransactionDetails87.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount49#mmSettlementQuantity
	 * QuantityAndAccount49.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Quantity12#mmSettlementQuantity
	 * Quantity12.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails91#mmPostingQuantity
	 * TransactionDetails91.mmPostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount50#mmSettlementQuantity
	 * QuantityAndAccount50.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails90#mmPostingQuantity
	 * TransactionDetails90.mmPostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount55#mmSettlementQuantity
	 * QuantityAndAccount55.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails12#mmRemainingToBeSettledQuantity
	 * IntraPositionMovementDetails12.mmRemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails93#mmSettlementQuantity
	 * TransactionDetails93.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails93#mmSettledQuantity
	 * TransactionDetails93.mmSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails93#mmPreviouslySettledQuantity
	 * TransactionDetails93.mmPreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails93#mmRemainingToBeSettledQuantity
	 * TransactionDetails93.mmRemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails94#mmSettlementQuantity
	 * TransactionDetails94.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails97#mmSettlementQuantity
	 * TransactionDetails97.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmSettlementQuantity
	 * SecuritiesFinancingTransactionDetails35.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails96#mmPostingQuantity
	 * TransactionDetails96.mmPostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails13#mmRemainingToBeSettledQuantity
	 * IntraPositionMovementDetails13.mmRemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails95#mmPostingQuantity
	 * TransactionDetails95.mmPostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36#mmSettlementQuantity
	 * SecuritiesFinancingTransactionDetails36.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails14#mmRemainingToBeSettledQuantity
	 * IntraPositionMovementDetails14.mmRemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails100#mmSettlementQuantity
	 * TransactionDetails100.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails99#mmPostingQuantity
	 * TransactionDetails99.mmPostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails98#mmPostingQuantity
	 * TransactionDetails98.mmPostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount57#mmSettledQuantity
	 * QuantityAndAccount57.mmSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount57#mmPreviouslySettledQuantity
	 * QuantityAndAccount57.mmPreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount57#mmRemainingToBeSettledQuantity
	 * QuantityAndAccount57.mmRemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount58#mmSettlementQuantity
	 * QuantityAndAccount58.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount56#mmSettlementQuantity
	 * QuantityAndAccount56.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount61#mmSettlementQuantity
	 * QuantityAndAccount61.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount62#mmSettledQuantity
	 * QuantityAndAccount62.mmSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount62#mmPreviouslySettledQuantity
	 * QuantityAndAccount62.mmPreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount62#mmRemainingToBeSettledQuantity
	 * QuantityAndAccount62.mmRemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount60#mmSettlementQuantity
	 * QuantityAndAccount60.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails102#mmSettlementQuantity
	 * TransactionDetails102.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails102#mmSettledQuantity
	 * TransactionDetails102.mmSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails102#mmPreviouslySettledQuantity
	 * TransactionDetails102.mmPreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails102#mmRemainingToBeSettledQuantity
	 * TransactionDetails102.mmRemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount64#mmSettledQuantity
	 * QuantityAndAccount64.mmSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount64#mmPreviouslySettledQuantity
	 * QuantityAndAccount64.mmPreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount64#mmRemainingToBeSettledQuantity
	 * QuantityAndAccount64.mmRemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails105#mmSettlementQuantity
	 * TransactionDetails105.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount63#mmSettlementQuantity
	 * QuantityAndAccount63.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails104#mmPostingQuantity
	 * TransactionDetails104.mmPostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails103#mmPostingQuantity
	 * TransactionDetails103.mmPostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails15#mmRemainingToBeSettledQuantity
	 * IntraPositionMovementDetails15.mmRemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails107#mmSettlementQuantity
	 * TransactionDetails107.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount65#mmSettlementQuantity
	 * QuantityAndAccount65.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Quantity14#mmSettlementQuantity
	 * Quantity14.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount67#mmSettlementQuantity
	 * QuantityAndAccount67.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount68#mmSettlementQuantity
	 * QuantityAndAccount68.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails16#mmRemainingToBeSettledQuantity
	 * IntraPositionMovementDetails16.mmRemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Quantity15#mmSettlementQuantity
	 * Quantity15.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount69#mmSettlementQuantity
	 * QuantityAndAccount69.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount70#mmSettlementQuantity
	 * QuantityAndAccount70.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount71#mmSettlementQuantity
	 * QuantityAndAccount71.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount72#mmSettledQuantity
	 * QuantityAndAccount72.mmSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount72#mmPreviouslySettledQuantity
	 * QuantityAndAccount72.mmPreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount72#mmRemainingToBeSettledQuantity
	 * QuantityAndAccount72.mmRemainingToBeSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails109#mmSettlementQuantity
	 * TransactionDetails109.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount76#mmSettlementQuantity
	 * QuantityAndAccount76.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails110#mmSettlementQuantity
	 * TransactionDetails110.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails111#mmPostingQuantity
	 * TransactionDetails111.mmPostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails112#mmPostingQuantity
	 * TransactionDetails112.mmPostingQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :36B::SETT</li>
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
	public static final MMBusinessAssociationEnd mmSettlementQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(TransactionDetails10.mmSettlementQuantity, TransactionDetails29.mmSettlementQuantity, QuantityAndAccount30.mmSettlementQuantity, TransactionDetails28.mmSettlementQuantity,
					TransactionDetails31.mmSettlementQuantity, TransactionDetails44.mmSettlementQuantity, QuantityAndAccount33.mmSettlementQuantity, IntraPositionMovementDetails1.mmRemainingToBeSettledQuantity,
					IntraPositionMovementDetails2.mmRemainingToBeSettledQuantity, IntraPositionMovementDetails5.mmRemainingToBeSettledQuantity, IntraPositionMovementDetails6.mmRemainingToBeSettledQuantity,
					IntraPositionMovementDetails7.mmRemainingToBeSettledQuantity, IntraPositionMovementDetails8.mmRemainingToBeSettledQuantity, IntraPositionMovementDetails9.mmRemainingToBeSettledQuantity,
					IntraPositionMovementDetails10.mmRemainingToBeSettledQuantity, QuantityAndAccount6.mmSettledQuantity, QuantityAndAccount6.mmPreviouslySettledQuantity, QuantityAndAccount6.mmRemainingToBeSettledQuantity,
					QuantityAndAccount11.mmSettledQuantity, QuantityAndAccount11.mmPreviouslySettledQuantity, QuantityAndAccount11.mmRemainingToBeSettledQuantity, QuantityAndAccount18.mmSettledQuantity,
					QuantityAndAccount18.mmPreviouslySettledQuantity, QuantityAndAccount18.mmRemainingToBeSettledQuantity, QuantityAndAccount19.mmSettledQuantity, QuantityAndAccount19.mmPreviouslySettledQuantity,
					QuantityAndAccount19.mmRemainingToBeSettledQuantity, QuantityAndAccount1.mmSettlementQuantity, QuantityAndAccount5.mmSettlementQuantity, QuantityAndAccount17.mmSettlementQuantity,
					QuantityAndAccount24.mmSettlementQuantity, QuantityAndAccount25.mmSettlementQuantity, QuantityAndAccount34.mmSettlementQuantity, QuantityAndAccount2.mmSettledQuantity, QuantityAndAccount2.mmPreviouslySettledQuantity,
					QuantityAndAccount2.mmRemainingToBeSettledQuantity, QuantityAndAccount12.mmSettledQuantity, QuantityAndAccount12.mmPreviouslySettledQuantity, QuantityAndAccount12.mmRemainingToBeSettledQuantity,
					QuantityAndAccount15.mmSettledQuantity, QuantityAndAccount15.mmPreviouslySettledQuantity, QuantityAndAccount15.mmRemainingToBeSettledQuantity, QuantityAndAccount20.mmSettledQuantity,
					QuantityAndAccount20.mmPreviouslySettledQuantity, QuantityAndAccount20.mmRemainingToBeSettledQuantity, QuantityAndAccount28.mmSettledQuantity, QuantityAndAccount28.mmPreviouslySettledQuantity,
					QuantityAndAccount28.mmRemainingToBeSettledQuantity, QuantityAndAccount37.mmSettledQuantity, QuantityAndAccount37.mmPreviouslySettledQuantity, QuantityAndAccount37.mmRemainingToBeSettledQuantity,
					TransactionDetails5.mmSettlementQuantity, TransactionDetails9.mmSettlementQuantity, TransactionDetails22.mmSettlementQuantity, TransactionDetails23.mmSettlementQuantity, TransactionDetails36.mmSettlementQuantity,
					TransactionDetails47.mmSettlementQuantity, TransactionDetails53.mmSettlementQuantity, TransactionDetails58.mmSettlementQuantity, TransactionDetails7.mmPostingQuantity, TransactionDetails8.mmPostingQuantity,
					TransactionDetails16.mmPostingQuantity, TransactionDetails17.mmPostingQuantity, TransactionDetails26.mmPostingQuantity, TransactionDetails25.mmPostingQuantity, TransactionDetails27.mmPostingQuantity,
					TransactionDetails33.mmPostingQuantity, TransactionDetails39.mmPostingQuantity, TransactionDetails50.mmPostingQuantity, TransactionDetails56.mmPostingQuantity, TransactionDetails59.mmPostingQuantity,
					TransactionDetails6.mmPostingQuantity, TransactionDetails18.mmPostingQuantity, TransactionDetails24.mmPostingQuantity, TransactionDetails34.mmPostingQuantity, TransactionDetails37.mmPostingQuantity,
					TransactionDetails48.mmPostingQuantity, TransactionDetails57.mmPostingQuantity, TransactionDetails60.mmPostingQuantity, Quantity5.mmSettlementQuantity, QuantityAndAccount7.mmSettlementQuantity,
					QuantityAndAccount16.mmSettlementQuantity, SecuritiesFinancingTransactionDetails2.mmSettlementQuantity, SecuritiesFinancingTransactionDetails8.mmSettlementQuantity, QuantityAndAccount3.mmSettlementQuantity,
					QuantityAndAccount13.mmSettlementQuantity, QuantityAndAccount8.mmSettlementQuantity, QuantityAndAccount14.mmSettlementQuantity, TransactionDetails4.mmSettlementQuantity, TransactionDetails30.mmSettlementQuantity,
					QuantityAndAccount10.mmSettlementQuantity, QuantityAndAccount21.mmSettlementQuantity, SecuritiesFinancingTransactionDetails6.mmSettlementQuantity, SecuritiesFinancingTransactionDetails10.mmSettlementQuantity,
					SecuritiesFinancingTransactionDetails17.mmSettlementQuantity, SecuritiesFinancingTransactionDetails18.mmSettlementQuantity, TransactionDetails20.mmSettlementQuantity, QuantityAndAccount4.mmSettlementQuantity,
					QuantityAndAccount22.mmSettlementQuantity, QuantityAndAccount27.mmSettlementQuantity, QuantityAndAccount36.mmSettlementQuantity, QuantityAndAccount9.mmSettlementQuantity, QuantityAndAccount23.mmSettlementQuantity,
					QuantityAndAccount26.mmSettlementQuantity, QuantityAndAccount35.mmSettlementQuantity, TransactionDetails40.mmSettlementQuantity, TransactionDetails42.mmSettlementQuantity, TransactionDetails46.mmSettlementQuantity,
					TransactionDetails32.mmSettlementQuantity, TransactionDetails14.mmSettlementQuantity, TransactionDetails35.mmSettlementQuantity, Quantity6.mmSettlementQuantity, Quantity7.mmSettlementQuantity,
					Quantity8.mmSettlementQuantity, TransactionDetails45.mmSettlementQuantity, SettlementObligation1.mmRemainingQuantityToBeSettled, IntraPositionMovementDetails3.mmRemainingToBeSettledQuantity,
					IntraPositionMovementDetails4.mmRemainingToBeSettledQuantity, TransactionDetails51.mmSettlementQuantity, TransactionDetails51.mmSettledQuantity, TransactionDetails51.mmPreviouslySettledQuantity,
					TransactionDetails51.mmRemainingToBeSettledQuantity, TransactionDetails52.mmSettlementQuantity, TransactionDetails61.mmSettlementQuantity, SecuritiesFinancingTransactionDetails21.mmSettlementQuantity,
					TransactionDetails62.mmPostingQuantity, TransactionDetails63.mmPostingQuantity, SecuritiesFinancingTransactionDetails22.mmSettlementQuantity, TransactionDetails66.mmSettlementQuantity,
					TransactionDetails67.mmPostingQuantity, TransactionDetails68.mmPostingQuantity, SecuritiesFinancingTransactionDetails24.mmSettlementQuantity, TransactionDetails70.mmSettlementQuantity,
					TransactionDetails69.mmPostingQuantity, TransactionDetails71.mmSettlementQuantity, SecuritiesFinancingTransactionDetails25.mmSettlementQuantity, TransactionDetails72.mmPostingQuantity,
					QuantityAndAccount39.mmSettlementQuantity, QuantityAndAccount41.mmSettledQuantity, QuantityAndAccount41.mmPreviouslySettledQuantity, QuantityAndAccount41.mmRemainingToBeSettledQuantity,
					QuantityAndAccount40.mmSettledQuantity, QuantityAndAccount40.mmPreviouslySettledQuantity, QuantityAndAccount40.mmRemainingToBeSettledQuantity, TransactionDetails81.mmSettlementQuantity,
					QuantityAndAccount42.mmSettlementQuantity, TransactionDetails74.mmSettlementQuantity, TransactionDetails82.mmSettlementQuantity, QuantityAndAccount38.mmSettlementQuantity,
					SecuritiesFinancingTransactionDetails26.mmSettlementQuantity, TransactionDetails79.mmSettlementQuantity, TransactionDetails80.mmSettlementQuantity, QuantityAndAccount43.mmSettlementQuantity,
					TransactionDetails75.mmPostingQuantity, TransactionDetails78.mmPostingQuantity, Quantity11.mmSettlementQuantity, QuantityAndAccount45.mmSettlementQuantity, IntraPositionMovementDetails11.mmRemainingToBeSettledQuantity,
					QuantityAndAccount47.mmSettlementQuantity, SecuritiesFinancingTransactionDetails33.mmSettlementQuantity, QuantityAndAccount48.mmSettlementQuantity, TransactionDetails88.mmSettlementQuantity,
					QuantityAndAccount46.mmSettledQuantity, QuantityAndAccount46.mmPreviouslySettledQuantity, QuantityAndAccount46.mmRemainingToBeSettledQuantity, TransactionDetails92.mmSettlementQuantity,
					TransactionDetails84.mmSettlementQuantity, TransactionDetails83.mmSettlementQuantity, QuantityAndAccount51.mmSettledQuantity, QuantityAndAccount51.mmPreviouslySettledQuantity,
					QuantityAndAccount51.mmRemainingToBeSettledQuantity, TransactionDetails87.mmSettlementQuantity, QuantityAndAccount49.mmSettlementQuantity, Quantity12.mmSettlementQuantity, TransactionDetails91.mmPostingQuantity,
					QuantityAndAccount50.mmSettlementQuantity, TransactionDetails90.mmPostingQuantity, QuantityAndAccount55.mmSettlementQuantity, IntraPositionMovementDetails12.mmRemainingToBeSettledQuantity,
					TransactionDetails93.mmSettlementQuantity, TransactionDetails93.mmSettledQuantity, TransactionDetails93.mmPreviouslySettledQuantity, TransactionDetails93.mmRemainingToBeSettledQuantity,
					TransactionDetails94.mmSettlementQuantity, TransactionDetails97.mmSettlementQuantity, SecuritiesFinancingTransactionDetails35.mmSettlementQuantity, TransactionDetails96.mmPostingQuantity,
					IntraPositionMovementDetails13.mmRemainingToBeSettledQuantity, TransactionDetails95.mmPostingQuantity, SecuritiesFinancingTransactionDetails36.mmSettlementQuantity,
					IntraPositionMovementDetails14.mmRemainingToBeSettledQuantity, TransactionDetails100.mmSettlementQuantity, TransactionDetails99.mmPostingQuantity, TransactionDetails98.mmPostingQuantity,
					QuantityAndAccount57.mmSettledQuantity, QuantityAndAccount57.mmPreviouslySettledQuantity, QuantityAndAccount57.mmRemainingToBeSettledQuantity, QuantityAndAccount58.mmSettlementQuantity,
					QuantityAndAccount56.mmSettlementQuantity, QuantityAndAccount61.mmSettlementQuantity, QuantityAndAccount62.mmSettledQuantity, QuantityAndAccount62.mmPreviouslySettledQuantity,
					QuantityAndAccount62.mmRemainingToBeSettledQuantity, QuantityAndAccount60.mmSettlementQuantity, TransactionDetails102.mmSettlementQuantity, TransactionDetails102.mmSettledQuantity,
					TransactionDetails102.mmPreviouslySettledQuantity, TransactionDetails102.mmRemainingToBeSettledQuantity, QuantityAndAccount64.mmSettledQuantity, QuantityAndAccount64.mmPreviouslySettledQuantity,
					QuantityAndAccount64.mmRemainingToBeSettledQuantity, TransactionDetails105.mmSettlementQuantity, QuantityAndAccount63.mmSettlementQuantity, TransactionDetails104.mmPostingQuantity,
					TransactionDetails103.mmPostingQuantity, IntraPositionMovementDetails15.mmRemainingToBeSettledQuantity, TransactionDetails107.mmSettlementQuantity, QuantityAndAccount65.mmSettlementQuantity,
					Quantity14.mmSettlementQuantity, QuantityAndAccount67.mmSettlementQuantity, QuantityAndAccount68.mmSettlementQuantity, IntraPositionMovementDetails16.mmRemainingToBeSettledQuantity, Quantity15.mmSettlementQuantity,
					QuantityAndAccount69.mmSettlementQuantity, QuantityAndAccount70.mmSettlementQuantity, QuantityAndAccount71.mmSettlementQuantity, QuantityAndAccount72.mmSettledQuantity, QuantityAndAccount72.mmPreviouslySettledQuantity,
					QuantityAndAccount72.mmRemainingToBeSettledQuantity, TransactionDetails109.mmSettlementQuantity, QuantityAndAccount76.mmSettlementQuantity, TransactionDetails110.mmSettlementQuantity,
					TransactionDetails111.mmPostingQuantity, TransactionDetails112.mmPostingQuantity);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":36B::SETT"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementQuantity";
			definition = "Total quantity of securities to be settled.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmSecuritiesSettlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected SecuritiesTradeExecution securitiesTradeExecution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmSecuritiesSettlement
	 * SecuritiesTradeExecution.mmSecuritiesSettlement}</li>
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
	public static final MMBusinessAssociationEnd mmSecuritiesTradeExecution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTradeExecution";
			definition = "Specifies the trade which originates the settlement process.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeExecution.mmSecuritiesSettlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeExecution.mmObject();
		}
	};
	protected CurrencyCode currencyToBuy;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.choice.CurrencyToBuyOrSell1Choice#mmCurrencyToBuy
	 * CurrencyToBuyOrSell1Choice.mmCurrencyToBuy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption5#mmCurrencyToBuy
	 * CorporateActionOption5.mmCurrencyToBuy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption13#mmCurrencyToBuy
	 * CorporateActionOption13.mmCurrencyToBuy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption25#mmCurrencyToBuy
	 * CorporateActionOption25.mmCurrencyToBuy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption30#mmCurrencyToBuy
	 * CorporateActionOption30.mmCurrencyToBuy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption38#mmCurrencyToBuy
	 * CorporateActionOption38.mmCurrencyToBuy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption47#mmCurrencyToBuy
	 * CorporateActionOption47.mmCurrencyToBuy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption57#mmCurrencyToBuy
	 * CorporateActionOption57.mmCurrencyToBuy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption58#mmCurrencyToBuy
	 * CorporateActionOption58.mmCurrencyToBuy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption103#mmCurrencyToBuy
	 * CorporateActionOption103.mmCurrencyToBuy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption107#mmCurrencyToBuy
	 * CorporateActionOption107.mmCurrencyToBuy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption118#mmCurrencyToBuy
	 * CorporateActionOption118.mmCurrencyToBuy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption123#mmCurrencyToBuy
	 * CorporateActionOption123.mmCurrencyToBuy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption131#mmCurrencyToBuy
	 * CorporateActionOption131.mmCurrencyToBuy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption134#mmCurrencyToBuy
	 * CorporateActionOption134.mmCurrencyToBuy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption142#mmCurrencyToBuy
	 * CorporateActionOption142.mmCurrencyToBuy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption146#mmCurrencyToBuy
	 * CorporateActionOption146.mmCurrencyToBuy}</li>
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
	public static final MMBusinessAttribute mmCurrencyToBuy = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CurrencyToBuyOrSell1Choice.mmCurrencyToBuy, CorporateActionOption5.mmCurrencyToBuy, CorporateActionOption13.mmCurrencyToBuy, CorporateActionOption25.mmCurrencyToBuy,
					CorporateActionOption30.mmCurrencyToBuy, CorporateActionOption38.mmCurrencyToBuy, CorporateActionOption47.mmCurrencyToBuy, CorporateActionOption57.mmCurrencyToBuy, CorporateActionOption58.mmCurrencyToBuy,
					CorporateActionOption103.mmCurrencyToBuy, CorporateActionOption107.mmCurrencyToBuy, CorporateActionOption118.mmCurrencyToBuy, CorporateActionOption123.mmCurrencyToBuy, CorporateActionOption131.mmCurrencyToBuy,
					CorporateActionOption134.mmCurrencyToBuy, CorporateActionOption142.mmCurrencyToBuy, CorporateActionOption146.mmCurrencyToBuy);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CurrencyToBuy";
			definition = "Account servicer is instructed to buy the indicated currency after the receipt of cash proceeds.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlement.class.getMethod("getCurrencyToBuy", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyCode currencyToSell;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.choice.CurrencyToBuyOrSell1Choice#mmCurrencyToSell
	 * CurrencyToBuyOrSell1Choice.mmCurrencyToSell}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption5#mmCurrencyToSell
	 * CorporateActionOption5.mmCurrencyToSell}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption13#mmCurrencyToSell
	 * CorporateActionOption13.mmCurrencyToSell}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption25#mmCurrencyToSell
	 * CorporateActionOption25.mmCurrencyToSell}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption30#mmCurrencyToSell
	 * CorporateActionOption30.mmCurrencyToSell}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption38#mmCurrencyToSell
	 * CorporateActionOption38.mmCurrencyToSell}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption47#mmCurrencyToSell
	 * CorporateActionOption47.mmCurrencyToSell}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption57#mmCurrencyToSell
	 * CorporateActionOption57.mmCurrencyToSell}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption58#mmCurrencyToSell
	 * CorporateActionOption58.mmCurrencyToSell}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption103#mmCurrencyToSell
	 * CorporateActionOption103.mmCurrencyToSell}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption107#mmCurrencyToSell
	 * CorporateActionOption107.mmCurrencyToSell}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption118#mmCurrencyToSell
	 * CorporateActionOption118.mmCurrencyToSell}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption123#mmCurrencyToSell
	 * CorporateActionOption123.mmCurrencyToSell}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption131#mmCurrencyToSell
	 * CorporateActionOption131.mmCurrencyToSell}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption134#mmCurrencyToSell
	 * CorporateActionOption134.mmCurrencyToSell}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption142#mmCurrencyToSell
	 * CorporateActionOption142.mmCurrencyToSell}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption146#mmCurrencyToSell
	 * CorporateActionOption146.mmCurrencyToSell}</li>
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
	public static final MMBusinessAttribute mmCurrencyToSell = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CurrencyToBuyOrSell1Choice.mmCurrencyToSell, CorporateActionOption5.mmCurrencyToSell, CorporateActionOption13.mmCurrencyToSell, CorporateActionOption25.mmCurrencyToSell,
					CorporateActionOption30.mmCurrencyToSell, CorporateActionOption38.mmCurrencyToSell, CorporateActionOption47.mmCurrencyToSell, CorporateActionOption57.mmCurrencyToSell, CorporateActionOption58.mmCurrencyToSell,
					CorporateActionOption103.mmCurrencyToSell, CorporateActionOption107.mmCurrencyToSell, CorporateActionOption118.mmCurrencyToSell, CorporateActionOption123.mmCurrencyToSell, CorporateActionOption131.mmCurrencyToSell,
					CorporateActionOption134.mmCurrencyToSell, CorporateActionOption142.mmCurrencyToSell, CorporateActionOption146.mmCurrencyToSell);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CurrencyToSell";
			definition = "Account servicer is instructed to sell a currency in order to obtain the currency needed to fund the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlement.class.getMethod("getCurrencyToSell", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text denominationChoice;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount29#mmDenominationChoice
	 * QuantityAndAccount29.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount30#mmDenominationChoice
	 * QuantityAndAccount30.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount32#mmDenominationChoice
	 * QuantityAndAccount32.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount33#mmDenominationChoice
	 * QuantityAndAccount33.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount1#mmDenominationChoice
	 * QuantityAndAccount1.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount5#mmDenominationChoice
	 * QuantityAndAccount5.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount17#mmDenominationChoice
	 * QuantityAndAccount17.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount24#mmDenominationChoice
	 * QuantityAndAccount24.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount25#mmDenominationChoice
	 * QuantityAndAccount25.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount34#mmDenominationChoice
	 * QuantityAndAccount34.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount2#mmDenominationChoice
	 * QuantityAndAccount2.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount12#mmDenominationChoice
	 * QuantityAndAccount12.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount15#mmDenominationChoice
	 * QuantityAndAccount15.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount20#mmDenominationChoice
	 * QuantityAndAccount20.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount28#mmDenominationChoice
	 * QuantityAndAccount28.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount37#mmDenominationChoice
	 * QuantityAndAccount37.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Quantity5#mmDenominationChoice
	 * Quantity5.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount3#mmDenominationChoice
	 * QuantityAndAccount3.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount13#mmDenominationChoice
	 * QuantityAndAccount13.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount8#mmDenominationChoice
	 * QuantityAndAccount8.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount14#mmDenominationChoice
	 * QuantityAndAccount14.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount4#mmDenominationChoice
	 * QuantityAndAccount4.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount22#mmDenominationChoice
	 * QuantityAndAccount22.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount27#mmDenominationChoice
	 * QuantityAndAccount27.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount36#mmDenominationChoice
	 * QuantityAndAccount36.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount9#mmDenominationChoice
	 * QuantityAndAccount9.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount23#mmDenominationChoice
	 * QuantityAndAccount23.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount26#mmDenominationChoice
	 * QuantityAndAccount26.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount35#mmDenominationChoice
	 * QuantityAndAccount35.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Quantity6#mmDenominationChoice
	 * Quantity6.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Quantity7#mmDenominationChoice
	 * Quantity7.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Quantity8#mmDenominationChoice
	 * Quantity8.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount39#mmDenominationChoice
	 * QuantityAndAccount39.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount41#mmDenominationChoice
	 * QuantityAndAccount41.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount42#mmDenominationChoice
	 * QuantityAndAccount42.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount43#mmDenominationChoice
	 * QuantityAndAccount43.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Quantity11#mmDenominationChoice
	 * Quantity11.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount45#mmDenominationChoice
	 * QuantityAndAccount45.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount44#mmDenominationChoice
	 * QuantityAndAccount44.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount47#mmDenominationChoice
	 * QuantityAndAccount47.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount51#mmDenominationChoice
	 * QuantityAndAccount51.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount49#mmDenominationChoice
	 * QuantityAndAccount49.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Quantity12#mmDenominationChoice
	 * Quantity12.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount50#mmDenominationChoice
	 * QuantityAndAccount50.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount55#mmDenominationChoice
	 * QuantityAndAccount55.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount54#mmDenominationChoice
	 * QuantityAndAccount54.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount57#mmDenominationChoice
	 * QuantityAndAccount57.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount58#mmDenominationChoice
	 * QuantityAndAccount58.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount56#mmDenominationChoice
	 * QuantityAndAccount56.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount59#mmDenominationChoice
	 * QuantityAndAccount59.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount60#mmDenominationChoice
	 * QuantityAndAccount60.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount64#mmDenominationChoice
	 * QuantityAndAccount64.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount63#mmDenominationChoice
	 * QuantityAndAccount63.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount65#mmDenominationChoice
	 * QuantityAndAccount65.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount66#mmDenominationChoice
	 * QuantityAndAccount66.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Quantity14#mmDenominationChoice
	 * Quantity14.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount67#mmDenominationChoice
	 * QuantityAndAccount67.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount68#mmDenominationChoice
	 * QuantityAndAccount68.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Quantity15#mmDenominationChoice
	 * Quantity15.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount69#mmDenominationChoice
	 * QuantityAndAccount69.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount70#mmDenominationChoice
	 * QuantityAndAccount70.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount71#mmDenominationChoice
	 * QuantityAndAccount71.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount72#mmDenominationChoice
	 * QuantityAndAccount72.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount75#mmDenominationChoice
	 * QuantityAndAccount75.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount76#mmDenominationChoice
	 * QuantityAndAccount76.mmDenominationChoice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70a::DENC</li>
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
	public static final MMBusinessAttribute mmDenominationChoice = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(QuantityAndAccount29.mmDenominationChoice, QuantityAndAccount30.mmDenominationChoice, QuantityAndAccount32.mmDenominationChoice, QuantityAndAccount33.mmDenominationChoice,
					QuantityAndAccount1.mmDenominationChoice, QuantityAndAccount5.mmDenominationChoice, QuantityAndAccount17.mmDenominationChoice, QuantityAndAccount24.mmDenominationChoice, QuantityAndAccount25.mmDenominationChoice,
					QuantityAndAccount34.mmDenominationChoice, QuantityAndAccount2.mmDenominationChoice, QuantityAndAccount12.mmDenominationChoice, QuantityAndAccount15.mmDenominationChoice, QuantityAndAccount20.mmDenominationChoice,
					QuantityAndAccount28.mmDenominationChoice, QuantityAndAccount37.mmDenominationChoice, Quantity5.mmDenominationChoice, QuantityAndAccount3.mmDenominationChoice, QuantityAndAccount13.mmDenominationChoice,
					QuantityAndAccount8.mmDenominationChoice, QuantityAndAccount14.mmDenominationChoice, QuantityAndAccount4.mmDenominationChoice, QuantityAndAccount22.mmDenominationChoice, QuantityAndAccount27.mmDenominationChoice,
					QuantityAndAccount36.mmDenominationChoice, QuantityAndAccount9.mmDenominationChoice, QuantityAndAccount23.mmDenominationChoice, QuantityAndAccount26.mmDenominationChoice, QuantityAndAccount35.mmDenominationChoice,
					Quantity6.mmDenominationChoice, Quantity7.mmDenominationChoice, Quantity8.mmDenominationChoice, QuantityAndAccount39.mmDenominationChoice, QuantityAndAccount41.mmDenominationChoice,
					QuantityAndAccount42.mmDenominationChoice, QuantityAndAccount43.mmDenominationChoice, Quantity11.mmDenominationChoice, QuantityAndAccount45.mmDenominationChoice, QuantityAndAccount44.mmDenominationChoice,
					QuantityAndAccount47.mmDenominationChoice, QuantityAndAccount51.mmDenominationChoice, QuantityAndAccount49.mmDenominationChoice, Quantity12.mmDenominationChoice, QuantityAndAccount50.mmDenominationChoice,
					QuantityAndAccount55.mmDenominationChoice, QuantityAndAccount54.mmDenominationChoice, QuantityAndAccount57.mmDenominationChoice, QuantityAndAccount58.mmDenominationChoice, QuantityAndAccount56.mmDenominationChoice,
					QuantityAndAccount59.mmDenominationChoice, QuantityAndAccount60.mmDenominationChoice, QuantityAndAccount64.mmDenominationChoice, QuantityAndAccount63.mmDenominationChoice, QuantityAndAccount65.mmDenominationChoice,
					QuantityAndAccount66.mmDenominationChoice, Quantity14.mmDenominationChoice, QuantityAndAccount67.mmDenominationChoice, QuantityAndAccount68.mmDenominationChoice, Quantity15.mmDenominationChoice,
					QuantityAndAccount69.mmDenominationChoice, QuantityAndAccount70.mmDenominationChoice, QuantityAndAccount71.mmDenominationChoice, QuantityAndAccount72.mmDenominationChoice, QuantityAndAccount75.mmDenominationChoice,
					QuantityAndAccount76.mmDenominationChoice);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70a::DENC"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DenominationChoice";
			definition = "Denomination (stated value found on financial instruments) of the security to be received or delivered.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlement.class.getMethod("getDenominationChoice", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SettlementTransactionConditionCode settlementTransactionCondition;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition1Choice#mmCode
	 * SettlementTransactionCondition1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition1Choice#mmProprietary
	 * SettlementTransactionCondition1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition6Choice#mmCode
	 * SettlementTransactionCondition6Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition6Choice#mmProprietary
	 * SettlementTransactionCondition6Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition12Choice#mmCode
	 * SettlementTransactionCondition12Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition12Choice#mmProprietary
	 * SettlementTransactionCondition12Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails50#mmSettlementTransactionCondition
	 * SettlementDetails50.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition14Choice#mmCode
	 * SettlementTransactionCondition14Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition14Choice#mmProprietary
	 * SettlementTransactionCondition14Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails51#mmSettlementTransactionCondition
	 * SettlementDetails51.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails9#mmSettlementTransactionCondition
	 * SettlementDetails9.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition3Choice#mmCode
	 * SettlementTransactionCondition3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition3Choice#mmProprietary
	 * SettlementTransactionCondition3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails17#mmSettlementTransactionCondition
	 * SettlementDetails17.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition7Choice#mmCode
	 * SettlementTransactionCondition7Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition7Choice#mmProprietary
	 * SettlementTransactionCondition7Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails30#mmSettlementTransactionCondition
	 * SettlementDetails30.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition8Choice#mmCode
	 * SettlementTransactionCondition8Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition8Choice#mmProprietary
	 * SettlementTransactionCondition8Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails32#mmSettlementTransactionCondition
	 * SettlementDetails32.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails60#mmSettlementTransactionCondition
	 * SettlementDetails60.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails60#mmPartialSettlementIndicator
	 * SettlementDetails60.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails64#mmSettlementTransactionCondition
	 * SettlementDetails64.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails64#mmPartialSettlementIndicator
	 * SettlementDetails64.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails3#mmSettlementTransactionCondition
	 * SettlementDetails3.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails16#mmSettlementTransactionCondition
	 * SettlementDetails16.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails31#mmSettlementTransactionCondition
	 * SettlementDetails31.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails40#mmSettlementTransactionCondition
	 * SettlementDetails40.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails62#mmSettlementTransactionCondition
	 * SettlementDetails62.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails62#mmPartialSettlementIndicator
	 * SettlementDetails62.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails63#mmSettlementTransactionCondition
	 * SettlementDetails63.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails63#mmPartialSettlementIndicator
	 * SettlementDetails63.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails6#mmPartialSettlementIndicator
	 * RequestDetails6.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails7#mmPartialSettlementIndicator
	 * RequestDetails7.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails8#mmPartialSettlementIndicator
	 * RequestDetails8.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails9#mmPartialSettlementIndicator
	 * RequestDetails9.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails11#mmPartialSettlementIndicator
	 * RequestDetails11.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails12#mmPartialSettlementIndicator
	 * RequestDetails12.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails6#mmSettlementTransactionCondition
	 * SettlementDetails6.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails20#mmSettlementTransactionCondition
	 * SettlementDetails20.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails24#mmSettlementTransactionCondition
	 * SettlementDetails24.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails24#mmPartialSettlementIndicator
	 * SettlementDetails24.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition9Choice#mmCode
	 * SettlementTransactionCondition9Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition9Choice#mmProprietary
	 * SettlementTransactionCondition9Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails33#mmSettlementTransactionCondition
	 * SettlementDetails33.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails33#mmPartialSettlementIndicator
	 * SettlementDetails33.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails45#mmSettlementTransactionCondition
	 * SettlementDetails45.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails45#mmPartialSettlementIndicator
	 * SettlementDetails45.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails54#mmSettlementTransactionCondition
	 * SettlementDetails54.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails54#mmPartialSettlementIndicator
	 * SettlementDetails54.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails1#mmSettlementTransactionCondition
	 * SettlementDetails1.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails19#mmSettlementTransactionCondition
	 * SettlementDetails19.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails22#mmSettlementTransactionCondition
	 * SettlementDetails22.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails22#mmPartialSettlementIndicator
	 * SettlementDetails22.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails35#mmSettlementTransactionCondition
	 * SettlementDetails35.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails35#mmPartialSettlementIndicator
	 * SettlementDetails35.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#mmSettlementTransactionCondition
	 * SettlementDetails42.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#mmPartialSettlementIndicator
	 * SettlementDetails42.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails52#mmSettlementTransactionCondition
	 * SettlementDetails52.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails52#mmPartialSettlementIndicator
	 * SettlementDetails52.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails8#mmSettlementTransactionCondition
	 * SettlementDetails8.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails11#mmSettlementTransactionCondition
	 * SettlementDetails11.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails23#mmSettlementTransactionCondition
	 * SettlementDetails23.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails23#mmPartialSettlementIndicator
	 * SettlementDetails23.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails37#mmSettlementTransactionCondition
	 * SettlementDetails37.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails37#mmPartialSettlementIndicator
	 * SettlementDetails37.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails44#mmSettlementTransactionCondition
	 * SettlementDetails44.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails44#mmPartialSettlementIndicator
	 * SettlementDetails44.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails53#mmSettlementTransactionCondition
	 * SettlementDetails53.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails53#mmPartialSettlementIndicator
	 * SettlementDetails53.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails7#mmSettlementTransactionCondition
	 * SettlementDetails7.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails12#mmSettlementTransactionCondition
	 * SettlementDetails12.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails28#mmSettlementTransactionCondition
	 * SettlementDetails28.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails28#mmPartialSettlementIndicator
	 * SettlementDetails28.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails38#mmSettlementTransactionCondition
	 * SettlementDetails38.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails38#mmPartialSettlementIndicator
	 * SettlementDetails38.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails47#mmSettlementTransactionCondition
	 * SettlementDetails47.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails47#mmPartialSettlementIndicator
	 * SettlementDetails47.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails56#mmSettlementTransactionCondition
	 * SettlementDetails56.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails56#mmPartialSettlementIndicator
	 * SettlementDetails56.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails2#mmSettlementTransactionCondition
	 * SettlementDetails2.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails13#mmSettlementTransactionCondition
	 * SettlementDetails13.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails27#mmSettlementTransactionCondition
	 * SettlementDetails27.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails27#mmPartialSettlementIndicator
	 * SettlementDetails27.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails39#mmSettlementTransactionCondition
	 * SettlementDetails39.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails39#mmPartialSettlementIndicator
	 * SettlementDetails39.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails48#mmSettlementTransactionCondition
	 * SettlementDetails48.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails48#mmPartialSettlementIndicator
	 * SettlementDetails48.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails57#mmSettlementTransactionCondition
	 * SettlementDetails57.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails57#mmPartialSettlementIndicator
	 * SettlementDetails57.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition2Choice#mmCode
	 * SettlementTransactionCondition2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition2Choice#mmProprietary
	 * SettlementTransactionCondition2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition11Choice#mmCode
	 * SettlementTransactionCondition11Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition11Choice#mmProprietary
	 * SettlementTransactionCondition11Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#mmSettlementTransactionCondition
	 * SettlementDetails43.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails4#mmSettlementTransactionCondition
	 * SettlementDetails4.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails10#mmSettlementTransactionCondition
	 * SettlementDetails10.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails29#mmSettlementTransactionCondition
	 * SettlementDetails29.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails5#mmSettlementTransactionCondition
	 * SettlementDetails5.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition5Choice#mmCode
	 * SettlementTransactionCondition5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition5Choice#mmProprietary
	 * SettlementTransactionCondition5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails25#mmSettlementTransactionCondition
	 * SettlementDetails25.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails26#mmSettlementTransactionCondition
	 * SettlementDetails26.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails26#mmPartialSettlementIndicator
	 * SettlementDetails26.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails65#mmSettlementTransactionCondition
	 * SettlementDetails65.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails65#mmPartialSettlementIndicator
	 * SettlementDetails65.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails14#mmSettlementTransactionCondition
	 * SettlementDetails14.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails41#mmSettlementTransactionCondition
	 * SettlementDetails41.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails61#mmSettlementTransactionCondition
	 * SettlementDetails61.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails61#mmPartialSettlementIndicator
	 * SettlementDetails61.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails59#mmSettlementTransactionCondition
	 * SettlementDetails59.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails59#mmPartialSettlementIndicator
	 * SettlementDetails59.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition4Choice#mmCode
	 * SettlementTransactionCondition4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition4Choice#mmProprietary
	 * SettlementTransactionCondition4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails15#mmSettlementTransactionCondition
	 * SettlementDetails15.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition10Choice#mmCode
	 * SettlementTransactionCondition10Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition10Choice#mmProprietary
	 * SettlementTransactionCondition10Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails34#mmSettlementTransactionCondition
	 * SettlementDetails34.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails49#mmSettlementTransactionCondition
	 * SettlementDetails49.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails49#mmPartialSettlementIndicator
	 * SettlementDetails49.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails58#mmSettlementTransactionCondition
	 * SettlementDetails58.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails58#mmPartialSettlementIndicator
	 * SettlementDetails58.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails36#mmSettlementTransactionCondition
	 * SettlementDetails36.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails36#mmPartialSettlementIndicator
	 * SettlementDetails36.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails18#mmSettlementTransactionCondition
	 * SettlementDetails18.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails66#mmSettlementTransactionCondition
	 * SettlementDetails66.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails66#mmPartialSettlementIndicator
	 * SettlementDetails66.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria1#mmPartialSettlementIndicator
	 * SettlementInstructionQueryCriteria1.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#mmSettlementTransactionCondition
	 * SettlementDetails67.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#mmPartialSettlementIndicator
	 * SettlementDetails67.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails70#mmSettlementTransactionCondition
	 * SettlementDetails70.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails70#mmPartialSettlementIndicator
	 * SettlementDetails70.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#mmSettlementTransactionCondition
	 * SettlementDetails68.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails69#mmSettlementTransactionCondition
	 * SettlementDetails69.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails69#mmPartialSettlementIndicator
	 * SettlementDetails69.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails71#mmSettlementTransactionCondition
	 * SettlementDetails71.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails71#mmPartialSettlementIndicator
	 * SettlementDetails71.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails72#mmSettlementTransactionCondition
	 * SettlementDetails72.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails72#mmPartialSettlementIndicator
	 * SettlementDetails72.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails75#mmSettlementTransactionCondition
	 * SettlementDetails75.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails75#mmPartialSettlementIndicator
	 * SettlementDetails75.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails73#mmSettlementTransactionCondition
	 * SettlementDetails73.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails73#mmPartialSettlementIndicator
	 * SettlementDetails73.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails74#mmSettlementTransactionCondition
	 * SettlementDetails74.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails74#mmPartialSettlementIndicator
	 * SettlementDetails74.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails13#mmPartialSettlementIndicator
	 * RequestDetails13.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails81#mmSettlementTransactionCondition
	 * SettlementDetails81.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails81#mmPartialSettlementIndicator
	 * SettlementDetails81.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails76#mmSettlementTransactionCondition
	 * SettlementDetails76.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails76#mmPartialSettlementIndicator
	 * SettlementDetails76.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails80#mmSettlementTransactionCondition
	 * SettlementDetails80.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails80#mmPartialSettlementIndicator
	 * SettlementDetails80.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails78#mmSettlementTransactionCondition
	 * SettlementDetails78.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails78#mmPartialSettlementIndicator
	 * SettlementDetails78.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails77#mmSettlementTransactionCondition
	 * SettlementDetails77.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails77#mmPartialSettlementIndicator
	 * SettlementDetails77.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails14#mmPartialSettlementIndicator
	 * RequestDetails14.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails79#mmSettlementTransactionCondition
	 * SettlementDetails79.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails79#mmPartialSettlementIndicator
	 * SettlementDetails79.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails87#mmSettlementTransactionCondition
	 * SettlementDetails87.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails87#mmPartialSettlementIndicator
	 * SettlementDetails87.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails83#mmSettlementTransactionCondition
	 * SettlementDetails83.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails86#mmSettlementTransactionCondition
	 * SettlementDetails86.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails86#mmPartialSettlementIndicator
	 * SettlementDetails86.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails85#mmSettlementTransactionCondition
	 * SettlementDetails85.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails85#mmPartialSettlementIndicator
	 * SettlementDetails85.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#mmSettlementTransactionCondition
	 * SettlementDetails93.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#mmPartialSettlementIndicator
	 * SettlementDetails93.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails15#mmPartialSettlementIndicator
	 * RequestDetails15.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails90#mmSettlementTransactionCondition
	 * SettlementDetails90.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails90#mmPartialSettlementIndicator
	 * SettlementDetails90.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails96#mmSettlementTransactionCondition
	 * SettlementDetails96.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails96#mmPartialSettlementIndicator
	 * SettlementDetails96.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#mmSettlementTransactionCondition
	 * SettlementDetails97.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#mmPartialSettlementIndicator
	 * SettlementDetails97.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails99#mmSettlementTransactionCondition
	 * SettlementDetails99.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails99#mmPartialSettlementIndicator
	 * SettlementDetails99.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition16Choice#mmCode
	 * SettlementTransactionCondition16Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition16Choice#mmProprietary
	 * SettlementTransactionCondition16Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#mmSettlementTransactionCondition
	 * SettlementDetails94.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails100#mmSettlementTransactionCondition
	 * SettlementDetails100.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition19Choice#mmCode
	 * SettlementTransactionCondition19Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition19Choice#mmProprietary
	 * SettlementTransactionCondition19Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition18Choice#mmCode
	 * SettlementTransactionCondition18Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition18Choice#mmProprietary
	 * SettlementTransactionCondition18Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails95#mmSettlementTransactionCondition
	 * SettlementDetails95.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails95#mmPartialSettlementIndicator
	 * SettlementDetails95.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails91#mmSettlementTransactionCondition
	 * SettlementDetails91.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails91#mmPartialSettlementIndicator
	 * SettlementDetails91.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails92#mmSettlementTransactionCondition
	 * SettlementDetails92.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails92#mmPartialSettlementIndicator
	 * SettlementDetails92.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition17Choice#mmCode
	 * SettlementTransactionCondition17Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition17Choice#mmProprietary
	 * SettlementTransactionCondition17Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails98#mmSettlementTransactionCondition
	 * SettlementDetails98.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails98#mmPartialSettlementIndicator
	 * SettlementDetails98.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails101#mmSettlementTransactionCondition
	 * SettlementDetails101.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails101#mmPartialSettlementIndicator
	 * SettlementDetails101.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition20Choice#mmCode
	 * SettlementTransactionCondition20Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition20Choice#mmProprietary
	 * SettlementTransactionCondition20Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails105#mmSettlementTransactionCondition
	 * SettlementDetails105.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails105#mmPartialSettlementIndicator
	 * SettlementDetails105.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails106#mmSettlementTransactionCondition
	 * SettlementDetails106.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails106#mmPartialSettlementIndicator
	 * SettlementDetails106.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails104#mmSettlementTransactionCondition
	 * SettlementDetails104.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails104#mmPartialSettlementIndicator
	 * SettlementDetails104.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails111#mmSettlementTransactionCondition
	 * SettlementDetails111.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails111#mmPartialSettlementIndicator
	 * SettlementDetails111.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails16#mmPartialSettlementIndicator
	 * RequestDetails16.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails112#mmSettlementTransactionCondition
	 * SettlementDetails112.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails112#mmPartialSettlementIndicator
	 * SettlementDetails112.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails110#mmSettlementTransactionCondition
	 * SettlementDetails110.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails110#mmPartialSettlementIndicator
	 * SettlementDetails110.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails108#mmSettlementTransactionCondition
	 * SettlementDetails108.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails108#mmPartialSettlementIndicator
	 * SettlementDetails108.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails103#mmSettlementTransactionCondition
	 * SettlementDetails103.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails107#mmSettlementTransactionCondition
	 * SettlementDetails107.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails107#mmPartialSettlementIndicator
	 * SettlementDetails107.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition26Choice#mmCode
	 * SettlementTransactionCondition26Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition26Choice#mmProprietary
	 * SettlementTransactionCondition26Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails115#mmSettlementTransactionCondition
	 * SettlementDetails115.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails115#mmPartialSettlementIndicator
	 * SettlementDetails115.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition21Choice#mmCode
	 * SettlementTransactionCondition21Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition21Choice#mmProprietary
	 * SettlementTransactionCondition21Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition28Choice#mmCode
	 * SettlementTransactionCondition28Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition28Choice#mmProprietary
	 * SettlementTransactionCondition28Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails117#mmSettlementTransactionCondition
	 * SettlementDetails117.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails117#mmPartialSettlementIndicator
	 * SettlementDetails117.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails116#mmSettlementTransactionCondition
	 * SettlementDetails116.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails116#mmPartialSettlementIndicator
	 * SettlementDetails116.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition22Choice#mmCode
	 * SettlementTransactionCondition22Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition22Choice#mmProprietary
	 * SettlementTransactionCondition22Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails113#mmSettlementTransactionCondition
	 * SettlementDetails113.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition29Choice#mmCode
	 * SettlementTransactionCondition29Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition29Choice#mmProprietary
	 * SettlementTransactionCondition29Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails18#mmPartialSettlementIndicator
	 * RequestDetails18.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2#mmPartialSettlementIndicator
	 * SettlementInstructionQueryCriteria2.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters11#mmSettlementTransactionCondition
	 * FundSettlementParameters11.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters12#mmSettlementTransactionCondition
	 * FundSettlementParameters12.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition30Choice#mmCode
	 * SettlementTransactionCondition30Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition30Choice#mmProprietary
	 * SettlementTransactionCondition30Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradeTransactionCondition8Choice#mmCode
	 * TradeTransactionCondition8Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradeTransactionCondition8Choice#mmProprietary
	 * TradeTransactionCondition8Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails128#mmSettlementTransactionCondition
	 * SettlementDetails128.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails128#mmPartialSettlementIndicator
	 * SettlementDetails128.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#mmSettlementTransactionCondition
	 * SettlementDetails120.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#mmPartialSettlementIndicator
	 * SettlementDetails120.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#mmSettlementTransactionCondition
	 * SettlementDetails119.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#mmPartialSettlementIndicator
	 * SettlementDetails119.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails125#mmSettlementTransactionCondition
	 * SettlementDetails125.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails125#mmPartialSettlementIndicator
	 * SettlementDetails125.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails126#mmSettlementTransactionCondition
	 * SettlementDetails126.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails126#mmPartialSettlementIndicator
	 * SettlementDetails126.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#mmSettlementTransactionCondition
	 * SettlementDetails122.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails127#mmSettlementTransactionCondition
	 * SettlementDetails127.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails127#mmPartialSettlementIndicator
	 * SettlementDetails127.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails121#mmSettlementTransactionCondition
	 * SettlementDetails121.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails121#mmPartialSettlementIndicator
	 * SettlementDetails121.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails134#mmSettlementTransactionCondition
	 * SettlementDetails134.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails134#mmPartialSettlementIndicator
	 * SettlementDetails134.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails137#mmSettlementTransactionCondition
	 * SettlementDetails137.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails137#mmPartialSettlementIndicator
	 * SettlementDetails137.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails132#mmSettlementTransactionCondition
	 * SettlementDetails132.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails132#mmPartialSettlementIndicator
	 * SettlementDetails132.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails138#mmSettlementTransactionCondition
	 * SettlementDetails138.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails130#mmSettlementTransactionCondition
	 * SettlementDetails130.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails130#mmPartialSettlementIndicator
	 * SettlementDetails130.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails131#mmSettlementTransactionCondition
	 * SettlementDetails131.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails131#mmPartialSettlementIndicator
	 * SettlementDetails131.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails133#mmSettlementTransactionCondition
	 * SettlementDetails133.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails133#mmPartialSettlementIndicator
	 * SettlementDetails133.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails139#mmSettlementTransactionCondition
	 * SettlementDetails139.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails139#mmPartialSettlementIndicator
	 * SettlementDetails139.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails140#mmSettlementTransactionCondition
	 * SettlementDetails140.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails140#mmPartialSettlementIndicator
	 * SettlementDetails140.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails147#mmSettlementTransactionCondition
	 * SettlementDetails147.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails147#mmPartialSettlementIndicator
	 * SettlementDetails147.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails142#mmSettlementTransactionCondition
	 * SettlementDetails142.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails142#mmPartialSettlementIndicator
	 * SettlementDetails142.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails144#mmSettlementTransactionCondition
	 * SettlementDetails144.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails144#mmPartialSettlementIndicator
	 * SettlementDetails144.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails148#mmSettlementTransactionCondition
	 * SettlementDetails148.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails148#mmPartialSettlementIndicator
	 * SettlementDetails148.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails141#mmSettlementTransactionCondition
	 * SettlementDetails141.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails141#mmPartialSettlementIndicator
	 * SettlementDetails141.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails145#mmSettlementTransactionCondition
	 * SettlementDetails145.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails145#mmPartialSettlementIndicator
	 * SettlementDetails145.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails146#mmSettlementTransactionCondition
	 * SettlementDetails146.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails143#mmSettlementTransactionCondition
	 * SettlementDetails143.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails143#mmPartialSettlementIndicator
	 * SettlementDetails143.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails149#mmSettlementTransactionCondition
	 * SettlementDetails149.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails149#mmPartialSettlementIndicator
	 * SettlementDetails149.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails150#mmSettlementTransactionCondition
	 * SettlementDetails150.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails150#mmPartialSettlementIndicator
	 * SettlementDetails150.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails151#mmSettlementTransactionCondition
	 * SettlementDetails151.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails151#mmPartialSettlementIndicator
	 * SettlementDetails151.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails152#mmSettlementTransactionCondition
	 * SettlementDetails152.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails152#mmPartialSettlementIndicator
	 * SettlementDetails152.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails153#mmSettlementTransactionCondition
	 * SettlementDetails153.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails153#mmPartialSettlementIndicator
	 * SettlementDetails153.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails155#mmSettlementTransactionCondition
	 * SettlementDetails155.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails155#mmPartialSettlementIndicator
	 * SettlementDetails155.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails156#mmSettlementTransactionCondition
	 * SettlementDetails156.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails156#mmPartialSettlementIndicator
	 * SettlementDetails156.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails157#mmSettlementTransactionCondition
	 * SettlementDetails157.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails157#mmPartialSettlementIndicator
	 * SettlementDetails157.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails158#mmSettlementTransactionCondition
	 * SettlementDetails158.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails160#mmSettlementTransactionCondition
	 * SettlementDetails160.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails160#mmPartialSettlementIndicator
	 * SettlementDetails160.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails161#mmSettlementTransactionCondition
	 * SettlementDetails161.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails161#mmPartialSettlementIndicator
	 * SettlementDetails161.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails162#mmSettlementTransactionCondition
	 * SettlementDetails162.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails162#mmPartialSettlementIndicator
	 * SettlementDetails162.mmPartialSettlementIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::STCO</li>
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
	public static final MMBusinessAttribute mmSettlementTransactionCondition = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementTransactionCondition1Choice.mmCode, SettlementTransactionCondition1Choice.mmProprietary, SettlementTransactionCondition6Choice.mmCode,
					SettlementTransactionCondition6Choice.mmProprietary, SettlementTransactionCondition12Choice.mmCode, SettlementTransactionCondition12Choice.mmProprietary, SettlementDetails50.mmSettlementTransactionCondition,
					SettlementTransactionCondition14Choice.mmCode, SettlementTransactionCondition14Choice.mmProprietary, SettlementDetails51.mmSettlementTransactionCondition, SettlementDetails9.mmSettlementTransactionCondition,
					SettlementTransactionCondition3Choice.mmCode, SettlementTransactionCondition3Choice.mmProprietary, SettlementDetails17.mmSettlementTransactionCondition, SettlementTransactionCondition7Choice.mmCode,
					SettlementTransactionCondition7Choice.mmProprietary, SettlementDetails30.mmSettlementTransactionCondition, SettlementTransactionCondition8Choice.mmCode, SettlementTransactionCondition8Choice.mmProprietary,
					SettlementDetails32.mmSettlementTransactionCondition, SettlementDetails60.mmSettlementTransactionCondition, SettlementDetails60.mmPartialSettlementIndicator, SettlementDetails64.mmSettlementTransactionCondition,
					SettlementDetails64.mmPartialSettlementIndicator, SettlementDetails3.mmSettlementTransactionCondition, SettlementDetails16.mmSettlementTransactionCondition, SettlementDetails31.mmSettlementTransactionCondition,
					SettlementDetails40.mmSettlementTransactionCondition, SettlementDetails62.mmSettlementTransactionCondition, SettlementDetails62.mmPartialSettlementIndicator, SettlementDetails63.mmSettlementTransactionCondition,
					SettlementDetails63.mmPartialSettlementIndicator, RequestDetails6.mmPartialSettlementIndicator, RequestDetails7.mmPartialSettlementIndicator, RequestDetails8.mmPartialSettlementIndicator,
					RequestDetails9.mmPartialSettlementIndicator, RequestDetails11.mmPartialSettlementIndicator, RequestDetails12.mmPartialSettlementIndicator, SettlementDetails6.mmSettlementTransactionCondition,
					SettlementDetails20.mmSettlementTransactionCondition, SettlementDetails24.mmSettlementTransactionCondition, SettlementDetails24.mmPartialSettlementIndicator, SettlementTransactionCondition9Choice.mmCode,
					SettlementTransactionCondition9Choice.mmProprietary, SettlementDetails33.mmSettlementTransactionCondition, SettlementDetails33.mmPartialSettlementIndicator, SettlementDetails45.mmSettlementTransactionCondition,
					SettlementDetails45.mmPartialSettlementIndicator, SettlementDetails54.mmSettlementTransactionCondition, SettlementDetails54.mmPartialSettlementIndicator, SettlementDetails1.mmSettlementTransactionCondition,
					SettlementDetails19.mmSettlementTransactionCondition, SettlementDetails22.mmSettlementTransactionCondition, SettlementDetails22.mmPartialSettlementIndicator, SettlementDetails35.mmSettlementTransactionCondition,
					SettlementDetails35.mmPartialSettlementIndicator, SettlementDetails42.mmSettlementTransactionCondition, SettlementDetails42.mmPartialSettlementIndicator, SettlementDetails52.mmSettlementTransactionCondition,
					SettlementDetails52.mmPartialSettlementIndicator, SettlementDetails8.mmSettlementTransactionCondition, SettlementDetails11.mmSettlementTransactionCondition, SettlementDetails23.mmSettlementTransactionCondition,
					SettlementDetails23.mmPartialSettlementIndicator, SettlementDetails37.mmSettlementTransactionCondition, SettlementDetails37.mmPartialSettlementIndicator, SettlementDetails44.mmSettlementTransactionCondition,
					SettlementDetails44.mmPartialSettlementIndicator, SettlementDetails53.mmSettlementTransactionCondition, SettlementDetails53.mmPartialSettlementIndicator, SettlementDetails7.mmSettlementTransactionCondition,
					SettlementDetails12.mmSettlementTransactionCondition, SettlementDetails28.mmSettlementTransactionCondition, SettlementDetails28.mmPartialSettlementIndicator, SettlementDetails38.mmSettlementTransactionCondition,
					SettlementDetails38.mmPartialSettlementIndicator, SettlementDetails47.mmSettlementTransactionCondition, SettlementDetails47.mmPartialSettlementIndicator, SettlementDetails56.mmSettlementTransactionCondition,
					SettlementDetails56.mmPartialSettlementIndicator, SettlementDetails2.mmSettlementTransactionCondition, SettlementDetails13.mmSettlementTransactionCondition, SettlementDetails27.mmSettlementTransactionCondition,
					SettlementDetails27.mmPartialSettlementIndicator, SettlementDetails39.mmSettlementTransactionCondition, SettlementDetails39.mmPartialSettlementIndicator, SettlementDetails48.mmSettlementTransactionCondition,
					SettlementDetails48.mmPartialSettlementIndicator, SettlementDetails57.mmSettlementTransactionCondition, SettlementDetails57.mmPartialSettlementIndicator, SettlementTransactionCondition2Choice.mmCode,
					SettlementTransactionCondition2Choice.mmProprietary, SettlementTransactionCondition11Choice.mmCode, SettlementTransactionCondition11Choice.mmProprietary, SettlementDetails43.mmSettlementTransactionCondition,
					SettlementDetails4.mmSettlementTransactionCondition, SettlementDetails10.mmSettlementTransactionCondition, SettlementDetails29.mmSettlementTransactionCondition, SettlementDetails5.mmSettlementTransactionCondition,
					SettlementTransactionCondition5Choice.mmCode, SettlementTransactionCondition5Choice.mmProprietary, SettlementDetails25.mmSettlementTransactionCondition, SettlementDetails26.mmSettlementTransactionCondition,
					SettlementDetails26.mmPartialSettlementIndicator, SettlementDetails65.mmSettlementTransactionCondition, SettlementDetails65.mmPartialSettlementIndicator, SettlementDetails14.mmSettlementTransactionCondition,
					SettlementDetails41.mmSettlementTransactionCondition, SettlementDetails61.mmSettlementTransactionCondition, SettlementDetails61.mmPartialSettlementIndicator, SettlementDetails59.mmSettlementTransactionCondition,
					SettlementDetails59.mmPartialSettlementIndicator, SettlementTransactionCondition4Choice.mmCode, SettlementTransactionCondition4Choice.mmProprietary, SettlementDetails15.mmSettlementTransactionCondition,
					SettlementTransactionCondition10Choice.mmCode, SettlementTransactionCondition10Choice.mmProprietary, SettlementDetails34.mmSettlementTransactionCondition, SettlementDetails49.mmSettlementTransactionCondition,
					SettlementDetails49.mmPartialSettlementIndicator, SettlementDetails58.mmSettlementTransactionCondition, SettlementDetails58.mmPartialSettlementIndicator, SettlementDetails36.mmSettlementTransactionCondition,
					SettlementDetails36.mmPartialSettlementIndicator, SettlementDetails18.mmSettlementTransactionCondition, SettlementDetails66.mmSettlementTransactionCondition, SettlementDetails66.mmPartialSettlementIndicator,
					SettlementInstructionQueryCriteria1.mmPartialSettlementIndicator, SettlementDetails67.mmSettlementTransactionCondition, SettlementDetails67.mmPartialSettlementIndicator,
					SettlementDetails70.mmSettlementTransactionCondition, SettlementDetails70.mmPartialSettlementIndicator, SettlementDetails68.mmSettlementTransactionCondition, SettlementDetails69.mmSettlementTransactionCondition,
					SettlementDetails69.mmPartialSettlementIndicator, SettlementDetails71.mmSettlementTransactionCondition, SettlementDetails71.mmPartialSettlementIndicator, SettlementDetails72.mmSettlementTransactionCondition,
					SettlementDetails72.mmPartialSettlementIndicator, SettlementDetails75.mmSettlementTransactionCondition, SettlementDetails75.mmPartialSettlementIndicator, SettlementDetails73.mmSettlementTransactionCondition,
					SettlementDetails73.mmPartialSettlementIndicator, SettlementDetails74.mmSettlementTransactionCondition, SettlementDetails74.mmPartialSettlementIndicator, RequestDetails13.mmPartialSettlementIndicator,
					SettlementDetails81.mmSettlementTransactionCondition, SettlementDetails81.mmPartialSettlementIndicator, SettlementDetails76.mmSettlementTransactionCondition, SettlementDetails76.mmPartialSettlementIndicator,
					SettlementDetails80.mmSettlementTransactionCondition, SettlementDetails80.mmPartialSettlementIndicator, SettlementDetails78.mmSettlementTransactionCondition, SettlementDetails78.mmPartialSettlementIndicator,
					SettlementDetails77.mmSettlementTransactionCondition, SettlementDetails77.mmPartialSettlementIndicator, RequestDetails14.mmPartialSettlementIndicator, SettlementDetails79.mmSettlementTransactionCondition,
					SettlementDetails79.mmPartialSettlementIndicator, SettlementDetails87.mmSettlementTransactionCondition, SettlementDetails87.mmPartialSettlementIndicator, SettlementDetails83.mmSettlementTransactionCondition,
					SettlementDetails86.mmSettlementTransactionCondition, SettlementDetails86.mmPartialSettlementIndicator, SettlementDetails85.mmSettlementTransactionCondition, SettlementDetails85.mmPartialSettlementIndicator,
					SettlementDetails93.mmSettlementTransactionCondition, SettlementDetails93.mmPartialSettlementIndicator, RequestDetails15.mmPartialSettlementIndicator, SettlementDetails90.mmSettlementTransactionCondition,
					SettlementDetails90.mmPartialSettlementIndicator, SettlementDetails96.mmSettlementTransactionCondition, SettlementDetails96.mmPartialSettlementIndicator, SettlementDetails97.mmSettlementTransactionCondition,
					SettlementDetails97.mmPartialSettlementIndicator, SettlementDetails99.mmSettlementTransactionCondition, SettlementDetails99.mmPartialSettlementIndicator, SettlementTransactionCondition16Choice.mmCode,
					SettlementTransactionCondition16Choice.mmProprietary, SettlementDetails94.mmSettlementTransactionCondition, SettlementDetails100.mmSettlementTransactionCondition, SettlementTransactionCondition19Choice.mmCode,
					SettlementTransactionCondition19Choice.mmProprietary, SettlementTransactionCondition18Choice.mmCode, SettlementTransactionCondition18Choice.mmProprietary, SettlementDetails95.mmSettlementTransactionCondition,
					SettlementDetails95.mmPartialSettlementIndicator, SettlementDetails91.mmSettlementTransactionCondition, SettlementDetails91.mmPartialSettlementIndicator, SettlementDetails92.mmSettlementTransactionCondition,
					SettlementDetails92.mmPartialSettlementIndicator, SettlementTransactionCondition17Choice.mmCode, SettlementTransactionCondition17Choice.mmProprietary, SettlementDetails98.mmSettlementTransactionCondition,
					SettlementDetails98.mmPartialSettlementIndicator, SettlementDetails101.mmSettlementTransactionCondition, SettlementDetails101.mmPartialSettlementIndicator, SettlementTransactionCondition20Choice.mmCode,
					SettlementTransactionCondition20Choice.mmProprietary, SettlementDetails105.mmSettlementTransactionCondition, SettlementDetails105.mmPartialSettlementIndicator, SettlementDetails106.mmSettlementTransactionCondition,
					SettlementDetails106.mmPartialSettlementIndicator, SettlementDetails104.mmSettlementTransactionCondition, SettlementDetails104.mmPartialSettlementIndicator, SettlementDetails111.mmSettlementTransactionCondition,
					SettlementDetails111.mmPartialSettlementIndicator, RequestDetails16.mmPartialSettlementIndicator, SettlementDetails112.mmSettlementTransactionCondition, SettlementDetails112.mmPartialSettlementIndicator,
					SettlementDetails110.mmSettlementTransactionCondition, SettlementDetails110.mmPartialSettlementIndicator, SettlementDetails108.mmSettlementTransactionCondition, SettlementDetails108.mmPartialSettlementIndicator,
					SettlementDetails103.mmSettlementTransactionCondition, SettlementDetails107.mmSettlementTransactionCondition, SettlementDetails107.mmPartialSettlementIndicator, SettlementTransactionCondition26Choice.mmCode,
					SettlementTransactionCondition26Choice.mmProprietary, SettlementDetails115.mmSettlementTransactionCondition, SettlementDetails115.mmPartialSettlementIndicator, SettlementTransactionCondition21Choice.mmCode,
					SettlementTransactionCondition21Choice.mmProprietary, SettlementTransactionCondition28Choice.mmCode, SettlementTransactionCondition28Choice.mmProprietary, SettlementDetails117.mmSettlementTransactionCondition,
					SettlementDetails117.mmPartialSettlementIndicator, SettlementDetails116.mmSettlementTransactionCondition, SettlementDetails116.mmPartialSettlementIndicator, SettlementTransactionCondition22Choice.mmCode,
					SettlementTransactionCondition22Choice.mmProprietary, SettlementDetails113.mmSettlementTransactionCondition, SettlementTransactionCondition29Choice.mmCode, SettlementTransactionCondition29Choice.mmProprietary,
					RequestDetails18.mmPartialSettlementIndicator, SettlementInstructionQueryCriteria2.mmPartialSettlementIndicator, FundSettlementParameters11.mmSettlementTransactionCondition,
					FundSettlementParameters12.mmSettlementTransactionCondition, SettlementTransactionCondition30Choice.mmCode, SettlementTransactionCondition30Choice.mmProprietary, TradeTransactionCondition8Choice.mmCode,
					TradeTransactionCondition8Choice.mmProprietary, SettlementDetails128.mmSettlementTransactionCondition, SettlementDetails128.mmPartialSettlementIndicator, SettlementDetails120.mmSettlementTransactionCondition,
					SettlementDetails120.mmPartialSettlementIndicator, SettlementDetails119.mmSettlementTransactionCondition, SettlementDetails119.mmPartialSettlementIndicator, SettlementDetails125.mmSettlementTransactionCondition,
					SettlementDetails125.mmPartialSettlementIndicator, SettlementDetails126.mmSettlementTransactionCondition, SettlementDetails126.mmPartialSettlementIndicator, SettlementDetails122.mmSettlementTransactionCondition,
					SettlementDetails127.mmSettlementTransactionCondition, SettlementDetails127.mmPartialSettlementIndicator, SettlementDetails121.mmSettlementTransactionCondition, SettlementDetails121.mmPartialSettlementIndicator,
					SettlementDetails134.mmSettlementTransactionCondition, SettlementDetails134.mmPartialSettlementIndicator, SettlementDetails137.mmSettlementTransactionCondition, SettlementDetails137.mmPartialSettlementIndicator,
					SettlementDetails132.mmSettlementTransactionCondition, SettlementDetails132.mmPartialSettlementIndicator, SettlementDetails138.mmSettlementTransactionCondition, SettlementDetails130.mmSettlementTransactionCondition,
					SettlementDetails130.mmPartialSettlementIndicator, SettlementDetails131.mmSettlementTransactionCondition, SettlementDetails131.mmPartialSettlementIndicator, SettlementDetails133.mmSettlementTransactionCondition,
					SettlementDetails133.mmPartialSettlementIndicator, SettlementDetails139.mmSettlementTransactionCondition, SettlementDetails139.mmPartialSettlementIndicator, SettlementDetails140.mmSettlementTransactionCondition,
					SettlementDetails140.mmPartialSettlementIndicator, SettlementDetails147.mmSettlementTransactionCondition, SettlementDetails147.mmPartialSettlementIndicator, SettlementDetails142.mmSettlementTransactionCondition,
					SettlementDetails142.mmPartialSettlementIndicator, SettlementDetails144.mmSettlementTransactionCondition, SettlementDetails144.mmPartialSettlementIndicator, SettlementDetails148.mmSettlementTransactionCondition,
					SettlementDetails148.mmPartialSettlementIndicator, SettlementDetails141.mmSettlementTransactionCondition, SettlementDetails141.mmPartialSettlementIndicator, SettlementDetails145.mmSettlementTransactionCondition,
					SettlementDetails145.mmPartialSettlementIndicator, SettlementDetails146.mmSettlementTransactionCondition, SettlementDetails143.mmSettlementTransactionCondition, SettlementDetails143.mmPartialSettlementIndicator,
					SettlementDetails149.mmSettlementTransactionCondition, SettlementDetails149.mmPartialSettlementIndicator, SettlementDetails150.mmSettlementTransactionCondition, SettlementDetails150.mmPartialSettlementIndicator,
					SettlementDetails151.mmSettlementTransactionCondition, SettlementDetails151.mmPartialSettlementIndicator, SettlementDetails152.mmSettlementTransactionCondition, SettlementDetails152.mmPartialSettlementIndicator,
					SettlementDetails153.mmSettlementTransactionCondition, SettlementDetails153.mmPartialSettlementIndicator, SettlementDetails155.mmSettlementTransactionCondition, SettlementDetails155.mmPartialSettlementIndicator,
					SettlementDetails156.mmSettlementTransactionCondition, SettlementDetails156.mmPartialSettlementIndicator, SettlementDetails157.mmSettlementTransactionCondition, SettlementDetails157.mmPartialSettlementIndicator,
					SettlementDetails158.mmSettlementTransactionCondition, SettlementDetails160.mmSettlementTransactionCondition, SettlementDetails160.mmPartialSettlementIndicator, SettlementDetails161.mmSettlementTransactionCondition,
					SettlementDetails161.mmPartialSettlementIndicator, SettlementDetails162.mmSettlementTransactionCondition, SettlementDetails162.mmPartialSettlementIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::STCO"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementTransactionCondition";
			definition = "Conditions under which the order/trade is to be settled.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SettlementTransactionConditionCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlement.class.getMethod("getSettlementTransactionCondition", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator beneficialOwnershipIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.choice.BeneficialOwnership1Choice#mmIndicator
	 * BeneficialOwnership1Choice.mmIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficialOwnership1Choice#mmProprietary
	 * BeneficialOwnership1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails50#mmBeneficialOwnership
	 * SettlementDetails50.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficialOwnership2Choice#mmIndicator
	 * BeneficialOwnership2Choice.mmIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficialOwnership2Choice#mmProprietary
	 * BeneficialOwnership2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails51#mmBeneficialOwnership
	 * SettlementDetails51.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails9#mmBeneficialOwnership
	 * SettlementDetails9.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails17#mmBeneficialOwnership
	 * SettlementDetails17.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails30#mmBeneficialOwnership
	 * SettlementDetails30.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails32#mmBeneficialOwnership
	 * SettlementDetails32.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails60#mmBeneficialOwnership
	 * SettlementDetails60.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails64#mmBeneficialOwnership
	 * SettlementDetails64.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails3#mmBeneficialOwnership
	 * SettlementDetails3.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails16#mmBeneficialOwnership
	 * SettlementDetails16.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails31#mmBeneficialOwnership
	 * SettlementDetails31.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails40#mmBeneficialOwnership
	 * SettlementDetails40.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails62#mmBeneficialOwnership
	 * SettlementDetails62.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails63#mmBeneficialOwnership
	 * SettlementDetails63.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails6#mmBeneficialOwnership
	 * SettlementDetails6.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails20#mmBeneficialOwnership
	 * SettlementDetails20.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails24#mmBeneficialOwnership
	 * SettlementDetails24.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails33#mmBeneficialOwnership
	 * SettlementDetails33.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails45#mmBeneficialOwnership
	 * SettlementDetails45.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails54#mmBeneficialOwnership
	 * SettlementDetails54.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails1#mmBeneficialOwnership
	 * SettlementDetails1.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails19#mmBeneficialOwnership
	 * SettlementDetails19.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails22#mmBeneficialOwnership
	 * SettlementDetails22.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails35#mmBeneficialOwnership
	 * SettlementDetails35.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#mmBeneficialOwnership
	 * SettlementDetails42.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails52#mmBeneficialOwnership
	 * SettlementDetails52.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails8#mmBeneficialOwnership
	 * SettlementDetails8.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails11#mmBeneficialOwnership
	 * SettlementDetails11.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails23#mmBeneficialOwnership
	 * SettlementDetails23.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails37#mmBeneficialOwnership
	 * SettlementDetails37.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails44#mmBeneficialOwnership
	 * SettlementDetails44.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails53#mmBeneficialOwnership
	 * SettlementDetails53.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails7#mmBeneficialOwnership
	 * SettlementDetails7.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails12#mmBeneficialOwnership
	 * SettlementDetails12.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails28#mmBeneficialOwnership
	 * SettlementDetails28.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails38#mmBeneficialOwnership
	 * SettlementDetails38.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails47#mmBeneficialOwnership
	 * SettlementDetails47.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails56#mmBeneficialOwnership
	 * SettlementDetails56.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails2#mmBeneficialOwnership
	 * SettlementDetails2.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails13#mmBeneficialOwnership
	 * SettlementDetails13.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails27#mmBeneficialOwnership
	 * SettlementDetails27.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails39#mmBeneficialOwnership
	 * SettlementDetails39.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails48#mmBeneficialOwnership
	 * SettlementDetails48.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails57#mmBeneficialOwnership
	 * SettlementDetails57.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficialOwnership3Choice#mmIndicator
	 * BeneficialOwnership3Choice.mmIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficialOwnership3Choice#mmProprietary
	 * BeneficialOwnership3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#mmBeneficialOwnership
	 * SettlementDetails43.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails10#mmBeneficialOwnership
	 * SettlementDetails10.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails29#mmBeneficialOwnership
	 * SettlementDetails29.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails5#mmBeneficialOwnership
	 * SettlementDetails5.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails25#mmBeneficialOwnership
	 * SettlementDetails25.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails26#mmBeneficialOwnership
	 * SettlementDetails26.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails65#mmBeneficialOwnership
	 * SettlementDetails65.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails14#mmBeneficialOwnership
	 * SettlementDetails14.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails41#mmBeneficialOwnership
	 * SettlementDetails41.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails61#mmBeneficialOwnership
	 * SettlementDetails61.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails59#mmBeneficialOwnership
	 * SettlementDetails59.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails15#mmBeneficialOwnership
	 * SettlementDetails15.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails34#mmBeneficialOwnership
	 * SettlementDetails34.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails49#mmBeneficialOwnership
	 * SettlementDetails49.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails58#mmBeneficialOwnership
	 * SettlementDetails58.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails36#mmBeneficialOwnership
	 * SettlementDetails36.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#mmBeneficialOwnership
	 * SettlementDetails67.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails70#mmBeneficialOwnership
	 * SettlementDetails70.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#mmBeneficialOwnership
	 * SettlementDetails68.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails69#mmBeneficialOwnership
	 * SettlementDetails69.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails71#mmBeneficialOwnership
	 * SettlementDetails71.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails72#mmBeneficialOwnership
	 * SettlementDetails72.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails75#mmBeneficialOwnership
	 * SettlementDetails75.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails73#mmBeneficialOwnership
	 * SettlementDetails73.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails74#mmBeneficialOwnership
	 * SettlementDetails74.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails81#mmBeneficialOwnership
	 * SettlementDetails81.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails76#mmBeneficialOwnership
	 * SettlementDetails76.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails80#mmBeneficialOwnership
	 * SettlementDetails80.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails78#mmBeneficialOwnership
	 * SettlementDetails78.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails77#mmBeneficialOwnership
	 * SettlementDetails77.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails79#mmBeneficialOwnership
	 * SettlementDetails79.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails87#mmBeneficialOwnership
	 * SettlementDetails87.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails83#mmBeneficialOwnership
	 * SettlementDetails83.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails86#mmBeneficialOwnership
	 * SettlementDetails86.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails85#mmBeneficialOwnership
	 * SettlementDetails85.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#mmBeneficialOwnership
	 * SettlementDetails93.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails90#mmBeneficialOwnership
	 * SettlementDetails90.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails96#mmBeneficialOwnership
	 * SettlementDetails96.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#mmBeneficialOwnership
	 * SettlementDetails97.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails99#mmBeneficialOwnership
	 * SettlementDetails99.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#mmBeneficialOwnership
	 * SettlementDetails94.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficialOwnership4Choice#mmIndicator
	 * BeneficialOwnership4Choice.mmIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficialOwnership4Choice#mmProprietary
	 * BeneficialOwnership4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails95#mmBeneficialOwnership
	 * SettlementDetails95.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails91#mmBeneficialOwnership
	 * SettlementDetails91.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails92#mmBeneficialOwnership
	 * SettlementDetails92.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails98#mmBeneficialOwnership
	 * SettlementDetails98.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails101#mmBeneficialOwnership
	 * SettlementDetails101.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails105#mmBeneficialOwnership
	 * SettlementDetails105.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails106#mmBeneficialOwnership
	 * SettlementDetails106.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails104#mmBeneficialOwnership
	 * SettlementDetails104.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails111#mmBeneficialOwnership
	 * SettlementDetails111.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails112#mmBeneficialOwnership
	 * SettlementDetails112.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails110#mmBeneficialOwnership
	 * SettlementDetails110.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails108#mmBeneficialOwnership
	 * SettlementDetails108.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails107#mmBeneficialOwnership
	 * SettlementDetails107.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficialOwnership5Choice#mmIndicator
	 * BeneficialOwnership5Choice.mmIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficialOwnership5Choice#mmProprietary
	 * BeneficialOwnership5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails115#mmBeneficialOwnership
	 * SettlementDetails115.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails117#mmBeneficialOwnership
	 * SettlementDetails117.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails116#mmBeneficialOwnership
	 * SettlementDetails116.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails113#mmBeneficialOwnership
	 * SettlementDetails113.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails128#mmBeneficialOwnership
	 * SettlementDetails128.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#mmBeneficialOwnership
	 * SettlementDetails120.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#mmBeneficialOwnership
	 * SettlementDetails119.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails125#mmBeneficialOwnership
	 * SettlementDetails125.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails126#mmBeneficialOwnership
	 * SettlementDetails126.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#mmBeneficialOwnership
	 * SettlementDetails122.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails127#mmBeneficialOwnership
	 * SettlementDetails127.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails121#mmBeneficialOwnership
	 * SettlementDetails121.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails134#mmBeneficialOwnership
	 * SettlementDetails134.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails137#mmBeneficialOwnership
	 * SettlementDetails137.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails132#mmBeneficialOwnership
	 * SettlementDetails132.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails138#mmBeneficialOwnership
	 * SettlementDetails138.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails130#mmBeneficialOwnership
	 * SettlementDetails130.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails131#mmBeneficialOwnership
	 * SettlementDetails131.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails133#mmBeneficialOwnership
	 * SettlementDetails133.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails139#mmBeneficialOwnership
	 * SettlementDetails139.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails140#mmBeneficialOwnership
	 * SettlementDetails140.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails147#mmBeneficialOwnership
	 * SettlementDetails147.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails142#mmBeneficialOwnership
	 * SettlementDetails142.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails144#mmBeneficialOwnership
	 * SettlementDetails144.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails148#mmBeneficialOwnership
	 * SettlementDetails148.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails141#mmBeneficialOwnership
	 * SettlementDetails141.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails145#mmBeneficialOwnership
	 * SettlementDetails145.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails146#mmBeneficialOwnership
	 * SettlementDetails146.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails143#mmBeneficialOwnership
	 * SettlementDetails143.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails149#mmBeneficialOwnership
	 * SettlementDetails149.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails150#mmBeneficialOwnership
	 * SettlementDetails150.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails151#mmBeneficialOwnership
	 * SettlementDetails151.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails152#mmBeneficialOwnership
	 * SettlementDetails152.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails153#mmBeneficialOwnership
	 * SettlementDetails153.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails155#mmBeneficialOwnership
	 * SettlementDetails155.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails156#mmBeneficialOwnership
	 * SettlementDetails156.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails157#mmBeneficialOwnership
	 * SettlementDetails157.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails158#mmBeneficialOwnership
	 * SettlementDetails158.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails160#mmBeneficialOwnership
	 * SettlementDetails160.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails161#mmBeneficialOwnership
	 * SettlementDetails161.mmBeneficialOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails162#mmBeneficialOwnership
	 * SettlementDetails162.mmBeneficialOwnership}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::BENE</li>
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
	public static final MMBusinessAttribute mmBeneficialOwnershipIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(BeneficialOwnership1Choice.mmIndicator, BeneficialOwnership1Choice.mmProprietary, SettlementDetails50.mmBeneficialOwnership, BeneficialOwnership2Choice.mmIndicator,
					BeneficialOwnership2Choice.mmProprietary, SettlementDetails51.mmBeneficialOwnership, SettlementDetails9.mmBeneficialOwnership, SettlementDetails17.mmBeneficialOwnership, SettlementDetails30.mmBeneficialOwnership,
					SettlementDetails32.mmBeneficialOwnership, SettlementDetails60.mmBeneficialOwnership, SettlementDetails64.mmBeneficialOwnership, SettlementDetails3.mmBeneficialOwnership, SettlementDetails16.mmBeneficialOwnership,
					SettlementDetails31.mmBeneficialOwnership, SettlementDetails40.mmBeneficialOwnership, SettlementDetails62.mmBeneficialOwnership, SettlementDetails63.mmBeneficialOwnership, SettlementDetails6.mmBeneficialOwnership,
					SettlementDetails20.mmBeneficialOwnership, SettlementDetails24.mmBeneficialOwnership, SettlementDetails33.mmBeneficialOwnership, SettlementDetails45.mmBeneficialOwnership, SettlementDetails54.mmBeneficialOwnership,
					SettlementDetails1.mmBeneficialOwnership, SettlementDetails19.mmBeneficialOwnership, SettlementDetails22.mmBeneficialOwnership, SettlementDetails35.mmBeneficialOwnership, SettlementDetails42.mmBeneficialOwnership,
					SettlementDetails52.mmBeneficialOwnership, SettlementDetails8.mmBeneficialOwnership, SettlementDetails11.mmBeneficialOwnership, SettlementDetails23.mmBeneficialOwnership, SettlementDetails37.mmBeneficialOwnership,
					SettlementDetails44.mmBeneficialOwnership, SettlementDetails53.mmBeneficialOwnership, SettlementDetails7.mmBeneficialOwnership, SettlementDetails12.mmBeneficialOwnership, SettlementDetails28.mmBeneficialOwnership,
					SettlementDetails38.mmBeneficialOwnership, SettlementDetails47.mmBeneficialOwnership, SettlementDetails56.mmBeneficialOwnership, SettlementDetails2.mmBeneficialOwnership, SettlementDetails13.mmBeneficialOwnership,
					SettlementDetails27.mmBeneficialOwnership, SettlementDetails39.mmBeneficialOwnership, SettlementDetails48.mmBeneficialOwnership, SettlementDetails57.mmBeneficialOwnership, BeneficialOwnership3Choice.mmIndicator,
					BeneficialOwnership3Choice.mmProprietary, SettlementDetails43.mmBeneficialOwnership, SettlementDetails10.mmBeneficialOwnership, SettlementDetails29.mmBeneficialOwnership, SettlementDetails5.mmBeneficialOwnership,
					SettlementDetails25.mmBeneficialOwnership, SettlementDetails26.mmBeneficialOwnership, SettlementDetails65.mmBeneficialOwnership, SettlementDetails14.mmBeneficialOwnership, SettlementDetails41.mmBeneficialOwnership,
					SettlementDetails61.mmBeneficialOwnership, SettlementDetails59.mmBeneficialOwnership, SettlementDetails15.mmBeneficialOwnership, SettlementDetails34.mmBeneficialOwnership, SettlementDetails49.mmBeneficialOwnership,
					SettlementDetails58.mmBeneficialOwnership, SettlementDetails36.mmBeneficialOwnership, SettlementDetails67.mmBeneficialOwnership, SettlementDetails70.mmBeneficialOwnership, SettlementDetails68.mmBeneficialOwnership,
					SettlementDetails69.mmBeneficialOwnership, SettlementDetails71.mmBeneficialOwnership, SettlementDetails72.mmBeneficialOwnership, SettlementDetails75.mmBeneficialOwnership, SettlementDetails73.mmBeneficialOwnership,
					SettlementDetails74.mmBeneficialOwnership, SettlementDetails81.mmBeneficialOwnership, SettlementDetails76.mmBeneficialOwnership, SettlementDetails80.mmBeneficialOwnership, SettlementDetails78.mmBeneficialOwnership,
					SettlementDetails77.mmBeneficialOwnership, SettlementDetails79.mmBeneficialOwnership, SettlementDetails87.mmBeneficialOwnership, SettlementDetails83.mmBeneficialOwnership, SettlementDetails86.mmBeneficialOwnership,
					SettlementDetails85.mmBeneficialOwnership, SettlementDetails93.mmBeneficialOwnership, SettlementDetails90.mmBeneficialOwnership, SettlementDetails96.mmBeneficialOwnership, SettlementDetails97.mmBeneficialOwnership,
					SettlementDetails99.mmBeneficialOwnership, SettlementDetails94.mmBeneficialOwnership, BeneficialOwnership4Choice.mmIndicator, BeneficialOwnership4Choice.mmProprietary, SettlementDetails95.mmBeneficialOwnership,
					SettlementDetails91.mmBeneficialOwnership, SettlementDetails92.mmBeneficialOwnership, SettlementDetails98.mmBeneficialOwnership, SettlementDetails101.mmBeneficialOwnership, SettlementDetails105.mmBeneficialOwnership,
					SettlementDetails106.mmBeneficialOwnership, SettlementDetails104.mmBeneficialOwnership, SettlementDetails111.mmBeneficialOwnership, SettlementDetails112.mmBeneficialOwnership, SettlementDetails110.mmBeneficialOwnership,
					SettlementDetails108.mmBeneficialOwnership, SettlementDetails107.mmBeneficialOwnership, BeneficialOwnership5Choice.mmIndicator, BeneficialOwnership5Choice.mmProprietary, SettlementDetails115.mmBeneficialOwnership,
					SettlementDetails117.mmBeneficialOwnership, SettlementDetails116.mmBeneficialOwnership, SettlementDetails113.mmBeneficialOwnership, SettlementDetails128.mmBeneficialOwnership, SettlementDetails120.mmBeneficialOwnership,
					SettlementDetails119.mmBeneficialOwnership, SettlementDetails125.mmBeneficialOwnership, SettlementDetails126.mmBeneficialOwnership, SettlementDetails122.mmBeneficialOwnership, SettlementDetails127.mmBeneficialOwnership,
					SettlementDetails121.mmBeneficialOwnership, SettlementDetails134.mmBeneficialOwnership, SettlementDetails137.mmBeneficialOwnership, SettlementDetails132.mmBeneficialOwnership, SettlementDetails138.mmBeneficialOwnership,
					SettlementDetails130.mmBeneficialOwnership, SettlementDetails131.mmBeneficialOwnership, SettlementDetails133.mmBeneficialOwnership, SettlementDetails139.mmBeneficialOwnership, SettlementDetails140.mmBeneficialOwnership,
					SettlementDetails147.mmBeneficialOwnership, SettlementDetails142.mmBeneficialOwnership, SettlementDetails144.mmBeneficialOwnership, SettlementDetails148.mmBeneficialOwnership, SettlementDetails141.mmBeneficialOwnership,
					SettlementDetails145.mmBeneficialOwnership, SettlementDetails146.mmBeneficialOwnership, SettlementDetails143.mmBeneficialOwnership, SettlementDetails149.mmBeneficialOwnership, SettlementDetails150.mmBeneficialOwnership,
					SettlementDetails151.mmBeneficialOwnership, SettlementDetails152.mmBeneficialOwnership, SettlementDetails153.mmBeneficialOwnership, SettlementDetails155.mmBeneficialOwnership, SettlementDetails156.mmBeneficialOwnership,
					SettlementDetails157.mmBeneficialOwnership, SettlementDetails158.mmBeneficialOwnership, SettlementDetails160.mmBeneficialOwnership, SettlementDetails161.mmBeneficialOwnership, SettlementDetails162.mmBeneficialOwnership);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::BENE"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BeneficialOwnershipIndicator";
			definition = "Specifies whether there is change of beneficial ownership.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlement.class.getMethod("getBeneficialOwnershipIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected MarketClientSideCode marketClientSide;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.choice.MarketClientSide1Choice#mmCode
	 * MarketClientSide1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketClientSide1Choice#mmProprietary
	 * MarketClientSide1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails50#mmMarketClientSide
	 * SettlementDetails50.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketClientSide2Choice#mmCode
	 * MarketClientSide2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketClientSide2Choice#mmProprietary
	 * MarketClientSide2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails51#mmMarketClientSide
	 * SettlementDetails51.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails9#mmMarketClientSide
	 * SettlementDetails9.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails17#mmMarketClientSide
	 * SettlementDetails17.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails30#mmMarketClientSide
	 * SettlementDetails30.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails32#mmMarketClientSide
	 * SettlementDetails32.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails60#mmMarketClientSide
	 * SettlementDetails60.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails64#mmMarketClientSide
	 * SettlementDetails64.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails3#mmMarketClientSide
	 * SettlementDetails3.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails16#mmMarketClientSide
	 * SettlementDetails16.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails31#mmMarketClientSide
	 * SettlementDetails31.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails40#mmMarketClientSide
	 * SettlementDetails40.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails62#mmMarketClientSide
	 * SettlementDetails62.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails63#mmMarketClientSide
	 * SettlementDetails63.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails6#mmMarketClientSide
	 * SettlementDetails6.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails20#mmMarketClientSide
	 * SettlementDetails20.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails24#mmMarketClientSide
	 * SettlementDetails24.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails33#mmMarketClientSide
	 * SettlementDetails33.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails45#mmMarketClientSide
	 * SettlementDetails45.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails54#mmMarketClientSide
	 * SettlementDetails54.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails1#mmMarketClientSide
	 * SettlementDetails1.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails19#mmMarketClientSide
	 * SettlementDetails19.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails22#mmMarketClientSide
	 * SettlementDetails22.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails35#mmMarketClientSide
	 * SettlementDetails35.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#mmMarketClientSide
	 * SettlementDetails42.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails52#mmMarketClientSide
	 * SettlementDetails52.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails8#mmMarketClientSide
	 * SettlementDetails8.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails11#mmMarketClientSide
	 * SettlementDetails11.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails23#mmMarketClientSide
	 * SettlementDetails23.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails37#mmMarketClientSide
	 * SettlementDetails37.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails44#mmMarketClientSide
	 * SettlementDetails44.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails53#mmMarketClientSide
	 * SettlementDetails53.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails7#mmMarketClientSide
	 * SettlementDetails7.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails12#mmMarketClientSide
	 * SettlementDetails12.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails28#mmMarketClientSide
	 * SettlementDetails28.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails38#mmMarketClientSide
	 * SettlementDetails38.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails47#mmMarketClientSide
	 * SettlementDetails47.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails56#mmMarketClientSide
	 * SettlementDetails56.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails2#mmMarketClientSide
	 * SettlementDetails2.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails13#mmMarketClientSide
	 * SettlementDetails13.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails27#mmMarketClientSide
	 * SettlementDetails27.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails39#mmMarketClientSide
	 * SettlementDetails39.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails48#mmMarketClientSide
	 * SettlementDetails48.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails57#mmMarketClientSide
	 * SettlementDetails57.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketClientSide3Choice#mmCode
	 * MarketClientSide3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketClientSide3Choice#mmProprietary
	 * MarketClientSide3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#mmMarketClientSide
	 * SettlementDetails43.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails10#mmMarketClientSide
	 * SettlementDetails10.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails29#mmMarketClientSide
	 * SettlementDetails29.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails5#mmMarketClientSide
	 * SettlementDetails5.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails25#mmMarketClientSide
	 * SettlementDetails25.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails26#mmMarketClientSide
	 * SettlementDetails26.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails65#mmMarketClientSide
	 * SettlementDetails65.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails14#mmMarketClientSide
	 * SettlementDetails14.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails41#mmMarketClientSide
	 * SettlementDetails41.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails61#mmMarketClientSide
	 * SettlementDetails61.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails59#mmMarketClientSide
	 * SettlementDetails59.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails15#mmMarketClientSide
	 * SettlementDetails15.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails34#mmMarketClientSide
	 * SettlementDetails34.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails49#mmMarketClientSide
	 * SettlementDetails49.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails58#mmMarketClientSide
	 * SettlementDetails58.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails36#mmMarketClientSide
	 * SettlementDetails36.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#mmMarketClientSide
	 * SettlementDetails67.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails70#mmMarketClientSide
	 * SettlementDetails70.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#mmMarketClientSide
	 * SettlementDetails68.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails69#mmMarketClientSide
	 * SettlementDetails69.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails71#mmMarketClientSide
	 * SettlementDetails71.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails72#mmMarketClientSide
	 * SettlementDetails72.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails75#mmMarketClientSide
	 * SettlementDetails75.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails73#mmMarketClientSide
	 * SettlementDetails73.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails74#mmMarketClientSide
	 * SettlementDetails74.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails81#mmMarketClientSide
	 * SettlementDetails81.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails76#mmMarketClientSide
	 * SettlementDetails76.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails80#mmMarketClientSide
	 * SettlementDetails80.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails78#mmMarketClientSide
	 * SettlementDetails78.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails77#mmMarketClientSide
	 * SettlementDetails77.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails79#mmMarketClientSide
	 * SettlementDetails79.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails87#mmMarketClientSide
	 * SettlementDetails87.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails83#mmMarketClientSide
	 * SettlementDetails83.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails86#mmMarketClientSide
	 * SettlementDetails86.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails85#mmMarketClientSide
	 * SettlementDetails85.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#mmMarketClientSide
	 * SettlementDetails93.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails90#mmMarketClientSide
	 * SettlementDetails90.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails96#mmMarketClientSide
	 * SettlementDetails96.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#mmMarketClientSide
	 * SettlementDetails97.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails99#mmMarketClientSide
	 * SettlementDetails99.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#mmMarketClientSide
	 * SettlementDetails94.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketClientSide4Choice#mmCode
	 * MarketClientSide4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketClientSide4Choice#mmProprietary
	 * MarketClientSide4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails95#mmMarketClientSide
	 * SettlementDetails95.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails91#mmMarketClientSide
	 * SettlementDetails91.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails92#mmMarketClientSide
	 * SettlementDetails92.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails98#mmMarketClientSide
	 * SettlementDetails98.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails101#mmMarketClientSide
	 * SettlementDetails101.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails105#mmMarketClientSide
	 * SettlementDetails105.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails106#mmMarketClientSide
	 * SettlementDetails106.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails104#mmMarketClientSide
	 * SettlementDetails104.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails111#mmMarketClientSide
	 * SettlementDetails111.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails112#mmMarketClientSide
	 * SettlementDetails112.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails110#mmMarketClientSide
	 * SettlementDetails110.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails108#mmMarketClientSide
	 * SettlementDetails108.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails107#mmMarketClientSide
	 * SettlementDetails107.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketClientSide5Choice#mmCode
	 * MarketClientSide5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketClientSide5Choice#mmProprietary
	 * MarketClientSide5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails115#mmMarketClientSide
	 * SettlementDetails115.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails117#mmMarketClientSide
	 * SettlementDetails117.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails116#mmMarketClientSide
	 * SettlementDetails116.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails113#mmMarketClientSide
	 * SettlementDetails113.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails128#mmMarketClientSide
	 * SettlementDetails128.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#mmMarketClientSide
	 * SettlementDetails120.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#mmMarketClientSide
	 * SettlementDetails119.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails125#mmMarketClientSide
	 * SettlementDetails125.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails126#mmMarketClientSide
	 * SettlementDetails126.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#mmMarketClientSide
	 * SettlementDetails122.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails127#mmMarketClientSide
	 * SettlementDetails127.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails121#mmMarketClientSide
	 * SettlementDetails121.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails134#mmMarketClientSide
	 * SettlementDetails134.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails137#mmMarketClientSide
	 * SettlementDetails137.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails132#mmMarketClientSide
	 * SettlementDetails132.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails138#mmMarketClientSide
	 * SettlementDetails138.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails130#mmMarketClientSide
	 * SettlementDetails130.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails131#mmMarketClientSide
	 * SettlementDetails131.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails133#mmMarketClientSide
	 * SettlementDetails133.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails139#mmMarketClientSide
	 * SettlementDetails139.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails140#mmMarketClientSide
	 * SettlementDetails140.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails147#mmMarketClientSide
	 * SettlementDetails147.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails142#mmMarketClientSide
	 * SettlementDetails142.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails144#mmMarketClientSide
	 * SettlementDetails144.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails148#mmMarketClientSide
	 * SettlementDetails148.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails141#mmMarketClientSide
	 * SettlementDetails141.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails145#mmMarketClientSide
	 * SettlementDetails145.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails146#mmMarketClientSide
	 * SettlementDetails146.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketClientSide6Choice#mmCode
	 * MarketClientSide6Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketClientSide6Choice#mmProprietary
	 * MarketClientSide6Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails143#mmMarketClientSide
	 * SettlementDetails143.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails149#mmMarketClientSide
	 * SettlementDetails149.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails150#mmMarketClientSide
	 * SettlementDetails150.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails151#mmMarketClientSide
	 * SettlementDetails151.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketClientSide7Choice#mmCode
	 * MarketClientSide7Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketClientSide7Choice#mmProprietary
	 * MarketClientSide7Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails152#mmMarketClientSide
	 * SettlementDetails152.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails153#mmMarketClientSide
	 * SettlementDetails153.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails155#mmMarketClientSide
	 * SettlementDetails155.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails156#mmMarketClientSide
	 * SettlementDetails156.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails157#mmMarketClientSide
	 * SettlementDetails157.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails158#mmMarketClientSide
	 * SettlementDetails158.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails160#mmMarketClientSide
	 * SettlementDetails160.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails161#mmMarketClientSide
	 * SettlementDetails161.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails162#mmMarketClientSide
	 * SettlementDetails162.mmMarketClientSide}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::MACL</li>
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
	public static final MMBusinessAttribute mmMarketClientSide = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(MarketClientSide1Choice.mmCode, MarketClientSide1Choice.mmProprietary, SettlementDetails50.mmMarketClientSide, MarketClientSide2Choice.mmCode, MarketClientSide2Choice.mmProprietary,
					SettlementDetails51.mmMarketClientSide, SettlementDetails9.mmMarketClientSide, SettlementDetails17.mmMarketClientSide, SettlementDetails30.mmMarketClientSide, SettlementDetails32.mmMarketClientSide,
					SettlementDetails60.mmMarketClientSide, SettlementDetails64.mmMarketClientSide, SettlementDetails3.mmMarketClientSide, SettlementDetails16.mmMarketClientSide, SettlementDetails31.mmMarketClientSide,
					SettlementDetails40.mmMarketClientSide, SettlementDetails62.mmMarketClientSide, SettlementDetails63.mmMarketClientSide, SettlementDetails6.mmMarketClientSide, SettlementDetails20.mmMarketClientSide,
					SettlementDetails24.mmMarketClientSide, SettlementDetails33.mmMarketClientSide, SettlementDetails45.mmMarketClientSide, SettlementDetails54.mmMarketClientSide, SettlementDetails1.mmMarketClientSide,
					SettlementDetails19.mmMarketClientSide, SettlementDetails22.mmMarketClientSide, SettlementDetails35.mmMarketClientSide, SettlementDetails42.mmMarketClientSide, SettlementDetails52.mmMarketClientSide,
					SettlementDetails8.mmMarketClientSide, SettlementDetails11.mmMarketClientSide, SettlementDetails23.mmMarketClientSide, SettlementDetails37.mmMarketClientSide, SettlementDetails44.mmMarketClientSide,
					SettlementDetails53.mmMarketClientSide, SettlementDetails7.mmMarketClientSide, SettlementDetails12.mmMarketClientSide, SettlementDetails28.mmMarketClientSide, SettlementDetails38.mmMarketClientSide,
					SettlementDetails47.mmMarketClientSide, SettlementDetails56.mmMarketClientSide, SettlementDetails2.mmMarketClientSide, SettlementDetails13.mmMarketClientSide, SettlementDetails27.mmMarketClientSide,
					SettlementDetails39.mmMarketClientSide, SettlementDetails48.mmMarketClientSide, SettlementDetails57.mmMarketClientSide, MarketClientSide3Choice.mmCode, MarketClientSide3Choice.mmProprietary,
					SettlementDetails43.mmMarketClientSide, SettlementDetails10.mmMarketClientSide, SettlementDetails29.mmMarketClientSide, SettlementDetails5.mmMarketClientSide, SettlementDetails25.mmMarketClientSide,
					SettlementDetails26.mmMarketClientSide, SettlementDetails65.mmMarketClientSide, SettlementDetails14.mmMarketClientSide, SettlementDetails41.mmMarketClientSide, SettlementDetails61.mmMarketClientSide,
					SettlementDetails59.mmMarketClientSide, SettlementDetails15.mmMarketClientSide, SettlementDetails34.mmMarketClientSide, SettlementDetails49.mmMarketClientSide, SettlementDetails58.mmMarketClientSide,
					SettlementDetails36.mmMarketClientSide, SettlementDetails67.mmMarketClientSide, SettlementDetails70.mmMarketClientSide, SettlementDetails68.mmMarketClientSide, SettlementDetails69.mmMarketClientSide,
					SettlementDetails71.mmMarketClientSide, SettlementDetails72.mmMarketClientSide, SettlementDetails75.mmMarketClientSide, SettlementDetails73.mmMarketClientSide, SettlementDetails74.mmMarketClientSide,
					SettlementDetails81.mmMarketClientSide, SettlementDetails76.mmMarketClientSide, SettlementDetails80.mmMarketClientSide, SettlementDetails78.mmMarketClientSide, SettlementDetails77.mmMarketClientSide,
					SettlementDetails79.mmMarketClientSide, SettlementDetails87.mmMarketClientSide, SettlementDetails83.mmMarketClientSide, SettlementDetails86.mmMarketClientSide, SettlementDetails85.mmMarketClientSide,
					SettlementDetails93.mmMarketClientSide, SettlementDetails90.mmMarketClientSide, SettlementDetails96.mmMarketClientSide, SettlementDetails97.mmMarketClientSide, SettlementDetails99.mmMarketClientSide,
					SettlementDetails94.mmMarketClientSide, MarketClientSide4Choice.mmCode, MarketClientSide4Choice.mmProprietary, SettlementDetails95.mmMarketClientSide, SettlementDetails91.mmMarketClientSide,
					SettlementDetails92.mmMarketClientSide, SettlementDetails98.mmMarketClientSide, SettlementDetails101.mmMarketClientSide, SettlementDetails105.mmMarketClientSide, SettlementDetails106.mmMarketClientSide,
					SettlementDetails104.mmMarketClientSide, SettlementDetails111.mmMarketClientSide, SettlementDetails112.mmMarketClientSide, SettlementDetails110.mmMarketClientSide, SettlementDetails108.mmMarketClientSide,
					SettlementDetails107.mmMarketClientSide, MarketClientSide5Choice.mmCode, MarketClientSide5Choice.mmProprietary, SettlementDetails115.mmMarketClientSide, SettlementDetails117.mmMarketClientSide,
					SettlementDetails116.mmMarketClientSide, SettlementDetails113.mmMarketClientSide, SettlementDetails128.mmMarketClientSide, SettlementDetails120.mmMarketClientSide, SettlementDetails119.mmMarketClientSide,
					SettlementDetails125.mmMarketClientSide, SettlementDetails126.mmMarketClientSide, SettlementDetails122.mmMarketClientSide, SettlementDetails127.mmMarketClientSide, SettlementDetails121.mmMarketClientSide,
					SettlementDetails134.mmMarketClientSide, SettlementDetails137.mmMarketClientSide, SettlementDetails132.mmMarketClientSide, SettlementDetails138.mmMarketClientSide, SettlementDetails130.mmMarketClientSide,
					SettlementDetails131.mmMarketClientSide, SettlementDetails133.mmMarketClientSide, SettlementDetails139.mmMarketClientSide, SettlementDetails140.mmMarketClientSide, SettlementDetails147.mmMarketClientSide,
					SettlementDetails142.mmMarketClientSide, SettlementDetails144.mmMarketClientSide, SettlementDetails148.mmMarketClientSide, SettlementDetails141.mmMarketClientSide, SettlementDetails145.mmMarketClientSide,
					SettlementDetails146.mmMarketClientSide, MarketClientSide6Choice.mmCode, MarketClientSide6Choice.mmProprietary, SettlementDetails143.mmMarketClientSide, SettlementDetails149.mmMarketClientSide,
					SettlementDetails150.mmMarketClientSide, SettlementDetails151.mmMarketClientSide, MarketClientSide7Choice.mmCode, MarketClientSide7Choice.mmProprietary, SettlementDetails152.mmMarketClientSide,
					SettlementDetails153.mmMarketClientSide, SettlementDetails155.mmMarketClientSide, SettlementDetails156.mmMarketClientSide, SettlementDetails157.mmMarketClientSide, SettlementDetails158.mmMarketClientSide,
					SettlementDetails160.mmMarketClientSide, SettlementDetails161.mmMarketClientSide, SettlementDetails162.mmMarketClientSide);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::MACL"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MarketClientSide";
			definition = "Specifies if an instruction is for a market side or a client side transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MarketClientSideCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlement.class.getMethod("getMarketClientSide", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator tracking;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails50#mmTracking
	 * SettlementDetails50.mmTracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails51#mmTracking
	 * SettlementDetails51.mmTracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails3#mmTracking
	 * SettlementDetails3.mmTracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails16#mmTracking
	 * SettlementDetails16.mmTracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails31#mmTracking
	 * SettlementDetails31.mmTracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails40#mmTracking
	 * SettlementDetails40.mmTracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails62#mmTracking
	 * SettlementDetails62.mmTracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails63#mmTracking
	 * SettlementDetails63.mmTracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails1#mmTracking
	 * SettlementDetails1.mmTracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails19#mmTracking
	 * SettlementDetails19.mmTracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails22#mmTracking
	 * SettlementDetails22.mmTracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails35#mmTracking
	 * SettlementDetails35.mmTracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#mmTracking
	 * SettlementDetails42.mmTracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails52#mmTracking
	 * SettlementDetails52.mmTracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#mmTracking
	 * SettlementDetails43.mmTracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails65#mmTracking
	 * SettlementDetails65.mmTracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#mmTracking
	 * SettlementDetails67.mmTracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#mmTracking
	 * SettlementDetails68.mmTracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails72#mmTracking
	 * SettlementDetails72.mmTracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails81#mmTracking
	 * SettlementDetails81.mmTracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails78#mmTracking
	 * SettlementDetails78.mmTracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails77#mmTracking
	 * SettlementDetails77.mmTracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails83#mmTracking
	 * SettlementDetails83.mmTracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#mmTracking
	 * SettlementDetails93.mmTracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#mmTracking
	 * SettlementDetails97.mmTracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#mmTracking
	 * SettlementDetails94.mmTracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails101#mmTracking
	 * SettlementDetails101.mmTracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails105#mmTracking
	 * SettlementDetails105.mmTracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails106#mmTracking
	 * SettlementDetails106.mmTracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails111#mmTracking
	 * SettlementDetails111.mmTracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails112#mmTracking
	 * SettlementDetails112.mmTracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails113#mmTracking
	 * SettlementDetails113.mmTracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#mmTracking
	 * SettlementDetails120.mmTracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#mmTracking
	 * SettlementDetails119.mmTracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#mmTracking
	 * SettlementDetails122.mmTracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails137#mmTracking
	 * SettlementDetails137.mmTracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails132#mmTracking
	 * SettlementDetails132.mmTracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails138#mmTracking
	 * SettlementDetails138.mmTracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails140#mmTracking
	 * SettlementDetails140.mmTracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails142#mmTracking
	 * SettlementDetails142.mmTracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails148#mmTracking
	 * SettlementDetails148.mmTracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails145#mmTracking
	 * SettlementDetails145.mmTracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails146#mmTracking
	 * SettlementDetails146.mmTracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails152#mmTracking
	 * SettlementDetails152.mmTracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails156#mmTracking
	 * SettlementDetails156.mmTracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails157#mmTracking
	 * SettlementDetails157.mmTracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails158#mmTracking
	 * SettlementDetails158.mmTracking}</li>
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
	public static final MMBusinessAttribute mmTracking = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementDetails50.mmTracking, SettlementDetails51.mmTracking, SettlementDetails3.mmTracking, SettlementDetails16.mmTracking, SettlementDetails31.mmTracking,
					SettlementDetails40.mmTracking, SettlementDetails62.mmTracking, SettlementDetails63.mmTracking, SettlementDetails1.mmTracking, SettlementDetails19.mmTracking, SettlementDetails22.mmTracking,
					SettlementDetails35.mmTracking, SettlementDetails42.mmTracking, SettlementDetails52.mmTracking, SettlementDetails43.mmTracking, SettlementDetails65.mmTracking, SettlementDetails67.mmTracking,
					SettlementDetails68.mmTracking, SettlementDetails72.mmTracking, SettlementDetails81.mmTracking, SettlementDetails78.mmTracking, SettlementDetails77.mmTracking, SettlementDetails83.mmTracking,
					SettlementDetails93.mmTracking, SettlementDetails97.mmTracking, SettlementDetails94.mmTracking, SettlementDetails101.mmTracking, SettlementDetails105.mmTracking, SettlementDetails106.mmTracking,
					SettlementDetails111.mmTracking, SettlementDetails112.mmTracking, SettlementDetails113.mmTracking, SettlementDetails120.mmTracking, SettlementDetails119.mmTracking, SettlementDetails122.mmTracking,
					SettlementDetails137.mmTracking, SettlementDetails132.mmTracking, SettlementDetails138.mmTracking, SettlementDetails140.mmTracking, SettlementDetails142.mmTracking, SettlementDetails148.mmTracking,
					SettlementDetails145.mmTracking, SettlementDetails146.mmTracking, SettlementDetails152.mmTracking, SettlementDetails156.mmTracking, SettlementDetails157.mmTracking, SettlementDetails158.mmTracking);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Tracking";
			definition = "Specifies whether the loan and/or collateral is tracked.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlement.class.getMethod("getTracking", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator letterOfGuarantee;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.choice.LetterOfGuarantee1Choice#mmIndicator
	 * LetterOfGuarantee1Choice.mmIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LetterOfGuarantee1Choice#mmProprietary
	 * LetterOfGuarantee1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails50#mmLetterOfGuarantee
	 * SettlementDetails50.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LetterOfGuarantee2Choice#mmIndicator
	 * LetterOfGuarantee2Choice.mmIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LetterOfGuarantee2Choice#mmProprietary
	 * LetterOfGuarantee2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails51#mmLetterOfGuarantee
	 * SettlementDetails51.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails6#mmLetterOfGuarantee
	 * SettlementDetails6.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails20#mmLetterOfGuarantee
	 * SettlementDetails20.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails24#mmLetterOfGuarantee
	 * SettlementDetails24.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails33#mmLetterOfGuarantee
	 * SettlementDetails33.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails45#mmLetterOfGuarantee
	 * SettlementDetails45.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails54#mmLetterOfGuarantee
	 * SettlementDetails54.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails1#mmLetterOfGuarantee
	 * SettlementDetails1.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails19#mmLetterOfGuarantee
	 * SettlementDetails19.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails22#mmLetterOfGuarantee
	 * SettlementDetails22.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails35#mmLetterOfGuarantee
	 * SettlementDetails35.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#mmLetterOfGuarantee
	 * SettlementDetails42.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails52#mmLetterOfGuarantee
	 * SettlementDetails52.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails8#mmLetterOfGuarantee
	 * SettlementDetails8.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails11#mmLetterOfGuarantee
	 * SettlementDetails11.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails23#mmLetterOfGuarantee
	 * SettlementDetails23.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails37#mmLetterOfGuarantee
	 * SettlementDetails37.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails44#mmLetterOfGuarantee
	 * SettlementDetails44.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails53#mmLetterOfGuarantee
	 * SettlementDetails53.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails7#mmLetterOfGuarantee
	 * SettlementDetails7.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails12#mmLetterOfGuarantee
	 * SettlementDetails12.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails28#mmLetterOfGuarantee
	 * SettlementDetails28.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails38#mmLetterOfGuarantee
	 * SettlementDetails38.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails47#mmLetterOfGuarantee
	 * SettlementDetails47.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails56#mmLetterOfGuarantee
	 * SettlementDetails56.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails2#mmLetterOfGuarantee
	 * SettlementDetails2.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails13#mmLetterOfGuarantee
	 * SettlementDetails13.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails27#mmLetterOfGuarantee
	 * SettlementDetails27.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails39#mmLetterOfGuarantee
	 * SettlementDetails39.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails48#mmLetterOfGuarantee
	 * SettlementDetails48.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails57#mmLetterOfGuarantee
	 * SettlementDetails57.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LetterOfGuarantee3Choice#mmIndicator
	 * LetterOfGuarantee3Choice.mmIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LetterOfGuarantee3Choice#mmProprietary
	 * LetterOfGuarantee3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#mmLetterOfGuarantee
	 * SettlementDetails43.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails5#mmLetterOfGuarantee
	 * SettlementDetails5.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails26#mmLetterOfGuarantee
	 * SettlementDetails26.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails15#mmLetterOfGuarantee
	 * SettlementDetails15.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails36#mmLetterOfGuarantee
	 * SettlementDetails36.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails66#mmLetterOfGuarantee
	 * SettlementDetails66.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#mmLetterOfGuarantee
	 * SettlementDetails67.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails70#mmLetterOfGuarantee
	 * SettlementDetails70.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#mmLetterOfGuarantee
	 * SettlementDetails68.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails69#mmLetterOfGuarantee
	 * SettlementDetails69.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails75#mmLetterOfGuarantee
	 * SettlementDetails75.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails74#mmLetterOfGuarantee
	 * SettlementDetails74.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails81#mmLetterOfGuarantee
	 * SettlementDetails81.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails80#mmLetterOfGuarantee
	 * SettlementDetails80.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails87#mmLetterOfGuarantee
	 * SettlementDetails87.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails83#mmLetterOfGuarantee
	 * SettlementDetails83.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails86#mmLetterOfGuarantee
	 * SettlementDetails86.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails85#mmLetterOfGuarantee
	 * SettlementDetails85.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#mmLetterOfGuarantee
	 * SettlementDetails93.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails90#mmLetterOfGuarantee
	 * SettlementDetails90.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#mmLetterOfGuarantee
	 * SettlementDetails94.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails95#mmLetterOfGuarantee
	 * SettlementDetails95.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails91#mmLetterOfGuarantee
	 * SettlementDetails91.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LetterOfGuarantee4Choice#mmIndicator
	 * LetterOfGuarantee4Choice.mmIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LetterOfGuarantee4Choice#mmProprietary
	 * LetterOfGuarantee4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails92#mmLetterOfGuarantee
	 * SettlementDetails92.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails101#mmLetterOfGuarantee
	 * SettlementDetails101.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails111#mmLetterOfGuarantee
	 * SettlementDetails111.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails112#mmLetterOfGuarantee
	 * SettlementDetails112.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails110#mmLetterOfGuarantee
	 * SettlementDetails110.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails115#mmLetterOfGuarantee
	 * SettlementDetails115.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LetterOfGuarantee5Choice#mmIndicator
	 * LetterOfGuarantee5Choice.mmIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LetterOfGuarantee5Choice#mmProprietary
	 * LetterOfGuarantee5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails117#mmLetterOfGuarantee
	 * SettlementDetails117.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails116#mmLetterOfGuarantee
	 * SettlementDetails116.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails113#mmLetterOfGuarantee
	 * SettlementDetails113.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails128#mmLetterOfGuarantee
	 * SettlementDetails128.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#mmLetterOfGuarantee
	 * SettlementDetails120.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#mmLetterOfGuarantee
	 * SettlementDetails119.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails126#mmLetterOfGuarantee
	 * SettlementDetails126.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#mmLetterOfGuarantee
	 * SettlementDetails122.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails127#mmLetterOfGuarantee
	 * SettlementDetails127.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails121#mmLetterOfGuarantee
	 * SettlementDetails121.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails134#mmLetterOfGuarantee
	 * SettlementDetails134.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails137#mmLetterOfGuarantee
	 * SettlementDetails137.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails132#mmLetterOfGuarantee
	 * SettlementDetails132.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails138#mmLetterOfGuarantee
	 * SettlementDetails138.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails130#mmLetterOfGuarantee
	 * SettlementDetails130.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails133#mmLetterOfGuarantee
	 * SettlementDetails133.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails139#mmLetterOfGuarantee
	 * SettlementDetails139.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails140#mmLetterOfGuarantee
	 * SettlementDetails140.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails142#mmLetterOfGuarantee
	 * SettlementDetails142.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails144#mmLetterOfGuarantee
	 * SettlementDetails144.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails145#mmLetterOfGuarantee
	 * SettlementDetails145.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails146#mmLetterOfGuarantee
	 * SettlementDetails146.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails143#mmLetterOfGuarantee
	 * SettlementDetails143.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails149#mmLetterOfGuarantee
	 * SettlementDetails149.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails150#mmLetterOfGuarantee
	 * SettlementDetails150.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails155#mmLetterOfGuarantee
	 * SettlementDetails155.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails156#mmLetterOfGuarantee
	 * SettlementDetails156.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails157#mmLetterOfGuarantee
	 * SettlementDetails157.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails158#mmLetterOfGuarantee
	 * SettlementDetails158.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails160#mmLetterOfGuarantee
	 * SettlementDetails160.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails161#mmLetterOfGuarantee
	 * SettlementDetails161.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails162#mmLetterOfGuarantee
	 * SettlementDetails162.mmLetterOfGuarantee}</li>
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
	public static final MMBusinessAttribute mmLetterOfGuarantee = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(LetterOfGuarantee1Choice.mmIndicator, LetterOfGuarantee1Choice.mmProprietary, SettlementDetails50.mmLetterOfGuarantee, LetterOfGuarantee2Choice.mmIndicator,
					LetterOfGuarantee2Choice.mmProprietary, SettlementDetails51.mmLetterOfGuarantee, SettlementDetails6.mmLetterOfGuarantee, SettlementDetails20.mmLetterOfGuarantee, SettlementDetails24.mmLetterOfGuarantee,
					SettlementDetails33.mmLetterOfGuarantee, SettlementDetails45.mmLetterOfGuarantee, SettlementDetails54.mmLetterOfGuarantee, SettlementDetails1.mmLetterOfGuarantee, SettlementDetails19.mmLetterOfGuarantee,
					SettlementDetails22.mmLetterOfGuarantee, SettlementDetails35.mmLetterOfGuarantee, SettlementDetails42.mmLetterOfGuarantee, SettlementDetails52.mmLetterOfGuarantee, SettlementDetails8.mmLetterOfGuarantee,
					SettlementDetails11.mmLetterOfGuarantee, SettlementDetails23.mmLetterOfGuarantee, SettlementDetails37.mmLetterOfGuarantee, SettlementDetails44.mmLetterOfGuarantee, SettlementDetails53.mmLetterOfGuarantee,
					SettlementDetails7.mmLetterOfGuarantee, SettlementDetails12.mmLetterOfGuarantee, SettlementDetails28.mmLetterOfGuarantee, SettlementDetails38.mmLetterOfGuarantee, SettlementDetails47.mmLetterOfGuarantee,
					SettlementDetails56.mmLetterOfGuarantee, SettlementDetails2.mmLetterOfGuarantee, SettlementDetails13.mmLetterOfGuarantee, SettlementDetails27.mmLetterOfGuarantee, SettlementDetails39.mmLetterOfGuarantee,
					SettlementDetails48.mmLetterOfGuarantee, SettlementDetails57.mmLetterOfGuarantee, LetterOfGuarantee3Choice.mmIndicator, LetterOfGuarantee3Choice.mmProprietary, SettlementDetails43.mmLetterOfGuarantee,
					SettlementDetails5.mmLetterOfGuarantee, SettlementDetails26.mmLetterOfGuarantee, SettlementDetails15.mmLetterOfGuarantee, SettlementDetails36.mmLetterOfGuarantee, SettlementDetails66.mmLetterOfGuarantee,
					SettlementDetails67.mmLetterOfGuarantee, SettlementDetails70.mmLetterOfGuarantee, SettlementDetails68.mmLetterOfGuarantee, SettlementDetails69.mmLetterOfGuarantee, SettlementDetails75.mmLetterOfGuarantee,
					SettlementDetails74.mmLetterOfGuarantee, SettlementDetails81.mmLetterOfGuarantee, SettlementDetails80.mmLetterOfGuarantee, SettlementDetails87.mmLetterOfGuarantee, SettlementDetails83.mmLetterOfGuarantee,
					SettlementDetails86.mmLetterOfGuarantee, SettlementDetails85.mmLetterOfGuarantee, SettlementDetails93.mmLetterOfGuarantee, SettlementDetails90.mmLetterOfGuarantee, SettlementDetails94.mmLetterOfGuarantee,
					SettlementDetails95.mmLetterOfGuarantee, SettlementDetails91.mmLetterOfGuarantee, LetterOfGuarantee4Choice.mmIndicator, LetterOfGuarantee4Choice.mmProprietary, SettlementDetails92.mmLetterOfGuarantee,
					SettlementDetails101.mmLetterOfGuarantee, SettlementDetails111.mmLetterOfGuarantee, SettlementDetails112.mmLetterOfGuarantee, SettlementDetails110.mmLetterOfGuarantee, SettlementDetails115.mmLetterOfGuarantee,
					LetterOfGuarantee5Choice.mmIndicator, LetterOfGuarantee5Choice.mmProprietary, SettlementDetails117.mmLetterOfGuarantee, SettlementDetails116.mmLetterOfGuarantee, SettlementDetails113.mmLetterOfGuarantee,
					SettlementDetails128.mmLetterOfGuarantee, SettlementDetails120.mmLetterOfGuarantee, SettlementDetails119.mmLetterOfGuarantee, SettlementDetails126.mmLetterOfGuarantee, SettlementDetails122.mmLetterOfGuarantee,
					SettlementDetails127.mmLetterOfGuarantee, SettlementDetails121.mmLetterOfGuarantee, SettlementDetails134.mmLetterOfGuarantee, SettlementDetails137.mmLetterOfGuarantee, SettlementDetails132.mmLetterOfGuarantee,
					SettlementDetails138.mmLetterOfGuarantee, SettlementDetails130.mmLetterOfGuarantee, SettlementDetails133.mmLetterOfGuarantee, SettlementDetails139.mmLetterOfGuarantee, SettlementDetails140.mmLetterOfGuarantee,
					SettlementDetails142.mmLetterOfGuarantee, SettlementDetails144.mmLetterOfGuarantee, SettlementDetails145.mmLetterOfGuarantee, SettlementDetails146.mmLetterOfGuarantee, SettlementDetails143.mmLetterOfGuarantee,
					SettlementDetails149.mmLetterOfGuarantee, SettlementDetails150.mmLetterOfGuarantee, SettlementDetails155.mmLetterOfGuarantee, SettlementDetails156.mmLetterOfGuarantee, SettlementDetails157.mmLetterOfGuarantee,
					SettlementDetails158.mmLetterOfGuarantee, SettlementDetails160.mmLetterOfGuarantee, SettlementDetails161.mmLetterOfGuarantee, SettlementDetails162.mmLetterOfGuarantee);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LetterOfGuarantee";
			definition = "Specifies whether physical settlement may be executed using a letter of guarantee or if the physical certificates should be used.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlement.class.getMethod("getLetterOfGuarantee", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator eligibleForCollateral;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails50#mmEligibleForCollateral
	 * SettlementDetails50.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails51#mmEligibleForCollateral
	 * SettlementDetails51.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption5#mmEligibleForCollateralIndicator
	 * CorporateActionOption5.mmEligibleForCollateralIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption13#mmEligibleForCollateralIndicator
	 * CorporateActionOption13.mmEligibleForCollateralIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption25#mmEligibleForCollateralIndicator
	 * CorporateActionOption25.mmEligibleForCollateralIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption30#mmEligibleForCollateralIndicator
	 * CorporateActionOption30.mmEligibleForCollateralIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption38#mmEligibleForCollateralIndicator
	 * CorporateActionOption38.mmEligibleForCollateralIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption47#mmEligibleForCollateralIndicator
	 * CorporateActionOption47.mmEligibleForCollateralIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption57#mmEligibleForCollateralIndicator
	 * CorporateActionOption57.mmEligibleForCollateralIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption58#mmEligibleForCollateralIndicator
	 * CorporateActionOption58.mmEligibleForCollateralIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails9#mmEligibleForCollateral
	 * SettlementDetails9.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails17#mmEligibleForCollateral
	 * SettlementDetails17.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails30#mmEligibleForCollateral
	 * SettlementDetails30.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails32#mmEligibleForCollateral
	 * SettlementDetails32.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails60#mmEligibleForCollateral
	 * SettlementDetails60.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails64#mmEligibleForCollateral
	 * SettlementDetails64.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails3#mmEligibleForCollateral
	 * SettlementDetails3.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails16#mmEligibleForCollateral
	 * SettlementDetails16.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails31#mmEligibleForCollateral
	 * SettlementDetails31.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails40#mmEligibleForCollateral
	 * SettlementDetails40.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails62#mmEligibleForCollateral
	 * SettlementDetails62.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails63#mmEligibleForCollateral
	 * SettlementDetails63.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails6#mmEligibleForCollateral
	 * SettlementDetails6.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails20#mmEligibleForCollateral
	 * SettlementDetails20.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails24#mmEligibleForCollateral
	 * SettlementDetails24.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails33#mmEligibleForCollateral
	 * SettlementDetails33.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails45#mmEligibleForCollateral
	 * SettlementDetails45.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails54#mmEligibleForCollateral
	 * SettlementDetails54.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails1#mmEligibleForCollateral
	 * SettlementDetails1.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails19#mmEligibleForCollateral
	 * SettlementDetails19.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails22#mmEligibleForCollateral
	 * SettlementDetails22.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails35#mmEligibleForCollateral
	 * SettlementDetails35.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#mmEligibleForCollateral
	 * SettlementDetails42.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails52#mmEligibleForCollateral
	 * SettlementDetails52.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails8#mmEligibleForCollateral
	 * SettlementDetails8.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails11#mmEligibleForCollateral
	 * SettlementDetails11.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails23#mmEligibleForCollateral
	 * SettlementDetails23.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails37#mmEligibleForCollateral
	 * SettlementDetails37.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails44#mmEligibleForCollateral
	 * SettlementDetails44.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails53#mmEligibleForCollateral
	 * SettlementDetails53.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#mmEligibleForCollateral
	 * SettlementDetails43.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails10#mmEligibleForCollateral
	 * SettlementDetails10.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails29#mmEligibleForCollateral
	 * SettlementDetails29.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails26#mmEligibleForCollateral
	 * SettlementDetails26.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails65#mmEligibleForCollateral
	 * SettlementDetails65.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails14#mmEligibleForCollateral
	 * SettlementDetails14.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails41#mmEligibleForCollateral
	 * SettlementDetails41.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails61#mmEligibleForCollateral
	 * SettlementDetails61.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails59#mmEligibleForCollateral
	 * SettlementDetails59.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails36#mmEligibleForCollateral
	 * SettlementDetails36.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#mmEligibleForCollateral
	 * SettlementDetails67.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails70#mmEligibleForCollateral
	 * SettlementDetails70.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#mmEligibleForCollateral
	 * SettlementDetails68.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails69#mmEligibleForCollateral
	 * SettlementDetails69.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails71#mmEligibleForCollateral
	 * SettlementDetails71.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails72#mmEligibleForCollateral
	 * SettlementDetails72.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails73#mmEligibleForCollateral
	 * SettlementDetails73.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption103#mmEligibleForCollateralIndicator
	 * CorporateActionOption103.mmEligibleForCollateralIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption107#mmEligibleForCollateralIndicator
	 * CorporateActionOption107.mmEligibleForCollateralIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails81#mmEligibleForCollateral
	 * SettlementDetails81.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails76#mmEligibleForCollateral
	 * SettlementDetails76.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails80#mmEligibleForCollateral
	 * SettlementDetails80.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails78#mmEligibleForCollateral
	 * SettlementDetails78.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails77#mmEligibleForCollateral
	 * SettlementDetails77.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails79#mmEligibleForCollateral
	 * SettlementDetails79.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails83#mmEligibleForCollateral
	 * SettlementDetails83.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails85#mmEligibleForCollateral
	 * SettlementDetails85.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#mmEligibleForCollateral
	 * SettlementDetails93.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails90#mmEligibleForCollateral
	 * SettlementDetails90.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails96#mmEligibleForCollateral
	 * SettlementDetails96.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#mmEligibleForCollateral
	 * SettlementDetails97.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#mmEligibleForCollateral
	 * SettlementDetails94.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails95#mmEligibleForCollateral
	 * SettlementDetails95.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails98#mmEligibleForCollateral
	 * SettlementDetails98.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption118#mmEligibleForCollateralIndicator
	 * CorporateActionOption118.mmEligibleForCollateralIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails101#mmEligibleForCollateral
	 * SettlementDetails101.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption123#mmEligibleForCollateralIndicator
	 * CorporateActionOption123.mmEligibleForCollateralIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails105#mmEligibleForCollateral
	 * SettlementDetails105.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails106#mmEligibleForCollateral
	 * SettlementDetails106.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails104#mmEligibleForCollateral
	 * SettlementDetails104.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails111#mmEligibleForCollateral
	 * SettlementDetails111.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails112#mmEligibleForCollateral
	 * SettlementDetails112.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails110#mmEligibleForCollateral
	 * SettlementDetails110.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails107#mmEligibleForCollateral
	 * SettlementDetails107.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails115#mmEligibleForCollateral
	 * SettlementDetails115.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails113#mmEligibleForCollateral
	 * SettlementDetails113.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption131#mmEligibleForCollateralIndicator
	 * CorporateActionOption131.mmEligibleForCollateralIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails128#mmEligibleForCollateral
	 * SettlementDetails128.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#mmEligibleForCollateral
	 * SettlementDetails120.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#mmEligibleForCollateral
	 * SettlementDetails119.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#mmEligibleForCollateral
	 * SettlementDetails122.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails121#mmEligibleForCollateral
	 * SettlementDetails121.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption134#mmEligibleForCollateralIndicator
	 * CorporateActionOption134.mmEligibleForCollateralIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails134#mmEligibleForCollateral
	 * SettlementDetails134.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails137#mmEligibleForCollateral
	 * SettlementDetails137.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails132#mmEligibleForCollateral
	 * SettlementDetails132.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails138#mmEligibleForCollateral
	 * SettlementDetails138.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails133#mmEligibleForCollateral
	 * SettlementDetails133.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails140#mmEligibleForCollateral
	 * SettlementDetails140.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails147#mmEligibleForCollateral
	 * SettlementDetails147.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails142#mmEligibleForCollateral
	 * SettlementDetails142.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails144#mmEligibleForCollateral
	 * SettlementDetails144.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails148#mmEligibleForCollateral
	 * SettlementDetails148.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails145#mmEligibleForCollateral
	 * SettlementDetails145.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails146#mmEligibleForCollateral
	 * SettlementDetails146.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails143#mmEligibleForCollateral
	 * SettlementDetails143.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption142#mmEligibleForCollateralIndicator
	 * CorporateActionOption142.mmEligibleForCollateralIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption146#mmEligibleForCollateralIndicator
	 * CorporateActionOption146.mmEligibleForCollateralIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails151#mmEligibleForCollateral
	 * SettlementDetails151.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails152#mmEligibleForCollateral
	 * SettlementDetails152.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails155#mmEligibleForCollateral
	 * SettlementDetails155.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails156#mmEligibleForCollateral
	 * SettlementDetails156.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails157#mmEligibleForCollateral
	 * SettlementDetails157.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails158#mmEligibleForCollateral
	 * SettlementDetails158.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails160#mmEligibleForCollateral
	 * SettlementDetails160.mmEligibleForCollateral}</li>
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
	public static final MMBusinessAttribute mmEligibleForCollateral = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementDetails50.mmEligibleForCollateral, SettlementDetails51.mmEligibleForCollateral, CorporateActionOption5.mmEligibleForCollateralIndicator,
					CorporateActionOption13.mmEligibleForCollateralIndicator, CorporateActionOption25.mmEligibleForCollateralIndicator, CorporateActionOption30.mmEligibleForCollateralIndicator,
					CorporateActionOption38.mmEligibleForCollateralIndicator, CorporateActionOption47.mmEligibleForCollateralIndicator, CorporateActionOption57.mmEligibleForCollateralIndicator,
					CorporateActionOption58.mmEligibleForCollateralIndicator, SettlementDetails9.mmEligibleForCollateral, SettlementDetails17.mmEligibleForCollateral, SettlementDetails30.mmEligibleForCollateral,
					SettlementDetails32.mmEligibleForCollateral, SettlementDetails60.mmEligibleForCollateral, SettlementDetails64.mmEligibleForCollateral, SettlementDetails3.mmEligibleForCollateral,
					SettlementDetails16.mmEligibleForCollateral, SettlementDetails31.mmEligibleForCollateral, SettlementDetails40.mmEligibleForCollateral, SettlementDetails62.mmEligibleForCollateral,
					SettlementDetails63.mmEligibleForCollateral, SettlementDetails6.mmEligibleForCollateral, SettlementDetails20.mmEligibleForCollateral, SettlementDetails24.mmEligibleForCollateral,
					SettlementDetails33.mmEligibleForCollateral, SettlementDetails45.mmEligibleForCollateral, SettlementDetails54.mmEligibleForCollateral, SettlementDetails1.mmEligibleForCollateral,
					SettlementDetails19.mmEligibleForCollateral, SettlementDetails22.mmEligibleForCollateral, SettlementDetails35.mmEligibleForCollateral, SettlementDetails42.mmEligibleForCollateral,
					SettlementDetails52.mmEligibleForCollateral, SettlementDetails8.mmEligibleForCollateral, SettlementDetails11.mmEligibleForCollateral, SettlementDetails23.mmEligibleForCollateral,
					SettlementDetails37.mmEligibleForCollateral, SettlementDetails44.mmEligibleForCollateral, SettlementDetails53.mmEligibleForCollateral, SettlementDetails43.mmEligibleForCollateral,
					SettlementDetails10.mmEligibleForCollateral, SettlementDetails29.mmEligibleForCollateral, SettlementDetails26.mmEligibleForCollateral, SettlementDetails65.mmEligibleForCollateral,
					SettlementDetails14.mmEligibleForCollateral, SettlementDetails41.mmEligibleForCollateral, SettlementDetails61.mmEligibleForCollateral, SettlementDetails59.mmEligibleForCollateral,
					SettlementDetails36.mmEligibleForCollateral, SettlementDetails67.mmEligibleForCollateral, SettlementDetails70.mmEligibleForCollateral, SettlementDetails68.mmEligibleForCollateral,
					SettlementDetails69.mmEligibleForCollateral, SettlementDetails71.mmEligibleForCollateral, SettlementDetails72.mmEligibleForCollateral, SettlementDetails73.mmEligibleForCollateral,
					CorporateActionOption103.mmEligibleForCollateralIndicator, CorporateActionOption107.mmEligibleForCollateralIndicator, SettlementDetails81.mmEligibleForCollateral, SettlementDetails76.mmEligibleForCollateral,
					SettlementDetails80.mmEligibleForCollateral, SettlementDetails78.mmEligibleForCollateral, SettlementDetails77.mmEligibleForCollateral, SettlementDetails79.mmEligibleForCollateral,
					SettlementDetails83.mmEligibleForCollateral, SettlementDetails85.mmEligibleForCollateral, SettlementDetails93.mmEligibleForCollateral, SettlementDetails90.mmEligibleForCollateral,
					SettlementDetails96.mmEligibleForCollateral, SettlementDetails97.mmEligibleForCollateral, SettlementDetails94.mmEligibleForCollateral, SettlementDetails95.mmEligibleForCollateral,
					SettlementDetails98.mmEligibleForCollateral, CorporateActionOption118.mmEligibleForCollateralIndicator, SettlementDetails101.mmEligibleForCollateral, CorporateActionOption123.mmEligibleForCollateralIndicator,
					SettlementDetails105.mmEligibleForCollateral, SettlementDetails106.mmEligibleForCollateral, SettlementDetails104.mmEligibleForCollateral, SettlementDetails111.mmEligibleForCollateral,
					SettlementDetails112.mmEligibleForCollateral, SettlementDetails110.mmEligibleForCollateral, SettlementDetails107.mmEligibleForCollateral, SettlementDetails115.mmEligibleForCollateral,
					SettlementDetails113.mmEligibleForCollateral, CorporateActionOption131.mmEligibleForCollateralIndicator, SettlementDetails128.mmEligibleForCollateral, SettlementDetails120.mmEligibleForCollateral,
					SettlementDetails119.mmEligibleForCollateral, SettlementDetails122.mmEligibleForCollateral, SettlementDetails121.mmEligibleForCollateral, CorporateActionOption134.mmEligibleForCollateralIndicator,
					SettlementDetails134.mmEligibleForCollateral, SettlementDetails137.mmEligibleForCollateral, SettlementDetails132.mmEligibleForCollateral, SettlementDetails138.mmEligibleForCollateral,
					SettlementDetails133.mmEligibleForCollateral, SettlementDetails140.mmEligibleForCollateral, SettlementDetails147.mmEligibleForCollateral, SettlementDetails142.mmEligibleForCollateral,
					SettlementDetails144.mmEligibleForCollateral, SettlementDetails148.mmEligibleForCollateral, SettlementDetails145.mmEligibleForCollateral, SettlementDetails146.mmEligibleForCollateral,
					SettlementDetails143.mmEligibleForCollateral, CorporateActionOption142.mmEligibleForCollateralIndicator, CorporateActionOption146.mmEligibleForCollateralIndicator, SettlementDetails151.mmEligibleForCollateral,
					SettlementDetails152.mmEligibleForCollateral, SettlementDetails155.mmEligibleForCollateral, SettlementDetails156.mmEligibleForCollateral, SettlementDetails157.mmEligibleForCollateral,
					SettlementDetails158.mmEligibleForCollateral, SettlementDetails160.mmEligibleForCollateral);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EligibleForCollateral";
			definition = "Specifies whether securities should be included in the pool of securities eligible for collateral purposes.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlement.class.getMethod("getEligibleForCollateral", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator accruedInterestIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection32#mmAccruedInterestIndicator
	 * AmountAndDirection32.mmAccruedInterestIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection33#mmAccruedInterestIndicator
	 * AmountAndDirection33.mmAccruedInterestIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction3#mmAccruedInterestIndicator
	 * CorporateAction3.mmAccruedInterestIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction4#mmAccruedInterestIndicator
	 * CorporateAction4.mmAccruedInterestIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5#mmAccruedInterestIndicator
	 * CorporateAction5.mmAccruedInterestIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction6#mmAccruedInterestIndicator
	 * CorporateAction6.mmAccruedInterestIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction7#mmAccruedInterestIndicator
	 * CorporateAction7.mmAccruedInterestIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction8#mmAccruedInterestIndicator
	 * CorporateAction8.mmAccruedInterestIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10#mmAccruedInterestIndicator
	 * CorporateAction10.mmAccruedInterestIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction11#mmAccruedInterestIndicator
	 * CorporateAction11.mmAccruedInterestIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection2#mmAccruedInterestIndicator
	 * AmountAndDirection2.mmAccruedInterestIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection16#mmAccruedInterestIndicator
	 * AmountAndDirection16.mmAccruedInterestIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection28#mmAccruedInterestIndicator
	 * AmountAndDirection28.mmAccruedInterestIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection36#mmAccruedInterestIndicator
	 * AmountAndDirection36.mmAccruedInterestIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection37#mmAccruedInterestIndicator
	 * AmountAndDirection37.mmAccruedInterestIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#mmAccruedInterestIndicator
	 * CorporateAction12.mmAccruedInterestIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction17#mmAccruedInterestIndicator
	 * CorporateAction17.mmAccruedInterestIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection38#mmAccruedInterestIndicator
	 * AmountAndDirection38.mmAccruedInterestIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection40#mmAccruedInterestIndicator
	 * AmountAndDirection40.mmAccruedInterestIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection46#mmAccruedInterestIndicator
	 * AmountAndDirection46.mmAccruedInterestIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection45#mmAccruedInterestIndicator
	 * AmountAndDirection45.mmAccruedInterestIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction31#mmAccruedInterestIndicator
	 * CorporateAction31.mmAccruedInterestIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction40#mmAccruedInterestIndicator
	 * CorporateAction40.mmAccruedInterestIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection60#mmAccruedInterestIndicator
	 * AmountAndDirection60.mmAccruedInterestIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection85#mmAccruedInterestIndicator
	 * AmountAndDirection85.mmAccruedInterestIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection87#mmAccruedInterestIndicator
	 * AmountAndDirection87.mmAccruedInterestIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection89#mmAccruedInterestIndicator
	 * AmountAndDirection89.mmAccruedInterestIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction41#mmAccruedInterestIndicator
	 * CorporateAction41.mmAccruedInterestIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction51#mmAccruedInterestIndicator
	 * CorporateAction51.mmAccruedInterestIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection90#mmAccruedInterestIndicator
	 * AmountAndDirection90.mmAccruedInterestIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection91#mmAccruedInterestIndicator
	 * AmountAndDirection91.mmAccruedInterestIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :17B::ACRU</li>
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
	public static final MMBusinessAttribute mmAccruedInterestIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(AmountAndDirection32.mmAccruedInterestIndicator, AmountAndDirection33.mmAccruedInterestIndicator, CorporateAction3.mmAccruedInterestIndicator, CorporateAction4.mmAccruedInterestIndicator,
					CorporateAction5.mmAccruedInterestIndicator, CorporateAction6.mmAccruedInterestIndicator, CorporateAction7.mmAccruedInterestIndicator, CorporateAction8.mmAccruedInterestIndicator,
					CorporateAction10.mmAccruedInterestIndicator, CorporateAction11.mmAccruedInterestIndicator, AmountAndDirection2.mmAccruedInterestIndicator, AmountAndDirection16.mmAccruedInterestIndicator,
					AmountAndDirection28.mmAccruedInterestIndicator, AmountAndDirection36.mmAccruedInterestIndicator, AmountAndDirection37.mmAccruedInterestIndicator, CorporateAction12.mmAccruedInterestIndicator,
					CorporateAction17.mmAccruedInterestIndicator, AmountAndDirection38.mmAccruedInterestIndicator, AmountAndDirection40.mmAccruedInterestIndicator, AmountAndDirection46.mmAccruedInterestIndicator,
					AmountAndDirection45.mmAccruedInterestIndicator, CorporateAction31.mmAccruedInterestIndicator, CorporateAction40.mmAccruedInterestIndicator, AmountAndDirection60.mmAccruedInterestIndicator,
					AmountAndDirection85.mmAccruedInterestIndicator, AmountAndDirection87.mmAccruedInterestIndicator, AmountAndDirection89.mmAccruedInterestIndicator, CorporateAction41.mmAccruedInterestIndicator,
					CorporateAction51.mmAccruedInterestIndicator, AmountAndDirection90.mmAccruedInterestIndicator, AmountAndDirection91.mmAccruedInterestIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":17B::ACRU"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccruedInterestIndicator";
			definition = "Indicates whether the net proceeds include interest accrued on the financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlement.class.getMethod("getAccruedInterestIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PreConfirmationCode preConfirmation;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters2#mmPreConfirmation
	 * AdditionalParameters2.mmPreConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters6#mmPreConfirmation
	 * AdditionalParameters6.mmPreConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters12#mmPreConfirmation
	 * AdditionalParameters12.mmPreConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters13#mmPreConfirmation
	 * AdditionalParameters13.mmPreConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters18#mmPreConfirmation
	 * AdditionalParameters18.mmPreConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters19#mmPreConfirmation
	 * AdditionalParameters19.mmPreConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters17#mmPreConfirmation
	 * AdditionalParameters17.mmPreConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters20#mmPreConfirmation
	 * AdditionalParameters20.mmPreConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters4#mmPreConfirmation
	 * AdditionalParameters4.mmPreConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters5#mmPreConfirmation
	 * AdditionalParameters5.mmPreConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters14#mmPreConfirmation
	 * AdditionalParameters14.mmPreConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters15#mmPreConfirmation
	 * AdditionalParameters15.mmPreConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters23#mmPreConfirmation
	 * AdditionalParameters23.mmPreConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters24#mmPreConfirmation
	 * AdditionalParameters24.mmPreConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters22#mmPreConfirmation
	 * AdditionalParameters22.mmPreConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters26#mmPreConfirmation
	 * AdditionalParameters26.mmPreConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters28#mmPreConfirmation
	 * AdditionalParameters28.mmPreConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters27#mmPreConfirmation
	 * AdditionalParameters27.mmPreConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters29#mmPreConfirmation
	 * AdditionalParameters29.mmPreConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters30#mmPreConfirmation
	 * AdditionalParameters30.mmPreConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters31#mmPreConfirmation
	 * AdditionalParameters31.mmPreConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters32#mmPreConfirmation
	 * AdditionalParameters32.mmPreConfirmation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::PREC</li>
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
	public static final MMBusinessAttribute mmPreConfirmation = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(AdditionalParameters2.mmPreConfirmation, AdditionalParameters6.mmPreConfirmation, AdditionalParameters12.mmPreConfirmation, AdditionalParameters13.mmPreConfirmation,
					AdditionalParameters18.mmPreConfirmation, AdditionalParameters19.mmPreConfirmation, AdditionalParameters17.mmPreConfirmation, AdditionalParameters20.mmPreConfirmation, AdditionalParameters4.mmPreConfirmation,
					AdditionalParameters5.mmPreConfirmation, AdditionalParameters14.mmPreConfirmation, AdditionalParameters15.mmPreConfirmation, AdditionalParameters23.mmPreConfirmation, AdditionalParameters24.mmPreConfirmation,
					AdditionalParameters22.mmPreConfirmation, AdditionalParameters26.mmPreConfirmation, AdditionalParameters28.mmPreConfirmation, AdditionalParameters27.mmPreConfirmation, AdditionalParameters29.mmPreConfirmation,
					AdditionalParameters30.mmPreConfirmation, AdditionalParameters31.mmPreConfirmation, AdditionalParameters32.mmPreConfirmation);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::PREC"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PreConfirmation";
			definition = "Pre-confirmation of the cash transfer pending the securities transfer, or vice versa.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PreConfirmationCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlement.class.getMethod("getPreConfirmation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator securitiesRealTimeGrossSettlement;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.choice.SecuritiesRTGS1Choice#mmIndicator
	 * SecuritiesRTGS1Choice.mmIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesRTGS1Choice#mmProprietary
	 * SecuritiesRTGS1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails9#mmSecuritiesRTGS
	 * SettlementDetails9.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesRTGS2Choice#mmIndicator
	 * SecuritiesRTGS2Choice.mmIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesRTGS2Choice#mmProprietary
	 * SecuritiesRTGS2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails17#mmSecuritiesRTGS
	 * SettlementDetails17.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails30#mmSecuritiesRTGS
	 * SettlementDetails30.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails32#mmSecuritiesRTGS
	 * SettlementDetails32.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails60#mmSecuritiesRTGS
	 * SettlementDetails60.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails64#mmSecuritiesRTGS
	 * SettlementDetails64.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails3#mmSecuritiesRTGS
	 * SettlementDetails3.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails16#mmSecuritiesRTGS
	 * SettlementDetails16.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails31#mmSecuritiesRTGS
	 * SettlementDetails31.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails40#mmSecuritiesRTGS
	 * SettlementDetails40.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails62#mmSecuritiesRTGS
	 * SettlementDetails62.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails63#mmSecuritiesRTGS
	 * SettlementDetails63.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails1#mmSecuritiesRTGS
	 * RequestDetails1.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails2#mmSecuritiesRTGS
	 * RequestDetails2.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails6#mmSecuritiesRTGS
	 * RequestDetails6.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails7#mmSecuritiesRTGS
	 * RequestDetails7.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails8#mmSecuritiesRTGS
	 * RequestDetails8.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails9#mmSecuritiesRTGS
	 * RequestDetails9.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails11#mmSecuritiesRTGS
	 * RequestDetails11.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails12#mmSecuritiesRTGS
	 * RequestDetails12.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails6#mmSecuritiesRTGS
	 * SettlementDetails6.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails20#mmSecuritiesRTGS
	 * SettlementDetails20.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails24#mmSecuritiesRTGS
	 * SettlementDetails24.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails33#mmSecuritiesRTGS
	 * SettlementDetails33.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails45#mmSecuritiesRTGS
	 * SettlementDetails45.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails54#mmSecuritiesRTGS
	 * SettlementDetails54.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails1#mmSecuritiesRTGS
	 * SettlementDetails1.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails19#mmSecuritiesRTGS
	 * SettlementDetails19.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails22#mmSecuritiesRTGS
	 * SettlementDetails22.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails35#mmSecuritiesRTGS
	 * SettlementDetails35.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#mmSecuritiesRTGS
	 * SettlementDetails42.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails52#mmSecuritiesRTGS
	 * SettlementDetails52.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails8#mmSecuritiesRTGS
	 * SettlementDetails8.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails11#mmSecuritiesRTGS
	 * SettlementDetails11.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails23#mmSecuritiesRTGS
	 * SettlementDetails23.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails37#mmSecuritiesRTGS
	 * SettlementDetails37.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails44#mmSecuritiesRTGS
	 * SettlementDetails44.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails53#mmSecuritiesRTGS
	 * SettlementDetails53.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails7#mmSecuritiesRTGS
	 * SettlementDetails7.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails12#mmSecuritiesRTGS
	 * SettlementDetails12.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails28#mmSecuritiesRTGS
	 * SettlementDetails28.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails38#mmSecuritiesRTGS
	 * SettlementDetails38.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails47#mmSecuritiesRTGS
	 * SettlementDetails47.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails56#mmSecuritiesRTGS
	 * SettlementDetails56.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails2#mmSecuritiesRTGS
	 * SettlementDetails2.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails13#mmSecuritiesRTGS
	 * SettlementDetails13.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails27#mmSecuritiesRTGS
	 * SettlementDetails27.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails39#mmSecuritiesRTGS
	 * SettlementDetails39.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails48#mmSecuritiesRTGS
	 * SettlementDetails48.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails57#mmSecuritiesRTGS
	 * SettlementDetails57.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesRTGS3Choice#mmIndicator
	 * SecuritiesRTGS3Choice.mmIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesRTGS3Choice#mmProprietary
	 * SecuritiesRTGS3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#mmSecuritiesRTGS
	 * SettlementDetails43.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails4#mmSecuritiesRTGS
	 * SettlementDetails4.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails10#mmSecuritiesRTGS
	 * SettlementDetails10.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails29#mmSecuritiesRTGS
	 * SettlementDetails29.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails5#mmSecuritiesRTGS
	 * SettlementDetails5.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails25#mmSecuritiesRTGS
	 * SettlementDetails25.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails26#mmSecuritiesRTGS
	 * SettlementDetails26.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails65#mmSecuritiesRTGS
	 * SettlementDetails65.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails14#mmSecuritiesRTGS
	 * SettlementDetails14.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails41#mmSecuritiesRTGS
	 * SettlementDetails41.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails61#mmSecuritiesRTGS
	 * SettlementDetails61.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails59#mmSecuritiesRTGS
	 * SettlementDetails59.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails15#mmSecuritiesRTGS
	 * SettlementDetails15.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails34#mmSecuritiesRTGS
	 * SettlementDetails34.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails49#mmSecuritiesRTGS
	 * SettlementDetails49.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails58#mmSecuritiesRTGS
	 * SettlementDetails58.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails36#mmSecuritiesRTGS
	 * SettlementDetails36.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails18#mmSecuritiesRTGS
	 * SettlementDetails18.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails66#mmSecuritiesRTGS
	 * SettlementDetails66.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#mmSecuritiesRTGS
	 * SettlementDetails67.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails70#mmSecuritiesRTGS
	 * SettlementDetails70.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails69#mmSecuritiesRTGS
	 * SettlementDetails69.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails71#mmSecuritiesRTGS
	 * SettlementDetails71.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails72#mmSecuritiesRTGS
	 * SettlementDetails72.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails75#mmSecuritiesRTGS
	 * SettlementDetails75.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails73#mmSecuritiesRTGS
	 * SettlementDetails73.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails74#mmSecuritiesRTGS
	 * SettlementDetails74.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails13#mmSecuritiesRTGS
	 * RequestDetails13.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails81#mmSecuritiesRTGS
	 * SettlementDetails81.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails76#mmSecuritiesRTGS
	 * SettlementDetails76.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails80#mmSecuritiesRTGS
	 * SettlementDetails80.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails78#mmSecuritiesRTGS
	 * SettlementDetails78.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails77#mmSecuritiesRTGS
	 * SettlementDetails77.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails14#mmSecuritiesRTGS
	 * RequestDetails14.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails79#mmSecuritiesRTGS
	 * SettlementDetails79.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails87#mmSecuritiesRTGS
	 * SettlementDetails87.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails86#mmSecuritiesRTGS
	 * SettlementDetails86.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails85#mmSecuritiesRTGS
	 * SettlementDetails85.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#mmSecuritiesRTGS
	 * SettlementDetails93.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails15#mmSecuritiesRTGS
	 * RequestDetails15.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails90#mmSecuritiesRTGS
	 * SettlementDetails90.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails96#mmSecuritiesRTGS
	 * SettlementDetails96.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#mmSecuritiesRTGS
	 * SettlementDetails97.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails99#mmSecuritiesRTGS
	 * SettlementDetails99.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails100#mmSecuritiesRTGS
	 * SettlementDetails100.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesRTGS4Choice#mmIndicator
	 * SecuritiesRTGS4Choice.mmIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesRTGS4Choice#mmProprietary
	 * SecuritiesRTGS4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails95#mmSecuritiesRTGS
	 * SettlementDetails95.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails91#mmSecuritiesRTGS
	 * SettlementDetails91.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails92#mmSecuritiesRTGS
	 * SettlementDetails92.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails98#mmSecuritiesRTGS
	 * SettlementDetails98.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails101#mmSecuritiesRTGS
	 * SettlementDetails101.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails105#mmSecuritiesRTGS
	 * SettlementDetails105.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails106#mmSecuritiesRTGS
	 * SettlementDetails106.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails104#mmSecuritiesRTGS
	 * SettlementDetails104.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails111#mmSecuritiesRTGS
	 * SettlementDetails111.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails16#mmSecuritiesRTGS
	 * RequestDetails16.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails112#mmSecuritiesRTGS
	 * SettlementDetails112.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails110#mmSecuritiesRTGS
	 * SettlementDetails110.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails108#mmSecuritiesRTGS
	 * SettlementDetails108.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails103#mmSecuritiesRTGS
	 * SettlementDetails103.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails107#mmSecuritiesRTGS
	 * SettlementDetails107.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails115#mmSecuritiesRTGS
	 * SettlementDetails115.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails117#mmSecuritiesRTGS
	 * SettlementDetails117.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesRTGS5Choice#mmIndicator
	 * SecuritiesRTGS5Choice.mmIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesRTGS5Choice#mmProprietary
	 * SecuritiesRTGS5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails116#mmSecuritiesRTGS
	 * SettlementDetails116.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails18#mmSecuritiesRTGS
	 * RequestDetails18.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails128#mmSecuritiesRTGS
	 * SettlementDetails128.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#mmSecuritiesRTGS
	 * SettlementDetails120.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#mmSecuritiesRTGS
	 * SettlementDetails119.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails125#mmSecuritiesRTGS
	 * SettlementDetails125.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails126#mmSecuritiesRTGS
	 * SettlementDetails126.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails127#mmSecuritiesRTGS
	 * SettlementDetails127.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails121#mmSecuritiesRTGS
	 * SettlementDetails121.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails134#mmSecuritiesRTGS
	 * SettlementDetails134.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails137#mmSecuritiesRTGS
	 * SettlementDetails137.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails132#mmSecuritiesRTGS
	 * SettlementDetails132.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails130#mmSecuritiesRTGS
	 * SettlementDetails130.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails131#mmSecuritiesRTGS
	 * SettlementDetails131.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails133#mmSecuritiesRTGS
	 * SettlementDetails133.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails139#mmSecuritiesRTGS
	 * SettlementDetails139.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails140#mmSecuritiesRTGS
	 * SettlementDetails140.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails147#mmSecuritiesRTGS
	 * SettlementDetails147.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails142#mmSecuritiesRTGS
	 * SettlementDetails142.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails144#mmSecuritiesRTGS
	 * SettlementDetails144.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails148#mmSecuritiesRTGS
	 * SettlementDetails148.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails141#mmSecuritiesRTGS
	 * SettlementDetails141.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails145#mmSecuritiesRTGS
	 * SettlementDetails145.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails143#mmSecuritiesRTGS
	 * SettlementDetails143.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails149#mmSecuritiesRTGS
	 * SettlementDetails149.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails150#mmSecuritiesRTGS
	 * SettlementDetails150.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails151#mmSecuritiesRTGS
	 * SettlementDetails151.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails152#mmSecuritiesRTGS
	 * SettlementDetails152.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails153#mmSecuritiesRTGS
	 * SettlementDetails153.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails155#mmSecuritiesRTGS
	 * SettlementDetails155.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails156#mmSecuritiesRTGS
	 * SettlementDetails156.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails157#mmSecuritiesRTGS
	 * SettlementDetails157.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails160#mmSecuritiesRTGS
	 * SettlementDetails160.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails161#mmSecuritiesRTGS
	 * SettlementDetails161.mmSecuritiesRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails162#mmSecuritiesRTGS
	 * SettlementDetails162.mmSecuritiesRTGS}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::RTGS</li>
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
	public static final MMBusinessAttribute mmSecuritiesRealTimeGrossSettlement = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SecuritiesRTGS1Choice.mmIndicator, SecuritiesRTGS1Choice.mmProprietary, SettlementDetails9.mmSecuritiesRTGS, SecuritiesRTGS2Choice.mmIndicator, SecuritiesRTGS2Choice.mmProprietary,
					SettlementDetails17.mmSecuritiesRTGS, SettlementDetails30.mmSecuritiesRTGS, SettlementDetails32.mmSecuritiesRTGS, SettlementDetails60.mmSecuritiesRTGS, SettlementDetails64.mmSecuritiesRTGS,
					SettlementDetails3.mmSecuritiesRTGS, SettlementDetails16.mmSecuritiesRTGS, SettlementDetails31.mmSecuritiesRTGS, SettlementDetails40.mmSecuritiesRTGS, SettlementDetails62.mmSecuritiesRTGS,
					SettlementDetails63.mmSecuritiesRTGS, RequestDetails1.mmSecuritiesRTGS, RequestDetails2.mmSecuritiesRTGS, RequestDetails6.mmSecuritiesRTGS, RequestDetails7.mmSecuritiesRTGS, RequestDetails8.mmSecuritiesRTGS,
					RequestDetails9.mmSecuritiesRTGS, RequestDetails11.mmSecuritiesRTGS, RequestDetails12.mmSecuritiesRTGS, SettlementDetails6.mmSecuritiesRTGS, SettlementDetails20.mmSecuritiesRTGS, SettlementDetails24.mmSecuritiesRTGS,
					SettlementDetails33.mmSecuritiesRTGS, SettlementDetails45.mmSecuritiesRTGS, SettlementDetails54.mmSecuritiesRTGS, SettlementDetails1.mmSecuritiesRTGS, SettlementDetails19.mmSecuritiesRTGS,
					SettlementDetails22.mmSecuritiesRTGS, SettlementDetails35.mmSecuritiesRTGS, SettlementDetails42.mmSecuritiesRTGS, SettlementDetails52.mmSecuritiesRTGS, SettlementDetails8.mmSecuritiesRTGS,
					SettlementDetails11.mmSecuritiesRTGS, SettlementDetails23.mmSecuritiesRTGS, SettlementDetails37.mmSecuritiesRTGS, SettlementDetails44.mmSecuritiesRTGS, SettlementDetails53.mmSecuritiesRTGS,
					SettlementDetails7.mmSecuritiesRTGS, SettlementDetails12.mmSecuritiesRTGS, SettlementDetails28.mmSecuritiesRTGS, SettlementDetails38.mmSecuritiesRTGS, SettlementDetails47.mmSecuritiesRTGS,
					SettlementDetails56.mmSecuritiesRTGS, SettlementDetails2.mmSecuritiesRTGS, SettlementDetails13.mmSecuritiesRTGS, SettlementDetails27.mmSecuritiesRTGS, SettlementDetails39.mmSecuritiesRTGS,
					SettlementDetails48.mmSecuritiesRTGS, SettlementDetails57.mmSecuritiesRTGS, SecuritiesRTGS3Choice.mmIndicator, SecuritiesRTGS3Choice.mmProprietary, SettlementDetails43.mmSecuritiesRTGS,
					SettlementDetails4.mmSecuritiesRTGS, SettlementDetails10.mmSecuritiesRTGS, SettlementDetails29.mmSecuritiesRTGS, SettlementDetails5.mmSecuritiesRTGS, SettlementDetails25.mmSecuritiesRTGS,
					SettlementDetails26.mmSecuritiesRTGS, SettlementDetails65.mmSecuritiesRTGS, SettlementDetails14.mmSecuritiesRTGS, SettlementDetails41.mmSecuritiesRTGS, SettlementDetails61.mmSecuritiesRTGS,
					SettlementDetails59.mmSecuritiesRTGS, SettlementDetails15.mmSecuritiesRTGS, SettlementDetails34.mmSecuritiesRTGS, SettlementDetails49.mmSecuritiesRTGS, SettlementDetails58.mmSecuritiesRTGS,
					SettlementDetails36.mmSecuritiesRTGS, SettlementDetails18.mmSecuritiesRTGS, SettlementDetails66.mmSecuritiesRTGS, SettlementDetails67.mmSecuritiesRTGS, SettlementDetails70.mmSecuritiesRTGS,
					SettlementDetails69.mmSecuritiesRTGS, SettlementDetails71.mmSecuritiesRTGS, SettlementDetails72.mmSecuritiesRTGS, SettlementDetails75.mmSecuritiesRTGS, SettlementDetails73.mmSecuritiesRTGS,
					SettlementDetails74.mmSecuritiesRTGS, RequestDetails13.mmSecuritiesRTGS, SettlementDetails81.mmSecuritiesRTGS, SettlementDetails76.mmSecuritiesRTGS, SettlementDetails80.mmSecuritiesRTGS,
					SettlementDetails78.mmSecuritiesRTGS, SettlementDetails77.mmSecuritiesRTGS, RequestDetails14.mmSecuritiesRTGS, SettlementDetails79.mmSecuritiesRTGS, SettlementDetails87.mmSecuritiesRTGS,
					SettlementDetails86.mmSecuritiesRTGS, SettlementDetails85.mmSecuritiesRTGS, SettlementDetails93.mmSecuritiesRTGS, RequestDetails15.mmSecuritiesRTGS, SettlementDetails90.mmSecuritiesRTGS,
					SettlementDetails96.mmSecuritiesRTGS, SettlementDetails97.mmSecuritiesRTGS, SettlementDetails99.mmSecuritiesRTGS, SettlementDetails100.mmSecuritiesRTGS, SecuritiesRTGS4Choice.mmIndicator,
					SecuritiesRTGS4Choice.mmProprietary, SettlementDetails95.mmSecuritiesRTGS, SettlementDetails91.mmSecuritiesRTGS, SettlementDetails92.mmSecuritiesRTGS, SettlementDetails98.mmSecuritiesRTGS,
					SettlementDetails101.mmSecuritiesRTGS, SettlementDetails105.mmSecuritiesRTGS, SettlementDetails106.mmSecuritiesRTGS, SettlementDetails104.mmSecuritiesRTGS, SettlementDetails111.mmSecuritiesRTGS,
					RequestDetails16.mmSecuritiesRTGS, SettlementDetails112.mmSecuritiesRTGS, SettlementDetails110.mmSecuritiesRTGS, SettlementDetails108.mmSecuritiesRTGS, SettlementDetails103.mmSecuritiesRTGS,
					SettlementDetails107.mmSecuritiesRTGS, SettlementDetails115.mmSecuritiesRTGS, SettlementDetails117.mmSecuritiesRTGS, SecuritiesRTGS5Choice.mmIndicator, SecuritiesRTGS5Choice.mmProprietary,
					SettlementDetails116.mmSecuritiesRTGS, RequestDetails18.mmSecuritiesRTGS, SettlementDetails128.mmSecuritiesRTGS, SettlementDetails120.mmSecuritiesRTGS, SettlementDetails119.mmSecuritiesRTGS,
					SettlementDetails125.mmSecuritiesRTGS, SettlementDetails126.mmSecuritiesRTGS, SettlementDetails127.mmSecuritiesRTGS, SettlementDetails121.mmSecuritiesRTGS, SettlementDetails134.mmSecuritiesRTGS,
					SettlementDetails137.mmSecuritiesRTGS, SettlementDetails132.mmSecuritiesRTGS, SettlementDetails130.mmSecuritiesRTGS, SettlementDetails131.mmSecuritiesRTGS, SettlementDetails133.mmSecuritiesRTGS,
					SettlementDetails139.mmSecuritiesRTGS, SettlementDetails140.mmSecuritiesRTGS, SettlementDetails147.mmSecuritiesRTGS, SettlementDetails142.mmSecuritiesRTGS, SettlementDetails144.mmSecuritiesRTGS,
					SettlementDetails148.mmSecuritiesRTGS, SettlementDetails141.mmSecuritiesRTGS, SettlementDetails145.mmSecuritiesRTGS, SettlementDetails143.mmSecuritiesRTGS, SettlementDetails149.mmSecuritiesRTGS,
					SettlementDetails150.mmSecuritiesRTGS, SettlementDetails151.mmSecuritiesRTGS, SettlementDetails152.mmSecuritiesRTGS, SettlementDetails153.mmSecuritiesRTGS, SettlementDetails155.mmSecuritiesRTGS,
					SettlementDetails156.mmSecuritiesRTGS, SettlementDetails157.mmSecuritiesRTGS, SettlementDetails160.mmSecuritiesRTGS, SettlementDetails161.mmSecuritiesRTGS, SettlementDetails162.mmSecuritiesRTGS);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::RTGS"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesRealTimeGrossSettlement";
			definition = "Specifies whether the settlement transaction is to be settled through an RTGS or a non RTGS system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlement.class.getMethod("getSecuritiesRealTimeGrossSettlement", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected BlockTradeCode blockTrade;
	/**
	 * 
	 <p>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BlockTrade1Choice#mmCode
	 * BlockTrade1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BlockTrade1Choice#mmProprietary
	 * BlockTrade1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails9#mmBlockTrade
	 * SettlementDetails9.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BlockTrade2Choice#mmCode
	 * BlockTrade2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BlockTrade2Choice#mmProprietary
	 * BlockTrade2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails17#mmBlockTrade
	 * SettlementDetails17.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails30#mmBlockTrade
	 * SettlementDetails30.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails32#mmBlockTrade
	 * SettlementDetails32.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails60#mmBlockTrade
	 * SettlementDetails60.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails64#mmBlockTrade
	 * SettlementDetails64.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails3#mmBlockTrade
	 * SettlementDetails3.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails16#mmBlockTrade
	 * SettlementDetails16.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails31#mmBlockTrade
	 * SettlementDetails31.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails40#mmBlockTrade
	 * SettlementDetails40.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails62#mmBlockTrade
	 * SettlementDetails62.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails63#mmBlockTrade
	 * SettlementDetails63.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails6#mmBlockTrade
	 * SettlementDetails6.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails20#mmBlockTrade
	 * SettlementDetails20.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails24#mmBlockTrade
	 * SettlementDetails24.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails33#mmBlockTrade
	 * SettlementDetails33.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails45#mmBlockTrade
	 * SettlementDetails45.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails54#mmBlockTrade
	 * SettlementDetails54.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails1#mmBlockTrade
	 * SettlementDetails1.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails19#mmBlockTrade
	 * SettlementDetails19.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails22#mmBlockTrade
	 * SettlementDetails22.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails35#mmBlockTrade
	 * SettlementDetails35.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#mmBlockTrade
	 * SettlementDetails42.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails52#mmBlockTrade
	 * SettlementDetails52.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails8#mmBlockTrade
	 * SettlementDetails8.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails11#mmBlockTrade
	 * SettlementDetails11.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails23#mmBlockTrade
	 * SettlementDetails23.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails37#mmBlockTrade
	 * SettlementDetails37.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails44#mmBlockTrade
	 * SettlementDetails44.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails53#mmBlockTrade
	 * SettlementDetails53.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails7#mmBlockTrade
	 * SettlementDetails7.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails12#mmBlockTrade
	 * SettlementDetails12.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails28#mmBlockTrade
	 * SettlementDetails28.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails38#mmBlockTrade
	 * SettlementDetails38.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails47#mmBlockTrade
	 * SettlementDetails47.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails56#mmBlockTrade
	 * SettlementDetails56.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails2#mmBlockTrade
	 * SettlementDetails2.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails13#mmBlockTrade
	 * SettlementDetails13.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails27#mmBlockTrade
	 * SettlementDetails27.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails39#mmBlockTrade
	 * SettlementDetails39.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails48#mmBlockTrade
	 * SettlementDetails48.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails57#mmBlockTrade
	 * SettlementDetails57.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BlockTrade3Choice#mmCode
	 * BlockTrade3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BlockTrade3Choice#mmProprietary
	 * BlockTrade3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#mmBlockTrade
	 * SettlementDetails43.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails10#mmBlockTrade
	 * SettlementDetails10.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails29#mmBlockTrade
	 * SettlementDetails29.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails26#mmBlockTrade
	 * SettlementDetails26.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails65#mmBlockTrade
	 * SettlementDetails65.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails14#mmBlockTrade
	 * SettlementDetails14.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails41#mmBlockTrade
	 * SettlementDetails41.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails61#mmBlockTrade
	 * SettlementDetails61.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails59#mmBlockTrade
	 * SettlementDetails59.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails36#mmBlockTrade
	 * SettlementDetails36.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails66#mmBlockTrade
	 * SettlementDetails66.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#mmBlockTrade
	 * SettlementDetails67.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails70#mmBlockTrade
	 * SettlementDetails70.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails69#mmBlockTrade
	 * SettlementDetails69.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails71#mmBlockTrade
	 * SettlementDetails71.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails72#mmBlockTrade
	 * SettlementDetails72.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails75#mmBlockTrade
	 * SettlementDetails75.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails73#mmBlockTrade
	 * SettlementDetails73.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails74#mmBlockTrade
	 * SettlementDetails74.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails81#mmBlockTrade
	 * SettlementDetails81.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails76#mmBlockTrade
	 * SettlementDetails76.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails80#mmBlockTrade
	 * SettlementDetails80.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails78#mmBlockTrade
	 * SettlementDetails78.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails77#mmBlockTrade
	 * SettlementDetails77.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails79#mmBlockTrade
	 * SettlementDetails79.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails87#mmBlockTrade
	 * SettlementDetails87.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails86#mmBlockTrade
	 * SettlementDetails86.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails85#mmBlockTrade
	 * SettlementDetails85.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#mmBlockTrade
	 * SettlementDetails93.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails90#mmBlockTrade
	 * SettlementDetails90.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails96#mmBlockTrade
	 * SettlementDetails96.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#mmBlockTrade
	 * SettlementDetails97.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BlockTrade4Choice#mmCode
	 * BlockTrade4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BlockTrade4Choice#mmProprietary
	 * BlockTrade4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails95#mmBlockTrade
	 * SettlementDetails95.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails91#mmBlockTrade
	 * SettlementDetails91.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails92#mmBlockTrade
	 * SettlementDetails92.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails98#mmBlockTrade
	 * SettlementDetails98.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails101#mmBlockTrade
	 * SettlementDetails101.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails105#mmBlockTrade
	 * SettlementDetails105.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails106#mmBlockTrade
	 * SettlementDetails106.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails104#mmBlockTrade
	 * SettlementDetails104.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails111#mmBlockTrade
	 * SettlementDetails111.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails112#mmBlockTrade
	 * SettlementDetails112.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails110#mmBlockTrade
	 * SettlementDetails110.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails107#mmBlockTrade
	 * SettlementDetails107.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails115#mmBlockTrade
	 * SettlementDetails115.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails117#mmBlockTrade
	 * SettlementDetails117.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BlockTrade5Choice#mmCode
	 * BlockTrade5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BlockTrade5Choice#mmProprietary
	 * BlockTrade5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails116#mmBlockTrade
	 * SettlementDetails116.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails128#mmBlockTrade
	 * SettlementDetails128.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#mmBlockTrade
	 * SettlementDetails120.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#mmBlockTrade
	 * SettlementDetails119.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails126#mmBlockTrade
	 * SettlementDetails126.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails127#mmBlockTrade
	 * SettlementDetails127.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails121#mmBlockTrade
	 * SettlementDetails121.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails134#mmBlockTrade
	 * SettlementDetails134.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails137#mmBlockTrade
	 * SettlementDetails137.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails132#mmBlockTrade
	 * SettlementDetails132.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails130#mmBlockTrade
	 * SettlementDetails130.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails133#mmBlockTrade
	 * SettlementDetails133.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails139#mmBlockTrade
	 * SettlementDetails139.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails140#mmBlockTrade
	 * SettlementDetails140.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails147#mmBlockTrade
	 * SettlementDetails147.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails142#mmBlockTrade
	 * SettlementDetails142.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails144#mmBlockTrade
	 * SettlementDetails144.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails148#mmBlockTrade
	 * SettlementDetails148.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails145#mmBlockTrade
	 * SettlementDetails145.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails143#mmBlockTrade
	 * SettlementDetails143.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails149#mmBlockTrade
	 * SettlementDetails149.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails150#mmBlockTrade
	 * SettlementDetails150.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails151#mmBlockTrade
	 * SettlementDetails151.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails152#mmBlockTrade
	 * SettlementDetails152.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails155#mmBlockTrade
	 * SettlementDetails155.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails156#mmBlockTrade
	 * SettlementDetails156.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails157#mmBlockTrade
	 * SettlementDetails157.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails160#mmBlockTrade
	 * SettlementDetails160.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails161#mmBlockTrade
	 * SettlementDetails161.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails162#mmBlockTrade
	 * SettlementDetails162.mmBlockTrade}</li>
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
	public static final MMBusinessAttribute mmBlockTrade = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(BlockTrade1Choice.mmCode, BlockTrade1Choice.mmProprietary, SettlementDetails9.mmBlockTrade, BlockTrade2Choice.mmCode, BlockTrade2Choice.mmProprietary, SettlementDetails17.mmBlockTrade,
					SettlementDetails30.mmBlockTrade, SettlementDetails32.mmBlockTrade, SettlementDetails60.mmBlockTrade, SettlementDetails64.mmBlockTrade, SettlementDetails3.mmBlockTrade, SettlementDetails16.mmBlockTrade,
					SettlementDetails31.mmBlockTrade, SettlementDetails40.mmBlockTrade, SettlementDetails62.mmBlockTrade, SettlementDetails63.mmBlockTrade, SettlementDetails6.mmBlockTrade, SettlementDetails20.mmBlockTrade,
					SettlementDetails24.mmBlockTrade, SettlementDetails33.mmBlockTrade, SettlementDetails45.mmBlockTrade, SettlementDetails54.mmBlockTrade, SettlementDetails1.mmBlockTrade, SettlementDetails19.mmBlockTrade,
					SettlementDetails22.mmBlockTrade, SettlementDetails35.mmBlockTrade, SettlementDetails42.mmBlockTrade, SettlementDetails52.mmBlockTrade, SettlementDetails8.mmBlockTrade, SettlementDetails11.mmBlockTrade,
					SettlementDetails23.mmBlockTrade, SettlementDetails37.mmBlockTrade, SettlementDetails44.mmBlockTrade, SettlementDetails53.mmBlockTrade, SettlementDetails7.mmBlockTrade, SettlementDetails12.mmBlockTrade,
					SettlementDetails28.mmBlockTrade, SettlementDetails38.mmBlockTrade, SettlementDetails47.mmBlockTrade, SettlementDetails56.mmBlockTrade, SettlementDetails2.mmBlockTrade, SettlementDetails13.mmBlockTrade,
					SettlementDetails27.mmBlockTrade, SettlementDetails39.mmBlockTrade, SettlementDetails48.mmBlockTrade, SettlementDetails57.mmBlockTrade, BlockTrade3Choice.mmCode, BlockTrade3Choice.mmProprietary,
					SettlementDetails43.mmBlockTrade, SettlementDetails10.mmBlockTrade, SettlementDetails29.mmBlockTrade, SettlementDetails26.mmBlockTrade, SettlementDetails65.mmBlockTrade, SettlementDetails14.mmBlockTrade,
					SettlementDetails41.mmBlockTrade, SettlementDetails61.mmBlockTrade, SettlementDetails59.mmBlockTrade, SettlementDetails36.mmBlockTrade, SettlementDetails66.mmBlockTrade, SettlementDetails67.mmBlockTrade,
					SettlementDetails70.mmBlockTrade, SettlementDetails69.mmBlockTrade, SettlementDetails71.mmBlockTrade, SettlementDetails72.mmBlockTrade, SettlementDetails75.mmBlockTrade, SettlementDetails73.mmBlockTrade,
					SettlementDetails74.mmBlockTrade, SettlementDetails81.mmBlockTrade, SettlementDetails76.mmBlockTrade, SettlementDetails80.mmBlockTrade, SettlementDetails78.mmBlockTrade, SettlementDetails77.mmBlockTrade,
					SettlementDetails79.mmBlockTrade, SettlementDetails87.mmBlockTrade, SettlementDetails86.mmBlockTrade, SettlementDetails85.mmBlockTrade, SettlementDetails93.mmBlockTrade, SettlementDetails90.mmBlockTrade,
					SettlementDetails96.mmBlockTrade, SettlementDetails97.mmBlockTrade, BlockTrade4Choice.mmCode, BlockTrade4Choice.mmProprietary, SettlementDetails95.mmBlockTrade, SettlementDetails91.mmBlockTrade,
					SettlementDetails92.mmBlockTrade, SettlementDetails98.mmBlockTrade, SettlementDetails101.mmBlockTrade, SettlementDetails105.mmBlockTrade, SettlementDetails106.mmBlockTrade, SettlementDetails104.mmBlockTrade,
					SettlementDetails111.mmBlockTrade, SettlementDetails112.mmBlockTrade, SettlementDetails110.mmBlockTrade, SettlementDetails107.mmBlockTrade, SettlementDetails115.mmBlockTrade, SettlementDetails117.mmBlockTrade,
					BlockTrade5Choice.mmCode, BlockTrade5Choice.mmProprietary, SettlementDetails116.mmBlockTrade, SettlementDetails128.mmBlockTrade, SettlementDetails120.mmBlockTrade, SettlementDetails119.mmBlockTrade,
					SettlementDetails126.mmBlockTrade, SettlementDetails127.mmBlockTrade, SettlementDetails121.mmBlockTrade, SettlementDetails134.mmBlockTrade, SettlementDetails137.mmBlockTrade, SettlementDetails132.mmBlockTrade,
					SettlementDetails130.mmBlockTrade, SettlementDetails133.mmBlockTrade, SettlementDetails139.mmBlockTrade, SettlementDetails140.mmBlockTrade, SettlementDetails147.mmBlockTrade, SettlementDetails142.mmBlockTrade,
					SettlementDetails144.mmBlockTrade, SettlementDetails148.mmBlockTrade, SettlementDetails145.mmBlockTrade, SettlementDetails143.mmBlockTrade, SettlementDetails149.mmBlockTrade, SettlementDetails150.mmBlockTrade,
					SettlementDetails151.mmBlockTrade, SettlementDetails152.mmBlockTrade, SettlementDetails155.mmBlockTrade, SettlementDetails156.mmBlockTrade, SettlementDetails157.mmBlockTrade, SettlementDetails160.mmBlockTrade,
					SettlementDetails161.mmBlockTrade, SettlementDetails162.mmBlockTrade);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BlockTrade";
			definition = "Specifies whether the settlement instruction is a block parent or child.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BlockTradeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlement.class.getMethod("getBlockTrade", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SettlementSystemMethodCode settlementSystemMethod;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.choice.SettlementSystemMethod1Choice#mmCode
	 * SettlementSystemMethod1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementSystemMethod1Choice#mmProprietary
	 * SettlementSystemMethod1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails9#mmSettlementSystemMethod
	 * SettlementDetails9.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementSystemMethod2Choice#mmCode
	 * SettlementSystemMethod2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementSystemMethod2Choice#mmProprietary
	 * SettlementSystemMethod2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails17#mmSettlementSystemMethod
	 * SettlementDetails17.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails30#mmSettlementSystemMethod
	 * SettlementDetails30.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails32#mmSettlementSystemMethod
	 * SettlementDetails32.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails60#mmSettlementSystemMethod
	 * SettlementDetails60.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails64#mmSettlementSystemMethod
	 * SettlementDetails64.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails3#mmSettlementSystemMethod
	 * SettlementDetails3.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails16#mmSettlementSystemMethod
	 * SettlementDetails16.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails31#mmSettlementSystemMethod
	 * SettlementDetails31.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails40#mmSettlementSystemMethod
	 * SettlementDetails40.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails62#mmSettlementSystemMethod
	 * SettlementDetails62.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails63#mmSettlementSystemMethod
	 * SettlementDetails63.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails6#mmSettlementSystemMethod
	 * SettlementDetails6.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails20#mmSettlementSystemMethod
	 * SettlementDetails20.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails24#mmSettlementSystemMethod
	 * SettlementDetails24.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails33#mmSettlementSystemMethod
	 * SettlementDetails33.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails45#mmSettlementSystemMethod
	 * SettlementDetails45.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails54#mmSettlementSystemMethod
	 * SettlementDetails54.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails1#mmSettlementSystemMethod
	 * SettlementDetails1.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails19#mmSettlementSystemMethod
	 * SettlementDetails19.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails22#mmSettlementSystemMethod
	 * SettlementDetails22.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails35#mmSettlementSystemMethod
	 * SettlementDetails35.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#mmSettlementSystemMethod
	 * SettlementDetails42.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails52#mmSettlementSystemMethod
	 * SettlementDetails52.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails8#mmSettlementSystemMethod
	 * SettlementDetails8.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails11#mmSettlementSystemMethod
	 * SettlementDetails11.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails23#mmSettlementSystemMethod
	 * SettlementDetails23.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails37#mmSettlementSystemMethod
	 * SettlementDetails37.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails44#mmSettlementSystemMethod
	 * SettlementDetails44.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails53#mmSettlementSystemMethod
	 * SettlementDetails53.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails7#mmSettlementSystemMethod
	 * SettlementDetails7.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails12#mmSettlementSystemMethod
	 * SettlementDetails12.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails28#mmSettlementSystemMethod
	 * SettlementDetails28.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails38#mmSettlementSystemMethod
	 * SettlementDetails38.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails47#mmSettlementSystemMethod
	 * SettlementDetails47.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails56#mmSettlementSystemMethod
	 * SettlementDetails56.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails2#mmSettlementSystemMethod
	 * SettlementDetails2.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails13#mmSettlementSystemMethod
	 * SettlementDetails13.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails27#mmSettlementSystemMethod
	 * SettlementDetails27.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails39#mmSettlementSystemMethod
	 * SettlementDetails39.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails48#mmSettlementSystemMethod
	 * SettlementDetails48.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails57#mmSettlementSystemMethod
	 * SettlementDetails57.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementSystemMethod3Choice#mmCode
	 * SettlementSystemMethod3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementSystemMethod3Choice#mmProprietary
	 * SettlementSystemMethod3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#mmSettlementSystemMethod
	 * SettlementDetails43.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails4#mmSettlementSystemMethod
	 * SettlementDetails4.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails10#mmSettlementSystemMethod
	 * SettlementDetails10.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails29#mmSettlementSystemMethod
	 * SettlementDetails29.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails5#mmSettlementSystemMethod
	 * SettlementDetails5.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails26#mmSettlementSystemMethod
	 * SettlementDetails26.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails65#mmSettlementSystemMethod
	 * SettlementDetails65.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails14#mmSettlementSystemMethod
	 * SettlementDetails14.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails41#mmSettlementSystemMethod
	 * SettlementDetails41.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails61#mmSettlementSystemMethod
	 * SettlementDetails61.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails59#mmSettlementSystemMethod
	 * SettlementDetails59.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails15#mmSettlementSystemMethod
	 * SettlementDetails15.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails36#mmSettlementSystemMethod
	 * SettlementDetails36.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails18#mmSettlementSystemMethod
	 * SettlementDetails18.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails66#mmSettlementSystemMethod
	 * SettlementDetails66.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#mmSettlementSystemMethod
	 * SettlementDetails67.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails70#mmSettlementSystemMethod
	 * SettlementDetails70.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails69#mmSettlementSystemMethod
	 * SettlementDetails69.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails71#mmSettlementSystemMethod
	 * SettlementDetails71.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails72#mmSettlementSystemMethod
	 * SettlementDetails72.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails75#mmSettlementSystemMethod
	 * SettlementDetails75.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails73#mmSettlementSystemMethod
	 * SettlementDetails73.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails74#mmSettlementSystemMethod
	 * SettlementDetails74.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails81#mmSettlementSystemMethod
	 * SettlementDetails81.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails76#mmSettlementSystemMethod
	 * SettlementDetails76.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails80#mmSettlementSystemMethod
	 * SettlementDetails80.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails78#mmSettlementSystemMethod
	 * SettlementDetails78.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails77#mmSettlementSystemMethod
	 * SettlementDetails77.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails79#mmSettlementSystemMethod
	 * SettlementDetails79.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails87#mmSettlementSystemMethod
	 * SettlementDetails87.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails86#mmSettlementSystemMethod
	 * SettlementDetails86.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails85#mmSettlementSystemMethod
	 * SettlementDetails85.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#mmSettlementSystemMethod
	 * SettlementDetails93.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails90#mmSettlementSystemMethod
	 * SettlementDetails90.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails96#mmSettlementSystemMethod
	 * SettlementDetails96.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#mmSettlementSystemMethod
	 * SettlementDetails97.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails100#mmSettlementSystemMethod
	 * SettlementDetails100.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementSystemMethod4Choice#mmCode
	 * SettlementSystemMethod4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementSystemMethod4Choice#mmProprietary
	 * SettlementSystemMethod4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails95#mmSettlementSystemMethod
	 * SettlementDetails95.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails91#mmSettlementSystemMethod
	 * SettlementDetails91.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails92#mmSettlementSystemMethod
	 * SettlementDetails92.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails98#mmSettlementSystemMethod
	 * SettlementDetails98.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails101#mmSettlementSystemMethod
	 * SettlementDetails101.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails105#mmSettlementSystemMethod
	 * SettlementDetails105.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails106#mmSettlementSystemMethod
	 * SettlementDetails106.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails104#mmSettlementSystemMethod
	 * SettlementDetails104.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails111#mmSettlementSystemMethod
	 * SettlementDetails111.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails112#mmSettlementSystemMethod
	 * SettlementDetails112.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails110#mmSettlementSystemMethod
	 * SettlementDetails110.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails103#mmSettlementSystemMethod
	 * SettlementDetails103.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails107#mmSettlementSystemMethod
	 * SettlementDetails107.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails115#mmSettlementSystemMethod
	 * SettlementDetails115.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails117#mmSettlementSystemMethod
	 * SettlementDetails117.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementSystemMethod5Choice#mmCode
	 * SettlementSystemMethod5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementSystemMethod5Choice#mmProprietary
	 * SettlementSystemMethod5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails116#mmSettlementSystemMethod
	 * SettlementDetails116.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails128#mmSettlementSystemMethod
	 * SettlementDetails128.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#mmSettlementSystemMethod
	 * SettlementDetails120.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#mmSettlementSystemMethod
	 * SettlementDetails119.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails126#mmSettlementSystemMethod
	 * SettlementDetails126.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails127#mmSettlementSystemMethod
	 * SettlementDetails127.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails121#mmSettlementSystemMethod
	 * SettlementDetails121.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails134#mmSettlementSystemMethod
	 * SettlementDetails134.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails137#mmSettlementSystemMethod
	 * SettlementDetails137.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails132#mmSettlementSystemMethod
	 * SettlementDetails132.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails130#mmSettlementSystemMethod
	 * SettlementDetails130.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails133#mmSettlementSystemMethod
	 * SettlementDetails133.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails139#mmSettlementSystemMethod
	 * SettlementDetails139.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails140#mmSettlementSystemMethod
	 * SettlementDetails140.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails147#mmSettlementSystemMethod
	 * SettlementDetails147.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails142#mmSettlementSystemMethod
	 * SettlementDetails142.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails144#mmSettlementSystemMethod
	 * SettlementDetails144.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails148#mmSettlementSystemMethod
	 * SettlementDetails148.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails145#mmSettlementSystemMethod
	 * SettlementDetails145.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails143#mmSettlementSystemMethod
	 * SettlementDetails143.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails149#mmSettlementSystemMethod
	 * SettlementDetails149.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails150#mmSettlementSystemMethod
	 * SettlementDetails150.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails151#mmSettlementSystemMethod
	 * SettlementDetails151.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails152#mmSettlementSystemMethod
	 * SettlementDetails152.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails155#mmSettlementSystemMethod
	 * SettlementDetails155.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails156#mmSettlementSystemMethod
	 * SettlementDetails156.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails157#mmSettlementSystemMethod
	 * SettlementDetails157.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails160#mmSettlementSystemMethod
	 * SettlementDetails160.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails161#mmSettlementSystemMethod
	 * SettlementDetails161.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails162#mmSettlementSystemMethod
	 * SettlementDetails162.mmSettlementSystemMethod}</li>
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
	public static final MMBusinessAttribute mmSettlementSystemMethod = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementSystemMethod1Choice.mmCode, SettlementSystemMethod1Choice.mmProprietary, SettlementDetails9.mmSettlementSystemMethod, SettlementSystemMethod2Choice.mmCode,
					SettlementSystemMethod2Choice.mmProprietary, SettlementDetails17.mmSettlementSystemMethod, SettlementDetails30.mmSettlementSystemMethod, SettlementDetails32.mmSettlementSystemMethod,
					SettlementDetails60.mmSettlementSystemMethod, SettlementDetails64.mmSettlementSystemMethod, SettlementDetails3.mmSettlementSystemMethod, SettlementDetails16.mmSettlementSystemMethod,
					SettlementDetails31.mmSettlementSystemMethod, SettlementDetails40.mmSettlementSystemMethod, SettlementDetails62.mmSettlementSystemMethod, SettlementDetails63.mmSettlementSystemMethod,
					SettlementDetails6.mmSettlementSystemMethod, SettlementDetails20.mmSettlementSystemMethod, SettlementDetails24.mmSettlementSystemMethod, SettlementDetails33.mmSettlementSystemMethod,
					SettlementDetails45.mmSettlementSystemMethod, SettlementDetails54.mmSettlementSystemMethod, SettlementDetails1.mmSettlementSystemMethod, SettlementDetails19.mmSettlementSystemMethod,
					SettlementDetails22.mmSettlementSystemMethod, SettlementDetails35.mmSettlementSystemMethod, SettlementDetails42.mmSettlementSystemMethod, SettlementDetails52.mmSettlementSystemMethod,
					SettlementDetails8.mmSettlementSystemMethod, SettlementDetails11.mmSettlementSystemMethod, SettlementDetails23.mmSettlementSystemMethod, SettlementDetails37.mmSettlementSystemMethod,
					SettlementDetails44.mmSettlementSystemMethod, SettlementDetails53.mmSettlementSystemMethod, SettlementDetails7.mmSettlementSystemMethod, SettlementDetails12.mmSettlementSystemMethod,
					SettlementDetails28.mmSettlementSystemMethod, SettlementDetails38.mmSettlementSystemMethod, SettlementDetails47.mmSettlementSystemMethod, SettlementDetails56.mmSettlementSystemMethod,
					SettlementDetails2.mmSettlementSystemMethod, SettlementDetails13.mmSettlementSystemMethod, SettlementDetails27.mmSettlementSystemMethod, SettlementDetails39.mmSettlementSystemMethod,
					SettlementDetails48.mmSettlementSystemMethod, SettlementDetails57.mmSettlementSystemMethod, SettlementSystemMethod3Choice.mmCode, SettlementSystemMethod3Choice.mmProprietary,
					SettlementDetails43.mmSettlementSystemMethod, SettlementDetails4.mmSettlementSystemMethod, SettlementDetails10.mmSettlementSystemMethod, SettlementDetails29.mmSettlementSystemMethod,
					SettlementDetails5.mmSettlementSystemMethod, SettlementDetails26.mmSettlementSystemMethod, SettlementDetails65.mmSettlementSystemMethod, SettlementDetails14.mmSettlementSystemMethod,
					SettlementDetails41.mmSettlementSystemMethod, SettlementDetails61.mmSettlementSystemMethod, SettlementDetails59.mmSettlementSystemMethod, SettlementDetails15.mmSettlementSystemMethod,
					SettlementDetails36.mmSettlementSystemMethod, SettlementDetails18.mmSettlementSystemMethod, SettlementDetails66.mmSettlementSystemMethod, SettlementDetails67.mmSettlementSystemMethod,
					SettlementDetails70.mmSettlementSystemMethod, SettlementDetails69.mmSettlementSystemMethod, SettlementDetails71.mmSettlementSystemMethod, SettlementDetails72.mmSettlementSystemMethod,
					SettlementDetails75.mmSettlementSystemMethod, SettlementDetails73.mmSettlementSystemMethod, SettlementDetails74.mmSettlementSystemMethod, SettlementDetails81.mmSettlementSystemMethod,
					SettlementDetails76.mmSettlementSystemMethod, SettlementDetails80.mmSettlementSystemMethod, SettlementDetails78.mmSettlementSystemMethod, SettlementDetails77.mmSettlementSystemMethod,
					SettlementDetails79.mmSettlementSystemMethod, SettlementDetails87.mmSettlementSystemMethod, SettlementDetails86.mmSettlementSystemMethod, SettlementDetails85.mmSettlementSystemMethod,
					SettlementDetails93.mmSettlementSystemMethod, SettlementDetails90.mmSettlementSystemMethod, SettlementDetails96.mmSettlementSystemMethod, SettlementDetails97.mmSettlementSystemMethod,
					SettlementDetails100.mmSettlementSystemMethod, SettlementSystemMethod4Choice.mmCode, SettlementSystemMethod4Choice.mmProprietary, SettlementDetails95.mmSettlementSystemMethod,
					SettlementDetails91.mmSettlementSystemMethod, SettlementDetails92.mmSettlementSystemMethod, SettlementDetails98.mmSettlementSystemMethod, SettlementDetails101.mmSettlementSystemMethod,
					SettlementDetails105.mmSettlementSystemMethod, SettlementDetails106.mmSettlementSystemMethod, SettlementDetails104.mmSettlementSystemMethod, SettlementDetails111.mmSettlementSystemMethod,
					SettlementDetails112.mmSettlementSystemMethod, SettlementDetails110.mmSettlementSystemMethod, SettlementDetails103.mmSettlementSystemMethod, SettlementDetails107.mmSettlementSystemMethod,
					SettlementDetails115.mmSettlementSystemMethod, SettlementDetails117.mmSettlementSystemMethod, SettlementSystemMethod5Choice.mmCode, SettlementSystemMethod5Choice.mmProprietary,
					SettlementDetails116.mmSettlementSystemMethod, SettlementDetails128.mmSettlementSystemMethod, SettlementDetails120.mmSettlementSystemMethod, SettlementDetails119.mmSettlementSystemMethod,
					SettlementDetails126.mmSettlementSystemMethod, SettlementDetails127.mmSettlementSystemMethod, SettlementDetails121.mmSettlementSystemMethod, SettlementDetails134.mmSettlementSystemMethod,
					SettlementDetails137.mmSettlementSystemMethod, SettlementDetails132.mmSettlementSystemMethod, SettlementDetails130.mmSettlementSystemMethod, SettlementDetails133.mmSettlementSystemMethod,
					SettlementDetails139.mmSettlementSystemMethod, SettlementDetails140.mmSettlementSystemMethod, SettlementDetails147.mmSettlementSystemMethod, SettlementDetails142.mmSettlementSystemMethod,
					SettlementDetails144.mmSettlementSystemMethod, SettlementDetails148.mmSettlementSystemMethod, SettlementDetails145.mmSettlementSystemMethod, SettlementDetails143.mmSettlementSystemMethod,
					SettlementDetails149.mmSettlementSystemMethod, SettlementDetails150.mmSettlementSystemMethod, SettlementDetails151.mmSettlementSystemMethod, SettlementDetails152.mmSettlementSystemMethod,
					SettlementDetails155.mmSettlementSystemMethod, SettlementDetails156.mmSettlementSystemMethod, SettlementDetails157.mmSettlementSystemMethod, SettlementDetails160.mmSettlementSystemMethod,
					SettlementDetails161.mmSettlementSystemMethod, SettlementDetails162.mmSettlementSystemMethod);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementSystemMethod";
			definition = "Specifies whether the settlement instruction is to be settled through the default or the alternate settlement system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SettlementSystemMethodCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlement.class.getMethod("getSettlementSystemMethod", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AutoBorrowingCode automaticBorrowing;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.choice.AutomaticBorrowing1Choice#mmCode
	 * AutomaticBorrowing1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AutomaticBorrowing1Choice#mmProprietary
	 * AutomaticBorrowing1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails9#mmAutomaticBorrowing
	 * SettlementDetails9.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AutomaticBorrowing4Choice#mmCode
	 * AutomaticBorrowing4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AutomaticBorrowing4Choice#mmProprietary
	 * AutomaticBorrowing4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails17#mmAutomaticBorrowing
	 * SettlementDetails17.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails30#mmAutomaticBorrowing
	 * SettlementDetails30.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails32#mmAutomaticBorrowing
	 * SettlementDetails32.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails60#mmAutomaticBorrowing
	 * SettlementDetails60.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails64#mmAutomaticBorrowing
	 * SettlementDetails64.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails3#mmAutomaticBorrowing
	 * SettlementDetails3.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails16#mmAutomaticBorrowing
	 * SettlementDetails16.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails31#mmAutomaticBorrowing
	 * SettlementDetails31.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails40#mmAutomaticBorrowing
	 * SettlementDetails40.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails62#mmAutomaticBorrowing
	 * SettlementDetails62.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails63#mmAutomaticBorrowing
	 * SettlementDetails63.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AutomaticBorrowing2Choice#mmCode
	 * AutomaticBorrowing2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AutomaticBorrowing2Choice#mmProprietary
	 * AutomaticBorrowing2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails1#mmAutomaticBorrowing
	 * RequestDetails1.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AutomaticBorrowing3Choice#mmCode
	 * AutomaticBorrowing3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AutomaticBorrowing3Choice#mmProprietary
	 * AutomaticBorrowing3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails2#mmAutomaticBorrowing
	 * RequestDetails2.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails6#mmAutomaticBorrowing
	 * RequestDetails6.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails7#mmAutomaticBorrowing
	 * RequestDetails7.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails8#mmAutomaticBorrowing
	 * RequestDetails8.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails9#mmAutomaticBorrowing
	 * RequestDetails9.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails11#mmAutomaticBorrowing
	 * RequestDetails11.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails12#mmAutomaticBorrowing
	 * RequestDetails12.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails6#mmAutomaticBorrowing
	 * SettlementDetails6.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails20#mmAutomaticBorrowing
	 * SettlementDetails20.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails24#mmAutomaticBorrowing
	 * SettlementDetails24.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails33#mmAutomaticBorrowing
	 * SettlementDetails33.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails45#mmAutomaticBorrowing
	 * SettlementDetails45.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails54#mmAutomaticBorrowing
	 * SettlementDetails54.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails1#mmAutomaticBorrowing
	 * SettlementDetails1.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails19#mmAutomaticBorrowing
	 * SettlementDetails19.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails22#mmAutomaticBorrowing
	 * SettlementDetails22.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails35#mmAutomaticBorrowing
	 * SettlementDetails35.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#mmAutomaticBorrowing
	 * SettlementDetails42.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails52#mmAutomaticBorrowing
	 * SettlementDetails52.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AutomaticBorrowing5Choice#mmCode
	 * AutomaticBorrowing5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AutomaticBorrowing5Choice#mmProprietary
	 * AutomaticBorrowing5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#mmAutomaticBorrowing
	 * SettlementDetails43.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails26#mmAutomaticBorrowing
	 * SettlementDetails26.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails65#mmAutomaticBorrowing
	 * SettlementDetails65.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails36#mmAutomaticBorrowing
	 * SettlementDetails36.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#mmAutomaticBorrowing
	 * SettlementDetails67.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails70#mmAutomaticBorrowing
	 * SettlementDetails70.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails71#mmAutomaticBorrowing
	 * SettlementDetails71.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails72#mmAutomaticBorrowing
	 * SettlementDetails72.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails13#mmAutomaticBorrowing
	 * RequestDetails13.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails81#mmAutomaticBorrowing
	 * SettlementDetails81.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails76#mmAutomaticBorrowing
	 * SettlementDetails76.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails80#mmAutomaticBorrowing
	 * SettlementDetails80.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails78#mmAutomaticBorrowing
	 * SettlementDetails78.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails77#mmAutomaticBorrowing
	 * SettlementDetails77.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails14#mmAutomaticBorrowing
	 * RequestDetails14.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CommissionType5Choice#mmProprietary
	 * CommissionType5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#mmAutomaticBorrowing
	 * SettlementDetails93.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails15#mmAutomaticBorrowing
	 * RequestDetails15.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails90#mmAutomaticBorrowing
	 * SettlementDetails90.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails96#mmAutomaticBorrowing
	 * SettlementDetails96.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#mmAutomaticBorrowing
	 * SettlementDetails97.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AutomaticBorrowing6Choice#mmCode
	 * AutomaticBorrowing6Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AutomaticBorrowing6Choice#mmProprietary
	 * AutomaticBorrowing6Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AutomaticBorrowing7Choice#mmCode
	 * AutomaticBorrowing7Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AutomaticBorrowing7Choice#mmProprietary
	 * AutomaticBorrowing7Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails101#mmAutomaticBorrowing
	 * SettlementDetails101.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails105#mmAutomaticBorrowing
	 * SettlementDetails105.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails106#mmAutomaticBorrowing
	 * SettlementDetails106.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails104#mmAutomaticBorrowing
	 * SettlementDetails104.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails111#mmAutomaticBorrowing
	 * SettlementDetails111.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails16#mmAutomaticBorrowing
	 * RequestDetails16.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails112#mmAutomaticBorrowing
	 * SettlementDetails112.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails110#mmAutomaticBorrowing
	 * SettlementDetails110.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AutomaticBorrowing8Choice#mmCode
	 * AutomaticBorrowing8Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AutomaticBorrowing8Choice#mmProprietary
	 * AutomaticBorrowing8Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AutomaticBorrowing11Choice#mmCode
	 * AutomaticBorrowing11Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AutomaticBorrowing11Choice#mmProprietary
	 * AutomaticBorrowing11Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails18#mmAutomaticBorrowing
	 * RequestDetails18.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails128#mmAutomaticBorrowing
	 * SettlementDetails128.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#mmAutomaticBorrowing
	 * SettlementDetails120.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#mmAutomaticBorrowing
	 * SettlementDetails119.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails134#mmAutomaticBorrowing
	 * SettlementDetails134.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails137#mmAutomaticBorrowing
	 * SettlementDetails137.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails132#mmAutomaticBorrowing
	 * SettlementDetails132.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails140#mmAutomaticBorrowing
	 * SettlementDetails140.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails147#mmAutomaticBorrowing
	 * SettlementDetails147.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails142#mmAutomaticBorrowing
	 * SettlementDetails142.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails144#mmAutomaticBorrowing
	 * SettlementDetails144.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails148#mmAutomaticBorrowing
	 * SettlementDetails148.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails145#mmAutomaticBorrowing
	 * SettlementDetails145.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails151#mmAutomaticBorrowing
	 * SettlementDetails151.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails152#mmAutomaticBorrowing
	 * SettlementDetails152.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails155#mmAutomaticBorrowing
	 * SettlementDetails155.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails156#mmAutomaticBorrowing
	 * SettlementDetails156.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails157#mmAutomaticBorrowing
	 * SettlementDetails157.mmAutomaticBorrowing}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::BORR</li>
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
	public static final MMBusinessAttribute mmAutomaticBorrowing = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(AutomaticBorrowing1Choice.mmCode, AutomaticBorrowing1Choice.mmProprietary, SettlementDetails9.mmAutomaticBorrowing, AutomaticBorrowing4Choice.mmCode,
					AutomaticBorrowing4Choice.mmProprietary, SettlementDetails17.mmAutomaticBorrowing, SettlementDetails30.mmAutomaticBorrowing, SettlementDetails32.mmAutomaticBorrowing, SettlementDetails60.mmAutomaticBorrowing,
					SettlementDetails64.mmAutomaticBorrowing, SettlementDetails3.mmAutomaticBorrowing, SettlementDetails16.mmAutomaticBorrowing, SettlementDetails31.mmAutomaticBorrowing, SettlementDetails40.mmAutomaticBorrowing,
					SettlementDetails62.mmAutomaticBorrowing, SettlementDetails63.mmAutomaticBorrowing, AutomaticBorrowing2Choice.mmCode, AutomaticBorrowing2Choice.mmProprietary, RequestDetails1.mmAutomaticBorrowing,
					AutomaticBorrowing3Choice.mmCode, AutomaticBorrowing3Choice.mmProprietary, RequestDetails2.mmAutomaticBorrowing, RequestDetails6.mmAutomaticBorrowing, RequestDetails7.mmAutomaticBorrowing,
					RequestDetails8.mmAutomaticBorrowing, RequestDetails9.mmAutomaticBorrowing, RequestDetails11.mmAutomaticBorrowing, RequestDetails12.mmAutomaticBorrowing, SettlementDetails6.mmAutomaticBorrowing,
					SettlementDetails20.mmAutomaticBorrowing, SettlementDetails24.mmAutomaticBorrowing, SettlementDetails33.mmAutomaticBorrowing, SettlementDetails45.mmAutomaticBorrowing, SettlementDetails54.mmAutomaticBorrowing,
					SettlementDetails1.mmAutomaticBorrowing, SettlementDetails19.mmAutomaticBorrowing, SettlementDetails22.mmAutomaticBorrowing, SettlementDetails35.mmAutomaticBorrowing, SettlementDetails42.mmAutomaticBorrowing,
					SettlementDetails52.mmAutomaticBorrowing, AutomaticBorrowing5Choice.mmCode, AutomaticBorrowing5Choice.mmProprietary, SettlementDetails43.mmAutomaticBorrowing, SettlementDetails26.mmAutomaticBorrowing,
					SettlementDetails65.mmAutomaticBorrowing, SettlementDetails36.mmAutomaticBorrowing, SettlementDetails67.mmAutomaticBorrowing, SettlementDetails70.mmAutomaticBorrowing, SettlementDetails71.mmAutomaticBorrowing,
					SettlementDetails72.mmAutomaticBorrowing, RequestDetails13.mmAutomaticBorrowing, SettlementDetails81.mmAutomaticBorrowing, SettlementDetails76.mmAutomaticBorrowing, SettlementDetails80.mmAutomaticBorrowing,
					SettlementDetails78.mmAutomaticBorrowing, SettlementDetails77.mmAutomaticBorrowing, RequestDetails14.mmAutomaticBorrowing, CommissionType5Choice.mmProprietary, SettlementDetails93.mmAutomaticBorrowing,
					RequestDetails15.mmAutomaticBorrowing, SettlementDetails90.mmAutomaticBorrowing, SettlementDetails96.mmAutomaticBorrowing, SettlementDetails97.mmAutomaticBorrowing, AutomaticBorrowing6Choice.mmCode,
					AutomaticBorrowing6Choice.mmProprietary, AutomaticBorrowing7Choice.mmCode, AutomaticBorrowing7Choice.mmProprietary, SettlementDetails101.mmAutomaticBorrowing, SettlementDetails105.mmAutomaticBorrowing,
					SettlementDetails106.mmAutomaticBorrowing, SettlementDetails104.mmAutomaticBorrowing, SettlementDetails111.mmAutomaticBorrowing, RequestDetails16.mmAutomaticBorrowing, SettlementDetails112.mmAutomaticBorrowing,
					SettlementDetails110.mmAutomaticBorrowing, AutomaticBorrowing8Choice.mmCode, AutomaticBorrowing8Choice.mmProprietary, AutomaticBorrowing11Choice.mmCode, AutomaticBorrowing11Choice.mmProprietary,
					RequestDetails18.mmAutomaticBorrowing, SettlementDetails128.mmAutomaticBorrowing, SettlementDetails120.mmAutomaticBorrowing, SettlementDetails119.mmAutomaticBorrowing, SettlementDetails134.mmAutomaticBorrowing,
					SettlementDetails137.mmAutomaticBorrowing, SettlementDetails132.mmAutomaticBorrowing, SettlementDetails140.mmAutomaticBorrowing, SettlementDetails147.mmAutomaticBorrowing, SettlementDetails142.mmAutomaticBorrowing,
					SettlementDetails144.mmAutomaticBorrowing, SettlementDetails148.mmAutomaticBorrowing, SettlementDetails145.mmAutomaticBorrowing, SettlementDetails151.mmAutomaticBorrowing, SettlementDetails152.mmAutomaticBorrowing,
					SettlementDetails155.mmAutomaticBorrowing, SettlementDetails156.mmAutomaticBorrowing, SettlementDetails157.mmAutomaticBorrowing);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::BORR"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AutomaticBorrowing";
			definition = "Condition for automatic borrowing.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AutoBorrowingCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlement.class.getMethod("getAutomaticBorrowing", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator partialSettlementIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails9#mmPartialSettlementIndicator
	 * SettlementDetails9.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails17#mmPartialSettlementIndicator
	 * SettlementDetails17.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails30#mmPartialSettlementIndicator
	 * SettlementDetails30.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails32#mmPartialSettlementIndicator
	 * SettlementDetails32.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails3#mmPartialSettlementIndicator
	 * SettlementDetails3.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails16#mmPartialSettlementIndicator
	 * SettlementDetails16.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails31#mmPartialSettlementIndicator
	 * SettlementDetails31.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails40#mmPartialSettlementIndicator
	 * SettlementDetails40.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails1#mmPartialSettlementIndicator
	 * RequestDetails1.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails2#mmPartialSettlementIndicator
	 * RequestDetails2.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails6#mmPartialSettlementIndicator
	 * SettlementDetails6.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails20#mmPartialSettlementIndicator
	 * SettlementDetails20.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails1#mmPartialSettlementIndicator
	 * SettlementDetails1.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails19#mmPartialSettlementIndicator
	 * SettlementDetails19.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails8#mmPartialSettlementIndicator
	 * SettlementDetails8.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails11#mmPartialSettlementIndicator
	 * SettlementDetails11.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails7#mmPartialSettlementIndicator
	 * SettlementDetails7.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails12#mmPartialSettlementIndicator
	 * SettlementDetails12.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails2#mmPartialSettlementIndicator
	 * SettlementDetails2.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails13#mmPartialSettlementIndicator
	 * SettlementDetails13.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#mmPartialSettlementIndicator
	 * SettlementDetails43.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails10#mmPartialSettlementIndicator
	 * SettlementDetails10.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails29#mmPartialSettlementIndicator
	 * SettlementDetails29.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails5#mmPartialSettlementIndicator
	 * SettlementDetails5.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails25#mmPartialSettlementIndicator
	 * SettlementDetails25.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails14#mmPartialSettlementIndicator
	 * SettlementDetails14.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails41#mmPartialSettlementIndicator
	 * SettlementDetails41.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails15#mmPartialSettlementIndicator
	 * SettlementDetails15.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails34#mmPartialSettlementIndicator
	 * SettlementDetails34.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails10#mmPartialSettlementIndicator
	 * RequestDetails10.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails17#mmPartialSettlementIndicator
	 * RequestDetails17.mmPartialSettlementIndicator}</li>
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
	public static final MMBusinessAttribute mmPartialSettlementIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementDetails9.mmPartialSettlementIndicator, SettlementDetails17.mmPartialSettlementIndicator, SettlementDetails30.mmPartialSettlementIndicator,
					SettlementDetails32.mmPartialSettlementIndicator, SettlementDetails3.mmPartialSettlementIndicator, SettlementDetails16.mmPartialSettlementIndicator, SettlementDetails31.mmPartialSettlementIndicator,
					SettlementDetails40.mmPartialSettlementIndicator, RequestDetails1.mmPartialSettlementIndicator, RequestDetails2.mmPartialSettlementIndicator, SettlementDetails6.mmPartialSettlementIndicator,
					SettlementDetails20.mmPartialSettlementIndicator, SettlementDetails1.mmPartialSettlementIndicator, SettlementDetails19.mmPartialSettlementIndicator, SettlementDetails8.mmPartialSettlementIndicator,
					SettlementDetails11.mmPartialSettlementIndicator, SettlementDetails7.mmPartialSettlementIndicator, SettlementDetails12.mmPartialSettlementIndicator, SettlementDetails2.mmPartialSettlementIndicator,
					SettlementDetails13.mmPartialSettlementIndicator, SettlementDetails43.mmPartialSettlementIndicator, SettlementDetails10.mmPartialSettlementIndicator, SettlementDetails29.mmPartialSettlementIndicator,
					SettlementDetails5.mmPartialSettlementIndicator, SettlementDetails25.mmPartialSettlementIndicator, SettlementDetails14.mmPartialSettlementIndicator, SettlementDetails41.mmPartialSettlementIndicator,
					SettlementDetails15.mmPartialSettlementIndicator, SettlementDetails34.mmPartialSettlementIndicator, RequestDetails10.mmPartialSettlementIndicator, RequestDetails17.mmPartialSettlementIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartialSettlementIndicator";
			definition = "Specifies whether partial settlement is allowed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlement.class.getMethod("getPartialSettlementIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator holdIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails3#mmHoldIndicator
	 * SettlementDetails3.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails16#mmHoldIndicator
	 * SettlementDetails16.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails31#mmHoldIndicator
	 * SettlementDetails31.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails40#mmHoldIndicator
	 * SettlementDetails40.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails62#mmHoldIndicator
	 * SettlementDetails62.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails63#mmHoldIndicator
	 * SettlementDetails63.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails1#mmHoldIndicator
	 * RequestDetails1.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails2#mmHoldIndicator
	 * RequestDetails2.mmHoldIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.HoldIndicator2#mmIndicator
	 * HoldIndicator2.mmIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails6#mmHoldIndicator
	 * RequestDetails6.mmHoldIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.HoldIndicator3#mmIndicator
	 * HoldIndicator3.mmIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails7#mmHoldIndicator
	 * RequestDetails7.mmHoldIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.HoldIndicator4#mmIndicator
	 * HoldIndicator4.mmIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails8#mmHoldIndicator
	 * RequestDetails8.mmHoldIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.HoldIndicator5#mmIndicator
	 * HoldIndicator5.mmIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails9#mmHoldIndicator
	 * RequestDetails9.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails11#mmHoldIndicator
	 * RequestDetails11.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails12#mmHoldIndicator
	 * RequestDetails12.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails1#mmHoldIndicator
	 * SettlementDetails1.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails19#mmHoldIndicator
	 * SettlementDetails19.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails22#mmHoldIndicator
	 * SettlementDetails22.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails35#mmHoldIndicator
	 * SettlementDetails35.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#mmHoldIndicator
	 * SettlementDetails42.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails52#mmHoldIndicator
	 * SettlementDetails52.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails8#mmHoldIndicator
	 * SettlementDetails8.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails11#mmHoldIndicator
	 * SettlementDetails11.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails23#mmHoldIndicator
	 * SettlementDetails23.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails37#mmHoldIndicator
	 * SettlementDetails37.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails44#mmHoldIndicator
	 * SettlementDetails44.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails53#mmHoldIndicator
	 * SettlementDetails53.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails7#mmHoldIndicator
	 * SettlementDetails7.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails12#mmHoldIndicator
	 * SettlementDetails12.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails28#mmHoldIndicator
	 * SettlementDetails28.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails38#mmHoldIndicator
	 * SettlementDetails38.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails47#mmHoldIndicator
	 * SettlementDetails47.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails56#mmHoldIndicator
	 * SettlementDetails56.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#mmHoldIndicator
	 * SettlementDetails43.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails10#mmHoldIndicator
	 * SettlementDetails10.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails29#mmHoldIndicator
	 * SettlementDetails29.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails5#mmHoldIndicator
	 * SettlementDetails5.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails25#mmHoldIndicator
	 * SettlementDetails25.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails65#mmHoldIndicator
	 * SettlementDetails65.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails14#mmHoldIndicator
	 * SettlementDetails14.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails41#mmHoldIndicator
	 * SettlementDetails41.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails61#mmHoldIndicator
	 * SettlementDetails61.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails59#mmHoldIndicator
	 * SettlementDetails59.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails15#mmHoldIndicator
	 * SettlementDetails15.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails34#mmHoldIndicator
	 * SettlementDetails34.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails49#mmHoldIndicator
	 * SettlementDetails49.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails58#mmHoldIndicator
	 * SettlementDetails58.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails66#mmHoldIndicator
	 * SettlementDetails66.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#mmHoldIndicator
	 * SettlementDetails67.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails69#mmHoldIndicator
	 * SettlementDetails69.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails72#mmHoldIndicator
	 * SettlementDetails72.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails73#mmHoldIndicator
	 * SettlementDetails73.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails74#mmHoldIndicator
	 * SettlementDetails74.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails13#mmHoldIndicator
	 * RequestDetails13.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails81#mmHoldIndicator
	 * SettlementDetails81.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails78#mmHoldIndicator
	 * SettlementDetails78.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails77#mmHoldIndicator
	 * SettlementDetails77.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails14#mmHoldIndicator
	 * RequestDetails14.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails79#mmHoldIndicator
	 * SettlementDetails79.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails86#mmHoldIndicator
	 * SettlementDetails86.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails85#mmHoldIndicator
	 * SettlementDetails85.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#mmHoldIndicator
	 * SettlementDetails93.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails15#mmHoldIndicator
	 * RequestDetails15.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#mmHoldIndicator
	 * SettlementDetails97.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails99#mmHoldIndicator
	 * SettlementDetails99.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails95#mmHoldIndicator
	 * SettlementDetails95.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails92#mmHoldIndicator
	 * SettlementDetails92.mmHoldIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.HoldIndicator6#mmIndicator
	 * HoldIndicator6.mmIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails98#mmHoldIndicator
	 * SettlementDetails98.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails101#mmHoldIndicator
	 * SettlementDetails101.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails105#mmHoldIndicator
	 * SettlementDetails105.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails106#mmHoldIndicator
	 * SettlementDetails106.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails111#mmHoldIndicator
	 * SettlementDetails111.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails16#mmHoldIndicator
	 * RequestDetails16.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails112#mmHoldIndicator
	 * SettlementDetails112.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails108#mmHoldIndicator
	 * SettlementDetails108.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails107#mmHoldIndicator
	 * SettlementDetails107.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails115#mmHoldIndicator
	 * SettlementDetails115.mmHoldIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.HoldIndicator7#mmIndicator
	 * HoldIndicator7.mmIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails116#mmHoldIndicator
	 * SettlementDetails116.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails18#mmHoldIndicator
	 * RequestDetails18.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#mmHoldIndicator
	 * SettlementDetails120.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#mmHoldIndicator
	 * SettlementDetails119.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails125#mmHoldIndicator
	 * SettlementDetails125.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails127#mmHoldIndicator
	 * SettlementDetails127.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails121#mmHoldIndicator
	 * SettlementDetails121.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails137#mmHoldIndicator
	 * SettlementDetails137.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails132#mmHoldIndicator
	 * SettlementDetails132.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails130#mmHoldIndicator
	 * SettlementDetails130.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails131#mmHoldIndicator
	 * SettlementDetails131.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails133#mmHoldIndicator
	 * SettlementDetails133.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails140#mmHoldIndicator
	 * SettlementDetails140.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails142#mmHoldIndicator
	 * SettlementDetails142.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails148#mmHoldIndicator
	 * SettlementDetails148.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails141#mmHoldIndicator
	 * SettlementDetails141.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails145#mmHoldIndicator
	 * SettlementDetails145.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails143#mmHoldIndicator
	 * SettlementDetails143.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails149#mmHoldIndicator
	 * SettlementDetails149.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails152#mmHoldIndicator
	 * SettlementDetails152.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails153#mmHoldIndicator
	 * SettlementDetails153.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails156#mmHoldIndicator
	 * SettlementDetails156.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails157#mmHoldIndicator
	 * SettlementDetails157.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails160#mmHoldIndicator
	 * SettlementDetails160.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails161#mmHoldIndicator
	 * SettlementDetails161.mmHoldIndicator}</li>
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
	public static final MMBusinessAttribute mmHoldIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementDetails3.mmHoldIndicator, SettlementDetails16.mmHoldIndicator, SettlementDetails31.mmHoldIndicator, SettlementDetails40.mmHoldIndicator, SettlementDetails62.mmHoldIndicator,
					SettlementDetails63.mmHoldIndicator, RequestDetails1.mmHoldIndicator, RequestDetails2.mmHoldIndicator, HoldIndicator2.mmIndicator, RequestDetails6.mmHoldIndicator, HoldIndicator3.mmIndicator,
					RequestDetails7.mmHoldIndicator, HoldIndicator4.mmIndicator, RequestDetails8.mmHoldIndicator, HoldIndicator5.mmIndicator, RequestDetails9.mmHoldIndicator, RequestDetails11.mmHoldIndicator,
					RequestDetails12.mmHoldIndicator, SettlementDetails1.mmHoldIndicator, SettlementDetails19.mmHoldIndicator, SettlementDetails22.mmHoldIndicator, SettlementDetails35.mmHoldIndicator, SettlementDetails42.mmHoldIndicator,
					SettlementDetails52.mmHoldIndicator, SettlementDetails8.mmHoldIndicator, SettlementDetails11.mmHoldIndicator, SettlementDetails23.mmHoldIndicator, SettlementDetails37.mmHoldIndicator,
					SettlementDetails44.mmHoldIndicator, SettlementDetails53.mmHoldIndicator, SettlementDetails7.mmHoldIndicator, SettlementDetails12.mmHoldIndicator, SettlementDetails28.mmHoldIndicator,
					SettlementDetails38.mmHoldIndicator, SettlementDetails47.mmHoldIndicator, SettlementDetails56.mmHoldIndicator, SettlementDetails43.mmHoldIndicator, SettlementDetails10.mmHoldIndicator,
					SettlementDetails29.mmHoldIndicator, SettlementDetails5.mmHoldIndicator, SettlementDetails25.mmHoldIndicator, SettlementDetails65.mmHoldIndicator, SettlementDetails14.mmHoldIndicator,
					SettlementDetails41.mmHoldIndicator, SettlementDetails61.mmHoldIndicator, SettlementDetails59.mmHoldIndicator, SettlementDetails15.mmHoldIndicator, SettlementDetails34.mmHoldIndicator,
					SettlementDetails49.mmHoldIndicator, SettlementDetails58.mmHoldIndicator, SettlementDetails66.mmHoldIndicator, SettlementDetails67.mmHoldIndicator, SettlementDetails69.mmHoldIndicator,
					SettlementDetails72.mmHoldIndicator, SettlementDetails73.mmHoldIndicator, SettlementDetails74.mmHoldIndicator, RequestDetails13.mmHoldIndicator, SettlementDetails81.mmHoldIndicator, SettlementDetails78.mmHoldIndicator,
					SettlementDetails77.mmHoldIndicator, RequestDetails14.mmHoldIndicator, SettlementDetails79.mmHoldIndicator, SettlementDetails86.mmHoldIndicator, SettlementDetails85.mmHoldIndicator, SettlementDetails93.mmHoldIndicator,
					RequestDetails15.mmHoldIndicator, SettlementDetails97.mmHoldIndicator, SettlementDetails99.mmHoldIndicator, SettlementDetails95.mmHoldIndicator, SettlementDetails92.mmHoldIndicator, HoldIndicator6.mmIndicator,
					SettlementDetails98.mmHoldIndicator, SettlementDetails101.mmHoldIndicator, SettlementDetails105.mmHoldIndicator, SettlementDetails106.mmHoldIndicator, SettlementDetails111.mmHoldIndicator,
					RequestDetails16.mmHoldIndicator, SettlementDetails112.mmHoldIndicator, SettlementDetails108.mmHoldIndicator, SettlementDetails107.mmHoldIndicator, SettlementDetails115.mmHoldIndicator, HoldIndicator7.mmIndicator,
					SettlementDetails116.mmHoldIndicator, RequestDetails18.mmHoldIndicator, SettlementDetails120.mmHoldIndicator, SettlementDetails119.mmHoldIndicator, SettlementDetails125.mmHoldIndicator,
					SettlementDetails127.mmHoldIndicator, SettlementDetails121.mmHoldIndicator, SettlementDetails137.mmHoldIndicator, SettlementDetails132.mmHoldIndicator, SettlementDetails130.mmHoldIndicator,
					SettlementDetails131.mmHoldIndicator, SettlementDetails133.mmHoldIndicator, SettlementDetails140.mmHoldIndicator, SettlementDetails142.mmHoldIndicator, SettlementDetails148.mmHoldIndicator,
					SettlementDetails141.mmHoldIndicator, SettlementDetails145.mmHoldIndicator, SettlementDetails143.mmHoldIndicator, SettlementDetails149.mmHoldIndicator, SettlementDetails152.mmHoldIndicator,
					SettlementDetails153.mmHoldIndicator, SettlementDetails156.mmHoldIndicator, SettlementDetails157.mmHoldIndicator, SettlementDetails160.mmHoldIndicator, SettlementDetails161.mmHoldIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "HoldIndicator";
			definition = "Specifies whether the transaction is on hold/blocked/frozen.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlement.class.getMethod("getHoldIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SafekeepingPlace requestedSafekeepingPlace;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace#mmSecuritiesSettlement
	 * SafekeepingPlace.mmSecuritiesSettlement}</li>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :94a::SAFE</li>
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
	public static final MMBusinessAssociationEnd mmRequestedSafekeepingPlace = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":94a::SAFE"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RequestedSafekeepingPlace";
			definition = "Place requested as the place of safekeeping.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SafekeepingPlace.mmSecuritiesSettlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SafekeepingPlace.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.PairOff> pairOff;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PairOff#mmRelatedSecuritiesSettlement
	 * PairOff.mmRelatedSecuritiesSettlement}</li>
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
	public static final MMBusinessAssociationEnd mmPairOff = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PairOff";
			definition = "Buy and sell trades are settled in cash, based on the difference in the prices between the off-setting trades.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PairOff.mmRelatedSecuritiesSettlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PairOff.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Interest> accruedInterest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmSecuritiesSettlement
	 * Interest.mmSecuritiesSettlement}</li>
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
	public static final MMBusinessAssociationEnd mmAccruedInterest = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccruedInterest";
			definition = "Interest included in the settlement.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Interest.mmSecuritiesSettlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
		}
	};
	protected SecuritiesClearing securitiesClearing;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesClearing#mmSecuritiesSettlement
	 * SecuritiesClearing.mmSecuritiesSettlement}</li>
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
	public static final MMBusinessAssociationEnd mmSecuritiesClearing = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesClearing";
			definition = "Clearing process which triggers the settlement process.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesClearing.mmSecuritiesSettlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesClearing.mmObject();
		}
	};
	protected Payment payment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmRelatedSecuritiesSettlement
	 * Payment.mmRelatedSecuritiesSettlement}</li>
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
	public static final MMBusinessAssociationEnd mmPayment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Payment";
			definition = "Specifies the cash payment information of a securities settlement.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.mmRelatedSecuritiesSettlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
		}
	};
	protected Allocation settledAllocation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Allocation#mmSettlementExecutionParameters
	 * Allocation.mmSettlementExecutionParameters}</li>
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
	public static final MMBusinessAssociationEnd mmSettledAllocation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettledAllocation";
			definition = "Allocation which is settled.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Allocation.mmSettlementExecutionParameters;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Allocation.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.ForeignExchangeTrade> relatedForeignExchangeOperation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmCurrencyExchangeForSecuritiesSettlement
	 * ForeignExchangeTrade.mmCurrencyExchangeForSecuritiesSettlement}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedForeignExchangeOperation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedForeignExchangeOperation";
			definition = "Entry details related to currency exchange information.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ForeignExchangeTrade.mmCurrencyExchangeForSecuritiesSettlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ForeignExchangeTrade.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Security> security;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmSecuritiesSettlement
	 * Security.mmSecuritiesSettlement}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails3#mmFinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionDetails3.mmFinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails4#mmFinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionDetails4.mmFinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails2#mmFinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionDetails2.mmFinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails5#mmFinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionDetails5.mmFinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails6#mmFinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionDetails6.mmFinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails7#mmFinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionDetails7.mmFinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails8#mmFinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionDetails8.mmFinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails9#mmFinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionDetails9.mmFinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails10#mmFinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionDetails10.mmFinancialInstrumentAttributes}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails11#mmFinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionDetails11.mmFinancialInstrumentAttributes}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails12#mmFinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionDetails12.mmFinancialInstrumentAttributes}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails13#mmFinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionDetails13.mmFinancialInstrumentAttributes}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails16#mmFinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionDetails16.mmFinancialInstrumentAttributes}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails14#mmFinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionDetails14.mmFinancialInstrumentAttributes}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails15#mmFinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionDetails15.mmFinancialInstrumentAttributes}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails17#mmFinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionDetails17.mmFinancialInstrumentAttributes}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails18#mmFinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionDetails18.mmFinancialInstrumentAttributes}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails19#mmFinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionDetails19.mmFinancialInstrumentAttributes}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails21#mmFinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionDetails21.mmFinancialInstrumentAttributes}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails22#mmFinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionDetails22.mmFinancialInstrumentAttributes}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails20#mmFinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionDetails20.mmFinancialInstrumentAttributes}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails23#mmFinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionDetails23.mmFinancialInstrumentAttributes}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails25#mmFinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionDetails25.mmFinancialInstrumentAttributes}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails24#mmFinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionDetails24.mmFinancialInstrumentAttributes}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails27#mmFinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionDetails27.mmFinancialInstrumentAttributes}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails28#mmFinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionDetails28.mmFinancialInstrumentAttributes}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails26#mmFinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionDetails26.mmFinancialInstrumentAttributes}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails30#mmFinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionDetails30.mmFinancialInstrumentAttributes}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails29#mmFinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionDetails29.mmFinancialInstrumentAttributes}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails31#mmFinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionDetails31.mmFinancialInstrumentAttributes}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails34#mmFinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionDetails34.mmFinancialInstrumentAttributes}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails33#mmFinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionDetails33.mmFinancialInstrumentAttributes}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32#mmFinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionDetails32.mmFinancialInstrumentAttributes}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails35#mmFinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionDetails35.mmFinancialInstrumentAttributes}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails36#mmFinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionDetails36.mmFinancialInstrumentAttributes}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails37#mmFinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionDetails37.mmFinancialInstrumentAttributes}
	 * </li>
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
	public static final MMBusinessAssociationEnd mmSecurity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionDetails3.mmFinancialInstrumentAttributes, SecuritiesSettlementTransactionDetails4.mmFinancialInstrumentAttributes,
					SecuritiesSettlementTransactionDetails2.mmFinancialInstrumentAttributes, SecuritiesSettlementTransactionDetails5.mmFinancialInstrumentAttributes, SecuritiesSettlementTransactionDetails6.mmFinancialInstrumentAttributes,
					SecuritiesSettlementTransactionDetails7.mmFinancialInstrumentAttributes, SecuritiesSettlementTransactionDetails8.mmFinancialInstrumentAttributes, SecuritiesSettlementTransactionDetails9.mmFinancialInstrumentAttributes,
					SecuritiesSettlementTransactionDetails10.mmFinancialInstrumentAttributes, SecuritiesSettlementTransactionDetails11.mmFinancialInstrumentAttributes,
					SecuritiesSettlementTransactionDetails12.mmFinancialInstrumentAttributes, SecuritiesSettlementTransactionDetails13.mmFinancialInstrumentAttributes,
					SecuritiesSettlementTransactionDetails16.mmFinancialInstrumentAttributes, SecuritiesSettlementTransactionDetails14.mmFinancialInstrumentAttributes,
					SecuritiesSettlementTransactionDetails15.mmFinancialInstrumentAttributes, SecuritiesSettlementTransactionDetails17.mmFinancialInstrumentAttributes,
					SecuritiesSettlementTransactionDetails18.mmFinancialInstrumentAttributes, SecuritiesSettlementTransactionDetails19.mmFinancialInstrumentAttributes,
					SecuritiesSettlementTransactionDetails21.mmFinancialInstrumentAttributes, SecuritiesSettlementTransactionDetails22.mmFinancialInstrumentAttributes,
					SecuritiesSettlementTransactionDetails20.mmFinancialInstrumentAttributes, SecuritiesSettlementTransactionDetails23.mmFinancialInstrumentAttributes,
					SecuritiesSettlementTransactionDetails25.mmFinancialInstrumentAttributes, SecuritiesSettlementTransactionDetails24.mmFinancialInstrumentAttributes,
					SecuritiesSettlementTransactionDetails27.mmFinancialInstrumentAttributes, SecuritiesSettlementTransactionDetails28.mmFinancialInstrumentAttributes,
					SecuritiesSettlementTransactionDetails26.mmFinancialInstrumentAttributes, SecuritiesSettlementTransactionDetails30.mmFinancialInstrumentAttributes,
					SecuritiesSettlementTransactionDetails29.mmFinancialInstrumentAttributes, SecuritiesSettlementTransactionDetails31.mmFinancialInstrumentAttributes,
					SecuritiesSettlementTransactionDetails34.mmFinancialInstrumentAttributes, SecuritiesSettlementTransactionDetails33.mmFinancialInstrumentAttributes,
					SecuritiesSettlementTransactionDetails32.mmFinancialInstrumentAttributes, SecuritiesSettlementTransactionDetails35.mmFinancialInstrumentAttributes,
					SecuritiesSettlementTransactionDetails36.mmFinancialInstrumentAttributes, SecuritiesSettlementTransactionDetails37.mmFinancialInstrumentAttributes);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Security which is settled.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.mmSecuritiesSettlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
		}
	};
	protected Position position;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Position#mmSecuritiesSettlement
	 * Position.mmSecuritiesSettlement}</li>
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
	public static final MMBusinessAssociationEnd mmPosition = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Position";
			definition = "Information on the quantities and amounts to be settled in a position.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Position.mmSecuritiesSettlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Position.mmObject();
		}
	};
	protected Rollover rollover;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Rollover#mmSecuritiesSettlement
	 * Rollover.mmSecuritiesSettlement}</li>
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
	public static final MMBusinessAssociationEnd mmRollover = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Rollover";
			definition = "Process whereby a financial instrument is reinvested at maturity.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Rollover.mmSecuritiesSettlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Rollover.mmObject();
		}
	};
	protected SecuritiesQuantity turnedQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRelatedTurnaroundSettlement
	 * SecuritiesQuantity.mmRelatedTurnaroundSettlement}</li>
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
	 * {@linkplain com.tools20022.repository.choice.PairedOrTurnedQuantity1Choice#mmTurnedQuantity
	 * PairedOrTurnedQuantity1Choice.mmTurnedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PairedOrTurnedQuantity2Choice#mmTurnedQuantity
	 * PairedOrTurnedQuantity2Choice.mmTurnedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PairedOrTurnedQuantity3Choice#mmTurnedQuantity
	 * PairedOrTurnedQuantity3Choice.mmTurnedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PairedOrTurnedQuantity4Choice#mmTurnedQuantity
	 * PairedOrTurnedQuantity4Choice.mmTurnedQuantity}</li>
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
	public static final MMBusinessAssociationEnd mmTurnedQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(PairedOrTurnedQuantity1Choice.mmTurnedQuantity, PairedOrTurnedQuantity2Choice.mmTurnedQuantity, PairedOrTurnedQuantity3Choice.mmTurnedQuantity,
					PairedOrTurnedQuantity4Choice.mmTurnedQuantity);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TurnedQuantity";
			definition = "Relates to a turnaround: the same security is bought and sold to settle the same day, to or from different brokers.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmRelatedTurnaroundSettlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected ObligationTypeCode settlementReason;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.choice.ObligationType1Choice#mmCode
	 * ObligationType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ObligationType1Choice#mmProprietary
	 * ObligationType1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation3#mmObligationType
	 * SettlementObligation3.mmObligationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation5#mmObligationType
	 * SettlementObligation5.mmObligationType}</li>
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
	public static final MMBusinessAttribute mmSettlementReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(ObligationType1Choice.mmCode, ObligationType1Choice.mmProprietary, SettlementObligation3.mmObligationType, SettlementObligation5.mmObligationType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementReason";
			definition = "Specifies the reason for the settlement related to the type of underlying trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ObligationTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlement.class.getMethod("getSettlementReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DeliveryReceiptTypeCode settlementType;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification3#mmPayment
	 * SettlementTypeAndIdentification3.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters5#mmPayment
	 * SettlementTypeAndAdditionalParameters5.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification13#mmPayment
	 * SettlementTypeAndIdentification13.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification7#mmPayment
	 * SettlementTypeAndIdentification7.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters8#mmPayment
	 * SettlementTypeAndAdditionalParameters8.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification2#mmPayment
	 * SettlementTypeAndIdentification2.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification5#mmPayment
	 * SettlementTypeAndIdentification5.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters3#mmPayment
	 * TransactionTypeAndAdditionalParameters3.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters6#mmPayment
	 * TransactionTypeAndAdditionalParameters6.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters1#mmPayment
	 * TransactionTypeAndAdditionalParameters1.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters4#mmPayment
	 * TransactionTypeAndAdditionalParameters4.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification14#mmPayment
	 * SettlementTypeAndIdentification14.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification1#mmPayment
	 * SettlementTypeAndIdentification1.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification8#mmPayment
	 * SettlementTypeAndIdentification8.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification9#mmPayment
	 * SettlementTypeAndIdentification9.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification11#mmPayment
	 * SettlementTypeAndIdentification11.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification15#mmPayment
	 * SettlementTypeAndIdentification15.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification17#mmPayment
	 * SettlementTypeAndIdentification17.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification10#mmPayment
	 * SettlementTypeAndIdentification10.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification12#mmPayment
	 * SettlementTypeAndIdentification12.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters1#mmPayment
	 * SettlementTypeAndAdditionalParameters1.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters4#mmPayment
	 * SettlementTypeAndAdditionalParameters4.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters9#mmPayment
	 * SettlementTypeAndAdditionalParameters9.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters10#mmPayment
	 * SettlementTypeAndAdditionalParameters10.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails5#mmPayment
	 * TransactionDetails5.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails9#mmPayment
	 * TransactionDetails9.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails22#mmPayment
	 * TransactionDetails22.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails23#mmPayment
	 * TransactionDetails23.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails36#mmPayment
	 * TransactionDetails36.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails47#mmPayment
	 * TransactionDetails47.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails53#mmPayment
	 * TransactionDetails53.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails58#mmPayment
	 * TransactionDetails58.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails7#mmPayment
	 * TransactionDetails7.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails8#mmPayment
	 * TransactionDetails8.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails16#mmPayment
	 * TransactionDetails16.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails17#mmPayment
	 * TransactionDetails17.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails26#mmPayment
	 * TransactionDetails26.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails25#mmPayment
	 * TransactionDetails25.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails27#mmPayment
	 * TransactionDetails27.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails33#mmPayment
	 * TransactionDetails33.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails39#mmPayment
	 * TransactionDetails39.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails50#mmPayment
	 * TransactionDetails50.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails56#mmPayment
	 * TransactionDetails56.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails59#mmPayment
	 * TransactionDetails59.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails6#mmPayment
	 * TransactionDetails6.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails18#mmPayment
	 * TransactionDetails18.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails24#mmPayment
	 * TransactionDetails24.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails34#mmPayment
	 * TransactionDetails34.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails37#mmPayment
	 * TransactionDetails37.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails48#mmPayment
	 * TransactionDetails48.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails57#mmPayment
	 * TransactionDetails57.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails60#mmPayment
	 * TransactionDetails60.mmPayment}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order14#mmPayment
	 * Order14.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData2#mmSettlementMethod
	 * FundOrderData2.mmSettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder5#mmSettlementMethod
	 * RedemptionOrder5.mmSettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#mmSettlementMethod
	 * RedemptionExecution5.mmSettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder7#mmSettlementMethod
	 * RedemptionOrder7.mmSettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder6#mmSettlementMethod
	 * RedemptionOrder6.mmSettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmSettlementMethod
	 * RedemptionExecution6.mmSettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#mmSettlementMethod
	 * RedemptionOrder8.mmSettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#mmSettlementMethod
	 * SubscriptionOrder5.mmSettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#mmSettlementMethod
	 * SubscriptionExecution5.mmSettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#mmSettlementMethod
	 * SubscriptionOrder7.mmSettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder6#mmSettlementMethod
	 * SubscriptionOrder6.mmSettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmSettlementMethod
	 * SubscriptionExecution6.mmSettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder8#mmSettlementMethod
	 * SubscriptionOrder8.mmSettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder3#mmSettlementMethod
	 * SwitchOrder3.mmSettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution4#mmSettlementMethod
	 * SwitchExecution4.mmSettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder4#mmSettlementMethod
	 * SwitchOrder4.mmSettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails7#mmPayment
	 * SecuritiesTradeDetails7.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails19#mmPayment
	 * SecuritiesTradeDetails19.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters2#mmPayment
	 * TransactionTypeAndAdditionalParameters2.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters7#mmPayment
	 * TransactionTypeAndAdditionalParameters7.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2#mmPayment
	 * SecuritiesFinancingTransactionDetails2.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8#mmPayment
	 * SecuritiesFinancingTransactionDetails8.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters2#mmPayment
	 * SettlementTypeAndAdditionalParameters2.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails4#mmPayment
	 * SecuritiesTradeDetails4.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails17#mmPayment
	 * SecuritiesTradeDetails17.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification4#mmPayment
	 * SettlementTypeAndIdentification4.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters5#mmPayment
	 * TransactionTypeAndAdditionalParameters5.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters8#mmPayment
	 * TransactionTypeAndAdditionalParameters8.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6#mmPayment
	 * SecuritiesFinancingTransactionDetails6.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10#mmPayment
	 * SecuritiesFinancingTransactionDetails10.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17#mmPayment
	 * SecuritiesFinancingTransactionDetails17.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18#mmPayment
	 * SecuritiesFinancingTransactionDetails18.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters3#mmPayment
	 * SettlementTypeAndAdditionalParameters3.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails10#mmPayment
	 * SecuritiesTradeDetails10.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails22#mmPayment
	 * SecuritiesTradeDetails22.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails23#mmPayment
	 * SecuritiesTradeDetails23.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails29#mmPayment
	 * SecuritiesTradeDetails29.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails40#mmPayment
	 * TransactionDetails40.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails42#mmPayment
	 * TransactionDetails42.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails46#mmPayment
	 * TransactionDetails46.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification6#mmPayment
	 * SettlementTypeAndIdentification6.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails14#mmPayment
	 * SecuritiesTradeDetails14.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails20#mmPayment
	 * SecuritiesTradeDetails20.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails24#mmPayment
	 * SecuritiesTradeDetails24.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails30#mmPayment
	 * SecuritiesTradeDetails30.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails45#mmPayment
	 * TransactionDetails45.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation3#mmPayment
	 * SettlementObligation3.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation5#mmPayment
	 * SettlementObligation5.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation4#mmPayment
	 * SettlementObligation4.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder11#mmSettlementMethod
	 * RedemptionOrder11.mmSettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution12#mmSettlementMethod
	 * RedemptionExecution12.mmSettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder11#mmSettlementMethod
	 * SubscriptionOrder11.mmSettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution9#mmSettlementMethod
	 * SubscriptionExecution9.mmSettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails51#mmPayment
	 * TransactionDetails51.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails61#mmPayment
	 * TransactionDetails61.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21#mmPayment
	 * SecuritiesFinancingTransactionDetails21.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails62#mmPayment
	 * TransactionDetails62.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails63#mmPayment
	 * TransactionDetails63.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails35#mmPayment
	 * SecuritiesTradeDetails35.mmPayment}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order17#mmPayment
	 * Order17.mmPayment}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order18#mmPayment
	 * Order18.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22#mmPayment
	 * SecuritiesFinancingTransactionDetails22.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails66#mmPayment
	 * TransactionDetails66.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails42#mmPayment
	 * SecuritiesTradeDetails42.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails67#mmPayment
	 * TransactionDetails67.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails68#mmPayment
	 * TransactionDetails68.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24#mmPayment
	 * SecuritiesFinancingTransactionDetails24.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails70#mmPayment
	 * TransactionDetails70.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails69#mmPayment
	 * TransactionDetails69.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation8#mmPayment
	 * SettlementObligation8.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails71#mmPayment
	 * TransactionDetails71.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25#mmPayment
	 * SecuritiesFinancingTransactionDetails25.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails72#mmPayment
	 * TransactionDetails72.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails81#mmPayment
	 * TransactionDetails81.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails49#mmPayment
	 * SecuritiesTradeDetails49.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails82#mmPayment
	 * TransactionDetails82.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#mmPayment
	 * SecuritiesFinancingTransactionDetails26.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails79#mmPayment
	 * TransactionDetails79.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48#mmPayment
	 * SecuritiesTradeDetails48.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails75#mmPayment
	 * TransactionDetails75.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails78#mmPayment
	 * TransactionDetails78.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification18#mmPayment
	 * SettlementTypeAndIdentification18.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification19#mmPayment
	 * SettlementTypeAndIdentification19.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters10#mmPayment
	 * TransactionTypeAndAdditionalParameters10.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters11#mmPayment
	 * SettlementTypeAndAdditionalParameters11.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters9#mmPayment
	 * TransactionTypeAndAdditionalParameters9.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters11#mmPayment
	 * TransactionTypeAndAdditionalParameters11.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters12#mmPayment
	 * SettlementTypeAndAdditionalParameters12.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters14#mmPayment
	 * SettlementTypeAndAdditionalParameters14.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification20#mmPayment
	 * SettlementTypeAndIdentification20.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification21#mmPayment
	 * SettlementTypeAndIdentification21.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails57#mmPayment
	 * SecuritiesTradeDetails57.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters13#mmPayment
	 * TransactionTypeAndAdditionalParameters13.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#mmPayment
	 * SecuritiesFinancingTransactionDetails33.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters14#mmPayment
	 * TransactionTypeAndAdditionalParameters14.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters12#mmPayment
	 * TransactionTypeAndAdditionalParameters12.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails61#mmPayment
	 * SecuritiesTradeDetails61.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails92#mmPayment
	 * TransactionDetails92.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails84#mmPayment
	 * TransactionDetails84.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters16#mmPayment
	 * SettlementTypeAndAdditionalParameters16.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification24#mmPayment
	 * SettlementTypeAndIdentification24.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails87#mmPayment
	 * TransactionDetails87.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters15#mmPayment
	 * SettlementTypeAndAdditionalParameters15.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails91#mmPayment
	 * TransactionDetails91.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails90#mmPayment
	 * TransactionDetails90.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters18#mmPayment
	 * SettlementTypeAndAdditionalParameters18.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification22#mmPayment
	 * SettlementTypeAndIdentification22.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails93#mmPayment
	 * TransactionDetails93.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution7#mmSettlementMethod
	 * SwitchExecution7.mmSettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder7#mmSettlementMethod
	 * SwitchOrder7.mmSettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmSettlementMethod
	 * RedemptionOrder14.mmSettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmSettlementMethod
	 * SubscriptionExecution13.mmSettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmSettlementMethod
	 * SubscriptionExecution12.mmSettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmSettlementMethod
	 * SubscriptionOrder15.mmSettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder15#mmSettlementMethod
	 * RedemptionOrder15.mmSettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmSettlementMethod
	 * RedemptionExecution16.mmSettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#mmSettlementMethod
	 * SubscriptionOrder14.mmSettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData6#mmSettlementMethod
	 * FundOrderData6.mmSettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmSettlementMethod
	 * RedemptionExecution15.mmSettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters19#mmPayment
	 * SettlementTypeAndAdditionalParameters19.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#mmPayment
	 * SecuritiesTradeDetails68.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails97#mmPayment
	 * TransactionDetails97.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters15#mmPayment
	 * TransactionTypeAndAdditionalParameters15.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters17#mmPayment
	 * TransactionTypeAndAdditionalParameters17.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters16#mmPayment
	 * TransactionTypeAndAdditionalParameters16.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmPayment
	 * SecuritiesFinancingTransactionDetails35.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails96#mmPayment
	 * TransactionDetails96.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails95#mmPayment
	 * TransactionDetails95.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters19#mmPayment
	 * TransactionTypeAndAdditionalParameters19.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails69#mmPayment
	 * SecuritiesTradeDetails69.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters20#mmPayment
	 * TransactionTypeAndAdditionalParameters20.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters18#mmPayment
	 * TransactionTypeAndAdditionalParameters18.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36#mmPayment
	 * SecuritiesFinancingTransactionDetails36.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters20#mmPayment
	 * SettlementTypeAndAdditionalParameters20.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails100#mmPayment
	 * TransactionDetails100.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails99#mmPayment
	 * TransactionDetails99.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails98#mmPayment
	 * TransactionDetails98.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails102#mmPayment
	 * TransactionDetails102.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails71#mmPayment
	 * SecuritiesTradeDetails71.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails105#mmPayment
	 * TransactionDetails105.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails72#mmPayment
	 * SecuritiesTradeDetails72.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails104#mmPayment
	 * TransactionDetails104.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails103#mmPayment
	 * TransactionDetails103.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification25#mmPayment
	 * SettlementTypeAndIdentification25.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification26#mmPayment
	 * SettlementTypeAndIdentification26.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails81#mmPayment
	 * SecuritiesTradeDetails81.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails85#mmPayment
	 * SecuritiesTradeDetails85.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails110#mmPayment
	 * TransactionDetails110.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails111#mmPayment
	 * TransactionDetails111.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails112#mmPayment
	 * TransactionDetails112.mmPayment}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22a::PAYM</li>
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
	public static final MMBusinessAttribute mmSettlementType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementTypeAndIdentification3.mmPayment, SettlementTypeAndAdditionalParameters5.mmPayment, SettlementTypeAndIdentification13.mmPayment, SettlementTypeAndIdentification7.mmPayment,
					SettlementTypeAndAdditionalParameters8.mmPayment, SettlementTypeAndIdentification2.mmPayment, SettlementTypeAndIdentification5.mmPayment, TransactionTypeAndAdditionalParameters3.mmPayment,
					TransactionTypeAndAdditionalParameters6.mmPayment, TransactionTypeAndAdditionalParameters1.mmPayment, TransactionTypeAndAdditionalParameters4.mmPayment, SettlementTypeAndIdentification14.mmPayment,
					SettlementTypeAndIdentification1.mmPayment, SettlementTypeAndIdentification8.mmPayment, SettlementTypeAndIdentification9.mmPayment, SettlementTypeAndIdentification11.mmPayment,
					SettlementTypeAndIdentification15.mmPayment, SettlementTypeAndIdentification17.mmPayment, SettlementTypeAndIdentification10.mmPayment, SettlementTypeAndIdentification12.mmPayment,
					SettlementTypeAndAdditionalParameters1.mmPayment, SettlementTypeAndAdditionalParameters4.mmPayment, SettlementTypeAndAdditionalParameters9.mmPayment, SettlementTypeAndAdditionalParameters10.mmPayment,
					TransactionDetails5.mmPayment, TransactionDetails9.mmPayment, TransactionDetails22.mmPayment, TransactionDetails23.mmPayment, TransactionDetails36.mmPayment, TransactionDetails47.mmPayment,
					TransactionDetails53.mmPayment, TransactionDetails58.mmPayment, TransactionDetails7.mmPayment, TransactionDetails8.mmPayment, TransactionDetails16.mmPayment, TransactionDetails17.mmPayment,
					TransactionDetails26.mmPayment, TransactionDetails25.mmPayment, TransactionDetails27.mmPayment, TransactionDetails33.mmPayment, TransactionDetails39.mmPayment, TransactionDetails50.mmPayment,
					TransactionDetails56.mmPayment, TransactionDetails59.mmPayment, TransactionDetails6.mmPayment, TransactionDetails18.mmPayment, TransactionDetails24.mmPayment, TransactionDetails34.mmPayment,
					TransactionDetails37.mmPayment, TransactionDetails48.mmPayment, TransactionDetails57.mmPayment, TransactionDetails60.mmPayment, Order14.mmPayment, FundOrderData2.mmSettlementMethod, RedemptionOrder5.mmSettlementMethod,
					RedemptionExecution5.mmSettlementMethod, RedemptionOrder7.mmSettlementMethod, RedemptionOrder6.mmSettlementMethod, RedemptionExecution6.mmSettlementMethod, RedemptionOrder8.mmSettlementMethod,
					SubscriptionOrder5.mmSettlementMethod, SubscriptionExecution5.mmSettlementMethod, SubscriptionOrder7.mmSettlementMethod, SubscriptionOrder6.mmSettlementMethod, SubscriptionExecution6.mmSettlementMethod,
					SubscriptionOrder8.mmSettlementMethod, SwitchOrder3.mmSettlementMethod, SwitchExecution4.mmSettlementMethod, SwitchOrder4.mmSettlementMethod, SecuritiesTradeDetails7.mmPayment, SecuritiesTradeDetails19.mmPayment,
					TransactionTypeAndAdditionalParameters2.mmPayment, TransactionTypeAndAdditionalParameters7.mmPayment, SecuritiesFinancingTransactionDetails2.mmPayment, SecuritiesFinancingTransactionDetails8.mmPayment,
					SettlementTypeAndAdditionalParameters2.mmPayment, SecuritiesTradeDetails4.mmPayment, SecuritiesTradeDetails17.mmPayment, SettlementTypeAndIdentification4.mmPayment, TransactionTypeAndAdditionalParameters5.mmPayment,
					TransactionTypeAndAdditionalParameters8.mmPayment, SecuritiesFinancingTransactionDetails6.mmPayment, SecuritiesFinancingTransactionDetails10.mmPayment, SecuritiesFinancingTransactionDetails17.mmPayment,
					SecuritiesFinancingTransactionDetails18.mmPayment, SettlementTypeAndAdditionalParameters3.mmPayment, SecuritiesTradeDetails10.mmPayment, SecuritiesTradeDetails22.mmPayment, SecuritiesTradeDetails23.mmPayment,
					SecuritiesTradeDetails29.mmPayment, TransactionDetails40.mmPayment, TransactionDetails42.mmPayment, TransactionDetails46.mmPayment, SettlementTypeAndIdentification6.mmPayment, SecuritiesTradeDetails14.mmPayment,
					SecuritiesTradeDetails20.mmPayment, SecuritiesTradeDetails24.mmPayment, SecuritiesTradeDetails30.mmPayment, TransactionDetails45.mmPayment, SettlementObligation3.mmPayment, SettlementObligation5.mmPayment,
					SettlementObligation4.mmPayment, RedemptionOrder11.mmSettlementMethod, RedemptionExecution12.mmSettlementMethod, SubscriptionOrder11.mmSettlementMethod, SubscriptionExecution9.mmSettlementMethod,
					TransactionDetails51.mmPayment, TransactionDetails61.mmPayment, SecuritiesFinancingTransactionDetails21.mmPayment, TransactionDetails62.mmPayment, TransactionDetails63.mmPayment, SecuritiesTradeDetails35.mmPayment,
					Order17.mmPayment, Order18.mmPayment, SecuritiesFinancingTransactionDetails22.mmPayment, TransactionDetails66.mmPayment, SecuritiesTradeDetails42.mmPayment, TransactionDetails67.mmPayment,
					TransactionDetails68.mmPayment, SecuritiesFinancingTransactionDetails24.mmPayment, TransactionDetails70.mmPayment, TransactionDetails69.mmPayment, SettlementObligation8.mmPayment, TransactionDetails71.mmPayment,
					SecuritiesFinancingTransactionDetails25.mmPayment, TransactionDetails72.mmPayment, TransactionDetails81.mmPayment, SecuritiesTradeDetails49.mmPayment, TransactionDetails82.mmPayment,
					SecuritiesFinancingTransactionDetails26.mmPayment, TransactionDetails79.mmPayment, SecuritiesTradeDetails48.mmPayment, TransactionDetails75.mmPayment, TransactionDetails78.mmPayment,
					SettlementTypeAndIdentification18.mmPayment, SettlementTypeAndIdentification19.mmPayment, TransactionTypeAndAdditionalParameters10.mmPayment, SettlementTypeAndAdditionalParameters11.mmPayment,
					TransactionTypeAndAdditionalParameters9.mmPayment, TransactionTypeAndAdditionalParameters11.mmPayment, SettlementTypeAndAdditionalParameters12.mmPayment, SettlementTypeAndAdditionalParameters14.mmPayment,
					SettlementTypeAndIdentification20.mmPayment, SettlementTypeAndIdentification21.mmPayment, SecuritiesTradeDetails57.mmPayment, TransactionTypeAndAdditionalParameters13.mmPayment,
					SecuritiesFinancingTransactionDetails33.mmPayment, TransactionTypeAndAdditionalParameters14.mmPayment, TransactionTypeAndAdditionalParameters12.mmPayment, SecuritiesTradeDetails61.mmPayment,
					TransactionDetails92.mmPayment, TransactionDetails84.mmPayment, SettlementTypeAndAdditionalParameters16.mmPayment, SettlementTypeAndIdentification24.mmPayment, TransactionDetails87.mmPayment,
					SettlementTypeAndAdditionalParameters15.mmPayment, TransactionDetails91.mmPayment, TransactionDetails90.mmPayment, SettlementTypeAndAdditionalParameters18.mmPayment, SettlementTypeAndIdentification22.mmPayment,
					TransactionDetails93.mmPayment, SwitchExecution7.mmSettlementMethod, SwitchOrder7.mmSettlementMethod, RedemptionOrder14.mmSettlementMethod, SubscriptionExecution13.mmSettlementMethod,
					SubscriptionExecution12.mmSettlementMethod, SubscriptionOrder15.mmSettlementMethod, RedemptionOrder15.mmSettlementMethod, RedemptionExecution16.mmSettlementMethod, SubscriptionOrder14.mmSettlementMethod,
					FundOrderData6.mmSettlementMethod, RedemptionExecution15.mmSettlementMethod, SettlementTypeAndAdditionalParameters19.mmPayment, SecuritiesTradeDetails68.mmPayment, TransactionDetails97.mmPayment,
					TransactionTypeAndAdditionalParameters15.mmPayment, TransactionTypeAndAdditionalParameters17.mmPayment, TransactionTypeAndAdditionalParameters16.mmPayment, SecuritiesFinancingTransactionDetails35.mmPayment,
					TransactionDetails96.mmPayment, TransactionDetails95.mmPayment, TransactionTypeAndAdditionalParameters19.mmPayment, SecuritiesTradeDetails69.mmPayment, TransactionTypeAndAdditionalParameters20.mmPayment,
					TransactionTypeAndAdditionalParameters18.mmPayment, SecuritiesFinancingTransactionDetails36.mmPayment, SettlementTypeAndAdditionalParameters20.mmPayment, TransactionDetails100.mmPayment, TransactionDetails99.mmPayment,
					TransactionDetails98.mmPayment, TransactionDetails102.mmPayment, SecuritiesTradeDetails71.mmPayment, TransactionDetails105.mmPayment, SecuritiesTradeDetails72.mmPayment, TransactionDetails104.mmPayment,
					TransactionDetails103.mmPayment, SettlementTypeAndIdentification25.mmPayment, SettlementTypeAndIdentification26.mmPayment, SecuritiesTradeDetails81.mmPayment, SecuritiesTradeDetails85.mmPayment,
					TransactionDetails110.mmPayment, TransactionDetails111.mmPayment, TransactionDetails112.mmPayment);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22a::PAYM"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementType";
			definition = "Specifies how the transaction is to be settled, eg, against payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DeliveryReceiptTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlement.class.getMethod("getSettlementType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesSettlement";
				definition = "Settlement of the securities in a securities transaction, that is, the instruction to deliver or receive securities, involving the payment of an amount of money or not.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.mmSecuritiesSettlement, com.tools20022.repository.entity.Payment.mmRelatedSecuritiesSettlement,
						com.tools20022.repository.entity.SecuritiesQuantity.mmSecuritiesSettlement, com.tools20022.repository.entity.SecuritiesQuantity.mmRelatedTurnaroundSettlement,
						com.tools20022.repository.entity.SecuritiesTransfer.mmRelatedSettlement, com.tools20022.repository.entity.SecuritiesSettlementPartyRole.mmSecuritiesSettlement,
						com.tools20022.repository.entity.Interest.mmSecuritiesSettlement, com.tools20022.repository.entity.SafekeepingPlace.mmSecuritiesSettlement,
						com.tools20022.repository.entity.SecuritiesTradeExecution.mmSecuritiesSettlement, com.tools20022.repository.entity.ForeignExchangeTrade.mmCurrencyExchangeForSecuritiesSettlement,
						com.tools20022.repository.entity.Allocation.mmSettlementExecutionParameters, com.tools20022.repository.entity.PairOff.mmRelatedSecuritiesSettlement, com.tools20022.repository.entity.Rollover.mmSecuritiesSettlement,
						com.tools20022.repository.entity.SecuritiesClearing.mmSecuritiesSettlement, com.tools20022.repository.entity.Position.mmSecuritiesSettlement);
				derivationElement_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionDetails3.mmSettlementTypeAndAdditionalParameters, SecuritiesSettlementTransactionDetails3.mmQuantityAndAccountDetails,
						SecuritiesSettlementTransactionDetails3.mmSettlementParameters, SecuritiesSettlementTransactionDetails4.mmSettlementTypeAndAdditionalParameters, SecuritiesSettlementTransactionDetails4.mmQuantityAndAccountDetails,
						SecuritiesSettlementTransactionDetails4.mmSettlementParameters, SecuritiesSettlementTransactionDetails2.mmSettlementTypeAndAdditionalParameters, SecuritiesSettlementTransactionDetails2.mmQuantityAndAccountDetails,
						SecuritiesSettlementTransactionDetails2.mmSettlementParameters, SecuritiesSettlementTransactionDetails5.mmSettlementTypeAndAdditionalParameters, SecuritiesSettlementTransactionDetails5.mmQuantityAndAccountDetails,
						SecuritiesSettlementTransactionDetails5.mmSettlementParameters, SecuritiesSettlementTransactionDetails6.mmSettlementTypeAndAdditionalParameters, SecuritiesSettlementTransactionDetails6.mmQuantityAndAccountDetails,
						SecuritiesSettlementTransactionDetails6.mmSettlementParameters, SecuritiesSettlementTransactionDetails7.mmSettlementTypeAndAdditionalParameters, SecuritiesSettlementTransactionDetails7.mmQuantityAndAccountDetails,
						SecuritiesSettlementTransactionDetails7.mmSettlementParameters, Cancellation1Choice.mmTransferOutDetails, Cancellation2Choice.mmTransferInDetails, RequestDetails1.mmUnilateralSplit,
						RequestDetails2.mmUnilateralSplit, RequestDetails6.mmUnilateralSplit, RequestDetails7.mmUnilateralSplit, RequestDetails8.mmUnilateralSplit, RequestDetails9.mmUnilateralSplit, RequestDetails11.mmUnilateralSplit,
						RequestDetails12.mmUnilateralSplit, SecuritiesSettlementTransactionDetails8.mmSettlementTypeAndAdditionalParameters, SecuritiesSettlementTransactionDetails8.mmQuantityAndAccountDetails,
						SecuritiesSettlementTransactionDetails8.mmSettlementParameters, SecuritiesSettlementTransactionDetails9.mmSettlementTypeAndAdditionalParameters, SecuritiesSettlementTransactionDetails9.mmQuantityAndAccountDetails,
						SecuritiesSettlementTransactionDetails9.mmSettlementParameters, SecuritiesSettlementTransactionDetails10.mmSettlementTypeAndAdditionalParameters, SecuritiesSettlementTransactionDetails10.mmQuantityAndAccountDetails,
						SecuritiesSettlementTransactionDetails10.mmSettlementParameters, SecuritiesSettlementTransactionDetails11.mmSettlementTypeAndAdditionalParameters,
						SecuritiesSettlementTransactionDetails11.mmQuantityAndAccountDetails, SecuritiesSettlementTransactionDetails11.mmSettlementParameters,
						SecuritiesSettlementTransactionDetails12.mmSettlementTypeAndAdditionalParameters, SecuritiesSettlementTransactionDetails12.mmQuantityAndAccountDetails,
						SecuritiesSettlementTransactionDetails12.mmSettlementParameters, SecuritiesSettlementTransactionDetails13.mmSettlementTypeAndAdditionalParameters,
						SecuritiesSettlementTransactionDetails13.mmQuantityAndAccountDetails, SecuritiesSettlementTransactionDetails13.mmSettlementParameters, SecuritiesFinancingTransactionDetails2.mmSettlementParameters,
						SecuritiesFinancingTransactionDetails8.mmSettlementParameters, SecuritiesFinancingTransactionDetails6.mmSettlementParameters, SecuritiesFinancingTransactionDetails10.mmSettlementParameters,
						SecuritiesFinancingTransactionDetails17.mmSettlementParameters, SecuritiesFinancingTransactionDetails18.mmSettlementParameters, Cancellation5Choice.mmTransferInDetails, Cancellation4Choice.mmTransferOutDetails,
						SecuritiesSettlementTransactionDetails16.mmSettlementTypeAndAdditionalParameters, SecuritiesSettlementTransactionDetails16.mmQuantityAndAccountDetails,
						SecuritiesSettlementTransactionDetails16.mmSettlementParameters, SecuritiesSettlementTransactionDetails14.mmSettlementTypeAndAdditionalParameters,
						SecuritiesSettlementTransactionDetails14.mmQuantityAndAccountDetails, SecuritiesSettlementTransactionDetails14.mmSettlementParameters,
						SecuritiesSettlementTransactionDetails15.mmSettlementTypeAndAdditionalParameters, SecuritiesSettlementTransactionDetails15.mmQuantityAndAccountDetails,
						SecuritiesSettlementTransactionDetails15.mmSettlementParameters, SecuritiesFinancingTransactionDetails21.mmSettlementParameters, RequestDetails13.mmUnilateralSplit,
						SecuritiesFinancingTransactionDetails22.mmSettlementParameters, RequestDetails14.mmUnilateralSplit, SecuritiesSettlementTransactionDetails17.mmSettlementTypeAndAdditionalParameters,
						SecuritiesSettlementTransactionDetails17.mmQuantityAndAccountDetails, SecuritiesSettlementTransactionDetails17.mmSettlementParameters,
						SecuritiesSettlementTransactionDetails18.mmSettlementTypeAndAdditionalParameters, SecuritiesSettlementTransactionDetails18.mmQuantityAndAccountDetails,
						SecuritiesSettlementTransactionDetails18.mmSettlementParameters, SecuritiesSettlementTransactionDetails19.mmSettlementTypeAndAdditionalParameters,
						SecuritiesSettlementTransactionDetails19.mmQuantityAndAccountDetails, SecuritiesSettlementTransactionDetails19.mmSettlementParameters, Cancellation9Choice.mmTransferInDetails,
						Cancellation8Choice.mmTransferOutDetails, SecuritiesFinancingTransactionDetails24.mmSettlementParameters, SecuritiesFinancingTransactionDetails25.mmSettlementParameters,
						SecuritiesFinancingTransactionDetails26.mmSettlementParameters, SecuritiesSettlementTransactionDetails21.mmSettlementTypeAndAdditionalParameters, SecuritiesSettlementTransactionDetails21.mmQuantityAndAccountDetails,
						SecuritiesSettlementTransactionDetails21.mmSettlementParameters, SecuritiesSettlementTransactionDetails22.mmSettlementTypeAndAdditionalParameters,
						SecuritiesSettlementTransactionDetails22.mmQuantityAndAccountDetails, SecuritiesSettlementTransactionDetails22.mmSettlementParameters,
						SecuritiesSettlementTransactionDetails20.mmSettlementTypeAndAdditionalParameters, SecuritiesSettlementTransactionDetails20.mmQuantityAndAccountDetails,
						SecuritiesSettlementTransactionDetails20.mmSettlementParameters, RequestDetails15.mmUnilateralSplit, Cancellation12Choice.mmTransferOutDetails, Cancellation10Choice.mmTransferInDetails,
						SecuritiesFinancingTransactionDetails33.mmSettlementParameters, RequestDetails16.mmUnilateralSplit, SecuritiesSettlementTransactionDetails23.mmSettlementTypeAndAdditionalParameters,
						SecuritiesSettlementTransactionDetails23.mmQuantityAndAccountDetails, SecuritiesSettlementTransactionDetails23.mmSettlementParameters,
						SecuritiesSettlementTransactionDetails25.mmSettlementTypeAndAdditionalParameters, SecuritiesSettlementTransactionDetails25.mmQuantityAndAccountDetails,
						SecuritiesSettlementTransactionDetails25.mmSettlementParameters, SecuritiesSettlementTransactionDetails24.mmSettlementTypeAndAdditionalParameters,
						SecuritiesSettlementTransactionDetails24.mmQuantityAndAccountDetails, SecuritiesSettlementTransactionDetails24.mmSettlementParameters, RequestDetails18.mmUnilateralSplit,
						SecuritiesFinancingTransactionDetails35.mmSettlementParameters, SecuritiesSettlementTransactionDetails27.mmSettlementTypeAndAdditionalParameters, SecuritiesSettlementTransactionDetails27.mmQuantityAndAccountDetails,
						SecuritiesSettlementTransactionDetails27.mmSettlementParameters, SecuritiesSettlementTransactionDetails28.mmSettlementTypeAndAdditionalParameters,
						SecuritiesSettlementTransactionDetails28.mmQuantityAndAccountDetails, SecuritiesSettlementTransactionDetails28.mmSettlementParameters,
						SecuritiesSettlementTransactionDetails26.mmSettlementTypeAndAdditionalParameters, SecuritiesSettlementTransactionDetails26.mmQuantityAndAccountDetails,
						SecuritiesSettlementTransactionDetails26.mmSettlementParameters, SecuritiesFinancingTransactionDetails36.mmSettlementParameters, SecuritiesSettlementTransactionDetails30.mmSettlementTypeAndAdditionalParameters,
						SecuritiesSettlementTransactionDetails30.mmQuantityAndAccountDetails, SecuritiesSettlementTransactionDetails30.mmSettlementParameters,
						SecuritiesSettlementTransactionDetails29.mmSettlementTypeAndAdditionalParameters, SecuritiesSettlementTransactionDetails29.mmQuantityAndAccountDetails,
						SecuritiesSettlementTransactionDetails29.mmSettlementParameters, SecuritiesSettlementTransactionDetails31.mmSettlementTypeAndAdditionalParameters,
						SecuritiesSettlementTransactionDetails31.mmQuantityAndAccountDetails, SecuritiesSettlementTransactionDetails31.mmSettlementParameters,
						SecuritiesSettlementTransactionDetails34.mmSettlementTypeAndAdditionalParameters, SecuritiesSettlementTransactionDetails34.mmQuantityAndAccountDetails,
						SecuritiesSettlementTransactionDetails34.mmSettlementParameters, SecuritiesSettlementTransactionDetails33.mmSettlementTypeAndAdditionalParameters,
						SecuritiesSettlementTransactionDetails33.mmQuantityAndAccountDetails, SecuritiesSettlementTransactionDetails33.mmSettlementParameters,
						SecuritiesSettlementTransactionDetails32.mmSettlementTypeAndAdditionalParameters, SecuritiesSettlementTransactionDetails32.mmQuantityAndAccountDetails,
						SecuritiesSettlementTransactionDetails32.mmSettlementParameters, SecuritiesSettlementTransactionDetails35.mmSettlementTypeAndAdditionalParameters,
						SecuritiesSettlementTransactionDetails35.mmQuantityAndAccountDetails, SecuritiesSettlementTransactionDetails35.mmSettlementParameters,
						SecuritiesSettlementTransactionDetails36.mmSettlementTypeAndAdditionalParameters, SecuritiesSettlementTransactionDetails36.mmQuantityAndAccountDetails,
						SecuritiesSettlementTransactionDetails36.mmSettlementParameters, SecuritiesSettlementTransactionDetails37.mmSettlementTypeAndAdditionalParameters,
						SecuritiesSettlementTransactionDetails37.mmQuantityAndAccountDetails, SecuritiesSettlementTransactionDetails37.mmSettlementParameters);
				superType_lazy = () -> Settlement.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesSettlement.mmTransferOperation, com.tools20022.repository.entity.SecuritiesSettlement.mmSettlementDate,
						com.tools20022.repository.entity.SecuritiesSettlement.mmPartyRole, com.tools20022.repository.entity.SecuritiesSettlement.mmSettlementAmount, com.tools20022.repository.entity.SecuritiesSettlement.mmHoldingsPlanType,
						com.tools20022.repository.entity.SecuritiesSettlement.mmSecuritiesMovementType, com.tools20022.repository.entity.SecuritiesSettlement.mmSettlementQuantity,
						com.tools20022.repository.entity.SecuritiesSettlement.mmSecuritiesTradeExecution, com.tools20022.repository.entity.SecuritiesSettlement.mmCurrencyToBuy,
						com.tools20022.repository.entity.SecuritiesSettlement.mmCurrencyToSell, com.tools20022.repository.entity.SecuritiesSettlement.mmDenominationChoice,
						com.tools20022.repository.entity.SecuritiesSettlement.mmSettlementTransactionCondition, com.tools20022.repository.entity.SecuritiesSettlement.mmBeneficialOwnershipIndicator,
						com.tools20022.repository.entity.SecuritiesSettlement.mmMarketClientSide, com.tools20022.repository.entity.SecuritiesSettlement.mmTracking, com.tools20022.repository.entity.SecuritiesSettlement.mmLetterOfGuarantee,
						com.tools20022.repository.entity.SecuritiesSettlement.mmEligibleForCollateral, com.tools20022.repository.entity.SecuritiesSettlement.mmAccruedInterestIndicator,
						com.tools20022.repository.entity.SecuritiesSettlement.mmPreConfirmation, com.tools20022.repository.entity.SecuritiesSettlement.mmSecuritiesRealTimeGrossSettlement,
						com.tools20022.repository.entity.SecuritiesSettlement.mmBlockTrade, com.tools20022.repository.entity.SecuritiesSettlement.mmSettlementSystemMethod,
						com.tools20022.repository.entity.SecuritiesSettlement.mmAutomaticBorrowing, com.tools20022.repository.entity.SecuritiesSettlement.mmPartialSettlementIndicator,
						com.tools20022.repository.entity.SecuritiesSettlement.mmHoldIndicator, com.tools20022.repository.entity.SecuritiesSettlement.mmRequestedSafekeepingPlace,
						com.tools20022.repository.entity.SecuritiesSettlement.mmPairOff, com.tools20022.repository.entity.SecuritiesSettlement.mmAccruedInterest, com.tools20022.repository.entity.SecuritiesSettlement.mmSecuritiesClearing,
						com.tools20022.repository.entity.SecuritiesSettlement.mmPayment, com.tools20022.repository.entity.SecuritiesSettlement.mmSettledAllocation,
						com.tools20022.repository.entity.SecuritiesSettlement.mmRelatedForeignExchangeOperation, com.tools20022.repository.entity.SecuritiesSettlement.mmSecurity,
						com.tools20022.repository.entity.SecuritiesSettlement.mmPosition, com.tools20022.repository.entity.SecuritiesSettlement.mmRollover, com.tools20022.repository.entity.SecuritiesSettlement.mmTurnedQuantity,
						com.tools20022.repository.entity.SecuritiesSettlement.mmSettlementReason, com.tools20022.repository.entity.SecuritiesSettlement.mmSettlementType);
				derivationComponent_lazy = () -> ListBuilderForSecuritiesSettlement_00.addElems(new ArrayList<>());
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesSettlement.class;
			}
		});
		return mmObject_lazy.get();
	}

	public SecuritiesTransfer getTransferOperation() {
		return transferOperation;
	}

	public SecuritiesSettlement setTransferOperation(com.tools20022.repository.entity.SecuritiesTransfer transferOperation) {
		this.transferOperation = Objects.requireNonNull(transferOperation);
		return this;
	}

	public ISODateTime getSettlementDate() {
		return settlementDate;
	}

	public SecuritiesSettlement setSettlementDate(ISODateTime settlementDate) {
		this.settlementDate = Objects.requireNonNull(settlementDate);
		return this;
	}

	public List<SecuritiesSettlementPartyRole> getPartyRole() {
		return partyRole == null ? partyRole = new ArrayList<>() : partyRole;
	}

	public SecuritiesSettlement setPartyRole(List<com.tools20022.repository.entity.SecuritiesSettlementPartyRole> partyRole) {
		this.partyRole = Objects.requireNonNull(partyRole);
		return this;
	}

	public ActiveCurrencyAndAmount getSettlementAmount() {
		return settlementAmount;
	}

	public SecuritiesSettlement setSettlementAmount(ActiveCurrencyAndAmount settlementAmount) {
		this.settlementAmount = Objects.requireNonNull(settlementAmount);
		return this;
	}

	public Max35Text getHoldingsPlanType() {
		return holdingsPlanType;
	}

	public SecuritiesSettlement setHoldingsPlanType(Max35Text holdingsPlanType) {
		this.holdingsPlanType = Objects.requireNonNull(holdingsPlanType);
		return this;
	}

	public ReceiveDeliveryCode getSecuritiesMovementType() {
		return securitiesMovementType;
	}

	public SecuritiesSettlement setSecuritiesMovementType(ReceiveDeliveryCode securitiesMovementType) {
		this.securitiesMovementType = Objects.requireNonNull(securitiesMovementType);
		return this;
	}

	public SecuritiesQuantity getSettlementQuantity() {
		return settlementQuantity;
	}

	public SecuritiesSettlement setSettlementQuantity(com.tools20022.repository.entity.SecuritiesQuantity settlementQuantity) {
		this.settlementQuantity = Objects.requireNonNull(settlementQuantity);
		return this;
	}

	public SecuritiesTradeExecution getSecuritiesTradeExecution() {
		return securitiesTradeExecution;
	}

	public SecuritiesSettlement setSecuritiesTradeExecution(com.tools20022.repository.entity.SecuritiesTradeExecution securitiesTradeExecution) {
		this.securitiesTradeExecution = Objects.requireNonNull(securitiesTradeExecution);
		return this;
	}

	public CurrencyCode getCurrencyToBuy() {
		return currencyToBuy;
	}

	public SecuritiesSettlement setCurrencyToBuy(CurrencyCode currencyToBuy) {
		this.currencyToBuy = Objects.requireNonNull(currencyToBuy);
		return this;
	}

	public CurrencyCode getCurrencyToSell() {
		return currencyToSell;
	}

	public SecuritiesSettlement setCurrencyToSell(CurrencyCode currencyToSell) {
		this.currencyToSell = Objects.requireNonNull(currencyToSell);
		return this;
	}

	public Max35Text getDenominationChoice() {
		return denominationChoice;
	}

	public SecuritiesSettlement setDenominationChoice(Max35Text denominationChoice) {
		this.denominationChoice = Objects.requireNonNull(denominationChoice);
		return this;
	}

	public SettlementTransactionConditionCode getSettlementTransactionCondition() {
		return settlementTransactionCondition;
	}

	public SecuritiesSettlement setSettlementTransactionCondition(SettlementTransactionConditionCode settlementTransactionCondition) {
		this.settlementTransactionCondition = Objects.requireNonNull(settlementTransactionCondition);
		return this;
	}

	public YesNoIndicator getBeneficialOwnershipIndicator() {
		return beneficialOwnershipIndicator;
	}

	public SecuritiesSettlement setBeneficialOwnershipIndicator(YesNoIndicator beneficialOwnershipIndicator) {
		this.beneficialOwnershipIndicator = Objects.requireNonNull(beneficialOwnershipIndicator);
		return this;
	}

	public MarketClientSideCode getMarketClientSide() {
		return marketClientSide;
	}

	public SecuritiesSettlement setMarketClientSide(MarketClientSideCode marketClientSide) {
		this.marketClientSide = Objects.requireNonNull(marketClientSide);
		return this;
	}

	public YesNoIndicator getTracking() {
		return tracking;
	}

	public SecuritiesSettlement setTracking(YesNoIndicator tracking) {
		this.tracking = Objects.requireNonNull(tracking);
		return this;
	}

	public YesNoIndicator getLetterOfGuarantee() {
		return letterOfGuarantee;
	}

	public SecuritiesSettlement setLetterOfGuarantee(YesNoIndicator letterOfGuarantee) {
		this.letterOfGuarantee = Objects.requireNonNull(letterOfGuarantee);
		return this;
	}

	public YesNoIndicator getEligibleForCollateral() {
		return eligibleForCollateral;
	}

	public SecuritiesSettlement setEligibleForCollateral(YesNoIndicator eligibleForCollateral) {
		this.eligibleForCollateral = Objects.requireNonNull(eligibleForCollateral);
		return this;
	}

	public YesNoIndicator getAccruedInterestIndicator() {
		return accruedInterestIndicator;
	}

	public SecuritiesSettlement setAccruedInterestIndicator(YesNoIndicator accruedInterestIndicator) {
		this.accruedInterestIndicator = Objects.requireNonNull(accruedInterestIndicator);
		return this;
	}

	public PreConfirmationCode getPreConfirmation() {
		return preConfirmation;
	}

	public SecuritiesSettlement setPreConfirmation(PreConfirmationCode preConfirmation) {
		this.preConfirmation = Objects.requireNonNull(preConfirmation);
		return this;
	}

	public YesNoIndicator getSecuritiesRealTimeGrossSettlement() {
		return securitiesRealTimeGrossSettlement;
	}

	public SecuritiesSettlement setSecuritiesRealTimeGrossSettlement(YesNoIndicator securitiesRealTimeGrossSettlement) {
		this.securitiesRealTimeGrossSettlement = Objects.requireNonNull(securitiesRealTimeGrossSettlement);
		return this;
	}

	public BlockTradeCode getBlockTrade() {
		return blockTrade;
	}

	public SecuritiesSettlement setBlockTrade(BlockTradeCode blockTrade) {
		this.blockTrade = Objects.requireNonNull(blockTrade);
		return this;
	}

	public SettlementSystemMethodCode getSettlementSystemMethod() {
		return settlementSystemMethod;
	}

	public SecuritiesSettlement setSettlementSystemMethod(SettlementSystemMethodCode settlementSystemMethod) {
		this.settlementSystemMethod = Objects.requireNonNull(settlementSystemMethod);
		return this;
	}

	public AutoBorrowingCode getAutomaticBorrowing() {
		return automaticBorrowing;
	}

	public SecuritiesSettlement setAutomaticBorrowing(AutoBorrowingCode automaticBorrowing) {
		this.automaticBorrowing = Objects.requireNonNull(automaticBorrowing);
		return this;
	}

	public YesNoIndicator getPartialSettlementIndicator() {
		return partialSettlementIndicator;
	}

	public SecuritiesSettlement setPartialSettlementIndicator(YesNoIndicator partialSettlementIndicator) {
		this.partialSettlementIndicator = Objects.requireNonNull(partialSettlementIndicator);
		return this;
	}

	public YesNoIndicator getHoldIndicator() {
		return holdIndicator;
	}

	public SecuritiesSettlement setHoldIndicator(YesNoIndicator holdIndicator) {
		this.holdIndicator = Objects.requireNonNull(holdIndicator);
		return this;
	}

	public SafekeepingPlace getRequestedSafekeepingPlace() {
		return requestedSafekeepingPlace;
	}

	public SecuritiesSettlement setRequestedSafekeepingPlace(com.tools20022.repository.entity.SafekeepingPlace requestedSafekeepingPlace) {
		this.requestedSafekeepingPlace = Objects.requireNonNull(requestedSafekeepingPlace);
		return this;
	}

	public List<PairOff> getPairOff() {
		return pairOff == null ? pairOff = new ArrayList<>() : pairOff;
	}

	public SecuritiesSettlement setPairOff(List<com.tools20022.repository.entity.PairOff> pairOff) {
		this.pairOff = Objects.requireNonNull(pairOff);
		return this;
	}

	public List<Interest> getAccruedInterest() {
		return accruedInterest == null ? accruedInterest = new ArrayList<>() : accruedInterest;
	}

	public SecuritiesSettlement setAccruedInterest(List<com.tools20022.repository.entity.Interest> accruedInterest) {
		this.accruedInterest = Objects.requireNonNull(accruedInterest);
		return this;
	}

	public SecuritiesClearing getSecuritiesClearing() {
		return securitiesClearing;
	}

	public SecuritiesSettlement setSecuritiesClearing(com.tools20022.repository.entity.SecuritiesClearing securitiesClearing) {
		this.securitiesClearing = Objects.requireNonNull(securitiesClearing);
		return this;
	}

	public Optional<Payment> getPayment() {
		return payment == null ? Optional.empty() : Optional.of(payment);
	}

	public SecuritiesSettlement setPayment(com.tools20022.repository.entity.Payment payment) {
		this.payment = payment;
		return this;
	}

	public Optional<Allocation> getSettledAllocation() {
		return settledAllocation == null ? Optional.empty() : Optional.of(settledAllocation);
	}

	public SecuritiesSettlement setSettledAllocation(com.tools20022.repository.entity.Allocation settledAllocation) {
		this.settledAllocation = settledAllocation;
		return this;
	}

	public List<ForeignExchangeTrade> getRelatedForeignExchangeOperation() {
		return relatedForeignExchangeOperation == null ? relatedForeignExchangeOperation = new ArrayList<>() : relatedForeignExchangeOperation;
	}

	public SecuritiesSettlement setRelatedForeignExchangeOperation(List<com.tools20022.repository.entity.ForeignExchangeTrade> relatedForeignExchangeOperation) {
		this.relatedForeignExchangeOperation = Objects.requireNonNull(relatedForeignExchangeOperation);
		return this;
	}

	public List<Security> getSecurity() {
		return security == null ? security = new ArrayList<>() : security;
	}

	public SecuritiesSettlement setSecurity(List<com.tools20022.repository.entity.Security> security) {
		this.security = Objects.requireNonNull(security);
		return this;
	}

	public Position getPosition() {
		return position;
	}

	public SecuritiesSettlement setPosition(com.tools20022.repository.entity.Position position) {
		this.position = Objects.requireNonNull(position);
		return this;
	}

	public Optional<Rollover> getRollover() {
		return rollover == null ? Optional.empty() : Optional.of(rollover);
	}

	public SecuritiesSettlement setRollover(com.tools20022.repository.entity.Rollover rollover) {
		this.rollover = rollover;
		return this;
	}

	public SecuritiesQuantity getTurnedQuantity() {
		return turnedQuantity;
	}

	public SecuritiesSettlement setTurnedQuantity(com.tools20022.repository.entity.SecuritiesQuantity turnedQuantity) {
		this.turnedQuantity = Objects.requireNonNull(turnedQuantity);
		return this;
	}

	public ObligationTypeCode getSettlementReason() {
		return settlementReason;
	}

	public SecuritiesSettlement setSettlementReason(ObligationTypeCode settlementReason) {
		this.settlementReason = Objects.requireNonNull(settlementReason);
		return this;
	}

	public DeliveryReceiptTypeCode getSettlementType() {
		return settlementType;
	}

	public SecuritiesSettlement setSettlementType(DeliveryReceiptTypeCode settlementType) {
		this.settlementType = Objects.requireNonNull(settlementType);
		return this;
	}
}