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
import com.tools20022.repository.codeset.DebitCreditCode;
import com.tools20022.repository.codeset.InterestTypeCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentificationForInterestName
 * GenericIdentification.mmIdentificationForInterestName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmInterest
 * NetAssetValueCalculation.mmInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmInterest
 * Tax.mmInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AccountContract#mmInterest
 * AccountContract.mmInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#mmInterest
 * PaymentCard.mmInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashEntry#mmInterest
 * CashEntry.mmInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#mmInterest
 * AssetHolding.mmInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Balance#mmInterest
 * Balance.mmInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmAccruedInterest
 * SecuritiesSettlement.mmAccruedInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmInterest
 * InterestCalculation.mmInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmInterest
 * SecuritiesFinancing.mmInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#mmInterest
 * CashProceedsDefinition.mmInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DebitCreditFacility#mmCashAccountInterest
 * DebitCreditFacility.mmCashAccountInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UndertakingAmount#mmInterest
 * UndertakingAmount.mmInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Deposit#mmInterest
 * Deposit.mmInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestManagement#mmInterest
 * InterestManagement.mmInterest}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat2Choice#mmRateTypeAndAmountAndRateStatus
 * InterestRateUsedForPaymentFormat2Choice.mmRateTypeAndAmountAndRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat3Choice#mmRateTypeAndAmountAndRateStatus
 * InterestRateUsedForPaymentFormat3Choice.mmRateTypeAndAmountAndRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat1Choice#mmRateTypeAndAmountAndRateStatus
 * InterestRateUsedForPaymentFormat1Choice.mmRateTypeAndAmountAndRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat4Choice#mmRateTypeAndAmountAndRateStatus
 * InterestRateUsedForPaymentFormat4Choice.mmRateTypeAndAmountAndRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat5Choice#mmRateTypeAndAmountAndRateStatus
 * InterestRateUsedForPaymentFormat5Choice.mmRateTypeAndAmountAndRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat6Choice#mmRateTypeAndAmountAndRateStatus
 * InterestRateUsedForPaymentFormat6Choice.mmRateTypeAndAmountAndRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat8Choice#mmRateTypeAndAmountAndRateStatus
 * InterestRateUsedForPaymentFormat8Choice.mmRateTypeAndAmountAndRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat7Choice#mmRateTypeAndAmountAndRateStatus
 * InterestRateUsedForPaymentFormat7Choice.mmRateTypeAndAmountAndRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat9Choice#mmRateTypeAndAmountAndRateStatus
 * InterestRateUsedForPaymentFormat9Choice.mmRateTypeAndAmountAndRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat10Choice#mmRateTypeAndAmountAndRateStatus
 * InterestRateUsedForPaymentFormat10Choice.mmRateTypeAndAmountAndRateStatus}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#mmAccruedInterestAmount
 * Interest.mmAccruedInterestAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#mmInterestCalculation
 * Interest.mmInterestCalculation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#mmAmount
 * Interest.mmAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#mmRate
 * Interest.mmRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#mmRelatedCashProceedsDefinition
 * Interest.mmRelatedCashProceedsDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#mmSecuritiesFinancing
 * Interest.mmSecuritiesFinancing}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#mmInterestTax
 * Interest.mmInterestTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#mmCreditDebitIndicator
 * Interest.mmCreditDebitIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#mmCashEntry
 * Interest.mmCashEntry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#mmPaymentDate
 * Interest.mmPaymentDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#mmRelatedInterestManagement
 * Interest.mmRelatedInterestManagement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#mmRelatedUndertakingAmount
 * Interest.mmRelatedUndertakingAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#mmRelatedDebitCreditFacility
 * Interest.mmRelatedDebitCreditFacility}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#mmSecuritiesSettlement
 * Interest.mmSecuritiesSettlement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#mmInterestName
 * Interest.mmInterestName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#mmRelatedAssetHolding
 * Interest.mmRelatedAssetHolding}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#mmDeposit
 * Interest.mmDeposit}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#mmAccountBalance
 * Interest.mmAccountBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#mmRelatedAccountContract
 * Interest.mmRelatedAccountContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#mmRelatedNetAssetValueCalculation
 * Interest.mmRelatedNetAssetValueCalculation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#mmTypeOfInterest
 * Interest.mmTypeOfInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#mmRelatedPaymentCard
 * Interest.mmRelatedPaymentCard}</li>
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
 * "Interest"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Consideration, such as amount of money,  paid or received in exchange for an asset that has been invested, loaned or borrowed for a certain period. The interest is expressed as a fixed amount or percentage of the amount upon which the interest is applied."
 * </li>
 * </ul>
 */
public class Interest {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CurrencyAndAmount accruedInterestAmount;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice3#mmAccruedInterestNAV
	 * UnitPrice3.mmAccruedInterestNAV}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice12#mmAccruedInterestNAV
	 * UnitPrice12.mmAccruedInterestNAV}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts12#mmAccruedInterestAmount
	 * OtherAmounts12.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts14#mmAccruedInterestAmount
	 * OtherAmounts14.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts20#mmAccruedInterestAmount
	 * OtherAmounts20.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmAccruedInterestAmount
	 * CorporateActionAmounts2.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts5#mmAccruedInterestAmount
	 * CorporateActionAmounts5.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts11#mmAccruedInterestAmount
	 * CorporateActionAmounts11.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmAccruedInterestAmount
	 * CorporateActionAmounts12.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts17#mmAccruedInterestAmount
	 * CorporateActionAmounts17.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts20#mmAccruedInterestAmount
	 * CorporateActionAmounts20.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts23#mmAccruedInterestAmount
	 * CorporateActionAmounts23.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts24#mmAccruedInterestAmount
	 * CorporateActionAmounts24.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts3#mmAccruedInterestAmount
	 * CorporateActionAmounts3.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts6#mmAccruedInterestAmount
	 * CorporateActionAmounts6.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts9#mmAccruedInterestAmount
	 * CorporateActionAmounts9.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts13#mmAccruedInterestAmount
	 * CorporateActionAmounts13.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts16#mmAccruedInterestAmount
	 * CorporateActionAmounts16.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts19#mmAccruedInterestAmount
	 * CorporateActionAmounts19.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#mmAccruedInterestAmount
	 * CorporateActionAmounts22.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts25#mmAccruedInterestAmount
	 * CorporateActionAmounts25.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts4#mmAccruedInterestAmount
	 * CorporateActionAmounts4.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts7#mmAccruedInterestAmount
	 * CorporateActionAmounts7.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#mmAccruedInterestAmount
	 * CorporateActionAmounts10.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts14#mmAccruedInterestAmount
	 * CorporateActionAmounts14.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts15#mmAccruedInterestAmount
	 * CorporateActionAmounts15.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts18#mmAccruedInterestAmount
	 * CorporateActionAmounts18.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts21#mmAccruedInterestAmount
	 * CorporateActionAmounts21.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts26#mmAccruedInterestAmount
	 * CorporateActionAmounts26.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceAmounts1#mmAccruedInterestAmount
	 * BalanceAmounts1.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceAmounts5#mmAccruedInterestAmount
	 * BalanceAmounts5.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace2#mmAccruedInterestAmount
	 * AggregateBalancePerSafekeepingPlace2.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation2#mmAccruedInterestAmount
	 * AggregateBalanceInformation2.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace4#mmAccruedInterestAmount
	 * AggregateBalancePerSafekeepingPlace4.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation3#mmAccruedInterestAmount
	 * AggregateBalanceInformation3.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceAmounts3#mmAccruedInterestAmount
	 * BalanceAmounts3.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceAmounts4#mmAccruedInterestAmount
	 * BalanceAmounts4.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1#mmAccruedInterestAmount
	 * AggregateBalancePerSafekeepingPlace1.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation1#mmAccruedInterestAmount
	 * AggregateBalanceInformation1.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace3#mmAccruedInterestAmount
	 * AggregateBalancePerSafekeepingPlace3.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation4#mmAccruedInterestAmount
	 * AggregateBalanceInformation4.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3#mmAccruedInterestAmount
	 * SecuritiesFinancingTransactionDetails3.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts4#mmAccruedInterestAmount
	 * OtherAmounts4.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5#mmAccruedInterestAmount
	 * SecuritiesFinancingTransactionDetails5.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts5#mmAccruedInterestAmount
	 * OtherAmounts5.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1#mmAccruedInterestAmount
	 * SecuritiesFinancingTransactionDetails1.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11#mmAccruedInterestAmount
	 * SecuritiesFinancingTransactionDetails11.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts17#mmAccruedInterestAmount
	 * OtherAmounts17.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14#mmAccruedInterestAmount
	 * SecuritiesFinancingTransactionDetails14.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts23#mmAccruedInterestAmount
	 * OtherAmounts23.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts3#mmAccruedInterestAmount
	 * OtherAmounts3.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4#mmAccruedInterestAmount
	 * SecuritiesFinancingTransactionDetails4.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts7#mmAccruedInterestAmount
	 * OtherAmounts7.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts9#mmAccruedInterestAmount
	 * OtherAmounts9.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts10#mmAccruedInterestAmount
	 * OtherAmounts10.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts18#mmAccruedInterestAmount
	 * OtherAmounts18.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts24#mmAccruedInterestAmount
	 * OtherAmounts24.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts13#mmAccruedInterestAmount
	 * OtherAmounts13.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails6#mmAccruedInterestAmount
	 * TransactionDetails6.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails18#mmAccruedInterestAmount
	 * TransactionDetails18.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails24#mmAccruedInterestAmount
	 * TransactionDetails24.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails34#mmAccruedInterestAmount
	 * TransactionDetails34.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails37#mmAccruedInterestAmount
	 * TransactionDetails37.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails48#mmAccruedInterestAmount
	 * TransactionDetails48.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails57#mmAccruedInterestAmount
	 * TransactionDetails57.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails60#mmAccruedInterestAmount
	 * TransactionDetails60.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts1#mmAccruedInterestAmount
	 * OtherAmounts1.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order16#mmAccruedInterestAmount
	 * Order16.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order14#mmAccruedInterestAmount
	 * Order14.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmAccruedInterestAmount
	 * SecuritiesFinancing10.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts2#mmAccruedInterestAmount
	 * OtherAmounts2.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails7#mmAccruedInterestAmount
	 * SecuritiesFinancingTransactionDetails7.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts8#mmAccruedInterestAmount
	 * OtherAmounts8.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestAmount1#mmAccruedInterestAmount
	 * InterestAmount1.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestAmount2#mmAccruedInterestAmount
	 * InterestAmount2.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation1#mmAccruedInterestAmount
	 * InterestCalculation1.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation2#mmAccruedInterestAmount
	 * InterestCalculation2.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SummaryAmounts1#mmTotalAccruedInterestAmount
	 * SummaryAmounts1.mmTotalAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralAmount1#mmAccruedInterestAmount
	 * CollateralAmount1.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#mmAccruedInterestAmount
	 * SecuritiesFinancingTransactionDetails19.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#mmAccruedInterestAmount
	 * SecuritiesFinancingTransactionDetails20.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9#mmAccruedInterestAmount
	 * SecuritiesFinancingTransactionDetails9.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts11#mmAccruedInterestAmount
	 * OtherAmounts11.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts6#mmAccruedInterestAmount
	 * OtherAmounts6.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts15#mmAccruedInterestAmount
	 * OtherAmounts15.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts22#mmAccruedInterestAmount
	 * OtherAmounts22.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg2#mmAccruedInterestAmount
	 * TradeLeg2.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg5#mmAccruedInterestAmount
	 * TradeLeg5.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg1#mmAccruedInterestAmount
	 * TradeLeg1.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg3#mmAccruedInterestAmount
	 * TradeLeg3.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg6#mmAccruedInterestAmount
	 * TradeLeg6.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails51#mmAccruedInterestAmount
	 * TransactionDetails51.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1#mmAccruedInterestAmount
	 * SecuritiesFinancing1.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails63#mmAccruedInterestAmount
	 * TransactionDetails63.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts29#mmAccruedInterestAmount
	 * CorporateActionAmounts29.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts27#mmAccruedInterestAmount
	 * CorporateActionAmounts27.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#mmAccruedInterestAmount
	 * CorporateActionAmounts28.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order17#mmAccruedInterestAmount
	 * Order17.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order18#mmAccruedInterestAmount
	 * Order18.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts33#mmAccruedInterestAmount
	 * CorporateActionAmounts33.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts32#mmAccruedInterestAmount
	 * CorporateActionAmounts32.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts35#mmAccruedInterestAmount
	 * CorporateActionAmounts35.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails68#mmAccruedInterestAmount
	 * TransactionDetails68.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg8#mmAccruedInterestAmount
	 * TradeLeg8.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg9#mmAccruedInterestAmount
	 * TradeLeg9.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation3#mmAccruedInterestAmount
	 * InterestCalculation3.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails78#mmAccruedInterestAmount
	 * TransactionDetails78.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts28#mmAccruedInterestAmount
	 * OtherAmounts28.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts30#mmAccruedInterestAmount
	 * OtherAmounts30.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28#mmAccruedInterestAmount
	 * SecuritiesFinancingTransactionDetails28.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts31#mmAccruedInterestAmount
	 * OtherAmounts31.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#mmAccruedInterestAmount
	 * SecuritiesFinancingTransactionDetails27.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails29#mmAccruedInterestAmount
	 * SecuritiesFinancingTransactionDetails29.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts32#mmAccruedInterestAmount
	 * OtherAmounts32.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts29#mmAccruedInterestAmount
	 * OtherAmounts29.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#mmAccruedInterestAmount
	 * CorporateActionAmounts37.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts36#mmAccruedInterestAmount
	 * CorporateActionAmounts36.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice21#mmAccruedInterestNAV
	 * UnitPrice21.mmAccruedInterestNAV}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts38#mmAccruedInterestAmount
	 * CorporateActionAmounts38.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation4#mmAccruedInterestAmount
	 * InterestCalculation4.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts39#mmAccruedInterestAmount
	 * CorporateActionAmounts39.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts41#mmAccruedInterestAmount
	 * CorporateActionAmounts41.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts40#mmAccruedInterestAmount
	 * CorporateActionAmounts40.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts35#mmAccruedInterestAmount
	 * OtherAmounts35.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32#mmAccruedInterestAmount
	 * SecuritiesFinancingTransactionDetails32.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30#mmAccruedInterestAmount
	 * SecuritiesFinancingTransactionDetails30.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts34#mmAccruedInterestAmount
	 * OtherAmounts34.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts38#mmAccruedInterestAmount
	 * OtherAmounts38.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts36#mmAccruedInterestAmount
	 * OtherAmounts36.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails34#mmAccruedInterestAmount
	 * SecuritiesFinancingTransactionDetails34.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts33#mmAccruedInterestAmount
	 * OtherAmounts33.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails91#mmAccruedInterestAmount
	 * TransactionDetails91.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails95#mmAccruedInterestAmount
	 * TransactionDetails95.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails98#mmAccruedInterestAmount
	 * TransactionDetails98.mmAccruedInterestAmount}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmAccruedInterestAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(UnitPrice3.mmAccruedInterestNAV, UnitPrice12.mmAccruedInterestNAV, OtherAmounts12.mmAccruedInterestAmount, OtherAmounts14.mmAccruedInterestAmount, OtherAmounts20.mmAccruedInterestAmount,
					CorporateActionAmounts2.mmAccruedInterestAmount, CorporateActionAmounts5.mmAccruedInterestAmount, CorporateActionAmounts11.mmAccruedInterestAmount, CorporateActionAmounts12.mmAccruedInterestAmount,
					CorporateActionAmounts17.mmAccruedInterestAmount, CorporateActionAmounts20.mmAccruedInterestAmount, CorporateActionAmounts23.mmAccruedInterestAmount, CorporateActionAmounts24.mmAccruedInterestAmount,
					CorporateActionAmounts3.mmAccruedInterestAmount, CorporateActionAmounts6.mmAccruedInterestAmount, CorporateActionAmounts9.mmAccruedInterestAmount, CorporateActionAmounts13.mmAccruedInterestAmount,
					CorporateActionAmounts16.mmAccruedInterestAmount, CorporateActionAmounts19.mmAccruedInterestAmount, CorporateActionAmounts22.mmAccruedInterestAmount, CorporateActionAmounts25.mmAccruedInterestAmount,
					CorporateActionAmounts4.mmAccruedInterestAmount, CorporateActionAmounts7.mmAccruedInterestAmount, CorporateActionAmounts10.mmAccruedInterestAmount, CorporateActionAmounts14.mmAccruedInterestAmount,
					CorporateActionAmounts15.mmAccruedInterestAmount, CorporateActionAmounts18.mmAccruedInterestAmount, CorporateActionAmounts21.mmAccruedInterestAmount, CorporateActionAmounts26.mmAccruedInterestAmount,
					BalanceAmounts1.mmAccruedInterestAmount, BalanceAmounts5.mmAccruedInterestAmount, AggregateBalancePerSafekeepingPlace2.mmAccruedInterestAmount, AggregateBalanceInformation2.mmAccruedInterestAmount,
					AggregateBalancePerSafekeepingPlace4.mmAccruedInterestAmount, AggregateBalanceInformation3.mmAccruedInterestAmount, BalanceAmounts3.mmAccruedInterestAmount, BalanceAmounts4.mmAccruedInterestAmount,
					AggregateBalancePerSafekeepingPlace1.mmAccruedInterestAmount, AggregateBalanceInformation1.mmAccruedInterestAmount, AggregateBalancePerSafekeepingPlace3.mmAccruedInterestAmount,
					AggregateBalanceInformation4.mmAccruedInterestAmount, SecuritiesFinancingTransactionDetails3.mmAccruedInterestAmount, OtherAmounts4.mmAccruedInterestAmount,
					SecuritiesFinancingTransactionDetails5.mmAccruedInterestAmount, OtherAmounts5.mmAccruedInterestAmount, SecuritiesFinancingTransactionDetails1.mmAccruedInterestAmount,
					SecuritiesFinancingTransactionDetails11.mmAccruedInterestAmount, OtherAmounts17.mmAccruedInterestAmount, SecuritiesFinancingTransactionDetails14.mmAccruedInterestAmount, OtherAmounts23.mmAccruedInterestAmount,
					OtherAmounts3.mmAccruedInterestAmount, SecuritiesFinancingTransactionDetails4.mmAccruedInterestAmount, OtherAmounts7.mmAccruedInterestAmount, OtherAmounts9.mmAccruedInterestAmount,
					OtherAmounts10.mmAccruedInterestAmount, OtherAmounts18.mmAccruedInterestAmount, OtherAmounts24.mmAccruedInterestAmount, OtherAmounts13.mmAccruedInterestAmount, TransactionDetails6.mmAccruedInterestAmount,
					TransactionDetails18.mmAccruedInterestAmount, TransactionDetails24.mmAccruedInterestAmount, TransactionDetails34.mmAccruedInterestAmount, TransactionDetails37.mmAccruedInterestAmount,
					TransactionDetails48.mmAccruedInterestAmount, TransactionDetails57.mmAccruedInterestAmount, TransactionDetails60.mmAccruedInterestAmount, OtherAmounts1.mmAccruedInterestAmount, Order16.mmAccruedInterestAmount,
					Order14.mmAccruedInterestAmount, SecuritiesFinancing10.mmAccruedInterestAmount, OtherAmounts2.mmAccruedInterestAmount, SecuritiesFinancingTransactionDetails7.mmAccruedInterestAmount,
					OtherAmounts8.mmAccruedInterestAmount, InterestAmount1.mmAccruedInterestAmount, InterestAmount2.mmAccruedInterestAmount, InterestCalculation1.mmAccruedInterestAmount, InterestCalculation2.mmAccruedInterestAmount,
					SummaryAmounts1.mmTotalAccruedInterestAmount, CollateralAmount1.mmAccruedInterestAmount, SecuritiesFinancingTransactionDetails19.mmAccruedInterestAmount, SecuritiesFinancingTransactionDetails20.mmAccruedInterestAmount,
					SecuritiesFinancingTransactionDetails9.mmAccruedInterestAmount, OtherAmounts11.mmAccruedInterestAmount, OtherAmounts6.mmAccruedInterestAmount, OtherAmounts15.mmAccruedInterestAmount,
					OtherAmounts22.mmAccruedInterestAmount, TradeLeg2.mmAccruedInterestAmount, TradeLeg5.mmAccruedInterestAmount, TradeLeg1.mmAccruedInterestAmount, TradeLeg3.mmAccruedInterestAmount, TradeLeg6.mmAccruedInterestAmount,
					TransactionDetails51.mmAccruedInterestAmount, SecuritiesFinancing1.mmAccruedInterestAmount, TransactionDetails63.mmAccruedInterestAmount, CorporateActionAmounts29.mmAccruedInterestAmount,
					CorporateActionAmounts27.mmAccruedInterestAmount, CorporateActionAmounts28.mmAccruedInterestAmount, Order17.mmAccruedInterestAmount, Order18.mmAccruedInterestAmount, CorporateActionAmounts33.mmAccruedInterestAmount,
					CorporateActionAmounts32.mmAccruedInterestAmount, CorporateActionAmounts35.mmAccruedInterestAmount, TransactionDetails68.mmAccruedInterestAmount, TradeLeg8.mmAccruedInterestAmount, TradeLeg9.mmAccruedInterestAmount,
					InterestCalculation3.mmAccruedInterestAmount, TransactionDetails78.mmAccruedInterestAmount, OtherAmounts28.mmAccruedInterestAmount, OtherAmounts30.mmAccruedInterestAmount,
					SecuritiesFinancingTransactionDetails28.mmAccruedInterestAmount, OtherAmounts31.mmAccruedInterestAmount, SecuritiesFinancingTransactionDetails27.mmAccruedInterestAmount,
					SecuritiesFinancingTransactionDetails29.mmAccruedInterestAmount, OtherAmounts32.mmAccruedInterestAmount, OtherAmounts29.mmAccruedInterestAmount, CorporateActionAmounts37.mmAccruedInterestAmount,
					CorporateActionAmounts36.mmAccruedInterestAmount, UnitPrice21.mmAccruedInterestNAV, CorporateActionAmounts38.mmAccruedInterestAmount, InterestCalculation4.mmAccruedInterestAmount,
					CorporateActionAmounts39.mmAccruedInterestAmount, CorporateActionAmounts41.mmAccruedInterestAmount, CorporateActionAmounts40.mmAccruedInterestAmount, OtherAmounts35.mmAccruedInterestAmount,
					SecuritiesFinancingTransactionDetails32.mmAccruedInterestAmount, SecuritiesFinancingTransactionDetails30.mmAccruedInterestAmount, OtherAmounts34.mmAccruedInterestAmount, OtherAmounts38.mmAccruedInterestAmount,
					OtherAmounts36.mmAccruedInterestAmount, SecuritiesFinancingTransactionDetails34.mmAccruedInterestAmount, OtherAmounts33.mmAccruedInterestAmount, TransactionDetails91.mmAccruedInterestAmount,
					TransactionDetails95.mmAccruedInterestAmount, TransactionDetails98.mmAccruedInterestAmount);
			elementContext_lazy = () -> Interest.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccruedInterestAmount";
			definition = "Interest amount that has accrued in between coupon payment periods.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.InterestCalculation> interestCalculation;
	/**
	 * Calculation parameters used to obtain the interest amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmInterest
	 * InterestCalculation.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus1#mmRateType
	 * RateTypeAndAmountAndStatus1.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus3#mmRateType
	 * RateTypeAndAmountAndStatus3.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus4#mmRateType
	 * RateTypeAndAmountAndStatus4.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus5#mmRateType
	 * RateTypeAndAmountAndStatus5.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus6#mmRateType
	 * RateTypeAndAmountAndStatus6.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus2#mmRateType
	 * RateTypeAndAmountAndStatus2.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus7#mmRateType
	 * RateTypeAndAmountAndStatus7.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus8#mmRateType
	 * RateTypeAndAmountAndStatus8.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus9#mmRateType
	 * RateTypeAndAmountAndStatus9.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus10#mmRateType
	 * RateTypeAndAmountAndStatus10.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus11#mmRateType
	 * RateTypeAndAmountAndStatus11.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus12#mmRateType
	 * RateTypeAndAmountAndStatus12.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus15#mmRateType
	 * RateTypeAndAmountAndStatus15.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus16#mmRateType
	 * RateTypeAndAmountAndStatus16.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus13#mmRateType
	 * RateTypeAndAmountAndStatus13.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus14#mmRateType
	 * RateTypeAndAmountAndStatus14.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus17#mmRateType
	 * RateTypeAndAmountAndStatus17.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus18#mmRateType
	 * RateTypeAndAmountAndStatus18.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus19#mmRateType
	 * RateTypeAndAmountAndStatus19.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus20#mmRateType
	 * RateTypeAndAmountAndStatus20.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus21#mmRateType
	 * RateTypeAndAmountAndStatus21.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11#mmChargesRate
	 * SecuritiesFinancingTransactionDetails11.mmChargesRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14#mmChargesRate
	 * SecuritiesFinancingTransactionDetails14.mmChargesRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction1#mmInterest
	 * EntryTransaction1.mmInterest}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry1#mmInterest
	 * ReportEntry1.mmInterest}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountReport9#mmInterest
	 * AccountReport9.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction2#mmInterest
	 * EntryTransaction2.mmInterest}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry2#mmInterest
	 * ReportEntry2.mmInterest}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountReport11#mmInterest
	 * AccountReport11.mmInterest}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InterestRecord1#mmType
	 * InterestRecord1.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InterestRecord1#mmRate
	 * InterestRecord1.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction3#mmInterest
	 * EntryTransaction3.mmInterest}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry3#mmInterest
	 * ReportEntry3.mmInterest}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountReport12#mmInterest
	 * AccountReport12.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction4#mmInterest
	 * EntryTransaction4.mmInterest}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry4#mmInterest
	 * ReportEntry4.mmInterest}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountReport16#mmInterest
	 * AccountReport16.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationEntry1#mmInterest
	 * NotificationEntry1.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification2#mmInterest
	 * AccountNotification2.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification5#mmInterest
	 * AccountNotification5.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification7#mmInterest
	 * AccountNotification7.mmInterest}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.StatementEntry1#mmInterest
	 * StatementEntry1.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountStatement1#mmInterest
	 * AccountStatement1.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountStatement2#mmInterest
	 * AccountStatement2.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountStatement3#mmInterest
	 * AccountStatement3.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountStatement4#mmInterest
	 * AccountStatement4.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestStatement1#mmInterestCalculationDetails
	 * InterestStatement1.mmInterestCalculationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestStatement2#mmInterestCalculationDetails
	 * InterestStatement2.mmInterestCalculationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#mmChargesRate
	 * SecuritiesFinancingTransactionDetails19.mmChargesRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#mmChargesRate
	 * SecuritiesFinancingTransactionDetails20.mmChargesRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountReport18#mmInterest
	 * AccountReport18.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountStatement5#mmInterest
	 * AccountStatement5.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification11#mmInterest
	 * AccountNotification11.mmInterest}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry7#mmInterest
	 * ReportEntry7.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction7#mmInterest
	 * EntryTransaction7.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestStatement3#mmInterestCalculation
	 * InterestStatement3.mmInterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28#mmChargesRate
	 * SecuritiesFinancingTransactionDetails28.mmChargesRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#mmChargesRate
	 * SecuritiesFinancingTransactionDetails27.mmChargesRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountStatement6#mmInterest
	 * AccountStatement6.mmInterest}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountReport19#mmInterest
	 * AccountReport19.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification12#mmInterest
	 * AccountNotification12.mmInterest}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry8#mmInterest
	 * ReportEntry8.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#mmInterest
	 * EntryTransaction8.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus24#mmRateType
	 * RateTypeAndAmountAndStatus24.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus22#mmRateType
	 * RateTypeAndAmountAndStatus22.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus25#mmRateType
	 * RateTypeAndAmountAndStatus25.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus27#mmRateType
	 * RateTypeAndAmountAndStatus27.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus26#mmRateType
	 * RateTypeAndAmountAndStatus26.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus28#mmRateType
	 * RateTypeAndAmountAndStatus28.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus29#mmRateType
	 * RateTypeAndAmountAndStatus29.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestStatement4#mmInterestCalculation
	 * InterestStatement4.mmInterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus32#mmRateType
	 * RateTypeAndAmountAndStatus32.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus31#mmRateType
	 * RateTypeAndAmountAndStatus31.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus33#mmRateType
	 * RateTypeAndAmountAndStatus33.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus36#mmRateType
	 * RateTypeAndAmountAndStatus36.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus35#mmRateType
	 * RateTypeAndAmountAndStatus35.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus30#mmRateType
	 * RateTypeAndAmountAndStatus30.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus34#mmRateType
	 * RateTypeAndAmountAndStatus34.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32#mmChargesRate
	 * SecuritiesFinancingTransactionDetails32.mmChargesRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30#mmChargesRate
	 * SecuritiesFinancingTransactionDetails30.mmChargesRate}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmInterestCalculation = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(RateTypeAndAmountAndStatus1.mmRateType, RateTypeAndAmountAndStatus3.mmRateType, RateTypeAndAmountAndStatus4.mmRateType, RateTypeAndAmountAndStatus5.mmRateType,
					RateTypeAndAmountAndStatus6.mmRateType, RateTypeAndAmountAndStatus2.mmRateType, RateTypeAndAmountAndStatus7.mmRateType, RateTypeAndAmountAndStatus8.mmRateType, RateTypeAndAmountAndStatus9.mmRateType,
					RateTypeAndAmountAndStatus10.mmRateType, RateTypeAndAmountAndStatus11.mmRateType, RateTypeAndAmountAndStatus12.mmRateType, RateTypeAndAmountAndStatus15.mmRateType, RateTypeAndAmountAndStatus16.mmRateType,
					RateTypeAndAmountAndStatus13.mmRateType, RateTypeAndAmountAndStatus14.mmRateType, RateTypeAndAmountAndStatus17.mmRateType, RateTypeAndAmountAndStatus18.mmRateType, RateTypeAndAmountAndStatus19.mmRateType,
					RateTypeAndAmountAndStatus20.mmRateType, RateTypeAndAmountAndStatus21.mmRateType, SecuritiesFinancingTransactionDetails11.mmChargesRate, SecuritiesFinancingTransactionDetails14.mmChargesRate,
					EntryTransaction1.mmInterest, ReportEntry1.mmInterest, AccountReport9.mmInterest, EntryTransaction2.mmInterest, ReportEntry2.mmInterest, AccountReport11.mmInterest, InterestRecord1.mmType, InterestRecord1.mmRate,
					EntryTransaction3.mmInterest, ReportEntry3.mmInterest, AccountReport12.mmInterest, EntryTransaction4.mmInterest, ReportEntry4.mmInterest, AccountReport16.mmInterest, NotificationEntry1.mmInterest,
					AccountNotification2.mmInterest, AccountNotification5.mmInterest, AccountNotification7.mmInterest, StatementEntry1.mmInterest, AccountStatement1.mmInterest, AccountStatement2.mmInterest, AccountStatement3.mmInterest,
					AccountStatement4.mmInterest, InterestStatement1.mmInterestCalculationDetails, InterestStatement2.mmInterestCalculationDetails, SecuritiesFinancingTransactionDetails19.mmChargesRate,
					SecuritiesFinancingTransactionDetails20.mmChargesRate, AccountReport18.mmInterest, AccountStatement5.mmInterest, AccountNotification11.mmInterest, ReportEntry7.mmInterest, EntryTransaction7.mmInterest,
					InterestStatement3.mmInterestCalculation, SecuritiesFinancingTransactionDetails28.mmChargesRate, SecuritiesFinancingTransactionDetails27.mmChargesRate, AccountStatement6.mmInterest, AccountReport19.mmInterest,
					AccountNotification12.mmInterest, ReportEntry8.mmInterest, EntryTransaction8.mmInterest, RateTypeAndAmountAndStatus24.mmRateType, RateTypeAndAmountAndStatus22.mmRateType, RateTypeAndAmountAndStatus25.mmRateType,
					RateTypeAndAmountAndStatus27.mmRateType, RateTypeAndAmountAndStatus26.mmRateType, RateTypeAndAmountAndStatus28.mmRateType, RateTypeAndAmountAndStatus29.mmRateType, InterestStatement4.mmInterestCalculation,
					RateTypeAndAmountAndStatus32.mmRateType, RateTypeAndAmountAndStatus31.mmRateType, RateTypeAndAmountAndStatus33.mmRateType, RateTypeAndAmountAndStatus36.mmRateType, RateTypeAndAmountAndStatus35.mmRateType,
					RateTypeAndAmountAndStatus30.mmRateType, RateTypeAndAmountAndStatus34.mmRateType, SecuritiesFinancingTransactionDetails32.mmChargesRate, SecuritiesFinancingTransactionDetails30.mmChargesRate);
			elementContext_lazy = () -> Interest.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InterestCalculation";
			definition = "Calculation parameters used to obtain the interest amount.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmObject();
		}
	};
	protected CurrencyAndAmount amount;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus1#mmAmount
	 * RateTypeAndAmountAndStatus1.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus3#mmAmount
	 * RateTypeAndAmountAndStatus3.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat2Choice#mmAmount
	 * InterestRateUsedForPaymentFormat2Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus4#mmAmount
	 * RateTypeAndAmountAndStatus4.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus5#mmAmount
	 * RateTypeAndAmountAndStatus5.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus6#mmAmount
	 * RateTypeAndAmountAndStatus6.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmInterestAmount
	 * CorporateActionAmounts2.mmInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus2#mmAmount
	 * RateTypeAndAmountAndStatus2.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus7#mmAmount
	 * RateTypeAndAmountAndStatus7.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat3Choice#mmAmount
	 * InterestRateUsedForPaymentFormat3Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus8#mmAmount
	 * RateTypeAndAmountAndStatus8.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus9#mmAmount
	 * RateTypeAndAmountAndStatus9.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus10#mmAmount
	 * RateTypeAndAmountAndStatus10.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts5#mmInterestAmount
	 * CorporateActionAmounts5.mmInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus11#mmAmount
	 * RateTypeAndAmountAndStatus11.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts11#mmInterestAmount
	 * CorporateActionAmounts11.mmInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus12#mmAmount
	 * RateTypeAndAmountAndStatus12.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmInterestAmount
	 * CorporateActionAmounts12.mmInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts17#mmInterestAmount
	 * CorporateActionAmounts17.mmInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts20#mmInterestAmount
	 * CorporateActionAmounts20.mmInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus15#mmAmount
	 * RateTypeAndAmountAndStatus15.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus16#mmAmount
	 * RateTypeAndAmountAndStatus16.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts23#mmInterestAmount
	 * CorporateActionAmounts23.mmInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus13#mmAmount
	 * RateTypeAndAmountAndStatus13.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus14#mmAmount
	 * RateTypeAndAmountAndStatus14.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus17#mmAmount
	 * RateTypeAndAmountAndStatus17.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus18#mmAmount
	 * RateTypeAndAmountAndStatus18.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus19#mmAmount
	 * RateTypeAndAmountAndStatus19.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts24#mmInterestAmount
	 * CorporateActionAmounts24.mmInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus20#mmAmount
	 * RateTypeAndAmountAndStatus20.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus21#mmAmount
	 * RateTypeAndAmountAndStatus21.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat1Choice#mmAmount
	 * InterestRateUsedForPaymentFormat1Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts3#mmInterestAmount
	 * CorporateActionAmounts3.mmInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat4Choice#mmAmount
	 * InterestRateUsedForPaymentFormat4Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts6#mmInterestAmount
	 * CorporateActionAmounts6.mmInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat5Choice#mmAmount
	 * InterestRateUsedForPaymentFormat5Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts9#mmInterestAmount
	 * CorporateActionAmounts9.mmInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat6Choice#mmAmount
	 * InterestRateUsedForPaymentFormat6Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts13#mmInterestAmount
	 * CorporateActionAmounts13.mmInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts16#mmInterestAmount
	 * CorporateActionAmounts16.mmInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts19#mmInterestAmount
	 * CorporateActionAmounts19.mmInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#mmInterestAmount
	 * CorporateActionAmounts22.mmInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts25#mmInterestAmount
	 * CorporateActionAmounts25.mmInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts4#mmInterestAmount
	 * CorporateActionAmounts4.mmInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts7#mmInterestAmount
	 * CorporateActionAmounts7.mmInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#mmInterestAmount
	 * CorporateActionAmounts10.mmInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts14#mmInterestAmount
	 * CorporateActionAmounts14.mmInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts15#mmInterestAmount
	 * CorporateActionAmounts15.mmInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts18#mmInterestAmount
	 * CorporateActionAmounts18.mmInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts21#mmInterestAmount
	 * CorporateActionAmounts21.mmInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts26#mmInterestAmount
	 * CorporateActionAmounts26.mmInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#mmBorrowingInterestAmount
	 * OtherAmounts16.mmBorrowingInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionInterest1#mmAmount
	 * TransactionInterest1.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionInterest2#mmAmount
	 * TransactionInterest2.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InterestRecord1#mmAmount
	 * InterestRecord1.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#mmInterestAmount
	 * CorporateActionAmounts1.mmInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestResult1#mmInterestDueToA
	 * InterestResult1.mmInterestDueToA}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestResult1#mmInterestDueToB
	 * InterestResult1.mmInterestDueToB}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation1#mmAggregatedInterestAmount
	 * InterestCalculation1.mmAggregatedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestStatement1#mmTotalInterestAmountDueToA
	 * InterestStatement1.mmTotalInterestAmountDueToA}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestStatement1#mmTotalInterestAmountDueToB
	 * InterestStatement1.mmTotalInterestAmountDueToB}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation2#mmAggregatedInterestAmount
	 * InterestCalculation2.mmAggregatedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestStatement2#mmTotalInterestAmountDueToA
	 * InterestStatement2.mmTotalInterestAmountDueToA}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestStatement2#mmTotalInterestAmountDueToB
	 * InterestStatement2.mmTotalInterestAmountDueToB}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetPosition1#mmAccruedInterestAmount
	 * NetPosition1.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetPosition2#mmAccruedInterestAmount
	 * NetPosition2.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts29#mmInterestAmount
	 * CorporateActionAmounts29.mmInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts27#mmInterestAmount
	 * CorporateActionAmounts27.mmInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#mmInterestAmount
	 * CorporateActionAmounts28.mmInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts33#mmInterestAmount
	 * CorporateActionAmounts33.mmInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts32#mmInterestAmount
	 * CorporateActionAmounts32.mmInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts35#mmInterestAmount
	 * CorporateActionAmounts35.mmInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetPosition3#mmAccruedInterestAmount
	 * NetPosition3.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestStatement3#mmTotalInterestAmountDueToA
	 * InterestStatement3.mmTotalInterestAmountDueToA}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestStatement3#mmTotalInterestAmountDueToB
	 * InterestStatement3.mmTotalInterestAmountDueToB}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation3#mmAggregatedInterestAmount
	 * InterestCalculation3.mmAggregatedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat8Choice#mmAmount
	 * InterestRateUsedForPaymentFormat8Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus24#mmAmount
	 * RateTypeAndAmountAndStatus24.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus22#mmAmount
	 * RateTypeAndAmountAndStatus22.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus25#mmAmount
	 * RateTypeAndAmountAndStatus25.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus27#mmAmount
	 * RateTypeAndAmountAndStatus27.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#mmInterestAmount
	 * CorporateActionAmounts37.mmInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus26#mmAmount
	 * RateTypeAndAmountAndStatus26.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat7Choice#mmAmount
	 * InterestRateUsedForPaymentFormat7Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts36#mmInterestAmount
	 * CorporateActionAmounts36.mmInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus28#mmAmount
	 * RateTypeAndAmountAndStatus28.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus29#mmAmount
	 * RateTypeAndAmountAndStatus29.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts38#mmInterestAmount
	 * CorporateActionAmounts38.mmInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestStatement4#mmTotalInterestAmountDueToA
	 * InterestStatement4.mmTotalInterestAmountDueToA}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestStatement4#mmTotalInterestAmountDueToB
	 * InterestStatement4.mmTotalInterestAmountDueToB}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation4#mmAggregatedInterestAmount
	 * InterestCalculation4.mmAggregatedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat9Choice#mmAmount
	 * InterestRateUsedForPaymentFormat9Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus32#mmAmount
	 * RateTypeAndAmountAndStatus32.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus31#mmAmount
	 * RateTypeAndAmountAndStatus31.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts39#mmInterestAmount
	 * CorporateActionAmounts39.mmInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus33#mmAmount
	 * RateTypeAndAmountAndStatus33.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts41#mmInterestAmount
	 * CorporateActionAmounts41.mmInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts40#mmInterestAmount
	 * CorporateActionAmounts40.mmInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus36#mmAmount
	 * RateTypeAndAmountAndStatus36.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus35#mmAmount
	 * RateTypeAndAmountAndStatus35.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus30#mmAmount
	 * RateTypeAndAmountAndStatus30.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat10Choice#mmAmount
	 * InterestRateUsedForPaymentFormat10Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus34#mmAmount
	 * RateTypeAndAmountAndStatus34.mmAmount}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(RateTypeAndAmountAndStatus1.mmAmount, RateTypeAndAmountAndStatus3.mmAmount, InterestRateUsedForPaymentFormat2Choice.mmAmount, RateTypeAndAmountAndStatus4.mmAmount,
					RateTypeAndAmountAndStatus5.mmAmount, RateTypeAndAmountAndStatus6.mmAmount, CorporateActionAmounts2.mmInterestAmount, RateTypeAndAmountAndStatus2.mmAmount, RateTypeAndAmountAndStatus7.mmAmount,
					InterestRateUsedForPaymentFormat3Choice.mmAmount, RateTypeAndAmountAndStatus8.mmAmount, RateTypeAndAmountAndStatus9.mmAmount, RateTypeAndAmountAndStatus10.mmAmount, CorporateActionAmounts5.mmInterestAmount,
					RateTypeAndAmountAndStatus11.mmAmount, CorporateActionAmounts11.mmInterestAmount, RateTypeAndAmountAndStatus12.mmAmount, CorporateActionAmounts12.mmInterestAmount, CorporateActionAmounts17.mmInterestAmount,
					CorporateActionAmounts20.mmInterestAmount, RateTypeAndAmountAndStatus15.mmAmount, RateTypeAndAmountAndStatus16.mmAmount, CorporateActionAmounts23.mmInterestAmount, RateTypeAndAmountAndStatus13.mmAmount,
					RateTypeAndAmountAndStatus14.mmAmount, RateTypeAndAmountAndStatus17.mmAmount, RateTypeAndAmountAndStatus18.mmAmount, RateTypeAndAmountAndStatus19.mmAmount, CorporateActionAmounts24.mmInterestAmount,
					RateTypeAndAmountAndStatus20.mmAmount, RateTypeAndAmountAndStatus21.mmAmount, InterestRateUsedForPaymentFormat1Choice.mmAmount, CorporateActionAmounts3.mmInterestAmount, InterestRateUsedForPaymentFormat4Choice.mmAmount,
					CorporateActionAmounts6.mmInterestAmount, InterestRateUsedForPaymentFormat5Choice.mmAmount, CorporateActionAmounts9.mmInterestAmount, InterestRateUsedForPaymentFormat6Choice.mmAmount,
					CorporateActionAmounts13.mmInterestAmount, CorporateActionAmounts16.mmInterestAmount, CorporateActionAmounts19.mmInterestAmount, CorporateActionAmounts22.mmInterestAmount, CorporateActionAmounts25.mmInterestAmount,
					CorporateActionAmounts4.mmInterestAmount, CorporateActionAmounts7.mmInterestAmount, CorporateActionAmounts10.mmInterestAmount, CorporateActionAmounts14.mmInterestAmount, CorporateActionAmounts15.mmInterestAmount,
					CorporateActionAmounts18.mmInterestAmount, CorporateActionAmounts21.mmInterestAmount, CorporateActionAmounts26.mmInterestAmount, OtherAmounts16.mmBorrowingInterestAmount, TransactionInterest1.mmAmount,
					TransactionInterest2.mmAmount, InterestRecord1.mmAmount, CorporateActionAmounts1.mmInterestAmount, InterestResult1.mmInterestDueToA, InterestResult1.mmInterestDueToB, InterestCalculation1.mmAggregatedInterestAmount,
					InterestStatement1.mmTotalInterestAmountDueToA, InterestStatement1.mmTotalInterestAmountDueToB, InterestCalculation2.mmAggregatedInterestAmount, InterestStatement2.mmTotalInterestAmountDueToA,
					InterestStatement2.mmTotalInterestAmountDueToB, NetPosition1.mmAccruedInterestAmount, NetPosition2.mmAccruedInterestAmount, CorporateActionAmounts29.mmInterestAmount, CorporateActionAmounts27.mmInterestAmount,
					CorporateActionAmounts28.mmInterestAmount, CorporateActionAmounts33.mmInterestAmount, CorporateActionAmounts32.mmInterestAmount, CorporateActionAmounts35.mmInterestAmount, NetPosition3.mmAccruedInterestAmount,
					InterestStatement3.mmTotalInterestAmountDueToA, InterestStatement3.mmTotalInterestAmountDueToB, InterestCalculation3.mmAggregatedInterestAmount, InterestRateUsedForPaymentFormat8Choice.mmAmount,
					RateTypeAndAmountAndStatus24.mmAmount, RateTypeAndAmountAndStatus22.mmAmount, RateTypeAndAmountAndStatus25.mmAmount, RateTypeAndAmountAndStatus27.mmAmount, CorporateActionAmounts37.mmInterestAmount,
					RateTypeAndAmountAndStatus26.mmAmount, InterestRateUsedForPaymentFormat7Choice.mmAmount, CorporateActionAmounts36.mmInterestAmount, RateTypeAndAmountAndStatus28.mmAmount, RateTypeAndAmountAndStatus29.mmAmount,
					CorporateActionAmounts38.mmInterestAmount, InterestStatement4.mmTotalInterestAmountDueToA, InterestStatement4.mmTotalInterestAmountDueToB, InterestCalculation4.mmAggregatedInterestAmount,
					InterestRateUsedForPaymentFormat9Choice.mmAmount, RateTypeAndAmountAndStatus32.mmAmount, RateTypeAndAmountAndStatus31.mmAmount, CorporateActionAmounts39.mmInterestAmount, RateTypeAndAmountAndStatus33.mmAmount,
					CorporateActionAmounts41.mmInterestAmount, CorporateActionAmounts40.mmInterestAmount, RateTypeAndAmountAndStatus36.mmAmount, RateTypeAndAmountAndStatus35.mmAmount, RateTypeAndAmountAndStatus30.mmAmount,
					InterestRateUsedForPaymentFormat10Choice.mmAmount, RateTypeAndAmountAndStatus34.mmAmount);
			elementContext_lazy = () -> Interest.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Amount of money representing interest payments.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected PercentageRate rate;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat2Choice#mmRate
	 * InterestRateUsedForPaymentFormat2Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate4#mmInterestRateUsedForPayment
	 * CorporateActionRate4.mmInterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat3Choice#mmRate
	 * InterestRateUsedForPaymentFormat3Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate10#mmInterestRateUsedForPayment
	 * CorporateActionRate10.mmInterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate20#mmInterestRateUsedForPayment
	 * CorporateActionRate20.mmInterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails2#mmInterestRateUsedForPayment
	 * RateDetails2.mmInterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate22#mmInterestRateUsedForPayment
	 * CorporateActionRate22.mmInterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails4#mmInterestRateUsedForPayment
	 * RateDetails4.mmInterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate26#mmInterestRateUsedForPayment
	 * CorporateActionRate26.mmInterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails7#mmInterestRateUsedForPayment
	 * RateDetails7.mmInterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate31#mmInterestRateUsedForPayment
	 * CorporateActionRate31.mmInterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails9#mmInterestRateUsedForPayment
	 * RateDetails9.mmInterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate38#mmInterestRateUsedForPayment
	 * CorporateActionRate38.mmInterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails11#mmInterestRateUsedForPayment
	 * RateDetails11.mmInterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate39#mmInterestRateUsedForPayment
	 * CorporateActionRate39.mmInterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails12#mmInterestRateUsedForPayment
	 * RateDetails12.mmInterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat1Choice#mmRate
	 * InterestRateUsedForPaymentFormat1Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#mmInterestRateUsedForPayment
	 * CorporateActionRate5.mmInterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat4Choice#mmRate
	 * InterestRateUsedForPaymentFormat4Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate12#mmInterestRateUsedForPayment
	 * CorporateActionRate12.mmInterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat5Choice#mmRate
	 * InterestRateUsedForPaymentFormat5Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate15#mmInterestRateUsedForPayment
	 * CorporateActionRate15.mmInterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails3#mmInterestRateUsedForPayment
	 * RateDetails3.mmInterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat6Choice#mmRate
	 * InterestRateUsedForPaymentFormat6Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate18#mmInterestRateUsedForPayment
	 * CorporateActionRate18.mmInterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails5#mmInterestRateUsedForPayment
	 * RateDetails5.mmInterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate25#mmInterestRateUsedForPayment
	 * CorporateActionRate25.mmInterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate30#mmInterestRateUsedForPayment
	 * CorporateActionRate30.mmInterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate37#mmInterestRateUsedForPayment
	 * CorporateActionRate37.mmInterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails10#mmInterestRateUsedForPayment
	 * RateDetails10.mmInterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate40#mmInterestRateUsedForPayment
	 * CorporateActionRate40.mmInterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails13#mmInterestRateUsedForPayment
	 * RateDetails13.mmInterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate36#mmInterestRateUsedForPayment
	 * CorporateActionRate36.mmInterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate42#mmInterestRateUsedForPayment
	 * CorporateActionRate42.mmInterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateOrName1Choice#mmRate
	 * RateOrName1Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateOrName2Choice#mmRate
	 * RateOrName2Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order16#mmAccruedInterestPercentage
	 * Order16.mmAccruedInterestPercentage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order14#mmAccruedInterestPercentage
	 * Order14.mmAccruedInterestPercentage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmAccruedInterestPercentage
	 * SecuritiesFinancing10.mmAccruedInterestPercentage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmInterestRate
	 * SecuritiesFinancing10.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmInterestForUsedPayment
	 * CorporateActionRate2.mmInterestForUsedPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialCard1#mmInterestRatePercent
	 * FinancialCard1.mmInterestRatePercent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestRate1Choice#mmFixedInterestRate
	 * InterestRate1Choice.mmFixedInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestAmount1#mmInterestRate
	 * InterestAmount1.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestAmount2#mmInterestRate
	 * InterestAmount2.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation1#mmEffectiveRate
	 * InterestCalculation1.mmEffectiveRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation2#mmEffectiveRate
	 * InterestCalculation2.mmEffectiveRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails15#mmInterestRateUsedForPayment
	 * RateDetails15.mmInterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate46#mmInterestRateUsedForPayment
	 * CorporateActionRate46.mmInterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate45#mmInterestRateUsedForPayment
	 * CorporateActionRate45.mmInterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate44#mmInterestRateUsedForPayment
	 * CorporateActionRate44.mmInterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails14#mmInterestRateUsedForPayment
	 * RateDetails14.mmInterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order17#mmAccruedInterestPercentage
	 * Order17.mmAccruedInterestPercentage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order18#mmAccruedInterestPercentage
	 * Order18.mmAccruedInterestPercentage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate60#mmInterestRateUsedForPayment
	 * CorporateActionRate60.mmInterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails18#mmInterestRateUsedForPayment
	 * RateDetails18.mmInterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate64#mmInterestRateUsedForPayment
	 * CorporateActionRate64.mmInterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails21#mmInterestRateUsedForPayment
	 * RateDetails21.mmInterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate57#mmInterestRateUsedForPayment
	 * CorporateActionRate57.mmInterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation3#mmEffectiveRate
	 * InterestCalculation3.mmEffectiveRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction1#mmDealRate
	 * UnsecuredMarketTransaction1.mmDealRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction1#mmFixedInterestRate
	 * OvernightIndexSwapTransaction1.mmFixedInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction1#mmDealRate
	 * SecuredMarketTransaction1.mmDealRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestRate2Choice#mmFixed
	 * InterestRate2Choice.mmFixed}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DebtInstrument2#mmInterestRate
	 * DebtInstrument2.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat8Choice#mmRate
	 * InterestRateUsedForPaymentFormat8Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails23#mmInterestRateUsedForPayment
	 * RateDetails23.mmInterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate68#mmInterestRateUsedForPayment
	 * CorporateActionRate68.mmInterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate70#mmInterestRateUsedForPayment
	 * CorporateActionRate70.mmInterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat7Choice#mmRate
	 * InterestRateUsedForPaymentFormat7Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate67#mmInterestRateUsedForPayment
	 * CorporateActionRate67.mmInterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails22#mmInterestRateUsedForPayment
	 * RateDetails22.mmInterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation4#mmEffectiveRate
	 * InterestCalculation4.mmEffectiveRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate74#mmInterestRateUsedForPayment
	 * CorporateActionRate74.mmInterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat9Choice#mmRate
	 * InterestRateUsedForPaymentFormat9Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate79#mmInterestRateUsedForPayment
	 * CorporateActionRate79.mmInterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails24#mmInterestRateUsedForPayment
	 * RateDetails24.mmInterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails25#mmInterestRateUsedForPayment
	 * RateDetails25.mmInterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate76#mmInterestRateUsedForPayment
	 * CorporateActionRate76.mmInterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat10Choice#mmRate
	 * InterestRateUsedForPaymentFormat10Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction2#mmDealRate
	 * UnsecuredMarketTransaction2.mmDealRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction2#mmDealRate
	 * SecuredMarketTransaction2.mmDealRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction3#mmDealRate
	 * UnsecuredMarketTransaction3.mmDealRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction3#mmFixedInterestRate
	 * OvernightIndexSwapTransaction3.mmFixedInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction3#mmDealRate
	 * SecuredMarketTransaction3.mmDealRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestRate6Choice#mmFixed
	 * InterestRate6Choice.mmFixed}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeInterest3#mmInterestRate
	 * DerivativeInterest3.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeInterest3#mmFirstLegInterestRate
	 * DerivativeInterest3.mmFirstLegInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeInterest3#mmOtherLegInterestRate
	 * DerivativeInterest3.mmOtherLegInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestRate8Choice#mmFixed
	 * InterestRate8Choice.mmFixed}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestRateDerivative5#mmInterestRateReference
	 * InterestRateDerivative5.mmInterestRateReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails26#mmInterestRateUsedForPayment
	 * RateDetails26.mmInterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate82#mmInterestRateUsedForPayment
	 * CorporateActionRate82.mmInterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate80#mmInterestRateUsedForPayment
	 * CorporateActionRate80.mmInterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails27#mmInterestRateUsedForPayment
	 * RateDetails27.mmInterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate81#mmInterestRateUsedForPayment
	 * CorporateActionRate81.mmInterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate83#mmInterestRateUsedForPayment
	 * CorporateActionRate83.mmInterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate84#mmInterestRateUsedForPayment
	 * CorporateActionRate84.mmInterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate85#mmInterestRateUsedForPayment
	 * CorporateActionRate85.mmInterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails28#mmInterestRateUsedForPayment
	 * RateDetails28.mmInterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails30#mmInterestRateUsedForPayment
	 * RateDetails30.mmInterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4#mmDealRate
	 * SecuredMarketTransaction4.mmDealRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction4#mmFixedInterestRate
	 * OvernightIndexSwapTransaction4.mmFixedInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4#mmDealRate
	 * UnsecuredMarketTransaction4.mmDealRate}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmRate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(InterestRateUsedForPaymentFormat2Choice.mmRate, CorporateActionRate4.mmInterestRateUsedForPayment, InterestRateUsedForPaymentFormat3Choice.mmRate,
					CorporateActionRate10.mmInterestRateUsedForPayment, CorporateActionRate20.mmInterestRateUsedForPayment, RateDetails2.mmInterestRateUsedForPayment, CorporateActionRate22.mmInterestRateUsedForPayment,
					RateDetails4.mmInterestRateUsedForPayment, CorporateActionRate26.mmInterestRateUsedForPayment, RateDetails7.mmInterestRateUsedForPayment, CorporateActionRate31.mmInterestRateUsedForPayment,
					RateDetails9.mmInterestRateUsedForPayment, CorporateActionRate38.mmInterestRateUsedForPayment, RateDetails11.mmInterestRateUsedForPayment, CorporateActionRate39.mmInterestRateUsedForPayment,
					RateDetails12.mmInterestRateUsedForPayment, InterestRateUsedForPaymentFormat1Choice.mmRate, CorporateActionRate5.mmInterestRateUsedForPayment, InterestRateUsedForPaymentFormat4Choice.mmRate,
					CorporateActionRate12.mmInterestRateUsedForPayment, InterestRateUsedForPaymentFormat5Choice.mmRate, CorporateActionRate15.mmInterestRateUsedForPayment, RateDetails3.mmInterestRateUsedForPayment,
					InterestRateUsedForPaymentFormat6Choice.mmRate, CorporateActionRate18.mmInterestRateUsedForPayment, RateDetails5.mmInterestRateUsedForPayment, CorporateActionRate25.mmInterestRateUsedForPayment,
					CorporateActionRate30.mmInterestRateUsedForPayment, CorporateActionRate37.mmInterestRateUsedForPayment, RateDetails10.mmInterestRateUsedForPayment, CorporateActionRate40.mmInterestRateUsedForPayment,
					RateDetails13.mmInterestRateUsedForPayment, CorporateActionRate36.mmInterestRateUsedForPayment, CorporateActionRate42.mmInterestRateUsedForPayment, RateOrName1Choice.mmRate, RateOrName2Choice.mmRate,
					Order16.mmAccruedInterestPercentage, Order14.mmAccruedInterestPercentage, SecuritiesFinancing10.mmAccruedInterestPercentage, SecuritiesFinancing10.mmInterestRate, CorporateActionRate2.mmInterestForUsedPayment,
					FinancialCard1.mmInterestRatePercent, InterestRate1Choice.mmFixedInterestRate, InterestAmount1.mmInterestRate, InterestAmount2.mmInterestRate, InterestCalculation1.mmEffectiveRate, InterestCalculation2.mmEffectiveRate,
					RateDetails15.mmInterestRateUsedForPayment, CorporateActionRate46.mmInterestRateUsedForPayment, CorporateActionRate45.mmInterestRateUsedForPayment, CorporateActionRate44.mmInterestRateUsedForPayment,
					RateDetails14.mmInterestRateUsedForPayment, Order17.mmAccruedInterestPercentage, Order18.mmAccruedInterestPercentage, CorporateActionRate60.mmInterestRateUsedForPayment, RateDetails18.mmInterestRateUsedForPayment,
					CorporateActionRate64.mmInterestRateUsedForPayment, RateDetails21.mmInterestRateUsedForPayment, CorporateActionRate57.mmInterestRateUsedForPayment, InterestCalculation3.mmEffectiveRate,
					UnsecuredMarketTransaction1.mmDealRate, OvernightIndexSwapTransaction1.mmFixedInterestRate, SecuredMarketTransaction1.mmDealRate, InterestRate2Choice.mmFixed, DebtInstrument2.mmInterestRate,
					InterestRateUsedForPaymentFormat8Choice.mmRate, RateDetails23.mmInterestRateUsedForPayment, CorporateActionRate68.mmInterestRateUsedForPayment, CorporateActionRate70.mmInterestRateUsedForPayment,
					InterestRateUsedForPaymentFormat7Choice.mmRate, CorporateActionRate67.mmInterestRateUsedForPayment, RateDetails22.mmInterestRateUsedForPayment, InterestCalculation4.mmEffectiveRate,
					CorporateActionRate74.mmInterestRateUsedForPayment, InterestRateUsedForPaymentFormat9Choice.mmRate, CorporateActionRate79.mmInterestRateUsedForPayment, RateDetails24.mmInterestRateUsedForPayment,
					RateDetails25.mmInterestRateUsedForPayment, CorporateActionRate76.mmInterestRateUsedForPayment, InterestRateUsedForPaymentFormat10Choice.mmRate, UnsecuredMarketTransaction2.mmDealRate,
					SecuredMarketTransaction2.mmDealRate, UnsecuredMarketTransaction3.mmDealRate, OvernightIndexSwapTransaction3.mmFixedInterestRate, SecuredMarketTransaction3.mmDealRate, InterestRate6Choice.mmFixed,
					DerivativeInterest3.mmInterestRate, DerivativeInterest3.mmFirstLegInterestRate, DerivativeInterest3.mmOtherLegInterestRate, InterestRate8Choice.mmFixed, InterestRateDerivative5.mmInterestRateReference,
					RateDetails26.mmInterestRateUsedForPayment, CorporateActionRate82.mmInterestRateUsedForPayment, CorporateActionRate80.mmInterestRateUsedForPayment, RateDetails27.mmInterestRateUsedForPayment,
					CorporateActionRate81.mmInterestRateUsedForPayment, CorporateActionRate83.mmInterestRateUsedForPayment, CorporateActionRate84.mmInterestRateUsedForPayment, CorporateActionRate85.mmInterestRateUsedForPayment,
					RateDetails28.mmInterestRateUsedForPayment, RateDetails30.mmInterestRateUsedForPayment, SecuredMarketTransaction4.mmDealRate, OvernightIndexSwapTransaction4.mmFixedInterestRate, UnsecuredMarketTransaction4.mmDealRate);
			elementContext_lazy = () -> Interest.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Rate";
			definition = "The actual interest rate used for the payment of the interest for the specified interest period.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CashProceedsDefinition> relatedCashProceedsDefinition;
	/**
	 * Cash proceeds definition for which an interest is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#mmInterest
	 * CashProceedsDefinition.mmInterest}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedCashProceedsDefinition = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Interest.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedCashProceedsDefinition";
			definition = "Cash proceeds definition for which an interest is provided.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashProceedsDefinition.mmInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashProceedsDefinition.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesFinancing> securitiesFinancing;
	/**
	 * Specifies the financing trade on which this interest apply.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmInterest
	 * SecuritiesFinancing.mmInterest}</li>
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
	public static final MMBusinessAssociationEnd mmSecuritiesFinancing = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Interest.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesFinancing";
			definition = "Specifies the financing trade on which this interest apply.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmObject();
		}
	};
	protected Tax interestTax;
	/**
	 * Specifies the tax on interest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Tax#mmInterest
	 * Tax.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmAccruedInterestTax
	 * SecuritiesFinancing10.mmAccruedInterestTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountInterest3#mmTax
	 * AccountInterest3.mmTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InterestRecord1#mmTax
	 * InterestRecord1.mmTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestAmount1#mmAppliedWithholdingTax
	 * InterestAmount1.mmAppliedWithholdingTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestAmount2#mmAppliedWithholdingTax
	 * InterestAmount2.mmAppliedWithholdingTax}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmInterestTax = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(SecuritiesFinancing10.mmAccruedInterestTax, AccountInterest3.mmTax, InterestRecord1.mmTax, InterestAmount1.mmAppliedWithholdingTax, InterestAmount2.mmAppliedWithholdingTax);
			elementContext_lazy = () -> Interest.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InterestTax";
			definition = "Specifies the tax on interest.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Tax.mmInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
		}
	};
	protected DebitCreditCode creditDebitIndicator;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionInterest1#mmCreditDebitIndicator
	 * TransactionInterest1.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionInterest2#mmCreditDebitIndicator
	 * TransactionInterest2.mmCreditDebitIndicator}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmCreditDebitIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TransactionInterest1.mmCreditDebitIndicator, TransactionInterest2.mmCreditDebitIndicator);
			elementContext_lazy = () -> Interest.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates whether the interest is a debit or credit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DebitCreditCode.mmObject();
		}
	};
	protected CashEntry cashEntry;
	/**
	 * Entry which contains the interest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#mmInterest
	 * CashEntry.mmInterest}</li>
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
	public static final MMBusinessAssociationEnd mmCashEntry = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Interest.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashEntry";
			definition = "Entry which contains the interest.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CashEntry.mmInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashEntry.mmObject();
		}
	};
	protected ISODate paymentDate;
	/**
	 * Date of the next interest payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestAmount1#mmValueDate
	 * InterestAmount1.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestResult1#mmValueDate
	 * InterestResult1.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestAmount2#mmValueDate
	 * InterestAmount2.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestStatement1#mmValueDate
	 * InterestStatement1.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestStatement2#mmValueDate
	 * InterestStatement2.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestStatement3#mmValueDate
	 * InterestStatement3.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestPaymentDateRange1#mmExpectedDate
	 * InterestPaymentDateRange1.mmExpectedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestPaymentDateRange1#mmDueDate
	 * InterestPaymentDateRange1.mmDueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestStatement4#mmValueDate
	 * InterestStatement4.mmValueDate}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmPaymentDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(InterestAmount1.mmValueDate, InterestResult1.mmValueDate, InterestAmount2.mmValueDate, InterestStatement1.mmValueDate, InterestStatement2.mmValueDate, InterestStatement3.mmValueDate,
					InterestPaymentDateRange1.mmExpectedDate, InterestPaymentDateRange1.mmDueDate, InterestStatement4.mmValueDate);
			elementContext_lazy = () -> Interest.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentDate";
			definition = "Date of the next interest payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected InterestManagement relatedInterestManagement;
	/**
	 * Management of interest which consists into calculating the interest,
	 * requesting its payment or distributing the interest proceeds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InterestManagement#mmInterest
	 * InterestManagement.mmInterest}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedInterestManagement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Interest.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedInterestManagement";
			definition = "Management of interest which consists into calculating the interest, requesting its payment or distributing the interest proceeds.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InterestManagement.mmInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InterestManagement.mmObject();
		}
	};
	protected UndertakingAmount relatedUndertakingAmount;
	/**
	 * Undertaking amount for which an interest is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingAmount#mmInterest
	 * UndertakingAmount.mmInterest}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedUndertakingAmount = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Interest.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedUndertakingAmount";
			definition = "Undertaking amount for which an interest is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.UndertakingAmount.mmInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.UndertakingAmount.mmObject();
		}
	};
	protected DebitCreditFacility relatedDebitCreditFacility;
	/**
	 * Debit and credit facilities on which the interest applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DebitCreditFacility#mmCashAccountInterest
	 * DebitCreditFacility.mmCashAccountInterest}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedDebitCreditFacility = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Interest.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedDebitCreditFacility";
			definition = "Debit and credit facilities on which the interest applies.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.DebitCreditFacility.mmCashAccountInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DebitCreditFacility.mmObject();
		}
	};
	protected SecuritiesSettlement securitiesSettlement;
	/**
	 * Securities settlement process for which an accrued interest is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmAccruedInterest
	 * SecuritiesSettlement.mmAccruedInterest}</li>
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
	public static final MMBusinessAssociationEnd mmSecuritiesSettlement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Interest.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesSettlement";
			definition = "Securities settlement process for which an accrued interest is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmAccruedInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
		}
	};
	protected GenericIdentification interestName;
	/**
	 * Interest rate expressed as a rate name.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentificationForInterestName
	 * GenericIdentification.mmIdentificationForInterestName}</li>
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
	public static final MMBusinessAssociationEnd mmInterestName = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Interest.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InterestName";
			definition = "Interest rate expressed as a rate name.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmIdentificationForInterestName;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
		}
	};
	protected AssetHolding relatedAssetHolding;
	/**
	 * Asset holding on which interest is paid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmInterest
	 * AssetHolding.mmInterest}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedAssetHolding = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Interest.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedAssetHolding";
			definition = "Asset holding on which interest is paid.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmObject();
		}
	};
	protected Deposit deposit;
	/**
	 * Deposit for which an interest is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Deposit#mmInterest
	 * Deposit.mmInterest}</li>
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
	public static final MMBusinessAssociationEnd mmDeposit = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Interest.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Deposit";
			definition = "Deposit for which an interest is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Deposit.mmInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Deposit.mmObject();
		}
	};
	protected Balance accountBalance;
	/**
	 * Balance for which an interest is calculated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Balance#mmInterest
	 * Balance.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Balance Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts4#mmDailyBalance
	 * ATMTransactionAmounts4.mmDailyBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts4#mmWeeklyBalance
	 * ATMTransactionAmounts4.mmWeeklyBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts4#mmMonthlyBalance
	 * ATMTransactionAmounts4.mmMonthlyBalance}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmAccountBalance = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(ATMTransactionAmounts4.mmDailyBalance, ATMTransactionAmounts4.mmWeeklyBalance, ATMTransactionAmounts4.mmMonthlyBalance);
			elementContext_lazy = () -> Interest.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccountBalance";
			definition = "Balance for which an interest is calculated.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Balance.mmInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Balance.mmObject();
		}
	};
	protected AccountContract relatedAccountContract;
	/**
	 * Account contract for which interest parameters are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountContract#mmInterest
	 * AccountContract.mmInterest}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedAccountContract = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Interest.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedAccountContract";
			definition = "Account contract for which interest parameters are specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.AccountContract.mmInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AccountContract.mmObject();
		}
	};
	protected NetAssetValueCalculation relatedNetAssetValueCalculation;
	/**
	 * Net asset value calculation for which an accrued interest is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmInterest
	 * NetAssetValueCalculation.mmInterest}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedNetAssetValueCalculation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Interest.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedNetAssetValueCalculation";
			definition = "Net asset value calculation for which an accrued interest is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
		}
	};
	protected InterestTypeCode typeOfInterest;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Order16#mmInterestType
	 * Order16.mmInterestType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order14#mmInterestType
	 * Order14.mmInterestType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order17#mmInterestType
	 * Order17.mmInterestType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order18#mmInterestType
	 * Order18.mmInterestType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction1#mmRateType
	 * UnsecuredMarketTransaction1.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction1#mmRateType
	 * SecuredMarketTransaction1.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction2#mmRateType
	 * UnsecuredMarketTransaction2.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction2#mmRateType
	 * SecuredMarketTransaction2.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction3#mmRateType
	 * UnsecuredMarketTransaction3.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction3#mmRateType
	 * SecuredMarketTransaction3.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4#mmRateType
	 * SecuredMarketTransaction4.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4#mmRateType
	 * UnsecuredMarketTransaction4.mmRateType}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmTypeOfInterest = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Order16.mmInterestType, Order14.mmInterestType, Order17.mmInterestType, Order18.mmInterestType, UnsecuredMarketTransaction1.mmRateType, SecuredMarketTransaction1.mmRateType,
					UnsecuredMarketTransaction2.mmRateType, SecuredMarketTransaction2.mmRateType, UnsecuredMarketTransaction3.mmRateType, SecuredMarketTransaction3.mmRateType, SecuredMarketTransaction4.mmRateType,
					UnsecuredMarketTransaction4.mmRateType);
			elementContext_lazy = () -> Interest.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TypeOfInterest";
			definition = "Specifies the type of interest associated with a trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InterestTypeCode.mmObject();
		}
	};
	protected PaymentCard relatedPaymentCard;
	/**
	 * Payment card for which interest on due amounts is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard#mmInterest
	 * PaymentCard.mmInterest}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedPaymentCard = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Interest.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedPaymentCard";
			definition = "Payment card for which interest on due amounts is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentCard.mmInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentCard.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Interest";
				definition = "Consideration, such as amount of money,  paid or received in exchange for an asset that has been invested, loaned or borrowed for a certain period. The interest is expressed as a fixed amount or percentage of the amount upon which the interest is applied.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.mmIdentificationForInterestName, com.tools20022.repository.entity.NetAssetValueCalculation.mmInterest,
						com.tools20022.repository.entity.Tax.mmInterest, com.tools20022.repository.entity.AccountContract.mmInterest, com.tools20022.repository.entity.PaymentCard.mmInterest,
						com.tools20022.repository.entity.CashEntry.mmInterest, com.tools20022.repository.entity.AssetHolding.mmInterest, com.tools20022.repository.entity.Balance.mmInterest,
						com.tools20022.repository.entity.SecuritiesSettlement.mmAccruedInterest, com.tools20022.repository.entity.InterestCalculation.mmInterest, com.tools20022.repository.entity.SecuritiesFinancing.mmInterest,
						com.tools20022.repository.entity.CashProceedsDefinition.mmInterest, com.tools20022.repository.entity.DebitCreditFacility.mmCashAccountInterest, com.tools20022.repository.entity.UndertakingAmount.mmInterest,
						com.tools20022.repository.entity.Deposit.mmInterest, com.tools20022.repository.entity.InterestManagement.mmInterest);
				derivationElement_lazy = () -> Arrays.asList(InterestRateUsedForPaymentFormat2Choice.mmRateTypeAndAmountAndRateStatus, InterestRateUsedForPaymentFormat3Choice.mmRateTypeAndAmountAndRateStatus,
						InterestRateUsedForPaymentFormat1Choice.mmRateTypeAndAmountAndRateStatus, InterestRateUsedForPaymentFormat4Choice.mmRateTypeAndAmountAndRateStatus,
						InterestRateUsedForPaymentFormat5Choice.mmRateTypeAndAmountAndRateStatus, InterestRateUsedForPaymentFormat6Choice.mmRateTypeAndAmountAndRateStatus,
						InterestRateUsedForPaymentFormat8Choice.mmRateTypeAndAmountAndRateStatus, InterestRateUsedForPaymentFormat7Choice.mmRateTypeAndAmountAndRateStatus,
						InterestRateUsedForPaymentFormat9Choice.mmRateTypeAndAmountAndRateStatus, InterestRateUsedForPaymentFormat10Choice.mmRateTypeAndAmountAndRateStatus);
				element_lazy = () -> Arrays.asList(Interest.mmAccruedInterestAmount, Interest.mmInterestCalculation, Interest.mmAmount, Interest.mmRate, Interest.mmRelatedCashProceedsDefinition, Interest.mmSecuritiesFinancing,
						Interest.mmInterestTax, Interest.mmCreditDebitIndicator, Interest.mmCashEntry, Interest.mmPaymentDate, Interest.mmRelatedInterestManagement, Interest.mmRelatedUndertakingAmount,
						Interest.mmRelatedDebitCreditFacility, Interest.mmSecuritiesSettlement, Interest.mmInterestName, Interest.mmRelatedAssetHolding, Interest.mmDeposit, Interest.mmAccountBalance, Interest.mmRelatedAccountContract,
						Interest.mmRelatedNetAssetValueCalculation, Interest.mmTypeOfInterest, Interest.mmRelatedPaymentCard);
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

	public CurrencyAndAmount getAccruedInterestAmount() {
		return accruedInterestAmount;
	}

	public void setAccruedInterestAmount(CurrencyAndAmount accruedInterestAmount) {
		this.accruedInterestAmount = accruedInterestAmount;
	}

	public List<InterestCalculation> getInterestCalculation() {
		return interestCalculation;
	}

	public void setInterestCalculation(List<com.tools20022.repository.entity.InterestCalculation> interestCalculation) {
		this.interestCalculation = interestCalculation;
	}

	public CurrencyAndAmount getAmount() {
		return amount;
	}

	public void setAmount(CurrencyAndAmount amount) {
		this.amount = amount;
	}

	public PercentageRate getRate() {
		return rate;
	}

	public void setRate(PercentageRate rate) {
		this.rate = rate;
	}

	public List<CashProceedsDefinition> getRelatedCashProceedsDefinition() {
		return relatedCashProceedsDefinition;
	}

	public void setRelatedCashProceedsDefinition(List<com.tools20022.repository.entity.CashProceedsDefinition> relatedCashProceedsDefinition) {
		this.relatedCashProceedsDefinition = relatedCashProceedsDefinition;
	}

	public List<SecuritiesFinancing> getSecuritiesFinancing() {
		return securitiesFinancing;
	}

	public void setSecuritiesFinancing(List<com.tools20022.repository.entity.SecuritiesFinancing> securitiesFinancing) {
		this.securitiesFinancing = securitiesFinancing;
	}

	public Tax getInterestTax() {
		return interestTax;
	}

	public void setInterestTax(com.tools20022.repository.entity.Tax interestTax) {
		this.interestTax = interestTax;
	}

	public DebitCreditCode getCreditDebitIndicator() {
		return creditDebitIndicator;
	}

	public void setCreditDebitIndicator(DebitCreditCode creditDebitIndicator) {
		this.creditDebitIndicator = creditDebitIndicator;
	}

	public CashEntry getCashEntry() {
		return cashEntry;
	}

	public void setCashEntry(com.tools20022.repository.entity.CashEntry cashEntry) {
		this.cashEntry = cashEntry;
	}

	public ISODate getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(ISODate paymentDate) {
		this.paymentDate = paymentDate;
	}

	public InterestManagement getRelatedInterestManagement() {
		return relatedInterestManagement;
	}

	public void setRelatedInterestManagement(com.tools20022.repository.entity.InterestManagement relatedInterestManagement) {
		this.relatedInterestManagement = relatedInterestManagement;
	}

	public UndertakingAmount getRelatedUndertakingAmount() {
		return relatedUndertakingAmount;
	}

	public void setRelatedUndertakingAmount(com.tools20022.repository.entity.UndertakingAmount relatedUndertakingAmount) {
		this.relatedUndertakingAmount = relatedUndertakingAmount;
	}

	public DebitCreditFacility getRelatedDebitCreditFacility() {
		return relatedDebitCreditFacility;
	}

	public void setRelatedDebitCreditFacility(com.tools20022.repository.entity.DebitCreditFacility relatedDebitCreditFacility) {
		this.relatedDebitCreditFacility = relatedDebitCreditFacility;
	}

	public SecuritiesSettlement getSecuritiesSettlement() {
		return securitiesSettlement;
	}

	public void setSecuritiesSettlement(com.tools20022.repository.entity.SecuritiesSettlement securitiesSettlement) {
		this.securitiesSettlement = securitiesSettlement;
	}

	public GenericIdentification getInterestName() {
		return interestName;
	}

	public void setInterestName(com.tools20022.repository.entity.GenericIdentification interestName) {
		this.interestName = interestName;
	}

	public AssetHolding getRelatedAssetHolding() {
		return relatedAssetHolding;
	}

	public void setRelatedAssetHolding(com.tools20022.repository.entity.AssetHolding relatedAssetHolding) {
		this.relatedAssetHolding = relatedAssetHolding;
	}

	public Deposit getDeposit() {
		return deposit;
	}

	public void setDeposit(com.tools20022.repository.entity.Deposit deposit) {
		this.deposit = deposit;
	}

	public Balance getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(com.tools20022.repository.entity.Balance accountBalance) {
		this.accountBalance = accountBalance;
	}

	public AccountContract getRelatedAccountContract() {
		return relatedAccountContract;
	}

	public void setRelatedAccountContract(com.tools20022.repository.entity.AccountContract relatedAccountContract) {
		this.relatedAccountContract = relatedAccountContract;
	}

	public NetAssetValueCalculation getRelatedNetAssetValueCalculation() {
		return relatedNetAssetValueCalculation;
	}

	public void setRelatedNetAssetValueCalculation(com.tools20022.repository.entity.NetAssetValueCalculation relatedNetAssetValueCalculation) {
		this.relatedNetAssetValueCalculation = relatedNetAssetValueCalculation;
	}

	public InterestTypeCode getTypeOfInterest() {
		return typeOfInterest;
	}

	public void setTypeOfInterest(InterestTypeCode typeOfInterest) {
		this.typeOfInterest = typeOfInterest;
	}

	public PaymentCard getRelatedPaymentCard() {
		return relatedPaymentCard;
	}

	public void setRelatedPaymentCard(com.tools20022.repository.entity.PaymentCard relatedPaymentCard) {
		this.relatedPaymentCard = relatedPaymentCard;
	}
}