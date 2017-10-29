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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.TradeIdentification;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the different identifications associated with a securities
 * transaction.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesTradeIdentification"
 * src="doc-files/SecuritiesTradeIdentification.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#IdentifiedTrade
 * SecuritiesTradeIdentification.IdentifiedTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#MarketInfrastructureTransactionIdentification
 * SecuritiesTradeIdentification.MarketInfrastructureTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#ProcessorTransactionIdentification
 * SecuritiesTradeIdentification.ProcessorTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#PoolIdentification
 * SecuritiesTradeIdentification.PoolIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#CollateralTransactionIdentification
 * SecuritiesTradeIdentification.CollateralTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#ClientTripartyCollateralTransactionIdentification
 * SecuritiesTradeIdentification.
 * ClientTripartyCollateralTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#TripartyAgentCollateralTransactionIdentification
 * SecuritiesTradeIdentification.
 * TripartyAgentCollateralTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#BasketIdentification
 * SecuritiesTradeIdentification.BasketIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#ProgramIdentification
 * SecuritiesTradeIdentification.ProgramIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#BlockIdentification
 * SecuritiesTradeIdentification.BlockIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#AllocationIdentification
 * SecuritiesTradeIdentification.AllocationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#ComplianceIdentification
 * SecuritiesTradeIdentification.ComplianceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#CSDTransactionIdentification
 * SecuritiesTradeIdentification.CSDTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#CentralCounterpartyTransactionIdentification
 * SecuritiesTradeIdentification.CentralCounterpartyTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#CancellationRequestIdentification
 * SecuritiesTradeIdentification.CancellationRequestIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#SecuritiesTradeRelatedIdentifications
 * SecuritiesTrade.SecuritiesTradeRelatedIdentifications}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Identification1#Identification
 * Identification1.Identification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Identification4#Identification
 * Identification4.Identification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages1#Reference
 * Linkages1.Reference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages21#Reference
 * Linkages21.Reference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages4#Reference
 * Linkages4.Reference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages22#Reference
 * Linkages22.Reference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages9#Reference
 * Linkages9.Reference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages14#Reference
 * Linkages14.Reference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages17#Reference
 * Linkages17.Reference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages24#Reference
 * Linkages24.Reference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages3#Reference
 * Linkages3.Reference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages6#Reference
 * Linkages6.Reference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages10#Reference
 * Linkages10.Reference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages11#Reference
 * Linkages11.Reference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages16#Reference
 * Linkages16.Reference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages23#Reference
 * Linkages23.Reference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages7#Reference
 * Linkages7.Reference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages12#Reference
 * Linkages12.Reference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages15#Reference
 * Linkages15.Reference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages18#Reference
 * Linkages18.Reference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages2#Reference
 * Linkages2.Reference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages8#Reference
 * Linkages8.Reference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages5#Reference
 * Linkages5.Reference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages13#Reference
 * Linkages13.Reference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages19#Reference
 * Linkages19.Reference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages25#Reference
 * Linkages25.Reference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages26#Reference
 * Linkages26.Reference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Identification14#Identification
 * Identification14.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference7#Reference
 * MessageAndBusinessReference7.Reference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages36#Reference
 * Linkages36.Reference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages37#Reference
 * Linkages37.Reference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages38#Reference
 * Linkages38.Reference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages40#Reference
 * Linkages40.Reference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference8#Reference
 * MessageAndBusinessReference8.Reference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages43#Reference
 * Linkages43.Reference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages42#Reference
 * Linkages42.Reference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Identification16#Identification
 * Identification16.Identification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages49#Reference
 * Linkages49.Reference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages48#Reference
 * Linkages48.Reference}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.TradeIdentification
 * TradeIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.References11 References11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Identification1
 * Identification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications3
 * TransactionIdentifications3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications10
 * TransactionIdentifications10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications15
 * TransactionIdentifications15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Identification4
 * Identification4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications19
 * TransactionIdentifications19}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References1Choice
 * References1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages1 Linkages1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages21 Linkages21}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References12Choice
 * References12Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages4 Linkages4}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References28Choice
 * References28Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages22 Linkages22}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References5Choice
 * References5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References11Choice
 * References11Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References19Choice
 * References19Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References21Choice
 * References21Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References27Choice
 * References27Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References33Choice
 * References33Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References14Choice
 * References14Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages9 Linkages9}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References16Choice
 * References16Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages14 Linkages14}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References25Choice
 * References25Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages17 Linkages17}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References32Choice
 * References32Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages24 Linkages24}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References3Choice
 * References3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References9Choice
 * References9Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References18Choice
 * References18Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References20Choice
 * References20Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References29Choice
 * References29Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References37Choice
 * References37Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References38Choice
 * References38Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.References1 References1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References6Choice
 * References6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages3 Linkages3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.References2 References2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References10Choice
 * References10Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages6 Linkages6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.References7 References7}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References13Choice
 * References13Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages10 Linkages10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.References8 References8}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References15Choice
 * References15Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages11 Linkages11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.References9 References9}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References24Choice
 * References24Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages16 Linkages16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.References13 References13}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References31Choice
 * References31Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages23 Linkages23}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages7 Linkages7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages12 Linkages12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications2
 * TransactionIdentifications2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications7
 * TransactionIdentifications7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications9
 * TransactionIdentifications9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications13
 * TransactionIdentifications13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications16
 * TransactionIdentifications16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications22
 * TransactionIdentifications22}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Identification2
 * Identification2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IdentificationReference8Choice
 * IdentificationReference8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages15 Linkages15}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IdentificationReference11Choice
 * IdentificationReference11Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages18 Linkages18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.References3 References3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MessageAndBusinessReference5
 * MessageAndBusinessReference5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MessageAndBusinessReference2
 * MessageAndBusinessReference2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MessageAndBusinessReference4
 * MessageAndBusinessReference4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MessageAndBusinessReference1
 * MessageAndBusinessReference1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MessageAndBusinessReference6
 * MessageAndBusinessReference6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages2 Linkages2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages8 Linkages8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications1
 * TransactionIdentifications1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Identification7
 * Identification7}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References4Choice
 * References4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications4
 * TransactionIdentifications4}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References22Choice
 * References22Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications11
 * TransactionIdentifications11}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References2Choice
 * References2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Identification6
 * Identification6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications6
 * TransactionIdentifications6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentification2
 * TransactionIdentification2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentification3
 * TransactionIdentification3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications18
 * TransactionIdentifications18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications20
 * TransactionIdentifications20}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Identification5
 * Identification5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Identification8
 * Identification8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Identification11
 * Identification11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Identification13
 * Identification13}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References8Choice
 * References8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References17Choice
 * References17Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References7Choice
 * References7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications8
 * TransactionIdentifications8}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References23Choice
 * References23Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications14
 * TransactionIdentifications14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications17
 * TransactionIdentifications17}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References30Choice
 * References30Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications23
 * TransactionIdentifications23}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Identification9
 * Identification9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages5 Linkages5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages13 Linkages13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages19 Linkages19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages25 Linkages25}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications5
 * TransactionIdentifications5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications12
 * TransactionIdentifications12}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References34Choice
 * References34Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages26 Linkages26}</li>
 * <li>{@linkplain com.tools20022.repository.msg.References14 References14}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References36Choice
 * References36Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References35Choice
 * References35Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications24
 * TransactionIdentifications24}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Identification14
 * Identification14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Identification3
 * Identification3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.References15 References15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MessageAndBusinessReference7
 * MessageAndBusinessReference7}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References39Choice
 * References39Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications25
 * TransactionIdentifications25}</li>
 * <li>{@linkplain com.tools20022.repository.msg.References16 References16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications26
 * TransactionIdentifications26}</li>
 * <li>{@linkplain com.tools20022.repository.msg.References17 References17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages36 Linkages36}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References45Choice
 * References45Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentification6
 * TransactionIdentification6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications29
 * TransactionIdentifications29}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages37 Linkages37}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications31
 * TransactionIdentifications31}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications33
 * TransactionIdentifications33}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References43Choice
 * References43Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications30
 * TransactionIdentifications30}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications32
 * TransactionIdentifications32}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages38 Linkages38}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References46Choice
 * References46Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Identification15
 * Identification15}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References41Choice
 * References41Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References44Choice
 * References44Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages40 Linkages40}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References47Choice
 * References47Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References42Choice
 * References42Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.References18 References18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.References20 References20}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MessageAndBusinessReference8
 * MessageAndBusinessReference8}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References48Choice
 * References48Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages43 Linkages43}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications35
 * TransactionIdentifications35}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References60Choice
 * References60Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications39
 * TransactionIdentifications39}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentification7
 * TransactionIdentification7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications37
 * TransactionIdentifications37}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References53Choice
 * References53Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages42 Linkages42}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Identification16
 * Identification16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications34
 * TransactionIdentifications34}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications38
 * TransactionIdentifications38}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References58Choice
 * References58Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Identification24
 * Identification24}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References50Choice
 * References50Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References51Choice
 * References51Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.References21 References21}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages49 Linkages49}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages48 Linkages48}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References59Choice
 * References59Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References54Choice
 * References54Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MessageAndBusinessReference10
 * MessageAndBusinessReference10}</li>
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
 * "SecuritiesTradeIdentification"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the different identifications associated with a securities transaction."
 * </li>
 * </ul>
 */
public class SecuritiesTradeIdentification extends TradeIdentification {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Trade for which one or more identifications are provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#SecuritiesTradeRelatedIdentifications
	 * SecuritiesTrade.SecuritiesTradeRelatedIdentifications}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
	 * SecuritiesTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentifiedTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade for which one or more identifications are provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd IdentifiedTrade = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesTradeIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IdentifiedTrade";
			definition = "Trade for which one or more identifications are provided.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesTrade.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.SecuritiesTradeRelatedIdentifications;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Identification of a transaction assigned by a market infrastructure other
	 * than a central securities depository, for example, Target2-Securities.
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
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications3#MarketInfrastructureTransactionIdentification
	 * TransactionIdentifications3.MarketInfrastructureTransactionIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications10#MarketInfrastructureTransactionIdentification
	 * TransactionIdentifications10.
	 * MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications15#MarketInfrastructureTransactionIdentification
	 * TransactionIdentifications15.
	 * MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications19#MarketInfrastructureTransactionIdentification
	 * TransactionIdentifications19.
	 * MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails41#MarketInfrastructureTransactionIdentification
	 * TransactionDetails41.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails43#MarketInfrastructureTransactionIdentification
	 * TransactionDetails43.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References5Choice#MarketInfrastructureTransactionIdentification
	 * References5Choice.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References11Choice#MarketInfrastructureTransactionIdentification
	 * References11Choice.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References19Choice#MarketInfrastructureTransactionIdentification
	 * References19Choice.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References21Choice#MarketInfrastructureTransactionIdentification
	 * References21Choice.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References27Choice#MarketInfrastructureTransactionIdentification
	 * References27Choice.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References33Choice#MarketInfrastructureTransactionIdentification
	 * References33Choice.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References14Choice#MarketInfrastructureTransactionIdentification
	 * References14Choice.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References16Choice#MarketInfrastructureTransactionIdentification
	 * References16Choice.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References25Choice#MarketInfrastructureTransactionIdentification
	 * References25Choice.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References32Choice#MarketInfrastructureTransactionIdentification
	 * References32Choice.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References1#MarketInfrastructureTransactionIdentification
	 * References1.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References6Choice#MarketInfrastructureTransactionIdentification
	 * References6Choice.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References2#MarketInfrastructureTransactionIdentification
	 * References2.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References10Choice#MarketInfrastructureTransactionIdentification
	 * References10Choice.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References7#MarketInfrastructureTransactionIdentification
	 * References7.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References13Choice#MarketInfrastructureTransactionIdentification
	 * References13Choice.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References8#MarketInfrastructureTransactionIdentification
	 * References8.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References15Choice#MarketInfrastructureTransactionIdentification
	 * References15Choice.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References9#MarketInfrastructureTransactionIdentification
	 * References9.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References24Choice#MarketInfrastructureTransactionIdentification
	 * References24Choice.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References13#MarketInfrastructureTransactionIdentification
	 * References13.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References31Choice#MarketInfrastructureTransactionIdentification
	 * References31Choice.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification1#MarketInfrastructureTransactionIdentification
	 * SettlementTypeAndIdentification1.
	 * MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification8#MarketInfrastructureTransactionIdentification
	 * SettlementTypeAndIdentification8.
	 * MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification9#MarketInfrastructureTransactionIdentification
	 * SettlementTypeAndIdentification9.
	 * MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification11#MarketInfrastructureTransactionIdentification
	 * SettlementTypeAndIdentification11.
	 * MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification15#MarketInfrastructureTransactionIdentification
	 * SettlementTypeAndIdentification15.
	 * MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification17#MarketInfrastructureTransactionIdentification
	 * SettlementTypeAndIdentification17.
	 * MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification10#MarketInfrastructureTransactionIdentification
	 * SettlementTypeAndIdentification10.
	 * MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification12#MarketInfrastructureTransactionIdentification
	 * SettlementTypeAndIdentification12.
	 * MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications2#MarketInfrastructureTransactionIdentification
	 * TransactionIdentifications2.MarketInfrastructureTransactionIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications7#MarketInfrastructureTransactionIdentification
	 * TransactionIdentifications7.MarketInfrastructureTransactionIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications9#MarketInfrastructureTransactionIdentification
	 * TransactionIdentifications9.MarketInfrastructureTransactionIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications13#MarketInfrastructureTransactionIdentification
	 * TransactionIdentifications13.
	 * MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications16#MarketInfrastructureTransactionIdentification
	 * TransactionIdentifications16.
	 * MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications22#MarketInfrastructureTransactionIdentification
	 * TransactionIdentifications22.
	 * MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction7#MarketInfrastructureTransactionIdentification
	 * Transaction7.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction8#MarketInfrastructureTransactionIdentification
	 * Transaction8.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction9#MarketInfrastructureTransactionIdentification
	 * Transaction9.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction10#MarketInfrastructureTransactionIdentification
	 * Transaction10.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction14#MarketInfrastructureTransactionIdentification
	 * Transaction14.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction12#MarketInfrastructureTransactionIdentification
	 * Transaction12.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction15#MarketInfrastructureTransactionIdentification
	 * Transaction15.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction16#MarketInfrastructureTransactionIdentification
	 * Transaction16.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction20#MarketInfrastructureTransactionIdentification
	 * Transaction20.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction19#MarketInfrastructureTransactionIdentification
	 * Transaction19.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction23#MarketInfrastructureTransactionIdentification
	 * Transaction23.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction22#MarketInfrastructureTransactionIdentification
	 * Transaction22.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction28#MarketInfrastructureTransactionIdentification
	 * Transaction28.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction27#MarketInfrastructureTransactionIdentification
	 * Transaction27.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction30#MarketInfrastructureTransactionIdentification
	 * Transaction30.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction31#MarketInfrastructureTransactionIdentification
	 * Transaction31.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction6#MarketInfrastructureTransactionIdentification
	 * Transaction6.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction11#MarketInfrastructureTransactionIdentification
	 * Transaction11.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction13#MarketInfrastructureTransactionIdentification
	 * Transaction13.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction17#MarketInfrastructureTransactionIdentification
	 * Transaction17.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction18#MarketInfrastructureTransactionIdentification
	 * Transaction18.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction21#MarketInfrastructureTransactionIdentification
	 * Transaction21.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction29#MarketInfrastructureTransactionIdentification
	 * Transaction29.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction32#MarketInfrastructureTransactionIdentification
	 * Transaction32.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification2#MarketInfrastructureTransactionIdentification
	 * Identification2.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference8Choice#MarketInfrastructureTransactionIdentification
	 * IdentificationReference8Choice.
	 * MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference11Choice#MarketInfrastructureTransactionIdentification
	 * IdentificationReference11Choice.
	 * MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences3#MarketInfrastructureTransactionIdentification
	 * TransactionReferences3.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails13#MarketInfrastructureTransactionIdentification
	 * TransactionDetails13.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails4#MarketInfrastructureTransactionIdentification
	 * SecuritiesTradeDetails4.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails17#MarketInfrastructureTransactionIdentification
	 * SecuritiesTradeDetails17.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification7#MarketInfrastructureTransactionIdentification
	 * Identification7.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications4#MarketInfrastructureTransactionIdentification
	 * TransactionIdentifications4.MarketInfrastructureTransactionIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications11#MarketInfrastructureTransactionIdentification
	 * TransactionIdentifications11.
	 * MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails11#MarketInfrastructureTransactionIdentification
	 * TransactionDetails11.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification6#MarketInfrastructureTransactionIdentification
	 * Identification6.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails21#MarketInfrastructureTransactionIdentification
	 * TransactionDetails21.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails10#MarketInfrastructureTransactionIdentification
	 * SecuritiesTradeDetails10.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails22#MarketInfrastructureTransactionIdentification
	 * SecuritiesTradeDetails22.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails23#MarketInfrastructureTransactionIdentification
	 * SecuritiesTradeDetails23.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails29#MarketInfrastructureTransactionIdentification
	 * SecuritiesTradeDetails29.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentification2#MarketInfrastructureTransactionIdentification
	 * TransactionIdentification2.MarketInfrastructureTransactionIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentification3#MarketInfrastructureTransactionIdentification
	 * TransactionIdentification3.MarketInfrastructureTransactionIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications18#MarketInfrastructureTransactionIdentification
	 * TransactionIdentifications18.
	 * MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications20#MarketInfrastructureTransactionIdentification
	 * TransactionIdentifications20.
	 * MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification5#MarketInfrastructureTransactionIdentification
	 * Identification5.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification8#MarketInfrastructureTransactionIdentification
	 * Identification8.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification11#MarketInfrastructureTransactionIdentification
	 * Identification11.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification13#MarketInfrastructureTransactionIdentification
	 * Identification13.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails15#MarketInfrastructureTransactionIdentification
	 * TransactionDetails15.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications8#MarketInfrastructureTransactionIdentification
	 * TransactionIdentifications8.MarketInfrastructureTransactionIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications14#MarketInfrastructureTransactionIdentification
	 * TransactionIdentifications14.
	 * MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications17#MarketInfrastructureTransactionIdentification
	 * TransactionIdentifications17.
	 * MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications23#MarketInfrastructureTransactionIdentification
	 * TransactionIdentifications23.
	 * MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification9#MarketInfrastructureTransactionIdentification
	 * Identification9.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications5#MarketInfrastructureTransactionIdentification
	 * TransactionIdentifications5.MarketInfrastructureTransactionIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications12#MarketInfrastructureTransactionIdentification
	 * TransactionIdentifications12.
	 * MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References34Choice#MarketInfrastructureTransactionIdentification
	 * References34Choice.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References14#MarketInfrastructureTransactionIdentification
	 * References14.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceMovement1#MarketInfrastructureTransactionIdentification
	 * IntraBalanceMovement1.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction25#MarketInfrastructureTransactionIdentification
	 * Transaction25.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References36Choice#MarketInfrastructureTransactionIdentification
	 * References36Choice.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References35Choice#MarketInfrastructureTransactionIdentification
	 * References35Choice.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications24#MarketInfrastructureTransactionIdentification
	 * TransactionIdentifications24.
	 * MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification3#MarketInfrastructureTransactionIdentification
	 * Identification3.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction34#MarketInfrastructureTransactionIdentification
	 * Transaction34.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications25#MarketInfrastructureTransactionIdentification
	 * TransactionIdentifications25.
	 * MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails64#MarketInfrastructureTransactionIdentification
	 * TransactionDetails64.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction35#MarketInfrastructureTransactionIdentification
	 * Transaction35.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction36#MarketInfrastructureTransactionIdentification
	 * Transaction36.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails35#MarketInfrastructureTransactionIdentification
	 * SecuritiesTradeDetails35.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References16#MarketInfrastructureTransactionIdentification
	 * References16.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications26#MarketInfrastructureTransactionIdentification
	 * TransactionIdentifications26.
	 * MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction38#MarketInfrastructureTransactionIdentification
	 * Transaction38.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails65#MarketInfrastructureTransactionIdentification
	 * TransactionDetails65.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails42#MarketInfrastructureTransactionIdentification
	 * SecuritiesTradeDetails42.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References17#MarketInfrastructureTransactionIdentification
	 * References17.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction39#MarketInfrastructureTransactionIdentification
	 * Transaction39.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction37#MarketInfrastructureTransactionIdentification
	 * Transaction37.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction41#MarketInfrastructureTransactionIdentification
	 * Transaction41.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction40#MarketInfrastructureTransactionIdentification
	 * Transaction40.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction43#MarketInfrastructureTransactionIdentification
	 * Transaction43.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction42#MarketInfrastructureTransactionIdentification
	 * Transaction42.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails49#MarketInfrastructureTransactionIdentification
	 * SecuritiesTradeDetails49.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction47#MarketInfrastructureTransactionIdentification
	 * Transaction47.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails76#MarketInfrastructureTransactionIdentification
	 * TransactionDetails76.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction45#MarketInfrastructureTransactionIdentification
	 * Transaction45.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction46#MarketInfrastructureTransactionIdentification
	 * Transaction46.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentification6#MarketInfrastructureTransactionIdentification
	 * TransactionIdentification6.MarketInfrastructureTransactionIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications29#MarketInfrastructureTransactionIdentification
	 * TransactionIdentifications29.
	 * MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification19#MarketInfrastructureTransactionIdentification
	 * SettlementTypeAndIdentification19.
	 * MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications31#MarketInfrastructureTransactionIdentification
	 * TransactionIdentifications31.
	 * MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications33#MarketInfrastructureTransactionIdentification
	 * TransactionIdentifications33.
	 * MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications30#MarketInfrastructureTransactionIdentification
	 * TransactionIdentifications30.
	 * MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References46Choice#MarketInfrastructureTransactionIdentification
	 * References46Choice.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification15#MarketInfrastructureTransactionIdentification
	 * Identification15.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References41Choice#MarketInfrastructureTransactionIdentification
	 * References41Choice.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References42Choice#MarketInfrastructureTransactionIdentification
	 * References42Choice.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References18#MarketInfrastructureTransactionIdentification
	 * References18.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction49#MarketInfrastructureTransactionIdentification
	 * Transaction49.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications39#MarketInfrastructureTransactionIdentification
	 * TransactionIdentifications39.
	 * MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails61#MarketInfrastructureTransactionIdentification
	 * SecuritiesTradeDetails61.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentification7#MarketInfrastructureTransactionIdentification
	 * TransactionIdentification7.MarketInfrastructureTransactionIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications37#MarketInfrastructureTransactionIdentification
	 * TransactionIdentifications37.
	 * MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications34#MarketInfrastructureTransactionIdentification
	 * TransactionIdentifications34.
	 * MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification24#MarketInfrastructureTransactionIdentification
	 * SettlementTypeAndIdentification24.
	 * MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails85#MarketInfrastructureTransactionIdentification
	 * TransactionDetails85.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications38#MarketInfrastructureTransactionIdentification
	 * TransactionIdentifications38.
	 * MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification24#MarketInfrastructureTransactionIdentification
	 * Identification24.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction50#MarketInfrastructureTransactionIdentification
	 * Transaction50.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References50Choice#MarketInfrastructureTransactionIdentification
	 * References50Choice.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References51Choice#MarketInfrastructureTransactionIdentification
	 * References51Choice.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction48#MarketInfrastructureTransactionIdentification
	 * Transaction48.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References21#MarketInfrastructureTransactionIdentification
	 * References21.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References54Choice#MarketInfrastructureTransactionIdentification
	 * References54Choice.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction53#MarketInfrastructureTransactionIdentification
	 * Transaction53.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#MarketInfrastructureTransactionIdentification
	 * SecuritiesTradeDetails68.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction54#MarketInfrastructureTransactionIdentification
	 * Transaction54.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction52#MarketInfrastructureTransactionIdentification
	 * Transaction52.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails69#MarketInfrastructureTransactionIdentification
	 * SecuritiesTradeDetails69.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction57#MarketInfrastructureTransactionIdentification
	 * Transaction57.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction56#MarketInfrastructureTransactionIdentification
	 * Transaction56.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction55#MarketInfrastructureTransactionIdentification
	 * Transaction55.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails101#MarketInfrastructureTransactionIdentification
	 * TransactionDetails101.MarketInfrastructureTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
	 * SecuritiesTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketInfrastructureTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a transaction assigned by a market infrastructure other than a central securities depository, for example, Target2-Securities."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MarketInfrastructureTransactionIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionIdentifications3.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications10.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications15.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications19.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.TransactionDetails41.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails43.MarketInfrastructureTransactionIdentification, com.tools20022.repository.choice.References5Choice.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.choice.References11Choice.MarketInfrastructureTransactionIdentification, com.tools20022.repository.choice.References19Choice.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.choice.References21Choice.MarketInfrastructureTransactionIdentification, com.tools20022.repository.choice.References27Choice.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.choice.References33Choice.MarketInfrastructureTransactionIdentification, com.tools20022.repository.choice.References14Choice.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.choice.References16Choice.MarketInfrastructureTransactionIdentification, com.tools20022.repository.choice.References25Choice.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.choice.References32Choice.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.References1.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.choice.References6Choice.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.References2.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.choice.References10Choice.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.References7.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.choice.References13Choice.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.References8.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.choice.References15Choice.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.References9.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.choice.References24Choice.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.References13.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.choice.References31Choice.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.SettlementTypeAndIdentification1.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.SettlementTypeAndIdentification8.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.SettlementTypeAndIdentification9.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.SettlementTypeAndIdentification11.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.SettlementTypeAndIdentification15.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.SettlementTypeAndIdentification17.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.SettlementTypeAndIdentification10.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.SettlementTypeAndIdentification12.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications2.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications7.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications9.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications13.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications16.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications22.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.Transaction7.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.Transaction8.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.Transaction9.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.Transaction10.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.Transaction14.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.Transaction12.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.Transaction15.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.Transaction16.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.Transaction20.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.Transaction19.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.Transaction23.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.Transaction22.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.Transaction28.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.Transaction27.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.Transaction30.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.Transaction31.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.Transaction6.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.Transaction11.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.Transaction13.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.Transaction17.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.Transaction18.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.Transaction21.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.Transaction29.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.Transaction32.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.Identification2.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.choice.IdentificationReference8Choice.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.choice.IdentificationReference11Choice.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.TransactionReferences3.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails13.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails4.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails17.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.Identification7.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications4.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications11.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails11.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.Identification6.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails21.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails10.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails22.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails23.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails29.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.TransactionIdentification2.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentification3.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications18.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications20.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.Identification5.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.Identification8.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.Identification11.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.Identification13.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.TransactionDetails15.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications8.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications14.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications17.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications23.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.Identification9.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications5.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications12.MarketInfrastructureTransactionIdentification, com.tools20022.repository.choice.References34Choice.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.References14.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.IntraBalanceMovement1.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.Transaction25.MarketInfrastructureTransactionIdentification, com.tools20022.repository.choice.References36Choice.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.choice.References35Choice.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications24.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.Identification3.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.Transaction34.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications25.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.TransactionDetails64.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.Transaction35.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.Transaction36.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails35.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.References16.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications26.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.Transaction38.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails65.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails42.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.References17.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.Transaction39.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.Transaction37.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.Transaction41.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.Transaction40.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.Transaction43.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.Transaction42.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails49.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.Transaction47.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.TransactionDetails76.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.Transaction45.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.Transaction46.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentification6.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications29.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.SettlementTypeAndIdentification19.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications31.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications33.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications30.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.choice.References46Choice.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.Identification15.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.choice.References41Choice.MarketInfrastructureTransactionIdentification, com.tools20022.repository.choice.References42Choice.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.References18.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.Transaction49.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications39.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails61.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentification7.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications37.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications34.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.SettlementTypeAndIdentification24.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails85.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications38.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.Identification24.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.Transaction50.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.choice.References50Choice.MarketInfrastructureTransactionIdentification, com.tools20022.repository.choice.References51Choice.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.Transaction48.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.References21.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.choice.References54Choice.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.Transaction53.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails68.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.Transaction54.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.Transaction52.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails69.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.Transaction57.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.Transaction56.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.Transaction55.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.TransactionDetails101.MarketInfrastructureTransactionIdentification);
			elementContext_lazy = () -> SecuritiesTradeIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MarketInfrastructureTransactionIdentification";
			definition = "Identification of a transaction assigned by a market infrastructure other than a central securities depository, for example, Target2-Securities.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Identification of the transaction assigned by the processor of the
	 * instruction other than the account owner the account servicer and the
	 * market infrastructure.
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
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications10#ProcessorTransactionIdentification
	 * TransactionIdentifications10.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications15#ProcessorTransactionIdentification
	 * TransactionIdentifications15.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications19#ProcessorTransactionIdentification
	 * TransactionIdentifications19.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails41#ProcessorTransactionIdentification
	 * TransactionDetails41.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails43#ProcessorTransactionIdentification
	 * TransactionDetails43.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters8#ProcessorTransactionIdentification
	 * AdditionalParameters8.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters9#ProcessorTransactionIdentification
	 * AdditionalParameters9.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters10#ProcessorTransactionIdentification
	 * AdditionalParameters10.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters11#ProcessorTransactionIdentification
	 * AdditionalParameters11.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References19Choice#ProcessorTransactionIdentification
	 * References19Choice.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References21Choice#ProcessorTransactionIdentification
	 * References21Choice.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References27Choice#ProcessorTransactionIdentification
	 * References27Choice.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References33Choice#ProcessorTransactionIdentification
	 * References33Choice.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References7#ProcessorTransactionIdentification
	 * References7.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References8#ProcessorTransactionIdentification
	 * References8.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References9#ProcessorTransactionIdentification
	 * References9.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References13#ProcessorTransactionIdentification
	 * References13.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification9#ProcessorTransactionIdentification
	 * SettlementTypeAndIdentification9.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification11#ProcessorTransactionIdentification
	 * SettlementTypeAndIdentification11.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification15#ProcessorTransactionIdentification
	 * SettlementTypeAndIdentification15.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification17#ProcessorTransactionIdentification
	 * SettlementTypeAndIdentification17.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification10#ProcessorTransactionIdentification
	 * SettlementTypeAndIdentification10.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification12#ProcessorTransactionIdentification
	 * SettlementTypeAndIdentification12.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications9#ProcessorTransactionIdentification
	 * TransactionIdentifications9.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications13#ProcessorTransactionIdentification
	 * TransactionIdentifications13.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications16#ProcessorTransactionIdentification
	 * TransactionIdentifications16.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications22#ProcessorTransactionIdentification
	 * TransactionIdentifications22.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction14#ProcessorTransactionIdentification
	 * Transaction14.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction12#ProcessorTransactionIdentification
	 * Transaction12.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction15#ProcessorTransactionIdentification
	 * Transaction15.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction16#ProcessorTransactionIdentification
	 * Transaction16.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction20#ProcessorTransactionIdentification
	 * Transaction20.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction19#ProcessorTransactionIdentification
	 * Transaction19.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction23#ProcessorTransactionIdentification
	 * Transaction23.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction22#ProcessorTransactionIdentification
	 * Transaction22.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction28#ProcessorTransactionIdentification
	 * Transaction28.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction27#ProcessorTransactionIdentification
	 * Transaction27.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction30#ProcessorTransactionIdentification
	 * Transaction30.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction31#ProcessorTransactionIdentification
	 * Transaction31.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction13#ProcessorTransactionIdentification
	 * Transaction13.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction17#ProcessorTransactionIdentification
	 * Transaction17.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction18#ProcessorTransactionIdentification
	 * Transaction18.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction21#ProcessorTransactionIdentification
	 * Transaction21.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction29#ProcessorTransactionIdentification
	 * Transaction29.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction32#ProcessorTransactionIdentification
	 * Transaction32.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails18#ProcessorTransactionIdentification
	 * SecuritiesTradeDetails18.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails17#ProcessorTransactionIdentification
	 * SecuritiesTradeDetails17.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification7#ProcessorTransactionIdentification
	 * Identification7.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications11#ProcessorTransactionIdentification
	 * TransactionIdentifications11.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification6#ProcessorTransactionIdentification
	 * Identification6.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails21#ProcessorTransactionIdentification
	 * SecuritiesTradeDetails21.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails22#ProcessorTransactionIdentification
	 * SecuritiesTradeDetails22.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails23#ProcessorTransactionIdentification
	 * SecuritiesTradeDetails23.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails29#ProcessorTransactionIdentification
	 * SecuritiesTradeDetails29.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentification2#ProcessorTransactionIdentification
	 * TransactionIdentification2.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentification3#ProcessorTransactionIdentification
	 * TransactionIdentification3.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications18#ProcessorTransactionIdentification
	 * TransactionIdentifications18.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications20#ProcessorTransactionIdentification
	 * TransactionIdentifications20.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification8#ProcessorTransactionIdentification
	 * Identification8.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification11#ProcessorTransactionIdentification
	 * Identification11.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification13#ProcessorTransactionIdentification
	 * Identification13.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications14#ProcessorTransactionIdentification
	 * TransactionIdentifications14.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications17#ProcessorTransactionIdentification
	 * TransactionIdentifications17.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications23#ProcessorTransactionIdentification
	 * TransactionIdentifications23.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification9#ProcessorTransactionIdentification
	 * Identification9.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications12#ProcessorTransactionIdentification
	 * TransactionIdentifications12.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References14#ProcessorTransactionIdentification
	 * References14.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction25#ProcessorTransactionIdentification
	 * Transaction25.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References36Choice#ProcessorTransactionIdentification
	 * References36Choice.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References35Choice#ProcessorTransactionIdentification
	 * References35Choice.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications24#ProcessorTransactionIdentification
	 * TransactionIdentifications24.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters16#ProcessorTransactionIdentification
	 * AdditionalParameters16.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction34#ProcessorTransactionIdentification
	 * Transaction34.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications25#ProcessorTransactionIdentification
	 * TransactionIdentifications25.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails64#ProcessorTransactionIdentification
	 * TransactionDetails64.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction35#ProcessorTransactionIdentification
	 * Transaction35.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction36#ProcessorTransactionIdentification
	 * Transaction36.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails35#ProcessorTransactionIdentification
	 * SecuritiesTradeDetails35.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails36#ProcessorTransactionIdentification
	 * SecuritiesTradeDetails36.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References16#ProcessorTransactionIdentification
	 * References16.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications26#ProcessorTransactionIdentification
	 * TransactionIdentifications26.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails41#ProcessorTransactionIdentification
	 * SecuritiesTradeDetails41.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction38#ProcessorTransactionIdentification
	 * Transaction38.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails65#ProcessorTransactionIdentification
	 * TransactionDetails65.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails42#ProcessorTransactionIdentification
	 * SecuritiesTradeDetails42.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References17#ProcessorTransactionIdentification
	 * References17.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction39#ProcessorTransactionIdentification
	 * Transaction39.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction37#ProcessorTransactionIdentification
	 * Transaction37.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction41#ProcessorTransactionIdentification
	 * Transaction41.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction40#ProcessorTransactionIdentification
	 * Transaction40.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction43#ProcessorTransactionIdentification
	 * Transaction43.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction42#ProcessorTransactionIdentification
	 * Transaction42.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails49#ProcessorTransactionIdentification
	 * SecuritiesTradeDetails49.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction47#ProcessorTransactionIdentification
	 * Transaction47.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails76#ProcessorTransactionIdentification
	 * TransactionDetails76.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction45#ProcessorTransactionIdentification
	 * Transaction45.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction46#ProcessorTransactionIdentification
	 * Transaction46.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentification6#ProcessorTransactionIdentification
	 * TransactionIdentification6.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications29#ProcessorTransactionIdentification
	 * TransactionIdentifications29.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification19#ProcessorTransactionIdentification
	 * SettlementTypeAndIdentification19.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications31#ProcessorTransactionIdentification
	 * TransactionIdentifications31.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications33#ProcessorTransactionIdentification
	 * TransactionIdentifications33.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters21#ProcessorTransactionIdentification
	 * AdditionalParameters21.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails54#ProcessorTransactionIdentification
	 * SecuritiesTradeDetails54.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications30#ProcessorTransactionIdentification
	 * TransactionIdentifications30.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification15#ProcessorTransactionIdentification
	 * Identification15.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References42Choice#ProcessorTransactionIdentification
	 * References42Choice.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References18#ProcessorTransactionIdentification
	 * References18.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction49#ProcessorTransactionIdentification
	 * Transaction49.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications39#ProcessorTransactionIdentification
	 * TransactionIdentifications39.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails61#ProcessorTransactionIdentification
	 * SecuritiesTradeDetails61.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentification7#ProcessorTransactionIdentification
	 * TransactionIdentification7.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications37#ProcessorTransactionIdentification
	 * TransactionIdentifications37.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters25#ProcessorTransactionIdentification
	 * AdditionalParameters25.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications34#ProcessorTransactionIdentification
	 * TransactionIdentifications34.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification24#ProcessorTransactionIdentification
	 * SettlementTypeAndIdentification24.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails85#ProcessorTransactionIdentification
	 * TransactionDetails85.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications38#ProcessorTransactionIdentification
	 * TransactionIdentifications38.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails60#ProcessorTransactionIdentification
	 * SecuritiesTradeDetails60.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification24#ProcessorTransactionIdentification
	 * Identification24.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction50#ProcessorTransactionIdentification
	 * Transaction50.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References51Choice#ProcessorTransactionIdentification
	 * References51Choice.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction48#ProcessorTransactionIdentification
	 * Transaction48.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References21#ProcessorTransactionIdentification
	 * References21.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction53#ProcessorTransactionIdentification
	 * Transaction53.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#ProcessorTransactionIdentification
	 * SecuritiesTradeDetails68.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction54#ProcessorTransactionIdentification
	 * Transaction54.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction52#ProcessorTransactionIdentification
	 * Transaction52.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails69#ProcessorTransactionIdentification
	 * SecuritiesTradeDetails69.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction57#ProcessorTransactionIdentification
	 * Transaction57.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction56#ProcessorTransactionIdentification
	 * Transaction56.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction55#ProcessorTransactionIdentification
	 * Transaction55.ProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails101#ProcessorTransactionIdentification
	 * TransactionDetails101.ProcessorTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
	 * SecuritiesTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessorTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the transaction assigned by the processor of the instruction other than the account owner the account servicer and the market infrastructure."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ProcessorTransactionIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionIdentifications10.ProcessorTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications15.ProcessorTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications19.ProcessorTransactionIdentification, com.tools20022.repository.msg.TransactionDetails41.ProcessorTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails43.ProcessorTransactionIdentification, com.tools20022.repository.msg.AdditionalParameters8.ProcessorTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters9.ProcessorTransactionIdentification, com.tools20022.repository.msg.AdditionalParameters10.ProcessorTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters11.ProcessorTransactionIdentification, com.tools20022.repository.choice.References19Choice.ProcessorTransactionIdentification,
					com.tools20022.repository.choice.References21Choice.ProcessorTransactionIdentification, com.tools20022.repository.choice.References27Choice.ProcessorTransactionIdentification,
					com.tools20022.repository.choice.References33Choice.ProcessorTransactionIdentification, com.tools20022.repository.msg.References7.ProcessorTransactionIdentification,
					com.tools20022.repository.msg.References8.ProcessorTransactionIdentification, com.tools20022.repository.msg.References9.ProcessorTransactionIdentification,
					com.tools20022.repository.msg.References13.ProcessorTransactionIdentification, com.tools20022.repository.msg.SettlementTypeAndIdentification9.ProcessorTransactionIdentification,
					com.tools20022.repository.msg.SettlementTypeAndIdentification11.ProcessorTransactionIdentification, com.tools20022.repository.msg.SettlementTypeAndIdentification15.ProcessorTransactionIdentification,
					com.tools20022.repository.msg.SettlementTypeAndIdentification17.ProcessorTransactionIdentification, com.tools20022.repository.msg.SettlementTypeAndIdentification10.ProcessorTransactionIdentification,
					com.tools20022.repository.msg.SettlementTypeAndIdentification12.ProcessorTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications9.ProcessorTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications13.ProcessorTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications16.ProcessorTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications22.ProcessorTransactionIdentification, com.tools20022.repository.msg.Transaction14.ProcessorTransactionIdentification,
					com.tools20022.repository.msg.Transaction12.ProcessorTransactionIdentification, com.tools20022.repository.msg.Transaction15.ProcessorTransactionIdentification,
					com.tools20022.repository.msg.Transaction16.ProcessorTransactionIdentification, com.tools20022.repository.msg.Transaction20.ProcessorTransactionIdentification,
					com.tools20022.repository.msg.Transaction19.ProcessorTransactionIdentification, com.tools20022.repository.msg.Transaction23.ProcessorTransactionIdentification,
					com.tools20022.repository.msg.Transaction22.ProcessorTransactionIdentification, com.tools20022.repository.msg.Transaction28.ProcessorTransactionIdentification,
					com.tools20022.repository.msg.Transaction27.ProcessorTransactionIdentification, com.tools20022.repository.msg.Transaction30.ProcessorTransactionIdentification,
					com.tools20022.repository.msg.Transaction31.ProcessorTransactionIdentification, com.tools20022.repository.msg.Transaction13.ProcessorTransactionIdentification,
					com.tools20022.repository.msg.Transaction17.ProcessorTransactionIdentification, com.tools20022.repository.msg.Transaction18.ProcessorTransactionIdentification,
					com.tools20022.repository.msg.Transaction21.ProcessorTransactionIdentification, com.tools20022.repository.msg.Transaction29.ProcessorTransactionIdentification,
					com.tools20022.repository.msg.Transaction32.ProcessorTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails18.ProcessorTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails17.ProcessorTransactionIdentification, com.tools20022.repository.msg.Identification7.ProcessorTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications11.ProcessorTransactionIdentification, com.tools20022.repository.msg.Identification6.ProcessorTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails21.ProcessorTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails22.ProcessorTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails23.ProcessorTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails29.ProcessorTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentification2.ProcessorTransactionIdentification, com.tools20022.repository.msg.TransactionIdentification3.ProcessorTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications18.ProcessorTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications20.ProcessorTransactionIdentification,
					com.tools20022.repository.msg.Identification8.ProcessorTransactionIdentification, com.tools20022.repository.msg.Identification11.ProcessorTransactionIdentification,
					com.tools20022.repository.msg.Identification13.ProcessorTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications14.ProcessorTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications17.ProcessorTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications23.ProcessorTransactionIdentification,
					com.tools20022.repository.msg.Identification9.ProcessorTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications12.ProcessorTransactionIdentification,
					com.tools20022.repository.msg.References14.ProcessorTransactionIdentification, com.tools20022.repository.msg.Transaction25.ProcessorTransactionIdentification,
					com.tools20022.repository.choice.References36Choice.ProcessorTransactionIdentification, com.tools20022.repository.choice.References35Choice.ProcessorTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications24.ProcessorTransactionIdentification, com.tools20022.repository.msg.AdditionalParameters16.ProcessorTransactionIdentification,
					com.tools20022.repository.msg.Transaction34.ProcessorTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications25.ProcessorTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails64.ProcessorTransactionIdentification, com.tools20022.repository.msg.Transaction35.ProcessorTransactionIdentification,
					com.tools20022.repository.msg.Transaction36.ProcessorTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails35.ProcessorTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails36.ProcessorTransactionIdentification, com.tools20022.repository.msg.References16.ProcessorTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications26.ProcessorTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails41.ProcessorTransactionIdentification,
					com.tools20022.repository.msg.Transaction38.ProcessorTransactionIdentification, com.tools20022.repository.msg.TransactionDetails65.ProcessorTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails42.ProcessorTransactionIdentification, com.tools20022.repository.msg.References17.ProcessorTransactionIdentification,
					com.tools20022.repository.msg.Transaction39.ProcessorTransactionIdentification, com.tools20022.repository.msg.Transaction37.ProcessorTransactionIdentification,
					com.tools20022.repository.msg.Transaction41.ProcessorTransactionIdentification, com.tools20022.repository.msg.Transaction40.ProcessorTransactionIdentification,
					com.tools20022.repository.msg.Transaction43.ProcessorTransactionIdentification, com.tools20022.repository.msg.Transaction42.ProcessorTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails49.ProcessorTransactionIdentification, com.tools20022.repository.msg.Transaction47.ProcessorTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails76.ProcessorTransactionIdentification, com.tools20022.repository.msg.Transaction45.ProcessorTransactionIdentification,
					com.tools20022.repository.msg.Transaction46.ProcessorTransactionIdentification, com.tools20022.repository.msg.TransactionIdentification6.ProcessorTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications29.ProcessorTransactionIdentification, com.tools20022.repository.msg.SettlementTypeAndIdentification19.ProcessorTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications31.ProcessorTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications33.ProcessorTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters21.ProcessorTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails54.ProcessorTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications30.ProcessorTransactionIdentification, com.tools20022.repository.msg.Identification15.ProcessorTransactionIdentification,
					com.tools20022.repository.choice.References42Choice.ProcessorTransactionIdentification, com.tools20022.repository.msg.References18.ProcessorTransactionIdentification,
					com.tools20022.repository.msg.Transaction49.ProcessorTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications39.ProcessorTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails61.ProcessorTransactionIdentification, com.tools20022.repository.msg.TransactionIdentification7.ProcessorTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications37.ProcessorTransactionIdentification, com.tools20022.repository.msg.AdditionalParameters25.ProcessorTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications34.ProcessorTransactionIdentification, com.tools20022.repository.msg.SettlementTypeAndIdentification24.ProcessorTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails85.ProcessorTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications38.ProcessorTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails60.ProcessorTransactionIdentification, com.tools20022.repository.msg.Identification24.ProcessorTransactionIdentification,
					com.tools20022.repository.msg.Transaction50.ProcessorTransactionIdentification, com.tools20022.repository.choice.References51Choice.ProcessorTransactionIdentification,
					com.tools20022.repository.msg.Transaction48.ProcessorTransactionIdentification, com.tools20022.repository.msg.References21.ProcessorTransactionIdentification,
					com.tools20022.repository.msg.Transaction53.ProcessorTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails68.ProcessorTransactionIdentification,
					com.tools20022.repository.msg.Transaction54.ProcessorTransactionIdentification, com.tools20022.repository.msg.Transaction52.ProcessorTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails69.ProcessorTransactionIdentification, com.tools20022.repository.msg.Transaction57.ProcessorTransactionIdentification,
					com.tools20022.repository.msg.Transaction56.ProcessorTransactionIdentification, com.tools20022.repository.msg.Transaction55.ProcessorTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails101.ProcessorTransactionIdentification);
			elementContext_lazy = () -> SecuritiesTradeIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProcessorTransactionIdentification";
			definition = "Identification of the transaction assigned by the processor of the instruction other than the account owner the account servicer and the market infrastructure.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Collective reference identifying a set of messages.
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
	 * {@linkplain com.tools20022.repository.choice.References1Choice#PoolIdentification
	 * References1Choice.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References12Choice#PoolIdentification
	 * References12Choice.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References28Choice#PoolIdentification
	 * References28Choice.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters3#PoolIdentification
	 * AdditionalParameters3.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters7#PoolIdentification
	 * AdditionalParameters7.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters8#PoolIdentification
	 * AdditionalParameters8.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters9#PoolIdentification
	 * AdditionalParameters9.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters10#PoolIdentification
	 * AdditionalParameters10.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters11#PoolIdentification
	 * AdditionalParameters11.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References5Choice#PoolIdentification
	 * References5Choice.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References11Choice#PoolIdentification
	 * References11Choice.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References19Choice#PoolIdentification
	 * References19Choice.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References21Choice#PoolIdentification
	 * References21Choice.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References27Choice#PoolIdentification
	 * References27Choice.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References33Choice#PoolIdentification
	 * References33Choice.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters3#PoolIdentification
	 * TransactionTypeAndAdditionalParameters3.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters6#PoolIdentification
	 * TransactionTypeAndAdditionalParameters6.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References14Choice#PoolIdentification
	 * References14Choice.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References16Choice#PoolIdentification
	 * References16Choice.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References25Choice#PoolIdentification
	 * References25Choice.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References32Choice#PoolIdentification
	 * References32Choice.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References1#PoolIdentification
	 * References1.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References6Choice#PoolIdentification
	 * References6Choice.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References2#PoolIdentification
	 * References2.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References10Choice#PoolIdentification
	 * References10Choice.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References7#PoolIdentification
	 * References7.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References13Choice#PoolIdentification
	 * References13Choice.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References8#PoolIdentification
	 * References8.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References15Choice#PoolIdentification
	 * References15Choice.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References9#PoolIdentification
	 * References9.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References24Choice#PoolIdentification
	 * References24Choice.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References13#PoolIdentification
	 * References13.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References31Choice#PoolIdentification
	 * References31Choice.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification1#PoolIdentification
	 * SettlementTypeAndIdentification1.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification8#PoolIdentification
	 * SettlementTypeAndIdentification8.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification9#PoolIdentification
	 * SettlementTypeAndIdentification9.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification11#PoolIdentification
	 * SettlementTypeAndIdentification11.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification15#PoolIdentification
	 * SettlementTypeAndIdentification15.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification17#PoolIdentification
	 * SettlementTypeAndIdentification17.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification10#PoolIdentification
	 * SettlementTypeAndIdentification10.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification12#PoolIdentification
	 * SettlementTypeAndIdentification12.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails5#PoolIdentification
	 * TransactionDetails5.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails9#PoolIdentification
	 * TransactionDetails9.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails22#PoolIdentification
	 * TransactionDetails22.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails23#PoolIdentification
	 * TransactionDetails23.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails36#PoolIdentification
	 * TransactionDetails36.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails47#PoolIdentification
	 * TransactionDetails47.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails53#PoolIdentification
	 * TransactionDetails53.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails58#PoolIdentification
	 * TransactionDetails58.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction7#PoolIdentification
	 * Transaction7.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction8#PoolIdentification
	 * Transaction8.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction9#PoolIdentification
	 * Transaction9.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction10#PoolIdentification
	 * Transaction10.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction14#PoolIdentification
	 * Transaction14.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction12#PoolIdentification
	 * Transaction12.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction15#PoolIdentification
	 * Transaction15.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction16#PoolIdentification
	 * Transaction16.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction20#PoolIdentification
	 * Transaction20.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction19#PoolIdentification
	 * Transaction19.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction23#PoolIdentification
	 * Transaction23.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction22#PoolIdentification
	 * Transaction22.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction28#PoolIdentification
	 * Transaction28.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction27#PoolIdentification
	 * Transaction27.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction30#PoolIdentification
	 * Transaction30.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction31#PoolIdentification
	 * Transaction31.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction6#PoolIdentification
	 * Transaction6.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction11#PoolIdentification
	 * Transaction11.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction13#PoolIdentification
	 * Transaction13.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction17#PoolIdentification
	 * Transaction17.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction18#PoolIdentification
	 * Transaction18.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction21#PoolIdentification
	 * Transaction21.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction29#PoolIdentification
	 * Transaction29.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction32#PoolIdentification
	 * Transaction32.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification2#PoolIdentification
	 * Identification2.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference8Choice#PoolIdentification
	 * IdentificationReference8Choice.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference11Choice#PoolIdentification
	 * IdentificationReference11Choice.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters2#PoolIdentification
	 * TransactionTypeAndAdditionalParameters2.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters7#PoolIdentification
	 * TransactionTypeAndAdditionalParameters7.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2#PoolIdentification
	 * SecuritiesFinancingTransactionDetails2.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8#PoolIdentification
	 * SecuritiesFinancingTransactionDetails8.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails4#PoolIdentification
	 * SecuritiesTradeDetails4.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails17#PoolIdentification
	 * SecuritiesTradeDetails17.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification7#PoolIdentification
	 * Identification7.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification6#PoolIdentification
	 * Identification6.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters5#PoolIdentification
	 * TransactionTypeAndAdditionalParameters5.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters8#PoolIdentification
	 * TransactionTypeAndAdditionalParameters8.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6#PoolIdentification
	 * SecuritiesFinancingTransactionDetails6.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10#PoolIdentification
	 * SecuritiesFinancingTransactionDetails10.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17#PoolIdentification
	 * SecuritiesFinancingTransactionDetails17.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18#PoolIdentification
	 * SecuritiesFinancingTransactionDetails18.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails10#PoolIdentification
	 * SecuritiesTradeDetails10.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails22#PoolIdentification
	 * SecuritiesTradeDetails22.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails23#PoolIdentification
	 * SecuritiesTradeDetails23.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails29#PoolIdentification
	 * SecuritiesTradeDetails29.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification5#PoolIdentification
	 * Identification5.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification8#PoolIdentification
	 * Identification8.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification11#PoolIdentification
	 * Identification11.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification13#PoolIdentification
	 * Identification13.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification9#PoolIdentification
	 * Identification9.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References34Choice#PoolIdentification
	 * References34Choice.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References14#PoolIdentification
	 * References14.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction25#PoolIdentification
	 * Transaction25.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References36Choice#PoolIdentification
	 * References36Choice.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References35Choice#PoolIdentification
	 * References35Choice.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification3#PoolIdentification
	 * Identification3.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters16#PoolIdentification
	 * AdditionalParameters16.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails61#PoolIdentification
	 * TransactionDetails61.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction34#PoolIdentification
	 * Transaction34.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21#PoolIdentification
	 * SecuritiesFinancingTransactionDetails21.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction35#PoolIdentification
	 * Transaction35.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction36#PoolIdentification
	 * Transaction36.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails35#PoolIdentification
	 * SecuritiesTradeDetails35.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References16#PoolIdentification
	 * References16.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22#PoolIdentification
	 * SecuritiesFinancingTransactionDetails22.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction38#PoolIdentification
	 * Transaction38.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails66#PoolIdentification
	 * TransactionDetails66.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails42#PoolIdentification
	 * SecuritiesTradeDetails42.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References17#PoolIdentification
	 * References17.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction39#PoolIdentification
	 * Transaction39.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction37#PoolIdentification
	 * Transaction37.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24#PoolIdentification
	 * SecuritiesFinancingTransactionDetails24.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction41#PoolIdentification
	 * Transaction41.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails70#PoolIdentification
	 * TransactionDetails70.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction40#PoolIdentification
	 * Transaction40.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction43#PoolIdentification
	 * Transaction43.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails71#PoolIdentification
	 * TransactionDetails71.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25#PoolIdentification
	 * SecuritiesFinancingTransactionDetails25.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction42#PoolIdentification
	 * Transaction42.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails49#PoolIdentification
	 * SecuritiesTradeDetails49.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction47#PoolIdentification
	 * Transaction47.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#PoolIdentification
	 * SecuritiesFinancingTransactionDetails26.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails79#PoolIdentification
	 * TransactionDetails79.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction45#PoolIdentification
	 * Transaction45.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction46#PoolIdentification
	 * Transaction46.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification19#PoolIdentification
	 * SettlementTypeAndIdentification19.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters10#PoolIdentification
	 * TransactionTypeAndAdditionalParameters10.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters11#PoolIdentification
	 * TransactionTypeAndAdditionalParameters11.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters21#PoolIdentification
	 * AdditionalParameters21.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References46Choice#PoolIdentification
	 * References46Choice.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification15#PoolIdentification
	 * Identification15.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References41Choice#PoolIdentification
	 * References41Choice.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References47Choice#PoolIdentification
	 * References47Choice.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References42Choice#PoolIdentification
	 * References42Choice.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References18#PoolIdentification
	 * References18.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#PoolIdentification
	 * SecuritiesFinancingTransactionDetails33.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction49#PoolIdentification
	 * Transaction49.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters14#PoolIdentification
	 * TransactionTypeAndAdditionalParameters14.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters12#PoolIdentification
	 * TransactionTypeAndAdditionalParameters12.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails61#PoolIdentification
	 * SecuritiesTradeDetails61.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters25#PoolIdentification
	 * AdditionalParameters25.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification24#PoolIdentification
	 * SettlementTypeAndIdentification24.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails87#PoolIdentification
	 * TransactionDetails87.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References58Choice#PoolIdentification
	 * References58Choice.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification24#PoolIdentification
	 * Identification24.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction50#PoolIdentification
	 * Transaction50.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References50Choice#PoolIdentification
	 * References50Choice.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References51Choice#PoolIdentification
	 * References51Choice.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction48#PoolIdentification
	 * Transaction48.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References21#PoolIdentification
	 * References21.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References54Choice#PoolIdentification
	 * References54Choice.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction53#PoolIdentification
	 * Transaction53.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#PoolIdentification
	 * SecuritiesTradeDetails68.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails97#PoolIdentification
	 * TransactionDetails97.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters17#PoolIdentification
	 * TransactionTypeAndAdditionalParameters17.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters16#PoolIdentification
	 * TransactionTypeAndAdditionalParameters16.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#PoolIdentification
	 * SecuritiesFinancingTransactionDetails35.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction54#PoolIdentification
	 * Transaction54.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction52#PoolIdentification
	 * Transaction52.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters19#PoolIdentification
	 * TransactionTypeAndAdditionalParameters19.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails69#PoolIdentification
	 * SecuritiesTradeDetails69.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters20#PoolIdentification
	 * TransactionTypeAndAdditionalParameters20.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction57#PoolIdentification
	 * Transaction57.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36#PoolIdentification
	 * SecuritiesFinancingTransactionDetails36.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction56#PoolIdentification
	 * Transaction56.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails100#PoolIdentification
	 * TransactionDetails100.PoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction55#PoolIdentification
	 * Transaction55.PoolIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
	 * SecuritiesTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PoolIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Collective reference identifying a set of messages."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PoolIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.References1Choice.PoolIdentification, com.tools20022.repository.choice.References12Choice.PoolIdentification,
					com.tools20022.repository.choice.References28Choice.PoolIdentification, com.tools20022.repository.msg.AdditionalParameters3.PoolIdentification, com.tools20022.repository.msg.AdditionalParameters7.PoolIdentification,
					com.tools20022.repository.msg.AdditionalParameters8.PoolIdentification, com.tools20022.repository.msg.AdditionalParameters9.PoolIdentification, com.tools20022.repository.msg.AdditionalParameters10.PoolIdentification,
					com.tools20022.repository.msg.AdditionalParameters11.PoolIdentification, com.tools20022.repository.choice.References5Choice.PoolIdentification, com.tools20022.repository.choice.References11Choice.PoolIdentification,
					com.tools20022.repository.choice.References19Choice.PoolIdentification, com.tools20022.repository.choice.References21Choice.PoolIdentification, com.tools20022.repository.choice.References27Choice.PoolIdentification,
					com.tools20022.repository.choice.References33Choice.PoolIdentification, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters3.PoolIdentification,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters6.PoolIdentification, com.tools20022.repository.choice.References14Choice.PoolIdentification,
					com.tools20022.repository.choice.References16Choice.PoolIdentification, com.tools20022.repository.choice.References25Choice.PoolIdentification, com.tools20022.repository.choice.References32Choice.PoolIdentification,
					com.tools20022.repository.msg.References1.PoolIdentification, com.tools20022.repository.choice.References6Choice.PoolIdentification, com.tools20022.repository.msg.References2.PoolIdentification,
					com.tools20022.repository.choice.References10Choice.PoolIdentification, com.tools20022.repository.msg.References7.PoolIdentification, com.tools20022.repository.choice.References13Choice.PoolIdentification,
					com.tools20022.repository.msg.References8.PoolIdentification, com.tools20022.repository.choice.References15Choice.PoolIdentification, com.tools20022.repository.msg.References9.PoolIdentification,
					com.tools20022.repository.choice.References24Choice.PoolIdentification, com.tools20022.repository.msg.References13.PoolIdentification, com.tools20022.repository.choice.References31Choice.PoolIdentification,
					com.tools20022.repository.msg.SettlementTypeAndIdentification1.PoolIdentification, com.tools20022.repository.msg.SettlementTypeAndIdentification8.PoolIdentification,
					com.tools20022.repository.msg.SettlementTypeAndIdentification9.PoolIdentification, com.tools20022.repository.msg.SettlementTypeAndIdentification11.PoolIdentification,
					com.tools20022.repository.msg.SettlementTypeAndIdentification15.PoolIdentification, com.tools20022.repository.msg.SettlementTypeAndIdentification17.PoolIdentification,
					com.tools20022.repository.msg.SettlementTypeAndIdentification10.PoolIdentification, com.tools20022.repository.msg.SettlementTypeAndIdentification12.PoolIdentification,
					com.tools20022.repository.msg.TransactionDetails5.PoolIdentification, com.tools20022.repository.msg.TransactionDetails9.PoolIdentification, com.tools20022.repository.msg.TransactionDetails22.PoolIdentification,
					com.tools20022.repository.msg.TransactionDetails23.PoolIdentification, com.tools20022.repository.msg.TransactionDetails36.PoolIdentification, com.tools20022.repository.msg.TransactionDetails47.PoolIdentification,
					com.tools20022.repository.msg.TransactionDetails53.PoolIdentification, com.tools20022.repository.msg.TransactionDetails58.PoolIdentification, com.tools20022.repository.msg.Transaction7.PoolIdentification,
					com.tools20022.repository.msg.Transaction8.PoolIdentification, com.tools20022.repository.msg.Transaction9.PoolIdentification, com.tools20022.repository.msg.Transaction10.PoolIdentification,
					com.tools20022.repository.msg.Transaction14.PoolIdentification, com.tools20022.repository.msg.Transaction12.PoolIdentification, com.tools20022.repository.msg.Transaction15.PoolIdentification,
					com.tools20022.repository.msg.Transaction16.PoolIdentification, com.tools20022.repository.msg.Transaction20.PoolIdentification, com.tools20022.repository.msg.Transaction19.PoolIdentification,
					com.tools20022.repository.msg.Transaction23.PoolIdentification, com.tools20022.repository.msg.Transaction22.PoolIdentification, com.tools20022.repository.msg.Transaction28.PoolIdentification,
					com.tools20022.repository.msg.Transaction27.PoolIdentification, com.tools20022.repository.msg.Transaction30.PoolIdentification, com.tools20022.repository.msg.Transaction31.PoolIdentification,
					com.tools20022.repository.msg.Transaction6.PoolIdentification, com.tools20022.repository.msg.Transaction11.PoolIdentification, com.tools20022.repository.msg.Transaction13.PoolIdentification,
					com.tools20022.repository.msg.Transaction17.PoolIdentification, com.tools20022.repository.msg.Transaction18.PoolIdentification, com.tools20022.repository.msg.Transaction21.PoolIdentification,
					com.tools20022.repository.msg.Transaction29.PoolIdentification, com.tools20022.repository.msg.Transaction32.PoolIdentification, com.tools20022.repository.msg.Identification2.PoolIdentification,
					com.tools20022.repository.choice.IdentificationReference8Choice.PoolIdentification, com.tools20022.repository.choice.IdentificationReference11Choice.PoolIdentification,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters2.PoolIdentification, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters7.PoolIdentification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2.PoolIdentification, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8.PoolIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails4.PoolIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails17.PoolIdentification, com.tools20022.repository.msg.Identification7.PoolIdentification,
					com.tools20022.repository.msg.Identification6.PoolIdentification, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters5.PoolIdentification,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters8.PoolIdentification, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6.PoolIdentification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10.PoolIdentification, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17.PoolIdentification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18.PoolIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails10.PoolIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails22.PoolIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails23.PoolIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails29.PoolIdentification, com.tools20022.repository.msg.Identification5.PoolIdentification, com.tools20022.repository.msg.Identification8.PoolIdentification,
					com.tools20022.repository.msg.Identification11.PoolIdentification, com.tools20022.repository.msg.Identification13.PoolIdentification, com.tools20022.repository.msg.Identification9.PoolIdentification,
					com.tools20022.repository.choice.References34Choice.PoolIdentification, com.tools20022.repository.msg.References14.PoolIdentification, com.tools20022.repository.msg.Transaction25.PoolIdentification,
					com.tools20022.repository.choice.References36Choice.PoolIdentification, com.tools20022.repository.choice.References35Choice.PoolIdentification, com.tools20022.repository.msg.Identification3.PoolIdentification,
					com.tools20022.repository.msg.AdditionalParameters16.PoolIdentification, com.tools20022.repository.msg.TransactionDetails61.PoolIdentification, com.tools20022.repository.msg.Transaction34.PoolIdentification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21.PoolIdentification, com.tools20022.repository.msg.Transaction35.PoolIdentification, com.tools20022.repository.msg.Transaction36.PoolIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails35.PoolIdentification, com.tools20022.repository.msg.References16.PoolIdentification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22.PoolIdentification, com.tools20022.repository.msg.Transaction38.PoolIdentification,
					com.tools20022.repository.msg.TransactionDetails66.PoolIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails42.PoolIdentification, com.tools20022.repository.msg.References17.PoolIdentification,
					com.tools20022.repository.msg.Transaction39.PoolIdentification, com.tools20022.repository.msg.Transaction37.PoolIdentification, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24.PoolIdentification,
					com.tools20022.repository.msg.Transaction41.PoolIdentification, com.tools20022.repository.msg.TransactionDetails70.PoolIdentification, com.tools20022.repository.msg.Transaction40.PoolIdentification,
					com.tools20022.repository.msg.Transaction43.PoolIdentification, com.tools20022.repository.msg.TransactionDetails71.PoolIdentification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25.PoolIdentification, com.tools20022.repository.msg.Transaction42.PoolIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails49.PoolIdentification, com.tools20022.repository.msg.Transaction47.PoolIdentification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26.PoolIdentification, com.tools20022.repository.msg.TransactionDetails79.PoolIdentification,
					com.tools20022.repository.msg.Transaction45.PoolIdentification, com.tools20022.repository.msg.Transaction46.PoolIdentification, com.tools20022.repository.msg.SettlementTypeAndIdentification19.PoolIdentification,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters10.PoolIdentification, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters11.PoolIdentification,
					com.tools20022.repository.msg.AdditionalParameters21.PoolIdentification, com.tools20022.repository.choice.References46Choice.PoolIdentification, com.tools20022.repository.msg.Identification15.PoolIdentification,
					com.tools20022.repository.choice.References41Choice.PoolIdentification, com.tools20022.repository.choice.References47Choice.PoolIdentification, com.tools20022.repository.choice.References42Choice.PoolIdentification,
					com.tools20022.repository.msg.References18.PoolIdentification, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.PoolIdentification, com.tools20022.repository.msg.Transaction49.PoolIdentification,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters14.PoolIdentification, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters12.PoolIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails61.PoolIdentification, com.tools20022.repository.msg.AdditionalParameters25.PoolIdentification,
					com.tools20022.repository.msg.SettlementTypeAndIdentification24.PoolIdentification, com.tools20022.repository.msg.TransactionDetails87.PoolIdentification,
					com.tools20022.repository.choice.References58Choice.PoolIdentification, com.tools20022.repository.msg.Identification24.PoolIdentification, com.tools20022.repository.msg.Transaction50.PoolIdentification,
					com.tools20022.repository.choice.References50Choice.PoolIdentification, com.tools20022.repository.choice.References51Choice.PoolIdentification, com.tools20022.repository.msg.Transaction48.PoolIdentification,
					com.tools20022.repository.msg.References21.PoolIdentification, com.tools20022.repository.choice.References54Choice.PoolIdentification, com.tools20022.repository.msg.Transaction53.PoolIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails68.PoolIdentification, com.tools20022.repository.msg.TransactionDetails97.PoolIdentification,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters17.PoolIdentification, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters16.PoolIdentification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35.PoolIdentification, com.tools20022.repository.msg.Transaction54.PoolIdentification, com.tools20022.repository.msg.Transaction52.PoolIdentification,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters19.PoolIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails69.PoolIdentification,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters20.PoolIdentification, com.tools20022.repository.msg.Transaction57.PoolIdentification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36.PoolIdentification, com.tools20022.repository.msg.Transaction56.PoolIdentification,
					com.tools20022.repository.msg.TransactionDetails100.PoolIdentification, com.tools20022.repository.msg.Transaction55.PoolIdentification);
			elementContext_lazy = () -> SecuritiesTradeIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PoolIdentification";
			definition = "Collective reference identifying a set of messages.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Unambiguous identification of a collateral transaction.
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails25#CollateralTransactionIdentification
	 * SecuritiesTradeDetails25.CollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails26#CollateralTransactionIdentification
	 * SecuritiesTradeDetails26.CollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails27#CollateralTransactionIdentification
	 * SecuritiesTradeDetails27.CollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails28#CollateralTransactionIdentification
	 * SecuritiesTradeDetails28.CollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails2#CollateralTransactionIdentification
	 * SecuritiesTradeDetails2.CollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails16#CollateralTransactionIdentification
	 * SecuritiesTradeDetails16.CollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails1#CollateralTransactionIdentification
	 * SecuritiesTradeDetails1.CollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails15#CollateralTransactionIdentification
	 * SecuritiesTradeDetails15.CollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails53#ClientCollateralInstructionIdentification
	 * TransactionDetails53.ClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails58#ClientCollateralInstructionIdentification
	 * TransactionDetails58.ClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction28#ClientCollateralInstructionIdentification
	 * Transaction28.ClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction27#ClientCollateralInstructionIdentification
	 * Transaction27.ClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction30#ClientCollateralInstructionIdentification
	 * Transaction30.ClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction31#ClientCollateralInstructionIdentification
	 * Transaction31.ClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction29#ClientCollateralInstructionIdentification
	 * Transaction29.ClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction32#ClientCollateralInstructionIdentification
	 * Transaction32.ClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference8Choice#CollateralTransactionIdentification
	 * IdentificationReference8Choice.CollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference11Choice#CollateralTransactionIdentification
	 * IdentificationReference11Choice.CollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails8#CollateralTransactionIdentification
	 * SecuritiesTradeDetails8.CollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails18#CollateralTransactionIdentification
	 * SecuritiesTradeDetails18.CollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails4#CollateralTransactionIdentification
	 * SecuritiesTradeDetails4.CollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails17#CollateralTransactionIdentification
	 * SecuritiesTradeDetails17.CollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails9#CollateralTransactionIdentification
	 * SecuritiesTradeDetails9.CollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails21#CollateralTransactionIdentification
	 * SecuritiesTradeDetails21.CollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails10#CollateralTransactionIdentification
	 * SecuritiesTradeDetails10.CollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails22#CollateralTransactionIdentification
	 * SecuritiesTradeDetails22.CollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails23#CollateralTransactionIdentification
	 * SecuritiesTradeDetails23.CollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails29#CollateralTransactionIdentification
	 * SecuritiesTradeDetails29.CollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails61#ClientCollateralInstructionIdentification
	 * TransactionDetails61.ClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction34#ClientCollateralInstructionIdentification
	 * Transaction34.ClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction35#ClientCollateralInstructionIdentification
	 * Transaction35.ClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction36#ClientCollateralInstructionIdentification
	 * Transaction36.ClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails31#CollateralTransactionIdentification
	 * SecuritiesTradeDetails31.CollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33#CollateralTransactionIdentification
	 * SecuritiesTradeDetails33.CollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails35#CollateralTransactionIdentification
	 * SecuritiesTradeDetails35.CollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails36#CollateralTransactionIdentification
	 * SecuritiesTradeDetails36.CollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails34#CollateralTransactionIdentification
	 * SecuritiesTradeDetails34.CollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails32#CollateralTransactionIdentification
	 * SecuritiesTradeDetails32.CollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails44#CollateralTransactionIdentification
	 * SecuritiesTradeDetails44.CollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails43#CollateralTransactionIdentification
	 * SecuritiesTradeDetails43.CollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails41#CollateralTransactionIdentification
	 * SecuritiesTradeDetails41.CollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction38#ClientCollateralInstructionIdentification
	 * Transaction38.ClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails66#ClientCollateralInstructionIdentification
	 * TransactionDetails66.ClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails42#CollateralTransactionIdentification
	 * SecuritiesTradeDetails42.CollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction39#ClientCollateralInstructionIdentification
	 * Transaction39.ClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails46#CollateralTransactionIdentification
	 * SecuritiesTradeDetails46.CollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails47#CollateralTransactionIdentification
	 * SecuritiesTradeDetails47.CollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction37#ClientCollateralInstructionIdentification
	 * Transaction37.ClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction41#ClientCollateralInstructionIdentification
	 * Transaction41.ClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails70#ClientCollateralInstructionIdentification
	 * TransactionDetails70.ClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction40#ClientCollateralInstructionIdentification
	 * Transaction40.ClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction43#ClientCollateralInstructionIdentification
	 * Transaction43.ClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails71#ClientCollateralInstructionIdentification
	 * TransactionDetails71.ClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction42#ClientCollateralInstructionIdentification
	 * Transaction42.ClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails49#CollateralTransactionIdentification
	 * SecuritiesTradeDetails49.CollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction47#ClientCollateralInstructionIdentification
	 * Transaction47.ClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails79#ClientCollateralInstructionIdentification
	 * TransactionDetails79.ClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction45#ClientCollateralInstructionIdentification
	 * Transaction45.ClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction46#ClientCollateralInstructionIdentification
	 * Transaction46.ClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails51#CollateralTransactionIdentification
	 * SecuritiesTradeDetails51.CollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails53#CollateralTransactionIdentification
	 * SecuritiesTradeDetails53.CollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails54#CollateralTransactionIdentification
	 * SecuritiesTradeDetails54.CollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails52#CollateralTransactionIdentification
	 * SecuritiesTradeDetails52.CollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails50#CollateralTransactionIdentification
	 * SecuritiesTradeDetails50.CollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction49#ClientCollateralInstructionIdentification
	 * Transaction49.ClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails61#CollateralTransactionIdentification
	 * SecuritiesTradeDetails61.CollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63#CollateralTransactionIdentification
	 * SecuritiesTradeDetails63.CollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails62#CollateralTransactionIdentification
	 * SecuritiesTradeDetails62.CollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails87#ClientCollateralInstructionIdentification
	 * TransactionDetails87.ClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails60#CollateralTransactionIdentification
	 * SecuritiesTradeDetails60.CollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction50#ClientCollateralInstructionIdentification
	 * Transaction50.ClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction48#ClientCollateralInstructionIdentification
	 * Transaction48.ClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails65#CollateralTransactionIdentification
	 * SecuritiesTradeDetails65.CollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails66#CollateralTransactionIdentification
	 * SecuritiesTradeDetails66.CollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails67#CollateralTransactionIdentification
	 * SecuritiesTradeDetails67.CollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction53#ClientCollateralInstructionIdentification
	 * Transaction53.ClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#CollateralTransactionIdentification
	 * SecuritiesTradeDetails68.CollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails97#ClientCollateralInstructionIdentification
	 * TransactionDetails97.ClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction54#ClientCollateralInstructionIdentification
	 * Transaction54.ClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction52#ClientCollateralInstructionIdentification
	 * Transaction52.ClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails69#CollateralTransactionIdentification
	 * SecuritiesTradeDetails69.CollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction57#ClientCollateralInstructionIdentification
	 * Transaction57.ClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails70#CollateralTransactionIdentification
	 * SecuritiesTradeDetails70.CollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction56#ClientCollateralInstructionIdentification
	 * Transaction56.ClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails100#ClientCollateralInstructionIdentification
	 * TransactionDetails100.ClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction55#ClientCollateralInstructionIdentification
	 * Transaction55.ClientCollateralInstructionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
	 * SecuritiesTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unambiguous identification of a collateral transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CollateralTransactionIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesTradeDetails25.CollateralTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails26.CollateralTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails27.CollateralTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails28.CollateralTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails2.CollateralTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails16.CollateralTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails1.CollateralTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails15.CollateralTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails53.ClientCollateralInstructionIdentification, com.tools20022.repository.msg.TransactionDetails58.ClientCollateralInstructionIdentification,
					com.tools20022.repository.msg.Transaction28.ClientCollateralInstructionIdentification, com.tools20022.repository.msg.Transaction27.ClientCollateralInstructionIdentification,
					com.tools20022.repository.msg.Transaction30.ClientCollateralInstructionIdentification, com.tools20022.repository.msg.Transaction31.ClientCollateralInstructionIdentification,
					com.tools20022.repository.msg.Transaction29.ClientCollateralInstructionIdentification, com.tools20022.repository.msg.Transaction32.ClientCollateralInstructionIdentification,
					com.tools20022.repository.choice.IdentificationReference8Choice.CollateralTransactionIdentification, com.tools20022.repository.choice.IdentificationReference11Choice.CollateralTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails8.CollateralTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails18.CollateralTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails4.CollateralTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails17.CollateralTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails9.CollateralTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails21.CollateralTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails10.CollateralTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails22.CollateralTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails23.CollateralTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails29.CollateralTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails61.ClientCollateralInstructionIdentification, com.tools20022.repository.msg.Transaction34.ClientCollateralInstructionIdentification,
					com.tools20022.repository.msg.Transaction35.ClientCollateralInstructionIdentification, com.tools20022.repository.msg.Transaction36.ClientCollateralInstructionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails31.CollateralTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails33.CollateralTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails35.CollateralTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails36.CollateralTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails34.CollateralTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails32.CollateralTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails44.CollateralTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails43.CollateralTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails41.CollateralTransactionIdentification, com.tools20022.repository.msg.Transaction38.ClientCollateralInstructionIdentification,
					com.tools20022.repository.msg.TransactionDetails66.ClientCollateralInstructionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails42.CollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction39.ClientCollateralInstructionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails46.CollateralTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails47.CollateralTransactionIdentification, com.tools20022.repository.msg.Transaction37.ClientCollateralInstructionIdentification,
					com.tools20022.repository.msg.Transaction41.ClientCollateralInstructionIdentification, com.tools20022.repository.msg.TransactionDetails70.ClientCollateralInstructionIdentification,
					com.tools20022.repository.msg.Transaction40.ClientCollateralInstructionIdentification, com.tools20022.repository.msg.Transaction43.ClientCollateralInstructionIdentification,
					com.tools20022.repository.msg.TransactionDetails71.ClientCollateralInstructionIdentification, com.tools20022.repository.msg.Transaction42.ClientCollateralInstructionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails49.CollateralTransactionIdentification, com.tools20022.repository.msg.Transaction47.ClientCollateralInstructionIdentification,
					com.tools20022.repository.msg.TransactionDetails79.ClientCollateralInstructionIdentification, com.tools20022.repository.msg.Transaction45.ClientCollateralInstructionIdentification,
					com.tools20022.repository.msg.Transaction46.ClientCollateralInstructionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails51.CollateralTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails53.CollateralTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails54.CollateralTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails52.CollateralTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails50.CollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction49.ClientCollateralInstructionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails61.CollateralTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails63.CollateralTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails62.CollateralTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails87.ClientCollateralInstructionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails60.CollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction50.ClientCollateralInstructionIdentification, com.tools20022.repository.msg.Transaction48.ClientCollateralInstructionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails65.CollateralTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails66.CollateralTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails67.CollateralTransactionIdentification, com.tools20022.repository.msg.Transaction53.ClientCollateralInstructionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails68.CollateralTransactionIdentification, com.tools20022.repository.msg.TransactionDetails97.ClientCollateralInstructionIdentification,
					com.tools20022.repository.msg.Transaction54.ClientCollateralInstructionIdentification, com.tools20022.repository.msg.Transaction52.ClientCollateralInstructionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails69.CollateralTransactionIdentification, com.tools20022.repository.msg.Transaction57.ClientCollateralInstructionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails70.CollateralTransactionIdentification, com.tools20022.repository.msg.Transaction56.ClientCollateralInstructionIdentification,
					com.tools20022.repository.msg.TransactionDetails100.ClientCollateralInstructionIdentification, com.tools20022.repository.msg.Transaction55.ClientCollateralInstructionIdentification);
			elementContext_lazy = () -> SecuritiesTradeIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CollateralTransactionIdentification";
			definition = "Unambiguous identification of a collateral transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Unique reference identifying the triparty collateral management
	 * transaction from the client's point of view.
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
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters3#MarketInfrastructureTransactionIdentification
	 * AdditionalParameters3.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters7#MarketInfrastructureTransactionIdentification
	 * AdditionalParameters7.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters8#MarketInfrastructureTransactionIdentification
	 * AdditionalParameters8.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters9#MarketInfrastructureTransactionIdentification
	 * AdditionalParameters9.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters10#MarketInfrastructureTransactionIdentification
	 * AdditionalParameters10.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters11#MarketInfrastructureTransactionIdentification
	 * AdditionalParameters11.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters2#ClientTripartyCollateralTransactionIdentification
	 * AdditionalParameters2.ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters6#ClientTripartyCollateralTransactionIdentification
	 * AdditionalParameters6.ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters12#ClientTripartyCollateralTransactionIdentification
	 * AdditionalParameters12.ClientTripartyCollateralTransactionIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters13#ClientTripartyCollateralTransactionIdentification
	 * AdditionalParameters13.ClientTripartyCollateralTransactionIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters17#ClientTripartyCollateralTransactionIdentification
	 * AdditionalParameters17.ClientTripartyCollateralTransactionIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters17#ClientCollateralInstructionIdentification
	 * AdditionalParameters17.ClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters20#ClientTripartyCollateralTransactionIdentification
	 * AdditionalParameters20.ClientTripartyCollateralTransactionIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters20#ClientCollateralInstructionIdentification
	 * AdditionalParameters20.ClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails5#ClientTripartyCollateralTransactionIdentification
	 * TransactionDetails5.ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails9#ClientTripartyCollateralTransactionIdentification
	 * TransactionDetails9.ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails22#ClientTripartyCollateralTransactionIdentification
	 * TransactionDetails22.ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails23#ClientTripartyCollateralTransactionIdentification
	 * TransactionDetails23.ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails36#ClientTripartyCollateralTransactionIdentification
	 * TransactionDetails36.ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails47#ClientTripartyCollateralTransactionIdentification
	 * TransactionDetails47.ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails53#ClientTripartyCollateralTransactionIdentification
	 * TransactionDetails53.ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails58#ClientTripartyCollateralTransactionIdentification
	 * TransactionDetails58.ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction7#ClientTripartyCollateralTransactionIdentification
	 * Transaction7.ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction8#ClientTripartyCollateralTransactionIdentification
	 * Transaction8.ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction9#ClientTripartyCollateralTransactionIdentification
	 * Transaction9.ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction10#ClientTripartyCollateralTransactionIdentification
	 * Transaction10.ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction14#ClientTripartyCollateralTransactionIdentification
	 * Transaction14.ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction12#ClientTripartyCollateralTransactionIdentification
	 * Transaction12.ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction15#ClientTripartyCollateralTransactionIdentification
	 * Transaction15.ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction16#ClientTripartyCollateralTransactionIdentification
	 * Transaction16.ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction20#ClientTripartyCollateralTransactionIdentification
	 * Transaction20.ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction19#ClientTripartyCollateralTransactionIdentification
	 * Transaction19.ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction23#ClientTripartyCollateralTransactionIdentification
	 * Transaction23.ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction22#ClientTripartyCollateralTransactionIdentification
	 * Transaction22.ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction28#ClientTripartyCollateralTransactionIdentification
	 * Transaction28.ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction27#ClientTripartyCollateralTransactionIdentification
	 * Transaction27.ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction30#ClientTripartyCollateralTransactionIdentification
	 * Transaction30.ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction31#ClientTripartyCollateralTransactionIdentification
	 * Transaction31.ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction6#ClientTripartyCollateralTransactionIdentification
	 * Transaction6.ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction11#ClientTripartyCollateralTransactionIdentification
	 * Transaction11.ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction13#ClientTripartyCollateralTransactionIdentification
	 * Transaction13.ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction17#ClientTripartyCollateralTransactionIdentification
	 * Transaction17.ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction18#ClientTripartyCollateralTransactionIdentification
	 * Transaction18.ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction21#ClientTripartyCollateralTransactionIdentification
	 * Transaction21.ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction29#ClientTripartyCollateralTransactionIdentification
	 * Transaction29.ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction32#ClientTripartyCollateralTransactionIdentification
	 * Transaction32.ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2#ClientTripartyCollateralTransactionIdentification
	 * SecuritiesFinancingTransactionDetails2.
	 * ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8#ClientTripartyCollateralTransactionIdentification
	 * SecuritiesFinancingTransactionDetails8.
	 * ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters4#ClientTripartyCollateralTransactionIdentification
	 * AdditionalParameters4.ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6#ClientTripartyCollateralTransactionIdentification
	 * SecuritiesFinancingTransactionDetails6.
	 * ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10#ClientTripartyCollateralTransactionIdentification
	 * SecuritiesFinancingTransactionDetails10.
	 * ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17#ClientTripartyCollateralTransactionIdentification
	 * SecuritiesFinancingTransactionDetails17.
	 * ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18#ClientTripartyCollateralTransactionIdentification
	 * SecuritiesFinancingTransactionDetails18.
	 * ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters5#ClientTripartyCollateralTransactionIdentification
	 * AdditionalParameters5.ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters14#ClientTripartyCollateralTransactionIdentification
	 * AdditionalParameters14.ClientTripartyCollateralTransactionIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters15#ClientTripartyCollateralTransactionIdentification
	 * AdditionalParameters15.ClientTripartyCollateralTransactionIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction25#ClientTripartyCollateralTransactionIdentification
	 * Transaction25.ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters16#MarketInfrastructureTransactionIdentification
	 * AdditionalParameters16.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails61#ClientTripartyCollateralTransactionIdentification
	 * TransactionDetails61.ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction34#ClientTripartyCollateralTransactionIdentification
	 * Transaction34.ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21#ClientTripartyCollateralTransactionIdentification
	 * SecuritiesFinancingTransactionDetails21.
	 * ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction35#ClientTripartyCollateralTransactionIdentification
	 * Transaction35.ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction36#ClientTripartyCollateralTransactionIdentification
	 * Transaction36.ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22#ClientTripartyCollateralTransactionIdentification
	 * SecuritiesFinancingTransactionDetails22.
	 * ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction38#ClientTripartyCollateralTransactionIdentification
	 * Transaction38.ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails66#ClientTripartyCollateralTransactionIdentification
	 * TransactionDetails66.ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction39#ClientTripartyCollateralTransactionIdentification
	 * Transaction39.ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction37#ClientTripartyCollateralTransactionIdentification
	 * Transaction37.ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24#ClientTripartyCollateralTransactionIdentification
	 * SecuritiesFinancingTransactionDetails24.
	 * ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction41#ClientTripartyCollateralTransactionIdentification
	 * Transaction41.ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails70#ClientTripartyCollateralTransactionIdentification
	 * TransactionDetails70.ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction40#ClientTripartyCollateralTransactionIdentification
	 * Transaction40.ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction43#ClientTripartyCollateralTransactionIdentification
	 * Transaction43.ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails71#ClientTripartyCollateralTransactionIdentification
	 * TransactionDetails71.ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25#ClientTripartyCollateralTransactionIdentification
	 * SecuritiesFinancingTransactionDetails25.
	 * ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction42#ClientTripartyCollateralTransactionIdentification
	 * Transaction42.ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction47#ClientTripartyCollateralTransactionIdentification
	 * Transaction47.ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#ClientTripartyCollateralTransactionIdentification
	 * SecuritiesFinancingTransactionDetails26.
	 * ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails79#ClientTripartyCollateralTransactionIdentification
	 * TransactionDetails79.ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction45#ClientTripartyCollateralTransactionIdentification
	 * Transaction45.ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction46#ClientTripartyCollateralTransactionIdentification
	 * Transaction46.ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters23#ClientTripartyCollateralTransactionIdentification
	 * AdditionalParameters23.ClientTripartyCollateralTransactionIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters22#ClientTripartyCollateralTransactionIdentification
	 * AdditionalParameters22.ClientTripartyCollateralTransactionIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters22#ClientCollateralInstructionIdentification
	 * AdditionalParameters22.ClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters21#MarketInfrastructureTransactionIdentification
	 * AdditionalParameters21.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#ClientTripartyCollateralTransactionIdentification
	 * SecuritiesFinancingTransactionDetails33.
	 * ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction49#ClientTripartyCollateralTransactionIdentification
	 * Transaction49.ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters25#MarketInfrastructureTransactionIdentification
	 * AdditionalParameters25.MarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters28#ClientTripartyCollateralTransactionIdentification
	 * AdditionalParameters28.ClientTripartyCollateralTransactionIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters27#ClientTripartyCollateralTransactionIdentification
	 * AdditionalParameters27.ClientTripartyCollateralTransactionIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters27#ClientCollateralInstructionIdentification
	 * AdditionalParameters27.ClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails87#ClientTripartyCollateralTransactionIdentification
	 * TransactionDetails87.ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction50#ClientTripartyCollateralTransactionIdentification
	 * Transaction50.ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction48#ClientTripartyCollateralTransactionIdentification
	 * Transaction48.ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters29#ClientTripartyCollateralTransactionIdentification
	 * AdditionalParameters29.ClientTripartyCollateralTransactionIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters29#ClientCollateralInstructionIdentification
	 * AdditionalParameters29.ClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters30#ClientTripartyCollateralTransactionIdentification
	 * AdditionalParameters30.ClientTripartyCollateralTransactionIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction53#ClientTripartyCollateralTransactionIdentification
	 * Transaction53.ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails97#ClientTripartyCollateralTransactionIdentification
	 * TransactionDetails97.ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#ClientTripartyCollateralTransactionIdentification
	 * SecuritiesFinancingTransactionDetails35.
	 * ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction54#ClientTripartyCollateralTransactionIdentification
	 * Transaction54.ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction52#ClientTripartyCollateralTransactionIdentification
	 * Transaction52.ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters31#ClientTripartyCollateralTransactionIdentification
	 * AdditionalParameters31.ClientTripartyCollateralTransactionIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters31#ClientCollateralInstructionIdentification
	 * AdditionalParameters31.ClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction57#ClientTripartyCollateralTransactionIdentification
	 * Transaction57.ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36#ClientTripartyCollateralTransactionIdentification
	 * SecuritiesFinancingTransactionDetails36.
	 * ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters32#ClientTripartyCollateralTransactionIdentification
	 * AdditionalParameters32.ClientTripartyCollateralTransactionIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction56#ClientTripartyCollateralTransactionIdentification
	 * Transaction56.ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails100#ClientTripartyCollateralTransactionIdentification
	 * TransactionDetails100.ClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction55#ClientTripartyCollateralTransactionIdentification
	 * Transaction55.ClientTripartyCollateralTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
	 * SecuritiesTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientTripartyCollateralTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique reference identifying the triparty collateral management transaction from the client's point of view."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ClientTripartyCollateralTransactionIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AdditionalParameters3.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters7.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.AdditionalParameters8.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters9.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.AdditionalParameters10.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters11.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.AdditionalParameters2.ClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters6.ClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.AdditionalParameters12.ClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters13.ClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.AdditionalParameters17.ClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters17.ClientCollateralInstructionIdentification, com.tools20022.repository.msg.AdditionalParameters20.ClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters20.ClientCollateralInstructionIdentification, com.tools20022.repository.msg.TransactionDetails5.ClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails9.ClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.TransactionDetails22.ClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails23.ClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.TransactionDetails36.ClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails47.ClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.TransactionDetails53.ClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails58.ClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction7.ClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction8.ClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction9.ClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction10.ClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction14.ClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction12.ClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction15.ClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction16.ClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction20.ClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction19.ClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction23.ClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction22.ClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction28.ClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction27.ClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction30.ClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction31.ClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction6.ClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction11.ClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction13.ClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction17.ClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction18.ClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction21.ClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction29.ClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction32.ClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2.ClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8.ClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters4.ClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6.ClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10.ClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17.ClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18.ClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters5.ClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.AdditionalParameters14.ClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters15.ClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction25.ClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters16.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.TransactionDetails61.ClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction34.ClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21.ClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction35.ClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction36.ClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22.ClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction38.ClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails66.ClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction39.ClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction37.ClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24.ClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction41.ClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.TransactionDetails70.ClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction40.ClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction43.ClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails71.ClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25.ClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction42.ClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction47.ClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26.ClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails79.ClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction45.ClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction46.ClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.AdditionalParameters23.ClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters22.ClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.AdditionalParameters22.ClientCollateralInstructionIdentification,
					com.tools20022.repository.msg.AdditionalParameters21.MarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.ClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction49.ClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters25.MarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.AdditionalParameters28.ClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters27.ClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.AdditionalParameters27.ClientCollateralInstructionIdentification,
					com.tools20022.repository.msg.TransactionDetails87.ClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction50.ClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction48.ClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.AdditionalParameters29.ClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters29.ClientCollateralInstructionIdentification, com.tools20022.repository.msg.AdditionalParameters30.ClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction53.ClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.TransactionDetails97.ClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35.ClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction54.ClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction52.ClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.AdditionalParameters31.ClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters31.ClientCollateralInstructionIdentification, com.tools20022.repository.msg.Transaction57.ClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36.ClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters32.ClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction56.ClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails100.ClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction55.ClientTripartyCollateralTransactionIdentification);
			elementContext_lazy = () -> SecuritiesTradeIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClientTripartyCollateralTransactionIdentification";
			definition = "Unique reference identifying the triparty collateral management transaction from the client's point of view.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Unique reference identifying the triparty collateral management
	 * transaction from the triparty agent's point of view.
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
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters2#TripartyAgentCollateralTransactionIdentification
	 * AdditionalParameters2.TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters6#TripartyAgentCollateralTransactionIdentification
	 * AdditionalParameters6.TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters12#TripartyAgentCollateralTransactionIdentification
	 * AdditionalParameters12.TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters13#TripartyAgentCollateralTransactionIdentification
	 * AdditionalParameters13.TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters17#TripartyAgentCollateralTransactionIdentification
	 * AdditionalParameters17.TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters17#TripartyCollateralInstructionIdentification
	 * AdditionalParameters17.TripartyCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters20#TripartyAgentCollateralTransactionIdentification
	 * AdditionalParameters20.TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters20#TripartyCollateralInstructionIdentification
	 * AdditionalParameters20.TripartyCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails5#TripartyAgentCollateralTransactionIdentification
	 * TransactionDetails5.TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails9#TripartyAgentCollateralTransactionIdentification
	 * TransactionDetails9.TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails22#TripartyAgentCollateralTransactionIdentification
	 * TransactionDetails22.TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails23#TripartyAgentCollateralTransactionIdentification
	 * TransactionDetails23.TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails36#TripartyAgentCollateralTransactionIdentification
	 * TransactionDetails36.TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails47#TripartyAgentCollateralTransactionIdentification
	 * TransactionDetails47.TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails53#TripartyAgentCollateralTransactionIdentification
	 * TransactionDetails53.TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails53#TripartyCollateralInstructionIdentification
	 * TransactionDetails53.TripartyCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails58#TripartyAgentCollateralTransactionIdentification
	 * TransactionDetails58.TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails58#TripartyCollateralInstructionIdentification
	 * TransactionDetails58.TripartyCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction7#TripartyAgentCollateralTransactionIdentification
	 * Transaction7.TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction8#TripartyAgentCollateralTransactionIdentification
	 * Transaction8.TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction9#TripartyAgentCollateralTransactionIdentification
	 * Transaction9.TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction10#TripartyAgentCollateralTransactionIdentification
	 * Transaction10.TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction14#TripartyAgentCollateralTransactionIdentification
	 * Transaction14.TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction12#TripartyAgentCollateralTransactionIdentification
	 * Transaction12.TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction15#TripartyAgentCollateralTransactionIdentification
	 * Transaction15.TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction16#TripartyAgentCollateralTransactionIdentification
	 * Transaction16.TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction20#TripartyAgentCollateralTransactionIdentification
	 * Transaction20.TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction19#TripartyAgentCollateralTransactionIdentification
	 * Transaction19.TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction23#TripartyAgentCollateralTransactionIdentification
	 * Transaction23.TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction22#TripartyAgentCollateralTransactionIdentification
	 * Transaction22.TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction28#TripartyAgentCollateralTransactionIdentification
	 * Transaction28.TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction28#TripartyCollateralInstructionIdentification
	 * Transaction28.TripartyCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction27#TripartyAgentCollateralTransactionIdentification
	 * Transaction27.TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction27#TripartyCollateralInstructionIdentification
	 * Transaction27.TripartyCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction30#TripartyAgentCollateralTransactionIdentification
	 * Transaction30.TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction30#TripartyCollateralInstructionIdentification
	 * Transaction30.TripartyCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction31#TripartyAgentCollateralTransactionIdentification
	 * Transaction31.TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction31#TripartyCollateralInstructionIdentification
	 * Transaction31.TripartyCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction6#TripartyAgentCollateralTransactionIdentification
	 * Transaction6.TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction11#TripartyAgentCollateralTransactionIdentification
	 * Transaction11.TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction13#TripartyAgentCollateralTransactionIdentification
	 * Transaction13.TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction17#TripartyAgentCollateralTransactionIdentification
	 * Transaction17.TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction18#TripartyAgentCollateralTransactionIdentification
	 * Transaction18.TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction21#TripartyAgentCollateralTransactionIdentification
	 * Transaction21.TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction29#TripartyAgentCollateralTransactionIdentification
	 * Transaction29.TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction29#TripartyCollateralInstructionIdentification
	 * Transaction29.TripartyCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction32#TripartyAgentCollateralTransactionIdentification
	 * Transaction32.TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction32#TripartyCollateralInstructionIdentification
	 * Transaction32.TripartyCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2#TripartyAgentCollateralTransactionIdentification
	 * SecuritiesFinancingTransactionDetails2.
	 * TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8#TripartyAgentCollateralTransactionIdentification
	 * SecuritiesFinancingTransactionDetails8.
	 * TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters4#TripartyAgentCollateralTransactionIdentification
	 * AdditionalParameters4.TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6#TripartyAgentCollateralTransactionIdentification
	 * SecuritiesFinancingTransactionDetails6.
	 * TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10#TripartyAgentCollateralTransactionIdentification
	 * SecuritiesFinancingTransactionDetails10.
	 * TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17#TripartyAgentCollateralTransactionIdentification
	 * SecuritiesFinancingTransactionDetails17.
	 * TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18#TripartyAgentCollateralTransactionIdentification
	 * SecuritiesFinancingTransactionDetails18.
	 * TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters5#TripartyAgentCollateralTransactionIdentification
	 * AdditionalParameters5.TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters14#TripartyAgentCollateralTransactionIdentification
	 * AdditionalParameters14.TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters15#TripartyAgentCollateralTransactionIdentification
	 * AdditionalParameters15.TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction25#TripartyAgentCollateralTransactionIdentification
	 * Transaction25.TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails61#TripartyAgentCollateralTransactionIdentification
	 * TransactionDetails61.TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails61#TripartyCollateralInstructionIdentification
	 * TransactionDetails61.TripartyCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction34#TripartyAgentCollateralTransactionIdentification
	 * Transaction34.TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction34#TripartyCollateralInstructionIdentification
	 * Transaction34.TripartyCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21#TripartyAgentCollateralTransactionIdentification
	 * SecuritiesFinancingTransactionDetails21.
	 * TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction35#TripartyAgentCollateralTransactionIdentification
	 * Transaction35.TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction35#TripartyCollateralInstructionIdentification
	 * Transaction35.TripartyCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction36#TripartyAgentCollateralTransactionIdentification
	 * Transaction36.TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction36#TripartyCollateralInstructionIdentification
	 * Transaction36.TripartyCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22#TripartyAgentCollateralTransactionIdentification
	 * SecuritiesFinancingTransactionDetails22.
	 * TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction38#TripartyAgentCollateralTransactionIdentification
	 * Transaction38.TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction38#TripartyCollateralInstructionIdentification
	 * Transaction38.TripartyCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails66#TripartyAgentCollateralTransactionIdentification
	 * TransactionDetails66.TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails66#TripartyCollateralInstructionIdentification
	 * TransactionDetails66.TripartyCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction39#TripartyAgentCollateralTransactionIdentification
	 * Transaction39.TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction39#TripartyCollateralInstructionIdentification
	 * Transaction39.TripartyCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction37#TripartyAgentCollateralTransactionIdentification
	 * Transaction37.TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction37#TripartyCollateralInstructionIdentification
	 * Transaction37.TripartyCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24#TripartyAgentCollateralTransactionIdentification
	 * SecuritiesFinancingTransactionDetails24.
	 * TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction41#TripartyAgentCollateralTransactionIdentification
	 * Transaction41.TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction41#TripartyCollateralInstructionIdentification
	 * Transaction41.TripartyCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails70#TripartyAgentCollateralTransactionIdentification
	 * TransactionDetails70.TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails70#TripartyCollateralInstructionIdentification
	 * TransactionDetails70.TripartyCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction40#TripartyAgentCollateralTransactionIdentification
	 * Transaction40.TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction40#TripartyCollateralInstructionIdentification
	 * Transaction40.TripartyCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction43#TripartyAgentCollateralTransactionIdentification
	 * Transaction43.TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction43#TripartyCollateralInstructionIdentification
	 * Transaction43.TripartyCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails71#TripartyAgentCollateralTransactionIdentification
	 * TransactionDetails71.TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails71#TripartyCollateralInstructionIdentification
	 * TransactionDetails71.TripartyCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25#TripartyAgentCollateralTransactionIdentification
	 * SecuritiesFinancingTransactionDetails25.
	 * TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction42#TripartyAgentCollateralTransactionIdentification
	 * Transaction42.TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction42#TripartyCollateralInstructionIdentification
	 * Transaction42.TripartyCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction47#TripartyAgentCollateralTransactionIdentification
	 * Transaction47.TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction47#TripartyCollateralInstructionIdentification
	 * Transaction47.TripartyCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#TripartyAgentCollateralTransactionIdentification
	 * SecuritiesFinancingTransactionDetails26.
	 * TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails79#TripartyAgentCollateralTransactionIdentification
	 * TransactionDetails79.TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails79#TripartyCollateralInstructionIdentification
	 * TransactionDetails79.TripartyCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction45#TripartyAgentCollateralTransactionIdentification
	 * Transaction45.TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction45#TripartyCollateralInstructionIdentification
	 * Transaction45.TripartyCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction46#TripartyAgentCollateralTransactionIdentification
	 * Transaction46.TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction46#TripartyCollateralInstructionIdentification
	 * Transaction46.TripartyCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters23#TripartyAgentCollateralTransactionIdentification
	 * AdditionalParameters23.TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters22#TripartyAgentCollateralTransactionIdentification
	 * AdditionalParameters22.TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters22#TripartyCollateralInstructionIdentification
	 * AdditionalParameters22.TripartyCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#TripartyAgentCollateralTransactionIdentification
	 * SecuritiesFinancingTransactionDetails33.
	 * TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction49#TripartyAgentCollateralTransactionIdentification
	 * Transaction49.TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction49#TripartyCollateralInstructionIdentification
	 * Transaction49.TripartyCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters28#TripartyAgentCollateralTransactionIdentification
	 * AdditionalParameters28.TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters27#TripartyAgentCollateralTransactionIdentification
	 * AdditionalParameters27.TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters27#TripartyCollateralInstructionIdentification
	 * AdditionalParameters27.TripartyCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails87#TripartyAgentCollateralTransactionIdentification
	 * TransactionDetails87.TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails87#TripartyCollateralInstructionIdentification
	 * TransactionDetails87.TripartyCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction50#TripartyAgentCollateralTransactionIdentification
	 * Transaction50.TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction50#TripartyCollateralInstructionIdentification
	 * Transaction50.TripartyCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction48#TripartyAgentCollateralTransactionIdentification
	 * Transaction48.TripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction48#TripartyCollateralInstructionIdentification
	 * Transaction48.TripartyCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters29#TripartyAgentServiceProviderCollateralTransactionIdentification
	 * AdditionalParameters29.
	 * TripartyAgentServiceProviderCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters29#TripartyAgentServiceProviderCollateralInstructionIdentification
	 * AdditionalParameters29.
	 * TripartyAgentServiceProviderCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters30#TripartyAgentServiceProviderCollateralTransactionIdentification
	 * AdditionalParameters30.
	 * TripartyAgentServiceProviderCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction53#TripartyAgentServiceProviderCollateralTransactionIdentification
	 * Transaction53.
	 * TripartyAgentServiceProviderCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction53#TripartyAgentServiceProviderCollateralInstructionIdentification
	 * Transaction53.
	 * TripartyAgentServiceProviderCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails97#TripartyAgentServiceProviderCollateralTransactionIdentification
	 * TransactionDetails97.
	 * TripartyAgentServiceProviderCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails97#TripartyAgentServiceProviderCollateralInstructionIdentification
	 * TransactionDetails97.
	 * TripartyAgentServiceProviderCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#TripartyAgentServiceProviderCollateralTransactionIdentification
	 * SecuritiesFinancingTransactionDetails35.
	 * TripartyAgentServiceProviderCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction54#TripartyAgentServiceProviderCollateralTransactionIdentification
	 * Transaction54.
	 * TripartyAgentServiceProviderCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction54#TripartyAgentServiceProviderCollateralInstructionIdentification
	 * Transaction54.
	 * TripartyAgentServiceProviderCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction52#TripartyAgentServiceProviderCollateralTransactionIdentification
	 * Transaction52.
	 * TripartyAgentServiceProviderCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction52#TripartyAgentServiceProviderCollateralInstructionIdentification
	 * Transaction52.
	 * TripartyAgentServiceProviderCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters31#TripartyAgentServiceProviderCollateralTransactionIdentification
	 * AdditionalParameters31.
	 * TripartyAgentServiceProviderCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters31#TripartyAgentServiceProviderCollateralInstructionIdentification
	 * AdditionalParameters31.
	 * TripartyAgentServiceProviderCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction57#TripartyAgentServiceProviderCollateralTransactionIdentification
	 * Transaction57.
	 * TripartyAgentServiceProviderCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction57#TripartyAgentServiceProviderCollateralInstructionIdentification
	 * Transaction57.
	 * TripartyAgentServiceProviderCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36#TripartyAgentServiceProviderCollateralTransactionIdentification
	 * SecuritiesFinancingTransactionDetails36.
	 * TripartyAgentServiceProviderCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters32#TripartyAgentServiceProviderCollateralTransactionIdentification
	 * AdditionalParameters32.
	 * TripartyAgentServiceProviderCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction56#TripartyAgentServiceProviderCollateralTransactionIdentification
	 * Transaction56.
	 * TripartyAgentServiceProviderCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction56#TripartyAgentServiceProviderCollateralInstructionIdentification
	 * Transaction56.
	 * TripartyAgentServiceProviderCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails100#TripartyAgentServiceProviderCollateralTransactionIdentification
	 * TransactionDetails100.
	 * TripartyAgentServiceProviderCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails100#TripartyAgentServiceProviderCollateralInstructionIdentification
	 * TransactionDetails100.
	 * TripartyAgentServiceProviderCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction55#TripartyAgentServiceProviderCollateralTransactionIdentification
	 * Transaction55.
	 * TripartyAgentServiceProviderCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction55#TripartyAgentServiceProviderCollateralInstructionIdentification
	 * Transaction55.
	 * TripartyAgentServiceProviderCollateralInstructionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
	 * SecuritiesTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TripartyAgentCollateralTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique reference identifying the triparty collateral management transaction from the triparty agent's point of view."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TripartyAgentCollateralTransactionIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AdditionalParameters2.TripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters6.TripartyAgentCollateralTransactionIdentification, com.tools20022.repository.msg.AdditionalParameters12.TripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters13.TripartyAgentCollateralTransactionIdentification, com.tools20022.repository.msg.AdditionalParameters17.TripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters17.TripartyCollateralInstructionIdentification, com.tools20022.repository.msg.AdditionalParameters20.TripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters20.TripartyCollateralInstructionIdentification, com.tools20022.repository.msg.TransactionDetails5.TripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails9.TripartyAgentCollateralTransactionIdentification, com.tools20022.repository.msg.TransactionDetails22.TripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails23.TripartyAgentCollateralTransactionIdentification, com.tools20022.repository.msg.TransactionDetails36.TripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails47.TripartyAgentCollateralTransactionIdentification, com.tools20022.repository.msg.TransactionDetails53.TripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails53.TripartyCollateralInstructionIdentification, com.tools20022.repository.msg.TransactionDetails58.TripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails58.TripartyCollateralInstructionIdentification, com.tools20022.repository.msg.Transaction7.TripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction8.TripartyAgentCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction9.TripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction10.TripartyAgentCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction14.TripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction12.TripartyAgentCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction15.TripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction16.TripartyAgentCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction20.TripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction19.TripartyAgentCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction23.TripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction22.TripartyAgentCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction28.TripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction28.TripartyCollateralInstructionIdentification, com.tools20022.repository.msg.Transaction27.TripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction27.TripartyCollateralInstructionIdentification, com.tools20022.repository.msg.Transaction30.TripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction30.TripartyCollateralInstructionIdentification, com.tools20022.repository.msg.Transaction31.TripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction31.TripartyCollateralInstructionIdentification, com.tools20022.repository.msg.Transaction6.TripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction11.TripartyAgentCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction13.TripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction17.TripartyAgentCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction18.TripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction21.TripartyAgentCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction29.TripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction29.TripartyCollateralInstructionIdentification, com.tools20022.repository.msg.Transaction32.TripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction32.TripartyCollateralInstructionIdentification, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2.TripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8.TripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters4.TripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6.TripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10.TripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17.TripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18.TripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters5.TripartyAgentCollateralTransactionIdentification, com.tools20022.repository.msg.AdditionalParameters14.TripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters15.TripartyAgentCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction25.TripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails61.TripartyAgentCollateralTransactionIdentification, com.tools20022.repository.msg.TransactionDetails61.TripartyCollateralInstructionIdentification,
					com.tools20022.repository.msg.Transaction34.TripartyAgentCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction34.TripartyCollateralInstructionIdentification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21.TripartyAgentCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction35.TripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction35.TripartyCollateralInstructionIdentification, com.tools20022.repository.msg.Transaction36.TripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction36.TripartyCollateralInstructionIdentification, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22.TripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction38.TripartyAgentCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction38.TripartyCollateralInstructionIdentification,
					com.tools20022.repository.msg.TransactionDetails66.TripartyAgentCollateralTransactionIdentification, com.tools20022.repository.msg.TransactionDetails66.TripartyCollateralInstructionIdentification,
					com.tools20022.repository.msg.Transaction39.TripartyAgentCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction39.TripartyCollateralInstructionIdentification,
					com.tools20022.repository.msg.Transaction37.TripartyAgentCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction37.TripartyCollateralInstructionIdentification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24.TripartyAgentCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction41.TripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction41.TripartyCollateralInstructionIdentification, com.tools20022.repository.msg.TransactionDetails70.TripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails70.TripartyCollateralInstructionIdentification, com.tools20022.repository.msg.Transaction40.TripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction40.TripartyCollateralInstructionIdentification, com.tools20022.repository.msg.Transaction43.TripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction43.TripartyCollateralInstructionIdentification, com.tools20022.repository.msg.TransactionDetails71.TripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails71.TripartyCollateralInstructionIdentification, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25.TripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction42.TripartyAgentCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction42.TripartyCollateralInstructionIdentification,
					com.tools20022.repository.msg.Transaction47.TripartyAgentCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction47.TripartyCollateralInstructionIdentification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26.TripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails79.TripartyAgentCollateralTransactionIdentification, com.tools20022.repository.msg.TransactionDetails79.TripartyCollateralInstructionIdentification,
					com.tools20022.repository.msg.Transaction45.TripartyAgentCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction45.TripartyCollateralInstructionIdentification,
					com.tools20022.repository.msg.Transaction46.TripartyAgentCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction46.TripartyCollateralInstructionIdentification,
					com.tools20022.repository.msg.AdditionalParameters23.TripartyAgentCollateralTransactionIdentification, com.tools20022.repository.msg.AdditionalParameters22.TripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters22.TripartyCollateralInstructionIdentification, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.TripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction49.TripartyAgentCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction49.TripartyCollateralInstructionIdentification,
					com.tools20022.repository.msg.AdditionalParameters28.TripartyAgentCollateralTransactionIdentification, com.tools20022.repository.msg.AdditionalParameters27.TripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters27.TripartyCollateralInstructionIdentification, com.tools20022.repository.msg.TransactionDetails87.TripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails87.TripartyCollateralInstructionIdentification, com.tools20022.repository.msg.Transaction50.TripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction50.TripartyCollateralInstructionIdentification, com.tools20022.repository.msg.Transaction48.TripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction48.TripartyCollateralInstructionIdentification, com.tools20022.repository.msg.AdditionalParameters29.TripartyAgentServiceProviderCollateralTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters29.TripartyAgentServiceProviderCollateralInstructionIdentification,
					com.tools20022.repository.msg.AdditionalParameters30.TripartyAgentServiceProviderCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction53.TripartyAgentServiceProviderCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction53.TripartyAgentServiceProviderCollateralInstructionIdentification,
					com.tools20022.repository.msg.TransactionDetails97.TripartyAgentServiceProviderCollateralTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails97.TripartyAgentServiceProviderCollateralInstructionIdentification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35.TripartyAgentServiceProviderCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction54.TripartyAgentServiceProviderCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction54.TripartyAgentServiceProviderCollateralInstructionIdentification,
					com.tools20022.repository.msg.Transaction52.TripartyAgentServiceProviderCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction52.TripartyAgentServiceProviderCollateralInstructionIdentification,
					com.tools20022.repository.msg.AdditionalParameters31.TripartyAgentServiceProviderCollateralTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters31.TripartyAgentServiceProviderCollateralInstructionIdentification,
					com.tools20022.repository.msg.Transaction57.TripartyAgentServiceProviderCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction57.TripartyAgentServiceProviderCollateralInstructionIdentification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36.TripartyAgentServiceProviderCollateralTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters32.TripartyAgentServiceProviderCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction56.TripartyAgentServiceProviderCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction56.TripartyAgentServiceProviderCollateralInstructionIdentification,
					com.tools20022.repository.msg.TransactionDetails100.TripartyAgentServiceProviderCollateralTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails100.TripartyAgentServiceProviderCollateralInstructionIdentification,
					com.tools20022.repository.msg.Transaction55.TripartyAgentServiceProviderCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction55.TripartyAgentServiceProviderCollateralInstructionIdentification);
			elementContext_lazy = () -> SecuritiesTradeIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TripartyAgentCollateralTransactionIdentification";
			definition = "Unique reference identifying the triparty collateral management transaction from the triparty agent's point of view.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Identification of a basket trade.
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
	 * {@linkplain com.tools20022.repository.msg.Identification2#BasketIdentification
	 * Identification2.BasketIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification7#BasketIdentification
	 * Identification7.BasketIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification6#BasketIdentification
	 * Identification6.BasketIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification5#BasketIdentification
	 * Identification5.BasketIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification8#BasketIdentification
	 * Identification8.BasketIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification11#BasketIdentification
	 * Identification11.BasketIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification13#BasketIdentification
	 * Identification13.BasketIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification9#BasketIdentification
	 * Identification9.BasketIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification3#BasketIdentification
	 * Identification3.BasketIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification15#BasketIdentification
	 * Identification15.BasketIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification24#BasketIdentification
	 * Identification24.BasketIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
	 * SecuritiesTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BasketIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of a basket trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute BasketIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Identification2.BasketIdentification, com.tools20022.repository.msg.Identification7.BasketIdentification,
					com.tools20022.repository.msg.Identification6.BasketIdentification, com.tools20022.repository.msg.Identification5.BasketIdentification, com.tools20022.repository.msg.Identification8.BasketIdentification,
					com.tools20022.repository.msg.Identification11.BasketIdentification, com.tools20022.repository.msg.Identification13.BasketIdentification, com.tools20022.repository.msg.Identification9.BasketIdentification,
					com.tools20022.repository.msg.Identification3.BasketIdentification, com.tools20022.repository.msg.Identification15.BasketIdentification, com.tools20022.repository.msg.Identification24.BasketIdentification);
			elementContext_lazy = () -> SecuritiesTradeIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BasketIdentification";
			definition = "Identification of a basket trade.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Program reference which identifies a program trade.
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
	 * {@linkplain com.tools20022.repository.msg.Identification2#ProgramIdentification
	 * Identification2.ProgramIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification7#ProgramIdentification
	 * Identification7.ProgramIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification6#ProgramIdentification
	 * Identification6.ProgramIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification5#ProgramIdentification
	 * Identification5.ProgramIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification8#ProgramIdentification
	 * Identification8.ProgramIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification11#ProgramIdentification
	 * Identification11.ProgramIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification13#ProgramIdentification
	 * Identification13.ProgramIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification9#ProgramIdentification
	 * Identification9.ProgramIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification3#ProgramIdentification
	 * Identification3.ProgramIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification15#ProgramIdentification
	 * Identification15.ProgramIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification24#ProgramIdentification
	 * Identification24.ProgramIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
	 * SecuritiesTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProgramIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Program reference which identifies a program trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ProgramIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Identification2.ProgramIdentification, com.tools20022.repository.msg.Identification7.ProgramIdentification,
					com.tools20022.repository.msg.Identification6.ProgramIdentification, com.tools20022.repository.msg.Identification5.ProgramIdentification, com.tools20022.repository.msg.Identification8.ProgramIdentification,
					com.tools20022.repository.msg.Identification11.ProgramIdentification, com.tools20022.repository.msg.Identification13.ProgramIdentification, com.tools20022.repository.msg.Identification9.ProgramIdentification,
					com.tools20022.repository.msg.Identification3.ProgramIdentification, com.tools20022.repository.msg.Identification15.ProgramIdentification, com.tools20022.repository.msg.Identification24.ProgramIdentification);
			elementContext_lazy = () -> SecuritiesTradeIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProgramIdentification";
			definition = "Program reference which identifies a program trade.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Reference of the linked message at the trade/block level which identifies
	 * a centrally matched transaction.
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
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference8Choice#BlockIdentification
	 * IdentificationReference8Choice.BlockIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference11Choice#BlockIdentification
	 * IdentificationReference11Choice.BlockIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
	 * SecuritiesTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference of the linked message at the trade/block level which identifies a centrally matched transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute BlockIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.IdentificationReference8Choice.BlockIdentification, com.tools20022.repository.choice.IdentificationReference11Choice.BlockIdentification);
			elementContext_lazy = () -> SecuritiesTradeIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BlockIdentification";
			definition = "Reference of the linked message at the trade/block level which identifies a centrally matched transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Identification at the allocation level.
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
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference8Choice#AllocationIdentification
	 * IdentificationReference8Choice.AllocationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference8Choice#IndividualAllocationIdentification
	 * IdentificationReference8Choice.IndividualAllocationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference8Choice#SecondaryAllocationIdentification
	 * IdentificationReference8Choice.SecondaryAllocationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference11Choice#AllocationIdentification
	 * IdentificationReference11Choice.AllocationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference11Choice#IndividualAllocationIdentification
	 * IdentificationReference11Choice.IndividualAllocationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference11Choice#SecondaryAllocationIdentification
	 * IdentificationReference11Choice.SecondaryAllocationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg8#AllocationIdentification
	 * TradeLeg8.AllocationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg10#AllocationIdentification
	 * TradeLeg10.AllocationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg9#AllocationIdentification
	 * TradeLeg9.AllocationIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
	 * SecuritiesTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllocationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification at the allocation level."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AllocationIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.IdentificationReference8Choice.AllocationIdentification, com.tools20022.repository.choice.IdentificationReference8Choice.IndividualAllocationIdentification,
					com.tools20022.repository.choice.IdentificationReference8Choice.SecondaryAllocationIdentification, com.tools20022.repository.choice.IdentificationReference11Choice.AllocationIdentification,
					com.tools20022.repository.choice.IdentificationReference11Choice.IndividualAllocationIdentification, com.tools20022.repository.choice.IdentificationReference11Choice.SecondaryAllocationIdentification,
					com.tools20022.repository.msg.TradeLeg8.AllocationIdentification, com.tools20022.repository.msg.TradeLeg10.AllocationIdentification, com.tools20022.repository.msg.TradeLeg9.AllocationIdentification);
			elementContext_lazy = () -> SecuritiesTradeIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AllocationIdentification";
			definition = "Identification at the allocation level.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Identification which represents this transaction for compliance purposes.
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
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference8Choice#ComplianceIdentification
	 * IdentificationReference8Choice.ComplianceIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference11Choice#ComplianceIdentification
	 * IdentificationReference11Choice.ComplianceIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderParameters1#ComplianceIdentification
	 * OrderParameters1.ComplianceIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
	 * SecuritiesTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ComplianceIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification which represents this transaction for compliance purposes."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ComplianceIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.IdentificationReference8Choice.ComplianceIdentification, com.tools20022.repository.choice.IdentificationReference11Choice.ComplianceIdentification,
					com.tools20022.repository.msg.OrderParameters1.ComplianceIdentification);
			elementContext_lazy = () -> SecuritiesTradeIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ComplianceIdentification";
			definition = "Identification which represents this transaction for compliance purposes.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Identification given by the central securities depository to the
	 * transaction.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
	 * SecuritiesTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSDTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification given by the central securities depository  to the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CSDTransactionIdentification = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesTradeIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CSDTransactionIdentification";
			definition = "Identification given by the central securities depository  to the transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Identification of the transaction assigned by the central counterparty.
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
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation1#CentralCounterpartyTransactionIdentification
	 * SettlementObligation1.CentralCounterpartyTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation6#CentralCounterpartyTransactionIdentification
	 * SettlementObligation6.CentralCounterpartyTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation7#CentralCounterpartyTransactionIdentification
	 * SettlementObligation7.CentralCounterpartyTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
	 * SecuritiesTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CentralCounterpartyTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the transaction assigned by the central counterparty."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CentralCounterpartyTransactionIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementObligation1.CentralCounterpartyTransactionIdentification,
					com.tools20022.repository.msg.SettlementObligation6.CentralCounterpartyTransactionIdentification, com.tools20022.repository.msg.SettlementObligation7.CentralCounterpartyTransactionIdentification);
			elementContext_lazy = () -> SecuritiesTradeIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CentralCounterpartyTransactionIdentification";
			definition = "Identification of the transaction assigned by the central counterparty.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Unambiguous identification of the cancellation request as known by the
	 * instructing party.
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
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference11Choice#CancellationRequestIdentification
	 * IdentificationReference11Choice.CancellationRequestIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder5#CancellationReference
	 * InvestmentFundOrder5.CancellationReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder2#CancellationReference
	 * InvestmentFundOrder2.CancellationReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder6#CancellationReference
	 * InvestmentFundOrder6.CancellationReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder11#CancellationReference
	 * InvestmentFundOrder11.CancellationReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder9#CancellationReference
	 * InvestmentFundOrder9.CancellationReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder8#CancellationReference
	 * InvestmentFundOrder8.CancellationReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
	 * SecuritiesTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationRequestIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the cancellation request as known by the instructing party."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CancellationRequestIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.IdentificationReference11Choice.CancellationRequestIdentification, com.tools20022.repository.msg.InvestmentFundOrder5.CancellationReference,
					com.tools20022.repository.msg.InvestmentFundOrder2.CancellationReference, com.tools20022.repository.msg.InvestmentFundOrder6.CancellationReference,
					com.tools20022.repository.msg.InvestmentFundOrder11.CancellationReference, com.tools20022.repository.msg.InvestmentFundOrder9.CancellationReference,
					com.tools20022.repository.msg.InvestmentFundOrder8.CancellationReference);
			elementContext_lazy = () -> SecuritiesTradeIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CancellationRequestIdentification";
			definition = "Unambiguous identification of the cancellation request as known by the instructing party.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesTradeIdentification";
				definition = "Specifies the different identifications associated with a securities transaction.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesTrade.SecuritiesTradeRelatedIdentifications);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Identification1.Identification, com.tools20022.repository.msg.Identification4.Identification, com.tools20022.repository.msg.Linkages1.Reference,
						com.tools20022.repository.msg.Linkages21.Reference, com.tools20022.repository.msg.Linkages4.Reference, com.tools20022.repository.msg.Linkages22.Reference, com.tools20022.repository.msg.Linkages9.Reference,
						com.tools20022.repository.msg.Linkages14.Reference, com.tools20022.repository.msg.Linkages17.Reference, com.tools20022.repository.msg.Linkages24.Reference, com.tools20022.repository.msg.Linkages3.Reference,
						com.tools20022.repository.msg.Linkages6.Reference, com.tools20022.repository.msg.Linkages10.Reference, com.tools20022.repository.msg.Linkages11.Reference, com.tools20022.repository.msg.Linkages16.Reference,
						com.tools20022.repository.msg.Linkages23.Reference, com.tools20022.repository.msg.Linkages7.Reference, com.tools20022.repository.msg.Linkages12.Reference, com.tools20022.repository.msg.Linkages15.Reference,
						com.tools20022.repository.msg.Linkages18.Reference, com.tools20022.repository.msg.Linkages2.Reference, com.tools20022.repository.msg.Linkages8.Reference, com.tools20022.repository.msg.Linkages5.Reference,
						com.tools20022.repository.msg.Linkages13.Reference, com.tools20022.repository.msg.Linkages19.Reference, com.tools20022.repository.msg.Linkages25.Reference, com.tools20022.repository.msg.Linkages26.Reference,
						com.tools20022.repository.msg.Identification14.Identification, com.tools20022.repository.msg.MessageAndBusinessReference7.Reference, com.tools20022.repository.msg.Linkages36.Reference,
						com.tools20022.repository.msg.Linkages37.Reference, com.tools20022.repository.msg.Linkages38.Reference, com.tools20022.repository.msg.Linkages40.Reference,
						com.tools20022.repository.msg.MessageAndBusinessReference8.Reference, com.tools20022.repository.msg.Linkages43.Reference, com.tools20022.repository.msg.Linkages42.Reference,
						com.tools20022.repository.msg.Identification16.Identification, com.tools20022.repository.msg.Linkages49.Reference, com.tools20022.repository.msg.Linkages48.Reference);
				superType_lazy = () -> TradeIdentification.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesTradeIdentification.IdentifiedTrade,
						com.tools20022.repository.entity.SecuritiesTradeIdentification.MarketInfrastructureTransactionIdentification, com.tools20022.repository.entity.SecuritiesTradeIdentification.ProcessorTransactionIdentification,
						com.tools20022.repository.entity.SecuritiesTradeIdentification.PoolIdentification, com.tools20022.repository.entity.SecuritiesTradeIdentification.CollateralTransactionIdentification,
						com.tools20022.repository.entity.SecuritiesTradeIdentification.ClientTripartyCollateralTransactionIdentification,
						com.tools20022.repository.entity.SecuritiesTradeIdentification.TripartyAgentCollateralTransactionIdentification, com.tools20022.repository.entity.SecuritiesTradeIdentification.BasketIdentification,
						com.tools20022.repository.entity.SecuritiesTradeIdentification.ProgramIdentification, com.tools20022.repository.entity.SecuritiesTradeIdentification.BlockIdentification,
						com.tools20022.repository.entity.SecuritiesTradeIdentification.AllocationIdentification, com.tools20022.repository.entity.SecuritiesTradeIdentification.ComplianceIdentification,
						com.tools20022.repository.entity.SecuritiesTradeIdentification.CSDTransactionIdentification, com.tools20022.repository.entity.SecuritiesTradeIdentification.CentralCounterpartyTransactionIdentification,
						com.tools20022.repository.entity.SecuritiesTradeIdentification.CancellationRequestIdentification);
				derivationComponent_lazy = () -> Arrays.asList(References11.mmObject(), Identification1.mmObject(), TransactionIdentifications3.mmObject(), TransactionIdentifications10.mmObject(), TransactionIdentifications15.mmObject(),
						Identification4.mmObject(), TransactionIdentifications19.mmObject(), References1Choice.mmObject(), Linkages1.mmObject(), Linkages21.mmObject(), References12Choice.mmObject(), Linkages4.mmObject(),
						References28Choice.mmObject(), Linkages22.mmObject(), References5Choice.mmObject(), References11Choice.mmObject(), References19Choice.mmObject(), References21Choice.mmObject(), References27Choice.mmObject(),
						References33Choice.mmObject(), References14Choice.mmObject(), Linkages9.mmObject(), References16Choice.mmObject(), Linkages14.mmObject(), References25Choice.mmObject(), Linkages17.mmObject(),
						References32Choice.mmObject(), Linkages24.mmObject(), References3Choice.mmObject(), References9Choice.mmObject(), References18Choice.mmObject(), References20Choice.mmObject(), References29Choice.mmObject(),
						References37Choice.mmObject(), References38Choice.mmObject(), References1.mmObject(), References6Choice.mmObject(), Linkages3.mmObject(), References2.mmObject(), References10Choice.mmObject(), Linkages6.mmObject(),
						References7.mmObject(), References13Choice.mmObject(), Linkages10.mmObject(), References8.mmObject(), References15Choice.mmObject(), Linkages11.mmObject(), References9.mmObject(), References24Choice.mmObject(),
						Linkages16.mmObject(), References13.mmObject(), References31Choice.mmObject(), Linkages23.mmObject(), Linkages7.mmObject(), Linkages12.mmObject(), TransactionIdentifications2.mmObject(),
						TransactionIdentifications7.mmObject(), TransactionIdentifications9.mmObject(), TransactionIdentifications13.mmObject(), TransactionIdentifications16.mmObject(), TransactionIdentifications22.mmObject(),
						Identification2.mmObject(), IdentificationReference8Choice.mmObject(), Linkages15.mmObject(), IdentificationReference11Choice.mmObject(), Linkages18.mmObject(), References3.mmObject(),
						MessageAndBusinessReference5.mmObject(), MessageAndBusinessReference2.mmObject(), MessageAndBusinessReference4.mmObject(), MessageAndBusinessReference1.mmObject(), MessageAndBusinessReference6.mmObject(),
						Linkages2.mmObject(), Linkages8.mmObject(), TransactionIdentifications1.mmObject(), Identification7.mmObject(), References4Choice.mmObject(), TransactionIdentifications4.mmObject(), References22Choice.mmObject(),
						TransactionIdentifications11.mmObject(), References2Choice.mmObject(), Identification6.mmObject(), TransactionIdentifications6.mmObject(), TransactionIdentification2.mmObject(),
						TransactionIdentification3.mmObject(), TransactionIdentifications18.mmObject(), TransactionIdentifications20.mmObject(), Identification5.mmObject(), Identification8.mmObject(), Identification11.mmObject(),
						Identification13.mmObject(), References8Choice.mmObject(), References17Choice.mmObject(), References7Choice.mmObject(), TransactionIdentifications8.mmObject(), References23Choice.mmObject(),
						TransactionIdentifications14.mmObject(), TransactionIdentifications17.mmObject(), References30Choice.mmObject(), TransactionIdentifications23.mmObject(), Identification9.mmObject(), Linkages5.mmObject(),
						Linkages13.mmObject(), Linkages19.mmObject(), Linkages25.mmObject(), TransactionIdentifications5.mmObject(), TransactionIdentifications12.mmObject(), References34Choice.mmObject(), Linkages26.mmObject(),
						References14.mmObject(), References36Choice.mmObject(), References35Choice.mmObject(), TransactionIdentifications24.mmObject(), Identification14.mmObject(), Identification3.mmObject(), References15.mmObject(),
						MessageAndBusinessReference7.mmObject(), References39Choice.mmObject(), TransactionIdentifications25.mmObject(), References16.mmObject(), TransactionIdentifications26.mmObject(), References17.mmObject(),
						Linkages36.mmObject(), References45Choice.mmObject(), TransactionIdentification6.mmObject(), TransactionIdentifications29.mmObject(), Linkages37.mmObject(), TransactionIdentifications31.mmObject(),
						TransactionIdentifications33.mmObject(), References43Choice.mmObject(), TransactionIdentifications30.mmObject(), TransactionIdentifications32.mmObject(), Linkages38.mmObject(), References46Choice.mmObject(),
						Identification15.mmObject(), References41Choice.mmObject(), References44Choice.mmObject(), Linkages40.mmObject(), References47Choice.mmObject(), References42Choice.mmObject(), References18.mmObject(),
						References20.mmObject(), MessageAndBusinessReference8.mmObject(), References48Choice.mmObject(), Linkages43.mmObject(), TransactionIdentifications35.mmObject(), References60Choice.mmObject(),
						TransactionIdentifications39.mmObject(), TransactionIdentification7.mmObject(), TransactionIdentifications37.mmObject(), References53Choice.mmObject(), Linkages42.mmObject(), Identification16.mmObject(),
						TransactionIdentifications34.mmObject(), TransactionIdentifications38.mmObject(), References58Choice.mmObject(), Identification24.mmObject(), References50Choice.mmObject(), References51Choice.mmObject(),
						References21.mmObject(), Linkages49.mmObject(), Linkages48.mmObject(), References59Choice.mmObject(), References54Choice.mmObject(), MessageAndBusinessReference10.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}