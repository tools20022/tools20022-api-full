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
import com.tools20022.repository.codeset.BalanceTypeCode;
import com.tools20022.repository.codeset.DebitCreditCode;
import com.tools20022.repository.codeset.ProcessingTypeCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.msg.BalanceDetails5;
import com.tools20022.repository.msg.BalanceDetails6;
import com.tools20022.repository.msg.CashSubBalanceTypeAndQuantityBreakdown1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Numerical representation of the net increases and decreases in an account at
 * a specific point in time.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Balance" src="doc-files/Balance.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Balance#Type Balance.Type}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Balance#ValueDate
 * Balance.ValueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Balance#CreditDebitIndicator
 * Balance.CreditDebitIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Balance#AssetHolding
 * Balance.AssetHolding}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Balance#CalculationDate
 * Balance.CalculationDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Balance#Adjustment
 * Balance.Adjustment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Balance#Account
 * Balance.Account}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Balance#Interest
 * Balance.Interest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Balance#BalanceEntry
 * Balance.BalanceEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Balance#ProcessingRestriction
 * Balance.ProcessingRestriction}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Balance#OpeningClosingCode
 * Balance.OpeningClosingCode}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Account#Balance
 * Account.Balance}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#AdjustedBalance
 * Adjustment.AdjustedBalance}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Entry#Balance Entry.Balance}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#Balance
 * AssetHolding.Balance}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#AccountBalance
 * Interest.AccountBalance}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BalanceDetails5#DetailedBalance
 * BalanceDetails5.DetailedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PortfolioBalance1#SummaryBalance
 * PortfolioBalance1.SummaryBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PortfolioBalance1#DetailedBalance
 * PortfolioBalance1.DetailedBalance}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CashBalance CashBalance}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesBalance
 * SecuritiesBalance}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.BalanceType9Choice
 * BalanceType9Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.BalanceType1Choice
 * BalanceType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.BalanceType6Choice
 * BalanceType6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.BalanceType7Choice
 * BalanceType7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BalanceDetails6
 * BalanceDetails6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BalanceDetails5
 * BalanceDetails5}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PortfolioBalance1
 * PortfolioBalance1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CashBalanceType1Choice
 * CashBalanceType1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashSubBalanceTypeAndQuantityBreakdown1
 * CashSubBalanceTypeAndQuantityBreakdown1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ContractBalanceType1Choice
 * ContractBalanceType1Choice}</li>
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
 * "Balance"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Numerical representation of the net increases and decreases in an account at a specific point in time."
 * </li>
 * </ul>
 */
public class Balance {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the nature of a balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
	 * BalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceDetails2#BalanceType
	 * BalanceDetails2.BalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceDetails3#BalanceType
	 * BalanceDetails3.BalanceType}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.BalanceType3Choice#Code
	 * BalanceType3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceType3Choice#Proprietary
	 * BalanceType3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceDetails4#BalanceType
	 * BalanceDetails4.BalanceType}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.BalanceType8Choice#Code
	 * BalanceType8Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceType8Choice#Proprietary
	 * BalanceType8Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalance4#Type
	 * CashBalance4.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalanceDetails2#Type
	 * CashBalanceDetails2.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalanceDetails3#Type
	 * CashBalanceDetails3.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalanceDetails4#Type
	 * CashBalanceDetails4.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalanceDetails5#Type
	 * CashBalanceDetails5.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalanceDetails6#Type
	 * CashBalanceDetails6.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.BalanceType4Choice#Code
	 * BalanceType4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceType4Choice#Proprietary
	 * BalanceType4Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalanceDetails7#Type
	 * CashBalanceDetails7.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalance5#Type
	 * CashBalance5.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.BalanceType9Choice#Code
	 * BalanceType9Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceType9Choice#Proprietary
	 * BalanceType9Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalance6#Type
	 * CashBalance6.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails50#SecuritiesSubBalanceType
	 * SettlementDetails50.SecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails50#CashSubBalanceType
	 * SettlementDetails50.CashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails51#SecuritiesSubBalanceType
	 * SettlementDetails51.SecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails51#CashSubBalanceType
	 * SettlementDetails51.CashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown9#SecuritiesSubBalanceType
	 * QuantityBreakdown9.SecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown12#SecuritiesSubBalanceType
	 * QuantityBreakdown12.SecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown17#SecuritiesSubBalanceType
	 * QuantityBreakdown17.SecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails24#SecuritiesSubBalanceType
	 * SettlementDetails24.SecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails24#CashSubBalanceType
	 * SettlementDetails24.CashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown10#SecuritiesSubBalanceType
	 * QuantityBreakdown10.SecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails33#SecuritiesSubBalanceType
	 * SettlementDetails33.SecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails33#CashSubBalanceType
	 * SettlementDetails33.CashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown16#SecuritiesSubBalanceType
	 * QuantityBreakdown16.SecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails45#SecuritiesSubBalanceType
	 * SettlementDetails45.SecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails45#CashSubBalanceType
	 * SettlementDetails45.CashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown21#SecuritiesSubBalanceType
	 * QuantityBreakdown21.SecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails54#SecuritiesSubBalanceType
	 * SettlementDetails54.SecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails54#CashSubBalanceType
	 * SettlementDetails54.CashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails22#SecuritiesSubBalanceType
	 * SettlementDetails22.SecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails22#CashSubBalanceType
	 * SettlementDetails22.CashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails35#SecuritiesSubBalanceType
	 * SettlementDetails35.SecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails35#CashSubBalanceType
	 * SettlementDetails35.CashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#SecuritiesSubBalanceType
	 * SettlementDetails42.SecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#CashSubBalanceType
	 * SettlementDetails42.CashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails52#SecuritiesSubBalanceType
	 * SettlementDetails52.SecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails52#CashSubBalanceType
	 * SettlementDetails52.CashSubBalanceType}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.BalanceType1Choice#Code
	 * BalanceType1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceType1Choice#Proprietary
	 * BalanceType1Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalance1#Type
	 * CashBalance1.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.BalanceType5Choice#Code
	 * BalanceType5Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceType5Choice#Proprietary
	 * BalanceType5Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceSubType1Choice#Code
	 * BalanceSubType1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceSubType1Choice#Proprietary
	 * BalanceSubType1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceType12#CodeOrProprietary
	 * BalanceType12.CodeOrProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BalanceType12#SubType
	 * BalanceType12.SubType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalance3#Type
	 * CashBalance3.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.BalanceType2Choice#Code
	 * BalanceType2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceType2Choice#Proprietary
	 * BalanceType2Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalance2#Type
	 * CashBalance2.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportData1#Type
	 * ReportData1.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportData5#Type
	 * ReportData5.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportData2#Type
	 * ReportData2.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportData3#Type
	 * ReportData3.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportData4#Type
	 * ReportData4.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CashBalanceType1FormatType#Code
	 * CashBalanceType1FormatType.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CashBalanceType1FormatType#Proprietary
	 * CashBalanceType1FormatType.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount18#BalanceType
	 * CashAccount18.BalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails26#SecuritiesSubBalanceType
	 * SettlementDetails26.SecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails26#CashSubBalanceType
	 * SettlementDetails26.CashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportingRequest1#RequestedBalanceType
	 * ReportingRequest1.RequestedBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportingRequest2#RequestedBalanceType
	 * ReportingRequest2.RequestedBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportingRequest3#RequestedBalanceType
	 * ReportingRequest3.RequestedBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails36#SecuritiesSubBalanceType
	 * SettlementDetails36.SecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails36#CashSubBalanceType
	 * SettlementDetails36.CashSubBalanceType}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.BalanceType6Choice#Code
	 * BalanceType6Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceType6Choice#Proprietary
	 * BalanceType6Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.BalanceType7Choice#Code
	 * BalanceType7Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceType7Choice#Proprietary
	 * BalanceType7Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BalanceDetails6#Type
	 * BalanceDetails6.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BalanceDetails5#Type
	 * BalanceDetails5.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BillingBalanceType1Choice#Code
	 * BillingBalanceType1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BillingBalanceType1Choice#Proprietary
	 * BillingBalanceType1Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BillingBalance1#Type
	 * BillingBalance1.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CashBalanceType1Choice#Code
	 * CashBalanceType1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CashBalanceType1Choice#Proprietary
	 * CashBalanceType1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown22#CashSubBalanceType
	 * QuantityBreakdown22.CashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashSubBalanceTypeAndQuantityBreakdown1#Type
	 * CashSubBalanceTypeAndQuantityBreakdown1.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#SecuritiesSubBalanceType
	 * SettlementDetails67.SecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#CashSubBalanceType
	 * SettlementDetails67.CashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails70#SecuritiesSubBalanceType
	 * SettlementDetails70.SecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails70#CashSubBalanceType
	 * SettlementDetails70.CashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#SecuritiesSubBalanceType
	 * SettlementDetails68.SecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#CashSubBalanceType
	 * SettlementDetails68.CashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails81#SecuritiesSubBalanceType
	 * SettlementDetails81.SecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails81#CashSubBalanceType
	 * SettlementDetails81.CashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails80#SecuritiesSubBalanceType
	 * SettlementDetails80.SecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails80#CashSubBalanceType
	 * SettlementDetails80.CashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails83#SecuritiesSubBalanceType
	 * SettlementDetails83.SecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails83#CashSubBalanceType
	 * SettlementDetails83.CashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ContractBalanceType1Choice#Code
	 * ContractBalanceType1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ContractBalanceType1Choice#Proprietary
	 * ContractBalanceType1Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ContractBalance1#Type
	 * ContractBalance1.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#SecuritiesSubBalanceType
	 * SettlementDetails93.SecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#CashSubBalanceType
	 * SettlementDetails93.CashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails90#SecuritiesSubBalanceType
	 * SettlementDetails90.SecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails90#CashSubBalanceType
	 * SettlementDetails90.CashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown29#SecuritiesSubBalanceType
	 * QuantityBreakdown29.SecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#SecuritiesSubBalanceType
	 * SettlementDetails94.SecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#CashSubBalanceType
	 * SettlementDetails94.CashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown32#SecuritiesSubBalanceType
	 * QuantityBreakdown32.SecuritiesSubBalanceType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalance7#Type
	 * CashBalance7.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails101#SecuritiesSubBalanceType
	 * SettlementDetails101.SecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails101#CashSubBalanceType
	 * SettlementDetails101.CashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails111#SecuritiesSubBalanceType
	 * SettlementDetails111.SecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails111#CashSubBalanceType
	 * SettlementDetails111.CashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails112#SecuritiesSubBalanceType
	 * SettlementDetails112.SecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails112#CashSubBalanceType
	 * SettlementDetails112.CashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails110#SecuritiesSubBalanceType
	 * SettlementDetails110.SecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails110#CashSubBalanceType
	 * SettlementDetails110.CashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown44#SecuritiesSubBalanceType
	 * QuantityBreakdown44.SecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails113#SecuritiesSubBalanceType
	 * SettlementDetails113.SecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails113#CashSubBalanceType
	 * SettlementDetails113.CashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown34#SecuritiesSubBalanceType
	 * QuantityBreakdown34.SecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails128#SecuritiesSubBalanceType
	 * SettlementDetails128.SecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails128#CashSubBalanceType
	 * SettlementDetails128.CashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#SecuritiesSubBalanceType
	 * SettlementDetails120.SecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#CashSubBalanceType
	 * SettlementDetails120.CashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#SecuritiesSubBalanceType
	 * SettlementDetails119.SecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#CashSubBalanceType
	 * SettlementDetails119.CashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#SecuritiesSubBalanceType
	 * SettlementDetails122.SecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#CashSubBalanceType
	 * SettlementDetails122.CashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails134#SecuritiesSubBalanceType
	 * SettlementDetails134.SecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails134#CashSubBalanceType
	 * SettlementDetails134.CashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails137#SecuritiesSubBalanceType
	 * SettlementDetails137.SecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails137#CashSubBalanceType
	 * SettlementDetails137.CashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails132#SecuritiesSubBalanceType
	 * SettlementDetails132.SecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails132#CashSubBalanceType
	 * SettlementDetails132.CashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails138#SecuritiesSubBalanceType
	 * SettlementDetails138.SecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails138#CashSubBalanceType
	 * SettlementDetails138.CashSubBalanceType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Balance
	 * Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the nature of a balance."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BalanceDetails2.BalanceType, com.tools20022.repository.msg.BalanceDetails3.BalanceType, com.tools20022.repository.choice.BalanceType3Choice.Code,
					com.tools20022.repository.choice.BalanceType3Choice.Proprietary, com.tools20022.repository.msg.BalanceDetails4.BalanceType, com.tools20022.repository.choice.BalanceType8Choice.Code,
					com.tools20022.repository.choice.BalanceType8Choice.Proprietary, com.tools20022.repository.msg.CashBalance4.Type, com.tools20022.repository.msg.CashBalanceDetails2.Type,
					com.tools20022.repository.msg.CashBalanceDetails3.Type, com.tools20022.repository.msg.CashBalanceDetails4.Type, com.tools20022.repository.msg.CashBalanceDetails5.Type,
					com.tools20022.repository.msg.CashBalanceDetails6.Type, com.tools20022.repository.choice.BalanceType4Choice.Code, com.tools20022.repository.choice.BalanceType4Choice.Proprietary,
					com.tools20022.repository.msg.CashBalanceDetails7.Type, com.tools20022.repository.msg.CashBalance5.Type, com.tools20022.repository.choice.BalanceType9Choice.Code,
					com.tools20022.repository.choice.BalanceType9Choice.Proprietary, com.tools20022.repository.msg.CashBalance6.Type, com.tools20022.repository.msg.SettlementDetails50.SecuritiesSubBalanceType,
					com.tools20022.repository.msg.SettlementDetails50.CashSubBalanceType, com.tools20022.repository.msg.SettlementDetails51.SecuritiesSubBalanceType, com.tools20022.repository.msg.SettlementDetails51.CashSubBalanceType,
					com.tools20022.repository.msg.QuantityBreakdown9.SecuritiesSubBalanceType, com.tools20022.repository.msg.QuantityBreakdown12.SecuritiesSubBalanceType,
					com.tools20022.repository.msg.QuantityBreakdown17.SecuritiesSubBalanceType, com.tools20022.repository.msg.SettlementDetails24.SecuritiesSubBalanceType,
					com.tools20022.repository.msg.SettlementDetails24.CashSubBalanceType, com.tools20022.repository.msg.QuantityBreakdown10.SecuritiesSubBalanceType,
					com.tools20022.repository.msg.SettlementDetails33.SecuritiesSubBalanceType, com.tools20022.repository.msg.SettlementDetails33.CashSubBalanceType,
					com.tools20022.repository.msg.QuantityBreakdown16.SecuritiesSubBalanceType, com.tools20022.repository.msg.SettlementDetails45.SecuritiesSubBalanceType,
					com.tools20022.repository.msg.SettlementDetails45.CashSubBalanceType, com.tools20022.repository.msg.QuantityBreakdown21.SecuritiesSubBalanceType,
					com.tools20022.repository.msg.SettlementDetails54.SecuritiesSubBalanceType, com.tools20022.repository.msg.SettlementDetails54.CashSubBalanceType,
					com.tools20022.repository.msg.SettlementDetails22.SecuritiesSubBalanceType, com.tools20022.repository.msg.SettlementDetails22.CashSubBalanceType,
					com.tools20022.repository.msg.SettlementDetails35.SecuritiesSubBalanceType, com.tools20022.repository.msg.SettlementDetails35.CashSubBalanceType,
					com.tools20022.repository.msg.SettlementDetails42.SecuritiesSubBalanceType, com.tools20022.repository.msg.SettlementDetails42.CashSubBalanceType,
					com.tools20022.repository.msg.SettlementDetails52.SecuritiesSubBalanceType, com.tools20022.repository.msg.SettlementDetails52.CashSubBalanceType, com.tools20022.repository.choice.BalanceType1Choice.Code,
					com.tools20022.repository.choice.BalanceType1Choice.Proprietary, com.tools20022.repository.msg.CashBalance1.Type, com.tools20022.repository.choice.BalanceType5Choice.Code,
					com.tools20022.repository.choice.BalanceType5Choice.Proprietary, com.tools20022.repository.choice.BalanceSubType1Choice.Code, com.tools20022.repository.choice.BalanceSubType1Choice.Proprietary,
					com.tools20022.repository.msg.BalanceType12.CodeOrProprietary, com.tools20022.repository.msg.BalanceType12.SubType, com.tools20022.repository.msg.CashBalance3.Type,
					com.tools20022.repository.choice.BalanceType2Choice.Code, com.tools20022.repository.choice.BalanceType2Choice.Proprietary, com.tools20022.repository.msg.CashBalance2.Type, com.tools20022.repository.msg.ReportData1.Type,
					com.tools20022.repository.msg.ReportData5.Type, com.tools20022.repository.msg.ReportData2.Type, com.tools20022.repository.msg.ReportData3.Type, com.tools20022.repository.msg.ReportData4.Type,
					com.tools20022.repository.choice.CashBalanceType1FormatType.Code, com.tools20022.repository.choice.CashBalanceType1FormatType.Proprietary, com.tools20022.repository.msg.CashAccount18.BalanceType,
					com.tools20022.repository.msg.SettlementDetails26.SecuritiesSubBalanceType, com.tools20022.repository.msg.SettlementDetails26.CashSubBalanceType, com.tools20022.repository.msg.ReportingRequest1.RequestedBalanceType,
					com.tools20022.repository.msg.ReportingRequest2.RequestedBalanceType, com.tools20022.repository.msg.ReportingRequest3.RequestedBalanceType, com.tools20022.repository.msg.SettlementDetails36.SecuritiesSubBalanceType,
					com.tools20022.repository.msg.SettlementDetails36.CashSubBalanceType, com.tools20022.repository.choice.BalanceType6Choice.Code, com.tools20022.repository.choice.BalanceType6Choice.Proprietary,
					com.tools20022.repository.choice.BalanceType7Choice.Code, com.tools20022.repository.choice.BalanceType7Choice.Proprietary, com.tools20022.repository.msg.BalanceDetails6.Type,
					com.tools20022.repository.msg.BalanceDetails5.Type, com.tools20022.repository.choice.BillingBalanceType1Choice.Code, com.tools20022.repository.choice.BillingBalanceType1Choice.Proprietary,
					com.tools20022.repository.msg.BillingBalance1.Type, com.tools20022.repository.choice.CashBalanceType1Choice.Code, com.tools20022.repository.choice.CashBalanceType1Choice.Proprietary,
					com.tools20022.repository.msg.QuantityBreakdown22.CashSubBalanceType, com.tools20022.repository.msg.CashSubBalanceTypeAndQuantityBreakdown1.Type,
					com.tools20022.repository.msg.SettlementDetails67.SecuritiesSubBalanceType, com.tools20022.repository.msg.SettlementDetails67.CashSubBalanceType,
					com.tools20022.repository.msg.SettlementDetails70.SecuritiesSubBalanceType, com.tools20022.repository.msg.SettlementDetails70.CashSubBalanceType,
					com.tools20022.repository.msg.SettlementDetails68.SecuritiesSubBalanceType, com.tools20022.repository.msg.SettlementDetails68.CashSubBalanceType,
					com.tools20022.repository.msg.SettlementDetails81.SecuritiesSubBalanceType, com.tools20022.repository.msg.SettlementDetails81.CashSubBalanceType,
					com.tools20022.repository.msg.SettlementDetails80.SecuritiesSubBalanceType, com.tools20022.repository.msg.SettlementDetails80.CashSubBalanceType,
					com.tools20022.repository.msg.SettlementDetails83.SecuritiesSubBalanceType, com.tools20022.repository.msg.SettlementDetails83.CashSubBalanceType, com.tools20022.repository.choice.ContractBalanceType1Choice.Code,
					com.tools20022.repository.choice.ContractBalanceType1Choice.Proprietary, com.tools20022.repository.msg.ContractBalance1.Type, com.tools20022.repository.msg.SettlementDetails93.SecuritiesSubBalanceType,
					com.tools20022.repository.msg.SettlementDetails93.CashSubBalanceType, com.tools20022.repository.msg.SettlementDetails90.SecuritiesSubBalanceType, com.tools20022.repository.msg.SettlementDetails90.CashSubBalanceType,
					com.tools20022.repository.msg.QuantityBreakdown29.SecuritiesSubBalanceType, com.tools20022.repository.msg.SettlementDetails94.SecuritiesSubBalanceType,
					com.tools20022.repository.msg.SettlementDetails94.CashSubBalanceType, com.tools20022.repository.msg.QuantityBreakdown32.SecuritiesSubBalanceType, com.tools20022.repository.msg.CashBalance7.Type,
					com.tools20022.repository.msg.SettlementDetails101.SecuritiesSubBalanceType, com.tools20022.repository.msg.SettlementDetails101.CashSubBalanceType,
					com.tools20022.repository.msg.SettlementDetails111.SecuritiesSubBalanceType, com.tools20022.repository.msg.SettlementDetails111.CashSubBalanceType,
					com.tools20022.repository.msg.SettlementDetails112.SecuritiesSubBalanceType, com.tools20022.repository.msg.SettlementDetails112.CashSubBalanceType,
					com.tools20022.repository.msg.SettlementDetails110.SecuritiesSubBalanceType, com.tools20022.repository.msg.SettlementDetails110.CashSubBalanceType,
					com.tools20022.repository.msg.QuantityBreakdown44.SecuritiesSubBalanceType, com.tools20022.repository.msg.SettlementDetails113.SecuritiesSubBalanceType,
					com.tools20022.repository.msg.SettlementDetails113.CashSubBalanceType, com.tools20022.repository.msg.QuantityBreakdown34.SecuritiesSubBalanceType,
					com.tools20022.repository.msg.SettlementDetails128.SecuritiesSubBalanceType, com.tools20022.repository.msg.SettlementDetails128.CashSubBalanceType,
					com.tools20022.repository.msg.SettlementDetails120.SecuritiesSubBalanceType, com.tools20022.repository.msg.SettlementDetails120.CashSubBalanceType,
					com.tools20022.repository.msg.SettlementDetails119.SecuritiesSubBalanceType, com.tools20022.repository.msg.SettlementDetails119.CashSubBalanceType,
					com.tools20022.repository.msg.SettlementDetails122.SecuritiesSubBalanceType, com.tools20022.repository.msg.SettlementDetails122.CashSubBalanceType,
					com.tools20022.repository.msg.SettlementDetails134.SecuritiesSubBalanceType, com.tools20022.repository.msg.SettlementDetails134.CashSubBalanceType,
					com.tools20022.repository.msg.SettlementDetails137.SecuritiesSubBalanceType, com.tools20022.repository.msg.SettlementDetails137.CashSubBalanceType,
					com.tools20022.repository.msg.SettlementDetails132.SecuritiesSubBalanceType, com.tools20022.repository.msg.SettlementDetails132.CashSubBalanceType,
					com.tools20022.repository.msg.SettlementDetails138.SecuritiesSubBalanceType, com.tools20022.repository.msg.SettlementDetails138.CashSubBalanceType);
			elementContext_lazy = () -> Balance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Specifies the nature of a balance.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> BalanceTypeCode.mmObject();
		}
	};
	/**
	 * Date and time at which the balance is or will be available.
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
	 * {@linkplain com.tools20022.repository.msg.BalanceDetails2#BalanceValueDate
	 * BalanceDetails2.BalanceValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceDetails3#BalanceValueDate
	 * BalanceDetails3.BalanceValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceDetails4#BalanceValueDate
	 * BalanceDetails4.BalanceValueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalance4#ValueDate
	 * CashBalance4.ValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalanceDetails2#ValueDate
	 * CashBalanceDetails2.ValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalanceDetails3#ValueDate
	 * CashBalanceDetails3.ValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalanceDetails4#ValueDate
	 * CashBalanceDetails4.ValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalanceDetails5#ValueDate
	 * CashBalanceDetails5.ValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalanceDetails6#ValueDate
	 * CashBalanceDetails6.ValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalanceDetails7#ValueDate
	 * CashBalanceDetails7.ValueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalance5#ValueDate
	 * CashBalance5.ValueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalance6#ValueDate
	 * CashBalance6.ValueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalance1#Date
	 * CashBalance1.Date}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalance3#Date
	 * CashBalance3.Date}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalance2#Date
	 * CashBalance2.Date}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportData1#ValueDate
	 * ReportData1.ValueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportData5#ValueDate
	 * ReportData5.ValueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportData2#ValueDate
	 * ReportData2.ValueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportData3#ValueDate
	 * ReportData3.ValueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportData4#ValueDate
	 * ReportData4.ValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAggregateBalance1#ItemDate
	 * FinancialInstrumentAggregateBalance1.ItemDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalance7#Date
	 * CashBalance7.Date}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Balance
	 * Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which the balance is or will be available."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ValueDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BalanceDetails2.BalanceValueDate, com.tools20022.repository.msg.BalanceDetails3.BalanceValueDate,
					com.tools20022.repository.msg.BalanceDetails4.BalanceValueDate, com.tools20022.repository.msg.CashBalance4.ValueDate, com.tools20022.repository.msg.CashBalanceDetails2.ValueDate,
					com.tools20022.repository.msg.CashBalanceDetails3.ValueDate, com.tools20022.repository.msg.CashBalanceDetails4.ValueDate, com.tools20022.repository.msg.CashBalanceDetails5.ValueDate,
					com.tools20022.repository.msg.CashBalanceDetails6.ValueDate, com.tools20022.repository.msg.CashBalanceDetails7.ValueDate, com.tools20022.repository.msg.CashBalance5.ValueDate,
					com.tools20022.repository.msg.CashBalance6.ValueDate, com.tools20022.repository.msg.CashBalance1.Date, com.tools20022.repository.msg.CashBalance3.Date, com.tools20022.repository.msg.CashBalance2.Date,
					com.tools20022.repository.msg.ReportData1.ValueDate, com.tools20022.repository.msg.ReportData5.ValueDate, com.tools20022.repository.msg.ReportData2.ValueDate, com.tools20022.repository.msg.ReportData3.ValueDate,
					com.tools20022.repository.msg.ReportData4.ValueDate, com.tools20022.repository.msg.FinancialInstrumentAggregateBalance1.ItemDate, com.tools20022.repository.msg.CashBalance7.Date);
			elementContext_lazy = () -> Balance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValueDate";
			definition = "Date and time at which the balance is or will be available.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Indicates whether the balance is a credit or a debit balance. A zero
	 * balance is considered to be a credit balance
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
	 * {@linkplain com.tools20022.repository.msg.CashBalanceDetails2#CreditDebitIndicator
	 * CashBalanceDetails2.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalanceDetails3#CreditDebitIndicator
	 * CashBalanceDetails3.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalanceDetails4#CreditDebitIndicator
	 * CashBalanceDetails4.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalanceDetails5#CreditDebitIndicator
	 * CashBalanceDetails5.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalanceDetails6#CreditDebitIndicator
	 * CashBalanceDetails6.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalanceDetails7#CreditDebitIndicator
	 * CashBalanceDetails7.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalance5#CreditDebitIndicator
	 * CashBalance5.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalance6#CreditDebitIndicator
	 * CashBalance6.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalanceAvailability1#CreditDebitIndicator
	 * CashBalanceAvailability1.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalance1#CreditDebitIndicator
	 * CashBalance1.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalanceAvailability2#CreditDebitIndicator
	 * CashBalanceAvailability2.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalance3#CreditDebitIndicator
	 * CashBalance3.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalance2#CreditDebitIndicator
	 * CashBalance2.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount19#CreditDebitIndicator
	 * CashAccount19.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount9#CreditDebitIndicator
	 * SecuritiesAccount9.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount12#CreditDebitIndicator
	 * SecuritiesAccount12.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount18#CreditDebitIndicator
	 * CashAccount18.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount8#CreditDebitIndicator
	 * SecuritiesAccount8.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount10#CreditDebitIndicator
	 * SecuritiesAccount10.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContractBalance1#CreditDebitIndicator
	 * ContractBalance1.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalance7#CreditDebitIndicator
	 * CashBalance7.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAvailability1#CreditDebitIndicator
	 * CashAvailability1.CreditDebitIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Balance
	 * Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the balance is a credit or a debit balance. A zero balance is considered to be a credit balance"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CreditDebitIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashBalanceDetails2.CreditDebitIndicator, com.tools20022.repository.msg.CashBalanceDetails3.CreditDebitIndicator,
					com.tools20022.repository.msg.CashBalanceDetails4.CreditDebitIndicator, com.tools20022.repository.msg.CashBalanceDetails5.CreditDebitIndicator, com.tools20022.repository.msg.CashBalanceDetails6.CreditDebitIndicator,
					com.tools20022.repository.msg.CashBalanceDetails7.CreditDebitIndicator, com.tools20022.repository.msg.CashBalance5.CreditDebitIndicator, com.tools20022.repository.msg.CashBalance6.CreditDebitIndicator,
					com.tools20022.repository.msg.CashBalanceAvailability1.CreditDebitIndicator, com.tools20022.repository.msg.CashBalance1.CreditDebitIndicator, com.tools20022.repository.msg.CashBalanceAvailability2.CreditDebitIndicator,
					com.tools20022.repository.msg.CashBalance3.CreditDebitIndicator, com.tools20022.repository.msg.CashBalance2.CreditDebitIndicator, com.tools20022.repository.msg.CashAccount19.CreditDebitIndicator,
					com.tools20022.repository.msg.SecuritiesAccount9.CreditDebitIndicator, com.tools20022.repository.msg.SecuritiesAccount12.CreditDebitIndicator, com.tools20022.repository.msg.CashAccount18.CreditDebitIndicator,
					com.tools20022.repository.msg.SecuritiesAccount8.CreditDebitIndicator, com.tools20022.repository.msg.SecuritiesAccount10.CreditDebitIndicator, com.tools20022.repository.msg.ContractBalance1.CreditDebitIndicator,
					com.tools20022.repository.msg.CashBalance7.CreditDebitIndicator, com.tools20022.repository.msg.CashAvailability1.CreditDebitIndicator);
			elementContext_lazy = () -> Balance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates whether the balance is a credit or a debit balance. A zero balance is considered to be a credit balance";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DebitCreditCode.mmObject();
		}
	};
	/**
	 * Specifies in terms of value and quantity the assets held in a balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#Balance
	 * AssetHolding.Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AssetHolding
	 * AssetHolding}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace7#AccountBaseCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace7.AccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace7#InstrumentCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace7.InstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace7#AlternateReportingCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace7.AlternateReportingCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation8#AccountBaseCurrencyAmounts
	 * AggregateBalanceInformation8.AccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation8#InstrumentCurrencyAmounts
	 * AggregateBalanceInformation8.InstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation8#AlternateReportingCurrencyAmounts
	 * AggregateBalanceInformation8.AlternateReportingCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace10#AccountBaseCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace10.AccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace10#InstrumentCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace10.InstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace10#AlternateReportingCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace10.AlternateReportingCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation11#AccountBaseCurrencyAmounts
	 * AggregateBalanceInformation11.AccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation11#InstrumentCurrencyAmounts
	 * AggregateBalanceInformation11.InstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation11#AlternateReportingCurrencyAmounts
	 * AggregateBalanceInformation11.AlternateReportingCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace12#AccountBaseCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace12.AccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace12#InstrumentCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace12.InstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace12#AlternateReportingCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace12.AlternateReportingCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation13#AccountBaseCurrencyAmounts
	 * AggregateBalanceInformation13.AccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation13#InstrumentCurrencyAmounts
	 * AggregateBalanceInformation13.InstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation13#AlternateReportingCurrencyAmounts
	 * AggregateBalanceInformation13.AlternateReportingCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace14#AccountBaseCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace14.AccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace14#InstrumentCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace14.InstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace14#AlternateReportingCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace14.AlternateReportingCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation15#AccountBaseCurrencyAmounts
	 * AggregateBalanceInformation15.AccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation15#InstrumentCurrencyAmounts
	 * AggregateBalanceInformation15.InstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation15#AlternateReportingCurrencyAmounts
	 * AggregateBalanceInformation15.AlternateReportingCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace16#AccountBaseCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace16.AccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace16#InstrumentCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace16.InstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace16#AlternateReportingCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace16.AlternateReportingCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation17#AccountBaseCurrencyAmounts
	 * AggregateBalanceInformation17.AccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation17#InstrumentCurrencyAmounts
	 * AggregateBalanceInformation17.InstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation17#AlternateReportingCurrencyAmounts
	 * AggregateBalanceInformation17.AlternateReportingCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18#AccountBaseCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace18.AccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18#InstrumentCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace18.InstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18#AlternateReportingCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace18.AlternateReportingCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation19#AccountBaseCurrencyAmounts
	 * AggregateBalanceInformation19.AccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation19#InstrumentCurrencyAmounts
	 * AggregateBalanceInformation19.InstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation19#AlternateReportingCurrencyAmounts
	 * AggregateBalanceInformation19.AlternateReportingCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace21#AccountBaseCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace21.AccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace21#InstrumentCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace21.InstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace21#AlternateReportingCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace21.AlternateReportingCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation22#AccountBaseCurrencyAmounts
	 * AggregateBalanceInformation22.AccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation22#InstrumentCurrencyAmounts
	 * AggregateBalanceInformation22.InstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation22#AlternateReportingCurrencyAmounts
	 * AggregateBalanceInformation22.AlternateReportingCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace22#AccountBaseCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace22.AccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace22#InstrumentCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace22.InstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace22#AlternateReportingCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace22.AlternateReportingCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation23#AccountBaseCurrencyAmounts
	 * AggregateBalanceInformation23.AccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation23#InstrumentCurrencyAmounts
	 * AggregateBalanceInformation23.InstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation23#AlternateReportingCurrencyAmounts
	 * AggregateBalanceInformation23.AlternateReportingCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace8#AccountBaseCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace8.AccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace8#InstrumentCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace8.InstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation9#AccountBaseCurrencyAmounts
	 * AggregateBalanceInformation9.AccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation9#InstrumentCurrencyAmounts
	 * AggregateBalanceInformation9.InstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace9#AccountBaseCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace9.AccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace9#InstrumentCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace9.InstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation10#AccountBaseCurrencyAmounts
	 * AggregateBalanceInformation10.AccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation10#InstrumentCurrencyAmounts
	 * AggregateBalanceInformation10.InstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace11#AccountBaseCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace11.AccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace11#InstrumentCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace11.InstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation12#AccountBaseCurrencyAmounts
	 * AggregateBalanceInformation12.AccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation12#InstrumentCurrencyAmounts
	 * AggregateBalanceInformation12.InstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace13#AccountBaseCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace13.AccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace13#InstrumentCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace13.InstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation14#AccountBaseCurrencyAmounts
	 * AggregateBalanceInformation14.AccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation14#InstrumentCurrencyAmounts
	 * AggregateBalanceInformation14.InstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace15#AccountBaseCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace15.AccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace15#InstrumentCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace15.InstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation16#AccountBaseCurrencyAmounts
	 * AggregateBalanceInformation16.AccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation16#InstrumentCurrencyAmounts
	 * AggregateBalanceInformation16.InstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace17#AccountBaseCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace17.AccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace17#InstrumentCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace17.InstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation18#AccountBaseCurrencyAmounts
	 * AggregateBalanceInformation18.AccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation18#InstrumentCurrencyAmounts
	 * AggregateBalanceInformation18.InstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace20#AccountBaseCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace20.AccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace20#InstrumentCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace20.InstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation21#AccountBaseCurrencyAmounts
	 * AggregateBalanceInformation21.AccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation21#InstrumentCurrencyAmounts
	 * AggregateBalanceInformation21.InstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace23#AccountBaseCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace23.AccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace23#InstrumentCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace23.InstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation24#AccountBaseCurrencyAmounts
	 * AggregateBalanceInformation24.AccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation24#InstrumentCurrencyAmounts
	 * AggregateBalanceInformation24.InstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace19#AccountBaseCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace19.AccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace19#InstrumentCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace19.InstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation20#AccountBaseCurrencyAmounts
	 * AggregateBalanceInformation20.AccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation20#InstrumentCurrencyAmounts
	 * AggregateBalanceInformation20.InstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6#AccountBaseCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace6.AccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6#InstrumentCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace6.InstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6#AlternateReportingCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace6.AlternateReportingCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation6#AccountBaseCurrencyAmounts
	 * AggregateBalanceInformation6.AccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation6#InstrumentCurrencyAmounts
	 * AggregateBalanceInformation6.InstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation6#AlternateReportingCurrencyAmounts
	 * AggregateBalanceInformation6.AlternateReportingCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace5#AccountBaseCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace5.AccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace5#InstrumentCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace5.InstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation7#AccountBaseCurrencyAmounts
	 * AggregateBalanceInformation7.AccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation7#InstrumentCurrencyAmounts
	 * AggregateBalanceInformation7.InstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation26#AccountBaseCurrencyAmounts
	 * AggregateBalanceInformation26.AccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation26#InstrumentCurrencyAmounts
	 * AggregateBalanceInformation26.InstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation26#AlternateReportingCurrencyAmounts
	 * AggregateBalanceInformation26.AlternateReportingCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation25#AccountBaseCurrencyAmounts
	 * AggregateBalanceInformation25.AccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation25#InstrumentCurrencyAmounts
	 * AggregateBalanceInformation25.InstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24#AccountBaseCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace24.AccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24#InstrumentCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace24.InstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace25#AccountBaseCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace25.AccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace25#InstrumentCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace25.InstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace25#AlternateReportingCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace25.AlternateReportingCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation28#AccountBaseCurrencyAmounts
	 * AggregateBalanceInformation28.AccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation28#InstrumentCurrencyAmounts
	 * AggregateBalanceInformation28.InstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation27#AccountBaseCurrencyAmounts
	 * AggregateBalanceInformation27.AccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation27#InstrumentCurrencyAmounts
	 * AggregateBalanceInformation27.InstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation27#AlternateReportingCurrencyAmounts
	 * AggregateBalanceInformation27.AlternateReportingCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace26#AccountBaseCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace26.AccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace26#InstrumentCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace26.InstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace26#AlternateReportingCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace26.AlternateReportingCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace27#AccountBaseCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace27.AccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace27#InstrumentCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace27.InstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation30#AccountBaseCurrencyAmounts
	 * AggregateBalanceInformation30.AccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation30#InstrumentCurrencyAmounts
	 * AggregateBalanceInformation30.InstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation31#AccountBaseCurrencyAmounts
	 * AggregateBalanceInformation31.AccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation31#InstrumentCurrencyAmounts
	 * AggregateBalanceInformation31.InstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation31#AlternateReportingCurrencyAmounts
	 * AggregateBalanceInformation31.AlternateReportingCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28#AccountBaseCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace28.AccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28#InstrumentCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace28.InstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace29#AccountBaseCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace29.AccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace29#InstrumentCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace29.InstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace29#AlternateReportingCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace29.AlternateReportingCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation32#AccountBaseCurrencyAmounts
	 * AggregateBalanceInformation32.AccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation32#InstrumentCurrencyAmounts
	 * AggregateBalanceInformation32.InstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation32#AlternateReportingCurrencyAmounts
	 * AggregateBalanceInformation32.AlternateReportingCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33#AccountBaseCurrencyAmounts
	 * AggregateBalanceInformation33.AccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33#InstrumentCurrencyAmounts
	 * AggregateBalanceInformation33.InstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31#AccountBaseCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace31.AccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31#InstrumentCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace31.InstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace30#AccountBaseCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace30.AccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace30#InstrumentCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace30.InstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace30#AlternateReportingCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace30.AlternateReportingCurrencyAmounts}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Balance
	 * Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssetHolding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies in terms of value and quantity the assets held in a balance."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd AssetHolding = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace7.AccountBaseCurrencyAmounts, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace7.InstrumentCurrencyAmounts,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace7.AlternateReportingCurrencyAmounts, com.tools20022.repository.msg.AggregateBalanceInformation8.AccountBaseCurrencyAmounts,
					com.tools20022.repository.msg.AggregateBalanceInformation8.InstrumentCurrencyAmounts, com.tools20022.repository.msg.AggregateBalanceInformation8.AlternateReportingCurrencyAmounts,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace10.AccountBaseCurrencyAmounts, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace10.InstrumentCurrencyAmounts,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace10.AlternateReportingCurrencyAmounts, com.tools20022.repository.msg.AggregateBalanceInformation11.AccountBaseCurrencyAmounts,
					com.tools20022.repository.msg.AggregateBalanceInformation11.InstrumentCurrencyAmounts, com.tools20022.repository.msg.AggregateBalanceInformation11.AlternateReportingCurrencyAmounts,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace12.AccountBaseCurrencyAmounts, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace12.InstrumentCurrencyAmounts,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace12.AlternateReportingCurrencyAmounts, com.tools20022.repository.msg.AggregateBalanceInformation13.AccountBaseCurrencyAmounts,
					com.tools20022.repository.msg.AggregateBalanceInformation13.InstrumentCurrencyAmounts, com.tools20022.repository.msg.AggregateBalanceInformation13.AlternateReportingCurrencyAmounts,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace14.AccountBaseCurrencyAmounts, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace14.InstrumentCurrencyAmounts,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace14.AlternateReportingCurrencyAmounts, com.tools20022.repository.msg.AggregateBalanceInformation15.AccountBaseCurrencyAmounts,
					com.tools20022.repository.msg.AggregateBalanceInformation15.InstrumentCurrencyAmounts, com.tools20022.repository.msg.AggregateBalanceInformation15.AlternateReportingCurrencyAmounts,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace16.AccountBaseCurrencyAmounts, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace16.InstrumentCurrencyAmounts,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace16.AlternateReportingCurrencyAmounts, com.tools20022.repository.msg.AggregateBalanceInformation17.AccountBaseCurrencyAmounts,
					com.tools20022.repository.msg.AggregateBalanceInformation17.InstrumentCurrencyAmounts, com.tools20022.repository.msg.AggregateBalanceInformation17.AlternateReportingCurrencyAmounts,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18.AccountBaseCurrencyAmounts, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18.InstrumentCurrencyAmounts,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18.AlternateReportingCurrencyAmounts, com.tools20022.repository.msg.AggregateBalanceInformation19.AccountBaseCurrencyAmounts,
					com.tools20022.repository.msg.AggregateBalanceInformation19.InstrumentCurrencyAmounts, com.tools20022.repository.msg.AggregateBalanceInformation19.AlternateReportingCurrencyAmounts,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace21.AccountBaseCurrencyAmounts, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace21.InstrumentCurrencyAmounts,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace21.AlternateReportingCurrencyAmounts, com.tools20022.repository.msg.AggregateBalanceInformation22.AccountBaseCurrencyAmounts,
					com.tools20022.repository.msg.AggregateBalanceInformation22.InstrumentCurrencyAmounts, com.tools20022.repository.msg.AggregateBalanceInformation22.AlternateReportingCurrencyAmounts,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace22.AccountBaseCurrencyAmounts, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace22.InstrumentCurrencyAmounts,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace22.AlternateReportingCurrencyAmounts, com.tools20022.repository.msg.AggregateBalanceInformation23.AccountBaseCurrencyAmounts,
					com.tools20022.repository.msg.AggregateBalanceInformation23.InstrumentCurrencyAmounts, com.tools20022.repository.msg.AggregateBalanceInformation23.AlternateReportingCurrencyAmounts,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace8.AccountBaseCurrencyAmounts, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace8.InstrumentCurrencyAmounts,
					com.tools20022.repository.msg.AggregateBalanceInformation9.AccountBaseCurrencyAmounts, com.tools20022.repository.msg.AggregateBalanceInformation9.InstrumentCurrencyAmounts,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace9.AccountBaseCurrencyAmounts, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace9.InstrumentCurrencyAmounts,
					com.tools20022.repository.msg.AggregateBalanceInformation10.AccountBaseCurrencyAmounts, com.tools20022.repository.msg.AggregateBalanceInformation10.InstrumentCurrencyAmounts,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace11.AccountBaseCurrencyAmounts, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace11.InstrumentCurrencyAmounts,
					com.tools20022.repository.msg.AggregateBalanceInformation12.AccountBaseCurrencyAmounts, com.tools20022.repository.msg.AggregateBalanceInformation12.InstrumentCurrencyAmounts,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace13.AccountBaseCurrencyAmounts, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace13.InstrumentCurrencyAmounts,
					com.tools20022.repository.msg.AggregateBalanceInformation14.AccountBaseCurrencyAmounts, com.tools20022.repository.msg.AggregateBalanceInformation14.InstrumentCurrencyAmounts,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace15.AccountBaseCurrencyAmounts, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace15.InstrumentCurrencyAmounts,
					com.tools20022.repository.msg.AggregateBalanceInformation16.AccountBaseCurrencyAmounts, com.tools20022.repository.msg.AggregateBalanceInformation16.InstrumentCurrencyAmounts,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace17.AccountBaseCurrencyAmounts, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace17.InstrumentCurrencyAmounts,
					com.tools20022.repository.msg.AggregateBalanceInformation18.AccountBaseCurrencyAmounts, com.tools20022.repository.msg.AggregateBalanceInformation18.InstrumentCurrencyAmounts,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace20.AccountBaseCurrencyAmounts, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace20.InstrumentCurrencyAmounts,
					com.tools20022.repository.msg.AggregateBalanceInformation21.AccountBaseCurrencyAmounts, com.tools20022.repository.msg.AggregateBalanceInformation21.InstrumentCurrencyAmounts,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace23.AccountBaseCurrencyAmounts, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace23.InstrumentCurrencyAmounts,
					com.tools20022.repository.msg.AggregateBalanceInformation24.AccountBaseCurrencyAmounts, com.tools20022.repository.msg.AggregateBalanceInformation24.InstrumentCurrencyAmounts,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace19.AccountBaseCurrencyAmounts, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace19.InstrumentCurrencyAmounts,
					com.tools20022.repository.msg.AggregateBalanceInformation20.AccountBaseCurrencyAmounts, com.tools20022.repository.msg.AggregateBalanceInformation20.InstrumentCurrencyAmounts,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6.AccountBaseCurrencyAmounts, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6.InstrumentCurrencyAmounts,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6.AlternateReportingCurrencyAmounts, com.tools20022.repository.msg.AggregateBalanceInformation6.AccountBaseCurrencyAmounts,
					com.tools20022.repository.msg.AggregateBalanceInformation6.InstrumentCurrencyAmounts, com.tools20022.repository.msg.AggregateBalanceInformation6.AlternateReportingCurrencyAmounts,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace5.AccountBaseCurrencyAmounts, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace5.InstrumentCurrencyAmounts,
					com.tools20022.repository.msg.AggregateBalanceInformation7.AccountBaseCurrencyAmounts, com.tools20022.repository.msg.AggregateBalanceInformation7.InstrumentCurrencyAmounts,
					com.tools20022.repository.msg.AggregateBalanceInformation26.AccountBaseCurrencyAmounts, com.tools20022.repository.msg.AggregateBalanceInformation26.InstrumentCurrencyAmounts,
					com.tools20022.repository.msg.AggregateBalanceInformation26.AlternateReportingCurrencyAmounts, com.tools20022.repository.msg.AggregateBalanceInformation25.AccountBaseCurrencyAmounts,
					com.tools20022.repository.msg.AggregateBalanceInformation25.InstrumentCurrencyAmounts, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24.AccountBaseCurrencyAmounts,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24.InstrumentCurrencyAmounts, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace25.AccountBaseCurrencyAmounts,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace25.InstrumentCurrencyAmounts, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace25.AlternateReportingCurrencyAmounts,
					com.tools20022.repository.msg.AggregateBalanceInformation28.AccountBaseCurrencyAmounts, com.tools20022.repository.msg.AggregateBalanceInformation28.InstrumentCurrencyAmounts,
					com.tools20022.repository.msg.AggregateBalanceInformation27.AccountBaseCurrencyAmounts, com.tools20022.repository.msg.AggregateBalanceInformation27.InstrumentCurrencyAmounts,
					com.tools20022.repository.msg.AggregateBalanceInformation27.AlternateReportingCurrencyAmounts, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace26.AccountBaseCurrencyAmounts,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace26.InstrumentCurrencyAmounts, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace26.AlternateReportingCurrencyAmounts,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace27.AccountBaseCurrencyAmounts, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace27.InstrumentCurrencyAmounts,
					com.tools20022.repository.msg.AggregateBalanceInformation30.AccountBaseCurrencyAmounts, com.tools20022.repository.msg.AggregateBalanceInformation30.InstrumentCurrencyAmounts,
					com.tools20022.repository.msg.AggregateBalanceInformation31.AccountBaseCurrencyAmounts, com.tools20022.repository.msg.AggregateBalanceInformation31.InstrumentCurrencyAmounts,
					com.tools20022.repository.msg.AggregateBalanceInformation31.AlternateReportingCurrencyAmounts, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28.AccountBaseCurrencyAmounts,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28.InstrumentCurrencyAmounts, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace29.AccountBaseCurrencyAmounts,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace29.InstrumentCurrencyAmounts, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace29.AlternateReportingCurrencyAmounts,
					com.tools20022.repository.msg.AggregateBalanceInformation32.AccountBaseCurrencyAmounts, com.tools20022.repository.msg.AggregateBalanceInformation32.InstrumentCurrencyAmounts,
					com.tools20022.repository.msg.AggregateBalanceInformation32.AlternateReportingCurrencyAmounts, com.tools20022.repository.msg.AggregateBalanceInformation33.AccountBaseCurrencyAmounts,
					com.tools20022.repository.msg.AggregateBalanceInformation33.InstrumentCurrencyAmounts, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31.AccountBaseCurrencyAmounts,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31.InstrumentCurrencyAmounts, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace30.AccountBaseCurrencyAmounts,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace30.InstrumentCurrencyAmounts, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace30.AlternateReportingCurrencyAmounts);
			elementContext_lazy = () -> Balance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AssetHolding";
			definition = "Specifies in terms of value and quantity the assets held in a balance.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AssetHolding.Balance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the date and time at which the balance is calculated.
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
	 * {@linkplain com.tools20022.repository.msg.ReportData1#DateAndTimeStamp
	 * ReportData1.DateAndTimeStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportData5#DateAndTimeStamp
	 * ReportData5.DateAndTimeStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportData2#DateAndTimeStamp
	 * ReportData2.DateAndTimeStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportData3#DateAndTimeStamp
	 * ReportData3.DateAndTimeStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportData4#DateAndTimeStamp
	 * ReportData4.DateAndTimeStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation20#BalanceDate
	 * AggregateBalanceInformation20.BalanceDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardAccount2#BalanceDate
	 * CardAccount2.BalanceDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Balance
	 * Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalculationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the date and time at which the balance is calculated."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CalculationDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ReportData1.DateAndTimeStamp, com.tools20022.repository.msg.ReportData5.DateAndTimeStamp, com.tools20022.repository.msg.ReportData2.DateAndTimeStamp,
					com.tools20022.repository.msg.ReportData3.DateAndTimeStamp, com.tools20022.repository.msg.ReportData4.DateAndTimeStamp, com.tools20022.repository.msg.AggregateBalanceInformation20.BalanceDate,
					com.tools20022.repository.msg.CardAccount2.BalanceDate);
			elementContext_lazy = () -> Balance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CalculationDate";
			definition = "Specifies the date and time at which the balance is calculated.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Specifies the balance adjustments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#AdjustedBalance
	 * Adjustment.AdjustedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Adjustment
	 * Adjustment}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceAdjustment1#EarningsAdjustmentAmount
	 * BalanceAdjustment1.EarningsAdjustmentAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Balance
	 * Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Adjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the balance adjustments."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Adjustment = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BalanceAdjustment1.EarningsAdjustmentAmount);
			elementContext_lazy = () -> Balance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Adjustment";
			definition = "Specifies the balance adjustments.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Adjustment.AdjustedBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Account or sub-account for which a balance is calculated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Account#Balance
	 * Account.Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Account Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Balance
	 * Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account or sub-account for which a balance is calculated."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Account = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Balance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Account";
			definition = "Account or sub-account for which a balance is calculated.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Account.Balance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Set of elements used to provide interest information that applies to the
	 * balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Interest#AccountBalance
	 * Interest.AccountBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Interest Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Balance
	 * Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to provide interest information that applies to the balance."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Interest = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Balance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Interest";
			definition = "Set of elements used to provide interest information that applies to the balance.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Interest.AccountBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Credit or debit postings used to calculate a balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Entry#Balance
	 * Entry.Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Entry Entry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Balance
	 * Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Credit or debit postings used to calculate a balance."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd BalanceEntry = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Balance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BalanceEntry";
			definition = "Credit or debit postings used to calculate a balance.";
			minOccurs = 0;
			type_lazy = () -> Entry.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Entry.Balance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the type of balance processing restrictions that must be
	 * applied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ProcessingTypeCode
	 * ProcessingTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Balance
	 * Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingRestriction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of balance processing restrictions that must be applied."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ProcessingRestriction = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Balance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProcessingRestriction";
			definition = "Specifies the type of balance processing restrictions that must be applied.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ProcessingTypeCode.mmObject();
		}
	};
	/**
	 * Specifies whether the balance is an opening or a closing one.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OpeningClosingCode
	 * OpeningClosingCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OpeningClosing1Choice#Code
	 * OpeningClosing1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OpeningClosing1Choice#Proprietary
	 * OpeningClosing1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OpeningClosing2Choice#Code
	 * OpeningClosing2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OpeningClosing2Choice#Proprietary
	 * OpeningClosing2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OpeningClosing3Choice#Code
	 * OpeningClosing3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OpeningClosing3Choice#Proprietary
	 * OpeningClosing3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OpeningClosing4Choice#Code
	 * OpeningClosing4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OpeningClosing4Choice#Proprietary
	 * OpeningClosing4Choice.Proprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Balance
	 * Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningClosingCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the balance is an opening or a closing one."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OpeningClosingCode = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.OpeningClosing1Choice.Code, com.tools20022.repository.choice.OpeningClosing1Choice.Proprietary, com.tools20022.repository.choice.OpeningClosing2Choice.Code,
					com.tools20022.repository.choice.OpeningClosing2Choice.Proprietary, com.tools20022.repository.choice.OpeningClosing3Choice.Code, com.tools20022.repository.choice.OpeningClosing3Choice.Proprietary,
					com.tools20022.repository.choice.OpeningClosing4Choice.Code, com.tools20022.repository.choice.OpeningClosing4Choice.Proprietary);
			elementContext_lazy = () -> Balance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OpeningClosingCode";
			definition = "Specifies whether the balance is an opening or a closing one.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> com.tools20022.repository.codeset.OpeningClosingCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Balance";
				definition = "Numerical representation of the net increases and decreases in an account at a specific point in time.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Account.Balance, com.tools20022.repository.entity.Adjustment.AdjustedBalance, com.tools20022.repository.entity.Entry.Balance,
						com.tools20022.repository.entity.AssetHolding.Balance, com.tools20022.repository.entity.Interest.AccountBalance);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BalanceDetails5.DetailedBalance, com.tools20022.repository.choice.PortfolioBalance1.SummaryBalance,
						com.tools20022.repository.choice.PortfolioBalance1.DetailedBalance);
				subType_lazy = () -> Arrays.asList(CashBalance.mmObject(), SecuritiesBalance.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Balance.Type, com.tools20022.repository.entity.Balance.ValueDate, com.tools20022.repository.entity.Balance.CreditDebitIndicator,
						com.tools20022.repository.entity.Balance.AssetHolding, com.tools20022.repository.entity.Balance.CalculationDate, com.tools20022.repository.entity.Balance.Adjustment, com.tools20022.repository.entity.Balance.Account,
						com.tools20022.repository.entity.Balance.Interest, com.tools20022.repository.entity.Balance.BalanceEntry, com.tools20022.repository.entity.Balance.ProcessingRestriction,
						com.tools20022.repository.entity.Balance.OpeningClosingCode);
				derivationComponent_lazy = () -> Arrays.asList(BalanceType9Choice.mmObject(), BalanceType1Choice.mmObject(), BalanceType6Choice.mmObject(), BalanceType7Choice.mmObject(), BalanceDetails6.mmObject(),
						BalanceDetails5.mmObject(), PortfolioBalance1.mmObject(), CashBalanceType1Choice.mmObject(), CashSubBalanceTypeAndQuantityBreakdown1.mmObject(), ContractBalanceType1Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}