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
import com.tools20022.repository.codeset.DebitCreditCode;
import com.tools20022.repository.codeset.InterestTypeCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Consideration, such as amount of money, paid or received in exchange for an
 * asset that has been invested, loaned or borrowed for a certain period. The
 * interest is expressed as a fixed amount or percentage of the amount upon
 * which the interest is applied.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Interest" src="doc-files/Interest.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#AccruedInterestAmount
 * Interest.AccruedInterestAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#InterestCalculation
 * Interest.InterestCalculation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#Amount
 * Interest.Amount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#Rate Interest.Rate}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#RelatedCashProceedsDefinition
 * Interest.RelatedCashProceedsDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#SecuritiesFinancing
 * Interest.SecuritiesFinancing}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#InterestTax
 * Interest.InterestTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#CreditDebitIndicator
 * Interest.CreditDebitIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#CashEntry
 * Interest.CashEntry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#PaymentDate
 * Interest.PaymentDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#RelatedInterestManagement
 * Interest.RelatedInterestManagement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#RelatedUndertakingAmount
 * Interest.RelatedUndertakingAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#RelatedDebitCreditFacility
 * Interest.RelatedDebitCreditFacility}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#SecuritiesSettlement
 * Interest.SecuritiesSettlement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#InterestName
 * Interest.InterestName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#RelatedAssetHolding
 * Interest.RelatedAssetHolding}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#Deposit
 * Interest.Deposit}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#AccountBalance
 * Interest.AccountBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#RelatedAccountContract
 * Interest.RelatedAccountContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#RelatedNetAssetValueCalculation
 * Interest.RelatedNetAssetValueCalculation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#TypeOfInterest
 * Interest.TypeOfInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#RelatedPaymentCard
 * Interest.RelatedPaymentCard}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#IdentificationForInterestName
 * GenericIdentification.IdentificationForInterestName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#Interest
 * NetAssetValueCalculation.Interest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#Interest Tax.Interest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AccountContract#Interest
 * AccountContract.Interest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#Interest
 * PaymentCard.Interest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashEntry#Interest
 * CashEntry.Interest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#Interest
 * AssetHolding.Interest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Balance#Interest
 * Balance.Interest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#AccruedInterest
 * SecuritiesSettlement.AccruedInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#Interest
 * InterestCalculation.Interest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#Interest
 * SecuritiesFinancing.Interest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#Interest
 * CashProceedsDefinition.Interest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DebitCreditFacility#CashAccountInterest
 * DebitCreditFacility.CashAccountInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.UndertakingAmount#Interest
 * UndertakingAmount.Interest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Deposit#Interest
 * Deposit.Interest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InterestManagement#Interest
 * InterestManagement.Interest}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat2Choice#RateTypeAndAmountAndRateStatus
 * InterestRateUsedForPaymentFormat2Choice.RateTypeAndAmountAndRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat3Choice#RateTypeAndAmountAndRateStatus
 * InterestRateUsedForPaymentFormat3Choice.RateTypeAndAmountAndRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat1Choice#RateTypeAndAmountAndRateStatus
 * InterestRateUsedForPaymentFormat1Choice.RateTypeAndAmountAndRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat4Choice#RateTypeAndAmountAndRateStatus
 * InterestRateUsedForPaymentFormat4Choice.RateTypeAndAmountAndRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat5Choice#RateTypeAndAmountAndRateStatus
 * InterestRateUsedForPaymentFormat5Choice.RateTypeAndAmountAndRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat6Choice#RateTypeAndAmountAndRateStatus
 * InterestRateUsedForPaymentFormat6Choice.RateTypeAndAmountAndRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat8Choice#RateTypeAndAmountAndRateStatus
 * InterestRateUsedForPaymentFormat8Choice.RateTypeAndAmountAndRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat7Choice#RateTypeAndAmountAndRateStatus
 * InterestRateUsedForPaymentFormat7Choice.RateTypeAndAmountAndRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat9Choice#RateTypeAndAmountAndRateStatus
 * InterestRateUsedForPaymentFormat9Choice.RateTypeAndAmountAndRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat10Choice#RateTypeAndAmountAndRateStatus
 * InterestRateUsedForPaymentFormat10Choice.RateTypeAndAmountAndRateStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus1
 * RateTypeAndAmountAndStatus1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus3
 * RateTypeAndAmountAndStatus3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat2Choice
 * InterestRateUsedForPaymentFormat2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus4
 * RateTypeAndAmountAndStatus4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus5
 * RateTypeAndAmountAndStatus5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus6
 * RateTypeAndAmountAndStatus6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus2
 * RateTypeAndAmountAndStatus2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus7
 * RateTypeAndAmountAndStatus7}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat3Choice
 * InterestRateUsedForPaymentFormat3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus8
 * RateTypeAndAmountAndStatus8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus9
 * RateTypeAndAmountAndStatus9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus10
 * RateTypeAndAmountAndStatus10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus11
 * RateTypeAndAmountAndStatus11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus12
 * RateTypeAndAmountAndStatus12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus15
 * RateTypeAndAmountAndStatus15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus16
 * RateTypeAndAmountAndStatus16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus13
 * RateTypeAndAmountAndStatus13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus14
 * RateTypeAndAmountAndStatus14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus17
 * RateTypeAndAmountAndStatus17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus18
 * RateTypeAndAmountAndStatus18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus19
 * RateTypeAndAmountAndStatus19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus20
 * RateTypeAndAmountAndStatus20}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus21
 * RateTypeAndAmountAndStatus21}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat1Choice
 * InterestRateUsedForPaymentFormat1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat4Choice
 * InterestRateUsedForPaymentFormat4Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat5Choice
 * InterestRateUsedForPaymentFormat5Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat6Choice
 * InterestRateUsedForPaymentFormat6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateOrName1Choice
 * RateOrName1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateOrName2Choice
 * RateOrName2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InterestRecord1
 * InterestRecord1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.InterestRate1Choice
 * InterestRate1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InterestAmount1
 * InterestAmount1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InterestResult1
 * InterestResult1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InterestAmount2
 * InterestAmount2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InterestStatement1
 * InterestStatement1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InterestStatement2
 * InterestStatement2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InterestStatement3
 * InterestStatement3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InterestRateContractTerm1
 * InterestRateContractTerm1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.InterestRate2Choice
 * InterestRate2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InterestPaymentDateRange1
 * InterestPaymentDateRange1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat8Choice
 * InterestRateUsedForPaymentFormat8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus24
 * RateTypeAndAmountAndStatus24}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus22
 * RateTypeAndAmountAndStatus22}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus25
 * RateTypeAndAmountAndStatus25}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus27
 * RateTypeAndAmountAndStatus27}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus26
 * RateTypeAndAmountAndStatus26}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat7Choice
 * InterestRateUsedForPaymentFormat7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus28
 * RateTypeAndAmountAndStatus28}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus29
 * RateTypeAndAmountAndStatus29}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InterestStatement4
 * InterestStatement4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat9Choice
 * InterestRateUsedForPaymentFormat9Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus32
 * RateTypeAndAmountAndStatus32}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus31
 * RateTypeAndAmountAndStatus31}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus33
 * RateTypeAndAmountAndStatus33}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus36
 * RateTypeAndAmountAndStatus36}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus35
 * RateTypeAndAmountAndStatus35}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus30
 * RateTypeAndAmountAndStatus30}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat10Choice
 * InterestRateUsedForPaymentFormat10Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus34
 * RateTypeAndAmountAndStatus34}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InterestRateContractTerm2
 * InterestRateContractTerm2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.InterestRate6Choice
 * InterestRate6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.InterestRate8Choice
 * InterestRate8Choice}</li>
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
 * "Interest"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Consideration, such as amount of money,  paid or received in exchange for an asset that has been invested, loaned or borrowed for a certain period. The interest is expressed as a fixed amount or percentage of the amount upon which the interest is applied."
 * </li>
 * </ul>
 */
public class Interest {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Interest amount that has accrued in between coupon payment periods.
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
	 * {@linkplain com.tools20022.repository.msg.UnitPrice3#AccruedInterestNAV
	 * UnitPrice3.AccruedInterestNAV}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice12#AccruedInterestNAV
	 * UnitPrice12.AccruedInterestNAV}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts12#AccruedInterestAmount
	 * OtherAmounts12.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts14#AccruedInterestAmount
	 * OtherAmounts14.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts20#AccruedInterestAmount
	 * OtherAmounts20.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#AccruedInterestAmount
	 * CorporateActionAmounts2.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts5#AccruedInterestAmount
	 * CorporateActionAmounts5.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts11#AccruedInterestAmount
	 * CorporateActionAmounts11.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#AccruedInterestAmount
	 * CorporateActionAmounts12.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts17#AccruedInterestAmount
	 * CorporateActionAmounts17.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts20#AccruedInterestAmount
	 * CorporateActionAmounts20.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts23#AccruedInterestAmount
	 * CorporateActionAmounts23.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts24#AccruedInterestAmount
	 * CorporateActionAmounts24.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts3#AccruedInterestAmount
	 * CorporateActionAmounts3.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts6#AccruedInterestAmount
	 * CorporateActionAmounts6.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts9#AccruedInterestAmount
	 * CorporateActionAmounts9.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts13#AccruedInterestAmount
	 * CorporateActionAmounts13.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts16#AccruedInterestAmount
	 * CorporateActionAmounts16.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts19#AccruedInterestAmount
	 * CorporateActionAmounts19.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#AccruedInterestAmount
	 * CorporateActionAmounts22.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts25#AccruedInterestAmount
	 * CorporateActionAmounts25.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts4#AccruedInterestAmount
	 * CorporateActionAmounts4.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts7#AccruedInterestAmount
	 * CorporateActionAmounts7.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#AccruedInterestAmount
	 * CorporateActionAmounts10.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts14#AccruedInterestAmount
	 * CorporateActionAmounts14.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts15#AccruedInterestAmount
	 * CorporateActionAmounts15.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts18#AccruedInterestAmount
	 * CorporateActionAmounts18.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts21#AccruedInterestAmount
	 * CorporateActionAmounts21.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts26#AccruedInterestAmount
	 * CorporateActionAmounts26.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceAmounts1#AccruedInterestAmount
	 * BalanceAmounts1.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceAmounts5#AccruedInterestAmount
	 * BalanceAmounts5.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace2#AccruedInterestAmount
	 * AggregateBalancePerSafekeepingPlace2.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation2#AccruedInterestAmount
	 * AggregateBalanceInformation2.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace4#AccruedInterestAmount
	 * AggregateBalancePerSafekeepingPlace4.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation3#AccruedInterestAmount
	 * AggregateBalanceInformation3.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceAmounts3#AccruedInterestAmount
	 * BalanceAmounts3.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceAmounts4#AccruedInterestAmount
	 * BalanceAmounts4.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1#AccruedInterestAmount
	 * AggregateBalancePerSafekeepingPlace1.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation1#AccruedInterestAmount
	 * AggregateBalanceInformation1.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace3#AccruedInterestAmount
	 * AggregateBalancePerSafekeepingPlace3.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation4#AccruedInterestAmount
	 * AggregateBalanceInformation4.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3#AccruedInterestAmount
	 * SecuritiesFinancingTransactionDetails3.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts4#AccruedInterestAmount
	 * OtherAmounts4.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5#AccruedInterestAmount
	 * SecuritiesFinancingTransactionDetails5.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts5#AccruedInterestAmount
	 * OtherAmounts5.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1#AccruedInterestAmount
	 * SecuritiesFinancingTransactionDetails1.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11#AccruedInterestAmount
	 * SecuritiesFinancingTransactionDetails11.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts17#AccruedInterestAmount
	 * OtherAmounts17.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14#AccruedInterestAmount
	 * SecuritiesFinancingTransactionDetails14.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts23#AccruedInterestAmount
	 * OtherAmounts23.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts3#AccruedInterestAmount
	 * OtherAmounts3.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4#AccruedInterestAmount
	 * SecuritiesFinancingTransactionDetails4.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts7#AccruedInterestAmount
	 * OtherAmounts7.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts9#AccruedInterestAmount
	 * OtherAmounts9.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts10#AccruedInterestAmount
	 * OtherAmounts10.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts18#AccruedInterestAmount
	 * OtherAmounts18.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts24#AccruedInterestAmount
	 * OtherAmounts24.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts13#AccruedInterestAmount
	 * OtherAmounts13.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails6#AccruedInterestAmount
	 * TransactionDetails6.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails18#AccruedInterestAmount
	 * TransactionDetails18.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails24#AccruedInterestAmount
	 * TransactionDetails24.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails34#AccruedInterestAmount
	 * TransactionDetails34.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails37#AccruedInterestAmount
	 * TransactionDetails37.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails48#AccruedInterestAmount
	 * TransactionDetails48.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails57#AccruedInterestAmount
	 * TransactionDetails57.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails60#AccruedInterestAmount
	 * TransactionDetails60.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts1#AccruedInterestAmount
	 * OtherAmounts1.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order16#AccruedInterestAmount
	 * Order16.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order14#AccruedInterestAmount
	 * Order14.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#AccruedInterestAmount
	 * SecuritiesFinancing10.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts2#AccruedInterestAmount
	 * OtherAmounts2.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails7#AccruedInterestAmount
	 * SecuritiesFinancingTransactionDetails7.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts8#AccruedInterestAmount
	 * OtherAmounts8.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestAmount1#AccruedInterestAmount
	 * InterestAmount1.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestAmount2#AccruedInterestAmount
	 * InterestAmount2.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation1#AccruedInterestAmount
	 * InterestCalculation1.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation2#AccruedInterestAmount
	 * InterestCalculation2.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SummaryAmounts1#TotalAccruedInterestAmount
	 * SummaryAmounts1.TotalAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralAmount1#AccruedInterestAmount
	 * CollateralAmount1.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#AccruedInterestAmount
	 * SecuritiesFinancingTransactionDetails19.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#AccruedInterestAmount
	 * SecuritiesFinancingTransactionDetails20.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9#AccruedInterestAmount
	 * SecuritiesFinancingTransactionDetails9.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts11#AccruedInterestAmount
	 * OtherAmounts11.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts6#AccruedInterestAmount
	 * OtherAmounts6.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts15#AccruedInterestAmount
	 * OtherAmounts15.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts22#AccruedInterestAmount
	 * OtherAmounts22.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg2#AccruedInterestAmount
	 * TradeLeg2.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg5#AccruedInterestAmount
	 * TradeLeg5.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg1#AccruedInterestAmount
	 * TradeLeg1.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg3#AccruedInterestAmount
	 * TradeLeg3.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg6#AccruedInterestAmount
	 * TradeLeg6.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails51#AccruedInterestAmount
	 * TransactionDetails51.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1#AccruedInterestAmount
	 * SecuritiesFinancing1.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails63#AccruedInterestAmount
	 * TransactionDetails63.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts29#AccruedInterestAmount
	 * CorporateActionAmounts29.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts27#AccruedInterestAmount
	 * CorporateActionAmounts27.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#AccruedInterestAmount
	 * CorporateActionAmounts28.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order17#AccruedInterestAmount
	 * Order17.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order18#AccruedInterestAmount
	 * Order18.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts33#AccruedInterestAmount
	 * CorporateActionAmounts33.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts32#AccruedInterestAmount
	 * CorporateActionAmounts32.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts35#AccruedInterestAmount
	 * CorporateActionAmounts35.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails68#AccruedInterestAmount
	 * TransactionDetails68.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg8#AccruedInterestAmount
	 * TradeLeg8.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg9#AccruedInterestAmount
	 * TradeLeg9.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation3#AccruedInterestAmount
	 * InterestCalculation3.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails78#AccruedInterestAmount
	 * TransactionDetails78.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts28#AccruedInterestAmount
	 * OtherAmounts28.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts30#AccruedInterestAmount
	 * OtherAmounts30.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28#AccruedInterestAmount
	 * SecuritiesFinancingTransactionDetails28.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts31#AccruedInterestAmount
	 * OtherAmounts31.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#AccruedInterestAmount
	 * SecuritiesFinancingTransactionDetails27.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails29#AccruedInterestAmount
	 * SecuritiesFinancingTransactionDetails29.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts32#AccruedInterestAmount
	 * OtherAmounts32.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts29#AccruedInterestAmount
	 * OtherAmounts29.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#AccruedInterestAmount
	 * CorporateActionAmounts37.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts36#AccruedInterestAmount
	 * CorporateActionAmounts36.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice21#AccruedInterestNAV
	 * UnitPrice21.AccruedInterestNAV}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts38#AccruedInterestAmount
	 * CorporateActionAmounts38.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation4#AccruedInterestAmount
	 * InterestCalculation4.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts39#AccruedInterestAmount
	 * CorporateActionAmounts39.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts41#AccruedInterestAmount
	 * CorporateActionAmounts41.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts40#AccruedInterestAmount
	 * CorporateActionAmounts40.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts35#AccruedInterestAmount
	 * OtherAmounts35.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32#AccruedInterestAmount
	 * SecuritiesFinancingTransactionDetails32.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30#AccruedInterestAmount
	 * SecuritiesFinancingTransactionDetails30.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts34#AccruedInterestAmount
	 * OtherAmounts34.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts38#AccruedInterestAmount
	 * OtherAmounts38.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts36#AccruedInterestAmount
	 * OtherAmounts36.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails34#AccruedInterestAmount
	 * SecuritiesFinancingTransactionDetails34.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts33#AccruedInterestAmount
	 * OtherAmounts33.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails91#AccruedInterestAmount
	 * TransactionDetails91.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails95#AccruedInterestAmount
	 * TransactionDetails95.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails98#AccruedInterestAmount
	 * TransactionDetails98.AccruedInterestAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccruedInterestAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Interest amount that has accrued in between coupon payment periods."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AccruedInterestAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.UnitPrice3.AccruedInterestNAV, com.tools20022.repository.msg.UnitPrice12.AccruedInterestNAV,
					com.tools20022.repository.msg.OtherAmounts12.AccruedInterestAmount, com.tools20022.repository.msg.OtherAmounts14.AccruedInterestAmount, com.tools20022.repository.msg.OtherAmounts20.AccruedInterestAmount,
					com.tools20022.repository.msg.CorporateActionAmounts2.AccruedInterestAmount, com.tools20022.repository.msg.CorporateActionAmounts5.AccruedInterestAmount,
					com.tools20022.repository.msg.CorporateActionAmounts11.AccruedInterestAmount, com.tools20022.repository.msg.CorporateActionAmounts12.AccruedInterestAmount,
					com.tools20022.repository.msg.CorporateActionAmounts17.AccruedInterestAmount, com.tools20022.repository.msg.CorporateActionAmounts20.AccruedInterestAmount,
					com.tools20022.repository.msg.CorporateActionAmounts23.AccruedInterestAmount, com.tools20022.repository.msg.CorporateActionAmounts24.AccruedInterestAmount,
					com.tools20022.repository.msg.CorporateActionAmounts3.AccruedInterestAmount, com.tools20022.repository.msg.CorporateActionAmounts6.AccruedInterestAmount,
					com.tools20022.repository.msg.CorporateActionAmounts9.AccruedInterestAmount, com.tools20022.repository.msg.CorporateActionAmounts13.AccruedInterestAmount,
					com.tools20022.repository.msg.CorporateActionAmounts16.AccruedInterestAmount, com.tools20022.repository.msg.CorporateActionAmounts19.AccruedInterestAmount,
					com.tools20022.repository.msg.CorporateActionAmounts22.AccruedInterestAmount, com.tools20022.repository.msg.CorporateActionAmounts25.AccruedInterestAmount,
					com.tools20022.repository.msg.CorporateActionAmounts4.AccruedInterestAmount, com.tools20022.repository.msg.CorporateActionAmounts7.AccruedInterestAmount,
					com.tools20022.repository.msg.CorporateActionAmounts10.AccruedInterestAmount, com.tools20022.repository.msg.CorporateActionAmounts14.AccruedInterestAmount,
					com.tools20022.repository.msg.CorporateActionAmounts15.AccruedInterestAmount, com.tools20022.repository.msg.CorporateActionAmounts18.AccruedInterestAmount,
					com.tools20022.repository.msg.CorporateActionAmounts21.AccruedInterestAmount, com.tools20022.repository.msg.CorporateActionAmounts26.AccruedInterestAmount,
					com.tools20022.repository.msg.BalanceAmounts1.AccruedInterestAmount, com.tools20022.repository.msg.BalanceAmounts5.AccruedInterestAmount,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace2.AccruedInterestAmount, com.tools20022.repository.msg.AggregateBalanceInformation2.AccruedInterestAmount,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace4.AccruedInterestAmount, com.tools20022.repository.msg.AggregateBalanceInformation3.AccruedInterestAmount,
					com.tools20022.repository.msg.BalanceAmounts3.AccruedInterestAmount, com.tools20022.repository.msg.BalanceAmounts4.AccruedInterestAmount,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1.AccruedInterestAmount, com.tools20022.repository.msg.AggregateBalanceInformation1.AccruedInterestAmount,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace3.AccruedInterestAmount, com.tools20022.repository.msg.AggregateBalanceInformation4.AccruedInterestAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3.AccruedInterestAmount, com.tools20022.repository.msg.OtherAmounts4.AccruedInterestAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5.AccruedInterestAmount, com.tools20022.repository.msg.OtherAmounts5.AccruedInterestAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1.AccruedInterestAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11.AccruedInterestAmount,
					com.tools20022.repository.msg.OtherAmounts17.AccruedInterestAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14.AccruedInterestAmount,
					com.tools20022.repository.msg.OtherAmounts23.AccruedInterestAmount, com.tools20022.repository.msg.OtherAmounts3.AccruedInterestAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4.AccruedInterestAmount, com.tools20022.repository.msg.OtherAmounts7.AccruedInterestAmount,
					com.tools20022.repository.msg.OtherAmounts9.AccruedInterestAmount, com.tools20022.repository.msg.OtherAmounts10.AccruedInterestAmount, com.tools20022.repository.msg.OtherAmounts18.AccruedInterestAmount,
					com.tools20022.repository.msg.OtherAmounts24.AccruedInterestAmount, com.tools20022.repository.msg.OtherAmounts13.AccruedInterestAmount, com.tools20022.repository.msg.TransactionDetails6.AccruedInterestAmount,
					com.tools20022.repository.msg.TransactionDetails18.AccruedInterestAmount, com.tools20022.repository.msg.TransactionDetails24.AccruedInterestAmount,
					com.tools20022.repository.msg.TransactionDetails34.AccruedInterestAmount, com.tools20022.repository.msg.TransactionDetails37.AccruedInterestAmount,
					com.tools20022.repository.msg.TransactionDetails48.AccruedInterestAmount, com.tools20022.repository.msg.TransactionDetails57.AccruedInterestAmount,
					com.tools20022.repository.msg.TransactionDetails60.AccruedInterestAmount, com.tools20022.repository.msg.OtherAmounts1.AccruedInterestAmount, com.tools20022.repository.msg.Order16.AccruedInterestAmount,
					com.tools20022.repository.msg.Order14.AccruedInterestAmount, com.tools20022.repository.msg.SecuritiesFinancing10.AccruedInterestAmount, com.tools20022.repository.msg.OtherAmounts2.AccruedInterestAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails7.AccruedInterestAmount, com.tools20022.repository.msg.OtherAmounts8.AccruedInterestAmount,
					com.tools20022.repository.msg.InterestAmount1.AccruedInterestAmount, com.tools20022.repository.msg.InterestAmount2.AccruedInterestAmount, com.tools20022.repository.msg.InterestCalculation1.AccruedInterestAmount,
					com.tools20022.repository.msg.InterestCalculation2.AccruedInterestAmount, com.tools20022.repository.msg.SummaryAmounts1.TotalAccruedInterestAmount, com.tools20022.repository.msg.CollateralAmount1.AccruedInterestAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.AccruedInterestAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20.AccruedInterestAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9.AccruedInterestAmount, com.tools20022.repository.msg.OtherAmounts11.AccruedInterestAmount,
					com.tools20022.repository.msg.OtherAmounts6.AccruedInterestAmount, com.tools20022.repository.msg.OtherAmounts15.AccruedInterestAmount, com.tools20022.repository.msg.OtherAmounts22.AccruedInterestAmount,
					com.tools20022.repository.msg.TradeLeg2.AccruedInterestAmount, com.tools20022.repository.msg.TradeLeg5.AccruedInterestAmount, com.tools20022.repository.msg.TradeLeg1.AccruedInterestAmount,
					com.tools20022.repository.msg.TradeLeg3.AccruedInterestAmount, com.tools20022.repository.msg.TradeLeg6.AccruedInterestAmount, com.tools20022.repository.msg.TransactionDetails51.AccruedInterestAmount,
					com.tools20022.repository.msg.SecuritiesFinancing1.AccruedInterestAmount, com.tools20022.repository.msg.TransactionDetails63.AccruedInterestAmount,
					com.tools20022.repository.msg.CorporateActionAmounts29.AccruedInterestAmount, com.tools20022.repository.msg.CorporateActionAmounts27.AccruedInterestAmount,
					com.tools20022.repository.msg.CorporateActionAmounts28.AccruedInterestAmount, com.tools20022.repository.msg.Order17.AccruedInterestAmount, com.tools20022.repository.msg.Order18.AccruedInterestAmount,
					com.tools20022.repository.msg.CorporateActionAmounts33.AccruedInterestAmount, com.tools20022.repository.msg.CorporateActionAmounts32.AccruedInterestAmount,
					com.tools20022.repository.msg.CorporateActionAmounts35.AccruedInterestAmount, com.tools20022.repository.msg.TransactionDetails68.AccruedInterestAmount, com.tools20022.repository.msg.TradeLeg8.AccruedInterestAmount,
					com.tools20022.repository.msg.TradeLeg9.AccruedInterestAmount, com.tools20022.repository.msg.InterestCalculation3.AccruedInterestAmount, com.tools20022.repository.msg.TransactionDetails78.AccruedInterestAmount,
					com.tools20022.repository.msg.OtherAmounts28.AccruedInterestAmount, com.tools20022.repository.msg.OtherAmounts30.AccruedInterestAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28.AccruedInterestAmount, com.tools20022.repository.msg.OtherAmounts31.AccruedInterestAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27.AccruedInterestAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails29.AccruedInterestAmount,
					com.tools20022.repository.msg.OtherAmounts32.AccruedInterestAmount, com.tools20022.repository.msg.OtherAmounts29.AccruedInterestAmount, com.tools20022.repository.msg.CorporateActionAmounts37.AccruedInterestAmount,
					com.tools20022.repository.msg.CorporateActionAmounts36.AccruedInterestAmount, com.tools20022.repository.msg.UnitPrice21.AccruedInterestNAV, com.tools20022.repository.msg.CorporateActionAmounts38.AccruedInterestAmount,
					com.tools20022.repository.msg.InterestCalculation4.AccruedInterestAmount, com.tools20022.repository.msg.CorporateActionAmounts39.AccruedInterestAmount,
					com.tools20022.repository.msg.CorporateActionAmounts41.AccruedInterestAmount, com.tools20022.repository.msg.CorporateActionAmounts40.AccruedInterestAmount,
					com.tools20022.repository.msg.OtherAmounts35.AccruedInterestAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32.AccruedInterestAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30.AccruedInterestAmount, com.tools20022.repository.msg.OtherAmounts34.AccruedInterestAmount,
					com.tools20022.repository.msg.OtherAmounts38.AccruedInterestAmount, com.tools20022.repository.msg.OtherAmounts36.AccruedInterestAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails34.AccruedInterestAmount, com.tools20022.repository.msg.OtherAmounts33.AccruedInterestAmount,
					com.tools20022.repository.msg.TransactionDetails91.AccruedInterestAmount, com.tools20022.repository.msg.TransactionDetails95.AccruedInterestAmount,
					com.tools20022.repository.msg.TransactionDetails98.AccruedInterestAmount);
			elementContext_lazy = () -> Interest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccruedInterestAmount";
			definition = "Interest amount that has accrued in between coupon payment periods.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Calculation parameters used to obtain the interest amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#Interest
	 * InterestCalculation.Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus1#RateType
	 * RateTypeAndAmountAndStatus1.RateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus3#RateType
	 * RateTypeAndAmountAndStatus3.RateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus4#RateType
	 * RateTypeAndAmountAndStatus4.RateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus5#RateType
	 * RateTypeAndAmountAndStatus5.RateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus6#RateType
	 * RateTypeAndAmountAndStatus6.RateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus2#RateType
	 * RateTypeAndAmountAndStatus2.RateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus7#RateType
	 * RateTypeAndAmountAndStatus7.RateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus8#RateType
	 * RateTypeAndAmountAndStatus8.RateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus9#RateType
	 * RateTypeAndAmountAndStatus9.RateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus10#RateType
	 * RateTypeAndAmountAndStatus10.RateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus11#RateType
	 * RateTypeAndAmountAndStatus11.RateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus12#RateType
	 * RateTypeAndAmountAndStatus12.RateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus15#RateType
	 * RateTypeAndAmountAndStatus15.RateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus16#RateType
	 * RateTypeAndAmountAndStatus16.RateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus13#RateType
	 * RateTypeAndAmountAndStatus13.RateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus14#RateType
	 * RateTypeAndAmountAndStatus14.RateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus17#RateType
	 * RateTypeAndAmountAndStatus17.RateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus18#RateType
	 * RateTypeAndAmountAndStatus18.RateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus19#RateType
	 * RateTypeAndAmountAndStatus19.RateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus20#RateType
	 * RateTypeAndAmountAndStatus20.RateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus21#RateType
	 * RateTypeAndAmountAndStatus21.RateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11#ChargesRate
	 * SecuritiesFinancingTransactionDetails11.ChargesRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14#ChargesRate
	 * SecuritiesFinancingTransactionDetails14.ChargesRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction1#Interest
	 * EntryTransaction1.Interest}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry1#Interest
	 * ReportEntry1.Interest}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountReport9#Interest
	 * AccountReport9.Interest}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction2#Interest
	 * EntryTransaction2.Interest}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry2#Interest
	 * ReportEntry2.Interest}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountReport11#Interest
	 * AccountReport11.Interest}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InterestRecord1#Type
	 * InterestRecord1.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InterestRecord1#Rate
	 * InterestRecord1.Rate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction3#Interest
	 * EntryTransaction3.Interest}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry3#Interest
	 * ReportEntry3.Interest}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountReport12#Interest
	 * AccountReport12.Interest}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction4#Interest
	 * EntryTransaction4.Interest}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry4#Interest
	 * ReportEntry4.Interest}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountReport16#Interest
	 * AccountReport16.Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationEntry1#Interest
	 * NotificationEntry1.Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification2#Interest
	 * AccountNotification2.Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification5#Interest
	 * AccountNotification5.Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification7#Interest
	 * AccountNotification7.Interest}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.StatementEntry1#Interest
	 * StatementEntry1.Interest}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountStatement1#Interest
	 * AccountStatement1.Interest}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountStatement2#Interest
	 * AccountStatement2.Interest}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountStatement3#Interest
	 * AccountStatement3.Interest}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountStatement4#Interest
	 * AccountStatement4.Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestStatement1#InterestCalculationDetails
	 * InterestStatement1.InterestCalculationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestStatement2#InterestCalculationDetails
	 * InterestStatement2.InterestCalculationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#ChargesRate
	 * SecuritiesFinancingTransactionDetails19.ChargesRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#ChargesRate
	 * SecuritiesFinancingTransactionDetails20.ChargesRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountReport18#Interest
	 * AccountReport18.Interest}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountStatement5#Interest
	 * AccountStatement5.Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification11#Interest
	 * AccountNotification11.Interest}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry7#Interest
	 * ReportEntry7.Interest}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction7#Interest
	 * EntryTransaction7.Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestStatement3#InterestCalculation
	 * InterestStatement3.InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28#ChargesRate
	 * SecuritiesFinancingTransactionDetails28.ChargesRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#ChargesRate
	 * SecuritiesFinancingTransactionDetails27.ChargesRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountStatement6#Interest
	 * AccountStatement6.Interest}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountReport19#Interest
	 * AccountReport19.Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification12#Interest
	 * AccountNotification12.Interest}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry8#Interest
	 * ReportEntry8.Interest}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction8#Interest
	 * EntryTransaction8.Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus24#RateType
	 * RateTypeAndAmountAndStatus24.RateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus22#RateType
	 * RateTypeAndAmountAndStatus22.RateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus25#RateType
	 * RateTypeAndAmountAndStatus25.RateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus27#RateType
	 * RateTypeAndAmountAndStatus27.RateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus26#RateType
	 * RateTypeAndAmountAndStatus26.RateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus28#RateType
	 * RateTypeAndAmountAndStatus28.RateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus29#RateType
	 * RateTypeAndAmountAndStatus29.RateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestStatement4#InterestCalculation
	 * InterestStatement4.InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus32#RateType
	 * RateTypeAndAmountAndStatus32.RateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus31#RateType
	 * RateTypeAndAmountAndStatus31.RateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus33#RateType
	 * RateTypeAndAmountAndStatus33.RateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus36#RateType
	 * RateTypeAndAmountAndStatus36.RateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus35#RateType
	 * RateTypeAndAmountAndStatus35.RateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus30#RateType
	 * RateTypeAndAmountAndStatus30.RateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus34#RateType
	 * RateTypeAndAmountAndStatus34.RateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32#ChargesRate
	 * SecuritiesFinancingTransactionDetails32.ChargesRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30#ChargesRate
	 * SecuritiesFinancingTransactionDetails30.ChargesRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Calculation parameters used to obtain the interest amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd InterestCalculation = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RateTypeAndAmountAndStatus1.RateType, com.tools20022.repository.msg.RateTypeAndAmountAndStatus3.RateType,
					com.tools20022.repository.msg.RateTypeAndAmountAndStatus4.RateType, com.tools20022.repository.msg.RateTypeAndAmountAndStatus5.RateType, com.tools20022.repository.msg.RateTypeAndAmountAndStatus6.RateType,
					com.tools20022.repository.msg.RateTypeAndAmountAndStatus2.RateType, com.tools20022.repository.msg.RateTypeAndAmountAndStatus7.RateType, com.tools20022.repository.msg.RateTypeAndAmountAndStatus8.RateType,
					com.tools20022.repository.msg.RateTypeAndAmountAndStatus9.RateType, com.tools20022.repository.msg.RateTypeAndAmountAndStatus10.RateType, com.tools20022.repository.msg.RateTypeAndAmountAndStatus11.RateType,
					com.tools20022.repository.msg.RateTypeAndAmountAndStatus12.RateType, com.tools20022.repository.msg.RateTypeAndAmountAndStatus15.RateType, com.tools20022.repository.msg.RateTypeAndAmountAndStatus16.RateType,
					com.tools20022.repository.msg.RateTypeAndAmountAndStatus13.RateType, com.tools20022.repository.msg.RateTypeAndAmountAndStatus14.RateType, com.tools20022.repository.msg.RateTypeAndAmountAndStatus17.RateType,
					com.tools20022.repository.msg.RateTypeAndAmountAndStatus18.RateType, com.tools20022.repository.msg.RateTypeAndAmountAndStatus19.RateType, com.tools20022.repository.msg.RateTypeAndAmountAndStatus20.RateType,
					com.tools20022.repository.msg.RateTypeAndAmountAndStatus21.RateType, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11.ChargesRate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14.ChargesRate, com.tools20022.repository.msg.EntryTransaction1.Interest, com.tools20022.repository.msg.ReportEntry1.Interest,
					com.tools20022.repository.msg.AccountReport9.Interest, com.tools20022.repository.msg.EntryTransaction2.Interest, com.tools20022.repository.msg.ReportEntry2.Interest,
					com.tools20022.repository.msg.AccountReport11.Interest, com.tools20022.repository.msg.InterestRecord1.Type, com.tools20022.repository.msg.InterestRecord1.Rate, com.tools20022.repository.msg.EntryTransaction3.Interest,
					com.tools20022.repository.msg.ReportEntry3.Interest, com.tools20022.repository.msg.AccountReport12.Interest, com.tools20022.repository.msg.EntryTransaction4.Interest, com.tools20022.repository.msg.ReportEntry4.Interest,
					com.tools20022.repository.msg.AccountReport16.Interest, com.tools20022.repository.msg.NotificationEntry1.Interest, com.tools20022.repository.msg.AccountNotification2.Interest,
					com.tools20022.repository.msg.AccountNotification5.Interest, com.tools20022.repository.msg.AccountNotification7.Interest, com.tools20022.repository.msg.StatementEntry1.Interest,
					com.tools20022.repository.msg.AccountStatement1.Interest, com.tools20022.repository.msg.AccountStatement2.Interest, com.tools20022.repository.msg.AccountStatement3.Interest,
					com.tools20022.repository.msg.AccountStatement4.Interest, com.tools20022.repository.msg.InterestStatement1.InterestCalculationDetails, com.tools20022.repository.msg.InterestStatement2.InterestCalculationDetails,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.ChargesRate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20.ChargesRate,
					com.tools20022.repository.msg.AccountReport18.Interest, com.tools20022.repository.msg.AccountStatement5.Interest, com.tools20022.repository.msg.AccountNotification11.Interest,
					com.tools20022.repository.msg.ReportEntry7.Interest, com.tools20022.repository.msg.EntryTransaction7.Interest, com.tools20022.repository.msg.InterestStatement3.InterestCalculation,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28.ChargesRate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27.ChargesRate,
					com.tools20022.repository.msg.AccountStatement6.Interest, com.tools20022.repository.msg.AccountReport19.Interest, com.tools20022.repository.msg.AccountNotification12.Interest,
					com.tools20022.repository.msg.ReportEntry8.Interest, com.tools20022.repository.msg.EntryTransaction8.Interest, com.tools20022.repository.msg.RateTypeAndAmountAndStatus24.RateType,
					com.tools20022.repository.msg.RateTypeAndAmountAndStatus22.RateType, com.tools20022.repository.msg.RateTypeAndAmountAndStatus25.RateType, com.tools20022.repository.msg.RateTypeAndAmountAndStatus27.RateType,
					com.tools20022.repository.msg.RateTypeAndAmountAndStatus26.RateType, com.tools20022.repository.msg.RateTypeAndAmountAndStatus28.RateType, com.tools20022.repository.msg.RateTypeAndAmountAndStatus29.RateType,
					com.tools20022.repository.msg.InterestStatement4.InterestCalculation, com.tools20022.repository.msg.RateTypeAndAmountAndStatus32.RateType, com.tools20022.repository.msg.RateTypeAndAmountAndStatus31.RateType,
					com.tools20022.repository.msg.RateTypeAndAmountAndStatus33.RateType, com.tools20022.repository.msg.RateTypeAndAmountAndStatus36.RateType, com.tools20022.repository.msg.RateTypeAndAmountAndStatus35.RateType,
					com.tools20022.repository.msg.RateTypeAndAmountAndStatus30.RateType, com.tools20022.repository.msg.RateTypeAndAmountAndStatus34.RateType,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32.ChargesRate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30.ChargesRate);
			elementContext_lazy = () -> Interest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InterestCalculation";
			definition = "Calculation parameters used to obtain the interest amount.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InterestCalculation.Interest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Amount of money representing interest payments.
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
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus1#Amount
	 * RateTypeAndAmountAndStatus1.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus3#Amount
	 * RateTypeAndAmountAndStatus3.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat2Choice#Amount
	 * InterestRateUsedForPaymentFormat2Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus4#Amount
	 * RateTypeAndAmountAndStatus4.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus5#Amount
	 * RateTypeAndAmountAndStatus5.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus6#Amount
	 * RateTypeAndAmountAndStatus6.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#InterestAmount
	 * CorporateActionAmounts2.InterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus2#Amount
	 * RateTypeAndAmountAndStatus2.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus7#Amount
	 * RateTypeAndAmountAndStatus7.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat3Choice#Amount
	 * InterestRateUsedForPaymentFormat3Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus8#Amount
	 * RateTypeAndAmountAndStatus8.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus9#Amount
	 * RateTypeAndAmountAndStatus9.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus10#Amount
	 * RateTypeAndAmountAndStatus10.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts5#InterestAmount
	 * CorporateActionAmounts5.InterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus11#Amount
	 * RateTypeAndAmountAndStatus11.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts11#InterestAmount
	 * CorporateActionAmounts11.InterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus12#Amount
	 * RateTypeAndAmountAndStatus12.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#InterestAmount
	 * CorporateActionAmounts12.InterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts17#InterestAmount
	 * CorporateActionAmounts17.InterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts20#InterestAmount
	 * CorporateActionAmounts20.InterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus15#Amount
	 * RateTypeAndAmountAndStatus15.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus16#Amount
	 * RateTypeAndAmountAndStatus16.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts23#InterestAmount
	 * CorporateActionAmounts23.InterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus13#Amount
	 * RateTypeAndAmountAndStatus13.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus14#Amount
	 * RateTypeAndAmountAndStatus14.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus17#Amount
	 * RateTypeAndAmountAndStatus17.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus18#Amount
	 * RateTypeAndAmountAndStatus18.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus19#Amount
	 * RateTypeAndAmountAndStatus19.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts24#InterestAmount
	 * CorporateActionAmounts24.InterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus20#Amount
	 * RateTypeAndAmountAndStatus20.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus21#Amount
	 * RateTypeAndAmountAndStatus21.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat1Choice#Amount
	 * InterestRateUsedForPaymentFormat1Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts3#InterestAmount
	 * CorporateActionAmounts3.InterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat4Choice#Amount
	 * InterestRateUsedForPaymentFormat4Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts6#InterestAmount
	 * CorporateActionAmounts6.InterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat5Choice#Amount
	 * InterestRateUsedForPaymentFormat5Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts9#InterestAmount
	 * CorporateActionAmounts9.InterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat6Choice#Amount
	 * InterestRateUsedForPaymentFormat6Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts13#InterestAmount
	 * CorporateActionAmounts13.InterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts16#InterestAmount
	 * CorporateActionAmounts16.InterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts19#InterestAmount
	 * CorporateActionAmounts19.InterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#InterestAmount
	 * CorporateActionAmounts22.InterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts25#InterestAmount
	 * CorporateActionAmounts25.InterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts4#InterestAmount
	 * CorporateActionAmounts4.InterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts7#InterestAmount
	 * CorporateActionAmounts7.InterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#InterestAmount
	 * CorporateActionAmounts10.InterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts14#InterestAmount
	 * CorporateActionAmounts14.InterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts15#InterestAmount
	 * CorporateActionAmounts15.InterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts18#InterestAmount
	 * CorporateActionAmounts18.InterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts21#InterestAmount
	 * CorporateActionAmounts21.InterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts26#InterestAmount
	 * CorporateActionAmounts26.InterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#BorrowingInterestAmount
	 * OtherAmounts16.BorrowingInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionInterest1#Amount
	 * TransactionInterest1.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionInterest2#Amount
	 * TransactionInterest2.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InterestRecord1#Amount
	 * InterestRecord1.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#InterestAmount
	 * CorporateActionAmounts1.InterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestResult1#InterestDueToA
	 * InterestResult1.InterestDueToA}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestResult1#InterestDueToB
	 * InterestResult1.InterestDueToB}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation1#AggregatedInterestAmount
	 * InterestCalculation1.AggregatedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestStatement1#TotalInterestAmountDueToA
	 * InterestStatement1.TotalInterestAmountDueToA}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestStatement1#TotalInterestAmountDueToB
	 * InterestStatement1.TotalInterestAmountDueToB}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation2#AggregatedInterestAmount
	 * InterestCalculation2.AggregatedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestStatement2#TotalInterestAmountDueToA
	 * InterestStatement2.TotalInterestAmountDueToA}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestStatement2#TotalInterestAmountDueToB
	 * InterestStatement2.TotalInterestAmountDueToB}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetPosition1#AccruedInterestAmount
	 * NetPosition1.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetPosition2#AccruedInterestAmount
	 * NetPosition2.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts29#InterestAmount
	 * CorporateActionAmounts29.InterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts27#InterestAmount
	 * CorporateActionAmounts27.InterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#InterestAmount
	 * CorporateActionAmounts28.InterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts33#InterestAmount
	 * CorporateActionAmounts33.InterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts32#InterestAmount
	 * CorporateActionAmounts32.InterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts35#InterestAmount
	 * CorporateActionAmounts35.InterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetPosition3#AccruedInterestAmount
	 * NetPosition3.AccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestStatement3#TotalInterestAmountDueToA
	 * InterestStatement3.TotalInterestAmountDueToA}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestStatement3#TotalInterestAmountDueToB
	 * InterestStatement3.TotalInterestAmountDueToB}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation3#AggregatedInterestAmount
	 * InterestCalculation3.AggregatedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat8Choice#Amount
	 * InterestRateUsedForPaymentFormat8Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus24#Amount
	 * RateTypeAndAmountAndStatus24.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus22#Amount
	 * RateTypeAndAmountAndStatus22.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus25#Amount
	 * RateTypeAndAmountAndStatus25.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus27#Amount
	 * RateTypeAndAmountAndStatus27.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#InterestAmount
	 * CorporateActionAmounts37.InterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus26#Amount
	 * RateTypeAndAmountAndStatus26.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat7Choice#Amount
	 * InterestRateUsedForPaymentFormat7Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts36#InterestAmount
	 * CorporateActionAmounts36.InterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus28#Amount
	 * RateTypeAndAmountAndStatus28.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus29#Amount
	 * RateTypeAndAmountAndStatus29.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts38#InterestAmount
	 * CorporateActionAmounts38.InterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestStatement4#TotalInterestAmountDueToA
	 * InterestStatement4.TotalInterestAmountDueToA}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestStatement4#TotalInterestAmountDueToB
	 * InterestStatement4.TotalInterestAmountDueToB}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation4#AggregatedInterestAmount
	 * InterestCalculation4.AggregatedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat9Choice#Amount
	 * InterestRateUsedForPaymentFormat9Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus32#Amount
	 * RateTypeAndAmountAndStatus32.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus31#Amount
	 * RateTypeAndAmountAndStatus31.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts39#InterestAmount
	 * CorporateActionAmounts39.InterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus33#Amount
	 * RateTypeAndAmountAndStatus33.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts41#InterestAmount
	 * CorporateActionAmounts41.InterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts40#InterestAmount
	 * CorporateActionAmounts40.InterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus36#Amount
	 * RateTypeAndAmountAndStatus36.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus35#Amount
	 * RateTypeAndAmountAndStatus35.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus30#Amount
	 * RateTypeAndAmountAndStatus30.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat10Choice#Amount
	 * InterestRateUsedForPaymentFormat10Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus34#Amount
	 * RateTypeAndAmountAndStatus34.Amount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money representing interest payments."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Amount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RateTypeAndAmountAndStatus1.Amount, com.tools20022.repository.msg.RateTypeAndAmountAndStatus3.Amount,
					com.tools20022.repository.choice.InterestRateUsedForPaymentFormat2Choice.Amount, com.tools20022.repository.msg.RateTypeAndAmountAndStatus4.Amount, com.tools20022.repository.msg.RateTypeAndAmountAndStatus5.Amount,
					com.tools20022.repository.msg.RateTypeAndAmountAndStatus6.Amount, com.tools20022.repository.msg.CorporateActionAmounts2.InterestAmount, com.tools20022.repository.msg.RateTypeAndAmountAndStatus2.Amount,
					com.tools20022.repository.msg.RateTypeAndAmountAndStatus7.Amount, com.tools20022.repository.choice.InterestRateUsedForPaymentFormat3Choice.Amount, com.tools20022.repository.msg.RateTypeAndAmountAndStatus8.Amount,
					com.tools20022.repository.msg.RateTypeAndAmountAndStatus9.Amount, com.tools20022.repository.msg.RateTypeAndAmountAndStatus10.Amount, com.tools20022.repository.msg.CorporateActionAmounts5.InterestAmount,
					com.tools20022.repository.msg.RateTypeAndAmountAndStatus11.Amount, com.tools20022.repository.msg.CorporateActionAmounts11.InterestAmount, com.tools20022.repository.msg.RateTypeAndAmountAndStatus12.Amount,
					com.tools20022.repository.msg.CorporateActionAmounts12.InterestAmount, com.tools20022.repository.msg.CorporateActionAmounts17.InterestAmount, com.tools20022.repository.msg.CorporateActionAmounts20.InterestAmount,
					com.tools20022.repository.msg.RateTypeAndAmountAndStatus15.Amount, com.tools20022.repository.msg.RateTypeAndAmountAndStatus16.Amount, com.tools20022.repository.msg.CorporateActionAmounts23.InterestAmount,
					com.tools20022.repository.msg.RateTypeAndAmountAndStatus13.Amount, com.tools20022.repository.msg.RateTypeAndAmountAndStatus14.Amount, com.tools20022.repository.msg.RateTypeAndAmountAndStatus17.Amount,
					com.tools20022.repository.msg.RateTypeAndAmountAndStatus18.Amount, com.tools20022.repository.msg.RateTypeAndAmountAndStatus19.Amount, com.tools20022.repository.msg.CorporateActionAmounts24.InterestAmount,
					com.tools20022.repository.msg.RateTypeAndAmountAndStatus20.Amount, com.tools20022.repository.msg.RateTypeAndAmountAndStatus21.Amount, com.tools20022.repository.choice.InterestRateUsedForPaymentFormat1Choice.Amount,
					com.tools20022.repository.msg.CorporateActionAmounts3.InterestAmount, com.tools20022.repository.choice.InterestRateUsedForPaymentFormat4Choice.Amount,
					com.tools20022.repository.msg.CorporateActionAmounts6.InterestAmount, com.tools20022.repository.choice.InterestRateUsedForPaymentFormat5Choice.Amount,
					com.tools20022.repository.msg.CorporateActionAmounts9.InterestAmount, com.tools20022.repository.choice.InterestRateUsedForPaymentFormat6Choice.Amount,
					com.tools20022.repository.msg.CorporateActionAmounts13.InterestAmount, com.tools20022.repository.msg.CorporateActionAmounts16.InterestAmount, com.tools20022.repository.msg.CorporateActionAmounts19.InterestAmount,
					com.tools20022.repository.msg.CorporateActionAmounts22.InterestAmount, com.tools20022.repository.msg.CorporateActionAmounts25.InterestAmount, com.tools20022.repository.msg.CorporateActionAmounts4.InterestAmount,
					com.tools20022.repository.msg.CorporateActionAmounts7.InterestAmount, com.tools20022.repository.msg.CorporateActionAmounts10.InterestAmount, com.tools20022.repository.msg.CorporateActionAmounts14.InterestAmount,
					com.tools20022.repository.msg.CorporateActionAmounts15.InterestAmount, com.tools20022.repository.msg.CorporateActionAmounts18.InterestAmount, com.tools20022.repository.msg.CorporateActionAmounts21.InterestAmount,
					com.tools20022.repository.msg.CorporateActionAmounts26.InterestAmount, com.tools20022.repository.msg.OtherAmounts16.BorrowingInterestAmount, com.tools20022.repository.msg.TransactionInterest1.Amount,
					com.tools20022.repository.msg.TransactionInterest2.Amount, com.tools20022.repository.msg.InterestRecord1.Amount, com.tools20022.repository.msg.CorporateActionAmounts1.InterestAmount,
					com.tools20022.repository.msg.InterestResult1.InterestDueToA, com.tools20022.repository.msg.InterestResult1.InterestDueToB, com.tools20022.repository.msg.InterestCalculation1.AggregatedInterestAmount,
					com.tools20022.repository.msg.InterestStatement1.TotalInterestAmountDueToA, com.tools20022.repository.msg.InterestStatement1.TotalInterestAmountDueToB,
					com.tools20022.repository.msg.InterestCalculation2.AggregatedInterestAmount, com.tools20022.repository.msg.InterestStatement2.TotalInterestAmountDueToA,
					com.tools20022.repository.msg.InterestStatement2.TotalInterestAmountDueToB, com.tools20022.repository.msg.NetPosition1.AccruedInterestAmount, com.tools20022.repository.msg.NetPosition2.AccruedInterestAmount,
					com.tools20022.repository.msg.CorporateActionAmounts29.InterestAmount, com.tools20022.repository.msg.CorporateActionAmounts27.InterestAmount, com.tools20022.repository.msg.CorporateActionAmounts28.InterestAmount,
					com.tools20022.repository.msg.CorporateActionAmounts33.InterestAmount, com.tools20022.repository.msg.CorporateActionAmounts32.InterestAmount, com.tools20022.repository.msg.CorporateActionAmounts35.InterestAmount,
					com.tools20022.repository.msg.NetPosition3.AccruedInterestAmount, com.tools20022.repository.msg.InterestStatement3.TotalInterestAmountDueToA, com.tools20022.repository.msg.InterestStatement3.TotalInterestAmountDueToB,
					com.tools20022.repository.msg.InterestCalculation3.AggregatedInterestAmount, com.tools20022.repository.choice.InterestRateUsedForPaymentFormat8Choice.Amount,
					com.tools20022.repository.msg.RateTypeAndAmountAndStatus24.Amount, com.tools20022.repository.msg.RateTypeAndAmountAndStatus22.Amount, com.tools20022.repository.msg.RateTypeAndAmountAndStatus25.Amount,
					com.tools20022.repository.msg.RateTypeAndAmountAndStatus27.Amount, com.tools20022.repository.msg.CorporateActionAmounts37.InterestAmount, com.tools20022.repository.msg.RateTypeAndAmountAndStatus26.Amount,
					com.tools20022.repository.choice.InterestRateUsedForPaymentFormat7Choice.Amount, com.tools20022.repository.msg.CorporateActionAmounts36.InterestAmount, com.tools20022.repository.msg.RateTypeAndAmountAndStatus28.Amount,
					com.tools20022.repository.msg.RateTypeAndAmountAndStatus29.Amount, com.tools20022.repository.msg.CorporateActionAmounts38.InterestAmount, com.tools20022.repository.msg.InterestStatement4.TotalInterestAmountDueToA,
					com.tools20022.repository.msg.InterestStatement4.TotalInterestAmountDueToB, com.tools20022.repository.msg.InterestCalculation4.AggregatedInterestAmount,
					com.tools20022.repository.choice.InterestRateUsedForPaymentFormat9Choice.Amount, com.tools20022.repository.msg.RateTypeAndAmountAndStatus32.Amount, com.tools20022.repository.msg.RateTypeAndAmountAndStatus31.Amount,
					com.tools20022.repository.msg.CorporateActionAmounts39.InterestAmount, com.tools20022.repository.msg.RateTypeAndAmountAndStatus33.Amount, com.tools20022.repository.msg.CorporateActionAmounts41.InterestAmount,
					com.tools20022.repository.msg.CorporateActionAmounts40.InterestAmount, com.tools20022.repository.msg.RateTypeAndAmountAndStatus36.Amount, com.tools20022.repository.msg.RateTypeAndAmountAndStatus35.Amount,
					com.tools20022.repository.msg.RateTypeAndAmountAndStatus30.Amount, com.tools20022.repository.choice.InterestRateUsedForPaymentFormat10Choice.Amount, com.tools20022.repository.msg.RateTypeAndAmountAndStatus34.Amount);
			elementContext_lazy = () -> Interest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Amount of money representing interest payments.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * The actual interest rate used for the payment of the interest for the
	 * specified interest period.
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
	 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat2Choice#Rate
	 * InterestRateUsedForPaymentFormat2Choice.Rate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate4#InterestRateUsedForPayment
	 * CorporateActionRate4.InterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat3Choice#Rate
	 * InterestRateUsedForPaymentFormat3Choice.Rate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate10#InterestRateUsedForPayment
	 * CorporateActionRate10.InterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate20#InterestRateUsedForPayment
	 * CorporateActionRate20.InterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails2#InterestRateUsedForPayment
	 * RateDetails2.InterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate22#InterestRateUsedForPayment
	 * CorporateActionRate22.InterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails4#InterestRateUsedForPayment
	 * RateDetails4.InterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate26#InterestRateUsedForPayment
	 * CorporateActionRate26.InterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails7#InterestRateUsedForPayment
	 * RateDetails7.InterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate31#InterestRateUsedForPayment
	 * CorporateActionRate31.InterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails9#InterestRateUsedForPayment
	 * RateDetails9.InterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate38#InterestRateUsedForPayment
	 * CorporateActionRate38.InterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails11#InterestRateUsedForPayment
	 * RateDetails11.InterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate39#InterestRateUsedForPayment
	 * CorporateActionRate39.InterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails12#InterestRateUsedForPayment
	 * RateDetails12.InterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat1Choice#Rate
	 * InterestRateUsedForPaymentFormat1Choice.Rate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#InterestRateUsedForPayment
	 * CorporateActionRate5.InterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat4Choice#Rate
	 * InterestRateUsedForPaymentFormat4Choice.Rate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate12#InterestRateUsedForPayment
	 * CorporateActionRate12.InterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat5Choice#Rate
	 * InterestRateUsedForPaymentFormat5Choice.Rate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate15#InterestRateUsedForPayment
	 * CorporateActionRate15.InterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails3#InterestRateUsedForPayment
	 * RateDetails3.InterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat6Choice#Rate
	 * InterestRateUsedForPaymentFormat6Choice.Rate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate18#InterestRateUsedForPayment
	 * CorporateActionRate18.InterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails5#InterestRateUsedForPayment
	 * RateDetails5.InterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate25#InterestRateUsedForPayment
	 * CorporateActionRate25.InterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate30#InterestRateUsedForPayment
	 * CorporateActionRate30.InterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate37#InterestRateUsedForPayment
	 * CorporateActionRate37.InterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails10#InterestRateUsedForPayment
	 * RateDetails10.InterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate40#InterestRateUsedForPayment
	 * CorporateActionRate40.InterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails13#InterestRateUsedForPayment
	 * RateDetails13.InterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate36#InterestRateUsedForPayment
	 * CorporateActionRate36.InterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate42#InterestRateUsedForPayment
	 * CorporateActionRate42.InterestRateUsedForPayment}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateOrName1Choice#Rate
	 * RateOrName1Choice.Rate}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateOrName2Choice#Rate
	 * RateOrName2Choice.Rate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order16#AccruedInterestPercentage
	 * Order16.AccruedInterestPercentage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order14#AccruedInterestPercentage
	 * Order14.AccruedInterestPercentage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#AccruedInterestPercentage
	 * SecuritiesFinancing10.AccruedInterestPercentage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#InterestRate
	 * SecuritiesFinancing10.InterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#InterestForUsedPayment
	 * CorporateActionRate2.InterestForUsedPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialCard1#InterestRatePercent
	 * FinancialCard1.InterestRatePercent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestRate1Choice#FixedInterestRate
	 * InterestRate1Choice.FixedInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestAmount1#InterestRate
	 * InterestAmount1.InterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestAmount2#InterestRate
	 * InterestAmount2.InterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation1#EffectiveRate
	 * InterestCalculation1.EffectiveRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation2#EffectiveRate
	 * InterestCalculation2.EffectiveRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails15#InterestRateUsedForPayment
	 * RateDetails15.InterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate46#InterestRateUsedForPayment
	 * CorporateActionRate46.InterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate45#InterestRateUsedForPayment
	 * CorporateActionRate45.InterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate44#InterestRateUsedForPayment
	 * CorporateActionRate44.InterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails14#InterestRateUsedForPayment
	 * RateDetails14.InterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order17#AccruedInterestPercentage
	 * Order17.AccruedInterestPercentage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order18#AccruedInterestPercentage
	 * Order18.AccruedInterestPercentage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate60#InterestRateUsedForPayment
	 * CorporateActionRate60.InterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails18#InterestRateUsedForPayment
	 * RateDetails18.InterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate64#InterestRateUsedForPayment
	 * CorporateActionRate64.InterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails21#InterestRateUsedForPayment
	 * RateDetails21.InterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate57#InterestRateUsedForPayment
	 * CorporateActionRate57.InterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation3#EffectiveRate
	 * InterestCalculation3.EffectiveRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction1#DealRate
	 * UnsecuredMarketTransaction1.DealRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction1#FixedInterestRate
	 * OvernightIndexSwapTransaction1.FixedInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction1#DealRate
	 * SecuredMarketTransaction1.DealRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestRate2Choice#Fixed
	 * InterestRate2Choice.Fixed}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DebtInstrument2#InterestRate
	 * DebtInstrument2.InterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat8Choice#Rate
	 * InterestRateUsedForPaymentFormat8Choice.Rate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails23#InterestRateUsedForPayment
	 * RateDetails23.InterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate68#InterestRateUsedForPayment
	 * CorporateActionRate68.InterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate70#InterestRateUsedForPayment
	 * CorporateActionRate70.InterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat7Choice#Rate
	 * InterestRateUsedForPaymentFormat7Choice.Rate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate67#InterestRateUsedForPayment
	 * CorporateActionRate67.InterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails22#InterestRateUsedForPayment
	 * RateDetails22.InterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation4#EffectiveRate
	 * InterestCalculation4.EffectiveRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate74#InterestRateUsedForPayment
	 * CorporateActionRate74.InterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat9Choice#Rate
	 * InterestRateUsedForPaymentFormat9Choice.Rate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate79#InterestRateUsedForPayment
	 * CorporateActionRate79.InterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails24#InterestRateUsedForPayment
	 * RateDetails24.InterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails25#InterestRateUsedForPayment
	 * RateDetails25.InterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate76#InterestRateUsedForPayment
	 * CorporateActionRate76.InterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat10Choice#Rate
	 * InterestRateUsedForPaymentFormat10Choice.Rate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction2#DealRate
	 * UnsecuredMarketTransaction2.DealRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction2#DealRate
	 * SecuredMarketTransaction2.DealRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction3#DealRate
	 * UnsecuredMarketTransaction3.DealRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction3#FixedInterestRate
	 * OvernightIndexSwapTransaction3.FixedInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction3#DealRate
	 * SecuredMarketTransaction3.DealRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestRate6Choice#Fixed
	 * InterestRate6Choice.Fixed}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeInterest3#InterestRate
	 * DerivativeInterest3.InterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeInterest3#FirstLegInterestRate
	 * DerivativeInterest3.FirstLegInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeInterest3#OtherLegInterestRate
	 * DerivativeInterest3.OtherLegInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestRate8Choice#Fixed
	 * InterestRate8Choice.Fixed}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestRateDerivative5#InterestRateReference
	 * InterestRateDerivative5.InterestRateReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails26#InterestRateUsedForPayment
	 * RateDetails26.InterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate82#InterestRateUsedForPayment
	 * CorporateActionRate82.InterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate80#InterestRateUsedForPayment
	 * CorporateActionRate80.InterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails27#InterestRateUsedForPayment
	 * RateDetails27.InterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate81#InterestRateUsedForPayment
	 * CorporateActionRate81.InterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate83#InterestRateUsedForPayment
	 * CorporateActionRate83.InterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate84#InterestRateUsedForPayment
	 * CorporateActionRate84.InterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate85#InterestRateUsedForPayment
	 * CorporateActionRate85.InterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails28#InterestRateUsedForPayment
	 * RateDetails28.InterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails30#InterestRateUsedForPayment
	 * RateDetails30.InterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4#DealRate
	 * SecuredMarketTransaction4.DealRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction4#FixedInterestRate
	 * OvernightIndexSwapTransaction4.FixedInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4#DealRate
	 * UnsecuredMarketTransaction4.DealRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The actual interest rate used for the payment of the interest for the specified interest period."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Rate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.InterestRateUsedForPaymentFormat2Choice.Rate, com.tools20022.repository.msg.CorporateActionRate4.InterestRateUsedForPayment,
					com.tools20022.repository.choice.InterestRateUsedForPaymentFormat3Choice.Rate, com.tools20022.repository.msg.CorporateActionRate10.InterestRateUsedForPayment,
					com.tools20022.repository.msg.CorporateActionRate20.InterestRateUsedForPayment, com.tools20022.repository.msg.RateDetails2.InterestRateUsedForPayment,
					com.tools20022.repository.msg.CorporateActionRate22.InterestRateUsedForPayment, com.tools20022.repository.msg.RateDetails4.InterestRateUsedForPayment,
					com.tools20022.repository.msg.CorporateActionRate26.InterestRateUsedForPayment, com.tools20022.repository.msg.RateDetails7.InterestRateUsedForPayment,
					com.tools20022.repository.msg.CorporateActionRate31.InterestRateUsedForPayment, com.tools20022.repository.msg.RateDetails9.InterestRateUsedForPayment,
					com.tools20022.repository.msg.CorporateActionRate38.InterestRateUsedForPayment, com.tools20022.repository.msg.RateDetails11.InterestRateUsedForPayment,
					com.tools20022.repository.msg.CorporateActionRate39.InterestRateUsedForPayment, com.tools20022.repository.msg.RateDetails12.InterestRateUsedForPayment,
					com.tools20022.repository.choice.InterestRateUsedForPaymentFormat1Choice.Rate, com.tools20022.repository.msg.CorporateActionRate5.InterestRateUsedForPayment,
					com.tools20022.repository.choice.InterestRateUsedForPaymentFormat4Choice.Rate, com.tools20022.repository.msg.CorporateActionRate12.InterestRateUsedForPayment,
					com.tools20022.repository.choice.InterestRateUsedForPaymentFormat5Choice.Rate, com.tools20022.repository.msg.CorporateActionRate15.InterestRateUsedForPayment,
					com.tools20022.repository.msg.RateDetails3.InterestRateUsedForPayment, com.tools20022.repository.choice.InterestRateUsedForPaymentFormat6Choice.Rate,
					com.tools20022.repository.msg.CorporateActionRate18.InterestRateUsedForPayment, com.tools20022.repository.msg.RateDetails5.InterestRateUsedForPayment,
					com.tools20022.repository.msg.CorporateActionRate25.InterestRateUsedForPayment, com.tools20022.repository.msg.CorporateActionRate30.InterestRateUsedForPayment,
					com.tools20022.repository.msg.CorporateActionRate37.InterestRateUsedForPayment, com.tools20022.repository.msg.RateDetails10.InterestRateUsedForPayment,
					com.tools20022.repository.msg.CorporateActionRate40.InterestRateUsedForPayment, com.tools20022.repository.msg.RateDetails13.InterestRateUsedForPayment,
					com.tools20022.repository.msg.CorporateActionRate36.InterestRateUsedForPayment, com.tools20022.repository.msg.CorporateActionRate42.InterestRateUsedForPayment, com.tools20022.repository.choice.RateOrName1Choice.Rate,
					com.tools20022.repository.choice.RateOrName2Choice.Rate, com.tools20022.repository.msg.Order16.AccruedInterestPercentage, com.tools20022.repository.msg.Order14.AccruedInterestPercentage,
					com.tools20022.repository.msg.SecuritiesFinancing10.AccruedInterestPercentage, com.tools20022.repository.msg.SecuritiesFinancing10.InterestRate, com.tools20022.repository.msg.CorporateActionRate2.InterestForUsedPayment,
					com.tools20022.repository.msg.FinancialCard1.InterestRatePercent, com.tools20022.repository.choice.InterestRate1Choice.FixedInterestRate, com.tools20022.repository.msg.InterestAmount1.InterestRate,
					com.tools20022.repository.msg.InterestAmount2.InterestRate, com.tools20022.repository.msg.InterestCalculation1.EffectiveRate, com.tools20022.repository.msg.InterestCalculation2.EffectiveRate,
					com.tools20022.repository.msg.RateDetails15.InterestRateUsedForPayment, com.tools20022.repository.msg.CorporateActionRate46.InterestRateUsedForPayment,
					com.tools20022.repository.msg.CorporateActionRate45.InterestRateUsedForPayment, com.tools20022.repository.msg.CorporateActionRate44.InterestRateUsedForPayment,
					com.tools20022.repository.msg.RateDetails14.InterestRateUsedForPayment, com.tools20022.repository.msg.Order17.AccruedInterestPercentage, com.tools20022.repository.msg.Order18.AccruedInterestPercentage,
					com.tools20022.repository.msg.CorporateActionRate60.InterestRateUsedForPayment, com.tools20022.repository.msg.RateDetails18.InterestRateUsedForPayment,
					com.tools20022.repository.msg.CorporateActionRate64.InterestRateUsedForPayment, com.tools20022.repository.msg.RateDetails21.InterestRateUsedForPayment,
					com.tools20022.repository.msg.CorporateActionRate57.InterestRateUsedForPayment, com.tools20022.repository.msg.InterestCalculation3.EffectiveRate, com.tools20022.repository.msg.UnsecuredMarketTransaction1.DealRate,
					com.tools20022.repository.msg.OvernightIndexSwapTransaction1.FixedInterestRate, com.tools20022.repository.msg.SecuredMarketTransaction1.DealRate, com.tools20022.repository.choice.InterestRate2Choice.Fixed,
					com.tools20022.repository.msg.DebtInstrument2.InterestRate, com.tools20022.repository.choice.InterestRateUsedForPaymentFormat8Choice.Rate, com.tools20022.repository.msg.RateDetails23.InterestRateUsedForPayment,
					com.tools20022.repository.msg.CorporateActionRate68.InterestRateUsedForPayment, com.tools20022.repository.msg.CorporateActionRate70.InterestRateUsedForPayment,
					com.tools20022.repository.choice.InterestRateUsedForPaymentFormat7Choice.Rate, com.tools20022.repository.msg.CorporateActionRate67.InterestRateUsedForPayment,
					com.tools20022.repository.msg.RateDetails22.InterestRateUsedForPayment, com.tools20022.repository.msg.InterestCalculation4.EffectiveRate, com.tools20022.repository.msg.CorporateActionRate74.InterestRateUsedForPayment,
					com.tools20022.repository.choice.InterestRateUsedForPaymentFormat9Choice.Rate, com.tools20022.repository.msg.CorporateActionRate79.InterestRateUsedForPayment,
					com.tools20022.repository.msg.RateDetails24.InterestRateUsedForPayment, com.tools20022.repository.msg.RateDetails25.InterestRateUsedForPayment,
					com.tools20022.repository.msg.CorporateActionRate76.InterestRateUsedForPayment, com.tools20022.repository.choice.InterestRateUsedForPaymentFormat10Choice.Rate,
					com.tools20022.repository.msg.UnsecuredMarketTransaction2.DealRate, com.tools20022.repository.msg.SecuredMarketTransaction2.DealRate, com.tools20022.repository.msg.UnsecuredMarketTransaction3.DealRate,
					com.tools20022.repository.msg.OvernightIndexSwapTransaction3.FixedInterestRate, com.tools20022.repository.msg.SecuredMarketTransaction3.DealRate, com.tools20022.repository.choice.InterestRate6Choice.Fixed,
					com.tools20022.repository.msg.DerivativeInterest3.InterestRate, com.tools20022.repository.msg.DerivativeInterest3.FirstLegInterestRate, com.tools20022.repository.msg.DerivativeInterest3.OtherLegInterestRate,
					com.tools20022.repository.choice.InterestRate8Choice.Fixed, com.tools20022.repository.msg.InterestRateDerivative5.InterestRateReference, com.tools20022.repository.msg.RateDetails26.InterestRateUsedForPayment,
					com.tools20022.repository.msg.CorporateActionRate82.InterestRateUsedForPayment, com.tools20022.repository.msg.CorporateActionRate80.InterestRateUsedForPayment,
					com.tools20022.repository.msg.RateDetails27.InterestRateUsedForPayment, com.tools20022.repository.msg.CorporateActionRate81.InterestRateUsedForPayment,
					com.tools20022.repository.msg.CorporateActionRate83.InterestRateUsedForPayment, com.tools20022.repository.msg.CorporateActionRate84.InterestRateUsedForPayment,
					com.tools20022.repository.msg.CorporateActionRate85.InterestRateUsedForPayment, com.tools20022.repository.msg.RateDetails28.InterestRateUsedForPayment,
					com.tools20022.repository.msg.RateDetails30.InterestRateUsedForPayment, com.tools20022.repository.msg.SecuredMarketTransaction4.DealRate, com.tools20022.repository.msg.OvernightIndexSwapTransaction4.FixedInterestRate,
					com.tools20022.repository.msg.UnsecuredMarketTransaction4.DealRate);
			elementContext_lazy = () -> Interest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Rate";
			definition = "The actual interest rate used for the payment of the interest for the specified interest period.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Cash proceeds definition for which an interest is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#Interest
	 * CashProceedsDefinition.Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition
	 * CashProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCashProceedsDefinition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash proceeds definition for which an interest is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedCashProceedsDefinition = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Interest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCashProceedsDefinition";
			definition = "Cash proceeds definition for which an interest is provided.";
			minOccurs = 0;
			type_lazy = () -> CashProceedsDefinition.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashProceedsDefinition.Interest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the financing trade on which this interest apply.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#Interest
	 * SecuritiesFinancing.Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesFinancing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the financing trade on which this interest apply."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesFinancing = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Interest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesFinancing";
			definition = "Specifies the financing trade on which this interest apply.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.Interest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the tax on interest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Tax#Interest
	 * Tax.Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#AccruedInterestTax
	 * SecuritiesFinancing10.AccruedInterestTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountInterest3#Tax
	 * AccountInterest3.Tax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InterestRecord1#Tax
	 * InterestRecord1.Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestAmount1#AppliedWithholdingTax
	 * InterestAmount1.AppliedWithholdingTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestAmount2#AppliedWithholdingTax
	 * InterestAmount2.AppliedWithholdingTax}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the tax on interest."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd InterestTax = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesFinancing10.AccruedInterestTax, com.tools20022.repository.msg.AccountInterest3.Tax, com.tools20022.repository.msg.InterestRecord1.Tax,
					com.tools20022.repository.msg.InterestAmount1.AppliedWithholdingTax, com.tools20022.repository.msg.InterestAmount2.AppliedWithholdingTax);
			elementContext_lazy = () -> Interest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InterestTax";
			definition = "Specifies the tax on interest.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Tax.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Tax.Interest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates whether the interest is a debit or credit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DebitCreditCode
	 * DebitCreditCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionInterest1#CreditDebitIndicator
	 * TransactionInterest1.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionInterest2#CreditDebitIndicator
	 * TransactionInterest2.CreditDebitIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the interest is a debit or credit."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CreditDebitIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionInterest1.CreditDebitIndicator, com.tools20022.repository.msg.TransactionInterest2.CreditDebitIndicator);
			elementContext_lazy = () -> Interest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates whether the interest is a debit or credit.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DebitCreditCode.mmObject();
		}
	};
	/**
	 * Entry which contains the interest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#Interest
	 * CashEntry.Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashEntry CashEntry}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Entry which contains the interest."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CashEntry = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Interest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashEntry";
			definition = "Entry which contains the interest.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CashEntry.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashEntry.Interest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Date of the next interest payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.InterestAmount1#ValueDate
	 * InterestAmount1.ValueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InterestResult1#ValueDate
	 * InterestResult1.ValueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InterestAmount2#ValueDate
	 * InterestAmount2.ValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestStatement1#ValueDate
	 * InterestStatement1.ValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestStatement2#ValueDate
	 * InterestStatement2.ValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestStatement3#ValueDate
	 * InterestStatement3.ValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestPaymentDateRange1#ExpectedDate
	 * InterestPaymentDateRange1.ExpectedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestPaymentDateRange1#DueDate
	 * InterestPaymentDateRange1.DueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestStatement4#ValueDate
	 * InterestStatement4.ValueDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date of the next interest payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PaymentDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InterestAmount1.ValueDate, com.tools20022.repository.msg.InterestResult1.ValueDate, com.tools20022.repository.msg.InterestAmount2.ValueDate,
					com.tools20022.repository.msg.InterestStatement1.ValueDate, com.tools20022.repository.msg.InterestStatement2.ValueDate, com.tools20022.repository.msg.InterestStatement3.ValueDate,
					com.tools20022.repository.msg.InterestPaymentDateRange1.ExpectedDate, com.tools20022.repository.msg.InterestPaymentDateRange1.DueDate, com.tools20022.repository.msg.InterestStatement4.ValueDate);
			elementContext_lazy = () -> Interest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentDate";
			definition = "Date of the next interest payment.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Management of interest which consists into calculating the interest,
	 * requesting its payment or distributing the interest proceeds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InterestManagement#Interest
	 * InterestManagement.Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InterestManagement
	 * InterestManagement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInterestManagement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Management of interest which consists into calculating the interest, requesting its payment or distributing the interest proceeds."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedInterestManagement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Interest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInterestManagement";
			definition = "Management of interest which consists into calculating the interest, requesting its payment or distributing the interest proceeds.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> InterestManagement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InterestManagement.Interest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Undertaking amount for which an interest is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingAmount#Interest
	 * UndertakingAmount.Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.UndertakingAmount
	 * UndertakingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedUndertakingAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Undertaking amount for which an interest is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedUndertakingAmount = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Interest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedUndertakingAmount";
			definition = "Undertaking amount for which an interest is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> UndertakingAmount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.UndertakingAmount.Interest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Debit and credit facilities on which the interest applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DebitCreditFacility#CashAccountInterest
	 * DebitCreditFacility.CashAccountInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DebitCreditFacility
	 * DebitCreditFacility}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedDebitCreditFacility"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Debit and credit facilities on which the interest applies."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedDebitCreditFacility = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Interest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedDebitCreditFacility";
			definition = "Debit and credit facilities on which the interest applies.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> DebitCreditFacility.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DebitCreditFacility.CashAccountInterest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities settlement process for which an accrued interest is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#AccruedInterest
	 * SecuritiesSettlement.AccruedInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities settlement process for which an accrued interest is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesSettlement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Interest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesSettlement";
			definition = "Securities settlement process for which an accrued interest is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.AccruedInterest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Interest rate expressed as a rate name.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#IdentificationForInterestName
	 * GenericIdentification.IdentificationForInterestName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Interest rate expressed as a rate name."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd InterestName = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Interest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InterestName";
			definition = "Interest rate expressed as a rate name.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> GenericIdentification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.IdentificationForInterestName;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Asset holding on which interest is paid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#Interest
	 * AssetHolding.Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AssetHolding
	 * AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedAssetHolding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset holding on which interest is paid."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedAssetHolding = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Interest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedAssetHolding";
			definition = "Asset holding on which interest is paid.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> AssetHolding.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AssetHolding.Interest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Deposit for which an interest is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Deposit#Interest
	 * Deposit.Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Deposit Deposit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Deposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Deposit for which an interest is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Deposit = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Interest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Deposit";
			definition = "Deposit for which an interest is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Deposit.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Deposit.Interest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Balance for which an interest is calculated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Balance#Interest
	 * Balance.Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Balance Balance}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts4#DailyBalance
	 * ATMTransactionAmounts4.DailyBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts4#WeeklyBalance
	 * ATMTransactionAmounts4.WeeklyBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts4#MonthlyBalance
	 * ATMTransactionAmounts4.MonthlyBalance}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance for which an interest is calculated."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd AccountBalance = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTransactionAmounts4.DailyBalance, com.tools20022.repository.msg.ATMTransactionAmounts4.WeeklyBalance,
					com.tools20022.repository.msg.ATMTransactionAmounts4.MonthlyBalance);
			elementContext_lazy = () -> Interest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountBalance";
			definition = "Balance for which an interest is calculated.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Balance.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Balance.Interest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Account contract for which interest parameters are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountContract#Interest
	 * AccountContract.Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AccountContract
	 * AccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedAccountContract"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account contract for which interest parameters are specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedAccountContract = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Interest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedAccountContract";
			definition = "Account contract for which interest parameters are specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> AccountContract.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AccountContract.Interest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Net asset value calculation for which an accrued interest is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#Interest
	 * NetAssetValueCalculation.Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation
	 * NetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedNetAssetValueCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net asset value calculation for which an accrued interest is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedNetAssetValueCalculation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Interest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedNetAssetValueCalculation";
			definition = "Net asset value calculation for which an accrued interest is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> NetAssetValueCalculation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.Interest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the type of interest associated with a trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InterestTypeCode
	 * InterestTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Order16#InterestType
	 * Order16.InterestType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order14#InterestType
	 * Order14.InterestType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order17#InterestType
	 * Order17.InterestType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order18#InterestType
	 * Order18.InterestType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction1#RateType
	 * UnsecuredMarketTransaction1.RateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction1#RateType
	 * SecuredMarketTransaction1.RateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction2#RateType
	 * UnsecuredMarketTransaction2.RateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction2#RateType
	 * SecuredMarketTransaction2.RateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction3#RateType
	 * UnsecuredMarketTransaction3.RateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction3#RateType
	 * SecuredMarketTransaction3.RateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4#RateType
	 * SecuredMarketTransaction4.RateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4#RateType
	 * UnsecuredMarketTransaction4.RateType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeOfInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of interest associated with a trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TypeOfInterest = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Order16.InterestType, com.tools20022.repository.msg.Order14.InterestType, com.tools20022.repository.msg.Order17.InterestType,
					com.tools20022.repository.msg.Order18.InterestType, com.tools20022.repository.msg.UnsecuredMarketTransaction1.RateType, com.tools20022.repository.msg.SecuredMarketTransaction1.RateType,
					com.tools20022.repository.msg.UnsecuredMarketTransaction2.RateType, com.tools20022.repository.msg.SecuredMarketTransaction2.RateType, com.tools20022.repository.msg.UnsecuredMarketTransaction3.RateType,
					com.tools20022.repository.msg.SecuredMarketTransaction3.RateType, com.tools20022.repository.msg.SecuredMarketTransaction4.RateType, com.tools20022.repository.msg.UnsecuredMarketTransaction4.RateType);
			elementContext_lazy = () -> Interest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TypeOfInterest";
			definition = "Specifies the type of interest associated with a trade.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> InterestTypeCode.mmObject();
		}
	};
	/**
	 * Payment card for which interest on due amounts is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard#Interest
	 * PaymentCard.Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentCard
	 * PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPaymentCard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment card for which interest on due amounts is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedPaymentCard = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Interest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedPaymentCard";
			definition = "Payment card for which interest on due amounts is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> PaymentCard.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentCard.Interest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Interest";
				definition = "Consideration, such as amount of money,  paid or received in exchange for an asset that has been invested, loaned or borrowed for a certain period. The interest is expressed as a fixed amount or percentage of the amount upon which the interest is applied.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.IdentificationForInterestName, com.tools20022.repository.entity.NetAssetValueCalculation.Interest,
						com.tools20022.repository.entity.Tax.Interest, com.tools20022.repository.entity.AccountContract.Interest, com.tools20022.repository.entity.PaymentCard.Interest, com.tools20022.repository.entity.CashEntry.Interest,
						com.tools20022.repository.entity.AssetHolding.Interest, com.tools20022.repository.entity.Balance.Interest, com.tools20022.repository.entity.SecuritiesSettlement.AccruedInterest,
						com.tools20022.repository.entity.InterestCalculation.Interest, com.tools20022.repository.entity.SecuritiesFinancing.Interest, com.tools20022.repository.entity.CashProceedsDefinition.Interest,
						com.tools20022.repository.entity.DebitCreditFacility.CashAccountInterest, com.tools20022.repository.entity.UndertakingAmount.Interest, com.tools20022.repository.entity.Deposit.Interest,
						com.tools20022.repository.entity.InterestManagement.Interest);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.InterestRateUsedForPaymentFormat2Choice.RateTypeAndAmountAndRateStatus,
						com.tools20022.repository.choice.InterestRateUsedForPaymentFormat3Choice.RateTypeAndAmountAndRateStatus, com.tools20022.repository.choice.InterestRateUsedForPaymentFormat1Choice.RateTypeAndAmountAndRateStatus,
						com.tools20022.repository.choice.InterestRateUsedForPaymentFormat4Choice.RateTypeAndAmountAndRateStatus, com.tools20022.repository.choice.InterestRateUsedForPaymentFormat5Choice.RateTypeAndAmountAndRateStatus,
						com.tools20022.repository.choice.InterestRateUsedForPaymentFormat6Choice.RateTypeAndAmountAndRateStatus, com.tools20022.repository.choice.InterestRateUsedForPaymentFormat8Choice.RateTypeAndAmountAndRateStatus,
						com.tools20022.repository.choice.InterestRateUsedForPaymentFormat7Choice.RateTypeAndAmountAndRateStatus, com.tools20022.repository.choice.InterestRateUsedForPaymentFormat9Choice.RateTypeAndAmountAndRateStatus,
						com.tools20022.repository.choice.InterestRateUsedForPaymentFormat10Choice.RateTypeAndAmountAndRateStatus);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Interest.AccruedInterestAmount, com.tools20022.repository.entity.Interest.InterestCalculation, com.tools20022.repository.entity.Interest.Amount,
						com.tools20022.repository.entity.Interest.Rate, com.tools20022.repository.entity.Interest.RelatedCashProceedsDefinition, com.tools20022.repository.entity.Interest.SecuritiesFinancing,
						com.tools20022.repository.entity.Interest.InterestTax, com.tools20022.repository.entity.Interest.CreditDebitIndicator, com.tools20022.repository.entity.Interest.CashEntry,
						com.tools20022.repository.entity.Interest.PaymentDate, com.tools20022.repository.entity.Interest.RelatedInterestManagement, com.tools20022.repository.entity.Interest.RelatedUndertakingAmount,
						com.tools20022.repository.entity.Interest.RelatedDebitCreditFacility, com.tools20022.repository.entity.Interest.SecuritiesSettlement, com.tools20022.repository.entity.Interest.InterestName,
						com.tools20022.repository.entity.Interest.RelatedAssetHolding, com.tools20022.repository.entity.Interest.Deposit, com.tools20022.repository.entity.Interest.AccountBalance,
						com.tools20022.repository.entity.Interest.RelatedAccountContract, com.tools20022.repository.entity.Interest.RelatedNetAssetValueCalculation, com.tools20022.repository.entity.Interest.TypeOfInterest,
						com.tools20022.repository.entity.Interest.RelatedPaymentCard);
				derivationComponent_lazy = () -> Arrays.asList(RateTypeAndAmountAndStatus1.mmObject(), RateTypeAndAmountAndStatus3.mmObject(), InterestRateUsedForPaymentFormat2Choice.mmObject(), RateTypeAndAmountAndStatus4.mmObject(),
						RateTypeAndAmountAndStatus5.mmObject(), RateTypeAndAmountAndStatus6.mmObject(), RateTypeAndAmountAndStatus2.mmObject(), RateTypeAndAmountAndStatus7.mmObject(), InterestRateUsedForPaymentFormat3Choice.mmObject(),
						RateTypeAndAmountAndStatus8.mmObject(), RateTypeAndAmountAndStatus9.mmObject(), RateTypeAndAmountAndStatus10.mmObject(), RateTypeAndAmountAndStatus11.mmObject(), RateTypeAndAmountAndStatus12.mmObject(),
						RateTypeAndAmountAndStatus15.mmObject(), RateTypeAndAmountAndStatus16.mmObject(), RateTypeAndAmountAndStatus13.mmObject(), RateTypeAndAmountAndStatus14.mmObject(), RateTypeAndAmountAndStatus17.mmObject(),
						RateTypeAndAmountAndStatus18.mmObject(), RateTypeAndAmountAndStatus19.mmObject(), RateTypeAndAmountAndStatus20.mmObject(), RateTypeAndAmountAndStatus21.mmObject(), InterestRateUsedForPaymentFormat1Choice.mmObject(),
						InterestRateUsedForPaymentFormat4Choice.mmObject(), InterestRateUsedForPaymentFormat5Choice.mmObject(), InterestRateUsedForPaymentFormat6Choice.mmObject(), RateOrName1Choice.mmObject(), RateOrName2Choice.mmObject(),
						InterestRecord1.mmObject(), InterestRate1Choice.mmObject(), InterestAmount1.mmObject(), InterestResult1.mmObject(), InterestAmount2.mmObject(), InterestStatement1.mmObject(), InterestStatement2.mmObject(),
						InterestStatement3.mmObject(), InterestRateContractTerm1.mmObject(), InterestRate2Choice.mmObject(), InterestPaymentDateRange1.mmObject(), InterestRateUsedForPaymentFormat8Choice.mmObject(),
						RateTypeAndAmountAndStatus24.mmObject(), RateTypeAndAmountAndStatus22.mmObject(), RateTypeAndAmountAndStatus25.mmObject(), RateTypeAndAmountAndStatus27.mmObject(), RateTypeAndAmountAndStatus26.mmObject(),
						InterestRateUsedForPaymentFormat7Choice.mmObject(), RateTypeAndAmountAndStatus28.mmObject(), RateTypeAndAmountAndStatus29.mmObject(), InterestStatement4.mmObject(),
						InterestRateUsedForPaymentFormat9Choice.mmObject(), RateTypeAndAmountAndStatus32.mmObject(), RateTypeAndAmountAndStatus31.mmObject(), RateTypeAndAmountAndStatus33.mmObject(), RateTypeAndAmountAndStatus36.mmObject(),
						RateTypeAndAmountAndStatus35.mmObject(), RateTypeAndAmountAndStatus30.mmObject(), InterestRateUsedForPaymentFormat10Choice.mmObject(), RateTypeAndAmountAndStatus34.mmObject(), InterestRateContractTerm2.mmObject(),
						InterestRate6Choice.mmObject(), InterestRate8Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}