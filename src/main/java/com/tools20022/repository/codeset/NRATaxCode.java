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
import com.tools20022.repository.codeset.NRATaxCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Non resident alien U.S. tax codes.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATaxCode#DomesticIncomeDividend
 * NRATaxCode.DomesticIncomeDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATaxCode#ForeignIncomeDividends
 * NRATaxCode.ForeignIncomeDividends}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATaxCode#DividendsDomesticNonTaxable
 * NRATaxCode.DividendsDomesticNonTaxable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATaxCode#DividendsFullyExempt
 * NRATaxCode.DividendsFullyExempt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATaxCode#DividendsFederalTaxableStateExempt
 * NRATaxCode.DividendsFederalTaxableStateExempt}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.NRATaxCode#ReturnOfCapital
 * NRATaxCode.ReturnOfCapital}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATaxCode#LongTermCapitalGains
 * NRATaxCode.LongTermCapitalGains}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATaxCode#ShortTermCapitalGains
 * NRATaxCode.ShortTermCapitalGains}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.NRATaxCode#FIRPTAEligible
 * NRATaxCode.FIRPTAEligible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATaxCode#REITCapitalGainDistributions
 * NRATaxCode.REITCapitalGainDistributions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATaxCode#LimitedPubliclyTradedPartnership
 * NRATaxCode.LimitedPubliclyTradedPartnership}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATaxCode#SubstituteDividendPayment
 * NRATaxCode.SubstituteDividendPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATaxCode#CapitalGainDistributionShortTermRICs
 * NRATaxCode.CapitalGainDistributionShortTermRICs}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATaxCode#CorporateActionDividendCapitalGains
 * NRATaxCode.CorporateActionDividendCapitalGains}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATaxCode#USSourceOrdinaryInterest
 * NRATaxCode.USSourceOrdinaryInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATaxCode#ForeignBondInterest
 * NRATaxCode.ForeignBondInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATaxCode#AllStateAndTerritorialMunicipalInterest
 * NRATaxCode.AllStateAndTerritorialMunicipalInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATaxCode#AllMunicipalBondsSubjectToFederalTax
 * NRATaxCode.AllMunicipalBondsSubjectToFederalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATaxCode#USGovernmentInterestOnContractsNotesAndMortgages
 * NRATaxCode.USGovernmentInterestOnContractsNotesAndMortgages}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATaxCode#USGovernmentInterestOnGNMA1And2
 * NRATaxCode.USGovernmentInterestOnGNMA1And2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATaxCode#InterestOnCollatralizedMortgageObligations
 * NRATaxCode.InterestOnCollatralizedMortgageObligations}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATaxCode#InterestOnCertificatesOfDeposit
 * NRATaxCode.InterestOnCertificatesOfDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATaxCode#USGovernmentInterest
 * NRATaxCode.USGovernmentInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATaxCode#USGovernmentInterestOnNotesAndBills
 * NRATaxCode.USGovernmentInterestOnNotesAndBills}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATaxCode#PrincipalPaydowns
 * NRATaxCode.PrincipalPaydowns}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATaxCode#ShortTermInterest
 * NRATaxCode.ShortTermInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATaxCode#USGovernmentInterestLongerThan183Days
 * NRATaxCode.USGovernmentInterestLongerThan183Days}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATaxCode#InterestSubstitutePayment
 * NRATaxCode.InterestSubstitutePayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATaxCode#OtherSusbtitutePayment
 * NRATaxCode.OtherSusbtitutePayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATaxCode#NRAWithholdingTax
 * NRATaxCode.NRAWithholdingTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATaxCode#FederalBackUpDividends
 * NRATaxCode.FederalBackUpDividends}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATaxCode#FederalBackUpInterest
 * NRATaxCode.FederalBackUpInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATaxCode#ForeignTaxWithheldAtSourceDividends
 * NRATaxCode.ForeignTaxWithheldAtSourceDividends}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATaxCode#ForeignTaxWithheldAtSourceInterest
 * NRATaxCode.ForeignTaxWithheldAtSourceInterest}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.NRATaxCode#CustodyIssues
 * NRATaxCode.CustodyIssues}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATaxCode#InterestOnBalances
 * NRATaxCode.InterestOnBalances}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATaxCode#InterestOnSeriesEOrHBonds
 * NRATaxCode.InterestOnSeriesEOrHBonds}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.NRATaxCode#RoyaltyPayments
 * NRATaxCode.RoyaltyPayments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATaxCode#OtherTaxableIncome
 * NRATaxCode.OtherTaxableIncome}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATaxCode#OtherNonTaxableIncome
 * NRATaxCode.OtherNonTaxableIncome}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATaxCode#MiscellaneousPayments
 * NRATaxCode.MiscellaneousPayments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATaxCode#CashInLieuOfFractionalShares
 * NRATaxCode.CashInLieuOfFractionalShares}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.NRATaxCode#StockSplit
 * NRATaxCode.StockSplit}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.NRATaxCode#StockDividend
 * NRATaxCode.StockDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATaxCode#CashOnIncreasedShares
 * NRATaxCode.CashOnIncreasedShares}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.NRATaxCode#SpinOff
 * NRATaxCode.SpinOff}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.NRATax1Code NRATax1Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.NRATax2Code NRATax2Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "NRATaxCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Non resident alien U.S. tax codes."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"T011"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class NRATaxCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Tax category for domestic source income dividends.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATaxCode NRATaxCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "T011"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DomesticIncomeDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax category for domestic source income dividends."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATaxCode DomesticIncomeDividend = new NRATaxCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DomesticIncomeDividend";
			definition = "Tax category for domestic source income dividends.";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATaxCode.mmObject();
			codeName = "T011";
		}
	};
	/**
	 * Tax category for foreign source income dividends.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATaxCode NRATaxCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "T012"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignIncomeDividends"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax category for foreign source income dividends."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATaxCode ForeignIncomeDividends = new NRATaxCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignIncomeDividends";
			definition = "Tax category for foreign source income dividends.";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATaxCode.mmObject();
			codeName = "T012";
		}
	};
	/**
	 * Tax category for non taxable domestic dividends.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATaxCode NRATaxCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "T013"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendsDomesticNonTaxable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax category for non taxable domestic dividends."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATaxCode DividendsDomesticNonTaxable = new NRATaxCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendsDomesticNonTaxable";
			definition = "Tax category for non taxable domestic dividends.";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATaxCode.mmObject();
			codeName = "T013";
		}
	};
	/**
	 * Tax category for fully exempt dividends on municipal type mutual funds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATaxCode NRATaxCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "T014"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendsFullyExempt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Tax category for fully exempt dividends on municipal type mutual funds."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATaxCode DividendsFullyExempt = new NRATaxCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendsFullyExempt";
			definition = "Tax category for fully exempt dividends on municipal type mutual funds.";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATaxCode.mmObject();
			codeName = "T014";
		}
	};
	/**
	 * Tax category for federal taxable state exempt dividends.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATaxCode NRATaxCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "T015"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendsFederalTaxableStateExempt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax category for federal taxable state exempt dividends."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATaxCode DividendsFederalTaxableStateExempt = new NRATaxCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendsFederalTaxableStateExempt";
			definition = "Tax category for federal taxable state exempt dividends.";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATaxCode.mmObject();
			codeName = "T015";
		}
	};
	/**
	 * Tax category for Return Of Capital proceeds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATaxCode NRATaxCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "T019"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnOfCapital"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax category for Return Of Capital proceeds."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATaxCode ReturnOfCapital = new NRATaxCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnOfCapital";
			definition = "Tax category for Return Of Capital proceeds.";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATaxCode.mmObject();
			codeName = "T019";
		}
	};
	/**
	 * Tax category for Long Term Capital Gains proceeds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATaxCode NRATaxCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "T021"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LongTermCapitalGains"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax category for Long Term Capital Gains proceeds."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATaxCode LongTermCapitalGains = new NRATaxCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LongTermCapitalGains";
			definition = "Tax category for Long Term Capital Gains proceeds.";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATaxCode.mmObject();
			codeName = "T021";
		}
	};
	/**
	 * Tax category for Short Term Capital Gains proceeds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATaxCode NRATaxCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "T022"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortTermCapitalGains"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax category for Short Term Capital Gains proceeds."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATaxCode ShortTermCapitalGains = new NRATaxCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortTermCapitalGains";
			definition = "Tax category for Short Term Capital Gains proceeds.";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATaxCode.mmObject();
			codeName = "T022";
		}
	};
	/**
	 * Tax category for FIRPTA eligible (REITS).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATaxCode NRATaxCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "T023"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FIRPTAEligible"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax category for FIRPTA eligible (REITS)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATaxCode FIRPTAEligible = new NRATaxCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FIRPTAEligible";
			definition = "Tax category for FIRPTA eligible (REITS).";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATaxCode.mmObject();
			codeName = "T023";
		}
	};
	/**
	 * Tax category for REIT (Capital Gain Distributions).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATaxCode NRATaxCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "T025"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "REITCapitalGainDistributions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax category for REIT (Capital Gain Distributions)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATaxCode REITCapitalGainDistributions = new NRATaxCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "REITCapitalGainDistributions";
			definition = "Tax category for REIT (Capital Gain Distributions).";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATaxCode.mmObject();
			codeName = "T025";
		}
	};
	/**
	 * Tax category for limited publicly traded partnership.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATaxCode NRATaxCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "T026"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitedPubliclyTradedPartnership"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax category for limited publicly traded partnership."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATaxCode LimitedPubliclyTradedPartnership = new NRATaxCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitedPubliclyTradedPartnership";
			definition = "Tax category for limited publicly traded partnership.";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATaxCode.mmObject();
			codeName = "T026";
		}
	};
	/**
	 * Tax category for substitute dividend payments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATaxCode NRATaxCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "T027"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubstituteDividendPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax category for substitute dividend payments."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATaxCode SubstituteDividendPayment = new NRATaxCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubstituteDividendPayment";
			definition = "Tax category for substitute dividend payments.";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATaxCode.mmObject();
			codeName = "T027";
		}
	};
	/**
	 * Tax category for short term capital gain distributions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATaxCode NRATaxCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "T029"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapitalGainDistributionShortTermRICs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax category for short term capital gain distributions."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATaxCode CapitalGainDistributionShortTermRICs = new NRATaxCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CapitalGainDistributionShortTermRICs";
			definition = "Tax category for short term capital gain distributions.";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATaxCode.mmObject();
			codeName = "T029";
		}
	};
	/**
	 * Tax category for dividend or capital gains distribution due to a
	 * corporate action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATaxCode NRATaxCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "T302"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionDividendCapitalGains"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Tax category for dividend or capital gains distribution due to a corporate action."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATaxCode CorporateActionDividendCapitalGains = new NRATaxCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionDividendCapitalGains";
			definition = "Tax category for dividend or capital gains distribution due to a corporate action.";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATaxCode.mmObject();
			codeName = "T302";
		}
	};
	/**
	 * Tax category for U.S. source ordinary interest proceeds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATaxCode NRATaxCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "T041"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USSourceOrdinaryInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax category for U.S. source ordinary interest proceeds."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATaxCode USSourceOrdinaryInterest = new NRATaxCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USSourceOrdinaryInterest";
			definition = "Tax category for U.S. source ordinary interest proceeds.";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATaxCode.mmObject();
			codeName = "T041";
		}
	};
	/**
	 * Tax category for foreign bond interest proceeds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATaxCode NRATaxCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "T042"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignBondInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax category for foreign bond interest proceeds."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATaxCode ForeignBondInterest = new NRATaxCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignBondInterest";
			definition = "Tax category for foreign bond interest proceeds.";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATaxCode.mmObject();
			codeName = "T042";
		}
	};
	/**
	 * Tax category for all state and territorial municipal interest proceeds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATaxCode NRATaxCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "T043"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllStateAndTerritorialMunicipalInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Tax category for all state and territorial municipal interest proceeds."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATaxCode AllStateAndTerritorialMunicipalInterest = new NRATaxCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllStateAndTerritorialMunicipalInterest";
			definition = "Tax category for all state and territorial municipal interest proceeds.";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATaxCode.mmObject();
			codeName = "T043";
		}
	};
	/**
	 * Tax category for all municipal bonds that are subject to federal tax
	 * proceeds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATaxCode NRATaxCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "T044"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllMunicipalBondsSubjectToFederalTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Tax category for all municipal bonds that are subject to federal tax proceeds."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATaxCode AllMunicipalBondsSubjectToFederalTax = new NRATaxCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllMunicipalBondsSubjectToFederalTax";
			definition = "Tax category for all municipal bonds that are subject to federal tax proceeds.";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATaxCode.mmObject();
			codeName = "T044";
		}
	};
	/**
	 * Tax category for U.S. government interest on contracts Notes &amp;
	 * mortgages proceeds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATaxCode NRATaxCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "T045"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USGovernmentInterestOnContractsNotesAndMortgages"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Tax category for U.S. government interest on contracts Notes &amp; mortgages proceeds."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATaxCode USGovernmentInterestOnContractsNotesAndMortgages = new NRATaxCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USGovernmentInterestOnContractsNotesAndMortgages";
			definition = "Tax category for U.S. government interest on contracts Notes & mortgages proceeds.";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATaxCode.mmObject();
			codeName = "T045";
		}
	};
	/**
	 * Tax category for U.S. government interest on GNMA 1 &amp; 2 proceeds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATaxCode NRATaxCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "T046"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USGovernmentInterestOnGNMA1And2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Tax category for U.S. government interest on GNMA 1 &amp; 2 proceeds."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATaxCode USGovernmentInterestOnGNMA1And2 = new NRATaxCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USGovernmentInterestOnGNMA1And2";
			definition = "Tax category for U.S. government interest on GNMA 1 & 2 proceeds.";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATaxCode.mmObject();
			codeName = "T046";
		}
	};
	/**
	 * Tax category for interest on collateralized mortgage obligations
	 * proceeds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATaxCode NRATaxCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "T047"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestOnCollatralizedMortgageObligations"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Tax category for interest on collateralized mortgage obligations proceeds."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATaxCode InterestOnCollatralizedMortgageObligations = new NRATaxCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestOnCollatralizedMortgageObligations";
			definition = "Tax category for interest on collateralized mortgage obligations proceeds.";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATaxCode.mmObject();
			codeName = "T047";
		}
	};
	/**
	 * Tax category for interests on certificates of deposits proceeds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATaxCode NRATaxCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "T048"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestOnCertificatesOfDeposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Tax category for interests on certificates of deposits proceeds."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATaxCode InterestOnCertificatesOfDeposit = new NRATaxCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestOnCertificatesOfDeposit";
			definition = "Tax category for interests on certificates of deposits proceeds.";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATaxCode.mmObject();
			codeName = "T048";
		}
	};
	/**
	 * Tax category for U.S. government interest proceeds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATaxCode NRATaxCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "T049"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USGovernmentInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax category for U.S. government interest proceeds."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATaxCode USGovernmentInterest = new NRATaxCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USGovernmentInterest";
			definition = "Tax category for U.S. government interest proceeds.";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATaxCode.mmObject();
			codeName = "T049";
		}
	};
	/**
	 * Tax Category for US government interest on Notes and Bills.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATaxCode NRATaxCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "T050"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USGovernmentInterestOnNotesAndBills"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Tax Category for US government interest on Notes and Bills."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATaxCode USGovernmentInterestOnNotesAndBills = new NRATaxCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USGovernmentInterestOnNotesAndBills";
			definition = "Tax Category for US government interest on Notes and Bills.";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATaxCode.mmObject();
			codeName = "T050";
		}
	};
	/**
	 * Tax category for principal pay downs proceeds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATaxCode NRATaxCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "T051"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrincipalPaydowns"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax category for principal pay downs proceeds."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATaxCode PrincipalPaydowns = new NRATaxCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrincipalPaydowns";
			definition = "Tax category for principal pay downs proceeds.";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATaxCode.mmObject();
			codeName = "T051";
		}
	};
	/**
	 * Tax category for Short Term Interest (less than 183 days) proceeds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATaxCode NRATaxCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "T052"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortTermInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Tax category for Short Term Interest (less than 183 days) proceeds."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATaxCode ShortTermInterest = new NRATaxCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortTermInterest";
			definition = "Tax category for Short Term Interest (less than 183 days) proceeds.";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATaxCode.mmObject();
			codeName = "T052";
		}
	};
	/**
	 * Tax category for U.S. Government Interest (longer that 183 days)
	 * proceeds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATaxCode NRATaxCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "T053"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USGovernmentInterestLongerThan183Days"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Tax category for U.S. Government Interest (longer that 183 days) proceeds."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATaxCode USGovernmentInterestLongerThan183Days = new NRATaxCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USGovernmentInterestLongerThan183Days";
			definition = "Tax category for U.S. Government Interest (longer that 183 days) proceeds.";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATaxCode.mmObject();
			codeName = "T053";
		}
	};
	/**
	 * Tax category for interest substitute payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATaxCode NRATaxCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "T054"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestSubstitutePayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax category for interest substitute payment."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATaxCode InterestSubstitutePayment = new NRATaxCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestSubstitutePayment";
			definition = "Tax category for interest substitute payment.";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATaxCode.mmObject();
			codeName = "T054";
		}
	};
	/**
	 * Tax category for other substitute payment that cannot be categorised.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATaxCode NRATaxCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "T055"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherSusbtitutePayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Tax category for other substitute payment that cannot be categorised."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATaxCode OtherSusbtitutePayment = new NRATaxCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherSusbtitutePayment";
			definition = "Tax category for other substitute payment that cannot be categorised.";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATaxCode.mmObject();
			codeName = "T055";
		}
	};
	/**
	 * Tax category for NRA withholding tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATaxCode NRATaxCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "T061"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NRAWithholdingTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax category for NRA withholding tax."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATaxCode NRAWithholdingTax = new NRATaxCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NRAWithholdingTax";
			definition = "Tax category for NRA withholding tax.";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATaxCode.mmObject();
			codeName = "T061";
		}
	};
	/**
	 * Tax category for federal backup dividends proceeds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATaxCode NRATaxCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "T062"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FederalBackUpDividends"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax category for federal backup dividends proceeds."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATaxCode FederalBackUpDividends = new NRATaxCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FederalBackUpDividends";
			definition = "Tax category for federal backup dividends proceeds.";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATaxCode.mmObject();
			codeName = "T062";
		}
	};
	/**
	 * Tax category for federal backup interest proceeds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATaxCode NRATaxCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "T063"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FederalBackUpInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax category for federal backup interest proceeds."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATaxCode FederalBackUpInterest = new NRATaxCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FederalBackUpInterest";
			definition = "Tax category for federal backup interest proceeds.";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATaxCode.mmObject();
			codeName = "T063";
		}
	};
	/**
	 * Tax category for foreign tax withheld at source dividends proceeds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATaxCode NRATaxCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "T064"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignTaxWithheldAtSourceDividends"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Tax category for foreign tax withheld at source dividends proceeds."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATaxCode ForeignTaxWithheldAtSourceDividends = new NRATaxCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignTaxWithheldAtSourceDividends";
			definition = "Tax category for foreign tax withheld at source dividends proceeds.";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATaxCode.mmObject();
			codeName = "T064";
		}
	};
	/**
	 * Tax category for foreign tax withheld at source interest proceeds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATaxCode NRATaxCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "T065"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignTaxWithheldAtSourceInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Tax category for foreign tax withheld at source interest proceeds."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATaxCode ForeignTaxWithheldAtSourceInterest = new NRATaxCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignTaxWithheldAtSourceInterest";
			definition = "Tax category for foreign tax withheld at source interest proceeds.";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATaxCode.mmObject();
			codeName = "T065";
		}
	};
	/**
	 * Tax category for custody issues.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATaxCode NRATaxCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "T070"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustodyIssues"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax category for custody issues."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATaxCode CustodyIssues = new NRATaxCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustodyIssues";
			definition = "Tax category for custody issues.";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATaxCode.mmObject();
			codeName = "T070";
		}
	};
	/**
	 * Tax category for interest on balances proceeds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATaxCode NRATaxCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "T071"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestOnBalances"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax category for interest on balances proceeds."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATaxCode InterestOnBalances = new NRATaxCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestOnBalances";
			definition = "Tax category for interest on balances proceeds.";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATaxCode.mmObject();
			codeName = "T071";
		}
	};
	/**
	 * Tax category for interest on series E or H bonds proceeds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATaxCode NRATaxCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "T072"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestOnSeriesEOrHBonds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Tax category for interest on series E or H bonds proceeds."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATaxCode InterestOnSeriesEOrHBonds = new NRATaxCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestOnSeriesEOrHBonds";
			definition = "Tax category for interest on series E or H bonds proceeds.";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATaxCode.mmObject();
			codeName = "T072";
		}
	};
	/**
	 * Tax category for royalty payments proceeds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATaxCode NRATaxCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "T073"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoyaltyPayments"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax category for royalty payments proceeds."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATaxCode RoyaltyPayments = new NRATaxCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoyaltyPayments";
			definition = "Tax category for royalty payments proceeds.";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATaxCode.mmObject();
			codeName = "T073";
		}
	};
	/**
	 * Tax category for other taxable income proceeds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATaxCode NRATaxCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "T074"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherTaxableIncome"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax category for other taxable income proceeds."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATaxCode OtherTaxableIncome = new NRATaxCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherTaxableIncome";
			definition = "Tax category for other taxable income proceeds.";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATaxCode.mmObject();
			codeName = "T074";
		}
	};
	/**
	 * Tax category for other non-taxable income proceeds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATaxCode NRATaxCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "T075"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherNonTaxableIncome"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax category for other non-taxable income proceeds."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATaxCode OtherNonTaxableIncome = new NRATaxCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherNonTaxableIncome";
			definition = "Tax category for other non-taxable income proceeds.";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATaxCode.mmObject();
			codeName = "T075";
		}
	};
	/**
	 * Tax category for miscellaneous payments proceeds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATaxCode NRATaxCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "T076"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MiscellaneousPayments"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax category for miscellaneous payments proceeds."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATaxCode MiscellaneousPayments = new NRATaxCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MiscellaneousPayments";
			definition = "Tax category for miscellaneous payments proceeds.";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATaxCode.mmObject();
			codeName = "T076";
		}
	};
	/**
	 * Tax category for Cash-in-Lieu of fractional shares proceeds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATaxCode NRATaxCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "T024"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashInLieuOfFractionalShares"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Tax category for Cash-in-Lieu of fractional shares proceeds."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATaxCode CashInLieuOfFractionalShares = new NRATaxCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashInLieuOfFractionalShares";
			definition = "Tax category for Cash-in-Lieu of fractional shares proceeds.";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATaxCode.mmObject();
			codeName = "T024";
		}
	};
	/**
	 * Tax category for stock split proceeds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATaxCode NRATaxCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "T077"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockSplit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax category for stock split proceeds."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATaxCode StockSplit = new NRATaxCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockSplit";
			definition = "Tax category for stock split proceeds.";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATaxCode.mmObject();
			codeName = "T077";
		}
	};
	/**
	 * Tax category for stock dividend proceeds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATaxCode NRATaxCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "T078"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax category for stock dividend proceeds."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATaxCode StockDividend = new NRATaxCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockDividend";
			definition = "Tax category for stock dividend proceeds.";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATaxCode.mmObject();
			codeName = "T078";
		}
	};
	/**
	 * Tax category for cash on increased shares proceeds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATaxCode NRATaxCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "T079"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashOnIncreasedShares"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax category for cash on increased shares proceeds."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATaxCode CashOnIncreasedShares = new NRATaxCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashOnIncreasedShares";
			definition = "Tax category for cash on increased shares proceeds.";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATaxCode.mmObject();
			codeName = "T079";
		}
	};
	/**
	 * Tax category for spin off proceeds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATaxCode NRATaxCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "T080"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpinOff"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax category for spin off proceeds."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATaxCode SpinOff = new NRATaxCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpinOff";
			definition = "Tax category for spin off proceeds.";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATaxCode.mmObject();
			codeName = "T080";
		}
	};
	final static private LinkedHashMap<String, NRATaxCode> codesByName = new LinkedHashMap<>();

	protected NRATaxCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("T011");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NRATaxCode";
				definition = "Non resident alien U.S. tax codes.";
				derivation_lazy = () -> Arrays.asList(NRATax1Code.mmObject(), NRATax2Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.NRATaxCode.DomesticIncomeDividend, com.tools20022.repository.codeset.NRATaxCode.ForeignIncomeDividends,
						com.tools20022.repository.codeset.NRATaxCode.DividendsDomesticNonTaxable, com.tools20022.repository.codeset.NRATaxCode.DividendsFullyExempt,
						com.tools20022.repository.codeset.NRATaxCode.DividendsFederalTaxableStateExempt, com.tools20022.repository.codeset.NRATaxCode.ReturnOfCapital, com.tools20022.repository.codeset.NRATaxCode.LongTermCapitalGains,
						com.tools20022.repository.codeset.NRATaxCode.ShortTermCapitalGains, com.tools20022.repository.codeset.NRATaxCode.FIRPTAEligible, com.tools20022.repository.codeset.NRATaxCode.REITCapitalGainDistributions,
						com.tools20022.repository.codeset.NRATaxCode.LimitedPubliclyTradedPartnership, com.tools20022.repository.codeset.NRATaxCode.SubstituteDividendPayment,
						com.tools20022.repository.codeset.NRATaxCode.CapitalGainDistributionShortTermRICs, com.tools20022.repository.codeset.NRATaxCode.CorporateActionDividendCapitalGains,
						com.tools20022.repository.codeset.NRATaxCode.USSourceOrdinaryInterest, com.tools20022.repository.codeset.NRATaxCode.ForeignBondInterest,
						com.tools20022.repository.codeset.NRATaxCode.AllStateAndTerritorialMunicipalInterest, com.tools20022.repository.codeset.NRATaxCode.AllMunicipalBondsSubjectToFederalTax,
						com.tools20022.repository.codeset.NRATaxCode.USGovernmentInterestOnContractsNotesAndMortgages, com.tools20022.repository.codeset.NRATaxCode.USGovernmentInterestOnGNMA1And2,
						com.tools20022.repository.codeset.NRATaxCode.InterestOnCollatralizedMortgageObligations, com.tools20022.repository.codeset.NRATaxCode.InterestOnCertificatesOfDeposit,
						com.tools20022.repository.codeset.NRATaxCode.USGovernmentInterest, com.tools20022.repository.codeset.NRATaxCode.USGovernmentInterestOnNotesAndBills, com.tools20022.repository.codeset.NRATaxCode.PrincipalPaydowns,
						com.tools20022.repository.codeset.NRATaxCode.ShortTermInterest, com.tools20022.repository.codeset.NRATaxCode.USGovernmentInterestLongerThan183Days,
						com.tools20022.repository.codeset.NRATaxCode.InterestSubstitutePayment, com.tools20022.repository.codeset.NRATaxCode.OtherSusbtitutePayment, com.tools20022.repository.codeset.NRATaxCode.NRAWithholdingTax,
						com.tools20022.repository.codeset.NRATaxCode.FederalBackUpDividends, com.tools20022.repository.codeset.NRATaxCode.FederalBackUpInterest,
						com.tools20022.repository.codeset.NRATaxCode.ForeignTaxWithheldAtSourceDividends, com.tools20022.repository.codeset.NRATaxCode.ForeignTaxWithheldAtSourceInterest,
						com.tools20022.repository.codeset.NRATaxCode.CustodyIssues, com.tools20022.repository.codeset.NRATaxCode.InterestOnBalances, com.tools20022.repository.codeset.NRATaxCode.InterestOnSeriesEOrHBonds,
						com.tools20022.repository.codeset.NRATaxCode.RoyaltyPayments, com.tools20022.repository.codeset.NRATaxCode.OtherTaxableIncome, com.tools20022.repository.codeset.NRATaxCode.OtherNonTaxableIncome,
						com.tools20022.repository.codeset.NRATaxCode.MiscellaneousPayments, com.tools20022.repository.codeset.NRATaxCode.CashInLieuOfFractionalShares, com.tools20022.repository.codeset.NRATaxCode.StockSplit,
						com.tools20022.repository.codeset.NRATaxCode.StockDividend, com.tools20022.repository.codeset.NRATaxCode.CashOnIncreasedShares, com.tools20022.repository.codeset.NRATaxCode.SpinOff);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(DomesticIncomeDividend.getCodeName().get(), DomesticIncomeDividend);
		codesByName.put(ForeignIncomeDividends.getCodeName().get(), ForeignIncomeDividends);
		codesByName.put(DividendsDomesticNonTaxable.getCodeName().get(), DividendsDomesticNonTaxable);
		codesByName.put(DividendsFullyExempt.getCodeName().get(), DividendsFullyExempt);
		codesByName.put(DividendsFederalTaxableStateExempt.getCodeName().get(), DividendsFederalTaxableStateExempt);
		codesByName.put(ReturnOfCapital.getCodeName().get(), ReturnOfCapital);
		codesByName.put(LongTermCapitalGains.getCodeName().get(), LongTermCapitalGains);
		codesByName.put(ShortTermCapitalGains.getCodeName().get(), ShortTermCapitalGains);
		codesByName.put(FIRPTAEligible.getCodeName().get(), FIRPTAEligible);
		codesByName.put(REITCapitalGainDistributions.getCodeName().get(), REITCapitalGainDistributions);
		codesByName.put(LimitedPubliclyTradedPartnership.getCodeName().get(), LimitedPubliclyTradedPartnership);
		codesByName.put(SubstituteDividendPayment.getCodeName().get(), SubstituteDividendPayment);
		codesByName.put(CapitalGainDistributionShortTermRICs.getCodeName().get(), CapitalGainDistributionShortTermRICs);
		codesByName.put(CorporateActionDividendCapitalGains.getCodeName().get(), CorporateActionDividendCapitalGains);
		codesByName.put(USSourceOrdinaryInterest.getCodeName().get(), USSourceOrdinaryInterest);
		codesByName.put(ForeignBondInterest.getCodeName().get(), ForeignBondInterest);
		codesByName.put(AllStateAndTerritorialMunicipalInterest.getCodeName().get(), AllStateAndTerritorialMunicipalInterest);
		codesByName.put(AllMunicipalBondsSubjectToFederalTax.getCodeName().get(), AllMunicipalBondsSubjectToFederalTax);
		codesByName.put(USGovernmentInterestOnContractsNotesAndMortgages.getCodeName().get(), USGovernmentInterestOnContractsNotesAndMortgages);
		codesByName.put(USGovernmentInterestOnGNMA1And2.getCodeName().get(), USGovernmentInterestOnGNMA1And2);
		codesByName.put(InterestOnCollatralizedMortgageObligations.getCodeName().get(), InterestOnCollatralizedMortgageObligations);
		codesByName.put(InterestOnCertificatesOfDeposit.getCodeName().get(), InterestOnCertificatesOfDeposit);
		codesByName.put(USGovernmentInterest.getCodeName().get(), USGovernmentInterest);
		codesByName.put(USGovernmentInterestOnNotesAndBills.getCodeName().get(), USGovernmentInterestOnNotesAndBills);
		codesByName.put(PrincipalPaydowns.getCodeName().get(), PrincipalPaydowns);
		codesByName.put(ShortTermInterest.getCodeName().get(), ShortTermInterest);
		codesByName.put(USGovernmentInterestLongerThan183Days.getCodeName().get(), USGovernmentInterestLongerThan183Days);
		codesByName.put(InterestSubstitutePayment.getCodeName().get(), InterestSubstitutePayment);
		codesByName.put(OtherSusbtitutePayment.getCodeName().get(), OtherSusbtitutePayment);
		codesByName.put(NRAWithholdingTax.getCodeName().get(), NRAWithholdingTax);
		codesByName.put(FederalBackUpDividends.getCodeName().get(), FederalBackUpDividends);
		codesByName.put(FederalBackUpInterest.getCodeName().get(), FederalBackUpInterest);
		codesByName.put(ForeignTaxWithheldAtSourceDividends.getCodeName().get(), ForeignTaxWithheldAtSourceDividends);
		codesByName.put(ForeignTaxWithheldAtSourceInterest.getCodeName().get(), ForeignTaxWithheldAtSourceInterest);
		codesByName.put(CustodyIssues.getCodeName().get(), CustodyIssues);
		codesByName.put(InterestOnBalances.getCodeName().get(), InterestOnBalances);
		codesByName.put(InterestOnSeriesEOrHBonds.getCodeName().get(), InterestOnSeriesEOrHBonds);
		codesByName.put(RoyaltyPayments.getCodeName().get(), RoyaltyPayments);
		codesByName.put(OtherTaxableIncome.getCodeName().get(), OtherTaxableIncome);
		codesByName.put(OtherNonTaxableIncome.getCodeName().get(), OtherNonTaxableIncome);
		codesByName.put(MiscellaneousPayments.getCodeName().get(), MiscellaneousPayments);
		codesByName.put(CashInLieuOfFractionalShares.getCodeName().get(), CashInLieuOfFractionalShares);
		codesByName.put(StockSplit.getCodeName().get(), StockSplit);
		codesByName.put(StockDividend.getCodeName().get(), StockDividend);
		codesByName.put(CashOnIncreasedShares.getCodeName().get(), CashOnIncreasedShares);
		codesByName.put(SpinOff.getCodeName().get(), SpinOff);
	}

	public static NRATaxCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static NRATaxCode[] values() {
		NRATaxCode[] values = new NRATaxCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, NRATaxCode> {
		@Override
		public NRATaxCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(NRATaxCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}