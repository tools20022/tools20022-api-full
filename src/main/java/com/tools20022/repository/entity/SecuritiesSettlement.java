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
import java.util.List;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	 * Set of processes resulting in a securities transfer.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
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
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Cancellation3Choice.mmCancellationByTransferInstructionDetails,
					com.tools20022.repository.choice.Cancellation6Choice.mmCancellationByTransferInstructionDetails, com.tools20022.repository.choice.Cancellation7Choice.mmCancellationByTransferInstructionDetails,
					com.tools20022.repository.choice.Cancellation11Choice.mmCancellationByTransferInstructionDetails);
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransferOperation";
			definition = "Set of processes resulting in a securities transfer.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.mmRelatedSettlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.mmObject();
		}
	};
	protected ISODateTime settlementDate;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
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
	 * </ul>
	 * </li>
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
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DeliverInformation4.mmEffectiveSettlementDate, com.tools20022.repository.msg.DeliverInformation7.mmEffectiveSettlementDate,
					com.tools20022.repository.msg.ReceiveInformation4.mmEffectiveSettlementDate, com.tools20022.repository.msg.ReceiveInformation8.mmEffectiveSettlementDate,
					com.tools20022.repository.msg.Transfer24.mmEffectiveSettlementDate, com.tools20022.repository.msg.ReceiveInformation6.mmEffectiveSettlementDate,
					com.tools20022.repository.msg.ReceiveInformation11.mmEffectiveSettlementDate, com.tools20022.repository.msg.Transfer25.mmEffectiveSettlementDate,
					com.tools20022.repository.msg.DeliverInformation11.mmEffectiveSettlementDate, com.tools20022.repository.msg.DeliverInformation6.mmEffectiveSettlementDate,
					com.tools20022.repository.msg.Transfer26.mmEffectiveSettlementDate, com.tools20022.repository.msg.Transfer23.mmEffectiveSettlementDate, com.tools20022.repository.msg.SettlementTypeAndIdentification2.mmSettlementDate,
					com.tools20022.repository.msg.SettlementTypeAndIdentification5.mmSettlementDate, com.tools20022.repository.msg.IntraPositionDetails2.mmSettlementDate,
					com.tools20022.repository.msg.IntraPositionDetails8.mmSettlementDate, com.tools20022.repository.msg.IntraPositionDetails12.mmSettlementDate, com.tools20022.repository.msg.IntraPositionDetails13.mmSettlementDate,
					com.tools20022.repository.msg.IntraPositionDetails22.mmSettlementDate, com.tools20022.repository.msg.IntraPositionDetails26.mmSettlementDate, com.tools20022.repository.msg.IntraPositionDetails27.mmSettlementDate,
					com.tools20022.repository.msg.IntraPositionDetails29.mmSettlementDate, com.tools20022.repository.msg.SecuritiesTradeDetails6.mmEffectiveSettlementDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails13.mmEffectiveSettlementDate, com.tools20022.repository.msg.AdditionalInformation3.mmEffectiveDate,
					com.tools20022.repository.msg.AdditionalInformation4.mmEffectiveDate, com.tools20022.repository.msg.AdditionalInformation7.mmEffectiveDate, com.tools20022.repository.msg.AdditionalInformation8.mmEffectiveDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails2.mmEffectiveSettlementDate, com.tools20022.repository.msg.SecuritiesTradeDetails16.mmEffectiveSettlementDate,
					com.tools20022.repository.msg.TransactionDetails6.mmEffectiveSettlementDate, com.tools20022.repository.msg.TransactionDetails18.mmEffectiveSettlementDate,
					com.tools20022.repository.msg.TransactionDetails24.mmEffectiveSettlementDate, com.tools20022.repository.msg.TransactionDetails34.mmEffectiveSettlementDate,
					com.tools20022.repository.msg.TransactionDetails37.mmEffectiveSettlementDate, com.tools20022.repository.msg.TransactionDetails48.mmEffectiveSettlementDate,
					com.tools20022.repository.msg.TransactionDetails57.mmEffectiveSettlementDate, com.tools20022.repository.msg.TransactionDetails60.mmEffectiveSettlementDate,
					com.tools20022.repository.msg.InvestmentFundTransaction2.mmSettlementDate, com.tools20022.repository.msg.InvestmentFundTransaction3.mmSettlementDate, com.tools20022.repository.msg.IntraPositionDetails1.mmSettlementDate,
					com.tools20022.repository.msg.IntraPositionDetails11.mmSettlementDate, com.tools20022.repository.msg.IntraPositionDetails4.mmSettlementDate, com.tools20022.repository.msg.IntraPositionDetails9.mmSettlementDate,
					com.tools20022.repository.msg.IntraPositionDetails7.mmSettlementDate, com.tools20022.repository.msg.IntraPositionDetails16.mmSettlementDate, com.tools20022.repository.msg.IntraPositionDetails21.mmSettlementDate,
					com.tools20022.repository.msg.IntraPositionDetails25.mmSettlementDate, com.tools20022.repository.msg.IntraPositionDetails5.mmSettlementDate, com.tools20022.repository.msg.IntraPositionDetails15.mmSettlementDate,
					com.tools20022.repository.msg.IntraPositionDetails19.mmSettlementDate, com.tools20022.repository.msg.IntraPositionDetails23.mmSettlementDate, com.tools20022.repository.msg.SettlementObligation1.mmIntendedSettlementDate,
					com.tools20022.repository.msg.SettlementObligation6.mmIntendedSettlementDate, com.tools20022.repository.msg.SettlementObligation3.mmSettlementDate,
					com.tools20022.repository.msg.SettlementObligation2.mmIntendedSettlementDate, com.tools20022.repository.msg.SettlementObligation5.mmSettlementDate,
					com.tools20022.repository.msg.SettlementObligation4.mmIntendedSettlementDate, com.tools20022.repository.msg.NetPosition2.mmSettlementDate, com.tools20022.repository.msg.TransactionDetails51.mmEffectiveSettlementDate,
					com.tools20022.repository.msg.IntraPositionQueryCriteria1.mmEffectiveSettlementDate, com.tools20022.repository.msg.IntraPosition4.mmSettlementDate, com.tools20022.repository.msg.InstrumentLeg2.mmLegSettlementDate,
					com.tools20022.repository.msg.Transfer28.mmEffectiveSettlementDate, com.tools20022.repository.msg.ReceiveInformation12.mmEffectiveSettlementDate, com.tools20022.repository.msg.Transfer29.mmEffectiveSettlementDate,
					com.tools20022.repository.msg.DeliverInformation12.mmEffectiveSettlementDate, com.tools20022.repository.msg.TransactionDetails63.mmEffectiveSettlementDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails31.mmEffectiveSettlementDate, com.tools20022.repository.msg.SecuritiesTradeDetails38.mmEffectiveSettlementDate,
					com.tools20022.repository.msg.AdditionalInformation9.mmEffectiveDate, com.tools20022.repository.msg.SecuritiesTradeDetails39.mmEffectiveSettlementDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails43.mmEffectiveSettlementDate, com.tools20022.repository.msg.AdditionalInformation10.mmEffectiveDate,
					com.tools20022.repository.msg.TransactionDetails68.mmEffectiveSettlementDate, com.tools20022.repository.msg.InvestmentFundTransaction4.mmSettlementDate,
					com.tools20022.repository.msg.DeliverInformation14.mmEffectiveSettlementDate, com.tools20022.repository.msg.ReceiveInformation14.mmEffectiveSettlementDate,
					com.tools20022.repository.msg.SettlementObligation7.mmIntendedSettlementDate, com.tools20022.repository.msg.NetPosition3.mmSettlementDate, com.tools20022.repository.msg.SettlementObligation8.mmIntendedSettlementDate,
					com.tools20022.repository.msg.UnsecuredMarketTransaction1.mmSettlementDate, com.tools20022.repository.msg.SecuredMarketTransaction1.mmSettlementDate,
					com.tools20022.repository.msg.AdditionalInformation11.mmEffectiveDate, com.tools20022.repository.msg.IntraPositionDetails31.mmSettlementDate, com.tools20022.repository.msg.TransactionDetails78.mmEffectiveSettlementDate,
					com.tools20022.repository.msg.InstrumentLeg6.mmLegSettlementDate, com.tools20022.repository.msg.IntraPositionDetails33.mmSettlementDate, com.tools20022.repository.msg.SecuritiesTradeDetails53.mmEffectiveSettlementDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails55.mmEffectiveSettlementDate, com.tools20022.repository.msg.IntraPositionDetails34.mmSettlementDate,
					com.tools20022.repository.msg.SettlementTypeAndIdentification20.mmSettlementDate, com.tools20022.repository.msg.ReceiveInformation17.mmEffectiveSettlementDate,
					com.tools20022.repository.msg.Transfer31.mmEffectiveSettlementDate, com.tools20022.repository.msg.DeliverInformation17.mmEffectiveSettlementDate, com.tools20022.repository.msg.Transfer33.mmEffectiveSettlementDate,
					com.tools20022.repository.msg.SettlementTypeAndIdentification21.mmSettlementDate, com.tools20022.repository.msg.AdditionalInformation12.mmEffectiveDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails58.mmEffectiveSettlementDate, com.tools20022.repository.msg.IntraPositionDetails35.mmSettlementDate,
					com.tools20022.repository.msg.IntraPositionDetails36.mmSettlementDate, com.tools20022.repository.msg.IntraPositionDetails38.mmSettlementDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails62.mmEffectiveSettlementDate, com.tools20022.repository.msg.TransactionDetails91.mmEffectiveSettlementDate,
					com.tools20022.repository.msg.UnsecuredMarketTransaction2.mmSettlementDate, com.tools20022.repository.msg.SecuredMarketTransaction2.mmSettlementDate,
					com.tools20022.repository.msg.UnsecuredMarketTransaction3.mmSettlementDate, com.tools20022.repository.msg.SecuredMarketTransaction3.mmSettlementDate,
					com.tools20022.repository.msg.IntraPositionDetails41.mmSettlementDate, com.tools20022.repository.msg.IntraPositionDetails39.mmSettlementDate, com.tools20022.repository.msg.AdditionalInformation13.mmEffectiveDate,
					com.tools20022.repository.msg.TransactionDetails95.mmEffectiveSettlementDate, com.tools20022.repository.msg.IntraPositionDetails43.mmSettlementDate, com.tools20022.repository.msg.IntraPositionDetails42.mmSettlementDate,
					com.tools20022.repository.msg.AdditionalInformation14.mmEffectiveDate, com.tools20022.repository.msg.TransactionDetails98.mmEffectiveSettlementDate,
					com.tools20022.repository.msg.SecuredMarketTransaction4.mmSettlementDate, com.tools20022.repository.msg.UnsecuredMarketTransaction4.mmSettlementDate);
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementDate";
			definition = "Date and time at which a transaction is completed and cleared. \r\nIt can be an effective settlement date, that is, payment is effected and securities are delivered or an intended settlement date that is, the date and time at which the amount of money is intended to be moved.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesSettlementPartyRole> partyRole;
	/**
	 * Specifies each role linked to the settlement of securities and played by
	 * a party at that step in a securities transaction flow.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
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
	 * </ul>
	 * </li>
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
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DeliverInformation2.mmSettlementPartiesDetails, com.tools20022.repository.msg.DeliverInformation4.mmSettlementPartiesDetails,
					com.tools20022.repository.msg.DeliverInformation7.mmSettlementPartiesDetails, com.tools20022.repository.msg.ReceiveInformation2.mmSettlementPartiesDetails,
					com.tools20022.repository.msg.ReceiveInformation4.mmSettlementPartiesDetails, com.tools20022.repository.msg.ReceiveInformation8.mmSettlementPartiesDetails,
					com.tools20022.repository.msg.ReceiveInformation6.mmSettlementPartiesDetails, com.tools20022.repository.msg.ReceiveInformation11.mmSettlementPartiesDetails,
					com.tools20022.repository.msg.DeliverInformation11.mmSettlementPartiesDetails, com.tools20022.repository.msg.TransactionDetails10.mmDeliveringSettlementParties,
					com.tools20022.repository.msg.TransactionDetails10.mmReceivingSettlementParties, com.tools20022.repository.msg.TransactionDetails29.mmDeliveringSettlementParties,
					com.tools20022.repository.msg.TransactionDetails29.mmReceivingSettlementParties, com.tools20022.repository.msg.StandingSettlementInstruction1.mmOtherDeliveringSettlementParties,
					com.tools20022.repository.msg.StandingSettlementInstruction1.mmOtherReceivingSettlementParties, com.tools20022.repository.msg.TransactionDetails28.mmDeliveringSettlementParties,
					com.tools20022.repository.msg.TransactionDetails28.mmReceivingSettlementParties, com.tools20022.repository.msg.TransactionDetails31.mmDeliveringSettlementParties,
					com.tools20022.repository.msg.TransactionDetails31.mmReceivingSettlementParties, com.tools20022.repository.msg.TransactionDetails44.mmDeliveringSettlementParties,
					com.tools20022.repository.msg.TransactionDetails44.mmReceivingSettlementParties, com.tools20022.repository.msg.DeliverInformation1.mmSettlementPartiesDetails,
					com.tools20022.repository.msg.DeliverInformation3.mmSettlementPartiesDetails, com.tools20022.repository.msg.DeliverInformation8.mmSettlementPartiesDetails,
					com.tools20022.repository.msg.ReceiveInformation1.mmSettlementPartiesDetails, com.tools20022.repository.msg.ReceiveInformation3.mmSettlementPartiesDetails,
					com.tools20022.repository.msg.ReceiveInformation7.mmSettlementPartiesDetails, com.tools20022.repository.msg.ReceiveInformation5.mmSettlementPartiesDetails,
					com.tools20022.repository.msg.ReceiveInformation9.mmSettlementPartiesDetails, com.tools20022.repository.msg.DeliverInformation5.mmSettlementPartiesDetails,
					com.tools20022.repository.msg.DeliverInformation9.mmSettlementPartiesDetails, com.tools20022.repository.msg.DeliverInformation6.mmSettlementPartiesDetails,
					com.tools20022.repository.msg.StandingSettlementInstruction2.mmOtherDeliveringSettlementParties, com.tools20022.repository.msg.StandingSettlementInstruction2.mmOtherReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails5.mmReceivingSettlementParties, com.tools20022.repository.msg.TransactionDetails5.mmDeliveringSettlementParties,
					com.tools20022.repository.msg.TransactionDetails9.mmReceivingSettlementParties, com.tools20022.repository.msg.TransactionDetails9.mmDeliveringSettlementParties,
					com.tools20022.repository.msg.TransactionDetails22.mmReceivingSettlementParties, com.tools20022.repository.msg.TransactionDetails22.mmDeliveringSettlementParties,
					com.tools20022.repository.msg.TransactionDetails23.mmReceivingSettlementParties, com.tools20022.repository.msg.TransactionDetails23.mmDeliveringSettlementParties,
					com.tools20022.repository.msg.TransactionDetails36.mmReceivingSettlementParties, com.tools20022.repository.msg.TransactionDetails36.mmDeliveringSettlementParties,
					com.tools20022.repository.msg.TransactionDetails47.mmReceivingSettlementParties, com.tools20022.repository.msg.TransactionDetails47.mmDeliveringSettlementParties,
					com.tools20022.repository.msg.TransactionDetails53.mmReceivingSettlementParties, com.tools20022.repository.msg.TransactionDetails53.mmDeliveringSettlementParties,
					com.tools20022.repository.msg.TransactionDetails58.mmReceivingSettlementParties, com.tools20022.repository.msg.TransactionDetails58.mmDeliveringSettlementParties,
					com.tools20022.repository.msg.TransactionDetails7.mmDeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails7.mmReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails8.mmDeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails8.mmReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails16.mmDeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails16.mmReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails17.mmDeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails17.mmReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails26.mmDeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails26.mmReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails25.mmDeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails25.mmReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails27.mmDeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails27.mmReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails33.mmDeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails33.mmReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails39.mmDeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails39.mmReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails50.mmDeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails50.mmReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails56.mmDeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails56.mmReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails59.mmDeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails59.mmReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails6.mmDeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails6.mmReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails18.mmDeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails18.mmReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails24.mmDeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails24.mmReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails34.mmDeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails34.mmReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails37.mmDeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails37.mmReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails48.mmDeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails48.mmReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails57.mmDeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails57.mmReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails60.mmDeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails60.mmReceivingSettlementParties,
					com.tools20022.repository.msg.FundSettlementParameters3.mmReceivingSideDetails, com.tools20022.repository.msg.FundSettlementParameters3.mmDeliveringSideDetails,
					com.tools20022.repository.msg.FundSettlementParameters4.mmReceivingSideDetails, com.tools20022.repository.msg.FundSettlementParameters4.mmDeliveringSideDetails,
					com.tools20022.repository.msg.SecuritiesTradeDetails7.mmDeliveringSettlementParties, com.tools20022.repository.msg.SecuritiesTradeDetails7.mmReceivingSettlementParties,
					com.tools20022.repository.msg.SecuritiesTradeDetails19.mmDeliveringSettlementParties, com.tools20022.repository.msg.SecuritiesTradeDetails19.mmReceivingSettlementParties,
					com.tools20022.repository.msg.SecuritiesTradeDetails4.mmDeliveringSettlementParties, com.tools20022.repository.msg.SecuritiesTradeDetails4.mmReceivingSettlementParties,
					com.tools20022.repository.msg.SecuritiesTradeDetails17.mmDeliveringSettlementParties, com.tools20022.repository.msg.SecuritiesTradeDetails17.mmReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails4.mmDeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails4.mmReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails30.mmDeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails30.mmReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails20.mmDeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails20.mmReceivingSettlementParties,
					com.tools20022.repository.msg.SecuritiesTradeDetails10.mmDeliveringSettlementParties, com.tools20022.repository.msg.SecuritiesTradeDetails10.mmReceivingSettlementParties,
					com.tools20022.repository.msg.SecuritiesTradeDetails22.mmDeliveringSettlementParties, com.tools20022.repository.msg.SecuritiesTradeDetails22.mmReceivingSettlementParties,
					com.tools20022.repository.msg.SecuritiesTradeDetails23.mmDeliveringSettlementParties, com.tools20022.repository.msg.SecuritiesTradeDetails23.mmReceivingSettlementParties,
					com.tools20022.repository.msg.SecuritiesTradeDetails29.mmDeliveringSettlementParties, com.tools20022.repository.msg.SecuritiesTradeDetails29.mmReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails40.mmDeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails40.mmReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails42.mmDeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails42.mmReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails46.mmDeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails46.mmReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails32.mmDeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails32.mmReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails14.mmDeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails14.mmReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails35.mmDeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails35.mmReceivingSettlementParties,
					com.tools20022.repository.msg.SecuritiesTradeDetails14.mmDeliveringSettlementParties, com.tools20022.repository.msg.SecuritiesTradeDetails14.mmReceivingSettlementParties,
					com.tools20022.repository.msg.SecuritiesTradeDetails20.mmDeliveringSettlementParties, com.tools20022.repository.msg.SecuritiesTradeDetails20.mmReceivingSettlementParties,
					com.tools20022.repository.msg.SecuritiesTradeDetails24.mmDeliveringSettlementParties, com.tools20022.repository.msg.SecuritiesTradeDetails24.mmReceivingSettlementParties,
					com.tools20022.repository.msg.SecuritiesTradeDetails30.mmDeliveringSettlementParties, com.tools20022.repository.msg.SecuritiesTradeDetails30.mmReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails45.mmDeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails45.mmReceivingSettlementParties,
					com.tools20022.repository.msg.SettlementObligation4.mmSettlementParties, com.tools20022.repository.msg.FundSettlementParameters7.mmDeliveringSideDetails,
					com.tools20022.repository.msg.FundSettlementParameters8.mmReceivingSideDetails, com.tools20022.repository.msg.FundSettlementParameters5.mmReceivingSideDetails,
					com.tools20022.repository.msg.FundSettlementParameters5.mmDeliveringSideDetails, com.tools20022.repository.msg.FundSettlementParameters6.mmReceivingSideDetails,
					com.tools20022.repository.msg.FundSettlementParameters6.mmDeliveringSideDetails, com.tools20022.repository.msg.TransactionDetails51.mmDeliveringSettlementParties,
					com.tools20022.repository.msg.TransactionDetails51.mmReceivingSettlementParties, com.tools20022.repository.msg.TransactionDetails52.mmDeliveringSettlementParties,
					com.tools20022.repository.msg.TransactionDetails52.mmReceivingSettlementParties, com.tools20022.repository.msg.OrderStatusAndReason5.mmReceivingSettlementParties,
					com.tools20022.repository.msg.OrderStatusAndReason5.mmDeliveringSettlementParties, com.tools20022.repository.msg.ReceiveInformation13.mmSettlementPartiesDetails,
					com.tools20022.repository.msg.ReceiveInformation12.mmSettlementPartiesDetails, com.tools20022.repository.msg.DeliverInformation12.mmSettlementPartiesDetails,
					com.tools20022.repository.msg.DeliverInformation13.mmSettlementPartiesDetails, com.tools20022.repository.msg.TransactionDetails61.mmReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails61.mmDeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails62.mmDeliveringSettlementParties,
					com.tools20022.repository.msg.TransactionDetails62.mmReceivingSettlementParties, com.tools20022.repository.msg.TransactionDetails63.mmDeliveringSettlementParties,
					com.tools20022.repository.msg.TransactionDetails63.mmReceivingSettlementParties, com.tools20022.repository.msg.SecuritiesTradeDetails35.mmDeliveringSettlementParties,
					com.tools20022.repository.msg.SecuritiesTradeDetails35.mmReceivingSettlementParties, com.tools20022.repository.msg.TransactionDetails66.mmReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails66.mmDeliveringSettlementParties, com.tools20022.repository.msg.SecuritiesTradeDetails42.mmDeliveringSettlementParties,
					com.tools20022.repository.msg.SecuritiesTradeDetails42.mmReceivingSettlementParties, com.tools20022.repository.msg.TransactionDetails67.mmDeliveringSettlementParties,
					com.tools20022.repository.msg.TransactionDetails67.mmReceivingSettlementParties, com.tools20022.repository.msg.TransactionDetails68.mmDeliveringSettlementParties,
					com.tools20022.repository.msg.TransactionDetails68.mmReceivingSettlementParties, com.tools20022.repository.msg.DeliverInformation15.mmSettlementPartiesDetails,
					com.tools20022.repository.msg.DeliverInformation14.mmSettlementPartiesDetails, com.tools20022.repository.msg.ReceiveInformation15.mmSettlementPartiesDetails,
					com.tools20022.repository.msg.ReceiveInformation14.mmSettlementPartiesDetails, com.tools20022.repository.msg.TransactionDetails70.mmReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails70.mmDeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails69.mmDeliveringSettlementParties,
					com.tools20022.repository.msg.TransactionDetails69.mmReceivingSettlementParties, com.tools20022.repository.msg.SettlementObligation8.mmSettlementParties,
					com.tools20022.repository.msg.SettlementDetails88.mmSettlementParties, com.tools20022.repository.msg.TransactionDetails71.mmReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails71.mmDeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails72.mmDeliveringSettlementParties,
					com.tools20022.repository.msg.TransactionDetails72.mmReceivingSettlementParties, com.tools20022.repository.msg.TransactionDetails81.mmDeliveringSettlementParties,
					com.tools20022.repository.msg.TransactionDetails81.mmReceivingSettlementParties, com.tools20022.repository.msg.TransactionDetails74.mmDeliveringSettlementParties,
					com.tools20022.repository.msg.TransactionDetails74.mmReceivingSettlementParties, com.tools20022.repository.msg.SecuritiesTradeDetails49.mmDeliveringSettlementParties,
					com.tools20022.repository.msg.SecuritiesTradeDetails49.mmReceivingSettlementParties, com.tools20022.repository.msg.TransactionDetails82.mmDeliveringSettlementParties,
					com.tools20022.repository.msg.TransactionDetails82.mmReceivingSettlementParties, com.tools20022.repository.msg.TransactionDetails79.mmReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails79.mmDeliveringSettlementParties, com.tools20022.repository.msg.SecuritiesTradeDetails48.mmDeliveringSettlementParties,
					com.tools20022.repository.msg.SecuritiesTradeDetails48.mmReceivingSettlementParties, com.tools20022.repository.msg.TransactionDetails80.mmDeliveringSettlementParties,
					com.tools20022.repository.msg.TransactionDetails80.mmReceivingSettlementParties, com.tools20022.repository.msg.TransactionDetails75.mmDeliveringSettlementParties,
					com.tools20022.repository.msg.TransactionDetails75.mmReceivingSettlementParties, com.tools20022.repository.msg.TransactionDetails78.mmDeliveringSettlementParties,
					com.tools20022.repository.msg.TransactionDetails78.mmReceivingSettlementParties, com.tools20022.repository.msg.ReceiveInformation17.mmSettlementPartiesDetails,
					com.tools20022.repository.msg.ReceiveInformation16.mmSettlementPartiesDetails, com.tools20022.repository.msg.InvestmentAccount56.mmSettlementPartiesDetails,
					com.tools20022.repository.msg.DeliverInformation16.mmSettlementPartiesDetails, com.tools20022.repository.msg.DeliverInformation17.mmSettlementPartiesDetails,
					com.tools20022.repository.msg.FinancialInstrument48.mmSettlementPartiesReceivingSideDetails, com.tools20022.repository.msg.FinancialInstrument46.mmSettlementPartiesReceivingSideDetails,
					com.tools20022.repository.msg.SettlementDetails102.mmSettlementParties, com.tools20022.repository.msg.SecuritiesTradeDetails57.mmDeliveringSettlementParties,
					com.tools20022.repository.msg.SecuritiesTradeDetails57.mmReceivingSettlementParties, com.tools20022.repository.msg.TransactionDetails88.mmDeliveringSettlementParties,
					com.tools20022.repository.msg.TransactionDetails88.mmReceivingSettlementParties, com.tools20022.repository.msg.SecuritiesTradeDetails61.mmDeliveringSettlementParties,
					com.tools20022.repository.msg.SecuritiesTradeDetails61.mmReceivingSettlementParties, com.tools20022.repository.msg.TransactionDetails92.mmDeliveringSettlementParties,
					com.tools20022.repository.msg.TransactionDetails92.mmReceivingSettlementParties, com.tools20022.repository.msg.TransactionDetails84.mmDeliveringSettlementParties,
					com.tools20022.repository.msg.TransactionDetails84.mmReceivingSettlementParties, com.tools20022.repository.msg.TransactionDetails83.mmDeliveringSettlementParties,
					com.tools20022.repository.msg.TransactionDetails83.mmReceivingSettlementParties, com.tools20022.repository.msg.TransactionDetails87.mmReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails87.mmDeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails91.mmDeliveringSettlementParties,
					com.tools20022.repository.msg.TransactionDetails91.mmReceivingSettlementParties, com.tools20022.repository.msg.TransactionDetails90.mmDeliveringSettlementParties,
					com.tools20022.repository.msg.TransactionDetails90.mmReceivingSettlementParties, com.tools20022.repository.msg.FundSettlementParameters11.mmReceivingSideDetails,
					com.tools20022.repository.msg.FundSettlementParameters11.mmDeliveringSideDetails, com.tools20022.repository.msg.FundSettlementParameters12.mmReceivingSideDetails,
					com.tools20022.repository.msg.FundSettlementParameters12.mmDeliveringSideDetails, com.tools20022.repository.msg.SecuritiesTradeDetails68.mmDeliveringSettlementParties,
					com.tools20022.repository.msg.SecuritiesTradeDetails68.mmReceivingSettlementParties, com.tools20022.repository.msg.TransactionDetails97.mmReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails97.mmDeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails96.mmDeliveringSettlementParties,
					com.tools20022.repository.msg.TransactionDetails96.mmReceivingSettlementParties, com.tools20022.repository.msg.TransactionDetails95.mmDeliveringSettlementParties,
					com.tools20022.repository.msg.TransactionDetails95.mmReceivingSettlementParties, com.tools20022.repository.msg.SettlementDetails118.mmSettlementParties,
					com.tools20022.repository.msg.SecuritiesTradeDetails69.mmDeliveringSettlementParties, com.tools20022.repository.msg.SecuritiesTradeDetails69.mmReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails100.mmReceivingSettlementParties, com.tools20022.repository.msg.TransactionDetails100.mmDeliveringSettlementParties,
					com.tools20022.repository.msg.TransactionDetails99.mmDeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails99.mmReceivingSettlementParties,
					com.tools20022.repository.msg.TransactionDetails98.mmDeliveringSettlementParties, com.tools20022.repository.msg.TransactionDetails98.mmReceivingSettlementParties);
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies each role linked to the settlement of securities and played by a party at that step in a securities transaction flow.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlementPartyRole.mmSecuritiesSettlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlementPartyRole.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount settlementAmount;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
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
	 * </ul>
	 * </li>
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
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DeliverInformation4.mmSettlementAmount, com.tools20022.repository.msg.DeliverInformation7.mmSettlementAmount,
					com.tools20022.repository.msg.ReceiveInformation4.mmSettlementAmount, com.tools20022.repository.msg.ReceiveInformation8.mmSettlementAmount, com.tools20022.repository.msg.ReceiveInformation6.mmSettlementAmount,
					com.tools20022.repository.msg.ReceiveInformation11.mmSettlementAmount, com.tools20022.repository.msg.DeliverInformation11.mmSettlementAmount, com.tools20022.repository.msg.AmountAndDirection8.mmAmount,
					com.tools20022.repository.msg.TransactionDetails10.mmSettlementAmount, com.tools20022.repository.msg.TransactionDetails29.mmSettlementAmount, com.tools20022.repository.msg.AmountAndDirection32.mmAmount,
					com.tools20022.repository.msg.AmountAndDirection9.mmAmount, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails3.mmSettlementAmount,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails4.mmSettlementAmount, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails2.mmSettlementAmount,
					com.tools20022.repository.msg.TransactionDetails28.mmSettlementAmount, com.tools20022.repository.msg.AmountAndDirection12.mmAmount, com.tools20022.repository.msg.TransactionDetails31.mmSettlementAmount,
					com.tools20022.repository.msg.TransactionDetails44.mmSettlementAmount, com.tools20022.repository.msg.AmountAndDirection33.mmAmount, com.tools20022.repository.msg.AmountAndDirection17.mmAmount,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails5.mmSettlementAmount, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails6.mmSettlementAmount,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails7.mmSettlementAmount, com.tools20022.repository.msg.DeliverInformation3.mmSettlementAmount,
					com.tools20022.repository.msg.DeliverInformation8.mmSettlementAmount, com.tools20022.repository.msg.ReceiveInformation3.mmSettlementAmount, com.tools20022.repository.msg.ReceiveInformation7.mmSettlementAmount,
					com.tools20022.repository.msg.ReceiveInformation5.mmSettlementAmount, com.tools20022.repository.msg.ReceiveInformation9.mmSettlementAmount, com.tools20022.repository.msg.DeliverInformation5.mmSettlementAmount,
					com.tools20022.repository.msg.DeliverInformation9.mmSettlementAmount, com.tools20022.repository.msg.DeliverInformation6.mmSettlementAmount,
					com.tools20022.repository.msg.IntraPositionDetails2.mmRemainingToBeSettledQuantity, com.tools20022.repository.msg.IntraPositionDetails8.mmRemainingToBeSettledQuantity,
					com.tools20022.repository.msg.IntraPositionDetails12.mmRemainingToBeSettledQuantity, com.tools20022.repository.msg.AmountAndDirection24.mmAmount,
					com.tools20022.repository.msg.IntraPositionDetails13.mmRemainingToBeSettledQuantity, com.tools20022.repository.msg.IntraPositionDetails22.mmRemainingToBeSettledQuantity,
					com.tools20022.repository.msg.IntraPositionDetails26.mmRemainingToBeSettledQuantity, com.tools20022.repository.msg.IntraPositionDetails27.mmRemainingToBeSettledQuantity,
					com.tools20022.repository.msg.IntraPositionDetails29.mmRemainingToBeSettledQuantity, com.tools20022.repository.msg.AmountAndDirection6.mmAmount, com.tools20022.repository.msg.AmountAndDirection14.mmAmount,
					com.tools20022.repository.msg.AmountAndDirection5.mmAmount, com.tools20022.repository.msg.QuantityAndAccount6.mmPreviouslySettledAmount, com.tools20022.repository.msg.QuantityAndAccount6.mmRemainingToBeSettledAmount,
					com.tools20022.repository.msg.AmountAndDirection4.mmAmount, com.tools20022.repository.msg.AmountAndDirection2.mmAmount, com.tools20022.repository.msg.AmountAndDirection19.mmAmount,
					com.tools20022.repository.msg.QuantityAndAccount11.mmPreviouslySettledAmount, com.tools20022.repository.msg.QuantityAndAccount11.mmRemainingToBeSettledAmount, com.tools20022.repository.msg.AmountAndDirection13.mmAmount,
					com.tools20022.repository.msg.AmountAndDirection16.mmAmount, com.tools20022.repository.msg.QuantityAndAccount18.mmPreviouslySettledAmount, com.tools20022.repository.msg.QuantityAndAccount18.mmRemainingToBeSettledAmount,
					com.tools20022.repository.msg.QuantityAndAccount19.mmPreviouslySettledAmount, com.tools20022.repository.msg.QuantityAndAccount19.mmRemainingToBeSettledAmount, com.tools20022.repository.msg.AmountAndDirection7.mmAmount,
					com.tools20022.repository.msg.QuantityAndAccount2.mmPreviouslySettledAmount, com.tools20022.repository.msg.QuantityAndAccount2.mmRemainingToBeSettledAmount, com.tools20022.repository.msg.AmountAndDirection15.mmAmount,
					com.tools20022.repository.msg.QuantityAndAccount12.mmPreviouslySettledAmount, com.tools20022.repository.msg.QuantityAndAccount12.mmRemainingToBeSettledAmount,
					com.tools20022.repository.msg.QuantityAndAccount15.mmPreviouslySettledAmount, com.tools20022.repository.msg.QuantityAndAccount15.mmRemainingToBeSettledAmount,
					com.tools20022.repository.msg.QuantityAndAccount20.mmPreviouslySettledAmount, com.tools20022.repository.msg.QuantityAndAccount20.mmRemainingToBeSettledAmount,
					com.tools20022.repository.msg.QuantityAndAccount28.mmPreviouslySettledAmount, com.tools20022.repository.msg.QuantityAndAccount28.mmRemainingToBeSettledAmount,
					com.tools20022.repository.msg.QuantityAndAccount37.mmPreviouslySettledAmount, com.tools20022.repository.msg.QuantityAndAccount37.mmRemainingToBeSettledAmount,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails8.mmSettlementAmount, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails9.mmSettlementAmount,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails10.mmSettlementAmount, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails11.mmSettlementAmount,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails12.mmSettlementAmount, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails13.mmSettlementAmount,
					com.tools20022.repository.msg.TransactionDetails5.mmSettlementAmount, com.tools20022.repository.msg.TransactionDetails9.mmSettlementAmount, com.tools20022.repository.msg.TransactionDetails22.mmSettlementAmount,
					com.tools20022.repository.msg.TransactionDetails23.mmSettlementAmount, com.tools20022.repository.msg.TransactionDetails36.mmSettlementAmount, com.tools20022.repository.msg.TransactionDetails47.mmSettlementAmount,
					com.tools20022.repository.msg.TransactionDetails53.mmSettlementAmount, com.tools20022.repository.msg.TransactionDetails58.mmSettlementAmount, com.tools20022.repository.msg.TransactionDetails7.mmPostingAmount,
					com.tools20022.repository.msg.TransactionDetails8.mmPostingAmount, com.tools20022.repository.msg.TransactionDetails16.mmPostingAmount, com.tools20022.repository.msg.TransactionDetails17.mmPostingAmount,
					com.tools20022.repository.msg.TransactionDetails26.mmPostingAmount, com.tools20022.repository.msg.TransactionDetails25.mmPostingAmount, com.tools20022.repository.msg.TransactionDetails27.mmPostingAmount,
					com.tools20022.repository.msg.TransactionDetails33.mmPostingAmount, com.tools20022.repository.msg.TransactionDetails39.mmPostingAmount, com.tools20022.repository.msg.TransactionDetails50.mmPostingAmount,
					com.tools20022.repository.msg.TransactionDetails56.mmPostingAmount, com.tools20022.repository.msg.TransactionDetails59.mmPostingAmount, com.tools20022.repository.msg.AmountAndDirection3.mmAmount,
					com.tools20022.repository.msg.TransactionDetails6.mmPostingAmount, com.tools20022.repository.msg.AmountAndDirection18.mmAmount, com.tools20022.repository.msg.TransactionDetails18.mmPostingAmount,
					com.tools20022.repository.msg.TransactionDetails24.mmPostingAmount, com.tools20022.repository.msg.TransactionDetails34.mmPostingAmount, com.tools20022.repository.msg.TransactionDetails37.mmPostingAmount,
					com.tools20022.repository.msg.TransactionDetails48.mmPostingAmount, com.tools20022.repository.msg.TransactionDetails57.mmPostingAmount, com.tools20022.repository.msg.TransactionDetails60.mmPostingAmount,
					com.tools20022.repository.msg.AmountAndDirection1.mmAmount, com.tools20022.repository.msg.AmountAndDirection29.mmAmount, com.tools20022.repository.msg.AmountAndDirection28.mmAmount,
					com.tools20022.repository.msg.RedemptionOrder5.mmSettlementAmount, com.tools20022.repository.msg.RedemptionOrder7.mmSettlementAmount, com.tools20022.repository.msg.RedemptionOrder6.mmSettlementAmount,
					com.tools20022.repository.msg.RedemptionOrder8.mmSettlementAmount, com.tools20022.repository.msg.InvestmentFundTransaction3.mmSettlementAmount, com.tools20022.repository.msg.SubscriptionOrder5.mmSettlementAmount,
					com.tools20022.repository.msg.SubscriptionExecution5.mmSettlementAmount, com.tools20022.repository.msg.SubscriptionOrder7.mmSettlementAmount, com.tools20022.repository.msg.SubscriptionOrder6.mmSettlementAmount,
					com.tools20022.repository.msg.SubscriptionExecution6.mmSettlementAmount, com.tools20022.repository.msg.SubscriptionOrder8.mmSettlementAmount, com.tools20022.repository.msg.SwitchOrder3.mmSettlementAmount,
					com.tools20022.repository.msg.SwitchExecution4.mmSettlementAmount, com.tools20022.repository.msg.SwitchOrder4.mmSettlementAmount, com.tools20022.repository.msg.TransactionDetails1.mmSettlementAmount,
					com.tools20022.repository.msg.TransactionDetails3.mmSettlementAmount, com.tools20022.repository.msg.AmountAndDirection10.mmAmount, com.tools20022.repository.msg.AmountAndDirection22.mmAmount,
					com.tools20022.repository.msg.AmountAndDirection23.mmAmount, com.tools20022.repository.msg.TransactionDetails4.mmSettlementAmount, com.tools20022.repository.msg.TransactionDetails30.mmSettlementAmount,
					com.tools20022.repository.msg.AmountAndDirection20.mmAmount, com.tools20022.repository.msg.AmountAndDirection11.mmAmount, com.tools20022.repository.msg.TransactionDetails20.mmSettlementAmount,
					com.tools20022.repository.msg.AmountAndDirection25.mmAmount, com.tools20022.repository.msg.AmountAndDirection26.mmAmount, com.tools20022.repository.msg.TransactionDetails40.mmSettlementAmount,
					com.tools20022.repository.msg.TransactionDetails42.mmSettlementAmount, com.tools20022.repository.msg.TransactionDetails46.mmSettlementAmount, com.tools20022.repository.msg.TransactionDetails32.mmSettlementAmount,
					com.tools20022.repository.msg.TransactionDetails14.mmSettlementAmount, com.tools20022.repository.msg.TransactionDetails35.mmSettlementAmount, com.tools20022.repository.msg.TransactionDetails45.mmSettlementAmount,
					com.tools20022.repository.msg.AmountAndDirection31.mmAmount, com.tools20022.repository.msg.SettlementObligation1.mmSettlementAmount, com.tools20022.repository.msg.SettlementObligation1.mmRemainingAmountToBeSettled,
					com.tools20022.repository.msg.AmountAndDirection27.mmAmount, com.tools20022.repository.msg.SettlementObligation6.mmSettlementAmount, com.tools20022.repository.msg.SettlementObligation6.mmRemainingAmountToBeSettled,
					com.tools20022.repository.msg.SettlementObligation3.mmSettlementAmount, com.tools20022.repository.msg.SettlementObligation2.mmSettlementAmount, com.tools20022.repository.msg.SettlementObligation5.mmSettlementAmount,
					com.tools20022.repository.msg.SettlementObligation4.mmSettlementAmount, com.tools20022.repository.msg.AmountAndDirection21.mmAmount, com.tools20022.repository.msg.SettlementDetails21.mmSettlementAmount,
					com.tools20022.repository.msg.FinancialInstrumentQuantity2.mmSettlementAmount, com.tools20022.repository.msg.FinancialInstrumentQuantity3.mmSettlementAmount,
					com.tools20022.repository.msg.SubscriptionExecution9.mmSettlementAmount, com.tools20022.repository.msg.TransactionDetails51.mmSettlementAmount, com.tools20022.repository.msg.TransactionDetails51.mmSettledAmount,
					com.tools20022.repository.msg.TransactionDetails51.mmPreviouslySettledAmount, com.tools20022.repository.msg.TransactionDetails51.mmRemainingSettlementAmount,
					com.tools20022.repository.msg.TransactionDetails52.mmSettlementAmount, com.tools20022.repository.msg.ReceiveInformation13.mmSettlementAmount, com.tools20022.repository.msg.ReceiveInformation12.mmSettlementAmount,
					com.tools20022.repository.msg.DeliverInformation12.mmSettlementAmount, com.tools20022.repository.msg.DeliverInformation13.mmSettlementAmount, com.tools20022.repository.msg.TransactionDetails61.mmSettlementAmount,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails16.mmSettlementAmount, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails14.mmSettlementAmount,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails15.mmSettlementAmount, com.tools20022.repository.msg.AmountAndDirection36.mmAmount, com.tools20022.repository.msg.TransactionDetails62.mmPostingAmount,
					com.tools20022.repository.msg.AmountAndDirection37.mmAmount, com.tools20022.repository.msg.TransactionDetails63.mmPostingAmount, com.tools20022.repository.msg.AmountAndDirection38.mmAmount,
					com.tools20022.repository.msg.TransactionDetails66.mmSettlementAmount, com.tools20022.repository.msg.TransactionDetails67.mmPostingAmount, com.tools20022.repository.msg.TransactionDetails68.mmPostingAmount,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails17.mmSettlementAmount, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails18.mmSettlementAmount,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails19.mmSettlementAmount, com.tools20022.repository.msg.AmountAndDirection40.mmAmount,
					com.tools20022.repository.msg.InvestmentFundTransaction4.mmSettlementAmount, com.tools20022.repository.msg.DeliverInformation15.mmSettlementAmount, com.tools20022.repository.msg.DeliverInformation14.mmSettlementAmount,
					com.tools20022.repository.msg.ReceiveInformation15.mmSettlementAmount, com.tools20022.repository.msg.ReceiveInformation14.mmSettlementAmount, com.tools20022.repository.msg.TransactionDetails70.mmSettlementAmount,
					com.tools20022.repository.msg.TransactionDetails69.mmPostingAmount, com.tools20022.repository.msg.SettlementObligation7.mmSettlementAmount,
					com.tools20022.repository.msg.SettlementObligation7.mmRemainingAmountToBeSettled, com.tools20022.repository.msg.SettlementObligation8.mmSettlementAmount,
					com.tools20022.repository.msg.TransactionDetails71.mmSettlementAmount, com.tools20022.repository.msg.TransactionDetails72.mmPostingAmount, com.tools20022.repository.msg.QuantityAndAccount41.mmPreviouslySettledAmount,
					com.tools20022.repository.msg.QuantityAndAccount41.mmRemainingToBeSettledAmount, com.tools20022.repository.msg.QuantityAndAccount40.mmPreviouslySettledAmount,
					com.tools20022.repository.msg.QuantityAndAccount40.mmRemainingToBeSettledAmount, com.tools20022.repository.msg.TransactionDetails81.mmSettlementAmount,
					com.tools20022.repository.msg.TransactionDetails74.mmSettlementAmount, com.tools20022.repository.msg.TransactionDetails82.mmSettlementAmount, com.tools20022.repository.msg.TransactionDetails79.mmSettlementAmount,
					com.tools20022.repository.msg.TransactionDetails80.mmSettlementAmount, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails21.mmSettlementAmount,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails22.mmSettlementAmount, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails20.mmSettlementAmount,
					com.tools20022.repository.msg.TransactionDetails75.mmPostingAmount, com.tools20022.repository.msg.TransactionDetails78.mmPostingAmount, com.tools20022.repository.msg.AmountAndDirection46.mmAmount,
					com.tools20022.repository.msg.AmountAndDirection49.mmAmount, com.tools20022.repository.msg.IntraPositionDetails34.mmRemainingToBeSettledQuantity, com.tools20022.repository.msg.AmountAndDirection48.mmAmount,
					com.tools20022.repository.msg.AmountAndDirection44.mmAmount, com.tools20022.repository.msg.AmountAndDirection45.mmAmount, com.tools20022.repository.msg.AmountAndDirection51.mmAmount,
					com.tools20022.repository.msg.AmountAndDirection52.mmAmount, com.tools20022.repository.msg.AmountAndDirection47.mmAmount, com.tools20022.repository.msg.ReceiveInformation17.mmSettlementAmount,
					com.tools20022.repository.msg.ReceiveInformation16.mmSettlementAmount, com.tools20022.repository.msg.DeliverInformation16.mmSettlementAmount, com.tools20022.repository.msg.DeliverInformation17.mmSettlementAmount,
					com.tools20022.repository.msg.AmountAndDirection66.mmAmount, com.tools20022.repository.msg.TransactionDetails88.mmSettlementAmount, com.tools20022.repository.msg.QuantityAndAccount46.mmPreviouslySettledAmount,
					com.tools20022.repository.msg.QuantityAndAccount46.mmRemainingToBeSettledAmount, com.tools20022.repository.msg.AmountAndDirection60.mmAmount, com.tools20022.repository.msg.TransactionDetails92.mmSettlementAmount,
					com.tools20022.repository.msg.TransactionDetails84.mmSettlementAmount, com.tools20022.repository.msg.IntraPositionDetails35.mmRemainingToBeSettledQuantity,
					com.tools20022.repository.msg.TransactionDetails83.mmSettlementAmount, com.tools20022.repository.msg.QuantityAndAccount51.mmPreviouslySettledAmount,
					com.tools20022.repository.msg.QuantityAndAccount51.mmRemainingToBeSettledAmount, com.tools20022.repository.msg.TransactionDetails87.mmSettlementAmount, com.tools20022.repository.msg.AmountAndDirection71.mmAmount,
					com.tools20022.repository.msg.AmountAndDirection57.mmAmount, com.tools20022.repository.msg.AmountAndDirection85.mmAmount, com.tools20022.repository.msg.AmountAndDirection55.mmAmount,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails23.mmSettlementAmount, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails25.mmSettlementAmount,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails24.mmSettlementAmount, com.tools20022.repository.msg.AmountAndDirection59.mmAmount, com.tools20022.repository.msg.TransactionDetails91.mmPostingAmount,
					com.tools20022.repository.msg.AmountAndDirection58.mmAmount, com.tools20022.repository.msg.AmountAndDirection72.mmAmount, com.tools20022.repository.msg.TransactionDetails90.mmPostingAmount,
					com.tools20022.repository.msg.AmountAndDirection67.mmAmount, com.tools20022.repository.msg.SwitchExecution7.mmSettlementAmount, com.tools20022.repository.msg.SwitchOrder7.mmSettlementAmount,
					com.tools20022.repository.msg.RedemptionOrder14.mmSettlementAmount, com.tools20022.repository.msg.SubscriptionExecution13.mmSettlementAmount, com.tools20022.repository.msg.SubscriptionExecution12.mmSettlementAmount,
					com.tools20022.repository.msg.SubscriptionOrder15.mmSettlementAmount, com.tools20022.repository.msg.RedemptionOrder15.mmSettlementAmount, com.tools20022.repository.msg.SubscriptionOrder14.mmSettlementAmount,
					com.tools20022.repository.msg.IntraPositionDetails41.mmRemainingToBeSettledQuantity, com.tools20022.repository.msg.TransactionDetails97.mmSettlementAmount,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails27.mmSettlementAmount, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails28.mmSettlementAmount,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails26.mmSettlementAmount, com.tools20022.repository.msg.TransactionDetails96.mmPostingAmount,
					com.tools20022.repository.msg.TransactionDetails95.mmPostingAmount, com.tools20022.repository.msg.IntraPositionDetails43.mmRemainingToBeSettledQuantity,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails30.mmSettlementAmount, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails29.mmSettlementAmount,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails31.mmSettlementAmount, com.tools20022.repository.msg.TransactionDetails100.mmSettlementAmount,
					com.tools20022.repository.msg.TransactionDetails99.mmPostingAmount, com.tools20022.repository.msg.TransactionDetails98.mmPostingAmount, com.tools20022.repository.msg.QuantityAndAccount57.mmPreviouslySettledAmount,
					com.tools20022.repository.msg.QuantityAndAccount57.mmRemainingToBeSettledAmount, com.tools20022.repository.msg.QuantityAndAccount62.mmPreviouslySettledAmount,
					com.tools20022.repository.msg.QuantityAndAccount62.mmRemainingToBeSettledAmount);
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementAmount";
			definition = "Amount of money settled or to be settled.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected Max35Text holdingsPlanType;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
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
	 * </ul>
	 * </li>
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
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Transfer17.mmHoldingsPlanType, com.tools20022.repository.msg.Transfer14.mmHoldingsPlanType, com.tools20022.repository.msg.Transfer24.mmHoldingsPlanType,
					com.tools20022.repository.msg.Transfer25.mmHoldingsPlanType, com.tools20022.repository.msg.Transfer16.mmHoldingsPlanType, com.tools20022.repository.msg.Transfer12.mmHoldingsPlanType,
					com.tools20022.repository.msg.Transfer20.mmHoldingsPlanType, com.tools20022.repository.msg.Transfer22.mmHoldingsPlanType, com.tools20022.repository.msg.Transfer18.mmHoldingsPlanType,
					com.tools20022.repository.msg.Transfer26.mmHoldingsPlanType, com.tools20022.repository.msg.Transfer15.mmHoldingsPlanType, com.tools20022.repository.msg.Transfer21.mmHoldingsPlanType,
					com.tools20022.repository.msg.Transfer13.mmHoldingsPlanType, com.tools20022.repository.msg.Transfer23.mmHoldingsPlanType, com.tools20022.repository.msg.Transfer11.mmHoldingsPlanType,
					com.tools20022.repository.msg.Transfer19.mmHoldingsPlanType, com.tools20022.repository.msg.Transfer27.mmHoldingsPlanType, com.tools20022.repository.msg.Transfer28.mmHoldingsPlanType,
					com.tools20022.repository.msg.Transfer29.mmHoldingsPlanType, com.tools20022.repository.msg.Transfer31.mmHoldingsPlanType, com.tools20022.repository.msg.Transfer30.mmHoldingsPlanType,
					com.tools20022.repository.msg.Transfer32.mmHoldingsPlanType, com.tools20022.repository.msg.Transfer33.mmHoldingsPlanType);
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "HoldingsPlanType";
			definition = "Identifies whether or not saving plan or withdrawal or switch plan are included in the holdings.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected ReceiveDeliveryCode securitiesMovementType;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
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
	 * </ul>
	 * </li>
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
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementTypeAndIdentification3.mmSecuritiesMovementType, com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters5.mmSecuritiesMovementType,
					com.tools20022.repository.msg.SettlementTypeAndIdentification13.mmSecuritiesMovementType, com.tools20022.repository.msg.SettlementTypeAndIdentification7.mmSecuritiesMovementType,
					com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters8.mmSecuritiesMovementType, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters3.mmSecuritiesMovementType,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters6.mmSecuritiesMovementType, com.tools20022.repository.msg.SettlementTypeAndIdentification14.mmSecuritiesMovementType,
					com.tools20022.repository.msg.SettlementTypeAndIdentification1.mmSecuritiesMovementType, com.tools20022.repository.msg.SettlementTypeAndIdentification8.mmSecuritiesMovementType,
					com.tools20022.repository.msg.SettlementTypeAndIdentification9.mmSecuritiesMovementType, com.tools20022.repository.msg.SettlementTypeAndIdentification11.mmSecuritiesMovementType,
					com.tools20022.repository.msg.SettlementTypeAndIdentification15.mmSecuritiesMovementType, com.tools20022.repository.msg.SettlementTypeAndIdentification17.mmSecuritiesMovementType,
					com.tools20022.repository.msg.SettlementTypeAndIdentification10.mmSecuritiesMovementType, com.tools20022.repository.msg.SettlementTypeAndIdentification12.mmSecuritiesMovementType,
					com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters1.mmSecuritiesMovementType, com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters4.mmSecuritiesMovementType,
					com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters9.mmSecuritiesMovementType, com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters10.mmSecuritiesMovementType,
					com.tools20022.repository.msg.TransactionDetails5.mmSecuritiesMovementType, com.tools20022.repository.msg.TransactionDetails9.mmSecuritiesMovementType,
					com.tools20022.repository.msg.TransactionDetails22.mmSecuritiesMovementType, com.tools20022.repository.msg.TransactionDetails23.mmSecuritiesMovementType,
					com.tools20022.repository.msg.TransactionDetails36.mmSecuritiesMovementType, com.tools20022.repository.msg.TransactionDetails47.mmSecuritiesMovementType,
					com.tools20022.repository.msg.TransactionDetails53.mmSecuritiesMovementType, com.tools20022.repository.msg.TransactionDetails58.mmSecuritiesMovementType,
					com.tools20022.repository.msg.TransactionDetails7.mmSecuritiesMovementType, com.tools20022.repository.msg.TransactionDetails8.mmSecuritiesMovementType,
					com.tools20022.repository.msg.TransactionDetails16.mmSecuritiesMovementType, com.tools20022.repository.msg.TransactionDetails17.mmSecuritiesMovementType,
					com.tools20022.repository.msg.TransactionDetails26.mmSecuritiesMovementType, com.tools20022.repository.msg.TransactionDetails25.mmSecuritiesMovementType,
					com.tools20022.repository.msg.TransactionDetails27.mmSecuritiesMovementType, com.tools20022.repository.msg.TransactionDetails33.mmSecuritiesMovementType,
					com.tools20022.repository.msg.TransactionDetails39.mmSecuritiesMovementType, com.tools20022.repository.msg.TransactionDetails50.mmSecuritiesMovementType,
					com.tools20022.repository.msg.TransactionDetails56.mmSecuritiesMovementType, com.tools20022.repository.msg.TransactionDetails59.mmSecuritiesMovementType,
					com.tools20022.repository.msg.TransactionDetails6.mmSecuritiesMovementType, com.tools20022.repository.msg.TransactionDetails18.mmSecuritiesMovementType,
					com.tools20022.repository.msg.TransactionDetails24.mmSecuritiesMovementType, com.tools20022.repository.msg.TransactionDetails34.mmSecuritiesMovementType,
					com.tools20022.repository.msg.TransactionDetails37.mmSecuritiesMovementType, com.tools20022.repository.msg.TransactionDetails48.mmSecuritiesMovementType,
					com.tools20022.repository.msg.TransactionDetails57.mmSecuritiesMovementType, com.tools20022.repository.msg.TransactionDetails60.mmSecuritiesMovementType,
					com.tools20022.repository.msg.SecuritiesTradeDetails7.mmSecuritiesMovementType, com.tools20022.repository.msg.SecuritiesTradeDetails19.mmSecuritiesMovementType,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2.mmSecuritiesMovementType, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8.mmSecuritiesMovementType,
					com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters2.mmSecuritiesMovementType, com.tools20022.repository.msg.SecuritiesTradeDetails4.mmSecuritiesMovementType,
					com.tools20022.repository.msg.SecuritiesTradeDetails17.mmSecuritiesMovementType, com.tools20022.repository.msg.SettlementTypeAndIdentification4.mmSecuritiesMovementType,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6.mmSecuritiesMovementType, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10.mmSecuritiesMovementType,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17.mmSecuritiesMovementType, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18.mmSecuritiesMovementType,
					com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters3.mmSecuritiesMovementType, com.tools20022.repository.msg.SecuritiesTradeDetails10.mmSecuritiesMovementType,
					com.tools20022.repository.msg.SecuritiesTradeDetails22.mmSecuritiesMovementType, com.tools20022.repository.msg.SecuritiesTradeDetails23.mmSecuritiesMovementType,
					com.tools20022.repository.msg.SecuritiesTradeDetails29.mmSecuritiesMovementType, com.tools20022.repository.msg.TransactionDetails40.mmSecuritiesMovementType,
					com.tools20022.repository.msg.TransactionDetails42.mmSecuritiesMovementType, com.tools20022.repository.msg.TransactionDetails46.mmSecuritiesMovementType,
					com.tools20022.repository.msg.SettlementTypeAndIdentification6.mmSecuritiesMovementType, com.tools20022.repository.msg.SecuritiesTradeDetails14.mmSecuritiesMovementType,
					com.tools20022.repository.msg.SecuritiesTradeDetails20.mmSecuritiesMovementType, com.tools20022.repository.msg.SecuritiesTradeDetails24.mmSecuritiesMovementType,
					com.tools20022.repository.msg.SecuritiesTradeDetails30.mmSecuritiesMovementType, com.tools20022.repository.msg.TransactionDetails45.mmSecuritiesMovementType,
					com.tools20022.repository.msg.SettlementObligation3.mmSecuritiesMovementType, com.tools20022.repository.msg.SettlementObligation5.mmSecuritiesMovementType,
					com.tools20022.repository.msg.SettlementObligation4.mmSecuritiesMovementType, com.tools20022.repository.msg.NetPosition1.mmSecuritiesMovementType, com.tools20022.repository.msg.NetPosition2.mmSecuritiesMovementType,
					com.tools20022.repository.msg.TransactionDetails51.mmSecuritiesMovementType, com.tools20022.repository.msg.TransactionDetails61.mmSecuritiesMovementType,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21.mmSecuritiesMovementType, com.tools20022.repository.msg.TransactionDetails62.mmSecuritiesMovementType,
					com.tools20022.repository.msg.TransactionDetails63.mmSecuritiesMovementType, com.tools20022.repository.msg.SecuritiesTradeDetails35.mmSecuritiesMovementType,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22.mmSecuritiesMovementType, com.tools20022.repository.msg.TransactionDetails66.mmSecuritiesMovementType,
					com.tools20022.repository.msg.SecuritiesTradeDetails42.mmSecuritiesMovementType, com.tools20022.repository.msg.TransactionDetails67.mmSecuritiesMovementType,
					com.tools20022.repository.msg.TransactionDetails68.mmSecuritiesMovementType, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24.mmSecuritiesMovementType,
					com.tools20022.repository.msg.TransactionDetails70.mmSecuritiesMovementType, com.tools20022.repository.msg.TransactionDetails69.mmSecuritiesMovementType,
					com.tools20022.repository.msg.NetPosition3.mmSecuritiesMovementType, com.tools20022.repository.msg.SettlementObligation8.mmSecuritiesMovementType,
					com.tools20022.repository.msg.TransactionDetails71.mmSecuritiesMovementType, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25.mmSecuritiesMovementType,
					com.tools20022.repository.msg.TransactionDetails72.mmSecuritiesMovementType, com.tools20022.repository.msg.TransactionDetails81.mmSecuritiesMovementType,
					com.tools20022.repository.msg.SecuritiesTradeDetails49.mmSecuritiesMovementType, com.tools20022.repository.msg.TransactionDetails82.mmSecuritiesMovementType,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26.mmSecuritiesMovementType, com.tools20022.repository.msg.TransactionDetails79.mmSecuritiesMovementType,
					com.tools20022.repository.msg.SecuritiesTradeDetails48.mmSecuritiesMovementType, com.tools20022.repository.msg.TransactionDetails75.mmSecuritiesMovementType,
					com.tools20022.repository.msg.TransactionDetails78.mmSecuritiesMovementType, com.tools20022.repository.msg.SettlementTypeAndIdentification18.mmSecuritiesMovementType,
					com.tools20022.repository.msg.SettlementTypeAndIdentification19.mmSecuritiesMovementType, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters10.mmSecuritiesMovementType,
					com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters11.mmSecuritiesMovementType, com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters12.mmSecuritiesMovementType,
					com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters14.mmSecuritiesMovementType, com.tools20022.repository.msg.SecuritiesTradeDetails57.mmSecuritiesMovementType,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmSecuritiesMovementType, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters12.mmSecuritiesMovementType,
					com.tools20022.repository.msg.SecuritiesTradeDetails61.mmSecuritiesMovementType, com.tools20022.repository.msg.TransactionDetails92.mmSecuritiesMovementType,
					com.tools20022.repository.msg.TransactionDetails84.mmSecuritiesMovementType, com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters16.mmSecuritiesMovementType,
					com.tools20022.repository.msg.SettlementTypeAndIdentification24.mmSecuritiesMovementType, com.tools20022.repository.msg.TransactionDetails87.mmSecuritiesMovementType,
					com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters15.mmSecuritiesMovementType, com.tools20022.repository.msg.TransactionDetails91.mmSecuritiesMovementType,
					com.tools20022.repository.msg.TransactionDetails90.mmSecuritiesMovementType, com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters18.mmSecuritiesMovementType,
					com.tools20022.repository.msg.SettlementTypeAndIdentification22.mmSecuritiesMovementType, com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters19.mmSecuritiesMovementType,
					com.tools20022.repository.msg.SecuritiesTradeDetails68.mmSecuritiesMovementType, com.tools20022.repository.msg.TransactionDetails97.mmSecuritiesMovementType,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters16.mmSecuritiesMovementType, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35.mmSecuritiesMovementType,
					com.tools20022.repository.msg.TransactionDetails96.mmSecuritiesMovementType, com.tools20022.repository.msg.TransactionDetails95.mmSecuritiesMovementType,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters19.mmSecuritiesMovementType, com.tools20022.repository.msg.SecuritiesTradeDetails69.mmSecuritiesMovementType,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36.mmSecuritiesMovementType, com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters20.mmSecuritiesMovementType,
					com.tools20022.repository.msg.TransactionDetails100.mmSecuritiesMovementType, com.tools20022.repository.msg.TransactionDetails99.mmSecuritiesMovementType,
					com.tools20022.repository.msg.TransactionDetails98.mmSecuritiesMovementType);
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesMovementType";
			definition = "Specifies if the movement on a securities account results from a deliver or a receive instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ReceiveDeliveryCode.mmObject();
		}
	};
	protected SecuritiesQuantity settlementQuantity;
	/**
	 * Total quantity of securities to be settled.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
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
	 * </ul>
	 * </li>
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
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionDetails10.mmSettlementQuantity, com.tools20022.repository.msg.TransactionDetails29.mmSettlementQuantity,
					com.tools20022.repository.msg.QuantityAndAccount30.mmSettlementQuantity, com.tools20022.repository.msg.TransactionDetails28.mmSettlementQuantity, com.tools20022.repository.msg.TransactionDetails31.mmSettlementQuantity,
					com.tools20022.repository.msg.TransactionDetails44.mmSettlementQuantity, com.tools20022.repository.msg.QuantityAndAccount33.mmSettlementQuantity,
					com.tools20022.repository.msg.IntraPositionMovementDetails1.mmRemainingToBeSettledQuantity, com.tools20022.repository.msg.IntraPositionMovementDetails2.mmRemainingToBeSettledQuantity,
					com.tools20022.repository.msg.IntraPositionMovementDetails5.mmRemainingToBeSettledQuantity, com.tools20022.repository.msg.IntraPositionMovementDetails6.mmRemainingToBeSettledQuantity,
					com.tools20022.repository.msg.IntraPositionMovementDetails7.mmRemainingToBeSettledQuantity, com.tools20022.repository.msg.IntraPositionMovementDetails8.mmRemainingToBeSettledQuantity,
					com.tools20022.repository.msg.IntraPositionMovementDetails9.mmRemainingToBeSettledQuantity, com.tools20022.repository.msg.IntraPositionMovementDetails10.mmRemainingToBeSettledQuantity,
					com.tools20022.repository.msg.QuantityAndAccount6.mmSettledQuantity, com.tools20022.repository.msg.QuantityAndAccount6.mmPreviouslySettledQuantity,
					com.tools20022.repository.msg.QuantityAndAccount6.mmRemainingToBeSettledQuantity, com.tools20022.repository.msg.QuantityAndAccount11.mmSettledQuantity,
					com.tools20022.repository.msg.QuantityAndAccount11.mmPreviouslySettledQuantity, com.tools20022.repository.msg.QuantityAndAccount11.mmRemainingToBeSettledQuantity,
					com.tools20022.repository.msg.QuantityAndAccount18.mmSettledQuantity, com.tools20022.repository.msg.QuantityAndAccount18.mmPreviouslySettledQuantity,
					com.tools20022.repository.msg.QuantityAndAccount18.mmRemainingToBeSettledQuantity, com.tools20022.repository.msg.QuantityAndAccount19.mmSettledQuantity,
					com.tools20022.repository.msg.QuantityAndAccount19.mmPreviouslySettledQuantity, com.tools20022.repository.msg.QuantityAndAccount19.mmRemainingToBeSettledQuantity,
					com.tools20022.repository.msg.QuantityAndAccount1.mmSettlementQuantity, com.tools20022.repository.msg.QuantityAndAccount5.mmSettlementQuantity, com.tools20022.repository.msg.QuantityAndAccount17.mmSettlementQuantity,
					com.tools20022.repository.msg.QuantityAndAccount24.mmSettlementQuantity, com.tools20022.repository.msg.QuantityAndAccount25.mmSettlementQuantity, com.tools20022.repository.msg.QuantityAndAccount34.mmSettlementQuantity,
					com.tools20022.repository.msg.QuantityAndAccount2.mmSettledQuantity, com.tools20022.repository.msg.QuantityAndAccount2.mmPreviouslySettledQuantity,
					com.tools20022.repository.msg.QuantityAndAccount2.mmRemainingToBeSettledQuantity, com.tools20022.repository.msg.QuantityAndAccount12.mmSettledQuantity,
					com.tools20022.repository.msg.QuantityAndAccount12.mmPreviouslySettledQuantity, com.tools20022.repository.msg.QuantityAndAccount12.mmRemainingToBeSettledQuantity,
					com.tools20022.repository.msg.QuantityAndAccount15.mmSettledQuantity, com.tools20022.repository.msg.QuantityAndAccount15.mmPreviouslySettledQuantity,
					com.tools20022.repository.msg.QuantityAndAccount15.mmRemainingToBeSettledQuantity, com.tools20022.repository.msg.QuantityAndAccount20.mmSettledQuantity,
					com.tools20022.repository.msg.QuantityAndAccount20.mmPreviouslySettledQuantity, com.tools20022.repository.msg.QuantityAndAccount20.mmRemainingToBeSettledQuantity,
					com.tools20022.repository.msg.QuantityAndAccount28.mmSettledQuantity, com.tools20022.repository.msg.QuantityAndAccount28.mmPreviouslySettledQuantity,
					com.tools20022.repository.msg.QuantityAndAccount28.mmRemainingToBeSettledQuantity, com.tools20022.repository.msg.QuantityAndAccount37.mmSettledQuantity,
					com.tools20022.repository.msg.QuantityAndAccount37.mmPreviouslySettledQuantity, com.tools20022.repository.msg.QuantityAndAccount37.mmRemainingToBeSettledQuantity,
					com.tools20022.repository.msg.TransactionDetails5.mmSettlementQuantity, com.tools20022.repository.msg.TransactionDetails9.mmSettlementQuantity, com.tools20022.repository.msg.TransactionDetails22.mmSettlementQuantity,
					com.tools20022.repository.msg.TransactionDetails23.mmSettlementQuantity, com.tools20022.repository.msg.TransactionDetails36.mmSettlementQuantity, com.tools20022.repository.msg.TransactionDetails47.mmSettlementQuantity,
					com.tools20022.repository.msg.TransactionDetails53.mmSettlementQuantity, com.tools20022.repository.msg.TransactionDetails58.mmSettlementQuantity, com.tools20022.repository.msg.TransactionDetails7.mmPostingQuantity,
					com.tools20022.repository.msg.TransactionDetails8.mmPostingQuantity, com.tools20022.repository.msg.TransactionDetails16.mmPostingQuantity, com.tools20022.repository.msg.TransactionDetails17.mmPostingQuantity,
					com.tools20022.repository.msg.TransactionDetails26.mmPostingQuantity, com.tools20022.repository.msg.TransactionDetails25.mmPostingQuantity, com.tools20022.repository.msg.TransactionDetails27.mmPostingQuantity,
					com.tools20022.repository.msg.TransactionDetails33.mmPostingQuantity, com.tools20022.repository.msg.TransactionDetails39.mmPostingQuantity, com.tools20022.repository.msg.TransactionDetails50.mmPostingQuantity,
					com.tools20022.repository.msg.TransactionDetails56.mmPostingQuantity, com.tools20022.repository.msg.TransactionDetails59.mmPostingQuantity, com.tools20022.repository.msg.TransactionDetails6.mmPostingQuantity,
					com.tools20022.repository.msg.TransactionDetails18.mmPostingQuantity, com.tools20022.repository.msg.TransactionDetails24.mmPostingQuantity, com.tools20022.repository.msg.TransactionDetails34.mmPostingQuantity,
					com.tools20022.repository.msg.TransactionDetails37.mmPostingQuantity, com.tools20022.repository.msg.TransactionDetails48.mmPostingQuantity, com.tools20022.repository.msg.TransactionDetails57.mmPostingQuantity,
					com.tools20022.repository.msg.TransactionDetails60.mmPostingQuantity, com.tools20022.repository.msg.Quantity5.mmSettlementQuantity, com.tools20022.repository.msg.QuantityAndAccount7.mmSettlementQuantity,
					com.tools20022.repository.msg.QuantityAndAccount16.mmSettlementQuantity, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2.mmSettlementQuantity,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8.mmSettlementQuantity, com.tools20022.repository.msg.QuantityAndAccount3.mmSettlementQuantity,
					com.tools20022.repository.msg.QuantityAndAccount13.mmSettlementQuantity, com.tools20022.repository.msg.QuantityAndAccount8.mmSettlementQuantity, com.tools20022.repository.msg.QuantityAndAccount14.mmSettlementQuantity,
					com.tools20022.repository.msg.TransactionDetails4.mmSettlementQuantity, com.tools20022.repository.msg.TransactionDetails30.mmSettlementQuantity, com.tools20022.repository.msg.QuantityAndAccount10.mmSettlementQuantity,
					com.tools20022.repository.msg.QuantityAndAccount21.mmSettlementQuantity, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6.mmSettlementQuantity,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10.mmSettlementQuantity, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17.mmSettlementQuantity,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18.mmSettlementQuantity, com.tools20022.repository.msg.TransactionDetails20.mmSettlementQuantity,
					com.tools20022.repository.msg.QuantityAndAccount4.mmSettlementQuantity, com.tools20022.repository.msg.QuantityAndAccount22.mmSettlementQuantity, com.tools20022.repository.msg.QuantityAndAccount27.mmSettlementQuantity,
					com.tools20022.repository.msg.QuantityAndAccount36.mmSettlementQuantity, com.tools20022.repository.msg.QuantityAndAccount9.mmSettlementQuantity, com.tools20022.repository.msg.QuantityAndAccount23.mmSettlementQuantity,
					com.tools20022.repository.msg.QuantityAndAccount26.mmSettlementQuantity, com.tools20022.repository.msg.QuantityAndAccount35.mmSettlementQuantity, com.tools20022.repository.msg.TransactionDetails40.mmSettlementQuantity,
					com.tools20022.repository.msg.TransactionDetails42.mmSettlementQuantity, com.tools20022.repository.msg.TransactionDetails46.mmSettlementQuantity, com.tools20022.repository.msg.TransactionDetails32.mmSettlementQuantity,
					com.tools20022.repository.msg.TransactionDetails14.mmSettlementQuantity, com.tools20022.repository.msg.TransactionDetails35.mmSettlementQuantity, com.tools20022.repository.msg.Quantity6.mmSettlementQuantity,
					com.tools20022.repository.msg.Quantity7.mmSettlementQuantity, com.tools20022.repository.msg.Quantity8.mmSettlementQuantity, com.tools20022.repository.msg.TransactionDetails45.mmSettlementQuantity,
					com.tools20022.repository.msg.SettlementObligation1.mmRemainingQuantityToBeSettled, com.tools20022.repository.msg.IntraPositionMovementDetails3.mmRemainingToBeSettledQuantity,
					com.tools20022.repository.msg.IntraPositionMovementDetails4.mmRemainingToBeSettledQuantity, com.tools20022.repository.msg.TransactionDetails51.mmSettlementQuantity,
					com.tools20022.repository.msg.TransactionDetails51.mmSettledQuantity, com.tools20022.repository.msg.TransactionDetails51.mmPreviouslySettledQuantity,
					com.tools20022.repository.msg.TransactionDetails51.mmRemainingToBeSettledQuantity, com.tools20022.repository.msg.TransactionDetails52.mmSettlementQuantity,
					com.tools20022.repository.msg.TransactionDetails61.mmSettlementQuantity, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21.mmSettlementQuantity,
					com.tools20022.repository.msg.TransactionDetails62.mmPostingQuantity, com.tools20022.repository.msg.TransactionDetails63.mmPostingQuantity,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22.mmSettlementQuantity, com.tools20022.repository.msg.TransactionDetails66.mmSettlementQuantity,
					com.tools20022.repository.msg.TransactionDetails67.mmPostingQuantity, com.tools20022.repository.msg.TransactionDetails68.mmPostingQuantity,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24.mmSettlementQuantity, com.tools20022.repository.msg.TransactionDetails70.mmSettlementQuantity,
					com.tools20022.repository.msg.TransactionDetails69.mmPostingQuantity, com.tools20022.repository.msg.TransactionDetails71.mmSettlementQuantity,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25.mmSettlementQuantity, com.tools20022.repository.msg.TransactionDetails72.mmPostingQuantity,
					com.tools20022.repository.msg.QuantityAndAccount39.mmSettlementQuantity, com.tools20022.repository.msg.QuantityAndAccount41.mmSettledQuantity,
					com.tools20022.repository.msg.QuantityAndAccount41.mmPreviouslySettledQuantity, com.tools20022.repository.msg.QuantityAndAccount41.mmRemainingToBeSettledQuantity,
					com.tools20022.repository.msg.QuantityAndAccount40.mmSettledQuantity, com.tools20022.repository.msg.QuantityAndAccount40.mmPreviouslySettledQuantity,
					com.tools20022.repository.msg.QuantityAndAccount40.mmRemainingToBeSettledQuantity, com.tools20022.repository.msg.TransactionDetails81.mmSettlementQuantity,
					com.tools20022.repository.msg.QuantityAndAccount42.mmSettlementQuantity, com.tools20022.repository.msg.TransactionDetails74.mmSettlementQuantity, com.tools20022.repository.msg.TransactionDetails82.mmSettlementQuantity,
					com.tools20022.repository.msg.QuantityAndAccount38.mmSettlementQuantity, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26.mmSettlementQuantity,
					com.tools20022.repository.msg.TransactionDetails79.mmSettlementQuantity, com.tools20022.repository.msg.TransactionDetails80.mmSettlementQuantity, com.tools20022.repository.msg.QuantityAndAccount43.mmSettlementQuantity,
					com.tools20022.repository.msg.TransactionDetails75.mmPostingQuantity, com.tools20022.repository.msg.TransactionDetails78.mmPostingQuantity, com.tools20022.repository.msg.Quantity11.mmSettlementQuantity,
					com.tools20022.repository.msg.QuantityAndAccount45.mmSettlementQuantity, com.tools20022.repository.msg.IntraPositionMovementDetails11.mmRemainingToBeSettledQuantity,
					com.tools20022.repository.msg.QuantityAndAccount47.mmSettlementQuantity, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmSettlementQuantity,
					com.tools20022.repository.msg.QuantityAndAccount48.mmSettlementQuantity, com.tools20022.repository.msg.TransactionDetails88.mmSettlementQuantity, com.tools20022.repository.msg.QuantityAndAccount46.mmSettledQuantity,
					com.tools20022.repository.msg.QuantityAndAccount46.mmPreviouslySettledQuantity, com.tools20022.repository.msg.QuantityAndAccount46.mmRemainingToBeSettledQuantity,
					com.tools20022.repository.msg.TransactionDetails92.mmSettlementQuantity, com.tools20022.repository.msg.TransactionDetails84.mmSettlementQuantity, com.tools20022.repository.msg.TransactionDetails83.mmSettlementQuantity,
					com.tools20022.repository.msg.QuantityAndAccount51.mmSettledQuantity, com.tools20022.repository.msg.QuantityAndAccount51.mmPreviouslySettledQuantity,
					com.tools20022.repository.msg.QuantityAndAccount51.mmRemainingToBeSettledQuantity, com.tools20022.repository.msg.TransactionDetails87.mmSettlementQuantity,
					com.tools20022.repository.msg.QuantityAndAccount49.mmSettlementQuantity, com.tools20022.repository.msg.Quantity12.mmSettlementQuantity, com.tools20022.repository.msg.TransactionDetails91.mmPostingQuantity,
					com.tools20022.repository.msg.QuantityAndAccount50.mmSettlementQuantity, com.tools20022.repository.msg.TransactionDetails90.mmPostingQuantity, com.tools20022.repository.msg.QuantityAndAccount55.mmSettlementQuantity,
					com.tools20022.repository.msg.IntraPositionMovementDetails12.mmRemainingToBeSettledQuantity, com.tools20022.repository.msg.TransactionDetails97.mmSettlementQuantity,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35.mmSettlementQuantity, com.tools20022.repository.msg.TransactionDetails96.mmPostingQuantity,
					com.tools20022.repository.msg.IntraPositionMovementDetails13.mmRemainingToBeSettledQuantity, com.tools20022.repository.msg.TransactionDetails95.mmPostingQuantity,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36.mmSettlementQuantity, com.tools20022.repository.msg.IntraPositionMovementDetails14.mmRemainingToBeSettledQuantity,
					com.tools20022.repository.msg.TransactionDetails100.mmSettlementQuantity, com.tools20022.repository.msg.TransactionDetails99.mmPostingQuantity, com.tools20022.repository.msg.TransactionDetails98.mmPostingQuantity,
					com.tools20022.repository.msg.QuantityAndAccount57.mmSettledQuantity, com.tools20022.repository.msg.QuantityAndAccount57.mmPreviouslySettledQuantity,
					com.tools20022.repository.msg.QuantityAndAccount57.mmRemainingToBeSettledQuantity, com.tools20022.repository.msg.QuantityAndAccount58.mmSettlementQuantity,
					com.tools20022.repository.msg.QuantityAndAccount56.mmSettlementQuantity, com.tools20022.repository.msg.QuantityAndAccount61.mmSettlementQuantity, com.tools20022.repository.msg.QuantityAndAccount62.mmSettledQuantity,
					com.tools20022.repository.msg.QuantityAndAccount62.mmPreviouslySettledQuantity, com.tools20022.repository.msg.QuantityAndAccount62.mmRemainingToBeSettledQuantity,
					com.tools20022.repository.msg.QuantityAndAccount60.mmSettlementQuantity);
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementQuantity";
			definition = "Total quantity of securities to be settled.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmSecuritiesSettlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected SecuritiesTradeExecution securitiesTradeExecution;
	/**
	 * Specifies the trade which originates the settlement process.
	 * <p>
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
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTradeExecution";
			definition = "Specifies the trade which originates the settlement process.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeExecution.mmSecuritiesSettlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeExecution.mmObject();
		}
	};
	protected CurrencyCode currencyToBuy;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
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
	 * </ul>
	 * </li>
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
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CurrencyToBuyOrSell1Choice.mmCurrencyToBuy, com.tools20022.repository.msg.CorporateActionOption5.mmCurrencyToBuy,
					com.tools20022.repository.msg.CorporateActionOption13.mmCurrencyToBuy, com.tools20022.repository.msg.CorporateActionOption25.mmCurrencyToBuy, com.tools20022.repository.msg.CorporateActionOption30.mmCurrencyToBuy,
					com.tools20022.repository.msg.CorporateActionOption38.mmCurrencyToBuy, com.tools20022.repository.msg.CorporateActionOption47.mmCurrencyToBuy, com.tools20022.repository.msg.CorporateActionOption57.mmCurrencyToBuy,
					com.tools20022.repository.msg.CorporateActionOption58.mmCurrencyToBuy, com.tools20022.repository.msg.CorporateActionOption103.mmCurrencyToBuy, com.tools20022.repository.msg.CorporateActionOption107.mmCurrencyToBuy,
					com.tools20022.repository.msg.CorporateActionOption118.mmCurrencyToBuy, com.tools20022.repository.msg.CorporateActionOption123.mmCurrencyToBuy, com.tools20022.repository.msg.CorporateActionOption131.mmCurrencyToBuy,
					com.tools20022.repository.msg.CorporateActionOption134.mmCurrencyToBuy);
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyToBuy";
			definition = "Account servicer is instructed to buy the indicated currency after the receipt of cash proceeds.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	protected CurrencyCode currencyToSell;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
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
	 * </ul>
	 * </li>
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
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CurrencyToBuyOrSell1Choice.mmCurrencyToSell, com.tools20022.repository.msg.CorporateActionOption5.mmCurrencyToSell,
					com.tools20022.repository.msg.CorporateActionOption13.mmCurrencyToSell, com.tools20022.repository.msg.CorporateActionOption25.mmCurrencyToSell, com.tools20022.repository.msg.CorporateActionOption30.mmCurrencyToSell,
					com.tools20022.repository.msg.CorporateActionOption38.mmCurrencyToSell, com.tools20022.repository.msg.CorporateActionOption47.mmCurrencyToSell, com.tools20022.repository.msg.CorporateActionOption57.mmCurrencyToSell,
					com.tools20022.repository.msg.CorporateActionOption58.mmCurrencyToSell, com.tools20022.repository.msg.CorporateActionOption103.mmCurrencyToSell, com.tools20022.repository.msg.CorporateActionOption107.mmCurrencyToSell,
					com.tools20022.repository.msg.CorporateActionOption118.mmCurrencyToSell, com.tools20022.repository.msg.CorporateActionOption123.mmCurrencyToSell, com.tools20022.repository.msg.CorporateActionOption131.mmCurrencyToSell,
					com.tools20022.repository.msg.CorporateActionOption134.mmCurrencyToSell);
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyToSell";
			definition = "Account servicer is instructed to sell a currency in order to obtain the currency needed to fund the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	protected Max35Text denominationChoice;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
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
	 * </ul>
	 * </li>
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
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.QuantityAndAccount29.mmDenominationChoice, com.tools20022.repository.msg.QuantityAndAccount30.mmDenominationChoice,
					com.tools20022.repository.msg.QuantityAndAccount32.mmDenominationChoice, com.tools20022.repository.msg.QuantityAndAccount33.mmDenominationChoice, com.tools20022.repository.msg.QuantityAndAccount1.mmDenominationChoice,
					com.tools20022.repository.msg.QuantityAndAccount5.mmDenominationChoice, com.tools20022.repository.msg.QuantityAndAccount17.mmDenominationChoice, com.tools20022.repository.msg.QuantityAndAccount24.mmDenominationChoice,
					com.tools20022.repository.msg.QuantityAndAccount25.mmDenominationChoice, com.tools20022.repository.msg.QuantityAndAccount34.mmDenominationChoice, com.tools20022.repository.msg.QuantityAndAccount2.mmDenominationChoice,
					com.tools20022.repository.msg.QuantityAndAccount12.mmDenominationChoice, com.tools20022.repository.msg.QuantityAndAccount15.mmDenominationChoice, com.tools20022.repository.msg.QuantityAndAccount20.mmDenominationChoice,
					com.tools20022.repository.msg.QuantityAndAccount28.mmDenominationChoice, com.tools20022.repository.msg.QuantityAndAccount37.mmDenominationChoice, com.tools20022.repository.msg.Quantity5.mmDenominationChoice,
					com.tools20022.repository.msg.QuantityAndAccount3.mmDenominationChoice, com.tools20022.repository.msg.QuantityAndAccount13.mmDenominationChoice, com.tools20022.repository.msg.QuantityAndAccount8.mmDenominationChoice,
					com.tools20022.repository.msg.QuantityAndAccount14.mmDenominationChoice, com.tools20022.repository.msg.QuantityAndAccount4.mmDenominationChoice, com.tools20022.repository.msg.QuantityAndAccount22.mmDenominationChoice,
					com.tools20022.repository.msg.QuantityAndAccount27.mmDenominationChoice, com.tools20022.repository.msg.QuantityAndAccount36.mmDenominationChoice, com.tools20022.repository.msg.QuantityAndAccount9.mmDenominationChoice,
					com.tools20022.repository.msg.QuantityAndAccount23.mmDenominationChoice, com.tools20022.repository.msg.QuantityAndAccount26.mmDenominationChoice, com.tools20022.repository.msg.QuantityAndAccount35.mmDenominationChoice,
					com.tools20022.repository.msg.Quantity6.mmDenominationChoice, com.tools20022.repository.msg.Quantity7.mmDenominationChoice, com.tools20022.repository.msg.Quantity8.mmDenominationChoice,
					com.tools20022.repository.msg.QuantityAndAccount39.mmDenominationChoice, com.tools20022.repository.msg.QuantityAndAccount41.mmDenominationChoice, com.tools20022.repository.msg.QuantityAndAccount42.mmDenominationChoice,
					com.tools20022.repository.msg.QuantityAndAccount43.mmDenominationChoice, com.tools20022.repository.msg.Quantity11.mmDenominationChoice, com.tools20022.repository.msg.QuantityAndAccount45.mmDenominationChoice,
					com.tools20022.repository.msg.QuantityAndAccount44.mmDenominationChoice, com.tools20022.repository.msg.QuantityAndAccount47.mmDenominationChoice, com.tools20022.repository.msg.QuantityAndAccount51.mmDenominationChoice,
					com.tools20022.repository.msg.QuantityAndAccount49.mmDenominationChoice, com.tools20022.repository.msg.Quantity12.mmDenominationChoice, com.tools20022.repository.msg.QuantityAndAccount50.mmDenominationChoice,
					com.tools20022.repository.msg.QuantityAndAccount55.mmDenominationChoice, com.tools20022.repository.msg.QuantityAndAccount54.mmDenominationChoice, com.tools20022.repository.msg.QuantityAndAccount57.mmDenominationChoice,
					com.tools20022.repository.msg.QuantityAndAccount58.mmDenominationChoice, com.tools20022.repository.msg.QuantityAndAccount56.mmDenominationChoice, com.tools20022.repository.msg.QuantityAndAccount59.mmDenominationChoice,
					com.tools20022.repository.msg.QuantityAndAccount60.mmDenominationChoice);
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DenominationChoice";
			definition = "Denomination (stated value found on financial instruments) of the security to be received or delivered.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected SettlementTransactionConditionCode settlementTransactionCondition;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
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
	 * </ul>
	 * </li>
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
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.SettlementTransactionCondition1Choice.mmCode, com.tools20022.repository.choice.SettlementTransactionCondition1Choice.mmProprietary,
					com.tools20022.repository.choice.SettlementTransactionCondition6Choice.mmCode, com.tools20022.repository.choice.SettlementTransactionCondition6Choice.mmProprietary,
					com.tools20022.repository.choice.SettlementTransactionCondition12Choice.mmCode, com.tools20022.repository.choice.SettlementTransactionCondition12Choice.mmProprietary,
					com.tools20022.repository.msg.SettlementDetails50.mmSettlementTransactionCondition, com.tools20022.repository.choice.SettlementTransactionCondition14Choice.mmCode,
					com.tools20022.repository.choice.SettlementTransactionCondition14Choice.mmProprietary, com.tools20022.repository.msg.SettlementDetails51.mmSettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails9.mmSettlementTransactionCondition, com.tools20022.repository.choice.SettlementTransactionCondition3Choice.mmCode,
					com.tools20022.repository.choice.SettlementTransactionCondition3Choice.mmProprietary, com.tools20022.repository.msg.SettlementDetails17.mmSettlementTransactionCondition,
					com.tools20022.repository.choice.SettlementTransactionCondition7Choice.mmCode, com.tools20022.repository.choice.SettlementTransactionCondition7Choice.mmProprietary,
					com.tools20022.repository.msg.SettlementDetails30.mmSettlementTransactionCondition, com.tools20022.repository.choice.SettlementTransactionCondition8Choice.mmCode,
					com.tools20022.repository.choice.SettlementTransactionCondition8Choice.mmProprietary, com.tools20022.repository.msg.SettlementDetails32.mmSettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails60.mmSettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails60.mmPartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails64.mmSettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails64.mmPartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails3.mmSettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails16.mmSettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails31.mmSettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails40.mmSettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails62.mmSettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails62.mmPartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails63.mmSettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails63.mmPartialSettlementIndicator,
					com.tools20022.repository.msg.RequestDetails6.mmPartialSettlementIndicator, com.tools20022.repository.msg.RequestDetails7.mmPartialSettlementIndicator,
					com.tools20022.repository.msg.RequestDetails8.mmPartialSettlementIndicator, com.tools20022.repository.msg.RequestDetails9.mmPartialSettlementIndicator,
					com.tools20022.repository.msg.RequestDetails11.mmPartialSettlementIndicator, com.tools20022.repository.msg.RequestDetails12.mmPartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails6.mmSettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails20.mmSettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails24.mmSettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails24.mmPartialSettlementIndicator,
					com.tools20022.repository.choice.SettlementTransactionCondition9Choice.mmCode, com.tools20022.repository.choice.SettlementTransactionCondition9Choice.mmProprietary,
					com.tools20022.repository.msg.SettlementDetails33.mmSettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails33.mmPartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails45.mmSettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails45.mmPartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails54.mmSettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails54.mmPartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails1.mmSettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails19.mmSettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails22.mmSettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails22.mmPartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails35.mmSettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails35.mmPartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails42.mmSettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails42.mmPartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails52.mmSettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails52.mmPartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails8.mmSettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails11.mmSettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails23.mmSettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails23.mmPartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails37.mmSettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails37.mmPartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails44.mmSettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails44.mmPartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails53.mmSettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails53.mmPartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails7.mmSettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails12.mmSettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails28.mmSettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails28.mmPartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails38.mmSettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails38.mmPartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails47.mmSettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails47.mmPartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails56.mmSettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails56.mmPartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails2.mmSettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails13.mmSettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails27.mmSettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails27.mmPartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails39.mmSettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails39.mmPartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails48.mmSettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails48.mmPartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails57.mmSettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails57.mmPartialSettlementIndicator,
					com.tools20022.repository.choice.SettlementTransactionCondition2Choice.mmCode, com.tools20022.repository.choice.SettlementTransactionCondition2Choice.mmProprietary,
					com.tools20022.repository.choice.SettlementTransactionCondition11Choice.mmCode, com.tools20022.repository.choice.SettlementTransactionCondition11Choice.mmProprietary,
					com.tools20022.repository.msg.SettlementDetails43.mmSettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails4.mmSettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails10.mmSettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails29.mmSettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails5.mmSettlementTransactionCondition, com.tools20022.repository.choice.SettlementTransactionCondition5Choice.mmCode,
					com.tools20022.repository.choice.SettlementTransactionCondition5Choice.mmProprietary, com.tools20022.repository.msg.SettlementDetails25.mmSettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails26.mmSettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails26.mmPartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails65.mmSettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails65.mmPartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails14.mmSettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails41.mmSettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails61.mmSettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails61.mmPartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails59.mmSettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails59.mmPartialSettlementIndicator,
					com.tools20022.repository.choice.SettlementTransactionCondition4Choice.mmCode, com.tools20022.repository.choice.SettlementTransactionCondition4Choice.mmProprietary,
					com.tools20022.repository.msg.SettlementDetails15.mmSettlementTransactionCondition, com.tools20022.repository.choice.SettlementTransactionCondition10Choice.mmCode,
					com.tools20022.repository.choice.SettlementTransactionCondition10Choice.mmProprietary, com.tools20022.repository.msg.SettlementDetails34.mmSettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails49.mmSettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails49.mmPartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails58.mmSettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails58.mmPartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails36.mmSettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails36.mmPartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails18.mmSettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails66.mmSettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails66.mmPartialSettlementIndicator, com.tools20022.repository.msg.SettlementInstructionQueryCriteria1.mmPartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails67.mmSettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails67.mmPartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails70.mmSettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails70.mmPartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails68.mmSettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails69.mmSettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails69.mmPartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails71.mmSettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails71.mmPartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails72.mmSettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails72.mmPartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails75.mmSettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails75.mmPartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails73.mmSettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails73.mmPartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails74.mmSettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails74.mmPartialSettlementIndicator, com.tools20022.repository.msg.RequestDetails13.mmPartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails81.mmSettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails81.mmPartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails76.mmSettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails76.mmPartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails80.mmSettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails80.mmPartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails78.mmSettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails78.mmPartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails77.mmSettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails77.mmPartialSettlementIndicator,
					com.tools20022.repository.msg.RequestDetails14.mmPartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails79.mmSettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails79.mmPartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails87.mmSettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails87.mmPartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails83.mmSettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails86.mmSettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails86.mmPartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails85.mmSettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails85.mmPartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails93.mmSettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails93.mmPartialSettlementIndicator,
					com.tools20022.repository.msg.RequestDetails15.mmPartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails90.mmSettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails90.mmPartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails96.mmSettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails96.mmPartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails97.mmSettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails97.mmPartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails99.mmSettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails99.mmPartialSettlementIndicator, com.tools20022.repository.choice.SettlementTransactionCondition16Choice.mmCode,
					com.tools20022.repository.choice.SettlementTransactionCondition16Choice.mmProprietary, com.tools20022.repository.msg.SettlementDetails94.mmSettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails100.mmSettlementTransactionCondition, com.tools20022.repository.choice.SettlementTransactionCondition19Choice.mmCode,
					com.tools20022.repository.choice.SettlementTransactionCondition19Choice.mmProprietary, com.tools20022.repository.choice.SettlementTransactionCondition18Choice.mmCode,
					com.tools20022.repository.choice.SettlementTransactionCondition18Choice.mmProprietary, com.tools20022.repository.msg.SettlementDetails95.mmSettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails95.mmPartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails91.mmSettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails91.mmPartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails92.mmSettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails92.mmPartialSettlementIndicator, com.tools20022.repository.choice.SettlementTransactionCondition17Choice.mmCode,
					com.tools20022.repository.choice.SettlementTransactionCondition17Choice.mmProprietary, com.tools20022.repository.msg.SettlementDetails98.mmSettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails98.mmPartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails101.mmSettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails101.mmPartialSettlementIndicator, com.tools20022.repository.choice.SettlementTransactionCondition20Choice.mmCode,
					com.tools20022.repository.choice.SettlementTransactionCondition20Choice.mmProprietary, com.tools20022.repository.msg.SettlementDetails105.mmSettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails105.mmPartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails106.mmSettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails106.mmPartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails104.mmSettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails104.mmPartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails111.mmSettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails111.mmPartialSettlementIndicator, com.tools20022.repository.msg.RequestDetails16.mmPartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails112.mmSettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails112.mmPartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails110.mmSettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails110.mmPartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails108.mmSettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails108.mmPartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails103.mmSettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails107.mmSettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails107.mmPartialSettlementIndicator, com.tools20022.repository.choice.SettlementTransactionCondition26Choice.mmCode,
					com.tools20022.repository.choice.SettlementTransactionCondition26Choice.mmProprietary, com.tools20022.repository.msg.SettlementDetails115.mmSettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails115.mmPartialSettlementIndicator, com.tools20022.repository.choice.SettlementTransactionCondition21Choice.mmCode,
					com.tools20022.repository.choice.SettlementTransactionCondition21Choice.mmProprietary, com.tools20022.repository.choice.SettlementTransactionCondition28Choice.mmCode,
					com.tools20022.repository.choice.SettlementTransactionCondition28Choice.mmProprietary, com.tools20022.repository.msg.SettlementDetails117.mmSettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails117.mmPartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails116.mmSettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails116.mmPartialSettlementIndicator, com.tools20022.repository.choice.SettlementTransactionCondition22Choice.mmCode,
					com.tools20022.repository.choice.SettlementTransactionCondition22Choice.mmProprietary, com.tools20022.repository.msg.SettlementDetails113.mmSettlementTransactionCondition,
					com.tools20022.repository.choice.SettlementTransactionCondition29Choice.mmCode, com.tools20022.repository.choice.SettlementTransactionCondition29Choice.mmProprietary,
					com.tools20022.repository.msg.FundSettlementParameters11.mmSettlementTransactionCondition, com.tools20022.repository.msg.FundSettlementParameters12.mmSettlementTransactionCondition,
					com.tools20022.repository.choice.SettlementTransactionCondition30Choice.mmCode, com.tools20022.repository.choice.SettlementTransactionCondition30Choice.mmProprietary,
					com.tools20022.repository.choice.TradeTransactionCondition8Choice.mmCode, com.tools20022.repository.choice.TradeTransactionCondition8Choice.mmProprietary,
					com.tools20022.repository.msg.SettlementDetails128.mmSettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails128.mmPartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails120.mmSettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails120.mmPartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails119.mmSettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails119.mmPartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails125.mmSettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails125.mmPartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails126.mmSettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails126.mmPartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails122.mmSettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails127.mmSettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails127.mmPartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails121.mmSettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails121.mmPartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails134.mmSettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails134.mmPartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails137.mmSettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails137.mmPartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails132.mmSettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails132.mmPartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails138.mmSettlementTransactionCondition,
					com.tools20022.repository.msg.SettlementDetails130.mmSettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails130.mmPartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails131.mmSettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails131.mmPartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails133.mmSettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails133.mmPartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails139.mmSettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails139.mmPartialSettlementIndicator);
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementTransactionCondition";
			definition = "Conditions under which the order/trade is to be settled.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SettlementTransactionConditionCode.mmObject();
		}
	};
	protected YesNoIndicator beneficialOwnershipIndicator;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
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
	 * </ul>
	 * </li>
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
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.BeneficialOwnership1Choice.mmIndicator, com.tools20022.repository.choice.BeneficialOwnership1Choice.mmProprietary,
					com.tools20022.repository.msg.SettlementDetails50.mmBeneficialOwnership, com.tools20022.repository.choice.BeneficialOwnership2Choice.mmIndicator,
					com.tools20022.repository.choice.BeneficialOwnership2Choice.mmProprietary, com.tools20022.repository.msg.SettlementDetails51.mmBeneficialOwnership, com.tools20022.repository.msg.SettlementDetails9.mmBeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails17.mmBeneficialOwnership, com.tools20022.repository.msg.SettlementDetails30.mmBeneficialOwnership, com.tools20022.repository.msg.SettlementDetails32.mmBeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails60.mmBeneficialOwnership, com.tools20022.repository.msg.SettlementDetails64.mmBeneficialOwnership, com.tools20022.repository.msg.SettlementDetails3.mmBeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails16.mmBeneficialOwnership, com.tools20022.repository.msg.SettlementDetails31.mmBeneficialOwnership, com.tools20022.repository.msg.SettlementDetails40.mmBeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails62.mmBeneficialOwnership, com.tools20022.repository.msg.SettlementDetails63.mmBeneficialOwnership, com.tools20022.repository.msg.SettlementDetails6.mmBeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails20.mmBeneficialOwnership, com.tools20022.repository.msg.SettlementDetails24.mmBeneficialOwnership, com.tools20022.repository.msg.SettlementDetails33.mmBeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails45.mmBeneficialOwnership, com.tools20022.repository.msg.SettlementDetails54.mmBeneficialOwnership, com.tools20022.repository.msg.SettlementDetails1.mmBeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails19.mmBeneficialOwnership, com.tools20022.repository.msg.SettlementDetails22.mmBeneficialOwnership, com.tools20022.repository.msg.SettlementDetails35.mmBeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails42.mmBeneficialOwnership, com.tools20022.repository.msg.SettlementDetails52.mmBeneficialOwnership, com.tools20022.repository.msg.SettlementDetails8.mmBeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails11.mmBeneficialOwnership, com.tools20022.repository.msg.SettlementDetails23.mmBeneficialOwnership, com.tools20022.repository.msg.SettlementDetails37.mmBeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails44.mmBeneficialOwnership, com.tools20022.repository.msg.SettlementDetails53.mmBeneficialOwnership, com.tools20022.repository.msg.SettlementDetails7.mmBeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails12.mmBeneficialOwnership, com.tools20022.repository.msg.SettlementDetails28.mmBeneficialOwnership, com.tools20022.repository.msg.SettlementDetails38.mmBeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails47.mmBeneficialOwnership, com.tools20022.repository.msg.SettlementDetails56.mmBeneficialOwnership, com.tools20022.repository.msg.SettlementDetails2.mmBeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails13.mmBeneficialOwnership, com.tools20022.repository.msg.SettlementDetails27.mmBeneficialOwnership, com.tools20022.repository.msg.SettlementDetails39.mmBeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails48.mmBeneficialOwnership, com.tools20022.repository.msg.SettlementDetails57.mmBeneficialOwnership, com.tools20022.repository.choice.BeneficialOwnership3Choice.mmIndicator,
					com.tools20022.repository.choice.BeneficialOwnership3Choice.mmProprietary, com.tools20022.repository.msg.SettlementDetails43.mmBeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails10.mmBeneficialOwnership, com.tools20022.repository.msg.SettlementDetails29.mmBeneficialOwnership, com.tools20022.repository.msg.SettlementDetails5.mmBeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails25.mmBeneficialOwnership, com.tools20022.repository.msg.SettlementDetails26.mmBeneficialOwnership, com.tools20022.repository.msg.SettlementDetails65.mmBeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails14.mmBeneficialOwnership, com.tools20022.repository.msg.SettlementDetails41.mmBeneficialOwnership, com.tools20022.repository.msg.SettlementDetails61.mmBeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails59.mmBeneficialOwnership, com.tools20022.repository.msg.SettlementDetails15.mmBeneficialOwnership, com.tools20022.repository.msg.SettlementDetails34.mmBeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails49.mmBeneficialOwnership, com.tools20022.repository.msg.SettlementDetails58.mmBeneficialOwnership, com.tools20022.repository.msg.SettlementDetails36.mmBeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails67.mmBeneficialOwnership, com.tools20022.repository.msg.SettlementDetails70.mmBeneficialOwnership, com.tools20022.repository.msg.SettlementDetails68.mmBeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails69.mmBeneficialOwnership, com.tools20022.repository.msg.SettlementDetails71.mmBeneficialOwnership, com.tools20022.repository.msg.SettlementDetails72.mmBeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails75.mmBeneficialOwnership, com.tools20022.repository.msg.SettlementDetails73.mmBeneficialOwnership, com.tools20022.repository.msg.SettlementDetails74.mmBeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails81.mmBeneficialOwnership, com.tools20022.repository.msg.SettlementDetails76.mmBeneficialOwnership, com.tools20022.repository.msg.SettlementDetails80.mmBeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails78.mmBeneficialOwnership, com.tools20022.repository.msg.SettlementDetails77.mmBeneficialOwnership, com.tools20022.repository.msg.SettlementDetails79.mmBeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails87.mmBeneficialOwnership, com.tools20022.repository.msg.SettlementDetails83.mmBeneficialOwnership, com.tools20022.repository.msg.SettlementDetails86.mmBeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails85.mmBeneficialOwnership, com.tools20022.repository.msg.SettlementDetails93.mmBeneficialOwnership, com.tools20022.repository.msg.SettlementDetails90.mmBeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails96.mmBeneficialOwnership, com.tools20022.repository.msg.SettlementDetails97.mmBeneficialOwnership, com.tools20022.repository.msg.SettlementDetails99.mmBeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails94.mmBeneficialOwnership, com.tools20022.repository.choice.BeneficialOwnership4Choice.mmIndicator,
					com.tools20022.repository.choice.BeneficialOwnership4Choice.mmProprietary, com.tools20022.repository.msg.SettlementDetails95.mmBeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails91.mmBeneficialOwnership, com.tools20022.repository.msg.SettlementDetails92.mmBeneficialOwnership, com.tools20022.repository.msg.SettlementDetails98.mmBeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails101.mmBeneficialOwnership, com.tools20022.repository.msg.SettlementDetails105.mmBeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails106.mmBeneficialOwnership, com.tools20022.repository.msg.SettlementDetails104.mmBeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails111.mmBeneficialOwnership, com.tools20022.repository.msg.SettlementDetails112.mmBeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails110.mmBeneficialOwnership, com.tools20022.repository.msg.SettlementDetails108.mmBeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails107.mmBeneficialOwnership, com.tools20022.repository.choice.BeneficialOwnership5Choice.mmIndicator,
					com.tools20022.repository.choice.BeneficialOwnership5Choice.mmProprietary, com.tools20022.repository.msg.SettlementDetails115.mmBeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails117.mmBeneficialOwnership, com.tools20022.repository.msg.SettlementDetails116.mmBeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails113.mmBeneficialOwnership, com.tools20022.repository.msg.SettlementDetails128.mmBeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails120.mmBeneficialOwnership, com.tools20022.repository.msg.SettlementDetails119.mmBeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails125.mmBeneficialOwnership, com.tools20022.repository.msg.SettlementDetails126.mmBeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails122.mmBeneficialOwnership, com.tools20022.repository.msg.SettlementDetails127.mmBeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails121.mmBeneficialOwnership, com.tools20022.repository.msg.SettlementDetails134.mmBeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails137.mmBeneficialOwnership, com.tools20022.repository.msg.SettlementDetails132.mmBeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails138.mmBeneficialOwnership, com.tools20022.repository.msg.SettlementDetails130.mmBeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails131.mmBeneficialOwnership, com.tools20022.repository.msg.SettlementDetails133.mmBeneficialOwnership,
					com.tools20022.repository.msg.SettlementDetails139.mmBeneficialOwnership);
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BeneficialOwnershipIndicator";
			definition = "Specifies whether there is change of beneficial ownership.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected MarketClientSideCode marketClientSide;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
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
	 * </ul>
	 * </li>
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
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.MarketClientSide1Choice.mmCode, com.tools20022.repository.choice.MarketClientSide1Choice.mmProprietary,
					com.tools20022.repository.msg.SettlementDetails50.mmMarketClientSide, com.tools20022.repository.choice.MarketClientSide2Choice.mmCode, com.tools20022.repository.choice.MarketClientSide2Choice.mmProprietary,
					com.tools20022.repository.msg.SettlementDetails51.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails9.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails17.mmMarketClientSide,
					com.tools20022.repository.msg.SettlementDetails30.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails32.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails60.mmMarketClientSide,
					com.tools20022.repository.msg.SettlementDetails64.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails3.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails16.mmMarketClientSide,
					com.tools20022.repository.msg.SettlementDetails31.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails40.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails62.mmMarketClientSide,
					com.tools20022.repository.msg.SettlementDetails63.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails6.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails20.mmMarketClientSide,
					com.tools20022.repository.msg.SettlementDetails24.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails33.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails45.mmMarketClientSide,
					com.tools20022.repository.msg.SettlementDetails54.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails1.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails19.mmMarketClientSide,
					com.tools20022.repository.msg.SettlementDetails22.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails35.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails42.mmMarketClientSide,
					com.tools20022.repository.msg.SettlementDetails52.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails8.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails11.mmMarketClientSide,
					com.tools20022.repository.msg.SettlementDetails23.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails37.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails44.mmMarketClientSide,
					com.tools20022.repository.msg.SettlementDetails53.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails7.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails12.mmMarketClientSide,
					com.tools20022.repository.msg.SettlementDetails28.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails38.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails47.mmMarketClientSide,
					com.tools20022.repository.msg.SettlementDetails56.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails2.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails13.mmMarketClientSide,
					com.tools20022.repository.msg.SettlementDetails27.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails39.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails48.mmMarketClientSide,
					com.tools20022.repository.msg.SettlementDetails57.mmMarketClientSide, com.tools20022.repository.choice.MarketClientSide3Choice.mmCode, com.tools20022.repository.choice.MarketClientSide3Choice.mmProprietary,
					com.tools20022.repository.msg.SettlementDetails43.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails10.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails29.mmMarketClientSide,
					com.tools20022.repository.msg.SettlementDetails5.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails25.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails26.mmMarketClientSide,
					com.tools20022.repository.msg.SettlementDetails65.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails14.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails41.mmMarketClientSide,
					com.tools20022.repository.msg.SettlementDetails61.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails59.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails15.mmMarketClientSide,
					com.tools20022.repository.msg.SettlementDetails34.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails49.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails58.mmMarketClientSide,
					com.tools20022.repository.msg.SettlementDetails36.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails67.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails70.mmMarketClientSide,
					com.tools20022.repository.msg.SettlementDetails68.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails69.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails71.mmMarketClientSide,
					com.tools20022.repository.msg.SettlementDetails72.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails75.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails73.mmMarketClientSide,
					com.tools20022.repository.msg.SettlementDetails74.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails81.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails76.mmMarketClientSide,
					com.tools20022.repository.msg.SettlementDetails80.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails78.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails77.mmMarketClientSide,
					com.tools20022.repository.msg.SettlementDetails79.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails87.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails83.mmMarketClientSide,
					com.tools20022.repository.msg.SettlementDetails86.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails85.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails93.mmMarketClientSide,
					com.tools20022.repository.msg.SettlementDetails90.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails96.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails97.mmMarketClientSide,
					com.tools20022.repository.msg.SettlementDetails99.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails94.mmMarketClientSide, com.tools20022.repository.choice.MarketClientSide4Choice.mmCode,
					com.tools20022.repository.choice.MarketClientSide4Choice.mmProprietary, com.tools20022.repository.msg.SettlementDetails95.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails91.mmMarketClientSide,
					com.tools20022.repository.msg.SettlementDetails92.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails98.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails101.mmMarketClientSide,
					com.tools20022.repository.msg.SettlementDetails105.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails106.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails104.mmMarketClientSide,
					com.tools20022.repository.msg.SettlementDetails111.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails112.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails110.mmMarketClientSide,
					com.tools20022.repository.msg.SettlementDetails108.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails107.mmMarketClientSide, com.tools20022.repository.choice.MarketClientSide5Choice.mmCode,
					com.tools20022.repository.choice.MarketClientSide5Choice.mmProprietary, com.tools20022.repository.msg.SettlementDetails115.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails117.mmMarketClientSide,
					com.tools20022.repository.msg.SettlementDetails116.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails113.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails128.mmMarketClientSide,
					com.tools20022.repository.msg.SettlementDetails120.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails119.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails125.mmMarketClientSide,
					com.tools20022.repository.msg.SettlementDetails126.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails122.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails127.mmMarketClientSide,
					com.tools20022.repository.msg.SettlementDetails121.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails134.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails137.mmMarketClientSide,
					com.tools20022.repository.msg.SettlementDetails132.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails138.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails130.mmMarketClientSide,
					com.tools20022.repository.msg.SettlementDetails131.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails133.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails139.mmMarketClientSide);
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MarketClientSide";
			definition = "Specifies if an instruction is for a market side or a client side transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MarketClientSideCode.mmObject();
		}
	};
	protected YesNoIndicator tracking;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
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
	 * </ul>
	 * </li>
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
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementDetails50.mmTracking, com.tools20022.repository.msg.SettlementDetails51.mmTracking, com.tools20022.repository.msg.SettlementDetails3.mmTracking,
					com.tools20022.repository.msg.SettlementDetails16.mmTracking, com.tools20022.repository.msg.SettlementDetails31.mmTracking, com.tools20022.repository.msg.SettlementDetails40.mmTracking,
					com.tools20022.repository.msg.SettlementDetails62.mmTracking, com.tools20022.repository.msg.SettlementDetails63.mmTracking, com.tools20022.repository.msg.SettlementDetails1.mmTracking,
					com.tools20022.repository.msg.SettlementDetails19.mmTracking, com.tools20022.repository.msg.SettlementDetails22.mmTracking, com.tools20022.repository.msg.SettlementDetails35.mmTracking,
					com.tools20022.repository.msg.SettlementDetails42.mmTracking, com.tools20022.repository.msg.SettlementDetails52.mmTracking, com.tools20022.repository.msg.SettlementDetails43.mmTracking,
					com.tools20022.repository.msg.SettlementDetails65.mmTracking, com.tools20022.repository.msg.SettlementDetails67.mmTracking, com.tools20022.repository.msg.SettlementDetails68.mmTracking,
					com.tools20022.repository.msg.SettlementDetails72.mmTracking, com.tools20022.repository.msg.SettlementDetails81.mmTracking, com.tools20022.repository.msg.SettlementDetails78.mmTracking,
					com.tools20022.repository.msg.SettlementDetails77.mmTracking, com.tools20022.repository.msg.SettlementDetails83.mmTracking, com.tools20022.repository.msg.SettlementDetails93.mmTracking,
					com.tools20022.repository.msg.SettlementDetails97.mmTracking, com.tools20022.repository.msg.SettlementDetails94.mmTracking, com.tools20022.repository.msg.SettlementDetails101.mmTracking,
					com.tools20022.repository.msg.SettlementDetails105.mmTracking, com.tools20022.repository.msg.SettlementDetails106.mmTracking, com.tools20022.repository.msg.SettlementDetails111.mmTracking,
					com.tools20022.repository.msg.SettlementDetails112.mmTracking, com.tools20022.repository.msg.SettlementDetails113.mmTracking, com.tools20022.repository.msg.SettlementDetails120.mmTracking,
					com.tools20022.repository.msg.SettlementDetails119.mmTracking, com.tools20022.repository.msg.SettlementDetails122.mmTracking, com.tools20022.repository.msg.SettlementDetails137.mmTracking,
					com.tools20022.repository.msg.SettlementDetails132.mmTracking, com.tools20022.repository.msg.SettlementDetails138.mmTracking);
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Tracking";
			definition = "Specifies whether the loan and/or collateral is tracked.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator letterOfGuarantee;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
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
	 * </ul>
	 * </li>
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
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.LetterOfGuarantee1Choice.mmIndicator, com.tools20022.repository.choice.LetterOfGuarantee1Choice.mmProprietary,
					com.tools20022.repository.msg.SettlementDetails50.mmLetterOfGuarantee, com.tools20022.repository.choice.LetterOfGuarantee2Choice.mmIndicator, com.tools20022.repository.choice.LetterOfGuarantee2Choice.mmProprietary,
					com.tools20022.repository.msg.SettlementDetails51.mmLetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails6.mmLetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails20.mmLetterOfGuarantee,
					com.tools20022.repository.msg.SettlementDetails24.mmLetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails33.mmLetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails45.mmLetterOfGuarantee,
					com.tools20022.repository.msg.SettlementDetails54.mmLetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails1.mmLetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails19.mmLetterOfGuarantee,
					com.tools20022.repository.msg.SettlementDetails22.mmLetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails35.mmLetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails42.mmLetterOfGuarantee,
					com.tools20022.repository.msg.SettlementDetails52.mmLetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails8.mmLetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails11.mmLetterOfGuarantee,
					com.tools20022.repository.msg.SettlementDetails23.mmLetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails37.mmLetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails44.mmLetterOfGuarantee,
					com.tools20022.repository.msg.SettlementDetails53.mmLetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails7.mmLetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails12.mmLetterOfGuarantee,
					com.tools20022.repository.msg.SettlementDetails28.mmLetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails38.mmLetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails47.mmLetterOfGuarantee,
					com.tools20022.repository.msg.SettlementDetails56.mmLetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails2.mmLetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails13.mmLetterOfGuarantee,
					com.tools20022.repository.msg.SettlementDetails27.mmLetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails39.mmLetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails48.mmLetterOfGuarantee,
					com.tools20022.repository.msg.SettlementDetails57.mmLetterOfGuarantee, com.tools20022.repository.choice.LetterOfGuarantee3Choice.mmIndicator, com.tools20022.repository.choice.LetterOfGuarantee3Choice.mmProprietary,
					com.tools20022.repository.msg.SettlementDetails43.mmLetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails5.mmLetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails26.mmLetterOfGuarantee,
					com.tools20022.repository.msg.SettlementDetails15.mmLetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails36.mmLetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails66.mmLetterOfGuarantee,
					com.tools20022.repository.msg.SettlementDetails67.mmLetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails70.mmLetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails68.mmLetterOfGuarantee,
					com.tools20022.repository.msg.SettlementDetails69.mmLetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails75.mmLetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails74.mmLetterOfGuarantee,
					com.tools20022.repository.msg.SettlementDetails81.mmLetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails80.mmLetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails87.mmLetterOfGuarantee,
					com.tools20022.repository.msg.SettlementDetails83.mmLetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails86.mmLetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails85.mmLetterOfGuarantee,
					com.tools20022.repository.msg.SettlementDetails93.mmLetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails90.mmLetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails94.mmLetterOfGuarantee,
					com.tools20022.repository.msg.SettlementDetails95.mmLetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails91.mmLetterOfGuarantee, com.tools20022.repository.choice.LetterOfGuarantee4Choice.mmIndicator,
					com.tools20022.repository.choice.LetterOfGuarantee4Choice.mmProprietary, com.tools20022.repository.msg.SettlementDetails92.mmLetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails101.mmLetterOfGuarantee,
					com.tools20022.repository.msg.SettlementDetails111.mmLetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails112.mmLetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails110.mmLetterOfGuarantee,
					com.tools20022.repository.msg.SettlementDetails115.mmLetterOfGuarantee, com.tools20022.repository.choice.LetterOfGuarantee5Choice.mmIndicator, com.tools20022.repository.choice.LetterOfGuarantee5Choice.mmProprietary,
					com.tools20022.repository.msg.SettlementDetails117.mmLetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails116.mmLetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails113.mmLetterOfGuarantee,
					com.tools20022.repository.msg.SettlementDetails128.mmLetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails120.mmLetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails119.mmLetterOfGuarantee,
					com.tools20022.repository.msg.SettlementDetails126.mmLetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails122.mmLetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails127.mmLetterOfGuarantee,
					com.tools20022.repository.msg.SettlementDetails121.mmLetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails134.mmLetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails137.mmLetterOfGuarantee,
					com.tools20022.repository.msg.SettlementDetails132.mmLetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails138.mmLetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails130.mmLetterOfGuarantee,
					com.tools20022.repository.msg.SettlementDetails133.mmLetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails139.mmLetterOfGuarantee);
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LetterOfGuarantee";
			definition = "Specifies whether physical settlement may be executed using a letter of guarantee or if the physical certificates should be used.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator eligibleForCollateral;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
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
	 * </ul>
	 * </li>
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
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementDetails50.mmEligibleForCollateral, com.tools20022.repository.msg.SettlementDetails51.mmEligibleForCollateral,
					com.tools20022.repository.msg.CorporateActionOption5.mmEligibleForCollateralIndicator, com.tools20022.repository.msg.CorporateActionOption13.mmEligibleForCollateralIndicator,
					com.tools20022.repository.msg.CorporateActionOption25.mmEligibleForCollateralIndicator, com.tools20022.repository.msg.CorporateActionOption30.mmEligibleForCollateralIndicator,
					com.tools20022.repository.msg.CorporateActionOption38.mmEligibleForCollateralIndicator, com.tools20022.repository.msg.CorporateActionOption47.mmEligibleForCollateralIndicator,
					com.tools20022.repository.msg.CorporateActionOption57.mmEligibleForCollateralIndicator, com.tools20022.repository.msg.CorporateActionOption58.mmEligibleForCollateralIndicator,
					com.tools20022.repository.msg.SettlementDetails9.mmEligibleForCollateral, com.tools20022.repository.msg.SettlementDetails17.mmEligibleForCollateral,
					com.tools20022.repository.msg.SettlementDetails30.mmEligibleForCollateral, com.tools20022.repository.msg.SettlementDetails32.mmEligibleForCollateral,
					com.tools20022.repository.msg.SettlementDetails60.mmEligibleForCollateral, com.tools20022.repository.msg.SettlementDetails64.mmEligibleForCollateral,
					com.tools20022.repository.msg.SettlementDetails3.mmEligibleForCollateral, com.tools20022.repository.msg.SettlementDetails16.mmEligibleForCollateral,
					com.tools20022.repository.msg.SettlementDetails31.mmEligibleForCollateral, com.tools20022.repository.msg.SettlementDetails40.mmEligibleForCollateral,
					com.tools20022.repository.msg.SettlementDetails62.mmEligibleForCollateral, com.tools20022.repository.msg.SettlementDetails63.mmEligibleForCollateral,
					com.tools20022.repository.msg.SettlementDetails6.mmEligibleForCollateral, com.tools20022.repository.msg.SettlementDetails20.mmEligibleForCollateral,
					com.tools20022.repository.msg.SettlementDetails24.mmEligibleForCollateral, com.tools20022.repository.msg.SettlementDetails33.mmEligibleForCollateral,
					com.tools20022.repository.msg.SettlementDetails45.mmEligibleForCollateral, com.tools20022.repository.msg.SettlementDetails54.mmEligibleForCollateral,
					com.tools20022.repository.msg.SettlementDetails1.mmEligibleForCollateral, com.tools20022.repository.msg.SettlementDetails19.mmEligibleForCollateral,
					com.tools20022.repository.msg.SettlementDetails22.mmEligibleForCollateral, com.tools20022.repository.msg.SettlementDetails35.mmEligibleForCollateral,
					com.tools20022.repository.msg.SettlementDetails42.mmEligibleForCollateral, com.tools20022.repository.msg.SettlementDetails52.mmEligibleForCollateral,
					com.tools20022.repository.msg.SettlementDetails8.mmEligibleForCollateral, com.tools20022.repository.msg.SettlementDetails11.mmEligibleForCollateral,
					com.tools20022.repository.msg.SettlementDetails23.mmEligibleForCollateral, com.tools20022.repository.msg.SettlementDetails37.mmEligibleForCollateral,
					com.tools20022.repository.msg.SettlementDetails44.mmEligibleForCollateral, com.tools20022.repository.msg.SettlementDetails53.mmEligibleForCollateral,
					com.tools20022.repository.msg.SettlementDetails43.mmEligibleForCollateral, com.tools20022.repository.msg.SettlementDetails10.mmEligibleForCollateral,
					com.tools20022.repository.msg.SettlementDetails29.mmEligibleForCollateral, com.tools20022.repository.msg.SettlementDetails26.mmEligibleForCollateral,
					com.tools20022.repository.msg.SettlementDetails65.mmEligibleForCollateral, com.tools20022.repository.msg.SettlementDetails14.mmEligibleForCollateral,
					com.tools20022.repository.msg.SettlementDetails41.mmEligibleForCollateral, com.tools20022.repository.msg.SettlementDetails61.mmEligibleForCollateral,
					com.tools20022.repository.msg.SettlementDetails59.mmEligibleForCollateral, com.tools20022.repository.msg.SettlementDetails36.mmEligibleForCollateral,
					com.tools20022.repository.msg.SettlementDetails67.mmEligibleForCollateral, com.tools20022.repository.msg.SettlementDetails70.mmEligibleForCollateral,
					com.tools20022.repository.msg.SettlementDetails68.mmEligibleForCollateral, com.tools20022.repository.msg.SettlementDetails69.mmEligibleForCollateral,
					com.tools20022.repository.msg.SettlementDetails71.mmEligibleForCollateral, com.tools20022.repository.msg.SettlementDetails72.mmEligibleForCollateral,
					com.tools20022.repository.msg.SettlementDetails73.mmEligibleForCollateral, com.tools20022.repository.msg.CorporateActionOption103.mmEligibleForCollateralIndicator,
					com.tools20022.repository.msg.CorporateActionOption107.mmEligibleForCollateralIndicator, com.tools20022.repository.msg.SettlementDetails81.mmEligibleForCollateral,
					com.tools20022.repository.msg.SettlementDetails76.mmEligibleForCollateral, com.tools20022.repository.msg.SettlementDetails80.mmEligibleForCollateral,
					com.tools20022.repository.msg.SettlementDetails78.mmEligibleForCollateral, com.tools20022.repository.msg.SettlementDetails77.mmEligibleForCollateral,
					com.tools20022.repository.msg.SettlementDetails79.mmEligibleForCollateral, com.tools20022.repository.msg.SettlementDetails83.mmEligibleForCollateral,
					com.tools20022.repository.msg.SettlementDetails85.mmEligibleForCollateral, com.tools20022.repository.msg.SettlementDetails93.mmEligibleForCollateral,
					com.tools20022.repository.msg.SettlementDetails90.mmEligibleForCollateral, com.tools20022.repository.msg.SettlementDetails96.mmEligibleForCollateral,
					com.tools20022.repository.msg.SettlementDetails97.mmEligibleForCollateral, com.tools20022.repository.msg.SettlementDetails94.mmEligibleForCollateral,
					com.tools20022.repository.msg.SettlementDetails95.mmEligibleForCollateral, com.tools20022.repository.msg.SettlementDetails98.mmEligibleForCollateral,
					com.tools20022.repository.msg.CorporateActionOption118.mmEligibleForCollateralIndicator, com.tools20022.repository.msg.SettlementDetails101.mmEligibleForCollateral,
					com.tools20022.repository.msg.CorporateActionOption123.mmEligibleForCollateralIndicator, com.tools20022.repository.msg.SettlementDetails105.mmEligibleForCollateral,
					com.tools20022.repository.msg.SettlementDetails106.mmEligibleForCollateral, com.tools20022.repository.msg.SettlementDetails104.mmEligibleForCollateral,
					com.tools20022.repository.msg.SettlementDetails111.mmEligibleForCollateral, com.tools20022.repository.msg.SettlementDetails112.mmEligibleForCollateral,
					com.tools20022.repository.msg.SettlementDetails110.mmEligibleForCollateral, com.tools20022.repository.msg.SettlementDetails107.mmEligibleForCollateral,
					com.tools20022.repository.msg.SettlementDetails115.mmEligibleForCollateral, com.tools20022.repository.msg.SettlementDetails113.mmEligibleForCollateral,
					com.tools20022.repository.msg.CorporateActionOption131.mmEligibleForCollateralIndicator, com.tools20022.repository.msg.SettlementDetails128.mmEligibleForCollateral,
					com.tools20022.repository.msg.SettlementDetails120.mmEligibleForCollateral, com.tools20022.repository.msg.SettlementDetails119.mmEligibleForCollateral,
					com.tools20022.repository.msg.SettlementDetails122.mmEligibleForCollateral, com.tools20022.repository.msg.SettlementDetails121.mmEligibleForCollateral,
					com.tools20022.repository.msg.CorporateActionOption134.mmEligibleForCollateralIndicator, com.tools20022.repository.msg.SettlementDetails134.mmEligibleForCollateral,
					com.tools20022.repository.msg.SettlementDetails137.mmEligibleForCollateral, com.tools20022.repository.msg.SettlementDetails132.mmEligibleForCollateral,
					com.tools20022.repository.msg.SettlementDetails138.mmEligibleForCollateral, com.tools20022.repository.msg.SettlementDetails133.mmEligibleForCollateral);
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EligibleForCollateral";
			definition = "Specifies whether securities should be included in the pool of securities eligible for collateral purposes.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator accruedInterestIndicator;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
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
	 * </ul>
	 * </li>
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
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AmountAndDirection32.mmAccruedInterestIndicator, com.tools20022.repository.msg.AmountAndDirection33.mmAccruedInterestIndicator,
					com.tools20022.repository.msg.CorporateAction3.mmAccruedInterestIndicator, com.tools20022.repository.msg.CorporateAction4.mmAccruedInterestIndicator,
					com.tools20022.repository.msg.CorporateAction5.mmAccruedInterestIndicator, com.tools20022.repository.msg.CorporateAction6.mmAccruedInterestIndicator,
					com.tools20022.repository.msg.CorporateAction7.mmAccruedInterestIndicator, com.tools20022.repository.msg.CorporateAction8.mmAccruedInterestIndicator,
					com.tools20022.repository.msg.CorporateAction10.mmAccruedInterestIndicator, com.tools20022.repository.msg.CorporateAction11.mmAccruedInterestIndicator,
					com.tools20022.repository.msg.AmountAndDirection2.mmAccruedInterestIndicator, com.tools20022.repository.msg.AmountAndDirection16.mmAccruedInterestIndicator,
					com.tools20022.repository.msg.AmountAndDirection28.mmAccruedInterestIndicator, com.tools20022.repository.msg.AmountAndDirection36.mmAccruedInterestIndicator,
					com.tools20022.repository.msg.AmountAndDirection37.mmAccruedInterestIndicator, com.tools20022.repository.msg.CorporateAction12.mmAccruedInterestIndicator,
					com.tools20022.repository.msg.CorporateAction17.mmAccruedInterestIndicator, com.tools20022.repository.msg.AmountAndDirection38.mmAccruedInterestIndicator,
					com.tools20022.repository.msg.AmountAndDirection40.mmAccruedInterestIndicator, com.tools20022.repository.msg.AmountAndDirection46.mmAccruedInterestIndicator,
					com.tools20022.repository.msg.AmountAndDirection45.mmAccruedInterestIndicator, com.tools20022.repository.msg.CorporateAction31.mmAccruedInterestIndicator,
					com.tools20022.repository.msg.CorporateAction40.mmAccruedInterestIndicator, com.tools20022.repository.msg.AmountAndDirection60.mmAccruedInterestIndicator,
					com.tools20022.repository.msg.AmountAndDirection85.mmAccruedInterestIndicator);
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccruedInterestIndicator";
			definition = "Indicates whether the net proceeds include interest accrued on the financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected PreConfirmationCode preConfirmation;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
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
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AdditionalParameters2.mmPreConfirmation, com.tools20022.repository.msg.AdditionalParameters6.mmPreConfirmation,
					com.tools20022.repository.msg.AdditionalParameters12.mmPreConfirmation, com.tools20022.repository.msg.AdditionalParameters13.mmPreConfirmation, com.tools20022.repository.msg.AdditionalParameters18.mmPreConfirmation,
					com.tools20022.repository.msg.AdditionalParameters19.mmPreConfirmation, com.tools20022.repository.msg.AdditionalParameters17.mmPreConfirmation, com.tools20022.repository.msg.AdditionalParameters20.mmPreConfirmation,
					com.tools20022.repository.msg.AdditionalParameters4.mmPreConfirmation, com.tools20022.repository.msg.AdditionalParameters5.mmPreConfirmation, com.tools20022.repository.msg.AdditionalParameters14.mmPreConfirmation,
					com.tools20022.repository.msg.AdditionalParameters15.mmPreConfirmation, com.tools20022.repository.msg.AdditionalParameters23.mmPreConfirmation, com.tools20022.repository.msg.AdditionalParameters24.mmPreConfirmation,
					com.tools20022.repository.msg.AdditionalParameters22.mmPreConfirmation, com.tools20022.repository.msg.AdditionalParameters26.mmPreConfirmation, com.tools20022.repository.msg.AdditionalParameters28.mmPreConfirmation,
					com.tools20022.repository.msg.AdditionalParameters27.mmPreConfirmation, com.tools20022.repository.msg.AdditionalParameters29.mmPreConfirmation, com.tools20022.repository.msg.AdditionalParameters30.mmPreConfirmation,
					com.tools20022.repository.msg.AdditionalParameters31.mmPreConfirmation, com.tools20022.repository.msg.AdditionalParameters32.mmPreConfirmation);
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PreConfirmation";
			definition = "Pre-confirmation of the cash transfer pending the securities transfer, or vice versa.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PreConfirmationCode.mmObject();
		}
	};
	protected YesNoIndicator securitiesRealTimeGrossSettlement;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
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
	 * </ul>
	 * </li>
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
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.SecuritiesRTGS1Choice.mmIndicator, com.tools20022.repository.choice.SecuritiesRTGS1Choice.mmProprietary,
					com.tools20022.repository.msg.SettlementDetails9.mmSecuritiesRTGS, com.tools20022.repository.choice.SecuritiesRTGS2Choice.mmIndicator, com.tools20022.repository.choice.SecuritiesRTGS2Choice.mmProprietary,
					com.tools20022.repository.msg.SettlementDetails17.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails30.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails32.mmSecuritiesRTGS,
					com.tools20022.repository.msg.SettlementDetails60.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails64.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails3.mmSecuritiesRTGS,
					com.tools20022.repository.msg.SettlementDetails16.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails31.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails40.mmSecuritiesRTGS,
					com.tools20022.repository.msg.SettlementDetails62.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails63.mmSecuritiesRTGS, com.tools20022.repository.msg.RequestDetails1.mmSecuritiesRTGS,
					com.tools20022.repository.msg.RequestDetails2.mmSecuritiesRTGS, com.tools20022.repository.msg.RequestDetails6.mmSecuritiesRTGS, com.tools20022.repository.msg.RequestDetails7.mmSecuritiesRTGS,
					com.tools20022.repository.msg.RequestDetails8.mmSecuritiesRTGS, com.tools20022.repository.msg.RequestDetails9.mmSecuritiesRTGS, com.tools20022.repository.msg.RequestDetails11.mmSecuritiesRTGS,
					com.tools20022.repository.msg.RequestDetails12.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails6.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails20.mmSecuritiesRTGS,
					com.tools20022.repository.msg.SettlementDetails24.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails33.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails45.mmSecuritiesRTGS,
					com.tools20022.repository.msg.SettlementDetails54.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails1.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails19.mmSecuritiesRTGS,
					com.tools20022.repository.msg.SettlementDetails22.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails35.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails42.mmSecuritiesRTGS,
					com.tools20022.repository.msg.SettlementDetails52.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails8.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails11.mmSecuritiesRTGS,
					com.tools20022.repository.msg.SettlementDetails23.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails37.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails44.mmSecuritiesRTGS,
					com.tools20022.repository.msg.SettlementDetails53.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails7.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails12.mmSecuritiesRTGS,
					com.tools20022.repository.msg.SettlementDetails28.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails38.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails47.mmSecuritiesRTGS,
					com.tools20022.repository.msg.SettlementDetails56.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails2.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails13.mmSecuritiesRTGS,
					com.tools20022.repository.msg.SettlementDetails27.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails39.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails48.mmSecuritiesRTGS,
					com.tools20022.repository.msg.SettlementDetails57.mmSecuritiesRTGS, com.tools20022.repository.choice.SecuritiesRTGS3Choice.mmIndicator, com.tools20022.repository.choice.SecuritiesRTGS3Choice.mmProprietary,
					com.tools20022.repository.msg.SettlementDetails43.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails4.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails10.mmSecuritiesRTGS,
					com.tools20022.repository.msg.SettlementDetails29.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails5.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails25.mmSecuritiesRTGS,
					com.tools20022.repository.msg.SettlementDetails26.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails65.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails14.mmSecuritiesRTGS,
					com.tools20022.repository.msg.SettlementDetails41.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails61.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails59.mmSecuritiesRTGS,
					com.tools20022.repository.msg.SettlementDetails15.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails34.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails49.mmSecuritiesRTGS,
					com.tools20022.repository.msg.SettlementDetails58.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails36.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails18.mmSecuritiesRTGS,
					com.tools20022.repository.msg.SettlementDetails66.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails67.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails70.mmSecuritiesRTGS,
					com.tools20022.repository.msg.SettlementDetails69.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails71.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails72.mmSecuritiesRTGS,
					com.tools20022.repository.msg.SettlementDetails75.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails73.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails74.mmSecuritiesRTGS,
					com.tools20022.repository.msg.RequestDetails13.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails81.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails76.mmSecuritiesRTGS,
					com.tools20022.repository.msg.SettlementDetails80.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails78.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails77.mmSecuritiesRTGS,
					com.tools20022.repository.msg.RequestDetails14.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails79.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails87.mmSecuritiesRTGS,
					com.tools20022.repository.msg.SettlementDetails86.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails85.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails93.mmSecuritiesRTGS,
					com.tools20022.repository.msg.RequestDetails15.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails90.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails96.mmSecuritiesRTGS,
					com.tools20022.repository.msg.SettlementDetails97.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails99.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails100.mmSecuritiesRTGS,
					com.tools20022.repository.choice.SecuritiesRTGS4Choice.mmIndicator, com.tools20022.repository.choice.SecuritiesRTGS4Choice.mmProprietary, com.tools20022.repository.msg.SettlementDetails95.mmSecuritiesRTGS,
					com.tools20022.repository.msg.SettlementDetails91.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails92.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails98.mmSecuritiesRTGS,
					com.tools20022.repository.msg.SettlementDetails101.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails105.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails106.mmSecuritiesRTGS,
					com.tools20022.repository.msg.SettlementDetails104.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails111.mmSecuritiesRTGS, com.tools20022.repository.msg.RequestDetails16.mmSecuritiesRTGS,
					com.tools20022.repository.msg.SettlementDetails112.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails110.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails108.mmSecuritiesRTGS,
					com.tools20022.repository.msg.SettlementDetails103.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails107.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails115.mmSecuritiesRTGS,
					com.tools20022.repository.msg.SettlementDetails117.mmSecuritiesRTGS, com.tools20022.repository.choice.SecuritiesRTGS5Choice.mmIndicator, com.tools20022.repository.choice.SecuritiesRTGS5Choice.mmProprietary,
					com.tools20022.repository.msg.SettlementDetails116.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails128.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails120.mmSecuritiesRTGS,
					com.tools20022.repository.msg.SettlementDetails119.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails125.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails126.mmSecuritiesRTGS,
					com.tools20022.repository.msg.SettlementDetails127.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails121.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails134.mmSecuritiesRTGS,
					com.tools20022.repository.msg.SettlementDetails137.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails132.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails130.mmSecuritiesRTGS,
					com.tools20022.repository.msg.SettlementDetails131.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails133.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails139.mmSecuritiesRTGS);
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesRealTimeGrossSettlement";
			definition = "Specifies whether the settlement transaction is to be settled through an RTGS or a non RTGS system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected BlockTradeCode blockTrade;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
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
	 * </ul>
	 * </li>
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
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.BlockTrade1Choice.mmCode, com.tools20022.repository.choice.BlockTrade1Choice.mmProprietary, com.tools20022.repository.msg.SettlementDetails9.mmBlockTrade,
					com.tools20022.repository.choice.BlockTrade2Choice.mmCode, com.tools20022.repository.choice.BlockTrade2Choice.mmProprietary, com.tools20022.repository.msg.SettlementDetails17.mmBlockTrade,
					com.tools20022.repository.msg.SettlementDetails30.mmBlockTrade, com.tools20022.repository.msg.SettlementDetails32.mmBlockTrade, com.tools20022.repository.msg.SettlementDetails60.mmBlockTrade,
					com.tools20022.repository.msg.SettlementDetails64.mmBlockTrade, com.tools20022.repository.msg.SettlementDetails3.mmBlockTrade, com.tools20022.repository.msg.SettlementDetails16.mmBlockTrade,
					com.tools20022.repository.msg.SettlementDetails31.mmBlockTrade, com.tools20022.repository.msg.SettlementDetails40.mmBlockTrade, com.tools20022.repository.msg.SettlementDetails62.mmBlockTrade,
					com.tools20022.repository.msg.SettlementDetails63.mmBlockTrade, com.tools20022.repository.msg.SettlementDetails6.mmBlockTrade, com.tools20022.repository.msg.SettlementDetails20.mmBlockTrade,
					com.tools20022.repository.msg.SettlementDetails24.mmBlockTrade, com.tools20022.repository.msg.SettlementDetails33.mmBlockTrade, com.tools20022.repository.msg.SettlementDetails45.mmBlockTrade,
					com.tools20022.repository.msg.SettlementDetails54.mmBlockTrade, com.tools20022.repository.msg.SettlementDetails1.mmBlockTrade, com.tools20022.repository.msg.SettlementDetails19.mmBlockTrade,
					com.tools20022.repository.msg.SettlementDetails22.mmBlockTrade, com.tools20022.repository.msg.SettlementDetails35.mmBlockTrade, com.tools20022.repository.msg.SettlementDetails42.mmBlockTrade,
					com.tools20022.repository.msg.SettlementDetails52.mmBlockTrade, com.tools20022.repository.msg.SettlementDetails8.mmBlockTrade, com.tools20022.repository.msg.SettlementDetails11.mmBlockTrade,
					com.tools20022.repository.msg.SettlementDetails23.mmBlockTrade, com.tools20022.repository.msg.SettlementDetails37.mmBlockTrade, com.tools20022.repository.msg.SettlementDetails44.mmBlockTrade,
					com.tools20022.repository.msg.SettlementDetails53.mmBlockTrade, com.tools20022.repository.msg.SettlementDetails7.mmBlockTrade, com.tools20022.repository.msg.SettlementDetails12.mmBlockTrade,
					com.tools20022.repository.msg.SettlementDetails28.mmBlockTrade, com.tools20022.repository.msg.SettlementDetails38.mmBlockTrade, com.tools20022.repository.msg.SettlementDetails47.mmBlockTrade,
					com.tools20022.repository.msg.SettlementDetails56.mmBlockTrade, com.tools20022.repository.msg.SettlementDetails2.mmBlockTrade, com.tools20022.repository.msg.SettlementDetails13.mmBlockTrade,
					com.tools20022.repository.msg.SettlementDetails27.mmBlockTrade, com.tools20022.repository.msg.SettlementDetails39.mmBlockTrade, com.tools20022.repository.msg.SettlementDetails48.mmBlockTrade,
					com.tools20022.repository.msg.SettlementDetails57.mmBlockTrade, com.tools20022.repository.choice.BlockTrade3Choice.mmCode, com.tools20022.repository.choice.BlockTrade3Choice.mmProprietary,
					com.tools20022.repository.msg.SettlementDetails43.mmBlockTrade, com.tools20022.repository.msg.SettlementDetails10.mmBlockTrade, com.tools20022.repository.msg.SettlementDetails29.mmBlockTrade,
					com.tools20022.repository.msg.SettlementDetails26.mmBlockTrade, com.tools20022.repository.msg.SettlementDetails65.mmBlockTrade, com.tools20022.repository.msg.SettlementDetails14.mmBlockTrade,
					com.tools20022.repository.msg.SettlementDetails41.mmBlockTrade, com.tools20022.repository.msg.SettlementDetails61.mmBlockTrade, com.tools20022.repository.msg.SettlementDetails59.mmBlockTrade,
					com.tools20022.repository.msg.SettlementDetails36.mmBlockTrade, com.tools20022.repository.msg.SettlementDetails66.mmBlockTrade, com.tools20022.repository.msg.SettlementDetails67.mmBlockTrade,
					com.tools20022.repository.msg.SettlementDetails70.mmBlockTrade, com.tools20022.repository.msg.SettlementDetails69.mmBlockTrade, com.tools20022.repository.msg.SettlementDetails71.mmBlockTrade,
					com.tools20022.repository.msg.SettlementDetails72.mmBlockTrade, com.tools20022.repository.msg.SettlementDetails75.mmBlockTrade, com.tools20022.repository.msg.SettlementDetails73.mmBlockTrade,
					com.tools20022.repository.msg.SettlementDetails74.mmBlockTrade, com.tools20022.repository.msg.SettlementDetails81.mmBlockTrade, com.tools20022.repository.msg.SettlementDetails76.mmBlockTrade,
					com.tools20022.repository.msg.SettlementDetails80.mmBlockTrade, com.tools20022.repository.msg.SettlementDetails78.mmBlockTrade, com.tools20022.repository.msg.SettlementDetails77.mmBlockTrade,
					com.tools20022.repository.msg.SettlementDetails79.mmBlockTrade, com.tools20022.repository.msg.SettlementDetails87.mmBlockTrade, com.tools20022.repository.msg.SettlementDetails86.mmBlockTrade,
					com.tools20022.repository.msg.SettlementDetails85.mmBlockTrade, com.tools20022.repository.msg.SettlementDetails93.mmBlockTrade, com.tools20022.repository.msg.SettlementDetails90.mmBlockTrade,
					com.tools20022.repository.msg.SettlementDetails96.mmBlockTrade, com.tools20022.repository.msg.SettlementDetails97.mmBlockTrade, com.tools20022.repository.choice.BlockTrade4Choice.mmCode,
					com.tools20022.repository.choice.BlockTrade4Choice.mmProprietary, com.tools20022.repository.msg.SettlementDetails95.mmBlockTrade, com.tools20022.repository.msg.SettlementDetails91.mmBlockTrade,
					com.tools20022.repository.msg.SettlementDetails92.mmBlockTrade, com.tools20022.repository.msg.SettlementDetails98.mmBlockTrade, com.tools20022.repository.msg.SettlementDetails101.mmBlockTrade,
					com.tools20022.repository.msg.SettlementDetails105.mmBlockTrade, com.tools20022.repository.msg.SettlementDetails106.mmBlockTrade, com.tools20022.repository.msg.SettlementDetails104.mmBlockTrade,
					com.tools20022.repository.msg.SettlementDetails111.mmBlockTrade, com.tools20022.repository.msg.SettlementDetails112.mmBlockTrade, com.tools20022.repository.msg.SettlementDetails110.mmBlockTrade,
					com.tools20022.repository.msg.SettlementDetails107.mmBlockTrade, com.tools20022.repository.msg.SettlementDetails115.mmBlockTrade, com.tools20022.repository.msg.SettlementDetails117.mmBlockTrade,
					com.tools20022.repository.choice.BlockTrade5Choice.mmCode, com.tools20022.repository.choice.BlockTrade5Choice.mmProprietary, com.tools20022.repository.msg.SettlementDetails116.mmBlockTrade,
					com.tools20022.repository.msg.SettlementDetails128.mmBlockTrade, com.tools20022.repository.msg.SettlementDetails120.mmBlockTrade, com.tools20022.repository.msg.SettlementDetails119.mmBlockTrade,
					com.tools20022.repository.msg.SettlementDetails126.mmBlockTrade, com.tools20022.repository.msg.SettlementDetails127.mmBlockTrade, com.tools20022.repository.msg.SettlementDetails121.mmBlockTrade,
					com.tools20022.repository.msg.SettlementDetails134.mmBlockTrade, com.tools20022.repository.msg.SettlementDetails137.mmBlockTrade, com.tools20022.repository.msg.SettlementDetails132.mmBlockTrade,
					com.tools20022.repository.msg.SettlementDetails130.mmBlockTrade, com.tools20022.repository.msg.SettlementDetails133.mmBlockTrade, com.tools20022.repository.msg.SettlementDetails139.mmBlockTrade);
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BlockTrade";
			definition = "Specifies whether the settlement instruction is a block parent or child.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BlockTradeCode.mmObject();
		}
	};
	protected SettlementSystemMethodCode settlementSystemMethod;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
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
	 * </ul>
	 * </li>
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
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.SettlementSystemMethod1Choice.mmCode, com.tools20022.repository.choice.SettlementSystemMethod1Choice.mmProprietary,
					com.tools20022.repository.msg.SettlementDetails9.mmSettlementSystemMethod, com.tools20022.repository.choice.SettlementSystemMethod2Choice.mmCode,
					com.tools20022.repository.choice.SettlementSystemMethod2Choice.mmProprietary, com.tools20022.repository.msg.SettlementDetails17.mmSettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails30.mmSettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails32.mmSettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails60.mmSettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails64.mmSettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails3.mmSettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails16.mmSettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails31.mmSettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails40.mmSettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails62.mmSettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails63.mmSettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails6.mmSettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails20.mmSettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails24.mmSettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails33.mmSettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails45.mmSettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails54.mmSettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails1.mmSettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails19.mmSettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails22.mmSettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails35.mmSettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails42.mmSettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails52.mmSettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails8.mmSettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails11.mmSettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails23.mmSettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails37.mmSettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails44.mmSettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails53.mmSettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails7.mmSettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails12.mmSettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails28.mmSettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails38.mmSettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails47.mmSettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails56.mmSettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails2.mmSettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails13.mmSettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails27.mmSettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails39.mmSettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails48.mmSettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails57.mmSettlementSystemMethod,
					com.tools20022.repository.choice.SettlementSystemMethod3Choice.mmCode, com.tools20022.repository.choice.SettlementSystemMethod3Choice.mmProprietary,
					com.tools20022.repository.msg.SettlementDetails43.mmSettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails4.mmSettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails10.mmSettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails29.mmSettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails5.mmSettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails26.mmSettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails65.mmSettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails14.mmSettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails41.mmSettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails61.mmSettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails59.mmSettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails15.mmSettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails36.mmSettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails18.mmSettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails66.mmSettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails67.mmSettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails70.mmSettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails69.mmSettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails71.mmSettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails72.mmSettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails75.mmSettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails73.mmSettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails74.mmSettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails81.mmSettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails76.mmSettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails80.mmSettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails78.mmSettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails77.mmSettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails79.mmSettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails87.mmSettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails86.mmSettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails85.mmSettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails93.mmSettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails90.mmSettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails96.mmSettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails97.mmSettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails100.mmSettlementSystemMethod, com.tools20022.repository.choice.SettlementSystemMethod4Choice.mmCode,
					com.tools20022.repository.choice.SettlementSystemMethod4Choice.mmProprietary, com.tools20022.repository.msg.SettlementDetails95.mmSettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails91.mmSettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails92.mmSettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails98.mmSettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails101.mmSettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails105.mmSettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails106.mmSettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails104.mmSettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails111.mmSettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails112.mmSettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails110.mmSettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails103.mmSettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails107.mmSettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails115.mmSettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails117.mmSettlementSystemMethod,
					com.tools20022.repository.choice.SettlementSystemMethod5Choice.mmCode, com.tools20022.repository.choice.SettlementSystemMethod5Choice.mmProprietary,
					com.tools20022.repository.msg.SettlementDetails116.mmSettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails128.mmSettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails120.mmSettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails119.mmSettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails126.mmSettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails127.mmSettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails121.mmSettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails134.mmSettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails137.mmSettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails132.mmSettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails130.mmSettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails133.mmSettlementSystemMethod,
					com.tools20022.repository.msg.SettlementDetails139.mmSettlementSystemMethod);
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementSystemMethod";
			definition = "Specifies whether the settlement instruction is to be settled through the default or the alternate settlement system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SettlementSystemMethodCode.mmObject();
		}
	};
	protected AutoBorrowingCode automaticBorrowing;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
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
	 * </ul>
	 * </li>
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
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AutomaticBorrowing1Choice.mmCode, com.tools20022.repository.choice.AutomaticBorrowing1Choice.mmProprietary,
					com.tools20022.repository.msg.SettlementDetails9.mmAutomaticBorrowing, com.tools20022.repository.choice.AutomaticBorrowing4Choice.mmCode, com.tools20022.repository.choice.AutomaticBorrowing4Choice.mmProprietary,
					com.tools20022.repository.msg.SettlementDetails17.mmAutomaticBorrowing, com.tools20022.repository.msg.SettlementDetails30.mmAutomaticBorrowing, com.tools20022.repository.msg.SettlementDetails32.mmAutomaticBorrowing,
					com.tools20022.repository.msg.SettlementDetails60.mmAutomaticBorrowing, com.tools20022.repository.msg.SettlementDetails64.mmAutomaticBorrowing, com.tools20022.repository.msg.SettlementDetails3.mmAutomaticBorrowing,
					com.tools20022.repository.msg.SettlementDetails16.mmAutomaticBorrowing, com.tools20022.repository.msg.SettlementDetails31.mmAutomaticBorrowing, com.tools20022.repository.msg.SettlementDetails40.mmAutomaticBorrowing,
					com.tools20022.repository.msg.SettlementDetails62.mmAutomaticBorrowing, com.tools20022.repository.msg.SettlementDetails63.mmAutomaticBorrowing, com.tools20022.repository.choice.AutomaticBorrowing2Choice.mmCode,
					com.tools20022.repository.choice.AutomaticBorrowing2Choice.mmProprietary, com.tools20022.repository.msg.RequestDetails1.mmAutomaticBorrowing, com.tools20022.repository.choice.AutomaticBorrowing3Choice.mmCode,
					com.tools20022.repository.choice.AutomaticBorrowing3Choice.mmProprietary, com.tools20022.repository.msg.RequestDetails2.mmAutomaticBorrowing, com.tools20022.repository.msg.RequestDetails6.mmAutomaticBorrowing,
					com.tools20022.repository.msg.RequestDetails7.mmAutomaticBorrowing, com.tools20022.repository.msg.RequestDetails8.mmAutomaticBorrowing, com.tools20022.repository.msg.RequestDetails9.mmAutomaticBorrowing,
					com.tools20022.repository.msg.RequestDetails11.mmAutomaticBorrowing, com.tools20022.repository.msg.RequestDetails12.mmAutomaticBorrowing, com.tools20022.repository.msg.SettlementDetails6.mmAutomaticBorrowing,
					com.tools20022.repository.msg.SettlementDetails20.mmAutomaticBorrowing, com.tools20022.repository.msg.SettlementDetails24.mmAutomaticBorrowing, com.tools20022.repository.msg.SettlementDetails33.mmAutomaticBorrowing,
					com.tools20022.repository.msg.SettlementDetails45.mmAutomaticBorrowing, com.tools20022.repository.msg.SettlementDetails54.mmAutomaticBorrowing, com.tools20022.repository.msg.SettlementDetails1.mmAutomaticBorrowing,
					com.tools20022.repository.msg.SettlementDetails19.mmAutomaticBorrowing, com.tools20022.repository.msg.SettlementDetails22.mmAutomaticBorrowing, com.tools20022.repository.msg.SettlementDetails35.mmAutomaticBorrowing,
					com.tools20022.repository.msg.SettlementDetails42.mmAutomaticBorrowing, com.tools20022.repository.msg.SettlementDetails52.mmAutomaticBorrowing, com.tools20022.repository.choice.AutomaticBorrowing5Choice.mmCode,
					com.tools20022.repository.choice.AutomaticBorrowing5Choice.mmProprietary, com.tools20022.repository.msg.SettlementDetails43.mmAutomaticBorrowing, com.tools20022.repository.msg.SettlementDetails26.mmAutomaticBorrowing,
					com.tools20022.repository.msg.SettlementDetails65.mmAutomaticBorrowing, com.tools20022.repository.msg.SettlementDetails36.mmAutomaticBorrowing, com.tools20022.repository.msg.SettlementDetails67.mmAutomaticBorrowing,
					com.tools20022.repository.msg.SettlementDetails70.mmAutomaticBorrowing, com.tools20022.repository.msg.SettlementDetails71.mmAutomaticBorrowing, com.tools20022.repository.msg.SettlementDetails72.mmAutomaticBorrowing,
					com.tools20022.repository.msg.RequestDetails13.mmAutomaticBorrowing, com.tools20022.repository.msg.SettlementDetails81.mmAutomaticBorrowing, com.tools20022.repository.msg.SettlementDetails76.mmAutomaticBorrowing,
					com.tools20022.repository.msg.SettlementDetails80.mmAutomaticBorrowing, com.tools20022.repository.msg.SettlementDetails78.mmAutomaticBorrowing, com.tools20022.repository.msg.SettlementDetails77.mmAutomaticBorrowing,
					com.tools20022.repository.msg.RequestDetails14.mmAutomaticBorrowing, com.tools20022.repository.choice.CommissionType5Choice.mmProprietary, com.tools20022.repository.msg.SettlementDetails93.mmAutomaticBorrowing,
					com.tools20022.repository.msg.RequestDetails15.mmAutomaticBorrowing, com.tools20022.repository.msg.SettlementDetails90.mmAutomaticBorrowing, com.tools20022.repository.msg.SettlementDetails96.mmAutomaticBorrowing,
					com.tools20022.repository.msg.SettlementDetails97.mmAutomaticBorrowing, com.tools20022.repository.choice.AutomaticBorrowing6Choice.mmCode, com.tools20022.repository.choice.AutomaticBorrowing6Choice.mmProprietary,
					com.tools20022.repository.choice.AutomaticBorrowing7Choice.mmCode, com.tools20022.repository.choice.AutomaticBorrowing7Choice.mmProprietary, com.tools20022.repository.msg.SettlementDetails101.mmAutomaticBorrowing,
					com.tools20022.repository.msg.SettlementDetails105.mmAutomaticBorrowing, com.tools20022.repository.msg.SettlementDetails106.mmAutomaticBorrowing, com.tools20022.repository.msg.SettlementDetails104.mmAutomaticBorrowing,
					com.tools20022.repository.msg.SettlementDetails111.mmAutomaticBorrowing, com.tools20022.repository.msg.RequestDetails16.mmAutomaticBorrowing, com.tools20022.repository.msg.SettlementDetails112.mmAutomaticBorrowing,
					com.tools20022.repository.msg.SettlementDetails110.mmAutomaticBorrowing, com.tools20022.repository.choice.AutomaticBorrowing8Choice.mmCode, com.tools20022.repository.choice.AutomaticBorrowing8Choice.mmProprietary,
					com.tools20022.repository.choice.AutomaticBorrowing11Choice.mmCode, com.tools20022.repository.choice.AutomaticBorrowing11Choice.mmProprietary, com.tools20022.repository.msg.SettlementDetails128.mmAutomaticBorrowing,
					com.tools20022.repository.msg.SettlementDetails120.mmAutomaticBorrowing, com.tools20022.repository.msg.SettlementDetails119.mmAutomaticBorrowing, com.tools20022.repository.msg.SettlementDetails134.mmAutomaticBorrowing,
					com.tools20022.repository.msg.SettlementDetails137.mmAutomaticBorrowing, com.tools20022.repository.msg.SettlementDetails132.mmAutomaticBorrowing);
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AutomaticBorrowing";
			definition = "Condition for automatic borrowing.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AutoBorrowingCode.mmObject();
		}
	};
	protected YesNoIndicator partialSettlementIndicator;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
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
	 * </ul>
	 * </li>
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
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementDetails9.mmPartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails17.mmPartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails30.mmPartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails32.mmPartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails3.mmPartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails16.mmPartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails31.mmPartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails40.mmPartialSettlementIndicator,
					com.tools20022.repository.msg.RequestDetails1.mmPartialSettlementIndicator, com.tools20022.repository.msg.RequestDetails2.mmPartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails6.mmPartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails20.mmPartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails1.mmPartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails19.mmPartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails8.mmPartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails11.mmPartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails7.mmPartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails12.mmPartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails2.mmPartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails13.mmPartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails43.mmPartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails10.mmPartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails29.mmPartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails5.mmPartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails25.mmPartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails14.mmPartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails41.mmPartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails15.mmPartialSettlementIndicator,
					com.tools20022.repository.msg.SettlementDetails34.mmPartialSettlementIndicator, com.tools20022.repository.msg.RequestDetails10.mmPartialSettlementIndicator);
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartialSettlementIndicator";
			definition = "Specifies whether partial settlement is allowed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator holdIndicator;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
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
	 * </ul>
	 * </li>
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
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementDetails3.mmHoldIndicator, com.tools20022.repository.msg.SettlementDetails16.mmHoldIndicator,
					com.tools20022.repository.msg.SettlementDetails31.mmHoldIndicator, com.tools20022.repository.msg.SettlementDetails40.mmHoldIndicator, com.tools20022.repository.msg.SettlementDetails62.mmHoldIndicator,
					com.tools20022.repository.msg.SettlementDetails63.mmHoldIndicator, com.tools20022.repository.msg.RequestDetails1.mmHoldIndicator, com.tools20022.repository.msg.RequestDetails2.mmHoldIndicator,
					com.tools20022.repository.msg.HoldIndicator2.mmIndicator, com.tools20022.repository.msg.RequestDetails6.mmHoldIndicator, com.tools20022.repository.msg.HoldIndicator3.mmIndicator,
					com.tools20022.repository.msg.RequestDetails7.mmHoldIndicator, com.tools20022.repository.msg.HoldIndicator4.mmIndicator, com.tools20022.repository.msg.RequestDetails8.mmHoldIndicator,
					com.tools20022.repository.msg.HoldIndicator5.mmIndicator, com.tools20022.repository.msg.RequestDetails9.mmHoldIndicator, com.tools20022.repository.msg.RequestDetails11.mmHoldIndicator,
					com.tools20022.repository.msg.RequestDetails12.mmHoldIndicator, com.tools20022.repository.msg.SettlementDetails1.mmHoldIndicator, com.tools20022.repository.msg.SettlementDetails19.mmHoldIndicator,
					com.tools20022.repository.msg.SettlementDetails22.mmHoldIndicator, com.tools20022.repository.msg.SettlementDetails35.mmHoldIndicator, com.tools20022.repository.msg.SettlementDetails42.mmHoldIndicator,
					com.tools20022.repository.msg.SettlementDetails52.mmHoldIndicator, com.tools20022.repository.msg.SettlementDetails8.mmHoldIndicator, com.tools20022.repository.msg.SettlementDetails11.mmHoldIndicator,
					com.tools20022.repository.msg.SettlementDetails23.mmHoldIndicator, com.tools20022.repository.msg.SettlementDetails37.mmHoldIndicator, com.tools20022.repository.msg.SettlementDetails44.mmHoldIndicator,
					com.tools20022.repository.msg.SettlementDetails53.mmHoldIndicator, com.tools20022.repository.msg.SettlementDetails7.mmHoldIndicator, com.tools20022.repository.msg.SettlementDetails12.mmHoldIndicator,
					com.tools20022.repository.msg.SettlementDetails28.mmHoldIndicator, com.tools20022.repository.msg.SettlementDetails38.mmHoldIndicator, com.tools20022.repository.msg.SettlementDetails47.mmHoldIndicator,
					com.tools20022.repository.msg.SettlementDetails56.mmHoldIndicator, com.tools20022.repository.msg.SettlementDetails43.mmHoldIndicator, com.tools20022.repository.msg.SettlementDetails10.mmHoldIndicator,
					com.tools20022.repository.msg.SettlementDetails29.mmHoldIndicator, com.tools20022.repository.msg.SettlementDetails5.mmHoldIndicator, com.tools20022.repository.msg.SettlementDetails25.mmHoldIndicator,
					com.tools20022.repository.msg.SettlementDetails65.mmHoldIndicator, com.tools20022.repository.msg.SettlementDetails14.mmHoldIndicator, com.tools20022.repository.msg.SettlementDetails41.mmHoldIndicator,
					com.tools20022.repository.msg.SettlementDetails61.mmHoldIndicator, com.tools20022.repository.msg.SettlementDetails59.mmHoldIndicator, com.tools20022.repository.msg.SettlementDetails15.mmHoldIndicator,
					com.tools20022.repository.msg.SettlementDetails34.mmHoldIndicator, com.tools20022.repository.msg.SettlementDetails49.mmHoldIndicator, com.tools20022.repository.msg.SettlementDetails58.mmHoldIndicator,
					com.tools20022.repository.msg.SettlementDetails66.mmHoldIndicator, com.tools20022.repository.msg.SettlementDetails67.mmHoldIndicator, com.tools20022.repository.msg.SettlementDetails69.mmHoldIndicator,
					com.tools20022.repository.msg.SettlementDetails72.mmHoldIndicator, com.tools20022.repository.msg.SettlementDetails73.mmHoldIndicator, com.tools20022.repository.msg.SettlementDetails74.mmHoldIndicator,
					com.tools20022.repository.msg.RequestDetails13.mmHoldIndicator, com.tools20022.repository.msg.SettlementDetails81.mmHoldIndicator, com.tools20022.repository.msg.SettlementDetails78.mmHoldIndicator,
					com.tools20022.repository.msg.SettlementDetails77.mmHoldIndicator, com.tools20022.repository.msg.RequestDetails14.mmHoldIndicator, com.tools20022.repository.msg.SettlementDetails79.mmHoldIndicator,
					com.tools20022.repository.msg.SettlementDetails86.mmHoldIndicator, com.tools20022.repository.msg.SettlementDetails85.mmHoldIndicator, com.tools20022.repository.msg.SettlementDetails93.mmHoldIndicator,
					com.tools20022.repository.msg.RequestDetails15.mmHoldIndicator, com.tools20022.repository.msg.SettlementDetails97.mmHoldIndicator, com.tools20022.repository.msg.SettlementDetails99.mmHoldIndicator,
					com.tools20022.repository.msg.SettlementDetails95.mmHoldIndicator, com.tools20022.repository.msg.SettlementDetails92.mmHoldIndicator, com.tools20022.repository.msg.HoldIndicator6.mmIndicator,
					com.tools20022.repository.msg.SettlementDetails98.mmHoldIndicator, com.tools20022.repository.msg.SettlementDetails101.mmHoldIndicator, com.tools20022.repository.msg.SettlementDetails105.mmHoldIndicator,
					com.tools20022.repository.msg.SettlementDetails106.mmHoldIndicator, com.tools20022.repository.msg.SettlementDetails111.mmHoldIndicator, com.tools20022.repository.msg.RequestDetails16.mmHoldIndicator,
					com.tools20022.repository.msg.SettlementDetails112.mmHoldIndicator, com.tools20022.repository.msg.SettlementDetails108.mmHoldIndicator, com.tools20022.repository.msg.SettlementDetails107.mmHoldIndicator,
					com.tools20022.repository.msg.SettlementDetails115.mmHoldIndicator, com.tools20022.repository.msg.HoldIndicator7.mmIndicator, com.tools20022.repository.msg.SettlementDetails116.mmHoldIndicator,
					com.tools20022.repository.msg.SettlementDetails120.mmHoldIndicator, com.tools20022.repository.msg.SettlementDetails119.mmHoldIndicator, com.tools20022.repository.msg.SettlementDetails125.mmHoldIndicator,
					com.tools20022.repository.msg.SettlementDetails127.mmHoldIndicator, com.tools20022.repository.msg.SettlementDetails121.mmHoldIndicator, com.tools20022.repository.msg.SettlementDetails137.mmHoldIndicator,
					com.tools20022.repository.msg.SettlementDetails132.mmHoldIndicator, com.tools20022.repository.msg.SettlementDetails130.mmHoldIndicator, com.tools20022.repository.msg.SettlementDetails131.mmHoldIndicator,
					com.tools20022.repository.msg.SettlementDetails133.mmHoldIndicator);
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "HoldIndicator";
			definition = "Specifies whether the transaction is on hold/blocked/frozen.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected SafekeepingPlace requestedSafekeepingPlace;
	/**
	 * Place requested as the place of safekeeping.
	 * <p>
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
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RequestedSafekeepingPlace";
			definition = "Place requested as the place of safekeeping.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SafekeepingPlace.mmSecuritiesSettlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SafekeepingPlace.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.PairOff> pairOff;
	/**
	 * Buy and sell trades are settled in cash, based on the difference in the
	 * prices between the off-setting trades.
	 * <p>
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
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PairOff";
			definition = "Buy and sell trades are settled in cash, based on the difference in the prices between the off-setting trades.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PairOff.mmRelatedSecuritiesSettlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PairOff.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Interest> accruedInterest;
	/**
	 * Interest included in the settlement.
	 * <p>
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
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccruedInterest";
			definition = "Interest included in the settlement.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Interest.mmSecuritiesSettlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
		}
	};
	protected SecuritiesClearing securitiesClearing;
	/**
	 * Clearing process which triggers the settlement process.
	 * <p>
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
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesClearing";
			definition = "Clearing process which triggers the settlement process.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesClearing.mmSecuritiesSettlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesClearing.mmObject();
		}
	};
	protected Payment payment;
	/**
	 * Specifies the cash payment information of a securities settlement.
	 * <p>
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
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Payment";
			definition = "Specifies the cash payment information of a securities settlement.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.mmRelatedSecuritiesSettlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
		}
	};
	protected Allocation settledAllocation;
	/**
	 * Allocation which is settled.
	 * <p>
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
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettledAllocation";
			definition = "Allocation which is settled.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Allocation.mmSettlementExecutionParameters;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Allocation.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.ForeignExchangeTrade> relatedForeignExchangeOperation;
	/**
	 * Entry details related to currency exchange information.
	 * <p>
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
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedForeignExchangeOperation";
			definition = "Entry details related to currency exchange information.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ForeignExchangeTrade.mmCurrencyExchangeForSecuritiesSettlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ForeignExchangeTrade.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Security> security;
	/**
	 * Security which is settled.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
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
	 * </ul>
	 * </li>
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
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails3.mmFinancialInstrumentAttributes,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails4.mmFinancialInstrumentAttributes, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails2.mmFinancialInstrumentAttributes,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails5.mmFinancialInstrumentAttributes, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails6.mmFinancialInstrumentAttributes,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails7.mmFinancialInstrumentAttributes, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails8.mmFinancialInstrumentAttributes,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails9.mmFinancialInstrumentAttributes, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails10.mmFinancialInstrumentAttributes,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails11.mmFinancialInstrumentAttributes, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails12.mmFinancialInstrumentAttributes,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails13.mmFinancialInstrumentAttributes, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails16.mmFinancialInstrumentAttributes,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails14.mmFinancialInstrumentAttributes, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails15.mmFinancialInstrumentAttributes,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails17.mmFinancialInstrumentAttributes, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails18.mmFinancialInstrumentAttributes,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails19.mmFinancialInstrumentAttributes, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails21.mmFinancialInstrumentAttributes,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails22.mmFinancialInstrumentAttributes, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails20.mmFinancialInstrumentAttributes,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails23.mmFinancialInstrumentAttributes, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails25.mmFinancialInstrumentAttributes,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails24.mmFinancialInstrumentAttributes, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails27.mmFinancialInstrumentAttributes,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails28.mmFinancialInstrumentAttributes, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails26.mmFinancialInstrumentAttributes,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails30.mmFinancialInstrumentAttributes, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails29.mmFinancialInstrumentAttributes,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails31.mmFinancialInstrumentAttributes);
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Security which is settled.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.mmSecuritiesSettlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
		}
	};
	protected Position position;
	/**
	 * Information on the quantities and amounts to be settled in a position.
	 * <p>
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
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Position";
			definition = "Information on the quantities and amounts to be settled in a position.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Position.mmSecuritiesSettlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Position.mmObject();
		}
	};
	protected Rollover rollover;
	/**
	 * Process whereby a financial instrument is reinvested at maturity.
	 * <p>
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
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Rollover";
			definition = "Process whereby a financial instrument is reinvested at maturity.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Rollover.mmSecuritiesSettlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Rollover.mmObject();
		}
	};
	protected SecuritiesQuantity turnedQuantity;
	/**
	 * Relates to a turnaround: the same security is bought and sold to settle
	 * the same day, to or from different brokers.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
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
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PairedOrTurnedQuantity1Choice.mmTurnedQuantity, com.tools20022.repository.choice.PairedOrTurnedQuantity2Choice.mmTurnedQuantity,
					com.tools20022.repository.choice.PairedOrTurnedQuantity3Choice.mmTurnedQuantity, com.tools20022.repository.choice.PairedOrTurnedQuantity4Choice.mmTurnedQuantity);
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TurnedQuantity";
			definition = "Relates to a turnaround: the same security is bought and sold to settle the same day, to or from different brokers.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmRelatedTurnaroundSettlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected ObligationTypeCode settlementReason;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
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
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ObligationType1Choice.mmCode, com.tools20022.repository.choice.ObligationType1Choice.mmProprietary,
					com.tools20022.repository.msg.SettlementObligation3.mmObligationType, com.tools20022.repository.msg.SettlementObligation5.mmObligationType);
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementReason";
			definition = "Specifies the reason for the settlement related to the type of underlying trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ObligationTypeCode.mmObject();
		}
	};
	protected DeliveryReceiptTypeCode settlementType;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
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
	 * </ul>
	 * </li>
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
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementTypeAndIdentification3.mmPayment, com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters5.mmPayment,
					com.tools20022.repository.msg.SettlementTypeAndIdentification13.mmPayment, com.tools20022.repository.msg.SettlementTypeAndIdentification7.mmPayment,
					com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters8.mmPayment, com.tools20022.repository.msg.SettlementTypeAndIdentification2.mmPayment,
					com.tools20022.repository.msg.SettlementTypeAndIdentification5.mmPayment, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters3.mmPayment,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters6.mmPayment, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters1.mmPayment,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters4.mmPayment, com.tools20022.repository.msg.SettlementTypeAndIdentification14.mmPayment,
					com.tools20022.repository.msg.SettlementTypeAndIdentification1.mmPayment, com.tools20022.repository.msg.SettlementTypeAndIdentification8.mmPayment,
					com.tools20022.repository.msg.SettlementTypeAndIdentification9.mmPayment, com.tools20022.repository.msg.SettlementTypeAndIdentification11.mmPayment,
					com.tools20022.repository.msg.SettlementTypeAndIdentification15.mmPayment, com.tools20022.repository.msg.SettlementTypeAndIdentification17.mmPayment,
					com.tools20022.repository.msg.SettlementTypeAndIdentification10.mmPayment, com.tools20022.repository.msg.SettlementTypeAndIdentification12.mmPayment,
					com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters1.mmPayment, com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters4.mmPayment,
					com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters9.mmPayment, com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters10.mmPayment,
					com.tools20022.repository.msg.TransactionDetails5.mmPayment, com.tools20022.repository.msg.TransactionDetails9.mmPayment, com.tools20022.repository.msg.TransactionDetails22.mmPayment,
					com.tools20022.repository.msg.TransactionDetails23.mmPayment, com.tools20022.repository.msg.TransactionDetails36.mmPayment, com.tools20022.repository.msg.TransactionDetails47.mmPayment,
					com.tools20022.repository.msg.TransactionDetails53.mmPayment, com.tools20022.repository.msg.TransactionDetails58.mmPayment, com.tools20022.repository.msg.TransactionDetails7.mmPayment,
					com.tools20022.repository.msg.TransactionDetails8.mmPayment, com.tools20022.repository.msg.TransactionDetails16.mmPayment, com.tools20022.repository.msg.TransactionDetails17.mmPayment,
					com.tools20022.repository.msg.TransactionDetails26.mmPayment, com.tools20022.repository.msg.TransactionDetails25.mmPayment, com.tools20022.repository.msg.TransactionDetails27.mmPayment,
					com.tools20022.repository.msg.TransactionDetails33.mmPayment, com.tools20022.repository.msg.TransactionDetails39.mmPayment, com.tools20022.repository.msg.TransactionDetails50.mmPayment,
					com.tools20022.repository.msg.TransactionDetails56.mmPayment, com.tools20022.repository.msg.TransactionDetails59.mmPayment, com.tools20022.repository.msg.TransactionDetails6.mmPayment,
					com.tools20022.repository.msg.TransactionDetails18.mmPayment, com.tools20022.repository.msg.TransactionDetails24.mmPayment, com.tools20022.repository.msg.TransactionDetails34.mmPayment,
					com.tools20022.repository.msg.TransactionDetails37.mmPayment, com.tools20022.repository.msg.TransactionDetails48.mmPayment, com.tools20022.repository.msg.TransactionDetails57.mmPayment,
					com.tools20022.repository.msg.TransactionDetails60.mmPayment, com.tools20022.repository.msg.Order14.mmPayment, com.tools20022.repository.msg.FundOrderData2.mmSettlementMethod,
					com.tools20022.repository.msg.RedemptionOrder5.mmSettlementMethod, com.tools20022.repository.msg.RedemptionExecution5.mmSettlementMethod, com.tools20022.repository.msg.RedemptionOrder7.mmSettlementMethod,
					com.tools20022.repository.msg.RedemptionOrder6.mmSettlementMethod, com.tools20022.repository.msg.RedemptionExecution6.mmSettlementMethod, com.tools20022.repository.msg.RedemptionOrder8.mmSettlementMethod,
					com.tools20022.repository.msg.SubscriptionOrder5.mmSettlementMethod, com.tools20022.repository.msg.SubscriptionExecution5.mmSettlementMethod, com.tools20022.repository.msg.SubscriptionOrder7.mmSettlementMethod,
					com.tools20022.repository.msg.SubscriptionOrder6.mmSettlementMethod, com.tools20022.repository.msg.SubscriptionExecution6.mmSettlementMethod, com.tools20022.repository.msg.SubscriptionOrder8.mmSettlementMethod,
					com.tools20022.repository.msg.SwitchOrder3.mmSettlementMethod, com.tools20022.repository.msg.SwitchExecution4.mmSettlementMethod, com.tools20022.repository.msg.SwitchOrder4.mmSettlementMethod,
					com.tools20022.repository.msg.SecuritiesTradeDetails7.mmPayment, com.tools20022.repository.msg.SecuritiesTradeDetails19.mmPayment, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters2.mmPayment,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters7.mmPayment, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2.mmPayment,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8.mmPayment, com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters2.mmPayment,
					com.tools20022.repository.msg.SecuritiesTradeDetails4.mmPayment, com.tools20022.repository.msg.SecuritiesTradeDetails17.mmPayment, com.tools20022.repository.msg.SettlementTypeAndIdentification4.mmPayment,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters5.mmPayment, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters8.mmPayment,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6.mmPayment, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10.mmPayment,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17.mmPayment, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18.mmPayment,
					com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters3.mmPayment, com.tools20022.repository.msg.SecuritiesTradeDetails10.mmPayment, com.tools20022.repository.msg.SecuritiesTradeDetails22.mmPayment,
					com.tools20022.repository.msg.SecuritiesTradeDetails23.mmPayment, com.tools20022.repository.msg.SecuritiesTradeDetails29.mmPayment, com.tools20022.repository.msg.TransactionDetails40.mmPayment,
					com.tools20022.repository.msg.TransactionDetails42.mmPayment, com.tools20022.repository.msg.TransactionDetails46.mmPayment, com.tools20022.repository.msg.SettlementTypeAndIdentification6.mmPayment,
					com.tools20022.repository.msg.SecuritiesTradeDetails14.mmPayment, com.tools20022.repository.msg.SecuritiesTradeDetails20.mmPayment, com.tools20022.repository.msg.SecuritiesTradeDetails24.mmPayment,
					com.tools20022.repository.msg.SecuritiesTradeDetails30.mmPayment, com.tools20022.repository.msg.TransactionDetails45.mmPayment, com.tools20022.repository.msg.SettlementObligation3.mmPayment,
					com.tools20022.repository.msg.SettlementObligation5.mmPayment, com.tools20022.repository.msg.SettlementObligation4.mmPayment, com.tools20022.repository.msg.RedemptionOrder11.mmSettlementMethod,
					com.tools20022.repository.msg.RedemptionExecution12.mmSettlementMethod, com.tools20022.repository.msg.SubscriptionOrder11.mmSettlementMethod, com.tools20022.repository.msg.SubscriptionExecution9.mmSettlementMethod,
					com.tools20022.repository.msg.TransactionDetails51.mmPayment, com.tools20022.repository.msg.TransactionDetails61.mmPayment, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21.mmPayment,
					com.tools20022.repository.msg.TransactionDetails62.mmPayment, com.tools20022.repository.msg.TransactionDetails63.mmPayment, com.tools20022.repository.msg.SecuritiesTradeDetails35.mmPayment,
					com.tools20022.repository.msg.Order17.mmPayment, com.tools20022.repository.msg.Order18.mmPayment, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22.mmPayment,
					com.tools20022.repository.msg.TransactionDetails66.mmPayment, com.tools20022.repository.msg.SecuritiesTradeDetails42.mmPayment, com.tools20022.repository.msg.TransactionDetails67.mmPayment,
					com.tools20022.repository.msg.TransactionDetails68.mmPayment, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24.mmPayment, com.tools20022.repository.msg.TransactionDetails70.mmPayment,
					com.tools20022.repository.msg.TransactionDetails69.mmPayment, com.tools20022.repository.msg.SettlementObligation8.mmPayment, com.tools20022.repository.msg.TransactionDetails71.mmPayment,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25.mmPayment, com.tools20022.repository.msg.TransactionDetails72.mmPayment, com.tools20022.repository.msg.TransactionDetails81.mmPayment,
					com.tools20022.repository.msg.SecuritiesTradeDetails49.mmPayment, com.tools20022.repository.msg.TransactionDetails82.mmPayment, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26.mmPayment,
					com.tools20022.repository.msg.TransactionDetails79.mmPayment, com.tools20022.repository.msg.SecuritiesTradeDetails48.mmPayment, com.tools20022.repository.msg.TransactionDetails75.mmPayment,
					com.tools20022.repository.msg.TransactionDetails78.mmPayment, com.tools20022.repository.msg.SettlementTypeAndIdentification18.mmPayment, com.tools20022.repository.msg.SettlementTypeAndIdentification19.mmPayment,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters10.mmPayment, com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters11.mmPayment,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters9.mmPayment, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters11.mmPayment,
					com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters12.mmPayment, com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters14.mmPayment,
					com.tools20022.repository.msg.SettlementTypeAndIdentification20.mmPayment, com.tools20022.repository.msg.SettlementTypeAndIdentification21.mmPayment, com.tools20022.repository.msg.SecuritiesTradeDetails57.mmPayment,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters13.mmPayment, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmPayment,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters14.mmPayment, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters12.mmPayment,
					com.tools20022.repository.msg.SecuritiesTradeDetails61.mmPayment, com.tools20022.repository.msg.TransactionDetails92.mmPayment, com.tools20022.repository.msg.TransactionDetails84.mmPayment,
					com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters16.mmPayment, com.tools20022.repository.msg.SettlementTypeAndIdentification24.mmPayment, com.tools20022.repository.msg.TransactionDetails87.mmPayment,
					com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters15.mmPayment, com.tools20022.repository.msg.TransactionDetails91.mmPayment, com.tools20022.repository.msg.TransactionDetails90.mmPayment,
					com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters18.mmPayment, com.tools20022.repository.msg.SettlementTypeAndIdentification22.mmPayment,
					com.tools20022.repository.msg.SwitchExecution7.mmSettlementMethod, com.tools20022.repository.msg.SwitchOrder7.mmSettlementMethod, com.tools20022.repository.msg.RedemptionOrder14.mmSettlementMethod,
					com.tools20022.repository.msg.SubscriptionExecution13.mmSettlementMethod, com.tools20022.repository.msg.SubscriptionExecution12.mmSettlementMethod, com.tools20022.repository.msg.SubscriptionOrder15.mmSettlementMethod,
					com.tools20022.repository.msg.RedemptionOrder15.mmSettlementMethod, com.tools20022.repository.msg.RedemptionExecution16.mmSettlementMethod, com.tools20022.repository.msg.SubscriptionOrder14.mmSettlementMethod,
					com.tools20022.repository.msg.FundOrderData6.mmSettlementMethod, com.tools20022.repository.msg.RedemptionExecution15.mmSettlementMethod, com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters19.mmPayment,
					com.tools20022.repository.msg.SecuritiesTradeDetails68.mmPayment, com.tools20022.repository.msg.TransactionDetails97.mmPayment, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters15.mmPayment,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters17.mmPayment, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters16.mmPayment,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35.mmPayment, com.tools20022.repository.msg.TransactionDetails96.mmPayment, com.tools20022.repository.msg.TransactionDetails95.mmPayment,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters19.mmPayment, com.tools20022.repository.msg.SecuritiesTradeDetails69.mmPayment,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters20.mmPayment, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters18.mmPayment,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36.mmPayment, com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters20.mmPayment,
					com.tools20022.repository.msg.TransactionDetails100.mmPayment, com.tools20022.repository.msg.TransactionDetails99.mmPayment, com.tools20022.repository.msg.TransactionDetails98.mmPayment);
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementType";
			definition = "Specifies how the transaction is to be settled, eg, against payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DeliveryReceiptTypeCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesSettlement";
				definition = "Settlement of the securities in a securities transaction, that is, the instruction to deliver or receive securities, involving the payment of an amount of money or not.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.mmSecuritiesSettlement, com.tools20022.repository.entity.Payment.mmRelatedSecuritiesSettlement,
						com.tools20022.repository.entity.SecuritiesQuantity.mmSecuritiesSettlement, com.tools20022.repository.entity.SecuritiesQuantity.mmRelatedTurnaroundSettlement,
						com.tools20022.repository.entity.SecuritiesTransfer.mmRelatedSettlement, com.tools20022.repository.entity.SecuritiesSettlementPartyRole.mmSecuritiesSettlement,
						com.tools20022.repository.entity.Interest.mmSecuritiesSettlement, com.tools20022.repository.entity.SafekeepingPlace.mmSecuritiesSettlement,
						com.tools20022.repository.entity.SecuritiesTradeExecution.mmSecuritiesSettlement, com.tools20022.repository.entity.ForeignExchangeTrade.mmCurrencyExchangeForSecuritiesSettlement,
						com.tools20022.repository.entity.Allocation.mmSettlementExecutionParameters, com.tools20022.repository.entity.PairOff.mmRelatedSecuritiesSettlement, com.tools20022.repository.entity.Rollover.mmSecuritiesSettlement,
						com.tools20022.repository.entity.SecuritiesClearing.mmSecuritiesSettlement, com.tools20022.repository.entity.Position.mmSecuritiesSettlement);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails3.mmSettlementTypeAndAdditionalParameters,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails3.mmQuantityAndAccountDetails, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails3.mmSettlementParameters,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails4.mmSettlementTypeAndAdditionalParameters, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails4.mmQuantityAndAccountDetails,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails4.mmSettlementParameters, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails2.mmSettlementTypeAndAdditionalParameters,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails2.mmQuantityAndAccountDetails, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails2.mmSettlementParameters,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails5.mmSettlementTypeAndAdditionalParameters, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails5.mmQuantityAndAccountDetails,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails5.mmSettlementParameters, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails6.mmSettlementTypeAndAdditionalParameters,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails6.mmQuantityAndAccountDetails, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails6.mmSettlementParameters,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails7.mmSettlementTypeAndAdditionalParameters, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails7.mmQuantityAndAccountDetails,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails7.mmSettlementParameters, com.tools20022.repository.choice.Cancellation1Choice.mmTransferOutDetails,
						com.tools20022.repository.choice.Cancellation2Choice.mmTransferInDetails, com.tools20022.repository.msg.RequestDetails1.mmUnilateralSplit, com.tools20022.repository.msg.RequestDetails2.mmUnilateralSplit,
						com.tools20022.repository.msg.RequestDetails6.mmUnilateralSplit, com.tools20022.repository.msg.RequestDetails7.mmUnilateralSplit, com.tools20022.repository.msg.RequestDetails8.mmUnilateralSplit,
						com.tools20022.repository.msg.RequestDetails9.mmUnilateralSplit, com.tools20022.repository.msg.RequestDetails11.mmUnilateralSplit, com.tools20022.repository.msg.RequestDetails12.mmUnilateralSplit,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails8.mmSettlementTypeAndAdditionalParameters, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails8.mmQuantityAndAccountDetails,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails8.mmSettlementParameters, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails9.mmSettlementTypeAndAdditionalParameters,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails9.mmQuantityAndAccountDetails, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails9.mmSettlementParameters,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails10.mmSettlementTypeAndAdditionalParameters, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails10.mmQuantityAndAccountDetails,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails10.mmSettlementParameters, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails11.mmSettlementTypeAndAdditionalParameters,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails11.mmQuantityAndAccountDetails, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails11.mmSettlementParameters,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails12.mmSettlementTypeAndAdditionalParameters, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails12.mmQuantityAndAccountDetails,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails12.mmSettlementParameters, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails13.mmSettlementTypeAndAdditionalParameters,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails13.mmQuantityAndAccountDetails, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails13.mmSettlementParameters,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2.mmSettlementParameters, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8.mmSettlementParameters,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6.mmSettlementParameters, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10.mmSettlementParameters,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17.mmSettlementParameters, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18.mmSettlementParameters,
						com.tools20022.repository.choice.Cancellation5Choice.mmTransferInDetails, com.tools20022.repository.choice.Cancellation4Choice.mmTransferOutDetails,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails16.mmSettlementTypeAndAdditionalParameters, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails16.mmQuantityAndAccountDetails,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails16.mmSettlementParameters, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails14.mmSettlementTypeAndAdditionalParameters,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails14.mmQuantityAndAccountDetails, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails14.mmSettlementParameters,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails15.mmSettlementTypeAndAdditionalParameters, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails15.mmQuantityAndAccountDetails,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails15.mmSettlementParameters, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21.mmSettlementParameters,
						com.tools20022.repository.msg.RequestDetails13.mmUnilateralSplit, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22.mmSettlementParameters,
						com.tools20022.repository.msg.RequestDetails14.mmUnilateralSplit, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails17.mmSettlementTypeAndAdditionalParameters,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails17.mmQuantityAndAccountDetails, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails17.mmSettlementParameters,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails18.mmSettlementTypeAndAdditionalParameters, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails18.mmQuantityAndAccountDetails,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails18.mmSettlementParameters, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails19.mmSettlementTypeAndAdditionalParameters,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails19.mmQuantityAndAccountDetails, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails19.mmSettlementParameters,
						com.tools20022.repository.choice.Cancellation9Choice.mmTransferInDetails, com.tools20022.repository.choice.Cancellation8Choice.mmTransferOutDetails,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24.mmSettlementParameters, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25.mmSettlementParameters,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26.mmSettlementParameters, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails21.mmSettlementTypeAndAdditionalParameters,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails21.mmQuantityAndAccountDetails, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails21.mmSettlementParameters,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails22.mmSettlementTypeAndAdditionalParameters, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails22.mmQuantityAndAccountDetails,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails22.mmSettlementParameters, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails20.mmSettlementTypeAndAdditionalParameters,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails20.mmQuantityAndAccountDetails, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails20.mmSettlementParameters,
						com.tools20022.repository.msg.RequestDetails15.mmUnilateralSplit, com.tools20022.repository.choice.Cancellation12Choice.mmTransferOutDetails,
						com.tools20022.repository.choice.Cancellation10Choice.mmTransferInDetails, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmSettlementParameters,
						com.tools20022.repository.msg.RequestDetails16.mmUnilateralSplit, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails23.mmSettlementTypeAndAdditionalParameters,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails23.mmQuantityAndAccountDetails, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails23.mmSettlementParameters,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails25.mmSettlementTypeAndAdditionalParameters, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails25.mmQuantityAndAccountDetails,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails25.mmSettlementParameters, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails24.mmSettlementTypeAndAdditionalParameters,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails24.mmQuantityAndAccountDetails, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails24.mmSettlementParameters,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35.mmSettlementParameters, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails27.mmSettlementTypeAndAdditionalParameters,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails27.mmQuantityAndAccountDetails, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails27.mmSettlementParameters,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails28.mmSettlementTypeAndAdditionalParameters, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails28.mmQuantityAndAccountDetails,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails28.mmSettlementParameters, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails26.mmSettlementTypeAndAdditionalParameters,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails26.mmQuantityAndAccountDetails, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails26.mmSettlementParameters,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36.mmSettlementParameters, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails30.mmSettlementTypeAndAdditionalParameters,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails30.mmQuantityAndAccountDetails, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails30.mmSettlementParameters,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails29.mmSettlementTypeAndAdditionalParameters, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails29.mmQuantityAndAccountDetails,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails29.mmSettlementParameters, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails31.mmSettlementTypeAndAdditionalParameters,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails31.mmQuantityAndAccountDetails, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails31.mmSettlementParameters);
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
		});
		return mmObject_lazy.get();
	}

	public SecuritiesTransfer getTransferOperation() {
		return transferOperation;
	}

	public void setTransferOperation(com.tools20022.repository.entity.SecuritiesTransfer transferOperation) {
		this.transferOperation = transferOperation;
	}

	public ISODateTime getSettlementDate() {
		return settlementDate;
	}

	public void setSettlementDate(ISODateTime settlementDate) {
		this.settlementDate = settlementDate;
	}

	public List<SecuritiesSettlementPartyRole> getPartyRole() {
		return partyRole;
	}

	public void setPartyRole(List<com.tools20022.repository.entity.SecuritiesSettlementPartyRole> partyRole) {
		this.partyRole = partyRole;
	}

	public ActiveCurrencyAndAmount getSettlementAmount() {
		return settlementAmount;
	}

	public void setSettlementAmount(ActiveCurrencyAndAmount settlementAmount) {
		this.settlementAmount = settlementAmount;
	}

	public Max35Text getHoldingsPlanType() {
		return holdingsPlanType;
	}

	public void setHoldingsPlanType(Max35Text holdingsPlanType) {
		this.holdingsPlanType = holdingsPlanType;
	}

	public ReceiveDeliveryCode getSecuritiesMovementType() {
		return securitiesMovementType;
	}

	public void setSecuritiesMovementType(ReceiveDeliveryCode securitiesMovementType) {
		this.securitiesMovementType = securitiesMovementType;
	}

	public SecuritiesQuantity getSettlementQuantity() {
		return settlementQuantity;
	}

	public void setSettlementQuantity(com.tools20022.repository.entity.SecuritiesQuantity settlementQuantity) {
		this.settlementQuantity = settlementQuantity;
	}

	public SecuritiesTradeExecution getSecuritiesTradeExecution() {
		return securitiesTradeExecution;
	}

	public void setSecuritiesTradeExecution(com.tools20022.repository.entity.SecuritiesTradeExecution securitiesTradeExecution) {
		this.securitiesTradeExecution = securitiesTradeExecution;
	}

	public CurrencyCode getCurrencyToBuy() {
		return currencyToBuy;
	}

	public void setCurrencyToBuy(CurrencyCode currencyToBuy) {
		this.currencyToBuy = currencyToBuy;
	}

	public CurrencyCode getCurrencyToSell() {
		return currencyToSell;
	}

	public void setCurrencyToSell(CurrencyCode currencyToSell) {
		this.currencyToSell = currencyToSell;
	}

	public Max35Text getDenominationChoice() {
		return denominationChoice;
	}

	public void setDenominationChoice(Max35Text denominationChoice) {
		this.denominationChoice = denominationChoice;
	}

	public SettlementTransactionConditionCode getSettlementTransactionCondition() {
		return settlementTransactionCondition;
	}

	public void setSettlementTransactionCondition(SettlementTransactionConditionCode settlementTransactionCondition) {
		this.settlementTransactionCondition = settlementTransactionCondition;
	}

	public YesNoIndicator getBeneficialOwnershipIndicator() {
		return beneficialOwnershipIndicator;
	}

	public void setBeneficialOwnershipIndicator(YesNoIndicator beneficialOwnershipIndicator) {
		this.beneficialOwnershipIndicator = beneficialOwnershipIndicator;
	}

	public MarketClientSideCode getMarketClientSide() {
		return marketClientSide;
	}

	public void setMarketClientSide(MarketClientSideCode marketClientSide) {
		this.marketClientSide = marketClientSide;
	}

	public YesNoIndicator getTracking() {
		return tracking;
	}

	public void setTracking(YesNoIndicator tracking) {
		this.tracking = tracking;
	}

	public YesNoIndicator getLetterOfGuarantee() {
		return letterOfGuarantee;
	}

	public void setLetterOfGuarantee(YesNoIndicator letterOfGuarantee) {
		this.letterOfGuarantee = letterOfGuarantee;
	}

	public YesNoIndicator getEligibleForCollateral() {
		return eligibleForCollateral;
	}

	public void setEligibleForCollateral(YesNoIndicator eligibleForCollateral) {
		this.eligibleForCollateral = eligibleForCollateral;
	}

	public YesNoIndicator getAccruedInterestIndicator() {
		return accruedInterestIndicator;
	}

	public void setAccruedInterestIndicator(YesNoIndicator accruedInterestIndicator) {
		this.accruedInterestIndicator = accruedInterestIndicator;
	}

	public PreConfirmationCode getPreConfirmation() {
		return preConfirmation;
	}

	public void setPreConfirmation(PreConfirmationCode preConfirmation) {
		this.preConfirmation = preConfirmation;
	}

	public YesNoIndicator getSecuritiesRealTimeGrossSettlement() {
		return securitiesRealTimeGrossSettlement;
	}

	public void setSecuritiesRealTimeGrossSettlement(YesNoIndicator securitiesRealTimeGrossSettlement) {
		this.securitiesRealTimeGrossSettlement = securitiesRealTimeGrossSettlement;
	}

	public BlockTradeCode getBlockTrade() {
		return blockTrade;
	}

	public void setBlockTrade(BlockTradeCode blockTrade) {
		this.blockTrade = blockTrade;
	}

	public SettlementSystemMethodCode getSettlementSystemMethod() {
		return settlementSystemMethod;
	}

	public void setSettlementSystemMethod(SettlementSystemMethodCode settlementSystemMethod) {
		this.settlementSystemMethod = settlementSystemMethod;
	}

	public AutoBorrowingCode getAutomaticBorrowing() {
		return automaticBorrowing;
	}

	public void setAutomaticBorrowing(AutoBorrowingCode automaticBorrowing) {
		this.automaticBorrowing = automaticBorrowing;
	}

	public YesNoIndicator getPartialSettlementIndicator() {
		return partialSettlementIndicator;
	}

	public void setPartialSettlementIndicator(YesNoIndicator partialSettlementIndicator) {
		this.partialSettlementIndicator = partialSettlementIndicator;
	}

	public YesNoIndicator getHoldIndicator() {
		return holdIndicator;
	}

	public void setHoldIndicator(YesNoIndicator holdIndicator) {
		this.holdIndicator = holdIndicator;
	}

	public SafekeepingPlace getRequestedSafekeepingPlace() {
		return requestedSafekeepingPlace;
	}

	public void setRequestedSafekeepingPlace(com.tools20022.repository.entity.SafekeepingPlace requestedSafekeepingPlace) {
		this.requestedSafekeepingPlace = requestedSafekeepingPlace;
	}

	public List<PairOff> getPairOff() {
		return pairOff;
	}

	public void setPairOff(List<com.tools20022.repository.entity.PairOff> pairOff) {
		this.pairOff = pairOff;
	}

	public List<Interest> getAccruedInterest() {
		return accruedInterest;
	}

	public void setAccruedInterest(List<com.tools20022.repository.entity.Interest> accruedInterest) {
		this.accruedInterest = accruedInterest;
	}

	public SecuritiesClearing getSecuritiesClearing() {
		return securitiesClearing;
	}

	public void setSecuritiesClearing(com.tools20022.repository.entity.SecuritiesClearing securitiesClearing) {
		this.securitiesClearing = securitiesClearing;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(com.tools20022.repository.entity.Payment payment) {
		this.payment = payment;
	}

	public Allocation getSettledAllocation() {
		return settledAllocation;
	}

	public void setSettledAllocation(com.tools20022.repository.entity.Allocation settledAllocation) {
		this.settledAllocation = settledAllocation;
	}

	public List<ForeignExchangeTrade> getRelatedForeignExchangeOperation() {
		return relatedForeignExchangeOperation;
	}

	public void setRelatedForeignExchangeOperation(List<com.tools20022.repository.entity.ForeignExchangeTrade> relatedForeignExchangeOperation) {
		this.relatedForeignExchangeOperation = relatedForeignExchangeOperation;
	}

	public List<Security> getSecurity() {
		return security;
	}

	public void setSecurity(List<com.tools20022.repository.entity.Security> security) {
		this.security = security;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(com.tools20022.repository.entity.Position position) {
		this.position = position;
	}

	public Rollover getRollover() {
		return rollover;
	}

	public void setRollover(com.tools20022.repository.entity.Rollover rollover) {
		this.rollover = rollover;
	}

	public SecuritiesQuantity getTurnedQuantity() {
		return turnedQuantity;
	}

	public void setTurnedQuantity(com.tools20022.repository.entity.SecuritiesQuantity turnedQuantity) {
		this.turnedQuantity = turnedQuantity;
	}

	public ObligationTypeCode getSettlementReason() {
		return settlementReason;
	}

	public void setSettlementReason(ObligationTypeCode settlementReason) {
		this.settlementReason = settlementReason;
	}

	public DeliveryReceiptTypeCode getSettlementType() {
		return settlementType;
	}

	public void setSettlementType(DeliveryReceiptTypeCode settlementType) {
		this.settlementType = settlementType;
	}
}