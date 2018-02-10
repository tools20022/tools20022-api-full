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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies balances of assets and other balances.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code#AccruedIncome
 * FinancialAssetBalanceType1Code.AccruedIncome}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code#OtherFinancialInstruments
 * FinancialAssetBalanceType1Code.OtherFinancialInstruments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code#SettledCash
 * FinancialAssetBalanceType1Code.SettledCash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code#FXTransaction
 * FinancialAssetBalanceType1Code.FXTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code#Cash
 * FinancialAssetBalanceType1Code.Cash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code#TreasuryInflatedProtectedSecurity
 * FinancialAssetBalanceType1Code.TreasuryInflatedProtectedSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code#Equity
 * FinancialAssetBalanceType1Code.Equity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code#CommonStock
 * FinancialAssetBalanceType1Code.CommonStock}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code#PreferredStock
 * FinancialAssetBalanceType1Code.PreferredStock}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code#MutualFund
 * FinancialAssetBalanceType1Code.MutualFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code#ExchangeTradedFund
 * FinancialAssetBalanceType1Code.ExchangeTradedFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code#Rights
 * FinancialAssetBalanceType1Code.Rights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code#Warrant
 * FinancialAssetBalanceType1Code.Warrant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code#Bond
 * FinancialAssetBalanceType1Code.Bond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code#ConvertibleBond
 * FinancialAssetBalanceType1Code.ConvertibleBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code#CorporateBond
 * FinancialAssetBalanceType1Code.CorporateBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code#GovernmentBond
 * FinancialAssetBalanceType1Code.GovernmentBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code#Option
 * FinancialAssetBalanceType1Code.Option}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code#Future
 * FinancialAssetBalanceType1Code.Future}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code#Swap
 * FinancialAssetBalanceType1Code.Swap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code#CurrencyExchange
 * FinancialAssetBalanceType1Code.CurrencyExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code#ForeignInvestment
 * FinancialAssetBalanceType1Code.ForeignInvestment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code#Gold
 * FinancialAssetBalanceType1Code.Gold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code#Property
 * FinancialAssetBalanceType1Code.Property}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code#BankersAcceptance
 * FinancialAssetBalanceType1Code.BankersAcceptance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code#SyndicatedBankLoan
 * FinancialAssetBalanceType1Code.SyndicatedBankLoan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code#CollateralisedBondObligation
 * FinancialAssetBalanceType1Code.CollateralisedBondObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code#CertificateOfDeposit
 * FinancialAssetBalanceType1Code.CertificateOfDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code#CollateralisedDebtObligation
 * FinancialAssetBalanceType1Code.CollateralisedDebtObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code#CollateralisedLoanObligation
 * FinancialAssetBalanceType1Code.CollateralisedLoanObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code#CollateralisedMortgageObligation
 * FinancialAssetBalanceType1Code.CollateralisedMortgageObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code#CommericalPaper
 * FinancialAssetBalanceType1Code.CommericalPaper}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code#CorporatePrivatePlacement
 * FinancialAssetBalanceType1Code.CorporatePrivatePlacement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code#DiscountNote
 * FinancialAssetBalanceType1Code.DiscountNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code#FederalAgencyDiscountNote
 * FinancialAssetBalanceType1Code.FederalAgencyDiscountNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code#FederalHousingAuthority
 * FinancialAssetBalanceType1Code.FederalHousingAuthority}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code#FederalHomeLoan
 * FinancialAssetBalanceType1Code.FederalHomeLoan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code#FederalNationalMortgageAssociation
 * FinancialAssetBalanceType1Code.FederalNationalMortgageAssociation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code#FloatingRateNote
 * FinancialAssetBalanceType1Code.FloatingRateNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code#GovernmentNationalMortgageAssociation
 * FinancialAssetBalanceType1Code.GovernmentNationalMortgageAssociation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code#TreasuriesAndAgenciesDebentures
 * FinancialAssetBalanceType1Code.TreasuriesAndAgenciesDebentures}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code#IOETTEMortgage
 * FinancialAssetBalanceType1Code.IOETTEMortgage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code#MortgagePrivatePlacement
 * FinancialAssetBalanceType1Code.MortgagePrivatePlacement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code#MunicipalBond
 * FinancialAssetBalanceType1Code.MunicipalBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code#StudentLoanMarketingAssociation
 * FinancialAssetBalanceType1Code.StudentLoanMarketingAssociation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code#ShortTermInvestmentFund
 * FinancialAssetBalanceType1Code.ShortTermInvestmentFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code#TreasuryStrips
 * FinancialAssetBalanceType1Code.TreasuryStrips}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code#TimeDeposit
 * FinancialAssetBalanceType1Code.TimeDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code#UnitizedBondsAndWarrants
 * FinancialAssetBalanceType1Code.UnitizedBondsAndWarrants}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code#UnitizedBonds
 * FinancialAssetBalanceType1Code.UnitizedBonds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code#VariableRateDiscountNote
 * FinancialAssetBalanceType1Code.VariableRateDiscountNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code#CatsTigersLions
 * FinancialAssetBalanceType1Code.CatsTigersLions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code#ForwardBonds
 * FinancialAssetBalanceType1Code.ForwardBonds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code#ForwardRateAgreement
 * FinancialAssetBalanceType1Code.ForwardRateAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code#RepurchaseAgreement
 * FinancialAssetBalanceType1Code.RepurchaseAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code#ReverseRepurchaseAgreement
 * FinancialAssetBalanceType1Code.ReverseRepurchaseAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code#TripartyRepurchaseAgreement
 * FinancialAssetBalanceType1Code.TripartyRepurchaseAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code#TripartyReverseRepurchaseAgreement
 * FinancialAssetBalanceType1Code.TripartyReverseRepurchaseAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code#FXForward
 * FinancialAssetBalanceType1Code.FXForward}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code#FXSpot
 * FinancialAssetBalanceType1Code.FXSpot}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode
 * FinancialAssetBalanceTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"ACRU"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FinancialAssetBalanceType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies balances of assets and other balances."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class FinancialAssetBalanceType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code
	 * FinancialAssetBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccruedIncome"</li>
	 * </ul>
	 */
	public static final FinancialAssetBalanceType1Code AccruedIncome = new FinancialAssetBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedIncome";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.mmObject();
			codeName = FinancialAssetBalanceTypeCode.AccruedIncome.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code
	 * FinancialAssetBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherFinancialInstruments"</li>
	 * </ul>
	 */
	public static final FinancialAssetBalanceType1Code OtherFinancialInstruments = new FinancialAssetBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherFinancialInstruments";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.mmObject();
			codeName = FinancialAssetBalanceTypeCode.OtherFinancialInstruments.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code
	 * FinancialAssetBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettledCash"</li>
	 * </ul>
	 */
	public static final FinancialAssetBalanceType1Code SettledCash = new FinancialAssetBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettledCash";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.mmObject();
			codeName = FinancialAssetBalanceTypeCode.SettledCash.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code
	 * FinancialAssetBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FXTransaction"</li>
	 * </ul>
	 */
	public static final FinancialAssetBalanceType1Code FXTransaction = new FinancialAssetBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FXTransaction";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.mmObject();
			codeName = FinancialAssetBalanceTypeCode.FXTransaction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code
	 * FinancialAssetBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cash"</li>
	 * </ul>
	 */
	public static final FinancialAssetBalanceType1Code Cash = new FinancialAssetBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cash";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.mmObject();
			codeName = FinancialAssetBalanceTypeCode.Cash.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code
	 * FinancialAssetBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TreasuryInflatedProtectedSecurity"</li>
	 * </ul>
	 */
	public static final FinancialAssetBalanceType1Code TreasuryInflatedProtectedSecurity = new FinancialAssetBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TreasuryInflatedProtectedSecurity";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.mmObject();
			codeName = FinancialAssetBalanceTypeCode.TreasuryInflatedProtectedSecurity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code
	 * FinancialAssetBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Equity"</li>
	 * </ul>
	 */
	public static final FinancialAssetBalanceType1Code Equity = new FinancialAssetBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Equity";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.mmObject();
			codeName = FinancialAssetBalanceTypeCode.Equity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code
	 * FinancialAssetBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommonStock"</li>
	 * </ul>
	 */
	public static final FinancialAssetBalanceType1Code CommonStock = new FinancialAssetBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommonStock";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.mmObject();
			codeName = FinancialAssetBalanceTypeCode.CommonStock.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code
	 * FinancialAssetBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreferredStock"</li>
	 * </ul>
	 */
	public static final FinancialAssetBalanceType1Code PreferredStock = new FinancialAssetBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreferredStock";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.mmObject();
			codeName = FinancialAssetBalanceTypeCode.PreferredStock.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code
	 * FinancialAssetBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MutualFund"</li>
	 * </ul>
	 */
	public static final FinancialAssetBalanceType1Code MutualFund = new FinancialAssetBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MutualFund";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.mmObject();
			codeName = FinancialAssetBalanceTypeCode.MutualFund.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code
	 * FinancialAssetBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeTradedFund"</li>
	 * </ul>
	 */
	public static final FinancialAssetBalanceType1Code ExchangeTradedFund = new FinancialAssetBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeTradedFund";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.mmObject();
			codeName = FinancialAssetBalanceTypeCode.ExchangeTradedFund.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code
	 * FinancialAssetBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rights"</li>
	 * </ul>
	 */
	public static final FinancialAssetBalanceType1Code Rights = new FinancialAssetBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rights";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.mmObject();
			codeName = FinancialAssetBalanceTypeCode.Rights.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code
	 * FinancialAssetBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Warrant"</li>
	 * </ul>
	 */
	public static final FinancialAssetBalanceType1Code Warrant = new FinancialAssetBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Warrant";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.mmObject();
			codeName = FinancialAssetBalanceTypeCode.Warrant.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code
	 * FinancialAssetBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bond"</li>
	 * </ul>
	 */
	public static final FinancialAssetBalanceType1Code Bond = new FinancialAssetBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bond";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.mmObject();
			codeName = FinancialAssetBalanceTypeCode.Bond.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code
	 * FinancialAssetBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConvertibleBond"</li>
	 * </ul>
	 */
	public static final FinancialAssetBalanceType1Code ConvertibleBond = new FinancialAssetBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConvertibleBond";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.mmObject();
			codeName = FinancialAssetBalanceTypeCode.ConvertibleBond.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code
	 * FinancialAssetBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateBond"</li>
	 * </ul>
	 */
	public static final FinancialAssetBalanceType1Code CorporateBond = new FinancialAssetBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateBond";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.mmObject();
			codeName = FinancialAssetBalanceTypeCode.CorporateBond.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code
	 * FinancialAssetBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GovernmentBond"</li>
	 * </ul>
	 */
	public static final FinancialAssetBalanceType1Code GovernmentBond = new FinancialAssetBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GovernmentBond";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.mmObject();
			codeName = FinancialAssetBalanceTypeCode.GovernmentBond.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code
	 * FinancialAssetBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Option"</li>
	 * </ul>
	 */
	public static final FinancialAssetBalanceType1Code Option = new FinancialAssetBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Option";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.mmObject();
			codeName = FinancialAssetBalanceTypeCode.Option.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code
	 * FinancialAssetBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Future"</li>
	 * </ul>
	 */
	public static final FinancialAssetBalanceType1Code Future = new FinancialAssetBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Future";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.mmObject();
			codeName = FinancialAssetBalanceTypeCode.Future.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code
	 * FinancialAssetBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Swap"</li>
	 * </ul>
	 */
	public static final FinancialAssetBalanceType1Code Swap = new FinancialAssetBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Swap";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.mmObject();
			codeName = FinancialAssetBalanceTypeCode.Swap.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code
	 * FinancialAssetBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyExchange"</li>
	 * </ul>
	 */
	public static final FinancialAssetBalanceType1Code CurrencyExchange = new FinancialAssetBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyExchange";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.mmObject();
			codeName = FinancialAssetBalanceTypeCode.CurrencyExchange.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code
	 * FinancialAssetBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignInvestment"</li>
	 * </ul>
	 */
	public static final FinancialAssetBalanceType1Code ForeignInvestment = new FinancialAssetBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignInvestment";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.mmObject();
			codeName = FinancialAssetBalanceTypeCode.ForeignInvestment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code
	 * FinancialAssetBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Gold"</li>
	 * </ul>
	 */
	public static final FinancialAssetBalanceType1Code Gold = new FinancialAssetBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Gold";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.mmObject();
			codeName = FinancialAssetBalanceTypeCode.Gold.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code
	 * FinancialAssetBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Property"</li>
	 * </ul>
	 */
	public static final FinancialAssetBalanceType1Code Property = new FinancialAssetBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Property";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.mmObject();
			codeName = FinancialAssetBalanceTypeCode.Property.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code
	 * FinancialAssetBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankersAcceptance"</li>
	 * </ul>
	 */
	public static final FinancialAssetBalanceType1Code BankersAcceptance = new FinancialAssetBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankersAcceptance";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.mmObject();
			codeName = FinancialAssetBalanceTypeCode.BankersAcceptance.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code
	 * FinancialAssetBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SyndicatedBankLoan"</li>
	 * </ul>
	 */
	public static final FinancialAssetBalanceType1Code SyndicatedBankLoan = new FinancialAssetBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SyndicatedBankLoan";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.mmObject();
			codeName = FinancialAssetBalanceTypeCode.SyndicatedBankLoan.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code
	 * FinancialAssetBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralisedBondObligation"</li>
	 * </ul>
	 */
	public static final FinancialAssetBalanceType1Code CollateralisedBondObligation = new FinancialAssetBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralisedBondObligation";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.mmObject();
			codeName = FinancialAssetBalanceTypeCode.CollateralisedBondObligation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code
	 * FinancialAssetBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateOfDeposit"</li>
	 * </ul>
	 */
	public static final FinancialAssetBalanceType1Code CertificateOfDeposit = new FinancialAssetBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateOfDeposit";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.mmObject();
			codeName = FinancialAssetBalanceTypeCode.CertificateOfDeposit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code
	 * FinancialAssetBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralisedDebtObligation"</li>
	 * </ul>
	 */
	public static final FinancialAssetBalanceType1Code CollateralisedDebtObligation = new FinancialAssetBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralisedDebtObligation";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.mmObject();
			codeName = FinancialAssetBalanceTypeCode.CollateralisedDebtObligation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code
	 * FinancialAssetBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralisedLoanObligation"</li>
	 * </ul>
	 */
	public static final FinancialAssetBalanceType1Code CollateralisedLoanObligation = new FinancialAssetBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralisedLoanObligation";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.mmObject();
			codeName = FinancialAssetBalanceTypeCode.CollateralisedLoanObligation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code
	 * FinancialAssetBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralisedMortgageObligation"</li>
	 * </ul>
	 */
	public static final FinancialAssetBalanceType1Code CollateralisedMortgageObligation = new FinancialAssetBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralisedMortgageObligation";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.mmObject();
			codeName = FinancialAssetBalanceTypeCode.CollateralisedMortgageObligation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code
	 * FinancialAssetBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommericalPaper"</li>
	 * </ul>
	 */
	public static final FinancialAssetBalanceType1Code CommericalPaper = new FinancialAssetBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommericalPaper";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.mmObject();
			codeName = FinancialAssetBalanceTypeCode.CommericalPaper.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code
	 * FinancialAssetBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporatePrivatePlacement"</li>
	 * </ul>
	 */
	public static final FinancialAssetBalanceType1Code CorporatePrivatePlacement = new FinancialAssetBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporatePrivatePlacement";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.mmObject();
			codeName = FinancialAssetBalanceTypeCode.CorporatePrivatePlacement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code
	 * FinancialAssetBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DiscountNote"</li>
	 * </ul>
	 */
	public static final FinancialAssetBalanceType1Code DiscountNote = new FinancialAssetBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DiscountNote";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.mmObject();
			codeName = FinancialAssetBalanceTypeCode.DiscountNote.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code
	 * FinancialAssetBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FederalAgencyDiscountNote"</li>
	 * </ul>
	 */
	public static final FinancialAssetBalanceType1Code FederalAgencyDiscountNote = new FinancialAssetBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FederalAgencyDiscountNote";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.mmObject();
			codeName = FinancialAssetBalanceTypeCode.FederalAgencyDiscountNote.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code
	 * FinancialAssetBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FederalHousingAuthority"</li>
	 * </ul>
	 */
	public static final FinancialAssetBalanceType1Code FederalHousingAuthority = new FinancialAssetBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FederalHousingAuthority";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.mmObject();
			codeName = FinancialAssetBalanceTypeCode.FederalHousingAuthority.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code
	 * FinancialAssetBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FederalHomeLoan"</li>
	 * </ul>
	 */
	public static final FinancialAssetBalanceType1Code FederalHomeLoan = new FinancialAssetBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FederalHomeLoan";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.mmObject();
			codeName = FinancialAssetBalanceTypeCode.FederalHomeLoan.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code
	 * FinancialAssetBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FederalNationalMortgageAssociation"</li>
	 * </ul>
	 */
	public static final FinancialAssetBalanceType1Code FederalNationalMortgageAssociation = new FinancialAssetBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FederalNationalMortgageAssociation";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.mmObject();
			codeName = FinancialAssetBalanceTypeCode.FederalNationalMortgageAssociation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code
	 * FinancialAssetBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FloatingRateNote"</li>
	 * </ul>
	 */
	public static final FinancialAssetBalanceType1Code FloatingRateNote = new FinancialAssetBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FloatingRateNote";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.mmObject();
			codeName = FinancialAssetBalanceTypeCode.FloatingRateNote.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code
	 * FinancialAssetBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GovernmentNationalMortgageAssociation"</li>
	 * </ul>
	 */
	public static final FinancialAssetBalanceType1Code GovernmentNationalMortgageAssociation = new FinancialAssetBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GovernmentNationalMortgageAssociation";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.mmObject();
			codeName = FinancialAssetBalanceTypeCode.GovernmentNationalMortgageAssociation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code
	 * FinancialAssetBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TreasuriesAndAgenciesDebentures"</li>
	 * </ul>
	 */
	public static final FinancialAssetBalanceType1Code TreasuriesAndAgenciesDebentures = new FinancialAssetBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TreasuriesAndAgenciesDebentures";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.mmObject();
			codeName = FinancialAssetBalanceTypeCode.TreasuriesAndAgenciesDebentures.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code
	 * FinancialAssetBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IOETTEMortgage"</li>
	 * </ul>
	 */
	public static final FinancialAssetBalanceType1Code IOETTEMortgage = new FinancialAssetBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IOETTEMortgage";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.mmObject();
			codeName = FinancialAssetBalanceTypeCode.IOETTEMortgage.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code
	 * FinancialAssetBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MortgagePrivatePlacement"</li>
	 * </ul>
	 */
	public static final FinancialAssetBalanceType1Code MortgagePrivatePlacement = new FinancialAssetBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MortgagePrivatePlacement";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.mmObject();
			codeName = FinancialAssetBalanceTypeCode.MortgagePrivatePlacement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code
	 * FinancialAssetBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MunicipalBond"</li>
	 * </ul>
	 */
	public static final FinancialAssetBalanceType1Code MunicipalBond = new FinancialAssetBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalBond";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.mmObject();
			codeName = FinancialAssetBalanceTypeCode.MunicipalBond.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code
	 * FinancialAssetBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StudentLoanMarketingAssociation"</li>
	 * </ul>
	 */
	public static final FinancialAssetBalanceType1Code StudentLoanMarketingAssociation = new FinancialAssetBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StudentLoanMarketingAssociation";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.mmObject();
			codeName = FinancialAssetBalanceTypeCode.StudentLoanMarketingAssociation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code
	 * FinancialAssetBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortTermInvestmentFund"</li>
	 * </ul>
	 */
	public static final FinancialAssetBalanceType1Code ShortTermInvestmentFund = new FinancialAssetBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortTermInvestmentFund";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.mmObject();
			codeName = FinancialAssetBalanceTypeCode.ShortTermInvestmentFund.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code
	 * FinancialAssetBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TreasuryStrips"</li>
	 * </ul>
	 */
	public static final FinancialAssetBalanceType1Code TreasuryStrips = new FinancialAssetBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TreasuryStrips";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.mmObject();
			codeName = FinancialAssetBalanceTypeCode.TreasuryStrips.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code
	 * FinancialAssetBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TimeDeposit"</li>
	 * </ul>
	 */
	public static final FinancialAssetBalanceType1Code TimeDeposit = new FinancialAssetBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TimeDeposit";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.mmObject();
			codeName = FinancialAssetBalanceTypeCode.TimeDeposit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code
	 * FinancialAssetBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitizedBondsAndWarrants"</li>
	 * </ul>
	 */
	public static final FinancialAssetBalanceType1Code UnitizedBondsAndWarrants = new FinancialAssetBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitizedBondsAndWarrants";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.mmObject();
			codeName = FinancialAssetBalanceTypeCode.UnitizedBondsAndWarrants.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code
	 * FinancialAssetBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitizedBonds"</li>
	 * </ul>
	 */
	public static final FinancialAssetBalanceType1Code UnitizedBonds = new FinancialAssetBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitizedBonds";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.mmObject();
			codeName = FinancialAssetBalanceTypeCode.UnitizedBonds.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code
	 * FinancialAssetBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariableRateDiscountNote"</li>
	 * </ul>
	 */
	public static final FinancialAssetBalanceType1Code VariableRateDiscountNote = new FinancialAssetBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariableRateDiscountNote";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.mmObject();
			codeName = FinancialAssetBalanceTypeCode.VariableRateDiscountNote.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code
	 * FinancialAssetBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CatsTigersLions"</li>
	 * </ul>
	 */
	public static final FinancialAssetBalanceType1Code CatsTigersLions = new FinancialAssetBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CatsTigersLions";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.mmObject();
			codeName = FinancialAssetBalanceTypeCode.CatsTigersLions.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code
	 * FinancialAssetBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForwardBonds"</li>
	 * </ul>
	 */
	public static final FinancialAssetBalanceType1Code ForwardBonds = new FinancialAssetBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForwardBonds";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.mmObject();
			codeName = FinancialAssetBalanceTypeCode.ForwardBonds.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code
	 * FinancialAssetBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForwardRateAgreement"</li>
	 * </ul>
	 */
	public static final FinancialAssetBalanceType1Code ForwardRateAgreement = new FinancialAssetBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForwardRateAgreement";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.mmObject();
			codeName = FinancialAssetBalanceTypeCode.ForwardRateAgreement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code
	 * FinancialAssetBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseAgreement"</li>
	 * </ul>
	 */
	public static final FinancialAssetBalanceType1Code RepurchaseAgreement = new FinancialAssetBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseAgreement";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.mmObject();
			codeName = FinancialAssetBalanceTypeCode.RepurchaseAgreement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code
	 * FinancialAssetBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReverseRepurchaseAgreement"</li>
	 * </ul>
	 */
	public static final FinancialAssetBalanceType1Code ReverseRepurchaseAgreement = new FinancialAssetBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReverseRepurchaseAgreement";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.mmObject();
			codeName = FinancialAssetBalanceTypeCode.ReverseRepurchaseAgreement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code
	 * FinancialAssetBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TripartyRepurchaseAgreement"</li>
	 * </ul>
	 */
	public static final FinancialAssetBalanceType1Code TripartyRepurchaseAgreement = new FinancialAssetBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TripartyRepurchaseAgreement";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.mmObject();
			codeName = FinancialAssetBalanceTypeCode.TripartyRepurchaseAgreement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code
	 * FinancialAssetBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TripartyReverseRepurchaseAgreement"</li>
	 * </ul>
	 */
	public static final FinancialAssetBalanceType1Code TripartyReverseRepurchaseAgreement = new FinancialAssetBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TripartyReverseRepurchaseAgreement";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.mmObject();
			codeName = FinancialAssetBalanceTypeCode.TripartyReverseRepurchaseAgreement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code
	 * FinancialAssetBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FXForward"</li>
	 * </ul>
	 */
	public static final FinancialAssetBalanceType1Code FXForward = new FinancialAssetBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FXForward";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.mmObject();
			codeName = FinancialAssetBalanceTypeCode.FXForward.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceType1Code
	 * FinancialAssetBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FXSpot"</li>
	 * </ul>
	 */
	public static final FinancialAssetBalanceType1Code FXSpot = new FinancialAssetBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FXSpot";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.mmObject();
			codeName = FinancialAssetBalanceTypeCode.FXSpot.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, FinancialAssetBalanceType1Code> codesByName = new LinkedHashMap<>();

	protected FinancialAssetBalanceType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ACRU");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancialAssetBalanceType1Code";
				definition = "Specifies balances of assets and other balances.";
				trace_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.AccruedIncome, com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.OtherFinancialInstruments,
						com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.SettledCash, com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.FXTransaction,
						com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.Cash, com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.TreasuryInflatedProtectedSecurity,
						com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.Equity, com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.CommonStock,
						com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.PreferredStock, com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.MutualFund,
						com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.ExchangeTradedFund, com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.Rights,
						com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.Warrant, com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.Bond,
						com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.ConvertibleBond, com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.CorporateBond,
						com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.GovernmentBond, com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.Option,
						com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.Future, com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.Swap,
						com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.CurrencyExchange, com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.ForeignInvestment,
						com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.Gold, com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.Property,
						com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.BankersAcceptance, com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.SyndicatedBankLoan,
						com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.CollateralisedBondObligation, com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.CertificateOfDeposit,
						com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.CollateralisedDebtObligation, com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.CollateralisedLoanObligation,
						com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.CollateralisedMortgageObligation, com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.CommericalPaper,
						com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.CorporatePrivatePlacement, com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.DiscountNote,
						com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.FederalAgencyDiscountNote, com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.FederalHousingAuthority,
						com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.FederalHomeLoan, com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.FederalNationalMortgageAssociation,
						com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.FloatingRateNote, com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.GovernmentNationalMortgageAssociation,
						com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.TreasuriesAndAgenciesDebentures, com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.IOETTEMortgage,
						com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.MortgagePrivatePlacement, com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.MunicipalBond,
						com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.StudentLoanMarketingAssociation, com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.ShortTermInvestmentFund,
						com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.TreasuryStrips, com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.TimeDeposit,
						com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.UnitizedBondsAndWarrants, com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.UnitizedBonds,
						com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.VariableRateDiscountNote, com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.CatsTigersLions,
						com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.ForwardBonds, com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.ForwardRateAgreement,
						com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.RepurchaseAgreement, com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.ReverseRepurchaseAgreement,
						com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.TripartyRepurchaseAgreement, com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.TripartyReverseRepurchaseAgreement,
						com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.FXForward, com.tools20022.repository.codeset.FinancialAssetBalanceType1Code.FXSpot);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AccruedIncome.getCodeName().get(), AccruedIncome);
		codesByName.put(OtherFinancialInstruments.getCodeName().get(), OtherFinancialInstruments);
		codesByName.put(SettledCash.getCodeName().get(), SettledCash);
		codesByName.put(FXTransaction.getCodeName().get(), FXTransaction);
		codesByName.put(Cash.getCodeName().get(), Cash);
		codesByName.put(TreasuryInflatedProtectedSecurity.getCodeName().get(), TreasuryInflatedProtectedSecurity);
		codesByName.put(Equity.getCodeName().get(), Equity);
		codesByName.put(CommonStock.getCodeName().get(), CommonStock);
		codesByName.put(PreferredStock.getCodeName().get(), PreferredStock);
		codesByName.put(MutualFund.getCodeName().get(), MutualFund);
		codesByName.put(ExchangeTradedFund.getCodeName().get(), ExchangeTradedFund);
		codesByName.put(Rights.getCodeName().get(), Rights);
		codesByName.put(Warrant.getCodeName().get(), Warrant);
		codesByName.put(Bond.getCodeName().get(), Bond);
		codesByName.put(ConvertibleBond.getCodeName().get(), ConvertibleBond);
		codesByName.put(CorporateBond.getCodeName().get(), CorporateBond);
		codesByName.put(GovernmentBond.getCodeName().get(), GovernmentBond);
		codesByName.put(Option.getCodeName().get(), Option);
		codesByName.put(Future.getCodeName().get(), Future);
		codesByName.put(Swap.getCodeName().get(), Swap);
		codesByName.put(CurrencyExchange.getCodeName().get(), CurrencyExchange);
		codesByName.put(ForeignInvestment.getCodeName().get(), ForeignInvestment);
		codesByName.put(Gold.getCodeName().get(), Gold);
		codesByName.put(Property.getCodeName().get(), Property);
		codesByName.put(BankersAcceptance.getCodeName().get(), BankersAcceptance);
		codesByName.put(SyndicatedBankLoan.getCodeName().get(), SyndicatedBankLoan);
		codesByName.put(CollateralisedBondObligation.getCodeName().get(), CollateralisedBondObligation);
		codesByName.put(CertificateOfDeposit.getCodeName().get(), CertificateOfDeposit);
		codesByName.put(CollateralisedDebtObligation.getCodeName().get(), CollateralisedDebtObligation);
		codesByName.put(CollateralisedLoanObligation.getCodeName().get(), CollateralisedLoanObligation);
		codesByName.put(CollateralisedMortgageObligation.getCodeName().get(), CollateralisedMortgageObligation);
		codesByName.put(CommericalPaper.getCodeName().get(), CommericalPaper);
		codesByName.put(CorporatePrivatePlacement.getCodeName().get(), CorporatePrivatePlacement);
		codesByName.put(DiscountNote.getCodeName().get(), DiscountNote);
		codesByName.put(FederalAgencyDiscountNote.getCodeName().get(), FederalAgencyDiscountNote);
		codesByName.put(FederalHousingAuthority.getCodeName().get(), FederalHousingAuthority);
		codesByName.put(FederalHomeLoan.getCodeName().get(), FederalHomeLoan);
		codesByName.put(FederalNationalMortgageAssociation.getCodeName().get(), FederalNationalMortgageAssociation);
		codesByName.put(FloatingRateNote.getCodeName().get(), FloatingRateNote);
		codesByName.put(GovernmentNationalMortgageAssociation.getCodeName().get(), GovernmentNationalMortgageAssociation);
		codesByName.put(TreasuriesAndAgenciesDebentures.getCodeName().get(), TreasuriesAndAgenciesDebentures);
		codesByName.put(IOETTEMortgage.getCodeName().get(), IOETTEMortgage);
		codesByName.put(MortgagePrivatePlacement.getCodeName().get(), MortgagePrivatePlacement);
		codesByName.put(MunicipalBond.getCodeName().get(), MunicipalBond);
		codesByName.put(StudentLoanMarketingAssociation.getCodeName().get(), StudentLoanMarketingAssociation);
		codesByName.put(ShortTermInvestmentFund.getCodeName().get(), ShortTermInvestmentFund);
		codesByName.put(TreasuryStrips.getCodeName().get(), TreasuryStrips);
		codesByName.put(TimeDeposit.getCodeName().get(), TimeDeposit);
		codesByName.put(UnitizedBondsAndWarrants.getCodeName().get(), UnitizedBondsAndWarrants);
		codesByName.put(UnitizedBonds.getCodeName().get(), UnitizedBonds);
		codesByName.put(VariableRateDiscountNote.getCodeName().get(), VariableRateDiscountNote);
		codesByName.put(CatsTigersLions.getCodeName().get(), CatsTigersLions);
		codesByName.put(ForwardBonds.getCodeName().get(), ForwardBonds);
		codesByName.put(ForwardRateAgreement.getCodeName().get(), ForwardRateAgreement);
		codesByName.put(RepurchaseAgreement.getCodeName().get(), RepurchaseAgreement);
		codesByName.put(ReverseRepurchaseAgreement.getCodeName().get(), ReverseRepurchaseAgreement);
		codesByName.put(TripartyRepurchaseAgreement.getCodeName().get(), TripartyRepurchaseAgreement);
		codesByName.put(TripartyReverseRepurchaseAgreement.getCodeName().get(), TripartyReverseRepurchaseAgreement);
		codesByName.put(FXForward.getCodeName().get(), FXForward);
		codesByName.put(FXSpot.getCodeName().get(), FXSpot);
	}

	public static FinancialAssetBalanceType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static FinancialAssetBalanceType1Code[] values() {
		FinancialAssetBalanceType1Code[] values = new FinancialAssetBalanceType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, FinancialAssetBalanceType1Code> {
		@Override
		public FinancialAssetBalanceType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(FinancialAssetBalanceType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}