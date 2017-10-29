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
import com.tools20022.repository.codeset.RepurchaseTypeCode;
import com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.SecuritiesTrade;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Process of lending or borrowing cash or securities against securities or cash
 * collateral. It aims at optimising liquidity, support a trading strategy, or
 * increase settlement efficiency.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesFinancing" src="doc-files/SecuritiesFinancing.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#ReturnLegInstruction
 * SecuritiesFinancing.ReturnLegInstruction}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesFinancing#Type
 * SecuritiesFinancing.Type}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#TerminationDateTime
 * SecuritiesFinancing.TerminationDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#RateChangeDateTime
 * SecuritiesFinancing.RateChangeDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#RevaluationIndicator
 * SecuritiesFinancing.RevaluationIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#InterestPayment
 * SecuritiesFinancing.InterestPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#VariableRateSupport
 * SecuritiesFinancing.VariableRateSupport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#RepurchaseRate
 * SecuritiesFinancing.RepurchaseRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#StockLoanMargin
 * SecuritiesFinancing.StockLoanMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#Interest
 * SecuritiesFinancing.Interest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#RepurchaseSpread
 * SecuritiesFinancing.RepurchaseSpread}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#TransactionCallDelay
 * SecuritiesFinancing.TransactionCallDelay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#TotalNumberOfCollateralInstructions
 * SecuritiesFinancing.TotalNumberOfCollateralInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#DealAmount
 * SecuritiesFinancing.DealAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#ForfeitRepurchaseAmount
 * SecuritiesFinancing.ForfeitRepurchaseAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#PremiumAmount
 * SecuritiesFinancing.PremiumAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#TerminationAmountPerPieceOfCollateral
 * SecuritiesFinancing.TerminationAmountPerPieceOfCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#TerminationTransactionAmount
 * SecuritiesFinancing.TerminationTransactionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#MaturityDateModification
 * SecuritiesFinancing.MaturityDateModification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#EarliestCallBackDate
 * SecuritiesFinancing.EarliestCallBackDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#OpeningSettlementDate
 * SecuritiesFinancing.OpeningSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#RepurchaseType
 * SecuritiesFinancing.RepurchaseType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#EndPrice
 * SecuritiesFinancing.EndPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#SpreadTransaction
 * SecuritiesFinancing.SpreadTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#FinancingAgreement
 * SecuritiesFinancing.FinancingAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#OpeningSettlementAmount
 * SecuritiesFinancing.OpeningSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#ClosingLegExecution
 * SecuritiesFinancing.ClosingLegExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#OpeningLegExecution
 * SecuritiesFinancing.OpeningLegExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#RelatedIndicationOfInterest
 * SecuritiesFinancing.RelatedIndicationOfInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#Identification
 * SecuritiesFinancing.Identification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#RelatedSecuritiesFinancing
 * SecuritiesPricing.RelatedSecuritiesFinancing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#SecuritiesFinancingClosingData
 * SecuritiesTrade.SecuritiesFinancingClosingData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#SecuritiesFinancingOpeningData
 * SecuritiesTrade.SecuritiesFinancingOpeningData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#SecuritiesFinancing
 * Interest.SecuritiesFinancing}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Spread#SecuritiesFinancing
 * Spread.SecuritiesFinancing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancingAgreement#SecuritiesFinancingTrade
 * SecuritiesFinancingAgreement.SecuritiesFinancingTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest#TwoLegTransaction
 * BuyOrSellIndicationOfInterest.TwoLegTransaction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TwoLegTransactionType1Choice#SecuritiesFinancingDetails
 * TwoLegTransactionType1Choice.SecuritiesFinancingDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TwoLegTransactionDetails1#OtherAmounts
 * TwoLegTransactionDetails1.OtherAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TwoLegTransactionDetails1#TwoLegTransactionType
 * TwoLegTransactionDetails1.TwoLegTransactionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleQuote1#TwoLegTransactionDetails
 * SingleQuote1.TwoLegTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleOrder1#TwoLegTransactionDetails
 * SingleOrder1.TwoLegTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Order11#TwoLegTransactionDetails
 * Order11.TwoLegTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuoteRequest1#TwoLegTransactionDetails
 * QuoteRequest1.TwoLegTransactionDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesLending
 * SecuritiesLending}</li>
 * <li>{@linkplain com.tools20022.repository.entity.RepurchaseAgreement
 * RepurchaseAgreement}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.SecuritiesTrade
 * SecuritiesTrade}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails6
 * SecuritiesTradeDetails6}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RevaluationIndicator1Choice
 * RevaluationIndicator1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3
 * SecuritiesFinancingTransactionDetails3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails13
 * SecuritiesTradeDetails13}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RevaluationIndicator2Choice
 * RevaluationIndicator2Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5
 * SecuritiesFinancingTransactionDetails5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1
 * SecuritiesFinancingTransactionDetails1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11
 * SecuritiesFinancingTransactionDetails11}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14
 * SecuritiesFinancingTransactionDetails14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails3
 * SecuritiesTradeDetails3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails11
 * SecuritiesTradeDetails11}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4
 * SecuritiesFinancingTransactionDetails4}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RepurchaseType3Choice
 * RepurchaseType3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RepurchaseType6Choice
 * RepurchaseType6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RepurchaseType1Choice
 * RepurchaseType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RepurchaseType4Choice
 * RepurchaseType4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RepurchaseType11Choice
 * RepurchaseType11Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ClosingDate1Choice
 * ClosingDate1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Revaluation2Choice
 * Revaluation2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesFinancing10
 * SecuritiesFinancing10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TwoLegTransactionDetails1
 * TwoLegTransactionDetails1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RepurchaseType2Choice
 * RepurchaseType2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails5
 * SecuritiesTradeDetails5}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RepurchaseType7Choice
 * RepurchaseType7Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2
 * SecuritiesFinancingTransactionDetails2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8
 * SecuritiesFinancingTransactionDetails8}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails7
 * SecuritiesFinancingTransactionDetails7}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RepurchaseType8Choice
 * RepurchaseType8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RepurchaseType5Choice
 * RepurchaseType5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails12
 * SecuritiesTradeDetails12}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RepurchaseType9Choice
 * RepurchaseType9Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19
 * SecuritiesFinancingTransactionDetails19}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20
 * SecuritiesFinancingTransactionDetails20}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6
 * SecuritiesFinancingTransactionDetails6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10
 * SecuritiesFinancingTransactionDetails10}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17
 * SecuritiesFinancingTransactionDetails17}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18
 * SecuritiesFinancingTransactionDetails18}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9
 * SecuritiesFinancingTransactionDetails9}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RepurchaseType10Choice
 * RepurchaseType10Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Revaluation1Choice
 * Revaluation1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesFinancing1
 * SecuritiesFinancing1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21
 * SecuritiesFinancingTransactionDetails21}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails38
 * SecuritiesTradeDetails38}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails37
 * SecuritiesTradeDetails37}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails39
 * SecuritiesTradeDetails39}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22
 * SecuritiesFinancingTransactionDetails22}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails40
 * SecuritiesTradeDetails40}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24
 * SecuritiesFinancingTransactionDetails24}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25
 * SecuritiesFinancingTransactionDetails25}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26
 * SecuritiesFinancingTransactionDetails26}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28
 * SecuritiesFinancingTransactionDetails28}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails55
 * SecuritiesTradeDetails55}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails56
 * SecuritiesTradeDetails56}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27
 * SecuritiesFinancingTransactionDetails27}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails29
 * SecuritiesFinancingTransactionDetails29}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RevaluationIndicator3Choice
 * RevaluationIndicator3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RepurchaseType15Choice
 * RepurchaseType15Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RepurchaseType12Choice
 * RepurchaseType12Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RepurchaseType13Choice
 * RepurchaseType13Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RepurchaseType14Choice
 * RepurchaseType14Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails59
 * SecuritiesTradeDetails59}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33
 * SecuritiesFinancingTransactionDetails33}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32
 * SecuritiesFinancingTransactionDetails32}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails58
 * SecuritiesTradeDetails58}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30
 * SecuritiesFinancingTransactionDetails30}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails34
 * SecuritiesFinancingTransactionDetails34}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RevaluationIndicator4Choice
 * RevaluationIndicator4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RepurchaseType19Choice
 * RepurchaseType19Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RepurchaseType16Choice
 * RepurchaseType16Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RepurchaseType17Choice
 * RepurchaseType17Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RepurchaseType20Choice
 * RepurchaseType20Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35
 * SecuritiesFinancingTransactionDetails35}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RepurchaseType22Choice
 * RepurchaseType22Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RepurchaseType21Choice
 * RepurchaseType21Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RepurchaseType23Choice
 * RepurchaseType23Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36
 * SecuritiesFinancingTransactionDetails36}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RepurchaseType31Choice
 * RepurchaseType31Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RepurchaseType24Choice
 * RepurchaseType24Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RepurchaseType26Choice
 * RepurchaseType26Choice}</li>
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
 * "SecuritiesFinancing"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Process of lending or borrowing cash or securities against securities or cash collateral. It aims at optimising liquidity, support a trading strategy, or increase settlement efficiency."
 * </li>
 * </ul>
 */
public class SecuritiesFinancing extends SecuritiesTrade {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies whether, for a securities lending/borrowing settlement
	 * transaction, the lender will instruct the return leg as agreed with the
	 * borrower.
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails50#ReturnLeg
	 * SettlementDetails50.ReturnLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails51#ReturnLeg
	 * SettlementDetails51.ReturnLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails1#ReturnLeg
	 * SettlementDetails1.ReturnLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails19#ReturnLeg
	 * SettlementDetails19.ReturnLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails22#ReturnLeg
	 * SettlementDetails22.ReturnLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails35#ReturnLeg
	 * SettlementDetails35.ReturnLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#ReturnLeg
	 * SettlementDetails42.ReturnLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails52#ReturnLeg
	 * SettlementDetails52.ReturnLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#ReturnLeg
	 * SettlementDetails43.ReturnLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#ReturnLeg
	 * SettlementDetails67.ReturnLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#ReturnLeg
	 * SettlementDetails68.ReturnLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails81#ReturnLeg
	 * SettlementDetails81.ReturnLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails83#ReturnLeg
	 * SettlementDetails83.ReturnLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#ReturnLeg
	 * SettlementDetails93.ReturnLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#ReturnLeg
	 * SettlementDetails94.ReturnLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails101#ReturnLeg
	 * SettlementDetails101.ReturnLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails111#ReturnLeg
	 * SettlementDetails111.ReturnLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails112#ReturnLeg
	 * SettlementDetails112.ReturnLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails113#ReturnLeg
	 * SettlementDetails113.ReturnLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#ReturnLeg
	 * SettlementDetails120.ReturnLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#ReturnLeg
	 * SettlementDetails119.ReturnLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#ReturnLeg
	 * SettlementDetails122.ReturnLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails137#ReturnLeg
	 * SettlementDetails137.ReturnLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails132#ReturnLeg
	 * SettlementDetails132.ReturnLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails138#ReturnLeg
	 * SettlementDetails138.ReturnLeg}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnLegInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether, for a securities lending/borrowing settlement transaction, the lender will instruct the return leg as agreed with the borrower."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ReturnLegInstruction = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementDetails50.ReturnLeg, com.tools20022.repository.msg.SettlementDetails51.ReturnLeg, com.tools20022.repository.msg.SettlementDetails1.ReturnLeg,
					com.tools20022.repository.msg.SettlementDetails19.ReturnLeg, com.tools20022.repository.msg.SettlementDetails22.ReturnLeg, com.tools20022.repository.msg.SettlementDetails35.ReturnLeg,
					com.tools20022.repository.msg.SettlementDetails42.ReturnLeg, com.tools20022.repository.msg.SettlementDetails52.ReturnLeg, com.tools20022.repository.msg.SettlementDetails43.ReturnLeg,
					com.tools20022.repository.msg.SettlementDetails67.ReturnLeg, com.tools20022.repository.msg.SettlementDetails68.ReturnLeg, com.tools20022.repository.msg.SettlementDetails81.ReturnLeg,
					com.tools20022.repository.msg.SettlementDetails83.ReturnLeg, com.tools20022.repository.msg.SettlementDetails93.ReturnLeg, com.tools20022.repository.msg.SettlementDetails94.ReturnLeg,
					com.tools20022.repository.msg.SettlementDetails101.ReturnLeg, com.tools20022.repository.msg.SettlementDetails111.ReturnLeg, com.tools20022.repository.msg.SettlementDetails112.ReturnLeg,
					com.tools20022.repository.msg.SettlementDetails113.ReturnLeg, com.tools20022.repository.msg.SettlementDetails120.ReturnLeg, com.tools20022.repository.msg.SettlementDetails119.ReturnLeg,
					com.tools20022.repository.msg.SettlementDetails122.ReturnLeg, com.tools20022.repository.msg.SettlementDetails137.ReturnLeg, com.tools20022.repository.msg.SettlementDetails132.ReturnLeg,
					com.tools20022.repository.msg.SettlementDetails138.ReturnLeg);
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReturnLegInstruction";
			definition = "Specifies whether, for a securities lending/borrowing settlement transaction, the lender will instruct the return leg as agreed with the borrower.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Specifies the type of securities financing transaction, that is,
	 * repurchase agreement, reverse repurchase agreement, securities lending or
	 * securities borrowing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code
	 * SecuritiesTransactionTypeV2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of securities financing transaction, that is, repurchase agreement, reverse repurchase agreement, securities lending or securities borrowing."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Specifies the type of securities financing transaction, that is, repurchase agreement, reverse repurchase agreement, securities lending or securities borrowing.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> SecuritiesTransactionTypeV2Code.mmObject();
		}
	};
	/**
	 * Closing date/time or maturity date/time of the repo transaction.
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3#TerminationDate
	 * SecuritiesFinancingTransactionDetails3.TerminationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5#TerminationDate
	 * SecuritiesFinancingTransactionDetails5.TerminationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1#TerminationDate
	 * SecuritiesFinancingTransactionDetails1.TerminationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11#TerminationDate
	 * SecuritiesFinancingTransactionDetails11.TerminationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14#TerminationDate
	 * SecuritiesFinancingTransactionDetails14.TerminationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4#TerminationDate
	 * SecuritiesFinancingTransactionDetails4.TerminationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TwoLegTransactionDetails1#ClosingDate
	 * TwoLegTransactionDetails1.ClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2#TerminationDate
	 * SecuritiesFinancingTransactionDetails2.TerminationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8#TerminationDate
	 * SecuritiesFinancingTransactionDetails8.TerminationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails7#TerminationDate
	 * SecuritiesFinancingTransactionDetails7.TerminationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#TerminationDate
	 * SecuritiesFinancingTransactionDetails19.TerminationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#TerminationDate
	 * SecuritiesFinancingTransactionDetails20.TerminationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6#TerminationDate
	 * SecuritiesFinancingTransactionDetails6.TerminationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10#TerminationDate
	 * SecuritiesFinancingTransactionDetails10.TerminationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17#TerminationDate
	 * SecuritiesFinancingTransactionDetails17.TerminationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18#TerminationDate
	 * SecuritiesFinancingTransactionDetails18.TerminationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9#TerminationDate
	 * SecuritiesFinancingTransactionDetails9.TerminationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1#TerminationDateTime
	 * SecuritiesFinancing1.TerminationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21#TerminationDate
	 * SecuritiesFinancingTransactionDetails21.TerminationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22#TerminationDate
	 * SecuritiesFinancingTransactionDetails22.TerminationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24#TerminationDate
	 * SecuritiesFinancingTransactionDetails24.TerminationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25#TerminationDate
	 * SecuritiesFinancingTransactionDetails25.TerminationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#TerminationDate
	 * SecuritiesFinancingTransactionDetails26.TerminationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28#TerminationDate
	 * SecuritiesFinancingTransactionDetails28.TerminationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#TerminationDate
	 * SecuritiesFinancingTransactionDetails27.TerminationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails29#TerminationDate
	 * SecuritiesFinancingTransactionDetails29.TerminationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#TerminationDate
	 * SecuritiesFinancingTransactionDetails33.TerminationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32#TerminationDate
	 * SecuritiesFinancingTransactionDetails32.TerminationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30#TerminationDate
	 * SecuritiesFinancingTransactionDetails30.TerminationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails34#TerminationDate
	 * SecuritiesFinancingTransactionDetails34.TerminationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#TerminationDate
	 * SecuritiesFinancingTransactionDetails35.TerminationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36#TerminationDate
	 * SecuritiesFinancingTransactionDetails36.TerminationDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminationDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Closing date/time or maturity date/time of the repo transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TerminationDateTime = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3.TerminationDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5.TerminationDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1.TerminationDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11.TerminationDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14.TerminationDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4.TerminationDate,
					com.tools20022.repository.msg.TwoLegTransactionDetails1.ClosingDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2.TerminationDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8.TerminationDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails7.TerminationDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.TerminationDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20.TerminationDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6.TerminationDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10.TerminationDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17.TerminationDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18.TerminationDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9.TerminationDate, com.tools20022.repository.msg.SecuritiesFinancing1.TerminationDateTime,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21.TerminationDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22.TerminationDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24.TerminationDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25.TerminationDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26.TerminationDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28.TerminationDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27.TerminationDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails29.TerminationDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.TerminationDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32.TerminationDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30.TerminationDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails34.TerminationDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35.TerminationDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36.TerminationDate);
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TerminationDateTime";
			definition = "Closing date/time or maturity date/time of the repo transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date/Time at which rate change has taken place.
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3#RateChangeDate
	 * SecuritiesFinancingTransactionDetails3.RateChangeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5#RateChangeDate
	 * SecuritiesFinancingTransactionDetails5.RateChangeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1#RateChangeDate
	 * SecuritiesFinancingTransactionDetails1.RateChangeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11#RateChangeDate
	 * SecuritiesFinancingTransactionDetails11.RateChangeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14#RateChangeDate
	 * SecuritiesFinancingTransactionDetails14.RateChangeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4#RateChangeDate
	 * SecuritiesFinancingTransactionDetails4.RateChangeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#RateChangeDate
	 * SecuritiesFinancing10.RateChangeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2#RateChangeDate
	 * SecuritiesFinancingTransactionDetails2.RateChangeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8#RateChangeDate
	 * SecuritiesFinancingTransactionDetails8.RateChangeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#RateChangeDate
	 * SecuritiesFinancingTransactionDetails19.RateChangeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#RateChangeDate
	 * SecuritiesFinancingTransactionDetails20.RateChangeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6#RateChangeDate
	 * SecuritiesFinancingTransactionDetails6.RateChangeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10#RateChangeDate
	 * SecuritiesFinancingTransactionDetails10.RateChangeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17#RateChangeDate
	 * SecuritiesFinancingTransactionDetails17.RateChangeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18#RateChangeDate
	 * SecuritiesFinancingTransactionDetails18.RateChangeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1#RateChangeDateTime
	 * SecuritiesFinancing1.RateChangeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21#RateChangeDate
	 * SecuritiesFinancingTransactionDetails21.RateChangeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22#RateChangeDate
	 * SecuritiesFinancingTransactionDetails22.RateChangeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24#RateChangeDate
	 * SecuritiesFinancingTransactionDetails24.RateChangeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25#RateChangeDate
	 * SecuritiesFinancingTransactionDetails25.RateChangeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#RateChangeDate
	 * SecuritiesFinancingTransactionDetails26.RateChangeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28#RateChangeDate
	 * SecuritiesFinancingTransactionDetails28.RateChangeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#RateChangeDate
	 * SecuritiesFinancingTransactionDetails27.RateChangeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#RateChangeDate
	 * SecuritiesFinancingTransactionDetails33.RateChangeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32#RateChangeDate
	 * SecuritiesFinancingTransactionDetails32.RateChangeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30#RateChangeDate
	 * SecuritiesFinancingTransactionDetails30.RateChangeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#RateChangeDate
	 * SecuritiesFinancingTransactionDetails35.RateChangeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36#RateChangeDate
	 * SecuritiesFinancingTransactionDetails36.RateChangeDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateChangeDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/Time at which rate change has taken place."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RateChangeDateTime = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3.RateChangeDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5.RateChangeDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1.RateChangeDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11.RateChangeDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14.RateChangeDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4.RateChangeDate,
					com.tools20022.repository.msg.SecuritiesFinancing10.RateChangeDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2.RateChangeDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8.RateChangeDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.RateChangeDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20.RateChangeDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6.RateChangeDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10.RateChangeDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17.RateChangeDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18.RateChangeDate, com.tools20022.repository.msg.SecuritiesFinancing1.RateChangeDateTime,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21.RateChangeDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22.RateChangeDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24.RateChangeDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25.RateChangeDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26.RateChangeDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28.RateChangeDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27.RateChangeDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.RateChangeDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32.RateChangeDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30.RateChangeDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35.RateChangeDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36.RateChangeDate);
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RateChangeDateTime";
			definition = "Date/Time at which rate change has taken place.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Specifies whether the collateral position should be subject to automatic
	 * revaluation by the account servicer.
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
	 * {@linkplain com.tools20022.repository.choice.RevaluationIndicator1Choice#Indicator
	 * RevaluationIndicator1Choice.Indicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RevaluationIndicator1Choice#Proprietary
	 * RevaluationIndicator1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3#Revaluation
	 * SecuritiesFinancingTransactionDetails3.Revaluation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RevaluationIndicator2Choice#Indicator
	 * RevaluationIndicator2Choice.Indicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RevaluationIndicator2Choice#Proprietary
	 * RevaluationIndicator2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5#Revaluation
	 * SecuritiesFinancingTransactionDetails5.Revaluation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1#Revaluation
	 * SecuritiesFinancingTransactionDetails1.Revaluation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11#Revaluation
	 * SecuritiesFinancingTransactionDetails11.Revaluation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14#Revaluation
	 * SecuritiesFinancingTransactionDetails14.Revaluation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4#Revaluation
	 * SecuritiesFinancingTransactionDetails4.Revaluation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Revaluation2Choice#Indicator
	 * Revaluation2Choice.Indicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Revaluation2Choice#Proprietary
	 * Revaluation2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#Revaluation
	 * SecuritiesFinancing10.Revaluation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#Revaluation
	 * SecuritiesFinancingTransactionDetails19.Revaluation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#Revaluation
	 * SecuritiesFinancingTransactionDetails20.Revaluation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Revaluation1Choice#Indicator
	 * Revaluation1Choice.Indicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Revaluation1Choice#Proprietary
	 * Revaluation1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1#RevaluationIndicator
	 * SecuritiesFinancing1.RevaluationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28#Revaluation
	 * SecuritiesFinancingTransactionDetails28.Revaluation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#Revaluation
	 * SecuritiesFinancingTransactionDetails27.Revaluation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RevaluationIndicator3Choice#Indicator
	 * RevaluationIndicator3Choice.Indicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RevaluationIndicator3Choice#Proprietary
	 * RevaluationIndicator3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32#Revaluation
	 * SecuritiesFinancingTransactionDetails32.Revaluation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30#Revaluation
	 * SecuritiesFinancingTransactionDetails30.Revaluation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RevaluationIndicator4Choice#Indicator
	 * RevaluationIndicator4Choice.Indicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RevaluationIndicator4Choice#Proprietary
	 * RevaluationIndicator4Choice.Proprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RevaluationIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the collateral position should be subject to automatic revaluation by the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RevaluationIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.RevaluationIndicator1Choice.Indicator, com.tools20022.repository.choice.RevaluationIndicator1Choice.Proprietary,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3.Revaluation, com.tools20022.repository.choice.RevaluationIndicator2Choice.Indicator,
					com.tools20022.repository.choice.RevaluationIndicator2Choice.Proprietary, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5.Revaluation,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1.Revaluation, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11.Revaluation,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14.Revaluation, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4.Revaluation,
					com.tools20022.repository.choice.Revaluation2Choice.Indicator, com.tools20022.repository.choice.Revaluation2Choice.Proprietary, com.tools20022.repository.msg.SecuritiesFinancing10.Revaluation,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.Revaluation, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20.Revaluation,
					com.tools20022.repository.choice.Revaluation1Choice.Indicator, com.tools20022.repository.choice.Revaluation1Choice.Proprietary, com.tools20022.repository.msg.SecuritiesFinancing1.RevaluationIndicator,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28.Revaluation, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27.Revaluation,
					com.tools20022.repository.choice.RevaluationIndicator3Choice.Indicator, com.tools20022.repository.choice.RevaluationIndicator3Choice.Proprietary,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32.Revaluation, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30.Revaluation,
					com.tools20022.repository.choice.RevaluationIndicator4Choice.Indicator, com.tools20022.repository.choice.RevaluationIndicator4Choice.Proprietary);
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RevaluationIndicator";
			definition = "Specifies whether the collateral position should be subject to automatic revaluation by the account servicer.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Specifies whether the interest is to be paid to the collateral taker. If
	 * set to no, the interest is paid to the collateral giver.
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3#InterestPayment
	 * SecuritiesFinancingTransactionDetails3.InterestPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5#InterestPayment
	 * SecuritiesFinancingTransactionDetails5.InterestPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1#InterestPayment
	 * SecuritiesFinancingTransactionDetails1.InterestPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11#InterestPayment
	 * SecuritiesFinancingTransactionDetails11.InterestPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14#InterestPayment
	 * SecuritiesFinancingTransactionDetails14.InterestPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4#InterestPayment
	 * SecuritiesFinancingTransactionDetails4.InterestPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails7#InterestPayment
	 * SecuritiesFinancingTransactionDetails7.InterestPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#InterestPayment
	 * SecuritiesFinancingTransactionDetails19.InterestPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#InterestPayment
	 * SecuritiesFinancingTransactionDetails20.InterestPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9#InterestPayment
	 * SecuritiesFinancingTransactionDetails9.InterestPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28#InterestPayment
	 * SecuritiesFinancingTransactionDetails28.InterestPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#InterestPayment
	 * SecuritiesFinancingTransactionDetails27.InterestPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails29#InterestPayment
	 * SecuritiesFinancingTransactionDetails29.InterestPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32#InterestPayment
	 * SecuritiesFinancingTransactionDetails32.InterestPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30#InterestPayment
	 * SecuritiesFinancingTransactionDetails30.InterestPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails34#InterestPayment
	 * SecuritiesFinancingTransactionDetails34.InterestPayment}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the interest is to be paid to the collateral taker. If set to no, the interest is paid to the collateral giver."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute InterestPayment = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3.InterestPayment, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5.InterestPayment,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1.InterestPayment, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11.InterestPayment,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14.InterestPayment, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4.InterestPayment,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails7.InterestPayment, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.InterestPayment,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20.InterestPayment, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9.InterestPayment,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28.InterestPayment, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27.InterestPayment,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails29.InterestPayment, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32.InterestPayment,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30.InterestPayment, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails34.InterestPayment);
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InterestPayment";
			definition = "Specifies whether the interest is to be paid to the collateral taker. If set to no, the interest is paid to the collateral giver.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Index or support rate used together with the spread to calculate the
	 * repurchase rate.
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3#VariableRateSupport
	 * SecuritiesFinancingTransactionDetails3.VariableRateSupport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5#VariableRateSupport
	 * SecuritiesFinancingTransactionDetails5.VariableRateSupport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1#VariableRateSupport
	 * SecuritiesFinancingTransactionDetails1.VariableRateSupport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11#VariableRateSupport
	 * SecuritiesFinancingTransactionDetails11.VariableRateSupport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14#VariableRateSupport
	 * SecuritiesFinancingTransactionDetails14.VariableRateSupport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4#VariableRateSupport
	 * SecuritiesFinancingTransactionDetails4.VariableRateSupport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#VariableRateSupport
	 * SecuritiesFinancing10.VariableRateSupport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2#VariableRateSupport
	 * SecuritiesFinancingTransactionDetails2.VariableRateSupport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8#VariableRateSupport
	 * SecuritiesFinancingTransactionDetails8.VariableRateSupport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails7#VariableRateSupport
	 * SecuritiesFinancingTransactionDetails7.VariableRateSupport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#VariableRateSupport
	 * SecuritiesFinancingTransactionDetails19.VariableRateSupport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#VariableRateSupport
	 * SecuritiesFinancingTransactionDetails20.VariableRateSupport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6#VariableRateSupport
	 * SecuritiesFinancingTransactionDetails6.VariableRateSupport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10#VariableRateSupport
	 * SecuritiesFinancingTransactionDetails10.VariableRateSupport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17#VariableRateSupport
	 * SecuritiesFinancingTransactionDetails17.VariableRateSupport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18#VariableRateSupport
	 * SecuritiesFinancingTransactionDetails18.VariableRateSupport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9#VariableRateSupport
	 * SecuritiesFinancingTransactionDetails9.VariableRateSupport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1#VariableRateSupport
	 * SecuritiesFinancing1.VariableRateSupport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21#VariableRateSupport
	 * SecuritiesFinancingTransactionDetails21.VariableRateSupport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22#VariableRateSupport
	 * SecuritiesFinancingTransactionDetails22.VariableRateSupport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24#VariableRateSupport
	 * SecuritiesFinancingTransactionDetails24.VariableRateSupport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25#VariableRateSupport
	 * SecuritiesFinancingTransactionDetails25.VariableRateSupport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#VariableRateSupport
	 * SecuritiesFinancingTransactionDetails26.VariableRateSupport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28#VariableRateSupport
	 * SecuritiesFinancingTransactionDetails28.VariableRateSupport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#VariableRateSupport
	 * SecuritiesFinancingTransactionDetails27.VariableRateSupport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails29#VariableRateSupport
	 * SecuritiesFinancingTransactionDetails29.VariableRateSupport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#VariableRateSupport
	 * SecuritiesFinancingTransactionDetails33.VariableRateSupport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32#VariableRateSupport
	 * SecuritiesFinancingTransactionDetails32.VariableRateSupport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30#VariableRateSupport
	 * SecuritiesFinancingTransactionDetails30.VariableRateSupport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails34#VariableRateSupport
	 * SecuritiesFinancingTransactionDetails34.VariableRateSupport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#VariableRateSupport
	 * SecuritiesFinancingTransactionDetails35.VariableRateSupport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36#VariableRateSupport
	 * SecuritiesFinancingTransactionDetails36.VariableRateSupport}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariableRateSupport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Index or support rate used together with the spread to calculate the repurchase rate."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute VariableRateSupport = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3.VariableRateSupport, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5.VariableRateSupport,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1.VariableRateSupport, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11.VariableRateSupport,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14.VariableRateSupport, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4.VariableRateSupport,
					com.tools20022.repository.msg.SecuritiesFinancing10.VariableRateSupport, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2.VariableRateSupport,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8.VariableRateSupport, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails7.VariableRateSupport,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.VariableRateSupport, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20.VariableRateSupport,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6.VariableRateSupport, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10.VariableRateSupport,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17.VariableRateSupport, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18.VariableRateSupport,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9.VariableRateSupport, com.tools20022.repository.msg.SecuritiesFinancing1.VariableRateSupport,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21.VariableRateSupport, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22.VariableRateSupport,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24.VariableRateSupport, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25.VariableRateSupport,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26.VariableRateSupport, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28.VariableRateSupport,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27.VariableRateSupport, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails29.VariableRateSupport,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.VariableRateSupport, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32.VariableRateSupport,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30.VariableRateSupport, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails34.VariableRateSupport,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35.VariableRateSupport, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36.VariableRateSupport);
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VariableRateSupport";
			definition = "Index or support rate used together with the spread to calculate the repurchase rate.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Rate to be used to recalculate the repurchase amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3#RepurchaseRate
	 * SecuritiesFinancingTransactionDetails3.RepurchaseRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5#RepurchaseRate
	 * SecuritiesFinancingTransactionDetails5.RepurchaseRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1#RepurchaseRate
	 * SecuritiesFinancingTransactionDetails1.RepurchaseRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11#RepurchaseRate
	 * SecuritiesFinancingTransactionDetails11.RepurchaseRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14#RepurchaseRate
	 * SecuritiesFinancingTransactionDetails14.RepurchaseRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4#RepurchaseRate
	 * SecuritiesFinancingTransactionDetails4.RepurchaseRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#RepurchaseRate
	 * SecuritiesFinancing10.RepurchaseRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2#RepurchaseRate
	 * SecuritiesFinancingTransactionDetails2.RepurchaseRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8#RepurchaseRate
	 * SecuritiesFinancingTransactionDetails8.RepurchaseRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails7#RepurchaseRate
	 * SecuritiesFinancingTransactionDetails7.RepurchaseRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#RepurchaseRate
	 * SecuritiesFinancingTransactionDetails19.RepurchaseRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#RepurchaseRate
	 * SecuritiesFinancingTransactionDetails20.RepurchaseRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6#RepurchaseRate
	 * SecuritiesFinancingTransactionDetails6.RepurchaseRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10#RepurchaseRate
	 * SecuritiesFinancingTransactionDetails10.RepurchaseRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17#RepurchaseRate
	 * SecuritiesFinancingTransactionDetails17.RepurchaseRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18#RepurchaseRate
	 * SecuritiesFinancingTransactionDetails18.RepurchaseRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9#RepurchaseRate
	 * SecuritiesFinancingTransactionDetails9.RepurchaseRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1#Repurchase
	 * SecuritiesFinancing1.Repurchase}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21#RepurchaseRate
	 * SecuritiesFinancingTransactionDetails21.RepurchaseRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22#RepurchaseRate
	 * SecuritiesFinancingTransactionDetails22.RepurchaseRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24#RepurchaseRate
	 * SecuritiesFinancingTransactionDetails24.RepurchaseRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25#RepurchaseRate
	 * SecuritiesFinancingTransactionDetails25.RepurchaseRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#RepurchaseRate
	 * SecuritiesFinancingTransactionDetails26.RepurchaseRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28#RepurchaseRate
	 * SecuritiesFinancingTransactionDetails28.RepurchaseRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#RepurchaseRate
	 * SecuritiesFinancingTransactionDetails27.RepurchaseRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails29#RepurchaseRate
	 * SecuritiesFinancingTransactionDetails29.RepurchaseRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#RepurchaseRate
	 * SecuritiesFinancingTransactionDetails33.RepurchaseRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32#RepurchaseRate
	 * SecuritiesFinancingTransactionDetails32.RepurchaseRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30#RepurchaseRate
	 * SecuritiesFinancingTransactionDetails30.RepurchaseRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails34#RepurchaseRate
	 * SecuritiesFinancingTransactionDetails34.RepurchaseRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#RepurchaseRate
	 * SecuritiesFinancingTransactionDetails35.RepurchaseRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36#RepurchaseRate
	 * SecuritiesFinancingTransactionDetails36.RepurchaseRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate to be used to recalculate the repurchase amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RepurchaseRate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3.RepurchaseRate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5.RepurchaseRate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1.RepurchaseRate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11.RepurchaseRate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14.RepurchaseRate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4.RepurchaseRate,
					com.tools20022.repository.msg.SecuritiesFinancing10.RepurchaseRate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2.RepurchaseRate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8.RepurchaseRate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails7.RepurchaseRate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.RepurchaseRate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20.RepurchaseRate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6.RepurchaseRate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10.RepurchaseRate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17.RepurchaseRate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18.RepurchaseRate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9.RepurchaseRate, com.tools20022.repository.msg.SecuritiesFinancing1.Repurchase,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21.RepurchaseRate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22.RepurchaseRate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24.RepurchaseRate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25.RepurchaseRate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26.RepurchaseRate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28.RepurchaseRate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27.RepurchaseRate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails29.RepurchaseRate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.RepurchaseRate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32.RepurchaseRate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30.RepurchaseRate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails34.RepurchaseRate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35.RepurchaseRate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36.RepurchaseRate);
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RepurchaseRate";
			definition = "Rate to be used to recalculate the repurchase amount.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Percentage mark-up on a loan consideration used to reflect the lender's
	 * risk.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3#StockLoanMargin
	 * SecuritiesFinancingTransactionDetails3.StockLoanMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5#StockLoanMargin
	 * SecuritiesFinancingTransactionDetails5.StockLoanMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1#StockLoanMargin
	 * SecuritiesFinancingTransactionDetails1.StockLoanMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11#StockLoanMargin
	 * SecuritiesFinancingTransactionDetails11.StockLoanMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14#StockLoanMargin
	 * SecuritiesFinancingTransactionDetails14.StockLoanMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4#StockLoanMargin
	 * SecuritiesFinancingTransactionDetails4.StockLoanMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#StockLoanMargin
	 * SecuritiesFinancing10.StockLoanMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2#StockLoanMargin
	 * SecuritiesFinancingTransactionDetails2.StockLoanMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8#StockLoanMargin
	 * SecuritiesFinancingTransactionDetails8.StockLoanMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#StockLoanMargin
	 * SecuritiesFinancingTransactionDetails19.StockLoanMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#StockLoanMargin
	 * SecuritiesFinancingTransactionDetails20.StockLoanMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6#StockLoanMargin
	 * SecuritiesFinancingTransactionDetails6.StockLoanMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10#StockLoanMargin
	 * SecuritiesFinancingTransactionDetails10.StockLoanMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17#StockLoanMargin
	 * SecuritiesFinancingTransactionDetails17.StockLoanMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18#StockLoanMargin
	 * SecuritiesFinancingTransactionDetails18.StockLoanMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1#StockLoanMargin
	 * SecuritiesFinancing1.StockLoanMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21#StockLoanMargin
	 * SecuritiesFinancingTransactionDetails21.StockLoanMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22#StockLoanMargin
	 * SecuritiesFinancingTransactionDetails22.StockLoanMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24#StockLoanMargin
	 * SecuritiesFinancingTransactionDetails24.StockLoanMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25#StockLoanMargin
	 * SecuritiesFinancingTransactionDetails25.StockLoanMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#StockLoanMargin
	 * SecuritiesFinancingTransactionDetails26.StockLoanMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28#StockLoanMargin
	 * SecuritiesFinancingTransactionDetails28.StockLoanMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#StockLoanMargin
	 * SecuritiesFinancingTransactionDetails27.StockLoanMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#StockLoanMargin
	 * SecuritiesFinancingTransactionDetails33.StockLoanMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32#StockLoanMargin
	 * SecuritiesFinancingTransactionDetails32.StockLoanMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30#StockLoanMargin
	 * SecuritiesFinancingTransactionDetails30.StockLoanMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#StockLoanMargin
	 * SecuritiesFinancingTransactionDetails35.StockLoanMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36#StockLoanMargin
	 * SecuritiesFinancingTransactionDetails36.StockLoanMargin}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockLoanMargin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage mark-up on a loan consideration used to reflect the lender's risk."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute StockLoanMargin = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3.StockLoanMargin, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5.StockLoanMargin,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1.StockLoanMargin, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11.StockLoanMargin,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14.StockLoanMargin, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4.StockLoanMargin,
					com.tools20022.repository.msg.SecuritiesFinancing10.StockLoanMargin, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2.StockLoanMargin,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8.StockLoanMargin, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.StockLoanMargin,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20.StockLoanMargin, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6.StockLoanMargin,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10.StockLoanMargin, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17.StockLoanMargin,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18.StockLoanMargin, com.tools20022.repository.msg.SecuritiesFinancing1.StockLoanMargin,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21.StockLoanMargin, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22.StockLoanMargin,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24.StockLoanMargin, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25.StockLoanMargin,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26.StockLoanMargin, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28.StockLoanMargin,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27.StockLoanMargin, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.StockLoanMargin,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32.StockLoanMargin, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30.StockLoanMargin,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35.StockLoanMargin, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36.StockLoanMargin);
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StockLoanMargin";
			definition = "Percentage mark-up on a loan consideration used to reflect the lender's risk.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Interest to be paid on the transaction amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Interest#SecuritiesFinancing
	 * Interest.SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Interest Interest}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3#PricingRate
	 * SecuritiesFinancingTransactionDetails3.PricingRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5#PricingRate
	 * SecuritiesFinancingTransactionDetails5.PricingRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1#PricingRate
	 * SecuritiesFinancingTransactionDetails1.PricingRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11#PricingRate
	 * SecuritiesFinancingTransactionDetails11.PricingRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14#PricingRate
	 * SecuritiesFinancingTransactionDetails14.PricingRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4#PricingRate
	 * SecuritiesFinancingTransactionDetails4.PricingRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#PricingRate
	 * SecuritiesFinancing10.PricingRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2#PricingRate
	 * SecuritiesFinancingTransactionDetails2.PricingRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8#PricingRate
	 * SecuritiesFinancingTransactionDetails8.PricingRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#PricingRate
	 * SecuritiesFinancingTransactionDetails19.PricingRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#PricingRate
	 * SecuritiesFinancingTransactionDetails20.PricingRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6#PricingRate
	 * SecuritiesFinancingTransactionDetails6.PricingRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10#PricingRate
	 * SecuritiesFinancingTransactionDetails10.PricingRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17#PricingRate
	 * SecuritiesFinancingTransactionDetails17.PricingRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18#PricingRate
	 * SecuritiesFinancingTransactionDetails18.PricingRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1#Pricing
	 * SecuritiesFinancing1.Pricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21#PricingRate
	 * SecuritiesFinancingTransactionDetails21.PricingRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22#PricingRate
	 * SecuritiesFinancingTransactionDetails22.PricingRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24#PricingRate
	 * SecuritiesFinancingTransactionDetails24.PricingRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25#PricingRate
	 * SecuritiesFinancingTransactionDetails25.PricingRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#PricingRate
	 * SecuritiesFinancingTransactionDetails26.PricingRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28#PricingRate
	 * SecuritiesFinancingTransactionDetails28.PricingRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#PricingRate
	 * SecuritiesFinancingTransactionDetails27.PricingRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#PricingRate
	 * SecuritiesFinancingTransactionDetails33.PricingRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32#PricingRate
	 * SecuritiesFinancingTransactionDetails32.PricingRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30#PricingRate
	 * SecuritiesFinancingTransactionDetails30.PricingRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#PricingRate
	 * SecuritiesFinancingTransactionDetails35.PricingRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36#PricingRate
	 * SecuritiesFinancingTransactionDetails36.PricingRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Interest to be paid on the transaction amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Interest = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3.PricingRate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5.PricingRate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1.PricingRate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11.PricingRate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14.PricingRate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4.PricingRate,
					com.tools20022.repository.msg.SecuritiesFinancing10.PricingRate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2.PricingRate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8.PricingRate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.PricingRate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20.PricingRate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6.PricingRate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10.PricingRate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17.PricingRate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18.PricingRate, com.tools20022.repository.msg.SecuritiesFinancing1.Pricing,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21.PricingRate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22.PricingRate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24.PricingRate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25.PricingRate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26.PricingRate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28.PricingRate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27.PricingRate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.PricingRate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32.PricingRate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30.PricingRate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35.PricingRate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36.PricingRate);
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Interest";
			definition = "Interest to be paid on the transaction amount.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Interest.SecuritiesFinancing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Repurchase spread expressed as a rate; margin over or under an index that
	 * determines the repurchase rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Spread#SecuritiesFinancing
	 * Spread.SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Spread Spread}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3#Spread
	 * SecuritiesFinancingTransactionDetails3.Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5#Spread
	 * SecuritiesFinancingTransactionDetails5.Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1#Spread
	 * SecuritiesFinancingTransactionDetails1.Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11#Spread
	 * SecuritiesFinancingTransactionDetails11.Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14#Spread
	 * SecuritiesFinancingTransactionDetails14.Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4#Spread
	 * SecuritiesFinancingTransactionDetails4.Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2#Spread
	 * SecuritiesFinancingTransactionDetails2.Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8#Spread
	 * SecuritiesFinancingTransactionDetails8.Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#Spread
	 * SecuritiesFinancingTransactionDetails19.Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#Spread
	 * SecuritiesFinancingTransactionDetails20.Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6#Spread
	 * SecuritiesFinancingTransactionDetails6.Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10#Spread
	 * SecuritiesFinancingTransactionDetails10.Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17#Spread
	 * SecuritiesFinancingTransactionDetails17.Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18#Spread
	 * SecuritiesFinancingTransactionDetails18.Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21#Spread
	 * SecuritiesFinancingTransactionDetails21.Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22#Spread
	 * SecuritiesFinancingTransactionDetails22.Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24#Spread
	 * SecuritiesFinancingTransactionDetails24.Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25#Spread
	 * SecuritiesFinancingTransactionDetails25.Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#Spread
	 * SecuritiesFinancingTransactionDetails26.Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28#Spread
	 * SecuritiesFinancingTransactionDetails28.Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#Spread
	 * SecuritiesFinancingTransactionDetails27.Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#Spread
	 * SecuritiesFinancingTransactionDetails33.Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32#Spread
	 * SecuritiesFinancingTransactionDetails32.Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30#Spread
	 * SecuritiesFinancingTransactionDetails30.Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#Spread
	 * SecuritiesFinancingTransactionDetails35.Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36#Spread
	 * SecuritiesFinancingTransactionDetails36.Spread}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseSpread"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Repurchase spread expressed as a rate; margin over or under an index that determines the repurchase rate."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RepurchaseSpread = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3.Spread, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5.Spread,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1.Spread, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11.Spread,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14.Spread, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4.Spread,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2.Spread, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8.Spread,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.Spread, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20.Spread,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6.Spread, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10.Spread,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17.Spread, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18.Spread,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21.Spread, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22.Spread,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24.Spread, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25.Spread,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26.Spread, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28.Spread,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27.Spread, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.Spread,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32.Spread, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30.Spread,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35.Spread, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36.Spread);
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RepurchaseSpread";
			definition = "Repurchase spread expressed as a rate; margin over or under an index that determines the repurchase rate.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Spread.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Spread.SecuritiesFinancing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Minimum number of days' notice a counterparty needs for terminating the
	 * transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max3NumericText
	 * Max3NumericText}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3#TransactionCallDelay
	 * SecuritiesFinancingTransactionDetails3.TransactionCallDelay}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5#TransactionCallDelay
	 * SecuritiesFinancingTransactionDetails5.TransactionCallDelay}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1#TransactionCallDelay
	 * SecuritiesFinancingTransactionDetails1.TransactionCallDelay}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11#TransactionCallDelay
	 * SecuritiesFinancingTransactionDetails11.TransactionCallDelay}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14#TransactionCallDelay
	 * SecuritiesFinancingTransactionDetails14.TransactionCallDelay}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4#TransactionCallDelay
	 * SecuritiesFinancingTransactionDetails4.TransactionCallDelay}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#TransactionCallDelay
	 * SecuritiesFinancing10.TransactionCallDelay}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails7#TransactionCallDelay
	 * SecuritiesFinancingTransactionDetails7.TransactionCallDelay}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#TransactionCallDelay
	 * SecuritiesFinancingTransactionDetails19.TransactionCallDelay}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#TransactionCallDelay
	 * SecuritiesFinancingTransactionDetails20.TransactionCallDelay}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9#TransactionCallDelay
	 * SecuritiesFinancingTransactionDetails9.TransactionCallDelay}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1#TransactionCallDelay
	 * SecuritiesFinancing1.TransactionCallDelay}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28#TransactionCallDelay
	 * SecuritiesFinancingTransactionDetails28.TransactionCallDelay}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#TransactionCallDelay
	 * SecuritiesFinancingTransactionDetails27.TransactionCallDelay}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails29#TransactionCallDelay
	 * SecuritiesFinancingTransactionDetails29.TransactionCallDelay}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32#TransactionCallDelay
	 * SecuritiesFinancingTransactionDetails32.TransactionCallDelay}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30#TransactionCallDelay
	 * SecuritiesFinancingTransactionDetails30.TransactionCallDelay}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails34#TransactionCallDelay
	 * SecuritiesFinancingTransactionDetails34.TransactionCallDelay}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionCallDelay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum number of days' notice a counterparty needs for terminating the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TransactionCallDelay = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3.TransactionCallDelay, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5.TransactionCallDelay,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1.TransactionCallDelay, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11.TransactionCallDelay,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14.TransactionCallDelay, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4.TransactionCallDelay,
					com.tools20022.repository.msg.SecuritiesFinancing10.TransactionCallDelay, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails7.TransactionCallDelay,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.TransactionCallDelay, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20.TransactionCallDelay,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9.TransactionCallDelay, com.tools20022.repository.msg.SecuritiesFinancing1.TransactionCallDelay,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28.TransactionCallDelay, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27.TransactionCallDelay,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails29.TransactionCallDelay, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32.TransactionCallDelay,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30.TransactionCallDelay, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails34.TransactionCallDelay);
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransactionCallDelay";
			definition = "Minimum number of days' notice a counterparty needs for terminating the transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max3NumericText.mmObject();
		}
	};
	/**
	 * Indicates the total Number of collateral instructions involved in the
	 * transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max3NumericText
	 * Max3NumericText}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3#TotalNumberOfCollateralInstructions
	 * SecuritiesFinancingTransactionDetails3.
	 * TotalNumberOfCollateralInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5#TotalNumberOfCollateralInstructions
	 * SecuritiesFinancingTransactionDetails5.
	 * TotalNumberOfCollateralInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1#TotalNumberOfCollateralInstructions
	 * SecuritiesFinancingTransactionDetails1.
	 * TotalNumberOfCollateralInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11#TotalNumberOfCollateralInstructions
	 * SecuritiesFinancingTransactionDetails11.
	 * TotalNumberOfCollateralInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14#TotalNumberOfCollateralInstructions
	 * SecuritiesFinancingTransactionDetails14.
	 * TotalNumberOfCollateralInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4#TotalNumberOfCollateralInstructions
	 * SecuritiesFinancingTransactionDetails4.
	 * TotalNumberOfCollateralInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#TotalNumberOfCollateralInstructions
	 * SecuritiesFinancing10.TotalNumberOfCollateralInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#TotalNumberOfCollateralInstructions
	 * SecuritiesFinancingTransactionDetails19.
	 * TotalNumberOfCollateralInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#TotalNumberOfCollateralInstructions
	 * SecuritiesFinancingTransactionDetails20.
	 * TotalNumberOfCollateralInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1#TotalNumberOfCollateralInstructions
	 * SecuritiesFinancing1.TotalNumberOfCollateralInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28#TotalNumberOfCollateralInstructions
	 * SecuritiesFinancingTransactionDetails28.
	 * TotalNumberOfCollateralInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#TotalNumberOfCollateralInstructions
	 * SecuritiesFinancingTransactionDetails27.
	 * TotalNumberOfCollateralInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32#TotalNumberOfCollateralInstructions
	 * SecuritiesFinancingTransactionDetails32.
	 * TotalNumberOfCollateralInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30#TotalNumberOfCollateralInstructions
	 * SecuritiesFinancingTransactionDetails30.
	 * TotalNumberOfCollateralInstructions}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalNumberOfCollateralInstructions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the total Number of collateral instructions involved in the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TotalNumberOfCollateralInstructions = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3.TotalNumberOfCollateralInstructions,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5.TotalNumberOfCollateralInstructions, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1.TotalNumberOfCollateralInstructions,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11.TotalNumberOfCollateralInstructions, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14.TotalNumberOfCollateralInstructions,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4.TotalNumberOfCollateralInstructions, com.tools20022.repository.msg.SecuritiesFinancing10.TotalNumberOfCollateralInstructions,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.TotalNumberOfCollateralInstructions, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20.TotalNumberOfCollateralInstructions,
					com.tools20022.repository.msg.SecuritiesFinancing1.TotalNumberOfCollateralInstructions, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28.TotalNumberOfCollateralInstructions,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27.TotalNumberOfCollateralInstructions, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32.TotalNumberOfCollateralInstructions,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30.TotalNumberOfCollateralInstructions);
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TotalNumberOfCollateralInstructions";
			definition = "Indicates the total Number of collateral instructions involved in the transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max3NumericText.mmObject();
		}
	};
	/**
	 * Deal amount of the second leg.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3#DealAmount
	 * SecuritiesFinancingTransactionDetails3.DealAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5#DealAmount
	 * SecuritiesFinancingTransactionDetails5.DealAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1#DealAmount
	 * SecuritiesFinancingTransactionDetails1.DealAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11#DealAmount
	 * SecuritiesFinancingTransactionDetails11.DealAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14#DealAmount
	 * SecuritiesFinancingTransactionDetails14.DealAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4#DealAmount
	 * SecuritiesFinancingTransactionDetails4.DealAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#DealAmount
	 * SecuritiesFinancingTransactionDetails19.DealAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#DealAmount
	 * SecuritiesFinancingTransactionDetails20.DealAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1#DealAmount
	 * SecuritiesFinancing1.DealAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28#DealAmount
	 * SecuritiesFinancingTransactionDetails28.DealAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#DealAmount
	 * SecuritiesFinancingTransactionDetails27.DealAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32#DealAmount
	 * SecuritiesFinancingTransactionDetails32.DealAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30#DealAmount
	 * SecuritiesFinancingTransactionDetails30.DealAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DealAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Deal amount of the second leg."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute DealAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3.DealAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5.DealAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1.DealAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11.DealAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14.DealAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4.DealAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.DealAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20.DealAmount,
					com.tools20022.repository.msg.SecuritiesFinancing1.DealAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28.DealAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27.DealAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32.DealAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30.DealAmount);
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DealAmount";
			definition = "Deal amount of the second leg.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Fixed amount which has to be paid (instead of interest) in the case of a
	 * recall.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3#ForfeitAmount
	 * SecuritiesFinancingTransactionDetails3.ForfeitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5#ForfeitAmount
	 * SecuritiesFinancingTransactionDetails5.ForfeitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1#ForfeitAmount
	 * SecuritiesFinancingTransactionDetails1.ForfeitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11#ForfeitAmount
	 * SecuritiesFinancingTransactionDetails11.ForfeitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14#ForfeitAmount
	 * SecuritiesFinancingTransactionDetails14.ForfeitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4#ForfeitAmount
	 * SecuritiesFinancingTransactionDetails4.ForfeitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#ForfeitAmount
	 * SecuritiesFinancing10.ForfeitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#ForfeitAmount
	 * SecuritiesFinancingTransactionDetails19.ForfeitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#ForfeitAmount
	 * SecuritiesFinancingTransactionDetails20.ForfeitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1#ForfeitAmount
	 * SecuritiesFinancing1.ForfeitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28#ForfeitAmount
	 * SecuritiesFinancingTransactionDetails28.ForfeitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#ForfeitAmount
	 * SecuritiesFinancingTransactionDetails27.ForfeitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32#ForfeitAmount
	 * SecuritiesFinancingTransactionDetails32.ForfeitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30#ForfeitAmount
	 * SecuritiesFinancingTransactionDetails30.ForfeitAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForfeitRepurchaseAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Fixed amount which has to be paid (instead of interest) in the case of a recall."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ForfeitRepurchaseAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3.ForfeitAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5.ForfeitAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1.ForfeitAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11.ForfeitAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14.ForfeitAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4.ForfeitAmount,
					com.tools20022.repository.msg.SecuritiesFinancing10.ForfeitAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.ForfeitAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20.ForfeitAmount, com.tools20022.repository.msg.SecuritiesFinancing1.ForfeitAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28.ForfeitAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27.ForfeitAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32.ForfeitAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30.ForfeitAmount);
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ForfeitRepurchaseAmount";
			definition = "Fixed amount which has to be paid (instead of interest) in the case of a recall.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Difference between the cash amount of the first leg and the cash amount
	 * of the second leg of the repurchase agreement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3#PremiumAmount
	 * SecuritiesFinancingTransactionDetails3.PremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5#PremiumAmount
	 * SecuritiesFinancingTransactionDetails5.PremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1#PremiumAmount
	 * SecuritiesFinancingTransactionDetails1.PremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11#PremiumAmount
	 * SecuritiesFinancingTransactionDetails11.PremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14#PremiumAmount
	 * SecuritiesFinancingTransactionDetails14.PremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4#PremiumAmount
	 * SecuritiesFinancingTransactionDetails4.PremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#PremiumAmount
	 * SecuritiesFinancing10.PremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#PremiumAmount
	 * SecuritiesFinancingTransactionDetails19.PremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#PremiumAmount
	 * SecuritiesFinancingTransactionDetails20.PremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1#PremiumAmount
	 * SecuritiesFinancing1.PremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28#PremiumAmount
	 * SecuritiesFinancingTransactionDetails28.PremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#PremiumAmount
	 * SecuritiesFinancingTransactionDetails27.PremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32#PremiumAmount
	 * SecuritiesFinancingTransactionDetails32.PremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30#PremiumAmount
	 * SecuritiesFinancingTransactionDetails30.PremiumAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PremiumAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Difference between the cash amount of the first leg and the cash amount of the \nsecond leg of the repurchase agreement."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PremiumAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3.PremiumAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5.PremiumAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1.PremiumAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11.PremiumAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14.PremiumAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4.PremiumAmount,
					com.tools20022.repository.msg.SecuritiesFinancing10.PremiumAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.PremiumAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20.PremiumAmount, com.tools20022.repository.msg.SecuritiesFinancing1.PremiumAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28.PremiumAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27.PremiumAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32.PremiumAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30.PremiumAmount);
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PremiumAmount";
			definition = "Difference between the cash amount of the first leg and the cash amount of the \nsecond leg of the repurchase agreement.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Amount of money to be settled per piece of collateral to terminate the
	 * transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3#TerminationAmountPerPieceOfCollateral
	 * SecuritiesFinancingTransactionDetails3.
	 * TerminationAmountPerPieceOfCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5#TerminationAmountPerPieceOfCollateral
	 * SecuritiesFinancingTransactionDetails5.
	 * TerminationAmountPerPieceOfCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1#TerminationAmountPerPieceOfCollateral
	 * SecuritiesFinancingTransactionDetails1.
	 * TerminationAmountPerPieceOfCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11#TerminationAmountPerPieceOfCollateral
	 * SecuritiesFinancingTransactionDetails11.
	 * TerminationAmountPerPieceOfCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14#TerminationAmountPerPieceOfCollateral
	 * SecuritiesFinancingTransactionDetails14.
	 * TerminationAmountPerPieceOfCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4#TerminationAmountPerPieceOfCollateral
	 * SecuritiesFinancingTransactionDetails4.
	 * TerminationAmountPerPieceOfCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#TerminationAmountPerPieceOfCollateral
	 * SecuritiesFinancingTransactionDetails19.
	 * TerminationAmountPerPieceOfCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#TerminationAmountPerPieceOfCollateral
	 * SecuritiesFinancingTransactionDetails20.
	 * TerminationAmountPerPieceOfCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1#TerminationAmountPerPiecesOfCollateral
	 * SecuritiesFinancing1.TerminationAmountPerPiecesOfCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28#TerminationAmountPerPieceOfCollateral
	 * SecuritiesFinancingTransactionDetails28.
	 * TerminationAmountPerPieceOfCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#TerminationAmountPerPieceOfCollateral
	 * SecuritiesFinancingTransactionDetails27.
	 * TerminationAmountPerPieceOfCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32#TerminationAmountPerPieceOfCollateral
	 * SecuritiesFinancingTransactionDetails32.
	 * TerminationAmountPerPieceOfCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30#TerminationAmountPerPieceOfCollateral
	 * SecuritiesFinancingTransactionDetails30.
	 * TerminationAmountPerPieceOfCollateral}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminationAmountPerPieceOfCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money to be settled per piece of collateral to terminate the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TerminationAmountPerPieceOfCollateral = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3.TerminationAmountPerPieceOfCollateral,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5.TerminationAmountPerPieceOfCollateral, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1.TerminationAmountPerPieceOfCollateral,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11.TerminationAmountPerPieceOfCollateral, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14.TerminationAmountPerPieceOfCollateral,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4.TerminationAmountPerPieceOfCollateral, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.TerminationAmountPerPieceOfCollateral,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20.TerminationAmountPerPieceOfCollateral, com.tools20022.repository.msg.SecuritiesFinancing1.TerminationAmountPerPiecesOfCollateral,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28.TerminationAmountPerPieceOfCollateral, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27.TerminationAmountPerPieceOfCollateral,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32.TerminationAmountPerPieceOfCollateral, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30.TerminationAmountPerPieceOfCollateral);
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TerminationAmountPerPieceOfCollateral";
			definition = "Amount of money to be settled per piece of collateral to terminate the transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Total amount of money to be settled to terminate the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3#TerminationTransactionAmount
	 * SecuritiesFinancingTransactionDetails3.TerminationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5#TerminationTransactionAmount
	 * SecuritiesFinancingTransactionDetails5.TerminationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1#TerminationTransactionAmount
	 * SecuritiesFinancingTransactionDetails1.TerminationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11#TerminationTransactionAmount
	 * SecuritiesFinancingTransactionDetails11.TerminationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14#TerminationTransactionAmount
	 * SecuritiesFinancingTransactionDetails14.TerminationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4#TerminationTransactionAmount
	 * SecuritiesFinancingTransactionDetails4.TerminationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TwoLegTransactionDetails1#ClosingSettlementAmount
	 * TwoLegTransactionDetails1.ClosingSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2#TerminationTransactionAmount
	 * SecuritiesFinancingTransactionDetails2.TerminationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8#TerminationTransactionAmount
	 * SecuritiesFinancingTransactionDetails8.TerminationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails7#TerminationTransactionAmount
	 * SecuritiesFinancingTransactionDetails7.TerminationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#TerminationTransactionAmount
	 * SecuritiesFinancingTransactionDetails19.TerminationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#TerminationTransactionAmount
	 * SecuritiesFinancingTransactionDetails20.TerminationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6#TerminationTransactionAmount
	 * SecuritiesFinancingTransactionDetails6.TerminationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10#TerminationTransactionAmount
	 * SecuritiesFinancingTransactionDetails10.TerminationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17#TerminationTransactionAmount
	 * SecuritiesFinancingTransactionDetails17.TerminationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18#TerminationTransactionAmount
	 * SecuritiesFinancingTransactionDetails18.TerminationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9#TerminationTransactionAmount
	 * SecuritiesFinancingTransactionDetails9.TerminationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1#TerminationTransactionAmount
	 * SecuritiesFinancing1.TerminationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21#TerminationTransactionAmount
	 * SecuritiesFinancingTransactionDetails21.TerminationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22#TerminationTransactionAmount
	 * SecuritiesFinancingTransactionDetails22.TerminationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24#TerminationTransactionAmount
	 * SecuritiesFinancingTransactionDetails24.TerminationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25#TerminationTransactionAmount
	 * SecuritiesFinancingTransactionDetails25.TerminationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#TerminationTransactionAmount
	 * SecuritiesFinancingTransactionDetails26.TerminationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28#TerminationTransactionAmount
	 * SecuritiesFinancingTransactionDetails28.TerminationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#TerminationTransactionAmount
	 * SecuritiesFinancingTransactionDetails27.TerminationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails29#TerminationTransactionAmount
	 * SecuritiesFinancingTransactionDetails29.TerminationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#TerminationTransactionAmount
	 * SecuritiesFinancingTransactionDetails33.TerminationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32#TerminationTransactionAmount
	 * SecuritiesFinancingTransactionDetails32.TerminationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30#TerminationTransactionAmount
	 * SecuritiesFinancingTransactionDetails30.TerminationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails34#TerminationTransactionAmount
	 * SecuritiesFinancingTransactionDetails34.TerminationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#TerminationTransactionAmount
	 * SecuritiesFinancingTransactionDetails35.TerminationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36#TerminationTransactionAmount
	 * SecuritiesFinancingTransactionDetails36.TerminationTransactionAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminationTransactionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount of money to be settled to terminate the transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TerminationTransactionAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3.TerminationTransactionAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5.TerminationTransactionAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1.TerminationTransactionAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11.TerminationTransactionAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14.TerminationTransactionAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4.TerminationTransactionAmount, com.tools20022.repository.msg.TwoLegTransactionDetails1.ClosingSettlementAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2.TerminationTransactionAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8.TerminationTransactionAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails7.TerminationTransactionAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.TerminationTransactionAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20.TerminationTransactionAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6.TerminationTransactionAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10.TerminationTransactionAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17.TerminationTransactionAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18.TerminationTransactionAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9.TerminationTransactionAmount,
					com.tools20022.repository.msg.SecuritiesFinancing1.TerminationTransactionAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21.TerminationTransactionAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22.TerminationTransactionAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24.TerminationTransactionAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25.TerminationTransactionAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26.TerminationTransactionAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28.TerminationTransactionAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27.TerminationTransactionAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails29.TerminationTransactionAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.TerminationTransactionAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32.TerminationTransactionAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30.TerminationTransactionAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails34.TerminationTransactionAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35.TerminationTransactionAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36.TerminationTransactionAmount);
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TerminationTransactionAmount";
			definition = "Total amount of money to be settled to terminate the transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies whether the maturity date of the securities financing
	 * transaction may be modified.
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1#MaturityDateModification
	 * SecuritiesFinancingTransactionDetails1.MaturityDateModification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11#MaturityDateModification
	 * SecuritiesFinancingTransactionDetails11.MaturityDateModification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14#MaturityDateModification
	 * SecuritiesFinancingTransactionDetails14.MaturityDateModification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4#MaturityDateModification
	 * SecuritiesFinancingTransactionDetails4.MaturityDateModification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails7#MaturityDateModification
	 * SecuritiesFinancingTransactionDetails7.MaturityDateModification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#MaturityDateModification
	 * SecuritiesFinancingTransactionDetails19.MaturityDateModification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#MaturityDateModification
	 * SecuritiesFinancingTransactionDetails20.MaturityDateModification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9#MaturityDateModification
	 * SecuritiesFinancingTransactionDetails9.MaturityDateModification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28#MaturityDateModification
	 * SecuritiesFinancingTransactionDetails28.MaturityDateModification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#MaturityDateModification
	 * SecuritiesFinancingTransactionDetails27.MaturityDateModification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails29#MaturityDateModification
	 * SecuritiesFinancingTransactionDetails29.MaturityDateModification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32#MaturityDateModification
	 * SecuritiesFinancingTransactionDetails32.MaturityDateModification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30#MaturityDateModification
	 * SecuritiesFinancingTransactionDetails30.MaturityDateModification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails34#MaturityDateModification
	 * SecuritiesFinancingTransactionDetails34.MaturityDateModification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaturityDateModification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the maturity date of the securities financing transaction may be modified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MaturityDateModification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1.MaturityDateModification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11.MaturityDateModification, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14.MaturityDateModification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4.MaturityDateModification, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails7.MaturityDateModification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.MaturityDateModification, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20.MaturityDateModification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9.MaturityDateModification, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28.MaturityDateModification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27.MaturityDateModification, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails29.MaturityDateModification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32.MaturityDateModification, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30.MaturityDateModification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails34.MaturityDateModification);
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaturityDateModification";
			definition = "Specifies whether the maturity date of the securities financing transaction may be modified.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Earliest date/time at which the call back can take place.
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11#EarliestCallBackDate
	 * SecuritiesFinancingTransactionDetails11.EarliestCallBackDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14#EarliestCallBackDate
	 * SecuritiesFinancingTransactionDetails14.EarliestCallBackDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#EarliestCallBackDate
	 * SecuritiesFinancingTransactionDetails19.EarliestCallBackDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#EarliestCallBackDate
	 * SecuritiesFinancingTransactionDetails20.EarliestCallBackDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28#EarliestCallBackDate
	 * SecuritiesFinancingTransactionDetails28.EarliestCallBackDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#EarliestCallBackDate
	 * SecuritiesFinancingTransactionDetails27.EarliestCallBackDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32#EarliestCallBackDate
	 * SecuritiesFinancingTransactionDetails32.EarliestCallBackDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30#EarliestCallBackDate
	 * SecuritiesFinancingTransactionDetails30.EarliestCallBackDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarliestCallBackDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Earliest date/time at which the call back can take place."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute EarliestCallBackDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11.EarliestCallBackDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14.EarliestCallBackDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.EarliestCallBackDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20.EarliestCallBackDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28.EarliestCallBackDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27.EarliestCallBackDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32.EarliestCallBackDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30.EarliestCallBackDate);
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EarliestCallBackDate";
			definition = "Earliest date/time at which the call back can take place.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date and time at which the securities are to be delivered or received.
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails3#OpeningSettlementDate
	 * SecuritiesTradeDetails3.OpeningSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails11#OpeningSettlementDate
	 * SecuritiesTradeDetails11.OpeningSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails5#OpeningSettlementDate
	 * SecuritiesTradeDetails5.OpeningSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2#OpeningSettlementDate
	 * SecuritiesFinancingTransactionDetails2.OpeningSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8#OpeningSettlementDate
	 * SecuritiesFinancingTransactionDetails8.OpeningSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails12#OpeningSettlementDate
	 * SecuritiesTradeDetails12.OpeningSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6#OpeningSettlementDate
	 * SecuritiesFinancingTransactionDetails6.OpeningSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10#OpeningSettlementDate
	 * SecuritiesFinancingTransactionDetails10.OpeningSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17#OpeningSettlementDate
	 * SecuritiesFinancingTransactionDetails17.OpeningSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18#OpeningSettlementDate
	 * SecuritiesFinancingTransactionDetails18.OpeningSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21#OpeningSettlementDate
	 * SecuritiesFinancingTransactionDetails21.OpeningSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails37#OpeningSettlementDate
	 * SecuritiesTradeDetails37.OpeningSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22#OpeningSettlementDate
	 * SecuritiesFinancingTransactionDetails22.OpeningSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails40#OpeningSettlementDate
	 * SecuritiesTradeDetails40.OpeningSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24#OpeningSettlementDate
	 * SecuritiesFinancingTransactionDetails24.OpeningSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25#OpeningSettlementDate
	 * SecuritiesFinancingTransactionDetails25.OpeningSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#OpeningSettlementDate
	 * SecuritiesFinancingTransactionDetails26.OpeningSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails56#OpeningSettlementDate
	 * SecuritiesTradeDetails56.OpeningSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails59#OpeningSettlementDate
	 * SecuritiesTradeDetails59.OpeningSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#OpeningSettlementDate
	 * SecuritiesFinancingTransactionDetails33.OpeningSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#OpeningSettlementDate
	 * SecuritiesFinancingTransactionDetails35.OpeningSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36#OpeningSettlementDate
	 * SecuritiesFinancingTransactionDetails36.OpeningSettlementDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which the securities are to be delivered or received."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OpeningSettlementDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesTradeDetails3.OpeningSettlementDate, com.tools20022.repository.msg.SecuritiesTradeDetails11.OpeningSettlementDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails5.OpeningSettlementDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2.OpeningSettlementDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8.OpeningSettlementDate, com.tools20022.repository.msg.SecuritiesTradeDetails12.OpeningSettlementDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6.OpeningSettlementDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10.OpeningSettlementDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17.OpeningSettlementDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18.OpeningSettlementDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21.OpeningSettlementDate, com.tools20022.repository.msg.SecuritiesTradeDetails37.OpeningSettlementDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22.OpeningSettlementDate, com.tools20022.repository.msg.SecuritiesTradeDetails40.OpeningSettlementDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24.OpeningSettlementDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25.OpeningSettlementDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26.OpeningSettlementDate, com.tools20022.repository.msg.SecuritiesTradeDetails56.OpeningSettlementDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails59.OpeningSettlementDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.OpeningSettlementDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35.OpeningSettlementDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36.OpeningSettlementDate);
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OpeningSettlementDate";
			definition = "Date and time at which the securities are to be delivered or received.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Specifies the type of repurchase transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RepurchaseTypeCode
	 * RepurchaseTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType3Choice#Code
	 * RepurchaseType3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType3Choice#Proprietary
	 * RepurchaseType3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails6#RepurchaseType
	 * SettlementDetails6.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType6Choice#Code
	 * RepurchaseType6Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType6Choice#Proprietary
	 * RepurchaseType6Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails20#RepurchaseType
	 * SettlementDetails20.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails24#RepurchaseType
	 * SettlementDetails24.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails33#RepurchaseType
	 * SettlementDetails33.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails45#RepurchaseType
	 * SettlementDetails45.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails54#RepurchaseType
	 * SettlementDetails54.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType1Choice#Code
	 * RepurchaseType1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType1Choice#Proprietary
	 * RepurchaseType1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails1#RepurchaseType
	 * SettlementDetails1.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType4Choice#Code
	 * RepurchaseType4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType4Choice#Proprietary
	 * RepurchaseType4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails19#RepurchaseType
	 * SettlementDetails19.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails22#RepurchaseType
	 * SettlementDetails22.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails35#RepurchaseType
	 * SettlementDetails35.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#RepurchaseType
	 * SettlementDetails42.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails52#RepurchaseType
	 * SettlementDetails52.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails8#RepurchaseType
	 * SettlementDetails8.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails11#RepurchaseType
	 * SettlementDetails11.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails23#RepurchaseType
	 * SettlementDetails23.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails37#RepurchaseType
	 * SettlementDetails37.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails44#RepurchaseType
	 * SettlementDetails44.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails53#RepurchaseType
	 * SettlementDetails53.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails7#RepurchaseType
	 * SettlementDetails7.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails12#RepurchaseType
	 * SettlementDetails12.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails28#RepurchaseType
	 * SettlementDetails28.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails38#RepurchaseType
	 * SettlementDetails38.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails47#RepurchaseType
	 * SettlementDetails47.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails56#RepurchaseType
	 * SettlementDetails56.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails2#RepurchaseType
	 * SettlementDetails2.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails13#RepurchaseType
	 * SettlementDetails13.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails27#RepurchaseType
	 * SettlementDetails27.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails39#RepurchaseType
	 * SettlementDetails39.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails48#RepurchaseType
	 * SettlementDetails48.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails57#RepurchaseType
	 * SettlementDetails57.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType11Choice#Code
	 * RepurchaseType11Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType11Choice#Proprietary
	 * RepurchaseType11Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#RepurchaseType
	 * SettlementDetails43.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType2Choice#Code
	 * RepurchaseType2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType2Choice#Proprietary
	 * RepurchaseType2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType7Choice#Code
	 * RepurchaseType7Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType7Choice#Proprietary
	 * RepurchaseType7Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails5#RepurchaseType
	 * SettlementDetails5.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType8Choice#Code
	 * RepurchaseType8Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType8Choice#Proprietary
	 * RepurchaseType8Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails25#RepurchaseType
	 * SettlementDetails25.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails26#RepurchaseType
	 * SettlementDetails26.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType5Choice#Code
	 * RepurchaseType5Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType5Choice#Proprietary
	 * RepurchaseType5Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType9Choice#Code
	 * RepurchaseType9Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType9Choice#Proprietary
	 * RepurchaseType9Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails15#RepurchaseType
	 * SettlementDetails15.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType10Choice#Code
	 * RepurchaseType10Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType10Choice#Proprietary
	 * RepurchaseType10Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails34#RepurchaseType
	 * SettlementDetails34.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails49#RepurchaseType
	 * SettlementDetails49.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails58#RepurchaseType
	 * SettlementDetails58.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails36#RepurchaseType
	 * SettlementDetails36.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails66#RepurchaseType
	 * SettlementDetails66.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#RepurchaseType
	 * SettlementDetails67.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails70#RepurchaseType
	 * SettlementDetails70.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails69#RepurchaseType
	 * SettlementDetails69.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails75#RepurchaseType
	 * SettlementDetails75.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails74#RepurchaseType
	 * SettlementDetails74.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails81#RepurchaseType
	 * SettlementDetails81.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails80#RepurchaseType
	 * SettlementDetails80.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails87#RepurchaseType
	 * SettlementDetails87.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails86#RepurchaseType
	 * SettlementDetails86.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails85#RepurchaseType
	 * SettlementDetails85.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#RepurchaseType
	 * SettlementDetails93.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails90#RepurchaseType
	 * SettlementDetails90.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails99#RepurchaseType
	 * SettlementDetails99.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType15Choice#Code
	 * RepurchaseType15Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType15Choice#Proprietary
	 * RepurchaseType15Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType12Choice#Code
	 * RepurchaseType12Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType12Choice#Proprietary
	 * RepurchaseType12Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails95#RepurchaseType
	 * SettlementDetails95.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails91#RepurchaseType
	 * SettlementDetails91.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType13Choice#Code
	 * RepurchaseType13Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType13Choice#Proprietary
	 * RepurchaseType13Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails92#RepurchaseType
	 * SettlementDetails92.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType14Choice#Code
	 * RepurchaseType14Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType14Choice#Proprietary
	 * RepurchaseType14Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails101#RepurchaseType
	 * SettlementDetails101.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails111#RepurchaseType
	 * SettlementDetails111.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails112#RepurchaseType
	 * SettlementDetails112.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails110#RepurchaseType
	 * SettlementDetails110.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails108#RepurchaseType
	 * SettlementDetails108.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails115#RepurchaseType
	 * SettlementDetails115.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType19Choice#Code
	 * RepurchaseType19Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType19Choice#Proprietary
	 * RepurchaseType19Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails117#RepurchaseType
	 * SettlementDetails117.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType16Choice#Code
	 * RepurchaseType16Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType16Choice#Proprietary
	 * RepurchaseType16Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType17Choice#Code
	 * RepurchaseType17Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType17Choice#Proprietary
	 * RepurchaseType17Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails116#RepurchaseType
	 * SettlementDetails116.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType20Choice#Code
	 * RepurchaseType20Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType20Choice#Proprietary
	 * RepurchaseType20Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails128#RepurchaseType
	 * SettlementDetails128.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#RepurchaseType
	 * SettlementDetails120.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#RepurchaseType
	 * SettlementDetails119.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails125#RepurchaseType
	 * SettlementDetails125.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails126#RepurchaseType
	 * SettlementDetails126.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType22Choice#Code
	 * RepurchaseType22Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType22Choice#Proprietary
	 * RepurchaseType22Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails127#RepurchaseType
	 * SettlementDetails127.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType21Choice#Code
	 * RepurchaseType21Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType21Choice#Proprietary
	 * RepurchaseType21Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType23Choice#Code
	 * RepurchaseType23Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType23Choice#Proprietary
	 * RepurchaseType23Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails121#RepurchaseType
	 * SettlementDetails121.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails134#RepurchaseType
	 * SettlementDetails134.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails137#RepurchaseType
	 * SettlementDetails137.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails132#RepurchaseType
	 * SettlementDetails132.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType31Choice#Code
	 * RepurchaseType31Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType31Choice#Proprietary
	 * RepurchaseType31Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails130#RepurchaseType
	 * SettlementDetails130.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType24Choice#Code
	 * RepurchaseType24Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType24Choice#Proprietary
	 * RepurchaseType24Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType26Choice#Code
	 * RepurchaseType26Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType26Choice#Proprietary
	 * RepurchaseType26Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails131#RepurchaseType
	 * SettlementDetails131.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails133#RepurchaseType
	 * SettlementDetails133.RepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails139#RepurchaseType
	 * SettlementDetails139.RepurchaseType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of repurchase transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RepurchaseType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.RepurchaseType3Choice.Code, com.tools20022.repository.choice.RepurchaseType3Choice.Proprietary,
					com.tools20022.repository.msg.SettlementDetails6.RepurchaseType, com.tools20022.repository.choice.RepurchaseType6Choice.Code, com.tools20022.repository.choice.RepurchaseType6Choice.Proprietary,
					com.tools20022.repository.msg.SettlementDetails20.RepurchaseType, com.tools20022.repository.msg.SettlementDetails24.RepurchaseType, com.tools20022.repository.msg.SettlementDetails33.RepurchaseType,
					com.tools20022.repository.msg.SettlementDetails45.RepurchaseType, com.tools20022.repository.msg.SettlementDetails54.RepurchaseType, com.tools20022.repository.choice.RepurchaseType1Choice.Code,
					com.tools20022.repository.choice.RepurchaseType1Choice.Proprietary, com.tools20022.repository.msg.SettlementDetails1.RepurchaseType, com.tools20022.repository.choice.RepurchaseType4Choice.Code,
					com.tools20022.repository.choice.RepurchaseType4Choice.Proprietary, com.tools20022.repository.msg.SettlementDetails19.RepurchaseType, com.tools20022.repository.msg.SettlementDetails22.RepurchaseType,
					com.tools20022.repository.msg.SettlementDetails35.RepurchaseType, com.tools20022.repository.msg.SettlementDetails42.RepurchaseType, com.tools20022.repository.msg.SettlementDetails52.RepurchaseType,
					com.tools20022.repository.msg.SettlementDetails8.RepurchaseType, com.tools20022.repository.msg.SettlementDetails11.RepurchaseType, com.tools20022.repository.msg.SettlementDetails23.RepurchaseType,
					com.tools20022.repository.msg.SettlementDetails37.RepurchaseType, com.tools20022.repository.msg.SettlementDetails44.RepurchaseType, com.tools20022.repository.msg.SettlementDetails53.RepurchaseType,
					com.tools20022.repository.msg.SettlementDetails7.RepurchaseType, com.tools20022.repository.msg.SettlementDetails12.RepurchaseType, com.tools20022.repository.msg.SettlementDetails28.RepurchaseType,
					com.tools20022.repository.msg.SettlementDetails38.RepurchaseType, com.tools20022.repository.msg.SettlementDetails47.RepurchaseType, com.tools20022.repository.msg.SettlementDetails56.RepurchaseType,
					com.tools20022.repository.msg.SettlementDetails2.RepurchaseType, com.tools20022.repository.msg.SettlementDetails13.RepurchaseType, com.tools20022.repository.msg.SettlementDetails27.RepurchaseType,
					com.tools20022.repository.msg.SettlementDetails39.RepurchaseType, com.tools20022.repository.msg.SettlementDetails48.RepurchaseType, com.tools20022.repository.msg.SettlementDetails57.RepurchaseType,
					com.tools20022.repository.choice.RepurchaseType11Choice.Code, com.tools20022.repository.choice.RepurchaseType11Choice.Proprietary, com.tools20022.repository.msg.SettlementDetails43.RepurchaseType,
					com.tools20022.repository.choice.RepurchaseType2Choice.Code, com.tools20022.repository.choice.RepurchaseType2Choice.Proprietary, com.tools20022.repository.choice.RepurchaseType7Choice.Code,
					com.tools20022.repository.choice.RepurchaseType7Choice.Proprietary, com.tools20022.repository.msg.SettlementDetails5.RepurchaseType, com.tools20022.repository.choice.RepurchaseType8Choice.Code,
					com.tools20022.repository.choice.RepurchaseType8Choice.Proprietary, com.tools20022.repository.msg.SettlementDetails25.RepurchaseType, com.tools20022.repository.msg.SettlementDetails26.RepurchaseType,
					com.tools20022.repository.choice.RepurchaseType5Choice.Code, com.tools20022.repository.choice.RepurchaseType5Choice.Proprietary, com.tools20022.repository.choice.RepurchaseType9Choice.Code,
					com.tools20022.repository.choice.RepurchaseType9Choice.Proprietary, com.tools20022.repository.msg.SettlementDetails15.RepurchaseType, com.tools20022.repository.choice.RepurchaseType10Choice.Code,
					com.tools20022.repository.choice.RepurchaseType10Choice.Proprietary, com.tools20022.repository.msg.SettlementDetails34.RepurchaseType, com.tools20022.repository.msg.SettlementDetails49.RepurchaseType,
					com.tools20022.repository.msg.SettlementDetails58.RepurchaseType, com.tools20022.repository.msg.SettlementDetails36.RepurchaseType, com.tools20022.repository.msg.SettlementDetails66.RepurchaseType,
					com.tools20022.repository.msg.SettlementDetails67.RepurchaseType, com.tools20022.repository.msg.SettlementDetails70.RepurchaseType, com.tools20022.repository.msg.SettlementDetails69.RepurchaseType,
					com.tools20022.repository.msg.SettlementDetails75.RepurchaseType, com.tools20022.repository.msg.SettlementDetails74.RepurchaseType, com.tools20022.repository.msg.SettlementDetails81.RepurchaseType,
					com.tools20022.repository.msg.SettlementDetails80.RepurchaseType, com.tools20022.repository.msg.SettlementDetails87.RepurchaseType, com.tools20022.repository.msg.SettlementDetails86.RepurchaseType,
					com.tools20022.repository.msg.SettlementDetails85.RepurchaseType, com.tools20022.repository.msg.SettlementDetails93.RepurchaseType, com.tools20022.repository.msg.SettlementDetails90.RepurchaseType,
					com.tools20022.repository.msg.SettlementDetails99.RepurchaseType, com.tools20022.repository.choice.RepurchaseType15Choice.Code, com.tools20022.repository.choice.RepurchaseType15Choice.Proprietary,
					com.tools20022.repository.choice.RepurchaseType12Choice.Code, com.tools20022.repository.choice.RepurchaseType12Choice.Proprietary, com.tools20022.repository.msg.SettlementDetails95.RepurchaseType,
					com.tools20022.repository.msg.SettlementDetails91.RepurchaseType, com.tools20022.repository.choice.RepurchaseType13Choice.Code, com.tools20022.repository.choice.RepurchaseType13Choice.Proprietary,
					com.tools20022.repository.msg.SettlementDetails92.RepurchaseType, com.tools20022.repository.choice.RepurchaseType14Choice.Code, com.tools20022.repository.choice.RepurchaseType14Choice.Proprietary,
					com.tools20022.repository.msg.SettlementDetails101.RepurchaseType, com.tools20022.repository.msg.SettlementDetails111.RepurchaseType, com.tools20022.repository.msg.SettlementDetails112.RepurchaseType,
					com.tools20022.repository.msg.SettlementDetails110.RepurchaseType, com.tools20022.repository.msg.SettlementDetails108.RepurchaseType, com.tools20022.repository.msg.SettlementDetails115.RepurchaseType,
					com.tools20022.repository.choice.RepurchaseType19Choice.Code, com.tools20022.repository.choice.RepurchaseType19Choice.Proprietary, com.tools20022.repository.msg.SettlementDetails117.RepurchaseType,
					com.tools20022.repository.choice.RepurchaseType16Choice.Code, com.tools20022.repository.choice.RepurchaseType16Choice.Proprietary, com.tools20022.repository.choice.RepurchaseType17Choice.Code,
					com.tools20022.repository.choice.RepurchaseType17Choice.Proprietary, com.tools20022.repository.msg.SettlementDetails116.RepurchaseType, com.tools20022.repository.choice.RepurchaseType20Choice.Code,
					com.tools20022.repository.choice.RepurchaseType20Choice.Proprietary, com.tools20022.repository.msg.SettlementDetails128.RepurchaseType, com.tools20022.repository.msg.SettlementDetails120.RepurchaseType,
					com.tools20022.repository.msg.SettlementDetails119.RepurchaseType, com.tools20022.repository.msg.SettlementDetails125.RepurchaseType, com.tools20022.repository.msg.SettlementDetails126.RepurchaseType,
					com.tools20022.repository.choice.RepurchaseType22Choice.Code, com.tools20022.repository.choice.RepurchaseType22Choice.Proprietary, com.tools20022.repository.msg.SettlementDetails127.RepurchaseType,
					com.tools20022.repository.choice.RepurchaseType21Choice.Code, com.tools20022.repository.choice.RepurchaseType21Choice.Proprietary, com.tools20022.repository.choice.RepurchaseType23Choice.Code,
					com.tools20022.repository.choice.RepurchaseType23Choice.Proprietary, com.tools20022.repository.msg.SettlementDetails121.RepurchaseType, com.tools20022.repository.msg.SettlementDetails134.RepurchaseType,
					com.tools20022.repository.msg.SettlementDetails137.RepurchaseType, com.tools20022.repository.msg.SettlementDetails132.RepurchaseType, com.tools20022.repository.choice.RepurchaseType31Choice.Code,
					com.tools20022.repository.choice.RepurchaseType31Choice.Proprietary, com.tools20022.repository.msg.SettlementDetails130.RepurchaseType, com.tools20022.repository.choice.RepurchaseType24Choice.Code,
					com.tools20022.repository.choice.RepurchaseType24Choice.Proprietary, com.tools20022.repository.choice.RepurchaseType26Choice.Code, com.tools20022.repository.choice.RepurchaseType26Choice.Proprietary,
					com.tools20022.repository.msg.SettlementDetails131.RepurchaseType, com.tools20022.repository.msg.SettlementDetails133.RepurchaseType, com.tools20022.repository.msg.SettlementDetails139.RepurchaseType);
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RepurchaseType";
			definition = "Specifies the type of repurchase transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> RepurchaseTypeCode.mmObject();
		}
	};
	/**
	 * Negotiated fixed price of the security to buy it back.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#RelatedSecuritiesFinancing
	 * SecuritiesPricing.RelatedSecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TwoLegTransactionDetails1#EndPrice
	 * TwoLegTransactionDetails1.EndPrice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Negotiated fixed price of the security to buy it back."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd EndPrice = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TwoLegTransactionDetails1.EndPrice);
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EndPrice";
			definition = "Negotiated fixed price of the security to buy it back.";
			minOccurs = 0;
			type_lazy = () -> SecuritiesPricing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.RelatedSecuritiesFinancing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies that there will be one price and one transaction when two
	 * contracts are carried out simultaneously, one to buy and the other one to
	 * sell with two different expiration dates.
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
	 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1#SpreadTransaction
	 * FutureOrOptionDetails1.SpreadTransaction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpreadTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that there will be one price and one transaction when two contracts are carried out simultaneously, one to buy and the other one to sell with two different expiration dates."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SpreadTransaction = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FutureOrOptionDetails1.SpreadTransaction);
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SpreadTransaction";
			definition = "Specifies that there will be one price and one transaction when two contracts are carried out simultaneously, one to buy and the other one to sell with two different expiration dates.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Provides the contractual details related to the agreement between
	 * parties.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancingAgreement#SecuritiesFinancingTrade
	 * SecuritiesFinancingAgreement.SecuritiesFinancingTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancingAgreement
	 * SecuritiesFinancingAgreement}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#FinancingAgreement
	 * SecuritiesFinancing10.FinancingAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1#FinancingAgreement
	 * SecuritiesFinancing1.FinancingAgreement}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancingAgreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the contractual details related to the agreement between parties."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd FinancingAgreement = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesFinancing10.FinancingAgreement, com.tools20022.repository.msg.SecuritiesFinancing1.FinancingAgreement);
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FinancingAgreement";
			definition = "Provides the contractual details related to the agreement between parties.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesFinancingAgreement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancingAgreement.SecuritiesFinancingTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Total amount of money to be paid or received in exchange for the
	 * securities at the opening of a securities financing transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2#OpeningSettlementAmount
	 * SecuritiesFinancingTransactionDetails2.OpeningSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8#OpeningSettlementAmount
	 * SecuritiesFinancingTransactionDetails8.OpeningSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6#OpeningSettlementAmount
	 * SecuritiesFinancingTransactionDetails6.OpeningSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10#OpeningSettlementAmount
	 * SecuritiesFinancingTransactionDetails10.OpeningSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17#OpeningSettlementAmount
	 * SecuritiesFinancingTransactionDetails17.OpeningSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18#OpeningSettlementAmount
	 * SecuritiesFinancingTransactionDetails18.OpeningSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21#OpeningSettlementAmount
	 * SecuritiesFinancingTransactionDetails21.OpeningSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22#OpeningSettlementAmount
	 * SecuritiesFinancingTransactionDetails22.OpeningSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24#OpeningSettlementAmount
	 * SecuritiesFinancingTransactionDetails24.OpeningSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25#OpeningSettlementAmount
	 * SecuritiesFinancingTransactionDetails25.OpeningSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#OpeningSettlementAmount
	 * SecuritiesFinancingTransactionDetails26.OpeningSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#OpeningSettlementAmount
	 * SecuritiesFinancingTransactionDetails33.OpeningSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#OpeningSettlementAmount
	 * SecuritiesFinancingTransactionDetails35.OpeningSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36#OpeningSettlementAmount
	 * SecuritiesFinancingTransactionDetails36.OpeningSettlementAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningSettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount of money to be paid or received in exchange for the securities at the opening of a securities financing transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OpeningSettlementAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2.OpeningSettlementAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8.OpeningSettlementAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6.OpeningSettlementAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10.OpeningSettlementAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17.OpeningSettlementAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18.OpeningSettlementAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21.OpeningSettlementAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22.OpeningSettlementAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24.OpeningSettlementAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25.OpeningSettlementAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26.OpeningSettlementAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.OpeningSettlementAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35.OpeningSettlementAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36.OpeningSettlementAmount);
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OpeningSettlementAmount";
			definition = "Total amount of money to be paid or received in exchange for the securities at the opening of a securities financing transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Repayment of the previously received cash by one party in exchange of the
	 * return of the security by the counterparty.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#SecuritiesFinancingClosingData
	 * SecuritiesTrade.SecuritiesFinancingClosingData}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosingLegExecution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Repayment of the previously received cash by one party in exchange of the return of the security by the counterparty."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ClosingLegExecution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClosingLegExecution";
			definition = "Repayment of the previously received cash by one party in exchange of the return of the security by the counterparty.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesTrade.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.SecuritiesFinancingClosingData;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Transfer of cash to a party against the legal transfer of securities. The
	 * cash receiver agrees to buy the same security from the counterparty at a
	 * fixed price at some later date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#SecuritiesFinancingOpeningData
	 * SecuritiesTrade.SecuritiesFinancingOpeningData}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningLegExecution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transfer of cash to a party against the legal transfer of securities. The cash receiver agrees to buy the same security from the counterparty at a fixed price at some later date."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd OpeningLegExecution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OpeningLegExecution";
			definition = "Transfer of cash to a party against the legal transfer of securities. The cash receiver agrees to buy the same security from the counterparty at a fixed price at some later date.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesTrade.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.SecuritiesFinancingOpeningData;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indication of interest process which is the source of a securities
	 * financing process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest#TwoLegTransaction
	 * BuyOrSellIndicationOfInterest.TwoLegTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest
	 * BuyOrSellIndicationOfInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedIndicationOfInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indication of interest process which is the source of a securities financing process."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedIndicationOfInterest = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedIndicationOfInterest";
			definition = "Indication of interest process which is the source of a securities financing process.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> BuyOrSellIndicationOfInterest.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.TwoLegTransaction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Unique identification of the repurchase agreement.
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1#Identification
	 * SecuritiesFinancing1.Identification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique identification of the repurchase agreement."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Identification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesFinancing1.Identification);
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Unique identification of the repurchase agreement.";
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
				name = "SecuritiesFinancing";
				definition = "Process of lending or borrowing cash or securities against securities or cash collateral. It aims at optimising liquidity, support a trading strategy, or increase settlement efficiency.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPricing.RelatedSecuritiesFinancing, com.tools20022.repository.entity.SecuritiesTrade.SecuritiesFinancingClosingData,
						com.tools20022.repository.entity.SecuritiesTrade.SecuritiesFinancingOpeningData, com.tools20022.repository.entity.Interest.SecuritiesFinancing, com.tools20022.repository.entity.Spread.SecuritiesFinancing,
						com.tools20022.repository.entity.SecuritiesFinancingAgreement.SecuritiesFinancingTrade, com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.TwoLegTransaction);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.TwoLegTransactionType1Choice.SecuritiesFinancingDetails, com.tools20022.repository.msg.TwoLegTransactionDetails1.OtherAmounts,
						com.tools20022.repository.msg.TwoLegTransactionDetails1.TwoLegTransactionType, com.tools20022.repository.msg.SingleQuote1.TwoLegTransactionDetails,
						com.tools20022.repository.msg.SingleOrder1.TwoLegTransactionDetails, com.tools20022.repository.msg.Order11.TwoLegTransactionDetails, com.tools20022.repository.msg.QuoteRequest1.TwoLegTransactionDetails);
				subType_lazy = () -> Arrays.asList(SecuritiesLending.mmObject(), RepurchaseAgreement.mmObject());
				superType_lazy = () -> SecuritiesTrade.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesFinancing.ReturnLegInstruction, com.tools20022.repository.entity.SecuritiesFinancing.Type,
						com.tools20022.repository.entity.SecuritiesFinancing.TerminationDateTime, com.tools20022.repository.entity.SecuritiesFinancing.RateChangeDateTime,
						com.tools20022.repository.entity.SecuritiesFinancing.RevaluationIndicator, com.tools20022.repository.entity.SecuritiesFinancing.InterestPayment,
						com.tools20022.repository.entity.SecuritiesFinancing.VariableRateSupport, com.tools20022.repository.entity.SecuritiesFinancing.RepurchaseRate, com.tools20022.repository.entity.SecuritiesFinancing.StockLoanMargin,
						com.tools20022.repository.entity.SecuritiesFinancing.Interest, com.tools20022.repository.entity.SecuritiesFinancing.RepurchaseSpread, com.tools20022.repository.entity.SecuritiesFinancing.TransactionCallDelay,
						com.tools20022.repository.entity.SecuritiesFinancing.TotalNumberOfCollateralInstructions, com.tools20022.repository.entity.SecuritiesFinancing.DealAmount,
						com.tools20022.repository.entity.SecuritiesFinancing.ForfeitRepurchaseAmount, com.tools20022.repository.entity.SecuritiesFinancing.PremiumAmount,
						com.tools20022.repository.entity.SecuritiesFinancing.TerminationAmountPerPieceOfCollateral, com.tools20022.repository.entity.SecuritiesFinancing.TerminationTransactionAmount,
						com.tools20022.repository.entity.SecuritiesFinancing.MaturityDateModification, com.tools20022.repository.entity.SecuritiesFinancing.EarliestCallBackDate,
						com.tools20022.repository.entity.SecuritiesFinancing.OpeningSettlementDate, com.tools20022.repository.entity.SecuritiesFinancing.RepurchaseType, com.tools20022.repository.entity.SecuritiesFinancing.EndPrice,
						com.tools20022.repository.entity.SecuritiesFinancing.SpreadTransaction, com.tools20022.repository.entity.SecuritiesFinancing.FinancingAgreement,
						com.tools20022.repository.entity.SecuritiesFinancing.OpeningSettlementAmount, com.tools20022.repository.entity.SecuritiesFinancing.ClosingLegExecution,
						com.tools20022.repository.entity.SecuritiesFinancing.OpeningLegExecution, com.tools20022.repository.entity.SecuritiesFinancing.RelatedIndicationOfInterest,
						com.tools20022.repository.entity.SecuritiesFinancing.Identification);
				derivationComponent_lazy = () -> Arrays.asList(SecuritiesTradeDetails6.mmObject(), RevaluationIndicator1Choice.mmObject(), SecuritiesFinancingTransactionDetails3.mmObject(), SecuritiesTradeDetails13.mmObject(),
						RevaluationIndicator2Choice.mmObject(), SecuritiesFinancingTransactionDetails5.mmObject(), SecuritiesFinancingTransactionDetails1.mmObject(), SecuritiesFinancingTransactionDetails11.mmObject(),
						SecuritiesFinancingTransactionDetails14.mmObject(), SecuritiesTradeDetails3.mmObject(), SecuritiesTradeDetails11.mmObject(), SecuritiesFinancingTransactionDetails4.mmObject(), RepurchaseType3Choice.mmObject(),
						RepurchaseType6Choice.mmObject(), RepurchaseType1Choice.mmObject(), RepurchaseType4Choice.mmObject(), RepurchaseType11Choice.mmObject(), ClosingDate1Choice.mmObject(), Revaluation2Choice.mmObject(),
						SecuritiesFinancing10.mmObject(), TwoLegTransactionDetails1.mmObject(), RepurchaseType2Choice.mmObject(), SecuritiesTradeDetails5.mmObject(), RepurchaseType7Choice.mmObject(),
						SecuritiesFinancingTransactionDetails2.mmObject(), SecuritiesFinancingTransactionDetails8.mmObject(), SecuritiesFinancingTransactionDetails7.mmObject(), RepurchaseType8Choice.mmObject(),
						RepurchaseType5Choice.mmObject(), SecuritiesTradeDetails12.mmObject(), RepurchaseType9Choice.mmObject(), SecuritiesFinancingTransactionDetails19.mmObject(), SecuritiesFinancingTransactionDetails20.mmObject(),
						SecuritiesFinancingTransactionDetails6.mmObject(), SecuritiesFinancingTransactionDetails10.mmObject(), SecuritiesFinancingTransactionDetails17.mmObject(), SecuritiesFinancingTransactionDetails18.mmObject(),
						SecuritiesFinancingTransactionDetails9.mmObject(), RepurchaseType10Choice.mmObject(), Revaluation1Choice.mmObject(), SecuritiesFinancing1.mmObject(), SecuritiesFinancingTransactionDetails21.mmObject(),
						SecuritiesTradeDetails38.mmObject(), SecuritiesTradeDetails37.mmObject(), SecuritiesTradeDetails39.mmObject(), SecuritiesFinancingTransactionDetails22.mmObject(), SecuritiesTradeDetails40.mmObject(),
						SecuritiesFinancingTransactionDetails24.mmObject(), SecuritiesFinancingTransactionDetails25.mmObject(), SecuritiesFinancingTransactionDetails26.mmObject(), SecuritiesFinancingTransactionDetails28.mmObject(),
						SecuritiesTradeDetails55.mmObject(), SecuritiesTradeDetails56.mmObject(), SecuritiesFinancingTransactionDetails27.mmObject(), SecuritiesFinancingTransactionDetails29.mmObject(),
						RevaluationIndicator3Choice.mmObject(), RepurchaseType15Choice.mmObject(), RepurchaseType12Choice.mmObject(), RepurchaseType13Choice.mmObject(), RepurchaseType14Choice.mmObject(),
						SecuritiesTradeDetails59.mmObject(), SecuritiesFinancingTransactionDetails33.mmObject(), SecuritiesFinancingTransactionDetails32.mmObject(), SecuritiesTradeDetails58.mmObject(),
						SecuritiesFinancingTransactionDetails30.mmObject(), SecuritiesFinancingTransactionDetails34.mmObject(), RevaluationIndicator4Choice.mmObject(), RepurchaseType19Choice.mmObject(), RepurchaseType16Choice.mmObject(),
						RepurchaseType17Choice.mmObject(), RepurchaseType20Choice.mmObject(), SecuritiesFinancingTransactionDetails35.mmObject(), RepurchaseType22Choice.mmObject(), RepurchaseType21Choice.mmObject(),
						RepurchaseType23Choice.mmObject(), SecuritiesFinancingTransactionDetails36.mmObject(), RepurchaseType31Choice.mmObject(), RepurchaseType24Choice.mmObject(), RepurchaseType26Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}