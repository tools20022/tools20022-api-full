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
import com.tools20022.repository.codeset.BalanceTypeCode;
import com.tools20022.repository.codeset.DebitCreditCode;
import com.tools20022.repository.codeset.OpeningClosingCode;
import com.tools20022.repository.codeset.ProcessingTypeCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

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
 * <li>{@linkplain com.tools20022.repository.entity.Balance#mmType
 * Balance.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Balance#mmValueDate
 * Balance.mmValueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Balance#mmCreditDebitIndicator
 * Balance.mmCreditDebitIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Balance#mmAssetHolding
 * Balance.mmAssetHolding}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Balance#mmCalculationDate
 * Balance.mmCalculationDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Balance#mmAdjustment
 * Balance.mmAdjustment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Balance#mmAccount
 * Balance.mmAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Balance#mmInterest
 * Balance.mmInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Balance#mmBalanceEntry
 * Balance.mmBalanceEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Balance#mmProcessingRestriction
 * Balance.mmProcessingRestriction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Balance#mmOpeningClosingCode
 * Balance.mmOpeningClosingCode}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmBalance
 * Account.mmBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Adjustment#mmAdjustedBalance
 * Adjustment.mmAdjustedBalance}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Entry#mmBalance
 * Entry.mmBalance}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#mmBalance
 * AssetHolding.mmBalance}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#mmAccountBalance
 * Interest.mmAccountBalance}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BalanceDetails5#mmDetailedBalance
 * BalanceDetails5.mmDetailedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PortfolioBalance1#mmSummaryBalance
 * PortfolioBalance1.mmSummaryBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PortfolioBalance1#mmDetailedBalance
 * PortfolioBalance1.mmDetailedBalance}</li>
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
 * <li>{@linkplain com.tools20022.repository.choice.CashBalanceType2Choice
 * CashBalanceType2Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashSubBalanceTypeAndQuantityBreakdown2
 * CashSubBalanceTypeAndQuantityBreakdown2}</li>
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
	protected BalanceTypeCode type;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.BalanceDetails2#mmBalanceType
	 * BalanceDetails2.mmBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceDetails3#mmBalanceType
	 * BalanceDetails3.mmBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceType3Choice#mmCode
	 * BalanceType3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceType3Choice#mmProprietary
	 * BalanceType3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceDetails4#mmBalanceType
	 * BalanceDetails4.mmBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceType8Choice#mmCode
	 * BalanceType8Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceType8Choice#mmProprietary
	 * BalanceType8Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalance4#mmType
	 * CashBalance4.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalanceDetails2#mmType
	 * CashBalanceDetails2.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalanceDetails3#mmType
	 * CashBalanceDetails3.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalanceDetails4#mmType
	 * CashBalanceDetails4.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalanceDetails5#mmType
	 * CashBalanceDetails5.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalanceDetails6#mmType
	 * CashBalanceDetails6.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceType4Choice#mmCode
	 * BalanceType4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceType4Choice#mmProprietary
	 * BalanceType4Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalanceDetails7#mmType
	 * CashBalanceDetails7.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalance5#mmType
	 * CashBalance5.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceType9Choice#mmCode
	 * BalanceType9Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceType9Choice#mmProprietary
	 * BalanceType9Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalance6#mmType
	 * CashBalance6.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails50#mmSecuritiesSubBalanceType
	 * SettlementDetails50.mmSecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails50#mmCashSubBalanceType
	 * SettlementDetails50.mmCashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails51#mmSecuritiesSubBalanceType
	 * SettlementDetails51.mmSecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails51#mmCashSubBalanceType
	 * SettlementDetails51.mmCashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown9#mmSecuritiesSubBalanceType
	 * QuantityBreakdown9.mmSecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown12#mmSecuritiesSubBalanceType
	 * QuantityBreakdown12.mmSecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown17#mmSecuritiesSubBalanceType
	 * QuantityBreakdown17.mmSecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails24#mmSecuritiesSubBalanceType
	 * SettlementDetails24.mmSecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails24#mmCashSubBalanceType
	 * SettlementDetails24.mmCashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown10#mmSecuritiesSubBalanceType
	 * QuantityBreakdown10.mmSecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails33#mmSecuritiesSubBalanceType
	 * SettlementDetails33.mmSecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails33#mmCashSubBalanceType
	 * SettlementDetails33.mmCashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown16#mmSecuritiesSubBalanceType
	 * QuantityBreakdown16.mmSecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails45#mmSecuritiesSubBalanceType
	 * SettlementDetails45.mmSecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails45#mmCashSubBalanceType
	 * SettlementDetails45.mmCashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown21#mmSecuritiesSubBalanceType
	 * QuantityBreakdown21.mmSecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails54#mmSecuritiesSubBalanceType
	 * SettlementDetails54.mmSecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails54#mmCashSubBalanceType
	 * SettlementDetails54.mmCashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails22#mmSecuritiesSubBalanceType
	 * SettlementDetails22.mmSecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails22#mmCashSubBalanceType
	 * SettlementDetails22.mmCashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails35#mmSecuritiesSubBalanceType
	 * SettlementDetails35.mmSecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails35#mmCashSubBalanceType
	 * SettlementDetails35.mmCashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#mmSecuritiesSubBalanceType
	 * SettlementDetails42.mmSecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#mmCashSubBalanceType
	 * SettlementDetails42.mmCashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails52#mmSecuritiesSubBalanceType
	 * SettlementDetails52.mmSecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails52#mmCashSubBalanceType
	 * SettlementDetails52.mmCashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceType1Choice#mmCode
	 * BalanceType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceType1Choice#mmProprietary
	 * BalanceType1Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalance1#mmType
	 * CashBalance1.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceType5Choice#mmCode
	 * BalanceType5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceType5Choice#mmProprietary
	 * BalanceType5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceSubType1Choice#mmCode
	 * BalanceSubType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceSubType1Choice#mmProprietary
	 * BalanceSubType1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceType12#mmCodeOrProprietary
	 * BalanceType12.mmCodeOrProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BalanceType12#mmSubType
	 * BalanceType12.mmSubType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalance3#mmType
	 * CashBalance3.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceType2Choice#mmCode
	 * BalanceType2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceType2Choice#mmProprietary
	 * BalanceType2Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalance2#mmType
	 * CashBalance2.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportData1#mmType
	 * ReportData1.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportData5#mmType
	 * ReportData5.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportData2#mmType
	 * ReportData2.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportData3#mmType
	 * ReportData3.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportData4#mmType
	 * ReportData4.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CashBalanceType1FormatType#mmCode
	 * CashBalanceType1FormatType.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CashBalanceType1FormatType#mmProprietary
	 * CashBalanceType1FormatType.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount18#mmBalanceType
	 * CashAccount18.mmBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails26#mmSecuritiesSubBalanceType
	 * SettlementDetails26.mmSecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails26#mmCashSubBalanceType
	 * SettlementDetails26.mmCashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportingRequest1#mmRequestedBalanceType
	 * ReportingRequest1.mmRequestedBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportingRequest2#mmRequestedBalanceType
	 * ReportingRequest2.mmRequestedBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportingRequest3#mmRequestedBalanceType
	 * ReportingRequest3.mmRequestedBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails36#mmSecuritiesSubBalanceType
	 * SettlementDetails36.mmSecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails36#mmCashSubBalanceType
	 * SettlementDetails36.mmCashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceType6Choice#mmCode
	 * BalanceType6Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceType6Choice#mmProprietary
	 * BalanceType6Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceType7Choice#mmCode
	 * BalanceType7Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceType7Choice#mmProprietary
	 * BalanceType7Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BalanceDetails6#mmType
	 * BalanceDetails6.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BalanceDetails5#mmType
	 * BalanceDetails5.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BillingBalanceType1Choice#mmCode
	 * BillingBalanceType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BillingBalanceType1Choice#mmProprietary
	 * BillingBalanceType1Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BillingBalance1#mmType
	 * BillingBalance1.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CashBalanceType1Choice#mmCode
	 * CashBalanceType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CashBalanceType1Choice#mmProprietary
	 * CashBalanceType1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown22#mmCashSubBalanceType
	 * QuantityBreakdown22.mmCashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashSubBalanceTypeAndQuantityBreakdown1#mmType
	 * CashSubBalanceTypeAndQuantityBreakdown1.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#mmSecuritiesSubBalanceType
	 * SettlementDetails67.mmSecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#mmCashSubBalanceType
	 * SettlementDetails67.mmCashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails70#mmSecuritiesSubBalanceType
	 * SettlementDetails70.mmSecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails70#mmCashSubBalanceType
	 * SettlementDetails70.mmCashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#mmSecuritiesSubBalanceType
	 * SettlementDetails68.mmSecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#mmCashSubBalanceType
	 * SettlementDetails68.mmCashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails81#mmSecuritiesSubBalanceType
	 * SettlementDetails81.mmSecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails81#mmCashSubBalanceType
	 * SettlementDetails81.mmCashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails80#mmSecuritiesSubBalanceType
	 * SettlementDetails80.mmSecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails80#mmCashSubBalanceType
	 * SettlementDetails80.mmCashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails83#mmSecuritiesSubBalanceType
	 * SettlementDetails83.mmSecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails83#mmCashSubBalanceType
	 * SettlementDetails83.mmCashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ContractBalanceType1Choice#mmCode
	 * ContractBalanceType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ContractBalanceType1Choice#mmProprietary
	 * ContractBalanceType1Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ContractBalance1#mmType
	 * ContractBalance1.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#mmSecuritiesSubBalanceType
	 * SettlementDetails93.mmSecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#mmCashSubBalanceType
	 * SettlementDetails93.mmCashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails90#mmSecuritiesSubBalanceType
	 * SettlementDetails90.mmSecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails90#mmCashSubBalanceType
	 * SettlementDetails90.mmCashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown29#mmSecuritiesSubBalanceType
	 * QuantityBreakdown29.mmSecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#mmSecuritiesSubBalanceType
	 * SettlementDetails94.mmSecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#mmCashSubBalanceType
	 * SettlementDetails94.mmCashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown32#mmSecuritiesSubBalanceType
	 * QuantityBreakdown32.mmSecuritiesSubBalanceType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalance7#mmType
	 * CashBalance7.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails101#mmSecuritiesSubBalanceType
	 * SettlementDetails101.mmSecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails101#mmCashSubBalanceType
	 * SettlementDetails101.mmCashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails111#mmSecuritiesSubBalanceType
	 * SettlementDetails111.mmSecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails111#mmCashSubBalanceType
	 * SettlementDetails111.mmCashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails112#mmSecuritiesSubBalanceType
	 * SettlementDetails112.mmSecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails112#mmCashSubBalanceType
	 * SettlementDetails112.mmCashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails110#mmSecuritiesSubBalanceType
	 * SettlementDetails110.mmSecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails110#mmCashSubBalanceType
	 * SettlementDetails110.mmCashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown44#mmSecuritiesSubBalanceType
	 * QuantityBreakdown44.mmSecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails113#mmSecuritiesSubBalanceType
	 * SettlementDetails113.mmSecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails113#mmCashSubBalanceType
	 * SettlementDetails113.mmCashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown34#mmSecuritiesSubBalanceType
	 * QuantityBreakdown34.mmSecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CashBalanceType2Choice#mmCode
	 * CashBalanceType2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CashBalanceType2Choice#mmProprietary
	 * CashBalanceType2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashSubBalanceTypeAndQuantityBreakdown2#mmType
	 * CashSubBalanceTypeAndQuantityBreakdown2.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown45#mmCashSubBalanceType
	 * QuantityBreakdown45.mmCashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails128#mmSecuritiesSubBalanceType
	 * SettlementDetails128.mmSecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails128#mmCashSubBalanceType
	 * SettlementDetails128.mmCashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#mmSecuritiesSubBalanceType
	 * SettlementDetails120.mmSecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#mmCashSubBalanceType
	 * SettlementDetails120.mmCashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#mmSecuritiesSubBalanceType
	 * SettlementDetails119.mmSecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#mmCashSubBalanceType
	 * SettlementDetails119.mmCashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#mmSecuritiesSubBalanceType
	 * SettlementDetails122.mmSecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#mmCashSubBalanceType
	 * SettlementDetails122.mmCashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails134#mmSecuritiesSubBalanceType
	 * SettlementDetails134.mmSecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails134#mmCashSubBalanceType
	 * SettlementDetails134.mmCashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails137#mmSecuritiesSubBalanceType
	 * SettlementDetails137.mmSecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails137#mmCashSubBalanceType
	 * SettlementDetails137.mmCashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails132#mmSecuritiesSubBalanceType
	 * SettlementDetails132.mmSecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails132#mmCashSubBalanceType
	 * SettlementDetails132.mmCashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails138#mmSecuritiesSubBalanceType
	 * SettlementDetails138.mmSecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails138#mmCashSubBalanceType
	 * SettlementDetails138.mmCashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails140#mmSecuritiesSubBalanceType
	 * SettlementDetails140.mmSecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails140#mmCashSubBalanceType
	 * SettlementDetails140.mmCashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportingRequest4#mmRequestedBalanceType
	 * ReportingRequest4.mmRequestedBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceType10Choice#mmCode
	 * BalanceType10Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceType10Choice#mmProprietary
	 * BalanceType10Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceType13#mmCodeOrProprietary
	 * BalanceType13.mmCodeOrProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BalanceType13#mmSubType
	 * BalanceType13.mmSubType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalance8#mmType
	 * CashBalance8.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalance10#mmType
	 * CashBalance10.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalance9#mmType
	 * CashBalance9.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CreditLine3#mmType
	 * CreditLine3.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalance11#mmType
	 * CashBalance11.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails142#mmDeliveringSecuritiesSubBalanceType
	 * SettlementDetails142.mmDeliveringSecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails142#mmReceivingSecuritiesSubBalanceType
	 * SettlementDetails142.mmReceivingSecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails142#mmCashSubBalanceType
	 * SettlementDetails142.mmCashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails144#mmSecuritiesSubBalanceType
	 * SettlementDetails144.mmSecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails144#mmCashSubBalanceType
	 * SettlementDetails144.mmCashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails145#mmSecuritiesSubBalanceType
	 * SettlementDetails145.mmSecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails145#mmCashSubBalanceType
	 * SettlementDetails145.mmCashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails146#mmSecuritiesSubBalanceType
	 * SettlementDetails146.mmSecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails146#mmCashSubBalanceType
	 * SettlementDetails146.mmCashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown47#mmSecuritiesSubBalanceType
	 * QuantityBreakdown47.mmSecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown52#mmSecuritiesSubBalanceType
	 * QuantityBreakdown52.mmSecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails155#mmSecuritiesSubBalanceType
	 * SettlementDetails155.mmSecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails155#mmCashSubBalanceType
	 * SettlementDetails155.mmCashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails156#mmSecuritiesSubBalanceType
	 * SettlementDetails156.mmSecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails156#mmCashSubBalanceType
	 * SettlementDetails156.mmCashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails157#mmDeliveringSecuritiesSubBalanceType
	 * SettlementDetails157.mmDeliveringSecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails157#mmReceivingSecuritiesSubBalanceType
	 * SettlementDetails157.mmReceivingSecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails157#mmCashSubBalanceType
	 * SettlementDetails157.mmCashSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails158#mmSecuritiesSubBalanceType
	 * SettlementDetails158.mmSecuritiesSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails158#mmCashSubBalanceType
	 * SettlementDetails158.mmCashSubBalanceType}</li>
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
	public static final MMBusinessAttribute<Balance, BalanceTypeCode> mmType = new MMBusinessAttribute<Balance, BalanceTypeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(BalanceDetails2.mmBalanceType, BalanceDetails3.mmBalanceType, BalanceType3Choice.mmCode, BalanceType3Choice.mmProprietary, BalanceDetails4.mmBalanceType, BalanceType8Choice.mmCode,
					BalanceType8Choice.mmProprietary, CashBalance4.mmType, CashBalanceDetails2.mmType, CashBalanceDetails3.mmType, CashBalanceDetails4.mmType, CashBalanceDetails5.mmType, CashBalanceDetails6.mmType,
					BalanceType4Choice.mmCode, BalanceType4Choice.mmProprietary, CashBalanceDetails7.mmType, CashBalance5.mmType, BalanceType9Choice.mmCode, BalanceType9Choice.mmProprietary, CashBalance6.mmType,
					SettlementDetails50.mmSecuritiesSubBalanceType, SettlementDetails50.mmCashSubBalanceType, SettlementDetails51.mmSecuritiesSubBalanceType, SettlementDetails51.mmCashSubBalanceType,
					QuantityBreakdown9.mmSecuritiesSubBalanceType, QuantityBreakdown12.mmSecuritiesSubBalanceType, QuantityBreakdown17.mmSecuritiesSubBalanceType, SettlementDetails24.mmSecuritiesSubBalanceType,
					SettlementDetails24.mmCashSubBalanceType, QuantityBreakdown10.mmSecuritiesSubBalanceType, SettlementDetails33.mmSecuritiesSubBalanceType, SettlementDetails33.mmCashSubBalanceType,
					QuantityBreakdown16.mmSecuritiesSubBalanceType, SettlementDetails45.mmSecuritiesSubBalanceType, SettlementDetails45.mmCashSubBalanceType, QuantityBreakdown21.mmSecuritiesSubBalanceType,
					SettlementDetails54.mmSecuritiesSubBalanceType, SettlementDetails54.mmCashSubBalanceType, SettlementDetails22.mmSecuritiesSubBalanceType, SettlementDetails22.mmCashSubBalanceType,
					SettlementDetails35.mmSecuritiesSubBalanceType, SettlementDetails35.mmCashSubBalanceType, SettlementDetails42.mmSecuritiesSubBalanceType, SettlementDetails42.mmCashSubBalanceType,
					SettlementDetails52.mmSecuritiesSubBalanceType, SettlementDetails52.mmCashSubBalanceType, BalanceType1Choice.mmCode, BalanceType1Choice.mmProprietary, CashBalance1.mmType, BalanceType5Choice.mmCode,
					BalanceType5Choice.mmProprietary, BalanceSubType1Choice.mmCode, BalanceSubType1Choice.mmProprietary, BalanceType12.mmCodeOrProprietary, BalanceType12.mmSubType, CashBalance3.mmType, BalanceType2Choice.mmCode,
					BalanceType2Choice.mmProprietary, CashBalance2.mmType, ReportData1.mmType, ReportData5.mmType, ReportData2.mmType, ReportData3.mmType, ReportData4.mmType, CashBalanceType1FormatType.mmCode,
					CashBalanceType1FormatType.mmProprietary, CashAccount18.mmBalanceType, SettlementDetails26.mmSecuritiesSubBalanceType, SettlementDetails26.mmCashSubBalanceType, ReportingRequest1.mmRequestedBalanceType,
					ReportingRequest2.mmRequestedBalanceType, ReportingRequest3.mmRequestedBalanceType, SettlementDetails36.mmSecuritiesSubBalanceType, SettlementDetails36.mmCashSubBalanceType, BalanceType6Choice.mmCode,
					BalanceType6Choice.mmProprietary, BalanceType7Choice.mmCode, BalanceType7Choice.mmProprietary, BalanceDetails6.mmType, BalanceDetails5.mmType, BillingBalanceType1Choice.mmCode, BillingBalanceType1Choice.mmProprietary,
					BillingBalance1.mmType, CashBalanceType1Choice.mmCode, CashBalanceType1Choice.mmProprietary, QuantityBreakdown22.mmCashSubBalanceType, CashSubBalanceTypeAndQuantityBreakdown1.mmType,
					SettlementDetails67.mmSecuritiesSubBalanceType, SettlementDetails67.mmCashSubBalanceType, SettlementDetails70.mmSecuritiesSubBalanceType, SettlementDetails70.mmCashSubBalanceType,
					SettlementDetails68.mmSecuritiesSubBalanceType, SettlementDetails68.mmCashSubBalanceType, SettlementDetails81.mmSecuritiesSubBalanceType, SettlementDetails81.mmCashSubBalanceType,
					SettlementDetails80.mmSecuritiesSubBalanceType, SettlementDetails80.mmCashSubBalanceType, SettlementDetails83.mmSecuritiesSubBalanceType, SettlementDetails83.mmCashSubBalanceType, ContractBalanceType1Choice.mmCode,
					ContractBalanceType1Choice.mmProprietary, ContractBalance1.mmType, SettlementDetails93.mmSecuritiesSubBalanceType, SettlementDetails93.mmCashSubBalanceType, SettlementDetails90.mmSecuritiesSubBalanceType,
					SettlementDetails90.mmCashSubBalanceType, QuantityBreakdown29.mmSecuritiesSubBalanceType, SettlementDetails94.mmSecuritiesSubBalanceType, SettlementDetails94.mmCashSubBalanceType,
					QuantityBreakdown32.mmSecuritiesSubBalanceType, CashBalance7.mmType, SettlementDetails101.mmSecuritiesSubBalanceType, SettlementDetails101.mmCashSubBalanceType, SettlementDetails111.mmSecuritiesSubBalanceType,
					SettlementDetails111.mmCashSubBalanceType, SettlementDetails112.mmSecuritiesSubBalanceType, SettlementDetails112.mmCashSubBalanceType, SettlementDetails110.mmSecuritiesSubBalanceType,
					SettlementDetails110.mmCashSubBalanceType, QuantityBreakdown44.mmSecuritiesSubBalanceType, SettlementDetails113.mmSecuritiesSubBalanceType, SettlementDetails113.mmCashSubBalanceType,
					QuantityBreakdown34.mmSecuritiesSubBalanceType, CashBalanceType2Choice.mmCode, CashBalanceType2Choice.mmProprietary, CashSubBalanceTypeAndQuantityBreakdown2.mmType, QuantityBreakdown45.mmCashSubBalanceType,
					SettlementDetails128.mmSecuritiesSubBalanceType, SettlementDetails128.mmCashSubBalanceType, SettlementDetails120.mmSecuritiesSubBalanceType, SettlementDetails120.mmCashSubBalanceType,
					SettlementDetails119.mmSecuritiesSubBalanceType, SettlementDetails119.mmCashSubBalanceType, SettlementDetails122.mmSecuritiesSubBalanceType, SettlementDetails122.mmCashSubBalanceType,
					SettlementDetails134.mmSecuritiesSubBalanceType, SettlementDetails134.mmCashSubBalanceType, SettlementDetails137.mmSecuritiesSubBalanceType, SettlementDetails137.mmCashSubBalanceType,
					SettlementDetails132.mmSecuritiesSubBalanceType, SettlementDetails132.mmCashSubBalanceType, SettlementDetails138.mmSecuritiesSubBalanceType, SettlementDetails138.mmCashSubBalanceType,
					SettlementDetails140.mmSecuritiesSubBalanceType, SettlementDetails140.mmCashSubBalanceType, ReportingRequest4.mmRequestedBalanceType, BalanceType10Choice.mmCode, BalanceType10Choice.mmProprietary,
					BalanceType13.mmCodeOrProprietary, BalanceType13.mmSubType, CashBalance8.mmType, CashBalance10.mmType, CashBalance9.mmType, CreditLine3.mmType, CashBalance11.mmType,
					SettlementDetails142.mmDeliveringSecuritiesSubBalanceType, SettlementDetails142.mmReceivingSecuritiesSubBalanceType, SettlementDetails142.mmCashSubBalanceType, SettlementDetails144.mmSecuritiesSubBalanceType,
					SettlementDetails144.mmCashSubBalanceType, SettlementDetails145.mmSecuritiesSubBalanceType, SettlementDetails145.mmCashSubBalanceType, SettlementDetails146.mmSecuritiesSubBalanceType,
					SettlementDetails146.mmCashSubBalanceType, QuantityBreakdown47.mmSecuritiesSubBalanceType, QuantityBreakdown52.mmSecuritiesSubBalanceType, SettlementDetails155.mmSecuritiesSubBalanceType,
					SettlementDetails155.mmCashSubBalanceType, SettlementDetails156.mmSecuritiesSubBalanceType, SettlementDetails156.mmCashSubBalanceType, SettlementDetails157.mmDeliveringSecuritiesSubBalanceType,
					SettlementDetails157.mmReceivingSecuritiesSubBalanceType, SettlementDetails157.mmCashSubBalanceType, SettlementDetails158.mmSecuritiesSubBalanceType, SettlementDetails158.mmCashSubBalanceType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Balance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Specifies the nature of a balance.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BalanceTypeCode.mmObject();
		}

		@Override
		public BalanceTypeCode getValue(Balance obj) {
			return obj.getType();
		}

		@Override
		public void setValue(Balance obj, BalanceTypeCode value) {
			obj.setType(value);
		}
	};
	protected ISODateTime valueDate;
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
	 * {@linkplain com.tools20022.repository.msg.BalanceDetails2#mmBalanceValueDate
	 * BalanceDetails2.mmBalanceValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceDetails3#mmBalanceValueDate
	 * BalanceDetails3.mmBalanceValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceDetails4#mmBalanceValueDate
	 * BalanceDetails4.mmBalanceValueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalance4#mmValueDate
	 * CashBalance4.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalanceDetails2#mmValueDate
	 * CashBalanceDetails2.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalanceDetails3#mmValueDate
	 * CashBalanceDetails3.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalanceDetails4#mmValueDate
	 * CashBalanceDetails4.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalanceDetails5#mmValueDate
	 * CashBalanceDetails5.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalanceDetails6#mmValueDate
	 * CashBalanceDetails6.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalanceDetails7#mmValueDate
	 * CashBalanceDetails7.mmValueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalance5#mmValueDate
	 * CashBalance5.mmValueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalance6#mmValueDate
	 * CashBalance6.mmValueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalance1#mmDate
	 * CashBalance1.mmDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalance3#mmDate
	 * CashBalance3.mmDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalance2#mmDate
	 * CashBalance2.mmDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportData1#mmValueDate
	 * ReportData1.mmValueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportData5#mmValueDate
	 * ReportData5.mmValueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportData2#mmValueDate
	 * ReportData2.mmValueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportData3#mmValueDate
	 * ReportData3.mmValueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportData4#mmValueDate
	 * ReportData4.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAggregateBalance1#mmItemDate
	 * FinancialInstrumentAggregateBalance1.mmItemDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalance7#mmDate
	 * CashBalance7.mmDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalance8#mmDate
	 * CashBalance8.mmDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalance10#mmValueDate
	 * CashBalance10.mmValueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalance9#mmValueDate
	 * CashBalance9.mmValueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalance11#mmValueDate
	 * CashBalance11.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TotalsPerBankTransactionCode5#mmDate
	 * TotalsPerBankTransactionCode5.mmDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Balance
	 * Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::VALU</li>
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
	public static final MMBusinessAttribute<Balance, ISODateTime> mmValueDate = new MMBusinessAttribute<Balance, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(BalanceDetails2.mmBalanceValueDate, BalanceDetails3.mmBalanceValueDate, BalanceDetails4.mmBalanceValueDate, CashBalance4.mmValueDate, CashBalanceDetails2.mmValueDate,
					CashBalanceDetails3.mmValueDate, CashBalanceDetails4.mmValueDate, CashBalanceDetails5.mmValueDate, CashBalanceDetails6.mmValueDate, CashBalanceDetails7.mmValueDate, CashBalance5.mmValueDate, CashBalance6.mmValueDate,
					CashBalance1.mmDate, CashBalance3.mmDate, CashBalance2.mmDate, ReportData1.mmValueDate, ReportData5.mmValueDate, ReportData2.mmValueDate, ReportData3.mmValueDate, ReportData4.mmValueDate,
					FinancialInstrumentAggregateBalance1.mmItemDate, CashBalance7.mmDate, CashBalance8.mmDate, CashBalance10.mmValueDate, CashBalance9.mmValueDate, CashBalance11.mmValueDate, TotalsPerBankTransactionCode5.mmDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Balance.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::VALU"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ValueDate";
			definition = "Date and time at which the balance is or will be available.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(Balance obj) {
			return obj.getValueDate();
		}

		@Override
		public void setValue(Balance obj, ISODateTime value) {
			obj.setValueDate(value);
		}
	};
	protected DebitCreditCode creditDebitIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CashBalanceDetails2#mmCreditDebitIndicator
	 * CashBalanceDetails2.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalanceDetails3#mmCreditDebitIndicator
	 * CashBalanceDetails3.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalanceDetails4#mmCreditDebitIndicator
	 * CashBalanceDetails4.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalanceDetails5#mmCreditDebitIndicator
	 * CashBalanceDetails5.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalanceDetails6#mmCreditDebitIndicator
	 * CashBalanceDetails6.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalanceDetails7#mmCreditDebitIndicator
	 * CashBalanceDetails7.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalance5#mmCreditDebitIndicator
	 * CashBalance5.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalance6#mmCreditDebitIndicator
	 * CashBalance6.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalanceAvailability1#mmCreditDebitIndicator
	 * CashBalanceAvailability1.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalance1#mmCreditDebitIndicator
	 * CashBalance1.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalanceAvailability2#mmCreditDebitIndicator
	 * CashBalanceAvailability2.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalance3#mmCreditDebitIndicator
	 * CashBalance3.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalance2#mmCreditDebitIndicator
	 * CashBalance2.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount19#mmCreditDebitIndicator
	 * CashAccount19.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount9#mmCreditDebitIndicator
	 * SecuritiesAccount9.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount12#mmCreditDebitIndicator
	 * SecuritiesAccount12.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount18#mmCreditDebitIndicator
	 * CashAccount18.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount8#mmCreditDebitIndicator
	 * SecuritiesAccount8.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount10#mmCreditDebitIndicator
	 * SecuritiesAccount10.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContractBalance1#mmCreditDebitIndicator
	 * ContractBalance1.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalance7#mmCreditDebitIndicator
	 * CashBalance7.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAvailability1#mmCreditDebitIndicator
	 * CashAvailability1.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalance8#mmCreditDebitIndicator
	 * CashBalance8.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalance10#mmCreditDebitIndicator
	 * CashBalance10.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalance11#mmCreditDebitIndicator
	 * CashBalance11.mmCreditDebitIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Balance
	 * Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::CRDB</li>
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
	public static final MMBusinessAttribute<Balance, DebitCreditCode> mmCreditDebitIndicator = new MMBusinessAttribute<Balance, DebitCreditCode>() {
		{
			derivation_lazy = () -> Arrays.asList(CashBalanceDetails2.mmCreditDebitIndicator, CashBalanceDetails3.mmCreditDebitIndicator, CashBalanceDetails4.mmCreditDebitIndicator, CashBalanceDetails5.mmCreditDebitIndicator,
					CashBalanceDetails6.mmCreditDebitIndicator, CashBalanceDetails7.mmCreditDebitIndicator, CashBalance5.mmCreditDebitIndicator, CashBalance6.mmCreditDebitIndicator, CashBalanceAvailability1.mmCreditDebitIndicator,
					CashBalance1.mmCreditDebitIndicator, CashBalanceAvailability2.mmCreditDebitIndicator, CashBalance3.mmCreditDebitIndicator, CashBalance2.mmCreditDebitIndicator, CashAccount19.mmCreditDebitIndicator,
					SecuritiesAccount9.mmCreditDebitIndicator, SecuritiesAccount12.mmCreditDebitIndicator, CashAccount18.mmCreditDebitIndicator, SecuritiesAccount8.mmCreditDebitIndicator, SecuritiesAccount10.mmCreditDebitIndicator,
					ContractBalance1.mmCreditDebitIndicator, CashBalance7.mmCreditDebitIndicator, CashAvailability1.mmCreditDebitIndicator, CashBalance8.mmCreditDebitIndicator, CashBalance10.mmCreditDebitIndicator,
					CashBalance11.mmCreditDebitIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Balance.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::CRDB"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates whether the balance is a credit or a debit balance. A zero balance is considered to be a credit balance";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DebitCreditCode.mmObject();
		}

		@Override
		public DebitCreditCode getValue(Balance obj) {
			return obj.getCreditDebitIndicator();
		}

		@Override
		public void setValue(Balance obj, DebitCreditCode value) {
			obj.setCreditDebitIndicator(value);
		}
	};
	protected List<AssetHolding> assetHolding;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmBalance
	 * AssetHolding.mmBalance}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace7#mmAccountBaseCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace7.mmAccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace7#mmInstrumentCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace7.mmInstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace7#mmAlternateReportingCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace7.mmAlternateReportingCurrencyAmounts}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation8#mmAccountBaseCurrencyAmounts
	 * AggregateBalanceInformation8.mmAccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation8#mmInstrumentCurrencyAmounts
	 * AggregateBalanceInformation8.mmInstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation8#mmAlternateReportingCurrencyAmounts
	 * AggregateBalanceInformation8.mmAlternateReportingCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace10#mmAccountBaseCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace10.mmAccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace10#mmInstrumentCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace10.mmInstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace10#mmAlternateReportingCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace10.mmAlternateReportingCurrencyAmounts
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation11#mmAccountBaseCurrencyAmounts
	 * AggregateBalanceInformation11.mmAccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation11#mmInstrumentCurrencyAmounts
	 * AggregateBalanceInformation11.mmInstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation11#mmAlternateReportingCurrencyAmounts
	 * AggregateBalanceInformation11.mmAlternateReportingCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace12#mmAccountBaseCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace12.mmAccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace12#mmInstrumentCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace12.mmInstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace12#mmAlternateReportingCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace12.mmAlternateReportingCurrencyAmounts
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation13#mmAccountBaseCurrencyAmounts
	 * AggregateBalanceInformation13.mmAccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation13#mmInstrumentCurrencyAmounts
	 * AggregateBalanceInformation13.mmInstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation13#mmAlternateReportingCurrencyAmounts
	 * AggregateBalanceInformation13.mmAlternateReportingCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace14#mmAccountBaseCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace14.mmAccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace14#mmInstrumentCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace14.mmInstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace14#mmAlternateReportingCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace14.mmAlternateReportingCurrencyAmounts
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation15#mmAccountBaseCurrencyAmounts
	 * AggregateBalanceInformation15.mmAccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation15#mmInstrumentCurrencyAmounts
	 * AggregateBalanceInformation15.mmInstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation15#mmAlternateReportingCurrencyAmounts
	 * AggregateBalanceInformation15.mmAlternateReportingCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace16#mmAccountBaseCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace16.mmAccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace16#mmInstrumentCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace16.mmInstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace16#mmAlternateReportingCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace16.mmAlternateReportingCurrencyAmounts
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation17#mmAccountBaseCurrencyAmounts
	 * AggregateBalanceInformation17.mmAccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation17#mmInstrumentCurrencyAmounts
	 * AggregateBalanceInformation17.mmInstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation17#mmAlternateReportingCurrencyAmounts
	 * AggregateBalanceInformation17.mmAlternateReportingCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18#mmAccountBaseCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace18.mmAccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18#mmInstrumentCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace18.mmInstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18#mmAlternateReportingCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace18.mmAlternateReportingCurrencyAmounts
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation19#mmAccountBaseCurrencyAmounts
	 * AggregateBalanceInformation19.mmAccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation19#mmInstrumentCurrencyAmounts
	 * AggregateBalanceInformation19.mmInstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation19#mmAlternateReportingCurrencyAmounts
	 * AggregateBalanceInformation19.mmAlternateReportingCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace21#mmAccountBaseCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace21.mmAccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace21#mmInstrumentCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace21.mmInstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace21#mmAlternateReportingCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace21.mmAlternateReportingCurrencyAmounts
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation22#mmAccountBaseCurrencyAmounts
	 * AggregateBalanceInformation22.mmAccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation22#mmInstrumentCurrencyAmounts
	 * AggregateBalanceInformation22.mmInstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation22#mmAlternateReportingCurrencyAmounts
	 * AggregateBalanceInformation22.mmAlternateReportingCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace22#mmAccountBaseCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace22.mmAccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace22#mmInstrumentCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace22.mmInstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace22#mmAlternateReportingCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace22.mmAlternateReportingCurrencyAmounts
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation23#mmAccountBaseCurrencyAmounts
	 * AggregateBalanceInformation23.mmAccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation23#mmInstrumentCurrencyAmounts
	 * AggregateBalanceInformation23.mmInstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation23#mmAlternateReportingCurrencyAmounts
	 * AggregateBalanceInformation23.mmAlternateReportingCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace8#mmAccountBaseCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace8.mmAccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace8#mmInstrumentCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace8.mmInstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation9#mmAccountBaseCurrencyAmounts
	 * AggregateBalanceInformation9.mmAccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation9#mmInstrumentCurrencyAmounts
	 * AggregateBalanceInformation9.mmInstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace9#mmAccountBaseCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace9.mmAccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace9#mmInstrumentCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace9.mmInstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation10#mmAccountBaseCurrencyAmounts
	 * AggregateBalanceInformation10.mmAccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation10#mmInstrumentCurrencyAmounts
	 * AggregateBalanceInformation10.mmInstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace11#mmAccountBaseCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace11.mmAccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace11#mmInstrumentCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace11.mmInstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation12#mmAccountBaseCurrencyAmounts
	 * AggregateBalanceInformation12.mmAccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation12#mmInstrumentCurrencyAmounts
	 * AggregateBalanceInformation12.mmInstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace13#mmAccountBaseCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace13.mmAccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace13#mmInstrumentCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace13.mmInstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation14#mmAccountBaseCurrencyAmounts
	 * AggregateBalanceInformation14.mmAccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation14#mmInstrumentCurrencyAmounts
	 * AggregateBalanceInformation14.mmInstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace15#mmAccountBaseCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace15.mmAccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace15#mmInstrumentCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace15.mmInstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation16#mmAccountBaseCurrencyAmounts
	 * AggregateBalanceInformation16.mmAccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation16#mmInstrumentCurrencyAmounts
	 * AggregateBalanceInformation16.mmInstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace17#mmAccountBaseCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace17.mmAccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace17#mmInstrumentCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace17.mmInstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation18#mmAccountBaseCurrencyAmounts
	 * AggregateBalanceInformation18.mmAccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation18#mmInstrumentCurrencyAmounts
	 * AggregateBalanceInformation18.mmInstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace20#mmAccountBaseCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace20.mmAccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace20#mmInstrumentCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace20.mmInstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation21#mmAccountBaseCurrencyAmounts
	 * AggregateBalanceInformation21.mmAccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation21#mmInstrumentCurrencyAmounts
	 * AggregateBalanceInformation21.mmInstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace23#mmAccountBaseCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace23.mmAccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace23#mmInstrumentCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace23.mmInstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation24#mmAccountBaseCurrencyAmounts
	 * AggregateBalanceInformation24.mmAccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation24#mmInstrumentCurrencyAmounts
	 * AggregateBalanceInformation24.mmInstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace19#mmAccountBaseCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace19.mmAccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace19#mmInstrumentCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace19.mmInstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation20#mmAccountBaseCurrencyAmounts
	 * AggregateBalanceInformation20.mmAccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation20#mmInstrumentCurrencyAmounts
	 * AggregateBalanceInformation20.mmInstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6#mmAccountBaseCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace6.mmAccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6#mmInstrumentCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace6.mmInstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6#mmAlternateReportingCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace6.mmAlternateReportingCurrencyAmounts}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation6#mmAccountBaseCurrencyAmounts
	 * AggregateBalanceInformation6.mmAccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation6#mmInstrumentCurrencyAmounts
	 * AggregateBalanceInformation6.mmInstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation6#mmAlternateReportingCurrencyAmounts
	 * AggregateBalanceInformation6.mmAlternateReportingCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace5#mmAccountBaseCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace5.mmAccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace5#mmInstrumentCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace5.mmInstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation7#mmAccountBaseCurrencyAmounts
	 * AggregateBalanceInformation7.mmAccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation7#mmInstrumentCurrencyAmounts
	 * AggregateBalanceInformation7.mmInstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation26#mmAccountBaseCurrencyAmounts
	 * AggregateBalanceInformation26.mmAccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation26#mmInstrumentCurrencyAmounts
	 * AggregateBalanceInformation26.mmInstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation26#mmAlternateReportingCurrencyAmounts
	 * AggregateBalanceInformation26.mmAlternateReportingCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation25#mmAccountBaseCurrencyAmounts
	 * AggregateBalanceInformation25.mmAccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation25#mmInstrumentCurrencyAmounts
	 * AggregateBalanceInformation25.mmInstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24#mmAccountBaseCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace24.mmAccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24#mmInstrumentCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace24.mmInstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace25#mmAccountBaseCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace25.mmAccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace25#mmInstrumentCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace25.mmInstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace25#mmAlternateReportingCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace25.mmAlternateReportingCurrencyAmounts
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation28#mmAccountBaseCurrencyAmounts
	 * AggregateBalanceInformation28.mmAccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation28#mmInstrumentCurrencyAmounts
	 * AggregateBalanceInformation28.mmInstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation27#mmAccountBaseCurrencyAmounts
	 * AggregateBalanceInformation27.mmAccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation27#mmInstrumentCurrencyAmounts
	 * AggregateBalanceInformation27.mmInstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation27#mmAlternateReportingCurrencyAmounts
	 * AggregateBalanceInformation27.mmAlternateReportingCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace26#mmAccountBaseCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace26.mmAccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace26#mmInstrumentCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace26.mmInstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace26#mmAlternateReportingCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace26.mmAlternateReportingCurrencyAmounts
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace27#mmAccountBaseCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace27.mmAccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace27#mmInstrumentCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace27.mmInstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation30#mmAccountBaseCurrencyAmounts
	 * AggregateBalanceInformation30.mmAccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation30#mmInstrumentCurrencyAmounts
	 * AggregateBalanceInformation30.mmInstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation31#mmAccountBaseCurrencyAmounts
	 * AggregateBalanceInformation31.mmAccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation31#mmInstrumentCurrencyAmounts
	 * AggregateBalanceInformation31.mmInstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation31#mmAlternateReportingCurrencyAmounts
	 * AggregateBalanceInformation31.mmAlternateReportingCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28#mmAccountBaseCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace28.mmAccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28#mmInstrumentCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace28.mmInstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace29#mmAccountBaseCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace29.mmAccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace29#mmInstrumentCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace29.mmInstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace29#mmAlternateReportingCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace29.mmAlternateReportingCurrencyAmounts
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation32#mmAccountBaseCurrencyAmounts
	 * AggregateBalanceInformation32.mmAccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation32#mmInstrumentCurrencyAmounts
	 * AggregateBalanceInformation32.mmInstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation32#mmAlternateReportingCurrencyAmounts
	 * AggregateBalanceInformation32.mmAlternateReportingCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33#mmAccountBaseCurrencyAmounts
	 * AggregateBalanceInformation33.mmAccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33#mmInstrumentCurrencyAmounts
	 * AggregateBalanceInformation33.mmInstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31#mmAccountBaseCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace31.mmAccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31#mmInstrumentCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace31.mmInstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace30#mmAccountBaseCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace30.mmAccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace30#mmInstrumentCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace30.mmInstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace30#mmAlternateReportingCurrencyAmounts
	 * AggregateBalancePerSafekeepingPlace30.mmAlternateReportingCurrencyAmounts
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation34#mmAccountBaseCurrencyAmounts
	 * AggregateBalanceInformation34.mmAccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation34#mmInstrumentCurrencyAmounts
	 * AggregateBalanceInformation34.mmInstrumentCurrencyAmounts}</li>
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
	public static final MMBusinessAssociationEnd<Balance, List<AssetHolding>> mmAssetHolding = new MMBusinessAssociationEnd<Balance, List<AssetHolding>>() {
		{
			derivation_lazy = () -> Arrays.asList(AggregateBalancePerSafekeepingPlace7.mmAccountBaseCurrencyAmounts, AggregateBalancePerSafekeepingPlace7.mmInstrumentCurrencyAmounts,
					AggregateBalancePerSafekeepingPlace7.mmAlternateReportingCurrencyAmounts, AggregateBalanceInformation8.mmAccountBaseCurrencyAmounts, AggregateBalanceInformation8.mmInstrumentCurrencyAmounts,
					AggregateBalanceInformation8.mmAlternateReportingCurrencyAmounts, AggregateBalancePerSafekeepingPlace10.mmAccountBaseCurrencyAmounts, AggregateBalancePerSafekeepingPlace10.mmInstrumentCurrencyAmounts,
					AggregateBalancePerSafekeepingPlace10.mmAlternateReportingCurrencyAmounts, AggregateBalanceInformation11.mmAccountBaseCurrencyAmounts, AggregateBalanceInformation11.mmInstrumentCurrencyAmounts,
					AggregateBalanceInformation11.mmAlternateReportingCurrencyAmounts, AggregateBalancePerSafekeepingPlace12.mmAccountBaseCurrencyAmounts, AggregateBalancePerSafekeepingPlace12.mmInstrumentCurrencyAmounts,
					AggregateBalancePerSafekeepingPlace12.mmAlternateReportingCurrencyAmounts, AggregateBalanceInformation13.mmAccountBaseCurrencyAmounts, AggregateBalanceInformation13.mmInstrumentCurrencyAmounts,
					AggregateBalanceInformation13.mmAlternateReportingCurrencyAmounts, AggregateBalancePerSafekeepingPlace14.mmAccountBaseCurrencyAmounts, AggregateBalancePerSafekeepingPlace14.mmInstrumentCurrencyAmounts,
					AggregateBalancePerSafekeepingPlace14.mmAlternateReportingCurrencyAmounts, AggregateBalanceInformation15.mmAccountBaseCurrencyAmounts, AggregateBalanceInformation15.mmInstrumentCurrencyAmounts,
					AggregateBalanceInformation15.mmAlternateReportingCurrencyAmounts, AggregateBalancePerSafekeepingPlace16.mmAccountBaseCurrencyAmounts, AggregateBalancePerSafekeepingPlace16.mmInstrumentCurrencyAmounts,
					AggregateBalancePerSafekeepingPlace16.mmAlternateReportingCurrencyAmounts, AggregateBalanceInformation17.mmAccountBaseCurrencyAmounts, AggregateBalanceInformation17.mmInstrumentCurrencyAmounts,
					AggregateBalanceInformation17.mmAlternateReportingCurrencyAmounts, AggregateBalancePerSafekeepingPlace18.mmAccountBaseCurrencyAmounts, AggregateBalancePerSafekeepingPlace18.mmInstrumentCurrencyAmounts,
					AggregateBalancePerSafekeepingPlace18.mmAlternateReportingCurrencyAmounts, AggregateBalanceInformation19.mmAccountBaseCurrencyAmounts, AggregateBalanceInformation19.mmInstrumentCurrencyAmounts,
					AggregateBalanceInformation19.mmAlternateReportingCurrencyAmounts, AggregateBalancePerSafekeepingPlace21.mmAccountBaseCurrencyAmounts, AggregateBalancePerSafekeepingPlace21.mmInstrumentCurrencyAmounts,
					AggregateBalancePerSafekeepingPlace21.mmAlternateReportingCurrencyAmounts, AggregateBalanceInformation22.mmAccountBaseCurrencyAmounts, AggregateBalanceInformation22.mmInstrumentCurrencyAmounts,
					AggregateBalanceInformation22.mmAlternateReportingCurrencyAmounts, AggregateBalancePerSafekeepingPlace22.mmAccountBaseCurrencyAmounts, AggregateBalancePerSafekeepingPlace22.mmInstrumentCurrencyAmounts,
					AggregateBalancePerSafekeepingPlace22.mmAlternateReportingCurrencyAmounts, AggregateBalanceInformation23.mmAccountBaseCurrencyAmounts, AggregateBalanceInformation23.mmInstrumentCurrencyAmounts,
					AggregateBalanceInformation23.mmAlternateReportingCurrencyAmounts, AggregateBalancePerSafekeepingPlace8.mmAccountBaseCurrencyAmounts, AggregateBalancePerSafekeepingPlace8.mmInstrumentCurrencyAmounts,
					AggregateBalanceInformation9.mmAccountBaseCurrencyAmounts, AggregateBalanceInformation9.mmInstrumentCurrencyAmounts, AggregateBalancePerSafekeepingPlace9.mmAccountBaseCurrencyAmounts,
					AggregateBalancePerSafekeepingPlace9.mmInstrumentCurrencyAmounts, AggregateBalanceInformation10.mmAccountBaseCurrencyAmounts, AggregateBalanceInformation10.mmInstrumentCurrencyAmounts,
					AggregateBalancePerSafekeepingPlace11.mmAccountBaseCurrencyAmounts, AggregateBalancePerSafekeepingPlace11.mmInstrumentCurrencyAmounts, AggregateBalanceInformation12.mmAccountBaseCurrencyAmounts,
					AggregateBalanceInformation12.mmInstrumentCurrencyAmounts, AggregateBalancePerSafekeepingPlace13.mmAccountBaseCurrencyAmounts, AggregateBalancePerSafekeepingPlace13.mmInstrumentCurrencyAmounts,
					AggregateBalanceInformation14.mmAccountBaseCurrencyAmounts, AggregateBalanceInformation14.mmInstrumentCurrencyAmounts, AggregateBalancePerSafekeepingPlace15.mmAccountBaseCurrencyAmounts,
					AggregateBalancePerSafekeepingPlace15.mmInstrumentCurrencyAmounts, AggregateBalanceInformation16.mmAccountBaseCurrencyAmounts, AggregateBalanceInformation16.mmInstrumentCurrencyAmounts,
					AggregateBalancePerSafekeepingPlace17.mmAccountBaseCurrencyAmounts, AggregateBalancePerSafekeepingPlace17.mmInstrumentCurrencyAmounts, AggregateBalanceInformation18.mmAccountBaseCurrencyAmounts,
					AggregateBalanceInformation18.mmInstrumentCurrencyAmounts, AggregateBalancePerSafekeepingPlace20.mmAccountBaseCurrencyAmounts, AggregateBalancePerSafekeepingPlace20.mmInstrumentCurrencyAmounts,
					AggregateBalanceInformation21.mmAccountBaseCurrencyAmounts, AggregateBalanceInformation21.mmInstrumentCurrencyAmounts, AggregateBalancePerSafekeepingPlace23.mmAccountBaseCurrencyAmounts,
					AggregateBalancePerSafekeepingPlace23.mmInstrumentCurrencyAmounts, AggregateBalanceInformation24.mmAccountBaseCurrencyAmounts, AggregateBalanceInformation24.mmInstrumentCurrencyAmounts,
					AggregateBalancePerSafekeepingPlace19.mmAccountBaseCurrencyAmounts, AggregateBalancePerSafekeepingPlace19.mmInstrumentCurrencyAmounts, AggregateBalanceInformation20.mmAccountBaseCurrencyAmounts,
					AggregateBalanceInformation20.mmInstrumentCurrencyAmounts, AggregateBalancePerSafekeepingPlace6.mmAccountBaseCurrencyAmounts, AggregateBalancePerSafekeepingPlace6.mmInstrumentCurrencyAmounts,
					AggregateBalancePerSafekeepingPlace6.mmAlternateReportingCurrencyAmounts, AggregateBalanceInformation6.mmAccountBaseCurrencyAmounts, AggregateBalanceInformation6.mmInstrumentCurrencyAmounts,
					AggregateBalanceInformation6.mmAlternateReportingCurrencyAmounts, AggregateBalancePerSafekeepingPlace5.mmAccountBaseCurrencyAmounts, AggregateBalancePerSafekeepingPlace5.mmInstrumentCurrencyAmounts,
					AggregateBalanceInformation7.mmAccountBaseCurrencyAmounts, AggregateBalanceInformation7.mmInstrumentCurrencyAmounts, AggregateBalanceInformation26.mmAccountBaseCurrencyAmounts,
					AggregateBalanceInformation26.mmInstrumentCurrencyAmounts, AggregateBalanceInformation26.mmAlternateReportingCurrencyAmounts, AggregateBalanceInformation25.mmAccountBaseCurrencyAmounts,
					AggregateBalanceInformation25.mmInstrumentCurrencyAmounts, AggregateBalancePerSafekeepingPlace24.mmAccountBaseCurrencyAmounts, AggregateBalancePerSafekeepingPlace24.mmInstrumentCurrencyAmounts,
					AggregateBalancePerSafekeepingPlace25.mmAccountBaseCurrencyAmounts, AggregateBalancePerSafekeepingPlace25.mmInstrumentCurrencyAmounts, AggregateBalancePerSafekeepingPlace25.mmAlternateReportingCurrencyAmounts,
					AggregateBalanceInformation28.mmAccountBaseCurrencyAmounts, AggregateBalanceInformation28.mmInstrumentCurrencyAmounts, AggregateBalanceInformation27.mmAccountBaseCurrencyAmounts,
					AggregateBalanceInformation27.mmInstrumentCurrencyAmounts, AggregateBalanceInformation27.mmAlternateReportingCurrencyAmounts, AggregateBalancePerSafekeepingPlace26.mmAccountBaseCurrencyAmounts,
					AggregateBalancePerSafekeepingPlace26.mmInstrumentCurrencyAmounts, AggregateBalancePerSafekeepingPlace26.mmAlternateReportingCurrencyAmounts, AggregateBalancePerSafekeepingPlace27.mmAccountBaseCurrencyAmounts,
					AggregateBalancePerSafekeepingPlace27.mmInstrumentCurrencyAmounts, AggregateBalanceInformation30.mmAccountBaseCurrencyAmounts, AggregateBalanceInformation30.mmInstrumentCurrencyAmounts,
					AggregateBalanceInformation31.mmAccountBaseCurrencyAmounts, AggregateBalanceInformation31.mmInstrumentCurrencyAmounts, AggregateBalanceInformation31.mmAlternateReportingCurrencyAmounts,
					AggregateBalancePerSafekeepingPlace28.mmAccountBaseCurrencyAmounts, AggregateBalancePerSafekeepingPlace28.mmInstrumentCurrencyAmounts, AggregateBalancePerSafekeepingPlace29.mmAccountBaseCurrencyAmounts,
					AggregateBalancePerSafekeepingPlace29.mmInstrumentCurrencyAmounts, AggregateBalancePerSafekeepingPlace29.mmAlternateReportingCurrencyAmounts, AggregateBalanceInformation32.mmAccountBaseCurrencyAmounts,
					AggregateBalanceInformation32.mmInstrumentCurrencyAmounts, AggregateBalanceInformation32.mmAlternateReportingCurrencyAmounts, AggregateBalanceInformation33.mmAccountBaseCurrencyAmounts,
					AggregateBalanceInformation33.mmInstrumentCurrencyAmounts, AggregateBalancePerSafekeepingPlace31.mmAccountBaseCurrencyAmounts, AggregateBalancePerSafekeepingPlace31.mmInstrumentCurrencyAmounts,
					AggregateBalancePerSafekeepingPlace30.mmAccountBaseCurrencyAmounts, AggregateBalancePerSafekeepingPlace30.mmInstrumentCurrencyAmounts, AggregateBalancePerSafekeepingPlace30.mmAlternateReportingCurrencyAmounts,
					AggregateBalanceInformation34.mmAccountBaseCurrencyAmounts, AggregateBalanceInformation34.mmInstrumentCurrencyAmounts);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Balance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AssetHolding";
			definition = "Specifies in terms of value and quantity the assets held in a balance.";
			minOccurs = 0;
			opposite_lazy = () -> AssetHolding.mmBalance;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> AssetHolding.mmObject();
		}

		@Override
		public List<AssetHolding> getValue(Balance obj) {
			return obj.getAssetHolding();
		}

		@Override
		public void setValue(Balance obj, List<AssetHolding> value) {
			obj.setAssetHolding(value);
		}
	};
	protected ISODateTime calculationDate;
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
	 * {@linkplain com.tools20022.repository.msg.ReportData1#mmDateAndTimeStamp
	 * ReportData1.mmDateAndTimeStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportData5#mmDateAndTimeStamp
	 * ReportData5.mmDateAndTimeStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportData2#mmDateAndTimeStamp
	 * ReportData2.mmDateAndTimeStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportData3#mmDateAndTimeStamp
	 * ReportData3.mmDateAndTimeStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportData4#mmDateAndTimeStamp
	 * ReportData4.mmDateAndTimeStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation20#mmBalanceDate
	 * AggregateBalanceInformation20.mmBalanceDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardAccount2#mmBalanceDate
	 * CardAccount2.mmBalanceDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation34#mmBalanceDate
	 * AggregateBalanceInformation34.mmBalanceDate}</li>
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
	public static final MMBusinessAttribute<Balance, ISODateTime> mmCalculationDate = new MMBusinessAttribute<Balance, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(ReportData1.mmDateAndTimeStamp, ReportData5.mmDateAndTimeStamp, ReportData2.mmDateAndTimeStamp, ReportData3.mmDateAndTimeStamp, ReportData4.mmDateAndTimeStamp,
					AggregateBalanceInformation20.mmBalanceDate, CardAccount2.mmBalanceDate, AggregateBalanceInformation34.mmBalanceDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Balance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CalculationDate";
			definition = "Specifies the date and time at which the balance is calculated.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(Balance obj) {
			return obj.getCalculationDate();
		}

		@Override
		public void setValue(Balance obj, ISODateTime value) {
			obj.setCalculationDate(value);
		}
	};
	protected List<Adjustment> adjustment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmAdjustedBalance
	 * Adjustment.mmAdjustedBalance}</li>
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
	 * {@linkplain com.tools20022.repository.msg.BalanceAdjustment1#mmEarningsAdjustmentAmount
	 * BalanceAdjustment1.mmEarningsAdjustmentAmount}</li>
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
	public static final MMBusinessAssociationEnd<Balance, List<Adjustment>> mmAdjustment = new MMBusinessAssociationEnd<Balance, List<Adjustment>>() {
		{
			derivation_lazy = () -> Arrays.asList(BalanceAdjustment1.mmEarningsAdjustmentAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Balance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Adjustment";
			definition = "Specifies the balance adjustments.";
			minOccurs = 0;
			opposite_lazy = () -> Adjustment.mmAdjustedBalance;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Adjustment.mmObject();
		}

		@Override
		public List<Adjustment> getValue(Balance obj) {
			return obj.getAdjustment();
		}

		@Override
		public void setValue(Balance obj, List<Adjustment> value) {
			obj.setAdjustment(value);
		}
	};
	protected Account account;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmBalance
	 * Account.mmBalance}</li>
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
	public static final MMBusinessAssociationEnd<Balance, Account> mmAccount = new MMBusinessAssociationEnd<Balance, Account>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Balance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Account";
			definition = "Account or sub-account for which a balance is calculated.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Account.mmBalance;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Account.mmObject();
		}

		@Override
		public Account getValue(Balance obj) {
			return obj.getAccount();
		}

		@Override
		public void setValue(Balance obj, Account value) {
			obj.setAccount(value);
		}
	};
	protected List<Interest> interest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmAccountBalance
	 * Interest.mmAccountBalance}</li>
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
	public static final MMBusinessAssociationEnd<Balance, List<Interest>> mmInterest = new MMBusinessAssociationEnd<Balance, List<Interest>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Balance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Interest";
			definition = "Set of elements used to provide interest information that applies to the balance.";
			minOccurs = 0;
			opposite_lazy = () -> Interest.mmAccountBalance;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Interest.mmObject();
		}

		@Override
		public List<Interest> getValue(Balance obj) {
			return obj.getInterest();
		}

		@Override
		public void setValue(Balance obj, List<Interest> value) {
			obj.setInterest(value);
		}
	};
	protected List<Entry> balanceEntry;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Entry#mmBalance
	 * Entry.mmBalance}</li>
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
	public static final MMBusinessAssociationEnd<Balance, List<Entry>> mmBalanceEntry = new MMBusinessAssociationEnd<Balance, List<Entry>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Balance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BalanceEntry";
			definition = "Credit or debit postings used to calculate a balance.";
			minOccurs = 0;
			opposite_lazy = () -> Entry.mmBalance;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Entry.mmObject();
		}

		@Override
		public List<Entry> getValue(Balance obj) {
			return obj.getBalanceEntry();
		}

		@Override
		public void setValue(Balance obj, List<Entry> value) {
			obj.setBalanceEntry(value);
		}
	};
	protected ProcessingTypeCode processingRestriction;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<Balance, ProcessingTypeCode> mmProcessingRestriction = new MMBusinessAttribute<Balance, ProcessingTypeCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Balance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProcessingRestriction";
			definition = "Specifies the type of balance processing restrictions that must be applied.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ProcessingTypeCode.mmObject();
		}

		@Override
		public ProcessingTypeCode getValue(Balance obj) {
			return obj.getProcessingRestriction();
		}

		@Override
		public void setValue(Balance obj, ProcessingTypeCode value) {
			obj.setProcessingRestriction(value);
		}
	};
	protected OpeningClosingCode openingClosingCode;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.choice.OpeningClosing1Choice#mmCode
	 * OpeningClosing1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OpeningClosing1Choice#mmProprietary
	 * OpeningClosing1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OpeningClosing2Choice#mmCode
	 * OpeningClosing2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OpeningClosing2Choice#mmProprietary
	 * OpeningClosing2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OpeningClosing3Choice#mmCode
	 * OpeningClosing3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OpeningClosing3Choice#mmProprietary
	 * OpeningClosing3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OpeningClosing4Choice#mmCode
	 * OpeningClosing4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OpeningClosing4Choice#mmProprietary
	 * OpeningClosing4Choice.mmProprietary}</li>
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
	public static final MMBusinessAttribute<Balance, OpeningClosingCode> mmOpeningClosingCode = new MMBusinessAttribute<Balance, OpeningClosingCode>() {
		{
			derivation_lazy = () -> Arrays.asList(OpeningClosing1Choice.mmCode, OpeningClosing1Choice.mmProprietary, OpeningClosing2Choice.mmCode, OpeningClosing2Choice.mmProprietary, OpeningClosing3Choice.mmCode,
					OpeningClosing3Choice.mmProprietary, OpeningClosing4Choice.mmCode, OpeningClosing4Choice.mmProprietary);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Balance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OpeningClosingCode";
			definition = "Specifies whether the balance is an opening or a closing one.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OpeningClosingCode.mmObject();
		}

		@Override
		public OpeningClosingCode getValue(Balance obj) {
			return obj.getOpeningClosingCode();
		}

		@Override
		public void setValue(Balance obj, OpeningClosingCode value) {
			obj.setOpeningClosingCode(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Balance";
				definition = "Numerical representation of the net increases and decreases in an account at a specific point in time.";
				associationDomain_lazy = () -> Arrays.asList(Account.mmBalance, Adjustment.mmAdjustedBalance, Entry.mmBalance, AssetHolding.mmBalance, Interest.mmAccountBalance);
				derivationElement_lazy = () -> Arrays.asList(BalanceDetails5.mmDetailedBalance, PortfolioBalance1.mmSummaryBalance, PortfolioBalance1.mmDetailedBalance);
				subType_lazy = () -> Arrays.asList(CashBalance.mmObject(), SecuritiesBalance.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Balance.mmType, com.tools20022.repository.entity.Balance.mmValueDate, com.tools20022.repository.entity.Balance.mmCreditDebitIndicator,
						com.tools20022.repository.entity.Balance.mmAssetHolding, com.tools20022.repository.entity.Balance.mmCalculationDate, com.tools20022.repository.entity.Balance.mmAdjustment,
						com.tools20022.repository.entity.Balance.mmAccount, com.tools20022.repository.entity.Balance.mmInterest, com.tools20022.repository.entity.Balance.mmBalanceEntry,
						com.tools20022.repository.entity.Balance.mmProcessingRestriction, com.tools20022.repository.entity.Balance.mmOpeningClosingCode);
				derivationComponent_lazy = () -> Arrays.asList(BalanceType9Choice.mmObject(), BalanceType1Choice.mmObject(), BalanceType6Choice.mmObject(), BalanceType7Choice.mmObject(), BalanceDetails6.mmObject(),
						BalanceDetails5.mmObject(), PortfolioBalance1.mmObject(), CashBalanceType1Choice.mmObject(), CashSubBalanceTypeAndQuantityBreakdown1.mmObject(), ContractBalanceType1Choice.mmObject(),
						CashBalanceType2Choice.mmObject(), CashSubBalanceTypeAndQuantityBreakdown2.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Balance.class;
			}
		});
		return mmObject_lazy.get();
	}

	public BalanceTypeCode getType() {
		return type;
	}

	public Balance setType(BalanceTypeCode type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public ISODateTime getValueDate() {
		return valueDate;
	}

	public Balance setValueDate(ISODateTime valueDate) {
		this.valueDate = Objects.requireNonNull(valueDate);
		return this;
	}

	public DebitCreditCode getCreditDebitIndicator() {
		return creditDebitIndicator;
	}

	public Balance setCreditDebitIndicator(DebitCreditCode creditDebitIndicator) {
		this.creditDebitIndicator = Objects.requireNonNull(creditDebitIndicator);
		return this;
	}

	public List<AssetHolding> getAssetHolding() {
		return assetHolding == null ? assetHolding = new ArrayList<>() : assetHolding;
	}

	public Balance setAssetHolding(List<AssetHolding> assetHolding) {
		this.assetHolding = Objects.requireNonNull(assetHolding);
		return this;
	}

	public ISODateTime getCalculationDate() {
		return calculationDate;
	}

	public Balance setCalculationDate(ISODateTime calculationDate) {
		this.calculationDate = Objects.requireNonNull(calculationDate);
		return this;
	}

	public List<Adjustment> getAdjustment() {
		return adjustment == null ? adjustment = new ArrayList<>() : adjustment;
	}

	public Balance setAdjustment(List<Adjustment> adjustment) {
		this.adjustment = Objects.requireNonNull(adjustment);
		return this;
	}

	public Account getAccount() {
		return account;
	}

	public Balance setAccount(Account account) {
		this.account = Objects.requireNonNull(account);
		return this;
	}

	public List<Interest> getInterest() {
		return interest == null ? interest = new ArrayList<>() : interest;
	}

	public Balance setInterest(List<Interest> interest) {
		this.interest = Objects.requireNonNull(interest);
		return this;
	}

	public List<Entry> getBalanceEntry() {
		return balanceEntry == null ? balanceEntry = new ArrayList<>() : balanceEntry;
	}

	public Balance setBalanceEntry(List<Entry> balanceEntry) {
		this.balanceEntry = Objects.requireNonNull(balanceEntry);
		return this;
	}

	public ProcessingTypeCode getProcessingRestriction() {
		return processingRestriction;
	}

	public Balance setProcessingRestriction(ProcessingTypeCode processingRestriction) {
		this.processingRestriction = Objects.requireNonNull(processingRestriction);
		return this;
	}

	public OpeningClosingCode getOpeningClosingCode() {
		return openingClosingCode;
	}

	public Balance setOpeningClosingCode(OpeningClosingCode openingClosingCode) {
		this.openingClosingCode = Objects.requireNonNull(openingClosingCode);
		return this;
	}
}